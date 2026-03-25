package o;

import com.okinc.market.quotation.domain.coin.GetRawCoinInfosUseCase$onExecute$1;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49404uns;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41414qqP implements InterfaceC49404uns<Unit, java.util.List<? extends TradeCoinInfo>> {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC54577xNn AEQbTJ;
    public final C41561qtD KWHzl;

    @yCM
    public C41414qqP(InterfaceC54577xNn interfaceC54577xNn, @NotNull C41561qtD c41561qtD) {
        Intrinsics.checkNotNullParameter(c41561qtD, "");
        this.AEQbTJ = interfaceC54577xNn;
        this.KWHzl = c41561qtD;
    }

    public /* bridge */ /* synthetic */ java.lang.Object AEQbTJ(java.lang.Object obj, Continuation continuation) {
        return AEQbTJ((Unit) obj, (Continuation<? super java.util.List<TradeCoinInfo>>) continuation);
    }

    public java.lang.Object AEQbTJ(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<TradeCoinInfo>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, unit, continuation);
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

    /* JADX INFO: renamed from: o.qqP$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qqP.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<TradeCoinInfo>> continuation) throws java.lang.Throwable {
        GetRawCoinInfosUseCase$onExecute$1 getRawCoinInfosUseCase$onExecute$1;
        C41414qqP c41414qqP;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<TradeCoinInfo> arrayListKWHzl;
        if (continuation instanceof GetRawCoinInfosUseCase$onExecute$1) {
            getRawCoinInfosUseCase$onExecute$1 = (GetRawCoinInfosUseCase$onExecute$1) continuation;
            int i = getRawCoinInfosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRawCoinInfosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getRawCoinInfosUseCase$onExecute$1 = new GetRawCoinInfosUseCase$onExecute$1(this, continuation);
            }
        }
        GetRawCoinInfosUseCase$onExecute$1 getRawCoinInfosUseCase$onExecute$12 = getRawCoinInfosUseCase$onExecute$1;
        java.lang.Object obj = getRawCoinInfosUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRawCoinInfosUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!((java.lang.Boolean) this.KWHzl.OLrzqt("SPOT")).booleanValue()) {
                C41434qqj.w$default(C41434qqj.KWHzl, "GetRawCoinInfosUseCase", "get raw coin infos is restricted", null, 4, null);
                return null;
            }
            InterfaceC54577xNn interfaceC54577xNn2 = this.AEQbTJ;
            if (interfaceC54577xNn2 != null) {
                getRawCoinInfosUseCase$onExecute$12.L$0 = this;
                getRawCoinInfosUseCase$onExecute$12.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn2, false, null, getRawCoinInfosUseCase$onExecute$12, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c41414qqP = this;
            } else {
                c41414qqP = this;
                interfaceC54577xNn = c41414qqP.AEQbTJ;
                if (interfaceC54577xNn != null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
                    C41434qqj.w$default(C41434qqj.KWHzl, "GetRawCoinInfosUseCase", "get trade core is null", null, 4, null);
                    return null;
                }
                interfaceC54581xNrOLrzqt.AxsJAY();
                xNQ xnqEZpvd = interfaceC54581xNrOLrzqt.EZpvd();
                if (xnqEZpvd == null || (arrayListKWHzl = xnqEZpvd.KWHzl()) == null) {
                    C41434qqj.w$default(C41434qqj.KWHzl, "GetRawCoinInfosUseCase", "get origin coins list is null", null, 4, null);
                    return null;
                }
                java.util.List<TradeCoinInfo> listKWHzl = C41428qqd.OLrzqt.KWHzl(arrayListKWHzl);
                if (listKWHzl == null) {
                    C41434qqj.w$default(C41434qqj.KWHzl, "GetRawCoinInfosUseCase", "get isolated coin list is null", null, 4, null);
                    return null;
                }
                java.util.List listKWHzl2 = C41389qpr.KWHzl(listKWHzl, new Function1() { // from class: o.qqN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(C41414qqP.OLrzqt((TradeCoinInfo) obj2));
                    }
                });
                if (!C33129mqd.KWHzl((java.util.Collection) listKWHzl2)) {
                    listKWHzl2 = null;
                }
                if (listKWHzl2 == null) {
                    C41434qqj.w$default(C41434qqj.KWHzl, "GetRawCoinInfosUseCase", "get filtered coin list is null", null, 4, null);
                    return null;
                }
                C41434qqj.KWHzl.KWHzl("GetRawCoinInfosUseCase", "get filtered coin list success [size: " + listKWHzl2.size() + "]");
                return listKWHzl2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41414qqP = (C41414qqP) getRawCoinInfosUseCase$onExecute$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        interfaceC54577xNn = c41414qqP.AEQbTJ;
        if (interfaceC54577xNn != null) {
        }
        C41434qqj.w$default(C41434qqj.KWHzl, "GetRawCoinInfosUseCase", "get trade core is null", null, 4, null);
        return null;
    }

    public static final boolean OLrzqt(TradeCoinInfo tradeCoinInfo) {
        Intrinsics.checkNotNullParameter(tradeCoinInfo, "");
        return (Intrinsics.EZpvd((java.lang.Object) tradeCoinInfo.getTradeCoin(), (java.lang.Object) "0") || Intrinsics.EZpvd((java.lang.Object) tradeCoinInfo.getSymbol(), (java.lang.Object) "USDT")) ? false : true;
    }
}
