package com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities;

import android.database.sqlite.SQLiteDatabaseLockedException;
import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import o.C44159sFm;
import o.C44358sMw;
import o.C56391yDq;
import o.C56442yFn;
import o.C59462zhW;
import o.C59519zia;

/* JADX INFO: loaded from: classes10.dex */
public final class PhoneRelationEntityRepository$getPhoneRelationsByHashes$2 extends SuspendLambda implements Function2<Set<? extends String>, Continuation<? super List<? extends PhoneRelationEntity>>, Object> {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ C44358sMw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneRelationEntityRepository$getPhoneRelationsByHashes$2(C44358sMw c44358sMw, Continuation<? super PhoneRelationEntityRepository$getPhoneRelationsByHashes$2> continuation) {
        super(2, continuation);
        this.this$0 = c44358sMw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PhoneRelationEntityRepository$getPhoneRelationsByHashes$2 phoneRelationEntityRepository$getPhoneRelationsByHashes$2 = new PhoneRelationEntityRepository$getPhoneRelationsByHashes$2(this.this$0, continuation);
        phoneRelationEntityRepository$getPhoneRelationsByHashes$2.L$0 = obj;
        return phoneRelationEntityRepository$getPhoneRelationsByHashes$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Set<? extends String> set, Continuation<? super List<? extends PhoneRelationEntity>> continuation) {
        return invoke2((Set<String>) set, (Continuation<? super List<PhoneRelationEntity>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Set<String> set, Continuation<? super List<PhoneRelationEntity>> continuation) {
        return ((PhoneRelationEntityRepository$getPhoneRelationsByHashes$2) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0142: MOVE (r4 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:58:0x0141 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0141: MOVE (r12 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:58:0x0141 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d A[Catch: all -> 0x0030, TryCatch #7 {all -> 0x0030, blocks: (B:7:0x0028, B:46:0x0120, B:47:0x0123, B:50:0x0127, B:52:0x012d, B:54:0x0139, B:55:0x013c, B:56:0x013d, B:57:0x0140), top: B:82:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015b A[Catch: all -> 0x0197, TRY_LEAVE, TryCatch #10 {all -> 0x0197, blocks: (B:62:0x014e, B:64:0x015b), top: B:83:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0181 -> B:68:0x0183). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x018b -> B:69:0x0188). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        Set<String> set;
        C44358sMw c44358sMw;
        Exception e;
        IllegalStateException e2;
        String message;
        Ref.LongRef longRef3;
        Set<String> set2;
        BaseDao baseDao3;
        C44358sMw c44358sMw2;
        Ref.ObjectRef objectRef2;
        int i3;
        int i4;
        ?? r0;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.LongRef longRef4;
        int i5;
        int i6;
        T t;
        long jNanoTime;
        Ref.LongRef longRef5;
        Ref.ObjectRef objectRef5;
        Object objCopydefault = C56442yFn.copydefault();
        int i7 = this.label;
        int i8 = 1;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    jNanoTime = this.J$0;
                    i2 = this.I$2;
                    int i9 = this.I$1;
                    int i10 = this.I$0;
                    objectRef5 = (Ref.ObjectRef) this.L$7;
                    Ref.LongRef longRef6 = (Ref.LongRef) this.L$6;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) this.L$5;
                    Ref.ObjectRef objectRef7 = (Ref.ObjectRef) this.L$4;
                    longRef3 = (Ref.LongRef) this.L$3;
                    c44358sMw = (C44358sMw) this.L$2;
                    baseDao2 = (BaseDao) this.L$1;
                    set = (Set) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef5 = longRef3;
                        objectRef3 = objectRef7;
                        objectRef4 = objectRef6;
                        longRef4 = longRef6;
                        i5 = i10;
                        i6 = i9;
                        t = obj;
                    } catch (SQLiteDatabaseLockedException e3) {
                        set2 = set;
                        i3 = i10;
                        objectRef2 = objectRef7;
                        baseDao3 = baseDao2;
                        c44358sMw2 = c44358sMw;
                        i4 = i2;
                        i2 = i9;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i4 < i3 - 1) {
                        }
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    } catch (IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        longRef2 = longRef3;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef5.element = t;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef5.element);
                    return t2;
                }
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = this.I$1;
                i3 = this.I$0;
                objectRef2 = (Ref.ObjectRef) this.L$4;
                Ref.LongRef longRef7 = (Ref.LongRef) this.L$3;
                c44358sMw2 = (C44358sMw) this.L$2;
                baseDao3 = (BaseDao) this.L$1;
                set2 = (Set) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef2;
                longRef3 = longRef7;
                c44358sMw = c44358sMw2;
                baseDao2 = baseDao3;
                i2 = i11;
                i = i3;
                i2++;
                i8 = 1;
                set = set2;
                longRef2 = longRef3;
                if (i2 >= i) {
                    try {
                    } catch (SQLiteDatabaseLockedException e6) {
                        try {
                            C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i4 < i3 - 1) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            baseDao2 = baseDao3;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                        c44358sMw2 = c44358sMw;
                        i4 = i2;
                        i3 = i;
                        longRef3 = longRef2;
                        objectRef2 = objectRef;
                        baseDao3 = baseDao2;
                        set2 = set;
                        r0 = e6;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    } catch (IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (Throwable th3) {
                        th = th3;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = System.nanoTime();
                    PhoneRelationEntityDao phoneRelationEntityDaoEZpvd = c44358sMw.EZpvd();
                    this.L$0 = set;
                    this.L$1 = baseDao2;
                    this.L$2 = c44358sMw;
                    this.L$3 = longRef2;
                    this.L$4 = objectRef;
                    this.L$5 = objectRef5;
                    this.L$6 = longRef2;
                    this.L$7 = objectRef5;
                    this.I$0 = i;
                    this.I$1 = i2;
                    this.I$2 = i2;
                    this.J$0 = jNanoTime;
                    this.label = i8;
                    Object phoneRelationsByHashes = phoneRelationEntityDaoEZpvd.getPhoneRelationsByHashes(set, this);
                    if (phoneRelationsByHashes == objCopydefault) {
                        return objCopydefault;
                    }
                    longRef5 = longRef2;
                    longRef4 = longRef5;
                    objectRef3 = objectRef;
                    objectRef4 = objectRef5;
                    i5 = i;
                    i6 = i2;
                    t = phoneRelationsByHashes;
                    try {
                    } catch (SQLiteDatabaseLockedException e9) {
                        c44358sMw2 = c44358sMw;
                        i4 = i2;
                        i2 = i6;
                        i3 = i5;
                        objectRef2 = objectRef3;
                        baseDao3 = baseDao2;
                        set2 = set;
                        longRef3 = longRef5;
                        r0 = e9;
                        C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i4 < i3 - 1) {
                            this.L$0 = set2;
                            this.L$1 = baseDao3;
                            this.L$2 = c44358sMw2;
                            this.L$3 = longRef3;
                            this.L$4 = objectRef2;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.I$0 = i3;
                            this.I$1 = i2;
                            this.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            i11 = i2;
                            longRef7 = longRef3;
                            objectRef = objectRef2;
                            longRef3 = longRef7;
                            c44358sMw = c44358sMw2;
                            baseDao2 = baseDao3;
                            i2 = i11;
                            i = i3;
                            i2++;
                            i8 = 1;
                            set = set2;
                            longRef2 = longRef3;
                            if (i2 >= i) {
                            }
                        } else {
                            objectRef = objectRef2;
                            c44358sMw = c44358sMw2;
                            baseDao2 = baseDao3;
                            i = i3;
                            i2++;
                            i8 = 1;
                            set = set2;
                            longRef2 = longRef3;
                            if (i2 >= i) {
                            }
                        }
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    } catch (IllegalStateException e10) {
                        e2 = e10;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "not open", false, 2, (Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (Exception e11) {
                        e = e11;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (Throwable th4) {
                        th = th4;
                        longRef2 = longRef5;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef5.element = t;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef5.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDao2, longRef2.element);
                Exception exc = (Exception) objectRef.element;
                if (exc == null) {
                    exc = new Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            Set<String> set3 = (Set) this.L$0;
            PhoneRelationEntityDao phoneRelationEntityDaoEZpvd2 = this.this$0.EZpvd();
            C44358sMw c44358sMw3 = this.this$0;
            longRef2 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            set = set3;
            baseDao2 = phoneRelationEntityDaoEZpvd2;
            c44358sMw = c44358sMw3;
            if (i2 >= i) {
            }
        } catch (Throwable th5) {
            th = th5;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }
}
