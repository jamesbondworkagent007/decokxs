package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52912wba {
    public static final C52912wba copydefault = new C52912wba();

    private C52912wba() {
    }

    public final ActionBar KWHzl(@NotNull ProfitDetailResponse profitDetailResponse, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(profitDetailResponse, "");
        java.lang.String total = profitDetailResponse.getTotal();
        ProfitDetailResponse quote = profitDetailResponse.getQuote();
        java.lang.String strEZpvd = C53418wlC.EZpvd(new C56034xvG(total, quote != null ? quote.getTotal() : null, profitDetailResponse.getCcy()).KWHzl(false, false));
        C56051xvX c56051xvX = C56051xvX.AEQbTJ;
        ProfitDetailResponse quote2 = profitDetailResponse.getQuote();
        java.lang.String smartArbProfit$default = C56051xvX.getSmartArbProfit$default(c56051xvX, C53418wlC.EZpvd(quote2 != null ? quote2.getTotal() : null), bizInstrument, false, false, 8, null);
        java.lang.String withdrawable = profitDetailResponse.getWithdrawable();
        ProfitDetailResponse quote3 = profitDetailResponse.getQuote();
        java.lang.String strEZpvd2 = C53418wlC.EZpvd(new C56034xvG(withdrawable, quote3 != null ? quote3.getWithdrawable() : null, profitDetailResponse.getCcy()).KWHzl(false, false));
        ProfitDetailResponse quote4 = profitDetailResponse.getQuote();
        java.lang.String smartArbProfit$default2 = C56051xvX.getSmartArbProfit$default(c56051xvX, C53418wlC.EZpvd(quote4 != null ? quote4.getWithdrawable() : null), bizInstrument, false, false, 8, null);
        java.lang.String withdrawn = profitDetailResponse.getWithdrawn();
        ProfitDetailResponse quote5 = profitDetailResponse.getQuote();
        java.lang.String strEZpvd3 = C53418wlC.EZpvd(new C56034xvG(withdrawn, quote5 != null ? quote5.getWithdrawn() : null, profitDetailResponse.getCcy()).KWHzl(false, false));
        ProfitDetailResponse quote6 = profitDetailResponse.getQuote();
        java.lang.String smartArbProfit$default3 = C56051xvX.getSmartArbProfit$default(c56051xvX, C53418wlC.EZpvd(quote6 != null ? quote6.getWithdrawn() : null), bizInstrument, false, false, 8, null);
        java.lang.String ccy = profitDetailResponse.getCcy();
        ProfitDetailResponse quote7 = profitDetailResponse.getQuote();
        java.lang.String ccy2 = quote7 != null ? quote7.getCcy() : null;
        return new ActionBar(strEZpvd, smartArbProfit$default, strEZpvd2, smartArbProfit$default2, strEZpvd3, smartArbProfit$default3, ccy, ccy2 == null ? "" : ccy2);
    }

    /* JADX INFO: renamed from: o.wba$ActionBar */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AhwBna;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            return new ActionBar(str, str2, str3, str4, str5, str6, str7, str8);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) actionBar.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) actionBar.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) actionBar.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((this.gEmmrt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StakingProfitsDialogInfo(totalStakeProfit=" + this.gEmmrt + ", totalQuoteProfit=" + this.copydefault + ", maxStakeWithdrawableProfit=" + this.OLrzqt + ", maxQuoteWithdrawableProfit=" + this.EZpvd + ", totalStakeWithdrawnProfit=" + this.valueOf + ", totalQuoteWithdrawnProfit=" + this.AhwBna + ", stakeUnit=" + this.KWHzl + ", quoteUnit=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AhwBna;
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            this.gEmmrt = str;
            this.copydefault = str2;
            this.OLrzqt = str3;
            this.EZpvd = str4;
            this.valueOf = str5;
            this.AhwBna = str6;
            this.KWHzl = str7;
            this.AEQbTJ = str8;
        }
    }

    /* JADX INFO: renamed from: o.wba$StateListAnimator */
    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.copydefault;
            }
            if ((i & 4) != 0) {
                str3 = stateListAnimator.AEQbTJ;
            }
            if ((i & 8) != 0) {
                str4 = stateListAnimator.KWHzl;
            }
            return stateListAnimator.OLrzqt(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new StateListAnimator(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ArbitrageProfitsDialogInfo(totalArbProfit=" + this.EZpvd + ", maxArbWithdrawableProfit=" + this.copydefault + ", totalArbWithdrawnProfit=" + this.AEQbTJ + ", arbUnit=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.EZpvd = str;
            this.copydefault = str2;
            this.AEQbTJ = str3;
            this.KWHzl = str4;
        }
    }
}
