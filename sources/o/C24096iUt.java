package o;

import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.invest_biz.ui.page.dialog.InvestRewardingAddressViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iUt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C24096iUt extends iTE {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public final boolean AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public android.widget.TextView djBIcL;
    public C23822iKp gEmmrt;
    public final boolean values;

    /* JADX INFO: renamed from: o.iUt$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ(@NotNull java.lang.String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean values() {
        return this.values;
    }

    /* JADX INFO: renamed from: o.iUt$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iUt.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C24096iUt newInstance$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return activity.copydefault(str);
        }

        public final C24096iUt copydefault(java.lang.String str) {
            C24096iUt c24096iUt = new C24096iUt();
            c24096iUt.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("initialAddress", str)));
            return c24096iUt;
        }
    }

    public C24096iUt() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRewardingAddressDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRewardingAddressDialog$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(InvestRewardingAddressViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRewardingAddressDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRewardingAddressDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRewardingAddressDialog$special$$inlined$viewModels$default$5
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
    }

    public final StateListAnimator isConnected() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof StateListAnimator) {
            return (StateListAnimator) parentFragment;
        }
        return null;
    }

    public final java.lang.String DbNXlk() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("initialAddress");
        }
        return null;
    }

    public final C23822iKp AkhnZx() {
        C23822iKp c23822iKp = this.gEmmrt;
        Intrinsics.copydefault(c23822iKp);
        return c23822iKp;
    }

    public final android.widget.TextView fetchVPNInfo() {
        android.widget.TextView textView = this.djBIcL;
        Intrinsics.copydefault(textView);
        return textView;
    }

    public final InvestRewardingAddressViewModel AuCTel() {
        return (InvestRewardingAddressViewModel) this.DbNXlk.getValue();
    }

    @Override // o.iTL
    public android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.gEmmrt = C23822iKp.OLrzqt(layoutInflater, viewGroup, false);
        C55008xbo c55008xbo = AkhnZx().KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        this.djBIcL = copydefault(layoutInflater, c55008xbo);
        fARcdN();
        C52794wYp c52794wYp = AkhnZx().copydefault;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        C27589jxz.collectOnViewLifecycle$default(this, AuCTel().KWHzl(), null, new ActionBar(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, AuCTel().EZpvd(), null, new FragmentManager(), 2, null);
        AuCTel().EZpvd(DbNXlk());
        ConstraintLayout root = AkhnZx().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    /* JADX INFO: renamed from: o.iUt$LoaderManager */
    public static final class LoaderManager implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public LoaderManager() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            InvestRewardingAddressViewModel.onInputChange$default(C24096iUt.this.AuCTel(), java.lang.String.valueOf(editable), false, 2, null);
        }
    }

    /* JADX INFO: renamed from: o.iUt$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(iVJ ivj, Continuation<? super Unit> continuation) {
            C24096iUt.this.EZpvd(ivj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.iUt$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return KWHzl(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object KWHzl(boolean z, Continuation<? super Unit> continuation) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C56443yFo.AEQbTJ(C25493ixk.FragmentManager.iRxXKY), ContextCompat.getDrawable(C24096iUt.this.requireContext(), C52761wXj.TaskDescription.dPkBzA), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
    }

    public final android.widget.TextView copydefault(android.view.LayoutInflater layoutInflater, C55008xbo c55008xbo) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.invokespecialDPHOMC, (android.view.ViewGroup) c55008xbo.getFieldNames().EZpvd, false);
        Intrinsics.copydefault(viewInflate, "");
        android.widget.TextView textView = (android.widget.TextView) viewInflate;
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        c55008xbo.setHelperView(textView);
        return textView;
    }

    public final void fARcdN() {
        C55001xbh c55001xbhAkhnZx = AkhnZx().KWHzl.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setImeOptions(6);
            c55001xbhAkhnZx.addTextChangedListener(new LoaderManager());
            c55001xbhAkhnZx.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.iUu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                    return C24096iUt.copydefault(this.AEQbTJ, textView, i, keyEvent);
                }
            });
        }
    }

    public static final boolean copydefault(C24096iUt c24096iUt, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        c24096iUt.AuCTel().AEQbTJ();
        return false;
    }

    public final void EZpvd(iVJ ivj) {
        C55001xbh c55001xbhAkhnZx = AkhnZx().KWHzl.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            java.lang.String strCopydefault = ivj.copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            if (strCopydefault.length() != 0) {
                if (!Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) java.lang.String.valueOf(c55001xbhAkhnZx.getText()))) {
                    c55001xbhAkhnZx.setText(ivj.copydefault());
                }
                if (ivj.AEQbTJ()) {
                    c55001xbhAkhnZx.setSelection(strCopydefault.length());
                }
            }
        }
        AkhnZx().copydefault.setEnabled(C33129mqd.OLrzqt((java.lang.CharSequence) ivj.copydefault()) && !ivj.EZpvd());
        if (ivj.EZpvd()) {
            ejfBZ();
        } else {
            AEQbTJ(ivj.KWHzl());
        }
    }

    public final void AEQbTJ(boolean z) {
        java.lang.CharSequence charSequenceGEmmrt;
        if (z) {
            charSequenceGEmmrt = getString(C25493ixk.FragmentManager.gtdfxv);
            Intrinsics.copydefault(charSequenceGEmmrt);
        } else {
            charSequenceGEmmrt = gEmmrt();
        }
        C55008xbo c55008xbo = AkhnZx().KWHzl;
        c55008xbo.values();
        android.widget.RelativeLayout relativeLayout = c55008xbo.getFieldNames().EZpvd;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        relativeLayout.setVisibility(0);
        fetchVPNInfo().setText(charSequenceGEmmrt);
    }

    private final void ejfBZ() {
        C55008xbo c55008xbo = AkhnZx().KWHzl;
        android.widget.RelativeLayout relativeLayout = c55008xbo.getFieldNames().EZpvd;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        relativeLayout.setVisibility(8);
        java.lang.String string = getString(C25493ixk.FragmentManager.fGQ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55008xbo.setErrorText(string);
    }

    /* JADX DEBUG: Possible override for method o.iTE.gEmmrt()V */
    public final android.text.Spannable gEmmrt() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int i = C25493ixk.FragmentManager.gdmIOq;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        Application application = new Application();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) getString(C25493ixk.FragmentManager.RTWSvT));
        spannableStringBuilder.setSpan(application, length, spannableStringBuilder.length(), 17);
        Unit unit = Unit.INSTANCE;
        android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(new android.text.SpannedString(spannableStringBuilder));
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        return C33069mpW.copydefault(contextRequireContext, i, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56423yEv.EZpvd(C56390yDp.OLrzqt("connectedWallet", spannableStringValueOf)));
    }

    /* JADX INFO: renamed from: o.iUt$Application */
    public static final class Application extends android.text.style.ClickableSpan {
        public Application() {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C24096iUt.this.AuCTel().copydefault();
        }
    }

    /* JADX INFO: renamed from: o.iUt$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C24096iUt EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C24096iUt c24096iUt) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c24096iUt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.iUt$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C24096iUt AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C24096iUt c24096iUt) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c24096iUt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                java.lang.String strAEQbTJ = this.AEQbTJ.AuCTel().AEQbTJ();
                if (strAEQbTJ == null) {
                    return;
                }
                StateListAnimator stateListAnimatorIsConnected = this.AEQbTJ.isConnected();
                if (stateListAnimatorIsConnected != null) {
                    stateListAnimatorIsConnected.AEQbTJ(strAEQbTJ);
                }
                this.AEQbTJ.dismiss();
            }
        }
    }

    @Override // o.iTL
    public android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        iJO ijoOLrzqt = iJO.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ijoOLrzqt, "");
        ijoOLrzqt.AEQbTJ.setText(C25493ixk.FragmentManager.DLGVGj);
        android.widget.ImageView imageView = ijoOLrzqt.EZpvd;
        imageView.setOnClickListener(new Dialog(imageView, 1000L, this));
        android.widget.LinearLayout root = ijoOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }
}
