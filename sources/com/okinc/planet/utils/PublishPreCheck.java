package com.okinc.planet.utils;

import o.C33070mpX;
import o.C47501trL;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class PublishPreCheck {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PublishPreCheck[] $VALUES;
    private final String description;
    public static final PublishPreCheck NOT_DO_KYC = new PublishPreCheck("NOT_DO_KYC", 0, C33070mpX.AYXKKw(C47501trL.Fragment.aKhcqp));
    public static final PublishPreCheck USER_MUTED = new PublishPreCheck("USER_MUTED", 1, C33070mpX.AYXKKw(C47501trL.Fragment.deregisterUser));
    public static final PublishPreCheck CHECK_SUCCESS = new PublishPreCheck("CHECK_SUCCESS", 2, "");
    public static final PublishPreCheck CHECK_SHOW_AGREE_TNC = new PublishPreCheck("CHECK_SHOW_AGREE_TNC", 3, C33070mpX.AYXKKw(C47501trL.Fragment.profile));
    public static final PublishPreCheck CHECK_NET_ERROR = new PublishPreCheck("CHECK_NET_ERROR", 4, C33070mpX.AYXKKw(C47501trL.Fragment.profile));
    public static final PublishPreCheck NEED_MODIFY_PROFILE = new PublishPreCheck("NEED_MODIFY_PROFILE", 5, "");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PublishPreCheck[] $values() {
        return new PublishPreCheck[]{NOT_DO_KYC, USER_MUTED, CHECK_SUCCESS, CHECK_SHOW_AGREE_TNC, CHECK_NET_ERROR, NEED_MODIFY_PROFILE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PublishPreCheck> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    private PublishPreCheck(String str, int i, String str2) {
        this.description = str2;
    }

    static {
        PublishPreCheck[] publishPreCheckArr$values = $values();
        $VALUES = publishPreCheckArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(publishPreCheckArr$values);
    }

    public static PublishPreCheck valueOf(String str) {
        return (PublishPreCheck) Enum.valueOf(PublishPreCheck.class, str);
    }

    public static PublishPreCheck[] values() {
        return (PublishPreCheck[]) $VALUES.clone();
    }
}
