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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class LocalizationHighlightStyle implements Parcelable {
    public static final int $stable = 0;
    private final String dailyLimitRemainingForDisplay;
    private final String feeRateForDisplay;
    private final String limitForDisplay;
    private final String processingTimeForDisplay;
    private final String singleTransactionLimitForDisplay;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LocalizationHighlightStyle> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LocalizationHighlightStyle> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalizationHighlightStyle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LocalizationHighlightStyle(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalizationHighlightStyle[] newArray(int i) {
            return new LocalizationHighlightStyle[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LocalizationHighlightStyle() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LocalizationHighlightStyle copy$default(LocalizationHighlightStyle localizationHighlightStyle, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localizationHighlightStyle.processingTimeForDisplay;
        }
        if ((i & 2) != 0) {
            str2 = localizationHighlightStyle.feeRateForDisplay;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = localizationHighlightStyle.limitForDisplay;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = localizationHighlightStyle.dailyLimitRemainingForDisplay;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = localizationHighlightStyle.singleTransactionLimitForDisplay;
        }
        return localizationHighlightStyle.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.processingTimeForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feeRateForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.limitForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.dailyLimitRemainingForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.singleTransactionLimitForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizationHighlightStyle copy(String str, String str2, String str3, String str4, String str5) {
        return new LocalizationHighlightStyle(str, str2, str3, str4, str5);
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
        if (!(obj instanceof LocalizationHighlightStyle)) {
            return false;
        }
        LocalizationHighlightStyle localizationHighlightStyle = (LocalizationHighlightStyle) obj;
        return Intrinsics.EZpvd((Object) this.processingTimeForDisplay, (Object) localizationHighlightStyle.processingTimeForDisplay) && Intrinsics.EZpvd((Object) this.feeRateForDisplay, (Object) localizationHighlightStyle.feeRateForDisplay) && Intrinsics.EZpvd((Object) this.limitForDisplay, (Object) localizationHighlightStyle.limitForDisplay) && Intrinsics.EZpvd((Object) this.dailyLimitRemainingForDisplay, (Object) localizationHighlightStyle.dailyLimitRemainingForDisplay) && Intrinsics.EZpvd((Object) this.singleTransactionLimitForDisplay, (Object) localizationHighlightStyle.singleTransactionLimitForDisplay);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDailyLimitRemainingForDisplay() {
        return this.dailyLimitRemainingForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRateForDisplay() {
        return this.feeRateForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitForDisplay() {
        return this.limitForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProcessingTimeForDisplay() {
        return this.processingTimeForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSingleTransactionLimitForDisplay() {
        return this.singleTransactionLimitForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.processingTimeForDisplay;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.feeRateForDisplay;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.limitForDisplay;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.dailyLimitRemainingForDisplay;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.singleTransactionLimitForDisplay;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LocalizationHighlightStyle(processingTimeForDisplay=" + this.processingTimeForDisplay + ", feeRateForDisplay=" + this.feeRateForDisplay + ", limitForDisplay=" + this.limitForDisplay + ", dailyLimitRemainingForDisplay=" + this.dailyLimitRemainingForDisplay + ", singleTransactionLimitForDisplay=" + this.singleTransactionLimitForDisplay + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.processingTimeForDisplay);
        parcel.writeString(this.feeRateForDisplay);
        parcel.writeString(this.limitForDisplay);
        parcel.writeString(this.dailyLimitRemainingForDisplay);
        parcel.writeString(this.singleTransactionLimitForDisplay);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.LocalizationHighlightStyle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LocalizationHighlightStyle> serializer() {
            return LocalizationHighlightStyle$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LocalizationHighlightStyle(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.processingTimeForDisplay = null;
        } else {
            this.processingTimeForDisplay = str;
        }
        if ((i & 2) == 0) {
            this.feeRateForDisplay = null;
        } else {
            this.feeRateForDisplay = str2;
        }
        if ((i & 4) == 0) {
            this.limitForDisplay = null;
        } else {
            this.limitForDisplay = str3;
        }
        if ((i & 8) == 0) {
            this.dailyLimitRemainingForDisplay = null;
        } else {
            this.dailyLimitRemainingForDisplay = str4;
        }
        if ((i & 16) == 0) {
            this.singleTransactionLimitForDisplay = null;
        } else {
            this.singleTransactionLimitForDisplay = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(LocalizationHighlightStyle localizationHighlightStyle, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || localizationHighlightStyle.processingTimeForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, localizationHighlightStyle.processingTimeForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || localizationHighlightStyle.feeRateForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, localizationHighlightStyle.feeRateForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || localizationHighlightStyle.limitForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, localizationHighlightStyle.limitForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || localizationHighlightStyle.dailyLimitRemainingForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, localizationHighlightStyle.dailyLimitRemainingForDisplay);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && localizationHighlightStyle.singleTransactionLimitForDisplay == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, localizationHighlightStyle.singleTransactionLimitForDisplay);
    }

    public LocalizationHighlightStyle(String str, String str2, String str3, String str4, String str5) {
        this.processingTimeForDisplay = str;
        this.feeRateForDisplay = str2;
        this.limitForDisplay = str3;
        this.dailyLimitRemainingForDisplay = str4;
        this.singleTransactionLimitForDisplay = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:381) call: com.okinc.okpaymentapi.data.remote.model.management.LocalizationHighlightStyle.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LocalizationHighlightStyle(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
