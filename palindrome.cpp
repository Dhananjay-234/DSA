#include<bits/stdc++.h>
using namespace std;
int main(){
    int x;
    cin>>x;
    int dup=x;
    int revNum=0;
    while(x>0){
        int id=x%10;
        revNum=(revNum*10)+id;
        x=x/10;
    }
    if(dup==revNum){
        cout<<"the num is palindrome:"<<endl;

    }else{
        cout<<"not palindrome:"<<endl;
    }
    return 0;

}