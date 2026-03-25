package o;

import com.okinc.market.watch.usecase.InitWatchDependenciesUseCase$onExecute$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49404uns;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qWY implements InterfaceC49404uns<Unit, Unit> {
    public final qWM AEQbTJ;
    public final InterfaceC54577xNn copydefault;

    @yCM
    public qWY(InterfaceC54577xNn interfaceC54577xNn, @NotNull qWM qwm) {
        Intrinsics.checkNotNullParameter(qwm, "");
        this.copydefault = interfaceC54577xNn;
        this.AEQbTJ = qwm;
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
        return EZpvd((Unit) obj, (Continuation<? super Unit>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull Unit unit, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, unit, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Unit unit, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InitWatchDependenciesUseCase$onExecute$1 initWatchDependenciesUseCase$onExecute$1;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        qWY qwy;
        if (continuation instanceof InitWatchDependenciesUseCase$onExecute$1) {
            initWatchDependenciesUseCase$onExecute$1 = (InitWatchDependenciesUseCase$onExecute$1) continuation;
            int i = initWatchDependenciesUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initWatchDependenciesUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                initWatchDependenciesUseCase$onExecute$1 = new InitWatchDependenciesUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = initWatchDependenciesUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = initWatchDependenciesUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNn = this.copydefault;
            if (interfaceC54577xNn != null) {
                initWatchDependenciesUseCase$onExecute$1.L$0 = this;
                initWatchDependenciesUseCase$onExecute$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, initWatchDependenciesUseCase$onExecute$1, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                qwy = this;
            } else {
                throw new java.lang.RuntimeException("tradeManager is not initialized");
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            qwy = (qWY) initWatchDependenciesUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        pUU.KWHzl("InitWatchDependenciesUseCase", "tradeManager ensureInitialize result: " + Result.m7385toStringimpl(objM8790ensureInitialize0E7RQCE$default));
        if (Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default)) {
            qWM qwm = qwy.AEQbTJ;
            initWatchDependenciesUseCase$onExecute$1.L$0 = null;
            initWatchDependenciesUseCase$onExecute$1.label = 2;
            if (qwm.AEQbTJ(initWatchDependenciesUseCase$onExecute$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        throw new java.lang.RuntimeException("Failed to initialize tradeManager", Result.m7380exceptionOrNullimpl(objM8790ensureInitialize0E7RQCE$default));
    }
}
