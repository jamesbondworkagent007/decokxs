package o;

import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yJm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56549yJm<R> extends InterfaceC56544yJh {
    R call(@NotNull java.lang.Object... objArr);

    R callBy(@NotNull java.util.Map<KParameter, ? extends java.lang.Object> map);

    java.lang.String getName();

    java.util.List<KParameter> getParameters();

    InterfaceC56559yJw getReturnType();

    java.util.List<yJD> getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
