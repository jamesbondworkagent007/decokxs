package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC28245kUg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kUK implements kUJ {
    public final kYD KWHzl;

    @yCM
    public kUK(@NotNull kYD kyd) {
        Intrinsics.checkNotNullParameter(kyd, "");
        this.KWHzl = kyd;
    }

    @Override // o.kUJ
    public java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation) {
        return this.KWHzl.EZpvd(continuation);
    }

    @Override // o.kUJ
    public java.util.List<DefiChainInfo> AEQbTJ() {
        return this.KWHzl.OLrzqt();
    }

    @Override // o.kUJ
    public InterfaceC28245kUg EZpvd(@NotNull C28243kUe c28243kUe) {
        Intrinsics.checkNotNullParameter(c28243kUe, "");
        TradeMode tradeModeKWHzl = c28243kUe.KWHzl();
        if (tradeModeKWHzl != null && tradeModeKWHzl.isCopyTrading() && !c28243kUe.copydefault().getSupportCopyTradeCreate()) {
            return InterfaceC28245kUg.StateListAnimator.OLrzqt;
        }
        return InterfaceC28245kUg.Activity.copydefault;
    }
}
