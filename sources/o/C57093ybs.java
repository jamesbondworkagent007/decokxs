package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57093ybs {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final java.lang.String AEQbTJ;
    public final int EZpvd;
    public final byte[] KWHzl;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return "05";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.AEQbTJ;
    }

    public C57093ybs(int i, int i2, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.OLrzqt = i;
        this.EZpvd = i2;
        this.KWHzl = bArr;
        this.AEQbTJ = KWHzl() + C57137ycj.copydefault.copydefault(bArr);
    }

    public final java.lang.String KWHzl() {
        return Companion.AEQbTJ(this);
    }

    public final byte[] copydefault() {
        return C57137ycj.copydefault.EZpvd(this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.ybs$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ybs.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C57093ybs AEQbTJ(@NotNull java.lang.String str) {
            int i;
            Intrinsics.checkNotNullParameter(str, "");
            int i2 = 6;
            java.lang.String strSubstring = str.substring(2, 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            int i3 = java.lang.Integer.parseInt(strSubstring, CharsKt__CharJVMKt.checkRadix(16));
            if (i3 == 0) {
                java.lang.String strSubstring2 = str.substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                i = java.lang.Integer.parseInt(strSubstring2, CharsKt__CharJVMKt.checkRadix(16));
                i2 = 10;
            } else {
                i = 0;
            }
            java.lang.String strSubstring3 = str.substring(i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            return new C57093ybs(i3, i, C57137ycj.copydefault.EZpvd(strSubstring3));
        }

        public final java.lang.String AEQbTJ(C57093ybs c57093ybs) {
            java.lang.String strOLrzqt = c57093ybs.OLrzqt();
            C57137ycj c57137ycj = C57137ycj.copydefault;
            java.lang.String strSubstring = c57137ycj.OLrzqt(c57093ybs.AEQbTJ()).substring(r2.length() - 4);
            java.lang.String str = "";
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            if (c57093ybs.AEQbTJ() == 0) {
                java.lang.String strSubstring2 = c57137ycj.OLrzqt(c57093ybs.gEmmrt()).substring(r6.length() - 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                str = strSubstring2;
            }
            return strOLrzqt + strSubstring + str;
        }
    }
}
