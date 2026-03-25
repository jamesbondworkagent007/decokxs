package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyReqGroup implements Parcelable {
    private final AiOrderReq aiBotReq;
    private StrategyBaseReq baseReq;
    private ContractGridReq contractGridReq;
    private DcaOrderReq dcaRequest;
    private DcdOrderReq dcdReq;
    private GridReq gridReq;
    private IceBergReq iceBergReq;
    private boolean isQuoteSize;
    private StrategyMoveOrderReq movingProfitReq;
    private RecurringOrderData recurringOrderData;
    private SignalBotReq signalBotReq;
    private SmartArbitrageReq smartArbitrageReq;
    private SmartPortfolioReq smartPortfolioReq;
    private TwapReq twapReq;
    private AutoVipProfitInfo vipProfit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StrategyReqGroup> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StrategyReqGroup> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyReqGroup createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StrategyReqGroup(StrategyBaseReq.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IceBergReq.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TwapReq.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GridReq.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ContractGridReq.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StrategyMoveOrderReq.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SignalBotReq.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SmartArbitrageReq.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RecurringOrderData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SmartPortfolioReq.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DcdOrderReq.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : AutoVipProfitInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DcaOrderReq.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AiOrderReq.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyReqGroup[] newArray(int i) {
            return new StrategyReqGroup[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyBaseReq component1() {
        return this.baseReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartPortfolioReq component10() {
        return this.smartPortfolioReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcdOrderReq component11() {
        return this.dcdReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isQuoteSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoVipProfitInfo component13() {
        return this.vipProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaOrderReq component14() {
        return this.dcaRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AiOrderReq component15() {
        return this.aiBotReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IceBergReq component2() {
        return this.iceBergReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwapReq component3() {
        return this.twapReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridReq component4() {
        return this.gridReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractGridReq component5() {
        return this.contractGridReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyMoveOrderReq component6() {
        return this.movingProfitReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalBotReq component7() {
        return this.signalBotReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbitrageReq component8() {
        return this.smartArbitrageReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringOrderData component9() {
        return this.recurringOrderData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyReqGroup copy(@NotNull StrategyBaseReq strategyBaseReq, IceBergReq iceBergReq, TwapReq twapReq, GridReq gridReq, ContractGridReq contractGridReq, StrategyMoveOrderReq strategyMoveOrderReq, SignalBotReq signalBotReq, SmartArbitrageReq smartArbitrageReq, RecurringOrderData recurringOrderData, SmartPortfolioReq smartPortfolioReq, DcdOrderReq dcdOrderReq, boolean z, AutoVipProfitInfo autoVipProfitInfo, DcaOrderReq dcaOrderReq, AiOrderReq aiOrderReq) {
        Intrinsics.checkNotNullParameter(strategyBaseReq, "");
        return new StrategyReqGroup(strategyBaseReq, iceBergReq, twapReq, gridReq, contractGridReq, strategyMoveOrderReq, signalBotReq, smartArbitrageReq, recurringOrderData, smartPortfolioReq, dcdOrderReq, z, autoVipProfitInfo, dcaOrderReq, aiOrderReq);
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
        if (!(obj instanceof StrategyReqGroup)) {
            return false;
        }
        StrategyReqGroup strategyReqGroup = (StrategyReqGroup) obj;
        return Intrinsics.EZpvd(this.baseReq, strategyReqGroup.baseReq) && Intrinsics.EZpvd(this.iceBergReq, strategyReqGroup.iceBergReq) && Intrinsics.EZpvd(this.twapReq, strategyReqGroup.twapReq) && Intrinsics.EZpvd(this.gridReq, strategyReqGroup.gridReq) && Intrinsics.EZpvd(this.contractGridReq, strategyReqGroup.contractGridReq) && Intrinsics.EZpvd(this.movingProfitReq, strategyReqGroup.movingProfitReq) && Intrinsics.EZpvd(this.signalBotReq, strategyReqGroup.signalBotReq) && Intrinsics.EZpvd(this.smartArbitrageReq, strategyReqGroup.smartArbitrageReq) && Intrinsics.EZpvd(this.recurringOrderData, strategyReqGroup.recurringOrderData) && Intrinsics.EZpvd(this.smartPortfolioReq, strategyReqGroup.smartPortfolioReq) && Intrinsics.EZpvd(this.dcdReq, strategyReqGroup.dcdReq) && this.isQuoteSize == strategyReqGroup.isQuoteSize && Intrinsics.EZpvd(this.vipProfit, strategyReqGroup.vipProfit) && Intrinsics.EZpvd(this.dcaRequest, strategyReqGroup.dcaRequest) && Intrinsics.EZpvd(this.aiBotReq, strategyReqGroup.aiBotReq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AiOrderReq getAiBotReq() {
        return this.aiBotReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyBaseReq getBaseReq() {
        return this.baseReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractGridReq getContractGridReq() {
        return this.contractGridReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaOrderReq getDcaRequest() {
        return this.dcaRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcdOrderReq getDcdReq() {
        return this.dcdReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridReq getGridReq() {
        return this.gridReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IceBergReq getIceBergReq() {
        return this.iceBergReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyMoveOrderReq getMovingProfitReq() {
        return this.movingProfitReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringOrderData getRecurringOrderData() {
        return this.recurringOrderData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalBotReq getSignalBotReq() {
        return this.signalBotReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbitrageReq getSmartArbitrageReq() {
        return this.smartArbitrageReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartPortfolioReq getSmartPortfolioReq() {
        return this.smartPortfolioReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwapReq getTwapReq() {
        return this.twapReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoVipProfitInfo getVipProfit() {
        return this.vipProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.baseReq.hashCode();
        IceBergReq iceBergReq = this.iceBergReq;
        int iHashCode2 = iceBergReq == null ? 0 : iceBergReq.hashCode();
        TwapReq twapReq = this.twapReq;
        int iHashCode3 = twapReq == null ? 0 : twapReq.hashCode();
        GridReq gridReq = this.gridReq;
        int iHashCode4 = gridReq == null ? 0 : gridReq.hashCode();
        ContractGridReq contractGridReq = this.contractGridReq;
        int iHashCode5 = contractGridReq == null ? 0 : contractGridReq.hashCode();
        StrategyMoveOrderReq strategyMoveOrderReq = this.movingProfitReq;
        int iHashCode6 = strategyMoveOrderReq == null ? 0 : strategyMoveOrderReq.hashCode();
        SignalBotReq signalBotReq = this.signalBotReq;
        int iHashCode7 = signalBotReq == null ? 0 : signalBotReq.hashCode();
        SmartArbitrageReq smartArbitrageReq = this.smartArbitrageReq;
        int iHashCode8 = smartArbitrageReq == null ? 0 : smartArbitrageReq.hashCode();
        RecurringOrderData recurringOrderData = this.recurringOrderData;
        int iHashCode9 = recurringOrderData == null ? 0 : recurringOrderData.hashCode();
        SmartPortfolioReq smartPortfolioReq = this.smartPortfolioReq;
        int iHashCode10 = smartPortfolioReq == null ? 0 : smartPortfolioReq.hashCode();
        DcdOrderReq dcdOrderReq = this.dcdReq;
        int iHashCode11 = dcdOrderReq == null ? 0 : dcdOrderReq.hashCode();
        int iHashCode12 = Boolean.hashCode(this.isQuoteSize);
        AutoVipProfitInfo autoVipProfitInfo = this.vipProfit;
        int iHashCode13 = autoVipProfitInfo == null ? 0 : autoVipProfitInfo.hashCode();
        DcaOrderReq dcaOrderReq = this.dcaRequest;
        int iHashCode14 = dcaOrderReq == null ? 0 : dcaOrderReq.hashCode();
        AiOrderReq aiOrderReq = this.aiBotReq;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (aiOrderReq == null ? 0 : aiOrderReq.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isQuoteSize() {
        return this.isQuoteSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseReq(@NotNull StrategyBaseReq strategyBaseReq) {
        Intrinsics.checkNotNullParameter(strategyBaseReq, "");
        this.baseReq = strategyBaseReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractGridReq(ContractGridReq contractGridReq) {
        this.contractGridReq = contractGridReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDcaRequest(DcaOrderReq dcaOrderReq) {
        this.dcaRequest = dcaOrderReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDcdReq(DcdOrderReq dcdOrderReq) {
        this.dcdReq = dcdOrderReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridReq(GridReq gridReq) {
        this.gridReq = gridReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIceBergReq(IceBergReq iceBergReq) {
        this.iceBergReq = iceBergReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMovingProfitReq(StrategyMoveOrderReq strategyMoveOrderReq) {
        this.movingProfitReq = strategyMoveOrderReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSize(boolean z) {
        this.isQuoteSize = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringOrderData(RecurringOrderData recurringOrderData) {
        this.recurringOrderData = recurringOrderData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalBotReq(SignalBotReq signalBotReq) {
        this.signalBotReq = signalBotReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSmartArbitrageReq(SmartArbitrageReq smartArbitrageReq) {
        this.smartArbitrageReq = smartArbitrageReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSmartPortfolioReq(SmartPortfolioReq smartPortfolioReq) {
        this.smartPortfolioReq = smartPortfolioReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTwapReq(TwapReq twapReq) {
        this.twapReq = twapReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVipProfit(AutoVipProfitInfo autoVipProfitInfo) {
        this.vipProfit = autoVipProfitInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyReqGroup(baseReq=" + this.baseReq + ", iceBergReq=" + this.iceBergReq + ", twapReq=" + this.twapReq + ", gridReq=" + this.gridReq + ", contractGridReq=" + this.contractGridReq + ", movingProfitReq=" + this.movingProfitReq + ", signalBotReq=" + this.signalBotReq + ", smartArbitrageReq=" + this.smartArbitrageReq + ", recurringOrderData=" + this.recurringOrderData + ", smartPortfolioReq=" + this.smartPortfolioReq + ", dcdReq=" + this.dcdReq + ", isQuoteSize=" + this.isQuoteSize + ", vipProfit=" + this.vipProfit + ", dcaRequest=" + this.dcaRequest + ", aiBotReq=" + this.aiBotReq + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.baseReq.writeToParcel(parcel, i);
        IceBergReq iceBergReq = this.iceBergReq;
        if (iceBergReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iceBergReq.writeToParcel(parcel, i);
        }
        TwapReq twapReq = this.twapReq;
        if (twapReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            twapReq.writeToParcel(parcel, i);
        }
        GridReq gridReq = this.gridReq;
        if (gridReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gridReq.writeToParcel(parcel, i);
        }
        ContractGridReq contractGridReq = this.contractGridReq;
        if (contractGridReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contractGridReq.writeToParcel(parcel, i);
        }
        StrategyMoveOrderReq strategyMoveOrderReq = this.movingProfitReq;
        if (strategyMoveOrderReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strategyMoveOrderReq.writeToParcel(parcel, i);
        }
        SignalBotReq signalBotReq = this.signalBotReq;
        if (signalBotReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            signalBotReq.writeToParcel(parcel, i);
        }
        SmartArbitrageReq smartArbitrageReq = this.smartArbitrageReq;
        if (smartArbitrageReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartArbitrageReq.writeToParcel(parcel, i);
        }
        RecurringOrderData recurringOrderData = this.recurringOrderData;
        if (recurringOrderData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recurringOrderData.writeToParcel(parcel, i);
        }
        SmartPortfolioReq smartPortfolioReq = this.smartPortfolioReq;
        if (smartPortfolioReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartPortfolioReq.writeToParcel(parcel, i);
        }
        DcdOrderReq dcdOrderReq = this.dcdReq;
        if (dcdOrderReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dcdOrderReq.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isQuoteSize ? 1 : 0);
        AutoVipProfitInfo autoVipProfitInfo = this.vipProfit;
        if (autoVipProfitInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoVipProfitInfo.writeToParcel(parcel, i);
        }
        DcaOrderReq dcaOrderReq = this.dcaRequest;
        if (dcaOrderReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dcaOrderReq.writeToParcel(parcel, i);
        }
        AiOrderReq aiOrderReq = this.aiBotReq;
        if (aiOrderReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aiOrderReq.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyReqGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyReqGroup> serializer() {
            return StrategyReqGroup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyReqGroup(int i, StrategyBaseReq strategyBaseReq, IceBergReq iceBergReq, TwapReq twapReq, GridReq gridReq, ContractGridReq contractGridReq, StrategyMoveOrderReq strategyMoveOrderReq, SignalBotReq signalBotReq, SmartArbitrageReq smartArbitrageReq, RecurringOrderData recurringOrderData, SmartPortfolioReq smartPortfolioReq, DcdOrderReq dcdOrderReq, boolean z, AutoVipProfitInfo autoVipProfitInfo, DcaOrderReq dcaOrderReq, AiOrderReq aiOrderReq, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, StrategyReqGroup$$serializer.INSTANCE.getDescriptor());
        }
        this.baseReq = strategyBaseReq;
        if ((i & 2) == 0) {
            this.iceBergReq = null;
        } else {
            this.iceBergReq = iceBergReq;
        }
        if ((i & 4) == 0) {
            this.twapReq = null;
        } else {
            this.twapReq = twapReq;
        }
        if ((i & 8) == 0) {
            this.gridReq = null;
        } else {
            this.gridReq = gridReq;
        }
        if ((i & 16) == 0) {
            this.contractGridReq = null;
        } else {
            this.contractGridReq = contractGridReq;
        }
        if ((i & 32) == 0) {
            this.movingProfitReq = null;
        } else {
            this.movingProfitReq = strategyMoveOrderReq;
        }
        if ((i & 64) == 0) {
            this.signalBotReq = null;
        } else {
            this.signalBotReq = signalBotReq;
        }
        if ((i & 128) == 0) {
            this.smartArbitrageReq = null;
        } else {
            this.smartArbitrageReq = smartArbitrageReq;
        }
        if ((i & 256) == 0) {
            this.recurringOrderData = null;
        } else {
            this.recurringOrderData = recurringOrderData;
        }
        if ((i & 512) == 0) {
            this.smartPortfolioReq = null;
        } else {
            this.smartPortfolioReq = smartPortfolioReq;
        }
        if ((i & 1024) == 0) {
            this.dcdReq = null;
        } else {
            this.dcdReq = dcdOrderReq;
        }
        this.isQuoteSize = (i & 2048) == 0 ? false : z;
        if ((i & 4096) == 0) {
            this.vipProfit = null;
        } else {
            this.vipProfit = autoVipProfitInfo;
        }
        if ((i & 8192) == 0) {
            this.dcaRequest = null;
        } else {
            this.dcaRequest = dcaOrderReq;
        }
        if ((i & 16384) == 0) {
            this.aiBotReq = null;
        } else {
            this.aiBotReq = aiOrderReq;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyReqGroup strategyReqGroup, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, StrategyBaseReq$$serializer.INSTANCE, strategyReqGroup.baseReq);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || strategyReqGroup.iceBergReq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IceBergReq$$serializer.INSTANCE, strategyReqGroup.iceBergReq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || strategyReqGroup.twapReq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, TwapReq$$serializer.INSTANCE, strategyReqGroup.twapReq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || strategyReqGroup.gridReq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, GridReq$$serializer.INSTANCE, strategyReqGroup.gridReq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || strategyReqGroup.contractGridReq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, ContractGridReq$$serializer.INSTANCE, strategyReqGroup.contractGridReq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || strategyReqGroup.movingProfitReq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StrategyMoveOrderReq$$serializer.INSTANCE, strategyReqGroup.movingProfitReq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || strategyReqGroup.signalBotReq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, SignalBotReq$$serializer.INSTANCE, strategyReqGroup.signalBotReq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || strategyReqGroup.smartArbitrageReq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, SmartArbitrageReq$$serializer.INSTANCE, strategyReqGroup.smartArbitrageReq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || strategyReqGroup.recurringOrderData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, RecurringOrderData$$serializer.INSTANCE, strategyReqGroup.recurringOrderData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || strategyReqGroup.smartPortfolioReq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, SmartPortfolioReq$$serializer.INSTANCE, strategyReqGroup.smartPortfolioReq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || strategyReqGroup.dcdReq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, DcdOrderReq$$serializer.INSTANCE, strategyReqGroup.dcdReq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || strategyReqGroup.isQuoteSize) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, strategyReqGroup.isQuoteSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || strategyReqGroup.vipProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, AutoVipProfitInfo$$serializer.INSTANCE, strategyReqGroup.vipProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || strategyReqGroup.dcaRequest != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, DcaOrderReq$$serializer.INSTANCE, strategyReqGroup.dcaRequest);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && strategyReqGroup.aiBotReq == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, AiOrderReq$$serializer.INSTANCE, strategyReqGroup.aiBotReq);
    }

    public StrategyReqGroup(@NotNull StrategyBaseReq strategyBaseReq, IceBergReq iceBergReq, TwapReq twapReq, GridReq gridReq, ContractGridReq contractGridReq, StrategyMoveOrderReq strategyMoveOrderReq, SignalBotReq signalBotReq, SmartArbitrageReq smartArbitrageReq, RecurringOrderData recurringOrderData, SmartPortfolioReq smartPortfolioReq, DcdOrderReq dcdOrderReq, boolean z, AutoVipProfitInfo autoVipProfitInfo, DcaOrderReq dcaOrderReq, AiOrderReq aiOrderReq) {
        Intrinsics.checkNotNullParameter(strategyBaseReq, "");
        this.baseReq = strategyBaseReq;
        this.iceBergReq = iceBergReq;
        this.twapReq = twapReq;
        this.gridReq = gridReq;
        this.contractGridReq = contractGridReq;
        this.movingProfitReq = strategyMoveOrderReq;
        this.signalBotReq = signalBotReq;
        this.smartArbitrageReq = smartArbitrageReq;
        this.recurringOrderData = recurringOrderData;
        this.smartPortfolioReq = smartPortfolioReq;
        this.dcdReq = dcdOrderReq;
        this.isQuoteSize = z;
        this.vipProfit = autoVipProfitInfo;
        this.dcaRequest = dcaOrderReq;
        this.aiBotReq = aiOrderReq;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0092: CONSTRUCTOR 
  (r16v0 com.okinc.unify_trade.biz.StrategyBaseReq)
  (wrap:com.okinc.unify_trade.biz.IceBergReq:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.IceBergReq) : (r17v0 com.okinc.unify_trade.biz.IceBergReq))
  (wrap:com.okinc.unify_trade.biz.TwapReq:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TwapReq) : (r18v0 com.okinc.unify_trade.biz.TwapReq))
  (wrap:com.okinc.unify_trade.biz.GridReq:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.GridReq) : (r19v0 com.okinc.unify_trade.biz.GridReq))
  (wrap:com.okinc.unify_trade.biz.ContractGridReq:?: TERNARY null = ((wrap:int:0x001b: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ContractGridReq) : (r20v0 com.okinc.unify_trade.biz.ContractGridReq))
  (wrap:com.okinc.unify_trade.biz.StrategyMoveOrderReq:?: TERNARY null = ((wrap:int:0x0023: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.StrategyMoveOrderReq) : (r21v0 com.okinc.unify_trade.biz.StrategyMoveOrderReq))
  (wrap:com.okinc.unify_trade.biz.SignalBotReq:?: TERNARY null = ((wrap:int:0x002b: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.SignalBotReq) : (r22v0 com.okinc.unify_trade.biz.SignalBotReq))
  (wrap:com.okinc.unify_trade.biz.SmartArbitrageReq:?: TERNARY null = ((wrap:int:0x0033: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.SmartArbitrageReq) : (r23v0 com.okinc.unify_trade.biz.SmartArbitrageReq))
  (wrap:com.okinc.unify_trade.biz.RecurringOrderData:?: TERNARY null = ((wrap:int:0x003b: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.RecurringOrderData) : (r24v0 com.okinc.unify_trade.biz.RecurringOrderData))
  (wrap:com.okinc.unify_trade.biz.SmartPortfolioReq:?: TERNARY null = ((wrap:int:0x0043: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.SmartPortfolioReq) : (r25v0 com.okinc.unify_trade.biz.SmartPortfolioReq))
  (wrap:com.okinc.unify_trade.biz.DcdOrderReq:?: TERNARY null = ((wrap:int:0x004b: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.DcdOrderReq) : (r26v0 com.okinc.unify_trade.biz.DcdOrderReq))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0053: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
  (wrap:com.okinc.unify_trade.biz.AutoVipProfitInfo:?: TERNARY null = ((wrap:int:0x005b: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.AutoVipProfitInfo) : (r28v0 com.okinc.unify_trade.biz.AutoVipProfitInfo))
  (wrap:com.okinc.unify_trade.biz.DcaOrderReq:?: TERNARY null = ((wrap:int:0x0063: ARITH (r31v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.DcaOrderReq) : (r29v0 com.okinc.unify_trade.biz.DcaOrderReq))
  (wrap:com.okinc.unify_trade.biz.AiOrderReq:?: TERNARY null = ((wrap:int:0x006b: ARITH (r31v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r30v0 com.okinc.unify_trade.biz.AiOrderReq) : (null com.okinc.unify_trade.biz.AiOrderReq))
 A[MD:(com.okinc.unify_trade.biz.StrategyBaseReq, com.okinc.unify_trade.biz.IceBergReq, com.okinc.unify_trade.biz.TwapReq, com.okinc.unify_trade.biz.GridReq, com.okinc.unify_trade.biz.ContractGridReq, com.okinc.unify_trade.biz.StrategyMoveOrderReq, com.okinc.unify_trade.biz.SignalBotReq, com.okinc.unify_trade.biz.SmartArbitrageReq, com.okinc.unify_trade.biz.RecurringOrderData, com.okinc.unify_trade.biz.SmartPortfolioReq, com.okinc.unify_trade.biz.DcdOrderReq, boolean, com.okinc.unify_trade.biz.AutoVipProfitInfo, com.okinc.unify_trade.biz.DcaOrderReq, com.okinc.unify_trade.biz.AiOrderReq):void (m)] (LINE:623) call: com.okinc.unify_trade.biz.StrategyReqGroup.<init>(com.okinc.unify_trade.biz.StrategyBaseReq, com.okinc.unify_trade.biz.IceBergReq, com.okinc.unify_trade.biz.TwapReq, com.okinc.unify_trade.biz.GridReq, com.okinc.unify_trade.biz.ContractGridReq, com.okinc.unify_trade.biz.StrategyMoveOrderReq, com.okinc.unify_trade.biz.SignalBotReq, com.okinc.unify_trade.biz.SmartArbitrageReq, com.okinc.unify_trade.biz.RecurringOrderData, com.okinc.unify_trade.biz.SmartPortfolioReq, com.okinc.unify_trade.biz.DcdOrderReq, boolean, com.okinc.unify_trade.biz.AutoVipProfitInfo, com.okinc.unify_trade.biz.DcaOrderReq, com.okinc.unify_trade.biz.AiOrderReq):void type: THIS */
    public /* synthetic */ StrategyReqGroup(StrategyBaseReq strategyBaseReq, IceBergReq iceBergReq, TwapReq twapReq, GridReq gridReq, ContractGridReq contractGridReq, StrategyMoveOrderReq strategyMoveOrderReq, SignalBotReq signalBotReq, SmartArbitrageReq smartArbitrageReq, RecurringOrderData recurringOrderData, SmartPortfolioReq smartPortfolioReq, DcdOrderReq dcdOrderReq, boolean z, AutoVipProfitInfo autoVipProfitInfo, DcaOrderReq dcaOrderReq, AiOrderReq aiOrderReq, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(strategyBaseReq, (i & 2) != 0 ? null : iceBergReq, (i & 4) != 0 ? null : twapReq, (i & 8) != 0 ? null : gridReq, (i & 16) != 0 ? null : contractGridReq, (i & 32) != 0 ? null : strategyMoveOrderReq, (i & 64) != 0 ? null : signalBotReq, (i & 128) != 0 ? null : smartArbitrageReq, (i & 256) != 0 ? null : recurringOrderData, (i & 512) != 0 ? null : smartPortfolioReq, (i & 1024) != 0 ? null : dcdOrderReq, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? null : autoVipProfitInfo, (i & 8192) != 0 ? null : dcaOrderReq, (i & 16384) == 0 ? aiOrderReq : null);
    }
}
