package o;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C57896yr implements InterfaceC56293yA {
    public final java.util.Map<C57737yo<?>, java.lang.Object> OLrzqt;

    public C57896yr(@NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        this.OLrzqt = new LinkedHashMap();
        C58108yv.KWHzl(this, interfaceC57843yq);
    }

    public C57896yr() {
        this(C58108yv.copydefault());
    }

    @Override // o.InterfaceC57843yq
    public boolean EZpvd() {
        return this.OLrzqt.isEmpty();
    }

    @Override // o.InterfaceC57843yq
    public <T> T OLrzqt(@NotNull C57737yo<T> c57737yo) {
        Intrinsics.checkNotNullParameter(c57737yo, "");
        return (T) this.OLrzqt.get(c57737yo);
    }

    @Override // o.InterfaceC57843yq
    public boolean AEQbTJ(@NotNull C57737yo<?> c57737yo) {
        Intrinsics.checkNotNullParameter(c57737yo, "");
        return this.OLrzqt.containsKey(c57737yo);
    }

    @Override // o.InterfaceC56293yA
    public <T> void OLrzqt(@NotNull C57737yo<T> c57737yo, @NotNull T t) {
        Intrinsics.checkNotNullParameter(c57737yo, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.OLrzqt.put(c57737yo, t);
    }

    @Override // o.InterfaceC56293yA
    public <T> void EZpvd(@NotNull C57737yo<T> c57737yo) {
        Intrinsics.checkNotNullParameter(c57737yo, "");
        this.OLrzqt.remove(c57737yo);
    }

    @Override // o.InterfaceC56293yA
    public <T> T EZpvd(@NotNull C57737yo<T> c57737yo, @NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(c57737yo, "");
        Intrinsics.checkNotNullParameter(function0, "");
        T t = (T) OLrzqt(c57737yo);
        if (t != null) {
            return t;
        }
        T tInvoke = function0.invoke();
        this.OLrzqt.put(c57737yo, tInvoke);
        return tInvoke;
    }

    @Override // o.InterfaceC57843yq
    public java.util.Set<C57737yo<?>> copydefault() {
        return this.OLrzqt.keySet();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC57843yq)) {
            return false;
        }
        InterfaceC57843yq interfaceC57843yq = (InterfaceC57843yq) obj;
        if (copydefault().size() != interfaceC57843yq.copydefault().size()) {
            return false;
        }
        java.util.Set<C57737yo<?>> setCopydefault = copydefault();
        if ((setCopydefault instanceof java.util.Collection) && setCopydefault.isEmpty()) {
            return true;
        }
        for (C57737yo<?> c57737yo : setCopydefault) {
            if (AEQbTJ(c57737yo)) {
                Intrinsics.copydefault(c57737yo, "");
                if (Intrinsics.EZpvd(OLrzqt(c57737yo), interfaceC57843yq.OLrzqt(c57737yo))) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    public java.lang.String toString() {
        return this.OLrzqt.toString();
    }
}
