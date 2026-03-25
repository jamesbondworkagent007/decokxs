package com.okinc.wallet.core.sign.utxo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class UTXOTxIn implements Parcelable {
    private String address;
    private Integer addressIndex;
    private Integer addressType;
    private String coin_amount;
    private String derivationPath;
    private String index;
    private Boolean isDummy;
    private Boolean isNFT;
    private String masterFingerprint;
    private List<NftInfo> nftInfos;
    private String publicKey;
    private String rawTransaction;
    private String sequence;
    private String tx_id;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UTXOTxIn> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(NftInfo$$serializer.INSTANCE), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<UTXOTxIn> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXOTxIn createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(NftInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new UTXOTxIn(string, string2, string3, string4, string5, string6, numValueOf, numValueOf2, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXOTxIn[] newArray(int i) {
            return new UTXOTxIn[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UTXOTxIn() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tx_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.isNFT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.isDummy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.masterFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.derivationPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.coin_amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.rawTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NftInfo> component9() {
        return this.nftInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOTxIn copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, Integer num, Integer num2, List<NftInfo> list, Boolean bool, Boolean bool2, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new UTXOTxIn(str, str2, str3, str4, str5, str6, num, num2, list, bool, bool2, str7, str8, str9);
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
        if (!(obj instanceof UTXOTxIn)) {
            return false;
        }
        UTXOTxIn uTXOTxIn = (UTXOTxIn) obj;
        return Intrinsics.EZpvd((Object) this.tx_id, (Object) uTXOTxIn.tx_id) && Intrinsics.EZpvd((Object) this.index, (Object) uTXOTxIn.index) && Intrinsics.EZpvd((Object) this.coin_amount, (Object) uTXOTxIn.coin_amount) && Intrinsics.EZpvd((Object) this.sequence, (Object) uTXOTxIn.sequence) && Intrinsics.EZpvd((Object) this.rawTransaction, (Object) uTXOTxIn.rawTransaction) && Intrinsics.EZpvd((Object) this.address, (Object) uTXOTxIn.address) && Intrinsics.EZpvd(this.addressType, uTXOTxIn.addressType) && Intrinsics.EZpvd(this.addressIndex, uTXOTxIn.addressIndex) && Intrinsics.EZpvd(this.nftInfos, uTXOTxIn.nftInfos) && Intrinsics.EZpvd(this.isNFT, uTXOTxIn.isNFT) && Intrinsics.EZpvd(this.isDummy, uTXOTxIn.isDummy) && Intrinsics.EZpvd((Object) this.masterFingerprint, (Object) uTXOTxIn.masterFingerprint) && Intrinsics.EZpvd((Object) this.publicKey, (Object) uTXOTxIn.publicKey) && Intrinsics.EZpvd((Object) this.derivationPath, (Object) uTXOTxIn.derivationPath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddressIndex() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoin_amount() {
        return this.coin_amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDerivationPath() {
        return this.derivationPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getIsDummy() {
        return this.isDummy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getIsNFT() {
        return this.isNFT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterFingerprint() {
        return this.masterFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NftInfo> getNftInfos() {
        return this.nftInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawTransaction() {
        return this.rawTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSequence() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTx_id() {
        return this.tx_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tx_id.hashCode();
        int iHashCode2 = this.index.hashCode();
        int iHashCode3 = this.coin_amount.hashCode();
        String str = this.sequence;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.rawTransaction;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.address;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.addressType;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Integer num2 = this.addressIndex;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        List<NftInfo> list = this.nftInfos;
        int iHashCode9 = list == null ? 0 : list.hashCode();
        Boolean bool = this.isNFT;
        int iHashCode10 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isDummy;
        int iHashCode11 = bool2 == null ? 0 : bool2.hashCode();
        String str4 = this.masterFingerprint;
        int iHashCode12 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.publicKey;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.derivationPath;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressIndex(Integer num) {
        this.addressIndex = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(Integer num) {
        this.addressType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoin_amount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coin_amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDerivationPath(String str) {
        this.derivationPath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.index = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsDummy(Boolean bool) {
        this.isDummy = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsNFT(Boolean bool) {
        this.isNFT = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMasterFingerprint(String str) {
        this.masterFingerprint = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftInfos(List<NftInfo> list) {
        this.nftInfos = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPublicKey(String str) {
        this.publicKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRawTransaction(String str) {
        this.rawTransaction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSequence(String str) {
        this.sequence = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTx_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tx_id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UTXOTxIn(tx_id=" + this.tx_id + ", index=" + this.index + ", coin_amount=" + this.coin_amount + ", sequence=" + this.sequence + ", rawTransaction=" + this.rawTransaction + ", address=" + this.address + ", addressType=" + this.addressType + ", addressIndex=" + this.addressIndex + ", nftInfos=" + this.nftInfos + ", isNFT=" + this.isNFT + ", isDummy=" + this.isDummy + ", masterFingerprint=" + this.masterFingerprint + ", publicKey=" + this.publicKey + ", derivationPath=" + this.derivationPath + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tx_id);
        parcel.writeString(this.index);
        parcel.writeString(this.coin_amount);
        parcel.writeString(this.sequence);
        parcel.writeString(this.rawTransaction);
        parcel.writeString(this.address);
        Integer num = this.addressType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.addressIndex;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        List<NftInfo> list = this.nftInfos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<NftInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isNFT;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isDummy;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.masterFingerprint);
        parcel.writeString(this.publicKey);
        parcel.writeString(this.derivationPath);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.UTXOTxIn.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UTXOTxIn> serializer() {
            return UTXOTxIn$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UTXOTxIn(int i, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, List list, Boolean bool, Boolean bool2, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tx_id = "";
        } else {
            this.tx_id = str;
        }
        if ((i & 2) == 0) {
            this.index = "";
        } else {
            this.index = str2;
        }
        if ((i & 4) == 0) {
            this.coin_amount = "";
        } else {
            this.coin_amount = str3;
        }
        if ((i & 8) == 0) {
            this.sequence = null;
        } else {
            this.sequence = str4;
        }
        if ((i & 16) == 0) {
            this.rawTransaction = null;
        } else {
            this.rawTransaction = str5;
        }
        if ((i & 32) == 0) {
            this.address = null;
        } else {
            this.address = str6;
        }
        if ((i & 64) == 0) {
            this.addressType = null;
        } else {
            this.addressType = num;
        }
        if ((i & 128) == 0) {
            this.addressIndex = null;
        } else {
            this.addressIndex = num2;
        }
        if ((i & 256) == 0) {
            this.nftInfos = null;
        } else {
            this.nftInfos = list;
        }
        this.isNFT = (i & 512) == 0 ? Boolean.FALSE : bool;
        this.isDummy = (i & 1024) == 0 ? Boolean.FALSE : bool2;
        if ((i & 2048) == 0) {
            this.masterFingerprint = null;
        } else {
            this.masterFingerprint = str7;
        }
        if ((i & 4096) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str8;
        }
        if ((i & 8192) == 0) {
            this.derivationPath = null;
        } else {
            this.derivationPath = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(UTXOTxIn uTXOTxIn, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) uTXOTxIn.tx_id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, uTXOTxIn.tx_id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) uTXOTxIn.index, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, uTXOTxIn.index);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) uTXOTxIn.coin_amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, uTXOTxIn.coin_amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || uTXOTxIn.sequence != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, uTXOTxIn.sequence);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || uTXOTxIn.rawTransaction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, uTXOTxIn.rawTransaction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || uTXOTxIn.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, uTXOTxIn.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || uTXOTxIn.addressType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, uTXOTxIn.addressType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || uTXOTxIn.addressIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, uTXOTxIn.addressIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || uTXOTxIn.nftInfos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], uTXOTxIn.nftInfos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(uTXOTxIn.isNFT, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, uTXOTxIn.isNFT);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(uTXOTxIn.isDummy, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, uTXOTxIn.isDummy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || uTXOTxIn.masterFingerprint != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, uTXOTxIn.masterFingerprint);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || uTXOTxIn.publicKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, uTXOTxIn.publicKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && uTXOTxIn.derivationPath == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, uTXOTxIn.derivationPath);
    }

    public UTXOTxIn(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, Integer num, Integer num2, List<NftInfo> list, Boolean bool, Boolean bool2, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.tx_id = str;
        this.index = str2;
        this.coin_amount = str3;
        this.sequence = str4;
        this.rawTransaction = str5;
        this.address = str6;
        this.addressType = num;
        this.addressIndex = num2;
        this.nftInfos = list;
        this.isNFT = bool;
        this.isDummy = bool2;
        this.masterFingerprint = str7;
        this.publicKey = str8;
        this.derivationPath = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0093: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r23v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0044: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r24v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0050: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0055: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0059: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r26v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.util.List<com.okinc.wallet.core.sign.utxo.NftInfo>, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:42) call: com.okinc.wallet.core.sign.utxo.UTXOTxIn.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UTXOTxIn(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, List list, Boolean bool, Boolean bool2, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : list, (i & 512) != 0 ? Boolean.FALSE : bool, (i & 1024) != 0 ? Boolean.FALSE : bool2, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : str8, (i & 8192) == 0 ? str9 : null);
    }
}
