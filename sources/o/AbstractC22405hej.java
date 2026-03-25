package o;

import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22405hej {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hej.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC22405hej(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC22405hej() {
    }

    /* JADX INFO: renamed from: o.hej$StateListAnimator */
    public static final class StateListAnimator extends AbstractC22405hej {
        public final SlippageMode AEQbTJ;
        public final java.lang.String AhwBna;
        public final java.lang.String EZpvd;
        public final QuotePriceRes KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, QuotePriceRes quotePriceRes, java.lang.String str3, java.lang.String str4, SlippageMode slippageMode, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.OLrzqt;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                quotePriceRes = stateListAnimator.KWHzl;
            }
            QuotePriceRes quotePriceRes2 = quotePriceRes;
            if ((i & 8) != 0) {
                str3 = stateListAnimator.AhwBna;
            }
            java.lang.String str6 = str3;
            if ((i & 16) != 0) {
                str4 = stateListAnimator.EZpvd;
            }
            java.lang.String str7 = str4;
            if ((i & 32) != 0) {
                slippageMode = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.EZpvd(str, str5, quotePriceRes2, str6, str7, slippageMode);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull SlippageMode slippageMode) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(quotePriceRes, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(slippageMode, "");
            return new StateListAnimator(str, str2, quotePriceRes, str3, str4, slippageMode);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SlippageMode KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final QuotePriceRes copydefault() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) stateListAnimator.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && this.AEQbTJ == stateListAnimator.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BridgeTrackingSubmit(submitType=" + this.copydefault + ", sourceType=" + this.OLrzqt + ", quotePriceRes=" + this.KWHzl + ", walletAddress=" + this.AhwBna + ", slippageValue=" + this.EZpvd + ", slippageMode=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull SlippageMode slippageMode) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(quotePriceRes, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(slippageMode, "");
            this.copydefault = str;
            this.OLrzqt = str2;
            this.KWHzl = quotePriceRes;
            this.AhwBna = str3;
            this.EZpvd = str4;
            this.AEQbTJ = slippageMode;
        }
    }
}
