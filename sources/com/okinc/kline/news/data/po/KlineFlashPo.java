package com.okinc.kline.news.data.po;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineFlashPo {
    public static final int $stable = 8;

    @SerializedName("contentDataList")
    private final List<KlineFlashContentPo> contentDataList;

    @SerializedName("nextCursor")
    private final String nextCursor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.news.data.po.KlineFlashPo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KlineFlashPo copy$default(KlineFlashPo klineFlashPo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = klineFlashPo.nextCursor;
        }
        if ((i & 2) != 0) {
            list = klineFlashPo.contentDataList;
        }
        return klineFlashPo.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KlineFlashContentPo> component2() {
        return this.contentDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineFlashPo copy(String str, List<KlineFlashContentPo> list) {
        return new KlineFlashPo(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KlineFlashPo)) {
            return false;
        }
        KlineFlashPo klineFlashPo = (KlineFlashPo) obj;
        return Intrinsics.EZpvd((Object) this.nextCursor, (Object) klineFlashPo.nextCursor) && Intrinsics.EZpvd(this.contentDataList, klineFlashPo.contentDataList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KlineFlashContentPo> getContentDataList() {
        return this.contentDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nextCursor;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<KlineFlashContentPo> list = this.contentDataList;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KlineFlashPo(nextCursor=" + this.nextCursor + ", contentDataList=" + this.contentDataList + ")";
    }

    public KlineFlashPo(String str, List<KlineFlashContentPo> list) {
        this.nextCursor = str;
        this.contentDataList = list;
    }

    public KlineFlashPo() {
        this("", yDY.AhwBna());
    }
}
