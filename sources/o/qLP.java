package o;

import com.okinc.market.search.features.navigation.history.domain.ClearNavSearchHistoryUseCase$onExecute$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qLP implements InterfaceC49404uns<Unit, Unit> {
    public final qLR KWHzl;

    @yCM
    public qLP(@NotNull qLR qlr) {
        Intrinsics.checkNotNullParameter(qlr, "");
        this.KWHzl = qlr;
    }

    public /* synthetic */ java.lang.Object EZpvd(java.lang.Object obj, Continuation continuation) {
        return KWHzl((Unit) obj, (Continuation<? super Unit>) continuation);
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

    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, unit, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ClearNavSearchHistoryUseCase$onExecute$1 clearNavSearchHistoryUseCase$onExecute$1;
        if (continuation instanceof ClearNavSearchHistoryUseCase$onExecute$1) {
            clearNavSearchHistoryUseCase$onExecute$1 = (ClearNavSearchHistoryUseCase$onExecute$1) continuation;
            int i = clearNavSearchHistoryUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                clearNavSearchHistoryUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                clearNavSearchHistoryUseCase$onExecute$1 = new ClearNavSearchHistoryUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = clearNavSearchHistoryUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = clearNavSearchHistoryUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            qLR qlr = this.KWHzl;
            clearNavSearchHistoryUseCase$onExecute$1.label = 1;
            if (qlr.AEQbTJ(clearNavSearchHistoryUseCase$onExecute$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
