package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.extension.DaoExtensionsKt$safeExecuteSuspendableDao$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sFm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44159sFm {
    /* JADX DEBUG: Duplicate block (B:65:0x0165) to fix multi-entry loop: BACK_EDGE: B:65:0x0165 -> B:66:0x016a */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140 A[Catch: all -> 0x0170, TRY_LEAVE, TryCatch #0 {all -> 0x0170, blocks: (B:59:0x0133, B:61:0x0140), top: B:77:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object copydefault(@NotNull BaseDao baseDao, int i, @NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, @NotNull Continuation<? super T> continuation) throws java.lang.Exception {
        DaoExtensionsKt$safeExecuteSuspendableDao$1 daoExtensionsKt$safeExecuteSuspendableDao$1;
        BaseDao baseDao2;
        Ref.LongRef longRef;
        Function1<? super Continuation<? super T>, ? extends java.lang.Object> function12;
        Ref.LongRef longRef2;
        DaoExtensionsKt$safeExecuteSuspendableDao$1 daoExtensionsKt$safeExecuteSuspendableDao$12;
        Ref.ObjectRef objectRef;
        int i2;
        BaseDao baseDao3;
        int i3;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        BaseDao baseDao4;
        int i4;
        int i5;
        Ref.ObjectRef objectRef2;
        Function1<? super Continuation<? super T>, ? extends java.lang.Object> function13;
        int i6;
        java.lang.Object obj;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        long jNanoTime;
        if (continuation instanceof DaoExtensionsKt$safeExecuteSuspendableDao$1) {
            daoExtensionsKt$safeExecuteSuspendableDao$1 = (DaoExtensionsKt$safeExecuteSuspendableDao$1) continuation;
            int i7 = daoExtensionsKt$safeExecuteSuspendableDao$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                daoExtensionsKt$safeExecuteSuspendableDao$1.label = i7 - Integer.MIN_VALUE;
            } else {
                daoExtensionsKt$safeExecuteSuspendableDao$1 = new DaoExtensionsKt$safeExecuteSuspendableDao$1(continuation);
            }
        }
        T t = (T) daoExtensionsKt$safeExecuteSuspendableDao$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = daoExtensionsKt$safeExecuteSuspendableDao$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = daoExtensionsKt$safeExecuteSuspendableDao$1.J$0;
                    i6 = daoExtensionsKt$safeExecuteSuspendableDao$1.I$2;
                    i5 = daoExtensionsKt$safeExecuteSuspendableDao$1.I$1;
                    i4 = daoExtensionsKt$safeExecuteSuspendableDao$1.I$0;
                    objectRef4 = (Ref.ObjectRef) daoExtensionsKt$safeExecuteSuspendableDao$1.L$6;
                    longRef2 = (Ref.LongRef) daoExtensionsKt$safeExecuteSuspendableDao$1.L$5;
                    objectRef3 = (Ref.ObjectRef) daoExtensionsKt$safeExecuteSuspendableDao$1.L$4;
                    objectRef = (Ref.ObjectRef) daoExtensionsKt$safeExecuteSuspendableDao$1.L$3;
                    longRef = (Ref.LongRef) daoExtensionsKt$safeExecuteSuspendableDao$1.L$2;
                    function13 = (Function1) daoExtensionsKt$safeExecuteSuspendableDao$1.L$1;
                    baseDao2 = (BaseDao) daoExtensionsKt$safeExecuteSuspendableDao$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(t);
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException 
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                        */
                    /*
                        r0 = r22
                        boolean r1 = r0 instanceof com.okinc.okimcore.extension.DaoExtensionsKt$safeExecuteSuspendableDao$1
                        if (r1 == 0) goto L15
                        r1 = r0
                        com.okinc.okimcore.extension.DaoExtensionsKt$safeExecuteSuspendableDao$1 r1 = (com.okinc.okimcore.extension.DaoExtensionsKt$safeExecuteSuspendableDao$1) r1
                        int r2 = r1.label
                        r3 = -2147483648(0xffffffff80000000, float:-0.0)
                        r4 = r2 & r3
                        if (r4 == 0) goto L15
                        int r2 = r2 + r3
                        r1.label = r2
                        goto L1a
                    L15:
                        com.okinc.okimcore.extension.DaoExtensionsKt$safeExecuteSuspendableDao$1 r1 = new com.okinc.okimcore.extension.DaoExtensionsKt$safeExecuteSuspendableDao$1
                        r1.<init>(r0)
                    L1a:
                        java.lang.Object r0 = r1.result
                        java.lang.Object r2 = o.C56437yFi.OLrzqt()
                        int r3 = r1.label
                        r5 = 2
                        r7 = 1
                        if (r3 == 0) goto L94
                        if (r3 == r7) goto L58
                        if (r3 != r5) goto L50
                        int r3 = r1.I$1
                        int r8 = r1.I$0
                        java.lang.Object r9 = r1.L$3
                        kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref.ObjectRef) r9
                        java.lang.Object r10 = r1.L$2
                        kotlin.jvm.internal.Ref$LongRef r10 = (kotlin.jvm.internal.Ref.LongRef) r10
                        java.lang.Object r11 = r1.L$1
                        kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
                        java.lang.Object r12 = r1.L$0
                        com.okinc.okimcore.common.database.BaseDao r12 = (com.okinc.okimcore.common.database.BaseDao) r12
                        o.C56391yDq.AEQbTJ(r0)     // Catch: java.lang.Throwable -> L4d
                        r6 = r5
                        r15 = r9
                        r13 = r10
                        r4 = r11
                        r5 = r1
                        r10 = r3
                        r11 = r8
                        r1 = r12
                        r3 = 0
                        r8 = 0
                        goto L16a
                    L4d:
                        r0 = move-exception
                        goto L172
                    L50:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                        r0.<init>(r1)
                        throw r0
                    L58:
                        long r8 = r1.J$0
                        int r3 = r1.I$2
                        int r10 = r1.I$1
                        int r11 = r1.I$0
                        java.lang.Object r12 = r1.L$6
                        kotlin.jvm.internal.Ref$ObjectRef r12 = (kotlin.jvm.internal.Ref.ObjectRef) r12
                        java.lang.Object r13 = r1.L$5
                        kotlin.jvm.internal.Ref$LongRef r13 = (kotlin.jvm.internal.Ref.LongRef) r13
                        java.lang.Object r14 = r1.L$4
                        kotlin.jvm.internal.Ref$ObjectRef r14 = (kotlin.jvm.internal.Ref.ObjectRef) r14
                        java.lang.Object r15 = r1.L$3
                        kotlin.jvm.internal.Ref$ObjectRef r15 = (kotlin.jvm.internal.Ref.ObjectRef) r15
                        java.lang.Object r4 = r1.L$2
                        kotlin.jvm.internal.Ref$LongRef r4 = (kotlin.jvm.internal.Ref.LongRef) r4
                        java.lang.Object r5 = r1.L$1
                        kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
                        java.lang.Object r6 = r1.L$0
                        com.okinc.okimcore.common.database.BaseDao r6 = (com.okinc.okimcore.common.database.BaseDao) r6
                        o.C56391yDq.AEQbTJ(r0)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L84 java.lang.IllegalStateException -> L89 android.database.sqlite.SQLiteDatabaseLockedException -> L8e
                        goto Ldd
                    L81:
                        r0 = move-exception
                        goto L174
                    L84:
                        r0 = move-exception
                        r10 = r4
                        r12 = r6
                        goto L109
                    L89:
                        r0 = move-exception
                        r10 = r4
                        r12 = r6
                        goto L110
                    L8e:
                        r0 = move-exception
                        r12 = r6
                        r9 = r15
                        r8 = 0
                        goto L133
                    L94:
                        o.C56391yDq.AEQbTJ(r0)
                        kotlin.jvm.internal.Ref$LongRef r0 = new kotlin.jvm.internal.Ref$LongRef
                        r0.<init>()
                        kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
                        r3.<init>()
                        r4 = r21
                        r13 = r0
                        r5 = r1
                        r15 = r3
                        r6 = 0
                        r1 = r19
                        r3 = r20
                    Lab:
                        if (r6 >= r3) goto L180
                        kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        r12.<init>()     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        long r8 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        r5.L$0 = r1     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        r5.L$1 = r4     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        r5.L$2 = r13     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        r5.L$3 = r15     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        r5.L$4 = r12     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        r5.L$5 = r13     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        r5.L$6 = r12     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        r5.I$0 = r3     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        r5.I$1 = r6     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        r5.I$2 = r6     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        r5.J$0 = r8     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        r5.label = r7     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        java.lang.Object r0 = r4.invoke(r5)     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L106 java.lang.IllegalStateException -> L10d android.database.sqlite.SQLiteDatabaseLockedException -> L129
                        if (r0 != r2) goto Ld5
                        return r2
                    Ld5:
                        r11 = r3
                        r3 = r6
                        r10 = r3
                        r14 = r12
                        r6 = r1
                        r1 = r5
                        r5 = r4
                        r4 = r13
                    Ldd:
                        r12.element = r0     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L84 java.lang.IllegalStateException -> L89 android.database.sqlite.SQLiteDatabaseLockedException -> L8e
                        long r17 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L84 java.lang.IllegalStateException -> L89 android.database.sqlite.SQLiteDatabaseLockedException -> L8e
                        long r8 = r17 - r8
                        kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L84 java.lang.IllegalStateException -> L89 android.database.sqlite.SQLiteDatabaseLockedException -> L8e
                        long r8 = o.C59519zia.AEQbTJ(r8, r0)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L84 java.lang.IllegalStateException -> L89 android.database.sqlite.SQLiteDatabaseLockedException -> L8e
                        long r8 = o.C59462zhW.valueOf(r8)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L84 java.lang.IllegalStateException -> L89 android.database.sqlite.SQLiteDatabaseLockedException -> L8e
                        r13.element = r8     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L84 java.lang.IllegalStateException -> L89 android.database.sqlite.SQLiteDatabaseLockedException -> L8e
                        T r0 = r14.element     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L84 java.lang.IllegalStateException -> L89 android.database.sqlite.SQLiteDatabaseLockedException -> L8e
                        o.C56518yIi.KWHzl(r7)
                        long r1 = r4.element
                        EZpvd(r6, r1)
                        o.C56518yIi.copydefault(r7)
                        return r0
                    Lff:
                        r8 = 0
                        goto L12b
                    L101:
                        r0 = move-exception
                        r6 = r1
                        r4 = r13
                        goto L174
                    L106:
                        r0 = move-exception
                        r12 = r1
                        r10 = r13
                    L109:
                        OLrzqt(r0)     // Catch: java.lang.Throwable -> L4d
                        throw r0     // Catch: java.lang.Throwable -> L4d
                    L10d:
                        r0 = move-exception
                        r12 = r1
                        r10 = r13
                    L110:
                        java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L4d
                        if (r1 == 0) goto L125
                        java.lang.String r2 = "not open"
                        r3 = 2
                        r4 = 0
                        r8 = 0
                        boolean r1 = kotlin.text.StringsKt.contains$default(r1, r2, r8, r3, r4)     // Catch: java.lang.Throwable -> L4d
                        if (r1 != r7) goto L125
                        OLrzqt(r0)     // Catch: java.lang.Throwable -> L4d
                        throw r0     // Catch: java.lang.Throwable -> L4d
                    L125:
                        copydefault(r0)     // Catch: java.lang.Throwable -> L4d
                        throw r0     // Catch: java.lang.Throwable -> L4d
                    L129:
                        r0 = move-exception
                        goto Lff
                    L12b:
                        r12 = r1
                        r11 = r3
                        r1 = r5
                        r3 = r6
                        r10 = r3
                        r9 = r15
                        r5 = r4
                        r4 = r13
                    L133:
                        T r6 = r9.element     // Catch: java.lang.Throwable -> L170
                        java.lang.Exception r6 = (java.lang.Exception) r6     // Catch: java.lang.Throwable -> L170
                        copydefault(r0, r6)     // Catch: java.lang.Throwable -> L170
                        r9.element = r0     // Catch: java.lang.Throwable -> L170
                        int r0 = r11 + (-1)
                        if (r3 >= r0) goto L163
                        int r3 = r3 + 1
                        long r13 = (long) r3     // Catch: java.lang.Throwable -> L170
                        r1.L$0 = r12     // Catch: java.lang.Throwable -> L170
                        r1.L$1 = r5     // Catch: java.lang.Throwable -> L170
                        r1.L$2 = r4     // Catch: java.lang.Throwable -> L170
                        r1.L$3 = r9     // Catch: java.lang.Throwable -> L170
                        r3 = 0
                        r1.L$4 = r3     // Catch: java.lang.Throwable -> L170
                        r1.L$5 = r3     // Catch: java.lang.Throwable -> L170
                        r1.L$6 = r3     // Catch: java.lang.Throwable -> L170
                        r1.I$0 = r11     // Catch: java.lang.Throwable -> L170
                        r1.I$1 = r10     // Catch: java.lang.Throwable -> L170
                        r6 = 2
                        r1.label = r6     // Catch: java.lang.Throwable -> L170
                        r15 = 50
                        long r13 = r13 * r15
                        java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r13, r1)     // Catch: java.lang.Throwable -> L170
                        if (r0 != r2) goto L165
                        return r2
                    L163:
                        r3 = 0
                        r6 = 2
                    L165:
                        r13 = r4
                        r4 = r5
                        r15 = r9
                        r5 = r1
                        r1 = r12
                    L16a:
                        int r0 = r10 + 1
                        r6 = r0
                        r3 = r11
                        goto Lab
                    L170:
                        r0 = move-exception
                        r10 = r4
                    L172:
                        r4 = r10
                        r6 = r12
                    L174:
                        o.C56518yIi.KWHzl(r7)
                        long r1 = r4.element
                        EZpvd(r6, r1)
                        o.C56518yIi.copydefault(r7)
                        throw r0
                    L180:
                        o.C56518yIi.KWHzl(r7)
                        long r4 = r13.element
                        EZpvd(r1, r4)
                        o.C56518yIi.copydefault(r7)
                        T r0 = r15.element
                        java.lang.Exception r0 = (java.lang.Exception) r0
                        if (r0 != 0) goto L1ad
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Database Operation failed after "
                        r0.append(r1)
                        r0.append(r3)
                        java.lang.String r1 = " attempts"
                        r0.append(r1)
                        java.lang.Exception r1 = new java.lang.Exception
                        java.lang.String r0 = r0.toString()
                        r1.<init>(r0)
                        r0 = r1
                    L1ad:
                        OLrzqt(r0)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.C44159sFm.copydefault(com.okinc.okimcore.common.database.BaseDao, int, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public static /* synthetic */ java.lang.Object safeExecuteDao$default(BaseDao baseDao, int i, Function0 function0, int i2, java.lang.Object obj) throws java.lang.Exception {
                    if ((i2 & 1) != 0) {
                        i = 3;
                    }
                    Intrinsics.checkNotNullParameter(baseDao, "");
                    Intrinsics.checkNotNullParameter(function0, "");
                    Ref.LongRef longRef = new Ref.LongRef();
                    java.lang.Exception exc = null;
                    int i3 = 0;
                    while (i3 < i) {
                        try {
                            long jNanoTime = java.lang.System.nanoTime();
                            java.lang.Object objInvoke = function0.invoke();
                            longRef.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            return objInvoke;
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                            try {
                                copydefault(e, exc);
                                i3++;
                                exc = e;
                            } finally {
                                C56518yIi.KWHzl(1);
                                EZpvd(baseDao, longRef.element);
                                C56518yIi.copydefault(1);
                            }
                        } catch (java.lang.IllegalStateException e2) {
                            java.lang.String message = e2.getMessage();
                            if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                OLrzqt(e2);
                                throw e2;
                            }
                            copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e3) {
                            OLrzqt(e3);
                            throw e3;
                        }
                    }
                    if (exc == null) {
                        exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                    }
                    OLrzqt(exc);
                    throw exc;
                }

                public static final void EZpvd(@NotNull BaseDao baseDao, long j) {
                    Intrinsics.checkNotNullParameter(baseDao, "");
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    C44158sFl c44158sFl = C44158sFl.copydefault;
                    long j2 = c44158sFl.AEQbTJ().get();
                    if (jCurrentTimeMillis - j2 < 1000 || !c44158sFl.AEQbTJ().compareAndSet(j2, jCurrentTimeMillis)) {
                        return;
                    }
                    sSR.copydefault("DatabaseOperation", C56424yEw.gEmmrt(C56390yDp.OLrzqt("totalTime", java.lang.String.valueOf(j)), C56390yDp.OLrzqt("path", C33129mqd.gEmmrt(baseDao.getDaoName()))));
                }

                public static final void copydefault(@NotNull android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException, java.lang.Exception exc) {
                    Intrinsics.checkNotNullParameter(sQLiteDatabaseLockedException, "");
                    java.lang.String strGEmmrt = C33129mqd.gEmmrt(sQLiteDatabaseLockedException.getMessage());
                    pUU.copydefault("DaoExtensions", "DatabaseLockedException: " + strGEmmrt + ", lastException: " + C33129mqd.gEmmrt(exc != null ? exc.getMessage() : null));
                    sSR.copydefault("DatabaseLockedException: " + C33129mqd.gEmmrt(sQLiteDatabaseLockedException.getMessage()), C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(exc != null ? exc.getMessage() : null))));
                }

                public static final void OLrzqt(@NotNull java.lang.IllegalStateException illegalStateException) {
                    Intrinsics.checkNotNullParameter(illegalStateException, "");
                    pUU.copydefault("DaoExtensions", "DatabaseClosedException: " + C33129mqd.gEmmrt(illegalStateException.getMessage()));
                    sEF sef = sEF.OLrzqt;
                    EventData eventDataAEQbTJ = sef.AEQbTJ();
                    eventDataAEQbTJ.setMsg("DatabaseClosedException: " + C33129mqd.gEmmrt(illegalStateException.getMessage()));
                    sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
                }

                public static final void copydefault(@NotNull java.lang.IllegalStateException illegalStateException) {
                    Intrinsics.checkNotNullParameter(illegalStateException, "");
                    pUU.copydefault("DaoExtensions", "DatabaseIllegalStateException: " + C33129mqd.gEmmrt(illegalStateException.getMessage()));
                    sEF sef = sEF.OLrzqt;
                    EventData eventDataAEQbTJ = sef.AEQbTJ();
                    eventDataAEQbTJ.setMsg("DatabaseIllegalStateException: " + C33129mqd.gEmmrt(illegalStateException.getMessage()));
                    sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
                }

                public static final void OLrzqt(@NotNull java.lang.Exception exc) {
                    Intrinsics.checkNotNullParameter(exc, "");
                    pUU.copydefault("DaoExtensions", "DatabaseException: " + C33129mqd.gEmmrt(exc.getMessage()));
                    sEF sef = sEF.OLrzqt;
                    EventData eventDataAEQbTJ = sef.AEQbTJ();
                    eventDataAEQbTJ.setMsg("DatabaseException: " + C33129mqd.gEmmrt(exc.getMessage()));
                    sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
                }

                public static /* synthetic */ java.lang.Object safeExecuteSuspendableDao$default(BaseDao baseDao, int i, Function1 function1, Continuation continuation, int i2, java.lang.Object obj) throws java.lang.Exception {
                    if ((i2 & 1) != 0) {
                        i = 3;
                    }
                    java.lang.Exception exc = null;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i) {
                            if (exc == null) {
                                exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                            }
                            OLrzqt(exc);
                            throw exc;
                        }
                        try {
                            long jNanoTime = java.lang.System.nanoTime();
                            C56518yIi.AEQbTJ(3);
                            C56518yIi.AEQbTJ(0);
                            java.lang.Object objInvoke = function1.invoke(null);
                            C56518yIi.AEQbTJ(1);
                            Unit unit = Unit.INSTANCE;
                            long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            C56518yIi.KWHzl(1);
                            EZpvd(baseDao, jValueOf);
                            C56518yIi.copydefault(1);
                            return objInvoke;
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                            try {
                                copydefault(e, exc);
                                if (i3 < i - 1) {
                                    C56518yIi.AEQbTJ(3);
                                    C56518yIi.AEQbTJ(0);
                                    DelayKt.delay(((long) (i3 + 1)) * 50, null);
                                    C56518yIi.AEQbTJ(1);
                                }
                                i3++;
                                exc = e;
                            } finally {
                                C56518yIi.KWHzl(1);
                                EZpvd(baseDao, 0L);
                                C56518yIi.copydefault(1);
                            }
                        } catch (java.lang.IllegalStateException e2) {
                            java.lang.String message = e2.getMessage();
                            if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                OLrzqt(e2);
                                throw e2;
                            }
                            copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e3) {
                            OLrzqt(e3);
                            throw e3;
                        }
                    }
                }
            }
