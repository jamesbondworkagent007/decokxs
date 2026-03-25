package uniffi.settings;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class SettingsEvent {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SettingsEvent[] $VALUES;
    public static final SettingsEvent RISE_FALL_COLOR_UPDATED = new SettingsEvent("RISE_FALL_COLOR_UPDATED", 0);
    public static final SettingsEvent COLOR_APPEARANCE_UPDATED = new SettingsEvent("COLOR_APPEARANCE_UPDATED", 1);
    public static final SettingsEvent RISE_FALL_CYCLE_UPDATED = new SettingsEvent("RISE_FALL_CYCLE_UPDATED", 2);
    public static final SettingsEvent CURRENCY_PREF_CHANGED = new SettingsEvent("CURRENCY_PREF_CHANGED", 3);
    public static final SettingsEvent FUND_UNIT_CURRENCY_PREF_CHANGED = new SettingsEvent("FUND_UNIT_CURRENCY_PREF_CHANGED", 4);
    public static final SettingsEvent USER_PREF_API_DID_FINISHED = new SettingsEvent("USER_PREF_API_DID_FINISHED", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SettingsEvent[] $values() {
        return new SettingsEvent[]{RISE_FALL_COLOR_UPDATED, COLOR_APPEARANCE_UPDATED, RISE_FALL_CYCLE_UPDATED, CURRENCY_PREF_CHANGED, FUND_UNIT_CURRENCY_PREF_CHANGED, USER_PREF_API_DID_FINISHED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SettingsEvent> getEntries() {
        return $ENTRIES;
    }

    private SettingsEvent(String str, int i) {
    }

    static {
        SettingsEvent[] settingsEventArr$values = $values();
        $VALUES = settingsEventArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(settingsEventArr$values);
    }

    public static SettingsEvent valueOf(String str) {
        return (SettingsEvent) Enum.valueOf(SettingsEvent.class, str);
    }

    public static SettingsEvent[] values() {
        return (SettingsEvent[]) $VALUES.clone();
    }
}
