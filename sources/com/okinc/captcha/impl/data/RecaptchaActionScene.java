package com.okinc.captcha.impl.data;

import com.google.firebase.analytics.FirebaseAnalytics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class RecaptchaActionScene {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecaptchaActionScene[] $VALUES;
    private final String key;
    public static final RecaptchaActionScene LOGIN = new RecaptchaActionScene("LOGIN", 0, FirebaseAnalytics.Event.LOGIN);
    public static final RecaptchaActionScene REGISTER = new RecaptchaActionScene("REGISTER", 1, "register");
    public static final RecaptchaActionScene RESET_PASSWORD = new RecaptchaActionScene("RESET_PASSWORD", 2, "reset_password");
    public static final RecaptchaActionScene SEND_CODE = new RecaptchaActionScene("SEND_CODE", 3, "send_code");
    public static final RecaptchaActionScene CHECK_SUBACCOUNT_EXISTENCE = new RecaptchaActionScene("CHECK_SUBACCOUNT_EXISTENCE", 4, "check_subaccount_existence");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecaptchaActionScene[] $values() {
        return new RecaptchaActionScene[]{LOGIN, REGISTER, RESET_PASSWORD, SEND_CODE, CHECK_SUBACCOUNT_EXISTENCE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecaptchaActionScene> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    private RecaptchaActionScene(String str, int i, String str2) {
        this.key = str2;
    }

    static {
        RecaptchaActionScene[] recaptchaActionSceneArr$values = $values();
        $VALUES = recaptchaActionSceneArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recaptchaActionSceneArr$values);
    }

    public static RecaptchaActionScene valueOf(String str) {
        return (RecaptchaActionScene) Enum.valueOf(RecaptchaActionScene.class, str);
    }

    public static RecaptchaActionScene[] values() {
        return (RecaptchaActionScene[]) $VALUES.clone();
    }
}
