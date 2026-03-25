package com.okinc.business.market.data.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C27605jyO;
import o.C27625jyi;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable(with = C27605jyO.class)
public final class ChainIdFilterData {
    public final List<String> chainIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChainIdFilterData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.ChainIdFilterData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChainIdFilterData copy$default(ChainIdFilterData chainIdFilterData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chainIdFilterData.chainIds;
        }
        return chainIdFilterData.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> AEQbTJ() {
        return this.chainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainIdFilterData copydefault(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ChainIdFilterData(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.chainIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChainIdFilterData(chainIds=" + this.chainIds + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.ChainIdFilterData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChainIdFilterData> serializer() {
            return C27605jyO.OLrzqt;
        }
    }

    public ChainIdFilterData(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chainIds = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r1v0 java.util.List))
 A[MD:(java.util.List<java.lang.String>):void (m)] (LINE:14) call: com.okinc.business.market.data.model.ChainIdFilterData.<init>(java.util.List):void type: THIS */
    public /* synthetic */ ChainIdFilterData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        ChainIdFilterData chainIdFilterData = obj instanceof ChainIdFilterData ? (ChainIdFilterData) obj : null;
        if (chainIdFilterData == null) {
            return false;
        }
        List<String> list = this.chainIds;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (C27625jyi.copydefault.OLrzqt().contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        List<String> list2 = chainIdFilterData.chainIds;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z2 = false;
        } else {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (C27625jyi.copydefault.OLrzqt().contains((String) it2.next())) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        return Intrinsics.EZpvd(this.chainIds, chainIdFilterData.chainIds) || (z && z2);
    }
}
