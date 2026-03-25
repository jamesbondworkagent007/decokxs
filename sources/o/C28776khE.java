package o;

import com.okinc.business.market.features.meme.similar_tokens.domain.model.SimilarTokenData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28776khE {
    public static final C28868kir OLrzqt(@NotNull SimilarTokenData similarTokenData) {
        Intrinsics.checkNotNullParameter(similarTokenData, "");
        return new C28868kir(similarTokenData.getChainId(), similarTokenData.getTokenContractAddress(), similarTokenData.getTokenLogoUrl(), similarTokenData.getChainLogoUrl(), similarTokenData.getTokenSymbol(), similarTokenData.getTokenName(), similarTokenData.getMarketCap(), similarTokenData.getCreateTime(), similarTokenData.getLastPricingTransactionTime());
    }
}
