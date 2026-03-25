package o;

import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.market.features.ai_summary.MemeAiFragmentParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailCommonParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenTabFragment$observeViewModel$1;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenTabViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kiQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28841kiQ extends AbstractC28865kio<hBU> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AhwBna() {
        return "--";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String valueOf() {
        return "--";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CHECK_CAST (o.hBU) (wrap:VB:0x0000: INVOKE (r0v0 o.kiQ) VIRTUAL call: o.hOm.aX_():androidx.viewbinding.ViewBinding A[MD:():VB extends androidx.viewbinding.ViewBinding (m), WRAPPED] (LINE:39)) */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ hBU OLrzqt(C28841kiQ c28841kiQ) {
        return (hBU) c28841kiQ.aX_();
    }

    public C28841kiQ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenTabFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenTabFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TokenTabViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenTabFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenTabFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenTabFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.kiV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28841kiQ.gEmmrt(this.EZpvd);
            }
        });
    }

    public final TokenTabViewModel AkhnZx() {
        return (TokenTabViewModel) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TokenDetailCommonParams values() {
        TokenDetailCommonParams tokenDetailCommonParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (tokenDetailCommonParams = (TokenDetailCommonParams) BundleCompat.getParcelable(arguments, "common_data", TokenDetailCommonParams.class)) == null) ? new TokenDetailCommonParams(null, null, null, null, null, false, false, null, null, false, 1023, null) : tokenDetailCommonParams;
    }

    public final TokenDetailTabData.TokenTab DbNXlk() {
        TokenDetailTabData.TokenTab tokenTab;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (tokenTab = (TokenDetailTabData.TokenTab) BundleCompat.getParcelable(arguments, "token_data", TokenDetailTabData.TokenTab.class)) == null) ? new TokenDetailTabData.TokenTab(null, null, false, null, 15, null) : tokenTab;
    }

    public final C28874kix isConnected() {
        return (C28874kix) this.valueOf.getValue();
    }

    public static final C28874kix gEmmrt(final C28841kiQ c28841kiQ) {
        return new C28874kix(new Function1() { // from class: o.kiS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28841kiQ.AEQbTJ(this.AEQbTJ, (C28868kir) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C28841kiQ c28841kiQ, C28868kir c28868kir) {
        Intrinsics.checkNotNullParameter(c28868kir, "");
        C28840kiP.EZpvd("similar_tokens");
        FragmentActivity activity = c28841kiQ.getActivity();
        if (activity != null) {
            C25352ivB.openMarketDetailPage$default(activity, "default_trade", new TokenBase(c28868kir.AEQbTJ(), c28868kir.djBIcL(), c28868kir.valueOf(), "", "", c28868kir.gEmmrt(), c28868kir.AhwBna(), 0, 0, 0, 0, null, "default_trade", null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -4224, null), "meme_factory", null, new int[0], 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kiQ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kiQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C28841kiQ AEQbTJ(@NotNull TokenDetailCommonParams tokenDetailCommonParams, @NotNull TokenDetailTabData.TokenTab tokenTab) {
            Intrinsics.checkNotNullParameter(tokenDetailCommonParams, "");
            Intrinsics.checkNotNullParameter(tokenTab, "");
            C28841kiQ c28841kiQ = new C28841kiQ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("common_data", tokenDetailCommonParams);
            bundle.putParcelable("token_data", tokenTab);
            c28841kiQ.setArguments(bundle);
            return c28841kiQ;
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public hBU KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBU hbuCopydefault = hBU.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hbuCopydefault, "");
        return hbuCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    public void KWHzl(@NotNull hBU hbu, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(hbu, "");
        android.content.Context context = hbu.getRoot().getContext();
        android.widget.FrameLayout frameLayout = hbu.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(DbNXlk().OLrzqt() ? 0 : 8);
        if (DbNXlk().OLrzqt()) {
            C31197lpV c31197lpV = C31197lpV.EZpvd;
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c31197lpV.EZpvd(childFragmentManager, hbu.AEQbTJ.getId(), "tag.ai_fg", new Function0() { // from class: o.kiO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28841kiQ.djBIcL(this.OLrzqt);
                }
            });
        }
        Intrinsics.copydefault(context);
        copydefault(hbu, context);
        C52794wYp c52794wYp = hbu.EZpvd;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, hbu, this));
        hbu.valueOf.setText(C31256lqb.KWHzl(C25352ivB.formatAddress$default(values().djBIcL(), 6, 4, null, 4, null), (Function0<java.lang.String>) new Function0() { // from class: o.kiR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28841kiQ.valueOf();
            }
        }));
        android.widget.ImageView imageView = hbu.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) values().djBIcL()) ? 0 : 8);
        android.widget.ImageView imageView2 = hbu.copydefault;
        imageView2.setOnClickListener(new StateListAnimator(imageView2, 1000L, hbu, this));
        hbu.DbNXlk.setText(C31256lqb.KWHzl(C25352ivB.formatAddress$default(DbNXlk().KWHzl(), 6, 4, null, 4, null), (Function0<java.lang.String>) new Function0() { // from class: o.kiT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28841kiQ.AhwBna();
            }
        }));
        android.widget.ImageView imageView3 = hbu.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) DbNXlk().KWHzl()) ? 0 : 8);
        android.widget.ImageView imageView4 = hbu.KWHzl;
        imageView4.setOnClickListener(new Activity(imageView4, 1000L, hbu, this));
        hbu.djBIcL.setAdapter(isConnected());
        fARcdN();
        fetchVPNInfo();
    }

    public static final androidx.fragment.app.Fragment djBIcL(C28841kiQ c28841kiQ) {
        return C25787jGi.Companion.copydefault(new MemeAiFragmentParams(c28841kiQ.values().KWHzl(), c28841kiQ.values().AYXKKw(), c28841kiQ.values().djBIcL(), false, c28841kiQ.DbNXlk().AEQbTJ(), null, 32, null));
    }

    public final void copydefault(hBU hbu, android.content.Context context) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        android.widget.TextView textView = hbu.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(DbNXlk().OLrzqt() ? 0 : 8);
        if (DbNXlk().OLrzqt()) {
            java.lang.String string = context.getString(C23274hvD.Fragment.DTg);
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String str = context.getString(C23274hvD.Fragment.HJWChPRGtXKC) + " " + string;
            try {
                spannableStringBuilder = new android.text.SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new PendingIntent(context, this), str.length() - string.length(), str.length(), 33);
            } catch (java.lang.Exception unused) {
                spannableStringBuilder = null;
            }
            hbu.gEmmrt.setText(spannableStringBuilder);
            android.widget.TextView textView2 = hbu.gEmmrt;
            textView2.setOnClickListener(new Application(textView2, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.kiQ$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ hBU KWHzl;
        public final /* synthetic */ C28841kiQ OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, hBU hbu, C28841kiQ c28841kiQ) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = hbu;
            this.OLrzqt = c28841kiQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C28840kiP.EZpvd("copy_dev_address");
                int i = C23274hvD.Fragment.playFromMediaId;
                android.content.Context context = this.KWHzl.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                hSW.copyAddress$default(i, context, this.OLrzqt.DbNXlk().KWHzl(), null, null, 24, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.kiQ$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C28841kiQ KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C28841kiQ c28841kiQ) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c28841kiQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C25796jGr c25796jGrOLrzqt = C25796jGr.Companion.OLrzqt(C23274hvD.Fragment.getPriority, C23274hvD.Fragment.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose1);
                androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c25796jGrOLrzqt.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.kiQ$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C28841kiQ KWHzl;
        public final /* synthetic */ hBU OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, hBU hbu, C28841kiQ c28841kiQ) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = hbu;
            this.KWHzl = c28841kiQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C28840kiP.EZpvd("copy_contract_address");
                int i = C23274hvD.Fragment.playFromMediaId;
                android.content.Context context = this.OLrzqt.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                hSW.copyAddress$default(i, context, this.KWHzl.values().djBIcL(), null, null, 24, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.kiQ$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ hBU EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C28841kiQ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, hBU hbu, C28841kiQ c28841kiQ) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = hbu;
            this.copydefault = c28841kiQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context context = this.EZpvd.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C25352ivB.AEQbTJ(context, this.copydefault.values().AhwBna());
            }
        }
    }

    /* JADX INFO: renamed from: o.kiQ$PendingIntent */
    public static final class PendingIntent extends android.text.style.ClickableSpan {
        public final /* synthetic */ C28841kiQ EZpvd;
        public final /* synthetic */ android.content.Context KWHzl;

        public PendingIntent(android.content.Context context, C28841kiQ c28841kiQ) {
            this.KWHzl = context;
            this.EZpvd = c28841kiQ;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            textPaint.setColor(C25382ivf.copydefault(C52761wXj.Activity.Dmq, this.KWHzl));
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C25796jGr c25796jGrOLrzqt = C25796jGr.Companion.OLrzqt(C23274hvD.Fragment.getPriority, C23274hvD.Fragment.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose1);
            androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c25796jGrOLrzqt.show(childFragmentManager);
        }
    }

    private final void fARcdN() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TokenTabFragment$observeViewModel$1(this, null), 3, null);
    }

    public final void fetchVPNInfo() {
        AkhnZx().KWHzl(values().KWHzl(), values().djBIcL(), values().AYXKKw());
    }
}
