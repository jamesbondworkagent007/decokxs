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
public final class WalletHaveAssetResp implements Parcelable {
    public static final int $stable = 0;
    private final boolean haveAsset;
    private final boolean haveWallet;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<WalletHaveAssetResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletHaveAssetResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletHaveAssetResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletHaveAssetResp(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletHaveAssetResp[] newArray(int i) {
            return new WalletHaveAssetResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletHaveAssetResp copy$default(WalletHaveAssetResp walletHaveAssetResp, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = walletHaveAssetResp.haveAsset;
        }
        if ((i & 2) != 0) {
            z2 = walletHaveAssetResp.haveWallet;
        }
        return walletHaveAssetResp.copy(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.haveAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.haveWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletHaveAssetResp copy(boolean z, boolean z2) {
        return new WalletHaveAssetResp(z, z2);
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
        if (!(obj instanceof WalletHaveAssetResp)) {
            return false;
        }
        WalletHaveAssetResp walletHaveAssetResp = (WalletHaveAssetResp) obj;
        return this.haveAsset == walletHaveAssetResp.haveAsset && this.haveWallet == walletHaveAssetResp.haveWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHaveAsset() {
        return this.haveAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHaveWallet() {
        return this.haveWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.haveAsset) * 31) + Boolean.hashCode(this.haveWallet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletHaveAssetResp(haveAsset=" + this.haveAsset + ", haveWallet=" + this.haveWallet + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.haveAsset ? 1 : 0);
        parcel.writeInt(this.haveWallet ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletHaveAssetResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletHaveAssetResp> serializer() {
            return WalletHaveAssetResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletHaveAssetResp(int i, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, WalletHaveAssetResp$$serializer.INSTANCE.getDescriptor());
        }
        this.haveAsset = z;
        this.haveWallet = z2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletHaveAssetResp walletHaveAssetResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, walletHaveAssetResp.haveAsset);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, walletHaveAssetResp.haveWallet);
    }

    public WalletHaveAssetResp(boolean z, boolean z2) {
        this.haveAsset = z;
        this.haveWallet = z2;
    }
}
