package o;

import com.okinc.market.search.features.main.recommend.history.domain.usecase.AddSearchHistoryUseCase$onExecute$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qCF extends AbstractC49400uno<java.lang.Object, java.util.List<? extends qCU>> {
    public final CoroutineDispatcher AEQbTJ;
    public final C39928qCz EZpvd;
    public final qCL copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public qCF(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C39928qCz c39928qCz, @NotNull qCL qcl) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c39928qCz, "");
        Intrinsics.checkNotNullParameter(qcl, "");
        this.AEQbTJ = coroutineDispatcher;
        this.EZpvd = c39928qCz;
        this.copydefault = qcl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.Object obj, @NotNull Continuation<? super java.util.List<qCU>> continuation) throws java.lang.Throwable {
        AddSearchHistoryUseCase$onExecute$1 addSearchHistoryUseCase$onExecute$1;
        qCF qcf;
        if (continuation instanceof AddSearchHistoryUseCase$onExecute$1) {
            addSearchHistoryUseCase$onExecute$1 = (AddSearchHistoryUseCase$onExecute$1) continuation;
            int i = addSearchHistoryUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addSearchHistoryUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                addSearchHistoryUseCase$onExecute$1 = new AddSearchHistoryUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd2 = addSearchHistoryUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = addSearchHistoryUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd2);
            C39928qCz c39928qCz = this.EZpvd;
            addSearchHistoryUseCase$onExecute$1.L$0 = this;
            addSearchHistoryUseCase$onExecute$1.label = 1;
            if (c39928qCz.AEQbTJ(obj, addSearchHistoryUseCase$onExecute$1) == objCopydefault) {
                return objCopydefault;
            }
            qcf = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objEZpvd2);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qcf = (qCF) addSearchHistoryUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd2);
        }
        qCL qcl = qcf.copydefault;
        Unit unit = Unit.INSTANCE;
        addSearchHistoryUseCase$onExecute$1.L$0 = null;
        addSearchHistoryUseCase$onExecute$1.label = 2;
        objEZpvd2 = qcl.EZpvd2(unit, (Continuation<? super java.util.List<qCU>>) addSearchHistoryUseCase$onExecute$1);
        return objEZpvd2 == objCopydefault ? objCopydefault : objEZpvd2;
    }
}
