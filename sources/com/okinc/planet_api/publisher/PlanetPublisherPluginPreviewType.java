package com.okinc.planet_api.publisher;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class PlanetPublisherPluginPreviewType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetPublisherPluginPreviewType[] $VALUES;
    public static final Application Companion;
    private final int value;
    public static final PlanetPublisherPluginPreviewType FEED_SHARE = new PlanetPublisherPluginPreviewType("FEED_SHARE", 0, 0);
    public static final PlanetPublisherPluginPreviewType PUBLISHER = new PlanetPublisherPluginPreviewType("PUBLISHER", 1, 1);
    public static final PlanetPublisherPluginPreviewType LIST = new PlanetPublisherPluginPreviewType("LIST", 2, 2);
    public static final PlanetPublisherPluginPreviewType DETAIL = new PlanetPublisherPluginPreviewType("DETAIL", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetPublisherPluginPreviewType[] $values() {
        return new PlanetPublisherPluginPreviewType[]{FEED_SHARE, PUBLISHER, LIST, DETAIL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetPublisherPluginPreviewType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private PlanetPublisherPluginPreviewType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        PlanetPublisherPluginPreviewType[] planetPublisherPluginPreviewTypeArr$values = $values();
        $VALUES = planetPublisherPluginPreviewTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetPublisherPluginPreviewTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final PlanetPublisherPluginPreviewType copydefault(Integer num) {
            PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType;
            PlanetPublisherPluginPreviewType[] planetPublisherPluginPreviewTypeArrValues = PlanetPublisherPluginPreviewType.values();
            int length = planetPublisherPluginPreviewTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    planetPublisherPluginPreviewType = null;
                    break;
                }
                planetPublisherPluginPreviewType = planetPublisherPluginPreviewTypeArrValues[i];
                int value = planetPublisherPluginPreviewType.getValue();
                if (num != null && value == num.intValue()) {
                    break;
                }
                i++;
            }
            return planetPublisherPluginPreviewType == null ? PlanetPublisherPluginPreviewType.FEED_SHARE : planetPublisherPluginPreviewType;
        }
    }

    public static PlanetPublisherPluginPreviewType valueOf(String str) {
        return (PlanetPublisherPluginPreviewType) Enum.valueOf(PlanetPublisherPluginPreviewType.class, str);
    }

    public static PlanetPublisherPluginPreviewType[] values() {
        return (PlanetPublisherPluginPreviewType[]) $VALUES.clone();
    }
}
