package com.immomo.mls.fun.ui.custom;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Objects;
import o.C7594aml;
import o.C7911ask;
import org.luaj.vm2.Globals;

/* JADX INFO: loaded from: classes14.dex */
public class JColor {
    private int mColor;
    private Integer mDarkColor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer getDarkColor() {
        return this.mDarkColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getDayColor() {
        return this.mColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDarkColor(@Nullable Integer num) {
        this.mDarkColor = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDayColor(int i) {
        this.mColor = i;
    }

    public JColor(int i, @Nullable Integer num) {
        this.mColor = i;
        this.mDarkColor = num;
    }

    public int getColor(Globals globals) {
        return getColor(C7594aml.AEQbTJ(globals));
    }

    public int getColor(Context context) {
        return (!C7911ask.AEQbTJ(context) || getDarkColor() == null) ? this.mColor : this.mDarkColor.intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JColor jColor = (JColor) obj;
        return this.mColor == jColor.mColor && Objects.equals(this.mDarkColor, jColor.mDarkColor);
    }

    public int hashCode() {
        int i = this.mColor;
        return Objects.hash(Integer.valueOf(i), this.mDarkColor);
    }
}
