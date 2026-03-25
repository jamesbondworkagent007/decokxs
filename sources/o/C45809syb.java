package o;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.okinc.okex.rating.viewmodel.RatingSubmitViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47315tni;
import o.syG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.syb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45809syb extends AbstractC32996moC implements syG.Activity {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AYXKKw;
    public AbstractC47338toE OLrzqt;
    public final java.lang.String copydefault = "images/customer_genius/android/ic_rating_feedback.webp";
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.sya
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45809syb.EZpvd(this.KWHzl);
        }
    });
    public final int AEQbTJ = C47315tni.ActionBar.OcIXYQ;

    /* JADX INFO: renamed from: o.syb$StateListAnimator */
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
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public C45809syb() {
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RatingSubmitViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitFormFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitFormFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitFormFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.syb$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.syb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C45809syb OLrzqt() {
            return new C45809syb();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RatingSubmitViewModel KWHzl() {
        return (RatingSubmitViewModel) this.AYXKKw.getValue();
    }

    public final syG EZpvd() {
        return (syG) this.EZpvd.getValue();
    }

    public static final syG EZpvd(C45809syb c45809syb) {
        syG syg = new syG();
        syg.copydefault(c45809syb);
        return syg;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47338toE abstractC47338toEKWHzl = AbstractC47338toE.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47338toEKWHzl, "");
        this.OLrzqt = abstractC47338toEKWHzl;
        android.view.View root = abstractC47338toEKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        RatingSubmitViewModel ratingSubmitViewModelKWHzl = KWHzl();
        ratingSubmitViewModelKWHzl.fJNWhG().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.sxY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45809syb.OLrzqt(this.EZpvd, (RatingSubmitViewModel.TaskDescription) obj);
            }
        }));
        ratingSubmitViewModelKWHzl.AubY().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.syr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45809syb.AEQbTJ(this.AEQbTJ, (RatingSubmitViewModel.TitleModel) obj);
            }
        }));
        ratingSubmitViewModelKWHzl.uzCIH().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.syq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45809syb.KWHzl(this.KWHzl, (RatingSubmitViewModel.StarModel) obj);
            }
        }));
        ratingSubmitViewModelKWHzl.fARcdN().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.syc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45809syb.KWHzl(this.EZpvd, (RatingSubmitViewModel.LabelModel) obj);
            }
        }));
        ratingSubmitViewModelKWHzl.getNewProxyInstance().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.sxZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45809syb.AEQbTJ(this.OLrzqt, (RatingSubmitViewModel.MandatoryFeedbackModel) obj);
            }
        }));
        ratingSubmitViewModelKWHzl.fIwbmz().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.sye
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45809syb.KWHzl(this.OLrzqt, (RatingSubmitViewModel.FeedbackModel) obj);
            }
        }));
        ratingSubmitViewModelKWHzl.AuCTelauCTel().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.syg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45809syb.AEQbTJ(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        ratingSubmitViewModelKWHzl.zuBGHE().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.syd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45809syb.KWHzl(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        final AbstractC47338toE abstractC47338toE = this.OLrzqt;
        if (abstractC47338toE != null) {
            abstractC47338toE.values.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.syh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C45809syb.AEQbTJ(this.KWHzl, abstractC47338toE, compoundButton, z);
                }
            });
            abstractC47338toE.AhwBna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.syf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C45809syb.KWHzl(this.EZpvd, abstractC47338toE, compoundButton, z);
                }
            });
            abstractC47338toE.DbNXlk.setOnScoreClickListener(new Function1() { // from class: o.syi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45809syb.KWHzl(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            });
            abstractC47338toE.valueOf.setOnRatingClickListener(new Function1() { // from class: o.syj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45809syb.EZpvd(this.KWHzl, ((java.lang.Integer) obj).intValue());
                }
            });
            final C55008xbo c55008xbo = abstractC47338toE.EZpvd;
            C55009xbp c55009xbpFIwbmz = c55008xbo.fIwbmz();
            if (c55009xbpFIwbmz != null) {
                c55009xbpFIwbmz.fetchVPNInfo();
            }
            final C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.sym
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(android.view.View view2, boolean z) {
                        C45809syb.EZpvd(abstractC47338toE, c55008xbo, c55001xbhAkhnZx, this, view2, z);
                    }
                });
                c55001xbhAkhnZx.addTextChangedListener(new Activity());
            }
            abstractC47338toE.copydefault.setTextChangedListener(new Function1() { // from class: o.syl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45809syb.EZpvd(this.EZpvd, (java.lang.CharSequence) obj);
                }
            });
            abstractC47338toE.copydefault.setFocusCallback(new Function1() { // from class: o.syk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45809syb.AEQbTJ(abstractC47338toE, this, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            RecyclerView recyclerView = abstractC47338toE.fetchVPNInfo;
            recyclerView.setAdapter(EZpvd());
            FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
            flexboxLayoutManager.setFlexDirection(0);
            flexboxLayoutManager.setFlexWrap(1);
            flexboxLayoutManager.setAlignItems(0);
            recyclerView.setLayoutManager(flexboxLayoutManager);
        }
        view.post(new java.lang.Runnable() { // from class: o.syn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45809syb.KWHzl(this.OLrzqt);
            }
        });
    }

    public static final Unit OLrzqt(C45809syb c45809syb, RatingSubmitViewModel.TaskDescription taskDescription) {
        c45809syb.EZpvd(taskDescription);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C45809syb c45809syb, RatingSubmitViewModel.TitleModel titleModel) {
        c45809syb.AEQbTJ(titleModel);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C45809syb c45809syb, RatingSubmitViewModel.StarModel starModel) {
        c45809syb.AEQbTJ(starModel);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C45809syb c45809syb, RatingSubmitViewModel.LabelModel labelModel) {
        c45809syb.AEQbTJ(labelModel);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C45809syb c45809syb, RatingSubmitViewModel.MandatoryFeedbackModel mandatoryFeedbackModel) {
        c45809syb.EZpvd(mandatoryFeedbackModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.syb$Activity */
    public static final class Activity implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C45809syb.this.KWHzl().OLrzqt(editable != null ? editable.toString() : null);
        }
    }

    public static final Unit KWHzl(C45809syb c45809syb, RatingSubmitViewModel.FeedbackModel feedbackModel) {
        c45809syb.KWHzl(feedbackModel);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C45809syb c45809syb, java.lang.Boolean bool) {
        Intrinsics.copydefault(bool);
        c45809syb.OLrzqt(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.syb$ActionBar */
    public static final class ActionBar implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ AbstractC47338toE AEQbTJ;
        public final /* synthetic */ C45809syb KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        public ActionBar(android.view.View view, C45809syb c45809syb, AbstractC47338toE abstractC47338toE) {
            this.copydefault = view;
            this.KWHzl = c45809syb;
            this.AEQbTJ = abstractC47338toE;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.copydefault.getRootView().getWindowVisibleDisplayFrame(new android.graphics.Rect());
            if (r1 - r0.bottom > ((double) this.copydefault.getRootView().getHeight()) * 0.15d) {
                this.copydefault.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C45809syb c45809syb = this.KWHzl;
                android.widget.ScrollView scrollView = this.AEQbTJ.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(scrollView, "");
                syW syw = this.AEQbTJ.copydefault;
                Intrinsics.checkNotNullExpressionValue(syw, "");
                c45809syb.EZpvd(scrollView, syw);
            }
        }
    }

    /* JADX INFO: renamed from: o.syb$TaskDescription */
    public static final class TaskDescription implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ AbstractC47338toE AEQbTJ;
        public final /* synthetic */ C55008xbo EZpvd;
        public final /* synthetic */ C45809syb KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        public TaskDescription(android.view.View view, C45809syb c45809syb, AbstractC47338toE abstractC47338toE, C55008xbo c55008xbo) {
            this.OLrzqt = view;
            this.KWHzl = c45809syb;
            this.AEQbTJ = abstractC47338toE;
            this.EZpvd = c55008xbo;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.OLrzqt.getRootView().getWindowVisibleDisplayFrame(new android.graphics.Rect());
            if (r1 - r0.bottom > ((double) this.OLrzqt.getRootView().getHeight()) * 0.15d) {
                this.OLrzqt.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C45809syb c45809syb = this.KWHzl;
                android.widget.ScrollView scrollView = this.AEQbTJ.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(scrollView, "");
                Intrinsics.copydefault(this.EZpvd);
                c45809syb.EZpvd(scrollView, this.EZpvd);
            }
        }
    }

    public static final Unit KWHzl(C45809syb c45809syb, java.lang.Boolean bool) {
        Intrinsics.copydefault(bool);
        c45809syb.KWHzl(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C45809syb c45809syb, AbstractC47338toE abstractC47338toE, android.widget.CompoundButton compoundButton, boolean z) {
        if (z) {
            c45809syb.KWHzl().KWHzl(java.lang.Boolean.TRUE);
            abstractC47338toE.AhwBna.setChecked(false);
        } else {
            if (abstractC47338toE.AhwBna.isChecked()) {
                return;
            }
            c45809syb.KWHzl().KWHzl((java.lang.Boolean) null);
        }
    }

    public static final void KWHzl(C45809syb c45809syb, AbstractC47338toE abstractC47338toE, android.widget.CompoundButton compoundButton, boolean z) {
        if (z) {
            c45809syb.KWHzl().KWHzl(java.lang.Boolean.FALSE);
            abstractC47338toE.values.setChecked(false);
        } else {
            if (abstractC47338toE.values.isChecked()) {
                return;
            }
            c45809syb.KWHzl().KWHzl((java.lang.Boolean) null);
        }
    }

    public static final Unit KWHzl(C45809syb c45809syb, int i) {
        c45809syb.KWHzl().OLrzqt(i);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C45809syb c45809syb, int i) {
        c45809syb.KWHzl().AEQbTJ(i);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(AbstractC47338toE abstractC47338toE, C55008xbo c55008xbo, C55001xbh c55001xbh, C45809syb c45809syb, android.view.View view, boolean z) {
        if (z) {
            android.widget.ScrollView scrollView = abstractC47338toE.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(scrollView, "");
            scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new TaskDescription(scrollView, c45809syb, abstractC47338toE, c55008xbo));
            c55008xbo.values();
            return;
        }
        if (c55001xbh.getText() != null && (!StringsKt__StringsKt.fARcdN(r0))) {
            c55008xbo.values();
        } else {
            c55008xbo.setErrorText(C33070mpX.AYXKKw(C47315tni.PendingIntent.gEmmrt));
        }
    }

    public static final Unit EZpvd(C45809syb c45809syb, java.lang.CharSequence charSequence) {
        c45809syb.KWHzl().copydefault(charSequence != null ? charSequence.toString() : null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC47338toE abstractC47338toE, C45809syb c45809syb, boolean z) {
        if (z) {
            android.widget.ScrollView scrollView = abstractC47338toE.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(scrollView, "");
            scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ActionBar(scrollView, c45809syb, abstractC47338toE));
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C45809syb c45809syb) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45809syb, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }

    public final void EZpvd(android.widget.ScrollView scrollView, android.view.View view) {
        scrollView.smoothScrollTo(0, (view.getBottom() + C55298xhM.dp2px$default(12.0f, null, 1, null)) - scrollView.getHeight());
    }

    public final void AEQbTJ() {
        AbstractC47338toE abstractC47338toE = this.OLrzqt;
        if (abstractC47338toE != null) {
            abstractC47338toE.copydefault.clearFocus();
            C55001xbh c55001xbhAkhnZx = abstractC47338toE.EZpvd.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.clearFocus();
            }
            C33570myu.AEQbTJ(getContext(), abstractC47338toE.getRoot());
        }
    }

    public final void EZpvd(RatingSubmitViewModel.TaskDescription taskDescription) {
        AbstractC47338toE abstractC47338toE = this.OLrzqt;
        if (abstractC47338toE != null) {
            android.widget.ImageView imageView = abstractC47338toE.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            java.lang.String str = this.copydefault;
            android.content.Context context = abstractC47338toE.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C33054mpH.loadUrl$default(imageView, C43454rpb.copydefault(str, context, true), null, 0, 0, 14, null);
            android.widget.ImageView imageView2 = abstractC47338toE.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(taskDescription != null ? 0 : 8);
        }
    }

    public final void AEQbTJ(RatingSubmitViewModel.TitleModel titleModel) {
        android.widget.TextView textView;
        AbstractC47338toE abstractC47338toE = this.OLrzqt;
        if (abstractC47338toE == null || (textView = abstractC47338toE.isConnected) == null) {
            return;
        }
        java.lang.String strOLrzqt = titleModel != null ? titleModel.OLrzqt() : null;
        textView.setText(strOLrzqt);
        textView.setVisibility((strOLrzqt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt)) ^ true ? 0 : 8);
        java.lang.Integer numValueOf = titleModel != null ? java.lang.Integer.valueOf(titleModel.AEQbTJ()) : null;
        textView.setGravity((numValueOf != null && numValueOf.intValue() == 1) ? 8388611 : 17);
    }

    public final void AEQbTJ(RatingSubmitViewModel.StarModel starModel) {
        AbstractC47338toE abstractC47338toE = this.OLrzqt;
        if (abstractC47338toE != null) {
            C45863szc c45863szc = abstractC47338toE.valueOf;
            Intrinsics.checkNotNullExpressionValue(c45863szc, "");
            int i = 0;
            if (starModel != null) {
                if (starModel.copydefault() != null) {
                    abstractC47338toE.valueOf.setStarLabels(starModel.copydefault());
                }
                abstractC47338toE.valueOf.setActiveStar(starModel.KWHzl());
                AEQbTJ();
            } else {
                abstractC47338toE.valueOf.setActiveStar(0);
                i = 8;
            }
            c45863szc.setVisibility(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [259=4, 359=4] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(RatingSubmitViewModel.LabelModel labelModel) {
        AbstractC47338toE abstractC47338toE = this.OLrzqt;
        if (abstractC47338toE != null) {
            int i = 0;
            if (labelModel != null) {
                android.widget.TextView textView = abstractC47338toE.gEmmrt;
                textView.setText(labelModel.copydefault());
                Intrinsics.copydefault(textView);
                java.lang.String strCopydefault = labelModel.copydefault();
                textView.setVisibility((strCopydefault == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) ^ true ? 0 : 8);
                RecyclerView recyclerView = abstractC47338toE.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                recyclerView.setVisibility(labelModel.KWHzl().isEmpty() ^ true ? 0 : 8);
                EZpvd().AEQbTJ(labelModel.KWHzl());
                AEQbTJ();
            } else {
                android.widget.TextView textView2 = abstractC47338toE.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
                RecyclerView recyclerView2 = abstractC47338toE.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                recyclerView2.setVisibility(8);
            }
            android.view.View view = abstractC47338toE.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(view, "");
            C45863szc c45863szc = abstractC47338toE.valueOf;
            Intrinsics.checkNotNullExpressionValue(c45863szc, "");
            if (c45863szc.getVisibility() == 0) {
                android.widget.TextView textView3 = abstractC47338toE.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                if (textView3.getVisibility() != 0) {
                    android.widget.LinearLayout linearLayout = abstractC47338toE.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                    if (linearLayout.getVisibility() != 0) {
                        syZ syz = abstractC47338toE.DbNXlk;
                        Intrinsics.checkNotNullExpressionValue(syz, "");
                        if (syz.getVisibility() != 0) {
                            i = 8;
                        }
                    }
                }
            }
            view.setVisibility(i);
        }
    }

    public final void EZpvd(RatingSubmitViewModel.MandatoryFeedbackModel mandatoryFeedbackModel) {
        AbstractC47338toE abstractC47338toE = this.OLrzqt;
        if (abstractC47338toE == null || mandatoryFeedbackModel == null) {
            return;
        }
        C55008xbo c55008xbo = abstractC47338toE.EZpvd;
        Intrinsics.copydefault(c55008xbo);
        boolean z = c55008xbo.getVisibility() == 0;
        c55008xbo.setHintText(mandatoryFeedbackModel.EZpvd());
        c55008xbo.setVisibility(mandatoryFeedbackModel.AEQbTJ() ? 0 : 8);
        if (!mandatoryFeedbackModel.AEQbTJ()) {
            c55008xbo.setText("");
        } else {
            if (z) {
                return;
            }
            c55008xbo.values();
            C33570myu.AEQbTJ(abstractC47338toE.getRoot().getContext(), (android.widget.EditText) c55008xbo.AkhnZx());
        }
    }

    @Override // o.syG.Activity
    public void copydefault(long j) {
        KWHzl().EZpvd(java.lang.Long.valueOf(j));
    }

    public final void KWHzl(RatingSubmitViewModel.FeedbackModel feedbackModel) {
        AbstractC47338toE abstractC47338toE = this.OLrzqt;
        if (abstractC47338toE != null) {
            syW syw = abstractC47338toE.copydefault;
            Intrinsics.copydefault(syw);
            syw.setVisibility(feedbackModel != null ? 0 : 8);
            syw.setText(feedbackModel != null ? feedbackModel.OLrzqt() : null);
            android.widget.TextView textView = abstractC47338toE.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            syW syw2 = abstractC47338toE.copydefault;
            Intrinsics.checkNotNullExpressionValue(syw2, "");
            textView.setVisibility(syw2.getVisibility() == 0 ? 0 : 8);
        }
    }

    public static /* synthetic */ void renderIssueResolvedSection$default(C45809syb c45809syb, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c45809syb.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        AbstractC47338toE abstractC47338toE = this.OLrzqt;
        if (abstractC47338toE != null) {
            android.widget.LinearLayout linearLayout = abstractC47338toE.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(z ? 0 : 8);
        }
    }

    public static /* synthetic */ void renderRatingScoreBar$default(C45809syb c45809syb, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c45809syb.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        AbstractC47338toE abstractC47338toE = this.OLrzqt;
        if (abstractC47338toE != null) {
            syZ syz = abstractC47338toE.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(syz, "");
            syz.setVisibility(z ? 0 : 8);
        }
    }
}
