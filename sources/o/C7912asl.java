package o;

import com.immomo.mls.fun.java.Event;
import java.util.Map;

/* JADX INFO: renamed from: o.asl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7912asl {
    public static volatile C7912asl copydefault;
    public final java.util.Map<java.lang.Object, java.util.Map<java.lang.String, InterfaceC7913asm>> AEQbTJ = new java.util.HashMap();

    public static C7912asl KWHzl() {
        if (copydefault == null) {
            synchronized (C7912asl.class) {
                if (copydefault == null) {
                    copydefault = new C7912asl();
                }
            }
        }
        return copydefault;
    }

    private C7912asl() {
    }

    public InterfaceC7913asm OLrzqt(@androidx.annotation.NonNull java.lang.Object obj, @androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull InterfaceC7913asm interfaceC7913asm) {
        java.util.Map<java.lang.String, InterfaceC7913asm> map = this.AEQbTJ.get(obj);
        if (map == null) {
            map = new java.util.HashMap<>();
            this.AEQbTJ.put(obj, map);
        }
        return map.put(str, interfaceC7913asm);
    }

    public InterfaceC7913asm copydefault(@androidx.annotation.NonNull java.lang.Object obj, @androidx.annotation.NonNull java.lang.String str) {
        java.util.Map<java.lang.String, InterfaceC7913asm> map = this.AEQbTJ.get(obj);
        if (map == null) {
            return null;
        }
        InterfaceC7913asm interfaceC7913asmRemove = map.remove(str);
        if (map.isEmpty()) {
            this.AEQbTJ.remove(obj);
        }
        return interfaceC7913asmRemove;
    }

    public void copydefault(@androidx.annotation.NonNull java.lang.Object obj) {
        if (obj == null) {
            java.util.Iterator<Map.Entry<java.lang.Object, java.util.Map<java.lang.String, InterfaceC7913asm>>> it = this.AEQbTJ.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().clear();
            }
            this.AEQbTJ.clear();
            return;
        }
        java.util.Map<java.lang.String, InterfaceC7913asm> mapRemove = this.AEQbTJ.remove(obj);
        if (mapRemove != null) {
            mapRemove.clear();
        }
    }

    public void AEQbTJ(@androidx.annotation.NonNull java.lang.Object obj, @androidx.annotation.NonNull Event event) {
        if (!event.KWHzl()) {
            throw new java.lang.IllegalArgumentException("Invalid Event " + event);
        }
        EZpvd(obj, event);
    }

    public final void EZpvd(java.lang.Object obj, Event event) {
        InterfaceC7913asm interfaceC7913asm;
        java.util.Map<java.lang.String, InterfaceC7913asm> map = this.AEQbTJ.get(obj);
        if (map == null || map.isEmpty() || (interfaceC7913asm = map.get(event.getKey())) == null) {
            return;
        }
        interfaceC7913asm.onEventReceive(event);
    }
}
