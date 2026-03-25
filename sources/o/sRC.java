package o;

import androidx.room.RoomDatabaseKt;
import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.stickers.local.StickerPackEntity;
import com.okinc.okimcore.stickers.local.StickerPacksDao;
import com.okinc.okimcore.stickers.local.StickerPacksRepository$deleteAndInsert$2;
import com.okinc.okimcore.stickers.local.StickerPacksRepository$savePacks$1;
import com.okinc.okimcore.stickers.remote.model.StickerPacksResponse;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sRC {
    public final sIF OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static final StickerPacksResponse.StickerPack EZpvd = new StickerPacksResponse.StickerPack(StickerPackEntity.CUSTOM_PACK_ID, "", Long.MIN_VALUE, yDY.AhwBna(), "", "");

    @yCM
    public sRC(@NotNull sIF sif) {
        Intrinsics.checkNotNullParameter(sif, "");
        this.OLrzqt = sif;
    }

    public final StickerPacksDao copydefault() {
        return this.OLrzqt.AhwBna().fetchVPNInfo();
    }

    /* JADX DEBUG: Duplicate block (B:87:0x0262) to fix multi-entry loop: BACK_EDGE: B:87:0x0262 -> B:19:0x0066 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v44, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x026e: MOVE (r10 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:89:0x026e */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x026f: MOVE (r9 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:89:0x026e */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a8 A[LOOP:1: B:52:0x01a2->B:54:0x01a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0239 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #6 {all -> 0x0069, blocks: (B:17:0x005a, B:39:0x0118, B:40:0x011a, B:44:0x0150, B:81:0x022c, B:83:0x0239, B:68:0x0203, B:69:0x0206, B:70:0x0207, B:72:0x020d, B:74:0x0219, B:75:0x021c, B:76:0x021d, B:77:0x0220), top: B:99:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0276  */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.List<StickerPacksResponse.StickerPack> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        StickerPacksRepository$savePacks$1 stickerPacksRepository$savePacks$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        BaseDao baseDaoCopydefault;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        java.util.List<StickerPacksResponse.StickerPack> list2;
        java.util.Set set;
        sRC src;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        java.util.Set set2;
        Ref.ObjectRef objectRef2;
        int i3;
        sRC src2;
        int i4;
        java.util.List list3;
        ?? r0;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        int i5;
        long jNanoTime;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        T t;
        java.util.Set<java.lang.String> setOqFWZa;
        java.util.ArrayList arrayList;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        if (continuation instanceof StickerPacksRepository$savePacks$1) {
            stickerPacksRepository$savePacks$1 = (StickerPacksRepository$savePacks$1) continuation;
            int i6 = stickerPacksRepository$savePacks$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                stickerPacksRepository$savePacks$1.label = i6 - Integer.MIN_VALUE;
            } else {
                stickerPacksRepository$savePacks$1 = new StickerPacksRepository$savePacks$1(this, continuation);
            }
        }
        java.lang.Object obj = stickerPacksRepository$savePacks$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i7 = stickerPacksRepository$savePacks$1.label;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    long j = stickerPacksRepository$savePacks$1.J$0;
                    i = stickerPacksRepository$savePacks$1.I$2;
                    i5 = stickerPacksRepository$savePacks$1.I$1;
                    i2 = stickerPacksRepository$savePacks$1.I$0;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) stickerPacksRepository$savePacks$1.L$8;
                    Ref.LongRef longRef5 = (Ref.LongRef) stickerPacksRepository$savePacks$1.L$7;
                    Ref.ObjectRef objectRef7 = (Ref.ObjectRef) stickerPacksRepository$savePacks$1.L$6;
                    Ref.ObjectRef objectRef8 = (Ref.ObjectRef) stickerPacksRepository$savePacks$1.L$5;
                    longRef2 = (Ref.LongRef) stickerPacksRepository$savePacks$1.L$4;
                    baseDao2 = (BaseDao) stickerPacksRepository$savePacks$1.L$3;
                    set = (java.util.Set) stickerPacksRepository$savePacks$1.L$2;
                    java.util.List list4 = (java.util.List) stickerPacksRepository$savePacks$1.L$1;
                    src = (sRC) stickerPacksRepository$savePacks$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        list2 = list4;
                        objectRef3 = objectRef8;
                        objectRef5 = objectRef6;
                        objectRef4 = objectRef7;
                        longRef3 = longRef2;
                        longRef4 = longRef5;
                        baseDaoCopydefault = baseDao2;
                        jNanoTime = j;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        set2 = set;
                        baseDaoCopydefault = baseDao2;
                        longRef3 = longRef2;
                        i4 = i5;
                        i3 = i2;
                        src2 = src;
                        objectRef2 = objectRef8;
                        list3 = list4;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i < i3 - 1) {
                        }
                        i2 = i3;
                        i = i4 + i;
                        list2 = list;
                        if (i < i2) {
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
                    objectRef5.element = t;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDaoCopydefault, longRef3.element);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (r0.hasNext()) {
                    }
                    setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                    while (r4.hasNext()) {
                    }
                    stickerPacksRepository$savePacks$1.L$0 = null;
                    stickerPacksRepository$savePacks$1.L$1 = null;
                    stickerPacksRepository$savePacks$1.L$2 = null;
                    stickerPacksRepository$savePacks$1.L$3 = null;
                    stickerPacksRepository$savePacks$1.L$4 = null;
                    stickerPacksRepository$savePacks$1.L$5 = null;
                    stickerPacksRepository$savePacks$1.L$6 = null;
                    stickerPacksRepository$savePacks$1.L$7 = null;
                    stickerPacksRepository$savePacks$1.L$8 = null;
                    stickerPacksRepository$savePacks$1.label = 3;
                    if (src.OLrzqt(setOqFWZa, arrayList, stickerPacksRepository$savePacks$1) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                i4 = stickerPacksRepository$savePacks$1.I$1;
                i3 = stickerPacksRepository$savePacks$1.I$0;
                Ref.ObjectRef objectRef9 = (Ref.ObjectRef) stickerPacksRepository$savePacks$1.L$5;
                longRef3 = (Ref.LongRef) stickerPacksRepository$savePacks$1.L$4;
                baseDaoCopydefault = (BaseDao) stickerPacksRepository$savePacks$1.L$3;
                java.util.Set set3 = (java.util.Set) stickerPacksRepository$savePacks$1.L$2;
                java.util.List list5 = (java.util.List) stickerPacksRepository$savePacks$1.L$1;
                sRC src3 = (sRC) stickerPacksRepository$savePacks$1.L$0;
                C56391yDq.AEQbTJ(obj);
                java.util.List list6 = list5;
                src = src3;
                int i8 = 1;
                objectRef = objectRef9;
                set = set3;
                i2 = i3;
                i = i4 + i8;
                list2 = list6;
                if (i < i2) {
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
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        sQLiteDatabaseLockedException = e8;
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        sQLiteDatabaseLockedException = e9;
                        set2 = set;
                        i3 = i2;
                        src2 = src;
                        list3 = list2;
                        objectRef2 = objectRef;
                        i4 = i;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i < i3 - 1) {
                            stickerPacksRepository$savePacks$1.L$0 = src2;
                            stickerPacksRepository$savePacks$1.L$1 = list3;
                            stickerPacksRepository$savePacks$1.L$2 = set2;
                            stickerPacksRepository$savePacks$1.L$3 = baseDaoCopydefault;
                            stickerPacksRepository$savePacks$1.L$4 = longRef3;
                            stickerPacksRepository$savePacks$1.L$5 = objectRef2;
                            stickerPacksRepository$savePacks$1.L$6 = null;
                            stickerPacksRepository$savePacks$1.L$7 = null;
                            stickerPacksRepository$savePacks$1.L$8 = null;
                            stickerPacksRepository$savePacks$1.I$0 = i3;
                            stickerPacksRepository$savePacks$1.I$1 = i4;
                            stickerPacksRepository$savePacks$1.label = 2;
                            if (DelayKt.delay(((long) (i + 1)) * 50, stickerPacksRepository$savePacks$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            list6 = list3;
                            src = src2;
                            objectRef = objectRef2;
                            set = set2;
                            i8 = 1;
                        } else {
                            list6 = list3;
                            src = src2;
                            objectRef = objectRef2;
                            set = set2;
                            i8 = 1;
                        }
                        i2 = i3;
                        i = i4 + i8;
                        list2 = list6;
                        if (i < i2) {
                        }
                    }
                    Ref.ObjectRef objectRef10 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    StickerPacksDao stickerPacksDaoCopydefault = src.copydefault();
                    stickerPacksRepository$savePacks$1.L$0 = src;
                    stickerPacksRepository$savePacks$1.L$1 = list2;
                    stickerPacksRepository$savePacks$1.L$2 = set;
                    stickerPacksRepository$savePacks$1.L$3 = baseDaoCopydefault;
                    stickerPacksRepository$savePacks$1.L$4 = longRef3;
                    stickerPacksRepository$savePacks$1.L$5 = objectRef;
                    stickerPacksRepository$savePacks$1.L$6 = objectRef10;
                    stickerPacksRepository$savePacks$1.L$7 = longRef3;
                    stickerPacksRepository$savePacks$1.L$8 = objectRef10;
                    stickerPacksRepository$savePacks$1.I$0 = i2;
                    stickerPacksRepository$savePacks$1.I$1 = i;
                    stickerPacksRepository$savePacks$1.I$2 = i;
                    stickerPacksRepository$savePacks$1.J$0 = jNanoTime;
                    stickerPacksRepository$savePacks$1.label = 1;
                    java.lang.Object allIds = stickerPacksDaoCopydefault.getAllIds(stickerPacksRepository$savePacks$1);
                    if (allIds == objCopydefault) {
                        return objCopydefault;
                    }
                    objectRef3 = objectRef;
                    i5 = i;
                    longRef4 = longRef3;
                    objectRef4 = objectRef10;
                    t = allIds;
                    objectRef5 = objectRef4;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        set2 = set;
                        src2 = src;
                        list3 = list2;
                        i4 = i5;
                        i3 = i2;
                        objectRef2 = objectRef3;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i < i3 - 1) {
                        }
                        i2 = i3;
                        i = i4 + i8;
                        list2 = list6;
                        if (i < i2) {
                        }
                    }
                    objectRef5.element = t;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef4.element;
                    C44159sFm.EZpvd(baseDaoCopydefault, longRef3.element);
                    java.util.ArrayList arrayList22 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : (java.lang.Iterable) t22) {
                        if (!set.contains((java.lang.String) obj2)) {
                            arrayList22.add(obj2);
                        }
                    }
                    setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList22);
                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                    for (StickerPacksResponse.StickerPack stickerPack : list2) {
                        arrayList.add(new StickerPackEntity(stickerPack.copydefault(), stickerPack.gEmmrt(), stickerPack.OLrzqt(), stickerPack.KWHzl(), stickerPack.EZpvd()));
                    }
                    stickerPacksRepository$savePacks$1.L$0 = null;
                    stickerPacksRepository$savePacks$1.L$1 = null;
                    stickerPacksRepository$savePacks$1.L$2 = null;
                    stickerPacksRepository$savePacks$1.L$3 = null;
                    stickerPacksRepository$savePacks$1.L$4 = null;
                    stickerPacksRepository$savePacks$1.L$5 = null;
                    stickerPacksRepository$savePacks$1.L$6 = null;
                    stickerPacksRepository$savePacks$1.L$7 = null;
                    stickerPacksRepository$savePacks$1.L$8 = null;
                    stickerPacksRepository$savePacks$1.label = 3;
                    if (src.OLrzqt(setOqFWZa, arrayList, stickerPacksRepository$savePacks$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C44159sFm.EZpvd(baseDaoCopydefault, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i2 + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(EZpvd), (java.lang.Iterable) list);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
            java.util.Iterator it = listDjBIcL.iterator();
            while (it.hasNext()) {
                arrayList3.add(((StickerPacksResponse.StickerPack) it.next()).copydefault());
            }
            java.util.Set setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(arrayList3);
            baseDaoCopydefault = copydefault();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 0;
            i2 = 3;
            list2 = listDjBIcL;
            set = setOqFWZa2;
            src = this;
            if (i < i2) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    public final java.lang.Object OLrzqt(java.util.Set<java.lang.String> set, java.util.List<StickerPackEntity> list, Continuation<? super Unit> continuation) {
        java.lang.Object objWithTransaction = RoomDatabaseKt.withTransaction(this.OLrzqt.AhwBna(), new StickerPacksRepository$deleteAndInsert$2(this, set, list, null), continuation);
        return objWithTransaction == C56442yFn.copydefault() ? objWithTransaction : Unit.INSTANCE;
    }

    public final Flow<java.util.List<StickerPackEntity>> KWHzl() throws java.lang.Exception {
        StickerPacksDao stickerPacksDaoCopydefault = copydefault();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                try {
                    try {
                        long jNanoTime = java.lang.System.nanoTime();
                        Flow<java.util.List<StickerPackEntity>> all = copydefault().getAll();
                        long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        longRef.element = jValueOf;
                        C44159sFm.EZpvd(stickerPacksDaoCopydefault, jValueOf);
                        return all;
                    } catch (java.lang.Exception e) {
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e2) {
                    try {
                        C44159sFm.copydefault(e2, exc);
                        i++;
                        exc = e2;
                    } finally {
                        C44159sFm.EZpvd(stickerPacksDaoCopydefault, longRef.element);
                    }
                }
            } catch (java.lang.IllegalStateException e3) {
                java.lang.String message = e3.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e3);
                    throw e3;
                }
                C44159sFm.copydefault(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sRC.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
