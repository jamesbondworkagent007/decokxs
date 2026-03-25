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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyMoveOrderReq implements Parcelable {
    private String activePx;
    private String activePxType;
    private String callbackRatio;
    private String callbackSpread;
    private String ccy;
    private String currentPrice;
    private Boolean isTradeBorrowMode;
    private String leftLever;
    private String quickMgnType;
    private String rightLever;
    private String showSz;
    private String sz;
    private String tag;
    private String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StrategyMoveOrderReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StrategyMoveOrderReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyMoveOrderReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StrategyMoveOrderReq(string, string2, string3, string4, string5, string6, string7, string8, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyMoveOrderReq[] newArray(int i) {
            return new StrategyMoveOrderReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.leftLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.rightLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.callbackSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.activePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.showSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.activePxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyMoveOrderReq copy(String str, String str2, String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new StrategyMoveOrderReq(str, str2, str3, str4, str5, str6, str7, str8, bool, str9, str10, str11, str12, str13);
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
        if (!(obj instanceof StrategyMoveOrderReq)) {
            return false;
        }
        StrategyMoveOrderReq strategyMoveOrderReq = (StrategyMoveOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.callbackRatio, (Object) strategyMoveOrderReq.callbackRatio) && Intrinsics.EZpvd((Object) this.callbackSpread, (Object) strategyMoveOrderReq.callbackSpread) && Intrinsics.EZpvd((Object) this.activePx, (Object) strategyMoveOrderReq.activePx) && Intrinsics.EZpvd((Object) this.showSz, (Object) strategyMoveOrderReq.showSz) && Intrinsics.EZpvd((Object) this.sz, (Object) strategyMoveOrderReq.sz) && Intrinsics.EZpvd((Object) this.activePxType, (Object) strategyMoveOrderReq.activePxType) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) strategyMoveOrderReq.currentPrice) && Intrinsics.EZpvd((Object) this.quickMgnType, (Object) strategyMoveOrderReq.quickMgnType) && Intrinsics.EZpvd(this.isTradeBorrowMode, strategyMoveOrderReq.isTradeBorrowMode) && Intrinsics.EZpvd((Object) this.ccy, (Object) strategyMoveOrderReq.ccy) && Intrinsics.EZpvd((Object) this.leftLever, (Object) strategyMoveOrderReq.leftLever) && Intrinsics.EZpvd((Object) this.rightLever, (Object) strategyMoveOrderReq.rightLever) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) strategyMoveOrderReq.tradeQuoteCcy) && Intrinsics.EZpvd((Object) this.tag, (Object) strategyMoveOrderReq.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivePx() {
        return this.activePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivePxType() {
        return this.activePxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallbackRatio() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallbackSpread() {
        return this.callbackSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeftLever() {
        return this.leftLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuickMgnType() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRightLever() {
        return this.rightLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShowSz() {
        return this.showSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.callbackRatio;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.callbackSpread;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.activePx;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = this.showSz.hashCode();
        int iHashCode5 = this.sz.hashCode();
        String str4 = this.activePxType;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.currentPrice;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.quickMgnType;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        Boolean bool = this.isTradeBorrowMode;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str7 = this.ccy;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.leftLever;
        int iHashCode11 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.rightLever;
        int iHashCode12 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.tradeQuoteCcy;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.tag;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTradeBorrowMode() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivePx(String str) {
        this.activePx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivePxType(String str) {
        this.activePxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallbackRatio(String str) {
        this.callbackRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallbackSpread(String str) {
        this.callbackSpread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentPrice(String str) {
        this.currentPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftLever(String str) {
        this.leftLever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuickMgnType(String str) {
        this.quickMgnType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightLever(String str) {
        this.rightLever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.showSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
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
        return "StrategyMoveOrderReq(callbackRatio=" + this.callbackRatio + ", callbackSpread=" + this.callbackSpread + ", activePx=" + this.activePx + ", showSz=" + this.showSz + ", sz=" + this.sz + ", activePxType=" + this.activePxType + ", currentPrice=" + this.currentPrice + ", quickMgnType=" + this.quickMgnType + ", isTradeBorrowMode=" + this.isTradeBorrowMode + ", ccy=" + this.ccy + ", leftLever=" + this.leftLever + ", rightLever=" + this.rightLever + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", tag=" + this.tag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.callbackRatio);
        parcel.writeString(this.callbackSpread);
        parcel.writeString(this.activePx);
        parcel.writeString(this.showSz);
        parcel.writeString(this.sz);
        parcel.writeString(this.activePxType);
        parcel.writeString(this.currentPrice);
        parcel.writeString(this.quickMgnType);
        Boolean bool = this.isTradeBorrowMode;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.ccy);
        parcel.writeString(this.leftLever);
        parcel.writeString(this.rightLever);
        parcel.writeString(this.tradeQuoteCcy);
        parcel.writeString(this.tag);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyMoveOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyMoveOrderReq> serializer() {
            return StrategyMoveOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyMoveOrderReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if (103 != (i & 103)) {
            PluginExceptionsKt.throwMissingFieldException(i, 103, StrategyMoveOrderReq$$serializer.INSTANCE.getDescriptor());
        }
        this.callbackRatio = str;
        this.callbackSpread = str2;
        this.activePx = str3;
        if ((i & 8) == 0) {
            this.showSz = "";
        } else {
            this.showSz = str4;
        }
        if ((i & 16) == 0) {
            this.sz = "";
        } else {
            this.sz = str5;
        }
        this.activePxType = str6;
        this.currentPrice = str7;
        if ((i & 128) == 0) {
            this.quickMgnType = null;
        } else {
            this.quickMgnType = str8;
        }
        if ((i & 256) == 0) {
            this.isTradeBorrowMode = null;
        } else {
            this.isTradeBorrowMode = bool;
        }
        if ((i & 512) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str9;
        }
        if ((i & 1024) == 0) {
            this.leftLever = null;
        } else {
            this.leftLever = str10;
        }
        if ((i & 2048) == 0) {
            this.rightLever = null;
        } else {
            this.rightLever = str11;
        }
        if ((i & 4096) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str12;
        }
        if ((i & 8192) == 0) {
            this.tag = null;
        } else {
            this.tag = str13;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyMoveOrderReq strategyMoveOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, strategyMoveOrderReq.callbackRatio);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, strategyMoveOrderReq.callbackSpread);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, strategyMoveOrderReq.activePx);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) strategyMoveOrderReq.showSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, strategyMoveOrderReq.showSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) strategyMoveOrderReq.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, strategyMoveOrderReq.sz);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, strategyMoveOrderReq.activePxType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, strategyMoveOrderReq.currentPrice);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || strategyMoveOrderReq.quickMgnType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, strategyMoveOrderReq.quickMgnType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || strategyMoveOrderReq.isTradeBorrowMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, strategyMoveOrderReq.isTradeBorrowMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || strategyMoveOrderReq.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, strategyMoveOrderReq.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || strategyMoveOrderReq.leftLever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, strategyMoveOrderReq.leftLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || strategyMoveOrderReq.rightLever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, strategyMoveOrderReq.rightLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || strategyMoveOrderReq.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, strategyMoveOrderReq.tradeQuoteCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && strategyMoveOrderReq.tag == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, strategyMoveOrderReq.tag);
    }

    public StrategyMoveOrderReq(String str, String str2, String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.callbackRatio = str;
        this.callbackSpread = str2;
        this.activePx = str3;
        this.showSz = str4;
        this.sz = str5;
        this.activePxType = str6;
        this.currentPrice = str7;
        this.quickMgnType = str8;
        this.isTradeBorrowMode = bool;
        this.ccy = str9;
        this.leftLever = str10;
        this.rightLever = str11;
        this.tradeQuoteCcy = str12;
        this.tag = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005b: CONSTRUCTOR 
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1151) call: com.okinc.unify_trade.biz.StrategyMoveOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StrategyMoveOrderReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, str6, str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13);
    }
}
