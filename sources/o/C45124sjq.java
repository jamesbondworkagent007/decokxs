package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.okex.center.ui.fragment.SupportRecentActivitiesCardFragment$initView$1;
import com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sjq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45124sjq extends AbstractC45031siC {
    public static final java.lang.String AYXKKw;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public final int AhwBna = C47315tni.ActionBar.QVAiDq;
    public boolean DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public C47348toO valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    public C45124sjq() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SupportCenterHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesCardFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesCardFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesCardFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportCenterHomeViewModel OLrzqt() {
        return (SupportCenterHomeViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: renamed from: o.sjq$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sjq.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C45124sjq KWHzl() {
            return new C45124sjq();
        }
    }

    static {
        java.lang.String simpleName = C45124sjq.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        AYXKKw = simpleName;
    }

    public final void AEQbTJ(boolean z) {
        android.widget.LinearLayout root;
        if (this.DbNXlk != z) {
            this.DbNXlk = z;
            C47348toO c47348toO = this.valueOf;
            if (c47348toO == null || (root = c47348toO.getRoot()) == null) {
                return;
            }
            root.setVisibility(this.DbNXlk ^ true ? 8 : 0);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.LinearLayout root;
        Intrinsics.checkNotNullParameter(view, "");
        C47348toO c47348toOEZpvd = C47348toO.EZpvd(view);
        this.valueOf = c47348toOEZpvd;
        if (c47348toOEZpvd != null && (root = c47348toOEZpvd.getRoot()) != null) {
            root.setVisibility(8);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportRecentActivitiesCardFragment$initView$1(this, null), 3, null);
    }

    public final void EZpvd(int i) {
        C55251xgS c55251xgS;
        java.lang.String strKWHzl = pTD.KWHzl(this, C47315tni.StateListAnimator.KWHzl, i, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, java.lang.Integer.valueOf(i))));
        C47348toO c47348toO = this.valueOf;
        if (c47348toO == null || (c55251xgS = c47348toO.copydefault) == null) {
            return;
        }
        c55251xgS.setVisibility(i == 0 ? 8 : 0);
        c55251xgS.setText(strKWHzl);
    }
}
