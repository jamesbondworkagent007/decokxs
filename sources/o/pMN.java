package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pMN implements InterfaceC2599ARy {
    public final InterfaceC43236rlV OLrzqt;
    public final pMM copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public pMN(@NotNull InterfaceC43236rlV interfaceC43236rlV, @NotNull pMM pmm) {
        Intrinsics.checkNotNullParameter(interfaceC43236rlV, "");
        Intrinsics.checkNotNullParameter(pmm, "");
        this.OLrzqt = interfaceC43236rlV;
        this.copydefault = pmm;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pMN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC2599ARy
    public void EZpvd(@NotNull ARK ark, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(ark, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.content.Context contextCopydefault = this.copydefault.copydefault();
        if (contextCopydefault == null) {
            pUU.copydefault("CoreAppLinkHandler", "execute failed - missing context");
            return;
        }
        pMR pmr = ark instanceof pMR ? (pMR) ark : null;
        InterfaceC43232rlR interfaceC43232rlRDjBIcL = pmr != null ? pmr.djBIcL() : null;
        if (interfaceC43232rlRDjBIcL == null) {
            pUU.copydefault("CoreAppLinkHandler", "execute failed - could not unwrap metadata");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), (java.lang.String) entry.getValue());
        }
        this.OLrzqt.KWHzl(contextCopydefault, interfaceC43232rlRDjBIcL, linkedHashMap);
    }
}
