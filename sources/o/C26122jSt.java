package o;

import com.okinc.business.market.features.favorites.editing.domain.crypto.GetMarketFavoritesCustomGroupsUseCase$onExecute$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jSt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26122jSt extends AbstractC49400uno<java.lang.String, java.util.List<? extends C26169jUm>> {
    public final C26125jSw KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C26122jSt(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C26125jSw c26125jSw) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c26125jSw, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = c26125jSw;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(java.lang.String str, @NotNull Continuation<? super java.util.List<C26169jUm>> continuation) throws java.lang.Throwable {
        GetMarketFavoritesCustomGroupsUseCase$onExecute$1 getMarketFavoritesCustomGroupsUseCase$onExecute$1;
        if (continuation instanceof GetMarketFavoritesCustomGroupsUseCase$onExecute$1) {
            getMarketFavoritesCustomGroupsUseCase$onExecute$1 = (GetMarketFavoritesCustomGroupsUseCase$onExecute$1) continuation;
            int i = getMarketFavoritesCustomGroupsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketFavoritesCustomGroupsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketFavoritesCustomGroupsUseCase$onExecute$1 = new GetMarketFavoritesCustomGroupsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getMarketFavoritesCustomGroupsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketFavoritesCustomGroupsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C26125jSw c26125jSw = this.KWHzl;
            Unit unit = Unit.INSTANCE;
            getMarketFavoritesCustomGroupsUseCase$onExecute$1.L$0 = str;
            getMarketFavoritesCustomGroupsUseCase$onExecute$1.label = 1;
            objEZpvd = c26125jSw.EZpvd(unit, (Continuation) getMarketFavoritesCustomGroupsUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) getMarketFavoritesCustomGroupsUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        kotlin.Pair pair = (kotlin.Pair) objEZpvd;
        java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) pair.component1(), (java.lang.Iterable) pair.component2());
        java.util.ArrayList<C26170jUn> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listDjBIcL) {
            if (!((C26170jUn) obj).AhwBna()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (C26170jUn c26170jUn : arrayList) {
            C26169jUm c26169jUm = Intrinsics.EZpvd((java.lang.Object) c26170jUn.copydefault(), (java.lang.Object) str) ? null : new C26169jUm(c26170jUn.KWHzl() + " (" + c26170jUn.AEQbTJ().getFavouriteList().size() + ")", c26170jUn.AEQbTJ(), false, 4, null);
            if (c26169jUm != null) {
                arrayList2.add(c26169jUm);
            }
        }
        return arrayList2;
    }
}
