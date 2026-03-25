package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.home.favorites.CardFavQuoteFragment$mAdapter$2$3$2;
import com.okinc.business.market.home.favorites.MarketFavQuoteFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.InterfaceC27809kEc;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kDF extends MarketFavQuoteFragment {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.kDC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return kDF.KWHzl(this.copydefault);
        }
    });
    public final int AEQbTJ = qZH.ActionBar.DGOPHZ;

    /* JADX DEBUG: Possible override for method o.kEd.AEQbTJ()V */
    @Override // com.okinc.business.market.home.favorites.MarketFavQuoteFragment
    public int AEQbTJ() {
        return 6;
    }

    @Override // o.AbstractC27795kDq
    public boolean KWHzl() {
        return true;
    }

    @Override // com.okinc.business.market.home.favorites.MarketFavQuoteFragment
    public int gEmmrt() {
        return 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.market.home.favorites.MarketFavQuoteFragment, o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Lo/zip; */
    /* JADX DEBUG: Possible override for method com.okinc.business.market.home.favorites.MarketFavQuoteFragment.valueOf()Lo/pWt; */
    @Override // com.okinc.business.market.home.favorites.MarketFavQuoteFragment
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public kEL AhwBna() {
        return (kEL) this.copydefault.getValue();
    }

    public static final kEL KWHzl(final kDF kdf) {
        return new kEL(kdf.values(), new Function2() { // from class: o.kDB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return kDF.copydefault(this.KWHzl, (CoinQuote) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, new Function2() { // from class: o.kDE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return kDF.copydefault(this.KWHzl, (qWK) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, new Function0() { // from class: o.kDD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kDF.copydefault(this.EZpvd);
            }
        });
    }

    public static final Unit copydefault(kDF kdf, CoinQuote coinQuote, int i) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        InterfaceC27809kEc interfaceC27809kEcAEQbTJ = C27811kEe.AEQbTJ(kdf);
        if (interfaceC27809kEcAEQbTJ != null) {
            InterfaceC27809kEc.TaskDescription.trackTradingPairClick$default(interfaceC27809kEcAEQbTJ, "favorites", coinQuote.getInstId(), i, null, 8, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(kDF kdf, qWK qwk, int i) {
        Intrinsics.checkNotNullParameter(qwk, "");
        InterfaceC27809kEc interfaceC27809kEcAEQbTJ = C27811kEe.AEQbTJ(kdf);
        if (interfaceC27809kEcAEQbTJ != null) {
            interfaceC27809kEcAEQbTJ.copydefault("favorites", qwk.copydefault().getTokenName(), i, qwk.copydefault().getTokenContractAddress());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(kDF kdf) {
        if (kdf.getContext() != null) {
            kdf.copydefault(false);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(kdf), null, null, new CardFavQuoteFragment$mAdapter$2$3$2(kdf, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.market.home.favorites.MarketFavQuoteFragment
    public void AEQbTJ(@NotNull java.util.List<? extends qWH> list, @NotNull java.util.ArrayList<java.lang.Object> arrayList) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        C27994kKz.KWHzl.EZpvd(list, arrayList, gEmmrt(), java.lang.Boolean.TRUE);
    }

    @Override // com.okinc.business.market.home.favorites.MarketFavQuoteFragment
    public android.os.Bundle OLrzqt(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.putInt("key_recommend_count", 8);
        bundle.putBoolean("key_hide_title", true);
        bundle.putBoolean("key_use_card_style", true);
        return bundle;
    }

    @Override // com.okinc.business.market.home.favorites.MarketFavQuoteFragment
    public void OLrzqt(@NotNull android.widget.FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "");
        pXA.preLoadingMarketCardStyle$default(frameLayout, 0, 1, null);
    }
}
