package o;

import com.okinc.business.market.features.tag.domain.FetchTokenTagAttributesUseCase$invoke$1;
import com.okinc.business.market.features.tag.domain.FetchTokenTagAttributesUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC29685kyM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29713kyo {
    public final CoroutineDispatcher AEQbTJ;
    public final C27629jym EZpvd;
    public final C29712kyn KWHzl;
    public final C29715kyq OLrzqt;
    public final C29710kyl copydefault;

    @yCM
    public C29713kyo(@NotNull C29710kyl c29710kyl, @NotNull C27629jym c27629jym, @NotNull C29715kyq c29715kyq, @NotNull C29712kyn c29712kyn, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29710kyl, "");
        Intrinsics.checkNotNullParameter(c27629jym, "");
        Intrinsics.checkNotNullParameter(c29715kyq, "");
        Intrinsics.checkNotNullParameter(c29712kyn, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = c29710kyl;
        this.EZpvd = c27629jym;
        this.OLrzqt = c29715kyq;
        this.KWHzl = c29712kyn;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull Continuation<? super Result<InterfaceC29685kyM.ActionBar>> continuation) throws java.lang.Throwable {
        FetchTokenTagAttributesUseCase$invoke$1 fetchTokenTagAttributesUseCase$invoke$1;
        if (continuation instanceof FetchTokenTagAttributesUseCase$invoke$1) {
            fetchTokenTagAttributesUseCase$invoke$1 = (FetchTokenTagAttributesUseCase$invoke$1) continuation;
            int i = fetchTokenTagAttributesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchTokenTagAttributesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchTokenTagAttributesUseCase$invoke$1 = new FetchTokenTagAttributesUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = fetchTokenTagAttributesUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchTokenTagAttributesUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            FetchTokenTagAttributesUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 fetchTokenTagAttributesUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 = new FetchTokenTagAttributesUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(null, z, this, str, str2);
            fetchTokenTagAttributesUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, fetchTokenTagAttributesUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1, fetchTokenTagAttributesUseCase$invoke$1);
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
