package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.wallet.mine.data.WalletAddressEmpty;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.DividerBean;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.SendAddressReminderBean;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C21004gra;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gqG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20931gqG extends AbstractC32996moC {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm KWHzl;
    public AbstractC16602emy copydefault;
    public final java.util.ArrayList<java.lang.Object> AEQbTJ = new java.util.ArrayList<>();
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.gqM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C20931gqG.copydefault(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.gqG$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.fGQ;
    }

    public C20931gqG() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C21004gra.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiSendAddress.DefiWalletMultiSelectSendAddressFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiSendAddress.DefiWalletMultiSelectSendAddressFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiSendAddress.DefiWalletMultiSelectSendAddressFragment$special$$inlined$activityViewModels$default$3
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

    public final C21004gra KWHzl() {
        return (C21004gra) this.KWHzl.getValue();
    }

    private final C59534zip OLrzqt() {
        return (C59534zip) this.OLrzqt.getValue();
    }

    public static final C59534zip copydefault(C20931gqG c20931gqG) {
        return new C59534zip(c20931gqG.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.gqG$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gqG.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.os.Bundle KWHzl(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("multi_transfer_mode", i);
            bundle.putString("coinId", str2);
            bundle.putString("wallet_id", str);
            return bundle;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.copydefault = (AbstractC16602emy) viewDataBindingBind;
        FragmentActivity activity = getActivity();
        ActivityC20927gqC activityC20927gqC = activity instanceof ActivityC20927gqC ? (ActivityC20927gqC) activity : null;
        if (activityC20927gqC == null) {
            return;
        }
        EZpvd();
        AhwBna();
        KWHzl(activityC20927gqC);
        copydefault();
        AEQbTJ(activityC20927gqC);
        AEQbTJ();
    }

    private final void AEQbTJ() {
        C32866mlf.onEvent$default("AppMultisender_SendingAddress_ChooseWallet_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public final void KWHzl(final ActivityC20927gqC activityC20927gqC) {
        KWHzl().values().observe(this, new StateListAnimator(new Function1() { // from class: o.gqI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20931gqG.EZpvd(this.KWHzl, activityC20927gqC, (java.util.List) obj);
            }
        }));
    }

    public static final Unit EZpvd(final C20931gqG c20931gqG, ActivityC20927gqC activityC20927gqC, java.util.List list) {
        java.lang.String strDjBIcL;
        C10854bwM c10854bwMKWHzl;
        c20931gqG.dismissLoading();
        if (list == null || list.isEmpty()) {
            C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(c20931gqG.KWHzl().gEmmrt());
            if (c10854bwMKWHzl2 == null || (c10854bwMKWHzl = c10854bwMKWHzl2.KWHzl()) == null || (strDjBIcL = c10854bwMKWHzl.djBIcL()) == null) {
                strDjBIcL = "";
            }
            activityC20927gqC.EZpvd().setVisibility(8);
            activityC20927gqC.OLrzqt().setVisibility(8);
            c20931gqG.AEQbTJ.clear();
            c20931gqG.AEQbTJ.add(new WalletAddressEmpty(strDjBIcL));
            c20931gqG.OLrzqt().notifyDataSetChanged();
            android.view.View view = c20931gqG.getView();
            if (view != null) {
                view.post(new java.lang.Runnable() { // from class: o.gqN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20931gqG.djBIcL(this.copydefault);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        c20931gqG.KWHzl((java.util.List<C21004gra.Activity>) list);
        activityC20927gqC.copydefault();
        if (c20931gqG.KWHzl().AkhnZx()) {
            activityC20927gqC.EZpvd().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.FHvxmb));
            activityC20927gqC.EZpvd().setEnabled(c20931gqG.KWHzl().djBIcL() != null);
        } else {
            C52794wYp c52794wYpEZpvd = activityC20927gqC.EZpvd();
            android.content.Context context = c20931gqG.getContext();
            c52794wYpEZpvd.setText(context != null ? C33069mpW.KWHzl(context, C13754dXa.FragmentManager.ActivityResultCallback, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(c20931gqG.KWHzl().AhwBna().size())))) : null);
            activityC20927gqC.EZpvd().setEnabled(C33129mqd.AEQbTJ(java.lang.Integer.valueOf(c20931gqG.KWHzl().AhwBna().size()), 0));
            activityC20927gqC.OLrzqt().setSelected(c20931gqG.KWHzl().AYXKKw());
        }
        android.view.View view2 = c20931gqG.getView();
        if (view2 != null) {
            view2.post(new java.lang.Runnable() { // from class: o.gqR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C20931gqG.valueOf(this.AEQbTJ);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(C20931gqG c20931gqG) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c20931gqG, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void valueOf(C20931gqG c20931gqG) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c20931gqG, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void copydefault() {
        showLoading();
        KWHzl().valueOf();
    }

    public final void EZpvd() {
        java.lang.String string;
        C21004gra c21004graKWHzl = KWHzl();
        android.os.Bundle arguments = getArguments();
        java.lang.String strValueOf = java.lang.String.valueOf(arguments != null ? arguments.getString("coinId") : null);
        if (strValueOf.length() == 0) {
            strValueOf = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        c21004graKWHzl.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(strValueOf)));
        C21004gra c21004graKWHzl2 = KWHzl();
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("from")) == null) {
            string = "";
        }
        c21004graKWHzl2.KWHzl(string);
        C21004gra c21004graKWHzl3 = KWHzl();
        android.os.Bundle arguments3 = getArguments();
        c21004graKWHzl3.KWHzl(arguments3 != null ? java.lang.Integer.valueOf(arguments3.getInt("multi_transfer_mode")) : null);
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(KWHzl().gEmmrt());
        if (c10854bwMKWHzl == null) {
            return;
        }
        KWHzl().EZpvd(java.lang.Long.valueOf(c10854bwMKWHzl.fetchVPNInfo()));
    }

    private final void AhwBna() {
        AbstractC16602emy abstractC16602emy = this.copydefault;
        AbstractC16602emy abstractC16602emy2 = null;
        if (abstractC16602emy == null) {
            Intrinsics.gEmmrt("");
            abstractC16602emy = null;
        }
        abstractC16602emy.EZpvd.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        AbstractC16602emy abstractC16602emy3 = this.copydefault;
        if (abstractC16602emy3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16602emy2 = abstractC16602emy3;
        }
        abstractC16602emy2.EZpvd.setHasFixedSize(true);
        gEmmrt();
    }

    private final void gEmmrt() {
        C59534zip c59534zipOLrzqt = OLrzqt();
        java.lang.Integer numFetchVPNInfo = KWHzl().fetchVPNInfo();
        c59534zipOLrzqt.register(C21004gra.Activity.class, new C20899gpb(numFetchVPNInfo != null ? numFetchVPNInfo.intValue() : MultiTransferMode.MODE_ONE_TO_MANY.getValue(), new Function2() { // from class: o.gqJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20931gqG.OLrzqt(this.OLrzqt, (C21004gra.Activity) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }, new Function2() { // from class: o.gqL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20931gqG.OLrzqt(this.AEQbTJ, (java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }));
        C59534zip c59534zipOLrzqt2 = OLrzqt();
        java.lang.Long lOLrzqt = KWHzl().OLrzqt();
        java.lang.Long lGEmmrt = KWHzl().gEmmrt();
        java.lang.Integer numFetchVPNInfo2 = KWHzl().fetchVPNInfo();
        c59534zipOLrzqt2.register(C21004gra.Application.class, new C20842goX(this, lOLrzqt, lGEmmrt, numFetchVPNInfo2 != null ? numFetchVPNInfo2.intValue() : MultiTransferMode.MODE_ONE_TO_MANY.getValue(), new Function2() { // from class: o.gqK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20931gqG.EZpvd(this.AEQbTJ, (java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }));
        OLrzqt().register(SendAddressReminderBean.class, new C20902gpe());
        OLrzqt().register(DividerBean.class, new C20831goM());
        OLrzqt().register(WalletAddressEmpty.class, new C20841goW());
        AbstractC16602emy abstractC16602emy = this.copydefault;
        if (abstractC16602emy == null) {
            Intrinsics.gEmmrt("");
            abstractC16602emy = null;
        }
        abstractC16602emy.EZpvd.setAdapter(OLrzqt());
    }

    public static final Unit OLrzqt(C20931gqG c20931gqG, C21004gra.Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "");
        c20931gqG.KWHzl().copydefault(activity.copydefault().EZpvd(), z);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C20931gqG c20931gqG, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (c20931gqG.KWHzl().AkhnZx()) {
            c20931gqG.KWHzl().OLrzqt(str);
        } else {
            C21004gra.updateWalletSelectStateForMultiMode$default(c20931gqG.KWHzl(), str, z, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C20931gqG c20931gqG, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (c20931gqG.KWHzl().AkhnZx()) {
            c20931gqG.KWHzl().OLrzqt(str);
        } else {
            C21004gra.updateWalletSelectStateForMultiMode$default(c20931gqG.KWHzl(), str, z, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(ActivityC20927gqC activityC20927gqC) {
        activityC20927gqC.EZpvd(new Function0() { // from class: o.gqP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20931gqG.AYXKKw(this.EZpvd);
            }
        });
    }

    public static final Unit AYXKKw(C20931gqG c20931gqG) {
        c20931gqG.KWHzl().EZpvd("", false, true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.util.List<C21004gra.Activity> list) {
        this.AEQbTJ.clear();
        int iAEQbTJ = KWHzl().AEQbTJ() - KWHzl().KWHzl();
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(iAEQbTJ), 0)) {
            this.AEQbTJ.add(new SendAddressReminderBean(iAEQbTJ));
        }
        for (C21004gra.Activity activity : list) {
            this.AEQbTJ.add(activity);
            if (activity.KWHzl()) {
                this.AEQbTJ.addAll(activity.copydefault().KWHzl());
            }
            if (activity.AEQbTJ()) {
                this.AEQbTJ.add(new DividerBean(false, 1, null));
            }
        }
        OLrzqt().notifyDataSetChanged();
    }
}
