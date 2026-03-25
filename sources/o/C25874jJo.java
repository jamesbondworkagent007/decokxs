package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.assets.api.model.ValuationCurrency;
import java.math.BigDecimal;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jJo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25874jJo extends AbstractC49400uno<kotlin.Pair<? extends java.lang.String, ? extends ValuationCurrency>, C25902jKp> {
    public final CoroutineDispatcher AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C25874jJo(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kKi.formatValue$default(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<java.lang.String, ValuationCurrency> pair, @NotNull Continuation<? super C25902jKp> continuation) {
        return new C25902jKp(pair.getFirst(), C27977kKi.OLrzqt(pair.getFirst(), pair.getSecond().getUnit(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 2) != 0 ? "" : pair.getSecond().getSymbol(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 4) != 0 ? false : true, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 8) == 0 ? false : false, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 16) != 0 ? "" : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 32) == 0 ? null : "", (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 64) != 0, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 128) != 0 ? new Function2() { // from class: o.kKj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27977kKi.copydefault((BigDecimal) obj, (C38307pTy) obj2);
            }
        } : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 256) != 0 ? new Function1() { // from class: o.kKn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27977kKi.EZpvd(((java.lang.Integer) obj).intValue());
            }
        } : null));
    }
}
