#include<iostream>
#include<list>

using namespace std;

int main()
{
	list<int> int_list;
	
	int_list.push_back(1);
	int_list.push_back(2);
	int_list.push_back(3);
	int_list.push_front(4);
	int_list.push_front(5);

	if (int_list.empty())
		cout << "Is empty" << endl;
	else
		cout << "This size : " << int_list.size()<< endl;

	for (int i : int_list)
	{
		cout << i << endl; // ���
	}

	list<int>::iterator iter = int_list.begin();
	iter++;
	cout << "2��°�� 4����" << endl;
	int_list.erase(iter);

	iter = int_list.begin();
	iter++;
	cout << "2��°�� 9����" << endl;
	int_list.insert(iter, 9);
	
	for (int i : int_list)
	{
		cout << i << endl; //���
	}
	
	cout<<"ù�� ° �� : "<<int_list.front()<<endl;

	cout << "��� �����" << endl;
	int_list.clear();

	if (int_list.empty())
		cout << "Is empty" << endl;
	else
		cout << "This size : " << int_list.size() << endl;

	return 0;
}
