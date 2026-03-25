package com.okinc.unify_trade.biz.subscribe;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.pUU;
import o.xVJ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class MarketBooksData {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<List<String>> asks;
    private final List<List<String>> bids;
    private String ts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketBooksData() {
        this((List) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.subscribe.MarketBooksData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketBooksData copy$default(MarketBooksData marketBooksData, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = marketBooksData.asks;
        }
        if ((i & 2) != 0) {
            list2 = marketBooksData.bids;
        }
        if ((i & 4) != 0) {
            str = marketBooksData.ts;
        }
        return marketBooksData.copy(list, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> component1() {
        return this.asks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> component2() {
        return this.bids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketBooksData copy(@NotNull List<? extends List<String>> list, @NotNull List<? extends List<String>> list2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new MarketBooksData(list, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketBooksData)) {
            return false;
        }
        MarketBooksData marketBooksData = (MarketBooksData) obj;
        return Intrinsics.EZpvd(this.asks, marketBooksData.asks) && Intrinsics.EZpvd(this.bids, marketBooksData.bids) && Intrinsics.EZpvd((Object) this.ts, (Object) marketBooksData.ts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> getAsks() {
        return this.asks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> getBids() {
        return this.bids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.asks.hashCode() * 31) + this.bids.hashCode()) * 31) + this.ts.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ts = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketBooksData(asks=" + this.asks + ", bids=" + this.bids + ", ts=" + this.ts + ")";
    }

    public /* synthetic */ MarketBooksData(int i, List list, List list2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.asks = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.bids = yDY.AhwBna();
        } else {
            this.bids = list2;
        }
        if ((i & 4) == 0) {
            this.ts = "";
        } else {
            this.ts = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MarketBooksData marketBooksData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(marketBooksData.asks, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], marketBooksData.asks);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(marketBooksData.bids, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], marketBooksData.bids);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) marketBooksData.ts, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, marketBooksData.ts);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketBooksData(@NotNull List<? extends List<String>> list, @NotNull List<? extends List<String>> list2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.asks = list;
        this.bids = list2;
        this.ts = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:146)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:147)) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.util.List<? extends java.util.List<java.lang.String>>, java.util.List<? extends java.util.List<java.lang.String>>, java.lang.String):void (m)] (LINE:145) call: com.okinc.unify_trade.biz.subscribe.MarketBooksData.<init>(java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ MarketBooksData(List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? "" : str);
    }

    public static final class Companion {

        public static final class TaskDescription extends TypeToken<List<? extends MarketBooksData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.MarketBooksData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarketBooksData> serializer() {
            return MarketBooksData$$serializer.INSTANCE;
        }

        public final List<MarketBooksData> copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            xVJ xvj = xVJ.KWHzl;
            Type type = new TaskDescription().getType();
            Intrinsics.copydefault(type);
            List<MarketBooksData> list = (List) xvj.OLrzqt(str, type, true);
            if (list == null || list.isEmpty()) {
                return null;
            }
            return list;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(new ArrayListSerializer(stringSerializer)), new ArrayListSerializer(new ArrayListSerializer(stringSerializer)), null};
    }

    public final BizDepthData convertToBizDepthData() {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = this.asks.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                if (C33129mqd.copydefault((Object) Integer.valueOf(list.size()), (Object) 2)) {
                    arrayList.add(new DepthItem((String) list.get(0), (String) list.get(1)));
                }
            }
            Iterator<T> it2 = this.bids.iterator();
            while (it2.hasNext()) {
                List list2 = (List) it2.next();
                if (C33129mqd.copydefault((Object) Integer.valueOf(list2.size()), (Object) 2)) {
                    arrayList2.add(new DepthItem((String) list2.get(0), (String) list2.get(1)));
                }
            }
            return new BizDepthData(arrayList, arrayList2, this.ts);
        } catch (Exception e) {
            pUU.KWHzl("convert error", "convertToBizDepthData " + e.getMessage());
            return new BizDepthData(null, null, null, 7, null);
        }
    }
}
