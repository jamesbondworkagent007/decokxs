package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SignalBotManualOrderReq implements Parcelable {
    public static final int $stable = 0;
    private final String algoId;
    private final String instId;
    private final String orderType;
    private final String price;
    private final boolean reduceOnly;
    private final String side;
    private final String sz;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SignalBotManualOrderReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SignalBotManualOrderReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotManualOrderReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalBotManualOrderReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotManualOrderReq[] newArray(int i) {
            return new SignalBotManualOrderReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalBotManualOrderReq copy$default(SignalBotManualOrderReq signalBotManualOrderReq, String str, String str2, String str3, String str4, boolean z, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signalBotManualOrderReq.algoId;
        }
        if ((i & 2) != 0) {
            str2 = signalBotManualOrderReq.instId;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = signalBotManualOrderReq.orderType;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = signalBotManualOrderReq.price;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            z = signalBotManualOrderReq.reduceOnly;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = signalBotManualOrderReq.side;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = signalBotManualOrderReq.sz;
        }
        return signalBotManualOrderReq.copy(str, str7, str8, str9, z2, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalBotManualOrderReq copy(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        return new SignalBotManualOrderReq(str, str2, str3, str4, z, str5, str6);
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
        if (!(obj instanceof SignalBotManualOrderReq)) {
            return false;
        }
        SignalBotManualOrderReq signalBotManualOrderReq = (SignalBotManualOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) signalBotManualOrderReq.algoId) && Intrinsics.EZpvd((Object) this.instId, (Object) signalBotManualOrderReq.instId) && Intrinsics.EZpvd((Object) this.orderType, (Object) signalBotManualOrderReq.orderType) && Intrinsics.EZpvd((Object) this.price, (Object) signalBotManualOrderReq.price) && this.reduceOnly == signalBotManualOrderReq.reduceOnly && Intrinsics.EZpvd((Object) this.side, (Object) signalBotManualOrderReq.side) && Intrinsics.EZpvd((Object) this.sz, (Object) signalBotManualOrderReq.sz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.algoId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.instId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.orderType;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.price;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        int iHashCode5 = Boolean.hashCode(this.reduceOnly);
        String str5 = this.side;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.sz;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalBotManualOrderReq(algoId=" + this.algoId + ", instId=" + this.instId + ", orderType=" + this.orderType + ", price=" + this.price + ", reduceOnly=" + this.reduceOnly + ", side=" + this.side + ", sz=" + this.sz + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.instId);
        parcel.writeString(this.orderType);
        parcel.writeString(this.price);
        parcel.writeInt(this.reduceOnly ? 1 : 0);
        parcel.writeString(this.side);
        parcel.writeString(this.sz);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SignalBotManualOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalBotManualOrderReq> serializer() {
            return SignalBotManualOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalBotManualOrderReq(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (16 != (i & 16)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16, SignalBotManualOrderReq$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.algoId = null;
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.instId = null;
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.orderType = null;
        } else {
            this.orderType = str3;
        }
        if ((i & 8) == 0) {
            this.price = null;
        } else {
            this.price = str4;
        }
        this.reduceOnly = z;
        if ((i & 32) == 0) {
            this.side = null;
        } else {
            this.side = str5;
        }
        if ((i & 64) == 0) {
            this.sz = null;
        } else {
            this.sz = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignalBotManualOrderReq signalBotManualOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signalBotManualOrderReq.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, signalBotManualOrderReq.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signalBotManualOrderReq.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signalBotManualOrderReq.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || signalBotManualOrderReq.orderType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, signalBotManualOrderReq.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signalBotManualOrderReq.price != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, signalBotManualOrderReq.price);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, signalBotManualOrderReq.reduceOnly);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || signalBotManualOrderReq.side != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, signalBotManualOrderReq.side);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && signalBotManualOrderReq.sz == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, signalBotManualOrderReq.sz);
    }

    public SignalBotManualOrderReq(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        this.algoId = str;
        this.instId = str2;
        this.orderType = str3;
        this.price = str4;
        this.reduceOnly = z;
        this.side = str5;
        this.sz = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (r15v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:3834) call: com.okinc.unify_trade.biz.SignalBotManualOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignalBotManualOrderReq(String str, String str2, String str3, String str4, boolean z, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, z, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
