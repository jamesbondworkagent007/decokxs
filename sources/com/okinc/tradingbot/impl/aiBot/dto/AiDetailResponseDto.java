package com.okinc.tradingbot.impl.aiBot.dto;

import com.okinc.unify_trade.biz.DataSetting;
import com.okinc.unify_trade.biz.DataSetting$$serializer;
import com.okinc.unify_trade.biz.bot.AiModelDto;
import com.okinc.unify_trade.biz.bot.AiModelDto$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AiDetailResponseDto {
    public final AiModelDto aiModel;
    public final DataSetting dataSetting;
    public final List<String> instIds;
    public final String instType;
    public final String tdMode;
    public final String userPrompt;
    public final String userPromptEn;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.tradingbot.impl.aiBot.dto.AiDetailResponseDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiDetailResponseDto copy$default(AiDetailResponseDto aiDetailResponseDto, AiModelDto aiModelDto, String str, List list, String str2, DataSetting dataSetting, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            aiModelDto = aiDetailResponseDto.aiModel;
        }
        if ((i & 2) != 0) {
            str = aiDetailResponseDto.instType;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            list = aiDetailResponseDto.instIds;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str2 = aiDetailResponseDto.tdMode;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            dataSetting = aiDetailResponseDto.dataSetting;
        }
        DataSetting dataSetting2 = dataSetting;
        if ((i & 32) != 0) {
            str3 = aiDetailResponseDto.userPrompt;
        }
        String str7 = str3;
        if ((i & 64) != 0) {
            str4 = aiDetailResponseDto.userPromptEn;
        }
        return aiDetailResponseDto.OLrzqt(aiModelDto, str5, list2, str6, dataSetting2, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.userPrompt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> KWHzl() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AiDetailResponseDto OLrzqt(@NotNull AiModelDto aiModelDto, @NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull DataSetting dataSetting, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(aiModelDto, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dataSetting, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AiDetailResponseDto(aiModelDto, str, list, str2, dataSetting, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AiModelDto OLrzqt() {
        return this.aiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DataSetting copydefault() {
        return this.dataSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiDetailResponseDto)) {
            return false;
        }
        AiDetailResponseDto aiDetailResponseDto = (AiDetailResponseDto) obj;
        return Intrinsics.EZpvd(this.aiModel, aiDetailResponseDto.aiModel) && Intrinsics.EZpvd((Object) this.instType, (Object) aiDetailResponseDto.instType) && Intrinsics.EZpvd(this.instIds, aiDetailResponseDto.instIds) && Intrinsics.EZpvd((Object) this.tdMode, (Object) aiDetailResponseDto.tdMode) && Intrinsics.EZpvd(this.dataSetting, aiDetailResponseDto.dataSetting) && Intrinsics.EZpvd((Object) this.userPrompt, (Object) aiDetailResponseDto.userPrompt) && Intrinsics.EZpvd((Object) this.userPromptEn, (Object) aiDetailResponseDto.userPromptEn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.aiModel.hashCode() * 31) + this.instType.hashCode()) * 31) + this.instIds.hashCode()) * 31) + this.tdMode.hashCode()) * 31) + this.dataSetting.hashCode()) * 31) + this.userPrompt.hashCode()) * 31) + this.userPromptEn.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AiDetailResponseDto(aiModel=" + this.aiModel + ", instType=" + this.instType + ", instIds=" + this.instIds + ", tdMode=" + this.tdMode + ", dataSetting=" + this.dataSetting + ", userPrompt=" + this.userPrompt + ", userPromptEn=" + this.userPromptEn + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.userPromptEn;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.dto.AiDetailResponseDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AiDetailResponseDto> serializer() {
            return AiDetailResponseDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AiDetailResponseDto(int i, AiModelDto aiModelDto, String str, List list, String str2, DataSetting dataSetting, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AiDetailResponseDto$$serializer.INSTANCE.getDescriptor());
        }
        this.aiModel = aiModelDto;
        if ((i & 2) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 4) == 0) {
            this.instIds = yDY.AhwBna();
        } else {
            this.instIds = list;
        }
        if ((i & 8) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str2;
        }
        if ((i & 16) == 0) {
            this.dataSetting = new DataSetting((String) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.dataSetting = dataSetting;
        }
        if ((i & 32) == 0) {
            this.userPrompt = "";
        } else {
            this.userPrompt = str3;
        }
        if ((i & 64) == 0) {
            this.userPromptEn = "";
        } else {
            this.userPromptEn = str4;
        }
    }

    public static final /* synthetic */ void AEQbTJ(AiDetailResponseDto aiDetailResponseDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, AiModelDto$$serializer.INSTANCE, aiDetailResponseDto.aiModel);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) aiDetailResponseDto.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, aiDetailResponseDto.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(aiDetailResponseDto.instIds, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], aiDetailResponseDto.instIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) aiDetailResponseDto.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, aiDetailResponseDto.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(aiDetailResponseDto.dataSetting, new DataSetting((String) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, DataSetting$$serializer.INSTANCE, aiDetailResponseDto.dataSetting);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) aiDetailResponseDto.userPrompt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, aiDetailResponseDto.userPrompt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) aiDetailResponseDto.userPromptEn, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, aiDetailResponseDto.userPromptEn);
    }

    public AiDetailResponseDto(@NotNull AiModelDto aiModelDto, @NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull DataSetting dataSetting, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(aiModelDto, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dataSetting, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.aiModel = aiModelDto;
        this.instType = str;
        this.instIds = list;
        this.tdMode = str2;
        this.dataSetting = dataSetting;
        this.userPrompt = str3;
        this.userPromptEn = str4;
    }
}
