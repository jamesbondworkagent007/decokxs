package com.okinc.tradingbot.impl.futures_grid.dto;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AdjustMarginBalanceRequest implements Parcelable {
    public static final int $stable = 0;
    private final String algoId;
    private final String amt;
    private final String percent;
    private final Boolean reinvest;
    private final MarginBalanceType type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AdjustMarginBalanceRequest> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, MarginBalanceType.Companion.serializer(), null, null, null};

    public static final class Creator implements Parcelable.Creator<AdjustMarginBalanceRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdjustMarginBalanceRequest createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            MarginBalanceType marginBalanceTypeValueOf = MarginBalanceType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdjustMarginBalanceRequest(string, marginBalanceTypeValueOf, boolValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdjustMarginBalanceRequest[] newArray(int i) {
            return new AdjustMarginBalanceRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AdjustMarginBalanceRequest copy$default(AdjustMarginBalanceRequest adjustMarginBalanceRequest, String str, MarginBalanceType marginBalanceType, Boolean bool, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adjustMarginBalanceRequest.algoId;
        }
        if ((i & 2) != 0) {
            marginBalanceType = adjustMarginBalanceRequest.type;
        }
        MarginBalanceType marginBalanceType2 = marginBalanceType;
        if ((i & 4) != 0) {
            bool = adjustMarginBalanceRequest.reinvest;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            str2 = adjustMarginBalanceRequest.amt;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = adjustMarginBalanceRequest.percent;
        }
        return adjustMarginBalanceRequest.copy(str, marginBalanceType2, bool2, str4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarginBalanceType component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.reinvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdjustMarginBalanceRequest copy(@NotNull String str, @NotNull MarginBalanceType marginBalanceType, Boolean bool, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(marginBalanceType, "");
        return new AdjustMarginBalanceRequest(str, marginBalanceType, bool, str2, str3);
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
        if (!(obj instanceof AdjustMarginBalanceRequest)) {
            return false;
        }
        AdjustMarginBalanceRequest adjustMarginBalanceRequest = (AdjustMarginBalanceRequest) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) adjustMarginBalanceRequest.algoId) && this.type == adjustMarginBalanceRequest.type && Intrinsics.EZpvd(this.reinvest, adjustMarginBalanceRequest.reinvest) && Intrinsics.EZpvd((Object) this.amt, (Object) adjustMarginBalanceRequest.amt) && Intrinsics.EZpvd((Object) this.percent, (Object) adjustMarginBalanceRequest.percent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmt() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercent() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReinvest() {
        return this.reinvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarginBalanceType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        int iHashCode2 = this.type.hashCode();
        Boolean bool = this.reinvest;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str = this.amt;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.percent;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdjustMarginBalanceRequest(algoId=" + this.algoId + ", type=" + this.type + ", reinvest=" + this.reinvest + ", amt=" + this.amt + ", percent=" + this.percent + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.type.name());
        Boolean bool = this.reinvest;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.amt);
        parcel.writeString(this.percent);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.futures_grid.dto.AdjustMarginBalanceRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdjustMarginBalanceRequest> serializer() {
            return AdjustMarginBalanceRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AdjustMarginBalanceRequest(int i, String str, MarginBalanceType marginBalanceType, Boolean bool, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, AdjustMarginBalanceRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = str;
        this.type = marginBalanceType;
        if ((i & 4) == 0) {
            this.reinvest = null;
        } else {
            this.reinvest = bool;
        }
        if ((i & 8) == 0) {
            this.amt = null;
        } else {
            this.amt = str2;
        }
        if ((i & 16) == 0) {
            this.percent = null;
        } else {
            this.percent = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(AdjustMarginBalanceRequest adjustMarginBalanceRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, adjustMarginBalanceRequest.algoId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], adjustMarginBalanceRequest.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || adjustMarginBalanceRequest.reinvest != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, adjustMarginBalanceRequest.reinvest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || adjustMarginBalanceRequest.amt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, adjustMarginBalanceRequest.amt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && adjustMarginBalanceRequest.percent == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, adjustMarginBalanceRequest.percent);
    }

    public AdjustMarginBalanceRequest(@NotNull String str, @NotNull MarginBalanceType marginBalanceType, Boolean bool, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(marginBalanceType, "");
        this.algoId = str;
        this.type = marginBalanceType;
        this.reinvest = bool;
        this.amt = str2;
        this.percent = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 com.okinc.tradingbot.impl.futures_grid.dto.MarginBalanceType)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.tradingbot.impl.futures_grid.dto.MarginBalanceType, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:22) call: com.okinc.tradingbot.impl.futures_grid.dto.AdjustMarginBalanceRequest.<init>(java.lang.String, com.okinc.tradingbot.impl.futures_grid.dto.MarginBalanceType, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AdjustMarginBalanceRequest(String str, MarginBalanceType marginBalanceType, Boolean bool, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, marginBalanceType, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
