package sg.edu.rp.id19037610.p02_holidays;

import android.graphics.drawable.Drawable;

public class Holiday {
    String title;
    String date;
    String type;
    int image;

    public Holiday(String title, String date, String type, int image){
        this.title = title;
        this.date = date;
        this.type = type;
        this.image = image;
    }

    public String getTitle(){
        return title;
    }

    public String getDate(){
        return date;
    }

    public String getType(){
        return type;
    }

    public int getImage(){
        return image;
    }
}
