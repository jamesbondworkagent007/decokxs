package com.okinc.planet.biz_userprofile.data;

import com.okinc.planet.biz_userprofile.data.PlanetRoleType;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PlanetRoleType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetRoleType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("2")
    public static final PlanetRoleType Copier;

    @SerialName("1")
    public static final PlanetRoleType LeadTrader;

    @SerialName("0")
    public static final PlanetRoleType Normal;
    private static final List<PlanetRoleType> authorizedTypes;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetRoleType[] $values() {
        return new PlanetRoleType[]{LeadTrader, Copier, Normal};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetRoleType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private PlanetRoleType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        PlanetRoleType planetRoleType = new PlanetRoleType("LeadTrader", 0, "1");
        LeadTrader = planetRoleType;
        PlanetRoleType planetRoleType2 = new PlanetRoleType("Copier", 1, "2");
        Copier = planetRoleType2;
        Normal = new PlanetRoleType("Normal", 2, "0");
        PlanetRoleType[] planetRoleTypeArr$values = $values();
        $VALUES = planetRoleTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetRoleTypeArr$values);
        Companion = new Companion(null);
        authorizedTypes = yDY.gEmmrt(planetRoleType2, planetRoleType);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tLf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PlanetRoleType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetRoleType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) PlanetRoleType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PlanetRoleType> serializer() {
            return AEQbTJ();
        }

        public final PlanetRoleType copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((Object) str, (Object) "1") ? PlanetRoleType.LeadTrader : Intrinsics.EZpvd((Object) str, (Object) "2") ? PlanetRoleType.Copier : PlanetRoleType.Normal;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.planet.biz_userprofile.data.PlanetRoleType", values(), new String[]{"1", "2", "0"}, new Annotation[][]{null, null, null}, null);
    }

    public static PlanetRoleType valueOf(String str) {
        return (PlanetRoleType) Enum.valueOf(PlanetRoleType.class, str);
    }

    public static PlanetRoleType[] values() {
        return (PlanetRoleType[]) $VALUES.clone();
    }
}
