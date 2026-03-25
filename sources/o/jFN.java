package o;

import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerAddressGroupUIModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class jFN {
    public static final java.lang.String OLrzqt(@NotNull TrackerAddressGroupUIModel trackerAddressGroupUIModel, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(trackerAddressGroupUIModel, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (trackerAddressGroupUIModel.copydefault() != 0) {
            java.lang.String string = context.getString(trackerAddressGroupUIModel.copydefault());
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        return trackerAddressGroupUIModel.KWHzl();
    }
}
