package com.okinc.business.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class HomeTokenListWsData {
    public final long batchId;
    public final List<HomeTokenData> items;
    public final int page;
    public final int pageSize;
    public final int totalPage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(HomeTokenData$$serializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeTokenListWsData() {
        this((List) null, 0L, 0, 0, 0, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.data.model.HomeTokenListWsData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeTokenListWsData copy$default(HomeTokenListWsData homeTokenListWsData, List list, long j, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = homeTokenListWsData.items;
        }
        if ((i4 & 2) != 0) {
            j = homeTokenListWsData.batchId;
        }
        long j2 = j;
        if ((i4 & 4) != 0) {
            i = homeTokenListWsData.page;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = homeTokenListWsData.pageSize;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = homeTokenListWsData.totalPage;
        }
        return homeTokenListWsData.AEQbTJ(list, j2, i5, i6, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeTokenListWsData AEQbTJ(@NotNull List<HomeTokenData> list, long j, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new HomeTokenListWsData(list, j, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.totalPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.batchId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HomeTokenData> copydefault() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTokenListWsData)) {
            return false;
        }
        HomeTokenListWsData homeTokenListWsData = (HomeTokenListWsData) obj;
        return Intrinsics.EZpvd(this.items, homeTokenListWsData.items) && this.batchId == homeTokenListWsData.batchId && this.page == homeTokenListWsData.page && this.pageSize == homeTokenListWsData.pageSize && this.totalPage == homeTokenListWsData.totalPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.items.hashCode() * 31) + Long.hashCode(this.batchId)) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.totalPage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeTokenListWsData(items=" + this.items + ", batchId=" + this.batchId + ", page=" + this.page + ", pageSize=" + this.pageSize + ", totalPage=" + this.totalPage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.HomeTokenListWsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeTokenListWsData> serializer() {
            return HomeTokenListWsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeTokenListWsData(int i, List list, long j, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        this.items = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.batchId = 0L;
        } else {
            this.batchId = j;
        }
        if ((i & 4) == 0) {
            this.page = 0;
        } else {
            this.page = i2;
        }
        if ((i & 8) == 0) {
            this.pageSize = 0;
        } else {
            this.pageSize = i3;
        }
        if ((i & 16) == 0) {
            this.totalPage = 0;
        } else {
            this.totalPage = i4;
        }
    }

    public static final /* synthetic */ void AEQbTJ(HomeTokenListWsData homeTokenListWsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(homeTokenListWsData.items, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], homeTokenListWsData.items);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || homeTokenListWsData.batchId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, homeTokenListWsData.batchId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || homeTokenListWsData.page != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, homeTokenListWsData.page);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || homeTokenListWsData.pageSize != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, homeTokenListWsData.pageSize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && homeTokenListWsData.totalPage == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, homeTokenListWsData.totalPage);
    }

    public HomeTokenListWsData(@NotNull List<HomeTokenData> list, long j, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
        this.batchId = j;
        this.page = i;
        this.pageSize = i2;
        this.totalPage = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:9)) : (r5v0 java.util.List))
  (wrap:long:0x000e: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r6v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
 A[MD:(java.util.List<com.okinc.business.market.data.model.HomeTokenData>, long, int, int, int):void (m)] (LINE:7) call: com.okinc.business.market.data.model.HomeTokenListWsData.<init>(java.util.List, long, int, int, int):void type: THIS */
    public /* synthetic */ HomeTokenListWsData(List list, long j, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? yDY.AhwBna() : list, (i4 & 2) != 0 ? 0L : j, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }
}
