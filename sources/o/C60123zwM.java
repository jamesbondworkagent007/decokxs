package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C60125zwO;

/* JADX INFO: renamed from: o.zwM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60123zwM {
    public final java.lang.String[] AEQbTJ;
    public final int AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final AbstractC60132zwV OLrzqt;
    public final java.lang.String copydefault;
    public final int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC60132zwV AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int gEmmrt() {
        return this.AhwBna;
    }

    public C60123zwM(AbstractC60132zwV abstractC60132zwV, java.lang.String[] strArr, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2) {
        this.OLrzqt = abstractC60132zwV;
        this.AEQbTJ = (java.lang.String[]) strArr.clone();
        this.gEmmrt = i;
        this.EZpvd = str;
        this.KWHzl = str2;
        this.copydefault = str3;
        this.AhwBna = i2;
    }

    public java.lang.String[] OLrzqt() {
        return (java.lang.String[]) this.AEQbTJ.clone();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C60123zwM.class != obj.getClass()) {
            return false;
        }
        C60123zwM c60123zwM = (C60123zwM) obj;
        return java.util.Arrays.equals(this.AEQbTJ, c60123zwM.AEQbTJ) && this.gEmmrt == c60123zwM.gEmmrt;
    }

    public int hashCode() {
        return (java.util.Arrays.hashCode(this.AEQbTJ) * 31) + this.gEmmrt;
    }

    public java.lang.String toString() {
        return "PermissionRequest{mHelper=" + this.OLrzqt + ", mPerms=" + java.util.Arrays.toString(this.AEQbTJ) + ", mRequestCode=" + this.gEmmrt + ", mRationale='" + this.EZpvd + "', mPositiveButtonText='" + this.KWHzl + "', mNegativeButtonText='" + this.copydefault + "', mTheme=" + this.AhwBna + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: renamed from: o.zwM$ActionBar */
    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public int AYXKKw = -1;
        public final int AhwBna;
        public java.lang.String EZpvd;
        public final AbstractC60132zwV KWHzl;
        public final java.lang.String[] OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar copydefault(@androidx.annotation.Nullable java.lang.String str) {
            this.copydefault = str;
            return this;
        }

        public ActionBar(@androidx.annotation.NonNull android.app.Activity activity, int i, @androidx.annotation.NonNull @androidx.annotation.Size(min = 1) java.lang.String... strArr) {
            this.KWHzl = AbstractC60132zwV.AEQbTJ(activity);
            this.AhwBna = i;
            this.OLrzqt = strArr;
        }

        public ActionBar(@androidx.annotation.NonNull androidx.fragment.app.Fragment fragment, int i, @androidx.annotation.NonNull @androidx.annotation.Size(min = 1) java.lang.String... strArr) {
            this.KWHzl = AbstractC60132zwV.OLrzqt(fragment);
            this.AhwBna = i;
            this.OLrzqt = strArr;
        }

        public C60123zwM AEQbTJ() {
            if (this.copydefault == null) {
                this.copydefault = this.KWHzl.OLrzqt().getString(C60125zwO.Activity.copydefault);
            }
            if (this.EZpvd == null) {
                this.EZpvd = this.KWHzl.OLrzqt().getString(android.R.string.ok);
            }
            if (this.AEQbTJ == null) {
                this.AEQbTJ = this.KWHzl.OLrzqt().getString(android.R.string.cancel);
            }
            return new C60123zwM(this.KWHzl, this.OLrzqt, this.AhwBna, this.copydefault, this.EZpvd, this.AEQbTJ, this.AYXKKw);
        }
    }
}
