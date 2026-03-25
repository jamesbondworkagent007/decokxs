package o;

import com.okinc.market.search.features.main.root.data.po.SearchTrader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGG {
    public static final java.lang.String OLrzqt(@NotNull SearchTrader searchTrader) {
        Intrinsics.checkNotNullParameter(searchTrader, "");
        java.lang.String nickNameEn = searchTrader.getNickNameEn();
        if (nickNameEn == null || nickNameEn.length() == 0) {
            java.lang.String nickNameCn = searchTrader.getNickNameCn();
            return nickNameCn == null ? "" : nickNameCn;
        }
        java.lang.String nickNameCn2 = searchTrader.getNickNameCn();
        if (nickNameCn2 == null || nickNameCn2.length() == 0) {
            java.lang.String nickNameEn2 = searchTrader.getNickNameEn();
            return nickNameEn2 == null ? "" : nickNameEn2;
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (!C38303pTu.OLrzqt(locale)) {
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            if (!C38303pTu.KWHzl(locale2)) {
                return searchTrader.getNickNameEn() + "(" + searchTrader.getNickNameCn() + ")";
            }
        }
        return searchTrader.getNickNameCn() + "(" + searchTrader.getNickNameEn() + ")";
    }
}
