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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ArbInvestDetailsItems implements Parcelable {
    public static final int $stable = 0;
    private final String amt;
    private final String instType;
    private final String lever;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ArbInvestDetailsItems> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ArbInvestDetailsItems> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbInvestDetailsItems createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ArbInvestDetailsItems(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbInvestDetailsItems[] newArray(int i) {
            return new ArbInvestDetailsItems[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArbInvestDetailsItems() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ArbInvestDetailsItems copy$default(ArbInvestDetailsItems arbInvestDetailsItems, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = arbInvestDetailsItems.instType;
        }
        if ((i & 2) != 0) {
            str2 = arbInvestDetailsItems.amt;
        }
        if ((i & 4) != 0) {
            str3 = arbInvestDetailsItems.lever;
        }
        return arbInvestDetailsItems.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbInvestDetailsItems copy(String str, String str2, String str3) {
        return new ArbInvestDetailsItems(str, str2, str3);
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
        if (!(obj instanceof ArbInvestDetailsItems)) {
            return false;
        }
        ArbInvestDetailsItems arbInvestDetailsItems = (ArbInvestDetailsItems) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) arbInvestDetailsItems.instType) && Intrinsics.EZpvd((Object) this.amt, (Object) arbInvestDetailsItems.amt) && Intrinsics.EZpvd((Object) this.lever, (Object) arbInvestDetailsItems.lever);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmt() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.amt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.lever;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArbInvestDetailsItems(instType=" + this.instType + ", amt=" + this.amt + ", lever=" + this.lever + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instType);
        parcel.writeString(this.amt);
        parcel.writeString(this.lever);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ArbInvestDetailsItems.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbInvestDetailsItems> serializer() {
            return ArbInvestDetailsItems$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArbInvestDetailsItems(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = null;
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.amt = null;
        } else {
            this.amt = str2;
        }
        if ((i & 4) == 0) {
            this.lever = null;
        } else {
            this.lever = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ArbInvestDetailsItems arbInvestDetailsItems, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || arbInvestDetailsItems.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, arbInvestDetailsItems.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || arbInvestDetailsItems.amt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, arbInvestDetailsItems.amt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && arbInvestDetailsItems.lever == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, arbInvestDetailsItems.lever);
    }

    public ArbInvestDetailsItems(String str, String str2, String str3) {
        this.instType = str;
        this.amt = str2;
        this.lever = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4560) call: com.okinc.unify_trade.biz.ArbInvestDetailsItems.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ArbInvestDetailsItems(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
