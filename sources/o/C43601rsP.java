package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.TimeIntervalItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC39509ptg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rsP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43601rsP implements InterfaceC39509ptg {
    public static final C43601rsP EZpvd = new C43601rsP();
    public static java.lang.String KWHzl = "MARKET_PLACE.MARKET_ChartTimeInterval";
    public static java.util.ArrayList<TimeIntervalItem> copydefault = new java.util.ArrayList<>();
    public static java.lang.String OLrzqt = "key_kline_market_time_interval_list";
    public static java.util.ArrayList<TimeIntervalItem> djBIcL = new java.util.ArrayList<>();
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.rsP$TaskDescription */
    public static final class TaskDescription extends TypeToken<java.util.List<? extends TimeIntervalItem>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39509ptg
    public java.util.ArrayList<TimeIntervalItem> AEQbTJ() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39509ptg
    public java.util.ArrayList<TimeIntervalItem> KWHzl() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39509ptg
    public void KWHzl(@NotNull java.util.ArrayList<TimeIntervalItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        djBIcL = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return OLrzqt;
    }

    private C43601rsP() {
    }

    @Override // o.InterfaceC39509ptg
    public java.util.ArrayList<TimeIntervalItem> EZpvd() {
        return InterfaceC39509ptg.Activity.KWHzl(this);
    }

    public void copydefault() {
        if (AEQbTJ().size() > 0) {
            return;
        }
        AEQbTJ().clear();
        java.util.ArrayList<TimeIntervalItem> arrayListAEQbTJ = AEQbTJ();
        arrayListAEQbTJ.add(new TimeIntervalItem(-1, "index-candle1m", "candle1m", "mark-price-candle1m", MultiTransferSignData.DEFAULT_INTERVAL));
        arrayListAEQbTJ.add(new TimeIntervalItem(1, "index-candle1m", "candle1m", "mark-price-candle1m", "1min"));
        arrayListAEQbTJ.add(new TimeIntervalItem(3, "index-candle3m", "candle3m", "mark-price-candle3m", "3min"));
        arrayListAEQbTJ.add(new TimeIntervalItem(5, "index-candle5m", "candle5m", "mark-price-candle5m", "5min"));
        arrayListAEQbTJ.add(new TimeIntervalItem(15, "index-candle15m", "candle15m", "mark-price-candle15m", "15min"));
        arrayListAEQbTJ.add(new TimeIntervalItem(30, "index-candle30m", "candle30m", "mark-price-candle30m", "30min"));
        arrayListAEQbTJ.add(new TimeIntervalItem(60, "index-candle1H", "candle1H", "mark-price-candle1H", "1hour"));
        arrayListAEQbTJ.add(new TimeIntervalItem(120, "index-candle2H", "candle2H", "mark-price-candle2H", "2hour"));
        arrayListAEQbTJ.add(new TimeIntervalItem(PsExtractor.VIDEO_STREAM_MASK, "index-candle4H", "candle4H", "mark-price-candle4H", "4hour"));
        arrayListAEQbTJ.add(new TimeIntervalItem(360, "index-candle6H", "candle6H", "mark-price-candle6H", "6hour"));
        arrayListAEQbTJ.add(new TimeIntervalItem(720, "index-candle12H", "candle12H", "mark-price-candle12H", "12hour"));
        arrayListAEQbTJ.add(new TimeIntervalItem(1440, "index-candle1D", "candle1D", "mark-price-candle1D", MTPushConstants.NotificationTime.KEY_DAYS));
        arrayListAEQbTJ.add(new TimeIntervalItem(2880, "index-candle2D", "candle2D", "mark-price-candle2D", "2day"));
        arrayListAEQbTJ.add(new TimeIntervalItem(4320, "index-candle3D", "candle3D", "mark-price-candle3D", "3day"));
        arrayListAEQbTJ.add(new TimeIntervalItem(7200, "index-candle5D", "candle5D", "mark-price-candle5D", "5day"));
        arrayListAEQbTJ.add(new TimeIntervalItem(10080, "index-candle1W", "candle1W", "mark-price-candle1W", "week"));
        arrayListAEQbTJ.add(new TimeIntervalItem(44640, "index-candle1M", "candle1M", "mark-price-candle1M", "month"));
        arrayListAEQbTJ.add(new TimeIntervalItem(133920, "index-candle3M", "candle3M", "mark-price-candle3M", "3month"));
    }

    public void djBIcL() {
        if (KWHzl().size() > 0) {
            return;
        }
        if (SPUtils.getString(OLrzqt(), null) != null) {
            try {
                java.lang.Object objFromJson = new Gson().fromJson(SPUtils.getString(OLrzqt(), null), new TaskDescription().getType());
                Intrinsics.copydefault(objFromJson, "");
                java.util.ArrayList<TimeIntervalItem> arrayList = (java.util.ArrayList) objFromJson;
                if (arrayList.size() > 4) {
                    KWHzl().clear();
                    int i = 0;
                    for (java.lang.Object obj : arrayList) {
                        if (i < 0) {
                            yDY.AYXKKw();
                        }
                        TimeIntervalItem timeIntervalItem = (TimeIntervalItem) obj;
                        if (i < 2) {
                            EZpvd.KWHzl().add(timeIntervalItem);
                        }
                        i++;
                    }
                } else {
                    KWHzl(arrayList);
                }
                gEmmrt();
                Unit unit = Unit.INSTANCE;
                return;
            } catch (java.lang.Exception unused) {
                KWHzl().clear();
                java.util.ArrayList<TimeIntervalItem> arrayListKWHzl = KWHzl();
                arrayListKWHzl.add(new TimeIntervalItem(15, "index-candle15m", "candle15m", "mark-price-candle15m", "15min"));
                arrayListKWHzl.add(new TimeIntervalItem(60, "index-candle1H", "candle1H", "mark-price-candle1H", "1hour"));
                arrayListKWHzl.add(new TimeIntervalItem(PsExtractor.VIDEO_STREAM_MASK, "index-candle4H", "candle4H", "mark-price-candle4H", "4hour"));
                arrayListKWHzl.add(new TimeIntervalItem(1440, "index-candle1D", "candle1D", "mark-price-candle1D", MTPushConstants.NotificationTime.KEY_DAYS));
                return;
            }
        }
        KWHzl().clear();
        java.util.ArrayList<TimeIntervalItem> arrayListKWHzl2 = KWHzl();
        arrayListKWHzl2.add(new TimeIntervalItem(15, "index-candle15m", "candle15m", "mark-price-candle15m", "15min"));
        arrayListKWHzl2.add(new TimeIntervalItem(60, "index-candle1H", "candle1H", "mark-price-candle1H", "1hour"));
        arrayListKWHzl2.add(new TimeIntervalItem(PsExtractor.VIDEO_STREAM_MASK, "index-candle4H", "candle4H", "mark-price-candle4H", "4hour"));
        arrayListKWHzl2.add(new TimeIntervalItem(1440, "index-candle1D", "candle1D", "mark-price-candle1D", MTPushConstants.NotificationTime.KEY_DAYS));
    }

    @Override // o.InterfaceC39509ptg
    public void valueOf() {
        copydefault();
        djBIcL();
    }

    @Override // o.InterfaceC39509ptg
    public void gEmmrt() {
        SPUtils.put(OLrzqt(), new Gson().toJson(KWHzl()));
    }
}
