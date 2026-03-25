package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class SpreadTrendWithDaySubBean {
    private String currentTime;
    private String fundingRate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentTime() {
        return this.currentTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingRate() {
        return this.fundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentTime(String str) {
        this.currentTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingRate(String str) {
        this.fundingRate = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpreadTrendWithDaySubBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpreadTrendWithDaySubBean> serializer() {
            return SpreadTrendWithDaySubBean$$serializer.INSTANCE;
        }
    }

    public SpreadTrendWithDaySubBean() {
    }

    public /* synthetic */ SpreadTrendWithDaySubBean(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fundingRate = null;
        } else {
            this.fundingRate = str;
        }
        if ((i & 2) == 0) {
            this.currentTime = null;
        } else {
            this.currentTime = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpreadTrendWithDaySubBean spreadTrendWithDaySubBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spreadTrendWithDaySubBean.fundingRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spreadTrendWithDaySubBean.fundingRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && spreadTrendWithDaySubBean.currentTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, spreadTrendWithDaySubBean.currentTime);
    }
}
