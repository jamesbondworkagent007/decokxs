package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.InterfaceC56558yJv;

/* JADX INFO: renamed from: o.yJr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56554yJr<T, V> extends InterfaceC56560yJx<T, V>, InterfaceC56558yJv<V> {

    /* JADX INFO: renamed from: o.yJr$Application */
    public interface Application<T, V> extends InterfaceC56558yJv.StateListAnimator<V>, Function2<T, V, Unit> {
    }

    @Override // o.InterfaceC56558yJv, o.InterfaceC56557yJu
    Application<T, V> getSetter();

    void set(T t, V v);
}
