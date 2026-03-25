package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.resource.request.MlnUpdateResp;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43155rju {
    public final MlnUpdateResp EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final MutableLiveData<java.lang.Boolean> copydefault;
    public final java.lang.String djBIcL;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C43155rju copy$default(C43155rju c43155rju, MlnUpdateResp mlnUpdateResp, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mlnUpdateResp = c43155rju.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c43155rju.KWHzl;
        }
        return c43155rju.copydefault(mlnUpdateResp, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MlnUpdateResp EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43155rju copydefault(@NotNull MlnUpdateResp mlnUpdateResp, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(mlnUpdateResp, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C43155rju(mlnUpdateResp, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MlnPacketModel(data=" + this.EZpvd + ", resourceDir=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public C43155rju(@NotNull MlnUpdateResp mlnUpdateResp, @NotNull java.lang.String str) {
        java.lang.String strSubstring;
        Intrinsics.checkNotNullParameter(mlnUpdateResp, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = mlnUpdateResp;
        this.KWHzl = str;
        this.copydefault = new MutableLiveData<>(java.lang.Boolean.FALSE);
        this.djBIcL = str + java.io.File.separator + "oklua.bundle.zip";
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) mlnUpdateResp.getName(), "_", 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default >= 0) {
            strSubstring = mlnUpdateResp.getName().substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        } else {
            strSubstring = "oklua";
        }
        this.OLrzqt = strSubstring;
    }

    /* JADX INFO: renamed from: o.rju$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rju.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final int copydefault() {
        return new java.io.File(this.KWHzl).exists() ? 2 : 0;
    }

    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C43155rju) {
            C43155rju c43155rju = (C43155rju) obj;
            if (Intrinsics.EZpvd(this.EZpvd, c43155rju.EZpvd) && Intrinsics.EZpvd(this.copydefault.getValue(), c43155rju.copydefault.getValue())) {
                return true;
            }
        }
        return false;
    }
}
