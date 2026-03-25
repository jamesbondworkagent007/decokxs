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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SimpleOptionPreviewOrderResponse implements Parcelable {
    private String code;
    private String estCost;
    private String expiry;
    private String leverage;
    private String msg;
    private String sz;
    private String targetPrice;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimpleOptionPreviewOrderResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SimpleOptionPreviewOrderResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleOptionPreviewOrderResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SimpleOptionPreviewOrderResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleOptionPreviewOrderResponse[] newArray(int i) {
            return new SimpleOptionPreviewOrderResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleOptionPreviewOrderResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SimpleOptionPreviewOrderResponse copy$default(SimpleOptionPreviewOrderResponse simpleOptionPreviewOrderResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleOptionPreviewOrderResponse.code;
        }
        if ((i & 2) != 0) {
            str2 = simpleOptionPreviewOrderResponse.msg;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = simpleOptionPreviewOrderResponse.leverage;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = simpleOptionPreviewOrderResponse.expiry;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = simpleOptionPreviewOrderResponse.estCost;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = simpleOptionPreviewOrderResponse.sz;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = simpleOptionPreviewOrderResponse.targetPrice;
        }
        return simpleOptionPreviewOrderResponse.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.estCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.targetPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleOptionPreviewOrderResponse copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new SimpleOptionPreviewOrderResponse(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof SimpleOptionPreviewOrderResponse)) {
            return false;
        }
        SimpleOptionPreviewOrderResponse simpleOptionPreviewOrderResponse = (SimpleOptionPreviewOrderResponse) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) simpleOptionPreviewOrderResponse.code) && Intrinsics.EZpvd((Object) this.msg, (Object) simpleOptionPreviewOrderResponse.msg) && Intrinsics.EZpvd((Object) this.leverage, (Object) simpleOptionPreviewOrderResponse.leverage) && Intrinsics.EZpvd((Object) this.expiry, (Object) simpleOptionPreviewOrderResponse.expiry) && Intrinsics.EZpvd((Object) this.estCost, (Object) simpleOptionPreviewOrderResponse.estCost) && Intrinsics.EZpvd((Object) this.sz, (Object) simpleOptionPreviewOrderResponse.sz) && Intrinsics.EZpvd((Object) this.targetPrice, (Object) simpleOptionPreviewOrderResponse.targetPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstCost() {
        return this.estCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiry() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetPrice() {
        return this.targetPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.code;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.msg;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.leverage;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.expiry;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.estCost;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.sz;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.targetPrice;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCode(String str) {
        this.code = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstCost(String str) {
        this.estCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiry(String str) {
        this.expiry = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverage(String str) {
        this.leverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsg(String str) {
        this.msg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(String str) {
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetPrice(String str) {
        this.targetPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleOptionPreviewOrderResponse(code=" + this.code + ", msg=" + this.msg + ", leverage=" + this.leverage + ", expiry=" + this.expiry + ", estCost=" + this.estCost + ", sz=" + this.sz + ", targetPrice=" + this.targetPrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.code);
        parcel.writeString(this.msg);
        parcel.writeString(this.leverage);
        parcel.writeString(this.expiry);
        parcel.writeString(this.estCost);
        parcel.writeString(this.sz);
        parcel.writeString(this.targetPrice);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SimpleOptionPreviewOrderResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimpleOptionPreviewOrderResponse> serializer() {
            return SimpleOptionPreviewOrderResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleOptionPreviewOrderResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.code = null;
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.msg = null;
        } else {
            this.msg = str2;
        }
        if ((i & 4) == 0) {
            this.leverage = null;
        } else {
            this.leverage = str3;
        }
        if ((i & 8) == 0) {
            this.expiry = null;
        } else {
            this.expiry = str4;
        }
        if ((i & 16) == 0) {
            this.estCost = null;
        } else {
            this.estCost = str5;
        }
        if ((i & 32) == 0) {
            this.sz = null;
        } else {
            this.sz = str6;
        }
        if ((i & 64) == 0) {
            this.targetPrice = null;
        } else {
            this.targetPrice = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SimpleOptionPreviewOrderResponse simpleOptionPreviewOrderResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || simpleOptionPreviewOrderResponse.code != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, simpleOptionPreviewOrderResponse.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || simpleOptionPreviewOrderResponse.msg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, simpleOptionPreviewOrderResponse.msg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || simpleOptionPreviewOrderResponse.leverage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, simpleOptionPreviewOrderResponse.leverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || simpleOptionPreviewOrderResponse.expiry != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, simpleOptionPreviewOrderResponse.expiry);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || simpleOptionPreviewOrderResponse.estCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, simpleOptionPreviewOrderResponse.estCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || simpleOptionPreviewOrderResponse.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, simpleOptionPreviewOrderResponse.sz);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && simpleOptionPreviewOrderResponse.targetPrice == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, simpleOptionPreviewOrderResponse.targetPrice);
    }

    public SimpleOptionPreviewOrderResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.code = str;
        this.msg = str2;
        this.leverage = str3;
        this.expiry = str4;
        this.estCost = str5;
        this.sz = str6;
        this.targetPrice = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5424) call: com.okinc.unify_trade.biz.SimpleOptionPreviewOrderResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SimpleOptionPreviewOrderResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
