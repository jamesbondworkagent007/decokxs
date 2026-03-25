package com.okinc.ok_kyc_core.impl;

import com.okinc.ok_kyc_core_api.ComplianceCountryListService;
import com.okinc.ok_kyc_core_api.model.CountryList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import o.C56391yDq;
import o.C56442yFn;
import o.rCT;

/* JADX INFO: loaded from: classes10.dex */
public final class CountryListServiceDeprecatedImpl$countryList$1 extends SuspendLambda implements Function2<ProducerScope<? super CountryList>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ComplianceCountryListService.FunctionType $functionType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ rCT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryListServiceDeprecatedImpl$countryList$1(rCT rct, ComplianceCountryListService.FunctionType functionType, Continuation<? super CountryListServiceDeprecatedImpl$countryList$1> continuation) {
        super(2, continuation);
        this.this$0 = rct;
        this.$functionType = functionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CountryListServiceDeprecatedImpl$countryList$1 countryListServiceDeprecatedImpl$countryList$1 = new CountryListServiceDeprecatedImpl$countryList$1(this.this$0, this.$functionType, continuation);
        countryListServiceDeprecatedImpl$countryList$1.L$0 = obj;
        return countryListServiceDeprecatedImpl$countryList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super CountryList> producerScope, Continuation<? super Unit> continuation) {
        return ((CountryListServiceDeprecatedImpl$countryList$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProducerScope producerScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            producerScope = (ProducerScope) this.L$0;
            ComplianceCountryListService complianceCountryListService = this.this$0.AEQbTJ;
            ComplianceCountryListService.FunctionType functionType = this.$functionType;
            this.L$0 = producerScope;
            this.label = 1;
            obj = complianceCountryListService.OLrzqt(functionType, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (producerScope.send((CountryList) obj, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
