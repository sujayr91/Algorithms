class Solution {
public:
    int checktrailingstars(string p, int patindex){
        for(int i=patindex;i<p.length();i++){
            if(p[i]!='*'){
                return false;
            }
        }
        return true;
    }
    bool wildcharMatch(string &s, string &p, int strindex, int patindex,int8_t**memo){
            if(strindex==s.length() && patindex==p.length()){
                return true;
            }else{
                if(strindex==s.length()){
                    return checktrailingstars(p,patindex);
                }
                if(patindex==p.length()){
                    return false;
                }
            }
            if(memo[strindex][patindex]!=-1){
                return (memo[strindex][patindex]==1);
            }
            bool match = false;
            if(p[patindex]==s[strindex] || p[patindex]=='?'){
                match=wildcharMatch(s,p,strindex+1,patindex+1,memo);
            }else if(p[patindex]=='*'){
                    while(p[patindex]=='*'){
                        patindex++;
                        if(patindex==p.length()){
                            memo[strindex][patindex-1]=1;
                            return true;
                        }
                    }
                    for(int i=strindex;i<s.length();i++){
                        match|=wildcharMatch(s,p,i,patindex,memo);
                        if(match)
                            break;
                    }                    
            }else{
                match=false;
            }            
            memo[strindex][patindex]=match;
            return match;
    }
    bool isMatch(string s, string p) {
        int8_t**memo=new int8_t*[s.length()];
        for(int k=0;k<s.length();k++){
            memo[k]=new int8_t[p.length()];
        }
        for(int i=0;i<s.length();i++){
            for(int j=0;j<p.length();j++){
                memo[i][j]=-1;
            }
        }
        return(wildcharMatch(s,p,0,0,memo));
    }
};
int main(){

	string s="abefcdgiescdfimde";
	string p="ab*cd?i*de";
	Solution sol;
	cout<<"Match = " << sol.isMatch(s,p)<<endl;
}
