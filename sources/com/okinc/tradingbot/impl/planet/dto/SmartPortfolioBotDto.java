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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class SmartPortfolioBotDto implements InterfaceC53635wpH, InterfaceC53634wpG {
    public final String algoId;
    public final String cTime;
    public final BotCopyType copyType;
    public final String displayId;
    public final String instFamily;
    public final String instId;
    public final String instType;
    public final String ordType;
    public final String pTime;
    public final List<Portfolio> portfolio;
    public final List<StrategyProfitResponse> profitSnapshots;
    public final String sourceAlgoId;
    public final String strategyName;
    public final String totalPnl;
    public final String totalPnlRatio;
    public final String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StrategyProfitResponse$$serializer.INSTANCE), null, null, new ArrayListSerializer(Portfolio$$serializer.INSTANCE), null};

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
  (r18v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.util.List, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] call: com.okinc.tradingbot.impl.planet.dto.SmartPortfolioBotDto.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.util.List, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SmartPortfolioBotDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BotCopyType botCopyType, String str12, List list2, String str13, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, botCopyType, str12, list2, str13, serializationConstructorMarker);
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.StrategyProfitResponse>, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.util.List<com.okinc.unify_trade.biz.bot.Portfolio>, java.lang.String):void (m)] call: com.okinc.tradingbot.impl.planet.dto.SmartPortfolioBotDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SmartPortfolioBotDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BotCopyType botCopyType, String str12, List list2, String str13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, botCopyType, str12, list2, str13);
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
    @Override // o.InterfaceC53635wpH
    public String DbNXlk() {
        return this.strategyName;
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
    public final SmartPortfolioBotDto KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull List<StrategyProfitResponse> list, @NotNull BotCopyType botCopyType, @NotNull String str12, @NotNull List<Portfolio> list2, @NotNull String str13) {
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
        return new SmartPortfolioBotDto(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, botCopyType, str12, list2, str13, null);
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
        if (!(obj instanceof SmartPortfolioBotDto)) {
            return false;
        }
        SmartPortfolioBotDto smartPortfolioBotDto = (SmartPortfolioBotDto) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) smartPortfolioBotDto.algoId) && Intrinsics.EZpvd((Object) this.instId, (Object) smartPortfolioBotDto.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) smartPortfolioBotDto.displayId) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) smartPortfolioBotDto.tradeQuoteCcy) && Intrinsics.EZpvd((Object) this.instType, (Object) smartPortfolioBotDto.instType) && Intrinsics.EZpvd((Object) this.instFamily, (Object) smartPortfolioBotDto.instFamily) && Intrinsics.EZpvd((Object) this.ordType, (Object) smartPortfolioBotDto.ordType) && Intrinsics.EZpvd((Object) this.cTime, (Object) smartPortfolioBotDto.cTime) && Intrinsics.EZpvd((Object) this.pTime, (Object) smartPortfolioBotDto.pTime) && NumericString.EZpvd(this.totalPnl, smartPortfolioBotDto.totalPnl) && NumericString.EZpvd(this.totalPnlRatio, smartPortfolioBotDto.totalPnlRatio) && Intrinsics.EZpvd(this.profitSnapshots, smartPortfolioBotDto.profitSnapshots) && this.copyType == smartPortfolioBotDto.copyType && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) smartPortfolioBotDto.sourceAlgoId) && Intrinsics.EZpvd(this.portfolio, smartPortfolioBotDto.portfolio) && Intrinsics.EZpvd((Object) this.strategyName, (Object) smartPortfolioBotDto.strategyName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String fIwbmz() {
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
        return (((((((((((((((((((((((((((((this.algoId.hashCode() * 31) + this.instId.hashCode()) * 31) + this.displayId.hashCode()) * 31) + this.tradeQuoteCcy.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.instFamily.hashCode()) * 31) + this.ordType.hashCode()) * 31) + this.cTime.hashCode()) * 31) + this.pTime.hashCode()) * 31) + NumericString.KWHzl(this.totalPnl)) * 31) + NumericString.KWHzl(this.totalPnlRatio)) * 31) + this.profitSnapshots.hashCode()) * 31) + this.copyType.hashCode()) * 31) + this.sourceAlgoId.hashCode()) * 31) + this.portfolio.hashCode()) * 31) + this.strategyName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String isConnected() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartPortfolioBotDto(algoId=" + this.algoId + ", instId=" + this.instId + ", displayId=" + this.displayId + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", instType=" + this.instType + ", instFamily=" + this.instFamily + ", ordType=" + this.ordType + ", cTime=" + this.cTime + ", pTime=" + this.pTime + ", totalPnl=" + NumericString.EZpvd(this.totalPnl) + ", totalPnlRatio=" + NumericString.EZpvd(this.totalPnlRatio) + ", profitSnapshots=" + this.profitSnapshots + ", copyType=" + this.copyType + ", sourceAlgoId=" + this.sourceAlgoId + ", portfolio=" + this.portfolio + ", strategyName=" + this.strategyName + ")";
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.planet.dto.SmartPortfolioBotDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartPortfolioBotDto> serializer() {
            return SmartPortfolioBotDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartPortfolioBotDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BotCopyType botCopyType, String str12, List list2, String str13, SerializationConstructorMarker serializationConstructorMarker) {
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
        if ((i & 32768) == 0) {
            this.strategyName = "";
        } else {
            this.strategyName = str13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [183=6] */
    public static final /* synthetic */ void AEQbTJ(SmartPortfolioBotDto smartPortfolioBotDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) smartPortfolioBotDto.EZpvd(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, smartPortfolioBotDto.EZpvd());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) smartPortfolioBotDto.OLrzqt(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, smartPortfolioBotDto.OLrzqt());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) smartPortfolioBotDto.fIwbmz(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, smartPortfolioBotDto.fIwbmz());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) smartPortfolioBotDto.hDKMBd(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, smartPortfolioBotDto.hDKMBd());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) smartPortfolioBotDto.djBIcL(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, smartPortfolioBotDto.djBIcL());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) smartPortfolioBotDto.copydefault(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, smartPortfolioBotDto.copydefault());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) smartPortfolioBotDto.valueOf(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, smartPortfolioBotDto.valueOf());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) smartPortfolioBotDto.AEQbTJ(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, smartPortfolioBotDto.AEQbTJ());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) smartPortfolioBotDto.AYXKKw(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, smartPortfolioBotDto.AYXKKw());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !NumericString.EZpvd(smartPortfolioBotDto.fetchVPNInfo(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, NumericString$$serializer.INSTANCE, NumericString.copydefault(smartPortfolioBotDto.fetchVPNInfo()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !NumericString.EZpvd(smartPortfolioBotDto.isConnected(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, NumericString$$serializer.INSTANCE, NumericString.copydefault(smartPortfolioBotDto.isConnected()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(smartPortfolioBotDto.AhwBna(), yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], smartPortfolioBotDto.AhwBna());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || smartPortfolioBotDto.KWHzl() != BotCopyType.NotSpecified) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, C53677wpx.copydefault, smartPortfolioBotDto.KWHzl());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) smartPortfolioBotDto.gEmmrt(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, smartPortfolioBotDto.gEmmrt());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(smartPortfolioBotDto.values(), yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], smartPortfolioBotDto.values());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd((Object) smartPortfolioBotDto.DbNXlk(), (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 15, smartPortfolioBotDto.DbNXlk());
    }

    public SmartPortfolioBotDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<StrategyProfitResponse> list, BotCopyType botCopyType, String str12, List<Portfolio> list2, String str13) {
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
    }
}
