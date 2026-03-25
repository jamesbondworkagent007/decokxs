package o;

import androidx.core.content.res.ResourcesCompat;
import com.robinhood.ticker.TickerView;
import kotlin.jvm.internal.Intrinsics;
import o.C50968veE;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.veE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50968veE {
    public static /* synthetic */ void setCRValue$default(TickerView tickerView, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        EZpvd(tickerView, str, z);
    }

    public static final void EZpvd(@NotNull TickerView tickerView, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(tickerView, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) tickerView.djBIcL())) {
            return;
        }
        tickerView.setCharacterLists(C57862yqS.copydefault());
        tickerView.setTypeface(ResourcesCompat.getFont(tickerView.getContext(), C52761wXj.Dialog.EZpvd));
        tickerView.copydefault(new TaskDescription(tickerView));
        tickerView.setText(str, z);
    }

    /* JADX INFO: renamed from: o.veE$TaskDescription */
    public static final class TaskDescription extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ TickerView copydefault;

        public TaskDescription(TickerView tickerView) {
            this.copydefault = tickerView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            super.onAnimationEnd(animator);
            final TickerView tickerView = this.copydefault;
            tickerView.post(new java.lang.Runnable() { // from class: o.veJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C50968veE.TaskDescription.copydefault(tickerView);
                }
            });
        }

        public static final void copydefault(TickerView tickerView) {
            C50968veE.OLrzqt(tickerView);
        }
    }

    public static final void OLrzqt(TickerView tickerView) {
        android.view.ViewParent parent = tickerView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        int width = viewGroup != null ? viewGroup.getWidth() : 0;
        if (width == 0) {
            return;
        }
        android.content.Context context = tickerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(48, context);
        android.content.Context context2 = tickerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        if (tickerView.getWidth() + iOLrzqt + C55298xhM.OLrzqt(128, context2) > width) {
            float textSize = tickerView.uzCIH.getTextSize();
            android.content.Context context3 = tickerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iDjBIcL = C55298xhM.djBIcL(2.0f, context3);
            while (width > 0 && textSize > 0.0f && tickerView.uzCIH.measureText(tickerView.djBIcL()) > (width - iOLrzqt) - r3) {
                textSize -= iDjBIcL;
                tickerView.uzCIH.setTextSize(textSize);
            }
            tickerView.setTextSize(textSize);
        }
    }
}
