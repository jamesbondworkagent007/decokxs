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
public final class BaseTradeOrderReq implements Parcelable {
    private String instId;
    private Boolean isFullPercent;
    private String orderSignType;
    private String orderType;
    private String side;
    private String sz;
    private String tdMode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BaseTradeOrderReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<BaseTradeOrderReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BaseTradeOrderReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BaseTradeOrderReq(string, string2, string3, string4, string5, boolValueOf, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BaseTradeOrderReq[] newArray(int i) {
            return new BaseTradeOrderReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseTradeOrderReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BaseTradeOrderReq copy$default(BaseTradeOrderReq baseTradeOrderReq, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baseTradeOrderReq.instId;
        }
        if ((i & 2) != 0) {
            str2 = baseTradeOrderReq.tdMode;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = baseTradeOrderReq.side;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = baseTradeOrderReq.orderType;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = baseTradeOrderReq.sz;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            bool = baseTradeOrderReq.isFullPercent;
        }
        Boolean bool2 = bool;
        if ((i & 64) != 0) {
            str6 = baseTradeOrderReq.orderSignType;
        }
        return baseTradeOrderReq.copy(str, str7, str8, str9, str10, bool2, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.isFullPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.orderSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseTradeOrderReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, Boolean bool, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new BaseTradeOrderReq(str, str2, str3, str4, str5, bool, str6);
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
        if (!(obj instanceof BaseTradeOrderReq)) {
            return false;
        }
        BaseTradeOrderReq baseTradeOrderReq = (BaseTradeOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) baseTradeOrderReq.instId) && Intrinsics.EZpvd((Object) this.tdMode, (Object) baseTradeOrderReq.tdMode) && Intrinsics.EZpvd((Object) this.side, (Object) baseTradeOrderReq.side) && Intrinsics.EZpvd((Object) this.orderType, (Object) baseTradeOrderReq.orderType) && Intrinsics.EZpvd((Object) this.sz, (Object) baseTradeOrderReq.sz) && Intrinsics.EZpvd(this.isFullPercent, baseTradeOrderReq.isFullPercent) && Intrinsics.EZpvd((Object) this.orderSignType, (Object) baseTradeOrderReq.orderSignType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderSignType() {
        return this.orderSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
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
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.tdMode.hashCode();
        int iHashCode3 = this.side.hashCode();
        int iHashCode4 = this.orderType.hashCode();
        int iHashCode5 = this.sz.hashCode();
        Boolean bool = this.isFullPercent;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        String str = this.orderSignType;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFullPercent() {
        return this.isFullPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullPercent(Boolean bool) {
        this.isFullPercent = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderSignType(String str) {
        this.orderSignType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BaseTradeOrderReq(instId=" + this.instId + ", tdMode=" + this.tdMode + ", side=" + this.side + ", orderType=" + this.orderType + ", sz=" + this.sz + ", isFullPercent=" + this.isFullPercent + ", orderSignType=" + this.orderSignType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.side);
        parcel.writeString(this.orderType);
        parcel.writeString(this.sz);
        Boolean bool = this.isFullPercent;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.orderSignType);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BaseTradeOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BaseTradeOrderReq> serializer() {
            return BaseTradeOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BaseTradeOrderReq(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str2;
        }
        if ((i & 4) == 0) {
            this.side = "";
        } else {
            this.side = str3;
        }
        if ((i & 8) == 0) {
            this.orderType = "";
        } else {
            this.orderType = str4;
        }
        if ((i & 16) == 0) {
            this.sz = "";
        } else {
            this.sz = str5;
        }
        if ((i & 32) == 0) {
            this.isFullPercent = null;
        } else {
            this.isFullPercent = bool;
        }
        if ((i & 64) == 0) {
            this.orderSignType = null;
        } else {
            this.orderSignType = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BaseTradeOrderReq baseTradeOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) baseTradeOrderReq.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, baseTradeOrderReq.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) baseTradeOrderReq.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, baseTradeOrderReq.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) baseTradeOrderReq.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, baseTradeOrderReq.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) baseTradeOrderReq.orderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, baseTradeOrderReq.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) baseTradeOrderReq.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, baseTradeOrderReq.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || baseTradeOrderReq.isFullPercent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, baseTradeOrderReq.isFullPercent);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && baseTradeOrderReq.orderSignType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, baseTradeOrderReq.orderSignType);
    }

    public BaseTradeOrderReq(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, Boolean bool, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.instId = str;
        this.tdMode = str2;
        this.side = str3;
        this.orderType = str4;
        this.sz = str5;
        this.isFullPercent = bool;
        this.orderSignType = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r11v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:232) call: com.okinc.unify_trade.biz.BaseTradeOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ BaseTradeOrderReq(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str6);
    }
}
