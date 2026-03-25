package com.okinc.unify_trade.manager;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TradeQuoteCcyLoan implements Parcelable {
    private Boolean buyCheckBox;
    private Boolean sellCheckBox;
    private String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeQuoteCcyLoan> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradeQuoteCcyLoan> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeQuoteCcyLoan createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TradeQuoteCcyLoan(string, boolValueOf, boolValueOf2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeQuoteCcyLoan[] newArray(int i) {
            return new TradeQuoteCcyLoan[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeQuoteCcyLoan() {
        this((String) null, (Boolean) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeQuoteCcyLoan copy$default(TradeQuoteCcyLoan tradeQuoteCcyLoan, String str, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeQuoteCcyLoan.tradeQuoteCcy;
        }
        if ((i & 2) != 0) {
            bool = tradeQuoteCcyLoan.buyCheckBox;
        }
        if ((i & 4) != 0) {
            bool2 = tradeQuoteCcyLoan.sellCheckBox;
        }
        return tradeQuoteCcyLoan.copy(str, bool, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.buyCheckBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.sellCheckBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeQuoteCcyLoan copy(String str, Boolean bool, Boolean bool2) {
        return new TradeQuoteCcyLoan(str, bool, bool2);
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
        if (!(obj instanceof TradeQuoteCcyLoan)) {
            return false;
        }
        TradeQuoteCcyLoan tradeQuoteCcyLoan = (TradeQuoteCcyLoan) obj;
        return Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) tradeQuoteCcyLoan.tradeQuoteCcy) && Intrinsics.EZpvd(this.buyCheckBox, tradeQuoteCcyLoan.buyCheckBox) && Intrinsics.EZpvd(this.sellCheckBox, tradeQuoteCcyLoan.sellCheckBox);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getBuyCheckBox() {
        return this.buyCheckBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSellCheckBox() {
        return this.sellCheckBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tradeQuoteCcy;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.buyCheckBox;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.sellCheckBox;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyCheckBox(Boolean bool) {
        this.buyCheckBox = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellCheckBox(Boolean bool) {
        this.sellCheckBox = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeQuoteCcyLoan(tradeQuoteCcy=" + this.tradeQuoteCcy + ", buyCheckBox=" + this.buyCheckBox + ", sellCheckBox=" + this.sellCheckBox + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tradeQuoteCcy);
        Boolean bool = this.buyCheckBox;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.sellCheckBox;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.manager.TradeQuoteCcyLoan.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeQuoteCcyLoan> serializer() {
            return TradeQuoteCcyLoan$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeQuoteCcyLoan(int i, String str, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str;
        }
        if ((i & 2) == 0) {
            this.buyCheckBox = null;
        } else {
            this.buyCheckBox = bool;
        }
        if ((i & 4) == 0) {
            this.sellCheckBox = null;
        } else {
            this.sellCheckBox = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeQuoteCcyLoan tradeQuoteCcyLoan, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradeQuoteCcyLoan.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tradeQuoteCcyLoan.tradeQuoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tradeQuoteCcyLoan.buyCheckBox != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, tradeQuoteCcyLoan.buyCheckBox);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && tradeQuoteCcyLoan.sellCheckBox == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, tradeQuoteCcyLoan.sellCheckBox);
    }

    public TradeQuoteCcyLoan(String str, Boolean bool, Boolean bool2) {
        this.tradeQuoteCcy = str;
        this.buyCheckBox = bool;
        this.sellCheckBox = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:23) call: com.okinc.unify_trade.manager.TradeQuoteCcyLoan.<init>(java.lang.String, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TradeQuoteCcyLoan(String str, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2);
    }
}
