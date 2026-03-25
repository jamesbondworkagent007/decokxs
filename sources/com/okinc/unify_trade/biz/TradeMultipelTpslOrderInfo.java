package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TradeMultipelTpslOrderInfo implements Parcelable {
    private String amount;
    private Boolean isSeekBarSelected;
    private Boolean isTrigger;
    private String orderSignType;
    private String price;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeMultipelTpslOrderInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradeMultipelTpslOrderInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeMultipelTpslOrderInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TradeMultipelTpslOrderInfo(string, string2, string3, boolValueOf, boolValueOf2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeMultipelTpslOrderInfo[] newArray(int i) {
            return new TradeMultipelTpslOrderInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeMultipelTpslOrderInfo copy$default(TradeMultipelTpslOrderInfo tradeMultipelTpslOrderInfo, String str, String str2, String str3, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeMultipelTpslOrderInfo.price;
        }
        if ((i & 2) != 0) {
            str2 = tradeMultipelTpslOrderInfo.amount;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = tradeMultipelTpslOrderInfo.orderSignType;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            bool = tradeMultipelTpslOrderInfo.isSeekBarSelected;
        }
        Boolean bool3 = bool;
        if ((i & 16) != 0) {
            bool2 = tradeMultipelTpslOrderInfo.isTrigger;
        }
        return tradeMultipelTpslOrderInfo.copy(str, str4, str5, bool3, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.orderSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isSeekBarSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isTrigger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeMultipelTpslOrderInfo copy(@NotNull String str, @NotNull String str2, String str3, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TradeMultipelTpslOrderInfo(str, str2, str3, bool, bool2);
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
        if (!(obj instanceof TradeMultipelTpslOrderInfo)) {
            return false;
        }
        TradeMultipelTpslOrderInfo tradeMultipelTpslOrderInfo = (TradeMultipelTpslOrderInfo) obj;
        return Intrinsics.EZpvd((Object) this.price, (Object) tradeMultipelTpslOrderInfo.price) && Intrinsics.EZpvd((Object) this.amount, (Object) tradeMultipelTpslOrderInfo.amount) && Intrinsics.EZpvd((Object) this.orderSignType, (Object) tradeMultipelTpslOrderInfo.orderSignType) && Intrinsics.EZpvd(this.isSeekBarSelected, tradeMultipelTpslOrderInfo.isSeekBarSelected) && Intrinsics.EZpvd(this.isTrigger, tradeMultipelTpslOrderInfo.isTrigger);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderSignType() {
        return this.orderSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.price.hashCode();
        int iHashCode2 = this.amount.hashCode();
        String str = this.orderSignType;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Boolean bool = this.isSeekBarSelected;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isTrigger;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSeekBarSelected() {
        return this.isSeekBarSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTrigger() {
        return this.isTrigger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderSignType(String str) {
        this.orderSignType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeekBarSelected(Boolean bool) {
        this.isSeekBarSelected = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrigger(Boolean bool) {
        this.isTrigger = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeMultipelTpslOrderInfo(price=" + this.price + ", amount=" + this.amount + ", orderSignType=" + this.orderSignType + ", isSeekBarSelected=" + this.isSeekBarSelected + ", isTrigger=" + this.isTrigger + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.price);
        parcel.writeString(this.amount);
        parcel.writeString(this.orderSignType);
        Boolean bool = this.isSeekBarSelected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isTrigger;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeMultipelTpslOrderInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeMultipelTpslOrderInfo> serializer() {
            return TradeMultipelTpslOrderInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeMultipelTpslOrderInfo(int i, String str, String str2, String str3, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TradeMultipelTpslOrderInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.price = str;
        this.amount = str2;
        if ((i & 4) == 0) {
            this.orderSignType = "";
        } else {
            this.orderSignType = str3;
        }
        if ((i & 8) == 0) {
            this.isSeekBarSelected = Boolean.FALSE;
        } else {
            this.isSeekBarSelected = bool;
        }
        if ((i & 16) == 0) {
            this.isTrigger = Boolean.FALSE;
        } else {
            this.isTrigger = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeMultipelTpslOrderInfo tradeMultipelTpslOrderInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeMultipelTpslOrderInfo.price);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeMultipelTpslOrderInfo.amount);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeMultipelTpslOrderInfo.orderSignType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tradeMultipelTpslOrderInfo.orderSignType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(tradeMultipelTpslOrderInfo.isSeekBarSelected, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, tradeMultipelTpslOrderInfo.isSeekBarSelected);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(tradeMultipelTpslOrderInfo.isTrigger, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, tradeMultipelTpslOrderInfo.isTrigger);
    }

    public TradeMultipelTpslOrderInfo(@NotNull String str, @NotNull String str2, String str3, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.price = str;
        this.amount = str2;
        this.orderSignType = str3;
        this.isSeekBarSelected = bool;
        this.isTrigger = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.Boolean:0x000d: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0012: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r11v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:3969) call: com.okinc.unify_trade.biz.TradeMultipelTpslOrderInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TradeMultipelTpslOrderInfo(String str, String str2, String str3, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? Boolean.FALSE : bool2);
    }
}
