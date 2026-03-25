package o;

import kotlin.jvm.functions.Function2;
import o.yJA;

/* JADX INFO: renamed from: o.yJy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56561yJy<D, E, V> extends yJA<V>, Function2<D, E, V> {

    /* JADX INFO: renamed from: o.yJy$Activity */
    public interface Activity<D, E, V> extends yJA.StateListAnimator<V>, Function2<D, E, V> {
    }

    V get(D d, E e);

    java.lang.Object getDelegate(D d, E e);

    @Override // o.yJA
    Activity<D, E, V> getGetter();
}
