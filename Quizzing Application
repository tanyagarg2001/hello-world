#include<fstream.h>
#include<conio.h>
#include<string.h>
#include<stdio.h>
#include<stdlib.h>
#include<dos.h>

/*********************function prototypes*************************/
void start();
void play();
void edit();
void scoreb();
int play_2();
/*****************************************************************/

fstream f1,f2,temp;

class score
{	char name[30];
	int id;
	int age;
	int total;
	int nop;            //no of players    

   public:
	  score()
	  {  strcpy(name,"noname");
	     age=10;
	     total=0;
	  }

	  void take()
	  {   nop++;
	      cout<<"\n enter name";
	      gets(name);
	      cout<<"\n enter id";
	      cin>>id;
	      cout<<"enter age" ;
	      cin>>age;
	  }

	  void show()
	  { cout<<"||"<<id<<"||"<<name<<"||"<<age<<"||"<<total<<endl; }

	  void update(int s)
	  { total=s; }

	  int retid()
	  { return id; }

	  char* retname()
	  { return name; }

	  int retnop()
	  { return nop; }

};
score s2;

class question
{  char q[80];
   char a[80];
   char b[80];
   char c[80];
   char d[80];
   char cns;                   //correct answer
   int noq;                    //no of questions      
    
 public:
   void addq()
  {   
       cout<<"\n add question";gets(q);
       cout<<"\n\n option A\t";gets(a);
       cout<<"\n\n option B\t";gets(b);
       cout<<"\n\n option C\t";gets(c);
       cout<<"\n\n option D\t";gets(d);
       cout<<"\n\n addcorrect ans\t\t";cin>>cns;
  }

   void view()
  {    
       cout<<"<QUES> \t";puts(q);
       cout<<"\n\n<A> \t";puts(a);
       cout<<"\n\n<B> \t";puts(b);
       cout<<"\n\n<C> \t";puts(c);
       cout<<"\n\n<D> \t";puts(d);
  }

   char retans()
  { return cns; }

};

question q1;

// the main function

void main()
{
   int ch;
   start();
   
   clrscr();
   cout<<"\n what do want to do?(1/2)";
   cout<<"\n 1. PLAY \n 2. OTHER OPTIONS \n3.EXIT";
   cin>>ch;
   clrscr();

   if(ch==1)
   {
     play();
   }
   else if(ch==2)
   {
     edit();
   }
   else if(ch==3)
   {
     cout<<"ending game" ;
     delay(400);
     exit(0);
   }
   getch();
}

// start function

void start()
{  clrscr();
   delay(200);
    sound(600);
   delay(500);
    nosound();
    sound(700);
   delay(500);
    nosound();
    sound(500);
   delay(500);
    nosound();
    sound(600);
   delay(500);
    nosound();
    sound(400);
   delay(500);
    nosound();
   delay(100);

 cout<<"\n\t!!    !! !!!!!! !!      !!!!!! !!!!!! !!!!!!!! !!!!!! ";
 cout<<"\n\t!! !! !! !!     !!     !!      !!  !! !! !! !! !! ";
 cout<<"\n\t!! !! !! !!!!!! !!    !!       !!  !! !! !! !! !!!!!! ";
 cout<<"\n\t!! !! !! !!     !!     !!      !!  !! !! !! !! !! ";
 cout<<"\n\t!!!!!!!! !!!!!! !!!!!!! !!!!!! !!!!!! !! !! !! !!!!!! ";
   cout<<"\n\t=============================================================\n";


 cout<<"\n\t\t\t **********            ***** ";
 cout<<"\n\t\t\t    ***               *** ***" ;
 cout<<"\n\t\t\t    ***               *** ***";
 cout<<"\n\t\t\t    ***               *** ***";
 cout<<"\n\t\t\t    ***               *** ***";
 cout<<"\n\t\t\t    ***               *** ***";
 cout<<"\n\t\t\t    ***                *****";
 cout<<"\n\t\t\t===============================\n";
 cout<<"\n\t   !!!!!    \t       #####  ##  ## #######  ######";
 cout<<"\n\t  !!	     |     |   \t## ##  ##  ##   ##      #####//";
 cout<<"\n\t !!	   ----- ----- \t##%##  ##  ##   ##        //    ";
 cout<<"\n\t  !!	     |     |   \t## %#  ##  ##   ##      //####   ";
 cout<<"\n\t   !!!!!	           #####%  ####   #####    \\ % ##/ ";
 cout<<"\n\    ================================================";
	delay(1000);
}

// play function

void play()
{
   clrscr();
   int s=0;
   char chp;  //for knowing if you have played before or not
   char in;
   char pl;
    sound(300);delay(600);nosound();
   cout<<"|||||||||| L O A D I N G |||||||||||| " <<endl;
    delay(300);
   cout<<"|||||||||||||||||||||||"<<endl;
    delay(300);
   cout<<"|||||||||||||||"<<endl;
    delay(300);
   cout<<"|||||||||"<<endl;
    delay(300);
   cout<<"||||||"<<endl;
    delay(300);
   cout<<"|||"<<endl;
    delay(300);
   cout<<" ;) ;) ;)"<<endl;
    delay(900);
   cout<<"HEY!!! \n BEFORE WE START QUIZZING" ;   delay(900);
   cout<<"\n \t\t TELL US SOMETHING ABOUT YOU!!!!" ;
    delay(1000);
   cout<<"\n have you played this quiz before?? (Y/N)";
   cin>>chp;

   if(chp=='y'||chp=='Y')
   {  
      clrscr();
   }

   else if(chp=='n'||chp=='N')         //takes player data
   {  
      char ch3;
      f2.open("PLAYER.DAT",ios::app |ios::binary);
      s2.take(); 
      
      sound(700);
     delay(900);
      nosound();
      sound(600);
     delay(900);
      nosound();
     delay(1500);  
     clrscr();
   }
//displaying rules of the quiz

 cout<<"lets have a look over the rules of the quiz game" ; delay(2500);
 cout<<"\n 1. 5 compulsory questions will be tested ,if u clear them all \n\t u can play further" ;delay(4000);
 cout<<"\n 2. cannot quit during a set of questions  ";delay(2500);
 cout<<"\n 3. for each correct answer +5 is awarded"; delay(2500);
 cout<<"\n 4. for each incorrect answer -2 is deducted";delay(2500);
 cout<<"\n 5. you cannot skip any question/ pass any question"; delay(1000);
 cout<<"\n so, r u ready???"<<"\n cool!!! lets play then!!";
  delay(1500);
 clrscr();

       cout<<"\n Q1)What is meant by ofstream in c++? ";
       cout<<"\n a) Writes to a file";
       cout<<"\n b) Reads from a file ";
       cout<<"\n c) Writes to a file & Reads from a file";
       cout<<"\n d) None of the mentioned  "  ;
       cin>>in;
       if(in=='a'||in=='A')
	{ s+=5; cout<<"right answer!!"; }
       else
	{ s-=2;cout<<"wrong"; }
      delay(800);

       cout<<"\n Q2) What is meant by multiple inheritance? ";
       cout<<"\n a) Deriving a base class from derived class ";
       cout<<"\n b) Deriving a derived class from base class ";
       cout<<"\n c) Deriving a derived class from more than one base class ";
       cout<<"\n d) None of the mentioned ";
       cin>>in;
       if(in=='c'||in=='C')
	{ s+=5; cout<<"right answer!!"; }
       else
	{ s-=2;cout<<"wrong"; }
      delay(800);

       cout<<"\n Q3)Pick out the wrong header file about strings. ";
       cout<<"\na) <string>";
       cout<<"\nb) <regex> ";
       cout<<"\nc) <ios>   ";
       cout<<"\nd) None of the mentioned   ";
       cin>>in;
       if(in=='c')
	{ s+=5; cout<<"right answer!!"; }
       else
	{ s-=2;cout<<"wrong"; }
      delay(800);

       cout<<"\n Q4)How many specifiers are present in access specifiers in class?   ";
       cout<<"\na) 1   ";
       cout<<"\nb) 2    ";
       cout<<"\nc) 3    ";
       cout<<"\nd) 4    ";
       cin>>in;
       if(in=='c'||in=='C')
	{ s+=5; cout<<"right answer!!"; }
       else
	{ s-=2;cout<<"wrong"; }
     delay(800);

       cout<<"\n Q5) which of the following can be is correct notation for function prototype? ";
       cout<<"\n a) void fxn() ";
       cout<<"\n b) void fxn(int a,char c);    ";
       cout<<"\n c) fxn void();";
       cout<<"\n d) void fxn(a)";
       cin>>in;
       if(in=='b'||in=='B')
	{ s+=5; cout<<"right answer!!"; }
       else
	{ s-=2;cout<<"wrong"; }
     delay(900);clrscr();

       cout<<"wait....... evaluating......." ;
       delay(900);

// giving result of round 1

     if(s==25)                  //if round 1 cleared
      { 
        sound(800);delay(800);nosound();
	   sound(900);delay(800);nosound();
	   sound(1000);delay(800);nosound();
	 cout<<"\n great job!! you have cleared round 1,"  ;
	 cout<<"\n to play further enter p";
	 cout<<"\n to exit press any key";
	 cin>>pl;
	  
        if(pl=='p'||pl=='P')
	  {
	    s+= play_2();
	    cout<<" well done!!!!   "; puts(s2.retname());
	    cout<<"you scored"<<s;

         s2.update(s);
         f2.write((char*)&s2,sizeof(s2));
         f1.close();
  	  }
	   else
	    exit(0);
     }

     else                      //if round 1 not cleared
     {
       sound(800);delay(800);nosound();
       sound(600);delay(800);nosound();
       sound(400);delay(800);nosound();
      cout<<"\n oops!! level not cleared \n ending game";
      delay(1000);
       cout<<" well done!!!!   "; puts(s2.retname());
       cout<<"you scored"<<s;
       cout<<"ending";
       
       s2.update(s);
       f2.write((char*)&s2,sizeof(s2));
       f2.close();
     exit(0);
     }

    getch();
}

// edit function

void edit()
{ 
  int ch;
  char ans='y';
  do
  {
   cout<<"CHOOSE AN OPTION"<<endl;
   cout<<"1. view questions"<<endl;
   cout<<"2. view scoreboard"<<endl;
   cout<<"3. add question "<<endl;
   cout<<"4. edit question"<<endl;
   cin>>ch;

   switch(ch)
   { case 1: char ch4;
	       clrscr();
	       f1.open("QUESTION.DAT",ios::in|ios::binary);
	       while(f1.read((char*)&q1,sizeof(q1)))
	       { q1.view();
	         delay(9000);
	       }
	       f1.close();
	       break;

     case 2: scoreb();
	       break;

     case 3: char ch3;
	       f1.open("QUESTION.DAT",ios::app|ios::binary);
	       do
	       {
	         q1.addq();
	         f1.write((char*)&q1,sizeof(q1));
	         cout<<"do you want to enter another question (y/n)";
	         cin>>ch3;
	       } while(ch3=='y'||ch3=='Y');
	       
             f1.close();
	        break;

     case 4: f1.open("QUESTION.DAT",ios::in|ios::binary);
	       temp.open("NEW.DAT",ios::out|ios::binary);
	       int r=0;
	       int er;
	       cout<<"\n enter question to edit";
	       cin>>er;
	     
            while(f1.read((char*)&q1,sizeof(q1)))
	       {
	         r++;
	         if(r==er)
	         {
		     cout<<"enter new details -\n";
		     q1.addq();
	         }
	         temp.write((char*)&q1,sizeof(q1));
	       }
	       temp.close();
	       f1.close();
	       remove("QUESTION.DAT");
	       rename("NEW.DAT","QUESTION.DAT");
	       break;

	 default: cout<<"wrong choice";
    }

     cout<<"\n do you want to continue" ;
     cin>>ans;
  }while(ans=='y'||ans=='Y');

 getch();
}

// scoreboard function

void scoreb()
{ 
  clrscr();
  cout<<"\t\t\t\ ####SCOREBOARD##### \n\n";
  f2.open("PLAYER.DAT",ios::out|ios::binary|ios::in);

  while( f2.read( (char*)&s2,sizeof(s2) ) )
  {
    s2.show();
    cout<<"\n\n\n";
  }

  f2.close();
 }

// play_2 function

int play_2()
{
   int scr;
   char ans;
   f1.open("QUESTION.DAT",ios::in|ios::binary);
   while(f1.read((char*)&q1,sizeof(q1)))
	{
	     q1.view();
	     cout<<"\n enter answer-";
	     cin>>ans;
	     if(ans==q1.retans())
	    { cout<<"correct";
	      scr+=5;
	    }
	     else
	    { cout<<"incorrect";
	      scr-=2;
	    }
	   delay(800);
     }
	f1.close();
	return scr;
}
