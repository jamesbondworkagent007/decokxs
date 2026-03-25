package o;

import android.view.View;
import android.widget.ExpandableListView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.dexlogic.bean.AddressType;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.wallet.api.bean.WalletScanInformationBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ijB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24717ijB extends C23404hxb {
    public final ActivityResultLauncher<android.content.Intent> AhwBna;
    public C23494hzL EZpvd;
    public Function1<? super C22947hov, Unit> OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.ijG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24717ijB.values(this.copydefault);
        }
    });
    public final InterfaceC56387yDm valueOf = C31200lpY.copydefault(this);
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.ijI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24717ijB.djBIcL(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ijH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24717ijB.AYXKKw(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.ijE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24717ijB.isConnected(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.ijB$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
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
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.ijB$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AddressType.values().length];
            try {
                iArr[AddressType.Invalid.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AddressType.IsContractAddress.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AddressType.IsExchangeAddress.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 0.99f;
    }

    public C24717ijB() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.ijF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C24717ijB.KWHzl(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.ijB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ijB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, java.lang.String str2, java.lang.String str3, @NotNull Function1<? super C22947hov, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C24717ijB c24717ijB = new C24717ijB();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("data", dexMultiTokenInfoBean);
            bundle.putString("user_btc_wallet_address", str2);
            bundle.putString("user_wallet_address", str3);
            c24717ijB.setArguments(bundle);
            c24717ijB.OLrzqt = function1;
            c24717ijB.show(fragmentManager, C24717ijB.class.getName());
        }
    }

    public final C22932hog copydefault() {
        return (C22932hog) this.gEmmrt.getValue();
    }

    /* JADX INFO: renamed from: o.ijB$TaskDescription */
    public static final class TaskDescription implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String string;
            AppCompatImageView appCompatImageView;
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            C24717ijB.this.copydefault((kotlin.Pair<? extends AddressType, java.lang.String>) C56390yDp.OLrzqt(AddressType.Normal, string));
            C23494hzL c23494hzL = C24717ijB.this.EZpvd;
            if (c23494hzL != null && (appCompatImageView = c23494hzL.AEQbTJ) != null) {
                appCompatImageView.setVisibility(string.length() == 0 ? 4 : 0);
            }
            C24717ijB.this.copydefault().OLrzqt(string);
        }
    }

    public static final C22932hog values(C24717ijB c24717ijB) {
        return (C22932hog) new ViewModelProvider(c24717ijB).get(C22932hog.class);
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String djBIcL(C24717ijB c24717ijB) {
        android.os.Bundle arguments = c24717ijB.getArguments();
        if (arguments != null) {
            return arguments.getString("user_btc_wallet_address");
        }
        return null;
    }

    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String AYXKKw(C24717ijB c24717ijB) {
        android.os.Bundle arguments = c24717ijB.getArguments();
        if (arguments != null) {
            return arguments.getString("user_wallet_address");
        }
        return null;
    }

    public final java.lang.String AEQbTJ() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.EZpvd = C23494hzL.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
    }

    /* JADX DEBUG: Possible override for method o.hxb.EZpvd()V */
    public final DexMultiTokenInfoBean EZpvd() {
        return (DexMultiTokenInfoBean) this.djBIcL.getValue();
    }

    public static final DexMultiTokenInfoBean isConnected(C24717ijB c24717ijB) {
        android.os.Bundle arguments = c24717ijB.getArguments();
        if (arguments != null) {
            return (DexMultiTokenInfoBean) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "data", DexMultiTokenInfoBean.class));
        }
        return null;
    }

    public static final void KWHzl(C24717ijB c24717ijB, ActivityResult activityResult) {
        android.content.Intent data;
        java.lang.String stringExtra;
        C24739ijX c24739ijX;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (stringExtra = data.getStringExtra("EXTRA_SCAN_RESULT")) == null) {
            return;
        }
        WalletScanInformationBean walletScanInformationBeanCopydefault = C22380heK.OLrzqt.copydefault(c24717ijB.valueOf()).fARcdN().copydefault(stringExtra);
        C23494hzL c23494hzL = c24717ijB.EZpvd;
        if (c23494hzL != null && (c24739ijX = c23494hzL.OLrzqt) != null) {
            c24739ijX.setText(walletScanInformationBeanCopydefault.getAddress());
        }
        c24717ijB.copydefault().KWHzl(walletScanInformationBeanCopydefault.getAddress());
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault().copydefault(valueOf(), EZpvd(), OLrzqt(), AEQbTJ());
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl();
        djBIcL();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        java.lang.String tokenSymbol;
        java.lang.String chainName;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(9);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd = EZpvd();
        if (dexMultiTokenInfoBeanEZpvd == null || (tokenSymbol = dexMultiTokenInfoBeanEZpvd.getTokenSymbol()) == null) {
            tokenSymbol = "";
        }
        c52781wYc.setTitle(tokenSymbol);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd2 = EZpvd();
        if (dexMultiTokenInfoBeanEZpvd2 != null && (chainName = dexMultiTokenInfoBeanEZpvd2.getChainName()) != null) {
            str = chainName;
        }
        C25352ivB.OLrzqt(c52781wYc, str);
    }

    public final void KWHzl() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        C24739ijX c24739ijX;
        C24736ijU c24736ijU;
        C24739ijX c24739ijX2;
        C24739ijX c24739ijX3;
        copydefault().KWHzl().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ijz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24717ijB.OLrzqt(this.EZpvd, (java.util.List) obj);
            }
        }));
        copydefault().AEQbTJ().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ijD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24717ijB.copydefault(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        copydefault().EZpvd().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ijK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24717ijB.copydefault(this.OLrzqt, (C22947hov) obj);
            }
        }));
        copydefault().OLrzqt().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ijQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24717ijB.EZpvd(this.KWHzl, (kotlin.Pair) obj);
            }
        }));
        C23494hzL c23494hzL = this.EZpvd;
        if (c23494hzL != null && (c24739ijX3 = c23494hzL.OLrzqt) != null) {
            c24739ijX3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.ijR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C24717ijB.EZpvd(this.EZpvd, view, z);
                }
            });
        }
        C23494hzL c23494hzL2 = this.EZpvd;
        if (c23494hzL2 != null && (c24739ijX2 = c23494hzL2.OLrzqt) != null) {
            c24739ijX2.setOnGoClickListener(new Function0() { // from class: o.ijS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C24717ijB.AhwBna(this.EZpvd);
                }
            });
        }
        copydefault().AYXKKw().observe(this, new ActionBar(new Function1() { // from class: o.ijP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24717ijB.OLrzqt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        C23494hzL c23494hzL3 = this.EZpvd;
        if (c23494hzL3 != null && (c24736ijU = c23494hzL3.EZpvd) != null) {
            c24736ijU.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: o.ijO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.ExpandableListView.OnChildClickListener
                public final boolean onChildClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i, int i2, long j) {
                    return C24717ijB.KWHzl(this.EZpvd, expandableListView, view, i, i2, j);
                }
            });
        }
        C23494hzL c23494hzL4 = this.EZpvd;
        if (c23494hzL4 != null && (c24739ijX = c23494hzL4.OLrzqt) != null) {
            c24739ijX.addTextChangedListener(new TaskDescription());
        }
        C23494hzL c23494hzL5 = this.EZpvd;
        if (c23494hzL5 != null && (appCompatImageView2 = c23494hzL5.copydefault) != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(appCompatImageView2, 0L, new Function1() { // from class: o.ijV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24717ijB.OLrzqt(this.copydefault, (android.view.View) obj);
                }
            }, 1, null);
        }
        C23494hzL c23494hzL6 = this.EZpvd;
        if (c23494hzL6 == null || (appCompatImageView = c23494hzL6.AEQbTJ) == null) {
            return;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(appCompatImageView, 0L, new Function1() { // from class: o.ijT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24717ijB.copydefault(this.KWHzl, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(C24717ijB c24717ijB, java.util.List list) {
        C24736ijU c24736ijU;
        C24736ijU c24736ijU2;
        C23494hzL c23494hzL = c24717ijB.EZpvd;
        if (c23494hzL != null && (c24736ijU2 = c23494hzL.EZpvd) != null) {
            android.content.Context contextRequireContext = c24717ijB.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            Intrinsics.copydefault(list);
            c24736ijU2.setAdapter(new C24738ijW(contextRequireContext, list));
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C23494hzL c23494hzL2 = c24717ijB.EZpvd;
            if (c23494hzL2 != null && (c24736ijU = c23494hzL2.EZpvd) != null) {
                c24736ijU.expandGroup(i);
            }
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c24717ijB, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C24717ijB c24717ijB, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c24717ijB.AhwBna();
        } else {
            c24717ijB.gEmmrt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C24717ijB c24717ijB, C22947hov c22947hov) {
        Function1<? super C22947hov, Unit> function1 = c24717ijB.OLrzqt;
        if (function1 != null) {
            Intrinsics.copydefault(c22947hov);
            function1.invoke(c22947hov);
        }
        c24717ijB.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C24717ijB c24717ijB, kotlin.Pair pair) {
        Intrinsics.copydefault(pair);
        c24717ijB.copydefault((kotlin.Pair<? extends AddressType, java.lang.String>) pair);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C24717ijB c24717ijB, android.view.View view, boolean z) {
        ConstraintLayout constraintLayout;
        C23494hzL c23494hzL = c24717ijB.EZpvd;
        if (c23494hzL != null && (constraintLayout = c23494hzL.KWHzl) != null) {
            constraintLayout.setSelected(z);
        }
        C33054mpH.EZpvd(c24717ijB);
    }

    public static final Unit AhwBna(C24717ijB c24717ijB) {
        C24739ijX c24739ijX;
        C23494hzL c23494hzL = c24717ijB.EZpvd;
        c24717ijB.copydefault().KWHzl(java.lang.String.valueOf((c23494hzL == null || (c24739ijX = c23494hzL.OLrzqt) == null) ? null : c24739ijX.getText()));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C24717ijB c24717ijB, java.lang.Boolean bool) {
        C23494hzL c23494hzL;
        C24739ijX c24739ijX;
        if (bool.booleanValue() && (c23494hzL = c24717ijB.EZpvd) != null && (c24739ijX = c23494hzL.OLrzqt) != null) {
            c24717ijB.AEQbTJ(java.lang.String.valueOf(c24739ijX.getText()));
        }
        return Unit.INSTANCE;
    }

    public static final boolean KWHzl(C24717ijB c24717ijB, android.widget.ExpandableListView expandableListView, android.view.View view, int i, int i2, long j) {
        C24736ijU c24736ijU;
        android.widget.ExpandableListAdapter expandableListAdapter;
        C23494hzL c23494hzL = c24717ijB.EZpvd;
        java.lang.Object child = (c23494hzL == null || (c24736ijU = c23494hzL.EZpvd) == null || (expandableListAdapter = c24736ijU.getExpandableListAdapter()) == null) ? null : expandableListAdapter.getChild(i, i2);
        C22947hov c22947hov = child instanceof C22947hov ? (C22947hov) child : null;
        if (c22947hov == null) {
            return false;
        }
        c24717ijB.copydefault().KWHzl(c22947hov);
        return true;
    }

    public static final Unit OLrzqt(C24717ijB c24717ijB, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(c24717ijB.valueOf()).fARcdN();
        android.content.Context contextRequireContext = c24717ijB.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC23194htdFARcdN.EZpvd(contextRequireContext, c24717ijB.AhwBna);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C24717ijB c24717ijB, android.view.View view) {
        C24739ijX c24739ijX;
        Intrinsics.checkNotNullParameter(view, "");
        C23494hzL c23494hzL = c24717ijB.EZpvd;
        if (c23494hzL != null && (c24739ijX = c23494hzL.OLrzqt) != null) {
            c24739ijX.setText("");
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str) {
        C24739ijX c24739ijX;
        C23494hzL c23494hzL = this.EZpvd;
        if (c23494hzL != null && (c24739ijX = c23494hzL.OLrzqt) != null) {
            c24739ijX.setCursorVisible(false);
        }
        android.view.View viewInflate = android.view.LayoutInflater.from(requireContext()).inflate(C23274hvD.Activity.KWHzl, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C23274hvD.Application.zFtALg);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        textView.setText(C33061mpO.setupSpanStyles$default(C33069mpW.KWHzl(contextRequireContext, C23274hvD.Fragment.onShuffleModeChangedRemoved, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str))), new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.ijN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24717ijB.copydefault(this.copydefault, (java.util.List) obj);
            }
        }, 14, null));
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext2);
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.onVolumeInfoChanged);
        Intrinsics.copydefault(viewInflate);
        viewOnClickListenerC54939xaY.EZpvd(viewInflate);
        viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.hfeTOA, new View.OnClickListener() { // from class: o.ijJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C24717ijB.AEQbTJ(this.KWHzl, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.MediaBrowserCompatMediaItemFlags, new View.OnClickListener() { // from class: o.ijM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C24717ijB.OLrzqt(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final Unit copydefault(C24717ijB c24717ijB, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c24717ijB.getContext(), C32113mPz.Dialog.zuBGHE));
        list.add(new Activity());
        android.content.Context contextRequireContext = c24717ijB.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        list.add(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(contextRequireContext, C52761wXj.Activity.Dmq)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ijB$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
        }
    }

    public static final void AEQbTJ(C24717ijB c24717ijB, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C24739ijX c24739ijX;
        C22932hog c22932hogCopydefault = c24717ijB.copydefault();
        C23494hzL c23494hzL = c24717ijB.EZpvd;
        c22932hogCopydefault.EZpvd(java.lang.String.valueOf((c23494hzL == null || (c24739ijX = c23494hzL.OLrzqt) == null) ? null : c24739ijX.getText()));
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C24717ijB c24717ijB, android.view.View view) {
        final C24739ijX c24739ijX;
        viewOnClickListenerC54939xaY.dismiss();
        C23494hzL c23494hzL = c24717ijB.EZpvd;
        if (c23494hzL == null || (c24739ijX = c23494hzL.OLrzqt) == null) {
            return;
        }
        c24739ijX.setCursorVisible(true);
        c24739ijX.postDelayed(new java.lang.Runnable() { // from class: o.ijL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C24717ijB.KWHzl(c24739ijX);
            }
        }, 100L);
    }

    public static final void KWHzl(C24739ijX c24739ijX) {
        c24739ijX.requestFocus();
        java.lang.Object systemService = c24739ijX.getContext().getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(c24739ijX, 1);
    }

    public final void copydefault(kotlin.Pair<? extends AddressType, java.lang.String> pair) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        java.lang.String chainName;
        ConstraintLayout constraintLayout;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        ConstraintLayout constraintLayout2;
        C24739ijX c24739ijX;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        ConstraintLayout constraintLayout3;
        C24739ijX c24739ijX2;
        android.widget.TextView textView7;
        ConstraintLayout constraintLayout4;
        int i = Application.OLrzqt[pair.getFirst().ordinal()];
        if (i == 1) {
            C23494hzL c23494hzL = this.EZpvd;
            if (c23494hzL != null && (constraintLayout = c23494hzL.KWHzl) != null) {
                constraintLayout.setActivated(true);
            }
            C23494hzL c23494hzL2 = this.EZpvd;
            if (c23494hzL2 != null && (textView2 = c23494hzL2.djBIcL) != null) {
                android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
                int i2 = C23274hvD.Fragment.frkDMe;
                DefiChainInfo defiChainInfoCopydefault = copydefault().copydefault();
                if (defiChainInfoCopydefault == null || (chainName = defiChainInfoCopydefault.getChainName()) == null) {
                    chainName = "";
                }
                textView2.setText(C33069mpW.KWHzl(applicationOLrzqt, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", chainName))));
            }
            C23494hzL c23494hzL3 = this.EZpvd;
            if (c23494hzL3 == null || (textView = c23494hzL3.djBIcL) == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        if (i == 2) {
            C23494hzL c23494hzL4 = this.EZpvd;
            if (c23494hzL4 != null && (c24739ijX = c23494hzL4.OLrzqt) != null) {
                c24739ijX.setText(pair.getSecond());
            }
            C23494hzL c23494hzL5 = this.EZpvd;
            if (c23494hzL5 != null && (constraintLayout2 = c23494hzL5.KWHzl) != null) {
                constraintLayout2.setActivated(true);
            }
            C23494hzL c23494hzL6 = this.EZpvd;
            if (c23494hzL6 != null && (textView4 = c23494hzL6.djBIcL) != null) {
                textView4.setText(getString(C23274hvD.Fragment.HJWChPUUMfbK));
            }
            C23494hzL c23494hzL7 = this.EZpvd;
            if (c23494hzL7 == null || (textView3 = c23494hzL7.djBIcL) == null) {
                return;
            }
            textView3.setVisibility(0);
            return;
        }
        if (i != 3) {
            C23494hzL c23494hzL8 = this.EZpvd;
            if (c23494hzL8 != null && (constraintLayout4 = c23494hzL8.KWHzl) != null) {
                constraintLayout4.setActivated(false);
            }
            C23494hzL c23494hzL9 = this.EZpvd;
            if (c23494hzL9 == null || (textView7 = c23494hzL9.djBIcL) == null) {
                return;
            }
            textView7.setVisibility(8);
            return;
        }
        C23494hzL c23494hzL10 = this.EZpvd;
        if (c23494hzL10 != null && (c24739ijX2 = c23494hzL10.OLrzqt) != null) {
            c24739ijX2.setText(pair.getSecond());
        }
        C23494hzL c23494hzL11 = this.EZpvd;
        if (c23494hzL11 != null && (constraintLayout3 = c23494hzL11.KWHzl) != null) {
            constraintLayout3.setActivated(true);
        }
        C23494hzL c23494hzL12 = this.EZpvd;
        if (c23494hzL12 != null && (textView6 = c23494hzL12.djBIcL) != null) {
            textView6.setText(getString(C23274hvD.Fragment.DuR));
        }
        C23494hzL c23494hzL13 = this.EZpvd;
        if (c23494hzL13 == null || (textView5 = c23494hzL13.djBIcL) == null) {
            return;
        }
        textView5.setVisibility(0);
    }

    public final void djBIcL() {
        copydefault().valueOf();
    }
}
