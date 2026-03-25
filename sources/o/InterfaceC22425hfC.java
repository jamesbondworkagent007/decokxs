package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.Calendar;

/* JADX INFO: renamed from: o.hfC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC22425hfC {
    MutableLiveData<DexMultiTokenInfoBean> AEQbTJ();

    LiveData<java.lang.String> AhwBna();

    DexMultiTokenInfoBean EZpvd();

    void EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z);

    void EZpvd(Calendar calendar);

    MutableLiveData<DexMultiTokenInfoBean> KWHzl();

    Calendar OLrzqt();

    void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z);

    DexMultiTokenInfoBean copydefault();

    /* JADX INFO: renamed from: o.hfC$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ void setCurrentFromCoin$default(InterfaceC22425hfC interfaceC22425hfC, DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCurrentFromCoin");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            interfaceC22425hfC.OLrzqt(dexMultiTokenInfoBean, z);
        }

        public static /* synthetic */ void setCurrentToCoin$default(InterfaceC22425hfC interfaceC22425hfC, DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCurrentToCoin");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            interfaceC22425hfC.EZpvd(dexMultiTokenInfoBean, z);
        }
    }
}
