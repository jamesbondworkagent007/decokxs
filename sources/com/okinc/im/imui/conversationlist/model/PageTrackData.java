package com.okinc.im.imui.conversationlist.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
public final class PageTrackData {
    public static final int $stable = 0;
    private final boolean isPageEventTracked;
    private final int page;
    private final long startTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PageTrackData copy$default(PageTrackData pageTrackData, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pageTrackData.page;
        }
        if ((i2 & 2) != 0) {
            j = pageTrackData.startTime;
        }
        if ((i2 & 4) != 0) {
            z = pageTrackData.isPageEventTracked;
        }
        return pageTrackData.copy(i, j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isPageEventTracked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PageTrackData copy(int i, long j, boolean z) {
        return new PageTrackData(i, j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageTrackData)) {
            return false;
        }
        PageTrackData pageTrackData = (PageTrackData) obj;
        return this.page == pageTrackData.page && this.startTime == pageTrackData.startTime && this.isPageEventTracked == pageTrackData.isPageEventTracked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPage() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.page) * 31) + Long.hashCode(this.startTime)) * 31) + Boolean.hashCode(this.isPageEventTracked);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPageEventTracked() {
        return this.isPageEventTracked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PageTrackData(page=" + this.page + ", startTime=" + this.startTime + ", isPageEventTracked=" + this.isPageEventTracked + ")";
    }

    public PageTrackData(int i, long j, boolean z) {
        this.page = i;
        this.startTime = j;
        this.isPageEventTracked = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 long)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(int, long, boolean):void (m)] (LINE:6) call: com.okinc.im.imui.conversationlist.model.PageTrackData.<init>(int, long, boolean):void type: THIS */
    public /* synthetic */ PageTrackData(int i, long j, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, (i2 & 4) != 0 ? false : z);
    }
}
