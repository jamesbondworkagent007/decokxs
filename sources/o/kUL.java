package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC28245kUg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kUL implements kUJ {
    public final kYD copydefault;

    @yCM
    public kUL(@NotNull kYD kyd) {
        Intrinsics.checkNotNullParameter(kyd, "");
        this.copydefault = kyd;
    }

    @Override // o.kUJ
    public java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation) {
        return this.copydefault.KWHzl(continuation);
    }

    @Override // o.kUJ
    public java.util.List<DefiChainInfo> AEQbTJ() {
        return this.copydefault.AEQbTJ();
    }

    @Override // o.kUJ
    public InterfaceC28245kUg EZpvd(@NotNull C28243kUe c28243kUe) {
        java.lang.Object next;
        java.util.List<java.lang.Integer> bridgeSupportChainList;
        InterfaceC28245kUg.Activity activity;
        Intrinsics.checkNotNullParameter(c28243kUe, "");
        if (c28243kUe.AEQbTJ()) {
            return InterfaceC28245kUg.Activity.copydefault;
        }
        java.util.Iterator<T> it = AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) c28243kUe.EZpvd())) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        if (defiChainInfo != null && (bridgeSupportChainList = defiChainInfo.getBridgeSupportChainList()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(bridgeSupportChainList, 10));
            java.util.Iterator<T> it2 = bridgeSupportChainList.iterator();
            while (it2.hasNext()) {
                arrayList.add(java.lang.String.valueOf(((java.lang.Number) it2.next()).intValue()));
            }
            if ((arrayList.contains(c28243kUe.copydefault().getChainId()) ? arrayList : null) != null && (activity = InterfaceC28245kUg.Activity.copydefault) != null) {
                return activity;
            }
        }
        return InterfaceC28245kUg.StateListAnimator.OLrzqt;
    }
}
