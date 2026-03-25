package o;

import com.okinc.dexkline.market.features.tag.domain.FetchTagMetaUseCase$invoke$1;
import com.okinc.dexkline.market.features.tag.domain.FetchTagMetaUseCase$invokeIoAF18A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ndx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34540ndx {
    public final CoroutineDispatcher AEQbTJ;
    public final C34537ndu KWHzl;

    @yCM
    public C34540ndx(@NotNull C34537ndu c34537ndu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c34537ndu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c34537ndu;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<Unit>> continuation) {
        FetchTagMetaUseCase$invoke$1 fetchTagMetaUseCase$invoke$1;
        if (continuation instanceof FetchTagMetaUseCase$invoke$1) {
            fetchTagMetaUseCase$invoke$1 = (FetchTagMetaUseCase$invoke$1) continuation;
            int i = fetchTagMetaUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchTagMetaUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchTagMetaUseCase$invoke$1 = new FetchTagMetaUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = fetchTagMetaUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchTagMetaUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            FetchTagMetaUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 fetchTagMetaUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 = new FetchTagMetaUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(null, this);
            fetchTagMetaUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, fetchTagMetaUseCase$invokeIoAF18A$$inlined$dexRunCatching$1, fetchTagMetaUseCase$invoke$1);
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
