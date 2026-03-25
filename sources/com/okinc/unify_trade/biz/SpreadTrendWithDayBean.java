package com.okinc.unify_trade.biz;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SpreadTrendWithDayBean {
    private String arbitrageId;
    private ArrayList<SpreadTrendWithDaySubBean> trendVos;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SpreadTrendWithDaySubBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageId() {
        return this.arbitrageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SpreadTrendWithDaySubBean> getTrendVos() {
        return this.trendVos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageId(String str) {
        this.arbitrageId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrendVos(ArrayList<SpreadTrendWithDaySubBean> arrayList) {
        this.trendVos = arrayList;
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpreadTrendWithDayBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpreadTrendWithDayBean> serializer() {
            return SpreadTrendWithDayBean$$serializer.INSTANCE;
        }
    }

    public SpreadTrendWithDayBean() {
    }

    public /* synthetic */ SpreadTrendWithDayBean(int i, String str, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.arbitrageId = null;
        } else {
            this.arbitrageId = str;
        }
        if ((i & 2) == 0) {
            this.trendVos = null;
        } else {
            this.trendVos = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpreadTrendWithDayBean spreadTrendWithDayBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spreadTrendWithDayBean.arbitrageId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spreadTrendWithDayBean.arbitrageId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && spreadTrendWithDayBean.trendVos == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], spreadTrendWithDayBean.trendVos);
    }
}
