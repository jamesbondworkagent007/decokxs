package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bRQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9215bRQ extends C8491bDi {
    public final java.lang.String AhwBna;
    public final Activity fetchVPNInfo;
    public final ActionBar isConnected;
    public boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Activity valueOf() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r12v0 int)
  (r13v0 o.bwM)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 o.bRQ$ActionBar)
  (r19v0 o.bRQ$Activity)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
 A[MD:(int, o.bwM, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.bRQ$ActionBar, o.bRQ$Activity, boolean):void (m)] (LINE:82) call: o.bRQ.<init>(int, o.bwM, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.bRQ$ActionBar, o.bRQ$Activity, boolean):void type: THIS */
    public /* synthetic */ C9215bRQ(int i, C10854bwM c10854bwM, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, ActionBar actionBar, Activity activity, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, c10854bwM, str, str2, str3, str4, actionBar, activity, (i2 & 256) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9215bRQ(int i, @NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull ActionBar actionBar, @NotNull Activity activity, boolean z) {
        super(c10854bwM, str, str2, str3, "Gwei", i);
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(activity, "");
        this.AhwBna = str4;
        this.isConnected = actionBar;
        this.fetchVPNInfo = activity;
        this.values = z;
    }

    /* JADX INFO: renamed from: o.bRQ$ActionBar */
    public static final class ActionBar {
        public final boolean AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.djBIcL;
        }

        public ActionBar(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.AEQbTJ = z;
            this.OLrzqt = str;
            this.copydefault = str2;
            this.gEmmrt = str3;
            this.KWHzl = str4;
            this.EZpvd = str5;
            this.djBIcL = str6;
            this.AYXKKw = str7;
        }
    }

    /* JADX INFO: renamed from: o.bRQ$Activity */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.OLrzqt = str;
            this.EZpvd = str2;
            this.copydefault = str3;
            this.AEQbTJ = str4;
        }
    }

    public static /* synthetic */ java.lang.String weiToGwei$default(C9215bRQ c9215bRQ, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weiToGwei");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return c9215bRQ.copydefault(str, z, z2);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        int iValueOf = getFeeCoinMeta().valueOf();
        return C54869xYi.weiToGwei$default(str, java.lang.Integer.valueOf(iValueOf), z, z2 ? getFeeUnit() : null, false, 8, null);
    }
}
