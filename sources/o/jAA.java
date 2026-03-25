package o;

import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.model.AddressTrackerNotificationData;
import com.okinc.business.market.features.address_tracker.domain.AddressTrackerNotification;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAA {
    public static final AddressTrackerNotification EZpvd(@NotNull AddressTrackerNotificationData addressTrackerNotificationData) {
        Intrinsics.checkNotNullParameter(addressTrackerNotificationData, "");
        return new AddressTrackerNotification(addressTrackerNotificationData.EZpvd(), addressTrackerNotificationData.djBIcL(), null, addressTrackerNotificationData.AEQbTJ() == StringBooleanType.TRUE, addressTrackerNotificationData.KWHzl(), addressTrackerNotificationData.gEmmrt(), addressTrackerNotificationData.copydefault(), 4, null);
    }
}
