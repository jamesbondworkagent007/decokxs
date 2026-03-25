package com.okinc.business.invest_biz.data.bean;

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
import o.InterfaceC27436jvE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUserRewardElementInfo implements Parcelable, InterfaceC27436jvE {
    public static final int $stable = 0;
    private final ButtonType buttonType;
    private final String coinAmount;
    private final String currencyAmount;
    private final String tokenAddress;
    private final String tokenLogo;
    private final String tokenPrecision;
    private final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestUserRewardElementInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {ButtonType.Companion.serializer(), null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InvestUserRewardElementInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserRewardElementInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestUserRewardElementInfo(ButtonType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserRewardElementInfo[] newArray(int i) {
            return new InvestUserRewardElementInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUserRewardElementInfo() {
        this((ButtonType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestUserRewardElementInfo copy$default(InvestUserRewardElementInfo investUserRewardElementInfo, ButtonType buttonType, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            buttonType = investUserRewardElementInfo.buttonType;
        }
        if ((i & 2) != 0) {
            str = investUserRewardElementInfo.coinAmount;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = investUserRewardElementInfo.currencyAmount;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = investUserRewardElementInfo.tokenAddress;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = investUserRewardElementInfo.tokenLogo;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = investUserRewardElementInfo.tokenPrecision;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = investUserRewardElementInfo.tokenSymbol;
        }
        return investUserRewardElementInfo.copy(buttonType, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonType component1() {
        return this.buttonType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserRewardElementInfo copy(@NotNull ButtonType buttonType, String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(buttonType, "");
        return new InvestUserRewardElementInfo(buttonType, str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof InvestUserRewardElementInfo)) {
            return false;
        }
        InvestUserRewardElementInfo investUserRewardElementInfo = (InvestUserRewardElementInfo) obj;
        return this.buttonType == investUserRewardElementInfo.buttonType && Intrinsics.EZpvd((Object) this.coinAmount, (Object) investUserRewardElementInfo.coinAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) investUserRewardElementInfo.currencyAmount) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) investUserRewardElementInfo.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) investUserRewardElementInfo.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenPrecision, (Object) investUserRewardElementInfo.tokenPrecision) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) investUserRewardElementInfo.tokenSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonType getButtonType() {
        return this.buttonType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPrecision() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.buttonType.hashCode();
        String str = this.coinAmount;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.currencyAmount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenAddress;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenLogo;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenPrecision;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tokenSymbol;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUserRewardElementInfo(buttonType=" + this.buttonType + ", coinAmount=" + this.coinAmount + ", currencyAmount=" + this.currencyAmount + ", tokenAddress=" + this.tokenAddress + ", tokenLogo=" + this.tokenLogo + ", tokenPrecision=" + this.tokenPrecision + ", tokenSymbol=" + this.tokenSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.buttonType.name());
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.currencyAmount);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.tokenPrecision);
        parcel.writeString(this.tokenSymbol);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUserRewardElementInfo> serializer() {
            return InvestUserRewardElementInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUserRewardElementInfo(int i, ButtonType buttonType, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        this.buttonType = (i & 1) == 0 ? ButtonType.CLAIM_TYPE_NO_NEED_SHOW : buttonType;
        if ((i & 2) == 0) {
            this.coinAmount = null;
        } else {
            this.coinAmount = str;
        }
        if ((i & 4) == 0) {
            this.currencyAmount = null;
        } else {
            this.currencyAmount = str2;
        }
        if ((i & 8) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str3;
        }
        if ((i & 16) == 0) {
            this.tokenLogo = null;
        } else {
            this.tokenLogo = str4;
        }
        if ((i & 32) == 0) {
            this.tokenPrecision = null;
        } else {
            this.tokenPrecision = str5;
        }
        if ((i & 64) == 0) {
            this.tokenSymbol = null;
        } else {
            this.tokenSymbol = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUserRewardElementInfo investUserRewardElementInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investUserRewardElementInfo.buttonType != ButtonType.CLAIM_TYPE_NO_NEED_SHOW) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], investUserRewardElementInfo.buttonType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investUserRewardElementInfo.coinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investUserRewardElementInfo.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investUserRewardElementInfo.currencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investUserRewardElementInfo.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investUserRewardElementInfo.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investUserRewardElementInfo.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investUserRewardElementInfo.tokenLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investUserRewardElementInfo.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investUserRewardElementInfo.tokenPrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investUserRewardElementInfo.tokenPrecision);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && investUserRewardElementInfo.tokenSymbol == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investUserRewardElementInfo.tokenSymbol);
    }

    public InvestUserRewardElementInfo(@NotNull ButtonType buttonType, String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(buttonType, "");
        this.buttonType = buttonType;
        this.coinAmount = str;
        this.currencyAmount = str2;
        this.tokenAddress = str3;
        this.tokenLogo = str4;
        this.tokenPrecision = str5;
        this.tokenSymbol = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.ButtonType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.bean.ButtonType:0x0004: SGET  A[WRAPPED] (LINE:247) com.okinc.business.invest_biz.data.bean.ButtonType.CLAIM_TYPE_NO_NEED_SHOW com.okinc.business.invest_biz.data.bean.ButtonType) : (r6v0 com.okinc.business.invest_biz.data.bean.ButtonType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (null java.lang.String))
 A[MD:(com.okinc.business.invest_biz.data.bean.ButtonType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:246) call: com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo.<init>(com.okinc.business.invest_biz.data.bean.ButtonType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestUserRewardElementInfo(ButtonType buttonType, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ButtonType.CLAIM_TYPE_NO_NEED_SHOW : buttonType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? str6 : null);
    }
}
