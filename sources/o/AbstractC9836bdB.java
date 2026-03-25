package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bdB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9836bdB {
    public final long KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long) A[MD:(long):void (m)] call: o.bdB.<init>(long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC9836bdB(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long EZpvd() {
        return this.KWHzl;
    }

    public AbstractC9836bdB(long j) {
        this.KWHzl = j;
    }

    /* JADX INFO: renamed from: o.bdB$StateListAnimator */
    public static final class StateListAnimator extends AbstractC9836bdB {
        public final long AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String AkhnZx;
        public final java.lang.String DbNXlk;
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;
        public final long copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC9836bdB
        public long EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, long j2, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new StateListAnimator(j, str, str2, str3, str4, str5, str6, j2, str7, str8, str9);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) stateListAnimator.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) stateListAnimator.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) stateListAnimator.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) stateListAnimator.DbNXlk) && this.copydefault == stateListAnimator.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) stateListAnimator.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) stateListAnimator.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) stateListAnimator.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Long.hashCode(this.AEQbTJ);
            int iHashCode2 = this.valueOf.hashCode();
            int iHashCode3 = this.djBIcL.hashCode();
            int iHashCode4 = this.AkhnZx.hashCode();
            int iHashCode5 = this.OLrzqt.hashCode();
            int iHashCode6 = this.EZpvd.hashCode();
            int iHashCode7 = this.DbNXlk.hashCode();
            int iHashCode8 = java.lang.Long.hashCode(this.copydefault);
            java.lang.String str = this.AYXKKw;
            int iHashCode9 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.AhwBna;
            int iHashCode10 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.gEmmrt;
            return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OKWalletEVMSignTxReq(chainIndex=" + this.AEQbTJ + ", nonce=" + this.valueOf + ", to=" + this.djBIcL + ", value=" + this.AkhnZx + ", data=" + this.OLrzqt + ", gasLimit=" + this.EZpvd + ", txType=" + this.DbNXlk + ", chainId=" + this.copydefault + ", gasPrice=" + this.AYXKKw + ", maxFeePerGas=" + this.AhwBna + ", maxPriorityFeePerGas=" + this.gEmmrt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AhwBna;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, long j2, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
            super(j, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.AEQbTJ = j;
            this.valueOf = str;
            this.djBIcL = str2;
            this.AkhnZx = str3;
            this.OLrzqt = str4;
            this.EZpvd = str5;
            this.DbNXlk = str6;
            this.copydefault = j2;
            this.AYXKKw = str7;
            this.AhwBna = str8;
            this.gEmmrt = str9;
        }
    }
}
