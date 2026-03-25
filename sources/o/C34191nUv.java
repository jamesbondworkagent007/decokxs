package o;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.group.joinreview.JoinReviewFragment$initViewModel$1;
import com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.nUN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nUv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C34191nUv extends AbstractC34179nUi implements nUN.Activity {
    public static final Application Companion = new Application(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm fetchVPNInfo;
    public nJV gEmmrt;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.nUx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34191nUv.djBIcL(this.EZpvd);
        }
    });
    public final int djBIcL = C35399nuc.Dialog.hBpjJd;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.nUu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Long.valueOf(C34191nUv.valueOf());
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    public C34191nUv() {
        final Function0 function0 = null;
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(JoinReviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.joinreview.JoinReviewFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.joinreview.JoinReviewFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.joinreview.JoinReviewFragment$special$$inlined$activityViewModels$default$3
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

    public final JoinReviewViewModel AhwBna() {
        return (JoinReviewViewModel) this.fetchVPNInfo.getValue();
    }

    public final nUN AYXKKw() {
        return (nUN) this.AYXKKw.getValue();
    }

    public static final nUN djBIcL(C34191nUv c34191nUv) {
        nUN nun = new nUN();
        nun.OLrzqt(c34191nUv);
        return nun;
    }

    public final ActivityC34183nUn gEmmrt() {
        FragmentActivity activity = getActivity();
        if (activity instanceof ActivityC34183nUn) {
            return (ActivityC34183nUn) activity;
        }
        return null;
    }

    /* JADX INFO: renamed from: o.nUv$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nUv.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nJV njvEZpvd = nJV.EZpvd(layoutInflater, viewGroup, false);
        this.gEmmrt = njvEZpvd;
        if (njvEZpvd != null) {
            return njvEZpvd.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.gEmmrt = null;
        super.onDestroyView();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        final nJV njv = this.gEmmrt;
        if (njv != null) {
            C33546myW c33546myW = njv.AYXKKw;
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.nUt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    C34191nUv.OLrzqt(this.copydefault, interfaceC57934yrl);
                }
            });
            c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.nUy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57900yrD
                public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                    C34191nUv.EZpvd(this.copydefault, interfaceC57934yrl);
                }
            });
            njv.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.nUA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C34191nUv.KWHzl(njv, view2);
                }
            });
            njv.OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.nUC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C34191nUv.OLrzqt(this.AEQbTJ, compoundButton, z);
                }
            });
            wYF wyf = njv.KWHzl;
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, this));
            }
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setOnClickListener(new Activity(c52794wYpAEQbTJ, 1000L, this));
            }
            ConstraintLayout constraintLayout = njv.EZpvd;
            Intrinsics.copydefault(constraintLayout);
            constraintLayout.setVisibility(4);
            android.view.ViewTreeObserver viewTreeObserver = constraintLayout.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new StateListAnimator(viewTreeObserver, constraintLayout, constraintLayout, njv));
            njv.valueOf.setAdapter(AYXKKw());
            RecyclerView.ItemAnimator itemAnimator = njv.valueOf.getItemAnimator();
            AhwBna().KWHzl(itemAnimator != null ? java.lang.Long.valueOf(yEY.KWHzl(itemAnimator.getAddDuration(), itemAnimator.getRemoveDuration(), itemAnimator.getChangeDuration(), itemAnimator.getMoveDuration())) : null);
        }
        values();
    }

    public static final void OLrzqt(C34191nUv c34191nUv, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        JoinReviewViewModel.refreshJoinRequests$default(c34191nUv.AhwBna(), false, 1, null);
    }

    public static final void EZpvd(C34191nUv c34191nUv, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c34191nUv.AhwBna().copydefault();
    }

    public static final void KWHzl(nJV njv, android.view.View view) {
        njv.OLrzqt.performClick();
    }

    public static final void OLrzqt(C34191nUv c34191nUv, android.widget.CompoundButton compoundButton, boolean z) {
        c34191nUv.AhwBna().EZpvd(z);
    }

    private final void values() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new JoinReviewFragment$initViewModel$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.nUv$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ ConstraintLayout AEQbTJ;
        public final /* synthetic */ nJV EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ android.view.ViewTreeObserver OLrzqt;

        public StateListAnimator(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, ConstraintLayout constraintLayout, nJV njv) {
            this.OLrzqt = viewTreeObserver;
            this.KWHzl = view;
            this.AEQbTJ = constraintLayout;
            this.EZpvd = njv;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.OLrzqt.isAlive() ? this.OLrzqt : this.KWHzl.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            this.AEQbTJ.setTranslationY(this.EZpvd.EZpvd.getHeight());
        }
    }

    /* JADX INFO: renamed from: o.nUv$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C34191nUv OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C34191nUv c34191nUv) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c34191nUv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.AhwBna().fIwbmz();
            }
        }
    }

    /* JADX INFO: renamed from: o.nUv$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C34191nUv copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C34191nUv c34191nUv) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c34191nUv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ActivityC34183nUn activityC34183nUnGEmmrt = this.copydefault.gEmmrt();
                if (activityC34183nUnGEmmrt != null) {
                    activityC34183nUnGEmmrt.gEmmrt();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        nJV njv = this.gEmmrt;
        if (njv != null) {
            njv.AYXKKw.valueOf();
            njv.AYXKKw.AEQbTJ();
        }
    }

    @Override // o.nUN.Activity
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AhwBna().EZpvd(str);
    }

    @Override // o.nUN.Activity
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AhwBna().KWHzl(str);
    }

    @Override // o.nUN.Activity
    public void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        AhwBna().AEQbTJ(str, z);
    }

    public final long djBIcL() {
        return ((java.lang.Number) this.AhwBna.getValue()).longValue();
    }

    public static final long valueOf() {
        return C33070mpX.AhwBna(android.R.integer.config_shortAnimTime);
    }

    public final void KWHzl(boolean z) {
        final nJV njv = this.gEmmrt;
        if (njv != null) {
            if (z) {
                njv.EZpvd.animate().translationY(njv.EZpvd.getHeight()).setDuration(djBIcL()).withEndAction(new java.lang.Runnable() { // from class: o.nUz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C34191nUv.AEQbTJ(njv, this);
                    }
                }).start();
                return;
            }
            isConnected();
            ConstraintLayout constraintLayout = njv.EZpvd;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            njv.EZpvd.animate().translationY(0.0f).setDuration(djBIcL()).withEndAction(new java.lang.Runnable() { // from class: o.nUB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C34191nUv.EZpvd(njv);
                }
            }).start();
        }
    }

    public static final void AEQbTJ(nJV njv, C34191nUv c34191nUv) {
        ConstraintLayout constraintLayout = njv.EZpvd;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        android.widget.FrameLayout frameLayout = njv.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), 0);
        c34191nUv.AhwBna().EZpvd(false);
    }

    public static final void EZpvd(nJV njv) {
        android.widget.FrameLayout frameLayout = njv.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), njv.EZpvd.getHeight());
    }

    public final void isConnected() {
        nJV njv = this.gEmmrt;
        if (njv != null) {
            njv.gEmmrt.setText(C33069mpW.copydefault(C35399nuc.LoaderManager.zXhzOT, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(AhwBna().AEQbTJ())))));
        }
    }
}
