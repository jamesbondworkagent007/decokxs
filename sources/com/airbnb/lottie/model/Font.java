package com.airbnb.lottie.model;

import android.graphics.Typeface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class Font {
    private final float ascent;
    private final String family;
    private final String name;
    private final String style;
    private Typeface typeface;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getAscent() {
        return this.ascent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFamily() {
        return this.family;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getStyle() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Typeface getTypeface() {
        return this.typeface;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTypeface(@Nullable Typeface typeface) {
        this.typeface = typeface;
    }

    public Font(String str, String str2, String str3, float f) {
        this.family = str;
        this.name = str2;
        this.style = str3;
        this.ascent = f;
    }
}
