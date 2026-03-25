package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.trade.core.domain.model.CalldataPermit2;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.Permit2Data;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.NetworkFee;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedOrderSubmissionDelegate$buildV6CallDataRequest$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedOrderSubmissionDelegate$handleFailure$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedOrderSubmissionDelegate$handleFailure$2;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedOrderSubmissionDelegate$proceedToOrder$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedOrderSubmissionDelegate$showTradeSubmittedReminder$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedOrderSubmissionDelegate$submitEoaOrder$1$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedOrderSubmissionDelegate$submitPMMOrder$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$3$1$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedOrderSubmissionDelegate$submitTeeMarketOrder$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedOrderSubmissionDelegate$submitTeeMarketOrder$3$1$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedOrderSubmissionDelegate$submitV6EoaOrder$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedOrderSubmissionDelegate$submitV6EoaOrder$3$1$1;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.common.TxDirection;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC28108kPe;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kTt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28231kTt {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC28136kQf AEQbTJ;
    public final kRK AYXKKw;
    public final C28196kSl AhwBna;
    public final InterfaceC28134kQd EZpvd;
    public final InterfaceC28131kQa KWHzl;
    public final kTW copydefault;
    public final kRL djBIcL;
    public final kRJ gEmmrt;

    /* JADX INFO: renamed from: o.kTt$ActionBar */
    public interface ActionBar {
        void AEQbTJ();

        void EZpvd();

        void EZpvd(boolean z);

        void KWHzl();

        void OLrzqt();

        void copydefault();

        void copydefault(InterfaceC30595leC interfaceC30595leC);

        void copydefault(boolean z);
    }

    @yCM
    public C28231kTt(@NotNull kRK krk, @NotNull kRJ krj, @NotNull kRL krl, @NotNull C28196kSl c28196kSl, @NotNull InterfaceC28131kQa interfaceC28131kQa, @NotNull InterfaceC28136kQf interfaceC28136kQf, @NotNull InterfaceC28134kQd interfaceC28134kQd, @NotNull kTW ktw) {
        Intrinsics.checkNotNullParameter(krk, "");
        Intrinsics.checkNotNullParameter(krj, "");
        Intrinsics.checkNotNullParameter(krl, "");
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(interfaceC28131kQa, "");
        Intrinsics.checkNotNullParameter(interfaceC28136kQf, "");
        Intrinsics.checkNotNullParameter(interfaceC28134kQd, "");
        Intrinsics.checkNotNullParameter(ktw, "");
        this.AYXKKw = krk;
        this.gEmmrt = krj;
        this.djBIcL = krl;
        this.AhwBna = c28196kSl;
        this.KWHzl = interfaceC28131kQa;
        this.AEQbTJ = interfaceC28136kQf;
        this.EZpvd = interfaceC28134kQd;
        this.copydefault = ktw;
    }

    /* JADX INFO: renamed from: o.kTt$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kTt.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.kTt$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity {
        public final java.util.List<java.lang.String> AEQbTJ;
        public final java.lang.String AYXKKw;
        public final boolean AhwBna;
        public final AdvancedQuoteUiData AkhnZx;
        public final AdvancedTradeType AuCTel;
        public final CoroutineScope DbNXlk;
        public final boolean EZpvd;
        public final C28222kTk KWHzl;
        public final java.util.List<AdvancedAutoSellStrategy> OLrzqt;
        public final DexMultiTokenInfoBean copydefault;
        public final boolean djBIcL;
        public final java.lang.String fARcdN;
        public final java.lang.String fIwbmz;
        public final C30808liD fJNWhG;
        public final AdvancedLimitBy fetchVPNInfo;
        public final boolean gEmmrt;
        public final java.lang.String isConnected;
        public final boolean valueOf;
        public final AdvancedOrderType values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdvancedLimitBy AYXKKw() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AkhnZx() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AuCTel() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdvancedTradeType DbNXlk() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<AdvancedAutoSellStrategy> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DexMultiTokenInfoBean OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull CoroutineScope coroutineScope, @NotNull AdvancedTradeType advancedTradeType, @NotNull AdvancedOrderType advancedOrderType, DexMultiTokenInfoBean dexMultiTokenInfoBean, C30808liD c30808liD, AdvancedQuoteUiData advancedQuoteUiData, java.util.List<? extends AdvancedAutoSellStrategy> list, java.util.List<java.lang.String> list2, @NotNull AdvancedLimitBy advancedLimitBy, @NotNull C28222kTk c28222kTk, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull java.lang.String str3, java.lang.String str4) {
            Intrinsics.checkNotNullParameter(coroutineScope, "");
            Intrinsics.checkNotNullParameter(advancedTradeType, "");
            Intrinsics.checkNotNullParameter(advancedOrderType, "");
            Intrinsics.checkNotNullParameter(advancedLimitBy, "");
            Intrinsics.checkNotNullParameter(c28222kTk, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new Activity(coroutineScope, advancedTradeType, advancedOrderType, dexMultiTokenInfoBean, c30808liD, advancedQuoteUiData, list, list2, advancedLimitBy, c28222kTk, str, str2, z, z2, z3, z4, z5, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C28222kTk copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CoroutineScope djBIcL() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean ejfBZ() {
            return this.djBIcL;
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
            return Intrinsics.EZpvd(this.DbNXlk, activity.DbNXlk) && this.AuCTel == activity.AuCTel && this.values == activity.values && Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd(this.fJNWhG, activity.fJNWhG) && Intrinsics.EZpvd(this.AkhnZx, activity.AkhnZx) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && this.fetchVPNInfo == activity.fetchVPNInfo && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) activity.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) activity.AYXKKw) && this.AhwBna == activity.AhwBna && this.djBIcL == activity.djBIcL && this.EZpvd == activity.EZpvd && this.gEmmrt == activity.gEmmrt && this.valueOf == activity.valueOf && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) activity.fIwbmz) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) activity.fARcdN);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean fJNWhG() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C30808liD fetchVPNInfo() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdvancedOrderType gEmmrt() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.DbNXlk.hashCode();
            int iHashCode2 = this.AuCTel.hashCode();
            int iHashCode3 = this.values.hashCode();
            DexMultiTokenInfoBean dexMultiTokenInfoBean = this.copydefault;
            int iHashCode4 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
            C30808liD c30808liD = this.fJNWhG;
            int iHashCode5 = c30808liD == null ? 0 : c30808liD.hashCode();
            AdvancedQuoteUiData advancedQuoteUiData = this.AkhnZx;
            int iHashCode6 = advancedQuoteUiData == null ? 0 : advancedQuoteUiData.hashCode();
            java.util.List<AdvancedAutoSellStrategy> list = this.OLrzqt;
            int iHashCode7 = list == null ? 0 : list.hashCode();
            java.util.List<java.lang.String> list2 = this.AEQbTJ;
            int iHashCode8 = list2 == null ? 0 : list2.hashCode();
            int iHashCode9 = this.fetchVPNInfo.hashCode();
            int iHashCode10 = this.KWHzl.hashCode();
            int iHashCode11 = this.isConnected.hashCode();
            int iHashCode12 = this.AYXKKw.hashCode();
            int iHashCode13 = java.lang.Boolean.hashCode(this.AhwBna);
            int iHashCode14 = java.lang.Boolean.hashCode(this.djBIcL);
            int iHashCode15 = java.lang.Boolean.hashCode(this.EZpvd);
            int iHashCode16 = java.lang.Boolean.hashCode(this.gEmmrt);
            int iHashCode17 = java.lang.Boolean.hashCode(this.valueOf);
            int iHashCode18 = this.fIwbmz.hashCode();
            java.lang.String str = this.fARcdN;
            return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SubmissionSnapshot(scope=" + this.DbNXlk + ", tradeType=" + this.AuCTel + ", orderType=" + this.values + ", fromToken=" + this.copydefault + ", settingModel=" + this.fJNWhG + ", quoteUiData=" + this.AkhnZx + ", autoSellStrategies=" + this.OLrzqt + ", dexIds=" + this.AEQbTJ + ", limitOrderBy=" + this.fetchVPNInfo + ", baseMarketInfo=" + this.KWHzl + ", selectedDeFiPlatformId=" + this.isConnected + ", limitInput=" + this.AYXKKw + ", isMCapSupportedForLimit=" + this.AhwBna + ", isSAEnabled=" + this.djBIcL + ", canUseSmartAccount=" + this.EZpvd + ", isMarketOrderUseEoaSigning=" + this.gEmmrt + ", isTEEWallet=" + this.valueOf + ", userWalletAddress=" + this.fIwbmz + ", walletId=" + this.fARcdN + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdvancedQuoteUiData valueOf() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: java.util.List<? extends com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull CoroutineScope coroutineScope, @NotNull AdvancedTradeType advancedTradeType, @NotNull AdvancedOrderType advancedOrderType, DexMultiTokenInfoBean dexMultiTokenInfoBean, C30808liD c30808liD, AdvancedQuoteUiData advancedQuoteUiData, java.util.List<? extends AdvancedAutoSellStrategy> list, java.util.List<java.lang.String> list2, @NotNull AdvancedLimitBy advancedLimitBy, @NotNull C28222kTk c28222kTk, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull java.lang.String str3, java.lang.String str4) {
            Intrinsics.checkNotNullParameter(coroutineScope, "");
            Intrinsics.checkNotNullParameter(advancedTradeType, "");
            Intrinsics.checkNotNullParameter(advancedOrderType, "");
            Intrinsics.checkNotNullParameter(advancedLimitBy, "");
            Intrinsics.checkNotNullParameter(c28222kTk, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.DbNXlk = coroutineScope;
            this.AuCTel = advancedTradeType;
            this.values = advancedOrderType;
            this.copydefault = dexMultiTokenInfoBean;
            this.fJNWhG = c30808liD;
            this.AkhnZx = advancedQuoteUiData;
            this.OLrzqt = list;
            this.AEQbTJ = list2;
            this.fetchVPNInfo = advancedLimitBy;
            this.KWHzl = c28222kTk;
            this.isConnected = str;
            this.AYXKKw = str2;
            this.AhwBna = z;
            this.djBIcL = z2;
            this.EZpvd = z3;
            this.gEmmrt = z4;
            this.valueOf = z5;
            this.fIwbmz = str3;
            this.fARcdN = str4;
        }
    }

    public final void OLrzqt(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity.gEmmrt() == AdvancedOrderType.LIMIT) {
            return;
        }
        this.EZpvd.KWHzl(new AbstractC28108kPe.TaskDescription(EZpvd(activity)));
    }

    public final void copydefault(Activity activity) {
        if (activity.gEmmrt() == AdvancedOrderType.LIMIT) {
            return;
        }
        this.EZpvd.KWHzl(new AbstractC28108kPe.FragmentManager(EZpvd(activity)));
    }

    public final void AEQbTJ(Activity activity) {
        if (activity.gEmmrt() == AdvancedOrderType.LIMIT) {
            return;
        }
        this.EZpvd.KWHzl(new AbstractC28108kPe.ActionBar(EZpvd(activity)));
    }

    public final void AEQbTJ(Activity activity, java.lang.String str) {
        if (activity.gEmmrt() == AdvancedOrderType.LIMIT) {
            return;
        }
        this.EZpvd.KWHzl(new AbstractC28108kPe.Activity(EZpvd(activity), str));
    }

    public final C28109kPf EZpvd(Activity activity) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt = activity.OLrzqt();
        java.lang.String fieldNames = null;
        java.lang.String chainId = dexMultiTokenInfoBeanOLrzqt != null ? dexMultiTokenInfoBeanOLrzqt.getChainId() : null;
        java.lang.String str = chainId == null ? "" : chainId;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt2 = activity.OLrzqt();
        java.lang.String chainName = dexMultiTokenInfoBeanOLrzqt2 != null ? dexMultiTokenInfoBeanOLrzqt2.getChainName() : null;
        java.lang.String str2 = chainName == null ? "" : chainName;
        AdvancedQuoteUiData advancedQuoteUiDataValueOf = activity.valueOf();
        if (advancedQuoteUiDataValueOf != null && (advancedQuoteAndCallDataKWHzl = advancedQuoteUiDataValueOf.KWHzl()) != null) {
            fieldNames = advancedQuoteAndCallDataKWHzl.getFieldNames();
        }
        return new C28109kPf(str, str2, "advanced", "swap", fieldNames == null ? "" : fieldNames, activity.AuCTel());
    }

    public final void copydefault(@NotNull final FragmentActivity fragmentActivity, @NotNull final Activity activity, @NotNull final ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        copydefault(activity);
        InterfaceC28131kQa interfaceC28131kQa = this.KWHzl;
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        interfaceC28131kQa.copydefault(supportFragmentManager, null, new Function0() { // from class: o.kTu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28231kTt.copydefault(this.AEQbTJ, fragmentActivity, activity, actionBar);
            }
        });
    }

    public static final Unit copydefault(C28231kTt c28231kTt, FragmentActivity fragmentActivity, Activity activity, ActionBar actionBar) {
        c28231kTt.AEQbTJ(fragmentActivity, activity, actionBar);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull Activity activity, @NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        AEQbTJ(activity);
        C25389ivm.safeLaunch$default(activity.djBIcL(), null, null, new AdvancedOrderSubmissionDelegate$proceedToOrder$1(actionBar, activity, this, fragmentActivity, null), 3, null);
    }

    public static /* synthetic */ java.lang.Object submitTeeMarketOrder$default(C28231kTt c28231kTt, FragmentActivity fragmentActivity, V6BaseQuoteResponse v6BaseQuoteResponse, Activity activity, ActionBar actionBar, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return c28231kTt.EZpvd(fragmentActivity, v6BaseQuoteResponse, activity, actionBar, z, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(FragmentActivity fragmentActivity, V6BaseQuoteResponse v6BaseQuoteResponse, Activity activity, ActionBar actionBar, boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AdvancedOrderSubmissionDelegate$submitTeeMarketOrder$1 advancedOrderSubmissionDelegate$submitTeeMarketOrder$1;
        java.lang.String str;
        java.lang.Object objKWHzl;
        C28231kTt c28231kTt;
        FragmentActivity fragmentActivity2;
        V6BaseQuoteResponse v6BaseQuoteResponse2;
        Activity activity2;
        ActionBar actionBar2 = actionBar;
        if (continuation instanceof AdvancedOrderSubmissionDelegate$submitTeeMarketOrder$1) {
            advancedOrderSubmissionDelegate$submitTeeMarketOrder$1 = (AdvancedOrderSubmissionDelegate$submitTeeMarketOrder$1) continuation;
            int i = advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedOrderSubmissionDelegate$submitTeeMarketOrder$1 = new AdvancedOrderSubmissionDelegate$submitTeeMarketOrder$1(this, continuation);
            }
        }
        java.lang.Object obj = advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("OrderSubmissionDelegate", "submitTeeMarketOrder -> forceManualSign=" + z);
            C30808liD c30808liDFetchVPNInfo = activity.fetchVPNInfo();
            if (c30808liDFetchVPNInfo == null) {
                return Unit.INSTANCE;
            }
            kRJ krj = this.gEmmrt;
            java.util.List<AdvancedAutoSellStrategy> listEZpvd = activity.EZpvd();
            java.util.List<java.lang.String> listKWHzl = activity.KWHzl();
            SlippageMode slippageModeAYXKKw = c30808liDFetchVPNInfo.AYXKKw();
            if (slippageModeAYXKKw == null) {
                slippageModeAYXKKw = SlippageMode.Dynamic;
            }
            SlippageMode slippageMode = slippageModeAYXKKw;
            java.lang.String strValues = activity.values();
            TxDirection txDirectionAEQbTJ = TxDirection.Companion.AEQbTJ(activity.DbNXlk());
            boolean zKWHzl = this.copydefault.KWHzl(z, v6BaseQuoteResponse.isOKXPlatform(), v6BaseQuoteResponse.isAutoConfirmQuotaRemaining());
            InterfaceC9740bbL.TaskDescription taskDescriptionOLrzqt = OLrzqt(actionBar2);
            advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.L$0 = this;
            advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.L$1 = fragmentActivity;
            advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.L$2 = v6BaseQuoteResponse;
            advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.L$3 = activity;
            advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.L$4 = actionBar2;
            advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.label = 1;
            str = "OrderSubmissionDelegate";
            objKWHzl = krj.KWHzl(v6BaseQuoteResponse, c30808liDFetchVPNInfo, listEZpvd, listKWHzl, slippageMode, strValues, txDirectionAEQbTJ, fragmentActivity, zKWHzl, taskDescriptionOLrzqt, advancedOrderSubmissionDelegate$submitTeeMarketOrder$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c28231kTt = this;
            fragmentActivity2 = fragmentActivity;
            v6BaseQuoteResponse2 = v6BaseQuoteResponse;
            activity2 = activity;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar2 = (ActionBar) advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.L$4;
            activity2 = (Activity) advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.L$3;
            v6BaseQuoteResponse2 = (V6BaseQuoteResponse) advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.L$2;
            fragmentActivity2 = (FragmentActivity) advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.L$1;
            c28231kTt = (C28231kTt) advancedOrderSubmissionDelegate$submitTeeMarketOrder$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
            str = "OrderSubmissionDelegate";
        }
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            java.lang.String str2 = (java.lang.String) objKWHzl;
            pUU.KWHzl(str, "submitTeeMarketOrder success: " + str2);
            c28231kTt.AEQbTJ(activity2, str2);
            actionBar2.OLrzqt();
            c28231kTt.OLrzqt(v6BaseQuoteResponse2, activity2, actionBar2);
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ(str, "submitTeeMarketOrder error", thM7380exceptionOrNullimpl);
            final Activity activity3 = activity2;
            final C28231kTt c28231kTt2 = c28231kTt;
            final FragmentActivity fragmentActivity3 = fragmentActivity2;
            final V6BaseQuoteResponse v6BaseQuoteResponse3 = v6BaseQuoteResponse2;
            final ActionBar actionBar3 = actionBar2;
            c28231kTt.EZpvd(thM7380exceptionOrNullimpl, activity2, actionBar2, new Function1() { // from class: o.kTq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C28231kTt.OLrzqt(activity3, c28231kTt2, fragmentActivity3, v6BaseQuoteResponse3, actionBar3, ((java.lang.Boolean) obj2).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Activity activity, C28231kTt c28231kTt, FragmentActivity fragmentActivity, V6BaseQuoteResponse v6BaseQuoteResponse, ActionBar actionBar, boolean z) {
        pUU.KWHzl("OrderSubmissionDelegate", "RETRY -> MARKET V6 -> forceManualSign=" + z);
        C25389ivm.safeLaunch$default(activity.djBIcL(), null, null, new AdvancedOrderSubmissionDelegate$submitTeeMarketOrder$3$1$1(c28231kTt, fragmentActivity, v6BaseQuoteResponse, activity, actionBar, z, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(V6BaseQuoteResponse v6BaseQuoteResponse, Activity activity, ActionBar actionBar) {
        V6CalldataResponseData transactionData;
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        if (((selectedDeFiPlatform == null || (transactionData = selectedDeFiPlatform.getTransactionData()) == null) ? null : transactionData.getApproveTxInfo()) != null) {
            C25389ivm.safeLaunch$default(activity.djBIcL(), null, null, new AdvancedOrderSubmissionDelegate$showTradeSubmittedReminder$1(actionBar, null), 3, null);
        }
    }

    public static /* synthetic */ java.lang.Object submitTeeLimitOrder$default(C28231kTt c28231kTt, FragmentActivity fragmentActivity, Activity activity, ActionBar actionBar, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c28231kTt.EZpvd(fragmentActivity, activity, actionBar, z, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(FragmentActivity fragmentActivity, Activity activity, ActionBar actionBar, boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$1 advancedOrderSubmissionDelegate$submitTeeLimitOrder$1;
        java.lang.String str;
        final FragmentActivity fragmentActivity2;
        final Activity activity2;
        java.lang.Object objM7386unboximpl;
        final C28231kTt c28231kTt;
        final ActionBar actionBar2 = actionBar;
        if (continuation instanceof AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$1) {
            advancedOrderSubmissionDelegate$submitTeeLimitOrder$1 = (AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$1) continuation;
            int i = advancedOrderSubmissionDelegate$submitTeeLimitOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedOrderSubmissionDelegate$submitTeeLimitOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedOrderSubmissionDelegate$submitTeeLimitOrder$1 = new AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$1(this, continuation);
            }
        }
        java.lang.Object obj = advancedOrderSubmissionDelegate$submitTeeLimitOrder$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedOrderSubmissionDelegate$submitTeeLimitOrder$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AdvancedQuoteUiData advancedQuoteUiDataValueOf = activity.valueOf();
            AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl = advancedQuoteUiDataValueOf != null ? advancedQuoteUiDataValueOf.KWHzl() : null;
            AdvancedQuoteAndCallData.LegacyLimit legacyLimit = advancedQuoteAndCallDataKWHzl instanceof AdvancedQuoteAndCallData.LegacyLimit ? (AdvancedQuoteAndCallData.LegacyLimit) advancedQuoteAndCallDataKWHzl : null;
            if (legacyLimit == null) {
                return Unit.INSTANCE;
            }
            pUU.KWHzl("OrderSubmissionDelegate", "submitTeeLimitOrder -> forceManualSign=" + z);
            kRL krl = this.djBIcL;
            TokenPairRateQuote tokenPairRateQuoteSSMYrx = legacyLimit.sSMYrx();
            C30808liD c30808liDFetchVPNInfo = activity.fetchVPNInfo();
            C28222kTk c28222kTkCopydefault = activity.copydefault();
            java.util.List<java.lang.String> listKWHzl = activity.KWHzl();
            AdvancedTradeType advancedTradeTypeDbNXlk = activity.DbNXlk();
            java.lang.String strAhwBna = activity.AYXKKw() == AdvancedLimitBy.Price ? activity.AhwBna() : "";
            java.lang.String strAhwBna2 = activity.AYXKKw() == AdvancedLimitBy.MCap ? activity.AhwBna() : "";
            InterfaceC9740bbL.TaskDescription taskDescriptionOLrzqt = OLrzqt(actionBar2);
            boolean zAkhnZx = activity.AkhnZx();
            advancedOrderSubmissionDelegate$submitTeeLimitOrder$1.L$0 = this;
            advancedOrderSubmissionDelegate$submitTeeLimitOrder$1.L$1 = fragmentActivity;
            advancedOrderSubmissionDelegate$submitTeeLimitOrder$1.L$2 = activity;
            advancedOrderSubmissionDelegate$submitTeeLimitOrder$1.L$3 = actionBar2;
            advancedOrderSubmissionDelegate$submitTeeLimitOrder$1.label = 1;
            str = "OrderSubmissionDelegate";
            java.lang.Object objCopydefault2 = krl.copydefault(tokenPairRateQuoteSSMYrx, c30808liDFetchVPNInfo, listKWHzl, c28222kTkCopydefault, strAhwBna, strAhwBna2, advancedTradeTypeDbNXlk, z, fragmentActivity, taskDescriptionOLrzqt, zAkhnZx, advancedOrderSubmissionDelegate$submitTeeLimitOrder$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            fragmentActivity2 = fragmentActivity;
            activity2 = activity;
            objM7386unboximpl = objCopydefault2;
            c28231kTt = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar2 = (ActionBar) advancedOrderSubmissionDelegate$submitTeeLimitOrder$1.L$3;
            activity2 = (Activity) advancedOrderSubmissionDelegate$submitTeeLimitOrder$1.L$2;
            fragmentActivity2 = (FragmentActivity) advancedOrderSubmissionDelegate$submitTeeLimitOrder$1.L$1;
            c28231kTt = (C28231kTt) advancedOrderSubmissionDelegate$submitTeeLimitOrder$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            str = "OrderSubmissionDelegate";
        }
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            pUU.KWHzl(str, "submitTeeLimitOrder success: " + ((LimitOrderDetailBean) objM7386unboximpl));
            actionBar2.OLrzqt();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ(str, "submitTeeLimitOrder error", thM7380exceptionOrNullimpl);
            c28231kTt.EZpvd(thM7380exceptionOrNullimpl, activity2, actionBar2, new Function1() { // from class: o.kTx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C28231kTt.OLrzqt(activity2, c28231kTt, fragmentActivity2, actionBar2, ((java.lang.Boolean) obj2).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Activity activity, C28231kTt c28231kTt, FragmentActivity fragmentActivity, ActionBar actionBar, boolean z) {
        pUU.KWHzl("OrderSubmissionDelegate", "RETRY -> LIMIT -> submitTeeLimitOrder -> forceManualSign=" + z);
        C25389ivm.safeLaunch$default(activity.djBIcL(), null, null, new AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$3$1$1(c28231kTt, fragmentActivity, activity, actionBar, z, null), 3, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void submitEoaOrder$default(C28231kTt c28231kTt, FragmentActivity fragmentActivity, V6BaseQuoteResponse v6BaseQuoteResponse, Activity activity, ActionBar actionBar, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        c28231kTt.AEQbTJ(fragmentActivity, v6BaseQuoteResponse, activity, actionBar, z);
    }

    public final void AEQbTJ(final FragmentActivity fragmentActivity, final V6BaseQuoteResponse v6BaseQuoteResponse, final Activity activity, final ActionBar actionBar, final boolean z) {
        Permit2Data permit2Data;
        final DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        InterfaceC28136kQf interfaceC28136kQf = this.AEQbTJ;
        java.lang.String unsignedTx = (selectedDeFiPlatform == null || (permit2Data = selectedDeFiPlatform.getPermit2Data()) == null) ? null : permit2Data.getUnsignedTx();
        java.lang.String defiPlatformId = selectedDeFiPlatform != null ? selectedDeFiPlatform.getDefiPlatformId() : null;
        java.lang.String name = selectedDeFiPlatform != null ? selectedDeFiPlatform.getName() : null;
        java.lang.String logo = selectedDeFiPlatform != null ? selectedDeFiPlatform.getLogo() : null;
        java.lang.String strIsConnected = activity.isConnected();
        java.lang.String str = strIsConnected == null ? "" : strIsConnected;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt = activity.OLrzqt();
        java.lang.String chainId = dexMultiTokenInfoBeanOLrzqt != null ? dexMultiTokenInfoBeanOLrzqt.getChainId() : null;
        interfaceC28136kQf.copydefault(fragmentActivity, unsignedTx, defiPlatformId, name, logo, str, chainId == null ? "" : chainId, new Function2() { // from class: o.kTy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28231kTt.KWHzl(z, activity, actionBar, selectedDeFiPlatform, this, fragmentActivity, v6BaseQuoteResponse, (java.lang.Integer) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final Unit KWHzl(boolean z, Activity activity, ActionBar actionBar, DefiPlatformInfo defiPlatformInfo, C28231kTt c28231kTt, FragmentActivity fragmentActivity, V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.Integer num, java.lang.String str) {
        pUU.KWHzl("OrderSubmissionDelegate", "submitEoaOrder -> " + z);
        if (num != null) {
            if (num.intValue() != -1) {
                pUU.KWHzl("Permit2Helper", "Permit2 signing failed");
            }
            BuildersKt__Builders_commonKt.launch$default(activity.djBIcL(), null, null, new AdvancedOrderSubmissionDelegate$submitEoaOrder$1$1(defiPlatformInfo, c28231kTt, fragmentActivity, v6BaseQuoteResponse, activity, actionBar, str, z, null), 3, null);
        } else {
            actionBar.EZpvd(false);
            pUU.KWHzl("Permit2Helper", "Permit2 signing cancelled");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(FragmentActivity fragmentActivity, V6BaseQuoteResponse v6BaseQuoteResponse, Activity activity, ActionBar actionBar, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AdvancedOrderSubmissionDelegate$submitPMMOrder$1 advancedOrderSubmissionDelegate$submitPMMOrder$1;
        java.lang.Object objOLrzqt;
        C28231kTt c28231kTt;
        if (continuation instanceof AdvancedOrderSubmissionDelegate$submitPMMOrder$1) {
            advancedOrderSubmissionDelegate$submitPMMOrder$1 = (AdvancedOrderSubmissionDelegate$submitPMMOrder$1) continuation;
            int i = advancedOrderSubmissionDelegate$submitPMMOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedOrderSubmissionDelegate$submitPMMOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedOrderSubmissionDelegate$submitPMMOrder$1 = new AdvancedOrderSubmissionDelegate$submitPMMOrder$1(this, continuation);
            }
        }
        AdvancedOrderSubmissionDelegate$submitPMMOrder$1 advancedOrderSubmissionDelegate$submitPMMOrder$12 = advancedOrderSubmissionDelegate$submitPMMOrder$1;
        java.lang.Object obj = advancedOrderSubmissionDelegate$submitPMMOrder$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedOrderSubmissionDelegate$submitPMMOrder$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            kRK krk = this.AYXKKw;
            int value = TxDirection.Companion.AEQbTJ(activity.DbNXlk()).getValue();
            InterfaceC9740bbL.TaskDescription taskDescriptionOLrzqt = OLrzqt(actionBar);
            advancedOrderSubmissionDelegate$submitPMMOrder$12.L$0 = this;
            advancedOrderSubmissionDelegate$submitPMMOrder$12.L$1 = activity;
            advancedOrderSubmissionDelegate$submitPMMOrder$12.L$2 = actionBar;
            advancedOrderSubmissionDelegate$submitPMMOrder$12.label = 1;
            objOLrzqt = krk.OLrzqt(v6BaseQuoteResponse, value, fragmentActivity, false, taskDescriptionOLrzqt, advancedOrderSubmissionDelegate$submitPMMOrder$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c28231kTt = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (ActionBar) advancedOrderSubmissionDelegate$submitPMMOrder$12.L$2;
            activity = (Activity) advancedOrderSubmissionDelegate$submitPMMOrder$12.L$1;
            c28231kTt = (C28231kTt) advancedOrderSubmissionDelegate$submitPMMOrder$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            pUU.KWHzl("OrderSubmissionDelegate", "submitEoaOrder PMM success");
            actionBar.OLrzqt();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl("OrderSubmissionDelegate", "submitEoaOrder PMM failure, entering retry handler");
            c28231kTt.EZpvd(thM7380exceptionOrNullimpl, activity, actionBar, new Function1() { // from class: o.kTw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C28231kTt.AEQbTJ(((java.lang.Boolean) obj2).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z) {
        pUU.copydefault("OrderSubmissionDelegate", "EOA JWT Retry isPMM V6 -> Should NEVER reach here");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(FragmentActivity fragmentActivity, V6BaseQuoteResponse v6BaseQuoteResponse, Activity activity, ActionBar actionBar, java.lang.String str, boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AdvancedOrderSubmissionDelegate$submitV6EoaOrder$1 advancedOrderSubmissionDelegate$submitV6EoaOrder$1;
        kRK krk;
        java.lang.Object objEZpvd;
        C28231kTt c28231kTt;
        boolean z2;
        ActionBar actionBar2;
        Activity activity2;
        V6BaseQuoteResponse v6BaseQuoteResponse2;
        FragmentActivity fragmentActivity2;
        V6BaseQuoteResponse v6BaseQuoteResponse3;
        java.lang.Object obj;
        C28231kTt c28231kTt2;
        FragmentActivity fragmentActivity3;
        ActionBar actionBar3;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof AdvancedOrderSubmissionDelegate$submitV6EoaOrder$1) {
            advancedOrderSubmissionDelegate$submitV6EoaOrder$1 = (AdvancedOrderSubmissionDelegate$submitV6EoaOrder$1) continuation;
            int i = advancedOrderSubmissionDelegate$submitV6EoaOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedOrderSubmissionDelegate$submitV6EoaOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedOrderSubmissionDelegate$submitV6EoaOrder$1 = new AdvancedOrderSubmissionDelegate$submitV6EoaOrder$1(this, continuation);
            }
        }
        AdvancedOrderSubmissionDelegate$submitV6EoaOrder$1 advancedOrderSubmissionDelegate$submitV6EoaOrder$12 = advancedOrderSubmissionDelegate$submitV6EoaOrder$1;
        java.lang.Object obj2 = advancedOrderSubmissionDelegate$submitV6EoaOrder$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedOrderSubmissionDelegate$submitV6EoaOrder$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            boolean zKWHzl = this.copydefault.KWHzl(z, v6BaseQuoteResponse.isOKXPlatform(), v6BaseQuoteResponse.isAutoConfirmQuotaRemaining());
            krk = this.AYXKKw;
            advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$0 = this;
            advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$1 = fragmentActivity;
            advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$2 = v6BaseQuoteResponse;
            advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$3 = activity;
            advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$4 = actionBar;
            advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$5 = krk;
            advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$6 = v6BaseQuoteResponse;
            advancedOrderSubmissionDelegate$submitV6EoaOrder$12.Z$0 = zKWHzl;
            advancedOrderSubmissionDelegate$submitV6EoaOrder$12.label = 1;
            objEZpvd = EZpvd(v6BaseQuoteResponse, activity, str, advancedOrderSubmissionDelegate$submitV6EoaOrder$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c28231kTt = this;
            z2 = zKWHzl;
            actionBar2 = actionBar;
            activity2 = activity;
            v6BaseQuoteResponse2 = v6BaseQuoteResponse;
            fragmentActivity2 = fragmentActivity;
            v6BaseQuoteResponse3 = v6BaseQuoteResponse2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                actionBar3 = (ActionBar) advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$4;
                Activity activity3 = (Activity) advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$3;
                V6BaseQuoteResponse v6BaseQuoteResponse4 = (V6BaseQuoteResponse) advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$2;
                fragmentActivity3 = (FragmentActivity) advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$1;
                c28231kTt2 = (C28231kTt) advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$0;
                C56391yDq.AEQbTJ(obj2);
                java.lang.Object objM7386unboximpl = ((Result) obj2).m7386unboximpl();
                activity2 = activity3;
                v6BaseQuoteResponse2 = v6BaseQuoteResponse4;
                obj = objM7386unboximpl;
                if (Result.m7384isSuccessimpl(obj)) {
                    pUU.KWHzl("OrderSubmissionDelegate", "submitEoaOrder success");
                    c28231kTt2.AEQbTJ(activity2, (java.lang.String) obj);
                    actionBar3.OLrzqt();
                    c28231kTt2.OLrzqt(v6BaseQuoteResponse2, activity2, actionBar3);
                    if (v6BaseQuoteResponse2.isOKXPlatform()) {
                        actionBar3.KWHzl();
                    }
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.KWHzl("OrderSubmissionDelegate", "submitEoaOrder failure, entering retry handler");
                    final Activity activity4 = activity2;
                    final C28231kTt c28231kTt3 = c28231kTt2;
                    final FragmentActivity fragmentActivity4 = fragmentActivity3;
                    final V6BaseQuoteResponse v6BaseQuoteResponse5 = v6BaseQuoteResponse2;
                    final ActionBar actionBar4 = actionBar3;
                    c28231kTt2.EZpvd(thM7380exceptionOrNullimpl, activity2, actionBar3, new Function1() { // from class: o.kTv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return C28231kTt.AEQbTJ(activity4, c28231kTt3, fragmentActivity4, v6BaseQuoteResponse5, actionBar4, ((java.lang.Boolean) obj3).booleanValue());
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            boolean z3 = advancedOrderSubmissionDelegate$submitV6EoaOrder$12.Z$0;
            V6BaseQuoteResponse v6BaseQuoteResponse6 = (V6BaseQuoteResponse) advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$6;
            krk = (kRK) advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$5;
            ActionBar actionBar5 = (ActionBar) advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$4;
            Activity activity5 = (Activity) advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$3;
            V6BaseQuoteResponse v6BaseQuoteResponse7 = (V6BaseQuoteResponse) advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$2;
            FragmentActivity fragmentActivity5 = (FragmentActivity) advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$1;
            C28231kTt c28231kTt4 = (C28231kTt) advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$0;
            C56391yDq.AEQbTJ(obj2);
            c28231kTt = c28231kTt4;
            actionBar2 = actionBar5;
            v6BaseQuoteResponse3 = v6BaseQuoteResponse6;
            v6BaseQuoteResponse2 = v6BaseQuoteResponse7;
            objEZpvd = obj2;
            activity2 = activity5;
            z2 = z3;
            fragmentActivity2 = fragmentActivity5;
        }
        V6CalldataRequest v6CalldataRequest = (V6CalldataRequest) objEZpvd;
        C30808liD c30808liDFetchVPNInfo = activity2.fetchVPNInfo();
        boolean z4 = c30808liDFetchVPNInfo != null && c30808liDFetchVPNInfo.fetchVPNInfo();
        InterfaceC9740bbL.TaskDescription taskDescriptionOLrzqt = c28231kTt.OLrzqt(actionBar2);
        advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$0 = c28231kTt;
        advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$1 = fragmentActivity2;
        advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$2 = v6BaseQuoteResponse2;
        advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$3 = activity2;
        advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$4 = actionBar2;
        advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$5 = null;
        advancedOrderSubmissionDelegate$submitV6EoaOrder$12.L$6 = null;
        advancedOrderSubmissionDelegate$submitV6EoaOrder$12.label = 2;
        java.lang.Object objEZpvd2 = krk.EZpvd(v6BaseQuoteResponse3, v6CalldataRequest, z4, fragmentActivity2, z2, taskDescriptionOLrzqt, advancedOrderSubmissionDelegate$submitV6EoaOrder$12);
        if (objEZpvd2 == objCopydefault) {
            return objCopydefault;
        }
        obj = objEZpvd2;
        c28231kTt2 = c28231kTt;
        fragmentActivity3 = fragmentActivity2;
        actionBar3 = actionBar2;
        if (Result.m7384isSuccessimpl(obj)) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Activity activity, C28231kTt c28231kTt, FragmentActivity fragmentActivity, V6BaseQuoteResponse v6BaseQuoteResponse, ActionBar actionBar, boolean z) {
        pUU.KWHzl("OrderSubmissionDelegate", "RETRY -> EOA Retry V6 -> submitEoaOrder, forceManualSign=" + z);
        C25389ivm.safeLaunch$default(activity.djBIcL(), null, null, new AdvancedOrderSubmissionDelegate$submitV6EoaOrder$3$1$1(c28231kTt, fragmentActivity, v6BaseQuoteResponse, activity, actionBar, z, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(V6BaseQuoteResponse v6BaseQuoteResponse, Activity activity, java.lang.String str, Continuation<? super V6CalldataRequest> continuation) throws java.lang.Throwable {
        AdvancedOrderSubmissionDelegate$buildV6CallDataRequest$1 advancedOrderSubmissionDelegate$buildV6CallDataRequest$1;
        C30808liD c30808liDFetchVPNInfo;
        DefiPlatformInfo selectedDeFiPlatform;
        java.lang.String strValueOf;
        int value;
        SlippageMode slippageModeAYXKKw;
        Activity activity2;
        boolean z;
        Activity activity3;
        int i;
        java.lang.String str2;
        NetworkFee networkFee;
        java.lang.String str3;
        java.lang.String str4;
        SlippageConfig slippageConfig;
        java.lang.String value2;
        CalldataPermit2 calldataPermit2;
        Permit2Data permit2Data;
        if (continuation instanceof AdvancedOrderSubmissionDelegate$buildV6CallDataRequest$1) {
            advancedOrderSubmissionDelegate$buildV6CallDataRequest$1 = (AdvancedOrderSubmissionDelegate$buildV6CallDataRequest$1) continuation;
            int i2 = advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.label = i2 - Integer.MIN_VALUE;
            } else {
                advancedOrderSubmissionDelegate$buildV6CallDataRequest$1 = new AdvancedOrderSubmissionDelegate$buildV6CallDataRequest$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            c30808liDFetchVPNInfo = activity.fetchVPNInfo();
            selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
            if (activity.DbNXlk() == AdvancedTradeType.BUY) {
                strValueOf = java.lang.String.valueOf(TxDirection.BUY.getValue());
            } else {
                strValueOf = java.lang.String.valueOf(TxDirection.SELL.getValue());
            }
            java.lang.String str5 = strValueOf;
            java.lang.String strKWHzl = AbstractC22421hez.Companion.KWHzl();
            java.lang.String strValueOf2 = c30808liDFetchVPNInfo != null ? c30808liDFetchVPNInfo.valueOf() : null;
            if (c30808liDFetchVPNInfo != null) {
                value = c30808liDFetchVPNInfo.copydefault();
            } else {
                value = AdvancedPriorityFeeType.Market.getValue();
            }
            NetworkFee networkFee2 = new NetworkFee(strValueOf2, java.lang.String.valueOf(value));
            java.lang.String strKWHzl2 = c30808liDFetchVPNInfo != null ? c30808liDFetchVPNInfo.KWHzl() : null;
            java.lang.String strGEmmrt = c30808liDFetchVPNInfo != null ? c30808liDFetchVPNInfo.gEmmrt() : null;
            if (strGEmmrt == null) {
                strGEmmrt = "";
            }
            if (c30808liDFetchVPNInfo == null || (slippageModeAYXKKw = c30808liDFetchVPNInfo.AYXKKw()) == null) {
                slippageModeAYXKKw = SlippageMode.Dynamic;
            }
            SlippageConfig slippageConfig2 = new SlippageConfig(strKWHzl2, strGEmmrt, java.lang.String.valueOf(slippageModeAYXKKw.getType()));
            C28196kSl c28196kSl = this.AhwBna;
            if (activity.ejfBZ() && activity.AEQbTJ()) {
                activity2 = activity;
                z = true;
            } else {
                activity2 = activity;
                z = false;
            }
            advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$0 = activity2;
            advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$1 = str;
            advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$2 = c30808liDFetchVPNInfo;
            advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$3 = selectedDeFiPlatform;
            advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$4 = str5;
            advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$5 = strKWHzl;
            advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$6 = networkFee2;
            advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$7 = slippageConfig2;
            advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.I$0 = 0;
            advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.label = 1;
            objEZpvd = c28196kSl.EZpvd(z, advancedOrderSubmissionDelegate$buildV6CallDataRequest$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            activity3 = activity2;
            i = 0;
            str2 = str;
            networkFee = networkFee2;
            str3 = strKWHzl;
            str4 = str5;
            slippageConfig = slippageConfig2;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.I$0;
            SlippageConfig slippageConfig3 = (SlippageConfig) advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$7;
            NetworkFee networkFee3 = (NetworkFee) advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$6;
            java.lang.String str6 = (java.lang.String) advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$5;
            java.lang.String str7 = (java.lang.String) advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$4;
            selectedDeFiPlatform = (DefiPlatformInfo) advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$3;
            c30808liDFetchVPNInfo = (C30808liD) advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$2;
            str2 = (java.lang.String) advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$1;
            activity3 = (Activity) advancedOrderSubmissionDelegate$buildV6CallDataRequest$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            slippageConfig = slippageConfig3;
            networkFee = networkFee3;
            str3 = str6;
            str4 = str7;
        }
        AccountInfo accountInfo = (AccountInfo) objEZpvd;
        if (c30808liDFetchVPNInfo == null || (value2 = c30808liDFetchVPNInfo.AhwBna()) == null) {
            value2 = PresetRouteType.RouteTypeAuto.getValue();
        }
        PreSetConfig preSetConfig = new PreSetConfig(value2);
        if (str2 != null) {
            calldataPermit2 = new CalldataPermit2((selectedDeFiPlatform == null || (permit2Data = selectedDeFiPlatform.getPermit2Data()) == null) ? null : permit2Data.getUnsignedTx(), str2);
        } else {
            calldataPermit2 = null;
        }
        java.lang.String strValues = activity3.values();
        java.lang.String quoteId = selectedDeFiPlatform != null ? selectedDeFiPlatform.getQuoteId() : null;
        return new V6CalldataRequest(str4, i != 0, str3, networkFee, slippageConfig, accountInfo, preSetConfig, calldataPermit2, strValues, quoteId == null ? "" : quoteId, 2, (DefaultConstructorMarker) null);
    }

    public final void EZpvd(java.lang.Throwable th, @NotNull Activity activity, @NotNull ActionBar actionBar, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C25389ivm.safeLaunch$default(activity.djBIcL(), null, null, new AdvancedOrderSubmissionDelegate$handleFailure$1(actionBar, th, function1, null), 3, null);
        C25389ivm.safeLaunch$default(activity.djBIcL(), null, null, new AdvancedOrderSubmissionDelegate$handleFailure$2(actionBar, null), 3, null);
    }

    /* JADX INFO: renamed from: o.kTt$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC9740bbL.TaskDescription {
        public final /* synthetic */ ActionBar KWHzl;

        public StateListAnimator(ActionBar actionBar) {
            this.KWHzl = actionBar;
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void EZpvd() {
            this.KWHzl.EZpvd(false);
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void copydefault() {
            this.KWHzl.EZpvd(true);
        }
    }

    public final InterfaceC9740bbL.TaskDescription OLrzqt(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        return new StateListAnimator(actionBar);
    }
}
