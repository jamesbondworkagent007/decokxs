package com.okinc.ok_kyc_core.impl;

import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core_api.ComplianceCountryListService;
import com.okinc.ok_kyc_core_api.model.CountryBean;
import java.util.ArrayList;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43703ruL;

/* JADX INFO: loaded from: classes10.dex */
public final class ComplianceCountryListServiceImpl$defaultCountry$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CountryBean.Country>, Object> {
    final /* synthetic */ ComplianceCountryListService.FunctionType $functionType;
    int label;
    final /* synthetic */ ComplianceCountryListServiceImpl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplianceCountryListServiceImpl$defaultCountry$2(ComplianceCountryListServiceImpl complianceCountryListServiceImpl, ComplianceCountryListService.FunctionType functionType, Continuation<? super ComplianceCountryListServiceImpl$defaultCountry$2> continuation) {
        super(2, continuation);
        this.this$0 = complianceCountryListServiceImpl;
        this.$functionType = functionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ComplianceCountryListServiceImpl$defaultCountry$2(this.this$0, this.$functionType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CountryBean.Country> continuation) {
        return ((ComplianceCountryListServiceImpl$defaultCountry$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC43703ruL interfaceC43703ruL = this.this$0.AEQbTJ;
                int value = this.$functionType.getValue();
                this.label = 1;
                obj = interfaceC43703ruL.copydefault("FIRST_NETWORK", IMarketApiService.SIXTY_MINUTES, 0, value, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ComplianceCountryListServiceImpl complianceCountryListServiceImpl = this.this$0;
            Object data = ((ResponseData) obj).getData();
            Intrinsics.copydefault(data);
            return complianceCountryListServiceImpl.OLrzqt((TreeMap<String, ArrayList<CountryBean.Country>>) data);
        } catch (Exception unused) {
            return this.this$0.KWHzl();
        }
    }
}
