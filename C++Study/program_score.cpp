#include <iostream>

using namespace std;

#define ARRAY_SIZE 100

int main(void)
{
    int studentID, middleScore, finalScore;
    
    int *array[ARRAY_SIZE];
    int index= 0;
    
    while(true)
    {
        array[index] = new int[3];

        cout<<"�й�, �߰�����, �⸻������ �Է�(���Ḧ ���ϸ� -1)"<<endl;
        cin >> studentID;
        if(studentID ==-1)
            break;
        cin>>middleScore>>finalScore;
        
        array[index][0] = studentID;
        array[index][1] = middleScore;
        array[index][2] = finalScore;
        
        index++;
    } 
    
    cout<<"�й� \t"<<"�߰�����\t"<<"�⸻����\t"<<"�߰�+�⸻\t"<<endl;
    for(int i = 0; i<index;i++)
    {   
        studentID = array[i][0];
        middleScore = array[i][1];
        finalScore = array[i][2];
        int sumScore = middleScore+finalScore;

        cout<<studentID<<"\t";
        cout<<middleScore<<"\t"<<"\t";
        cout<<finalScore<<"\t"<<"\t";
        cout<<sumScore<<"\t"<<"\t"<<endl;

        delete []array[index];
    }
    
    return 0;
}