package o;

import com.okinc.business.market.data.constant.AddressTrackerUserAction;
import com.okinc.business.market.features.address_tracker.domain.UpdateAddressTrackerNotificationUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.UpdateAddressTrackerNotificationUseCase$invokehUnOzRk$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jBe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25648jBe {
    public final C28586kda AEQbTJ;
    public final C28603kdr EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C25653jBj copydefault;

    @yCM
    public C25648jBe(@NotNull C25653jBj c25653jBj, @NotNull C28586kda c28586kda, @NotNull C28603kdr c28603kdr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c25653jBj, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = c25653jBj;
        this.AEQbTJ = c28586kda;
        this.EZpvd = c28603kdr;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.List<? extends AddressTrackerUserAction> list, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        UpdateAddressTrackerNotificationUseCase$invoke$1 updateAddressTrackerNotificationUseCase$invoke$1;
        if (continuation instanceof UpdateAddressTrackerNotificationUseCase$invoke$1) {
            updateAddressTrackerNotificationUseCase$invoke$1 = (UpdateAddressTrackerNotificationUseCase$invoke$1) continuation;
            int i2 = updateAddressTrackerNotificationUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateAddressTrackerNotificationUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                updateAddressTrackerNotificationUseCase$invoke$1 = new UpdateAddressTrackerNotificationUseCase$invoke$1(this, continuation);
            }
        }
        UpdateAddressTrackerNotificationUseCase$invoke$1 updateAddressTrackerNotificationUseCase$invoke$12 = updateAddressTrackerNotificationUseCase$invoke$1;
        java.lang.Object objWithContext = updateAddressTrackerNotificationUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = updateAddressTrackerNotificationUseCase$invoke$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            UpdateAddressTrackerNotificationUseCase$invokehUnOzRk$$inlined$dexRunCatching$1 updateAddressTrackerNotificationUseCase$invokehUnOzRk$$inlined$dexRunCatching$1 = new UpdateAddressTrackerNotificationUseCase$invokehUnOzRk$$inlined$dexRunCatching$1(null, this, str, i, str2, str3, list);
            updateAddressTrackerNotificationUseCase$invoke$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, updateAddressTrackerNotificationUseCase$invokehUnOzRk$$inlined$dexRunCatching$1, updateAddressTrackerNotificationUseCase$invoke$12);
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
