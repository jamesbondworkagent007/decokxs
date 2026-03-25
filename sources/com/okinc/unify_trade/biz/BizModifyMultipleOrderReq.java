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
public final class BizModifyMultipleOrderReq {
    private String amendPxOnTriggerType;
    private String attachAlgoId;
    private String newPercent;
    private String newSlOrdPx;
    private String newSlTriggerPx;
    private String newSlTriggerPxType;
    private String newSlTriggerRatio;
    private String newTpOrdKind;
    private String newTpOrdPx;
    private String newTpTriggerPx;
    private String newTpTriggerPxType;
    private String newTpTriggerRatio;
    private String sz;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizModifyMultipleOrderReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.attachAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.newTpOrdKind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.newPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.newTpTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.newSlTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.newTpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.newTpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.newTpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.newSlTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.newSlOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.newSlTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizModifyMultipleOrderReq copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        return new BizModifyMultipleOrderReq(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizModifyMultipleOrderReq)) {
            return false;
        }
        BizModifyMultipleOrderReq bizModifyMultipleOrderReq = (BizModifyMultipleOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.attachAlgoId, (Object) bizModifyMultipleOrderReq.attachAlgoId) && Intrinsics.EZpvd((Object) this.newTpTriggerPx, (Object) bizModifyMultipleOrderReq.newTpTriggerPx) && Intrinsics.EZpvd((Object) this.newTpOrdPx, (Object) bizModifyMultipleOrderReq.newTpOrdPx) && Intrinsics.EZpvd((Object) this.newTpTriggerPxType, (Object) bizModifyMultipleOrderReq.newTpTriggerPxType) && Intrinsics.EZpvd((Object) this.newSlTriggerPx, (Object) bizModifyMultipleOrderReq.newSlTriggerPx) && Intrinsics.EZpvd((Object) this.newSlOrdPx, (Object) bizModifyMultipleOrderReq.newSlOrdPx) && Intrinsics.EZpvd((Object) this.newSlTriggerPxType, (Object) bizModifyMultipleOrderReq.newSlTriggerPxType) && Intrinsics.EZpvd((Object) this.sz, (Object) bizModifyMultipleOrderReq.sz) && Intrinsics.EZpvd((Object) this.amendPxOnTriggerType, (Object) bizModifyMultipleOrderReq.amendPxOnTriggerType) && Intrinsics.EZpvd((Object) this.newTpOrdKind, (Object) bizModifyMultipleOrderReq.newTpOrdKind) && Intrinsics.EZpvd((Object) this.newPercent, (Object) bizModifyMultipleOrderReq.newPercent) && Intrinsics.EZpvd((Object) this.newTpTriggerRatio, (Object) bizModifyMultipleOrderReq.newTpTriggerRatio) && Intrinsics.EZpvd((Object) this.newSlTriggerRatio, (Object) bizModifyMultipleOrderReq.newSlTriggerRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmendPxOnTriggerType() {
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAttachAlgoId() {
        return this.attachAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewPercent() {
        return this.newPercent;
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
    public final String getNewTpOrdKind() {
        return this.newTpOrdKind;
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
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.attachAlgoId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.newTpTriggerPx;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.newTpOrdPx;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.newTpTriggerPxType;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.newSlTriggerPx;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.newSlOrdPx;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.newSlTriggerPxType;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.sz;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.amendPxOnTriggerType;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.newTpOrdKind;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.newPercent;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.newTpTriggerRatio;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.newSlTriggerRatio;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str13 != null ? str13.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmendPxOnTriggerType(String str) {
        this.amendPxOnTriggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachAlgoId(String str) {
        this.attachAlgoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewPercent(String str) {
        this.newPercent = str;
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
    public final void setNewTpOrdKind(String str) {
        this.newTpOrdKind = str;
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
    public final void setSz(String str) {
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BizModifyMultipleOrderReq(attachAlgoId=" + this.attachAlgoId + ", newTpTriggerPx=" + this.newTpTriggerPx + ", newTpOrdPx=" + this.newTpOrdPx + ", newTpTriggerPxType=" + this.newTpTriggerPxType + ", newSlTriggerPx=" + this.newSlTriggerPx + ", newSlOrdPx=" + this.newSlOrdPx + ", newSlTriggerPxType=" + this.newSlTriggerPxType + ", sz=" + this.sz + ", amendPxOnTriggerType=" + this.amendPxOnTriggerType + ", newTpOrdKind=" + this.newTpOrdKind + ", newPercent=" + this.newPercent + ", newTpTriggerRatio=" + this.newTpTriggerRatio + ", newSlTriggerRatio=" + this.newSlTriggerRatio + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BizModifyMultipleOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BizModifyMultipleOrderReq> serializer() {
            return BizModifyMultipleOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BizModifyMultipleOrderReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.attachAlgoId = null;
        } else {
            this.attachAlgoId = str;
        }
        if ((i & 2) == 0) {
            this.newTpTriggerPx = null;
        } else {
            this.newTpTriggerPx = str2;
        }
        if ((i & 4) == 0) {
            this.newTpOrdPx = null;
        } else {
            this.newTpOrdPx = str3;
        }
        if ((i & 8) == 0) {
            this.newTpTriggerPxType = null;
        } else {
            this.newTpTriggerPxType = str4;
        }
        if ((i & 16) == 0) {
            this.newSlTriggerPx = null;
        } else {
            this.newSlTriggerPx = str5;
        }
        if ((i & 32) == 0) {
            this.newSlOrdPx = null;
        } else {
            this.newSlOrdPx = str6;
        }
        if ((i & 64) == 0) {
            this.newSlTriggerPxType = null;
        } else {
            this.newSlTriggerPxType = str7;
        }
        if ((i & 128) == 0) {
            this.sz = null;
        } else {
            this.sz = str8;
        }
        if ((i & 256) == 0) {
            this.amendPxOnTriggerType = null;
        } else {
            this.amendPxOnTriggerType = str9;
        }
        if ((i & 512) == 0) {
            this.newTpOrdKind = null;
        } else {
            this.newTpOrdKind = str10;
        }
        if ((i & 1024) == 0) {
            this.newPercent = null;
        } else {
            this.newPercent = str11;
        }
        if ((i & 2048) == 0) {
            this.newTpTriggerRatio = null;
        } else {
            this.newTpTriggerRatio = str12;
        }
        if ((i & 4096) == 0) {
            this.newSlTriggerRatio = null;
        } else {
            this.newSlTriggerRatio = str13;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BizModifyMultipleOrderReq bizModifyMultipleOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bizModifyMultipleOrderReq.attachAlgoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, bizModifyMultipleOrderReq.attachAlgoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || bizModifyMultipleOrderReq.newTpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bizModifyMultipleOrderReq.newTpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || bizModifyMultipleOrderReq.newTpOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, bizModifyMultipleOrderReq.newTpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || bizModifyMultipleOrderReq.newTpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, bizModifyMultipleOrderReq.newTpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || bizModifyMultipleOrderReq.newSlTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, bizModifyMultipleOrderReq.newSlTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || bizModifyMultipleOrderReq.newSlOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, bizModifyMultipleOrderReq.newSlOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || bizModifyMultipleOrderReq.newSlTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, bizModifyMultipleOrderReq.newSlTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || bizModifyMultipleOrderReq.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, bizModifyMultipleOrderReq.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || bizModifyMultipleOrderReq.amendPxOnTriggerType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, bizModifyMultipleOrderReq.amendPxOnTriggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || bizModifyMultipleOrderReq.newTpOrdKind != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, bizModifyMultipleOrderReq.newTpOrdKind);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || bizModifyMultipleOrderReq.newPercent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, bizModifyMultipleOrderReq.newPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || bizModifyMultipleOrderReq.newTpTriggerRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, bizModifyMultipleOrderReq.newTpTriggerRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && bizModifyMultipleOrderReq.newSlTriggerRatio == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, bizModifyMultipleOrderReq.newSlTriggerRatio);
    }

    public BizModifyMultipleOrderReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.attachAlgoId = str;
        this.newTpTriggerPx = str2;
        this.newTpOrdPx = str3;
        this.newTpTriggerPxType = str4;
        this.newSlTriggerPx = str5;
        this.newSlOrdPx = str6;
        this.newSlTriggerPxType = str7;
        this.sz = str8;
        this.amendPxOnTriggerType = str9;
        this.newTpOrdKind = str10;
        this.newPercent = str11;
        this.newTpTriggerRatio = str12;
        this.newSlTriggerRatio = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0084: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:568) call: com.okinc.unify_trade.biz.BizModifyMultipleOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BizModifyMultipleOrderReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) == 0 ? str13 : null);
    }
}
