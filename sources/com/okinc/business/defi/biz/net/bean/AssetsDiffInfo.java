package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AssetsDiffInfo implements Parcelable {
    private final AmountDetail amountDetail;
    private final Asset asset;
    private final String diff;
    private final String diffUsdValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = AmountDetail.$stable | Asset.$stable;
    public static final Parcelable.Creator<AssetsDiffInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AssetsDiffInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsDiffInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AssetsDiffInfo((Asset) parcel.readParcelable(AssetsDiffInfo.class.getClassLoader()), parcel.readString(), parcel.readString(), (AmountDetail) parcel.readParcelable(AssetsDiffInfo.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsDiffInfo[] newArray(int i) {
            return new AssetsDiffInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetsDiffInfo() {
        this((Asset) null, (String) null, (String) null, (AmountDetail) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AssetsDiffInfo copy$default(AssetsDiffInfo assetsDiffInfo, Asset asset, String str, String str2, AmountDetail amountDetail, int i, Object obj) {
        if ((i & 1) != 0) {
            asset = assetsDiffInfo.asset;
        }
        if ((i & 2) != 0) {
            str = assetsDiffInfo.diff;
        }
        if ((i & 4) != 0) {
            str2 = assetsDiffInfo.diffUsdValue;
        }
        if ((i & 8) != 0) {
            amountDetail = assetsDiffInfo.amountDetail;
        }
        return assetsDiffInfo.copy(asset, str, str2, amountDetail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Asset component1() {
        return this.asset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.diff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.diffUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AmountDetail component4() {
        return this.amountDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetsDiffInfo copy(Asset asset, String str, String str2, AmountDetail amountDetail) {
        return new AssetsDiffInfo(asset, str, str2, amountDetail);
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
        if (!(obj instanceof AssetsDiffInfo)) {
            return false;
        }
        AssetsDiffInfo assetsDiffInfo = (AssetsDiffInfo) obj;
        return Intrinsics.EZpvd(this.asset, assetsDiffInfo.asset) && Intrinsics.EZpvd((Object) this.diff, (Object) assetsDiffInfo.diff) && Intrinsics.EZpvd((Object) this.diffUsdValue, (Object) assetsDiffInfo.diffUsdValue) && Intrinsics.EZpvd(this.amountDetail, assetsDiffInfo.amountDetail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AmountDetail getAmountDetail() {
        return this.amountDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Asset getAsset() {
        return this.asset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiff() {
        return this.diff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiffUsdValue() {
        return this.diffUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Asset asset = this.asset;
        int iHashCode = asset == null ? 0 : asset.hashCode();
        String str = this.diff;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.diffUsdValue;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        AmountDetail amountDetail = this.amountDetail;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (amountDetail != null ? amountDetail.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetsDiffInfo(asset=" + this.asset + ", diff=" + this.diff + ", diffUsdValue=" + this.diffUsdValue + ", amountDetail=" + this.amountDetail + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.asset, i);
        parcel.writeString(this.diff);
        parcel.writeString(this.diffUsdValue);
        parcel.writeParcelable(this.amountDetail, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AssetsDiffInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetsDiffInfo> serializer() {
            return AssetsDiffInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetsDiffInfo(int i, Asset asset, String str, String str2, AmountDetail amountDetail, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.asset = null;
        } else {
            this.asset = asset;
        }
        if ((i & 2) == 0) {
            this.diff = null;
        } else {
            this.diff = str;
        }
        if ((i & 4) == 0) {
            this.diffUsdValue = null;
        } else {
            this.diffUsdValue = str2;
        }
        if ((i & 8) == 0) {
            this.amountDetail = null;
        } else {
            this.amountDetail = amountDetail;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AssetsDiffInfo assetsDiffInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || assetsDiffInfo.asset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, Asset$$serializer.INSTANCE, assetsDiffInfo.asset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || assetsDiffInfo.diff != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, assetsDiffInfo.diff);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || assetsDiffInfo.diffUsdValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, assetsDiffInfo.diffUsdValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && assetsDiffInfo.amountDetail == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, AmountDetail$$serializer.INSTANCE, assetsDiffInfo.amountDetail);
    }

    public AssetsDiffInfo(Asset asset, String str, String str2, AmountDetail amountDetail) {
        this.asset = asset;
        this.diff = str;
        this.diffUsdValue = str2;
        this.amountDetail = amountDetail;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.biz.net.bean.Asset:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.Asset) : (r2v0 com.okinc.business.defi.biz.net.bean.Asset))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.net.bean.AmountDetail:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.AmountDetail) : (r5v0 com.okinc.business.defi.biz.net.bean.AmountDetail))
 A[MD:(com.okinc.business.defi.biz.net.bean.Asset, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.AmountDetail):void (m)] (LINE:474) call: com.okinc.business.defi.biz.net.bean.AssetsDiffInfo.<init>(com.okinc.business.defi.biz.net.bean.Asset, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.AmountDetail):void type: THIS */
    public /* synthetic */ AssetsDiffInfo(Asset asset, String str, String str2, AmountDetail amountDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : asset, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : amountDetail);
    }
}
