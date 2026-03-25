package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.material3.CalendarModelKt;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.base.TokenDetailEventTrackingInfo;
import com.okinc.business.market.features.ai_summary.MemeAiFragmentParams;
import com.okinc.business.market.features.ai_summary.MemeAiViewModel;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC25788jGj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jGi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25787jGi extends AbstractC25783jGe<C21462hAg> {
    public TokenDetailEventTrackingInfo djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo) {
        this.djBIcL = tokenDetailEventTrackingInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.TarCU;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21462hAg KWHzl(C25787jGi c25787jGi) {
        return (C21462hAg) c25787jGi.AEQbTJ();
    }

    public C25787jGi() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.ai_summary.MemeAiFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.ai_summary.MemeAiFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeAiViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.ai_summary.MemeAiFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.ai_summary.MemeAiFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.ai_summary.MemeAiFragment$special$$inlined$viewModels$default$5
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

    /* JADX DEBUG: Possible override for method o.jGe.gEmmrt()V */
    public final MemeAiViewModel gEmmrt() {
        return (MemeAiViewModel) this.gEmmrt.getValue();
    }

    public final MemeAiFragmentParams djBIcL() {
        MemeAiFragmentParams memeAiFragmentParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (memeAiFragmentParams = (MemeAiFragmentParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "params.meme.ai", MemeAiFragmentParams.class))) == null) ? new MemeAiFragmentParams(null, null, null, false, null, null, 63, null) : memeAiFragmentParams;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/View;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC7000aZw
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C21462hAg AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C21462hAg c21462hAgKWHzl = C21462hAg.KWHzl(view);
        Intrinsics.checkNotNullExpressionValue(c21462hAgKWHzl, "");
        return c21462hAgKWHzl;
    }

    /* JADX INFO: renamed from: o.jGi$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jGi.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C25787jGi copydefault(@NotNull MemeAiFragmentParams memeAiFragmentParams) {
            Intrinsics.checkNotNullParameter(memeAiFragmentParams, "");
            C25787jGi c25787jGi = new C25787jGi();
            c25787jGi.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("params.meme.ai", memeAiFragmentParams)));
            return c25787jGi;
        }
    }

    @Override // o.AbstractC7000aZw, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        gEmmrt().copydefault(djBIcL().EZpvd(), djBIcL().OLrzqt(), djBIcL().AEQbTJ());
        fetchVPNInfo();
        isConnected();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void isConnected() {
        C21462hAg c21462hAg = (C21462hAg) AEQbTJ();
        if (c21462hAg != null) {
            if (djBIcL().gEmmrt()) {
                EZpvd(c21462hAg);
            } else {
                OLrzqt(c21462hAg);
            }
            android.widget.ImageView imageView = c21462hAg.copydefault;
            imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
        }
    }

    public final void EZpvd(C21462hAg c21462hAg) {
        jPJ jpj = c21462hAg.KWHzl;
        jpj.setMaxCollapsedLines(3);
        jpj.setDescriptionTextStyle(C52761wXj.LoaderManager.valueOf, C52761wXj.Activity.Dmq, 22.0f);
        jpj.setDropdownChevronBackgroundTint(C52761wXj.Activity.djBIcL);
        java.lang.String string = jpj.getContext().getString(C23274hvD.Fragment.DTg);
        Intrinsics.checkNotNullExpressionValue(string, "");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new Activity(jpj, this), 0, spannableStringBuilder.length(), 33);
        android.content.Context context = jpj.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        jpj.setFooter(C33069mpW.copydefault(context, C23274hvD.Fragment.zqTOFw, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56423yEv.EZpvd(C56390yDp.OLrzqt("viewMore", spannableStringBuilder))));
    }

    /* JADX INFO: renamed from: o.jGi$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public final /* synthetic */ C25787jGi AEQbTJ;
        public final /* synthetic */ jPJ KWHzl;

        public Activity(jPJ jpj, C25787jGi c25787jGi) {
            this.KWHzl = jpj;
            this.AEQbTJ = c25787jGi;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            int i = C52761wXj.Activity.Dmq;
            android.content.Context context = this.KWHzl.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textPaint.setColor(C25382ivf.copydefault(i, context));
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ.valueOf();
        }
    }

    public final void OLrzqt(C21462hAg c21462hAg) {
        jPJ jpj = c21462hAg.KWHzl;
        jpj.setBackground(null);
        Intrinsics.copydefault(jpj);
        jpj.setPadding(0, 0, 0, C55298xhM.dp2px$default(8.0f, null, 1, null));
        jpj.setDescriptionTextStyle(C52761wXj.LoaderManager.valueOf, C52761wXj.Activity.fdOvFl, 22.0f);
        jpj.setDropdownChevronBackgroundTint(C52761wXj.Activity.GhqvEQ);
    }

    public final void valueOf() {
        C25796jGr c25796jGrOLrzqt = C25796jGr.Companion.OLrzqt(C23274hvD.Fragment.getPriority, C23274hvD.Fragment.zhUgOk);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c25796jGrOLrzqt.show(childFragmentManager);
        TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo = this.djBIcL;
        if (tokenDetailEventTrackingInfo != null) {
            C21847hOn.EZpvd(tokenDetailEventTrackingInfo, TokenDetailClickLayer.COMPONENTS, TokenDetailButtonName.INFO_READ_MORE, CoinDetailTabType.INFO);
        }
    }

    /* JADX INFO: renamed from: o.jGi$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC25788jGj interfaceC25788jGj, Continuation<? super Unit> continuation) {
            C21462hAg c21462hAgKWHzl = C25787jGi.KWHzl(C25787jGi.this);
            if (c21462hAgKWHzl != null) {
                C25787jGi c25787jGi = C25787jGi.this;
                if (c25787jGi.AEQbTJ(interfaceC25788jGj)) {
                    c25787jGi.AhwBna(c21462hAgKWHzl);
                } else {
                    c25787jGi.OLrzqt(c21462hAgKWHzl, interfaceC25788jGj);
                }
            }
            if (!(interfaceC25788jGj instanceof InterfaceC25788jGj.Dialog)) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C25787jGi.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void fetchVPNInfo() {
        C25390ivn.collectOnViewLifecycle$default(this, gEmmrt().KWHzl(), null, new ActionBar(), 2, null);
    }

    /* JADX INFO: renamed from: o.jGi$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C25787jGi EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C25787jGi c25787jGi) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c25787jGi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.gEmmrt().KWHzl(this.EZpvd.djBIcL().EZpvd(), this.EZpvd.djBIcL().OLrzqt(), this.EZpvd.djBIcL().AEQbTJ());
            }
        }
    }

    public final boolean AEQbTJ(InterfaceC25788jGj interfaceC25788jGj) {
        return ((interfaceC25788jGj instanceof InterfaceC25788jGj.FragmentManager) || (interfaceC25788jGj instanceof InterfaceC25788jGj.ActionBar)) && C33129mqd.OLrzqt((java.lang.CharSequence) djBIcL().KWHzl());
    }

    public final void AhwBna(C21462hAg c21462hAg) {
        android.widget.TextView textView = c21462hAg.AYXKKw;
        android.content.Context context = c21462hAg.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(C33069mpW.KWHzl(context, C23274hvD.Fragment.execute, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", djBIcL().AEQbTJ()))));
        jPJ jpj = c21462hAg.KWHzl;
        java.lang.String strKWHzl = djBIcL().KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        jPJ.setDescription$default(jpj, strKWHzl, false, 2, null);
        jpj.setFooter(null);
        Intrinsics.copydefault(jpj);
        jpj.setVisibility(0);
        LinearLayoutCompat linearLayoutCompat = c21462hAg.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(8);
    }

    public final void OLrzqt(C21462hAg c21462hAg, InterfaceC25788jGj interfaceC25788jGj) {
        if (interfaceC25788jGj instanceof InterfaceC25788jGj.Activity) {
            AEQbTJ(c21462hAg, (InterfaceC25788jGj.Activity) interfaceC25788jGj);
            return;
        }
        if (interfaceC25788jGj instanceof InterfaceC25788jGj.StateListAnimator) {
            KWHzl(c21462hAg, (InterfaceC25788jGj.StateListAnimator) interfaceC25788jGj);
            return;
        }
        if (interfaceC25788jGj instanceof InterfaceC25788jGj.Application) {
            AEQbTJ(c21462hAg, (InterfaceC25788jGj.Application) interfaceC25788jGj);
            return;
        }
        if (interfaceC25788jGj instanceof InterfaceC25788jGj.TaskDescription) {
            copydefault(c21462hAg, (InterfaceC25788jGj.TaskDescription) interfaceC25788jGj);
            return;
        }
        if (Intrinsics.EZpvd(interfaceC25788jGj, InterfaceC25788jGj.Dialog.KWHzl)) {
            copydefault(c21462hAg);
        } else {
            if (!Intrinsics.EZpvd(interfaceC25788jGj, InterfaceC25788jGj.FragmentManager.EZpvd) && !Intrinsics.EZpvd(interfaceC25788jGj, InterfaceC25788jGj.ActionBar.EZpvd)) {
                throw new NoWhenBranchMatchedException();
            }
            KWHzl(c21462hAg);
        }
    }

    public final void AEQbTJ(C21462hAg c21462hAg, final InterfaceC25788jGj.Activity activity) {
        OLrzqt(c21462hAg, (InterfaceC25784jGf) activity);
        copydefault(c21462hAg, C33129mqd.OLrzqt((java.lang.CharSequence) activity.copydefault()), false, activity.OLrzqt());
        copydefault(c21462hAg, false);
        LinearLayoutCompat linearLayoutCompat = c21462hAg.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(activity.EZpvd() ? 0 : 8);
        jPJ.setDescription$default(c21462hAg.KWHzl, activity.OLrzqt() ? C31256lqb.KWHzl(activity.copydefault(), (Function0<java.lang.String>) new Function0() { // from class: o.jGh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25787jGi.EZpvd(activity);
            }
        }) : activity.KWHzl(), false, 2, null);
    }

    public static final java.lang.String EZpvd(InterfaceC25788jGj.Activity activity) {
        return activity.KWHzl();
    }

    public final void KWHzl(C21462hAg c21462hAg, InterfaceC25788jGj.StateListAnimator stateListAnimator) {
        OLrzqt(c21462hAg, (InterfaceC25784jGf) stateListAnimator);
        copydefault(c21462hAg, true, false, false);
        copydefault(c21462hAg, false);
        LinearLayoutCompat linearLayoutCompat = c21462hAg.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(stateListAnimator.EZpvd() ? 0 : 8);
        jPJ.setDescription$default(c21462hAg.KWHzl, stateListAnimator.KWHzl(), false, 2, null);
    }

    public final void AEQbTJ(C21462hAg c21462hAg, InterfaceC25788jGj.Application application) {
        OLrzqt(c21462hAg, (InterfaceC25784jGf) application);
        copydefault(c21462hAg, true, true, false);
        copydefault(c21462hAg, false);
        LinearLayoutCompat linearLayoutCompat = c21462hAg.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(application.EZpvd() ? 0 : 8);
        jPJ jpj = c21462hAg.KWHzl;
        java.lang.String string = c21462hAg.getRoot().getContext().getString(C23274hvD.Fragment.ORrpqH);
        Intrinsics.checkNotNullExpressionValue(string, "");
        jPJ.setDescription$default(jpj, string, false, 2, null);
    }

    public final void copydefault(C21462hAg c21462hAg, InterfaceC25788jGj.TaskDescription taskDescription) {
        OLrzqt(c21462hAg, (InterfaceC25784jGf) taskDescription);
        copydefault(c21462hAg, true, false, false);
        copydefault(c21462hAg, true);
        LinearLayoutCompat linearLayoutCompat = c21462hAg.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(taskDescription.EZpvd() ? 0 : 8);
        jPJ.setDescription$default(c21462hAg.KWHzl, taskDescription.KWHzl(), false, 2, null);
    }

    public final void copydefault(C21462hAg c21462hAg) {
        AEQbTJ(c21462hAg);
        copydefault(c21462hAg, false);
        jPJ jpj = c21462hAg.KWHzl;
        java.lang.String string = c21462hAg.getRoot().getContext().getString(C23274hvD.Fragment.ORrpqH);
        Intrinsics.checkNotNullExpressionValue(string, "");
        jPJ.setDescription$default(jpj, string, false, 2, null);
    }

    public final void KWHzl(C21462hAg c21462hAg) {
        AEQbTJ(c21462hAg);
        copydefault(c21462hAg, false);
        jPJ jpj = c21462hAg.KWHzl;
        java.lang.String string = c21462hAg.getRoot().getContext().getString(AhwBna() ? C23274hvD.Fragment.ORrpqH : C23274hvD.Fragment.zzQwtT);
        Intrinsics.checkNotNullExpressionValue(string, "");
        jPJ.setDescription$default(jpj, string, false, 2, null);
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        C28988klE c28988klE = parentFragment instanceof C28988klE ? (C28988klE) parentFragment : null;
        if (c28988klE != null) {
            c28988klE.fetchVPNInfo();
        }
    }

    public final void AEQbTJ(C21462hAg c21462hAg) {
        android.widget.TextView textView = c21462hAg.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        android.widget.ImageView imageView = c21462hAg.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        LinearLayoutCompat linearLayoutCompat = c21462hAg.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(0);
    }

    public final void copydefault(C21462hAg c21462hAg, boolean z) {
        android.widget.TextView textView = c21462hAg.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        android.widget.ImageView imageView = c21462hAg.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
        if (z) {
            c21462hAg.AhwBna.setText(c21462hAg.getRoot().getContext().getString(C23274hvD.Fragment.ReportDrawnKtReportDrawn2));
        }
    }

    public final void OLrzqt(C21462hAg c21462hAg, InterfaceC25784jGf interfaceC25784jGf) {
        java.lang.String strKWHzl;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - C33129mqd.valueOf(interfaceC25784jGf.AEQbTJ());
        android.widget.TextView textView = c21462hAg.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((0 > jCurrentTimeMillis || jCurrentTimeMillis >= CalendarModelKt.MillisecondsIn24Hours) ? 8 : 0);
        android.widget.TextView textView2 = c21462hAg.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        if (textView2.getVisibility() == 0) {
            android.widget.TextView textView3 = c21462hAg.valueOf;
            if (jCurrentTimeMillis <= 60000) {
                android.content.Context context = c21462hAg.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                strKWHzl = C33069mpW.KWHzl(context, C23274hvD.Fragment.getLabel, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "1")));
            } else if (jCurrentTimeMillis < 3600000) {
                android.content.Context context2 = c21462hAg.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                strKWHzl = C33069mpW.KWHzl(context2, C23274hvD.Fragment.getLabel, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(C33129mqd.AhwBna(java.lang.Long.valueOf(jCurrentTimeMillis / 60000)))))));
            } else {
                android.content.Context context3 = c21462hAg.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                strKWHzl = C33069mpW.KWHzl(context3, C23274hvD.Fragment.zlvcHA, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(C33129mqd.AhwBna(java.lang.Long.valueOf(jCurrentTimeMillis / 3600000)))))));
            }
            textView3.setText(strKWHzl);
        }
    }

    public final void copydefault(C21462hAg c21462hAg, boolean z, boolean z2, boolean z3) {
        android.widget.ImageView imageView = c21462hAg.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
        if (z) {
            int i = z3 ? C52761wXj.TaskDescription.RAaltf : C52761wXj.TaskDescription.RgaQzq;
            int i2 = z2 ? C52761wXj.Activity.UlJrfe : C52761wXj.Activity.fdOvFl;
            android.widget.ImageView imageView2 = c21462hAg.copydefault;
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(i);
            if (drawableKWHzl != null) {
                C33057mpK.copydefault(drawableKWHzl, C25382ivf.KWHzl(i2));
            } else {
                drawableKWHzl = null;
            }
            imageView2.setImageDrawable(drawableKWHzl);
        }
    }

    public final boolean AhwBna() {
        return java.lang.System.currentTimeMillis() - C33129mqd.valueOf(djBIcL().copydefault()) < 60000;
    }
}
