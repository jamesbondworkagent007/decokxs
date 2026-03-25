package com.okinc.tradingbot.impl.planet.dto;

import com.okinc.tradingbot.impl.dto.NumericString;
import com.okinc.tradingbot.impl.dto.NumericString$$serializer;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C53674wpu;
import o.C53677wpx;
import o.InterfaceC53630wpC;
import o.InterfaceC53632wpE;
import o.InterfaceC53633wpF;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ContractBotDto implements BotDto, InterfaceC53633wpF, InterfaceC53630wpC, InterfaceC53632wpE {
    public final String algoId;
    public final String cTime;
    public final String ccy;
    public final BotCopyType copyType;
    public final BotDirection direction;
    public final String displayId;
    public final String instFamily;
    public final String instId;
    public final String instType;
    public final String lastPrice;
    public final String leverage;
    public final String ordType;
    public final String pTime;
    public final String pnlRatioInSourceCcy;
    public final List<StrategyProfitResponse> profitSnapshots;
    public final String sourceAlgoId;
    public final String sourceCcy;
    public final String totalPnl;
    public final String totalPnlInSourceCcy;
    public final String totalPnlRatio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StrategyProfitResponse$$serializer.INSTANCE), null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.util.List)
  (r14v0 com.okinc.tradingbot.impl.planet.dto.BotCopyType)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 com.okinc.tradingbot.impl.planet.dto.BotDirection)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.planet.dto.BotDirection, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] call: com.okinc.tradingbot.impl.planet.dto.ContractBotDto.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.planet.dto.BotDirection, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ContractBotDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BotCopyType botCopyType, String str12, String str13, BotDirection botDirection, String str14, String str15, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, botCopyType, str12, str13, botDirection, str14, str15, str16, str17, serializationConstructorMarker);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.util.List)
  (r13v0 com.okinc.tradingbot.impl.planet.dto.BotCopyType)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 com.okinc.tradingbot.impl.planet.dto.BotDirection)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.StrategyProfitResponse>, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.planet.dto.BotDirection, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] call: com.okinc.tradingbot.impl.planet.dto.ContractBotDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.planet.dto.BotDirection, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ContractBotDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BotCopyType botCopyType, String str12, String str13, BotDirection botDirection, String str14, String str15, String str16, String str17, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, botCopyType, str12, str13, botDirection, str14, str15, str16, str17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String AEQbTJ() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String AYXKKw() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public List<StrategyProfitResponse> AhwBna() {
        return this.profitSnapshots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53628wpA
    public String AkhnZx() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53632wpE
    public String AuCTel() {
        return this.pnlRatioInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53630wpC
    public String DbNXlk() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String EZpvd() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public BotCopyType KWHzl() {
        return this.copyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractBotDto KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull List<StrategyProfitResponse> list, @NotNull BotCopyType botCopyType, @NotNull String str12, @NotNull String str13, BotDirection botDirection, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(botCopyType, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        return new ContractBotDto(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, botCopyType, str12, str13, botDirection, str14, str15, str16, str17, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String OLrzqt() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String copydefault() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String djBIcL() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContractBotDto)) {
            return false;
        }
        ContractBotDto contractBotDto = (ContractBotDto) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) contractBotDto.algoId) && Intrinsics.EZpvd((Object) this.instId, (Object) contractBotDto.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) contractBotDto.displayId) && Intrinsics.EZpvd((Object) this.instType, (Object) contractBotDto.instType) && Intrinsics.EZpvd((Object) this.instFamily, (Object) contractBotDto.instFamily) && Intrinsics.EZpvd((Object) this.ordType, (Object) contractBotDto.ordType) && Intrinsics.EZpvd((Object) this.cTime, (Object) contractBotDto.cTime) && Intrinsics.EZpvd((Object) this.pTime, (Object) contractBotDto.pTime) && NumericString.EZpvd(this.totalPnl, contractBotDto.totalPnl) && NumericString.EZpvd(this.totalPnlRatio, contractBotDto.totalPnlRatio) && NumericString.EZpvd(this.lastPrice, contractBotDto.lastPrice) && Intrinsics.EZpvd(this.profitSnapshots, contractBotDto.profitSnapshots) && this.copyType == contractBotDto.copyType && Intrinsics.EZpvd((Object) this.ccy, (Object) contractBotDto.ccy) && Intrinsics.EZpvd((Object) this.leverage, (Object) contractBotDto.leverage) && this.direction == contractBotDto.direction && Intrinsics.EZpvd((Object) this.sourceCcy, (Object) contractBotDto.sourceCcy) && NumericString.EZpvd(this.totalPnlInSourceCcy, contractBotDto.totalPnlInSourceCcy) && NumericString.EZpvd(this.pnlRatioInSourceCcy, contractBotDto.pnlRatioInSourceCcy) && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) contractBotDto.sourceAlgoId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String fARcdN() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53633wpF
    public BotDirection fIwbmz() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53632wpE
    public String fJNWhG() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String fetchVPNInfo() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String gEmmrt() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53632wpE
    public String getFieldNames() {
        return this.totalPnlInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        int iHashCode2 = this.instId.hashCode();
        int iHashCode3 = this.displayId.hashCode();
        int iHashCode4 = this.instType.hashCode();
        int iHashCode5 = this.instFamily.hashCode();
        int iHashCode6 = this.ordType.hashCode();
        int iHashCode7 = this.cTime.hashCode();
        int iHashCode8 = this.pTime.hashCode();
        int iKWHzl = NumericString.KWHzl(this.totalPnl);
        int iKWHzl2 = NumericString.KWHzl(this.totalPnlRatio);
        int iKWHzl3 = NumericString.KWHzl(this.lastPrice);
        int iHashCode9 = this.profitSnapshots.hashCode();
        int iHashCode10 = this.copyType.hashCode();
        int iHashCode11 = this.ccy.hashCode();
        int iHashCode12 = this.leverage.hashCode();
        BotDirection botDirection = this.direction;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iKWHzl) * 31) + iKWHzl2) * 31) + iKWHzl3) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (botDirection == null ? 0 : botDirection.hashCode())) * 31) + this.sourceCcy.hashCode()) * 31) + NumericString.KWHzl(this.totalPnlInSourceCcy)) * 31) + NumericString.KWHzl(this.pnlRatioInSourceCcy)) * 31) + this.sourceAlgoId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String isConnected() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContractBotDto(algoId=" + this.algoId + ", instId=" + this.instId + ", displayId=" + this.displayId + ", instType=" + this.instType + ", instFamily=" + this.instFamily + ", ordType=" + this.ordType + ", cTime=" + this.cTime + ", pTime=" + this.pTime + ", totalPnl=" + NumericString.EZpvd(this.totalPnl) + ", totalPnlRatio=" + NumericString.EZpvd(this.totalPnlRatio) + ", lastPrice=" + NumericString.EZpvd(this.lastPrice) + ", profitSnapshots=" + this.profitSnapshots + ", copyType=" + this.copyType + ", ccy=" + this.ccy + ", leverage=" + this.leverage + ", direction=" + this.direction + ", sourceCcy=" + this.sourceCcy + ", totalPnlInSourceCcy=" + NumericString.EZpvd(this.totalPnlInSourceCcy) + ", pnlRatioInSourceCcy=" + NumericString.EZpvd(this.pnlRatioInSourceCcy) + ", sourceAlgoId=" + this.sourceAlgoId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String valueOf() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53679wpz
    public String values() {
        return this.leverage;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.planet.dto.ContractBotDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractBotDto> serializer() {
            return ContractBotDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContractBotDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BotCopyType botCopyType, String str12, String str13, BotDirection botDirection, String str14, String str15, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str3;
        }
        if ((i & 8) == 0) {
            this.instType = "";
        } else {
            this.instType = str4;
        }
        if ((i & 16) == 0) {
            this.instFamily = "";
        } else {
            this.instFamily = str5;
        }
        if ((i & 32) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str6;
        }
        if ((i & 64) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str7;
        }
        if ((i & 128) == 0) {
            this.pTime = "";
        } else {
            this.pTime = str8;
        }
        this.totalPnl = (i & 256) == 0 ? NumericString.Companion.copydefault() : str9;
        this.totalPnlRatio = (i & 512) == 0 ? NumericString.Companion.copydefault() : str10;
        this.lastPrice = (i & 1024) == 0 ? NumericString.Companion.copydefault() : str11;
        this.profitSnapshots = (i & 2048) == 0 ? yDY.AhwBna() : list;
        this.copyType = (i & 4096) == 0 ? BotCopyType.NotSpecified : botCopyType;
        if ((i & 8192) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str12;
        }
        if ((i & 16384) == 0) {
            this.leverage = "";
        } else {
            this.leverage = str13;
        }
        this.direction = (32768 & i) == 0 ? BotDirection.Neutral : botDirection;
        if ((65536 & i) == 0) {
            this.sourceCcy = "";
        } else {
            this.sourceCcy = str14;
        }
        this.totalPnlInSourceCcy = (131072 & i) == 0 ? NumericString.Companion.copydefault() : str15;
        this.pnlRatioInSourceCcy = (262144 & i) == 0 ? NumericString.Companion.copydefault() : str16;
        if ((i & 524288) == 0) {
            this.sourceAlgoId = "";
        } else {
            this.sourceAlgoId = str17;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [126=9] */
    public static final /* synthetic */ void OLrzqt(ContractBotDto contractBotDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) contractBotDto.EZpvd(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, contractBotDto.EZpvd());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) contractBotDto.OLrzqt(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, contractBotDto.OLrzqt());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) contractBotDto.fARcdN(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, contractBotDto.fARcdN());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) contractBotDto.djBIcL(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, contractBotDto.djBIcL());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) contractBotDto.copydefault(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, contractBotDto.copydefault());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) contractBotDto.valueOf(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, contractBotDto.valueOf());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) contractBotDto.AEQbTJ(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, contractBotDto.AEQbTJ());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) contractBotDto.AYXKKw(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, contractBotDto.AYXKKw());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !NumericString.EZpvd(contractBotDto.fetchVPNInfo(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, NumericString$$serializer.INSTANCE, NumericString.copydefault(contractBotDto.fetchVPNInfo()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !NumericString.EZpvd(contractBotDto.isConnected(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, NumericString$$serializer.INSTANCE, NumericString.copydefault(contractBotDto.isConnected()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !NumericString.EZpvd(contractBotDto.AkhnZx(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, NumericString$$serializer.INSTANCE, NumericString.copydefault(contractBotDto.AkhnZx()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(contractBotDto.AhwBna(), yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], contractBotDto.AhwBna());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || contractBotDto.KWHzl() != BotCopyType.NotSpecified) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, C53677wpx.copydefault, contractBotDto.KWHzl());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) contractBotDto.DbNXlk(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, contractBotDto.DbNXlk());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) contractBotDto.values(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, contractBotDto.values());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || contractBotDto.fIwbmz() != BotDirection.Neutral) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, C53674wpu.KWHzl, contractBotDto.fIwbmz());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) contractBotDto.fJNWhG(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, contractBotDto.fJNWhG());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !NumericString.EZpvd(contractBotDto.getFieldNames(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, NumericString$$serializer.INSTANCE, NumericString.copydefault(contractBotDto.getFieldNames()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !NumericString.EZpvd(contractBotDto.AuCTel(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, NumericString$$serializer.INSTANCE, NumericString.copydefault(contractBotDto.AuCTel()));
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && Intrinsics.EZpvd((Object) contractBotDto.gEmmrt(), (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 19, contractBotDto.gEmmrt());
    }

    public ContractBotDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<StrategyProfitResponse> list, BotCopyType botCopyType, String str12, String str13, BotDirection botDirection, String str14, String str15, String str16, String str17) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(botCopyType, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        this.algoId = str;
        this.instId = str2;
        this.displayId = str3;
        this.instType = str4;
        this.instFamily = str5;
        this.ordType = str6;
        this.cTime = str7;
        this.pTime = str8;
        this.totalPnl = str9;
        this.totalPnlRatio = str10;
        this.lastPrice = str11;
        this.profitSnapshots = list;
        this.copyType = botCopyType;
        this.ccy = str12;
        this.leverage = str13;
        this.direction = botDirection;
        this.sourceCcy = str14;
        this.totalPnlInSourceCcy = str15;
        this.pnlRatioInSourceCcy = str16;
        this.sourceAlgoId = str17;
    }
}
