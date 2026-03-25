package o;

import com.amplitude.common.Logger;
import com.amplitude.core.events.IdentifyOperation;
import com.amplitude.core.platform.intercept.IdentifyInterceptFileStorageHandler$clearIdentifyIntercepts$1;
import com.amplitude.core.platform.intercept.IdentifyInterceptFileStorageHandler$getTransferIdentifyEvent$1;
import com.amplitude.core.platform.intercept.IdentifyInterceptFileStorageHandler$removeFile$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: renamed from: o.Ky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5262Ky implements InterfaceC5263Kz {
    public final JZ KWHzl;
    public final KO OLrzqt;
    public final Logger copydefault;

    public C5262Ky(@NotNull KO ko, @NotNull Logger logger, @NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(ko, "");
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(jz, "");
        this.OLrzqt = ko;
        this.copydefault = logger;
        this.KWHzl = jz;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4 A[Catch: Exception -> 0x0041, TryCatch #3 {Exception -> 0x0041, blocks: (B:13:0x003d, B:39:0x009c, B:41:0x00a4, B:36:0x0087, B:42:0x00ae, B:44:0x00bd, B:46:0x00c9, B:55:0x00fc, B:57:0x0104, B:58:0x0107), top: B:78:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[Catch: Exception -> 0x0041, TryCatch #3 {Exception -> 0x0041, blocks: (B:13:0x003d, B:39:0x009c, B:41:0x00a4, B:36:0x0087, B:42:0x00ae, B:44:0x00bd, B:46:0x00c9, B:55:0x00fc, B:57:0x0104, B:58:0x0107), top: B:78:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0099 -> B:39:0x009c). Please report as a decompilation issue!!! */
    @Override // o.InterfaceC5263Kz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super C5242Ke> continuation) throws java.lang.Throwable {
        IdentifyInterceptFileStorageHandler$getTransferIdentifyEvent$1 identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1;
        C5262Ky c5262Ky;
        java.lang.String message;
        java.util.List<java.lang.Object> listOLrzqt;
        java.util.Iterator<java.lang.Object> it;
        C5262Ky c5262Ky2;
        java.util.Map<java.lang.String, java.lang.Object> mapKWHzl;
        C5242Ke c5242Ke;
        java.lang.Object next;
        java.util.Map<java.lang.String, java.lang.Object> mapOLrzqt;
        java.lang.String str;
        if (continuation instanceof IdentifyInterceptFileStorageHandler$getTransferIdentifyEvent$1) {
            identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1 = (IdentifyInterceptFileStorageHandler$getTransferIdentifyEvent$1) continuation;
            int i = identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1 = new IdentifyInterceptFileStorageHandler$getTransferIdentifyEvent$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                KO ko = this.OLrzqt;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.L$0 = this;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.label = 1;
                if (ko.KWHzl(identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1) == objCopydefault) {
                    return objCopydefault;
                }
                c5262Ky = this;
                listOLrzqt = c5262Ky.OLrzqt.OLrzqt();
                if (!listOLrzqt.isEmpty()) {
                }
            } catch (java.io.FileNotFoundException e) {
                e = e;
                c5262Ky = this;
                message = e.getMessage();
                if (message != null) {
                }
                return null;
            }
        } else if (i2 == 1) {
            c5262Ky = (C5262Ky) identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                listOLrzqt = c5262Ky.OLrzqt.OLrzqt();
                if (!listOLrzqt.isEmpty()) {
                    return null;
                }
                it = listOLrzqt.iterator();
                c5262Ky2 = c5262Ky;
                mapKWHzl = null;
                c5242Ke = null;
            } catch (java.io.FileNotFoundException e2) {
                e = e2;
                message = e.getMessage();
                if (message != null) {
                    c5262Ky.copydefault.KWHzl("Event storage file not found: " + message);
                }
                return null;
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            next = identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.L$4;
            it = (java.util.Iterator) identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.L$3;
            mapKWHzl = (java.util.Map) identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.L$2;
            c5242Ke = (C5242Ke) identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.L$1;
            c5262Ky2 = (C5262Ky) identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (java.lang.Exception e3) {
                e = e3;
                c5262Ky2.copydefault.KWHzl("Identify Merge error: " + e.getMessage());
                Intrinsics.copydefault(next, "");
                c5262Ky2.OLrzqt((java.lang.String) next);
                if (!it.hasNext()) {
                }
            }
            str = (java.lang.String) objEZpvd;
            if (str.length() != 0) {
                Intrinsics.copydefault(next, "");
                c5262Ky2.OLrzqt((java.lang.String) next);
            } else {
                java.util.List<C5242Ke> listAEQbTJ = KX.AEQbTJ(new JSONArray(str));
                if (listAEQbTJ.isEmpty()) {
                    Intrinsics.copydefault(next, "");
                    c5262Ky2.OLrzqt((java.lang.String) next);
                } else {
                    if (c5242Ke == null) {
                        C5242Ke c5242Ke2 = listAEQbTJ.get(0);
                        try {
                        } catch (java.lang.Exception e4) {
                            e = e4;
                            c5242Ke = c5242Ke2;
                            c5262Ky2.copydefault.KWHzl("Identify Merge error: " + e.getMessage());
                            Intrinsics.copydefault(next, "");
                            c5262Ky2.OLrzqt((java.lang.String) next);
                            if (!it.hasNext()) {
                            }
                        }
                        KB kb = KB.OLrzqt;
                        java.util.Map<java.lang.String, java.lang.Object> mapOLrzqt2 = c5242Ke2.OLrzqt();
                        java.lang.Object obj = mapOLrzqt2 != null ? mapOLrzqt2.get(IdentifyOperation.SET.getOperationType()) : null;
                        Intrinsics.copydefault(obj, "");
                        mapKWHzl = kb.KWHzl(C56532yIw.AEQbTJ(obj));
                        listAEQbTJ = listAEQbTJ.subList(1, listAEQbTJ.size());
                        c5242Ke = c5242Ke2;
                    }
                    java.util.Map<java.lang.String, java.lang.Object> mapCopydefault = KB.OLrzqt.copydefault(listAEQbTJ);
                    if (mapKWHzl != null) {
                        mapKWHzl.putAll(mapCopydefault);
                    }
                    Intrinsics.copydefault(next, "");
                    c5262Ky2.OLrzqt((java.lang.String) next);
                }
            }
        }
        if (!it.hasNext()) {
            next = it.next();
            KO ko2 = c5262Ky2.OLrzqt;
            identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.L$0 = c5262Ky2;
            identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.L$1 = c5242Ke;
            identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.L$2 = mapKWHzl;
            identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.L$3 = it;
            identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.L$4 = next;
            identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.label = 2;
            objEZpvd = ko2.EZpvd(next, identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            str = (java.lang.String) objEZpvd;
            if (str.length() != 0) {
            }
            if (!it.hasNext()) {
                if (c5242Ke != null && (mapOLrzqt = c5242Ke.OLrzqt()) != null) {
                    mapOLrzqt.put(IdentifyOperation.SET.getOperationType(), mapKWHzl);
                }
                return c5242Ke;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC5263Kz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        IdentifyInterceptFileStorageHandler$clearIdentifyIntercepts$1 identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1;
        C5262Ky c5262Ky;
        java.lang.String message;
        java.util.List<java.lang.Object> listOLrzqt;
        if (continuation instanceof IdentifyInterceptFileStorageHandler$clearIdentifyIntercepts$1) {
            identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1 = (IdentifyInterceptFileStorageHandler$clearIdentifyIntercepts$1) continuation;
            int i = identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1.label = i - Integer.MIN_VALUE;
            } else {
                identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1 = new IdentifyInterceptFileStorageHandler$clearIdentifyIntercepts$1(this, continuation);
            }
        }
        java.lang.Object obj = identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5262Ky = (C5262Ky) identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                listOLrzqt = c5262Ky.OLrzqt.OLrzqt();
                if (!listOLrzqt.isEmpty()) {
                    return Unit.INSTANCE;
                }
                for (java.lang.Object obj2 : listOLrzqt) {
                    Intrinsics.copydefault(obj2, "");
                    c5262Ky.OLrzqt((java.lang.String) obj2);
                }
                return Unit.INSTANCE;
            } catch (java.io.FileNotFoundException e) {
                e = e;
                message = e.getMessage();
                if (message != null) {
                }
                return Unit.INSTANCE;
            }
        }
        C56391yDq.AEQbTJ(obj);
        try {
            KO ko = this.OLrzqt;
            identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1.L$0 = this;
            identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1.label = 1;
            if (ko.KWHzl(identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1) == objCopydefault) {
                return objCopydefault;
            }
            c5262Ky = this;
            listOLrzqt = c5262Ky.OLrzqt.OLrzqt();
            if (!listOLrzqt.isEmpty()) {
            }
        } catch (java.io.FileNotFoundException e2) {
            e = e2;
            c5262Ky = this;
            message = e.getMessage();
            if (message != null) {
                c5262Ky.copydefault.KWHzl("Event storage file not found: " + message);
            }
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt(java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(this.KWHzl.AYXKKw(), this.KWHzl.fJNWhG(), null, new IdentifyInterceptFileStorageHandler$removeFile$1(this, str, null), 2, null);
    }
}
