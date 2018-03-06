#include<iostream>
using namespace std;

void sort(int* myarray, int start , int end){
	if(start>=end){
		return;
	}

	int middle = (start+end)/2;
	sort(myarray,start, middle);
	sort(myarray,middle+1,end);
	int mergelength = end-start+1;
	int temp[mergelength];
	int firstindex=start;
	int secondindex = middle+1;
	for(int k=0;k<mergelength;){
		if(myarray[firstindex] < myarray[secondindex]){
			temp[k]= myarray[firstindex];
			firstindex++;
		}else{
			temp[k] = myarray[secondindex];
			secondindex++;
		}
		k++;
		if(firstindex == middle+1){
			while(k<mergelength){
				temp[k] = myarray[secondindex];
				secondindex++;
				k++;
			}
			break;
		}
		if(secondindex == end+1){
			while(k<mergelength){
				temp[k] = myarray[firstindex];
				firstindex++;
				k++;
			}
			break;
		}
	}
	for(int k=0;k<mergelength;k++){
		myarray[k+start] = temp[k];
	}
}

void mergeSort(int* myarray, int length){
	sort(myarray, 0, length-1);
}

int main(){
	int* myarray = new int[20];
	for(int i=0;i<20;i++){
		myarray[i] = 100-i;
	}

	mergeSort(myarray, 20);
	for(int j=0;j<20; j++){
		std::cout << myarray[j] <<endl;
	}
}
