package o;

import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.Objects;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49362unC {
    <T extends InterfaceC49369unJ<T>> Flow<T> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz);

    /* JADX INFO: renamed from: o.unC$Application */
    public static final class Application {
        public static <T extends InterfaceC49369unJ<T>> Flow<T> OLrzqt(@NotNull InterfaceC49362unC interfaceC49362unC, @NotNull AbstractC49411unz<T> abstractC49411unz) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            C49372unM.AEQbTJ.copydefault();
            return C49360unA.KWHzl(abstractC49411unz);
        }

        public static <T extends InterfaceC49369unJ<T>, A> Flow<A> KWHzl(@NotNull InterfaceC49362unC interfaceC49362unC, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(interfaceC56560yJx);
            }
            return C49360unA.copydefault(abstractC49411unz, interfaceC56560yJx);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B> Flow<kotlin.Pair<A, B>> KWHzl(@NotNull InterfaceC49362unC interfaceC49362unC, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
            }
            return C49360unA.AEQbTJ(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C> Flow<Triple<A, B, C>> KWHzl(@NotNull InterfaceC49362unC interfaceC49362unC, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
                Objects.toString(interfaceC56560yJx3);
            }
            return C49360unA.KWHzl(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D> Flow<Quartet<A, B, C, D>> EZpvd(@NotNull InterfaceC49362unC interfaceC49362unC, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
                Objects.toString(interfaceC56560yJx3);
                Objects.toString(interfaceC56560yJx4);
            }
            return C49360unA.AEQbTJ(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Flow<Quintet<A, B, C, D, E>> copydefault(@NotNull InterfaceC49362unC interfaceC49362unC, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
                Objects.toString(interfaceC56560yJx3);
                Objects.toString(interfaceC56560yJx4);
                Objects.toString(interfaceC56560yJx5);
            }
            return C49360unA.KWHzl(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Flow<Sextet<A, B, C, D, E, F>> KWHzl(@NotNull InterfaceC49362unC interfaceC49362unC, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx6, "");
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
                Objects.toString(interfaceC56560yJx3);
                Objects.toString(interfaceC56560yJx4);
                Objects.toString(interfaceC56560yJx5);
                Objects.toString(interfaceC56560yJx6);
            }
            return C49360unA.AEQbTJ(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6);
        }
    }
}
