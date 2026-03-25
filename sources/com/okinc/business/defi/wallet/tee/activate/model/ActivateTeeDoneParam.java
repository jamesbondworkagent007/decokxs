package com.okinc.business.defi.wallet.tee.activate.model;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class ActivateTeeDoneParam implements Parcelable {
    public static final int $stable = 0;
    private final String accountName;
    private final boolean autoRenew;
    private final long expirePeriodDay;
    private final long expireTimestamp;
    private final String nftAssets;
    private final String pathSource;
    private final String walletAvatarStr;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ActivateTeeDoneParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ActivateTeeDoneParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActivateTeeDoneParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ActivateTeeDoneParam(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActivateTeeDoneParam[] newArray(int i) {
            return new ActivateTeeDoneParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletAvatarStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.expirePeriodDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nftAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.pathSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivateTeeDoneParam copy(@NotNull String str, @NotNull String str2, long j, long j2, boolean z, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ActivateTeeDoneParam(str, str2, j, j2, z, str3, str4);
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
        if (!(obj instanceof ActivateTeeDoneParam)) {
            return false;
        }
        ActivateTeeDoneParam activateTeeDoneParam = (ActivateTeeDoneParam) obj;
        return Intrinsics.EZpvd((Object) this.accountName, (Object) activateTeeDoneParam.accountName) && Intrinsics.EZpvd((Object) this.walletAvatarStr, (Object) activateTeeDoneParam.walletAvatarStr) && this.expireTimestamp == activateTeeDoneParam.expireTimestamp && this.expirePeriodDay == activateTeeDoneParam.expirePeriodDay && this.autoRenew == activateTeeDoneParam.autoRenew && Intrinsics.EZpvd((Object) this.nftAssets, (Object) activateTeeDoneParam.nftAssets) && Intrinsics.EZpvd((Object) this.pathSource, (Object) activateTeeDoneParam.pathSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoRenew() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpirePeriodDay() {
        return this.expirePeriodDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftAssets() {
        return this.nftAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPathSource() {
        return this.pathSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAvatarStr() {
        return this.walletAvatarStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.accountName.hashCode() * 31) + this.walletAvatarStr.hashCode()) * 31) + Long.hashCode(this.expireTimestamp)) * 31) + Long.hashCode(this.expirePeriodDay)) * 31) + Boolean.hashCode(this.autoRenew)) * 31) + this.nftAssets.hashCode()) * 31) + this.pathSource.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivateTeeDoneParam(accountName=" + this.accountName + ", walletAvatarStr=" + this.walletAvatarStr + ", expireTimestamp=" + this.expireTimestamp + ", expirePeriodDay=" + this.expirePeriodDay + ", autoRenew=" + this.autoRenew + ", nftAssets=" + this.nftAssets + ", pathSource=" + this.pathSource + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountName);
        parcel.writeString(this.walletAvatarStr);
        parcel.writeLong(this.expireTimestamp);
        parcel.writeLong(this.expirePeriodDay);
        parcel.writeInt(this.autoRenew ? 1 : 0);
        parcel.writeString(this.nftAssets);
        parcel.writeString(this.pathSource);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeDoneParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivateTeeDoneParam> serializer() {
            return ActivateTeeDoneParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActivateTeeDoneParam(int i, String str, String str2, long j, long j2, boolean z, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, ActivateTeeDoneParam$$serializer.INSTANCE.getDescriptor());
        }
        this.accountName = str;
        this.walletAvatarStr = str2;
        this.expireTimestamp = j;
        this.expirePeriodDay = j2;
        this.autoRenew = z;
        this.nftAssets = str3;
        this.pathSource = str4;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ActivateTeeDoneParam activateTeeDoneParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, activateTeeDoneParam.accountName);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, activateTeeDoneParam.walletAvatarStr);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, activateTeeDoneParam.expireTimestamp);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, activateTeeDoneParam.expirePeriodDay);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, activateTeeDoneParam.autoRenew);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, activateTeeDoneParam.nftAssets);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, activateTeeDoneParam.pathSource);
    }

    public ActivateTeeDoneParam(@NotNull String str, @NotNull String str2, long j, long j2, boolean z, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.accountName = str;
        this.walletAvatarStr = str2;
        this.expireTimestamp = j;
        this.expirePeriodDay = j2;
        this.autoRenew = z;
        this.nftAssets = str3;
        this.pathSource = str4;
    }
}
