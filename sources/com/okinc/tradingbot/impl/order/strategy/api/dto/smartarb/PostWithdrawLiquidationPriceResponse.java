package com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class PostWithdrawLiquidationPriceResponse implements Parcelable {
    public static final int $stable = 0;
    private final String liquidPrice;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PostWithdrawLiquidationPriceResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PostWithdrawLiquidationPriceResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PostWithdrawLiquidationPriceResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PostWithdrawLiquidationPriceResponse(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PostWithdrawLiquidationPriceResponse[] newArray(int i) {
            return new PostWithdrawLiquidationPriceResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PostWithdrawLiquidationPriceResponse() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PostWithdrawLiquidationPriceResponse copy$default(PostWithdrawLiquidationPriceResponse postWithdrawLiquidationPriceResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postWithdrawLiquidationPriceResponse.liquidPrice;
        }
        return postWithdrawLiquidationPriceResponse.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.liquidPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PostWithdrawLiquidationPriceResponse copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PostWithdrawLiquidationPriceResponse(str);
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
        return (obj instanceof PostWithdrawLiquidationPriceResponse) && Intrinsics.EZpvd((Object) this.liquidPrice, (Object) ((PostWithdrawLiquidationPriceResponse) obj).liquidPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidPrice() {
        return this.liquidPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.liquidPrice.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PostWithdrawLiquidationPriceResponse(liquidPrice=" + this.liquidPrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.liquidPrice);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.PostWithdrawLiquidationPriceResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PostWithdrawLiquidationPriceResponse> serializer() {
            return PostWithdrawLiquidationPriceResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PostWithdrawLiquidationPriceResponse(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.liquidPrice = "";
        } else {
            this.liquidPrice = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(PostWithdrawLiquidationPriceResponse postWithdrawLiquidationPriceResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) postWithdrawLiquidationPriceResponse.liquidPrice, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 0, postWithdrawLiquidationPriceResponse.liquidPrice);
    }

    public PostWithdrawLiquidationPriceResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liquidPrice = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:38) call: com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.PostWithdrawLiquidationPriceResponse.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ PostWithdrawLiquidationPriceResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
