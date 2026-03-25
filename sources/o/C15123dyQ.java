package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.dapp.net.WalletSelectParams;
import com.okinc.components.track.TrackChannel;
import com.okinc.core.util.SPUtils;
import com.okinc.dapp.bean.SelectWalletNet;
import com.okinc.wallet.api.MpcWalletService;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C15189dzd;
import o.C52761wXj;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dyQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15123dyQ extends wXX {
    public dMJ EZpvd;
    public C15170dzK OLrzqt;
    public Function2<? super java.lang.Long, ? super java.util.List<? extends InterfaceC9738bbJ>, Unit> copydefault;
    public InterfaceC58217yxC djBIcL;
    public yHO<? super java.lang.Long, ? super InterfaceC9738bbJ, ? super java.lang.String, Unit> gEmmrt;
    public InterfaceC15117dyK valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public float KWHzl = 0.95f;
    public C59534zip AhwBna = new C59534zip(new java.util.ArrayList(0));
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.dyR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15123dyQ.EZpvd(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.dyQ$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.KWHzl;
    }

    public final C15172dzM KWHzl() {
        return (C15172dzM) this.AYXKKw.getValue();
    }

    public static final C15172dzM EZpvd(C15123dyQ c15123dyQ) {
        return (C15172dzM) new ViewModelProvider(c15123dyQ).get(C15172dzM.class);
    }

    /* JADX INFO: renamed from: o.dyQ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dyQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.dyQ$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C15123dyQ newInstance$default(ActionBar actionBar, WalletSelectParams walletSelectParams, yHO yho, Function2 function2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                yho = null;
            }
            if ((i & 4) != 0) {
                function2 = null;
            }
            return actionBar.copydefault(walletSelectParams, yho, function2);
        }

        public final C15123dyQ copydefault(@NotNull WalletSelectParams walletSelectParams, yHO<? super java.lang.Long, ? super InterfaceC9738bbJ, ? super java.lang.String, Unit> yho, Function2<? super java.lang.Long, ? super java.util.List<? extends InterfaceC9738bbJ>, Unit> function2) {
            Intrinsics.checkNotNullParameter(walletSelectParams, "");
            C15123dyQ c15123dyQ = new C15123dyQ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("wallet_select_params", walletSelectParams);
            c15123dyQ.setArguments(bundle);
            c15123dyQ.gEmmrt = yho;
            c15123dyQ.copydefault = function2;
            return c15123dyQ;
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        android.widget.TextView textView;
        ConstraintLayout constraintLayout2;
        wYC wyc;
        java.util.ArrayList<SelectWalletNet> supportChainList;
        ConstraintLayout constraintLayout3;
        wYC wyc2;
        android.widget.ImageView imageView;
        android.widget.TextView textView2;
        ConstraintLayout constraintLayout4;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        wYC wyc3;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.view.Window window;
        android.view.View decorView;
        android.view.Window window2;
        WalletSelectParams walletSelectParams;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (walletSelectParams = (WalletSelectParams) arguments.getParcelable("wallet_select_params")) != null) {
            KWHzl().KWHzl(walletSelectParams);
        }
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(getContext(), dLX.FragmentManager.AEQbTJ);
        if (KWHzl().EZpvd().isDarkMode()) {
            contextThemeWrapper = new android.view.ContextThemeWrapper(getContext(), dLX.FragmentManager.EZpvd);
            constraintLayout.setBackground(contextThemeWrapper.getDrawable(dLX.ActionBar.isConnected));
            android.app.Dialog dialog = getDialog();
            if (dialog != null && (window2 = dialog.getWindow()) != null) {
                window2.setNavigationBarColor(C33070mpX.copydefault(C52761wXj.Activity.profile));
            }
            android.app.Dialog dialog2 = getDialog();
            if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setSystemUiVisibility(1280);
            }
        }
        this.EZpvd = dMJ.AEQbTJ(getLayoutInflater().cloneInContext(contextThemeWrapper), constraintLayout, true);
        if (KWHzl().EZpvd().getSelectedChain() == null || !C33129mqd.KWHzl((java.util.Collection) KWHzl().EZpvd().getSupportChainList())) {
            dMJ dmj = this.EZpvd;
            if (dmj != null && (textView = dmj.AYXKKw) != null) {
                textView.setText(getString(dLX.Dialog.aUsmxb));
            }
        } else {
            dMJ dmj2 = this.EZpvd;
            if (dmj2 != null && (textView4 = dmj2.AYXKKw) != null) {
                textView4.setText(getString(dLX.Dialog.AwvSrB));
            }
        }
        if (SPUtils.getBoolean("BUGLY_DEV_DEVICE", false)) {
            dMJ dmj3 = this.EZpvd;
            this.djBIcL = (dmj3 == null || (textView3 = dmj3.AYXKKw) == null) ? null : C33072mpZ.AEQbTJ(textView3, 3L, 5, new View.OnClickListener() { // from class: o.dzg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C15123dyQ.AEQbTJ(view);
                }
            });
        }
        dMJ dmj4 = this.EZpvd;
        if (dmj4 != null && (wyc3 = dmj4.KWHzl) != null) {
            wyc3.setOnClickListener(new TaskDescription(wyc3, 1000L, this));
        }
        dMJ dmj5 = this.EZpvd;
        if (dmj5 != null && (recyclerView4 = dmj5.gEmmrt) != null) {
            recyclerView4.setHasFixedSize(true);
        }
        dMJ dmj6 = this.EZpvd;
        if (dmj6 != null && (recyclerView3 = dmj6.gEmmrt) != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
        dMJ dmj7 = this.EZpvd;
        if (dmj7 != null && (recyclerView2 = dmj7.gEmmrt) != null) {
            recyclerView2.addItemDecoration(C33047mpA.KWHzl(getContext(), contextThemeWrapper.getDrawable(dLX.ActionBar.fetchVPNInfo), false, false));
        }
        dMJ dmj8 = this.EZpvd;
        if (dmj8 != null && (recyclerView = dmj8.gEmmrt) != null) {
            recyclerView.setAdapter(this.AhwBna);
        }
        C15170dzK c15170dzK = new C15170dzK(this, KWHzl().EZpvd(), new Function1() { // from class: o.dyP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15123dyQ.AEQbTJ(this.KWHzl, (InterfaceC9738bbJ) obj);
            }
        });
        this.OLrzqt = c15170dzK;
        C59534zip c59534zip = this.AhwBna;
        Intrinsics.copydefault(c15170dzK);
        c59534zip.register(InterfaceC9735bbG.class, c15170dzK);
        if (KWHzl().EZpvd().getSelectedChain() != null) {
            dMJ dmj9 = this.EZpvd;
            if (dmj9 != null && (constraintLayout4 = dmj9.copydefault) != null) {
                constraintLayout4.setVisibility(0);
            }
            InterfaceC9737bbI interfaceC9737bbICopydefault = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault();
            java.lang.Long selectedChain = KWHzl().EZpvd().getSelectedChain();
            Intrinsics.copydefault(selectedChain);
            InterfaceC9731bbC interfaceC9731bbCEZpvd = interfaceC9737bbICopydefault.EZpvd(selectedChain.longValue(), true);
            if (interfaceC9731bbCEZpvd != null) {
                dMJ dmj10 = this.EZpvd;
                if (dmj10 != null && (textView2 = dmj10.valueOf) != null) {
                    textView2.setText(interfaceC9731bbCEZpvd.djBIcL());
                }
                dMJ dmj11 = this.EZpvd;
                if (dmj11 != null && (imageView = dmj11.AEQbTJ) != null) {
                    C33054mpH.KWHzl(imageView, interfaceC9731bbCEZpvd.AYXKKw());
                }
            }
            if (KWHzl().EZpvd().getSupportChainList() == null || (supportChainList = KWHzl().EZpvd().getSupportChainList()) == null || supportChainList.size() < 2) {
                dMJ dmj12 = this.EZpvd;
                if (dmj12 != null && (wyc = dmj12.EZpvd) != null) {
                    wyc.setVisibility(8);
                }
            } else {
                dMJ dmj13 = this.EZpvd;
                if (dmj13 != null && (wyc2 = dmj13.EZpvd) != null) {
                    wyc2.setVisibility(0);
                }
                dMJ dmj14 = this.EZpvd;
                if (dmj14 != null && (constraintLayout3 = dmj14.copydefault) != null) {
                    constraintLayout3.setOnClickListener(new View.OnClickListener() { // from class: o.dyO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C15123dyQ.KWHzl(this.KWHzl, view);
                        }
                    });
                }
            }
        } else {
            dMJ dmj15 = this.EZpvd;
            if (dmj15 != null && (constraintLayout2 = dmj15.copydefault) != null) {
                constraintLayout2.setVisibility(8);
            }
        }
        C15157dyy.EZpvd.gEmmrt();
        OLrzqt();
        EZpvd();
        AEQbTJ();
    }

    public static final void AEQbTJ(android.view.View view) {
        boolean z = !SPUtils.getBoolean("dapp_vconsole", false);
        SPUtils.put("dapp_vconsole", java.lang.Boolean.valueOf(z));
        if (z) {
            C55326xho.toast$default("vconsole enabled", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else {
            C55326xho.toast$default("vconsole disabled", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public static final Unit AEQbTJ(C15123dyQ c15123dyQ, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        c15123dyQ.OLrzqt(interfaceC9738bbJ, true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dzd.Activity.newInstance$default(o.dzd$Activity, java.lang.Long, java.util.ArrayList, kotlin.jvm.functions.Function2, java.lang.String, boolean, boolean, boolean, int, java.lang.Object):o.dzd */
    public static final void KWHzl(final C15123dyQ c15123dyQ, android.view.View view) {
        C32866mlf.onEvent$default("app_metax_discover_browser_chain&wallent_network_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        C15189dzd c15189dzdNewInstance$default = C15189dzd.Activity.newInstance$default(C15189dzd.Companion, c15123dyQ.KWHzl().EZpvd().getSelectedChain(), c15123dyQ.KWHzl().EZpvd().getSupportChainList(), new Function2() { // from class: o.dyV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C15123dyQ.copydefault(this.AEQbTJ, (C15116dyJ) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, null, c15123dyQ.KWHzl().EZpvd().isDarkMode(), c15123dyQ.KWHzl().EZpvd().getShowSearchNetwork(), false, 72, null);
        androidx.fragment.app.FragmentManager parentFragmentManager = c15123dyQ.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c15189dzdNewInstance$default.show(parentFragmentManager, C15123dyQ.class.getName());
    }

    public static final Unit copydefault(C15123dyQ c15123dyQ, C15116dyJ c15116dyJ, int i) {
        Intrinsics.checkNotNullParameter(c15116dyJ, "");
        c15123dyQ.AEQbTJ(c15116dyJ);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        KWHzl().copydefault();
    }

    public final void EZpvd() {
        KWHzl().AEQbTJ();
    }

    /* JADX INFO: renamed from: o.dyQ$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C15123dyQ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C15123dyQ c15123dyQ) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c15123dyQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    public final void OLrzqt() {
        KWHzl().OLrzqt().observe(this, new StateListAnimator(new Function1() { // from class: o.dyW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15123dyQ.copydefault(this.KWHzl, (java.util.List) obj);
            }
        }));
    }

    public static final Unit copydefault(final C15123dyQ c15123dyQ, java.util.List list) {
        if (list == null || list.isEmpty()) {
            final FragmentActivity activity = c15123dyQ.getActivity();
            if (activity != null) {
                C14923duc c14923duc = C14923duc.EZpvd;
                kotlin.Pair<java.lang.String, java.lang.String> pairAuCTel = c14923duc.AuCTel();
                androidx.fragment.app.FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C14923duc.showConnectWalletDialog$default(c14923duc, pairAuCTel, supportFragmentManager, new Function0() { // from class: o.dyS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C15123dyQ.KWHzl(activity, c15123dyQ);
                    }
                }, null, 8, null);
            }
            return Unit.INSTANCE;
        }
        c15123dyQ.AhwBna.setItems(list);
        c15123dyQ.AhwBna.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(FragmentActivity fragmentActivity, C15123dyQ c15123dyQ) {
        if (!fragmentActivity.isDestroyed()) {
            c15123dyQ.EZpvd();
        }
        return Unit.INSTANCE;
    }

    private final void OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ) {
        KWHzl().EZpvd().setSelectedWalletId(interfaceC9738bbJ.DbNXlk());
        this.AhwBna.notifyDataSetChanged();
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault(interfaceC9738bbJ.DbNXlk());
        final Function1 function1 = new Function1() { // from class: o.dza
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15123dyQ.copydefault(this.KWHzl, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dzb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15123dyQ.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dzc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15123dyQ.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dyY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15123dyQ.gEmmrt(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C15123dyQ c15123dyQ, java.lang.Integer num) {
        InterfaceC9741bbM interfaceC9741bbMGEmmrt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt();
        java.lang.String selectedWalletId = c15123dyQ.KWHzl().EZpvd().getSelectedWalletId();
        Intrinsics.copydefault((java.lang.Object) selectedWalletId);
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = interfaceC9741bbMGEmmrt.OLrzqt(selectedWalletId);
        if (interfaceC9738bbJOLrzqt != null) {
            if (c15123dyQ.KWHzl().EZpvd().getSelectedChain() != null) {
                java.lang.String strKWHzl = C15196dzk.KWHzl.KWHzl(interfaceC9738bbJOLrzqt, c15123dyQ.KWHzl().EZpvd().getSelectedChain());
                if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
                    yHO<? super java.lang.Long, ? super InterfaceC9738bbJ, ? super java.lang.String, Unit> yho = c15123dyQ.gEmmrt;
                    if (yho != null) {
                        yho.invoke(c15123dyQ.KWHzl().EZpvd().getSelectedChain(), interfaceC9738bbJOLrzqt, strKWHzl);
                    }
                    c15123dyQ.KWHzl().copydefault(true);
                }
            } else {
                yHO<? super java.lang.Long, ? super InterfaceC9738bbJ, ? super java.lang.String, Unit> yho2 = c15123dyQ.gEmmrt;
                if (yho2 != null) {
                    yho2.invoke(null, interfaceC9738bbJOLrzqt, null);
                }
                c15123dyQ.KWHzl().copydefault(true);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void AEQbTJ(C15116dyJ c15116dyJ) {
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt;
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        KWHzl().EZpvd().setSelectedChain(java.lang.Long.valueOf(c15116dyJ.OLrzqt()));
        dMJ dmj = this.EZpvd;
        if (dmj != null && (textView = dmj.valueOf) != null) {
            textView.setText(C14923duc.EZpvd.EZpvd(c15116dyJ.AhwBna()));
        }
        dMJ dmj2 = this.EZpvd;
        if (dmj2 != null && (imageView = dmj2.AEQbTJ) != null) {
            C33054mpH.KWHzl(imageView, c15116dyJ.EZpvd());
        }
        if (KWHzl().EZpvd().getSelectedWalletId() == null) {
            EZpvd();
            return;
        }
        java.lang.String selectedWalletId = KWHzl().EZpvd().getSelectedWalletId();
        if (selectedWalletId == null || (interfaceC9738bbJOLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(selectedWalletId)) == null) {
            return;
        }
        if (C15196dzk.KWHzl.EZpvd(interfaceC9738bbJOLrzqt.DbNXlk(), KWHzl().EZpvd().getSelectedChain(), java.lang.Boolean.valueOf(KWHzl().EZpvd().getEnableWithoutBackup()), KWHzl().EZpvd().getDappCustomParams(), KWHzl().EZpvd().isBrc20())) {
            OLrzqt(interfaceC9738bbJOLrzqt, true);
        } else {
            EZpvd();
        }
    }

    public final void OLrzqt(final InterfaceC9738bbJ interfaceC9738bbJ, final boolean z) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(getParentFragmentManager());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        androidx.fragment.app.FragmentManager fragmentManager = (androidx.fragment.app.FragmentManager) objM7377constructorimpl;
        if (fragmentManager != null) {
            C15196dzk.checkRegister$default(C15196dzk.KWHzl, fragmentManager, KWHzl().EZpvd().getSelectedChain(), interfaceC9738bbJ, new Function0() { // from class: o.dyT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C15123dyQ.KWHzl(interfaceC9738bbJ, this, z);
                }
            }, null, 16, null);
        }
    }

    public static final Unit KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, C15123dyQ c15123dyQ, boolean z) {
        C15196dzk c15196dzk = C15196dzk.KWHzl;
        java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
        java.lang.Long selectedChain = c15123dyQ.KWHzl().EZpvd().getSelectedChain();
        boolean enableWithoutBackup = c15123dyQ.KWHzl().EZpvd().getEnableWithoutBackup();
        if (c15196dzk.EZpvd(strDbNXlk, selectedChain, java.lang.Boolean.valueOf(enableWithoutBackup), c15123dyQ.KWHzl().EZpvd().getDappCustomParams(), c15123dyQ.KWHzl().EZpvd().isBrc20())) {
            c15123dyQ.OLrzqt(interfaceC9738bbJ);
        }
        if (z) {
            c15123dyQ.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        yHO<? super java.lang.Long, ? super InterfaceC9738bbJ, ? super java.lang.String, Unit> yho;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        InterfaceC58217yxC interfaceC58217yxC = this.djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC15117dyK interfaceC15117dyK = this.valueOf;
        if (interfaceC15117dyK != null) {
            interfaceC15117dyK.OLrzqt();
        }
        if (KWHzl().KWHzl() || KWHzl().EZpvd().getSelectedWalletId() != null || (yho = this.gEmmrt) == null) {
            return;
        }
        yho.invoke(KWHzl().EZpvd().getSelectedChain(), null, null);
    }

    public final void AEQbTJ(@NotNull java.util.List<? extends InterfaceC9738bbJ> list) {
        Intrinsics.checkNotNullParameter(list, "");
        Function2<? super java.lang.Long, ? super java.util.List<? extends InterfaceC9738bbJ>, Unit> function2 = this.copydefault;
        if (function2 != null) {
            function2.invoke(KWHzl().EZpvd().getSelectedChain(), list);
        }
        dismissAllowingStateLoss();
    }

    public final void copydefault(@NotNull final InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        AbstractC58185ywX<Unit> abstractC58185ywXKWHzl = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).KWHzl(interfaceC9738bbJ.DbNXlk());
        final Function1 function1 = new Function1() { // from class: o.dyX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15123dyQ.KWHzl(this.EZpvd, interfaceC9738bbJ, (Unit) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dyU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15123dyQ.copydefault(function1, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(final C15123dyQ c15123dyQ, final InterfaceC9738bbJ interfaceC9738bbJ, Unit unit) {
        FragmentActivity activity = c15123dyQ.getActivity();
        if (activity != null) {
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).copydefault(interfaceC9738bbJ, activity, new Function1() { // from class: o.dyZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15123dyQ.EZpvd(interfaceC9738bbJ, c15123dyQ, (MpcWalletService.MpcWalletAbleStatus) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, C15123dyQ c15123dyQ, MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus) {
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        if (Intrinsics.EZpvd((java.lang.Object) interfaceC9738bbJ.DbNXlk(), (java.lang.Object) c15123dyQ.KWHzl().EZpvd().getSelectedWalletId())) {
            c15123dyQ.OLrzqt(interfaceC9738bbJ, false);
        }
        c15123dyQ.AEQbTJ();
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        EZpvd();
        if (Intrinsics.EZpvd((java.lang.Object) interfaceC9738bbJ.DbNXlk(), (java.lang.Object) KWHzl().EZpvd().getSelectedWalletId())) {
            OLrzqt(interfaceC9738bbJ, false);
        }
    }
}
