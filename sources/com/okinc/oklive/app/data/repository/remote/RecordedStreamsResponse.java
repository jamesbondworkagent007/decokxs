package com.okinc.oklive.app.data.repository.remote;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class RecordedStreamsResponse {
    public static final int $stable = 8;

    @SerializedName("items")
    private final List<RecordingInfoResponse> items;

    @SerializedName("pageCount")
    private final int pageCount;

    @SerializedName("pageIndex")
    private final int pageIndex;

    @SerializedName("pageSize")
    private final int pageSize;

    @SerializedName("totalItemCount")
    private final int totalItemCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.oklive.app.data.repository.remote.RecordedStreamsResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecordedStreamsResponse copy$default(RecordedStreamsResponse recordedStreamsResponse, int i, int i2, int i3, int i4, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = recordedStreamsResponse.pageIndex;
        }
        if ((i5 & 2) != 0) {
            i2 = recordedStreamsResponse.pageSize;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = recordedStreamsResponse.pageCount;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = recordedStreamsResponse.totalItemCount;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            list = recordedStreamsResponse.items;
        }
        return recordedStreamsResponse.copy(i, i6, i7, i8, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.pageIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.pageCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.totalItemCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecordingInfoResponse> component5() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecordedStreamsResponse copy(int i, int i2, int i3, int i4, List<RecordingInfoResponse> list) {
        return new RecordedStreamsResponse(i, i2, i3, i4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordedStreamsResponse)) {
            return false;
        }
        RecordedStreamsResponse recordedStreamsResponse = (RecordedStreamsResponse) obj;
        return this.pageIndex == recordedStreamsResponse.pageIndex && this.pageSize == recordedStreamsResponse.pageSize && this.pageCount == recordedStreamsResponse.pageCount && this.totalItemCount == recordedStreamsResponse.totalItemCount && Intrinsics.EZpvd(this.items, recordedStreamsResponse.items);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecordingInfoResponse> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageCount() {
        return this.pageCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalItemCount() {
        return this.totalItemCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hasMorePages() {
        return this.pageIndex < this.pageCount - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.pageIndex);
        int iHashCode2 = Integer.hashCode(this.pageSize);
        int iHashCode3 = Integer.hashCode(this.pageCount);
        int iHashCode4 = Integer.hashCode(this.totalItemCount);
        List<RecordingInfoResponse> list = this.items;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int nextPageIndex() {
        return this.pageIndex + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecordedStreamsResponse(pageIndex=" + this.pageIndex + ", pageSize=" + this.pageSize + ", pageCount=" + this.pageCount + ", totalItemCount=" + this.totalItemCount + ", items=" + this.items + ")";
    }

    public RecordedStreamsResponse(int i, int i2, int i3, int i4, List<RecordingInfoResponse> list) {
        this.pageIndex = i;
        this.pageSize = i2;
        this.pageCount = i3;
        this.totalItemCount = i4;
        this.items = list;
    }
}
