package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC28245kUg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kUP implements kUJ {
    public final kYD copydefault;

    @yCM
    public kUP(@NotNull kYD kyd) {
        Intrinsics.checkNotNullParameter(kyd, "");
        this.copydefault = kyd;
    }

    @Override // o.kUJ
    public java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation) {
        return this.copydefault.AhwBna(continuation);
    }

    @Override // o.kUJ
    public java.util.List<DefiChainInfo> AEQbTJ() {
        return this.copydefault.valueOf();
    }

    @Override // o.kUJ
    public InterfaceC28245kUg EZpvd(@NotNull C28243kUe c28243kUe) {
        Intrinsics.checkNotNullParameter(c28243kUe, "");
        if (c28243kUe.KWHzl() == TradeMode.Meme && !c28243kUe.copydefault().getSupportMemeMode()) {
            return InterfaceC28245kUg.StateListAnimator.OLrzqt;
        }
        if (c28243kUe.KWHzl() == TradeMode.Advanced && !c28243kUe.copydefault().getSupportCefiMode()) {
            return InterfaceC28245kUg.StateListAnimator.OLrzqt;
        }
        return InterfaceC28245kUg.Activity.copydefault;
    }
}
