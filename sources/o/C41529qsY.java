package o;

import com.okinc.market.quotation.domain.spot.GetSpotTickersUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.spot.GetSpotTickersUseCase$onExecute$1;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41529qsY implements InterfaceC49404uns<java.util.List<? extends InterfaceC41641que>, java.util.Map<java.lang.String, ? extends TickersData>> {
    private static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final C40430qVo AEQbTJ;
    public final InterfaceC56387yDm copydefault;

    @yCM
    public C41529qsY(@NotNull C40430qVo c40430qVo) {
        Intrinsics.checkNotNullParameter(c40430qVo, "");
        this.AEQbTJ = c40430qVo;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.qtc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41529qsY.copydefault();
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object copydefault(@NotNull java.util.List<? extends InterfaceC41641que> list, @NotNull Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, list, continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return copydefault((java.util.List<? extends InterfaceC41641que>) obj, (Continuation<? super java.util.Map<java.lang.String, TickersData>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX INFO: renamed from: o.qsY$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final pXF<java.lang.Integer, java.lang.Long> AEQbTJ() {
        return (pXF) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pXF copydefault() {
        return new pXF(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(10:12|56|13|37|42|(1:44)|45|(1:47)|48|(2:50|51)(1:60))(2:17|18))(1:19))(2:20|(2:22|23)(2:24|(2:26|(2:28|(1:30)(1:31))(2:52|53))(2:54|55)))|32|58|33|(1:35)(8:36|37|42|(0)|45|(0)|48|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
    
        r15 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.util.List<? extends InterfaceC41641que> list, @NotNull Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) throws java.lang.Throwable {
        GetSpotTickersUseCase$onExecute$1 getSpotTickersUseCase$onExecute$1;
        C41529qsY c41529qsY;
        int i;
        C41529qsY c41529qsY2;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof GetSpotTickersUseCase$onExecute$1) {
            getSpotTickersUseCase$onExecute$1 = (GetSpotTickersUseCase$onExecute$1) continuation;
            int i2 = getSpotTickersUseCase$onExecute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getSpotTickersUseCase$onExecute$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getSpotTickersUseCase$onExecute$1 = new GetSpotTickersUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getSpotTickersUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getSpotTickersUseCase$onExecute$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("GetSpotTickersUseCase", "get spot tickers, inputSize=" + list.size());
            if (list.isEmpty()) {
                C41434qqj.w$default(c41434qqj, "GetSpotTickersUseCase", "input is empty", null, 4, null);
                return C56424yEw.KWHzl();
            }
            java.lang.Integer numAEQbTJ = C41389qpr.AEQbTJ(list, new Function1() { // from class: o.qtf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(C41529qsY.KWHzl((InterfaceC41641que) obj));
                }
            });
            if (numAEQbTJ == null) {
                return C56424yEw.KWHzl();
            }
            int iIntValue = numAEQbTJ.intValue();
            if (AEQbTJ().KWHzl(C56443yFo.AEQbTJ(iIntValue)) != null) {
                c41434qqj.KWHzl("GetSpotTickersUseCase", "request too frequent, skip");
                return C56424yEw.KWHzl();
            }
            GetSpotTickersUseCase$onExecute$$inlined$executeAsyncTasks$1 getSpotTickersUseCase$onExecute$$inlined$executeAsyncTasks$1 = new GetSpotTickersUseCase$onExecute$$inlined$executeAsyncTasks$1(null, list, list);
            getSpotTickersUseCase$onExecute$1.L$0 = this;
            getSpotTickersUseCase$onExecute$1.I$0 = iIntValue;
            getSpotTickersUseCase$onExecute$1.label = 1;
            java.lang.Object objCoroutineScope = CoroutineScopeKt.coroutineScope(getSpotTickersUseCase$onExecute$$inlined$executeAsyncTasks$1, getSpotTickersUseCase$onExecute$1);
            if (objCoroutineScope == objCopydefault) {
                return objCopydefault;
            }
            c41529qsY = this;
            objEZpvd = objCoroutineScope;
            i = iIntValue;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = getSpotTickersUseCase$onExecute$1.I$0;
                c41529qsY2 = (C41529qsY) getSpotTickersUseCase$onExecute$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd);
                    objM7377constructorimpl = Result.m7377constructorimpl((java.util.Map) objEZpvd);
                } catch (java.lang.Throwable th) {
                    th = th;
                    c41529qsY = c41529qsY2;
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    c41529qsY2 = c41529qsY;
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    C41434qqj.KWHzl.copydefault("GetSpotTickersUseCase", "get spot tickers failed", thM7380exceptionOrNullimpl);
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    c41529qsY2.AEQbTJ().AEQbTJ(C56443yFo.AEQbTJ(i), C56443yFo.KWHzl(java.lang.System.currentTimeMillis()), 2000L);
                    C41434qqj.KWHzl.KWHzl("GetSpotTickersUseCase", "get spot tickers result: " + ((java.util.Map) objM7377constructorimpl).size() + " tickers");
                }
                return !Result.m7383isFailureimpl(objM7377constructorimpl) ? C56424yEw.KWHzl() : objM7377constructorimpl;
            }
            i = getSpotTickersUseCase$onExecute$1.I$0;
            c41529qsY = (C41529qsY) getSpotTickersUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        kotlin.Pair pair = (kotlin.Pair) objEZpvd;
        java.util.List list2 = (java.util.List) pair.component1();
        java.util.List list3 = (java.util.List) pair.component2();
        Result.Application application2 = Result.Companion;
        C40429qVn c40429qVn = new C40429qVn(C56423yEv.EZpvd(C56390yDp.OLrzqt("SPOT", list2)), list3, false, 4, null);
        C40430qVo c40430qVo = c41529qsY.AEQbTJ;
        getSpotTickersUseCase$onExecute$1.L$0 = c41529qsY;
        getSpotTickersUseCase$onExecute$1.I$0 = i;
        getSpotTickersUseCase$onExecute$1.label = 2;
        objEZpvd = c40430qVo.EZpvd(c40429qVn, getSpotTickersUseCase$onExecute$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        c41529qsY2 = c41529qsY;
        objM7377constructorimpl = Result.m7377constructorimpl((java.util.Map) objEZpvd);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
    }

    public static final int KWHzl(InterfaceC41641que interfaceC41641que) {
        Intrinsics.checkNotNullParameter(interfaceC41641que, "");
        return interfaceC41641que.values().getInstId().hashCode();
    }

    /* JADX INFO: renamed from: o.qsY$Activity */
    public static final class Activity implements Function1<InterfaceC41641que, java.lang.String> {
        public static final Activity OLrzqt = new Activity();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41641que interfaceC41641que) {
            Intrinsics.checkNotNullParameter(interfaceC41641que, "");
            return interfaceC41641que.values().getInstId();
        }
    }

    /* JADX INFO: renamed from: o.qsY$TaskDescription */
    public static final class TaskDescription implements Function1<InterfaceC41641que, java.lang.String> {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41641que interfaceC41641que) {
            Intrinsics.checkNotNullParameter(interfaceC41641que, "");
            return interfaceC41641que.values().getQuoteSymbol();
        }
    }
}
