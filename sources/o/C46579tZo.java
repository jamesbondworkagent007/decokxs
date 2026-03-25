package o;

import com.okinc.rxutils.RecreateEvent;
import com.okinc.rxutils.RecreateType;
import com.okinc.rxutils.RxBus;

/* JADX INFO: renamed from: o.tZo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C46579tZo implements BlN {
    @Override // o.BlN
    public boolean EZpvd(int i) {
        return C33512mxp.AEQbTJ.copydefault(i);
    }

    @Override // o.BlN
    public boolean copydefault(int i) {
        return C33512mxp.AEQbTJ.OLrzqt(i);
    }

    @Override // o.BlN
    public int EZpvd() {
        return C33512mxp.AEQbTJ.isConnected();
    }

    @Override // o.BlN
    public int copydefault() {
        return C33512mxp.AEQbTJ.AYXKKw();
    }

    @Override // o.BlN
    public void AEQbTJ() {
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        RxBus.AEQbTJ(new C33504mxh(c33512mxp.isConnected(), c33512mxp.AYXKKw()));
        RxBus.AEQbTJ(new RecreateEvent(RecreateType.THEME));
    }
}
