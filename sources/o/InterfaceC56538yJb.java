package o;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yJb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56538yJb<T extends java.lang.Comparable<? super T>> {
    boolean contains(@NotNull T t);

    T getEndInclusive();

    T getStart();

    boolean isEmpty();

    /* JADX INFO: renamed from: o.yJb$StateListAnimator */
    public static final class StateListAnimator {
        public static <T extends java.lang.Comparable<? super T>> boolean KWHzl(@NotNull InterfaceC56538yJb<T> interfaceC56538yJb, @NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "");
            return t.compareTo(interfaceC56538yJb.getStart()) >= 0 && t.compareTo(interfaceC56538yJb.getEndInclusive()) <= 0;
        }

        public static <T extends java.lang.Comparable<? super T>> boolean AEQbTJ(@NotNull InterfaceC56538yJb<T> interfaceC56538yJb) {
            return interfaceC56538yJb.getStart().compareTo(interfaceC56538yJb.getEndInclusive()) > 0;
        }
    }
}
