package o;

import com.okinc.business.market.common.constants.RankingType;
import com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28419kaS {

    /* JADX INFO: renamed from: o.kaS$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RankingType.values().length];
            try {
                iArr[RankingType.PRICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RankingType.MARKET_CAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RankingType.TURNOVER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[RankingType.CHANGE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    @yCM
    public C28419kaS() {
    }

    public final java.util.List<HomeToken> OLrzqt(@NotNull java.util.List<HomeToken> list, @NotNull HomeFavoriteListFilter homeFavoriteListFilter) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(homeFavoriteListFilter, "");
        if (homeFavoriteListFilter.AYXKKw()) {
            return CollectionsKt___CollectionsKt.EZpvd(list, new TaskDescription(homeFavoriteListFilter));
        }
        return CollectionsKt___CollectionsKt.EZpvd(list, new Application(homeFavoriteListFilter));
    }

    public final double AEQbTJ(HomeToken homeToken, HomeFavoriteListFilter homeFavoriteListFilter) {
        java.lang.String strGEmmrt;
        int i = ActionBar.OLrzqt[homeFavoriteListFilter.valueOf().ordinal()];
        if (i == 1) {
            strGEmmrt = homeToken.gEmmrt();
        } else if (i == 2) {
            strGEmmrt = homeToken.copydefault();
        } else if (i == 3) {
            strGEmmrt = homeToken.fetchVPNInfo();
        } else {
            strGEmmrt = i != 4 ? "" : homeToken.AEQbTJ();
        }
        return C33129mqd.AEQbTJ(strGEmmrt);
    }

    /* JADX INFO: renamed from: o.kaS$Application */
    public static final class Application<T> implements java.util.Comparator {
        public final /* synthetic */ HomeFavoriteListFilter OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(HomeFavoriteListFilter homeFavoriteListFilter) {
            this.OLrzqt = homeFavoriteListFilter;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C28419kaS.this.AEQbTJ((HomeToken) t, this.OLrzqt)), java.lang.Double.valueOf(C28419kaS.this.AEQbTJ((HomeToken) t2, this.OLrzqt)));
        }
    }

    /* JADX INFO: renamed from: o.kaS$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        public final /* synthetic */ HomeFavoriteListFilter KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(HomeFavoriteListFilter homeFavoriteListFilter) {
            this.KWHzl = homeFavoriteListFilter;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C28419kaS.this.AEQbTJ((HomeToken) t2, this.KWHzl)), java.lang.Double.valueOf(C28419kaS.this.AEQbTJ((HomeToken) t, this.KWHzl)));
        }
    }
}
