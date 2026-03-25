package com.okinc.unify_trade.biz;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class BizModifyOrderReq {
    private List<BizModifyMultipleOrderReq> attachAlgoOrds;
    private String instId;
    private String isChasePrice;
    private String newPx;
    private String newPxUsd;
    private String newPxVol;
    private String newSlOrdPx;
    private String newSlTriggerPx;
    private String newSlTriggerPxType;
    private String newSz;
    private String newTpOrdPx;
    private String newTpTriggerPx;
    private String newTpTriggerPxType;
    private String ordId;
    private String side;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(BizModifyMultipleOrderReq$$serializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.newSlTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BizModifyMultipleOrderReq> component11() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.newPxUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.newPxVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.isChasePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.newSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.newPx;
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
    public final BizModifyOrderReq copy(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<BizModifyMultipleOrderReq> list, String str11, String str12, String str13, String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BizModifyOrderReq(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, list, str11, str12, str13, str14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizModifyOrderReq)) {
            return false;
        }
        BizModifyOrderReq bizModifyOrderReq = (BizModifyOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) bizModifyOrderReq.instId) && Intrinsics.EZpvd((Object) this.ordId, (Object) bizModifyOrderReq.ordId) && Intrinsics.EZpvd((Object) this.newSz, (Object) bizModifyOrderReq.newSz) && Intrinsics.EZpvd((Object) this.newPx, (Object) bizModifyOrderReq.newPx) && Intrinsics.EZpvd((Object) this.newTpTriggerPx, (Object) bizModifyOrderReq.newTpTriggerPx) && Intrinsics.EZpvd((Object) this.newTpOrdPx, (Object) bizModifyOrderReq.newTpOrdPx) && Intrinsics.EZpvd((Object) this.newSlTriggerPx, (Object) bizModifyOrderReq.newSlTriggerPx) && Intrinsics.EZpvd((Object) this.newSlOrdPx, (Object) bizModifyOrderReq.newSlOrdPx) && Intrinsics.EZpvd((Object) this.newTpTriggerPxType, (Object) bizModifyOrderReq.newTpTriggerPxType) && Intrinsics.EZpvd((Object) this.newSlTriggerPxType, (Object) bizModifyOrderReq.newSlTriggerPxType) && Intrinsics.EZpvd(this.attachAlgoOrds, bizModifyOrderReq.attachAlgoOrds) && Intrinsics.EZpvd((Object) this.newPxUsd, (Object) bizModifyOrderReq.newPxUsd) && Intrinsics.EZpvd((Object) this.newPxVol, (Object) bizModifyOrderReq.newPxVol) && Intrinsics.EZpvd((Object) this.isChasePrice, (Object) bizModifyOrderReq.isChasePrice) && Intrinsics.EZpvd((Object) this.side, (Object) bizModifyOrderReq.side);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BizModifyMultipleOrderReq> getAttachAlgoOrds() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewPx() {
        return this.newPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewPxUsd() {
        return this.newPxUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewPxVol() {
        return this.newPxVol;
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
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.ordId.hashCode();
        String str = this.newSz;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.newPx;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.newTpTriggerPx;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.newTpOrdPx;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.newSlTriggerPx;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.newSlOrdPx;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.newTpTriggerPxType;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.newSlTriggerPxType;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        List<BizModifyMultipleOrderReq> list = this.attachAlgoOrds;
        int iHashCode11 = list == null ? 0 : list.hashCode();
        String str9 = this.newPxUsd;
        int iHashCode12 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.newPxVol;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.isChasePrice;
        int iHashCode14 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.side;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str12 == null ? 0 : str12.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isChasePrice() {
        return this.isChasePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachAlgoOrds(List<BizModifyMultipleOrderReq> list) {
        this.attachAlgoOrds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChasePrice(String str) {
        this.isChasePrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewPx(String str) {
        this.newPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewPxUsd(String str) {
        this.newPxUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewPxVol(String str) {
        this.newPxVol = str;
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
    public final void setOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(String str) {
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BizModifyOrderReq(instId=" + this.instId + ", ordId=" + this.ordId + ", newSz=" + this.newSz + ", newPx=" + this.newPx + ", newTpTriggerPx=" + this.newTpTriggerPx + ", newTpOrdPx=" + this.newTpOrdPx + ", newSlTriggerPx=" + this.newSlTriggerPx + ", newSlOrdPx=" + this.newSlOrdPx + ", newTpTriggerPxType=" + this.newTpTriggerPxType + ", newSlTriggerPxType=" + this.newSlTriggerPxType + ", attachAlgoOrds=" + this.attachAlgoOrds + ", newPxUsd=" + this.newPxUsd + ", newPxVol=" + this.newPxVol + ", isChasePrice=" + this.isChasePrice + ", side=" + this.side + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BizModifyOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BizModifyOrderReq> serializer() {
            return BizModifyOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BizModifyOrderReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, BizModifyOrderReq$$serializer.INSTANCE.getDescriptor());
        }
        this.instId = str;
        this.ordId = str2;
        if ((i & 4) == 0) {
            this.newSz = null;
        } else {
            this.newSz = str3;
        }
        if ((i & 8) == 0) {
            this.newPx = null;
        } else {
            this.newPx = str4;
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
        if ((i & 1024) == 0) {
            this.attachAlgoOrds = null;
        } else {
            this.attachAlgoOrds = list;
        }
        if ((i & 2048) == 0) {
            this.newPxUsd = null;
        } else {
            this.newPxUsd = str11;
        }
        if ((i & 4096) == 0) {
            this.newPxVol = null;
        } else {
            this.newPxVol = str12;
        }
        if ((i & 8192) == 0) {
            this.isChasePrice = null;
        } else {
            this.isChasePrice = str13;
        }
        if ((i & 16384) == 0) {
            this.side = null;
        } else {
            this.side = str14;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BizModifyOrderReq bizModifyOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bizModifyOrderReq.instId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, bizModifyOrderReq.ordId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || bizModifyOrderReq.newSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, bizModifyOrderReq.newSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || bizModifyOrderReq.newPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, bizModifyOrderReq.newPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || bizModifyOrderReq.newTpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, bizModifyOrderReq.newTpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || bizModifyOrderReq.newTpOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, bizModifyOrderReq.newTpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || bizModifyOrderReq.newSlTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, bizModifyOrderReq.newSlTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || bizModifyOrderReq.newSlOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, bizModifyOrderReq.newSlOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || bizModifyOrderReq.newTpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, bizModifyOrderReq.newTpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || bizModifyOrderReq.newSlTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, bizModifyOrderReq.newSlTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || bizModifyOrderReq.attachAlgoOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], bizModifyOrderReq.attachAlgoOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || bizModifyOrderReq.newPxUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, bizModifyOrderReq.newPxUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || bizModifyOrderReq.newPxVol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, bizModifyOrderReq.newPxVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || bizModifyOrderReq.isChasePrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, bizModifyOrderReq.isChasePrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && bizModifyOrderReq.side == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, bizModifyOrderReq.side);
    }

    public BizModifyOrderReq(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<BizModifyMultipleOrderReq> list, String str11, String str12, String str13, String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.instId = str;
        this.ordId = str2;
        this.newSz = str3;
        this.newPx = str4;
        this.newTpTriggerPx = str5;
        this.newTpOrdPx = str6;
        this.newSlTriggerPx = str7;
        this.newSlOrdPx = str8;
        this.newTpTriggerPxType = str9;
        this.newSlTriggerPxType = str10;
        this.attachAlgoOrds = list;
        this.newPxUsd = str11;
        this.newPxVol = str12;
        this.isChasePrice = str13;
        this.side = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0074: CONSTRUCTOR 
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0043: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r30v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r35v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.BizModifyMultipleOrderReq>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:544) call: com.okinc.unify_trade.biz.BizModifyOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BizModifyOrderReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : list, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14);
    }
}
