package aws.sdk.kotlin.runtime.config.profile;

import com.bytedance.applog.log.LogUtils;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ConfigSectionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConfigSectionType[] $VALUES;
    public static final ConfigSectionType PROFILE = new ConfigSectionType(LogUtils.EVENT_TYPE_PROFILE, 0);
    public static final ConfigSectionType SSO_SESSION = new ConfigSectionType("SSO_SESSION", 1);
    public static final ConfigSectionType SERVICES = new ConfigSectionType("SERVICES", 2);
    public static final ConfigSectionType UNKNOWN = new ConfigSectionType("UNKNOWN", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConfigSectionType[] $values() {
        return new ConfigSectionType[]{PROFILE, SSO_SESSION, SERVICES, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConfigSectionType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static ConfigSectionType valueOf(String str) {
        return (ConfigSectionType) Enum.valueOf(ConfigSectionType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static ConfigSectionType[] values() {
        return (ConfigSectionType[]) $VALUES.clone();
    }

    private ConfigSectionType(String str, int i) {
    }

    static {
        ConfigSectionType[] configSectionTypeArr$values = $values();
        $VALUES = configSectionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(configSectionTypeArr$values);
    }
}
