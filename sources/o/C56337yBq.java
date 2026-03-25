package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.yBq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56337yBq {
    private C56337yBq() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static boolean OLrzqt(InterfaceC58217yxC interfaceC58217yxC, InterfaceC58217yxC interfaceC58217yxC2, java.lang.Class<?> cls) {
        C58297yyd.AEQbTJ(interfaceC58217yxC2, "next is null");
        if (interfaceC58217yxC == null) {
            return true;
        }
        interfaceC58217yxC2.dispose();
        if (interfaceC58217yxC == DisposableHelper.DISPOSED) {
            return false;
        }
        KWHzl(cls);
        return false;
    }

    public static boolean EZpvd(AtomicReference<InterfaceC58217yxC> atomicReference, InterfaceC58217yxC interfaceC58217yxC, java.lang.Class<?> cls) {
        C58297yyd.AEQbTJ(interfaceC58217yxC, "next is null");
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, interfaceC58217yxC)) {
            return true;
        }
        interfaceC58217yxC.dispose();
        if (atomicReference.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        KWHzl(cls);
        return false;
    }

    public static boolean KWHzl(AtomicReference<InterfaceC60094zvb> atomicReference, InterfaceC60094zvb interfaceC60094zvb, java.lang.Class<?> cls) {
        C58297yyd.AEQbTJ(interfaceC60094zvb, "next is null");
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, interfaceC60094zvb)) {
            return true;
        }
        interfaceC60094zvb.cancel();
        if (atomicReference.get() == SubscriptionHelper.CANCELLED) {
            return false;
        }
        KWHzl(cls);
        return false;
    }

    public static java.lang.String EZpvd(java.lang.String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void KWHzl(java.lang.Class<?> cls) {
        yBG.copydefault(new ProtocolViolationException(EZpvd(cls.getName())));
    }
}
