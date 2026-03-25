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
public final class WalletTotalAssetModel implements Parcelable {
    private String accountId;
    private String defiAsset;
    private String nftAsset;
    private String tokenAsset;
    private String tokenAssetFilter;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletTotalAssetModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletTotalAssetModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletTotalAssetModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletTotalAssetModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletTotalAssetModel[] newArray(int i) {
            return new WalletTotalAssetModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletTotalAssetModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletTotalAssetModel copy$default(WalletTotalAssetModel walletTotalAssetModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletTotalAssetModel.accountId;
        }
        if ((i & 2) != 0) {
            str2 = walletTotalAssetModel.tokenAsset;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = walletTotalAssetModel.tokenAssetFilter;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = walletTotalAssetModel.defiAsset;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = walletTotalAssetModel.nftAsset;
        }
        return walletTotalAssetModel.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAssetFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.defiAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nftAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletTotalAssetModel copy(String str, String str2, String str3, String str4, String str5) {
        return new WalletTotalAssetModel(str, str2, str3, str4, str5);
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
        if (!(obj instanceof WalletTotalAssetModel)) {
            return false;
        }
        WalletTotalAssetModel walletTotalAssetModel = (WalletTotalAssetModel) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) walletTotalAssetModel.accountId) && Intrinsics.EZpvd((Object) this.tokenAsset, (Object) walletTotalAssetModel.tokenAsset) && Intrinsics.EZpvd((Object) this.tokenAssetFilter, (Object) walletTotalAssetModel.tokenAssetFilter) && Intrinsics.EZpvd((Object) this.defiAsset, (Object) walletTotalAssetModel.defiAsset) && Intrinsics.EZpvd((Object) this.nftAsset, (Object) walletTotalAssetModel.nftAsset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefiAsset() {
        return this.defiAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftAsset() {
        return this.nftAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAsset() {
        return this.tokenAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAssetFilter() {
        return this.tokenAssetFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accountId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenAsset;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenAssetFilter;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.defiAsset;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.nftAsset;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(String str) {
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefiAsset(String str) {
        this.defiAsset = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftAsset(String str) {
        this.nftAsset = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAsset(String str) {
        this.tokenAsset = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAssetFilter(String str) {
        this.tokenAssetFilter = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletTotalAssetModel(accountId=" + this.accountId + ", tokenAsset=" + this.tokenAsset + ", tokenAssetFilter=" + this.tokenAssetFilter + ", defiAsset=" + this.defiAsset + ", nftAsset=" + this.nftAsset + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeString(this.tokenAsset);
        parcel.writeString(this.tokenAssetFilter);
        parcel.writeString(this.defiAsset);
        parcel.writeString(this.nftAsset);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletTotalAssetModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletTotalAssetModel> serializer() {
            return WalletTotalAssetModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletTotalAssetModel(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.tokenAsset = "";
        } else {
            this.tokenAsset = str2;
        }
        if ((i & 4) == 0) {
            this.tokenAssetFilter = "";
        } else {
            this.tokenAssetFilter = str3;
        }
        if ((i & 8) == 0) {
            this.defiAsset = "";
        } else {
            this.defiAsset = str4;
        }
        if ((i & 16) == 0) {
            this.nftAsset = "";
        } else {
            this.nftAsset = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletTotalAssetModel walletTotalAssetModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) walletTotalAssetModel.accountId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, walletTotalAssetModel.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) walletTotalAssetModel.tokenAsset, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletTotalAssetModel.tokenAsset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) walletTotalAssetModel.tokenAssetFilter, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, walletTotalAssetModel.tokenAssetFilter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) walletTotalAssetModel.defiAsset, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, walletTotalAssetModel.defiAsset);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) walletTotalAssetModel.nftAsset, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, walletTotalAssetModel.nftAsset);
    }

    public WalletTotalAssetModel(String str, String str2, String str3, String str4, String str5) {
        this.accountId = str;
        this.tokenAsset = str2;
        this.tokenAssetFilter = str3;
        this.defiAsset = str4;
        this.nftAsset = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:33) call: com.okinc.business.defi.biz.net.bean.WalletTotalAssetModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WalletTotalAssetModel(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
