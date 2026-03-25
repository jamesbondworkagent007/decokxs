package o;

import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.okex.center.ui.fragment.TokenBottomSheetFragment$onViewCreated$3$onTextChanged$1;
import com.okinc.okex.center.ui.fragment.TokenBottomSheetFragment$outlinedCardSetup$2;
import com.okinc.okex.center.viewmodel.SupportTroubleshootViewModel;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.skt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45180skt extends AbstractC45036siH {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int djBIcL = 8;
    public C47463tqX AhwBna;
    public final InterfaceC56387yDm isConnected;
    public C43316rmw valueOf;
    public final int AYXKKw = 30;
    public Function2<? super java.lang.Integer, ? super C45072sir, Unit> gEmmrt = new Function2() { // from class: o.skr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return C45180skt.copydefault(this.EZpvd, ((java.lang.Integer) obj).intValue(), (C45072sir) obj2);
        }
    };
    public int DbNXlk = -1;

    /* JADX INFO: renamed from: o.skt$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
    }

    public C45180skt() {
        final Function0 function0 = null;
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SupportTroubleshootViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.fragment.TokenBottomSheetFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.fragment.TokenBottomSheetFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.center.ui.fragment.TokenBottomSheetFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.siH.OLrzqt()V */
    public final SupportTroubleshootViewModel OLrzqt() {
        return (SupportTroubleshootViewModel) this.isConnected.getValue();
    }

    /* JADX INFO: renamed from: o.skt$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.skt.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C45180skt KWHzl() {
            return new C45180skt();
        }
    }

    public static final Unit copydefault(C45180skt c45180skt, int i, C45072sir c45072sir) {
        if (c45072sir != null) {
            c45180skt.OLrzqt().OLrzqt(c45072sir.AEQbTJ());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(int i) {
        this.DbNXlk = i;
        Function2<? super java.lang.Integer, ? super C45072sir, Unit> function2 = this.gEmmrt;
        C47463tqX c47463tqX = null;
        if (function2 != null) {
            java.util.List<C45072sir> value = OLrzqt().copydefault().getValue();
            C45072sir c45072sir = value != null ? (C45072sir) CollectionsKt___CollectionsKt.AkhnZx(value, i) : null;
            if (c45072sir != null) {
                function2.invoke(java.lang.Integer.valueOf(i), c45072sir);
            }
        }
        C43316rmw c43316rmw = this.valueOf;
        if (c43316rmw != null) {
            c43316rmw.notifyDataSetChanged();
        }
        C47463tqX c47463tqX2 = this.AhwBna;
        if (c47463tqX2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c47463tqX = c47463tqX2;
        }
        OLrzqt(c47463tqX.KWHzl.KWHzl());
        dismiss();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(8);
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.valueOf().setForegroundGravity(8388611);
        wxq.AYXKKw().setGravity(8388611);
        wxq.setTitle(C33070mpX.AYXKKw(C47315tni.PendingIntent.QkdxfA));
        wxq.setDividerVisibility(false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, this));
        OLrzqt().KWHzl();
    }

    @Override // o.AbstractC52786wYh, o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AEQbTJ(constraintLayout);
        copydefault(constraintLayout);
    }

    @Override // o.wXX, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        setHeightRatio(0.99f);
        dialogOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.skz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(android.content.DialogInterface dialogInterface) {
                C45180skt.AEQbTJ(dialogInterface);
            }
        });
        return dialogOnCreateDialog;
    }

    public static final void AEQbTJ(android.content.DialogInterface dialogInterface) {
        Intrinsics.copydefault(dialogInterface, "");
        ((BottomSheetDialog) dialogInterface).getBehavior().setDraggable(false);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OLrzqt().copydefault().observe(this, new PendingIntent(new Function1() { // from class: o.skq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45180skt.AEQbTJ(this.KWHzl, (java.util.List) obj);
            }
        }));
        view.post(new java.lang.Runnable() { // from class: o.sku
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45180skt.OLrzqt(this.KWHzl);
            }
        });
        C47463tqX c47463tqX = this.AhwBna;
        if (c47463tqX == null) {
            Intrinsics.gEmmrt("");
            c47463tqX = null;
        }
        C55230xfy c55230xfy = c47463tqX.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55230xfy, "");
        c55230xfy.KWHzl();
        c55230xfy.KWHzl().setFilters(new android.text.InputFilter[]{new android.text.InputFilter() { // from class: o.sks
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.text.InputFilter
            public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
                return C45180skt.EZpvd(charSequence, i, i2, spanned, i3, i4);
            }
        }});
        OKEditText oKEditTextKWHzl = c55230xfy.KWHzl();
        android.text.InputFilter[] filters = oKEditTextKWHzl.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "");
        oKEditTextKWHzl.setFilters((android.text.InputFilter[]) yDT.EZpvd((InputFilter.LengthFilter[]) filters, new InputFilter.LengthFilter(this.AYXKKw)));
        c55230xfy.KWHzl().addTextChangedListener(new Activity());
    }

    public static final Unit AEQbTJ(C45180skt c45180skt, java.util.List list) {
        C43316rmw c43316rmw = c45180skt.valueOf;
        if (c43316rmw != null) {
            c43316rmw.AhwBna(list);
        }
        C47463tqX c47463tqX = c45180skt.AhwBna;
        if (c47463tqX == null) {
            Intrinsics.gEmmrt("");
            c47463tqX = null;
        }
        C55113xdn c55113xdn = c47463tqX.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(8);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C45180skt c45180skt) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45180skt, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final java.lang.CharSequence EZpvd(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        while (i < i2) {
            if (!java.lang.Character.isLetterOrDigit(charSequence.charAt(i))) {
                return "";
            }
            i++;
        }
        return null;
    }

    /* JADX INFO: renamed from: o.skt$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(C45180skt.this), null, null, new TokenBottomSheetFragment$onViewCreated$3$onTextChanged$1(C45180skt.this, charSequence, null), 3, null);
        }
    }

    private final void AEQbTJ(ConstraintLayout constraintLayout) {
        this.AhwBna = C47463tqX.copydefault(getCustomLayoutInflater(), constraintLayout);
        C43316rmw c43316rmw = new C43316rmw();
        java.util.List<C45072sir> value = OLrzqt().copydefault().getValue();
        if (value != null) {
            c43316rmw.setItems(value);
        }
        c43316rmw.register(C45072sir.class, new ActionBar());
        this.valueOf = c43316rmw;
        C47463tqX c47463tqX = null;
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new TokenBottomSheetFragment$outlinedCardSetup$2(this, null));
        C47463tqX c47463tqX2 = this.AhwBna;
        if (c47463tqX2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c47463tqX = c47463tqX2;
        }
        RecyclerView recyclerView = c47463tqX.AEQbTJ;
        recyclerView.setAdapter(this.valueOf);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.copydefault(16.0f, context), 0));
        recyclerView.setItemViewCacheSize(0);
    }

    /* JADX INFO: renamed from: o.skt$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ C45180skt EZpvd;
        public final android.widget.ImageView KWHzl;
        public final C54943xac OLrzqt;

        /* JADX INFO: renamed from: o.skt$Application$Application, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0949Application implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C45180skt EZpvd;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ Application copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0949Application(android.view.View view, long j, C45180skt c45180skt, Application application) {
                this.AEQbTJ = view;
                this.OLrzqt = j;
                this.EZpvd = c45180skt;
                this.copydefault = application;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    C45363soQ.onSessionIdEvent$default("SupportCenter_DepositStatusChecker_Token_Click", false, null, 3, null);
                    this.EZpvd.EZpvd(this.copydefault.getBindingAdapterPosition());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C45180skt c45180skt, @NotNull C54943xac c54943xac, android.widget.ImageView imageView) {
            super(c54943xac.getRoot());
            Intrinsics.checkNotNullParameter(c54943xac, "");
            Intrinsics.checkNotNullParameter(imageView, "");
            this.EZpvd = c45180skt;
            this.OLrzqt = c54943xac;
            this.KWHzl = imageView;
        }

        public final void OLrzqt(@NotNull C45072sir c45072sir) {
            Intrinsics.checkNotNullParameter(c45072sir, "");
            C55166xen c55166xen = this.OLrzqt.AEQbTJ;
            C45180skt c45180skt = this.EZpvd;
            c55166xen.setSelected(c45072sir.copydefault());
            c55166xen.setOnClickListener(new ViewOnClickListenerC0949Application(c55166xen, 1000L, c45180skt, this));
            this.KWHzl.setVisibility(c45072sir.KWHzl() ? 0 : 8);
            Glide.KWHzl(c55166xen).EZpvd(c45072sir.OLrzqt()).EZpvd(this.KWHzl);
            c55166xen.setTitleText(c45072sir.EZpvd().EZpvd());
            c55166xen.setDescriptionText(c45072sir.EZpvd().OLrzqt());
            c55166xen.setTitleAttachingView(c45072sir.EZpvd().copydefault());
        }
    }

    /* JADX INFO: renamed from: o.skt$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C45180skt AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C45180skt c45180skt) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c45180skt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.skt$ActionBar */
    public static final class ActionBar extends AbstractC59533zio<C45072sir, Application> {
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C54943xac c54943xacCopydefault = C54943xac.copydefault(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c54943xacCopydefault, "");
            android.widget.ImageView imageView = (android.widget.ImageView) c54943xacCopydefault.AEQbTJ.findViewById(C52761wXj.FragmentManager.hBpjJd);
            try {
                Result.Application application = Result.Companion;
                android.view.ViewParent parent = imageView.getParent();
                Unit unit = null;
                ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
                if (constraintLayout != null) {
                    constraintLayout.setId(android.view.View.generateViewId());
                    android.view.View viewFindViewById = constraintLayout.findViewById(C52761wXj.FragmentManager.ffGIBT);
                    android.view.View viewFindViewById2 = constraintLayout.findViewById(C52761wXj.FragmentManager.zLAIeZ);
                    if (viewFindViewById != null && viewFindViewById2 != null) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        constraintSet.clone(constraintLayout);
                        constraintSet.connect(viewFindViewById.getId(), 4, viewFindViewById2.getId(), 3);
                        constraintSet.connect(viewFindViewById2.getId(), 4, 0, 4);
                        constraintSet.applyTo(constraintLayout);
                    }
                    unit = Unit.INSTANCE;
                }
                Result.m7377constructorimpl(unit);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            C45180skt c45180skt = C45180skt.this;
            Intrinsics.copydefault(imageView);
            return new Application(c45180skt, c54943xacCopydefault, imageView);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(Application application, C45072sir c45072sir) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(c45072sir, "");
            application.OLrzqt(c45072sir);
        }
    }

    private final void copydefault(ConstraintLayout constraintLayout) {
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    public final void OLrzqt(OKEditText oKEditText) {
        oKEditText.setText("");
        oKEditText.setFocusableInTouchMode(false);
        oKEditText.setFocusable(false);
        oKEditText.setFocusableInTouchMode(true);
        oKEditText.setFocusable(true);
        C33570myu.AEQbTJ(oKEditText.getContext(), (android.view.View) oKEditText);
    }
}
