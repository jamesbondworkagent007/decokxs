package o;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationSimpleInfoDao;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity;
import com.okinc.okimcore.repository.ConversationSimpleInfoRepository$insertAll$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sRl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44482sRl {
    public final sIC AEQbTJ;

    public C44482sRl(@NotNull sIC sic) {
        Intrinsics.checkNotNullParameter(sic, "");
        this.AEQbTJ = sic;
    }

    public final InHouseIMConversationSimpleInfoDao EZpvd() {
        return this.AEQbTJ.copydefault().AEQbTJ();
    }

    /* JADX DEBUG: Type inference failed for r0v17. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r0v24. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r5v2. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137 A[Catch: all -> 0x004e, TryCatch #12 {all -> 0x004e, blocks: (B:13:0x0046, B:37:0x00f7, B:51:0x012a, B:52:0x012d, B:55:0x0131, B:57:0x0137, B:59:0x0143, B:60:0x0146, B:61:0x0147, B:62:0x014a), top: B:87:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0164 A[Catch: all -> 0x01a4, TRY_LEAVE, TryCatch #5 {all -> 0x01a4, blocks: (B:66:0x0157, B:68:0x0164), top: B:85:0x0157 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationSimpleInfoDao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0189 -> B:72:0x018c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0193 -> B:74:0x019c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.List<InHouseIMConversationSimpleInfoEntity> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        ConversationSimpleInfoRepository$insertAll$1 conversationSimpleInfoRepository$insertAll$1;
        BaseDao baseDaoEZpvd;
        Ref.LongRef longRef;
        ?? r8;
        Ref.LongRef longRef2;
        int i;
        ConversationSimpleInfoRepository$insertAll$1 conversationSimpleInfoRepository$insertAll$12;
        Ref.ObjectRef objectRef;
        int i2;
        java.util.List<InHouseIMConversationSimpleInfoEntity> list2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        ?? r13;
        BaseDao baseDao;
        int i3;
        Ref.ObjectRef objectRef2;
        int i4;
        java.util.List<InHouseIMConversationSimpleInfoEntity> list3;
        ?? r0;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.LongRef longRef3;
        long jNanoTime;
        ?? r82;
        int i5;
        if (continuation instanceof ConversationSimpleInfoRepository$insertAll$1) {
            conversationSimpleInfoRepository$insertAll$1 = (ConversationSimpleInfoRepository$insertAll$1) continuation;
            int i6 = conversationSimpleInfoRepository$insertAll$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                conversationSimpleInfoRepository$insertAll$1.label = i6 - Integer.MIN_VALUE;
            } else {
                conversationSimpleInfoRepository$insertAll$1 = new ConversationSimpleInfoRepository$insertAll$1(this, continuation);
            }
        }
        java.lang.Object obj = conversationSimpleInfoRepository$insertAll$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i7 = conversationSimpleInfoRepository$insertAll$1.label;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    jNanoTime = conversationSimpleInfoRepository$insertAll$1.J$0;
                    i2 = conversationSimpleInfoRepository$insertAll$1.I$2;
                    i3 = conversationSimpleInfoRepository$insertAll$1.I$1;
                    i = conversationSimpleInfoRepository$insertAll$1.I$0;
                    objectRef4 = (Ref.ObjectRef) conversationSimpleInfoRepository$insertAll$1.L$7;
                    longRef2 = (Ref.LongRef) conversationSimpleInfoRepository$insertAll$1.L$6;
                    objectRef3 = (Ref.ObjectRef) conversationSimpleInfoRepository$insertAll$1.L$5;
                    objectRef = (Ref.ObjectRef) conversationSimpleInfoRepository$insertAll$1.L$4;
                    longRef = (Ref.LongRef) conversationSimpleInfoRepository$insertAll$1.L$3;
                    baseDaoEZpvd = (BaseDao) conversationSimpleInfoRepository$insertAll$1.L$2;
                    InHouseIMConversationSimpleInfoDao inHouseIMConversationSimpleInfoDao = (InHouseIMConversationSimpleInfoDao) conversationSimpleInfoRepository$insertAll$1.L$1;
                    list3 = (java.util.List) conversationSimpleInfoRepository$insertAll$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef3 = longRef;
                        i5 = i3;
                        r82 = inHouseIMConversationSimpleInfoDao;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        objectRef2 = objectRef;
                        longRef2 = longRef;
                        r13 = inHouseIMConversationSimpleInfoDao;
                        i4 = i;
                        baseDao = baseDaoEZpvd;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                        }
                        C44159sFm.EZpvd(baseDaoEZpvd, longRef.element);
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
                        C44159sFm.EZpvd(baseDaoEZpvd, longRef.element);
                        throw th;
                    }
                    int i8 = i;
                    baseDao = baseDaoEZpvd;
                    objectRef4.element = Unit.INSTANCE;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    java.lang.Object obj2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao, longRef3.element);
                    return obj2;
                }
                if (i7 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = conversationSimpleInfoRepository$insertAll$1.I$1;
                i4 = conversationSimpleInfoRepository$insertAll$1.I$0;
                objectRef2 = (Ref.ObjectRef) conversationSimpleInfoRepository$insertAll$1.L$4;
                Ref.LongRef longRef4 = (Ref.LongRef) conversationSimpleInfoRepository$insertAll$1.L$3;
                baseDao = (BaseDao) conversationSimpleInfoRepository$insertAll$1.L$2;
                InHouseIMConversationSimpleInfoDao inHouseIMConversationSimpleInfoDao2 = (InHouseIMConversationSimpleInfoDao) conversationSimpleInfoRepository$insertAll$1.L$1;
                java.util.List<InHouseIMConversationSimpleInfoEntity> list4 = (java.util.List) conversationSimpleInfoRepository$insertAll$1.L$0;
                C56391yDq.AEQbTJ(obj);
                ?? r132 = inHouseIMConversationSimpleInfoDao2;
                conversationSimpleInfoRepository$insertAll$12 = conversationSimpleInfoRepository$insertAll$1;
                objectRef = objectRef2;
                list2 = list4;
                longRef2 = longRef4;
                i3 = i9;
                ?? r133 = r132;
                i2 = i3 + 1;
                baseDaoEZpvd = baseDao;
                r8 = r133;
                i = i4;
                if (i2 >= i) {
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                        try {
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i2 < i4 - 1) {
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            Ref.LongRef longRef5 = longRef2;
                            longRef = longRef5;
                            baseDaoEZpvd = baseDao;
                            C44159sFm.EZpvd(baseDaoEZpvd, longRef.element);
                            throw th;
                        }
                        i3 = i2;
                        objectRef2 = objectRef;
                        r13 = r8;
                        i4 = i;
                        baseDao = baseDaoEZpvd;
                        ConversationSimpleInfoRepository$insertAll$1 conversationSimpleInfoRepository$insertAll$13 = conversationSimpleInfoRepository$insertAll$12;
                        list3 = list2;
                        conversationSimpleInfoRepository$insertAll$1 = conversationSimpleInfoRepository$insertAll$13;
                        r0 = e6;
                        C44159sFm.EZpvd(baseDaoEZpvd, longRef.element);
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
                        C44159sFm.EZpvd(baseDaoEZpvd, longRef.element);
                        throw th;
                    }
                    objectRef4 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    conversationSimpleInfoRepository$insertAll$12.L$0 = list2;
                    conversationSimpleInfoRepository$insertAll$12.L$1 = r8;
                    conversationSimpleInfoRepository$insertAll$12.L$2 = baseDaoEZpvd;
                    conversationSimpleInfoRepository$insertAll$12.L$3 = longRef2;
                    conversationSimpleInfoRepository$insertAll$12.L$4 = objectRef;
                    conversationSimpleInfoRepository$insertAll$12.L$5 = objectRef4;
                    conversationSimpleInfoRepository$insertAll$12.L$6 = longRef2;
                    conversationSimpleInfoRepository$insertAll$12.L$7 = objectRef4;
                    conversationSimpleInfoRepository$insertAll$12.I$0 = i;
                    conversationSimpleInfoRepository$insertAll$12.I$1 = i2;
                    conversationSimpleInfoRepository$insertAll$12.I$2 = i2;
                    conversationSimpleInfoRepository$insertAll$12.J$0 = jNanoTime;
                    conversationSimpleInfoRepository$insertAll$12.label = 1;
                    if (r8.insertAll(list2, conversationSimpleInfoRepository$insertAll$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    i5 = i2;
                    objectRef3 = objectRef4;
                    longRef3 = longRef2;
                    ConversationSimpleInfoRepository$insertAll$1 conversationSimpleInfoRepository$insertAll$14 = conversationSimpleInfoRepository$insertAll$12;
                    list3 = list2;
                    conversationSimpleInfoRepository$insertAll$1 = conversationSimpleInfoRepository$insertAll$14;
                    r82 = r8;
                    int i82 = i;
                    baseDao = baseDaoEZpvd;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        objectRef2 = objectRef;
                        i4 = i82;
                        r13 = r82;
                        longRef2 = longRef3;
                        i3 = i5;
                        r0 = e9;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                            conversationSimpleInfoRepository$insertAll$1.L$0 = list3;
                            conversationSimpleInfoRepository$insertAll$1.L$1 = r13;
                            conversationSimpleInfoRepository$insertAll$1.L$2 = baseDao;
                            conversationSimpleInfoRepository$insertAll$1.L$3 = longRef2;
                            conversationSimpleInfoRepository$insertAll$1.L$4 = objectRef2;
                            conversationSimpleInfoRepository$insertAll$1.L$5 = null;
                            conversationSimpleInfoRepository$insertAll$1.L$6 = null;
                            conversationSimpleInfoRepository$insertAll$1.L$7 = null;
                            conversationSimpleInfoRepository$insertAll$1.I$0 = i4;
                            conversationSimpleInfoRepository$insertAll$1.I$1 = i3;
                            conversationSimpleInfoRepository$insertAll$1.label = 2;
                            if (DelayKt.delay(((long) (i2 + 1)) * 50, conversationSimpleInfoRepository$insertAll$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            i9 = i3;
                            longRef4 = longRef2;
                            list4 = list3;
                            r132 = r13;
                            conversationSimpleInfoRepository$insertAll$12 = conversationSimpleInfoRepository$insertAll$1;
                            objectRef = objectRef2;
                            list2 = list4;
                            longRef2 = longRef4;
                            i3 = i9;
                            ?? r1332 = r132;
                            i2 = i3 + 1;
                            baseDaoEZpvd = baseDao;
                            r8 = r1332;
                            i = i4;
                            if (i2 >= i) {
                            }
                        } else {
                            objectRef = objectRef2;
                            java.util.List<InHouseIMConversationSimpleInfoEntity> list5 = list3;
                            conversationSimpleInfoRepository$insertAll$12 = conversationSimpleInfoRepository$insertAll$1;
                            list2 = list5;
                            r1332 = r13;
                            i2 = i3 + 1;
                            baseDaoEZpvd = baseDao;
                            r8 = r1332;
                            i = i4;
                            if (i2 >= i) {
                            }
                        }
                        C44159sFm.EZpvd(baseDaoEZpvd, longRef.element);
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
                    objectRef4.element = Unit.INSTANCE;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    java.lang.Object obj22 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao, longRef3.element);
                    return obj22;
                }
                C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoEZpvd = EZpvd();
            r8 = baseDaoEZpvd;
            longRef2 = new Ref.LongRef();
            i = 3;
            conversationSimpleInfoRepository$insertAll$12 = conversationSimpleInfoRepository$insertAll$1;
            objectRef = new Ref.ObjectRef();
            i2 = 0;
            list2 = list;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }
}
