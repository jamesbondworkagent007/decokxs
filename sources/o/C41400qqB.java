package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41400qqB extends AbstractC49400uno<kotlin.Pair<? extends CategoryGroupVo, ? extends java.util.List<? extends InterfaceC41583qtZ>>, java.util.List<? extends InterfaceC41583qtZ>> {
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C41400qqB(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<CategoryGroupVo, ? extends java.util.List<? extends InterfaceC41583qtZ>> pair, @NotNull Continuation<? super java.util.List<? extends InterfaceC41583qtZ>> continuation) {
        C41434qqj.KWHzl.KWHzl("FilterCoinVosUseCase", "input size: " + pair.getSecond().size() + ", categoryGroup: " + pair.getFirst());
        final CategoryGroupVo categoryGroupVoComponent1 = pair.component1();
        return C41389qpr.KWHzl(pair.component2(), new Function1() { // from class: o.qqH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C41400qqB.OLrzqt(this.AEQbTJ, categoryGroupVoComponent1, (InterfaceC41583qtZ) obj));
            }
        });
    }

    public static final boolean OLrzqt(C41400qqB c41400qqB, CategoryGroupVo categoryGroupVo, InterfaceC41583qtZ interfaceC41583qtZ) {
        Intrinsics.checkNotNullParameter(interfaceC41583qtZ, "");
        return c41400qqB.AEQbTJ(interfaceC41583qtZ.djBIcL(), categoryGroupVo);
    }

    public final boolean AEQbTJ(TradeCoinInfo tradeCoinInfo, CategoryGroupVo categoryGroupVo) {
        if (Intrinsics.EZpvd(categoryGroupVo, CategoryGroupVo.Companion.KWHzl())) {
            return true;
        }
        return CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) tradeCoinInfo.getGroups()), categoryGroupVo.gEmmrt().getId());
    }
}
