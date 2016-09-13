package android.com.shaunalberts.criminalintent3;

import java.util.Date;
import java.util.UUID;

/**
 * Created by shaun on 7/09/16.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;

    public Crime() {
        this(UUID.randomUUID());
        //mId = UUID.randomUUID();
        //mDate = new Date();
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public String getPhotoFilename() {
        return "IMG" + getId().toString() + ".jpg";
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }
}