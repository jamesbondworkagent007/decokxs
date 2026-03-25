package com.okinc.planet_api;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
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
public final class PluginShareToFeedConfig implements Parcelable {
    public static final int $stable = 0;
    private final String content;
    private final String metaData;
    private final PlanetPublisherPluginType pluginType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PluginShareToFeedConfig> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {PlanetPublisherPluginType.Companion.serializer(), null, null};

    public static final class Creator implements Parcelable.Creator<PluginShareToFeedConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PluginShareToFeedConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PluginShareToFeedConfig(PlanetPublisherPluginType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PluginShareToFeedConfig[] newArray(int i) {
            return new PluginShareToFeedConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PluginShareToFeedConfig copy$default(PluginShareToFeedConfig pluginShareToFeedConfig, PlanetPublisherPluginType planetPublisherPluginType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            planetPublisherPluginType = pluginShareToFeedConfig.pluginType;
        }
        if ((i & 2) != 0) {
            str = pluginShareToFeedConfig.content;
        }
        if ((i & 4) != 0) {
            str2 = pluginShareToFeedConfig.metaData;
        }
        return pluginShareToFeedConfig.copy(planetPublisherPluginType, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetPublisherPluginType component1() {
        return this.pluginType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.metaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PluginShareToFeedConfig copy(@NotNull PlanetPublisherPluginType planetPublisherPluginType, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PluginShareToFeedConfig(planetPublisherPluginType, str, str2);
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
        if (!(obj instanceof PluginShareToFeedConfig)) {
            return false;
        }
        PluginShareToFeedConfig pluginShareToFeedConfig = (PluginShareToFeedConfig) obj;
        return this.pluginType == pluginShareToFeedConfig.pluginType && Intrinsics.EZpvd((Object) this.content, (Object) pluginShareToFeedConfig.content) && Intrinsics.EZpvd((Object) this.metaData, (Object) pluginShareToFeedConfig.metaData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMetaData() {
        return this.metaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetPublisherPluginType getPluginType() {
        return this.pluginType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.pluginType.hashCode() * 31) + this.content.hashCode()) * 31) + this.metaData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PluginShareToFeedConfig(pluginType=" + this.pluginType + ", content=" + this.content + ", metaData=" + this.metaData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.pluginType.writeToParcel(parcel, i);
        parcel.writeString(this.content);
        parcel.writeString(this.metaData);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.PluginShareToFeedConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PluginShareToFeedConfig> serializer() {
            return PluginShareToFeedConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PluginShareToFeedConfig(int i, PlanetPublisherPluginType planetPublisherPluginType, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PluginShareToFeedConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.pluginType = planetPublisherPluginType;
        this.content = str;
        this.metaData = str2;
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_api(PluginShareToFeedConfig pluginShareToFeedConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], pluginShareToFeedConfig.pluginType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, pluginShareToFeedConfig.content);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, pluginShareToFeedConfig.metaData);
    }

    public PluginShareToFeedConfig(@NotNull PlanetPublisherPluginType planetPublisherPluginType, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.pluginType = planetPublisherPluginType;
        this.content = str;
        this.metaData = str2;
    }
}
