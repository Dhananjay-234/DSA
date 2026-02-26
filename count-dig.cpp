#include<bits/stdc++.h>
using namespace std;
int main(){
    int x,cnt=0;
    cin>>x;
    
    while(x>0){
        cnt++;
        x=x/10;
    }
    cout<<cnt;
    return 0;
}