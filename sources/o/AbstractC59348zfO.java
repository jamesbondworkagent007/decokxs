package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59348zfO<K, V> implements java.lang.Iterable<V>, InterfaceC56535yIz {
    public abstract void AEQbTJ(@NotNull java.lang.String str, @NotNull V v);

    public abstract AbstractC59346zfM<V> KWHzl();

    public abstract AbstractC59425zgm<K, V> copydefault();

    /* JADX INFO: renamed from: o.zfO$ActionBar */
    public static abstract class ActionBar<K, V, T extends V> {
        public final int AEQbTJ;

        public ActionBar(int i) {
            this.AEQbTJ = i;
        }

        public final T AEQbTJ(@NotNull AbstractC59348zfO<K, V> abstractC59348zfO) {
            Intrinsics.checkNotNullParameter(abstractC59348zfO, "");
            return abstractC59348zfO.KWHzl().AEQbTJ(this.AEQbTJ);
        }
    }

    public final void OLrzqt(@NotNull InterfaceC56551yJo<? extends K> interfaceC56551yJo, @NotNull V v) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(v, "");
        java.lang.String strGEmmrt = interfaceC56551yJo.gEmmrt();
        Intrinsics.copydefault((java.lang.Object) strGEmmrt);
        AEQbTJ(strGEmmrt, v);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<V> iterator() {
        return KWHzl().iterator();
    }

    public final boolean OLrzqt() {
        return KWHzl().OLrzqt() == 0;
    }
}
