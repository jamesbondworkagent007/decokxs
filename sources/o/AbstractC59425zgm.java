package o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59425zgm<K, V> {
    public final ConcurrentHashMap<java.lang.String, java.lang.Integer> AEQbTJ = new ConcurrentHashMap<>();
    public final AtomicInteger KWHzl = new AtomicInteger(0);

    public abstract int OLrzqt(@NotNull ConcurrentHashMap<java.lang.String, java.lang.Integer> concurrentHashMap, @NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, java.lang.Integer> function1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.Integer> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yJo<KK extends K> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends V, KK extends K> C59359zfZ<K, V, T> AEQbTJ(@NotNull InterfaceC56551yJo<KK> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        return new C59359zfZ<>(KWHzl(interfaceC56551yJo));
    }

    public final <T extends K> int KWHzl(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        java.lang.String strGEmmrt = interfaceC56551yJo.gEmmrt();
        Intrinsics.copydefault((java.lang.Object) strGEmmrt);
        return AEQbTJ(strGEmmrt);
    }

    public static final int EZpvd(AbstractC59425zgm abstractC59425zgm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return abstractC59425zgm.KWHzl.getAndIncrement();
    }

    public final int AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(this.AEQbTJ, str, new C59426zgn(this));
    }

    public final java.util.Collection<java.lang.Integer> AEQbTJ() {
        java.util.Collection<java.lang.Integer> collectionValues = this.AEQbTJ.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        return collectionValues;
    }
}
