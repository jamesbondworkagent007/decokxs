package o;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.cache.groupInfo.GroupInfoCacheImpl$getGroupInfo$1;
import com.okinc.okimcore.feature.cache.groupInfo.GroupInfoCacheImpl$reloadIfNoCache$1;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupSettingDao;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sFR extends sFJ<GroupInfo> implements sFO {
    public final sIC AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    @Override // o.sFJ
    public int AEQbTJ() {
        return 200;
    }

    @yCM
    public sFR(@NotNull sIC sic, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sic, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = sic;
        this.KWHzl = coroutineDispatcher;
    }

    public final InHouseIMGroupMemberDao OLrzqt() {
        return this.AEQbTJ.copydefault().AYXKKw();
    }

    public final InHouseIMGroupInfoDao copydefault() {
        return this.AEQbTJ.copydefault().EZpvd();
    }

    public final InHouseIMGroupSettingDao valueOf() {
        return this.AEQbTJ.copydefault().valueOf();
    }

    /* JADX DEBUG: Duplicate block (B:200:0x0581) to fix multi-entry loop: BACK_EDGE: B:200:0x0581 -> B:32:0x0116 */
    /* JADX DEBUG: Duplicate block (B:258:0x065f) to fix multi-entry loop: BACK_EDGE: B:258:0x065f -> B:259:0x0669 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:0x041c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:165:0x04fc */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:218:0x05df */
    /* JADX DEBUG: Multi-variable search result rejected for r0v104, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v110, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v126, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v137, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v138, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v142, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v149, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v150, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v64, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v86, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v88, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v36, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0610: MOVE (r15 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:240:0x0610 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0590: MOVE (r14 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:202:0x0590 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0611: MOVE (r2 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:240:0x0610 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0591: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:202:0x0590 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0434 A[Catch: all -> 0x0064, TryCatch #25 {all -> 0x0064, blocks: (B:14:0x005c, B:91:0x0365, B:93:0x036d, B:95:0x0373, B:120:0x0425, B:121:0x0428, B:125:0x042e, B:127:0x0434, B:129:0x043e, B:130:0x0441, B:131:0x0442, B:132:0x0445, B:136:0x0455, B:138:0x0462), top: B:278:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0462 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #25 {all -> 0x0064, blocks: (B:14:0x005c, B:91:0x0365, B:93:0x036d, B:95:0x0373, B:120:0x0425, B:121:0x0428, B:125:0x042e, B:127:0x0434, B:129:0x043e, B:130:0x0441, B:131:0x0442, B:132:0x0445, B:136:0x0455, B:138:0x0462), top: B:278:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0521 A[Catch: all -> 0x011e, TryCatch #50 {all -> 0x011e, blocks: (B:30:0x010d, B:177:0x0510, B:178:0x0513, B:183:0x051b, B:185:0x0521, B:187:0x052b, B:188:0x052e, B:189:0x052f, B:190:0x0532, B:194:0x0548, B:196:0x0555), top: B:278:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0555 A[Catch: all -> 0x011e, TRY_LEAVE, TryCatch #50 {all -> 0x011e, blocks: (B:30:0x010d, B:177:0x0510, B:178:0x0513, B:183:0x051b, B:185:0x0521, B:187:0x052b, B:188:0x052e, B:189:0x052f, B:190:0x0532, B:194:0x0548, B:196:0x0555), top: B:278:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05fe A[Catch: all -> 0x01d6, TryCatch #20 {all -> 0x01d6, blocks: (B:47:0x01c4, B:227:0x05ef, B:228:0x05f2, B:232:0x05f8, B:234:0x05fe, B:236:0x0608, B:237:0x060b, B:238:0x060c, B:239:0x060f), top: B:278:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0365 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x02dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02bc A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v100, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v139 */
    /* JADX WARN: Type inference failed for: r0v140 */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v145 */
    /* JADX WARN: Type inference failed for: r0v146 */
    /* JADX WARN: Type inference failed for: r0v151 */
    /* JADX WARN: Type inference failed for: r0v152 */
    /* JADX WARN: Type inference failed for: r0v153 */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v59, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x048d -> B:142:0x0490). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x0495 -> B:142:0x0490). Please report as a decompilation issue!!! */
    @Override // o.sFJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super GroupInfo> continuation) throws java.lang.Exception {
        GroupInfoCacheImpl$reloadIfNoCache$1 groupInfoCacheImpl$reloadIfNoCache$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        Ref.LongRef longRef3;
        Ref.LongRef longRef4;
        BaseDao baseDao3;
        BaseDao baseDao4;
        Ref.LongRef longRef5;
        BaseDao baseDao5;
        sFR sfr;
        BaseDao baseDaoCopydefault;
        Ref.LongRef longRef6;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        GroupInfoCacheImpl$reloadIfNoCache$1 groupInfoCacheImpl$reloadIfNoCache$12;
        java.lang.String str2;
        Ref.ObjectRef objectRef2;
        java.lang.String str3;
        BaseDao baseDao6;
        sFR sfr2;
        int i3;
        Ref.LongRef longRef7;
        int i4;
        java.lang.String str4;
        GroupInfoCacheImpl$reloadIfNoCache$1 groupInfoCacheImpl$reloadIfNoCache$13;
        Ref.LongRef longRef8;
        java.lang.String str5;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        java.lang.String str6;
        long jNanoTime;
        java.lang.String message;
        ?? r0;
        int i5;
        BaseDao baseDao7;
        T t;
        InHouseIMGroupEntity inHouseIMGroupEntity;
        InHouseIMGroupEntity inHouseIMGroupEntity2;
        InHouseIMGroupEntity inHouseIMGroupEntity3;
        Ref.ObjectRef objectRef5;
        java.lang.String str7;
        int i6;
        BaseDao baseDao8;
        int i7;
        java.lang.String str8;
        int i8;
        int i9;
        java.lang.String str9;
        int i10;
        InHouseIMGroupEntity inHouseIMGroupEntity4;
        java.lang.String str10;
        BaseDao baseDao9;
        InHouseIMGroupEntity inHouseIMGroupEntity5;
        java.lang.String str11;
        Ref.LongRef longRef9;
        sFR sfr3;
        java.lang.String str12;
        int i11;
        Ref.LongRef longRef10;
        GroupInfoCacheImpl$reloadIfNoCache$1 groupInfoCacheImpl$reloadIfNoCache$14;
        Ref.LongRef longRef11;
        int i12;
        java.lang.String str13;
        Ref.ObjectRef objectRef6;
        java.lang.String str14;
        long jNanoTime2;
        Ref.ObjectRef objectRef7;
        java.lang.String message2;
        ?? r02;
        int i13;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        T t2;
        Ref.ObjectRef objectRef8;
        BaseDao baseDao10;
        Ref.LongRef longRef12;
        InHouseIMGroupEntity inHouseIMGroupEntity6;
        java.lang.String str15;
        int i14;
        int i15;
        java.lang.String str16;
        java.lang.String str17;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        int i16;
        int i17;
        InHouseIMGroupEntity inHouseIMGroupEntity7;
        Ref.ObjectRef objectRef9;
        java.lang.String str18;
        sFR sfr4;
        int i18;
        int i19;
        InHouseIMGroupEntity inHouseIMGroupEntity8;
        java.lang.String str19;
        Ref.ObjectRef objectRef10;
        java.lang.String str20;
        Ref.LongRef longRef13;
        java.lang.String str21;
        int i20;
        Ref.ObjectRef objectRef11;
        java.lang.String str22;
        java.lang.String str23;
        long jNanoTime3;
        Ref.LongRef longRef14;
        Ref.ObjectRef objectRef12;
        java.lang.String message3;
        ?? r03;
        T t3;
        java.lang.Object objEZpvd;
        java.lang.Object obj;
        if (continuation instanceof GroupInfoCacheImpl$reloadIfNoCache$1) {
            groupInfoCacheImpl$reloadIfNoCache$1 = (GroupInfoCacheImpl$reloadIfNoCache$1) continuation;
            int i21 = groupInfoCacheImpl$reloadIfNoCache$1.label;
            if ((i21 & Integer.MIN_VALUE) != 0) {
                groupInfoCacheImpl$reloadIfNoCache$1.label = i21 - Integer.MIN_VALUE;
            } else {
                groupInfoCacheImpl$reloadIfNoCache$1 = new GroupInfoCacheImpl$reloadIfNoCache$1(this, continuation);
            }
        }
        java.lang.Object obj2 = groupInfoCacheImpl$reloadIfNoCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        java.lang.String str24 = "not open";
        java.lang.String str25 = " attempts";
        java.lang.String str26 = "Database Operation failed after ";
        try {
            try {
                try {
                    switch (groupInfoCacheImpl$reloadIfNoCache$1.label) {
                        case 0:
                            C56391yDq.AEQbTJ(obj2);
                            sfr = this;
                            baseDaoCopydefault = copydefault();
                            longRef6 = new Ref.LongRef();
                            objectRef = new Ref.ObjectRef();
                            i = 0;
                            i2 = 3;
                            groupInfoCacheImpl$reloadIfNoCache$12 = groupInfoCacheImpl$reloadIfNoCache$1;
                            str2 = str;
                            if (i < i2) {
                                try {
                                    try {
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                                        e = e;
                                        str8 = str24;
                                    } catch (java.lang.IllegalStateException e2) {
                                        e = e2;
                                    }
                                    objectRef2 = new Ref.ObjectRef();
                                    str8 = str24;
                                    try {
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                                        try {
                                            e = e3;
                                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                                            objectRef.element = r0;
                                            if (i4 < i2 - 1) {
                                                BaseDao baseDao11 = baseDao6;
                                                long j = i4 + 1;
                                                try {
                                                    groupInfoCacheImpl$reloadIfNoCache$1.L$0 = sfr2;
                                                    groupInfoCacheImpl$reloadIfNoCache$1.L$1 = str4;
                                                    baseDao4 = baseDao11;
                                                } catch (java.lang.Throwable th) {
                                                    th = th;
                                                    baseDao4 = baseDao11;
                                                }
                                                try {
                                                    groupInfoCacheImpl$reloadIfNoCache$1.L$2 = baseDao4;
                                                    groupInfoCacheImpl$reloadIfNoCache$1.L$3 = longRef7;
                                                    groupInfoCacheImpl$reloadIfNoCache$1.L$4 = objectRef;
                                                    groupInfoCacheImpl$reloadIfNoCache$1.L$5 = null;
                                                    groupInfoCacheImpl$reloadIfNoCache$1.L$6 = null;
                                                    groupInfoCacheImpl$reloadIfNoCache$1.L$7 = null;
                                                    groupInfoCacheImpl$reloadIfNoCache$1.I$0 = i2;
                                                    groupInfoCacheImpl$reloadIfNoCache$1.I$1 = i3;
                                                    groupInfoCacheImpl$reloadIfNoCache$1.label = 2;
                                                    if (DelayKt.delay(j * 50, groupInfoCacheImpl$reloadIfNoCache$1) == objCopydefault) {
                                                        return objCopydefault;
                                                    }
                                                    longRef6 = longRef7;
                                                    sfr = sfr2;
                                                    groupInfoCacheImpl$reloadIfNoCache$12 = groupInfoCacheImpl$reloadIfNoCache$1;
                                                    str2 = str4;
                                                    i5 = i2;
                                                    baseDao7 = baseDao4;
                                                } catch (java.lang.Throwable th2) {
                                                    th = th2;
                                                    longRef4 = longRef7;
                                                    C44159sFm.EZpvd(baseDao4, longRef4.element);
                                                    throw th;
                                                }
                                            } else {
                                                BaseDao baseDao12 = baseDao6;
                                                longRef6 = longRef7;
                                                sfr = sfr2;
                                                groupInfoCacheImpl$reloadIfNoCache$12 = groupInfoCacheImpl$reloadIfNoCache$1;
                                                str2 = str4;
                                                i5 = i2;
                                                baseDao7 = baseDao12;
                                            }
                                            int i22 = i3 + 1;
                                            baseDaoCopydefault = baseDao7;
                                            i2 = i5;
                                            i = i22;
                                            if (i < i2) {
                                            }
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            baseDao4 = baseDao6;
                                        }
                                        str24 = str8;
                                        sfr2 = sfr;
                                        longRef7 = longRef6;
                                        baseDao6 = baseDaoCopydefault;
                                        i3 = i;
                                        str4 = str2;
                                        groupInfoCacheImpl$reloadIfNoCache$1 = groupInfoCacheImpl$reloadIfNoCache$12;
                                        i4 = i3;
                                        r0 = e;
                                    } catch (java.lang.IllegalStateException e4) {
                                        e = e4;
                                        str24 = str8;
                                        message = e.getMessage();
                                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) str24, false, 2, (java.lang.Object) null)) {
                                            C44159sFm.OLrzqt(e);
                                            throw e;
                                        }
                                        C44159sFm.copydefault(e);
                                        throw e;
                                    }
                                    jNanoTime = java.lang.System.nanoTime();
                                    InHouseIMGroupInfoDao inHouseIMGroupInfoDaoCopydefault = sfr.copydefault();
                                    groupInfoCacheImpl$reloadIfNoCache$12.L$0 = sfr;
                                    groupInfoCacheImpl$reloadIfNoCache$12.L$1 = str2;
                                    groupInfoCacheImpl$reloadIfNoCache$12.L$2 = baseDaoCopydefault;
                                    groupInfoCacheImpl$reloadIfNoCache$12.L$3 = longRef6;
                                    groupInfoCacheImpl$reloadIfNoCache$12.L$4 = objectRef;
                                    groupInfoCacheImpl$reloadIfNoCache$12.L$5 = objectRef2;
                                    groupInfoCacheImpl$reloadIfNoCache$12.L$6 = longRef6;
                                    groupInfoCacheImpl$reloadIfNoCache$12.L$7 = objectRef2;
                                    groupInfoCacheImpl$reloadIfNoCache$12.I$0 = i2;
                                    groupInfoCacheImpl$reloadIfNoCache$12.I$1 = i;
                                    groupInfoCacheImpl$reloadIfNoCache$12.I$2 = i;
                                    groupInfoCacheImpl$reloadIfNoCache$12.J$0 = jNanoTime;
                                    groupInfoCacheImpl$reloadIfNoCache$12.label = 1;
                                    java.lang.Object groupInfoById = inHouseIMGroupInfoDaoCopydefault.getGroupInfoById(str2, groupInfoCacheImpl$reloadIfNoCache$12);
                                    if (groupInfoById == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    str3 = str2;
                                    longRef8 = longRef6;
                                    str5 = str26;
                                    objectRef4 = objectRef;
                                    str6 = str8;
                                    groupInfoCacheImpl$reloadIfNoCache$13 = groupInfoCacheImpl$reloadIfNoCache$12;
                                    baseDao4 = baseDaoCopydefault;
                                    objectRef3 = objectRef2;
                                    i3 = i;
                                    t = groupInfoById;
                                    try {
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                                        baseDao6 = baseDao4;
                                        i4 = i;
                                        sfr2 = sfr;
                                        str24 = str6;
                                        str26 = str5;
                                        objectRef = objectRef4;
                                        str4 = str3;
                                        longRef7 = longRef8;
                                        groupInfoCacheImpl$reloadIfNoCache$1 = groupInfoCacheImpl$reloadIfNoCache$13;
                                        r0 = e5;
                                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                                        objectRef.element = r0;
                                        if (i4 < i2 - 1) {
                                        }
                                        int i222 = i3 + 1;
                                        baseDaoCopydefault = baseDao7;
                                        i2 = i5;
                                        i = i222;
                                        if (i < i2) {
                                        }
                                    } catch (java.lang.IllegalStateException e6) {
                                        e = e6;
                                        longRef6 = longRef8;
                                        baseDaoCopydefault = baseDao4;
                                        str24 = str6;
                                        message = e.getMessage();
                                        if (message == null) {
                                        }
                                        C44159sFm.copydefault(e);
                                        throw e;
                                    } catch (java.lang.Exception e7) {
                                        e = e7;
                                        longRef6 = longRef8;
                                        baseDaoCopydefault = baseDao4;
                                        C44159sFm.OLrzqt(e);
                                        throw e;
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                        longRef4 = longRef8;
                                        C44159sFm.EZpvd(baseDao4, longRef4.element);
                                        throw th;
                                    }
                                    objectRef2.element = t;
                                    longRef6.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                                    T t4 = objectRef3.element;
                                    C44159sFm.EZpvd(baseDao4, longRef8.element);
                                    inHouseIMGroupEntity = (InHouseIMGroupEntity) t4;
                                    if (inHouseIMGroupEntity != null) {
                                        return null;
                                    }
                                    InHouseIMGroupMemberDao inHouseIMGroupMemberDaoOLrzqt = sfr.OLrzqt();
                                    Ref.LongRef longRef15 = new Ref.LongRef();
                                    inHouseIMGroupEntity2 = inHouseIMGroupEntity;
                                    inHouseIMGroupEntity3 = inHouseIMGroupEntity2;
                                    objectRef5 = new Ref.ObjectRef();
                                    str24 = str6;
                                    str26 = str5;
                                    str7 = str3;
                                    i6 = 3;
                                    baseDao8 = inHouseIMGroupMemberDaoOLrzqt;
                                    longRef2 = longRef15;
                                    i7 = 0;
                                    groupInfoCacheImpl$reloadIfNoCache$1 = groupInfoCacheImpl$reloadIfNoCache$13;
                                    if (i7 >= i6) {
                                        try {
                                            try {
                                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                                                e = e8;
                                                i12 = i7;
                                                str16 = str24;
                                                str17 = str25;
                                            } catch (java.lang.IllegalStateException e9) {
                                                e = e9;
                                                str16 = str24;
                                            }
                                            Ref.ObjectRef objectRef13 = new Ref.ObjectRef();
                                            str16 = str24;
                                            java.lang.String str27 = str25;
                                            try {
                                                try {
                                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                                                    e = e10;
                                                    i12 = i7;
                                                    str17 = str27;
                                                }
                                                jNanoTime2 = java.lang.System.nanoTime();
                                                str17 = str27;
                                                try {
                                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e11) {
                                                    e = e11;
                                                    i12 = i7;
                                                }
                                                InHouseIMGroupMemberDao inHouseIMGroupMemberDaoOLrzqt2 = sfr.OLrzqt();
                                                groupInfoCacheImpl$reloadIfNoCache$1.L$0 = sfr;
                                                groupInfoCacheImpl$reloadIfNoCache$1.L$1 = str7;
                                                groupInfoCacheImpl$reloadIfNoCache$1.L$2 = inHouseIMGroupEntity2;
                                                groupInfoCacheImpl$reloadIfNoCache$1.L$3 = baseDao8;
                                                groupInfoCacheImpl$reloadIfNoCache$1.L$4 = longRef2;
                                                groupInfoCacheImpl$reloadIfNoCache$1.L$5 = objectRef5;
                                                groupInfoCacheImpl$reloadIfNoCache$1.L$6 = objectRef13;
                                                groupInfoCacheImpl$reloadIfNoCache$1.L$7 = longRef2;
                                                groupInfoCacheImpl$reloadIfNoCache$1.L$8 = objectRef13;
                                                groupInfoCacheImpl$reloadIfNoCache$1.L$9 = inHouseIMGroupEntity3;
                                                groupInfoCacheImpl$reloadIfNoCache$1.I$0 = i6;
                                                groupInfoCacheImpl$reloadIfNoCache$1.I$1 = i7;
                                                groupInfoCacheImpl$reloadIfNoCache$1.I$2 = i7;
                                                groupInfoCacheImpl$reloadIfNoCache$1.J$0 = jNanoTime2;
                                                i12 = i7;
                                                try {
                                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e12) {
                                                    e = e12;
                                                    sQLiteDatabaseLockedException2 = e;
                                                    str11 = str7;
                                                    sfr3 = sfr;
                                                    inHouseIMGroupEntity4 = inHouseIMGroupEntity3;
                                                    i11 = i12;
                                                    i8 = i11;
                                                    inHouseIMGroupEntity5 = inHouseIMGroupEntity2;
                                                    longRef9 = longRef2;
                                                    str10 = str16;
                                                    str12 = str17;
                                                    sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                                                    int i23 = i6;
                                                    baseDao9 = baseDao8;
                                                    i10 = i23;
                                                    r02 = sQLiteDatabaseLockedException;
                                                    C44159sFm.copydefault(r02, (java.lang.Exception) objectRef5.element);
                                                    objectRef5.element = r02;
                                                    if (i11 >= i10 - 1) {
                                                        java.lang.String str28 = str26;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$0 = sfr3;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$1 = str11;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$2 = inHouseIMGroupEntity5;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$3 = baseDao9;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$4 = longRef9;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$5 = objectRef5;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$6 = inHouseIMGroupEntity4;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$7 = null;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$8 = null;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$9 = null;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.I$0 = i10;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.I$1 = i8;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.label = 4;
                                                        if (DelayKt.delay(((long) (i11 + 1)) * 50, groupInfoCacheImpl$reloadIfNoCache$1) == objCopydefault) {
                                                            return objCopydefault;
                                                        }
                                                        str25 = str12;
                                                        str26 = str28;
                                                        i13 = i8;
                                                        sfr = sfr3;
                                                        str24 = str10;
                                                        longRef2 = longRef9;
                                                        inHouseIMGroupEntity2 = inHouseIMGroupEntity5;
                                                        inHouseIMGroupEntity3 = inHouseIMGroupEntity4;
                                                        str7 = str11;
                                                    } else {
                                                        str25 = str12;
                                                        str26 = str26;
                                                        i13 = i8;
                                                        sfr = sfr3;
                                                        str24 = str10;
                                                        longRef2 = longRef9;
                                                        inHouseIMGroupEntity2 = inHouseIMGroupEntity5;
                                                        inHouseIMGroupEntity3 = inHouseIMGroupEntity4;
                                                        str7 = str11;
                                                    }
                                                    BaseDao baseDao13 = baseDao9;
                                                    i6 = i10;
                                                    baseDao8 = baseDao13;
                                                    i7 = i13 + 1;
                                                    if (i7 >= i6) {
                                                    }
                                                }
                                                groupInfoCacheImpl$reloadIfNoCache$1.label = 3;
                                                try {
                                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e13) {
                                                    sQLiteDatabaseLockedException2 = e13;
                                                    str11 = str7;
                                                    sfr3 = sfr;
                                                    inHouseIMGroupEntity4 = inHouseIMGroupEntity3;
                                                    i11 = i12;
                                                    i8 = i11;
                                                    inHouseIMGroupEntity5 = inHouseIMGroupEntity2;
                                                    longRef9 = longRef2;
                                                    str10 = str16;
                                                    str12 = str17;
                                                    sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                                                    int i232 = i6;
                                                    baseDao9 = baseDao8;
                                                    i10 = i232;
                                                    r02 = sQLiteDatabaseLockedException;
                                                    C44159sFm.copydefault(r02, (java.lang.Exception) objectRef5.element);
                                                    objectRef5.element = r02;
                                                    if (i11 >= i10 - 1) {
                                                    }
                                                    BaseDao baseDao132 = baseDao9;
                                                    i6 = i10;
                                                    baseDao8 = baseDao132;
                                                    i7 = i13 + 1;
                                                    if (i7 >= i6) {
                                                    }
                                                }
                                                java.lang.Object groupTopNMemberList = inHouseIMGroupMemberDaoOLrzqt2.getGroupTopNMemberList(str7, 6, groupInfoCacheImpl$reloadIfNoCache$1);
                                                if (groupTopNMemberList == objCopydefault) {
                                                    return objCopydefault;
                                                }
                                                str9 = str7;
                                                str13 = str26;
                                                longRef10 = longRef2;
                                                objectRef7 = objectRef13;
                                                objectRef6 = objectRef7;
                                                t2 = groupTopNMemberList;
                                                str14 = str17;
                                                i9 = i12;
                                                str10 = str16;
                                                groupInfoCacheImpl$reloadIfNoCache$14 = groupInfoCacheImpl$reloadIfNoCache$1;
                                                longRef11 = longRef10;
                                                try {
                                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e14) {
                                                    groupInfoCacheImpl$reloadIfNoCache$1 = groupInfoCacheImpl$reloadIfNoCache$14;
                                                    sfr3 = sfr;
                                                    inHouseIMGroupEntity4 = inHouseIMGroupEntity3;
                                                    str12 = str14;
                                                    i8 = i12;
                                                    str26 = str13;
                                                    str11 = str9;
                                                    inHouseIMGroupEntity5 = inHouseIMGroupEntity2;
                                                    longRef9 = longRef10;
                                                    i11 = i9;
                                                    sQLiteDatabaseLockedException = e14;
                                                    int i2322 = i6;
                                                    baseDao9 = baseDao8;
                                                    i10 = i2322;
                                                    r02 = sQLiteDatabaseLockedException;
                                                    C44159sFm.copydefault(r02, (java.lang.Exception) objectRef5.element);
                                                    objectRef5.element = r02;
                                                    if (i11 >= i10 - 1) {
                                                    }
                                                    BaseDao baseDao1322 = baseDao9;
                                                    i6 = i10;
                                                    baseDao8 = baseDao1322;
                                                    i7 = i13 + 1;
                                                    if (i7 >= i6) {
                                                    }
                                                } catch (java.lang.IllegalStateException e15) {
                                                    e = e15;
                                                    str24 = str10;
                                                    longRef2 = longRef10;
                                                    message2 = e.getMessage();
                                                    if (message2 == null) {
                                                    }
                                                    C44159sFm.copydefault(e);
                                                    throw e;
                                                } catch (java.lang.Exception e16) {
                                                    e = e16;
                                                    longRef2 = longRef10;
                                                    C44159sFm.OLrzqt(e);
                                                    throw e;
                                                } catch (java.lang.Throwable th5) {
                                                    th = th5;
                                                    longRef2 = longRef10;
                                                    baseDao2 = baseDao8;
                                                    C44159sFm.EZpvd(baseDao2, longRef2.element);
                                                    throw th;
                                                }
                                                objectRef6.element = t2;
                                                longRef11.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime2, DurationUnit.NANOSECONDS));
                                                T t5 = objectRef7.element;
                                                C44159sFm.EZpvd(baseDao8, longRef10.element);
                                                inHouseIMGroupEntity3.setGroupTopMembers((java.util.List) t5);
                                                InHouseIMGroupSettingDao inHouseIMGroupSettingDaoValueOf = sfr.valueOf();
                                                Ref.LongRef longRef16 = new Ref.LongRef();
                                                objectRef8 = new Ref.ObjectRef();
                                                baseDao10 = inHouseIMGroupSettingDaoValueOf;
                                                longRef12 = longRef16;
                                                inHouseIMGroupEntity6 = inHouseIMGroupEntity2;
                                                str24 = str10;
                                                str25 = str14;
                                                str26 = str13;
                                                str15 = str9;
                                                i14 = 3;
                                                i15 = 0;
                                                groupInfoCacheImpl$reloadIfNoCache$1 = groupInfoCacheImpl$reloadIfNoCache$14;
                                                if (i15 >= i14) {
                                                    try {
                                                        try {
                                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e17) {
                                                            e = e17;
                                                            str20 = str24;
                                                            str21 = str25;
                                                        } catch (java.lang.IllegalStateException e18) {
                                                            e = e18;
                                                            str20 = str24;
                                                        }
                                                        Ref.ObjectRef objectRef14 = new Ref.ObjectRef();
                                                        str20 = str24;
                                                        java.lang.String str29 = str25;
                                                        try {
                                                            try {
                                                            } catch (java.lang.IllegalStateException e19) {
                                                                e = e19;
                                                                str24 = str20;
                                                                message3 = e.getMessage();
                                                                if (message3 == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message3, (java.lang.CharSequence) str24, false, 2, (java.lang.Object) null)) {
                                                                    C44159sFm.OLrzqt(e);
                                                                    throw e;
                                                                }
                                                                C44159sFm.copydefault(e);
                                                                throw e;
                                                            }
                                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e20) {
                                                            e = e20;
                                                            str21 = str29;
                                                        }
                                                        jNanoTime3 = java.lang.System.nanoTime();
                                                        str21 = str29;
                                                        try {
                                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e21) {
                                                            e = e21;
                                                            inHouseIMGroupEntity8 = inHouseIMGroupEntity2;
                                                            str25 = str21;
                                                            objectRef10 = objectRef8;
                                                            i19 = i14;
                                                            inHouseIMGroupEntity7 = inHouseIMGroupEntity6;
                                                            str19 = str15;
                                                            i18 = i15;
                                                            sfr4 = sfr;
                                                            i16 = i18;
                                                            r03 = e;
                                                            C44159sFm.copydefault(r03, (java.lang.Exception) objectRef10.element);
                                                            objectRef10.element = r03;
                                                            if (i16 < i19 - 1) {
                                                                java.lang.String str30 = str25;
                                                                groupInfoCacheImpl$reloadIfNoCache$1.L$0 = sfr4;
                                                                groupInfoCacheImpl$reloadIfNoCache$1.L$1 = str19;
                                                                groupInfoCacheImpl$reloadIfNoCache$1.L$2 = inHouseIMGroupEntity8;
                                                                groupInfoCacheImpl$reloadIfNoCache$1.L$3 = baseDao10;
                                                                groupInfoCacheImpl$reloadIfNoCache$1.L$4 = longRef12;
                                                                groupInfoCacheImpl$reloadIfNoCache$1.L$5 = objectRef10;
                                                                groupInfoCacheImpl$reloadIfNoCache$1.L$6 = inHouseIMGroupEntity7;
                                                                groupInfoCacheImpl$reloadIfNoCache$1.L$7 = null;
                                                                groupInfoCacheImpl$reloadIfNoCache$1.L$8 = null;
                                                                groupInfoCacheImpl$reloadIfNoCache$1.L$9 = null;
                                                                groupInfoCacheImpl$reloadIfNoCache$1.I$0 = i19;
                                                                groupInfoCacheImpl$reloadIfNoCache$1.I$1 = i18;
                                                                groupInfoCacheImpl$reloadIfNoCache$1.label = 6;
                                                                if (DelayKt.delay(((long) (i16 + 1)) * 50, groupInfoCacheImpl$reloadIfNoCache$1) == objCopydefault) {
                                                                    return objCopydefault;
                                                                }
                                                                str24 = str20;
                                                                str25 = str30;
                                                            } else {
                                                                str24 = str20;
                                                            }
                                                            int i24 = i19;
                                                            objectRef8 = objectRef10;
                                                            inHouseIMGroupEntity2 = inHouseIMGroupEntity8;
                                                            sfr = sfr4;
                                                            i15 = i18 + 1;
                                                            str15 = str19;
                                                            inHouseIMGroupEntity6 = inHouseIMGroupEntity7;
                                                            i14 = i24;
                                                            if (i15 >= i14) {
                                                            }
                                                        }
                                                        InHouseIMGroupSettingDao inHouseIMGroupSettingDaoValueOf2 = sfr.valueOf();
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$0 = sfr;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$1 = str15;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$2 = inHouseIMGroupEntity2;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$3 = baseDao10;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$4 = longRef12;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$5 = objectRef8;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$6 = objectRef14;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$7 = longRef12;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$8 = objectRef14;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$9 = inHouseIMGroupEntity6;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.I$0 = i14;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.I$1 = i15;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.I$2 = i15;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.J$0 = jNanoTime3;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.label = 5;
                                                        java.lang.Object settingInfoById = inHouseIMGroupSettingDaoValueOf2.getSettingInfoById(str15, groupInfoCacheImpl$reloadIfNoCache$1);
                                                        if (settingInfoById == objCopydefault) {
                                                            return objCopydefault;
                                                        }
                                                        str23 = str20;
                                                        objectRef9 = objectRef8;
                                                        str18 = str15;
                                                        longRef13 = longRef12;
                                                        longRef14 = longRef13;
                                                        i17 = i14;
                                                        i20 = i15;
                                                        inHouseIMGroupEntity7 = inHouseIMGroupEntity6;
                                                        objectRef12 = objectRef14;
                                                        str22 = str26;
                                                        objectRef11 = objectRef12;
                                                        t3 = settingInfoById;
                                                        try {
                                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e22) {
                                                            str25 = str21;
                                                            str26 = str22;
                                                            i18 = i20;
                                                            str19 = str18;
                                                            InHouseIMGroupEntity inHouseIMGroupEntity9 = inHouseIMGroupEntity2;
                                                            objectRef10 = objectRef9;
                                                            str20 = str23;
                                                            inHouseIMGroupEntity8 = inHouseIMGroupEntity9;
                                                            int i25 = i17;
                                                            longRef12 = longRef13;
                                                            i19 = i25;
                                                            int i26 = i15;
                                                            sfr4 = sfr;
                                                            i16 = i26;
                                                            r03 = e22;
                                                            C44159sFm.copydefault(r03, (java.lang.Exception) objectRef10.element);
                                                            objectRef10.element = r03;
                                                            if (i16 < i19 - 1) {
                                                            }
                                                            int i242 = i19;
                                                            objectRef8 = objectRef10;
                                                            inHouseIMGroupEntity2 = inHouseIMGroupEntity8;
                                                            sfr = sfr4;
                                                            i15 = i18 + 1;
                                                            str15 = str19;
                                                            inHouseIMGroupEntity6 = inHouseIMGroupEntity7;
                                                            i14 = i242;
                                                            if (i15 >= i14) {
                                                            }
                                                        } catch (java.lang.IllegalStateException e23) {
                                                            e = e23;
                                                            str24 = str23;
                                                            message3 = e.getMessage();
                                                            if (message3 == null) {
                                                            }
                                                            C44159sFm.copydefault(e);
                                                            throw e;
                                                        } catch (java.lang.Exception e24) {
                                                            e = e24;
                                                            C44159sFm.OLrzqt(e);
                                                            throw e;
                                                        } catch (java.lang.Throwable th6) {
                                                            th = th6;
                                                            longRef5 = longRef13;
                                                            baseDao5 = baseDao10;
                                                            C44159sFm.EZpvd(baseDao5, longRef5.element);
                                                            throw th;
                                                        }
                                                        objectRef11.element = t3;
                                                        longRef14.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime3, DurationUnit.NANOSECONDS));
                                                        T t6 = objectRef12.element;
                                                        C44159sFm.EZpvd(baseDao10, longRef13.element);
                                                        inHouseIMGroupEntity7.setUserSetting((InHouseIMGroupSettingEntity) t6);
                                                        sJM sjm = sJM.AEQbTJ;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$0 = null;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$1 = null;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$2 = null;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$3 = null;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$4 = null;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$5 = null;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$6 = null;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$7 = null;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$8 = null;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.L$9 = null;
                                                        groupInfoCacheImpl$reloadIfNoCache$1.label = 7;
                                                        objEZpvd = sjm.EZpvd(inHouseIMGroupEntity2, groupInfoCacheImpl$reloadIfNoCache$1);
                                                        obj = objEZpvd;
                                                        if (objEZpvd == objCopydefault) {
                                                            return objCopydefault;
                                                        }
                                                        return (GroupInfo) obj;
                                                    } catch (java.lang.Exception e25) {
                                                        e = e25;
                                                        C44159sFm.OLrzqt(e);
                                                        throw e;
                                                    }
                                                }
                                                java.lang.String str31 = str25;
                                                C44159sFm.EZpvd(baseDao10, longRef12.element);
                                                java.lang.Exception exc = (java.lang.Exception) objectRef8.element;
                                                if (exc == null) {
                                                    exc = new java.lang.Exception(str26 + i14 + str31);
                                                }
                                                C44159sFm.OLrzqt(exc);
                                                throw exc;
                                            } catch (java.lang.IllegalStateException e26) {
                                                e = e26;
                                                str24 = str16;
                                                message2 = e.getMessage();
                                                if (message2 == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) str24, false, 2, (java.lang.Object) null)) {
                                                    C44159sFm.OLrzqt(e);
                                                    throw e;
                                                }
                                                C44159sFm.copydefault(e);
                                                throw e;
                                            }
                                        } catch (java.lang.Exception e27) {
                                            e = e27;
                                            C44159sFm.OLrzqt(e);
                                            throw e;
                                        } catch (java.lang.Throwable th7) {
                                            th = th7;
                                            baseDao2 = baseDao8;
                                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                                            throw th;
                                        }
                                    }
                                    java.lang.String str32 = str25;
                                    C44159sFm.EZpvd(baseDao8, longRef2.element);
                                    java.lang.Exception exc2 = (java.lang.Exception) objectRef5.element;
                                    if (exc2 == null) {
                                        exc2 = new java.lang.Exception(str26 + i6 + str32);
                                    }
                                    C44159sFm.OLrzqt(exc2);
                                    throw exc2;
                                } catch (java.lang.Exception e28) {
                                    e = e28;
                                    C44159sFm.OLrzqt(e);
                                    throw e;
                                } catch (java.lang.Throwable th8) {
                                    th = th8;
                                    baseDao4 = baseDaoCopydefault;
                                    longRef4 = longRef6;
                                    C44159sFm.EZpvd(baseDao4, longRef4.element);
                                    throw th;
                                }
                            }
                            C44159sFm.EZpvd(baseDaoCopydefault, longRef6.element);
                            java.lang.Exception exc3 = (java.lang.Exception) objectRef.element;
                            if (exc3 == null) {
                                exc3 = new java.lang.Exception(str26 + i2 + " attempts");
                            }
                            C44159sFm.OLrzqt(exc3);
                            throw exc3;
                        case 1:
                            long j2 = groupInfoCacheImpl$reloadIfNoCache$1.J$0;
                            int i27 = groupInfoCacheImpl$reloadIfNoCache$1.I$2;
                            int i28 = groupInfoCacheImpl$reloadIfNoCache$1.I$1;
                            i2 = groupInfoCacheImpl$reloadIfNoCache$1.I$0;
                            objectRef2 = (Ref.ObjectRef) groupInfoCacheImpl$reloadIfNoCache$1.L$7;
                            longRef6 = (Ref.LongRef) groupInfoCacheImpl$reloadIfNoCache$1.L$6;
                            Ref.ObjectRef objectRef15 = (Ref.ObjectRef) groupInfoCacheImpl$reloadIfNoCache$1.L$5;
                            objectRef = (Ref.ObjectRef) groupInfoCacheImpl$reloadIfNoCache$1.L$4;
                            longRef4 = (Ref.LongRef) groupInfoCacheImpl$reloadIfNoCache$1.L$3;
                            BaseDao baseDao14 = (BaseDao) groupInfoCacheImpl$reloadIfNoCache$1.L$2;
                            str3 = (java.lang.String) groupInfoCacheImpl$reloadIfNoCache$1.L$1;
                            sFR sfr5 = (sFR) groupInfoCacheImpl$reloadIfNoCache$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj2);
                                baseDao4 = baseDao14;
                                groupInfoCacheImpl$reloadIfNoCache$13 = groupInfoCacheImpl$reloadIfNoCache$1;
                                longRef8 = longRef4;
                                str5 = "Database Operation failed after ";
                                objectRef3 = objectRef15;
                                sfr = sfr5;
                                i3 = i28;
                                i = i27;
                                objectRef4 = objectRef;
                                str6 = "not open";
                                jNanoTime = j2;
                                t = obj2;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e29) {
                                baseDao6 = baseDao14;
                                sfr2 = sfr5;
                                i3 = i28;
                                longRef7 = longRef4;
                                i4 = i27;
                                str4 = str3;
                                r0 = e29;
                                C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                                objectRef.element = r0;
                                if (i4 < i2 - 1) {
                                }
                                int i2222 = i3 + 1;
                                baseDaoCopydefault = baseDao7;
                                i2 = i5;
                                i = i2222;
                                if (i < i2) {
                                }
                            } catch (java.lang.IllegalStateException e30) {
                                e = e30;
                                message = e.getMessage();
                                if (message == null) {
                                    break;
                                }
                                C44159sFm.copydefault(e);
                                throw e;
                            } catch (java.lang.Exception e31) {
                                e = e31;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                                baseDao4 = baseDao14;
                                C44159sFm.EZpvd(baseDao4, longRef4.element);
                                throw th;
                            }
                            objectRef2.element = t;
                            longRef6.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            T t42 = objectRef3.element;
                            C44159sFm.EZpvd(baseDao4, longRef8.element);
                            inHouseIMGroupEntity = (InHouseIMGroupEntity) t42;
                            if (inHouseIMGroupEntity != null) {
                            }
                            break;
                        case 2:
                            int i29 = groupInfoCacheImpl$reloadIfNoCache$1.I$1;
                            i5 = groupInfoCacheImpl$reloadIfNoCache$1.I$0;
                            Ref.ObjectRef objectRef16 = (Ref.ObjectRef) groupInfoCacheImpl$reloadIfNoCache$1.L$4;
                            Ref.LongRef longRef17 = (Ref.LongRef) groupInfoCacheImpl$reloadIfNoCache$1.L$3;
                            baseDao7 = (BaseDao) groupInfoCacheImpl$reloadIfNoCache$1.L$2;
                            java.lang.String str33 = (java.lang.String) groupInfoCacheImpl$reloadIfNoCache$1.L$1;
                            sFR sfr6 = (sFR) groupInfoCacheImpl$reloadIfNoCache$1.L$0;
                            C56391yDq.AEQbTJ(obj2);
                            objectRef = objectRef16;
                            i3 = i29;
                            groupInfoCacheImpl$reloadIfNoCache$12 = groupInfoCacheImpl$reloadIfNoCache$1;
                            str2 = str33;
                            longRef6 = longRef17;
                            sfr = sfr6;
                            int i22222 = i3 + 1;
                            baseDaoCopydefault = baseDao7;
                            i2 = i5;
                            i = i22222;
                            if (i < i2) {
                            }
                            break;
                        case 3:
                            long j3 = groupInfoCacheImpl$reloadIfNoCache$1.J$0;
                            int i30 = groupInfoCacheImpl$reloadIfNoCache$1.I$2;
                            i8 = groupInfoCacheImpl$reloadIfNoCache$1.I$1;
                            int i31 = groupInfoCacheImpl$reloadIfNoCache$1.I$0;
                            InHouseIMGroupEntity inHouseIMGroupEntity10 = (InHouseIMGroupEntity) groupInfoCacheImpl$reloadIfNoCache$1.L$9;
                            Ref.ObjectRef objectRef17 = (Ref.ObjectRef) groupInfoCacheImpl$reloadIfNoCache$1.L$8;
                            Ref.LongRef longRef18 = (Ref.LongRef) groupInfoCacheImpl$reloadIfNoCache$1.L$7;
                            Ref.ObjectRef objectRef18 = (Ref.ObjectRef) groupInfoCacheImpl$reloadIfNoCache$1.L$6;
                            Ref.ObjectRef objectRef19 = (Ref.ObjectRef) groupInfoCacheImpl$reloadIfNoCache$1.L$5;
                            i9 = i30;
                            Ref.LongRef longRef19 = (Ref.LongRef) groupInfoCacheImpl$reloadIfNoCache$1.L$4;
                            BaseDao baseDao15 = (BaseDao) groupInfoCacheImpl$reloadIfNoCache$1.L$3;
                            InHouseIMGroupEntity inHouseIMGroupEntity11 = (InHouseIMGroupEntity) groupInfoCacheImpl$reloadIfNoCache$1.L$2;
                            str9 = (java.lang.String) groupInfoCacheImpl$reloadIfNoCache$1.L$1;
                            sFR sfr7 = (sFR) groupInfoCacheImpl$reloadIfNoCache$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj2);
                                longRef10 = longRef19;
                                groupInfoCacheImpl$reloadIfNoCache$14 = groupInfoCacheImpl$reloadIfNoCache$1;
                                longRef11 = longRef18;
                                str10 = "not open";
                                sfr = sfr7;
                                i12 = i8;
                                i6 = i31;
                                inHouseIMGroupEntity2 = inHouseIMGroupEntity11;
                                str13 = "Database Operation failed after ";
                                objectRef6 = objectRef17;
                                objectRef5 = objectRef19;
                                inHouseIMGroupEntity3 = inHouseIMGroupEntity10;
                                str14 = " attempts";
                                jNanoTime2 = j3;
                                objectRef7 = objectRef18;
                                baseDao8 = baseDao15;
                                t2 = obj2;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e32) {
                                i10 = i31;
                                inHouseIMGroupEntity4 = inHouseIMGroupEntity10;
                                objectRef5 = objectRef19;
                                str10 = "not open";
                                baseDao9 = baseDao15;
                                inHouseIMGroupEntity5 = inHouseIMGroupEntity11;
                                str11 = str9;
                                longRef9 = longRef19;
                                sfr3 = sfr7;
                                str12 = " attempts";
                                i11 = i9;
                                r02 = e32;
                                C44159sFm.copydefault(r02, (java.lang.Exception) objectRef5.element);
                                objectRef5.element = r02;
                                if (i11 >= i10 - 1) {
                                }
                                BaseDao baseDao13222 = baseDao9;
                                i6 = i10;
                                baseDao8 = baseDao13222;
                                i7 = i13 + 1;
                                if (i7 >= i6) {
                                }
                            } catch (java.lang.IllegalStateException e33) {
                                e = e33;
                                message2 = e.getMessage();
                                if (message2 == null) {
                                    break;
                                }
                                C44159sFm.copydefault(e);
                                throw e;
                            } catch (java.lang.Exception e34) {
                                e = e34;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th10) {
                                th = th10;
                                longRef2 = longRef19;
                                baseDao2 = baseDao15;
                                C44159sFm.EZpvd(baseDao2, longRef2.element);
                                throw th;
                            }
                            objectRef6.element = t2;
                            longRef11.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime2, DurationUnit.NANOSECONDS));
                            T t52 = objectRef7.element;
                            C44159sFm.EZpvd(baseDao8, longRef10.element);
                            inHouseIMGroupEntity3.setGroupTopMembers((java.util.List) t52);
                            InHouseIMGroupSettingDao inHouseIMGroupSettingDaoValueOf3 = sfr.valueOf();
                            Ref.LongRef longRef162 = new Ref.LongRef();
                            objectRef8 = new Ref.ObjectRef();
                            baseDao10 = inHouseIMGroupSettingDaoValueOf3;
                            longRef12 = longRef162;
                            inHouseIMGroupEntity6 = inHouseIMGroupEntity2;
                            str24 = str10;
                            str25 = str14;
                            str26 = str13;
                            str15 = str9;
                            i14 = 3;
                            i15 = 0;
                            groupInfoCacheImpl$reloadIfNoCache$1 = groupInfoCacheImpl$reloadIfNoCache$14;
                            if (i15 >= i14) {
                            }
                            break;
                        case 4:
                            i13 = groupInfoCacheImpl$reloadIfNoCache$1.I$1;
                            i10 = groupInfoCacheImpl$reloadIfNoCache$1.I$0;
                            InHouseIMGroupEntity inHouseIMGroupEntity12 = (InHouseIMGroupEntity) groupInfoCacheImpl$reloadIfNoCache$1.L$6;
                            Ref.ObjectRef objectRef20 = (Ref.ObjectRef) groupInfoCacheImpl$reloadIfNoCache$1.L$5;
                            Ref.LongRef longRef20 = (Ref.LongRef) groupInfoCacheImpl$reloadIfNoCache$1.L$4;
                            baseDao9 = (BaseDao) groupInfoCacheImpl$reloadIfNoCache$1.L$3;
                            InHouseIMGroupEntity inHouseIMGroupEntity13 = (InHouseIMGroupEntity) groupInfoCacheImpl$reloadIfNoCache$1.L$2;
                            java.lang.String str34 = (java.lang.String) groupInfoCacheImpl$reloadIfNoCache$1.L$1;
                            sFR sfr8 = (sFR) groupInfoCacheImpl$reloadIfNoCache$1.L$0;
                            C56391yDq.AEQbTJ(obj2);
                            inHouseIMGroupEntity3 = inHouseIMGroupEntity12;
                            str7 = str34;
                            longRef2 = longRef20;
                            inHouseIMGroupEntity2 = inHouseIMGroupEntity13;
                            objectRef5 = objectRef20;
                            sfr = sfr8;
                            BaseDao baseDao132222 = baseDao9;
                            i6 = i10;
                            baseDao8 = baseDao132222;
                            i7 = i13 + 1;
                            if (i7 >= i6) {
                            }
                            break;
                        case 5:
                            long j4 = groupInfoCacheImpl$reloadIfNoCache$1.J$0;
                            i16 = groupInfoCacheImpl$reloadIfNoCache$1.I$2;
                            int i32 = groupInfoCacheImpl$reloadIfNoCache$1.I$1;
                            i17 = groupInfoCacheImpl$reloadIfNoCache$1.I$0;
                            inHouseIMGroupEntity7 = (InHouseIMGroupEntity) groupInfoCacheImpl$reloadIfNoCache$1.L$9;
                            Ref.ObjectRef objectRef21 = (Ref.ObjectRef) groupInfoCacheImpl$reloadIfNoCache$1.L$8;
                            Ref.LongRef longRef21 = (Ref.LongRef) groupInfoCacheImpl$reloadIfNoCache$1.L$7;
                            Ref.ObjectRef objectRef22 = (Ref.ObjectRef) groupInfoCacheImpl$reloadIfNoCache$1.L$6;
                            objectRef9 = (Ref.ObjectRef) groupInfoCacheImpl$reloadIfNoCache$1.L$5;
                            Ref.LongRef longRef22 = (Ref.LongRef) groupInfoCacheImpl$reloadIfNoCache$1.L$4;
                            BaseDao baseDao16 = (BaseDao) groupInfoCacheImpl$reloadIfNoCache$1.L$3;
                            InHouseIMGroupEntity inHouseIMGroupEntity14 = (InHouseIMGroupEntity) groupInfoCacheImpl$reloadIfNoCache$1.L$2;
                            str18 = (java.lang.String) groupInfoCacheImpl$reloadIfNoCache$1.L$1;
                            sFR sfr9 = (sFR) groupInfoCacheImpl$reloadIfNoCache$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj2);
                                sfr = sfr9;
                                longRef13 = longRef22;
                                str21 = " attempts";
                                i15 = i16;
                                i20 = i32;
                                inHouseIMGroupEntity2 = inHouseIMGroupEntity14;
                                objectRef11 = objectRef21;
                                baseDao10 = baseDao16;
                                str22 = "Database Operation failed after ";
                                str23 = "not open";
                                jNanoTime3 = j4;
                                longRef14 = longRef21;
                                objectRef12 = objectRef22;
                                t3 = obj2;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e35) {
                                sfr4 = sfr9;
                                i18 = i32;
                                i19 = i17;
                                longRef12 = longRef22;
                                baseDao10 = baseDao16;
                                inHouseIMGroupEntity8 = inHouseIMGroupEntity14;
                                str19 = str18;
                                objectRef10 = objectRef9;
                                str20 = "not open";
                                r03 = e35;
                                C44159sFm.copydefault(r03, (java.lang.Exception) objectRef10.element);
                                objectRef10.element = r03;
                                if (i16 < i19 - 1) {
                                }
                                int i2422 = i19;
                                objectRef8 = objectRef10;
                                inHouseIMGroupEntity2 = inHouseIMGroupEntity8;
                                sfr = sfr4;
                                i15 = i18 + 1;
                                str15 = str19;
                                inHouseIMGroupEntity6 = inHouseIMGroupEntity7;
                                i14 = i2422;
                                if (i15 >= i14) {
                                }
                            } catch (java.lang.IllegalStateException e36) {
                                e = e36;
                                message3 = e.getMessage();
                                if (message3 == null) {
                                    break;
                                }
                                C44159sFm.copydefault(e);
                                throw e;
                            } catch (java.lang.Exception e37) {
                                e = e37;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                                longRef5 = longRef22;
                                baseDao5 = baseDao16;
                                C44159sFm.EZpvd(baseDao5, longRef5.element);
                                throw th;
                            }
                            objectRef11.element = t3;
                            longRef14.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime3, DurationUnit.NANOSECONDS));
                            T t62 = objectRef12.element;
                            C44159sFm.EZpvd(baseDao10, longRef13.element);
                            inHouseIMGroupEntity7.setUserSetting((InHouseIMGroupSettingEntity) t62);
                            sJM sjm2 = sJM.AEQbTJ;
                            groupInfoCacheImpl$reloadIfNoCache$1.L$0 = null;
                            groupInfoCacheImpl$reloadIfNoCache$1.L$1 = null;
                            groupInfoCacheImpl$reloadIfNoCache$1.L$2 = null;
                            groupInfoCacheImpl$reloadIfNoCache$1.L$3 = null;
                            groupInfoCacheImpl$reloadIfNoCache$1.L$4 = null;
                            groupInfoCacheImpl$reloadIfNoCache$1.L$5 = null;
                            groupInfoCacheImpl$reloadIfNoCache$1.L$6 = null;
                            groupInfoCacheImpl$reloadIfNoCache$1.L$7 = null;
                            groupInfoCacheImpl$reloadIfNoCache$1.L$8 = null;
                            groupInfoCacheImpl$reloadIfNoCache$1.L$9 = null;
                            groupInfoCacheImpl$reloadIfNoCache$1.label = 7;
                            objEZpvd = sjm2.EZpvd(inHouseIMGroupEntity2, groupInfoCacheImpl$reloadIfNoCache$1);
                            obj = objEZpvd;
                            if (objEZpvd == objCopydefault) {
                            }
                            return (GroupInfo) obj;
                        case 6:
                            i18 = groupInfoCacheImpl$reloadIfNoCache$1.I$1;
                            int i33 = groupInfoCacheImpl$reloadIfNoCache$1.I$0;
                            InHouseIMGroupEntity inHouseIMGroupEntity15 = (InHouseIMGroupEntity) groupInfoCacheImpl$reloadIfNoCache$1.L$6;
                            objectRef10 = (Ref.ObjectRef) groupInfoCacheImpl$reloadIfNoCache$1.L$5;
                            longRef12 = (Ref.LongRef) groupInfoCacheImpl$reloadIfNoCache$1.L$4;
                            baseDao10 = (BaseDao) groupInfoCacheImpl$reloadIfNoCache$1.L$3;
                            inHouseIMGroupEntity8 = (InHouseIMGroupEntity) groupInfoCacheImpl$reloadIfNoCache$1.L$2;
                            str19 = (java.lang.String) groupInfoCacheImpl$reloadIfNoCache$1.L$1;
                            sfr4 = (sFR) groupInfoCacheImpl$reloadIfNoCache$1.L$0;
                            C56391yDq.AEQbTJ(obj2);
                            i19 = i33;
                            inHouseIMGroupEntity7 = inHouseIMGroupEntity15;
                            int i24222 = i19;
                            objectRef8 = objectRef10;
                            inHouseIMGroupEntity2 = inHouseIMGroupEntity8;
                            sfr = sfr4;
                            i15 = i18 + 1;
                            str15 = str19;
                            inHouseIMGroupEntity6 = inHouseIMGroupEntity7;
                            i14 = i24222;
                            if (i15 >= i14) {
                            }
                            break;
                        case 7:
                            C56391yDq.AEQbTJ(obj2);
                            obj = obj2;
                            return (GroupInfo) obj;
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (java.lang.Throwable th12) {
                    th = th12;
                    longRef2 = longRef;
                    baseDao2 = baseDao;
                }
            } catch (java.lang.Throwable th13) {
                th = th13;
            }
        } catch (java.lang.Throwable th14) {
            th = th14;
            longRef4 = longRef3;
            baseDao4 = baseDao3;
        }
    }

    @Override // o.sFO
    public GroupInfo OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (GroupInfo) BuildersKt.runBlocking(this.KWHzl, new GroupInfoCacheImpl$getGroupInfo$1(this, str, null));
    }

    @Override // o.sFO
    public void EZpvd(@NotNull GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(groupInfo, "");
        EZpvd(groupInfo.getGroupId(), groupInfo);
    }
}
