//���ù���
//��ȣ
#include <iostream>
#include <string>

#define ARRAY_SIZE 100
using namespace std;

class ArrayStack
{
public:
    ArrayStack();
    ~ArrayStack();

    void Push(char item);    //item���� ���ÿ� ����
    void Is_VPS();
    

private:
    int top;
    char Stack[ARRAY_SIZE];

    int left_parenthesis;   //'('�� ����
    bool IsVPS;         //VPS��� True
};

int main(void)
{
    int repeat;
    cin>>repeat;

    while(repeat--)
    {
        ArrayStack PS;
        string input;
        cin>>input;

        for(int i = 0; i<input.size();i++)
            PS.Push(input[i]);
        PS.Is_VPS();
    }
    return 0;
}

ArrayStack::ArrayStack():top(-1),left_parenthesis(0),IsVPS(true) {}

ArrayStack::~ArrayStack(){}

void ArrayStack::Push(char item)
{
    top++; 
    Stack[top] = item;
    if(item == '(')
    {
        left_parenthesis++;
    }   
    else if(left_parenthesis > 0)
        left_parenthesis--;
    else
        IsVPS = false;  // ���� '('���� ')' �� ���ٸ� IsVPS�� false��.
    
}

void ArrayStack::Is_VPS()
{   
    if(left_parenthesis != 0)
        IsVPS = false;
    
    if(IsVPS == false) // ���� '('�� ')'�� ������ ���� �ʴٸ� IsVPS�� false��.
        cout<<"NO"<<endl;
    else   
        cout<<"YES"<<endl;

}