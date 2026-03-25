package o;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.biz.net.bean.EVM5792Capability;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.competition.viewmodel.CampaignButtonBannerViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.other.CtaIcon;
import com.okinc.okimcore.model.other.CtaInfo;
import com.okinc.web.WebActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nxi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35563nxi extends AbstractC35570nxp {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public final int OLrzqt = C35399nuc.Dialog.accept;
    public C33896nJw copydefault;

    /* JADX INFO: renamed from: o.nxi$StateListAnimator */
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

    public final void OLrzqt() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    public C35563nxi() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.competition.CampaignButtonBannerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.competition.CampaignButtonBannerFragment$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CampaignButtonBannerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.competition.CampaignButtonBannerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.competition.CampaignButtonBannerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.competition.CampaignButtonBannerFragment$special$$inlined$viewModels$default$5
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
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nxl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35563nxi.EZpvd(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.nxi$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nxi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C35563nxi OLrzqt(@NotNull OKConversation oKConversation, @NotNull IMPageType iMPageType) {
            Intrinsics.checkNotNullParameter(oKConversation, "");
            Intrinsics.checkNotNullParameter(iMPageType, "");
            C35563nxi c35563nxi = new C35563nxi();
            c35563nxi.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("channel_id", oKConversation.getTargetId()), C56390yDp.OLrzqt(EopTrackEvent.KEY_PAGE_TYPE, iMPageType), C56390yDp.OLrzqt("conversation", oKConversation)));
            return c35563nxi;
        }
    }

    public final CampaignButtonBannerViewModel EZpvd() {
        return (CampaignButtonBannerViewModel) this.KWHzl.getValue();
    }

    public static final java.lang.String EZpvd(C35563nxi c35563nxi) {
        android.os.Bundle arguments = c35563nxi.getArguments();
        if (arguments != null) {
            return arguments.getString("channel_id");
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.copydefault = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33896nJw c33896nJwAEQbTJ = C33896nJw.AEQbTJ(layoutInflater, viewGroup, false);
        this.copydefault = c33896nJwAEQbTJ;
        if (c33896nJwAEQbTJ != null) {
            return c33896nJwAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        OKConversation oKConversation = arguments != null ? (OKConversation) arguments.getParcelable("conversation") : null;
        android.os.Bundle arguments2 = getArguments();
        java.io.Serializable serializable = arguments2 != null ? arguments2.getSerializable(EopTrackEvent.KEY_PAGE_TYPE) : null;
        IMPageType iMPageType = serializable instanceof IMPageType ? (IMPageType) serializable : null;
        EZpvd().AEQbTJ().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.nxk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35563nxi.AEQbTJ(this.OLrzqt, (java.util.List) obj);
            }
        }));
        EZpvd().KWHzl().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.nxn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35563nxi.EZpvd(this.copydefault, (java.lang.String) obj);
            }
        }));
        EZpvd().copydefault(oKConversation, iMPageType);
        KWHzl();
    }

    public static final Unit AEQbTJ(C35563nxi c35563nxi, java.util.List list) {
        Intrinsics.copydefault(list);
        c35563nxi.OLrzqt((java.util.List<CtaInfo>) list);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c35563nxi, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C35563nxi c35563nxi, java.lang.String str) {
        if (str != null && str.length() != 0) {
            try {
                C35562nxh c35562nxh = new C35562nxh(str);
                java.lang.String strValueOf = C34703nhO.valueOf(c35563nxi.getContext());
                if (strValueOf == null) {
                    strValueOf = "";
                }
                if (c35562nxh.compareTo(new C35562nxh(strValueOf)) > 0 && c35563nxi.AhwBna()) {
                    android.content.Context contextRequireContext = c35563nxi.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    c35563nxi.EZpvd(contextRequireContext);
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("CampaignButtonBannerFragment", "Error comparing versions - min: " + str + ", current: " + C34703nhO.valueOf(c35563nxi.getContext()), e);
            }
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        FragmentKt.setFragmentResult(this, "CAMPAIGN_BUTTON_BANNER_RESULT", BundleKt.bundleOf(C56390yDp.OLrzqt(EVM5792Capability.EVM5792Atomic.STATUS_READY, java.lang.Boolean.TRUE)));
    }

    public final void OLrzqt(java.util.List<CtaInfo> list) {
        android.widget.LinearLayout linearLayout;
        C33896nJw c33896nJw = this.copydefault;
        if (c33896nJw == null || (linearLayout = c33896nJw.AEQbTJ) == null) {
            return;
        }
        linearLayout.removeAllViews();
        if (list.isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        int i = 0;
        linearLayout.setVisibility(0);
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C52794wYp c52794wYpCopydefault = copydefault((CtaInfo) obj, i);
            if (c52794wYpCopydefault != null) {
                linearLayout.addView(c52794wYpCopydefault);
            }
            i++;
        }
    }

    public final C52794wYp copydefault(CtaInfo ctaInfo, int i) {
        android.content.Context context = getContext();
        if (context == null) {
            return null;
        }
        C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        java.lang.CharSequence ctaName = ctaInfo.getCtaName();
        if (ctaName == null) {
            ctaName = "";
        }
        c52794wYp.setText(ctaName);
        c52794wYp.setOKDSType(260);
        c52794wYp.setOKDSSize(28);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (i > 0) {
            layoutParams.setMarginStart(C55298xhM.dp2px$default(8.0f, null, 1, null));
        }
        c52794wYp.setLayoutParams(layoutParams);
        c52794wYp.setCompoundDrawablePadding(C55298xhM.dp2px$default(4.0f, null, 1, null));
        OLrzqt(ctaInfo, c52794wYp);
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this, ctaInfo));
        return c52794wYp;
    }

    /* JADX INFO: renamed from: o.nxi$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C35563nxi KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ CtaInfo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C35563nxi c35563nxi, CtaInfo ctaInfo) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c35563nxi;
            this.copydefault = ctaInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.OLrzqt();
                this.KWHzl.OLrzqt(this.copydefault);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(CtaInfo ctaInfo, C52794wYp c52794wYp) {
        java.lang.String dark;
        if (C7911ask.AEQbTJ(getContext())) {
            CtaIcon ctaIcon = ctaInfo.getCtaIcon();
            if (ctaIcon == null || (dark = ctaIcon.getDark()) == null) {
                CtaIcon ctaIcon2 = ctaInfo.getCtaIcon();
                dark = ctaIcon2 != null ? ctaIcon2.getLight() : null;
            }
        } else {
            CtaIcon ctaIcon3 = ctaInfo.getCtaIcon();
            if (ctaIcon3 == null || (dark = ctaIcon3.getLight()) == null) {
                CtaIcon ctaIcon4 = ctaInfo.getCtaIcon();
                if (ctaIcon4 != null) {
                    dark = ctaIcon4.getDark();
                }
            }
        }
        int iDp2px$default = C55298xhM.dp2px$default(12.0f, null, 1, null);
        if (dark != null && dark.length() != 0) {
            Intrinsics.copydefault(Glide.EZpvd(this).EZpvd(dark).OLrzqt(new Activity(iDp2px$default, c52794wYp, this, ctaInfo)));
        } else {
            KWHzl(ctaInfo, c52794wYp);
        }
    }

    /* JADX INFO: renamed from: o.nxi$Activity */
    public static final class Activity extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ C35563nxi AEQbTJ;
        public final /* synthetic */ C52794wYp KWHzl;
        public final /* synthetic */ CtaInfo OLrzqt;
        public final /* synthetic */ int copydefault;

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(int i, C52794wYp c52794wYp, C35563nxi c35563nxi, CtaInfo ctaInfo) {
            super(i, i);
            this.copydefault = i;
            this.KWHzl = c52794wYp;
            this.AEQbTJ = c35563nxi;
            this.OLrzqt = ctaInfo;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            int i = this.copydefault;
            drawable.setBounds(0, 0, i, i);
            this.KWHzl.setCompoundDrawablesWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }

        @Override // o.AbstractC5449Sd, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            this.AEQbTJ.KWHzl(this.OLrzqt, this.KWHzl);
        }
    }

    public final void KWHzl(CtaInfo ctaInfo, C52794wYp c52794wYp) {
        int i;
        android.graphics.drawable.Drawable drawable;
        java.lang.String ctaName = ctaInfo.getCtaName();
        if (ctaName == null || !StringsKt__StringsKt.AhwBna((java.lang.CharSequence) ctaName, (java.lang.CharSequence) "Leaderboard", true)) {
            java.lang.String ctaName2 = ctaInfo.getCtaName();
            if (ctaName2 != null) {
                StringsKt__StringsKt.AhwBna((java.lang.CharSequence) ctaName2, (java.lang.CharSequence) "Competition", true);
            }
            i = C35399nuc.ActionBar.QKVWgx;
        } else {
            i = C35399nuc.ActionBar.RJOkX;
        }
        android.content.Context context = getContext();
        if (context != null && (drawable = context.getDrawable(i)) != null) {
            int iDp2px$default = C55298xhM.dp2px$default(12.0f, null, 1, null);
            drawable.setBounds(0, 0, iDp2px$default, iDp2px$default);
            c52794wYp.setCompoundDrawablesWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            return;
        }
        c52794wYp.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
    }

    public final void OLrzqt(CtaInfo ctaInfo) {
        java.lang.String ctaLink = ctaInfo.getCtaLink();
        if (ctaLink == null) {
            return;
        }
        pUU.EZpvd("CampaignButtonBannerFragment", "CTA clicked: " + ctaInfo.getCtaName() + ", link: " + ctaLink);
        android.content.Context context = getContext();
        if (context == null) {
            pUU.copydefault("CampaignButtonBannerFragment", "Context is null, cannot process CTA deeplink");
            C55326xho.OLrzqt("Context unavailable, cannot navigate");
        } else if (ctaLink.length() > 0) {
            oGV ogv = oGV.EZpvd;
            if (ogv.copydefault(ctaLink)) {
                oGV.processDeeplink$default(ogv, context, ctaLink, ogv.AEQbTJ(ctaLink), null, new Function1() { // from class: o.nxe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C35563nxi.AEQbTJ((AbstractC43238rlX) obj);
                    }
                }, 8, null);
            } else {
                C35878oHa.openPageWithInterceptor$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", ctaLink), C56390yDp.OLrzqt("special", java.lang.Boolean.TRUE)), null, 4, null);
            }
        }
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(final android.content.Context context) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fmB));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DMb));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) ("           " + C33070mpX.AYXKKw(C35399nuc.LoaderManager.profile) + "           "), new View.OnClickListener() { // from class: o.nxm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35563nxi.KWHzl(context, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C35399nuc.LoaderManager.pauseLocationServices, new View.OnClickListener() { // from class: o.nxj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35563nxi.copydefault(this.AEQbTJ, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(android.content.Context context, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
        if (interfaceC8104awT != null) {
            interfaceC8104awT.AEQbTJ(context);
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(C35563nxi c35563nxi, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c35563nxi.AEQbTJ();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final boolean AhwBna() {
        android.content.SharedPreferences sharedPreferences;
        android.content.Context context = getContext();
        if (context == null || (sharedPreferences = context.getSharedPreferences("campaign_update_dialog", 0)) == null) {
            return true;
        }
        long j = sharedPreferences.getLong("update_dialog_dismissal_time", 0L);
        if (j == 0) {
            return true;
        }
        return java.util.concurrent.TimeUnit.MILLISECONDS.toDays(java.lang.System.currentTimeMillis() - j) >= 3;
    }

    public final void AEQbTJ() {
        android.content.SharedPreferences sharedPreferences;
        android.content.Context context = getContext();
        if (context == null || (sharedPreferences = context.getSharedPreferences("campaign_update_dialog", 0)) == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong("update_dialog_dismissal_time", java.lang.System.currentTimeMillis());
        editorEdit.apply();
        pUU.EZpvd("CampaignButtonBannerFragment", "Update dialog dismissal time saved. Dialog will be suppressed for 3 days.");
    }
}
