#include <iostream>
using namespace std;

void ChatBot(int);

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int N;
    cin>>N;
    cout<<"��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n";
    
    ChatBot(N);

    return 0;
}

void ChatBot(int N)
{
    int static num = 0;
    for(int i = 0; i<num; i++)
    {
        cout<<"____";
    }
    cout<<"\"����Լ��� ������?\""<<endl;
    for(int i = 0; i<num; i++)
    {
        cout<<"____";
    }
    cout<<"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���."<<endl;
    for(int i = 0; i<num; i++)
    {
        cout<<"____";
    }
    cout<<"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���."<<endl;
    for(int i = 0; i<num; i++)
    {
        cout<<"____";
    }
    cout<<"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\""<<endl;
    if(N == 1)
    {   
        num++;
        for(int i = 0; i<num; i++)
        {
            cout<<"____";
        }
        cout<<"����Լ��� ������?"<<endl;
        for(int i = 0; i<num; i++)
        {
            cout<<"____";
        }
        cout<<"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����"<<endl;
        
        while(num--)
        {
            for(int i = 0; i<num+1; i++)
            {
                cout<<"____";
            }
            cout<<"��� �亯�Ͽ���."<<endl;
        }
        cout<<"��� �亯�Ͽ���."<<endl;
        return;
    }
    num++;
    return ChatBot(--N);
    
}
