package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hme, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC22824hme {
    DexMultiTokenInfoBean AEQbTJ();

    void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z);

    boolean AYXKKw();

    LiveData<DexMultiTokenInfoBean> EZpvd();

    LiveData<DexMultiTokenInfoBean> KWHzl();

    void KWHzl(@NotNull java.lang.String str);

    void KWHzl(C22397heb c22397heb);

    java.lang.String OLrzqt();

    void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z);

    void OLrzqt(@NotNull java.lang.String str);

    MutableLiveData<java.lang.String> copydefault();

    java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    C22397heb djBIcL();

    LiveData<java.lang.String> gEmmrt();

    /* JADX INFO: renamed from: o.hme$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ void setCurrentFromCoin$default(InterfaceC22824hme interfaceC22824hme, DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCurrentFromCoin");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            interfaceC22824hme.OLrzqt(dexMultiTokenInfoBean, z);
        }

        public static /* synthetic */ void setCurrentToCoin$default(InterfaceC22824hme interfaceC22824hme, DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCurrentToCoin");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            interfaceC22824hme.AEQbTJ(dexMultiTokenInfoBean, z);
        }
    }
}
