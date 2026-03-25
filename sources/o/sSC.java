package o;

import com.okinc.okimcore.model.biz.relationlocal.OsPhoneRelation;
import com.okinc.okimcore.model.remote.SyncRelationsResponse;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import com.okinc.okimcore.usecase.phonerelations.SyncPhoneRelationsUseCase$execute$1;
import com.okinc.okimcore.usecase.phonerelations.SyncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1;
import com.okinc.okimcore.usecase.phonerelations.SyncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1;
import com.okinc.okimcore.usecase.phonerelations.SyncPhoneRelationsUseCase$getSyncQuota$1;
import com.okinc.okimcore.usecase.phonerelations.SyncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1;
import com.okinc.okimcore.usecase.phonerelations.SyncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1;
import com.okinc.okimcore.usecase.phonerelations.SyncPhoneRelationsUseCase$markPhoneRelationsSynced$1;
import com.okinc.okimcore.usecase.phonerelations.SyncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1;
import com.okinc.okimcore.usecase.phonerelations.SyncPhoneRelationsUseCase$submitLocalRelationsToRemote$1;
import com.okinc.okimcore.usecase.phonerelations.SyncPhoneRelationsUseCase$updateSyncRejectTimestamp$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sSC {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final C44511sSn AEQbTJ;
    public final C44516sSs AYXKKw;
    public final C44522sSy AhwBna;
    public final sSH KWHzl;
    public final C44506sSi OLrzqt;
    public final C44515sSr copydefault;
    public final sSA djBIcL;
    public final C44521sSx gEmmrt;
    public final sSG valueOf;

    @yCM
    public sSC(@NotNull C44511sSn c44511sSn, @NotNull C44521sSx c44521sSx, @NotNull C44516sSs c44516sSs, @NotNull sSH ssh, @NotNull C44515sSr c44515sSr, @NotNull C44522sSy c44522sSy, @NotNull sSA ssa, @NotNull C44506sSi c44506sSi, @NotNull sSG ssg) {
        Intrinsics.checkNotNullParameter(c44511sSn, "");
        Intrinsics.checkNotNullParameter(c44521sSx, "");
        Intrinsics.checkNotNullParameter(c44516sSs, "");
        Intrinsics.checkNotNullParameter(ssh, "");
        Intrinsics.checkNotNullParameter(c44515sSr, "");
        Intrinsics.checkNotNullParameter(c44522sSy, "");
        Intrinsics.checkNotNullParameter(ssa, "");
        Intrinsics.checkNotNullParameter(c44506sSi, "");
        Intrinsics.checkNotNullParameter(ssg, "");
        this.AEQbTJ = c44511sSn;
        this.gEmmrt = c44521sSx;
        this.AYXKKw = c44516sSs;
        this.KWHzl = ssh;
        this.copydefault = c44515sSr;
        this.AhwBna = c44522sSy;
        this.djBIcL = ssa;
        this.OLrzqt = c44506sSi;
        this.valueOf = ssg;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sSC.ActionBar.<init>():void type: THIS */
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
    public final java.lang.Object copydefault(int i, Continuation<? super java.util.List<OsPhoneRelation>> continuation) throws java.lang.Throwable {
        SyncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1 syncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1;
        long jCurrentTimeMillis;
        long j;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof SyncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1) {
            syncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1 = (SyncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1) continuation;
            int i2 = syncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1.label = i2 - Integer.MIN_VALUE;
            } else {
                syncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1 = new SyncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = syncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = syncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                Result.Application application = Result.Companion;
                C44511sSn c44511sSn = this.AEQbTJ;
                syncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1.I$0 = i;
                syncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1.J$0 = jCurrentTimeMillis;
                syncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1.label = 1;
                objOLrzqt = c44511sSn.OLrzqt(syncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                j = jCurrentTimeMillis;
            } catch (java.lang.Throwable th) {
                th = th;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jCurrentTimeMillis;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = syncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1.J$0;
            i = syncPhoneRelationsUseCase$getAllPhoneRelationsFromPhonebook$1.I$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
            } catch (java.lang.Throwable th2) {
                th = th2;
                jCurrentTimeMillis = j;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jCurrentTimeMillis;
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objOLrzqt);
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("SyncPhoneRelationsUseCase", "[" + i + "] failed to get phone relations, " + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
        }
        java.util.List listAhwBna = yDY.AhwBna();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = listAhwBna;
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) objM7377constructorimpl, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        java.util.List list = (java.util.List) pairOLrzqt.component1();
        long jLongValue = ((java.lang.Number) pairOLrzqt.component2()).longValue();
        pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i + "] phone relations size=" + list.size() + ", time cost=" + jLongValue);
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(int i, java.util.List<OsPhoneRelation> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SyncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1 syncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1;
        long jCurrentTimeMillis;
        java.lang.Throwable th;
        int i2;
        long j;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof SyncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1) {
            syncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1 = (SyncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1) continuation;
            int i3 = syncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                syncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1.label = i3 - Integer.MIN_VALUE;
            } else {
                syncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1 = new SyncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1(this, continuation);
            }
        }
        java.lang.Object obj = syncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = syncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                Result.Application application = Result.Companion;
                C44521sSx c44521sSx = this.gEmmrt;
                syncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1.I$0 = i;
                syncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1.J$0 = jCurrentTimeMillis;
                syncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1.label = 1;
                if (c44521sSx.EZpvd(list, syncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1) == objCopydefault) {
                    return objCopydefault;
                }
                i2 = i;
                j = jCurrentTimeMillis;
            } catch (java.lang.Throwable th2) {
                th = th2;
                i2 = i;
                j = jCurrentTimeMillis;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i2 + "] remove deleted phone relations time cost=" + (java.lang.System.currentTimeMillis() - j));
                return Unit.INSTANCE;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = syncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1.J$0;
            i2 = syncPhoneRelationsUseCase$removeDeletedPhoneRelationsFromDatabase$1.I$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        try {
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th4) {
            th = th4;
            jCurrentTimeMillis = j;
            i = i2;
            i2 = i;
            j = jCurrentTimeMillis;
            Result.Application application222 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("SyncPhoneRelationsUseCase", "[" + i2 + "] failed to remove deleted phone relations, " + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
        }
        pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i2 + "] remove deleted phone relations time cost=" + (java.lang.System.currentTimeMillis() - j));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(int i, java.util.List<OsPhoneRelation> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SyncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1 syncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1;
        long jCurrentTimeMillis;
        java.lang.Throwable th;
        int i2;
        long j;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof SyncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1) {
            syncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1 = (SyncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1) continuation;
            int i3 = syncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                syncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1.label = i3 - Integer.MIN_VALUE;
            } else {
                syncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1 = new SyncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1(this, continuation);
            }
        }
        java.lang.Object obj = syncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = syncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                Result.Application application = Result.Companion;
                C44516sSs c44516sSs = this.AYXKKw;
                syncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1.I$0 = i;
                syncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1.J$0 = jCurrentTimeMillis;
                syncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1.label = 1;
                if (c44516sSs.copydefault(list, syncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1) == objCopydefault) {
                    return objCopydefault;
                }
                i2 = i;
                j = jCurrentTimeMillis;
            } catch (java.lang.Throwable th2) {
                th = th2;
                i2 = i;
                j = jCurrentTimeMillis;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i2 + "] insert phone relations time cost=" + (java.lang.System.currentTimeMillis() - j));
                return Unit.INSTANCE;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = syncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1.J$0;
            i2 = syncPhoneRelationsUseCase$insertPhoneRelationsIntoDatabase$1.I$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        try {
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th4) {
            th = th4;
            jCurrentTimeMillis = j;
            i = i2;
            i2 = i;
            j = jCurrentTimeMillis;
            Result.Application application222 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("SyncPhoneRelationsUseCase", "[" + i2 + "] failed to insert local relations, " + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
        }
        pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i2 + "] insert phone relations time cost=" + (java.lang.System.currentTimeMillis() - j));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(int i, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        SyncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1 syncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1;
        long jCurrentTimeMillis;
        long j;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof SyncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1) {
            syncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1 = (SyncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1) continuation;
            int i2 = syncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1.label = i2 - Integer.MIN_VALUE;
            } else {
                syncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1 = new SyncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = syncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = syncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                Result.Application application = Result.Companion;
                C44515sSr c44515sSr = this.copydefault;
                syncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1.I$0 = i;
                syncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1.J$0 = jCurrentTimeMillis;
                syncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1.label = 1;
                objEZpvd = c44515sSr.EZpvd(1L, syncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                j = jCurrentTimeMillis;
            } catch (java.lang.Throwable th) {
                th = th;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jCurrentTimeMillis;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = syncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1.J$0;
            i = syncPhoneRelationsUseCase$isAnyPhoneRelationNotSyncYet$1.I$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (java.lang.Throwable th2) {
                th = th2;
                jCurrentTimeMillis = j;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jCurrentTimeMillis;
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(!((java.util.Collection) objEZpvd).isEmpty()));
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("SyncPhoneRelationsUseCase", "[" + i + "] failed to check any phone relation not sync yet, " + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
        }
        java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = boolKWHzl;
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.KWHzl(((java.lang.Boolean) objM7377constructorimpl).booleanValue()), C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        boolean zBooleanValue = ((java.lang.Boolean) pairOLrzqt.component1()).booleanValue();
        pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i + "] check is any phone contact not sync yet, result=" + zBooleanValue + ", time cost=" + ((java.lang.Number) pairOLrzqt.component2()).longValue());
        return C56443yFo.KWHzl(zBooleanValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(int i, Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        SyncPhoneRelationsUseCase$getSyncQuota$1 syncPhoneRelationsUseCase$getSyncQuota$1;
        long jCurrentTimeMillis;
        long j;
        java.lang.Object objM7377constructorimpl;
        java.lang.Long phoneSyncQuota;
        if (continuation instanceof SyncPhoneRelationsUseCase$getSyncQuota$1) {
            syncPhoneRelationsUseCase$getSyncQuota$1 = (SyncPhoneRelationsUseCase$getSyncQuota$1) continuation;
            int i2 = syncPhoneRelationsUseCase$getSyncQuota$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncPhoneRelationsUseCase$getSyncQuota$1.label = i2 - Integer.MIN_VALUE;
            } else {
                syncPhoneRelationsUseCase$getSyncQuota$1 = new SyncPhoneRelationsUseCase$getSyncQuota$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = syncPhoneRelationsUseCase$getSyncQuota$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = syncPhoneRelationsUseCase$getSyncQuota$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                Result.Application application = Result.Companion;
                sSH ssh = this.KWHzl;
                syncPhoneRelationsUseCase$getSyncQuota$1.I$0 = i;
                syncPhoneRelationsUseCase$getSyncQuota$1.J$0 = jCurrentTimeMillis;
                syncPhoneRelationsUseCase$getSyncQuota$1.label = 1;
                objEZpvd = ssh.EZpvd(syncPhoneRelationsUseCase$getSyncQuota$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                j = jCurrentTimeMillis;
            } catch (java.lang.Throwable th) {
                th = th;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jCurrentTimeMillis;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = syncPhoneRelationsUseCase$getSyncQuota$1.J$0;
            i = syncPhoneRelationsUseCase$getSyncQuota$1.I$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (java.lang.Throwable th2) {
                th = th2;
                jCurrentTimeMillis = j;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jCurrentTimeMillis;
            }
        }
        com.okinc.okimcore.model.remote.UserInfo userInfo = (com.okinc.okimcore.model.remote.UserInfo) objEZpvd;
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl((userInfo == null || (phoneSyncQuota = userInfo.getPhoneSyncQuota()) == null) ? 0L : phoneSyncQuota.longValue()));
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("SyncPhoneRelationsUseCase", "[" + i + "] failed to get sync quota, " + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
        }
        java.lang.Long lKWHzl = C56443yFo.KWHzl(0L);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = lKWHzl;
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.KWHzl(((java.lang.Number) objM7377constructorimpl).longValue()), C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        long jLongValue = ((java.lang.Number) pairOLrzqt.component1()).longValue();
        pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i + "] get sync quota " + jLongValue + ", time cost=" + ((java.lang.Number) pairOLrzqt.component2()).longValue());
        return C56443yFo.KWHzl(jLongValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(int i, long j, Continuation<? super java.util.List<PhoneRelationEntity>> continuation) throws java.lang.Throwable {
        SyncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1 syncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1;
        long jCurrentTimeMillis;
        java.lang.Throwable th;
        int i2;
        long j2;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof SyncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1) {
            syncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1 = (SyncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1) continuation;
            int i3 = syncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                syncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1.label = i3 - Integer.MIN_VALUE;
            } else {
                syncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1 = new SyncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = syncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = syncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                Result.Application application = Result.Companion;
                C44515sSr c44515sSr = this.copydefault;
                syncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1.I$0 = i;
                syncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1.J$0 = jCurrentTimeMillis;
                syncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1.label = 1;
                objEZpvd = c44515sSr.EZpvd(j, syncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                i2 = i;
                j2 = jCurrentTimeMillis;
            } catch (java.lang.Throwable th2) {
                th = th2;
                i2 = i;
                j2 = jCurrentTimeMillis;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                java.util.List listAhwBna = yDY.AhwBna();
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) objM7377constructorimpl, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j2));
                java.util.List list = (java.util.List) pairOLrzqt.component1();
                long jLongValue = ((java.lang.Number) pairOLrzqt.component2()).longValue();
                pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i2 + "] get local relations available to sync, size=" + list.size() + ", time cost=" + jLongValue);
                return list;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = syncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1.J$0;
            i2 = syncPhoneRelationsUseCase$getLocalRelationsAvailableToSync$1.I$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        try {
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objEZpvd);
        } catch (java.lang.Throwable th4) {
            th = th4;
            jCurrentTimeMillis = j2;
            i = i2;
            i2 = i;
            j2 = jCurrentTimeMillis;
            Result.Application application222 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("SyncPhoneRelationsUseCase", "[" + i2 + "] failed to get local relations that available to sync, " + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
        }
        java.util.List listAhwBna2 = yDY.AhwBna();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = listAhwBna2;
        }
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt((java.util.List) objM7377constructorimpl, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j2));
        java.util.List list2 = (java.util.List) pairOLrzqt2.component1();
        long jLongValue2 = ((java.lang.Number) pairOLrzqt2.component2()).longValue();
        pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i2 + "] get local relations available to sync, size=" + list2.size() + ", time cost=" + jLongValue2);
        return list2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v17, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(int i, java.util.List<PhoneRelationEntity> list, Continuation<? super java.util.List<java.lang.String>> continuation) throws java.lang.Throwable {
        SyncPhoneRelationsUseCase$submitLocalRelationsToRemote$1 syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1;
        long jCurrentTimeMillis;
        Ref.ObjectRef objectRef;
        java.lang.Throwable th;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof SyncPhoneRelationsUseCase$submitLocalRelationsToRemote$1) {
            syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1 = (SyncPhoneRelationsUseCase$submitLocalRelationsToRemote$1) continuation;
            int i2 = syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1.label = i2 - Integer.MIN_VALUE;
            } else {
                syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1 = new SyncPhoneRelationsUseCase$submitLocalRelationsToRemote$1(this, continuation);
            }
        }
        java.lang.Object obj = syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                Result.Application application = Result.Companion;
                sSA ssa = this.djBIcL;
                syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1.L$0 = objectRef2;
                syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1.I$0 = i;
                syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1.J$0 = jCurrentTimeMillis;
                syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1.label = 1;
                java.lang.Object objOLrzqt = ssa.OLrzqt(list, syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                objectRef = objectRef2;
                obj = objOLrzqt;
            } catch (java.lang.Throwable th2) {
                th = th2;
                objectRef = objectRef2;
                th = th;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                java.util.List list2 = (java.util.List) objectRef.element;
                if (list2 != null) {
                }
                pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i + "] submit local relations time cost=" + (jCurrentTimeMillis2 - jCurrentTimeMillis) + ", rejectedRelationsSize=" + (list2 != null ? C56443yFo.AEQbTJ(list2.size()) : null));
                return objectRef.element;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1.J$0;
            int i4 = syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1.I$0;
            objectRef = (Ref.ObjectRef) syncPhoneRelationsUseCase$submitLocalRelationsToRemote$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                jCurrentTimeMillis = j;
                i = i4;
            } catch (java.lang.Throwable th3) {
                th = th3;
                jCurrentTimeMillis = j;
                i = i4;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        try {
            objM7377constructorimpl = Result.m7377constructorimpl((SyncRelationsResponse) obj);
        } catch (java.lang.Throwable th4) {
            th = th4;
            th = th;
            Result.Application application222 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            SyncRelationsResponse syncRelationsResponse = (SyncRelationsResponse) objM7377constructorimpl;
            if (syncRelationsResponse != null) {
                java.util.List<java.lang.String> rejected = syncRelationsResponse.getRejected();
                T tAhwBna = rejected;
                if (rejected == null) {
                    tAhwBna = yDY.AhwBna();
                }
                objectRef.element = tAhwBna;
            }
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            objectRef.element = null;
            pUU.copydefault("SyncPhoneRelationsUseCase", "[" + i + "] failed to submit local relations, " + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
        }
        long jCurrentTimeMillis22 = java.lang.System.currentTimeMillis();
        java.util.List list22 = (java.util.List) objectRef.element;
        pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i + "] submit local relations time cost=" + (jCurrentTimeMillis22 - jCurrentTimeMillis) + ", rejectedRelationsSize=" + (list22 != null ? C56443yFo.AEQbTJ(list22.size()) : null));
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(int i, java.util.List<PhoneRelationEntity> list, java.util.List<java.lang.String> list2, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SyncPhoneRelationsUseCase$markPhoneRelationsSynced$1 syncPhoneRelationsUseCase$markPhoneRelationsSynced$1;
        long jCurrentTimeMillis;
        java.lang.Throwable th;
        int i2;
        long j;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof SyncPhoneRelationsUseCase$markPhoneRelationsSynced$1) {
            syncPhoneRelationsUseCase$markPhoneRelationsSynced$1 = (SyncPhoneRelationsUseCase$markPhoneRelationsSynced$1) continuation;
            int i3 = syncPhoneRelationsUseCase$markPhoneRelationsSynced$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                syncPhoneRelationsUseCase$markPhoneRelationsSynced$1.label = i3 - Integer.MIN_VALUE;
            } else {
                syncPhoneRelationsUseCase$markPhoneRelationsSynced$1 = new SyncPhoneRelationsUseCase$markPhoneRelationsSynced$1(this, continuation);
            }
        }
        java.lang.Object obj = syncPhoneRelationsUseCase$markPhoneRelationsSynced$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = syncPhoneRelationsUseCase$markPhoneRelationsSynced$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                Result.Application application = Result.Companion;
                C44522sSy c44522sSy = this.AhwBna;
                syncPhoneRelationsUseCase$markPhoneRelationsSynced$1.I$0 = i;
                syncPhoneRelationsUseCase$markPhoneRelationsSynced$1.J$0 = jCurrentTimeMillis;
                syncPhoneRelationsUseCase$markPhoneRelationsSynced$1.label = 1;
                if (c44522sSy.OLrzqt(list, list2, syncPhoneRelationsUseCase$markPhoneRelationsSynced$1) == objCopydefault) {
                    return objCopydefault;
                }
                i2 = i;
                j = jCurrentTimeMillis;
            } catch (java.lang.Throwable th2) {
                th = th2;
                i2 = i;
                j = jCurrentTimeMillis;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i2 + "] mark local relations synced, time cost=" + (java.lang.System.currentTimeMillis() - j));
                return Unit.INSTANCE;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = syncPhoneRelationsUseCase$markPhoneRelationsSynced$1.J$0;
            i2 = syncPhoneRelationsUseCase$markPhoneRelationsSynced$1.I$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        try {
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th4) {
            th = th4;
            jCurrentTimeMillis = j;
            i = i2;
            i2 = i;
            j = jCurrentTimeMillis;
            Result.Application application222 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("SyncPhoneRelationsUseCase", "[" + i2 + "] failed to mark local relations synced, " + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
        }
        pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i2 + "] mark local relations synced, time cost=" + (java.lang.System.currentTimeMillis() - j));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(int i, java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SyncPhoneRelationsUseCase$updateSyncRejectTimestamp$1 syncPhoneRelationsUseCase$updateSyncRejectTimestamp$1;
        long jCurrentTimeMillis;
        java.lang.Throwable th;
        int i2;
        long j;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof SyncPhoneRelationsUseCase$updateSyncRejectTimestamp$1) {
            syncPhoneRelationsUseCase$updateSyncRejectTimestamp$1 = (SyncPhoneRelationsUseCase$updateSyncRejectTimestamp$1) continuation;
            int i3 = syncPhoneRelationsUseCase$updateSyncRejectTimestamp$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                syncPhoneRelationsUseCase$updateSyncRejectTimestamp$1.label = i3 - Integer.MIN_VALUE;
            } else {
                syncPhoneRelationsUseCase$updateSyncRejectTimestamp$1 = new SyncPhoneRelationsUseCase$updateSyncRejectTimestamp$1(this, continuation);
            }
        }
        java.lang.Object obj = syncPhoneRelationsUseCase$updateSyncRejectTimestamp$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = syncPhoneRelationsUseCase$updateSyncRejectTimestamp$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i + "] rejected=" + list);
            try {
                Result.Application application = Result.Companion;
                sSG ssg = this.valueOf;
                syncPhoneRelationsUseCase$updateSyncRejectTimestamp$1.I$0 = i;
                syncPhoneRelationsUseCase$updateSyncRejectTimestamp$1.J$0 = jCurrentTimeMillis;
                syncPhoneRelationsUseCase$updateSyncRejectTimestamp$1.label = 1;
                if (ssg.OLrzqt(list, syncPhoneRelationsUseCase$updateSyncRejectTimestamp$1) == objCopydefault) {
                    return objCopydefault;
                }
                i2 = i;
                j = jCurrentTimeMillis;
            } catch (java.lang.Throwable th2) {
                th = th2;
                i2 = i;
                j = jCurrentTimeMillis;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i2 + "] update sync rejected timestamp, time cost=" + (java.lang.System.currentTimeMillis() - j));
                return Unit.INSTANCE;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = syncPhoneRelationsUseCase$updateSyncRejectTimestamp$1.J$0;
            i2 = syncPhoneRelationsUseCase$updateSyncRejectTimestamp$1.I$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        try {
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th4) {
            th = th4;
            jCurrentTimeMillis = j;
            i = i2;
            i2 = i;
            j = jCurrentTimeMillis;
            Result.Application application222 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("SyncPhoneRelationsUseCase", "[" + i2 + "] failed to update sync rejected timestamp, " + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
        }
        pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i2 + "] update sync rejected timestamp, time cost=" + (java.lang.System.currentTimeMillis() - j));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SyncPhoneRelationsUseCase$execute$1 syncPhoneRelationsUseCase$execute$1;
        sSC ssc;
        int i;
        java.util.List<OsPhoneRelation> list;
        sSC ssc2;
        long jLongValue;
        java.util.List<PhoneRelationEntity> list2;
        java.util.List<PhoneRelationEntity> list3;
        sSC ssc3;
        java.util.List<java.lang.String> list4;
        java.util.List<java.lang.String> list5;
        if (continuation instanceof SyncPhoneRelationsUseCase$execute$1) {
            syncPhoneRelationsUseCase$execute$1 = (SyncPhoneRelationsUseCase$execute$1) continuation;
            int i2 = syncPhoneRelationsUseCase$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncPhoneRelationsUseCase$execute$1.label = i2 - Integer.MIN_VALUE;
            } else {
                syncPhoneRelationsUseCase$execute$1 = new SyncPhoneRelationsUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = syncPhoneRelationsUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (syncPhoneRelationsUseCase$execute$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objOLrzqt);
                int iOLrzqt = C44157sFk.OLrzqt();
                syncPhoneRelationsUseCase$execute$1.L$0 = this;
                syncPhoneRelationsUseCase$execute$1.I$0 = iOLrzqt;
                syncPhoneRelationsUseCase$execute$1.label = 1;
                java.lang.Object objCopydefault2 = copydefault(iOLrzqt, syncPhoneRelationsUseCase$execute$1);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                ssc = this;
                i = iOLrzqt;
                objOLrzqt = objCopydefault2;
                list = (java.util.List) objOLrzqt;
                syncPhoneRelationsUseCase$execute$1.L$0 = ssc;
                syncPhoneRelationsUseCase$execute$1.L$1 = list;
                syncPhoneRelationsUseCase$execute$1.I$0 = i;
                syncPhoneRelationsUseCase$execute$1.label = 2;
                if (ssc.OLrzqt(i, list, syncPhoneRelationsUseCase$execute$1) == objCopydefault) {
                    return objCopydefault;
                }
                syncPhoneRelationsUseCase$execute$1.L$0 = ssc;
                syncPhoneRelationsUseCase$execute$1.L$1 = null;
                syncPhoneRelationsUseCase$execute$1.I$0 = i;
                syncPhoneRelationsUseCase$execute$1.label = 3;
                if (ssc.EZpvd(i, list, syncPhoneRelationsUseCase$execute$1) == objCopydefault) {
                    return objCopydefault;
                }
                ssc2 = ssc;
                if (!ssc2.AEQbTJ(i)) {
                    return Unit.INSTANCE;
                }
                syncPhoneRelationsUseCase$execute$1.L$0 = ssc2;
                syncPhoneRelationsUseCase$execute$1.I$0 = i;
                syncPhoneRelationsUseCase$execute$1.label = 4;
                objOLrzqt = ssc2.OLrzqt(i, syncPhoneRelationsUseCase$execute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                if (((java.lang.Boolean) objOLrzqt).booleanValue()) {
                    return Unit.INSTANCE;
                }
                syncPhoneRelationsUseCase$execute$1.L$0 = ssc2;
                syncPhoneRelationsUseCase$execute$1.I$0 = i;
                syncPhoneRelationsUseCase$execute$1.label = 5;
                objOLrzqt = ssc2.KWHzl(i, syncPhoneRelationsUseCase$execute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                jLongValue = ((java.lang.Number) objOLrzqt).longValue();
                if (jLongValue > 0) {
                    return Unit.INSTANCE;
                }
                syncPhoneRelationsUseCase$execute$1.L$0 = ssc2;
                syncPhoneRelationsUseCase$execute$1.I$0 = i;
                syncPhoneRelationsUseCase$execute$1.label = 6;
                objOLrzqt = ssc2.copydefault(i, jLongValue, syncPhoneRelationsUseCase$execute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                list2 = (java.util.List) objOLrzqt;
                if (!list2.isEmpty()) {
                    return Unit.INSTANCE;
                }
                syncPhoneRelationsUseCase$execute$1.L$0 = ssc2;
                syncPhoneRelationsUseCase$execute$1.L$1 = list2;
                syncPhoneRelationsUseCase$execute$1.I$0 = i;
                syncPhoneRelationsUseCase$execute$1.label = 7;
                java.lang.Object objKWHzl = ssc2.KWHzl(i, list2, syncPhoneRelationsUseCase$execute$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                sSC ssc4 = ssc2;
                list3 = list2;
                objOLrzqt = objKWHzl;
                ssc3 = ssc4;
                list4 = (java.util.List) objOLrzqt;
                if (list4 != null) {
                    return Unit.INSTANCE;
                }
                syncPhoneRelationsUseCase$execute$1.L$0 = ssc3;
                syncPhoneRelationsUseCase$execute$1.L$1 = list4;
                syncPhoneRelationsUseCase$execute$1.I$0 = i;
                syncPhoneRelationsUseCase$execute$1.label = 8;
                if (ssc3.OLrzqt(i, list3, list4, syncPhoneRelationsUseCase$execute$1) == objCopydefault) {
                    return objCopydefault;
                }
                list5 = list4;
                syncPhoneRelationsUseCase$execute$1.L$0 = null;
                syncPhoneRelationsUseCase$execute$1.L$1 = null;
                syncPhoneRelationsUseCase$execute$1.label = 9;
                if (ssc3.copydefault(i, list5, syncPhoneRelationsUseCase$execute$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                i = syncPhoneRelationsUseCase$execute$1.I$0;
                sSC ssc5 = (sSC) syncPhoneRelationsUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                ssc = ssc5;
                list = (java.util.List) objOLrzqt;
                syncPhoneRelationsUseCase$execute$1.L$0 = ssc;
                syncPhoneRelationsUseCase$execute$1.L$1 = list;
                syncPhoneRelationsUseCase$execute$1.I$0 = i;
                syncPhoneRelationsUseCase$execute$1.label = 2;
                if (ssc.OLrzqt(i, list, syncPhoneRelationsUseCase$execute$1) == objCopydefault) {
                }
                syncPhoneRelationsUseCase$execute$1.L$0 = ssc;
                syncPhoneRelationsUseCase$execute$1.L$1 = null;
                syncPhoneRelationsUseCase$execute$1.I$0 = i;
                syncPhoneRelationsUseCase$execute$1.label = 3;
                if (ssc.EZpvd(i, list, syncPhoneRelationsUseCase$execute$1) == objCopydefault) {
                }
                break;
            case 2:
                i = syncPhoneRelationsUseCase$execute$1.I$0;
                list = (java.util.List) syncPhoneRelationsUseCase$execute$1.L$1;
                ssc = (sSC) syncPhoneRelationsUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                syncPhoneRelationsUseCase$execute$1.L$0 = ssc;
                syncPhoneRelationsUseCase$execute$1.L$1 = null;
                syncPhoneRelationsUseCase$execute$1.I$0 = i;
                syncPhoneRelationsUseCase$execute$1.label = 3;
                if (ssc.EZpvd(i, list, syncPhoneRelationsUseCase$execute$1) == objCopydefault) {
                }
                break;
            case 3:
                i = syncPhoneRelationsUseCase$execute$1.I$0;
                ssc2 = (sSC) syncPhoneRelationsUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                if (!ssc2.AEQbTJ(i)) {
                }
                break;
            case 4:
                i = syncPhoneRelationsUseCase$execute$1.I$0;
                ssc2 = (sSC) syncPhoneRelationsUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                if (((java.lang.Boolean) objOLrzqt).booleanValue()) {
                }
                break;
            case 5:
                i = syncPhoneRelationsUseCase$execute$1.I$0;
                ssc2 = (sSC) syncPhoneRelationsUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                jLongValue = ((java.lang.Number) objOLrzqt).longValue();
                if (jLongValue > 0) {
                }
                break;
            case 6:
                i = syncPhoneRelationsUseCase$execute$1.I$0;
                ssc2 = (sSC) syncPhoneRelationsUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                list2 = (java.util.List) objOLrzqt;
                if (!list2.isEmpty()) {
                }
                break;
            case 7:
                i = syncPhoneRelationsUseCase$execute$1.I$0;
                list3 = (java.util.List) syncPhoneRelationsUseCase$execute$1.L$1;
                ssc3 = (sSC) syncPhoneRelationsUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                list4 = (java.util.List) objOLrzqt;
                if (list4 != null) {
                }
                break;
            case 8:
                i = syncPhoneRelationsUseCase$execute$1.I$0;
                list5 = (java.util.List) syncPhoneRelationsUseCase$execute$1.L$1;
                ssc3 = (sSC) syncPhoneRelationsUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                syncPhoneRelationsUseCase$execute$1.L$0 = null;
                syncPhoneRelationsUseCase$execute$1.L$1 = null;
                syncPhoneRelationsUseCase$execute$1.label = 9;
                if (ssc3.copydefault(i, list5, syncPhoneRelationsUseCase$execute$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 9:
                C56391yDq.AEQbTJ(objOLrzqt);
                return Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final boolean AEQbTJ(int i) {
        java.lang.Object objM7377constructorimpl;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(this.OLrzqt.copydefault()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("SyncPhoneRelationsUseCase", "[" + i + "] failed to check whether is rejected by remote today, " + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(java.lang.Boolean.valueOf(((java.lang.Boolean) objM7377constructorimpl).booleanValue()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        boolean zBooleanValue = ((java.lang.Boolean) pairOLrzqt.component1()).booleanValue();
        pUU.KWHzl("SyncPhoneRelationsUseCase", "[" + i + "] check whether is rejected by remote today, result=" + zBooleanValue + ", time cost=" + ((java.lang.Number) pairOLrzqt.component2()).longValue());
        return zBooleanValue;
    }
}
