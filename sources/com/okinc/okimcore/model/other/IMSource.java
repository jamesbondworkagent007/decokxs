package com.okinc.okimcore.model.other;

import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.p2p.api.OtcExtraKeys;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class IMSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IMSource[] $VALUES;
    private final String source;
    public static final IMSource P2P = new IMSource(CustomMessageData.SERVICE_NAME_P2P, 0, CustomMessageData.SERVICE_NAME_P2P);
    public static final IMSource IM = new IMSource(OtcExtraKeys.IM, 1, OtcExtraKeys.IM);
    public static final IMSource AFFILIATE = new IMSource("AFFILIATE", 2, "AFFILIATE");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IMSource[] $values() {
        return new IMSource[]{P2P, IM, AFFILIATE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IMSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    private IMSource(String str, int i, String str2) {
        this.source = str2;
    }

    static {
        IMSource[] iMSourceArr$values = $values();
        $VALUES = iMSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iMSourceArr$values);
    }

    public static IMSource valueOf(String str) {
        return (IMSource) Enum.valueOf(IMSource.class, str);
    }

    public static IMSource[] values() {
        return (IMSource[]) $VALUES.clone();
    }
}
