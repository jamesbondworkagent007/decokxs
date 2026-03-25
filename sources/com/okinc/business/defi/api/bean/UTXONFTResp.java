package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class UTXONFTResp implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UTXONFTResp> CREATOR = new Creator();
    private String address;
    private BigInteger contentLength;
    private String contentType;
    private String genesisTransaction;
    private String inscriptionId;
    private BigInteger inscriptionNumber;
    private String location;
    private BigInteger offset;
    private String output;
    private BigInteger outputValue;
    private BigInteger timestamp;

    public static final class Creator implements Parcelable.Creator<UTXONFTResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXONFTResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UTXONFTResp(parcel.readString(), parcel.readString(), (BigInteger) parcel.readSerializable(), parcel.readString(), parcel.readString(), (BigInteger) parcel.readSerializable(), (BigInteger) parcel.readSerializable(), parcel.readString(), (BigInteger) parcel.readSerializable(), (BigInteger) parcel.readSerializable(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXONFTResp[] newArray(int i) {
            return new UTXONFTResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UTXONFTResp() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.inscriptionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger component10() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.genesisTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger component3() {
        return this.outputValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.location;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.output;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger component6() {
        return this.offset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger component7() {
        return this.contentLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger component9() {
        return this.inscriptionNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXONFTResp copy(String str, String str2, BigInteger bigInteger, String str3, String str4, BigInteger bigInteger2, BigInteger bigInteger3, String str5, BigInteger bigInteger4, BigInteger bigInteger5, String str6) {
        return new UTXONFTResp(str, str2, bigInteger, str3, str4, bigInteger2, bigInteger3, str5, bigInteger4, bigInteger5, str6);
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
        if (!(obj instanceof UTXONFTResp)) {
            return false;
        }
        UTXONFTResp uTXONFTResp = (UTXONFTResp) obj;
        return Intrinsics.EZpvd((Object) this.inscriptionId, (Object) uTXONFTResp.inscriptionId) && Intrinsics.EZpvd((Object) this.address, (Object) uTXONFTResp.address) && Intrinsics.EZpvd(this.outputValue, uTXONFTResp.outputValue) && Intrinsics.EZpvd((Object) this.location, (Object) uTXONFTResp.location) && Intrinsics.EZpvd((Object) this.output, (Object) uTXONFTResp.output) && Intrinsics.EZpvd(this.offset, uTXONFTResp.offset) && Intrinsics.EZpvd(this.contentLength, uTXONFTResp.contentLength) && Intrinsics.EZpvd((Object) this.contentType, (Object) uTXONFTResp.contentType) && Intrinsics.EZpvd(this.inscriptionNumber, uTXONFTResp.inscriptionNumber) && Intrinsics.EZpvd(this.timestamp, uTXONFTResp.timestamp) && Intrinsics.EZpvd((Object) this.genesisTransaction, (Object) uTXONFTResp.genesisTransaction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger getContentLength() {
        return this.contentLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGenesisTransaction() {
        return this.genesisTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInscriptionId() {
        return this.inscriptionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger getInscriptionNumber() {
        return this.inscriptionNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocation() {
        return this.location;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger getOffset() {
        return this.offset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOutput() {
        return this.output;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger getOutputValue() {
        return this.outputValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.inscriptionId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.address;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        BigInteger bigInteger = this.outputValue;
        int iHashCode3 = bigInteger == null ? 0 : bigInteger.hashCode();
        String str3 = this.location;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.output;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        BigInteger bigInteger2 = this.offset;
        int iHashCode6 = bigInteger2 == null ? 0 : bigInteger2.hashCode();
        BigInteger bigInteger3 = this.contentLength;
        int iHashCode7 = bigInteger3 == null ? 0 : bigInteger3.hashCode();
        String str5 = this.contentType;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        BigInteger bigInteger4 = this.inscriptionNumber;
        int iHashCode9 = bigInteger4 == null ? 0 : bigInteger4.hashCode();
        BigInteger bigInteger5 = this.timestamp;
        int iHashCode10 = bigInteger5 == null ? 0 : bigInteger5.hashCode();
        String str6 = this.genesisTransaction;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentLength(BigInteger bigInteger) {
        this.contentLength = bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentType(String str) {
        this.contentType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGenesisTransaction(String str) {
        this.genesisTransaction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInscriptionId(String str) {
        this.inscriptionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInscriptionNumber(BigInteger bigInteger) {
        this.inscriptionNumber = bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocation(String str) {
        this.location = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOffset(BigInteger bigInteger) {
        this.offset = bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOutput(String str) {
        this.output = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOutputValue(BigInteger bigInteger) {
        this.outputValue = bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimestamp(BigInteger bigInteger) {
        this.timestamp = bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UTXONFTResp(inscriptionId=" + this.inscriptionId + ", address=" + this.address + ", outputValue=" + this.outputValue + ", location=" + this.location + ", output=" + this.output + ", offset=" + this.offset + ", contentLength=" + this.contentLength + ", contentType=" + this.contentType + ", inscriptionNumber=" + this.inscriptionNumber + ", timestamp=" + this.timestamp + ", genesisTransaction=" + this.genesisTransaction + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.inscriptionId);
        parcel.writeString(this.address);
        parcel.writeSerializable(this.outputValue);
        parcel.writeString(this.location);
        parcel.writeString(this.output);
        parcel.writeSerializable(this.offset);
        parcel.writeSerializable(this.contentLength);
        parcel.writeString(this.contentType);
        parcel.writeSerializable(this.inscriptionNumber);
        parcel.writeSerializable(this.timestamp);
        parcel.writeString(this.genesisTransaction);
    }

    public UTXONFTResp(String str, String str2, BigInteger bigInteger, String str3, String str4, BigInteger bigInteger2, BigInteger bigInteger3, String str5, BigInteger bigInteger4, BigInteger bigInteger5, String str6) {
        this.inscriptionId = str;
        this.address = str2;
        this.outputValue = bigInteger;
        this.location = str3;
        this.output = str4;
        this.offset = bigInteger2;
        this.contentLength = bigInteger3;
        this.contentType = str5;
        this.inscriptionNumber = bigInteger4;
        this.timestamp = bigInteger5;
        this.genesisTransaction = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.math.BigInteger:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigInteger) : (r15v0 java.math.BigInteger))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.math.BigInteger:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigInteger) : (r18v0 java.math.BigInteger))
  (wrap:java.math.BigInteger:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigInteger) : (r19v0 java.math.BigInteger))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.math.BigInteger:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigInteger) : (r21v0 java.math.BigInteger))
  (wrap:java.math.BigInteger:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigInteger) : (r22v0 java.math.BigInteger))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.math.BigInteger, java.lang.String, java.lang.String, java.math.BigInteger, java.math.BigInteger, java.lang.String, java.math.BigInteger, java.math.BigInteger, java.lang.String):void (m)] (LINE:508) call: com.okinc.business.defi.api.bean.UTXONFTResp.<init>(java.lang.String, java.lang.String, java.math.BigInteger, java.lang.String, java.lang.String, java.math.BigInteger, java.math.BigInteger, java.lang.String, java.math.BigInteger, java.math.BigInteger, java.lang.String):void type: THIS */
    public /* synthetic */ UTXONFTResp(String str, String str2, BigInteger bigInteger, String str3, String str4, BigInteger bigInteger2, BigInteger bigInteger3, String str5, BigInteger bigInteger4, BigInteger bigInteger5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bigInteger, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bigInteger2, (i & 64) != 0 ? null : bigInteger3, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : bigInteger4, (i & 512) != 0 ? null : bigInteger5, (i & 1024) == 0 ? str6 : null);
    }
}
