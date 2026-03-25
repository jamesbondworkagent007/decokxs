package com.okinc.tradingbot.impl.futures_grid.dto;

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
public final class PositionMarginBalanceResponse implements Parcelable {
    public static final int $stable = 0;
    private final String accAmt;
    private final String lever;
    private final String maxAmt;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PositionMarginBalanceResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PositionMarginBalanceResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionMarginBalanceResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PositionMarginBalanceResponse(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionMarginBalanceResponse[] newArray(int i) {
            return new PositionMarginBalanceResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PositionMarginBalanceResponse copy$default(PositionMarginBalanceResponse positionMarginBalanceResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positionMarginBalanceResponse.maxAmt;
        }
        if ((i & 2) != 0) {
            str2 = positionMarginBalanceResponse.lever;
        }
        if ((i & 4) != 0) {
            str3 = positionMarginBalanceResponse.accAmt;
        }
        return positionMarginBalanceResponse.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.maxAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionMarginBalanceResponse copy(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PositionMarginBalanceResponse(str, str2, str3);
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
        if (!(obj instanceof PositionMarginBalanceResponse)) {
            return false;
        }
        PositionMarginBalanceResponse positionMarginBalanceResponse = (PositionMarginBalanceResponse) obj;
        return Intrinsics.EZpvd((Object) this.maxAmt, (Object) positionMarginBalanceResponse.maxAmt) && Intrinsics.EZpvd((Object) this.lever, (Object) positionMarginBalanceResponse.lever) && Intrinsics.EZpvd((Object) this.accAmt, (Object) positionMarginBalanceResponse.accAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccAmt() {
        return this.accAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAmt() {
        return this.maxAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.maxAmt.hashCode();
        int iHashCode2 = this.lever.hashCode();
        String str = this.accAmt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PositionMarginBalanceResponse(maxAmt=" + this.maxAmt + ", lever=" + this.lever + ", accAmt=" + this.accAmt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.maxAmt);
        parcel.writeString(this.lever);
        parcel.writeString(this.accAmt);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.futures_grid.dto.PositionMarginBalanceResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PositionMarginBalanceResponse> serializer() {
            return PositionMarginBalanceResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PositionMarginBalanceResponse(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PositionMarginBalanceResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.maxAmt = str;
        this.lever = str2;
        if ((i & 4) == 0) {
            this.accAmt = null;
        } else {
            this.accAmt = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(PositionMarginBalanceResponse positionMarginBalanceResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, positionMarginBalanceResponse.maxAmt);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, positionMarginBalanceResponse.lever);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && positionMarginBalanceResponse.accAmt == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, positionMarginBalanceResponse.accAmt);
    }

    public PositionMarginBalanceResponse(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.maxAmt = str;
        this.lever = str2;
        this.accAmt = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:20) call: com.okinc.tradingbot.impl.futures_grid.dto.PositionMarginBalanceResponse.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PositionMarginBalanceResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
