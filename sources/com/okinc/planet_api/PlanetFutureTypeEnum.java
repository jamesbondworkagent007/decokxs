package com.okinc.planet_api;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.planet_api.PlanetFutureTypeEnum;
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
public final class PlanetFutureTypeEnum implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetFutureTypeEnum[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<PlanetFutureTypeEnum> CREATOR;
    public static final Companion Companion;
    private final String type;
    public static final PlanetFutureTypeEnum CURRENT = new PlanetFutureTypeEnum("CURRENT", 0, "current");
    public static final PlanetFutureTypeEnum HISTORY = new PlanetFutureTypeEnum("HISTORY", 1, "history");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetFutureTypeEnum[] $values() {
        return new PlanetFutureTypeEnum[]{CURRENT, HISTORY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetFutureTypeEnum> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.PlanetFutureTypeEnum.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) PlanetFutureTypeEnum.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PlanetFutureTypeEnum> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.planet_api.PlanetFutureTypeEnum", values());
    }

    private PlanetFutureTypeEnum(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        PlanetFutureTypeEnum[] planetFutureTypeEnumArr$values = $values();
        $VALUES = planetFutureTypeEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetFutureTypeEnumArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<PlanetFutureTypeEnum>() { // from class: com.okinc.planet_api.PlanetFutureTypeEnum.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetFutureTypeEnum createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return PlanetFutureTypeEnum.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetFutureTypeEnum[] newArray(int i) {
                return new PlanetFutureTypeEnum[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tWK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PlanetFutureTypeEnum._init_$_anonymous_();
            }
        });
    }

    public static PlanetFutureTypeEnum valueOf(String str) {
        return (PlanetFutureTypeEnum) Enum.valueOf(PlanetFutureTypeEnum.class, str);
    }

    public static PlanetFutureTypeEnum[] values() {
        return (PlanetFutureTypeEnum[]) $VALUES.clone();
    }
}
