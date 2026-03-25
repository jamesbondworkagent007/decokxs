package com.okinc.buysell.api;

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
public final class QuickConvertTokenInfo implements Parcelable {
    public static final int $stable = 0;
    private final String baseAmount;
    private final String baseCurrency;
    private final String quoteAmount;
    private final String quoteCurrency;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<QuickConvertTokenInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<QuickConvertTokenInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuickConvertTokenInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new QuickConvertTokenInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuickConvertTokenInfo[] newArray(int i) {
            return new QuickConvertTokenInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuickConvertTokenInfo() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QuickConvertTokenInfo copy$default(QuickConvertTokenInfo quickConvertTokenInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quickConvertTokenInfo.baseCurrency;
        }
        if ((i & 2) != 0) {
            str2 = quickConvertTokenInfo.quoteCurrency;
        }
        if ((i & 4) != 0) {
            str3 = quickConvertTokenInfo.baseAmount;
        }
        if ((i & 8) != 0) {
            str4 = quickConvertTokenInfo.quoteAmount;
        }
        return quickConvertTokenInfo.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuickConvertTokenInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new QuickConvertTokenInfo(str, str2, str3, str4);
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
        if (!(obj instanceof QuickConvertTokenInfo)) {
            return false;
        }
        QuickConvertTokenInfo quickConvertTokenInfo = (QuickConvertTokenInfo) obj;
        return Intrinsics.EZpvd((Object) this.baseCurrency, (Object) quickConvertTokenInfo.baseCurrency) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) quickConvertTokenInfo.quoteCurrency) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) quickConvertTokenInfo.baseAmount) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) quickConvertTokenInfo.quoteAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteAmount() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.baseCurrency.hashCode() * 31) + this.quoteCurrency.hashCode()) * 31) + this.baseAmount.hashCode()) * 31) + this.quoteAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuickConvertTokenInfo(baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", baseAmount=" + this.baseAmount + ", quoteAmount=" + this.quoteAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseCurrency);
        parcel.writeString(this.quoteCurrency);
        parcel.writeString(this.baseAmount);
        parcel.writeString(this.quoteAmount);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.api.QuickConvertTokenInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QuickConvertTokenInfo> serializer() {
            return QuickConvertTokenInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QuickConvertTokenInfo(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str;
        }
        if ((i & 2) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str2;
        }
        if ((i & 4) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str3;
        }
        if ((i & 8) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_api(QuickConvertTokenInfo quickConvertTokenInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) quickConvertTokenInfo.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, quickConvertTokenInfo.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) quickConvertTokenInfo.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, quickConvertTokenInfo.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) quickConvertTokenInfo.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, quickConvertTokenInfo.baseAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) quickConvertTokenInfo.quoteAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, quickConvertTokenInfo.quoteAmount);
    }

    public QuickConvertTokenInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.baseCurrency = str;
        this.quoteCurrency = str2;
        this.baseAmount = str3;
        this.quoteAmount = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:263) call: com.okinc.buysell.api.QuickConvertTokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ QuickConvertTokenInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
