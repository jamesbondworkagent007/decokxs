package com.okinc.unify_trade.biz.bot;

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AutoEarnStakingConfig implements Parcelable {
    public static final int $stable = 0;
    private final String apr;
    private final String autoLendAmount;
    private final String ccy;
    private final boolean hasLimit;
    private final String limitQuota;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AutoEarnStakingConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AutoEarnStakingConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoEarnStakingConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AutoEarnStakingConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoEarnStakingConfig[] newArray(int i) {
            return new AutoEarnStakingConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AutoEarnStakingConfig() {
        this((String) null, (String) null, (String) null, (String) null, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AutoEarnStakingConfig copy$default(AutoEarnStakingConfig autoEarnStakingConfig, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoEarnStakingConfig.autoLendAmount;
        }
        if ((i & 2) != 0) {
            str2 = autoEarnStakingConfig.limitQuota;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = autoEarnStakingConfig.apr;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = autoEarnStakingConfig.ccy;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = autoEarnStakingConfig.hasLimit;
        }
        return autoEarnStakingConfig.copy(str, str5, str6, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.autoLendAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.limitQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.hasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoEarnStakingConfig copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AutoEarnStakingConfig(str, str2, str3, str4, z);
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
        if (!(obj instanceof AutoEarnStakingConfig)) {
            return false;
        }
        AutoEarnStakingConfig autoEarnStakingConfig = (AutoEarnStakingConfig) obj;
        return Intrinsics.EZpvd((Object) this.autoLendAmount, (Object) autoEarnStakingConfig.autoLendAmount) && Intrinsics.EZpvd((Object) this.limitQuota, (Object) autoEarnStakingConfig.limitQuota) && Intrinsics.EZpvd((Object) this.apr, (Object) autoEarnStakingConfig.apr) && Intrinsics.EZpvd((Object) this.ccy, (Object) autoEarnStakingConfig.ccy) && this.hasLimit == autoEarnStakingConfig.hasLimit;
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
    public final boolean getHasLimit() {
        return this.hasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitQuota() {
        return this.limitQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.autoLendAmount.hashCode() * 31) + this.limitQuota.hashCode()) * 31) + this.apr.hashCode()) * 31) + this.ccy.hashCode()) * 31) + Boolean.hashCode(this.hasLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AutoEarnStakingConfig(autoLendAmount=" + this.autoLendAmount + ", limitQuota=" + this.limitQuota + ", apr=" + this.apr + ", ccy=" + this.ccy + ", hasLimit=" + this.hasLimit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.autoLendAmount);
        parcel.writeString(this.limitQuota);
        parcel.writeString(this.apr);
        parcel.writeString(this.ccy);
        parcel.writeInt(this.hasLimit ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoEarnStakingConfig> serializer() {
            return AutoEarnStakingConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AutoEarnStakingConfig(int i, String str, String str2, String str3, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.autoLendAmount = "";
        } else {
            this.autoLendAmount = str;
        }
        if ((i & 2) == 0) {
            this.limitQuota = "";
        } else {
            this.limitQuota = str2;
        }
        if ((i & 4) == 0) {
            this.apr = "";
        } else {
            this.apr = str3;
        }
        if ((i & 8) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str4;
        }
        if ((i & 16) == 0) {
            this.hasLimit = false;
        } else {
            this.hasLimit = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AutoEarnStakingConfig autoEarnStakingConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) autoEarnStakingConfig.autoLendAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, autoEarnStakingConfig.autoLendAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) autoEarnStakingConfig.limitQuota, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, autoEarnStakingConfig.limitQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) autoEarnStakingConfig.apr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, autoEarnStakingConfig.apr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) autoEarnStakingConfig.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, autoEarnStakingConfig.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || autoEarnStakingConfig.hasLimit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, autoEarnStakingConfig.hasLimit);
        }
    }

    public AutoEarnStakingConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.autoLendAmount = str;
        this.limitQuota = str2;
        this.apr = str3;
        this.ccy = str4;
        this.hasLimit = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:127) call: com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ AutoEarnStakingConfig(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? false : z);
    }
}
