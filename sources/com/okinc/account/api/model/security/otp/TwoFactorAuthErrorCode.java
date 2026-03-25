package com.okinc.account.api.model.security.otp;

/* JADX INFO: loaded from: classes22.dex */
public final class TwoFactorAuthErrorCode {
    public static final int $stable = 0;
    public static final String ERROR_EMAIL = "2";
    public static final String ERROR_GOOGLE = "0";
    public static final String ERROR_NEW_EMAIL = "5";
    public static final String ERROR_NEW_GOOGLE = "4";
    public static final String ERROR_NEW_SMS = "3";
    public static final String ERROR_SMS = "1";
    public static final TwoFactorAuthErrorCode INSTANCE = new TwoFactorAuthErrorCode();

    private TwoFactorAuthErrorCode() {
    }
}
