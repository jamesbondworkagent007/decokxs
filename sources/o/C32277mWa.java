package o;

import com.okinc.dexkline.market.features.alert.usecase.AlertListUseCase$onExecute$1;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mWa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32277mWa extends AbstractC49400uno<Unit, java.util.List<? extends AlertRemindPo>> {
    public final CoroutineDispatcher AEQbTJ;
    public final mVR EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((Unit) obj, (Continuation<? super java.util.List<AlertRemindPo>>) continuation);
    }

    @yCM
    public C32277mWa(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull mVR mvr) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mvr, "");
        this.AEQbTJ = coroutineDispatcher;
        this.EZpvd = mvr;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<AlertRemindPo>> continuation) throws java.lang.Throwable {
        AlertListUseCase$onExecute$1 alertListUseCase$onExecute$1;
        if (continuation instanceof AlertListUseCase$onExecute$1) {
            alertListUseCase$onExecute$1 = (AlertListUseCase$onExecute$1) continuation;
            int i = alertListUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                alertListUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                alertListUseCase$onExecute$1 = new AlertListUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = alertListUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = alertListUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            mVR mvr = this.EZpvd;
            alertListUseCase$onExecute$1.label = 1;
            objAEQbTJ = mvr.AEQbTJ(alertListUseCase$onExecute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return ((ResponseData) objAEQbTJ).getData();
    }
}
