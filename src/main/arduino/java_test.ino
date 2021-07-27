/*void setup(){
Serial.begin(9600);
}
void loop(){
Serial.println("Hello world");
delay(1000);
}*/

int val = 0;

void setup(){
Serial.begin(9600);
pinMode(LED_BUILTIN,OUTPUT);
}

void loop(){
  delay(100);
}

void serialEvent(){
  while(Serial.available()){
    val = Serial.parseInt();
    Serial.println(val);
    if(val == 11){
      digitalWrite(LED_BUILTIN,HIGH);
      Serial.println("WRITE HIGH");
    }
    else if(val == 22){
      digitalWrite(LED_BUILTIN,LOW);
      Serial.println("WRITE LOW");
    }
  }
  Serial.println("Succesfully recieved");
}
