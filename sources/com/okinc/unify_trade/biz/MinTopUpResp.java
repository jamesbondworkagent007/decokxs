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
public final class MinTopUpResp implements Parcelable {
    private String afterBaseAmount;
    private String afterQuoteAmount;
    private String algoId;
    private String estimatedPositionToClose;
    private String estimatedWithdrawnBaseAmount;
    private String estimatedWithdrawnQuoteAmount;
    private String requiredTopUpAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MinTopUpResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MinTopUpResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MinTopUpResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MinTopUpResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MinTopUpResp[] newArray(int i) {
            return new MinTopUpResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MinTopUpResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MinTopUpResp copy$default(MinTopUpResp minTopUpResp, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = minTopUpResp.algoId;
        }
        if ((i & 2) != 0) {
            str2 = minTopUpResp.requiredTopUpAmount;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = minTopUpResp.afterQuoteAmount;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = minTopUpResp.afterBaseAmount;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = minTopUpResp.estimatedWithdrawnQuoteAmount;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = minTopUpResp.estimatedWithdrawnBaseAmount;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = minTopUpResp.estimatedPositionToClose;
        }
        return minTopUpResp.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.requiredTopUpAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.afterQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.afterBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.estimatedWithdrawnQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.estimatedWithdrawnBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.estimatedPositionToClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MinTopUpResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new MinTopUpResp(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof MinTopUpResp)) {
            return false;
        }
        MinTopUpResp minTopUpResp = (MinTopUpResp) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) minTopUpResp.algoId) && Intrinsics.EZpvd((Object) this.requiredTopUpAmount, (Object) minTopUpResp.requiredTopUpAmount) && Intrinsics.EZpvd((Object) this.afterQuoteAmount, (Object) minTopUpResp.afterQuoteAmount) && Intrinsics.EZpvd((Object) this.afterBaseAmount, (Object) minTopUpResp.afterBaseAmount) && Intrinsics.EZpvd((Object) this.estimatedWithdrawnQuoteAmount, (Object) minTopUpResp.estimatedWithdrawnQuoteAmount) && Intrinsics.EZpvd((Object) this.estimatedWithdrawnBaseAmount, (Object) minTopUpResp.estimatedWithdrawnBaseAmount) && Intrinsics.EZpvd((Object) this.estimatedPositionToClose, (Object) minTopUpResp.estimatedPositionToClose);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAfterBaseAmount() {
        return this.afterBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAfterQuoteAmount() {
        return this.afterQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedPositionToClose() {
        return this.estimatedPositionToClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedWithdrawnBaseAmount() {
        return this.estimatedWithdrawnBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedWithdrawnQuoteAmount() {
        return this.estimatedWithdrawnQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequiredTopUpAmount() {
        return this.requiredTopUpAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.algoId.hashCode() * 31) + this.requiredTopUpAmount.hashCode()) * 31) + this.afterQuoteAmount.hashCode()) * 31) + this.afterBaseAmount.hashCode()) * 31) + this.estimatedWithdrawnQuoteAmount.hashCode()) * 31) + this.estimatedWithdrawnBaseAmount.hashCode()) * 31) + this.estimatedPositionToClose.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAfterBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.afterBaseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAfterQuoteAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.afterQuoteAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedPositionToClose(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimatedPositionToClose = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedWithdrawnBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimatedWithdrawnBaseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedWithdrawnQuoteAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimatedWithdrawnQuoteAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequiredTopUpAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.requiredTopUpAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MinTopUpResp(algoId=" + this.algoId + ", requiredTopUpAmount=" + this.requiredTopUpAmount + ", afterQuoteAmount=" + this.afterQuoteAmount + ", afterBaseAmount=" + this.afterBaseAmount + ", estimatedWithdrawnQuoteAmount=" + this.estimatedWithdrawnQuoteAmount + ", estimatedWithdrawnBaseAmount=" + this.estimatedWithdrawnBaseAmount + ", estimatedPositionToClose=" + this.estimatedPositionToClose + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.requiredTopUpAmount);
        parcel.writeString(this.afterQuoteAmount);
        parcel.writeString(this.afterBaseAmount);
        parcel.writeString(this.estimatedWithdrawnQuoteAmount);
        parcel.writeString(this.estimatedWithdrawnBaseAmount);
        parcel.writeString(this.estimatedPositionToClose);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MinTopUpResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MinTopUpResp> serializer() {
            return MinTopUpResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MinTopUpResp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.requiredTopUpAmount = "0";
        } else {
            this.requiredTopUpAmount = str2;
        }
        if ((i & 4) == 0) {
            this.afterQuoteAmount = "";
        } else {
            this.afterQuoteAmount = str3;
        }
        if ((i & 8) == 0) {
            this.afterBaseAmount = "";
        } else {
            this.afterBaseAmount = str4;
        }
        if ((i & 16) == 0) {
            this.estimatedWithdrawnQuoteAmount = "";
        } else {
            this.estimatedWithdrawnQuoteAmount = str5;
        }
        if ((i & 32) == 0) {
            this.estimatedWithdrawnBaseAmount = "";
        } else {
            this.estimatedWithdrawnBaseAmount = str6;
        }
        if ((i & 64) == 0) {
            this.estimatedPositionToClose = "";
        } else {
            this.estimatedPositionToClose = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MinTopUpResp minTopUpResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) minTopUpResp.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, minTopUpResp.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) minTopUpResp.requiredTopUpAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, minTopUpResp.requiredTopUpAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) minTopUpResp.afterQuoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, minTopUpResp.afterQuoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) minTopUpResp.afterBaseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, minTopUpResp.afterBaseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) minTopUpResp.estimatedWithdrawnQuoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, minTopUpResp.estimatedWithdrawnQuoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) minTopUpResp.estimatedWithdrawnBaseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, minTopUpResp.estimatedWithdrawnBaseAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) minTopUpResp.estimatedPositionToClose, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, minTopUpResp.estimatedPositionToClose);
    }

    public MinTopUpResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.algoId = str;
        this.requiredTopUpAmount = str2;
        this.afterQuoteAmount = str3;
        this.afterBaseAmount = str4;
        this.estimatedWithdrawnQuoteAmount = str5;
        this.estimatedWithdrawnBaseAmount = str6;
        this.estimatedPositionToClose = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2025) call: com.okinc.unify_trade.biz.MinTopUpResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MinTopUpResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
