package com.okinc.okmarket.ui.market;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.unify_find.bean.Plate;
import com.okinc.unify_find.bean.SearchPlateResponse;
import com.okinc.unify_find.net.BizFindApiService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C46698tcA;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.yHT;

/* JADX INFO: loaded from: classes19.dex */
public final class ModuleChooseViewModel$stateFlow$2$1 extends SuspendLambda implements yHT<List<? extends TradeGroupData>, TradeGroupData, String, Continuation<? super List<? extends Pair<? extends Boolean, ? extends TradeGroupData>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ C46698tcA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleChooseViewModel$stateFlow$2$1(C46698tcA c46698tcA, Continuation<? super ModuleChooseViewModel$stateFlow$2$1> continuation) {
        super(4, continuation);
        this.this$0 = c46698tcA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* bridge */ /* synthetic */ Object invoke(List<? extends TradeGroupData> list, TradeGroupData tradeGroupData, String str, Continuation<? super List<? extends Pair<? extends Boolean, ? extends TradeGroupData>>> continuation) {
        return invoke2((List<TradeGroupData>) list, tradeGroupData, str, (Continuation<? super List<Pair<Boolean, TradeGroupData>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<TradeGroupData> list, TradeGroupData tradeGroupData, String str, Continuation<? super List<Pair<Boolean, TradeGroupData>>> continuation) {
        ModuleChooseViewModel$stateFlow$2$1 moduleChooseViewModel$stateFlow$2$1 = new ModuleChooseViewModel$stateFlow$2$1(this.this$0, continuation);
        moduleChooseViewModel$stateFlow$2$1.L$0 = list;
        moduleChooseViewModel$stateFlow$2$1.L$1 = tradeGroupData;
        moduleChooseViewModel$stateFlow$2$1.L$2 = str;
        return moduleChooseViewModel$stateFlow$2$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<TradeGroupData> list;
        TradeGroupData tradeGroupData;
        List list2;
        Throwable th;
        Object objM7377constructorimpl;
        Object obj2;
        List list3;
        Plate plate;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            list = (List) this.L$0;
            tradeGroupData = (TradeGroupData) this.L$1;
            String str = (String) this.L$2;
            if (str != null && str.length() != 0) {
                C46698tcA c46698tcA = this.this$0;
                try {
                    Result.Application application = Result.Companion;
                    BizFindApiService bizFindApiServiceEZpvd = c46698tcA.EZpvd();
                    this.L$0 = list;
                    this.L$1 = tradeGroupData;
                    this.label = 1;
                    Object objSearchPlate = bizFindApiServiceEZpvd.searchPlate(str, this);
                    if (objSearchPlate == objCopydefault) {
                        return objCopydefault;
                    }
                    list2 = list;
                    obj = objSearchPlate;
                } catch (Throwable th2) {
                    list2 = list;
                    th = th2;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            }
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            while (r10.hasNext()) {
            }
            return arrayList;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.L$2;
            tradeGroupData = (TradeGroupData) this.L$1;
            list3 = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7377constructorimpl = obj2;
            list2 = list3;
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            List list4 = (List) objM7377constructorimpl;
            Objects.toString(list4);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                TradeGroupData tradeGroupData2 = (TradeGroupData) obj3;
                if (list4 != null) {
                    String id = tradeGroupData2.getId();
                    if (id == null) {
                        id = MultiTransferSignData.DEFAULT_INTERVAL;
                    }
                    if (list4.contains(id)) {
                        arrayList2.add(obj3);
                    }
                }
            }
            list = arrayList2;
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (TradeGroupData tradeGroupData3 : list) {
                arrayList3.add(C56390yDp.OLrzqt(C56443yFo.KWHzl(Intrinsics.EZpvd((Object) tradeGroupData3.getId(), (Object) (tradeGroupData != null ? tradeGroupData.getId() : null))), tradeGroupData3));
            }
            return arrayList3;
        }
        tradeGroupData = (TradeGroupData) this.L$1;
        list2 = (List) this.L$0;
        try {
            C56391yDq.AEQbTJ(obj);
        } catch (Throwable th3) {
            th = th3;
            Result.Application application22 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        ResponseData responseData = (ResponseData) obj;
        Objects.toString(responseData);
        SearchPlateResponse searchPlateResponse = (SearchPlateResponse) responseData.getData();
        objM7377constructorimpl = Result.m7377constructorimpl((searchPlateResponse == null || (plate = searchPlateResponse.getPlate()) == null) ? null : plate.getIds());
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            MainCoroutineDispatcher main = Dispatchers.getMain();
            ModuleChooseViewModel$stateFlow$2$1$result$ids$2$1 moduleChooseViewModel$stateFlow$2$1$result$ids$2$1 = new ModuleChooseViewModel$stateFlow$2$1$result$ids$2$1(thM7380exceptionOrNullimpl, null);
            this.L$0 = list2;
            this.L$1 = tradeGroupData;
            this.L$2 = objM7377constructorimpl;
            this.label = 2;
            if (BuildersKt.withContext(main, moduleChooseViewModel$stateFlow$2$1$result$ids$2$1, this) == objCopydefault) {
                return objCopydefault;
            }
            obj2 = objM7377constructorimpl;
            list3 = list2;
            objM7377constructorimpl = obj2;
            list2 = list3;
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        List list42 = (List) objM7377constructorimpl;
        Objects.toString(list42);
        ArrayList arrayList22 = new ArrayList();
        while (r2.hasNext()) {
        }
        list = arrayList22;
        ArrayList arrayList32 = new ArrayList(C56403yEb.AYXKKw(list, 10));
        while (r10.hasNext()) {
        }
        return arrayList32;
    }
}
