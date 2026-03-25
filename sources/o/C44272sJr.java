package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.group.repository.local.GroupInfoRepository$fetchGroupInfo$1;
import com.okinc.okimcore.feature.group.repository.local.GroupInfoRepository$getGroupInfo$1;
import com.okinc.okimcore.feature.group.repository.local.GroupInfoRepository$insertGroupInfo$1;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.InHouseIMGroupInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sJr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44272sJr {
    public final sIC AEQbTJ;
    public final InHouseIMGroupService OLrzqt;

    @yCM
    public C44272sJr(@NotNull sIC sic, @NotNull InHouseIMGroupService inHouseIMGroupService) {
        Intrinsics.checkNotNullParameter(sic, "");
        Intrinsics.checkNotNullParameter(inHouseIMGroupService, "");
        this.AEQbTJ = sic;
        this.OLrzqt = inHouseIMGroupService;
    }

    public final InHouseIMGroupInfoDao AEQbTJ() {
        return this.AEQbTJ.copydefault().EZpvd();
    }

    /* JADX DEBUG: Duplicate block (B:76:0x01a2) to fix multi-entry loop: BACK_EDGE: B:76:0x01a2 -> B:77:0x01ac */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v44, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01b3: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:78:0x01b3 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b4: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:78:0x01b3 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0137, B:55:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0151, B:64:0x0154, B:65:0x0155, B:66:0x0158, B:70:0x016e, B:72:0x017b), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017b A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0137, B:55:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0151, B:64:0x0154, B:65:0x0155, B:66:0x0158, B:70:0x016e, B:72:0x017b), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMGroupEntity> continuation) throws java.lang.Exception {
        GroupInfoRepository$getGroupInfo$1 groupInfoRepository$getGroupInfo$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoAEQbTJ;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        C44272sJr c44272sJr;
        GroupInfoRepository$getGroupInfo$1 groupInfoRepository$getGroupInfo$12;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.lang.String str3;
        Ref.ObjectRef objectRef2;
        int i4;
        C44272sJr c44272sJr2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        C44272sJr c44272sJr3;
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
        java.lang.String str4;
        T t;
        if (continuation instanceof GroupInfoRepository$getGroupInfo$1) {
            groupInfoRepository$getGroupInfo$1 = (GroupInfoRepository$getGroupInfo$1) continuation;
            int i7 = groupInfoRepository$getGroupInfo$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                groupInfoRepository$getGroupInfo$1.label = i7 - Integer.MIN_VALUE;
            } else {
                groupInfoRepository$getGroupInfo$1 = new GroupInfoRepository$getGroupInfo$1(this, continuation);
            }
        }
        java.lang.Object obj = groupInfoRepository$getGroupInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = groupInfoRepository$getGroupInfo$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = groupInfoRepository$getGroupInfo$1.J$0;
                    i4 = groupInfoRepository$getGroupInfo$1.I$2;
                    i3 = groupInfoRepository$getGroupInfo$1.I$1;
                    i = groupInfoRepository$getGroupInfo$1.I$0;
                    objectRef5 = (Ref.ObjectRef) groupInfoRepository$getGroupInfo$1.L$7;
                    longRef3 = (Ref.LongRef) groupInfoRepository$getGroupInfo$1.L$6;
                    objectRef4 = (Ref.ObjectRef) groupInfoRepository$getGroupInfo$1.L$5;
                    objectRef2 = (Ref.ObjectRef) groupInfoRepository$getGroupInfo$1.L$4;
                    longRef2 = (Ref.LongRef) groupInfoRepository$getGroupInfo$1.L$3;
                    baseDaoAEQbTJ = (BaseDao) groupInfoRepository$getGroupInfo$1.L$2;
                    str4 = (java.lang.String) groupInfoRepository$getGroupInfo$1.L$1;
                    c44272sJr2 = (C44272sJr) groupInfoRepository$getGroupInfo$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoAEQbTJ;
                        i6 = i;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        str3 = str4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44272sJr3 = c44272sJr2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoAEQbTJ;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        groupInfoRepository$getGroupInfo$12 = groupInfoRepository$getGroupInfo$1;
                        i2 = i + i;
                        c44272sJr = c44272sJr3;
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
                        C44159sFm.EZpvd(baseDaoAEQbTJ, longRef2.element);
                        throw th;
                    }
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return t2;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = groupInfoRepository$getGroupInfo$1.I$1;
                int i12 = groupInfoRepository$getGroupInfo$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) groupInfoRepository$getGroupInfo$1.L$4;
                longRef4 = (Ref.LongRef) groupInfoRepository$getGroupInfo$1.L$3;
                BaseDao baseDao3 = (BaseDao) groupInfoRepository$getGroupInfo$1.L$2;
                java.lang.String str5 = (java.lang.String) groupInfoRepository$getGroupInfo$1.L$1;
                c44272sJr3 = (C44272sJr) groupInfoRepository$getGroupInfo$1.L$0;
                C56391yDq.AEQbTJ(obj);
                GroupInfoRepository$getGroupInfo$1 groupInfoRepository$getGroupInfo$13 = groupInfoRepository$getGroupInfo$1;
                int i13 = 1;
                baseDaoAEQbTJ = baseDao3;
                str2 = str5;
                i = i12;
                objectRef = objectRef6;
                groupInfoRepository$getGroupInfo$12 = groupInfoRepository$getGroupInfo$13;
                i2 = i11 + i13;
                c44272sJr = c44272sJr3;
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
                            C44159sFm.EZpvd(baseDaoAEQbTJ, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        str3 = str2;
                        groupInfoRepository$getGroupInfo$1 = groupInfoRepository$getGroupInfo$12;
                        c44272sJr2 = c44272sJr;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        c44272sJr3 = c44272sJr2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoAEQbTJ;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            groupInfoRepository$getGroupInfo$1.L$0 = c44272sJr3;
                            groupInfoRepository$getGroupInfo$1.L$1 = str3;
                            groupInfoRepository$getGroupInfo$1.L$2 = baseDao2;
                            groupInfoRepository$getGroupInfo$1.L$3 = longRef4;
                            groupInfoRepository$getGroupInfo$1.L$4 = objectRef3;
                            groupInfoRepository$getGroupInfo$1.L$5 = null;
                            groupInfoRepository$getGroupInfo$1.L$6 = null;
                            groupInfoRepository$getGroupInfo$1.L$7 = null;
                            groupInfoRepository$getGroupInfo$1.I$0 = i6;
                            groupInfoRepository$getGroupInfo$1.I$1 = i5;
                            groupInfoRepository$getGroupInfo$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, groupInfoRepository$getGroupInfo$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            groupInfoRepository$getGroupInfo$13 = groupInfoRepository$getGroupInfo$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoAEQbTJ = baseDao4;
                        } else {
                            groupInfoRepository$getGroupInfo$13 = groupInfoRepository$getGroupInfo$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoAEQbTJ = baseDao5;
                        }
                        groupInfoRepository$getGroupInfo$12 = groupInfoRepository$getGroupInfo$13;
                        i2 = i11 + i13;
                        c44272sJr = c44272sJr3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        str3 = str2;
                        groupInfoRepository$getGroupInfo$1 = groupInfoRepository$getGroupInfo$12;
                        c44272sJr2 = c44272sJr;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44272sJr3 = c44272sJr2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoAEQbTJ;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        groupInfoRepository$getGroupInfo$12 = groupInfoRepository$getGroupInfo$13;
                        i2 = i11 + i13;
                        c44272sJr = c44272sJr3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMGroupInfoDao inHouseIMGroupInfoDaoAEQbTJ = c44272sJr.AEQbTJ();
                    groupInfoRepository$getGroupInfo$12.L$0 = c44272sJr;
                    groupInfoRepository$getGroupInfo$12.L$1 = str2;
                    groupInfoRepository$getGroupInfo$12.L$2 = baseDaoAEQbTJ;
                    groupInfoRepository$getGroupInfo$12.L$3 = longRef3;
                    groupInfoRepository$getGroupInfo$12.L$4 = objectRef;
                    groupInfoRepository$getGroupInfo$12.L$5 = objectRef5;
                    groupInfoRepository$getGroupInfo$12.L$6 = longRef3;
                    groupInfoRepository$getGroupInfo$12.L$7 = objectRef5;
                    groupInfoRepository$getGroupInfo$12.I$0 = i;
                    groupInfoRepository$getGroupInfo$12.I$1 = i2;
                    groupInfoRepository$getGroupInfo$12.I$2 = i2;
                    groupInfoRepository$getGroupInfo$12.J$0 = jNanoTime;
                    groupInfoRepository$getGroupInfo$12.label = 1;
                    java.lang.Object groupInfoById = inHouseIMGroupInfoDaoAEQbTJ.getGroupInfoById(str2, groupInfoRepository$getGroupInfo$12);
                    if (groupInfoById == objCopydefault) {
                        return objCopydefault;
                    }
                    str4 = str2;
                    groupInfoRepository$getGroupInfo$1 = groupInfoRepository$getGroupInfo$12;
                    c44272sJr2 = c44272sJr;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoAEQbTJ;
                    i6 = i14;
                    t = groupInfoById;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        c44272sJr3 = c44272sJr2;
                        objectRef3 = objectRef2;
                        str3 = str4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        groupInfoRepository$getGroupInfo$12 = groupInfoRepository$getGroupInfo$13;
                        i2 = i11 + i13;
                        c44272sJr = c44272sJr3;
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
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDaoAEQbTJ, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoAEQbTJ = AEQbTJ();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            c44272sJr = this;
            groupInfoRepository$getGroupInfo$12 = groupInfoRepository$getGroupInfo$1;
            str2 = str;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoAEQbTJ = baseDao;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull InHouseIMGroupEntity inHouseIMGroupEntity, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        GroupInfoRepository$insertGroupInfo$1 groupInfoRepository$insertGroupInfo$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoAEQbTJ;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        C44272sJr c44272sJr;
        GroupInfoRepository$insertGroupInfo$1 groupInfoRepository$insertGroupInfo$12;
        InHouseIMGroupEntity inHouseIMGroupEntity2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        InHouseIMGroupEntity inHouseIMGroupEntity3;
        Ref.ObjectRef objectRef2;
        int i4;
        C44272sJr c44272sJr2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        C44272sJr c44272sJr3;
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
        InHouseIMGroupEntity inHouseIMGroupEntity4;
        if (continuation instanceof GroupInfoRepository$insertGroupInfo$1) {
            groupInfoRepository$insertGroupInfo$1 = (GroupInfoRepository$insertGroupInfo$1) continuation;
            int i7 = groupInfoRepository$insertGroupInfo$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                groupInfoRepository$insertGroupInfo$1.label = i7 - Integer.MIN_VALUE;
            } else {
                groupInfoRepository$insertGroupInfo$1 = new GroupInfoRepository$insertGroupInfo$1(this, continuation);
            }
        }
        java.lang.Object obj = groupInfoRepository$insertGroupInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = groupInfoRepository$insertGroupInfo$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = groupInfoRepository$insertGroupInfo$1.J$0;
                    i4 = groupInfoRepository$insertGroupInfo$1.I$2;
                    i3 = groupInfoRepository$insertGroupInfo$1.I$1;
                    i = groupInfoRepository$insertGroupInfo$1.I$0;
                    objectRef5 = (Ref.ObjectRef) groupInfoRepository$insertGroupInfo$1.L$7;
                    longRef3 = (Ref.LongRef) groupInfoRepository$insertGroupInfo$1.L$6;
                    objectRef4 = (Ref.ObjectRef) groupInfoRepository$insertGroupInfo$1.L$5;
                    objectRef2 = (Ref.ObjectRef) groupInfoRepository$insertGroupInfo$1.L$4;
                    longRef2 = (Ref.LongRef) groupInfoRepository$insertGroupInfo$1.L$3;
                    baseDaoAEQbTJ = (BaseDao) groupInfoRepository$insertGroupInfo$1.L$2;
                    inHouseIMGroupEntity4 = (InHouseIMGroupEntity) groupInfoRepository$insertGroupInfo$1.L$1;
                    c44272sJr2 = (C44272sJr) groupInfoRepository$insertGroupInfo$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoAEQbTJ;
                        i6 = i;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        inHouseIMGroupEntity3 = inHouseIMGroupEntity4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44272sJr3 = c44272sJr2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoAEQbTJ;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        groupInfoRepository$insertGroupInfo$12 = groupInfoRepository$insertGroupInfo$1;
                        i2 = i + i;
                        c44272sJr = c44272sJr3;
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
                        C44159sFm.EZpvd(baseDaoAEQbTJ, longRef2.element);
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
                int i11 = groupInfoRepository$insertGroupInfo$1.I$1;
                int i12 = groupInfoRepository$insertGroupInfo$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) groupInfoRepository$insertGroupInfo$1.L$4;
                longRef4 = (Ref.LongRef) groupInfoRepository$insertGroupInfo$1.L$3;
                BaseDao baseDao3 = (BaseDao) groupInfoRepository$insertGroupInfo$1.L$2;
                InHouseIMGroupEntity inHouseIMGroupEntity5 = (InHouseIMGroupEntity) groupInfoRepository$insertGroupInfo$1.L$1;
                c44272sJr3 = (C44272sJr) groupInfoRepository$insertGroupInfo$1.L$0;
                C56391yDq.AEQbTJ(obj);
                GroupInfoRepository$insertGroupInfo$1 groupInfoRepository$insertGroupInfo$13 = groupInfoRepository$insertGroupInfo$1;
                int i13 = 1;
                baseDaoAEQbTJ = baseDao3;
                inHouseIMGroupEntity2 = inHouseIMGroupEntity5;
                i = i12;
                objectRef = objectRef6;
                groupInfoRepository$insertGroupInfo$12 = groupInfoRepository$insertGroupInfo$13;
                i2 = i11 + i13;
                c44272sJr = c44272sJr3;
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
                            C44159sFm.EZpvd(baseDaoAEQbTJ, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        inHouseIMGroupEntity3 = inHouseIMGroupEntity2;
                        groupInfoRepository$insertGroupInfo$1 = groupInfoRepository$insertGroupInfo$12;
                        c44272sJr2 = c44272sJr;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        c44272sJr3 = c44272sJr2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoAEQbTJ;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            groupInfoRepository$insertGroupInfo$1.L$0 = c44272sJr3;
                            groupInfoRepository$insertGroupInfo$1.L$1 = inHouseIMGroupEntity3;
                            groupInfoRepository$insertGroupInfo$1.L$2 = baseDao2;
                            groupInfoRepository$insertGroupInfo$1.L$3 = longRef4;
                            groupInfoRepository$insertGroupInfo$1.L$4 = objectRef3;
                            groupInfoRepository$insertGroupInfo$1.L$5 = null;
                            groupInfoRepository$insertGroupInfo$1.L$6 = null;
                            groupInfoRepository$insertGroupInfo$1.L$7 = null;
                            groupInfoRepository$insertGroupInfo$1.I$0 = i6;
                            groupInfoRepository$insertGroupInfo$1.I$1 = i5;
                            groupInfoRepository$insertGroupInfo$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, groupInfoRepository$insertGroupInfo$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            groupInfoRepository$insertGroupInfo$13 = groupInfoRepository$insertGroupInfo$1;
                            i11 = i5;
                            inHouseIMGroupEntity2 = inHouseIMGroupEntity3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoAEQbTJ = baseDao4;
                        } else {
                            groupInfoRepository$insertGroupInfo$13 = groupInfoRepository$insertGroupInfo$1;
                            i11 = i5;
                            inHouseIMGroupEntity2 = inHouseIMGroupEntity3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoAEQbTJ = baseDao5;
                        }
                        groupInfoRepository$insertGroupInfo$12 = groupInfoRepository$insertGroupInfo$13;
                        i2 = i11 + i13;
                        c44272sJr = c44272sJr3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        inHouseIMGroupEntity3 = inHouseIMGroupEntity2;
                        groupInfoRepository$insertGroupInfo$1 = groupInfoRepository$insertGroupInfo$12;
                        c44272sJr2 = c44272sJr;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44272sJr3 = c44272sJr2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoAEQbTJ;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        groupInfoRepository$insertGroupInfo$12 = groupInfoRepository$insertGroupInfo$13;
                        i2 = i11 + i13;
                        c44272sJr = c44272sJr3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMGroupInfoDao inHouseIMGroupInfoDaoAEQbTJ = c44272sJr.AEQbTJ();
                    groupInfoRepository$insertGroupInfo$12.L$0 = c44272sJr;
                    groupInfoRepository$insertGroupInfo$12.L$1 = inHouseIMGroupEntity2;
                    groupInfoRepository$insertGroupInfo$12.L$2 = baseDaoAEQbTJ;
                    groupInfoRepository$insertGroupInfo$12.L$3 = longRef3;
                    groupInfoRepository$insertGroupInfo$12.L$4 = objectRef;
                    groupInfoRepository$insertGroupInfo$12.L$5 = objectRef5;
                    groupInfoRepository$insertGroupInfo$12.L$6 = longRef3;
                    groupInfoRepository$insertGroupInfo$12.L$7 = objectRef5;
                    groupInfoRepository$insertGroupInfo$12.I$0 = i;
                    groupInfoRepository$insertGroupInfo$12.I$1 = i2;
                    groupInfoRepository$insertGroupInfo$12.I$2 = i2;
                    groupInfoRepository$insertGroupInfo$12.J$0 = jNanoTime;
                    groupInfoRepository$insertGroupInfo$12.label = 1;
                    if (inHouseIMGroupInfoDaoAEQbTJ.insert(inHouseIMGroupEntity2, groupInfoRepository$insertGroupInfo$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    inHouseIMGroupEntity4 = inHouseIMGroupEntity2;
                    groupInfoRepository$insertGroupInfo$1 = groupInfoRepository$insertGroupInfo$12;
                    c44272sJr2 = c44272sJr;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoAEQbTJ;
                    i6 = i14;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        c44272sJr3 = c44272sJr2;
                        objectRef3 = objectRef2;
                        inHouseIMGroupEntity3 = inHouseIMGroupEntity4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        groupInfoRepository$insertGroupInfo$12 = groupInfoRepository$insertGroupInfo$13;
                        i2 = i11 + i13;
                        c44272sJr = c44272sJr3;
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
                C44159sFm.EZpvd(baseDaoAEQbTJ, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoAEQbTJ = AEQbTJ();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            c44272sJr = this;
            groupInfoRepository$insertGroupInfo$12 = groupInfoRepository$insertGroupInfo$1;
            inHouseIMGroupEntity2 = inHouseIMGroupEntity;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoAEQbTJ = baseDao;
        }
    }

    /* JADX DEBUG: Duplicate block (B:87:0x01fb) to fix multi-entry loop: BACK_EDGE: B:87:0x01fb -> B:16:0x0056 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x01b4: MOVE (r14 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:77:0x01b4 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x01b5: MOVE (r13 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:77:0x01b4 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a0 A[Catch: all -> 0x005d, TryCatch #13 {all -> 0x005d, blocks: (B:14:0x004b, B:65:0x0193, B:66:0x0196, B:69:0x019a, B:71:0x01a0, B:73:0x01ac, B:74:0x01af, B:75:0x01b0, B:76:0x01b3), top: B:102:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d1 A[Catch: all -> 0x0209, TRY_LEAVE, TryCatch #5 {all -> 0x0209, blocks: (B:81:0x01c4, B:83:0x01d1), top: B:100:0x01c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0214  */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMGroupEntity> continuation) throws java.lang.Exception {
        GroupInfoRepository$fetchGroupInfo$1 groupInfoRepository$fetchGroupInfo$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        C44272sJr c44272sJr;
        BaseDao baseDaoAEQbTJ;
        InHouseIMGroupEntity inHouseIMGroupEntity;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        C44272sJr c44272sJr2;
        InHouseIMGroupEntity inHouseIMGroupEntity2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        InHouseIMGroupEntity inHouseIMGroupEntity3;
        BaseDao baseDao3;
        Ref.ObjectRef objectRef2;
        int i3;
        int i4;
        C44272sJr c44272sJr3;
        ?? r0;
        Ref.ObjectRef objectRef3;
        int i5;
        InHouseIMGroupEntity inHouseIMGroupEntity4;
        Ref.LongRef longRef4;
        BaseDao baseDao4;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        Ref.LongRef longRef5;
        int i6;
        int i7;
        int i8;
        C44272sJr c44272sJr4;
        InHouseIMGroupEntity inHouseIMGroupEntity5;
        long j;
        Ref.ObjectRef objectRef6;
        if (continuation instanceof GroupInfoRepository$fetchGroupInfo$1) {
            groupInfoRepository$fetchGroupInfo$1 = (GroupInfoRepository$fetchGroupInfo$1) continuation;
            int i9 = groupInfoRepository$fetchGroupInfo$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                groupInfoRepository$fetchGroupInfo$1.label = i9 - Integer.MIN_VALUE;
            } else {
                groupInfoRepository$fetchGroupInfo$1 = new GroupInfoRepository$fetchGroupInfo$1(this, continuation);
            }
        }
        java.lang.Object groupInfoById$default = groupInfoRepository$fetchGroupInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i10 = groupInfoRepository$fetchGroupInfo$1.label;
        try {
            if (i10 == 0) {
                C56391yDq.AEQbTJ(groupInfoById$default);
                InHouseIMGroupService inHouseIMGroupService = this.OLrzqt;
                long jValueOf = C33129mqd.valueOf(str);
                groupInfoRepository$fetchGroupInfo$1.L$0 = this;
                groupInfoRepository$fetchGroupInfo$1.label = 1;
                groupInfoById$default = InHouseIMGroupService.Activity.getGroupInfoById$default(inHouseIMGroupService, jValueOf, null, groupInfoRepository$fetchGroupInfo$1, 2, null);
                if (groupInfoById$default == objCopydefault) {
                    return objCopydefault;
                }
                c44272sJr = this;
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        long j2 = groupInfoRepository$fetchGroupInfo$1.J$0;
                        int i11 = groupInfoRepository$fetchGroupInfo$1.I$2;
                        int i12 = groupInfoRepository$fetchGroupInfo$1.I$1;
                        int i13 = groupInfoRepository$fetchGroupInfo$1.I$0;
                        Ref.ObjectRef objectRef7 = (Ref.ObjectRef) groupInfoRepository$fetchGroupInfo$1.L$8;
                        Ref.LongRef longRef6 = (Ref.LongRef) groupInfoRepository$fetchGroupInfo$1.L$7;
                        Ref.ObjectRef objectRef8 = (Ref.ObjectRef) groupInfoRepository$fetchGroupInfo$1.L$6;
                        Ref.ObjectRef objectRef9 = (Ref.ObjectRef) groupInfoRepository$fetchGroupInfo$1.L$5;
                        longRef2 = (Ref.LongRef) groupInfoRepository$fetchGroupInfo$1.L$4;
                        baseDao2 = (BaseDao) groupInfoRepository$fetchGroupInfo$1.L$3;
                        inHouseIMGroupEntity = (InHouseIMGroupEntity) groupInfoRepository$fetchGroupInfo$1.L$2;
                        InHouseIMGroupEntity inHouseIMGroupEntity6 = (InHouseIMGroupEntity) groupInfoRepository$fetchGroupInfo$1.L$1;
                        C44272sJr c44272sJr5 = (C44272sJr) groupInfoRepository$fetchGroupInfo$1.L$0;
                        try {
                            C56391yDq.AEQbTJ(groupInfoById$default);
                            objectRef6 = objectRef7;
                            i7 = i12;
                            c44272sJr4 = c44272sJr5;
                            inHouseIMGroupEntity5 = inHouseIMGroupEntity6;
                            j = j2;
                            inHouseIMGroupEntity4 = inHouseIMGroupEntity;
                            longRef4 = longRef2;
                            baseDao4 = baseDao2;
                            objectRef4 = objectRef8;
                            objectRef5 = objectRef9;
                            longRef5 = longRef6;
                            i6 = i13;
                            i8 = i11;
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                            inHouseIMGroupEntity3 = inHouseIMGroupEntity6;
                            c44272sJr3 = c44272sJr5;
                            i4 = i12;
                            i3 = i13;
                            baseDao3 = baseDao2;
                            i = i11;
                            objectRef2 = objectRef9;
                            r0 = e3;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i < i3 - 1) {
                                groupInfoRepository$fetchGroupInfo$1.L$0 = c44272sJr3;
                                groupInfoRepository$fetchGroupInfo$1.L$1 = inHouseIMGroupEntity3;
                                groupInfoRepository$fetchGroupInfo$1.L$2 = inHouseIMGroupEntity;
                                groupInfoRepository$fetchGroupInfo$1.L$3 = baseDao3;
                                groupInfoRepository$fetchGroupInfo$1.L$4 = longRef2;
                                groupInfoRepository$fetchGroupInfo$1.L$5 = objectRef2;
                                groupInfoRepository$fetchGroupInfo$1.L$6 = null;
                                groupInfoRepository$fetchGroupInfo$1.L$7 = null;
                                groupInfoRepository$fetchGroupInfo$1.L$8 = null;
                                groupInfoRepository$fetchGroupInfo$1.I$0 = i3;
                                groupInfoRepository$fetchGroupInfo$1.I$1 = i4;
                                groupInfoRepository$fetchGroupInfo$1.label = 3;
                                if (DelayKt.delay(((long) (i + 1)) * 50, groupInfoRepository$fetchGroupInfo$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                objectRef3 = objectRef2;
                                c44272sJr2 = c44272sJr3;
                                i5 = 1;
                            } else {
                                objectRef3 = objectRef2;
                                c44272sJr2 = c44272sJr3;
                                i5 = 1;
                            }
                            BaseDao baseDao5 = baseDao3;
                            i2 = i3;
                            baseDaoAEQbTJ = baseDao5;
                            objectRef = objectRef3;
                            i = i4 + i5;
                            inHouseIMGroupEntity2 = inHouseIMGroupEntity3;
                            longRef3 = longRef2;
                            if (i < i2) {
                            }
                        } catch (java.lang.IllegalStateException e4) {
                            e2 = e4;
                            message = e2.getMessage();
                            if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                C44159sFm.OLrzqt(e2);
                                throw e2;
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e5) {
                            e = e5;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                        objectRef6.element = Unit.INSTANCE;
                        longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                        T t = objectRef4.element;
                        C44159sFm.EZpvd(baseDao4, longRef4.element);
                        return inHouseIMGroupEntity5;
                    }
                    if (i10 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = groupInfoRepository$fetchGroupInfo$1.I$1;
                    i3 = groupInfoRepository$fetchGroupInfo$1.I$0;
                    Ref.ObjectRef objectRef10 = (Ref.ObjectRef) groupInfoRepository$fetchGroupInfo$1.L$5;
                    Ref.LongRef longRef7 = (Ref.LongRef) groupInfoRepository$fetchGroupInfo$1.L$4;
                    baseDao3 = (BaseDao) groupInfoRepository$fetchGroupInfo$1.L$3;
                    InHouseIMGroupEntity inHouseIMGroupEntity7 = (InHouseIMGroupEntity) groupInfoRepository$fetchGroupInfo$1.L$2;
                    inHouseIMGroupEntity3 = (InHouseIMGroupEntity) groupInfoRepository$fetchGroupInfo$1.L$1;
                    C44272sJr c44272sJr6 = (C44272sJr) groupInfoRepository$fetchGroupInfo$1.L$0;
                    C56391yDq.AEQbTJ(groupInfoById$default);
                    objectRef3 = objectRef10;
                    longRef2 = longRef7;
                    c44272sJr2 = c44272sJr6;
                    i5 = 1;
                    inHouseIMGroupEntity = inHouseIMGroupEntity7;
                    BaseDao baseDao52 = baseDao3;
                    i2 = i3;
                    baseDaoAEQbTJ = baseDao52;
                    objectRef = objectRef3;
                    i = i4 + i5;
                    inHouseIMGroupEntity2 = inHouseIMGroupEntity3;
                    longRef3 = longRef2;
                    if (i < i2) {
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                            try {
                                C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                                objectRef2.element = r0;
                                if (i < i3 - 1) {
                                }
                                BaseDao baseDao522 = baseDao3;
                                i2 = i3;
                                baseDaoAEQbTJ = baseDao522;
                                objectRef = objectRef3;
                                i = i4 + i5;
                                inHouseIMGroupEntity2 = inHouseIMGroupEntity3;
                                longRef3 = longRef2;
                                if (i < i2) {
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                baseDaoAEQbTJ = baseDao3;
                                longRef3 = longRef2;
                                baseDao2 = baseDaoAEQbTJ;
                                longRef2 = longRef3;
                                C44159sFm.EZpvd(baseDao2, longRef2.element);
                                throw th;
                            }
                            c44272sJr3 = c44272sJr2;
                            longRef2 = longRef3;
                            objectRef2 = objectRef;
                            inHouseIMGroupEntity3 = inHouseIMGroupEntity2;
                            i4 = i;
                            int i14 = i2;
                            baseDao3 = baseDaoAEQbTJ;
                            i3 = i14;
                            r0 = e6;
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
                            baseDao2 = baseDaoAEQbTJ;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                        Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
                        long jNanoTime = java.lang.System.nanoTime();
                        InHouseIMGroupInfoDao inHouseIMGroupInfoDaoAEQbTJ = c44272sJr2.AEQbTJ();
                        groupInfoRepository$fetchGroupInfo$1.L$0 = c44272sJr2;
                        groupInfoRepository$fetchGroupInfo$1.L$1 = inHouseIMGroupEntity2;
                        groupInfoRepository$fetchGroupInfo$1.L$2 = inHouseIMGroupEntity;
                        groupInfoRepository$fetchGroupInfo$1.L$3 = baseDaoAEQbTJ;
                        groupInfoRepository$fetchGroupInfo$1.L$4 = longRef3;
                        groupInfoRepository$fetchGroupInfo$1.L$5 = objectRef;
                        groupInfoRepository$fetchGroupInfo$1.L$6 = objectRef11;
                        groupInfoRepository$fetchGroupInfo$1.L$7 = longRef3;
                        groupInfoRepository$fetchGroupInfo$1.L$8 = objectRef11;
                        groupInfoRepository$fetchGroupInfo$1.I$0 = i2;
                        groupInfoRepository$fetchGroupInfo$1.I$1 = i;
                        groupInfoRepository$fetchGroupInfo$1.I$2 = i;
                        groupInfoRepository$fetchGroupInfo$1.J$0 = jNanoTime;
                        groupInfoRepository$fetchGroupInfo$1.label = 2;
                        if (inHouseIMGroupInfoDaoAEQbTJ.insert(inHouseIMGroupEntity, groupInfoRepository$fetchGroupInfo$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        baseDao4 = baseDaoAEQbTJ;
                        objectRef6 = objectRef11;
                        inHouseIMGroupEntity4 = inHouseIMGroupEntity;
                        longRef4 = longRef3;
                        i7 = i;
                        i6 = i2;
                        c44272sJr4 = c44272sJr2;
                        i8 = i7;
                        inHouseIMGroupEntity5 = inHouseIMGroupEntity2;
                        j = jNanoTime;
                        objectRef4 = objectRef6;
                        objectRef5 = objectRef;
                        longRef5 = longRef4;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                            c44272sJr3 = c44272sJr4;
                            i = i8;
                            i4 = i7;
                            i3 = i6;
                            baseDao3 = baseDao4;
                            longRef2 = longRef4;
                            inHouseIMGroupEntity = inHouseIMGroupEntity4;
                            inHouseIMGroupEntity3 = inHouseIMGroupEntity5;
                            objectRef2 = objectRef5;
                            r0 = e9;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i < i3 - 1) {
                            }
                            BaseDao baseDao5222 = baseDao3;
                            i2 = i3;
                            baseDaoAEQbTJ = baseDao5222;
                            objectRef = objectRef3;
                            i = i4 + i5;
                            inHouseIMGroupEntity2 = inHouseIMGroupEntity3;
                            longRef3 = longRef2;
                            if (i < i2) {
                            }
                        } catch (java.lang.IllegalStateException e10) {
                            e2 = e10;
                            baseDao2 = baseDao4;
                            longRef2 = longRef4;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e11) {
                            e = e11;
                            baseDao2 = baseDao4;
                            longRef2 = longRef4;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            baseDao2 = baseDao4;
                            longRef2 = longRef4;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                        objectRef6.element = Unit.INSTANCE;
                        longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                        T t2 = objectRef4.element;
                        C44159sFm.EZpvd(baseDao4, longRef4.element);
                        return inHouseIMGroupEntity5;
                    }
                    C44159sFm.EZpvd(baseDaoAEQbTJ, longRef3.element);
                    java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                    if (exc == null) {
                        exc = new java.lang.Exception("Database Operation failed after " + i2 + " attempts");
                    }
                    C44159sFm.OLrzqt(exc);
                    throw exc;
                }
                c44272sJr = (C44272sJr) groupInfoRepository$fetchGroupInfo$1.L$0;
                C56391yDq.AEQbTJ(groupInfoById$default);
            }
            InHouseIMGroupInfo inHouseIMGroupInfo = (InHouseIMGroupInfo) ((ResponseData) groupInfoById$default).getData();
            InHouseIMGroupEntity inHouseIMGroupEntityCopydefault = inHouseIMGroupInfo != null ? C44169sFw.copydefault(inHouseIMGroupInfo) : null;
            if (inHouseIMGroupEntityCopydefault == null) {
                return inHouseIMGroupEntityCopydefault;
            }
            baseDaoAEQbTJ = c44272sJr.AEQbTJ();
            inHouseIMGroupEntity = inHouseIMGroupEntityCopydefault;
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 0;
            i2 = 3;
            c44272sJr2 = c44272sJr;
            inHouseIMGroupEntity2 = inHouseIMGroupEntity;
            if (i < i2) {
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }
}
