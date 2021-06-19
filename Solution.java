public static int countingValleys(int steps, String path) {
        int level = 0, valleyCount = 0;
        for(int i = 0; i < steps; i++){
            if(path.charAt(i) == 'D'){
                level--;
            } else {
                level++;
                if( level == 0){
                    valleyCount++;
                }
            }
        }
        return valleyCount;
    }
