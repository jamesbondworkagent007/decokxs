package com.okinc.kline.features.kline.bottom.marketevents.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventReq;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC49411unz;
import o.AbstractC54531xLw;
import o.BhA;
import o.BhB;
import o.BiL;
import o.C33077mpe;
import o.C33129mqd;
import o.C36134oQn;
import o.C36157oRj;
import o.C36236oUh;
import o.C37962pHd;
import o.C43251rlk;
import o.C4534Bhq;
import o.C4578Bjg;
import o.C48914uef;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.InterfaceC49425uoM;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.oQW;
import o.pDX;
import o.pUU;
import o.xUD;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketEventsViewModel extends AbstractC49411unz<C36157oRj> {
    public final InterfaceC56387yDm AYXKKw;
    public SharedFlow<Integer> AhwBna;
    public String AkhnZx;
    public MutableSharedFlow<Integer> EZpvd;
    public MutableSharedFlow<Boolean> KWHzl;
    public MarketCoinInfo OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final C36134oQn djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final SharedFlow<Boolean> gEmmrt;
    public String isConnected;
    public final C37962pHd valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(MarketCoinInfo marketCoinInfo) {
        this.OLrzqt = marketCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Integer> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketCoinInfo OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(String str) {
        this.isConnected = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt() {
        this.AkhnZx = "no_cursor";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public MarketEventsViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C37962pHd c37962pHd, @NotNull C36134oQn c36134oQn) {
        super(new C36157oRj(null, false, 3, null));
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c37962pHd, "");
        Intrinsics.checkNotNullParameter(c36134oQn, "");
        this.copydefault = coroutineDispatcher;
        this.valueOf = c37962pHd;
        this.djBIcL = c36134oQn;
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.oRi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketEventsViewModel.AEQbTJ();
            }
        });
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default2;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        this.AkhnZx = "no_cursor";
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.oRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketEventsViewModel.AYXKKw(this.OLrzqt);
            }
        });
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final BhB AEQbTJ() {
        return C4578Bjg.createMarketEventsWsManager();
    }

    public final BhB valueOf() {
        return (BhB) this.fetchVPNInfo.getValue();
    }

    public final String KWHzl() {
        return (String) this.AYXKKw.getValue();
    }

    public static final String AYXKKw(MarketEventsViewModel marketEventsViewModel) {
        C48914uef c48914uef = C48914uef.EZpvd;
        MarketCoinInfo marketCoinInfo = marketEventsViewModel.OLrzqt;
        String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
        MarketCoinInfo marketCoinInfo2 = marketEventsViewModel.OLrzqt;
        return C48914uef.getTitleByIdAndType$default(c48914uef, instrumentId, marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null, false, false, null, false, false, 124, null);
    }

    public final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketEventsViewModel$queryIfHaveMarketEvents$1(this, null), 3, null);
    }

    public final void AhwBna() {
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketEventsViewModel$queryIsNeedToPullMarketEvents$1(this, null), 3, null), "queryIsNeedToPullMarketEvents");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(C4534Bhq c4534Bhq, Continuation<? super Result<BhA>> continuation) throws Throwable {
        MarketEventsViewModel$fetchMarketEventsFromRust$1 marketEventsViewModel$fetchMarketEventsFromRust$1;
        if (continuation instanceof MarketEventsViewModel$fetchMarketEventsFromRust$1) {
            marketEventsViewModel$fetchMarketEventsFromRust$1 = (MarketEventsViewModel$fetchMarketEventsFromRust$1) continuation;
            int i = marketEventsViewModel$fetchMarketEventsFromRust$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketEventsViewModel$fetchMarketEventsFromRust$1.label = i - Integer.MIN_VALUE;
            } else {
                marketEventsViewModel$fetchMarketEventsFromRust$1 = new MarketEventsViewModel$fetchMarketEventsFromRust$1(this, continuation);
            }
        }
        Object obj = marketEventsViewModel$fetchMarketEventsFromRust$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketEventsViewModel$fetchMarketEventsFromRust$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        BiL marketEvents = C4578Bjg.getMarketEvents(c4534Bhq);
        C33077mpe c33077mpe = new C33077mpe(new MarketEventsViewModel$fetchMarketEventsFromRust$wrapper$1(marketEvents), new MarketEventsViewModel$fetchMarketEventsFromRust$wrapper$2(marketEvents), new MarketEventsViewModel$fetchMarketEventsFromRust$wrapper$3(marketEvents), new MarketEventsViewModel$fetchMarketEventsFromRust$wrapper$4(marketEvents), this.copydefault);
        marketEventsViewModel$fetchMarketEventsFromRust$1.label = 1;
        Object objAEQbTJ = c33077mpe.AEQbTJ(marketEventsViewModel$fetchMarketEventsFromRust$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void queryMarketEventList$default(MarketEventsViewModel marketEventsViewModel, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        marketEventsViewModel.copydefault(z, (List<? extends MarketEventsVo>) list);
    }

    public final void copydefault(boolean z, List<? extends MarketEventsVo> list) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketEventsViewModel$queryMarketEventList$1(this, z, list, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateEventListFromRust$default(MarketEventsViewModel marketEventsViewModel, boolean z, List list, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        return marketEventsViewModel.KWHzl(z, (List<? extends MarketEventsVo>) list, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(boolean z, List<? extends MarketEventsVo> list, Continuation<? super Unit> continuation) throws Throwable {
        MarketEventsViewModel$updateEventListFromRust$1 marketEventsViewModel$updateEventListFromRust$1;
        String instrumentId;
        boolean z2;
        Object objEZpvd;
        MarketEventsViewModel marketEventsViewModel;
        Object obj;
        BhA bhA;
        Throwable thM7380exceptionOrNullimpl;
        Throwable th;
        if (continuation instanceof MarketEventsViewModel$updateEventListFromRust$1) {
            marketEventsViewModel$updateEventListFromRust$1 = (MarketEventsViewModel$updateEventListFromRust$1) continuation;
            int i = marketEventsViewModel$updateEventListFromRust$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketEventsViewModel$updateEventListFromRust$1.label = i - Integer.MIN_VALUE;
            } else {
                marketEventsViewModel$updateEventListFromRust$1 = new MarketEventsViewModel$updateEventListFromRust$1(this, continuation);
            }
        }
        MarketEventsViewModel$updateEventListFromRust$1 marketEventsViewModel$updateEventListFromRust$12 = marketEventsViewModel$updateEventListFromRust$1;
        Object obj2 = marketEventsViewModel$updateEventListFromRust$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketEventsViewModel$updateEventListFromRust$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            MarketCoinInfo marketCoinInfo = this.OLrzqt;
            if (marketCoinInfo == null || (instrumentId = marketCoinInfo.getInstrumentId()) == null) {
                instrumentId = "";
            }
            C4534Bhq c4534Bhq = new C4534Bhq(instrumentId, this.AkhnZx, C56443yFo.AEQbTJ(20), this.isConnected, KWHzl(), false, list != null ? oQW.KWHzl(list) : null, 1);
            marketEventsViewModel$updateEventListFromRust$12.L$0 = this;
            z2 = z;
            marketEventsViewModel$updateEventListFromRust$12.Z$0 = z2;
            marketEventsViewModel$updateEventListFromRust$12.label = 1;
            objEZpvd = EZpvd(c4534Bhq, marketEventsViewModel$updateEventListFromRust$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            marketEventsViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) marketEventsViewModel$updateEventListFromRust$12.L$1;
                    C56391yDq.AEQbTJ(obj2);
                    pUU.copydefault("MarketEventsViewModel", "updateEventListFromRust fail cause by: " + th);
                    return Unit.INSTANCE;
                }
                bhA = (BhA) marketEventsViewModel$updateEventListFromRust$12.L$2;
                obj = marketEventsViewModel$updateEventListFromRust$12.L$1;
                marketEventsViewModel = (MarketEventsViewModel) marketEventsViewModel$updateEventListFromRust$12.L$0;
                C56391yDq.AEQbTJ(obj2);
                String strEZpvd = bhA == null ? bhA.EZpvd() : null;
                marketEventsViewModel.AkhnZx = strEZpvd;
                pUU.KWHzl("MarketEventsViewModel", "updateEventListFromRust success, next cursor is " + strEZpvd);
                objEZpvd = obj;
                MarketEventsViewModel marketEventsViewModel2 = marketEventsViewModel;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
                if (thM7380exceptionOrNullimpl != null) {
                    InterfaceC49371unL.Application application = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                    marketEventsViewModel$updateEventListFromRust$12.L$0 = objEZpvd;
                    marketEventsViewModel$updateEventListFromRust$12.L$1 = thM7380exceptionOrNullimpl;
                    marketEventsViewModel$updateEventListFromRust$12.L$2 = null;
                    marketEventsViewModel$updateEventListFromRust$12.label = 3;
                    if (updateEventList$default(marketEventsViewModel2, application, false, marketEventsViewModel$updateEventListFromRust$12, 2, null) == objCopydefault) {
                        return objCopydefault;
                    }
                    th = thM7380exceptionOrNullimpl;
                    pUU.copydefault("MarketEventsViewModel", "updateEventListFromRust fail cause by: " + th);
                }
                return Unit.INSTANCE;
            }
            z2 = marketEventsViewModel$updateEventListFromRust$12.Z$0;
            marketEventsViewModel = (MarketEventsViewModel) marketEventsViewModel$updateEventListFromRust$12.L$0;
            C56391yDq.AEQbTJ(obj2);
            objEZpvd = ((Result) obj2).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            BhA bhA2 = (BhA) objEZpvd;
            List<MarketEventsVo> listKWHzl = bhA2 != null ? oQW.KWHzl(bhA2) : null;
            InterfaceC49371unL<? extends List<? extends MarketEventsVo>> taskDescription = (listKWHzl == null || listKWHzl.isEmpty()) ? new InterfaceC49371unL.TaskDescription(null, 1, null) : new InterfaceC49371unL.Activity<>(listKWHzl);
            marketEventsViewModel$updateEventListFromRust$12.L$0 = marketEventsViewModel;
            marketEventsViewModel$updateEventListFromRust$12.L$1 = objEZpvd;
            marketEventsViewModel$updateEventListFromRust$12.L$2 = bhA2;
            marketEventsViewModel$updateEventListFromRust$12.label = 2;
            if (marketEventsViewModel.KWHzl(taskDescription, z2, marketEventsViewModel$updateEventListFromRust$12) == objCopydefault) {
                return objCopydefault;
            }
            obj = objEZpvd;
            bhA = bhA2;
            if (bhA == null) {
            }
            marketEventsViewModel.AkhnZx = strEZpvd;
            pUU.KWHzl("MarketEventsViewModel", "updateEventListFromRust success, next cursor is " + strEZpvd);
            objEZpvd = obj;
        }
        MarketEventsViewModel marketEventsViewModel22 = marketEventsViewModel;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateEventListFromKotlin$default(MarketEventsViewModel marketEventsViewModel, boolean z, List list, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        return marketEventsViewModel.copydefault(z, (List<? extends MarketEventsVo>) list, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(boolean z, List<? extends MarketEventsVo> list, Continuation<? super Unit> continuation) throws Throwable {
        MarketEventsViewModel$updateEventListFromKotlin$1 marketEventsViewModel$updateEventListFromKotlin$1;
        boolean z2;
        boolean z3;
        MarketEventsViewModel marketEventsViewModel;
        C36134oQn c36134oQn;
        String instrumentId;
        MarketEventReq marketEventReq;
        Object objM7377constructorimpl;
        Object obj;
        Triple triple;
        Throwable thM7380exceptionOrNullimpl;
        Throwable th;
        if (continuation instanceof MarketEventsViewModel$updateEventListFromKotlin$1) {
            marketEventsViewModel$updateEventListFromKotlin$1 = (MarketEventsViewModel$updateEventListFromKotlin$1) continuation;
            int i = marketEventsViewModel$updateEventListFromKotlin$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketEventsViewModel$updateEventListFromKotlin$1.label = i - Integer.MIN_VALUE;
            } else {
                marketEventsViewModel$updateEventListFromKotlin$1 = new MarketEventsViewModel$updateEventListFromKotlin$1(this, continuation);
            }
        }
        MarketEventsViewModel$updateEventListFromKotlin$1 marketEventsViewModel$updateEventListFromKotlin$12 = marketEventsViewModel$updateEventListFromKotlin$1;
        Object objEZpvd = marketEventsViewModel$updateEventListFromKotlin$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketEventsViewModel$updateEventListFromKotlin$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                Result.Application application = Result.Companion;
                c36134oQn = this.djBIcL;
                MarketCoinInfo marketCoinInfo = this.OLrzqt;
                if (marketCoinInfo == null || (instrumentId = marketCoinInfo.getInstrumentId()) == null) {
                    instrumentId = "";
                }
                marketEventReq = new MarketEventReq(instrumentId, this.AkhnZx, C56443yFo.AEQbTJ(20), this.isConnected, KWHzl(), false, list, 32, null);
                marketEventsViewModel$updateEventListFromKotlin$12.L$0 = this;
                z2 = z;
            } catch (Throwable th2) {
                th = th2;
                z2 = z;
            }
            try {
                marketEventsViewModel$updateEventListFromKotlin$12.Z$0 = z2;
                marketEventsViewModel$updateEventListFromKotlin$12.label = 1;
                objEZpvd = c36134oQn.EZpvd(marketEventReq, marketEventsViewModel$updateEventListFromKotlin$12);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                z3 = z2;
                marketEventsViewModel = this;
            } catch (Throwable th3) {
                th = th3;
                z3 = z2;
                marketEventsViewModel = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) marketEventsViewModel$updateEventListFromKotlin$12.L$1;
                    C56391yDq.AEQbTJ(objEZpvd);
                    pUU.copydefault("MarketEventsViewModel", "updateEventListFromKotlin fail cause by: " + th);
                    return Unit.INSTANCE;
                }
                triple = (Triple) marketEventsViewModel$updateEventListFromKotlin$12.L$2;
                obj = marketEventsViewModel$updateEventListFromKotlin$12.L$1;
                marketEventsViewModel = (MarketEventsViewModel) marketEventsViewModel$updateEventListFromKotlin$12.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                String str = (String) triple.getFirst();
                marketEventsViewModel.AkhnZx = str;
                pUU.KWHzl("MarketEventsViewModel", "updateEventListFromKotlin success, next cursor is " + str);
                objM7377constructorimpl = obj;
                MarketEventsViewModel marketEventsViewModel2 = marketEventsViewModel;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    InterfaceC49371unL.Application application3 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                    marketEventsViewModel$updateEventListFromKotlin$12.L$0 = objM7377constructorimpl;
                    marketEventsViewModel$updateEventListFromKotlin$12.L$1 = thM7380exceptionOrNullimpl;
                    marketEventsViewModel$updateEventListFromKotlin$12.L$2 = null;
                    marketEventsViewModel$updateEventListFromKotlin$12.label = 3;
                    if (updateEventList$default(marketEventsViewModel2, application3, false, marketEventsViewModel$updateEventListFromKotlin$12, 2, null) == objCopydefault) {
                        return objCopydefault;
                    }
                    th = thM7380exceptionOrNullimpl;
                    pUU.copydefault("MarketEventsViewModel", "updateEventListFromKotlin fail cause by: " + th);
                }
                return Unit.INSTANCE;
            }
            z3 = marketEventsViewModel$updateEventListFromKotlin$12.Z$0;
            marketEventsViewModel = (MarketEventsViewModel) marketEventsViewModel$updateEventListFromKotlin$12.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (Throwable th4) {
                th = th4;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((Triple) objEZpvd);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            Triple triple2 = (Triple) objM7377constructorimpl;
            InterfaceC49371unL<? extends List<? extends MarketEventsVo>> taskDescription = ((List) triple2.getThird()).isEmpty() ? new InterfaceC49371unL.TaskDescription<>(null, 1, null) : new InterfaceC49371unL.Activity<>(triple2.getThird());
            marketEventsViewModel$updateEventListFromKotlin$12.L$0 = marketEventsViewModel;
            marketEventsViewModel$updateEventListFromKotlin$12.L$1 = objM7377constructorimpl;
            marketEventsViewModel$updateEventListFromKotlin$12.L$2 = triple2;
            marketEventsViewModel$updateEventListFromKotlin$12.label = 2;
            if (marketEventsViewModel.KWHzl(taskDescription, z3, marketEventsViewModel$updateEventListFromKotlin$12) == objCopydefault) {
                return objCopydefault;
            }
            obj = objM7377constructorimpl;
            triple = triple2;
            String str2 = (String) triple.getFirst();
            marketEventsViewModel.AkhnZx = str2;
            pUU.KWHzl("MarketEventsViewModel", "updateEventListFromKotlin success, next cursor is " + str2);
            objM7377constructorimpl = obj;
        }
        MarketEventsViewModel marketEventsViewModel22 = marketEventsViewModel;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void queryMarketEventListByWs$default(MarketEventsViewModel marketEventsViewModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        marketEventsViewModel.OLrzqt((List<? extends MarketEventsVo>) list);
    }

    public final void OLrzqt(List<? extends MarketEventsVo> list) {
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketEventsViewModel$queryMarketEventListByWs$1(this, list, null), 3, null), "queryMarketEventListByWs");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateEventListByWsFromRust$default(MarketEventsViewModel marketEventsViewModel, List list, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return marketEventsViewModel.OLrzqt((List<? extends MarketEventsVo>) list, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(List<? extends MarketEventsVo> list, Continuation<? super Unit> continuation) throws Throwable {
        MarketEventsViewModel$updateEventListByWsFromRust$1 marketEventsViewModel$updateEventListByWsFromRust$1;
        String instrumentId;
        Object objEZpvd;
        MarketEventsViewModel marketEventsViewModel;
        BhA bhA;
        MarketEventsViewModel marketEventsViewModel2;
        BhA bhA2;
        MutableSharedFlow<Integer> mutableSharedFlow;
        Integer numAEQbTJ;
        Object obj;
        Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof MarketEventsViewModel$updateEventListByWsFromRust$1) {
            marketEventsViewModel$updateEventListByWsFromRust$1 = (MarketEventsViewModel$updateEventListByWsFromRust$1) continuation;
            int i = marketEventsViewModel$updateEventListByWsFromRust$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketEventsViewModel$updateEventListByWsFromRust$1.label = i - Integer.MIN_VALUE;
            } else {
                marketEventsViewModel$updateEventListByWsFromRust$1 = new MarketEventsViewModel$updateEventListByWsFromRust$1(this, continuation);
            }
        }
        Object obj2 = marketEventsViewModel$updateEventListByWsFromRust$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketEventsViewModel$updateEventListByWsFromRust$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            MarketCoinInfo marketCoinInfo = this.OLrzqt;
            if (marketCoinInfo == null || (instrumentId = marketCoinInfo.getInstrumentId()) == null) {
                instrumentId = "";
            }
            C4534Bhq c4534Bhq = new C4534Bhq(instrumentId, null, C56443yFo.AEQbTJ(20), this.isConnected, KWHzl(), true, list != null ? oQW.KWHzl(list) : null, 1);
            marketEventsViewModel$updateEventListByWsFromRust$1.L$0 = this;
            marketEventsViewModel$updateEventListByWsFromRust$1.label = 1;
            objEZpvd = EZpvd(c4534Bhq, marketEventsViewModel$updateEventListByWsFromRust$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            marketEventsViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = marketEventsViewModel$updateEventListByWsFromRust$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    objEZpvd = obj;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.copydefault("MarketEventsViewModel", "updateEventListByWsFromRust fail cause by: " + thM7380exceptionOrNullimpl);
                    }
                    return Unit.INSTANCE;
                }
                bhA2 = (BhA) marketEventsViewModel$updateEventListByWsFromRust$1.L$2;
                Object obj3 = marketEventsViewModel$updateEventListByWsFromRust$1.L$1;
                marketEventsViewModel2 = (MarketEventsViewModel) marketEventsViewModel$updateEventListByWsFromRust$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                objEZpvd = obj3;
                mutableSharedFlow = marketEventsViewModel2.EZpvd;
                numAEQbTJ = C56443yFo.AEQbTJ(bhA2.copydefault());
                marketEventsViewModel$updateEventListByWsFromRust$1.L$0 = objEZpvd;
                marketEventsViewModel$updateEventListByWsFromRust$1.L$1 = null;
                marketEventsViewModel$updateEventListByWsFromRust$1.L$2 = null;
                marketEventsViewModel$updateEventListByWsFromRust$1.label = 3;
                if (mutableSharedFlow.emit(numAEQbTJ, marketEventsViewModel$updateEventListByWsFromRust$1) != objCopydefault) {
                    return objCopydefault;
                }
                obj = objEZpvd;
                objEZpvd = obj;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            MarketEventsViewModel marketEventsViewModel3 = (MarketEventsViewModel) marketEventsViewModel$updateEventListByWsFromRust$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            objEZpvd = ((Result) obj2).m7386unboximpl();
            marketEventsViewModel = marketEventsViewModel3;
        }
        if (Result.m7384isSuccessimpl(objEZpvd) && (bhA = (BhA) objEZpvd) != null) {
            List<MarketEventsVo> listKWHzl = oQW.KWHzl(bhA);
            if (true ^ listKWHzl.isEmpty()) {
                InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(listKWHzl);
                marketEventsViewModel$updateEventListByWsFromRust$1.L$0 = marketEventsViewModel;
                marketEventsViewModel$updateEventListByWsFromRust$1.L$1 = objEZpvd;
                marketEventsViewModel$updateEventListByWsFromRust$1.L$2 = bhA;
                marketEventsViewModel$updateEventListByWsFromRust$1.label = 2;
                if (updateEventList$default(marketEventsViewModel, activity, false, marketEventsViewModel$updateEventListByWsFromRust$1, 2, null) == objCopydefault) {
                    return objCopydefault;
                }
                marketEventsViewModel2 = marketEventsViewModel;
                bhA2 = bhA;
                mutableSharedFlow = marketEventsViewModel2.EZpvd;
                numAEQbTJ = C56443yFo.AEQbTJ(bhA2.copydefault());
                marketEventsViewModel$updateEventListByWsFromRust$1.L$0 = objEZpvd;
                marketEventsViewModel$updateEventListByWsFromRust$1.L$1 = null;
                marketEventsViewModel$updateEventListByWsFromRust$1.L$2 = null;
                marketEventsViewModel$updateEventListByWsFromRust$1.label = 3;
                if (mutableSharedFlow.emit(numAEQbTJ, marketEventsViewModel$updateEventListByWsFromRust$1) != objCopydefault) {
                }
            }
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateEventListByWsFromKotlin$default(MarketEventsViewModel marketEventsViewModel, List list, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return marketEventsViewModel.AEQbTJ((List<? extends MarketEventsVo>) list, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(List<? extends MarketEventsVo> list, Continuation<? super Unit> continuation) throws Throwable {
        MarketEventsViewModel$updateEventListByWsFromKotlin$1 marketEventsViewModel$updateEventListByWsFromKotlin$1;
        MarketEventsViewModel marketEventsViewModel;
        String instrumentId;
        Object objM7377constructorimpl;
        MarketEventsViewModel marketEventsViewModel2;
        Triple triple;
        MutableSharedFlow<Integer> mutableSharedFlow;
        Object second;
        Object obj;
        Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof MarketEventsViewModel$updateEventListByWsFromKotlin$1) {
            marketEventsViewModel$updateEventListByWsFromKotlin$1 = (MarketEventsViewModel$updateEventListByWsFromKotlin$1) continuation;
            int i = marketEventsViewModel$updateEventListByWsFromKotlin$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketEventsViewModel$updateEventListByWsFromKotlin$1.label = i - Integer.MIN_VALUE;
            } else {
                marketEventsViewModel$updateEventListByWsFromKotlin$1 = new MarketEventsViewModel$updateEventListByWsFromKotlin$1(this, continuation);
            }
        }
        Object objEZpvd = marketEventsViewModel$updateEventListByWsFromKotlin$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketEventsViewModel$updateEventListByWsFromKotlin$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                Result.Application application = Result.Companion;
                C36134oQn c36134oQn = this.djBIcL;
                MarketCoinInfo marketCoinInfo = this.OLrzqt;
                if (marketCoinInfo == null || (instrumentId = marketCoinInfo.getInstrumentId()) == null) {
                    instrumentId = "";
                }
                MarketEventReq marketEventReq = new MarketEventReq(instrumentId, null, C56443yFo.AEQbTJ(20), this.isConnected, KWHzl(), true, list, 2, null);
                marketEventsViewModel$updateEventListByWsFromKotlin$1.L$0 = this;
                marketEventsViewModel$updateEventListByWsFromKotlin$1.label = 1;
                objEZpvd = c36134oQn.EZpvd(marketEventReq, marketEventsViewModel$updateEventListByWsFromKotlin$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                marketEventsViewModel = this;
            } catch (Throwable th) {
                th = th;
                marketEventsViewModel = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = marketEventsViewModel$updateEventListByWsFromKotlin$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    objM7377constructorimpl = obj;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.copydefault("MarketEventsViewModel", "updateEventListByWsFromKotlin fail cause by: " + thM7380exceptionOrNullimpl);
                    }
                    return Unit.INSTANCE;
                }
                triple = (Triple) marketEventsViewModel$updateEventListByWsFromKotlin$1.L$2;
                Object obj2 = marketEventsViewModel$updateEventListByWsFromKotlin$1.L$1;
                marketEventsViewModel2 = (MarketEventsViewModel) marketEventsViewModel$updateEventListByWsFromKotlin$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                objM7377constructorimpl = obj2;
                mutableSharedFlow = marketEventsViewModel2.EZpvd;
                second = triple.getSecond();
                marketEventsViewModel$updateEventListByWsFromKotlin$1.L$0 = objM7377constructorimpl;
                marketEventsViewModel$updateEventListByWsFromKotlin$1.L$1 = null;
                marketEventsViewModel$updateEventListByWsFromKotlin$1.L$2 = null;
                marketEventsViewModel$updateEventListByWsFromKotlin$1.label = 3;
                if (mutableSharedFlow.emit((Integer) second, marketEventsViewModel$updateEventListByWsFromKotlin$1) != objCopydefault) {
                    return objCopydefault;
                }
                obj = objM7377constructorimpl;
                objM7377constructorimpl = obj;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            marketEventsViewModel = (MarketEventsViewModel) marketEventsViewModel$updateEventListByWsFromKotlin$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((Triple) objEZpvd);
        MarketEventsViewModel marketEventsViewModel3 = marketEventsViewModel;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            Triple triple2 = (Triple) objM7377constructorimpl;
            if (!((Collection) triple2.getThird()).isEmpty()) {
                InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(triple2.getThird());
                marketEventsViewModel$updateEventListByWsFromKotlin$1.L$0 = marketEventsViewModel3;
                marketEventsViewModel$updateEventListByWsFromKotlin$1.L$1 = objM7377constructorimpl;
                marketEventsViewModel$updateEventListByWsFromKotlin$1.L$2 = triple2;
                marketEventsViewModel$updateEventListByWsFromKotlin$1.label = 2;
                if (updateEventList$default(marketEventsViewModel3, activity, false, marketEventsViewModel$updateEventListByWsFromKotlin$1, 2, null) == objCopydefault) {
                    return objCopydefault;
                }
                marketEventsViewModel2 = marketEventsViewModel3;
                triple = triple2;
                mutableSharedFlow = marketEventsViewModel2.EZpvd;
                second = triple.getSecond();
                marketEventsViewModel$updateEventListByWsFromKotlin$1.L$0 = objM7377constructorimpl;
                marketEventsViewModel$updateEventListByWsFromKotlin$1.L$1 = null;
                marketEventsViewModel$updateEventListByWsFromKotlin$1.L$2 = null;
                marketEventsViewModel$updateEventListByWsFromKotlin$1.label = 3;
                if (mutableSharedFlow.emit((Integer) second, marketEventsViewModel$updateEventListByWsFromKotlin$1) != objCopydefault) {
                }
            }
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object updateEventList$default(MarketEventsViewModel marketEventsViewModel, InterfaceC49371unL interfaceC49371unL, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return marketEventsViewModel.KWHzl((InterfaceC49371unL<? extends List<? extends MarketEventsVo>>) interfaceC49371unL, z, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(InterfaceC49371unL<? extends List<? extends MarketEventsVo>> interfaceC49371unL, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        MarketEventsViewModel$updateEventList$1 marketEventsViewModel$updateEventList$1;
        MarketEventsViewModel marketEventsViewModel;
        Long lKWHzl;
        Object next;
        long jLongValue;
        MarketCoinInfo marketCoinInfo;
        MarketEventResp.BigEventPo bigEventPoDjBIcL;
        if (continuation instanceof MarketEventsViewModel$updateEventList$1) {
            marketEventsViewModel$updateEventList$1 = (MarketEventsViewModel$updateEventList$1) continuation;
            int i = marketEventsViewModel$updateEventList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketEventsViewModel$updateEventList$1.label = i - Integer.MIN_VALUE;
            } else {
                marketEventsViewModel$updateEventList$1 = new MarketEventsViewModel$updateEventList$1(this, continuation);
            }
        }
        Object obj = marketEventsViewModel$updateEventList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketEventsViewModel$updateEventList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketEventsViewModel$updateEventList$2 marketEventsViewModel$updateEventList$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel$updateEventList$2
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C36157oRj) obj2).copydefault();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C36157oRj) obj2).OLrzqt((InterfaceC49371unL) obj3);
                }
            };
            marketEventsViewModel$updateEventList$1.L$0 = this;
            marketEventsViewModel$updateEventList$1.L$1 = interfaceC49371unL;
            marketEventsViewModel$updateEventList$1.Z$0 = z;
            marketEventsViewModel$updateEventList$1.label = 1;
            if (KWHzl(marketEventsViewModel$updateEventList$2, interfaceC49371unL, marketEventsViewModel$updateEventList$1) == objCopydefault) {
                return objCopydefault;
            }
            marketEventsViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = marketEventsViewModel$updateEventList$1.Z$0;
            interfaceC49371unL = (InterfaceC49371unL) marketEventsViewModel$updateEventList$1.L$1;
            marketEventsViewModel = (MarketEventsViewModel) marketEventsViewModel$updateEventList$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            Iterator it = ((Iterable) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).iterator();
            while (true) {
                lKWHzl = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((MarketEventsVo) next) instanceof MarketEventsVo.Content) {
                    break;
                }
            }
            MarketEventsVo marketEventsVo = (MarketEventsVo) next;
            if (marketEventsVo != null) {
                MarketEventsVo.Content content = marketEventsVo instanceof MarketEventsVo.Content ? (MarketEventsVo.Content) marketEventsVo : null;
                if (content != null && (bigEventPoDjBIcL = content.djBIcL()) != null) {
                    lKWHzl = C56443yFo.KWHzl(bigEventPoDjBIcL.getTimeStamp());
                }
                if (lKWHzl != null) {
                    jLongValue = lKWHzl.longValue();
                }
                C36236oUh c36236oUh = C36236oUh.EZpvd;
                marketCoinInfo = marketEventsViewModel.OLrzqt;
                if (marketCoinInfo != null) {
                    String instrumentId = "";
                    c36236oUh.EZpvd(instrumentId, jLongValue);
                    if (z) {
                    }
                }
            } else {
                jLongValue = 0;
                C36236oUh c36236oUh2 = C36236oUh.EZpvd;
                marketCoinInfo = marketEventsViewModel.OLrzqt;
                if (marketCoinInfo != null || (instrumentId = marketCoinInfo.getInstrumentId()) == null) {
                    String instrumentId2 = "";
                }
                c36236oUh2.EZpvd(instrumentId2, jLongValue);
                if (z) {
                    marketEventsViewModel.AhwBna();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String EZpvd(MarketCoinInfo marketCoinInfo) {
        if (marketCoinInfo == null) {
            return "";
        }
        if (Intrinsics.EZpvd((Object) marketCoinInfo.getInstrumentType(), (Object) "FUTURES")) {
            String instrumentId = marketCoinInfo.getInstrumentId();
            FutureInstrument futureInstrumentValues = values();
            if (futureInstrumentValues == null) {
                return "";
            }
            String alias = futureInstrumentValues.getAlias();
            if (C33129mqd.OLrzqt((CharSequence) alias)) {
                switch (alias.hashCode()) {
                    case -927019468:
                        if (alias.equals("next_month")) {
                            alias = "monthly";
                        }
                        break;
                    case -560300811:
                        if (alias.equals("this_week")) {
                            alias = "weekly";
                        }
                        break;
                    case -198384225:
                        if (alias.equals("this_month")) {
                            alias = "bimonthly";
                        }
                        break;
                    case 651403948:
                        if (alias.equals("quarter")) {
                            alias = "quarterly";
                        }
                        break;
                    case 1217310144:
                        if (alias.equals("next_week")) {
                            alias = "biweekly";
                        }
                        break;
                    case 1902260576:
                        if (alias.equals("next_quarter")) {
                            alias = "biquarterly";
                        }
                        break;
                }
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) instrumentId, new String[]{"-"}, false, 0, 6, (Object) null);
                if (listSplit$default.size() == 3) {
                    String str = listSplit$default.get(0) + "-" + listSplit$default.get(1) + "-" + alias;
                    String instrumentType = marketCoinInfo.getInstrumentType();
                    Locale locale = Locale.ROOT;
                    String lowerCase = instrumentType.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    String lowerCase2 = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    return "https://www.okx.com/trade-" + lowerCase + "/" + lowerCase2;
                }
            }
            return "";
        }
        String instrumentType2 = marketCoinInfo.getInstrumentType();
        Locale locale2 = Locale.ROOT;
        String lowerCase3 = instrumentType2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
        String lowerCase4 = marketCoinInfo.getInstrumentId().toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
        return "https://www.okx.com/trade-" + lowerCase3 + "/" + lowerCase4;
    }

    private final FutureInstrument values() {
        BizInstrument bizInstrumentValueOf;
        MarketCoinInfo marketCoinInfo = this.OLrzqt;
        if (marketCoinInfo == null) {
            return null;
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        if (interfaceC54581xNrCopydefault == null || (bizInstrumentValueOf = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null)) == null) {
            AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(marketCoinInfo.getInstrumentType());
            bizInstrumentValueOf = abstractC54531xLwKWHzl != null ? abstractC54531xLwKWHzl.valueOf(marketCoinInfo.getInstrumentId()) : null;
        }
        if (bizInstrumentValueOf instanceof FutureInstrument) {
            return (FutureInstrument) bizInstrumentValueOf;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String EZpvd(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 48:
                    if (str.equals("0")) {
                        return OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK;
                    }
                    break;
                case 49:
                    if (str.equals("1")) {
                        return "cont";
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        return "usds";
                    }
                    break;
            }
        }
        return null;
    }

    @Override // o.AbstractC49411unz, androidx.lifecycle.ViewModel
    public void onCleared() {
        Object objM7377constructorimpl;
        super.onCleared();
        if (pDX.AEQbTJ.AYXKKw()) {
            try {
                Result.Application application = Result.Companion;
                valueOf().OLrzqt();
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("MarketEventsViewModel", "Failed to unsubscribe WebSocket", thM7380exceptionOrNullimpl);
            }
        }
    }
}
