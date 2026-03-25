package o;

import com.amplifyframework.auth.cognito.asf.BuildDataCollector;
import com.okinc.market.search.features.main.recommend.history.data.model.InvestCurrency;
import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import com.okinc.market.search.features.main.recommend.history.data.model.ProductType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qCn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39916qCn {
    public static final java.lang.String copydefault(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "");
        InvestCurrency investCurrency = product.getInvestCurrency();
        java.lang.Integer currencyId = investCurrency != null ? investCurrency.getCurrencyId() : null;
        ProductType productType = product.getProductType();
        return BuildDataCollector.PRODUCT + currencyId + (productType != null ? productType.getCode() : null);
    }
}
