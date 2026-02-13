#include<iostream>
using namespace std;
 
int main(){
    int marks;
    cout<<"enter your marks:";
    cin>>marks;

    if(marks<25){
        cout<<"your grade is F"<<endl;
    }
    else if (marks<=44)
    {
        cout<<"your grade is E";
    }
    else if(marks<=49){
        cout<<"D";
    }
    else if(marks<=59){
        cout<<"C";
    }
    else if(marks<=79){
        cout<<"B";
    }
    else if(marks<=100){
        cout<<"A";
    }
    
}