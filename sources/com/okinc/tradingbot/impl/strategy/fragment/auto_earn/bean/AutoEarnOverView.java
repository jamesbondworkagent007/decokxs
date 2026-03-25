package com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AutoEarnOverView implements Parcelable {
    public static final int $stable = 0;
    private final String apr;
    private final String autoLendAmount;
    private final String ccy;
    private final boolean isFullQuota;
    private final String matchedAmount;
    private final String matchedSimpleEarnAmount;
    private final String simpleEarnAmount;
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AutoEarnOverView> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AutoEarnOverView> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoEarnOverView createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AutoEarnOverView(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoEarnOverView[] newArray(int i) {
            return new AutoEarnOverView[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AutoEarnOverView() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.matchedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.autoLendAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.matchedSimpleEarnAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.simpleEarnAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isFullQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoEarnOverView copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new AutoEarnOverView(str, str2, str3, str4, str5, str6, str7, z);
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
        if (!(obj instanceof AutoEarnOverView)) {
            return false;
        }
        AutoEarnOverView autoEarnOverView = (AutoEarnOverView) obj;
        return Intrinsics.EZpvd((Object) this.apr, (Object) autoEarnOverView.apr) && Intrinsics.EZpvd((Object) this.matchedAmount, (Object) autoEarnOverView.matchedAmount) && Intrinsics.EZpvd((Object) this.autoLendAmount, (Object) autoEarnOverView.autoLendAmount) && Intrinsics.EZpvd((Object) this.matchedSimpleEarnAmount, (Object) autoEarnOverView.matchedSimpleEarnAmount) && Intrinsics.EZpvd((Object) this.simpleEarnAmount, (Object) autoEarnOverView.simpleEarnAmount) && Intrinsics.EZpvd((Object) this.ccy, (Object) autoEarnOverView.ccy) && Intrinsics.EZpvd((Object) this.status, (Object) autoEarnOverView.status) && this.isFullQuota == autoEarnOverView.isFullQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApr() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoLendAmount() {
        return this.autoLendAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMatchedAmount() {
        return this.matchedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMatchedSimpleEarnAmount() {
        return this.matchedSimpleEarnAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSimpleEarnAmount() {
        return this.simpleEarnAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.apr.hashCode() * 31) + this.matchedAmount.hashCode()) * 31) + this.autoLendAmount.hashCode()) * 31) + this.matchedSimpleEarnAmount.hashCode()) * 31) + this.simpleEarnAmount.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.isFullQuota);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFullQuota() {
        return this.isFullQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AutoEarnOverView(apr=" + this.apr + ", matchedAmount=" + this.matchedAmount + ", autoLendAmount=" + this.autoLendAmount + ", matchedSimpleEarnAmount=" + this.matchedSimpleEarnAmount + ", simpleEarnAmount=" + this.simpleEarnAmount + ", ccy=" + this.ccy + ", status=" + this.status + ", isFullQuota=" + this.isFullQuota + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.apr);
        parcel.writeString(this.matchedAmount);
        parcel.writeString(this.autoLendAmount);
        parcel.writeString(this.matchedSimpleEarnAmount);
        parcel.writeString(this.simpleEarnAmount);
        parcel.writeString(this.ccy);
        parcel.writeString(this.status);
        parcel.writeInt(this.isFullQuota ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnOverView.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoEarnOverView> serializer() {
            return AutoEarnOverView$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AutoEarnOverView(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.apr = "";
        } else {
            this.apr = str;
        }
        if ((i & 2) == 0) {
            this.matchedAmount = "";
        } else {
            this.matchedAmount = str2;
        }
        if ((i & 4) == 0) {
            this.autoLendAmount = "";
        } else {
            this.autoLendAmount = str3;
        }
        if ((i & 8) == 0) {
            this.matchedSimpleEarnAmount = "";
        } else {
            this.matchedSimpleEarnAmount = str4;
        }
        if ((i & 16) == 0) {
            this.simpleEarnAmount = "";
        } else {
            this.simpleEarnAmount = str5;
        }
        if ((i & 32) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str6;
        }
        if ((i & 64) == 0) {
            this.status = "";
        } else {
            this.status = str7;
        }
        if ((i & 128) == 0) {
            this.isFullQuota = false;
        } else {
            this.isFullQuota = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(AutoEarnOverView autoEarnOverView, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) autoEarnOverView.apr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, autoEarnOverView.apr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) autoEarnOverView.matchedAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, autoEarnOverView.matchedAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) autoEarnOverView.autoLendAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, autoEarnOverView.autoLendAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) autoEarnOverView.matchedSimpleEarnAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, autoEarnOverView.matchedSimpleEarnAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) autoEarnOverView.simpleEarnAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, autoEarnOverView.simpleEarnAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) autoEarnOverView.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, autoEarnOverView.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) autoEarnOverView.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, autoEarnOverView.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || autoEarnOverView.isFullQuota) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, autoEarnOverView.isFullQuota);
        }
    }

    public AutoEarnOverView(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.apr = str;
        this.matchedAmount = str2;
        this.autoLendAmount = str3;
        this.matchedSimpleEarnAmount = str4;
        this.simpleEarnAmount = str5;
        this.ccy = str6;
        this.status = str7;
        this.isFullQuota = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r16v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:12) call: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnOverView.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ AutoEarnOverView(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? false : z);
    }
}
