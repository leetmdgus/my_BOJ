#include <iostream>
using namespace std;

void ChatBot(int , int);

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int N;
    cin>>N;
    cout<<"��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n";
    
    ChatBot(N, 1);

    return 0;
}

void ChatBot(int N, int num)
{
    cout<<"����Լ��� ������?"<<endl;
    cout<<"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���."<<endl;
    cout<<"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���."<<endl;
    cout<<"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������."<<endl;
    if(N == 1)
    {   
        cout<<"����Լ��� ������?"<<endl;
        cout<<"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����"<<endl;
        cout<<"��� �亯�Ͽ���."<<endl;
        return;
    }
    return ChatBot(--N, num++);
    
}
