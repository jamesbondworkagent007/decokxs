package com.okinc.business.dex.trade.core.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class QuoteExt implements Parcelable {
    public static final int $stable = 0;
    private final String approveAmount;
    private final Boolean needApproveTxInfo;
    private final String refCode;
    private final String referralCommissionJsVersion;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<QuoteExt> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<QuoteExt> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuoteExt createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new QuoteExt(string, string2, boolValueOf, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuoteExt[] newArray(int i) {
            return new QuoteExt[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuoteExt() {
        this((String) null, (String) null, (Boolean) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QuoteExt copy$default(QuoteExt quoteExt, String str, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quoteExt.refCode;
        }
        if ((i & 2) != 0) {
            str2 = quoteExt.referralCommissionJsVersion;
        }
        if ((i & 4) != 0) {
            bool = quoteExt.needApproveTxInfo;
        }
        if ((i & 8) != 0) {
            str3 = quoteExt.approveAmount;
        }
        return quoteExt.copy(str, str2, bool, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.referralCommissionJsVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.needApproveTxInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.approveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteExt copy(String str, String str2, Boolean bool, String str3) {
        return new QuoteExt(str, str2, bool, str3);
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
        if (!(obj instanceof QuoteExt)) {
            return false;
        }
        QuoteExt quoteExt = (QuoteExt) obj;
        return Intrinsics.EZpvd((Object) this.refCode, (Object) quoteExt.refCode) && Intrinsics.EZpvd((Object) this.referralCommissionJsVersion, (Object) quoteExt.referralCommissionJsVersion) && Intrinsics.EZpvd(this.needApproveTxInfo, quoteExt.needApproveTxInfo) && Intrinsics.EZpvd((Object) this.approveAmount, (Object) quoteExt.approveAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApproveAmount() {
        return this.approveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedApproveTxInfo() {
        return this.needApproveTxInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefCode() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferralCommissionJsVersion() {
        return this.referralCommissionJsVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.refCode;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.referralCommissionJsVersion;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.needApproveTxInfo;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str3 = this.approveAmount;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuoteExt(refCode=" + this.refCode + ", referralCommissionJsVersion=" + this.referralCommissionJsVersion + ", needApproveTxInfo=" + this.needApproveTxInfo + ", approveAmount=" + this.approveAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.refCode);
        parcel.writeString(this.referralCommissionJsVersion);
        Boolean bool = this.needApproveTxInfo;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.approveAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.common.QuoteExt.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QuoteExt> serializer() {
            return QuoteExt$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QuoteExt(int i, String str, String str2, Boolean bool, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.refCode = null;
        } else {
            this.refCode = str;
        }
        if ((i & 2) == 0) {
            this.referralCommissionJsVersion = null;
        } else {
            this.referralCommissionJsVersion = str2;
        }
        if ((i & 4) == 0) {
            this.needApproveTxInfo = null;
        } else {
            this.needApproveTxInfo = bool;
        }
        if ((i & 8) == 0) {
            this.approveAmount = null;
        } else {
            this.approveAmount = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(QuoteExt quoteExt, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || quoteExt.refCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, quoteExt.refCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || quoteExt.referralCommissionJsVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, quoteExt.referralCommissionJsVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || quoteExt.needApproveTxInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, quoteExt.needApproveTxInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && quoteExt.approveAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, quoteExt.approveAmount);
    }

    public QuoteExt(String str, String str2, Boolean bool, String str3) {
        this.refCode = str;
        this.referralCommissionJsVersion = str2;
        this.needApproveTxInfo = bool;
        this.approveAmount = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:128) call: com.okinc.business.dex.trade.core.domain.model.common.QuoteExt.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ QuoteExt(String str, String str2, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3);
    }
}
