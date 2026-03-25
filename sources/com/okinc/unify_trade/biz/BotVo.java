package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.bot.AiBotDto;
import com.okinc.unify_trade.biz.bot.AiBotDto$$serializer;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingParam;
import com.okinc.unify_trade.biz.bot.BacktestDto;
import com.okinc.unify_trade.biz.bot.BacktestDto$$serializer;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.bot.BotCommon$$serializer;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56068xvo;
import o.C56071xvr;
import o.C56114xwh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class BotVo implements Parcelable {
    private final AiBotDto ai;
    private final BacktestDto backtest;
    private final BotCommon common;
    private final String compliancePauseDisplayType;
    private final ContractGridVo contractGrid;
    private final RecurringBuyDto recurring;
    private final SmartArbitrageVo smartArbitrage;
    private final SpotDCADto spotDca;
    private final SpotGridVo spotGrid;
    private final UserInfo userInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BotVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotVo(parcel.readInt() == 0 ? null : SmartArbitrageVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BotCommon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UserInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : SpotGridVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AiBotDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BacktestDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ContractGridVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SpotDCADto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RecurringBuyDto.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotVo[] newArray(int i) {
            return new BotVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotVo() {
        this((SmartArbitrageVo) null, (BotCommon) null, (UserInfo) null, (String) null, (SpotGridVo) null, (AiBotDto) null, (BacktestDto) null, (ContractGridVo) null, (SpotDCADto) null, (RecurringBuyDto) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbitrageVo component1() {
        return this.smartArbitrage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyDto component10() {
        return this.recurring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotCommon component2() {
        return this.common;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserInfo component3() {
        return this.userInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.compliancePauseDisplayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotGridVo component5() {
        return this.spotGrid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AiBotDto component6() {
        return this.ai;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BacktestDto component7() {
        return this.backtest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractGridVo component8() {
        return this.contractGrid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotDCADto component9() {
        return this.spotDca;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotVo copy(SmartArbitrageVo smartArbitrageVo, BotCommon botCommon, UserInfo userInfo, String str, SpotGridVo spotGridVo, AiBotDto aiBotDto, BacktestDto backtestDto, ContractGridVo contractGridVo, SpotDCADto spotDCADto, RecurringBuyDto recurringBuyDto) {
        return new BotVo(smartArbitrageVo, botCommon, userInfo, str, spotGridVo, aiBotDto, backtestDto, contractGridVo, spotDCADto, recurringBuyDto);
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
        if (!(obj instanceof BotVo)) {
            return false;
        }
        BotVo botVo = (BotVo) obj;
        return Intrinsics.EZpvd(this.smartArbitrage, botVo.smartArbitrage) && Intrinsics.EZpvd(this.common, botVo.common) && Intrinsics.EZpvd(this.userInfo, botVo.userInfo) && Intrinsics.EZpvd((Object) this.compliancePauseDisplayType, (Object) botVo.compliancePauseDisplayType) && Intrinsics.EZpvd(this.spotGrid, botVo.spotGrid) && Intrinsics.EZpvd(this.ai, botVo.ai) && Intrinsics.EZpvd(this.backtest, botVo.backtest) && Intrinsics.EZpvd(this.contractGrid, botVo.contractGrid) && Intrinsics.EZpvd(this.spotDca, botVo.spotDca) && Intrinsics.EZpvd(this.recurring, botVo.recurring);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AiBotDto getAi() {
        return this.ai;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BacktestDto getBacktest() {
        return this.backtest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotCommon getCommon() {
        return this.common;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCompliancePauseDisplayType() {
        return this.compliancePauseDisplayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractGridVo getContractGrid() {
        return this.contractGrid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyDto getRecurring() {
        return this.recurring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbitrageVo getSmartArbitrage() {
        return this.smartArbitrage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotDCADto getSpotDca() {
        return this.spotDca;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotGridVo getSpotGrid() {
        return this.spotGrid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        SmartArbitrageVo smartArbitrageVo = this.smartArbitrage;
        int iHashCode = smartArbitrageVo == null ? 0 : smartArbitrageVo.hashCode();
        BotCommon botCommon = this.common;
        int iHashCode2 = botCommon == null ? 0 : botCommon.hashCode();
        UserInfo userInfo = this.userInfo;
        int iHashCode3 = userInfo == null ? 0 : userInfo.hashCode();
        String str = this.compliancePauseDisplayType;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        SpotGridVo spotGridVo = this.spotGrid;
        int iHashCode5 = spotGridVo == null ? 0 : spotGridVo.hashCode();
        AiBotDto aiBotDto = this.ai;
        int iHashCode6 = aiBotDto == null ? 0 : aiBotDto.hashCode();
        BacktestDto backtestDto = this.backtest;
        int iHashCode7 = backtestDto == null ? 0 : backtestDto.hashCode();
        ContractGridVo contractGridVo = this.contractGrid;
        int iHashCode8 = contractGridVo == null ? 0 : contractGridVo.hashCode();
        SpotDCADto spotDCADto = this.spotDca;
        int iHashCode9 = spotDCADto == null ? 0 : spotDCADto.hashCode();
        RecurringBuyDto recurringBuyDto = this.recurring;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (recurringBuyDto != null ? recurringBuyDto.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotVo(smartArbitrage=" + this.smartArbitrage + ", common=" + this.common + ", userInfo=" + this.userInfo + ", compliancePauseDisplayType=" + this.compliancePauseDisplayType + ", spotGrid=" + this.spotGrid + ", ai=" + this.ai + ", backtest=" + this.backtest + ", contractGrid=" + this.contractGrid + ", spotDca=" + this.spotDca + ", recurring=" + this.recurring + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        SmartArbitrageVo smartArbitrageVo = this.smartArbitrage;
        if (smartArbitrageVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartArbitrageVo.writeToParcel(parcel, i);
        }
        BotCommon botCommon = this.common;
        if (botCommon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botCommon.writeToParcel(parcel, i);
        }
        UserInfo userInfo = this.userInfo;
        if (userInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.compliancePauseDisplayType);
        SpotGridVo spotGridVo = this.spotGrid;
        if (spotGridVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spotGridVo.writeToParcel(parcel, i);
        }
        AiBotDto aiBotDto = this.ai;
        if (aiBotDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aiBotDto.writeToParcel(parcel, i);
        }
        BacktestDto backtestDto = this.backtest;
        if (backtestDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            backtestDto.writeToParcel(parcel, i);
        }
        ContractGridVo contractGridVo = this.contractGrid;
        if (contractGridVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contractGridVo.writeToParcel(parcel, i);
        }
        SpotDCADto spotDCADto = this.spotDca;
        if (spotDCADto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spotDCADto.writeToParcel(parcel, i);
        }
        RecurringBuyDto recurringBuyDto = this.recurring;
        if (recurringBuyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recurringBuyDto.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotVo> serializer() {
            return BotVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotVo(int i, SmartArbitrageVo smartArbitrageVo, BotCommon botCommon, UserInfo userInfo, String str, SpotGridVo spotGridVo, AiBotDto aiBotDto, BacktestDto backtestDto, ContractGridVo contractGridVo, SpotDCADto spotDCADto, RecurringBuyDto recurringBuyDto, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.smartArbitrage = null;
        } else {
            this.smartArbitrage = smartArbitrageVo;
        }
        if ((i & 2) == 0) {
            this.common = null;
        } else {
            this.common = botCommon;
        }
        if ((i & 4) == 0) {
            this.userInfo = null;
        } else {
            this.userInfo = userInfo;
        }
        if ((i & 8) == 0) {
            this.compliancePauseDisplayType = null;
        } else {
            this.compliancePauseDisplayType = str;
        }
        if ((i & 16) == 0) {
            this.spotGrid = null;
        } else {
            this.spotGrid = spotGridVo;
        }
        if ((i & 32) == 0) {
            this.ai = null;
        } else {
            this.ai = aiBotDto;
        }
        if ((i & 64) == 0) {
            this.backtest = null;
        } else {
            this.backtest = backtestDto;
        }
        if ((i & 128) == 0) {
            this.contractGrid = null;
        } else {
            this.contractGrid = contractGridVo;
        }
        if ((i & 256) == 0) {
            this.spotDca = null;
        } else {
            this.spotDca = spotDCADto;
        }
        if ((i & 512) == 0) {
            this.recurring = null;
        } else {
            this.recurring = recurringBuyDto;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotVo botVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botVo.smartArbitrage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, SmartArbitrageVo$$serializer.INSTANCE, botVo.smartArbitrage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || botVo.common != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BotCommon$$serializer.INSTANCE, botVo.common);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || botVo.userInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, UserInfo$$serializer.INSTANCE, botVo.userInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || botVo.compliancePauseDisplayType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, botVo.compliancePauseDisplayType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || botVo.spotGrid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, SpotGridVo$$serializer.INSTANCE, botVo.spotGrid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || botVo.ai != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, AiBotDto$$serializer.INSTANCE, botVo.ai);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || botVo.backtest != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BacktestDto$$serializer.INSTANCE, botVo.backtest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || botVo.contractGrid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, ContractGridVo$$serializer.INSTANCE, botVo.contractGrid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || botVo.spotDca != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, SpotDCADto$$serializer.INSTANCE, botVo.spotDca);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && botVo.recurring == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, RecurringBuyDto$$serializer.INSTANCE, botVo.recurring);
    }

    public BotVo(SmartArbitrageVo smartArbitrageVo, BotCommon botCommon, UserInfo userInfo, String str, SpotGridVo spotGridVo, AiBotDto aiBotDto, BacktestDto backtestDto, ContractGridVo contractGridVo, SpotDCADto spotDCADto, RecurringBuyDto recurringBuyDto) {
        this.smartArbitrage = smartArbitrageVo;
        this.common = botCommon;
        this.userInfo = userInfo;
        this.compliancePauseDisplayType = str;
        this.spotGrid = spotGridVo;
        this.ai = aiBotDto;
        this.backtest = backtestDto;
        this.contractGrid = contractGridVo;
        this.spotDca = spotDCADto;
        this.recurring = recurringBuyDto;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.SmartArbitrageVo:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.SmartArbitrageVo) : (r12v0 com.okinc.unify_trade.biz.SmartArbitrageVo))
  (wrap:com.okinc.unify_trade.biz.bot.BotCommon:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.BotCommon) : (r13v0 com.okinc.unify_trade.biz.bot.BotCommon))
  (wrap:com.okinc.unify_trade.biz.UserInfo:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.UserInfo) : (r14v0 com.okinc.unify_trade.biz.UserInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.SpotGridVo:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.SpotGridVo) : (r16v0 com.okinc.unify_trade.biz.SpotGridVo))
  (wrap:com.okinc.unify_trade.biz.bot.AiBotDto:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.AiBotDto) : (r17v0 com.okinc.unify_trade.biz.bot.AiBotDto))
  (wrap:com.okinc.unify_trade.biz.bot.BacktestDto:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.BacktestDto) : (r18v0 com.okinc.unify_trade.biz.bot.BacktestDto))
  (wrap:com.okinc.unify_trade.biz.ContractGridVo:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ContractGridVo) : (r19v0 com.okinc.unify_trade.biz.ContractGridVo))
  (wrap:com.okinc.unify_trade.biz.SpotDCADto:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.SpotDCADto) : (r20v0 com.okinc.unify_trade.biz.SpotDCADto))
  (wrap:com.okinc.unify_trade.biz.RecurringBuyDto:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 com.okinc.unify_trade.biz.RecurringBuyDto) : (null com.okinc.unify_trade.biz.RecurringBuyDto))
 A[MD:(com.okinc.unify_trade.biz.SmartArbitrageVo, com.okinc.unify_trade.biz.bot.BotCommon, com.okinc.unify_trade.biz.UserInfo, java.lang.String, com.okinc.unify_trade.biz.SpotGridVo, com.okinc.unify_trade.biz.bot.AiBotDto, com.okinc.unify_trade.biz.bot.BacktestDto, com.okinc.unify_trade.biz.ContractGridVo, com.okinc.unify_trade.biz.SpotDCADto, com.okinc.unify_trade.biz.RecurringBuyDto):void (m)] (LINE:20) call: com.okinc.unify_trade.biz.BotVo.<init>(com.okinc.unify_trade.biz.SmartArbitrageVo, com.okinc.unify_trade.biz.bot.BotCommon, com.okinc.unify_trade.biz.UserInfo, java.lang.String, com.okinc.unify_trade.biz.SpotGridVo, com.okinc.unify_trade.biz.bot.AiBotDto, com.okinc.unify_trade.biz.bot.BacktestDto, com.okinc.unify_trade.biz.ContractGridVo, com.okinc.unify_trade.biz.SpotDCADto, com.okinc.unify_trade.biz.RecurringBuyDto):void type: THIS */
    public /* synthetic */ BotVo(SmartArbitrageVo smartArbitrageVo, BotCommon botCommon, UserInfo userInfo, String str, SpotGridVo spotGridVo, AiBotDto aiBotDto, BacktestDto backtestDto, ContractGridVo contractGridVo, SpotDCADto spotDCADto, RecurringBuyDto recurringBuyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : smartArbitrageVo, (i & 2) != 0 ? null : botCommon, (i & 4) != 0 ? null : userInfo, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : spotGridVo, (i & 32) != 0 ? null : aiBotDto, (i & 64) != 0 ? null : backtestDto, (i & 128) != 0 ? null : contractGridVo, (i & 256) != 0 ? null : spotDCADto, (i & 512) == 0 ? recurringBuyDto : null);
    }

    public final boolean getShouldShowAutoEarn() {
        return !C56071xvr.gEmmrt.ejfBZ();
    }

    public final boolean getShouldShowAutoStake() {
        return !C56071xvr.gEmmrt.ejfBZ();
    }

    public final boolean isAutoStaking() {
        AutoEarnStakingParam autoStaking;
        List<String> listKWHzl = C56114xwh.KWHzl();
        BotCommon botCommon = this.common;
        return CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) listKWHzl), (botCommon == null || (autoStaking = botCommon.getAutoStaking()) == null) ? null : autoStaking.getStatus());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isEarnOngoing(BizTradeStrategyInfo bizTradeStrategyInfo) {
        String totalProfit;
        BotCommon botCommon;
        AutoEarnStakingParam autoEarn;
        AutoEarnStakingParam autoEarn2;
        BotCommon botCommon2 = this.common;
        String status = (botCommon2 == null || (autoEarn2 = botCommon2.getAutoEarn()) == null) ? null : autoEarn2.getStatus();
        if (getShouldShowAutoEarn()) {
            BotCommon botCommon3 = this.common;
            if ((botCommon3 != null ? botCommon3.getAutoEarn() : null) != null && (botCommon = this.common) != null && (autoEarn = botCommon.getAutoEarn()) != null) {
                totalProfit = autoEarn.getTotalProfit();
            }
        } else {
            totalProfit = null;
        }
        return C56068xvo.copydefault.copydefault(totalProfit, status, bizTradeStrategyInfo != null ? Boolean.valueOf(bizTradeStrategyInfo.isHistoryOrder()) : null);
    }
}
