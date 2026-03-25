package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BizResp;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xQc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC54647xQc {
    java.util.ArrayList<WatchListData> AEQbTJ(@NotNull java.util.List<WatchListData> list);

    void AEQbTJ(@NotNull BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData);

    void AEQbTJ(@NotNull BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData, boolean z);

    void AEQbTJ(@NotNull WatchListData watchListData);

    void AEQbTJ(@NotNull Function1<? super java.lang.Boolean, Unit> function1);

    boolean EZpvd(@NotNull WatchListData watchListData);

    void OLrzqt(@NotNull WatchListData watchListData, MutableLiveData<BizResp> mutableLiveData);

    void OLrzqt(@NotNull WatchListData watchListData, MutableLiveData<BizResp> mutableLiveData, boolean z);

    void OLrzqt(@NotNull Function0<Unit> function0);

    void OLrzqt(boolean z);

    boolean OLrzqt(@NotNull BizInstrument bizInstrument);

    boolean OLrzqt(@NotNull java.lang.String str, @NotNull BizInstrument bizInstrument);

    void bH_();

    boolean bI_();

    void copydefault(@NotNull BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData);

    /* JADX INFO: renamed from: o.xQc$Activity */
    public static final class Activity {
        public static /* synthetic */ void removeWatchList$default(InterfaceC54647xQc interfaceC54647xQc, BizInstrument bizInstrument, MutableLiveData mutableLiveData, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeWatchList");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            interfaceC54647xQc.AEQbTJ(bizInstrument, mutableLiveData, z);
        }

        public static /* synthetic */ void removeWatchList$default(InterfaceC54647xQc interfaceC54647xQc, WatchListData watchListData, MutableLiveData mutableLiveData, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeWatchList");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            interfaceC54647xQc.OLrzqt(watchListData, mutableLiveData, z);
        }
    }
}
