package com.okinc.buysell.ui.transaction.convert.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
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
public final class LiteLimitCoinData implements Parcelable {
    public static final int $stable = 0;
    private final String filledAmount;
    private final String fromCoinAmount;
    private final String fromCoinFullName;
    private final String fromCoinName;
    private final String fromCoinUrl;
    private final String toCoinAmount;
    private final String toCoinFullName;
    private final String toCoinName;
    private final String toCoinUrl;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LiteLimitCoinData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LiteLimitCoinData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiteLimitCoinData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LiteLimitCoinData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiteLimitCoinData[] newArray(int i) {
            return new LiteLimitCoinData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiteLimitCoinData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromCoinUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromCoinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromCoinFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toCoinUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toCoinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.toCoinFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.toCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.filledAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiteLimitCoinData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new LiteLimitCoinData(str, str2, str3, str4, str5, str6, str7, str8, str9);
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
        if (!(obj instanceof LiteLimitCoinData)) {
            return false;
        }
        LiteLimitCoinData liteLimitCoinData = (LiteLimitCoinData) obj;
        return Intrinsics.EZpvd((Object) this.fromCoinUrl, (Object) liteLimitCoinData.fromCoinUrl) && Intrinsics.EZpvd((Object) this.fromCoinName, (Object) liteLimitCoinData.fromCoinName) && Intrinsics.EZpvd((Object) this.fromCoinFullName, (Object) liteLimitCoinData.fromCoinFullName) && Intrinsics.EZpvd((Object) this.fromCoinAmount, (Object) liteLimitCoinData.fromCoinAmount) && Intrinsics.EZpvd((Object) this.toCoinUrl, (Object) liteLimitCoinData.toCoinUrl) && Intrinsics.EZpvd((Object) this.toCoinName, (Object) liteLimitCoinData.toCoinName) && Intrinsics.EZpvd((Object) this.toCoinFullName, (Object) liteLimitCoinData.toCoinFullName) && Intrinsics.EZpvd((Object) this.toCoinAmount, (Object) liteLimitCoinData.toCoinAmount) && Intrinsics.EZpvd((Object) this.filledAmount, (Object) liteLimitCoinData.filledAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilledAmount() {
        return this.filledAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromCoinAmount() {
        return this.fromCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromCoinFullName() {
        return this.fromCoinFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromCoinName() {
        return this.fromCoinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromCoinUrl() {
        return this.fromCoinUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToCoinAmount() {
        return this.toCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToCoinFullName() {
        return this.toCoinFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToCoinName() {
        return this.toCoinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToCoinUrl() {
        return this.toCoinUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.fromCoinUrl.hashCode() * 31) + this.fromCoinName.hashCode()) * 31) + this.fromCoinFullName.hashCode()) * 31) + this.fromCoinAmount.hashCode()) * 31) + this.toCoinUrl.hashCode()) * 31) + this.toCoinName.hashCode()) * 31) + this.toCoinFullName.hashCode()) * 31) + this.toCoinAmount.hashCode()) * 31) + this.filledAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiteLimitCoinData(fromCoinUrl=" + this.fromCoinUrl + ", fromCoinName=" + this.fromCoinName + ", fromCoinFullName=" + this.fromCoinFullName + ", fromCoinAmount=" + this.fromCoinAmount + ", toCoinUrl=" + this.toCoinUrl + ", toCoinName=" + this.toCoinName + ", toCoinFullName=" + this.toCoinFullName + ", toCoinAmount=" + this.toCoinAmount + ", filledAmount=" + this.filledAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fromCoinUrl);
        parcel.writeString(this.fromCoinName);
        parcel.writeString(this.fromCoinFullName);
        parcel.writeString(this.fromCoinAmount);
        parcel.writeString(this.toCoinUrl);
        parcel.writeString(this.toCoinName);
        parcel.writeString(this.toCoinFullName);
        parcel.writeString(this.toCoinAmount);
        parcel.writeString(this.filledAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.transaction.convert.view.LiteLimitCoinData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiteLimitCoinData> serializer() {
            return LiteLimitCoinData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiteLimitCoinData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fromCoinUrl = "";
        } else {
            this.fromCoinUrl = str;
        }
        if ((i & 2) == 0) {
            this.fromCoinName = "";
        } else {
            this.fromCoinName = str2;
        }
        if ((i & 4) == 0) {
            this.fromCoinFullName = "";
        } else {
            this.fromCoinFullName = str3;
        }
        if ((i & 8) == 0) {
            this.fromCoinAmount = "";
        } else {
            this.fromCoinAmount = str4;
        }
        if ((i & 16) == 0) {
            this.toCoinUrl = "";
        } else {
            this.toCoinUrl = str5;
        }
        if ((i & 32) == 0) {
            this.toCoinName = "";
        } else {
            this.toCoinName = str6;
        }
        if ((i & 64) == 0) {
            this.toCoinFullName = "";
        } else {
            this.toCoinFullName = str7;
        }
        if ((i & 128) == 0) {
            this.toCoinAmount = "";
        } else {
            this.toCoinAmount = str8;
        }
        if ((i & 256) == 0) {
            this.filledAmount = "";
        } else {
            this.filledAmount = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_impl(LiteLimitCoinData liteLimitCoinData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) liteLimitCoinData.fromCoinUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, liteLimitCoinData.fromCoinUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) liteLimitCoinData.fromCoinName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, liteLimitCoinData.fromCoinName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) liteLimitCoinData.fromCoinFullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, liteLimitCoinData.fromCoinFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) liteLimitCoinData.fromCoinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, liteLimitCoinData.fromCoinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) liteLimitCoinData.toCoinUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, liteLimitCoinData.toCoinUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) liteLimitCoinData.toCoinName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, liteLimitCoinData.toCoinName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) liteLimitCoinData.toCoinFullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, liteLimitCoinData.toCoinFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) liteLimitCoinData.toCoinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, liteLimitCoinData.toCoinAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) liteLimitCoinData.filledAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, liteLimitCoinData.filledAmount);
    }

    public LiteLimitCoinData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.fromCoinUrl = str;
        this.fromCoinName = str2;
        this.fromCoinFullName = str3;
        this.fromCoinAmount = str4;
        this.toCoinUrl = str5;
        this.toCoinName = str6;
        this.toCoinFullName = str7;
        this.toCoinAmount = str8;
        this.filledAmount = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:80) call: com.okinc.buysell.ui.transaction.convert.view.LiteLimitCoinData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LiteLimitCoinData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "");
    }
}
