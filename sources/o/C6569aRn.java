package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aRn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6569aRn extends AbstractC6557aRb {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public AbstractC8245azB AYXKKw;
    public final int AhwBna;
    public final InterfaceC56387yDm djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C6569aRn() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.zuBGHE int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:18) call: o.aRn.<init>(int):void type: THIS */
    public /* synthetic */ C6569aRn(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.zuBGHE : i);
    }

    public C6569aRn(int i) {
        this.AhwBna = i;
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PasskeySyncStepperViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncSuccessFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncSuccessFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncSuccessFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.aRb.EZpvd()V */
    public final PasskeySyncStepperViewModel EZpvd() {
        return (PasskeySyncStepperViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: renamed from: o.aRn$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aRn.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C6569aRn KWHzl() {
            return new C6569aRn(0, 1, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new ActionBar());
    }

    /* JADX INFO: renamed from: o.aRn$ActionBar */
    public static final class ActionBar extends OnBackPressedCallback {
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
        }

        public ActionBar() {
            super(true);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC8245azB abstractC8245azB = (AbstractC8245azB) DataBindingUtil.bind(view);
        this.AYXKKw = abstractC8245azB;
        if (abstractC8245azB != null) {
            abstractC8245azB.copydefault.AEQbTJ().setVisibility(8);
            abstractC8245azB.copydefault.setType(0);
            abstractC8245azB.copydefault.setStatus(4);
            abstractC8245azB.copydefault.setTitleText("Passkey synced");
            wYF wyfOLrzqt = abstractC8245azB.copydefault.OLrzqt();
            C52794wYp c52794wYpCopydefault = wyfOLrzqt.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
            }
            C52794wYp c52794wYpCopydefault2 = wyfOLrzqt.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setContentDescription("syncSuccessOkButton");
            }
            C52794wYp c52794wYpCopydefault3 = wyfOLrzqt.copydefault();
            if (c52794wYpCopydefault3 != null) {
                c52794wYpCopydefault3.setText(getString(C8206ayP.Dialog.UrRBLY));
            }
            C52794wYp c52794wYpAEQbTJ = wyfOLrzqt.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(8);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
    }

    /* JADX INFO: renamed from: o.aRn$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C6569aRn KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C6569aRn c6569aRn) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c6569aRn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.EZpvd().values();
            }
        }
    }
}
