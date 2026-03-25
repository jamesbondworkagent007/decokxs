package o;

import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mVs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32268mVs implements InterfaceC32263mVn {
    @yCM
    public C32268mVs() {
    }

    @Override // o.InterfaceC32263mVn
    public java.lang.Object AEQbTJ(boolean z, @NotNull Continuation<? super Unit> continuation) {
        SPUtils.put("dex_market_history_selected_is_token", C56443yFo.KWHzl(z), "dex_market");
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC32263mVn
    public java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(SPUtils.getBoolean("dex_market_history_selected_is_token", false, "dex_market"));
    }
}
