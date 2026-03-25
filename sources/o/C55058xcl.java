package o;

import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55058xcl implements InterfaceC55054xch {
    public Reference<android.view.View> AEQbTJ;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.xck
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C55058xcl.KWHzl();
        }
    });
    public InterfaceC55053xcg OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull InterfaceC55053xcg interfaceC55053xcg) {
        Intrinsics.checkNotNullParameter(interfaceC55053xcg, "");
        this.OLrzqt = interfaceC55053xcg;
    }

    public final java.util.HashMap<android.view.View, InterfaceC55062xcp> OLrzqt() {
        return (java.util.HashMap) this.KWHzl.getValue();
    }

    public static final java.util.HashMap KWHzl() {
        return new java.util.HashMap();
    }

    public void OLrzqt(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = new WeakReference(view);
        view.setOnClickListener(new View.OnClickListener() { // from class: o.xcj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C55058xcl.copydefault(this.copydefault, view2);
            }
        });
        gEmmrt();
    }

    public static final void copydefault(C55058xcl c55058xcl, android.view.View view) {
        if (c55058xcl.valueOf()) {
            InterfaceC55053xcg interfaceC55053xcg = c55058xcl.OLrzqt;
            if (interfaceC55053xcg != null) {
                interfaceC55053xcg.OLrzqt(c55058xcl.AEQbTJ());
                return;
            }
            return;
        }
        InterfaceC55053xcg interfaceC55053xcg2 = c55058xcl.OLrzqt;
        if (interfaceC55053xcg2 != null) {
            interfaceC55053xcg2.AEQbTJ();
        }
    }

    public void gEmmrt() {
        android.view.View view;
        Reference<android.view.View> reference = this.AEQbTJ;
        if (reference == null || (view = reference.get()) == null) {
            return;
        }
        view.setEnabled(!EZpvd());
    }

    @Override // o.InterfaceC55062xcp
    public boolean valueOf() {
        java.util.HashMap<android.view.View, InterfaceC55062xcp> mapOLrzqt = OLrzqt();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<android.view.View, InterfaceC55062xcp> entry : mapOLrzqt.entrySet()) {
            if (entry.getValue().AhwBna()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!((InterfaceC55062xcp) entry2.getValue()).valueOf()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2.isEmpty();
    }

    @Override // o.InterfaceC55062xcp
    public boolean AhwBna() {
        java.util.HashMap<android.view.View, InterfaceC55062xcp> mapOLrzqt = OLrzqt();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<android.view.View, InterfaceC55062xcp> entry : mapOLrzqt.entrySet()) {
            if (!entry.getValue().AhwBna()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.isEmpty();
    }

    @Override // o.InterfaceC55062xcp
    public java.util.Map<java.lang.CharSequence, java.lang.Object> AEQbTJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Iterator<Map.Entry<android.view.View, InterfaceC55062xcp>> it = OLrzqt().entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map<java.lang.CharSequence, java.lang.Object> mapAEQbTJ = it.next().getValue().AEQbTJ();
            if (mapAEQbTJ != null) {
                linkedHashMap.putAll(mapAEQbTJ);
            }
        }
        return linkedHashMap;
    }

    @Override // o.InterfaceC55062xcp
    public boolean EZpvd() {
        java.util.HashMap<android.view.View, InterfaceC55062xcp> mapOLrzqt = OLrzqt();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<android.view.View, InterfaceC55062xcp> entry : mapOLrzqt.entrySet()) {
            if (entry.getValue().AhwBna()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((InterfaceC55062xcp) entry2.getValue()).EZpvd()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return !linkedHashMap2.isEmpty();
    }
}
