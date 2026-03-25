package o;

import androidx.core.app.FrameMetricsAggregator;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.invest_biz.data.bean.BorrowedInfo;
import com.okinc.business.invest_biz.data.bean.CollateralRatioInfo;
import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.business.invest_biz.data.bean.HeathFactorInfo;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTipsBean;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import com.okinc.business.invest_biz.data.bean.PointInfo;
import com.okinc.business.invest_biz.data.bean.SwapSlippageConfig;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.iXu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC24178iXu {
    DetailItemType EZpvd();

    /* JADX INFO: renamed from: o.iXu$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC24178iXu {
        public final int AEQbTJ;
        public final DetailItemType AYXKKw;
        public final boolean AhwBna;
        public final java.util.List<InvestTokenWithAmount> EZpvd;
        public final boolean KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.util.List<PointInfo> djBIcL;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PointInfo> AEQbTJ() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InvestTokenWithAmount> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(boolean z, @NotNull java.lang.String str, @NotNull java.util.List<InvestTokenWithAmount> list, int i, @NotNull java.util.List<PointInfo> list2, boolean z2, @NotNull java.lang.String str2, java.lang.String str3, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new StateListAnimator(z, str, list, i, list2, z2, str2, str3, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.valueOf;
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
            return this.AhwBna == stateListAnimator.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd(this.djBIcL, stateListAnimator.djBIcL) && this.KWHzl == stateListAnimator.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) stateListAnimator.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && this.AYXKKw == stateListAnimator.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.AhwBna);
            int iHashCode2 = this.copydefault.hashCode();
            int iHashCode3 = this.EZpvd.hashCode();
            int iHashCode4 = java.lang.Integer.hashCode(this.AEQbTJ);
            int iHashCode5 = this.djBIcL.hashCode();
            int iHashCode6 = java.lang.Boolean.hashCode(this.KWHzl);
            int iHashCode7 = this.valueOf.hashCode();
            java.lang.String str = this.OLrzqt;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.AYXKKw.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DailyYieldData(isLoading=" + this.AhwBna + ", error=" + this.copydefault + ", gainsTokenList=" + this.EZpvd + ", investType=" + this.AEQbTJ + ", pointsList=" + this.djBIcL + ", isFirstItem=" + this.KWHzl + ", totalGainsCurrencyAmount=" + this.valueOf + ", boostTagText=" + this.OLrzqt + ", itemType=" + this.AYXKKw + ")";
        }

        public StateListAnimator(boolean z, @NotNull java.lang.String str, @NotNull java.util.List<InvestTokenWithAmount> list, int i, @NotNull java.util.List<PointInfo> list2, boolean z2, @NotNull java.lang.String str2, java.lang.String str3, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.AhwBna = z;
            this.copydefault = str;
            this.EZpvd = list;
            this.AEQbTJ = i;
            this.djBIcL = list2;
            this.KWHzl = z2;
            this.valueOf = str2;
            this.OLrzqt = str3;
            this.AYXKKw = detailItemType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0046: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (r15v0 java.util.List)
  (r16v0 int)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0013: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:116)) : (r17v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003e: SGET  A[WRAPPED] (LINE:120) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.DAILY_YIELD com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType) : (r21v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType))
 A[MD:(boolean, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, int, java.util.List<com.okinc.business.invest_biz.data.bean.PointInfo>, boolean, java.lang.String, java.lang.String, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void (m)] (LINE:111) call: o.iXu.StateListAnimator.<init>(boolean, java.lang.String, java.util.List, int, java.util.List, boolean, java.lang.String, java.lang.String, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void type: THIS */
        public /* synthetic */ StateListAnimator(boolean z, java.lang.String str, java.util.List list, int i, java.util.List list2, boolean z2, java.lang.String str2, java.lang.String str3, DetailItemType detailItemType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "" : str, list, i, (i2 & 16) != 0 ? yDY.AhwBna() : list2, (i2 & 32) != 0 ? true : z2, (i2 & 64) != 0 ? "" : str2, (i2 & 128) != 0 ? "" : str3, (i2 & 256) != 0 ? DetailItemType.DAILY_YIELD : detailItemType);
        }
    }

    /* JADX INFO: renamed from: o.iXu$Application */
    public static final class Application implements InterfaceC24178iXu {
        public final DetailItemType AEQbTJ;
        public final java.lang.Integer EZpvd;
        public final CollateralRatioInfo KWHzl;
        public final CollateralRatioInfo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.Integer num, CollateralRatioInfo collateralRatioInfo, CollateralRatioInfo collateralRatioInfo2, DetailItemType detailItemType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = application.EZpvd;
            }
            if ((i & 2) != 0) {
                collateralRatioInfo = application.OLrzqt;
            }
            if ((i & 4) != 0) {
                collateralRatioInfo2 = application.KWHzl;
            }
            if ((i & 8) != 0) {
                detailItemType = application.AEQbTJ;
            }
            return application.copydefault(num, collateralRatioInfo, collateralRatioInfo2, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CollateralRatioInfo AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CollateralRatioInfo copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(java.lang.Integer num, @NotNull CollateralRatioInfo collateralRatioInfo, CollateralRatioInfo collateralRatioInfo2, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(collateralRatioInfo, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new Application(num, collateralRatioInfo, collateralRatioInfo2, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && this.AEQbTJ == application.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Integer num = this.EZpvd;
            int iHashCode = num == null ? 0 : num.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            CollateralRatioInfo collateralRatioInfo = this.KWHzl;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (collateralRatioInfo != null ? collateralRatioInfo.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CollateralRatioItem(transactionType=" + this.EZpvd + ", initialCollateralRatio=" + this.OLrzqt + ", receiveInfoCollateralRatio=" + this.KWHzl + ", itemType=" + this.AEQbTJ + ")";
        }

        public Application(java.lang.Integer num, @NotNull CollateralRatioInfo collateralRatioInfo, CollateralRatioInfo collateralRatioInfo2, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(collateralRatioInfo, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.EZpvd = num;
            this.OLrzqt = collateralRatioInfo;
            this.KWHzl = collateralRatioInfo2;
            this.AEQbTJ = detailItemType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (r3v0 com.okinc.business.invest_biz.data.bean.CollateralRatioInfo)
  (wrap:com.okinc.business.invest_biz.data.bean.CollateralRatioInfo:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.CollateralRatioInfo) : (r4v0 com.okinc.business.invest_biz.data.bean.CollateralRatioInfo))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:0x000f: SGET  A[WRAPPED] (LINE:127) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.COLLATERAL_RATIO com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType) : (r5v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType))
 A[MD:(java.lang.Integer, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void (m)] (LINE:123) call: o.iXu.Application.<init>(java.lang.Integer, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void type: THIS */
        public /* synthetic */ Application(java.lang.Integer num, CollateralRatioInfo collateralRatioInfo, CollateralRatioInfo collateralRatioInfo2, DetailItemType detailItemType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, collateralRatioInfo, (i & 4) != 0 ? null : collateralRatioInfo2, (i & 8) != 0 ? DetailItemType.COLLATERAL_RATIO : detailItemType);
        }

        public final int KWHzl() {
            java.lang.Integer num = this.EZpvd;
            return (num != null && num.intValue() == 0 && this.KWHzl == null) ? C25493ixk.FragmentManager.QslYrK : C25493ixk.FragmentManager.DTeKQX;
        }
    }

    /* JADX INFO: renamed from: o.iXu$ActionBar */
    public static final class ActionBar implements InterfaceC24178iXu {
        public final HeathFactorInfo AEQbTJ;
        public final DetailItemType KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, HeathFactorInfo heathFactorInfo, DetailItemType detailItemType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                heathFactorInfo = actionBar.AEQbTJ;
            }
            if ((i & 2) != 0) {
                detailItemType = actionBar.KWHzl;
            }
            return actionBar.EZpvd(heathFactorInfo, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HeathFactorInfo AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull HeathFactorInfo heathFactorInfo, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(heathFactorInfo, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new ActionBar(heathFactorInfo, detailItemType);
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
            return Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && this.KWHzl == actionBar.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HealthFactorItem(heathFactorInfo=" + this.AEQbTJ + ", itemType=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull HeathFactorInfo heathFactorInfo, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(heathFactorInfo, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.AEQbTJ = heathFactorInfo;
            this.KWHzl = detailItemType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 com.okinc.business.invest_biz.data.bean.HeathFactorInfo)
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:0x0004: SGET  A[WRAPPED] (LINE:139) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.HEALTH_FACTOR com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType) : (r2v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType))
 A[MD:(com.okinc.business.invest_biz.data.bean.HeathFactorInfo, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void (m)] (LINE:137) call: o.iXu.ActionBar.<init>(com.okinc.business.invest_biz.data.bean.HeathFactorInfo, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void type: THIS */
        public /* synthetic */ ActionBar(HeathFactorInfo heathFactorInfo, DetailItemType detailItemType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(heathFactorInfo, (i & 2) != 0 ? DetailItemType.HEALTH_FACTOR : detailItemType);
        }
    }

    /* JADX INFO: renamed from: o.iXu$TaskDescription */
    public static final class TaskDescription implements InterfaceC24178iXu {
        public final DetailItemType AEQbTJ;
        public final java.lang.String AYXKKw;
        public final int AhwBna;
        public final iXF<?> EZpvd;
        public final java.lang.Integer KWHzl;
        public final InvestTipInfoVo OLrzqt;
        public final java.lang.Integer copydefault;
        public final java.lang.Integer djBIcL;
        public final java.lang.String gEmmrt;
        public final int valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTipInfoVo AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@androidx.annotation.StringRes java.lang.Integer num, @androidx.annotation.StringRes java.lang.Integer num2, java.lang.String str, InvestTipInfoVo investTipInfoVo, @androidx.annotation.DrawableRes int i, @NotNull java.lang.String str2, @androidx.annotation.StringRes java.lang.Integer num3, @androidx.annotation.DrawableRes int i2, iXF<?> ixf, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new TaskDescription(num, num2, str, investTipInfoVo, i, str2, num3, i2, ixf, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final iXF<?> KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) taskDescription.AYXKKw) && Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && this.valueOf == taskDescription.valueOf && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) taskDescription.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, taskDescription.djBIcL) && this.AhwBna == taskDescription.AhwBna && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && this.AEQbTJ == taskDescription.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Integer num = this.copydefault;
            int iHashCode = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.KWHzl;
            int iHashCode2 = num2 == null ? 0 : num2.hashCode();
            java.lang.String str = this.AYXKKw;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            InvestTipInfoVo investTipInfoVo = this.OLrzqt;
            int iHashCode4 = investTipInfoVo == null ? 0 : investTipInfoVo.hashCode();
            int iHashCode5 = java.lang.Integer.hashCode(this.valueOf);
            int iHashCode6 = this.gEmmrt.hashCode();
            java.lang.Integer num3 = this.djBIcL;
            int iHashCode7 = num3 == null ? 0 : num3.hashCode();
            int iHashCode8 = java.lang.Integer.hashCode(this.AhwBna);
            iXF<?> ixf = this.EZpvd;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (ixf != null ? ixf.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Item(titleRes=" + this.copydefault + ", titleDescription=" + this.KWHzl + ", titleString=" + this.AYXKKw + ", tip=" + this.OLrzqt + ", titleTipIcon=" + this.valueOf + ", value=" + this.gEmmrt + ", valueDescription=" + this.djBIcL + ", valueTipIcon=" + this.AhwBna + ", specialValue=" + this.EZpvd + ", itemType=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.gEmmrt;
        }

        public TaskDescription(@androidx.annotation.StringRes java.lang.Integer num, @androidx.annotation.StringRes java.lang.Integer num2, java.lang.String str, InvestTipInfoVo investTipInfoVo, @androidx.annotation.DrawableRes int i, @NotNull java.lang.String str2, @androidx.annotation.StringRes java.lang.Integer num3, @androidx.annotation.DrawableRes int i2, iXF<?> ixf, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.copydefault = num;
            this.KWHzl = num2;
            this.AYXKKw = str;
            this.OLrzqt = investTipInfoVo;
            this.valueOf = i;
            this.gEmmrt = str2;
            this.djBIcL = num3;
            this.AhwBna = i2;
            this.EZpvd = ixf;
            this.AEQbTJ = detailItemType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0053: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x001a: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r18v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0022: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: SGET  A[WRAPPED] o.wXj.TaskDescription.GGlJim int) : (r19v0 int))
  (r20v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002c: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r21v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0034: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: SGET  A[WRAPPED] o.wXj.TaskDescription.GGlJim int) : (r22v0 int))
  (wrap:o.iXF:?: TERNARY null = ((wrap:int:0x003e: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null o.iXF) : (r23v0 o.iXF))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:?: TERNARY null = ((wrap:int:0x0046: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004c: SGET  A[WRAPPED] (LINE:152) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.DEFAULT com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType) : (r24v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, java.lang.String, java.lang.Integer, int, o.iXF<?>, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void (m)] (LINE:142) call: o.iXu.TaskDescription.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, java.lang.String, java.lang.Integer, int, o.iXF, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.Integer num, java.lang.Integer num2, java.lang.String str, InvestTipInfoVo investTipInfoVo, int i, java.lang.String str2, java.lang.Integer num3, int i2, iXF ixf, DetailItemType detailItemType, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? null : num2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : investTipInfoVo, (i3 & 16) != 0 ? C52761wXj.TaskDescription.GGlJim : i, str2, (i3 & 64) != 0 ? null : num3, (i3 & 128) != 0 ? C52761wXj.TaskDescription.GGlJim : i2, (i3 & 256) != 0 ? null : ixf, (i3 & 512) != 0 ? DetailItemType.DEFAULT : detailItemType);
        }
    }

    /* JADX INFO: renamed from: o.iXu$VoiceInteractor */
    public static final class VoiceInteractor implements InterfaceC24178iXu {
        public final java.util.List<InvestTokenWithAmount> AEQbTJ;
        public final int AYXKKw;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final DetailItemType OLrzqt;
        public final java.lang.Integer copydefault;
        public final InvestTokenWithAmount djBIcL;
        public final java.util.List<InvestTokenWithAmount> gEmmrt;
        public final InvestTipsBean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor() {
            this(0, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InvestTokenWithAmount> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VoiceInteractor AEQbTJ(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.List<InvestTokenWithAmount> list, java.util.List<InvestTokenWithAmount> list2, InvestTokenWithAmount investTokenWithAmount, @NotNull InvestTipsBean investTipsBean, java.lang.Integer num, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(investTipsBean, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new VoiceInteractor(i, str, str2, list, list2, investTokenWithAmount, investTipsBean, num, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTokenWithAmount AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTipsBean AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.OLrzqt;
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
        public final java.lang.Integer copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VoiceInteractor)) {
                return false;
            }
            VoiceInteractor voiceInteractor = (VoiceInteractor) obj;
            return this.AYXKKw == voiceInteractor.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) voiceInteractor.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) voiceInteractor.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, voiceInteractor.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, voiceInteractor.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, voiceInteractor.djBIcL) && Intrinsics.EZpvd(this.valueOf, voiceInteractor.valueOf) && Intrinsics.EZpvd(this.copydefault, voiceInteractor.copydefault) && this.OLrzqt == voiceInteractor.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InvestTokenWithAmount> gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.AYXKKw);
            int iHashCode2 = this.KWHzl.hashCode();
            int iHashCode3 = this.EZpvd.hashCode();
            java.util.List<InvestTokenWithAmount> list = this.AEQbTJ;
            int iHashCode4 = list == null ? 0 : list.hashCode();
            java.util.List<InvestTokenWithAmount> list2 = this.gEmmrt;
            int iHashCode5 = list2 == null ? 0 : list2.hashCode();
            InvestTokenWithAmount investTokenWithAmount = this.djBIcL;
            int iHashCode6 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
            int iHashCode7 = this.valueOf.hashCode();
            java.lang.Integer num = this.copydefault;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TransactionProcessPath(type=" + this.AYXKKw + ", platformLogo=" + this.KWHzl + ", platformName=" + this.EZpvd + ", investWithToken=" + this.AEQbTJ + ", swapToToken=" + this.gEmmrt + ", receiveTokenInfo=" + this.djBIcL + ", tipsBean=" + this.valueOf + ", investmentCategory=" + this.copydefault + ", itemType=" + this.OLrzqt + ")";
        }

        public VoiceInteractor(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.List<InvestTokenWithAmount> list, java.util.List<InvestTokenWithAmount> list2, InvestTokenWithAmount investTokenWithAmount, @NotNull InvestTipsBean investTipsBean, java.lang.Integer num, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(investTipsBean, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.AYXKKw = i;
            this.KWHzl = str;
            this.EZpvd = str2;
            this.AEQbTJ = list;
            this.gEmmrt = list2;
            this.djBIcL = investTokenWithAmount;
            this.valueOf = investTipsBean;
            this.copydefault = num;
            this.OLrzqt = detailItemType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r15v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r24v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001a: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r19v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x002b: ARITH (r24v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r20v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipsBean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004c: CONSTRUCTOR 
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:162) call: com.okinc.business.invest_biz.data.bean.InvestTipsBean.<init>(int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r21v0 com.okinc.business.invest_biz.data.bean.InvestTipsBean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0052: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r22v0 java.lang.Integer))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:?: TERNARY null = ((wrap:int:0x005e: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0062: SGET  A[WRAPPED] (LINE:164) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.TRANSACTION_PATH com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType) : (r23v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType))
 A[MD:(int, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.bean.InvestTipsBean, java.lang.Integer, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void (m)] (LINE:155) call: o.iXu.VoiceInteractor.<init>(int, java.lang.String, java.lang.String, java.util.List, java.util.List, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.bean.InvestTipsBean, java.lang.Integer, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void type: THIS */
        public /* synthetic */ VoiceInteractor(int i, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, InvestTokenWithAmount investTokenWithAmount, InvestTipsBean investTipsBean, java.lang.Integer num, DetailItemType detailItemType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : list2, (i2 & 32) == 0 ? investTokenWithAmount : null, (i2 & 64) != 0 ? new InvestTipsBean(0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null) : investTipsBean, (i2 & 128) != 0 ? 0 : num, (i2 & 256) != 0 ? DetailItemType.TRANSACTION_PATH : detailItemType);
        }
    }

    /* JADX INFO: renamed from: o.iXu$Dialog */
    public static final class Dialog implements InterfaceC24178iXu {
        public final java.lang.String AEQbTJ;
        public final int AYXKKw;
        public final boolean AhwBna;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final DisplayText OLrzqt;
        public final DetailItemType copydefault;
        public final int djBIcL;
        public final boolean gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DisplayText AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog EZpvd(int i, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, boolean z, int i2, @NotNull java.lang.String str4, boolean z2, DisplayText displayText, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new Dialog(i, str, str2, str3, z, i2, str4, z2, displayText, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj;
            return this.AYXKKw == dialog.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) dialog.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) dialog.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) dialog.EZpvd) && this.gEmmrt == dialog.gEmmrt && this.djBIcL == dialog.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) dialog.valueOf) && this.AhwBna == dialog.AhwBna && Intrinsics.EZpvd(this.OLrzqt, dialog.OLrzqt) && this.copydefault == dialog.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.AYXKKw);
            int iHashCode2 = this.KWHzl.hashCode();
            java.lang.String str = this.AEQbTJ;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            int iHashCode4 = this.EZpvd.hashCode();
            int iHashCode5 = java.lang.Boolean.hashCode(this.gEmmrt);
            int iHashCode6 = java.lang.Integer.hashCode(this.djBIcL);
            int iHashCode7 = this.valueOf.hashCode();
            int iHashCode8 = java.lang.Boolean.hashCode(this.AhwBna);
            DisplayText displayText = this.OLrzqt;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (displayText != null ? displayText.hashCode() : 0)) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NetworkDetailInfo(state=" + this.AYXKKw + ", network=" + this.KWHzl + ", logo=" + this.AEQbTJ + ", slippage=" + this.EZpvd + ", supportSwitchGear=" + this.gEmmrt + ", slippageState=" + this.djBIcL + ", slippageTips=" + this.valueOf + ", slippageWarn=" + this.AhwBna + ", slippageInfoTip=" + this.OLrzqt + ", itemType=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.AYXKKw;
        }

        public Dialog(int i, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, boolean z, int i2, @NotNull java.lang.String str4, boolean z2, DisplayText displayText, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.AYXKKw = i;
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.EZpvd = str3;
            this.gEmmrt = z;
            this.djBIcL = i2;
            this.valueOf = str4;
            this.AhwBna = z2;
            this.OLrzqt = displayText;
            this.copydefault = detailItemType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004d: CONSTRUCTOR 
  (r15v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r19v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002e: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.bean.DisplayText:?: TERNARY null = ((wrap:int:0x0036: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.DisplayText) : (r23v0 com.okinc.business.invest_biz.data.bean.DisplayText))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:?: TERNARY null = ((wrap:int:0x003f: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: SGET  A[WRAPPED] (LINE:177) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.NETWORK_SLIPPAGE com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType) : (r24v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, boolean, com.okinc.business.invest_biz.data.bean.DisplayText, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void (m)] (LINE:167) call: o.iXu.Dialog.<init>(int, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, boolean, com.okinc.business.invest_biz.data.bean.DisplayText, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void type: THIS */
        public /* synthetic */ Dialog(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i2, java.lang.String str4, boolean z2, DisplayText displayText, DetailItemType detailItemType, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? "" : str, str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? true : z, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str4, (i3 & 128) != 0 ? false : z2, (i3 & 256) != 0 ? null : displayText, (i3 & 512) != 0 ? DetailItemType.NETWORK_SLIPPAGE : detailItemType);
        }
    }

    /* JADX INFO: renamed from: o.iXu$PendingIntent */
    public static final class PendingIntent implements InterfaceC24178iXu {
        public final InvestTransactionLossInfo KWHzl;
        public final DetailItemType OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, InvestTransactionLossInfo investTransactionLossInfo, DetailItemType detailItemType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                investTransactionLossInfo = pendingIntent.KWHzl;
            }
            if ((i & 2) != 0) {
                detailItemType = pendingIntent.OLrzqt;
            }
            return pendingIntent.KWHzl(investTransactionLossInfo, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTransactionLossInfo KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent KWHzl(@NotNull InvestTransactionLossInfo investTransactionLossInfo, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(investTransactionLossInfo, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new PendingIntent(investTransactionLossInfo, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingIntent)) {
                return false;
            }
            PendingIntent pendingIntent = (PendingIntent) obj;
            return Intrinsics.EZpvd(this.KWHzl, pendingIntent.KWHzl) && this.OLrzqt == pendingIntent.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TransactionLossInfo(transactionLoss=" + this.KWHzl + ", itemType=" + this.OLrzqt + ")";
        }

        public PendingIntent(@NotNull InvestTransactionLossInfo investTransactionLossInfo, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(investTransactionLossInfo, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.KWHzl = investTransactionLossInfo;
            this.OLrzqt = detailItemType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo)
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:0x0004: SGET  A[WRAPPED] (LINE:182) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.TRANSACTION_LOSS com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType) : (r2v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void (m)] (LINE:180) call: o.iXu.PendingIntent.<init>(com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void type: THIS */
        public /* synthetic */ PendingIntent(InvestTransactionLossInfo investTransactionLossInfo, DetailItemType detailItemType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(investTransactionLossInfo, (i & 2) != 0 ? DetailItemType.TRANSACTION_LOSS : detailItemType);
        }
    }

    /* JADX INFO: renamed from: o.iXu$PictureInPictureParams */
    public static final class PictureInPictureParams implements InterfaceC24178iXu {
        public final BorrowedInfo AEQbTJ;
        public final DetailItemType KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PictureInPictureParams copy$default(PictureInPictureParams pictureInPictureParams, BorrowedInfo borrowedInfo, DetailItemType detailItemType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                borrowedInfo = pictureInPictureParams.AEQbTJ;
            }
            if ((i & 2) != 0) {
                detailItemType = pictureInPictureParams.KWHzl;
            }
            return pictureInPictureParams.OLrzqt(borrowedInfo, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BorrowedInfo KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PictureInPictureParams OLrzqt(@NotNull BorrowedInfo borrowedInfo, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(borrowedInfo, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new PictureInPictureParams(borrowedInfo, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PictureInPictureParams)) {
                return false;
            }
            PictureInPictureParams pictureInPictureParams = (PictureInPictureParams) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, pictureInPictureParams.AEQbTJ) && this.KWHzl == pictureInPictureParams.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TransactionRepayBorrowed(borrowed=" + this.AEQbTJ + ", itemType=" + this.KWHzl + ")";
        }

        public PictureInPictureParams(@NotNull BorrowedInfo borrowedInfo, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(borrowedInfo, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.AEQbTJ = borrowedInfo;
            this.KWHzl = detailItemType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 com.okinc.business.invest_biz.data.bean.BorrowedInfo)
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:0x0004: SGET  A[WRAPPED] (LINE:187) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.REPAY_BORROWED com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType) : (r2v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType))
 A[MD:(com.okinc.business.invest_biz.data.bean.BorrowedInfo, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void (m)] (LINE:185) call: o.iXu.PictureInPictureParams.<init>(com.okinc.business.invest_biz.data.bean.BorrowedInfo, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void type: THIS */
        public /* synthetic */ PictureInPictureParams(BorrowedInfo borrowedInfo, DetailItemType detailItemType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(borrowedInfo, (i & 2) != 0 ? DetailItemType.REPAY_BORROWED : detailItemType);
        }
    }

    /* JADX INFO: renamed from: o.iXu$Activity */
    public static final class Activity implements InterfaceC24178iXu {
        public final int AEQbTJ;
        public final java.util.List<InvestTokenWithAmount> AYXKKw;
        public final java.lang.String AhwBna;
        public final boolean EZpvd;
        public final DetailItemType KWHzl;
        public final boolean OLrzqt;
        public final boolean copydefault;
        public final int gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InvestTokenWithAmount> KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@androidx.annotation.StringRes int i, @NotNull java.util.List<InvestTokenWithAmount> list, int i2, boolean z, boolean z2, @NotNull DetailItemType detailItemType, boolean z3, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new Activity(i, list, i2, z, z2, detailItemType, z3, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.gEmmrt == activity.gEmmrt && Intrinsics.EZpvd(this.AYXKKw, activity.AYXKKw) && this.AEQbTJ == activity.AEQbTJ && this.EZpvd == activity.EZpvd && this.copydefault == activity.copydefault && this.KWHzl == activity.KWHzl && this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) activity.AhwBna);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.gEmmrt);
            int iHashCode2 = this.AYXKKw.hashCode();
            int iHashCode3 = java.lang.Integer.hashCode(this.AEQbTJ);
            int iHashCode4 = java.lang.Boolean.hashCode(this.EZpvd);
            int iHashCode5 = java.lang.Boolean.hashCode(this.copydefault);
            int iHashCode6 = this.KWHzl.hashCode();
            int iHashCode7 = java.lang.Boolean.hashCode(this.OLrzqt);
            java.lang.String str = this.AhwBna;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BorrowReceiveTokensInfo(titleRes=" + this.gEmmrt + ", tokens=" + this.AYXKKw + ", investType=" + this.AEQbTJ + ", isSupportSwap=" + this.EZpvd + ", isSupportLock=" + this.copydefault + ", itemType=" + this.KWHzl + ", isInit=" + this.OLrzqt + ", warningMessage=" + this.AhwBna + ")";
        }

        public Activity(@androidx.annotation.StringRes int i, @NotNull java.util.List<InvestTokenWithAmount> list, int i2, boolean z, boolean z2, @NotNull DetailItemType detailItemType, boolean z3, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.gEmmrt = i;
            this.AYXKKw = list;
            this.AEQbTJ = i2;
            this.EZpvd = z;
            this.copydefault = z2;
            this.KWHzl = detailItemType;
            this.OLrzqt = z3;
            this.AhwBna = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (r12v0 int)
  (r13v0 java.util.List)
  (r14v0 int)
  (r15v0 boolean)
  (r16v0 boolean)
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:196) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.RECEIVE_TOKEN com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType) : (r17v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
 A[MD:(int, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, int, boolean, boolean, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType, boolean, java.lang.String):void (m)] (LINE:190) call: o.iXu.Activity.<init>(int, java.util.List, int, boolean, boolean, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType, boolean, java.lang.String):void type: THIS */
        public /* synthetic */ Activity(int i, java.util.List list, int i2, boolean z, boolean z2, DetailItemType detailItemType, boolean z3, java.lang.String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, list, i2, z, z2, (i3 & 32) != 0 ? DetailItemType.RECEIVE_TOKEN : detailItemType, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: o.iXu$Fragment */
    public static final class Fragment implements InterfaceC24178iXu {
        public final InvestTokenWithAmount AEQbTJ;
        public final InvestTokenWithAmount EZpvd;
        public final DetailItemType OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, java.lang.String str, InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, DetailItemType detailItemType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragment.copydefault;
            }
            if ((i & 2) != 0) {
                investTokenWithAmount = fragment.EZpvd;
            }
            if ((i & 4) != 0) {
                investTokenWithAmount2 = fragment.AEQbTJ;
            }
            if ((i & 8) != 0) {
                detailItemType = fragment.OLrzqt;
            }
            return fragment.AEQbTJ(str, investTokenWithAmount, investTokenWithAmount2, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTokenWithAmount AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment AEQbTJ(@NotNull java.lang.String str, InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new Fragment(str, investTokenWithAmount, investTokenWithAmount2, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTokenWithAmount KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fragment)) {
                return false;
            }
            Fragment fragment = (Fragment) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) fragment.copydefault) && Intrinsics.EZpvd(this.EZpvd, fragment.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, fragment.AEQbTJ) && this.OLrzqt == fragment.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            InvestTokenWithAmount investTokenWithAmount = this.EZpvd;
            int iHashCode2 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
            InvestTokenWithAmount investTokenWithAmount2 = this.AEQbTJ;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (investTokenWithAmount2 != null ? investTokenWithAmount2.hashCode() : 0)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RemainingRepayment(userInputAmount=" + this.copydefault + ", remainingRepayment=" + this.EZpvd + ", realRemainingRepayment=" + this.AEQbTJ + ", itemType=" + this.OLrzqt + ")";
        }

        public Fragment(@NotNull java.lang.String str, InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.copydefault = str;
            this.EZpvd = investTokenWithAmount;
            this.AEQbTJ = investTokenWithAmount2;
            this.OLrzqt = detailItemType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount)
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r3v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:0x0009: SGET  A[WRAPPED] (LINE:205) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.REMAINING_REPAYMENT com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType) : (r4v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType))
 A[MD:(java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void (m)] (LINE:201) call: o.iXu.Fragment.<init>(java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void type: THIS */
        public /* synthetic */ Fragment(java.lang.String str, InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, DetailItemType detailItemType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, investTokenWithAmount, (i & 4) != 0 ? null : investTokenWithAmount2, (i & 8) != 0 ? DetailItemType.REMAINING_REPAYMENT : detailItemType);
        }
    }

    /* JADX INFO: renamed from: o.iXu$LoaderManager */
    public static final class LoaderManager implements InterfaceC24178iXu {
        public final boolean AEQbTJ;
        public final int AhwBna;
        public final boolean EZpvd;
        public final int KWHzl;
        public final boolean OLrzqt;
        public final DetailItemType copydefault;
        public final java.lang.String djBIcL;
        public final java.util.List<InvestTokenWithAmount> gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InvestTokenWithAmount> copydefault() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager copydefault(@androidx.annotation.StringRes int i, @NotNull java.util.List<InvestTokenWithAmount> list, int i2, boolean z, boolean z2, @NotNull DetailItemType detailItemType, boolean z3, java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new LoaderManager(i, list, i2, z, z2, detailItemType, z3, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoaderManager)) {
                return false;
            }
            LoaderManager loaderManager = (LoaderManager) obj;
            return this.AhwBna == loaderManager.AhwBna && Intrinsics.EZpvd(this.gEmmrt, loaderManager.gEmmrt) && this.KWHzl == loaderManager.KWHzl && this.EZpvd == loaderManager.EZpvd && this.AEQbTJ == loaderManager.AEQbTJ && this.copydefault == loaderManager.copydefault && this.OLrzqt == loaderManager.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) loaderManager.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) loaderManager.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.AhwBna);
            int iHashCode2 = this.gEmmrt.hashCode();
            int iHashCode3 = java.lang.Integer.hashCode(this.KWHzl);
            int iHashCode4 = java.lang.Boolean.hashCode(this.EZpvd);
            int iHashCode5 = java.lang.Boolean.hashCode(this.AEQbTJ);
            int iHashCode6 = this.copydefault.hashCode();
            int iHashCode7 = java.lang.Boolean.hashCode(this.OLrzqt);
            java.lang.String str = this.valueOf;
            int iHashCode8 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.djBIcL;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RedeemReceiveTokensInfo(titleRes=" + this.AhwBna + ", tokens=" + this.gEmmrt + ", investType=" + this.KWHzl + ", isSupportSwap=" + this.EZpvd + ", isSupportLock=" + this.AEQbTJ + ", itemType=" + this.copydefault + ", isInit=" + this.OLrzqt + ", warningMessage=" + this.valueOf + ", v3ZapCoinAmountFormatted=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.AEQbTJ;
        }

        public LoaderManager(@androidx.annotation.StringRes int i, @NotNull java.util.List<InvestTokenWithAmount> list, int i2, boolean z, boolean z2, @NotNull DetailItemType detailItemType, boolean z3, java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.AhwBna = i;
            this.gEmmrt = list;
            this.KWHzl = i2;
            this.EZpvd = z;
            this.AEQbTJ = z2;
            this.copydefault = detailItemType;
            this.OLrzqt = z3;
            this.valueOf = str;
            this.djBIcL = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
  (r13v0 int)
  (r14v0 java.util.List)
  (r15v0 int)
  (r16v0 boolean)
  (r17v0 boolean)
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:214) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.RECEIVE_TOKEN com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType) : (r18v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
 A[MD:(int, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, int, boolean, boolean, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType, boolean, java.lang.String, java.lang.String):void (m)] (LINE:208) call: o.iXu.LoaderManager.<init>(int, java.util.List, int, boolean, boolean, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType, boolean, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ LoaderManager(int i, java.util.List list, int i2, boolean z, boolean z2, DetailItemType detailItemType, boolean z3, java.lang.String str, java.lang.String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, list, i2, z, z2, (i3 & 32) != 0 ? DetailItemType.RECEIVE_TOKEN : detailItemType, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? null : str, (i3 & 256) != 0 ? null : str2);
        }
    }

    /* JADX INFO: renamed from: o.iXu$FragmentManager */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class FragmentManager implements InterfaceC24178iXu {
        public final C26741jhz AEQbTJ;
        public final DetailItemType OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, C26741jhz c26741jhz, DetailItemType detailItemType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c26741jhz = fragmentManager.AEQbTJ;
            }
            if ((i & 2) != 0) {
                detailItemType = fragmentManager.OLrzqt;
            }
            return fragmentManager.AEQbTJ(c26741jhz, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager AEQbTJ(@NotNull C26741jhz c26741jhz, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(c26741jhz, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new FragmentManager(c26741jhz, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C26741jhz copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FragmentManager)) {
                return false;
            }
            FragmentManager fragmentManager = (FragmentManager) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, fragmentManager.AEQbTJ) && this.OLrzqt == fragmentManager.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PointSectionInfo(points=" + this.AEQbTJ + ", itemType=" + this.OLrzqt + ")";
        }

        public FragmentManager(@NotNull C26741jhz c26741jhz, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(c26741jhz, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.AEQbTJ = c26741jhz;
            this.OLrzqt = detailItemType;
        }
    }

    /* JADX INFO: renamed from: o.iXu$TaskStackBuilder */
    public static final class TaskStackBuilder implements InterfaceC24178iXu {
        private static short[] fJNWhG;
        public final boolean AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final DetailItemType copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String gEmmrt;
        public final java.lang.String valueOf;
        private static final byte[] $$a = {1, Ascii.US, 50, -112};
        private static final int $$b = CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int AuCTel = 0;
        private static int fARcdN = 1;
        private static char[] DbNXlk = {11821, 11794, 11799, 11797, 11783, 11804, 11837, 11792, 11793, 11800, 11787, 11796, 11847, 11789, 11798, 11831, 11803, 11784, 11802, 11814, 11854, 11790, 11836, 11839, 11801, 11823, 11851, 11856, 11827, 11807, 11788, 11795, 11805, 11782, 11786, 11822};
        private static char values = 7138;
        private static int fetchVPNInfo = 1946488145;
        private static int AkhnZx = 1640963139;
        private static int isConnected = -536134929;
        private static byte[] ejfBZ = {43, 49, Ascii.ETB, 50, -31, Ascii.SYN, Ascii.ETB, Ascii.DC4, 59, 19, 68, 45, Ascii.ESC, 78, -20, Ascii.US, 62, Ascii.DC4, 72, 77, -43, Ascii.SYN, Ascii.ETB, Ascii.DC4, 59, 19, 68, 45, Ascii.SUB, 38, -1, Ascii.RS, -12, 40, 45, -75, -10, -9, -12, Ascii.ESC, -13, 36, Ascii.CR, -6, 6, Ascii.DC2, -63, -10, -9, -12, Ascii.ESC, -13, 36, Ascii.CR, -5, 46, -48, Ascii.VT, 17, -9, -74, -33, -71, -52, -53, -26, -35, 112, -52, -63, -71, -52, -53, -58, -3, UnsignedBytes.MAX_POWER_OF_TWO, -73, -80, -75, -60, -68, -59, -10, -27, -3, -24, -10, Ascii.SI, -45, -27, -3, -19, -13, -7, 10, -57, -12, -27, -26, 10, 3, -43, -8, -16, -32, -10, -4, Ascii.CR, -38, Ascii.SI, -8, -20, -35, 8, -55, -41, -17, -33, -19, -21, -28, Ascii.VT, -108, -48, 43, -109, -17, -20, -60, -17, -42, -31, Ascii.CAN, -93, -46, -45, -48, -25, -33, -32, 79, 75, 51, 69, 52, 83, Ascii.NAK, 37, 91, 48, 60, 75, 49, 57, 52, 65, 84, 89, -4, 52, 65, 52, 121, -7, 73, 67, Utf8.REPLACEMENT_BYTE, 49, 68, 48, 36, -119, 1, 35, 89, Utf8.REPLACEMENT_BYTE, 48, 37, 77, 45, 49, 53, 85, 5, 67, 60, 84, -118, 103, 99, 122, 96, 104, 123, 112, -101, 115, 124, 98, SignedBytes.MAX_POWER_OF_TWO, -109, 35, 123, 112, 123, -88, 40, 120, 114, 110, 96, -117, 103, 107, -72, 48, 82, -120, 110, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$c(short s, byte b, short s2) {
            int i;
            int i2;
            int i3 = 120 - s2;
            int i4 = 1 - (b * 4);
            byte[] bArr = $$a;
            int i5 = (s * 3) + 4;
            byte[] bArr2 = new byte[i4];
            if (bArr == 0) {
                int i6 = i3;
                i2 = 0;
                int i7 = i5;
                int i8 = i5 + (-i6);
                int i9 = i7 + 1;
                i = i2;
                i3 = i8;
                i5 = i9;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i4) {
                    return new java.lang.String(bArr2, 0);
                }
                i6 = bArr[i5];
                int i10 = i3;
                i7 = i5;
                i5 = i10;
                int i82 = i5 + (-i6);
                int i92 = i7 + 1;
                i = i2;
                i3 = i82;
                i5 = i92;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i4) {
                }
            } else {
                i = 0;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i4) {
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder() {
            this(null, null, null, null, null, null, false, false, false, null, 1023, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskStackBuilder copy$default(TaskStackBuilder taskStackBuilder, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z, boolean z2, boolean z3, DetailItemType detailItemType, int i, java.lang.Object obj) {
            java.lang.String str7;
            java.lang.String str8;
            boolean z4;
            int i2 = 2 % 2;
            int i3 = fARcdN;
            int i4 = i3 + 91;
            AuCTel = i4 % 128;
            if (i4 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) {
                str7 = str;
            } else {
                int i5 = i3 + 3;
                AuCTel = i5 % 128;
                if (i5 % 2 != 0) {
                    str7 = taskStackBuilder.djBIcL;
                    int i6 = 34 / 0;
                } else {
                    str7 = taskStackBuilder.djBIcL;
                }
            }
            if ((i & 2) != 0) {
                int i7 = AuCTel + 125;
                fARcdN = i7 % 128;
                if (i7 % 2 == 0) {
                    java.lang.String str9 = taskStackBuilder.EZpvd;
                    throw null;
                }
                str8 = taskStackBuilder.EZpvd;
            } else {
                str8 = str2;
            }
            java.lang.String str10 = (i & 4) != 0 ? taskStackBuilder.AYXKKw : str3;
            java.lang.String str11 = (i & 8) != 0 ? taskStackBuilder.AhwBna : str4;
            java.lang.String str12 = (i & 16) != 0 ? taskStackBuilder.valueOf : str5;
            java.lang.String str13 = (i & 32) != 0 ? taskStackBuilder.gEmmrt : str6;
            boolean z5 = (i & 64) != 0 ? taskStackBuilder.OLrzqt : z;
            if ((i & 128) != 0) {
                z4 = taskStackBuilder.AEQbTJ;
                int i8 = fARcdN + 73;
                AuCTel = i8 % 128;
                int i9 = i8 % 2;
            } else {
                z4 = z2;
            }
            return taskStackBuilder.KWHzl(str7, str8, str10, str11, str12, str13, z5, z4, (i & 256) != 0 ? taskStackBuilder.KWHzl : z3, (i & 512) != 0 ? taskStackBuilder.copydefault : detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            int i = 2 % 2;
            int i2 = fARcdN + 13;
            int i3 = i2 % 128;
            AuCTel = i3;
            int i4 = i2 % 2;
            java.lang.String str = this.AhwBna;
            int i5 = i3 + 45;
            fARcdN = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            int i = 2 % 2;
            int i2 = AuCTel + 57;
            int i3 = i2 % 128;
            fARcdN = i3;
            int i4 = i2 % 2;
            java.lang.String str = this.gEmmrt;
            int i5 = i3 + 83;
            AuCTel = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            DetailItemType detailItemType;
            int i = 2 % 2;
            int i2 = fARcdN + 95;
            int i3 = i2 % 128;
            AuCTel = i3;
            if (i2 % 2 != 0) {
                detailItemType = this.copydefault;
                int i4 = 21 / 0;
            } else {
                detailItemType = this.copydefault;
            }
            int i5 = i3 + 91;
            fARcdN = i5 % 128;
            int i6 = i5 % 2;
            return detailItemType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            int i = 2 % 2;
            int i2 = fARcdN + 33;
            int i3 = i2 % 128;
            AuCTel = i3;
            int i4 = i2 % 2;
            java.lang.String str = this.djBIcL;
            int i5 = i3 + 93;
            fARcdN = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskStackBuilder KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z, boolean z2, boolean z3, @NotNull DetailItemType detailItemType) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            TaskStackBuilder taskStackBuilder = new TaskStackBuilder(str, str2, str3, str4, str5, str6, z, z2, z3, detailItemType);
            int i2 = AuCTel + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            fARcdN = i2 % 128;
            if (i2 % 2 != 0) {
                return taskStackBuilder;
            }
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            java.lang.String str;
            int i = 2 % 2;
            int i2 = AuCTel + 37;
            int i3 = i2 % 128;
            fARcdN = i3;
            if (i2 % 2 == 0) {
                str = this.AYXKKw;
                int i4 = 47 / 0;
            } else {
                str = this.AYXKKw;
            }
            int i5 = i3 + 27;
            AuCTel = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 38 / 0;
            }
            return str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            int i = 2 % 2;
            int i2 = AuCTel + 89;
            int i3 = i2 % 128;
            fARcdN = i3;
            int i4 = i2 % 2;
            java.lang.String str = this.valueOf;
            int i5 = i3 + 99;
            AuCTel = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskStackBuilder)) {
                int i2 = AuCTel + 27;
                fARcdN = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            TaskStackBuilder taskStackBuilder = (TaskStackBuilder) obj;
            if (!Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) taskStackBuilder.djBIcL)) {
                int i4 = AuCTel + 119;
                fARcdN = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskStackBuilder.EZpvd) || !Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) taskStackBuilder.AYXKKw) || !Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) taskStackBuilder.AhwBna) || !Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) taskStackBuilder.valueOf)) {
                return false;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) taskStackBuilder.gEmmrt)) {
                int i6 = AuCTel + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                fARcdN = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.OLrzqt != taskStackBuilder.OLrzqt || this.AEQbTJ != taskStackBuilder.AEQbTJ) {
                return false;
            }
            if (this.KWHzl != taskStackBuilder.KWHzl) {
                int i8 = AuCTel + 115;
                fARcdN = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (this.copydefault == taskStackBuilder.copydefault) {
                return true;
            }
            int i10 = AuCTel + 45;
            fARcdN = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int i = 2 % 2;
            int i2 = fARcdN + 31;
            AuCTel = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((((((((((this.djBIcL.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + this.copydefault.hashCode();
            int i4 = fARcdN + 31;
            AuCTel = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            int i = 2 % 2;
            java.lang.String str = "Univ3PriceRangeBean(name=" + this.djBIcL + ", fee=" + this.EZpvd + ", token0=" + this.AYXKKw + ", token1=" + this.AhwBna + ", lower=" + this.valueOf + ", upper=" + this.gEmmrt + ", isInit=" + this.OLrzqt + ", isDataErro=" + this.AEQbTJ + ", isActive=" + this.KWHzl + ", itemType=" + this.copydefault + ")";
            int i2 = fARcdN + 39;
            AuCTel = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 9 / 0;
            }
            return str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            int i = 2 % 2;
            int i2 = AuCTel;
            int i3 = i2 + 83;
            fARcdN = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.KWHzl;
            int i5 = i2 + 115;
            fARcdN = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 55 / 0;
            }
            return z;
        }

        public TaskStackBuilder(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z, boolean z2, boolean z3, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.djBIcL = str;
            this.EZpvd = str2;
            this.AYXKKw = str3;
            this.AhwBna = str4;
            this.valueOf = str5;
            this.gEmmrt = str6;
            this.OLrzqt = z;
            this.AEQbTJ = z2;
            this.KWHzl = z3;
            this.copydefault = detailItemType;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ TaskStackBuilder(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z, boolean z2, boolean z3, DetailItemType detailItemType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            java.lang.String str7;
            java.lang.String str8;
            java.lang.String str9;
            DetailItemType detailItemType2;
            java.lang.Object obj = null;
            if ((i & 1) != 0) {
                int i2 = fARcdN + 79;
                AuCTel = i2 % 128;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i3 = 2 % 2;
                str7 = "";
            } else {
                str7 = str;
            }
            java.lang.String str10 = (i & 2) != 0 ? "" : str2;
            java.lang.String str11 = (i & 4) != 0 ? "" : str3;
            if ((i & 8) != 0) {
                int i4 = fARcdN + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                AuCTel = i4 % 128;
                int i5 = i4 % 2;
                str8 = "";
            } else {
                str8 = str4;
            }
            if ((i & 16) != 0) {
                int i6 = AuCTel + 91;
                fARcdN = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                int i7 = 2 % 2;
                str9 = "";
            } else {
                str9 = str5;
            }
            java.lang.String str12 = (i & 32) == 0 ? str6 : "";
            boolean z4 = (i & 64) != 0 ? true : z;
            boolean z5 = false;
            boolean z6 = (i & 128) != 0 ? false : z2;
            if ((i & 256) != 0) {
                int i8 = AuCTel + 61;
                fARcdN = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            } else {
                z5 = z3;
            }
            if ((i & 512) != 0) {
                detailItemType2 = DetailItemType.V3_PRICE_RANGE;
                int i11 = 2 % 2;
            } else {
                detailItemType2 = detailItemType;
            }
            this(str7, str10, str11, str8, str9, str12, z4, z6, z5, detailItemType2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [235=7] */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01d2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, int i, byte b, int i2, int i3, java.lang.Object[] objArr) throws java.lang.Throwable {
            int i4;
            int i5 = 2 % 2;
            Zj zj = new Zj();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(AkhnZx)};
                java.lang.Object objEZpvd = YY.EZpvd(-1048485176);
                if (objEZpvd == null) {
                    objEZpvd = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).intValue();
                boolean z = iIntValue == -1;
                if (z) {
                    byte[] bArr = ejfBZ;
                    if (bArr != null) {
                        int i6 = $11 + 87;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i8 = 0;
                        while (i8 < length) {
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i8])};
                            java.lang.Object objEZpvd2 = YY.EZpvd(1815080187);
                            if (objEZpvd2 == null) {
                                objEZpvd2 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            bArr2[i8] = ((java.lang.Byte) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).byteValue();
                            i8++;
                            int i9 = $10 + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                            $11 = i9 % 128;
                            int i10 = i9 % 2;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i11 = $10 + 97;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        byte[] bArr3 = ejfBZ;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(fetchVPNInfo)};
                        java.lang.Object objEZpvd3 = YY.EZpvd(-1048485176);
                        if (objEZpvd3 == null) {
                            objEZpvd3 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue()]) ^ (-2166281683126510581L))) + ((int) (((long) AkhnZx) ^ (-2166281683126510581L))));
                    } else {
                        iIntValue = (short) (((short) (((long) fJNWhG[i3 + ((int) (((long) fetchVPNInfo) ^ (-2166281683126510581L)))]) ^ (-2166281683126510581L))) + ((int) (((long) AkhnZx) ^ (-2166281683126510581L))));
                    }
                }
                if (iIntValue > 0) {
                    int i13 = ((i3 + iIntValue) - 2) + ((int) (((long) fetchVPNInfo) ^ (-2166281683126510581L)));
                    if (z) {
                        int i14 = $11 + 53;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    zj.OLrzqt = i13 + i4;
                    java.lang.Object[] objArr5 = {zj, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(isConnected), sb};
                    java.lang.Object objEZpvd4 = YY.EZpvd(-2015189563);
                    if (objEZpvd4 == null) {
                        byte b2 = (byte) ($$a[0] - 1);
                        byte b3 = b2;
                        objEZpvd4 = YY.EZpvd(180, 4, (char) 19181, -2084411207, false, $$c(b2, b3, (byte) (b3 | 9)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                    }
                    ((java.lang.StringBuilder) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).append(zj.EZpvd);
                    zj.AEQbTJ = zj.EZpvd;
                    byte[] bArr4 = ejfBZ;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i16 = 0;
                        while (i16 < length2) {
                            bArr5[i16] = (byte) (((long) bArr4[i16]) ^ (-2166281683126510581L));
                            i16++;
                            int i17 = $11 + 41;
                            $10 = i17 % 128;
                            int i18 = i17 % 2;
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i19 = $10 + 49;
                        $11 = i19 % 128;
                        boolean z2 = i19 % 2 != 0;
                        zj.KWHzl = 1;
                        int i20 = $11 + 85;
                        $10 = i20 % 128;
                        if (i20 % 2 != 0) {
                            int i21 = 5 % 4;
                        }
                        while (zj.KWHzl < iIntValue) {
                            if (z2) {
                                byte[] bArr6 = ejfBZ;
                                zj.OLrzqt = zj.OLrzqt - 1;
                                zj.EZpvd = (char) (zj.AEQbTJ + (((byte) (((byte) (((long) bArr6[r7]) ^ (-2166281683126510581L))) + s)) ^ b));
                            } else {
                                short[] sArr = fJNWhG;
                                zj.OLrzqt = zj.OLrzqt - 1;
                                zj.EZpvd = (char) (zj.AEQbTJ + (((short) (((short) (((long) sArr[r7]) ^ (-2166281683126510581L))) + s)) ^ b));
                            }
                            sb.append(zj.EZpvd);
                            zj.AEQbTJ = zj.EZpvd;
                            zj.KWHzl++;
                        }
                    }
                }
                objArr[0] = sb.toString();
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [195=4, 273=7] */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        private static void b(int i, byte b, char[] cArr, java.lang.Object[] objArr) throws java.lang.Throwable {
            int i2;
            java.lang.Object obj;
            int i3 = 2;
            int i4 = 2 % 2;
            Zg zg = new Zg();
            char[] cArr2 = DbNXlk;
            java.lang.Object obj2 = null;
            if (cArr2 != null) {
                int i5 = $10 + 11;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 19;
                    $11 = i8 % 128;
                    int i9 = i8 % i3;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i7])};
                        java.lang.Object objEZpvd = YY.EZpvd(555755035);
                        if (objEZpvd == null) {
                            byte b2 = (byte) ($$a[0] - 1);
                            byte b3 = b2;
                            objEZpvd = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        cArr3[i7] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                        i7++;
                        i3 = 2;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(values)};
            java.lang.Object objEZpvd2 = YY.EZpvd(555755035);
            if (objEZpvd2 == null) {
                byte b4 = (byte) ($$a[0] - 1);
                byte b5 = b4;
                objEZpvd2 = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$c(b4, b5, b5), new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            char cCharValue = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                zg.KWHzl = 0;
                int i10 = $11 + 97;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 2 / 2;
                }
                while (zg.KWHzl < i2) {
                    zg.AEQbTJ = cArr[zg.KWHzl];
                    zg.OLrzqt = cArr[zg.KWHzl + 1];
                    if (zg.AEQbTJ == zg.OLrzqt) {
                        cArr4[zg.KWHzl] = (char) (zg.AEQbTJ - b);
                        cArr4[zg.KWHzl + 1] = (char) (zg.OLrzqt - b);
                        obj = obj2;
                    } else {
                        java.lang.Object[] objArr4 = {zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg};
                        java.lang.Object objEZpvd3 = YY.EZpvd(-526958001);
                        if (objEZpvd3 == null) {
                            byte b6 = (byte) ($$a[0] - 1);
                            byte b7 = b6;
                            objEZpvd3 = YY.EZpvd(491, 5, (char) 30951, -457732301, false, $$c(b6, b7, (byte) (b7 | 52)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                        }
                        if (((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue() == zg.djBIcL) {
                            try {
                                java.lang.Object[] objArr5 = {zg, zg, java.lang.Integer.valueOf(cCharValue), java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), java.lang.Integer.valueOf(cCharValue), zg, java.lang.Integer.valueOf(cCharValue), zg};
                                java.lang.Object objEZpvd4 = YY.EZpvd(1348337226);
                                if (objEZpvd4 == null) {
                                    byte b8 = (byte) ($$a[0] - 1);
                                    byte b9 = b8;
                                    objEZpvd4 = YY.EZpvd(221, 5, (char) 3937, 1417491254, false, $$c(b8, b9, (byte) (b9 | 55)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                                }
                                obj = null;
                                int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).intValue();
                                int i12 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                cArr4[zg.KWHzl] = cArr2[iIntValue];
                                cArr4[zg.KWHzl + 1] = cArr2[i12];
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            obj = null;
                            if (zg.copydefault == zg.EZpvd) {
                                int i13 = $11 + 21;
                                $10 = i13 % 128;
                                int i14 = i13 % 2;
                                zg.AYXKKw = ((zg.AYXKKw + cCharValue) - 1) % cCharValue;
                                zg.djBIcL = ((zg.djBIcL + cCharValue) - 1) % cCharValue;
                                int i15 = (zg.copydefault * cCharValue) + zg.AYXKKw;
                                int i16 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                cArr4[zg.KWHzl] = cArr2[i15];
                                cArr4[zg.KWHzl + 1] = cArr2[i16];
                            } else {
                                int i17 = (zg.copydefault * cCharValue) + zg.djBIcL;
                                int i18 = (zg.EZpvd * cCharValue) + zg.AYXKKw;
                                cArr4[zg.KWHzl] = cArr2[i17];
                                cArr4[zg.KWHzl + 1] = cArr2[i18];
                            }
                        }
                    }
                    zg.KWHzl += 2;
                    obj2 = obj;
                }
            }
            int i19 = 0;
            while (i19 < i) {
                int i20 = $11 + 7;
                int i21 = i20 % 128;
                $10 = i21;
                if (i20 % 2 != 0) {
                    cArr4[i19] = (char) (cArr4[i19] ^ 30550);
                    i19 += 43;
                } else {
                    cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                    i19++;
                }
                int i22 = i21 + 117;
                $11 = i22 % 128;
                int i23 = i22 % 2;
            }
            objArr[0] = new java.lang.String(cArr4);
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] OLrzqt(android.content.Context r26, int r27, int r28) {
            /*
                r0 = r26
                r1 = r27
                r2 = r28
                r3 = 2
                int r4 = r3 % r3
                r5 = 3
                r6 = 0
                r7 = 4
                r8 = 0
                r9 = 1
                if (r0 != 0) goto La9
                java.lang.Object[] r0 = new java.lang.Object[r7]
                int[] r7 = new int[r9]
                r0[r8] = r7
                int[] r10 = new int[r9]
                r0[r3] = r10
                int[] r10 = new int[r9]
                r0[r5] = r10
                int[] r10 = (int[]) r10
                r10[r8] = r1
                int[] r7 = (int[]) r7
                r7[r8] = r1
                r0[r9] = r6
                long r5 = android.os.SystemClock.elapsedRealtime()
                int r5 = (int) r5
                int r6 = ~r5
                r7 = 50008428(0x2fb116c, float:3.6891135E-37)
                r7 = r7 | r6
                int r7 = ~r7
                r10 = 17058817(0x1044c01, float:2.42991E-38)
                r10 = r10 | r7
                int r10 = r10 * (-712)
                r11 = -488847775(0xffffffffe2dcc661, float:-2.0362892E21)
                int r11 = r11 + r10
                r10 = -17058818(0xfffffffffefbb3fe, float:-1.672854E38)
                r6 = r6 | r10
                int r6 = ~r6
                r10 = 67067245(0x3ff5d6d, float:1.50090025E-36)
                r5 = r5 | r10
                int r5 = ~r5
                r5 = r5 | r6
                int r5 = r5 * (-712)
                int r11 = r11 + r5
                r5 = -61230126(0xfffffffffc59b3d2, float:-4.5215024E36)
                r5 = r5 | r7
                int r5 = r5 * 712
                int r11 = r11 + r5
                int r5 = r11 * (-139)
                int r5 = -r5
                int r5 = -r5
                int r5 = ~r5
                int r5 = (-1) - r5
                r6 = -1
                r6 = r6 ^ r1
                r6 = r6 | r1
                int r6 = ~r6
                int r6 = r6 * (-280)
                int r5 = r5 + r6
                r6 = -1
                r7 = r6 ^ r1
                r7 = r7 | r1
                int r7 = ~r7
                int r10 = ~r11
                r12 = r10 | r1
                int r12 = ~r12
                r7 = r7 | r12
                int r7 = r7 * 140
                r12 = r5 ^ r7
                r5 = r5 & r7
                int r5 = r5 << r9
                int r12 = r12 + r5
                int r5 = ~r1
                r6 = r6 ^ r5
                r5 = r5 | r6
                r6 = r5 ^ r11
                r5 = r5 & r11
                r5 = r5 | r6
                int r5 = ~r5
                int r1 = ~r1
                r1 = r1 | r10
                int r1 = ~r1
                r6 = r5 ^ r1
                r1 = r1 & r5
                r1 = r1 | r6
                int r1 = r1 * 140
                int r1 = ~r1
                int r12 = r12 - r1
                int r12 = r12 - r9
                int r1 = -r12
                int r1 = -r1
                r5 = r2 ^ r1
                r1 = r1 & r2
                int r1 = r1 << r9
                int r5 = r5 + r1
                int r1 = r5 << 13
                int r2 = ~r1
                r2 = r2 & r5
                int r5 = ~r5
                r1 = r1 & r5
                r1 = r1 | r2
                int r2 = r1 >>> 17
                r5 = r1 & r2
                int r5 = ~r5
                r1 = r1 | r2
                r1 = r1 & r5
                int r2 = r1 << 5
                r5 = r1 & r2
                int r5 = ~r5
                r1 = r1 | r2
                r1 = r1 & r5
                r2 = r0[r3]
                int[] r2 = (int[]) r2
                r2[r8] = r1
                goto L6c9
            La9:
                r10 = 38
                char[] r10 = new char[r10]     // Catch: java.lang.Throwable -> L597
                r10 = {x06da: FILL_ARRAY_DATA , data: [17, 35, 23, 35, 3, 33, 14, 17, 34, 8, 32, 0, 4, 10, 28, 24, 16, 4, 15, 26, 32, 27, 13760, 13760, 25, 21, 32, 26, 23, 32, 32, 0, 8, 31, 3, 20, 25, 5} // fill-array     // Catch: java.lang.Throwable -> L597
                java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L597
                r12 = 38
                r13 = 22
                b(r12, r13, r10, r11)     // Catch: java.lang.Throwable -> L597
                r10 = r11[r8]     // Catch: java.lang.Throwable -> L597
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L597
                java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L597
                java.lang.Object r10 = java.lang.reflect.Array.newInstance(r10, r3)     // Catch: java.lang.Throwable -> L597
                int r11 = o.InterfaceC24178iXu.TaskStackBuilder.fARcdN
                r12 = r11 | 61
                int r12 = r12 << r9
                r11 = r11 ^ 61
                int r12 = r12 - r11
                int r11 = r12 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.AuCTel = r11
                int r12 = r12 % r3
                if (r12 == 0) goto Ldc
                java.lang.Object[] r10 = (java.lang.Object[]) r10     // Catch: java.lang.Throwable -> L597
                r11 = 119(0x77, float:1.67E-43)
                r12 = 73
                r13 = r9
                goto Le3
            Ldc:
                java.lang.Object[] r10 = (java.lang.Object[]) r10     // Catch: java.lang.Throwable -> L597
                r11 = -34
                r12 = -41
                r13 = r8
            Le3:
                r15 = -365564250(0xffffffffea35eea6, float:-5.498564E25)
                r14 = 2117851487(0x7e3bd95f, float:6.2423573E37)
                java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L597
                r16 = r5
                a(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L597
                r5 = r5[r8]     // Catch: java.lang.Throwable -> L597
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L597
                java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L58e
                r11 = 38
                char[] r11 = new char[r11]     // Catch: java.lang.Throwable -> L58e
                r11 = {x0704: FILL_ARRAY_DATA , data: [17, 35, 23, 35, 3, 33, 14, 17, 34, 8, 32, 0, 4, 10, 28, 24, 16, 4, 15, 26, 32, 27, 13760, 13760, 25, 21, 32, 26, 23, 32, 32, 0, 8, 31, 3, 20, 25, 5} // fill-array     // Catch: java.lang.Throwable -> L58e
                int r12 = o.InterfaceC24178iXu.TaskStackBuilder.AuCTel
                int r12 = r12 + 33
                int r13 = r12 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.fARcdN = r13
                int r12 = r12 % r3
                java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L58e
                r13 = 38
                r14 = 22
                b(r13, r14, r11, r12)     // Catch: java.lang.Throwable -> L58e
                r11 = r12[r8]     // Catch: java.lang.Throwable -> L58e
                java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L58e
                java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L58e
                java.lang.Class[] r12 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L58e
                java.lang.Class<java.lang.String> r13 = java.lang.String.class
                r12[r8] = r13     // Catch: java.lang.Throwable -> L58e
                java.lang.reflect.Constructor r11 = r11.getDeclaredConstructor(r12)     // Catch: java.lang.Throwable -> L58e
                java.lang.Object r5 = r11.newInstance(r5)     // Catch: java.lang.Throwable -> L58e
                int r11 = o.InterfaceC24178iXu.TaskStackBuilder.fARcdN
                int r11 = r11 + 61
                int r12 = r11 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.AuCTel = r12
                int r11 = r11 % r3
                r10[r8] = r5     // Catch: java.lang.Throwable -> L597
                r17 = -2
                r18 = -41
                r19 = 0
                r20 = 2117851487(0x7e3bd95f, float:6.2423573E37)
                r21 = -365564220(0xffffffffea35eec4, float:-5.498578E25)
                r5 = r12 | 63
                int r5 = r5 << r9
                r11 = r12 ^ 63
                int r5 = r5 - r11
                int r11 = r5 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.fARcdN = r11
                int r5 = r5 % r3
                java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L597
                r22 = r5
                a(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L597
                r5 = r5[r8]     // Catch: java.lang.Throwable -> L597
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L597
                java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L585
                r11 = 38
                char[] r11 = new char[r11]     // Catch: java.lang.Throwable -> L585
                r11 = {x072e: FILL_ARRAY_DATA , data: [17, 35, 23, 35, 3, 33, 14, 17, 34, 8, 32, 0, 4, 10, 28, 24, 16, 4, 15, 26, 32, 27, 13760, 13760, 25, 21, 32, 26, 23, 32, 32, 0, 8, 31, 3, 20, 25, 5} // fill-array     // Catch: java.lang.Throwable -> L585
                int r12 = o.InterfaceC24178iXu.TaskStackBuilder.AuCTel
                r13 = r12 | 33
                int r13 = r13 << r9
                r14 = 33
                r12 = r12 ^ r14
                int r13 = r13 - r12
                int r12 = r13 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.fARcdN = r12
                int r13 = r13 % r3
                r12 = 38
                r15 = 22
                if (r13 != 0) goto L18b
                java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L585
                b(r12, r15, r11, r13)     // Catch: java.lang.Throwable -> L585
                r11 = r13[r8]     // Catch: java.lang.Throwable -> L585
                java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L585
                java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L585
                java.lang.Class[] r12 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L585
                java.lang.Class<java.lang.String> r13 = java.lang.String.class
                r12[r8] = r13     // Catch: java.lang.Throwable -> L585
                java.lang.reflect.Constructor r11 = r11.getDeclaredConstructor(r12)     // Catch: java.lang.Throwable -> L585
                goto L1a2
            L18b:
                java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L585
                b(r12, r15, r11, r13)     // Catch: java.lang.Throwable -> L585
                r11 = r13[r8]     // Catch: java.lang.Throwable -> L585
                java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L585
                java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L585
                java.lang.Class[] r12 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L585
                java.lang.Class<java.lang.String> r13 = java.lang.String.class
                r12[r8] = r13     // Catch: java.lang.Throwable -> L585
                java.lang.reflect.Constructor r11 = r11.getDeclaredConstructor(r12)     // Catch: java.lang.Throwable -> L585
            L1a2:
                int r12 = o.InterfaceC24178iXu.TaskStackBuilder.fARcdN
                r13 = r12 & 79
                r12 = r12 | 79
                int r13 = r13 + r12
                int r12 = r13 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.AuCTel = r12
                int r13 = r13 % r3
                if (r13 != 0) goto L57d
                java.lang.Object r5 = r11.newInstance(r5)     // Catch: java.lang.Throwable -> L585
                r10[r9] = r5     // Catch: java.lang.Throwable -> L597
                r17 = 63
                r18 = -49
                r19 = 0
                r20 = 2117851517(0x7e3bd97d, float:6.2423725E37)
                r21 = -365564190(0xffffffffea35eee2, float:-5.4985916E25)
                java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L574
                r22 = r5
                a(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L574
                r5 = r5[r8]     // Catch: java.lang.Throwable -> L574
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L574
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L574
                r17 = 16
                r18 = -55
                r19 = 0
                r20 = 2117851523(0x7e3bd983, float:6.2423755E37)
                r21 = -365564168(0xffffffffea35eef8, float:-5.498602E25)
                java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L574
                r22 = r11
                a(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L574
                r11 = r11[r8]     // Catch: java.lang.Throwable -> L574
                java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L574
                java.lang.reflect.Method r5 = r5.getMethod(r11, r6)     // Catch: java.lang.Throwable -> L574
                int r11 = o.InterfaceC24178iXu.TaskStackBuilder.fARcdN
                int r11 = r11 + 49
                int r12 = r11 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.AuCTel = r12
                int r11 = r11 % r3
                java.lang.Object r5 = r5.invoke(r0, r6)     // Catch: java.lang.Throwable -> L574
                int r11 = o.InterfaceC24178iXu.TaskStackBuilder.AuCTel
                r12 = r11 | 103(0x67, float:1.44E-43)
                int r12 = r12 << r9
                r11 = r11 ^ 103(0x67, float:1.44E-43)
                int r12 = r12 - r11
                int r11 = r12 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.fARcdN = r11
                int r12 = r12 % r3
                r17 = 63
                r18 = -49
                r19 = 0
                r20 = 2117851517(0x7e3bd97d, float:6.2423725E37)
                r21 = -365564190(0xffffffffea35eee2, float:-5.4985916E25)
                java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L56b
                r22 = r11
                a(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L56b
                r11 = r11[r8]     // Catch: java.lang.Throwable -> L56b
                java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L56b
                java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L56b
                r17 = 11
                r18 = -58
                r19 = 0
                r20 = 2117851523(0x7e3bd983, float:6.2423755E37)
                r21 = -365564152(0xffffffffea35ef08, float:-5.498609E25)
                java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L56b
                r22 = r12
                a(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L56b
                r12 = r12[r8]     // Catch: java.lang.Throwable -> L56b
                java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L56b
                java.lang.reflect.Method r11 = r11.getMethod(r12, r6)     // Catch: java.lang.Throwable -> L56b
                java.lang.Object r0 = r11.invoke(r0, r6)     // Catch: java.lang.Throwable -> L56b
                int r11 = o.InterfaceC24178iXu.TaskStackBuilder.fARcdN
                r12 = r11 ^ 99
                r11 = r11 & 99
                int r11 = r11 << r9
                int r12 = r12 + r11
                int r11 = r12 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.AuCTel = r11
                int r12 = r12 % r3
                java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L562
                r12 = 64
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L562
                r11[r9] = r12     // Catch: java.lang.Throwable -> L562
                int r12 = o.InterfaceC24178iXu.TaskStackBuilder.AuCTel
                int r12 = r12 + 75
                int r13 = r12 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.fARcdN = r13
                int r12 = r12 % r3
                if (r12 != 0) goto L27b
                r11[r9] = r0     // Catch: java.lang.Throwable -> L562
                char[] r0 = new char[r14]     // Catch: java.lang.Throwable -> L562
                r0 = {x0758: FILL_ARRAY_DATA , data: [25, 11, 24, 0, 14, 8, 21, 24, 2, 14, 10, 31, 13, 10, 33, 28, 19, 33, 29, 33, 26, 35, 5, 27, 28, 12, 29, 24, 11, 25, 28, 12, 13877} // fill-array     // Catch: java.lang.Throwable -> L562
                java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L562
                r13 = 84
                r14 = 20
                b(r13, r14, r0, r12)     // Catch: java.lang.Throwable -> L562
                r0 = r12[r8]     // Catch: java.lang.Throwable -> L562
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L562
            L276:
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L562
                goto L28e
            L27b:
                r11[r8] = r0     // Catch: java.lang.Throwable -> L562
                char[] r0 = new char[r14]     // Catch: java.lang.Throwable -> L562
                r0 = {x077e: FILL_ARRAY_DATA , data: [25, 11, 24, 0, 14, 8, 21, 24, 2, 14, 10, 31, 13, 10, 33, 28, 19, 33, 29, 33, 26, 35, 5, 27, 28, 12, 29, 24, 11, 25, 28, 12, 13877} // fill-array     // Catch: java.lang.Throwable -> L562
                java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L562
                r13 = 77
                b(r14, r13, r0, r12)     // Catch: java.lang.Throwable -> L562
                r0 = r12[r8]     // Catch: java.lang.Throwable -> L562
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L562
                goto L276
            L28e:
                r12 = 14
                char[] r13 = new char[r12]     // Catch: java.lang.Throwable -> L562
                r13 = {x07a4: FILL_ARRAY_DATA , data: [28, 12, 35, 30, 26, 35, 5, 27, 28, 12, 13, 9, 10, 9} // fill-array     // Catch: java.lang.Throwable -> L562
                java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L562
                r15 = 19
                b(r12, r15, r13, r14)     // Catch: java.lang.Throwable -> L562
                r12 = r14[r8]     // Catch: java.lang.Throwable -> L562
                java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L562
                java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L562
                int r14 = o.InterfaceC24178iXu.TaskStackBuilder.AuCTel
                r15 = r14 | 89
                int r15 = r15 << r9
                r14 = r14 ^ 89
                int r15 = r15 - r14
                int r14 = r15 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.fARcdN = r14
                int r15 = r15 % r3
                if (r15 != 0) goto L2be
                java.lang.Class<java.lang.String> r14 = java.lang.String.class
                r13[r8] = r14     // Catch: java.lang.Throwable -> L562
                java.lang.Class r14 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L562
                r13[r8] = r14     // Catch: java.lang.Throwable -> L562
            L2b9:
                java.lang.reflect.Method r0 = r0.getMethod(r12, r13)     // Catch: java.lang.Throwable -> L562
                goto L2c7
            L2be:
                java.lang.Class<java.lang.String> r14 = java.lang.String.class
                r13[r8] = r14     // Catch: java.lang.Throwable -> L562
                java.lang.Class r14 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L562
                r13[r9] = r14     // Catch: java.lang.Throwable -> L562
                goto L2b9
            L2c7:
                int r12 = o.InterfaceC24178iXu.TaskStackBuilder.AuCTel
                r13 = r12 ^ 71
                r12 = r12 & 71
                int r12 = r12 << r9
                int r13 = r13 + r12
                int r12 = r13 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.fARcdN = r12
                int r13 = r13 % r3
                java.lang.Object r0 = r0.invoke(r5, r11)     // Catch: java.lang.Throwable -> L562
                r11 = 34
                r12 = -42
                r13 = 0
                r14 = 2117851517(0x7e3bd97d, float:6.2423725E37)
                r15 = -365564139(0xffffffffea35ef15, float:-5.498615E25)
                java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L597
                r16 = r5
                a(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L597
                r5 = r5[r8]     // Catch: java.lang.Throwable -> L597
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L597
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L597
                r11 = 10
                char[] r12 = new char[r11]     // Catch: java.lang.Throwable -> L597
                r12 = {x07b6: FILL_ARRAY_DATA , data: [14, 1, 25, 6, 28, 35, 6, 34, 17, 14} // fill-array     // Catch: java.lang.Throwable -> L597
                java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L597
                r14 = 109(0x6d, float:1.53E-43)
                b(r11, r14, r12, r13)     // Catch: java.lang.Throwable -> L597
                r11 = r13[r8]     // Catch: java.lang.Throwable -> L597
                java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L597
                java.lang.reflect.Field r5 = r5.getField(r11)     // Catch: java.lang.Throwable -> L597
                java.lang.Object r0 = r5.get(r0)     // Catch: java.lang.Throwable -> L597
                java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.Throwable -> L597
                int r5 = r0.length     // Catch: java.lang.Throwable -> L597
                int r11 = o.InterfaceC24178iXu.TaskStackBuilder.fARcdN
                int r11 = r11 + 17
                int r12 = r11 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.AuCTel = r12
                int r11 = r11 % r3
                r11 = r8
            L319:
                if (r11 >= r5) goto L560
                r12 = r0[r11]     // Catch: java.lang.Throwable -> L597
                r13 = 5
                char[] r14 = new char[r13]     // Catch: java.lang.Throwable -> L597
                r14 = {x07c4: FILL_ARRAY_DATA , data: [21, 25, 32, 26, 13739} // fill-array     // Catch: java.lang.Throwable -> L597
                java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L597
                r7 = 8
                b(r13, r7, r14, r15)     // Catch: java.lang.Throwable -> L597
                r13 = r15[r8]     // Catch: java.lang.Throwable -> L597
                java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L597
                java.lang.Object[] r13 = new java.lang.Object[]{r13}     // Catch: java.lang.Throwable -> L557
                r17 = -61
                r18 = -35
                r19 = 0
                r20 = 2117851526(0x7e3bd986, float:6.242377E37)
                int r14 = o.InterfaceC24178iXu.TaskStackBuilder.fARcdN
                r15 = r14 & 73
                r14 = r14 | 73
                int r15 = r15 + r14
                int r14 = r15 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.AuCTel = r14
                int r15 = r15 % r3
                r21 = -365564110(0xffffffffea35ef32, float:-5.4986285E25)
                java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L557
                r22 = r14
                a(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L557
                r14 = r14[r8]     // Catch: java.lang.Throwable -> L557
                java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L557
                java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch: java.lang.Throwable -> L557
                r17 = -57
                r18 = -61
                r19 = 0
                r20 = 2117851523(0x7e3bd983, float:6.2423755E37)
                int r15 = o.InterfaceC24178iXu.TaskStackBuilder.fARcdN
                r21 = r15 | 63
                int r21 = r21 << 1
                r15 = r15 ^ 63
                int r15 = r21 - r15
                int r7 = r15 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.AuCTel = r7
                int r15 = r15 % r3
                r21 = -365564074(0xffffffffea35ef56, float:-5.498645E25)
                if (r15 == 0) goto L388
                java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L557
                r22 = r7
                a(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L557
                r7 = r7[r8]     // Catch: java.lang.Throwable -> L557
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L557
                java.lang.Class[] r15 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L557
                java.lang.Class<java.lang.String> r17 = java.lang.String.class
                r15[r8] = r17     // Catch: java.lang.Throwable -> L557
                goto L399
            L388:
                java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L557
                r22 = r7
                a(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L557
                r7 = r7[r8]     // Catch: java.lang.Throwable -> L557
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L557
                java.lang.Class[] r15 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L557
                java.lang.Class<java.lang.String> r17 = java.lang.String.class
                r15[r8] = r17     // Catch: java.lang.Throwable -> L557
            L399:
                java.lang.reflect.Method r7 = r14.getMethod(r7, r15)     // Catch: java.lang.Throwable -> L557
                java.lang.Object r7 = r7.invoke(r6, r13)     // Catch: java.lang.Throwable -> L557
                java.io.ByteArrayInputStream r13 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L597
                r14 = 28
                char[] r15 = new char[r14]     // Catch: java.lang.Throwable -> L54e
                r15 = {x07ce: FILL_ARRAY_DATA , data: [25, 11, 24, 0, 14, 8, 21, 24, 2, 14, 10, 31, 13, 10, 33, 28, 19, 33, 24, 3, 0, 26, 11, 25, 4, 16, 34, 12} // fill-array     // Catch: java.lang.Throwable -> L54e
                java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L54e
                r3 = 27
                b(r14, r3, r15, r4)     // Catch: java.lang.Throwable -> L54e
                r3 = r4[r8]     // Catch: java.lang.Throwable -> L54e
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L54e
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L54e
                r4 = 11
                char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> L54e
                r4 = {x07ee: FILL_ARRAY_DATA , data: [32, 10, 28, 10, 4, 22, 18, 35, 35, 24, 13915} // fill-array     // Catch: java.lang.Throwable -> L54e
                java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L54e
                r15 = 11
                r9 = 120(0x78, float:1.68E-43)
                b(r15, r9, r4, r14)     // Catch: java.lang.Throwable -> L54e
                r4 = r14[r8]     // Catch: java.lang.Throwable -> L54e
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L54e
                java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.Throwable -> L54e
                java.lang.Object r3 = r3.invoke(r12, r6)     // Catch: java.lang.Throwable -> L54e
                byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L54e
                r13.<init>(r3)     // Catch: java.lang.Throwable -> L597
                java.lang.Object[] r3 = new java.lang.Object[]{r13}     // Catch: java.lang.Throwable -> L545
                r20 = -61
                r21 = -35
                int r4 = o.InterfaceC24178iXu.TaskStackBuilder.AuCTel
                r9 = r4 & 59
                r4 = r4 | 59
                int r9 = r9 + r4
                int r4 = r9 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.fARcdN = r4
                r4 = 2
                int r9 = r9 % r4
                r22 = 0
                r23 = 2117851526(0x7e3bd986, float:6.242377E37)
                r24 = -365564110(0xffffffffea35ef32, float:-5.4986285E25)
                r4 = 1
                java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L545
                r25 = r9
                a(r20, r21, r22, r23, r24, r25)     // Catch: java.lang.Throwable -> L545
                r4 = r9[r8]     // Catch: java.lang.Throwable -> L545
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L545
                java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L545
                r9 = 19
                char[] r9 = new char[r9]     // Catch: java.lang.Throwable -> L545
                r9 = {x07fe: FILL_ARRAY_DATA , data: [28, 12, 10, 13, 35, 24, 4, 22, 10, 12, 31, 35, 3, 8, 8, 2, 28, 35, 13943} // fill-array     // Catch: java.lang.Throwable -> L545
                r12 = 1
                java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L545
                r14 = 19
                r15 = 120(0x78, float:1.68E-43)
                b(r14, r15, r9, r13)     // Catch: java.lang.Throwable -> L545
                r9 = r13[r8]     // Catch: java.lang.Throwable -> L545
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L545
                java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> L545
                int r12 = o.InterfaceC24178iXu.TaskStackBuilder.AuCTel
                int r12 = r12 + 41
                int r14 = r12 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.fARcdN = r14
                r14 = 2
                int r12 = r12 % r14
                if (r12 != 0) goto L438
                java.lang.Class<java.io.InputStream> r12 = java.io.InputStream.class
                r14 = 1
                r13[r14] = r12     // Catch: java.lang.Throwable -> L545
                java.lang.reflect.Method r4 = r4.getMethod(r9, r13)     // Catch: java.lang.Throwable -> L545
            L433:
                java.lang.Object r3 = r4.invoke(r7, r3)     // Catch: java.lang.Throwable -> L545
                goto L441
            L438:
                java.lang.Class<java.io.InputStream> r12 = java.io.InputStream.class
                r13[r8] = r12     // Catch: java.lang.Throwable -> L545
                java.lang.reflect.Method r4 = r4.getMethod(r9, r13)     // Catch: java.lang.Throwable -> L545
                goto L433
            L441:
                int r4 = r10.length     // Catch: java.lang.Throwable -> L597
                r4 = r8
            L443:
                r7 = 2
                if (r4 >= r7) goto L53a
                r7 = r10[r4]     // Catch: java.lang.Throwable -> L597
                r20 = -110(0xffffffffffffff92, float:NaN)
                r21 = -38
                r22 = 0
                r23 = 2117851526(0x7e3bd986, float:6.242377E37)
                r24 = -365564064(0xffffffffea35ef60, float:-5.4986497E25)
                r9 = 1
                java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L531
                r25 = r12
                a(r20, r21, r22, r23, r24, r25)     // Catch: java.lang.Throwable -> L531
                r9 = r12[r8]     // Catch: java.lang.Throwable -> L531
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L531
                java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L531
                r12 = 23
                char[] r13 = new char[r12]     // Catch: java.lang.Throwable -> L531
                r13 = {x0816: FILL_ARRAY_DATA , data: [28, 12, 30, 4, 11, 4, 10, 17, 33, 35, 20, 25, 13788, 13788, 30, 31, 1, 8, 2, 8, 23, 27, 13864} // fill-array     // Catch: java.lang.Throwable -> L531
                r14 = 1
                java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L531
                r14 = 50
                b(r12, r14, r13, r15)     // Catch: java.lang.Throwable -> L531
                r12 = r15[r8]     // Catch: java.lang.Throwable -> L531
                java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L531
                java.lang.reflect.Method r9 = r9.getMethod(r12, r6)     // Catch: java.lang.Throwable -> L531
                java.lang.Object r9 = r9.invoke(r3, r6)     // Catch: java.lang.Throwable -> L531
                boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L597
                if (r7 == 0) goto L527
                r0 = r1 ^ 1
                r3 = 4
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L597
                r3 = 1
                int[] r5 = new int[r3]     // Catch: java.lang.Throwable -> L597
                r4[r8] = r5     // Catch: java.lang.Throwable -> L597
                int[] r7 = new int[r3]     // Catch: java.lang.Throwable -> L597
                r9 = 2
                r4[r9] = r7     // Catch: java.lang.Throwable -> L597
                int[] r7 = new int[r3]     // Catch: java.lang.Throwable -> L597
                r3 = 3
                r4[r3] = r7     // Catch: java.lang.Throwable -> L597
                int r3 = o.InterfaceC24178iXu.TaskStackBuilder.fARcdN
                int r3 = r3 + 7
                int r9 = r3 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.AuCTel = r9
                r10 = 2
                int r3 = r3 % r10
                if (r3 == 0) goto L4a8
                r3 = 8
                goto L4aa
            L4a8:
                r3 = 16
            L4aa:
                int r9 = r9 + 39
                int r11 = r9 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.fARcdN = r11
                int r9 = r9 % r10
                int[] r7 = (int[]) r7     // Catch: java.lang.Throwable -> L597
                r7[r8] = r1     // Catch: java.lang.Throwable -> L597
                int r11 = r11 + 121
                int r7 = r11 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.AuCTel = r7
                int r11 = r11 % r10
                r7 = 1
                if (r11 == 0) goto L4c8
                r5 = r4[r7]     // Catch: java.lang.Throwable -> L597
                int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L597
                r5[r8] = r0     // Catch: java.lang.Throwable -> L597
                r4[r7] = r6     // Catch: java.lang.Throwable -> L597
                goto L4ce
            L4c8:
                int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L597
                r5[r8] = r0     // Catch: java.lang.Throwable -> L597
                r4[r7] = r6     // Catch: java.lang.Throwable -> L597
            L4ce:
                int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L597
                int r5 = ~r0
                r7 = 263585455(0xfb5feaf, float:1.7946079E-29)
                r7 = r7 | r5
                int r7 = ~r7
                r9 = -25182343(0xfffffffffe7fbf79, float:-8.498683E37)
                r9 = r9 | r0
                int r9 = ~r9
                r7 = r7 | r9
                int r7 = r7 * 988
                r9 = 2085422129(0x7c4d0431, float:4.2580235E36)
                int r7 = r7 + r9
                r9 = 127164559(0x794608f, float:2.2325317E-34)
                r0 = r0 | r9
                int r0 = ~r0
                r9 = 136420896(0x8219e20, float:4.863505E-34)
                r0 = r0 | r9
                r9 = -25182343(0xfffffffffe7fbf79, float:-8.498683E37)
                r5 = r5 | r9
                int r5 = ~r5
                r0 = r0 | r5
                int r0 = r0 * 988
                int r7 = r7 + r0
                r0 = r7 & r3
                r3 = r3 | r7
                int r0 = r0 + r3
                int r0 = r0 + r2
                int r3 = o.InterfaceC24178iXu.TaskStackBuilder.fARcdN
                int r5 = r3 + 107
                int r7 = r5 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.AuCTel = r7
                r7 = 2
                int r5 = r5 % r7
                int r5 = r0 << 13
                r0 = r0 ^ r5
                int r5 = r0 >>> 17
                r7 = r0 & r5
                int r7 = ~r7
                r0 = r0 | r5
                r0 = r0 & r7
                int r3 = r3 + 123
                int r5 = r3 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.AuCTel = r5
                r5 = 2
                int r3 = r3 % r5
                int r3 = r0 << 5
                r7 = r0 & r3
                int r7 = ~r7
                r0 = r0 | r3
                r0 = r0 & r7
                r3 = r4[r5]     // Catch: java.lang.Throwable -> L597
                int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L597
                r3[r8] = r0     // Catch: java.lang.Throwable -> L597
                r0 = r4
                goto L6c9
            L527:
                r7 = r4 | 1
                r9 = 1
                int r7 = r7 << r9
                r4 = r4 ^ 1
                int r4 = r7 - r4
                goto L443
            L531:
                r0 = move-exception
                java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L597
                if (r3 == 0) goto L539
                throw r3     // Catch: java.lang.Throwable -> L597
            L539:
                throw r0     // Catch: java.lang.Throwable -> L597
            L53a:
                r3 = r11 & 1
                r4 = r11 | 1
                int r11 = r3 + r4
                r3 = 2
                r7 = 4
                r9 = 1
                goto L319
            L545:
                r0 = move-exception
                java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L597
                if (r3 == 0) goto L54d
                throw r3     // Catch: java.lang.Throwable -> L597
            L54d:
                throw r0     // Catch: java.lang.Throwable -> L597
            L54e:
                r0 = move-exception
                java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L597
                if (r3 == 0) goto L556
                throw r3     // Catch: java.lang.Throwable -> L597
            L556:
                throw r0     // Catch: java.lang.Throwable -> L597
            L557:
                r0 = move-exception
                java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L597
                if (r3 == 0) goto L55f
                throw r3     // Catch: java.lang.Throwable -> L597
            L55f:
                throw r0     // Catch: java.lang.Throwable -> L597
            L560:
                r3 = r7
                goto L598
            L562:
                r0 = move-exception
                java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L597
                if (r3 == 0) goto L56a
                throw r3     // Catch: java.lang.Throwable -> L597
            L56a:
                throw r0     // Catch: java.lang.Throwable -> L597
            L56b:
                r0 = move-exception
                java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L597
                if (r3 == 0) goto L573
                throw r3     // Catch: java.lang.Throwable -> L597
            L573:
                throw r0     // Catch: java.lang.Throwable -> L597
            L574:
                r0 = move-exception
                java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L597
                if (r3 == 0) goto L57c
                throw r3     // Catch: java.lang.Throwable -> L597
            L57c:
                throw r0     // Catch: java.lang.Throwable -> L597
            L57d:
                java.lang.Object r0 = r11.newInstance(r5)     // Catch: java.lang.Throwable -> L585
                r3 = 1
                r10[r3] = r0     // Catch: java.lang.Throwable -> L597
                throw r6     // Catch: java.lang.Throwable -> L597
            L585:
                r0 = move-exception
                java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L597
                if (r3 == 0) goto L58d
                throw r3     // Catch: java.lang.Throwable -> L597
            L58d:
                throw r0     // Catch: java.lang.Throwable -> L597
            L58e:
                r0 = move-exception
                java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L597
                if (r3 == 0) goto L596
                throw r3     // Catch: java.lang.Throwable -> L597
            L596:
                throw r0     // Catch: java.lang.Throwable -> L597
            L597:
                r3 = 4
            L598:
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r3 = 1
                int[] r4 = new int[r3]
                r0[r8] = r4
                int[] r5 = new int[r3]
                r7 = 2
                r0[r7] = r5
                int[] r5 = new int[r3]
                r7 = 3
                r0[r7] = r5
                int[] r5 = (int[]) r5
                r5[r8] = r1
                int[] r4 = (int[]) r4
                int r5 = o.InterfaceC24178iXu.TaskStackBuilder.AuCTel
                r7 = r5 | 23
                int r7 = r7 << r3
                r3 = 23
                r5 = r5 ^ r3
                int r7 = r7 - r5
                int r3 = r7 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.fARcdN = r3
                r3 = 2
                int r7 = r7 % r3
                if (r7 != 0) goto L5eb
                r4[r8] = r1
                r0[r8] = r6
                r3 = r1 | 80
                int r3 = r3 * 988
                r4 = 1846947373(0x6e162e2d, float:1.1619644E28)
                int r4 = r4 + r3
                int r3 = ~r1
                r5 = 549455602(0x20c006f2, float:3.253066E-19)
                r5 = r5 | r3
                int r5 = ~r5
                r6 = -987672571(0xffffffffc5215005, float:-2581.0012)
                r5 = r5 | r6
                int r5 = r5 * (-1976)
                int r4 = r4 + r5
                r5 = 438217048(0x1a1ea958, float:3.281043E-23)
                r5 = r5 | r1
                int r5 = ~r5
                r6 = 80
                r5 = r5 | r6
                r6 = -438217049(0xffffffffe5e156a7, float:-1.3301636E23)
                r3 = r3 | r6
                int r3 = ~r3
                r3 = r3 | r5
                int r3 = r3 * 988
                int r4 = r4 + r3
                goto L622
            L5eb:
                r4[r8] = r1
                r3 = 1
                r0[r3] = r6
                java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
                long r3 = r3.maxMemory()
                int r3 = (int) r3
                int r3 = ~r3
                r4 = -359303075(0xffffffffea95785d, float:-9.034917E25)
                r4 = r4 | r3
                r5 = -71827969(0xfffffffffbb7fdff, float:-1.910684E36)
                r5 = r5 | r3
                int r5 = ~r5
                r6 = 248064520(0xec92a08, float:4.95908E-30)
                r6 = r6 | r3
                r7 = 535539626(0x1febafaa, float:9.981698E-20)
                r3 = r3 | r7
                int r3 = ~r3
                r3 = r3 | r5
                int r3 = r3 * (-184)
                r5 = 1118181281(0x42a617a1, float:83.04615)
                int r5 = r5 + r3
                r3 = 287475106(0x112285a2, float:1.2820725E-28)
                int r4 = ~r4
                r3 = r3 | r4
                int r4 = ~r6
                r3 = r3 | r4
                int r3 = r3 * 184
                int r5 = r5 + r3
                r3 = 1932212616(0x732b3988, float:1.3565821E31)
                int r4 = r5 + r3
            L622:
                int r3 = com.google.android.gms.wallet.contract.TaskResultContracts.GetPaymentData.OLrzqt()
                int r5 = r4 * (-493)
                int r5 = ~r5
                int r5 = (-1) - r5
                int r6 = ~r4
                int r7 = r6 * (-988)
                int r7 = ~r7
                int r5 = r5 - r7
                r7 = 1
                int r5 = r5 - r7
                r7 = r4 ^ (-1)
                r7 = r7 | r4
                int r9 = ~r3
                r7 = r7 | r9
                int r7 = r7 * 494
                int r7 = -r7
                int r7 = -r7
                int r7 = ~r7
                int r5 = r5 - r7
                r7 = 1
                int r5 = r5 - r7
                r7 = -1
                r7 = r7 ^ r6
                r6 = r6 | r7
                int r6 = ~r6
                int r3 = ~r3
                r7 = r3 ^ r4
                r3 = r3 & r4
                r3 = r3 | r7
                int r3 = ~r3
                r7 = r6 ^ r3
                r3 = r3 & r6
                r3 = r3 | r7
                int r4 = ~r4
                r6 = r3 ^ r4
                r3 = r3 & r4
                r3 = r3 | r6
                int r3 = r3 * 494
                int r5 = r5 + r3
                int r3 = o.InterfaceC24178iXu.TaskStackBuilder.fARcdN
                int r3 = r3 + 31
                int r4 = r3 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.AuCTel = r4
                r4 = 2
                int r3 = r3 % r4
                int r3 = r5 * (-949)
                int r4 = r2 * (-949)
                int r4 = -r4
                int r4 = -r4
                r6 = r3 | r4
                r7 = 1
                int r6 = r6 << r7
                r3 = r3 ^ r4
                int r6 = r6 - r3
                int r3 = ~r2
                int r4 = ~r1
                r7 = r3 ^ r4
                r3 = r3 & r4
                r3 = r3 | r7
                int r3 = ~r3
                int r4 = ~r5
                r4 = r4 | r1
                int r4 = ~r4
                r7 = r3 ^ r4
                r3 = r3 & r4
                r3 = r3 | r7
                int r3 = r3 * 1900
                r4 = r6 & r3
                r3 = r3 | r6
                int r4 = r4 + r3
                int r3 = ~r1
                r6 = r3 ^ r5
                r7 = r3 & r5
                r6 = r6 | r7
                int r6 = ~r6
                r7 = r2 ^ r1
                r9 = r2 & r1
                r7 = r7 | r9
                int r7 = ~r7
                r9 = r6 ^ r7
                r6 = r6 & r7
                r6 = r6 | r9
                int r6 = r6 * (-950)
                int r6 = -r6
                int r6 = -r6
                r7 = r4 ^ r6
                r4 = r4 & r6
                r6 = 1
                int r4 = r4 << r6
                int r7 = r7 + r4
                r2 = r2 | r3
                int r2 = ~r2
                r3 = r5 ^ r1
                r1 = r1 & r5
                r1 = r1 | r3
                int r1 = ~r1
                r3 = r2 ^ r1
                r1 = r1 & r2
                r1 = r1 | r3
                int r1 = r1 * 950
                r2 = r7 | r1
                r3 = 1
                int r2 = r2 << r3
                r1 = r1 ^ r7
                int r2 = r2 - r1
                int r1 = r2 << 13
                r3 = r2 & r1
                int r3 = ~r3
                r1 = r1 | r2
                r1 = r1 & r3
                int r2 = r1 >>> 17
                int r3 = ~r2
                r3 = r3 & r1
                int r1 = ~r1
                r1 = r1 & r2
                r1 = r1 | r3
                int r2 = r1 << 5
                r3 = r1 & r2
                int r3 = ~r3
                r1 = r1 | r2
                r1 = r1 & r3
                r2 = 2
                r3 = r0[r2]
                int[] r3 = (int[]) r3
                r3[r8] = r1
            L6c9:
                int r1 = o.InterfaceC24178iXu.TaskStackBuilder.fARcdN
                r2 = r1 ^ 23
                r3 = 23
                r1 = r1 & r3
                r3 = 1
                int r1 = r1 << r3
                int r2 = r2 + r1
                int r1 = r2 % 128
                o.InterfaceC24178iXu.TaskStackBuilder.AuCTel = r1
                r1 = 2
                int r2 = r2 % r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.InterfaceC24178iXu.TaskStackBuilder.OLrzqt(android.content.Context, int, int):java.lang.Object[]");
        }
    }

    /* JADX INFO: renamed from: o.iXu$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 implements InterfaceC24178iXu {
        public final java.util.List<InvestTokenWithAmount> EZpvd;
        public final InvestTipInfoVo OLrzqt;
        public final DetailItemType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks2() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iXu$ComponentCallbacks2 */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ComponentCallbacks2 copy$default(ComponentCallbacks2 componentCallbacks2, java.util.List list, InvestTipInfoVo investTipInfoVo, DetailItemType detailItemType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = componentCallbacks2.EZpvd;
            }
            if ((i & 2) != 0) {
                investTipInfoVo = componentCallbacks2.OLrzqt;
            }
            if ((i & 4) != 0) {
                detailItemType = componentCallbacks2.copydefault;
            }
            return componentCallbacks2.EZpvd(list, investTipInfoVo, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ComponentCallbacks2 EZpvd(@NotNull java.util.List<InvestTokenWithAmount> list, InvestTipInfoVo investTipInfoVo, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new ComponentCallbacks2(list, investTipInfoVo, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTipInfoVo OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InvestTokenWithAmount> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComponentCallbacks2)) {
                return false;
            }
            ComponentCallbacks2 componentCallbacks2 = (ComponentCallbacks2) obj;
            return Intrinsics.EZpvd(this.EZpvd, componentCallbacks2.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, componentCallbacks2.OLrzqt) && this.copydefault == componentCallbacks2.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            InvestTipInfoVo investTipInfoVo = this.OLrzqt;
            return (((iHashCode * 31) + (investTipInfoVo == null ? 0 : investTipInfoVo.hashCode())) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Univ3UnClaimFeeBean(feeInfoList=" + this.EZpvd + ", pendingFeeTip=" + this.OLrzqt + ", itemType=" + this.copydefault + ")";
        }

        public ComponentCallbacks2(@NotNull java.util.List<InvestTokenWithAmount> list, InvestTipInfoVo investTipInfoVo, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.EZpvd = list;
            this.OLrzqt = investTipInfoVo;
            this.copydefault = detailItemType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:239)) : (r1v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r2v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:?: TERNARY null = ((wrap:int:0x000d: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:0x0011: SGET  A[WRAPPED] (LINE:241) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.V3_UNCLAIM_FEE com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType) : (r3v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void (m)] (LINE:238) call: o.iXu.ComponentCallbacks2.<init>(java.util.List, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void type: THIS */
        public /* synthetic */ ComponentCallbacks2(java.util.List list, InvestTipInfoVo investTipInfoVo, DetailItemType detailItemType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : investTipInfoVo, (i & 4) != 0 ? DetailItemType.V3_UNCLAIM_FEE : detailItemType);
        }
    }

    /* JADX INFO: renamed from: o.iXu$AssistContent */
    public static final class AssistContent implements InterfaceC24178iXu {
        public final boolean AEQbTJ;
        public final java.lang.String EZpvd;
        public final int KWHzl;
        public final DetailItemType OLrzqt;
        public final boolean copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent() {
            this(null, null, null, false, false, 0, null, 127, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AssistContent copy$default(AssistContent assistContent, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, DetailItemType detailItemType, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = assistContent.EZpvd;
            }
            if ((i2 & 2) != 0) {
                str2 = assistContent.gEmmrt;
            }
            java.lang.String str4 = str2;
            if ((i2 & 4) != 0) {
                str3 = assistContent.djBIcL;
            }
            java.lang.String str5 = str3;
            if ((i2 & 8) != 0) {
                z = assistContent.AEQbTJ;
            }
            boolean z3 = z;
            if ((i2 & 16) != 0) {
                z2 = assistContent.copydefault;
            }
            boolean z4 = z2;
            if ((i2 & 32) != 0) {
                i = assistContent.KWHzl;
            }
            int i3 = i;
            if ((i2 & 64) != 0) {
                detailItemType = assistContent.OLrzqt;
            }
            return assistContent.AEQbTJ(str, str4, str5, z3, z4, i3, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssistContent AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2, int i, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new AssistContent(str, str2, str3, z, z2, i, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssistContent)) {
                return false;
            }
            AssistContent assistContent = (AssistContent) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) assistContent.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) assistContent.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) assistContent.djBIcL) && this.AEQbTJ == assistContent.AEQbTJ && this.copydefault == assistContent.copydefault && this.KWHzl == assistContent.KWHzl && this.OLrzqt == assistContent.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.EZpvd.hashCode() * 31) + this.gEmmrt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Univ3CurrentPriceBean(currentPrice=" + this.EZpvd + ", token0=" + this.gEmmrt + ", token1=" + this.djBIcL + ", isInit=" + this.AEQbTJ + ", isDataErro=" + this.copydefault + ", style=" + this.KWHzl + ", itemType=" + this.OLrzqt + ")";
        }

        public AssistContent(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2, int i, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.EZpvd = str;
            this.gEmmrt = str2;
            this.djBIcL = str3;
            this.AEQbTJ = z;
            this.copydefault = z2;
            this.KWHzl = i;
            this.OLrzqt = detailItemType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r9v0 boolean))
  (wrap:boolean:0x0023: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r11v0 int))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:?: TERNARY null = ((wrap:int:0x002b: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:0x002f: SGET  A[WRAPPED] (LINE:251) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.V3_CURRENT_PRICE com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType) : (r12v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void (m)] (LINE:244) call: o.iXu.AssistContent.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void type: THIS */
        public /* synthetic */ AssistContent(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, DetailItemType detailItemType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? 1 : i, (i2 & 64) != 0 ? DetailItemType.V3_CURRENT_PRICE : detailItemType);
        }
    }

    /* JADX INFO: renamed from: o.iXu$SharedElementCallback */
    public static final class SharedElementCallback implements InterfaceC24178iXu {
        public final DetailItemType AEQbTJ;
        public java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public java.lang.String EZpvd;
        public boolean KWHzl;
        public boolean OLrzqt;
        public boolean copydefault;
        public SwapSlippageActivity.SlippageMode djBIcL;
        public SwapSlippageConfig gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback() {
            this(null, null, null, null, false, false, false, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull SwapSlippageActivity.SlippageMode slippageMode) {
            Intrinsics.checkNotNullParameter(slippageMode, "");
            this.djBIcL = slippageMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC24178iXu
        public DetailItemType EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SharedElementCallback KWHzl(@NotNull java.lang.String str, @NotNull SwapSlippageActivity.SlippageMode slippageMode, java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2, boolean z3, @NotNull SwapSlippageConfig swapSlippageConfig, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(slippageMode, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(swapSlippageConfig, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            return new SharedElementCallback(str, slippageMode, str2, str3, z, z2, z3, swapSlippageConfig, detailItemType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.KWHzl = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.copydefault = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SwapSlippageConfig djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SharedElementCallback)) {
                return false;
            }
            SharedElementCallback sharedElementCallback = (SharedElementCallback) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) sharedElementCallback.AhwBna) && this.djBIcL == sharedElementCallback.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) sharedElementCallback.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) sharedElementCallback.EZpvd) && this.OLrzqt == sharedElementCallback.OLrzqt && this.KWHzl == sharedElementCallback.KWHzl && this.copydefault == sharedElementCallback.copydefault && Intrinsics.EZpvd(this.gEmmrt, sharedElementCallback.gEmmrt) && this.AEQbTJ == sharedElementCallback.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AhwBna.hashCode();
            int iHashCode2 = this.djBIcL.hashCode();
            java.lang.String str = this.AYXKKw;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.gEmmrt.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Univ3SwapSlippageBean(swapSlippage=" + this.AhwBna + ", swapSlippageMode=" + this.djBIcL + ", swapMaxSlippage=" + this.AYXKKw + ", swapFixedSlippage=" + this.EZpvd + ", swapIsCustomFixed=" + this.OLrzqt + ", isUserSetSlippageDynamic=" + this.KWHzl + ", isUserSetSlippageFixed=" + this.copydefault + ", swapSlippageConfig=" + this.gEmmrt + ", itemType=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SwapSlippageActivity.SlippageMode valueOf() {
            return this.djBIcL;
        }

        public SharedElementCallback(@NotNull java.lang.String str, @NotNull SwapSlippageActivity.SlippageMode slippageMode, java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2, boolean z3, @NotNull SwapSlippageConfig swapSlippageConfig, @NotNull DetailItemType detailItemType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(slippageMode, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(swapSlippageConfig, "");
            Intrinsics.checkNotNullParameter(detailItemType, "");
            this.AhwBna = str;
            this.djBIcL = slippageMode;
            this.AYXKKw = str2;
            this.EZpvd = str3;
            this.OLrzqt = z;
            this.KWHzl = z2;
            this.copydefault = z3;
            this.gEmmrt = swapSlippageConfig;
            this.AEQbTJ = detailItemType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity$SlippageMode:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: SGET  A[WRAPPED] (LINE:256) com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity.SlippageMode.DYNAMIC com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity$SlippageMode) : (r24v0 com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity$SlippageMode))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: SGET  A[WRAPPED] com.okinc.business.dexlogic.bean.SlippageConfigVo.MAX_SLIP java.lang.String) : (r26v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002e: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r32v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r29v0 boolean) : false)
  (wrap:com.okinc.business.invest_biz.data.bean.SwapSlippageConfig:?: TERNARY null = ((wrap:int:0x003d: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0056: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (1023 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:262) call: com.okinc.business.invest_biz.data.bean.SwapSlippageConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r30v0 com.okinc.business.invest_biz.data.bean.SwapSlippageConfig))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType:?: TERNARY null = ((wrap:int:0x005c: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0060: SGET  A[WRAPPED] (LINE:263) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.V3_SWAP_SLIPPAGE com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType) : (r31v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType))
 A[MD:(java.lang.String, com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity$SlippageMode, java.lang.String, java.lang.String, boolean, boolean, boolean, com.okinc.business.invest_biz.data.bean.SwapSlippageConfig, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void (m)] (LINE:254) call: o.iXu.SharedElementCallback.<init>(java.lang.String, com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity$SlippageMode, java.lang.String, java.lang.String, boolean, boolean, boolean, com.okinc.business.invest_biz.data.bean.SwapSlippageConfig, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType):void type: THIS */
        public /* synthetic */ SharedElementCallback(java.lang.String str, SwapSlippageActivity.SlippageMode slippageMode, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, SwapSlippageConfig swapSlippageConfig, DetailItemType detailItemType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SwapSlippageActivity.SlippageMode.DYNAMIC : slippageMode, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? SlippageConfigVo.MAX_SLIP : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) == 0 ? z3 : false, (i & 128) != 0 ? new SwapSlippageConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1023, (DefaultConstructorMarker) null) : swapSlippageConfig, (i & 256) != 0 ? DetailItemType.V3_SWAP_SLIPPAGE : detailItemType);
        }
    }
}
