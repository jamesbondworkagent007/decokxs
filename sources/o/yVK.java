package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yVK<A, C> extends AbstractBinaryClassAnnotationLoader.StateListAnimator<A> {
    public final java.util.Map<C56890yWc, java.util.List<A>> EZpvd;
    public final java.util.Map<C56890yWc, C> OLrzqt;
    public final java.util.Map<C56890yWc, C> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.StateListAnimator
    public java.util.Map<C56890yWc, java.util.List<A>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<C56890yWc, C> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<C56890yWc, C> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<o.yWc, ? extends java.util.List<? extends A>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<o.yWc, ? extends C> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<o.yWc, ? extends C> */
    /* JADX WARN: Multi-variable type inference failed */
    public yVK(@NotNull java.util.Map<C56890yWc, ? extends java.util.List<? extends A>> map, @NotNull java.util.Map<C56890yWc, ? extends C> map2, @NotNull java.util.Map<C56890yWc, ? extends C> map3) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(map3, "");
        this.EZpvd = map;
        this.OLrzqt = map2;
        this.copydefault = map3;
    }
}
