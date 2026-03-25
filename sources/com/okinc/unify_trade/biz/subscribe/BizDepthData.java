package com.okinc.unify_trade.biz.subscribe;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56548yJl;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BizDepthData {
    private final ArrayList<DepthItem> asks;
    private final ArrayList<DepthItem> bids;
    private String ts;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;

    public static final class StateListAnimator extends TypeToken<List<? extends Map<String, ? extends Object>>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizDepthData() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.subscribe.BizDepthData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BizDepthData copy$default(BizDepthData bizDepthData, ArrayList arrayList, ArrayList arrayList2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = bizDepthData.asks;
        }
        if ((i & 2) != 0) {
            arrayList2 = bizDepthData.bids;
        }
        if ((i & 4) != 0) {
            str = bizDepthData.ts;
        }
        return bizDepthData.copy(arrayList, arrayList2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DepthItem> component1() {
        return this.asks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DepthItem> component2() {
        return this.bids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizDepthData copy(@NotNull ArrayList<DepthItem> arrayList, @NotNull ArrayList<DepthItem> arrayList2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new BizDepthData(arrayList, arrayList2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizDepthData)) {
            return false;
        }
        BizDepthData bizDepthData = (BizDepthData) obj;
        return Intrinsics.EZpvd(this.asks, bizDepthData.asks) && Intrinsics.EZpvd(this.bids, bizDepthData.bids) && Intrinsics.EZpvd((Object) this.ts, (Object) bizDepthData.ts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DepthItem> getAsks() {
        return this.asks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DepthItem> getBids() {
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
        return "BizDepthData(asks=" + this.asks + ", bids=" + this.bids + ", ts=" + this.ts + ")";
    }

    public BizDepthData(@NotNull ArrayList<DepthItem> arrayList, @NotNull ArrayList<DepthItem> arrayList2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.asks = arrayList;
        this.bids = arrayList2;
        this.ts = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:18) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:19) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.util.ArrayList<com.okinc.unify_trade.biz.subscribe.DepthItem>, java.util.ArrayList<com.okinc.unify_trade.biz.subscribe.DepthItem>, java.lang.String):void (m)] (LINE:17) call: com.okinc.unify_trade.biz.subscribe.BizDepthData.<init>(java.util.ArrayList, java.util.ArrayList, java.lang.String):void type: THIS */
    public /* synthetic */ BizDepthData(ArrayList arrayList, ArrayList arrayList2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? new ArrayList() : arrayList2, (i & 4) != 0 ? "" : str);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void jsonToItem(@NotNull String str) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            List list = (List) new Gson().fromJson(str, new StateListAnimator().getType());
            Intrinsics.copydefault(list);
            Map map = (Map) CollectionsKt___CollectionsKt.firstOrNull(list);
            this.ts = C33129mqd.gEmmrt(map != null ? map.get("ts") : null);
            Object obj = map != null ? map.get("asks") : null;
            ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
            Object obj2 = map != null ? map.get("bids") : null;
            ArrayList arrayList2 = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
            if (arrayList2 == null) {
                iIntValue = 0;
            } else {
                Integer numValueOf = arrayList != null ? Integer.valueOf(C56548yJl.copydefault(arrayList.size(), arrayList2.size())) : null;
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                }
            }
            for (int i = 0; i < iIntValue; i++) {
                if (C33129mqd.gEmmrt(Integer.valueOf(i), arrayList != null ? Integer.valueOf(arrayList.size()) : null)) {
                    Object obj3 = arrayList != null ? arrayList.get(i) : null;
                    ArrayList arrayList3 = obj3 instanceof ArrayList ? (ArrayList) obj3 : null;
                    this.asks.add(new DepthItem(C33129mqd.gEmmrt(arrayList3 != null ? arrayList3.get(0) : null), C33129mqd.gEmmrt(arrayList3 != null ? arrayList3.get(1) : null)));
                }
                if (C33129mqd.gEmmrt(Integer.valueOf(i), arrayList2 != null ? Integer.valueOf(arrayList2.size()) : null)) {
                    Object obj4 = arrayList2 != null ? arrayList2.get(i) : null;
                    ArrayList arrayList4 = obj4 instanceof ArrayList ? (ArrayList) obj4 : null;
                    this.bids.add(new DepthItem(C33129mqd.gEmmrt(arrayList4 != null ? arrayList4.get(0) : null), C33129mqd.gEmmrt(arrayList4 != null ? arrayList4.get(1) : null)));
                }
            }
        } catch (Exception e) {
            pUU.KWHzl("JSON PARSE", "BizDepthData-jsonToItem" + e.getMessage());
        }
    }

    public static final class ActionBar {

        public static final class StateListAnimator extends TypeToken<List<? extends Map<String, ? extends Object>>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.BizDepthData.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final BizDepthData KWHzl(@NotNull String str) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                BizDepthData bizDepthData = new BizDepthData(null, null, null, 7, null);
                List list = (List) new Gson().fromJson(str, new StateListAnimator().getType());
                Intrinsics.copydefault(list);
                Map map = (Map) CollectionsKt___CollectionsKt.firstOrNull(list);
                bizDepthData.setTs(C33129mqd.gEmmrt(map != null ? map.get("ts") : null));
                Object obj = map != null ? map.get("asks") : null;
                ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
                Object obj2 = map != null ? map.get("bids") : null;
                ArrayList arrayList2 = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
                if (arrayList2 == null) {
                    iIntValue = 0;
                } else {
                    Integer numValueOf = arrayList != null ? Integer.valueOf(C56548yJl.copydefault(arrayList.size(), arrayList2.size())) : null;
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    }
                }
                for (int i = 0; i < iIntValue; i++) {
                    if (C33129mqd.gEmmrt(Integer.valueOf(i), arrayList != null ? Integer.valueOf(arrayList.size()) : null)) {
                        Object obj3 = arrayList != null ? arrayList.get(i) : null;
                        ArrayList arrayList3 = obj3 instanceof ArrayList ? (ArrayList) obj3 : null;
                        bizDepthData.getAsks().add(new DepthItem(C33129mqd.gEmmrt(arrayList3 != null ? arrayList3.get(0) : null), C33129mqd.gEmmrt(arrayList3 != null ? arrayList3.get(1) : null)));
                    }
                    if (C33129mqd.gEmmrt(Integer.valueOf(i), arrayList2 != null ? Integer.valueOf(arrayList2.size()) : null)) {
                        Object obj4 = arrayList2 != null ? arrayList2.get(i) : null;
                        ArrayList arrayList4 = obj4 instanceof ArrayList ? (ArrayList) obj4 : null;
                        bizDepthData.getBids().add(new DepthItem(C33129mqd.gEmmrt(arrayList4 != null ? arrayList4.get(0) : null), C33129mqd.gEmmrt(arrayList4 != null ? arrayList4.get(1) : null)));
                    }
                }
                return bizDepthData;
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "BizDepthData-jsonToResult" + e.getMessage());
                return new BizDepthData(null, null, null, 7, null);
            }
        }
    }

    public final void clearItem() {
        this.bids.clear();
        this.asks.clear();
    }

    public final boolean isNotEmpty() {
        return this.bids.size() > 0 || this.asks.size() > 0;
    }
}
