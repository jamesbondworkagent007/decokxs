package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class CoinProtocol implements Parcelable {
    public static final int $stable = 0;
    private final String logo;
    private final int protocolId;
    private final String protocolName;
    private final int searchType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CoinProtocol> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<CoinProtocol> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinProtocol createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinProtocol(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinProtocol[] newArray(int i) {
            return new CoinProtocol[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinProtocol copy$default(CoinProtocol coinProtocol, int i, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = coinProtocol.protocolId;
        }
        if ((i3 & 2) != 0) {
            str = coinProtocol.protocolName;
        }
        if ((i3 & 4) != 0) {
            str2 = coinProtocol.logo;
        }
        if ((i3 & 8) != 0) {
            i2 = coinProtocol.searchType;
        }
        return coinProtocol.copy(i, str, str2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.protocolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.searchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinProtocol copy(int i, @NotNull String str, String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CoinProtocol(i, str, str2, i2);
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
        if (!(obj instanceof CoinProtocol)) {
            return false;
        }
        CoinProtocol coinProtocol = (CoinProtocol) obj;
        return this.protocolId == coinProtocol.protocolId && Intrinsics.EZpvd((Object) this.protocolName, (Object) coinProtocol.protocolName) && Intrinsics.EZpvd((Object) this.logo, (Object) coinProtocol.logo) && this.searchType == coinProtocol.searchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocolName() {
        return this.protocolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSearchType() {
        return this.searchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.protocolId);
        int iHashCode2 = this.protocolName.hashCode();
        String str = this.logo;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.searchType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinProtocol(protocolId=" + this.protocolId + ", protocolName=" + this.protocolName + ", logo=" + this.logo + ", searchType=" + this.searchType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.protocolId);
        parcel.writeString(this.protocolName);
        parcel.writeString(this.logo);
        parcel.writeInt(this.searchType);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CoinProtocol.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinProtocol> serializer() {
            return CoinProtocol$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinProtocol(int i, int i2, String str, String str2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, CoinProtocol$$serializer.INSTANCE.getDescriptor());
        }
        this.protocolId = i2;
        this.protocolName = str;
        this.logo = str2;
        this.searchType = i3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CoinProtocol coinProtocol, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, coinProtocol.protocolId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, coinProtocol.protocolName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, coinProtocol.logo);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, coinProtocol.searchType);
    }

    public CoinProtocol(int i, @NotNull String str, String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.protocolId = i;
        this.protocolName = str;
        this.logo = str2;
        this.searchType = i2;
    }
}
