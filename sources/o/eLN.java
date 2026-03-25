package o;

import android.os.Build;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.business.defi.wallet.home.ChooseCreateWalletFragment$isForbiddenCeFiRegister$isForbiddenCeFiRegister$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import com.okinc.web.WebActivity;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import o.ActivityC15363eFo;
import o.C10604brb;
import o.C13754dXa;
import o.C52761wXj;
import o.C57032yak;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eLN extends wXX implements C57032yak.TaskDescription {
    public C16640enj EZpvd;
    public boolean KWHzl;
    public boolean gEmmrt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public Function0<Unit> OLrzqt = new Function0() { // from class: o.eLM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return eLN.copydefault();
        }
    };
    public Function0<Unit> djBIcL = new Function0() { // from class: o.eLL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return eLN.EZpvd();
        }
    };
    public int AYXKKw = 1;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.eLQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return eLN.values(this.EZpvd);
        }
    });
    public java.lang.String copydefault = "wallet";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C57032yak.TaskDescription
    public void OLrzqt(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        this.gEmmrt = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C57032yak.TaskDescription
    public void copydefault(@NotNull InterfaceC57036yao interfaceC57036yao) {
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        this.gEmmrt = true;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eLN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.eLN$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ eLN newInstance$default(TaskDescription taskDescription, Function0 function0, Function0 function02, int i, boolean z, java.util.List list, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                i = 1;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i2 & 16) != 0) {
                list = yDY.AhwBna();
            }
            java.util.List list2 = list;
            if ((i2 & 32) != 0) {
                str = "wallet";
            }
            return taskDescription.EZpvd(function0, function02, i3, z2, list2, str);
        }

        public final eLN EZpvd(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, int i, boolean z, @NotNull java.util.List<? extends UnsupportedWalletType> list, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            eLN eln = new eLN();
            eln.OLrzqt = function0;
            eln.djBIcL = function02;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(OtcExtraKeys.MODE, i);
            bundle.putBoolean("from_guide", z);
            bundle.putParcelableArrayList("UNSUPPORTED_WALLET_TYPES", new java.util.ArrayList<>(list));
            bundle.putString("from", str);
            eln.setArguments(bundle);
            return eln;
        }
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    private final java.util.List<UnsupportedWalletType> valueOf() {
        return (java.util.List) this.AhwBna.getValue();
    }

    public static final java.util.List values(eLN eln) {
        java.util.ArrayList parcelableArrayList;
        android.os.Bundle arguments = eln.getArguments();
        if (arguments == null) {
            parcelableArrayList = null;
        } else if (Build.VERSION.SDK_INT >= 33) {
            parcelableArrayList = arguments.getParcelableArrayList("UNSUPPORTED_WALLET_TYPES", UnsupportedWalletType.class);
        } else {
            parcelableArrayList = arguments.getParcelableArrayList("UNSUPPORTED_WALLET_TYPES");
        }
        return parcelableArrayList == null ? yDY.AhwBna() : parcelableArrayList;
    }

    private final boolean values() {
        return !valueOf().contains(UnsupportedWalletType.MPCWallet);
    }

    private final boolean isConnected() {
        return !valueOf().contains(UnsupportedWalletType.HardwareWallet);
    }

    private final boolean AhwBna() {
        return ((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).copydefault();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        android.os.Bundle arguments = getArguments();
        this.AYXKKw = arguments != null ? arguments.getInt(OtcExtraKeys.MODE) : 1;
        android.os.Bundle arguments2 = getArguments();
        this.KWHzl = arguments2 != null ? arguments2.getBoolean("from_guide") : false;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string = arguments3.getString("from")) == null) {
            string = "wallet";
        }
        this.copydefault = string;
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
        c52781wYc.setOnClickListener(new View.OnClickListener() { // from class: o.eLO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eLN.EZpvd(this.KWHzl, view);
            }
        });
    }

    public static final void EZpvd(eLN eln, android.view.View view) {
        eln.dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.EZpvd = C16640enj.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        gEmmrt();
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.eLS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    eLN.AYXKKw(this.AEQbTJ);
                }
            });
        }
    }

    public static final void AYXKKw(eLN eln) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) eln, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void gEmmrt() {
        C16640enj c16640enj = this.EZpvd;
        if (c16640enj == null) {
            Intrinsics.gEmmrt("");
            c16640enj = null;
        }
        AppCompatImageView appCompatImageView = c16640enj.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C14677dpv.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.CreateWalletIcon);
        C16640enj c16640enj2 = this.EZpvd;
        if (c16640enj2 == null) {
            Intrinsics.gEmmrt("");
            c16640enj2 = null;
        }
        AppCompatTextView appCompatTextView = c16640enj2.isConnected;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(isConnected() ? 0 : 8);
        C16640enj c16640enj3 = this.EZpvd;
        if (c16640enj3 == null) {
            Intrinsics.gEmmrt("");
            c16640enj3 = null;
        }
        ConstraintLayout constraintLayout = c16640enj3.copydefault;
        Intrinsics.copydefault(constraintLayout);
        constraintLayout.setVisibility(isConnected() ? 0 : 8);
        constraintLayout.setOnClickListener(new FragmentManager(constraintLayout, 1000L, this));
        C16640enj c16640enj4 = this.EZpvd;
        if (c16640enj4 == null) {
            Intrinsics.gEmmrt("");
            c16640enj4 = null;
        }
        C52794wYp c52794wYp = c16640enj4.EZpvd;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        AkhnZx();
        C32866mlf.onEvent$default("Web3Onboarding_Sheet_CreateWalletMethod_View", (TrackChannel[]) null, new Function1() { // from class: o.eLP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eLN.AEQbTJ(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final class Activity implements Function1<EventParamsList, Unit> {
        public static final Activity EZpvd = new Activity();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, "hardware", true));
        }
    }

    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, "hardware", true));
            C14494dmX.addIsExchangeUserParam$default(C14494dmX.KWHzl, eventParamsList, false, 1, null);
        }
    }

    public static final class Application implements Function1<EventParamsList, Unit> {
        public static final Application copydefault = new Application();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, "hardware", true));
        }
    }

    public static final class LoaderManager implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            androidx.fragment.app.FragmentManager supportFragmentManager;
            C14541dnR c14541dnRCopydefault = C14541dnR.Companion.copydefault(eLN.this.AYXKKw);
            FragmentActivity activity = eLN.this.getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return;
            }
            c14541dnRCopydefault.show(supportFragmentManager, eLN.class.getSimpleName());
        }
    }

    public static final class Dialog implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            if (eLN.this.djBIcL()) {
                eLN.this.KWHzl();
            }
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ eLN AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, eLN eln) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = eln;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C10604brb instance$default = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null);
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                eLN eln = this.AEQbTJ;
                instance$default.KWHzl(contextRequireContext, eln, eln.new Dialog());
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ eLN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, eLN eln) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = eln;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.copydefault.KWHzl) {
                    C32866mlf.onEvent$default("Web3Onboarding_Card_CreatWallet_Click", (TrackChannel[]) null, Activity.EZpvd, 1, (java.lang.Object) null);
                    C32866mlf.onEvent$default("Web3Onboarding_Sheet_CreateWallet_Click", (TrackChannel[]) null, StateListAnimator.EZpvd, 1, (java.lang.Object) null);
                } else {
                    dTU.onWeb3Event$default("Web3AddWallet_Card_CreatWallet_Click", null, Application.copydefault, 1, null);
                }
                C10604brb instance$default = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null);
                android.content.Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                eLN eln = this.copydefault;
                instance$default.KWHzl(contextRequireContext, eln, eln.new LoaderManager());
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    public static final Unit AEQbTJ(eLN eln, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("wallet_type", eln.djBIcL() ? Web3SecurityTrackEvent.VALUE_SEED_PHRASE : "keyless", true));
        eventParamsList.add(new EventParam("onboarding_source", eln.copydefault, true));
        C14494dmX.KWHzl.AEQbTJ(eventParamsList, true);
        return Unit.INSTANCE;
    }

    private final void AkhnZx() {
        java.lang.String str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getEnabledChangedCallbackactivity_release) + "\u200b";
        java.lang.String str2 = C33069mpW.copydefault(C13754dXa.FragmentManager.getStateWithUpdatedPosition, C56423yEv.EZpvd(C56390yDp.OLrzqt("terms_service", str))) + "\u200b";
        java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.eLV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eLN.KWHzl((java.util.List) obj);
            }
        }, 14, null);
        C16640enj c16640enj = this.EZpvd;
        C16640enj c16640enj2 = null;
        if (c16640enj == null) {
            Intrinsics.gEmmrt("");
            c16640enj = null;
        }
        AppCompatTextView appCompatTextView = c16640enj.values;
        if (appCompatTextView != null) {
            appCompatTextView.setText(charSequence);
        }
        C16640enj c16640enj3 = this.EZpvd;
        if (c16640enj3 == null) {
            Intrinsics.gEmmrt("");
            c16640enj3 = null;
        }
        AppCompatTextView appCompatTextView2 = c16640enj3.values;
        if (appCompatTextView2 != null) {
            C16640enj c16640enj4 = this.EZpvd;
            if (c16640enj4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16640enj2 = c16640enj4;
            }
            appCompatTextView2.setOnTouchListener(new ViewOnTouchListenerC14460dlq(c16640enj2.values, str2, str, new Function0() { // from class: o.eLW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eLN.AhwBna(this.AEQbTJ);
                }
            }));
        }
    }

    public static final Unit KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.UnderlineSpan());
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(eLN eln) {
        C32866mlf.onEvent$default("Web3Onboarding_Sheet_CreateWallet_Click", (TrackChannel[]) null, new Function1() { // from class: o.eLR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eLN.gEmmrt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        eln.dismissAllowingStateLoss();
        eln.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.PickVisualMediaRequest));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, "agreement", true));
        C14494dmX.addIsExchangeUserParam$default(C14494dmX.KWHzl, eventParamsList, false, 1, null);
        return Unit.INSTANCE;
    }

    private final void EZpvd(java.lang.String str) {
        C33570myu.copydefault((android.app.Activity) requireActivity());
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, fragmentActivityRequireActivity, bundleBundleOf, null, 4, null);
    }

    public final boolean AYXKKw() {
        return ((java.lang.Boolean) BuildersKt.runBlocking(Dispatchers.getIO(), new ChooseCreateWalletFragment$isForbiddenCeFiRegister$isForbiddenCeFiRegister$1(null))).booleanValue();
    }

    public final boolean djBIcL() {
        return (values() && !AYXKKw() && dZP.OLrzqt.valueOf()) ? false : true;
    }

    public final void KWHzl() {
        this.djBIcL.invoke();
        if (this.KWHzl) {
            C32866mlf.onEvent$default("Web3Onboarding_Card_CreatWallet_Click", (TrackChannel[]) null, new Function1() { // from class: o.eLX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eLN.copydefault((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C32866mlf.onEvent$default("Web3Onboarding_Sheet_CreateWallet_Click", (TrackChannel[]) null, new Function1() { // from class: o.eLU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eLN.djBIcL((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else {
            dTU.onWeb3Event$default("Web3AddWallet_Card_CreatWallet_Click", null, new Function1() { // from class: o.eLK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eLN.AYXKKw((EventParamsList) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, "seedphrase", true));
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, "seedphrase", true));
        C14494dmX.addIsExchangeUserParam$default(C14494dmX.KWHzl, eventParamsList, false, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, "seedphrase", true));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.eFo.ActionBar.startActivity$default(o.eFo$ActionBar, android.content.Context, int, java.lang.String, int, java.lang.Object):void */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.gEmmrt) {
            this.gEmmrt = false;
            if (AhwBna()) {
                C57032yak.AEQbTJ.KWHzl(this);
                ActivityC15363eFo.ActionBar actionBar = ActivityC15363eFo.Companion;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                ActivityC15363eFo.ActionBar.startActivity$default(actionBar, fragmentActivityRequireActivity, 0, null, 6, null);
            } else {
                pUU.copydefault("ChooseCreateWalletFragment", "onResume: Bluetooth is not supported");
            }
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (!AhwBna()) {
            pUU.copydefault("ChooseCreateWalletFragment", "onDestroy: Bluetooth is not supported");
        } else {
            C57032yak.AEQbTJ.KWHzl(this);
        }
    }

    @Override // o.C57032yak.TaskDescription
    public void EZpvd(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        C13992dcz.AEQbTJ.EZpvd(bluetoothDeviceModel);
        this.gEmmrt = false;
    }
}
