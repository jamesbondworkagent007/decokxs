package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC28245kUg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kUI implements kUJ {
    public final kYD AEQbTJ;

    @yCM
    public kUI(@NotNull kYD kyd) {
        Intrinsics.checkNotNullParameter(kyd, "");
        this.AEQbTJ = kyd;
    }

    @Override // o.kUJ
    public java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation) {
        return this.AEQbTJ.OLrzqt(continuation);
    }

    @Override // o.kUJ
    public java.util.List<DefiChainInfo> AEQbTJ() {
        return this.AEQbTJ.copydefault();
    }

    @Override // o.kUJ
    public InterfaceC28245kUg EZpvd(@NotNull C28243kUe c28243kUe) {
        Intrinsics.checkNotNullParameter(c28243kUe, "");
        return InterfaceC28245kUg.Activity.copydefault;
    }
}
