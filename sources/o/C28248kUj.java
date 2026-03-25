package o;

import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dexui.main.swap.trade.SwapTradeFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC28261kUw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kUj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28248kUj implements InterfaceC28261kUw {
    public static final C28248kUj copydefault = new C28248kUj();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC28261kUw
    public int KWHzl() {
        return C52761wXj.TaskDescription.iZzfmt;
    }

    private C28248kUj() {
    }

    @Override // o.InterfaceC28261kUw
    public java.lang.Object AEQbTJ(@NotNull android.content.Context context, TradeParam tradeParam, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return InterfaceC28261kUw.StateListAnimator.AEQbTJ(this, context, tradeParam, continuation);
    }

    @Override // o.InterfaceC28261kUw
    public java.lang.String EZpvd() {
        return C33070mpX.AYXKKw(C23274hvD.Fragment.dGrqPl);
    }

    @Override // o.InterfaceC28261kUw
    public androidx.fragment.app.Fragment copydefault(@NotNull android.content.Context context, @NotNull C28251kUm c28251kUm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c28251kUm, "");
        return SwapTradeFragment.Companion.AEQbTJ(c28251kUm.KWHzl(), c28251kUm.EZpvd(), new Function1() { // from class: o.kUl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28248kUj.KWHzl(((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit KWHzl(boolean z) {
        return Unit.INSTANCE;
    }
}
