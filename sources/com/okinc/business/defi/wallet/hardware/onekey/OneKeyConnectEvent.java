package com.okinc.business.defi.wallet.hardware.onekey;

import androidx.annotation.StringRes;
import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface OneKeyConnectEvent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ShowNotification implements OneKeyConnectEvent {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ShowNotification[] $VALUES;
        private final int title;
        public static final ShowNotification PassphraseNotSupported = new ShowNotification("PassphraseNotSupported", 0, C13754dXa.FragmentManager.IResultReceiverDefault);
        public static final ShowNotification PinInvalid = new ShowNotification("PinInvalid", 1, C13754dXa.FragmentManager.getName);
        public static final ShowNotification PinCancelled = new ShowNotification("PinCancelled", 2, C13754dXa.FragmentManager.PlaybackStateCompatErrorCode);
        public static final ShowNotification BluetoothError = new ShowNotification("BluetoothError", 3, C13754dXa.FragmentManager.PlaybackStateCompatCustomAction1);
        public static final ShowNotification SDKUnavailable = new ShowNotification("SDKUnavailable", 4, C13754dXa.FragmentManager.send);
        public static final ShowNotification GeneralError = new ShowNotification("GeneralError", 5, C13754dXa.FragmentManager.send);
        public static final ShowNotification UpgradeIsRequired = new ShowNotification("UpgradeIsRequired", 6, C13754dXa.FragmentManager.IResultReceiver);
        public static final ShowNotification WalletAlreadyAdded = new ShowNotification("WalletAlreadyAdded", 7, C13754dXa.FragmentManager.PlaybackStateCompatRepeatMode);
        public static final ShowNotification AddressNotMatched = new ShowNotification("AddressNotMatched", 8, C13754dXa.FragmentManager.getIcon);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ShowNotification[] $values() {
            return new ShowNotification[]{PassphraseNotSupported, PinInvalid, PinCancelled, BluetoothError, SDKUnavailable, GeneralError, UpgradeIsRequired, WalletAlreadyAdded, AddressNotMatched};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ShowNotification> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTitle() {
            return this.title;
        }

        private ShowNotification(@StringRes String str, int i, int i2) {
            this.title = i2;
        }

        static {
            ShowNotification[] showNotificationArr$values = $values();
            $VALUES = showNotificationArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(showNotificationArr$values);
        }

        public static ShowNotification valueOf(String str) {
            return (ShowNotification) Enum.valueOf(ShowNotification.class, str);
        }

        public static ShowNotification[] values() {
            return (ShowNotification[]) $VALUES.clone();
        }
    }

    public static final class Activity implements OneKeyConnectEvent {
        public static final int OLrzqt = OneKeyConnectedDevice.$stable;
        public final OneKeyConnectedDevice EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, OneKeyConnectedDevice oneKeyConnectedDevice, int i, Object obj) {
            if ((i & 1) != 0) {
                oneKeyConnectedDevice = activity.EZpvd;
            }
            return activity.copydefault(oneKeyConnectedDevice);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OneKeyConnectedDevice EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull OneKeyConnectedDevice oneKeyConnectedDevice) {
            Intrinsics.checkNotNullParameter(oneKeyConnectedDevice, "");
            return new Activity(oneKeyConnectedDevice);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.EZpvd, ((Activity) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ConnectedSuccess(device=" + this.EZpvd + ")";
        }

        public Activity(@NotNull OneKeyConnectedDevice oneKeyConnectedDevice) {
            Intrinsics.checkNotNullParameter(oneKeyConnectedDevice, "");
            this.EZpvd = oneKeyConnectedDevice;
        }
    }
}
