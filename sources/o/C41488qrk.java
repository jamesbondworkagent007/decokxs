package o;

import com.okinc.market.quotation.data.model.DexTokenPo;
import com.okinc.market.quotation.domain.dex.GetDexPosUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import com.okinc.trade.arch.util.Quartet;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41488qrk implements InterfaceC49404uns<Quartet<? extends java.lang.String, ? extends DexSortByEnum, ? extends DexPeriodEnum, ? extends java.lang.Integer>, java.util.List<? extends DexTokenPo>> {
    public final C41448qqx OLrzqt;

    @yCM
    public C41488qrk(@NotNull C41448qqx c41448qqx) {
        Intrinsics.checkNotNullParameter(c41448qqx, "");
        this.OLrzqt = c41448qqx;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull Quartet<java.lang.String, ? extends DexSortByEnum, ? extends DexPeriodEnum, java.lang.Integer> quartet, @NotNull Continuation<? super java.util.List<DexTokenPo>> continuation) {
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

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Quartet<java.lang.String, ? extends DexSortByEnum, ? extends DexPeriodEnum, java.lang.Integer> quartet, @NotNull Continuation<? super java.util.List<DexTokenPo>> continuation) throws java.lang.Throwable {
        GetDexPosUseCase$onExecute$1 getDexPosUseCase$onExecute$1;
        if (continuation instanceof GetDexPosUseCase$onExecute$1) {
            getDexPosUseCase$onExecute$1 = (GetDexPosUseCase$onExecute$1) continuation;
            int i = getDexPosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexPosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexPosUseCase$onExecute$1 = new GetDexPosUseCase$onExecute$1(this, continuation);
            }
        }
        GetDexPosUseCase$onExecute$1 getDexPosUseCase$onExecute$12 = getDexPosUseCase$onExecute$1;
        java.lang.Object objEZpvd = getDexPosUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexPosUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.lang.String strComponent1 = quartet.component1();
            DexSortByEnum dexSortByEnumComponent2 = quartet.component2();
            DexPeriodEnum dexPeriodEnumComponent3 = quartet.component3();
            java.lang.Integer numComponent4 = quartet.component4();
            C41434qqj.KWHzl.KWHzl("GetDexPosUseCase", "start get dex pos, [chainId: " + strComponent1 + ", rankBy: " + dexSortByEnumComponent2 + ", period: " + dexPeriodEnumComponent3 + ", desireCount: " + numComponent4 + "]");
            C41448qqx c41448qqx = this.OLrzqt;
            int value = dexSortByEnumComponent2.getValue();
            int value2 = dexPeriodEnumComponent3.getValue();
            getDexPosUseCase$onExecute$12.label = 1;
            objEZpvd = c41448qqx.EZpvd(strComponent1, java.lang.String.valueOf(value), java.lang.String.valueOf(value2), numComponent4, getDexPosUseCase$onExecute$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.List list = (java.util.List) objEZpvd;
        return list == null ? yDY.AhwBna() : list;
    }
}
