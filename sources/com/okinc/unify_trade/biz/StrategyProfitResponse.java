package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyProfitResponse implements Parcelable {
    private final String cTime;
    private final String cycleId;
    private final Map<String, ProfitMarginPerCcyVo> marginPerCcy;
    private final String pnlRatio;
    private final String pnlRatioInSourceCcy;
    private final String profitNum;
    private final String sourceCcy;
    private final String timeUnit;
    private final String totalPnl;
    private final String totalPnlInSourceCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StrategyProfitResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, ProfitMarginPerCcyVo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<StrategyProfitResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyProfitResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), ProfitMarginPerCcyVo.CREATOR.createFromParcel(parcel));
            }
            return new StrategyProfitResponse(string, string2, string3, string4, string5, string6, string7, string8, string9, linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyProfitResponse[] newArray(int i) {
            return new StrategyProfitResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyProfitResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, ProfitMarginPerCcyVo> component10() {
        return this.marginPerCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.profitNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.pnlRatioInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.totalPnlInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyProfitResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull Map<String, ProfitMarginPerCcyVo> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new StrategyProfitResponse(str, str2, str3, str4, str5, str6, str7, str8, str9, map);
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
        if (!(obj instanceof StrategyProfitResponse)) {
            return false;
        }
        StrategyProfitResponse strategyProfitResponse = (StrategyProfitResponse) obj;
        return Intrinsics.EZpvd((Object) this.cycleId, (Object) strategyProfitResponse.cycleId) && Intrinsics.EZpvd((Object) this.profitNum, (Object) strategyProfitResponse.profitNum) && Intrinsics.EZpvd((Object) this.cTime, (Object) strategyProfitResponse.cTime) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) strategyProfitResponse.totalPnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) strategyProfitResponse.pnlRatio) && Intrinsics.EZpvd((Object) this.timeUnit, (Object) strategyProfitResponse.timeUnit) && Intrinsics.EZpvd((Object) this.sourceCcy, (Object) strategyProfitResponse.sourceCcy) && Intrinsics.EZpvd((Object) this.pnlRatioInSourceCcy, (Object) strategyProfitResponse.pnlRatioInSourceCcy) && Intrinsics.EZpvd((Object) this.totalPnlInSourceCcy, (Object) strategyProfitResponse.totalPnlInSourceCcy) && Intrinsics.EZpvd(this.marginPerCcy, strategyProfitResponse.marginPerCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCycleId() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, ProfitMarginPerCcyVo> getMarginPerCcy() {
        return this.marginPerCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatioInSourceCcy() {
        return this.pnlRatioInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitNum() {
        return this.profitNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceCcy() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeUnit() {
        return this.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnlInSourceCcy() {
        return this.totalPnlInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.cycleId.hashCode() * 31) + this.profitNum.hashCode()) * 31) + this.cTime.hashCode()) * 31) + this.totalPnl.hashCode()) * 31) + this.pnlRatio.hashCode()) * 31) + this.timeUnit.hashCode()) * 31) + this.sourceCcy.hashCode()) * 31) + this.pnlRatioInSourceCcy.hashCode()) * 31) + this.totalPnlInSourceCcy.hashCode()) * 31) + this.marginPerCcy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyProfitResponse(cycleId=" + this.cycleId + ", profitNum=" + this.profitNum + ", cTime=" + this.cTime + ", totalPnl=" + this.totalPnl + ", pnlRatio=" + this.pnlRatio + ", timeUnit=" + this.timeUnit + ", sourceCcy=" + this.sourceCcy + ", pnlRatioInSourceCcy=" + this.pnlRatioInSourceCcy + ", totalPnlInSourceCcy=" + this.totalPnlInSourceCcy + ", marginPerCcy=" + this.marginPerCcy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.cycleId);
        parcel.writeString(this.profitNum);
        parcel.writeString(this.cTime);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.timeUnit);
        parcel.writeString(this.sourceCcy);
        parcel.writeString(this.pnlRatioInSourceCcy);
        parcel.writeString(this.totalPnlInSourceCcy);
        Map<String, ProfitMarginPerCcyVo> map = this.marginPerCcy;
        parcel.writeInt(map.size());
        for (Map.Entry<String, ProfitMarginPerCcyVo> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyProfitResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyProfitResponse> serializer() {
            return StrategyProfitResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyProfitResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cycleId = "";
        } else {
            this.cycleId = str;
        }
        if ((i & 2) == 0) {
            this.profitNum = "";
        } else {
            this.profitNum = str2;
        }
        if ((i & 4) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str3;
        }
        if ((i & 8) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str4;
        }
        if ((i & 16) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str5;
        }
        if ((i & 32) == 0) {
            this.timeUnit = "";
        } else {
            this.timeUnit = str6;
        }
        if ((i & 64) == 0) {
            this.sourceCcy = "";
        } else {
            this.sourceCcy = str7;
        }
        if ((i & 128) == 0) {
            this.pnlRatioInSourceCcy = "";
        } else {
            this.pnlRatioInSourceCcy = str8;
        }
        if ((i & 256) == 0) {
            this.totalPnlInSourceCcy = "";
        } else {
            this.totalPnlInSourceCcy = str9;
        }
        if ((i & 512) == 0) {
            this.marginPerCcy = C56424yEw.KWHzl();
        } else {
            this.marginPerCcy = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyProfitResponse strategyProfitResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyProfitResponse.cycleId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyProfitResponse.cycleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyProfitResponse.profitNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyProfitResponse.profitNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) strategyProfitResponse.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyProfitResponse.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) strategyProfitResponse.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, strategyProfitResponse.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) strategyProfitResponse.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, strategyProfitResponse.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) strategyProfitResponse.timeUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, strategyProfitResponse.timeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) strategyProfitResponse.sourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, strategyProfitResponse.sourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) strategyProfitResponse.pnlRatioInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, strategyProfitResponse.pnlRatioInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) strategyProfitResponse.totalPnlInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, strategyProfitResponse.totalPnlInSourceCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd(strategyProfitResponse.marginPerCcy, C56424yEw.KWHzl())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], strategyProfitResponse.marginPerCcy);
    }

    public StrategyProfitResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull Map<String, ProfitMarginPerCcyVo> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.cycleId = str;
        this.profitNum = str2;
        this.cTime = str3;
        this.totalPnl = str4;
        this.pnlRatio = str5;
        this.timeUnit = str6;
        this.sourceCcy = str7;
        this.pnlRatioInSourceCcy = str8;
        this.totalPnlInSourceCcy = str9;
        this.marginPerCcy = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0064: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004b: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:1798)) : (r21v0 java.util.Map))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, com.okinc.unify_trade.biz.ProfitMarginPerCcyVo>):void (m)] (LINE:1788) call: com.okinc.unify_trade.biz.StrategyProfitResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ StrategyProfitResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "", (i & 512) != 0 ? C56424yEw.KWHzl() : map);
    }
}
