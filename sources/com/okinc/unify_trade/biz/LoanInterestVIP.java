package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class LoanInterestVIP implements Parcelable {
    public static final int $stable = 0;
    private final String irDiscount;
    private final String level;
    private final String loanQuotaCoef;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanInterestVIP> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LoanInterestVIP> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoanInterestVIP createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LoanInterestVIP(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoanInterestVIP[] newArray(int i) {
            return new LoanInterestVIP[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LoanInterestVIP() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LoanInterestVIP copy$default(LoanInterestVIP loanInterestVIP, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loanInterestVIP.irDiscount;
        }
        if ((i & 2) != 0) {
            str2 = loanInterestVIP.loanQuotaCoef;
        }
        if ((i & 4) != 0) {
            str3 = loanInterestVIP.level;
        }
        return loanInterestVIP.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.irDiscount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.loanQuotaCoef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoanInterestVIP copy(String str, String str2, String str3) {
        return new LoanInterestVIP(str, str2, str3);
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
        if (!(obj instanceof LoanInterestVIP)) {
            return false;
        }
        LoanInterestVIP loanInterestVIP = (LoanInterestVIP) obj;
        return Intrinsics.EZpvd((Object) this.irDiscount, (Object) loanInterestVIP.irDiscount) && Intrinsics.EZpvd((Object) this.loanQuotaCoef, (Object) loanInterestVIP.loanQuotaCoef) && Intrinsics.EZpvd((Object) this.level, (Object) loanInterestVIP.level);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIrDiscount() {
        return this.irDiscount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLevel() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLoanQuotaCoef() {
        return this.loanQuotaCoef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.irDiscount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.loanQuotaCoef;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.level;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LoanInterestVIP(irDiscount=" + this.irDiscount + ", loanQuotaCoef=" + this.loanQuotaCoef + ", level=" + this.level + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.irDiscount);
        parcel.writeString(this.loanQuotaCoef);
        parcel.writeString(this.level);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.LoanInterestVIP.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LoanInterestVIP> serializer() {
            return LoanInterestVIP$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LoanInterestVIP(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.irDiscount = "";
        } else {
            this.irDiscount = str;
        }
        if ((i & 2) == 0) {
            this.loanQuotaCoef = "";
        } else {
            this.loanQuotaCoef = str2;
        }
        if ((i & 4) == 0) {
            this.level = "";
        } else {
            this.level = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(LoanInterestVIP loanInterestVIP, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) loanInterestVIP.irDiscount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, loanInterestVIP.irDiscount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) loanInterestVIP.loanQuotaCoef, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, loanInterestVIP.loanQuotaCoef);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) loanInterestVIP.level, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, loanInterestVIP.level);
    }

    public LoanInterestVIP(String str, String str2, String str3) {
        this.irDiscount = str;
        this.loanQuotaCoef = str2;
        this.level = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3579) call: com.okinc.unify_trade.biz.LoanInterestVIP.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LoanInterestVIP(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
