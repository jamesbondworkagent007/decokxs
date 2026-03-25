package o;

import com.okinc.business.market.features.address_tracker.domain.EnableAddressTrackerNotificationUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.EnableAddressTrackerNotificationUseCase$invokeIoAF18A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAG {
    public final CoroutineDispatcher AEQbTJ;
    public final C28603kdr EZpvd;
    public final C25653jBj KWHzl;
    public final C28586kda copydefault;

    @yCM
    public jAG(@NotNull C25653jBj c25653jBj, @NotNull C28586kda c28586kda, @NotNull C28603kdr c28603kdr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c25653jBj, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c25653jBj;
        this.copydefault = c28586kda;
        this.EZpvd = c28603kdr;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        EnableAddressTrackerNotificationUseCase$invoke$1 enableAddressTrackerNotificationUseCase$invoke$1;
        if (continuation instanceof EnableAddressTrackerNotificationUseCase$invoke$1) {
            enableAddressTrackerNotificationUseCase$invoke$1 = (EnableAddressTrackerNotificationUseCase$invoke$1) continuation;
            int i = enableAddressTrackerNotificationUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                enableAddressTrackerNotificationUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                enableAddressTrackerNotificationUseCase$invoke$1 = new EnableAddressTrackerNotificationUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = enableAddressTrackerNotificationUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = enableAddressTrackerNotificationUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            EnableAddressTrackerNotificationUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 enableAddressTrackerNotificationUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 = new EnableAddressTrackerNotificationUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(null, this);
            enableAddressTrackerNotificationUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, enableAddressTrackerNotificationUseCase$invokeIoAF18A$$inlined$dexRunCatching$1, enableAddressTrackerNotificationUseCase$invoke$1);
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
