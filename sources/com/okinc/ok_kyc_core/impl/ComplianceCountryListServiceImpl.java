package com.okinc.ok_kyc_core.impl;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.ok_kyc_core.impl.ComplianceCountryListServiceImpl;
import com.okinc.ok_kyc_core_api.ComplianceCountryListService;
import com.okinc.ok_kyc_core_api.model.CountryBean;
import com.okinc.ok_kyc_core_api.model.CountryList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43215rlA;
import o.C38303pTu;
import o.C42461rTs;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC43703ruL;
import o.rFY;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ComplianceCountryListServiceImpl extends AbstractC43215rlA implements ComplianceCountryListService {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final InterfaceC43703ruL AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    @yCM
    public ComplianceCountryListServiceImpl(@NotNull InterfaceC43703ruL interfaceC43703ruL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC43703ruL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC43703ruL;
        this.EZpvd = coroutineDispatcher;
    }

    @Override // com.okinc.ok_kyc_core_api.ComplianceCountryListService
    public Object AEQbTJ(@NotNull ComplianceCountryListService.FunctionType functionType, @NotNull Continuation<? super CountryBean.Country> continuation) {
        return BuildersKt.withContext(this.EZpvd, new ComplianceCountryListServiceImpl$defaultCountry$2(this, functionType, null), continuation);
    }

    @Override // com.okinc.ok_kyc_core_api.ComplianceCountryListService
    public Object OLrzqt(@NotNull ComplianceCountryListService.FunctionType functionType, @NotNull Continuation<? super CountryList> continuation) {
        return BuildersKt.withContext(this.EZpvd, new ComplianceCountryListServiceImpl$countryList$2(this, functionType, null), continuation);
    }

    @Override // com.okinc.ok_kyc_core_api.ComplianceCountryListService
    public Object copydefault(@NotNull String str, @NotNull Continuation<? super CountryList> continuation) {
        return BuildersKt.withContext(this.EZpvd, new ComplianceCountryListServiceImpl$getProvinceList$2(this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OLrzqt(@NotNull String str, @NotNull Continuation<? super CountryBean.Country> continuation) throws Throwable {
        ComplianceCountryListServiceImpl$countryById$1 complianceCountryListServiceImpl$countryById$1;
        if (continuation instanceof ComplianceCountryListServiceImpl$countryById$1) {
            complianceCountryListServiceImpl$countryById$1 = (ComplianceCountryListServiceImpl$countryById$1) continuation;
            int i = complianceCountryListServiceImpl$countryById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                complianceCountryListServiceImpl$countryById$1.label = i - Integer.MIN_VALUE;
            } else {
                complianceCountryListServiceImpl$countryById$1 = new ComplianceCountryListServiceImpl$countryById$1(this, continuation);
            }
        }
        Object objOLrzqt = complianceCountryListServiceImpl$countryById$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = complianceCountryListServiceImpl$countryById$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            ComplianceCountryListService.FunctionType functionType = ComplianceCountryListService.FunctionType.OKX_PHONE;
            complianceCountryListServiceImpl$countryById$1.L$0 = str;
            complianceCountryListServiceImpl$countryById$1.label = 1;
            objOLrzqt = OLrzqt(functionType, complianceCountryListServiceImpl$countryById$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) complianceCountryListServiceImpl$countryById$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        Collection<ArrayList<CountryBean.Country>> collectionValues = ((CountryList) objOLrzqt).getAllCountries().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        for (Object obj : C56403yEb.QOLQEE(collectionValues)) {
            if (Intrinsics.EZpvd((Object) ((CountryBean.Country) obj).getId(), (Object) str)) {
                return obj;
            }
        }
        return null;
    }

    @Override // com.okinc.ok_kyc_core_api.ComplianceCountryListService
    public void AEQbTJ(@NotNull FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull ComplianceCountryListService.FunctionType functionType, String str, Boolean bool, @NotNull final Function1<? super CountryBean.Country, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(functionType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        rFY rfyNewInstance$default = rFY.TaskDescription.newInstance$default(rFY.Companion, false, functionType, str, null, bool, 9, null);
        rfyNewInstance$default.AEQbTJ(fragmentManager, lifecycleOwner, new Function1() { // from class: o.rCO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ComplianceCountryListServiceImpl.copydefault(function1, (CountryBean.Country) obj);
            }
        });
        try {
            rfyNewInstance$default.show(fragmentManager);
        } catch (IllegalStateException unused) {
        }
    }

    public static final Unit copydefault(Function1 function1, CountryBean.Country country) {
        Intrinsics.checkNotNullParameter(country, "");
        function1.invoke(country);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.ok_kyc_core_api.ComplianceCountryListService
    public void KWHzl(@NotNull FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull String str, String str2, @NotNull final Function1<? super CountryBean.Country, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        rFY rfyNewInstance$default = rFY.TaskDescription.newInstance$default(rFY.Companion, false, null, str2, str, null, 18, null);
        rfyNewInstance$default.AEQbTJ(fragmentManager, lifecycleOwner, new Function1() { // from class: o.rCP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ComplianceCountryListServiceImpl.OLrzqt(function1, (CountryBean.Country) obj);
            }
        });
        try {
            rfyNewInstance$default.show(fragmentManager);
        } catch (IllegalStateException unused) {
        }
    }

    public static final Unit OLrzqt(Function1 function1, CountryBean.Country country) {
        Intrinsics.checkNotNullParameter(country, "");
        function1.invoke(country);
        return Unit.INSTANCE;
    }

    public final CountryBean.Country OLrzqt(TreeMap<String, ArrayList<CountryBean.Country>> treeMap) {
        CountryBean.Country country;
        ArrayList<CountryBean.Country> arrayList = treeMap.get("default");
        return (arrayList == null || (country = (CountryBean.Country) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null) ? KWHzl() : country;
    }

    public final CountryBean.Country KWHzl() {
        CountryBean.Country country = new CountryBean.Country();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        boolean zOLrzqt = C38303pTu.OLrzqt(locale);
        country.setId(zOLrzqt ? "CN" : "GB");
        country.setTelephoneCode(zOLrzqt ? "86" : "44");
        country.setNationalFlag(C42461rTs.OLrzqt.AEQbTJ(country.getId()));
        return country;
    }

    public final CountryList copydefault(TreeMap<String, ArrayList<CountryBean.Country>> treeMap) {
        TreeMap treeMap2 = new TreeMap();
        ArrayList arrayList = new ArrayList();
        CountryBean.Country countryKWHzl = KWHzl();
        for (Map.Entry<String, ArrayList<CountryBean.Country>> entry : treeMap.entrySet()) {
            Intrinsics.checkNotNullExpressionValue(entry, "");
            Map.Entry<String, ArrayList<CountryBean.Country>> entry2 = entry;
            if (Intrinsics.EZpvd((Object) entry2.getKey(), (Object) "default")) {
                ArrayList<CountryBean.Country> value = entry2.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                countryKWHzl = (CountryBean.Country) CollectionsKt___CollectionsKt.firstOrNull(value);
                if (countryKWHzl == null) {
                    countryKWHzl = KWHzl();
                }
            } else if (Intrinsics.EZpvd((Object) entry2.getKey(), (Object) "commonCountries")) {
                ArrayList<CountryBean.Country> value2 = entry2.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                arrayList.addAll(value2);
            } else {
                treeMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return new CountryList(treeMap2, arrayList, countryKWHzl);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.impl.ComplianceCountryListServiceImpl.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final class Module {
        public static final Module EZpvd = new Module();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ComplianceCountryListService copydefault(@NotNull ComplianceCountryListServiceImpl complianceCountryListServiceImpl) {
            Intrinsics.checkNotNullParameter(complianceCountryListServiceImpl, "");
            return complianceCountryListServiceImpl;
        }

        private Module() {
        }
    }
}
