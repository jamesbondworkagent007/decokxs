package com.okinc.assets.backend.api.model;

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

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class GetWalletAccountInfoResp implements Parcelable {
    public static final int $stable = 0;
    private final String accountId;
    private final String accountName;
    private final String walletIconAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GetWalletAccountInfoResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<GetWalletAccountInfoResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetWalletAccountInfoResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GetWalletAccountInfoResp(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetWalletAccountInfoResp[] newArray(int i) {
            return new GetWalletAccountInfoResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetWalletAccountInfoResp copy$default(GetWalletAccountInfoResp getWalletAccountInfoResp, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getWalletAccountInfoResp.accountId;
        }
        if ((i & 2) != 0) {
            str2 = getWalletAccountInfoResp.accountName;
        }
        if ((i & 4) != 0) {
            str3 = getWalletAccountInfoResp.walletIconAddress;
        }
        return getWalletAccountInfoResp.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.walletIconAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetWalletAccountInfoResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new GetWalletAccountInfoResp(str, str2, str3);
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
        if (!(obj instanceof GetWalletAccountInfoResp)) {
            return false;
        }
        GetWalletAccountInfoResp getWalletAccountInfoResp = (GetWalletAccountInfoResp) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) getWalletAccountInfoResp.accountId) && Intrinsics.EZpvd((Object) this.accountName, (Object) getWalletAccountInfoResp.accountName) && Intrinsics.EZpvd((Object) this.walletIconAddress, (Object) getWalletAccountInfoResp.walletIconAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletIconAddress() {
        return this.walletIconAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.accountId.hashCode() * 31) + this.accountName.hashCode()) * 31) + this.walletIconAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetWalletAccountInfoResp(accountId=" + this.accountId + ", accountName=" + this.accountName + ", walletIconAddress=" + this.walletIconAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeString(this.accountName);
        parcel.writeString(this.walletIconAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.GetWalletAccountInfoResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetWalletAccountInfoResp> serializer() {
            return GetWalletAccountInfoResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetWalletAccountInfoResp(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, GetWalletAccountInfoResp$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.accountName = str2;
        this.walletIconAddress = str3;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(GetWalletAccountInfoResp getWalletAccountInfoResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, getWalletAccountInfoResp.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, getWalletAccountInfoResp.accountName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, getWalletAccountInfoResp.walletIconAddress);
    }

    public GetWalletAccountInfoResp(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.accountId = str;
        this.accountName = str2;
        this.walletIconAddress = str3;
    }
}
