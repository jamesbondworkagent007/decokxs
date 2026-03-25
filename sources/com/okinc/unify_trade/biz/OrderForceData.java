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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class OrderForceData {
    private String bizType;
    private String ctVal;
    private List<ForceDetailData> details;
    private String instFamily;
    private String instId;
    private String totalLoss;
    private String uly;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(ForceDetailData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.unify_trade.biz.OrderForceData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderForceData copy$default(OrderForceData orderForceData, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderForceData.bizType;
        }
        if ((i & 2) != 0) {
            str2 = orderForceData.totalLoss;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = orderForceData.instId;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = orderForceData.uly;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = orderForceData.instFamily;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = orderForceData.ctVal;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            list = orderForceData.details;
        }
        return orderForceData.copy(str, str7, str8, str9, str10, str11, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalLoss;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ForceDetailData> component7() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderForceData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<ForceDetailData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new OrderForceData(str, str2, str3, str4, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderForceData)) {
            return false;
        }
        OrderForceData orderForceData = (OrderForceData) obj;
        return Intrinsics.EZpvd((Object) this.bizType, (Object) orderForceData.bizType) && Intrinsics.EZpvd((Object) this.totalLoss, (Object) orderForceData.totalLoss) && Intrinsics.EZpvd((Object) this.instId, (Object) orderForceData.instId) && Intrinsics.EZpvd((Object) this.uly, (Object) orderForceData.uly) && Intrinsics.EZpvd((Object) this.instFamily, (Object) orderForceData.instFamily) && Intrinsics.EZpvd((Object) this.ctVal, (Object) orderForceData.ctVal) && Intrinsics.EZpvd(this.details, orderForceData.details);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtVal() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ForceDetailData> getDetails() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalLoss() {
        return this.totalLoss;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.bizType.hashCode() * 31) + this.totalLoss.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.uly.hashCode()) * 31) + this.instFamily.hashCode()) * 31) + this.ctVal.hashCode()) * 31) + this.details.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtVal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ctVal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDetails(@NotNull List<ForceDetailData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.details = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstFamily(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instFamily = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalLoss(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalLoss = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderForceData(bizType=" + this.bizType + ", totalLoss=" + this.totalLoss + ", instId=" + this.instId + ", uly=" + this.uly + ", instFamily=" + this.instFamily + ", ctVal=" + this.ctVal + ", details=" + this.details + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OrderForceData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderForceData> serializer() {
            return OrderForceData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderForceData(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (64 != (i & 64)) {
            PluginExceptionsKt.throwMissingFieldException(i, 64, OrderForceData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.bizType = "";
        } else {
            this.bizType = str;
        }
        if ((i & 2) == 0) {
            this.totalLoss = "";
        } else {
            this.totalLoss = str2;
        }
        if ((i & 4) == 0) {
            this.instId = "";
        } else {
            this.instId = str3;
        }
        if ((i & 8) == 0) {
            this.uly = "";
        } else {
            this.uly = str4;
        }
        if ((i & 16) == 0) {
            this.instFamily = "";
        } else {
            this.instFamily = str5;
        }
        if ((i & 32) == 0) {
            this.ctVal = "";
        } else {
            this.ctVal = str6;
        }
        this.details = list;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OrderForceData orderForceData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) orderForceData.bizType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, orderForceData.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) orderForceData.totalLoss, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, orderForceData.totalLoss);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) orderForceData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, orderForceData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) orderForceData.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, orderForceData.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) orderForceData.instFamily, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, orderForceData.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) orderForceData.ctVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, orderForceData.ctVal);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], orderForceData.details);
    }

    public OrderForceData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<ForceDetailData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.bizType = str;
        this.totalLoss = str2;
        this.instId = str3;
        this.uly = str4;
        this.instFamily = str5;
        this.ctVal = str6;
        this.details = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (r17v0 java.util.List)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.ForceDetailData>):void (m)] (LINE:13) call: com.okinc.unify_trade.biz.OrderForceData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ OrderForceData(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, list);
    }
}
