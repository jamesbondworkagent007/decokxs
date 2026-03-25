package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class BizModifyAlgoOrderReq {
    private String algoClOrdId;
    private String algoId;
    private String instId;
    private String newSlOrdPx;
    private String newSlTriggerPx;
    private String newSlTriggerPxType;
    private String newSz;
    private String newTpOrdPx;
    private String newTpTriggerPx;
    private String newTpTriggerPxType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.newSlTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.algoClOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.newSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.newTpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.newTpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.newSlTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.newSlOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.newTpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizModifyAlgoOrderReq copy(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BizModifyAlgoOrderReq(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizModifyAlgoOrderReq)) {
            return false;
        }
        BizModifyAlgoOrderReq bizModifyAlgoOrderReq = (BizModifyAlgoOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) bizModifyAlgoOrderReq.instId) && Intrinsics.EZpvd((Object) this.algoId, (Object) bizModifyAlgoOrderReq.algoId) && Intrinsics.EZpvd((Object) this.algoClOrdId, (Object) bizModifyAlgoOrderReq.algoClOrdId) && Intrinsics.EZpvd((Object) this.newSz, (Object) bizModifyAlgoOrderReq.newSz) && Intrinsics.EZpvd((Object) this.newTpTriggerPx, (Object) bizModifyAlgoOrderReq.newTpTriggerPx) && Intrinsics.EZpvd((Object) this.newTpOrdPx, (Object) bizModifyAlgoOrderReq.newTpOrdPx) && Intrinsics.EZpvd((Object) this.newSlTriggerPx, (Object) bizModifyAlgoOrderReq.newSlTriggerPx) && Intrinsics.EZpvd((Object) this.newSlOrdPx, (Object) bizModifyAlgoOrderReq.newSlOrdPx) && Intrinsics.EZpvd((Object) this.newTpTriggerPxType, (Object) bizModifyAlgoOrderReq.newTpTriggerPxType) && Intrinsics.EZpvd((Object) this.newSlTriggerPxType, (Object) bizModifyAlgoOrderReq.newSlTriggerPxType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoClOrdId() {
        return this.algoClOrdId;
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
    public final String getNewSz() {
        return this.newSz;
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
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        String str = this.algoId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.algoClOrdId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.newSz;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.newTpTriggerPx;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.newTpOrdPx;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.newSlTriggerPx;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.newSlOrdPx;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.newTpTriggerPxType;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.newSlTriggerPxType;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoClOrdId(String str) {
        this.algoClOrdId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(String str) {
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
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
    public final void setNewSz(String str) {
        this.newSz = str;
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
    public String toString() {
        return "BizModifyAlgoOrderReq(instId=" + this.instId + ", algoId=" + this.algoId + ", algoClOrdId=" + this.algoClOrdId + ", newSz=" + this.newSz + ", newTpTriggerPx=" + this.newTpTriggerPx + ", newTpOrdPx=" + this.newTpOrdPx + ", newSlTriggerPx=" + this.newSlTriggerPx + ", newSlOrdPx=" + this.newSlOrdPx + ", newTpTriggerPxType=" + this.newTpTriggerPxType + ", newSlTriggerPxType=" + this.newSlTriggerPxType + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BizModifyAlgoOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BizModifyAlgoOrderReq> serializer() {
            return BizModifyAlgoOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BizModifyAlgoOrderReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, BizModifyAlgoOrderReq$$serializer.INSTANCE.getDescriptor());
        }
        this.instId = str;
        if ((i & 2) == 0) {
            this.algoId = null;
        } else {
            this.algoId = str2;
        }
        if ((i & 4) == 0) {
            this.algoClOrdId = null;
        } else {
            this.algoClOrdId = str3;
        }
        if ((i & 8) == 0) {
            this.newSz = null;
        } else {
            this.newSz = str4;
        }
        if ((i & 16) == 0) {
            this.newTpTriggerPx = null;
        } else {
            this.newTpTriggerPx = str5;
        }
        if ((i & 32) == 0) {
            this.newTpOrdPx = null;
        } else {
            this.newTpOrdPx = str6;
        }
        if ((i & 64) == 0) {
            this.newSlTriggerPx = null;
        } else {
            this.newSlTriggerPx = str7;
        }
        if ((i & 128) == 0) {
            this.newSlOrdPx = null;
        } else {
            this.newSlOrdPx = str8;
        }
        if ((i & 256) == 0) {
            this.newTpTriggerPxType = null;
        } else {
            this.newTpTriggerPxType = str9;
        }
        if ((i & 512) == 0) {
            this.newSlTriggerPxType = null;
        } else {
            this.newSlTriggerPxType = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BizModifyAlgoOrderReq bizModifyAlgoOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bizModifyAlgoOrderReq.instId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || bizModifyAlgoOrderReq.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bizModifyAlgoOrderReq.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || bizModifyAlgoOrderReq.algoClOrdId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, bizModifyAlgoOrderReq.algoClOrdId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || bizModifyAlgoOrderReq.newSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, bizModifyAlgoOrderReq.newSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || bizModifyAlgoOrderReq.newTpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, bizModifyAlgoOrderReq.newTpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || bizModifyAlgoOrderReq.newTpOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, bizModifyAlgoOrderReq.newTpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || bizModifyAlgoOrderReq.newSlTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, bizModifyAlgoOrderReq.newSlTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || bizModifyAlgoOrderReq.newSlOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, bizModifyAlgoOrderReq.newSlOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || bizModifyAlgoOrderReq.newTpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, bizModifyAlgoOrderReq.newTpTriggerPxType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && bizModifyAlgoOrderReq.newSlTriggerPxType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, bizModifyAlgoOrderReq.newSlTriggerPxType);
    }

    public BizModifyAlgoOrderReq(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
        this.algoId = str2;
        this.algoClOrdId = str3;
        this.newSz = str4;
        this.newTpTriggerPx = str5;
        this.newTpOrdPx = str6;
        this.newSlTriggerPx = str7;
        this.newSlOrdPx = str8;
        this.newTpTriggerPxType = str9;
        this.newSlTriggerPxType = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0058: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r21v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r21v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:589) call: com.okinc.unify_trade.biz.BizModifyAlgoOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BizModifyAlgoOrderReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? str10 : null);
    }
}
