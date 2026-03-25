package o;

import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import com.okinc.dexkline.market.features.token_detail.domain.GenerateBundleTagUseCase$invoke$1;
import com.okinc.dexkline.market.features.token_detail.domain.GenerateBundleTagUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.neh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34577neh {
    public final CoroutineDispatcher AEQbTJ;
    public final C34541ndy KWHzl;

    @yCM
    public C34577neh(@NotNull C34541ndy c34541ndy, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c34541ndy, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c34541ndy;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.Float f, @NotNull Continuation<? super Result<TagWrapper>> continuation) throws java.lang.Throwable {
        GenerateBundleTagUseCase$invoke$1 generateBundleTagUseCase$invoke$1;
        if (continuation instanceof GenerateBundleTagUseCase$invoke$1) {
            generateBundleTagUseCase$invoke$1 = (GenerateBundleTagUseCase$invoke$1) continuation;
            int i = generateBundleTagUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateBundleTagUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                generateBundleTagUseCase$invoke$1 = new GenerateBundleTagUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = generateBundleTagUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateBundleTagUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GenerateBundleTagUseCase$invokegIAlus$$inlined$dexRunCatching$1 generateBundleTagUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new GenerateBundleTagUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, this, f);
            generateBundleTagUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, generateBundleTagUseCase$invokegIAlus$$inlined$dexRunCatching$1, generateBundleTagUseCase$invoke$1);
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
