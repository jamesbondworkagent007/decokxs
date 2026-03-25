package uniffi.account;

import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class LostPasskeyButtonName {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LostPasskeyButtonName[] $VALUES;
    public static final LostPasskeyButtonName RESET = new LostPasskeyButtonName("RESET", 0);
    public static final LostPasskeyButtonName CLOSE = new LostPasskeyButtonName(InvestButtonAction.ACTION_CALLBACK_CLOSE, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LostPasskeyButtonName[] $values() {
        return new LostPasskeyButtonName[]{RESET, CLOSE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LostPasskeyButtonName> getEntries() {
        return $ENTRIES;
    }

    private LostPasskeyButtonName(String str, int i) {
    }

    static {
        LostPasskeyButtonName[] lostPasskeyButtonNameArr$values = $values();
        $VALUES = lostPasskeyButtonNameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(lostPasskeyButtonNameArr$values);
    }

    public static LostPasskeyButtonName valueOf(String str) {
        return (LostPasskeyButtonName) Enum.valueOf(LostPasskeyButtonName.class, str);
    }

    public static LostPasskeyButtonName[] values() {
        return (LostPasskeyButtonName[]) $VALUES.clone();
    }
}
