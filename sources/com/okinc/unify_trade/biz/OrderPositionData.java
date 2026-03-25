package com.okinc.unify_trade.biz;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.biz.StrategyType;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class OrderPositionData {
    private String allOrderListSize;
    private BotAmtData botAmtData;
    private NormalDexOrderAmtData dexOrderAmtData;
    private NormalOrderAmtData normalOrderAmtData;
    private String orderLeadAmt;
    private OrderLeadPosSize orderLeadAmtNew;
    private String posAssetAmt;
    private String posTotalAmt;
    private StrategyAmtData strategyOrderAmtData;
    private int type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StrategyType.values().length];
            try {
                iArr[StrategyType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StrategyType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StrategyType.ADVANCED_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StrategyType.STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StrategyType.MP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StrategyType.TRIGGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderPositionData() {
        this(null, null, null, null, null, null, null, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.posTotalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.posAssetAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NormalOrderAmtData component3() {
        return this.normalOrderAmtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyAmtData component4() {
        return this.strategyOrderAmtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotAmtData component5() {
        return this.botAmtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.orderLeadAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderLeadPosSize component7() {
        return this.orderLeadAmtNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NormalDexOrderAmtData component8() {
        return this.dexOrderAmtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderPositionData copy(String str, String str2, @NotNull NormalOrderAmtData normalOrderAmtData, @NotNull StrategyAmtData strategyAmtData, @NotNull BotAmtData botAmtData, String str3, @NotNull OrderLeadPosSize orderLeadPosSize, @NotNull NormalDexOrderAmtData normalDexOrderAmtData, int i) {
        Intrinsics.checkNotNullParameter(normalOrderAmtData, "");
        Intrinsics.checkNotNullParameter(strategyAmtData, "");
        Intrinsics.checkNotNullParameter(botAmtData, "");
        Intrinsics.checkNotNullParameter(orderLeadPosSize, "");
        Intrinsics.checkNotNullParameter(normalDexOrderAmtData, "");
        return new OrderPositionData(str, str2, normalOrderAmtData, strategyAmtData, botAmtData, str3, orderLeadPosSize, normalDexOrderAmtData, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderPositionData)) {
            return false;
        }
        OrderPositionData orderPositionData = (OrderPositionData) obj;
        return Intrinsics.EZpvd((Object) this.posTotalAmt, (Object) orderPositionData.posTotalAmt) && Intrinsics.EZpvd((Object) this.posAssetAmt, (Object) orderPositionData.posAssetAmt) && Intrinsics.EZpvd(this.normalOrderAmtData, orderPositionData.normalOrderAmtData) && Intrinsics.EZpvd(this.strategyOrderAmtData, orderPositionData.strategyOrderAmtData) && Intrinsics.EZpvd(this.botAmtData, orderPositionData.botAmtData) && Intrinsics.EZpvd((Object) this.orderLeadAmt, (Object) orderPositionData.orderLeadAmt) && Intrinsics.EZpvd(this.orderLeadAmtNew, orderPositionData.orderLeadAmtNew) && Intrinsics.EZpvd(this.dexOrderAmtData, orderPositionData.dexOrderAmtData) && this.type == orderPositionData.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotAmtData getBotAmtData() {
        return this.botAmtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NormalDexOrderAmtData getDexOrderAmtData() {
        return this.dexOrderAmtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NormalOrderAmtData getNormalOrderAmtData() {
        return this.normalOrderAmtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderLeadAmt() {
        return this.orderLeadAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderLeadPosSize getOrderLeadAmtNew() {
        return this.orderLeadAmtNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderLeadPosSize getOrderLeadPosSize() {
        return this.orderLeadAmtNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosAssetAmt() {
        return this.posAssetAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosOrderLeadAmt() {
        String str = this.orderLeadAmt;
        return str == null ? "0" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosTotalAmt() {
        return this.posTotalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyAmtData getStrategyOrderAmtData() {
        return this.strategyOrderAmtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.posTotalAmt;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.posAssetAmt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.normalOrderAmtData.hashCode();
        int iHashCode4 = this.strategyOrderAmtData.hashCode();
        int iHashCode5 = this.botAmtData.hashCode();
        String str3 = this.orderLeadAmt;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.orderLeadAmtNew.hashCode()) * 31) + this.dexOrderAmtData.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllOrderListSize(String str) {
        this.allOrderListSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBotAmtData(@NotNull BotAmtData botAmtData) {
        Intrinsics.checkNotNullParameter(botAmtData, "");
        this.botAmtData = botAmtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexOrderAmtData(@NotNull NormalDexOrderAmtData normalDexOrderAmtData) {
        Intrinsics.checkNotNullParameter(normalDexOrderAmtData, "");
        this.dexOrderAmtData = normalDexOrderAmtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNormalOrderAmtData(@NotNull NormalOrderAmtData normalOrderAmtData) {
        Intrinsics.checkNotNullParameter(normalOrderAmtData, "");
        this.normalOrderAmtData = normalOrderAmtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderLeadAmt(String str) {
        this.orderLeadAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderLeadAmtNew(@NotNull OrderLeadPosSize orderLeadPosSize) {
        Intrinsics.checkNotNullParameter(orderLeadPosSize, "");
        this.orderLeadAmtNew = orderLeadPosSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosAssetAmt(String str) {
        this.posAssetAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosTotalAmt(String str) {
        this.posTotalAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrategyOrderAmtData(@NotNull StrategyAmtData strategyAmtData) {
        Intrinsics.checkNotNullParameter(strategyAmtData, "");
        this.strategyOrderAmtData = strategyAmtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderPositionData(posTotalAmt=" + this.posTotalAmt + ", posAssetAmt=" + this.posAssetAmt + ", normalOrderAmtData=" + this.normalOrderAmtData + ", strategyOrderAmtData=" + this.strategyOrderAmtData + ", botAmtData=" + this.botAmtData + ", orderLeadAmt=" + this.orderLeadAmt + ", orderLeadAmtNew=" + this.orderLeadAmtNew + ", dexOrderAmtData=" + this.dexOrderAmtData + ", type=" + this.type + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OrderPositionData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderPositionData> serializer() {
            return OrderPositionData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderPositionData(int i, String str, String str2, NormalOrderAmtData normalOrderAmtData, StrategyAmtData strategyAmtData, BotAmtData botAmtData, String str3, OrderLeadPosSize orderLeadPosSize, NormalDexOrderAmtData normalDexOrderAmtData, int i2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.posTotalAmt = null;
        } else {
            this.posTotalAmt = str;
        }
        if ((i & 2) == 0) {
            this.posAssetAmt = null;
        } else {
            this.posAssetAmt = str2;
        }
        this.normalOrderAmtData = (i & 4) == 0 ? new NormalOrderAmtData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : normalOrderAmtData;
        this.strategyOrderAmtData = (i & 8) == 0 ? new StrategyAmtData((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : strategyAmtData;
        this.botAmtData = (i & 16) == 0 ? new BotAmtData((ConcurrentHashMap) null, (ConcurrentHashMap) null, (ConcurrentHashMap) null, 7, (DefaultConstructorMarker) null) : botAmtData;
        this.orderLeadAmt = (i & 32) == 0 ? "0" : str3;
        this.orderLeadAmtNew = (i & 64) == 0 ? new OrderLeadPosSize((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : orderLeadPosSize;
        this.dexOrderAmtData = (i & 128) == 0 ? new NormalDexOrderAmtData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : normalDexOrderAmtData;
        this.type = (i & 256) == 0 ? -1 : i2;
        if ((i & 512) == 0) {
            this.allOrderListSize = null;
        } else {
            this.allOrderListSize = str4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2396=6] */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OrderPositionData orderPositionData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || orderPositionData.posTotalAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, orderPositionData.posTotalAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || orderPositionData.posAssetAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, orderPositionData.posAssetAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(orderPositionData.normalOrderAmtData, new NormalOrderAmtData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, NormalOrderAmtData$$serializer.INSTANCE, orderPositionData.normalOrderAmtData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(orderPositionData.strategyOrderAmtData, new StrategyAmtData((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, StrategyAmtData$$serializer.INSTANCE, orderPositionData.strategyOrderAmtData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(orderPositionData.botAmtData, new BotAmtData((ConcurrentHashMap) null, (ConcurrentHashMap) null, (ConcurrentHashMap) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, BotAmtData$$serializer.INSTANCE, orderPositionData.botAmtData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) orderPositionData.orderLeadAmt, (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, orderPositionData.orderLeadAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(orderPositionData.orderLeadAmtNew, new OrderLeadPosSize((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, OrderLeadPosSize$$serializer.INSTANCE, orderPositionData.orderLeadAmtNew);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(orderPositionData.dexOrderAmtData, new NormalDexOrderAmtData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, NormalDexOrderAmtData$$serializer.INSTANCE, orderPositionData.dexOrderAmtData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || orderPositionData.type != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, orderPositionData.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && orderPositionData.allOrderListSize == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, orderPositionData.allOrderListSize);
    }

    public OrderPositionData(String str, String str2, @NotNull NormalOrderAmtData normalOrderAmtData, @NotNull StrategyAmtData strategyAmtData, @NotNull BotAmtData botAmtData, String str3, @NotNull OrderLeadPosSize orderLeadPosSize, @NotNull NormalDexOrderAmtData normalDexOrderAmtData, int i) {
        Intrinsics.checkNotNullParameter(normalOrderAmtData, "");
        Intrinsics.checkNotNullParameter(strategyAmtData, "");
        Intrinsics.checkNotNullParameter(botAmtData, "");
        Intrinsics.checkNotNullParameter(orderLeadPosSize, "");
        Intrinsics.checkNotNullParameter(normalDexOrderAmtData, "");
        this.posTotalAmt = str;
        this.posAssetAmt = str2;
        this.normalOrderAmtData = normalOrderAmtData;
        this.strategyOrderAmtData = strategyAmtData;
        this.botAmtData = botAmtData;
        this.orderLeadAmt = str3;
        this.orderLeadAmtNew = orderLeadPosSize;
        this.dexOrderAmtData = normalDexOrderAmtData;
        this.type = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ad: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
  (wrap:com.okinc.unify_trade.biz.NormalOrderAmtData:?: TERNARY null = ((wrap:int:0x0012: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:2401) call: com.okinc.unify_trade.biz.NormalOrderAmtData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r18v0 com.okinc.unify_trade.biz.NormalOrderAmtData))
  (wrap:com.okinc.unify_trade.biz.StrategyAmtData:?: TERNARY null = ((wrap:int:0x0026: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:2402) call: com.okinc.unify_trade.biz.StrategyAmtData.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r19v0 com.okinc.unify_trade.biz.StrategyAmtData))
  (wrap:com.okinc.unify_trade.biz.BotAmtData:?: TERNARY null = ((wrap:int:0x0038: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0044: CONSTRUCTOR 
  (wrap:java.util.concurrent.ConcurrentHashMap:?: CAST (java.util.concurrent.ConcurrentHashMap) (null java.util.concurrent.ConcurrentHashMap))
  (wrap:java.util.concurrent.ConcurrentHashMap:?: CAST (java.util.concurrent.ConcurrentHashMap) (null java.util.concurrent.ConcurrentHashMap))
  (wrap:java.util.concurrent.ConcurrentHashMap:?: CAST (java.util.concurrent.ConcurrentHashMap) (null java.util.concurrent.ConcurrentHashMap))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentHashMap, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:2403) call: com.okinc.unify_trade.biz.BotAmtData.<init>(java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentHashMap, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r20v0 com.okinc.unify_trade.biz.BotAmtData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("0") : (r21v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.OrderLeadPosSize:?: TERNARY null = ((wrap:int:0x0053: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006a: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:2406) call: com.okinc.unify_trade.biz.OrderLeadPosSize.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r22v0 com.okinc.unify_trade.biz.OrderLeadPosSize))
  (wrap:com.okinc.unify_trade.biz.NormalDexOrderAmtData:?: TERNARY null = ((wrap:int:0x0070: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008b: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:2407) call: com.okinc.unify_trade.biz.NormalDexOrderAmtData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r23v0 com.okinc.unify_trade.biz.NormalDexOrderAmtData))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0091: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r24v0 int))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.NormalOrderAmtData, com.okinc.unify_trade.biz.StrategyAmtData, com.okinc.unify_trade.biz.BotAmtData, java.lang.String, com.okinc.unify_trade.biz.OrderLeadPosSize, com.okinc.unify_trade.biz.NormalDexOrderAmtData, int):void (m)] (LINE:2398) call: com.okinc.unify_trade.biz.OrderPositionData.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.NormalOrderAmtData, com.okinc.unify_trade.biz.StrategyAmtData, com.okinc.unify_trade.biz.BotAmtData, java.lang.String, com.okinc.unify_trade.biz.OrderLeadPosSize, com.okinc.unify_trade.biz.NormalDexOrderAmtData, int):void type: THIS */
    public /* synthetic */ OrderPositionData(String str, String str2, NormalOrderAmtData normalOrderAmtData, StrategyAmtData strategyAmtData, BotAmtData botAmtData, String str3, OrderLeadPosSize orderLeadPosSize, NormalDexOrderAmtData normalDexOrderAmtData, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) == 0 ? str2 : null, (i2 & 4) != 0 ? new NormalOrderAmtData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : normalOrderAmtData, (i2 & 8) != 0 ? new StrategyAmtData((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : strategyAmtData, (i2 & 16) != 0 ? new BotAmtData((ConcurrentHashMap) null, (ConcurrentHashMap) null, (ConcurrentHashMap) null, 7, (DefaultConstructorMarker) null) : botAmtData, (i2 & 32) != 0 ? "0" : str3, (i2 & 64) != 0 ? new OrderLeadPosSize((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : orderLeadPosSize, (i2 & 128) != 0 ? new NormalDexOrderAmtData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : normalDexOrderAmtData, (i2 & 256) != 0 ? -1 : i);
    }

    public final String getPositionTotalAmt() {
        String strAddS$default = C33129mqd.addS$default(this.posTotalAmt, this.posAssetAmt, null, null, null, 14, null);
        return C33129mqd.AEQbTJ(strAddS$default, 0) ? strAddS$default : "0";
    }

    public final String getPosOrderLeadAmtNew() {
        String strAddS$default = C33129mqd.addS$default(this.orderLeadAmtNew.getDetailsPosSize(), this.orderLeadAmtNew.getSpotDetailsPosSize(), 0, null, null, 12, null);
        return strAddS$default == null ? "0" : strAddS$default;
    }

    public final String getContractPosOrderLeadAmt() {
        return this.orderLeadAmtNew.getDetailsPosSize();
    }

    public final String getSpotPosOrderLeadAmt() {
        return this.orderLeadAmtNew.getSpotDetailsPosSize();
    }

    public final String getStrategyOrderTotalAmt() {
        return C33129mqd.gEmmrt(Integer.valueOf(this.botAmtData.getTotalAmt()));
    }

    public final String getNormalOrderTotalAmt() {
        NormalOrderAmtData normalOrderAmtData = this.normalOrderAmtData;
        String strAddS$default = C33129mqd.addS$default(C33129mqd.addS$default(C33129mqd.addS$default(normalOrderAmtData.getLimitMarketAmt(), normalOrderAmtData.getAdvanceLimitAmt(), 0, null, null, 12, null), normalOrderAmtData.getStopAmt(), 0, null, null, 12, null), normalOrderAmtData.getTriggerAmt(), 0, null, null, 12, null);
        StrategyAmtData strategyAmtData = this.strategyOrderAmtData;
        return C33129mqd.addS$default(strAddS$default, C33129mqd.addS$default(C33129mqd.addS$default(strategyAmtData.getStopAmt(), strategyAmtData.getTriggerAmt(), 0, null, null, 12, null), strategyAmtData.getMoveStopAmt(), 0, null, null, 12, null), null, null, null, 14, null);
    }

    public static /* synthetic */ String getAmtByStrategyType$default(OrderPositionData orderPositionData, StrategyType strategyType, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return orderPositionData.getAmtByStrategyType(strategyType, z, z2);
    }

    public final String getAmtByStrategyType(@NotNull StrategyType strategyType, boolean z, boolean z2) {
        String strAddS$default;
        String normalOrderTotalAmt = "";
        Intrinsics.checkNotNullParameter(strategyType, "");
        pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType START - strategyType: " + strategyType + ", isGetOriginData: " + z + ", isAddDexData: " + z2);
        pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType - dexOrderAmtData.dexPendingOrderNum: " + this.dexOrderAmtData.getDexPendingOrderNum() + ", dexTPSLPendingOrderNum: " + this.dexOrderAmtData.getDexTPSLPendingOrderNum());
        switch (ActionBar.EZpvd[strategyType.ordinal()]) {
            case 1:
                if (!z) {
                    normalOrderTotalAmt = this.allOrderListSize;
                    if (normalOrderTotalAmt != null) {
                        pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType ALL - using allOrderListSize: " + normalOrderTotalAmt);
                    } else if (z2) {
                        String normalOrderTotalAmt2 = getNormalOrderTotalAmt();
                        String dexOrderAmt = getDexOrderAmt();
                        String dexTpSlAmt = getDexTpSlAmt();
                        normalOrderTotalAmt = C33129mqd.addS$default(C33129mqd.addS$default(normalOrderTotalAmt2, dexOrderAmt, null, null, null, 14, null), dexTpSlAmt, null, null, null, 14, null);
                        pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType ALL - allOrderListSize is null, calculated: normalAmt=" + normalOrderTotalAmt2 + ", dexAmt=" + dexOrderAmt + ", dexTpSlAmt=" + dexTpSlAmt + ", total=" + normalOrderTotalAmt);
                    } else {
                        normalOrderTotalAmt = getNormalOrderTotalAmt();
                        pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType ALL - allOrderListSize is null, normalAmt: " + normalOrderTotalAmt + " (no DEX)");
                    }
                } else if (z2) {
                    String normalOrderTotalAmt3 = getNormalOrderTotalAmt();
                    String dexOrderAmt2 = getDexOrderAmt();
                    String dexTpSlAmt2 = getDexTpSlAmt();
                    String strAddS$default2 = C33129mqd.addS$default(C33129mqd.addS$default(normalOrderTotalAmt3, dexOrderAmt2, null, null, null, 14, null), dexTpSlAmt2, null, null, null, 14, null);
                    pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType ALL - normalAmt: " + normalOrderTotalAmt3 + ", dexAmt: " + dexOrderAmt2 + ", dexTpSlAmt: " + dexTpSlAmt2 + ", total: " + strAddS$default2);
                    normalOrderTotalAmt = strAddS$default2;
                } else {
                    normalOrderTotalAmt = getNormalOrderTotalAmt();
                    pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType ALL - normalAmt: " + normalOrderTotalAmt + " (no DEX)");
                }
                break;
            case 2:
                normalOrderTotalAmt = getLimitMarketAmt();
                if (z2) {
                    String dexOrderAmt3 = getDexOrderAmt();
                    strAddS$default = C33129mqd.addS$default(normalOrderTotalAmt, dexOrderAmt3, null, null, null, 14, null);
                    pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType LIMIT - limitMarketAmt: " + normalOrderTotalAmt + ", dexAmt: " + dexOrderAmt3 + ", total: " + strAddS$default);
                    normalOrderTotalAmt = strAddS$default;
                } else {
                    pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType LIMIT - limitMarketAmt: " + normalOrderTotalAmt + " (no DEX)");
                }
                break;
            case 3:
                normalOrderTotalAmt = getAdvanceLimitAmt();
                pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType ADVANCED_LIMIT - amt: " + normalOrderTotalAmt);
                break;
            case 4:
                normalOrderTotalAmt = getStopAmt();
                if (z2) {
                    String dexTpSlAmt3 = getDexTpSlAmt();
                    strAddS$default = C33129mqd.addS$default(normalOrderTotalAmt, dexTpSlAmt3, null, null, null, 14, null);
                    pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType STOP - stopAmt: " + normalOrderTotalAmt + ", dexTpSlAmt: " + dexTpSlAmt3 + ", total: " + strAddS$default);
                    normalOrderTotalAmt = strAddS$default;
                } else {
                    pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType STOP - stopAmt: " + normalOrderTotalAmt + " (no DEX)");
                }
                break;
            case 5:
                normalOrderTotalAmt = getMoveStopAmt();
                pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType MP - amt: " + normalOrderTotalAmt);
                break;
            case 6:
                normalOrderTotalAmt = getTriggerAmt();
                pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType TRIGGER - amt: " + normalOrderTotalAmt);
                break;
            default:
                pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType - unknown strategyType: " + strategyType + ", returning empty");
                break;
        }
        pUU.KWHzl("DexPendingFlow", "[7] getAmtByStrategyType END - result: " + normalOrderTotalAmt);
        return normalOrderTotalAmt;
    }

    public final String getDexOrderAmt() {
        pUU.KWHzl("DexPendingFlow", "dexOrderAmtData.dexPendingOrderNum = " + this.dexOrderAmtData.getDexPendingOrderNum());
        return this.dexOrderAmtData.getDexPendingOrderNum();
    }

    public final String getDexTpSlAmt() {
        pUU.KWHzl("DexPendingFlow", "dexOrderAmtData.dexTPSLPendingOrderNum = " + this.dexOrderAmtData.getDexTPSLPendingOrderNum());
        return this.dexOrderAmtData.getDexTPSLPendingOrderNum();
    }

    public final String getLimitMarketAmt() {
        return this.normalOrderAmtData.getLimitMarketAmt();
    }

    public final String getAdvanceLimitAmt() {
        return this.normalOrderAmtData.getAdvanceLimitAmt();
    }

    public final String getStopAmt() {
        return C33129mqd.addS$default(this.normalOrderAmtData.getStopAmt(), this.strategyOrderAmtData.getStopAmt(), 0, null, null, 12, null);
    }

    public final String getTriggerAmt() {
        return C33129mqd.addS$default(this.normalOrderAmtData.getTriggerAmt(), this.strategyOrderAmtData.getTriggerAmt(), 0, null, null, 12, null);
    }

    public final String getMoveStopAmt() {
        return this.strategyOrderAmtData.getMoveStopAmt();
    }

    public final void clear() {
        this.posTotalAmt = "0";
        this.posAssetAmt = "0";
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.normalOrderAmtData = new NormalOrderAmtData((String) null, (String) null, (String) null, (String) null, 15, defaultConstructorMarker);
        String str = null;
        String str2 = null;
        this.strategyOrderAmtData = new StrategyAmtData(str, str2, (String) null, 7, (DefaultConstructorMarker) null);
        this.botAmtData = new BotAmtData((ConcurrentHashMap) (0 == true ? 1 : 0), (ConcurrentHashMap) (0 == true ? 1 : 0), (ConcurrentHashMap) (0 == true ? 1 : 0), 7, defaultConstructorMarker);
        this.orderLeadAmt = "0";
        this.orderLeadAmtNew = new OrderLeadPosSize((String) null, str, str2, 7, (DefaultConstructorMarker) null);
        this.dexOrderAmtData = new NormalDexOrderAmtData((String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 15, defaultConstructorMarker);
    }
}
