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
public final class AmountDetail implements Parcelable {
    public static final int $stable = 0;
    private final String nftImageUrl;
    private final String nftName;
    private final String rawValue;
    private final String tokenId;
    private final String tokenNum;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AmountDetail> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AmountDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AmountDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AmountDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AmountDetail[] newArray(int i) {
            return new AmountDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AmountDetail() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AmountDetail copy$default(AmountDetail amountDetail, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = amountDetail.nftImageUrl;
        }
        if ((i & 2) != 0) {
            str2 = amountDetail.nftName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = amountDetail.rawValue;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = amountDetail.tokenId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = amountDetail.tokenNum;
        }
        return amountDetail.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nftImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nftName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.rawValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AmountDetail copy(String str, String str2, String str3, String str4, String str5) {
        return new AmountDetail(str, str2, str3, str4, str5);
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
        if (!(obj instanceof AmountDetail)) {
            return false;
        }
        AmountDetail amountDetail = (AmountDetail) obj;
        return Intrinsics.EZpvd((Object) this.nftImageUrl, (Object) amountDetail.nftImageUrl) && Intrinsics.EZpvd((Object) this.nftName, (Object) amountDetail.nftName) && Intrinsics.EZpvd((Object) this.rawValue, (Object) amountDetail.rawValue) && Intrinsics.EZpvd((Object) this.tokenId, (Object) amountDetail.tokenId) && Intrinsics.EZpvd((Object) this.tokenNum, (Object) amountDetail.tokenNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftImageUrl() {
        return this.nftImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftName() {
        return this.nftName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawValue() {
        return this.rawValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenNum() {
        return this.tokenNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nftImageUrl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.nftName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.rawValue;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenNum;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AmountDetail(nftImageUrl=" + this.nftImageUrl + ", nftName=" + this.nftName + ", rawValue=" + this.rawValue + ", tokenId=" + this.tokenId + ", tokenNum=" + this.tokenNum + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.nftImageUrl);
        parcel.writeString(this.nftName);
        parcel.writeString(this.rawValue);
        parcel.writeString(this.tokenId);
        parcel.writeString(this.tokenNum);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AmountDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AmountDetail> serializer() {
            return AmountDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AmountDetail(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nftImageUrl = null;
        } else {
            this.nftImageUrl = str;
        }
        if ((i & 2) == 0) {
            this.nftName = null;
        } else {
            this.nftName = str2;
        }
        if ((i & 4) == 0) {
            this.rawValue = null;
        } else {
            this.rawValue = str3;
        }
        if ((i & 8) == 0) {
            this.tokenId = null;
        } else {
            this.tokenId = str4;
        }
        if ((i & 16) == 0) {
            this.tokenNum = null;
        } else {
            this.tokenNum = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(AmountDetail amountDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || amountDetail.nftImageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, amountDetail.nftImageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || amountDetail.nftName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, amountDetail.nftName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || amountDetail.rawValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, amountDetail.rawValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || amountDetail.tokenId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, amountDetail.tokenId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && amountDetail.tokenNum == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, amountDetail.tokenNum);
    }

    public AmountDetail(String str, String str2, String str3, String str4, String str5) {
        this.nftImageUrl = str;
        this.nftName = str2;
        this.rawValue = str3;
        this.tokenId = str4;
        this.tokenNum = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:247) call: com.okinc.business.defi.biz.net.bean.AmountDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AmountDetail(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
