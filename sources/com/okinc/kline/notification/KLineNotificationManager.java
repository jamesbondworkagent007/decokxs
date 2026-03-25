package com.okinc.kline.notification;

import android.app.Activity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.kline.notification.KLineNotificationManager;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C46945tgj;
import o.C54819xWm;
import o.C56392yDr;
import o.C56402yEa;
import o.C57656ymY;
import o.InterfaceC54816xWj;
import o.InterfaceC56387yDm;
import o.oXA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KLineNotificationManager implements DefaultLifecycleObserver {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final MutableStateFlow<Boolean> copydefault = StateFlowKt.MutableStateFlow(Boolean.TRUE);
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.oXv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return KLineNotificationManager.AEQbTJ(this.KWHzl);
        }
    });
    public final InterfaceC54816xWj KWHzl = new ActionBar();

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.notification.KLineNotificationManager.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final List<oXA> EZpvd() {
        return (List) this.AEQbTJ.getValue();
    }

    public static final List AEQbTJ(KLineNotificationManager kLineNotificationManager) {
        return kLineNotificationManager.copydefault();
    }

    public static final class ActionBar implements InterfaceC54816xWj {
        public ActionBar() {
        }

        @Override // o.InterfaceC54816xWj
        public void OLrzqt(Activity activity) {
            super.OLrzqt(activity);
            KLineNotificationManager.this.copydefault.setValue(Boolean.TRUE);
        }

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
            KLineNotificationManager.this.copydefault.setValue(Boolean.FALSE);
        }
    }

    public final List<oXA> copydefault() {
        return C56402yEa.EZpvd(new oXA());
    }

    public final void AEQbTJ() {
        this.copydefault.setValue(Boolean.TRUE);
        Iterator<T> it = EZpvd().iterator();
        while (it.hasNext()) {
            ((oXA) it.next()).copydefault(this.copydefault);
        }
        C54819xWm.KWHzl().AEQbTJ(this.KWHzl);
    }

    public final void OLrzqt() {
        Iterator<T> it = EZpvd().iterator();
        while (it.hasNext()) {
            C46945tgj.AEQbTJ.djBIcL().EZpvd(((oXA) it.next()).AEQbTJ());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onResume(lifecycleOwner);
        AEQbTJ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onPause(lifecycleOwner);
        C57656ymY.OLrzqt.AhwBna();
        OLrzqt();
    }
}
