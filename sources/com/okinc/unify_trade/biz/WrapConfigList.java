package com.okinc.unify_trade.biz;

import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class WrapConfigList {
    private final ArrayList<ValuationCurrencyData> currencyList;
    private final ValuationCurrencyData userSetting;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(ValuationCurrencyData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WrapConfigList() {
        this((ValuationCurrencyData) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.WrapConfigList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WrapConfigList copy$default(WrapConfigList wrapConfigList, ValuationCurrencyData valuationCurrencyData, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            valuationCurrencyData = wrapConfigList.userSetting;
        }
        if ((i & 2) != 0) {
            arrayList = wrapConfigList.currencyList;
        }
        return wrapConfigList.copy(valuationCurrencyData, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValuationCurrencyData component1() {
        return this.userSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ValuationCurrencyData> component2() {
        return this.currencyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WrapConfigList copy(@NotNull ValuationCurrencyData valuationCurrencyData, @NotNull ArrayList<ValuationCurrencyData> arrayList) {
        Intrinsics.checkNotNullParameter(valuationCurrencyData, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new WrapConfigList(valuationCurrencyData, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrapConfigList)) {
            return false;
        }
        WrapConfigList wrapConfigList = (WrapConfigList) obj;
        return Intrinsics.EZpvd(this.userSetting, wrapConfigList.userSetting) && Intrinsics.EZpvd(this.currencyList, wrapConfigList.currencyList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ValuationCurrencyData> getCurrencyList() {
        return this.currencyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValuationCurrencyData getUserSetting() {
        return this.userSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.userSetting.hashCode() * 31) + this.currencyList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WrapConfigList(userSetting=" + this.userSetting + ", currencyList=" + this.currencyList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.WrapConfigList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WrapConfigList> serializer() {
            return WrapConfigList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WrapConfigList(int i, ValuationCurrencyData valuationCurrencyData, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        this.userSetting = (i & 1) == 0 ? new ValuationCurrencyData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : valuationCurrencyData;
        this.currencyList = (i & 2) == 0 ? new ArrayList() : arrayList;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(WrapConfigList wrapConfigList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(wrapConfigList.userSetting, new ValuationCurrencyData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, ValuationCurrencyData$$serializer.INSTANCE, wrapConfigList.userSetting);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(wrapConfigList.currencyList, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], wrapConfigList.currencyList);
    }

    public WrapConfigList(@NotNull ValuationCurrencyData valuationCurrencyData, @NotNull ArrayList<ValuationCurrencyData> arrayList) {
        Intrinsics.checkNotNullParameter(valuationCurrencyData, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.userSetting = valuationCurrencyData;
        this.currencyList = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.ValuationCurrencyData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0013: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:int:SGET  A[WRAPPED] androidx.core.app.FrameMetricsAggregator.EVERY_DURATION int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:54) call: com.okinc.unify_trade.biz.ValuationCurrencyData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r14v0 com.okinc.unify_trade.biz.ValuationCurrencyData))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0018: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001e: CONSTRUCTOR  A[MD:():void (c), WRAPPED] call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r15v0 java.util.ArrayList))
 A[MD:(com.okinc.unify_trade.biz.ValuationCurrencyData, java.util.ArrayList<com.okinc.unify_trade.biz.ValuationCurrencyData>):void (m)] (LINE:54) call: com.okinc.unify_trade.biz.WrapConfigList.<init>(com.okinc.unify_trade.biz.ValuationCurrencyData, java.util.ArrayList):void type: THIS */
    public /* synthetic */ WrapConfigList(ValuationCurrencyData valuationCurrencyData, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ValuationCurrencyData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : valuationCurrencyData, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
