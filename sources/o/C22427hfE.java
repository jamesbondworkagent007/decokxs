package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hfE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22427hfE implements InterfaceC22425hfC {
    public final MutableLiveData<java.lang.String> AEQbTJ;
    public MutableLiveData<DexMultiTokenInfoBean> AhwBna;
    public MutableLiveData<java.lang.Boolean> EZpvd;
    public MutableLiveData<DexMultiTokenInfoBean> KWHzl;
    public final java.lang.String OLrzqt;
    public Calendar copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22425hfC
    public MutableLiveData<DexMultiTokenInfoBean> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22425hfC
    public LiveData<java.lang.String> AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22425hfC
    public void EZpvd(Calendar calendar) {
        this.copydefault = calendar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22425hfC
    public MutableLiveData<DexMultiTokenInfoBean> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22425hfC
    public Calendar OLrzqt() {
        return this.copydefault;
    }

    public C22427hfE(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.KWHzl = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
    }

    @Override // o.InterfaceC22425hfC
    public DexMultiTokenInfoBean EZpvd() {
        if (C22372heC.AEQbTJ(this.OLrzqt)) {
            return C23317hvu.djBIcL();
        }
        return C22380heK.OLrzqt.copydefault(this.OLrzqt).fetchVPNInfo().KWHzl();
    }

    @Override // o.InterfaceC22425hfC
    public DexMultiTokenInfoBean copydefault() {
        if (C22372heC.AEQbTJ(this.OLrzqt)) {
            return C23317hvu.gEmmrt();
        }
        return C22380heK.OLrzqt.copydefault(this.OLrzqt).fetchVPNInfo().fetchVPNInfo();
    }

    @Override // o.InterfaceC22425hfC
    public void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z) {
        this.KWHzl.setValue(dexMultiTokenInfoBean);
        this.EZpvd.setValue(java.lang.Boolean.valueOf(z));
        if (C22372heC.AEQbTJ(this.OLrzqt)) {
            C23317hvu.KWHzl(dexMultiTokenInfoBean);
        } else {
            C22380heK.OLrzqt.copydefault(this.OLrzqt).fetchVPNInfo().EZpvd(dexMultiTokenInfoBean);
        }
    }

    @Override // o.InterfaceC22425hfC
    public void EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z) {
        this.AhwBna.setValue(dexMultiTokenInfoBean);
        this.EZpvd.setValue(java.lang.Boolean.valueOf(z));
        if (C22372heC.AEQbTJ(this.OLrzqt)) {
            C23317hvu.AEQbTJ(dexMultiTokenInfoBean);
        } else {
            C22380heK.OLrzqt.copydefault(this.OLrzqt).fetchVPNInfo().AEQbTJ(dexMultiTokenInfoBean);
        }
    }
}
