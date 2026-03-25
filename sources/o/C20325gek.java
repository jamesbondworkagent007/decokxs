package o;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AddressModuleModel;
import com.okinc.business.defi.wallet.transaction.ui.modularization.usecase.HandleWalletDisplayNameUseCase$invoke$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20325gek {
    public final C12827cuN EZpvd;

    public C20325gek(@NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.EZpvd = c12827cuN;
    }

    public final java.lang.Object copydefault(@NotNull C10854bwM c10854bwM, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull ChainAddress chainAddress, @NotNull java.util.List<AddressModuleModel> list, @NotNull Continuation<? super Unit> continuation) {
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getDefault(), new HandleWalletDisplayNameUseCase$invoke$2(c10854bwM, list, this, chainAddress, abstractC12782ctV, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
