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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SpotManualBorrowRepayReq implements Parcelable {
    public static final int $stable = 0;
    private final String amt;
    private final String ccy;
    private final Boolean isFullPercent;
    private final String side;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SpotManualBorrowRepayReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SpotManualBorrowRepayReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotManualBorrowRepayReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SpotManualBorrowRepayReq(string, string2, string3, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotManualBorrowRepayReq[] newArray(int i) {
            return new SpotManualBorrowRepayReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotManualBorrowRepayReq() {
        this((String) null, (String) null, (String) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotManualBorrowRepayReq copy$default(SpotManualBorrowRepayReq spotManualBorrowRepayReq, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotManualBorrowRepayReq.ccy;
        }
        if ((i & 2) != 0) {
            str2 = spotManualBorrowRepayReq.side;
        }
        if ((i & 4) != 0) {
            str3 = spotManualBorrowRepayReq.amt;
        }
        if ((i & 8) != 0) {
            bool = spotManualBorrowRepayReq.isFullPercent;
        }
        return spotManualBorrowRepayReq.copy(str, str2, str3, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isFullPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotManualBorrowRepayReq copy(String str, String str2, String str3, Boolean bool) {
        return new SpotManualBorrowRepayReq(str, str2, str3, bool);
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
        if (!(obj instanceof SpotManualBorrowRepayReq)) {
            return false;
        }
        SpotManualBorrowRepayReq spotManualBorrowRepayReq = (SpotManualBorrowRepayReq) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) spotManualBorrowRepayReq.ccy) && Intrinsics.EZpvd((Object) this.side, (Object) spotManualBorrowRepayReq.side) && Intrinsics.EZpvd((Object) this.amt, (Object) spotManualBorrowRepayReq.amt) && Intrinsics.EZpvd(this.isFullPercent, spotManualBorrowRepayReq.isFullPercent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmt() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.ccy;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.side;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.amt;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.isFullPercent;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFullPercent() {
        return this.isFullPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotManualBorrowRepayReq(ccy=" + this.ccy + ", side=" + this.side + ", amt=" + this.amt + ", isFullPercent=" + this.isFullPercent + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ccy);
        parcel.writeString(this.side);
        parcel.writeString(this.amt);
        Boolean bool = this.isFullPercent;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpotManualBorrowRepayReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotManualBorrowRepayReq> serializer() {
            return SpotManualBorrowRepayReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotManualBorrowRepayReq(int i, String str, String str2, String str3, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.side = "";
        } else {
            this.side = str2;
        }
        if ((i & 4) == 0) {
            this.amt = "";
        } else {
            this.amt = str3;
        }
        if ((i & 8) == 0) {
            this.isFullPercent = null;
        } else {
            this.isFullPercent = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpotManualBorrowRepayReq spotManualBorrowRepayReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) spotManualBorrowRepayReq.ccy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spotManualBorrowRepayReq.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) spotManualBorrowRepayReq.side, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, spotManualBorrowRepayReq.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) spotManualBorrowRepayReq.amt, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, spotManualBorrowRepayReq.amt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && spotManualBorrowRepayReq.isFullPercent == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, spotManualBorrowRepayReq.isFullPercent);
    }

    public SpotManualBorrowRepayReq(String str, String str2, String str3, Boolean bool) {
        this.ccy = str;
        this.side = str2;
        this.amt = str3;
        this.isFullPercent = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:51) call: com.okinc.unify_trade.biz.SpotManualBorrowRepayReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ SpotManualBorrowRepayReq(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : bool);
    }
}
