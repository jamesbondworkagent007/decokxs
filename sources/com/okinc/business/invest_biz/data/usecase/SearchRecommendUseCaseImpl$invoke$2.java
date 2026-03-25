package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.bean.InvestChip;
import com.okinc.business.invest_biz.data.bean.InvestSearchData;
import com.okinc.business.invest_biz.data.bean.SearchRecommendResponse;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C59449zhJ;
import o.InterfaceC25472ixP;
import o.iBL;
import o.iGC;

/* JADX INFO: loaded from: classes6.dex */
public final class SearchRecommendUseCaseImpl$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ArrayList<InvestChip>>>, Object> {
    final /* synthetic */ List<InvestChip> $chips;
    final /* synthetic */ String $keyword;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ iGC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRecommendUseCaseImpl$invoke$2(iGC igc, String str, List<InvestChip> list, Continuation<? super SearchRecommendUseCaseImpl$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = igc;
        this.$keyword = str;
        this.$chips = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchRecommendUseCaseImpl$invoke$2(this.this$0, this.$keyword, this.$chips, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ArrayList<InvestChip>>> continuation) {
        return ((SearchRecommendUseCaseImpl$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str;
        List<InvestChip> list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                iGC igc = this.this$0;
                str = this.$keyword;
                List<InvestChip> list2 = this.$chips;
                Result.Application application = Result.Companion;
                InterfaceC25472ixP interfaceC25472ixPOLrzqt = igc.KWHzl().OLrzqt();
                this.L$0 = str;
                this.L$1 = list2;
                this.label = 1;
                obj = interfaceC25472ixPOLrzqt.AEQbTJ(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                list = list2;
            }
            Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default);
            SearchRecommendResponse searchRecommendResponse = (SearchRecommendResponse) objUnwrapResponseData$default;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((InvestChip) obj2).AEQbTJ() != null) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((InvestChip) it.next()).AEQbTJ());
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list) {
                if (((InvestChip) obj3).OLrzqt() != null) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList(C56403yEb.AYXKKw(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((InvestChip) it2.next()).OLrzqt());
            }
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            for (InvestSearchData investSearchData : searchRecommendResponse.OLrzqt()) {
                if (!arrayList3.contains(investSearchData)) {
                    String symbol = investSearchData.getSymbol();
                    if (symbol != null && C59449zhJ.gEmmrt(symbol, str, true)) {
                        arrayList6.add(new InvestChip(null, investSearchData, 1, null));
                    } else {
                        String symbol2 = investSearchData.getSymbol();
                        if (symbol2 != null && StringsKt__StringsKt.AhwBna((CharSequence) symbol2, (CharSequence) str, true)) {
                            arrayList7.add(new InvestChip(null, investSearchData, 1, null));
                        }
                    }
                }
            }
            for (InvestSearchData investSearchData2 : searchRecommendResponse.AEQbTJ()) {
                if (!arrayList5.contains(investSearchData2)) {
                    String symbol3 = investSearchData2.getSymbol();
                    if (symbol3 != null && C59449zhJ.gEmmrt(symbol3, str, true)) {
                        arrayList6.add(new InvestChip(investSearchData2, null, 2, null));
                    } else {
                        String symbol4 = investSearchData2.getSymbol();
                        if (symbol4 != null && StringsKt__StringsKt.AhwBna((CharSequence) symbol4, (CharSequence) str, true)) {
                            arrayList7.add(new InvestChip(investSearchData2, null, 2, null));
                        }
                    }
                }
            }
            arrayList.addAll(arrayList6);
            arrayList.addAll(arrayList7);
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
