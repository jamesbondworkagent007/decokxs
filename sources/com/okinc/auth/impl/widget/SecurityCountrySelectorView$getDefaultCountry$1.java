package com.okinc.auth.impl.widget;

import com.okinc.ok_kyc_core_api.ComplianceCountryListService;
import com.okinc.ok_kyc_core_api.model.CountryBean;
import com.okinc.ok_kyc_core_api.model.CountryList;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C6695aUG;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityCountrySelectorView$getDefaultCountry$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C6695aUG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityCountrySelectorView$getDefaultCountry$1(C6695aUG c6695aUG, Continuation<? super SecurityCountrySelectorView$getDefaultCountry$1> continuation) {
        super(2, continuation);
        this.this$0 = c6695aUG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityCountrySelectorView$getDefaultCountry$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityCountrySelectorView$getDefaultCountry$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ComplianceCountryListService complianceCountryListService = (ComplianceCountryListService) C43251rlk.copydefault(ComplianceCountryListService.class);
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
        CountryList countryList = (CountryList) obj;
        this.this$0.EZpvd(countryList.getDefaultCountry());
        Collection<ArrayList<CountryBean.Country>> collectionValues = countryList.getAllCountries().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        boolean z = C56403yEb.QOLQEE(collectionValues).size() > 1;
        this.this$0.copydefault.copydefault.setEnabled(z);
        this.this$0.copydefault.copydefault.setClickable(z);
        if (!z) {
            this.this$0.copydefault.copydefault.setCompoundDrawablesRelative(null, null, null, null);
        }
        return Unit.INSTANCE;
    }
}
