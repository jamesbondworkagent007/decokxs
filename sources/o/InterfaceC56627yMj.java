package o;

import java.lang.reflect.Member;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yMj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56627yMj<M extends java.lang.reflect.Member> {
    java.lang.Object AEQbTJ(@NotNull java.lang.Object[] objArr);

    java.util.List<java.lang.reflect.Type> AEQbTJ();

    boolean EZpvd();

    M OLrzqt();

    java.lang.reflect.Type copydefault();

    /* JADX INFO: renamed from: o.yMj$Application */
    public static final class Application {
        public static <M extends java.lang.reflect.Member> boolean AEQbTJ(@NotNull InterfaceC56627yMj<? extends M> interfaceC56627yMj) {
            return false;
        }

        public static <M extends java.lang.reflect.Member> void AEQbTJ(@NotNull InterfaceC56627yMj<? extends M> interfaceC56627yMj, @NotNull java.lang.Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            if (C56625yMh.AEQbTJ(interfaceC56627yMj) == objArr.length) {
                return;
            }
            throw new java.lang.IllegalArgumentException("Callable expects " + C56625yMh.AEQbTJ(interfaceC56627yMj) + " arguments, but " + objArr.length + " were provided.");
        }
    }
}
