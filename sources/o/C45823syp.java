package o;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.viewmodel.RatingSubmitViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.syp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45823syp extends AbstractC32996moC {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final int AEQbTJ = C47315tni.ActionBar.QKVWgx;
    public AbstractC47339toF EZpvd;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.syp$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GetSupportRatingBean.AppLayoutType.values().length];
            try {
                iArr[GetSupportRatingBean.AppLayoutType.FullScreen.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[GetSupportRatingBean.AppLayoutType.HalfScreenRedirectToFullScreen.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[GetSupportRatingBean.AppLayoutType.HalfScreen.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public C45823syp() {
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RatingSubmitViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitSuccessFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitSuccessFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitSuccessFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.syp$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.syp.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C45823syp copydefault() {
            return new C45823syp();
        }
    }

    private final RatingSubmitViewModel EZpvd() {
        return (RatingSubmitViewModel) this.copydefault.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47339toF abstractC47339toFOLrzqt = AbstractC47339toF.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47339toFOLrzqt, "");
        this.EZpvd = abstractC47339toFOLrzqt;
        android.view.View root = abstractC47339toFOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.EZpvd = null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47339toF abstractC47339toF = this.EZpvd;
        if (abstractC47339toF != null) {
            C55178xez c55178xez = abstractC47339toF.copydefault;
            c55178xez.AEQbTJ().setVisibility(8);
            c55178xez.OLrzqt().setVisibility(8);
            GetSupportRatingBean.AppLayoutType appLayoutTypeAYXKKw = EZpvd().AYXKKw();
            int i = appLayoutTypeAYXKKw == null ? -1 : TaskDescription.AEQbTJ[appLayoutTypeAYXKKw.ordinal()];
            if (i == 1 || i == 2) {
                android.view.View root = abstractC47339toF.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                if (layoutParams != null) {
                    android.content.res.Resources resources = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "");
                    layoutParams.height = C55302xhQ.AEQbTJ(resources);
                    root.setLayoutParams(layoutParams);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else if (i == 3) {
                android.view.View root2 = abstractC47339toF.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "");
                ViewGroup.LayoutParams layoutParams2 = root2.getLayoutParams();
                if (layoutParams2 != null) {
                    android.content.res.Resources resources2 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "");
                    layoutParams2.height = yII.EZpvd(((double) C55302xhQ.AEQbTJ(resources2)) * 0.7d);
                    root2.setLayoutParams(layoutParams2);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        view.post(new java.lang.Runnable() { // from class: o.syo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45823syp.OLrzqt(this.OLrzqt);
            }
        });
    }

    public static final void OLrzqt(C45823syp c45823syp) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45823syp, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
