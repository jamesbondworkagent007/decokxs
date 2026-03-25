package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43221rlG extends AbstractC43215rlA implements InterfaceC43220rlF, InterfaceC43219rlE {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.rlK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43221rlG.copydefault();
        }
    });

    public final java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, InterfaceC56387yDm<InterfaceC43218rlD<?, ?>>>> EZpvd() {
        return (java.util.HashMap) this.KWHzl.getValue();
    }

    public static final java.util.HashMap copydefault() {
        return new java.util.HashMap();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.yDm<? extends o.rlD<? super T, ? extends R>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC43220rlF
    public <T, R> void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC56387yDm<? extends InterfaceC43218rlD<? super T, ? extends R>> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        java.util.HashMap<java.lang.String, InterfaceC56387yDm<InterfaceC43218rlD<?, ?>>> map = EZpvd().get(str);
        if (map == null) {
            map = new java.util.HashMap<>();
            EZpvd().put(str, map);
        }
        map.put(str2, interfaceC56387yDm);
    }

    @Override // o.InterfaceC43219rlE
    public <T, R> InterfaceC43218rlD<T, R> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        InterfaceC56387yDm<InterfaceC43218rlD<?, ?>> interfaceC56387yDm;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlzAEQbTJ = C43222rlH.Companion.AEQbTJ(str, str2);
        if (interfaceComponentCallbacks2C43266rlzAEQbTJ != null) {
            interfaceComponentCallbacks2C43266rlzAEQbTJ.doOnCreate();
        }
        java.util.HashMap<java.lang.String, InterfaceC56387yDm<InterfaceC43218rlD<?, ?>>> map = EZpvd().get(str);
        InterfaceC43218rlD<?, ?> value = (map == null || (interfaceC56387yDm = map.get(str2)) == null) ? null : interfaceC56387yDm.getValue();
        if (value instanceof InterfaceC43218rlD) {
            return (InterfaceC43218rlD<T, R>) value;
        }
        return null;
    }
}
