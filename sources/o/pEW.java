package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.kline.data.TimeIntervalItem;

/* JADX INFO: loaded from: classes9.dex */
public final class pEW {
    public static final pEW EZpvd = new pEW();

    public final long AEQbTJ(int i) {
        if (i == -1) {
            return 60000L;
        }
        if (i != 0) {
            return 1000 * ((long) (i * 60));
        }
        return 1000L;
    }

    private pEW() {
    }

    public final java.util.ArrayList<TimeIntervalItem> copydefault() {
        java.util.ArrayList<TimeIntervalItem> arrayList = new java.util.ArrayList<>();
        arrayList.add(new TimeIntervalItem(15, "index-candle15m", "candle15m", "mark-price-candle15m", "15min"));
        arrayList.add(new TimeIntervalItem(60, "index-candle1H", "candle1H", "mark-price-candle1H", "1hour"));
        arrayList.add(new TimeIntervalItem(PsExtractor.VIDEO_STREAM_MASK, "index-candle4H", "candle4H", "mark-price-candle4H", "4hour"));
        arrayList.add(new TimeIntervalItem(1440, "index-candle1D", "candle1D", "mark-price-candle1D", MTPushConstants.NotificationTime.KEY_DAYS));
        return arrayList;
    }

    public final java.util.ArrayList<TimeIntervalItem> KWHzl() {
        java.util.ArrayList<TimeIntervalItem> arrayList = new java.util.ArrayList<>();
        arrayList.add(new TimeIntervalItem(-1, "index-candle1m", "candle1m", "mark-price-candle1m", MultiTransferSignData.DEFAULT_INTERVAL));
        arrayList.add(new TimeIntervalItem(0, "index-candle1s", "candle1s", "mark-price-candle1s", "1s"));
        arrayList.add(new TimeIntervalItem(1, "index-candle1m", "candle1m", "mark-price-candle1m", "1min"));
        arrayList.add(new TimeIntervalItem(3, "index-candle3m", "candle3m", "mark-price-candle3m", "3min"));
        arrayList.add(new TimeIntervalItem(5, "index-candle5m", "candle5m", "mark-price-candle5m", "5min"));
        arrayList.add(new TimeIntervalItem(15, "index-candle15m", "candle15m", "mark-price-candle15m", "15min"));
        arrayList.add(new TimeIntervalItem(30, "index-candle30m", "candle30m", "mark-price-candle30m", "30min"));
        arrayList.add(new TimeIntervalItem(60, "index-candle1H", "candle1H", "mark-price-candle1H", "1hour"));
        arrayList.add(new TimeIntervalItem(120, "index-candle2H", "candle2H", "mark-price-candle2H", "2hour"));
        arrayList.add(new TimeIntervalItem(PsExtractor.VIDEO_STREAM_MASK, "index-candle4H", "candle4H", "mark-price-candle4H", "4hour"));
        arrayList.add(new TimeIntervalItem(360, "index-candle6H", "candle6H", "mark-price-candle6H", "6hour"));
        arrayList.add(new TimeIntervalItem(720, "index-candle12H", "candle12H", "mark-price-candle12H", "12hour"));
        arrayList.add(new TimeIntervalItem(1440, "index-candle1D", "candle1D", "mark-price-candle1D", MTPushConstants.NotificationTime.KEY_DAYS));
        arrayList.add(new TimeIntervalItem(2880, "index-candle2D", "candle2D", "mark-price-candle2D", "2day"));
        arrayList.add(new TimeIntervalItem(4320, "index-candle3D", "candle3D", "mark-price-candle3D", "3day"));
        arrayList.add(new TimeIntervalItem(7200, "index-candle5D", "candle5D", "mark-price-candle5D", "5day"));
        arrayList.add(new TimeIntervalItem(10080, "index-candle1W", "candle1W", "mark-price-candle1W", "week"));
        arrayList.add(new TimeIntervalItem(44640, "index-candle1M", "candle1M", "mark-price-candle1M", "month"));
        arrayList.add(new TimeIntervalItem(133920, "index-candle3M", "candle3M", "mark-price-candle3M", "3month"));
        return arrayList;
    }
}
