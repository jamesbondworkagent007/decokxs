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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class UTXOTransaction implements Parcelable {
    private String amount;
    private String balance;
    private String changeAddress;
    private Integer changeAddressType;
    private String derivationPath;
    private DummyInfo dummyInfo;
    private String dustLimit;
    private String fee;
    private String from;
    private Boolean isRaise;
    private String masterFingerprint;
    private String memo;
    private Integer memoPos;
    private String minOutput;
    private String publicKey;
    private List<String> signatureList;
    private String to;
    private String token;
    private List<UTXOTxIn> txin;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UTXOTransaction> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(UTXOTxIn$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<UTXOTransaction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXOTransaction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UTXOTxIn.CREATOR.createFromParcel(parcel));
            }
            return new UTXOTransaction(string, string2, string3, string4, string5, string6, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DummyInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXOTransaction[] newArray(int i) {
            return new UTXOTransaction[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.derivationPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.masterFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DummyInfo component12() {
        return this.dummyInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.dustLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.changeAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.isRaise;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component17() {
        return this.signatureList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component19() {
        return this.memoPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.minOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOTxIn> component7() {
        return this.txin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.changeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<UTXOTxIn> list, String str7, String str8, String str9, String str10, DummyInfo dummyInfo, String str11, Integer num, String str12, Boolean bool, List<String> list2, String str13, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new UTXOTransaction(str, str2, str3, str4, str5, str6, list, str7, str8, str9, str10, dummyInfo, str11, num, str12, bool, list2, str13, num2);
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
        if (!(obj instanceof UTXOTransaction)) {
            return false;
        }
        UTXOTransaction uTXOTransaction = (UTXOTransaction) obj;
        return Intrinsics.EZpvd((Object) this.balance, (Object) uTXOTransaction.balance) && Intrinsics.EZpvd((Object) this.minOutput, (Object) uTXOTransaction.minOutput) && Intrinsics.EZpvd((Object) this.from, (Object) uTXOTransaction.from) && Intrinsics.EZpvd((Object) this.to, (Object) uTXOTransaction.to) && Intrinsics.EZpvd((Object) this.amount, (Object) uTXOTransaction.amount) && Intrinsics.EZpvd((Object) this.fee, (Object) uTXOTransaction.fee) && Intrinsics.EZpvd(this.txin, uTXOTransaction.txin) && Intrinsics.EZpvd((Object) this.publicKey, (Object) uTXOTransaction.publicKey) && Intrinsics.EZpvd((Object) this.changeAddress, (Object) uTXOTransaction.changeAddress) && Intrinsics.EZpvd((Object) this.derivationPath, (Object) uTXOTransaction.derivationPath) && Intrinsics.EZpvd((Object) this.masterFingerprint, (Object) uTXOTransaction.masterFingerprint) && Intrinsics.EZpvd(this.dummyInfo, uTXOTransaction.dummyInfo) && Intrinsics.EZpvd((Object) this.dustLimit, (Object) uTXOTransaction.dustLimit) && Intrinsics.EZpvd(this.changeAddressType, uTXOTransaction.changeAddressType) && Intrinsics.EZpvd((Object) this.token, (Object) uTXOTransaction.token) && Intrinsics.EZpvd(this.isRaise, uTXOTransaction.isRaise) && Intrinsics.EZpvd(this.signatureList, uTXOTransaction.signatureList) && Intrinsics.EZpvd((Object) this.memo, (Object) uTXOTransaction.memo) && Intrinsics.EZpvd(this.memoPos, uTXOTransaction.memoPos);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeAddress() {
        return this.changeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChangeAddressType() {
        return this.changeAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDerivationPath() {
        return this.derivationPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DummyInfo getDummyInfo() {
        return this.dummyInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDustLimit() {
        return this.dustLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterFingerprint() {
        return this.masterFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMemoPos() {
        return this.memoPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinOutput() {
        return this.minOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSignatureList() {
        return this.signatureList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOTxIn> getTxin() {
        return this.txin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.balance.hashCode();
        int iHashCode2 = this.minOutput.hashCode();
        int iHashCode3 = this.from.hashCode();
        int iHashCode4 = this.to.hashCode();
        int iHashCode5 = this.amount.hashCode();
        int iHashCode6 = this.fee.hashCode();
        int iHashCode7 = this.txin.hashCode();
        String str = this.publicKey;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.changeAddress;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.derivationPath;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.masterFingerprint;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        DummyInfo dummyInfo = this.dummyInfo;
        int iHashCode12 = dummyInfo == null ? 0 : dummyInfo.hashCode();
        String str5 = this.dustLimit;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.changeAddressType;
        int iHashCode14 = num == null ? 0 : num.hashCode();
        String str6 = this.token;
        int iHashCode15 = str6 == null ? 0 : str6.hashCode();
        Boolean bool = this.isRaise;
        int iHashCode16 = bool == null ? 0 : bool.hashCode();
        List<String> list = this.signatureList;
        int iHashCode17 = list == null ? 0 : list.hashCode();
        String str7 = this.memo;
        int iHashCode18 = str7 == null ? 0 : str7.hashCode();
        Integer num2 = this.memoPos;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (num2 == null ? 0 : num2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isRaise() {
        return this.isRaise;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.balance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeAddress(String str) {
        this.changeAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeAddressType(Integer num) {
        this.changeAddressType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDerivationPath(String str) {
        this.derivationPath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDummyInfo(DummyInfo dummyInfo) {
        this.dummyInfo = dummyInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDustLimit(String str) {
        this.dustLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMasterFingerprint(String str) {
        this.masterFingerprint = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemo(String str) {
        this.memo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemoPos(Integer num) {
        this.memoPos = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinOutput(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minOutput = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPublicKey(String str) {
        this.publicKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRaise(Boolean bool) {
        this.isRaise = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignatureList(List<String> list) {
        this.signatureList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToken(String str) {
        this.token = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxin(@NotNull List<UTXOTxIn> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.txin = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UTXOTransaction(balance=" + this.balance + ", minOutput=" + this.minOutput + ", from=" + this.from + ", to=" + this.to + ", amount=" + this.amount + ", fee=" + this.fee + ", txin=" + this.txin + ", publicKey=" + this.publicKey + ", changeAddress=" + this.changeAddress + ", derivationPath=" + this.derivationPath + ", masterFingerprint=" + this.masterFingerprint + ", dummyInfo=" + this.dummyInfo + ", dustLimit=" + this.dustLimit + ", changeAddressType=" + this.changeAddressType + ", token=" + this.token + ", isRaise=" + this.isRaise + ", signatureList=" + this.signatureList + ", memo=" + this.memo + ", memoPos=" + this.memoPos + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.balance);
        parcel.writeString(this.minOutput);
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeString(this.amount);
        parcel.writeString(this.fee);
        List<UTXOTxIn> list = this.txin;
        parcel.writeInt(list.size());
        Iterator<UTXOTxIn> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.publicKey);
        parcel.writeString(this.changeAddress);
        parcel.writeString(this.derivationPath);
        parcel.writeString(this.masterFingerprint);
        DummyInfo dummyInfo = this.dummyInfo;
        if (dummyInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dummyInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.dustLimit);
        Integer num = this.changeAddressType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.token);
        Boolean bool = this.isRaise;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeStringList(this.signatureList);
        parcel.writeString(this.memo);
        Integer num2 = this.memoPos;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.UTXOTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UTXOTransaction> serializer() {
            return UTXOTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UTXOTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, DummyInfo dummyInfo, String str11, Integer num, String str12, Boolean bool, List list2, String str13, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, UTXOTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.balance = str;
        this.minOutput = str2;
        this.from = str3;
        this.to = str4;
        this.amount = str5;
        this.fee = str6;
        this.txin = list;
        if ((i & 128) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str7;
        }
        if ((i & 256) == 0) {
            this.changeAddress = null;
        } else {
            this.changeAddress = str8;
        }
        if ((i & 512) == 0) {
            this.derivationPath = null;
        } else {
            this.derivationPath = str9;
        }
        if ((i & 1024) == 0) {
            this.masterFingerprint = null;
        } else {
            this.masterFingerprint = str10;
        }
        if ((i & 2048) == 0) {
            this.dummyInfo = null;
        } else {
            this.dummyInfo = dummyInfo;
        }
        this.dustLimit = (i & 4096) == 0 ? "" : str11;
        if ((i & 8192) == 0) {
            this.changeAddressType = null;
        } else {
            this.changeAddressType = num;
        }
        if ((i & 16384) == 0) {
            this.token = null;
        } else {
            this.token = str12;
        }
        if ((32768 & i) == 0) {
            this.isRaise = null;
        } else {
            this.isRaise = bool;
        }
        if ((65536 & i) == 0) {
            this.signatureList = null;
        } else {
            this.signatureList = list2;
        }
        if ((131072 & i) == 0) {
            this.memo = null;
        } else {
            this.memo = str13;
        }
        if ((i & 262144) == 0) {
            this.memoPos = null;
        } else {
            this.memoPos = num2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(UTXOTransaction uTXOTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, uTXOTransaction.balance);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, uTXOTransaction.minOutput);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, uTXOTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, uTXOTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, uTXOTransaction.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, uTXOTransaction.fee);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], uTXOTransaction.txin);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || uTXOTransaction.publicKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, uTXOTransaction.publicKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || uTXOTransaction.changeAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, uTXOTransaction.changeAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || uTXOTransaction.derivationPath != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, uTXOTransaction.derivationPath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || uTXOTransaction.masterFingerprint != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, uTXOTransaction.masterFingerprint);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || uTXOTransaction.dummyInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, DummyInfo$$serializer.INSTANCE, uTXOTransaction.dummyInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) uTXOTransaction.dustLimit, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, uTXOTransaction.dustLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || uTXOTransaction.changeAddressType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, uTXOTransaction.changeAddressType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || uTXOTransaction.token != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, uTXOTransaction.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || uTXOTransaction.isRaise != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, uTXOTransaction.isRaise);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || uTXOTransaction.signatureList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], uTXOTransaction.signatureList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || uTXOTransaction.memo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, uTXOTransaction.memo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && uTXOTransaction.memoPos == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, uTXOTransaction.memoPos);
    }

    public UTXOTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<UTXOTxIn> list, String str7, String str8, String str9, String str10, DummyInfo dummyInfo, String str11, Integer num, String str12, Boolean bool, List<String> list2, String str13, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.balance = str;
        this.minOutput = str2;
        this.from = str3;
        this.to = str4;
        this.amount = str5;
        this.fee = str6;
        this.txin = list;
        this.publicKey = str7;
        this.changeAddress = str8;
        this.derivationPath = str9;
        this.masterFingerprint = str10;
        this.dummyInfo = dummyInfo;
        this.dustLimit = str11;
        this.changeAddressType = num;
        this.token = str12;
        this.isRaise = bool;
        this.signatureList = list2;
        this.memo = str13;
        this.memoPos = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0081: CONSTRUCTOR 
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r43v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r43v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r43v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r43v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:com.okinc.wallet.core.sign.utxo.DummyInfo:?: TERNARY null = ((wrap:int:0x0023: ARITH (r43v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.core.sign.utxo.DummyInfo) : (r35v0 com.okinc.wallet.core.sign.utxo.DummyInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r43v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0036: ARITH (r43v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r37v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r43v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (32768 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r39v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0055: ARITH (65536 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r40v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (131072 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0069: ARITH (r43v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r42v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.wallet.core.sign.utxo.UTXOTxIn>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.core.sign.utxo.DummyInfo, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.util.List<java.lang.String>, java.lang.String, java.lang.Integer):void (m)] (LINE:17) call: com.okinc.wallet.core.sign.utxo.UTXOTransaction.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.core.sign.utxo.DummyInfo, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.util.List, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ UTXOTransaction(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, DummyInfo dummyInfo, String str11, Integer num, String str12, Boolean bool, List list2, String str13, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, list, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : dummyInfo, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? null : num, (i & 16384) != 0 ? null : str12, (32768 & i) != 0 ? null : bool, (65536 & i) != 0 ? null : list2, (131072 & i) != 0 ? null : str13, (i & 262144) != 0 ? null : num2);
    }
}
