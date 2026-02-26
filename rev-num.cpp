#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int revNum=0;
    while(n>0){
        int id=n%10;
        revNum=(revNum*10)+id;
        n=n/10;
    }
    cout<<revNum;
    return 0;
}