package com.okinc.okimcore.stickers.local;

import android.database.sqlite.SQLiteDatabaseLockedException;
import com.okinc.okimcore.common.database.BaseDao;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import o.C44159sFm;
import o.C56391yDq;
import o.C56442yFn;
import o.C59462zhW;
import o.C59519zia;
import o.sRC;

/* JADX INFO: loaded from: classes10.dex */
public final class StickerPacksRepository$deleteAndInsert$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Set<String> $packIdsToDelete;
    final /* synthetic */ List<StickerPackEntity> $stickerPacks;
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
    final /* synthetic */ sRC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPacksRepository$deleteAndInsert$2(sRC src, Set<String> set, List<StickerPackEntity> list, Continuation<? super StickerPacksRepository$deleteAndInsert$2> continuation) {
        super(1, continuation);
        this.this$0 = src;
        this.$packIdsToDelete = set;
        this.$stickerPacks = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new StickerPacksRepository$deleteAndInsert$2(this.this$0, this.$packIdsToDelete, this.$stickerPacks, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((StickerPacksRepository$deleteAndInsert$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:153:0x037f) to fix multi-entry loop: BACK_EDGE: B:153:0x037f -> B:154:0x0386 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:11:0x003b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:120:0x0306 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:187:0x0386 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0236 */
    /* JADX DEBUG: Type inference failed for r0v22. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v34. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v56. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v64. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r10v10. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r6v3. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0323 A[Catch: all -> 0x00d0, TryCatch #24 {all -> 0x00d0, blocks: (B:27:0x00bd, B:130:0x0316, B:131:0x0319, B:134:0x031d, B:136:0x0323, B:138:0x032d, B:139:0x0330, B:140:0x0331, B:141:0x0334), top: B:168:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0356 A[Catch: all -> 0x038b, TRY_LEAVE, TryCatch #18 {all -> 0x038b, blocks: (B:147:0x0349, B:149:0x0356), top: B:173:0x0349 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024e A[Catch: all -> 0x003b, TryCatch #10 {all -> 0x003b, blocks: (B:9:0x0034, B:78:0x0241, B:79:0x0244, B:82:0x0248, B:84:0x024e, B:86:0x0258, B:87:0x025b, B:88:0x025c, B:89:0x025f), top: B:168:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027b A[Catch: all -> 0x02b7, TRY_LEAVE, TryCatch #7 {all -> 0x02b7, blocks: (B:94:0x026e, B:96:0x027b), top: B:166:0x026e }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v45, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v9, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r9v20, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x02ab -> B:102:0x02b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x02a1 -> B:100:0x02a3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        ?? r14;
        ?? r4;
        Ref.LongRef longRef;
        ?? r7;
        sRC src;
        Set<String> set;
        Ref.LongRef longRef2;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        BaseDao baseDao;
        Exception e;
        IllegalStateException e2;
        String message;
        Ref.LongRef longRef3;
        String str;
        BaseDao baseDao2;
        sRC src2;
        int i3;
        Ref.ObjectRef objectRef2;
        int i4;
        ?? r0;
        int i5;
        sRC src3;
        int i6;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef5;
        BaseDao baseDao3;
        long j;
        Ref.ObjectRef objectRef4;
        List<StickerPackEntity> list;
        Ref.LongRef longRef6;
        Ref.ObjectRef objectRef5;
        int i7;
        int i8;
        sRC src4;
        BaseDao baseDao4;
        sRC src5;
        String str2;
        String str3;
        SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        Exception e3;
        IllegalStateException e4;
        String message2;
        BaseDao baseDao5;
        Ref.ObjectRef objectRef6;
        BaseDao baseDao6;
        sRC src6;
        int i9;
        int i10;
        List<StickerPackEntity> list2;
        Ref.LongRef longRef7;
        ?? r02;
        int i11;
        sRC src7;
        int i12;
        int i13;
        String str4;
        String str5;
        List<StickerPackEntity> list3;
        Ref.ObjectRef objectRef7;
        Ref.ObjectRef objectRef8;
        long jNanoTime;
        Ref.LongRef longRef8;
        BaseDao baseDao7;
        Ref.ObjectRef objectRef9;
        Object objCopydefault = C56442yFn.copydefault();
        int i14 = this.label;
        ?? r72 = 2;
        String str6 = " attempts";
        String str7 = "Database Operation failed after ";
        try {
            try {
                if (i14 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    StickerPacksDao stickerPacksDaoCopydefault = this.this$0.copydefault();
                    src = this.this$0;
                    set = this.$packIdsToDelete;
                    longRef2 = new Ref.LongRef();
                    objectRef = new Ref.ObjectRef();
                    i = 0;
                    i2 = 3;
                    baseDao = stickerPacksDaoCopydefault;
                    if (i < i2) {
                    }
                } else if (i14 == 1) {
                    j = this.J$0;
                    int i15 = this.I$2;
                    int i16 = this.I$1;
                    i2 = this.I$0;
                    Ref.ObjectRef objectRef10 = (Ref.ObjectRef) this.L$7;
                    Ref.LongRef longRef9 = (Ref.LongRef) this.L$6;
                    objectRef3 = (Ref.ObjectRef) this.L$5;
                    objectRef = (Ref.ObjectRef) this.L$4;
                    Ref.LongRef longRef10 = (Ref.LongRef) this.L$3;
                    set = (Set) this.L$2;
                    src3 = (sRC) this.L$1;
                    BaseDao baseDao8 = (BaseDao) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        i5 = i15;
                        objectRef4 = objectRef10;
                        baseDao3 = baseDao8;
                        i6 = i16;
                        longRef5 = longRef9;
                        longRef4 = longRef10;
                    } catch (SQLiteDatabaseLockedException e5) {
                        i4 = i16;
                        objectRef2 = objectRef;
                        str = " attempts";
                        src2 = src3;
                        baseDao2 = baseDao8;
                        i3 = i15;
                        r0 = e5;
                        longRef3 = longRef10;
                        C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i3 < i2 - 1) {
                        }
                        str6 = str;
                        i = i + i;
                        baseDao = baseDao;
                        longRef2 = longRef;
                        if (i < i2) {
                        }
                    } catch (IllegalStateException e6) {
                        e2 = e6;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (Exception e7) {
                        e = e7;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        r4 = baseDao8;
                        r14 = longRef10;
                        C44159sFm.EZpvd(r4, r14.element);
                        throw th;
                    }
                    objectRef4.element = Unit.INSTANCE;
                    longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    Object obj2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao3, longRef4.element);
                    StickerPacksDao stickerPacksDaoCopydefault2 = this.this$0.copydefault();
                    sRC src8 = this.this$0;
                    list = this.$stickerPacks;
                    longRef6 = new Ref.LongRef();
                    objectRef5 = new Ref.ObjectRef();
                    i7 = 0;
                    i8 = 3;
                    src4 = src8;
                    baseDao4 = stickerPacksDaoCopydefault2;
                    if (i7 < i8) {
                    }
                } else {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            long j2 = this.J$0;
                            i10 = this.I$2;
                            i9 = this.I$1;
                            i8 = this.I$0;
                            Ref.ObjectRef objectRef11 = (Ref.ObjectRef) this.L$7;
                            Ref.LongRef longRef11 = (Ref.LongRef) this.L$6;
                            Ref.ObjectRef objectRef12 = (Ref.ObjectRef) this.L$5;
                            Ref.ObjectRef objectRef13 = (Ref.ObjectRef) this.L$4;
                            longRef = (Ref.LongRef) this.L$3;
                            List<StickerPackEntity> list4 = (List) this.L$2;
                            src7 = (sRC) this.L$1;
                            baseDao5 = (BaseDao) this.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj);
                                i11 = i9;
                                objectRef9 = objectRef11;
                                i12 = i10;
                                longRef8 = longRef11;
                                i13 = i8;
                                str4 = "Database Operation failed after ";
                                str5 = " attempts";
                                list3 = list4;
                                objectRef7 = objectRef13;
                                objectRef8 = objectRef12;
                                jNanoTime = j2;
                                longRef7 = longRef;
                                baseDao7 = baseDao5;
                            } catch (SQLiteDatabaseLockedException e8) {
                                longRef7 = longRef;
                                objectRef6 = objectRef13;
                                list2 = list4;
                                src6 = src7;
                                baseDao6 = baseDao5;
                                r02 = e8;
                                C44159sFm.copydefault(r02, (Exception) objectRef6.element);
                                objectRef6.element = r02;
                                if (i10 < i8 - 1) {
                                }
                            } catch (IllegalStateException e9) {
                                e4 = e9;
                                message2 = e4.getMessage();
                                if (message2 == null) {
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            } catch (Exception e10) {
                                e3 = e10;
                                C44159sFm.OLrzqt(e3);
                                throw e3;
                            } catch (Throwable th2) {
                                th = th2;
                                r7 = baseDao5;
                                C44159sFm.EZpvd(r7, longRef.element);
                                throw th;
                            }
                            ?? r9 = Unit.INSTANCE;
                            objectRef9.element = r9;
                            longRef8.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            Object obj3 = objectRef8.element;
                            C44159sFm.EZpvd(baseDao7, longRef7.element);
                            return r9;
                        }
                        if (i14 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i17 = this.I$1;
                        i8 = this.I$0;
                        objectRef6 = (Ref.ObjectRef) this.L$4;
                        longRef7 = (Ref.LongRef) this.L$3;
                        list2 = (List) this.L$2;
                        sRC src9 = (sRC) this.L$1;
                        BaseDao baseDao9 = (BaseDao) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        src6 = src9;
                        list = list2;
                        src4 = src6;
                        objectRef5 = objectRef6;
                        longRef6 = longRef7;
                        baseDao4 = baseDao9;
                        i9 = i17;
                        i7 = i9 + 1;
                        if (i7 < i8) {
                            try {
                                try {
                                } catch (IllegalStateException e11) {
                                    e4 = e11;
                                    message2 = e4.getMessage();
                                    if (message2 == null && StringsKt__StringsKt.contains$default((CharSequence) message2, (CharSequence) "not open", false, 2, (Object) null)) {
                                        C44159sFm.OLrzqt(e4);
                                        throw e4;
                                    }
                                    C44159sFm.copydefault(e4);
                                    throw e4;
                                } catch (Exception e12) {
                                    e3 = e12;
                                    C44159sFm.OLrzqt(e3);
                                    throw e3;
                                } catch (Throwable th3) {
                                    th = th3;
                                    baseDao5 = baseDao4;
                                    longRef = longRef6;
                                    r7 = baseDao5;
                                    C44159sFm.EZpvd(r7, longRef.element);
                                    throw th;
                                }
                            } catch (SQLiteDatabaseLockedException e13) {
                                e = e13;
                                i12 = i7;
                            }
                            objectRef9 = new Ref.ObjectRef();
                            jNanoTime = System.nanoTime();
                            StickerPacksDao stickerPacksDaoCopydefault3 = src4.copydefault();
                            this.L$0 = baseDao4;
                            this.L$1 = src4;
                            this.L$2 = list;
                            this.L$3 = longRef6;
                            this.L$4 = objectRef5;
                            this.L$5 = objectRef9;
                            this.L$6 = longRef6;
                            this.L$7 = objectRef9;
                            this.I$0 = i8;
                            this.I$1 = i7;
                            this.I$2 = i7;
                            this.J$0 = jNanoTime;
                            i12 = i7;
                            try {
                            } catch (SQLiteDatabaseLockedException e14) {
                                try {
                                    e = e14;
                                    C44159sFm.copydefault(r02, (Exception) objectRef6.element);
                                    objectRef6.element = r02;
                                    if (i10 < i8 - 1) {
                                        this.L$0 = baseDao6;
                                        this.L$1 = src6;
                                        this.L$2 = list2;
                                        this.L$3 = longRef7;
                                        this.L$4 = objectRef6;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.L$7 = null;
                                        this.I$0 = i8;
                                        this.I$1 = i9;
                                        this.label = 4;
                                        if (DelayKt.delay(((long) (i10 + 1)) * 50, this) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        i17 = i9;
                                        baseDao9 = baseDao6;
                                        list = list2;
                                        src4 = src6;
                                        objectRef5 = objectRef6;
                                        longRef6 = longRef7;
                                        baseDao4 = baseDao9;
                                        i9 = i17;
                                        i7 = i9 + 1;
                                        if (i7 < i8) {
                                        }
                                    } else {
                                        list = list2;
                                        src4 = src6;
                                        objectRef5 = objectRef6;
                                        longRef6 = longRef7;
                                        baseDao4 = baseDao6;
                                        i7 = i9 + 1;
                                        if (i7 < i8) {
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    baseDao5 = baseDao6;
                                    longRef = longRef7;
                                    r7 = baseDao5;
                                    C44159sFm.EZpvd(r7, longRef.element);
                                    throw th;
                                }
                                baseDao6 = baseDao4;
                                src6 = src4;
                                list2 = list;
                                longRef7 = longRef6;
                                i10 = i12;
                                i9 = i10;
                                objectRef6 = objectRef5;
                                r02 = e;
                            }
                            this.label = 3;
                            if (stickerPacksDaoCopydefault3.insert(list, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            src7 = src4;
                            longRef8 = longRef6;
                            i11 = i12;
                            baseDao7 = baseDao4;
                            longRef7 = longRef8;
                            i13 = i8;
                            str4 = str7;
                            str5 = str6;
                            list3 = list;
                            objectRef7 = objectRef5;
                            objectRef8 = objectRef9;
                            try {
                            } catch (SQLiteDatabaseLockedException e15) {
                                i9 = i11;
                                baseDao6 = baseDao7;
                                list2 = list3;
                                str6 = str5;
                                str7 = str4;
                                i8 = i13;
                                i10 = i12;
                                src6 = src7;
                                objectRef6 = objectRef7;
                                r02 = e15;
                                C44159sFm.copydefault(r02, (Exception) objectRef6.element);
                                objectRef6.element = r02;
                                if (i10 < i8 - 1) {
                                }
                            } catch (IllegalStateException e16) {
                                e4 = e16;
                                message2 = e4.getMessage();
                                if (message2 == null) {
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            } catch (Exception e17) {
                                e3 = e17;
                                C44159sFm.OLrzqt(e3);
                                throw e3;
                            } catch (Throwable th5) {
                                th = th5;
                                r72 = baseDao7;
                                longRef = longRef7;
                                r7 = r72;
                                C44159sFm.EZpvd(r7, longRef.element);
                                throw th;
                            }
                            ?? r92 = Unit.INSTANCE;
                            objectRef9.element = r92;
                            longRef8.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            Object obj32 = objectRef8.element;
                            C44159sFm.EZpvd(baseDao7, longRef7.element);
                            return r92;
                        }
                        C44159sFm.EZpvd(baseDao4, longRef6.element);
                        Exception exc = (Exception) objectRef5.element;
                        if (exc == null) {
                            exc = new Exception(str7 + i8 + str6);
                        }
                        C44159sFm.OLrzqt(exc);
                        throw exc;
                    }
                    int i18 = this.I$1;
                    int i19 = this.I$0;
                    Ref.ObjectRef objectRef14 = (Ref.ObjectRef) this.L$4;
                    Ref.LongRef longRef12 = (Ref.LongRef) this.L$3;
                    Set<String> set2 = (Set) this.L$2;
                    sRC src10 = (sRC) this.L$1;
                    BaseDao baseDao10 = (BaseDao) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objectRef = objectRef14;
                    set = set2;
                    BaseDao baseDao11 = baseDao10;
                    int i20 = 1;
                    Ref.LongRef longRef13 = longRef12;
                    String str8 = " attempts";
                    i2 = i19;
                    src = src10;
                    str6 = str8;
                    i = i18 + i20;
                    baseDao = baseDao11;
                    longRef2 = longRef13;
                    if (i < i2) {
                        try {
                            try {
                            } catch (IllegalStateException e18) {
                                e2 = e18;
                                message = e2.getMessage();
                                if (message == null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "not open", false, 2, (Object) null)) {
                                    C44159sFm.OLrzqt(e2);
                                    throw e2;
                                }
                                C44159sFm.copydefault(e2);
                                throw e2;
                            } catch (Exception e19) {
                                e = e19;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (Throwable th6) {
                                th = th6;
                                r14 = longRef2;
                                r4 = baseDao;
                                C44159sFm.EZpvd(r4, r14.element);
                                throw th;
                            }
                        } catch (SQLiteDatabaseLockedException e20) {
                            src5 = src;
                            i4 = i;
                            str2 = str6;
                            str3 = str7;
                            sQLiteDatabaseLockedException = e20;
                        }
                        objectRef4 = new Ref.ObjectRef();
                        str2 = str6;
                        str3 = str7;
                        try {
                        } catch (SQLiteDatabaseLockedException e21) {
                            e = e21;
                            src5 = src;
                        }
                        long jNanoTime2 = System.nanoTime();
                        StickerPacksDao stickerPacksDaoCopydefault4 = src.copydefault();
                        this.L$0 = baseDao;
                        this.L$1 = src;
                        this.L$2 = set;
                        this.L$3 = longRef2;
                        this.L$4 = objectRef;
                        this.L$5 = objectRef4;
                        this.L$6 = longRef2;
                        this.L$7 = objectRef4;
                        this.I$0 = i2;
                        this.I$1 = i;
                        this.I$2 = i;
                        this.J$0 = jNanoTime2;
                        src5 = src;
                        try {
                        } catch (SQLiteDatabaseLockedException e22) {
                            try {
                                e = e22;
                                i4 = i;
                                sQLiteDatabaseLockedException = e;
                                C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                                objectRef2.element = r0;
                                if (i3 < i2 - 1) {
                                    this.L$0 = baseDao2;
                                    this.L$1 = src2;
                                    this.L$2 = set;
                                    this.L$3 = longRef3;
                                    this.L$4 = objectRef2;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = null;
                                    this.I$0 = i2;
                                    this.I$1 = i4;
                                    this.label = 2;
                                    if (DelayKt.delay(((long) (i3 + 1)) * 50, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    i18 = i4;
                                    src = src2;
                                    str8 = str;
                                    longRef13 = longRef3;
                                    i20 = 1;
                                    objectRef = objectRef2;
                                    baseDao11 = baseDao2;
                                } else {
                                    i18 = i4;
                                    src = src2;
                                    str8 = str;
                                    longRef13 = longRef3;
                                    i20 = 1;
                                    objectRef = objectRef2;
                                    baseDao11 = baseDao2;
                                }
                                str6 = str8;
                                i = i18 + i20;
                                baseDao = baseDao11;
                                longRef2 = longRef13;
                                if (i < i2) {
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                r4 = baseDao2;
                                r14 = longRef3;
                                C44159sFm.EZpvd(r4, r14.element);
                                throw th;
                            }
                            longRef3 = longRef2;
                            str7 = str3;
                            src2 = src5;
                            baseDao2 = baseDao;
                            objectRef2 = objectRef;
                            str = str2;
                            i3 = i4;
                            r0 = sQLiteDatabaseLockedException;
                        }
                        this.label = 1;
                        if (stickerPacksDaoCopydefault4.delete(set, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        src3 = src5;
                        i5 = i;
                        i6 = i5;
                        longRef4 = longRef2;
                        baseDao3 = baseDao;
                        j = jNanoTime2;
                        str6 = str2;
                        str7 = str3;
                        objectRef3 = objectRef4;
                        longRef5 = longRef2;
                        try {
                        } catch (SQLiteDatabaseLockedException e23) {
                            i3 = i5;
                            baseDao2 = baseDao3;
                            objectRef2 = objectRef;
                            str = str6;
                            i4 = i6;
                            src2 = src3;
                            r0 = e23;
                            longRef3 = longRef4;
                            C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i3 < i2 - 1) {
                            }
                            str6 = str8;
                            i = i18 + i20;
                            baseDao = baseDao11;
                            longRef2 = longRef13;
                            if (i < i2) {
                            }
                        } catch (IllegalStateException e24) {
                            e2 = e24;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (Exception e25) {
                            e = e25;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (Throwable th8) {
                            th = th8;
                            r4 = baseDao3;
                            r14 = longRef4;
                            C44159sFm.EZpvd(r4, r14.element);
                            throw th;
                        }
                        objectRef4.element = Unit.INSTANCE;
                        longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - j, DurationUnit.NANOSECONDS));
                        Object obj22 = objectRef3.element;
                        C44159sFm.EZpvd(baseDao3, longRef4.element);
                        StickerPacksDao stickerPacksDaoCopydefault22 = this.this$0.copydefault();
                        sRC src82 = this.this$0;
                        list = this.$stickerPacks;
                        longRef6 = new Ref.LongRef();
                        objectRef5 = new Ref.ObjectRef();
                        i7 = 0;
                        i8 = 3;
                        src4 = src82;
                        baseDao4 = stickerPacksDaoCopydefault22;
                        if (i7 < i8) {
                        }
                    } else {
                        String str9 = str6;
                        String str10 = str7;
                        C44159sFm.EZpvd(baseDao, longRef2.element);
                        Exception exc2 = (Exception) objectRef.element;
                        if (exc2 == null) {
                            exc2 = new Exception(str10 + i2 + str9);
                        }
                        C44159sFm.OLrzqt(exc2);
                        throw exc2;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                r14 = 4;
                r4 = 3;
            }
        } catch (Throwable th10) {
            th = th10;
        }
    }
}
