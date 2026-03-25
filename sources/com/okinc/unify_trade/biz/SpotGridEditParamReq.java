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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SpotGridEditParamReq implements Parcelable {
    private String algoId;
    private String estimatedPositionToClose;
    private String gridNum;
    private String longLiqPx;
    private String maxPx;
    private String minPx;
    private String perMaxProfitRate;
    private String perMinProfitRate;
    private String shortLiqPx;
    private String topupAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpotGridEditParamReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SpotGridEditParamReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotGridEditParamReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotGridEditParamReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotGridEditParamReq[] newArray(int i) {
            return new SpotGridEditParamReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotGridEditParamReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedPositionToClose() {
        return this.estimatedPositionToClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridNum() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLongLiqPx() {
        return this.longLiqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPx() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPx() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerMaxProfitRate() {
        return this.perMaxProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerMinProfitRate() {
        return this.perMinProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortLiqPx() {
        return this.shortLiqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopupAmount() {
        return this.topupAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(String str) {
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedPositionToClose(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimatedPositionToClose = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gridNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLongLiqPx(String str) {
        this.longLiqPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerMaxProfitRate(String str) {
        this.perMaxProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerMinProfitRate(String str) {
        this.perMinProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortLiqPx(String str) {
        this.shortLiqPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopupAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.topupAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.minPx);
        parcel.writeString(this.maxPx);
        parcel.writeString(this.gridNum);
        parcel.writeString(this.topupAmount);
        parcel.writeString(this.perMinProfitRate);
        parcel.writeString(this.perMaxProfitRate);
        parcel.writeString(this.longLiqPx);
        parcel.writeString(this.shortLiqPx);
        parcel.writeString(this.estimatedPositionToClose);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpotGridEditParamReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotGridEditParamReq> serializer() {
            return SpotGridEditParamReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotGridEditParamReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = null;
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.minPx = "";
        } else {
            this.minPx = str2;
        }
        if ((i & 4) == 0) {
            this.maxPx = "";
        } else {
            this.maxPx = str3;
        }
        if ((i & 8) == 0) {
            this.gridNum = "";
        } else {
            this.gridNum = str4;
        }
        if ((i & 16) == 0) {
            this.topupAmount = "";
        } else {
            this.topupAmount = str5;
        }
        if ((i & 32) == 0) {
            this.perMinProfitRate = null;
        } else {
            this.perMinProfitRate = str6;
        }
        if ((i & 64) == 0) {
            this.perMaxProfitRate = null;
        } else {
            this.perMaxProfitRate = str7;
        }
        if ((i & 128) == 0) {
            this.longLiqPx = null;
        } else {
            this.longLiqPx = str8;
        }
        if ((i & 256) == 0) {
            this.shortLiqPx = null;
        } else {
            this.shortLiqPx = str9;
        }
        if ((i & 512) == 0) {
            this.estimatedPositionToClose = "";
        } else {
            this.estimatedPositionToClose = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpotGridEditParamReq spotGridEditParamReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spotGridEditParamReq.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spotGridEditParamReq.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) spotGridEditParamReq.minPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, spotGridEditParamReq.minPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) spotGridEditParamReq.maxPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, spotGridEditParamReq.maxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) spotGridEditParamReq.gridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, spotGridEditParamReq.gridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) spotGridEditParamReq.topupAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, spotGridEditParamReq.topupAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || spotGridEditParamReq.perMinProfitRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, spotGridEditParamReq.perMinProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || spotGridEditParamReq.perMaxProfitRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, spotGridEditParamReq.perMaxProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || spotGridEditParamReq.longLiqPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, spotGridEditParamReq.longLiqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || spotGridEditParamReq.shortLiqPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, spotGridEditParamReq.shortLiqPx);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) spotGridEditParamReq.estimatedPositionToClose, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, spotGridEditParamReq.estimatedPositionToClose);
    }

    public SpotGridEditParamReq(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.algoId = str;
        this.minPx = str2;
        this.maxPx = str3;
        this.gridNum = str4;
        this.topupAmount = str5;
        this.perMinProfitRate = str6;
        this.perMaxProfitRate = str7;
        this.longLiqPx = str8;
        this.shortLiqPx = str9;
        this.estimatedPositionToClose = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0063: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r23v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r23v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:781) call: com.okinc.unify_trade.biz.SpotGridEditParamReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotGridEditParamReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null, (i & 512) == 0 ? str10 : "");
    }
}
