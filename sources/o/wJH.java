package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideCardPresenter;
import com.okinc.uilab.item.OKRegularCell;
import com.okinc.unify_trade.biz.BotGuideCoinItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class wJH extends AbstractC52792wYn {
    public final InterfaceC56387yDm KWHzl;
    public yHO<? super C55276xgr, ? super C55276xgr, ? super C55276xgr, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull yHO<? super C55276xgr, ? super C55276xgr, ? super C55276xgr, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.OLrzqt = yho;
    }

    public wJH() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotGuideCardPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.guide.dialog.BotGuideCoinSwitchDialog$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.guide.dialog.BotGuideCoinSwitchDialog$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.guide.dialog.BotGuideCoinSwitchDialog$special$$inlined$activityViewModels$default$3
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

    public final BotGuideCardPresenter OLrzqt() {
        return (BotGuideCardPresenter) this.KWHzl.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C55688xof.Application.getResultCode));
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    public static final class StateListAnimator extends C55268xgj {
        public StateListAnimator() {
            super(null, 0, 3, null);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;ZZ)V */
        @Override // o.C55268xgj, o.InterfaceC55196xfQ
        /* JADX INFO: renamed from: copydefault */
        public void EZpvd(C55104xde<wZX> c55104xde, C55276xgr c55276xgr, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(c55104xde, "");
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            super.EZpvd(c55104xde, c55276xgr, z, z2);
            OKRegularCell root = ((wZX) c55104xde.OLrzqt()).getRoot();
            Glide.AEQbTJ(root.getContext()).KWHzl(c55276xgr.KWHzl()).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(root.getContext())).djBIcL().KWHzl(C52761wXj.TaskDescription.aHXSQp).EZpvd(root.OLrzqt());
        }
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        java.util.List<C55276xgr> listAhwBna;
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.EZpvd(new StateListAnimator());
        java.util.List<BotGuideCoinItem> value = OLrzqt().KWHzl().ejfBZ().getValue();
        if (value == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList<>(C56403yEb.AYXKKw(value, 10));
            for (BotGuideCoinItem botGuideCoinItem : value) {
                listAhwBna.add(new C55276xgr(botGuideCoinItem.getTitle(), botGuideCoinItem.getInstId(), null, Intrinsics.EZpvd((java.lang.Object) botGuideCoinItem.getInstId(), (java.lang.Object) OLrzqt().copydefault()), false, botGuideCoinItem.getIcon(), null, 84, null));
            }
        }
        c55198xfS.setSingleOneColumnData(listAhwBna, this.OLrzqt);
    }
}
