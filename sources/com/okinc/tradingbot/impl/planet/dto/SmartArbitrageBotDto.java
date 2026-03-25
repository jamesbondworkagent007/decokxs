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
import o.InterfaceC53630wpC;
import o.InterfaceC53679wpz;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SmartArbitrageBotDto implements BotDto, InterfaceC53679wpz, InterfaceC53630wpC {
    public final String algoId;
    public final String apy;
    public final String cTime;
    public final String ccy;
    public final BotCopyType copyType;
    public final String displayId;
    public final String instFamily;
    public final String instId;
    public final String instType;
    public final String leverage;
    public final String ordType;
    public final String pTime;
    public final List<StrategyProfitResponse> profitSnapshots;
    public final String sourceAlgoId;
    public final String totalPnl;
    public final String totalPnlRatio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StrategyProfitResponse$$serializer.INSTANCE), null, null, null, null, null};

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
  (r12v0 java.util.List)
  (r13v0 com.okinc.tradingbot.impl.planet.dto.BotCopyType)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] call: com.okinc.tradingbot.impl.planet.dto.SmartArbitrageBotDto.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SmartArbitrageBotDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, BotCopyType botCopyType, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, list, botCopyType, str11, str12, str13, str14, serializationConstructorMarker);
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
  (r11v0 java.util.List)
  (r12v0 com.okinc.tradingbot.impl.planet.dto.BotCopyType)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.StrategyProfitResponse>, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] call: com.okinc.tradingbot.impl.planet.dto.SmartArbitrageBotDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SmartArbitrageBotDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, BotCopyType botCopyType, String str11, String str12, String str13, String str14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, list, botCopyType, str11, str12, str13, str14);
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
        return this.apy;
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
    public final SmartArbitrageBotDto OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull List<StrategyProfitResponse> list, @NotNull BotCopyType botCopyType, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(botCopyType, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new SmartArbitrageBotDto(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, list, botCopyType, str11, str12, str13, str14, null);
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
    public String ejfBZ() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartArbitrageBotDto)) {
            return false;
        }
        SmartArbitrageBotDto smartArbitrageBotDto = (SmartArbitrageBotDto) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) smartArbitrageBotDto.algoId) && Intrinsics.EZpvd((Object) this.instId, (Object) smartArbitrageBotDto.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) smartArbitrageBotDto.displayId) && Intrinsics.EZpvd((Object) this.instType, (Object) smartArbitrageBotDto.instType) && Intrinsics.EZpvd((Object) this.instFamily, (Object) smartArbitrageBotDto.instFamily) && Intrinsics.EZpvd((Object) this.ordType, (Object) smartArbitrageBotDto.ordType) && Intrinsics.EZpvd((Object) this.cTime, (Object) smartArbitrageBotDto.cTime) && Intrinsics.EZpvd((Object) this.pTime, (Object) smartArbitrageBotDto.pTime) && NumericString.EZpvd(this.totalPnl, smartArbitrageBotDto.totalPnl) && NumericString.EZpvd(this.totalPnlRatio, smartArbitrageBotDto.totalPnlRatio) && Intrinsics.EZpvd(this.profitSnapshots, smartArbitrageBotDto.profitSnapshots) && this.copyType == smartArbitrageBotDto.copyType && Intrinsics.EZpvd((Object) this.ccy, (Object) smartArbitrageBotDto.ccy) && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) smartArbitrageBotDto.sourceAlgoId) && Intrinsics.EZpvd((Object) this.leverage, (Object) smartArbitrageBotDto.leverage) && Intrinsics.EZpvd((Object) this.apy, (Object) smartArbitrageBotDto.apy);
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
    public int hashCode() {
        return (((((((((((((((((((((((((((((this.algoId.hashCode() * 31) + this.instId.hashCode()) * 31) + this.displayId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.instFamily.hashCode()) * 31) + this.ordType.hashCode()) * 31) + this.cTime.hashCode()) * 31) + this.pTime.hashCode()) * 31) + NumericString.KWHzl(this.totalPnl)) * 31) + NumericString.KWHzl(this.totalPnlRatio)) * 31) + this.profitSnapshots.hashCode()) * 31) + this.copyType.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.sourceAlgoId.hashCode()) * 31) + this.leverage.hashCode()) * 31) + this.apy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53629wpB
    public String isConnected() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartArbitrageBotDto(algoId=" + this.algoId + ", instId=" + this.instId + ", displayId=" + this.displayId + ", instType=" + this.instType + ", instFamily=" + this.instFamily + ", ordType=" + this.ordType + ", cTime=" + this.cTime + ", pTime=" + this.pTime + ", totalPnl=" + NumericString.EZpvd(this.totalPnl) + ", totalPnlRatio=" + NumericString.EZpvd(this.totalPnlRatio) + ", profitSnapshots=" + this.profitSnapshots + ", copyType=" + this.copyType + ", ccy=" + this.ccy + ", sourceAlgoId=" + this.sourceAlgoId + ", leverage=" + this.leverage + ", apy=" + this.apy + ")";
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.planet.dto.SmartArbitrageBotDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartArbitrageBotDto> serializer() {
            return SmartArbitrageBotDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartArbitrageBotDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, BotCopyType botCopyType, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
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
        this.profitSnapshots = (i & 1024) == 0 ? yDY.AhwBna() : list;
        this.copyType = (i & 2048) == 0 ? BotCopyType.NotSpecified : botCopyType;
        if ((i & 4096) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str11;
        }
        if ((i & 8192) == 0) {
            this.sourceAlgoId = "";
        } else {
            this.sourceAlgoId = str12;
        }
        if ((i & 16384) == 0) {
            this.leverage = "";
        } else {
            this.leverage = str13;
        }
        if ((i & 32768) == 0) {
            this.apy = "";
        } else {
            this.apy = str14;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [157=5] */
    public static final /* synthetic */ void EZpvd(SmartArbitrageBotDto smartArbitrageBotDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) smartArbitrageBotDto.EZpvd(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, smartArbitrageBotDto.EZpvd());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) smartArbitrageBotDto.OLrzqt(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, smartArbitrageBotDto.OLrzqt());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) smartArbitrageBotDto.ejfBZ(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, smartArbitrageBotDto.ejfBZ());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) smartArbitrageBotDto.djBIcL(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, smartArbitrageBotDto.djBIcL());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) smartArbitrageBotDto.copydefault(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, smartArbitrageBotDto.copydefault());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) smartArbitrageBotDto.valueOf(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, smartArbitrageBotDto.valueOf());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) smartArbitrageBotDto.AEQbTJ(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, smartArbitrageBotDto.AEQbTJ());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) smartArbitrageBotDto.AYXKKw(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, smartArbitrageBotDto.AYXKKw());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !NumericString.EZpvd(smartArbitrageBotDto.fetchVPNInfo(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, NumericString$$serializer.INSTANCE, NumericString.copydefault(smartArbitrageBotDto.fetchVPNInfo()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !NumericString.EZpvd(smartArbitrageBotDto.isConnected(), NumericString.Companion.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, NumericString$$serializer.INSTANCE, NumericString.copydefault(smartArbitrageBotDto.isConnected()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(smartArbitrageBotDto.AhwBna(), yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], smartArbitrageBotDto.AhwBna());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || smartArbitrageBotDto.KWHzl() != BotCopyType.NotSpecified) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, C53677wpx.copydefault, smartArbitrageBotDto.KWHzl());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) smartArbitrageBotDto.DbNXlk(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, smartArbitrageBotDto.DbNXlk());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) smartArbitrageBotDto.gEmmrt(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, smartArbitrageBotDto.gEmmrt());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) smartArbitrageBotDto.values(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, smartArbitrageBotDto.values());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd((Object) smartArbitrageBotDto.apy, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 15, smartArbitrageBotDto.apy);
    }

    public SmartArbitrageBotDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<StrategyProfitResponse> list, BotCopyType botCopyType, String str11, String str12, String str13, String str14) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(botCopyType, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
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
        this.profitSnapshots = list;
        this.copyType = botCopyType;
        this.ccy = str11;
        this.sourceAlgoId = str12;
        this.leverage = str13;
        this.apy = str14;
    }
}
