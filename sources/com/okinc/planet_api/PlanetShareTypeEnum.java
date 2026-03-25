package com.okinc.planet_api;

import com.okinc.planet_api.PlanetShareTypeEnum;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PlanetShareTypeEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetShareTypeEnum[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final PlanetShareTypeEnum RICH_SHARE = new PlanetShareTypeEnum("RICH_SHARE", 0);
    public static final PlanetShareTypeEnum PLUGIN_SHARE = new PlanetShareTypeEnum("PLUGIN_SHARE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetShareTypeEnum[] $values() {
        return new PlanetShareTypeEnum[]{RICH_SHARE, PLUGIN_SHARE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetShareTypeEnum> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.PlanetShareTypeEnum.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) PlanetShareTypeEnum.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PlanetShareTypeEnum> serializer() {
            return copydefault();
        }
    }

    private PlanetShareTypeEnum(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.planet_api.PlanetShareTypeEnum", values());
    }

    static {
        PlanetShareTypeEnum[] planetShareTypeEnumArr$values = $values();
        $VALUES = planetShareTypeEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetShareTypeEnumArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tWS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PlanetShareTypeEnum._init_$_anonymous_();
            }
        });
    }

    public static PlanetShareTypeEnum valueOf(String str) {
        return (PlanetShareTypeEnum) Enum.valueOf(PlanetShareTypeEnum.class, str);
    }

    public static PlanetShareTypeEnum[] values() {
        return (PlanetShareTypeEnum[]) $VALUES.clone();
    }
}
