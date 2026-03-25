package o;

import com.okinc.market.quotation.domain.futures.GetFuturesTickersUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.futures.GetFuturesTickersUseCase$onExecute$1;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41475qrX implements InterfaceC49404uns<java.util.List<? extends InterfaceC41638qub>, java.util.Map<java.lang.String, ? extends TickersData>> {
    private static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final C40430qVo AEQbTJ;
    public final InterfaceC56387yDm OLrzqt;

    @yCM
    public C41475qrX(@NotNull C40430qVo c40430qVo) {
        Intrinsics.checkNotNullParameter(c40430qVo, "");
        this.AEQbTJ = c40430qVo;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qrT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41475qrX.AEQbTJ();
            }
        });
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

    public java.lang.Object KWHzl(@NotNull java.util.List<? extends InterfaceC41638qub> list, @NotNull Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, list, continuation);
    }

    public /* synthetic */ java.lang.Object copydefault(java.lang.Object obj, Continuation continuation) {
        return KWHzl((java.util.List<? extends InterfaceC41638qub>) obj, (Continuation<? super java.util.Map<java.lang.String, TickersData>>) continuation);
    }

    /* JADX INFO: renamed from: o.qrX$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qrX.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final pXF<java.lang.Integer, java.lang.Long> copydefault() {
        return (pXF) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pXF AEQbTJ() {
        return new pXF(false);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(11:12|63|13|44|49|(1:51)|52|(1:54)|55|(1:57)|58)(2:17|18))(1:19))(2:20|(2:22|23)(2:24|(2:26|(5:28|(4:31|(2:33|68)(1:69)|34|29)|67|35|(1:37)(1:38))(2:59|60))(2:61|62)))|39|65|40|(1:42)(9:43|44|49|(0)|52|(0)|55|(0)|58)) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.List<? extends InterfaceC41638qub> list, @NotNull Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) throws java.lang.Throwable {
        GetFuturesTickersUseCase$onExecute$1 getFuturesTickersUseCase$onExecute$1;
        C41475qrX c41475qrX;
        int i;
        int i2;
        C41475qrX c41475qrX2;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        java.util.Map map;
        if (continuation instanceof GetFuturesTickersUseCase$onExecute$1) {
            getFuturesTickersUseCase$onExecute$1 = (GetFuturesTickersUseCase$onExecute$1) continuation;
            int i3 = getFuturesTickersUseCase$onExecute$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getFuturesTickersUseCase$onExecute$1.label = i3 - Integer.MIN_VALUE;
            } else {
                getFuturesTickersUseCase$onExecute$1 = new GetFuturesTickersUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getFuturesTickersUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = getFuturesTickersUseCase$onExecute$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("GetFuturesTickersUseCase", "get futures tickers, inputSize=" + list.size());
            if (list.isEmpty()) {
                C41434qqj.w$default(c41434qqj, "GetFuturesTickersUseCase", "input is empty", null, 4, null);
                return C56424yEw.KWHzl();
            }
            java.lang.Integer numAEQbTJ = C41389qpr.AEQbTJ(list, new Function1() { // from class: o.qrV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(C41475qrX.AEQbTJ((InterfaceC41638qub) obj));
                }
            });
            if (numAEQbTJ == null) {
                return C56424yEw.KWHzl();
            }
            int iIntValue = numAEQbTJ.intValue();
            if (copydefault().KWHzl(C56443yFo.AEQbTJ(iIntValue)) != null) {
                c41434qqj.KWHzl("GetFuturesTickersUseCase", "request too frequent, skip");
                return C56424yEw.KWHzl();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : list) {
                InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(((InterfaceC41638qub) obj).values().getClass());
                java.lang.Object arrayList = linkedHashMap.get(interfaceC56551yJoAEQbTJ);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    linkedHashMap.put(interfaceC56551yJoAEQbTJ, arrayList);
                }
                ((java.util.List) arrayList).add(obj);
            }
            GetFuturesTickersUseCase$onExecute$$inlined$executeAsyncTasks$1 getFuturesTickersUseCase$onExecute$$inlined$executeAsyncTasks$1 = new GetFuturesTickersUseCase$onExecute$$inlined$executeAsyncTasks$1(null, (java.util.List) linkedHashMap.get(C56524yIo.AEQbTJ(SwapInstrument.class)), (java.util.List) linkedHashMap.get(C56524yIo.AEQbTJ(FutureInstrument.class)), list, list);
            getFuturesTickersUseCase$onExecute$1.L$0 = this;
            getFuturesTickersUseCase$onExecute$1.I$0 = iIntValue;
            getFuturesTickersUseCase$onExecute$1.label = 1;
            java.lang.Object objCoroutineScope = CoroutineScopeKt.coroutineScope(getFuturesTickersUseCase$onExecute$$inlined$executeAsyncTasks$1, getFuturesTickersUseCase$onExecute$1);
            if (objCoroutineScope == objCopydefault) {
                return objCopydefault;
            }
            c41475qrX = this;
            i = iIntValue;
            objEZpvd = objCoroutineScope;
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = getFuturesTickersUseCase$onExecute$1.I$0;
                c41475qrX2 = (C41475qrX) getFuturesTickersUseCase$onExecute$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd);
                    objM7377constructorimpl = Result.m7377constructorimpl((java.util.Map) objEZpvd);
                } catch (java.lang.Throwable th) {
                    th = th;
                    c41475qrX = c41475qrX2;
                    i = i2;
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    i2 = i;
                    c41475qrX2 = c41475qrX;
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    C41434qqj.KWHzl.copydefault("GetFuturesTickersUseCase", "get futures tickers error: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                }
                java.util.Map mapKWHzl = C56424yEw.KWHzl();
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = mapKWHzl;
                }
                map = (java.util.Map) objM7377constructorimpl;
                if (!map.isEmpty()) {
                    c41475qrX2.copydefault().AEQbTJ(C56443yFo.AEQbTJ(i2), C56443yFo.KWHzl(java.lang.System.currentTimeMillis()), 2000L);
                    C41434qqj.KWHzl.KWHzl("GetFuturesTickersUseCase", "get futures tickers result: " + map.size() + " tickers");
                }
                return objM7377constructorimpl;
            }
            i = getFuturesTickersUseCase$onExecute$1.I$0;
            c41475qrX = (C41475qrX) getFuturesTickersUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        Quartet quartet = (Quartet) objEZpvd;
        java.util.List list2 = (java.util.List) quartet.component1();
        java.util.List list3 = (java.util.List) quartet.component2();
        java.util.List list4 = (java.util.List) quartet.component3();
        java.util.List list5 = (java.util.List) quartet.component4();
        Result.Application application2 = Result.Companion;
        C40429qVn c40429qVn = new C40429qVn(C56424yEw.gEmmrt(C56390yDp.OLrzqt("SWAP", list2), C56390yDp.OLrzqt("FUTURES", list3)), CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list4, (java.lang.Iterable) list5), false, 4, null);
        C40430qVo c40430qVo = c41475qrX.AEQbTJ;
        getFuturesTickersUseCase$onExecute$1.L$0 = c41475qrX;
        getFuturesTickersUseCase$onExecute$1.I$0 = i;
        getFuturesTickersUseCase$onExecute$1.label = 2;
        objEZpvd = c40430qVo.EZpvd(c40429qVn, getFuturesTickersUseCase$onExecute$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        i2 = i;
        c41475qrX2 = c41475qrX;
        objM7377constructorimpl = Result.m7377constructorimpl((java.util.Map) objEZpvd);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        java.util.Map mapKWHzl2 = C56424yEw.KWHzl();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        map = (java.util.Map) objM7377constructorimpl;
        if (!map.isEmpty()) {
        }
        return objM7377constructorimpl;
    }

    public static final int AEQbTJ(InterfaceC41638qub interfaceC41638qub) {
        Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
        return interfaceC41638qub.values().getInstId().hashCode();
    }

    /* JADX INFO: renamed from: o.qrX$Activity */
    public static final class Activity implements Function1<InterfaceC41638qub, java.lang.String> {
        public static final Activity AEQbTJ = new Activity();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41638qub interfaceC41638qub) {
            Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
            return interfaceC41638qub.values().getInstId();
        }
    }

    /* JADX INFO: renamed from: o.qrX$ActionBar */
    public static final class ActionBar implements Function1<InterfaceC41638qub, java.lang.String> {
        public static final ActionBar OLrzqt = new ActionBar();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41638qub interfaceC41638qub) {
            Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
            return interfaceC41638qub.values().getInstId();
        }
    }

    /* JADX INFO: renamed from: o.qrX$TaskDescription */
    public static final class TaskDescription implements Function1<InterfaceC41638qub, java.lang.String> {
        public static final TaskDescription OLrzqt = new TaskDescription();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41638qub interfaceC41638qub) {
            Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
            return interfaceC41638qub.ejfBZ();
        }
    }

    /* JADX INFO: renamed from: o.qrX$StateListAnimator */
    public static final class StateListAnimator implements Function1<InterfaceC41638qub, java.lang.String> {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41638qub interfaceC41638qub) {
            Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
            return interfaceC41638qub.isConnected();
        }
    }
}
