package com.okinc.okimcore.feature.cache.groupMember;

import android.database.sqlite.SQLiteDatabaseLockedException;
import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C44159sFm;
import o.C56391yDq;
import o.C56442yFn;
import o.C59462zhW;
import o.C59519zia;
import o.sFS;
import o.sJM;

/* JADX INFO: loaded from: classes10.dex */
public final class GroupMemberCacheImpl$updateUserNames$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InHouseIMGroupMemberEntity $it;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ sFS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMemberCacheImpl$updateUserNames$1$2$1(sFS sfs, InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity, Continuation<? super GroupMemberCacheImpl$updateUserNames$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = sfs;
        this.$it = inHouseIMGroupMemberEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupMemberCacheImpl$updateUserNames$1$2$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupMemberCacheImpl$updateUserNames$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:66:0x019d) to fix multi-entry loop: BACK_EDGE: B:66:0x019d -> B:67:0x01a0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x015b: MOVE (r3 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:56:0x015b */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x015c: MOVE (r7 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:56:0x015b */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175 A[Catch: all -> 0x01a9, TRY_LEAVE, TryCatch #8 {all -> 0x01a9, blocks: (B:11:0x003e, B:60:0x0168, B:62:0x0175, B:44:0x013a, B:45:0x013d, B:48:0x0141, B:50:0x0147, B:52:0x0153, B:53:0x0156, B:54:0x0157, B:55:0x015a), top: B:81:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, kotlin.Unit] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sFS sfs;
        BaseDao baseDao3;
        BaseDao baseDao4;
        sFS sfs2;
        int i3;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef2;
        int i4;
        int i5;
        ?? r0;
        SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        Exception e;
        IllegalStateException e2;
        String message;
        Ref.ObjectRef objectRef3;
        long jNanoTime;
        Ref.ObjectRef objectRef4;
        sFS sfs3;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i6 = this.label;
        int i7 = 1;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    jNanoTime = this.J$0;
                    i = this.I$2;
                    i3 = this.I$1;
                    i2 = this.I$0;
                    objectRef4 = (Ref.ObjectRef) this.L$7;
                    longRef3 = (Ref.LongRef) this.L$6;
                    objectRef3 = (Ref.ObjectRef) this.L$5;
                    objectRef = (Ref.ObjectRef) this.L$4;
                    longRef2 = (Ref.LongRef) this.L$3;
                    inHouseIMGroupMemberEntity = (InHouseIMGroupMemberEntity) this.L$2;
                    sfs = (sFS) this.L$1;
                    baseDao2 = (BaseDao) this.L$0;
                    try {
                        try {
                            C56391yDq.AEQbTJ(obj);
                        } catch (IllegalStateException e3) {
                            e2 = e3;
                            message = e2.getMessage();
                            if (message == null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "not open", false, 2, (Object) null)) {
                                C44159sFm.OLrzqt(e2);
                                throw e2;
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (Exception e4) {
                            e = e4;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                    } catch (SQLiteDatabaseLockedException e5) {
                        baseDao4 = baseDao2;
                        i4 = i2;
                        objectRef2 = objectRef;
                        sQLiteDatabaseLockedException = e5;
                        sfs2 = sfs;
                        int i8 = i;
                        longRef4 = longRef2;
                        i5 = i8;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i5 < i4 - 1) {
                        }
                        i7 = i;
                        sfs = sfs2;
                        baseDao3 = baseDao4;
                        i2 = i4;
                        longRef3 = longRef4;
                        i = i + i;
                        if (i < i2) {
                        }
                    }
                    objectRef4.element = Unit.INSTANCE;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef2.element);
                    sfs3 = this.this$0;
                    sJM sjm = sJM.AEQbTJ;
                    InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity2 = this.$it;
                    this.L$0 = sfs3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.label = 3;
                    objEZpvd = sjm.EZpvd(inHouseIMGroupMemberEntity2, this);
                    if (objEZpvd == objCopydefault) {
                    }
                    sfs3.OLrzqt((GroupMemberInfo) objEZpvd);
                    return Unit.INSTANCE;
                }
                if (i6 != 2) {
                    if (i6 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sfs3 = (sFS) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = obj;
                    sfs3.OLrzqt((GroupMemberInfo) objEZpvd);
                    return Unit.INSTANCE;
                }
                int i9 = this.I$1;
                i4 = this.I$0;
                Ref.ObjectRef objectRef5 = (Ref.ObjectRef) this.L$4;
                longRef4 = (Ref.LongRef) this.L$3;
                InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity3 = (InHouseIMGroupMemberEntity) this.L$2;
                sfs2 = (sFS) this.L$1;
                baseDao4 = (BaseDao) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef5;
                int i10 = 1;
                inHouseIMGroupMemberEntity = inHouseIMGroupMemberEntity3;
                i7 = i10;
                sfs = sfs2;
                baseDao3 = baseDao4;
                i2 = i4;
                longRef3 = longRef4;
                i = i9 + i10;
                if (i < i2) {
                    try {
                    } catch (SQLiteDatabaseLockedException e6) {
                        i3 = i;
                        i4 = i2;
                        objectRef2 = objectRef;
                        sfs2 = sfs;
                        longRef4 = longRef3;
                        baseDao4 = baseDao3;
                        i5 = i3;
                        r0 = e6;
                        C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i5 < i4 - 1) {
                        }
                        i7 = i10;
                        sfs = sfs2;
                        baseDao3 = baseDao4;
                        i2 = i4;
                        longRef3 = longRef4;
                        i = i9 + i10;
                        if (i < i2) {
                        }
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
                    } catch (Throwable th2) {
                        th = th2;
                        baseDao2 = baseDao3;
                        longRef2 = longRef3;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef4 = new Ref.ObjectRef();
                    jNanoTime = System.nanoTime();
                    InHouseIMGroupMemberDao inHouseIMGroupMemberDaoCopydefault = sfs.copydefault();
                    this.L$0 = baseDao3;
                    this.L$1 = sfs;
                    this.L$2 = inHouseIMGroupMemberEntity;
                    this.L$3 = longRef3;
                    this.L$4 = objectRef;
                    this.L$5 = objectRef4;
                    this.L$6 = longRef3;
                    this.L$7 = objectRef4;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.I$2 = i;
                    this.J$0 = jNanoTime;
                    this.label = i7;
                    if (inHouseIMGroupMemberDaoCopydefault.insert(inHouseIMGroupMemberEntity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    objectRef3 = objectRef4;
                    baseDao2 = baseDao3;
                    i3 = i;
                    longRef2 = longRef3;
                    try {
                    } catch (SQLiteDatabaseLockedException e9) {
                        baseDao4 = baseDao2;
                        i4 = i2;
                        objectRef2 = objectRef;
                        sQLiteDatabaseLockedException = e9;
                        sfs2 = sfs;
                        int i82 = i;
                        longRef4 = longRef2;
                        i5 = i82;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i5 < i4 - 1) {
                            this.L$0 = baseDao4;
                            this.L$1 = sfs2;
                            this.L$2 = inHouseIMGroupMemberEntity;
                            this.L$3 = longRef4;
                            this.L$4 = objectRef2;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.I$0 = i4;
                            this.I$1 = i3;
                            this.label = 2;
                            if (DelayKt.delay(((long) (i5 + 1)) * 50, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            objectRef = objectRef2;
                            i9 = i3;
                            i10 = 1;
                        } else {
                            objectRef = objectRef2;
                            i9 = i3;
                            i10 = 1;
                        }
                        i7 = i10;
                        sfs = sfs2;
                        baseDao3 = baseDao4;
                        i2 = i4;
                        longRef3 = longRef4;
                        i = i9 + i10;
                        if (i < i2) {
                        }
                    }
                    objectRef4.element = Unit.INSTANCE;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef2.element);
                    sfs3 = this.this$0;
                    sJM sjm2 = sJM.AEQbTJ;
                    InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity22 = this.$it;
                    this.L$0 = sfs3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.label = 3;
                    objEZpvd = sjm2.EZpvd(inHouseIMGroupMemberEntity22, this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    sfs3.OLrzqt((GroupMemberInfo) objEZpvd);
                    return Unit.INSTANCE;
                }
                C44159sFm.EZpvd(baseDao3, longRef3.element);
                Exception exc = (Exception) objectRef.element;
                if (exc == null) {
                    exc = new Exception("Database Operation failed after " + i2 + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            InHouseIMGroupMemberDao inHouseIMGroupMemberDaoCopydefault2 = this.this$0.copydefault();
            sFS sfs4 = this.this$0;
            inHouseIMGroupMemberEntity = this.$it;
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 0;
            i2 = 3;
            sfs = sfs4;
            baseDao3 = inHouseIMGroupMemberDaoCopydefault2;
            if (i < i2) {
            }
        } catch (Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }
}
