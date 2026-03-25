package o;

import com.okinc.okmarket.ui.market.data.UserGroupVo;
import com.okinc.okmarket.ui.usecase.MarketRearrangeFavGroupsUseCase$onExecute$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tfG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46863tfG extends AbstractC49400uno<java.util.List<? extends UserGroupVo>, Unit> {
    public final C26117jSo AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((java.util.List<UserGroupVo>) obj, (Continuation<? super Unit>) continuation);
    }

    @yCM
    public C46863tfG(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C26117jSo c26117jSo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c26117jSo, "");
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = c26117jSo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.List<UserGroupVo> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketRearrangeFavGroupsUseCase$onExecute$1 marketRearrangeFavGroupsUseCase$onExecute$1;
        if (continuation instanceof MarketRearrangeFavGroupsUseCase$onExecute$1) {
            marketRearrangeFavGroupsUseCase$onExecute$1 = (MarketRearrangeFavGroupsUseCase$onExecute$1) continuation;
            int i = marketRearrangeFavGroupsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketRearrangeFavGroupsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                marketRearrangeFavGroupsUseCase$onExecute$1 = new MarketRearrangeFavGroupsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = marketRearrangeFavGroupsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketRearrangeFavGroupsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (!((UserGroupVo) obj2).getUserGroup().isHidden()) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((UserGroupVo) it.next()).getUserGroup().getGroupName());
            }
            C26117jSo c26117jSo = this.AEQbTJ;
            marketRearrangeFavGroupsUseCase$onExecute$1.label = 1;
            if (c26117jSo.OLrzqt(arrayList2, marketRearrangeFavGroupsUseCase$onExecute$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
