package o;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao;
import com.okinc.okimcore.model.im.inhouseim.ContactRelationType;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.repository.ContactRepository$getContactEntityById$1;
import com.okinc.okimcore.repository.ContactRepository$getContactIdsNotInListBatch$1;
import com.okinc.okimcore.repository.ContactRepository$insertOrReplaceContacts$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sRo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44485sRo {
    public final sIC KWHzl;

    @yCM
    public C44485sRo(@NotNull sIC sic) {
        Intrinsics.checkNotNullParameter(sic, "");
        this.KWHzl = sic;
    }

    public final InHouseIMContactDao OLrzqt() {
        return this.KWHzl.copydefault().OLrzqt();
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
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMContactInfoEntity> continuation) throws java.lang.Exception {
        ContactRepository$getContactEntityById$1 contactRepository$getContactEntityById$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoOLrzqt;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        C44485sRo c44485sRo;
        ContactRepository$getContactEntityById$1 contactRepository$getContactEntityById$12;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.lang.String str3;
        Ref.ObjectRef objectRef2;
        int i4;
        C44485sRo c44485sRo2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        C44485sRo c44485sRo3;
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
        if (continuation instanceof ContactRepository$getContactEntityById$1) {
            contactRepository$getContactEntityById$1 = (ContactRepository$getContactEntityById$1) continuation;
            int i7 = contactRepository$getContactEntityById$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                contactRepository$getContactEntityById$1.label = i7 - Integer.MIN_VALUE;
            } else {
                contactRepository$getContactEntityById$1 = new ContactRepository$getContactEntityById$1(this, continuation);
            }
        }
        java.lang.Object obj = contactRepository$getContactEntityById$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = contactRepository$getContactEntityById$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = contactRepository$getContactEntityById$1.J$0;
                    i4 = contactRepository$getContactEntityById$1.I$2;
                    i3 = contactRepository$getContactEntityById$1.I$1;
                    i = contactRepository$getContactEntityById$1.I$0;
                    objectRef5 = (Ref.ObjectRef) contactRepository$getContactEntityById$1.L$7;
                    longRef3 = (Ref.LongRef) contactRepository$getContactEntityById$1.L$6;
                    objectRef4 = (Ref.ObjectRef) contactRepository$getContactEntityById$1.L$5;
                    objectRef2 = (Ref.ObjectRef) contactRepository$getContactEntityById$1.L$4;
                    longRef2 = (Ref.LongRef) contactRepository$getContactEntityById$1.L$3;
                    baseDaoOLrzqt = (BaseDao) contactRepository$getContactEntityById$1.L$2;
                    str4 = (java.lang.String) contactRepository$getContactEntityById$1.L$1;
                    c44485sRo2 = (C44485sRo) contactRepository$getContactEntityById$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoOLrzqt;
                        i6 = i;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        str3 = str4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44485sRo3 = c44485sRo2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoOLrzqt;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        contactRepository$getContactEntityById$12 = contactRepository$getContactEntityById$1;
                        i2 = i + i;
                        c44485sRo = c44485sRo3;
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
                        C44159sFm.EZpvd(baseDaoOLrzqt, longRef2.element);
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
                int i11 = contactRepository$getContactEntityById$1.I$1;
                int i12 = contactRepository$getContactEntityById$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) contactRepository$getContactEntityById$1.L$4;
                longRef4 = (Ref.LongRef) contactRepository$getContactEntityById$1.L$3;
                BaseDao baseDao3 = (BaseDao) contactRepository$getContactEntityById$1.L$2;
                java.lang.String str5 = (java.lang.String) contactRepository$getContactEntityById$1.L$1;
                c44485sRo3 = (C44485sRo) contactRepository$getContactEntityById$1.L$0;
                C56391yDq.AEQbTJ(obj);
                ContactRepository$getContactEntityById$1 contactRepository$getContactEntityById$13 = contactRepository$getContactEntityById$1;
                int i13 = 1;
                baseDaoOLrzqt = baseDao3;
                str2 = str5;
                i = i12;
                objectRef = objectRef6;
                contactRepository$getContactEntityById$12 = contactRepository$getContactEntityById$13;
                i2 = i11 + i13;
                c44485sRo = c44485sRo3;
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
                            C44159sFm.EZpvd(baseDaoOLrzqt, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        str3 = str2;
                        contactRepository$getContactEntityById$1 = contactRepository$getContactEntityById$12;
                        c44485sRo2 = c44485sRo;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        c44485sRo3 = c44485sRo2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoOLrzqt;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            contactRepository$getContactEntityById$1.L$0 = c44485sRo3;
                            contactRepository$getContactEntityById$1.L$1 = str3;
                            contactRepository$getContactEntityById$1.L$2 = baseDao2;
                            contactRepository$getContactEntityById$1.L$3 = longRef4;
                            contactRepository$getContactEntityById$1.L$4 = objectRef3;
                            contactRepository$getContactEntityById$1.L$5 = null;
                            contactRepository$getContactEntityById$1.L$6 = null;
                            contactRepository$getContactEntityById$1.L$7 = null;
                            contactRepository$getContactEntityById$1.I$0 = i6;
                            contactRepository$getContactEntityById$1.I$1 = i5;
                            contactRepository$getContactEntityById$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, contactRepository$getContactEntityById$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            contactRepository$getContactEntityById$13 = contactRepository$getContactEntityById$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoOLrzqt = baseDao4;
                        } else {
                            contactRepository$getContactEntityById$13 = contactRepository$getContactEntityById$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoOLrzqt = baseDao5;
                        }
                        contactRepository$getContactEntityById$12 = contactRepository$getContactEntityById$13;
                        i2 = i11 + i13;
                        c44485sRo = c44485sRo3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        str3 = str2;
                        contactRepository$getContactEntityById$1 = contactRepository$getContactEntityById$12;
                        c44485sRo2 = c44485sRo;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44485sRo3 = c44485sRo2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoOLrzqt;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        contactRepository$getContactEntityById$12 = contactRepository$getContactEntityById$13;
                        i2 = i11 + i13;
                        c44485sRo = c44485sRo3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMContactDao inHouseIMContactDaoOLrzqt = c44485sRo.OLrzqt();
                    contactRepository$getContactEntityById$12.L$0 = c44485sRo;
                    contactRepository$getContactEntityById$12.L$1 = str2;
                    contactRepository$getContactEntityById$12.L$2 = baseDaoOLrzqt;
                    contactRepository$getContactEntityById$12.L$3 = longRef3;
                    contactRepository$getContactEntityById$12.L$4 = objectRef;
                    contactRepository$getContactEntityById$12.L$5 = objectRef5;
                    contactRepository$getContactEntityById$12.L$6 = longRef3;
                    contactRepository$getContactEntityById$12.L$7 = objectRef5;
                    contactRepository$getContactEntityById$12.I$0 = i;
                    contactRepository$getContactEntityById$12.I$1 = i2;
                    contactRepository$getContactEntityById$12.I$2 = i2;
                    contactRepository$getContactEntityById$12.J$0 = jNanoTime;
                    contactRepository$getContactEntityById$12.label = 1;
                    java.lang.Object contactEntityById = inHouseIMContactDaoOLrzqt.getContactEntityById(str2, contactRepository$getContactEntityById$12);
                    if (contactEntityById == objCopydefault) {
                        return objCopydefault;
                    }
                    str4 = str2;
                    contactRepository$getContactEntityById$1 = contactRepository$getContactEntityById$12;
                    c44485sRo2 = c44485sRo;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoOLrzqt;
                    i6 = i14;
                    t = contactEntityById;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        c44485sRo3 = c44485sRo2;
                        objectRef3 = objectRef2;
                        str3 = str4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        contactRepository$getContactEntityById$12 = contactRepository$getContactEntityById$13;
                        i2 = i11 + i13;
                        c44485sRo = c44485sRo3;
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
                C44159sFm.EZpvd(baseDaoOLrzqt, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoOLrzqt = OLrzqt();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            c44485sRo = this;
            contactRepository$getContactEntityById$12 = contactRepository$getContactEntityById$1;
            str2 = str;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoOLrzqt = baseDao;
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
    public final java.lang.Object OLrzqt(@NotNull java.util.List<InHouseIMContactInfoEntity> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        ContactRepository$insertOrReplaceContacts$1 contactRepository$insertOrReplaceContacts$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoOLrzqt;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        C44485sRo c44485sRo;
        ContactRepository$insertOrReplaceContacts$1 contactRepository$insertOrReplaceContacts$12;
        java.util.List<InHouseIMContactInfoEntity> list2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.util.List<InHouseIMContactInfoEntity> list3;
        Ref.ObjectRef objectRef2;
        int i4;
        C44485sRo c44485sRo2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        C44485sRo c44485sRo3;
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
        java.util.List<InHouseIMContactInfoEntity> list4;
        if (continuation instanceof ContactRepository$insertOrReplaceContacts$1) {
            contactRepository$insertOrReplaceContacts$1 = (ContactRepository$insertOrReplaceContacts$1) continuation;
            int i7 = contactRepository$insertOrReplaceContacts$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                contactRepository$insertOrReplaceContacts$1.label = i7 - Integer.MIN_VALUE;
            } else {
                contactRepository$insertOrReplaceContacts$1 = new ContactRepository$insertOrReplaceContacts$1(this, continuation);
            }
        }
        java.lang.Object obj = contactRepository$insertOrReplaceContacts$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = contactRepository$insertOrReplaceContacts$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = contactRepository$insertOrReplaceContacts$1.J$0;
                    i4 = contactRepository$insertOrReplaceContacts$1.I$2;
                    i3 = contactRepository$insertOrReplaceContacts$1.I$1;
                    i = contactRepository$insertOrReplaceContacts$1.I$0;
                    objectRef5 = (Ref.ObjectRef) contactRepository$insertOrReplaceContacts$1.L$7;
                    longRef3 = (Ref.LongRef) contactRepository$insertOrReplaceContacts$1.L$6;
                    objectRef4 = (Ref.ObjectRef) contactRepository$insertOrReplaceContacts$1.L$5;
                    objectRef2 = (Ref.ObjectRef) contactRepository$insertOrReplaceContacts$1.L$4;
                    longRef2 = (Ref.LongRef) contactRepository$insertOrReplaceContacts$1.L$3;
                    baseDaoOLrzqt = (BaseDao) contactRepository$insertOrReplaceContacts$1.L$2;
                    list4 = (java.util.List) contactRepository$insertOrReplaceContacts$1.L$1;
                    c44485sRo2 = (C44485sRo) contactRepository$insertOrReplaceContacts$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoOLrzqt;
                        i6 = i;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        list3 = list4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44485sRo3 = c44485sRo2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoOLrzqt;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        contactRepository$insertOrReplaceContacts$12 = contactRepository$insertOrReplaceContacts$1;
                        i2 = i + i;
                        c44485sRo = c44485sRo3;
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
                        C44159sFm.EZpvd(baseDaoOLrzqt, longRef2.element);
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
                int i11 = contactRepository$insertOrReplaceContacts$1.I$1;
                int i12 = contactRepository$insertOrReplaceContacts$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) contactRepository$insertOrReplaceContacts$1.L$4;
                longRef4 = (Ref.LongRef) contactRepository$insertOrReplaceContacts$1.L$3;
                BaseDao baseDao3 = (BaseDao) contactRepository$insertOrReplaceContacts$1.L$2;
                java.util.List<InHouseIMContactInfoEntity> list5 = (java.util.List) contactRepository$insertOrReplaceContacts$1.L$1;
                c44485sRo3 = (C44485sRo) contactRepository$insertOrReplaceContacts$1.L$0;
                C56391yDq.AEQbTJ(obj);
                ContactRepository$insertOrReplaceContacts$1 contactRepository$insertOrReplaceContacts$13 = contactRepository$insertOrReplaceContacts$1;
                int i13 = 1;
                baseDaoOLrzqt = baseDao3;
                list2 = list5;
                i = i12;
                objectRef = objectRef6;
                contactRepository$insertOrReplaceContacts$12 = contactRepository$insertOrReplaceContacts$13;
                i2 = i11 + i13;
                c44485sRo = c44485sRo3;
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
                            C44159sFm.EZpvd(baseDaoOLrzqt, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        list3 = list2;
                        contactRepository$insertOrReplaceContacts$1 = contactRepository$insertOrReplaceContacts$12;
                        c44485sRo2 = c44485sRo;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        c44485sRo3 = c44485sRo2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoOLrzqt;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            contactRepository$insertOrReplaceContacts$1.L$0 = c44485sRo3;
                            contactRepository$insertOrReplaceContacts$1.L$1 = list3;
                            contactRepository$insertOrReplaceContacts$1.L$2 = baseDao2;
                            contactRepository$insertOrReplaceContacts$1.L$3 = longRef4;
                            contactRepository$insertOrReplaceContacts$1.L$4 = objectRef3;
                            contactRepository$insertOrReplaceContacts$1.L$5 = null;
                            contactRepository$insertOrReplaceContacts$1.L$6 = null;
                            contactRepository$insertOrReplaceContacts$1.L$7 = null;
                            contactRepository$insertOrReplaceContacts$1.I$0 = i6;
                            contactRepository$insertOrReplaceContacts$1.I$1 = i5;
                            contactRepository$insertOrReplaceContacts$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, contactRepository$insertOrReplaceContacts$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            contactRepository$insertOrReplaceContacts$13 = contactRepository$insertOrReplaceContacts$1;
                            i11 = i5;
                            list2 = list3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoOLrzqt = baseDao4;
                        } else {
                            contactRepository$insertOrReplaceContacts$13 = contactRepository$insertOrReplaceContacts$1;
                            i11 = i5;
                            list2 = list3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoOLrzqt = baseDao5;
                        }
                        contactRepository$insertOrReplaceContacts$12 = contactRepository$insertOrReplaceContacts$13;
                        i2 = i11 + i13;
                        c44485sRo = c44485sRo3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        list3 = list2;
                        contactRepository$insertOrReplaceContacts$1 = contactRepository$insertOrReplaceContacts$12;
                        c44485sRo2 = c44485sRo;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44485sRo3 = c44485sRo2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoOLrzqt;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        contactRepository$insertOrReplaceContacts$12 = contactRepository$insertOrReplaceContacts$13;
                        i2 = i11 + i13;
                        c44485sRo = c44485sRo3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMContactDao inHouseIMContactDaoOLrzqt = c44485sRo.OLrzqt();
                    contactRepository$insertOrReplaceContacts$12.L$0 = c44485sRo;
                    contactRepository$insertOrReplaceContacts$12.L$1 = list2;
                    contactRepository$insertOrReplaceContacts$12.L$2 = baseDaoOLrzqt;
                    contactRepository$insertOrReplaceContacts$12.L$3 = longRef3;
                    contactRepository$insertOrReplaceContacts$12.L$4 = objectRef;
                    contactRepository$insertOrReplaceContacts$12.L$5 = objectRef5;
                    contactRepository$insertOrReplaceContacts$12.L$6 = longRef3;
                    contactRepository$insertOrReplaceContacts$12.L$7 = objectRef5;
                    contactRepository$insertOrReplaceContacts$12.I$0 = i;
                    contactRepository$insertOrReplaceContacts$12.I$1 = i2;
                    contactRepository$insertOrReplaceContacts$12.I$2 = i2;
                    contactRepository$insertOrReplaceContacts$12.J$0 = jNanoTime;
                    contactRepository$insertOrReplaceContacts$12.label = 1;
                    if (inHouseIMContactDaoOLrzqt.insertOrReplaceContacts(list2, contactRepository$insertOrReplaceContacts$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    list4 = list2;
                    contactRepository$insertOrReplaceContacts$1 = contactRepository$insertOrReplaceContacts$12;
                    c44485sRo2 = c44485sRo;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoOLrzqt;
                    i6 = i14;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        c44485sRo3 = c44485sRo2;
                        objectRef3 = objectRef2;
                        list3 = list4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        contactRepository$insertOrReplaceContacts$12 = contactRepository$insertOrReplaceContacts$13;
                        i2 = i11 + i13;
                        c44485sRo = c44485sRo3;
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
                C44159sFm.EZpvd(baseDaoOLrzqt, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoOLrzqt = OLrzqt();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            c44485sRo = this;
            contactRepository$insertOrReplaceContacts$12 = contactRepository$insertOrReplaceContacts$1;
            list2 = list;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoOLrzqt = baseDao;
        }
    }

    /* JADX DEBUG: Duplicate block (B:79:0x01e8) to fix multi-entry loop: BACK_EDGE: B:79:0x01e8 -> B:80:0x01f0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v44, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01a3: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:69:0x01a3 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01a4: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:69:0x01a3 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f A[Catch: all -> 0x005c, TryCatch #13 {all -> 0x005c, blocks: (B:13:0x004a, B:37:0x0122, B:57:0x0182, B:58:0x0185, B:61:0x0189, B:63:0x018f, B:65:0x019b, B:66:0x019e, B:67:0x019f, B:68:0x01a2), top: B:96:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01be A[Catch: all -> 0x01f6, TRY_LEAVE, TryCatch #7 {all -> 0x01f6, blocks: (B:73:0x01b1, B:75:0x01be), top: B:92:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<? extends ContactRelationType> list2, @NotNull Continuation<? super java.util.List<java.lang.String>> continuation) throws java.lang.Exception {
        ContactRepository$getContactIdsNotInListBatch$1 contactRepository$getContactIdsNotInListBatch$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        C44485sRo c44485sRo;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        java.util.List<? extends ContactRelationType> list3;
        BaseDao baseDao3;
        ContactRepository$getContactIdsNotInListBatch$1 contactRepository$getContactIdsNotInListBatch$12;
        java.util.List<java.lang.String> list4;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        C44485sRo c44485sRo2;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef2;
        java.util.List<? extends ContactRelationType> list5;
        BaseDao baseDao4;
        int i3;
        java.util.List<java.lang.String> list6;
        ?? r0;
        ContactRepository$getContactIdsNotInListBatch$1 contactRepository$getContactIdsNotInListBatch$13;
        Ref.LongRef longRef5;
        Ref.ObjectRef objectRef3;
        int i4;
        BaseDao baseDao5;
        long jNanoTime;
        int i5;
        Ref.ObjectRef objectRef4;
        java.util.List<java.lang.String> list7;
        C44485sRo c44485sRo3;
        Ref.ObjectRef objectRef5;
        T t;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        if (continuation instanceof ContactRepository$getContactIdsNotInListBatch$1) {
            contactRepository$getContactIdsNotInListBatch$1 = (ContactRepository$getContactIdsNotInListBatch$1) continuation;
            int i6 = contactRepository$getContactIdsNotInListBatch$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                contactRepository$getContactIdsNotInListBatch$1.label = i6 - Integer.MIN_VALUE;
            } else {
                contactRepository$getContactIdsNotInListBatch$1 = new ContactRepository$getContactIdsNotInListBatch$1(this, continuation);
            }
        }
        java.lang.Object obj = contactRepository$getContactIdsNotInListBatch$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i7 = contactRepository$getContactIdsNotInListBatch$1.label;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    jNanoTime = contactRepository$getContactIdsNotInListBatch$1.J$0;
                    i3 = contactRepository$getContactIdsNotInListBatch$1.I$2;
                    int i8 = contactRepository$getContactIdsNotInListBatch$1.I$1;
                    i = contactRepository$getContactIdsNotInListBatch$1.I$0;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) contactRepository$getContactIdsNotInListBatch$1.L$8;
                    Ref.LongRef longRef6 = (Ref.LongRef) contactRepository$getContactIdsNotInListBatch$1.L$7;
                    Ref.ObjectRef objectRef7 = (Ref.ObjectRef) contactRepository$getContactIdsNotInListBatch$1.L$6;
                    objectRef4 = (Ref.ObjectRef) contactRepository$getContactIdsNotInListBatch$1.L$5;
                    longRef2 = (Ref.LongRef) contactRepository$getContactIdsNotInListBatch$1.L$4;
                    baseDao2 = (BaseDao) contactRepository$getContactIdsNotInListBatch$1.L$3;
                    list5 = (java.util.List) contactRepository$getContactIdsNotInListBatch$1.L$2;
                    java.util.List<java.lang.String> list8 = (java.util.List) contactRepository$getContactIdsNotInListBatch$1.L$1;
                    c44485sRo3 = (C44485sRo) contactRepository$getContactIdsNotInListBatch$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        list7 = list8;
                        contactRepository$getContactIdsNotInListBatch$13 = contactRepository$getContactIdsNotInListBatch$1;
                        objectRef5 = objectRef7;
                        longRef5 = longRef6;
                        objectRef3 = objectRef6;
                        i4 = i;
                        baseDao5 = baseDao2;
                        i2 = i3;
                        longRef4 = longRef2;
                        i5 = i8;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        c44485sRo2 = c44485sRo3;
                        objectRef2 = objectRef4;
                        baseDao4 = baseDao2;
                        i2 = i8;
                        list6 = list8;
                        longRef4 = longRef2;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i3 < i - 1) {
                        }
                        i2 += i;
                        baseDao3 = baseDao;
                        c44485sRo = c44485sRo2;
                        i = i;
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
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef3.element = t;
                    longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef5.element;
                    C44159sFm.EZpvd(baseDao5, longRef4.element);
                    java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(list7);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (r0.hasNext()) {
                    }
                    return arrayList;
                }
                if (i7 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = contactRepository$getContactIdsNotInListBatch$1.I$1;
                int i10 = contactRepository$getContactIdsNotInListBatch$1.I$0;
                Ref.ObjectRef objectRef8 = (Ref.ObjectRef) contactRepository$getContactIdsNotInListBatch$1.L$5;
                Ref.LongRef longRef7 = (Ref.LongRef) contactRepository$getContactIdsNotInListBatch$1.L$4;
                BaseDao baseDao6 = (BaseDao) contactRepository$getContactIdsNotInListBatch$1.L$3;
                java.util.List<? extends ContactRelationType> list9 = (java.util.List) contactRepository$getContactIdsNotInListBatch$1.L$2;
                java.util.List<java.lang.String> list10 = (java.util.List) contactRepository$getContactIdsNotInListBatch$1.L$1;
                c44485sRo2 = (C44485sRo) contactRepository$getContactIdsNotInListBatch$1.L$0;
                C56391yDq.AEQbTJ(obj);
                contactRepository$getContactIdsNotInListBatch$12 = contactRepository$getContactIdsNotInListBatch$1;
                i2 = i9;
                int i11 = i10;
                list3 = list9;
                list4 = list10;
                longRef3 = longRef7;
                int i12 = 1;
                objectRef = objectRef8;
                i2 += i12;
                baseDao3 = baseDao6;
                c44485sRo = c44485sRo2;
                i = i11;
                if (i2 < i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            message = e2.getMessage();
                            if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                C44159sFm.OLrzqt(e2);
                                throw e2;
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            baseDao2 = baseDao3;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        c44485sRo2 = c44485sRo;
                        objectRef2 = objectRef;
                        longRef4 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        try {
                            c44485sRo2 = c44485sRo;
                            objectRef2 = objectRef;
                            longRef4 = longRef3;
                            sQLiteDatabaseLockedException = e9;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i3 < i - 1) {
                                contactRepository$getContactIdsNotInListBatch$1.L$0 = c44485sRo2;
                                contactRepository$getContactIdsNotInListBatch$1.L$1 = list6;
                                contactRepository$getContactIdsNotInListBatch$1.L$2 = list5;
                                contactRepository$getContactIdsNotInListBatch$1.L$3 = baseDao4;
                                contactRepository$getContactIdsNotInListBatch$1.L$4 = longRef4;
                                contactRepository$getContactIdsNotInListBatch$1.L$5 = objectRef2;
                                contactRepository$getContactIdsNotInListBatch$1.L$6 = null;
                                contactRepository$getContactIdsNotInListBatch$1.L$7 = null;
                                contactRepository$getContactIdsNotInListBatch$1.L$8 = null;
                                contactRepository$getContactIdsNotInListBatch$1.I$0 = i;
                                contactRepository$getContactIdsNotInListBatch$1.I$1 = i2;
                                contactRepository$getContactIdsNotInListBatch$1.label = 2;
                                if (DelayKt.delay(((long) (i3 + 1)) * 50, contactRepository$getContactIdsNotInListBatch$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                longRef3 = longRef4;
                                i11 = i;
                                baseDao6 = baseDao4;
                                contactRepository$getContactIdsNotInListBatch$12 = contactRepository$getContactIdsNotInListBatch$1;
                                list4 = list6;
                                list3 = list5;
                                objectRef = objectRef2;
                                i12 = 1;
                            } else {
                                longRef3 = longRef4;
                                i11 = i;
                                baseDao6 = baseDao4;
                                contactRepository$getContactIdsNotInListBatch$12 = contactRepository$getContactIdsNotInListBatch$1;
                                list4 = list6;
                                list3 = list5;
                                objectRef = objectRef2;
                                i12 = 1;
                            }
                            i2 += i12;
                            baseDao3 = baseDao6;
                            c44485sRo = c44485sRo2;
                            i = i11;
                            if (i2 < i) {
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            baseDao2 = baseDao4;
                            longRef2 = longRef4;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                        list5 = list3;
                        list6 = list4;
                        contactRepository$getContactIdsNotInListBatch$1 = contactRepository$getContactIdsNotInListBatch$12;
                        baseDao4 = baseDao3;
                        i3 = i2;
                        r0 = sQLiteDatabaseLockedException;
                    }
                    Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMContactDao inHouseIMContactDaoOLrzqt = c44485sRo.OLrzqt();
                    contactRepository$getContactIdsNotInListBatch$12.L$0 = c44485sRo;
                    contactRepository$getContactIdsNotInListBatch$12.L$1 = list4;
                    contactRepository$getContactIdsNotInListBatch$12.L$2 = list3;
                    contactRepository$getContactIdsNotInListBatch$12.L$3 = baseDao3;
                    contactRepository$getContactIdsNotInListBatch$12.L$4 = longRef3;
                    contactRepository$getContactIdsNotInListBatch$12.L$5 = objectRef;
                    contactRepository$getContactIdsNotInListBatch$12.L$6 = objectRef9;
                    contactRepository$getContactIdsNotInListBatch$12.L$7 = longRef3;
                    contactRepository$getContactIdsNotInListBatch$12.L$8 = objectRef9;
                    contactRepository$getContactIdsNotInListBatch$12.I$0 = i;
                    contactRepository$getContactIdsNotInListBatch$12.I$1 = i2;
                    contactRepository$getContactIdsNotInListBatch$12.I$2 = i2;
                    contactRepository$getContactIdsNotInListBatch$12.J$0 = jNanoTime;
                    contactRepository$getContactIdsNotInListBatch$12.label = 1;
                    java.lang.Object allContactIdsExcludingTypes = inHouseIMContactDaoOLrzqt.getAllContactIdsExcludingTypes(list3, contactRepository$getContactIdsNotInListBatch$12);
                    if (allContactIdsExcludingTypes == objCopydefault) {
                        return objCopydefault;
                    }
                    contactRepository$getContactIdsNotInListBatch$13 = contactRepository$getContactIdsNotInListBatch$12;
                    objectRef4 = objectRef;
                    longRef4 = longRef3;
                    longRef5 = longRef4;
                    list5 = list3;
                    c44485sRo3 = c44485sRo;
                    i5 = i2;
                    objectRef3 = objectRef9;
                    i4 = i;
                    baseDao5 = baseDao3;
                    list7 = list4;
                    objectRef5 = objectRef3;
                    t = allContactIdsExcludingTypes;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        contactRepository$getContactIdsNotInListBatch$1 = contactRepository$getContactIdsNotInListBatch$13;
                        c44485sRo2 = c44485sRo3;
                        list6 = list7;
                        objectRef2 = objectRef4;
                        i3 = i2;
                        baseDao4 = baseDao5;
                        i = i4;
                        i2 = i5;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i3 < i - 1) {
                        }
                        i2 += i12;
                        baseDao3 = baseDao6;
                        c44485sRo = c44485sRo2;
                        i = i11;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef3.element = t;
                    longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef5.element;
                    C44159sFm.EZpvd(baseDao5, longRef4.element);
                    java.util.Set setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(list7);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : (java.util.List) t22) {
                        if (!setOqFWZa2.contains((java.lang.String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    return arrayList2;
                }
                C44159sFm.EZpvd(baseDao3, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            InHouseIMContactDao inHouseIMContactDaoOLrzqt2 = OLrzqt();
            c44485sRo = this;
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            list3 = list2;
            baseDao3 = inHouseIMContactDaoOLrzqt2;
            contactRepository$getContactIdsNotInListBatch$12 = contactRepository$getContactIdsNotInListBatch$1;
            list4 = list;
            if (i2 < i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }
}
