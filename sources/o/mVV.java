package o;

import com.okinc.dexkline.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.dexkline.market.features.address_tracker.repo.TrackingAddressRepo$getAllTrackingAddresses$1;
import com.okinc.dexkline.market.features.address_tracker.repo.TrackingAddressRepo$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.address_tracker.repo.TrackingAddressRepo$getTrackingAddressAlias$1;
import com.okinc.dexkline.market.features.address_tracker.repo.TrackingAddressRepo$getTrackingAddressAliasgIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class mVV {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC32260mVk copydefault;

    @yCM
    public mVV(@NotNull InterfaceC32260mVk interfaceC32260mVk, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC32260mVk;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<java.lang.String>>> continuation) throws java.lang.Throwable {
        TrackingAddressRepo$getAllTrackingAddresses$1 trackingAddressRepo$getAllTrackingAddresses$1;
        if (continuation instanceof TrackingAddressRepo$getAllTrackingAddresses$1) {
            trackingAddressRepo$getAllTrackingAddresses$1 = (TrackingAddressRepo$getAllTrackingAddresses$1) continuation;
            int i = trackingAddressRepo$getAllTrackingAddresses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackingAddressRepo$getAllTrackingAddresses$1.label = i - Integer.MIN_VALUE;
            } else {
                trackingAddressRepo$getAllTrackingAddresses$1 = new TrackingAddressRepo$getAllTrackingAddresses$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trackingAddressRepo$getAllTrackingAddresses$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackingAddressRepo$getAllTrackingAddresses$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            TrackingAddressRepo$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1 trackingAddressRepo$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1 = new TrackingAddressRepo$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1(null, this, str);
            trackingAddressRepo$getAllTrackingAddresses$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackingAddressRepo$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1, trackingAddressRepo$getAllTrackingAddresses$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<TrackingAddressAlias>>> continuation) throws java.lang.Throwable {
        TrackingAddressRepo$getTrackingAddressAlias$1 trackingAddressRepo$getTrackingAddressAlias$1;
        if (continuation instanceof TrackingAddressRepo$getTrackingAddressAlias$1) {
            trackingAddressRepo$getTrackingAddressAlias$1 = (TrackingAddressRepo$getTrackingAddressAlias$1) continuation;
            int i = trackingAddressRepo$getTrackingAddressAlias$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackingAddressRepo$getTrackingAddressAlias$1.label = i - Integer.MIN_VALUE;
            } else {
                trackingAddressRepo$getTrackingAddressAlias$1 = new TrackingAddressRepo$getTrackingAddressAlias$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trackingAddressRepo$getTrackingAddressAlias$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackingAddressRepo$getTrackingAddressAlias$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            TrackingAddressRepo$getTrackingAddressAliasgIAlus$$inlined$dexRunCatching$1 trackingAddressRepo$getTrackingAddressAliasgIAlus$$inlined$dexRunCatching$1 = new TrackingAddressRepo$getTrackingAddressAliasgIAlus$$inlined$dexRunCatching$1(null, this, str);
            trackingAddressRepo$getTrackingAddressAlias$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackingAddressRepo$getTrackingAddressAliasgIAlus$$inlined$dexRunCatching$1, trackingAddressRepo$getTrackingAddressAlias$1);
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
