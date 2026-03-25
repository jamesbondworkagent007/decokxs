package o;

import com.okinc.business.market.features.meme.aped_together.domain.model.ApedTogetherResponseData;
import com.okinc.business.market.features.meme.aped_together.domain.repository.ApedTogetherRepositoryImpl$getApedTogetherList$1;
import com.okinc.business.market.features.meme.aped_together.domain.repository.ApedTogetherRepositoryImpl$getApedTogetherListyxL6bBk$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28659keu implements InterfaceC28656ker {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC23229huL copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC23229huL EZpvd() {
        return this.copydefault;
    }

    @yCM
    public C28659keu(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC23229huL;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.InterfaceC28656ker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, @NotNull Continuation<? super Result<ApedTogetherResponseData>> continuation) {
        ApedTogetherRepositoryImpl$getApedTogetherList$1 apedTogetherRepositoryImpl$getApedTogetherList$1;
        if (continuation instanceof ApedTogetherRepositoryImpl$getApedTogetherList$1) {
            apedTogetherRepositoryImpl$getApedTogetherList$1 = (ApedTogetherRepositoryImpl$getApedTogetherList$1) continuation;
            int i2 = apedTogetherRepositoryImpl$getApedTogetherList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                apedTogetherRepositoryImpl$getApedTogetherList$1.label = i2 - Integer.MIN_VALUE;
            } else {
                apedTogetherRepositoryImpl$getApedTogetherList$1 = new ApedTogetherRepositoryImpl$getApedTogetherList$1(this, continuation);
            }
        }
        ApedTogetherRepositoryImpl$getApedTogetherList$1 apedTogetherRepositoryImpl$getApedTogetherList$12 = apedTogetherRepositoryImpl$getApedTogetherList$1;
        java.lang.Object objWithContext = apedTogetherRepositoryImpl$getApedTogetherList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = apedTogetherRepositoryImpl$getApedTogetherList$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            ApedTogetherRepositoryImpl$getApedTogetherListyxL6bBk$$inlined$dexRunCatching$1 apedTogetherRepositoryImpl$getApedTogetherListyxL6bBk$$inlined$dexRunCatching$1 = new ApedTogetherRepositoryImpl$getApedTogetherListyxL6bBk$$inlined$dexRunCatching$1(null, this, str, str2, str3, i);
            apedTogetherRepositoryImpl$getApedTogetherList$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, apedTogetherRepositoryImpl$getApedTogetherListyxL6bBk$$inlined$dexRunCatching$1, apedTogetherRepositoryImpl$getApedTogetherList$12);
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
