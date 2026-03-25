package o;

import aws.smithy.kotlin.runtime.collections.views.MutableMapView$entries$1;
import aws.smithy.kotlin.runtime.collections.views.MutableMapView$entries$2;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C56860yV<KSrc, KDest, VSrc, VDest> extends C56833yU<KSrc, KDest, VSrc, VDest> implements java.util.Map<KDest, VDest>, yIG {
    public final Function1<VDest, VSrc> AYXKKw;
    public final java.util.Map<KSrc, VSrc> AhwBna;
    public final Function1<KSrc, KDest> djBIcL;
    public final Function1<VSrc, VDest> gEmmrt;
    public final Function1<KDest, KSrc> valueOf;

    public final C56941yY<KSrc, KDest, VSrc, VDest> OLrzqt(Map.Entry<KSrc, VSrc> entry) {
        return new C56941yY<>(entry, this.djBIcL, this.gEmmrt, this.AYXKKw);
    }

    public final C56941yY<KDest, KSrc, VDest, VSrc> EZpvd(Map.Entry<KDest, VDest> entry) {
        return new C56941yY<>(entry, this.valueOf, this.AYXKKw, this.gEmmrt);
    }

    @Override // o.C56833yU, java.util.Map
    public void clear() {
        this.AhwBna.clear();
    }

    @Override // o.C56833yU
    public java.util.Set<Map.Entry<KDest, VDest>> AEQbTJ() {
        return C56617yM.copydefault(this.AhwBna.entrySet(), new MutableMapView$entries$1(this), new MutableMapView$entries$2(this));
    }

    @Override // o.C56833yU
    public java.util.Set<KDest> OLrzqt() {
        return C56617yM.copydefault(this.AhwBna.keySet(), this.djBIcL, this.valueOf);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // o.C56833yU, java.util.Map
    public VDest put(KDest kdest, VDest vdest) {
        VSrc vsrcPut = this.AhwBna.put(this.valueOf.invoke(kdest), this.AYXKKw.invoke(vdest));
        if (vsrcPut != null) {
            return this.gEmmrt.invoke(vsrcPut);
        }
        return null;
    }

    @Override // o.C56833yU, java.util.Map
    public void putAll(@NotNull java.util.Map<? extends KDest, ? extends VDest> map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            this.AhwBna.put(this.valueOf.invoke((KDest) key), this.AYXKKw.invoke((VDest) value));
        }
    }

    @Override // o.C56833yU, java.util.Map
    public VDest remove(java.lang.Object obj) {
        VSrc vsrcRemove = this.AhwBna.remove(this.valueOf.invoke(obj));
        if (vsrcRemove != null) {
            return this.gEmmrt.invoke(vsrcRemove);
        }
        return null;
    }

    @Override // o.C56833yU
    public java.util.Collection<VDest> KWHzl() {
        return C56617yM.OLrzqt(this.AhwBna.values(), this.gEmmrt, this.AYXKKw);
    }
}
