#include<iostream>
using namespace std;

int main(){
    string S="Dhananjay";
    int len=S.size();
    S[len-1]='D';
    cout<<S[len-1];
    return 0;
} 