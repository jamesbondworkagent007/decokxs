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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class DeltaNeutralConfig implements Parcelable {
    public static final int $stable = 0;
    private final String enterDeltaReduceLeverage;
    private final String enterTransferOutLeverage;
    private final String escapeDeltaReduceLeverage;
    private final String escapeTransferOutLeverage;
    private final String orderCancelDeltaLimit;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DeltaNeutralConfig> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<DeltaNeutralConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeltaNeutralConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DeltaNeutralConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeltaNeutralConfig[] newArray(int i) {
            return new DeltaNeutralConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeltaNeutralConfig() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeltaNeutralConfig copy$default(DeltaNeutralConfig deltaNeutralConfig, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deltaNeutralConfig.enterTransferOutLeverage;
        }
        if ((i & 2) != 0) {
            str2 = deltaNeutralConfig.enterDeltaReduceLeverage;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = deltaNeutralConfig.orderCancelDeltaLimit;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = deltaNeutralConfig.escapeTransferOutLeverage;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = deltaNeutralConfig.escapeDeltaReduceLeverage;
        }
        return deltaNeutralConfig.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.enterTransferOutLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.enterDeltaReduceLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.orderCancelDeltaLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.escapeTransferOutLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.escapeDeltaReduceLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeltaNeutralConfig copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new DeltaNeutralConfig(str, str2, str3, str4, str5);
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
        if (!(obj instanceof DeltaNeutralConfig)) {
            return false;
        }
        DeltaNeutralConfig deltaNeutralConfig = (DeltaNeutralConfig) obj;
        return Intrinsics.EZpvd((Object) this.enterTransferOutLeverage, (Object) deltaNeutralConfig.enterTransferOutLeverage) && Intrinsics.EZpvd((Object) this.enterDeltaReduceLeverage, (Object) deltaNeutralConfig.enterDeltaReduceLeverage) && Intrinsics.EZpvd((Object) this.orderCancelDeltaLimit, (Object) deltaNeutralConfig.orderCancelDeltaLimit) && Intrinsics.EZpvd((Object) this.escapeTransferOutLeverage, (Object) deltaNeutralConfig.escapeTransferOutLeverage) && Intrinsics.EZpvd((Object) this.escapeDeltaReduceLeverage, (Object) deltaNeutralConfig.escapeDeltaReduceLeverage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnterDeltaReduceLeverage() {
        return this.enterDeltaReduceLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnterTransferOutLeverage() {
        return this.enterTransferOutLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEscapeDeltaReduceLeverage() {
        return this.escapeDeltaReduceLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEscapeTransferOutLeverage() {
        return this.escapeTransferOutLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderCancelDeltaLimit() {
        return this.orderCancelDeltaLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.enterTransferOutLeverage.hashCode() * 31) + this.enterDeltaReduceLeverage.hashCode()) * 31) + this.orderCancelDeltaLimit.hashCode()) * 31) + this.escapeTransferOutLeverage.hashCode()) * 31) + this.escapeDeltaReduceLeverage.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeltaNeutralConfig(enterTransferOutLeverage=" + this.enterTransferOutLeverage + ", enterDeltaReduceLeverage=" + this.enterDeltaReduceLeverage + ", orderCancelDeltaLimit=" + this.orderCancelDeltaLimit + ", escapeTransferOutLeverage=" + this.escapeTransferOutLeverage + ", escapeDeltaReduceLeverage=" + this.escapeDeltaReduceLeverage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.enterTransferOutLeverage);
        parcel.writeString(this.enterDeltaReduceLeverage);
        parcel.writeString(this.orderCancelDeltaLimit);
        parcel.writeString(this.escapeTransferOutLeverage);
        parcel.writeString(this.escapeDeltaReduceLeverage);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DeltaNeutralConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeltaNeutralConfig> serializer() {
            return DeltaNeutralConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeltaNeutralConfig(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.enterTransferOutLeverage = "";
        } else {
            this.enterTransferOutLeverage = str;
        }
        if ((i & 2) == 0) {
            this.enterDeltaReduceLeverage = "";
        } else {
            this.enterDeltaReduceLeverage = str2;
        }
        if ((i & 4) == 0) {
            this.orderCancelDeltaLimit = "";
        } else {
            this.orderCancelDeltaLimit = str3;
        }
        if ((i & 8) == 0) {
            this.escapeTransferOutLeverage = "";
        } else {
            this.escapeTransferOutLeverage = str4;
        }
        if ((i & 16) == 0) {
            this.escapeDeltaReduceLeverage = "";
        } else {
            this.escapeDeltaReduceLeverage = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DeltaNeutralConfig deltaNeutralConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) deltaNeutralConfig.enterTransferOutLeverage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, deltaNeutralConfig.enterTransferOutLeverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) deltaNeutralConfig.enterDeltaReduceLeverage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, deltaNeutralConfig.enterDeltaReduceLeverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) deltaNeutralConfig.orderCancelDeltaLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, deltaNeutralConfig.orderCancelDeltaLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) deltaNeutralConfig.escapeTransferOutLeverage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, deltaNeutralConfig.escapeTransferOutLeverage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) deltaNeutralConfig.escapeDeltaReduceLeverage, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, deltaNeutralConfig.escapeDeltaReduceLeverage);
    }

    public DeltaNeutralConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.enterTransferOutLeverage = str;
        this.enterDeltaReduceLeverage = str2;
        this.orderCancelDeltaLimit = str3;
        this.escapeTransferOutLeverage = str4;
        this.escapeDeltaReduceLeverage = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5595) call: com.okinc.unify_trade.biz.DeltaNeutralConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DeltaNeutralConfig(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
