package com.okinc.unify_trade.biz;

import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp$$serializer;
import java.util.ArrayList;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class GridOrderTpSlReq {
    private static final KSerializer<Object>[] $childSerializers;
    private String algoId;
    private String instId;
    private List<AdvancedTriggerSign> signParams;
    private String slRatio;
    private String slTriggerPx;
    private String topUpAmt;
    private String tpRatio;
    private TpSlTriggerParamReqResp tpSlTriggerParamReqResp;
    private String tpTriggerPx;
    private List<AdvancedTriggerSign> triggerParams;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridOrderTpSlReq() {
        this((String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (List) null, (List) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    @SerialName("tpslTriggerParam")
    public static /* synthetic */ void getTpSlTriggerParamReqResp$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.topUpAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp component5() {
        return this.tpSlTriggerParamReqResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AdvancedTriggerSign> component6() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AdvancedTriggerSign> component7() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridOrderTpSlReq copy(@NotNull String str, @NotNull String str2, String str3, String str4, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, List<AdvancedTriggerSign> list, List<AdvancedTriggerSign> list2, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new GridOrderTpSlReq(str, str2, str3, str4, tpSlTriggerParamReqResp, list, list2, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridOrderTpSlReq)) {
            return false;
        }
        GridOrderTpSlReq gridOrderTpSlReq = (GridOrderTpSlReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) gridOrderTpSlReq.algoId) && Intrinsics.EZpvd((Object) this.instId, (Object) gridOrderTpSlReq.instId) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) gridOrderTpSlReq.slTriggerPx) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) gridOrderTpSlReq.tpTriggerPx) && Intrinsics.EZpvd(this.tpSlTriggerParamReqResp, gridOrderTpSlReq.tpSlTriggerParamReqResp) && Intrinsics.EZpvd(this.signParams, gridOrderTpSlReq.signParams) && Intrinsics.EZpvd(this.triggerParams, gridOrderTpSlReq.triggerParams) && Intrinsics.EZpvd((Object) this.tpRatio, (Object) gridOrderTpSlReq.tpRatio) && Intrinsics.EZpvd((Object) this.slRatio, (Object) gridOrderTpSlReq.slRatio) && Intrinsics.EZpvd((Object) this.topUpAmt, (Object) gridOrderTpSlReq.topUpAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AdvancedTriggerSign> getSignParams() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlRatio() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopUpAmt() {
        return this.topUpAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpRatio() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp getTpSlTriggerParamReqResp() {
        return this.tpSlTriggerParamReqResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AdvancedTriggerSign> getTriggerParams() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        int iHashCode2 = this.instId.hashCode();
        String str = this.slTriggerPx;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.tpTriggerPx;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp = this.tpSlTriggerParamReqResp;
        int iHashCode5 = tpSlTriggerParamReqResp == null ? 0 : tpSlTriggerParamReqResp.hashCode();
        List<AdvancedTriggerSign> list = this.signParams;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        List<AdvancedTriggerSign> list2 = this.triggerParams;
        int iHashCode7 = list2 == null ? 0 : list2.hashCode();
        String str3 = this.tpRatio;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.slRatio;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.topUpAmt;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignParams(List<AdvancedTriggerSign> list) {
        this.signParams = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlRatio(String str) {
        this.slRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(String str) {
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopUpAmt(String str) {
        this.topUpAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpRatio(String str) {
        this.tpRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpSlTriggerParamReqResp(TpSlTriggerParamReqResp tpSlTriggerParamReqResp) {
        this.tpSlTriggerParamReqResp = tpSlTriggerParamReqResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPx(String str) {
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerParams(List<AdvancedTriggerSign> list) {
        this.triggerParams = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridOrderTpSlReq(algoId=" + this.algoId + ", instId=" + this.instId + ", slTriggerPx=" + this.slTriggerPx + ", tpTriggerPx=" + this.tpTriggerPx + ", tpSlTriggerParamReqResp=" + this.tpSlTriggerParamReqResp + ", signParams=" + this.signParams + ", triggerParams=" + this.triggerParams + ", tpRatio=" + this.tpRatio + ", slRatio=" + this.slRatio + ", topUpAmt=" + this.topUpAmt + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.GridOrderTpSlReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridOrderTpSlReq> serializer() {
            return GridOrderTpSlReq$$serializer.INSTANCE;
        }
    }

    static {
        AdvancedTriggerSign$$serializer advancedTriggerSign$$serializer = AdvancedTriggerSign$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, new ArrayListSerializer(advancedTriggerSign$$serializer), new ArrayListSerializer(advancedTriggerSign$$serializer), null, null, null};
    }

    public /* synthetic */ GridOrderTpSlReq(int i, String str, String str2, String str3, String str4, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, List list, List list2, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        this.algoId = (i & 1) == 0 ? "0" : str;
        this.instId = (i & 2) == 0 ? "" : str2;
        if ((i & 4) == 0) {
            this.slTriggerPx = null;
        } else {
            this.slTriggerPx = str3;
        }
        if ((i & 8) == 0) {
            this.tpTriggerPx = null;
        } else {
            this.tpTriggerPx = str4;
        }
        this.tpSlTriggerParamReqResp = (i & 16) == 0 ? new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null) : tpSlTriggerParamReqResp;
        if ((i & 32) == 0) {
            this.signParams = null;
        } else {
            this.signParams = list;
        }
        if ((i & 64) == 0) {
            this.triggerParams = null;
        } else {
            this.triggerParams = list2;
        }
        if ((i & 128) == 0) {
            this.tpRatio = null;
        } else {
            this.tpRatio = str5;
        }
        if ((i & 256) == 0) {
            this.slRatio = null;
        } else {
            this.slRatio = str6;
        }
        if ((i & 512) == 0) {
            this.topUpAmt = null;
        } else {
            this.topUpAmt = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(GridOrderTpSlReq gridOrderTpSlReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) gridOrderTpSlReq.algoId, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, gridOrderTpSlReq.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) gridOrderTpSlReq.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, gridOrderTpSlReq.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || gridOrderTpSlReq.slTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, gridOrderTpSlReq.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || gridOrderTpSlReq.tpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, gridOrderTpSlReq.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(gridOrderTpSlReq.tpSlTriggerParamReqResp, new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, TpSlTriggerParamReqResp$$serializer.INSTANCE, gridOrderTpSlReq.tpSlTriggerParamReqResp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || gridOrderTpSlReq.signParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], gridOrderTpSlReq.signParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || gridOrderTpSlReq.triggerParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], gridOrderTpSlReq.triggerParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || gridOrderTpSlReq.tpRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, gridOrderTpSlReq.tpRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || gridOrderTpSlReq.slRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, gridOrderTpSlReq.slRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && gridOrderTpSlReq.topUpAmt == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, gridOrderTpSlReq.topUpAmt);
    }

    public GridOrderTpSlReq(@NotNull String str, @NotNull String str2, String str3, String str4, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, List<AdvancedTriggerSign> list, List<AdvancedTriggerSign> list2, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.algoId = str;
        this.instId = str2;
        this.slTriggerPx = str3;
        this.tpTriggerPx = str4;
        this.tpSlTriggerParamReqResp = tpSlTriggerParamReqResp;
        this.signParams = list;
        this.triggerParams = list2;
        this.tpRatio = str5;
        this.slRatio = str6;
        this.topUpAmt = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0070: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp:?: TERNARY null = ((wrap:int:0x0023: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002f: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.ArrayList:?: CAST (java.util.ArrayList) (null java.util.ArrayList))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:2640) call: com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp.<init>(java.lang.String, java.lang.String, java.util.ArrayList, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r18v0 com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r19v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003d: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r24v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp, java.util.List<com.okinc.unify_trade.biz.AdvancedTriggerSign>, java.util.List<com.okinc.unify_trade.biz.AdvancedTriggerSign>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2634) call: com.okinc.unify_trade.biz.GridOrderTpSlReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GridOrderTpSlReq(String str, String str2, String str3, String str4, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, List list, List list2, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null) : tpSlTriggerParamReqResp, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) == 0 ? str7 : null);
    }
}
