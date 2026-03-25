package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.messageinfo.MessageInfoViewModel;
import com.okinc.im.imui.messageinfo.MessagePreviewFragment$initView$5;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.onk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37116onk extends AbstractC37050omX {
    public final InterfaceC56387yDm AYXKKw;
    public C33881nJh AhwBna;
    public java.lang.Integer djBIcL;
    public C37005olf gEmmrt;
    public final int valueOf = C35399nuc.Dialog.dxcTrN;

    public static final boolean valueOf() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.valueOf;
    }

    public C37116onk() {
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MessageInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageinfo.MessagePreviewFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageinfo.MessagePreviewFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageinfo.MessagePreviewFragment$special$$inlined$activityViewModels$default$3
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

    public final C33881nJh gEmmrt() {
        C33881nJh c33881nJh = this.AhwBna;
        if (c33881nJh != null) {
            return c33881nJh;
        }
        throw new java.lang.IllegalStateException("Binding is only available between onCreateView and onDestroyView".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MessageInfoViewModel AYXKKw() {
        return (MessageInfoViewModel) this.AYXKKw.getValue();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.olc.create$default(o.olc, o.nsR, boolean, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, o.yHO, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.lifecycle.LifecycleOwner, boolean, kotlin.jvm.functions.Function0, int, java.lang.Object):o.olf */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = C33881nJh.AEQbTJ(view);
        C37002olc c37002olc = new C37002olc();
        C35693oAe c35693oAe = C35693oAe.AEQbTJ;
        Function0 function0 = new Function0() { // from class: o.onl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C37116onk.valueOf());
            }
        };
        Function0 function02 = new Function0() { // from class: o.onp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37116onk.AhwBna(this.AEQbTJ);
            }
        };
        Function0 function03 = new Function0() { // from class: o.ono
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37116onk.AhwBna();
            }
        };
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        this.gEmmrt = c37002olc.OLrzqt(c35693oAe, false, (10112 & 4) != 0 ? null : function0, (10112 & 8) != 0 ? false : true, (10112 & 16) != 0 ? null : function02, (10112 & 32) != 0 ? null : function03, (10112 & 64) != 0 ? null : null, (10112 & 128) != 0 ? null : null, (10112 & 256) != 0 ? null : null, (10112 & 512) != 0 ? null : null, (10112 & 1024) != 0 ? null : null, viewLifecycleOwner, (10112 & 4096) != 0 ? false : false, (10112 & 8192) != 0 ? null : null);
        RecyclerView recyclerView = gEmmrt().EZpvd;
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        C37005olf c37005olf = this.gEmmrt;
        if (c37005olf == null) {
            Intrinsics.gEmmrt("");
            c37005olf = null;
        }
        recyclerView.setAdapter(c37005olf);
        recyclerView.setOverScrollMode(2);
        this.djBIcL = java.lang.Integer.valueOf(gEmmrt().EZpvd.getPaddingTop());
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new MessagePreviewFragment$initView$5(this, null), 3, null);
    }

    public static final OKConversation AhwBna(C37116onk c37116onk) {
        MessageInfoViewModel.Application value = c37116onk.AYXKKw().AEQbTJ().getValue();
        java.lang.String strKWHzl = value != null ? value.KWHzl() : null;
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        return sDZ.AEQbTJ.valueOf().copydefault(strKWHzl);
    }

    public static final com.okinc.okimcore.model.remote.UserInfo AhwBna() {
        return sDZ.AEQbTJ.valueOf().OLrzqt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AhwBna = null;
    }
}
