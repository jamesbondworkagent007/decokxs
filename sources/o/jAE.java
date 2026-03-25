package o;

import com.okinc.business.market.features.address_tracker.domain.CreateTrackerGroupUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.CreateTrackerGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAE {
    public final C27766kCo AEQbTJ;
    public final InterfaceC25651jBh EZpvd;
    public final kKG KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public jAE(@NotNull InterfaceC25651jBh interfaceC25651jBh, @NotNull kKG kkg, @NotNull C27766kCo c27766kCo, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC25651jBh, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c27766kCo, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC25651jBh;
        this.KWHzl = kkg;
        this.AEQbTJ = c27766kCo;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends InterfaceC26243jXf>> continuation) {
        CreateTrackerGroupUseCase$invoke$1 createTrackerGroupUseCase$invoke$1;
        if (continuation instanceof CreateTrackerGroupUseCase$invoke$1) {
            createTrackerGroupUseCase$invoke$1 = (CreateTrackerGroupUseCase$invoke$1) continuation;
            int i = createTrackerGroupUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createTrackerGroupUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                createTrackerGroupUseCase$invoke$1 = new CreateTrackerGroupUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = createTrackerGroupUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = createTrackerGroupUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            CreateTrackerGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1 createTrackerGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new CreateTrackerGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, this, str);
            createTrackerGroupUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, createTrackerGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1, createTrackerGroupUseCase$invoke$1);
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
