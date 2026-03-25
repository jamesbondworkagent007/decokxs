package com.okinc.planet_api.publisher;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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
public final class PlanetPublisherPluginType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetPublisherPluginType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<PlanetPublisherPluginType> CREATOR;
    public static final Companion Companion;
    private final String value;
    public static final PlanetPublisherPluginType SPOT = new PlanetPublisherPluginType("SPOT", 0, "spot");
    public static final PlanetPublisherPluginType FUTURES = new PlanetPublisherPluginType("FUTURES", 1, "futures");
    public static final PlanetPublisherPluginType BOTS = new PlanetPublisherPluginType("BOTS", 2, "bots");
    public static final PlanetPublisherPluginType CHART = new PlanetPublisherPluginType("CHART", 3, "chart");
    public static final PlanetPublisherPluginType DEBUG1 = new PlanetPublisherPluginType("DEBUG1", 4, "debug_1");
    public static final PlanetPublisherPluginType DEBUG2 = new PlanetPublisherPluginType("DEBUG2", 5, "debug_2");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetPublisherPluginType[] $values() {
        return new PlanetPublisherPluginType[]{SPOT, FUTURES, BOTS, CHART, DEBUG1, DEBUG2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetPublisherPluginType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private PlanetPublisherPluginType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        PlanetPublisherPluginType[] planetPublisherPluginTypeArr$values = $values();
        $VALUES = planetPublisherPluginTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetPublisherPluginTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<PlanetPublisherPluginType>() { // from class: com.okinc.planet_api.publisher.PlanetPublisherPluginType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetPublisherPluginType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return PlanetPublisherPluginType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetPublisherPluginType[] newArray(int i) {
                return new PlanetPublisherPluginType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tWY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PlanetPublisherPluginType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.publisher.PlanetPublisherPluginType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) PlanetPublisherPluginType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PlanetPublisherPluginType> serializer() {
            return OLrzqt();
        }

        public final PlanetPublisherPluginType OLrzqt(String str) {
            for (PlanetPublisherPluginType planetPublisherPluginType : PlanetPublisherPluginType.values()) {
                if (Intrinsics.EZpvd((Object) planetPublisherPluginType.getValue(), (Object) str)) {
                    return planetPublisherPluginType;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.planet_api.publisher.PlanetPublisherPluginType", values());
    }

    public static PlanetPublisherPluginType valueOf(String str) {
        return (PlanetPublisherPluginType) Enum.valueOf(PlanetPublisherPluginType.class, str);
    }

    public static PlanetPublisherPluginType[] values() {
        return (PlanetPublisherPluginType[]) $VALUES.clone();
    }
}
