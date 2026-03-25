package com.okinc.ok_kyc_core_api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.ok_kyc_core_api.ComplianceCountryListService;
import com.okinc.ok_kyc_core_api.model.CountryBean;
import com.okinc.ok_kyc_core_api.model.CountryList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC43217rlC;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface ComplianceCountryListService extends InterfaceC43217rlC {
    Object AEQbTJ(@NotNull FunctionType functionType, @NotNull Continuation<? super CountryBean.Country> continuation);

    void AEQbTJ(@NotNull FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull FunctionType functionType, String str, Boolean bool, @NotNull Function1<? super CountryBean.Country, Unit> function1);

    void KWHzl(@NotNull FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull String str, String str2, @NotNull Function1<? super CountryBean.Country, Unit> function1);

    Object OLrzqt(@NotNull FunctionType functionType, @NotNull Continuation<? super CountryList> continuation);

    Object copydefault(@NotNull String str, @NotNull Continuation<? super CountryList> continuation);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class FunctionType implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ FunctionType[] $VALUES;
        public static final Parcelable.Creator<FunctionType> CREATOR;
        private final int value;
        public static final FunctionType DEFAULT = new FunctionType("DEFAULT", 0, 0);
        public static final FunctionType KYC_RESTRICTED_TAG = new FunctionType("KYC_RESTRICTED_TAG", 1, 1);
        public static final FunctionType OKX_PHONE = new FunctionType("OKX_PHONE", 2, 2);
        public static final FunctionType OKCOIN_PHONE = new FunctionType("OKCOIN_PHONE", 3, 3);
        public static final FunctionType REGISTRATION_LIST = new FunctionType("REGISTRATION_LIST", 4, 4);
        public static final FunctionType KYC_OPENLIST = new FunctionType("KYC_OPENLIST", 5, 5);
        public static final FunctionType OKX_PHONE_EXISTING = new FunctionType("OKX_PHONE_EXISTING", 6, 6);

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Creator implements Parcelable.Creator<FunctionType> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FunctionType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return FunctionType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FunctionType[] newArray(int i) {
                return new FunctionType[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ FunctionType[] $values() {
            return new FunctionType[]{DEFAULT, KYC_RESTRICTED_TAG, OKX_PHONE, OKCOIN_PHONE, REGISTRATION_LIST, KYC_OPENLIST, OKX_PHONE_EXISTING};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<FunctionType> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private FunctionType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            FunctionType[] functionTypeArr$values = $values();
            $VALUES = functionTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(functionTypeArr$values);
            CREATOR = new Creator();
        }

        public static FunctionType valueOf(String str) {
            return (FunctionType) Enum.valueOf(FunctionType.class, str);
        }

        public static FunctionType[] values() {
            return (FunctionType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.okinc.ok_kyc_core_api.ComplianceCountryListService */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showCountryListPage$default(ComplianceCountryListService complianceCountryListService, FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, FunctionType functionType, String str, Boolean bool, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showCountryListPage");
            }
            if ((i & 4) != 0) {
                functionType = FunctionType.OKX_PHONE;
            }
            FunctionType functionType2 = functionType;
            if ((i & 8) != 0) {
                str = null;
            }
            String str2 = str;
            if ((i & 16) != 0) {
                bool = Boolean.FALSE;
            }
            Boolean bool2 = bool;
            if ((i & 32) != 0) {
                function1 = new Function1() { // from class: o.rTS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ComplianceCountryListService.StateListAnimator.AEQbTJ((CountryBean.Country) obj2);
                    }
                };
            }
            complianceCountryListService.AEQbTJ(fragmentManager, lifecycleOwner, functionType2, str2, bool2, function1);
        }

        public static Unit AEQbTJ(CountryBean.Country country) {
            Intrinsics.checkNotNullParameter(country, "");
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void showProvinceListPageVCWithCountryCode$default(ComplianceCountryListService complianceCountryListService, FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, String str, String str2, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showProvinceListPageVCWithCountryCode");
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            complianceCountryListService.KWHzl(fragmentManager, lifecycleOwner, str, str2, function1);
        }
    }
}
