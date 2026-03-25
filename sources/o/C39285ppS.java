package o;

import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.ui.dialog.KlineEventFragment$addCalendarEvent$1;
import com.okinc.kline.ui.dialog.KlineEventFragment$deleteCalendarEvent$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C36187oSm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ppS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39285ppS extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public KLineEventBean AkhnZx;
    public ActivityResultLauncher<java.lang.String[]> EZpvd;
    public java.lang.String copydefault;
    public boolean djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public RecyclerView fARcdN;
    public C55320xhi fIwbmz;
    public java.lang.String hDKMBd;
    public final InterfaceC56387yDm valueOf;
    public int values;
    public final java.lang.String KWHzl = "KlineEventFragment";
    public final java.lang.String AEQbTJ = "market_kline_calendar";
    public java.lang.String DbNXlk = "";
    public java.lang.String isConnected = "";
    public java.lang.String fetchVPNInfo = "";
    public boolean gEmmrt = true;
    public boolean AhwBna = true;
    public final C43316rmw AYXKKw = new C43316rmw();
    public final InterfaceC56387yDm AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.pqb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39285ppS.KWHzl();
        }
    });
    public final InterfaceC56387yDm fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.ppY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39285ppS.AhwBna(this.OLrzqt);
        }
    });

    public C39285ppS() {
        final Function0 function0 = null;
        this.ejfBZ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37854pDd.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.dialog.KlineEventFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.dialog.KlineEventFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.dialog.KlineEventFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pGZ.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.dialog.KlineEventFragment$special$$inlined$activityViewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.dialog.KlineEventFragment$special$$inlined$activityViewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.dialog.KlineEventFragment$special$$inlined$activityViewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final C37854pDd djBIcL() {
        return (C37854pDd) this.ejfBZ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pGZ valueOf() {
        return (pGZ) this.valueOf.getValue();
    }

    public static final InterfaceC48893ueK KWHzl() {
        return (InterfaceC48893ueK) C43251rlk.OLrzqt(InterfaceC48893ueK.class);
    }

    private final InterfaceC48893ueK gEmmrt() {
        return (InterfaceC48893ueK) this.AuCTel.getValue();
    }

    private final java.lang.String AYXKKw() {
        return (java.lang.String) this.fJNWhG.getValue();
    }

    public static final java.lang.String AhwBna(C39285ppS c39285ppS) {
        return pER.AEQbTJ.AEQbTJ(c39285ppS.DbNXlk, c39285ppS.isConnected, c39285ppS.fetchVPNInfo);
    }

    /* JADX INFO: renamed from: o.ppS$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ppS.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C39285ppS newInstance$default(ActionBar actionBar, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return actionBar.AEQbTJ(z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
        }

        public final C39285ppS AEQbTJ(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("KLINE_IS_CLASSIC", z);
            bundle.putString(oLT.gEmmrt(), str);
            bundle.putString(oLT.valueOf(), str2);
            bundle.putString("Alias", str3);
            bundle.putBoolean("kline_calendar_reminder", z2);
            bundle.putBoolean("isCRMode", z3);
            C39285ppS c39285ppS = new C39285ppS();
            c39285ppS.setArguments(bundle);
            return c39285ppS;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        oMD.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.gasjUx));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        this.gEmmrt = arguments != null ? arguments.getBoolean("KLINE_IS_CLASSIC", true) : true;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString(oLT.valueOf(), "")) == null) {
            string = "";
        }
        this.isConnected = string;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString(oLT.gEmmrt(), "")) == null) {
            string2 = "";
        }
        this.DbNXlk = string2;
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 != null && (string3 = arguments4.getString("Alias", "")) != null) {
            str = string3;
        }
        this.fetchVPNInfo = str;
        android.os.Bundle arguments5 = getArguments();
        this.djBIcL = arguments5 != null ? arguments5.getBoolean("kline_calendar_reminder", false) : false;
        android.os.Bundle arguments6 = getArguments();
        this.AhwBna = arguments6 != null ? arguments6.getBoolean("isCRMode", false) : false;
        this.fARcdN = (RecyclerView) view.findViewById(C35964oKf.StateListAnimator.updateVisuals);
        C55320xhi c55320xhi = (C55320xhi) view.findViewById(C35964oKf.StateListAnimator.INotificationSideChannelStubProxy);
        this.fIwbmz = c55320xhi;
        if (c55320xhi != null) {
            c55320xhi.setOnClickListener(new TaskDescription(c55320xhi, 1000L, this));
        }
        AhwBna();
        if (this.djBIcL && getContext() != null) {
            this.copydefault = AEQbTJ();
            this.EZpvd = pDY.copydefault.copydefault(this, new Function0() { // from class: o.pqg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C39285ppS.valueOf(this.AEQbTJ);
                }
            }, new Function0() { // from class: o.pqd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C39285ppS.copydefault();
                }
            }, new Function0() { // from class: o.pqj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C39285ppS.gEmmrt(this.AEQbTJ);
                }
            });
        }
        view.post(new java.lang.Runnable() { // from class: o.pqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C39285ppS.djBIcL(this.AEQbTJ);
            }
        });
    }

    public static final Unit valueOf(C39285ppS c39285ppS) {
        KLineEventBean kLineEventBean = c39285ppS.AkhnZx;
        if (kLineEventBean != null) {
            c39285ppS.KWHzl(c39285ppS.values, kLineEventBean);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C39285ppS c39285ppS) {
        c39285ppS.isConnected();
        return Unit.INSTANCE;
    }

    public static final void djBIcL(C39285ppS c39285ppS) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c39285ppS, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final java.lang.String AEQbTJ() {
        if (this.AhwBna) {
            return "okx://lite/trade_kline?id=" + this.DbNXlk + "&type=" + this.isConnected + "&refreshWidget=1";
        }
        return "okx://pro/trade_kline?id=" + this.DbNXlk + "&type=" + this.isConnected + "&refreshWidget=1";
    }

    /* JADX INFO: renamed from: o.ppS$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C39285ppS EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C39285ppS c39285ppS) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c39285ppS;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.oSm.ActionBar.newInstance$default(o.oSm$ActionBar, boolean, int, java.lang.Object):o.oSm */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C36187oSm c36187oSmNewInstance$default = C36187oSm.ActionBar.newInstance$default(C36187oSm.Companion, false, 1, null);
                androidx.fragment.app.FragmentManager parentFragmentManager = this.EZpvd.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                c36187oSmNewInstance$default.show(parentFragmentManager);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    private final void isConnected() {
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            pDB.OLrzqt.AEQbTJ(activity, new Function0() { // from class: o.ppZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C39285ppS.AEQbTJ(activity);
                }
            });
        }
    }

    public static final Unit AEQbTJ(FragmentActivity fragmentActivity) {
        pDY.copydefault.KWHzl(fragmentActivity);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull java.util.List<? extends oLP> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AYXKKw.setItems(list);
        this.AYXKKw.notifyDataSetChanged();
    }

    private final void AhwBna() {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        this.AYXKKw.register(KLineEventBean.class, new C39481ptE(context, this.djBIcL, new Function2() { // from class: o.ppU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C39285ppS.KWHzl(this.KWHzl, ((java.lang.Integer) obj).intValue(), (KLineEventBean) obj2);
            }
        }));
        this.AYXKKw.register(oLR.class, new C39479ptC());
        RecyclerView recyclerView = this.fARcdN;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
        }
        RecyclerView recyclerView2 = this.fARcdN;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.AYXKKw);
        }
    }

    public static final Unit KWHzl(C39285ppS c39285ppS, int i, KLineEventBean kLineEventBean) {
        Intrinsics.checkNotNullParameter(kLineEventBean, "");
        c39285ppS.djBIcL().KWHzl().setValue(java.lang.Boolean.TRUE);
        if (kLineEventBean.isAddReminder()) {
            c39285ppS.copydefault(i, kLineEventBean);
        } else {
            c39285ppS.EZpvd(i, kLineEventBean);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        djBIcL().KWHzl().setValue(java.lang.Boolean.FALSE);
        ActivityResultLauncher<java.lang.String[]> activityResultLauncher = this.EZpvd;
        if (activityResultLauncher != null) {
            pDY.copydefault.EZpvd(activityResultLauncher);
        }
    }

    public final void EZpvd(int i, KLineEventBean kLineEventBean) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            pDY pdy = pDY.copydefault;
            if (pdy.AEQbTJ(activity)) {
                KWHzl(i, kLineEventBean);
                return;
            }
            this.values = i;
            this.AkhnZx = kLineEventBean;
            ActivityResultLauncher<java.lang.String[]> activityResultLauncher = this.EZpvd;
            if (activityResultLauncher != null) {
                pdy.copydefault(this, activityResultLauncher);
            }
        }
    }

    public final void KWHzl(final int i, final KLineEventBean kLineEventBean) {
        AbstractC58185ywX abstractC58185ywXEZpvd;
        java.lang.String str = this.hDKMBd;
        if (str == null || str.length() == 0) {
            InterfaceC48893ueK interfaceC48893ueKGEmmrt = gEmmrt();
            if (interfaceC48893ueKGEmmrt != null) {
                java.lang.String strAYXKKw = AYXKKw();
                java.lang.String str2 = this.copydefault;
                if (str2 == null) {
                    Intrinsics.gEmmrt("");
                    str2 = null;
                }
                AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ = interfaceC48893ueKGEmmrt.AEQbTJ(strAYXKKw, new C48891ueI(this.AEQbTJ, str2, false, null, null, 28, null));
                if (abstractC58185ywXAEQbTJ == null || (abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this)) == null) {
                    return;
                }
                final Function1 function1 = new Function1() { // from class: o.ppX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39285ppS.copydefault(this.AEQbTJ, kLineEventBean, i, (C48887ueE) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.pqf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C39285ppS.KWHzl(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.pqc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39285ppS.AEQbTJ(this.copydefault, kLineEventBean, i, (java.lang.Throwable) obj);
                    }
                };
                abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.pqe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C39285ppS.EZpvd(function12, obj);
                    }
                });
                return;
            }
            return;
        }
        java.lang.String str3 = this.hDKMBd;
        OLrzqt(kLineEventBean, str3 != null ? str3 : "", i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C39285ppS c39285ppS, KLineEventBean kLineEventBean, int i, C48887ueE c48887ueE) {
        c39285ppS.hDKMBd = c48887ueE.OLrzqt();
        c39285ppS.OLrzqt(kLineEventBean, c48887ueE.OLrzqt(), i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C39285ppS c39285ppS, KLineEventBean kLineEventBean, int i, java.lang.Throwable th) {
        c39285ppS.OLrzqt(kLineEventBean, "", i);
        pUU.copydefault(c39285ppS.KWHzl, "createShortLink error: " + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void OLrzqt(KLineEventBean kLineEventBean, java.lang.String str, int i) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new KlineEventFragment$addCalendarEvent$1(this, kLineEventBean, str, i, null));
    }

    public final void EZpvd(KLineEventBean kLineEventBean, boolean z, int i) {
        kLineEventBean.setAddReminder(z);
        this.AYXKKw.notifyItemChanged(i);
    }

    public final void copydefault(final int i, final KLineEventBean kLineEventBean) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            pDB.OLrzqt.KWHzl(activity, new Function0() { // from class: o.ppW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C39285ppS.EZpvd(this.KWHzl, i, kLineEventBean);
                }
            });
        }
    }

    public static final Unit EZpvd(C39285ppS c39285ppS, int i, KLineEventBean kLineEventBean) {
        c39285ppS.AEQbTJ(i, kLineEventBean);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(int i, KLineEventBean kLineEventBean) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new KlineEventFragment$deleteCalendarEvent$1(this, kLineEventBean, i, null));
    }
}
