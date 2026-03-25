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
import o.C53677wpx;
import o.InterfaceC53628wpA;
import o.InterfaceC53632wpE;
import o.InterfaceC53634wpG;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SpotBotDto implements BotDto, InterfaceC53628wpA, InterfaceC53634wpG, InterfaceC53632wpE {
    public final String algoId;
    public final String cTime;
    public final BotCopyType copyType;
    public final String displayId;
    public final String instFamily;
    public final String instId;
    public final String instType;
    public final String lastPrice;
    public final String ordType;
    public final String pTime;
    public final String pnlRatioInSourceCcy;
    public final List<StrategyProfitResponse> profitSnapshots;
    public final String sourceAlgoId;
    public final String sourceCcy;
    public final String totalPnl;
    public final String totalPnlInSourceCcy;
    public final String totalPnlRatio;
    public final String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StrategyProfitResponse$$serializer.INSTANCE), null, null, null, null, null};

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
  (r13v0 java.lang.String)
  (r14v0 java.util.List)
  (r15v0 com.okinc.tradingbot.impl.planet.dto.BotCopyType)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] call: com.okinc.tradingbot.impl.planet.dto.SpotBotDto.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SpotBotDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, BotCopyType botCopyType, String str13, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, list, botCopyType, str13, str14, str15, str16, serializationConstructorMarker);
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
  (r12v0 java.lang.String)
  (r13v0 java.util.List)
  (r14v0 com.okinc.tradingbot.impl.planet.dto.BotCopyType)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.StrategyProfitResponse>, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] call: com.okinc.tradingbot.impl.planet.dto.SpotBotDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SpotBotDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, BotCopyType botCopyType, String str13, String str14, String str15, String str16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, list, botCopyType, str13, str14, str15, str16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotBotDto AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull List<StrategyProfitResponse> list, @NotNull BotCopyType botCopyType, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(botCopyType, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new SpotBotDto(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, list, botCopyType, str13, str14, str15, str16, null);
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
    public String DbNXlk() {
        return this.displayId;
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotBotDto)) {
            return false;
        }
        SpotBotDto spotBotDto = (SpotBotDto) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) spotBotDto.algoId) && Intrinsics.EZpvd((Object) this.instId, (Object) spotBotDto.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) spotBotDto.displayId) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) spotBotDto.tradeQuoteCcy) && Intrinsics.EZpvd((Object) this.instType, (Object) spotBotDto.instType) && Intrinsics.EZpvd((Object) this.instFamily, (Object) spotBotDto.instFamily) && Intrinsics.EZpvd((Object) this.ordType, (Object) spotBotDto.ordType) && Intrinsics.EZpvd((Object) this.cTime, (Object) spotBotDto.cTime) && Intrinsics.EZpvd((Object) this.pTime, (Object) spotBotDto.pTime) && NumericString.EZpvd(this.totalPnl, spotBotDto.totalPnl) && NumericString.EZpvd(this.totalPnlRatio, spotBotDto.totalPnlRatio) && NumericString.EZpvd(this.lastPrice, spotBotDto.lastPrice) && Intrinsics.EZpvd(this.profitSnapshots, spotBotDto.profitSnapshots) && this.copyType == spotBotDto.copyType && Intrinsics.EZpvd((Object) this.sourceCcy, (Object) spotBotDto.sourceCcy) && NumericString.EZpvd(this.totalPnlInSourceCcy, spotBotDto.totalPnlInSourceCcy) && NumericString.EZpvd(this.pnlRatioInSourceCcy, spotBotDto.pnlRatioInSourceCcy) && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) spotBotDto.sourceAlgoId);
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
    @Override // o.InterfaceC53634wpG
    public String hDKMBd() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.algoId.hashCode() * 31) + this.instId.hashCode()) * 31) + this.displayId.hashCode()) * 31) + this.tradeQuoteCcy.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.instFamily.hashCode()) * 31) + this.ordType.hashCode()) * 31) + this.cTime.hashCode()) * 31) + this.pTime.hashCode()) * 31) + NumericString.KWHzl(this.totalPnl)) * 31) + NumericString.KWHzl(this.totalPnlRatio)) * 31) + NumericString.KWHzl(this.lastPrice)) * 31) + this.profitSnapshots.hashCode()) * 31) + this.copyType.hashCode()) * 31) + this.sourceCcy.hashCode()) * 31) + NumericString.KWHzl(this.totalPnlInSourceCcy)) * 31) + NumericString.KWHzl(this.pnlRatioInSourceCcy)) * 31) + this.sourceAlgoId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String isConnected() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotBotDto(algoId=" + this.algoId + ", instId=" + this.instId + ", displayId=" + this.displayId + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", instType=" + this.instType + ", instFamily=" + this.instFamily + ", ordType=" + this.ordType + ", cTime=" + this.cTime + ", pTime=" + this.pTime + ", totalPnl=" + NumericString.EZpvd(this.totalPnl) + ", totalPnlRatio=" + NumericString.EZpvd(this.totalPnlRatio) + ", lastPrice=" + NumericString.EZpvd(this.lastPrice) + ", profitSnapshots=" + this.profitSnapshots + ", copyType=" + this.copyType + ", sourceCcy=" + this.sourceCcy + ", totalPnlInSourceCcy=" + NumericString.EZpvd(this.totalPnlInSourceCcy) + ", pnlRatioInSourceCcy=" + NumericString.EZpvd(this.pnlRatioInSourceCcy) + ", sourceAlgoId=" + this.sourceAlgoId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String valueOf() {
        return this.ordType;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.planet.dto.SpotBotDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotBotDto> serializer() {
            return SpotBotDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotBotDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, BotCopyType botCopyType, String str13, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
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
        this.lastPrice = (i & 2048) == 0 ? NumericString.Companion.copydefault() : str12;
        this.profitSnapshots = (i & 4096) == 0 ? yDY.AhwBna() : list;
        this.copyType = (i & 8192) == 0 ? BotCopyType.NotSpecified : botCopyType;
        if ((i & 16384) == 0) {
            this.sourceCcy = "";
        } else {
            this.sourceCcy = str13;
        }
        this.totalPnlInSourceCcy = (32768 & i) == 0 ? NumericString.Companion.copydefault() : str14;
        this.pnlRatioInSourceCcy = (65536 & i) == 0 ? NumericString.Companion.copydefault() : str15;
        if ((i & 131072) == 0) {
            this.sourceAlgoId = "";
        } else {
            this.sourceAlgoId = str16;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [100=8] */
    public static final /* synthetic */ void EZpvd(SpotBotDto spotBotDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) spotBotDto.EZpvd(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, spotBotDto.EZpvd());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) spotBotDto.OLrzqt(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, spotBotDto.OLrzqt());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) spotBotDto.DbNXlk(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, spotBotDto.DbNXlk());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) spotBotDto.hDKMBd(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, spotBotDto.hDKMBd());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) spotBotDto.djBIcL(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, spotBotDto.djBIcL());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) spotBotDto.copydefault(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, spotBotDto.copydefault());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) spotBotDto.valueOf(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, spotBotDto.valueOf());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) spotBotDto.AEQbTJ(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, spotBotDto.AEQbTJ());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) spotBotDto.AYXKKw(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, spotBotDto.AYXKKw());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !NumericString.EZpvd(spotBotDto.fetchVPNInfo(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, NumericString$$serializer.INSTANCE, NumericString.copydefault(spotBotDto.fetchVPNInfo()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !NumericString.EZpvd(spotBotDto.isConnected(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, NumericString$$serializer.INSTANCE, NumericString.copydefault(spotBotDto.isConnected()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !NumericString.EZpvd(spotBotDto.AkhnZx(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, NumericString$$serializer.INSTANCE, NumericString.copydefault(spotBotDto.AkhnZx()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(spotBotDto.AhwBna(), yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], spotBotDto.AhwBna());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || spotBotDto.KWHzl() != BotCopyType.NotSpecified) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, C53677wpx.copydefault, spotBotDto.KWHzl());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) spotBotDto.fJNWhG(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, spotBotDto.fJNWhG());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !NumericString.EZpvd(spotBotDto.getFieldNames(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, NumericString$$serializer.INSTANCE, NumericString.copydefault(spotBotDto.getFieldNames()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !NumericString.EZpvd(spotBotDto.AuCTel(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, NumericString$$serializer.INSTANCE, NumericString.copydefault(spotBotDto.AuCTel()));
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && Intrinsics.EZpvd((Object) spotBotDto.gEmmrt(), (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 17, spotBotDto.gEmmrt());
    }

    public SpotBotDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List<StrategyProfitResponse> list, BotCopyType botCopyType, String str13, String str14, String str15, String str16) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(botCopyType, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
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
        this.lastPrice = str12;
        this.profitSnapshots = list;
        this.copyType = botCopyType;
        this.sourceCcy = str13;
        this.totalPnlInSourceCcy = str14;
        this.pnlRatioInSourceCcy = str15;
        this.sourceAlgoId = str16;
    }
}
