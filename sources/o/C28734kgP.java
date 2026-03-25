package o;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.market.features.meme.data.model.XPostType;
import com.okinc.business.market.features.meme.preview.TwitterPreviewParams;
import com.okinc.business.market.features.meme.preview.TwitterPreviewViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.C6777aVl;
import o.InterfaceC28740kgV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kgP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28734kgP extends AbstractC28731kgM<hBZ> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AhwBna;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.invokespecialODCBUN;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ hBZ KWHzl(C28734kgP c28734kgP) {
        return (hBZ) c28734kgP.AEQbTJ();
    }

    public C28734kgP() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.meme.preview.TwitterPreviewFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.preview.TwitterPreviewFragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TwitterPreviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.preview.TwitterPreviewFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.preview.TwitterPreviewFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.preview.TwitterPreviewFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: o.kgP$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kgP.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C28734kgP KWHzl(@NotNull TwitterPreviewParams twitterPreviewParams) {
            Intrinsics.checkNotNullParameter(twitterPreviewParams, "");
            C28734kgP c28734kgP = new C28734kgP();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("twitter.preview.params", twitterPreviewParams);
            c28734kgP.setArguments(bundle);
            return c28734kgP;
        }
    }

    public final TwitterPreviewViewModel djBIcL() {
        return (TwitterPreviewViewModel) this.AhwBna.getValue();
    }

    public final TwitterPreviewParams gEmmrt() {
        TwitterPreviewParams twitterPreviewParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (twitterPreviewParams = (TwitterPreviewParams) arguments.getParcelable("twitter.preview.params")) == null) ? new TwitterPreviewParams(null, null, null, null, 15, null) : twitterPreviewParams;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/View;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC7000aZw
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public hBZ AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        hBZ hbzKWHzl = hBZ.KWHzl(view);
        Intrinsics.checkNotNullExpressionValue(hbzKWHzl, "");
        return hbzKWHzl;
    }

    @Override // o.AbstractC7000aZw, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AhwBna();
        valueOf();
        values();
        djBIcL().KWHzl(gEmmrt().EZpvd(), gEmmrt().OLrzqt(), gEmmrt().KWHzl());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        hBZ hbz = (hBZ) AEQbTJ();
        if (hbz != null) {
            C55173xeu c55173xeu = hbz.AYXKKw;
            java.lang.String string = C33129mqd.OLrzqt((java.lang.CharSequence) gEmmrt().copydefault()) ? hbz.getRoot().getContext().getString(C23274hvD.Fragment.ODCBUN) : "";
            Intrinsics.copydefault((java.lang.Object) string);
            c55173xeu.setRetry(string);
            hbz.AYXKKw.setRetryClickListener(new View.OnClickListener() { // from class: o.kgU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C28734kgP.copydefault(this.AEQbTJ, view);
                }
            });
            hbz.dxcTrN.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            hbz.dxcTrN.setHighlightColor(0);
            hbz.DXXBbs.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            hbz.DXXBbs.setHighlightColor(0);
            hbz.gkJEwt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            hbz.gkJEwt.setHighlightColor(0);
            android.widget.LinearLayout linearLayout = hbz.QKVWgx;
            linearLayout.setOnClickListener(new SharedElementCallback(linearLayout, 1000L, this));
            android.widget.LinearLayout linearLayout2 = hbz.QOLQEE;
            linearLayout2.setOnClickListener(new VoiceInteractor(linearLayout2, 1000L, this));
        }
    }

    public static final void copydefault(C28734kgP c28734kgP, android.view.View view) {
        c28734kgP.copydefault(c28734kgP.gEmmrt().copydefault());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        hBZ hbz = (hBZ) AEQbTJ();
        if (hbz != null) {
            android.widget.ImageView imageView = hbz.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C55418xja.KWHzl(imageView, new C55363xiY(false, false, true, 36, 36, true, 18, false, false, 0, null, null, 3971, null));
            android.widget.TextView textView = hbz.DCUTEI;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C55418xja.KWHzl(textView, new C55363xiY(false, false, true, 20, 120, false, null, false, false, 0, null, null, 4067, null));
            android.widget.TextView textView2 = hbz.fvQaOB;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            C55418xja.KWHzl(textView2, new C55363xiY(false, false, true, 16, 60, false, null, false, false, 0, null, null, 4067, null));
            android.widget.ImageView imageView2 = hbz.AuCTel;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C55418xja.KWHzl(imageView2, new C55363xiY(false, false, false, null, null, true, 7, false, false, 0, null, null, MTPushConstants.RemoteWhat.ON_CUSTOM_ARRIVED, null));
            android.widget.TextView textView3 = hbz.giSNqX;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            C55418xja.KWHzl(textView3, new C55363xiY(false, false, true, 16, 120, false, null, false, false, 0, null, null, 4067, null));
            android.widget.TextView textView4 = hbz.dxcTrN;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            C55418xja.KWHzl(textView4, new C55363xiY(false, false, false, 80, null, false, null, false, false, 0, null, null, 4087, null));
            for (android.widget.ImageView imageView3 : yDY.gEmmrt(hbz.AubY, hbz.AuCTelauCTel, hbz.fJNWhG, hbz.DbNXlk, hbz.sSMYrx)) {
                Intrinsics.copydefault(imageView3);
                C55418xja.KWHzl(imageView3, new C55363xiY(false, false, false, null, null, true, 16, false, false, 0, null, null, MTPushConstants.RemoteWhat.ON_CUSTOM_ARRIVED, null));
            }
            for (android.widget.TextView textView5 : yDY.gEmmrt(hbz.QKudOq, hbz.OqFWZa, hbz.dvKsVJ, hbz.fFgQHt, hbz.RKDWNf)) {
                Intrinsics.copydefault(textView5);
                C55418xja.KWHzl(textView5, new C55363xiY(false, false, true, 16, 32, false, null, false, false, 0, null, null, 4067, null));
            }
            C52794wYp c52794wYp = hbz.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            C55418xja.KWHzl(c52794wYp, new C55363xiY(false, false, false, 44, null, false, 28, false, false, 0, null, null, 4023, null));
            android.widget.ImageView imageView4 = hbz.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            C55418xja.KWHzl(imageView4, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.ImageView imageView5 = hbz.zuBGHE;
            Intrinsics.checkNotNullExpressionValue(imageView5, "");
            C55418xja.KWHzl(imageView5, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.ImageView imageView6 = hbz.gHZMYf;
            Intrinsics.checkNotNullExpressionValue(imageView6, "");
            C55418xja.KWHzl(imageView6, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.TextView textView6 = hbz.flVtFt;
            Intrinsics.checkNotNullExpressionValue(textView6, "");
            C55418xja.KWHzl(textView6, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.TextView textView7 = hbz.djSkpj;
            Intrinsics.checkNotNullExpressionValue(textView7, "");
            C55418xja.KWHzl(textView7, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.LinearLayout linearLayout = hbz.AwvSrB;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            C55418xja.KWHzl(linearLayout, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.TextView textView8 = hbz.finit;
            Intrinsics.checkNotNullExpressionValue(textView8, "");
            C55418xja.KWHzl(textView8, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.TextView textView9 = hbz.fZBcTu;
            Intrinsics.checkNotNullExpressionValue(textView9, "");
            C55418xja.KWHzl(textView9, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.TextView textView10 = hbz.DXXBbs;
            Intrinsics.checkNotNullExpressionValue(textView10, "");
            C55418xja.KWHzl(textView10, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            CardView cardView = hbz.copydefault;
            Intrinsics.checkNotNullExpressionValue(cardView, "");
            C55418xja.KWHzl(cardView, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            CardView cardView2 = hbz.valueOf;
            Intrinsics.checkNotNullExpressionValue(cardView2, "");
            C55418xja.KWHzl(cardView2, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.TextView textView11 = hbz.ODWQjV;
            Intrinsics.checkNotNullExpressionValue(textView11, "");
            C55418xja.KWHzl(textView11, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.LinearLayout linearLayout2 = hbz.QKVWgx;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            C55418xja.KWHzl(linearLayout2, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.TextView textView12 = hbz.OuxcSI;
            Intrinsics.checkNotNullExpressionValue(textView12, "");
            C55418xja.KWHzl(textView12, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.ImageView imageView7 = hbz.zLjUOn;
            Intrinsics.checkNotNullExpressionValue(imageView7, "");
            C55418xja.KWHzl(imageView7, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.TextView textView13 = hbz.DCJXGO;
            Intrinsics.checkNotNullExpressionValue(textView13, "");
            C55418xja.KWHzl(textView13, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.LinearLayout linearLayout3 = hbz.QOLQEE;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            C55418xja.KWHzl(linearLayout3, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.TextView textView14 = hbz.zuWLRA;
            Intrinsics.checkNotNullExpressionValue(textView14, "");
            C55418xja.KWHzl(textView14, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.ImageView imageView8 = hbz.AxsJAY;
            Intrinsics.checkNotNullExpressionValue(imageView8, "");
            C55418xja.KWHzl(imageView8, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
            android.widget.TextView textView15 = hbz.ffGIBT;
            Intrinsics.checkNotNullExpressionValue(textView15, "");
            C55418xja.KWHzl(textView15, new C55363xiY(false, false, false, null, null, false, null, false, true, 0, null, null, 3839, null));
        }
    }

    /* JADX INFO: renamed from: o.kgP$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C28734kgP AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C28734kgP c28734kgP, java.lang.String str) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c28734kgP;
            this.KWHzl = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C28840kiP.EZpvd("x_post_profile");
                this.AEQbTJ.KWHzl(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.kgP$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ C28734kgP EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C28734kgP c28734kgP, java.lang.String str) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c28734kgP;
            this.AEQbTJ = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C28840kiP.EZpvd("x_post_profile");
                this.EZpvd.KWHzl(this.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.kgP$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C28734kgP copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C28734kgP c28734kgP, java.lang.String str) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c28734kgP;
            this.EZpvd = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C28840kiP.EZpvd("x_post_profile");
                this.copydefault.KWHzl(this.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.kgP$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C28734kgP OLrzqt;
        public final /* synthetic */ C28807khj copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C28734kgP c28734kgP, C28807khj c28807khj) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c28734kgP;
            this.copydefault = c28807khj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C28840kiP.EZpvd("x_post_view_on_x");
                this.OLrzqt.copydefault(this.copydefault.DbNXlk());
            }
        }
    }

    /* JADX INFO: renamed from: o.kgP$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ C28734kgP OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C28734kgP c28734kgP, java.lang.String str) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c28734kgP;
            this.KWHzl = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.KWHzl(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.kgP$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ C28734kgP copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C28734kgP c28734kgP, java.lang.String str) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c28734kgP;
            this.KWHzl = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.KWHzl(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.kgP$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C28734kgP EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, C28734kgP c28734kgP) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c28734kgP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C28840kiP.EZpvd("x_translate");
                this.EZpvd.djBIcL().gEmmrt();
            }
        }
    }

    /* JADX INFO: renamed from: o.kgP$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C28734kgP OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C28734kgP c28734kgP, java.lang.String str) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c28734kgP;
            this.copydefault = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.KWHzl(this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.kgP$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C28734kgP OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C28734kgP c28734kgP) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c28734kgP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C28840kiP.EZpvd("x_translate");
                this.OLrzqt.djBIcL().AYXKKw();
            }
        }
    }

    /* JADX INFO: renamed from: o.kgP$LoaderManager */
    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC28740kgV interfaceC28740kgV, Continuation<? super Unit> continuation) {
            hBZ hbzKWHzl = C28734kgP.KWHzl(C28734kgP.this);
            if (hbzKWHzl != null) {
                C28734kgP c28734kgP = C28734kgP.this;
                ConstraintLayout constraintLayout = hbzKWHzl.djBIcL;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                boolean z = interfaceC28740kgV instanceof InterfaceC28740kgV.TaskDescription;
                constraintLayout.setVisibility((z || (interfaceC28740kgV instanceof InterfaceC28740kgV.Activity)) ? 0 : 8);
                C55173xeu c55173xeu = hbzKWHzl.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                boolean z2 = interfaceC28740kgV instanceof InterfaceC28740kgV.StateListAnimator;
                c55173xeu.setVisibility(z2 ? 0 : 8);
                if (interfaceC28740kgV instanceof InterfaceC28740kgV.Activity) {
                    c28734kgP.EZpvd(hbzKWHzl);
                    android.widget.LinearLayout root = hbzKWHzl.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                    C55418xja.AEQbTJ(root);
                } else if (z2) {
                    c28734kgP.AEQbTJ(hbzKWHzl);
                    android.widget.LinearLayout root2 = hbzKWHzl.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "");
                    C55418xja.EZpvd(root2);
                } else if (z) {
                    c28734kgP.AEQbTJ(hbzKWHzl);
                    android.widget.LinearLayout root3 = hbzKWHzl.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root3, "");
                    C55418xja.EZpvd(root3);
                    c28734kgP.EZpvd((InterfaceC28740kgV.TaskDescription) interfaceC28740kgV);
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c28734kgP, true, (java.lang.String) null, 2, (java.lang.Object) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void AhwBna() {
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().EZpvd(), null, new LoaderManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().copydefault(), null, new FragmentManager(), 2, null);
    }

    /* JADX INFO: renamed from: o.kgP$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28735kgQ c28735kgQ, Continuation<? super Unit> continuation) {
            hBZ hbzKWHzl = C28734kgP.KWHzl(C28734kgP.this);
            if (hbzKWHzl != null) {
                C28734kgP.this.AEQbTJ(hbzKWHzl, c28735kgQ);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(InterfaceC28740kgV.TaskDescription taskDescription) {
        java.lang.String string;
        C28807khj c28807khjCopydefault = taskDescription.copydefault();
        final hBZ hbz = (hBZ) AEQbTJ();
        if (hbz != null) {
            hbz.AEQbTJ.setEnabled(true);
            hbz.AEQbTJ.setText(hbz.getRoot().getContext().getString(C23274hvD.Fragment.ODCBUN));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) c28807khjCopydefault.EZpvd())) {
                android.widget.ImageView imageView = hbz.ejfBZ;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                C33054mpH.KWHzl(imageView, c28807khjCopydefault.EZpvd(), new Function1() { // from class: o.kgO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C28734kgP.AEQbTJ(hbz, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            }
            android.widget.ImageView imageView2 = hbz.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28807khjCopydefault.EZpvd()) ? 0 : 8);
            android.widget.ImageView imageView3 = hbz.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            C25386ivj.KWHzl(imageView3, c28807khjCopydefault.AhwBna(), new C25385ivi(C33070mpX.KWHzl(C52761wXj.TaskDescription.gCZUJG), null, 0.0f, 0, 14, null));
            android.widget.ImageView imageView4 = hbz.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            XPostType newProxyInstance = c28807khjCopydefault.getNewProxyInstance();
            XPostType xPostType = XPostType.COMMUNITY;
            imageView4.setVisibility(newProxyInstance != xPostType ? 0 : 8);
            android.widget.ImageView imageView5 = hbz.zuBGHE;
            Intrinsics.checkNotNullExpressionValue(imageView5, "");
            imageView5.setVisibility(c28807khjCopydefault.iwGUEr() ? 0 : 8);
            android.widget.TextView textView = hbz.DCUTEI;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C28738kgT.copydefault(textView, c28807khjCopydefault.isConnected());
            android.widget.TextView textView2 = hbz.fvQaOB;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            C28738kgT.copydefault(textView2, c28807khjCopydefault.djBIcL());
            android.widget.TextView textView3 = hbz.ODWQjV;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            C28738kgT.copydefault(textView3, c28807khjCopydefault.ejfBZ());
            java.lang.String strUzCIH = c28807khjCopydefault.uzCIH();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strUzCIH)) {
                android.widget.ImageView imageView6 = hbz.fetchVPNInfo;
                imageView6.setOnClickListener(new ActionBar(imageView6, 1000L, this, strUzCIH));
                android.widget.TextView textView4 = hbz.DCUTEI;
                textView4.setOnClickListener(new Activity(textView4, 1000L, this, strUzCIH));
                android.widget.TextView textView5 = hbz.fvQaOB;
                textView5.setOnClickListener(new Application(textView5, 1000L, this, strUzCIH));
            }
            android.widget.TextView textView6 = hbz.djSkpj;
            Intrinsics.checkNotNullExpressionValue(textView6, "");
            C28738kgT.copydefault(textView6, c28807khjCopydefault.AEQbTJ());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) c28807khjCopydefault.valueOf()) || C23313hvq.AhwBna(c28807khjCopydefault.valueOf(), "0")) {
                android.content.Context context = hbz.giSNqX.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                java.lang.String strKWHzl = C33069mpW.KWHzl(context, C23274hvD.Fragment.getLegacyAudioStream, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("dateTime", c28807khjCopydefault.valueOf())));
                android.widget.TextView textView7 = hbz.giSNqX;
                Intrinsics.checkNotNullExpressionValue(textView7, "");
                C28738kgT.copydefault(textView7, strKWHzl);
                android.widget.ImageView imageView7 = hbz.AuCTel;
                Intrinsics.checkNotNullExpressionValue(imageView7, "");
                imageView7.setVisibility(0);
            } else {
                android.widget.TextView textView8 = hbz.giSNqX;
                Intrinsics.checkNotNullExpressionValue(textView8, "");
                textView8.setVisibility(8);
                android.widget.ImageView imageView8 = hbz.AuCTel;
                Intrinsics.checkNotNullExpressionValue(imageView8, "");
                imageView8.setVisibility(8);
            }
            android.widget.TextView textView9 = hbz.gGvvIC;
            Intrinsics.checkNotNullExpressionValue(textView9, "");
            C28738kgT.copydefault(textView9, c28807khjCopydefault.AYXKKw());
            android.widget.TextView textView10 = hbz.gasjUx;
            if (c28807khjCopydefault.getNewProxyInstance() == xPostType) {
                string = hbz.getRoot().getContext().getString(C23274hvD.Fragment.sCB);
            } else {
                string = hbz.getRoot().getContext().getString(C23274hvD.Fragment.MediaBrowserCompatCustomActionResultReceiver);
            }
            textView10.setText(string);
            android.view.View view = hbz.AhwBna;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(gEmmrt().KWHzl() == XPostType.POST ? 0 : 8);
            android.widget.LinearLayout linearLayout = hbz.AwvSrB;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28807khjCopydefault.AYXKKw()) ? 0 : 8);
            android.widget.TextView textView11 = hbz.finit;
            Intrinsics.checkNotNullExpressionValue(textView11, "");
            C28738kgT.copydefault(textView11, c28807khjCopydefault.fARcdN());
            android.widget.TextView textView12 = hbz.fZBcTu;
            Intrinsics.checkNotNullExpressionValue(textView12, "");
            textView12.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28807khjCopydefault.fARcdN()) ? 0 : 8);
            android.widget.TextView textView13 = hbz.DXXBbs;
            Intrinsics.checkNotNullExpressionValue(textView13, "");
            C28738kgT.copydefault(textView13, c28807khjCopydefault.fIwbmz());
            android.widget.TextView textView14 = hbz.dxcTrN;
            Intrinsics.checkNotNullExpressionValue(textView14, "");
            C28738kgT.copydefault(textView14, c28807khjCopydefault.KWHzl());
            android.widget.LinearLayout linearLayout2 = hbz.QKVWgx;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28807khjCopydefault.copydefault()) ? 0 : 8);
            if (!c28807khjCopydefault.fetchVPNInfo().isEmpty()) {
                hbz.isConnected.setMedia(c28807khjCopydefault.fetchVPNInfo());
                C28802khe c28802khe = hbz.isConnected;
                Intrinsics.checkNotNullExpressionValue(c28802khe, "");
                c28802khe.setVisibility(0);
            } else {
                C28802khe c28802khe2 = hbz.isConnected;
                Intrinsics.checkNotNullExpressionValue(c28802khe2, "");
                c28802khe2.setVisibility(8);
            }
            android.widget.TextView textView15 = hbz.flVtFt;
            Intrinsics.checkNotNullExpressionValue(textView15, "");
            java.lang.Long lAkhnZx = c28807khjCopydefault.AkhnZx();
            C28738kgT.copydefault(textView15, lAkhnZx != null ? C25322iuY.OLrzqt.EZpvd(java.lang.String.valueOf(lAkhnZx.longValue())) : null);
            java.lang.Long lAkhnZx2 = c28807khjCopydefault.AkhnZx();
            long jCurrentTimeMillis = lAkhnZx2 != null ? java.lang.System.currentTimeMillis() - lAkhnZx2.longValue() : Long.MAX_VALUE;
            android.widget.TextView textView16 = hbz.flVtFt;
            int iKWHzl = C28888kjK.KWHzl(jCurrentTimeMillis);
            android.content.Context context2 = hbz.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            textView16.setTextColor(C25382ivf.copydefault(iKWHzl, context2));
            C28803khf c28803khfValues = c28807khjCopydefault.values();
            CardView cardView = hbz.valueOf;
            Intrinsics.checkNotNullExpressionValue(cardView, "");
            cardView.setVisibility(c28803khfValues != null ? 0 : 8);
            if (c28803khfValues != null) {
                android.widget.ImageView imageView9 = hbz.fARcdN;
                Intrinsics.checkNotNullExpressionValue(imageView9, "");
                C25386ivj.KWHzl(imageView9, c28803khfValues.AhwBna(), new C25385ivi(C33070mpX.KWHzl(C52761wXj.TaskDescription.gCZUJG), null, 0.0f, 0, 14, null));
                android.widget.ImageView imageView10 = hbz.getFieldNames;
                Intrinsics.checkNotNullExpressionValue(imageView10, "");
                imageView10.setVisibility(c28803khfValues.AkhnZx() ? 0 : 8);
                hbz.RlQdEF.setText(c28803khfValues.AYXKKw());
                hbz.hUfVAv.setText(c28803khfValues.KWHzl());
                hbz.DAIeex.setText(c28803khfValues.isConnected());
                hbz.gkJEwt.setText(c28803khfValues.OLrzqt());
                android.widget.LinearLayout linearLayout3 = hbz.QOLQEE;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                linearLayout3.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28803khfValues.AEQbTJ()) ? 0 : 8);
                java.lang.String strDbNXlk = c28803khfValues.DbNXlk();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) strDbNXlk)) {
                    android.widget.ImageView imageView11 = hbz.fARcdN;
                    imageView11.setOnClickListener(new TaskDescription(imageView11, 1000L, this, strDbNXlk));
                    android.widget.TextView textView17 = hbz.RlQdEF;
                    textView17.setOnClickListener(new Fragment(textView17, 1000L, this, strDbNXlk));
                    android.widget.TextView textView18 = hbz.hUfVAv;
                    textView18.setOnClickListener(new PendingIntent(textView18, 1000L, this, strDbNXlk));
                }
                if (true ^ c28803khfValues.djBIcL().isEmpty()) {
                    hbz.values.setMedia(c28803khfValues.djBIcL());
                    CardView cardView2 = hbz.gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(cardView2, "");
                    cardView2.setVisibility(0);
                } else {
                    CardView cardView3 = hbz.gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(cardView3, "");
                    cardView3.setVisibility(8);
                }
                android.widget.TextView textView19 = hbz.AxsJAYaxsJAY;
                Intrinsics.checkNotNullExpressionValue(textView19, "");
                C28738kgT.copydefault(textView19, c28803khfValues.valueOf());
                android.widget.LinearLayout linearLayout4 = hbz.QVAiDq;
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
                linearLayout4.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28803khfValues.valueOf()) ? 0 : 8);
                android.widget.TextView textView20 = hbz.AxsJAYsNCnLh;
                Intrinsics.checkNotNullExpressionValue(textView20, "");
                C28738kgT.copydefault(textView20, c28803khfValues.gEmmrt());
                android.widget.LinearLayout linearLayout5 = hbz.QfsBiF;
                Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
                linearLayout5.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28803khfValues.gEmmrt()) ? 0 : 8);
                android.widget.TextView textView21 = hbz.iZzfmt;
                Intrinsics.checkNotNullExpressionValue(textView21, "");
                C28738kgT.copydefault(textView21, c28803khfValues.copydefault());
                android.widget.LinearLayout linearLayout6 = hbz.RJOkX;
                Intrinsics.checkNotNullExpressionValue(linearLayout6, "");
                linearLayout6.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28803khfValues.copydefault()) ? 0 : 8);
                android.widget.TextView textView22 = hbz.iRxXKY;
                Intrinsics.checkNotNullExpressionValue(textView22, "");
                C28738kgT.copydefault(textView22, c28803khfValues.EZpvd());
                android.widget.LinearLayout linearLayout7 = hbz.QbewEr;
                Intrinsics.checkNotNullExpressionValue(linearLayout7, "");
                linearLayout7.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28803khfValues.EZpvd()) ? 0 : 8);
                android.widget.TextView textView23 = hbz.accept;
                Intrinsics.checkNotNullExpressionValue(textView23, "");
                C28738kgT.copydefault(textView23, c28803khfValues.fetchVPNInfo());
                android.widget.LinearLayout linearLayout8 = hbz.UeEOUB;
                Intrinsics.checkNotNullExpressionValue(linearLayout8, "");
                linearLayout8.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28803khfValues.fetchVPNInfo()) ? 0 : 8);
            }
            android.widget.TextView textView24 = hbz.QKudOq;
            Intrinsics.checkNotNullExpressionValue(textView24, "");
            C28738kgT.copydefault(textView24, c28807khjCopydefault.AuCTel());
            android.widget.LinearLayout linearLayout9 = hbz.RcXXUw;
            Intrinsics.checkNotNullExpressionValue(linearLayout9, "");
            linearLayout9.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28807khjCopydefault.AuCTel()) ? 0 : 8);
            android.widget.TextView textView25 = hbz.OqFWZa;
            Intrinsics.checkNotNullExpressionValue(textView25, "");
            C28738kgT.copydefault(textView25, c28807khjCopydefault.fJNWhG());
            android.widget.LinearLayout linearLayout10 = hbz.dNCPSb;
            Intrinsics.checkNotNullExpressionValue(linearLayout10, "");
            linearLayout10.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28807khjCopydefault.fJNWhG()) ? 0 : 8);
            android.widget.TextView textView26 = hbz.dvKsVJ;
            Intrinsics.checkNotNullExpressionValue(textView26, "");
            C28738kgT.copydefault(textView26, c28807khjCopydefault.gEmmrt());
            android.widget.LinearLayout linearLayout11 = hbz.QUSxYX;
            Intrinsics.checkNotNullExpressionValue(linearLayout11, "");
            linearLayout11.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28807khjCopydefault.gEmmrt()) ? 0 : 8);
            android.widget.TextView textView27 = hbz.fFgQHt;
            Intrinsics.checkNotNullExpressionValue(textView27, "");
            C28738kgT.copydefault(textView27, c28807khjCopydefault.OLrzqt());
            android.widget.LinearLayout linearLayout12 = hbz.OcIXYQ;
            Intrinsics.checkNotNullExpressionValue(linearLayout12, "");
            linearLayout12.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28807khjCopydefault.OLrzqt()) ? 0 : 8);
            android.widget.TextView textView28 = hbz.RKDWNf;
            Intrinsics.checkNotNullExpressionValue(textView28, "");
            C28738kgT.copydefault(textView28, c28807khjCopydefault.getFieldNames());
            android.widget.LinearLayout linearLayout13 = hbz.aKErDB;
            Intrinsics.checkNotNullExpressionValue(linearLayout13, "");
            linearLayout13.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28807khjCopydefault.getFieldNames()) ? 0 : 8);
            C52794wYp c52794wYp = hbz.AEQbTJ;
            c52794wYp.setOnClickListener(new Dialog(c52794wYp, 1000L, this, c28807khjCopydefault));
            C52794wYp c52794wYp2 = hbz.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c28807khjCopydefault.DbNXlk()) ? 0 : 8);
        }
    }

    public static final Unit AEQbTJ(hBZ hbz, boolean z) {
        if (!z) {
            android.widget.ImageView imageView = hbz.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C28806khi.KWHzl(imageView);
            hbz.ejfBZ.setBackgroundColor(C25382ivf.KWHzl(C52761wXj.Activity.idLUrz));
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(hBZ hbz, C28735kgQ c28735kgQ) {
        android.widget.ImageView imageView = hbz.zsXlph;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        android.widget.TextView textView = hbz.DarRvM;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        copydefault(imageView, textView, c28735kgQ.valueOf(), c28735kgQ.AEQbTJ());
        android.widget.TextView textView2 = hbz.OuxcSI;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility((!c28735kgQ.AEQbTJ() || c28735kgQ.OLrzqt().length() <= 0) ? 8 : 0);
        hbz.OuxcSI.setText(c28735kgQ.OLrzqt());
        android.widget.ImageView imageView2 = hbz.zLjUOn;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(c28735kgQ.EZpvd() ? 0 : 8);
        android.widget.TextView textView3 = hbz.DCJXGO;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(c28735kgQ.EZpvd() ? 0 : 8);
        android.widget.ImageView imageView3 = hbz.wlaJM;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        android.widget.TextView textView4 = hbz.getPostValueLengthLimit;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        copydefault(imageView3, textView4, c28735kgQ.AhwBna(), c28735kgQ.AYXKKw());
        android.widget.TextView textView5 = hbz.zuWLRA;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility((!c28735kgQ.AYXKKw() || c28735kgQ.copydefault().length() <= 0) ? 8 : 0);
        hbz.zuWLRA.setText(c28735kgQ.copydefault());
        android.widget.ImageView imageView4 = hbz.AxsJAY;
        Intrinsics.checkNotNullExpressionValue(imageView4, "");
        imageView4.setVisibility(c28735kgQ.KWHzl() ? 0 : 8);
        android.widget.TextView textView6 = hbz.ffGIBT;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        textView6.setVisibility(c28735kgQ.KWHzl() ? 0 : 8);
    }

    public final void copydefault(android.widget.ImageView imageView, android.widget.TextView textView, boolean z, boolean z2) {
        android.content.Context context = textView.getContext();
        int i = z2 ? C52761wXj.TaskDescription.RAaltf : C52761wXj.TaskDescription.RgaQzq;
        int i2 = z ? C52761wXj.Activity.UlJrfe : C52761wXj.Activity.svhCHd;
        imageView.setImageDrawable(C33070mpX.KWHzl(i));
        Intrinsics.copydefault(context);
        imageView.setColorFilter(C25382ivf.copydefault(i2, context));
        textView.setText(context.getString(z2 ? C23274hvD.Fragment.hrjNmC : C23274hvD.Fragment.gwwfep));
        textView.setTextColor(C25382ivf.copydefault(i2, context));
    }

    public final void EZpvd(hBZ hbz) {
        android.widget.ImageView imageView = hbz.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        android.widget.TextView textView = hbz.DCUTEI;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        hbz.DCUTEI.setText("");
        android.widget.TextView textView2 = hbz.fvQaOB;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        hbz.fvQaOB.setText("");
        android.widget.ImageView imageView2 = hbz.AuCTel;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(0);
        android.widget.TextView textView3 = hbz.giSNqX;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(0);
        hbz.giSNqX.setText("");
        android.view.View view = hbz.AhwBna;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        android.widget.TextView textView4 = hbz.dxcTrN;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(0);
        hbz.dxcTrN.setMaxLines(5);
        hbz.dxcTrN.setMinLines(5);
        for (android.widget.LinearLayout linearLayout : yDY.gEmmrt(hbz.RcXXUw, hbz.dNCPSb, hbz.QUSxYX, hbz.OcIXYQ, hbz.aKErDB)) {
            Intrinsics.copydefault(linearLayout);
            linearLayout.setVisibility(0);
        }
        java.util.Iterator it = yDY.gEmmrt(hbz.QKudOq, hbz.OqFWZa, hbz.dvKsVJ, hbz.fFgQHt, hbz.RKDWNf).iterator();
        while (it.hasNext()) {
            ((android.widget.TextView) it.next()).setText("");
        }
        C52794wYp c52794wYp = hbz.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(0);
        hbz.AEQbTJ.setEnabled(false);
        android.widget.LinearLayout linearLayout2 = hbz.aKErDB;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(8);
    }

    public final void AEQbTJ(hBZ hbz) {
        hbz.AEQbTJ.setEnabled(true);
        hbz.dxcTrN.setMaxLines(Integer.MAX_VALUE);
        hbz.dxcTrN.setMinLines(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(final java.lang.String str) {
        android.widget.LinearLayout root;
        if (!djBIcL().KWHzl()) {
            KWHzl(str);
            return;
        }
        hBZ hbz = (hBZ) AEQbTJ();
        android.content.Context context = (hbz == null || (root = hbz.getRoot()) == null) ? null : root.getContext();
        if (context != null) {
            C25352ivB.KWHzl(context, C33070mpX.OLrzqt(C23274hvD.Fragment.ComponentActivityNonConfigurationInstances, context), C33070mpX.OLrzqt(C23274hvD.Fragment.onStateChanged, context), C33070mpX.OLrzqt(C23274hvD.Fragment.HJWChPURsaBn, context), C23274hvD.Fragment.QKVWgx, C33070mpX.OLrzqt(C23274hvD.Fragment.ORxRYg, context), new Function1() { // from class: o.kgR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28734kgP.EZpvd(this.OLrzqt, str, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit EZpvd(C28734kgP c28734kgP, java.lang.String str, boolean z) {
        if (z) {
            c28734kgP.djBIcL().djBIcL();
        }
        c28734kgP.KWHzl(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.lang.String str) {
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
}
