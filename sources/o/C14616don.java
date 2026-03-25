package o;

import android.os.Build;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.biz.drivers.bean.ICloudRestoreBean;
import com.okinc.business.defi.biz.drivers.bean.SupportCloudType;
import com.okinc.business.defi.common.track.AnalyticsEvent;
import com.okinc.business.defi.common.ui.DefiImportWalletTypeDialogFragment$onClickMPCWallet$1;
import com.okinc.business.defi.common.ui.DefiImportWalletTypeDialogFragment$trackImportWalletSheetEvent$1;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.api.bean.SupportedNetworkType;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import com.okinc.web.WebActivity;
import com.okinc.web3.security.model.ImportMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC15363eFo;
import o.ActivityC18363fgw;
import o.C13754dXa;
import o.C14557dnh;
import o.C15714eSo;
import o.C52761wXj;
import o.C57032yak;
import o.InterfaceC14583doG;
import o.eTW;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.don, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14616don extends AbstractC52796wYr implements C57032yak.TaskDescription {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final Function0<Unit> AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public boolean EZpvd;
    public final InterfaceC14457dln OLrzqt;
    public final ActivityResultLauncher<ICloudRestoreBean> copydefault;
    public final InterfaceC14563dnn djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public int valueOf;

    /* JADX INFO: renamed from: o.don$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SupportCloudType.values().length];
            try {
                iArr[SupportCloudType.GOOGLE_CLOUD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SupportCloudType.HUAWEI_CLOUD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SupportCloudType.BOTH_CLOUD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C14616don() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C57032yak.TaskDescription
    public void OLrzqt(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        this.EZpvd = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C57032yak.TaskDescription
    public void copydefault(@NotNull InterfaceC57036yao interfaceC57036yao) {
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        this.EZpvd = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.dln:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.dln) : (r2v0 o.dln))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r3v0 kotlin.jvm.functions.Function0))
 A[MD:(o.dln, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:79) call: o.don.<init>(o.dln, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C14616don(InterfaceC14457dln interfaceC14457dln, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC14457dln, (i & 2) != 0 ? null : function0);
    }

    public C14616don(InterfaceC14457dln interfaceC14457dln, Function0<Unit> function0) {
        this.OLrzqt = interfaceC14457dln;
        this.AEQbTJ = function0;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.dov
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14616don.hDKMBd(this.EZpvd);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.dox
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14616don.getFieldNames(this.KWHzl);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.dou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14616don.iwGUEr(this.KWHzl);
            }
        });
        ActivityResultLauncher<ICloudRestoreBean> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityC18363fgw.ActionBar(), new ActivityResultCallback() { // from class: o.doz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C14616don.EZpvd(this.OLrzqt, (java.lang.Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.copydefault = activityResultLauncherRegisterForActivityResult;
        this.valueOf = 1;
        this.djBIcL = new C14565dnp();
    }

    /* JADX INFO: renamed from: o.don$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.don.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C14616don KWHzl(int i, boolean z, java.util.List<SupportedNetworkType> list, @NotNull java.util.List<? extends UnsupportedWalletType> list2, boolean z2, InterfaceC14457dln interfaceC14457dln, @NotNull java.util.ArrayList<java.lang.Integer> arrayList, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            C14616don c14616don = new C14616don(interfaceC14457dln, function0);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(OtcExtraKeys.MODE, i);
            bundle.putBoolean("from_guide", z);
            bundle.putParcelableArrayList("UNSUPPORTED_WALLET_TYPES", new java.util.ArrayList<>(list2));
            bundle.putIntegerArrayList("arg_supported_cloud_wallet_types", arrayList);
            if (list != null) {
                bundle.putParcelableArrayList("SUPPORTED_NETWORK_TYPES", new java.util.ArrayList<>(list));
            }
            bundle.putBoolean("showTermsOfService", z2);
            c14616don.setArguments(bundle);
            return c14616don;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int AuCTel() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt(OtcExtraKeys.MODE, 1);
        }
        return 1;
    }

    public final boolean gEmmrt() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("from_guide", false);
        }
        return false;
    }

    private final java.util.List<UnsupportedWalletType> getFieldNames() {
        return (java.util.List) this.AYXKKw.getValue();
    }

    public static final java.util.List hDKMBd(C14616don c14616don) {
        java.util.ArrayList parcelableArrayList;
        android.os.Bundle arguments = c14616don.getArguments();
        if (arguments == null) {
            parcelableArrayList = null;
        } else if (Build.VERSION.SDK_INT >= 33) {
            parcelableArrayList = arguments.getParcelableArrayList("UNSUPPORTED_WALLET_TYPES", UnsupportedWalletType.class);
        } else {
            parcelableArrayList = arguments.getParcelableArrayList("UNSUPPORTED_WALLET_TYPES");
        }
        return parcelableArrayList == null ? yDY.AhwBna() : parcelableArrayList;
    }

    private final java.util.ArrayList<SupportedNetworkType> iwGUEr() {
        return (java.util.ArrayList) this.gEmmrt.getValue();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dom.KWHzl(android.os.Bundle, java.lang.String, java.lang.Class):java.util.ArrayList */
    public static final java.util.ArrayList getFieldNames(C14616don c14616don) {
        android.os.Bundle arguments = c14616don.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return arguments.getParcelableArrayList("SUPPORTED_NETWORK_TYPES", SupportedNetworkType.class);
        }
        return arguments.getParcelableArrayList("SUPPORTED_NETWORK_TYPES");
    }

    public final java.util.ArrayList<java.lang.Integer> AhwBna() {
        return (java.util.ArrayList) this.AhwBna.getValue();
    }

    public static final java.util.ArrayList iwGUEr(C14616don c14616don) {
        java.util.ArrayList<java.lang.Integer> integerArrayList;
        android.os.Bundle arguments = c14616don.getArguments();
        return (arguments == null || (integerArrayList = arguments.getIntegerArrayList("arg_supported_cloud_wallet_types")) == null) ? new java.util.ArrayList() : integerArrayList;
    }

    public final boolean fetchVPNInfo() {
        return (getFieldNames().contains(UnsupportedWalletType.MPCWallet) || C14728dqt.KWHzl.KWHzl()) ? false : true;
    }

    public final boolean DbNXlk() {
        return !getFieldNames().contains(UnsupportedWalletType.HardwareWallet);
    }

    public final boolean values() {
        return !getFieldNames().contains(UnsupportedWalletType.PrivateKeyWallet);
    }

    public final boolean valueOf() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("showTermsOfService", false);
        }
        return false;
    }

    public static final void EZpvd(C14616don c14616don, java.lang.Boolean bool) {
        if (c14616don.AEQbTJ == null || !bool.booleanValue()) {
            return;
        }
        c14616don.AEQbTJ.invoke();
        c14616don.AkhnZx();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mpO.setupSpanStyles$default(java.lang.CharSequence, java.lang.String[], int, com.okinc.core.ktx.MatchPattern, boolean, kotlin.jvm.functions.Function1, int, java.lang.Object):java.lang.CharSequence */
    @Override // o.AbstractC52796wYr, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.widget.TextView textViewFARcdN = fARcdN();
        if (textViewFARcdN != null) {
            textViewFARcdN.setVisibility(0);
        }
        android.widget.TextView textViewFARcdN2 = fARcdN();
        if (textViewFARcdN2 != null) {
            textViewFARcdN2.setText(C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplApi18);
        }
        android.widget.TextView textViewFARcdN3 = fARcdN();
        if (textViewFARcdN3 != null) {
            textViewFARcdN3.setTypeface(ResourcesCompat.getFont(requireContext(), C52761wXj.Dialog.EZpvd));
        }
        EZpvd(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) OLrzqt()));
        int paddingBottom = constraintLayout.getPaddingBottom();
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), paddingBottom + C55298xhM.OLrzqt(40, context));
        if (valueOf()) {
            android.view.View viewInflate = android.view.LayoutInflater.from(constraintLayout.getContext()).inflate(C13754dXa.TaskDescription.adevsa, (android.view.ViewGroup) constraintLayout, false);
            Intrinsics.copydefault(viewInflate, "");
            android.widget.TextView textView = (android.widget.TextView) viewInflate;
            java.lang.String str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getEnabledChangedCallbackactivity_release) + "\u200b";
            java.lang.String str2 = C33069mpW.copydefault(C13754dXa.FragmentManager.getStateWithUpdatedPosition, C56423yEv.EZpvd(C56390yDp.OLrzqt("terms_service", str))) + "\u200b";
            textView.setText(C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.dop
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14616don.OLrzqt((java.util.List) obj);
                }
            }, 14, null));
            textView.setOnTouchListener(new ViewOnTouchListenerC14460dlq(textView, str2, str, new Function0() { // from class: o.doy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C14616don.fIwbmz(this.copydefault);
                }
            }));
            C55055xci c55055xciFIwbmz = fIwbmz();
            if (c55055xciFIwbmz != null) {
                c55055xciFIwbmz.addView(textView);
            }
        }
        trackImportWalletSheetEvent$default(this, "Web3ImportWallet_Sheet_Page_View", null, 2, null);
    }

    public static final Unit OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.UnderlineSpan());
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(C14616don c14616don) {
        c14616don.copydefault(C33070mpX.AYXKKw(C13754dXa.FragmentManager.PickVisualMediaRequest));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.web.WebActivity.TaskDescription.openPage$default(com.okinc.web.WebActivity$TaskDescription, android.content.Context, android.os.Bundle, java.lang.Integer, int, java.lang.Object):void */
    private final void copydefault(java.lang.String str) {
        C33570myu.copydefault((android.app.Activity) requireActivity());
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, fragmentActivityRequireActivity, bundleBundleOf, null, 4, null);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.doo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C14616don.fJNWhG(this.OLrzqt);
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.rVN.reportFullyDrawn$default(androidx.fragment.app.Fragment, boolean, java.lang.String, int, java.lang.Object):void */
    public static final void fJNWhG(C14616don c14616don) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c14616don, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        android.view.Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(32);
        }
        return dialogOnCreateDialog;
    }

    public static /* synthetic */ void trackImportWalletSheetEvent$default(C14616don c14616don, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c14616don.OLrzqt(str, str2);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiImportWalletTypeDialogFragment$trackImportWalletSheetEvent$1(this, str, str2, null), 3, null);
    }

    public final void EZpvd(InterfaceC14583doG interfaceC14583doG) {
        ImportMode importMode;
        InterfaceC14583doG.Activity activity = InterfaceC14583doG.Activity.EZpvd;
        if (Intrinsics.EZpvd(interfaceC14583doG, activity) || Intrinsics.EZpvd(interfaceC14583doG, InterfaceC14583doG.ActionBar.KWHzl)) {
            C18408fho c18408fho = C18408fho.EZpvd;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            int iAuCTel = AuCTel();
            InterfaceC14457dln interfaceC14457dln = this.OLrzqt;
            java.util.ArrayList<SupportedNetworkType> arrayListIwGUEr = iwGUEr();
            if (Intrinsics.EZpvd(interfaceC14583doG, activity)) {
                importMode = ImportMode.SeedPhraseNormal;
            } else {
                importMode = ImportMode.All;
            }
            c18408fho.EZpvd(contextRequireContext, iAuCTel, interfaceC14457dln, arrayListIwGUEr, importMode);
            KWHzl("seedphrase");
            OLrzqt("Web3ImportWallet_Sheet_Button_Click", "seedphrase_privatekey");
            AkhnZx();
            return;
        }
        if (Intrinsics.EZpvd(interfaceC14583doG, InterfaceC14583doG.Application.KWHzl)) {
            isConnected();
            return;
        }
        if (interfaceC14583doG instanceof InterfaceC14583doG.TaskDescription) {
            copydefault(((InterfaceC14583doG.TaskDescription) interfaceC14583doG).OLrzqt());
        } else {
            if (!Intrinsics.EZpvd(interfaceC14583doG, InterfaceC14583doG.StateListAnimator.copydefault)) {
                throw new NoWhenBranchMatchedException();
            }
            KWHzl("hardware");
            OLrzqt("Web3ImportWallet_Sheet_Button_Click", "hardware");
            C14541dnR.Companion.copydefault(AuCTel()).show(getChildFragmentManager(), C14616don.class.getSimpleName());
        }
    }

    public final void isConnected() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiImportWalletTypeDialogFragment$onClickMPCWallet$1(this, null), 3, null);
    }

    public final java.util.List<C55377xim> OLrzqt() {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (values()) {
            listOLrzqt.add(InterfaceC14583doG.ActionBar.KWHzl);
        } else {
            listOLrzqt.add(InterfaceC14583doG.Activity.EZpvd);
        }
        C15538eMa c15538eMa = C15538eMa.OLrzqt;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        listOLrzqt.add(new InterfaceC14583doG.TaskDescription(c15538eMa.EZpvd(contextRequireContext)));
        if (DbNXlk()) {
            listOLrzqt.add(InterfaceC14583doG.StateListAnimator.copydefault);
        }
        if (fetchVPNInfo()) {
            listOLrzqt.add(InterfaceC14583doG.Application.KWHzl);
        }
        java.util.List<InterfaceC14583doG> listFARcdN = C56402yEa.fARcdN(listOLrzqt);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFARcdN, 10));
        for (final InterfaceC14583doG interfaceC14583doG : listFARcdN) {
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            C55377xim c55377xim = new C55377xim(contextRequireContext2, null, 2, 0 == true ? 1 : 0);
            android.content.Context context = c55377xim.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c55377xim.setTitleText(interfaceC14583doG.copydefault(context));
            android.content.Context context2 = c55377xim.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c55377xim.setDescriptionText(interfaceC14583doG.AEQbTJ(context2));
            android.content.Context context3 = c55377xim.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c55377xim.setStartDrawable(interfaceC14583doG.KWHzl(context3));
            c55377xim.setClickCallback(new Function0() { // from class: o.dow
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C14616don.EZpvd(this.copydefault, interfaceC14583doG);
                }
            });
            arrayList.add(c55377xim);
        }
        return arrayList;
    }

    public static final Unit EZpvd(C14616don c14616don, InterfaceC14583doG interfaceC14583doG) {
        c14616don.EZpvd(interfaceC14583doG);
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        android.content.Context context = getContext();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("from", "restore_mpc");
        bundle.putInt(OtcExtraKeys.MODE, AuCTel());
        bundle.putBoolean("isNotNeedMPCCreateGuidePage", false);
        Unit unit = Unit.INSTANCE;
        new C14469dlz(childFragmentManager, context, bundle, null, new Function1() { // from class: o.dol
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14616don.KWHzl(this.copydefault, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.dot
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14616don.copydefault();
            }
        }, new Function0() { // from class: o.dos
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14616don.ejfBZ(this.KWHzl);
            }
        }, null, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, null).EZpvd();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.eSo.TaskDescription.step$default(o.eSo$TaskDescription, android.content.Context, java.lang.String, int, boolean, boolean, int, java.lang.Object):void */
    public static final Unit KWHzl(C14616don c14616don, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C15714eSo.TaskDescription taskDescription = C15714eSo.Companion;
        android.content.Context context = c14616don.getContext();
        if (context == null) {
            return Unit.INSTANCE;
        }
        C15714eSo.TaskDescription.step$default(taskDescription, context, str, c14616don.AuCTel(), false, false, 24, null);
        c14616don.AkhnZx();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(C14616don c14616don) {
        c14616don.AkhnZx();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.eTW.TaskDescription.newInstance$default(o.eTW$TaskDescription, java.lang.String, int, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, int, java.lang.Object):o.eTW */
    public final void copydefault(SupportCloudType supportCloudType) {
        OLrzqt("Web3ImportWallet_Sheet_Button_Click", "icloud_backup");
        try {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            if (fragmentActivityRequireActivity instanceof AbstractActivityC33041mov) {
                int i = Application.AEQbTJ[supportCloudType.ordinal()];
                if (i == 1) {
                    C15538eMa.OLrzqt.OLrzqt((AbstractActivityC33041mov) fragmentActivityRequireActivity, new Function0() { // from class: o.doC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C14616don.values(this.EZpvd);
                        }
                    });
                } else if (i == 2) {
                    C15538eMa.OLrzqt.EZpvd((AbstractActivityC33041mov) fragmentActivityRequireActivity, new Function0() { // from class: o.doB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C14616don.fetchVPNInfo(this.KWHzl);
                        }
                    });
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eTW.TaskDescription.newInstance$default(eTW.Companion, "", 2, false, null, new Function1() { // from class: o.doD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C14616don.OLrzqt(this.copydefault, ((java.lang.Integer) obj).intValue());
                        }
                    }, new Function0() { // from class: o.doA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C14616don.EZpvd();
                        }
                    }, 4, null).show(getChildFragmentManager(), "selectCloudBackupDialogFragment");
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final Unit values(C14616don c14616don) {
        c14616don.AYXKKw();
        c14616don.KWHzl(new ICloudRestoreBean(1, c14616don.AhwBna(), c14616don.AEQbTJ != null));
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C14616don c14616don) {
        c14616don.AYXKKw();
        c14616don.KWHzl(new ICloudRestoreBean(2, c14616don.AhwBna(), c14616don.AEQbTJ != null));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C14616don c14616don, int i) {
        c14616don.KWHzl(new ICloudRestoreBean(i, c14616don.AhwBna(), c14616don.AEQbTJ != null));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public final void KWHzl(ICloudRestoreBean iCloudRestoreBean) {
        if (!isAdded() || isDetached() || getActivity() == null) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isDestroyed()) {
            try {
                this.copydefault.launch(iCloudRestoreBean);
                if (this.AEQbTJ == null) {
                    AkhnZx();
                }
            } catch (java.lang.IllegalStateException e) {
                pUU.copydefault("DefiImportWalletTypeDialogFragment", "safeLaunchICloudRestore error: " + e.getMessage());
            }
        }
    }

    public final void AkhnZx() {
        if (fARcdN() == null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: o.doq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C14616don.AuCTel(this.copydefault);
                }
            });
            return;
        }
        android.widget.TextView textViewFARcdN = fARcdN();
        if (textViewFARcdN != null) {
            textViewFARcdN.post(new java.lang.Runnable() { // from class: o.dor
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C14616don.fARcdN(this.AEQbTJ);
                }
            });
        }
    }

    public static final void AuCTel(C14616don c14616don) {
        if (c14616don.isAdded()) {
            c14616don.dismissAllowingStateLoss();
        }
    }

    public static final void fARcdN(C14616don c14616don) {
        if (c14616don.isAdded()) {
            c14616don.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.EZpvd) {
            this.EZpvd = false;
            C57032yak.AEQbTJ.KWHzl(this);
            ActivityC15363eFo.ActionBar actionBar = ActivityC15363eFo.Companion;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            actionBar.KWHzl(fragmentActivityRequireActivity, AuCTel(), "from_import");
            AkhnZx();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C57032yak.AEQbTJ.KWHzl(this);
    }

    @Override // o.C57032yak.TaskDescription
    public void EZpvd(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        C13992dcz.AEQbTJ.EZpvd(bluetoothDeviceModel);
        this.EZpvd = false;
    }

    public final void AYXKKw() {
        try {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity, "");
            ((AbstractActivityC33041mov) fragmentActivityRequireActivity).dismissLoading();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.lang.String str) {
        AnalyticsEvent analyticsEventEZpvd;
        if (gEmmrt()) {
            analyticsEventEZpvd = C14562dnm.AEQbTJ(C14557dnh.Application.KWHzl, EopTrackEvent.KEY_BUTTON_NAME, str);
        } else {
            analyticsEventEZpvd = C14562dnm.EZpvd(C14557dnh.Application.KWHzl, EopTrackEvent.KEY_BUTTON_NAME, str);
        }
        this.djBIcL.KWHzl(analyticsEventEZpvd);
    }
}
