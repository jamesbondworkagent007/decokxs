package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.C13754dXa;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gwy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21293gwy extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity EZpvd;
    public final InterfaceC56387yDm copydefault;

    public C21293gwy() {
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(fXM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.fee.normal.SolanaTransferNetworkFeeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.fee.normal.SolanaTransferNetworkFeeFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.fee.normal.SolanaTransferNetworkFeeFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.gwy$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gwy.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C21293gwy OLrzqt() {
            return new C21293gwy();
        }
    }

    private final fXM<C9615bYt> OLrzqt() {
        return (fXM) this.copydefault.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setStyle(3);
        wxq.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RgLUBD));
        wxq.setCloseVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        final C16612enH c16612enHEZpvd = C16612enH.EZpvd(getLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c16612enHEZpvd, "");
        C9615bYt c9615bYt = (C9615bYt) OLrzqt().AEQbTJ();
        if (c9615bYt == null) {
            return;
        }
        final C9592bYW c9592bYW = (C9592bYW) c9615bYt.QKudOq();
        AbstractC16836erT abstractC16836erT = c16612enHEZpvd.EZpvd;
        abstractC16836erT.getRoot().setSelected(c9615bYt.isConnected() == 1);
        abstractC16836erT.KWHzl.setImageResource(C52761wXj.TaskDescription.HJWChPQdUnVm);
        abstractC16836erT.EZpvd.setText(C33070mpX.AYXKKw(C57406yhn.ActionBar.AYXKKw));
        abstractC16836erT.AEQbTJ.copydefault.setVisibility(8);
        android.view.View root = abstractC16836erT.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, abstractC16836erT, c9615bYt, this));
        AbstractC16836erT abstractC16836erT2 = c16612enHEZpvd.OLrzqt;
        abstractC16836erT2.getRoot().setSelected(c9615bYt.isConnected() == 2);
        abstractC16836erT2.KWHzl.setImageResource(C52761wXj.TaskDescription.HJWChPQPAeHI);
        abstractC16836erT2.EZpvd.setText(C33070mpX.AYXKKw(C57406yhn.ActionBar.AhwBna));
        abstractC16836erT2.AEQbTJ.copydefault.setVisibility(8);
        android.view.View root2 = abstractC16836erT2.getRoot();
        root2.setOnClickListener(new Application(root2, 1000L, abstractC16836erT2, c9615bYt, this));
        AbstractC58185ywX<C8484bDb> abstractC58185ywXIsConnected = c9592bYW.isConnected();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXIsConnected, viewLifecycleOwner, Lifecycle.Event.ON_STOP);
        final Function1 function1 = new Function1() { // from class: o.gwA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21293gwy.EZpvd(c16612enHEZpvd, c9592bYW, (C8484bDb) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.gww
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21293gwy.copydefault(function1, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C16612enH c16612enH, C9592bYW c9592bYW, C8484bDb c8484bDb) {
        AbstractC16836erT abstractC16836erT = c16612enH.EZpvd;
        java.lang.String strEZpvd = c9592bYW.EZpvd(1);
        abstractC16836erT.copydefault.setText(AbstractC8426bCW.formatToFeeCoinAmount$default(c9592bYW, strEZpvd, false, false, false, 14, null));
        abstractC16836erT.AEQbTJ.KWHzl.setText(AbstractC8426bCW.formatToFeeCurrencyAmount$default(c9592bYW, strEZpvd, false, false, false, 6, null));
        AbstractC16836erT abstractC16836erT2 = c16612enH.OLrzqt;
        java.lang.String strEZpvd2 = c9592bYW.EZpvd(2);
        abstractC16836erT2.copydefault.setText(AbstractC8426bCW.formatToFeeCoinAmount$default(c9592bYW, strEZpvd2, false, false, false, 14, null));
        abstractC16836erT2.AEQbTJ.KWHzl.setText(AbstractC8426bCW.formatToFeeCurrencyAmount$default(c9592bYW, strEZpvd2, false, false, false, 6, null));
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, @NotNull AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(activity, "");
        this.EZpvd = activity;
        super.show(fragmentManager, str);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity = this.EZpvd;
        if (activity != null) {
            activity.copydefault(null);
        }
    }

    /* JADX INFO: renamed from: o.gwy$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C9615bYt AEQbTJ;
        public final /* synthetic */ AbstractC16836erT EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C21293gwy OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, AbstractC16836erT abstractC16836erT, C9615bYt c9615bYt, C21293gwy c21293gwy) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = abstractC16836erT;
            this.AEQbTJ = c9615bYt;
            this.OLrzqt = c21293gwy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (!this.EZpvd.getRoot().isSelected()) {
                    this.AEQbTJ.OLrzqt(2);
                    this.AEQbTJ.EZpvd(2);
                }
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.gwy$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C9615bYt AEQbTJ;
        public final /* synthetic */ C21293gwy EZpvd;
        public final /* synthetic */ AbstractC16836erT KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, AbstractC16836erT abstractC16836erT, C9615bYt c9615bYt, C21293gwy c21293gwy) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = abstractC16836erT;
            this.AEQbTJ = c9615bYt;
            this.EZpvd = c21293gwy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (!this.KWHzl.getRoot().isSelected()) {
                    this.AEQbTJ.OLrzqt(1);
                    this.AEQbTJ.EZpvd(2);
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.gwy$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C21293gwy copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C21293gwy c21293gwy) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c21293gwy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
