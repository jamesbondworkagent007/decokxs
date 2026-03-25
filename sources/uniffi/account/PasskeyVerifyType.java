package uniffi.account;

import com.google.api.client.googleapis.notifications.ResourceStates;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class PasskeyVerifyType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PasskeyVerifyType[] $VALUES;
    public static final PasskeyVerifyType SYNC = new PasskeyVerifyType(ResourceStates.SYNC, 0);
    public static final PasskeyVerifyType CROSS_DEVICE_VERIFY = new PasskeyVerifyType("CROSS_DEVICE_VERIFY", 1);
    public static final PasskeyVerifyType CROSS_DEVICE_IP_DOES_NOT_MATCH = new PasskeyVerifyType("CROSS_DEVICE_IP_DOES_NOT_MATCH", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PasskeyVerifyType[] $values() {
        return new PasskeyVerifyType[]{SYNC, CROSS_DEVICE_VERIFY, CROSS_DEVICE_IP_DOES_NOT_MATCH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PasskeyVerifyType> getEntries() {
        return $ENTRIES;
    }

    private PasskeyVerifyType(String str, int i) {
    }

    static {
        PasskeyVerifyType[] passkeyVerifyTypeArr$values = $values();
        $VALUES = passkeyVerifyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(passkeyVerifyTypeArr$values);
    }

    public static PasskeyVerifyType valueOf(String str) {
        return (PasskeyVerifyType) Enum.valueOf(PasskeyVerifyType.class, str);
    }

    public static PasskeyVerifyType[] values() {
        return (PasskeyVerifyType[]) $VALUES.clone();
    }
}
