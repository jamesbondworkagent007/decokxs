package com.okinc.kline.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56403yEb;
import o.oLY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class CompareCandlesItem {
    public static final int $stable = 8;
    private final String bar;
    private final String candleType;
    private final List<List<String>> data;
    private final String instId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.data.CompareCandlesItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompareCandlesItem copy$default(CompareCandlesItem compareCandlesItem, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = compareCandlesItem.instId;
        }
        if ((i & 2) != 0) {
            str2 = compareCandlesItem.candleType;
        }
        if ((i & 4) != 0) {
            str3 = compareCandlesItem.bar;
        }
        if ((i & 8) != 0) {
            list = compareCandlesItem.data;
        }
        return compareCandlesItem.copy(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.candleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> component4() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CompareCandlesItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<? extends List<String>> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new CompareCandlesItem(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompareCandlesItem)) {
            return false;
        }
        CompareCandlesItem compareCandlesItem = (CompareCandlesItem) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) compareCandlesItem.instId) && Intrinsics.EZpvd((Object) this.candleType, (Object) compareCandlesItem.candleType) && Intrinsics.EZpvd((Object) this.bar, (Object) compareCandlesItem.bar) && Intrinsics.EZpvd(this.data, compareCandlesItem.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBar() {
        return this.bar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCandleType() {
        return this.candleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.instId.hashCode() * 31) + this.candleType.hashCode()) * 31) + this.bar.hashCode()) * 31) + this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CompareCandlesItem(instId=" + this.instId + ", candleType=" + this.candleType + ", bar=" + this.bar + ", data=" + this.data + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public CompareCandlesItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<? extends List<String>> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.instId = str;
        this.candleType = str2;
        this.bar = str3;
        this.data = list;
    }

    public final List<oLY> dataToOkxProRawDataItem() {
        List<List<String>> list = this.data;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            arrayList.add(new oLY(C33129mqd.valueOf(CollectionsKt___CollectionsKt.AkhnZx(list2, 0)), C33129mqd.AEQbTJ(CollectionsKt___CollectionsKt.AkhnZx(list2, 1)), C33129mqd.AEQbTJ(CollectionsKt___CollectionsKt.AkhnZx(list2, 2)), C33129mqd.AEQbTJ(CollectionsKt___CollectionsKt.AkhnZx(list2, 3)), C33129mqd.AEQbTJ(CollectionsKt___CollectionsKt.AkhnZx(list2, 4)), C33129mqd.AEQbTJ(CollectionsKt___CollectionsKt.AkhnZx(list2, 6)), C33129mqd.AEQbTJ(CollectionsKt___CollectionsKt.AkhnZx(list2, 5)), C33129mqd.AEQbTJ(CollectionsKt___CollectionsKt.AkhnZx(list2, 7))));
        }
        return arrayList;
    }
}
