package o;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.okinc.business.defi.dapp.net.DappCategory;
import com.okinc.business.defi.dapp.net.DappListBean;
import com.okinc.business.defi.dapp.net.search.DappDetailBean;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.dapp.bean.DappChains;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.web.WebActivity;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.JsonObject;
import o.C14808dsT;
import o.C52761wXj;
import o.InterfaceC43294rma;
import o.InterfaceC9850bdP;
import o.InterfaceC9857bdW;
import o.dLX;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.dsT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14808dsT extends wXX {
    public wYF AEQbTJ;
    public Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> AYXKKw;
    public DappDetailBean AhwBna;
    public final InterfaceC56387yDm KWHzl;
    public AbstractC13474dMr copydefault;
    public java.util.List<java.lang.Object> djBIcL = new java.util.ArrayList();
    public final InterfaceC56387yDm gEmmrt;
    public boolean valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public static java.lang.String EZpvd = "";

    public C14808dsT() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.dapp.dialog.DappDetailFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.dapp.dialog.DappDetailFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C15075dxV.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.dapp.dialog.DappDetailFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.dapp.dialog.DappDetailFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.dapp.dialog.DappDetailFragment$special$$inlined$viewModels$default$5
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.dte
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14808dsT.OLrzqt();
            }
        });
    }

    public final C15075dxV EZpvd() {
        return (C15075dxV) this.gEmmrt.getValue();
    }

    private final C15059dxF KWHzl() {
        return (C15059dxF) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15059dxF OLrzqt() {
        return new C15059dxF();
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("SHOW_BOTTOM_BUTTON");
        }
        return true;
    }

    /* JADX INFO: renamed from: o.dsT$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dsT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C14808dsT.EZpvd = str;
        }

        public final C14808dsT copydefault(long j, DappDetailBean dappDetailBean, java.lang.Boolean bool, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
            Intrinsics.checkNotNullParameter(function2, "");
            C14808dsT c14808dsT = new C14808dsT();
            c14808dsT.AYXKKw = function2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("DAPP_ID", j);
            bundle.putParcelable("DAPP_BEAN", dappDetailBean);
            bundle.putBoolean("SHOW_BOTTOM_BUTTON", bool != null ? bool.booleanValue() : true);
            c14808dsT.setArguments(bundle);
            return c14808dsT;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String name;
        dAQ daq;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = (AbstractC13474dMr) DataBindingUtil.inflate(getCustomLayoutInflater(), dLX.Fragment.fetchVPNInfo, constraintLayout, true);
        android.os.Bundle arguments = getArguments();
        DappDetailBean dappDetailBean = arguments != null ? (DappDetailBean) arguments.getParcelable("DAPP_BEAN") : null;
        this.AhwBna = dappDetailBean;
        if (dappDetailBean != null) {
            AbstractC13474dMr abstractC13474dMr = this.copydefault;
            if (abstractC13474dMr != null) {
                abstractC13474dMr.copydefault(dappDetailBean);
            }
            EZpvd(dappDetailBean);
        }
        AbstractC13474dMr abstractC13474dMr2 = this.copydefault;
        if (abstractC13474dMr2 != null && (daq = abstractC13474dMr2.AYXKKw) != null) {
            C33566myq c33566myq = C33566myq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(constraintLayout.getContext(), "");
            daq.setMaxHeight((int) (c33566myq.OLrzqt(r5) * 0.32f));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) EZpvd)) {
            C14742drG c14742drG = C14742drG.KWHzl;
            DappDetailBean dappDetailBean2 = this.AhwBna;
            if (dappDetailBean2 == null || (name = dappDetailBean2.getName()) == null) {
                name = "";
            }
            c14742drG.AEQbTJ(name, EZpvd);
        }
        EZpvd = "";
    }

    public final void EZpvd(final DappDetailBean dappDetailBean) {
        android.widget.RelativeLayout relativeLayout;
        wYC wyc;
        wYC wyc2;
        wYK wyk;
        wYK wyk2;
        android.widget.LinearLayout linearLayout;
        android.widget.TextView textView;
        android.widget.LinearLayout linearLayout2;
        android.widget.TextView textView2;
        android.widget.RelativeLayout relativeLayout2;
        java.lang.Integer category;
        android.widget.LinearLayout linearLayout3;
        java.lang.String str;
        int i;
        android.view.View view;
        android.view.View view2;
        java.util.List listAhwBna;
        android.view.View view3;
        android.view.View view4;
        int i2;
        android.widget.FrameLayout frameLayout;
        android.widget.FrameLayout frameLayout2;
        android.widget.FrameLayout frameLayout3;
        ConstraintLayout constraintLayout;
        int i3;
        android.view.View view5;
        android.view.View view6;
        java.util.List listAhwBna2;
        int i4;
        android.view.View view7;
        android.view.View view8;
        java.util.List listAhwBna3;
        android.view.View view9;
        android.view.View view10;
        java.util.List listAhwBna4;
        int i5;
        android.view.View view11;
        android.view.View view12;
        java.util.List listAhwBna5;
        android.widget.FrameLayout frameLayout4;
        ConstraintLayout constraintLayout2;
        android.widget.FrameLayout frameLayout5;
        final DappDetailBean.Token token;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        android.widget.TextView textView7;
        android.widget.ImageView imageView;
        android.widget.TextView textView8;
        android.widget.LinearLayout linearLayout4;
        android.widget.LinearLayout linearLayout5;
        java.util.List<java.lang.String> listAhwBna6;
        android.widget.LinearLayout linearLayout6;
        android.widget.LinearLayout linearLayout7;
        android.widget.LinearLayout linearLayout8;
        android.widget.LinearLayout linearLayout9;
        wYK wyk3;
        wYK wyk4;
        wYK wyk5;
        wYK wyk6;
        wYK wyk7;
        wYK wyk8;
        wYK wyk9;
        java.lang.String recommendIllustrate;
        android.widget.ImageView imageView2;
        android.widget.RelativeLayout relativeLayout3;
        android.widget.TextView textView9;
        java.lang.String okxDeepLink;
        wYK wyk10;
        wYK wyk11;
        wYK wyk12;
        wYC wyc3;
        wYC wyc4;
        wYC wyc5;
        android.widget.RelativeLayout relativeLayout4;
        android.widget.ImageView imageView3;
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("closeDappDetailPage");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.dsY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14808dsT.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dtp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14808dsT.djBIcL(function1, obj);
            }
        });
        AbstractC13474dMr abstractC13474dMr = this.copydefault;
        android.view.ViewGroup viewGroup = null;
        if (abstractC13474dMr != null && (imageView3 = abstractC13474dMr.AhwBna) != null) {
            C14867dtZ.loadDappRoundImage$default(C14867dtZ.AEQbTJ, imageView3, dappDetailBean.getLogo(), C33052mpF.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C14923duc.EZpvd.AEQbTJ(imageView3, 48), 0, 8, null);
            Unit unit = Unit.INSTANCE;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) dappDetailBean.getRewardInfo())) {
            AbstractC13474dMr abstractC13474dMr2 = this.copydefault;
            if (abstractC13474dMr2 != null && (relativeLayout4 = abstractC13474dMr2.getNewProxyInstance) != null) {
                relativeLayout4.setVisibility(0);
                Unit unit2 = Unit.INSTANCE;
            }
        } else {
            AbstractC13474dMr abstractC13474dMr3 = this.copydefault;
            if (abstractC13474dMr3 != null && (relativeLayout = abstractC13474dMr3.getNewProxyInstance) != null) {
                relativeLayout.setVisibility(8);
                Unit unit3 = Unit.INSTANCE;
            }
        }
        if (dappDetailBean.isFav()) {
            AbstractC13474dMr abstractC13474dMr4 = this.copydefault;
            if (abstractC13474dMr4 != null && (wyc5 = abstractC13474dMr4.fIwbmz) != null) {
                wyc5.setImageResource(C52761wXj.TaskDescription.QezThh);
                Unit unit4 = Unit.INSTANCE;
            }
            AbstractC13474dMr abstractC13474dMr5 = this.copydefault;
            if (abstractC13474dMr5 != null && (wyc4 = abstractC13474dMr5.fIwbmz) != null) {
                wyc4.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(requireContext(), C52761wXj.Activity.DQzvGNdrmXxu)));
                Unit unit5 = Unit.INSTANCE;
            }
        } else {
            AbstractC13474dMr abstractC13474dMr6 = this.copydefault;
            if (abstractC13474dMr6 != null && (wyc2 = abstractC13474dMr6.fIwbmz) != null) {
                wyc2.setImageResource(C52761wXj.TaskDescription.UkCIYP);
                Unit unit6 = Unit.INSTANCE;
            }
            AbstractC13474dMr abstractC13474dMr7 = this.copydefault;
            if (abstractC13474dMr7 != null && (wyc = abstractC13474dMr7.fIwbmz) != null) {
                wyc.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(requireContext(), C52761wXj.Activity.QwvEab)));
                Unit unit7 = Unit.INSTANCE;
            }
        }
        AbstractC13474dMr abstractC13474dMr8 = this.copydefault;
        if (abstractC13474dMr8 != null && (wyc3 = abstractC13474dMr8.fIwbmz) != null) {
            wyc3.setOnClickListener(new View.OnClickListener() { // from class: o.dtq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view13) {
                    C14808dsT.OLrzqt(this.EZpvd, dappDetailBean, view13);
                }
            });
            Unit unit8 = Unit.INSTANCE;
        }
        AbstractC13474dMr abstractC13474dMr9 = this.copydefault;
        if (abstractC13474dMr9 != null && (wyk12 = abstractC13474dMr9.EZpvd) != null) {
            wyk12.setHighlightColor(getResources().getColor(android.R.color.transparent));
            Unit unit9 = Unit.INSTANCE;
        }
        C14923duc c14923duc = C14923duc.EZpvd;
        java.lang.String url = dappDetailBean.getUrl();
        if (url == null) {
            url = "";
        }
        if (c14923duc.valueOf(url)) {
            AbstractC13474dMr abstractC13474dMr10 = this.copydefault;
            if (abstractC13474dMr10 != null && (wyk11 = abstractC13474dMr10.EZpvd) != null) {
                wyk11.setVisibility(8);
                Unit unit10 = Unit.INSTANCE;
            }
        } else {
            AbstractC13474dMr abstractC13474dMr11 = this.copydefault;
            if (abstractC13474dMr11 != null && (wyk = abstractC13474dMr11.EZpvd) != null) {
                wyk.setVisibility(0);
                Unit unit11 = Unit.INSTANCE;
            }
        }
        DappDetailBean dappDetailBean2 = this.AhwBna;
        if (dappDetailBean2 == null || (okxDeepLink = dappDetailBean2.getOkxDeepLink()) == null || !C33129mqd.OLrzqt((java.lang.CharSequence) okxDeepLink)) {
            AbstractC13474dMr abstractC13474dMr12 = this.copydefault;
            if (abstractC13474dMr12 != null && (wyk2 = abstractC13474dMr12.copydefault) != null) {
                wyk2.setVisibility(0);
                Unit unit12 = Unit.INSTANCE;
            }
        } else {
            AbstractC13474dMr abstractC13474dMr13 = this.copydefault;
            if (abstractC13474dMr13 != null && (wyk10 = abstractC13474dMr13.copydefault) != null) {
                wyk10.setVisibility(8);
                Unit unit13 = Unit.INSTANCE;
            }
        }
        java.util.List<DappChains> chains = dappDetailBean.getChains();
        if (chains == null || !C33129mqd.KWHzl((java.util.Collection) chains)) {
            AbstractC13474dMr abstractC13474dMr14 = this.copydefault;
            if (abstractC13474dMr14 != null && (textView = abstractC13474dMr14.wlaJM) != null) {
                textView.setVisibility(8);
                Unit unit14 = Unit.INSTANCE;
            }
            AbstractC13474dMr abstractC13474dMr15 = this.copydefault;
            if (abstractC13474dMr15 != null && (linearLayout = abstractC13474dMr15.KWHzl) != null) {
                linearLayout.setVisibility(8);
                Unit unit15 = Unit.INSTANCE;
            }
        } else {
            EZpvd(dappDetailBean.getChains());
        }
        java.util.List<DappDetailBean.SocialMedia> socialMediaList = dappDetailBean.getSocialMediaList();
        if (socialMediaList == null || !C33129mqd.KWHzl((java.util.Collection) socialMediaList)) {
            AbstractC13474dMr abstractC13474dMr16 = this.copydefault;
            if (abstractC13474dMr16 != null && (textView2 = abstractC13474dMr16.zsXlph) != null) {
                textView2.setVisibility(8);
                Unit unit16 = Unit.INSTANCE;
            }
            AbstractC13474dMr abstractC13474dMr17 = this.copydefault;
            if (abstractC13474dMr17 != null && (linearLayout2 = abstractC13474dMr17.ejfBZ) != null) {
                linearLayout2.setVisibility(8);
                Unit unit17 = Unit.INSTANCE;
            }
        } else {
            AEQbTJ(dappDetailBean.getSocialMediaList());
        }
        java.lang.String recommendDeepLink = dappDetailBean.getRecommendDeepLink();
        if (recommendDeepLink == null || recommendDeepLink.length() == 0 || (recommendIllustrate = dappDetailBean.getRecommendIllustrate()) == null || recommendIllustrate.length() == 0) {
            AbstractC13474dMr abstractC13474dMr18 = this.copydefault;
            if (abstractC13474dMr18 != null && (relativeLayout2 = abstractC13474dMr18.AEQbTJ) != null) {
                relativeLayout2.setVisibility(8);
                Unit unit18 = Unit.INSTANCE;
            }
        } else {
            java.lang.String string = getString(dLX.Dialog.RJOkX);
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String str2 = dappDetailBean.getRecommendIllustrate() + "  " + string;
            android.text.SpannableString spannableString = new android.text.SpannableString(str2);
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str2, string, 0, false, 6, (java.lang.Object) null);
            spannableString.setSpan(new android.text.style.UnderlineSpan(), iIndexOf$default, string.length() + iIndexOf$default, 18);
            AbstractC13474dMr abstractC13474dMr19 = this.copydefault;
            if (abstractC13474dMr19 != null && (textView9 = abstractC13474dMr19.valueOf) != null) {
                textView9.setText(spannableString);
                Unit unit19 = Unit.INSTANCE;
            }
            AbstractC13474dMr abstractC13474dMr20 = this.copydefault;
            if (abstractC13474dMr20 != null && (relativeLayout3 = abstractC13474dMr20.AEQbTJ) != null) {
                relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: o.dtt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view13) {
                        C14808dsT.djBIcL(this.copydefault, dappDetailBean, view13);
                    }
                });
                Unit unit20 = Unit.INSTANCE;
            }
            AbstractC13474dMr abstractC13474dMr21 = this.copydefault;
            if (abstractC13474dMr21 != null && (imageView2 = abstractC13474dMr21.OLrzqt) != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.dtr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view13) {
                        C14808dsT.gEmmrt(this.copydefault, view13);
                    }
                });
                Unit unit21 = Unit.INSTANCE;
            }
        }
        java.lang.String string2 = getString(dLX.Dialog.aKErDB);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String strCopydefault = C33069mpW.copydefault(this, dLX.Dialog.QbewEr, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("userAgreement", string2)));
        android.text.SpannableString spannableString2 = new android.text.SpannableString(strCopydefault);
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, string2, 0, false, 6, (java.lang.Object) null);
        spannableString2.setSpan(new Activity(), iIndexOf$default2, string2.length() + iIndexOf$default2, 18);
        Unit unit22 = Unit.INSTANCE;
        AbstractC13474dMr abstractC13474dMr22 = this.copydefault;
        if (abstractC13474dMr22 != null && (wyk9 = abstractC13474dMr22.EZpvd) != null) {
            wyk9.setText(spannableString2);
        }
        AbstractC13474dMr abstractC13474dMr23 = this.copydefault;
        if (abstractC13474dMr23 != null && (wyk8 = abstractC13474dMr23.EZpvd) != null) {
            wyk8.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        AbstractC13474dMr abstractC13474dMr24 = this.copydefault;
        if (abstractC13474dMr24 != null && (wyk7 = abstractC13474dMr24.EZpvd) != null) {
            wyk7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.dts
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C14808dsT.AEQbTJ(this.KWHzl, compoundButton, z);
                }
            });
        }
        int i6 = dLX.Dialog.QVAiDq;
        java.lang.String name = dappDetailBean.getName();
        if (name == null) {
            name = "";
        }
        java.lang.String str3 = "dappName";
        java.lang.String strCopydefault2 = C33069mpW.copydefault(this, i6, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("dappName", name)));
        AbstractC13474dMr abstractC13474dMr25 = this.copydefault;
        if (abstractC13474dMr25 != null && (wyk6 = abstractC13474dMr25.copydefault) != null) {
            wyk6.setText(strCopydefault2);
        }
        AbstractC13474dMr abstractC13474dMr26 = this.copydefault;
        if (abstractC13474dMr26 != null && (wyk5 = abstractC13474dMr26.copydefault) != null) {
            wyk5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.dsW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C14808dsT.KWHzl(this.OLrzqt, compoundButton, z);
                }
            });
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null && !arguments.getBoolean("SHOW_BOTTOM_BUTTON")) {
            AbstractC13474dMr abstractC13474dMr27 = this.copydefault;
            if (abstractC13474dMr27 != null && (wyk4 = abstractC13474dMr27.copydefault) != null) {
                wyk4.setVisibility(8);
            }
            AbstractC13474dMr abstractC13474dMr28 = this.copydefault;
            if (abstractC13474dMr28 != null && (wyk3 = abstractC13474dMr28.EZpvd) != null) {
                wyk3.setVisibility(8);
            }
            AbstractC13474dMr abstractC13474dMr29 = this.copydefault;
            if (abstractC13474dMr29 != null && (linearLayout9 = abstractC13474dMr29.iwGUEr) != null) {
                linearLayout9.setPadding(C33052mpF.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), 0, C33052mpF.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C33052mpF.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
            }
        }
        AbstractC13474dMr abstractC13474dMr30 = this.copydefault;
        if (abstractC13474dMr30 != null && (linearLayout8 = abstractC13474dMr30.AubY) != null) {
            linearLayout8.removeAllViews();
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) dappDetailBean.getRecommendInfo())) {
            java.lang.String recommendInfo = dappDetailBean.getRecommendInfo();
            Intrinsics.copydefault((java.lang.Object) recommendInfo);
            C55251xgS c55251xgSAEQbTJ = AEQbTJ(recommendInfo);
            c55251xgSAEQbTJ.setOKDSSize(-5);
            int iAhwBna = C33129mqd.AhwBna(dappDetailBean.getRecommendColor());
            if (iAhwBna == 1) {
                c55251xgSAEQbTJ.setOKDSStyle(9);
            } else if (iAhwBna == 2) {
                c55251xgSAEQbTJ.setOKDSStyle(8);
            } else if (iAhwBna == 3) {
                c55251xgSAEQbTJ.setOKDSStyle(10);
            } else if (iAhwBna == 4) {
                c55251xgSAEQbTJ.setOKDSStyle(12);
            }
            AbstractC13474dMr abstractC13474dMr31 = this.copydefault;
            if (abstractC13474dMr31 != null && (linearLayout7 = abstractC13474dMr31.AubY) != null) {
                linearLayout7.addView(c55251xgSAEQbTJ);
            }
        }
        java.util.List<java.lang.String> tagsNameList = dappDetailBean.getTagsNameList();
        if (tagsNameList == null || !C33129mqd.KWHzl((java.util.Collection) tagsNameList)) {
            DappDetailBean dappDetailBean3 = this.AhwBna;
            if (dappDetailBean3 == null || (category = dappDetailBean3.getCategory()) == null || category.intValue() != 9) {
                AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(C43423rox.unwrapResponseData$default(new C15059dxF().AEQbTJ(), (Function1) null, 1, (java.lang.Object) null), this);
                final Function1 function12 = new Function1() { // from class: o.dsZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14808dsT.copydefault(this.copydefault, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dsX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C14808dsT.gEmmrt(function12, obj);
                    }
                };
                final Function1 function13 = new Function1() { // from class: o.dtb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14808dsT.copydefault(dappDetailBean, this, (java.lang.Throwable) obj);
                    }
                };
                abstractC58185ywXEZpvd2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dth
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C14808dsT.AYXKKw(function13, obj);
                    }
                });
            } else {
                AbstractC13474dMr abstractC13474dMr32 = this.copydefault;
                if (abstractC13474dMr32 != null && (linearLayout3 = abstractC13474dMr32.AubY) != null) {
                    java.lang.String string3 = getString(dLX.Dialog.DCUTEI);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    linearLayout3.addView(AEQbTJ(string3));
                }
            }
        } else {
            java.util.List<java.lang.String> tagsNameList2 = dappDetailBean.getTagsNameList();
            if (tagsNameList2 != null && (listAhwBna6 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) tagsNameList2, 3)) != null) {
                for (java.lang.String str4 : listAhwBna6) {
                    AbstractC13474dMr abstractC13474dMr33 = this.copydefault;
                    if (abstractC13474dMr33 != null && (linearLayout6 = abstractC13474dMr33.AubY) != null) {
                        linearLayout6.addView(AEQbTJ(str4));
                        Unit unit23 = Unit.INSTANCE;
                    }
                }
                Unit unit24 = Unit.INSTANCE;
            }
        }
        java.util.List<DappDetailBean.Token> tokenList = dappDetailBean.getTokenList();
        if (tokenList != null && (token = (DappDetailBean.Token) CollectionsKt___CollectionsKt.firstOrNull(tokenList)) != null) {
            AbstractC13474dMr abstractC13474dMr34 = this.copydefault;
            if (abstractC13474dMr34 != null && (linearLayout5 = abstractC13474dMr34.AuCTelauCTel) != null) {
                linearLayout5.setVisibility(0);
                Unit unit25 = Unit.INSTANCE;
            }
            AbstractC13474dMr abstractC13474dMr35 = this.copydefault;
            if (abstractC13474dMr35 != null && (linearLayout4 = abstractC13474dMr35.AuCTelauCTel) != null) {
                linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: o.dto
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view13) {
                        C14808dsT.copydefault(this.OLrzqt, token, view13);
                    }
                });
                Unit unit26 = Unit.INSTANCE;
            }
            AbstractC13474dMr abstractC13474dMr36 = this.copydefault;
            if (abstractC13474dMr36 != null && (textView8 = abstractC13474dMr36.zLjUOn) != null) {
                textView8.setText(token.getTokenName());
                Unit unit27 = Unit.INSTANCE;
            }
            AbstractC13474dMr abstractC13474dMr37 = this.copydefault;
            if (abstractC13474dMr37 != null && (imageView = abstractC13474dMr37.hDKMBd) != null) {
                C14867dtZ.AEQbTJ.copydefault(imageView, token.getTokenLogo(), C33052mpF.dpInt$default(90, (android.content.Context) null, 1, (java.lang.Object) null), C33052mpF.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C33052mpF.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
                Unit unit28 = Unit.INSTANCE;
            }
            java.lang.String strLocalizePriceChangePercentage$default = InterfaceC9857bdW.TaskDescription.localizePriceChangePercentage$default((InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class), pTB.OLrzqt((java.lang.Object) token.getTokenChange()), 0, 0, true, null, null, 54, null);
            AbstractC13474dMr abstractC13474dMr38 = this.copydefault;
            if (abstractC13474dMr38 != null && (textView7 = abstractC13474dMr38.uzCIH) != null) {
                textView7.setText(strLocalizePriceChangePercentage$default);
                Unit unit29 = Unit.INSTANCE;
            }
            if (C33512mxp.AEQbTJ.isConnected() != 0) {
                java.lang.String tokenChange = token.getTokenChange();
                if ((tokenChange != null ? java.lang.Double.parseDouble(tokenChange) : 0.0d) >= AudioStats.AUDIO_AMPLITUDE_NONE) {
                    AbstractC13474dMr abstractC13474dMr39 = this.copydefault;
                    if (abstractC13474dMr39 != null && (textView6 = abstractC13474dMr39.uzCIH) != null) {
                        textView6.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
                        Unit unit30 = Unit.INSTANCE;
                    }
                } else {
                    AbstractC13474dMr abstractC13474dMr40 = this.copydefault;
                    if (abstractC13474dMr40 != null && (textView5 = abstractC13474dMr40.uzCIH) != null) {
                        textView5.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QIZEnU));
                        Unit unit31 = Unit.INSTANCE;
                    }
                }
            } else {
                java.lang.String tokenChange2 = token.getTokenChange();
                if ((tokenChange2 != null ? java.lang.Double.parseDouble(tokenChange2) : 0.0d) >= AudioStats.AUDIO_AMPLITUDE_NONE) {
                    AbstractC13474dMr abstractC13474dMr41 = this.copydefault;
                    if (abstractC13474dMr41 != null && (textView4 = abstractC13474dMr41.uzCIH) != null) {
                        textView4.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QIZEnU));
                        Unit unit32 = Unit.INSTANCE;
                    }
                } else {
                    AbstractC13474dMr abstractC13474dMr42 = this.copydefault;
                    if (abstractC13474dMr42 != null && (textView3 = abstractC13474dMr42.uzCIH) != null) {
                        textView3.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
                        Unit unit33 = Unit.INSTANCE;
                    }
                }
            }
        }
        java.util.List<DappDetailBean.Metric> metricList = dappDetailBean.getMetricList();
        if (metricList == null || (listAhwBna5 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) metricList, 2)) == null) {
            str = "dappName";
        } else {
            int i7 = 0;
            for (java.lang.Object obj : listAhwBna5) {
                if (i7 < 0) {
                    yDY.AYXKKw();
                }
                DappDetailBean.Metric metric = (DappDetailBean.Metric) obj;
                android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(dLX.Fragment.isConnected, viewGroup);
                ((android.widget.TextView) viewInflate.findViewById(dLX.Application.WS)).setText(metric.getName());
                ((android.widget.TextView) viewInflate.findViewById(dLX.Application.TarCU)).setText(InterfaceC9857bdW.TaskDescription.localizeLargeValueStrategy$default((InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class), pTB.OLrzqt((java.lang.Object) metric.getValue()), null, null, null, 14, null));
                InterfaceC9857bdW interfaceC9857bdW = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
                java.lang.String changeIn24h = metric.getChangeIn24h();
                java.lang.String str5 = str3;
                ((android.widget.TextView) viewInflate.findViewById(dLX.Application.uzCIH)).setText(InterfaceC9857bdW.TaskDescription.localizePriceChangePercentage$default(interfaceC9857bdW, pTB.OLrzqt(java.lang.Double.valueOf((changeIn24h != null ? java.lang.Double.parseDouble(changeIn24h) : 0.0d) / ((double) 100))), 0, 0, true, null, null, 54, null));
                if (C33512mxp.AEQbTJ.isConnected() != 0) {
                    java.lang.String changeIn24h2 = metric.getChangeIn24h();
                    if ((changeIn24h2 != null ? java.lang.Double.parseDouble(changeIn24h2) : 0.0d) >= AudioStats.AUDIO_AMPLITUDE_NONE) {
                        ((android.widget.TextView) viewInflate.findViewById(dLX.Application.uzCIH)).setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
                    } else {
                        ((android.widget.TextView) viewInflate.findViewById(dLX.Application.uzCIH)).setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QIZEnU));
                    }
                } else {
                    java.lang.String changeIn24h3 = metric.getChangeIn24h();
                    if ((changeIn24h3 != null ? java.lang.Double.parseDouble(changeIn24h3) : 0.0d) >= AudioStats.AUDIO_AMPLITUDE_NONE) {
                        ((android.widget.TextView) viewInflate.findViewById(dLX.Application.uzCIH)).setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QIZEnU));
                    } else {
                        ((android.widget.TextView) viewInflate.findViewById(dLX.Application.uzCIH)).setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
                    }
                }
                if (i7 == 0) {
                    AbstractC13474dMr abstractC13474dMr43 = this.copydefault;
                    if (abstractC13474dMr43 != null && (frameLayout5 = abstractC13474dMr43.values) != null) {
                        frameLayout5.addView(viewInflate);
                        Unit unit34 = Unit.INSTANCE;
                    }
                } else {
                    AbstractC13474dMr abstractC13474dMr44 = this.copydefault;
                    if (abstractC13474dMr44 != null && (frameLayout4 = abstractC13474dMr44.DbNXlk) != null) {
                        frameLayout4.addView(viewInflate);
                        Unit unit35 = Unit.INSTANCE;
                    }
                }
                AbstractC13474dMr abstractC13474dMr45 = this.copydefault;
                if (abstractC13474dMr45 != null && (constraintLayout2 = abstractC13474dMr45.fetchVPNInfo) != null) {
                    constraintLayout2.setVisibility(0);
                    Unit unit36 = Unit.INSTANCE;
                }
                i7++;
                str3 = str5;
                viewGroup = null;
            }
            str = str3;
            Unit unit37 = Unit.INSTANCE;
        }
        java.util.List<DappDetailBean.Metric> metricList2 = dappDetailBean.getMetricList();
        if (metricList2 == null || (listAhwBna4 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) metricList2, 2)) == null || listAhwBna4.size() != 2) {
            java.util.List<DappDetailBean.Metric> metricList3 = dappDetailBean.getMetricList();
            if (metricList3 == null || (listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) metricList3, 2)) == null || listAhwBna.size() != 1) {
                AbstractC13474dMr abstractC13474dMr46 = this.copydefault;
                if (abstractC13474dMr46 == null || (view2 = abstractC13474dMr46.fARcdN) == null) {
                    i = 8;
                } else {
                    i = 8;
                    view2.setVisibility(8);
                    Unit unit38 = Unit.INSTANCE;
                }
                AbstractC13474dMr abstractC13474dMr47 = this.copydefault;
                if (abstractC13474dMr47 != null && (view = abstractC13474dMr47.AuCTel) != null) {
                    view.setVisibility(i);
                    Unit unit39 = Unit.INSTANCE;
                }
            } else {
                AbstractC13474dMr abstractC13474dMr48 = this.copydefault;
                if (abstractC13474dMr48 != null && (view4 = abstractC13474dMr48.fARcdN) != null) {
                    view4.setVisibility(0);
                    Unit unit40 = Unit.INSTANCE;
                }
                AbstractC13474dMr abstractC13474dMr49 = this.copydefault;
                if (abstractC13474dMr49 != null && (view3 = abstractC13474dMr49.AuCTel) != null) {
                    view3.setVisibility(8);
                    Unit unit41 = Unit.INSTANCE;
                }
            }
        } else {
            AbstractC13474dMr abstractC13474dMr50 = this.copydefault;
            if (abstractC13474dMr50 == null || (view12 = abstractC13474dMr50.fARcdN) == null) {
                i5 = 0;
            } else {
                i5 = 0;
                view12.setVisibility(0);
                Unit unit42 = Unit.INSTANCE;
            }
            AbstractC13474dMr abstractC13474dMr51 = this.copydefault;
            if (abstractC13474dMr51 != null && (view11 = abstractC13474dMr51.AuCTel) != null) {
                view11.setVisibility(i5);
                Unit unit43 = Unit.INSTANCE;
            }
        }
        java.lang.String securityScore = dappDetailBean.getSecurityScore();
        if (securityScore != null) {
            if (C33129mqd.AEQbTJ(securityScore) == AudioStats.AUDIO_AMPLITUDE_NONE) {
                java.util.List<DappDetailBean.Metric> metricList4 = dappDetailBean.getMetricList();
                if (metricList4 != null && (listAhwBna3 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) metricList4, 2)) != null && listAhwBna3.size() == 2) {
                    AbstractC13474dMr abstractC13474dMr52 = this.copydefault;
                    if (abstractC13474dMr52 != null && (view10 = abstractC13474dMr52.fARcdN) != null) {
                        view10.setVisibility(0);
                        Unit unit44 = Unit.INSTANCE;
                    }
                    AbstractC13474dMr abstractC13474dMr53 = this.copydefault;
                    if (abstractC13474dMr53 == null || (view9 = abstractC13474dMr53.AuCTel) == null) {
                        return;
                    }
                    view9.setVisibility(8);
                    Unit unit45 = Unit.INSTANCE;
                    return;
                }
                java.util.List<DappDetailBean.Metric> metricList5 = dappDetailBean.getMetricList();
                if (metricList5 == null || (listAhwBna2 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) metricList5, 2)) == null || listAhwBna2.size() != 1) {
                    AbstractC13474dMr abstractC13474dMr54 = this.copydefault;
                    if (abstractC13474dMr54 == null || (view6 = abstractC13474dMr54.fARcdN) == null) {
                        i3 = 8;
                    } else {
                        i3 = 8;
                        view6.setVisibility(8);
                        Unit unit46 = Unit.INSTANCE;
                    }
                    AbstractC13474dMr abstractC13474dMr55 = this.copydefault;
                    if (abstractC13474dMr55 == null || (view5 = abstractC13474dMr55.AuCTel) == null) {
                        return;
                    }
                    view5.setVisibility(i3);
                    Unit unit47 = Unit.INSTANCE;
                    return;
                }
                AbstractC13474dMr abstractC13474dMr56 = this.copydefault;
                if (abstractC13474dMr56 == null || (view8 = abstractC13474dMr56.fARcdN) == null) {
                    i4 = 8;
                } else {
                    i4 = 8;
                    view8.setVisibility(8);
                    Unit unit48 = Unit.INSTANCE;
                }
                AbstractC13474dMr abstractC13474dMr57 = this.copydefault;
                if (abstractC13474dMr57 == null || (view7 = abstractC13474dMr57.AuCTel) == null) {
                    return;
                }
                view7.setVisibility(i4);
                Unit unit49 = Unit.INSTANCE;
                return;
            }
            AbstractC13474dMr abstractC13474dMr58 = this.copydefault;
            if (abstractC13474dMr58 == null || (constraintLayout = abstractC13474dMr58.fetchVPNInfo) == null) {
                i2 = 0;
            } else {
                i2 = 0;
                constraintLayout.setVisibility(0);
                Unit unit50 = Unit.INSTANCE;
            }
            android.view.View viewInflate2 = android.view.LayoutInflater.from(getContext()).inflate(dLX.Fragment.isConnected, (android.view.ViewGroup) null);
            viewInflate2.findViewById(dLX.Application.DbNXlk).setVisibility(i2);
            ((android.widget.TextView) viewInflate2.findViewById(dLX.Application.TarCU)).setVisibility(8);
            viewInflate2.findViewById(dLX.Application.QCjLjM).setVisibility(i2);
            ((android.widget.TextView) viewInflate2.findViewById(dLX.Application.OJuSTm)).setText(securityScore);
            ((android.widget.TextView) viewInflate2.findViewById(dLX.Application.WS)).setText(C33070mpX.AYXKKw(dLX.Dialog.DLWbHP));
            viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: o.dtl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view13) {
                    C14808dsT.EZpvd(this.KWHzl, dappDetailBean, view13);
                }
            });
            android.widget.TextView textView10 = (android.widget.TextView) viewInflate2.findViewById(dLX.Application.uzCIH);
            android.widget.ImageView imageView4 = (android.widget.ImageView) viewInflate2.findViewById(dLX.Application.QVsKAR);
            imageView4.setVisibility(0);
            if (C33129mqd.AEQbTJ(securityScore) <= 45.49d) {
                textView10.setText(C33070mpX.AYXKKw(dLX.Dialog.ODXsMY));
                textView10.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
                imageView4.setBackground(C33070mpX.KWHzl(dLX.ActionBar.AhwBna));
                imageView4.setBackgroundTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.DQzvGN));
            } else if (C33129mqd.AEQbTJ(securityScore) <= 56.49d) {
                textView10.setText(C33070mpX.AYXKKw(dLX.Dialog.OHqIaq));
                textView10.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
                imageView4.setBackground(C33070mpX.KWHzl(dLX.ActionBar.AhwBna));
                imageView4.setBackgroundTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.DQzvGN));
            } else if (C33129mqd.AEQbTJ(securityScore) <= 71.49d) {
                textView10.setText(C33070mpX.AYXKKw(dLX.Dialog.hrNTAI));
                textView10.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
                imageView4.setBackground(C33070mpX.KWHzl(dLX.ActionBar.values));
                imageView4.setBackgroundTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.gdmIOq));
            } else if (C33129mqd.AEQbTJ(securityScore) <= 86.49d) {
                textView10.setText(C33070mpX.AYXKKw(dLX.Dialog.OFhtUX));
                textView10.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QIZEnU));
                imageView4.setBackground(C33070mpX.KWHzl(dLX.ActionBar.djBIcL));
                imageView4.setBackgroundTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.QIZEnU));
            } else {
                textView10.setText(C33070mpX.AYXKKw(dLX.Dialog.QVsKAR));
                textView10.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QIZEnU));
                imageView4.setBackground(C33070mpX.KWHzl(dLX.ActionBar.djBIcL));
                imageView4.setBackgroundTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.QIZEnU));
            }
            java.util.List<DappDetailBean.Metric> metricList6 = dappDetailBean.getMetricList();
            if (metricList6 != null) {
                if (metricList6.isEmpty()) {
                    AbstractC13474dMr abstractC13474dMr59 = this.copydefault;
                    if (abstractC13474dMr59 != null && (frameLayout3 = abstractC13474dMr59.values) != null) {
                        frameLayout3.addView(viewInflate2);
                        Unit unit51 = Unit.INSTANCE;
                    }
                } else if (metricList6.size() == 1) {
                    AbstractC13474dMr abstractC13474dMr60 = this.copydefault;
                    if (abstractC13474dMr60 != null && (frameLayout2 = abstractC13474dMr60.DbNXlk) != null) {
                        frameLayout2.addView(viewInflate2);
                        Unit unit52 = Unit.INSTANCE;
                    }
                } else {
                    AbstractC13474dMr abstractC13474dMr61 = this.copydefault;
                    if (abstractC13474dMr61 != null && (frameLayout = abstractC13474dMr61.AkhnZx) != null) {
                        frameLayout.addView(viewInflate2);
                        Unit unit53 = Unit.INSTANCE;
                    }
                }
            }
        }
        int i8 = dLX.Dialog.QfsBiF;
        java.lang.String name2 = dappDetailBean.getName();
        java.lang.String strCopydefault3 = C33069mpW.copydefault(this, i8, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(str, name2 != null ? name2 : "")));
        wYF wyf = this.AEQbTJ;
        if (wyf != null) {
            wyf.setPrimaryText(strCopydefault3);
            Unit unit54 = Unit.INSTANCE;
        }
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C14808dsT c14808dsT, java.lang.String str) {
        c14808dsT.dismiss();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(final C14808dsT c14808dsT, final DappDetailBean dappDetailBean, android.view.View view) {
        java.lang.String name;
        wYK wyk;
        C14742drG c14742drG = C14742drG.KWHzl;
        AbstractC13474dMr abstractC13474dMr = c14808dsT.copydefault;
        boolean zIsChecked = (abstractC13474dMr == null || (wyk = abstractC13474dMr.copydefault) == null) ? false : wyk.isChecked();
        DappDetailBean dappDetailBean2 = c14808dsT.AhwBna;
        if (dappDetailBean2 == null || (name = dappDetailBean2.getName()) == null) {
            name = "";
        }
        c14742drG.KWHzl(!zIsChecked, name, "favourite_button");
        C15075dxV c15075dxVEZpvd = c14808dsT.EZpvd();
        java.lang.String strValueOf = java.lang.String.valueOf(dappDetailBean.getCategory());
        android.os.Bundle arguments = c14808dsT.getArguments();
        long j = arguments != null ? arguments.getLong("DAPP_ID") : 0L;
        androidx.fragment.app.FragmentManager fragmentManager = c14808dsT.getFragmentManager();
        boolean zIsFav = dappDetailBean.isFav();
        java.lang.String url = dappDetailBean.getUrl();
        java.lang.String str = url == null ? "" : url;
        java.lang.String url2 = dappDetailBean.getUrl();
        c15075dxVEZpvd.AEQbTJ(strValueOf, j, fragmentManager, zIsFav, str, url2 == null ? "" : url2, new Function0() { // from class: o.dtd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14808dsT.KWHzl(dappDetailBean, c14808dsT);
            }
        });
    }

    public static final Unit KWHzl(DappDetailBean dappDetailBean, C14808dsT c14808dsT) {
        wYC wyc;
        wYC wyc2;
        wYC wyc3;
        wYC wyc4;
        dappDetailBean.setFav(!dappDetailBean.isFav());
        if (dappDetailBean.isFav()) {
            C55326xho.toastWithSuccessfulIcon$default(dLX.Dialog.DXXBbs, 0, 1, (java.lang.Object) null);
            AbstractC13474dMr abstractC13474dMr = c14808dsT.copydefault;
            if (abstractC13474dMr != null && (wyc4 = abstractC13474dMr.fIwbmz) != null) {
                wyc4.setImageResource(C52761wXj.TaskDescription.QezThh);
            }
            AbstractC13474dMr abstractC13474dMr2 = c14808dsT.copydefault;
            if (abstractC13474dMr2 != null && (wyc3 = abstractC13474dMr2.fIwbmz) != null) {
                wyc3.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(c14808dsT.requireContext(), C52761wXj.Activity.DQzvGNdrmXxu)));
            }
        } else {
            C55326xho.toastWithSuccessfulIcon$default(dLX.Dialog.OqFWZa, 0, 1, (java.lang.Object) null);
            AbstractC13474dMr abstractC13474dMr3 = c14808dsT.copydefault;
            if (abstractC13474dMr3 != null && (wyc2 = abstractC13474dMr3.fIwbmz) != null) {
                wyc2.setImageResource(C52761wXj.TaskDescription.UkCIYP);
            }
            AbstractC13474dMr abstractC13474dMr4 = c14808dsT.copydefault;
            if (abstractC13474dMr4 != null && (wyc = abstractC13474dMr4.fIwbmz) != null) {
                wyc.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(c14808dsT.requireContext(), C52761wXj.Activity.QwvEab)));
            }
        }
        C14742drG.KWHzl.copydefault("dapp_sheet", dappDetailBean.isFav() ? "add" : "remove");
        DappListBean dappListBean = new DappListBean(0L, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 4095, (DefaultConstructorMarker) null);
        dappListBean.setFav(dappDetailBean.isFav());
        dappListBean.setId(dappDetailBean.getId());
        java.lang.String url = dappDetailBean.getUrl();
        if (url == null) {
            url = "";
        }
        dappListBean.setUrl(url);
        RxBus.AEQbTJ(dappListBean);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(C14808dsT c14808dsT, DappDetailBean dappDetailBean, android.view.View view) {
        try {
            Result.Application application = Result.Companion;
            c14808dsT.dismissAllowingStateLoss();
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
            FragmentActivity fragmentActivityRequireActivity = c14808dsT.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            java.lang.String recommendDeepLink = dappDetailBean.getRecommendDeepLink();
            InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, recommendDeepLink == null ? "" : recommendDeepLink, null, new Function1() { // from class: o.dtn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14808dsT.KWHzl((AbstractC43238rlX) obj);
                }
            }, 4, null);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(C14808dsT c14808dsT, android.view.View view) {
        android.widget.RelativeLayout relativeLayout;
        AbstractC13474dMr abstractC13474dMr = c14808dsT.copydefault;
        if (abstractC13474dMr == null || (relativeLayout = abstractC13474dMr.AEQbTJ) == null) {
            return;
        }
        relativeLayout.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.dsT$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public Activity() {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setColor(C33070mpX.copydefault(C52761wXj.Activity.iLWfRf));
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            androidx.fragment.app.FragmentManager supportFragmentManager;
            Intrinsics.checkNotNullParameter(view, "");
            FragmentActivity activity = C14808dsT.this.getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return;
            }
            final C14808dsT c14808dsT = C14808dsT.this;
            C14893dtz c14893dtz = new C14893dtz();
            c14893dtz.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.dtv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    C14808dsT.Activity.OLrzqt(c14808dsT, dialogInterface);
                }
            });
            c14893dtz.show(supportFragmentManager);
        }

        public static final void OLrzqt(C14808dsT c14808dsT, android.content.DialogInterface dialogInterface) {
            wYK wyk;
            AbstractC13474dMr abstractC13474dMr = c14808dsT.copydefault;
            if (abstractC13474dMr == null || (wyk = abstractC13474dMr.EZpvd) == null) {
                return;
            }
            wyk.setChecked(true);
        }
    }

    public static final void AEQbTJ(C14808dsT c14808dsT, android.widget.CompoundButton compoundButton, boolean z) {
        C52794wYp c52794wYpCopydefault;
        C52794wYp c52794wYpCopydefault2;
        wYF wyf = c14808dsT.AEQbTJ;
        if (wyf != null && (c52794wYpCopydefault2 = wyf.copydefault()) != null) {
            c52794wYpCopydefault2.setClickable(z);
        }
        wYF wyf2 = c14808dsT.AEQbTJ;
        if (wyf2 == null || (c52794wYpCopydefault = wyf2.copydefault()) == null) {
            return;
        }
        c52794wYpCopydefault.setEnabled(z);
    }

    public static final void KWHzl(C14808dsT c14808dsT, android.widget.CompoundButton compoundButton, boolean z) {
        c14808dsT.valueOf = z;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C14808dsT c14808dsT, java.util.List list) {
        AbstractC13474dMr abstractC13474dMr;
        android.widget.LinearLayout linearLayout;
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            DappCategory dappCategory = (DappCategory) it.next();
            DappDetailBean dappDetailBean = c14808dsT.AhwBna;
            if (dappDetailBean != null) {
                int code = dappCategory.getCode();
                java.lang.Integer category = dappDetailBean.getCategory();
                if (category != null && code == category.intValue() && (abstractC13474dMr = c14808dsT.copydefault) != null && (linearLayout = abstractC13474dMr.AubY) != null) {
                    linearLayout.addView(c14808dsT.AEQbTJ(dappCategory.getName()));
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(DappDetailBean dappDetailBean, C14808dsT c14808dsT, java.lang.Throwable th) {
        java.lang.String strAYXKKw;
        android.widget.LinearLayout linearLayout;
        java.lang.Integer category = dappDetailBean.getCategory();
        if (category != null && category.intValue() == 1) {
            strAYXKKw = C33070mpX.AYXKKw(dLX.Dialog.accept);
        } else if (category != null && category.intValue() == 2) {
            strAYXKKw = C33070mpX.AYXKKw(dLX.Dialog.RdAHlO);
        } else if (category != null && category.intValue() == 3) {
            strAYXKKw = C33070mpX.AYXKKw(dLX.Dialog.getPostValueLengthLimit);
        } else if (category != null && category.intValue() == 4) {
            strAYXKKw = C33070mpX.AYXKKw(dLX.Dialog.QHmsKR);
        } else if (category != null && category.intValue() == 8) {
            strAYXKKw = C33070mpX.AYXKKw(dLX.Dialog.zuWLRA);
        } else {
            strAYXKKw = (category != null && category.intValue() == 9) ? C33070mpX.AYXKKw(dLX.Dialog.DCUTEI) : C33070mpX.AYXKKw(dLX.Dialog.accept);
        }
        AbstractC13474dMr abstractC13474dMr = c14808dsT.copydefault;
        if (abstractC13474dMr != null && (linearLayout = abstractC13474dMr.AubY) != null) {
            linearLayout.addView(c14808dsT.AEQbTJ(strAYXKKw));
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(C14808dsT c14808dsT, DappDetailBean.Token token, android.view.View view) {
        java.lang.String name;
        gKO gko;
        wYK wyk;
        C14742drG c14742drG = C14742drG.KWHzl;
        AbstractC13474dMr abstractC13474dMr = c14808dsT.copydefault;
        boolean zIsChecked = (abstractC13474dMr == null || (wyk = abstractC13474dMr.copydefault) == null) ? false : wyk.isChecked();
        DappDetailBean dappDetailBean = c14808dsT.AhwBna;
        if (dappDetailBean == null || (name = dappDetailBean.getName()) == null) {
            name = "";
        }
        c14742drG.KWHzl(!zIsChecked, name, "token");
        android.content.Context context = c14808dsT.getContext();
        if (context == null || (gko = (gKO) C43248rlh.KWHzl.OLrzqt(gKO.class)) == null) {
            return;
        }
        java.lang.String chainId = token.getChainId();
        java.lang.String str = chainId == null ? "" : chainId;
        java.lang.String tokenAddress = token.getTokenAddress();
        gko.EZpvd(context, new TokenBase(str, tokenAddress == null ? "" : tokenAddress, null, null, null, null, null, 0, 0, 0, 0, null, "dapp_trade", null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -4100, null));
    }

    public static final void EZpvd(C14808dsT c14808dsT, DappDetailBean dappDetailBean, android.view.View view) {
        c14808dsT.OLrzqt(java.lang.String.valueOf(dappDetailBean.getId()), java.lang.String.valueOf(dappDetailBean.getName()));
    }

    public final void OLrzqt(final java.lang.String str, final java.lang.String str2) {
        java.lang.String name;
        wYK wyk;
        C14742drG c14742drG = C14742drG.KWHzl;
        AbstractC13474dMr abstractC13474dMr = this.copydefault;
        boolean zIsChecked = (abstractC13474dMr == null || (wyk = abstractC13474dMr.copydefault) == null) ? false : wyk.isChecked();
        DappDetailBean dappDetailBean = this.AhwBna;
        if (dappDetailBean == null || (name = dappDetailBean.getName()) == null) {
            name = "";
        }
        c14742drG.KWHzl(!zIsChecked, name, "security_score");
        final android.content.Context context = getContext();
        if (context != null) {
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(KWHzl().copydefault(str), this);
            final Function1 function1 = new Function1() { // from class: o.dti
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14808dsT.KWHzl(context, str, str2, this, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dtg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14808dsT.valueOf(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dtk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14808dsT.KWHzl((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dtm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14808dsT.AhwBna(function12, obj);
                }
            });
        }
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(android.content.Context context, java.lang.String str, java.lang.String str2, C14808dsT c14808dsT, ResponseData responseData) {
        C43056riA c43056riA = C43056riA.AEQbTJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("to", "DAppSecurityDetailPopVC");
        linkedHashMap.put("dappId", str);
        linkedHashMap.put("dappName", str2);
        JsonObject jsonObject = (JsonObject) responseData.getData();
        if (jsonObject != null) {
            linkedHashMap.put("result", c14808dsT.KWHzl(jsonObject));
        }
        Unit unit = Unit.INSTANCE;
        c43056riA.OLrzqt(context, "okluadiscover", "/discover/route", linkedHashMap);
        return unit;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> KWHzl(JsonObject jsonObject) {
        return (java.util.Map) new Gson().fromJson(jsonObject.toString(), (java.lang.Class) new java.util.HashMap().getClass());
    }

    public final C55251xgS AEQbTJ(java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C55251xgS c55251xgS = new C55251xgS(contextRequireContext, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(C33052mpF.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
        c55251xgS.setLayoutParams(layoutParams);
        c55251xgS.setText(str);
        return c55251xgS;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        java.lang.String name;
        java.lang.String okxDeepLink;
        java.lang.String name2;
        java.lang.String name3;
        java.lang.String name4;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.AEQbTJ = wyf;
        DappDetailBean dappDetailBean = this.AhwBna;
        if (dappDetailBean != null && (okxDeepLink = dappDetailBean.getOkxDeepLink()) != null && C33129mqd.OLrzqt((java.lang.CharSequence) okxDeepLink)) {
            DappDetailBean dappDetailBean2 = this.AhwBna;
            if (dappDetailBean2 != null && dappDetailBean2.getId() == 24441) {
                wyf.setType(5);
                int i = dLX.Dialog.valueOf;
                DappDetailBean dappDetailBean3 = this.AhwBna;
                if (dappDetailBean3 != null && (name4 = dappDetailBean3.getName()) != null) {
                    str = name4;
                }
                java.lang.String strCopydefault = C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("dappName", str)));
                wYF wyf2 = this.AEQbTJ;
                if (wyf2 != null) {
                    wyf2.setPrimaryText(strCopydefault);
                }
                C52794wYp c52794wYpCopydefault = wyf.copydefault();
                if (c52794wYpCopydefault != null) {
                    c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.dta
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C14808dsT.djBIcL(this.OLrzqt, view);
                        }
                    });
                    return;
                }
                return;
            }
            wyf.setType(7);
            int i2 = dLX.Dialog.valueOf;
            DappDetailBean dappDetailBean4 = this.AhwBna;
            if (dappDetailBean4 == null || (name2 = dappDetailBean4.getName()) == null) {
                name2 = "";
            }
            java.lang.String strCopydefault2 = C33069mpW.copydefault(this, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("dappName", name2)));
            wYF wyf3 = this.AEQbTJ;
            if (wyf3 != null) {
                wyf3.setPrimaryText(strCopydefault2);
            }
            C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setOnClickListener(new View.OnClickListener() { // from class: o.dtc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C14808dsT.valueOf(this.OLrzqt, view);
                    }
                });
            }
            int i3 = dLX.Dialog.gEmmrt;
            DappDetailBean dappDetailBean5 = this.AhwBna;
            if (dappDetailBean5 != null && (name3 = dappDetailBean5.getName()) != null) {
                str = name3;
            }
            wyf.setSecondaryText(C33069mpW.copydefault(this, i3, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("dappName", str))));
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.dtj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C14808dsT.AYXKKw(this.KWHzl, view);
                    }
                });
                return;
            }
            return;
        }
        wyf.setType(5);
        int i4 = dLX.Dialog.QfsBiF;
        DappDetailBean dappDetailBean6 = this.AhwBna;
        if (dappDetailBean6 != null && (name = dappDetailBean6.getName()) != null) {
            str = name;
        }
        java.lang.String strCopydefault3 = C33069mpW.copydefault(this, i4, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("dappName", str)));
        wYF wyf4 = this.AEQbTJ;
        if (wyf4 != null) {
            wyf4.setPrimaryText(strCopydefault3);
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setOnClickListener(new View.OnClickListener() { // from class: o.dtf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C14808dsT.AhwBna(this.copydefault, view);
                }
            });
        }
    }

    public static final void djBIcL(C14808dsT c14808dsT, android.view.View view) {
        java.lang.String name;
        wYK wyk;
        java.lang.String okxDeepLink;
        c14808dsT.dismissAllowingStateLoss();
        Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2 = c14808dsT.AYXKKw;
        java.lang.String str = "";
        if (function2 != null) {
            boolean z = c14808dsT.valueOf;
            DappDetailBean dappDetailBean = c14808dsT.AhwBna;
            if (dappDetailBean == null || (okxDeepLink = dappDetailBean.getOkxDeepLink()) == null) {
                okxDeepLink = "";
            }
            function2.invoke(java.lang.Boolean.valueOf(z), okxDeepLink);
        }
        C14742drG c14742drG = C14742drG.KWHzl;
        AbstractC13474dMr abstractC13474dMr = c14808dsT.copydefault;
        boolean zIsChecked = (abstractC13474dMr == null || (wyk = abstractC13474dMr.copydefault) == null) ? false : wyk.isChecked();
        DappDetailBean dappDetailBean2 = c14808dsT.AhwBna;
        if (dappDetailBean2 != null && (name = dappDetailBean2.getName()) != null) {
            str = name;
        }
        c14742drG.KWHzl(!zIsChecked, str, "go_to_app");
    }

    public static final void valueOf(C14808dsT c14808dsT, android.view.View view) {
        java.lang.String name;
        wYK wyk;
        java.lang.String okxDeepLink;
        c14808dsT.dismissAllowingStateLoss();
        Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2 = c14808dsT.AYXKKw;
        java.lang.String str = "";
        if (function2 != null) {
            boolean z = c14808dsT.valueOf;
            DappDetailBean dappDetailBean = c14808dsT.AhwBna;
            if (dappDetailBean == null || (okxDeepLink = dappDetailBean.getOkxDeepLink()) == null) {
                okxDeepLink = "";
            }
            function2.invoke(java.lang.Boolean.valueOf(z), okxDeepLink);
        }
        C14742drG c14742drG = C14742drG.KWHzl;
        AbstractC13474dMr abstractC13474dMr = c14808dsT.copydefault;
        boolean zIsChecked = (abstractC13474dMr == null || (wyk = abstractC13474dMr.copydefault) == null) ? false : wyk.isChecked();
        DappDetailBean dappDetailBean2 = c14808dsT.AhwBna;
        if (dappDetailBean2 != null && (name = dappDetailBean2.getName()) != null) {
            str = name;
        }
        c14742drG.KWHzl(!zIsChecked, str, "go_to_app");
    }

    public static final void AYXKKw(C14808dsT c14808dsT, android.view.View view) {
        java.lang.String name;
        wYK wyk;
        c14808dsT.dismissAllowingStateLoss();
        Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2 = c14808dsT.AYXKKw;
        java.lang.String str = "";
        if (function2 != null) {
            function2.invoke(java.lang.Boolean.valueOf(c14808dsT.valueOf), "");
        }
        C14742drG c14742drG = C14742drG.KWHzl;
        AbstractC13474dMr abstractC13474dMr = c14808dsT.copydefault;
        boolean zIsChecked = (abstractC13474dMr == null || (wyk = abstractC13474dMr.copydefault) == null) ? false : wyk.isChecked();
        DappDetailBean dappDetailBean = c14808dsT.AhwBna;
        if (dappDetailBean != null && (name = dappDetailBean.getName()) != null) {
            str = name;
        }
        c14742drG.KWHzl(!zIsChecked, str, "go_to_website");
    }

    public static final void AhwBna(C14808dsT c14808dsT, android.view.View view) {
        java.lang.String name;
        wYK wyk;
        c14808dsT.dismissAllowingStateLoss();
        Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2 = c14808dsT.AYXKKw;
        java.lang.String str = "";
        if (function2 != null) {
            function2.invoke(java.lang.Boolean.valueOf(c14808dsT.valueOf), "");
        }
        C14742drG c14742drG = C14742drG.KWHzl;
        AbstractC13474dMr abstractC13474dMr = c14808dsT.copydefault;
        boolean zIsChecked = (abstractC13474dMr == null || (wyk = abstractC13474dMr.copydefault) == null) ? false : wyk.isChecked();
        DappDetailBean dappDetailBean = c14808dsT.AhwBna;
        if (dappDetailBean != null && (name = dappDetailBean.getName()) != null) {
            str = name;
        }
        c14742drG.KWHzl(!zIsChecked, str, "go_to_website");
    }

    public final void EZpvd(java.util.List<DappChains> list) {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        android.widget.LinearLayout linearLayout3;
        AbstractC13474dMr abstractC13474dMr = this.copydefault;
        if (abstractC13474dMr != null && (linearLayout3 = abstractC13474dMr.KWHzl) != null) {
            linearLayout3.removeAllViews();
        }
        if (list != null) {
            int i = 0;
            for (DappChains dappChains : list) {
                if (i == 10) {
                    android.widget.TextView textView = new android.widget.TextView(requireContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.rightMargin = C33052mpF.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
                    textView.setText(Marker.ANY_NON_NULL_MARKER + InterfaceC9850bdP.StateListAnimator.formatToString$default((InterfaceC9850bdP) C43251rlk.copydefault(InterfaceC9850bdP.class), pTB.OLrzqt(java.lang.Integer.valueOf(list.size() - 10)), false, null, null, 14, null));
                    textView.setGravity(17);
                    textView.setLayoutParams(layoutParams);
                    textView.setTextSize(12.0f);
                    textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dff));
                    textView.setTypeface(C55051xce.OLrzqt.valueOf());
                    AbstractC13474dMr abstractC13474dMr2 = this.copydefault;
                    if (abstractC13474dMr2 == null || (linearLayout = abstractC13474dMr2.KWHzl) == null) {
                        return;
                    }
                    linearLayout.addView(textView);
                    return;
                }
                i++;
                android.widget.ImageView imageView = new android.widget.ImageView(requireContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C33052mpF.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), C33052mpF.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
                layoutParams2.rightMargin = C33052mpF.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
                imageView.setLayoutParams(layoutParams2);
                C13147dAo.EZpvd(imageView, dappChains, C33052mpF.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
                AbstractC13474dMr abstractC13474dMr3 = this.copydefault;
                if (abstractC13474dMr3 != null && (linearLayout2 = abstractC13474dMr3.KWHzl) != null) {
                    linearLayout2.addView(imageView);
                }
            }
        }
    }

    public final void AEQbTJ(java.util.List<DappDetailBean.SocialMedia> list) {
        android.widget.LinearLayout linearLayout;
        java.lang.String socialMediaDayLogo;
        android.widget.LinearLayout linearLayout2;
        android.widget.LinearLayout linearLayout3;
        AbstractC13474dMr abstractC13474dMr = this.copydefault;
        if (abstractC13474dMr != null && (linearLayout3 = abstractC13474dMr.ejfBZ) != null) {
            linearLayout3.removeAllViews();
        }
        if (list != null) {
            int i = 0;
            for (final DappDetailBean.SocialMedia socialMedia : list) {
                if (i == 8) {
                    android.widget.TextView textView = new android.widget.TextView(requireContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.rightMargin = C33052mpF.dpInt$default(10, (android.content.Context) null, 1, (java.lang.Object) null);
                    textView.setText(Marker.ANY_NON_NULL_MARKER + InterfaceC9850bdP.StateListAnimator.formatToString$default((InterfaceC9850bdP) C43251rlk.copydefault(InterfaceC9850bdP.class), pTB.OLrzqt(java.lang.Integer.valueOf(list.size() - 8)), false, null, null, 14, null));
                    textView.setGravity(17);
                    textView.setLayoutParams(layoutParams);
                    textView.setTextSize(12.0f);
                    textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dff));
                    textView.setTypeface(C55051xce.OLrzqt.valueOf());
                    AbstractC13474dMr abstractC13474dMr2 = this.copydefault;
                    if (abstractC13474dMr2 == null || (linearLayout = abstractC13474dMr2.ejfBZ) == null) {
                        return;
                    }
                    linearLayout.addView(textView);
                    return;
                }
                i++;
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(requireContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C33052mpF.dpInt$default(28, (android.content.Context) null, 1, (java.lang.Object) null), C33052mpF.dpInt$default(28, (android.content.Context) null, 1, (java.lang.Object) null));
                layoutParams2.rightMargin = C33052mpF.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
                frameLayout.setLayoutParams(layoutParams2);
                android.widget.ImageView imageView = new android.widget.ImageView(requireContext());
                frameLayout.addView(imageView);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C33052mpF.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), C33052mpF.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
                layoutParams3.gravity = 17;
                imageView.setLayoutParams(layoutParams3);
                frameLayout.setBackgroundResource(dLX.ActionBar.OLrzqt);
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: o.dsV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C14808dsT.AEQbTJ(this.EZpvd, socialMedia, view);
                    }
                });
                if (C33492mxV.OLrzqt()) {
                    socialMediaDayLogo = socialMedia.getSocialMediaNightLogo();
                } else {
                    socialMediaDayLogo = socialMedia.getSocialMediaDayLogo();
                }
                java.lang.String str = socialMediaDayLogo;
                android.content.Context context = getContext();
                if (context != null) {
                    C14867dtZ c14867dtZ = C14867dtZ.AEQbTJ;
                    ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
                    Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
                    C14867dtZ.loadCropUrl$default(c14867dtZ, componentCallbacks2C5333NrAEQbTJ, str, C33052mpF.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), 0, 4, null).EZpvd(imageView);
                }
                AbstractC13474dMr abstractC13474dMr3 = this.copydefault;
                if (abstractC13474dMr3 != null && (linearLayout2 = abstractC13474dMr3.ejfBZ) != null) {
                    linearLayout2.addView(frameLayout);
                }
            }
        }
    }

    public static final void AEQbTJ(C14808dsT c14808dsT, DappDetailBean.SocialMedia socialMedia, android.view.View view) {
        java.lang.String name;
        java.lang.String name2;
        java.lang.String url;
        wYK wyk;
        if (c14808dsT.getContext() != null) {
            C14742drG c14742drG = C14742drG.KWHzl;
            AbstractC13474dMr abstractC13474dMr = c14808dsT.copydefault;
            boolean zIsChecked = (abstractC13474dMr == null || (wyk = abstractC13474dMr.copydefault) == null) ? false : wyk.isChecked();
            DappDetailBean dappDetailBean = c14808dsT.AhwBna;
            java.lang.String str = "";
            if (dappDetailBean == null || (name = dappDetailBean.getName()) == null) {
                name = "";
            }
            c14742drG.KWHzl(!zIsChecked, name, "social_media");
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", socialMedia.getLink()), C56390yDp.OLrzqt("is_skip_storage_permission", java.lang.Boolean.TRUE));
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            android.content.Context contextRequireContext = c14808dsT.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            WebActivity.TaskDescription.openPage$default(taskDescription, contextRequireContext, bundleBundleOf, null, 4, null);
            DappDetailBean dappDetailBean2 = c14808dsT.AhwBna;
            if (dappDetailBean2 == null || (name2 = dappDetailBean2.getName()) == null) {
                name2 = "";
            }
            java.lang.String socialMediaName = socialMedia.getSocialMediaName();
            if (socialMediaName == null) {
                socialMediaName = "";
            }
            DappDetailBean dappDetailBean3 = c14808dsT.AhwBna;
            if (dappDetailBean3 != null && (url = dappDetailBean3.getUrl()) != null) {
                str = url;
            }
            c14742drG.AEQbTJ(name2, socialMediaName, str);
        }
    }
}
