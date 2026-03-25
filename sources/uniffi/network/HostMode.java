package uniffi.network;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class HostMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HostMode[] $VALUES;
    public static final HostMode OSS = new HostMode("OSS", 0);
    public static final HostMode CDN = new HostMode("CDN", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HostMode[] $values() {
        return new HostMode[]{OSS, CDN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HostMode> getEntries() {
        return $ENTRIES;
    }

    private HostMode(String str, int i) {
    }

    static {
        HostMode[] hostModeArr$values = $values();
        $VALUES = hostModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(hostModeArr$values);
    }

    public static HostMode valueOf(String str) {
        return (HostMode) Enum.valueOf(HostMode.class, str);
    }

    public static HostMode[] values() {
        return (HostMode[]) $VALUES.clone();
    }
}
