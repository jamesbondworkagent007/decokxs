package o;

import com.okinc.business.market.features.address_tracker.domain.AddressTrackerNotification;
import com.okinc.business.market.features.address_tracker.domain.AddressTrackerNotificationUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.AddressTrackerNotificationUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jAx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25640jAx {
    public final C25653jBj KWHzl;
    public final C28586kda OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C25640jAx(@NotNull C25653jBj c25653jBj, @NotNull C28586kda c28586kda, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c25653jBj, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c25653jBj;
        this.OLrzqt = c28586kda;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<AddressTrackerNotification>> continuation) throws java.lang.Throwable {
        AddressTrackerNotificationUseCase$invoke$1 addressTrackerNotificationUseCase$invoke$1;
        if (continuation instanceof AddressTrackerNotificationUseCase$invoke$1) {
            addressTrackerNotificationUseCase$invoke$1 = (AddressTrackerNotificationUseCase$invoke$1) continuation;
            int i = addressTrackerNotificationUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressTrackerNotificationUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                addressTrackerNotificationUseCase$invoke$1 = new AddressTrackerNotificationUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = addressTrackerNotificationUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressTrackerNotificationUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            AddressTrackerNotificationUseCase$invokegIAlus$$inlined$dexRunCatching$1 addressTrackerNotificationUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new AddressTrackerNotificationUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, this, str);
            addressTrackerNotificationUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, addressTrackerNotificationUseCase$invokegIAlus$$inlined$dexRunCatching$1, addressTrackerNotificationUseCase$invoke$1);
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
