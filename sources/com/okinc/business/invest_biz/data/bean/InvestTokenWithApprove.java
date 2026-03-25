package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestTokenWithApprove implements Parcelable {
    public static final int ORDER_TYPE_ENTER_FARM = 8;
    public static final int ORDER_TYPE_INVEST_APPROVE = 3;
    public static final int ORDER_TYPE_PAUSE_FARM = 9;
    public static final int ORDER_TYPE_REDEEM_APPROVE = 4;
    private final String approveAddress;
    private final Integer approveType;
    private final long chainId;
    private final boolean isBaseToken;
    private boolean isNeedApprove;
    private final String needApproveAmount;
    private final String network;
    private final Integer orderType;
    private final String tokenAddress;
    private final String tokenLogo;
    private final String tokenName;
    private final String tokenPrecision;
    private final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestTokenWithApprove> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestTokenWithApprove> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTokenWithApprove createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestTokenWithApprove(parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTokenWithApprove[] newArray(int i) {
            return new InvestTokenWithApprove[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestTokenWithApprove() {
        this((String) null, 0L, false, false, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.approveAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.approveType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.needApproveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isNeedApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isBaseToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithApprove copy(@NotNull String str, long j, boolean z, boolean z2, @NotNull String str2, Integer num, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, Integer num2, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new InvestTokenWithApprove(str, j, z, z2, str2, num, str3, str4, str5, str6, str7, num2, str8);
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
        if (!(obj instanceof InvestTokenWithApprove)) {
            return false;
        }
        InvestTokenWithApprove investTokenWithApprove = (InvestTokenWithApprove) obj;
        return Intrinsics.EZpvd((Object) this.approveAddress, (Object) investTokenWithApprove.approveAddress) && this.chainId == investTokenWithApprove.chainId && this.isNeedApprove == investTokenWithApprove.isNeedApprove && this.isBaseToken == investTokenWithApprove.isBaseToken && Intrinsics.EZpvd((Object) this.network, (Object) investTokenWithApprove.network) && Intrinsics.EZpvd(this.orderType, investTokenWithApprove.orderType) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) investTokenWithApprove.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) investTokenWithApprove.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenName, (Object) investTokenWithApprove.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) investTokenWithApprove.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenPrecision, (Object) investTokenWithApprove.tokenPrecision) && Intrinsics.EZpvd(this.approveType, investTokenWithApprove.approveType) && Intrinsics.EZpvd((Object) this.needApproveAmount, (Object) investTokenWithApprove.needApproveAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApproveAddress() {
        return this.approveAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getApproveType() {
        return this.approveType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNeedApproveAmount() {
        return this.needApproveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrderType() {
        return this.orderType;
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
    public final String getTokenName() {
        return this.tokenName;
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
        int iHashCode = this.approveAddress.hashCode();
        int iHashCode2 = Long.hashCode(this.chainId);
        int iHashCode3 = Boolean.hashCode(this.isNeedApprove);
        int iHashCode4 = Boolean.hashCode(this.isBaseToken);
        int iHashCode5 = this.network.hashCode();
        Integer num = this.orderType;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        int iHashCode7 = this.tokenAddress.hashCode();
        int iHashCode8 = this.tokenLogo.hashCode();
        int iHashCode9 = this.tokenName.hashCode();
        int iHashCode10 = this.tokenSymbol.hashCode();
        int iHashCode11 = this.tokenPrecision.hashCode();
        Integer num2 = this.approveType;
        int iHashCode12 = num2 == null ? 0 : num2.hashCode();
        String str = this.needApproveAmount;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBaseToken() {
        return this.isBaseToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNeedApprove() {
        return this.isNeedApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedApprove(boolean z) {
        this.isNeedApprove = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTokenWithApprove(approveAddress=" + this.approveAddress + ", chainId=" + this.chainId + ", isNeedApprove=" + this.isNeedApprove + ", isBaseToken=" + this.isBaseToken + ", network=" + this.network + ", orderType=" + this.orderType + ", tokenAddress=" + this.tokenAddress + ", tokenLogo=" + this.tokenLogo + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ", tokenPrecision=" + this.tokenPrecision + ", approveType=" + this.approveType + ", needApproveAmount=" + this.needApproveAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.approveAddress);
        parcel.writeLong(this.chainId);
        parcel.writeInt(this.isNeedApprove ? 1 : 0);
        parcel.writeInt(this.isBaseToken ? 1 : 0);
        parcel.writeString(this.network);
        Integer num = this.orderType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenPrecision);
        Integer num2 = this.approveType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.needApproveAmount);
    }

    public /* synthetic */ InvestTokenWithApprove(int i, String str, long j, boolean z, boolean z2, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.approveAddress = "";
        } else {
            this.approveAddress = str;
        }
        this.chainId = (i & 2) == 0 ? 0L : j;
        if ((i & 4) == 0) {
            this.isNeedApprove = false;
        } else {
            this.isNeedApprove = z;
        }
        if ((i & 8) == 0) {
            this.isBaseToken = false;
        } else {
            this.isBaseToken = z2;
        }
        if ((i & 16) == 0) {
            this.network = "";
        } else {
            this.network = str2;
        }
        if ((i & 32) == 0) {
            this.orderType = null;
        } else {
            this.orderType = num;
        }
        if ((i & 64) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str3;
        }
        if ((i & 128) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str4;
        }
        if ((i & 256) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str5;
        }
        if ((i & 512) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str6;
        }
        if ((i & 1024) == 0) {
            this.tokenPrecision = "";
        } else {
            this.tokenPrecision = str7;
        }
        if ((i & 2048) == 0) {
            this.approveType = null;
        } else {
            this.approveType = num2;
        }
        if ((i & 4096) == 0) {
            this.needApproveAmount = null;
        } else {
            this.needApproveAmount = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestTokenWithApprove investTokenWithApprove, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investTokenWithApprove.approveAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investTokenWithApprove.approveAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investTokenWithApprove.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, investTokenWithApprove.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investTokenWithApprove.isNeedApprove) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, investTokenWithApprove.isNeedApprove);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investTokenWithApprove.isBaseToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, investTokenWithApprove.isBaseToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investTokenWithApprove.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, investTokenWithApprove.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investTokenWithApprove.orderType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, investTokenWithApprove.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investTokenWithApprove.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investTokenWithApprove.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investTokenWithApprove.tokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, investTokenWithApprove.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investTokenWithApprove.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investTokenWithApprove.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investTokenWithApprove.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, investTokenWithApprove.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investTokenWithApprove.tokenPrecision, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investTokenWithApprove.tokenPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || investTokenWithApprove.approveType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, investTokenWithApprove.approveType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && investTokenWithApprove.needApproveAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, investTokenWithApprove.needApproveAmount);
    }

    public InvestTokenWithApprove(@NotNull String str, long j, boolean z, boolean z2, @NotNull String str2, Integer num, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, Integer num2, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.approveAddress = str;
        this.chainId = j;
        this.isNeedApprove = z;
        this.isBaseToken = z2;
        this.network = str2;
        this.orderType = num;
        this.tokenAddress = str3;
        this.tokenLogo = str4;
        this.tokenName = str5;
        this.tokenSymbol = str6;
        this.tokenPrecision = str7;
        this.approveType = num2;
        this.needApproveAmount = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0088: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r30v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r20v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002d: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005d: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r28v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, long, boolean, boolean, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:378) call: com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove.<init>(java.lang.String, long, boolean, boolean, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ InvestTokenWithApprove(String str, long j, boolean z, boolean z2, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z, (i & 8) == 0 ? z2 : false, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) == 0 ? str7 : "", (i & 2048) != 0 ? null : num2, (i & 4096) == 0 ? str8 : null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestTokenWithApprove> serializer() {
            return InvestTokenWithApprove$$serializer.INSTANCE;
        }
    }
}
