package com.okinc.okimcore.feature.cache.conversation;

import android.database.sqlite.SQLiteDatabaseLockedException;
import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao;
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
import o.sFN;

/* JADX INFO: loaded from: classes10.dex */
public final class ConversationCacheImpl$updateIsFlagged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFlagged;
    final /* synthetic */ String $targetId;
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
    boolean Z$0;
    int label;
    final /* synthetic */ sFN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationCacheImpl$updateIsFlagged$1(sFN sfn, String str, boolean z, Continuation<? super ConversationCacheImpl$updateIsFlagged$1> continuation) {
        super(2, continuation);
        this.this$0 = sfn;
        this.$targetId = str;
        this.$isFlagged = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationCacheImpl$updateIsFlagged$1(this.this$0, this.$targetId, this.$isFlagged, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationCacheImpl$updateIsFlagged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:57:0x0173) to fix multi-entry loop: BACK_EDGE: B:57:0x0173 -> B:58:0x0179 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149 A[Catch: all -> 0x017f, TRY_LEAVE, TryCatch #7 {all -> 0x017f, blocks: (B:51:0x013c, B:53:0x0149), top: B:73:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, java.lang.Object, kotlin.Unit] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Ref.LongRef longRef;
        BaseDao baseDao;
        String str;
        BaseDao baseDao2;
        boolean z;
        Ref.LongRef longRef2;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sFN sfn;
        sFN sfn2;
        String str2;
        int i3;
        Ref.ObjectRef objectRef2;
        int i4;
        boolean z2;
        Ref.LongRef longRef3;
        int i5;
        ?? r0;
        int i6;
        Exception e;
        IllegalStateException e2;
        String message;
        String str3;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        long jNanoTime;
        Ref.ObjectRef objectRef4;
        Object objCopydefault = C56442yFn.copydefault();
        int i7 = this.label;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    jNanoTime = this.J$0;
                    i2 = this.I$2;
                    i3 = this.I$1;
                    z = this.Z$0;
                    i = this.I$0;
                    objectRef4 = (Ref.ObjectRef) this.L$7;
                    longRef4 = (Ref.LongRef) this.L$6;
                    objectRef3 = (Ref.ObjectRef) this.L$5;
                    objectRef = (Ref.ObjectRef) this.L$4;
                    longRef = (Ref.LongRef) this.L$3;
                    String str4 = (String) this.L$2;
                    sfn = (sFN) this.L$1;
                    baseDao = (BaseDao) this.L$0;
                    try {
                        try {
                            C56391yDq.AEQbTJ(obj);
                            str3 = str4;
                        } catch (IllegalStateException e3) {
                            e2 = e3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (Exception e4) {
                            e = e4;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            C44159sFm.EZpvd(baseDao, longRef.element);
                            throw th;
                        }
                    } catch (SQLiteDatabaseLockedException e5) {
                        baseDao2 = baseDao;
                        z2 = z ? 1 : 0;
                        i4 = i;
                        str2 = str4;
                        sfn2 = sfn;
                        longRef3 = longRef;
                        i5 = i2;
                        objectRef2 = objectRef;
                        r0 = e5;
                        C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i5 < i4 - 1) {
                            this.L$0 = baseDao2;
                            this.L$1 = sfn2;
                            this.L$2 = str2;
                            this.L$3 = longRef3;
                            this.L$4 = objectRef2;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.I$0 = i4;
                            this.Z$0 = z2;
                            this.I$1 = i3;
                            this.label = 2;
                            if (DelayKt.delay(((long) (i5 + 1)) * 50, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            objectRef = objectRef2;
                            i6 = i3;
                            longRef2 = longRef3;
                            str = str2;
                            z = z2;
                        } else {
                            objectRef = objectRef2;
                            i6 = i3;
                            longRef2 = longRef3;
                            str = str2;
                            z = z2;
                        }
                        i2 = i6 + 1;
                        sfn = sfn2;
                        i = i4;
                        if (i2 < i) {
                        }
                    }
                    ?? r4 = Unit.INSTANCE;
                    objectRef4.element = r4;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef3.element;
                    C44159sFm.EZpvd(baseDao, longRef.element);
                    return r4;
                }
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i6 = this.I$1;
                boolean z3 = this.Z$0;
                i4 = this.I$0;
                Ref.ObjectRef objectRef5 = (Ref.ObjectRef) this.L$4;
                longRef2 = (Ref.LongRef) this.L$3;
                String str5 = (String) this.L$2;
                sfn2 = (sFN) this.L$1;
                baseDao2 = (BaseDao) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef5;
                str = str5;
                z = z3;
                i2 = i6 + 1;
                sfn = sfn2;
                i = i4;
                if (i2 < i) {
                    try {
                    } catch (SQLiteDatabaseLockedException e6) {
                        try {
                            C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i5 < i4 - 1) {
                            }
                            i2 = i6 + 1;
                            sfn = sfn2;
                            i = i4;
                            if (i2 < i) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            Ref.LongRef longRef5 = longRef3;
                            longRef = longRef5;
                            baseDao = baseDao2;
                            C44159sFm.EZpvd(baseDao, longRef.element);
                            throw th;
                        }
                        i5 = i2;
                        z2 = z ? 1 : 0;
                        i4 = i;
                        str2 = str;
                        sfn2 = sfn;
                        longRef3 = longRef2;
                        objectRef2 = objectRef;
                        i3 = i5;
                        r0 = e6;
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
                    }
                    objectRef4 = new Ref.ObjectRef();
                    jNanoTime = System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoCopydefault = sfn.copydefault();
                    this.L$0 = baseDao2;
                    this.L$1 = sfn;
                    this.L$2 = str;
                    this.L$3 = longRef2;
                    this.L$4 = objectRef;
                    this.L$5 = objectRef4;
                    this.L$6 = longRef2;
                    this.L$7 = objectRef4;
                    this.I$0 = i;
                    this.Z$0 = z;
                    this.I$1 = i2;
                    this.I$2 = i2;
                    this.J$0 = jNanoTime;
                    this.label = 1;
                    if (inHouseIMConversationDaoCopydefault.updateIsFlagged(str, z ? 1 : 0, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    objectRef3 = objectRef4;
                    str3 = str;
                    longRef = longRef2;
                    baseDao = baseDao2;
                    longRef4 = longRef;
                    i3 = i2;
                    try {
                    } catch (SQLiteDatabaseLockedException e9) {
                        longRef3 = longRef;
                        baseDao2 = baseDao;
                        i5 = i2;
                        z2 = z;
                        i4 = i;
                        objectRef2 = objectRef;
                        str2 = str3;
                        sfn2 = sfn;
                        r0 = e9;
                        C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i5 < i4 - 1) {
                        }
                        i2 = i6 + 1;
                        sfn = sfn2;
                        i = i4;
                        if (i2 < i) {
                        }
                    }
                    ?? r42 = Unit.INSTANCE;
                    objectRef4.element = r42;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao, longRef.element);
                    return r42;
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
            InHouseIMConversationDao inHouseIMConversationDaoCopydefault2 = this.this$0.copydefault();
            sFN sfn3 = this.this$0;
            str = this.$targetId;
            baseDao2 = inHouseIMConversationDaoCopydefault2;
            z = this.$isFlagged;
            longRef2 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            sfn = sfn3;
            if (i2 < i) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
