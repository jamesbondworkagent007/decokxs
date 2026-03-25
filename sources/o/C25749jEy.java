package o;

import com.okinc.business.market.data.constant.AddressTrackerSortType;
import com.okinc.business.market.data.model.GetTrackingAddressGroup;
import com.okinc.business.market.data.model.GetTrackingAddressListResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerManageAddressUseCase$batchMigrate$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerManageAddressUseCase$batchMigrateyxL6bBk$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerManageAddressUseCase$batchUnfollow$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerManageAddressUseCase$batchUnfollowBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerManageAddressUseCase$getTrackingAddressList$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerManageAddressUseCase$getTrackingAddressListhUnOzRk$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerManageAddressUseCase$getTrackingGroupsList$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerManageAddressUseCase$getTrackingGroupsListgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerAddressGroupUIModel;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jEy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25749jEy {
    public final CoroutineDispatcher EZpvd;
    public final C28603kdr OLrzqt;
    public final jEA copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C25749jEy(@NotNull jEA jea, @NotNull C28603kdr c28603kdr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(jea, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = jea;
        this.OLrzqt = c28603kdr;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.jEy$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jEy.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<TrackerAddressGroupUIModel>>> continuation) throws java.lang.Throwable {
        TrackerManageAddressUseCase$getTrackingGroupsList$1 trackerManageAddressUseCase$getTrackingGroupsList$1;
        if (continuation instanceof TrackerManageAddressUseCase$getTrackingGroupsList$1) {
            trackerManageAddressUseCase$getTrackingGroupsList$1 = (TrackerManageAddressUseCase$getTrackingGroupsList$1) continuation;
            int i = trackerManageAddressUseCase$getTrackingGroupsList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerManageAddressUseCase$getTrackingGroupsList$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerManageAddressUseCase$getTrackingGroupsList$1 = new TrackerManageAddressUseCase$getTrackingGroupsList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trackerManageAddressUseCase$getTrackingGroupsList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerManageAddressUseCase$getTrackingGroupsList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            TrackerManageAddressUseCase$getTrackingGroupsListgIAlus$$inlined$dexRunCatching$1 trackerManageAddressUseCase$getTrackingGroupsListgIAlus$$inlined$dexRunCatching$1 = new TrackerManageAddressUseCase$getTrackingGroupsListgIAlus$$inlined$dexRunCatching$1(null, this, str);
            trackerManageAddressUseCase$getTrackingGroupsList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackerManageAddressUseCase$getTrackingGroupsListgIAlus$$inlined$dexRunCatching$1, trackerManageAddressUseCase$getTrackingGroupsList$1);
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

    /* JADX INFO: renamed from: getTrackingAddressList-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8634getTrackingAddressListhUnOzRk$default(C25749jEy c25749jEy, java.lang.String str, int i, AddressTrackerSortType addressTrackerSortType, java.lang.Long l, boolean z, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            l = null;
        }
        return c25749jEy.OLrzqt(str, i, addressTrackerSortType, l, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, int i, @NotNull AddressTrackerSortType addressTrackerSortType, java.lang.Long l, boolean z, @NotNull Continuation<? super Result<GetTrackingAddressListResponse>> continuation) throws java.lang.Throwable {
        TrackerManageAddressUseCase$getTrackingAddressList$1 trackerManageAddressUseCase$getTrackingAddressList$1;
        if (continuation instanceof TrackerManageAddressUseCase$getTrackingAddressList$1) {
            trackerManageAddressUseCase$getTrackingAddressList$1 = (TrackerManageAddressUseCase$getTrackingAddressList$1) continuation;
            int i2 = trackerManageAddressUseCase$getTrackingAddressList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackerManageAddressUseCase$getTrackingAddressList$1.label = i2 - Integer.MIN_VALUE;
            } else {
                trackerManageAddressUseCase$getTrackingAddressList$1 = new TrackerManageAddressUseCase$getTrackingAddressList$1(this, continuation);
            }
        }
        TrackerManageAddressUseCase$getTrackingAddressList$1 trackerManageAddressUseCase$getTrackingAddressList$12 = trackerManageAddressUseCase$getTrackingAddressList$1;
        java.lang.Object objWithContext = trackerManageAddressUseCase$getTrackingAddressList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = trackerManageAddressUseCase$getTrackingAddressList$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            TrackerManageAddressUseCase$getTrackingAddressListhUnOzRk$$inlined$dexRunCatching$1 trackerManageAddressUseCase$getTrackingAddressListhUnOzRk$$inlined$dexRunCatching$1 = new TrackerManageAddressUseCase$getTrackingAddressListhUnOzRk$$inlined$dexRunCatching$1(null, this, str, l, i, addressTrackerSortType, z);
            trackerManageAddressUseCase$getTrackingAddressList$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackerManageAddressUseCase$getTrackingAddressListhUnOzRk$$inlined$dexRunCatching$1, trackerManageAddressUseCase$getTrackingAddressList$12);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, java.lang.Long l, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) throws java.lang.Throwable {
        TrackerManageAddressUseCase$batchUnfollow$1 trackerManageAddressUseCase$batchUnfollow$1;
        java.lang.Object objAEQbTJ;
        C25749jEy c25749jEy;
        java.lang.String str2;
        java.util.List<java.lang.String> list2;
        java.lang.Long l2;
        if (continuation instanceof TrackerManageAddressUseCase$batchUnfollow$1) {
            trackerManageAddressUseCase$batchUnfollow$1 = (TrackerManageAddressUseCase$batchUnfollow$1) continuation;
            int i = trackerManageAddressUseCase$batchUnfollow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerManageAddressUseCase$batchUnfollow$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerManageAddressUseCase$batchUnfollow$1 = new TrackerManageAddressUseCase$batchUnfollow$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trackerManageAddressUseCase$batchUnfollow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerManageAddressUseCase$batchUnfollow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            C28603kdr c28603kdr = this.OLrzqt;
            trackerManageAddressUseCase$batchUnfollow$1.L$0 = this;
            trackerManageAddressUseCase$batchUnfollow$1.L$1 = str;
            trackerManageAddressUseCase$batchUnfollow$1.L$2 = list;
            trackerManageAddressUseCase$batchUnfollow$1.L$3 = l;
            trackerManageAddressUseCase$batchUnfollow$1.label = 1;
            objAEQbTJ = c28603kdr.AEQbTJ(str, trackerManageAddressUseCase$batchUnfollow$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c25749jEy = this;
            str2 = str;
            list2 = list;
            l2 = l;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                return ((Result) objWithContext).m7386unboximpl();
            }
            java.lang.Long l3 = (java.lang.Long) trackerManageAddressUseCase$batchUnfollow$1.L$3;
            java.util.List<java.lang.String> list3 = (java.util.List) trackerManageAddressUseCase$batchUnfollow$1.L$2;
            java.lang.String str3 = (java.lang.String) trackerManageAddressUseCase$batchUnfollow$1.L$1;
            C25749jEy c25749jEy2 = (C25749jEy) trackerManageAddressUseCase$batchUnfollow$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            objAEQbTJ = ((Result) objWithContext).m7386unboximpl();
            str2 = str3;
            list2 = list3;
            l2 = l3;
            c25749jEy = c25749jEy2;
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = "";
        }
        CoroutineDispatcher coroutineDispatcher = c25749jEy.EZpvd;
        TrackerManageAddressUseCase$batchUnfollowBWLJW6A$$inlined$dexRunCatching$1 trackerManageAddressUseCase$batchUnfollowBWLJW6A$$inlined$dexRunCatching$1 = new TrackerManageAddressUseCase$batchUnfollowBWLJW6A$$inlined$dexRunCatching$1(null, c25749jEy, (java.lang.String) objAEQbTJ, str2, list2, l2);
        trackerManageAddressUseCase$batchUnfollow$1.L$0 = null;
        trackerManageAddressUseCase$batchUnfollow$1.L$1 = null;
        trackerManageAddressUseCase$batchUnfollow$1.L$2 = null;
        trackerManageAddressUseCase$batchUnfollow$1.L$3 = null;
        trackerManageAddressUseCase$batchUnfollow$1.label = 2;
        objWithContext = BuildersKt.withContext(coroutineDispatcher, trackerManageAddressUseCase$batchUnfollowBWLJW6A$$inlined$dexRunCatching$1, trackerManageAddressUseCase$batchUnfollow$1);
        if (objWithContext == objCopydefault) {
            return objCopydefault;
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, long j, @NotNull java.util.List<java.lang.Long> list2, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) throws java.lang.Throwable {
        TrackerManageAddressUseCase$batchMigrate$1 trackerManageAddressUseCase$batchMigrate$1;
        java.lang.Object objAEQbTJ;
        java.lang.String str2;
        java.util.List<java.lang.String> list3;
        java.util.List<java.lang.Long> list4;
        long j2;
        C25749jEy c25749jEy;
        if (continuation instanceof TrackerManageAddressUseCase$batchMigrate$1) {
            trackerManageAddressUseCase$batchMigrate$1 = (TrackerManageAddressUseCase$batchMigrate$1) continuation;
            int i = trackerManageAddressUseCase$batchMigrate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerManageAddressUseCase$batchMigrate$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerManageAddressUseCase$batchMigrate$1 = new TrackerManageAddressUseCase$batchMigrate$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trackerManageAddressUseCase$batchMigrate$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerManageAddressUseCase$batchMigrate$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            C28603kdr c28603kdr = this.OLrzqt;
            trackerManageAddressUseCase$batchMigrate$1.L$0 = this;
            trackerManageAddressUseCase$batchMigrate$1.L$1 = str;
            trackerManageAddressUseCase$batchMigrate$1.L$2 = list;
            trackerManageAddressUseCase$batchMigrate$1.L$3 = list2;
            trackerManageAddressUseCase$batchMigrate$1.J$0 = j;
            trackerManageAddressUseCase$batchMigrate$1.label = 1;
            objAEQbTJ = c28603kdr.AEQbTJ(str, trackerManageAddressUseCase$batchMigrate$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            str2 = str;
            list3 = list;
            list4 = list2;
            j2 = j;
            c25749jEy = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                return ((Result) objWithContext).m7386unboximpl();
            }
            long j3 = trackerManageAddressUseCase$batchMigrate$1.J$0;
            java.util.List<java.lang.Long> list5 = (java.util.List) trackerManageAddressUseCase$batchMigrate$1.L$3;
            java.util.List<java.lang.String> list6 = (java.util.List) trackerManageAddressUseCase$batchMigrate$1.L$2;
            java.lang.String str3 = (java.lang.String) trackerManageAddressUseCase$batchMigrate$1.L$1;
            C25749jEy c25749jEy2 = (C25749jEy) trackerManageAddressUseCase$batchMigrate$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            objAEQbTJ = ((Result) objWithContext).m7386unboximpl();
            list4 = list5;
            list3 = list6;
            j2 = j3;
            str2 = str3;
            c25749jEy = c25749jEy2;
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = "";
        }
        CoroutineDispatcher coroutineDispatcher = c25749jEy.EZpvd;
        TrackerManageAddressUseCase$batchMigrateyxL6bBk$$inlined$dexRunCatching$1 trackerManageAddressUseCase$batchMigrateyxL6bBk$$inlined$dexRunCatching$1 = new TrackerManageAddressUseCase$batchMigrateyxL6bBk$$inlined$dexRunCatching$1(null, c25749jEy, (java.lang.String) objAEQbTJ, str2, list3, j2, list4);
        trackerManageAddressUseCase$batchMigrate$1.L$0 = null;
        trackerManageAddressUseCase$batchMigrate$1.L$1 = null;
        trackerManageAddressUseCase$batchMigrate$1.L$2 = null;
        trackerManageAddressUseCase$batchMigrate$1.L$3 = null;
        trackerManageAddressUseCase$batchMigrate$1.label = 2;
        objWithContext = BuildersKt.withContext(coroutineDispatcher, trackerManageAddressUseCase$batchMigrateyxL6bBk$$inlined$dexRunCatching$1, trackerManageAddressUseCase$batchMigrate$1);
        if (objWithContext == objCopydefault) {
            return objCopydefault;
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: o.jEy$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((GetTrackingAddressGroup) t).gEmmrt()), java.lang.Integer.valueOf(((GetTrackingAddressGroup) t2).gEmmrt()));
        }
    }
}
