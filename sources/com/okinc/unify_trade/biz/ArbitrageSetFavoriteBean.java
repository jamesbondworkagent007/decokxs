package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ArbitrageSetFavoriteBean {
    private String arbitrageId;
    private String arbitrageType;
    private String ccy;
    private String ctType;
    private String groupType;
    private Integer operator;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageId() {
        return this.arbitrageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageType() {
        return this.arbitrageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtType() {
        return this.ctType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupType() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOperator() {
        return this.operator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageId(String str) {
        this.arbitrageId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageType(String str) {
        this.arbitrageType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtType(String str) {
        this.ctType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupType(String str) {
        this.groupType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOperator(Integer num) {
        this.operator = num;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ArbitrageSetFavoriteBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbitrageSetFavoriteBean> serializer() {
            return ArbitrageSetFavoriteBean$$serializer.INSTANCE;
        }
    }

    public ArbitrageSetFavoriteBean() {
    }

    public /* synthetic */ ArbitrageSetFavoriteBean(int i, Integer num, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.operator = null;
        } else {
            this.operator = num;
        }
        if ((i & 2) == 0) {
            this.arbitrageId = null;
        } else {
            this.arbitrageId = str;
        }
        if ((i & 4) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str2;
        }
        if ((i & 8) == 0) {
            this.groupType = null;
        } else {
            this.groupType = str3;
        }
        if ((i & 16) == 0) {
            this.ctType = null;
        } else {
            this.ctType = str4;
        }
        if ((i & 32) == 0) {
            this.arbitrageType = null;
        } else {
            this.arbitrageType = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ArbitrageSetFavoriteBean arbitrageSetFavoriteBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || arbitrageSetFavoriteBean.operator != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, arbitrageSetFavoriteBean.operator);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || arbitrageSetFavoriteBean.arbitrageId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, arbitrageSetFavoriteBean.arbitrageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || arbitrageSetFavoriteBean.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, arbitrageSetFavoriteBean.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || arbitrageSetFavoriteBean.groupType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, arbitrageSetFavoriteBean.groupType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || arbitrageSetFavoriteBean.ctType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, arbitrageSetFavoriteBean.ctType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && arbitrageSetFavoriteBean.arbitrageType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, arbitrageSetFavoriteBean.arbitrageType);
    }
}
