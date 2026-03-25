package com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca;

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
public final class AddOrderBody implements Parcelable {
    public static final int $stable = 0;
    private final String algoId;
    private final String amt;
    private final String ordType;
    private final String px;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AddOrderBody> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AddOrderBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddOrderBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddOrderBody(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddOrderBody[] newArray(int i) {
            return new AddOrderBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddOrderBody copy$default(AddOrderBody addOrderBody, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addOrderBody.algoId;
        }
        if ((i & 2) != 0) {
            str2 = addOrderBody.px;
        }
        if ((i & 4) != 0) {
            str3 = addOrderBody.amt;
        }
        if ((i & 8) != 0) {
            str4 = addOrderBody.ordType;
        }
        return addOrderBody.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddOrderBody copy(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AddOrderBody(str, str2, str3, str4);
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
        if (!(obj instanceof AddOrderBody)) {
            return false;
        }
        AddOrderBody addOrderBody = (AddOrderBody) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) addOrderBody.algoId) && Intrinsics.EZpvd((Object) this.px, (Object) addOrderBody.px) && Intrinsics.EZpvd((Object) this.amt, (Object) addOrderBody.amt) && Intrinsics.EZpvd((Object) this.ordType, (Object) addOrderBody.ordType);
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
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        String str = this.px;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.amt.hashCode()) * 31) + this.ordType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddOrderBody(algoId=" + this.algoId + ", px=" + this.px + ", amt=" + this.amt + ", ordType=" + this.ordType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.px);
        parcel.writeString(this.amt);
        parcel.writeString(this.ordType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.AddOrderBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddOrderBody> serializer() {
            return AddOrderBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddOrderBody(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, AddOrderBody$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = str;
        this.px = str2;
        this.amt = str3;
        this.ordType = str4;
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(AddOrderBody addOrderBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, addOrderBody.algoId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, addOrderBody.px);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, addOrderBody.amt);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, addOrderBody.ordType);
    }

    public AddOrderBody(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.algoId = str;
        this.px = str2;
        this.amt = str3;
        this.ordType = str4;
    }
}
