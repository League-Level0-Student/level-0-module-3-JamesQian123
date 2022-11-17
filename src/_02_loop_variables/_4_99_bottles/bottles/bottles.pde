void setup(){int bottles = 99;
for(int i = 0; i < 99; i++){
  if(bottles > 1){
     print( bottles + "bottles of beer on the wall. " + bottles + "bottles of beer");
     bottles = bottles - 1;
     print("Take one down, pass it around" + bottles + " bottles of beer on the wall");
}
  else if( bottles == 1){
     print(bottles + " bottle of beer on the wall" + bottles + " bottle of beer, take one down pass it around no more bottles of beer on the wall");
  
  
}
  else if (bottles == 0){
      print("No more bottles of beer on the wall, no more bottles of beer. Go to the store buy some more 99 bottles of beer on the wall");
}
}
}
