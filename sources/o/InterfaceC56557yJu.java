package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.InterfaceC56558yJv;

/* JADX INFO: renamed from: o.yJu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56557yJu<V> extends InterfaceC56562yJz<V>, InterfaceC56558yJv<V> {

    /* JADX INFO: renamed from: o.yJu$StateListAnimator */
    public interface StateListAnimator<V> extends InterfaceC56558yJv.StateListAnimator<V>, Function1<V, Unit> {
    }

    StateListAnimator<V> getSetter();

    void set(V v);
}
