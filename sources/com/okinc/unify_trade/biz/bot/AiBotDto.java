package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AiBotDto implements Parcelable {
    private final AiModelDto aiModel;
    private final List<String> instIds;
    private final String investAmount;
    private final String investCcy;
    private final String maxDrawDown;
    private final String profitLossRatio;
    private final String realizedPnl;
    private final String realizedPnlRate;
    private final String sharpeRatio;
    private final String totalApy;
    private final String totalPnl;
    private final String totalPnlRate;
    private final String upl;
    private final String uplRate;
    private final String winRate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AiBotDto> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<AiBotDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiBotDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AiBotDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AiModelDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiBotDto[] newArray(int i) {
            return new AiBotDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AiBotDto() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AiModelDto) null, (List) null, 32767, (DefaultConstructorMarker) null);
    }

    @SerialName("investAmountCcy")
    public static /* synthetic */ void getInvestCcy$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.investAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.winRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.profitLossRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.maxDrawDown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.sharpeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AiModelDto component14() {
        return this.aiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component15() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalPnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.realizedPnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.uplRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.totalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AiBotDto copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull AiModelDto aiModelDto, @NotNull List<String> list) {
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
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(aiModelDto, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AiBotDto(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, aiModelDto, list);
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
        if (!(obj instanceof AiBotDto)) {
            return false;
        }
        AiBotDto aiBotDto = (AiBotDto) obj;
        return Intrinsics.EZpvd((Object) this.investAmount, (Object) aiBotDto.investAmount) && Intrinsics.EZpvd((Object) this.investCcy, (Object) aiBotDto.investCcy) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) aiBotDto.totalPnl) && Intrinsics.EZpvd((Object) this.totalPnlRate, (Object) aiBotDto.totalPnlRate) && Intrinsics.EZpvd((Object) this.realizedPnl, (Object) aiBotDto.realizedPnl) && Intrinsics.EZpvd((Object) this.realizedPnlRate, (Object) aiBotDto.realizedPnlRate) && Intrinsics.EZpvd((Object) this.upl, (Object) aiBotDto.upl) && Intrinsics.EZpvd((Object) this.uplRate, (Object) aiBotDto.uplRate) && Intrinsics.EZpvd((Object) this.totalApy, (Object) aiBotDto.totalApy) && Intrinsics.EZpvd((Object) this.winRate, (Object) aiBotDto.winRate) && Intrinsics.EZpvd((Object) this.profitLossRatio, (Object) aiBotDto.profitLossRatio) && Intrinsics.EZpvd((Object) this.maxDrawDown, (Object) aiBotDto.maxDrawDown) && Intrinsics.EZpvd((Object) this.sharpeRatio, (Object) aiBotDto.sharpeRatio) && Intrinsics.EZpvd(this.aiModel, aiBotDto.aiModel) && Intrinsics.EZpvd(this.instIds, aiBotDto.instIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AiModelDto getAiModel() {
        return this.aiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getInstIds() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestAmount() {
        return this.investAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestCcy() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxDrawDown() {
        return this.maxDrawDown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitLossRatio() {
        return this.profitLossRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedPnl() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedPnlRate() {
        return this.realizedPnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSharpeRatio() {
        return this.sharpeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalApy() {
        return this.totalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnlRate() {
        return this.totalPnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpl() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUplRate() {
        return this.uplRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWinRate() {
        return this.winRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.investAmount.hashCode() * 31) + this.investCcy.hashCode()) * 31) + this.totalPnl.hashCode()) * 31) + this.totalPnlRate.hashCode()) * 31) + this.realizedPnl.hashCode()) * 31) + this.realizedPnlRate.hashCode()) * 31) + this.upl.hashCode()) * 31) + this.uplRate.hashCode()) * 31) + this.totalApy.hashCode()) * 31) + this.winRate.hashCode()) * 31) + this.profitLossRatio.hashCode()) * 31) + this.maxDrawDown.hashCode()) * 31) + this.sharpeRatio.hashCode()) * 31) + this.aiModel.hashCode()) * 31) + this.instIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AiBotDto(investAmount=" + this.investAmount + ", investCcy=" + this.investCcy + ", totalPnl=" + this.totalPnl + ", totalPnlRate=" + this.totalPnlRate + ", realizedPnl=" + this.realizedPnl + ", realizedPnlRate=" + this.realizedPnlRate + ", upl=" + this.upl + ", uplRate=" + this.uplRate + ", totalApy=" + this.totalApy + ", winRate=" + this.winRate + ", profitLossRatio=" + this.profitLossRatio + ", maxDrawDown=" + this.maxDrawDown + ", sharpeRatio=" + this.sharpeRatio + ", aiModel=" + this.aiModel + ", instIds=" + this.instIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.investAmount);
        parcel.writeString(this.investCcy);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.totalPnlRate);
        parcel.writeString(this.realizedPnl);
        parcel.writeString(this.realizedPnlRate);
        parcel.writeString(this.upl);
        parcel.writeString(this.uplRate);
        parcel.writeString(this.totalApy);
        parcel.writeString(this.winRate);
        parcel.writeString(this.profitLossRatio);
        parcel.writeString(this.maxDrawDown);
        parcel.writeString(this.sharpeRatio);
        this.aiModel.writeToParcel(parcel, i);
        parcel.writeStringList(this.instIds);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.AiBotDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AiBotDto> serializer() {
            return AiBotDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AiBotDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, AiModelDto aiModelDto, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.investAmount = "";
        } else {
            this.investAmount = str;
        }
        if ((i & 2) == 0) {
            this.investCcy = "";
        } else {
            this.investCcy = str2;
        }
        if ((i & 4) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str3;
        }
        if ((i & 8) == 0) {
            this.totalPnlRate = "";
        } else {
            this.totalPnlRate = str4;
        }
        if ((i & 16) == 0) {
            this.realizedPnl = "";
        } else {
            this.realizedPnl = str5;
        }
        if ((i & 32) == 0) {
            this.realizedPnlRate = "";
        } else {
            this.realizedPnlRate = str6;
        }
        if ((i & 64) == 0) {
            this.upl = "";
        } else {
            this.upl = str7;
        }
        if ((i & 128) == 0) {
            this.uplRate = "";
        } else {
            this.uplRate = str8;
        }
        if ((i & 256) == 0) {
            this.totalApy = "";
        } else {
            this.totalApy = str9;
        }
        if ((i & 512) == 0) {
            this.winRate = "";
        } else {
            this.winRate = str10;
        }
        if ((i & 1024) == 0) {
            this.profitLossRatio = "";
        } else {
            this.profitLossRatio = str11;
        }
        if ((i & 2048) == 0) {
            this.maxDrawDown = "";
        } else {
            this.maxDrawDown = str12;
        }
        if ((i & 4096) == 0) {
            this.sharpeRatio = "";
        } else {
            this.sharpeRatio = str13;
        }
        this.aiModel = (i & 8192) == 0 ? new AiModelDto((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : aiModelDto;
        this.instIds = (i & 16384) == 0 ? yDY.AhwBna() : list;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AiBotDto aiBotDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) aiBotDto.investAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, aiBotDto.investAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) aiBotDto.investCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, aiBotDto.investCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) aiBotDto.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, aiBotDto.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) aiBotDto.totalPnlRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, aiBotDto.totalPnlRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) aiBotDto.realizedPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, aiBotDto.realizedPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) aiBotDto.realizedPnlRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, aiBotDto.realizedPnlRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) aiBotDto.upl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, aiBotDto.upl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) aiBotDto.uplRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, aiBotDto.uplRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) aiBotDto.totalApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, aiBotDto.totalApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) aiBotDto.winRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, aiBotDto.winRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) aiBotDto.profitLossRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, aiBotDto.profitLossRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) aiBotDto.maxDrawDown, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, aiBotDto.maxDrawDown);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) aiBotDto.sharpeRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, aiBotDto.sharpeRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(aiBotDto.aiModel, new AiModelDto((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, AiModelDto$$serializer.INSTANCE, aiBotDto.aiModel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && Intrinsics.EZpvd(aiBotDto.instIds, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], aiBotDto.instIds);
    }

    public AiBotDto(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull AiModelDto aiModelDto, @NotNull List<String> list) {
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
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(aiModelDto, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.investAmount = str;
        this.investCcy = str2;
        this.totalPnl = str3;
        this.totalPnlRate = str4;
        this.realizedPnl = str5;
        this.realizedPnlRate = str6;
        this.upl = str7;
        this.uplRate = str8;
        this.totalApy = str9;
        this.winRate = str10;
        this.profitLossRatio = str11;
        this.maxDrawDown = str12;
        this.sharpeRatio = str13;
        this.aiModel = aiModelDto;
        this.instIds = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b7: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r33v0 java.lang.String) : (""))
  (wrap:com.okinc.unify_trade.biz.bot.AiModelDto:?: TERNARY null = ((wrap:int:0x006b: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0086: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:34) call: com.okinc.unify_trade.biz.bot.AiModelDto.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r34v0 com.okinc.unify_trade.biz.bot.AiModelDto))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x008c: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0090: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:35)) : (r35v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.AiModelDto, java.util.List<java.lang.String>):void (m)] (LINE:19) call: com.okinc.unify_trade.biz.bot.AiBotDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.AiModelDto, java.util.List):void type: THIS */
    public /* synthetic */ AiBotDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, AiModelDto aiModelDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) == 0 ? str13 : "", (i & 8192) != 0 ? new AiModelDto((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : aiModelDto, (i & 16384) != 0 ? yDY.AhwBna() : list);
    }
}
