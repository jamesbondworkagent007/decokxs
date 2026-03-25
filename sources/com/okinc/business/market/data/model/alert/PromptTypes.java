package com.okinc.business.market.data.model.alert;

import androidx.annotation.StringRes;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class PromptTypes {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PromptTypes[] $VALUES;
    public static final PromptTypes GAIN_EXCEEDS;
    public static final PromptTypes LOSS_EXCEEDS;
    public static final PromptTypes MARKETCAP_MOVE_ABOVE;
    public static final PromptTypes MARKETCAP_MOVE_BELOW;
    public static final PromptTypes MARKETCAP_REACHES;
    public static final PromptTypes PRICE_MOVE_ABOVE;
    public static final PromptTypes PRICE_MOVE_BELOW;
    public static final PromptTypes PRICE_REACHES;
    private final AlertType alertType;
    private final int titleResId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PromptTypes[] $values() {
        return new PromptTypes[]{PRICE_MOVE_ABOVE, PRICE_MOVE_BELOW, PRICE_REACHES, GAIN_EXCEEDS, LOSS_EXCEEDS, MARKETCAP_MOVE_ABOVE, MARKETCAP_MOVE_BELOW, MARKETCAP_REACHES};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PromptTypes> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertType getAlertType() {
        return this.alertType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    private PromptTypes(@StringRes String str, int i, int i2, AlertType alertType) {
        this.titleResId = i2;
        this.alertType = alertType;
    }

    static {
        int i = C23274hvD.Fragment.DkIxYv;
        AlertType alertType = AlertType.PRICE;
        PRICE_MOVE_ABOVE = new PromptTypes("PRICE_MOVE_ABOVE", 0, i, alertType);
        PRICE_MOVE_BELOW = new PromptTypes("PRICE_MOVE_BELOW", 1, C23274hvD.Fragment.DDNONI, alertType);
        PRICE_REACHES = new PromptTypes("PRICE_REACHES", 2, C23274hvD.Fragment.UkuJRw, alertType);
        GAIN_EXCEEDS = new PromptTypes("GAIN_EXCEEDS", 3, C23274hvD.Fragment.OYuSWK, alertType);
        LOSS_EXCEEDS = new PromptTypes("LOSS_EXCEEDS", 4, C23274hvD.Fragment.fOrBHg, alertType);
        int i2 = C23274hvD.Fragment.sWlOSi;
        AlertType alertType2 = AlertType.MARKETCAP;
        MARKETCAP_MOVE_ABOVE = new PromptTypes("MARKETCAP_MOVE_ABOVE", 5, i2, alertType2);
        MARKETCAP_MOVE_BELOW = new PromptTypes("MARKETCAP_MOVE_BELOW", 6, C23274hvD.Fragment.UnZVfq, alertType2);
        MARKETCAP_REACHES = new PromptTypes("MARKETCAP_REACHES", 7, C23274hvD.Fragment.UNDaji, alertType2);
        PromptTypes[] promptTypesArr$values = $values();
        $VALUES = promptTypesArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(promptTypesArr$values);
    }

    public static PromptTypes valueOf(String str) {
        return (PromptTypes) Enum.valueOf(PromptTypes.class, str);
    }

    public static PromptTypes[] values() {
        return (PromptTypes[]) $VALUES.clone();
    }
}
