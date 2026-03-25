package o;

import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: renamed from: o.zwV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC60132zwV<T> {
    public T EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public T AEQbTJ() {
        return this.EZpvd;
    }

    public abstract void AEQbTJ(int i, @androidx.annotation.NonNull java.lang.String... strArr);

    public abstract android.content.Context OLrzqt();

    public abstract void OLrzqt(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull java.lang.String str3, @androidx.annotation.StyleRes int i, int i2, @androidx.annotation.NonNull java.lang.String... strArr);

    public abstract boolean OLrzqt(@androidx.annotation.NonNull java.lang.String str);

    public static AbstractC60132zwV<? extends android.app.Activity> AEQbTJ(android.app.Activity activity) {
        if (activity instanceof AppCompatActivity) {
            return new C60129zwS((AppCompatActivity) activity);
        }
        return new C60133zwW(activity);
    }

    public static AbstractC60132zwV<androidx.fragment.app.Fragment> OLrzqt(androidx.fragment.app.Fragment fragment) {
        return new C60136zwZ(fragment);
    }

    public AbstractC60132zwV(@androidx.annotation.NonNull T t) {
        this.EZpvd = t;
    }

    public final boolean AEQbTJ(@androidx.annotation.NonNull java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (OLrzqt(str)) {
                return true;
            }
        }
        return false;
    }

    public void AEQbTJ(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull java.lang.String str3, @androidx.annotation.StyleRes int i, int i2, @androidx.annotation.NonNull java.lang.String... strArr) {
        if (AEQbTJ(strArr)) {
            OLrzqt(str, str2, str3, i, i2, strArr);
        } else {
            AEQbTJ(i2, strArr);
        }
    }

    public boolean OLrzqt(@androidx.annotation.NonNull java.util.List<java.lang.String> list) {
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (AEQbTJ(it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean AEQbTJ(@androidx.annotation.NonNull java.lang.String str) {
        return !OLrzqt(str);
    }
}
