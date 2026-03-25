package o;

import com.okinc.business.market.features.address_tracker.domain.BatchImportAddressListUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.BatchImportAddressListUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAB {
    public final CoroutineDispatcher EZpvd;
    public final C25653jBj KWHzl;
    public final C28586kda OLrzqt;
    public final C28603kdr copydefault;

    @yCM
    public jAB(@NotNull C25653jBj c25653jBj, @NotNull C28586kda c28586kda, @NotNull C28603kdr c28603kdr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c25653jBj, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c25653jBj;
        this.OLrzqt = c28586kda;
        this.copydefault = c28603kdr;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(int i, @NotNull java.util.List<C25642jAz> list, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) throws java.lang.Throwable {
        BatchImportAddressListUseCase$invoke$1 batchImportAddressListUseCase$invoke$1;
        if (continuation instanceof BatchImportAddressListUseCase$invoke$1) {
            batchImportAddressListUseCase$invoke$1 = (BatchImportAddressListUseCase$invoke$1) continuation;
            int i2 = batchImportAddressListUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                batchImportAddressListUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                batchImportAddressListUseCase$invoke$1 = new BatchImportAddressListUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = batchImportAddressListUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = batchImportAddressListUseCase$invoke$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            BatchImportAddressListUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 batchImportAddressListUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new BatchImportAddressListUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, this, list, i);
            batchImportAddressListUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, batchImportAddressListUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, batchImportAddressListUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
