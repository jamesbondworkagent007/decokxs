package o;

import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.contants.ProtocolType;
import com.okinc.business.invest_biz.data.contants.TransactionType;
import com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC26561jee {

    /* JADX INFO: renamed from: o.jee$Activity */
    public static final class Activity implements InterfaceC26561jee {
        public static final Activity copydefault = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.jee$FragmentManager */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class FragmentManager implements InterfaceC26561jee {
        public final ActionBar AEQbTJ;
        public final long KWHzl;
        public final long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, long j, long j2, ActionBar actionBar, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = fragmentManager.OLrzqt;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = fragmentManager.KWHzl;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                actionBar = fragmentManager.AEQbTJ;
            }
            return fragmentManager.copydefault(j3, j4, actionBar);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager copydefault(long j, long j2, @NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            return new FragmentManager(j, j2, actionBar);
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
            return this.OLrzqt == fragmentManager.OLrzqt && this.KWHzl == fragmentManager.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, fragmentManager.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Long.hashCode(this.OLrzqt) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowV3ProductTips(poolId=" + this.OLrzqt + ", chainId=" + this.KWHzl + ", nextAction=" + this.AEQbTJ + ")";
        }

        public FragmentManager(long j, long j2, @NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            this.OLrzqt = j;
            this.KWHzl = j2;
            this.AEQbTJ = actionBar;
        }
    }

    /* JADX INFO: renamed from: o.jee$Fragment */
    public static final class Fragment implements InterfaceC26561jee {
        public final ProductType AEQbTJ;
        public final java.util.List<InvestPositionSelectUIItem> EZpvd;
        public final InterfaceC26561jee OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jee$Fragment */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, ProductType productType, java.util.List list, InterfaceC26561jee interfaceC26561jee, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                productType = fragment.AEQbTJ;
            }
            if ((i & 2) != 0) {
                list = fragment.EZpvd;
            }
            if ((i & 4) != 0) {
                interfaceC26561jee = fragment.OLrzqt;
            }
            return fragment.EZpvd(productType, list, interfaceC26561jee);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InvestPositionSelectUIItem> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment EZpvd(@NotNull ProductType productType, @NotNull java.util.List<? extends InvestPositionSelectUIItem> list, @NotNull InterfaceC26561jee interfaceC26561jee) {
            Intrinsics.checkNotNullParameter(productType, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(interfaceC26561jee, "");
            return new Fragment(productType, list, interfaceC26561jee);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC26561jee OLrzqt() {
            return this.OLrzqt;
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
            return this.AEQbTJ == fragment.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, fragment.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, fragment.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowV3PositionList(productType=" + this.AEQbTJ + ", positions=" + this.EZpvd + ", nextAction=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem> */
        /* JADX WARN: Multi-variable type inference failed */
        public Fragment(@NotNull ProductType productType, @NotNull java.util.List<? extends InvestPositionSelectUIItem> list, @NotNull InterfaceC26561jee interfaceC26561jee) {
            Intrinsics.checkNotNullParameter(productType, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(interfaceC26561jee, "");
            this.AEQbTJ = productType;
            this.EZpvd = list;
            this.OLrzqt = interfaceC26561jee;
        }
    }

    /* JADX INFO: renamed from: o.jee$Dialog */
    public static final class Dialog implements InterfaceC26561jee {
        public final InvestRedeemInitialInfo AEQbTJ;
        public final ActionBar EZpvd;
        public final boolean KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, InvestRedeemInitialInfo investRedeemInitialInfo, boolean z, java.lang.String str, ActionBar actionBar, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                investRedeemInitialInfo = dialog.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = dialog.KWHzl;
            }
            if ((i & 4) != 0) {
                str = dialog.OLrzqt;
            }
            if ((i & 8) != 0) {
                actionBar = dialog.EZpvd;
            }
            return dialog.OLrzqt(investRedeemInitialInfo, z, str, actionBar);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestRedeemInitialInfo KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog OLrzqt(@NotNull InvestRedeemInitialInfo investRedeemInitialInfo, boolean z, @NotNull java.lang.String str, @NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(investRedeemInitialInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(actionBar, "");
            return new Dialog(investRedeemInitialInfo, z, str, actionBar);
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
            return Intrinsics.EZpvd(this.AEQbTJ, dialog.AEQbTJ) && this.KWHzl == dialog.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) dialog.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, dialog.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowStakingProductDialog(content=" + this.AEQbTJ + ", shouldPayWithSingleToken=" + this.KWHzl + ", stakingType=" + this.OLrzqt + ", nextAction=" + this.EZpvd + ")";
        }

        public Dialog(@NotNull InvestRedeemInitialInfo investRedeemInitialInfo, boolean z, @NotNull java.lang.String str, @NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(investRedeemInitialInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(actionBar, "");
            this.AEQbTJ = investRedeemInitialInfo;
            this.KWHzl = z;
            this.OLrzqt = str;
            this.EZpvd = actionBar;
        }
    }

    /* JADX INFO: renamed from: o.jee$TaskDescription */
    public static final class TaskDescription implements InterfaceC26561jee {
        public final java.util.List<InvestPositionSelectUIItem> OLrzqt;
        public final ActionBar copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jee$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.List list, ActionBar actionBar, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.OLrzqt;
            }
            if ((i & 2) != 0) {
                actionBar = taskDescription.copydefault;
            }
            return taskDescription.AEQbTJ(list, actionBar);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull java.util.List<? extends InvestPositionSelectUIItem> list, @NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(actionBar, "");
            return new TaskDescription(list, actionBar);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InvestPositionSelectUIItem> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt() {
            return this.copydefault;
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
            return Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowExpiryProductDialog(positions=" + this.OLrzqt + ", nextAction=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull java.util.List<? extends InvestPositionSelectUIItem> list, @NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(actionBar, "");
            this.OLrzqt = list;
            this.copydefault = actionBar;
        }
    }

    /* JADX INFO: renamed from: o.jee$PendingIntent */
    public static final class PendingIntent implements InterfaceC26561jee {
        public final InvestTipInfoVo EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, InvestTipInfoVo investTipInfoVo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                investTipInfoVo = pendingIntent.EZpvd;
            }
            return pendingIntent.AEQbTJ(investTipInfoVo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent AEQbTJ(@NotNull InvestTipInfoVo investTipInfoVo) {
            Intrinsics.checkNotNullParameter(investTipInfoVo, "");
            return new PendingIntent(investTipInfoVo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTipInfoVo OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && Intrinsics.EZpvd(this.EZpvd, ((PendingIntent) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowTransactionRestriction(tips=" + this.EZpvd + ")";
        }

        public PendingIntent(@NotNull InvestTipInfoVo investTipInfoVo) {
            Intrinsics.checkNotNullParameter(investTipInfoVo, "");
            this.EZpvd = investTipInfoVo;
        }
    }

    /* JADX INFO: renamed from: o.jee$ActionBar */
    public static final class ActionBar implements InterfaceC26561jee {
        public final InvestPageSource AEQbTJ;
        public final java.lang.String AYXKKw;
        public final long AhwBna;
        public final java.lang.Long AkhnZx;
        public final InvestOrder DbNXlk;
        public final long EZpvd;
        public final boolean KWHzl;
        public final InvestAssetPositionType OLrzqt;
        public final DeFiTradeExecutorType copydefault;
        public final boolean djBIcL;
        public final TransactionType ejfBZ;
        public final ProductDetailsUserTradeAction fARcdN;
        public final java.lang.String fJNWhG;
        public final ProtocolType fetchVPNInfo;
        public final boolean gEmmrt;
        public final ProductType isConnected;
        public final InvestmentKind valueOf;
        public final java.lang.Long values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestOrder AkhnZx() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long DbNXlk() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestAssetPositionType KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeFiTradeExecutorType OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull TransactionType transactionType, @NotNull ProductType productType, long j, @NotNull InvestmentKind investmentKind, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull ProtocolType protocolType, InvestOrder investOrder, java.lang.Long l, InvestAssetPositionType investAssetPositionType, boolean z2, ProductDetailsUserTradeAction productDetailsUserTradeAction, boolean z3, @NotNull InvestPageSource investPageSource, @NotNull DeFiTradeExecutorType deFiTradeExecutorType, java.lang.Long l2) {
            Intrinsics.checkNotNullParameter(transactionType, "");
            Intrinsics.checkNotNullParameter(productType, "");
            Intrinsics.checkNotNullParameter(investmentKind, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(protocolType, "");
            Intrinsics.checkNotNullParameter(investPageSource, "");
            Intrinsics.checkNotNullParameter(deFiTradeExecutorType, "");
            return new ActionBar(transactionType, productType, j, investmentKind, j2, str, str2, z, protocolType, investOrder, l, investAssetPositionType, z2, productDetailsUserTradeAction, z3, investPageSource, deFiTradeExecutorType, l2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestPageSource copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestmentKind djBIcL() {
            return this.valueOf;
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
            return this.ejfBZ == actionBar.ejfBZ && this.isConnected == actionBar.isConnected && this.AhwBna == actionBar.AhwBna && this.valueOf == actionBar.valueOf && this.EZpvd == actionBar.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) actionBar.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) actionBar.fJNWhG) && this.gEmmrt == actionBar.gEmmrt && this.fetchVPNInfo == actionBar.fetchVPNInfo && Intrinsics.EZpvd(this.DbNXlk, actionBar.DbNXlk) && Intrinsics.EZpvd(this.values, actionBar.values) && this.OLrzqt == actionBar.OLrzqt && this.KWHzl == actionBar.KWHzl && Intrinsics.EZpvd(this.fARcdN, actionBar.fARcdN) && this.djBIcL == actionBar.djBIcL && this.AEQbTJ == actionBar.AEQbTJ && this.copydefault == actionBar.copydefault && Intrinsics.EZpvd(this.AkhnZx, actionBar.AkhnZx);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ProductDetailsUserTradeAction fARcdN() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionType fIwbmz() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long fetchVPNInfo() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.ejfBZ.hashCode();
            int iHashCode2 = this.isConnected.hashCode();
            int iHashCode3 = java.lang.Long.hashCode(this.AhwBna);
            int iHashCode4 = this.valueOf.hashCode();
            int iHashCode5 = java.lang.Long.hashCode(this.EZpvd);
            int iHashCode6 = this.AYXKKw.hashCode();
            int iHashCode7 = this.fJNWhG.hashCode();
            int iHashCode8 = java.lang.Boolean.hashCode(this.gEmmrt);
            int iHashCode9 = this.fetchVPNInfo.hashCode();
            InvestOrder investOrder = this.DbNXlk;
            int iHashCode10 = investOrder == null ? 0 : investOrder.hashCode();
            java.lang.Long l = this.values;
            int iHashCode11 = l == null ? 0 : l.hashCode();
            InvestAssetPositionType investAssetPositionType = this.OLrzqt;
            int iHashCode12 = investAssetPositionType == null ? 0 : investAssetPositionType.hashCode();
            int iHashCode13 = java.lang.Boolean.hashCode(this.KWHzl);
            ProductDetailsUserTradeAction productDetailsUserTradeAction = this.fARcdN;
            int iHashCode14 = productDetailsUserTradeAction == null ? 0 : productDetailsUserTradeAction.hashCode();
            int iHashCode15 = java.lang.Boolean.hashCode(this.djBIcL);
            int iHashCode16 = this.AEQbTJ.hashCode();
            int iHashCode17 = this.copydefault.hashCode();
            java.lang.Long l2 = this.AkhnZx;
            return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (l2 == null ? 0 : l2.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MakeTransaction(transactionType=" + this.ejfBZ + ", productType=" + this.isConnected + ", investmentId=" + this.AhwBna + ", investmentKind=" + this.valueOf + ", chainId=" + this.EZpvd + ", poolId=" + this.AYXKKw + ", tokenId=" + this.fJNWhG + ", payWithSingleToken=" + this.gEmmrt + ", protocolType=" + this.fetchVPNInfo + ", redeemInfo=" + this.DbNXlk + ", relatedInvestmentId=" + this.values + ", assetPositionType=" + this.OLrzqt + ", canUseNewTransactionFlow=" + this.KWHzl + ", userAction=" + this.fARcdN + ", hasMultiProtocol=" + this.djBIcL + ", fromSource=" + this.AEQbTJ + ", executorType=" + this.copydefault + ", stakeId=" + this.AkhnZx + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ProtocolType values() {
            return this.fetchVPNInfo;
        }

        public ActionBar(@NotNull TransactionType transactionType, @NotNull ProductType productType, long j, @NotNull InvestmentKind investmentKind, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull ProtocolType protocolType, InvestOrder investOrder, java.lang.Long l, InvestAssetPositionType investAssetPositionType, boolean z2, ProductDetailsUserTradeAction productDetailsUserTradeAction, boolean z3, @NotNull InvestPageSource investPageSource, @NotNull DeFiTradeExecutorType deFiTradeExecutorType, java.lang.Long l2) {
            Intrinsics.checkNotNullParameter(transactionType, "");
            Intrinsics.checkNotNullParameter(productType, "");
            Intrinsics.checkNotNullParameter(investmentKind, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(protocolType, "");
            Intrinsics.checkNotNullParameter(investPageSource, "");
            Intrinsics.checkNotNullParameter(deFiTradeExecutorType, "");
            this.ejfBZ = transactionType;
            this.isConnected = productType;
            this.AhwBna = j;
            this.valueOf = investmentKind;
            this.EZpvd = j2;
            this.AYXKKw = str;
            this.fJNWhG = str2;
            this.gEmmrt = z;
            this.fetchVPNInfo = protocolType;
            this.DbNXlk = investOrder;
            this.values = l;
            this.OLrzqt = investAssetPositionType;
            this.KWHzl = z2;
            this.fARcdN = productDetailsUserTradeAction;
            this.djBIcL = z3;
            this.AEQbTJ = investPageSource;
            this.copydefault = deFiTradeExecutorType;
            this.AkhnZx = l2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0094: CONSTRUCTOR 
  (r24v0 com.okinc.business.invest_biz.data.contants.TransactionType)
  (r25v0 com.okinc.business.invest_biz.data.contants.ProductType)
  (r26v0 long)
  (wrap:com.okinc.business.invest_biz.data.contants.InvestmentKind:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:48) com.okinc.business.invest_biz.data.contants.InvestmentKind.Default com.okinc.business.invest_biz.data.contants.InvestmentKind) : (r28v0 com.okinc.business.invest_biz.data.contants.InvestmentKind))
  (r29v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r33v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.contants.ProtocolType:?: TERNARY null = ((wrap:int:0x0027: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: SGET  A[WRAPPED] (LINE:53) com.okinc.business.invest_biz.data.contants.ProtocolType.Unknown com.okinc.business.invest_biz.data.contants.ProtocolType) : (r34v0 com.okinc.business.invest_biz.data.contants.ProtocolType))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestOrder:?: TERNARY null = ((wrap:int:0x0031: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestOrder) : (r35v0 com.okinc.business.invest_biz.data.bean.InvestOrder))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x003a: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r36v0 java.lang.Long))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestAssetPositionType:?: TERNARY null = ((wrap:int:0x0042: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestAssetPositionType) : (r37v0 com.okinc.business.invest_biz.data.bean.InvestAssetPositionType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r38v0 boolean))
  (wrap:com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction:?: TERNARY null = ((wrap:int:0x0055: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction) : (r39v0 com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005e: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r40v0 boolean))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource:?: TERNARY null = ((wrap:int:0x006a: ARITH (32768 int) & (r44v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006f: SGET  A[WRAPPED] (LINE:60) com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource.Default com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource) : (r41v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType:?: TERNARY null = ((wrap:int:0x0076: ARITH (65536 int) & (r44v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007b: SGET  A[WRAPPED] (LINE:61) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType.NONE com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType) : (r42v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0082: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r43v0 java.lang.Long))
 A[MD:(com.okinc.business.invest_biz.data.contants.TransactionType, com.okinc.business.invest_biz.data.contants.ProductType, long, com.okinc.business.invest_biz.data.contants.InvestmentKind, long, java.lang.String, java.lang.String, boolean, com.okinc.business.invest_biz.data.contants.ProtocolType, com.okinc.business.invest_biz.data.bean.InvestOrder, java.lang.Long, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, boolean, com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction, boolean, com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType, java.lang.Long):void (m)] (LINE:44) call: o.jee.ActionBar.<init>(com.okinc.business.invest_biz.data.contants.TransactionType, com.okinc.business.invest_biz.data.contants.ProductType, long, com.okinc.business.invest_biz.data.contants.InvestmentKind, long, java.lang.String, java.lang.String, boolean, com.okinc.business.invest_biz.data.contants.ProtocolType, com.okinc.business.invest_biz.data.bean.InvestOrder, java.lang.Long, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, boolean, com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction, boolean, com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType, java.lang.Long):void type: THIS */
        public /* synthetic */ ActionBar(TransactionType transactionType, ProductType productType, long j, InvestmentKind investmentKind, long j2, java.lang.String str, java.lang.String str2, boolean z, ProtocolType protocolType, InvestOrder investOrder, java.lang.Long l, InvestAssetPositionType investAssetPositionType, boolean z2, ProductDetailsUserTradeAction productDetailsUserTradeAction, boolean z3, InvestPageSource investPageSource, DeFiTradeExecutorType deFiTradeExecutorType, java.lang.Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(transactionType, productType, j, (i & 8) != 0 ? InvestmentKind.Default : investmentKind, j2, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? true : z, (i & 256) != 0 ? ProtocolType.Unknown : protocolType, (i & 512) != 0 ? null : investOrder, (i & 1024) != 0 ? null : l, (i & 2048) != 0 ? null : investAssetPositionType, (i & 4096) != 0 ? false : z2, (i & 8192) != 0 ? null : productDetailsUserTradeAction, (i & 16384) != 0 ? false : z3, (32768 & i) != 0 ? InvestPageSource.Default : investPageSource, (65536 & i) != 0 ? DeFiTradeExecutorType.NONE : deFiTradeExecutorType, (i & 131072) != 0 ? null : l2);
        }
    }

    /* JADX INFO: renamed from: o.jee$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator implements InterfaceC26561jee {
        public final int AEQbTJ;
        public final ProductDetailsUserTradeAction EZpvd;
        public final java.lang.String OLrzqt;
        public final java.lang.Long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                i = stateListAnimator.AEQbTJ;
            }
            if ((i2 & 4) != 0) {
                productDetailsUserTradeAction = stateListAnimator.EZpvd;
            }
            if ((i2 & 8) != 0) {
                l = stateListAnimator.copydefault;
            }
            return stateListAnimator.AEQbTJ(str, i, productDetailsUserTradeAction, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ProductDetailsUserTradeAction AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull java.lang.String str, int i, ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str, i, productDetailsUserTradeAction, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
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
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = java.lang.Integer.hashCode(this.AEQbTJ);
            ProductDetailsUserTradeAction productDetailsUserTradeAction = this.EZpvd;
            int iHashCode3 = productDetailsUserTradeAction == null ? 0 : productDetailsUserTradeAction.hashCode();
            java.lang.Long l = this.copydefault;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l != null ? l.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowImpermanentLossReminder(rate=" + this.OLrzqt + ", type=" + this.AEQbTJ + ", userAction=" + this.EZpvd + ", investmentId=" + this.copydefault + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, int i, ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
            this.AEQbTJ = i;
            this.EZpvd = productDetailsUserTradeAction;
            this.copydefault = l;
        }
    }

    /* JADX INFO: renamed from: o.jee$Application */
    public static final class Application implements InterfaceC26561jee {
        public final java.lang.Long KWHzl;
        public final ProductDetailsUserTradeAction OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                productDetailsUserTradeAction = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                l = application.KWHzl;
            }
            return application.copydefault(productDetailsUserTradeAction, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ProductDetailsUserTradeAction KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l) {
            return new Application(productDetailsUserTradeAction, l);
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
            return Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            ProductDetailsUserTradeAction productDetailsUserTradeAction = this.OLrzqt;
            int iHashCode = productDetailsUserTradeAction == null ? 0 : productDetailsUserTradeAction.hashCode();
            java.lang.Long l = this.KWHzl;
            return (iHashCode * 31) + (l != null ? l.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowRiskReminder(userAction=" + this.OLrzqt + ", investmentId=" + this.KWHzl + ")";
        }

        public Application(ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l) {
            this.OLrzqt = productDetailsUserTradeAction;
            this.KWHzl = l;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction) : (r1v0 com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 java.lang.Long))
 A[MD:(com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction, java.lang.Long):void (m)] (LINE:77) call: o.jee.Application.<init>(com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction, java.lang.Long):void type: THIS */
        public /* synthetic */ Application(ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : productDetailsUserTradeAction, (i & 2) != 0 ? 0L : l);
        }
    }
}
