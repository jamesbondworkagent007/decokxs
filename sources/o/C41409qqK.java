package o;

import com.okinc.market.quotation.domain.coin.GetCoinTickersUseCase$onExecute$1;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41409qqK implements InterfaceC49404uns<java.util.List<? extends InterfaceC41583qtZ>, java.util.Map<java.lang.String, ? extends TickersData>> {
    private static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm EZpvd;
    public final C40430qVo copydefault;

    @yCM
    public C41409qqK(@NotNull C40430qVo c40430qVo) {
        Intrinsics.checkNotNullParameter(c40430qVo, "");
        this.copydefault = c40430qVo;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qqO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41409qqK.AEQbTJ();
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

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object AEQbTJ(@NotNull java.util.List<? extends InterfaceC41583qtZ> list, @NotNull Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, list, continuation);
    }

    /* JADX INFO: renamed from: o.qqK$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qqK.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final pXF<java.lang.Integer, java.lang.Long> copydefault() {
        return (pXF) this.EZpvd.getValue();
    }

    public static final pXF AEQbTJ() {
        return new pXF(false);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.List<? extends InterfaceC41583qtZ> list, @NotNull Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) throws java.lang.Throwable {
        GetCoinTickersUseCase$onExecute$1 getCoinTickersUseCase$onExecute$1;
        C41409qqK c41409qqK;
        java.lang.Throwable th;
        int i;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof GetCoinTickersUseCase$onExecute$1) {
            getCoinTickersUseCase$onExecute$1 = (GetCoinTickersUseCase$onExecute$1) continuation;
            int i2 = getCoinTickersUseCase$onExecute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getCoinTickersUseCase$onExecute$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getCoinTickersUseCase$onExecute$1 = new GetCoinTickersUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getCoinTickersUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getCoinTickersUseCase$onExecute$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (list.isEmpty()) {
                C41434qqj.w$default(C41434qqj.KWHzl, "GetCoinTickersUseCase", "get coin tickers input is empty", null, 4, null);
                return C56424yEw.KWHzl();
            }
            java.lang.Integer numAEQbTJ = C41389qpr.AEQbTJ(list, new Function1() { // from class: o.qqG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Integer.valueOf(C41409qqK.OLrzqt((InterfaceC41583qtZ) obj2));
                }
            });
            if (numAEQbTJ == null) {
                return C56424yEw.KWHzl();
            }
            int iIntValue = numAEQbTJ.intValue();
            if (copydefault().KWHzl(C56443yFo.AEQbTJ(iIntValue)) != null) {
                C41434qqj.KWHzl.KWHzl("GetCoinTickersUseCase", "get coin tickers is expired [uniqueKey: " + iIntValue + "]");
                return C56424yEw.KWHzl();
            }
            java.util.List listEZpvd = C41389qpr.EZpvd(list, new Function1() { // from class: o.qqL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C41409qqK.KWHzl((InterfaceC41583qtZ) obj2);
                }
            });
            try {
                Result.Application application = Result.Companion;
                C40430qVo c40430qVo = this.copydefault;
                C40429qVn c40429qVn = new C40429qVn(null, listEZpvd, false, 4, null);
                getCoinTickersUseCase$onExecute$1.L$0 = this;
                getCoinTickersUseCase$onExecute$1.I$0 = iIntValue;
                getCoinTickersUseCase$onExecute$1.label = 1;
                java.lang.Object objEZpvd = c40430qVo.EZpvd(c40429qVn, getCoinTickersUseCase$onExecute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c41409qqK = this;
                obj = objEZpvd;
                i = iIntValue;
            } catch (java.lang.Throwable th2) {
                c41409qqK = this;
                th = th2;
                i = iIntValue;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = getCoinTickersUseCase$onExecute$1.I$0;
            c41409qqK = (C41409qqK) getCoinTickersUseCase$onExecute$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((java.util.Map) obj);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            C41434qqj.KWHzl.KWHzl("GetCoinTickersUseCase", "get coin tickers success [size: " + ((java.util.Map) objM7377constructorimpl).size() + "]");
            c41409qqK.copydefault().AEQbTJ(C56443yFo.AEQbTJ(i), C56443yFo.KWHzl(java.lang.System.currentTimeMillis()), 2000L);
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C41434qqj.KWHzl.copydefault("GetCoinTickersUseCase", "get coin tickers error", thM7380exceptionOrNullimpl);
        }
        return Result.m7383isFailureimpl(objM7377constructorimpl) ? C56424yEw.KWHzl() : objM7377constructorimpl;
    }

    public static final int OLrzqt(InterfaceC41583qtZ interfaceC41583qtZ) {
        Intrinsics.checkNotNullParameter(interfaceC41583qtZ, "");
        return interfaceC41583qtZ.djBIcL().getSymbol().hashCode();
    }

    public static final java.lang.String KWHzl(InterfaceC41583qtZ interfaceC41583qtZ) {
        Intrinsics.checkNotNullParameter(interfaceC41583qtZ, "");
        return interfaceC41583qtZ.djBIcL().getSymbol();
    }
}
