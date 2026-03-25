package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class RecommendedParamsDto implements Parcelable {
    private final List<String> eligibleInstIds;
    private final RecommendParam recommendParam;
    private final StrategyStatistics strategyStatistics;
    private final VoucherInfo voucherInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecommendedParamsDto> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<RecommendedParamsDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendedParamsDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecommendedParamsDto(parcel.readInt() == 0 ? null : VoucherInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StrategyStatistics.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readInt() != 0 ? RecommendParam.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendedParamsDto[] newArray(int i) {
            return new RecommendedParamsDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecommendedParamsDto() {
        this((VoucherInfo) null, (StrategyStatistics) null, (List) null, (RecommendParam) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.bot.RecommendedParamsDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendedParamsDto copy$default(RecommendedParamsDto recommendedParamsDto, VoucherInfo voucherInfo, StrategyStatistics strategyStatistics, List list, RecommendParam recommendParam, int i, Object obj) {
        if ((i & 1) != 0) {
            voucherInfo = recommendedParamsDto.voucherInfo;
        }
        if ((i & 2) != 0) {
            strategyStatistics = recommendedParamsDto.strategyStatistics;
        }
        if ((i & 4) != 0) {
            list = recommendedParamsDto.eligibleInstIds;
        }
        if ((i & 8) != 0) {
            recommendParam = recommendedParamsDto.recommendParam;
        }
        return recommendedParamsDto.copy(voucherInfo, strategyStatistics, list, recommendParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VoucherInfo component1() {
        return this.voucherInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyStatistics component2() {
        return this.strategyStatistics;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.eligibleInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendParam component4() {
        return this.recommendParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendedParamsDto copy(VoucherInfo voucherInfo, StrategyStatistics strategyStatistics, List<String> list, RecommendParam recommendParam) {
        return new RecommendedParamsDto(voucherInfo, strategyStatistics, list, recommendParam);
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
        if (!(obj instanceof RecommendedParamsDto)) {
            return false;
        }
        RecommendedParamsDto recommendedParamsDto = (RecommendedParamsDto) obj;
        return Intrinsics.EZpvd(this.voucherInfo, recommendedParamsDto.voucherInfo) && Intrinsics.EZpvd(this.strategyStatistics, recommendedParamsDto.strategyStatistics) && Intrinsics.EZpvd(this.eligibleInstIds, recommendedParamsDto.eligibleInstIds) && Intrinsics.EZpvd(this.recommendParam, recommendedParamsDto.recommendParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getEligibleInstIds() {
        return this.eligibleInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendParam getRecommendParam() {
        return this.recommendParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyStatistics getStrategyStatistics() {
        return this.strategyStatistics;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VoucherInfo getVoucherInfo() {
        return this.voucherInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        VoucherInfo voucherInfo = this.voucherInfo;
        int iHashCode = voucherInfo == null ? 0 : voucherInfo.hashCode();
        StrategyStatistics strategyStatistics = this.strategyStatistics;
        int iHashCode2 = strategyStatistics == null ? 0 : strategyStatistics.hashCode();
        List<String> list = this.eligibleInstIds;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        RecommendParam recommendParam = this.recommendParam;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (recommendParam != null ? recommendParam.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecommendedParamsDto(voucherInfo=" + this.voucherInfo + ", strategyStatistics=" + this.strategyStatistics + ", eligibleInstIds=" + this.eligibleInstIds + ", recommendParam=" + this.recommendParam + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        VoucherInfo voucherInfo = this.voucherInfo;
        if (voucherInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voucherInfo.writeToParcel(parcel, i);
        }
        StrategyStatistics strategyStatistics = this.strategyStatistics;
        if (strategyStatistics == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strategyStatistics.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.eligibleInstIds);
        RecommendParam recommendParam = this.recommendParam;
        if (recommendParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recommendParam.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.RecommendedParamsDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecommendedParamsDto> serializer() {
            return RecommendedParamsDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecommendedParamsDto(int i, VoucherInfo voucherInfo, StrategyStatistics strategyStatistics, List list, RecommendParam recommendParam, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.voucherInfo = null;
        } else {
            this.voucherInfo = voucherInfo;
        }
        if ((i & 2) == 0) {
            this.strategyStatistics = null;
        } else {
            this.strategyStatistics = strategyStatistics;
        }
        if ((i & 4) == 0) {
            this.eligibleInstIds = null;
        } else {
            this.eligibleInstIds = list;
        }
        if ((i & 8) == 0) {
            this.recommendParam = null;
        } else {
            this.recommendParam = recommendParam;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RecommendedParamsDto recommendedParamsDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || recommendedParamsDto.voucherInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, VoucherInfo$$serializer.INSTANCE, recommendedParamsDto.voucherInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || recommendedParamsDto.strategyStatistics != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StrategyStatistics$$serializer.INSTANCE, recommendedParamsDto.strategyStatistics);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || recommendedParamsDto.eligibleInstIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], recommendedParamsDto.eligibleInstIds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && recommendedParamsDto.recommendParam == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, RecommendParam$$serializer.INSTANCE, recommendedParamsDto.recommendParam);
    }

    public RecommendedParamsDto(VoucherInfo voucherInfo, StrategyStatistics strategyStatistics, List<String> list, RecommendParam recommendParam) {
        this.voucherInfo = voucherInfo;
        this.strategyStatistics = strategyStatistics;
        this.eligibleInstIds = list;
        this.recommendParam = recommendParam;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.bot.VoucherInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.VoucherInfo) : (r2v0 com.okinc.unify_trade.biz.bot.VoucherInfo))
  (wrap:com.okinc.unify_trade.biz.bot.StrategyStatistics:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.StrategyStatistics) : (r3v0 com.okinc.unify_trade.biz.bot.StrategyStatistics))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:com.okinc.unify_trade.biz.bot.RecommendParam:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.RecommendParam) : (r5v0 com.okinc.unify_trade.biz.bot.RecommendParam))
 A[MD:(com.okinc.unify_trade.biz.bot.VoucherInfo, com.okinc.unify_trade.biz.bot.StrategyStatistics, java.util.List<java.lang.String>, com.okinc.unify_trade.biz.bot.RecommendParam):void (m)] (LINE:21) call: com.okinc.unify_trade.biz.bot.RecommendedParamsDto.<init>(com.okinc.unify_trade.biz.bot.VoucherInfo, com.okinc.unify_trade.biz.bot.StrategyStatistics, java.util.List, com.okinc.unify_trade.biz.bot.RecommendParam):void type: THIS */
    public /* synthetic */ RecommendedParamsDto(VoucherInfo voucherInfo, StrategyStatistics strategyStatistics, List list, RecommendParam recommendParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : voucherInfo, (i & 2) != 0 ? null : strategyStatistics, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : recommendParam);
    }
}
