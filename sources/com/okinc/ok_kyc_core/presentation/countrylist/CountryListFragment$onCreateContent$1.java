package com.okinc.ok_kyc_core.presentation.countrylist;

import com.okinc.ok_kyc_core_api.model.CountryBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.rFY;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class CountryListFragment$onCreateContent$1 extends FunctionReferenceImpl implements Function1<CountryBean.Country, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CountryListFragment$onCreateContent$1(Object obj) {
        super(1, obj, rFY.class, "onCountrySelected", "onCountrySelected(Lcom/okinc/ok_kyc_core_api/model/CountryBean$Country;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CountryBean.Country country) {
        invoke2(country);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CountryBean.Country country) {
        Intrinsics.checkNotNullParameter(country, "");
        ((rFY) this.receiver).EZpvd(country);
    }
}
