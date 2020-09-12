class P1528 {
    public String restoreString(String s, int[] indices) {
        
        String finalString = "";
        char[] finalStringsArray = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
            finalStringsArray[indices[i]] = s.charAt(i);
        }

        for (int j = 0; j < finalStringsArray.length; j++) {
            finalString += finalStringsArray[j];
        }

        return finalString;
    }
}