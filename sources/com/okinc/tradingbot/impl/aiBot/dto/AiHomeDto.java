package com.okinc.tradingbot.impl.aiBot.dto;

import com.okinc.unify_trade.biz.TechnicalIndex;
import com.okinc.unify_trade.biz.TechnicalIndex$$serializer;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AiHomeDto {
    public static final KSerializer<Object>[] $childSerializers;
    public final List<ModelInfoDto> aiModels;
    public final List<String> aiThinkingIntervals;
    public final Map<String, String> backtestAiThinkingIntervals;
    public final String defaultAiThinkingInterval;
    public final Map<String, List<String>> defaultInstIds;
    public final List<String> defaultKLineLevels;
    public final List<TechnicalIndex> defaultTechnicalIndexes;
    public final List<InvestLimitDto> investmentLimits;
    public final List<String> kLineLevels;
    public final int maxInstrumentsSize;
    public final int maxKLineLevelsSize;
    public final int maxTechnicalIndexSize;
    public final int minInstrumentsSize;
    public final boolean slMandatory;
    public final boolean tpMandatory;
    public final TpSlLimitDto tpSlLimit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AiHomeDto() {
        this((List) null, (Map) null, (List) null, (List) null, 0, (List) null, 0, 0, (TpSlLimitDto) null, (Map) null, false, false, (String) null, (List) null, (List) null, 0, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ModelInfoDto> AEQbTJ() {
        return this.aiModels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> AYXKKw() {
        return this.kLineLevels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLimitDto> AhwBna() {
        return this.investmentLimits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.slMandatory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlLimitDto AuCTel() {
        return this.tpSlLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.maxTechnicalIndexSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> KWHzl() {
        return this.aiThinkingIntervals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AiHomeDto OLrzqt(@NotNull List<ModelInfoDto> list, @NotNull Map<String, ? extends List<String>> map, @NotNull List<String> list2, @NotNull List<String> list3, int i, @NotNull List<InvestLimitDto> list4, int i2, int i3, @NotNull TpSlLimitDto tpSlLimitDto, @NotNull Map<String, String> map2, boolean z, boolean z2, @NotNull String str, @NotNull List<String> list5, @NotNull List<TechnicalIndex> list6, int i4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(tpSlLimitDto, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        return new AiHomeDto(list, map, list2, list3, i, list4, i2, i3, tpSlLimitDto, map2, z, z2, str, list5, list6, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.defaultAiThinkingInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> copydefault() {
        return this.backtestAiThinkingIntervals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> djBIcL() {
        return this.defaultKLineLevels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiHomeDto)) {
            return false;
        }
        AiHomeDto aiHomeDto = (AiHomeDto) obj;
        return Intrinsics.EZpvd(this.aiModels, aiHomeDto.aiModels) && Intrinsics.EZpvd(this.defaultInstIds, aiHomeDto.defaultInstIds) && Intrinsics.EZpvd(this.kLineLevels, aiHomeDto.kLineLevels) && Intrinsics.EZpvd(this.aiThinkingIntervals, aiHomeDto.aiThinkingIntervals) && this.maxTechnicalIndexSize == aiHomeDto.maxTechnicalIndexSize && Intrinsics.EZpvd(this.investmentLimits, aiHomeDto.investmentLimits) && this.minInstrumentsSize == aiHomeDto.minInstrumentsSize && this.maxInstrumentsSize == aiHomeDto.maxInstrumentsSize && Intrinsics.EZpvd(this.tpSlLimit, aiHomeDto.tpSlLimit) && Intrinsics.EZpvd(this.backtestAiThinkingIntervals, aiHomeDto.backtestAiThinkingIntervals) && this.tpMandatory == aiHomeDto.tpMandatory && this.slMandatory == aiHomeDto.slMandatory && Intrinsics.EZpvd((Object) this.defaultAiThinkingInterval, (Object) aiHomeDto.defaultAiThinkingInterval) && Intrinsics.EZpvd(this.defaultKLineLevels, aiHomeDto.defaultKLineLevels) && Intrinsics.EZpvd(this.defaultTechnicalIndexes, aiHomeDto.defaultTechnicalIndexes) && this.maxKLineLevelsSize == aiHomeDto.maxKLineLevelsSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return this.tpMandatory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fetchVPNInfo() {
        return this.maxKLineLevelsSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, List<String>> gEmmrt() {
        return this.defaultInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((this.aiModels.hashCode() * 31) + this.defaultInstIds.hashCode()) * 31) + this.kLineLevels.hashCode()) * 31) + this.aiThinkingIntervals.hashCode()) * 31) + Integer.hashCode(this.maxTechnicalIndexSize)) * 31) + this.investmentLimits.hashCode()) * 31) + Integer.hashCode(this.minInstrumentsSize)) * 31) + Integer.hashCode(this.maxInstrumentsSize)) * 31) + this.tpSlLimit.hashCode()) * 31) + this.backtestAiThinkingIntervals.hashCode()) * 31) + Boolean.hashCode(this.tpMandatory)) * 31) + Boolean.hashCode(this.slMandatory)) * 31) + this.defaultAiThinkingInterval.hashCode()) * 31) + this.defaultKLineLevels.hashCode()) * 31) + this.defaultTechnicalIndexes.hashCode()) * 31) + Integer.hashCode(this.maxKLineLevelsSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.minInstrumentsSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AiHomeDto(aiModels=" + this.aiModels + ", defaultInstIds=" + this.defaultInstIds + ", kLineLevels=" + this.kLineLevels + ", aiThinkingIntervals=" + this.aiThinkingIntervals + ", maxTechnicalIndexSize=" + this.maxTechnicalIndexSize + ", investmentLimits=" + this.investmentLimits + ", minInstrumentsSize=" + this.minInstrumentsSize + ", maxInstrumentsSize=" + this.maxInstrumentsSize + ", tpSlLimit=" + this.tpSlLimit + ", backtestAiThinkingIntervals=" + this.backtestAiThinkingIntervals + ", tpMandatory=" + this.tpMandatory + ", slMandatory=" + this.slMandatory + ", defaultAiThinkingInterval=" + this.defaultAiThinkingInterval + ", defaultKLineLevels=" + this.defaultKLineLevels + ", defaultTechnicalIndexes=" + this.defaultTechnicalIndexes + ", maxKLineLevelsSize=" + this.maxKLineLevelsSize + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TechnicalIndex> valueOf() {
        return this.defaultTechnicalIndexes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.maxInstrumentsSize;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.dto.AiHomeDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AiHomeDto> serializer() {
            return AiHomeDto$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(ModelInfoDto$$serializer.INSTANCE), new LinkedHashMapSerializer(stringSerializer, new ArrayListSerializer(stringSerializer)), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(InvestLimitDto$$serializer.INSTANCE), null, null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(TechnicalIndex$$serializer.INSTANCE), null};
    }

    public /* synthetic */ AiHomeDto(int i, List list, Map map, List list2, List list3, int i2, List list4, int i3, int i4, TpSlLimitDto tpSlLimitDto, Map map2, boolean z, boolean z2, String str, List list5, List list6, int i5, SerializationConstructorMarker serializationConstructorMarker) {
        TpSlLimitDto tpSlLimitDto2;
        this.aiModels = (i & 1) == 0 ? yDY.AhwBna() : list;
        this.defaultInstIds = (i & 2) == 0 ? C56424yEw.KWHzl() : map;
        this.kLineLevels = (i & 4) == 0 ? yDY.AhwBna() : list2;
        this.aiThinkingIntervals = (i & 8) == 0 ? yDY.AhwBna() : list3;
        if ((i & 16) == 0) {
            this.maxTechnicalIndexSize = 0;
        } else {
            this.maxTechnicalIndexSize = i2;
        }
        this.investmentLimits = (i & 32) == 0 ? yDY.AhwBna() : list4;
        if ((i & 64) == 0) {
            this.minInstrumentsSize = 0;
        } else {
            this.minInstrumentsSize = i3;
        }
        if ((i & 128) == 0) {
            this.maxInstrumentsSize = 0;
        } else {
            this.maxInstrumentsSize = i4;
        }
        if ((i & 256) == 0) {
            tpSlLimitDto2 = new TpSlLimitDto((MinMaxDto) null, (MinMaxDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            tpSlLimitDto2 = tpSlLimitDto;
        }
        this.tpSlLimit = tpSlLimitDto2;
        this.backtestAiThinkingIntervals = (i & 512) == 0 ? C56424yEw.KWHzl() : map2;
        if ((i & 1024) == 0) {
            this.tpMandatory = false;
        } else {
            this.tpMandatory = z;
        }
        if ((i & 2048) == 0) {
            this.slMandatory = false;
        } else {
            this.slMandatory = z2;
        }
        this.defaultAiThinkingInterval = (i & 4096) == 0 ? "" : str;
        this.defaultKLineLevels = (i & 8192) == 0 ? yDY.AhwBna() : list5;
        this.defaultTechnicalIndexes = (i & 16384) == 0 ? yDY.AhwBna() : list6;
        if ((i & 32768) == 0) {
            this.maxKLineLevelsSize = 0;
        } else {
            this.maxKLineLevelsSize = i5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [8=10] */
    public static final /* synthetic */ void KWHzl(AiHomeDto aiHomeDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(aiHomeDto.aiModels, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], aiHomeDto.aiModels);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(aiHomeDto.defaultInstIds, C56424yEw.KWHzl())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], aiHomeDto.defaultInstIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(aiHomeDto.kLineLevels, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], aiHomeDto.kLineLevels);
        }
        int i = 3;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(aiHomeDto.aiThinkingIntervals, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], aiHomeDto.aiThinkingIntervals);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || aiHomeDto.maxTechnicalIndexSize != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, aiHomeDto.maxTechnicalIndexSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(aiHomeDto.investmentLimits, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], aiHomeDto.investmentLimits);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || aiHomeDto.minInstrumentsSize != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, aiHomeDto.minInstrumentsSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || aiHomeDto.maxInstrumentsSize != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, aiHomeDto.maxInstrumentsSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(aiHomeDto.tpSlLimit, new TpSlLimitDto((MinMaxDto) null, (MinMaxDto) (0 == true ? 1 : 0), i, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, TpSlLimitDto$$serializer.INSTANCE, aiHomeDto.tpSlLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(aiHomeDto.backtestAiThinkingIntervals, C56424yEw.KWHzl())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], aiHomeDto.backtestAiThinkingIntervals);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || aiHomeDto.tpMandatory) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, aiHomeDto.tpMandatory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || aiHomeDto.slMandatory) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, aiHomeDto.slMandatory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) aiHomeDto.defaultAiThinkingInterval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, aiHomeDto.defaultAiThinkingInterval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(aiHomeDto.defaultKLineLevels, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], aiHomeDto.defaultKLineLevels);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(aiHomeDto.defaultTechnicalIndexes, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], aiHomeDto.defaultTechnicalIndexes);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && aiHomeDto.maxKLineLevelsSize == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 15, aiHomeDto.maxKLineLevelsSize);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public AiHomeDto(@NotNull List<ModelInfoDto> list, @NotNull Map<String, ? extends List<String>> map, @NotNull List<String> list2, @NotNull List<String> list3, int i, @NotNull List<InvestLimitDto> list4, int i2, int i3, @NotNull TpSlLimitDto tpSlLimitDto, @NotNull Map<String, String> map2, boolean z, boolean z2, @NotNull String str, @NotNull List<String> list5, @NotNull List<TechnicalIndex> list6, int i4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(tpSlLimitDto, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        this.aiModels = list;
        this.defaultInstIds = map;
        this.kLineLevels = list2;
        this.aiThinkingIntervals = list3;
        this.maxTechnicalIndexSize = i;
        this.investmentLimits = list4;
        this.minInstrumentsSize = i2;
        this.maxInstrumentsSize = i3;
        this.tpSlLimit = tpSlLimitDto;
        this.backtestAiThinkingIntervals = map2;
        this.tpMandatory = z;
        this.slMandatory = z2;
        this.defaultAiThinkingInterval = str;
        this.defaultKLineLevels = list5;
        this.defaultTechnicalIndexes = list6;
        this.maxKLineLevelsSize = i4;
    }

    public /* synthetic */ AiHomeDto(List list, Map map, List list2, List list3, int i, List list4, int i2, int i3, TpSlLimitDto tpSlLimitDto, Map map2, boolean z, boolean z2, String str, List list5, List list6, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        TpSlLimitDto tpSlLimitDto2;
        List listAhwBna = (i5 & 1) != 0 ? yDY.AhwBna() : list;
        Map mapKWHzl = (i5 & 2) != 0 ? C56424yEw.KWHzl() : map;
        List listAhwBna2 = (i5 & 4) != 0 ? yDY.AhwBna() : list2;
        List listAhwBna3 = (i5 & 8) != 0 ? yDY.AhwBna() : list3;
        int i6 = (i5 & 16) != 0 ? 0 : i;
        List listAhwBna4 = (i5 & 32) != 0 ? yDY.AhwBna() : list4;
        int i7 = (i5 & 64) != 0 ? 0 : i2;
        int i8 = (i5 & 128) != 0 ? 0 : i3;
        if ((i5 & 256) != 0) {
            tpSlLimitDto2 = new TpSlLimitDto((MinMaxDto) null, (MinMaxDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            tpSlLimitDto2 = tpSlLimitDto;
        }
        this(listAhwBna, mapKWHzl, listAhwBna2, listAhwBna3, i6, listAhwBna4, i7, i8, tpSlLimitDto2, (i5 & 512) != 0 ? C56424yEw.KWHzl() : map2, (i5 & 1024) != 0 ? false : z, (i5 & 2048) != 0 ? false : z2, (i5 & 4096) != 0 ? "" : str, (i5 & 8192) != 0 ? yDY.AhwBna() : list5, (i5 & 16384) != 0 ? yDY.AhwBna() : list6, (i5 & 32768) != 0 ? 0 : i4);
    }
}
