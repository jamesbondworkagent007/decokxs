package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.assets.api.model.TransferDetail;
import com.okinc.biz.model.SupportService;
import com.okinc.buysell.api.BSCTargetTab;
import com.okinc.buysell.external.KycOnboardingActionType;
import com.okinc.buysell.external.OKBuySellExternalBridgeProtocolImpl$getLiteUserResidenceTypeLegacy$2;
import com.okinc.buysell.external.OKBuySellExternalBridgeProtocolImpl$getSupportEntrance$1;
import com.okinc.buysell.external.OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeFairTickerData$2;
import com.okinc.buysell.external.OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$$inlined$map$1$2$1;
import com.okinc.buysell.external.OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1;
import com.okinc.buysell.external.OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$2;
import com.okinc.buysell.external.OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$4;
import com.okinc.buysell.external.OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$5;
import com.okinc.buysell.util.PaymentLogger;
import com.okinc.core.ok_app.api.bean.LiteNavigationTabEnum;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.ok_kyc_core_api.ResultBackStatus;
import com.okinc.okex.lite.home.bean.LiteUserResidenceType;
import com.okinc.okex.lite.ukbanner.UKBannerType;
import com.okinc.okex.lite_market_api.bean.FairPriceTickerData;
import com.okinc.okx.paymentapi.presentation.BSCLevel;
import com.okinc.okx.paymentapi.service.SmartBotParams;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.InterfaceC6804aWL;
import o.InterfaceC8224ayh;
import o.sxI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lzy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31677lzy extends AbstractC43215rlA implements InterfaceC31670lzr {

    /* JADX INFO: renamed from: o.lzy$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BSCTargetTab.values().length];
            try {
                iArr[BSCTargetTab.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BSCTargetTab.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[BSCTargetTab.CONVERT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX INFO: renamed from: o.lzy$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar implements Flow<java.util.Map<java.lang.String, ? extends TickersData>> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.lzy$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$$inlined$map$1$2$1 oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$$inlined$map$1$2$1;
                if (continuation instanceof OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$$inlined$map$1$2$1) {
                    oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$$inlined$map$1$2$1 = (OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$$inlined$map$1$2$1) continuation;
                    int i = oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$$inlined$map$1$2$1 = new OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (kotlin.Pair pair : (java.util.List) obj) {
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    java.util.Map mapValues = C56424yEw.values(linkedHashMap);
                    oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(mapValues, oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends TickersData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC31670lzr
    public void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("path", "main/home");
            bundle.putSerializable("tab_type", LiteNavigationTabEnum.LITE_HOME);
            ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).copydefault(context, bundle);
            return;
        }
        ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).copydefault(context, new android.os.Bundle());
    }

    @Override // o.InterfaceC31670lzr
    public java.lang.String copydefault() {
        return ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QUSxYX();
    }

    @Override // o.InterfaceC31670lzr
    public boolean AYXKKw() {
        return !((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.ASSET_MULTI_ACCOUNT);
    }

    @Override // o.InterfaceC31670lzr
    public void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull final BSCLevel bSCLevel, java.lang.Boolean bool, java.lang.Boolean bool2, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super java.lang.Boolean, Unit> function1, @NotNull final Function1<? super java.lang.String, Unit> function12, @NotNull final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(bSCLevel, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function02, "");
        ((rTU) C43251rlk.copydefault(rTU.class)).EZpvd(fragmentActivity, new Function1() { // from class: o.lzw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31677lzy.OLrzqt(function0, ((java.lang.Boolean) obj).booleanValue());
            }
        }, bool2, new Function1() { // from class: o.lzx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31677lzy.KWHzl(bSCLevel, function1, ((java.lang.Integer) obj).intValue());
            }
        }, new Function1() { // from class: o.lzz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31677lzy.EZpvd(function12, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.lzv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31677lzy.AEQbTJ(function02, function1, (ResultBackStatus) obj);
            }
        });
    }

    public static final Unit OLrzqt(Function0 function0, boolean z) {
        if (!z) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(BSCLevel bSCLevel, Function1 function1, int i) {
        if (bSCLevel == BSCLevel.LEVEL1) {
            if (i == KycOnboardingActionType.DISMISS_CLICK.getCode() || i == KycOnboardingActionType.CLOSED_BY_DROPDOWN.getCode()) {
                function1.invoke(java.lang.Boolean.FALSE);
            } else if (i == KycOnboardingActionType.LEAVE_BUTTON_CLICK.getCode() || i == KycOnboardingActionType.EXIT.getCode()) {
                function1.invoke(java.lang.Boolean.TRUE);
            }
        } else if (i == KycOnboardingActionType.DISMISS_CLICK.getCode() || i == KycOnboardingActionType.LEAVE_BUTTON_CLICK.getCode() || i == KycOnboardingActionType.CLOSED_BY_DROPDOWN.getCode() || i == KycOnboardingActionType.EXIT.getCode()) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function0 function0, Function1 function1, ResultBackStatus resultBackStatus) {
        if (resultBackStatus == ResultBackStatus.Success) {
            function0.invoke();
            PaymentLogger.EZpvd.EZpvd(PaymentLogger.Type.UV, "user has completed KYC verification");
        } else {
            function1.invoke(java.lang.Boolean.FALSE);
            PaymentLogger.EZpvd.EZpvd(PaymentLogger.Type.UV, "user has dropped KYC verification");
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC31670lzr
    public void copydefault(@NotNull android.app.Activity activity, @NotNull TransferDetail transferDetail) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(transferDetail, "");
        InterfaceC8224ayh.TaskDescription.goToTransfer$default((InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class), activity, transferDetail, null, 4, null);
    }

    @Override // o.InterfaceC31670lzr
    public void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ((sxI) C43251rlk.copydefault(sxI.class)).OLrzqt(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC31670lzr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, boolean z, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1 oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1;
        Flow flowM7441catch;
        if (continuation instanceof OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1) {
            oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1 = (OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1) continuation;
            int i = oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1.label = i - Integer.MIN_VALUE;
            } else {
                oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1 = new OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC43032rhd interfaceC43032rhdKWHzl = ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).KWHzl();
                oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1.label = 1;
                objOLrzqt = interfaceC43032rhdKWHzl.OLrzqt(lifecycleOwner, list, z, oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            Flow flow = (Flow) objOLrzqt;
            if (flow == null || (flowM7441catch = FlowKt.m7441catch(flow, new OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$2(null))) == null) {
                return FlowKt.flow(new OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$4(null));
            }
            return new ActionBar(flowM7441catch);
        } catch (java.lang.Exception unused) {
            return FlowKt.flow(new OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$5(null));
        }
    }

    @Override // o.InterfaceC31670lzr
    public java.lang.Object OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, java.lang.String str, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, FairPriceTickerData>>> continuation) {
        try {
            return sxI.ActionBar.httpThenSubscribeFairPriceData$default((sxI) C43251rlk.copydefault(sxI.class), lifecycleOwner, list, false, str, 0L, 20, null);
        } catch (java.lang.Exception unused) {
            return FlowKt.flow(new OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeFairTickerData$2(null));
        }
    }

    @Override // o.InterfaceC31670lzr
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Flow<? extends LiteUserResidenceType>> continuation) {
        return FlowKt.flowOn(FlowKt.flow(new OKBuySellExternalBridgeProtocolImpl$getLiteUserResidenceTypeLegacy$2(null)), Dispatchers.getIO());
    }

    @Override // o.InterfaceC31670lzr
    public java.lang.Object EZpvd(@NotNull Continuation<? super LiteUserResidenceType> continuation) {
        return ((svI) C43251rlk.copydefault(svI.class)).EZpvd(continuation);
    }

    @Override // o.InterfaceC31670lzr
    public boolean OLrzqt(@NotNull OKComplianceRestrictionService.Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "");
        return ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AEQbTJ(feature);
    }

    @Override // o.InterfaceC31670lzr
    public boolean AhwBna() {
        return ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames();
    }

    @Override // o.InterfaceC31670lzr
    public void KWHzl(@NotNull android.app.Activity activity, @NotNull UKBannerType uKBannerType) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(uKBannerType, "");
        ((InterfaceC45752swP) C43251rlk.copydefault(InterfaceC45752swP.class)).AEQbTJ(activity, UKBannerType.APPROVED_6OCT23);
    }

    @Override // o.InterfaceC31670lzr
    public void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull android.view.ViewGroup viewGroup, @NotNull UKBannerType uKBannerType) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(uKBannerType, "");
        ((InterfaceC45752swP) C43251rlk.copydefault(InterfaceC45752swP.class)).EZpvd(fragmentManager, viewGroup, uKBannerType);
    }

    @Override // o.InterfaceC31670lzr
    public sxC AEQbTJ() {
        return ((sxI) C43251rlk.copydefault(sxI.class)).OLrzqt();
    }

    @Override // o.InterfaceC31670lzr
    public sxD OLrzqt() {
        return ((sxI) C43251rlk.copydefault(sxI.class)).copydefault();
    }

    @Override // o.InterfaceC31670lzr
    public Flow<SupportService> AEQbTJ(@NotNull java.lang.String str, @NotNull SmartBotParams smartBotParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(smartBotParams, "");
        return FlowKt.flowOn(FlowKt.flow(new OKBuySellExternalBridgeProtocolImpl$getSupportEntrance$1(str, smartBotParams, null)), Dispatchers.getIO());
    }

    @Override // o.InterfaceC31670lzr
    public void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC6804aWL.Application.openSupportCenter$default((InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class), context, null, 2, null);
    }

    @Override // o.InterfaceC31670lzr
    public StateFlow<AbstractC33244msm> KWHzl() {
        return ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).values();
    }

    @Override // o.InterfaceC31670lzr
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull BSCTargetTab bSCTargetTab) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bSCTargetTab, "");
        android.os.Bundle bundle = new android.os.Bundle();
        int i = StateListAnimator.KWHzl[bSCTargetTab.ordinal()];
        if (i == 1) {
            str = "buy_tab";
        } else if (i == 2) {
            str = "sell_tab";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "convert_tab";
        }
        bundle.putString("target_tab", str);
        ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).AEQbTJ(context, "trade/main/convert", bundle);
    }

    @Override // o.InterfaceC31670lzr
    public void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).EZpvd(context, "history_type");
    }

    @Override // o.InterfaceC31670lzr
    public java.lang.String EZpvd() {
        return ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).AEQbTJ();
    }

    @Override // o.InterfaceC31670lzr
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull Function1<? super AbstractC43238rlX, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).KWHzl(context, str, map, function1);
    }

    @Override // o.InterfaceC31670lzr
    public void OLrzqt(@NotNull android.content.Context context, int i, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        ((InterfaceC25420iwQ) C43251rlk.copydefault(InterfaceC25420iwQ.class)).EZpvd(context, i, str, z);
    }
}
