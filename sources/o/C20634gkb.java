package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.tx.check.ChainCheckType;
import com.okinc.business.defi.biz.core.tx.check.ChainStatus;
import com.okinc.business.defi.biz.core.tx.check.ChainStatusChecker;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.ChainInfo;
import com.okinc.business.defi.wallet.mine.data.WalletSearchEmpty;
import com.okinc.business.defi.wallet.transfer.ButtonType;
import com.okinc.business.defi.wallet.transfer.TransferSelectCoinFragment$observeData$1;
import com.okinc.business.defi.wallet.transfer.TransferSelectCoinFragment$observeData$2;
import com.okinc.business.defi.wallet.transfer.TransferSelectCoinFragment$observeData$3;
import com.okinc.business.defi.wallet.transfer.TransferSelectCoinFragment$registerAdapter$1$handleClickLogic$1;
import com.okinc.business.defi.wallet.transfer.TransferSelectCoinFragment$registerAdapter$2$1;
import com.okinc.business.defi.wallet.tx.send.TransferInputAddressFragment;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.wallet.api.bean.AddressType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC20512giL;
import o.ActivityC13789dYi;
import o.ActivityC20517giQ;
import o.ActivityC20582gjc;
import o.ActivityC20927gqC;
import o.ActivityC20997grT;
import o.C13754dXa;
import o.C20634gkb;
import o.C21118gti;
import o.C52761wXj;
import o.C9694baS;
import o.InterfaceC17407fEe;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.gkb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20634gkb extends AbstractC20518giR {
    public final ActivityResultLauncher<android.content.Context> EZpvd;
    public AbstractC16620enP KWHzl;
    public C59534zip OLrzqt;
    public final InterfaceC56387yDm isConnected;
    public boolean valueOf;
    public final ActivityResultLauncher<C21118gti.Application> values;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public java.lang.String DbNXlk = "";
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.gkf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C20634gkb.gEmmrt(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.gkg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C20634gkb.fetchVPNInfo(this.copydefault);
        }
    });

    /* JADX INFO: renamed from: o.gkb$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChainStatus.values().length];
            try {
                iArr[ChainStatus.REGISTERED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChainStatus.REGISTERING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChainStatus.UNREGISTERED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ChainStatus.CANNOT_TRANSFER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX INFO: renamed from: o.gkb$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            C20634gkb.this.DbNXlk = java.lang.String.valueOf(charSequence);
            if (C20634gkb.this.DbNXlk.length() == 0) {
                C20634gkb.this.values().KWHzl(C33129mqd.gEmmrt(charSequence));
                C20634gkb.this.values().fetchVPNInfo().copydefault();
            } else {
                C20634gkb.this.values().KWHzl(C33129mqd.gEmmrt(charSequence));
            }
        }
    }

    public C20634gkb() {
        InterfaceC8106awV interfaceC8106awV = (InterfaceC8106awV) C43251rlk.OLrzqt(InterfaceC8106awV.class);
        this.EZpvd = interfaceC8106awV != null ? registerForActivityResult(interfaceC8106awV.OLrzqt(true), new ActivityResultCallback() { // from class: o.gkh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C20634gkb.OLrzqt(this.KWHzl, (java.lang.Boolean) obj);
            }
        }) : null;
        ActivityResultLauncher<C21118gti.Application> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new C21118gti(), new ActivityResultCallback() { // from class: o.gkj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C20634gkb.EZpvd(this.copydefault, (java.lang.Integer) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.values = activityResultLauncherRegisterForActivityResult;
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.gki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C20634gkb.gEmmrt());
            }
        });
    }

    /* JADX INFO: renamed from: o.gkb$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gkb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C20634gkb newInstance$default(Application application, java.lang.String str, java.lang.String str2, TransactionInfo transactionInfo, boolean z, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                transactionInfo = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return application.OLrzqt(str, str2, transactionInfo, z);
        }

        public final C20634gkb OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, TransactionInfo transactionInfo, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C20634gkb c20634gkb = new C20634gkb();
            c20634gkb.setArguments(fillBundle$default(this, str, str2, transactionInfo, z, null, null, 48, null));
            return c20634gkb;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.gkb$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ android.os.Bundle fillBundle$default(Application application, java.lang.String str, java.lang.String str2, TransactionInfo transactionInfo, boolean z, java.util.ArrayList arrayList, java.lang.Integer num, int i, java.lang.Object obj) {
            return application.AEQbTJ(str, str2, (i & 4) != 0 ? null : transactionInfo, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : arrayList, (i & 32) != 0 ? null : num);
        }

        public final android.os.Bundle AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, TransactionInfo transactionInfo, boolean z, java.util.ArrayList<java.lang.Long> arrayList, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("from", str);
            bundle.putString("wallet_id", str2);
            bundle.putParcelable("send_scan_info", transactionInfo);
            bundle.putBoolean("is_first_time_use", z);
            bundle.putLongArray("chain_list", arrayList != null ? CollectionsKt___CollectionsKt.AuCTel((java.util.Collection<java.lang.Long>) arrayList) : null);
            bundle.putInt("multi_transfer_mode", num != null ? num.intValue() : MultiTransferMode.MODE_NONE.getValue());
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C20708glw values() {
        return (C20708glw) this.AhwBna.getValue();
    }

    public static final C20708glw gEmmrt(C20634gkb c20634gkb) {
        if (c20634gkb.KWHzl()) {
            androidx.fragment.app.Fragment fragmentRequireParentFragment = c20634gkb.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
            return (C20708glw) new ViewModelProvider(fragmentRequireParentFragment).get(C20708glw.class);
        }
        C20690gle c20690gle = C20690gle.OLrzqt;
        FragmentActivity fragmentActivityRequireActivity = c20634gkb.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (C20708glw) c20690gle.AEQbTJ(fragmentActivityRequireActivity, C20708glw.class);
    }

    public final InterfaceC17407fEe valueOf() {
        return (InterfaceC17407fEe) this.fetchVPNInfo.getValue();
    }

    public static final C17403fEa fetchVPNInfo(C20634gkb c20634gkb) {
        return new C17403fEa(ContextCompat.getColor(c20634gkb.requireContext(), C52761wXj.Activity.fkESqH));
    }

    public static final void OLrzqt(C20634gkb c20634gkb, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c20634gkb.AYXKKw();
        }
    }

    public static final void EZpvd(C20634gkb c20634gkb, java.lang.Integer num) {
        if (num != null && num.intValue() == -1) {
            AbstractC57212yeE.close$default(c20634gkb, null, 1, null);
        }
    }

    private final boolean isConnected() {
        return ensureArguments().getBoolean("is_first_time_use", false);
    }

    public final boolean djBIcL() {
        return ((java.lang.Boolean) this.isConnected.getValue()).booleanValue();
    }

    public static final boolean gEmmrt() {
        if (C34703nhO.copydefault()) {
            return C17304fAj.EZpvd.getFieldNames();
        }
        return C17304fAj.EZpvd.ejfBZ();
    }

    @Override // o.AbstractC14668dpm
    public android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.KWHzl = (AbstractC16620enP) DataBindingUtil.inflate(android.view.LayoutInflater.from(viewGroup.getContext()), C13754dXa.TaskDescription.invokespecialRtjmuc, viewGroup, false);
        fJNWhG();
        EZpvd(false);
        EZpvd(C13754dXa.FragmentManager.OxbLUn);
        fIwbmz();
        fARcdN();
        AkhnZx();
        AbstractC16620enP abstractC16620enP = this.KWHzl;
        if (abstractC16620enP != null) {
            return abstractC16620enP.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC20518giR, o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (values().AuCTel()) {
            java.lang.Integer numAEQbTJ = values().AEQbTJ();
            int value = MultiTransferMode.MODE_NONE.getValue();
            if (numAEQbTJ == null || numAEQbTJ.intValue() != value) {
                C32866mlf.onEvent$default("AppMultisender_TokenChainSelection_TokenList_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            }
            C32866mlf.onEvent$default("ReceiveSelectCrypto_Btm_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        } else if (values().ejfBZ()) {
            java.lang.Integer numAEQbTJ2 = values().AEQbTJ();
            int value2 = MultiTransferMode.MODE_NONE.getValue();
            if (numAEQbTJ2 == null || numAEQbTJ2.intValue() != value2) {
                C32866mlf.onEvent$default("AppMultisender_TokenChainSelection_TokenList_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            }
            C32866mlf.onEvent$default("SendSelectCrypto_Btm_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, getViewLifecycleOwner(), false, new Function1() { // from class: o.gkc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20634gkb.AEQbTJ(this.AEQbTJ, (OnBackPressedCallback) obj);
            }
        }, 2, null);
    }

    public static final Unit AEQbTJ(C20634gkb c20634gkb, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        if (c20634gkb.values().AuCTel()) {
            C14494dmX.KWHzl.EZpvd("ReceiveSelectCrypto_Btm_Button_Click", "return");
        } else if (c20634gkb.values().ejfBZ()) {
            C14494dmX.KWHzl.EZpvd("SendSelectCrypto_Btm_Button_Click", "return");
        }
        onBackPressedCallback.setEnabled(false);
        c20634gkb.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        C55230xfy c55230xfy2;
        OKEditText oKEditTextKWHzl2;
        super.setListener();
        AbstractC16620enP abstractC16620enP = this.KWHzl;
        if (abstractC16620enP != null && (c55230xfy2 = abstractC16620enP.OLrzqt) != null && (oKEditTextKWHzl2 = c55230xfy2.KWHzl()) != null) {
            oKEditTextKWHzl2.addTextChangedListener(new ActionBar());
        }
        AbstractC16620enP abstractC16620enP2 = this.KWHzl;
        if (abstractC16620enP2 == null || (c55230xfy = abstractC16620enP2.OLrzqt) == null || (oKEditTextKWHzl = c55230xfy.KWHzl()) == null) {
            return;
        }
        oKEditTextKWHzl.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.gkT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C20634gkb.copydefault(this.AEQbTJ, view, z);
            }
        });
    }

    public static final void copydefault(C20634gkb c20634gkb, android.view.View view, boolean z) {
        if (z) {
            FragmentActivity activity = c20634gkb.getActivity();
            ActivityC20522giV activityC20522giV = activity instanceof ActivityC20522giV ? (ActivityC20522giV) activity : null;
            if (activityC20522giV != null) {
                activityC20522giV.EZpvd();
            }
            if (c20634gkb.values().AuCTel()) {
                C14494dmX.KWHzl.EZpvd("ReceiveSelectCrypto_Btm_Button_Click", "search");
            } else if (c20634gkb.values().ejfBZ()) {
                C14494dmX.KWHzl.EZpvd("SendSelectCrypto_Btm_Button_Click", "search");
            }
        }
    }

    private final void fIwbmz() {
        C55230xfy c55230xfy;
        RecyclerView recyclerView;
        C33546myW c33546myW;
        AbstractC16620enP abstractC16620enP = this.KWHzl;
        if (abstractC16620enP != null && (c33546myW = abstractC16620enP.AEQbTJ) != null) {
            c33546myW.djBIcL(false);
            if (values().AuCTel() && values().djBIcL()) {
                c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.gkE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC57900yrD
                    public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                        C20634gkb.AEQbTJ(this.AEQbTJ, interfaceC57934yrl);
                    }
                });
            }
            c33546myW.AhwBna(false);
        }
        this.OLrzqt = new C59534zip();
        AbstractC16620enP abstractC16620enP2 = this.KWHzl;
        if (abstractC16620enP2 != null && (recyclerView = abstractC16620enP2.EZpvd) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.OLrzqt);
        }
        AbstractC16620enP abstractC16620enP3 = this.KWHzl;
        if (abstractC16620enP3 == null || (c55230xfy = abstractC16620enP3.OLrzqt) == null) {
            return;
        }
        c55230xfy.setVisibility(0);
    }

    public static final void AEQbTJ(C20634gkb c20634gkb, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c20634gkb.values().zLjUOn();
    }

    private final void fJNWhG() {
        java.lang.String string = ensureArguments().getString("wallet_id");
        java.lang.String str = string == null ? "" : string;
        java.lang.String string2 = ensureArguments().getString("from");
        java.lang.String str2 = string2 == null ? "" : string2;
        TransactionInfo transactionInfo = (TransactionInfo) ensureArguments().getParcelable("send_scan_info");
        long[] longArray = ensureArguments().getLongArray("chain_list");
        values().copydefault(str2, str, transactionInfo, longArray == null ? null : new java.util.ArrayList<>(yDV.OLrzqt(longArray)), java.lang.Integer.valueOf(ensureArguments().getInt("multi_transfer_mode")));
    }

    private final void fARcdN() {
        C59534zip c59534zip = this.OLrzqt;
        if (c59534zip != null) {
            c59534zip.register(C20598gjs.class, new Activity(this, !values().getFieldNames(), new Function1() { // from class: o.gkP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20634gkb.OLrzqt(this.EZpvd, (C20598gjs) obj);
                }
            }));
        }
        C59534zip c59534zip2 = this.OLrzqt;
        if (c59534zip2 != null) {
            c59534zip2.register(WalletSearchEmpty.class, new C19224fxJ());
        }
        C59534zip c59534zip3 = this.OLrzqt;
        if (c59534zip3 != null) {
            c59534zip3.register(C19222fxH.class, new C19218fxD(djBIcL(), new Function0() { // from class: o.gkV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20634gkb.djBIcL(this.OLrzqt);
                }
            }));
        }
        AuCTel();
    }

    public static final Unit OLrzqt(final C20634gkb c20634gkb, final C20598gjs c20598gjs) {
        java.util.List<java.lang.Long> listEZpvd;
        C55230xfy c55230xfy;
        Intrinsics.checkNotNullParameter(c20598gjs, "");
        android.content.Context contextRequireContext = c20634gkb.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        AbstractC16620enP abstractC16620enP = c20634gkb.KWHzl;
        C33054mpH.OLrzqt(contextRequireContext, abstractC16620enP != null ? abstractC16620enP.OLrzqt : null);
        AbstractC16620enP abstractC16620enP2 = c20634gkb.KWHzl;
        if (abstractC16620enP2 != null && (c55230xfy = abstractC16620enP2.OLrzqt) != null) {
            c55230xfy.clearFocus();
        }
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(java.lang.Long.valueOf(c20598gjs.gEmmrt()));
        C10856bwO.copydefault(c20634gkb.getTAG(), 0, "click " + (c10854bwMKWHzl != null ? c10854bwMKWHzl.fJNWhG() : null));
        WalletSelectedChainBean walletSelectedChainBeanFARcdN = c20634gkb.values().fARcdN();
        if (walletSelectedChainBeanFARcdN != null && !walletSelectedChainBeanFARcdN.isSingleMode() && c10854bwMKWHzl == null) {
            c20634gkb.showLoading();
            C10862bwU c10862bwUAYXKKw = c10954byG.AYXKKw();
            if (c20598gjs.ejfBZ()) {
                listEZpvd = c20598gjs.EZpvd();
                if (listEZpvd == null) {
                    listEZpvd = yDY.AhwBna();
                }
            } else {
                listEZpvd = C56402yEa.EZpvd(java.lang.Long.valueOf(c20598gjs.gEmmrt()));
            }
            C33024moe.subscribeOnIO$default(c10862bwUAYXKKw.AEQbTJ(listEZpvd), new Function1() { // from class: o.gkR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20634gkb.EZpvd(this.EZpvd, (java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.gkQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20634gkb.copydefault(this.OLrzqt, c20598gjs, ((java.lang.Boolean) obj).booleanValue());
                }
            }, 2, (java.lang.Object) null);
        } else {
            OLrzqt(c20634gkb, c20598gjs, c10854bwMKWHzl);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(final C20634gkb c20634gkb, final C20598gjs c20598gjs, final C10854bwM c10854bwM) {
        C10854bwM c10854bwMKWHzl;
        C10854bwM c10854bwMKWHzl2;
        C10854bwM c10854bwMKWHzl3;
        java.lang.String str;
        C10854bwM c10854bwMKWHzl4;
        C10854bwM c10854bwMKWHzl5;
        C10854bwM c10854bwMKWHzl6;
        C10854bwM c10854bwMKWHzl7;
        c20634gkb.copydefault(c20598gjs, c10854bwM);
        if (c20598gjs.ejfBZ()) {
            c20634gkb.copydefault(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null);
            c20634gkb.KWHzl(c20598gjs.values());
            return;
        }
        if (c20634gkb.values().AuCTel()) {
            c20634gkb.OLrzqt(c20598gjs, c10854bwM, new TransferSelectCoinFragment$registerAdapter$1$handleClickLogic$1(c20598gjs, c20634gkb, c10854bwM));
            return;
        }
        if (c20634gkb.values().AEQbTJ() != null) {
            java.lang.Integer numAEQbTJ = c20634gkb.values().AEQbTJ();
            int value = MultiTransferMode.MODE_NONE.getValue();
            if (numAEQbTJ == null || numAEQbTJ.intValue() != value) {
                android.content.Context context = c20634gkb.getContext();
                if (context == null) {
                    return;
                }
                if (c10854bwM != null && (c10854bwMKWHzl7 = c10854bwM.KWHzl()) != null && c10854bwMKWHzl7.QCjLjM()) {
                    C55326xho.toast$default(C13754dXa.FragmentManager.Dmq, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    return;
                } else {
                    c20634gkb.OLrzqt(context, c20598gjs.fJNWhG(), c20598gjs.gEmmrt());
                    return;
                }
            }
        }
        if (c20598gjs.fetchVPNInfo()) {
            TransactionInfo transactionInfoAYXKKw = c20634gkb.values().AYXKKw();
            if (transactionInfoAYXKKw != null) {
                transactionInfoAYXKKw.setTokenId(java.lang.String.valueOf(c20598gjs.gEmmrt()));
            }
            java.lang.String str2 = "";
            if (c10854bwM != null && (c10854bwMKWHzl6 = c10854bwM.KWHzl()) != null && c10854bwMKWHzl6.heceqZ()) {
                if (C33129mqd.valueOf(c20598gjs.KWHzl(), "0")) {
                    C10854bwM c10854bwMKWHzl8 = c10854bwM.KWHzl();
                    if (c10854bwMKWHzl8 != null) {
                        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(c20598gjs.fJNWhG(), c10854bwMKWHzl8.AEQbTJ(), null, 2, null);
                        java.lang.String address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
                        if (address != null) {
                            str2 = address;
                        }
                    }
                    AEQbTJ(c10854bwM, c20634gkb, c20598gjs, str2);
                    return;
                }
                c20634gkb.KWHzl(c20598gjs.fJNWhG(), c10854bwM, new Function0() { // from class: o.gkW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C20634gkb.KWHzl(c10854bwM, c20598gjs, c20634gkb);
                    }
                });
                return;
            }
            if (c10854bwM != null && (c10854bwMKWHzl5 = c10854bwM.KWHzl()) != null && c10854bwMKWHzl5.hCLrkq()) {
                c20634gkb.KWHzl(c20598gjs.fJNWhG(), c10854bwM, new Function0() { // from class: o.gkY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C20634gkb.copydefault(c10854bwM, c20598gjs, c20634gkb);
                    }
                });
                return;
            }
            if (c10854bwM != null && (c10854bwMKWHzl4 = c10854bwM.KWHzl()) != null && c10854bwMKWHzl4.DCUTEIdCUTEI()) {
                c20634gkb.KWHzl(c20598gjs.fJNWhG(), c10854bwM, new Function0() { // from class: o.gkX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C20634gkb.valueOf(c10854bwM, c20598gjs, c20634gkb);
                    }
                });
                return;
            }
            if (c10854bwM != null && c10854bwM.hUfVAv()) {
                android.content.Context context2 = c20634gkb.getContext();
                if (context2 != null) {
                    if (c20598gjs.gEmmrt() == 0 || c20598gjs.gEmmrt() == -1) {
                        C10856bwO.EZpvd(c20634gkb.getTAG(), new OKWException("coinId:" + c20598gjs.gEmmrt() + " is invalid, coinSymbol:" + c10854bwM.fJNWhG() + ", realCoinId:" + c10854bwM.AhwBna(), null));
                    }
                    if (c10854bwM.dxcTrN() && c20598gjs.fJNWhG().DGOPHZ()) {
                        C20526giZ c20526giZOLrzqt = c20634gkb.OLrzqt(c20598gjs.fJNWhG(), c20598gjs.gEmmrt());
                        if (c20526giZOLrzqt.KWHzl() > 1) {
                            java.lang.String strDbNXlk = c20598gjs.fJNWhG().DbNXlk();
                            long jAEQbTJ = c10854bwM.AEQbTJ();
                            long jGEmmrt = c20598gjs.gEmmrt();
                            C10854bwM c10854bwMKWHzl9 = c10854bwM.KWHzl();
                            c20634gkb.OLrzqt(strDbNXlk, jAEQbTJ, jGEmmrt, c10854bwMKWHzl9 != null ? c10854bwMKWHzl9.djBIcL() : null, false);
                            return;
                        }
                        c20634gkb.AEQbTJ(context2, c20598gjs.gEmmrt(), c20598gjs.fJNWhG().DbNXlk(), c20634gkb.values().AYXKKw(), c20526giZOLrzqt.OLrzqt());
                        return;
                    }
                    long jGEmmrt2 = c20598gjs.gEmmrt();
                    java.lang.String strDbNXlk2 = c20598gjs.fJNWhG().DbNXlk();
                    TransactionInfo transactionInfoAYXKKw2 = c20634gkb.values().AYXKKw();
                    C10854bwM c10854bwMKWHzl10 = c10854bwM.KWHzl();
                    if (c10854bwMKWHzl10 != null) {
                        ChainAddress chainAddressAddressFromChainId$default2 = AbstractC12782ctV.addressFromChainId$default(c20598gjs.fJNWhG(), c10854bwMKWHzl10.AEQbTJ(), null, 2, null);
                        java.lang.String address2 = chainAddressAddressFromChainId$default2 != null ? chainAddressAddressFromChainId$default2.getAddress() : null;
                        str = address2 == null ? "" : address2;
                    }
                    c20634gkb.AEQbTJ(context2, jGEmmrt2, strDbNXlk2, transactionInfoAYXKKw2, str);
                    return;
                }
                return;
            }
            if (c10854bwM != null && (c10854bwMKWHzl3 = c10854bwM.KWHzl()) != null && c10854bwMKWHzl3.QCjLjM()) {
                C55326xho.toast$default(C13754dXa.FragmentManager.Dmq, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return;
            }
            if (c20598gjs.fJNWhG().getFieldNames() && c10854bwM != null && c10854bwM.QHmsKR()) {
                C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.setPosition, 0, 1, (java.lang.Object) null);
                return;
            }
            if (c10854bwM != null && c10854bwM.dxcTrN() && c20598gjs.fJNWhG().DGOPHZ()) {
                C20526giZ c20526giZOLrzqt2 = c20634gkb.OLrzqt(c20598gjs.fJNWhG(), c20598gjs.gEmmrt());
                if (c20526giZOLrzqt2.KWHzl() > 1) {
                    java.lang.String strDbNXlk3 = c20598gjs.fJNWhG().DbNXlk();
                    long jAEQbTJ2 = c10854bwM.AEQbTJ();
                    long jGEmmrt3 = c20598gjs.gEmmrt();
                    C10854bwM c10854bwMKWHzl11 = c10854bwM.KWHzl();
                    c20634gkb.OLrzqt(strDbNXlk3, jAEQbTJ2, jGEmmrt3, c10854bwMKWHzl11 != null ? c10854bwMKWHzl11.djBIcL() : null, false);
                    return;
                }
                if (c20598gjs.fJNWhG().AxsJAY() && (c10854bwMKWHzl2 = c10854bwM.KWHzl()) != null && c10854bwMKWHzl2.iRxXKY()) {
                    C8322bAY c8322bAY = C8322bAY.KWHzl;
                    C10854bwM c10854bwMKWHzl12 = c10854bwM.KWHzl();
                    if (c8322bAY.KWHzl(c10854bwMKWHzl12 != null ? c10854bwMKWHzl12.fetchVPNInfo() : -1L, c20526giZOLrzqt2.OLrzqt()) == AddressType.P2TRType.getValue()) {
                        java.lang.String string = c20634gkb.getString(C13754dXa.FragmentManager.reportWhenCompleteforInline);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        C55326xho.toastWithFailedIcon$default(string, 0, 1, (java.lang.Object) null);
                        return;
                    }
                }
                AEQbTJ(c10854bwM, c20634gkb, c20598gjs, c20526giZOLrzqt2.OLrzqt());
                return;
            }
            if (c10854bwM != null && (c10854bwMKWHzl = c10854bwM.KWHzl()) != null) {
                ChainAddress chainAddressAddressFromChainId$default3 = AbstractC12782ctV.addressFromChainId$default(c20598gjs.fJNWhG(), c10854bwMKWHzl.AEQbTJ(), null, 2, null);
                java.lang.String address3 = chainAddressAddressFromChainId$default3 != null ? chainAddressAddressFromChainId$default3.getAddress() : null;
                if (address3 != null) {
                    str2 = address3;
                }
            }
            AEQbTJ(c10854bwM, c20634gkb, c20598gjs, str2);
            return;
        }
        C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(c20634gkb, C13754dXa.FragmentManager.getExtraBinder, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainname", c20598gjs.copydefault()))), 0, 1, (java.lang.Object) null);
    }

    public static /* synthetic */ void registerAdapter$lambda$32$handleClickLogic$toReceiveCoin$default(C20598gjs c20598gjs, C20634gkb c20634gkb, C10854bwM c10854bwM, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        KWHzl(c20598gjs, c20634gkb, c10854bwM, str);
    }

    public static /* synthetic */ void registerAdapter$lambda$32$handleClickLogic$toReceiveCoin$generateToReceiveCoin$default(C10854bwM c10854bwM, C20634gkb c20634gkb, C20598gjs c20598gjs, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        EZpvd(c10854bwM, c20634gkb, c20598gjs, str);
    }

    public static final void EZpvd(C10854bwM c10854bwM, final C20634gkb c20634gkb, C20598gjs c20598gjs, java.lang.String str) {
        C10854bwM c10854bwMKWHzl;
        if (c10854bwM != null && (c10854bwMKWHzl = c10854bwM.KWHzl()) != null && c10854bwMKWHzl.QCjLjM()) {
            C55326xho.toast$default(C13754dXa.FragmentManager.Dmq, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        if (c20634gkb.KWHzl()) {
            AbstractC57212yeE.addFragment$default(c20634gkb, ViewOnClickListenerC20995grR.Companion.copydefault(c20598gjs.fJNWhG().DbNXlk(), java.lang.String.valueOf(c20598gjs.gEmmrt()), (1772 & 4) != 0 ? false : false, (1772 & 8) != 0 ? "" : null, (1772 & 16) != 0 ? false : c20634gkb.isConnected(), (1772 & 32) != 0 ? false : false, (1772 & 64) != 0 ? -1 : 0, (1772 & 128) != 0 ? -1L : 0L, (1772 & 256) != 0 ? "" : str, (1772 & 512) != 0 ? 1 : 0, (1772 & 1024) != 0 ? null : null), false, false, 6, null);
            return;
        }
        C9694baS.Application application = C9694baS.Companion;
        ActivityC20997grT.ActionBar actionBar = ActivityC20997grT.Companion;
        android.content.Context context = c20634gkb.getContext();
        if (context == null) {
            return;
        }
        application.KWHzl(c20634gkb, actionBar.AEQbTJ(context, c20598gjs.fJNWhG().DbNXlk(), java.lang.String.valueOf(c20598gjs.gEmmrt()), c20634gkb.isConnected(), str), new Function2() { // from class: o.gkL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20634gkb.values(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit values(C20634gkb c20634gkb, int i, android.content.Intent intent) {
        if (i == -1) {
            c20634gkb.AEQbTJ(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(final C20598gjs c20598gjs, final C20634gkb c20634gkb, final C10854bwM c10854bwM, final java.lang.String str) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOLrzqt = fPV.OLrzqt.OLrzqt(c20598gjs.gEmmrt(), c20598gjs.fJNWhG());
        final Function1 function1 = new Function1() { // from class: o.gkv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20634gkb.KWHzl(this.AEQbTJ, str, c10854bwM, c20598gjs, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gkz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20634gkb.fIwbmz(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gkD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20634gkb.OLrzqt(this.OLrzqt, str, c10854bwM, c20598gjs, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gkC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20634gkb.fJNWhG(function12, obj);
            }
        });
        Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
        c20634gkb.addDisposable(interfaceC58217yxCAEQbTJ);
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C20634gkb c20634gkb, java.lang.String str, C10854bwM c10854bwM, C20598gjs c20598gjs, kotlin.Pair pair) {
        c20634gkb.dismissLoading();
        EZpvd(c10854bwM, c20634gkb, c20598gjs, str);
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C20634gkb c20634gkb, java.lang.String str, C10854bwM c10854bwM, C20598gjs c20598gjs, java.lang.Throwable th) {
        c20634gkb.dismissLoading();
        EZpvd(c10854bwM, c20634gkb, c20598gjs, str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void registerAdapter$lambda$32$handleClickLogic$toInputAddress$default(C10854bwM c10854bwM, C20634gkb c20634gkb, C20598gjs c20598gjs, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        AEQbTJ(c10854bwM, c20634gkb, c20598gjs, str);
    }

    public static final void AEQbTJ(C10854bwM c10854bwM, final C20634gkb c20634gkb, C20598gjs c20598gjs, java.lang.String str) {
        C10854bwM c10854bwMKWHzl;
        if (c10854bwM != null && (c10854bwMKWHzl = c10854bwM.KWHzl()) != null && c10854bwMKWHzl.QCjLjM()) {
            C55326xho.toast$default(C13754dXa.FragmentManager.Dmq, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        if (c20634gkb.KWHzl()) {
            AbstractC57212yeE.addFragment$default(c20634gkb, TransferInputAddressFragment.Companion.OLrzqt(c20598gjs.fJNWhG().DbNXlk(), java.lang.String.valueOf(c20598gjs.gEmmrt()), c20634gkb.values().AYXKKw(), "from_home", (48 & 16) != 0 ? "" : null, (48 & 32) != 0 ? null : null, str == null ? "" : str), false, false, 6, null);
            return;
        }
        android.content.Context context = c20634gkb.getContext();
        if (context == null) {
            return;
        }
        C9694baS.Companion.KWHzl(c20634gkb, gFI.Companion.EZpvd(context, c20598gjs.fJNWhG().DbNXlk(), java.lang.String.valueOf(c20598gjs.gEmmrt()), c20634gkb.values().AYXKKw(), "from_home", (96 & 32) != 0 ? "" : null, (96 & 64) != 0 ? null : null, str == null ? "" : str), new Function2() { // from class: o.gkq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20634gkb.valueOf(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit valueOf(C20634gkb c20634gkb, int i, android.content.Intent intent) {
        if (i == -1) {
            c20634gkb.AEQbTJ(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(C10854bwM c10854bwM, C20598gjs c20598gjs, C20634gkb c20634gkb) {
        java.lang.String address;
        C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
        if (c10854bwMKWHzl != null) {
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(c20598gjs.fJNWhG(), c10854bwMKWHzl.AEQbTJ(), null, 2, null);
            address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
            if (address == null) {
                address = "";
            }
        }
        AEQbTJ(c10854bwM, c20634gkb, c20598gjs, address);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(C10854bwM c10854bwM, C20598gjs c20598gjs, C20634gkb c20634gkb) {
        java.lang.String address;
        C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
        if (c10854bwMKWHzl != null) {
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(c20598gjs.fJNWhG(), c10854bwMKWHzl.AEQbTJ(), null, 2, null);
            address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
            if (address == null) {
                address = "";
            }
        }
        AEQbTJ(c10854bwM, c20634gkb, c20598gjs, address);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit valueOf(C10854bwM c10854bwM, C20598gjs c20598gjs, C20634gkb c20634gkb) {
        java.lang.String address;
        C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
        if (c10854bwMKWHzl != null) {
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(c20598gjs.fJNWhG(), c10854bwMKWHzl.AEQbTJ(), null, 2, null);
            address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
            if (address == null) {
                address = "";
            }
        }
        AEQbTJ(c10854bwM, c20634gkb, c20598gjs, address);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C20634gkb c20634gkb, C20598gjs c20598gjs, boolean z) {
        c20634gkb.dismissLoading();
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(c20598gjs.gEmmrt()));
        if (z && c10854bwMKWHzl != null) {
            OLrzqt(c20634gkb, c20598gjs, c10854bwMKWHzl);
        } else {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.skipToQueueItem), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C20634gkb c20634gkb, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c20634gkb.dismissLoading();
        C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.skipToQueueItem), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C20634gkb c20634gkb) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c20634gkb), null, null, new TransferSelectCoinFragment$registerAdapter$2$1(null), 3, null);
        c20634gkb.AhwBna();
        C14494dmX.KWHzl.EZpvd("ReceiveSelectCrypto_Btm_Button_Click", "exchange_withdraw");
        return Unit.INSTANCE;
    }

    private final void AuCTel() {
        SharedFlow<java.lang.String> sharedFlowGEmmrt = values().gEmmrt();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowGEmmrt, lifecycle, null, 2, null), new TransferSelectCoinFragment$observeData$1(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<kotlin.Pair<java.lang.String, java.lang.String>> sharedFlowAhwBna = values().AhwBna();
        Lifecycle lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowAhwBna, lifecycle2, null, 2, null), new TransferSelectCoinFragment$observeData$2(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<java.lang.String> sharedFlowValueOf = values().valueOf();
        Lifecycle lifecycle3 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle3, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowValueOf, lifecycle3, null, 2, null), new TransferSelectCoinFragment$observeData$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final void copydefault(java.lang.Long l) {
        final C10854bwM c10854bwMKWHzl;
        if (values().AEQbTJ() != null) {
            java.lang.Integer numAEQbTJ = values().AEQbTJ();
            int value = MultiTransferMode.MODE_NONE.getValue();
            if ((numAEQbTJ != null && numAEQbTJ.intValue() == value) || (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(l)) == null) {
                return;
            }
            C32866mlf.onEvent$default("AppMultisender_TokenChainSelection_TokenList_Select", (TrackChannel[]) null, new Function1() { // from class: o.gkk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20634gkb.KWHzl(c10854bwMKWHzl, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit KWHzl(C10854bwM c10854bwM, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("token", c10854bwM.fJNWhG(), false);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final C20598gjs c20598gjs, C10854bwM c10854bwM, final Function1<? super java.lang.String, Unit> function1) {
        java.lang.String str;
        java.lang.String address;
        str = "";
        if (c20598gjs.fARcdN()) {
            ChainAddress chainAddressOLrzqt = c20598gjs.fJNWhG().OLrzqt(java.lang.Long.valueOf(c20598gjs.gEmmrt()));
            address = chainAddressOLrzqt != null ? chainAddressOLrzqt.getAddress() : null;
            function1.invoke(address != null ? address : "");
            return;
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(c20598gjs.gEmmrt());
        final java.lang.Long lValueOf = c10854bwMKWHzl != null ? java.lang.Long.valueOf(c10854bwMKWHzl.AEQbTJ()) : null;
        if (c20598gjs.fJNWhG().AhwBna(lValueOf)) {
            if (c20598gjs.fJNWhG().djSkpj() && c10854bwM != null && c10854bwM.DBxZfM()) {
                KWHzl(c20598gjs.fJNWhG(), c10854bwM, new Function0() { // from class: o.gkU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C20634gkb.AEQbTJ(function1, lValueOf, c20598gjs);
                    }
                });
                return;
            }
            if (c10854bwM != null && c10854bwM.dxcTrN() && c20598gjs.fJNWhG().DGOPHZ()) {
                java.lang.String strDbNXlk = c20598gjs.fJNWhG().DbNXlk();
                long jAEQbTJ = c10854bwM.AEQbTJ();
                long jGEmmrt = c20598gjs.gEmmrt();
                C10854bwM c10854bwMKWHzl2 = c10854bwM.KWHzl();
                OLrzqt(strDbNXlk, jAEQbTJ, jGEmmrt, c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.djBIcL() : null, true);
                return;
            }
            if (lValueOf != null) {
                ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(c20598gjs.fJNWhG(), lValueOf.longValue(), null, 2, null);
                address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
                if (address != null) {
                    str = address;
                }
            }
            function1.invoke(str);
            return;
        }
        C9930beq c9930beqEZpvd = C9930beq.Companion.EZpvd(c20598gjs.gEmmrt());
        c9930beqEZpvd.copydefault(new Function1() { // from class: o.glb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20634gkb.OLrzqt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c9930beqEZpvd.show(getChildFragmentManager(), getTAG());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(Function1 function1, java.lang.Long l, C20598gjs c20598gjs) {
        java.lang.String address;
        if (l != null) {
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(c20598gjs.fJNWhG(), l.longValue(), null, 2, null);
            address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
            if (address == null) {
                address = "";
            }
        }
        function1.invoke(address);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final C20634gkb c20634gkb, boolean z) {
        if (c20634gkb.values().AkhnZx().length() == 0) {
            c20634gkb.values().fetchVPNInfo().copydefault();
        } else {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtAubY = c20634gkb.values().AubY();
            final Function1 function1 = new Function1() { // from class: o.gks
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20634gkb.AEQbTJ(this.OLrzqt, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gku
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20634gkb.values(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.gkr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20634gkb.copydefault((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtAubY.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gky
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20634gkb.ejfBZ(function12, obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C20634gkb c20634gkb, AbstractC12782ctV abstractC12782ctV) {
        c20634gkb.values().KWHzl(c20634gkb.values().AkhnZx());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void copydefault(C20598gjs c20598gjs, final C10854bwM c10854bwM) {
        final java.lang.String str = (c20598gjs.ejfBZ() || (c10854bwM != null && c10854bwM.dxcTrN())) ? "yes" : "no";
        if (values().AuCTel()) {
            C32866mlf.onEvent$default("Web3ReceiveCoin_SelectCoin_Card_Click", (TrackChannel[]) null, new Function1() { // from class: o.gkd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20634gkb.KWHzl(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C14494dmX.KWHzl.EZpvd("ReceiveSelectCrypto_Btm_Button_Click", "select_crypto");
        } else if (values().ejfBZ()) {
            C32866mlf.onEvent$default("Web3SendCoin_SelectCoin_Card_Click", (TrackChannel[]) null, new Function1() { // from class: o.gko
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20634gkb.EZpvd(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C32866mlf.onEvent$default("SelectCrypto_Landing_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.gkw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20634gkb.EZpvd(c10854bwM, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C14494dmX.KWHzl.EZpvd("SendSelectCrypto_Btm_Button_Click", "select_crypto");
        }
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("is_multichain", str, true);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("is_multichain", str, true);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C10854bwM c10854bwM, EventParamsList eventParamsList) {
        C10854bwM c10854bwMKWHzl;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String strFJNWhG = c10854bwM != null ? c10854bwM.fJNWhG() : null;
        if (strFJNWhG == null) {
            strFJNWhG = "";
        }
        eventParamsList.put("token_name", strFJNWhG, false);
        java.lang.String strDjBIcL = (c10854bwM == null || (c10854bwMKWHzl = c10854bwM.KWHzl()) == null) ? null : c10854bwMKWHzl.djBIcL();
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        eventParamsList.put("chain", strDjBIcL, false);
        java.lang.String strDNCPSb = c10854bwM != null ? c10854bwM.dNCPSb() : null;
        eventParamsList.put(MTCoreConstants.Protocol.KEY_PROTOCOL, strDNCPSb != null ? strDNCPSb : "", false);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void toBrc20SendActivity$default(C20634gkb c20634gkb, android.content.Context context, long j, java.lang.String str, TransactionInfo transactionInfo, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            transactionInfo = null;
        }
        TransactionInfo transactionInfo2 = transactionInfo;
        if ((i & 16) != 0) {
            str2 = "";
        }
        c20634gkb.AEQbTJ(context, j, str, transactionInfo2, str2);
    }

    public final void AEQbTJ(android.content.Context context, long j, java.lang.String str, TransactionInfo transactionInfo, java.lang.String str2) {
        C9694baS.Application application = C9694baS.Companion;
        ActivityC13789dYi.ActionBar actionBar = ActivityC13789dYi.Companion;
        if (str2 == null) {
            str2 = "";
        }
        application.KWHzl(this, actionBar.OLrzqt(context, j, str, transactionInfo, str2), new Function2() { // from class: o.gkt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20634gkb.fetchVPNInfo(this.copydefault, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit fetchVPNInfo(C20634gkb c20634gkb, int i, android.content.Intent intent) {
        if (i == -1) {
            c20634gkb.AEQbTJ(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str) {
        if (KWHzl()) {
            AbstractC57212yeE.addFragment$default(this, C20557gjD.Companion.OLrzqt(str, isConnected()), false, false, 6, null);
            return;
        }
        C9694baS.Application application = C9694baS.Companion;
        ActivityC20517giQ.StateListAnimator stateListAnimator = ActivityC20517giQ.Companion;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        application.KWHzl(this, stateListAnimator.EZpvd(context, str, isConnected()), new Function2() { // from class: o.gke
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20634gkb.isConnected(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit isConnected(C20634gkb c20634gkb, int i, android.content.Intent intent) {
        if (i == -1) {
            c20634gkb.AEQbTJ(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final java.lang.String str, final long j, final long j2, java.lang.String str2, final boolean z) {
        C21241gvz c21241gvz = C21241gvz.EZpvd;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c21241gvz.KWHzl(childFragmentManager, str2 != null ? str2 : "", getTAG(), new Function0() { // from class: o.gkK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20634gkb.AEQbTJ(this.AEQbTJ, j, j2, str, z);
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gjd.Activity.newInstance$default(o.gjd$Activity, long, long, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, com.okinc.business.defi.biz.core.scan.TransactionInfo, int, java.lang.Object):o.gjd */
    public static final Unit AEQbTJ(final C20634gkb c20634gkb, long j, long j2, java.lang.String str, boolean z) {
        if (c20634gkb.KWHzl()) {
            AbstractC57212yeE.addFragment$default(c20634gkb, C20583gjd.Companion.copydefault(j, j2, str, c20634gkb.values().KWHzl(), c20634gkb.isConnected(), (CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256 & 32) != 0 ? "" : null, (CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256 & 64) != 0 ? false : z, (CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256 & 128) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256 & 256) != 0 ? null : c20634gkb.values().AYXKKw()), false, false, 6, null);
        } else {
            C9694baS.Application application = C9694baS.Companion;
            ActivityC20582gjc.Application application2 = ActivityC20582gjc.Companion;
            android.content.Context context = c20634gkb.getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            application.KWHzl(c20634gkb, application2.AEQbTJ(context, j, j2, str, c20634gkb.values().KWHzl(), c20634gkb.isConnected(), (256 & 64) != 0 ? "" : null, (256 & 128) != 0 ? false : z, (256 & 256) != 0 ? false : false, (256 & 512) != 0 ? null : c20634gkb.values().AYXKKw()), new Function2() { // from class: o.gkS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C20634gkb.DbNXlk(this.KWHzl, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C20634gkb c20634gkb, int i, android.content.Intent intent) {
        if (i == -1) {
            c20634gkb.AEQbTJ(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        C21027grx c21027grx = C21027grx.copydefault;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c21027grx.OLrzqt(childFragmentManager, fragmentActivityRequireActivity, this.values, values().fIwbmz(), (128 & 16) != 0, (128 & 32) != 0 ? false : values().hDKMBd(), (128 & 64) != 0 ? true : true, (128 & 128) != 0 ? false : false, (128 & 256) != 0 ? null : new Function2() { // from class: o.gkl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20634gkb.AEQbTJ(this.KWHzl, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(C20634gkb c20634gkb, int i, boolean z) {
        java.lang.Object objM7377constructorimpl;
        if (i == 5) {
            if (C34703nhO.copydefault()) {
                c20634gkb.showLoading();
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(c20634gkb.values().fJNWhG());
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                Result.m7376boximpl(objM7377constructorimpl);
            } else {
                ActivityResultLauncher<android.content.Context> activityResultLauncher = c20634gkb.EZpvd;
                if (activityResultLauncher != null) {
                    activityResultLauncher.launch(c20634gkb.requireActivity());
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        C21027grx c21027grx = C21027grx.copydefault;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C21027grx.systemTestJudgeOrStartExchangeAssetsActivity$default(c21027grx, childFragmentManager, fragmentActivityRequireActivity, this.values, values().fIwbmz(), true, false, 32, null);
    }

    public final void AkhnZx() {
        AbstractC32952mnL<C20603gjx> abstractC32952mnLFetchVPNInfo = values().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC16620enP abstractC16620enP = this.KWHzl;
        abstractC32952mnLFetchVPNInfo.observe(viewLifecycleOwner, new StateListAnimator(abstractC16620enP != null ? abstractC16620enP.copydefault : null, values().fetchVPNInfo(), C13754dXa.ActionBar.awiJhF));
    }

    /* JADX INFO: renamed from: o.gkb$StateListAnimator */
    public static final class StateListAnimator extends AbstractC32992mnz<C20603gjx> {
        public StateListAnimator(C55237xgE c55237xgE, AbstractC32952mnL<C20603gjx> abstractC32952mnL, int i) {
            super(c55237xgE, abstractC32952mnL, i);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Z */
        @Override // o.AbstractC32992mnz
        public boolean KWHzl(C20603gjx c20603gjx) {
            Intrinsics.checkNotNullParameter(c20603gjx, "");
            return c20603gjx.AEQbTJ().isEmpty() && !c20603gjx.EZpvd();
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: copydefault, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void KWHzl(C20603gjx c20603gjx, android.view.View view) {
            C55230xfy c55230xfy;
            super.KWHzl(c20603gjx, view);
            AbstractC16620enP abstractC16620enP = C20634gkb.this.KWHzl;
            if (abstractC16620enP == null || (c55230xfy = abstractC16620enP.OLrzqt) == null) {
                return;
            }
            c55230xfy.setVisibility(8);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(C20603gjx c20603gjx, android.view.View view) {
            C33546myW c33546myW;
            C33546myW c33546myW2;
            AbstractC16620enP abstractC16620enP;
            C33546myW c33546myW3;
            C33546myW c33546myW4;
            C55230xfy c55230xfy;
            C55237xgE c55237xgE;
            C55237xgE c55237xgE2;
            C55230xfy c55230xfy2;
            C55230xfy c55230xfy3;
            C10854bwM c10854bwMKWHzl;
            C55230xfy c55230xfy4;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(c20603gjx, "");
            super.AEQbTJ(c20603gjx, view);
            AbstractC16620enP abstractC16620enP2 = C20634gkb.this.KWHzl;
            if (abstractC16620enP2 != null && (c55230xfy4 = abstractC16620enP2.OLrzqt) != null) {
                c55230xfy4.setVisibility(0);
            }
            if (!(!c20603gjx.AEQbTJ().isEmpty())) {
                C20634gkb.this.valueOf = true;
                C59534zip c59534zip = C20634gkb.this.OLrzqt;
                if (c59534zip != null) {
                    C33064mpR.OLrzqt(c59534zip, yDY.copydefault(new WalletSearchEmpty(C20634gkb.this.DbNXlk)));
                }
            } else {
                if (c20603gjx.AEQbTJ().size() == 1 && C20634gkb.this.values().AYXKKw() != null && C20634gkb.this.values().ejfBZ()) {
                    C20598gjs c20598gjs = (C20598gjs) CollectionsKt___CollectionsKt.AuCTelauCTel(c20603gjx.AEQbTJ());
                    TransactionInfo transactionInfoAYXKKw = C20634gkb.this.values().AYXKKw();
                    if (transactionInfoAYXKKw != null) {
                        transactionInfoAYXKKw.setTokenId(java.lang.String.valueOf(c20598gjs.gEmmrt()));
                    }
                    C10954byG c10954byG = C10954byG.EZpvd;
                    C10854bwM c10854bwMKWHzl2 = c10954byG.valueOf().KWHzl(java.lang.Long.valueOf(c20598gjs.gEmmrt()));
                    if (c10854bwMKWHzl2 == null || !c10854bwMKWHzl2.dxcTrN() || !c20598gjs.fJNWhG().DGOPHZ()) {
                        C20634gkb c20634gkb = C20634gkb.this;
                        if (c10854bwMKWHzl2 != null && (c10854bwMKWHzl = c10854bwMKWHzl2.KWHzl()) != null) {
                            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(c20598gjs.fJNWhG(), c10854bwMKWHzl.AEQbTJ(), null, 2, null);
                            java.lang.String address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
                            if (address != null) {
                                str = address;
                            }
                        }
                        c20634gkb.AEQbTJ(c20598gjs, str);
                    } else {
                        C20526giZ c20526giZOLrzqt = C20634gkb.this.OLrzqt(c20598gjs.fJNWhG(), c20598gjs.gEmmrt());
                        if (c20526giZOLrzqt.KWHzl() <= 1) {
                            C20634gkb.this.AEQbTJ(c20598gjs, c20526giZOLrzqt.OLrzqt());
                        } else {
                            C20634gkb c20634gkb2 = C20634gkb.this;
                            java.lang.String strDbNXlk = c20598gjs.fJNWhG().DbNXlk();
                            C10854bwM c10854bwMKWHzl3 = c10954byG.valueOf().KWHzl(java.lang.Long.valueOf(c20598gjs.gEmmrt()));
                            long jAEQbTJ = c10854bwMKWHzl3 != null ? c10854bwMKWHzl3.AEQbTJ() : 1L;
                            long jGEmmrt = c20598gjs.gEmmrt();
                            C10854bwM c10854bwMKWHzl4 = c10854bwMKWHzl2.KWHzl();
                            c20634gkb2.OLrzqt(strDbNXlk, jAEQbTJ, jGEmmrt, c10854bwMKWHzl4 != null ? c10854bwMKWHzl4.djBIcL() : null, false);
                        }
                    }
                }
                if (c20603gjx.AEQbTJ().size() >= 8) {
                    AbstractC16620enP abstractC16620enP3 = C20634gkb.this.KWHzl;
                    if (abstractC16620enP3 != null && (c55230xfy3 = abstractC16620enP3.OLrzqt) != null) {
                        c55230xfy3.setVisibility(0);
                    }
                } else {
                    AbstractC16620enP abstractC16620enP4 = C20634gkb.this.KWHzl;
                    if (abstractC16620enP4 != null && (c55230xfy2 = abstractC16620enP4.OLrzqt) != null) {
                        c55230xfy2.setVisibility(c20603gjx.EZpvd() ? 0 : 8);
                    }
                    AbstractC16620enP abstractC16620enP5 = C20634gkb.this.KWHzl;
                    if (abstractC16620enP5 != null && (c55230xfy = abstractC16620enP5.OLrzqt) != null && c55230xfy.getVisibility() == 8 && !C20634gkb.this.KWHzl()) {
                        AbstractC16620enP abstractC16620enP6 = C20634gkb.this.KWHzl;
                        ViewGroup.LayoutParams layoutParams = (abstractC16620enP6 == null || (c55237xgE2 = abstractC16620enP6.copydefault) == null) ? null : c55237xgE2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        if (marginLayoutParams != null) {
                            C20634gkb c20634gkb3 = C20634gkb.this;
                            marginLayoutParams.topMargin = 0;
                            AbstractC16620enP abstractC16620enP7 = c20634gkb3.KWHzl;
                            if (abstractC16620enP7 != null && (c55237xgE = abstractC16620enP7.copydefault) != null) {
                                c55237xgE.setLayoutParams(marginLayoutParams);
                            }
                        }
                    }
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(c20603gjx.AEQbTJ());
                if (C20634gkb.this.values().AuCTel() && C21027grx.copydefault.AEQbTJ() && C20634gkb.this.djBIcL()) {
                    arrayList.add(0, C19222fxH.OLrzqt);
                }
                C59534zip c59534zip2 = C20634gkb.this.OLrzqt;
                if (c59534zip2 != null) {
                    C33064mpR.OLrzqt(c59534zip2, arrayList);
                }
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C20634gkb.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            if (C20634gkb.this.values().wlaJM()) {
                AbstractC16620enP abstractC16620enP8 = C20634gkb.this.KWHzl;
                if (abstractC16620enP8 != null && (c33546myW4 = abstractC16620enP8.AEQbTJ) != null) {
                    c33546myW4.AhwBna(true);
                }
            } else {
                AbstractC16620enP abstractC16620enP9 = C20634gkb.this.KWHzl;
                if (abstractC16620enP9 != null && (c33546myW = abstractC16620enP9.AEQbTJ) != null) {
                    c33546myW.AhwBna(false);
                }
            }
            AbstractC16620enP abstractC16620enP10 = C20634gkb.this.KWHzl;
            if (abstractC16620enP10 == null || (c33546myW2 = abstractC16620enP10.AEQbTJ) == null || !C57589ylK.AEQbTJ(c33546myW2) || (abstractC16620enP = C20634gkb.this.KWHzl) == null || (c33546myW3 = abstractC16620enP.AEQbTJ) == null) {
                return;
            }
            c33546myW3.valueOf();
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void copydefault(C20603gjx c20603gjx, android.view.View view) {
            C55230xfy c55230xfy;
            Intrinsics.checkNotNullParameter(c20603gjx, "");
            super.copydefault(c20603gjx, view);
            AbstractC16620enP abstractC16620enP = C20634gkb.this.KWHzl;
            if (abstractC16620enP == null || (c55230xfy = abstractC16620enP.OLrzqt) == null) {
                return;
            }
            c55230xfy.setVisibility(8);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Throwable;Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void KWHzl(java.lang.Throwable th, C20603gjx c20603gjx, android.view.View view) {
            C55173xeu c55173xeu;
            Intrinsics.checkNotNullParameter(th, "");
            if (view != null && (c55173xeu = (C55173xeu) view.findViewById(C13754dXa.ActionBar.setMediaButtonReceiver)) != null) {
                c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplApi21));
                c55173xeu.setEmptyTypeImage(2);
                c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplApi212));
            }
            super.KWHzl(th, c20603gjx, view);
        }
    }

    public static /* synthetic */ void openInputAddressPage$default(C20634gkb c20634gkb, C20598gjs c20598gjs, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c20634gkb.AEQbTJ(c20598gjs, str);
    }

    public final void AEQbTJ(C20598gjs c20598gjs, java.lang.String str) {
        if (KWHzl()) {
            AbstractC57212yeE.addFragment$default(this, TransferInputAddressFragment.Companion.OLrzqt(c20598gjs.fJNWhG().DbNXlk(), java.lang.String.valueOf(c20598gjs.gEmmrt()), values().AYXKKw(), "from_home", (48 & 16) != 0 ? "" : null, (48 & 32) != 0 ? null : null, str == null ? "" : str), false, false, 6, null);
            return;
        }
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C9694baS.Companion.KWHzl(this, gFI.Companion.EZpvd(context, c20598gjs.fJNWhG().DbNXlk(), java.lang.String.valueOf(c20598gjs.gEmmrt()), values().AYXKKw(), "from_home", (96 & 32) != 0 ? "" : null, (96 & 64) != 0 ? null : null, str == null ? "" : str), new Function2() { // from class: o.gkx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20634gkb.gEmmrt(this.EZpvd, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit gEmmrt(C20634gkb c20634gkb, int i, android.content.Intent intent) {
        if (i == -1) {
            c20634gkb.AEQbTJ(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public final C20526giZ OLrzqt(AbstractC12782ctV abstractC12782ctV, long j) {
        java.util.List<C10525bqB> listAYXKKw = abstractC12782ctV.AYXKKw(j);
        int i = 0;
        java.lang.String strZuBGHE = "";
        if (listAYXKKw != null) {
            for (C10525bqB c10525bqB : listAYXKKw) {
                if (C33129mqd.AEQbTJ(c10525bqB.fIwbmz(), "0")) {
                    i++;
                    strZuBGHE = c10525bqB.zuBGHE();
                }
            }
        }
        return new C20526giZ(i, strZuBGHE);
    }

    public final void KWHzl(final AbstractC12782ctV abstractC12782ctV, final C10854bwM c10854bwM, final Function0<Unit> function0) {
        java.lang.String address;
        java.util.List<? extends ChainCheckType> listEZpvd;
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AEQbTJ(), null, 2, null);
        if (chainAddressAddressFromChainId$default == null || (address = chainAddressAddressFromChainId$default.getAddress()) == null) {
            address = "";
        }
        java.lang.String str = address;
        java.lang.String strOLrzqt = c10854bwM.OLrzqt();
        showLoadingAtOnce();
        C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.hCLrkq()) {
            listEZpvd = yDY.gEmmrt(ChainCheckType.CHECK_TRANSFER, ChainCheckType.CHECK_REGISTER);
        } else {
            listEZpvd = C56402yEa.EZpvd(ChainCheckType.CHECK_REGISTER);
        }
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(ChainStatusChecker.OLrzqt.OLrzqt(c10854bwM.AhwBna(), str, strOLrzqt, listEZpvd), this, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.gkG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20634gkb.copydefault(this.KWHzl, function0, abstractC12782ctV, c10854bwM, (ChainStatus) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gkN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20634gkb.DbNXlk(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gkM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20634gkb.OLrzqt(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gkO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20634gkb.isConnected(function12, obj);
            }
        });
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C20634gkb c20634gkb, Function0 function0, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, ChainStatus chainStatus) {
        c20634gkb.dismissLoading();
        int i = chainStatus == null ? -1 : TaskDescription.copydefault[chainStatus.ordinal()];
        if (i == 1) {
            function0.invoke();
        } else if (i == 2) {
            C14083dek.OLrzqt.KWHzl();
        } else if (i == 3) {
            C14083dek c14083dek = C14083dek.OLrzqt;
            android.content.Context context = c20634gkb.getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            androidx.fragment.app.FragmentManager childFragmentManager = c20634gkb.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C14083dek.handleUnregisteredStatus$default(c14083dek, context, childFragmentManager, abstractC12782ctV.DbNXlk(), c10854bwM.AhwBna(), null, 16, null);
        } else if (i == 4) {
            C14083dek.OLrzqt.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C20634gkb c20634gkb, java.lang.Throwable th) {
        c20634gkb.dismissLoading();
        Intrinsics.copydefault(th);
        C10857bwP.copydefault("TransferSelectCoinFragment", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gkb$Activity */
    public final class Activity extends AbstractC20512giL<C20598gjs> {
        public final /* synthetic */ C20634gkb AEQbTJ;
        public final boolean KWHzl;
        public final Function1<C20598gjs, Unit> OLrzqt;

        /* JADX INFO: renamed from: o.gkb$Activity$Application */
        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ButtonType.values().length];
                try {
                    iArr[ButtonType.CREATE_ACCOUNT_BUTTON.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ButtonType.ACTIVE_BUTTON.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                copydefault = iArr;
            }
        }

        @Override // o.AbstractC43310rmq
        public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, java.lang.Object obj) {
            onBindViewHolder((C43312rms<AbstractC16908esm>) c43312rms, (C20598gjs) obj);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.gjs, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(C20634gkb c20634gkb, @NotNull boolean z, Function1<? super C20598gjs, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = c20634gkb;
            this.KWHzl = z;
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.giL.Activity.hideCoinName$default(o.giL$Activity, o.esm, java.lang.Integer, int, java.lang.Object):void */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq, o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC16908esm> c43312rms, @NotNull final C20598gjs c20598gjs) {
            java.lang.String strIsConnected;
            java.lang.String strOLrzqt;
            C10854bwM c10854bwMKWHzl;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c20598gjs, "");
            super.onBindViewHolder((C43312rms) c43312rms, c20598gjs);
            ViewDataBinding viewDataBindingOLrzqt = c43312rms.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt, "");
            AbstractC16908esm abstractC16908esm = (AbstractC16908esm) viewDataBindingOLrzqt;
            C20634gkb c20634gkb = this.AEQbTJ;
            android.content.Context contextRequireContext = c20634gkb.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            java.lang.CharSequence charSequenceEZpvd = c20634gkb.EZpvd(contextRequireContext, c20598gjs.values());
            if (this.AEQbTJ.values().AuCTel() && c20598gjs.fJNWhG().gHZMYf() && (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(c20598gjs.gEmmrt()))) != null && c10854bwMKWHzl.AxsJAYaxsJAY()) {
                strIsConnected = C33070mpX.AYXKKw(C13754dXa.FragmentManager.GuardedBy);
            } else {
                strIsConnected = c20598gjs.isConnected();
            }
            AbstractC20512giL.AEQbTJ(abstractC16908esm, charSequenceEZpvd, strIsConnected);
            ViewDataBinding viewDataBindingOLrzqt2 = c43312rms.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt2, "");
            AbstractC20512giL.OLrzqt((AbstractC16908esm) viewDataBindingOLrzqt2, c20598gjs.AkhnZx());
            if (!c20598gjs.fARcdN()) {
                strOLrzqt = c20598gjs.AhwBna();
            } else {
                strOLrzqt = C9700baY.OLrzqt(java.lang.String.valueOf(C59454zhO.wlaJM(c20598gjs.values())));
                if (strOLrzqt == null) {
                    strOLrzqt = "";
                }
            }
            ViewDataBinding viewDataBindingOLrzqt3 = c43312rms.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt3, "");
            AbstractC20512giL.AEQbTJ((AbstractC16908esm) viewDataBindingOLrzqt3, c20598gjs.DbNXlk(), strOLrzqt);
            if (c20598gjs.DbNXlk()) {
                ViewDataBinding viewDataBindingOLrzqt4 = c43312rms.OLrzqt();
                Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt4, "");
                AbstractC20512giL.AEQbTJ((AbstractC16908esm) viewDataBindingOLrzqt4, c20598gjs.valueOf());
            } else {
                AbstractC20512giL.Activity activity = AbstractC20512giL.Companion;
                ViewDataBinding viewDataBindingOLrzqt5 = c43312rms.OLrzqt();
                Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt5, "");
                AbstractC20512giL.Activity.hideCoinName$default(activity, (AbstractC16908esm) viewDataBindingOLrzqt5, null, 1, null);
            }
            int i = Application.copydefault[c20598gjs.AEQbTJ().ordinal()];
            if (i == 1) {
                ViewDataBinding viewDataBindingOLrzqt6 = c43312rms.OLrzqt();
                Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt6, "");
                AbstractC20512giL.EZpvd((AbstractC16908esm) viewDataBindingOLrzqt6, c20598gjs.fJNWhG().DbNXlk());
            } else if (i == 2) {
                ViewDataBinding viewDataBindingOLrzqt7 = c43312rms.OLrzqt();
                Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt7, "");
                AbstractC20512giL.OLrzqt((AbstractC16908esm) viewDataBindingOLrzqt7, new View.OnClickListener() { // from class: o.gld
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C20634gkb.Activity.AEQbTJ(this.OLrzqt, c20598gjs, view);
                    }
                });
            } else {
                if (this.KWHzl) {
                    ViewDataBinding viewDataBindingOLrzqt8 = c43312rms.OLrzqt();
                    Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt8, "");
                    AbstractC20512giL.EZpvd((AbstractC16908esm) viewDataBindingOLrzqt8, this.AEQbTJ.values().djBIcL() ? c20598gjs.KWHzl() : "--", this.AEQbTJ.values().djBIcL() ? C54880xYt.formatValuationFromAsset$default(c20598gjs.OLrzqt(), null, false, 0, false, 15, null) : "--", c20598gjs.fARcdN(), new View.OnClickListener() { // from class: o.gkZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C20634gkb.Activity.EZpvd(this.KWHzl, c20598gjs, view);
                        }
                    });
                    return;
                }
                ((AbstractC16908esm) c43312rms.OLrzqt()).getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.glc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C20634gkb.Activity.AYXKKw(this.AEQbTJ, c20598gjs, view);
                    }
                });
            }
        }

        public static final void AEQbTJ(Activity activity, C20598gjs c20598gjs, android.view.View view) {
            activity.OLrzqt.invoke(c20598gjs);
        }

        public static final void EZpvd(Activity activity, C20598gjs c20598gjs, android.view.View view) {
            activity.OLrzqt.invoke(c20598gjs);
        }

        public static final void AYXKKw(Activity activity, C20598gjs c20598gjs, android.view.View view) {
            activity.OLrzqt.invoke(c20598gjs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.CharSequence EZpvd(android.content.Context context, java.lang.String str) {
        java.lang.String str2 = this.DbNXlk;
        return (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) ? str : InterfaceC17407fEe.ActionBar.generate$default(valueOf(), str, this.DbNXlk, false, 4, null);
    }

    @Override // o.AbstractC57212yeE
    public void aC_() {
        super.aC_();
        if (this.valueOf) {
            values().fetchVPNInfo().copydefault();
            AkhnZx();
        }
        this.valueOf = false;
    }

    @Override // o.AbstractC57212yeE
    public void aB_() {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        C55230xfy c55230xfy2;
        OKEditText oKEditTextKWHzl2;
        super.aB_();
        if (this.valueOf) {
            AbstractC16620enP abstractC16620enP = this.KWHzl;
            if (abstractC16620enP == null || (c55230xfy2 = abstractC16620enP.OLrzqt) == null || (oKEditTextKWHzl2 = c55230xfy2.KWHzl()) == null) {
                return;
            }
            oKEditTextKWHzl2.setText("");
            return;
        }
        AbstractC16620enP abstractC16620enP2 = this.KWHzl;
        if (abstractC16620enP2 == null || (c55230xfy = abstractC16620enP2.OLrzqt) == null || (oKEditTextKWHzl = c55230xfy.KWHzl()) == null) {
            return;
        }
        oKEditTextKWHzl.setText(this.DbNXlk);
    }

    private final void OLrzqt(final android.content.Context context, final AbstractC12782ctV abstractC12782ctV, final long j) {
        showLoadingAtOnce();
        AbstractC58185ywX<ResponseData<ChainInfo>> abstractC58185ywXAEQbTJ = new C13934dbu().AEQbTJ(abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), j, "", 1);
        final Function1 function1 = new Function1() { // from class: o.gkA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20634gkb.copydefault((ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gkB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20634gkb.valueOf(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.gkF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20634gkb.AEQbTJ(this.AEQbTJ, j, context, abstractC12782ctV, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gkI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20634gkb.AkhnZx(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.gkH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20634gkb.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXAEQbTJ2.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gkJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20634gkb.fetchVPNInfo(function13, obj);
            }
        });
    }

    public static final kotlin.Pair valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(final C20634gkb c20634gkb, long j, android.content.Context context, AbstractC12782ctV abstractC12782ctV, kotlin.Pair pair) {
        c20634gkb.dismissLoading();
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(j);
            if (c10854bwMKWHzl != null) {
                if (C8392bBp.copydefault.EZpvd(c10854bwMKWHzl.fetchVPNInfo())) {
                    android.content.Context contextRequireContext = c20634gkb.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                    int i = C13754dXa.FragmentManager.ReportDrawnComposition;
                    java.lang.String strDjBIcL = c10854bwMKWHzl != null ? c10854bwMKWHzl.djBIcL() : null;
                    viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", strDjBIcL != null ? strDjBIcL : ""))));
                    viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.AxsJAYsNCnLh, new View.OnClickListener() { // from class: o.gkn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C20634gkb.KWHzl(viewOnClickListenerC54939xaY, view);
                        }
                    });
                    viewOnClickListenerC54939xaY.show();
                } else {
                    c20634gkb.copydefault(java.lang.Long.valueOf(j));
                    C9694baS.Application application = C9694baS.Companion;
                    ActivityC20927gqC.TaskDescription taskDescription = ActivityC20927gqC.Companion;
                    java.lang.Integer numAEQbTJ = c20634gkb.values().AEQbTJ();
                    Intrinsics.copydefault(numAEQbTJ);
                    application.KWHzl(c20634gkb, taskDescription.AEQbTJ(context, numAEQbTJ.intValue(), abstractC12782ctV.DbNXlk(), j), new Function2() { // from class: o.gkm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C20634gkb.AYXKKw(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                        }
                    });
                }
            }
        } else {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY2.EZpvd((java.lang.CharSequence) pair.getSecond());
            viewOnClickListenerC54939xaY2.EZpvd(C13754dXa.FragmentManager.iRxXKY, new View.OnClickListener() { // from class: o.gkp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20634gkb.EZpvd(viewOnClickListenerC54939xaY2, view);
                }
            });
            viewOnClickListenerC54939xaY2.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY2.setCancelable(false);
            viewOnClickListenerC54939xaY2.show();
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit AYXKKw(C20634gkb c20634gkb, int i, android.content.Intent intent) {
        if (i == -1) {
            c20634gkb.AEQbTJ(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(ResponseData responseData) {
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
