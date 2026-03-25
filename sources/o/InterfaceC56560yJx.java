package o;

import kotlin.jvm.functions.Function1;
import o.yJA;

/* JADX INFO: renamed from: o.yJx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56560yJx<T, V> extends yJA<V>, Function1<T, V> {

    /* JADX INFO: renamed from: o.yJx$StateListAnimator */
    public interface StateListAnimator<T, V> extends yJA.StateListAnimator<V>, Function1<T, V> {
    }

    V get(T t);

    java.lang.Object getDelegate(T t);

    @Override // o.yJA
    StateListAnimator<T, V> getGetter();
}
