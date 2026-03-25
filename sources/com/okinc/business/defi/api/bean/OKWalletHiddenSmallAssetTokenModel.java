package com.okinc.business.defi.api.bean;

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

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class OKWalletHiddenSmallAssetTokenModel implements Parcelable {
    public static final int $stable = 0;
    private final boolean enableHidden;
    private final String hiddenValue;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OKWalletHiddenSmallAssetTokenModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OKWalletHiddenSmallAssetTokenModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKWalletHiddenSmallAssetTokenModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKWalletHiddenSmallAssetTokenModel(parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKWalletHiddenSmallAssetTokenModel[] newArray(int i) {
            return new OKWalletHiddenSmallAssetTokenModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OKWalletHiddenSmallAssetTokenModel copy$default(OKWalletHiddenSmallAssetTokenModel oKWalletHiddenSmallAssetTokenModel, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = oKWalletHiddenSmallAssetTokenModel.enableHidden;
        }
        if ((i & 2) != 0) {
            str = oKWalletHiddenSmallAssetTokenModel.hiddenValue;
        }
        return oKWalletHiddenSmallAssetTokenModel.copy(z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.enableHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.hiddenValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKWalletHiddenSmallAssetTokenModel copy(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OKWalletHiddenSmallAssetTokenModel(z, str);
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
        if (!(obj instanceof OKWalletHiddenSmallAssetTokenModel)) {
            return false;
        }
        OKWalletHiddenSmallAssetTokenModel oKWalletHiddenSmallAssetTokenModel = (OKWalletHiddenSmallAssetTokenModel) obj;
        return this.enableHidden == oKWalletHiddenSmallAssetTokenModel.enableHidden && Intrinsics.EZpvd((Object) this.hiddenValue, (Object) oKWalletHiddenSmallAssetTokenModel.hiddenValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableHidden() {
        return this.enableHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHiddenValue() {
        return this.hiddenValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.enableHidden) * 31) + this.hiddenValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKWalletHiddenSmallAssetTokenModel(enableHidden=" + this.enableHidden + ", hiddenValue=" + this.hiddenValue + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.enableHidden ? 1 : 0);
        parcel.writeString(this.hiddenValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.OKWalletHiddenSmallAssetTokenModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKWalletHiddenSmallAssetTokenModel> serializer() {
            return OKWalletHiddenSmallAssetTokenModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKWalletHiddenSmallAssetTokenModel(int i, boolean z, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, OKWalletHiddenSmallAssetTokenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.enableHidden = z;
        this.hiddenValue = str;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(OKWalletHiddenSmallAssetTokenModel oKWalletHiddenSmallAssetTokenModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, oKWalletHiddenSmallAssetTokenModel.enableHidden);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, oKWalletHiddenSmallAssetTokenModel.hiddenValue);
    }

    public OKWalletHiddenSmallAssetTokenModel(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.enableHidden = z;
        this.hiddenValue = str;
    }
}
