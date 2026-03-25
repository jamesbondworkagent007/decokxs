package com.okinc.business.trade.features.home.ui.cefi.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedQuoteParams implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AdvancedQuoteParams> CREATOR = new Creator();
    private final String amount;
    private final String approveAmount;
    private final boolean canUseSmartAccount;
    private final String chainId;
    private final List<String> dexIds;
    private final String excludedDexIds;
    private final String fromTokenAddress;
    private final String maxSlippage;
    private final Boolean needApproveTxInfo;
    private final String priorityFee;
    private final String priorityFeeType;
    private final String routerModeType;
    private final String slippage;
    private final Integer slippageMode;
    private final String toTokenAddress;

    public static final class Creator implements Parcelable.Creator<AdvancedQuoteParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedQuoteParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string6 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdvancedQuoteParams(string, string2, string3, string4, string5, numValueOf, string6, arrayListCreateStringArrayList, string7, string8, string9, string10, z, boolValueOf, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedQuoteParams[] newArray(int i) {
            return new AdvancedQuoteParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.canUseSmartAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.needApproveTxInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.approveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component8() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.excludedDexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedQuoteParams copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, Integer num, String str6, List<String> list, String str7, String str8, String str9, String str10, boolean z, Boolean bool, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AdvancedQuoteParams(str, str2, str3, str4, str5, num, str6, list, str7, str8, str9, str10, z, bool, str11);
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
        if (!(obj instanceof AdvancedQuoteParams)) {
            return false;
        }
        AdvancedQuoteParams advancedQuoteParams = (AdvancedQuoteParams) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) advancedQuoteParams.chainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) advancedQuoteParams.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) advancedQuoteParams.toTokenAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) advancedQuoteParams.amount) && Intrinsics.EZpvd((Object) this.slippage, (Object) advancedQuoteParams.slippage) && Intrinsics.EZpvd(this.slippageMode, advancedQuoteParams.slippageMode) && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) advancedQuoteParams.maxSlippage) && Intrinsics.EZpvd(this.dexIds, advancedQuoteParams.dexIds) && Intrinsics.EZpvd((Object) this.excludedDexIds, (Object) advancedQuoteParams.excludedDexIds) && Intrinsics.EZpvd((Object) this.routerModeType, (Object) advancedQuoteParams.routerModeType) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) advancedQuoteParams.priorityFee) && Intrinsics.EZpvd((Object) this.priorityFeeType, (Object) advancedQuoteParams.priorityFeeType) && this.canUseSmartAccount == advancedQuoteParams.canUseSmartAccount && Intrinsics.EZpvd(this.needApproveTxInfo, advancedQuoteParams.needApproveTxInfo) && Intrinsics.EZpvd((Object) this.approveAmount, (Object) advancedQuoteParams.approveAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApproveAmount() {
        return this.approveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanUseSmartAccount() {
        return this.canUseSmartAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDexIds() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExcludedDexIds() {
        return this.excludedDexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedApproveTxInfo() {
        return this.needApproveTxInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFeeType() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouterModeType() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSlippageMode() {
        return this.slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.fromTokenAddress.hashCode();
        int iHashCode3 = this.toTokenAddress.hashCode();
        int iHashCode4 = this.amount.hashCode();
        String str = this.slippage;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Integer num = this.slippageMode;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        String str2 = this.maxSlippage;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        List<String> list = this.dexIds;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        String str3 = this.excludedDexIds;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.routerModeType;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.priorityFee;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.priorityFeeType;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        int iHashCode13 = Boolean.hashCode(this.canUseSmartAccount);
        Boolean bool = this.needApproveTxInfo;
        int iHashCode14 = bool == null ? 0 : bool.hashCode();
        String str7 = this.approveAmount;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str7 == null ? 0 : str7.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvancedQuoteParams(chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", amount=" + this.amount + ", slippage=" + this.slippage + ", slippageMode=" + this.slippageMode + ", maxSlippage=" + this.maxSlippage + ", dexIds=" + this.dexIds + ", excludedDexIds=" + this.excludedDexIds + ", routerModeType=" + this.routerModeType + ", priorityFee=" + this.priorityFee + ", priorityFeeType=" + this.priorityFeeType + ", canUseSmartAccount=" + this.canUseSmartAccount + ", needApproveTxInfo=" + this.needApproveTxInfo + ", approveAmount=" + this.approveAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.fromTokenAddress);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.amount);
        parcel.writeString(this.slippage);
        Integer num = this.slippageMode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.maxSlippage);
        parcel.writeStringList(this.dexIds);
        parcel.writeString(this.excludedDexIds);
        parcel.writeString(this.routerModeType);
        parcel.writeString(this.priorityFee);
        parcel.writeString(this.priorityFeeType);
        parcel.writeInt(this.canUseSmartAccount ? 1 : 0);
        Boolean bool = this.needApproveTxInfo;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.approveAmount);
    }

    public AdvancedQuoteParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, Integer num, String str6, List<String> list, String str7, String str8, String str9, String str10, boolean z, Boolean bool, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.chainId = str;
        this.fromTokenAddress = str2;
        this.toTokenAddress = str3;
        this.amount = str4;
        this.slippage = str5;
        this.slippageMode = num;
        this.maxSlippage = str6;
        this.dexIds = list;
        this.excludedDexIds = str7;
        this.routerModeType = str8;
        this.priorityFee = str9;
        this.priorityFeeType = str10;
        this.canUseSmartAccount = z;
        this.needApproveTxInfo = bool;
        this.approveAmount = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004b: CONSTRUCTOR 
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.Integer)
  (r26v0 java.lang.String)
  (r27v0 java.util.List)
  (r28v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r33v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r35v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Boolean, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ AdvancedQuoteParams(String str, String str2, String str3, String str4, String str5, Integer num, String str6, List list, String str7, String str8, String str9, String str10, boolean z, Boolean bool, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, num, str6, list, str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? null : bool, (i & 16384) != 0 ? null : str11);
    }
}
