package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class BizModifyTriggerOrderReq {
    private String newSlOrdPx;
    private String newSlTriggerPx;
    private String newSlTriggerPxType;
    private String newSlTriggerRatio;
    private String newTpOrdPx;
    private String newTpTriggerPx;
    private String newTpTriggerPxType;
    private String newTpTriggerRatio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizModifyTriggerOrderReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.newTpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.newTpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.newSlTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.newSlOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.newTpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.newSlTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.newTpTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.newSlTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizModifyTriggerOrderReq copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new BizModifyTriggerOrderReq(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizModifyTriggerOrderReq)) {
            return false;
        }
        BizModifyTriggerOrderReq bizModifyTriggerOrderReq = (BizModifyTriggerOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.newTpTriggerPx, (Object) bizModifyTriggerOrderReq.newTpTriggerPx) && Intrinsics.EZpvd((Object) this.newTpOrdPx, (Object) bizModifyTriggerOrderReq.newTpOrdPx) && Intrinsics.EZpvd((Object) this.newSlTriggerPx, (Object) bizModifyTriggerOrderReq.newSlTriggerPx) && Intrinsics.EZpvd((Object) this.newSlOrdPx, (Object) bizModifyTriggerOrderReq.newSlOrdPx) && Intrinsics.EZpvd((Object) this.newTpTriggerPxType, (Object) bizModifyTriggerOrderReq.newTpTriggerPxType) && Intrinsics.EZpvd((Object) this.newSlTriggerPxType, (Object) bizModifyTriggerOrderReq.newSlTriggerPxType) && Intrinsics.EZpvd((Object) this.newTpTriggerRatio, (Object) bizModifyTriggerOrderReq.newTpTriggerRatio) && Intrinsics.EZpvd((Object) this.newSlTriggerRatio, (Object) bizModifyTriggerOrderReq.newSlTriggerRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewSlOrdPx() {
        return this.newSlOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewSlTriggerPx() {
        return this.newSlTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewSlTriggerPxType() {
        return this.newSlTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewSlTriggerRatio() {
        return this.newSlTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewTpOrdPx() {
        return this.newTpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewTpTriggerPx() {
        return this.newTpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewTpTriggerPxType() {
        return this.newTpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewTpTriggerRatio() {
        return this.newTpTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.newTpTriggerPx;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.newTpOrdPx;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.newSlTriggerPx;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.newSlOrdPx;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.newTpTriggerPxType;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.newSlTriggerPxType;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.newTpTriggerRatio;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.newSlTriggerRatio;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewSlOrdPx(String str) {
        this.newSlOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewSlTriggerPx(String str) {
        this.newSlTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewSlTriggerPxType(String str) {
        this.newSlTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewSlTriggerRatio(String str) {
        this.newSlTriggerRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewTpOrdPx(String str) {
        this.newTpOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewTpTriggerPx(String str) {
        this.newTpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewTpTriggerPxType(String str) {
        this.newTpTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewTpTriggerRatio(String str) {
        this.newTpTriggerRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BizModifyTriggerOrderReq(newTpTriggerPx=" + this.newTpTriggerPx + ", newTpOrdPx=" + this.newTpOrdPx + ", newSlTriggerPx=" + this.newSlTriggerPx + ", newSlOrdPx=" + this.newSlOrdPx + ", newTpTriggerPxType=" + this.newTpTriggerPxType + ", newSlTriggerPxType=" + this.newSlTriggerPxType + ", newTpTriggerRatio=" + this.newTpTriggerRatio + ", newSlTriggerRatio=" + this.newSlTriggerRatio + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BizModifyTriggerOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BizModifyTriggerOrderReq> serializer() {
            return BizModifyTriggerOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BizModifyTriggerOrderReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.newTpTriggerPx = null;
        } else {
            this.newTpTriggerPx = str;
        }
        if ((i & 2) == 0) {
            this.newTpOrdPx = null;
        } else {
            this.newTpOrdPx = str2;
        }
        if ((i & 4) == 0) {
            this.newSlTriggerPx = null;
        } else {
            this.newSlTriggerPx = str3;
        }
        if ((i & 8) == 0) {
            this.newSlOrdPx = null;
        } else {
            this.newSlOrdPx = str4;
        }
        if ((i & 16) == 0) {
            this.newTpTriggerPxType = null;
        } else {
            this.newTpTriggerPxType = str5;
        }
        if ((i & 32) == 0) {
            this.newSlTriggerPxType = null;
        } else {
            this.newSlTriggerPxType = str6;
        }
        if ((i & 64) == 0) {
            this.newTpTriggerRatio = null;
        } else {
            this.newTpTriggerRatio = str7;
        }
        if ((i & 128) == 0) {
            this.newSlTriggerRatio = null;
        } else {
            this.newSlTriggerRatio = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BizModifyTriggerOrderReq bizModifyTriggerOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bizModifyTriggerOrderReq.newTpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, bizModifyTriggerOrderReq.newTpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || bizModifyTriggerOrderReq.newTpOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bizModifyTriggerOrderReq.newTpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || bizModifyTriggerOrderReq.newSlTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, bizModifyTriggerOrderReq.newSlTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || bizModifyTriggerOrderReq.newSlOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, bizModifyTriggerOrderReq.newSlOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || bizModifyTriggerOrderReq.newTpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, bizModifyTriggerOrderReq.newTpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || bizModifyTriggerOrderReq.newSlTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, bizModifyTriggerOrderReq.newSlTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || bizModifyTriggerOrderReq.newTpTriggerRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, bizModifyTriggerOrderReq.newTpTriggerRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && bizModifyTriggerOrderReq.newSlTriggerRatio == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, bizModifyTriggerOrderReq.newSlTriggerRatio);
    }

    public BizModifyTriggerOrderReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.newTpTriggerPx = str;
        this.newTpOrdPx = str2;
        this.newSlTriggerPx = str3;
        this.newSlOrdPx = str4;
        this.newTpTriggerPxType = str5;
        this.newSlTriggerPxType = str6;
        this.newTpTriggerRatio = str7;
        this.newSlTriggerRatio = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:605) call: com.okinc.unify_trade.biz.BizModifyTriggerOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BizModifyTriggerOrderReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null);
    }
}
