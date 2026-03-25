package com.okinc.kline.api.bean;

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

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class MarketArbCoinInfo implements Parcelable {
    public static final String SIDE_BUY_POSITION = "buy";
    public static final String SIDE_SELL_POSITION = "sell";
    private boolean isSelectLeft;
    private boolean isWatch;
    private String leftInstId;
    private String leftInstType;
    private String leftType;
    private String rightInstId;
    private String rightInstType;
    private String rightType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MarketArbCoinInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MarketArbCoinInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketArbCoinInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MarketArbCoinInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketArbCoinInfo[] newArray(int i) {
            return new MarketArbCoinInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketArbCoinInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, 255, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeftInstId() {
        return this.leftInstId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeftInstType() {
        return this.leftInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeftType() {
        return this.leftType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRightInstId() {
        return this.rightInstId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRightInstType() {
        return this.rightInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRightType() {
        return this.rightType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSelectInstId() {
        return this.isSelectLeft ? this.leftInstId : this.rightInstId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSelectInstType() {
        return this.isSelectLeft ? this.leftInstType : this.rightInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelectLeft() {
        return this.isSelectLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isWatch() {
        return this.isWatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.leftInstId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.leftInstType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.leftType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rightInstId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rightInstType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rightType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelect(boolean z) {
        this.isSelectLeft = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectLeft(boolean z) {
        this.isSelectLeft = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWatch(boolean z) {
        this.isWatch = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.leftInstId);
        parcel.writeString(this.leftInstType);
        parcel.writeString(this.leftType);
        parcel.writeString(this.rightInstId);
        parcel.writeString(this.rightInstType);
        parcel.writeString(this.rightType);
        parcel.writeInt(this.isWatch ? 1 : 0);
        parcel.writeInt(this.isSelectLeft ? 1 : 0);
    }

    public /* synthetic */ MarketArbCoinInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.leftInstId = "";
        } else {
            this.leftInstId = str;
        }
        if ((i & 2) == 0) {
            this.leftInstType = "";
        } else {
            this.leftInstType = str2;
        }
        if ((i & 4) == 0) {
            this.leftType = "";
        } else {
            this.leftType = str3;
        }
        if ((i & 8) == 0) {
            this.rightInstId = "";
        } else {
            this.rightInstId = str4;
        }
        if ((i & 16) == 0) {
            this.rightInstType = "";
        } else {
            this.rightInstType = str5;
        }
        if ((i & 32) == 0) {
            this.rightType = "";
        } else {
            this.rightType = str6;
        }
        if ((i & 64) == 0) {
            this.isWatch = false;
        } else {
            this.isWatch = z;
        }
        if ((i & 128) == 0) {
            this.isSelectLeft = true;
        } else {
            this.isSelectLeft = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MarketArbCoinInfo marketArbCoinInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) marketArbCoinInfo.leftInstId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, marketArbCoinInfo.leftInstId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) marketArbCoinInfo.leftInstType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, marketArbCoinInfo.leftInstType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) marketArbCoinInfo.leftType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, marketArbCoinInfo.leftType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) marketArbCoinInfo.rightInstId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, marketArbCoinInfo.rightInstId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) marketArbCoinInfo.rightInstType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, marketArbCoinInfo.rightInstType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) marketArbCoinInfo.rightType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, marketArbCoinInfo.rightType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || marketArbCoinInfo.isWatch) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, marketArbCoinInfo.isWatch);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && marketArbCoinInfo.isSelectLeft) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 7, marketArbCoinInfo.isSelectLeft);
    }

    public MarketArbCoinInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.leftInstId = str;
        this.leftInstType = str2;
        this.leftType = str3;
        this.rightInstId = str4;
        this.rightInstType = str5;
        this.rightType = str6;
        this.isWatch = z;
        this.isSelectLeft = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0047: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r17v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0034: ARITH (r17v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:67) call: com.okinc.kline.api.bean.MarketArbCoinInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ MarketArbCoinInfo(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? false : z, (i & 128) != 0 ? true : z2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.api.bean.MarketArbCoinInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarketArbCoinInfo> serializer() {
            return MarketArbCoinInfo$$serializer.INSTANCE;
        }
    }

    public final boolean getLeftIsBuy() {
        return Intrinsics.EZpvd((Object) this.leftType, (Object) "buy");
    }

    public final boolean getRightIsBuy() {
        return Intrinsics.EZpvd((Object) this.rightType, (Object) "buy");
    }

    public final void setSelect(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((Object) str, (Object) this.leftInstId) && Intrinsics.EZpvd((Object) str2, (Object) this.leftInstType)) {
            this.isSelectLeft = true;
        }
    }
}
