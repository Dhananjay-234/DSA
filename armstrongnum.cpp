#include<bits/stdc++.h>
using namespace std;
int main(){
    int num;
    int sum=0;
    cin>>num;
    int dup=num;
    int length=log10(dup)+1;
    while (num>0)
    {   
        int ld=num%10;
        sum=pow(ld,length)+sum;
        num=num/10;
    }
    if(dup==sum){
        cout<<"it is armstrong num."<<endl;

    }else{
        cout<<"not an armstrong."<<endl;

    }

    return 0;
}