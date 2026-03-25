package com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.ProfitDetailResponse$$serializer;
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
public final class SmartArbWithdrawProfitResponse implements Parcelable {
    public static final int $stable;
    public static final Parcelable.Creator<SmartArbWithdrawProfitResponse> CREATOR;
    public static final Companion Companion = new Companion(null);
    private final ProfitDetailResponse arbitrageProfit;
    private final ProfitDetailResponse autoStakingProfit;
    private final ProfitDetailResponse stakingProfit;

    public static final class Creator implements Parcelable.Creator<SmartArbWithdrawProfitResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbWithdrawProfitResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SmartArbWithdrawProfitResponse((ProfitDetailResponse) parcel.readParcelable(SmartArbWithdrawProfitResponse.class.getClassLoader()), (ProfitDetailResponse) parcel.readParcelable(SmartArbWithdrawProfitResponse.class.getClassLoader()), (ProfitDetailResponse) parcel.readParcelable(SmartArbWithdrawProfitResponse.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbWithdrawProfitResponse[] newArray(int i) {
            return new SmartArbWithdrawProfitResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = ProfitDetailResponse.$stable;
        $stable = i | i | i;
        CREATOR = new Creator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartArbWithdrawProfitResponse() {
        this((ProfitDetailResponse) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SmartArbWithdrawProfitResponse copy$default(SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponse, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, ProfitDetailResponse profitDetailResponse3, int i, Object obj) {
        if ((i & 1) != 0) {
            profitDetailResponse = smartArbWithdrawProfitResponse.arbitrageProfit;
        }
        if ((i & 2) != 0) {
            profitDetailResponse2 = smartArbWithdrawProfitResponse.stakingProfit;
        }
        if ((i & 4) != 0) {
            profitDetailResponse3 = smartArbWithdrawProfitResponse.autoStakingProfit;
        }
        return smartArbWithdrawProfitResponse.copy(profitDetailResponse, profitDetailResponse2, profitDetailResponse3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse component1() {
        return this.arbitrageProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse component2() {
        return this.stakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse component3() {
        return this.autoStakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbWithdrawProfitResponse copy(ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, ProfitDetailResponse profitDetailResponse3) {
        return new SmartArbWithdrawProfitResponse(profitDetailResponse, profitDetailResponse2, profitDetailResponse3);
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
        if (!(obj instanceof SmartArbWithdrawProfitResponse)) {
            return false;
        }
        SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponse = (SmartArbWithdrawProfitResponse) obj;
        return Intrinsics.EZpvd(this.arbitrageProfit, smartArbWithdrawProfitResponse.arbitrageProfit) && Intrinsics.EZpvd(this.stakingProfit, smartArbWithdrawProfitResponse.stakingProfit) && Intrinsics.EZpvd(this.autoStakingProfit, smartArbWithdrawProfitResponse.autoStakingProfit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse getArbitrageProfit() {
        return this.arbitrageProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse getAutoStakingProfit() {
        return this.autoStakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse getStakingProfit() {
        return this.stakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ProfitDetailResponse profitDetailResponse = this.arbitrageProfit;
        int iHashCode = profitDetailResponse == null ? 0 : profitDetailResponse.hashCode();
        ProfitDetailResponse profitDetailResponse2 = this.stakingProfit;
        int iHashCode2 = profitDetailResponse2 == null ? 0 : profitDetailResponse2.hashCode();
        ProfitDetailResponse profitDetailResponse3 = this.autoStakingProfit;
        return (((iHashCode * 31) + iHashCode2) * 31) + (profitDetailResponse3 != null ? profitDetailResponse3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartArbWithdrawProfitResponse(arbitrageProfit=" + this.arbitrageProfit + ", stakingProfit=" + this.stakingProfit + ", autoStakingProfit=" + this.autoStakingProfit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.arbitrageProfit, i);
        parcel.writeParcelable(this.stakingProfit, i);
        parcel.writeParcelable(this.autoStakingProfit, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.SmartArbWithdrawProfitResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartArbWithdrawProfitResponse> serializer() {
            return SmartArbWithdrawProfitResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartArbWithdrawProfitResponse(int i, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, ProfitDetailResponse profitDetailResponse3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.arbitrageProfit = null;
        } else {
            this.arbitrageProfit = profitDetailResponse;
        }
        if ((i & 2) == 0) {
            this.stakingProfit = null;
        } else {
            this.stakingProfit = profitDetailResponse2;
        }
        if ((i & 4) == 0) {
            this.autoStakingProfit = null;
        } else {
            this.autoStakingProfit = profitDetailResponse3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || smartArbWithdrawProfitResponse.arbitrageProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ProfitDetailResponse$$serializer.INSTANCE, smartArbWithdrawProfitResponse.arbitrageProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || smartArbWithdrawProfitResponse.stakingProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ProfitDetailResponse$$serializer.INSTANCE, smartArbWithdrawProfitResponse.stakingProfit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && smartArbWithdrawProfitResponse.autoStakingProfit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, ProfitDetailResponse$$serializer.INSTANCE, smartArbWithdrawProfitResponse.autoStakingProfit);
    }

    public SmartArbWithdrawProfitResponse(ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, ProfitDetailResponse profitDetailResponse3) {
        this.arbitrageProfit = profitDetailResponse;
        this.stakingProfit = profitDetailResponse2;
        this.autoStakingProfit = profitDetailResponse3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.ProfitDetailResponse:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ProfitDetailResponse) : (r2v0 com.okinc.unify_trade.biz.ProfitDetailResponse))
  (wrap:com.okinc.unify_trade.biz.ProfitDetailResponse:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ProfitDetailResponse) : (r3v0 com.okinc.unify_trade.biz.ProfitDetailResponse))
  (wrap:com.okinc.unify_trade.biz.ProfitDetailResponse:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ProfitDetailResponse) : (r4v0 com.okinc.unify_trade.biz.ProfitDetailResponse))
 A[MD:(com.okinc.unify_trade.biz.ProfitDetailResponse, com.okinc.unify_trade.biz.ProfitDetailResponse, com.okinc.unify_trade.biz.ProfitDetailResponse):void (m)] (LINE:13) call: com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.SmartArbWithdrawProfitResponse.<init>(com.okinc.unify_trade.biz.ProfitDetailResponse, com.okinc.unify_trade.biz.ProfitDetailResponse, com.okinc.unify_trade.biz.ProfitDetailResponse):void type: THIS */
    public /* synthetic */ SmartArbWithdrawProfitResponse(ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, ProfitDetailResponse profitDetailResponse3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : profitDetailResponse, (i & 2) != 0 ? null : profitDetailResponse2, (i & 4) != 0 ? null : profitDetailResponse3);
    }
}
