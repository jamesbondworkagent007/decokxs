package com.okinc.dexkline.dex.api.bean;

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

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class CoinDetailRedirection implements Parcelable {
    public static final int $stable = 0;
    private final RedirectionType type;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CoinDetailRedirection> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {RedirectionType.Companion.serializer(), null};

    public static final class Creator implements Parcelable.Creator<CoinDetailRedirection> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinDetailRedirection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinDetailRedirection(RedirectionType.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinDetailRedirection[] newArray(int i) {
            return new CoinDetailRedirection[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinDetailRedirection copy$default(CoinDetailRedirection coinDetailRedirection, RedirectionType redirectionType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            redirectionType = coinDetailRedirection.type;
        }
        if ((i & 2) != 0) {
            str = coinDetailRedirection.value;
        }
        return coinDetailRedirection.copy(redirectionType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RedirectionType component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinDetailRedirection copy(@NotNull RedirectionType redirectionType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(redirectionType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new CoinDetailRedirection(redirectionType, str);
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
        if (!(obj instanceof CoinDetailRedirection)) {
            return false;
        }
        CoinDetailRedirection coinDetailRedirection = (CoinDetailRedirection) obj;
        return this.type == coinDetailRedirection.type && Intrinsics.EZpvd((Object) this.value, (Object) coinDetailRedirection.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RedirectionType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.type.hashCode() * 31) + this.value.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinDetailRedirection(type=" + this.type + ", value=" + this.value + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.value);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.dex.api.bean.CoinDetailRedirection.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinDetailRedirection> serializer() {
            return CoinDetailRedirection$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinDetailRedirection(int i, RedirectionType redirectionType, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CoinDetailRedirection$$serializer.INSTANCE.getDescriptor());
        }
        this.type = redirectionType;
        this.value = str;
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_api(CoinDetailRedirection coinDetailRedirection, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], coinDetailRedirection.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, coinDetailRedirection.value);
    }

    public CoinDetailRedirection(@NotNull RedirectionType redirectionType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(redirectionType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.type = redirectionType;
        this.value = str;
    }
}
