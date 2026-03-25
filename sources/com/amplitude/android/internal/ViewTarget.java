package com.amplitude.android.internal;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ViewTarget {
    public final String AEQbTJ;
    public final String AYXKKw;
    public final WeakReference<Object> AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final Object OLrzqt;
    public final String copydefault;
    public final String gEmmrt;

    public enum Type {
        Clickable
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ViewTarget copy$default(ViewTarget viewTarget, Object obj, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = viewTarget.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = viewTarget.AEQbTJ;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = viewTarget.EZpvd;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = viewTarget.gEmmrt;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = viewTarget.AYXKKw;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = viewTarget.copydefault;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = viewTarget.KWHzl;
        }
        return viewTarget.KWHzl(obj, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewTarget KWHzl(Object obj, String str, String str2, String str3, String str4, @NotNull String str5, String str6) {
        Intrinsics.checkNotNullParameter(str5, "");
        return new ViewTarget(obj, str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewTarget)) {
            return false;
        }
        ViewTarget viewTarget = (ViewTarget) obj;
        return Intrinsics.EZpvd(this.OLrzqt, viewTarget.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) viewTarget.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) viewTarget.EZpvd) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) viewTarget.gEmmrt) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) viewTarget.AYXKKw) && Intrinsics.EZpvd((Object) this.copydefault, (Object) viewTarget.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) viewTarget.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Object obj = this.OLrzqt;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        String str = this.AEQbTJ;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.EZpvd;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.gEmmrt;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.AYXKKw;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        int iHashCode6 = this.copydefault.hashCode();
        String str5 = this.KWHzl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ViewTarget(_view=" + this.OLrzqt + ", className=" + this.AEQbTJ + ", resourceName=" + this.EZpvd + ", tag=" + this.gEmmrt + ", text=" + this.AYXKKw + ", source=" + this.copydefault + ", hierarchy=" + this.KWHzl + ')';
    }

    public ViewTarget(Object obj, String str, String str2, String str3, String str4, @NotNull String str5, String str6) {
        Intrinsics.checkNotNullParameter(str5, "");
        this.OLrzqt = obj;
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.gEmmrt = str3;
        this.AYXKKw = str4;
        this.copydefault = str5;
        this.KWHzl = str6;
        this.AhwBna = new WeakReference<>(obj);
    }
}
