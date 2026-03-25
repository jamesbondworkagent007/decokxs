package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.math.BigDecimal;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41638qub;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41464qrM implements InterfaceC49404uns<kotlin.Pair<? extends java.util.List<? extends InterfaceC41638qub>, ? extends java.util.Map<java.lang.String, ? extends TickersData>>, java.util.List<? extends InterfaceC41638qub>> {
    public final C41609qtz EZpvd;
    private static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C41464qrM(@NotNull C41609qtz c41609qtz) {
        Intrinsics.checkNotNullParameter(c41609qtz, "");
        this.EZpvd = c41609qtz;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    public java.lang.Object EZpvd(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41638qub>, ? extends java.util.Map<java.lang.String, TickersData>> pair, @NotNull Continuation<? super java.util.List<? extends InterfaceC41638qub>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, pair, continuation);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return copydefault((kotlin.Pair<? extends java.util.List<? extends InterfaceC41638qub>, ? extends java.util.Map<java.lang.String, TickersData>>) obj, (Continuation<? super java.util.List<? extends InterfaceC41638qub>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    public /* synthetic */ java.lang.Object copydefault(java.lang.Object obj, Continuation continuation) {
        return EZpvd((kotlin.Pair<? extends java.util.List<? extends InterfaceC41638qub>, ? extends java.util.Map<java.lang.String, TickersData>>) obj, (Continuation<? super java.util.List<? extends InterfaceC41638qub>>) continuation);
    }

    /* JADX INFO: renamed from: o.qrM$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qrM.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.Object copydefault(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41638qub>, ? extends java.util.Map<java.lang.String, TickersData>> pair, @NotNull Continuation<? super java.util.List<? extends InterfaceC41638qub>> continuation) {
        java.util.List<? extends InterfaceC41638qub> listComponent1 = pair.component1();
        final java.util.Map<java.lang.String, TickersData> mapComponent2 = pair.component2();
        C41434qqj.KWHzl.AEQbTJ("ApplyFuturesTickerUseCase", "apply futures ticker, voListSize=" + listComponent1.size() + ", tickersMapSize=" + mapComponent2.size());
        return C41389qpr.EZpvd(listComponent1, new Function1() { // from class: o.qrK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41464qrM.OLrzqt(this.copydefault, mapComponent2, (InterfaceC41638qub) obj);
            }
        });
    }

    public static final InterfaceC41638qub OLrzqt(C41464qrM c41464qrM, java.util.Map map, InterfaceC41638qub interfaceC41638qub) {
        Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
        return c41464qrM.copydefault(interfaceC41638qub, (java.util.Map<java.lang.String, TickersData>) map);
    }

    public final InterfaceC41638qub copydefault(InterfaceC41638qub interfaceC41638qub, java.util.Map<java.lang.String, TickersData> map) {
        TickersData tickersData = map.get(interfaceC41638qub.values().getInstId());
        return tickersData == null ? interfaceC41638qub : InterfaceC41638qub.ActionBar.onCopy$default(interfaceC41638qub, AEQbTJ(tickersData), EZpvd(tickersData), EZpvd(tickersData, map.get(interfaceC41638qub.values().getQuoteSymbol())), OLrzqt(tickersData), EZpvd(interfaceC41638qub.values(), tickersData, map.get(interfaceC41638qub.values().getTradeSymbol())), null, null, 96, null);
    }

    private final java.lang.Double AEQbTJ(TickersData tickersData) {
        return (java.lang.Double) this.EZpvd.OLrzqt(tickersData);
    }

    private final java.lang.Double EZpvd(TickersData tickersData) {
        if (tickersData == null) {
            return null;
        }
        return java.lang.Double.valueOf(C33129mqd.AEQbTJ(tickersData.getLast()));
    }

    private final java.lang.Double EZpvd(TickersData tickersData, TickersData tickersData2) {
        if (tickersData == null || tickersData2 == null) {
            return null;
        }
        return java.lang.Double.valueOf(C33129mqd.AEQbTJ(tickersData.getLast()) * C33129mqd.AEQbTJ(tickersData2.getLast()));
    }

    private final BigDecimal OLrzqt(TickersData tickersData) {
        java.lang.String vol24h;
        if (tickersData == null || (vol24h = tickersData.getVol24h()) == null) {
            return null;
        }
        return C33129mqd.EZpvd(vol24h);
    }

    public final BigDecimal EZpvd(BizInstrument bizInstrument, TickersData tickersData, TickersData tickersData2) {
        java.lang.String strMulS$default;
        java.lang.String last;
        java.lang.String futureContractVal = bizInstrument.getFutureContractVal();
        if (bizInstrument.isPositiveContract()) {
            java.lang.String strMulS$default2 = C33129mqd.mulS$default(tickersData != null ? tickersData.getVol24h() : null, futureContractVal, null, null, null, 14, null);
            if (tickersData2 == null || (last = tickersData2.getLast()) == null) {
                return null;
            }
            strMulS$default = C33129mqd.mulS$default(strMulS$default2, last, null, null, null, 14, null);
        } else {
            strMulS$default = C33129mqd.mulS$default(tickersData != null ? tickersData.getVol24h() : null, futureContractVal, null, null, null, 14, null);
        }
        return C33129mqd.EZpvd(strMulS$default);
    }
}
