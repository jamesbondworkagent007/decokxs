package o;

import android.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.tradingbot.impl.strategy.view.AllocationItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wQd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52566wQd extends wXX {
    public final boolean AEQbTJ;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wQj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52566wQd.copydefault(this.EZpvd);
        }
    });
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static final int[] EZpvd = {Color.parseColor("#64D33D"), Color.parseColor("#8A91FF"), Color.parseColor("#BCFF2F"), Color.parseColor("#FF7888"), Color.parseColor("#FFB117"), Color.parseColor("#FF7888"), Color.parseColor("#8A91FF"), Color.parseColor("#49A92D"), Color.parseColor("#B3B3B3"), Color.parseColor("#BDBDBD")};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.wQd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wQd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final int[] AEQbTJ() {
            return C52566wQd.EZpvd;
        }

        public final C52566wQd KWHzl(@NotNull java.util.List<AllocationItem> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C52566wQd c52566wQd = new C52566wQd();
            c52566wQd.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_allocation_items", new java.util.ArrayList(list))));
            return c52566wQd;
        }
    }

    public final java.util.List<AllocationItem> OLrzqt() {
        return (java.util.List) this.OLrzqt.getValue();
    }

    public static final java.util.List copydefault(C52566wQd c52566wQd) {
        java.util.ArrayList parcelableArrayList;
        android.os.Bundle arguments = c52566wQd.getArguments();
        return (arguments == null || (parcelableArrayList = arguments.getParcelableArrayList("arg_allocation_items")) == null) ? yDY.AhwBna() : parcelableArrayList;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setCloseVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setDividerVisibility(false);
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        textViewAYXKKw.setTextAppearance(C52761wXj.LoaderManager.zLjUOn);
        textViewAYXKKw.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.YFmri));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-576700282, true, new ActionBar()));
        constraintLayout.addView(composeView);
    }

    /* JADX INFO: renamed from: o.wQd$ActionBar */
    public static final class ActionBar implements Function2<Composer, java.lang.Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            AEQbTJ(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.wQh.OLrzqt(java.util.List, androidx.compose.runtime.Composer, int):void */
        public final void AEQbTJ(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-576700282, i, -1, "com.okinc.tradingbot.impl.strategy.view.CoinTargetAllocationRingChartBottomSheet.onCreateContent.<anonymous>.<anonymous> (CoinTargetAllocationRingChartBottomSheet.kt:159)");
                }
                C52570wQh.EZpvd(C52566wQd.this.OLrzqt(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }
}
