package com.okinc.market.common.biz_spot.bean;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PriceRemindRulesListBean {
    private int bizType;
    private String displayId;
    private String name;
    private List<AlertRemindPo> rules;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(AlertRemindPo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PriceRemindRulesListBean() {
        this((String) null, (String) null, 0, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.market.common.biz_spot.bean.PriceRemindRulesListBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PriceRemindRulesListBean copy$default(PriceRemindRulesListBean priceRemindRulesListBean, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = priceRemindRulesListBean.name;
        }
        if ((i2 & 2) != 0) {
            str2 = priceRemindRulesListBean.displayId;
        }
        if ((i2 & 4) != 0) {
            i = priceRemindRulesListBean.bizType;
        }
        if ((i2 & 8) != 0) {
            list = priceRemindRulesListBean.rules;
        }
        return priceRemindRulesListBean.copy(str, str2, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AlertRemindPo> component4() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRemindRulesListBean copy(@NotNull String str, @NotNull String str2, int i, @NotNull List<AlertRemindPo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new PriceRemindRulesListBean(str, str2, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceRemindRulesListBean)) {
            return false;
        }
        PriceRemindRulesListBean priceRemindRulesListBean = (PriceRemindRulesListBean) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) priceRemindRulesListBean.name) && Intrinsics.EZpvd((Object) this.displayId, (Object) priceRemindRulesListBean.displayId) && this.bizType == priceRemindRulesListBean.bizType && Intrinsics.EZpvd(this.rules, priceRemindRulesListBean.rules);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AlertRemindPo> getRules() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.displayId.hashCode()) * 31) + Integer.hashCode(this.bizType)) * 31) + this.rules.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(int i) {
        this.bizType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRules(@NotNull List<AlertRemindPo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.rules = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceRemindRulesListBean(name=" + this.name + ", displayId=" + this.displayId + ", bizType=" + this.bizType + ", rules=" + this.rules + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.market.common.biz_spot.bean.PriceRemindRulesListBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceRemindRulesListBean> serializer() {
            return PriceRemindRulesListBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriceRemindRulesListBean(int i, String str, String str2, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str2;
        }
        if ((i & 4) == 0) {
            this.bizType = 0;
        } else {
            this.bizType = i2;
        }
        if ((i & 8) == 0) {
            this.rules = new ArrayList();
        } else {
            this.rules = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_api(PriceRemindRulesListBean priceRemindRulesListBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) priceRemindRulesListBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, priceRemindRulesListBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) priceRemindRulesListBean.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, priceRemindRulesListBean.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || priceRemindRulesListBean.bizType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, priceRemindRulesListBean.bizType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(priceRemindRulesListBean.rules, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], priceRemindRulesListBean.rules);
    }

    public PriceRemindRulesListBean(@NotNull String str, @NotNull String str2, int i, @NotNull List<AlertRemindPo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.name = str;
        this.displayId = str2;
        this.bizType = i;
        this.rules = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0017: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:15) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, int, java.util.List<com.okinc.market.common.biz_spot.bean.AlertRemindPo>):void (m)] (LINE:11) call: com.okinc.market.common.biz_spot.bean.PriceRemindRulesListBean.<init>(java.lang.String, java.lang.String, int, java.util.List):void type: THIS */
    public /* synthetic */ PriceRemindRulesListBean(String str, String str2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new ArrayList() : list);
    }
}
