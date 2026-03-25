package com.okinc.buysell.ui.result;

import com.okinc.assets.backend.api.model.AssetMaxApyEarnInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC43419rot;
import o.C43251rlk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC8224ayh;
import o.lSS;
import o.mHA;

/* JADX INFO: loaded from: classes23.dex */
public final class ConvertResultViewModel$loadRecommendData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currencyId;
    final /* synthetic */ String $fromCurrency;
    final /* synthetic */ String $toCurrency;
    Object L$0;
    int label;
    final /* synthetic */ ConvertResultViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertResultViewModel$loadRecommendData$1(String str, ConvertResultViewModel convertResultViewModel, String str2, String str3, Continuation<? super ConvertResultViewModel$loadRecommendData$1> continuation) {
        super(2, continuation);
        this.$currencyId = str;
        this.this$0 = convertResultViewModel;
        this.$fromCurrency = str2;
        this.$toCurrency = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConvertResultViewModel$loadRecommendData$1(this.$currencyId, this.this$0, this.$fromCurrency, this.$toCurrency, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConvertResultViewModel$loadRecommendData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0100  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC8224ayh interfaceC8224ayh = (InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class);
            int i2 = Integer.parseInt(this.$currencyId);
            this.label = 1;
            objCopydefault = interfaceC8224ayh.copydefault(i2, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                abstractC43419rot = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                ConvertResultViewModel convertResultViewModel = this.this$0;
                String str = this.$fromCurrency;
                String str2 = this.$toCurrency;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    Throwable th = (Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    ConvertResultViewModel$loadRecommendData$1$2$1 convertResultViewModel$loadRecommendData$1$2$1 = new ConvertResultViewModel$loadRecommendData$1$2$1(th, convertResultViewModel, str, str2, null);
                    this.L$0 = abstractC43419rot;
                    this.label = 3;
                    if (BuildersKt.withContext(main, convertResultViewModel$loadRecommendData$1$2$1, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        abstractC43419rot = (AbstractC43419rot) objCopydefault;
        ConvertResultViewModel convertResultViewModel2 = this.this$0;
        String str3 = this.$fromCurrency;
        String str4 = this.$toCurrency;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            List<AssetMaxApyEarnInfo> list = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            if (list == null) {
                mHA.OLrzqt.OLrzqt(convertResultViewModel2.AEQbTJ, new lSS(new ArrayList(), str3, str4));
            } else {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (AssetMaxApyEarnInfo assetMaxApyEarnInfo : list) {
                    arrayList.add(new com.okinc.buysell.ui.result.view.AssetMaxApyEarnInfo(assetMaxApyEarnInfo.getCapitalTypeMsg(), assetMaxApyEarnInfo.getCurrencyFullName(), assetMaxApyEarnInfo.getCurrencyIcon(), assetMaxApyEarnInfo.getCurrencyId(), assetMaxApyEarnInfo.getPeriod(), assetMaxApyEarnInfo.getProductsType(), assetMaxApyEarnInfo.getProjectIcon(), assetMaxApyEarnInfo.getProjectName(), assetMaxApyEarnInfo.getProjectType(), assetMaxApyEarnInfo.getRate(), assetMaxApyEarnInfo.getRateRangeMax(), assetMaxApyEarnInfo.getRateRangeMin(), assetMaxApyEarnInfo.getRedeemDay(), assetMaxApyEarnInfo.getSavingType(), assetMaxApyEarnInfo.getType(), assetMaxApyEarnInfo.getUnit(), assetMaxApyEarnInfo.getUrl()));
                }
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                ConvertResultViewModel$loadRecommendData$1$1$1 convertResultViewModel$loadRecommendData$1$1$1 = new ConvertResultViewModel$loadRecommendData$1$1$1(convertResultViewModel2, arrayList, str3, str4, null);
                this.L$0 = abstractC43419rot;
                this.label = 2;
                if (BuildersKt.withContext(main2, convertResultViewModel$loadRecommendData$1$1$1, this) == objCopydefault2) {
                    return objCopydefault2;
                }
            }
        }
        ConvertResultViewModel convertResultViewModel3 = this.this$0;
        String str5 = this.$fromCurrency;
        String str22 = this.$toCurrency;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
