package o;

import com.okinc.core.glide.ImageSize;

/* JADX INFO: renamed from: o.mpt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33092mpt {
    public static void OLrzqt(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, int i, ImageSize imageSize) {
        if (i == 3) {
            OLrzqt(textView, drawable, imageSize);
            return;
        }
        if (i == 5) {
            AEQbTJ(textView, drawable, imageSize);
            return;
        }
        if (i == 48) {
            AhwBna(textView, drawable, imageSize);
            return;
        }
        if (i == 80) {
            copydefault(textView, drawable, imageSize);
        } else if (i == 8388611) {
            EZpvd(textView, drawable, imageSize);
        } else {
            if (i != 8388613) {
                return;
            }
            KWHzl(textView, drawable, imageSize);
        }
    }

    public static void OLrzqt(android.graphics.drawable.Drawable drawable, ImageSize imageSize) {
        if (drawable != null) {
            if (imageSize != null) {
                drawable.setBounds(0, 0, imageSize.getWidth(), imageSize.getHeight());
            } else {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        }
    }

    public static void copydefault(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, ImageSize imageSize) {
        OLrzqt(drawable, imageSize);
        android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawablesRelative(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], drawable);
    }

    public static void OLrzqt(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, ImageSize imageSize) {
        OLrzqt(drawable, imageSize);
        android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawablesRelative(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    public static void AEQbTJ(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, ImageSize imageSize) {
        OLrzqt(drawable, imageSize);
        android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawablesRelative(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    public static void AhwBna(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, ImageSize imageSize) {
        OLrzqt(drawable, imageSize);
        android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawablesRelative(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    public static void EZpvd(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, ImageSize imageSize) {
        OLrzqt(drawable, imageSize);
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public static void KWHzl(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, ImageSize imageSize) {
        OLrzqt(drawable, imageSize);
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }
}
