package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradeapi.bean.RouteData;
import com.okinc.tradingbot.impl.strategy.init.MarketPlaceInitPresenter$refreshTrade$1;
import com.okinc.unify_trade.biz.AlgoShareConfigInfo;
import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wMM extends AbstractC49495upd {
    public InterfaceC58217yxC djBIcL;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;
    public final C56126xwt<kotlin.Pair<java.lang.Boolean, ParamBuilder>> AhwBna = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56111xwe<java.lang.String> gEmmrt = new C56111xwe<>();
    public final C54255xBq valueOf = new C54255xBq(true, fetchVPNInfo());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<kotlin.Pair<java.lang.Boolean, ParamBuilder>> isConnected() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.lang.String> values() {
        return this.gEmmrt;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wMM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Possible override for method o.upd.DbNXlk()Ljava/lang/String; */
    public final InterfaceC55881xsM DbNXlk() {
        return C55886xsR.OLrzqt.copydefault();
    }

    public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        if (AYXKKw()) {
            C54589xNz.EZpvd.EZpvd(false);
            this.gEmmrt.postValue("SHOW_INIT");
        }
        java.lang.Object objOLrzqt = OLrzqt(continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    public java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        this.gEmmrt.postValue("PULL_START");
        java.lang.Object objOLrzqt = OLrzqt(continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    @Override // o.AbstractC49495upd
    public java.lang.Object OLrzqt(RouteData routeData, boolean z, ParamBuilder paramBuilder, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC49495upd
    public java.lang.Object AEQbTJ(java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.String str3, ParamBuilder paramBuilder, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objAEQbTJ = AEQbTJ(new Function2() { // from class: o.wMO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return wMM.copydefault(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        }, true, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    public static final Unit copydefault(final wMM wmm, boolean z, java.lang.String str) {
        if (!z) {
            pUU.KWHzl("MarketPlaceInitPresenter", "refreshTrade failed with " + str);
            if (str == null) {
                str = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("errorMgs", str);
            wmm.AhwBna.KWHzl(new kotlin.Pair<>(java.lang.Boolean.FALSE, new ParamBuilder.ActionBar().copydefault(bundle).EZpvd()));
            wmm.fIwbmz();
            return Unit.INSTANCE;
        }
        wmm.KWHzl(new Function0() { // from class: o.wMR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wMM.OLrzqt(this.KWHzl);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(wMM wmm) {
        wmm.AhwBna.KWHzl(new kotlin.Pair<>(java.lang.Boolean.TRUE, new ParamBuilder.ActionBar().EZpvd(false).EZpvd()));
        wmm.fIwbmz();
        wmm.AhwBna();
        wmm.valueOf();
        return Unit.INSTANCE;
    }

    public final void KWHzl(final Function0<Unit> function0) {
        this.valueOf.fetchVPNInfo();
        final C54255xBq c54255xBq = this.valueOf;
        c54255xBq.KWHzl(new Function1() { // from class: o.wML
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wMM.copydefault(c54255xBq, this, (kotlin.Pair) obj);
            }
        });
        c54255xBq.copydefault(new Function1() { // from class: o.wMI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wMM.KWHzl((kotlin.Pair) obj);
            }
        });
        c54255xBq.OLrzqt(new Function1() { // from class: o.wMP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wMM.AEQbTJ(function0, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c54255xBq.fIwbmz();
    }

    public static final Unit copydefault(C54255xBq c54255xBq, wMM wmm, kotlin.Pair pair) {
        xOR xorCopydefault;
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.KWHzl("MarketPlaceInitPresenter", "loadMarketPlaceData resp: " + pair.getFirst());
        java.lang.String str = (java.lang.String) pair.getFirst();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c54255xBq.AEQbTJ())) {
            java.lang.Object data = ((ResponseData) pair.getSecond()).getData();
            Intrinsics.copydefault(data, "");
            java.util.List<BotCategoryConfig> list = (java.util.List) data;
            InterfaceC55881xsM interfaceC55881xsMDbNXlk = wmm.DbNXlk();
            if (interfaceC55881xsMDbNXlk != null) {
                interfaceC55881xsMDbNXlk.copydefault(list);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c54255xBq.OLrzqt())) {
            java.lang.Object data2 = ((ResponseData) pair.getSecond()).getData();
            Intrinsics.copydefault(data2, "");
            java.util.List<BotCategoryConfig> list2 = (java.util.List) data2;
            InterfaceC55881xsM interfaceC55881xsMDbNXlk2 = wmm.DbNXlk();
            if (interfaceC55881xsMDbNXlk2 != null) {
                interfaceC55881xsMDbNXlk2.KWHzl(list2);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c54255xBq.KWHzl())) {
            java.lang.Object data3 = ((ResponseData) pair.getSecond()).getData();
            Intrinsics.copydefault(data3, "");
            java.util.List list3 = (java.util.List) data3;
            InterfaceC55881xsM interfaceC55881xsMDbNXlk3 = wmm.DbNXlk();
            if (interfaceC55881xsMDbNXlk3 != null) {
                interfaceC55881xsMDbNXlk3.AEQbTJ((BotUserConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(list3));
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c54255xBq.EZpvd())) {
            java.lang.Object data4 = ((ResponseData) pair.getSecond()).getData();
            java.util.List list4 = data4 instanceof java.util.List ? (java.util.List) data4 : null;
            java.lang.Object objFirstOrNull = list4 != null ? CollectionsKt___CollectionsKt.firstOrNull(list4) : null;
            AlgoShareConfigInfo algoShareConfigInfo = objFirstOrNull instanceof AlgoShareConfigInfo ? (AlgoShareConfigInfo) objFirstOrNull : null;
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            if (interfaceC54581xNrCopydefault != null && (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) != null) {
                xorCopydefault.EZpvd(algoShareConfigInfo);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.copydefault("MarketPlaceInitPresenter", "loadBotData error: " + ((ResponseData) pair.getSecond()).getMsg());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function0 function0, boolean z) {
        pUU.KWHzl("MarketPlaceInitPresenter", "loadBotData status: " + z);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2, boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketPlaceInitPresenter$refreshTrade$1 marketPlaceInitPresenter$refreshTrade$1;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        if (continuation instanceof MarketPlaceInitPresenter$refreshTrade$1) {
            marketPlaceInitPresenter$refreshTrade$1 = (MarketPlaceInitPresenter$refreshTrade$1) continuation;
            int i = marketPlaceInitPresenter$refreshTrade$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketPlaceInitPresenter$refreshTrade$1.label = i - Integer.MIN_VALUE;
            } else {
                marketPlaceInitPresenter$refreshTrade$1 = new MarketPlaceInitPresenter$refreshTrade$1(this, continuation);
            }
        }
        MarketPlaceInitPresenter$refreshTrade$1 marketPlaceInitPresenter$refreshTrade$12 = marketPlaceInitPresenter$refreshTrade$1;
        java.lang.Object obj = marketPlaceInitPresenter$refreshTrade$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketPlaceInitPresenter$refreshTrade$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            marketPlaceInitPresenter$refreshTrade$12.L$0 = function2;
            marketPlaceInitPresenter$refreshTrade$12.label = 1;
            objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, z, null, marketPlaceInitPresenter$refreshTrade$12, 2, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function2 = (Function2) marketPlaceInitPresenter$refreshTrade$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default)) {
            function2.invoke(C56443yFo.KWHzl(true), null);
        } else {
            java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(false);
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8790ensureInitialize0E7RQCE$default);
            function2.invoke(boolKWHzl, thM7380exceptionOrNullimpl != null ? thM7380exceptionOrNullimpl.getMessage() : null);
        }
        return Unit.INSTANCE;
    }

    private final void fIwbmz() {
        java.lang.String value = this.gEmmrt.getValue();
        if (value != null) {
            int iHashCode = value.hashCode();
            if (iHashCode != -1011593784) {
                if (iHashCode == 912496914 && value.equals("SHOW_INIT")) {
                    AkhnZx();
                    return;
                }
            } else if (value.equals("PULL_START")) {
                this.gEmmrt.setValue("PULL_END");
                return;
            }
        }
        AkhnZx();
    }

    private final void AkhnZx() {
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgTimer = AbstractC58247yxg.timer(400L, java.util.concurrent.TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgTimer, "");
        this.djBIcL = C33024moe.subscribeOnIO$default(abstractC58247yxgTimer, (Function1) null, (Function0) null, new Function1() { // from class: o.wMK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wMM.copydefault(this.EZpvd, (java.lang.Long) obj);
            }
        }, 3, (java.lang.Object) null);
    }

    public static final Unit copydefault(wMM wmm, java.lang.Long l) {
        wmm.gEmmrt.setValue("DISMISS_INIT");
        return Unit.INSTANCE;
    }

    public final boolean fetchVPNInfo() {
        return ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).valueOf() || C48291uMa.Companion.AEQbTJ().EZpvd();
    }
}
