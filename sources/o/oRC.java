package o;

import com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsResp;
import com.okinc.kline.features.kline.indexcomponents.domain.usecase.GetIndexComponentsUseCase$onExecute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oRC extends AbstractC49400uno<java.lang.String, IndexComponentsResp> {
    public final CoroutineDispatcher KWHzl;
    public final oRD OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((java.lang.String) obj, (Continuation<? super IndexComponentsResp>) continuation);
    }

    @yCM
    public oRC(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull oRD ord) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(ord, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = ord;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super IndexComponentsResp> continuation) throws java.lang.Throwable {
        GetIndexComponentsUseCase$onExecute$1 getIndexComponentsUseCase$onExecute$1;
        if (continuation instanceof GetIndexComponentsUseCase$onExecute$1) {
            getIndexComponentsUseCase$onExecute$1 = (GetIndexComponentsUseCase$onExecute$1) continuation;
            int i = getIndexComponentsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getIndexComponentsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getIndexComponentsUseCase$onExecute$1 = new GetIndexComponentsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getIndexComponentsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getIndexComponentsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            oRD ord = this.OLrzqt;
            getIndexComponentsUseCase$onExecute$1.label = 1;
            objCopydefault = ord.copydefault(str, getIndexComponentsUseCase$onExecute$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        IndexComponentsResp indexComponentsResp = (IndexComponentsResp) objCopydefault;
        if (indexComponentsResp != null) {
            return indexComponentsResp;
        }
        throw new java.lang.IllegalStateException("Failed to fetch index components");
    }
}
