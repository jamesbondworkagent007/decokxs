package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.math.BigDecimal;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41641que;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41520qsP implements InterfaceC49405unt<kotlin.Pair<? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.Map<java.lang.String, ? extends TickersData>>, java.util.List<? extends InterfaceC41641que>> {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final C41609qtz EZpvd;

    @yCM
    public C41520qsP(@NotNull C41609qtz c41609qtz) {
        Intrinsics.checkNotNullParameter(c41609qtz, "");
        this.EZpvd = c41609qtz;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public java.util.List<InterfaceC41641que> EZpvd(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.Map<java.lang.String, TickersData>> pair) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, pair);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX INFO: renamed from: o.qsP$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsP.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<InterfaceC41641que> AEQbTJ(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.Map<java.lang.String, TickersData>> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.List<? extends InterfaceC41641que> listComponent1 = pair.component1();
        final java.util.Map<java.lang.String, TickersData> mapComponent2 = pair.component2();
        C41434qqj.KWHzl.AEQbTJ("ApplySpotTickerUseCase", "apply spot ticker, voListSize=" + listComponent1.size() + ", tickersMapSize=" + mapComponent2.size());
        return C41389qpr.EZpvd(listComponent1, new Function1() { // from class: o.qsM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41520qsP.OLrzqt(this.KWHzl, mapComponent2, (InterfaceC41641que) obj);
            }
        });
    }

    public static final InterfaceC41641que OLrzqt(C41520qsP c41520qsP, java.util.Map map, InterfaceC41641que interfaceC41641que) {
        Intrinsics.checkNotNullParameter(interfaceC41641que, "");
        return c41520qsP.KWHzl(interfaceC41641que, map);
    }

    public final InterfaceC41641que KWHzl(InterfaceC41641que interfaceC41641que, java.util.Map<java.lang.String, TickersData> map) {
        TickersData tickersData = map.get(interfaceC41641que.values().getInstId());
        TickersData tickersData2 = map.get(interfaceC41641que.values().getQuoteSymbol());
        return (tickersData == null && tickersData2 == null) ? interfaceC41641que : InterfaceC41641que.Application.onCopy$default(interfaceC41641que, KWHzl(tickersData), AEQbTJ(tickersData), OLrzqt(tickersData, tickersData2), OLrzqt(tickersData), copydefault(tickersData, tickersData2), null, null, 96, null);
    }

    public final java.lang.Double KWHzl(TickersData tickersData) {
        return (java.lang.Double) this.EZpvd.OLrzqt(tickersData);
    }

    public final java.lang.Double AEQbTJ(TickersData tickersData) {
        if (tickersData == null) {
            return null;
        }
        return java.lang.Double.valueOf(C33129mqd.AEQbTJ(tickersData.getLast()));
    }

    public final java.lang.Double OLrzqt(TickersData tickersData, TickersData tickersData2) {
        if (tickersData == null || tickersData2 == null) {
            return null;
        }
        return java.lang.Double.valueOf(C33129mqd.AEQbTJ(tickersData.getLast()) * C33129mqd.AEQbTJ(tickersData2.getLast()));
    }

    public final BigDecimal OLrzqt(TickersData tickersData) {
        java.lang.String vol24h;
        if (tickersData == null || (vol24h = tickersData.getVol24h()) == null) {
            return null;
        }
        return C33129mqd.EZpvd(vol24h);
    }

    public final BigDecimal copydefault(TickersData tickersData, TickersData tickersData2) {
        java.lang.String volCcy24h;
        java.lang.String last;
        java.lang.String strMulS$default;
        if (tickersData == null || (volCcy24h = tickersData.getVolCcy24h()) == null || tickersData2 == null || (last = tickersData2.getLast()) == null || (strMulS$default = C33129mqd.mulS$default(volCcy24h, last, null, null, null, 14, null)) == null) {
            return null;
        }
        return C33129mqd.EZpvd(strMulS$default);
    }
}
