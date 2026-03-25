package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.im.imui.group.info.fragment.GroupProfileHeaderFragment$initViewModel$1;
import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import com.okinc.im.widgets.AvatarInfo;
import com.okinc.okimcore.model.im.group.GroupPublicType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC37225opn;
import o.C35399nuc;
import o.C52761wXj;
import o.nRV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nTl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C34155nTl extends AbstractC32996moC {
    public final int AEQbTJ = C35399nuc.Dialog.getPostValueLengthLimit;
    public nJJ EZpvd;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public C34155nTl() {
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(GroupProfileViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.info.fragment.GroupProfileHeaderFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.info.fragment.GroupProfileHeaderFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.info.fragment.GroupProfileHeaderFragment$special$$inlined$activityViewModels$default$3
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

    public final GroupProfileViewModel EZpvd() {
        return (GroupProfileViewModel) this.copydefault.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nJJ njjCopydefault = nJJ.copydefault(layoutInflater, viewGroup, false);
        this.EZpvd = njjCopydefault;
        if (njjCopydefault != null) {
            return njjCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.EZpvd = null;
        super.onDestroyView();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        copydefault();
    }

    private final void copydefault() {
        StateFlow<GroupProfileViewModel.TaskDescription> stateFlowAhwBna = EZpvd().AhwBna();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowAhwBna, viewLifecycleOwner, (Lifecycle.State) null, new GroupProfileHeaderFragment$initViewModel$1(this, null), 2, (java.lang.Object) null);
    }

    public final void KWHzl(nJJ njj, C34152nTi c34152nTi) {
        float f = getResources().getDisplayMetrics().density;
        android.view.View view = njj.isConnected;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        njj.isConnected.setBackground(new nSU(f * 1.0f, f * 16.0f, ContextCompat.getColor(requireContext(), C35399nuc.Application.gEmmrt), ContextCompat.getColor(requireContext(), C52761wXj.Activity.aBDePw), 0.35f));
        android.widget.ImageView imageView = njj.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        android.view.View view2 = njj.values;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(0);
        int i = (int) (24 * f);
        ViewGroup.LayoutParams layoutParams = njj.copydefault.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMarginStart(i);
            layoutParams2.setMarginEnd(i);
            njj.copydefault.setLayoutParams(layoutParams2);
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Glide.KWHzl(njj.OLrzqt).EZpvd(C43454rpb.copydefault("images/im/vip_bg_profile.webp", contextRequireContext, true)).djBIcL().EZpvd(njj.OLrzqt);
        C35893oHp c35893oHp = njj.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C35891oHn.KWHzl(c35893oHp, true);
        C35893oHp c35893oHp2 = njj.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
        C37716ozA.KWHzl(c35893oHp2, c34152nTi.OLrzqt(), TagSize.DP_26);
        java.lang.String strCopydefault = c34152nTi.copydefault();
        if (strCopydefault != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
            C35893oHp c35893oHp3 = njj.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c35893oHp3, "");
            C35891oHn.KWHzl(c35893oHp3, new AvatarInfo(strCopydefault, c34152nTi.AhwBna(), 0.0f, 4, null));
        }
        njj.AhwBna.setText(c34152nTi.AEQbTJ());
        android.widget.TextView textView = njj.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        android.widget.TextView textView2 = njj.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        C37716ozA.updateTagViewWithTagInfo$default(textView2, c34152nTi.OLrzqt(), 8, null, false, false, false, 60, null);
        android.widget.TextView textView3 = njj.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(8);
        oJD ojd = njj.KWHzl;
        Intrinsics.checkNotNullExpressionValue(ojd, "");
        ojd.setVisibility(8);
        android.widget.TextView textView4 = njj.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(8);
        android.widget.TextView textView5 = njj.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(8);
    }

    public final void OLrzqt(nJJ njj, C34152nTi c34152nTi) {
        android.view.View view = njj.isConnected;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(8);
        android.widget.ImageView imageView = njj.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        android.view.View view2 = njj.values;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = njj.copydefault.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMarginStart(0);
            layoutParams2.setMarginEnd(0);
            njj.copydefault.setLayoutParams(layoutParams2);
        }
        C35893oHp c35893oHp = njj.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C35891oHn.KWHzl(c35893oHp, false);
        C35893oHp c35893oHp2 = njj.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
        C37716ozA.KWHzl(c35893oHp2, c34152nTi.valueOf(), TagSize.DP_26);
        C35893oHp c35893oHp3 = njj.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c35893oHp3, "");
        C35891oHn.loadGroupAvatar$default(c35893oHp3, c34152nTi.KWHzl(), null, 2, null);
        android.widget.TextView textView = njj.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C37716ozA.updateTagViewWithTagInfo$default(textView, c34152nTi.valueOf(), 8, null, false, false, false, 60, null);
        oJD ojd = njj.KWHzl;
        Intrinsics.checkNotNullExpressionValue(ojd, "");
        ojd.setVisibility(c34152nTi.DbNXlk() ? 0 : 8);
        android.widget.TextView textView2 = njj.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        njj.DbNXlk.setText(AEQbTJ(c34152nTi));
        android.widget.TextView textView3 = njj.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        C55307xhV.AEQbTJ(textView3, c34152nTi.gEmmrt());
    }

    /* JADX INFO: renamed from: o.nTl$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C34155nTl AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C34155nTl c34155nTl) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c34155nTl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                nRV.StateListAnimator stateListAnimator = nRV.Companion;
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                this.AEQbTJ.startActivity(stateListAnimator.OLrzqt(contextRequireContext, this.AEQbTJ.EZpvd().djBIcL()));
            }
        }
    }

    /* JADX INFO: renamed from: o.nTl$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C34152nTi KWHzl;
        public final /* synthetic */ C34155nTl OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C34155nTl c34155nTl, C34152nTi c34152nTi) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c34155nTl;
            this.KWHzl = c34152nTi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityC37225opn.TaskDescription taskDescription = ActivityC37225opn.Companion;
                android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                this.OLrzqt.startActivity(taskDescription.EZpvd(contextRequireContext, this.KWHzl.KWHzl()));
            }
        }
    }

    public final void EZpvd(nJJ njj, C34152nTi c34152nTi) {
        java.lang.String strEZpvd = c34152nTi.EZpvd();
        if (strEZpvd == null || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd))) {
            strEZpvd = null;
        }
        njj.gEmmrt.setText(strEZpvd != null ? strEZpvd : c34152nTi.AhwBna());
        android.widget.TextView textView = njj.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, strEZpvd != null ? C33069mpW.copydefault(this, C35399nuc.LoaderManager.zagaMW, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("groupName", c34152nTi.AhwBna()))) : null);
    }

    public final java.lang.String AEQbTJ(C34152nTi c34152nTi) {
        java.lang.String strReplace$default = C59449zhJ.replace$default(C33070mpX.EZpvd(C35399nuc.Fragment.wlaJM, c34152nTi.AYXKKw()), "{num}", pTB.formatLocalized$default(java.lang.String.valueOf(c34152nTi.AYXKKw()), null, 1, null), false, 4, (java.lang.Object) null);
        if (!Intrinsics.EZpvd((java.lang.Object) c34152nTi.fetchVPNInfo(), (java.lang.Object) C44157sFk.KWHzl()) || c34152nTi.djBIcL() != GroupPublicType.PUBLIC) {
            return strReplace$default;
        }
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.hCiIDQ) + "・" + strReplace$default;
    }

    public final void copydefault(nJJ njj, C34152nTi c34152nTi) {
        if (c34152nTi.values()) {
            C35893oHp c35893oHp = njj.EZpvd;
            c35893oHp.setOnClickListener(new Application(c35893oHp, 1000L, this));
        } else if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c34152nTi.KWHzl())) {
            C35893oHp c35893oHp2 = njj.EZpvd;
            c35893oHp2.setOnClickListener(new StateListAnimator(c35893oHp2, 1000L, this, c34152nTi));
        }
    }
}
