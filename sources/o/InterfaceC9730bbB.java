package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bbB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9730bbB {
    boolean AEQbTJ();

    StateListAnimator EZpvd();

    void EZpvd(@NotNull java.lang.String str);

    boolean KWHzl();

    java.lang.String OLrzqt();

    java.lang.String a_(boolean z);

    boolean w_();

    /* JADX INFO: renamed from: o.bbB$Application */
    public static final class Application {
        public static /* synthetic */ java.lang.String getApproveAmount$default(InterfaceC9730bbB interfaceC9730bbB, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApproveAmount");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC9730bbB.a_(z);
        }
    }

    /* JADX INFO: renamed from: o.bbB$StateListAnimator */
    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.Boolean OLrzqt;
        public final java.lang.String copydefault;
        public final int djBIcL;
        public final int gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean djBIcL() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.gEmmrt;
        }

        public StateListAnimator(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, int i, int i2, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.EZpvd = str;
            this.copydefault = str2;
            this.AhwBna = str3;
            this.AYXKKw = str4;
            this.djBIcL = i;
            this.gEmmrt = i2;
            this.AEQbTJ = str5;
            this.KWHzl = str6;
            this.OLrzqt = bool;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 int)
  (r19v0 int)
  (r20v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r22v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:90) call: o.bbB.StateListAnimator.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, i, i2, str5, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : bool);
        }
    }
}
