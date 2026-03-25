package o;

import com.okinc.market.quotation.domain.coin.GetAllCoinVosUseCase$getCategoryGroup$1;
import com.okinc.market.quotation.domain.coin.GetAllCoinVosUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.coin.GetAllCoinVosUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41408qqJ implements InterfaceC49404uns<kotlin.Pair<? extends InterfaceC41637qua, ? extends java.lang.Boolean>, Triple<? extends java.util.List<? extends InterfaceC41583qtZ>, ? extends java.util.List<? extends CategoryGroupVo>, ? extends java.lang.Long>> {
    public final C41559qtB OLrzqt;
    public final C41414qqP copydefault;

    @yCM
    public C41408qqJ(@NotNull C41414qqP c41414qqP, @NotNull C41559qtB c41559qtB) {
        Intrinsics.checkNotNullParameter(c41414qqP, "");
        Intrinsics.checkNotNullParameter(c41559qtB, "");
        this.copydefault = c41414qqP;
        this.OLrzqt = c41559qtB;
    }

    public /* bridge */ /* synthetic */ java.lang.Object AEQbTJ(java.lang.Object obj, Continuation continuation) {
        return AEQbTJ((kotlin.Pair<? extends InterfaceC41637qua, java.lang.Boolean>) obj, (Continuation<? super Triple<? extends java.util.List<? extends InterfaceC41583qtZ>, ? extends java.util.List<CategoryGroupVo>, java.lang.Long>>) continuation);
    }

    public java.lang.Object AEQbTJ(@NotNull kotlin.Pair<? extends InterfaceC41637qua, java.lang.Boolean> pair, @NotNull Continuation<? super Triple<? extends java.util.List<? extends InterfaceC41583qtZ>, ? extends java.util.List<CategoryGroupVo>, java.lang.Long>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, pair, continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return OLrzqt((kotlin.Pair<? extends InterfaceC41637qua, java.lang.Boolean>) obj, (Continuation<? super Triple<? extends java.util.List<? extends InterfaceC41583qtZ>, ? extends java.util.List<CategoryGroupVo>, java.lang.Long>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull kotlin.Pair<? extends InterfaceC41637qua, java.lang.Boolean> pair, @NotNull Continuation<? super Triple<? extends java.util.List<? extends InterfaceC41583qtZ>, ? extends java.util.List<CategoryGroupVo>, java.lang.Long>> continuation) throws java.lang.Throwable {
        GetAllCoinVosUseCase$onExecute$1 getAllCoinVosUseCase$onExecute$1;
        C41408qqJ c41408qqJ;
        InterfaceC41637qua interfaceC41637qua;
        boolean z;
        if (continuation instanceof GetAllCoinVosUseCase$onExecute$1) {
            getAllCoinVosUseCase$onExecute$1 = (GetAllCoinVosUseCase$onExecute$1) continuation;
            int i = getAllCoinVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllCoinVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllCoinVosUseCase$onExecute$1 = new GetAllCoinVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = getAllCoinVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAllCoinVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            InterfaceC41637qua interfaceC41637quaComponent1 = pair.component1();
            boolean zBooleanValue = pair.component2().booleanValue();
            C41414qqP c41414qqP = this.copydefault;
            Unit unit = Unit.INSTANCE;
            getAllCoinVosUseCase$onExecute$1.L$0 = this;
            getAllCoinVosUseCase$onExecute$1.L$1 = interfaceC41637quaComponent1;
            getAllCoinVosUseCase$onExecute$1.Z$0 = zBooleanValue;
            getAllCoinVosUseCase$onExecute$1.label = 1;
            java.lang.Object objAEQbTJ = c41414qqP.AEQbTJ((java.lang.Object) unit, (Continuation) getAllCoinVosUseCase$onExecute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c41408qqJ = this;
            interfaceC41637qua = interfaceC41637quaComponent1;
            z = zBooleanValue;
            objCoroutineScope = objAEQbTJ;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCoroutineScope);
                Triple triple = (Triple) objCoroutineScope;
                C41434qqj c41434qqj = C41434qqj.KWHzl;
                int size = ((java.util.List) triple.getFirst()).size();
                java.util.List list = (java.util.List) triple.getSecond();
                java.lang.Integer numAEQbTJ = list != null ? C56443yFo.AEQbTJ(list.size()) : null;
                c41434qqj.KWHzl("GetAllCoinVosUseCase", "GetAllCoinVosUseCase: voList=" + size + ", categoryGroup=" + numAEQbTJ + ", time=" + triple.getThird());
                return triple;
            }
            boolean z2 = getAllCoinVosUseCase$onExecute$1.Z$0;
            InterfaceC41637qua interfaceC41637qua2 = (InterfaceC41637qua) getAllCoinVosUseCase$onExecute$1.L$1;
            C41408qqJ c41408qqJ2 = (C41408qqJ) getAllCoinVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
            z = z2;
            interfaceC41637qua = interfaceC41637qua2;
            c41408qqJ = c41408qqJ2;
        }
        java.util.List list2 = (java.util.List) objCoroutineScope;
        if (list2 == null) {
            Triple triple2 = new Triple(null, null, C56443yFo.KWHzl(java.lang.System.currentTimeMillis()));
            C41434qqj.KWHzl.KWHzl("GetAllCoinVosUseCase", "GetAllCoinVosUseCase: raw coin list is null");
            return triple2;
        }
        GetAllCoinVosUseCase$onExecute$$inlined$executeAsyncTasks$1 getAllCoinVosUseCase$onExecute$$inlined$executeAsyncTasks$1 = new GetAllCoinVosUseCase$onExecute$$inlined$executeAsyncTasks$1(null, list2, c41408qqJ, interfaceC41637qua, c41408qqJ, z);
        getAllCoinVosUseCase$onExecute$1.L$0 = null;
        getAllCoinVosUseCase$onExecute$1.L$1 = null;
        getAllCoinVosUseCase$onExecute$1.label = 2;
        objCoroutineScope = CoroutineScopeKt.coroutineScope(getAllCoinVosUseCase$onExecute$$inlined$executeAsyncTasks$1, getAllCoinVosUseCase$onExecute$1);
        if (objCoroutineScope == objCopydefault) {
            return objCopydefault;
        }
        Triple triple3 = (Triple) objCoroutineScope;
        C41434qqj c41434qqj2 = C41434qqj.KWHzl;
        int size2 = ((java.util.List) triple3.getFirst()).size();
        java.util.List list3 = (java.util.List) triple3.getSecond();
        if (list3 != null) {
        }
        c41434qqj2.KWHzl("GetAllCoinVosUseCase", "GetAllCoinVosUseCase: voList=" + size2 + ", categoryGroup=" + numAEQbTJ + ", time=" + triple3.getThird());
        return triple3;
    }

    /* JADX INFO: renamed from: o.qqJ$TaskDescription */
    public static final class TaskDescription implements Function1<TradeCoinInfo, InterfaceC41583qtZ> {
        public final /* synthetic */ InterfaceC41637qua KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(InterfaceC41637qua interfaceC41637qua) {
            this.KWHzl = interfaceC41637qua;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final InterfaceC41583qtZ invoke(TradeCoinInfo tradeCoinInfo) {
            Intrinsics.checkNotNullParameter(tradeCoinInfo, "");
            return C41408qqJ.this.OLrzqt(tradeCoinInfo, this.KWHzl);
        }
    }

    public final InterfaceC41583qtZ OLrzqt(TradeCoinInfo tradeCoinInfo, InterfaceC41637qua interfaceC41637qua) {
        return interfaceC41637qua.copydefault(tradeCoinInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(boolean z, Continuation<? super java.util.List<CategoryGroupVo>> continuation) throws java.lang.Throwable {
        GetAllCoinVosUseCase$getCategoryGroup$1 getAllCoinVosUseCase$getCategoryGroup$1;
        if (continuation instanceof GetAllCoinVosUseCase$getCategoryGroup$1) {
            getAllCoinVosUseCase$getCategoryGroup$1 = (GetAllCoinVosUseCase$getCategoryGroup$1) continuation;
            int i = getAllCoinVosUseCase$getCategoryGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllCoinVosUseCase$getCategoryGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllCoinVosUseCase$getCategoryGroup$1 = new GetAllCoinVosUseCase$getCategoryGroup$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getAllCoinVosUseCase$getCategoryGroup$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getAllCoinVosUseCase$getCategoryGroup$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (z) {
                C41559qtB c41559qtB = this.OLrzqt;
                Unit unit = Unit.INSTANCE;
                getAllCoinVosUseCase$getCategoryGroup$1.label = 1;
                objCopydefault = c41559qtB.copydefault(unit, getAllCoinVosUseCase$getCategoryGroup$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objCopydefault);
        java.util.List list = (java.util.List) objCopydefault;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                CategoryGroupVo categoryGroupVo = (CategoryGroupVo) obj;
                if (!categoryGroupVo.values() && !categoryGroupVo.isConnected()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return null;
    }
}
