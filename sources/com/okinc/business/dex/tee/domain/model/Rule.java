package com.okinc.business.dex.tee.domain.model;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class Rule implements Parcelable {
    public static final int $stable = 0;
    private final String exChangeRate;
    private final String fromAmount;
    private final String fromTokenAddress;
    private final String toAmount;
    private final String toTokenAddress;
    private final String triggerMarketCapacity;
    private final String triggerPrice;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Rule> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Rule> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Rule createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Rule(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Rule[] newArray(int i) {
            return new Rule[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Rule() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Rule copy$default(Rule rule, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rule.fromTokenAddress;
        }
        if ((i & 2) != 0) {
            str2 = rule.toTokenAddress;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = rule.fromAmount;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = rule.toAmount;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = rule.exChangeRate;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = rule.triggerPrice;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = rule.triggerMarketCapacity;
        }
        return rule.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.exChangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.triggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.triggerMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rule copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new Rule(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof Rule)) {
            return false;
        }
        Rule rule = (Rule) obj;
        return Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) rule.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) rule.toTokenAddress) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) rule.fromAmount) && Intrinsics.EZpvd((Object) this.toAmount, (Object) rule.toAmount) && Intrinsics.EZpvd((Object) this.exChangeRate, (Object) rule.exChangeRate) && Intrinsics.EZpvd((Object) this.triggerPrice, (Object) rule.triggerPrice) && Intrinsics.EZpvd((Object) this.triggerMarketCapacity, (Object) rule.triggerMarketCapacity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExChangeRate() {
        return this.exChangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerMarketCapacity() {
        return this.triggerMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPrice() {
        return this.triggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fromTokenAddress.hashCode();
        int iHashCode2 = this.toTokenAddress.hashCode();
        int iHashCode3 = this.fromAmount.hashCode();
        int iHashCode4 = this.toAmount.hashCode();
        int iHashCode5 = this.exChangeRate.hashCode();
        String str = this.triggerPrice;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.triggerMarketCapacity;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Rule(fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", fromAmount=" + this.fromAmount + ", toAmount=" + this.toAmount + ", exChangeRate=" + this.exChangeRate + ", triggerPrice=" + this.triggerPrice + ", triggerMarketCapacity=" + this.triggerMarketCapacity + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fromTokenAddress);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.fromAmount);
        parcel.writeString(this.toAmount);
        parcel.writeString(this.exChangeRate);
        parcel.writeString(this.triggerPrice);
        parcel.writeString(this.triggerMarketCapacity);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.Rule.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Rule> serializer() {
            return Rule$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Rule(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fromTokenAddress = "";
        } else {
            this.fromTokenAddress = str;
        }
        if ((i & 2) == 0) {
            this.toTokenAddress = "";
        } else {
            this.toTokenAddress = str2;
        }
        if ((i & 4) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str3;
        }
        if ((i & 8) == 0) {
            this.toAmount = "";
        } else {
            this.toAmount = str4;
        }
        if ((i & 16) == 0) {
            this.exChangeRate = "";
        } else {
            this.exChangeRate = str5;
        }
        if ((i & 32) == 0) {
            this.triggerPrice = null;
        } else {
            this.triggerPrice = str6;
        }
        if ((i & 64) == 0) {
            this.triggerMarketCapacity = null;
        } else {
            this.triggerMarketCapacity = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(Rule rule, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rule.fromTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rule.fromTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) rule.toTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rule.toTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) rule.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, rule.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) rule.toAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, rule.toAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) rule.exChangeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, rule.exChangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || rule.triggerPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, rule.triggerPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && rule.triggerMarketCapacity == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, rule.triggerMarketCapacity);
    }

    public Rule(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.fromTokenAddress = str;
        this.toTokenAddress = str2;
        this.fromAmount = str3;
        this.toAmount = str4;
        this.exChangeRate = str5;
        this.triggerPrice = str6;
        this.triggerMarketCapacity = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:37) call: com.okinc.business.dex.tee.domain.model.Rule.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Rule(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
