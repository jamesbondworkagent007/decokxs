package o;

import com.okinc.market.quotation.data.model.DexTokenPo;
import com.okinc.market.quotation.domain.dex.GetDexBoostPosUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import com.okinc.trade.arch.util.Quartet;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41484qrg implements InterfaceC49404uns<Quartet<? extends java.lang.String, ? extends DexSortByEnum, ? extends DexPeriodEnum, ? extends java.lang.Integer>, java.util.List<? extends DexTokenPo>> {
    public final C41448qqx AEQbTJ;

    @yCM
    public C41484qrg(@NotNull C41448qqx c41448qqx) {
        Intrinsics.checkNotNullParameter(c41448qqx, "");
        this.AEQbTJ = c41448qqx;
    }

    public java.lang.Object EZpvd(@NotNull Quartet<java.lang.String, ? extends DexSortByEnum, ? extends DexPeriodEnum, java.lang.Integer> quartet, @NotNull Continuation<? super java.util.List<DexTokenPo>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, quartet, continuation);
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
        return copydefault((Quartet<java.lang.String, ? extends DexSortByEnum, ? extends DexPeriodEnum, java.lang.Integer>) obj, (Continuation<? super java.util.List<DexTokenPo>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    public /* synthetic */ java.lang.Object copydefault(java.lang.Object obj, Continuation continuation) {
        return EZpvd((Quartet<java.lang.String, ? extends DexSortByEnum, ? extends DexPeriodEnum, java.lang.Integer>) obj, (Continuation<? super java.util.List<DexTokenPo>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Quartet<java.lang.String, ? extends DexSortByEnum, ? extends DexPeriodEnum, java.lang.Integer> quartet, @NotNull Continuation<? super java.util.List<DexTokenPo>> continuation) throws java.lang.Throwable {
        GetDexBoostPosUseCase$onExecute$1 getDexBoostPosUseCase$onExecute$1;
        if (continuation instanceof GetDexBoostPosUseCase$onExecute$1) {
            getDexBoostPosUseCase$onExecute$1 = (GetDexBoostPosUseCase$onExecute$1) continuation;
            int i = getDexBoostPosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexBoostPosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexBoostPosUseCase$onExecute$1 = new GetDexBoostPosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getDexBoostPosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexBoostPosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            java.lang.String strComponent1 = quartet.component1();
            DexSortByEnum dexSortByEnumComponent2 = quartet.component2();
            DexPeriodEnum dexPeriodEnumComponent3 = quartet.component3();
            java.lang.Integer numComponent4 = quartet.component4();
            C41434qqj.KWHzl.KWHzl("GetDexBoostPosUseCase", "start get dex pos, [chainId: " + strComponent1 + ", rankBy: " + dexSortByEnumComponent2 + ", period: " + dexPeriodEnumComponent3 + ", desireCount: " + numComponent4 + "]");
            C41448qqx c41448qqx = this.AEQbTJ;
            int value = dexPeriodEnumComponent3.getValue();
            getDexBoostPosUseCase$onExecute$1.label = 1;
            objAEQbTJ = c41448qqx.AEQbTJ(java.lang.String.valueOf(value), getDexBoostPosUseCase$onExecute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        java.util.List list = (java.util.List) objAEQbTJ;
        return list == null ? yDY.AhwBna() : list;
    }
}
