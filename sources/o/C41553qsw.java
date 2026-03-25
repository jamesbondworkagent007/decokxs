package o;

import com.okinc.market.quotation.domain.options.GetOptionsTickersUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.options.GetOptionsTickersUseCase$onExecute$1;
import com.okinc.market.quotation.domain.options.GetOptionsTickersUseCase$onExecute$lambda$7$$inlined$executeAsyncTasks$1;
import com.okinc.market.ticker.repo.MarkPriceTickersRepository;
import com.okinc.unify_trade.biz.subscribe.TickersData;
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

/* JADX INFO: renamed from: o.qsw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41553qsw implements InterfaceC49404uns<java.util.List<? extends InterfaceC41642quf>, java.util.Map<java.lang.String, ? extends TickersData>> {
    public final InterfaceC56387yDm EZpvd;
    public final C40430qVo KWHzl;
    public final MarkPriceTickersRepository OLrzqt;
    public boolean copydefault;
    private static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C41553qsw(@NotNull MarkPriceTickersRepository markPriceTickersRepository, @NotNull C40430qVo c40430qVo) {
        Intrinsics.checkNotNullParameter(markPriceTickersRepository, "");
        Intrinsics.checkNotNullParameter(c40430qVo, "");
        this.OLrzqt = markPriceTickersRepository;
        this.KWHzl = c40430qVo;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qst
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41553qsw.copydefault();
            }
        });
        this.copydefault = true;
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

    public java.lang.Object KWHzl(@NotNull java.util.List<? extends InterfaceC41642quf> list, @NotNull Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, list, continuation);
    }

    public /* synthetic */ java.lang.Object copydefault(java.lang.Object obj, Continuation continuation) {
        return KWHzl((java.util.List<? extends InterfaceC41642quf>) obj, (Continuation<? super java.util.Map<java.lang.String, TickersData>>) continuation);
    }

    /* JADX INFO: renamed from: o.qsw$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsw.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final pXF<java.lang.Integer, java.lang.Long> AEQbTJ() {
        return (pXF) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pXF copydefault() {
        return new pXF(false);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(11:12|71|13|43|48|(1:50)|51|(1:53)|54|(3:56|(1:60)|61)|(2:63|64)(1:73))(2:17|18))(1:19))(2:20|(2:22|23)(2:24|(2:26|(2:28|(1:30)(1:31))(2:65|66))(2:67|68)))|32|(1:37)(1:38)|69|39|(1:41)(9:42|43|48|(0)|51|(0)|54|(0)|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0101, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.List<? extends InterfaceC41642quf> list, @NotNull Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) throws java.lang.Throwable {
        GetOptionsTickersUseCase$onExecute$1 getOptionsTickersUseCase$onExecute$1;
        int iIntValue;
        java.lang.Object objCoroutineScope;
        C41553qsw c41553qsw;
        int i;
        C41553qsw c41553qsw2;
        java.lang.Object objM7377constructorimpl;
        kotlin.Pair pair;
        if (continuation instanceof GetOptionsTickersUseCase$onExecute$1) {
            getOptionsTickersUseCase$onExecute$1 = (GetOptionsTickersUseCase$onExecute$1) continuation;
            int i2 = getOptionsTickersUseCase$onExecute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getOptionsTickersUseCase$onExecute$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getOptionsTickersUseCase$onExecute$1 = new GetOptionsTickersUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getOptionsTickersUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getOptionsTickersUseCase$onExecute$1.label;
        java.util.Map mapOLrzqt = null;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("GetOptionsTickersUseCase", "get options tickers, inputSize=" + list.size());
            if (list.isEmpty()) {
                C41434qqj.w$default(c41434qqj, "GetOptionsTickersUseCase", "input is empty", null, 4, null);
                return C56424yEw.KWHzl();
            }
            java.lang.Integer numAEQbTJ = C41389qpr.AEQbTJ(list, new Function1() { // from class: o.qsv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Integer.valueOf(C41553qsw.copydefault((InterfaceC41642quf) obj2));
                }
            });
            if (numAEQbTJ == null) {
                return C56424yEw.KWHzl();
            }
            iIntValue = numAEQbTJ.intValue();
            if (AEQbTJ().KWHzl(C56443yFo.AEQbTJ(iIntValue)) != null) {
                c41434qqj.KWHzl("GetOptionsTickersUseCase", "request too frequent, skip");
                return C56424yEw.KWHzl();
            }
            GetOptionsTickersUseCase$onExecute$$inlined$executeAsyncTasks$1 getOptionsTickersUseCase$onExecute$$inlined$executeAsyncTasks$1 = new GetOptionsTickersUseCase$onExecute$$inlined$executeAsyncTasks$1(null, list, list);
            getOptionsTickersUseCase$onExecute$1.L$0 = this;
            getOptionsTickersUseCase$onExecute$1.I$0 = iIntValue;
            getOptionsTickersUseCase$onExecute$1.label = 1;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(getOptionsTickersUseCase$onExecute$$inlined$executeAsyncTasks$1, getOptionsTickersUseCase$onExecute$1);
            if (objCoroutineScope == objCopydefault) {
                return objCopydefault;
            }
            c41553qsw = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = getOptionsTickersUseCase$onExecute$1.I$0;
                c41553qsw2 = (C41553qsw) getOptionsTickersUseCase$onExecute$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl((kotlin.Pair) obj);
                } catch (java.lang.Throwable th) {
                    th = th;
                    c41553qsw = c41553qsw2;
                    iIntValue = i;
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    i = iIntValue;
                    c41553qsw2 = c41553qsw;
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    c41553qsw2.copydefault = false;
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                pair = (kotlin.Pair) objM7377constructorimpl;
                if (pair != null) {
                    java.util.Map map = (java.util.Map) pair.component1();
                    java.util.Map map2 = (java.util.Map) pair.component2();
                    if ((!map.isEmpty()) && (!map2.isEmpty())) {
                        c41553qsw2.AEQbTJ().AEQbTJ(C56443yFo.AEQbTJ(i), C56443yFo.KWHzl(java.lang.System.currentTimeMillis()), 2000L);
                        C41434qqj.KWHzl.KWHzl("GetOptionsTickersUseCase", "get options tickers result: markPrice=" + map.size() + ", cup=" + map2.size());
                    }
                    mapOLrzqt = C56424yEw.OLrzqt(map, map2);
                }
                return mapOLrzqt != null ? C56424yEw.KWHzl() : mapOLrzqt;
            }
            int i4 = getOptionsTickersUseCase$onExecute$1.I$0;
            c41553qsw = (C41553qsw) getOptionsTickersUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            iIntValue = i4;
            objCoroutineScope = obj;
        }
        kotlin.Pair pair2 = (kotlin.Pair) objCoroutineScope;
        java.util.List list2 = (java.util.List) pair2.component1();
        java.util.List list3 = (java.util.List) pair2.component2();
        java.lang.String str = (!c41553qsw.copydefault && list2.size() == 1) ? (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(list2) : null;
        Result.Application application2 = Result.Companion;
        GetOptionsTickersUseCase$onExecute$lambda$7$$inlined$executeAsyncTasks$1 getOptionsTickersUseCase$onExecute$lambda$7$$inlined$executeAsyncTasks$1 = new GetOptionsTickersUseCase$onExecute$lambda$7$$inlined$executeAsyncTasks$1(null, c41553qsw, str, c41553qsw, list3);
        getOptionsTickersUseCase$onExecute$1.L$0 = c41553qsw;
        getOptionsTickersUseCase$onExecute$1.I$0 = iIntValue;
        getOptionsTickersUseCase$onExecute$1.label = 2;
        java.lang.Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(getOptionsTickersUseCase$onExecute$lambda$7$$inlined$executeAsyncTasks$1, getOptionsTickersUseCase$onExecute$1);
        if (objCoroutineScope2 == objCopydefault) {
            return objCopydefault;
        }
        i = iIntValue;
        c41553qsw2 = c41553qsw;
        obj = objCoroutineScope2;
        objM7377constructorimpl = Result.m7377constructorimpl((kotlin.Pair) obj);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        pair = (kotlin.Pair) objM7377constructorimpl;
        if (pair != null) {
        }
        if (mapOLrzqt != null) {
        }
    }

    public static final int copydefault(InterfaceC41642quf interfaceC41642quf) {
        Intrinsics.checkNotNullParameter(interfaceC41642quf, "");
        return interfaceC41642quf.OLrzqt().getInstId().hashCode();
    }

    /* JADX INFO: renamed from: o.qsw$TaskDescription */
    public static final class TaskDescription implements Function1<InterfaceC41642quf, java.lang.String> {
        public static final TaskDescription EZpvd = new TaskDescription();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41642quf interfaceC41642quf) {
            Intrinsics.checkNotNullParameter(interfaceC41642quf, "");
            return interfaceC41642quf.OLrzqt().getInstFly();
        }
    }

    /* JADX INFO: renamed from: o.qsw$ActionBar */
    public static final class ActionBar implements Function1<InterfaceC41642quf, java.lang.String> {
        public static final ActionBar OLrzqt = new ActionBar();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41642quf interfaceC41642quf) {
            Intrinsics.checkNotNullParameter(interfaceC41642quf, "");
            return interfaceC41642quf.OLrzqt().getTradeSymbol();
        }
    }
}
