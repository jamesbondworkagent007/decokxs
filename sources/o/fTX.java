package o;

import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import com.okinc.business.defi.wallet.tee.common.usecase.GetTeeMetaDataUseCase$invoke$1;
import com.okinc.business.defi.wallet.tee.common.usecase.GetTeeMetaDataUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fTX {
    public final C13934dbu AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public fTX(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = c13934dbu;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super Result<TeeMetadata>> continuation) {
        GetTeeMetaDataUseCase$invoke$1 getTeeMetaDataUseCase$invoke$1;
        if (continuation instanceof GetTeeMetaDataUseCase$invoke$1) {
            getTeeMetaDataUseCase$invoke$1 = (GetTeeMetaDataUseCase$invoke$1) continuation;
            int i = getTeeMetaDataUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTeeMetaDataUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getTeeMetaDataUseCase$invoke$1 = new GetTeeMetaDataUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getTeeMetaDataUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTeeMetaDataUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            GetTeeMetaDataUseCase$invoke$2 getTeeMetaDataUseCase$invoke$2 = new GetTeeMetaDataUseCase$invoke$2(this, null);
            getTeeMetaDataUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getTeeMetaDataUseCase$invoke$2, getTeeMetaDataUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
