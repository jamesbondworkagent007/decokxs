package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class ProfileListType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProfileListType[] $VALUES;
    public static final ProfileListType LOGIN_NAME = new ProfileListType("LOGIN_NAME", 0);
    public static final ProfileListType UID = new ProfileListType("UID", 1);
    public static final ProfileListType KYC_LEVEL = new ProfileListType("KYC_LEVEL", 2);
    public static final ProfileListType COUNTRY_REGION = new ProfileListType("COUNTRY_REGION", 3);
    public static final ProfileListType FEES_TIER = new ProfileListType("FEES_TIER", 4);
    public static final ProfileListType AFFILIATE_REBATE_REWARDS = new ProfileListType("AFFILIATE_REBATE_REWARDS", 5);
    public static final ProfileListType GLOBAL_TRADING_ACCOUNT = new ProfileListType("GLOBAL_TRADING_ACCOUNT", 6);
    public static final ProfileListType SOCIAL_ACCOUNT = new ProfileListType("SOCIAL_ACCOUNT", 7);
    public static final ProfileListType LINKED_WALLETS = new ProfileListType("LINKED_WALLETS", 8);
    public static final ProfileListType X_ACCOUNT = new ProfileListType("X_ACCOUNT", 9);
    public static final ProfileListType SWITCH_ACCOUNT = new ProfileListType("SWITCH_ACCOUNT", 10);
    public static final ProfileListType LOGOUT = new ProfileListType("LOGOUT", 11);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProfileListType[] $values() {
        return new ProfileListType[]{LOGIN_NAME, UID, KYC_LEVEL, COUNTRY_REGION, FEES_TIER, AFFILIATE_REBATE_REWARDS, GLOBAL_TRADING_ACCOUNT, SOCIAL_ACCOUNT, LINKED_WALLETS, X_ACCOUNT, SWITCH_ACCOUNT, LOGOUT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProfileListType> getEntries() {
        return $ENTRIES;
    }

    private ProfileListType(String str, int i) {
    }

    static {
        ProfileListType[] profileListTypeArr$values = $values();
        $VALUES = profileListTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(profileListTypeArr$values);
    }

    public static ProfileListType valueOf(String str) {
        return (ProfileListType) Enum.valueOf(ProfileListType.class, str);
    }

    public static ProfileListType[] values() {
        return (ProfileListType[]) $VALUES.clone();
    }
}
