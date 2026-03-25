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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class ReversePreCheckResponse implements Parcelable {
    public static final int $stable = 0;
    private final String clSz;
    private final String instId;
    private final Boolean isFullOp;
    private final String leverage;
    private final String liqPx;
    private final String liqPxPriceDiff;
    private final String liqPxPriceDiffRatio;
    private final String maxOpLimit;
    private final String opPercent;
    private final String opSz;
    private final String sCode;
    private final String sMsg;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ReversePreCheckResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<ReversePreCheckResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReversePreCheckResponse createFromParcel(Parcel parcel) {
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
            return new ReversePreCheckResponse(string, string2, string3, string4, string5, string6, string7, string8, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReversePreCheckResponse[] newArray(int i) {
            return new ReversePreCheckResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.opPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.maxOpLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.clSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.opSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.liqPxPriceDiff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.liqPxPriceDiffRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isFullOp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReversePreCheckResponse copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11) {
        return new ReversePreCheckResponse(str, str2, str3, str4, str5, str6, str7, str8, bool, str9, str10, str11);
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
        if (!(obj instanceof ReversePreCheckResponse)) {
            return false;
        }
        ReversePreCheckResponse reversePreCheckResponse = (ReversePreCheckResponse) obj;
        return Intrinsics.EZpvd((Object) this.sCode, (Object) reversePreCheckResponse.sCode) && Intrinsics.EZpvd((Object) this.sMsg, (Object) reversePreCheckResponse.sMsg) && Intrinsics.EZpvd((Object) this.instId, (Object) reversePreCheckResponse.instId) && Intrinsics.EZpvd((Object) this.clSz, (Object) reversePreCheckResponse.clSz) && Intrinsics.EZpvd((Object) this.opSz, (Object) reversePreCheckResponse.opSz) && Intrinsics.EZpvd((Object) this.liqPx, (Object) reversePreCheckResponse.liqPx) && Intrinsics.EZpvd((Object) this.liqPxPriceDiff, (Object) reversePreCheckResponse.liqPxPriceDiff) && Intrinsics.EZpvd((Object) this.liqPxPriceDiffRatio, (Object) reversePreCheckResponse.liqPxPriceDiffRatio) && Intrinsics.EZpvd(this.isFullOp, reversePreCheckResponse.isFullOp) && Intrinsics.EZpvd((Object) this.opPercent, (Object) reversePreCheckResponse.opPercent) && Intrinsics.EZpvd((Object) this.maxOpLimit, (Object) reversePreCheckResponse.maxOpLimit) && Intrinsics.EZpvd((Object) this.leverage, (Object) reversePreCheckResponse.leverage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClSz() {
        return this.clSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPx() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPxPriceDiff() {
        return this.liqPxPriceDiff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPxPriceDiffRatio() {
        return this.liqPxPriceDiffRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxOpLimit() {
        return this.maxOpLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpPercent() {
        return this.opPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpSz() {
        return this.opSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSCode() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSMsg() {
        return this.sMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.sCode;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.sMsg;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.instId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.clSz;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.opSz;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.liqPx;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.liqPxPriceDiff;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.liqPxPriceDiffRatio;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        Boolean bool = this.isFullOp;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str9 = this.opPercent;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.maxOpLimit;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.leverage;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFullOp() {
        return this.isFullOp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReversePreCheckResponse(sCode=" + this.sCode + ", sMsg=" + this.sMsg + ", instId=" + this.instId + ", clSz=" + this.clSz + ", opSz=" + this.opSz + ", liqPx=" + this.liqPx + ", liqPxPriceDiff=" + this.liqPxPriceDiff + ", liqPxPriceDiffRatio=" + this.liqPxPriceDiffRatio + ", isFullOp=" + this.isFullOp + ", opPercent=" + this.opPercent + ", maxOpLimit=" + this.maxOpLimit + ", leverage=" + this.leverage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sCode);
        parcel.writeString(this.sMsg);
        parcel.writeString(this.instId);
        parcel.writeString(this.clSz);
        parcel.writeString(this.opSz);
        parcel.writeString(this.liqPx);
        parcel.writeString(this.liqPxPriceDiff);
        parcel.writeString(this.liqPxPriceDiffRatio);
        Boolean bool = this.isFullOp;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.opPercent);
        parcel.writeString(this.maxOpLimit);
        parcel.writeString(this.leverage);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ReversePreCheckResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReversePreCheckResponse> serializer() {
            return ReversePreCheckResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReversePreCheckResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4095, ReversePreCheckResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.sCode = str;
        this.sMsg = str2;
        this.instId = str3;
        this.clSz = str4;
        this.opSz = str5;
        this.liqPx = str6;
        this.liqPxPriceDiff = str7;
        this.liqPxPriceDiffRatio = str8;
        this.isFullOp = bool;
        this.opPercent = str9;
        this.maxOpLimit = str10;
        this.leverage = str11;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ReversePreCheckResponse reversePreCheckResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, reversePreCheckResponse.sCode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, reversePreCheckResponse.sMsg);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, reversePreCheckResponse.instId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, reversePreCheckResponse.clSz);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, reversePreCheckResponse.opSz);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, reversePreCheckResponse.liqPx);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, reversePreCheckResponse.liqPxPriceDiff);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, reversePreCheckResponse.liqPxPriceDiffRatio);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, reversePreCheckResponse.isFullOp);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, reversePreCheckResponse.opPercent);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, reversePreCheckResponse.maxOpLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, reversePreCheckResponse.leverage);
    }

    public ReversePreCheckResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11) {
        this.sCode = str;
        this.sMsg = str2;
        this.instId = str3;
        this.clSz = str4;
        this.opSz = str5;
        this.liqPx = str6;
        this.liqPxPriceDiff = str7;
        this.liqPxPriceDiffRatio = str8;
        this.isFullOp = bool;
        this.opPercent = str9;
        this.maxOpLimit = str10;
        this.leverage = str11;
    }
}
