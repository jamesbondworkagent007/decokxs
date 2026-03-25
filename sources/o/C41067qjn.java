package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.data.po.TrendingCategoriesPo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.data.repository.TrendingCategoriesRepository$getTrendingCategoriesData$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qjn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41067qjn {
    public final CoroutineDispatcher EZpvd;
    public final C41062qji OLrzqt;

    @yCM
    public C41067qjn(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41062qji c41062qji) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41062qji, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = c41062qji;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super java.util.List<TrendingCategoriesPo>> continuation) throws java.lang.Throwable {
        TrendingCategoriesRepository$getTrendingCategoriesData$1 trendingCategoriesRepository$getTrendingCategoriesData$1;
        if (continuation instanceof TrendingCategoriesRepository$getTrendingCategoriesData$1) {
            trendingCategoriesRepository$getTrendingCategoriesData$1 = (TrendingCategoriesRepository$getTrendingCategoriesData$1) continuation;
            int i = trendingCategoriesRepository$getTrendingCategoriesData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trendingCategoriesRepository$getTrendingCategoriesData$1.label = i - Integer.MIN_VALUE;
            } else {
                trendingCategoriesRepository$getTrendingCategoriesData$1 = new TrendingCategoriesRepository$getTrendingCategoriesData$1(this, continuation);
            }
        }
        TrendingCategoriesRepository$getTrendingCategoriesData$1 trendingCategoriesRepository$getTrendingCategoriesData$12 = trendingCategoriesRepository$getTrendingCategoriesData$1;
        java.lang.Object objEZpvd = trendingCategoriesRepository$getTrendingCategoriesData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trendingCategoriesRepository$getTrendingCategoriesData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C41062qji c41062qji = this.OLrzqt;
            trendingCategoriesRepository$getTrendingCategoriesData$12.label = 1;
            objEZpvd = c41062qji.EZpvd(num, str, str2, str3, trendingCategoriesRepository$getTrendingCategoriesData$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return ((ResponseData) objEZpvd).getData();
    }
}
