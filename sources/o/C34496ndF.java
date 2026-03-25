package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.dexkline.dexlogic.main.market.bean.EarlyBuyerInfoData;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.dexkline.market.features.overview.domain.Overview;
import com.okinc.dexkline.market.features.overview.ui.OverviewViewModel;
import com.okinc.dexkline.market.features.risk_control.ui.RiskControlViewModel;
import com.okinc.dexkline.market.features.tag.domain.TagMeta;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$findInOrCreate$1;
import com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$findOrCreate$1;
import com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$generateStaticTagData$1;
import com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheetParams;
import com.okinc.dexkline.market.features.tag.ui.TagViewModel;
import java.math.BigDecimal;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32318mXo;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ndF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34496ndF extends wXX {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public LatestMarketInfoBean AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public oNP KWHzl;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;
    public Overview valueOf;
    public final InterfaceC56387yDm values;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ndI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34496ndF.ejfBZ(this.OLrzqt);
        }
    });
    public TagWrapper isConnected = new TagWrapper(null, null, 3, null);
    public TagWrapper AEQbTJ = new TagWrapper(null, null, 3, null);
    public TagWrapper gEmmrt = new TagWrapper(null, null, 3, null);
    public TagWrapper DbNXlk = new TagWrapper(null, null, 3, null);
    public TagWrapper EZpvd = new TagWrapper(null, null, 3, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String KWHzl() {
        return "--";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault() {
        return "--";
    }

    public C34496ndF() {
        final Function0 function0 = null;
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TagViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$special$$inlined$activityViewModels$default$3
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$special$$inlined$activityViewModels$default$6
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RiskControlViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$special$$inlined$activityViewModels$default$9
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheet$special$$inlined$activityViewModels$default$12
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

    public final TagExplanationBottomSheetParams djBIcL() {
        return (TagExplanationBottomSheetParams) this.AYXKKw.getValue();
    }

    public static final TagExplanationBottomSheetParams ejfBZ(C34496ndF c34496ndF) {
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams;
        android.os.Bundle arguments = c34496ndF.getArguments();
        return (arguments == null || (tagExplanationBottomSheetParams = (TagExplanationBottomSheetParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.params", TagExplanationBottomSheetParams.class))) == null) ? new TagExplanationBottomSheetParams(null, false, 3, null) : tagExplanationBottomSheetParams;
    }

    private final TagViewModel values() {
        return (TagViewModel) this.AkhnZx.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketCoinDetailViewModel AhwBna() {
        return (MarketCoinDetailViewModel) this.copydefault.getValue();
    }

    private final RiskControlViewModel isConnected() {
        return (RiskControlViewModel) this.values.getValue();
    }

    private final OverviewViewModel valueOf() {
        return (OverviewViewModel) this.djBIcL.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C35964oKf.Fragment.DcMfJKsgNvtZ));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = oNP.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value = AhwBna().AhwBna().getValue();
        this.AhwBna = value != null ? value.getSecond() : null;
        this.valueOf = valueOf().AEQbTJ().getValue().EZpvd();
        AYXKKw();
        OLrzqt();
        gEmmrt();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.KWHzl = null;
        super.onDestroyView();
    }

    public final void AYXKKw() {
        android.widget.LinearLayout linearLayout;
        oNP onp = this.KWHzl;
        if (onp == null || (linearLayout = onp.OLrzqt) == null || !isConnected().AEQbTJ().getValue().booleanValue()) {
            return;
        }
        displayTag$default(this, linearLayout, C34498ndH.OLrzqt.OLrzqt(), null, 4, null);
    }

    public final void OLrzqt() {
        android.widget.LinearLayout linearLayout;
        oNP onp = this.KWHzl;
        if (onp == null || (linearLayout = onp.OLrzqt) == null) {
            return;
        }
        java.util.List<TagWrapper> value = AhwBna().valueOf().getValue();
        if (value == null) {
            value = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : value) {
            TagWrapper tagWrapper = (TagWrapper) obj;
            if (!Intrinsics.EZpvd((java.lang.Object) tagWrapper.KWHzl(), (java.lang.Object) "communityRecognized") && !Intrinsics.EZpvd((java.lang.Object) tagWrapper.KWHzl(), (java.lang.Object) "topHolder") && !Intrinsics.EZpvd((java.lang.Object) tagWrapper.KWHzl(), (java.lang.Object) "suspicious") && !Intrinsics.EZpvd((java.lang.Object) tagWrapper.KWHzl(), (java.lang.Object) "sniper") && !Intrinsics.EZpvd((java.lang.Object) tagWrapper.KWHzl(), (java.lang.Object) "bundle") && !Intrinsics.EZpvd((java.lang.Object) tagWrapper.KWHzl(), (java.lang.Object) "dev") && !Intrinsics.EZpvd((java.lang.Object) tagWrapper.KWHzl(), (java.lang.Object) "lowLiquidity") && !C34536ndt.OLrzqt.copydefault().contains(tagWrapper.KWHzl())) {
                arrayList.add(obj);
            }
        }
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        Overview overview = this.valueOf;
        java.lang.Object obj2 = null;
        TagWrapper tagWrapperAEQbTJ = C34607nfL.AEQbTJ(overview != null ? overview.EZpvd() : null);
        if (tagWrapperAEQbTJ != null) {
            listFJNWhG.add(tagWrapperAEQbTJ);
        }
        java.util.Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) next).KWHzl(), (java.lang.Object) "lowLiquidity")) {
                obj2 = next;
                break;
            }
        }
        TagWrapper tagWrapper2 = (TagWrapper) obj2;
        if (tagWrapper2 != null) {
            listFJNWhG.add(tagWrapper2);
        }
        java.util.Iterator it2 = listFJNWhG.iterator();
        while (it2.hasNext()) {
            displayTag$default(this, linearLayout, (TagWrapper) it2.next(), null, null, null, null, 60, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.ndF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void displayTag$default(C34496ndF c34496ndF, android.widget.LinearLayout linearLayout, TagWrapper tagWrapper, android.graphics.drawable.Drawable drawable, java.lang.Integer num, android.text.SpannedString spannedString, Function0 function0, int i, java.lang.Object obj) {
        c34496ndF.copydefault(linearLayout, tagWrapper, (i & 4) != 0 ? null : drawable, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : spannedString, (i & 32) != 0 ? null : function0);
    }

    public final void copydefault(android.widget.LinearLayout linearLayout, TagWrapper tagWrapper, android.graphics.drawable.Drawable drawable, java.lang.Integer num, android.text.SpannedString spannedString, Function0<Unit> function0) {
        java.lang.String strAYXKKw;
        java.lang.String str;
        C36077oOk c36077oOkKWHzl = C36077oOk.KWHzl(getLayoutInflater(), linearLayout, false);
        Intrinsics.checkNotNullExpressionValue(c36077oOkKWHzl, "");
        pFN pfn = pFN.OLrzqt;
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) pfn.AEQbTJ(), (java.lang.Object) "kline_dark");
        boolean zValueOf = pfn.valueOf();
        if (zEZpvd) {
            if (zValueOf) {
                TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
                if (tagMetaAEQbTJ != null) {
                    strAYXKKw = tagMetaAEQbTJ.AEQbTJ();
                    str = strAYXKKw;
                }
                str = null;
            } else {
                TagMeta tagMetaAEQbTJ2 = tagWrapper.AEQbTJ();
                if (tagMetaAEQbTJ2 != null) {
                    strAYXKKw = tagMetaAEQbTJ2.gEmmrt();
                    str = strAYXKKw;
                }
                str = null;
            }
        } else if (zValueOf) {
            TagMeta tagMetaAEQbTJ3 = tagWrapper.AEQbTJ();
            if (tagMetaAEQbTJ3 != null) {
                strAYXKKw = tagMetaAEQbTJ3.copydefault();
                str = strAYXKKw;
            }
            str = null;
        } else {
            TagMeta tagMetaAEQbTJ4 = tagWrapper.AEQbTJ();
            if (tagMetaAEQbTJ4 != null) {
                strAYXKKw = tagMetaAEQbTJ4.AYXKKw();
                str = strAYXKKw;
            }
            str = null;
        }
        TagMeta tagMetaAEQbTJ5 = tagWrapper.AEQbTJ();
        if (tagMetaAEQbTJ5 != null && tagMetaAEQbTJ5.djBIcL()) {
            android.widget.ImageView imageView = c36077oOkKWHzl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            if (str == null) {
                str = "";
            }
            mUL.AEQbTJ(imageView, str);
        } else {
            android.widget.ImageView imageView2 = c36077oOkKWHzl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C33054mpH.loadUrl$default(imageView2, str, null, 0, 0, 14, null);
        }
        if (num != null) {
            c36077oOkKWHzl.AEQbTJ.setImageTintList(android.content.res.ColorStateList.valueOf(num.intValue()));
        }
        android.text.SpannedString spannedStringCopydefault = spannedString == null ? copydefault(tagWrapper) : spannedString;
        android.widget.TextView textView = c36077oOkKWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(spannedStringCopydefault.length() > 0 ? 0 : 8);
        c36077oOkKWHzl.AhwBna.setText(spannedStringCopydefault);
        TagMeta tagMetaAEQbTJ6 = tagWrapper.AEQbTJ();
        java.lang.String strKWHzl = tagMetaAEQbTJ6 != null ? tagMetaAEQbTJ6.KWHzl() : null;
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        android.widget.TextView textView2 = c36077oOkKWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(strKWHzl.length() > 0 ? 0 : 8);
        c36077oOkKWHzl.EZpvd.setText(strKWHzl);
        AppCompatImageView appCompatImageView = c36077oOkKWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(function0 == null ? 8 : 0);
        if (function0 != null) {
            ConstraintLayout root = c36077oOkKWHzl.getRoot();
            root.setOnClickListener(new StateListAnimator(root, 1000L, function0));
        }
        linearLayout.addView(c36077oOkKWHzl.getRoot());
    }

    /* JADX INFO: renamed from: o.ndF$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.ndF$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ndF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void displayTag$default(C34496ndF c34496ndF, android.widget.LinearLayout linearLayout, C34604nfI c34604nfI, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        c34496ndF.OLrzqt(linearLayout, c34604nfI, function0);
    }

    public final void OLrzqt(android.widget.LinearLayout linearLayout, C34604nfI c34604nfI, Function0<Unit> function0) {
        C36077oOk c36077oOkKWHzl = C36077oOk.KWHzl(getLayoutInflater(), linearLayout, false);
        Intrinsics.checkNotNullExpressionValue(c36077oOkKWHzl, "");
        c36077oOkKWHzl.AEQbTJ.setImageDrawable(c34604nfI.copydefault());
        android.text.SpannedString spannedStringGEmmrt = c34604nfI.gEmmrt();
        android.widget.TextView textView = c36077oOkKWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(spannedStringGEmmrt.length() > 0 ? 0 : 8);
        c36077oOkKWHzl.AhwBna.setText(spannedStringGEmmrt);
        java.lang.String strAEQbTJ = c34604nfI.AEQbTJ();
        android.widget.TextView textView2 = c36077oOkKWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(strAEQbTJ.length() > 0 ? 0 : 8);
        c36077oOkKWHzl.EZpvd.setText(strAEQbTJ);
        AppCompatImageView appCompatImageView = c36077oOkKWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(function0 == null ? 8 : 0);
        if (function0 != null) {
            ConstraintLayout root = c36077oOkKWHzl.getRoot();
            root.setOnClickListener(new ActionBar(root, 1000L, function0));
        }
        linearLayout.addView(c36077oOkKWHzl.getRoot());
    }

    public final android.text.SpannedString copydefault(TagWrapper tagWrapper) {
        C34498ndH c34498ndH = C34498ndH.OLrzqt;
        pFN pfn = pFN.OLrzqt;
        int textColor$default = C34498ndH.getTextColor$default(c34498ndH, tagWrapper, Intrinsics.EZpvd((java.lang.Object) pfn.AEQbTJ(), (java.lang.Object) "kline_dark"), null, java.lang.Boolean.valueOf(pfn.valueOf()), 4, null);
        TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
        java.lang.String strDbNXlk = tagMetaAEQbTJ != null ? tagMetaAEQbTJ.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) strDbNXlk);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(textColor$default), 0, strDbNXlk.length(), 33);
        return new android.text.SpannedString(spannableStringBuilder);
    }

    public final void KWHzl(TagWrapper tagWrapper) {
        java.lang.String top10HoldAmountPercentage;
        int iCopydefault;
        android.widget.LinearLayout linearLayout;
        LatestMarketInfoBean latestMarketInfoBean = this.AhwBna;
        if (latestMarketInfoBean == null || (top10HoldAmountPercentage = latestMarketInfoBean.getTop10HoldAmountPercentage()) == null) {
            top10HoldAmountPercentage = "--";
        }
        java.lang.String str = top10HoldAmountPercentage;
        if (C33129mqd.djBIcL(str) >= 80.0f) {
            iCopydefault = mUM.copydefault(C52761wXj.ActionBar.OuxcSI);
        } else {
            iCopydefault = C33129mqd.djBIcL(str) > 0.0f ? mUM.copydefault(C52761wXj.ActionBar.DCUTEI) : mUM.copydefault(C52761wXj.Activity.fdOvFl);
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) EZpvd(tagWrapper.AEQbTJ(), java.lang.Integer.valueOf(iCopydefault)));
        spannableStringBuilder.append((java.lang.CharSequence) C34389nbE.copydefault(C32163mRv.formatPercentWithoutSymbol$default(str, false, 0, null, false, null, 30, null), iCopydefault));
        android.text.SpannedString spannedString = new android.text.SpannedString(spannableStringBuilder);
        oNP onp = this.KWHzl;
        if (onp == null || (linearLayout = onp.OLrzqt) == null) {
            return;
        }
        displayTag$default(this, linearLayout, tagWrapper, null, java.lang.Integer.valueOf(iCopydefault), spannedString, null, 36, null);
    }

    public final void EZpvd(TagWrapper tagWrapper) {
        int iCopydefault;
        android.widget.LinearLayout linearLayout;
        java.lang.Float fOLrzqt = tagWrapper.EZpvd().KWHzl().OLrzqt();
        java.lang.String strKWHzl = C34663ngO.KWHzl(fOLrzqt != null ? fOLrzqt.toString() : null, new Function0() { // from class: o.ndE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34496ndF.AkhnZx(this.EZpvd);
            }
        });
        if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "--") || C33129mqd.djBIcL(strKWHzl) == 0.0f) {
            iCopydefault = mUM.copydefault(C52761wXj.Activity.fdOvFl);
        } else if (C33129mqd.djBIcL(strKWHzl) >= 0.1f) {
            iCopydefault = mUM.copydefault(C52761wXj.ActionBar.OuxcSI);
        } else if (C33129mqd.djBIcL(strKWHzl) > 0.01f) {
            iCopydefault = mUM.copydefault(C52761wXj.Activity.gdmIOq);
        } else {
            iCopydefault = C33129mqd.djBIcL(strKWHzl) > 0.0f ? mUM.copydefault(C52761wXj.ActionBar.DCUTEI) : mUM.copydefault(C52761wXj.Activity.fdOvFl);
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) EZpvd(tagWrapper.AEQbTJ(), java.lang.Integer.valueOf(iCopydefault)));
        spannableStringBuilder.append((java.lang.CharSequence) C34389nbE.copydefault(C32163mRv.formatPercentWithoutSymbol$default(strKWHzl, false, 0, new BigDecimal(0.01d), false, null, 26, null), iCopydefault));
        android.text.SpannedString spannedString = new android.text.SpannedString(spannableStringBuilder);
        oNP onp = this.KWHzl;
        if (onp == null || (linearLayout = onp.OLrzqt) == null) {
            return;
        }
        displayTag$default(this, linearLayout, tagWrapper, null, java.lang.Integer.valueOf(iCopydefault), spannedString, null, 36, null);
    }

    public static final java.lang.String AkhnZx(C34496ndF c34496ndF) {
        Overview overview = c34496ndF.valueOf;
        return C34663ngO.AEQbTJ(overview != null ? overview.valueOf() : null, new Function0() { // from class: o.ndD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34496ndF.copydefault();
            }
        });
    }

    public final void AEQbTJ(TagWrapper tagWrapper) {
        int iCopydefault;
        android.widget.LinearLayout linearLayout;
        EarlyBuyerInfoData earlyBuyerStatisticsInfo;
        EarlyBuyerInfoData earlyBuyerStatisticsInfo2;
        LatestMarketInfoBean latestMarketInfoBean = this.AhwBna;
        Function0 function0 = null;
        int iAhwBna = C33129mqd.AhwBna((latestMarketInfoBean == null || (earlyBuyerStatisticsInfo2 = latestMarketInfoBean.getEarlyBuyerStatisticsInfo()) == null) ? null : earlyBuyerStatisticsInfo2.getEarlyBuyerHoldAmount());
        LatestMarketInfoBean latestMarketInfoBean2 = this.AhwBna;
        int iAhwBna2 = C33129mqd.AhwBna((latestMarketInfoBean2 == null || (earlyBuyerStatisticsInfo = latestMarketInfoBean2.getEarlyBuyerStatisticsInfo()) == null) ? null : earlyBuyerStatisticsInfo.getTotalEarlyBuyerAmount());
        if (iAhwBna > 0) {
            iCopydefault = mUM.copydefault(C52761wXj.Activity.gdmIOq);
        } else {
            iCopydefault = mUM.copydefault(C52761wXj.Activity.fdOvFl);
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) EZpvd(tagWrapper.AEQbTJ(), java.lang.Integer.valueOf(iCopydefault)));
        C34498ndH c34498ndH = C34498ndH.OLrzqt;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        spannableStringBuilder.append((java.lang.CharSequence) c34498ndH.EZpvd(contextRequireContext, iAhwBna2, iAhwBna));
        android.text.SpannedString spannedString = new android.text.SpannedString(spannableStringBuilder);
        oNP onp = this.KWHzl;
        if (onp == null || (linearLayout = onp.OLrzqt) == null) {
            return;
        }
        if (DbNXlk() && iAhwBna2 > 0) {
            function0 = new Function0() { // from class: o.ndJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34496ndF.isConnected(this.KWHzl);
                }
            };
        }
        displayTag$default(this, linearLayout, tagWrapper, null, java.lang.Integer.valueOf(iCopydefault), spannedString, function0, 4, null);
    }

    public static final Unit isConnected(C34496ndF c34496ndF) {
        c34496ndF.AkhnZx();
        return Unit.INSTANCE;
    }

    public final void OLrzqt(TagWrapper tagWrapper) {
        int iCopydefault;
        android.widget.LinearLayout linearLayout;
        java.lang.Float fAEQbTJ = tagWrapper.EZpvd().KWHzl().AEQbTJ();
        java.lang.String strKWHzl = C34663ngO.KWHzl(fAEQbTJ != null ? fAEQbTJ.toString() : null, new Function0() { // from class: o.ndK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34496ndF.DbNXlk(this.OLrzqt);
            }
        });
        if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "--")) {
            iCopydefault = mUM.copydefault(C52761wXj.Activity.fdOvFl);
        } else if (C33129mqd.djBIcL(strKWHzl) < 0.1f) {
            iCopydefault = mUM.copydefault(C52761wXj.ActionBar.DCUTEI);
        } else {
            iCopydefault = C33129mqd.djBIcL(strKWHzl) >= 0.1f ? -mUM.copydefault(C52761wXj.ActionBar.OuxcSI) : mUM.copydefault(C52761wXj.Activity.fdOvFl);
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) EZpvd(tagWrapper.AEQbTJ(), java.lang.Integer.valueOf(iCopydefault)));
        spannableStringBuilder.append((java.lang.CharSequence) C34389nbE.copydefault(C32163mRv.formatPercentWithoutSymbol$default(strKWHzl, true, 0, null, false, null, 30, null), iCopydefault));
        android.text.SpannedString spannedString = new android.text.SpannedString(spannableStringBuilder);
        oNP onp = this.KWHzl;
        if (onp == null || (linearLayout = onp.OLrzqt) == null) {
            return;
        }
        displayTag$default(this, linearLayout, tagWrapper, null, java.lang.Integer.valueOf(iCopydefault), spannedString, null, 36, null);
    }

    public static final java.lang.String DbNXlk(C34496ndF c34496ndF) {
        Overview overview = c34496ndF.valueOf;
        return C34663ngO.AEQbTJ(overview != null ? overview.copydefault() : null, new Function0() { // from class: o.ndG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34496ndF.KWHzl();
            }
        });
    }

    private final void AkhnZx() {
        java.lang.String strIsSupportHolderExpandData;
        C32318mXo.Application application = C32318mXo.Companion;
        java.lang.String strAEQbTJ = djBIcL().AEQbTJ();
        LatestMarketInfoBean latestMarketInfoBean = this.AhwBna;
        java.lang.String tokenContractAddress = latestMarketInfoBean != null ? latestMarketInfoBean.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        boolean zKWHzl = djBIcL().KWHzl();
        LatestMarketInfoBean latestMarketInfoBean2 = this.AhwBna;
        boolean z = (latestMarketInfoBean2 == null || (strIsSupportHolderExpandData = latestMarketInfoBean2.isSupportHolderExpandData()) == null || !C34582nem.KWHzl(strIsSupportHolderExpandData)) ? false : true;
        LatestMarketInfoBean latestMarketInfoBean3 = this.AhwBna;
        java.lang.String chainName = latestMarketInfoBean3 != null ? latestMarketInfoBean3.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        LatestMarketInfoBean latestMarketInfoBean4 = this.AhwBna;
        java.lang.String tokenName = latestMarketInfoBean4 != null ? latestMarketInfoBean4.getTokenName() : null;
        C32318mXo c32318mXoCopydefault = application.copydefault(strAEQbTJ, tokenContractAddress, zKWHzl, z, tokenName == null ? "" : tokenName, chainName, "header");
        c32318mXoCopydefault.KWHzl(new Function0() { // from class: o.ndB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34496ndF.values(this.KWHzl);
            }
        });
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c32318mXoCopydefault.show(parentFragmentManager);
    }

    public static final Unit values(C34496ndF c34496ndF) {
        c34496ndF.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    private final boolean DbNXlk() {
        return C35202nqq.OLrzqt.AEQbTJ("dex_market_sniper");
    }

    public final void gEmmrt() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TagExplanationBottomSheet$generateStaticTagData$1(this, null), 3, null);
    }

    public final android.text.SpannedString EZpvd(TagMeta tagMeta, java.lang.Integer num) {
        if (tagMeta == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tagMeta.DbNXlk())) {
            return new android.text.SpannedString("");
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) C34389nbE.copydefault(tagMeta.DbNXlk() + ": ", num != null ? num.intValue() : mUM.copydefault(C52761wXj.Activity.fdOvFl)));
        return new android.text.SpannedString(spannableStringBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<TagWrapper> list, java.lang.String str, Continuation<? super TagWrapper> continuation) throws java.lang.Throwable {
        TagExplanationBottomSheet$findOrCreate$1 tagExplanationBottomSheet$findOrCreate$1;
        java.lang.Object next;
        java.lang.Object objEZpvd;
        if (continuation instanceof TagExplanationBottomSheet$findOrCreate$1) {
            tagExplanationBottomSheet$findOrCreate$1 = (TagExplanationBottomSheet$findOrCreate$1) continuation;
            int i = tagExplanationBottomSheet$findOrCreate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagExplanationBottomSheet$findOrCreate$1.label = i - Integer.MIN_VALUE;
            } else {
                tagExplanationBottomSheet$findOrCreate$1 = new TagExplanationBottomSheet$findOrCreate$1(this, continuation);
            }
        }
        java.lang.Object obj = tagExplanationBottomSheet$findOrCreate$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagExplanationBottomSheet$findOrCreate$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) next).KWHzl(), (java.lang.Object) str)) {
                    break;
                }
            }
            TagWrapper tagWrapper = (TagWrapper) next;
            if (tagWrapper != null) {
                return tagWrapper;
            }
            TagViewModel tagViewModelValues = values();
            tagExplanationBottomSheet$findOrCreate$1.label = 1;
            objEZpvd = tagViewModelValues.EZpvd(str, tagExplanationBottomSheet$findOrCreate$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objEZpvd)) {
            objEZpvd = null;
        }
        return new TagWrapper(null, (TagMeta) objEZpvd, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.util.List<TagWrapper> list, java.util.Collection<java.lang.String> collection, java.lang.String str, Continuation<? super TagWrapper> continuation) throws java.lang.Throwable {
        TagExplanationBottomSheet$findInOrCreate$1 tagExplanationBottomSheet$findInOrCreate$1;
        java.lang.Object next;
        java.lang.Object objEZpvd;
        if (continuation instanceof TagExplanationBottomSheet$findInOrCreate$1) {
            tagExplanationBottomSheet$findInOrCreate$1 = (TagExplanationBottomSheet$findInOrCreate$1) continuation;
            int i = tagExplanationBottomSheet$findInOrCreate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagExplanationBottomSheet$findInOrCreate$1.label = i - Integer.MIN_VALUE;
            } else {
                tagExplanationBottomSheet$findInOrCreate$1 = new TagExplanationBottomSheet$findInOrCreate$1(this, continuation);
            }
        }
        java.lang.Object obj = tagExplanationBottomSheet$findInOrCreate$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagExplanationBottomSheet$findInOrCreate$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (collection.contains(((TagWrapper) next).KWHzl())) {
                    break;
                }
            }
            TagWrapper tagWrapper = (TagWrapper) next;
            if (tagWrapper != null) {
                return tagWrapper;
            }
            TagViewModel tagViewModelValues = values();
            tagExplanationBottomSheet$findInOrCreate$1.label = 1;
            objEZpvd = tagViewModelValues.EZpvd(str, tagExplanationBottomSheet$findInOrCreate$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objEZpvd)) {
            objEZpvd = null;
        }
        return new TagWrapper(null, (TagMeta) objEZpvd, 1, null);
    }

    /* JADX INFO: renamed from: o.ndF$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ndF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C34496ndF KWHzl(@NotNull TagExplanationBottomSheetParams tagExplanationBottomSheetParams) {
            Intrinsics.checkNotNullParameter(tagExplanationBottomSheetParams, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.params", tagExplanationBottomSheetParams);
            C34496ndF c34496ndF = new C34496ndF();
            c34496ndF.setArguments(bundle);
            return c34496ndF;
        }
    }
}
