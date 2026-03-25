package com.okinc.kline.data;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineChangeScreenVo {
    public static final int $stable = 0;
    private final long firstCandleTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KlineChangeScreenVo copy$default(KlineChangeScreenVo klineChangeScreenVo, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = klineChangeScreenVo.firstCandleTime;
        }
        return klineChangeScreenVo.copy(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.firstCandleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineChangeScreenVo copy(long j) {
        return new KlineChangeScreenVo(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KlineChangeScreenVo) && this.firstCandleTime == ((KlineChangeScreenVo) obj).firstCandleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFirstCandleTime() {
        return this.firstCandleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Long.hashCode(this.firstCandleTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KlineChangeScreenVo(firstCandleTime=" + this.firstCandleTime + ")";
    }

    public KlineChangeScreenVo(long j) {
        this.firstCandleTime = j;
    }
}
