package com.okinc.crcore.coreapi.net.responsebean.bsc;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class BankingHoursResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final String bankingHoursEndTimeUTC;
    private final String bankingHoursStartTimeUTC;
    private final String nextAvailableBankingHoursEndTimeUTC;
    private final String nextAvailableBankingHoursStartTimeUTC;
    private final boolean withinBankingHours;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BankingHoursResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<BankingHoursResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankingHoursResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BankingHoursResponseBean(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankingHoursResponseBean[] newArray(int i) {
            return new BankingHoursResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BankingHoursResponseBean() {
        this(false, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BankingHoursResponseBean copy$default(BankingHoursResponseBean bankingHoursResponseBean, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bankingHoursResponseBean.withinBankingHours;
        }
        if ((i & 2) != 0) {
            str = bankingHoursResponseBean.bankingHoursStartTimeUTC;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = bankingHoursResponseBean.bankingHoursEndTimeUTC;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = bankingHoursResponseBean.nextAvailableBankingHoursStartTimeUTC;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = bankingHoursResponseBean.nextAvailableBankingHoursEndTimeUTC;
        }
        return bankingHoursResponseBean.copy(z, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.withinBankingHours;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bankingHoursStartTimeUTC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bankingHoursEndTimeUTC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nextAvailableBankingHoursStartTimeUTC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nextAvailableBankingHoursEndTimeUTC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BankingHoursResponseBean copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new BankingHoursResponseBean(z, str, str2, str3, str4);
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
        if (!(obj instanceof BankingHoursResponseBean)) {
            return false;
        }
        BankingHoursResponseBean bankingHoursResponseBean = (BankingHoursResponseBean) obj;
        return this.withinBankingHours == bankingHoursResponseBean.withinBankingHours && Intrinsics.EZpvd((Object) this.bankingHoursStartTimeUTC, (Object) bankingHoursResponseBean.bankingHoursStartTimeUTC) && Intrinsics.EZpvd((Object) this.bankingHoursEndTimeUTC, (Object) bankingHoursResponseBean.bankingHoursEndTimeUTC) && Intrinsics.EZpvd((Object) this.nextAvailableBankingHoursStartTimeUTC, (Object) bankingHoursResponseBean.nextAvailableBankingHoursStartTimeUTC) && Intrinsics.EZpvd((Object) this.nextAvailableBankingHoursEndTimeUTC, (Object) bankingHoursResponseBean.nextAvailableBankingHoursEndTimeUTC);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankingHoursEndTimeUTC() {
        return this.bankingHoursEndTimeUTC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankingHoursStartTimeUTC() {
        return this.bankingHoursStartTimeUTC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextAvailableBankingHoursEndTimeUTC() {
        return this.nextAvailableBankingHoursEndTimeUTC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextAvailableBankingHoursStartTimeUTC() {
        return this.nextAvailableBankingHoursStartTimeUTC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getWithinBankingHours() {
        return this.withinBankingHours;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Boolean.hashCode(this.withinBankingHours) * 31) + this.bankingHoursStartTimeUTC.hashCode()) * 31) + this.bankingHoursEndTimeUTC.hashCode()) * 31) + this.nextAvailableBankingHoursStartTimeUTC.hashCode()) * 31) + this.nextAvailableBankingHoursEndTimeUTC.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BankingHoursResponseBean(withinBankingHours=" + this.withinBankingHours + ", bankingHoursStartTimeUTC=" + this.bankingHoursStartTimeUTC + ", bankingHoursEndTimeUTC=" + this.bankingHoursEndTimeUTC + ", nextAvailableBankingHoursStartTimeUTC=" + this.nextAvailableBankingHoursStartTimeUTC + ", nextAvailableBankingHoursEndTimeUTC=" + this.nextAvailableBankingHoursEndTimeUTC + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.withinBankingHours ? 1 : 0);
        parcel.writeString(this.bankingHoursStartTimeUTC);
        parcel.writeString(this.bankingHoursEndTimeUTC);
        parcel.writeString(this.nextAvailableBankingHoursStartTimeUTC);
        parcel.writeString(this.nextAvailableBankingHoursEndTimeUTC);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.BankingHoursResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BankingHoursResponseBean> serializer() {
            return BankingHoursResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BankingHoursResponseBean(int i, boolean z, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        this.withinBankingHours = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.bankingHoursStartTimeUTC = "";
        } else {
            this.bankingHoursStartTimeUTC = str;
        }
        if ((i & 4) == 0) {
            this.bankingHoursEndTimeUTC = "";
        } else {
            this.bankingHoursEndTimeUTC = str2;
        }
        if ((i & 8) == 0) {
            this.nextAvailableBankingHoursStartTimeUTC = "";
        } else {
            this.nextAvailableBankingHoursStartTimeUTC = str3;
        }
        if ((i & 16) == 0) {
            this.nextAvailableBankingHoursEndTimeUTC = "";
        } else {
            this.nextAvailableBankingHoursEndTimeUTC = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(BankingHoursResponseBean bankingHoursResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bankingHoursResponseBean.withinBankingHours) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, bankingHoursResponseBean.withinBankingHours);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) bankingHoursResponseBean.bankingHoursStartTimeUTC, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, bankingHoursResponseBean.bankingHoursStartTimeUTC);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) bankingHoursResponseBean.bankingHoursEndTimeUTC, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, bankingHoursResponseBean.bankingHoursEndTimeUTC);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) bankingHoursResponseBean.nextAvailableBankingHoursStartTimeUTC, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, bankingHoursResponseBean.nextAvailableBankingHoursStartTimeUTC);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) bankingHoursResponseBean.nextAvailableBankingHoursEndTimeUTC, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, bankingHoursResponseBean.nextAvailableBankingHoursEndTimeUTC);
    }

    public BankingHoursResponseBean(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.withinBankingHours = z;
        this.bankingHoursStartTimeUTC = str;
        this.bankingHoursEndTimeUTC = str2;
        this.nextAvailableBankingHoursStartTimeUTC = str3;
        this.nextAvailableBankingHoursEndTimeUTC = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.BankingHoursResponseBean.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BankingHoursResponseBean(boolean z, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "");
    }
}
