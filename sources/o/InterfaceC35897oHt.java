package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oHt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC35897oHt<T> {

    /* JADX INFO: renamed from: o.oHt$Application */
    public static final class Application {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <T> void AEQbTJ(@NotNull InterfaceC35897oHt<T> interfaceC35897oHt, @NotNull C35895oHr c35895oHr, T t, @NotNull java.util.List<? extends java.lang.Object> list) {
            Intrinsics.checkNotNullParameter(c35895oHr, "");
            Intrinsics.checkNotNullParameter(list, "");
        }
    }

    C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i);

    void AEQbTJ(@NotNull C35895oHr c35895oHr, T t, int i);

    void AEQbTJ(@NotNull C35895oHr c35895oHr, T t, @NotNull java.util.List<? extends java.lang.Object> list);

    boolean AEQbTJ(T t);

    void copydefault(@NotNull C35895oHr c35895oHr, T t);
}
