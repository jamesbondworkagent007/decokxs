package com.okinc.planet_api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PlanetShareConfig implements Parcelable {
    public final PlanetShareTypeEnum bizType;
    public final PluginShareToFeedConfig pluginShareToFeedConfig;
    public final RichShareToFeedConfig richShareToFeedConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PlanetShareConfig> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {PlanetShareTypeEnum.Companion.serializer(), null, null};

    public static final class Creator implements Parcelable.Creator<PlanetShareConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetShareConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PlanetShareConfig(PlanetShareTypeEnum.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RichShareToFeedConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PluginShareToFeedConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetShareConfig[] newArray(int i) {
            return new PlanetShareConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PlanetShareConfig copy$default(PlanetShareConfig planetShareConfig, PlanetShareTypeEnum planetShareTypeEnum, RichShareToFeedConfig richShareToFeedConfig, PluginShareToFeedConfig pluginShareToFeedConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            planetShareTypeEnum = planetShareConfig.bizType;
        }
        if ((i & 2) != 0) {
            richShareToFeedConfig = planetShareConfig.richShareToFeedConfig;
        }
        if ((i & 4) != 0) {
            pluginShareToFeedConfig = planetShareConfig.pluginShareToFeedConfig;
        }
        return planetShareConfig.AEQbTJ(planetShareTypeEnum, richShareToFeedConfig, pluginShareToFeedConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetShareConfig AEQbTJ(@NotNull PlanetShareTypeEnum planetShareTypeEnum, RichShareToFeedConfig richShareToFeedConfig, PluginShareToFeedConfig pluginShareToFeedConfig) {
        Intrinsics.checkNotNullParameter(planetShareTypeEnum, "");
        return new PlanetShareConfig(planetShareTypeEnum, richShareToFeedConfig, pluginShareToFeedConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PluginShareToFeedConfig EZpvd() {
        return this.pluginShareToFeedConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetShareTypeEnum OLrzqt() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichShareToFeedConfig copydefault() {
        return this.richShareToFeedConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanetShareConfig)) {
            return false;
        }
        PlanetShareConfig planetShareConfig = (PlanetShareConfig) obj;
        return this.bizType == planetShareConfig.bizType && Intrinsics.EZpvd(this.richShareToFeedConfig, planetShareConfig.richShareToFeedConfig) && Intrinsics.EZpvd(this.pluginShareToFeedConfig, planetShareConfig.pluginShareToFeedConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.bizType.hashCode();
        RichShareToFeedConfig richShareToFeedConfig = this.richShareToFeedConfig;
        int iHashCode2 = richShareToFeedConfig == null ? 0 : richShareToFeedConfig.hashCode();
        PluginShareToFeedConfig pluginShareToFeedConfig = this.pluginShareToFeedConfig;
        return (((iHashCode * 31) + iHashCode2) * 31) + (pluginShareToFeedConfig != null ? pluginShareToFeedConfig.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlanetShareConfig(bizType=" + this.bizType + ", richShareToFeedConfig=" + this.richShareToFeedConfig + ", pluginShareToFeedConfig=" + this.pluginShareToFeedConfig + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.bizType.name());
        RichShareToFeedConfig richShareToFeedConfig = this.richShareToFeedConfig;
        if (richShareToFeedConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            richShareToFeedConfig.writeToParcel(parcel, i);
        }
        PluginShareToFeedConfig pluginShareToFeedConfig = this.pluginShareToFeedConfig;
        if (pluginShareToFeedConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pluginShareToFeedConfig.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.PlanetShareConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlanetShareConfig> serializer() {
            return PlanetShareConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlanetShareConfig(int i, PlanetShareTypeEnum planetShareTypeEnum, RichShareToFeedConfig richShareToFeedConfig, PluginShareToFeedConfig pluginShareToFeedConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PlanetShareConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.bizType = planetShareTypeEnum;
        if ((i & 2) == 0) {
            this.richShareToFeedConfig = null;
        } else {
            this.richShareToFeedConfig = richShareToFeedConfig;
        }
        if ((i & 4) == 0) {
            this.pluginShareToFeedConfig = null;
        } else {
            this.pluginShareToFeedConfig = pluginShareToFeedConfig;
        }
    }

    public static final /* synthetic */ void OLrzqt(PlanetShareConfig planetShareConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], planetShareConfig.bizType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || planetShareConfig.richShareToFeedConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, RichShareToFeedConfig$$serializer.INSTANCE, planetShareConfig.richShareToFeedConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && planetShareConfig.pluginShareToFeedConfig == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, PluginShareToFeedConfig$$serializer.INSTANCE, planetShareConfig.pluginShareToFeedConfig);
    }

    public PlanetShareConfig(@NotNull PlanetShareTypeEnum planetShareTypeEnum, RichShareToFeedConfig richShareToFeedConfig, PluginShareToFeedConfig pluginShareToFeedConfig) {
        Intrinsics.checkNotNullParameter(planetShareTypeEnum, "");
        this.bizType = planetShareTypeEnum;
        this.richShareToFeedConfig = richShareToFeedConfig;
        this.pluginShareToFeedConfig = pluginShareToFeedConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.okinc.planet_api.PlanetShareTypeEnum)
  (wrap:com.okinc.planet_api.RichShareToFeedConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet_api.RichShareToFeedConfig) : (r3v0 com.okinc.planet_api.RichShareToFeedConfig))
  (wrap:com.okinc.planet_api.PluginShareToFeedConfig:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet_api.PluginShareToFeedConfig) : (r4v0 com.okinc.planet_api.PluginShareToFeedConfig))
 A[MD:(com.okinc.planet_api.PlanetShareTypeEnum, com.okinc.planet_api.RichShareToFeedConfig, com.okinc.planet_api.PluginShareToFeedConfig):void (m)] (LINE:12) call: com.okinc.planet_api.PlanetShareConfig.<init>(com.okinc.planet_api.PlanetShareTypeEnum, com.okinc.planet_api.RichShareToFeedConfig, com.okinc.planet_api.PluginShareToFeedConfig):void type: THIS */
    public /* synthetic */ PlanetShareConfig(PlanetShareTypeEnum planetShareTypeEnum, RichShareToFeedConfig richShareToFeedConfig, PluginShareToFeedConfig pluginShareToFeedConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(planetShareTypeEnum, (i & 2) != 0 ? null : richShareToFeedConfig, (i & 4) != 0 ? null : pluginShareToFeedConfig);
    }
}
