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
import o.C55810xqv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class EarnParam implements Parcelable {
    public static final int $stable = 0;
    private final String earnMaxLimit;
    private final String earnMinLimit;
    private final EarnType earnType;
    private final boolean enabled;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EarnParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EarnParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EarnParam(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EarnType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnParam[] newArray(int i) {
            return new EarnParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarnParam() {
        this((String) null, (String) null, (EarnType) null, false, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EarnParam copy$default(EarnParam earnParam, String str, String str2, EarnType earnType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earnParam.earnMaxLimit;
        }
        if ((i & 2) != 0) {
            str2 = earnParam.earnMinLimit;
        }
        if ((i & 4) != 0) {
            earnType = earnParam.earnType;
        }
        if ((i & 8) != 0) {
            z = earnParam.enabled;
        }
        return earnParam.copy(str, str2, earnType, z);
    }

    @Serializable(with = C55810xqv.class)
    public static /* synthetic */ void getEarnType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.earnMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.earnMinLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnType component3() {
        return this.earnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnParam copy(@NotNull String str, @NotNull String str2, EarnType earnType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new EarnParam(str, str2, earnType, z);
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
        if (!(obj instanceof EarnParam)) {
            return false;
        }
        EarnParam earnParam = (EarnParam) obj;
        return Intrinsics.EZpvd((Object) this.earnMaxLimit, (Object) earnParam.earnMaxLimit) && Intrinsics.EZpvd((Object) this.earnMinLimit, (Object) earnParam.earnMinLimit) && this.earnType == earnParam.earnType && this.enabled == earnParam.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnMaxLimit() {
        return this.earnMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnMinLimit() {
        return this.earnMinLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnType getEarnType() {
        return this.earnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.earnMaxLimit.hashCode();
        int iHashCode2 = this.earnMinLimit.hashCode();
        EarnType earnType = this.earnType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (earnType == null ? 0 : earnType.hashCode())) * 31) + Boolean.hashCode(this.enabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnParam(earnMaxLimit=" + this.earnMaxLimit + ", earnMinLimit=" + this.earnMinLimit + ", earnType=" + this.earnType + ", enabled=" + this.enabled + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.earnMaxLimit);
        parcel.writeString(this.earnMinLimit);
        EarnType earnType = this.earnType;
        if (earnType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earnType.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.enabled ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.EarnParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarnParam> serializer() {
            return EarnParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarnParam(int i, String str, String str2, EarnType earnType, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.earnMaxLimit = "";
        } else {
            this.earnMaxLimit = str;
        }
        if ((i & 2) == 0) {
            this.earnMinLimit = "";
        } else {
            this.earnMinLimit = str2;
        }
        if ((i & 4) == 0) {
            this.earnType = null;
        } else {
            this.earnType = earnType;
        }
        if ((i & 8) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(EarnParam earnParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) earnParam.earnMaxLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, earnParam.earnMaxLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) earnParam.earnMinLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, earnParam.earnMinLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || earnParam.earnType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, C55810xqv.copydefault, earnParam.earnType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || earnParam.enabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, earnParam.enabled);
        }
    }

    public EarnParam(@NotNull String str, @NotNull String str2, EarnType earnType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.earnMaxLimit = str;
        this.earnMinLimit = str2;
        this.earnType = earnType;
        this.enabled = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.bot.EarnType:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.EarnType) : (r4v0 com.okinc.unify_trade.biz.bot.EarnType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.EarnType, boolean):void (m)] (LINE:119) call: com.okinc.unify_trade.biz.bot.EarnParam.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.EarnType, boolean):void type: THIS */
    public /* synthetic */ EarnParam(String str, String str2, EarnType earnType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : earnType, (i & 8) != 0 ? false : z);
    }
}
