package o;

import androidx.lifecycle.LiveData;
import com.okinc.unify_trade.biz.WatchListBean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xoy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC55707xoy {
    LiveData<java.lang.Boolean> EZpvd(@NotNull WatchListBean watchListBean);

    LiveData<java.util.List<WatchListBean>> OLrzqt();

    boolean OLrzqt(@NotNull WatchListBean watchListBean);

    LiveData<java.lang.Boolean> copydefault(@NotNull WatchListBean watchListBean);
}
