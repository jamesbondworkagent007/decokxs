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
public final class AddOrderCheckResponse implements Parcelable {
    public static final int $stable = 0;
    private final String algoId;
    private final String diffAmt;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AddOrderCheckResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AddOrderCheckResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddOrderCheckResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddOrderCheckResponse(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddOrderCheckResponse[] newArray(int i) {
            return new AddOrderCheckResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddOrderCheckResponse() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddOrderCheckResponse copy$default(AddOrderCheckResponse addOrderCheckResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addOrderCheckResponse.algoId;
        }
        if ((i & 2) != 0) {
            str2 = addOrderCheckResponse.diffAmt;
        }
        return addOrderCheckResponse.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.diffAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddOrderCheckResponse copy(String str, String str2) {
        return new AddOrderCheckResponse(str, str2);
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
        if (!(obj instanceof AddOrderCheckResponse)) {
            return false;
        }
        AddOrderCheckResponse addOrderCheckResponse = (AddOrderCheckResponse) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) addOrderCheckResponse.algoId) && Intrinsics.EZpvd((Object) this.diffAmt, (Object) addOrderCheckResponse.diffAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiffAmt() {
        return this.diffAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.algoId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.diffAmt;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddOrderCheckResponse(algoId=" + this.algoId + ", diffAmt=" + this.diffAmt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.diffAmt);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.AddOrderCheckResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddOrderCheckResponse> serializer() {
            return AddOrderCheckResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddOrderCheckResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = null;
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.diffAmt = null;
        } else {
            this.diffAmt = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(AddOrderCheckResponse addOrderCheckResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || addOrderCheckResponse.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, addOrderCheckResponse.algoId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && addOrderCheckResponse.diffAmt == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, addOrderCheckResponse.diffAmt);
    }

    public AddOrderCheckResponse(String str, String str2) {
        this.algoId = str;
        this.diffAmt = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:36) call: com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.AddOrderCheckResponse.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AddOrderCheckResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
