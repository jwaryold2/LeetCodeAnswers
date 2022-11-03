class Solution {
    public String decodeMessage(String key, String message) {
        Map <Character, Character> abc = new HashMap<>(); //HashMap that has a character key and value
        char one = 'a'; //starting value of a for incrementation
        for (char c : key.toCharArray()) { //loop to map the key characters to the alphabet
            if (!abc.containsKey(c) && c != ' ') {
                abc.put(c, (char)one); //maps the char c from the key to the value in the alphabet so ex: Key = I am here maps to "a bc defg"
                one+=1; //Incremets char so starting at a one = one + 1 results in b etc...
            }
        }
        String decode = "";
        for(char c : message.toCharArray()) { //get the correct message using the characters in message mapping to value
            if (c != ' ') { 
                decode = decode + Character.toString(abc.get(c)); //adds to a string the value mapped to that char c 
            } else {
                decode = decode + " "; //inputs spaces like normal
            }
        }
        return decode;
    }
}
