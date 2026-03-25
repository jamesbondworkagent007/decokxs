package com.okinc.business.web3pay.api.model;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ReceiverOrClaimParams implements Parcelable {
    public static final int $stable = 0;
    public final String chainIndex;
    public final String orderId;
    public final String senderMessage;
    public final String senderName;
    public final String tokenInfo;
    public final String uid;
    public final String usdValue;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ReceiverOrClaimParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ReceiverOrClaimParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReceiverOrClaimParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReceiverOrClaimParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReceiverOrClaimParams[] newArray(int i) {
            return new ReceiverOrClaimParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReceiverOrClaimParams copy$default(ReceiverOrClaimParams receiverOrClaimParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = receiverOrClaimParams.orderId;
        }
        if ((i & 2) != 0) {
            str2 = receiverOrClaimParams.senderName;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = receiverOrClaimParams.tokenInfo;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = receiverOrClaimParams.senderMessage;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = receiverOrClaimParams.usdValue;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = receiverOrClaimParams.chainIndex;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = receiverOrClaimParams.uid;
        }
        return receiverOrClaimParams.OLrzqt(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReceiverOrClaimParams OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new ReceiverOrClaimParams(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof ReceiverOrClaimParams)) {
            return false;
        }
        ReceiverOrClaimParams receiverOrClaimParams = (ReceiverOrClaimParams) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) receiverOrClaimParams.orderId) && Intrinsics.EZpvd((Object) this.senderName, (Object) receiverOrClaimParams.senderName) && Intrinsics.EZpvd((Object) this.tokenInfo, (Object) receiverOrClaimParams.tokenInfo) && Intrinsics.EZpvd((Object) this.senderMessage, (Object) receiverOrClaimParams.senderMessage) && Intrinsics.EZpvd((Object) this.usdValue, (Object) receiverOrClaimParams.usdValue) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) receiverOrClaimParams.chainIndex) && Intrinsics.EZpvd((Object) this.uid, (Object) receiverOrClaimParams.uid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.orderId.hashCode() * 31) + this.senderName.hashCode()) * 31) + this.tokenInfo.hashCode()) * 31) + this.senderMessage.hashCode()) * 31) + this.usdValue.hashCode()) * 31) + this.chainIndex.hashCode()) * 31) + this.uid.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReceiverOrClaimParams(orderId=" + this.orderId + ", senderName=" + this.senderName + ", tokenInfo=" + this.tokenInfo + ", senderMessage=" + this.senderMessage + ", usdValue=" + this.usdValue + ", chainIndex=" + this.chainIndex + ", uid=" + this.uid + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.orderId);
        parcel.writeString(this.senderName);
        parcel.writeString(this.tokenInfo);
        parcel.writeString(this.senderMessage);
        parcel.writeString(this.usdValue);
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.uid);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.ReceiverOrClaimParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReceiverOrClaimParams> serializer() {
            return ReceiverOrClaimParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReceiverOrClaimParams(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, ReceiverOrClaimParams$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
        this.senderName = str2;
        this.tokenInfo = str3;
        this.senderMessage = str4;
        this.usdValue = str5;
        this.chainIndex = str6;
        this.uid = str7;
    }

    public static final /* synthetic */ void OLrzqt(ReceiverOrClaimParams receiverOrClaimParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, receiverOrClaimParams.orderId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, receiverOrClaimParams.senderName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, receiverOrClaimParams.tokenInfo);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, receiverOrClaimParams.senderMessage);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, receiverOrClaimParams.usdValue);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, receiverOrClaimParams.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, receiverOrClaimParams.uid);
    }

    public ReceiverOrClaimParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.orderId = str;
        this.senderName = str2;
        this.tokenInfo = str3;
        this.senderMessage = str4;
        this.usdValue = str5;
        this.chainIndex = str6;
        this.uid = str7;
    }
}
