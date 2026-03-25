package com.okinc.dex;

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

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class StopOrderQuoteVO implements Parcelable {
    public static final int $stable = 0;
    private final String id;
    private final String orderId;
    private final String sellAmountRatio;
    private final String stopOrderType;
    private final String triggerPriceRatio;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<StopOrderQuoteVO> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StopOrderQuoteVO> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StopOrderQuoteVO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StopOrderQuoteVO(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StopOrderQuoteVO[] newArray(int i) {
            return new StopOrderQuoteVO[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StopOrderQuoteVO() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StopOrderQuoteVO copy$default(StopOrderQuoteVO stopOrderQuoteVO, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stopOrderQuoteVO.id;
        }
        if ((i & 2) != 0) {
            str2 = stopOrderQuoteVO.orderId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = stopOrderQuoteVO.stopOrderType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = stopOrderQuoteVO.triggerPriceRatio;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = stopOrderQuoteVO.sellAmountRatio;
        }
        return stopOrderQuoteVO.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.stopOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.triggerPriceRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sellAmountRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StopOrderQuoteVO copy(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new StopOrderQuoteVO(str, str2, str3, str4, str5);
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
        if (!(obj instanceof StopOrderQuoteVO)) {
            return false;
        }
        StopOrderQuoteVO stopOrderQuoteVO = (StopOrderQuoteVO) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) stopOrderQuoteVO.id) && Intrinsics.EZpvd((Object) this.orderId, (Object) stopOrderQuoteVO.orderId) && Intrinsics.EZpvd((Object) this.stopOrderType, (Object) stopOrderQuoteVO.stopOrderType) && Intrinsics.EZpvd((Object) this.triggerPriceRatio, (Object) stopOrderQuoteVO.triggerPriceRatio) && Intrinsics.EZpvd((Object) this.sellAmountRatio, (Object) stopOrderQuoteVO.sellAmountRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellAmountRatio() {
        return this.sellAmountRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopOrderType() {
        return this.stopOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPriceRatio() {
        return this.triggerPriceRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        String str = this.orderId;
        return (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.stopOrderType.hashCode()) * 31) + this.triggerPriceRatio.hashCode()) * 31) + this.sellAmountRatio.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StopOrderQuoteVO(id=" + this.id + ", orderId=" + this.orderId + ", stopOrderType=" + this.stopOrderType + ", triggerPriceRatio=" + this.triggerPriceRatio + ", sellAmountRatio=" + this.sellAmountRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.orderId);
        parcel.writeString(this.stopOrderType);
        parcel.writeString(this.triggerPriceRatio);
        parcel.writeString(this.sellAmountRatio);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dex.StopOrderQuoteVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StopOrderQuoteVO> serializer() {
            return StopOrderQuoteVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StopOrderQuoteVO(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.orderId = null;
        } else {
            this.orderId = str2;
        }
        if ((i & 4) == 0) {
            this.stopOrderType = "";
        } else {
            this.stopOrderType = str3;
        }
        if ((i & 8) == 0) {
            this.triggerPriceRatio = "";
        } else {
            this.triggerPriceRatio = str4;
        }
        if ((i & 16) == 0) {
            this.sellAmountRatio = "";
        } else {
            this.sellAmountRatio = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StopOrderQuoteVO stopOrderQuoteVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) stopOrderQuoteVO.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, stopOrderQuoteVO.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || stopOrderQuoteVO.orderId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, stopOrderQuoteVO.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) stopOrderQuoteVO.stopOrderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, stopOrderQuoteVO.stopOrderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) stopOrderQuoteVO.triggerPriceRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, stopOrderQuoteVO.triggerPriceRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) stopOrderQuoteVO.sellAmountRatio, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, stopOrderQuoteVO.sellAmountRatio);
    }

    public StopOrderQuoteVO(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.id = str;
        this.orderId = str2;
        this.stopOrderType = str3;
        this.triggerPriceRatio = str4;
        this.sellAmountRatio = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:0x000e: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.dex.StopOrderQuoteVO.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StopOrderQuoteVO(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
