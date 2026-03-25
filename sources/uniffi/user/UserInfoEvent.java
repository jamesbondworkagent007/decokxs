package uniffi.user;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class UserInfoEvent {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UserInfoEvent[] $VALUES;
    public static final UserInfoEvent USER_INFO_UPDATED = new UserInfoEvent("USER_INFO_UPDATED", 0);
    public static final UserInfoEvent USER_PROFILE_UPDATED = new UserInfoEvent("USER_PROFILE_UPDATED", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UserInfoEvent[] $values() {
        return new UserInfoEvent[]{USER_INFO_UPDATED, USER_PROFILE_UPDATED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UserInfoEvent> getEntries() {
        return $ENTRIES;
    }

    private UserInfoEvent(String str, int i) {
    }

    static {
        UserInfoEvent[] userInfoEventArr$values = $values();
        $VALUES = userInfoEventArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(userInfoEventArr$values);
    }

    public static UserInfoEvent valueOf(String str) {
        return (UserInfoEvent) Enum.valueOf(UserInfoEvent.class, str);
    }

    public static UserInfoEvent[] values() {
        return (UserInfoEvent[]) $VALUES.clone();
    }
}
