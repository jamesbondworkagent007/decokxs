package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class MfaSwitchMethodItem {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MfaSwitchMethodItem[] $VALUES;
    public static final MfaSwitchMethodItem PHONE = new MfaSwitchMethodItem("PHONE", 0);
    public static final MfaSwitchMethodItem EMAIL = new MfaSwitchMethodItem("EMAIL", 1);
    public static final MfaSwitchMethodItem VOICE = new MfaSwitchMethodItem("VOICE", 2);
    public static final MfaSwitchMethodItem AUTHENTICATOR = new MfaSwitchMethodItem("AUTHENTICATOR", 3);
    public static final MfaSwitchMethodItem RESET_TWO_FA = new MfaSwitchMethodItem("RESET_TWO_FA", 4);
    public static final MfaSwitchMethodItem PASSWORD = new MfaSwitchMethodItem("PASSWORD", 5);
    public static final MfaSwitchMethodItem PASSKEY = new MfaSwitchMethodItem("PASSKEY", 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MfaSwitchMethodItem[] $values() {
        return new MfaSwitchMethodItem[]{PHONE, EMAIL, VOICE, AUTHENTICATOR, RESET_TWO_FA, PASSWORD, PASSKEY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MfaSwitchMethodItem> getEntries() {
        return $ENTRIES;
    }

    private MfaSwitchMethodItem(String str, int i) {
    }

    static {
        MfaSwitchMethodItem[] mfaSwitchMethodItemArr$values = $values();
        $VALUES = mfaSwitchMethodItemArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mfaSwitchMethodItemArr$values);
    }

    public static MfaSwitchMethodItem valueOf(String str) {
        return (MfaSwitchMethodItem) Enum.valueOf(MfaSwitchMethodItem.class, str);
    }

    public static MfaSwitchMethodItem[] values() {
        return (MfaSwitchMethodItem[]) $VALUES.clone();
    }
}
