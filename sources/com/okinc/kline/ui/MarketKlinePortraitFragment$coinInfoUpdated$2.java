package com.okinc.kline.ui;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.ui.MarketKlinePortraitFragment$coinInfoUpdated$2;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C32866mlf;
import o.C32868mlh;
import o.C37943pGl;
import o.C38685peB;
import o.C39014pkM;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49425uoM;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.ViewOnClickListenerC38857phO;

/* JADX INFO: loaded from: classes23.dex */
public final class MarketKlinePortraitFragment$coinInfoUpdated$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $collapseQuickOrder;
    final /* synthetic */ String $intId;
    final /* synthetic */ String $intType;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ViewOnClickListenerC38857phO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketKlinePortraitFragment$coinInfoUpdated$2(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, String str, String str2, boolean z, Continuation<? super MarketKlinePortraitFragment$coinInfoUpdated$2> continuation) {
        super(2, continuation);
        this.this$0 = viewOnClickListenerC38857phO;
        this.$intId = str;
        this.$intType = str2;
        this.$collapseQuickOrder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketKlinePortraitFragment$coinInfoUpdated$2(this.this$0, this.$intId, this.$intType, this.$collapseQuickOrder, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketKlinePortraitFragment$coinInfoUpdated$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01dc A[Catch: Exception -> 0x01e5, TryCatch #0 {Exception -> 0x01e5, blocks: (B:49:0x0100, B:51:0x0106, B:53:0x010c, B:54:0x0110, B:56:0x0116, B:57:0x011c, B:59:0x0123, B:61:0x012d, B:63:0x013c, B:65:0x014a, B:67:0x0150, B:69:0x0156, B:71:0x0164, B:73:0x016a, B:76:0x0171, B:78:0x0177, B:79:0x017b, B:80:0x017f, B:82:0x018d, B:84:0x0193, B:98:0x01ce, B:86:0x0199, B:88:0x01a7, B:90:0x01ad, B:92:0x01b3, B:94:0x01c2, B:96:0x01c8, B:99:0x01d2, B:101:0x01d8, B:102:0x01dc, B:104:0x01e2), top: B:118:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106 A[Catch: Exception -> 0x01e5, TryCatch #0 {Exception -> 0x01e5, blocks: (B:49:0x0100, B:51:0x0106, B:53:0x010c, B:54:0x0110, B:56:0x0116, B:57:0x011c, B:59:0x0123, B:61:0x012d, B:63:0x013c, B:65:0x014a, B:67:0x0150, B:69:0x0156, B:71:0x0164, B:73:0x016a, B:76:0x0171, B:78:0x0177, B:79:0x017b, B:80:0x017f, B:82:0x018d, B:84:0x0193, B:98:0x01ce, B:86:0x0199, B:88:0x01a7, B:90:0x01ad, B:92:0x01b3, B:94:0x01c2, B:96:0x01c8, B:99:0x01d2, B:101:0x01d8, B:102:0x01dc, B:104:0x01e2), top: B:118:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123 A[Catch: Exception -> 0x01e5, TryCatch #0 {Exception -> 0x01e5, blocks: (B:49:0x0100, B:51:0x0106, B:53:0x010c, B:54:0x0110, B:56:0x0116, B:57:0x011c, B:59:0x0123, B:61:0x012d, B:63:0x013c, B:65:0x014a, B:67:0x0150, B:69:0x0156, B:71:0x0164, B:73:0x016a, B:76:0x0171, B:78:0x0177, B:79:0x017b, B:80:0x017f, B:82:0x018d, B:84:0x0193, B:98:0x01ce, B:86:0x0199, B:88:0x01a7, B:90:0x01ad, B:92:0x01b3, B:94:0x01c2, B:96:0x01c8, B:99:0x01d2, B:101:0x01d8, B:102:0x01dc, B:104:0x01e2), top: B:118:0x0100 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ViewOnClickListenerC38857phO viewOnClickListenerC38857phO;
        final String str;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        ViewOnClickListenerC38857phO viewOnClickListenerC38857phO2;
        String str2;
        C38685peB c38685peBAkhnZx;
        MarketCoinInfo marketCoinInfoFARcdN;
        C39014pkM c39014pkMValues;
        C39014pkM c39014pkMValues2;
        LifecycleCoroutineScope lifecycleScope;
        MarketCoinInfo marketCoinInfoFARcdN2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcherOLrzqt = C37943pGl.OLrzqt.OLrzqt();
            MarketKlinePortraitFragment$coinInfoUpdated$2$str$1 marketKlinePortraitFragment$coinInfoUpdated$2$str$1 = new MarketKlinePortraitFragment$coinInfoUpdated$2$str$1(this.this$0, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcherOLrzqt, marketKlinePortraitFragment$coinInfoUpdated$2$str$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.L$1;
                viewOnClickListenerC38857phO2 = (ViewOnClickListenerC38857phO) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str = str2;
                viewOnClickListenerC38857phO = viewOnClickListenerC38857phO2;
                viewOnClickListenerC38857phO.getFieldNames();
                viewOnClickListenerC38857phO.DTwDnp();
                viewOnClickListenerC38857phO.AwvSrB();
                c38685peBAkhnZx = viewOnClickListenerC38857phO.AkhnZx();
                if (c38685peBAkhnZx != null) {
                    c38685peBAkhnZx.AwvSrB();
                }
                marketCoinInfoFARcdN = viewOnClickListenerC38857phO.fARcdN();
                if (marketCoinInfoFARcdN != null) {
                    viewOnClickListenerC38857phO.aKErDB().KWHzl().setValue(marketCoinInfoFARcdN);
                }
                try {
                    marketCoinInfoFARcdN2 = viewOnClickListenerC38857phO.fARcdN();
                    if (marketCoinInfoFARcdN2 != null) {
                        if (viewOnClickListenerC38857phO.AEQbTJ(marketCoinInfoFARcdN2)) {
                            viewOnClickListenerC38857phO.QOLQEE();
                        } else if (!viewOnClickListenerC38857phO.DbNXlk) {
                            viewOnClickListenerC38857phO.DbNXlk = true;
                            viewOnClickListenerC38857phO.QOLQEE();
                        }
                    }
                    if (viewOnClickListenerC38857phO.AwvSrB) {
                        ViewPager2 viewPager2 = viewOnClickListenerC38857phO.QkdxfA;
                        if (viewPager2 != null) {
                            viewPager2.setCurrentItem(0);
                        }
                    } else if (Intrinsics.EZpvd((Object) str, (Object) "OPTION")) {
                        if (viewOnClickListenerC38857phO.dNCPSb.size() == viewOnClickListenerC38857phO.OLrzqt(6) || ((viewOnClickListenerC38857phO.dNCPSb.size() == viewOnClickListenerC38857phO.OLrzqt(5) && (!viewOnClickListenerC38857phO.sSMYrx || !viewOnClickListenerC38857phO.gHZMYf)) || (viewOnClickListenerC38857phO.dNCPSb.size() == viewOnClickListenerC38857phO.OLrzqt(4) && !viewOnClickListenerC38857phO.sSMYrx && !viewOnClickListenerC38857phO.gHZMYf))) {
                            viewOnClickListenerC38857phO.QOLQEE();
                        } else {
                            ViewPager2 viewPager22 = viewOnClickListenerC38857phO.QkdxfA;
                            if (viewPager22 != null) {
                                viewPager22.setCurrentItem(0);
                            }
                        }
                    } else if ((viewOnClickListenerC38857phO.dNCPSb.size() != viewOnClickListenerC38857phO.OLrzqt(5) || !viewOnClickListenerC38857phO.sSMYrx || !viewOnClickListenerC38857phO.gHZMYf) && ((viewOnClickListenerC38857phO.dNCPSb.size() != viewOnClickListenerC38857phO.OLrzqt(4) || (viewOnClickListenerC38857phO.sSMYrx && viewOnClickListenerC38857phO.gHZMYf)) && (viewOnClickListenerC38857phO.dNCPSb.size() != viewOnClickListenerC38857phO.OLrzqt(3) || viewOnClickListenerC38857phO.sSMYrx || viewOnClickListenerC38857phO.gHZMYf))) {
                        ViewPager2 viewPager23 = viewOnClickListenerC38857phO.QkdxfA;
                        if (viewPager23 != null) {
                            viewPager23.setCurrentItem(0);
                        }
                    } else {
                        viewOnClickListenerC38857phO.QOLQEE();
                    }
                } catch (Exception unused) {
                }
                c39014pkMValues = viewOnClickListenerC38857phO.values();
                if (c39014pkMValues != null && !c39014pkMValues.AkhnZx() && (c39014pkMValues2 = viewOnClickListenerC38857phO.values()) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c39014pkMValues2)) != null) {
                    lifecycleScope.launchWhenResumed(new MarketKlinePortraitFragment$coinInfoUpdated$2$1$4(viewOnClickListenerC38857phO, null));
                }
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.AEQbTJ("app_kline_page_view", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.piC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return MarketKlinePortraitFragment$coinInfoUpdated$2.invokeSuspend$lambda$3$lambda$2(str, (EventParamsList) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.AYXKKw((String) obj);
        MarketCoinInfo marketCoinInfoFARcdN3 = this.this$0.fARcdN();
        if (marketCoinInfoFARcdN3 != null) {
            marketCoinInfoFARcdN3.setInstrumentId(this.$intId);
        }
        MarketCoinInfo marketCoinInfoFARcdN4 = this.this$0.fARcdN();
        if (marketCoinInfoFARcdN4 != null) {
            marketCoinInfoFARcdN4.setInstrumentType(this.$intType);
        }
        this.this$0.djBIcL(this.$intId);
        this.this$0.AhwBna(this.$intType);
        if (!this.$collapseQuickOrder) {
            this.this$0.RJOkX();
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class);
        TradeKey tradeKey = TradeKey.MANAGER;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) interfaceC49425uoM.KWHzl(tradeKey)).copydefault();
        BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, this.$intType, this.$intId, null, null, 12, null) : null;
        if (minSuggestedInstrument$default != null) {
            viewOnClickListenerC38857phO = this.this$0;
            str = this.$intType;
            InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM2 != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(tradeKey)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
                String strFIwbmz = viewOnClickListenerC38857phO.fIwbmz();
                if (strFIwbmz == null) {
                    strFIwbmz = "";
                }
                AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(strFIwbmz);
                if (abstractC54531xLwOLrzqt != null) {
                    this.L$0 = viewOnClickListenerC38857phO;
                    this.L$1 = str;
                    this.label = 2;
                    obj = abstractC54531xLwOLrzqt.EZpvd(minSuggestedInstrument$default, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    viewOnClickListenerC38857phO2 = viewOnClickListenerC38857phO;
                    str2 = str;
                    str = str2;
                    viewOnClickListenerC38857phO = viewOnClickListenerC38857phO2;
                }
            }
            viewOnClickListenerC38857phO.getFieldNames();
            viewOnClickListenerC38857phO.DTwDnp();
            viewOnClickListenerC38857phO.AwvSrB();
            c38685peBAkhnZx = viewOnClickListenerC38857phO.AkhnZx();
            if (c38685peBAkhnZx != null) {
            }
            marketCoinInfoFARcdN = viewOnClickListenerC38857phO.fARcdN();
            if (marketCoinInfoFARcdN != null) {
            }
            marketCoinInfoFARcdN2 = viewOnClickListenerC38857phO.fARcdN();
            if (marketCoinInfoFARcdN2 != null) {
            }
            if (viewOnClickListenerC38857phO.AwvSrB) {
            }
            c39014pkMValues = viewOnClickListenerC38857phO.values();
            if (c39014pkMValues != null) {
                lifecycleScope.launchWhenResumed(new MarketKlinePortraitFragment$coinInfoUpdated$2$1$4(viewOnClickListenerC38857phO, null));
            }
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_kline_page_view", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.piC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MarketKlinePortraitFragment$coinInfoUpdated$2.invokeSuspend$lambda$3$lambda$2(str, (EventParamsList) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2(String str, EventParamsList eventParamsList) {
        eventParamsList.put("biztype", str, true);
        return Unit.INSTANCE;
    }
}
