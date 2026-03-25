package o;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$deleteAll$1;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$deleteAllNotInHashes$1;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$getPhoneRelations$1;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$getPhoneRelationsByHashes$1;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$getPhoneRelationsByHashes$2;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$getPhoneRelationsByHashesAsFlow$$inlined$map$1$2$1;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$getPhoneRelationsCount$1;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$1;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$2;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashesAsFlow$$inlined$map$1$2$1;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$insertAllOrIgnore$1;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$insertAllOrReplace$1;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityRepository$updateAll$1;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationUpdateEntity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sMw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44358sMw implements PhoneRelationEntityDao {
    public final sIC KWHzl;

    @yCM
    public C44358sMw(@NotNull sIC sic) {
        Intrinsics.checkNotNullParameter(sic, "");
        this.KWHzl = sic;
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao, com.okinc.okimcore.common.database.BaseDao
    public java.lang.String getDaoName() {
        return PhoneRelationEntityDao.Activity.OLrzqt(this);
    }

    public final PhoneRelationEntityDao EZpvd() {
        return this.KWHzl.copydefault().AkhnZx();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v39, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a A[Catch: all -> 0x004a, TryCatch #10 {all -> 0x004a, blocks: (B:13:0x0042, B:37:0x00ec, B:51:0x011d, B:52:0x0120, B:55:0x0124, B:57:0x012a, B:59:0x0136, B:60:0x0139, B:61:0x013a, B:62:0x013d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #9 {all -> 0x0189, blocks: (B:66:0x0146, B:68:0x0153), top: B:86:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0176 -> B:72:0x0178). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x017d -> B:73:0x017b). Please report as a decompilation issue!!! */
    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object getPhoneRelations(@NotNull Continuation<? super java.util.List<PhoneRelationEntity>> continuation) throws java.lang.Exception {
        PhoneRelationEntityRepository$getPhoneRelations$1 phoneRelationEntityRepository$getPhoneRelations$1;
        C44358sMw c44358sMw;
        BaseDao baseDao;
        Ref.LongRef longRef;
        Ref.ObjectRef objectRef;
        C44358sMw c44358sMw2;
        Ref.LongRef longRef2;
        int i;
        int i2;
        C44358sMw c44358sMw3;
        int i3;
        Ref.ObjectRef objectRef2;
        int i4;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        BaseDao baseDao2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.LongRef longRef3;
        long jNanoTime;
        int i5;
        int i6;
        T t;
        if (continuation instanceof PhoneRelationEntityRepository$getPhoneRelations$1) {
            phoneRelationEntityRepository$getPhoneRelations$1 = (PhoneRelationEntityRepository$getPhoneRelations$1) continuation;
            int i7 = phoneRelationEntityRepository$getPhoneRelations$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                phoneRelationEntityRepository$getPhoneRelations$1.label = i7 - Integer.MIN_VALUE;
                c44358sMw = this;
            } else {
                c44358sMw = this;
                phoneRelationEntityRepository$getPhoneRelations$1 = new PhoneRelationEntityRepository$getPhoneRelations$1(c44358sMw, continuation);
            }
        }
        java.lang.Object obj = phoneRelationEntityRepository$getPhoneRelations$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = phoneRelationEntityRepository$getPhoneRelations$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = phoneRelationEntityRepository$getPhoneRelations$1.J$0;
                    i2 = phoneRelationEntityRepository$getPhoneRelations$1.I$2;
                    i3 = phoneRelationEntityRepository$getPhoneRelations$1.I$1;
                    int i9 = phoneRelationEntityRepository$getPhoneRelations$1.I$0;
                    objectRef4 = (Ref.ObjectRef) phoneRelationEntityRepository$getPhoneRelations$1.L$6;
                    longRef2 = (Ref.LongRef) phoneRelationEntityRepository$getPhoneRelations$1.L$5;
                    objectRef3 = (Ref.ObjectRef) phoneRelationEntityRepository$getPhoneRelations$1.L$4;
                    objectRef = (Ref.ObjectRef) phoneRelationEntityRepository$getPhoneRelations$1.L$3;
                    longRef = (Ref.LongRef) phoneRelationEntityRepository$getPhoneRelations$1.L$2;
                    baseDao = (BaseDao) phoneRelationEntityRepository$getPhoneRelations$1.L$1;
                    c44358sMw2 = (C44358sMw) phoneRelationEntityRepository$getPhoneRelations$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef3 = longRef;
                        i6 = i3;
                        baseDao2 = baseDao;
                        i5 = i9;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        objectRef2 = objectRef;
                        longRef2 = longRef;
                        c44358sMw3 = c44358sMw2;
                        i4 = i9;
                        sQLiteDatabaseLockedException = e3;
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                        }
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef4.element = t;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return t2;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = phoneRelationEntityRepository$getPhoneRelations$1.I$1;
                i4 = phoneRelationEntityRepository$getPhoneRelations$1.I$0;
                objectRef2 = (Ref.ObjectRef) phoneRelationEntityRepository$getPhoneRelations$1.L$3;
                Ref.LongRef longRef4 = (Ref.LongRef) phoneRelationEntityRepository$getPhoneRelations$1.L$2;
                baseDao2 = (BaseDao) phoneRelationEntityRepository$getPhoneRelations$1.L$1;
                c44358sMw3 = (C44358sMw) phoneRelationEntityRepository$getPhoneRelations$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef2;
                longRef2 = longRef4;
                i3 = i10;
                i2 = i3 + 1;
                baseDao = baseDao2;
                c44358sMw2 = c44358sMw3;
                i = i4;
                if (i2 >= i) {
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                        try {
                            i3 = i2;
                            objectRef2 = objectRef;
                            c44358sMw3 = c44358sMw2;
                            i4 = i;
                            sQLiteDatabaseLockedException = e6;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i2 < i4 - 1) {
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            Ref.LongRef longRef5 = longRef2;
                            longRef = longRef5;
                            baseDao = baseDao2;
                            C44159sFm.EZpvd(baseDao, longRef.element);
                            throw th;
                        }
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        longRef = longRef2;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef4 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    PhoneRelationEntityDao phoneRelationEntityDaoEZpvd = c44358sMw2.EZpvd();
                    phoneRelationEntityRepository$getPhoneRelations$1.L$0 = c44358sMw2;
                    phoneRelationEntityRepository$getPhoneRelations$1.L$1 = baseDao;
                    phoneRelationEntityRepository$getPhoneRelations$1.L$2 = longRef2;
                    phoneRelationEntityRepository$getPhoneRelations$1.L$3 = objectRef;
                    phoneRelationEntityRepository$getPhoneRelations$1.L$4 = objectRef4;
                    phoneRelationEntityRepository$getPhoneRelations$1.L$5 = longRef2;
                    phoneRelationEntityRepository$getPhoneRelations$1.L$6 = objectRef4;
                    phoneRelationEntityRepository$getPhoneRelations$1.I$0 = i;
                    phoneRelationEntityRepository$getPhoneRelations$1.I$1 = i2;
                    phoneRelationEntityRepository$getPhoneRelations$1.I$2 = i2;
                    phoneRelationEntityRepository$getPhoneRelations$1.J$0 = jNanoTime;
                    phoneRelationEntityRepository$getPhoneRelations$1.label = 1;
                    java.lang.Object phoneRelations = phoneRelationEntityDaoEZpvd.getPhoneRelations(phoneRelationEntityRepository$getPhoneRelations$1);
                    if (phoneRelations == objCopydefault) {
                        return objCopydefault;
                    }
                    i6 = i2;
                    objectRef3 = objectRef4;
                    longRef3 = longRef2;
                    int i11 = i;
                    baseDao2 = baseDao;
                    i5 = i11;
                    t = phoneRelations;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        objectRef2 = objectRef;
                        i4 = i5;
                        c44358sMw3 = c44358sMw2;
                        longRef2 = longRef3;
                        i3 = i6;
                        r0 = e9;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                            phoneRelationEntityRepository$getPhoneRelations$1.L$0 = c44358sMw3;
                            phoneRelationEntityRepository$getPhoneRelations$1.L$1 = baseDao2;
                            phoneRelationEntityRepository$getPhoneRelations$1.L$2 = longRef2;
                            phoneRelationEntityRepository$getPhoneRelations$1.L$3 = objectRef2;
                            phoneRelationEntityRepository$getPhoneRelations$1.L$4 = null;
                            phoneRelationEntityRepository$getPhoneRelations$1.L$5 = null;
                            phoneRelationEntityRepository$getPhoneRelations$1.L$6 = null;
                            phoneRelationEntityRepository$getPhoneRelations$1.I$0 = i4;
                            phoneRelationEntityRepository$getPhoneRelations$1.I$1 = i3;
                            phoneRelationEntityRepository$getPhoneRelations$1.label = 2;
                            if (DelayKt.delay(((long) (i2 + 1)) * 50, phoneRelationEntityRepository$getPhoneRelations$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            i10 = i3;
                            longRef4 = longRef2;
                            objectRef = objectRef2;
                            longRef2 = longRef4;
                            i3 = i10;
                            i2 = i3 + 1;
                            baseDao = baseDao2;
                            c44358sMw2 = c44358sMw3;
                            i = i4;
                            if (i2 >= i) {
                            }
                        } else {
                            objectRef = objectRef2;
                            i2 = i3 + 1;
                            baseDao = baseDao2;
                            c44358sMw2 = c44358sMw3;
                            i = i4;
                            if (i2 >= i) {
                            }
                        }
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e10) {
                        e2 = e10;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e11) {
                        e = e11;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef4.element = t;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDao, longRef2.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            PhoneRelationEntityDao phoneRelationEntityDaoEZpvd2 = EZpvd();
            Ref.LongRef longRef6 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            baseDao = phoneRelationEntityDaoEZpvd2;
            c44358sMw2 = c44358sMw;
            longRef2 = longRef6;
            i = 3;
            i2 = 0;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object getPhoneRelationsByHashes(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super java.util.List<PhoneRelationEntity>> continuation) throws java.lang.Throwable {
        PhoneRelationEntityRepository$getPhoneRelationsByHashes$1 phoneRelationEntityRepository$getPhoneRelationsByHashes$1;
        if (continuation instanceof PhoneRelationEntityRepository$getPhoneRelationsByHashes$1) {
            phoneRelationEntityRepository$getPhoneRelationsByHashes$1 = (PhoneRelationEntityRepository$getPhoneRelationsByHashes$1) continuation;
            int i = phoneRelationEntityRepository$getPhoneRelationsByHashes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                phoneRelationEntityRepository$getPhoneRelationsByHashes$1.label = i - Integer.MIN_VALUE;
            } else {
                phoneRelationEntityRepository$getPhoneRelationsByHashes$1 = new PhoneRelationEntityRepository$getPhoneRelationsByHashes$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = phoneRelationEntityRepository$getPhoneRelationsByHashes$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = phoneRelationEntityRepository$getPhoneRelationsByHashes$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            PhoneRelationEntityRepository$getPhoneRelationsByHashes$2 phoneRelationEntityRepository$getPhoneRelationsByHashes$2 = new PhoneRelationEntityRepository$getPhoneRelationsByHashes$2(this, null);
            phoneRelationEntityRepository$getPhoneRelationsByHashes$1.label = 1;
            objOLrzqt = sSU.OLrzqt(set, phoneRelationEntityRepository$getPhoneRelationsByHashes$2, phoneRelationEntityRepository$getPhoneRelationsByHashes$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return CollectionsKt___CollectionsKt.EZpvd((java.lang.Iterable) objOLrzqt, new StateListAnimator());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v39, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v40, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x019f: MOVE (r8 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:73:0x019f */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01a0: MOVE (r2 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:73:0x019f */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143 A[Catch: all -> 0x0134, TryCatch #0 {all -> 0x0134, blocks: (B:13:0x0044, B:30:0x00c5, B:51:0x0138, B:52:0x013b, B:54:0x013d, B:56:0x0143, B:58:0x014f, B:59:0x0152, B:60:0x0153, B:61:0x0156, B:65:0x015e, B:67:0x016b), top: B:81:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #0 {all -> 0x0134, blocks: (B:13:0x0044, B:30:0x00c5, B:51:0x0138, B:52:0x013b, B:54:0x013d, B:56:0x0143, B:58:0x014f, B:59:0x0152, B:60:0x0153, B:61:0x0156, B:65:0x015e, B:67:0x016b), top: B:81:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x018e -> B:70:0x0191). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0194 -> B:70:0x0191). Please report as a decompilation issue!!! */
    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object getPhoneRelationsNotSyncYet(long j, @NotNull Continuation<? super java.util.List<PhoneRelationEntity>> continuation) throws java.lang.Exception {
        PhoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1 phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        C44358sMw c44358sMw;
        BaseDao baseDaoEZpvd;
        Ref.LongRef longRef3;
        int i;
        int i2;
        Ref.ObjectRef objectRef;
        PhoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1 phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12;
        long j2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        int i3;
        long j3;
        int i4;
        ?? r0;
        C44358sMw c44358sMw2;
        long j4;
        int i5;
        Ref.ObjectRef objectRef2;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        PhoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1 phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$13;
        long jNanoTime;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef4;
        T t;
        if (continuation instanceof PhoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1) {
            phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1 = (PhoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1) continuation;
            int i7 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.label = i7 - Integer.MIN_VALUE;
            } else {
                phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1 = new PhoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1(this, continuation);
            }
        }
        java.lang.Object obj = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.J$1;
                    i6 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.I$2;
                    i5 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.I$1;
                    i3 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.I$0;
                    long j5 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.J$0;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$6;
                    longRef4 = (Ref.LongRef) phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$5;
                    objectRef3 = (Ref.ObjectRef) phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$4;
                    objectRef2 = (Ref.ObjectRef) phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$3;
                    longRef2 = (Ref.LongRef) phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$2;
                    BaseDao baseDao3 = (BaseDao) phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$1;
                    C44358sMw c44358sMw3 = (C44358sMw) phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        baseDao2 = baseDao3;
                        phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$13 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1;
                        objectRef4 = objectRef5;
                        j4 = j5;
                        longRef3 = longRef2;
                        c44358sMw = c44358sMw3;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        j4 = j5;
                        longRef3 = longRef2;
                        c44358sMw = c44358sMw3;
                        baseDao2 = baseDao3;
                        sQLiteDatabaseLockedException = e3;
                        objectRef = objectRef2;
                        i2 = i6;
                        i4 = i5;
                        j3 = j4;
                        baseDaoEZpvd = baseDao2;
                        r0 = sQLiteDatabaseLockedException;
                        c44358sMw2 = c44358sMw;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                        objectRef.element = r0;
                        if (i2 < i3 - 1) {
                        }
                        i = i3;
                        i2 = i4 + 1;
                        phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1;
                        j2 = j3;
                        c44358sMw = c44358sMw2;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        baseDao2 = baseDao3;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef4.element = t;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return t2;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.I$1;
                int i9 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.I$0;
                j3 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.J$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$3;
                longRef3 = (Ref.LongRef) phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$2;
                baseDaoEZpvd = (BaseDao) phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$1;
                c44358sMw2 = (C44358sMw) phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef6;
                i3 = i9;
                i = i3;
                i2 = i4 + 1;
                phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1;
                j2 = j3;
                c44358sMw = c44358sMw2;
                if (i2 < i) {
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                        j3 = j2;
                        phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12;
                        i3 = i;
                        i4 = i2;
                        r0 = e6;
                        c44358sMw2 = c44358sMw;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                        objectRef.element = r0;
                        if (i2 < i3 - 1) {
                            phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$0 = c44358sMw2;
                            phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$1 = baseDaoEZpvd;
                            phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$2 = longRef3;
                            phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$3 = objectRef;
                            phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$4 = null;
                            phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$5 = null;
                            phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.L$6 = null;
                            phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.J$0 = j3;
                            phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.I$0 = i3;
                            phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.I$1 = i4;
                            phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1.label = 2;
                            if (DelayKt.delay(((long) (i2 + 1)) * 50, phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        i = i3;
                        i2 = i4 + 1;
                        phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1;
                        j2 = j3;
                        c44358sMw = c44358sMw2;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    PhoneRelationEntityDao phoneRelationEntityDaoEZpvd = c44358sMw.EZpvd();
                    phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12.L$0 = c44358sMw;
                    phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12.L$1 = baseDaoEZpvd;
                    phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12.L$2 = longRef3;
                    phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12.L$3 = objectRef;
                    phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12.L$4 = objectRef7;
                    phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12.L$5 = longRef3;
                    phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12.L$6 = objectRef7;
                    phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12.J$0 = j2;
                    phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12.I$0 = i;
                    phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12.I$1 = i2;
                    phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12.I$2 = i2;
                    phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12.J$1 = jNanoTime;
                    phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12.label = 1;
                    java.lang.Object phoneRelationsNotSyncYet = phoneRelationEntityDaoEZpvd.getPhoneRelationsNotSyncYet(j2, phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12);
                    if (phoneRelationsNotSyncYet == objCopydefault) {
                        return objCopydefault;
                    }
                    phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$13 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12;
                    i3 = i;
                    i6 = i2;
                    i5 = i6;
                    objectRef3 = objectRef7;
                    objectRef2 = objectRef;
                    longRef4 = longRef3;
                    baseDao2 = baseDaoEZpvd;
                    j4 = j2;
                    objectRef4 = objectRef3;
                    t = phoneRelationsNotSyncYet;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$13;
                        sQLiteDatabaseLockedException = e9;
                        objectRef = objectRef2;
                        i2 = i6;
                        i4 = i5;
                        j3 = j4;
                        baseDaoEZpvd = baseDao2;
                        r0 = sQLiteDatabaseLockedException;
                        c44358sMw2 = c44358sMw;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                        objectRef.element = r0;
                        if (i2 < i3 - 1) {
                        }
                        i = i3;
                        i2 = i4 + 1;
                        phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1;
                        j2 = j3;
                        c44358sMw = c44358sMw2;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e10) {
                        e2 = e10;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e11) {
                        e = e11;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        longRef2 = longRef3;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef4.element = t;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDaoEZpvd, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            c44358sMw = this;
            baseDaoEZpvd = EZpvd();
            longRef3 = new Ref.LongRef();
            i = 3;
            i2 = 0;
            objectRef = new Ref.ObjectRef();
            phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$12 = phoneRelationEntityRepository$getPhoneRelationsNotSyncYet$1;
            j2 = j;
            if (i2 < i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object getPhoneRelationsNoOkxRelationByHashes(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super java.util.List<PhoneRelationEntity>> continuation) throws java.lang.Throwable {
        PhoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$1 phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$1;
        if (continuation instanceof PhoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$1) {
            phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$1 = (PhoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$1) continuation;
            int i = phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$1.label = i - Integer.MIN_VALUE;
            } else {
                phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$1 = new PhoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            PhoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$2 phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$2 = new PhoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$2(this, null);
            phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$1.label = 1;
            objOLrzqt = sSU.OLrzqt(set, phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$2, phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashes$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return CollectionsKt___CollectionsKt.EZpvd((java.lang.Iterable) objOLrzqt, new Application());
    }

    /* JADX DEBUG: Duplicate block (B:71:0x019a) to fix multi-entry loop: BACK_EDGE: B:71:0x019a -> B:72:0x01a1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v40, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v41, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01a7: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:73:0x01a7 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x01a8: MOVE (r8 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:73:0x01a7 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148 A[Catch: all -> 0x0053, TryCatch #4 {all -> 0x0053, blocks: (B:13:0x0044, B:36:0x0102, B:50:0x013b, B:51:0x013e, B:54:0x0142, B:56:0x0148, B:58:0x0154, B:59:0x0157, B:60:0x0158, B:61:0x015b, B:65:0x0166, B:67:0x0173), top: B:81:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #4 {all -> 0x0053, blocks: (B:13:0x0044, B:36:0x0102, B:50:0x013b, B:51:0x013e, B:54:0x0142, B:56:0x0148, B:58:0x0154, B:59:0x0157, B:60:0x0158, B:61:0x015b, B:65:0x0166, B:67:0x0173), top: B:81:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object getRandomPhoneRelationsNoOkxRelation(int i, @NotNull Continuation<? super java.util.List<PhoneRelationEntity>> continuation) throws java.lang.Exception {
        PhoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1 phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoEZpvd;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i2;
        int i3;
        C44358sMw c44358sMw;
        PhoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1 phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12;
        int i4;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        C44358sMw c44358sMw2;
        BaseDao baseDao2;
        Ref.LongRef longRef4;
        int i5;
        int i6;
        int i7;
        int i8;
        ?? r0;
        Ref.ObjectRef objectRef2;
        long jNanoTime;
        int i9;
        Ref.ObjectRef objectRef3;
        C44358sMw c44358sMw3;
        T t;
        if (continuation instanceof PhoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1) {
            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1 = (PhoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1) continuation;
            int i10 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.label = i10 - Integer.MIN_VALUE;
            } else {
                phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1 = new PhoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1(this, continuation);
            }
        }
        java.lang.Object obj = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i11 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    jNanoTime = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.J$0;
                    i8 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.I$3;
                    i5 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.I$2;
                    int i12 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.I$1;
                    int i13 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.I$0;
                    objectRef2 = (Ref.ObjectRef) phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$6;
                    longRef3 = (Ref.LongRef) phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$5;
                    objectRef3 = (Ref.ObjectRef) phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$4;
                    objectRef = (Ref.ObjectRef) phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$3;
                    longRef2 = (Ref.LongRef) phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$2;
                    baseDaoEZpvd = (BaseDao) phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$1;
                    c44358sMw3 = (C44358sMw) phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i9 = i12;
                        baseDao2 = baseDaoEZpvd;
                        i7 = i13;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        c44358sMw2 = c44358sMw3;
                        i6 = i12;
                        longRef4 = longRef2;
                        baseDao2 = baseDaoEZpvd;
                        i7 = i13;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                        objectRef.element = r0;
                        if (i8 < i6 - 1) {
                        }
                        phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1;
                        i3 = i + i;
                        c44358sMw = c44358sMw2;
                        if (i3 < i2) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                        throw th;
                    }
                    objectRef2.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return CollectionsKt___CollectionsKt.EZpvd((java.lang.Iterable) t2, new FragmentManager());
                }
                if (i11 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i14 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.I$2;
                int i15 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.I$1;
                int i16 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.I$0;
                Ref.ObjectRef objectRef4 = (Ref.ObjectRef) phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$3;
                Ref.LongRef longRef5 = (Ref.LongRef) phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$2;
                BaseDao baseDao3 = (BaseDao) phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$1;
                c44358sMw2 = (C44358sMw) phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$0;
                C56391yDq.AEQbTJ(obj);
                PhoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1 phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$13 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1;
                int i17 = 1;
                i4 = i16;
                longRef3 = longRef5;
                baseDaoEZpvd = baseDao3;
                i2 = i15;
                objectRef = objectRef4;
                phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$13;
                i3 = i14 + i17;
                c44358sMw = c44358sMw2;
                if (i3 < i2) {
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                        c44358sMw2 = c44358sMw;
                        i8 = i3;
                        i5 = i8;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i2;
                        longRef4 = longRef3;
                        i7 = i4;
                        phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12;
                        r0 = e6;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                        objectRef.element = r0;
                        if (i8 < i6 - 1) {
                        }
                        phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$13;
                        i3 = i14 + i17;
                        c44358sMw = c44358sMw2;
                        if (i3 < i2) {
                        }
                    } catch (java.lang.IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        longRef2 = longRef3;
                        C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                        throw th;
                    }
                    objectRef2 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    PhoneRelationEntityDao phoneRelationEntityDaoEZpvd = c44358sMw.EZpvd();
                    phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12.L$0 = c44358sMw;
                    phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12.L$1 = baseDaoEZpvd;
                    phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12.L$2 = longRef3;
                    phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12.L$3 = objectRef;
                    phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12.L$4 = objectRef2;
                    phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12.L$5 = longRef3;
                    phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12.L$6 = objectRef2;
                    phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12.I$0 = i4;
                    phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12.I$1 = i2;
                    phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12.I$2 = i3;
                    phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12.I$3 = i3;
                    phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12.J$0 = jNanoTime;
                    phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12.label = 1;
                    java.lang.Object randomPhoneRelationsNoOkxRelation = phoneRelationEntityDaoEZpvd.getRandomPhoneRelationsNoOkxRelation(i4, phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12);
                    if (randomPhoneRelationsNoOkxRelation == objCopydefault) {
                        return objCopydefault;
                    }
                    i5 = i3;
                    baseDao2 = baseDaoEZpvd;
                    i9 = i2;
                    longRef4 = longRef3;
                    i7 = i4;
                    phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12;
                    c44358sMw3 = c44358sMw;
                    i8 = i5;
                    objectRef3 = objectRef2;
                    t = randomPhoneRelationsNoOkxRelation;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        c44358sMw2 = c44358sMw3;
                        i6 = i9;
                        r0 = e9;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                        objectRef.element = r0;
                        if (i8 < i6 - 1) {
                            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$0 = c44358sMw2;
                            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$1 = baseDao2;
                            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$2 = longRef4;
                            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$3 = objectRef;
                            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$4 = null;
                            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$5 = null;
                            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.L$6 = null;
                            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.I$0 = i7;
                            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.I$1 = i6;
                            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.I$2 = i5;
                            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1.label = 2;
                            if (DelayKt.delay(((long) (i8 + 1)) * 50, phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$13 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1;
                            i4 = i7;
                            i14 = i5;
                            longRef3 = longRef4;
                            baseDaoEZpvd = baseDao2;
                            i17 = 1;
                            i2 = i6;
                        } else {
                            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$13 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1;
                            i4 = i7;
                            i14 = i5;
                            longRef3 = longRef4;
                            baseDaoEZpvd = baseDao2;
                            i17 = 1;
                            i2 = i6;
                        }
                        phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$13;
                        i3 = i14 + i17;
                        c44358sMw = c44358sMw2;
                        if (i3 < i2) {
                        }
                    } catch (java.lang.IllegalStateException e10) {
                        e2 = e10;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e11) {
                        e = e11;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef2.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return CollectionsKt___CollectionsKt.EZpvd((java.lang.Iterable) t22, new FragmentManager());
                }
                C44159sFm.EZpvd(baseDaoEZpvd, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i2 + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoEZpvd = EZpvd();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i2 = 3;
            i3 = 0;
            c44358sMw = this;
            phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$12 = phoneRelationEntityRepository$getRandomPhoneRelationsNoOkxRelation$1;
            i4 = i;
            if (i3 < i2) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoEZpvd = baseDao;
        }
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    public Flow<java.util.List<PhoneRelationEntity>> getPhoneRelationsByHashesAsFlow(@NotNull java.util.Set<java.lang.String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        return new ActionBar(sSU.OLrzqt(set, new Function1() { // from class: o.sMy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44358sMw.copydefault(this.copydefault, (java.util.Set) obj);
            }
        }));
    }

    public static final Flow copydefault(C44358sMw c44358sMw, java.util.Set set) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(set, "");
        PhoneRelationEntityDao phoneRelationEntityDaoEZpvd = c44358sMw.EZpvd();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                try {
                    try {
                        long jNanoTime = java.lang.System.nanoTime();
                        Flow<java.util.List<PhoneRelationEntity>> phoneRelationsByHashesAsFlow = c44358sMw.EZpvd().getPhoneRelationsByHashesAsFlow(set);
                        long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        longRef.element = jValueOf;
                        C44159sFm.EZpvd(phoneRelationEntityDaoEZpvd, jValueOf);
                        return phoneRelationsByHashesAsFlow;
                    } catch (java.lang.IllegalStateException e) {
                        java.lang.String message = e.getMessage();
                        if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e);
                            throw e;
                        }
                        C44159sFm.copydefault(e);
                        throw e;
                    }
                } catch (java.lang.Exception e2) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                try {
                    C44159sFm.copydefault(e3, exc);
                    i++;
                    exc = e3;
                } finally {
                    C44159sFm.EZpvd(phoneRelationEntityDaoEZpvd, longRef.element);
                }
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    public Flow<java.util.List<PhoneRelationEntity>> getPhoneRelationsNoOkxRelationByHashesAsFlow(@NotNull java.util.Set<java.lang.String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        return new TaskDescription(sSU.OLrzqt(set, new Function1() { // from class: o.sMx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44358sMw.AEQbTJ(this.OLrzqt, (java.util.Set) obj);
            }
        }));
    }

    public static final Flow AEQbTJ(C44358sMw c44358sMw, java.util.Set set) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(set, "");
        PhoneRelationEntityDao phoneRelationEntityDaoEZpvd = c44358sMw.EZpvd();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                try {
                    try {
                        long jNanoTime = java.lang.System.nanoTime();
                        Flow<java.util.List<PhoneRelationEntity>> phoneRelationsNoOkxRelationByHashesAsFlow = c44358sMw.EZpvd().getPhoneRelationsNoOkxRelationByHashesAsFlow(set);
                        long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        longRef.element = jValueOf;
                        C44159sFm.EZpvd(phoneRelationEntityDaoEZpvd, jValueOf);
                        return phoneRelationsNoOkxRelationByHashesAsFlow;
                    } catch (java.lang.IllegalStateException e) {
                        java.lang.String message = e.getMessage();
                        if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e);
                            throw e;
                        }
                        C44159sFm.copydefault(e);
                        throw e;
                    }
                } catch (java.lang.Exception e2) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                try {
                    C44159sFm.copydefault(e3, exc);
                    i++;
                    exc = e3;
                } finally {
                    C44159sFm.EZpvd(phoneRelationEntityDaoEZpvd, longRef.element);
                }
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    public Flow<java.util.List<PhoneRelationEntity>> getRandomPhoneRelationsNoOkxRelationAsFlow(int i) throws java.lang.Exception {
        PhoneRelationEntityDao phoneRelationEntityDaoEZpvd = EZpvd();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i2 = 0;
        while (i2 < 3) {
            try {
                try {
                    try {
                        long jNanoTime = java.lang.System.nanoTime();
                        Flow<java.util.List<PhoneRelationEntity>> randomPhoneRelationsNoOkxRelationAsFlow = EZpvd().getRandomPhoneRelationsNoOkxRelationAsFlow(i);
                        long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        longRef.element = jValueOf;
                        C44159sFm.EZpvd(phoneRelationEntityDaoEZpvd, jValueOf);
                        return randomPhoneRelationsNoOkxRelationAsFlow;
                    } catch (java.lang.Exception e) {
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e2) {
                    try {
                        C44159sFm.copydefault(e2, exc);
                        i2++;
                        exc = e2;
                    } finally {
                        C44159sFm.EZpvd(phoneRelationEntityDaoEZpvd, longRef.element);
                    }
                }
            } catch (java.lang.IllegalStateException e3) {
                java.lang.String message = e3.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e3);
                    throw e3;
                }
                C44159sFm.copydefault(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v39, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a A[Catch: all -> 0x004a, TryCatch #10 {all -> 0x004a, blocks: (B:13:0x0042, B:37:0x00ec, B:51:0x011d, B:52:0x0120, B:55:0x0124, B:57:0x012a, B:59:0x0136, B:60:0x0139, B:61:0x013a, B:62:0x013d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #9 {all -> 0x0189, blocks: (B:66:0x0146, B:68:0x0153), top: B:86:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0176 -> B:72:0x0178). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x017d -> B:73:0x017b). Please report as a decompilation issue!!! */
    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object getPhoneRelationsCount(@NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Exception {
        PhoneRelationEntityRepository$getPhoneRelationsCount$1 phoneRelationEntityRepository$getPhoneRelationsCount$1;
        C44358sMw c44358sMw;
        BaseDao baseDao;
        Ref.LongRef longRef;
        Ref.ObjectRef objectRef;
        C44358sMw c44358sMw2;
        Ref.LongRef longRef2;
        int i;
        int i2;
        C44358sMw c44358sMw3;
        int i3;
        Ref.ObjectRef objectRef2;
        int i4;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        BaseDao baseDao2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.LongRef longRef3;
        long jNanoTime;
        int i5;
        int i6;
        T t;
        if (continuation instanceof PhoneRelationEntityRepository$getPhoneRelationsCount$1) {
            phoneRelationEntityRepository$getPhoneRelationsCount$1 = (PhoneRelationEntityRepository$getPhoneRelationsCount$1) continuation;
            int i7 = phoneRelationEntityRepository$getPhoneRelationsCount$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                phoneRelationEntityRepository$getPhoneRelationsCount$1.label = i7 - Integer.MIN_VALUE;
                c44358sMw = this;
            } else {
                c44358sMw = this;
                phoneRelationEntityRepository$getPhoneRelationsCount$1 = new PhoneRelationEntityRepository$getPhoneRelationsCount$1(c44358sMw, continuation);
            }
        }
        java.lang.Object obj = phoneRelationEntityRepository$getPhoneRelationsCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = phoneRelationEntityRepository$getPhoneRelationsCount$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = phoneRelationEntityRepository$getPhoneRelationsCount$1.J$0;
                    i2 = phoneRelationEntityRepository$getPhoneRelationsCount$1.I$2;
                    i3 = phoneRelationEntityRepository$getPhoneRelationsCount$1.I$1;
                    int i9 = phoneRelationEntityRepository$getPhoneRelationsCount$1.I$0;
                    objectRef4 = (Ref.ObjectRef) phoneRelationEntityRepository$getPhoneRelationsCount$1.L$6;
                    longRef2 = (Ref.LongRef) phoneRelationEntityRepository$getPhoneRelationsCount$1.L$5;
                    objectRef3 = (Ref.ObjectRef) phoneRelationEntityRepository$getPhoneRelationsCount$1.L$4;
                    objectRef = (Ref.ObjectRef) phoneRelationEntityRepository$getPhoneRelationsCount$1.L$3;
                    longRef = (Ref.LongRef) phoneRelationEntityRepository$getPhoneRelationsCount$1.L$2;
                    baseDao = (BaseDao) phoneRelationEntityRepository$getPhoneRelationsCount$1.L$1;
                    c44358sMw2 = (C44358sMw) phoneRelationEntityRepository$getPhoneRelationsCount$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef3 = longRef;
                        i6 = i3;
                        baseDao2 = baseDao;
                        i5 = i9;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        objectRef2 = objectRef;
                        longRef2 = longRef;
                        c44358sMw3 = c44358sMw2;
                        i4 = i9;
                        sQLiteDatabaseLockedException = e3;
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                        }
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef4.element = t;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return t2;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = phoneRelationEntityRepository$getPhoneRelationsCount$1.I$1;
                i4 = phoneRelationEntityRepository$getPhoneRelationsCount$1.I$0;
                objectRef2 = (Ref.ObjectRef) phoneRelationEntityRepository$getPhoneRelationsCount$1.L$3;
                Ref.LongRef longRef4 = (Ref.LongRef) phoneRelationEntityRepository$getPhoneRelationsCount$1.L$2;
                baseDao2 = (BaseDao) phoneRelationEntityRepository$getPhoneRelationsCount$1.L$1;
                c44358sMw3 = (C44358sMw) phoneRelationEntityRepository$getPhoneRelationsCount$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef2;
                longRef2 = longRef4;
                i3 = i10;
                i2 = i3 + 1;
                baseDao = baseDao2;
                c44358sMw2 = c44358sMw3;
                i = i4;
                if (i2 >= i) {
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                        try {
                            i3 = i2;
                            objectRef2 = objectRef;
                            c44358sMw3 = c44358sMw2;
                            i4 = i;
                            sQLiteDatabaseLockedException = e6;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i2 < i4 - 1) {
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            Ref.LongRef longRef5 = longRef2;
                            longRef = longRef5;
                            baseDao = baseDao2;
                            C44159sFm.EZpvd(baseDao, longRef.element);
                            throw th;
                        }
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        longRef = longRef2;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef4 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    PhoneRelationEntityDao phoneRelationEntityDaoEZpvd = c44358sMw2.EZpvd();
                    phoneRelationEntityRepository$getPhoneRelationsCount$1.L$0 = c44358sMw2;
                    phoneRelationEntityRepository$getPhoneRelationsCount$1.L$1 = baseDao;
                    phoneRelationEntityRepository$getPhoneRelationsCount$1.L$2 = longRef2;
                    phoneRelationEntityRepository$getPhoneRelationsCount$1.L$3 = objectRef;
                    phoneRelationEntityRepository$getPhoneRelationsCount$1.L$4 = objectRef4;
                    phoneRelationEntityRepository$getPhoneRelationsCount$1.L$5 = longRef2;
                    phoneRelationEntityRepository$getPhoneRelationsCount$1.L$6 = objectRef4;
                    phoneRelationEntityRepository$getPhoneRelationsCount$1.I$0 = i;
                    phoneRelationEntityRepository$getPhoneRelationsCount$1.I$1 = i2;
                    phoneRelationEntityRepository$getPhoneRelationsCount$1.I$2 = i2;
                    phoneRelationEntityRepository$getPhoneRelationsCount$1.J$0 = jNanoTime;
                    phoneRelationEntityRepository$getPhoneRelationsCount$1.label = 1;
                    java.lang.Object phoneRelationsCount = phoneRelationEntityDaoEZpvd.getPhoneRelationsCount(phoneRelationEntityRepository$getPhoneRelationsCount$1);
                    if (phoneRelationsCount == objCopydefault) {
                        return objCopydefault;
                    }
                    i6 = i2;
                    objectRef3 = objectRef4;
                    longRef3 = longRef2;
                    int i11 = i;
                    baseDao2 = baseDao;
                    i5 = i11;
                    t = phoneRelationsCount;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        objectRef2 = objectRef;
                        i4 = i5;
                        c44358sMw3 = c44358sMw2;
                        longRef2 = longRef3;
                        i3 = i6;
                        r0 = e9;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                            phoneRelationEntityRepository$getPhoneRelationsCount$1.L$0 = c44358sMw3;
                            phoneRelationEntityRepository$getPhoneRelationsCount$1.L$1 = baseDao2;
                            phoneRelationEntityRepository$getPhoneRelationsCount$1.L$2 = longRef2;
                            phoneRelationEntityRepository$getPhoneRelationsCount$1.L$3 = objectRef2;
                            phoneRelationEntityRepository$getPhoneRelationsCount$1.L$4 = null;
                            phoneRelationEntityRepository$getPhoneRelationsCount$1.L$5 = null;
                            phoneRelationEntityRepository$getPhoneRelationsCount$1.L$6 = null;
                            phoneRelationEntityRepository$getPhoneRelationsCount$1.I$0 = i4;
                            phoneRelationEntityRepository$getPhoneRelationsCount$1.I$1 = i3;
                            phoneRelationEntityRepository$getPhoneRelationsCount$1.label = 2;
                            if (DelayKt.delay(((long) (i2 + 1)) * 50, phoneRelationEntityRepository$getPhoneRelationsCount$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            i10 = i3;
                            longRef4 = longRef2;
                            objectRef = objectRef2;
                            longRef2 = longRef4;
                            i3 = i10;
                            i2 = i3 + 1;
                            baseDao = baseDao2;
                            c44358sMw2 = c44358sMw3;
                            i = i4;
                            if (i2 >= i) {
                            }
                        } else {
                            objectRef = objectRef2;
                            i2 = i3 + 1;
                            baseDao = baseDao2;
                            c44358sMw2 = c44358sMw3;
                            i = i4;
                            if (i2 >= i) {
                            }
                        }
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e10) {
                        e2 = e10;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e11) {
                        e = e11;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef4.element = t;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDao, longRef2.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            PhoneRelationEntityDao phoneRelationEntityDaoEZpvd2 = EZpvd();
            Ref.LongRef longRef6 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            baseDao = phoneRelationEntityDaoEZpvd2;
            c44358sMw2 = c44358sMw;
            longRef2 = longRef6;
            i = 3;
            i2 = 0;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    /* JADX DEBUG: Duplicate block (B:76:0x01a4) to fix multi-entry loop: BACK_EDGE: B:76:0x01a4 -> B:77:0x01ae */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01b5: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:78:0x01b5 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b6: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:78:0x01b5 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147 A[Catch: all -> 0x0054, TryCatch #4 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0139, B:55:0x013c, B:59:0x0141, B:61:0x0147, B:63:0x0153, B:64:0x0156, B:65:0x0157, B:66:0x015a, B:70:0x0170, B:72:0x017d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #4 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0139, B:55:0x013c, B:59:0x0141, B:61:0x0147, B:63:0x0153, B:64:0x0156, B:65:0x0157, B:66:0x015a, B:70:0x0170, B:72:0x017d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object insertAllOrIgnore(@NotNull java.util.List<PhoneRelationEntity> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        PhoneRelationEntityRepository$insertAllOrIgnore$1 phoneRelationEntityRepository$insertAllOrIgnore$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoEZpvd;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        C44358sMw c44358sMw;
        PhoneRelationEntityRepository$insertAllOrIgnore$1 phoneRelationEntityRepository$insertAllOrIgnore$12;
        java.util.List<PhoneRelationEntity> list2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.util.List<PhoneRelationEntity> list3;
        Ref.ObjectRef objectRef2;
        int i4;
        C44358sMw c44358sMw2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        C44358sMw c44358sMw3;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        int i5;
        BaseDao baseDao2;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        long jNanoTime;
        java.util.List<PhoneRelationEntity> list4;
        if (continuation instanceof PhoneRelationEntityRepository$insertAllOrIgnore$1) {
            phoneRelationEntityRepository$insertAllOrIgnore$1 = (PhoneRelationEntityRepository$insertAllOrIgnore$1) continuation;
            int i7 = phoneRelationEntityRepository$insertAllOrIgnore$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                phoneRelationEntityRepository$insertAllOrIgnore$1.label = i7 - Integer.MIN_VALUE;
            } else {
                phoneRelationEntityRepository$insertAllOrIgnore$1 = new PhoneRelationEntityRepository$insertAllOrIgnore$1(this, continuation);
            }
        }
        java.lang.Object obj = phoneRelationEntityRepository$insertAllOrIgnore$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = phoneRelationEntityRepository$insertAllOrIgnore$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = phoneRelationEntityRepository$insertAllOrIgnore$1.J$0;
                    i4 = phoneRelationEntityRepository$insertAllOrIgnore$1.I$2;
                    i3 = phoneRelationEntityRepository$insertAllOrIgnore$1.I$1;
                    i = phoneRelationEntityRepository$insertAllOrIgnore$1.I$0;
                    objectRef5 = (Ref.ObjectRef) phoneRelationEntityRepository$insertAllOrIgnore$1.L$7;
                    longRef3 = (Ref.LongRef) phoneRelationEntityRepository$insertAllOrIgnore$1.L$6;
                    objectRef4 = (Ref.ObjectRef) phoneRelationEntityRepository$insertAllOrIgnore$1.L$5;
                    objectRef2 = (Ref.ObjectRef) phoneRelationEntityRepository$insertAllOrIgnore$1.L$4;
                    longRef2 = (Ref.LongRef) phoneRelationEntityRepository$insertAllOrIgnore$1.L$3;
                    baseDaoEZpvd = (BaseDao) phoneRelationEntityRepository$insertAllOrIgnore$1.L$2;
                    list4 = (java.util.List) phoneRelationEntityRepository$insertAllOrIgnore$1.L$1;
                    c44358sMw2 = (C44358sMw) phoneRelationEntityRepository$insertAllOrIgnore$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        list3 = list4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        phoneRelationEntityRepository$insertAllOrIgnore$12 = phoneRelationEntityRepository$insertAllOrIgnore$1;
                        i2 = i + i;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                        throw th;
                    }
                    ?? r02 = Unit.INSTANCE;
                    objectRef5.element = r02;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return r02;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = phoneRelationEntityRepository$insertAllOrIgnore$1.I$1;
                int i12 = phoneRelationEntityRepository$insertAllOrIgnore$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) phoneRelationEntityRepository$insertAllOrIgnore$1.L$4;
                longRef4 = (Ref.LongRef) phoneRelationEntityRepository$insertAllOrIgnore$1.L$3;
                BaseDao baseDao3 = (BaseDao) phoneRelationEntityRepository$insertAllOrIgnore$1.L$2;
                java.util.List<PhoneRelationEntity> list5 = (java.util.List) phoneRelationEntityRepository$insertAllOrIgnore$1.L$1;
                c44358sMw3 = (C44358sMw) phoneRelationEntityRepository$insertAllOrIgnore$1.L$0;
                C56391yDq.AEQbTJ(obj);
                PhoneRelationEntityRepository$insertAllOrIgnore$1 phoneRelationEntityRepository$insertAllOrIgnore$13 = phoneRelationEntityRepository$insertAllOrIgnore$1;
                int i13 = 1;
                baseDaoEZpvd = baseDao3;
                list2 = list5;
                i = i12;
                objectRef = objectRef6;
                phoneRelationEntityRepository$insertAllOrIgnore$12 = phoneRelationEntityRepository$insertAllOrIgnore$13;
                i2 = i11 + i13;
                c44358sMw = c44358sMw3;
                longRef3 = longRef4;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            longRef2 = longRef3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            longRef2 = longRef3;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        list3 = list2;
                        phoneRelationEntityRepository$insertAllOrIgnore$1 = phoneRelationEntityRepository$insertAllOrIgnore$12;
                        c44358sMw2 = c44358sMw;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            phoneRelationEntityRepository$insertAllOrIgnore$1.L$0 = c44358sMw3;
                            phoneRelationEntityRepository$insertAllOrIgnore$1.L$1 = list3;
                            phoneRelationEntityRepository$insertAllOrIgnore$1.L$2 = baseDao2;
                            phoneRelationEntityRepository$insertAllOrIgnore$1.L$3 = longRef4;
                            phoneRelationEntityRepository$insertAllOrIgnore$1.L$4 = objectRef3;
                            phoneRelationEntityRepository$insertAllOrIgnore$1.L$5 = null;
                            phoneRelationEntityRepository$insertAllOrIgnore$1.L$6 = null;
                            phoneRelationEntityRepository$insertAllOrIgnore$1.L$7 = null;
                            phoneRelationEntityRepository$insertAllOrIgnore$1.I$0 = i6;
                            phoneRelationEntityRepository$insertAllOrIgnore$1.I$1 = i5;
                            phoneRelationEntityRepository$insertAllOrIgnore$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, phoneRelationEntityRepository$insertAllOrIgnore$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            phoneRelationEntityRepository$insertAllOrIgnore$13 = phoneRelationEntityRepository$insertAllOrIgnore$1;
                            i11 = i5;
                            list2 = list3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoEZpvd = baseDao4;
                        } else {
                            phoneRelationEntityRepository$insertAllOrIgnore$13 = phoneRelationEntityRepository$insertAllOrIgnore$1;
                            i11 = i5;
                            list2 = list3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoEZpvd = baseDao5;
                        }
                        phoneRelationEntityRepository$insertAllOrIgnore$12 = phoneRelationEntityRepository$insertAllOrIgnore$13;
                        i2 = i11 + i13;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        list3 = list2;
                        phoneRelationEntityRepository$insertAllOrIgnore$1 = phoneRelationEntityRepository$insertAllOrIgnore$12;
                        c44358sMw2 = c44358sMw;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        phoneRelationEntityRepository$insertAllOrIgnore$12 = phoneRelationEntityRepository$insertAllOrIgnore$13;
                        i2 = i11 + i13;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    PhoneRelationEntityDao phoneRelationEntityDaoEZpvd = c44358sMw.EZpvd();
                    phoneRelationEntityRepository$insertAllOrIgnore$12.L$0 = c44358sMw;
                    phoneRelationEntityRepository$insertAllOrIgnore$12.L$1 = list2;
                    phoneRelationEntityRepository$insertAllOrIgnore$12.L$2 = baseDaoEZpvd;
                    phoneRelationEntityRepository$insertAllOrIgnore$12.L$3 = longRef3;
                    phoneRelationEntityRepository$insertAllOrIgnore$12.L$4 = objectRef;
                    phoneRelationEntityRepository$insertAllOrIgnore$12.L$5 = objectRef5;
                    phoneRelationEntityRepository$insertAllOrIgnore$12.L$6 = longRef3;
                    phoneRelationEntityRepository$insertAllOrIgnore$12.L$7 = objectRef5;
                    phoneRelationEntityRepository$insertAllOrIgnore$12.I$0 = i;
                    phoneRelationEntityRepository$insertAllOrIgnore$12.I$1 = i2;
                    phoneRelationEntityRepository$insertAllOrIgnore$12.I$2 = i2;
                    phoneRelationEntityRepository$insertAllOrIgnore$12.J$0 = jNanoTime;
                    phoneRelationEntityRepository$insertAllOrIgnore$12.label = 1;
                    if (phoneRelationEntityDaoEZpvd.insertAllOrIgnore(list2, phoneRelationEntityRepository$insertAllOrIgnore$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    list4 = list2;
                    phoneRelationEntityRepository$insertAllOrIgnore$1 = phoneRelationEntityRepository$insertAllOrIgnore$12;
                    c44358sMw2 = c44358sMw;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoEZpvd;
                    i6 = i14;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        list3 = list4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        phoneRelationEntityRepository$insertAllOrIgnore$12 = phoneRelationEntityRepository$insertAllOrIgnore$13;
                        i2 = i11 + i13;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    ?? r022 = Unit.INSTANCE;
                    objectRef5.element = r022;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return r022;
                }
                C44159sFm.EZpvd(baseDaoEZpvd, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoEZpvd = EZpvd();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            c44358sMw = this;
            phoneRelationEntityRepository$insertAllOrIgnore$12 = phoneRelationEntityRepository$insertAllOrIgnore$1;
            list2 = list;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoEZpvd = baseDao;
        }
    }

    /* JADX DEBUG: Duplicate block (B:76:0x01a4) to fix multi-entry loop: BACK_EDGE: B:76:0x01a4 -> B:77:0x01ae */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01b5: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:78:0x01b5 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b6: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:78:0x01b5 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147 A[Catch: all -> 0x0054, TryCatch #4 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0139, B:55:0x013c, B:59:0x0141, B:61:0x0147, B:63:0x0153, B:64:0x0156, B:65:0x0157, B:66:0x015a, B:70:0x0170, B:72:0x017d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #4 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0139, B:55:0x013c, B:59:0x0141, B:61:0x0147, B:63:0x0153, B:64:0x0156, B:65:0x0157, B:66:0x015a, B:70:0x0170, B:72:0x017d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object insertAllOrReplace(@NotNull java.util.List<PhoneRelationEntity> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        PhoneRelationEntityRepository$insertAllOrReplace$1 phoneRelationEntityRepository$insertAllOrReplace$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoEZpvd;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        C44358sMw c44358sMw;
        PhoneRelationEntityRepository$insertAllOrReplace$1 phoneRelationEntityRepository$insertAllOrReplace$12;
        java.util.List<PhoneRelationEntity> list2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.util.List<PhoneRelationEntity> list3;
        Ref.ObjectRef objectRef2;
        int i4;
        C44358sMw c44358sMw2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        C44358sMw c44358sMw3;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        int i5;
        BaseDao baseDao2;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        long jNanoTime;
        java.util.List<PhoneRelationEntity> list4;
        if (continuation instanceof PhoneRelationEntityRepository$insertAllOrReplace$1) {
            phoneRelationEntityRepository$insertAllOrReplace$1 = (PhoneRelationEntityRepository$insertAllOrReplace$1) continuation;
            int i7 = phoneRelationEntityRepository$insertAllOrReplace$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                phoneRelationEntityRepository$insertAllOrReplace$1.label = i7 - Integer.MIN_VALUE;
            } else {
                phoneRelationEntityRepository$insertAllOrReplace$1 = new PhoneRelationEntityRepository$insertAllOrReplace$1(this, continuation);
            }
        }
        java.lang.Object obj = phoneRelationEntityRepository$insertAllOrReplace$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = phoneRelationEntityRepository$insertAllOrReplace$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = phoneRelationEntityRepository$insertAllOrReplace$1.J$0;
                    i4 = phoneRelationEntityRepository$insertAllOrReplace$1.I$2;
                    i3 = phoneRelationEntityRepository$insertAllOrReplace$1.I$1;
                    i = phoneRelationEntityRepository$insertAllOrReplace$1.I$0;
                    objectRef5 = (Ref.ObjectRef) phoneRelationEntityRepository$insertAllOrReplace$1.L$7;
                    longRef3 = (Ref.LongRef) phoneRelationEntityRepository$insertAllOrReplace$1.L$6;
                    objectRef4 = (Ref.ObjectRef) phoneRelationEntityRepository$insertAllOrReplace$1.L$5;
                    objectRef2 = (Ref.ObjectRef) phoneRelationEntityRepository$insertAllOrReplace$1.L$4;
                    longRef2 = (Ref.LongRef) phoneRelationEntityRepository$insertAllOrReplace$1.L$3;
                    baseDaoEZpvd = (BaseDao) phoneRelationEntityRepository$insertAllOrReplace$1.L$2;
                    list4 = (java.util.List) phoneRelationEntityRepository$insertAllOrReplace$1.L$1;
                    c44358sMw2 = (C44358sMw) phoneRelationEntityRepository$insertAllOrReplace$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        list3 = list4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        phoneRelationEntityRepository$insertAllOrReplace$12 = phoneRelationEntityRepository$insertAllOrReplace$1;
                        i2 = i + i;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                        throw th;
                    }
                    ?? r02 = Unit.INSTANCE;
                    objectRef5.element = r02;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return r02;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = phoneRelationEntityRepository$insertAllOrReplace$1.I$1;
                int i12 = phoneRelationEntityRepository$insertAllOrReplace$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) phoneRelationEntityRepository$insertAllOrReplace$1.L$4;
                longRef4 = (Ref.LongRef) phoneRelationEntityRepository$insertAllOrReplace$1.L$3;
                BaseDao baseDao3 = (BaseDao) phoneRelationEntityRepository$insertAllOrReplace$1.L$2;
                java.util.List<PhoneRelationEntity> list5 = (java.util.List) phoneRelationEntityRepository$insertAllOrReplace$1.L$1;
                c44358sMw3 = (C44358sMw) phoneRelationEntityRepository$insertAllOrReplace$1.L$0;
                C56391yDq.AEQbTJ(obj);
                PhoneRelationEntityRepository$insertAllOrReplace$1 phoneRelationEntityRepository$insertAllOrReplace$13 = phoneRelationEntityRepository$insertAllOrReplace$1;
                int i13 = 1;
                baseDaoEZpvd = baseDao3;
                list2 = list5;
                i = i12;
                objectRef = objectRef6;
                phoneRelationEntityRepository$insertAllOrReplace$12 = phoneRelationEntityRepository$insertAllOrReplace$13;
                i2 = i11 + i13;
                c44358sMw = c44358sMw3;
                longRef3 = longRef4;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            longRef2 = longRef3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            longRef2 = longRef3;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        list3 = list2;
                        phoneRelationEntityRepository$insertAllOrReplace$1 = phoneRelationEntityRepository$insertAllOrReplace$12;
                        c44358sMw2 = c44358sMw;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            phoneRelationEntityRepository$insertAllOrReplace$1.L$0 = c44358sMw3;
                            phoneRelationEntityRepository$insertAllOrReplace$1.L$1 = list3;
                            phoneRelationEntityRepository$insertAllOrReplace$1.L$2 = baseDao2;
                            phoneRelationEntityRepository$insertAllOrReplace$1.L$3 = longRef4;
                            phoneRelationEntityRepository$insertAllOrReplace$1.L$4 = objectRef3;
                            phoneRelationEntityRepository$insertAllOrReplace$1.L$5 = null;
                            phoneRelationEntityRepository$insertAllOrReplace$1.L$6 = null;
                            phoneRelationEntityRepository$insertAllOrReplace$1.L$7 = null;
                            phoneRelationEntityRepository$insertAllOrReplace$1.I$0 = i6;
                            phoneRelationEntityRepository$insertAllOrReplace$1.I$1 = i5;
                            phoneRelationEntityRepository$insertAllOrReplace$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, phoneRelationEntityRepository$insertAllOrReplace$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            phoneRelationEntityRepository$insertAllOrReplace$13 = phoneRelationEntityRepository$insertAllOrReplace$1;
                            i11 = i5;
                            list2 = list3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoEZpvd = baseDao4;
                        } else {
                            phoneRelationEntityRepository$insertAllOrReplace$13 = phoneRelationEntityRepository$insertAllOrReplace$1;
                            i11 = i5;
                            list2 = list3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoEZpvd = baseDao5;
                        }
                        phoneRelationEntityRepository$insertAllOrReplace$12 = phoneRelationEntityRepository$insertAllOrReplace$13;
                        i2 = i11 + i13;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        list3 = list2;
                        phoneRelationEntityRepository$insertAllOrReplace$1 = phoneRelationEntityRepository$insertAllOrReplace$12;
                        c44358sMw2 = c44358sMw;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        phoneRelationEntityRepository$insertAllOrReplace$12 = phoneRelationEntityRepository$insertAllOrReplace$13;
                        i2 = i11 + i13;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    PhoneRelationEntityDao phoneRelationEntityDaoEZpvd = c44358sMw.EZpvd();
                    phoneRelationEntityRepository$insertAllOrReplace$12.L$0 = c44358sMw;
                    phoneRelationEntityRepository$insertAllOrReplace$12.L$1 = list2;
                    phoneRelationEntityRepository$insertAllOrReplace$12.L$2 = baseDaoEZpvd;
                    phoneRelationEntityRepository$insertAllOrReplace$12.L$3 = longRef3;
                    phoneRelationEntityRepository$insertAllOrReplace$12.L$4 = objectRef;
                    phoneRelationEntityRepository$insertAllOrReplace$12.L$5 = objectRef5;
                    phoneRelationEntityRepository$insertAllOrReplace$12.L$6 = longRef3;
                    phoneRelationEntityRepository$insertAllOrReplace$12.L$7 = objectRef5;
                    phoneRelationEntityRepository$insertAllOrReplace$12.I$0 = i;
                    phoneRelationEntityRepository$insertAllOrReplace$12.I$1 = i2;
                    phoneRelationEntityRepository$insertAllOrReplace$12.I$2 = i2;
                    phoneRelationEntityRepository$insertAllOrReplace$12.J$0 = jNanoTime;
                    phoneRelationEntityRepository$insertAllOrReplace$12.label = 1;
                    if (phoneRelationEntityDaoEZpvd.insertAllOrReplace(list2, phoneRelationEntityRepository$insertAllOrReplace$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    list4 = list2;
                    phoneRelationEntityRepository$insertAllOrReplace$1 = phoneRelationEntityRepository$insertAllOrReplace$12;
                    c44358sMw2 = c44358sMw;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoEZpvd;
                    i6 = i14;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        list3 = list4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        phoneRelationEntityRepository$insertAllOrReplace$12 = phoneRelationEntityRepository$insertAllOrReplace$13;
                        i2 = i11 + i13;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    ?? r022 = Unit.INSTANCE;
                    objectRef5.element = r022;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return r022;
                }
                C44159sFm.EZpvd(baseDaoEZpvd, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoEZpvd = EZpvd();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            c44358sMw = this;
            phoneRelationEntityRepository$insertAllOrReplace$12 = phoneRelationEntityRepository$insertAllOrReplace$1;
            list2 = list;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoEZpvd = baseDao;
        }
    }

    /* JADX INFO: renamed from: o.sMw$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((PhoneRelationEntity) t).getName(), ((PhoneRelationEntity) t2).getName());
        }
    }

    /* JADX INFO: renamed from: o.sMw$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((PhoneRelationEntity) t).getName(), ((PhoneRelationEntity) t2).getName());
        }
    }

    /* JADX INFO: renamed from: o.sMw$FragmentManager */
    public static final class FragmentManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((PhoneRelationEntity) t).getName(), ((PhoneRelationEntity) t2).getName());
        }
    }

    /* JADX INFO: renamed from: o.sMw$LoaderManager */
    public static final class LoaderManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((PhoneRelationEntity) t).getName(), ((PhoneRelationEntity) t2).getName());
        }
    }

    /* JADX INFO: renamed from: o.sMw$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((PhoneRelationEntity) t).getName(), ((PhoneRelationEntity) t2).getName());
        }
    }

    /* JADX INFO: renamed from: o.sMw$ActionBar */
    public static final class ActionBar implements Flow<java.util.List<? extends PhoneRelationEntity>> {
        public final /* synthetic */ Flow KWHzl;

        public ActionBar(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.util.List<? extends PhoneRelationEntity>> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sMw$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                PhoneRelationEntityRepository$getPhoneRelationsByHashesAsFlow$$inlined$map$1$2$1 phoneRelationEntityRepository$getPhoneRelationsByHashesAsFlow$$inlined$map$1$2$1;
                if (continuation instanceof PhoneRelationEntityRepository$getPhoneRelationsByHashesAsFlow$$inlined$map$1$2$1) {
                    phoneRelationEntityRepository$getPhoneRelationsByHashesAsFlow$$inlined$map$1$2$1 = (PhoneRelationEntityRepository$getPhoneRelationsByHashesAsFlow$$inlined$map$1$2$1) continuation;
                    int i = phoneRelationEntityRepository$getPhoneRelationsByHashesAsFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        phoneRelationEntityRepository$getPhoneRelationsByHashesAsFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        phoneRelationEntityRepository$getPhoneRelationsByHashesAsFlow$$inlined$map$1$2$1 = new PhoneRelationEntityRepository$getPhoneRelationsByHashesAsFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = phoneRelationEntityRepository$getPhoneRelationsByHashesAsFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = phoneRelationEntityRepository$getPhoneRelationsByHashesAsFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd((java.util.List) obj, new Activity());
                    phoneRelationEntityRepository$getPhoneRelationsByHashesAsFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listEZpvd, phoneRelationEntityRepository$getPhoneRelationsByHashesAsFlow$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: o.sMw$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription implements Flow<java.util.List<? extends PhoneRelationEntity>> {
        public final /* synthetic */ Flow AEQbTJ;

        public TaskDescription(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.util.List<? extends PhoneRelationEntity>> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sMw$TaskDescription$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                PhoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashesAsFlow$$inlined$map$1$2$1 phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashesAsFlow$$inlined$map$1$2$1;
                if (continuation instanceof PhoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashesAsFlow$$inlined$map$1$2$1) {
                    phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashesAsFlow$$inlined$map$1$2$1 = (PhoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashesAsFlow$$inlined$map$1$2$1) continuation;
                    int i = phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashesAsFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashesAsFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashesAsFlow$$inlined$map$1$2$1 = new PhoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashesAsFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashesAsFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashesAsFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd((java.util.List) obj, new LoaderManager());
                    phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashesAsFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listEZpvd, phoneRelationEntityRepository$getPhoneRelationsNoOkxRelationByHashesAsFlow$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX DEBUG: Duplicate block (B:76:0x01a4) to fix multi-entry loop: BACK_EDGE: B:76:0x01a4 -> B:77:0x01ae */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01b5: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:78:0x01b5 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b6: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:78:0x01b5 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147 A[Catch: all -> 0x0054, TryCatch #4 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0139, B:55:0x013c, B:59:0x0141, B:61:0x0147, B:63:0x0153, B:64:0x0156, B:65:0x0157, B:66:0x015a, B:70:0x0170, B:72:0x017d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #4 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0139, B:55:0x013c, B:59:0x0141, B:61:0x0147, B:63:0x0153, B:64:0x0156, B:65:0x0157, B:66:0x015a, B:70:0x0170, B:72:0x017d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object updateAll(@NotNull java.util.List<PhoneRelationUpdateEntity> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        PhoneRelationEntityRepository$updateAll$1 phoneRelationEntityRepository$updateAll$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoEZpvd;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        C44358sMw c44358sMw;
        PhoneRelationEntityRepository$updateAll$1 phoneRelationEntityRepository$updateAll$12;
        java.util.List<PhoneRelationUpdateEntity> list2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.util.List<PhoneRelationUpdateEntity> list3;
        Ref.ObjectRef objectRef2;
        int i4;
        C44358sMw c44358sMw2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        C44358sMw c44358sMw3;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        int i5;
        BaseDao baseDao2;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        long jNanoTime;
        java.util.List<PhoneRelationUpdateEntity> list4;
        if (continuation instanceof PhoneRelationEntityRepository$updateAll$1) {
            phoneRelationEntityRepository$updateAll$1 = (PhoneRelationEntityRepository$updateAll$1) continuation;
            int i7 = phoneRelationEntityRepository$updateAll$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                phoneRelationEntityRepository$updateAll$1.label = i7 - Integer.MIN_VALUE;
            } else {
                phoneRelationEntityRepository$updateAll$1 = new PhoneRelationEntityRepository$updateAll$1(this, continuation);
            }
        }
        java.lang.Object obj = phoneRelationEntityRepository$updateAll$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = phoneRelationEntityRepository$updateAll$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = phoneRelationEntityRepository$updateAll$1.J$0;
                    i4 = phoneRelationEntityRepository$updateAll$1.I$2;
                    i3 = phoneRelationEntityRepository$updateAll$1.I$1;
                    i = phoneRelationEntityRepository$updateAll$1.I$0;
                    objectRef5 = (Ref.ObjectRef) phoneRelationEntityRepository$updateAll$1.L$7;
                    longRef3 = (Ref.LongRef) phoneRelationEntityRepository$updateAll$1.L$6;
                    objectRef4 = (Ref.ObjectRef) phoneRelationEntityRepository$updateAll$1.L$5;
                    objectRef2 = (Ref.ObjectRef) phoneRelationEntityRepository$updateAll$1.L$4;
                    longRef2 = (Ref.LongRef) phoneRelationEntityRepository$updateAll$1.L$3;
                    baseDaoEZpvd = (BaseDao) phoneRelationEntityRepository$updateAll$1.L$2;
                    list4 = (java.util.List) phoneRelationEntityRepository$updateAll$1.L$1;
                    c44358sMw2 = (C44358sMw) phoneRelationEntityRepository$updateAll$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        list3 = list4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        phoneRelationEntityRepository$updateAll$12 = phoneRelationEntityRepository$updateAll$1;
                        i2 = i + i;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                        throw th;
                    }
                    ?? r02 = Unit.INSTANCE;
                    objectRef5.element = r02;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return r02;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = phoneRelationEntityRepository$updateAll$1.I$1;
                int i12 = phoneRelationEntityRepository$updateAll$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) phoneRelationEntityRepository$updateAll$1.L$4;
                longRef4 = (Ref.LongRef) phoneRelationEntityRepository$updateAll$1.L$3;
                BaseDao baseDao3 = (BaseDao) phoneRelationEntityRepository$updateAll$1.L$2;
                java.util.List<PhoneRelationUpdateEntity> list5 = (java.util.List) phoneRelationEntityRepository$updateAll$1.L$1;
                c44358sMw3 = (C44358sMw) phoneRelationEntityRepository$updateAll$1.L$0;
                C56391yDq.AEQbTJ(obj);
                PhoneRelationEntityRepository$updateAll$1 phoneRelationEntityRepository$updateAll$13 = phoneRelationEntityRepository$updateAll$1;
                int i13 = 1;
                baseDaoEZpvd = baseDao3;
                list2 = list5;
                i = i12;
                objectRef = objectRef6;
                phoneRelationEntityRepository$updateAll$12 = phoneRelationEntityRepository$updateAll$13;
                i2 = i11 + i13;
                c44358sMw = c44358sMw3;
                longRef3 = longRef4;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            longRef2 = longRef3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            longRef2 = longRef3;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        list3 = list2;
                        phoneRelationEntityRepository$updateAll$1 = phoneRelationEntityRepository$updateAll$12;
                        c44358sMw2 = c44358sMw;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            phoneRelationEntityRepository$updateAll$1.L$0 = c44358sMw3;
                            phoneRelationEntityRepository$updateAll$1.L$1 = list3;
                            phoneRelationEntityRepository$updateAll$1.L$2 = baseDao2;
                            phoneRelationEntityRepository$updateAll$1.L$3 = longRef4;
                            phoneRelationEntityRepository$updateAll$1.L$4 = objectRef3;
                            phoneRelationEntityRepository$updateAll$1.L$5 = null;
                            phoneRelationEntityRepository$updateAll$1.L$6 = null;
                            phoneRelationEntityRepository$updateAll$1.L$7 = null;
                            phoneRelationEntityRepository$updateAll$1.I$0 = i6;
                            phoneRelationEntityRepository$updateAll$1.I$1 = i5;
                            phoneRelationEntityRepository$updateAll$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, phoneRelationEntityRepository$updateAll$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            phoneRelationEntityRepository$updateAll$13 = phoneRelationEntityRepository$updateAll$1;
                            i11 = i5;
                            list2 = list3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoEZpvd = baseDao4;
                        } else {
                            phoneRelationEntityRepository$updateAll$13 = phoneRelationEntityRepository$updateAll$1;
                            i11 = i5;
                            list2 = list3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoEZpvd = baseDao5;
                        }
                        phoneRelationEntityRepository$updateAll$12 = phoneRelationEntityRepository$updateAll$13;
                        i2 = i11 + i13;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        list3 = list2;
                        phoneRelationEntityRepository$updateAll$1 = phoneRelationEntityRepository$updateAll$12;
                        c44358sMw2 = c44358sMw;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        phoneRelationEntityRepository$updateAll$12 = phoneRelationEntityRepository$updateAll$13;
                        i2 = i11 + i13;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    PhoneRelationEntityDao phoneRelationEntityDaoEZpvd = c44358sMw.EZpvd();
                    phoneRelationEntityRepository$updateAll$12.L$0 = c44358sMw;
                    phoneRelationEntityRepository$updateAll$12.L$1 = list2;
                    phoneRelationEntityRepository$updateAll$12.L$2 = baseDaoEZpvd;
                    phoneRelationEntityRepository$updateAll$12.L$3 = longRef3;
                    phoneRelationEntityRepository$updateAll$12.L$4 = objectRef;
                    phoneRelationEntityRepository$updateAll$12.L$5 = objectRef5;
                    phoneRelationEntityRepository$updateAll$12.L$6 = longRef3;
                    phoneRelationEntityRepository$updateAll$12.L$7 = objectRef5;
                    phoneRelationEntityRepository$updateAll$12.I$0 = i;
                    phoneRelationEntityRepository$updateAll$12.I$1 = i2;
                    phoneRelationEntityRepository$updateAll$12.I$2 = i2;
                    phoneRelationEntityRepository$updateAll$12.J$0 = jNanoTime;
                    phoneRelationEntityRepository$updateAll$12.label = 1;
                    if (phoneRelationEntityDaoEZpvd.updateAll(list2, phoneRelationEntityRepository$updateAll$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    list4 = list2;
                    phoneRelationEntityRepository$updateAll$1 = phoneRelationEntityRepository$updateAll$12;
                    c44358sMw2 = c44358sMw;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoEZpvd;
                    i6 = i14;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        list3 = list4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        phoneRelationEntityRepository$updateAll$12 = phoneRelationEntityRepository$updateAll$13;
                        i2 = i11 + i13;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    ?? r022 = Unit.INSTANCE;
                    objectRef5.element = r022;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return r022;
                }
                C44159sFm.EZpvd(baseDaoEZpvd, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoEZpvd = EZpvd();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            c44358sMw = this;
            phoneRelationEntityRepository$updateAll$12 = phoneRelationEntityRepository$updateAll$1;
            list2 = list;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoEZpvd = baseDao;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c A[Catch: all -> 0x004a, TryCatch #8 {all -> 0x004a, blocks: (B:13:0x0042, B:37:0x00ec, B:51:0x011f, B:52:0x0122, B:55:0x0126, B:57:0x012c, B:59:0x0138, B:60:0x013b, B:61:0x013c, B:62:0x013f), top: B:86:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0155 A[Catch: all -> 0x018b, TRY_LEAVE, TryCatch #9 {all -> 0x018b, blocks: (B:66:0x0148, B:68:0x0155), top: B:87:0x0148 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0178 -> B:72:0x017a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x017f -> B:73:0x017d). Please report as a decompilation issue!!! */
    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object deleteAll(@NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        PhoneRelationEntityRepository$deleteAll$1 phoneRelationEntityRepository$deleteAll$1;
        C44358sMw c44358sMw;
        BaseDao baseDao;
        Ref.LongRef longRef;
        Ref.ObjectRef objectRef;
        C44358sMw c44358sMw2;
        Ref.LongRef longRef2;
        int i;
        int i2;
        C44358sMw c44358sMw3;
        int i3;
        Ref.ObjectRef objectRef2;
        int i4;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        BaseDao baseDao2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.LongRef longRef3;
        long jNanoTime;
        int i5;
        int i6;
        if (continuation instanceof PhoneRelationEntityRepository$deleteAll$1) {
            phoneRelationEntityRepository$deleteAll$1 = (PhoneRelationEntityRepository$deleteAll$1) continuation;
            int i7 = phoneRelationEntityRepository$deleteAll$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                phoneRelationEntityRepository$deleteAll$1.label = i7 - Integer.MIN_VALUE;
                c44358sMw = this;
            } else {
                c44358sMw = this;
                phoneRelationEntityRepository$deleteAll$1 = new PhoneRelationEntityRepository$deleteAll$1(c44358sMw, continuation);
            }
        }
        java.lang.Object obj = phoneRelationEntityRepository$deleteAll$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = phoneRelationEntityRepository$deleteAll$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = phoneRelationEntityRepository$deleteAll$1.J$0;
                    i2 = phoneRelationEntityRepository$deleteAll$1.I$2;
                    i3 = phoneRelationEntityRepository$deleteAll$1.I$1;
                    int i9 = phoneRelationEntityRepository$deleteAll$1.I$0;
                    objectRef4 = (Ref.ObjectRef) phoneRelationEntityRepository$deleteAll$1.L$6;
                    longRef2 = (Ref.LongRef) phoneRelationEntityRepository$deleteAll$1.L$5;
                    objectRef3 = (Ref.ObjectRef) phoneRelationEntityRepository$deleteAll$1.L$4;
                    objectRef = (Ref.ObjectRef) phoneRelationEntityRepository$deleteAll$1.L$3;
                    longRef = (Ref.LongRef) phoneRelationEntityRepository$deleteAll$1.L$2;
                    baseDao = (BaseDao) phoneRelationEntityRepository$deleteAll$1.L$1;
                    c44358sMw2 = (C44358sMw) phoneRelationEntityRepository$deleteAll$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef3 = longRef;
                        i6 = i3;
                        baseDao2 = baseDao;
                        i5 = i9;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        objectRef2 = objectRef;
                        longRef2 = longRef;
                        c44358sMw3 = c44358sMw2;
                        i4 = i9;
                        sQLiteDatabaseLockedException = e3;
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                        }
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    ?? r02 = Unit.INSTANCE;
                    objectRef4.element = r02;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return r02;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = phoneRelationEntityRepository$deleteAll$1.I$1;
                i4 = phoneRelationEntityRepository$deleteAll$1.I$0;
                objectRef2 = (Ref.ObjectRef) phoneRelationEntityRepository$deleteAll$1.L$3;
                Ref.LongRef longRef4 = (Ref.LongRef) phoneRelationEntityRepository$deleteAll$1.L$2;
                baseDao2 = (BaseDao) phoneRelationEntityRepository$deleteAll$1.L$1;
                c44358sMw3 = (C44358sMw) phoneRelationEntityRepository$deleteAll$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef2;
                longRef2 = longRef4;
                i3 = i10;
                i2 = i3 + 1;
                baseDao = baseDao2;
                c44358sMw2 = c44358sMw3;
                i = i4;
                if (i2 >= i) {
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                        try {
                            i3 = i2;
                            objectRef2 = objectRef;
                            c44358sMw3 = c44358sMw2;
                            i4 = i;
                            sQLiteDatabaseLockedException = e6;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i2 < i4 - 1) {
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            Ref.LongRef longRef5 = longRef2;
                            longRef = longRef5;
                            baseDao = baseDao2;
                            C44159sFm.EZpvd(baseDao, longRef.element);
                            throw th;
                        }
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        longRef = longRef2;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef4 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    PhoneRelationEntityDao phoneRelationEntityDaoEZpvd = c44358sMw2.EZpvd();
                    phoneRelationEntityRepository$deleteAll$1.L$0 = c44358sMw2;
                    phoneRelationEntityRepository$deleteAll$1.L$1 = baseDao;
                    phoneRelationEntityRepository$deleteAll$1.L$2 = longRef2;
                    phoneRelationEntityRepository$deleteAll$1.L$3 = objectRef;
                    phoneRelationEntityRepository$deleteAll$1.L$4 = objectRef4;
                    phoneRelationEntityRepository$deleteAll$1.L$5 = longRef2;
                    phoneRelationEntityRepository$deleteAll$1.L$6 = objectRef4;
                    phoneRelationEntityRepository$deleteAll$1.I$0 = i;
                    phoneRelationEntityRepository$deleteAll$1.I$1 = i2;
                    phoneRelationEntityRepository$deleteAll$1.I$2 = i2;
                    phoneRelationEntityRepository$deleteAll$1.J$0 = jNanoTime;
                    phoneRelationEntityRepository$deleteAll$1.label = 1;
                    if (phoneRelationEntityDaoEZpvd.deleteAll(phoneRelationEntityRepository$deleteAll$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    i6 = i2;
                    objectRef3 = objectRef4;
                    longRef3 = longRef2;
                    int i11 = i;
                    baseDao2 = baseDao;
                    i5 = i11;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        objectRef2 = objectRef;
                        i4 = i5;
                        c44358sMw3 = c44358sMw2;
                        longRef2 = longRef3;
                        i3 = i6;
                        r0 = e9;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                            phoneRelationEntityRepository$deleteAll$1.L$0 = c44358sMw3;
                            phoneRelationEntityRepository$deleteAll$1.L$1 = baseDao2;
                            phoneRelationEntityRepository$deleteAll$1.L$2 = longRef2;
                            phoneRelationEntityRepository$deleteAll$1.L$3 = objectRef2;
                            phoneRelationEntityRepository$deleteAll$1.L$4 = null;
                            phoneRelationEntityRepository$deleteAll$1.L$5 = null;
                            phoneRelationEntityRepository$deleteAll$1.L$6 = null;
                            phoneRelationEntityRepository$deleteAll$1.I$0 = i4;
                            phoneRelationEntityRepository$deleteAll$1.I$1 = i3;
                            phoneRelationEntityRepository$deleteAll$1.label = 2;
                            if (DelayKt.delay(((long) (i2 + 1)) * 50, phoneRelationEntityRepository$deleteAll$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            i10 = i3;
                            longRef4 = longRef2;
                            objectRef = objectRef2;
                            longRef2 = longRef4;
                            i3 = i10;
                            i2 = i3 + 1;
                            baseDao = baseDao2;
                            c44358sMw2 = c44358sMw3;
                            i = i4;
                            if (i2 >= i) {
                            }
                        } else {
                            objectRef = objectRef2;
                            i2 = i3 + 1;
                            baseDao = baseDao2;
                            c44358sMw2 = c44358sMw3;
                            i = i4;
                            if (i2 >= i) {
                            }
                        }
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e10) {
                        e2 = e10;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e11) {
                        e = e11;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    ?? r022 = Unit.INSTANCE;
                    objectRef4.element = r022;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return r022;
                }
                C44159sFm.EZpvd(baseDao, longRef2.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            PhoneRelationEntityDao phoneRelationEntityDaoEZpvd2 = EZpvd();
            Ref.LongRef longRef6 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            baseDao = phoneRelationEntityDaoEZpvd2;
            c44358sMw2 = c44358sMw;
            longRef2 = longRef6;
            i = 3;
            i2 = 0;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    /* JADX DEBUG: Duplicate block (B:76:0x01a4) to fix multi-entry loop: BACK_EDGE: B:76:0x01a4 -> B:77:0x01ae */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01b5: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:78:0x01b5 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b6: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:78:0x01b5 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147 A[Catch: all -> 0x0054, TryCatch #4 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0139, B:55:0x013c, B:59:0x0141, B:61:0x0147, B:63:0x0153, B:64:0x0156, B:65:0x0157, B:66:0x015a, B:70:0x0170, B:72:0x017d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #4 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0139, B:55:0x013c, B:59:0x0141, B:61:0x0147, B:63:0x0153, B:64:0x0156, B:65:0x0157, B:66:0x015a, B:70:0x0170, B:72:0x017d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object deleteAllNotInHashes(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        PhoneRelationEntityRepository$deleteAllNotInHashes$1 phoneRelationEntityRepository$deleteAllNotInHashes$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoEZpvd;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        C44358sMw c44358sMw;
        PhoneRelationEntityRepository$deleteAllNotInHashes$1 phoneRelationEntityRepository$deleteAllNotInHashes$12;
        java.util.Set<java.lang.String> set2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.util.Set<java.lang.String> set3;
        Ref.ObjectRef objectRef2;
        int i4;
        C44358sMw c44358sMw2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        C44358sMw c44358sMw3;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        int i5;
        BaseDao baseDao2;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        long jNanoTime;
        java.util.Set<java.lang.String> set4;
        if (continuation instanceof PhoneRelationEntityRepository$deleteAllNotInHashes$1) {
            phoneRelationEntityRepository$deleteAllNotInHashes$1 = (PhoneRelationEntityRepository$deleteAllNotInHashes$1) continuation;
            int i7 = phoneRelationEntityRepository$deleteAllNotInHashes$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                phoneRelationEntityRepository$deleteAllNotInHashes$1.label = i7 - Integer.MIN_VALUE;
            } else {
                phoneRelationEntityRepository$deleteAllNotInHashes$1 = new PhoneRelationEntityRepository$deleteAllNotInHashes$1(this, continuation);
            }
        }
        java.lang.Object obj = phoneRelationEntityRepository$deleteAllNotInHashes$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = phoneRelationEntityRepository$deleteAllNotInHashes$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = phoneRelationEntityRepository$deleteAllNotInHashes$1.J$0;
                    i4 = phoneRelationEntityRepository$deleteAllNotInHashes$1.I$2;
                    i3 = phoneRelationEntityRepository$deleteAllNotInHashes$1.I$1;
                    i = phoneRelationEntityRepository$deleteAllNotInHashes$1.I$0;
                    objectRef5 = (Ref.ObjectRef) phoneRelationEntityRepository$deleteAllNotInHashes$1.L$7;
                    longRef3 = (Ref.LongRef) phoneRelationEntityRepository$deleteAllNotInHashes$1.L$6;
                    objectRef4 = (Ref.ObjectRef) phoneRelationEntityRepository$deleteAllNotInHashes$1.L$5;
                    objectRef2 = (Ref.ObjectRef) phoneRelationEntityRepository$deleteAllNotInHashes$1.L$4;
                    longRef2 = (Ref.LongRef) phoneRelationEntityRepository$deleteAllNotInHashes$1.L$3;
                    baseDaoEZpvd = (BaseDao) phoneRelationEntityRepository$deleteAllNotInHashes$1.L$2;
                    set4 = (java.util.Set) phoneRelationEntityRepository$deleteAllNotInHashes$1.L$1;
                    c44358sMw2 = (C44358sMw) phoneRelationEntityRepository$deleteAllNotInHashes$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        set3 = set4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        phoneRelationEntityRepository$deleteAllNotInHashes$12 = phoneRelationEntityRepository$deleteAllNotInHashes$1;
                        i2 = i + i;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                        throw th;
                    }
                    ?? r02 = Unit.INSTANCE;
                    objectRef5.element = r02;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return r02;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = phoneRelationEntityRepository$deleteAllNotInHashes$1.I$1;
                int i12 = phoneRelationEntityRepository$deleteAllNotInHashes$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) phoneRelationEntityRepository$deleteAllNotInHashes$1.L$4;
                longRef4 = (Ref.LongRef) phoneRelationEntityRepository$deleteAllNotInHashes$1.L$3;
                BaseDao baseDao3 = (BaseDao) phoneRelationEntityRepository$deleteAllNotInHashes$1.L$2;
                java.util.Set<java.lang.String> set5 = (java.util.Set) phoneRelationEntityRepository$deleteAllNotInHashes$1.L$1;
                c44358sMw3 = (C44358sMw) phoneRelationEntityRepository$deleteAllNotInHashes$1.L$0;
                C56391yDq.AEQbTJ(obj);
                PhoneRelationEntityRepository$deleteAllNotInHashes$1 phoneRelationEntityRepository$deleteAllNotInHashes$13 = phoneRelationEntityRepository$deleteAllNotInHashes$1;
                int i13 = 1;
                baseDaoEZpvd = baseDao3;
                set2 = set5;
                i = i12;
                objectRef = objectRef6;
                phoneRelationEntityRepository$deleteAllNotInHashes$12 = phoneRelationEntityRepository$deleteAllNotInHashes$13;
                i2 = i11 + i13;
                c44358sMw = c44358sMw3;
                longRef3 = longRef4;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            longRef2 = longRef3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            longRef2 = longRef3;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        set3 = set2;
                        phoneRelationEntityRepository$deleteAllNotInHashes$1 = phoneRelationEntityRepository$deleteAllNotInHashes$12;
                        c44358sMw2 = c44358sMw;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            phoneRelationEntityRepository$deleteAllNotInHashes$1.L$0 = c44358sMw3;
                            phoneRelationEntityRepository$deleteAllNotInHashes$1.L$1 = set3;
                            phoneRelationEntityRepository$deleteAllNotInHashes$1.L$2 = baseDao2;
                            phoneRelationEntityRepository$deleteAllNotInHashes$1.L$3 = longRef4;
                            phoneRelationEntityRepository$deleteAllNotInHashes$1.L$4 = objectRef3;
                            phoneRelationEntityRepository$deleteAllNotInHashes$1.L$5 = null;
                            phoneRelationEntityRepository$deleteAllNotInHashes$1.L$6 = null;
                            phoneRelationEntityRepository$deleteAllNotInHashes$1.L$7 = null;
                            phoneRelationEntityRepository$deleteAllNotInHashes$1.I$0 = i6;
                            phoneRelationEntityRepository$deleteAllNotInHashes$1.I$1 = i5;
                            phoneRelationEntityRepository$deleteAllNotInHashes$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, phoneRelationEntityRepository$deleteAllNotInHashes$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            phoneRelationEntityRepository$deleteAllNotInHashes$13 = phoneRelationEntityRepository$deleteAllNotInHashes$1;
                            i11 = i5;
                            set2 = set3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoEZpvd = baseDao4;
                        } else {
                            phoneRelationEntityRepository$deleteAllNotInHashes$13 = phoneRelationEntityRepository$deleteAllNotInHashes$1;
                            i11 = i5;
                            set2 = set3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoEZpvd = baseDao5;
                        }
                        phoneRelationEntityRepository$deleteAllNotInHashes$12 = phoneRelationEntityRepository$deleteAllNotInHashes$13;
                        i2 = i11 + i13;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        set3 = set2;
                        phoneRelationEntityRepository$deleteAllNotInHashes$1 = phoneRelationEntityRepository$deleteAllNotInHashes$12;
                        c44358sMw2 = c44358sMw;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        phoneRelationEntityRepository$deleteAllNotInHashes$12 = phoneRelationEntityRepository$deleteAllNotInHashes$13;
                        i2 = i11 + i13;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    PhoneRelationEntityDao phoneRelationEntityDaoEZpvd = c44358sMw.EZpvd();
                    phoneRelationEntityRepository$deleteAllNotInHashes$12.L$0 = c44358sMw;
                    phoneRelationEntityRepository$deleteAllNotInHashes$12.L$1 = set2;
                    phoneRelationEntityRepository$deleteAllNotInHashes$12.L$2 = baseDaoEZpvd;
                    phoneRelationEntityRepository$deleteAllNotInHashes$12.L$3 = longRef3;
                    phoneRelationEntityRepository$deleteAllNotInHashes$12.L$4 = objectRef;
                    phoneRelationEntityRepository$deleteAllNotInHashes$12.L$5 = objectRef5;
                    phoneRelationEntityRepository$deleteAllNotInHashes$12.L$6 = longRef3;
                    phoneRelationEntityRepository$deleteAllNotInHashes$12.L$7 = objectRef5;
                    phoneRelationEntityRepository$deleteAllNotInHashes$12.I$0 = i;
                    phoneRelationEntityRepository$deleteAllNotInHashes$12.I$1 = i2;
                    phoneRelationEntityRepository$deleteAllNotInHashes$12.I$2 = i2;
                    phoneRelationEntityRepository$deleteAllNotInHashes$12.J$0 = jNanoTime;
                    phoneRelationEntityRepository$deleteAllNotInHashes$12.label = 1;
                    if (phoneRelationEntityDaoEZpvd.deleteAllNotInHashes(set2, phoneRelationEntityRepository$deleteAllNotInHashes$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    set4 = set2;
                    phoneRelationEntityRepository$deleteAllNotInHashes$1 = phoneRelationEntityRepository$deleteAllNotInHashes$12;
                    c44358sMw2 = c44358sMw;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoEZpvd;
                    i6 = i14;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        c44358sMw3 = c44358sMw2;
                        objectRef3 = objectRef2;
                        set3 = set4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        phoneRelationEntityRepository$deleteAllNotInHashes$12 = phoneRelationEntityRepository$deleteAllNotInHashes$13;
                        i2 = i11 + i13;
                        c44358sMw = c44358sMw3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    ?? r022 = Unit.INSTANCE;
                    objectRef5.element = r022;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return r022;
                }
                C44159sFm.EZpvd(baseDaoEZpvd, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoEZpvd = EZpvd();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            c44358sMw = this;
            phoneRelationEntityRepository$deleteAllNotInHashes$12 = phoneRelationEntityRepository$deleteAllNotInHashes$1;
            set2 = set;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoEZpvd = baseDao;
        }
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao
    public java.lang.Object deleteAllNotInHashesInternal(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super Unit> continuation) {
        throw new java.lang.UnsupportedOperationException("internal call");
    }
}
