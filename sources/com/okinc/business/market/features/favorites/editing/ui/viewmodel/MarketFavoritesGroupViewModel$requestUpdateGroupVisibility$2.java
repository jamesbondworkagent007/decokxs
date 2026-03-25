package com.okinc.business.market.features.favorites.editing.ui.viewmodel;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C26126jSx;
import o.C26170jUn;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavoritesGroupViewModel$requestUpdateGroupVisibility$2 extends SuspendLambda implements Function1<Continuation<? super Pair<? extends Pair<? extends String, ? extends Boolean>, ? extends Pair<? extends List<? extends C26170jUn>, ? extends List<? extends C26170jUn>>>>, Object> {
    final /* synthetic */ String $groupName;
    final /* synthetic */ boolean $hidden;
    int label;
    final /* synthetic */ MarketFavoritesGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavoritesGroupViewModel$requestUpdateGroupVisibility$2(MarketFavoritesGroupViewModel marketFavoritesGroupViewModel, String str, boolean z, Continuation<? super MarketFavoritesGroupViewModel$requestUpdateGroupVisibility$2> continuation) {
        super(1, continuation);
        this.this$0 = marketFavoritesGroupViewModel;
        this.$groupName = str;
        this.$hidden = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MarketFavoritesGroupViewModel$requestUpdateGroupVisibility$2(this.this$0, this.$groupName, this.$hidden, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Pair<? extends Pair<? extends String, ? extends Boolean>, ? extends Pair<? extends List<? extends C26170jUn>, ? extends List<? extends C26170jUn>>>> continuation) {
        return invoke2((Continuation<? super Pair<Pair<String, Boolean>, ? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super Pair<Pair<String, Boolean>, ? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>>> continuation) {
        return ((MarketFavoritesGroupViewModel$requestUpdateGroupVisibility$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26126jSx c26126jSx = this.this$0.djBIcL;
            Pair pairOLrzqt = C56390yDp.OLrzqt(this.$groupName, C56443yFo.KWHzl(this.$hidden));
            this.label = 1;
            obj = c26126jSx.EZpvd(pairOLrzqt, (Continuation) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
