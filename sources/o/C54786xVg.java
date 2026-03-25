package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.OfflinePlan;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.xVg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54786xVg {
    public static final C54786xVg copydefault = new C54786xVg();
    public static final MutableLiveData<OfflinePlan> KWHzl = new MutableLiveData<>();
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<OfflinePlan> KWHzl() {
        return KWHzl;
    }

    private C54786xVg() {
    }

    public final void AEQbTJ(BizInstrument bizInstrument) {
        C56130xwx c56130xwxAYXKKw;
        java.lang.String instId;
        java.lang.String instType;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (c56130xwxAYXKKw = interfaceC54581xNrOLrzqt.AYXKKw()) == null) {
            return;
        }
        java.lang.String str = "";
        if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
            instId = "";
        }
        if (bizInstrument != null && (instType = bizInstrument.getInstType()) != null) {
            str = instType;
        }
        c56130xwxAYXKKw.OLrzqt(instId, str, new TaskDescription());
    }

    /* JADX INFO: renamed from: o.xVg$TaskDescription */
    public static final class TaskDescription implements InterfaceC55701xos<OfflinePlan> {
        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        public void EZpvd(boolean z, OfflinePlan offlinePlan, java.lang.Exception exc) {
            MutableLiveData<OfflinePlan> mutableLiveDataKWHzl = C54786xVg.copydefault.KWHzl();
            if (offlinePlan == null) {
                offlinePlan = new OfflinePlan((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null);
            }
            mutableLiveDataKWHzl.setValue(offlinePlan);
        }
    }

    public final void AEQbTJ() {
        SPUtils.clear("appFirstStartSp");
    }
}
