package com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SmartArbWithdrawProfitBody implements Parcelable {
    public static final int $stable = 0;
    private final String algoId;
    private final String amount;
    private final String ccy;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SmartArbWithdrawProfitBody> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SmartArbWithdrawProfitBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbWithdrawProfitBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SmartArbWithdrawProfitBody(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbWithdrawProfitBody[] newArray(int i) {
            return new SmartArbWithdrawProfitBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SmartArbWithdrawProfitBody copy$default(SmartArbWithdrawProfitBody smartArbWithdrawProfitBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smartArbWithdrawProfitBody.algoId;
        }
        if ((i & 2) != 0) {
            str2 = smartArbWithdrawProfitBody.ccy;
        }
        if ((i & 4) != 0) {
            str3 = smartArbWithdrawProfitBody.amount;
        }
        return smartArbWithdrawProfitBody.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbWithdrawProfitBody copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SmartArbWithdrawProfitBody(str, str2, str3);
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
        if (!(obj instanceof SmartArbWithdrawProfitBody)) {
            return false;
        }
        SmartArbWithdrawProfitBody smartArbWithdrawProfitBody = (SmartArbWithdrawProfitBody) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) smartArbWithdrawProfitBody.algoId) && Intrinsics.EZpvd((Object) this.ccy, (Object) smartArbWithdrawProfitBody.ccy) && Intrinsics.EZpvd((Object) this.amount, (Object) smartArbWithdrawProfitBody.amount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.algoId.hashCode() * 31) + this.ccy.hashCode()) * 31) + this.amount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartArbWithdrawProfitBody(algoId=" + this.algoId + ", ccy=" + this.ccy + ", amount=" + this.amount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.ccy);
        parcel.writeString(this.amount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.SmartArbWithdrawProfitBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartArbWithdrawProfitBody> serializer() {
            return SmartArbWithdrawProfitBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartArbWithdrawProfitBody(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SmartArbWithdrawProfitBody$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = str;
        this.ccy = str2;
        this.amount = str3;
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(SmartArbWithdrawProfitBody smartArbWithdrawProfitBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, smartArbWithdrawProfitBody.algoId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, smartArbWithdrawProfitBody.ccy);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, smartArbWithdrawProfitBody.amount);
    }

    public SmartArbWithdrawProfitBody(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.algoId = str;
        this.ccy = str2;
        this.amount = str3;
    }
}
