package com.okinc.business.web3pay.lib.features.uop.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
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
public final class CreateSendRedPacketRequest implements Parcelable {
    public static final int $stable = 0;
    private final String amount;
    private final String chainIndex;
    private final String externalGiftId;
    private final String groupId;
    private final String message;
    private final int projectId;
    private final int quantity;
    private final String tokenCoinTypeNo;
    private final int type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CreateSendRedPacketRequest> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CreateSendRedPacketRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateSendRedPacketRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CreateSendRedPacketRequest(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateSendRedPacketRequest[] newArray(int i) {
            return new CreateSendRedPacketRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.quantity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.externalGiftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateSendRedPacketRequest copy(@NotNull String str, int i, int i2, @NotNull String str2, int i3, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new CreateSendRedPacketRequest(str, i, i2, str2, i3, str3, str4, str5, str6);
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
        if (!(obj instanceof CreateSendRedPacketRequest)) {
            return false;
        }
        CreateSendRedPacketRequest createSendRedPacketRequest = (CreateSendRedPacketRequest) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) createSendRedPacketRequest.chainIndex) && this.projectId == createSendRedPacketRequest.projectId && this.type == createSendRedPacketRequest.type && Intrinsics.EZpvd((Object) this.amount, (Object) createSendRedPacketRequest.amount) && this.quantity == createSendRedPacketRequest.quantity && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) createSendRedPacketRequest.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.message, (Object) createSendRedPacketRequest.message) && Intrinsics.EZpvd((Object) this.externalGiftId, (Object) createSendRedPacketRequest.externalGiftId) && Intrinsics.EZpvd((Object) this.groupId, (Object) createSendRedPacketRequest.groupId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExternalGiftId() {
        return this.externalGiftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getQuantity() {
        return this.quantity;
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
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = Integer.hashCode(this.projectId);
        int iHashCode3 = Integer.hashCode(this.type);
        int iHashCode4 = this.amount.hashCode();
        int iHashCode5 = Integer.hashCode(this.quantity);
        int iHashCode6 = this.tokenCoinTypeNo.hashCode();
        String str = this.message;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.externalGiftId.hashCode()) * 31) + this.groupId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateSendRedPacketRequest(chainIndex=" + this.chainIndex + ", projectId=" + this.projectId + ", type=" + this.type + ", amount=" + this.amount + ", quantity=" + this.quantity + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", message=" + this.message + ", externalGiftId=" + this.externalGiftId + ", groupId=" + this.groupId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainIndex);
        parcel.writeInt(this.projectId);
        parcel.writeInt(this.type);
        parcel.writeString(this.amount);
        parcel.writeInt(this.quantity);
        parcel.writeString(this.tokenCoinTypeNo);
        parcel.writeString(this.message);
        parcel.writeString(this.externalGiftId);
        parcel.writeString(this.groupId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.CreateSendRedPacketRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateSendRedPacketRequest> serializer() {
            return CreateSendRedPacketRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateSendRedPacketRequest(int i, String str, int i2, int i3, String str2, int i4, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, CreateSendRedPacketRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.projectId = i2;
        this.type = i3;
        this.amount = str2;
        this.quantity = i4;
        this.tokenCoinTypeNo = str3;
        this.message = str4;
        this.externalGiftId = str5;
        this.groupId = str6;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CreateSendRedPacketRequest createSendRedPacketRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, createSendRedPacketRequest.chainIndex);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, createSendRedPacketRequest.projectId);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, createSendRedPacketRequest.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, createSendRedPacketRequest.amount);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, createSendRedPacketRequest.quantity);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, createSendRedPacketRequest.tokenCoinTypeNo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, createSendRedPacketRequest.message);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, createSendRedPacketRequest.externalGiftId);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, createSendRedPacketRequest.groupId);
    }

    public CreateSendRedPacketRequest(@NotNull String str, int i, int i2, @NotNull String str2, int i3, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.chainIndex = str;
        this.projectId = i;
        this.type = i2;
        this.amount = str2;
        this.quantity = i3;
        this.tokenCoinTypeNo = str3;
        this.message = str4;
        this.externalGiftId = str5;
        this.groupId = str6;
    }
}
