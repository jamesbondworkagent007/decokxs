package com.okinc.im.imui.relationlist.viewmodel.addcontact;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.relationlist.model.AddContactOption;
import com.okinc.im.imui.relationlist.model.ReferralData;
import com.okinc.im.imui.relationlist.viewmodel.addcontact.AddContactViewModel;
import com.okinc.ok_kyc_core_api.ComplianceCountryListService;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C32989mnw;
import o.C35856oGf;
import o.C56392yDr;
import o.C59449zhJ;
import o.C6982aZe;
import o.InterfaceC56387yDm;
import o.oFR;
import o.oFU;
import o.oFY;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes8.dex */
public final class AddContactViewModel extends ViewModel {
    public final MutableLiveData<C32989mnw<ReferralData>> AYXKKw;
    public final MutableLiveData<Boolean> AhwBna;
    public final C35856oGf AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final SharedFlow<TaskDescription> DbNXlk;
    public final MutableLiveData<C32989mnw<Pair<String, String>>> EZpvd;
    public final MutableLiveData<Boolean> KWHzl;
    public final MutableLiveData<Boolean> OLrzqt;
    public final MutableLiveData<String> copydefault;
    public final MutableSharedFlow<TaskDescription> djBIcL;
    public AddContactOption ejfBZ;
    public final oFY fARcdN;
    public final oFU fIwbmz;
    public final oFR fJNWhG;
    public final ComplianceCountryListService fetchVPNInfo;
    public final MutableLiveData<Boolean> gEmmrt;
    public final LiveData<String> isConnected;
    public final MutableLiveData<Boolean> valueOf;
    public final MutableLiveData<C32989mnw<String>> values;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AddContactOption.values().length];
            try {
                iArr[AddContactOption.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddContactOption.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddContactOption.UID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<ReferralData>> AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AkhnZx() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> DbNXlk() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Pair<String, String>>> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> copydefault() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> fetchVPNInfo() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<TaskDescription> gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> isConnected() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> values() {
        return this.AhwBna;
    }

    @yCM
    public AddContactViewModel(@NotNull ComplianceCountryListService complianceCountryListService, @NotNull oFY ofy, @NotNull oFR ofr, @NotNull oFU ofu, @NotNull C35856oGf c35856oGf) {
        Intrinsics.checkNotNullParameter(complianceCountryListService, "");
        Intrinsics.checkNotNullParameter(ofy, "");
        Intrinsics.checkNotNullParameter(ofr, "");
        Intrinsics.checkNotNullParameter(ofu, "");
        Intrinsics.checkNotNullParameter(c35856oGf, "");
        this.fetchVPNInfo = complianceCountryListService;
        this.fARcdN = ofy;
        this.fJNWhG = ofr;
        this.fIwbmz = ofu;
        this.AkhnZx = c35856oGf;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.isConnected = Transformations.map(mutableLiveData, new Function1() { // from class: o.otv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AddContactViewModel.copydefault((java.lang.String) obj);
            }
        });
        this.KWHzl = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>(Boolean.TRUE);
        this.OLrzqt = new MutableLiveData<>();
        this.valueOf = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        MutableSharedFlow<TaskDescription> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.otA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AddContactViewModel.AEQbTJ();
            }
        });
        this.ejfBZ = AddContactOption.PHONE;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.relationlist.viewmodel.addcontact.AddContactViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final String copydefault(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        return Marker.ANY_NON_NULL_MARKER + str;
    }

    public final List<AddContactOption> valueOf() {
        return (List) this.AuCTel.getValue();
    }

    public static final List AEQbTJ() {
        return yDY.AhwBna(AddContactOption.PHONE, AddContactOption.EMAIL, AddContactOption.UID);
    }

    public final void djBIcL() {
        KWHzl();
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AddContactViewModel$getDefaultCountryCode$1(this, null), 3, null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            this.copydefault.setValue(C59449zhJ.replace$default(str, Marker.ANY_NON_NULL_MARKER, "", false, 4, (Object) null));
        }
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AddContactViewModel$searchContact$1(this, str, str2, str3, str4, null), 3, null);
    }

    public final void AEQbTJ(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AddContactViewModel$fetchReferralData$1(this, str, null), 3, null);
    }

    public final void OLrzqt(@NotNull AddContactOption addContactOption) {
        Intrinsics.checkNotNullParameter(addContactOption, "");
        this.ejfBZ = addContactOption;
        int i = Activity.EZpvd[addContactOption.ordinal()];
        if (i == 1) {
            this.gEmmrt.setValue(Boolean.TRUE);
            MutableLiveData<Boolean> mutableLiveData = this.OLrzqt;
            Boolean bool = Boolean.FALSE;
            mutableLiveData.setValue(bool);
            this.valueOf.setValue(bool);
            return;
        }
        if (i == 2) {
            MutableLiveData<Boolean> mutableLiveData2 = this.gEmmrt;
            Boolean bool2 = Boolean.FALSE;
            mutableLiveData2.setValue(bool2);
            this.OLrzqt.setValue(Boolean.TRUE);
            this.valueOf.setValue(bool2);
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        MutableLiveData<Boolean> mutableLiveData3 = this.gEmmrt;
        Boolean bool3 = Boolean.FALSE;
        mutableLiveData3.setValue(bool3);
        this.OLrzqt.setValue(bool3);
        this.valueOf.setValue(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull CharSequence charSequence, @NotNull AddContactOption addContactOption) {
        String value;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(addContactOption, "");
        MutableLiveData<Boolean> mutableLiveData = this.AhwBna;
        int i = Activity.EZpvd[addContactOption.ordinal()];
        boolean zKWHzl = true;
        if (i != 1) {
            if (i == 2) {
                zKWHzl = C6982aZe.KWHzl(charSequence.toString());
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (charSequence.length() < 16) {
                    zKWHzl = false;
                }
            }
        } else if (charSequence.length() < 5 || (value = this.copydefault.getValue()) == null || !TextUtils.isDigitsOnly(value)) {
        }
        mutableLiveData.setValue(Boolean.valueOf(zKWHzl));
    }

    public final void fJNWhG() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AddContactViewModel$onScanQrCodeButtonClicked$1(this, null), 3, null);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface TaskDescription {

        /* JADX INFO: renamed from: com.okinc.im.imui.relationlist.viewmodel.addcontact.AddContactViewModel$TaskDescription$TaskDescription, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class C0474TaskDescription implements TaskDescription {
            public static final C0474TaskDescription AEQbTJ = new C0474TaskDescription();

            private C0474TaskDescription() {
            }
        }
    }
}
