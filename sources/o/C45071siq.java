package o;

import com.okinc.okex.center.bean.BannerContent;
import com.okinc.okex.center.bean.BannerItem;
import com.okinc.okex.center.bean.enums.BannerType;
import com.okinc.okex.center.ui.displaymodels.TransactionBannerDisplayModel;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.siq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45071siq {

    /* JADX INFO: renamed from: o.siq$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BannerType.values().length];
            try {
                iArr[BannerType.WITHDRAW_ASSET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
        }
    }

    public static final TransactionBannerDisplayModel AEQbTJ(@NotNull BannerItem bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "");
        BannerContent content = bannerItem.getContent();
        if (content == null) {
            return null;
        }
        BannerType type = bannerItem.getType();
        if (type != null && TaskDescription.AEQbTJ[type.ordinal()] == 1) {
            java.lang.String title = content.getTitle();
            if (title == null) {
                title = "";
            }
            java.lang.String details = content.getDetails();
            java.lang.String str = details != null ? details : "";
            java.lang.Long withdrawOpenTime = content.getWithdrawOpenTime();
            return new TransactionBannerDisplayModel(title, str, withdrawOpenTime != null ? pTA.formatSimpleDateTime$default(new Date(withdrawOpenTime.longValue()), null, 1, null) : null);
        }
        java.lang.String title2 = content.getTitle();
        java.lang.String str2 = title2 == null ? "" : title2;
        java.lang.String details2 = content.getDetails();
        return new TransactionBannerDisplayModel(str2, details2 == null ? "" : details2, (java.lang.String) null, 4, (DefaultConstructorMarker) null);
    }
}
