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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class GetMessageForSigningResp implements Parcelable {
    public static final int $stable = 0;
    private final long chainIndex;
    private final int signAddressType;
    private final String signData;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GetMessageForSigningResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<GetMessageForSigningResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetMessageForSigningResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GetMessageForSigningResp(parcel.readString(), parcel.readLong(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetMessageForSigningResp[] newArray(int i) {
            return new GetMessageForSigningResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetMessageForSigningResp copy$default(GetMessageForSigningResp getMessageForSigningResp, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getMessageForSigningResp.signData;
        }
        if ((i2 & 2) != 0) {
            j = getMessageForSigningResp.chainIndex;
        }
        if ((i2 & 4) != 0) {
            i = getMessageForSigningResp.signAddressType;
        }
        return getMessageForSigningResp.copy(str, j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.signAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetMessageForSigningResp copy(@NotNull String str, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GetMessageForSigningResp(str, j, i);
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
        if (!(obj instanceof GetMessageForSigningResp)) {
            return false;
        }
        GetMessageForSigningResp getMessageForSigningResp = (GetMessageForSigningResp) obj;
        return Intrinsics.EZpvd((Object) this.signData, (Object) getMessageForSigningResp.signData) && this.chainIndex == getMessageForSigningResp.chainIndex && this.signAddressType == getMessageForSigningResp.signAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSignAddressType() {
        return this.signAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignData() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.signData.hashCode() * 31) + Long.hashCode(this.chainIndex)) * 31) + Integer.hashCode(this.signAddressType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetMessageForSigningResp(signData=" + this.signData + ", chainIndex=" + this.chainIndex + ", signAddressType=" + this.signAddressType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.signData);
        parcel.writeLong(this.chainIndex);
        parcel.writeInt(this.signAddressType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.GetMessageForSigningResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetMessageForSigningResp> serializer() {
            return GetMessageForSigningResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetMessageForSigningResp(int i, String str, long j, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, GetMessageForSigningResp$$serializer.INSTANCE.getDescriptor());
        }
        this.signData = str;
        this.chainIndex = j;
        this.signAddressType = i2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(GetMessageForSigningResp getMessageForSigningResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, getMessageForSigningResp.signData);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, getMessageForSigningResp.chainIndex);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, getMessageForSigningResp.signAddressType);
    }

    public GetMessageForSigningResp(@NotNull String str, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signData = str;
        this.chainIndex = j;
        this.signAddressType = i;
    }
}
