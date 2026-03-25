package com.okinc.business.invest_biz.data.logic.ws.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestInputData implements Parcelable {
    private String amount;
    private String approvedTokenAddress;
    private boolean isPoolSwitch;
    private boolean redeemAll;
    private String tokenAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestInputData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestInputData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestInputData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestInputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestInputData[] newArray(int i) {
            return new InvestInputData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestInputData() {
        this((String) null, (String) null, (String) null, false, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestInputData copy$default(InvestInputData investInputData, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investInputData.amount;
        }
        if ((i & 2) != 0) {
            str2 = investInputData.tokenAddress;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = investInputData.approvedTokenAddress;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = investInputData.isPoolSwitch;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = investInputData.redeemAll;
        }
        return investInputData.copy(str, str4, str5, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.approvedTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isPoolSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.redeemAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestInputData copy(String str, String str2, String str3, boolean z, boolean z2) {
        return new InvestInputData(str, str2, str3, z, z2);
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
        if (!(obj instanceof InvestInputData)) {
            return false;
        }
        InvestInputData investInputData = (InvestInputData) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) investInputData.amount) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) investInputData.tokenAddress) && Intrinsics.EZpvd((Object) this.approvedTokenAddress, (Object) investInputData.approvedTokenAddress) && this.isPoolSwitch == investInputData.isPoolSwitch && this.redeemAll == investInputData.redeemAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovedTokenAddress() {
        return this.approvedTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRedeemAll() {
        return this.redeemAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.amount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.approvedTokenAddress;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPoolSwitch)) * 31) + Boolean.hashCode(this.redeemAll);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPoolSwitch() {
        return this.isPoolSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovedTokenAddress(String str) {
        this.approvedTokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPoolSwitch(boolean z) {
        this.isPoolSwitch = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRedeemAll(boolean z) {
        this.redeemAll = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(String str) {
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestInputData(amount=" + this.amount + ", tokenAddress=" + this.tokenAddress + ", approvedTokenAddress=" + this.approvedTokenAddress + ", isPoolSwitch=" + this.isPoolSwitch + ", redeemAll=" + this.redeemAll + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.amount);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.approvedTokenAddress);
        parcel.writeInt(this.isPoolSwitch ? 1 : 0);
        parcel.writeInt(this.redeemAll ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestInputData> serializer() {
            return InvestInputData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestInputData(int i, String str, String str2, String str3, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.amount = "";
        } else {
            this.amount = str;
        }
        if ((i & 2) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str2;
        }
        if ((i & 4) == 0) {
            this.approvedTokenAddress = "";
        } else {
            this.approvedTokenAddress = str3;
        }
        if ((i & 8) == 0) {
            this.isPoolSwitch = false;
        } else {
            this.isPoolSwitch = z;
        }
        if ((i & 16) == 0) {
            this.redeemAll = false;
        } else {
            this.redeemAll = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestInputData investInputData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investInputData.amount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, investInputData.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investInputData.tokenAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investInputData.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investInputData.approvedTokenAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investInputData.approvedTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investInputData.isPoolSwitch) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, investInputData.isPoolSwitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investInputData.redeemAll) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, investInputData.redeemAll);
        }
    }

    public InvestInputData(String str, String str2, String str3, boolean z, boolean z2) {
        this.amount = str;
        this.tokenAddress = str2;
        this.approvedTokenAddress = str3;
        this.isPoolSwitch = z;
        this.redeemAll = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:40) call: com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ InvestInputData(String str, String str2, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }
}
