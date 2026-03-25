package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractC55333xhv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55335xhx extends AbstractC55333xhv {
    public int fARcdN;
    public long getFieldNames;
    public int uzCIH;
    public float AuCTel = C55298xhM.dp$default(10.0f, (android.content.Context) null, 1, (java.lang.Object) null);
    public float fIwbmz = C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null);
    public float hDKMBd = 12.0f;
    public final long AkhnZx = 250;
    public final float ejfBZ = 0.05f;
    public final android.util.SparseIntArray fJNWhG = new android.util.SparseIntArray(4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55333xhv
    public long AhwBna() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55333xhv
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55333xhv
    public void copydefault(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
    }

    @Override // o.AbstractC55333xhv
    public void KWHzl(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        viewHolder.itemView.setAlpha(1.0f);
    }

    @Override // o.AbstractC55333xhv
    public void copydefault(@NotNull android.view.ViewPropertyAnimator viewPropertyAnimator, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewPropertyAnimator, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        viewPropertyAnimator.alpha(0.0f);
        viewPropertyAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
    }

    @Override // o.AbstractC55333xhv
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder.getAbsoluteAdapterPosition() == 0) {
            viewHolder.itemView.setZ(this.hDKMBd - (viewHolder.getAbsoluteAdapterPosition() * 2));
            this.fARcdN = viewHolder.itemView.getHeight();
            viewHolder.itemView.setScaleX(1.0f);
            viewHolder.itemView.setScaleY(1.0f);
            viewHolder.itemView.setAlpha(1.0f);
            viewHolder.itemView.setTranslationY((-r7.getHeight()) - 100.0f);
            return;
        }
        viewHolder.itemView.setTranslationY((-viewHolder.getAbsoluteAdapterPosition()) * (this.AuCTel + viewHolder.itemView.getHeight()));
        android.view.View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        float absoluteAdapterPosition = 1.0f - (this.ejfBZ * (viewHolder.getAbsoluteAdapterPosition() - 1));
        if (absoluteAdapterPosition < 0.0f) {
            absoluteAdapterPosition = 0.0f;
        }
        view.setScaleX(absoluteAdapterPosition);
        view.setScaleY(absoluteAdapterPosition);
    }

    @Override // o.AbstractC55333xhv
    public void AEQbTJ(@NotNull android.view.ViewPropertyAnimator viewPropertyAnimator, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewPropertyAnimator, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        viewPropertyAnimator.setDuration(this.AkhnZx);
        viewPropertyAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        if (viewHolder.getAbsoluteAdapterPosition() == 0) {
            viewPropertyAnimator.translationY(0.0f);
            this.fJNWhG.put(viewHolder.getAbsoluteAdapterPosition(), viewHolder.itemView.getHeight());
            return;
        }
        viewPropertyAnimator.translationY(((-viewHolder.itemView.getHeight()) * viewHolder.getAbsoluteAdapterPosition()) - this.AuCTel);
        float absoluteAdapterPosition = 1.0f - (this.ejfBZ * viewHolder.getAbsoluteAdapterPosition());
        float f = absoluteAdapterPosition >= 0.0f ? absoluteAdapterPosition : 0.0f;
        viewPropertyAnimator.scaleX(f);
        Intrinsics.copydefault(viewPropertyAnimator.scaleY(f));
    }

    @Override // o.AbstractC55333xhv
    public void EZpvd(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        viewHolder.itemView.setAlpha(1.0f);
    }

    @Override // o.AbstractC55333xhv, androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(@NotNull RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder.getAbsoluteAdapterPosition() == 1) {
            this.uzCIH = viewHolder.itemView.getHeight();
        }
        if (viewHolder.getAbsoluteAdapterPosition() == 2 && this.uzCIH == 0) {
            this.uzCIH = this.fJNWhG.get(0);
        }
        this.fJNWhG.put(viewHolder.getAbsoluteAdapterPosition(), viewHolder.itemView.getHeight());
        android.view.View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        int translationX = i + ((int) viewHolder.itemView.getTranslationX());
        int translationY = (int) viewHolder.itemView.getTranslationY();
        AhwBna(viewHolder);
        view.setAlpha(1.0f);
        view.setZ(this.hDKMBd - (viewHolder.getAbsoluteAdapterPosition() * 2));
        int i7 = i3 - translationX;
        float absoluteAdapterPosition = 1.0f - (this.ejfBZ * viewHolder.getAbsoluteAdapterPosition());
        if (absoluteAdapterPosition < 0.0f) {
            i5 = i4;
            absoluteAdapterPosition = 0.0f;
        } else {
            i5 = i4;
        }
        float absoluteAdapterPosition2 = (i5 - (viewHolder.getAbsoluteAdapterPosition() * this.AuCTel)) - ((this.uzCIH * (1.0f - absoluteAdapterPosition)) / 2);
        if (viewHolder.getAbsoluteAdapterPosition() == 2 && (i6 = this.uzCIH) > 0) {
            absoluteAdapterPosition2 -= (i6 - view.getHeight()) / 2;
            this.uzCIH = 0;
        }
        if (i7 == 0 && absoluteAdapterPosition2 == 0.0f) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i7 != 0) {
            view.setTranslationX(-i7);
        }
        if (absoluteAdapterPosition2 != 0.0f) {
            view.setTranslationY(-absoluteAdapterPosition2);
        }
        KWHzl().add(new AbstractC55333xhv.ActionBar(viewHolder, translationX, i2 + translationY, i3, i4));
        return true;
    }

    @Override // o.AbstractC55333xhv
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        android.view.View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setAlpha(1.0f);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        float absoluteAdapterPosition = 1.0f - (this.ejfBZ * viewHolder.getAbsoluteAdapterPosition());
        floatRef.element = absoluteAdapterPosition;
        if (absoluteAdapterPosition < 0.0f) {
            floatRef.element = 0.0f;
        }
        float height = (floatRef.element * this.fARcdN) / view.getHeight();
        int i5 = i3 - i;
        float fCopydefault = copydefault(i4, viewHolder, view, floatRef.element);
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (fCopydefault != 0.0f) {
            view.animate().translationY(-fCopydefault);
        }
        OLrzqt().add(viewHolder);
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        viewPropertyAnimatorAnimate.scaleX(floatRef.element);
        viewPropertyAnimatorAnimate.scaleY(height);
        viewPropertyAnimatorAnimate.alpha(1.0f);
        viewPropertyAnimatorAnimate.setInterpolator(new android.view.animation.LinearInterpolator());
        viewPropertyAnimatorAnimate.setDuration(this.AkhnZx).setListener(new StateListAnimator(viewHolder, i5, view, fCopydefault, floatRef, height, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: renamed from: o.xhx$StateListAnimator */
    public static final class StateListAnimator extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ android.view.ViewPropertyAnimator AEQbTJ;
        public final /* synthetic */ float AYXKKw;
        public final /* synthetic */ float EZpvd;
        public final /* synthetic */ RecyclerView.ViewHolder KWHzl;
        public final /* synthetic */ Ref.FloatRef OLrzqt;
        public final /* synthetic */ int copydefault;
        public final /* synthetic */ android.view.View gEmmrt;

        public StateListAnimator(RecyclerView.ViewHolder viewHolder, int i, android.view.View view, float f, Ref.FloatRef floatRef, float f2, android.view.ViewPropertyAnimator viewPropertyAnimator) {
            this.KWHzl = viewHolder;
            this.copydefault = i;
            this.gEmmrt = view;
            this.EZpvd = f;
            this.OLrzqt = floatRef;
            this.AYXKKw = f2;
            this.AEQbTJ = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C55335xhx.this.dispatchMoveStarting(this.KWHzl);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            if (this.copydefault != 0) {
                this.gEmmrt.setTranslationX(0.0f);
            }
            float f = this.EZpvd;
            if (f != 0.0f) {
                this.gEmmrt.setTranslationY(-f);
            }
            this.gEmmrt.setAlpha(1.0f);
            try {
                this.gEmmrt.setScaleX(this.OLrzqt.element);
                this.gEmmrt.setScaleY(this.AYXKKw);
            } catch (java.lang.Exception e) {
                pUU.copydefault("PickUpStatusAddItemAnimator" + e.getMessage());
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.AEQbTJ.setListener(null);
            C55335xhx.this.dispatchMoveFinished(this.KWHzl);
            C55335xhx.this.OLrzqt().remove(this.KWHzl);
            C55335xhx.this.copydefault();
        }
    }

    public final float copydefault(int i, RecyclerView.ViewHolder viewHolder, android.view.View view, float f) {
        return (((i - (viewHolder.getAbsoluteAdapterPosition() * this.AuCTel)) - this.fIwbmz) - ((this.fARcdN - view.getHeight()) / 2)) - ((this.fARcdN * (1.0f - f)) / 2);
    }

    @Override // o.AbstractC55333xhv
    public void OLrzqt(@NotNull AbstractC55333xhv.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        RecyclerView.ViewHolder viewHolderAEQbTJ = application.AEQbTJ();
        android.view.View view = viewHolderAEQbTJ != null ? viewHolderAEQbTJ.itemView : null;
        RecyclerView.ViewHolder viewHolderEZpvd = application.EZpvd();
        android.view.View view2 = viewHolderEZpvd != null ? viewHolderEZpvd.itemView : null;
        if (viewHolderEZpvd != null && viewHolderEZpvd.getAbsoluteAdapterPosition() == 0) {
            this.fARcdN = view2 != null ? view2.getHeight() : this.fARcdN;
        }
        if (view != null) {
            float absoluteAdapterPosition = 1.0f - (this.ejfBZ * viewHolderAEQbTJ.getAbsoluteAdapterPosition());
            if (absoluteAdapterPosition < 0.0f) {
                absoluteAdapterPosition = 0.0f;
            }
            int iDjBIcL = application.djBIcL();
            android.view.View view3 = viewHolderAEQbTJ.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            float fCopydefault = copydefault(iDjBIcL, viewHolderAEQbTJ, view3, absoluteAdapterPosition);
            android.view.ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            Intrinsics.checkNotNullExpressionValue(duration, "");
            view.setZ(view.getZ() - 1);
            EZpvd().add(application.AEQbTJ());
            duration.translationX(application.OLrzqt() - application.copydefault());
            duration.translationY(-fCopydefault);
            duration.alpha(0.0f).setListener(new Application(application, duration, view, fCopydefault)).start();
        }
        if (view2 != null) {
            Ref.FloatRef floatRef = new Ref.FloatRef();
            float absoluteAdapterPosition2 = 1.0f - (this.ejfBZ * viewHolderEZpvd.getAbsoluteAdapterPosition());
            floatRef.element = absoluteAdapterPosition2;
            if (absoluteAdapterPosition2 < 0.0f) {
                floatRef.element = 0.0f;
            }
            int iDjBIcL2 = application.djBIcL();
            android.view.View view4 = viewHolderEZpvd.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "");
            float fCopydefault2 = copydefault(iDjBIcL2, viewHolderEZpvd, view4, floatRef.element);
            view2.setZ(this.hDKMBd - (viewHolderEZpvd.getAbsoluteAdapterPosition() * 2));
            android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            viewPropertyAnimatorAnimate.scaleX(floatRef.element);
            viewPropertyAnimatorAnimate.scaleY(floatRef.element);
            EZpvd().add(application.EZpvd());
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(-fCopydefault2).setDuration(getChangeDuration()).alpha(1.0f).setListener(new Activity(application, viewPropertyAnimatorAnimate, view2, fCopydefault2, floatRef)).start();
        }
    }

    /* JADX INFO: renamed from: o.xhx$Application */
    public static final class Application extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ float AEQbTJ;
        public final /* synthetic */ AbstractC55333xhv.Application KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ android.view.ViewPropertyAnimator copydefault;

        public Application(AbstractC55333xhv.Application application, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view, float f) {
            this.KWHzl = application;
            this.copydefault = viewPropertyAnimator;
            this.OLrzqt = view;
            this.AEQbTJ = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C55335xhx.this.dispatchChangeStarting(this.KWHzl.AEQbTJ(), true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.copydefault.setListener(null);
            this.OLrzqt.setAlpha(0.0f);
            this.OLrzqt.setTranslationX(0.0f);
            this.OLrzqt.setTranslationY(-this.AEQbTJ);
            C55335xhx.this.dispatchChangeFinished(this.KWHzl.AEQbTJ(), true);
            C55335xhx.this.EZpvd().remove(this.KWHzl.AEQbTJ());
            C55335xhx.this.copydefault();
        }
    }

    /* JADX INFO: renamed from: o.xhx$Activity */
    public static final class Activity extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ android.view.ViewPropertyAnimator AEQbTJ;
        public final /* synthetic */ float EZpvd;
        public final /* synthetic */ Ref.FloatRef KWHzl;
        public final /* synthetic */ AbstractC55333xhv.Application OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        public Activity(AbstractC55333xhv.Application application, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view, float f, Ref.FloatRef floatRef) {
            this.OLrzqt = application;
            this.AEQbTJ = viewPropertyAnimator;
            this.copydefault = view;
            this.EZpvd = f;
            this.KWHzl = floatRef;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C55335xhx.this.dispatchChangeStarting(this.OLrzqt.EZpvd(), false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.AEQbTJ.setListener(null);
            this.copydefault.setAlpha(1.0f);
            this.copydefault.setTranslationX(0.0f);
            this.copydefault.setTranslationY(-this.EZpvd);
            this.copydefault.setScaleX(this.KWHzl.element);
            this.copydefault.setScaleY(this.KWHzl.element);
            C55335xhx.this.dispatchChangeFinished(this.OLrzqt.EZpvd(), false);
            C55335xhx.this.EZpvd().remove(this.OLrzqt.EZpvd());
            C55335xhx.this.copydefault();
        }
    }
}
