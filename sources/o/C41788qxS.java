package o;

import com.okinc.market.search.core.engine.repository.SearchInstrumentRepository$getAllInstrument$1;
import com.okinc.market.search.core.engine.repository.SearchInstrumentRepository$initData$1;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qxS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41788qxS {
    public final CoroutineDispatcher EZpvd;
    public final Mutex KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final java.util.List<BizInstrument> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BizInstrument> copydefault() {
        return this.copydefault;
    }

    @yCM
    public C41788qxS(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = new java.util.ArrayList();
        this.KWHzl = MutexKt.Mutex$default(false, 1, null);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qxU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41788qxS.KWHzl();
            }
        });
    }

    public final java.util.Map<java.lang.String, InterfaceC38386pWw> OLrzqt() {
        return (java.util.Map) this.OLrzqt.getValue();
    }

    public static final java.util.Map KWHzl() {
        java.util.ArrayList<java.lang.String> arrayListEjfBZ;
        java.util.List<java.lang.String> listFJNWhG;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (arrayListEjfBZ = interfaceC54581xNrOLrzqt.ejfBZ()) != null && (listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayListEjfBZ)) != null) {
            listFJNWhG.remove("MARGIN");
            for (java.lang.String str : listFJNWhG) {
                linkedHashMap.put(str, C38385pWv.EZpvd(str));
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:15:0x003f, B:47:0x00fd, B:51:0x010a, B:50:0x0106), top: B:58:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SearchInstrumentRepository$initData$1 searchInstrumentRepository$initData$1;
        boolean z2;
        C41788qxS c41788qxS;
        C41788qxS c41788qxS2;
        java.util.Iterator it;
        boolean z3;
        Mutex mutex;
        C41788qxS c41788qxS3;
        java.lang.Object objCopydefault;
        C41428qqd c41428qqd;
        java.util.List<BizInstrument> list;
        Mutex mutex2;
        java.util.List<BizInstrument> listEZpvd;
        if (continuation instanceof SearchInstrumentRepository$initData$1) {
            searchInstrumentRepository$initData$1 = (SearchInstrumentRepository$initData$1) continuation;
            int i = searchInstrumentRepository$initData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchInstrumentRepository$initData$1.label = i - Integer.MIN_VALUE;
            } else {
                searchInstrumentRepository$initData$1 = new SearchInstrumentRepository$initData$1(this, continuation);
            }
        }
        java.lang.Object obj = searchInstrumentRepository$initData$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = searchInstrumentRepository$initData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            searchInstrumentRepository$initData$1.L$0 = this;
            z2 = z;
            searchInstrumentRepository$initData$1.Z$0 = z2;
            searchInstrumentRepository$initData$1.label = 1;
            if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, null, searchInstrumentRepository$initData$1, 3, null) == objCopydefault2) {
                return objCopydefault2;
            }
            c41788qxS = this;
        } else if (i2 == 1) {
            boolean z4 = searchInstrumentRepository$initData$1.Z$0;
            c41788qxS = (C41788qxS) searchInstrumentRepository$initData$1.L$0;
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
            z2 = z4;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (java.util.List) searchInstrumentRepository$initData$1.L$2;
                    c41428qqd = (C41428qqd) searchInstrumentRepository$initData$1.L$1;
                    mutex2 = (Mutex) searchInstrumentRepository$initData$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        listEZpvd = c41428qqd.EZpvd((java.util.List) obj);
                        if (listEZpvd != null) {
                            listEZpvd = yDY.AhwBna();
                        }
                        list.addAll(listEZpvd);
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                mutex = (Mutex) searchInstrumentRepository$initData$1.L$1;
                c41788qxS3 = (C41788qxS) searchInstrumentRepository$initData$1.L$0;
                C56391yDq.AEQbTJ(obj);
                try {
                    c41788qxS3.copydefault.clear();
                    java.util.List<BizInstrument> list2 = c41788qxS3.copydefault;
                    C41428qqd c41428qqd2 = C41428qqd.OLrzqt;
                    searchInstrumentRepository$initData$1.L$0 = mutex;
                    searchInstrumentRepository$initData$1.L$1 = c41428qqd2;
                    searchInstrumentRepository$initData$1.L$2 = list2;
                    searchInstrumentRepository$initData$1.label = 4;
                    objCopydefault = c41788qxS3.copydefault(searchInstrumentRepository$initData$1);
                    if (objCopydefault != objCopydefault2) {
                        return objCopydefault2;
                    }
                    c41428qqd = c41428qqd2;
                    Mutex mutex3 = mutex;
                    list = list2;
                    obj = objCopydefault;
                    mutex2 = mutex3;
                    listEZpvd = c41428qqd.EZpvd((java.util.List) obj);
                    if (listEZpvd != null) {
                    }
                    list.addAll(listEZpvd);
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    mutex.unlock(null);
                    throw th;
                }
            }
            z3 = searchInstrumentRepository$initData$1.Z$0;
            it = (java.util.Iterator) searchInstrumentRepository$initData$1.L$1;
            c41788qxS2 = (C41788qxS) searchInstrumentRepository$initData$1.L$0;
            C56391yDq.AEQbTJ(obj);
            while (it.hasNext()) {
                InterfaceC38386pWw interfaceC38386pWw = (InterfaceC38386pWw) it.next();
                searchInstrumentRepository$initData$1.L$0 = c41788qxS2;
                searchInstrumentRepository$initData$1.L$1 = it;
                searchInstrumentRepository$initData$1.Z$0 = z3;
                searchInstrumentRepository$initData$1.label = 2;
                if (interfaceC38386pWw.KWHzl(z3, searchInstrumentRepository$initData$1) == objCopydefault2) {
                    return objCopydefault2;
                }
            }
            if (z3 && (!c41788qxS2.copydefault.isEmpty())) {
                return Unit.INSTANCE;
            }
            mutex = c41788qxS2.KWHzl;
            searchInstrumentRepository$initData$1.L$0 = c41788qxS2;
            searchInstrumentRepository$initData$1.L$1 = mutex;
            searchInstrumentRepository$initData$1.label = 3;
            if (mutex.lock(null, searchInstrumentRepository$initData$1) != objCopydefault2) {
                return objCopydefault2;
            }
            c41788qxS3 = c41788qxS2;
            c41788qxS3.copydefault.clear();
            java.util.List<BizInstrument> list22 = c41788qxS3.copydefault;
            C41428qqd c41428qqd22 = C41428qqd.OLrzqt;
            searchInstrumentRepository$initData$1.L$0 = mutex;
            searchInstrumentRepository$initData$1.L$1 = c41428qqd22;
            searchInstrumentRepository$initData$1.L$2 = list22;
            searchInstrumentRepository$initData$1.label = 4;
            objCopydefault = c41788qxS3.copydefault(searchInstrumentRepository$initData$1);
            if (objCopydefault != objCopydefault2) {
            }
        }
        c41788qxS2 = c41788qxS;
        it = c41788qxS.OLrzqt().values().iterator();
        z3 = z2;
        while (it.hasNext()) {
        }
        if (z3) {
        }
        mutex = c41788qxS2.KWHzl;
        searchInstrumentRepository$initData$1.L$0 = c41788qxS2;
        searchInstrumentRepository$initData$1.L$1 = mutex;
        searchInstrumentRepository$initData$1.label = 3;
        if (mutex.lock(null, searchInstrumentRepository$initData$1) != objCopydefault2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0067 -> B:20:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<? extends BizInstrument>> continuation) throws java.lang.Throwable {
        SearchInstrumentRepository$getAllInstrument$1 searchInstrumentRepository$getAllInstrument$1;
        java.util.Collection arrayList;
        java.util.Iterator it;
        if (continuation instanceof SearchInstrumentRepository$getAllInstrument$1) {
            searchInstrumentRepository$getAllInstrument$1 = (SearchInstrumentRepository$getAllInstrument$1) continuation;
            int i = searchInstrumentRepository$getAllInstrument$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchInstrumentRepository$getAllInstrument$1.label = i - Integer.MIN_VALUE;
            } else {
                searchInstrumentRepository$getAllInstrument$1 = new SearchInstrumentRepository$getAllInstrument$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = searchInstrumentRepository$getAllInstrument$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchInstrumentRepository$getAllInstrument$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            java.util.Collection<InterfaceC38386pWw> collectionValues = OLrzqt().values();
            arrayList = new java.util.ArrayList();
            it = collectionValues.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) searchInstrumentRepository$getAllInstrument$1.L$1;
            arrayList = (java.util.Collection) searchInstrumentRepository$getAllInstrument$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            C56406yEe.KWHzl(arrayList, (java.lang.Iterable) objOLrzqt);
            if (it.hasNext()) {
                InterfaceC38386pWw interfaceC38386pWw = (InterfaceC38386pWw) it.next();
                searchInstrumentRepository$getAllInstrument$1.L$0 = arrayList;
                searchInstrumentRepository$getAllInstrument$1.L$1 = it;
                searchInstrumentRepository$getAllInstrument$1.label = 1;
                objOLrzqt = interfaceC38386pWw.OLrzqt(searchInstrumentRepository$getAllInstrument$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                C56406yEe.KWHzl(arrayList, (java.lang.Iterable) objOLrzqt);
                if (it.hasNext()) {
                    return (java.util.List) arrayList;
                }
            }
        }
    }
}
