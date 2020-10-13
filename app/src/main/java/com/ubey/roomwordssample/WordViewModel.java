package com.ubey.roomwordssample;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository mRespository;
    private LiveData<List<Word>> mAllWords;

    public WordViewModel (Application application){
        super (application);
        mRespository = new WordRepository(application);
        mAllWords = mRespository.getmAllWords();
    }

    LiveData<List<Word>> getAllWords(){
        return mAllWords;
    }

    public void insert (Word word) {
        mRespository.insert(word);
    }
}
