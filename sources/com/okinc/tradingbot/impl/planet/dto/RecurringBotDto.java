package com.okinc.tradingbot.impl.planet.dto;

import com.okinc.tradingbot.impl.dto.NumericString;
import com.okinc.tradingbot.impl.dto.NumericString$$serializer;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse$$serializer;
import com.okinc.unify_trade.biz.bot.Portfolio;
import com.okinc.unify_trade.biz.bot.Portfolio$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C53677wpx;
import o.InterfaceC53634wpG;
import o.InterfaceC53635wpH;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class RecurringBotDto implements InterfaceC53635wpH, InterfaceC53634wpG {
    public final String algoId;
    public final String cTime;
    public final BotCopyType copyType;
    public final String displayId;
    public final String instFamily;
    public final String instId;
    public final String instType;
    public final String ordType;
    public final String pTime;
    public final String period;
    public final List<Portfolio> portfolio;
    public final List<StrategyProfitResponse> profitSnapshots;
    public final String recurringDay;
    public final String recurringHour;
    public final String recurringTime;
    public final String sourceAlgoId;
    public final String strategyName;
    public final String totalPnl;
    public final String totalPnlRatio;
    public final String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StrategyProfitResponse$$serializer.INSTANCE), null, null, new ArrayListSerializer(Portfolio$$serializer.INSTANCE), null, null, null, null, null};

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
  (r16v0 java.util.List)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] call: com.okinc.tradingbot.impl.planet.dto.RecurringBotDto.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RecurringBotDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BotCopyType botCopyType, String str12, List list2, String str13, String str14, String str15, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, botCopyType, str12, list2, str13, str14, str15, str16, str17, serializationConstructorMarker);
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
  (r15v0 java.util.List)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.StrategyProfitResponse>, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.util.List<com.okinc.unify_trade.biz.bot.Portfolio>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] call: com.okinc.tradingbot.impl.planet.dto.RecurringBotDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RecurringBotDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BotCopyType botCopyType, String str12, List list2, String str13, String str14, String str15, String str16, String str17, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, botCopyType, str12, list2, str13, str14, str15, str16, str17);
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
    public final String AuCTel() {
        return this.recurringTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53635wpH
    public String DbNXlk() {
        return this.strategyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBotDto EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull List<StrategyProfitResponse> list, @NotNull BotCopyType botCopyType, @NotNull String str12, @NotNull List<Portfolio> list2, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
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
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        return new RecurringBotDto(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, botCopyType, str12, list2, str13, str14, str15, str16, str17, null);
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
    public final String ejfBZ() {
        return this.recurringDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringBotDto)) {
            return false;
        }
        RecurringBotDto recurringBotDto = (RecurringBotDto) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) recurringBotDto.algoId) && Intrinsics.EZpvd((Object) this.instId, (Object) recurringBotDto.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) recurringBotDto.displayId) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) recurringBotDto.tradeQuoteCcy) && Intrinsics.EZpvd((Object) this.instType, (Object) recurringBotDto.instType) && Intrinsics.EZpvd((Object) this.instFamily, (Object) recurringBotDto.instFamily) && Intrinsics.EZpvd((Object) this.ordType, (Object) recurringBotDto.ordType) && Intrinsics.EZpvd((Object) this.cTime, (Object) recurringBotDto.cTime) && Intrinsics.EZpvd((Object) this.pTime, (Object) recurringBotDto.pTime) && NumericString.EZpvd(this.totalPnl, recurringBotDto.totalPnl) && NumericString.EZpvd(this.totalPnlRatio, recurringBotDto.totalPnlRatio) && Intrinsics.EZpvd(this.profitSnapshots, recurringBotDto.profitSnapshots) && this.copyType == recurringBotDto.copyType && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) recurringBotDto.sourceAlgoId) && Intrinsics.EZpvd(this.portfolio, recurringBotDto.portfolio) && Intrinsics.EZpvd((Object) this.strategyName, (Object) recurringBotDto.strategyName) && NumericString.EZpvd(this.recurringHour, recurringBotDto.recurringHour) && NumericString.EZpvd(this.recurringTime, recurringBotDto.recurringTime) && NumericString.EZpvd(this.recurringDay, recurringBotDto.recurringDay) && NumericString.EZpvd(this.period, recurringBotDto.period);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.recurringHour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String fJNWhG() {
        return this.displayId;
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
    @Override // o.InterfaceC53634wpG
    public String hDKMBd() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.algoId.hashCode() * 31) + this.instId.hashCode()) * 31) + this.displayId.hashCode()) * 31) + this.tradeQuoteCcy.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.instFamily.hashCode()) * 31) + this.ordType.hashCode()) * 31) + this.cTime.hashCode()) * 31) + this.pTime.hashCode()) * 31) + NumericString.KWHzl(this.totalPnl)) * 31) + NumericString.KWHzl(this.totalPnlRatio)) * 31) + this.profitSnapshots.hashCode()) * 31) + this.copyType.hashCode()) * 31) + this.sourceAlgoId.hashCode()) * 31) + this.portfolio.hashCode()) * 31) + this.strategyName.hashCode()) * 31) + NumericString.KWHzl(this.recurringHour)) * 31) + NumericString.KWHzl(this.recurringTime)) * 31) + NumericString.KWHzl(this.recurringDay)) * 31) + NumericString.KWHzl(this.period);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String isConnected() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBotDto(algoId=" + this.algoId + ", instId=" + this.instId + ", displayId=" + this.displayId + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", instType=" + this.instType + ", instFamily=" + this.instFamily + ", ordType=" + this.ordType + ", cTime=" + this.cTime + ", pTime=" + this.pTime + ", totalPnl=" + NumericString.EZpvd(this.totalPnl) + ", totalPnlRatio=" + NumericString.EZpvd(this.totalPnlRatio) + ", profitSnapshots=" + this.profitSnapshots + ", copyType=" + this.copyType + ", sourceAlgoId=" + this.sourceAlgoId + ", portfolio=" + this.portfolio + ", strategyName=" + this.strategyName + ", recurringHour=" + NumericString.EZpvd(this.recurringHour) + ", recurringTime=" + NumericString.EZpvd(this.recurringTime) + ", recurringDay=" + NumericString.EZpvd(this.recurringDay) + ", period=" + NumericString.EZpvd(this.period) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String valueOf() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53635wpH
    public List<Portfolio> values() {
        return this.portfolio;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.planet.dto.RecurringBotDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBotDto> serializer() {
            return RecurringBotDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBotDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BotCopyType botCopyType, String str12, List list2, String str13, String str14, String str15, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.tradeQuoteCcy = "";
        } else {
            this.tradeQuoteCcy = str4;
        }
        if ((i & 16) == 0) {
            this.instType = "";
        } else {
            this.instType = str5;
        }
        if ((i & 32) == 0) {
            this.instFamily = "";
        } else {
            this.instFamily = str6;
        }
        if ((i & 64) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str7;
        }
        if ((i & 128) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str8;
        }
        if ((i & 256) == 0) {
            this.pTime = "";
        } else {
            this.pTime = str9;
        }
        this.totalPnl = (i & 512) == 0 ? NumericString.Companion.copydefault() : str10;
        this.totalPnlRatio = (i & 1024) == 0 ? NumericString.Companion.copydefault() : str11;
        this.profitSnapshots = (i & 2048) == 0 ? yDY.AhwBna() : list;
        this.copyType = (i & 4096) == 0 ? BotCopyType.NotSpecified : botCopyType;
        if ((i & 8192) == 0) {
            this.sourceAlgoId = "";
        } else {
            this.sourceAlgoId = str12;
        }
        this.portfolio = (i & 16384) == 0 ? yDY.AhwBna() : list2;
        if ((32768 & i) == 0) {
            this.strategyName = "";
        } else {
            this.strategyName = str13;
        }
        this.recurringHour = (65536 & i) == 0 ? NumericString.Companion.copydefault() : str14;
        this.recurringTime = (131072 & i) == 0 ? NumericString.Companion.copydefault() : str15;
        this.recurringDay = (262144 & i) == 0 ? NumericString.Companion.copydefault() : str16;
        this.period = (i & 524288) == 0 ? NumericString.Companion.copydefault() : str17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [208=10] */
    public static final /* synthetic */ void copydefault(RecurringBotDto recurringBotDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) recurringBotDto.EZpvd(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringBotDto.EZpvd());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) recurringBotDto.OLrzqt(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringBotDto.OLrzqt());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) recurringBotDto.fJNWhG(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, recurringBotDto.fJNWhG());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) recurringBotDto.hDKMBd(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, recurringBotDto.hDKMBd());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) recurringBotDto.djBIcL(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, recurringBotDto.djBIcL());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) recurringBotDto.copydefault(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, recurringBotDto.copydefault());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) recurringBotDto.valueOf(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, recurringBotDto.valueOf());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) recurringBotDto.AEQbTJ(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, recurringBotDto.AEQbTJ());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) recurringBotDto.AYXKKw(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, recurringBotDto.AYXKKw());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !NumericString.EZpvd(recurringBotDto.fetchVPNInfo(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, NumericString$$serializer.INSTANCE, NumericString.copydefault(recurringBotDto.fetchVPNInfo()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !NumericString.EZpvd(recurringBotDto.isConnected(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, NumericString$$serializer.INSTANCE, NumericString.copydefault(recurringBotDto.isConnected()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(recurringBotDto.AhwBna(), yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], recurringBotDto.AhwBna());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || recurringBotDto.KWHzl() != BotCopyType.NotSpecified) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, C53677wpx.copydefault, recurringBotDto.KWHzl());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) recurringBotDto.gEmmrt(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, recurringBotDto.gEmmrt());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(recurringBotDto.values(), yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], recurringBotDto.values());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) recurringBotDto.DbNXlk(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, recurringBotDto.DbNXlk());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !NumericString.EZpvd(recurringBotDto.recurringHour, NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, NumericString$$serializer.INSTANCE, NumericString.copydefault(recurringBotDto.recurringHour));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !NumericString.EZpvd(recurringBotDto.recurringTime, NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, NumericString$$serializer.INSTANCE, NumericString.copydefault(recurringBotDto.recurringTime));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !NumericString.EZpvd(recurringBotDto.recurringDay, NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, NumericString$$serializer.INSTANCE, NumericString.copydefault(recurringBotDto.recurringDay));
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && NumericString.EZpvd(recurringBotDto.period, NumericString.Companion.copydefault())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 19, NumericString$$serializer.INSTANCE, NumericString.copydefault(recurringBotDto.period));
    }

    public RecurringBotDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<StrategyProfitResponse> list, BotCopyType botCopyType, String str12, List<Portfolio> list2, String str13, String str14, String str15, String str16, String str17) {
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
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        this.algoId = str;
        this.instId = str2;
        this.displayId = str3;
        this.tradeQuoteCcy = str4;
        this.instType = str5;
        this.instFamily = str6;
        this.ordType = str7;
        this.cTime = str8;
        this.pTime = str9;
        this.totalPnl = str10;
        this.totalPnlRatio = str11;
        this.profitSnapshots = list;
        this.copyType = botCopyType;
        this.sourceAlgoId = str12;
        this.portfolio = list2;
        this.strategyName = str13;
        this.recurringHour = str14;
        this.recurringTime = str15;
        this.recurringDay = str16;
        this.period = str17;
    }
}
