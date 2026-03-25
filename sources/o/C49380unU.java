package o;

import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49380unU {
    public static final <A, B> kotlin.Pair<A, B> OLrzqt(A a2, B b) {
        return new kotlin.Pair<>(a2, b);
    }

    public static final <A, B, C> Triple<A, B, C> copydefault(@NotNull kotlin.Pair<? extends A, ? extends B> pair, C c) {
        Intrinsics.checkNotNullParameter(pair, "");
        return new Triple<>(pair.getFirst(), pair.getSecond(), c);
    }

    public static final <A, B, C, D> Quartet<A, B, C, D> AEQbTJ(@NotNull Triple<? extends A, ? extends B, ? extends C> triple, D d) {
        Intrinsics.checkNotNullParameter(triple, "");
        return new Quartet<>(triple.getFirst(), triple.getSecond(), triple.getThird(), d);
    }

    public static final <A, B, C, D, E> Quintet<A, B, C, D, E> AEQbTJ(@NotNull Quartet<? extends A, ? extends B, ? extends C, ? extends D> quartet, E e) {
        Intrinsics.checkNotNullParameter(quartet, "");
        return new Quintet<>(quartet.getFirst(), quartet.getSecond(), quartet.getThird(), quartet.getFourth(), e);
    }

    public static final <A, B, C, D, E, F> Sextet<A, B, C, D, E, F> KWHzl(@NotNull Quintet<? extends A, ? extends B, ? extends C, ? extends D, ? extends E> quintet, F f) {
        Intrinsics.checkNotNullParameter(quintet, "");
        return new Sextet<>(quintet.getFirst(), quintet.getSecond(), quintet.getThird(), quintet.getFourth(), quintet.getFifth(), f);
    }
}
