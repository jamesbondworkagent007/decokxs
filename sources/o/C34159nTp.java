package o;

import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.group.info.fragment.VipHereWhenYouNeedUsFragment$initViewModel$1;
import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.C35399nuc;
import o.C52761wXj;
import o.C55137xeK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nTp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C34159nTp extends AbstractC32996moC {
    public final int AEQbTJ = C35399nuc.Dialog.KDccX;
    public final InterfaceC56387yDm OLrzqt;
    public nKI copydefault;

    public static final boolean AEQbTJ(java.lang.String str) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public C34159nTp() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(GroupProfileViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.info.fragment.VipHereWhenYouNeedUsFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.info.fragment.VipHereWhenYouNeedUsFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.info.fragment.VipHereWhenYouNeedUsFragment$special$$inlined$activityViewModels$default$3
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

    private final GroupProfileViewModel copydefault() {
        return (GroupProfileViewModel) this.OLrzqt.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nKI nkiOLrzqt = nKI.OLrzqt(layoutInflater, viewGroup, false);
        this.copydefault = nkiOLrzqt;
        if (nkiOLrzqt != null) {
            return nkiOLrzqt.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.copydefault = null;
        super.onDestroyView();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        Intrinsics.checkNotNullParameter(view, "");
        nKI nki = this.copydefault;
        if (nki != null && (textView2 = nki.OLrzqt) != null) {
            C55137xeK.ActionBar actionBar = C55137xeK.Companion;
            java.lang.String string = getString(C35399nuc.LoaderManager.hQkvHM);
            Intrinsics.checkNotNullExpressionValue(string, "");
            actionBar.KWHzl(string).OLrzqt(new InterfaceC55228xfw() { // from class: o.nTt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC55228xfw
                public final boolean OLrzqt(java.lang.String str) {
                    return C34159nTp.AEQbTJ(str);
                }
            }).EZpvd(textView2);
        }
        nKI nki2 = this.copydefault;
        if (nki2 != null && (textView = nki2.KWHzl) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.nTs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C34159nTp.copydefault(this.OLrzqt, view2);
                }
            });
        }
        OLrzqt();
    }

    public static final void copydefault(C34159nTp c34159nTp, android.view.View view) {
        c34159nTp.KWHzl();
    }

    public final void KWHzl() {
        nKI nki = this.copydefault;
        if (nki != null) {
            android.widget.TextView textView = nki.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            boolean z = textView.getVisibility() == 0;
            android.widget.TextView textView2 = nki.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(z ^ true ? 0 : 8);
            android.graphics.drawable.Drawable drawable = AppCompatResources.getDrawable(requireContext(), z ? C52761wXj.TaskDescription.UrRBLY : C52761wXj.TaskDescription.QIZEnU);
            if (drawable != null) {
                drawable.setTint(requireContext().getColor(C52761wXj.Activity.QwvEab));
            } else {
                drawable = null;
            }
            nki.KWHzl.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        }
    }

    private final void OLrzqt() {
        StateFlow<GroupProfileViewModel.TaskDescription> stateFlowAhwBna = copydefault().AhwBna();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowAhwBna, viewLifecycleOwner, (Lifecycle.State) null, new VipHereWhenYouNeedUsFragment$initViewModel$1(this, null), 2, (java.lang.Object) null);
    }
}
