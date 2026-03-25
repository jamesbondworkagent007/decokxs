package com.okinc.business.finance_api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AutoEarnInfo implements Parcelable {
    private final boolean allowed;
    private final String fundingAccountBalanceInUsdt;
    private final String fundingAccountValuation;
    private int status;
    private final String valuationUnit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AutoEarnInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AutoEarnInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoEarnInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AutoEarnInfo(parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoEarnInfo[] newArray(int i) {
            return new AutoEarnInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AutoEarnInfo() {
        this(false, 0, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AutoEarnInfo copy$default(AutoEarnInfo autoEarnInfo, boolean z, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = autoEarnInfo.allowed;
        }
        if ((i2 & 2) != 0) {
            i = autoEarnInfo.status;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = autoEarnInfo.fundingAccountBalanceInUsdt;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = autoEarnInfo.fundingAccountValuation;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = autoEarnInfo.valuationUnit;
        }
        return autoEarnInfo.copy(z, i3, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.allowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fundingAccountBalanceInUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fundingAccountValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoEarnInfo copy(boolean z, int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AutoEarnInfo(z, i, str, str2, str3);
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
        if (!(obj instanceof AutoEarnInfo)) {
            return false;
        }
        AutoEarnInfo autoEarnInfo = (AutoEarnInfo) obj;
        return this.allowed == autoEarnInfo.allowed && this.status == autoEarnInfo.status && Intrinsics.EZpvd((Object) this.fundingAccountBalanceInUsdt, (Object) autoEarnInfo.fundingAccountBalanceInUsdt) && Intrinsics.EZpvd((Object) this.fundingAccountValuation, (Object) autoEarnInfo.fundingAccountValuation) && Intrinsics.EZpvd((Object) this.valuationUnit, (Object) autoEarnInfo.valuationUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowed() {
        return this.allowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingAccountBalanceInUsdt() {
        return this.fundingAccountBalanceInUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingAccountValuation() {
        return this.fundingAccountValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationUnit() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Boolean.hashCode(this.allowed) * 31) + Integer.hashCode(this.status)) * 31) + this.fundingAccountBalanceInUsdt.hashCode()) * 31) + this.fundingAccountValuation.hashCode()) * 31) + this.valuationUnit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AutoEarnInfo(allowed=" + this.allowed + ", status=" + this.status + ", fundingAccountBalanceInUsdt=" + this.fundingAccountBalanceInUsdt + ", fundingAccountValuation=" + this.fundingAccountValuation + ", valuationUnit=" + this.valuationUnit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.allowed ? 1 : 0);
        parcel.writeInt(this.status);
        parcel.writeString(this.fundingAccountBalanceInUsdt);
        parcel.writeString(this.fundingAccountValuation);
        parcel.writeString(this.valuationUnit);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.finance_api.bean.AutoEarnInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoEarnInfo> serializer() {
            return AutoEarnInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AutoEarnInfo(int i, boolean z, int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.allowed = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.status = 1;
        } else {
            this.status = i2;
        }
        if ((i & 4) == 0) {
            this.fundingAccountBalanceInUsdt = "";
        } else {
            this.fundingAccountBalanceInUsdt = str;
        }
        if ((i & 8) == 0) {
            this.fundingAccountValuation = "";
        } else {
            this.fundingAccountValuation = str2;
        }
        if ((i & 16) == 0) {
            this.valuationUnit = "";
        } else {
            this.valuationUnit = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(AutoEarnInfo autoEarnInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || autoEarnInfo.allowed) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, autoEarnInfo.allowed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || autoEarnInfo.status != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, autoEarnInfo.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) autoEarnInfo.fundingAccountBalanceInUsdt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, autoEarnInfo.fundingAccountBalanceInUsdt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) autoEarnInfo.fundingAccountValuation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, autoEarnInfo.fundingAccountValuation);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) autoEarnInfo.valuationUnit, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, autoEarnInfo.valuationUnit);
    }

    public AutoEarnInfo(boolean z, int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.allowed = z;
        this.status = i;
        this.fundingAccountBalanceInUsdt = str;
        this.fundingAccountValuation = str2;
        this.valuationUnit = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:int:0x000a: TERNARY null = ((wrap:int:0x0005: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r5v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
 A[MD:(boolean, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.finance_api.bean.AutoEarnInfo.<init>(boolean, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AutoEarnInfo(boolean z, int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) == 0 ? str3 : "");
    }
}
