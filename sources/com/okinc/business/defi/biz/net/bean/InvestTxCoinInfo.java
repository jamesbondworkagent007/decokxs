package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class InvestTxCoinInfo implements Parcelable {
    private String direction;
    private String num;
    private String platformName;
    private String tokenId;
    private String tokenLogo;
    private String tokenName;
    private Integer vdecimalNum;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestTxCoinInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestTxCoinInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTxCoinInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestTxCoinInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTxCoinInfo[] newArray(int i) {
            return new InvestTxCoinInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestTxCoinInfo() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestTxCoinInfo copy$default(InvestTxCoinInfo investTxCoinInfo, String str, String str2, String str3, Integer num, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investTxCoinInfo.tokenName;
        }
        if ((i & 2) != 0) {
            str2 = investTxCoinInfo.tokenLogo;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = investTxCoinInfo.num;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            num = investTxCoinInfo.vdecimalNum;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str4 = investTxCoinInfo.direction;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = investTxCoinInfo.platformName;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = investTxCoinInfo.tokenId;
        }
        return investTxCoinInfo.copy(str, str7, str8, num2, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTxCoinInfo copy(String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
        return new InvestTxCoinInfo(str, str2, str3, num, str4, str5, str6);
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
        if (!(obj instanceof InvestTxCoinInfo)) {
            return false;
        }
        InvestTxCoinInfo investTxCoinInfo = (InvestTxCoinInfo) obj;
        return Intrinsics.EZpvd((Object) this.tokenName, (Object) investTxCoinInfo.tokenName) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) investTxCoinInfo.tokenLogo) && Intrinsics.EZpvd((Object) this.num, (Object) investTxCoinInfo.num) && Intrinsics.EZpvd(this.vdecimalNum, investTxCoinInfo.vdecimalNum) && Intrinsics.EZpvd((Object) this.direction, (Object) investTxCoinInfo.direction) && Intrinsics.EZpvd((Object) this.platformName, (Object) investTxCoinInfo.platformName) && Intrinsics.EZpvd((Object) this.tokenId, (Object) investTxCoinInfo.tokenId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNum() {
        return this.num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVdecimalNum() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tokenName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenLogo;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.num;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.vdecimalNum;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this.direction;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.platformName;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tokenId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(String str) {
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNum(String str) {
        this.num = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatformName(String str) {
        this.platformName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenId(String str) {
        this.tokenId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenLogo(String str) {
        this.tokenLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenName(String str) {
        this.tokenName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVdecimalNum(Integer num) {
        this.vdecimalNum = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTxCoinInfo(tokenName=" + this.tokenName + ", tokenLogo=" + this.tokenLogo + ", num=" + this.num + ", vdecimalNum=" + this.vdecimalNum + ", direction=" + this.direction + ", platformName=" + this.platformName + ", tokenId=" + this.tokenId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.num);
        Integer num = this.vdecimalNum;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.direction);
        parcel.writeString(this.platformName);
        parcel.writeString(this.tokenId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.InvestTxCoinInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestTxCoinInfo> serializer() {
            return InvestTxCoinInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestTxCoinInfo(int i, String str, String str2, String str3, Integer num, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenName = null;
        } else {
            this.tokenName = str;
        }
        if ((i & 2) == 0) {
            this.tokenLogo = null;
        } else {
            this.tokenLogo = str2;
        }
        if ((i & 4) == 0) {
            this.num = null;
        } else {
            this.num = str3;
        }
        if ((i & 8) == 0) {
            this.vdecimalNum = null;
        } else {
            this.vdecimalNum = num;
        }
        if ((i & 16) == 0) {
            this.direction = "";
        } else {
            this.direction = str4;
        }
        if ((i & 32) == 0) {
            this.platformName = null;
        } else {
            this.platformName = str5;
        }
        if ((i & 64) == 0) {
            this.tokenId = null;
        } else {
            this.tokenId = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(InvestTxCoinInfo investTxCoinInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investTxCoinInfo.tokenName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, investTxCoinInfo.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investTxCoinInfo.tokenLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investTxCoinInfo.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investTxCoinInfo.num != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investTxCoinInfo.num);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investTxCoinInfo.vdecimalNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, investTxCoinInfo.vdecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investTxCoinInfo.direction, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investTxCoinInfo.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investTxCoinInfo.platformName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investTxCoinInfo.platformName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && investTxCoinInfo.tokenId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investTxCoinInfo.tokenId);
    }

    public InvestTxCoinInfo(String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
        this.tokenName = str;
        this.tokenLogo = str2;
        this.num = str3;
        this.vdecimalNum = num;
        this.direction = str4;
        this.platformName = str5;
        this.tokenId = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.String:0x0023: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:270) call: com.okinc.business.defi.biz.net.bean.InvestTxCoinInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestTxCoinInfo(String str, String str2, String str3, Integer num, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
