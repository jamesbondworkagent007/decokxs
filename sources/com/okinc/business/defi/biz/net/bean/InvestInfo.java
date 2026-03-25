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
public final class InvestInfo implements Parcelable {
    private Integer direction;
    private InvestTxTokenLogo investLogo;
    private String investName;
    private String num;
    private String platformName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestInfo(parcel.readString(), parcel.readInt() == 0 ? null : InvestTxTokenLogo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestInfo[] newArray(int i) {
            return new InvestInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestInfo() {
        this((String) null, (InvestTxTokenLogo) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestInfo copy$default(InvestInfo investInfo, String str, InvestTxTokenLogo investTxTokenLogo, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investInfo.investName;
        }
        if ((i & 2) != 0) {
            investTxTokenLogo = investInfo.investLogo;
        }
        InvestTxTokenLogo investTxTokenLogo2 = investTxTokenLogo;
        if ((i & 4) != 0) {
            str2 = investInfo.num;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            num = investInfo.direction;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str3 = investInfo.platformName;
        }
        return investInfo.copy(str, investTxTokenLogo2, str4, num2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.investName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTxTokenLogo component2() {
        return this.investLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestInfo copy(String str, InvestTxTokenLogo investTxTokenLogo, String str2, Integer num, String str3) {
        return new InvestInfo(str, investTxTokenLogo, str2, num, str3);
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
        if (!(obj instanceof InvestInfo)) {
            return false;
        }
        InvestInfo investInfo = (InvestInfo) obj;
        return Intrinsics.EZpvd((Object) this.investName, (Object) investInfo.investName) && Intrinsics.EZpvd(this.investLogo, investInfo.investLogo) && Intrinsics.EZpvd((Object) this.num, (Object) investInfo.num) && Intrinsics.EZpvd(this.direction, investInfo.direction) && Intrinsics.EZpvd((Object) this.platformName, (Object) investInfo.platformName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTxTokenLogo getInvestLogo() {
        return this.investLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestName() {
        return this.investName;
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
    public int hashCode() {
        String str = this.investName;
        int iHashCode = str == null ? 0 : str.hashCode();
        InvestTxTokenLogo investTxTokenLogo = this.investLogo;
        int iHashCode2 = investTxTokenLogo == null ? 0 : investTxTokenLogo.hashCode();
        String str2 = this.num;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.direction;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str3 = this.platformName;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(Integer num) {
        this.direction = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestLogo(InvestTxTokenLogo investTxTokenLogo) {
        this.investLogo = investTxTokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestName(String str) {
        this.investName = str;
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
    public String toString() {
        return "InvestInfo(investName=" + this.investName + ", investLogo=" + this.investLogo + ", num=" + this.num + ", direction=" + this.direction + ", platformName=" + this.platformName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.investName);
        InvestTxTokenLogo investTxTokenLogo = this.investLogo;
        if (investTxTokenLogo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTxTokenLogo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.num);
        Integer num = this.direction;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.platformName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.InvestInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestInfo> serializer() {
            return InvestInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestInfo(int i, String str, InvestTxTokenLogo investTxTokenLogo, String str2, Integer num, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.investName = null;
        } else {
            this.investName = str;
        }
        if ((i & 2) == 0) {
            this.investLogo = null;
        } else {
            this.investLogo = investTxTokenLogo;
        }
        if ((i & 4) == 0) {
            this.num = null;
        } else {
            this.num = str2;
        }
        if ((i & 8) == 0) {
            this.direction = null;
        } else {
            this.direction = num;
        }
        if ((i & 16) == 0) {
            this.platformName = null;
        } else {
            this.platformName = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(InvestInfo investInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investInfo.investName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, investInfo.investName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investInfo.investLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InvestTxTokenLogo$$serializer.INSTANCE, investInfo.investLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investInfo.num != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investInfo.num);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investInfo.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, investInfo.direction);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && investInfo.platformName == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investInfo.platformName);
    }

    public InvestInfo(String str, InvestTxTokenLogo investTxTokenLogo, String str2, Integer num, String str3) {
        this.investName = str;
        this.investLogo = investTxTokenLogo;
        this.num = str2;
        this.direction = num;
        this.platformName = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.net.bean.InvestTxTokenLogo:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.InvestTxTokenLogo) : (r6v0 com.okinc.business.defi.biz.net.bean.InvestTxTokenLogo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.defi.biz.net.bean.InvestTxTokenLogo, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:294) call: com.okinc.business.defi.biz.net.bean.InvestInfo.<init>(java.lang.String, com.okinc.business.defi.biz.net.bean.InvestTxTokenLogo, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ InvestInfo(String str, InvestTxTokenLogo investTxTokenLogo, String str2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : investTxTokenLogo, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3);
    }
}
