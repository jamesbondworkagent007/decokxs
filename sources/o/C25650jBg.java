package o;

import com.okinc.business.market.data.model.watchlist.FavoriteTokensSortRequest;
import com.okinc.business.market.data.model.watchlist.UpdateFavoriteTokensRequest;
import com.okinc.business.market.features.address_tracker.domain.TrackerGroupRequest;
import com.okinc.business.market.features.address_tracker.domain.TrackerOperationType;
import com.okinc.business.market.features.address_tracker.repo.TrackerGroupRepositoryImpl$addOrDeleteFavoriteTokens$1;
import com.okinc.business.market.features.address_tracker.repo.TrackerGroupRepositoryImpl$createTrackerGroup$1;
import com.okinc.business.market.features.address_tracker.repo.TrackerGroupRepositoryImpl$deleteTrackerGroup$1;
import com.okinc.business.market.features.address_tracker.repo.TrackerGroupRepositoryImpl$getSelectedGroupIds$1;
import com.okinc.business.market.features.address_tracker.repo.TrackerGroupRepositoryImpl$getSelectedGroupIds0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker.repo.TrackerGroupRepositoryImpl$getTrackerGroups$1;
import com.okinc.business.market.features.address_tracker.repo.TrackerGroupRepositoryImpl$getTrackerGroupsgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker.repo.TrackerGroupRepositoryImpl$renameTrackerGroup$1;
import com.okinc.business.market.features.address_tracker.repo.TrackerGroupRepositoryImpl$sortFavoriteTokens$1;
import com.okinc.business.market.features.address_tracker.repo.TrackerGroupRepositoryImpl$sortTrackerGroups$2;
import com.okinc.business.market.features.address_tracker.repo.TrackerGroupRepositoryImpl$updateTrackerAlias$1;
import com.okinc.business.market.features.address_tracker.repo.TrackerGroupRepositoryImpl$updateTrackerAliasBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jBg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25650jBg implements InterfaceC25651jBh {
    public final InterfaceC27595jyE AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final C28603kdr OLrzqt;
    public final C28586kda copydefault;

    @yCM
    public C25650jBg(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull C28603kdr c28603kdr, @NotNull C28586kda c28586kda, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC27595jyE;
        this.OLrzqt = c28603kdr;
        this.copydefault = c28586kda;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25651jBh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<CommonGroupData>>> continuation) {
        TrackerGroupRepositoryImpl$getTrackerGroups$1 trackerGroupRepositoryImpl$getTrackerGroups$1;
        if (continuation instanceof TrackerGroupRepositoryImpl$getTrackerGroups$1) {
            trackerGroupRepositoryImpl$getTrackerGroups$1 = (TrackerGroupRepositoryImpl$getTrackerGroups$1) continuation;
            int i = trackerGroupRepositoryImpl$getTrackerGroups$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerGroupRepositoryImpl$getTrackerGroups$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerGroupRepositoryImpl$getTrackerGroups$1 = new TrackerGroupRepositoryImpl$getTrackerGroups$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trackerGroupRepositoryImpl$getTrackerGroups$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerGroupRepositoryImpl$getTrackerGroups$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            TrackerGroupRepositoryImpl$getTrackerGroupsgIAlus$$inlined$dexRunCatching$1 trackerGroupRepositoryImpl$getTrackerGroupsgIAlus$$inlined$dexRunCatching$1 = new TrackerGroupRepositoryImpl$getTrackerGroupsgIAlus$$inlined$dexRunCatching$1(null, str, this);
            trackerGroupRepositoryImpl$getTrackerGroups$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackerGroupRepositoryImpl$getTrackerGroupsgIAlus$$inlined$dexRunCatching$1, trackerGroupRepositoryImpl$getTrackerGroups$1);
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
    @Override // o.InterfaceC25651jBh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.util.List<java.lang.Integer>>> continuation) {
        TrackerGroupRepositoryImpl$getSelectedGroupIds$1 trackerGroupRepositoryImpl$getSelectedGroupIds$1;
        if (continuation instanceof TrackerGroupRepositoryImpl$getSelectedGroupIds$1) {
            trackerGroupRepositoryImpl$getSelectedGroupIds$1 = (TrackerGroupRepositoryImpl$getSelectedGroupIds$1) continuation;
            int i = trackerGroupRepositoryImpl$getSelectedGroupIds$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerGroupRepositoryImpl$getSelectedGroupIds$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerGroupRepositoryImpl$getSelectedGroupIds$1 = new TrackerGroupRepositoryImpl$getSelectedGroupIds$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trackerGroupRepositoryImpl$getSelectedGroupIds$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerGroupRepositoryImpl$getSelectedGroupIds$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            TrackerGroupRepositoryImpl$getSelectedGroupIds0E7RQCE$$inlined$dexRunCatching$1 trackerGroupRepositoryImpl$getSelectedGroupIds0E7RQCE$$inlined$dexRunCatching$1 = new TrackerGroupRepositoryImpl$getSelectedGroupIds0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            trackerGroupRepositoryImpl$getSelectedGroupIds$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackerGroupRepositoryImpl$getSelectedGroupIds0E7RQCE$$inlined$dexRunCatching$1, trackerGroupRepositoryImpl$getSelectedGroupIds$1);
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25651jBh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super InterfaceC25645jBb> continuation) throws java.lang.Throwable {
        TrackerGroupRepositoryImpl$createTrackerGroup$1 trackerGroupRepositoryImpl$createTrackerGroup$1;
        java.lang.Object objOLrzqt;
        C25650jBg c25650jBg;
        java.lang.Object objAEQbTJ;
        java.lang.String str4;
        java.lang.String str5;
        if (continuation instanceof TrackerGroupRepositoryImpl$createTrackerGroup$1) {
            trackerGroupRepositoryImpl$createTrackerGroup$1 = (TrackerGroupRepositoryImpl$createTrackerGroup$1) continuation;
            int i = trackerGroupRepositoryImpl$createTrackerGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerGroupRepositoryImpl$createTrackerGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerGroupRepositoryImpl$createTrackerGroup$1 = new TrackerGroupRepositoryImpl$createTrackerGroup$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = trackerGroupRepositoryImpl$createTrackerGroup$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = trackerGroupRepositoryImpl$createTrackerGroup$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                C28586kda c28586kda = this.copydefault;
                trackerGroupRepositoryImpl$createTrackerGroup$1.L$0 = this;
                trackerGroupRepositoryImpl$createTrackerGroup$1.L$1 = str2;
                trackerGroupRepositoryImpl$createTrackerGroup$1.L$2 = str3;
                trackerGroupRepositoryImpl$createTrackerGroup$1.label = 1;
                objOLrzqt = c28586kda.OLrzqt(trackerGroupRepositoryImpl$createTrackerGroup$1);
                if (objOLrzqt == objCopydefault2) {
                    return objCopydefault2;
                }
                c25650jBg = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objCopydefault);
                        return InterfaceC25645jBb.Companion.EZpvd(C56443yFo.AEQbTJ(((ResponseData) objCopydefault).getCode()));
                    }
                    java.lang.String str6 = (java.lang.String) trackerGroupRepositoryImpl$createTrackerGroup$1.L$2;
                    java.lang.String str7 = (java.lang.String) trackerGroupRepositoryImpl$createTrackerGroup$1.L$1;
                    c25650jBg = (C25650jBg) trackerGroupRepositoryImpl$createTrackerGroup$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    objAEQbTJ = ((Result) objCopydefault).m7386unboximpl();
                    str5 = str6;
                    str4 = str7;
                    if (Result.m7383isFailureimpl(objAEQbTJ)) {
                        objAEQbTJ = "";
                    }
                    InterfaceC27595jyE interfaceC27595jyE = c25650jBg.AEQbTJ;
                    TrackerGroupRequest trackerGroupRequest = new TrackerGroupRequest(str4, str5, (java.lang.Integer) null, TrackerOperationType.ADD, 4, (DefaultConstructorMarker) null);
                    trackerGroupRepositoryImpl$createTrackerGroup$1.L$0 = null;
                    trackerGroupRepositoryImpl$createTrackerGroup$1.L$1 = null;
                    trackerGroupRepositoryImpl$createTrackerGroup$1.L$2 = null;
                    trackerGroupRepositoryImpl$createTrackerGroup$1.label = 3;
                    objCopydefault = interfaceC27595jyE.copydefault((java.lang.String) objAEQbTJ, trackerGroupRequest, trackerGroupRepositoryImpl$createTrackerGroup$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return InterfaceC25645jBb.Companion.EZpvd(C56443yFo.AEQbTJ(((ResponseData) objCopydefault).getCode()));
                }
                str3 = (java.lang.String) trackerGroupRepositoryImpl$createTrackerGroup$1.L$2;
                str2 = (java.lang.String) trackerGroupRepositoryImpl$createTrackerGroup$1.L$1;
                c25650jBg = (C25650jBg) trackerGroupRepositoryImpl$createTrackerGroup$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                objOLrzqt = ((Result) objCopydefault).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            java.lang.String strEZpvd = ((DexUserIdentity) objOLrzqt).EZpvd();
            C28603kdr c28603kdr = c25650jBg.OLrzqt;
            trackerGroupRepositoryImpl$createTrackerGroup$1.L$0 = c25650jBg;
            trackerGroupRepositoryImpl$createTrackerGroup$1.L$1 = str2;
            trackerGroupRepositoryImpl$createTrackerGroup$1.L$2 = str3;
            trackerGroupRepositoryImpl$createTrackerGroup$1.label = 2;
            objAEQbTJ = c28603kdr.AEQbTJ(strEZpvd, trackerGroupRepositoryImpl$createTrackerGroup$1);
            if (objAEQbTJ == objCopydefault2) {
                return objCopydefault2;
            }
            str4 = str2;
            str5 = str3;
            if (Result.m7383isFailureimpl(objAEQbTJ)) {
            }
            InterfaceC27595jyE interfaceC27595jyE2 = c25650jBg.AEQbTJ;
            TrackerGroupRequest trackerGroupRequest2 = new TrackerGroupRequest(str4, str5, (java.lang.Integer) null, TrackerOperationType.ADD, 4, (DefaultConstructorMarker) null);
            trackerGroupRepositoryImpl$createTrackerGroup$1.L$0 = null;
            trackerGroupRepositoryImpl$createTrackerGroup$1.L$1 = null;
            trackerGroupRepositoryImpl$createTrackerGroup$1.L$2 = null;
            trackerGroupRepositoryImpl$createTrackerGroup$1.label = 3;
            objCopydefault = interfaceC27595jyE2.copydefault((java.lang.String) objAEQbTJ, trackerGroupRequest2, trackerGroupRepositoryImpl$createTrackerGroup$1);
            if (objCopydefault == objCopydefault2) {
            }
            return InterfaceC25645jBb.Companion.EZpvd(C56443yFo.AEQbTJ(((ResponseData) objCopydefault).getCode()));
        } catch (OKServerException e) {
            return InterfaceC25645jBb.Companion.EZpvd(C56443yFo.AEQbTJ(e.getCode()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25651jBh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        TrackerGroupRepositoryImpl$deleteTrackerGroup$1 trackerGroupRepositoryImpl$deleteTrackerGroup$1;
        java.lang.Object objOLrzqt;
        C25650jBg c25650jBg;
        java.lang.Object objAEQbTJ;
        java.lang.String str3;
        int i2;
        if (continuation instanceof TrackerGroupRepositoryImpl$deleteTrackerGroup$1) {
            trackerGroupRepositoryImpl$deleteTrackerGroup$1 = (TrackerGroupRepositoryImpl$deleteTrackerGroup$1) continuation;
            int i3 = trackerGroupRepositoryImpl$deleteTrackerGroup$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                trackerGroupRepositoryImpl$deleteTrackerGroup$1.label = i3 - Integer.MIN_VALUE;
            } else {
                trackerGroupRepositoryImpl$deleteTrackerGroup$1 = new TrackerGroupRepositoryImpl$deleteTrackerGroup$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = trackerGroupRepositoryImpl$deleteTrackerGroup$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i4 = trackerGroupRepositoryImpl$deleteTrackerGroup$1.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                C28586kda c28586kda = this.copydefault;
                trackerGroupRepositoryImpl$deleteTrackerGroup$1.L$0 = this;
                trackerGroupRepositoryImpl$deleteTrackerGroup$1.L$1 = str2;
                trackerGroupRepositoryImpl$deleteTrackerGroup$1.I$0 = i;
                trackerGroupRepositoryImpl$deleteTrackerGroup$1.label = 1;
                objOLrzqt = c28586kda.OLrzqt(trackerGroupRepositoryImpl$deleteTrackerGroup$1);
                if (objOLrzqt == objCopydefault2) {
                    return objCopydefault2;
                }
                c25650jBg = this;
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objCopydefault);
                        return C56443yFo.AEQbTJ(((ResponseData) objCopydefault).getCode());
                    }
                    i2 = trackerGroupRepositoryImpl$deleteTrackerGroup$1.I$0;
                    java.lang.String str4 = (java.lang.String) trackerGroupRepositoryImpl$deleteTrackerGroup$1.L$1;
                    c25650jBg = (C25650jBg) trackerGroupRepositoryImpl$deleteTrackerGroup$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    objAEQbTJ = ((Result) objCopydefault).m7386unboximpl();
                    str3 = str4;
                    if (Result.m7383isFailureimpl(objAEQbTJ)) {
                        objAEQbTJ = "";
                    }
                    InterfaceC27595jyE interfaceC27595jyE = c25650jBg.AEQbTJ;
                    TrackerGroupRequest trackerGroupRequest = new TrackerGroupRequest(str3, (java.lang.String) null, C56443yFo.AEQbTJ(i2), TrackerOperationType.DELETE, 2, (DefaultConstructorMarker) null);
                    trackerGroupRepositoryImpl$deleteTrackerGroup$1.L$0 = null;
                    trackerGroupRepositoryImpl$deleteTrackerGroup$1.L$1 = null;
                    trackerGroupRepositoryImpl$deleteTrackerGroup$1.label = 3;
                    objCopydefault = interfaceC27595jyE.copydefault((java.lang.String) objAEQbTJ, trackerGroupRequest, trackerGroupRepositoryImpl$deleteTrackerGroup$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return C56443yFo.AEQbTJ(((ResponseData) objCopydefault).getCode());
                }
                i = trackerGroupRepositoryImpl$deleteTrackerGroup$1.I$0;
                str2 = (java.lang.String) trackerGroupRepositoryImpl$deleteTrackerGroup$1.L$1;
                c25650jBg = (C25650jBg) trackerGroupRepositoryImpl$deleteTrackerGroup$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                objOLrzqt = ((Result) objCopydefault).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            java.lang.String strEZpvd = ((DexUserIdentity) objOLrzqt).EZpvd();
            C28603kdr c28603kdr = c25650jBg.OLrzqt;
            trackerGroupRepositoryImpl$deleteTrackerGroup$1.L$0 = c25650jBg;
            trackerGroupRepositoryImpl$deleteTrackerGroup$1.L$1 = str2;
            trackerGroupRepositoryImpl$deleteTrackerGroup$1.I$0 = i;
            trackerGroupRepositoryImpl$deleteTrackerGroup$1.label = 2;
            objAEQbTJ = c28603kdr.AEQbTJ(strEZpvd, trackerGroupRepositoryImpl$deleteTrackerGroup$1);
            if (objAEQbTJ == objCopydefault2) {
                return objCopydefault2;
            }
            str3 = str2;
            i2 = i;
            if (Result.m7383isFailureimpl(objAEQbTJ)) {
            }
            InterfaceC27595jyE interfaceC27595jyE2 = c25650jBg.AEQbTJ;
            TrackerGroupRequest trackerGroupRequest2 = new TrackerGroupRequest(str3, (java.lang.String) null, C56443yFo.AEQbTJ(i2), TrackerOperationType.DELETE, 2, (DefaultConstructorMarker) null);
            trackerGroupRepositoryImpl$deleteTrackerGroup$1.L$0 = null;
            trackerGroupRepositoryImpl$deleteTrackerGroup$1.L$1 = null;
            trackerGroupRepositoryImpl$deleteTrackerGroup$1.label = 3;
            objCopydefault = interfaceC27595jyE2.copydefault((java.lang.String) objAEQbTJ, trackerGroupRequest2, trackerGroupRepositoryImpl$deleteTrackerGroup$1);
            if (objCopydefault == objCopydefault2) {
            }
            return C56443yFo.AEQbTJ(((ResponseData) objCopydefault).getCode());
        } catch (OKServerException e) {
            return C56443yFo.AEQbTJ(e.getCode());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25651jBh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull Continuation<? super InterfaceC25645jBb> continuation) throws java.lang.Throwable {
        TrackerGroupRepositoryImpl$renameTrackerGroup$1 trackerGroupRepositoryImpl$renameTrackerGroup$1;
        java.lang.Object objOLrzqt;
        C25650jBg c25650jBg;
        java.lang.Object objAEQbTJ;
        java.lang.String str4;
        int i2;
        java.lang.String str5;
        if (continuation instanceof TrackerGroupRepositoryImpl$renameTrackerGroup$1) {
            trackerGroupRepositoryImpl$renameTrackerGroup$1 = (TrackerGroupRepositoryImpl$renameTrackerGroup$1) continuation;
            int i3 = trackerGroupRepositoryImpl$renameTrackerGroup$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                trackerGroupRepositoryImpl$renameTrackerGroup$1.label = i3 - Integer.MIN_VALUE;
            } else {
                trackerGroupRepositoryImpl$renameTrackerGroup$1 = new TrackerGroupRepositoryImpl$renameTrackerGroup$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = trackerGroupRepositoryImpl$renameTrackerGroup$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i4 = trackerGroupRepositoryImpl$renameTrackerGroup$1.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                C28586kda c28586kda = this.copydefault;
                trackerGroupRepositoryImpl$renameTrackerGroup$1.L$0 = this;
                trackerGroupRepositoryImpl$renameTrackerGroup$1.L$1 = str2;
                trackerGroupRepositoryImpl$renameTrackerGroup$1.L$2 = str3;
                trackerGroupRepositoryImpl$renameTrackerGroup$1.I$0 = i;
                trackerGroupRepositoryImpl$renameTrackerGroup$1.label = 1;
                objOLrzqt = c28586kda.OLrzqt(trackerGroupRepositoryImpl$renameTrackerGroup$1);
                if (objOLrzqt == objCopydefault2) {
                    return objCopydefault2;
                }
                c25650jBg = this;
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objCopydefault);
                        ResponseData responseData = (ResponseData) objCopydefault;
                        return InterfaceC25645jBb.Companion.EZpvd(C56443yFo.AEQbTJ(new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg(), null, responseData.getError_code(), 16, null).getCode()));
                    }
                    i2 = trackerGroupRepositoryImpl$renameTrackerGroup$1.I$0;
                    str5 = (java.lang.String) trackerGroupRepositoryImpl$renameTrackerGroup$1.L$2;
                    str4 = (java.lang.String) trackerGroupRepositoryImpl$renameTrackerGroup$1.L$1;
                    c25650jBg = (C25650jBg) trackerGroupRepositoryImpl$renameTrackerGroup$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    objAEQbTJ = ((Result) objCopydefault).m7386unboximpl();
                    if (Result.m7383isFailureimpl(objAEQbTJ)) {
                        objAEQbTJ = "";
                    }
                    InterfaceC27595jyE interfaceC27595jyE = c25650jBg.AEQbTJ;
                    TrackerGroupRequest trackerGroupRequest = new TrackerGroupRequest(str4, str5, C56443yFo.AEQbTJ(i2), TrackerOperationType.UPDATE);
                    trackerGroupRepositoryImpl$renameTrackerGroup$1.L$0 = null;
                    trackerGroupRepositoryImpl$renameTrackerGroup$1.L$1 = null;
                    trackerGroupRepositoryImpl$renameTrackerGroup$1.L$2 = null;
                    trackerGroupRepositoryImpl$renameTrackerGroup$1.label = 3;
                    objCopydefault = interfaceC27595jyE.copydefault((java.lang.String) objAEQbTJ, trackerGroupRequest, trackerGroupRepositoryImpl$renameTrackerGroup$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    ResponseData responseData2 = (ResponseData) objCopydefault;
                    return InterfaceC25645jBb.Companion.EZpvd(C56443yFo.AEQbTJ(new ResponseData(responseData2.getCode(), responseData2.getMsg(), responseData2.getDetailMsg(), responseData2.getErrorMsg(), null, responseData2.getError_code(), 16, null).getCode()));
                }
                i = trackerGroupRepositoryImpl$renameTrackerGroup$1.I$0;
                str3 = (java.lang.String) trackerGroupRepositoryImpl$renameTrackerGroup$1.L$2;
                str2 = (java.lang.String) trackerGroupRepositoryImpl$renameTrackerGroup$1.L$1;
                c25650jBg = (C25650jBg) trackerGroupRepositoryImpl$renameTrackerGroup$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                objOLrzqt = ((Result) objCopydefault).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            java.lang.String strEZpvd = ((DexUserIdentity) objOLrzqt).EZpvd();
            C28603kdr c28603kdr = c25650jBg.OLrzqt;
            trackerGroupRepositoryImpl$renameTrackerGroup$1.L$0 = c25650jBg;
            trackerGroupRepositoryImpl$renameTrackerGroup$1.L$1 = str2;
            trackerGroupRepositoryImpl$renameTrackerGroup$1.L$2 = str3;
            trackerGroupRepositoryImpl$renameTrackerGroup$1.I$0 = i;
            trackerGroupRepositoryImpl$renameTrackerGroup$1.label = 2;
            objAEQbTJ = c28603kdr.AEQbTJ(strEZpvd, trackerGroupRepositoryImpl$renameTrackerGroup$1);
            if (objAEQbTJ == objCopydefault2) {
                return objCopydefault2;
            }
            java.lang.String str6 = str3;
            str4 = str2;
            i2 = i;
            str5 = str6;
            if (Result.m7383isFailureimpl(objAEQbTJ)) {
            }
            InterfaceC27595jyE interfaceC27595jyE2 = c25650jBg.AEQbTJ;
            TrackerGroupRequest trackerGroupRequest2 = new TrackerGroupRequest(str4, str5, C56443yFo.AEQbTJ(i2), TrackerOperationType.UPDATE);
            trackerGroupRepositoryImpl$renameTrackerGroup$1.L$0 = null;
            trackerGroupRepositoryImpl$renameTrackerGroup$1.L$1 = null;
            trackerGroupRepositoryImpl$renameTrackerGroup$1.L$2 = null;
            trackerGroupRepositoryImpl$renameTrackerGroup$1.label = 3;
            objCopydefault = interfaceC27595jyE2.copydefault((java.lang.String) objAEQbTJ, trackerGroupRequest2, trackerGroupRepositoryImpl$renameTrackerGroup$1);
            if (objCopydefault == objCopydefault2) {
            }
            ResponseData responseData22 = (ResponseData) objCopydefault;
            return InterfaceC25645jBb.Companion.EZpvd(C56443yFo.AEQbTJ(new ResponseData(responseData22.getCode(), responseData22.getMsg(), responseData22.getDetailMsg(), responseData22.getErrorMsg(), null, responseData22.getError_code(), 16, null).getCode()));
        } catch (OKServerException e) {
            return InterfaceC25645jBb.Companion.EZpvd(C56443yFo.AEQbTJ(e.getCode()));
        }
    }

    @Override // o.InterfaceC25651jBh
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation) {
        return kAB.EZpvd(new TrackerGroupRepositoryImpl$sortTrackerGroups$2(this, str2, list, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull UpdateFavoriteTokensRequest updateFavoriteTokensRequest, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        TrackerGroupRepositoryImpl$addOrDeleteFavoriteTokens$1 trackerGroupRepositoryImpl$addOrDeleteFavoriteTokens$1;
        if (continuation instanceof TrackerGroupRepositoryImpl$addOrDeleteFavoriteTokens$1) {
            trackerGroupRepositoryImpl$addOrDeleteFavoriteTokens$1 = (TrackerGroupRepositoryImpl$addOrDeleteFavoriteTokens$1) continuation;
            int i = trackerGroupRepositoryImpl$addOrDeleteFavoriteTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerGroupRepositoryImpl$addOrDeleteFavoriteTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerGroupRepositoryImpl$addOrDeleteFavoriteTokens$1 = new TrackerGroupRepositoryImpl$addOrDeleteFavoriteTokens$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = trackerGroupRepositoryImpl$addOrDeleteFavoriteTokens$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = trackerGroupRepositoryImpl$addOrDeleteFavoriteTokens$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC27595jyE interfaceC27595jyE = this.AEQbTJ;
                trackerGroupRepositoryImpl$addOrDeleteFavoriteTokens$1.label = 1;
                objCopydefault = interfaceC27595jyE.copydefault(updateFavoriteTokensRequest, trackerGroupRepositoryImpl$addOrDeleteFavoriteTokens$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            return C56443yFo.AEQbTJ(((ResponseData) objCopydefault).getCode());
        } catch (OKServerException e) {
            return C56443yFo.AEQbTJ(e.getCode());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull FavoriteTokensSortRequest favoriteTokensSortRequest, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        TrackerGroupRepositoryImpl$sortFavoriteTokens$1 trackerGroupRepositoryImpl$sortFavoriteTokens$1;
        if (continuation instanceof TrackerGroupRepositoryImpl$sortFavoriteTokens$1) {
            trackerGroupRepositoryImpl$sortFavoriteTokens$1 = (TrackerGroupRepositoryImpl$sortFavoriteTokens$1) continuation;
            int i = trackerGroupRepositoryImpl$sortFavoriteTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerGroupRepositoryImpl$sortFavoriteTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerGroupRepositoryImpl$sortFavoriteTokens$1 = new TrackerGroupRepositoryImpl$sortFavoriteTokens$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = trackerGroupRepositoryImpl$sortFavoriteTokens$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerGroupRepositoryImpl$sortFavoriteTokens$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC27595jyE interfaceC27595jyE = this.AEQbTJ;
                trackerGroupRepositoryImpl$sortFavoriteTokens$1.label = 1;
                objAEQbTJ = interfaceC27595jyE.AEQbTJ(favoriteTokensSortRequest, trackerGroupRepositoryImpl$sortFavoriteTokens$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            return C56443yFo.AEQbTJ(((ResponseData) objAEQbTJ).getCode());
        } catch (OKServerException e) {
            return C56443yFo.AEQbTJ(e.getCode());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25651jBh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<? extends InterfaceC25647jBd>> continuation) {
        TrackerGroupRepositoryImpl$updateTrackerAlias$1 trackerGroupRepositoryImpl$updateTrackerAlias$1;
        if (continuation instanceof TrackerGroupRepositoryImpl$updateTrackerAlias$1) {
            trackerGroupRepositoryImpl$updateTrackerAlias$1 = (TrackerGroupRepositoryImpl$updateTrackerAlias$1) continuation;
            int i = trackerGroupRepositoryImpl$updateTrackerAlias$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerGroupRepositoryImpl$updateTrackerAlias$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerGroupRepositoryImpl$updateTrackerAlias$1 = new TrackerGroupRepositoryImpl$updateTrackerAlias$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trackerGroupRepositoryImpl$updateTrackerAlias$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerGroupRepositoryImpl$updateTrackerAlias$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            TrackerGroupRepositoryImpl$updateTrackerAliasBWLJW6A$$inlined$dexRunCatching$1 trackerGroupRepositoryImpl$updateTrackerAliasBWLJW6A$$inlined$dexRunCatching$1 = new TrackerGroupRepositoryImpl$updateTrackerAliasBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str2, str3);
            trackerGroupRepositoryImpl$updateTrackerAlias$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackerGroupRepositoryImpl$updateTrackerAliasBWLJW6A$$inlined$dexRunCatching$1, trackerGroupRepositoryImpl$updateTrackerAlias$1);
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
