package com.okinc.okpaymentapi.data.remote.model.management;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class BankingHours implements Parcelable {
    public static final int $stable = 0;
    private final String bankingHoursEndTimeUTC;
    private final String bankingHoursStartTimeUTC;
    private final String nextAvailableBankingHoursEndTimeUTC;
    private final String nextAvailableBankingHoursStartTimeUTC;
    private final boolean withinBankingHours;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BankingHours> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BankingHours> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankingHours createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BankingHours(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankingHours[] newArray(int i) {
            return new BankingHours[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BankingHours() {
        this(false, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BankingHours copy$default(BankingHours bankingHours, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bankingHours.withinBankingHours;
        }
        if ((i & 2) != 0) {
            str = bankingHours.bankingHoursStartTimeUTC;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = bankingHours.bankingHoursEndTimeUTC;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = bankingHours.nextAvailableBankingHoursStartTimeUTC;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = bankingHours.nextAvailableBankingHoursEndTimeUTC;
        }
        return bankingHours.copy(z, str5, str6, str7, str4);
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
    public final BankingHours copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new BankingHours(z, str, str2, str3, str4);
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
        if (!(obj instanceof BankingHours)) {
            return false;
        }
        BankingHours bankingHours = (BankingHours) obj;
        return this.withinBankingHours == bankingHours.withinBankingHours && Intrinsics.EZpvd((Object) this.bankingHoursStartTimeUTC, (Object) bankingHours.bankingHoursStartTimeUTC) && Intrinsics.EZpvd((Object) this.bankingHoursEndTimeUTC, (Object) bankingHours.bankingHoursEndTimeUTC) && Intrinsics.EZpvd((Object) this.nextAvailableBankingHoursStartTimeUTC, (Object) bankingHours.nextAvailableBankingHoursStartTimeUTC) && Intrinsics.EZpvd((Object) this.nextAvailableBankingHoursEndTimeUTC, (Object) bankingHours.nextAvailableBankingHoursEndTimeUTC);
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
        return "BankingHours(withinBankingHours=" + this.withinBankingHours + ", bankingHoursStartTimeUTC=" + this.bankingHoursStartTimeUTC + ", bankingHoursEndTimeUTC=" + this.bankingHoursEndTimeUTC + ", nextAvailableBankingHoursStartTimeUTC=" + this.nextAvailableBankingHoursStartTimeUTC + ", nextAvailableBankingHoursEndTimeUTC=" + this.nextAvailableBankingHoursEndTimeUTC + ")";
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

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.BankingHours.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BankingHours> serializer() {
            return BankingHours$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BankingHours(int i, boolean z, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
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

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(BankingHours bankingHours, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bankingHours.withinBankingHours) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, bankingHours.withinBankingHours);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) bankingHours.bankingHoursStartTimeUTC, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, bankingHours.bankingHoursStartTimeUTC);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) bankingHours.bankingHoursEndTimeUTC, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, bankingHours.bankingHoursEndTimeUTC);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) bankingHours.nextAvailableBankingHoursStartTimeUTC, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, bankingHours.nextAvailableBankingHoursStartTimeUTC);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) bankingHours.nextAvailableBankingHoursEndTimeUTC, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, bankingHours.nextAvailableBankingHoursEndTimeUTC);
    }

    public BankingHours(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
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
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:321) call: com.okinc.okpaymentapi.data.remote.model.management.BankingHours.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BankingHours(boolean z, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "");
    }
}
