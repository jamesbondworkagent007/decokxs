package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.AAWalletEnableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fRt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC17773fRt {
    AAWalletEnableState AEQbTJ(@NotNull InterfaceC9738bbJ interfaceC9738bbJ);

    java.lang.Object AEQbTJ(@NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super java.util.List<? extends AbstractC12784ctX>> continuation);

    MpcWalletService.MpcWalletAbleStatus EZpvd(@NotNull InterfaceC9738bbJ interfaceC9738bbJ);

    java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation);

    java.lang.String KWHzl(@NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull InterfaceC9738bbJ interfaceC9738bbJ);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super InterfaceC9738bbJ> continuation);

    void OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super InterfaceC9738bbJ> continuation);

    java.lang.Object copydefault(@NotNull java.util.List<? extends AbstractC12782ctV> list, @NotNull Continuation<? super Unit> continuation);

    InterfaceC9731bbC copydefault(long j);
}
