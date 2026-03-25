package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class SocialType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SocialType[] $VALUES;
    public static final SocialType GOOGLE = new SocialType("GOOGLE", 0);
    public static final SocialType APPLE = new SocialType("APPLE", 1);
    public static final SocialType TELEGRAM = new SocialType("TELEGRAM", 2);
    public static final SocialType UNKNOWN = new SocialType("UNKNOWN", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SocialType[] $values() {
        return new SocialType[]{GOOGLE, APPLE, TELEGRAM, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SocialType> getEntries() {
        return $ENTRIES;
    }

    private SocialType(String str, int i) {
    }

    static {
        SocialType[] socialTypeArr$values = $values();
        $VALUES = socialTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(socialTypeArr$values);
    }

    public static SocialType valueOf(String str) {
        return (SocialType) Enum.valueOf(SocialType.class, str);
    }

    public static SocialType[] values() {
        return (SocialType[]) $VALUES.clone();
    }
}
