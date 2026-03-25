package o;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesUpdateGroupNamePayload;
import com.okinc.business.market.features.favorites.editing.domain.group.ModifyMarketFavoritesGroupNameUseCase$onExecute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jSv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26124jSv extends AbstractC49400uno<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, java.lang.String> {
    public final CoroutineDispatcher EZpvd;
    public final C26117jSo OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((kotlin.Pair<java.lang.String, java.lang.String>) obj, (Continuation<? super java.lang.String>) continuation);
    }

    @yCM
    public C26124jSv(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C26117jSo c26117jSo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c26117jSo, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = c26117jSo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        ModifyMarketFavoritesGroupNameUseCase$onExecute$1 modifyMarketFavoritesGroupNameUseCase$onExecute$1;
        if (continuation instanceof ModifyMarketFavoritesGroupNameUseCase$onExecute$1) {
            modifyMarketFavoritesGroupNameUseCase$onExecute$1 = (ModifyMarketFavoritesGroupNameUseCase$onExecute$1) continuation;
            int i = modifyMarketFavoritesGroupNameUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                modifyMarketFavoritesGroupNameUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                modifyMarketFavoritesGroupNameUseCase$onExecute$1 = new ModifyMarketFavoritesGroupNameUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = modifyMarketFavoritesGroupNameUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = modifyMarketFavoritesGroupNameUseCase$onExecute$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str = (java.lang.String) modifyMarketFavoritesGroupNameUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            return str;
        }
        C56391yDq.AEQbTJ(obj);
        java.lang.String strComponent1 = pair.component1();
        java.lang.String strComponent2 = pair.component2();
        MarketFavoritesUpdateGroupNamePayload marketFavoritesUpdateGroupNamePayload = new MarketFavoritesUpdateGroupNamePayload(strComponent1, strComponent2);
        C26117jSo c26117jSo = this.OLrzqt;
        modifyMarketFavoritesGroupNameUseCase$onExecute$1.L$0 = strComponent2;
        modifyMarketFavoritesGroupNameUseCase$onExecute$1.label = 1;
        return c26117jSo.OLrzqt(marketFavoritesUpdateGroupNamePayload, modifyMarketFavoritesGroupNameUseCase$onExecute$1) == objCopydefault ? objCopydefault : strComponent2;
    }
}
