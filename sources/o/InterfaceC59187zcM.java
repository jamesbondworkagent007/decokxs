package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59187zcM {
    <K, V> InterfaceC59181zcG<K, V> AEQbTJ(@NotNull Function1<? super K, ? extends V> function1);

    <K, V> InterfaceC59175zcA<K, V> EZpvd();

    <T> InterfaceC59182zcH<T> EZpvd(@NotNull Function0<? extends T> function0, @NotNull T t);

    <T> InterfaceC59182zcH<T> KWHzl(@NotNull Function0<? extends T> function0);

    <T> T OLrzqt(@NotNull Function0<? extends T> function0);

    <K, V> InterfaceC59179zcE<K, V> OLrzqt(@NotNull Function1<? super K, ? extends V> function1);

    <K, V> InterfaceC59226zcz<K, V> OLrzqt();

    <T> InterfaceC59180zcF<T> copydefault(@NotNull Function0<? extends T> function0);

    <T> InterfaceC59182zcH<T> copydefault(@NotNull Function0<? extends T> function0, Function1<? super java.lang.Boolean, ? extends T> function1, @NotNull Function1<? super T, Unit> function12);
}
