package o;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.savedstate.SavedStateRegistryOwner;
import com.okinc.ok_kyc_core.presentation.countrylist.CountryListViewModel$onInputUpdated$1;
import com.okinc.ok_kyc_core.presentation.countrylist.CountryListViewModel$onPageLoaded$1;
import com.okinc.ok_kyc_core_api.ComplianceCountryListService;
import com.okinc.ok_kyc_core_api.model.CountryBean;
import com.okinc.ok_kyc_core_api.model.CountryList;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC42101rGj;
import o.C42095rGd;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rGd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42095rGd extends ViewModel {
    public final java.lang.String AYXKKw;
    public final ComplianceCountryListService.FunctionType AhwBna;
    public final ComplianceCountryListService EZpvd;
    public final java.lang.String KWHzl;
    public final MutableStateFlow<java.util.List<TaskDescription>> OLrzqt;
    public java.util.List<TaskDescription> copydefault;
    public final boolean djBIcL;
    public final boolean fetchVPNInfo;
    public final boolean gEmmrt;
    public final SavedStateHandle valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.util.List<TaskDescription> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ComplianceCountryListService.FunctionType copydefault() {
        return this.AhwBna;
    }

    public C42095rGd(@NotNull ComplianceCountryListService complianceCountryListService, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(complianceCountryListService, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = complianceCountryListService;
        this.valueOf = savedStateHandle;
        java.lang.Boolean bool = (java.lang.Boolean) savedStateHandle.get("ARG_SHOW_AREA_CODE");
        this.djBIcL = bool != null ? bool.booleanValue() : true;
        ComplianceCountryListService.FunctionType functionType = (ComplianceCountryListService.FunctionType) savedStateHandle.get("KEY_FUNCTION_TYPE");
        this.AhwBna = functionType == null ? ComplianceCountryListService.FunctionType.OKX_PHONE : functionType;
        java.lang.String str = (java.lang.String) savedStateHandle.get("ARG_COUNTRY_CODE");
        this.KWHzl = str != null ? str : "";
        java.lang.Boolean bool2 = (java.lang.Boolean) savedStateHandle.get("ARG_SHOW_COUNTRY_FLAG");
        this.gEmmrt = bool2 != null ? bool2.booleanValue() : false;
        java.lang.String str2 = (java.lang.String) savedStateHandle.get("ARG_SELECTED_COUNTRY_ID");
        this.AYXKKw = str2;
        this.fetchVPNInfo = str2 != null;
        this.OLrzqt = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.copydefault = new java.util.ArrayList();
    }

    public final StateFlow<java.util.List<TaskDescription>> KWHzl() {
        return FlowKt.asStateFlow(this.OLrzqt);
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CountryListViewModel$onPageLoaded$1(this, null), 3, null);
    }

    public final java.util.List<TaskDescription> AEQbTJ(CountryList countryList) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!countryList.getCommonCountries().isEmpty()) {
            arrayList.add(new TaskDescription.Activity(new AbstractC42101rGj.ActionBar(C43662rtX.Dialog.DCUTEIddSDPG, null, 2, null)));
            java.util.List<CountryBean.Country> commonCountries = countryList.getCommonCountries();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(commonCountries, 10));
            for (CountryBean.Country country : commonCountries) {
                arrayList2.add(new TaskDescription.C0927TaskDescription(country, true, Intrinsics.EZpvd((java.lang.Object) country.getId(), (java.lang.Object) this.AYXKKw)));
            }
            arrayList.addAll(arrayList2);
        }
        boolean z = true;
        for (Map.Entry<java.lang.String, java.util.ArrayList<CountryBean.Country>> entry : countryList.getAllCountries().entrySet()) {
            Intrinsics.checkNotNullExpressionValue(entry, "");
            Map.Entry<java.lang.String, java.util.ArrayList<CountryBean.Country>> entry2 = entry;
            if (z) {
                if (!countryList.getCommonCountries().isEmpty()) {
                    arrayList.add(TaskDescription.Application.KWHzl);
                }
                z = false;
            } else {
                arrayList.add(TaskDescription.Application.KWHzl);
            }
            arrayList.add(new TaskDescription.Activity(new AbstractC42101rGj.TaskDescription(entry2.getKey())));
            java.util.ArrayList<CountryBean.Country> value = entry2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            java.util.ArrayList<CountryBean.Country> arrayList3 = value;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
            for (CountryBean.Country country2 : arrayList3) {
                arrayList4.add(new TaskDescription.C0927TaskDescription(country2, false, Intrinsics.EZpvd((java.lang.Object) country2.getId(), (java.lang.Object) this.AYXKKw)));
            }
            arrayList.addAll(arrayList4);
        }
        return arrayList;
    }

    public final void copydefault(@NotNull final java.lang.String str) {
        java.util.List<TaskDescription> listZuBGHE;
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            listZuBGHE = this.copydefault;
        } else {
            Sequence sequenceDbNXlk = C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(this.copydefault), ActionBar.OLrzqt);
            Intrinsics.copydefault(sequenceDbNXlk, "");
            Sequence sequenceDbNXlk2 = C59467zhb.DbNXlk(sequenceDbNXlk, new Function1() { // from class: o.rGk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C42095rGd.copydefault(str, (C42095rGd.TaskDescription.C0927TaskDescription) obj));
                }
            });
            final Function2 function2 = new Function2() { // from class: o.rGi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return java.lang.Integer.valueOf(C42095rGd.KWHzl(str, (C42095rGd.TaskDescription.C0927TaskDescription) obj, (C42095rGd.TaskDescription.C0927TaskDescription) obj2));
                }
            };
            listZuBGHE = C59467zhb.zuBGHE(C59467zhb.KWHzl(sequenceDbNXlk2, new java.util.Comparator() { // from class: o.rGg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return C42095rGd.KWHzl(function2, obj, obj2);
                }
            }));
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CountryListViewModel$onInputUpdated$1(this, listZuBGHE, null), 3, null);
    }

    public static final boolean copydefault(java.lang.String str, TaskDescription.C0927TaskDescription c0927TaskDescription) {
        Intrinsics.checkNotNullParameter(c0927TaskDescription, "");
        return !c0927TaskDescription.EZpvd() && c0927TaskDescription.copydefault().isMatch(str);
    }

    public static final int KWHzl(java.lang.String str, TaskDescription.C0927TaskDescription c0927TaskDescription, TaskDescription.C0927TaskDescription c0927TaskDescription2) {
        return c0927TaskDescription.copydefault().sortingOrder(str, c0927TaskDescription2.copydefault());
    }

    public static final int KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: o.rGd$TaskDescription */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rGd.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.rGd$TaskDescription$Activity */
        public static final class Activity extends TaskDescription {
            public final AbstractC42101rGj EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, AbstractC42101rGj abstractC42101rGj, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    abstractC42101rGj = activity.EZpvd;
                }
                return activity.OLrzqt(abstractC42101rGj);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AbstractC42101rGj EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity OLrzqt(@NotNull AbstractC42101rGj abstractC42101rGj) {
                Intrinsics.checkNotNullParameter(abstractC42101rGj, "");
                return new Activity(abstractC42101rGj);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.EZpvd, ((Activity) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SectionHeader(title=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull AbstractC42101rGj abstractC42101rGj) {
                super(null);
                Intrinsics.checkNotNullParameter(abstractC42101rGj, "");
                this.EZpvd = abstractC42101rGj;
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: o.rGd$TaskDescription$Application */
        public static final class Application extends TaskDescription {
            public static final Application KWHzl = new Application();

            private Application() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.rGd$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0927TaskDescription extends TaskDescription {
            public static final int copydefault = CountryBean.Country.$stable;
            public final boolean AEQbTJ;
            public final CountryBean.Country EZpvd;
            public final boolean KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0927TaskDescription copy$default(C0927TaskDescription c0927TaskDescription, CountryBean.Country country, boolean z, boolean z2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    country = c0927TaskDescription.EZpvd;
                }
                if ((i & 2) != 0) {
                    z = c0927TaskDescription.AEQbTJ;
                }
                if ((i & 4) != 0) {
                    z2 = c0927TaskDescription.KWHzl;
                }
                return c0927TaskDescription.AEQbTJ(country, z, z2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0927TaskDescription AEQbTJ(@NotNull CountryBean.Country country, boolean z, boolean z2) {
                Intrinsics.checkNotNullParameter(country, "");
                return new C0927TaskDescription(country, z, z2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CountryBean.Country copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0927TaskDescription)) {
                    return false;
                }
                C0927TaskDescription c0927TaskDescription = (C0927TaskDescription) obj;
                return Intrinsics.EZpvd(this.EZpvd, c0927TaskDescription.EZpvd) && this.AEQbTJ == c0927TaskDescription.AEQbTJ && this.KWHzl == c0927TaskDescription.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Country(country=" + this.EZpvd + ", isCommon=" + this.AEQbTJ + ", isSelected=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0927TaskDescription(@NotNull CountryBean.Country country, boolean z, boolean z2) {
                super(null);
                Intrinsics.checkNotNullParameter(country, "");
                this.EZpvd = country;
                this.AEQbTJ = z;
                this.KWHzl = z2;
            }
        }
    }

    /* JADX INFO: renamed from: o.rGd$Activity */
    public static final class Activity extends AbstractSavedStateViewModelFactory {
        public final ComplianceCountryListService AEQbTJ;
        public final android.os.Bundle EZpvd;
        public final SavedStateRegistryOwner KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ComplianceCountryListService complianceCountryListService, @NotNull SavedStateRegistryOwner savedStateRegistryOwner, android.os.Bundle bundle) {
            super(savedStateRegistryOwner, bundle);
            Intrinsics.checkNotNullParameter(complianceCountryListService, "");
            Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
            this.AEQbTJ = complianceCountryListService;
            this.KWHzl = savedStateRegistryOwner;
            this.EZpvd = bundle;
        }

        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        public <T extends ViewModel> T create(@NotNull java.lang.String str, @NotNull java.lang.Class<T> cls, @NotNull SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(savedStateHandle, "");
            return new C42095rGd(this.AEQbTJ, savedStateHandle);
        }
    }

    /* JADX INFO: renamed from: o.rGd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rGd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.rGd$ActionBar */
    public static final class ActionBar implements Function1<java.lang.Object, java.lang.Boolean> {
        public static final ActionBar OLrzqt = new ActionBar();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(obj instanceof TaskDescription.C0927TaskDescription);
        }
    }
}
