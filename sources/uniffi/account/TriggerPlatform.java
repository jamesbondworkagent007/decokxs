package uniffi.account;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class TriggerPlatform {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TriggerPlatform[] $VALUES;
    public static final TriggerPlatform APP = new TriggerPlatform(GrsBaseInfo.CountryCodeSource.APP, 0);
    public static final TriggerPlatform WEB = new TriggerPlatform("WEB", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TriggerPlatform[] $values() {
        return new TriggerPlatform[]{APP, WEB};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TriggerPlatform> getEntries() {
        return $ENTRIES;
    }

    private TriggerPlatform(String str, int i) {
    }

    static {
        TriggerPlatform[] triggerPlatformArr$values = $values();
        $VALUES = triggerPlatformArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(triggerPlatformArr$values);
    }

    public static TriggerPlatform valueOf(String str) {
        return (TriggerPlatform) Enum.valueOf(TriggerPlatform.class, str);
    }

    public static TriggerPlatform[] values() {
        return (TriggerPlatform[]) $VALUES.clone();
    }
}
