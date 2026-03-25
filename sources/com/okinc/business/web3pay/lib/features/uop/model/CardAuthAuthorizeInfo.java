package com.okinc.business.web3pay.lib.features.uop.model;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CardAuthAuthorizeInfo implements Parcelable {
    public static final int $stable = 0;
    private final String authorizeLimit;
    private final String tokenCoinTypeNo;
    private final int type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CardAuthAuthorizeInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CardAuthAuthorizeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardAuthAuthorizeInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CardAuthAuthorizeInfo(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardAuthAuthorizeInfo[] newArray(int i) {
            return new CardAuthAuthorizeInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CardAuthAuthorizeInfo copy$default(CardAuthAuthorizeInfo cardAuthAuthorizeInfo, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cardAuthAuthorizeInfo.tokenCoinTypeNo;
        }
        if ((i2 & 2) != 0) {
            i = cardAuthAuthorizeInfo.type;
        }
        if ((i2 & 4) != 0) {
            str2 = cardAuthAuthorizeInfo.authorizeLimit;
        }
        return cardAuthAuthorizeInfo.copy(str, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.authorizeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardAuthAuthorizeInfo copy(@NotNull String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CardAuthAuthorizeInfo(str, i, str2);
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
        if (!(obj instanceof CardAuthAuthorizeInfo)) {
            return false;
        }
        CardAuthAuthorizeInfo cardAuthAuthorizeInfo = (CardAuthAuthorizeInfo) obj;
        return Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) cardAuthAuthorizeInfo.tokenCoinTypeNo) && this.type == cardAuthAuthorizeInfo.type && Intrinsics.EZpvd((Object) this.authorizeLimit, (Object) cardAuthAuthorizeInfo.authorizeLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthorizeLimit() {
        return this.authorizeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tokenCoinTypeNo.hashCode();
        int iHashCode2 = Integer.hashCode(this.type);
        String str = this.authorizeLimit;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardAuthAuthorizeInfo(tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", type=" + this.type + ", authorizeLimit=" + this.authorizeLimit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tokenCoinTypeNo);
        parcel.writeInt(this.type);
        parcel.writeString(this.authorizeLimit);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.CardAuthAuthorizeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardAuthAuthorizeInfo> serializer() {
            return CardAuthAuthorizeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CardAuthAuthorizeInfo(int i, String str, int i2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CardAuthAuthorizeInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenCoinTypeNo = str;
        this.type = i2;
        this.authorizeLimit = str2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CardAuthAuthorizeInfo cardAuthAuthorizeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cardAuthAuthorizeInfo.tokenCoinTypeNo);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, cardAuthAuthorizeInfo.type);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cardAuthAuthorizeInfo.authorizeLimit);
    }

    public CardAuthAuthorizeInfo(@NotNull String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenCoinTypeNo = str;
        this.type = i;
        this.authorizeLimit = str2;
    }
}
