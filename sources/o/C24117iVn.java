package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.invest_biz.ui.page.dialog.MerklClaimReminderParams;
import com.okinc.business.invest_biz.ui.page.dialog.MerklClaimReminderViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.FlowCollector;
import o.iTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iVn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24117iVn extends iTC {
    public final yIP AYXKKw;
    public Function0<Unit> gEmmrt;
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.iVm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24117iVn.KWHzl(this.EZpvd);
        }
    });
    public Function0<Unit> valueOf;
    public final InterfaceC56387yDm values;
    public static final /* synthetic */ yJA<java.lang.Object>[] djBIcL = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(C24117iVn.class, "mBinding", "getMBinding()Lcom/okinc/business/invest_biz/databinding/LayoutClaimReminderDialogBinding;", 0))};
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.valueOf = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> isConnected() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> valueOf() {
        return this.valueOf;
    }

    public C24117iVn() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.MerklClaimReminderBottomSheet$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.MerklClaimReminderBottomSheet$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MerklClaimReminderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.MerklClaimReminderBottomSheet$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.MerklClaimReminderBottomSheet$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.MerklClaimReminderBottomSheet$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.valueOf = new Function0() { // from class: o.iVs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24117iVn.AhwBna();
            }
        };
        this.gEmmrt = new Function0() { // from class: o.iVp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24117iVn.AYXKKw();
            }
        };
        this.AYXKKw = C27589jxz.EZpvd(this);
    }

    public final MerklClaimReminderParams values() {
        return (MerklClaimReminderParams) this.isConnected.getValue();
    }

    public static final MerklClaimReminderParams KWHzl(C24117iVn c24117iVn) {
        MerklClaimReminderParams merklClaimReminderParams;
        android.os.Bundle arguments = c24117iVn.getArguments();
        if (arguments == null || (merklClaimReminderParams = (MerklClaimReminderParams) arguments.getParcelable("bonus_reminder")) == null) {
            throw new java.lang.IllegalStateException("Must provide params".toString());
        }
        return merklClaimReminderParams;
    }

    public final MerklClaimReminderViewModel AkhnZx() {
        return (MerklClaimReminderViewModel) this.values.getValue();
    }

    public static final Unit AhwBna() {
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.iVn$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iVn.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C24117iVn AEQbTJ(@NotNull MerklClaimReminderParams merklClaimReminderParams) {
            Intrinsics.checkNotNullParameter(merklClaimReminderParams, "");
            C24117iVn c24117iVn = new C24117iVn();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bonus_reminder", merklClaimReminderParams);
            c24117iVn.setArguments(bundle);
            return c24117iVn;
        }
    }

    public final void OLrzqt(iJK ijk) {
        this.AYXKKw.KWHzl(this, djBIcL[0], ijk);
    }

    public final iJK djBIcL() {
        return (iJK) this.AYXKKw.getValue(this, djBIcL[0]);
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setCloseVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        OLrzqt(iJK.AEQbTJ(android.view.LayoutInflater.from(requireContext())));
        constraintLayout.addView(djBIcL().getRoot(), new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        iJK ijkDjBIcL = djBIcL();
        C52794wYp c52794wYp = ijkDjBIcL.KWHzl;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = ijkDjBIcL.EZpvd;
        c52794wYp2.setOnClickListener(new ActionBar(c52794wYp2, 1000L, ijkDjBIcL, this));
        ijkDjBIcL.OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.iVo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C24117iVn.AEQbTJ(this.AEQbTJ, view2);
            }
        });
        C27589jxz.collectOnViewLifecycle$default(this, AkhnZx().KWHzl(), null, new Activity(), 2, null);
        AkhnZx().EZpvd(values().KWHzl(), values().copydefault(), values().AEQbTJ());
    }

    public static final void AEQbTJ(C24117iVn c24117iVn, android.view.View view) {
        c24117iVn.AkhnZx().EZpvd(c24117iVn.values().KWHzl(), c24117iVn.values().copydefault(), c24117iVn.values().AEQbTJ());
    }

    /* JADX INFO: renamed from: o.iVn$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(iTP itp, Continuation<? super Unit> continuation) {
            C24117iVn.this.OLrzqt(itp);
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt(@NotNull iTP itp) {
        Intrinsics.checkNotNullParameter(itp, "");
        iJK ijkDjBIcL = djBIcL();
        C55113xdn c55113xdn = ijkDjBIcL.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        boolean z = itp instanceof iTP.TaskDescription;
        c55113xdn.setVisibility(z ? 0 : 8);
        C55173xeu c55173xeu = ijkDjBIcL.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(itp instanceof iTP.StateListAnimator ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat = ijkDjBIcL.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        boolean z2 = itp instanceof iTP.Application;
        linearLayoutCompat.setVisibility(z2 ? 0 : 8);
        ijkDjBIcL.EZpvd.setEnabled(z2);
        if (!z) {
            ijkDjBIcL.AYXKKw.copydefault();
        }
        if (!z2) {
            if (z) {
                ijkDjBIcL.AYXKKw.KWHzl(0L);
                return;
            }
            return;
        }
        iTP.Application application = (iTP.Application) itp;
        ijkDjBIcL.AhwBna.setText(application.AEQbTJ());
        for (C27294jsV c27294jsV : application.KWHzl()) {
            android.content.Context context = ijkDjBIcL.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C27285jsM c27285jsM = new C27285jsM(context, null, 0, 6, null);
            ijkDjBIcL.AEQbTJ.addView(c27285jsM);
            C27285jsM.setData$default(c27285jsM, c27294jsV, null, null, 6, null);
        }
    }

    /* JADX INFO: renamed from: o.iVn$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ iJK KWHzl;
        public final /* synthetic */ C24117iVn OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, iJK ijk, C24117iVn c24117iVn) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = ijk;
            this.OLrzqt = c24117iVn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C52794wYp.startLoading$default(this.KWHzl.EZpvd, 0L, 1, null);
                this.OLrzqt.valueOf().invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.iVn$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C24117iVn OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C24117iVn c24117iVn) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c24117iVn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.isConnected().invoke();
                this.OLrzqt.dismiss();
            }
        }
    }
}
