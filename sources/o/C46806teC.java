package o;

import com.okinc.market.ticker.model.DexTickerPo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.teC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46806teC extends AbstractC49400uno<java.util.List<? extends kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>>, Flow<? extends DexTickerPo>> {
    public final CoroutineDispatcher AEQbTJ;
    public final qUX copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C46806teC(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull qUX qux) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qux, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = qux;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list, @NotNull Continuation<? super Flow<DexTickerPo>> continuation) {
        return this.copydefault.copydefault(list, continuation);
    }
}
