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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TwapReq implements Parcelable {
    private Boolean isTradeBorrowMode;
    private String leftLevel;
    private String pxLimit;
    private String pxSpread;
    private String pxVar;
    private String rightLevel;
    private String sz;
    private String szLimit;
    private String timeInterval;
    private String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TwapReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TwapReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TwapReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TwapReq(string, string2, string3, string4, string5, string6, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TwapReq[] newArray(int i) {
            return new TwapReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwapReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.leftLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.rightLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwapReq copy(@NotNull String str, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, Boolean bool, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new TwapReq(str, str2, str3, str4, str5, str6, bool, str7, str8, str9);
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
        if (!(obj instanceof TwapReq)) {
            return false;
        }
        TwapReq twapReq = (TwapReq) obj;
        return Intrinsics.EZpvd((Object) this.pxLimit, (Object) twapReq.pxLimit) && Intrinsics.EZpvd((Object) this.pxSpread, (Object) twapReq.pxSpread) && Intrinsics.EZpvd((Object) this.pxVar, (Object) twapReq.pxVar) && Intrinsics.EZpvd((Object) this.szLimit, (Object) twapReq.szLimit) && Intrinsics.EZpvd((Object) this.timeInterval, (Object) twapReq.timeInterval) && Intrinsics.EZpvd((Object) this.sz, (Object) twapReq.sz) && Intrinsics.EZpvd(this.isTradeBorrowMode, twapReq.isTradeBorrowMode) && Intrinsics.EZpvd((Object) this.leftLevel, (Object) twapReq.leftLevel) && Intrinsics.EZpvd((Object) this.rightLevel, (Object) twapReq.rightLevel) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) twapReq.tradeQuoteCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeftLevel() {
        return this.leftLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxLimit() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxSpread() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxVar() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRightLevel() {
        return this.rightLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSzLimit() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeInterval() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.pxLimit.hashCode();
        String str = this.pxSpread;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.pxVar;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.szLimit.hashCode();
        int iHashCode5 = this.timeInterval.hashCode();
        int iHashCode6 = this.sz.hashCode();
        Boolean bool = this.isTradeBorrowMode;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        String str3 = this.leftLevel;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.rightLevel;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tradeQuoteCcy;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTradeBorrowMode() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftLevel(String str) {
        this.leftLevel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxSpread(String str) {
        this.pxSpread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxVar(String str) {
        this.pxVar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightLevel(String str) {
        this.rightLevel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSzLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.szLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeInterval(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeInterval = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeBorrowMode(Boolean bool) {
        this.isTradeBorrowMode = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwapReq(pxLimit=" + this.pxLimit + ", pxSpread=" + this.pxSpread + ", pxVar=" + this.pxVar + ", szLimit=" + this.szLimit + ", timeInterval=" + this.timeInterval + ", sz=" + this.sz + ", isTradeBorrowMode=" + this.isTradeBorrowMode + ", leftLevel=" + this.leftLevel + ", rightLevel=" + this.rightLevel + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.pxLimit);
        parcel.writeString(this.pxSpread);
        parcel.writeString(this.pxVar);
        parcel.writeString(this.szLimit);
        parcel.writeString(this.timeInterval);
        parcel.writeString(this.sz);
        Boolean bool = this.isTradeBorrowMode;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.leftLevel);
        parcel.writeString(this.rightLevel);
        parcel.writeString(this.tradeQuoteCcy);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TwapReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwapReq> serializer() {
            return TwapReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwapReq(int i, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pxLimit = "";
        } else {
            this.pxLimit = str;
        }
        if ((i & 2) == 0) {
            this.pxSpread = null;
        } else {
            this.pxSpread = str2;
        }
        if ((i & 4) == 0) {
            this.pxVar = null;
        } else {
            this.pxVar = str3;
        }
        if ((i & 8) == 0) {
            this.szLimit = "";
        } else {
            this.szLimit = str4;
        }
        if ((i & 16) == 0) {
            this.timeInterval = "";
        } else {
            this.timeInterval = str5;
        }
        if ((i & 32) == 0) {
            this.sz = "";
        } else {
            this.sz = str6;
        }
        if ((i & 64) == 0) {
            this.isTradeBorrowMode = null;
        } else {
            this.isTradeBorrowMode = bool;
        }
        if ((i & 128) == 0) {
            this.leftLevel = null;
        } else {
            this.leftLevel = str7;
        }
        if ((i & 256) == 0) {
            this.rightLevel = null;
        } else {
            this.rightLevel = str8;
        }
        if ((i & 512) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TwapReq twapReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) twapReq.pxLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, twapReq.pxLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || twapReq.pxSpread != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, twapReq.pxSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || twapReq.pxVar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, twapReq.pxVar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) twapReq.szLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, twapReq.szLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) twapReq.timeInterval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, twapReq.timeInterval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) twapReq.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, twapReq.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || twapReq.isTradeBorrowMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, twapReq.isTradeBorrowMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || twapReq.leftLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, twapReq.leftLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || twapReq.rightLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, twapReq.rightLevel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && twapReq.tradeQuoteCcy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, twapReq.tradeQuoteCcy);
    }

    public TwapReq(@NotNull String str, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, Boolean bool, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.pxLimit = str;
        this.pxSpread = str2;
        this.pxVar = str3;
        this.szLimit = str4;
        this.timeInterval = str5;
        this.sz = str6;
        this.isTradeBorrowMode = bool;
        this.leftLevel = str7;
        this.rightLevel = str8;
        this.tradeQuoteCcy = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r22v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:458) call: com.okinc.unify_trade.biz.TwapReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TwapReq(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) == 0 ? str9 : null);
    }
}
