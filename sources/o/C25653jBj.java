package o;

import com.okinc.business.market.data.constant.AddressTrackerSortType;
import com.okinc.business.market.data.model.AddressTrackerNotificationData;
import com.okinc.business.market.data.model.BatchImportAddressListResponse;
import com.okinc.business.market.data.model.GetTrackingAddressListResponse;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$batchCollectGroupAddress$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$batchCollectGroupAddressyxL6bBk$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$batchEnableOrDisableNotification$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$batchEnableOrDisableNotificationyxL6bBk$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$batchImportAddressList$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$batchImportAddressListyxL6bBk$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$enableDeviceNotification$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$enableDeviceNotificationBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$getAddressTrackerNotification$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$getAddressTrackerNotification0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$getAllTrackingAddresses$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$getTrackingAddressAlias$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$getTrackingAddressAliasgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$getTrackingAddressList$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$getTrackingAddressListbMdYcbs$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$updateAddressTrackerNotification$1;
import com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$updateAddressTrackerNotificationtZkwj4A$$inlined$dexRunCatching$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jBj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class C25653jBj {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC27595jyE KWHzl;

    @yCM
    public C25653jBj(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC27595jyE;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.Long l, int i, int i2, @NotNull AddressTrackerSortType addressTrackerSortType, boolean z, @NotNull Continuation<? super Result<GetTrackingAddressListResponse>> continuation) throws java.lang.Throwable {
        TrackingAddressRepo$getTrackingAddressList$1 trackingAddressRepo$getTrackingAddressList$1;
        if (continuation instanceof TrackingAddressRepo$getTrackingAddressList$1) {
            trackingAddressRepo$getTrackingAddressList$1 = (TrackingAddressRepo$getTrackingAddressList$1) continuation;
            int i3 = trackingAddressRepo$getTrackingAddressList$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                trackingAddressRepo$getTrackingAddressList$1.label = i3 - Integer.MIN_VALUE;
            } else {
                trackingAddressRepo$getTrackingAddressList$1 = new TrackingAddressRepo$getTrackingAddressList$1(this, continuation);
            }
        }
        TrackingAddressRepo$getTrackingAddressList$1 trackingAddressRepo$getTrackingAddressList$12 = trackingAddressRepo$getTrackingAddressList$1;
        java.lang.Object objWithContext = trackingAddressRepo$getTrackingAddressList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = trackingAddressRepo$getTrackingAddressList$12.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            TrackingAddressRepo$getTrackingAddressListbMdYcbs$$inlined$dexRunCatching$1 trackingAddressRepo$getTrackingAddressListbMdYcbs$$inlined$dexRunCatching$1 = new TrackingAddressRepo$getTrackingAddressListbMdYcbs$$inlined$dexRunCatching$1(null, str, l, i, i2, addressTrackerSortType, z, this);
            trackingAddressRepo$getTrackingAddressList$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackingAddressRepo$getTrackingAddressListbMdYcbs$$inlined$dexRunCatching$1, trackingAddressRepo$getTrackingAddressList$12);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<java.lang.String>>> continuation) throws java.lang.Throwable {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        TrackingAddressRepo$enableDeviceNotification$1 trackingAddressRepo$enableDeviceNotification$1;
        if (continuation instanceof TrackingAddressRepo$enableDeviceNotification$1) {
            trackingAddressRepo$enableDeviceNotification$1 = (TrackingAddressRepo$enableDeviceNotification$1) continuation;
            int i = trackingAddressRepo$enableDeviceNotification$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackingAddressRepo$enableDeviceNotification$1.label = i - Integer.MIN_VALUE;
            } else {
                trackingAddressRepo$enableDeviceNotification$1 = new TrackingAddressRepo$enableDeviceNotification$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trackingAddressRepo$enableDeviceNotification$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackingAddressRepo$enableDeviceNotification$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            TrackingAddressRepo$enableDeviceNotificationBWLJW6A$$inlined$dexRunCatching$1 trackingAddressRepo$enableDeviceNotificationBWLJW6A$$inlined$dexRunCatching$1 = new TrackingAddressRepo$enableDeviceNotificationBWLJW6A$$inlined$dexRunCatching$1(null, this, str2, str, str3);
            trackingAddressRepo$enableDeviceNotification$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackingAddressRepo$enableDeviceNotificationBWLJW6A$$inlined$dexRunCatching$1, trackingAddressRepo$enableDeviceNotification$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C25642jAz> list, int i, @NotNull Continuation<? super Result<BatchImportAddressListResponse>> continuation) throws java.lang.Throwable {
        TrackingAddressRepo$batchImportAddressList$1 trackingAddressRepo$batchImportAddressList$1;
        if (continuation instanceof TrackingAddressRepo$batchImportAddressList$1) {
            trackingAddressRepo$batchImportAddressList$1 = (TrackingAddressRepo$batchImportAddressList$1) continuation;
            int i2 = trackingAddressRepo$batchImportAddressList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingAddressRepo$batchImportAddressList$1.label = i2 - Integer.MIN_VALUE;
            } else {
                trackingAddressRepo$batchImportAddressList$1 = new TrackingAddressRepo$batchImportAddressList$1(this, continuation);
            }
        }
        TrackingAddressRepo$batchImportAddressList$1 trackingAddressRepo$batchImportAddressList$12 = trackingAddressRepo$batchImportAddressList$1;
        java.lang.Object objWithContext = trackingAddressRepo$batchImportAddressList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = trackingAddressRepo$batchImportAddressList$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            TrackingAddressRepo$batchImportAddressListyxL6bBk$$inlined$dexRunCatching$1 trackingAddressRepo$batchImportAddressListyxL6bBk$$inlined$dexRunCatching$1 = new TrackingAddressRepo$batchImportAddressListyxL6bBk$$inlined$dexRunCatching$1(null, str2, i, list, this, str);
            trackingAddressRepo$batchImportAddressList$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackingAddressRepo$batchImportAddressListyxL6bBk$$inlined$dexRunCatching$1, trackingAddressRepo$batchImportAddressList$12);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super Result<? extends jAC>> continuation) throws java.lang.Throwable {
        TrackingAddressRepo$batchCollectGroupAddress$1 trackingAddressRepo$batchCollectGroupAddress$1;
        if (continuation instanceof TrackingAddressRepo$batchCollectGroupAddress$1) {
            trackingAddressRepo$batchCollectGroupAddress$1 = (TrackingAddressRepo$batchCollectGroupAddress$1) continuation;
            int i = trackingAddressRepo$batchCollectGroupAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackingAddressRepo$batchCollectGroupAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                trackingAddressRepo$batchCollectGroupAddress$1 = new TrackingAddressRepo$batchCollectGroupAddress$1(this, continuation);
            }
        }
        TrackingAddressRepo$batchCollectGroupAddress$1 trackingAddressRepo$batchCollectGroupAddress$12 = trackingAddressRepo$batchCollectGroupAddress$1;
        java.lang.Object objWithContext = trackingAddressRepo$batchCollectGroupAddress$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackingAddressRepo$batchCollectGroupAddress$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            TrackingAddressRepo$batchCollectGroupAddressyxL6bBk$$inlined$dexRunCatching$1 trackingAddressRepo$batchCollectGroupAddressyxL6bBk$$inlined$dexRunCatching$1 = new TrackingAddressRepo$batchCollectGroupAddressyxL6bBk$$inlined$dexRunCatching$1(null, str2, str3, list, this, str);
            trackingAddressRepo$batchCollectGroupAddress$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackingAddressRepo$batchCollectGroupAddressyxL6bBk$$inlined$dexRunCatching$1, trackingAddressRepo$batchCollectGroupAddress$12);
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

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.jBj */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: batchCollectGroupAddress-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8633batchCollectGroupAddressyxL6bBk$default(C25653jBj c25653jBj, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            list = yDY.AhwBna();
        }
        return c25653jBj.copydefault(str, str2, str3, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<AddressTrackerNotificationData>> continuation) throws java.lang.Throwable {
        TrackingAddressRepo$getAddressTrackerNotification$1 trackingAddressRepo$getAddressTrackerNotification$1;
        if (continuation instanceof TrackingAddressRepo$getAddressTrackerNotification$1) {
            trackingAddressRepo$getAddressTrackerNotification$1 = (TrackingAddressRepo$getAddressTrackerNotification$1) continuation;
            int i = trackingAddressRepo$getAddressTrackerNotification$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackingAddressRepo$getAddressTrackerNotification$1.label = i - Integer.MIN_VALUE;
            } else {
                trackingAddressRepo$getAddressTrackerNotification$1 = new TrackingAddressRepo$getAddressTrackerNotification$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trackingAddressRepo$getAddressTrackerNotification$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackingAddressRepo$getAddressTrackerNotification$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            TrackingAddressRepo$getAddressTrackerNotification0E7RQCE$$inlined$dexRunCatching$1 trackingAddressRepo$getAddressTrackerNotification0E7RQCE$$inlined$dexRunCatching$1 = new TrackingAddressRepo$getAddressTrackerNotification0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            trackingAddressRepo$getAddressTrackerNotification$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackingAddressRepo$getAddressTrackerNotification0E7RQCE$$inlined$dexRunCatching$1, trackingAddressRepo$getAddressTrackerNotification$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        TrackingAddressRepo$updateAddressTrackerNotification$1 trackingAddressRepo$updateAddressTrackerNotification$1;
        if (continuation instanceof TrackingAddressRepo$updateAddressTrackerNotification$1) {
            trackingAddressRepo$updateAddressTrackerNotification$1 = (TrackingAddressRepo$updateAddressTrackerNotification$1) continuation;
            int i2 = trackingAddressRepo$updateAddressTrackerNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingAddressRepo$updateAddressTrackerNotification$1.label = i2 - Integer.MIN_VALUE;
            } else {
                trackingAddressRepo$updateAddressTrackerNotification$1 = new TrackingAddressRepo$updateAddressTrackerNotification$1(this, continuation);
            }
        }
        TrackingAddressRepo$updateAddressTrackerNotification$1 trackingAddressRepo$updateAddressTrackerNotification$12 = trackingAddressRepo$updateAddressTrackerNotification$1;
        java.lang.Object objWithContext = trackingAddressRepo$updateAddressTrackerNotification$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = trackingAddressRepo$updateAddressTrackerNotification$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            TrackingAddressRepo$updateAddressTrackerNotificationtZkwj4A$$inlined$dexRunCatching$1 trackingAddressRepo$updateAddressTrackerNotificationtZkwj4A$$inlined$dexRunCatching$1 = new TrackingAddressRepo$updateAddressTrackerNotificationtZkwj4A$$inlined$dexRunCatching$1(null, this, str2, str, str3, str4, i, str5, str6, list);
            trackingAddressRepo$updateAddressTrackerNotification$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackingAddressRepo$updateAddressTrackerNotificationtZkwj4A$$inlined$dexRunCatching$1, trackingAddressRepo$updateAddressTrackerNotification$12);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list, int i, @NotNull Continuation<? super Result<ResponseData<java.lang.Object>>> continuation) throws java.lang.Throwable {
        TrackingAddressRepo$batchEnableOrDisableNotification$1 trackingAddressRepo$batchEnableOrDisableNotification$1;
        if (continuation instanceof TrackingAddressRepo$batchEnableOrDisableNotification$1) {
            trackingAddressRepo$batchEnableOrDisableNotification$1 = (TrackingAddressRepo$batchEnableOrDisableNotification$1) continuation;
            int i2 = trackingAddressRepo$batchEnableOrDisableNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingAddressRepo$batchEnableOrDisableNotification$1.label = i2 - Integer.MIN_VALUE;
            } else {
                trackingAddressRepo$batchEnableOrDisableNotification$1 = new TrackingAddressRepo$batchEnableOrDisableNotification$1(this, continuation);
            }
        }
        TrackingAddressRepo$batchEnableOrDisableNotification$1 trackingAddressRepo$batchEnableOrDisableNotification$12 = trackingAddressRepo$batchEnableOrDisableNotification$1;
        java.lang.Object objWithContext = trackingAddressRepo$batchEnableOrDisableNotification$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = trackingAddressRepo$batchEnableOrDisableNotification$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            TrackingAddressRepo$batchEnableOrDisableNotificationyxL6bBk$$inlined$dexRunCatching$1 trackingAddressRepo$batchEnableOrDisableNotificationyxL6bBk$$inlined$dexRunCatching$1 = new TrackingAddressRepo$batchEnableOrDisableNotificationyxL6bBk$$inlined$dexRunCatching$1(null, this, str, str2, list, i);
            trackingAddressRepo$batchEnableOrDisableNotification$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackingAddressRepo$batchEnableOrDisableNotificationyxL6bBk$$inlined$dexRunCatching$1, trackingAddressRepo$batchEnableOrDisableNotification$12);
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
