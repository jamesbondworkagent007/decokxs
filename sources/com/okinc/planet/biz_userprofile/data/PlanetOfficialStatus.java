package com.okinc.planet.biz_userprofile.data;

import com.okinc.planet.biz_userprofile.data.PlanetOfficialStatus;
import java.lang.annotation.Annotation;
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
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PlanetOfficialStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetOfficialStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("0")
    public static final PlanetOfficialStatus NotOfficial = new PlanetOfficialStatus("NotOfficial", 0, "0");

    @SerialName("1")
    public static final PlanetOfficialStatus Official = new PlanetOfficialStatus("Official", 1, "1");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetOfficialStatus[] $values() {
        return new PlanetOfficialStatus[]{NotOfficial, Official};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetOfficialStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private PlanetOfficialStatus(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        PlanetOfficialStatus[] planetOfficialStatusArr$values = $values();
        $VALUES = planetOfficialStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetOfficialStatusArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tKY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PlanetOfficialStatus._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetOfficialStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) PlanetOfficialStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PlanetOfficialStatus> serializer() {
            return OLrzqt();
        }

        public final PlanetOfficialStatus KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((Object) str, (Object) "1") ? PlanetOfficialStatus.Official : Intrinsics.EZpvd((Object) str, (Object) "0") ? PlanetOfficialStatus.NotOfficial : PlanetOfficialStatus.NotOfficial;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.planet.biz_userprofile.data.PlanetOfficialStatus", values(), new String[]{"0", "1"}, new Annotation[][]{null, null}, null);
    }

    public static PlanetOfficialStatus valueOf(String str) {
        return (PlanetOfficialStatus) Enum.valueOf(PlanetOfficialStatus.class, str);
    }

    public static PlanetOfficialStatus[] values() {
        return (PlanetOfficialStatus[]) $VALUES.clone();
    }
}
