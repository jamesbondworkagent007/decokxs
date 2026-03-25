package com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AvailableBalanceResponse implements Parcelable {
    public static final int $stable = 0;
    private final String acctAvail;
    private final String algoId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AvailableBalanceResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AvailableBalanceResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableBalanceResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AvailableBalanceResponse(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableBalanceResponse[] newArray(int i) {
            return new AvailableBalanceResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AvailableBalanceResponse() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AvailableBalanceResponse copy$default(AvailableBalanceResponse availableBalanceResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = availableBalanceResponse.algoId;
        }
        if ((i & 2) != 0) {
            str2 = availableBalanceResponse.acctAvail;
        }
        return availableBalanceResponse.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.acctAvail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AvailableBalanceResponse copy(String str, String str2) {
        return new AvailableBalanceResponse(str, str2);
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
        if (!(obj instanceof AvailableBalanceResponse)) {
            return false;
        }
        AvailableBalanceResponse availableBalanceResponse = (AvailableBalanceResponse) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) availableBalanceResponse.algoId) && Intrinsics.EZpvd((Object) this.acctAvail, (Object) availableBalanceResponse.acctAvail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctAvail() {
        return this.acctAvail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.algoId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.acctAvail;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AvailableBalanceResponse(algoId=" + this.algoId + ", acctAvail=" + this.acctAvail + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.acctAvail);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.AvailableBalanceResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AvailableBalanceResponse> serializer() {
            return AvailableBalanceResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AvailableBalanceResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = null;
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.acctAvail = null;
        } else {
            this.acctAvail = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(AvailableBalanceResponse availableBalanceResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || availableBalanceResponse.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, availableBalanceResponse.algoId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && availableBalanceResponse.acctAvail == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, availableBalanceResponse.acctAvail);
    }

    public AvailableBalanceResponse(String str, String str2) {
        this.algoId = str;
        this.acctAvail = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.AvailableBalanceResponse.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AvailableBalanceResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
