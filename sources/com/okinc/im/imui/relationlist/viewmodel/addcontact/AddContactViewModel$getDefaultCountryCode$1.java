package com.okinc.im.imui.relationlist.viewmodel.addcontact;

import com.okinc.ok_kyc_core_api.ComplianceCountryListService;
import com.okinc.ok_kyc_core_api.model.CountryBean;
import com.okinc.ok_kyc_core_api.model.CountryList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class AddContactViewModel$getDefaultCountryCode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AddContactViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddContactViewModel$getDefaultCountryCode$1(AddContactViewModel addContactViewModel, Continuation<? super AddContactViewModel$getDefaultCountryCode$1> continuation) {
        super(2, continuation);
        this.this$0 = addContactViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddContactViewModel$getDefaultCountryCode$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddContactViewModel$getDefaultCountryCode$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ComplianceCountryListService complianceCountryListService = this.this$0.fetchVPNInfo;
            ComplianceCountryListService.FunctionType functionType = ComplianceCountryListService.FunctionType.OKX_PHONE;
            this.label = 1;
            obj = complianceCountryListService.OLrzqt(functionType, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        CountryBean.Country defaultCountry = ((CountryList) obj).getDefaultCountry();
        if (!Intrinsics.EZpvd((Object) this.this$0.copydefault.getValue(), (Object) defaultCountry.getTelephoneCode()) && !defaultCountry.getDisablePrefill()) {
            this.this$0.copydefault.setValue(defaultCountry.getTelephoneCode());
        }
        return Unit.INSTANCE;
    }
}
