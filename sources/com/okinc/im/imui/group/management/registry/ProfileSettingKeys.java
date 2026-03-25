package com.okinc.im.imui.group.management.registry;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ProfileSettingKeys {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProfileSettingKeys[] $VALUES;
    public static final ProfileSettingKeys INVITE_VIA_QR = new ProfileSettingKeys("INVITE_VIA_QR", 0);
    public static final ProfileSettingKeys JOIN_REQUESTS = new ProfileSettingKeys("JOIN_REQUESTS", 1);
    public static final ProfileSettingKeys GROUP_MANAGEMENT = new ProfileSettingKeys("GROUP_MANAGEMENT", 2);
    public static final ProfileSettingKeys JOIN_REQUIREMENTS = new ProfileSettingKeys("JOIN_REQUIREMENTS", 3);
    public static final ProfileSettingKeys PAID_GROUP_DASHBOARD = new ProfileSettingKeys("PAID_GROUP_DASHBOARD", 4);
    public static final ProfileSettingKeys PAID_GROUP_PAY_MEMBERSHIP = new ProfileSettingKeys("PAID_GROUP_PAY_MEMBERSHIP", 5);
    public static final ProfileSettingKeys SEARCH_IN_CHAT = new ProfileSettingKeys("SEARCH_IN_CHAT", 6);
    public static final ProfileSettingKeys ANNOUNCEMENTS = new ProfileSettingKeys("ANNOUNCEMENTS", 7);
    public static final ProfileSettingKeys MUTE_NOTIFICATIONS = new ProfileSettingKeys("MUTE_NOTIFICATIONS", 8);
    public static final ProfileSettingKeys PIN_TO_TOP = new ProfileSettingKeys("PIN_TO_TOP", 9);
    public static final ProfileSettingKeys DISBAND_GROUP = new ProfileSettingKeys("DISBAND_GROUP", 10);
    public static final ProfileSettingKeys LEAVE_GROUP = new ProfileSettingKeys("LEAVE_GROUP", 11);
    public static final ProfileSettingKeys DIVIDER = new ProfileSettingKeys("DIVIDER", 12);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProfileSettingKeys[] $values() {
        return new ProfileSettingKeys[]{INVITE_VIA_QR, JOIN_REQUESTS, GROUP_MANAGEMENT, JOIN_REQUIREMENTS, PAID_GROUP_DASHBOARD, PAID_GROUP_PAY_MEMBERSHIP, SEARCH_IN_CHAT, ANNOUNCEMENTS, MUTE_NOTIFICATIONS, PIN_TO_TOP, DISBAND_GROUP, LEAVE_GROUP, DIVIDER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProfileSettingKeys> getEntries() {
        return $ENTRIES;
    }

    private ProfileSettingKeys(String str, int i) {
    }

    static {
        ProfileSettingKeys[] profileSettingKeysArr$values = $values();
        $VALUES = profileSettingKeysArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(profileSettingKeysArr$values);
    }

    public static ProfileSettingKeys valueOf(String str) {
        return (ProfileSettingKeys) Enum.valueOf(ProfileSettingKeys.class, str);
    }

    public static ProfileSettingKeys[] values() {
        return (ProfileSettingKeys[]) $VALUES.clone();
    }
}
