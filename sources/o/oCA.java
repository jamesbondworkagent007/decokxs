package o;

import com.okinc.im.usecase.connectivity.FailedIfWebSocketConnectionNotAvailableWithRetriedUseCase$execute$1;
import com.okinc.okimcore.model.exception.OKIMConnectException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCA {
    public final InterfaceC33835nHp KWHzl;
    public final sKH OLrzqt;

    @yCM
    public oCA(@NotNull InterfaceC33835nHp interfaceC33835nHp, @NotNull sKH skh) {
        Intrinsics.checkNotNullParameter(interfaceC33835nHp, "");
        Intrinsics.checkNotNullParameter(skh, "");
        this.KWHzl = interfaceC33835nHp;
        this.OLrzqt = skh;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        FailedIfWebSocketConnectionNotAvailableWithRetriedUseCase$execute$1 failedIfWebSocketConnectionNotAvailableWithRetriedUseCase$execute$1;
        if (continuation instanceof FailedIfWebSocketConnectionNotAvailableWithRetriedUseCase$execute$1) {
            failedIfWebSocketConnectionNotAvailableWithRetriedUseCase$execute$1 = (FailedIfWebSocketConnectionNotAvailableWithRetriedUseCase$execute$1) continuation;
            int i = failedIfWebSocketConnectionNotAvailableWithRetriedUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                failedIfWebSocketConnectionNotAvailableWithRetriedUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                failedIfWebSocketConnectionNotAvailableWithRetriedUseCase$execute$1 = new FailedIfWebSocketConnectionNotAvailableWithRetriedUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = failedIfWebSocketConnectionNotAvailableWithRetriedUseCase$execute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = failedIfWebSocketConnectionNotAvailableWithRetriedUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (!this.KWHzl.KWHzl()) {
                this.OLrzqt.AEQbTJ();
                InterfaceC33835nHp interfaceC33835nHp = this.KWHzl;
                failedIfWebSocketConnectionNotAvailableWithRetriedUseCase$execute$1.label = 1;
                objCopydefault = interfaceC33835nHp.copydefault(failedIfWebSocketConnectionNotAvailableWithRetriedUseCase$execute$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objCopydefault);
        if (!((java.lang.Boolean) objCopydefault).booleanValue()) {
            throw new OKIMConnectException();
        }
        return Unit.INSTANCE;
    }
}
