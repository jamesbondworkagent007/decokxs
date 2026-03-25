package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class ArbitrageInst {
    private String _last;
    private String ccy;
    private String enterPx;
    private String instId;
    private Boolean major;
    private String posSide;
    private String pxType;
    private Boolean reduceOnly;
    private String side;
    private String sz;
    private String tdMode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnterPx() {
        return this.enterPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getMajor() {
        return this.major;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxType() {
        return this.pxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String get_last() {
        return this._last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnterPx(String str) {
        this.enterPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMajor(Boolean bool) {
        this.major = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(String str) {
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxType(String str) {
        this.pxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnly(Boolean bool) {
        this.reduceOnly = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(String str) {
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(String str) {
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(String str) {
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void set_last(String str) {
        this._last = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ArbitrageInst.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbitrageInst> serializer() {
            return ArbitrageInst$$serializer.INSTANCE;
        }
    }

    public ArbitrageInst() {
    }

    public /* synthetic */ ArbitrageInst(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = null;
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.pxType = null;
        } else {
            this.pxType = str2;
        }
        if ((i & 4) == 0) {
            this.enterPx = null;
        } else {
            this.enterPx = str3;
        }
        if ((i & 8) == 0) {
            this.sz = null;
        } else {
            this.sz = str4;
        }
        if ((i & 16) == 0) {
            this.tdMode = null;
        } else {
            this.tdMode = str5;
        }
        if ((i & 32) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str6;
        }
        if ((i & 64) == 0) {
            this.posSide = null;
        } else {
            this.posSide = str7;
        }
        if ((i & 128) == 0) {
            this.side = null;
        } else {
            this.side = str8;
        }
        if ((i & 256) == 0) {
            this.reduceOnly = null;
        } else {
            this.reduceOnly = bool;
        }
        if ((i & 512) == 0) {
            this.major = null;
        } else {
            this.major = bool2;
        }
        if ((i & 1024) == 0) {
            this._last = null;
        } else {
            this._last = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ArbitrageInst arbitrageInst, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || arbitrageInst.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, arbitrageInst.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || arbitrageInst.pxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, arbitrageInst.pxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || arbitrageInst.enterPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, arbitrageInst.enterPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || arbitrageInst.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, arbitrageInst.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || arbitrageInst.tdMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, arbitrageInst.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || arbitrageInst.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, arbitrageInst.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || arbitrageInst.posSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, arbitrageInst.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || arbitrageInst.side != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, arbitrageInst.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || arbitrageInst.reduceOnly != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, arbitrageInst.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || arbitrageInst.major != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, arbitrageInst.major);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && arbitrageInst._last == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, arbitrageInst._last);
    }
}
