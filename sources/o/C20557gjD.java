package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.net.bean.ChainInfo;
import com.okinc.business.defi.wallet.mine.data.WalletSearchEmpty;
import com.okinc.business.defi.wallet.tx.send.TransferInputAddressFragment;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC20927gqC;
import o.ActivityC20997grT;
import o.C13754dXa;
import o.C9694baS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gjD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20557gjD extends AbstractC20518giR {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public AbstractC16620enP AhwBna;
    public FrameLayout.LayoutParams EZpvd;
    public C59534zip valueOf;
    public final C58216yxB OLrzqt = new C58216yxB();
    public java.lang.String DbNXlk = "";
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.gjT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C20557gjD.djBIcL(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.gjD$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gjD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C20557gjD newInstance$default(Application application, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return application.OLrzqt(str, z);
        }

        public final C20557gjD OLrzqt(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            C20557gjD c20557gjD = new C20557gjD();
            c20557gjD.setArguments(C20557gjD.Companion.KWHzl(str, z));
            return c20557gjD;
        }

        public static /* synthetic */ android.os.Bundle fillBundle$default(Application application, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return application.KWHzl(str, z);
        }

        public final android.os.Bundle KWHzl(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("symbol", str);
            bundle.putBoolean("is_first_time_use", z);
            return bundle;
        }
    }

    public final C20708glw EZpvd() {
        return (C20708glw) this.values.getValue();
    }

    /* JADX INFO: renamed from: o.gjD$TaskDescription */
    public static final class TaskDescription implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            try {
                C20557gjD c20557gjD = C20557gjD.this;
                java.lang.String string = charSequence != null ? charSequence.toString() : null;
                if (string == null) {
                    string = "";
                }
                c20557gjD.DbNXlk = string;
                C20557gjD.this.EZpvd().OLrzqt(C33129mqd.gEmmrt(charSequence));
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ(C20557gjD.this.getTAG(), "Error in search text changed", e);
            }
        }
    }

    public static final C20708glw djBIcL(C20557gjD c20557gjD) {
        if (c20557gjD.KWHzl()) {
            androidx.fragment.app.Fragment fragmentRequireParentFragment = c20557gjD.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
            return (C20708glw) new ViewModelProvider(fragmentRequireParentFragment).get(C20708glw.class);
        }
        C20690gle c20690gle = C20690gle.OLrzqt;
        FragmentActivity fragmentActivityRequireActivity = c20557gjD.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (C20708glw) c20690gle.AEQbTJ(fragmentActivityRequireActivity, C20708glw.class);
    }

    public final boolean djBIcL() {
        return ensureArguments().getBoolean("is_first_time_use", false);
    }

    @Override // o.AbstractC14668dpm
    public android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        C55237xgE c55237xgE;
        C55237xgE c55237xgE2;
        C55230xfy c55230xfy;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.AhwBna = (AbstractC16620enP) DataBindingUtil.inflate(android.view.LayoutInflater.from(viewGroup.getContext()), C13754dXa.TaskDescription.invokespecialRtjmuc, viewGroup, false);
        this.EZpvd = new FrameLayout.LayoutParams(-1, -1);
        EZpvd(true);
        EZpvd(C13754dXa.FragmentManager.putInt);
        this.valueOf = new C59534zip();
        AbstractC16620enP abstractC16620enP = this.AhwBna;
        if (abstractC16620enP != null && (recyclerView = abstractC16620enP.EZpvd) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.valueOf);
        }
        AbstractC16620enP abstractC16620enP2 = this.AhwBna;
        if (abstractC16620enP2 != null && (c55230xfy = abstractC16620enP2.OLrzqt) != null) {
            c55230xfy.setVisibility(8);
        }
        if (!KWHzl()) {
            AbstractC16620enP abstractC16620enP3 = this.AhwBna;
            ViewGroup.LayoutParams layoutParams = (abstractC16620enP3 == null || (c55237xgE2 = abstractC16620enP3.copydefault) == null) ? null : c55237xgE2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = 0;
                AbstractC16620enP abstractC16620enP4 = this.AhwBna;
                if (abstractC16620enP4 != null && (c55237xgE = abstractC16620enP4.copydefault) != null) {
                    c55237xgE.setLayoutParams(marginLayoutParams);
                }
            }
        }
        java.lang.String string = ensureArguments().getString("symbol", "");
        C20708glw c20708glwEZpvd = EZpvd();
        Intrinsics.copydefault((java.lang.Object) string);
        c20708glwEZpvd.gEmmrt(string);
        gEmmrt();
        AYXKKw();
        valueOf();
        AbstractC16620enP abstractC16620enP5 = this.AhwBna;
        if (abstractC16620enP5 != null) {
            return abstractC16620enP5.getRoot();
        }
        return null;
    }

    private final void valueOf() {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        C55230xfy c55230xfy2;
        OKEditText oKEditTextKWHzl2;
        try {
            AbstractC16620enP abstractC16620enP = this.AhwBna;
            if (abstractC16620enP != null && (c55230xfy2 = abstractC16620enP.OLrzqt) != null && (oKEditTextKWHzl2 = c55230xfy2.KWHzl()) != null) {
                oKEditTextKWHzl2.setHint(getString(C13754dXa.FragmentManager.DAIeex));
            }
            AbstractC16620enP abstractC16620enP2 = this.AhwBna;
            if (abstractC16620enP2 == null || (c55230xfy = abstractC16620enP2.OLrzqt) == null || (oKEditTextKWHzl = c55230xfy.KWHzl()) == null) {
                return;
            }
            oKEditTextKWHzl.addTextChangedListener(new TaskDescription());
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "Error setting up search bar", e);
        }
    }

    @Override // o.AbstractC20518giR, o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (EZpvd().AuCTel()) {
            C32866mlf.onEvent$default("ReceiveSelectNetwork_Btm_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        } else if (EZpvd().ejfBZ()) {
            java.lang.Integer numAEQbTJ = EZpvd().AEQbTJ();
            int value = MultiTransferMode.MODE_NONE.getValue();
            if (numAEQbTJ == null || numAEQbTJ.intValue() != value) {
                C32866mlf.onEvent$default("AppMultisender_TokenChainSelection_Chain_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            }
            C32866mlf.onEvent$default("SendSelectNetwork_Btm_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, getViewLifecycleOwner(), false, new Function1() { // from class: o.gjP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20557gjD.KWHzl(this.AEQbTJ, (OnBackPressedCallback) obj);
            }
        }, 2, null);
    }

    public static final Unit KWHzl(C20557gjD c20557gjD, OnBackPressedCallback onBackPressedCallback) {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        AbstractC16620enP abstractC16620enP = c20557gjD.AhwBna;
        if (abstractC16620enP != null && (c55230xfy = abstractC16620enP.OLrzqt) != null && (oKEditTextKWHzl = c55230xfy.KWHzl()) != null) {
            java.lang.Object systemService = c20557gjD.requireContext().getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(oKEditTextKWHzl.getWindowToken(), 0);
            }
        }
        if (c20557gjD.EZpvd().AuCTel()) {
            C14494dmX.KWHzl.EZpvd("ReceiveSelectNetwork_Btm_Button_Click", "return");
        } else if (c20557gjD.EZpvd().ejfBZ()) {
            C14494dmX.KWHzl.EZpvd("SendSelectNetwork_Btm_Page_View", "return");
        }
        onBackPressedCallback.setEnabled(false);
        c20557gjD.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        C59534zip c59534zip = this.valueOf;
        if (c59534zip != null) {
            c59534zip.register(C20598gjs.class, new C20604gjy(EZpvd().djBIcL(), !EZpvd().getFieldNames(), new Function1() { // from class: o.gjS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20557gjD.OLrzqt(this.EZpvd, (C20598gjs) obj);
                }
            }));
        }
        C59534zip c59534zip2 = this.valueOf;
        if (c59534zip2 != null) {
            c59534zip2.register(WalletSearchEmpty.class, new C19224fxJ());
        }
        C59534zip c59534zip3 = this.valueOf;
        if (c59534zip3 != null) {
            c59534zip3.register(C20701glp.class, new C20704gls(new Function0() { // from class: o.gjU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20557gjD.AYXKKw(this.EZpvd);
                }
            }));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(final C20557gjD c20557gjD, C20598gjs c20598gjs) {
        C10854bwM c10854bwMKWHzl;
        C10854bwM c10854bwMKWHzl2;
        C10854bwM c10854bwMKWHzl3;
        Intrinsics.checkNotNullParameter(c20598gjs, "");
        c20557gjD.AhwBna();
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMKWHzl4 = c10954byG.valueOf().KWHzl(java.lang.Long.valueOf(c20598gjs.gEmmrt()));
        if (c20557gjD.EZpvd().AuCTel()) {
            C10854bwM c10854bwMKWHzl5 = c10954byG.valueOf().KWHzl(c20598gjs.gEmmrt());
            if (!c20598gjs.fJNWhG().AhwBna(c10854bwMKWHzl5 != null ? java.lang.Long.valueOf(c10854bwMKWHzl5.AEQbTJ()) : null)) {
                C9930beq c9930beqEZpvd = C9930beq.Companion.EZpvd(c20598gjs.gEmmrt());
                c9930beqEZpvd.copydefault(new Function1() { // from class: o.gjM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20557gjD.AEQbTJ(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
                c9930beqEZpvd.show(c20557gjD.getChildFragmentManager(), c20557gjD.getTAG());
            } else if (c10854bwMKWHzl4 != null && (c10854bwMKWHzl3 = c10854bwMKWHzl4.KWHzl()) != null && c10854bwMKWHzl3.QCjLjM()) {
                C55326xho.toast$default(C13754dXa.FragmentManager.Dmq, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            } else {
                c20557gjD.EZpvd(c20598gjs);
            }
        } else if (c20557gjD.EZpvd().AEQbTJ() != null) {
            java.lang.Integer numAEQbTJ = c20557gjD.EZpvd().AEQbTJ();
            int value = MultiTransferMode.MODE_NONE.getValue();
            if (numAEQbTJ == null || numAEQbTJ.intValue() != value) {
                android.content.Context context = c20557gjD.getContext();
                if (context == null) {
                    return Unit.INSTANCE;
                }
                if (c10854bwMKWHzl4 != null && (c10854bwMKWHzl2 = c10854bwMKWHzl4.KWHzl()) != null && c10854bwMKWHzl2.QCjLjM()) {
                    C55326xho.toast$default(C13754dXa.FragmentManager.Dmq, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    return Unit.INSTANCE;
                }
                c20557gjD.OLrzqt(context, c20598gjs.fJNWhG(), c20598gjs.gEmmrt());
            } else if (c20598gjs.fetchVPNInfo()) {
                TransactionInfo transactionInfoAYXKKw = c20557gjD.EZpvd().AYXKKw();
                if (transactionInfoAYXKKw != null) {
                    transactionInfoAYXKKw.setTokenId(java.lang.String.valueOf(c20598gjs.gEmmrt()));
                }
                if (c10854bwMKWHzl4 != null && (c10854bwMKWHzl = c10854bwMKWHzl4.KWHzl()) != null && c10854bwMKWHzl.QCjLjM()) {
                    C55326xho.toast$default(C13754dXa.FragmentManager.Dmq, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    return Unit.INSTANCE;
                }
                if (c20598gjs.fJNWhG().getFieldNames() && c10854bwMKWHzl4 != null && c10854bwMKWHzl4.QHmsKR()) {
                    C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.setPosition, 0, 1, (java.lang.Object) null);
                    return Unit.INSTANCE;
                }
                if (c20557gjD.KWHzl()) {
                    AbstractC57212yeE.addFragment$default(c20557gjD, TransferInputAddressFragment.Companion.OLrzqt(c20598gjs.fJNWhG().DbNXlk(), java.lang.String.valueOf(c20598gjs.gEmmrt()), c20557gjD.EZpvd().AYXKKw(), "from_home", (48 & 16) != 0 ? "" : null, (48 & 32) != 0 ? null : null, ""), false, false, 6, null);
                } else {
                    android.content.Context context2 = c20557gjD.getContext();
                    if (context2 == null) {
                        return Unit.INSTANCE;
                    }
                    C9694baS.Companion.KWHzl(c20557gjD, gFI.Companion.EZpvd(context2, c20598gjs.fJNWhG().DbNXlk(), java.lang.String.valueOf(c20598gjs.gEmmrt()), c20557gjD.EZpvd().AYXKKw(), "from_home", (96 & 32) != 0 ? "" : null, (96 & 64) != 0 ? null : null, ""), new Function2() { // from class: o.gjN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C20557gjD.gEmmrt(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                        }
                    });
                }
            } else {
                C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(c20557gjD, C13754dXa.FragmentManager.getExtraBinder, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainname", c20598gjs.copydefault()))), 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C20557gjD c20557gjD, boolean z) {
        c20557gjD.EZpvd().zsXlph();
        c20557gjD.EZpvd().DbNXlk().copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C20557gjD c20557gjD, int i, android.content.Intent intent) {
        if (i == -1) {
            c20557gjD.AEQbTJ(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(final C20557gjD c20557gjD) {
        java.util.List<?> items;
        java.lang.Object next;
        C10854bwM c10854bwMKWHzl;
        C59534zip c59534zip = c20557gjD.valueOf;
        if (c59534zip != null && (items = c59534zip.getItems()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : items) {
                if (obj instanceof C20598gjs) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C20598gjs) next).AYXKKw() == 196) {
                    break;
                }
            }
            final C20598gjs c20598gjs = (C20598gjs) next;
            if (c20598gjs != null) {
                C32866mlf.onEvent$default("ReceiveSelectNetwork_RecommendXlayer_Banner_Click", (TrackChannel[]) null, new Function1() { // from class: o.gjF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C20557gjD.copydefault(c20598gjs, (EventParamsList) obj2);
                    }
                }, 1, (java.lang.Object) null);
                C10954byG c10954byG = C10954byG.EZpvd;
                C10854bwM c10854bwMKWHzl2 = c10954byG.valueOf().KWHzl(java.lang.Long.valueOf(c20598gjs.gEmmrt()));
                C10854bwM c10854bwMKWHzl3 = c10954byG.valueOf().KWHzl(c20598gjs.gEmmrt());
                if (!c20598gjs.fJNWhG().AhwBna(c10854bwMKWHzl3 != null ? java.lang.Long.valueOf(c10854bwMKWHzl3.AEQbTJ()) : null)) {
                    C9930beq c9930beqEZpvd = C9930beq.Companion.EZpvd(c20598gjs.gEmmrt());
                    c9930beqEZpvd.copydefault(new Function1() { // from class: o.gjC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return C20557gjD.EZpvd(this.copydefault, ((java.lang.Boolean) obj2).booleanValue());
                        }
                    });
                    c9930beqEZpvd.show(c20557gjD.getChildFragmentManager(), c20557gjD.getTAG());
                } else if (c10854bwMKWHzl2 != null && (c10854bwMKWHzl = c10854bwMKWHzl2.KWHzl()) != null && c10854bwMKWHzl.QCjLjM()) {
                    C55326xho.toast$default(C13754dXa.FragmentManager.Dmq, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                } else {
                    c20557gjD.EZpvd(c20598gjs);
                }
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C20598gjs c20598gjs, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("token_name", c20598gjs.djBIcL(), false);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C20557gjD c20557gjD, boolean z) {
        c20557gjD.EZpvd().zsXlph();
        c20557gjD.EZpvd().DbNXlk().copydefault();
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        if (EZpvd().AuCTel()) {
            C32866mlf.onEvent$default("Web3ReceiveCoin_SelectNetwork_Card_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            C14494dmX.KWHzl.EZpvd("ReceiveSelectNetwork_Btm_Button_Click", "select_network");
        } else if (EZpvd().ejfBZ()) {
            C32866mlf.onEvent$default("Web3SendCoin_SelectNetwork_Card_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            C14494dmX.KWHzl.EZpvd("SendSelectNetwork_Btm_Button_Click", "select_network");
        }
    }

    public static /* synthetic */ void showQrCodeFragment$default(C20557gjD c20557gjD, C20598gjs c20598gjs, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c20598gjs = null;
        }
        c20557gjD.EZpvd(c20598gjs);
    }

    public final void EZpvd(final C20598gjs c20598gjs) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOLrzqt = fPV.OLrzqt.OLrzqt(c20598gjs != null ? c20598gjs.gEmmrt() : -1L, c20598gjs != null ? c20598gjs.fJNWhG() : null);
        final Function1 function1 = new Function1() { // from class: o.gjQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20557gjD.copydefault(this.copydefault, c20598gjs, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gjV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20557gjD.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gjR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20557gjD.AEQbTJ(this.EZpvd, c20598gjs, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gjY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20557gjD.gEmmrt(function12, obj);
            }
        });
        Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
        addDisposable(interfaceC58217yxCAEQbTJ);
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C20557gjD c20557gjD, C20598gjs c20598gjs, kotlin.Pair pair) {
        c20557gjD.dismissLoading();
        c20557gjD.AEQbTJ(c20598gjs);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C20557gjD c20557gjD, C20598gjs c20598gjs, java.lang.Throwable th) {
        c20557gjD.dismissLoading();
        c20557gjD.AEQbTJ(c20598gjs);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void generateShowQrCodeFragment$default(C20557gjD c20557gjD, C20598gjs c20598gjs, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c20598gjs = null;
        }
        c20557gjD.AEQbTJ(c20598gjs);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.grT.ActionBar.getStartIntent$default(o.grT$ActionBar, android.content.Context, java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.Object):android.content.Intent */
    public final void AEQbTJ(C20598gjs c20598gjs) {
        java.lang.String string;
        AbstractC12782ctV abstractC12782ctVFJNWhG;
        java.lang.String strDbNXlk;
        java.lang.String string2;
        AbstractC12782ctV abstractC12782ctVFJNWhG2;
        java.lang.String strDbNXlk2;
        if (KWHzl()) {
            AbstractC57212yeE.addFragment$default(this, ViewOnClickListenerC20995grR.Companion.copydefault((c20598gjs == null || (abstractC12782ctVFJNWhG2 = c20598gjs.fJNWhG()) == null || (strDbNXlk2 = abstractC12782ctVFJNWhG2.DbNXlk()) == null) ? "" : strDbNXlk2, (c20598gjs == null || (string2 = java.lang.Long.valueOf(c20598gjs.gEmmrt()).toString()) == null) ? "" : string2, (1772 & 4) != 0 ? false : false, (1772 & 8) != 0 ? "" : null, (1772 & 16) != 0 ? false : djBIcL(), (1772 & 32) != 0 ? false : false, (1772 & 64) != 0 ? -1 : 0, (1772 & 128) != 0 ? -1L : 0L, (1772 & 256) != 0 ? "" : null, (1772 & 512) != 0 ? 1 : 0, (1772 & 1024) != 0 ? null : null), false, false, 6, null);
            return;
        }
        C9694baS.Application application = C9694baS.Companion;
        ActivityC20997grT.ActionBar actionBar = ActivityC20997grT.Companion;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        application.KWHzl(this, ActivityC20997grT.ActionBar.getStartIntent$default(actionBar, context, (c20598gjs == null || (abstractC12782ctVFJNWhG = c20598gjs.fJNWhG()) == null || (strDbNXlk = abstractC12782ctVFJNWhG.DbNXlk()) == null) ? "" : strDbNXlk, (c20598gjs == null || (string = java.lang.Long.valueOf(c20598gjs.gEmmrt()).toString()) == null) ? "" : string, djBIcL(), null, 16, null), new Function2() { // from class: o.gjI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20557gjD.KWHzl(this.copydefault, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit KWHzl(C20557gjD c20557gjD, int i, android.content.Intent intent) {
        if (i == -1) {
            c20557gjD.AEQbTJ(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        try {
            EZpvd().DbNXlk().observe(this, new ActionBar());
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "Error observing transfer chains", e);
        }
    }

    /* JADX INFO: renamed from: o.gjD$ActionBar */
    public static final class ActionBar extends AbstractC32992mnz<C20603gjx> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Z */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean KWHzl(C20603gjx c20603gjx) {
            Intrinsics.checkNotNullParameter(c20603gjx, "");
            return false;
        }

        public ActionBar() {
            super(null, null, 0, 7, null);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void KWHzl(C20603gjx c20603gjx, android.view.View view) {
            C55230xfy c55230xfy;
            super.KWHzl(c20603gjx, view);
            AbstractC16620enP abstractC16620enP = C20557gjD.this.AhwBna;
            if (abstractC16620enP == null || (c55230xfy = abstractC16620enP.OLrzqt) == null) {
                return;
            }
            c55230xfy.setVisibility(8);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        public void AEQbTJ(C20603gjx c20603gjx, android.view.View view) {
            AbstractC16620enP abstractC16620enP;
            C55230xfy c55230xfy;
            Intrinsics.checkNotNullParameter(c20603gjx, "");
            super.AEQbTJ(c20603gjx, view);
            try {
                if (!c20603gjx.AEQbTJ().isEmpty()) {
                    if (!C20557gjD.this.AEQbTJ) {
                        try {
                            C20557gjD.this.EZpvd().EZpvd(c20603gjx.AEQbTJ());
                            C20557gjD.this.AEQbTJ = true;
                        } catch (java.lang.Exception e) {
                            pUU.AEQbTJ(C20557gjD.this.getTAG(), "Error capturing initial chain order", e);
                        }
                    }
                    java.util.List listOLrzqt = C56402yEa.OLrzqt();
                    if (c20603gjx.OLrzqt()) {
                        listOLrzqt.add(C20701glp.copydefault);
                    }
                    listOLrzqt.addAll(c20603gjx.AEQbTJ());
                    java.util.List listFARcdN = C56402yEa.fARcdN(listOLrzqt);
                    if (c20603gjx.AEQbTJ().size() > 5 && (abstractC16620enP = C20557gjD.this.AhwBna) != null && (c55230xfy = abstractC16620enP.OLrzqt) != null) {
                        c55230xfy.setVisibility(0);
                    }
                    C59534zip c59534zip = C20557gjD.this.valueOf;
                    if (c59534zip != null) {
                        C33064mpR.OLrzqt(c59534zip, (java.util.List<? extends java.lang.Object>) listFARcdN);
                    }
                } else {
                    C59534zip c59534zip2 = C20557gjD.this.valueOf;
                    if (c59534zip2 != null) {
                        C33064mpR.OLrzqt(c59534zip2, yDY.copydefault(new WalletSearchEmpty(C20557gjD.this.DbNXlk)));
                    }
                }
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C20557gjD.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            } catch (java.lang.Exception e2) {
                pUU.AEQbTJ(C20557gjD.this.getTAG(), "Error setting up content", e2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.OLrzqt.dispose();
        super.onDestroyView();
    }

    public final void OLrzqt(final android.content.Context context, final AbstractC12782ctV abstractC12782ctV, final long j) {
        showLoadingAtOnce();
        AbstractC58185ywX<ResponseData<ChainInfo>> abstractC58185ywXAEQbTJ = new C13934dbu().AEQbTJ(abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), j, "", 1);
        final Function1 function1 = new Function1() { // from class: o.gjZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20557gjD.KWHzl((ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gka
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20557gjD.valueOf(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.gjW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20557gjD.EZpvd(this.EZpvd, j, context, abstractC12782ctV, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gjX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20557gjD.AhwBna(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.gjG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20557gjD.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXAEQbTJ2.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gjH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20557gjD.AYXKKw(function13, obj);
            }
        });
    }

    public static final kotlin.Pair valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(final C20557gjD c20557gjD, long j, android.content.Context context, AbstractC12782ctV abstractC12782ctV, kotlin.Pair pair) {
        c20557gjD.dismissLoading();
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            final C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(j);
            if (c10854bwMKWHzl != null) {
                if (C8392bBp.copydefault.EZpvd(c10854bwMKWHzl.fetchVPNInfo())) {
                    android.content.Context contextRequireContext = c20557gjD.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                    int i = C13754dXa.FragmentManager.ReportDrawnComposition;
                    java.lang.String strDjBIcL = c10854bwMKWHzl != null ? c10854bwMKWHzl.djBIcL() : null;
                    viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", strDjBIcL != null ? strDjBIcL : ""))));
                    viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.AxsJAYsNCnLh, new View.OnClickListener() { // from class: o.gjJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C20557gjD.copydefault(viewOnClickListenerC54939xaY, view);
                        }
                    });
                    viewOnClickListenerC54939xaY.show();
                } else {
                    if (c10854bwMKWHzl != null) {
                        C32866mlf.onEvent$default("AppMultisender_TokenChainSelection_Chain_Select", (TrackChannel[]) null, new Function1() { // from class: o.gjK
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C20557gjD.EZpvd(c10854bwMKWHzl, (EventParamsList) obj);
                            }
                        }, 1, (java.lang.Object) null);
                    }
                    C9694baS.Application application = C9694baS.Companion;
                    ActivityC20927gqC.TaskDescription taskDescription = ActivityC20927gqC.Companion;
                    java.lang.Integer numAEQbTJ = c20557gjD.EZpvd().AEQbTJ();
                    Intrinsics.copydefault(numAEQbTJ);
                    application.KWHzl(c20557gjD, taskDescription.AEQbTJ(context, numAEQbTJ.intValue(), abstractC12782ctV.DbNXlk(), j), new Function2() { // from class: o.gjL
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C20557gjD.EZpvd(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                        }
                    });
                }
            }
        } else {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY2.EZpvd((java.lang.CharSequence) pair.getSecond());
            viewOnClickListenerC54939xaY2.EZpvd(C13754dXa.FragmentManager.iRxXKY, new View.OnClickListener() { // from class: o.gjO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20557gjD.EZpvd(viewOnClickListenerC54939xaY2, view);
                }
            });
            viewOnClickListenerC54939xaY2.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY2.setCancelable(false);
            viewOnClickListenerC54939xaY2.show();
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit EZpvd(C10854bwM c10854bwM, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("token", c10854bwM.djBIcL(), false);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C20557gjD c20557gjD, int i, android.content.Intent intent) {
        if (i == -1) {
            c20557gjD.AEQbTJ(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final kotlin.Pair KWHzl(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            ChainInfo chainInfo = (ChainInfo) responseData.getData();
            if (chainInfo != null && chainInfo.getCanWithdraw()) {
                return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
            }
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            ChainInfo chainInfo2 = (ChainInfo) responseData.getData();
            return C56390yDp.OLrzqt(bool, chainInfo2 != null ? chainInfo2.getWithdrawMsg() : null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
