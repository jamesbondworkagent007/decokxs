package o;

import com.okinc.business.market.features.favorites.editing.domain.group.RearrangeMarketFavoritesGroupsUseCase$onExecute$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jSy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26127jSy extends AbstractC49400uno<java.util.List<? extends C26170jUn>, Unit> {
    public final CoroutineDispatcher KWHzl;
    public final C26117jSo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C26127jSy(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C26117jSo c26117jSo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c26117jSo, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = c26117jSo;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.List<C26170jUn> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RearrangeMarketFavoritesGroupsUseCase$onExecute$1 rearrangeMarketFavoritesGroupsUseCase$onExecute$1;
        if (continuation instanceof RearrangeMarketFavoritesGroupsUseCase$onExecute$1) {
            rearrangeMarketFavoritesGroupsUseCase$onExecute$1 = (RearrangeMarketFavoritesGroupsUseCase$onExecute$1) continuation;
            int i = rearrangeMarketFavoritesGroupsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rearrangeMarketFavoritesGroupsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                rearrangeMarketFavoritesGroupsUseCase$onExecute$1 = new RearrangeMarketFavoritesGroupsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = rearrangeMarketFavoritesGroupsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rearrangeMarketFavoritesGroupsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (!((C26170jUn) obj2).OLrzqt()) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C26170jUn) it.next()).AEQbTJ().getGroupName());
            }
            C26117jSo c26117jSo = this.copydefault;
            rearrangeMarketFavoritesGroupsUseCase$onExecute$1.label = 1;
            if (c26117jSo.OLrzqt(arrayList2, rearrangeMarketFavoritesGroupsUseCase$onExecute$1) == objCopydefault) {
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
