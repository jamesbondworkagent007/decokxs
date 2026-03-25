package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41642quf;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41544qsn implements InterfaceC49404uns<kotlin.Pair<? extends java.util.List<? extends InterfaceC41642quf>, ? extends java.util.Map<java.lang.String, ? extends TickersData>>, java.util.List<? extends InterfaceC41642quf>> {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final C41609qtz EZpvd;

    @yCM
    public C41544qsn(@NotNull C41609qtz c41609qtz) {
        Intrinsics.checkNotNullParameter(c41609qtz, "");
        this.EZpvd = c41609qtz;
    }

    public java.lang.Object AEQbTJ(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41642quf>, ? extends java.util.Map<java.lang.String, TickersData>> pair, @NotNull Continuation<? super java.util.List<? extends InterfaceC41642quf>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, pair, continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    public /* synthetic */ java.lang.Object copydefault(java.lang.Object obj, Continuation continuation) {
        return AEQbTJ((kotlin.Pair<? extends java.util.List<? extends InterfaceC41642quf>, ? extends java.util.Map<java.lang.String, TickersData>>) obj, (Continuation<? super java.util.List<? extends InterfaceC41642quf>>) continuation);
    }

    /* JADX INFO: renamed from: o.qsn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41642quf>, ? extends java.util.Map<java.lang.String, TickersData>> pair, @NotNull Continuation<? super java.util.List<? extends InterfaceC41642quf>> continuation) {
        java.util.List<? extends InterfaceC41642quf> listComponent1 = pair.component1();
        final java.util.Map<java.lang.String, TickersData> mapComponent2 = pair.component2();
        C41434qqj.KWHzl.AEQbTJ("ApplyOptionsTickerUseCase", "apply options ticker, voListSize=" + listComponent1.size() + ", tickersMapSize=" + mapComponent2.size());
        return C41389qpr.EZpvd(listComponent1, new Function1() { // from class: o.qsr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41544qsn.KWHzl(this.AEQbTJ, mapComponent2, (InterfaceC41642quf) obj);
            }
        });
    }

    public static final InterfaceC41642quf KWHzl(C41544qsn c41544qsn, java.util.Map map, InterfaceC41642quf interfaceC41642quf) {
        Intrinsics.checkNotNullParameter(interfaceC41642quf, "");
        return c41544qsn.AEQbTJ(interfaceC41642quf, (java.util.Map<java.lang.String, TickersData>) map);
    }

    public final InterfaceC41642quf AEQbTJ(InterfaceC41642quf interfaceC41642quf, java.util.Map<java.lang.String, TickersData> map) {
        TickersData tickersData = map.get(interfaceC41642quf.OLrzqt().getInstId());
        return tickersData == null ? interfaceC41642quf : InterfaceC41642quf.TaskDescription.onCopy$default(interfaceC41642quf, EZpvd(tickersData), copydefault(tickersData), null, 4, null);
    }

    private final java.lang.Double EZpvd(TickersData tickersData) {
        return (java.lang.Double) this.EZpvd.OLrzqt(tickersData);
    }

    private final java.lang.Double copydefault(TickersData tickersData) {
        if (tickersData == null) {
            return null;
        }
        return java.lang.Double.valueOf(C33129mqd.AEQbTJ(tickersData.getLast()));
    }
}
