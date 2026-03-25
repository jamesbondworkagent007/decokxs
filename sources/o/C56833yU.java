package o;

import aws.smithy.kotlin.runtime.collections.views.MapView$entries$1;
import aws.smithy.kotlin.runtime.collections.views.MapView$entries$2;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.yU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C56833yU<KSrc, KDest, VSrc, VDest> implements java.util.Map<KDest, VDest>, InterfaceC56535yIz {
    public final Function1<KDest, KSrc> AEQbTJ;
    public final Function1<KSrc, KDest> EZpvd;
    public final Function1<VSrc, VDest> KWHzl;
    public final Function1<VDest, VSrc> OLrzqt;
    public final java.util.Map<KSrc, VSrc> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public VDest compute(KDest kdest, java.util.function.BiFunction<? super KDest, ? super VDest, ? extends VDest> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public VDest computeIfAbsent(KDest kdest, java.util.function.Function<? super KDest, ? extends VDest> function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public VDest computeIfPresent(KDest kdest, java.util.function.BiFunction<? super KDest, ? super VDest, ? extends VDest> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public VDest merge(KDest kdest, VDest vdest, java.util.function.BiFunction<? super VDest, ? super VDest, ? extends VDest> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public VDest put(KDest kdest, VDest vdest) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void putAll(java.util.Map<? extends KDest, ? extends VDest> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public VDest putIfAbsent(KDest kdest, VDest vdest) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public VDest remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public VDest replace(KDest kdest, VDest vdest) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean replace(KDest kdest, VDest vdest, VDest vdest2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void replaceAll(java.util.function.BiFunction<? super KDest, ? super VDest, ? extends VDest> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<KDest, VDest>> entrySet() {
        return AEQbTJ();
    }

    @Override // java.util.Map
    public final java.util.Set<KDest> keySet() {
        return OLrzqt();
    }

    @Override // java.util.Map
    public final int size() {
        return EZpvd();
    }

    @Override // java.util.Map
    public final java.util.Collection<VDest> values() {
        return KWHzl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C56671yO<KSrc, KDest, VSrc, VDest> OLrzqt(Map.Entry<? extends KSrc, ? extends VSrc> entry) {
        return new C56671yO<>(entry, this.EZpvd, this.KWHzl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C56671yO<KDest, KSrc, VDest, VSrc> copydefault(Map.Entry<? extends KDest, ? extends VDest> entry) {
        return new C56671yO<>(entry, this.AEQbTJ, this.OLrzqt);
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.copydefault.containsKey(this.AEQbTJ.invoke(obj));
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return this.copydefault.containsValue(this.OLrzqt.invoke(obj));
    }

    public java.util.Set<Map.Entry<KDest, VDest>> AEQbTJ() {
        return C56617yM.EZpvd((java.util.Set) this.copydefault.entrySet(), (Function1) new MapView$entries$1(this), (Function1) new MapView$entries$2(this));
    }

    @Override // java.util.Map
    public VDest get(java.lang.Object obj) {
        VSrc vsrc = this.copydefault.get(this.AEQbTJ.invoke(obj));
        if (vsrc != null) {
            return this.KWHzl.invoke(vsrc);
        }
        return null;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.copydefault.isEmpty();
    }

    public java.util.Set<KDest> OLrzqt() {
        return C56617yM.EZpvd((java.util.Set) this.copydefault.keySet(), (Function1) this.EZpvd, (Function1) this.AEQbTJ);
    }

    public int EZpvd() {
        return this.copydefault.size();
    }

    public java.util.Collection<VDest> KWHzl() {
        return C56617yM.EZpvd(this.copydefault.values(), this.KWHzl, this.OLrzqt);
    }
}
