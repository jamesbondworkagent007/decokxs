package com.okinc.ok_kyc_core.presentation.countrylist;

import com.okinc.ok_kyc_core_api.ComplianceCountryListService;
import com.okinc.ok_kyc_core_api.model.CountryList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C33129mqd;
import o.C42095rGd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class CountryListViewModel$onPageLoaded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C42095rGd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryListViewModel$onPageLoaded$1(C42095rGd c42095rGd, Continuation<? super CountryListViewModel$onPageLoaded$1> continuation) {
        super(2, continuation);
        this.this$0 = c42095rGd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CountryListViewModel$onPageLoaded$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CountryListViewModel$onPageLoaded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CountryList countryList;
        List list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception unused) {
            countryList = new CountryList(null, null, null, 7, null);
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (C33129mqd.OLrzqt((CharSequence) this.this$0.OLrzqt())) {
                ComplianceCountryListService complianceCountryListService = this.this$0.EZpvd;
                String strOLrzqt = this.this$0.OLrzqt();
                this.label = 1;
                obj = complianceCountryListService.copydefault(strOLrzqt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                countryList = (CountryList) obj;
            } else {
                ComplianceCountryListService complianceCountryListService2 = this.this$0.EZpvd;
                ComplianceCountryListService.FunctionType functionTypeCopydefault = this.this$0.copydefault();
                this.label = 2;
                obj = complianceCountryListService2.OLrzqt(functionTypeCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                countryList = (CountryList) obj;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            countryList = (CountryList) obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.this$0.KWHzl(CollectionsKt___CollectionsKt.fJNWhG((Collection) list));
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            countryList = (CountryList) obj;
        }
        List listAEQbTJ = this.this$0.AEQbTJ(countryList);
        MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
        this.L$0 = listAEQbTJ;
        this.label = 3;
        if (mutableStateFlow.emit(listAEQbTJ, this) == objCopydefault) {
            return objCopydefault;
        }
        list = listAEQbTJ;
        this.this$0.KWHzl(CollectionsKt___CollectionsKt.fJNWhG((Collection) list));
        return Unit.INSTANCE;
    }
}
