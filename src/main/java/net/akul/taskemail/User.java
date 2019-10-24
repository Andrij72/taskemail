package net.akul.taskemail;

import java.util.HashSet;
import java.util.List;

public class User {

        private String mName;
        private HashSet<String> mAdress;

        public User(String mName,HashSet<String>mAdress) {
            this.mName=mName;
            this.mAdress = mAdress;
        }

        public HashSet<String> getmAdress() {
            return mAdress;
        }

        public void setmAdress(HashSet<String> mAdress) {
            this.mAdress = mAdress;
        }

        public String getmName() {
            return mName;
        }

        public void setmName(String mName) {
            this.mName = mName;
        }

    @Override
    public String toString() {
        return  mName +  mAdress+ "\n" ;
    }
}
