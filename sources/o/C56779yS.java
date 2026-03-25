package o;

import aws.smithy.kotlin.runtime.collections.views.MultiMapView$entries$1;
import aws.smithy.kotlin.runtime.collections.views.MultiMapView$entries$2;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.InterfaceC58267yy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C56779yS<KSrc, KDest, VSrc, VDest> implements InterfaceC58267yy<KDest, VDest> {
    public final InterfaceC58267yy<KSrc, VSrc> AEQbTJ;
    public final Function1<VDest, VSrc> EZpvd;
    public final Function1<KDest, KSrc> KWHzl;
    public final Sequence<Map.Entry<KDest, VDest>> OLrzqt;
    public final Function1<KSrc, KDest> copydefault;
    public final Function1<java.util.List<? extends VSrc>, java.util.List<VDest>> djBIcL;
    public final Function1<VSrc, VDest> gEmmrt;
    public final Function1<java.util.List<? extends VDest>, java.util.List<VSrc>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58267yy
    public Sequence<Map.Entry<KDest, VDest>> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: remove(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<VDest> remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void putAll(java.util.Map<? extends KDest, ? extends java.util.List<? extends VDest>> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void replaceAll(java.util.function.BiFunction<? super KDest, ? super java.util.List<? extends VDest>, ? extends java.util.List<? extends VDest>> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // o.InterfaceC58267yy
    public InterfaceC56347yC<KDest, VDest> AEQbTJ() {
        return InterfaceC58267yy.Activity.EZpvd(this);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            return KWHzl((java.util.List) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<KDest, java.util.List<VDest>>> entrySet() {
        return EZpvd();
    }

    @Override // java.util.Map
    public final java.util.Set<KDest> keySet() {
        return KWHzl();
    }

    @Override // java.util.Map
    public final int size() {
        return copydefault();
    }

    @Override // java.util.Map
    public final java.util.Collection<java.util.List<VDest>> values() {
        return gEmmrt();
    }

    public final C56671yO<KSrc, KDest, java.util.List<VSrc>, java.util.List<VDest>> EZpvd(Map.Entry<? extends KSrc, ? extends java.util.List<? extends VSrc>> entry) {
        return new C56671yO<>(entry, this.copydefault, this.djBIcL);
    }

    public final C56671yO<KDest, KSrc, java.util.List<VDest>, java.util.List<VSrc>> OLrzqt(Map.Entry<? extends KDest, ? extends java.util.List<? extends VDest>> entry) {
        return new C56671yO<>(entry, this.KWHzl, this.valueOf);
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.AEQbTJ.containsKey(this.KWHzl.invoke(obj));
    }

    public boolean KWHzl(@NotNull java.util.List<? extends VDest> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return this.AEQbTJ.containsValue(this.valueOf.invoke(list));
    }

    public java.util.Set<Map.Entry<KDest, java.util.List<VDest>>> EZpvd() {
        return C56617yM.EZpvd((java.util.Set) this.AEQbTJ.entrySet(), (Function1) new MultiMapView$entries$1(this), (Function1) new MultiMapView$entries$2(this));
    }

    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.util.List<VDest> get(KDest kdest) {
        java.util.List<? extends VSrc> list = (java.util.List) this.AEQbTJ.get(this.KWHzl.invoke(kdest));
        if (list != null) {
            return this.djBIcL.invoke(list);
        }
        return null;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.AEQbTJ.isEmpty();
    }

    public java.util.Set<KDest> KWHzl() {
        return C56617yM.EZpvd((java.util.Set) this.AEQbTJ.keySet(), (Function1) this.copydefault, (Function1) this.KWHzl);
    }

    public int copydefault() {
        return this.AEQbTJ.size();
    }

    public java.util.Collection<java.util.List<VDest>> gEmmrt() {
        return C56617yM.EZpvd(this.AEQbTJ.values(), this.djBIcL, this.valueOf);
    }
}
