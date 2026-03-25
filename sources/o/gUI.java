package o;

import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.FragmentKt;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gUI extends AbstractC52792wYn {
    public static final Activity Companion = new Activity(null);

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gUI.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final gUI OLrzqt() {
            return new gUI();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
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
            android.content.Context context = ((wZX) c55104xde.OLrzqt()).getRoot().getContext();
            if (z2) {
                ((wZX) c55104xde.OLrzqt()).getRoot().valueOf();
            } else {
                Intrinsics.copydefault(context);
                C55251xgS c55251xgS = new C55251xgS(context, null, 0, 6, null);
                c55251xgS.setOKDSSize(-5);
                c55251xgS.setOKDSStyle(14);
                c55251xgS.setText(C23274hvD.Fragment.PipHintTrackerKttrackPipAnimationHintViewflow1);
                OKRegularCell.addViewBehindTitle$default(((wZX) c55104xde.OLrzqt()).getRoot(), c55251xgS, C55298xhM.OLrzqt(4, context), 0, 4, null);
            }
            ImageViewCompat.setImageTintList(((wZX) c55104xde.OLrzqt()).getRoot().OLrzqt(), ContextCompat.getColorStateList(context, z2 ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe));
        }
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.EZpvd(new StateListAnimator());
        java.lang.String string = getString(C23274hvD.Fragment.getRccStateFromState);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55276xgr c55276xgr = new C55276xgr(string, new CopyTradingAutoSellStrategy.TakeProfit("", ""), null, false, false, java.lang.Integer.valueOf(C52761wXj.TaskDescription.QOeQqh), null, 92, null);
        java.lang.String string2 = getString(C23274hvD.Fragment.sendShuffleMode);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55198xfS.setSingleOneColumnData(yDY.gEmmrt(c55276xgr, new C55276xgr(string2, new CopyTradingAutoSellStrategy.StopLoss("", ""), null, false, false, java.lang.Integer.valueOf(C52761wXj.TaskDescription.nriSR), null, 92, null)), new yHO() { // from class: o.gUM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return gUI.copydefault(this.OLrzqt, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit copydefault(gUI gui, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        CopyTradingAutoSellStrategy copyTradingAutoSellStrategy = objOLrzqt instanceof CopyTradingAutoSellStrategy ? (CopyTradingAutoSellStrategy) objOLrzqt : null;
        if (copyTradingAutoSellStrategy != null) {
            FragmentKt.setFragmentResult(gui, "AdvancedAutoSellStrategySelectionBottomSheet.requestKey", BundleKt.bundleOf(C56390yDp.OLrzqt("AdvancedAutoSellStrategySelectionBottomSheet.selectedStrategy", copyTradingAutoSellStrategy)));
            gui.dismiss();
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        android.os.Bundle bundle = android.os.Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(bundle, "");
        FragmentKt.setFragmentResult(this, "AdvancedAutoSellStrategySelectionBottomSheet.requestKey", bundle);
    }
}
