package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pMO implements InterfaceC2607ASg {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final pMM AEQbTJ;
    public final InterfaceC43234rlT copydefault;

    public pMO(@NotNull InterfaceC43234rlT interfaceC43234rlT, @NotNull pMM pmm) {
        Intrinsics.checkNotNullParameter(interfaceC43234rlT, "");
        Intrinsics.checkNotNullParameter(pmm, "");
        this.copydefault = interfaceC43234rlT;
        this.AEQbTJ = pmm;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pMO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.InterfaceC2607ASg
    public void KWHzl(@NotNull ASC asc, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(asc, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.content.Context contextCopydefault = this.AEQbTJ.copydefault();
        if (contextCopydefault == null) {
            pUU.copydefault("CoreDeeplinkHandler", "execute failed - missing context");
            return;
        }
        pMQ pmq = asc instanceof pMQ ? (pMQ) asc : null;
        InterfaceC43233rlS interfaceC43233rlSDjBIcL = pmq != null ? pmq.djBIcL() : null;
        if (interfaceC43233rlSDjBIcL == null) {
            pUU.copydefault("CoreDeeplinkHandler", "execute failed - could not unwrap metadata");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), (java.lang.String) entry.getValue());
        }
        this.copydefault.OLrzqt(contextCopydefault, interfaceC43233rlSDjBIcL, linkedHashMap);
    }
}
