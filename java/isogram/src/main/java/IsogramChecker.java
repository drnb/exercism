class IsogramChecker {

    boolean isIsogram(String phrase) {
        char[] charPhrase = phrase.toCharArray();

        for (int i = 0; i < charPhrase.length; i++){
            if (charPhrase[i] == '-' || charPhrase[i] == ' ') continue;

            for (int ii = 0; ii < charPhrase.length; ii++){
                if (charPhrase[ii] == '-' || charPhrase[ii] == ' ' || i == ii) continue;

                if (Character.getNumericValue(charPhrase[i]) == Character.getNumericValue(charPhrase[ii])) return false;
            }
        }
        return true;
    }

}
