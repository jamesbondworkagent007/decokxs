package o;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.stickers.local.StickerEntity;
import com.okinc.okimcore.stickers.local.StickerPackEntity;
import com.okinc.okimcore.stickers.local.StickersDao;
import com.okinc.okimcore.stickers.local.StickersRepository$addStickers$1;
import com.okinc.okimcore.stickers.local.StickersRepository$countStickersByPackId$1;
import com.okinc.okimcore.stickers.local.StickersRepository$deleteAndInsert$1;
import com.okinc.okimcore.stickers.local.StickersRepository$deleteStickersByIds$1;
import com.okinc.okimcore.stickers.local.StickersRepository$doesStickerExist$1;
import com.okinc.okimcore.stickers.local.StickersRepository$getStickers$1;
import com.okinc.okimcore.stickers.local.StickersRepository$saveStickers$1;
import com.okinc.okimcore.stickers.remote.model.StickerPacksResponse;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sRK {
    public final sIF copydefault;

    @yCM
    public sRK(@NotNull sIF sif) {
        Intrinsics.checkNotNullParameter(sif, "");
        this.copydefault = sif;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.sRK.copydefault(com.okinc.okimcore.stickers.remote.model.StickerPacksResponse$SavedSticker, kotlin.coroutines.Continuation<? super kotlin.Unit>):java.lang.Object] */
    public static final /* synthetic */ StickersDao AEQbTJ(sRK srk) {
        return srk.EZpvd();
    }

    public final StickersDao EZpvd() {
        return this.copydefault.AhwBna().isConnected();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v42, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v56, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v57, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0291: MOVE (r14 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:100:0x0291 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ad A[Catch: all -> 0x02f6, TRY_LEAVE, TryCatch #11 {all -> 0x02f6, blocks: (B:105:0x02a0, B:107:0x02ad), top: B:126:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0246 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027d A[Catch: all -> 0x0061, TryCatch #1 {all -> 0x0061, blocks: (B:17:0x005a, B:88:0x0270, B:89:0x0273, B:92:0x0277, B:94:0x027d, B:96:0x0289, B:97:0x028c, B:98:0x028d, B:99:0x0290), top: B:123:0x0029 }] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x02d5 -> B:113:0x02ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x02df -> B:112:0x02e5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.util.List<StickerPacksResponse.SavedSticker> list, @NotNull java.util.List<StickerPacksResponse.StickerPack> list2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        StickersRepository$saveStickers$1 stickersRepository$saveStickers$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        Ref.ObjectRef objectRef;
        sRK srk;
        int i;
        int i2;
        java.util.Set set;
        StickersRepository$saveStickers$1 stickersRepository$saveStickers$12;
        java.util.List<StickerEntity> list3;
        BaseDao baseDao2;
        Ref.LongRef longRef3;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        java.util.List<StickerEntity> list4;
        BaseDao baseDao3;
        int i3;
        java.util.Set set2;
        Ref.ObjectRef objectRef2;
        sRK srk2;
        int i4;
        ?? r0;
        BaseDao baseDao4;
        int i5;
        java.util.List<StickerEntity> list5;
        sRK srk3;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        int i6;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef3;
        int i7;
        long j;
        Ref.ObjectRef objectRef4;
        T t;
        java.util.Set<C44491sRu> setOqFWZa;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        if (continuation instanceof StickersRepository$saveStickers$1) {
            stickersRepository$saveStickers$1 = (StickersRepository$saveStickers$1) continuation;
            int i8 = stickersRepository$saveStickers$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                stickersRepository$saveStickers$1.label = i8 - Integer.MIN_VALUE;
            } else {
                stickersRepository$saveStickers$1 = new StickersRepository$saveStickers$1(this, continuation);
            }
        }
        java.lang.Object obj = stickersRepository$saveStickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i9 = stickersRepository$saveStickers$1.label;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    long j2 = stickersRepository$saveStickers$1.J$0;
                    int i10 = stickersRepository$saveStickers$1.I$2;
                    i5 = stickersRepository$saveStickers$1.I$1;
                    i3 = stickersRepository$saveStickers$1.I$0;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) stickersRepository$saveStickers$1.L$8;
                    Ref.LongRef longRef5 = (Ref.LongRef) stickersRepository$saveStickers$1.L$7;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) stickersRepository$saveStickers$1.L$6;
                    Ref.ObjectRef objectRef7 = (Ref.ObjectRef) stickersRepository$saveStickers$1.L$5;
                    longRef3 = (Ref.LongRef) stickersRepository$saveStickers$1.L$4;
                    baseDao2 = (BaseDao) stickersRepository$saveStickers$1.L$3;
                    java.util.Set set3 = (java.util.Set) stickersRepository$saveStickers$1.L$2;
                    java.util.List<StickerEntity> list6 = (java.util.List) stickersRepository$saveStickers$1.L$1;
                    srk3 = (sRK) stickersRepository$saveStickers$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        list5 = list6;
                        i6 = i5;
                        objectRef4 = objectRef6;
                        longRef4 = longRef5;
                        objectRef3 = objectRef5;
                        i7 = i3;
                        j = j2;
                        baseDao4 = baseDao2;
                        set2 = set3;
                        objectRef2 = objectRef7;
                        i = i10;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        baseDao4 = baseDao2;
                        set2 = set3;
                        objectRef2 = objectRef7;
                        i = i10;
                        list5 = list6;
                        sQLiteDatabaseLockedException = e3;
                        list4 = list5;
                        longRef2 = longRef3;
                        i4 = i5;
                        baseDao3 = baseDao4;
                        srk2 = srk3;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i < i3 - 1) {
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
                        longRef2 = longRef3;
                        baseDao = baseDao2;
                        C44159sFm.EZpvd(baseDao, longRef2.element);
                        throw th;
                    }
                    objectRef3.element = t;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao4, longRef3.element);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (r0.hasNext()) {
                    }
                    setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
                    stickersRepository$saveStickers$1.L$0 = null;
                    stickersRepository$saveStickers$1.L$1 = null;
                    stickersRepository$saveStickers$1.L$2 = null;
                    stickersRepository$saveStickers$1.L$3 = null;
                    stickersRepository$saveStickers$1.L$4 = null;
                    stickersRepository$saveStickers$1.L$5 = null;
                    stickersRepository$saveStickers$1.L$6 = null;
                    stickersRepository$saveStickers$1.L$7 = null;
                    stickersRepository$saveStickers$1.L$8 = null;
                    stickersRepository$saveStickers$1.label = 3;
                    if (srk3.KWHzl(setOqFWZa, list5, stickersRepository$saveStickers$1) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                if (i9 != 2) {
                    if (i9 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                i4 = stickersRepository$saveStickers$1.I$1;
                int i11 = stickersRepository$saveStickers$1.I$0;
                Ref.ObjectRef objectRef8 = (Ref.ObjectRef) stickersRepository$saveStickers$1.L$5;
                Ref.LongRef longRef6 = (Ref.LongRef) stickersRepository$saveStickers$1.L$4;
                baseDao3 = (BaseDao) stickersRepository$saveStickers$1.L$3;
                java.util.Set set4 = (java.util.Set) stickersRepository$saveStickers$1.L$2;
                list4 = (java.util.List) stickersRepository$saveStickers$1.L$1;
                srk2 = (sRK) stickersRepository$saveStickers$1.L$0;
                C56391yDq.AEQbTJ(obj);
                StickersRepository$saveStickers$1 stickersRepository$saveStickers$13 = stickersRepository$saveStickers$1;
                srk = srk2;
                objectRef2 = objectRef8;
                list3 = list4;
                int i12 = 1;
                int i13 = i4;
                set = set4;
                longRef2 = longRef6;
                i3 = i11;
                stickersRepository$saveStickers$12 = stickersRepository$saveStickers$13;
                i = i13 + i12;
                objectRef = objectRef2;
                i2 = i3;
                baseDao = baseDao3;
                if (i >= i2) {
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
                            C44159sFm.EZpvd(baseDao, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        sQLiteDatabaseLockedException2 = e8;
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        try {
                            sQLiteDatabaseLockedException2 = e9;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i < i3 - 1) {
                                stickersRepository$saveStickers$1.L$0 = srk2;
                                stickersRepository$saveStickers$1.L$1 = list4;
                                stickersRepository$saveStickers$1.L$2 = set2;
                                stickersRepository$saveStickers$1.L$3 = baseDao3;
                                stickersRepository$saveStickers$1.L$4 = longRef2;
                                stickersRepository$saveStickers$1.L$5 = objectRef2;
                                stickersRepository$saveStickers$1.L$6 = null;
                                stickersRepository$saveStickers$1.L$7 = null;
                                stickersRepository$saveStickers$1.L$8 = null;
                                stickersRepository$saveStickers$1.I$0 = i3;
                                stickersRepository$saveStickers$1.I$1 = i4;
                                stickersRepository$saveStickers$1.label = 2;
                                if (DelayKt.delay(((long) (i + 1)) * 50, stickersRepository$saveStickers$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                stickersRepository$saveStickers$13 = stickersRepository$saveStickers$1;
                                list3 = list4;
                                i12 = 1;
                                sRK srk4 = srk2;
                                i13 = i4;
                                set = set2;
                                srk = srk4;
                                stickersRepository$saveStickers$12 = stickersRepository$saveStickers$13;
                                i = i13 + i12;
                                objectRef = objectRef2;
                                i2 = i3;
                                baseDao = baseDao3;
                                if (i >= i2) {
                                }
                            } else {
                                objectRef8 = objectRef2;
                                i11 = i3;
                                longRef6 = longRef2;
                                set4 = set2;
                                StickersRepository$saveStickers$1 stickersRepository$saveStickers$132 = stickersRepository$saveStickers$1;
                                srk = srk2;
                                objectRef2 = objectRef8;
                                list3 = list4;
                                int i122 = 1;
                                int i132 = i4;
                                set = set4;
                                longRef2 = longRef6;
                                i3 = i11;
                                stickersRepository$saveStickers$12 = stickersRepository$saveStickers$132;
                                i = i132 + i122;
                                objectRef = objectRef2;
                                i2 = i3;
                                baseDao = baseDao3;
                                if (i >= i2) {
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            baseDao = baseDao3;
                            C44159sFm.EZpvd(baseDao, longRef2.element);
                            throw th;
                        }
                        list4 = list3;
                        stickersRepository$saveStickers$1 = stickersRepository$saveStickers$12;
                        baseDao3 = baseDao;
                        i3 = i2;
                        objectRef2 = objectRef;
                        srk2 = srk;
                        set2 = set;
                        i4 = i;
                        r0 = sQLiteDatabaseLockedException2;
                    }
                    Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                    long jNanoTime = java.lang.System.nanoTime();
                    StickersDao stickersDaoEZpvd = srk.EZpvd();
                    stickersRepository$saveStickers$12.L$0 = srk;
                    stickersRepository$saveStickers$12.L$1 = list3;
                    stickersRepository$saveStickers$12.L$2 = set;
                    stickersRepository$saveStickers$12.L$3 = baseDao;
                    stickersRepository$saveStickers$12.L$4 = longRef2;
                    stickersRepository$saveStickers$12.L$5 = objectRef;
                    stickersRepository$saveStickers$12.L$6 = objectRef9;
                    stickersRepository$saveStickers$12.L$7 = longRef2;
                    stickersRepository$saveStickers$12.L$8 = objectRef9;
                    stickersRepository$saveStickers$12.I$0 = i2;
                    stickersRepository$saveStickers$12.I$1 = i;
                    stickersRepository$saveStickers$12.I$2 = i;
                    stickersRepository$saveStickers$12.J$0 = jNanoTime;
                    stickersRepository$saveStickers$12.label = 1;
                    java.lang.Object allIds = stickersDaoEZpvd.getAllIds(stickersRepository$saveStickers$12);
                    if (allIds == objCopydefault) {
                        return objCopydefault;
                    }
                    i6 = i;
                    j = jNanoTime;
                    longRef4 = longRef2;
                    baseDao4 = baseDao;
                    longRef3 = longRef4;
                    objectRef3 = objectRef9;
                    i7 = i2;
                    objectRef2 = objectRef;
                    objectRef4 = objectRef3;
                    java.util.Set set5 = set;
                    list5 = list3;
                    stickersRepository$saveStickers$1 = stickersRepository$saveStickers$12;
                    srk3 = srk;
                    set2 = set5;
                    t = allIds;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        i5 = i6;
                        i3 = i7;
                        sQLiteDatabaseLockedException = e10;
                        list4 = list5;
                        longRef2 = longRef3;
                        i4 = i5;
                        baseDao3 = baseDao4;
                        srk2 = srk3;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i < i3 - 1) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        baseDao2 = baseDao4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        baseDao2 = baseDao4;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        baseDao2 = baseDao4;
                        longRef2 = longRef3;
                        baseDao = baseDao2;
                        C44159sFm.EZpvd(baseDao, longRef2.element);
                        throw th;
                    }
                    objectRef3.element = t;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t22 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao4, longRef3.element);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : (java.lang.Iterable) t22) {
                        if (!set2.contains((C44491sRu) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
                    stickersRepository$saveStickers$1.L$0 = null;
                    stickersRepository$saveStickers$1.L$1 = null;
                    stickersRepository$saveStickers$1.L$2 = null;
                    stickersRepository$saveStickers$1.L$3 = null;
                    stickersRepository$saveStickers$1.L$4 = null;
                    stickersRepository$saveStickers$1.L$5 = null;
                    stickersRepository$saveStickers$1.L$6 = null;
                    stickersRepository$saveStickers$1.L$7 = null;
                    stickersRepository$saveStickers$1.L$8 = null;
                    stickersRepository$saveStickers$1.label = 3;
                    if (srk3.KWHzl(setOqFWZa, list5, stickersRepository$saveStickers$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C44159sFm.EZpvd(baseDao, longRef2.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i2 + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new TaskDescription());
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            int i14 = 0;
            for (java.lang.Object obj3 : listEZpvd) {
                if (i14 < 0) {
                    yDY.AYXKKw();
                }
                StickerPacksResponse.SavedSticker savedSticker = (StickerPacksResponse.SavedSticker) obj3;
                arrayList3.add(new StickerEntity(savedSticker.KWHzl(), StickerPackEntity.CUSTOM_PACK_ID, i14, savedSticker.EZpvd()));
                i14++;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            for (StickerPacksResponse.StickerPack stickerPack : list2) {
                java.util.List<StickerPacksResponse.BaseSticker> listAYXKKw = stickerPack.AYXKKw();
                java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
                for (StickerPacksResponse.BaseSticker baseSticker : listAYXKKw) {
                    arrayList5.add(new StickerEntity(baseSticker.copydefault(), stickerPack.copydefault(), baseSticker.EZpvd(), baseSticker.OLrzqt()));
                }
                arrayList4.add(arrayList5);
            }
            java.util.List<StickerEntity> listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList3, (java.lang.Iterable) C56403yEb.QOLQEE(arrayList4));
            java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
            for (StickerEntity stickerEntity : listDjBIcL) {
                arrayList6.add(new C44491sRu(stickerEntity.getPackId(), stickerEntity.getStickerId()));
            }
            java.util.Set setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(arrayList6);
            StickersDao stickersDaoEZpvd2 = EZpvd();
            Ref.LongRef longRef7 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            srk = this;
            longRef2 = longRef7;
            i = 0;
            i2 = 3;
            baseDao = stickersDaoEZpvd2;
            set = setOqFWZa2;
            stickersRepository$saveStickers$12 = stickersRepository$saveStickers$1;
            list3 = listDjBIcL;
            if (i >= i2) {
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            longRef2 = longRef;
        }
    }

    /* JADX DEBUG: Duplicate block (B:325:0x0953) to fix multi-entry loop: BACK_EDGE: B:325:0x0953 -> B:51:0x02f6 */
    /* JADX DEBUG: Duplicate block (B:383:0x0a81) to fix multi-entry loop: BACK_EDGE: B:383:0x0a81 -> B:384:0x0a8a */
    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final java.lang.Object copydefault(@org.jetbrains.annotations.NotNull com.okinc.okimcore.stickers.remote.model.StickerPacksResponse.SavedSticker r62, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r63) {
        /*
            r61 = this;
            r1 = r63
            boolean r2 = r1 instanceof com.okinc.okimcore.stickers.local.StickersRepository$addSticker$1
            if (r2 == 0) goto L17
            r2 = r1
            com.okinc.okimcore.stickers.local.StickersRepository$addSticker$1 r2 = (com.okinc.okimcore.stickers.local.StickersRepository$addSticker$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 + r4
            r2.label = r3
            r3 = r61
            goto L1e
        L17:
            com.okinc.okimcore.stickers.local.StickersRepository$addSticker$1 r2 = new com.okinc.okimcore.stickers.local.StickersRepository$addSticker$1
            r3 = r61
            r2.<init>(r3, r1)
        L1e:
            java.lang.Object r1 = r2.result
            java.lang.Object r4 = o.C56437yFi.OLrzqt()
            int r5 = r2.label
            r8 = 4
            r9 = 2
            r10 = 3
            java.lang.String r12 = "Database Operation failed after "
            java.lang.String r13 = " attempts"
            r14 = 1
            java.lang.String r15 = "not open"
            if (r5 == 0) goto L294
            if (r5 == r14) goto L172
            if (r5 == r9) goto Le0
            if (r5 == r10) goto L6c
            if (r5 != r8) goto L64
            int r5 = r2.I$1
            int r7 = r2.I$0
            java.lang.Object r8 = r2.L$4
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            java.lang.Object r9 = r2.L$3
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref.LongRef) r9
            java.lang.Object r11 = r2.L$2
            com.okinc.okimcore.common.database.BaseDao r11 = (com.okinc.okimcore.common.database.BaseDao) r11
            java.lang.Object r10 = r2.L$1
            com.okinc.okimcore.stickers.remote.model.StickerPacksResponse$SavedSticker r10 = (com.okinc.okimcore.stickers.remote.model.StickerPacksResponse.SavedSticker) r10
            java.lang.Object r6 = r2.L$0
            o.sRK r6 = (o.sRK) r6
            o.C56391yDq.AEQbTJ(r1)     // Catch: java.lang.Throwable -> La03
            r3 = r4
            r4 = r10
            r18 = r14
            r1 = 4
            r10 = 0
            r16 = 50
            r51 = r7
            r7 = r6
            r6 = r51
            goto La8a
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L6c:
            long r5 = r2.J$0
            int r7 = r2.I$2
            int r8 = r2.I$1
            int r9 = r2.I$0
            java.lang.Object r10 = r2.L$7
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref.ObjectRef) r10
            java.lang.Object r11 = r2.L$6
            kotlin.jvm.internal.Ref$LongRef r11 = (kotlin.jvm.internal.Ref.LongRef) r11
            java.lang.Object r14 = r2.L$5
            kotlin.jvm.internal.Ref$ObjectRef r14 = (kotlin.jvm.internal.Ref.ObjectRef) r14
            java.lang.Object r3 = r2.L$4
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            r62 = r3
            java.lang.Object r3 = r2.L$3
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            r20 = r3
            java.lang.Object r3 = r2.L$2
            com.okinc.okimcore.common.database.BaseDao r3 = (com.okinc.okimcore.common.database.BaseDao) r3
            r21 = r3
            java.lang.Object r3 = r2.L$1
            com.okinc.okimcore.stickers.remote.model.StickerPacksResponse$SavedSticker r3 = (com.okinc.okimcore.stickers.remote.model.StickerPacksResponse.SavedSticker) r3
            r22 = r3
            java.lang.Object r3 = r2.L$0
            o.sRK r3 = (o.sRK) r3
            o.C56391yDq.AEQbTJ(r1)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc0 java.lang.IllegalStateException -> Lc8 android.database.sqlite.SQLiteDatabaseLockedException -> Ld0
            r1 = r10
            r34 = r15
            r15 = r20
            r20 = r4
            r4 = r22
            r51 = r5
            r5 = r62
            r62 = r2
            r6 = r11
            r2 = r14
            r14 = r21
            r21 = r3
            r10 = r51
            goto L43e
        Lb8:
            r0 = move-exception
            r1 = r0
            r15 = r20
            r3 = r21
            goto La98
        Lc0:
            r0 = move-exception
            r1 = r0
            r9 = r20
            r11 = r21
            goto La09
        Lc8:
            r0 = move-exception
            r1 = r0
            r9 = r20
            r11 = r21
            goto La0d
        Ld0:
            r0 = move-exception
            r5 = r62
            r1 = r0
            r34 = r15
            r15 = r20
            r14 = r21
            r20 = r4
            r4 = r22
            goto L476
        Le0:
            int r3 = r2.I$4
            int r5 = r2.I$3
            long r6 = r2.J$0
            int r8 = r2.I$2
            int r9 = r2.I$1
            int r10 = r2.I$0
            java.lang.Object r11 = r2.L$13
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref.ObjectRef) r11
            java.lang.Object r14 = r2.L$12
            kotlin.jvm.internal.Ref$LongRef r14 = (kotlin.jvm.internal.Ref.LongRef) r14
            r20 = r3
            java.lang.Object r3 = r2.L$11
            com.okinc.okimcore.stickers.local.StickersDao r3 = (com.okinc.okimcore.stickers.local.StickersDao) r3
            r62 = r3
            java.lang.Object r3 = r2.L$10
            com.okinc.okimcore.common.database.BaseDao r3 = (com.okinc.okimcore.common.database.BaseDao) r3
            r21 = r3
            java.lang.Object r3 = r2.L$9
            java.lang.String r3 = (java.lang.String) r3
            r22 = r3
            java.lang.Object r3 = r2.L$8
            java.lang.String r3 = (java.lang.String) r3
            r23 = r3
            java.lang.Object r3 = r2.L$7
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            r24 = r3
            java.lang.Object r3 = r2.L$6
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            r25 = r3
            java.lang.Object r3 = r2.L$5
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            r26 = r3
            java.lang.Object r3 = r2.L$4
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            r27 = r3
            java.lang.Object r3 = r2.L$3
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            r28 = r3
            java.lang.Object r3 = r2.L$2
            com.okinc.okimcore.common.database.BaseDao r3 = (com.okinc.okimcore.common.database.BaseDao) r3
            r29 = r3
            java.lang.Object r3 = r2.L$1
            com.okinc.okimcore.stickers.remote.model.StickerPacksResponse$SavedSticker r3 = (com.okinc.okimcore.stickers.remote.model.StickerPacksResponse.SavedSticker) r3
            r30 = r3
            java.lang.Object r3 = r2.L$0
            o.sRK r3 = (o.sRK) r3
            o.C56391yDq.AEQbTJ(r1)     // Catch: java.lang.Throwable -> L15d
            r1 = r9
            r43 = r13
            r34 = r15
            r15 = r23
            r13 = r28
            r9 = r3
            r3 = r4
            r4 = r11
            r11 = r25
            r25 = r14
            r14 = r29
            r29 = r30
            r30 = r8
            r8 = r24
            r24 = r22
            r22 = r62
            goto L8ac
        L15d:
            r0 = move-exception
            r5 = r0
            r43 = r13
            r1 = r21
            r11 = r29
            r13 = r9
            r9 = r28
            r28 = r27
            r51 = r14
            r14 = r3
            r3 = r4
            r4 = r51
            goto L970
        L172:
            long r5 = r2.J$1
            int r3 = r2.I$5
            int r7 = r2.I$4
            int r8 = r2.I$3
            long r9 = r2.J$0
            int r11 = r2.I$2
            int r14 = r2.I$1
            r20 = r3
            int r3 = r2.I$0
            r21 = r3
            java.lang.Object r3 = r2.L$16
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            r62 = r3
            java.lang.Object r3 = r2.L$15
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            r22 = r3
            java.lang.Object r3 = r2.L$14
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            r23 = r3
            java.lang.Object r3 = r2.L$13
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            r24 = r3
            java.lang.Object r3 = r2.L$12
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            r25 = r3
            java.lang.Object r3 = r2.L$11
            com.okinc.okimcore.stickers.local.StickersDao r3 = (com.okinc.okimcore.stickers.local.StickersDao) r3
            r26 = r3
            java.lang.Object r3 = r2.L$10
            com.okinc.okimcore.common.database.BaseDao r3 = (com.okinc.okimcore.common.database.BaseDao) r3
            r27 = r3
            java.lang.Object r3 = r2.L$9
            java.lang.String r3 = (java.lang.String) r3
            r28 = r3
            java.lang.Object r3 = r2.L$8
            java.lang.String r3 = (java.lang.String) r3
            r29 = r3
            java.lang.Object r3 = r2.L$7
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            r30 = r3
            java.lang.Object r3 = r2.L$6
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            r31 = r3
            java.lang.Object r3 = r2.L$5
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            r32 = r3
            java.lang.Object r3 = r2.L$4
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            r33 = r3
            java.lang.Object r3 = r2.L$3
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            r34 = r3
            java.lang.Object r3 = r2.L$2
            com.okinc.okimcore.common.database.BaseDao r3 = (com.okinc.okimcore.common.database.BaseDao) r3
            r35 = r3
            java.lang.Object r3 = r2.L$1
            com.okinc.okimcore.stickers.remote.model.StickerPacksResponse$SavedSticker r3 = (com.okinc.okimcore.stickers.remote.model.StickerPacksResponse.SavedSticker) r3
            r36 = r3
            java.lang.Object r3 = r2.L$0
            o.sRK r3 = (o.sRK) r3
            o.C56391yDq.AEQbTJ(r1)     // Catch: java.lang.Throwable -> L237 java.lang.Exception -> L24f java.lang.IllegalStateException -> L261 android.database.sqlite.SQLiteDatabaseLockedException -> L27a
            r42 = r12
            r43 = r13
            r12 = r33
            r13 = r36
            r33 = r21
            r51 = r3
            r3 = r62
            r62 = r24
            r24 = r26
            r26 = r4
            r4 = r30
            r30 = r14
            r14 = r35
            r52 = r32
            r32 = r51
            r53 = r23
            r23 = r7
            r7 = r52
            r54 = r25
            r25 = r8
            r8 = r53
            r55 = r29
            r29 = r11
            r11 = r54
            r56 = r34
            r34 = r15
            r15 = r56
            r57 = r5
            r5 = r22
            r21 = r57
            r6 = r31
            r31 = r28
            r59 = r9
            r10 = r27
            r27 = r59
            r9 = r55
            goto L3a4
        L237:
            r0 = move-exception
            r5 = r0
            r8 = r11
            r43 = r13
            r13 = r14
            r10 = r21
            r1 = r27
            r28 = r33
            r9 = r34
            r11 = r35
            r30 = r36
            r14 = r3
            r3 = r4
            r4 = r25
            goto L970
        L24f:
            r0 = move-exception
            r5 = r0
            r43 = r13
            r29 = r14
            r28 = r33
            r13 = r34
            r30 = r36
            r14 = r3
            r3 = r4
            r4 = r25
            goto L774
        L261:
            r0 = move-exception
            r5 = r0
            r42 = r12
            r43 = r13
            r29 = r14
            r12 = r21
            r28 = r33
            r13 = r34
            r14 = r35
            r30 = r36
            r21 = r3
            r3 = r4
            r4 = r25
            goto L786
        L27a:
            r0 = move-exception
            r1 = r0
            r43 = r13
            r22 = r15
            r6 = r24
            r15 = r29
            r13 = r34
            r29 = r14
            r14 = r3
            r3 = r4
            r4 = r25
            r25 = r31
            r31 = r30
            r30 = r36
            goto L7f7
        L294:
            o.C56391yDq.AEQbTJ(r1)
            com.okinc.okimcore.stickers.local.StickersDao r1 = r61.EZpvd()
            kotlin.jvm.internal.Ref$LongRef r3 = new kotlin.jvm.internal.Ref$LongRef
            r3.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            r7 = r61
            r11 = r1
            r9 = r3
            r3 = 0
            r6 = 3
            r1 = r62
        L2ad:
            if (r3 >= r6) goto La9e
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.IllegalStateException -> L976 java.lang.Throwable -> La03 java.lang.Exception -> La07 android.database.sqlite.SQLiteDatabaseLockedException -> La25
            r8.<init>()     // Catch: java.lang.IllegalStateException -> L976 android.database.sqlite.SQLiteDatabaseLockedException -> L9f8 java.lang.Throwable -> La03 java.lang.Exception -> La07
            long r20 = java.lang.System.nanoTime()     // Catch: java.lang.IllegalStateException -> L976 android.database.sqlite.SQLiteDatabaseLockedException -> L9f8 java.lang.Throwable -> La03 java.lang.Exception -> La07
            com.okinc.okimcore.stickers.local.StickersDao r10 = AEQbTJ(r7)     // Catch: java.lang.IllegalStateException -> L976 android.database.sqlite.SQLiteDatabaseLockedException -> L9f8 java.lang.Throwable -> La03 java.lang.Exception -> La07
            java.lang.String r14 = r1.KWHzl()     // Catch: java.lang.IllegalStateException -> L976 android.database.sqlite.SQLiteDatabaseLockedException -> L9f8 java.lang.Throwable -> La03 java.lang.Exception -> La07
            java.lang.String r22 = r1.EZpvd()     // Catch: java.lang.IllegalStateException -> L976 android.database.sqlite.SQLiteDatabaseLockedException -> L9f8 java.lang.Throwable -> La03 java.lang.Exception -> La07
            com.okinc.okimcore.stickers.local.StickersDao r23 = AEQbTJ(r7)     // Catch: java.lang.IllegalStateException -> L976 android.database.sqlite.SQLiteDatabaseLockedException -> L9f8 java.lang.Throwable -> La03 java.lang.Exception -> La07
            kotlin.jvm.internal.Ref$LongRef r24 = new kotlin.jvm.internal.Ref$LongRef     // Catch: java.lang.IllegalStateException -> L976 android.database.sqlite.SQLiteDatabaseLockedException -> L9f8 java.lang.Throwable -> La03 java.lang.Exception -> La07
            r24.<init>()     // Catch: java.lang.IllegalStateException -> L976 android.database.sqlite.SQLiteDatabaseLockedException -> L9f8 java.lang.Throwable -> La03 java.lang.Exception -> La07
            kotlin.jvm.internal.Ref$ObjectRef r25 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.IllegalStateException -> L976 android.database.sqlite.SQLiteDatabaseLockedException -> L9f8 java.lang.Throwable -> La03 java.lang.Exception -> La07
            r25.<init>()     // Catch: java.lang.IllegalStateException -> L976 android.database.sqlite.SQLiteDatabaseLockedException -> L9f8 java.lang.Throwable -> La03 java.lang.Exception -> La07
            r37 = r3
            r38 = r37
            r41 = r6
            r42 = r12
            r43 = r13
            r39 = r20
            r44 = r24
            r21 = r25
            r3 = 0
            r20 = r4
            r6 = r5
            r12 = r8
            r4 = r9
            r13 = r4
            r5 = 3
            r9 = r1
            r1 = r23
            r51 = r14
            r14 = r7
            r7 = r22
            r22 = r15
            r15 = r51
        L2f6:
            if (r3 >= r5) goto L98c
            r23 = r3
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7 android.database.sqlite.SQLiteDatabaseLockedException -> L7c6
            r3.<init>()     // Catch: java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7 android.database.sqlite.SQLiteDatabaseLockedException -> L722
            r24 = r7
            r25 = r8
            long r7 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7 android.database.sqlite.SQLiteDatabaseLockedException -> L70c
            r26 = r7
            com.okinc.okimcore.stickers.local.StickersDao r7 = AEQbTJ(r14)     // Catch: java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7 android.database.sqlite.SQLiteDatabaseLockedException -> L70c
            r2.L$0 = r14     // Catch: java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7 android.database.sqlite.SQLiteDatabaseLockedException -> L70c
            r2.L$1 = r9     // Catch: java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7 android.database.sqlite.SQLiteDatabaseLockedException -> L70c
            r2.L$2 = r11     // Catch: java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7 android.database.sqlite.SQLiteDatabaseLockedException -> L70c
            r2.L$3 = r13     // Catch: java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7 android.database.sqlite.SQLiteDatabaseLockedException -> L70c
            r2.L$4 = r6     // Catch: java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7 android.database.sqlite.SQLiteDatabaseLockedException -> L70c
            r2.L$5 = r12     // Catch: java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7 android.database.sqlite.SQLiteDatabaseLockedException -> L70c
            r2.L$6 = r4     // Catch: java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7 android.database.sqlite.SQLiteDatabaseLockedException -> L70c
            r8 = r25
            r2.L$7 = r8     // Catch: java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7 android.database.sqlite.SQLiteDatabaseLockedException -> L708
            r2.L$8 = r15     // Catch: java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7 android.database.sqlite.SQLiteDatabaseLockedException -> L708
            r25 = r4
            r4 = r24
            r2.L$9 = r4     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L6bc java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7
            r2.L$10 = r1     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L6bc java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7
            r2.L$11 = r10     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L6bc java.lang.Throwable -> L6d5 java.lang.Exception -> L6e6 java.lang.IllegalStateException -> L6f7
            r24 = r4
            r4 = r44
            r2.L$12 = r4     // Catch: java.lang.Throwable -> L6a4 java.lang.Exception -> L6a8 java.lang.IllegalStateException -> L6ac android.database.sqlite.SQLiteDatabaseLockedException -> L6b0
            r28 = r6
            r6 = r21
            r2.L$13 = r6     // Catch: java.lang.Throwable -> L66c java.lang.Exception -> L679 java.lang.IllegalStateException -> L686 android.database.sqlite.SQLiteDatabaseLockedException -> L693
            r2.L$14 = r3     // Catch: java.lang.Throwable -> L66c java.lang.Exception -> L679 java.lang.IllegalStateException -> L686 android.database.sqlite.SQLiteDatabaseLockedException -> L693
            r2.L$15 = r4     // Catch: java.lang.Throwable -> L66c java.lang.Exception -> L679 java.lang.IllegalStateException -> L686 android.database.sqlite.SQLiteDatabaseLockedException -> L693
            r2.L$16 = r3     // Catch: java.lang.Throwable -> L66c java.lang.Exception -> L679 java.lang.IllegalStateException -> L686 android.database.sqlite.SQLiteDatabaseLockedException -> L693
            r62 = r3
            r3 = r41
            r2.I$0 = r3     // Catch: java.lang.Throwable -> L63a java.lang.Exception -> L646 java.lang.IllegalStateException -> L652 android.database.sqlite.SQLiteDatabaseLockedException -> L65e
            r21 = r3
            r3 = r38
            r2.I$1 = r3     // Catch: java.lang.Throwable -> L610 java.lang.Exception -> L61a java.lang.IllegalStateException -> L624 android.database.sqlite.SQLiteDatabaseLockedException -> L62e
            r29 = r3
            r3 = r37
            r2.I$2 = r3     // Catch: java.lang.Throwable -> L5e9 java.lang.Exception -> L5f2 java.lang.IllegalStateException -> L5fb android.database.sqlite.SQLiteDatabaseLockedException -> L604
            r31 = r8
            r30 = r9
            r8 = r39
            r2.J$0 = r8     // Catch: java.lang.Throwable -> L5d9 java.lang.Exception -> L5dd java.lang.IllegalStateException -> L5e1 android.database.sqlite.SQLiteDatabaseLockedException -> L5e5
            r2.I$3 = r5     // Catch: java.lang.Throwable -> L5d9 java.lang.Exception -> L5dd java.lang.IllegalStateException -> L5e1 android.database.sqlite.SQLiteDatabaseLockedException -> L5e5
            r32 = r3
            r3 = r23
            r2.I$4 = r3     // Catch: java.lang.Throwable -> L5c7 java.lang.Exception -> L5cb java.lang.IllegalStateException -> L5cf android.database.sqlite.SQLiteDatabaseLockedException -> L5d3
            r2.I$5 = r3     // Catch: java.lang.Throwable -> L5c7 java.lang.Exception -> L5cb java.lang.IllegalStateException -> L5cf android.database.sqlite.SQLiteDatabaseLockedException -> L5d3
            r33 = r8
            r8 = r26
            r2.J$1 = r8     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L5c3 java.lang.Throwable -> L5c7 java.lang.Exception -> L5cb java.lang.IllegalStateException -> L5cf
            r23 = r3
            r3 = 1
            r2.label = r3     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L5bd java.lang.Throwable -> L5c7 java.lang.Exception -> L5cb java.lang.IllegalStateException -> L5cf
            java.lang.String r3 = "custom_pack"
            java.lang.Object r3 = r7.getLastPosition(r3, r2)     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L5bd java.lang.Throwable -> L5c7 java.lang.Exception -> L5cb java.lang.IllegalStateException -> L5cf
            r7 = r20
            if (r3 != r7) goto L377
            return r7
        L377:
            r26 = r7
            r7 = r12
            r20 = r23
            r12 = r28
            r27 = r33
            r33 = r21
            r34 = r22
            r21 = r8
            r9 = r15
            r8 = r62
            r15 = r13
            r13 = r30
            r30 = r29
            r29 = r32
            r32 = r14
            r14 = r11
            r11 = r4
            r62 = r6
            r6 = r25
            r25 = r5
            r5 = r11
            r4 = r31
            r31 = r24
            r24 = r10
            r10 = r1
            r1 = r3
            r3 = r8
        L3a4:
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L547 java.lang.Exception -> L560 java.lang.IllegalStateException -> L57a android.database.sqlite.SQLiteDatabaseLockedException -> L58f
            long r35 = r1.longValue()     // Catch: java.lang.Throwable -> L547 java.lang.Exception -> L560 java.lang.IllegalStateException -> L57a android.database.sqlite.SQLiteDatabaseLockedException -> L58f
            r37 = 1
            long r35 = r35 + r37
            java.lang.Long r1 = o.C56443yFo.KWHzl(r35)     // Catch: java.lang.Throwable -> L547 java.lang.Exception -> L560 java.lang.IllegalStateException -> L57a android.database.sqlite.SQLiteDatabaseLockedException -> L58f
            r3.element = r1     // Catch: java.lang.Throwable -> L547 java.lang.Exception -> L560 java.lang.IllegalStateException -> L57a android.database.sqlite.SQLiteDatabaseLockedException -> L58f
            long r35 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L547 java.lang.Exception -> L560 java.lang.IllegalStateException -> L57a android.database.sqlite.SQLiteDatabaseLockedException -> L58f
            r3 = r12
            r1 = r13
            long r12 = r35 - r21
            r21 = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L4fe java.lang.Exception -> L50e java.lang.IllegalStateException -> L51f android.database.sqlite.SQLiteDatabaseLockedException -> L530
            long r12 = o.C59519zia.AEQbTJ(r12, r1)     // Catch: java.lang.Throwable -> L4fe java.lang.Exception -> L50e java.lang.IllegalStateException -> L51f android.database.sqlite.SQLiteDatabaseLockedException -> L530
            long r12 = o.C59462zhW.valueOf(r12)     // Catch: java.lang.Throwable -> L4fe java.lang.Exception -> L50e java.lang.IllegalStateException -> L51f android.database.sqlite.SQLiteDatabaseLockedException -> L530
            r5.element = r12     // Catch: java.lang.Throwable -> L4fe java.lang.Exception -> L50e java.lang.IllegalStateException -> L51f android.database.sqlite.SQLiteDatabaseLockedException -> L530
            T r1 = r8.element     // Catch: java.lang.Throwable -> L4bf java.lang.Exception -> L4d4 java.lang.IllegalStateException -> L4e9 android.database.sqlite.SQLiteDatabaseLockedException -> L530
            long r11 = r11.element     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L4a5
            o.C44159sFm.EZpvd(r10, r11)     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L4a5
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L4a5
            long r11 = r1.longValue()     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L4a5
            com.okinc.okimcore.stickers.local.StickerEntity r1 = new com.okinc.okimcore.stickers.local.StickerEntity     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L4a5
            java.lang.String r10 = "custom_pack"
            r8 = r1
            r5 = r3
            r3 = r32
            r22 = r4
            r4 = r21
            r13 = r31
            r8.<init>(r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            java.util.List r1 = kotlin.collections.CollectionsKt.KWHzl(r1)     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$0 = r3     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$1 = r4     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$2 = r14     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$3 = r15     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$4 = r5     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$5 = r7     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$6 = r6     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r8 = r22
            r2.L$7 = r8     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r9 = 0
            r2.L$8 = r9     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$9 = r9     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$10 = r9     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$11 = r9     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$12 = r9     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$13 = r9     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$14 = r9     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$15 = r9     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r2.L$16 = r9     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L499
            r12 = r33
            r2.I$0 = r12     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L48e
            r13 = r30
            r2.I$1 = r13     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L486
            r9 = r29
            r2.I$2 = r9     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L480
            r10 = r27
            r2.J$0 = r10     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L480
            r21 = r3
            r3 = 3
            r2.label = r3     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L47e
            r3 = r24
            java.lang.Object r1 = r3.insert(r1, r2)     // Catch: java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a android.database.sqlite.SQLiteDatabaseLockedException -> L47e
            r3 = r26
            if (r1 != r3) goto L431
            return r3
        L431:
            r62 = r2
            r20 = r3
            r2 = r7
            r1 = r8
            r7 = r9
            r9 = r12
            r8 = r13
            r12 = r42
            r13 = r43
        L43e:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L45c java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a
            r1.element = r3     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L45c java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a
            long r22 = java.lang.System.nanoTime()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L45c java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a
            long r10 = r22 - r10
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L45c java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a
            long r10 = o.C59519zia.AEQbTJ(r10, r1)     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L45c java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a
            long r10 = o.C59462zhW.valueOf(r10)     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L45c java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a
            r6.element = r10     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L45c java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a
            T r1 = r2.element     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L45c java.lang.Throwable -> L45f java.lang.Exception -> L464 java.lang.IllegalStateException -> L46a
            long r1 = r15.element
            o.C44159sFm.EZpvd(r14, r1)
            return r3
        L45c:
            r0 = move-exception
            r1 = r0
            goto L472
        L45f:
            r0 = move-exception
            r1 = r0
            r3 = r14
            goto La98
        L464:
            r0 = move-exception
            r1 = r0
            r11 = r14
            r9 = r15
            goto La09
        L46a:
            r0 = move-exception
            r1 = r0
            r11 = r14
            r9 = r15
            r15 = r34
            goto La0d
        L472:
            r2 = r62
            r3 = r21
        L476:
            r6 = r3
            r11 = r5
            r5 = r8
            r3 = r20
        L47b:
            r10 = 0
            goto La39
        L47e:
            r0 = move-exception
            goto L483
        L480:
            r0 = move-exception
            r21 = r3
        L483:
            r20 = r26
            goto L497
        L486:
            r0 = move-exception
            r21 = r3
            r20 = r26
            r9 = r29
            goto L497
        L48e:
            r0 = move-exception
            r21 = r3
            r20 = r26
            r9 = r29
            r13 = r30
        L497:
            r1 = r0
            goto L4b2
        L499:
            r0 = move-exception
            r21 = r3
            r20 = r26
            r9 = r29
            r13 = r30
        L4a2:
            r12 = r33
            goto L497
        L4a5:
            r0 = move-exception
            r5 = r3
            r4 = r21
            r20 = r26
            r9 = r29
            r13 = r30
            r21 = r32
            goto L4a2
        L4b2:
            r11 = r5
            r7 = r9
            r9 = r12
            r5 = r13
            r3 = r20
            r6 = r21
            r12 = r42
            r13 = r43
            goto L47b
        L4bf:
            r0 = move-exception
            r5 = r3
            r4 = r21
            r20 = r26
            r9 = r29
            r13 = r30
            r21 = r32
            r12 = r33
            r3 = r0
            r32 = r9
            r1 = r20
            goto L54b
        L4d4:
            r0 = move-exception
            r5 = r3
            r4 = r21
            r20 = r26
            r9 = r29
            r13 = r30
            r21 = r32
            r12 = r33
            r3 = r0
            r32 = r9
            r1 = r20
            goto L564
        L4e9:
            r0 = move-exception
            r5 = r3
            r4 = r21
            r20 = r26
            r9 = r29
            r13 = r30
            r21 = r32
            r12 = r33
            r3 = r0
            r32 = r9
            r1 = r20
            goto L57e
        L4fe:
            r0 = move-exception
            r5 = r3
            r4 = r21
        L502:
            r1 = r26
            r13 = r30
            r21 = r32
            r12 = r33
            r32 = r29
            r3 = r0
            goto L54b
        L50e:
            r0 = move-exception
            r5 = r3
            r4 = r21
        L512:
            r1 = r26
            r13 = r30
            r21 = r32
            r12 = r33
            r32 = r29
            r3 = r0
            goto L564
        L51f:
            r0 = move-exception
            r5 = r3
            r4 = r21
        L523:
            r1 = r26
            r13 = r30
            r21 = r32
            r12 = r33
            r32 = r29
            r3 = r0
            goto L57e
        L530:
            r0 = move-exception
            r5 = r3
            r8 = r4
            r4 = r21
        L535:
            r3 = r24
            r1 = r26
            r26 = r27
            r13 = r30
            r21 = r32
            r12 = r33
            r32 = r29
            r22 = r0
            goto L594
        L547:
            r0 = move-exception
            r5 = r12
            r4 = r13
            goto L502
        L54b:
            r30 = r4
            r28 = r5
            r4 = r11
            r11 = r14
            r9 = r15
            r14 = r21
            r8 = r32
            r15 = r34
            r5 = r3
            r3 = r1
            r1 = r10
            r10 = r12
        L55c:
            r12 = r42
            goto L970
        L560:
            r0 = move-exception
            r5 = r12
            r4 = r13
            goto L512
        L564:
            r30 = r4
            r28 = r5
            r4 = r11
            r29 = r13
            r11 = r14
            r13 = r15
            r14 = r21
            r15 = r34
            r5 = r3
            r21 = r12
            r12 = r42
            r3 = r1
            r1 = r10
            goto L76e
        L57a:
            r0 = move-exception
            r5 = r12
            r4 = r13
            goto L523
        L57e:
            r30 = r4
            r28 = r5
            r4 = r11
            r29 = r13
            r13 = r15
            r11 = r32
            r15 = r34
            r5 = r3
            r3 = r1
            r1 = r10
            goto L784
        L58f:
            r0 = move-exception
            r8 = r4
            r5 = r12
            r4 = r13
            goto L535
        L594:
            r50 = r11
            r49 = r12
            r48 = r13
            r13 = r15
            r45 = r26
            r24 = r31
            r47 = r32
            r11 = r6
            r12 = r7
            r15 = r9
            r9 = r21
            r21 = r23
            r7 = r25
            r6 = r4
            r23 = r10
            r10 = r62
            r51 = r20
            r20 = r1
            r1 = r51
            r52 = r22
            r22 = r3
            r3 = r52
            goto L823
        L5bd:
            r0 = move-exception
        L5be:
            r3 = r20
        L5c0:
            r7 = r0
            goto L73a
        L5c3:
            r0 = move-exception
            r23 = r3
            goto L5be
        L5c7:
            r0 = move-exception
        L5c8:
            r3 = r20
            goto L5ef
        L5cb:
            r0 = move-exception
        L5cc:
            r3 = r20
            goto L5f8
        L5cf:
            r0 = move-exception
        L5d0:
            r3 = r20
            goto L601
        L5d3:
            r0 = move-exception
            r23 = r3
        L5d6:
            r33 = r8
            goto L5be
        L5d9:
            r0 = move-exception
            r32 = r3
            goto L5c8
        L5dd:
            r0 = move-exception
            r32 = r3
            goto L5cc
        L5e1:
            r0 = move-exception
            r32 = r3
            goto L5d0
        L5e5:
            r0 = move-exception
            r32 = r3
            goto L5d6
        L5e9:
            r0 = move-exception
            r32 = r3
            r30 = r9
            goto L5c8
        L5ef:
            r5 = r0
            goto L75f
        L5f2:
            r0 = move-exception
            r32 = r3
            r30 = r9
            goto L5cc
        L5f8:
            r5 = r0
            goto L76a
        L5fb:
            r0 = move-exception
            r32 = r3
            r30 = r9
            goto L5d0
        L601:
            r5 = r0
            goto L77b
        L604:
            r0 = move-exception
            r32 = r3
            r31 = r8
            r30 = r9
            r3 = r20
        L60d:
            r33 = r39
            goto L5c0
        L610:
            r0 = move-exception
            r29 = r3
            r30 = r9
            r3 = r20
            r32 = r37
            goto L5ef
        L61a:
            r0 = move-exception
            r29 = r3
            r30 = r9
            r3 = r20
            r32 = r37
            goto L5f8
        L624:
            r0 = move-exception
            r29 = r3
            r30 = r9
            r3 = r20
            r32 = r37
            goto L601
        L62e:
            r0 = move-exception
            r29 = r3
            r31 = r8
            r30 = r9
            r3 = r20
            r32 = r37
            goto L60d
        L63a:
            r0 = move-exception
            r21 = r3
            r30 = r9
            r3 = r20
            r32 = r37
            r29 = r38
            goto L5ef
        L646:
            r0 = move-exception
            r21 = r3
            r30 = r9
            r3 = r20
            r32 = r37
            r29 = r38
            goto L5f8
        L652:
            r0 = move-exception
            r21 = r3
            r30 = r9
            r3 = r20
            r32 = r37
            r29 = r38
            goto L601
        L65e:
            r0 = move-exception
            r21 = r3
            r31 = r8
            r30 = r9
            r3 = r20
            r32 = r37
            r29 = r38
            goto L60d
        L66c:
            r0 = move-exception
        L66d:
            r30 = r9
            r3 = r20
            r32 = r37
            r29 = r38
            r21 = r41
            goto L5ef
        L679:
            r0 = move-exception
        L67a:
            r30 = r9
            r3 = r20
            r32 = r37
            r29 = r38
            r21 = r41
            goto L5f8
        L686:
            r0 = move-exception
        L687:
            r30 = r9
            r3 = r20
            r32 = r37
            r29 = r38
            r21 = r41
            goto L601
        L693:
            r0 = move-exception
            r31 = r8
            r30 = r9
            r3 = r20
        L69a:
            r32 = r37
            r29 = r38
            r33 = r39
            r21 = r41
            goto L5c0
        L6a4:
            r0 = move-exception
            r28 = r6
            goto L66d
        L6a8:
            r0 = move-exception
            r28 = r6
            goto L67a
        L6ac:
            r0 = move-exception
            r28 = r6
            goto L687
        L6b0:
            r0 = move-exception
            r28 = r6
            r31 = r8
            r30 = r9
            r3 = r20
            r6 = r21
            goto L69a
        L6bc:
            r0 = move-exception
            r24 = r4
        L6bf:
            r28 = r6
            r31 = r8
            r30 = r9
            r3 = r20
            r6 = r21
            r32 = r37
            r29 = r38
            r33 = r39
            r21 = r41
        L6d1:
            r4 = r44
            goto L5c0
        L6d5:
            r0 = move-exception
            r28 = r6
            r30 = r9
            r3 = r20
            r32 = r37
            r29 = r38
            r21 = r41
            r4 = r44
            goto L5ef
        L6e6:
            r0 = move-exception
            r28 = r6
            r30 = r9
            r3 = r20
            r32 = r37
            r29 = r38
            r21 = r41
            r4 = r44
            goto L5f8
        L6f7:
            r0 = move-exception
            r28 = r6
            r30 = r9
            r3 = r20
            r32 = r37
            r29 = r38
            r21 = r41
            r4 = r44
            goto L601
        L708:
            r0 = move-exception
            r25 = r4
            goto L6bf
        L70c:
            r0 = move-exception
            r28 = r6
            r30 = r9
            r3 = r20
            r6 = r21
            r31 = r25
            r32 = r37
            r29 = r38
            r33 = r39
            r21 = r41
            r25 = r4
            goto L6d1
        L722:
            r0 = move-exception
            r25 = r4
            r28 = r6
            r24 = r7
            r31 = r8
            r30 = r9
            r3 = r20
            r6 = r21
            r32 = r37
            r29 = r38
            r33 = r39
            r21 = r41
            goto L6d1
        L73a:
            r20 = r3
            r50 = r4
            r3 = r7
            r9 = r14
            r49 = r21
            r21 = r23
            r48 = r29
            r8 = r31
            r47 = r32
            r45 = r33
            r7 = r5
            r14 = r11
            r34 = r22
            r11 = r25
            r5 = r28
            r22 = r10
            r10 = r6
            r6 = r30
            r23 = r1
            r1 = r21
            goto L823
        L75f:
            r9 = r13
            r10 = r21
            r15 = r22
            r13 = r29
            r8 = r32
            goto L55c
        L76a:
            r15 = r22
            r12 = r42
        L76e:
            r27 = r1
            r35 = r11
            r11 = r32
        L774:
            o.C44159sFm.OLrzqt(r5)     // Catch: java.lang.Throwable -> L778
            throw r5     // Catch: java.lang.Throwable -> L778
        L778:
            r0 = move-exception
            r1 = r0
            goto L7b5
        L77b:
            r12 = r21
            r15 = r22
            r21 = r14
            r14 = r11
            r11 = r32
        L784:
            r27 = r1
        L786:
            java.lang.String r1 = r5.getMessage()     // Catch: java.lang.Throwable -> L7ab
            if (r1 == 0) goto L79a
            r6 = 2
            r7 = 0
            r8 = 0
            boolean r1 = kotlin.text.StringsKt.contains$default(r1, r15, r7, r6, r8)     // Catch: java.lang.Throwable -> L79e
            r6 = 1
            if (r1 != r6) goto L79a
            o.C44159sFm.OLrzqt(r5)     // Catch: java.lang.Throwable -> L79e
            throw r5     // Catch: java.lang.Throwable -> L79e
        L79a:
            o.C44159sFm.copydefault(r5)     // Catch: java.lang.Throwable -> L79e
            throw r5     // Catch: java.lang.Throwable -> L79e
        L79e:
            r0 = move-exception
            r1 = r0
            r8 = r11
            r10 = r12
            r35 = r14
            r14 = r21
            r9 = r29
            r12 = r42
            goto L7ba
        L7ab:
            r0 = move-exception
            r1 = r0
            r35 = r14
            r14 = r21
            r21 = r12
            r12 = r42
        L7b5:
            r8 = r11
            r10 = r21
            r9 = r29
        L7ba:
            r5 = r1
            r1 = r27
            r11 = r35
            r51 = r13
            r13 = r9
            r9 = r51
            goto L970
        L7c6:
            r0 = move-exception
            r25 = r4
            r28 = r6
            r24 = r7
            r31 = r8
            r30 = r9
            r3 = r20
            r6 = r21
            r32 = r37
            r29 = r38
            r33 = r39
            r21 = r41
            r4 = r44
            r27 = r1
            r8 = r5
            r26 = r10
            r35 = r11
            r7 = r23
            r20 = r7
            r11 = r32
            r9 = r33
            r1 = r0
            r32 = r12
            r33 = r28
            r12 = r42
            r28 = r24
        L7f7:
            r50 = r4
            r45 = r9
            r47 = r11
            r42 = r12
            r9 = r14
            r49 = r21
            r34 = r22
            r11 = r25
            r22 = r26
            r23 = r27
            r24 = r28
            r48 = r29
            r12 = r32
            r5 = r33
            r14 = r35
            r10 = r6
            r21 = r7
            r7 = r8
            r6 = r30
            r8 = r31
            r51 = r3
            r3 = r1
            r1 = r20
            r20 = r51
        L823:
            T r4 = r10.element     // Catch: java.lang.Throwable -> L911
            java.lang.Exception r4 = (java.lang.Exception) r4     // Catch: java.lang.Throwable -> L911
            o.C44159sFm.copydefault(r3, r4)     // Catch: java.lang.Throwable -> L911
            r10.element = r3     // Catch: java.lang.Throwable -> L911
            int r3 = r7 + (-1)
            if (r1 >= r3) goto L925
            int r1 = r1 + 1
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L911
            r2.L$0 = r9     // Catch: java.lang.Throwable -> L911
            r2.L$1 = r6     // Catch: java.lang.Throwable -> L911
            r2.L$2 = r14     // Catch: java.lang.Throwable -> L911
            r2.L$3 = r13     // Catch: java.lang.Throwable -> L911
            r2.L$4 = r5     // Catch: java.lang.Throwable -> L911
            r2.L$5 = r12     // Catch: java.lang.Throwable -> L911
            r2.L$6 = r11     // Catch: java.lang.Throwable -> L911
            r2.L$7 = r8     // Catch: java.lang.Throwable -> L911
            r2.L$8 = r15     // Catch: java.lang.Throwable -> L911
            r1 = r24
            r2.L$9 = r1     // Catch: java.lang.Throwable -> L911
            r24 = r1
            r1 = r23
            r2.L$10 = r1     // Catch: java.lang.Throwable -> L913
            r23 = r1
            r1 = r22
            r2.L$11 = r1     // Catch: java.lang.Throwable -> L911
            r22 = r1
            r1 = r50
            r2.L$12 = r1     // Catch: java.lang.Throwable -> L90d
            r2.L$13 = r10     // Catch: java.lang.Throwable -> L90d
            r25 = r1
            r1 = 0
            r2.L$14 = r1     // Catch: java.lang.Throwable -> L8ff
            r2.L$15 = r1     // Catch: java.lang.Throwable -> L8ff
            r2.L$16 = r1     // Catch: java.lang.Throwable -> L8ff
            r1 = r49
            r2.I$0 = r1     // Catch: java.lang.Throwable -> L8ef
            r26 = r1
            r1 = r48
            r2.I$1 = r1     // Catch: java.lang.Throwable -> L8e3
            r27 = r1
            r1 = r47
            r2.I$2 = r1     // Catch: java.lang.Throwable -> L8db
            r28 = r5
            r29 = r6
            r5 = r45
            r2.J$0 = r5     // Catch: java.lang.Throwable -> L8d7
            r2.I$3 = r7     // Catch: java.lang.Throwable -> L8d1
            r30 = r1
            r1 = r21
            r2.I$4 = r1     // Catch: java.lang.Throwable -> L8cf
            r21 = r1
            r1 = 2
            r2.label = r1     // Catch: java.lang.Throwable -> L8cf
            r16 = 50
            long r3 = r3 * r16
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r3, r2)     // Catch: java.lang.Throwable -> L8cf
            r3 = r20
            if (r1 != r3) goto L898
            return r3
        L898:
            r4 = r10
            r20 = r21
            r21 = r23
            r10 = r26
            r1 = r27
            r27 = r28
            r26 = r12
            r12 = r42
            r51 = r5
            r5 = r7
            r6 = r51
        L8ac:
            r38 = r1
            r39 = r6
            r41 = r10
            r42 = r12
            r7 = r20
            r1 = r21
            r10 = r22
            r44 = r25
            r12 = r26
            r6 = r27
            r37 = r30
            r22 = r34
            r19 = 1
            r21 = r4
            r4 = r11
            r11 = r14
            r14 = r9
            r9 = r29
            goto L953
        L8cf:
            r0 = move-exception
            goto L8d4
        L8d1:
            r0 = move-exception
            r30 = r1
        L8d4:
            r3 = r20
            goto L8fc
        L8d7:
            r0 = move-exception
            r30 = r1
            goto L8d4
        L8db:
            r0 = move-exception
            r30 = r1
            r28 = r5
            r29 = r6
            goto L8d4
        L8e3:
            r0 = move-exception
            r27 = r1
            r28 = r5
            r29 = r6
            r3 = r20
            r30 = r47
            goto L8fc
        L8ef:
            r0 = move-exception
            r26 = r1
            r28 = r5
            r29 = r6
            r3 = r20
            r30 = r47
            r27 = r48
        L8fc:
            r1 = r0
            goto L95c
        L8ff:
            r0 = move-exception
        L900:
            r28 = r5
            r29 = r6
            r3 = r20
            r30 = r47
            r27 = r48
            r26 = r49
            goto L8fc
        L90d:
            r0 = move-exception
            r25 = r1
            goto L900
        L911:
            r0 = move-exception
            goto L916
        L913:
            r0 = move-exception
            r23 = r1
        L916:
            r28 = r5
            r29 = r6
            r3 = r20
            r30 = r47
            r27 = r48
            r26 = r49
            r25 = r50
            goto L8fc
        L925:
            r28 = r5
            r29 = r6
            r3 = r20
            r5 = r45
            r30 = r47
            r27 = r48
            r26 = r49
            r25 = r50
            r39 = r5
            r5 = r7
            r4 = r11
            r11 = r14
            r7 = r21
            r1 = r23
            r44 = r25
            r41 = r26
            r38 = r27
            r6 = r28
            r37 = r30
            r19 = 1
            r14 = r9
            r21 = r10
            r10 = r22
            r9 = r29
            r22 = r34
        L953:
            int r7 = r7 + 1
            r20 = r3
            r3 = r7
            r7 = r24
            goto L2f6
        L95c:
            r5 = r1
            r11 = r14
            r1 = r23
            r4 = r25
            r10 = r26
            r8 = r30
            r15 = r34
            r12 = r42
            r14 = r9
            r9 = r13
            r13 = r27
            r30 = r29
        L970:
            long r6 = r4.element     // Catch: java.lang.IllegalStateException -> L976 android.database.sqlite.SQLiteDatabaseLockedException -> L97a java.lang.Throwable -> La03 java.lang.Exception -> La07
            o.C44159sFm.EZpvd(r1, r6)     // Catch: java.lang.IllegalStateException -> L976 android.database.sqlite.SQLiteDatabaseLockedException -> L97a java.lang.Throwable -> La03 java.lang.Exception -> La07
            throw r5     // Catch: java.lang.IllegalStateException -> L976 android.database.sqlite.SQLiteDatabaseLockedException -> L97a java.lang.Throwable -> La03 java.lang.Exception -> La07
        L976:
            r0 = move-exception
            r1 = r0
            goto La0d
        L97a:
            r0 = move-exception
            r1 = r0
            r7 = r8
            r5 = r13
            r6 = r14
            r34 = r15
            r4 = r30
            r13 = r43
            r15 = r9
            r9 = r10
            r14 = r11
            r11 = r28
            goto L47b
        L98c:
            r28 = r6
            r30 = r9
            r3 = r20
            r6 = r21
            r32 = r37
            r29 = r38
            r21 = r41
            r4 = r44
            long r7 = r4.element     // Catch: java.lang.Throwable -> L9d2 java.lang.Exception -> L9d8 java.lang.IllegalStateException -> L9dc android.database.sqlite.SQLiteDatabaseLockedException -> L9e2
            o.C44159sFm.EZpvd(r1, r7)     // Catch: java.lang.Throwable -> L9d2 java.lang.Exception -> L9d8 java.lang.IllegalStateException -> L9dc android.database.sqlite.SQLiteDatabaseLockedException -> L9e2
            T r1 = r6.element     // Catch: java.lang.Throwable -> L9d2 java.lang.Exception -> L9d8 java.lang.IllegalStateException -> L9dc android.database.sqlite.SQLiteDatabaseLockedException -> L9e2
            java.lang.Exception r1 = (java.lang.Exception) r1     // Catch: java.lang.Throwable -> L9d2 java.lang.Exception -> L9d8 java.lang.IllegalStateException -> L9dc android.database.sqlite.SQLiteDatabaseLockedException -> L9e2
            if (r1 != 0) goto L9c8
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L9d2 java.lang.Exception -> L9d8 java.lang.IllegalStateException -> L9dc android.database.sqlite.SQLiteDatabaseLockedException -> L9e2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d2 java.lang.Exception -> L9d8 java.lang.IllegalStateException -> L9dc android.database.sqlite.SQLiteDatabaseLockedException -> L9e2
            r4.<init>()     // Catch: java.lang.Throwable -> L9d2 java.lang.Exception -> L9d8 java.lang.IllegalStateException -> L9dc android.database.sqlite.SQLiteDatabaseLockedException -> L9e2
            r12 = r42
            r4.append(r12)     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L9c3 java.lang.Throwable -> L9d2 java.lang.Exception -> L9d8 java.lang.IllegalStateException -> L9dc
            r4.append(r5)     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L9c3 java.lang.Throwable -> L9d2 java.lang.Exception -> L9d8 java.lang.IllegalStateException -> L9dc
            r5 = r43
            r4.append(r5)     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L9d0 java.lang.Throwable -> L9d2 java.lang.Exception -> L9d8 java.lang.IllegalStateException -> L9dc
            java.lang.String r4 = r4.toString()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L9d0 java.lang.Throwable -> L9d2 java.lang.Exception -> L9d8 java.lang.IllegalStateException -> L9dc
            r1.<init>(r4)     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L9d0 java.lang.Throwable -> L9d2 java.lang.Exception -> L9d8 java.lang.IllegalStateException -> L9dc
            goto L9cc
        L9c3:
            r0 = move-exception
        L9c4:
            r5 = r43
        L9c6:
            r1 = r0
            goto L9e6
        L9c8:
            r12 = r42
            r5 = r43
        L9cc:
            o.C44159sFm.OLrzqt(r1)     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L9d0 java.lang.Throwable -> L9d2 java.lang.Exception -> L9d8 java.lang.IllegalStateException -> L9dc
            throw r1     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L9d0 java.lang.Throwable -> L9d2 java.lang.Exception -> L9d8 java.lang.IllegalStateException -> L9dc
        L9d0:
            r0 = move-exception
            goto L9c6
        L9d2:
            r0 = move-exception
            r1 = r0
            r3 = r11
            r15 = r13
            goto La98
        L9d8:
            r0 = move-exception
            r1 = r0
            r9 = r13
            goto La09
        L9dc:
            r0 = move-exception
            r1 = r0
            r9 = r13
            r15 = r22
            goto La0d
        L9e2:
            r0 = move-exception
            r12 = r42
            goto L9c4
        L9e6:
            r15 = r13
            r6 = r14
            r9 = r21
            r34 = r22
            r4 = r30
            r7 = r32
            r10 = 0
            r13 = r5
            r14 = r11
            r11 = r28
            r5 = r29
            goto La39
        L9f8:
            r0 = move-exception
            r51 = r4
            r4 = r3
            r3 = r51
            r8 = r0
            r14 = r8
            r8 = 2
            r10 = 0
            goto La2e
        La03:
            r0 = move-exception
            r1 = r0
            goto La96
        La07:
            r0 = move-exception
            r1 = r0
        La09:
            o.C44159sFm.OLrzqt(r1)     // Catch: java.lang.Throwable -> La03
            throw r1     // Catch: java.lang.Throwable -> La03
        La0d:
            java.lang.String r2 = r1.getMessage()     // Catch: java.lang.Throwable -> La03
            if (r2 == 0) goto La21
            r3 = 0
            r8 = 2
            r10 = 0
            boolean r2 = kotlin.text.StringsKt.contains$default(r2, r15, r10, r8, r3)     // Catch: java.lang.Throwable -> La03
            r3 = 1
            if (r2 != r3) goto La21
            o.C44159sFm.OLrzqt(r1)     // Catch: java.lang.Throwable -> La03
            throw r1     // Catch: java.lang.Throwable -> La03
        La21:
            o.C44159sFm.copydefault(r1)     // Catch: java.lang.Throwable -> La03
            throw r1     // Catch: java.lang.Throwable -> La03
        La25:
            r0 = move-exception
            r8 = 2
            r10 = 0
            r51 = r4
            r4 = r3
            r3 = r51
            r14 = r0
        La2e:
            r34 = r15
            r15 = r9
            r9 = r6
            r6 = r7
            r7 = r4
            r4 = r1
            r1 = r14
            r14 = r11
            r11 = r5
            r5 = r7
        La39:
            T r8 = r11.element     // Catch: java.lang.Throwable -> La92
            java.lang.Exception r8 = (java.lang.Exception) r8     // Catch: java.lang.Throwable -> La92
            o.C44159sFm.copydefault(r1, r8)     // Catch: java.lang.Throwable -> La92
            r11.element = r1     // Catch: java.lang.Throwable -> La92
            int r1 = r9 + (-1)
            if (r7 >= r1) goto La7e
            int r7 = r7 + 1
            long r7 = (long) r7     // Catch: java.lang.Throwable -> La92
            r2.L$0 = r6     // Catch: java.lang.Throwable -> La92
            r2.L$1 = r4     // Catch: java.lang.Throwable -> La92
            r2.L$2 = r14     // Catch: java.lang.Throwable -> La92
            r2.L$3 = r15     // Catch: java.lang.Throwable -> La92
            r2.L$4 = r11     // Catch: java.lang.Throwable -> La92
            r1 = 0
            r2.L$5 = r1     // Catch: java.lang.Throwable -> La92
            r2.L$6 = r1     // Catch: java.lang.Throwable -> La92
            r2.L$7 = r1     // Catch: java.lang.Throwable -> La92
            r2.L$8 = r1     // Catch: java.lang.Throwable -> La92
            r2.L$9 = r1     // Catch: java.lang.Throwable -> La92
            r2.L$10 = r1     // Catch: java.lang.Throwable -> La92
            r2.L$11 = r1     // Catch: java.lang.Throwable -> La92
            r2.L$12 = r1     // Catch: java.lang.Throwable -> La92
            r2.L$13 = r1     // Catch: java.lang.Throwable -> La92
            r2.L$14 = r1     // Catch: java.lang.Throwable -> La92
            r2.L$15 = r1     // Catch: java.lang.Throwable -> La92
            r2.L$16 = r1     // Catch: java.lang.Throwable -> La92
            r2.I$0 = r9     // Catch: java.lang.Throwable -> La92
            r2.I$1 = r5     // Catch: java.lang.Throwable -> La92
            r1 = 4
            r2.label = r1     // Catch: java.lang.Throwable -> La92
            r16 = 50
            long r7 = r7 * r16
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r7, r2)     // Catch: java.lang.Throwable -> La92
            if (r7 != r3) goto La81
            return r3
        La7e:
            r1 = 4
            r16 = 50
        La81:
            r7 = r6
            r6 = r9
            r8 = r11
            r11 = r14
            r9 = r15
            r15 = r34
            r18 = 1
        La8a:
            int r5 = r5 + 1
            r1 = r4
            r4 = r3
            r3 = r5
            r5 = r8
            goto L2ad
        La92:
            r0 = move-exception
            r1 = r0
            r11 = r14
            r9 = r15
        La96:
            r15 = r9
            r3 = r11
        La98:
            long r4 = r15.element
            o.C44159sFm.EZpvd(r3, r4)
            throw r1
        La9e:
            long r1 = r9.element
            o.C44159sFm.EZpvd(r11, r1)
            T r1 = r5.element
            java.lang.Exception r1 = (java.lang.Exception) r1
            if (r1 != 0) goto Lac1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            r1.append(r6)
            r1.append(r13)
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            r1 = r2
        Lac1:
            o.C44159sFm.OLrzqt(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sRK.copydefault(com.okinc.okimcore.stickers.remote.model.StickerPacksResponse$SavedSticker, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Duplicate block (B:175:0x040f) to fix multi-entry loop: BACK_EDGE: B:175:0x040f -> B:176:0x0415 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:139:0x038f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0057 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:213:0x0415 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x00fd */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:85:0x02af */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x02b2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:91:0x02c3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:95:0x02c9 */
    /* JADX DEBUG: Type inference failed for r0v27. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v43. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v62. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v74. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r11v17. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r1v6. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02dc A[Catch: all -> 0x0057, TryCatch #29 {all -> 0x0057, blocks: (B:15:0x0052, B:99:0x02cf, B:100:0x02d2, B:103:0x02d6, B:105:0x02dc, B:107:0x02e6, B:108:0x02e9, B:109:0x02ea, B:110:0x02ed, B:114:0x02fc, B:116:0x0309), top: B:192:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0309 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #29 {all -> 0x0057, blocks: (B:15:0x0052, B:99:0x02cf, B:100:0x02d2, B:103:0x02d6, B:105:0x02dc, B:107:0x02e6, B:108:0x02e9, B:109:0x02ea, B:110:0x02ed, B:114:0x02fc, B:116:0x0309), top: B:192:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0339 A[PHI: r1 r3 r4 r5 r6 r8 r9 r10 r12 r13 r14
  0x0339: PHI (r1v29 com.okinc.okimcore.stickers.local.StickersRepository$addStickers$1) = 
  (r1v23 com.okinc.okimcore.stickers.local.StickersRepository$addStickers$1)
  (r1v2 com.okinc.okimcore.stickers.local.StickersRepository$addStickers$1)
 binds: [B:115:0x0307, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x0339: PHI (r3v10 java.lang.Object) = (r3v5 java.lang.Object), (r3v0 java.lang.Object) binds: [B:115:0x0307, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x0339: PHI (r4v18 int) = (r4v11 int), (r4v27 int) binds: [B:115:0x0307, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x0339: PHI (r5v26 int) = (r5v16 int), (r5v34 int) binds: [B:115:0x0307, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x0339: PHI (r6v22 kotlin.jvm.internal.Ref$ObjectRef) = (r6v15 kotlin.jvm.internal.Ref$ObjectRef), (r6v32 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:115:0x0307, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x0339: PHI (r8v32 ??) = (r8v47 ??), (r8v48 ??) binds: [B:115:0x0307, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x0339: PHI (r9v16 java.lang.String) = (r9v11 java.lang.String), (r9v0 java.lang.String) binds: [B:115:0x0307, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x0339: PHI (r10v18 ??) = (r10v33 ??), (r10v34 ??) binds: [B:115:0x0307, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x0339: PHI (r12v13 java.util.List<com.okinc.okimcore.stickers.local.StickerEntity>) = 
  (r12v6 java.util.List<com.okinc.okimcore.stickers.local.StickerEntity>)
  (r12v23 java.util.List<com.okinc.okimcore.stickers.local.StickerEntity>)
 binds: [B:115:0x0307, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x0339: PHI (r13v15 java.lang.String) = (r13v8 java.lang.String), (r13v0 java.lang.String) binds: [B:115:0x0307, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x0339: PHI (r14v19 o.sRK) = (r14v12 o.sRK), (r14v30 o.sRK) binds: [B:115:0x0307, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03b4 A[Catch: all -> 0x00fd, TryCatch #14 {all -> 0x00fd, blocks: (B:33:0x00ed, B:152:0x03a7, B:153:0x03aa, B:156:0x03ae, B:158:0x03b4, B:160:0x03be, B:161:0x03c1, B:162:0x03c2, B:163:0x03c5), top: B:192:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03e6 A[Catch: all -> 0x041d, TRY_LEAVE, TryCatch #31 {all -> 0x041d, blocks: (B:169:0x03d9, B:171:0x03e6), top: B:201:0x03d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x024e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T] */
    /* JADX WARN: Type inference failed for: r0v54, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r1v25, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.okinc.okimcore.common.database.BaseDao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r2v34, types: [com.okinc.okimcore.common.database.BaseDao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r5v17, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v38, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0307 -> B:121:0x0339). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x032f -> B:120:0x0332). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.List<StickerPacksResponse.SavedSticker> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        StickersRepository$addStickers$1 stickersRepository$addStickers$1;
        Ref.LongRef longRef;
        ?? r2;
        ?? longRef2;
        ?? r22;
        sRK srk;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        ?? r23;
        StickersRepository$addStickers$1 stickersRepository$addStickers$12;
        java.util.List<StickerPacksResponse.SavedSticker> list2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        sRK srk2;
        java.lang.String str;
        ?? r9;
        int i3;
        java.util.List<StickerPacksResponse.SavedSticker> list3;
        int i4;
        ?? r0;
        StickersRepository$addStickers$1 stickersRepository$addStickers$13;
        Ref.ObjectRef objectRef2;
        java.lang.String str2;
        Ref.LongRef longRef4;
        long jNanoTime;
        Ref.ObjectRef objectRef3;
        java.lang.String str3;
        int i5;
        java.util.List<StickerPacksResponse.SavedSticker> list4;
        Ref.ObjectRef objectRef4;
        ?? r02;
        java.util.List<StickerEntity> arrayList;
        Ref.ObjectRef objectRef5;
        int i6;
        int i7;
        java.util.List<StickerPacksResponse.SavedSticker> list5;
        java.lang.String str4;
        java.lang.Exception e3;
        java.lang.IllegalStateException e4;
        java.lang.String message2;
        sRK srk3;
        java.util.List<StickerEntity> list6;
        ?? r10;
        ?? r8;
        Ref.ObjectRef objectRef6;
        int i8;
        int i9;
        int i10;
        ?? r03;
        StickersRepository$addStickers$1 stickersRepository$addStickers$14;
        Ref.ObjectRef objectRef7;
        int i11;
        java.lang.String str5;
        Ref.ObjectRef objectRef8;
        int i12;
        java.lang.String str6;
        long jNanoTime2;
        ?? r5;
        java.util.List<StickerEntity> list7;
        Ref.ObjectRef objectRef9;
        ?? r102;
        ?? r82;
        if (continuation instanceof StickersRepository$addStickers$1) {
            stickersRepository$addStickers$1 = (StickersRepository$addStickers$1) continuation;
            int i13 = stickersRepository$addStickers$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                stickersRepository$addStickers$1.label = i13 - Integer.MIN_VALUE;
            } else {
                stickersRepository$addStickers$1 = new StickersRepository$addStickers$1(this, continuation);
            }
        }
        java.lang.Object obj = stickersRepository$addStickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i14 = stickersRepository$addStickers$1.label;
        ?? r83 = 4;
        ?? r84 = 4;
        java.lang.String str7 = "Database Operation failed after ";
        ?? r103 = 2;
        java.lang.String str8 = " attempts";
        try {
            try {
                if (i14 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    StickersDao stickersDaoEZpvd = EZpvd();
                    srk = this;
                    longRef3 = new Ref.LongRef();
                    objectRef = new Ref.ObjectRef();
                    i = 0;
                    i2 = 3;
                    r23 = stickersDaoEZpvd;
                    stickersRepository$addStickers$12 = stickersRepository$addStickers$1;
                    list2 = list;
                    if (i < i2) {
                    }
                } else if (i14 == 1) {
                    long j = stickersRepository$addStickers$1.J$0;
                    int i15 = stickersRepository$addStickers$1.I$2;
                    i3 = stickersRepository$addStickers$1.I$1;
                    i2 = stickersRepository$addStickers$1.I$0;
                    Ref.ObjectRef objectRef10 = (Ref.ObjectRef) stickersRepository$addStickers$1.L$7;
                    Ref.LongRef longRef5 = (Ref.LongRef) stickersRepository$addStickers$1.L$6;
                    Ref.ObjectRef objectRef11 = (Ref.ObjectRef) stickersRepository$addStickers$1.L$5;
                    objectRef = (Ref.ObjectRef) stickersRepository$addStickers$1.L$4;
                    longRef = (Ref.LongRef) stickersRepository$addStickers$1.L$3;
                    BaseDao baseDao = (BaseDao) stickersRepository$addStickers$1.L$2;
                    java.util.List<StickerPacksResponse.SavedSticker> list8 = (java.util.List) stickersRepository$addStickers$1.L$1;
                    sRK srk4 = (sRK) stickersRepository$addStickers$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        r84 = baseDao;
                        stickersRepository$addStickers$13 = stickersRepository$addStickers$1;
                        objectRef4 = objectRef11;
                        srk = srk4;
                        i4 = i15;
                        str2 = " attempts";
                        jNanoTime = j;
                        i = i3;
                        list4 = list8;
                        objectRef2 = objectRef;
                        longRef4 = longRef5;
                        objectRef3 = objectRef10;
                        str3 = "Database Operation failed after ";
                        i5 = i2;
                        r02 = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                        stickersRepository$addStickers$12 = stickersRepository$addStickers$1;
                        srk2 = srk4;
                        str = "Database Operation failed after ";
                        i4 = i15;
                        list3 = list8;
                        r9 = baseDao;
                        r0 = e5;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                        objectRef.element = r0;
                        if (i4 < i2 - 1) {
                        }
                        i = i3 + i;
                        r23 = ;
                        srk = srk;
                        longRef3 = longRef;
                        i2 = i;
                        if (i < i2) {
                        }
                    } catch (java.lang.IllegalStateException e6) {
                        e2 = e6;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e7) {
                        e = e7;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        r2 = baseDao;
                        C44159sFm.EZpvd(r2, longRef.element);
                        throw th;
                    }
                    objectRef3.element = r02;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    java.lang.Object obj2 = objectRef4.element;
                    C44159sFm.EZpvd(r84, longRef.element);
                    long jLongValue = ((java.lang.Number) obj2).longValue();
                    java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list4, new Application());
                    arrayList = new java.util.ArrayList<>(C56403yEb.AYXKKw(listEZpvd, 10));
                    int i16 = 0;
                    while (r2.hasNext()) {
                    }
                    StickersDao stickersDaoEZpvd2 = srk.EZpvd();
                    longRef2 = new Ref.LongRef();
                    objectRef5 = new Ref.ObjectRef();
                    str7 = str3;
                    str8 = str2;
                    i6 = 0;
                    i7 = 3;
                    stickersRepository$addStickers$1 = stickersRepository$addStickers$13;
                    r22 = stickersDaoEZpvd2;
                    if (i6 >= i7) {
                    }
                } else {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            long j2 = stickersRepository$addStickers$1.J$0;
                            int i17 = stickersRepository$addStickers$1.I$2;
                            int i18 = stickersRepository$addStickers$1.I$1;
                            int i19 = stickersRepository$addStickers$1.I$0;
                            Ref.ObjectRef objectRef12 = (Ref.ObjectRef) stickersRepository$addStickers$1.L$7;
                            Ref.LongRef longRef6 = (Ref.LongRef) stickersRepository$addStickers$1.L$6;
                            Ref.ObjectRef objectRef13 = (Ref.ObjectRef) stickersRepository$addStickers$1.L$5;
                            Ref.ObjectRef objectRef14 = (Ref.ObjectRef) stickersRepository$addStickers$1.L$4;
                            Ref.LongRef longRef7 = (Ref.LongRef) stickersRepository$addStickers$1.L$3;
                            BaseDao baseDao2 = (BaseDao) stickersRepository$addStickers$1.L$2;
                            java.util.List<StickerEntity> list9 = (java.util.List) stickersRepository$addStickers$1.L$1;
                            sRK srk5 = (sRK) stickersRepository$addStickers$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj);
                                objectRef9 = objectRef13;
                                str6 = "Database Operation failed after ";
                                longRef2 = longRef7;
                                stickersRepository$addStickers$14 = stickersRepository$addStickers$1;
                                srk = srk5;
                                list7 = list9;
                                objectRef7 = objectRef14;
                                str5 = " attempts";
                                objectRef8 = objectRef12;
                                i12 = i19;
                                r103 = baseDao2;
                                i11 = i17;
                                i9 = i18;
                                jNanoTime2 = j2;
                                r5 = longRef6;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                                srk3 = srk5;
                                i10 = i17;
                                i9 = i18;
                                i8 = i19;
                                objectRef6 = objectRef14;
                                r10 = baseDao2;
                                list6 = list9;
                                r8 = longRef7;
                                r03 = e8;
                                C44159sFm.copydefault(r03, (java.lang.Exception) objectRef6.element);
                                objectRef6.element = r03;
                                r82 = r8;
                                r102 = r10;
                                if (i10 < i8 - 1) {
                                }
                                objectRef5 = objectRef6;
                                r22 = ;
                                srk = srk3;
                                i7 = i8;
                                longRef2 = ;
                                i6 = i9 + 1;
                                arrayList = list6;
                                if (i6 >= i7) {
                                }
                            } catch (java.lang.IllegalStateException e9) {
                                e4 = e9;
                                message2 = e4.getMessage();
                                if (message2 == null) {
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            } catch (java.lang.Exception e10) {
                                e3 = e10;
                                C44159sFm.OLrzqt(e3);
                                throw e3;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                longRef2 = longRef7;
                                r22 = baseDao2;
                                C44159sFm.EZpvd(r22, longRef2.element);
                                throw th;
                            }
                            ?? r1 = Unit.INSTANCE;
                            objectRef8.element = r1;
                            r5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime2, DurationUnit.NANOSECONDS));
                            java.lang.Object obj3 = objectRef9.element;
                            C44159sFm.EZpvd(r103, longRef2.element);
                            return r1;
                        }
                        if (i14 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i9 = stickersRepository$addStickers$1.I$1;
                        i8 = stickersRepository$addStickers$1.I$0;
                        objectRef6 = (Ref.ObjectRef) stickersRepository$addStickers$1.L$4;
                        Ref.LongRef longRef8 = (Ref.LongRef) stickersRepository$addStickers$1.L$3;
                        BaseDao baseDao3 = (BaseDao) stickersRepository$addStickers$1.L$2;
                        list6 = (java.util.List) stickersRepository$addStickers$1.L$1;
                        srk3 = (sRK) stickersRepository$addStickers$1.L$0;
                        C56391yDq.AEQbTJ(obj);
                        r82 = longRef8;
                        r102 = baseDao3;
                        ?? r85 = r82;
                        ?? r104 = r102;
                        objectRef5 = objectRef6;
                        r22 = r104;
                        srk = srk3;
                        i7 = i8;
                        longRef2 = r85;
                        i6 = i9 + 1;
                        arrayList = list6;
                        if (i6 >= i7) {
                            try {
                                try {
                                } catch (java.lang.IllegalStateException e11) {
                                    e4 = e11;
                                    message2 = e4.getMessage();
                                    if (message2 == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                        C44159sFm.OLrzqt(e4);
                                        throw e4;
                                    }
                                    C44159sFm.copydefault(e4);
                                    throw e4;
                                } catch (java.lang.Exception e12) {
                                    e3 = e12;
                                    C44159sFm.OLrzqt(e3);
                                    throw e3;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    C44159sFm.EZpvd(r22, longRef2.element);
                                    throw th;
                                }
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e13) {
                                e = e13;
                                i11 = i6;
                                str6 = str7;
                            }
                            Ref.ObjectRef objectRef15 = new Ref.ObjectRef();
                            str6 = str7;
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e14) {
                                e = e14;
                                i11 = i6;
                            }
                            jNanoTime2 = java.lang.System.nanoTime();
                            StickersDao stickersDaoEZpvd3 = srk.EZpvd();
                            stickersRepository$addStickers$1.L$0 = srk;
                            stickersRepository$addStickers$1.L$1 = arrayList;
                            stickersRepository$addStickers$1.L$2 = r22;
                            stickersRepository$addStickers$1.L$3 = longRef2;
                            stickersRepository$addStickers$1.L$4 = objectRef5;
                            stickersRepository$addStickers$1.L$5 = objectRef15;
                            stickersRepository$addStickers$1.L$6 = longRef2;
                            stickersRepository$addStickers$1.L$7 = objectRef15;
                            stickersRepository$addStickers$1.I$0 = i7;
                            stickersRepository$addStickers$1.I$1 = i6;
                            stickersRepository$addStickers$1.I$2 = i6;
                            stickersRepository$addStickers$1.J$0 = jNanoTime2;
                            i11 = i6;
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e15) {
                                e = e15;
                                list6 = arrayList;
                                i8 = i7;
                                str7 = str6;
                                r8 = longRef2;
                                i9 = i11;
                                r10 = r22;
                                srk3 = srk;
                                objectRef6 = objectRef5;
                                i10 = i9;
                                r03 = e;
                                C44159sFm.copydefault(r03, (java.lang.Exception) objectRef6.element);
                                objectRef6.element = r03;
                                r82 = r8;
                                r102 = r10;
                                if (i10 < i8 - 1) {
                                    java.lang.Object obj4 = objCopydefault;
                                    stickersRepository$addStickers$1.L$0 = srk3;
                                    stickersRepository$addStickers$1.L$1 = list6;
                                    stickersRepository$addStickers$1.L$2 = r10;
                                    stickersRepository$addStickers$1.L$3 = r8;
                                    stickersRepository$addStickers$1.L$4 = objectRef6;
                                    stickersRepository$addStickers$1.L$5 = null;
                                    stickersRepository$addStickers$1.L$6 = null;
                                    stickersRepository$addStickers$1.L$7 = null;
                                    stickersRepository$addStickers$1.I$0 = i8;
                                    stickersRepository$addStickers$1.I$1 = i9;
                                    stickersRepository$addStickers$1.label = 4;
                                    objCopydefault = obj4;
                                    r85 = r8;
                                    r104 = r10;
                                    if (DelayKt.delay(((long) (i10 + 1)) * 50, stickersRepository$addStickers$1) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                } else {
                                    ?? r852 = r82;
                                    ?? r1042 = r102;
                                }
                                objectRef5 = objectRef6;
                                r22 = r1042;
                                srk = srk3;
                                i7 = i8;
                                longRef2 = r852;
                                i6 = i9 + 1;
                                arrayList = list6;
                                if (i6 >= i7) {
                                }
                            }
                            stickersRepository$addStickers$1.label = 3;
                            if (stickersDaoEZpvd3.insert(arrayList, stickersRepository$addStickers$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            stickersRepository$addStickers$14 = stickersRepository$addStickers$1;
                            objectRef9 = objectRef15;
                            r5 = longRef2;
                            objectRef7 = objectRef5;
                            str5 = str8;
                            i12 = i7;
                            objectRef8 = objectRef9;
                            r103 = r22;
                            list7 = arrayList;
                            i9 = i11;
                            longRef2 = longRef2;
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e16) {
                                stickersRepository$addStickers$1 = stickersRepository$addStickers$14;
                                str7 = str6;
                                i8 = i12;
                                r8 = longRef2;
                                str8 = str5;
                                list6 = list7;
                                srk3 = srk;
                                i10 = i11;
                                objectRef6 = objectRef7;
                                r03 = e16;
                                r10 = r103;
                                C44159sFm.copydefault(r03, (java.lang.Exception) objectRef6.element);
                                objectRef6.element = r03;
                                r82 = r8;
                                r102 = r10;
                                if (i10 < i8 - 1) {
                                }
                                objectRef5 = objectRef6;
                                r22 = r1042;
                                srk = srk3;
                                i7 = i8;
                                longRef2 = r852;
                                i6 = i9 + 1;
                                arrayList = list6;
                                if (i6 >= i7) {
                                }
                            } catch (java.lang.IllegalStateException e17) {
                                e4 = e17;
                                message2 = e4.getMessage();
                                if (message2 == null) {
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            } catch (java.lang.Exception e18) {
                                e3 = e18;
                                C44159sFm.OLrzqt(e3);
                                throw e3;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                r83 = longRef2;
                                longRef2 = r83;
                                r22 = r103;
                                C44159sFm.EZpvd(r22, longRef2.element);
                                throw th;
                            }
                            ?? r12 = Unit.INSTANCE;
                            objectRef8.element = r12;
                            r5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime2, DurationUnit.NANOSECONDS));
                            java.lang.Object obj32 = objectRef9.element;
                            C44159sFm.EZpvd(r103, longRef2.element);
                            return r12;
                        }
                        java.lang.String str9 = str7;
                        C44159sFm.EZpvd(r22, longRef2.element);
                        java.lang.Exception exc = (java.lang.Exception) objectRef5.element;
                        if (exc == null) {
                            exc = new java.lang.Exception(str9 + i7 + str8);
                        }
                        C44159sFm.OLrzqt(exc);
                        throw exc;
                    }
                    int i20 = stickersRepository$addStickers$1.I$1;
                    int i21 = stickersRepository$addStickers$1.I$0;
                    Ref.ObjectRef objectRef16 = (Ref.ObjectRef) stickersRepository$addStickers$1.L$4;
                    Ref.LongRef longRef9 = (Ref.LongRef) stickersRepository$addStickers$1.L$3;
                    ?? r86 = (BaseDao) stickersRepository$addStickers$1.L$2;
                    java.util.List<StickerPacksResponse.SavedSticker> list10 = (java.util.List) stickersRepository$addStickers$1.L$1;
                    sRK srk6 = (sRK) stickersRepository$addStickers$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    int i22 = i21;
                    objectRef = objectRef16;
                    longRef = longRef9;
                    int i23 = 1;
                    stickersRepository$addStickers$12 = stickersRepository$addStickers$1;
                    i3 = i20;
                    list2 = list10;
                    i = i3 + i23;
                    r23 = r86;
                    srk = srk6;
                    longRef3 = longRef;
                    i2 = i22;
                    if (i < i2) {
                        try {
                            try {
                            } catch (java.lang.IllegalStateException e19) {
                                e2 = e19;
                                message = e2.getMessage();
                                if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                    C44159sFm.OLrzqt(e2);
                                    throw e2;
                                }
                                C44159sFm.copydefault(e2);
                                throw e2;
                            } catch (java.lang.Exception e20) {
                                e = e20;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                longRef = longRef3;
                                r2 = r23;
                                C44159sFm.EZpvd(r2, longRef.element);
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e21) {
                            e = e21;
                            list5 = list2;
                            str4 = str8;
                        }
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e22) {
                            e = e22;
                            list5 = list2;
                            str4 = str8;
                        }
                        Ref.ObjectRef objectRef17 = new Ref.ObjectRef();
                        str4 = str8;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e23) {
                            e = e23;
                            list5 = list2;
                        }
                        jNanoTime = java.lang.System.nanoTime();
                        StickersDao stickersDaoEZpvd4 = srk.EZpvd();
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e24) {
                            e = e24;
                            list5 = list2;
                        }
                        stickersRepository$addStickers$12.L$0 = srk;
                        stickersRepository$addStickers$12.L$1 = list2;
                        stickersRepository$addStickers$12.L$2 = r23;
                        stickersRepository$addStickers$12.L$3 = longRef3;
                        stickersRepository$addStickers$12.L$4 = objectRef;
                        stickersRepository$addStickers$12.L$5 = objectRef17;
                        stickersRepository$addStickers$12.L$6 = longRef3;
                        stickersRepository$addStickers$12.L$7 = objectRef17;
                        stickersRepository$addStickers$12.I$0 = i2;
                        stickersRepository$addStickers$12.I$1 = i;
                        stickersRepository$addStickers$12.I$2 = i;
                        stickersRepository$addStickers$12.J$0 = jNanoTime;
                        list5 = list2;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e25) {
                            try {
                                e = e25;
                                C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                                objectRef.element = r0;
                                if (i4 < i2 - 1) {
                                    stickersRepository$addStickers$12.L$0 = srk2;
                                    stickersRepository$addStickers$12.L$1 = list3;
                                    stickersRepository$addStickers$12.L$2 = r9;
                                    stickersRepository$addStickers$12.L$3 = longRef;
                                    stickersRepository$addStickers$12.L$4 = objectRef;
                                    stickersRepository$addStickers$12.L$5 = null;
                                    stickersRepository$addStickers$12.L$6 = null;
                                    stickersRepository$addStickers$12.L$7 = null;
                                    stickersRepository$addStickers$12.I$0 = i2;
                                    stickersRepository$addStickers$12.I$1 = i3;
                                    stickersRepository$addStickers$12.label = 2;
                                    if (DelayKt.delay(((long) (i4 + 1)) * 50, stickersRepository$addStickers$12) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    list2 = list3;
                                    i22 = i2;
                                    r86 = r9;
                                    str7 = str;
                                    srk6 = srk2;
                                    i23 = 1;
                                } else {
                                    list2 = list3;
                                    i22 = i2;
                                    r86 = r9;
                                    str7 = str;
                                    srk6 = srk2;
                                    i23 = 1;
                                }
                                i = i3 + i23;
                                r23 = r86;
                                srk = srk6;
                                longRef3 = longRef;
                                i2 = i22;
                                if (i < i2) {
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                r2 = r9;
                                C44159sFm.EZpvd(r2, longRef.element);
                                throw th;
                            }
                            srk2 = srk;
                            str8 = str4;
                            i3 = i;
                            longRef = longRef3;
                            str = str7;
                            r9 = r23;
                            i4 = i3;
                            list3 = list5;
                            r0 = e;
                        }
                        stickersRepository$addStickers$12.label = 1;
                        java.lang.Object lastPosition = stickersDaoEZpvd4.getLastPosition(StickerPackEntity.CUSTOM_PACK_ID, stickersRepository$addStickers$12);
                        if (lastPosition == objCopydefault) {
                            return objCopydefault;
                        }
                        stickersRepository$addStickers$13 = stickersRepository$addStickers$12;
                        objectRef4 = objectRef17;
                        objectRef2 = objectRef;
                        list4 = list5;
                        longRef4 = longRef3;
                        str2 = str4;
                        str3 = str7;
                        longRef = longRef4;
                        i5 = i2;
                        objectRef3 = objectRef4;
                        r84 = r23;
                        i4 = i;
                        r02 = lastPosition;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e26) {
                            srk2 = srk;
                            str = str3;
                            str8 = str2;
                            objectRef = objectRef2;
                            i3 = i;
                            list3 = list4;
                            stickersRepository$addStickers$12 = stickersRepository$addStickers$13;
                            int i24 = i5;
                            r9 = r84;
                            i2 = i24;
                            r0 = e26;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                            objectRef.element = r0;
                            if (i4 < i2 - 1) {
                            }
                            i = i3 + i23;
                            r23 = r86;
                            srk = srk6;
                            longRef3 = longRef;
                            i2 = i22;
                            if (i < i2) {
                            }
                        } catch (java.lang.IllegalStateException e27) {
                            e2 = e27;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e28) {
                            e = e28;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            Ref.LongRef longRef10 = longRef;
                            longRef = longRef10;
                            r2 = r84;
                            C44159sFm.EZpvd(r2, longRef.element);
                            throw th;
                        }
                        objectRef3.element = r02;
                        longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        java.lang.Object obj22 = objectRef4.element;
                        C44159sFm.EZpvd(r84, longRef.element);
                        long jLongValue2 = ((java.lang.Number) obj22).longValue();
                        java.util.List listEZpvd2 = CollectionsKt___CollectionsKt.EZpvd(list4, new Application());
                        arrayList = new java.util.ArrayList<>(C56403yEb.AYXKKw(listEZpvd2, 10));
                        int i162 = 0;
                        for (java.lang.Object obj5 : listEZpvd2) {
                            if (i162 < 0) {
                                yDY.AYXKKw();
                            }
                            StickerPacksResponse.SavedSticker savedSticker = (StickerPacksResponse.SavedSticker) obj5;
                            arrayList.add(new StickerEntity(savedSticker.KWHzl(), StickerPackEntity.CUSTOM_PACK_ID, ((long) i162) + jLongValue2 + 1, savedSticker.EZpvd()));
                            i162++;
                        }
                        StickersDao stickersDaoEZpvd22 = srk.EZpvd();
                        longRef2 = new Ref.LongRef();
                        objectRef5 = new Ref.ObjectRef();
                        str7 = str3;
                        str8 = str2;
                        i6 = 0;
                        i7 = 3;
                        stickersRepository$addStickers$1 = stickersRepository$addStickers$13;
                        r22 = stickersDaoEZpvd22;
                        if (i6 >= i7) {
                        }
                    } else {
                        java.lang.String str10 = str8;
                        C44159sFm.EZpvd(r23, longRef3.element);
                        java.lang.Exception exc2 = (java.lang.Exception) objectRef.element;
                        if (exc2 == null) {
                            exc2 = new java.lang.Exception(str7 + i2 + str10);
                        }
                        C44159sFm.OLrzqt(exc2);
                        throw exc2;
                    }
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:46:0x014f */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v39, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018f A[Catch: all -> 0x01cc, TRY_LEAVE, TryCatch #8 {all -> 0x01cc, blocks: (B:63:0x0182, B:65:0x018f), top: B:85:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01b6 -> B:69:0x01bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01b9 -> B:15:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, int i, int i2, @NotNull Continuation<? super java.util.List<StickerEntity>> continuation) throws java.lang.Exception {
        StickersRepository$getStickers$1 stickersRepository$getStickers$1;
        Ref.LongRef longRef;
        BaseDao baseDao;
        sRK srk;
        BaseDao baseDaoEZpvd;
        Ref.LongRef longRef2;
        Ref.ObjectRef objectRef;
        int i3;
        int i4;
        int i5;
        int i6;
        StickersRepository$getStickers$1 stickersRepository$getStickers$12;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        java.lang.String str3;
        int i7;
        Ref.ObjectRef objectRef2;
        int i8;
        int i9;
        sRK srk2;
        int i10;
        Ref.LongRef longRef3;
        ?? r0;
        java.lang.String str4;
        StickersRepository$getStickers$1 stickersRepository$getStickers$13;
        int i11;
        int i12;
        int i13;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        long j;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef5;
        T t;
        if (continuation instanceof StickersRepository$getStickers$1) {
            stickersRepository$getStickers$1 = (StickersRepository$getStickers$1) continuation;
            int i14 = stickersRepository$getStickers$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                stickersRepository$getStickers$1.label = i14 - Integer.MIN_VALUE;
            } else {
                stickersRepository$getStickers$1 = new StickersRepository$getStickers$1(this, continuation);
            }
        }
        java.lang.Object obj = stickersRepository$getStickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i15 = stickersRepository$getStickers$1.label;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    j = stickersRepository$getStickers$1.J$0;
                    i9 = stickersRepository$getStickers$1.I$4;
                    i13 = stickersRepository$getStickers$1.I$3;
                    i3 = stickersRepository$getStickers$1.I$2;
                    i12 = stickersRepository$getStickers$1.I$1;
                    i7 = stickersRepository$getStickers$1.I$0;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) stickersRepository$getStickers$1.L$7;
                    Ref.LongRef longRef5 = (Ref.LongRef) stickersRepository$getStickers$1.L$6;
                    Ref.ObjectRef objectRef7 = (Ref.ObjectRef) stickersRepository$getStickers$1.L$5;
                    Ref.ObjectRef objectRef8 = (Ref.ObjectRef) stickersRepository$getStickers$1.L$4;
                    longRef = (Ref.LongRef) stickersRepository$getStickers$1.L$3;
                    BaseDao baseDao2 = (BaseDao) stickersRepository$getStickers$1.L$2;
                    str4 = (java.lang.String) stickersRepository$getStickers$1.L$1;
                    sRK srk3 = (sRK) stickersRepository$getStickers$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        baseDaoEZpvd = baseDao2;
                        stickersRepository$getStickers$13 = stickersRepository$getStickers$1;
                        objectRef5 = objectRef6;
                        srk = srk3;
                        longRef4 = longRef5;
                        i11 = i7;
                        longRef2 = longRef;
                        objectRef3 = objectRef8;
                        objectRef4 = objectRef7;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        baseDaoEZpvd = baseDao2;
                        str3 = str4;
                        srk2 = srk3;
                        longRef3 = longRef;
                        i10 = i13;
                        i8 = i12;
                        objectRef2 = objectRef8;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i9 < i3 - 1) {
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
                        baseDao = baseDao2;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef5.element = t;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                    return t2;
                }
                if (i15 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = stickersRepository$getStickers$1.I$3;
                int i16 = stickersRepository$getStickers$1.I$2;
                i8 = stickersRepository$getStickers$1.I$1;
                int i17 = stickersRepository$getStickers$1.I$0;
                objectRef2 = (Ref.ObjectRef) stickersRepository$getStickers$1.L$4;
                Ref.LongRef longRef6 = (Ref.LongRef) stickersRepository$getStickers$1.L$3;
                baseDaoEZpvd = (BaseDao) stickersRepository$getStickers$1.L$2;
                str3 = (java.lang.String) stickersRepository$getStickers$1.L$1;
                srk2 = (sRK) stickersRepository$getStickers$1.L$0;
                C56391yDq.AEQbTJ(obj);
                longRef3 = longRef6;
                i7 = i17;
                i3 = i16;
                srk = srk2;
                objectRef = objectRef2;
                stickersRepository$getStickers$12 = stickersRepository$getStickers$1;
                str2 = str3;
                int i18 = i7;
                longRef2 = longRef3;
                i5 = i18;
                i4 = i10 + 1;
                i6 = i8;
                if (i4 >= i3) {
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
                        e = e8;
                        i13 = i4;
                    }
                    Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                    i13 = i4;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        try {
                            e = e9;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i9 < i3 - 1) {
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            Ref.LongRef longRef7 = longRef3;
                            longRef = longRef7;
                            baseDao = baseDaoEZpvd;
                            C44159sFm.EZpvd(baseDao, longRef.element);
                            throw th;
                        }
                        str3 = str2;
                        stickersRepository$getStickers$1 = stickersRepository$getStickers$12;
                        srk2 = srk;
                        objectRef2 = objectRef;
                        i9 = i13;
                        i8 = i6;
                        i10 = i9;
                        Ref.LongRef longRef8 = longRef2;
                        i7 = i5;
                        longRef3 = longRef8;
                        r0 = e;
                    }
                    long jNanoTime = java.lang.System.nanoTime();
                    StickersDao stickersDaoEZpvd = srk.EZpvd();
                    stickersRepository$getStickers$12.L$0 = srk;
                    stickersRepository$getStickers$12.L$1 = str2;
                    stickersRepository$getStickers$12.L$2 = baseDaoEZpvd;
                    stickersRepository$getStickers$12.L$3 = longRef2;
                    stickersRepository$getStickers$12.L$4 = objectRef;
                    stickersRepository$getStickers$12.L$5 = objectRef9;
                    stickersRepository$getStickers$12.L$6 = longRef2;
                    stickersRepository$getStickers$12.L$7 = objectRef9;
                    stickersRepository$getStickers$12.I$0 = i5;
                    stickersRepository$getStickers$12.I$1 = i6;
                    stickersRepository$getStickers$12.I$2 = i3;
                    stickersRepository$getStickers$12.I$3 = i13;
                    stickersRepository$getStickers$12.I$4 = i13;
                    stickersRepository$getStickers$12.J$0 = jNanoTime;
                    stickersRepository$getStickers$12.label = 1;
                    java.lang.Object stickers = stickersDaoEZpvd.getStickers(str2, i5, i6, stickersRepository$getStickers$12);
                    if (stickers == objCopydefault) {
                        return objCopydefault;
                    }
                    str4 = str2;
                    i11 = i5;
                    stickersRepository$getStickers$13 = stickersRepository$getStickers$12;
                    longRef4 = longRef2;
                    objectRef5 = objectRef9;
                    t = stickers;
                    i12 = i6;
                    j = jNanoTime;
                    i9 = i13;
                    objectRef3 = objectRef;
                    objectRef4 = objectRef5;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        stickersRepository$getStickers$1 = stickersRepository$getStickers$13;
                        srk2 = srk;
                        i10 = i13;
                        i8 = i12;
                        longRef3 = longRef2;
                        i7 = i11;
                        str3 = str4;
                        objectRef2 = objectRef3;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i9 < i3 - 1) {
                            stickersRepository$getStickers$1.L$0 = srk2;
                            stickersRepository$getStickers$1.L$1 = str3;
                            stickersRepository$getStickers$1.L$2 = baseDaoEZpvd;
                            stickersRepository$getStickers$1.L$3 = longRef3;
                            stickersRepository$getStickers$1.L$4 = objectRef2;
                            stickersRepository$getStickers$1.L$5 = null;
                            stickersRepository$getStickers$1.L$6 = null;
                            stickersRepository$getStickers$1.L$7 = null;
                            stickersRepository$getStickers$1.I$0 = i7;
                            stickersRepository$getStickers$1.I$1 = i8;
                            stickersRepository$getStickers$1.I$2 = i3;
                            stickersRepository$getStickers$1.I$3 = i10;
                            stickersRepository$getStickers$1.label = 2;
                            if (DelayKt.delay(((long) (i9 + 1)) * 50, stickersRepository$getStickers$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            srk = srk2;
                            objectRef = objectRef2;
                            stickersRepository$getStickers$12 = stickersRepository$getStickers$1;
                            str2 = str3;
                            int i182 = i7;
                            longRef2 = longRef3;
                            i5 = i182;
                            i4 = i10 + 1;
                            i6 = i8;
                            if (i4 >= i3) {
                            }
                        } else {
                            srk = srk2;
                            objectRef = objectRef2;
                            stickersRepository$getStickers$12 = stickersRepository$getStickers$1;
                            str2 = str3;
                            int i1822 = i7;
                            longRef2 = longRef3;
                            i5 = i1822;
                            i4 = i10 + 1;
                            i6 = i8;
                            if (i4 >= i3) {
                            }
                        }
                    }
                    objectRef5.element = t;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t22 = objectRef4.element;
                    C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i3 + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            srk = this;
            baseDaoEZpvd = EZpvd();
            longRef2 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i3 = 3;
            i4 = 0;
            i5 = i;
            i6 = i2;
            stickersRepository$getStickers$12 = stickersRepository$getStickers$1;
            str2 = str;
            if (i4 >= i3) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((StickerPacksResponse.SavedSticker) t).copydefault()), java.lang.Long.valueOf(((StickerPacksResponse.SavedSticker) t2).copydefault()));
        }
    }

    /* JADX DEBUG: Duplicate block (B:74:0x01c2) to fix multi-entry loop: BACK_EDGE: B:74:0x01c2 -> B:75:0x01ca */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v41, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v42, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x017d: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:64:0x017d */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x017e: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:64:0x017d */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169 A[Catch: all -> 0x005c, TryCatch #12 {all -> 0x005c, blocks: (B:13:0x004a, B:37:0x0122, B:52:0x015c, B:53:0x015f, B:56:0x0163, B:58:0x0169, B:60:0x0175, B:61:0x0178, B:62:0x0179, B:63:0x017c), top: B:89:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0198 A[Catch: all -> 0x01d0, TRY_LEAVE, TryCatch #5 {all -> 0x01d0, blocks: (B:68:0x018b, B:70:0x0198), top: B:87:0x018b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Exception {
        StickersRepository$deleteStickersByIds$1 stickersRepository$deleteStickersByIds$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        sRK srk;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        java.util.Set<java.lang.String> set2;
        BaseDao baseDao3;
        StickersRepository$deleteStickersByIds$1 stickersRepository$deleteStickersByIds$12;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        sRK srk2;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef2;
        java.util.Set<java.lang.String> set3;
        BaseDao baseDao4;
        int i3;
        java.lang.String str3;
        ?? r0;
        StickersRepository$deleteStickersByIds$1 stickersRepository$deleteStickersByIds$13;
        Ref.LongRef longRef5;
        Ref.ObjectRef objectRef3;
        int i4;
        BaseDao baseDao5;
        long jNanoTime;
        int i5;
        Ref.ObjectRef objectRef4;
        java.lang.String str4;
        sRK srk3;
        Ref.ObjectRef objectRef5;
        T t;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        if (continuation instanceof StickersRepository$deleteStickersByIds$1) {
            stickersRepository$deleteStickersByIds$1 = (StickersRepository$deleteStickersByIds$1) continuation;
            int i6 = stickersRepository$deleteStickersByIds$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                stickersRepository$deleteStickersByIds$1.label = i6 - Integer.MIN_VALUE;
            } else {
                stickersRepository$deleteStickersByIds$1 = new StickersRepository$deleteStickersByIds$1(this, continuation);
            }
        }
        java.lang.Object obj = stickersRepository$deleteStickersByIds$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i7 = stickersRepository$deleteStickersByIds$1.label;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    jNanoTime = stickersRepository$deleteStickersByIds$1.J$0;
                    i3 = stickersRepository$deleteStickersByIds$1.I$2;
                    int i8 = stickersRepository$deleteStickersByIds$1.I$1;
                    i = stickersRepository$deleteStickersByIds$1.I$0;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) stickersRepository$deleteStickersByIds$1.L$8;
                    Ref.LongRef longRef6 = (Ref.LongRef) stickersRepository$deleteStickersByIds$1.L$7;
                    Ref.ObjectRef objectRef7 = (Ref.ObjectRef) stickersRepository$deleteStickersByIds$1.L$6;
                    objectRef4 = (Ref.ObjectRef) stickersRepository$deleteStickersByIds$1.L$5;
                    longRef2 = (Ref.LongRef) stickersRepository$deleteStickersByIds$1.L$4;
                    baseDao2 = (BaseDao) stickersRepository$deleteStickersByIds$1.L$3;
                    set3 = (java.util.Set) stickersRepository$deleteStickersByIds$1.L$2;
                    java.lang.String str5 = (java.lang.String) stickersRepository$deleteStickersByIds$1.L$1;
                    srk3 = (sRK) stickersRepository$deleteStickersByIds$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        str4 = str5;
                        stickersRepository$deleteStickersByIds$13 = stickersRepository$deleteStickersByIds$1;
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
                        srk2 = srk3;
                        objectRef2 = objectRef4;
                        baseDao4 = baseDao2;
                        i2 = i8;
                        str3 = str5;
                        longRef4 = longRef2;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i3 < i - 1) {
                        }
                        i2 += i;
                        baseDao3 = baseDao;
                        srk = srk2;
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
                    return t2;
                }
                if (i7 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = stickersRepository$deleteStickersByIds$1.I$1;
                int i10 = stickersRepository$deleteStickersByIds$1.I$0;
                Ref.ObjectRef objectRef8 = (Ref.ObjectRef) stickersRepository$deleteStickersByIds$1.L$5;
                Ref.LongRef longRef7 = (Ref.LongRef) stickersRepository$deleteStickersByIds$1.L$4;
                BaseDao baseDao6 = (BaseDao) stickersRepository$deleteStickersByIds$1.L$3;
                java.util.Set<java.lang.String> set4 = (java.util.Set) stickersRepository$deleteStickersByIds$1.L$2;
                java.lang.String str6 = (java.lang.String) stickersRepository$deleteStickersByIds$1.L$1;
                srk2 = (sRK) stickersRepository$deleteStickersByIds$1.L$0;
                C56391yDq.AEQbTJ(obj);
                stickersRepository$deleteStickersByIds$12 = stickersRepository$deleteStickersByIds$1;
                i2 = i9;
                int i11 = i10;
                set2 = set4;
                str2 = str6;
                longRef3 = longRef7;
                int i12 = 1;
                objectRef = objectRef8;
                i2 += i12;
                baseDao3 = baseDao6;
                srk = srk2;
                i = i11;
                if (i2 < i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            message = e2.getMessage();
                            if (message == null) {
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
                        srk2 = srk;
                        objectRef2 = objectRef;
                        longRef4 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        try {
                            srk2 = srk;
                            objectRef2 = objectRef;
                            longRef4 = longRef3;
                            sQLiteDatabaseLockedException = e9;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i3 < i - 1) {
                                stickersRepository$deleteStickersByIds$1.L$0 = srk2;
                                stickersRepository$deleteStickersByIds$1.L$1 = str3;
                                stickersRepository$deleteStickersByIds$1.L$2 = set3;
                                stickersRepository$deleteStickersByIds$1.L$3 = baseDao4;
                                stickersRepository$deleteStickersByIds$1.L$4 = longRef4;
                                stickersRepository$deleteStickersByIds$1.L$5 = objectRef2;
                                stickersRepository$deleteStickersByIds$1.L$6 = null;
                                stickersRepository$deleteStickersByIds$1.L$7 = null;
                                stickersRepository$deleteStickersByIds$1.L$8 = null;
                                stickersRepository$deleteStickersByIds$1.I$0 = i;
                                stickersRepository$deleteStickersByIds$1.I$1 = i2;
                                stickersRepository$deleteStickersByIds$1.label = 2;
                                if (DelayKt.delay(((long) (i3 + 1)) * 50, stickersRepository$deleteStickersByIds$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                longRef3 = longRef4;
                                i11 = i;
                                baseDao6 = baseDao4;
                                stickersRepository$deleteStickersByIds$12 = stickersRepository$deleteStickersByIds$1;
                                str2 = str3;
                                set2 = set3;
                                objectRef = objectRef2;
                                i12 = 1;
                            } else {
                                longRef3 = longRef4;
                                i11 = i;
                                baseDao6 = baseDao4;
                                stickersRepository$deleteStickersByIds$12 = stickersRepository$deleteStickersByIds$1;
                                str2 = str3;
                                set2 = set3;
                                objectRef = objectRef2;
                                i12 = 1;
                            }
                            i2 += i12;
                            baseDao3 = baseDao6;
                            srk = srk2;
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
                        set3 = set2;
                        str3 = str2;
                        stickersRepository$deleteStickersByIds$1 = stickersRepository$deleteStickersByIds$12;
                        baseDao4 = baseDao3;
                        i3 = i2;
                        r0 = sQLiteDatabaseLockedException;
                    }
                    Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    StickersDao stickersDaoEZpvd = srk.EZpvd();
                    stickersRepository$deleteStickersByIds$12.L$0 = srk;
                    stickersRepository$deleteStickersByIds$12.L$1 = str2;
                    stickersRepository$deleteStickersByIds$12.L$2 = set2;
                    stickersRepository$deleteStickersByIds$12.L$3 = baseDao3;
                    stickersRepository$deleteStickersByIds$12.L$4 = longRef3;
                    stickersRepository$deleteStickersByIds$12.L$5 = objectRef;
                    stickersRepository$deleteStickersByIds$12.L$6 = objectRef9;
                    stickersRepository$deleteStickersByIds$12.L$7 = longRef3;
                    stickersRepository$deleteStickersByIds$12.L$8 = objectRef9;
                    stickersRepository$deleteStickersByIds$12.I$0 = i;
                    stickersRepository$deleteStickersByIds$12.I$1 = i2;
                    stickersRepository$deleteStickersByIds$12.I$2 = i2;
                    stickersRepository$deleteStickersByIds$12.J$0 = jNanoTime;
                    stickersRepository$deleteStickersByIds$12.label = 1;
                    java.lang.Object objDeleteStickersByIds = stickersDaoEZpvd.deleteStickersByIds(str2, set2, stickersRepository$deleteStickersByIds$12);
                    if (objDeleteStickersByIds == objCopydefault) {
                        return objCopydefault;
                    }
                    stickersRepository$deleteStickersByIds$13 = stickersRepository$deleteStickersByIds$12;
                    objectRef4 = objectRef;
                    longRef4 = longRef3;
                    longRef5 = longRef4;
                    set3 = set2;
                    srk3 = srk;
                    i5 = i2;
                    objectRef3 = objectRef9;
                    i4 = i;
                    baseDao5 = baseDao3;
                    str4 = str2;
                    objectRef5 = objectRef3;
                    t = objDeleteStickersByIds;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        stickersRepository$deleteStickersByIds$1 = stickersRepository$deleteStickersByIds$13;
                        srk2 = srk3;
                        str3 = str4;
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
                        srk = srk2;
                        i = i11;
                        if (i2 < i) {
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
                    objectRef3.element = t;
                    longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef5.element;
                    C44159sFm.EZpvd(baseDao5, longRef4.element);
                    return t22;
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
            StickersDao stickersDaoEZpvd2 = EZpvd();
            srk = this;
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            set2 = set;
            baseDao3 = stickersDaoEZpvd2;
            stickersRepository$deleteStickersByIds$12 = stickersRepository$deleteStickersByIds$1;
            str2 = str;
            if (i2 < i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    /* JADX DEBUG: Duplicate block (B:74:0x01c2) to fix multi-entry loop: BACK_EDGE: B:74:0x01c2 -> B:75:0x01ca */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v41, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v42, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x017d: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:64:0x017d */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x017e: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:64:0x017d */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169 A[Catch: all -> 0x005c, TryCatch #12 {all -> 0x005c, blocks: (B:13:0x004a, B:37:0x0122, B:52:0x015c, B:53:0x015f, B:56:0x0163, B:58:0x0169, B:60:0x0175, B:61:0x0178, B:62:0x0179, B:63:0x017c), top: B:89:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0198 A[Catch: all -> 0x01d0, TRY_LEAVE, TryCatch #5 {all -> 0x01d0, blocks: (B:68:0x018b, B:70:0x0198), top: B:87:0x018b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Exception {
        StickersRepository$doesStickerExist$1 stickersRepository$doesStickerExist$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        sRK srk;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        java.lang.String str3;
        BaseDao baseDao3;
        StickersRepository$doesStickerExist$1 stickersRepository$doesStickerExist$12;
        java.lang.String str4;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        sRK srk2;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef2;
        java.lang.String str5;
        BaseDao baseDao4;
        int i3;
        java.lang.String str6;
        ?? r0;
        StickersRepository$doesStickerExist$1 stickersRepository$doesStickerExist$13;
        Ref.LongRef longRef5;
        Ref.ObjectRef objectRef3;
        int i4;
        BaseDao baseDao5;
        long jNanoTime;
        int i5;
        Ref.ObjectRef objectRef4;
        java.lang.String str7;
        sRK srk3;
        Ref.ObjectRef objectRef5;
        T t;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        if (continuation instanceof StickersRepository$doesStickerExist$1) {
            stickersRepository$doesStickerExist$1 = (StickersRepository$doesStickerExist$1) continuation;
            int i6 = stickersRepository$doesStickerExist$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                stickersRepository$doesStickerExist$1.label = i6 - Integer.MIN_VALUE;
            } else {
                stickersRepository$doesStickerExist$1 = new StickersRepository$doesStickerExist$1(this, continuation);
            }
        }
        java.lang.Object obj = stickersRepository$doesStickerExist$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i7 = stickersRepository$doesStickerExist$1.label;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    jNanoTime = stickersRepository$doesStickerExist$1.J$0;
                    i3 = stickersRepository$doesStickerExist$1.I$2;
                    int i8 = stickersRepository$doesStickerExist$1.I$1;
                    i = stickersRepository$doesStickerExist$1.I$0;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) stickersRepository$doesStickerExist$1.L$8;
                    Ref.LongRef longRef6 = (Ref.LongRef) stickersRepository$doesStickerExist$1.L$7;
                    Ref.ObjectRef objectRef7 = (Ref.ObjectRef) stickersRepository$doesStickerExist$1.L$6;
                    objectRef4 = (Ref.ObjectRef) stickersRepository$doesStickerExist$1.L$5;
                    longRef2 = (Ref.LongRef) stickersRepository$doesStickerExist$1.L$4;
                    baseDao2 = (BaseDao) stickersRepository$doesStickerExist$1.L$3;
                    str5 = (java.lang.String) stickersRepository$doesStickerExist$1.L$2;
                    java.lang.String str8 = (java.lang.String) stickersRepository$doesStickerExist$1.L$1;
                    srk3 = (sRK) stickersRepository$doesStickerExist$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        str7 = str8;
                        stickersRepository$doesStickerExist$13 = stickersRepository$doesStickerExist$1;
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
                        srk2 = srk3;
                        objectRef2 = objectRef4;
                        baseDao4 = baseDao2;
                        i2 = i8;
                        str6 = str8;
                        longRef4 = longRef2;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i3 < i - 1) {
                        }
                        i2 += i;
                        baseDao3 = baseDao;
                        srk = srk2;
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
                    return t2;
                }
                if (i7 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = stickersRepository$doesStickerExist$1.I$1;
                int i10 = stickersRepository$doesStickerExist$1.I$0;
                Ref.ObjectRef objectRef8 = (Ref.ObjectRef) stickersRepository$doesStickerExist$1.L$5;
                Ref.LongRef longRef7 = (Ref.LongRef) stickersRepository$doesStickerExist$1.L$4;
                BaseDao baseDao6 = (BaseDao) stickersRepository$doesStickerExist$1.L$3;
                java.lang.String str9 = (java.lang.String) stickersRepository$doesStickerExist$1.L$2;
                java.lang.String str10 = (java.lang.String) stickersRepository$doesStickerExist$1.L$1;
                srk2 = (sRK) stickersRepository$doesStickerExist$1.L$0;
                C56391yDq.AEQbTJ(obj);
                stickersRepository$doesStickerExist$12 = stickersRepository$doesStickerExist$1;
                i2 = i9;
                int i11 = i10;
                str3 = str9;
                str4 = str10;
                longRef3 = longRef7;
                int i12 = 1;
                objectRef = objectRef8;
                i2 += i12;
                baseDao3 = baseDao6;
                srk = srk2;
                i = i11;
                if (i2 < i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            message = e2.getMessage();
                            if (message == null) {
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
                        srk2 = srk;
                        objectRef2 = objectRef;
                        longRef4 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        try {
                            srk2 = srk;
                            objectRef2 = objectRef;
                            longRef4 = longRef3;
                            sQLiteDatabaseLockedException = e9;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i3 < i - 1) {
                                stickersRepository$doesStickerExist$1.L$0 = srk2;
                                stickersRepository$doesStickerExist$1.L$1 = str6;
                                stickersRepository$doesStickerExist$1.L$2 = str5;
                                stickersRepository$doesStickerExist$1.L$3 = baseDao4;
                                stickersRepository$doesStickerExist$1.L$4 = longRef4;
                                stickersRepository$doesStickerExist$1.L$5 = objectRef2;
                                stickersRepository$doesStickerExist$1.L$6 = null;
                                stickersRepository$doesStickerExist$1.L$7 = null;
                                stickersRepository$doesStickerExist$1.L$8 = null;
                                stickersRepository$doesStickerExist$1.I$0 = i;
                                stickersRepository$doesStickerExist$1.I$1 = i2;
                                stickersRepository$doesStickerExist$1.label = 2;
                                if (DelayKt.delay(((long) (i3 + 1)) * 50, stickersRepository$doesStickerExist$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                longRef3 = longRef4;
                                i11 = i;
                                baseDao6 = baseDao4;
                                stickersRepository$doesStickerExist$12 = stickersRepository$doesStickerExist$1;
                                str4 = str6;
                                str3 = str5;
                                objectRef = objectRef2;
                                i12 = 1;
                            } else {
                                longRef3 = longRef4;
                                i11 = i;
                                baseDao6 = baseDao4;
                                stickersRepository$doesStickerExist$12 = stickersRepository$doesStickerExist$1;
                                str4 = str6;
                                str3 = str5;
                                objectRef = objectRef2;
                                i12 = 1;
                            }
                            i2 += i12;
                            baseDao3 = baseDao6;
                            srk = srk2;
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
                        str5 = str3;
                        str6 = str4;
                        stickersRepository$doesStickerExist$1 = stickersRepository$doesStickerExist$12;
                        baseDao4 = baseDao3;
                        i3 = i2;
                        r0 = sQLiteDatabaseLockedException;
                    }
                    Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    StickersDao stickersDaoEZpvd = srk.EZpvd();
                    stickersRepository$doesStickerExist$12.L$0 = srk;
                    stickersRepository$doesStickerExist$12.L$1 = str4;
                    stickersRepository$doesStickerExist$12.L$2 = str3;
                    stickersRepository$doesStickerExist$12.L$3 = baseDao3;
                    stickersRepository$doesStickerExist$12.L$4 = longRef3;
                    stickersRepository$doesStickerExist$12.L$5 = objectRef;
                    stickersRepository$doesStickerExist$12.L$6 = objectRef9;
                    stickersRepository$doesStickerExist$12.L$7 = longRef3;
                    stickersRepository$doesStickerExist$12.L$8 = objectRef9;
                    stickersRepository$doesStickerExist$12.I$0 = i;
                    stickersRepository$doesStickerExist$12.I$1 = i2;
                    stickersRepository$doesStickerExist$12.I$2 = i2;
                    stickersRepository$doesStickerExist$12.J$0 = jNanoTime;
                    stickersRepository$doesStickerExist$12.label = 1;
                    java.lang.Object objDoesStickerExist = stickersDaoEZpvd.doesStickerExist(str4, str3, stickersRepository$doesStickerExist$12);
                    if (objDoesStickerExist == objCopydefault) {
                        return objCopydefault;
                    }
                    stickersRepository$doesStickerExist$13 = stickersRepository$doesStickerExist$12;
                    objectRef4 = objectRef;
                    longRef4 = longRef3;
                    longRef5 = longRef4;
                    str5 = str3;
                    srk3 = srk;
                    i5 = i2;
                    objectRef3 = objectRef9;
                    i4 = i;
                    baseDao5 = baseDao3;
                    str7 = str4;
                    objectRef5 = objectRef3;
                    t = objDoesStickerExist;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        stickersRepository$doesStickerExist$1 = stickersRepository$doesStickerExist$13;
                        srk2 = srk3;
                        str6 = str7;
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
                        srk = srk2;
                        i = i11;
                        if (i2 < i) {
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
                    objectRef3.element = t;
                    longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef5.element;
                    C44159sFm.EZpvd(baseDao5, longRef4.element);
                    return t22;
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
            StickersDao stickersDaoEZpvd2 = EZpvd();
            srk = this;
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            str3 = str2;
            baseDao3 = stickersDaoEZpvd2;
            stickersRepository$doesStickerExist$12 = stickersRepository$doesStickerExist$1;
            str4 = str;
            if (i2 < i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((StickerPacksResponse.SavedSticker) t2).copydefault()), java.lang.Long.valueOf(((StickerPacksResponse.SavedSticker) t).copydefault()));
        }
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
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Exception {
        StickersRepository$countStickersByPackId$1 stickersRepository$countStickersByPackId$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoEZpvd;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sRK srk;
        StickersRepository$countStickersByPackId$1 stickersRepository$countStickersByPackId$12;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.lang.String str3;
        Ref.ObjectRef objectRef2;
        int i4;
        sRK srk2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        sRK srk3;
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
        if (continuation instanceof StickersRepository$countStickersByPackId$1) {
            stickersRepository$countStickersByPackId$1 = (StickersRepository$countStickersByPackId$1) continuation;
            int i7 = stickersRepository$countStickersByPackId$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                stickersRepository$countStickersByPackId$1.label = i7 - Integer.MIN_VALUE;
            } else {
                stickersRepository$countStickersByPackId$1 = new StickersRepository$countStickersByPackId$1(this, continuation);
            }
        }
        java.lang.Object obj = stickersRepository$countStickersByPackId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = stickersRepository$countStickersByPackId$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = stickersRepository$countStickersByPackId$1.J$0;
                    i4 = stickersRepository$countStickersByPackId$1.I$2;
                    i3 = stickersRepository$countStickersByPackId$1.I$1;
                    i = stickersRepository$countStickersByPackId$1.I$0;
                    objectRef5 = (Ref.ObjectRef) stickersRepository$countStickersByPackId$1.L$7;
                    longRef3 = (Ref.LongRef) stickersRepository$countStickersByPackId$1.L$6;
                    objectRef4 = (Ref.ObjectRef) stickersRepository$countStickersByPackId$1.L$5;
                    objectRef2 = (Ref.ObjectRef) stickersRepository$countStickersByPackId$1.L$4;
                    longRef2 = (Ref.LongRef) stickersRepository$countStickersByPackId$1.L$3;
                    baseDaoEZpvd = (BaseDao) stickersRepository$countStickersByPackId$1.L$2;
                    str4 = (java.lang.String) stickersRepository$countStickersByPackId$1.L$1;
                    srk2 = (sRK) stickersRepository$countStickersByPackId$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        str3 = str4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        srk3 = srk2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        stickersRepository$countStickersByPackId$12 = stickersRepository$countStickersByPackId$1;
                        i2 = i + i;
                        srk = srk3;
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
                        C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
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
                int i11 = stickersRepository$countStickersByPackId$1.I$1;
                int i12 = stickersRepository$countStickersByPackId$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) stickersRepository$countStickersByPackId$1.L$4;
                longRef4 = (Ref.LongRef) stickersRepository$countStickersByPackId$1.L$3;
                BaseDao baseDao3 = (BaseDao) stickersRepository$countStickersByPackId$1.L$2;
                java.lang.String str5 = (java.lang.String) stickersRepository$countStickersByPackId$1.L$1;
                srk3 = (sRK) stickersRepository$countStickersByPackId$1.L$0;
                C56391yDq.AEQbTJ(obj);
                StickersRepository$countStickersByPackId$1 stickersRepository$countStickersByPackId$13 = stickersRepository$countStickersByPackId$1;
                int i13 = 1;
                baseDaoEZpvd = baseDao3;
                str2 = str5;
                i = i12;
                objectRef = objectRef6;
                stickersRepository$countStickersByPackId$12 = stickersRepository$countStickersByPackId$13;
                i2 = i11 + i13;
                srk = srk3;
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
                            C44159sFm.EZpvd(baseDaoEZpvd, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        str3 = str2;
                        stickersRepository$countStickersByPackId$1 = stickersRepository$countStickersByPackId$12;
                        srk2 = srk;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        srk3 = srk2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            stickersRepository$countStickersByPackId$1.L$0 = srk3;
                            stickersRepository$countStickersByPackId$1.L$1 = str3;
                            stickersRepository$countStickersByPackId$1.L$2 = baseDao2;
                            stickersRepository$countStickersByPackId$1.L$3 = longRef4;
                            stickersRepository$countStickersByPackId$1.L$4 = objectRef3;
                            stickersRepository$countStickersByPackId$1.L$5 = null;
                            stickersRepository$countStickersByPackId$1.L$6 = null;
                            stickersRepository$countStickersByPackId$1.L$7 = null;
                            stickersRepository$countStickersByPackId$1.I$0 = i6;
                            stickersRepository$countStickersByPackId$1.I$1 = i5;
                            stickersRepository$countStickersByPackId$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, stickersRepository$countStickersByPackId$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            stickersRepository$countStickersByPackId$13 = stickersRepository$countStickersByPackId$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoEZpvd = baseDao4;
                        } else {
                            stickersRepository$countStickersByPackId$13 = stickersRepository$countStickersByPackId$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoEZpvd = baseDao5;
                        }
                        stickersRepository$countStickersByPackId$12 = stickersRepository$countStickersByPackId$13;
                        i2 = i11 + i13;
                        srk = srk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        str3 = str2;
                        stickersRepository$countStickersByPackId$1 = stickersRepository$countStickersByPackId$12;
                        srk2 = srk;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        srk3 = srk2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoEZpvd;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        stickersRepository$countStickersByPackId$12 = stickersRepository$countStickersByPackId$13;
                        i2 = i11 + i13;
                        srk = srk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    StickersDao stickersDaoEZpvd = srk.EZpvd();
                    stickersRepository$countStickersByPackId$12.L$0 = srk;
                    stickersRepository$countStickersByPackId$12.L$1 = str2;
                    stickersRepository$countStickersByPackId$12.L$2 = baseDaoEZpvd;
                    stickersRepository$countStickersByPackId$12.L$3 = longRef3;
                    stickersRepository$countStickersByPackId$12.L$4 = objectRef;
                    stickersRepository$countStickersByPackId$12.L$5 = objectRef5;
                    stickersRepository$countStickersByPackId$12.L$6 = longRef3;
                    stickersRepository$countStickersByPackId$12.L$7 = objectRef5;
                    stickersRepository$countStickersByPackId$12.I$0 = i;
                    stickersRepository$countStickersByPackId$12.I$1 = i2;
                    stickersRepository$countStickersByPackId$12.I$2 = i2;
                    stickersRepository$countStickersByPackId$12.J$0 = jNanoTime;
                    stickersRepository$countStickersByPackId$12.label = 1;
                    java.lang.Object objCountStickersByPackId = stickersDaoEZpvd.countStickersByPackId(str2, stickersRepository$countStickersByPackId$12);
                    if (objCountStickersByPackId == objCopydefault) {
                        return objCopydefault;
                    }
                    str4 = str2;
                    stickersRepository$countStickersByPackId$1 = stickersRepository$countStickersByPackId$12;
                    srk2 = srk;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoEZpvd;
                    i6 = i14;
                    t = objCountStickersByPackId;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        srk3 = srk2;
                        objectRef3 = objectRef2;
                        str3 = str4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        stickersRepository$countStickersByPackId$12 = stickersRepository$countStickersByPackId$13;
                        i2 = i11 + i13;
                        srk = srk3;
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
                C44159sFm.EZpvd(baseDaoEZpvd, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoEZpvd = EZpvd();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            srk = this;
            stickersRepository$countStickersByPackId$12 = stickersRepository$countStickersByPackId$1;
            str2 = str;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoEZpvd = baseDao;
        }
    }

    /* JADX DEBUG: Duplicate block (B:184:0x0503) to fix multi-entry loop: BACK_EDGE: B:184:0x0503 -> B:182:0x04f5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:154:0x0478 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:91:0x02e9 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v76, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.okinc.okimcore.common.database.BaseDao */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: com.okinc.okimcore.common.database.BaseDao */
    /* JADX DEBUG: Multi-variable search result rejected for r2v21, resolved type: com.okinc.okimcore.common.database.BaseDao */
    /* JADX DEBUG: Multi-variable search result rejected for r2v59, resolved type: com.okinc.okimcore.common.database.BaseDao */
    /* JADX DEBUG: Multi-variable search result rejected for r2v77, resolved type: com.okinc.okimcore.common.database.BaseDao */
    /* JADX WARN: Can't wrap try/catch for region: R(16:209|60|61|196|62|63|198|64|65|200|66|(2:69|67)|220|71|72|(1:74)(6:75|217|76|77|56|(2:58|(4:128|(1:130)|131|132)(0))(2:133|(0)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0320, code lost:
    
        r30 = r29;
        r14 = r1;
        r1 = r2;
        r2 = r4;
        r12 = r5;
        r5 = r15;
        r29 = r20;
        r15 = r21;
        r26 = r8;
        r8 = r6;
        r6 = r11;
        r11 = r26;
        r0 = r0;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x033e, code lost:
    
        r23 = r3;
        r1.L$0 = r12;
        r1.L$1 = r14;
        r1.L$2 = r11;
        r1.L$3 = r9;
        r1.L$4 = r8;
        r1.L$5 = r7;
        r1.L$6 = r6;
        r1.L$7 = r5;
        r1.L$8 = null;
        r1.L$9 = null;
        r1.L$10 = null;
        r1.I$0 = r10;
        r1.I$1 = r4;
        r1.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0369, code lost:
    
        r3 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x036b, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(((long) (r2 + 1)) * 50, r1) == r3) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x036d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x036e, code lost:
    
        r13 = r30;
        r2 = r4;
        r4 = r10;
        r10 = r11;
        r11 = r15;
        r15 = r12;
        r12 = r29;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x038c, code lost:
    
        r13 = r29;
        r2 = r1;
        r1 = r14;
        r14 = r30;
        r26 = r15;
        r15 = r5;
        r5 = r12;
        r12 = r26;
        r27 = r11;
        r11 = r6;
        r6 = r8;
        r8 = r27;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0241, code lost:
    
        r3 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02e4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02e9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02eb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02ec, code lost:
    
        r21 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x03a4: MOVE (r15 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:125:0x03a4 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x030e A[Catch: all -> 0x00f7, TryCatch #12 {all -> 0x00f7, blocks: (B:33:0x00f2, B:115:0x0331, B:117:0x033e, B:101:0x02fe, B:102:0x0301, B:106:0x0308, B:108:0x030e, B:110:0x0318, B:111:0x031b, B:112:0x031c, B:113:0x031f), top: B:202:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x033e A[Catch: all -> 0x00f7, TRY_LEAVE, TryCatch #12 {all -> 0x00f7, blocks: (B:33:0x00f2, B:115:0x0331, B:117:0x033e, B:101:0x02fe, B:102:0x0301, B:106:0x0308, B:108:0x030e, B:110:0x0318, B:111:0x031b, B:112:0x031c, B:113:0x031f), top: B:202:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0493 A[Catch: all -> 0x005d, TryCatch #29 {all -> 0x005d, blocks: (B:15:0x0052, B:160:0x0484, B:161:0x0487, B:165:0x048d, B:167:0x0493, B:169:0x049d, B:170:0x04a0, B:171:0x04a1, B:172:0x04a4), top: B:202:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04c7 A[Catch: all -> 0x0510, TRY_LEAVE, TryCatch #19 {all -> 0x0510, blocks: (B:177:0x04ba, B:179:0x04c7), top: B:203:0x04ba }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v54, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r15v19, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r4v12, types: [T, kotlin.Unit] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x036e -> B:122:0x0377). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x038c -> B:124:0x03a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01d3 -> B:59:0x01f1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.util.Set<C44491sRu> set, @NotNull java.util.List<StickerEntity> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        StickersRepository$deleteAndInsert$1 stickersRepository$deleteAndInsert$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        Ref.LongRef longRef3;
        BaseDao baseDao2;
        sRK srk;
        java.util.Map map;
        StickersRepository$deleteAndInsert$1 stickersRepository$deleteAndInsert$12;
        java.util.Iterator it;
        java.util.List<StickerEntity> list2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.List<StickerEntity> list3;
        sRK srk2;
        java.util.Map map2;
        int i;
        java.util.Iterator it2;
        Map.Entry entry;
        BaseDao baseDao3;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef;
        int i2;
        int i3;
        ?? r0;
        Ref.LongRef longRef5;
        Map.Entry entry2;
        java.util.Map map3;
        Ref.LongRef longRef6;
        Ref.ObjectRef objectRef2;
        int i4;
        int i5;
        java.util.List<StickerEntity> list4;
        BaseDao baseDao4;
        int i6;
        java.util.List<StickerEntity> list5;
        Ref.ObjectRef objectRef3;
        java.lang.String str4;
        java.util.Iterator it3;
        java.lang.String str5;
        Ref.ObjectRef objectRef4;
        long j;
        int i7;
        sRK srk3;
        StickersRepository$deleteAndInsert$1 stickersRepository$deleteAndInsert$13;
        BaseDao baseDao5;
        Ref.LongRef longRef7;
        Ref.ObjectRef objectRef5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.Exception e3;
        java.lang.IllegalStateException e4;
        java.lang.String message2;
        BaseDao baseDao6;
        Ref.LongRef longRef8;
        java.lang.String str8;
        java.lang.String str9;
        sRK srk4;
        java.util.List<StickerEntity> list6;
        int i8;
        Ref.LongRef longRef9;
        int i9;
        int i10;
        ?? r02;
        Ref.ObjectRef objectRef6;
        java.util.List<StickerEntity> list7;
        java.lang.String str10;
        long jNanoTime;
        Ref.ObjectRef objectRef7;
        int i11;
        BaseDao baseDao7;
        Ref.ObjectRef objectRef8;
        java.lang.String str11;
        java.lang.String str12;
        if (continuation instanceof StickersRepository$deleteAndInsert$1) {
            stickersRepository$deleteAndInsert$1 = (StickersRepository$deleteAndInsert$1) continuation;
            int i12 = stickersRepository$deleteAndInsert$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                stickersRepository$deleteAndInsert$1.label = i12 - Integer.MIN_VALUE;
            } else {
                stickersRepository$deleteAndInsert$1 = new StickersRepository$deleteAndInsert$1(this, continuation);
            }
        }
        java.lang.Object obj = stickersRepository$deleteAndInsert$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i13 = stickersRepository$deleteAndInsert$1.label;
        java.lang.String str13 = "Database Operation failed after ";
        java.lang.String str14 = " attempts";
        java.lang.String str15 = "not open";
        try {
            try {
                if (i13 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (java.lang.Object obj2 : set) {
                        java.lang.String strOLrzqt = ((C44491sRu) obj2).OLrzqt();
                        java.lang.Object arrayList = linkedHashMap.get(strOLrzqt);
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                            linkedHashMap.put(strOLrzqt, arrayList);
                        }
                        ((java.util.List) arrayList).add(obj2);
                    }
                    java.util.Iterator it4 = linkedHashMap.entrySet().iterator();
                    srk = this;
                    map = linkedHashMap;
                    stickersRepository$deleteAndInsert$12 = stickersRepository$deleteAndInsert$1;
                    it = it4;
                    list2 = list;
                    if (it.hasNext()) {
                    }
                } else if (i13 == 1) {
                    long j2 = stickersRepository$deleteAndInsert$1.J$0;
                    int i14 = stickersRepository$deleteAndInsert$1.I$2;
                    int i15 = stickersRepository$deleteAndInsert$1.I$1;
                    int i16 = stickersRepository$deleteAndInsert$1.I$0;
                    Ref.ObjectRef objectRef9 = (Ref.ObjectRef) stickersRepository$deleteAndInsert$1.L$10;
                    Ref.LongRef longRef10 = (Ref.LongRef) stickersRepository$deleteAndInsert$1.L$9;
                    Ref.ObjectRef objectRef10 = (Ref.ObjectRef) stickersRepository$deleteAndInsert$1.L$8;
                    Ref.ObjectRef objectRef11 = (Ref.ObjectRef) stickersRepository$deleteAndInsert$1.L$7;
                    longRef2 = (Ref.LongRef) stickersRepository$deleteAndInsert$1.L$6;
                    BaseDao baseDao8 = (BaseDao) stickersRepository$deleteAndInsert$1.L$5;
                    Map.Entry entry3 = (Map.Entry) stickersRepository$deleteAndInsert$1.L$4;
                    it3 = (java.util.Iterator) stickersRepository$deleteAndInsert$1.L$3;
                    java.util.Map map4 = (java.util.Map) stickersRepository$deleteAndInsert$1.L$2;
                    java.util.List<StickerEntity> list8 = (java.util.List) stickersRepository$deleteAndInsert$1.L$1;
                    sRK srk5 = (sRK) stickersRepository$deleteAndInsert$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        objectRef5 = objectRef9;
                        map3 = map4;
                        str4 = "not open";
                        baseDao5 = baseDao8;
                        list5 = list8;
                        objectRef3 = objectRef11;
                        objectRef4 = objectRef10;
                        i = i16;
                        srk3 = srk5;
                        entry2 = entry3;
                        i6 = i14;
                        str5 = " attempts";
                        j = j2;
                        stickersRepository$deleteAndInsert$13 = stickersRepository$deleteAndInsert$1;
                        longRef7 = longRef2;
                        str3 = "Database Operation failed after ";
                        longRef5 = longRef10;
                        i7 = i15;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                        entry = entry3;
                        i2 = i15;
                        i = i16;
                        str = "not open";
                        objectRef = objectRef11;
                        longRef4 = longRef2;
                        it2 = it3;
                        list3 = list8;
                        baseDao3 = baseDao8;
                        str3 = "Database Operation failed after ";
                        str2 = " attempts";
                        map2 = map4;
                        srk2 = srk5;
                        i3 = i14;
                        r0 = e5;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                        objectRef.element = r0;
                        if (i3 < i - 1) {
                        }
                    } catch (java.lang.IllegalStateException e6) {
                        e2 = e6;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e7) {
                        e = e7;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        baseDao = baseDao8;
                        C44159sFm.EZpvd(baseDao, longRef2.element);
                        throw th;
                    }
                    objectRef5.element = Unit.INSTANCE;
                    longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t = objectRef4.element;
                    C44159sFm.EZpvd(baseDao5, longRef7.element);
                    list2 = list5;
                    stickersRepository$deleteAndInsert$12 = stickersRepository$deleteAndInsert$13;
                    srk = srk3;
                    map = map3;
                    str13 = str3;
                    str14 = str5;
                    it = it3;
                    str15 = str4;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            long j3 = stickersRepository$deleteAndInsert$1.J$0;
                            i4 = stickersRepository$deleteAndInsert$1.I$2;
                            i11 = stickersRepository$deleteAndInsert$1.I$1;
                            i5 = stickersRepository$deleteAndInsert$1.I$0;
                            objectRef7 = (Ref.ObjectRef) stickersRepository$deleteAndInsert$1.L$7;
                            longRef6 = (Ref.LongRef) stickersRepository$deleteAndInsert$1.L$6;
                            Ref.ObjectRef objectRef12 = (Ref.ObjectRef) stickersRepository$deleteAndInsert$1.L$5;
                            objectRef2 = (Ref.ObjectRef) stickersRepository$deleteAndInsert$1.L$4;
                            Ref.LongRef longRef11 = (Ref.LongRef) stickersRepository$deleteAndInsert$1.L$3;
                            BaseDao baseDao9 = (BaseDao) stickersRepository$deleteAndInsert$1.L$2;
                            list7 = (java.util.List) stickersRepository$deleteAndInsert$1.L$1;
                            sRK srk6 = (sRK) stickersRepository$deleteAndInsert$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj);
                                str8 = "not open";
                                objectRef6 = objectRef2;
                                objectRef8 = objectRef12;
                                str10 = " attempts";
                                jNanoTime = j3;
                                baseDao7 = baseDao9;
                                srk = srk6;
                                longRef8 = longRef11;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                                longRef9 = longRef11;
                                srk4 = srk6;
                                i10 = i4;
                                i9 = i11;
                                i8 = i5;
                                str8 = "not open";
                                list6 = list7;
                                baseDao6 = baseDao9;
                                str9 = " attempts";
                                r02 = e8;
                                C44159sFm.copydefault(r02, (java.lang.Exception) objectRef2.element);
                                objectRef2.element = r02;
                                if (i10 < i8 - 1) {
                                }
                                sRK srk7 = srk4;
                                longRef6 = longRef9;
                                srk = srk7;
                                int i17 = i9 + 1;
                                baseDao4 = baseDao6;
                                list4 = list6;
                                i4 = i17;
                                i5 = i8;
                                if (i4 < i5) {
                                }
                            } catch (java.lang.IllegalStateException e9) {
                                e4 = e9;
                                message2 = e4.getMessage();
                                if (message2 == null) {
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            } catch (java.lang.Exception e10) {
                                e3 = e10;
                                C44159sFm.OLrzqt(e3);
                                throw e3;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                longRef3 = longRef11;
                                baseDao2 = baseDao9;
                                C44159sFm.EZpvd(baseDao2, longRef3.element);
                                throw th;
                            }
                            ?? r15 = Unit.INSTANCE;
                            objectRef7.element = r15;
                            longRef6.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            T t2 = objectRef8.element;
                            C44159sFm.EZpvd(baseDao7, longRef8.element);
                            return r15;
                        }
                        if (i13 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i9 = stickersRepository$deleteAndInsert$1.I$1;
                        i8 = stickersRepository$deleteAndInsert$1.I$0;
                        Ref.ObjectRef objectRef13 = (Ref.ObjectRef) stickersRepository$deleteAndInsert$1.L$4;
                        longRef9 = (Ref.LongRef) stickersRepository$deleteAndInsert$1.L$3;
                        baseDao6 = (BaseDao) stickersRepository$deleteAndInsert$1.L$2;
                        list6 = (java.util.List) stickersRepository$deleteAndInsert$1.L$1;
                        srk4 = (sRK) stickersRepository$deleteAndInsert$1.L$0;
                        C56391yDq.AEQbTJ(obj);
                        objectRef2 = objectRef13;
                        sRK srk72 = srk4;
                        longRef6 = longRef9;
                        srk = srk72;
                        int i172 = i9 + 1;
                        baseDao4 = baseDao6;
                        list4 = list6;
                        i4 = i172;
                        i5 = i8;
                        if (i4 < i5) {
                            try {
                                try {
                                } catch (java.lang.Exception e11) {
                                    e3 = e11;
                                    C44159sFm.OLrzqt(e3);
                                    throw e3;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    baseDao6 = baseDao4;
                                    longRef8 = longRef6;
                                    longRef3 = longRef8;
                                    baseDao2 = baseDao6;
                                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                                    throw th;
                                }
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e12) {
                                e = e12;
                                str11 = str14;
                                str12 = str15;
                            } catch (java.lang.IllegalStateException e13) {
                                e4 = e13;
                            }
                            objectRef7 = new Ref.ObjectRef();
                            str11 = str14;
                            str12 = str15;
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e14) {
                                try {
                                    e = e14;
                                    C44159sFm.copydefault(r02, (java.lang.Exception) objectRef2.element);
                                    objectRef2.element = r02;
                                    if (i10 < i8 - 1) {
                                        java.lang.String str16 = str9;
                                        stickersRepository$deleteAndInsert$1.L$0 = srk4;
                                        stickersRepository$deleteAndInsert$1.L$1 = list6;
                                        stickersRepository$deleteAndInsert$1.L$2 = baseDao6;
                                        stickersRepository$deleteAndInsert$1.L$3 = longRef9;
                                        stickersRepository$deleteAndInsert$1.L$4 = objectRef2;
                                        stickersRepository$deleteAndInsert$1.L$5 = null;
                                        stickersRepository$deleteAndInsert$1.L$6 = null;
                                        stickersRepository$deleteAndInsert$1.L$7 = null;
                                        stickersRepository$deleteAndInsert$1.L$8 = null;
                                        stickersRepository$deleteAndInsert$1.L$9 = null;
                                        stickersRepository$deleteAndInsert$1.L$10 = null;
                                        stickersRepository$deleteAndInsert$1.I$0 = i8;
                                        stickersRepository$deleteAndInsert$1.I$1 = i9;
                                        stickersRepository$deleteAndInsert$1.label = 4;
                                        if (DelayKt.delay(((long) (i10 + 1)) * 50, stickersRepository$deleteAndInsert$1) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        str14 = str16;
                                        str15 = str8;
                                    } else {
                                        str14 = str9;
                                        str15 = str8;
                                    }
                                    sRK srk722 = srk4;
                                    longRef6 = longRef9;
                                    srk = srk722;
                                    int i1722 = i9 + 1;
                                    baseDao4 = baseDao6;
                                    list4 = list6;
                                    i4 = i1722;
                                    i5 = i8;
                                    if (i4 < i5) {
                                    }
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    longRef8 = longRef9;
                                    longRef3 = longRef8;
                                    baseDao2 = baseDao6;
                                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                                    throw th;
                                }
                                str8 = str12;
                                str9 = str11;
                                i8 = i5;
                                list6 = list4;
                                i9 = i4;
                                baseDao6 = baseDao4;
                                i10 = i9;
                                Ref.LongRef longRef12 = longRef6;
                                srk4 = srk;
                                longRef9 = longRef12;
                                r02 = e;
                            } catch (java.lang.IllegalStateException e15) {
                                e4 = e15;
                                str15 = str12;
                                message2 = e4.getMessage();
                                if (message2 == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) str15, false, 2, (java.lang.Object) null)) {
                                    C44159sFm.OLrzqt(e4);
                                    throw e4;
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            }
                            jNanoTime = java.lang.System.nanoTime();
                            StickersDao stickersDaoEZpvd = srk.EZpvd();
                            stickersRepository$deleteAndInsert$1.L$0 = srk;
                            stickersRepository$deleteAndInsert$1.L$1 = list4;
                            stickersRepository$deleteAndInsert$1.L$2 = baseDao4;
                            stickersRepository$deleteAndInsert$1.L$3 = longRef6;
                            stickersRepository$deleteAndInsert$1.L$4 = objectRef2;
                            stickersRepository$deleteAndInsert$1.L$5 = objectRef7;
                            stickersRepository$deleteAndInsert$1.L$6 = longRef6;
                            stickersRepository$deleteAndInsert$1.L$7 = objectRef7;
                            stickersRepository$deleteAndInsert$1.L$8 = null;
                            stickersRepository$deleteAndInsert$1.L$9 = null;
                            stickersRepository$deleteAndInsert$1.L$10 = null;
                            stickersRepository$deleteAndInsert$1.I$0 = i5;
                            stickersRepository$deleteAndInsert$1.I$1 = i4;
                            stickersRepository$deleteAndInsert$1.I$2 = i4;
                            stickersRepository$deleteAndInsert$1.J$0 = jNanoTime;
                            stickersRepository$deleteAndInsert$1.label = 3;
                            if (stickersDaoEZpvd.insert(list4, stickersRepository$deleteAndInsert$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            str8 = str12;
                            list7 = list4;
                            objectRef8 = objectRef7;
                            objectRef6 = objectRef2;
                            baseDao7 = baseDao4;
                            str10 = str11;
                            longRef8 = longRef6;
                            i11 = i4;
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e16) {
                                srk4 = srk;
                                str9 = str10;
                                objectRef2 = objectRef6;
                                longRef9 = longRef8;
                                i10 = i4;
                                baseDao6 = baseDao7;
                                i9 = i11;
                                i8 = i5;
                                list6 = list7;
                                r02 = e16;
                                C44159sFm.copydefault(r02, (java.lang.Exception) objectRef2.element);
                                objectRef2.element = r02;
                                if (i10 < i8 - 1) {
                                }
                                sRK srk7222 = srk4;
                                longRef6 = longRef9;
                                srk = srk7222;
                                int i17222 = i9 + 1;
                                baseDao4 = baseDao6;
                                list4 = list6;
                                i4 = i17222;
                                i5 = i8;
                                if (i4 < i5) {
                                }
                            } catch (java.lang.IllegalStateException e17) {
                                e4 = e17;
                                longRef6 = longRef8;
                                baseDao4 = baseDao7;
                                str15 = str8;
                                message2 = e4.getMessage();
                                if (message2 == null) {
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            } catch (java.lang.Exception e18) {
                                e3 = e18;
                                longRef6 = longRef8;
                                baseDao4 = baseDao7;
                                C44159sFm.OLrzqt(e3);
                                throw e3;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                baseDao6 = baseDao7;
                                longRef3 = longRef8;
                                baseDao2 = baseDao6;
                                C44159sFm.EZpvd(baseDao2, longRef3.element);
                                throw th;
                            }
                            ?? r152 = Unit.INSTANCE;
                            objectRef7.element = r152;
                            longRef6.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            T t22 = objectRef8.element;
                            C44159sFm.EZpvd(baseDao7, longRef8.element);
                            return r152;
                        }
                        java.lang.String str17 = str14;
                        C44159sFm.EZpvd(baseDao4, longRef6.element);
                        java.lang.Exception exc = (java.lang.Exception) objectRef2.element;
                        if (exc == null) {
                            exc = new java.lang.Exception(str13 + i5 + str17);
                        }
                        C44159sFm.OLrzqt(exc);
                        throw exc;
                    }
                    int i18 = stickersRepository$deleteAndInsert$1.I$1;
                    int i19 = stickersRepository$deleteAndInsert$1.I$0;
                    objectRef = (Ref.ObjectRef) stickersRepository$deleteAndInsert$1.L$7;
                    longRef4 = (Ref.LongRef) stickersRepository$deleteAndInsert$1.L$6;
                    BaseDao baseDao10 = (BaseDao) stickersRepository$deleteAndInsert$1.L$5;
                    entry = (Map.Entry) stickersRepository$deleteAndInsert$1.L$4;
                    it2 = (java.util.Iterator) stickersRepository$deleteAndInsert$1.L$3;
                    java.util.Map map5 = (java.util.Map) stickersRepository$deleteAndInsert$1.L$2;
                    list3 = (java.util.List) stickersRepository$deleteAndInsert$1.L$1;
                    sRK srk8 = (sRK) stickersRepository$deleteAndInsert$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    BaseDao baseDao11 = baseDao10;
                    int i20 = i18;
                    stickersRepository$deleteAndInsert$12 = stickersRepository$deleteAndInsert$1;
                    java.util.List<StickerEntity> list9 = list3;
                    java.lang.String str18 = str15;
                    java.lang.String str19 = str14;
                    java.lang.String str20 = str13;
                    longRef5 = longRef4;
                    entry2 = entry;
                    map3 = map5;
                    i = i19;
                    i2 = i20;
                    sRK srk9 = srk8;
                    Ref.ObjectRef objectRef14 = objectRef;
                    srk = srk9;
                    BaseDao baseDao12 = baseDao11;
                    i2++;
                    BaseDao baseDao13 = baseDao12;
                    if (i2 >= i) {
                        try {
                            try {
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e19) {
                                    e = e19;
                                    str7 = str20;
                                    str5 = str19;
                                    str6 = str18;
                                } catch (java.lang.IllegalStateException e20) {
                                    e2 = e20;
                                    str6 = str18;
                                }
                                Ref.ObjectRef objectRef15 = new Ref.ObjectRef();
                                long jNanoTime2 = java.lang.System.nanoTime();
                                str7 = str20;
                                StickersDao stickersDaoEZpvd2 = srk.EZpvd();
                                java.lang.Object obj3 = objCopydefault;
                                java.lang.String str21 = (java.lang.String) entry2.getKey();
                                java.lang.Iterable iterable = (java.lang.Iterable) entry2.getValue();
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
                                java.util.Iterator it5 = iterable.iterator();
                                while (it5.hasNext()) {
                                    arrayList2.add(((C44491sRu) it5.next()).KWHzl());
                                }
                                java.util.Set<java.lang.String> setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
                                stickersRepository$deleteAndInsert$12.L$0 = srk;
                                stickersRepository$deleteAndInsert$12.L$1 = list9;
                                stickersRepository$deleteAndInsert$12.L$2 = map3;
                                stickersRepository$deleteAndInsert$12.L$3 = it2;
                                stickersRepository$deleteAndInsert$12.L$4 = entry2;
                                stickersRepository$deleteAndInsert$12.L$5 = baseDao13;
                                stickersRepository$deleteAndInsert$12.L$6 = longRef5;
                                stickersRepository$deleteAndInsert$12.L$7 = objectRef14;
                                stickersRepository$deleteAndInsert$12.L$8 = objectRef15;
                                stickersRepository$deleteAndInsert$12.L$9 = longRef5;
                                stickersRepository$deleteAndInsert$12.L$10 = objectRef15;
                                stickersRepository$deleteAndInsert$12.I$0 = i;
                                stickersRepository$deleteAndInsert$12.I$1 = i2;
                                stickersRepository$deleteAndInsert$12.I$2 = i2;
                                j = jNanoTime2;
                                stickersRepository$deleteAndInsert$12.J$0 = j;
                                stickersRepository$deleteAndInsert$12.label = 1;
                                java.lang.Object objDelete = stickersDaoEZpvd2.delete(str21, setOqFWZa, stickersRepository$deleteAndInsert$12);
                                objCopydefault = obj3;
                                if (objDelete == objCopydefault) {
                                    return objCopydefault;
                                }
                                str4 = str6;
                                objectRef5 = objectRef15;
                                objectRef4 = objectRef5;
                                list5 = list9;
                                i6 = i2;
                                longRef7 = longRef5;
                                objectRef3 = objectRef14;
                                str3 = str7;
                                it3 = it2;
                                i7 = i6;
                                sRK srk10 = srk;
                                stickersRepository$deleteAndInsert$13 = stickersRepository$deleteAndInsert$12;
                                baseDao5 = baseDao13;
                                srk3 = srk10;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e21) {
                                    list3 = list5;
                                    srk2 = srk3;
                                    map2 = map3;
                                    i2 = i7;
                                    str2 = str5;
                                    it2 = it3;
                                    baseDao3 = baseDao5;
                                    entry = entry2;
                                    i3 = i6;
                                    longRef4 = longRef7;
                                    stickersRepository$deleteAndInsert$1 = stickersRepository$deleteAndInsert$13;
                                    str = str4;
                                    objectRef = objectRef3;
                                    r0 = e21;
                                    C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                                    objectRef.element = r0;
                                    if (i3 < i - 1) {
                                    }
                                } catch (java.lang.IllegalStateException e22) {
                                    e2 = e22;
                                    str15 = str4;
                                    message = e2.getMessage();
                                    if (message == null) {
                                    }
                                    C44159sFm.copydefault(e2);
                                    throw e2;
                                } catch (java.lang.Exception e23) {
                                    e = e23;
                                    C44159sFm.OLrzqt(e);
                                    throw e;
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    longRef2 = longRef7;
                                    baseDao = baseDao5;
                                    C44159sFm.EZpvd(baseDao, longRef2.element);
                                    throw th;
                                }
                                objectRef5.element = Unit.INSTANCE;
                                longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                                T t3 = objectRef4.element;
                                C44159sFm.EZpvd(baseDao5, longRef7.element);
                                list2 = list5;
                                stickersRepository$deleteAndInsert$12 = stickersRepository$deleteAndInsert$13;
                                srk = srk3;
                                map = map3;
                                str13 = str3;
                                str14 = str5;
                                it = it3;
                                str15 = str4;
                                if (it.hasNext()) {
                                    entry2 = (Map.Entry) it.next();
                                    StickersDao stickersDaoEZpvd3 = srk.EZpvd();
                                    Ref.LongRef longRef13 = new Ref.LongRef();
                                    objectRef14 = new Ref.ObjectRef();
                                    str18 = str15;
                                    i = 3;
                                    it2 = it;
                                    str19 = str14;
                                    list9 = list2;
                                    str20 = str13;
                                    longRef5 = longRef13;
                                    map3 = map;
                                    i2 = 0;
                                    baseDao13 = stickersDaoEZpvd3;
                                    if (i2 >= i) {
                                        java.lang.String str22 = str20;
                                        java.lang.String str23 = str19;
                                        C44159sFm.EZpvd(baseDao13, longRef5.element);
                                        java.lang.Exception exc2 = (java.lang.Exception) objectRef14.element;
                                        if (exc2 == null) {
                                            exc2 = new java.lang.Exception(str22 + i + str23);
                                        }
                                        C44159sFm.OLrzqt(exc2);
                                        throw exc2;
                                    }
                                } else {
                                    StickersDao stickersDaoEZpvd4 = srk.EZpvd();
                                    longRef6 = new Ref.LongRef();
                                    objectRef2 = new Ref.ObjectRef();
                                    i4 = 0;
                                    i5 = 3;
                                    list4 = list2;
                                    StickersRepository$deleteAndInsert$1 stickersRepository$deleteAndInsert$14 = stickersRepository$deleteAndInsert$12;
                                    baseDao4 = stickersDaoEZpvd4;
                                    stickersRepository$deleteAndInsert$1 = stickersRepository$deleteAndInsert$14;
                                    if (i4 < i5) {
                                    }
                                }
                            } catch (java.lang.Exception e24) {
                                e = e24;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                baseDao = baseDao13;
                                longRef2 = longRef5;
                                C44159sFm.EZpvd(baseDao, longRef2.element);
                                throw th;
                            }
                        } catch (java.lang.IllegalStateException e25) {
                            e2 = e25;
                            str15 = str6;
                            message = e2.getMessage();
                            if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) str15, false, 2, (java.lang.Object) null)) {
                                C44159sFm.OLrzqt(e2);
                                throw e2;
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        }
                        str5 = str19;
                        str6 = str18;
                    }
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            longRef2 = longRef;
            baseDao = 4;
        }
    }
}
