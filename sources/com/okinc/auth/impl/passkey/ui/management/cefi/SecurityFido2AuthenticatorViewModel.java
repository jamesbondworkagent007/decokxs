package com.okinc.auth.impl.passkey.ui.management.cefi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import com.okinc.auth.impl.passkey.model.ButtonType;
import com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C32866mlf;
import o.C32868mlh;
import o.C32989mnw;
import o.C56392yDr;
import o.C5763aCc;
import o.C5765aCe;
import o.C5915aFV;
import o.C5916aFW;
import o.C5973aGa;
import o.C5974aGb;
import o.C5977aGe;
import o.InterfaceC47278tmy;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC8196ayF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2AuthenticatorViewModel extends AbstractC33073mpa {
    public final MutableLiveData<Boolean> AYXKKw;
    public final MutableLiveData<Boolean> AhwBna;
    public final MutableLiveData<Boolean> AkhnZx;
    public final MutableLiveData<Unit> AuCTel;
    public final C5765aCe AuCTelauCTel;
    public final LiveData<Boolean> AubY;
    public final C5977aGe AwvSrB;
    public final SavedStateHandle AxsJAY;
    public final LiveData<Unit> DTwDnp;
    public final MutableLiveData<Boolean> DbNXlk;
    public final MutableLiveData<C32989mnw<StateListAnimator>> EZpvd;
    public final MutableLiveData<Boolean> KWHzl;
    public final MutableLiveData<List<AuthenticatorDisplayModel>> OLrzqt;
    public final LiveData<Unit> ORxRYg;
    public final MediatorLiveData<Boolean> OcIXYQ;
    public final MediatorLiveData<Boolean> QKVWgx;
    public final LiveData<Boolean> QOLQEE;
    public final InterfaceC47278tmy QUSxYX;
    public final MutableLiveData<Boolean> copydefault;
    public final MutableLiveData<Boolean> djBIcL;
    public final LiveData<List<AuthenticatorDisplayModel>> ejfBZ;
    public final InterfaceC8196ayF fARcdN;
    public final MutableLiveData<String> fIwbmz;
    public final MutableLiveData<Unit> fJNWhG;
    public final MutableLiveData<Unit> fetchVPNInfo;
    public final MutableSharedFlow<Boolean> gEmmrt;
    public final C5916aFW gHZMYf;
    public final SharedFlow<Boolean> getFieldNames;
    public final MediatorLiveData<Boolean> getNewProxyInstance;
    public final InterfaceC56387yDm hDKMBd;
    public final MutableLiveData<Unit> isConnected;
    public final LiveData<Boolean> iwGUEr;
    public final C5915aFV sSMYrx;
    public final C5763aCc uzCIH;
    public final MutableLiveData<Boolean> valueOf;
    public final MutableLiveData<Boolean> values;
    public final LiveData<Unit> wlaJM;
    public final LiveData<Unit> zLjUOn;
    public final C5973aGa zsXlph;
    public final C5974aGb zuBGHE;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediatorLiveData<Boolean> AYXKKw() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Unit> AhwBna() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Unit> AuCTel() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> DbNXlk() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<StateListAnimator>> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> ejfBZ() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> fIwbmz() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediatorLiveData<Boolean> fetchVPNInfo() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> getFieldNames() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Unit> isConnected() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediatorLiveData<Boolean> iwGUEr() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> uzCIH() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<AuthenticatorDisplayModel>> valueOf() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> values() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Unit> wlaJM() {
        return this.wlaJM;
    }

    @yCM
    public SecurityFido2AuthenticatorViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C5973aGa c5973aGa, @NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull C5765aCe c5765aCe, @NotNull C5763aCc c5763aCc, @NotNull C5916aFW c5916aFW, @NotNull C5915aFV c5915aFV, @NotNull C5977aGe c5977aGe, @NotNull C5974aGb c5974aGb, @NotNull InterfaceC8196ayF interfaceC8196ayF) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c5973aGa, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(c5765aCe, "");
        Intrinsics.checkNotNullParameter(c5763aCc, "");
        Intrinsics.checkNotNullParameter(c5916aFW, "");
        Intrinsics.checkNotNullParameter(c5915aFV, "");
        Intrinsics.checkNotNullParameter(c5977aGe, "");
        Intrinsics.checkNotNullParameter(c5974aGb, "");
        Intrinsics.checkNotNullParameter(interfaceC8196ayF, "");
        this.AxsJAY = savedStateHandle;
        this.zsXlph = c5973aGa;
        this.QUSxYX = interfaceC47278tmy;
        this.AuCTelauCTel = c5765aCe;
        this.uzCIH = c5763aCc;
        this.gHZMYf = c5916aFW;
        this.sSMYrx = c5915aFV;
        this.AwvSrB = c5977aGe;
        this.zuBGHE = c5974aGb;
        this.fARcdN = interfaceC8196ayF;
        this.hDKMBd = C56392yDr.copydefault(new Function0() { // from class: o.aKE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(SecurityFido2AuthenticatorViewModel.sSMYrx(this.AEQbTJ));
            }
        });
        this.EZpvd = new MutableLiveData<>();
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableLiveData<List<AuthenticatorDisplayModel>> mutableLiveData = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData;
        this.ejfBZ = mutableLiveData;
        this.QOLQEE = Transformations.map(mutableLiveData, new Function1() { // from class: o.aKC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SecurityFido2AuthenticatorViewModel.copydefault((java.util.List) obj));
            }
        });
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.AhwBna = mutableLiveData2;
        this.AYXKKw = new MutableLiveData<>(bool);
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>(bool);
        this.AkhnZx = mutableLiveData3;
        this.DbNXlk = new MutableLiveData<>(bool);
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>(bool);
        this.valueOf = mutableLiveData4;
        this.iwGUEr = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>(bool);
        this.values = mutableLiveData5;
        this.AubY = mutableLiveData5;
        MutableLiveData<Unit> mutableLiveData6 = new MutableLiveData<>(Unit.INSTANCE);
        this.isConnected = mutableLiveData6;
        this.wlaJM = mutableLiveData6;
        this.fIwbmz = new MutableLiveData<>("");
        final MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
        mediatorLiveData.addSource(mutableLiveData3, new Activity(new Function1() { // from class: o.aKD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorViewModel.KWHzl(mediatorLiveData, this, (java.lang.Boolean) obj);
            }
        }));
        mediatorLiveData.addSource(mutableLiveData, new Activity(new Function1() { // from class: o.aKK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorViewModel.EZpvd(mediatorLiveData, this, (java.util.List) obj);
            }
        }));
        this.getNewProxyInstance = mediatorLiveData;
        final MediatorLiveData<Boolean> mediatorLiveData2 = new MediatorLiveData<>();
        mediatorLiveData2.addSource(mutableLiveData2, new Activity(new Function1() { // from class: o.aKG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorViewModel.valueOf(mediatorLiveData2, this, (java.lang.Boolean) obj);
            }
        }));
        mediatorLiveData2.addSource(mutableLiveData, new Activity(new Function1() { // from class: o.aKJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorViewModel.AhwBna(mediatorLiveData2, this, (java.util.List) obj);
            }
        }));
        this.QKVWgx = mediatorLiveData2;
        final MediatorLiveData<Boolean> mediatorLiveData3 = new MediatorLiveData<>();
        mediatorLiveData3.addSource(mutableLiveData2, new Activity(new Function1() { // from class: o.aKH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorViewModel.copydefault(mediatorLiveData3, this, (java.lang.Boolean) obj);
            }
        }));
        mediatorLiveData3.addSource(mutableLiveData, new Activity(new Function1() { // from class: o.aKI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorViewModel.KWHzl(mediatorLiveData3, this, (java.util.List) obj);
            }
        }));
        this.OcIXYQ = mediatorLiveData3;
        this.djBIcL = new MutableLiveData<>(Boolean.TRUE);
        this.copydefault = new MutableLiveData<>(bool);
        this.KWHzl = new MutableLiveData<>(bool);
        MutableLiveData<Unit> mutableLiveData7 = new MutableLiveData<>();
        this.fJNWhG = mutableLiveData7;
        this.DTwDnp = mutableLiveData7;
        MutableLiveData<Unit> mutableLiveData8 = new MutableLiveData<>();
        this.AuCTel = mutableLiveData8;
        this.ORxRYg = mutableLiveData8;
        MutableLiveData<Unit> mutableLiveData9 = new MutableLiveData<>();
        this.fetchVPNInfo = mutableLiveData9;
        this.zLjUOn = mutableLiveData9;
    }

    public final boolean gEmmrt() {
        return ((Boolean) this.hDKMBd.getValue()).booleanValue();
    }

    public static final boolean sSMYrx(SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel) {
        Boolean bool = (Boolean) securityFido2AuthenticatorViewModel.AxsJAY.get("KEY_AUTO_TRIGGER_REGISTRATION_WHEN_EMPTY");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class LoaderManager extends StateListAnimator {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.copydefault;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoaderManager(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        private StateListAnimator() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class PendingIntent extends StateListAnimator {
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.KWHzl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PendingIntent(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class FragmentManager extends StateListAnimator {
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.KWHzl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FragmentManager(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription extends StateListAnimator {
            public static final TaskDescription copydefault = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Activity extends StateListAnimator {
            public static final Activity EZpvd = new Activity();

            private Activity() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Fragment extends StateListAnimator {
            public final AuthenticatorDisplayModel AEQbTJ;
            public final boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthenticatorDisplayModel KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean copydefault() {
                return this.copydefault;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Fragment(@NotNull AuthenticatorDisplayModel authenticatorDisplayModel, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
                this.AEQbTJ = authenticatorDisplayModel;
                this.copydefault = z;
            }
        }

        /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorViewModel$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class C0239StateListAnimator extends StateListAnimator {
            public final AuthenticatorDisplayModel KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthenticatorDisplayModel copydefault() {
                return this.KWHzl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0239StateListAnimator(@NotNull AuthenticatorDisplayModel authenticatorDisplayModel) {
                super(null);
                Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
                this.KWHzl = authenticatorDisplayModel;
            }
        }

        public static final class Application extends StateListAnimator {
            public final String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class ActionBar extends StateListAnimator {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }
    }

    public static final boolean copydefault(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.isEmpty();
    }

    public static final Unit KWHzl(MediatorLiveData mediatorLiveData, SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(securityFido2AuthenticatorViewModel.fARcdN()));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MediatorLiveData mediatorLiveData, SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, List list) {
        mediatorLiveData.setValue(Boolean.valueOf(securityFido2AuthenticatorViewModel.fARcdN()));
        return Unit.INSTANCE;
    }

    public final boolean fARcdN() {
        return Intrinsics.EZpvd(this.AkhnZx.getValue(), Boolean.FALSE);
    }

    public static final Unit valueOf(MediatorLiveData mediatorLiveData, SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(securityFido2AuthenticatorViewModel.hDKMBd()));
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(MediatorLiveData mediatorLiveData, SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, List list) {
        mediatorLiveData.setValue(Boolean.valueOf(securityFido2AuthenticatorViewModel.hDKMBd()));
        return Unit.INSTANCE;
    }

    public final boolean hDKMBd() {
        List<AuthenticatorDisplayModel> value;
        return Intrinsics.EZpvd(this.AhwBna.getValue(), Boolean.FALSE) && (value = this.OLrzqt.getValue()) != null && (value.isEmpty() ^ true);
    }

    public static final Unit copydefault(MediatorLiveData mediatorLiveData, SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(securityFido2AuthenticatorViewModel.getNewProxyInstance()));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MediatorLiveData mediatorLiveData, SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, List list) {
        mediatorLiveData.setValue(Boolean.valueOf(securityFido2AuthenticatorViewModel.getNewProxyInstance()));
        return Unit.INSTANCE;
    }

    public final boolean getNewProxyInstance() {
        List<AuthenticatorDisplayModel> value;
        return Intrinsics.EZpvd(this.AhwBna.getValue(), Boolean.FALSE) && (value = this.OLrzqt.getValue()) != null && (value.isEmpty() ^ true);
    }

    public final Job zLjUOn() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2AuthenticatorViewModel$onResumeAction$1(this, null), 3, null);
    }

    public final Job zsXlph() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2AuthenticatorViewModel$passkeyCompatibilityCheckAndFetchList$1(this, null), 3, null);
    }

    public final Job AEQbTJ() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2AuthenticatorViewModel$checkReviewingRequestForResetStatus$1(this, null), 3, null);
    }

    public final Job EZpvd() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2AuthenticatorViewModel$checkPasskeyToggleStatus$1(this, null), 3, null);
    }

    public final Job copydefault() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2AuthenticatorViewModel$clickRegister$1(this, null), 3, null);
    }

    public final Job EZpvd(@NotNull AuthenticatorDisplayModel authenticatorDisplayModel) {
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2AuthenticatorViewModel$clickRename$1(this, authenticatorDisplayModel, null), 3, null);
    }

    public final Job copydefault(@NotNull AuthenticatorDisplayModel authenticatorDisplayModel) {
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2AuthenticatorViewModel$clickRemove$1(this, authenticatorDisplayModel, null), 3, null);
    }

    public final void KWHzl() {
        fJNWhG();
    }

    public final Job AuCTelauCTel() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2AuthenticatorViewModel$secondOrMoreRegistration$1(this, null), 3, null);
    }

    public final void AEQbTJ(String str, Function0<Unit> function0) {
        if (str.length() != 0) {
            this.EZpvd.setValue(new C32989mnw<>(new StateListAnimator.Application(str)));
        } else if (function0 != null) {
            function0.invoke();
        }
    }

    public final Job fJNWhG() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2AuthenticatorViewModel$initiateMfaForRegistrationWithGreyScale$1(this, null), 3, null);
    }

    public final Job copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2AuthenticatorViewModel$initiateMfaForPasskeyToggleSwitch$1(this, str, null), 3, null);
    }

    public final void AubY() {
        FlowKt.launchIn(FlowKt.m7441catch(FlowKt.onCompletion(FlowKt.onEach(FlowKt.onStart(this.zsXlph.OLrzqt(), new SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$1(this, null)), new SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$2(this, null)), new SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$3(this, null)), new SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$4(this, null)), ViewModelKt.getViewModelScope(this));
    }

    public final void KWHzl(final String str) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("FidoManagement_Full_Button_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aKL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2AuthenticatorViewModel.KWHzl(str, this, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(String str, SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        List<AuthenticatorDisplayModel> value = securityFido2AuthenticatorViewModel.ejfBZ.getValue();
        EventParamsList.put$default(eventParamsList, "key_numbers", String.valueOf(value != null ? value.size() : 0), false, 4, null);
        return Unit.INSTANCE;
    }

    public final Job AEQbTJ(String str) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2AuthenticatorViewModel$createSessionIdAndStartMfa$1(this, str, null), 3, null);
    }

    public final Job OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2AuthenticatorViewModel$checkMfaResult$1(this, str, null), 3, null);
    }

    public final Job EZpvd(String str) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2AuthenticatorViewModel$sessionIdToSwitchToggle$1(this, str, null), 3, null);
    }

    public final ButtonType djBIcL() {
        List<AuthenticatorDisplayModel> value = this.ejfBZ.getValue();
        if (value != null && value.size() == 1 && Intrinsics.EZpvd(this.AYXKKw.getValue(), Boolean.TRUE)) {
            return ButtonType.RESET_RENAME;
        }
        return ButtonType.REMOVE_RENAME;
    }
}
