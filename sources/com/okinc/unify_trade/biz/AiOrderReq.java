package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AiOrderReq implements Parcelable {
    private final String aiModel;
    private final DataSetting dataSetting;
    private final List<String> instIds;
    private final String instType;
    private final String ordType;
    private final String quoteCcy;
    private final String slRatio;
    private final String systemPromptVersion;
    private final String tdMode;
    private final String totalAmt;
    private final String tpRatio;
    private final String userPrompt;
    private final String userPromptEn;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AiOrderReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<AiOrderReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiOrderReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AiOrderReq(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), DataSetting.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiOrderReq[] newArray(int i) {
            return new AiOrderReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AiOrderReq() {
        this((String) null, (List) null, (String) null, (String) null, (String) null, (DataSetting) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.aiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.systemPromptVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DataSetting component6() {
        return this.dataSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.userPrompt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.userPromptEn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AiOrderReq copy(@NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull DataSetting dataSetting, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(dataSetting, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new AiOrderReq(str, list, str2, str3, str4, dataSetting, str5, str6, str7, str8, str9, str10, str11);
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
        if (!(obj instanceof AiOrderReq)) {
            return false;
        }
        AiOrderReq aiOrderReq = (AiOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.aiModel, (Object) aiOrderReq.aiModel) && Intrinsics.EZpvd(this.instIds, aiOrderReq.instIds) && Intrinsics.EZpvd((Object) this.instType, (Object) aiOrderReq.instType) && Intrinsics.EZpvd((Object) this.ordType, (Object) aiOrderReq.ordType) && Intrinsics.EZpvd((Object) this.tdMode, (Object) aiOrderReq.tdMode) && Intrinsics.EZpvd(this.dataSetting, aiOrderReq.dataSetting) && Intrinsics.EZpvd((Object) this.userPrompt, (Object) aiOrderReq.userPrompt) && Intrinsics.EZpvd((Object) this.userPromptEn, (Object) aiOrderReq.userPromptEn) && Intrinsics.EZpvd((Object) this.totalAmt, (Object) aiOrderReq.totalAmt) && Intrinsics.EZpvd((Object) this.quoteCcy, (Object) aiOrderReq.quoteCcy) && Intrinsics.EZpvd((Object) this.tpRatio, (Object) aiOrderReq.tpRatio) && Intrinsics.EZpvd((Object) this.slRatio, (Object) aiOrderReq.slRatio) && Intrinsics.EZpvd((Object) this.systemPromptVersion, (Object) aiOrderReq.systemPromptVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAiModel() {
        return this.aiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DataSetting getDataSetting() {
        return this.dataSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getInstIds() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCcy() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlRatio() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSystemPromptVersion() {
        return this.systemPromptVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmt() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpRatio() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserPrompt() {
        return this.userPrompt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserPromptEn() {
        return this.userPromptEn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.aiModel.hashCode();
        int iHashCode2 = this.instIds.hashCode();
        int iHashCode3 = this.instType.hashCode();
        int iHashCode4 = this.ordType.hashCode();
        int iHashCode5 = this.tdMode.hashCode();
        int iHashCode6 = this.dataSetting.hashCode();
        int iHashCode7 = this.userPrompt.hashCode();
        int iHashCode8 = this.userPromptEn.hashCode();
        int iHashCode9 = this.totalAmt.hashCode();
        int iHashCode10 = this.quoteCcy.hashCode();
        String str = this.tpRatio;
        int iHashCode11 = str == null ? 0 : str.hashCode();
        String str2 = this.slRatio;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.systemPromptVersion.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AiOrderReq(aiModel=" + this.aiModel + ", instIds=" + this.instIds + ", instType=" + this.instType + ", ordType=" + this.ordType + ", tdMode=" + this.tdMode + ", dataSetting=" + this.dataSetting + ", userPrompt=" + this.userPrompt + ", userPromptEn=" + this.userPromptEn + ", totalAmt=" + this.totalAmt + ", quoteCcy=" + this.quoteCcy + ", tpRatio=" + this.tpRatio + ", slRatio=" + this.slRatio + ", systemPromptVersion=" + this.systemPromptVersion + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.aiModel);
        parcel.writeStringList(this.instIds);
        parcel.writeString(this.instType);
        parcel.writeString(this.ordType);
        parcel.writeString(this.tdMode);
        this.dataSetting.writeToParcel(parcel, i);
        parcel.writeString(this.userPrompt);
        parcel.writeString(this.userPromptEn);
        parcel.writeString(this.totalAmt);
        parcel.writeString(this.quoteCcy);
        parcel.writeString(this.tpRatio);
        parcel.writeString(this.slRatio);
        parcel.writeString(this.systemPromptVersion);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AiOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AiOrderReq> serializer() {
            return AiOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AiOrderReq(int i, String str, List list, String str2, String str3, String str4, DataSetting dataSetting, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.aiModel = "";
        } else {
            this.aiModel = str;
        }
        this.instIds = (i & 2) == 0 ? yDY.AhwBna() : list;
        if ((i & 4) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
        if ((i & 8) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str3;
        }
        if ((i & 16) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str4;
        }
        this.dataSetting = (i & 32) == 0 ? new DataSetting((String) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : dataSetting;
        if ((i & 64) == 0) {
            this.userPrompt = "";
        } else {
            this.userPrompt = str5;
        }
        if ((i & 128) == 0) {
            this.userPromptEn = "";
        } else {
            this.userPromptEn = str6;
        }
        if ((i & 256) == 0) {
            this.totalAmt = "";
        } else {
            this.totalAmt = str7;
        }
        if ((i & 512) == 0) {
            this.quoteCcy = "";
        } else {
            this.quoteCcy = str8;
        }
        if ((i & 1024) == 0) {
            this.tpRatio = null;
        } else {
            this.tpRatio = str9;
        }
        if ((i & 2048) == 0) {
            this.slRatio = null;
        } else {
            this.slRatio = str10;
        }
        if ((i & 4096) == 0) {
            this.systemPromptVersion = "";
        } else {
            this.systemPromptVersion = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AiOrderReq aiOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) aiOrderReq.aiModel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, aiOrderReq.aiModel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(aiOrderReq.instIds, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], aiOrderReq.instIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) aiOrderReq.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, aiOrderReq.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) aiOrderReq.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, aiOrderReq.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) aiOrderReq.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, aiOrderReq.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(aiOrderReq.dataSetting, new DataSetting((String) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, DataSetting$$serializer.INSTANCE, aiOrderReq.dataSetting);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) aiOrderReq.userPrompt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, aiOrderReq.userPrompt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) aiOrderReq.userPromptEn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, aiOrderReq.userPromptEn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) aiOrderReq.totalAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, aiOrderReq.totalAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) aiOrderReq.quoteCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, aiOrderReq.quoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || aiOrderReq.tpRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, aiOrderReq.tpRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || aiOrderReq.slRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, aiOrderReq.slRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) aiOrderReq.systemPromptVersion, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, aiOrderReq.systemPromptVersion);
    }

    public AiOrderReq(@NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull DataSetting dataSetting, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(dataSetting, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.aiModel = str;
        this.instIds = list;
        this.instType = str2;
        this.ordType = str3;
        this.tdMode = str4;
        this.dataSetting = dataSetting;
        this.userPrompt = str5;
        this.userPromptEn = str6;
        this.totalAmt = str7;
        this.quoteCcy = str8;
        this.tpRatio = str9;
        this.slRatio = str10;
        this.systemPromptVersion = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r17v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.DataSetting:?: TERNARY null = ((wrap:int:0x002f: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0046: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:18) call: com.okinc.unify_trade.biz.DataSetting.<init>(java.lang.String, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r21v0 com.okinc.unify_trade.biz.DataSetting))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0075: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007c: ARITH (r29v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.DataSetting, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.unify_trade.biz.AiOrderReq.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.DataSetting, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AiOrderReq(String str, List list, String str2, String str3, String str4, DataSetting dataSetting, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? new DataSetting((String) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : dataSetting, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? null : str9, (i & 2048) == 0 ? str10 : null, (i & 4096) == 0 ? str11 : "");
    }
}
