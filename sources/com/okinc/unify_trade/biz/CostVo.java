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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class CostVo implements Parcelable {
    public static final int $stable = 0;
    private final String spotFeeAmt;
    private final String spreadAmt;
    private final String swapFeeAmt;
    private final String totalCostAmt;
    private final String unstakingFeeAmt;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CostVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CostVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CostVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CostVo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CostVo[] newArray(int i) {
            return new CostVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CostVo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CostVo copy$default(CostVo costVo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = costVo.totalCostAmt;
        }
        if ((i & 2) != 0) {
            str2 = costVo.spreadAmt;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = costVo.spotFeeAmt;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = costVo.swapFeeAmt;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = costVo.unstakingFeeAmt;
        }
        return costVo.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalCostAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.spreadAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.spotFeeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.swapFeeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.unstakingFeeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new CostVo(str, str2, str3, str4, str5);
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
        if (!(obj instanceof CostVo)) {
            return false;
        }
        CostVo costVo = (CostVo) obj;
        return Intrinsics.EZpvd((Object) this.totalCostAmt, (Object) costVo.totalCostAmt) && Intrinsics.EZpvd((Object) this.spreadAmt, (Object) costVo.spreadAmt) && Intrinsics.EZpvd((Object) this.spotFeeAmt, (Object) costVo.spotFeeAmt) && Intrinsics.EZpvd((Object) this.swapFeeAmt, (Object) costVo.swapFeeAmt) && Intrinsics.EZpvd((Object) this.unstakingFeeAmt, (Object) costVo.unstakingFeeAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotFeeAmt() {
        return this.spotFeeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpreadAmt() {
        return this.spreadAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapFeeAmt() {
        return this.swapFeeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalCostAmt() {
        return this.totalCostAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnstakingFeeAmt() {
        return this.unstakingFeeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.totalCostAmt.hashCode() * 31) + this.spreadAmt.hashCode()) * 31) + this.spotFeeAmt.hashCode()) * 31) + this.swapFeeAmt.hashCode()) * 31) + this.unstakingFeeAmt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CostVo(totalCostAmt=" + this.totalCostAmt + ", spreadAmt=" + this.spreadAmt + ", spotFeeAmt=" + this.spotFeeAmt + ", swapFeeAmt=" + this.swapFeeAmt + ", unstakingFeeAmt=" + this.unstakingFeeAmt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalCostAmt);
        parcel.writeString(this.spreadAmt);
        parcel.writeString(this.spotFeeAmt);
        parcel.writeString(this.swapFeeAmt);
        parcel.writeString(this.unstakingFeeAmt);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.CostVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CostVo> serializer() {
            return CostVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CostVo(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalCostAmt = "";
        } else {
            this.totalCostAmt = str;
        }
        if ((i & 2) == 0) {
            this.spreadAmt = "";
        } else {
            this.spreadAmt = str2;
        }
        if ((i & 4) == 0) {
            this.spotFeeAmt = "";
        } else {
            this.spotFeeAmt = str3;
        }
        if ((i & 8) == 0) {
            this.swapFeeAmt = "";
        } else {
            this.swapFeeAmt = str4;
        }
        if ((i & 16) == 0) {
            this.unstakingFeeAmt = "";
        } else {
            this.unstakingFeeAmt = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CostVo costVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) costVo.totalCostAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, costVo.totalCostAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) costVo.spreadAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, costVo.spreadAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) costVo.spotFeeAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, costVo.spotFeeAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) costVo.swapFeeAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, costVo.swapFeeAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) costVo.unstakingFeeAmt, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, costVo.unstakingFeeAmt);
    }

    public CostVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.totalCostAmt = str;
        this.spreadAmt = str2;
        this.spotFeeAmt = str3;
        this.swapFeeAmt = str4;
        this.unstakingFeeAmt = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1584) call: com.okinc.unify_trade.biz.CostVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CostVo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
