package o;

import com.okinc.business.market.features.coindetail.domain.DevAnalysisUseCase$invoke$1;
import com.okinc.business.market.features.coindetail.domain.DevAnalysisUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jNT {
    public final jNV OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public jNT(@NotNull jNV jnv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(jnv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = jnv;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: invoke-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8640invokeyxL6bBk$default(jNT jnt, java.lang.String str, java.lang.String str2, int i, int i2, Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = 1;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = 10;
        }
        return jnt.AEQbTJ(str, str2, i4, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2, @NotNull Continuation<? super Result<jNR>> continuation) throws java.lang.Throwable {
        DevAnalysisUseCase$invoke$1 devAnalysisUseCase$invoke$1;
        if (continuation instanceof DevAnalysisUseCase$invoke$1) {
            devAnalysisUseCase$invoke$1 = (DevAnalysisUseCase$invoke$1) continuation;
            int i3 = devAnalysisUseCase$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                devAnalysisUseCase$invoke$1.label = i3 - Integer.MIN_VALUE;
            } else {
                devAnalysisUseCase$invoke$1 = new DevAnalysisUseCase$invoke$1(this, continuation);
            }
        }
        DevAnalysisUseCase$invoke$1 devAnalysisUseCase$invoke$12 = devAnalysisUseCase$invoke$1;
        java.lang.Object objWithContext = devAnalysisUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = devAnalysisUseCase$invoke$12.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            DevAnalysisUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 devAnalysisUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 = new DevAnalysisUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(null, this, str, str2, i, i2);
            devAnalysisUseCase$invoke$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, devAnalysisUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1, devAnalysisUseCase$invoke$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
