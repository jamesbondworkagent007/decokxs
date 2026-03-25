package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.flexbox.FlexboxLayout;
import com.okinc.business.market.features.ai_summary.MemeAiFragmentParams;
import com.okinc.business.market.features.meme.data.model.XPostType;
import com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData;
import com.okinc.business.market.features.meme.preview.TwitterPreviewParams;
import com.okinc.business.market.features.meme.token_detail_sheet.domain.model.PumpLiveInfoData;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.SocialMediaTabViewModel;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailCommonParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC28861kik;
import o.AbstractC28869kis;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import o.C6777aVl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kiw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28873kiw extends AbstractC28860kij<C21508hBz> {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm djBIcL;

    /* JADX INFO: renamed from: o.kiw$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[XPostType.values().length];
            try {
                iArr[XPostType.POST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[XPostType.PROFILE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[XPostType.COMMUNITY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21508hBz EZpvd(C28873kiw c28873kiw) {
        return (C21508hBz) c28873kiw.aX_();
    }

    public C28873kiw() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.SocialMediaTabFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.SocialMediaTabFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SocialMediaTabViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.SocialMediaTabFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.SocialMediaTabFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.SocialMediaTabFragment$special$$inlined$viewModels$default$5
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

    private final TokenDetailCommonParams isConnected() {
        TokenDetailCommonParams tokenDetailCommonParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (tokenDetailCommonParams = (TokenDetailCommonParams) BundleCompat.getParcelable(arguments, "common_data", TokenDetailCommonParams.class)) == null) ? new TokenDetailCommonParams(null, null, null, null, null, false, false, null, null, false, 1023, null) : tokenDetailCommonParams;
    }

    /* JADX DEBUG: Possible override for method o.kij.AYXKKw()V */
    public final TokenDetailTabData.SocialTab AYXKKw() {
        TokenDetailTabData.SocialTab socialTab;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (socialTab = (TokenDetailTabData.SocialTab) BundleCompat.getParcelable(arguments, "social_data", TokenDetailTabData.SocialTab.class)) == null) ? new TokenDetailTabData.SocialTab(false, null, null, null, null, 31, null) : socialTab;
    }

    public final SocialMediaTabViewModel gEmmrt() {
        return (SocialMediaTabViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: renamed from: o.kiw$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kiw.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C28873kiw AEQbTJ(@NotNull TokenDetailCommonParams tokenDetailCommonParams, @NotNull TokenDetailTabData.SocialTab socialTab) {
            Intrinsics.checkNotNullParameter(tokenDetailCommonParams, "");
            Intrinsics.checkNotNullParameter(socialTab, "");
            C28873kiw c28873kiw = new C28873kiw();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("common_data", tokenDetailCommonParams);
            bundle.putParcelable("social_data", socialTab);
            c28873kiw.setArguments(bundle);
            return c28873kiw;
        }
    }

    public final void OLrzqt(FragmentContainerView fragmentContainerView, java.lang.String str, Function0<? extends androidx.fragment.app.Fragment> function0) {
        if (getChildFragmentManager().findFragmentByTag(str) != null) {
            return;
        }
        fragmentContainerView.setVisibility(0);
        getChildFragmentManager().beginTransaction().replace(fragmentContainerView.getId(), function0.invoke(), str).commitNowAllowingStateLoss();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C21508hBz KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21508hBz c21508hBzCopydefault = C21508hBz.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21508hBzCopydefault, "");
        return c21508hBzCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C21508hBz c21508hBz, android.os.Bundle bundle) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        Intrinsics.checkNotNullParameter(c21508hBz, "");
        android.content.Context context = c21508hBz.getRoot().getContext();
        AkhnZx();
        Intrinsics.copydefault(context);
        EZpvd(c21508hBz, context);
        values();
        java.lang.String string = context.getString(C23274hvD.Fragment.DTg);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str = context.getString(C23274hvD.Fragment.HJWChPRGtXKC) + " " + string;
        try {
            spannableStringBuilder = new android.text.SpannableStringBuilder(str);
            spannableStringBuilder.setSpan(new ActionBar(context, this), str.length() - string.length(), str.length(), 33);
        } catch (java.lang.Exception unused) {
            spannableStringBuilder = null;
        }
        android.widget.TextView textView = c21508hBz.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        FragmentContainerView fragmentContainerView = c21508hBz.copydefault;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
        textView.setVisibility(fragmentContainerView.getVisibility() == 0 ? 0 : 8);
        c21508hBz.AhwBna.setText(spannableStringBuilder);
        android.widget.TextView textView2 = c21508hBz.AhwBna;
        textView2.setOnClickListener(new PendingIntent(textView2, 1000L, this));
        c21508hBz.isConnected.setText(context.getString(C23274hvD.Fragment.sbu));
        AhwBna();
        djBIcL();
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.kiC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C28873kiw.KWHzl(this.copydefault);
                }
            });
        }
        DbNXlk();
        fetchVPNInfo();
    }

    /* JADX INFO: renamed from: o.kiw$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ C28873kiw AEQbTJ;
        public final /* synthetic */ android.content.Context OLrzqt;

        public ActionBar(android.content.Context context, C28873kiw c28873kiw) {
            this.OLrzqt = context;
            this.AEQbTJ = c28873kiw;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            int i = C52761wXj.Activity.Dmq;
            android.content.Context context = this.OLrzqt;
            Intrinsics.copydefault(context);
            textPaint.setColor(C25382ivf.copydefault(i, context));
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C25796jGr c25796jGrOLrzqt = C25796jGr.Companion.OLrzqt(C23274hvD.Fragment.getPriority, C23274hvD.Fragment.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose1);
            androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c25796jGrOLrzqt.show(childFragmentManager);
        }
    }

    public static final void KWHzl(C28873kiw c28873kiw) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c28873kiw, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.kiw$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ MemeSocialMediaData EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C28873kiw OLrzqt;
        public final /* synthetic */ C21508hBz copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, MemeSocialMediaData memeSocialMediaData, C28873kiw c28873kiw, C21508hBz c21508hBz) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = memeSocialMediaData;
            this.OLrzqt = c28873kiw;
            this.copydefault = c21508hBz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String string;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C28840kiP.EZpvd(this.EZpvd.valueOf());
                C28873kiw c28873kiw = this.OLrzqt;
                java.lang.String strEZpvd = this.EZpvd.EZpvd();
                java.lang.Integer numCopydefault = this.EZpvd.copydefault();
                if (numCopydefault != null) {
                    string = this.copydefault.getRoot().getContext().getString(numCopydefault.intValue());
                } else {
                    string = null;
                }
                if (string == null) {
                    string = "";
                }
                C28873kiw.acknowledgeAndRedirect$default(c28873kiw, strEZpvd, string, null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.kiw$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C28873kiw KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, C28873kiw c28873kiw) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c28873kiw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C25796jGr c25796jGrOLrzqt = C25796jGr.Companion.OLrzqt(C23274hvD.Fragment.getPriority, C23274hvD.Fragment.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose1);
                androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c25796jGrOLrzqt.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.kiw$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ C21508hBz AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C28873kiw KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C28873kiw c28873kiw, java.lang.String str, C21508hBz c21508hBz) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c28873kiw;
            this.copydefault = str;
            this.AEQbTJ = c21508hBz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C28840kiP.EZpvd("x_search_by_address");
                C28873kiw.acknowledgeAndRedirect$default(this.KWHzl, this.copydefault, this.AEQbTJ.getRoot().getContext().getString(C23274hvD.Fragment.bindRcKey), null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.kiw$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C28873kiw AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ C21508hBz OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C28873kiw c28873kiw, java.lang.String str, C21508hBz c21508hBz) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c28873kiw;
            this.KWHzl = str;
            this.OLrzqt = c21508hBz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C28840kiP.EZpvd("x_search_by_name");
                C28873kiw.acknowledgeAndRedirect$default(this.AEQbTJ, this.KWHzl, this.OLrzqt.getRoot().getContext().getString(C23274hvD.Fragment.bindRcKey), null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.kiw$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C28873kiw KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C28873kiw c28873kiw) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c28873kiw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C25796jGr c25796jGrOLrzqt = C25796jGr.Companion.OLrzqt(C23274hvD.Fragment.getPriority, C23274hvD.Fragment.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose1);
                androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c25796jGrOLrzqt.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.kiw$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ PumpLiveInfoData KWHzl;
        public final /* synthetic */ C28873kiw OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C28873kiw c28873kiw, PumpLiveInfoData pumpLiveInfoData, java.lang.String str) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c28873kiw;
            this.KWHzl = pumpLiveInfoData;
            this.EZpvd = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C28840kiP.EZpvd("pump_live");
                C28873kiw.acknowledgeAndRedirect$default(this.OLrzqt, this.KWHzl.getTokenLiveUrl(), this.EZpvd, null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.kiw$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC28869kis abstractC28869kis, Continuation<? super Unit> continuation) {
            C28873kiw.this.KWHzl(abstractC28869kis);
            return Unit.INSTANCE;
        }
    }

    public final void DbNXlk() {
        C25390ivn.collectOnViewLifecycle$default(this, gEmmrt().copydefault(), null, new FragmentManager(), 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(AbstractC28869kis abstractC28869kis) {
        if (((C21508hBz) aX_()) != null) {
            if (abstractC28869kis instanceof AbstractC28869kis.TaskDescription) {
                AbstractC28869kis.TaskDescription taskDescription = (AbstractC28869kis.TaskDescription) abstractC28869kis;
                KWHzl(taskDescription.EZpvd(), taskDescription.OLrzqt());
            } else if (!(abstractC28869kis instanceof AbstractC28869kis.Application) && !(abstractC28869kis instanceof AbstractC28869kis.StateListAnimator) && !(abstractC28869kis instanceof AbstractC28869kis.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void KWHzl(PumpLiveInfoData pumpLiveInfoData, boolean z) {
        java.lang.String string;
        int iCopydefault;
        C21508hBz c21508hBz = (C21508hBz) aX_();
        if (c21508hBz != null) {
            android.view.View viewFindViewWithTag = c21508hBz.EZpvd.findViewWithTag("tag.pump_live_chip");
            if (viewFindViewWithTag != null) {
                c21508hBz.EZpvd.removeView(viewFindViewWithTag);
            }
            android.content.Context context = c21508hBz.getRoot().getContext();
            java.lang.String string2 = context.getString(C23274hvD.Fragment.getMediaController);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (z) {
                string = C33069mpW.copydefault(C23274hvD.Fragment.setMediaController, C56423yEv.EZpvd(C56390yDp.OLrzqt("min", C25322iuY.OLrzqt.EZpvd(pumpLiveInfoData.getTokenCreateTime()))));
            } else {
                string = context.getString(C23274hvD.Fragment.IMediaSessionStubProxy);
                Intrinsics.copydefault((java.lang.Object) string);
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) string2);
            int i = C52761wXj.Activity.fdOvFl;
            Intrinsics.copydefault(context);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C25382ivf.copydefault(i, context)), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) string);
            if (z) {
                iCopydefault = C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
            } else {
                iCopydefault = C25382ivf.copydefault(C52761wXj.Activity.QwvEab, context);
            }
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iCopydefault), length2, spannableStringBuilder.length(), 33);
            C28891kjN c28891kjN = new C28891kjN(context, null, 0, 6, null);
            c28891kjN.setTag("tag.pump_live_chip");
            C28891kjN.setContent$default(c28891kjN, spannableStringBuilder, C33070mpX.KWHzl(C57406yhn.Activity.AubY), null, z, 4, null);
            c28891kjN.setPillBackgroundColor(C25382ivf.copydefault(C52761wXj.Activity.GQzpsZ, context));
            c28891kjN.setShimmerVisible(false);
            c28891kjN.setTextStyle(C52761wXj.LoaderManager.zuBGHE, true);
            c28891kjN.setContentPadding(12.0f, 8.0f);
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null));
            c28891kjN.setLayoutParams(layoutParams);
            c28891kjN.setOnClickListener(new TaskDescription(c28891kjN, 1000L, this, pumpLiveInfoData, string2));
            c21508hBz.EZpvd.addView(c28891kjN);
            FlexboxLayout flexboxLayout = c21508hBz.EZpvd;
            Intrinsics.checkNotNullExpressionValue(flexboxLayout, "");
            flexboxLayout.setVisibility(0);
            android.widget.TextView textView = c21508hBz.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[PHI: r2
  0x005f: PHI (r2v9 java.lang.String) = (r2v5 java.lang.String), (r2v11 java.lang.String) binds: [B:21:0x0079, B:14:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AhwBna() {
        java.lang.String str;
        C21508hBz c21508hBz = (C21508hBz) aX_();
        if (c21508hBz != null) {
            c21508hBz.EZpvd.removeAllViews();
            boolean z = false;
            for (MemeSocialMediaData memeSocialMediaData : AYXKKw().AEQbTJ()) {
                FlexboxLayout flexboxLayout = c21508hBz.EZpvd;
                android.content.Context context = c21508hBz.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                java.lang.Integer numAEQbTJ = memeSocialMediaData.AEQbTJ();
                int iIntValue = numAEQbTJ != null ? numAEQbTJ.intValue() : memeSocialMediaData.AYXKKw();
                java.lang.Integer numOLrzqt = memeSocialMediaData.OLrzqt();
                if (numOLrzqt != null) {
                    java.lang.String string = c21508hBz.getRoot().getContext().getString(numOLrzqt.intValue());
                    if (string == null) {
                        java.lang.Integer numCopydefault = memeSocialMediaData.copydefault();
                        string = numCopydefault != null ? c21508hBz.getRoot().getContext().getString(numCopydefault.intValue()) : null;
                        str = string == null ? "" : string;
                    }
                }
                android.view.View viewGenerateSocialsChip$default = generateSocialsChip$default(this, context, java.lang.Integer.valueOf(iIntValue), null, str, 4, null);
                viewGenerateSocialsChip$default.setOnClickListener(new Activity(viewGenerateSocialsChip$default, 1000L, memeSocialMediaData, this, c21508hBz));
                flexboxLayout.addView(viewGenerateSocialsChip$default);
                z = true;
            }
            FlexboxLayout flexboxLayout2 = c21508hBz.EZpvd;
            Intrinsics.checkNotNullExpressionValue(flexboxLayout2, "");
            flexboxLayout2.setVisibility(z ? 0 : 8);
            android.widget.TextView textView = c21508hBz.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        java.lang.String str = "https://x.com/search?q=(%24" + isConnected().gEmmrt() + ")";
        java.lang.String str2 = "https://x.com/search?q=(%24" + isConnected().AYXKKw() + "%20OR%20" + isConnected().djBIcL() + ")";
        C21508hBz c21508hBz = (C21508hBz) aX_();
        if (c21508hBz != null) {
            android.content.Context context = c21508hBz.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int i = C52761wXj.TaskDescription.UJpkuA;
            java.lang.String string = c21508hBz.getRoot().getContext().getString(C23274hvD.Fragment.addOnReportDrawnListener);
            Intrinsics.checkNotNullExpressionValue(string, "");
            android.view.View viewGenerateSocialsChip$default = generateSocialsChip$default(this, context, java.lang.Integer.valueOf(i), null, string, 4, null);
            viewGenerateSocialsChip$default.setOnClickListener(new LoaderManager(viewGenerateSocialsChip$default, 1000L, this, str, c21508hBz));
            c21508hBz.gEmmrt.addView(viewGenerateSocialsChip$default);
            android.content.Context context2 = c21508hBz.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int i2 = C52761wXj.TaskDescription.UJpkuA;
            java.lang.String string2 = c21508hBz.getRoot().getContext().getString(C23274hvD.Fragment.postWhenReportersAreDone);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            android.view.View viewGenerateSocialsChip$default2 = generateSocialsChip$default(this, context2, java.lang.Integer.valueOf(i2), null, string2, 4, null);
            viewGenerateSocialsChip$default2.setOnClickListener(new Fragment(viewGenerateSocialsChip$default2, 1000L, this, str2, c21508hBz));
            c21508hBz.gEmmrt.addView(viewGenerateSocialsChip$default2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(java.util.List<C28857kig> list) {
        java.lang.String strKWHzl;
        C21508hBz c21508hBz = (C21508hBz) aX_();
        if (c21508hBz != null) {
            for (C28857kig c28857kig : list) {
                if (C7911ask.AEQbTJ(c21508hBz.getRoot().getContext())) {
                    strKWHzl = c28857kig.EZpvd();
                } else {
                    strKWHzl = c28857kig.KWHzl();
                }
                java.lang.String str = strKWHzl;
                android.content.Context context = c21508hBz.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                java.lang.String strOLrzqt = c28857kig.OLrzqt();
                c21508hBz.OLrzqt.addView(generateSocialsChip$default(this, context, null, str, strOLrzqt.length() == 0 ? c28857kig.AEQbTJ() : strOLrzqt, 2, null));
            }
        }
    }

    /* JADX INFO: renamed from: o.kiw$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC28861kik abstractC28861kik, Continuation<? super Unit> continuation) {
            C21508hBz c21508hBzEZpvd = C28873kiw.EZpvd(C28873kiw.this);
            if (c21508hBzEZpvd != null) {
                C28873kiw c28873kiw = C28873kiw.this;
                FlexboxLayout flexboxLayout = c21508hBzEZpvd.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(flexboxLayout, "");
                boolean z = abstractC28861kik instanceof AbstractC28861kik.Activity;
                flexboxLayout.setVisibility(z ? 0 : 8);
                android.widget.TextView textView = c21508hBzEZpvd.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(z ? 0 : 8);
                if (z) {
                    c28873kiw.copydefault(((AbstractC28861kik.Activity) abstractC28861kik).AEQbTJ());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void fetchVPNInfo() {
        C25390ivn.collectOnViewLifecycle$default(this, gEmmrt().AEQbTJ(), null, new Dialog(), 2, null);
    }

    public static /* synthetic */ void acknowledgeAndRedirect$default(C28873kiw c28873kiw, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        c28873kiw.AEQbTJ(str, str2, str3);
    }

    public final void AEQbTJ(final java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!gEmmrt().EZpvd()) {
            KWHzl(str);
            return;
        }
        android.content.Context context = getContext();
        if (context != null) {
            java.lang.String string = context.getString(C23274hvD.Fragment.ComponentActivityNonConfigurationInstances);
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (str3 == null) {
                str3 = str2 != null ? C33069mpW.copydefault(C23274hvD.Fragment.getStatusCode, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTPushConstants.PlatformNode.KEY_PLATFORM, str2))) : null;
                if (str3 == null) {
                    str3 = context.getString(C23274hvD.Fragment.onStateChanged);
                    Intrinsics.checkNotNullExpressionValue(str3, "");
                }
            }
            java.lang.String string2 = context.getString(C23274hvD.Fragment.HJWChPURsaBn);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            int i = C23274hvD.Fragment.QKVWgx;
            java.lang.String string3 = context.getString(C23274hvD.Fragment.ORxRYg);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            C25352ivB.KWHzl(context, string, str3, string2, i, string3, new Function1() { // from class: o.kiv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28873kiw.AEQbTJ(this.KWHzl, str, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit AEQbTJ(C28873kiw c28873kiw, java.lang.String str, boolean z) {
        if (z) {
            c28873kiw.gEmmrt().KWHzl();
        }
        c28873kiw.KWHzl(str);
        return Unit.INSTANCE;
    }

    private final void KWHzl(java.lang.String str) {
        java.lang.String message;
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(str));
            android.content.Context context = getContext();
            if (context != null) {
                context.startActivity(intent);
            }
        } catch (java.lang.Exception e) {
            C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
            java.lang.Throwable cause = e.getCause();
            if (cause == null || (message = cause.getMessage()) == null) {
                message = "";
            }
            taskDescription.EZpvd(new java.lang.Exception("openSystemWebView:" + message + ">>>>>>>>" + str));
        }
    }

    public static /* synthetic */ android.view.View generateSocialsChip$default(C28873kiw c28873kiw, android.content.Context context, java.lang.Integer num, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return c28873kiw.KWHzl(context, num, str, str2);
    }

    public final android.view.View KWHzl(android.content.Context context, @androidx.annotation.DrawableRes java.lang.Integer num, java.lang.String str, final java.lang.String str2) {
        android.graphics.drawable.Drawable drawableKWHzl;
        final C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        c52794wYp.setOKDSType(260);
        c52794wYp.setOKDSSize(32);
        c52794wYp.setShouldTintImageWithTextColor(false);
        c52794wYp.setText(str2);
        if (num != null && (drawableKWHzl = C33070mpX.KWHzl(num.intValue())) != null) {
            drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
            c52794wYp.setCompoundDrawables(drawableKWHzl, null, null, null);
            if (str2.length() > 0) {
                c52794wYp.setCompoundDrawablePadding(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null));
            }
        } else if (str != null) {
            C25386ivj.loadRemoteDrawable$default(context, str, null, new Function1() { // from class: o.kiy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28873kiw.KWHzl(c52794wYp, str2, (android.graphics.drawable.Drawable) obj);
                }
            }, null, 20, null);
        }
        c52794wYp.setTextAppearance(C52761wXj.LoaderManager.zuBGHE);
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null));
        c52794wYp.setPadding(C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(4.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(4.0f, null, 1, null));
        c52794wYp.setLayoutParams(layoutParams);
        return c52794wYp;
    }

    public static final Unit KWHzl(C52794wYp c52794wYp, java.lang.String str, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "");
        drawable.setBounds(0, 0, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
        c52794wYp.setCompoundDrawables(drawable, null, null, null);
        if (str.length() > 0) {
            c52794wYp.setCompoundDrawablePadding(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void values() {
        java.lang.Object next;
        android.widget.TextView textView;
        FragmentContainerView fragmentContainerView;
        java.lang.String string;
        java.util.Iterator<T> it = AYXKKw().AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((MemeSocialMediaData) next).djBIcL() != null) {
                    break;
                }
            }
        }
        final MemeSocialMediaData memeSocialMediaData = (MemeSocialMediaData) next;
        final XPostType xPostTypeDjBIcL = memeSocialMediaData != null ? memeSocialMediaData.djBIcL() : null;
        java.util.Set setAhwBna = yEE.AhwBna(XPostType.POST, XPostType.PROFILE, XPostType.COMMUNITY);
        if (xPostTypeDjBIcL == null || !setAhwBna.contains(xPostTypeDjBIcL)) {
            C21508hBz c21508hBz = (C21508hBz) aX_();
            if (c21508hBz != null && (fragmentContainerView = c21508hBz.copydefault) != null) {
                fragmentContainerView.setVisibility(8);
            }
            C21508hBz c21508hBz2 = (C21508hBz) aX_();
            if (c21508hBz2 == null || (textView = c21508hBz2.DbNXlk) == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        C21508hBz c21508hBz3 = (C21508hBz) aX_();
        if (c21508hBz3 != null) {
            android.widget.TextView textView2 = c21508hBz3.DbNXlk;
            int i = StateListAnimator.OLrzqt[xPostTypeDjBIcL.ordinal()];
            if (i == 1) {
                string = c21508hBz3.getRoot().getContext().getString(C23274hvD.Fragment.XW);
            } else if (i == 2) {
                string = c21508hBz3.getRoot().getContext().getString(C23274hvD.Fragment.DcMfJKgMxgjU);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                string = c21508hBz3.getRoot().getContext().getString(C23274hvD.Fragment.DcMfJKsgNvtZ);
            }
            textView2.setText(string);
            FragmentContainerView fragmentContainerView2 = c21508hBz3.copydefault;
            Intrinsics.checkNotNullExpressionValue(fragmentContainerView2, "");
            OLrzqt(fragmentContainerView2, java.lang.String.valueOf(C56524yIo.AEQbTJ(C28734kgP.class).valueOf()), new Function0() { // from class: o.kiz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28873kiw.copydefault(this.EZpvd, xPostTypeDjBIcL, memeSocialMediaData);
                }
            });
        }
    }

    public static final androidx.fragment.app.Fragment copydefault(C28873kiw c28873kiw, XPostType xPostType, MemeSocialMediaData memeSocialMediaData) {
        return C28734kgP.Companion.KWHzl(new TwitterPreviewParams(c28873kiw.isConnected().KWHzl(), c28873kiw.isConnected().djBIcL(), xPostType, memeSocialMediaData.EZpvd()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AkhnZx() {
        C21508hBz c21508hBz = (C21508hBz) aX_();
        if (c21508hBz != null) {
            android.widget.FrameLayout frameLayout = c21508hBz.KWHzl;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(AYXKKw().OLrzqt() ? 0 : 8);
            if (AYXKKw().OLrzqt()) {
                C31197lpV c31197lpV = C31197lpV.EZpvd;
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c31197lpV.EZpvd(childFragmentManager, c21508hBz.KWHzl.getId(), "tag.ai_fg", new Function0() { // from class: o.kit
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C28873kiw.AEQbTJ(this.AEQbTJ);
                    }
                });
            }
        }
    }

    public static final androidx.fragment.app.Fragment AEQbTJ(C28873kiw c28873kiw) {
        return C25787jGi.Companion.copydefault(new MemeAiFragmentParams(c28873kiw.isConnected().KWHzl(), c28873kiw.isConnected().AYXKKw(), c28873kiw.isConnected().djBIcL(), false, c28873kiw.AYXKKw().djBIcL(), null, 32, null));
    }

    public final void EZpvd(C21508hBz c21508hBz, android.content.Context context) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        android.widget.TextView textView = c21508hBz.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(AYXKKw().OLrzqt() ? 0 : 8);
        if (AYXKKw().OLrzqt()) {
            java.lang.String string = context.getString(C23274hvD.Fragment.DTg);
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String str = context.getString(C23274hvD.Fragment.HJWChPRGtXKC) + " " + string;
            try {
                spannableStringBuilder = new android.text.SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new VoiceInteractor(context, this), str.length() - string.length(), str.length(), 33);
            } catch (java.lang.Exception unused) {
                spannableStringBuilder = null;
            }
            c21508hBz.valueOf.setText(spannableStringBuilder);
            android.widget.TextView textView2 = c21508hBz.valueOf;
            textView2.setOnClickListener(new AssistContent(textView2, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.kiw$VoiceInteractor */
    public static final class VoiceInteractor extends android.text.style.ClickableSpan {
        public final /* synthetic */ C28873kiw AEQbTJ;
        public final /* synthetic */ android.content.Context EZpvd;

        public VoiceInteractor(android.content.Context context, C28873kiw c28873kiw) {
            this.EZpvd = context;
            this.AEQbTJ = c28873kiw;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            textPaint.setColor(C25382ivf.copydefault(C52761wXj.Activity.Dmq, this.EZpvd));
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C25796jGr c25796jGrOLrzqt = C25796jGr.Companion.OLrzqt(C23274hvD.Fragment.getPriority, C23274hvD.Fragment.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose1);
            androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c25796jGrOLrzqt.show(childFragmentManager);
        }
    }
}
