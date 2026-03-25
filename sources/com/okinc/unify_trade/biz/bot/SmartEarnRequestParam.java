package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.bot.SmartEarnProperties;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C55810xqv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SmartEarnRequestParam implements Parcelable, SmartEarnProperties {
    public static final String Key = "SmartEarnRequestParam";
    private final String earnMaxLimit;
    private final String earnMinLimit;
    private final String earnSupport;
    private final EarnType earnType;
    private final boolean enabled;
    private String regionDisplay;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SmartEarnRequestParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SmartEarnRequestParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartEarnRequestParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SmartEarnRequestParam(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EarnType.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartEarnRequestParam[] newArray(int i) {
            return new SmartEarnRequestParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartEarnRequestParam() {
        this(false, (String) null, (String) null, (EarnType) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SmartEarnRequestParam copy$default(SmartEarnRequestParam smartEarnRequestParam, boolean z, String str, String str2, EarnType earnType, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = smartEarnRequestParam.enabled;
        }
        if ((i & 2) != 0) {
            str = smartEarnRequestParam.earnMinLimit;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = smartEarnRequestParam.earnMaxLimit;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            earnType = smartEarnRequestParam.earnType;
        }
        EarnType earnType2 = earnType;
        if ((i & 16) != 0) {
            str3 = smartEarnRequestParam.regionDisplay;
        }
        return smartEarnRequestParam.copy(z, str4, str5, earnType2, str3);
    }

    @Serializable(with = C55810xqv.class)
    public static /* synthetic */ void getEarnType$annotations() {
    }

    @SerialName("enabled")
    public static /* synthetic */ void getEnabled$annotations() {
    }

    @Transient
    public static /* synthetic */ void getRegionDisplay$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.earnMinLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.earnMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnType component4() {
        return this.earnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.regionDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnRequestParam copy(boolean z, String str, String str2, EarnType earnType, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new SmartEarnRequestParam(z, str, str2, earnType, str3);
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
        if (!(obj instanceof SmartEarnRequestParam)) {
            return false;
        }
        SmartEarnRequestParam smartEarnRequestParam = (SmartEarnRequestParam) obj;
        return this.enabled == smartEarnRequestParam.enabled && Intrinsics.EZpvd((Object) this.earnMinLimit, (Object) smartEarnRequestParam.earnMinLimit) && Intrinsics.EZpvd((Object) this.earnMaxLimit, (Object) smartEarnRequestParam.earnMaxLimit) && this.earnType == smartEarnRequestParam.earnType && Intrinsics.EZpvd((Object) this.regionDisplay, (Object) smartEarnRequestParam.regionDisplay);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.bot.SmartEarnProperties
    public String getEarnMaxLimit() {
        return this.earnMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.bot.SmartEarnProperties
    public String getEarnMinLimit() {
        return this.earnMinLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.bot.SmartEarnProperties
    public String getEarnSupport() {
        return this.earnSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.bot.SmartEarnProperties
    public EarnType getEarnType() {
        return this.earnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.bot.SmartEarnProperties
    public boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRegionDisplay() {
        return this.regionDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled);
        String str = this.earnMinLimit;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.earnMaxLimit;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        EarnType earnType = this.earnType;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (earnType != null ? earnType.hashCode() : 0)) * 31) + this.regionDisplay.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRegionDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.regionDisplay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartEarnRequestParam(enabled=" + this.enabled + ", earnMinLimit=" + this.earnMinLimit + ", earnMaxLimit=" + this.earnMaxLimit + ", earnType=" + this.earnType + ", regionDisplay=" + this.regionDisplay + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeString(this.earnMinLimit);
        parcel.writeString(this.earnMaxLimit);
        EarnType earnType = this.earnType;
        if (earnType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earnType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.regionDisplay);
    }

    public /* synthetic */ SmartEarnRequestParam(int i, boolean z, String str, String str2, EarnType earnType, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.enabled = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.earnMinLimit = null;
        } else {
            this.earnMinLimit = str;
        }
        if ((i & 4) == 0) {
            this.earnMaxLimit = null;
        } else {
            this.earnMaxLimit = str2;
        }
        if ((i & 8) == 0) {
            this.earnType = null;
        } else {
            this.earnType = earnType;
        }
        this.regionDisplay = "";
        if ((i & 16) == 0) {
            this.earnSupport = null;
        } else {
            this.earnSupport = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SmartEarnRequestParam smartEarnRequestParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || smartEarnRequestParam.getEnabled()) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, smartEarnRequestParam.getEnabled());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || smartEarnRequestParam.getEarnMinLimit() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, smartEarnRequestParam.getEarnMinLimit());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || smartEarnRequestParam.getEarnMaxLimit() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, smartEarnRequestParam.getEarnMaxLimit());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || smartEarnRequestParam.getEarnType() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, C55810xqv.copydefault, smartEarnRequestParam.getEarnType());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && smartEarnRequestParam.getEarnSupport() == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, smartEarnRequestParam.getEarnSupport());
    }

    @Override // com.okinc.unify_trade.biz.bot.SmartEarnProperties
    public boolean getHasParametersSet() {
        return SmartEarnProperties.StateListAnimator.EZpvd(this);
    }

    public boolean isEarnSupported() {
        return SmartEarnProperties.StateListAnimator.KWHzl(this);
    }

    public SmartEarnRequestParam(boolean z, String str, String str2, EarnType earnType, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.enabled = z;
        this.earnMinLimit = str;
        this.earnMaxLimit = str2;
        this.earnType = earnType;
        this.regionDisplay = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.bot.EarnType:?: TERNARY null = ((wrap:int:0x0014: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 com.okinc.unify_trade.biz.bot.EarnType) : (null com.okinc.unify_trade.biz.bot.EarnType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.EarnType, java.lang.String):void (m)] (LINE:30) call: com.okinc.unify_trade.biz.bot.SmartEarnRequestParam.<init>(boolean, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.EarnType, java.lang.String):void type: THIS */
    public /* synthetic */ SmartEarnRequestParam(boolean z, String str, String str2, EarnType earnType, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? earnType : null, (i & 16) != 0 ? "" : str3);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.SmartEarnRequestParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SmartEarnRequestParam> serializer() {
            return SmartEarnRequestParam$$serializer.INSTANCE;
        }
    }
}
