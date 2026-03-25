package o;

import com.amplitude.core.events.IdentifyOperation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KA implements InterfaceC5263Kz {
    public final KR AEQbTJ;

    public KA(@NotNull KR kr) {
        Intrinsics.checkNotNullParameter(kr, "");
        this.AEQbTJ = kr;
    }

    @Override // o.InterfaceC5263Kz
    public java.lang.Object KWHzl(@NotNull Continuation<? super C5242Ke> continuation) {
        java.util.List<java.lang.Object> listOLrzqt = this.AEQbTJ.OLrzqt();
        Intrinsics.copydefault(listOLrzqt, "");
        if (listOLrzqt.isEmpty() || ((java.util.List) listOLrzqt.get(0)).isEmpty()) {
            return null;
        }
        java.util.List list = (java.util.List) listOLrzqt.get(0);
        C5242Ke c5242Ke = (C5242Ke) list.get(0);
        KB kb = KB.OLrzqt;
        java.util.Map<java.lang.String, java.lang.Object> mapOLrzqt = c5242Ke.OLrzqt();
        Intrinsics.copydefault(mapOLrzqt);
        IdentifyOperation identifyOperation = IdentifyOperation.SET;
        java.lang.Object obj = mapOLrzqt.get(identifyOperation.getOperationType());
        Intrinsics.copydefault(obj, "");
        java.util.Map<java.lang.String, java.lang.Object> mapKWHzl = kb.KWHzl(C56532yIw.AEQbTJ(obj));
        mapKWHzl.putAll(kb.copydefault(list.subList(1, list.size())));
        java.util.Map<java.lang.String, java.lang.Object> mapOLrzqt2 = c5242Ke.OLrzqt();
        Intrinsics.copydefault(mapOLrzqt2);
        mapOLrzqt2.put(identifyOperation.getOperationType(), mapKWHzl);
        return c5242Ke;
    }

    @Override // o.InterfaceC5263Kz
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
        this.AEQbTJ.EZpvd();
        return Unit.INSTANCE;
    }
}
