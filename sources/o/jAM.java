package o;

import com.okinc.business.market.features.address_tracker.domain.RenameTrackerGroupUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.RenameTrackerGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAM {
    public final InterfaceC25651jBh EZpvd;
    public final kKG KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C27766kCo copydefault;

    @yCM
    public jAM(@NotNull InterfaceC25651jBh interfaceC25651jBh, @NotNull kKG kkg, @NotNull C27766kCo c27766kCo, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC25651jBh, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c27766kCo, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC25651jBh;
        this.KWHzl = kkg;
        this.copydefault = c27766kCo;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(int i, @NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends InterfaceC26243jXf>> continuation) {
        RenameTrackerGroupUseCase$invoke$1 renameTrackerGroupUseCase$invoke$1;
        if (continuation instanceof RenameTrackerGroupUseCase$invoke$1) {
            renameTrackerGroupUseCase$invoke$1 = (RenameTrackerGroupUseCase$invoke$1) continuation;
            int i2 = renameTrackerGroupUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                renameTrackerGroupUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                renameTrackerGroupUseCase$invoke$1 = new RenameTrackerGroupUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = renameTrackerGroupUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = renameTrackerGroupUseCase$invoke$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            RenameTrackerGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 renameTrackerGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new RenameTrackerGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, this, i, str);
            renameTrackerGroupUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, renameTrackerGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, renameTrackerGroupUseCase$invoke$1);
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
