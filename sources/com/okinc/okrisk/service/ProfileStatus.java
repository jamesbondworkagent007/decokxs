package com.okinc.okrisk.service;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ProfileStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProfileStatus[] $VALUES;
    public static final ProfileStatus SUCCESS = new ProfileStatus("SUCCESS", 0);
    public static final ProfileStatus FAILURE = new ProfileStatus("FAILURE", 1);
    public static final ProfileStatus TIMEOUT = new ProfileStatus("TIMEOUT", 2);
    public static final ProfileStatus ALI_TOKEN_FETCH_FAILED = new ProfileStatus("ALI_TOKEN_FETCH_FAILED", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProfileStatus[] $values() {
        return new ProfileStatus[]{SUCCESS, FAILURE, TIMEOUT, ALI_TOKEN_FETCH_FAILED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProfileStatus> getEntries() {
        return $ENTRIES;
    }

    private ProfileStatus(String str, int i) {
    }

    static {
        ProfileStatus[] profileStatusArr$values = $values();
        $VALUES = profileStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(profileStatusArr$values);
    }

    public static ProfileStatus valueOf(String str) {
        return (ProfileStatus) Enum.valueOf(ProfileStatus.class, str);
    }

    public static ProfileStatus[] values() {
        return (ProfileStatus[]) $VALUES.clone();
    }
}
