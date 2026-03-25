package com.okinc.okimcore.feature.cache.contact;

import android.database.sqlite.SQLiteDatabaseLockedException;
import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
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
import o.sFP;

/* JADX INFO: loaded from: classes10.dex */
public final class ContactCacheImpl$updateContactByDisplayUser$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InHouseIMContactInfoEntity $contactEntity;
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
    final /* synthetic */ sFP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactCacheImpl$updateContactByDisplayUser$1(sFP sfp, InHouseIMContactInfoEntity inHouseIMContactInfoEntity, Continuation<? super ContactCacheImpl$updateContactByDisplayUser$1> continuation) {
        super(2, continuation);
        this.this$0 = sfp;
        this.$contactEntity = inHouseIMContactInfoEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactCacheImpl$updateContactByDisplayUser$1(this.this$0, this.$contactEntity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContactCacheImpl$updateContactByDisplayUser$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x011e: MOVE (r5 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:48:0x011d */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x011d: MOVE (r15 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:48:0x011d */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137 A[Catch: all -> 0x0171, TRY_LEAVE, TryCatch #0 {all -> 0x0171, blocks: (B:7:0x0028, B:36:0x00fc, B:37:0x00ff, B:40:0x0103, B:42:0x0109, B:44:0x0115, B:45:0x0118, B:46:0x0119, B:47:0x011c, B:52:0x012a, B:54:0x0137), top: B:70:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x015c -> B:58:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0163 -> B:60:0x0167). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sFP sfp;
        BaseDao baseDao3;
        Exception e;
        IllegalStateException e2;
        String message;
        BaseDao baseDao4;
        sFP sfp2;
        int i3;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef2;
        int i4;
        int i5;
        ?? r0;
        sFP sfp3;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity2;
        Ref.ObjectRef objectRef3;
        long jNanoTime;
        Ref.ObjectRef objectRef4;
        Object objCopydefault = C56442yFn.copydefault();
        int i6 = this.label;
        int i7 = 1;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    jNanoTime = this.J$0;
                    i2 = this.I$2;
                    i3 = this.I$1;
                    i = this.I$0;
                    objectRef4 = (Ref.ObjectRef) this.L$7;
                    longRef3 = (Ref.LongRef) this.L$6;
                    objectRef3 = (Ref.ObjectRef) this.L$5;
                    objectRef = (Ref.ObjectRef) this.L$4;
                    longRef2 = (Ref.LongRef) this.L$3;
                    inHouseIMContactInfoEntity2 = (InHouseIMContactInfoEntity) this.L$2;
                    sfp3 = (sFP) this.L$1;
                    baseDao2 = (BaseDao) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                    } catch (SQLiteDatabaseLockedException e3) {
                        baseDao4 = baseDao2;
                        i4 = i;
                        objectRef2 = objectRef;
                        sfp2 = sfp3;
                        inHouseIMContactInfoEntity = inHouseIMContactInfoEntity2;
                        i5 = i2;
                        longRef4 = longRef2;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i5 >= i4 - 1) {
                        }
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
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    ?? r6 = Unit.INSTANCE;
                    objectRef4.element = r6;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef2.element);
                    return r6;
                }
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = this.I$1;
                i4 = this.I$0;
                objectRef2 = (Ref.ObjectRef) this.L$4;
                longRef4 = (Ref.LongRef) this.L$3;
                InHouseIMContactInfoEntity inHouseIMContactInfoEntity3 = (InHouseIMContactInfoEntity) this.L$2;
                sfp2 = (sFP) this.L$1;
                baseDao4 = (BaseDao) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef2;
                inHouseIMContactInfoEntity = inHouseIMContactInfoEntity3;
                int i9 = 1;
                i3 = i8;
                i7 = i9;
                sfp = sfp2;
                baseDao3 = baseDao4;
                i = i4;
                longRef3 = longRef4;
                i2 = i3 + 1;
                if (i2 >= i) {
                    try {
                    } catch (SQLiteDatabaseLockedException e6) {
                        i3 = i2;
                        i4 = i;
                        objectRef2 = objectRef;
                        sfp2 = sfp;
                        longRef4 = longRef3;
                        baseDao4 = baseDao3;
                        i5 = i3;
                        r0 = e6;
                        C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i5 >= i4 - 1) {
                            this.L$0 = baseDao4;
                            this.L$1 = sfp2;
                            this.L$2 = inHouseIMContactInfoEntity;
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
                            i8 = i3;
                            inHouseIMContactInfoEntity3 = inHouseIMContactInfoEntity;
                            objectRef = objectRef2;
                            inHouseIMContactInfoEntity = inHouseIMContactInfoEntity3;
                            int i92 = 1;
                            i3 = i8;
                            i7 = i92;
                            sfp = sfp2;
                            baseDao3 = baseDao4;
                            i = i4;
                            longRef3 = longRef4;
                            i2 = i3 + 1;
                            if (i2 >= i) {
                            }
                        } else {
                            objectRef = objectRef2;
                            i92 = 1;
                            i7 = i92;
                            sfp = sfp2;
                            baseDao3 = baseDao4;
                            i = i4;
                            longRef3 = longRef4;
                            i2 = i3 + 1;
                            if (i2 >= i) {
                            }
                        }
                    } catch (IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "not open", false, 2, (Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
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
                    InHouseIMContactDao inHouseIMContactDaoOLrzqt = sfp.OLrzqt();
                    this.L$0 = baseDao3;
                    this.L$1 = sfp;
                    this.L$2 = inHouseIMContactInfoEntity;
                    this.L$3 = longRef3;
                    this.L$4 = objectRef;
                    this.L$5 = objectRef4;
                    this.L$6 = longRef3;
                    this.L$7 = objectRef4;
                    this.I$0 = i;
                    this.I$1 = i2;
                    this.I$2 = i2;
                    this.J$0 = jNanoTime;
                    this.label = i7;
                    if (inHouseIMContactDaoOLrzqt.insertOrReplaceContact(inHouseIMContactInfoEntity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    objectRef3 = objectRef4;
                    i3 = i2;
                    longRef2 = longRef3;
                    sFP sfp4 = sfp;
                    baseDao2 = baseDao3;
                    inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity;
                    sfp3 = sfp4;
                    ?? r62 = Unit.INSTANCE;
                    objectRef4.element = r62;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef2.element);
                    return r62;
                }
                C44159sFm.EZpvd(baseDao3, longRef3.element);
                Exception exc = (Exception) objectRef.element;
                if (exc == null) {
                    exc = new Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            InHouseIMContactDao inHouseIMContactDaoOLrzqt2 = this.this$0.OLrzqt();
            sFP sfp5 = this.this$0;
            inHouseIMContactInfoEntity = this.$contactEntity;
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            sfp = sfp5;
            baseDao3 = inHouseIMContactDaoOLrzqt2;
            if (i2 >= i) {
            }
        } catch (Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }
}
