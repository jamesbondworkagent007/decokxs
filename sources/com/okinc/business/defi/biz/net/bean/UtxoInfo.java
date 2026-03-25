package com.okinc.business.defi.biz.net.bean;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class UtxoInfo implements Parcelable {
    private String address;
    private String brcJson;
    private String coinAmount;
    private String confirmations;
    private Boolean dummy;
    private Boolean hasCheckNftExist;
    private Boolean hasNft;
    private String inscriptionId;
    private String nftId;
    private List<UTXONftInfo> nftLocaltionVOs;
    private Integer protocolId;
    private String rawTransaction;
    private final String since;
    private final List<String> stateHashArray;
    private Integer status;
    private String tick;
    private String tokenAmount;
    private Integer tokenType;
    private String txHash;
    private final Integer utxoStatusType;
    private Integer utxoType;
    private String vout;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UtxoInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(UTXONftInfo$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<UtxoInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(UTXONftInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new UtxoInfo(string, string2, string3, string4, string5, string6, string7, boolValueOf, boolValueOf2, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoInfo[] newArray(int i) {
            return new UtxoInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UtxoInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Boolean) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (List) null, (String) null, 4194303, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXONftInfo> component10() {
        return this.nftLocaltionVOs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.brcJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.inscriptionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component15() {
        return this.utxoType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.dummy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component17() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component19() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.vout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component20() {
        return this.utxoStatusType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component21() {
        return this.stateHashArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.since;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.confirmations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.rawTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.hasNft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.hasCheckNftExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, List<UTXONftInfo> list, Integer num, String str8, String str9, String str10, Integer num2, Boolean bool3, Integer num3, String str11, Integer num4, Integer num5, List<String> list2, String str12) {
        return new UtxoInfo(str, str2, str3, str4, str5, str6, str7, bool, bool2, list, num, str8, str9, str10, num2, bool3, num3, str11, num4, num5, list2, str12);
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
        if (!(obj instanceof UtxoInfo)) {
            return false;
        }
        UtxoInfo utxoInfo = (UtxoInfo) obj;
        return Intrinsics.EZpvd((Object) this.txHash, (Object) utxoInfo.txHash) && Intrinsics.EZpvd((Object) this.vout, (Object) utxoInfo.vout) && Intrinsics.EZpvd((Object) this.address, (Object) utxoInfo.address) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) utxoInfo.coinAmount) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) utxoInfo.tokenAmount) && Intrinsics.EZpvd((Object) this.confirmations, (Object) utxoInfo.confirmations) && Intrinsics.EZpvd((Object) this.rawTransaction, (Object) utxoInfo.rawTransaction) && Intrinsics.EZpvd(this.hasNft, utxoInfo.hasNft) && Intrinsics.EZpvd(this.hasCheckNftExist, utxoInfo.hasCheckNftExist) && Intrinsics.EZpvd(this.nftLocaltionVOs, utxoInfo.nftLocaltionVOs) && Intrinsics.EZpvd(this.status, utxoInfo.status) && Intrinsics.EZpvd((Object) this.brcJson, (Object) utxoInfo.brcJson) && Intrinsics.EZpvd((Object) this.tick, (Object) utxoInfo.tick) && Intrinsics.EZpvd((Object) this.inscriptionId, (Object) utxoInfo.inscriptionId) && Intrinsics.EZpvd(this.utxoType, utxoInfo.utxoType) && Intrinsics.EZpvd(this.dummy, utxoInfo.dummy) && Intrinsics.EZpvd(this.protocolId, utxoInfo.protocolId) && Intrinsics.EZpvd((Object) this.nftId, (Object) utxoInfo.nftId) && Intrinsics.EZpvd(this.tokenType, utxoInfo.tokenType) && Intrinsics.EZpvd(this.utxoStatusType, utxoInfo.utxoStatusType) && Intrinsics.EZpvd(this.stateHashArray, utxoInfo.stateHashArray) && Intrinsics.EZpvd((Object) this.since, (Object) utxoInfo.since);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrcJson() {
        return this.brcJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConfirmations() {
        return this.confirmations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDummy() {
        return this.dummy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasCheckNftExist() {
        return this.hasCheckNftExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasNft() {
        return this.hasNft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInscriptionId() {
        return this.inscriptionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftId() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXONftInfo> getNftLocaltionVOs() {
        return this.nftLocaltionVOs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawTransaction() {
        return this.rawTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSince() {
        return this.since;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getStateHashArray() {
        return this.stateHashArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTick() {
        return this.tick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTokenType() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getUtxoStatusType() {
        return this.utxoStatusType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getUtxoType() {
        return this.utxoType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVout() {
        return this.vout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.txHash;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.vout;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.address;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.coinAmount;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenAmount;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.confirmations;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.rawTransaction;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        Boolean bool = this.hasNft;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.hasCheckNftExist;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        List<UTXONftInfo> list = this.nftLocaltionVOs;
        int iHashCode10 = list == null ? 0 : list.hashCode();
        Integer num = this.status;
        int iHashCode11 = num == null ? 0 : num.hashCode();
        String str8 = this.brcJson;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tick;
        int iHashCode13 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.inscriptionId;
        int iHashCode14 = str10 == null ? 0 : str10.hashCode();
        Integer num2 = this.utxoType;
        int iHashCode15 = num2 == null ? 0 : num2.hashCode();
        Boolean bool3 = this.dummy;
        int iHashCode16 = bool3 == null ? 0 : bool3.hashCode();
        Integer num3 = this.protocolId;
        int iHashCode17 = num3 == null ? 0 : num3.hashCode();
        String str11 = this.nftId;
        int iHashCode18 = str11 == null ? 0 : str11.hashCode();
        Integer num4 = this.tokenType;
        int iHashCode19 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.utxoStatusType;
        int iHashCode20 = num5 == null ? 0 : num5.hashCode();
        List<String> list2 = this.stateHashArray;
        int iHashCode21 = list2 == null ? 0 : list2.hashCode();
        String str12 = this.since;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (str12 == null ? 0 : str12.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBrcJson(String str) {
        this.brcJson = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(String str) {
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfirmations(String str) {
        this.confirmations = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDummy(Boolean bool) {
        this.dummy = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasCheckNftExist(Boolean bool) {
        this.hasCheckNftExist = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasNft(Boolean bool) {
        this.hasNft = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInscriptionId(String str) {
        this.inscriptionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftId(String str) {
        this.nftId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftLocaltionVOs(List<UTXONftInfo> list) {
        this.nftLocaltionVOs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolId(Integer num) {
        this.protocolId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRawTransaction(String str) {
        this.rawTransaction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(Integer num) {
        this.status = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTick(String str) {
        this.tick = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAmount(String str) {
        this.tokenAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenType(Integer num) {
        this.tokenType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(String str) {
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtxoType(Integer num) {
        this.utxoType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVout(String str) {
        this.vout = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoInfo(txHash=" + this.txHash + ", vout=" + this.vout + ", address=" + this.address + ", coinAmount=" + this.coinAmount + ", tokenAmount=" + this.tokenAmount + ", confirmations=" + this.confirmations + ", rawTransaction=" + this.rawTransaction + ", hasNft=" + this.hasNft + ", hasCheckNftExist=" + this.hasCheckNftExist + ", nftLocaltionVOs=" + this.nftLocaltionVOs + ", status=" + this.status + ", brcJson=" + this.brcJson + ", tick=" + this.tick + ", inscriptionId=" + this.inscriptionId + ", utxoType=" + this.utxoType + ", dummy=" + this.dummy + ", protocolId=" + this.protocolId + ", nftId=" + this.nftId + ", tokenType=" + this.tokenType + ", utxoStatusType=" + this.utxoStatusType + ", stateHashArray=" + this.stateHashArray + ", since=" + this.since + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txHash);
        parcel.writeString(this.vout);
        parcel.writeString(this.address);
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.tokenAmount);
        parcel.writeString(this.confirmations);
        parcel.writeString(this.rawTransaction);
        Boolean bool = this.hasNft;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hasCheckNftExist;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List<UTXONftInfo> list = this.nftLocaltionVOs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UTXONftInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.brcJson);
        parcel.writeString(this.tick);
        parcel.writeString(this.inscriptionId);
        Integer num2 = this.utxoType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool3 = this.dummy;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Integer num3 = this.protocolId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.nftId);
        Integer num4 = this.tokenType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.utxoStatusType;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        parcel.writeStringList(this.stateHashArray);
        parcel.writeString(this.since);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.UtxoInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UtxoInfo> serializer() {
            return UtxoInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UtxoInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, List list, Integer num, String str8, String str9, String str10, Integer num2, Boolean bool3, Integer num3, String str11, Integer num4, Integer num5, List list2, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.txHash = null;
        } else {
            this.txHash = str;
        }
        if ((i & 2) == 0) {
            this.vout = null;
        } else {
            this.vout = str2;
        }
        if ((i & 4) == 0) {
            this.address = null;
        } else {
            this.address = str3;
        }
        if ((i & 8) == 0) {
            this.coinAmount = null;
        } else {
            this.coinAmount = str4;
        }
        if ((i & 16) == 0) {
            this.tokenAmount = null;
        } else {
            this.tokenAmount = str5;
        }
        if ((i & 32) == 0) {
            this.confirmations = null;
        } else {
            this.confirmations = str6;
        }
        if ((i & 64) == 0) {
            this.rawTransaction = null;
        } else {
            this.rawTransaction = str7;
        }
        if ((i & 128) == 0) {
            this.hasNft = null;
        } else {
            this.hasNft = bool;
        }
        if ((i & 256) == 0) {
            this.hasCheckNftExist = null;
        } else {
            this.hasCheckNftExist = bool2;
        }
        if ((i & 512) == 0) {
            this.nftLocaltionVOs = null;
        } else {
            this.nftLocaltionVOs = list;
        }
        if ((i & 1024) == 0) {
            this.status = null;
        } else {
            this.status = num;
        }
        if ((i & 2048) == 0) {
            this.brcJson = "";
        } else {
            this.brcJson = str8;
        }
        if ((i & 4096) == 0) {
            this.tick = "";
        } else {
            this.tick = str9;
        }
        if ((i & 8192) == 0) {
            this.inscriptionId = "";
        } else {
            this.inscriptionId = str10;
        }
        if ((i & 16384) == 0) {
            this.utxoType = null;
        } else {
            this.utxoType = num2;
        }
        if ((32768 & i) == 0) {
            this.dummy = null;
        } else {
            this.dummy = bool3;
        }
        if ((65536 & i) == 0) {
            this.protocolId = null;
        } else {
            this.protocolId = num3;
        }
        if ((131072 & i) == 0) {
            this.nftId = null;
        } else {
            this.nftId = str11;
        }
        if ((262144 & i) == 0) {
            this.tokenType = null;
        } else {
            this.tokenType = num4;
        }
        if ((524288 & i) == 0) {
            this.utxoStatusType = null;
        } else {
            this.utxoStatusType = num5;
        }
        if ((1048576 & i) == 0) {
            this.stateHashArray = null;
        } else {
            this.stateHashArray = list2;
        }
        if ((i & 2097152) == 0) {
            this.since = null;
        } else {
            this.since = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UtxoInfo utxoInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || utxoInfo.txHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, utxoInfo.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || utxoInfo.vout != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, utxoInfo.vout);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || utxoInfo.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, utxoInfo.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || utxoInfo.coinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, utxoInfo.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || utxoInfo.tokenAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, utxoInfo.tokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || utxoInfo.confirmations != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, utxoInfo.confirmations);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || utxoInfo.rawTransaction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, utxoInfo.rawTransaction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || utxoInfo.hasNft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, utxoInfo.hasNft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || utxoInfo.hasCheckNftExist != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, utxoInfo.hasCheckNftExist);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || utxoInfo.nftLocaltionVOs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], utxoInfo.nftLocaltionVOs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || utxoInfo.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, utxoInfo.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) utxoInfo.brcJson, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, utxoInfo.brcJson);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) utxoInfo.tick, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, utxoInfo.tick);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) utxoInfo.inscriptionId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, utxoInfo.inscriptionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || utxoInfo.utxoType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, utxoInfo.utxoType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || utxoInfo.dummy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, utxoInfo.dummy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || utxoInfo.protocolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, utxoInfo.protocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || utxoInfo.nftId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, utxoInfo.nftId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || utxoInfo.tokenType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, utxoInfo.tokenType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || utxoInfo.utxoStatusType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, IntSerializer.INSTANCE, utxoInfo.utxoStatusType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || utxoInfo.stateHashArray != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, kSerializerArr[20], utxoInfo.stateHashArray);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && utxoInfo.since == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, utxoInfo.since);
    }

    public UtxoInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, List<UTXONftInfo> list, Integer num, String str8, String str9, String str10, Integer num2, Boolean bool3, Integer num3, String str11, Integer num4, Integer num5, List<String> list2, String str12) {
        this.txHash = str;
        this.vout = str2;
        this.address = str3;
        this.coinAmount = str4;
        this.tokenAmount = str5;
        this.confirmations = str6;
        this.rawTransaction = str7;
        this.hasNft = bool;
        this.hasCheckNftExist = bool2;
        this.nftLocaltionVOs = list;
        this.status = num;
        this.brcJson = str8;
        this.tick = str9;
        this.inscriptionId = str10;
        this.utxoType = num2;
        this.dummy = bool3;
        this.protocolId = num3;
        this.nftId = str11;
        this.tokenType = num4;
        this.utxoStatusType = num5;
        this.stateHashArray = list2;
        this.since = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f6: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r46v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r46v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r46v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r46v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r46v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r46v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r46v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r46v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r31v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r46v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r32v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004a: ARITH (r46v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r33v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0052: ARITH (r46v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r34v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r46v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r46v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r46v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r37v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0073: ARITH (r46v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r38v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x007e: ARITH (r46v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r39v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0089: ARITH (r46v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r40v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r46v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x009f: ARITH (r46v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r42v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r46v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r43v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00b5: ARITH (r46v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r44v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c0: ARITH (r46v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List<com.okinc.business.defi.biz.net.bean.UTXONftInfo>, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:83) call: com.okinc.business.defi.biz.net.bean.UtxoInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ UtxoInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, List list, Integer num, String str8, String str9, String str10, Integer num2, Boolean bool3, Integer num3, String str11, Integer num4, Integer num5, List list2, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9, (i & 8192) == 0 ? str10 : "", (i & 16384) != 0 ? null : num2, (i & 32768) != 0 ? null : bool3, (i & 65536) != 0 ? null : num3, (i & 131072) != 0 ? null : str11, (i & 262144) != 0 ? null : num4, (i & 524288) != 0 ? null : num5, (i & 1048576) != 0 ? null : list2, (i & 2097152) != 0 ? null : str12);
    }
}
