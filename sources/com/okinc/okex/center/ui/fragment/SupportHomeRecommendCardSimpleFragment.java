package com.okinc.okex.center.ui.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.ui.displaymodels.RecommendCardDisplayModel;
import com.okinc.okex.center.ui.fragment.SupportHomeRecommendCardSimpleFragment;
import com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC45080siz;
import o.AbstractC47343toJ;
import o.C44901sff;
import o.C45001shZ;
import o.C45185sky;
import o.C45397soy;
import o.C47315tni;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.pTD;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class SupportHomeRecommendCardSimpleFragment extends AbstractC45080siz {
    public final InterfaceC56387yDm djBIcL;

    @yCM
    public C45397soy selfServiceUseCase;
    public AbstractC47343toJ valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.sjr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportHomeRecommendCardSimpleFragment.valueOf();
        }
    });
    public final int AYXKKw = C47315tni.ActionBar.QfsBiF;

    public void DbNXlk() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC47343toJ gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    public SupportHomeRecommendCardSimpleFragment() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SupportCenterHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.fragment.SupportHomeRecommendCardSimpleFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.fragment.SupportHomeRecommendCardSimpleFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.center.ui.fragment.SupportHomeRecommendCardSimpleFragment$special$$inlined$activityViewModels$default$3
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

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.fragment.SupportHomeRecommendCardSimpleFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final SupportHomeRecommendCardSimpleFragment AEQbTJ() {
            return new SupportHomeRecommendCardSimpleFragment();
        }
    }

    public final C45397soy AhwBna() {
        C45397soy c45397soy = this.selfServiceUseCase;
        if (c45397soy != null) {
            return c45397soy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final SupportCenterHomeViewModel AYXKKw() {
        return (SupportCenterHomeViewModel) this.djBIcL.getValue();
    }

    public final C45001shZ djBIcL() {
        return (C45001shZ) this.gEmmrt.getValue();
    }

    public static final C45001shZ valueOf() {
        C45001shZ c45001shZ = new C45001shZ();
        c45001shZ.setHasStableIds(true);
        return c45001shZ;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        values();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        RecyclerView recyclerView;
        View root;
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47343toJ abstractC47343toJ = this.valueOf;
        if (abstractC47343toJ != null && (root = abstractC47343toJ.getRoot()) != null) {
            root.setVisibility(8);
        }
        AbstractC47343toJ abstractC47343toJKWHzl = AbstractC47343toJ.KWHzl(view);
        this.valueOf = abstractC47343toJKWHzl;
        if (abstractC47343toJKWHzl == null || (recyclerView = abstractC47343toJKWHzl.KWHzl) == null) {
            return;
        }
        C45185sky.EZpvd(recyclerView, djBIcL(), new Function1() { // from class: o.sjo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportHomeRecommendCardSimpleFragment.copydefault(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        djBIcL().AEQbTJ(new TaskDescription());
    }

    public static final Unit copydefault(SupportHomeRecommendCardSimpleFragment supportHomeRecommendCardSimpleFragment, int i) {
        RecommendCardDisplayModel recommendCardDisplayModelEZpvd = supportHomeRecommendCardSimpleFragment.djBIcL().EZpvd(i);
        if (recommendCardDisplayModelEZpvd != null) {
            supportHomeRecommendCardSimpleFragment.KWHzl(recommendCardDisplayModelEZpvd);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription implements C45001shZ.Activity {
        public TaskDescription() {
        }

        @Override // o.C45001shZ.Activity
        public void OLrzqt(RecommendCardDisplayModel.VideoMeetingCardDisplayModel videoMeetingCardDisplayModel) {
            Intrinsics.checkNotNullParameter(videoMeetingCardDisplayModel, "");
            SupportHomeRecommendCardSimpleFragment.this.DbNXlk();
        }

        @Override // o.C45001shZ.Activity
        public void OLrzqt(SelfServiceToolBean selfServiceToolBean, Object obj) {
            Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
            FragmentActivity activity = SupportHomeRecommendCardSimpleFragment.this.getActivity();
            if (activity != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new SupportHomeRecommendCardSimpleFragment$initView$1$2$onSelfToolsClick$1$1(SupportHomeRecommendCardSimpleFragment.this, activity, selfServiceToolBean, obj, null), 3, null);
            }
        }

        @Override // o.C45001shZ.Activity
        public void copydefault(int i) {
            View root;
            AbstractC47343toJ abstractC47343toJGEmmrt = SupportHomeRecommendCardSimpleFragment.this.gEmmrt();
            if (abstractC47343toJGEmmrt != null && (root = abstractC47343toJGEmmrt.getRoot()) != null) {
                root.setVisibility(i == 0 ? 8 : 0);
            }
            SupportHomeRecommendCardSimpleFragment.this.OLrzqt(i);
        }
    }

    public final void KWHzl(RecommendCardDisplayModel recommendCardDisplayModel) {
        if (recommendCardDisplayModel instanceof RecommendCardDisplayModel.CommonDisplayModel) {
            C44901sff c44901sff = C44901sff.copydefault;
            RecommendCardDisplayModel.CommonDisplayModel commonDisplayModel = (RecommendCardDisplayModel.CommonDisplayModel) recommendCardDisplayModel;
            String scenario = commonDisplayModel.getSourceBean().getScenario();
            if (scenario == null) {
                scenario = "";
            }
            String dataTrackingKey = commonDisplayModel.getSourceBean().getDataTrackingKey();
            if (dataTrackingKey == null) {
                dataTrackingKey = "";
            }
            RecommendCardDisplayModel.CommonDisplayModel.CardTag statusTag = commonDisplayModel.getStatusTag();
            String text = statusTag != null ? statusTag.getText() : null;
            if (text == null) {
                text = "";
            }
            c44901sff.KWHzl(scenario, dataTrackingKey, text);
        }
        if (recommendCardDisplayModel instanceof RecommendCardDisplayModel.VideoMeetingCardDisplayModel) {
            C44901sff c44901sff2 = C44901sff.copydefault;
            String tagText = ((RecommendCardDisplayModel.VideoMeetingCardDisplayModel) recommendCardDisplayModel).getTagText();
            if (tagText == null) {
                tagText = "";
            }
            c44901sff2.KWHzl("", "", tagText);
        }
    }

    public final void OLrzqt(int i) {
        TextView textView;
        AbstractC47343toJ abstractC47343toJ = this.valueOf;
        if (abstractC47343toJ == null || (textView = abstractC47343toJ.copydefault) == null) {
            return;
        }
        textView.setText(pTD.KWHzl(this, C47315tni.StateListAnimator.copydefault, i, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, Integer.valueOf(i)))));
    }

    private final void values() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportHomeRecommendCardSimpleFragment$initViewModel$1(this, null), 3, null);
    }
}
