package o;

import android.animation.Animator;
import android.view.View;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.HorizontalLabelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ikt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24814ikt extends android.widget.LinearLayout {
    public hGA EZpvd;
    public HorizontalLabelData KWHzl;

    public C24814ikt(android.content.Context context) {
        super(context);
        this.KWHzl = new HorizontalLabelData(null, null, null, null, null, null, false, null, null, null, null, false, false, false, 16383, null);
        EZpvd(context, null);
    }

    public C24814ikt(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.KWHzl = new HorizontalLabelData(null, null, null, null, null, null, false, null, null, null, null, false, false, false, 16383, null);
        EZpvd(context, attributeSet);
    }

    public C24814ikt(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.KWHzl = new HorizontalLabelData(null, null, null, null, null, null, false, null, null, null, null, false, false, false, 16383, null);
        EZpvd(context, attributeSet);
    }

    public final void EZpvd(android.content.Context context, android.util.AttributeSet attributeSet) {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        if (context == null) {
            return;
        }
        hGA hgaOLrzqt = hGA.OLrzqt(android.view.LayoutInflater.from(context), this);
        this.EZpvd = hgaOLrzqt;
        if (hgaOLrzqt != null && (c55113xdn2 = hgaOLrzqt.copydefault) != null) {
            c55113xdn2.setAutoMirrored(true);
        }
        EZpvd(this.KWHzl);
        hGA hga = this.EZpvd;
        if (hga == null || (c55113xdn = hga.copydefault) == null) {
            return;
        }
        c55113xdn.addAnimatorListener(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.ikt$TaskDescription */
    public static final class TaskDescription implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public TaskDescription() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            C52794wYp c52794wYp;
            Intrinsics.checkNotNullParameter(animator, "");
            hGA hga = C24814ikt.this.EZpvd;
            if (hga == null || (c52794wYp = hga.AYXKKw) == null) {
                return;
            }
            c52794wYp.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            C52794wYp c52794wYp;
            Intrinsics.checkNotNullParameter(animator, "");
            hGA hga = C24814ikt.this.EZpvd;
            if (hga == null || (c52794wYp = hga.AYXKKw) == null) {
                return;
            }
            c52794wYp.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            C52794wYp c52794wYp;
            Intrinsics.checkNotNullParameter(animator, "");
            hGA hga = C24814ikt.this.EZpvd;
            if (hga == null || (c52794wYp = hga.AYXKKw) == null) {
                return;
            }
            c52794wYp.setVisibility(0);
        }
    }

    public final void EZpvd(HorizontalLabelData horizontalLabelData) {
        hGA hga = this.EZpvd;
        if (hga != null) {
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(horizontalLabelData.getContent().getData());
            int i = C23274hvD.Fragment.addQueueItemAt;
            if (strGEmmrt.length() == 0) {
                strGEmmrt = "--";
            }
            hga.djBIcL.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", strGEmmrt))));
            java.lang.String strConsumeData = horizontalLabelData.getAction().consumeData();
            if (strConsumeData != null) {
                hga.AYXKKw.setText(strConsumeData);
            }
            java.lang.String strConsumeData2 = horizontalLabelData.getAddFunds().consumeData();
            if (strConsumeData2 != null) {
                hga.gEmmrt.setText(strConsumeData2);
                hga.gEmmrt.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.OJuSTm));
            }
            boolean z = true;
            int i2 = 8;
            if (horizontalLabelData.getError().getData().booleanValue()) {
                AEQbTJ(true);
                hga.djBIcL.setText(horizontalLabelData.getErrorContent().getData());
                hga.djBIcL.setVisibility(0);
                hga.AYXKKw.setVisibility(8);
                hga.gEmmrt.setVisibility(8);
                hga.AhwBna.setVisibility(8);
                return;
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) C33129mqd.gEmmrt(horizontalLabelData.getData()))) {
                if (horizontalLabelData.getShowMax() && !C23313hvq.valueOf(C33129mqd.gEmmrt(horizontalLabelData.getData()), 0) && horizontalLabelData.getAction().getData().length() != 0) {
                    z = false;
                }
                hga.AYXKKw.setVisibility(z ? 8 : 0);
                hga.gEmmrt.setVisibility((!horizontalLabelData.getShowAddFunds() || horizontalLabelData.getAddFunds().getData().length() == 0) ? 8 : 0);
                android.view.View view = hga.AhwBna;
                if (horizontalLabelData.getShowAddFunds() && !z) {
                    i2 = 0;
                }
                view.setVisibility(i2);
            } else {
                hga.OLrzqt.setVisibility(8);
                hga.AYXKKw.setVisibility(8);
                hga.gEmmrt.setVisibility(8);
                hga.AhwBna.setVisibility(8);
            }
            AEQbTJ(false);
        }
    }

    public final void AEQbTJ(boolean z) {
        hGA hga = this.EZpvd;
        if (hga != null) {
            if (z) {
                hga.djBIcL.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.DQzvGN));
            } else {
                hga.djBIcL.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
            }
        }
    }

    public final void setContentData(@NotNull HorizontalLabelData horizontalLabelData) {
        Intrinsics.checkNotNullParameter(horizontalLabelData, "");
        this.KWHzl = horizontalLabelData;
        EZpvd(horizontalLabelData);
    }

    public final void setActionCallBack(@NotNull final Function0<Unit> function0) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(function0, "");
        hGA hga = this.EZpvd;
        if (hga == null || (c52794wYp = hga.AYXKKw) == null) {
            return;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(c52794wYp, 0L, new Function1() { // from class: o.ikz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24814ikt.OLrzqt(function0, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(Function0 function0, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void setReverseValueTip(@NotNull final Function0<Unit> function0) {
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(function0, "");
        hGA hga = this.EZpvd;
        if (hga == null || (imageView = hga.OLrzqt) == null) {
            return;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.iku
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                function0.invoke();
            }
        });
    }

    public final void setReverseTipIconVisibility(int i) {
        hGA hga = this.EZpvd;
        if (hga != null) {
            hga.OLrzqt.setVisibility(i);
        }
    }

    public final void setAddFundVisibility(int i) {
        hGA hga = this.EZpvd;
        if (hga != null) {
            hga.gEmmrt.setVisibility(i);
        }
    }

    public final void setProgressBarVisibility(int i) {
        hGA hga = this.EZpvd;
        if (hga != null) {
            hga.copydefault.setVisibility(i);
            if (i == 0) {
                AEQbTJ();
            } else if (hga.copydefault.isAnimating()) {
                hga.copydefault.copydefault();
            }
        }
    }

    public final void AEQbTJ() {
        C55113xdn c55113xdn;
        hGA hga = this.EZpvd;
        if (hga == null || (c55113xdn = hga.copydefault) == null) {
            return;
        }
        C22361hds.OLrzqt(c55113xdn, CDNSourceManager.LottieSource.DEX_ORDER_PENDING_LOADING);
        c55113xdn.playAnimation();
    }

    public final void setBalanceInfoPanelVisibility(boolean z) {
        hGA hga = this.EZpvd;
        if (hga != null) {
            hga.EZpvd.setVisibility(z ? 0 : 8);
        }
    }

    public final void setMaxActionVisibility(int i) {
        hGA hga = this.EZpvd;
        if (hga != null) {
            hga.AYXKKw.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
