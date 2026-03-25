package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.bsc.CurrencyTokenBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31656lzd;
import o.C43251rlk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31670lzr;
import o.InterfaceC31764mDa;
import o.lyC;

/* JADX INFO: loaded from: classes7.dex */
public final class SellCryptoListUseCase$getSellCryptoAndDexList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends CurrencyToken>, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $selectedCurrency;
    final /* synthetic */ boolean $withCache;
    int label;
    final /* synthetic */ C31656lzd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellCryptoListUseCase$getSellCryptoAndDexList$2(C31656lzd c31656lzd, String str, boolean z, Continuation<? super SellCryptoListUseCase$getSellCryptoAndDexList$2> continuation) {
        super(2, continuation);
        this.this$0 = c31656lzd;
        this.$selectedCurrency = str;
        this.$withCache = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SellCryptoListUseCase$getSellCryptoAndDexList$2(this.this$0, this.$selectedCurrency, this.$withCache, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends CurrencyToken>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<CurrencyToken>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<CurrencyToken>, OKServerException>> continuation) {
        return ((SellCryptoListUseCase$getSellCryptoAndDexList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC31764mDa interfaceC31764mDa = this.this$0.EZpvd;
            String str = this.$selectedCurrency;
            boolean z = this.$withCache;
            Boolean boolKWHzl = C56443yFo.KWHzl(((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AYXKKw());
            this.label = 1;
            obj = interfaceC31764mDa.copydefault(str, "all", z, boolKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            List list = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(lyC.AEQbTJ.EZpvd((CurrencyTokenBean) it.next()));
            }
            return new AbstractC43419rot.StateListAnimator(arrayList);
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }
}
