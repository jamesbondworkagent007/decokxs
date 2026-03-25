package o;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55333xhv extends SimpleItemAnimator {
    public static android.animation.TimeInterpolator AEQbTJ;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public long DbNXlk = getMoveDuration();
    public final java.util.ArrayList<RecyclerView.ViewHolder> values = new java.util.ArrayList<>();
    public final java.util.ArrayList<RecyclerView.ViewHolder> AYXKKw = new java.util.ArrayList<>();
    public final java.util.ArrayList<ActionBar> isConnected = new java.util.ArrayList<>();
    public final java.util.ArrayList<Application> djBIcL = new java.util.ArrayList<>();
    public java.util.ArrayList<java.util.ArrayList<RecyclerView.ViewHolder>> copydefault = new java.util.ArrayList<>();
    public java.util.ArrayList<java.util.ArrayList<ActionBar>> AhwBna = new java.util.ArrayList<>();
    public java.util.ArrayList<java.util.ArrayList<Application>> valueOf = new java.util.ArrayList<>();
    public java.util.ArrayList<RecyclerView.ViewHolder> OLrzqt = new java.util.ArrayList<>();
    public java.util.ArrayList<RecyclerView.ViewHolder> gEmmrt = new java.util.ArrayList<>();
    public java.util.ArrayList<RecyclerView.ViewHolder> fetchVPNInfo = new java.util.ArrayList<>();
    public java.util.ArrayList<RecyclerView.ViewHolder> KWHzl = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<RecyclerView.ViewHolder> AEQbTJ() {
        return this.OLrzqt;
    }

    public abstract void AEQbTJ(@NotNull android.view.ViewPropertyAnimator viewPropertyAnimator, @NotNull RecyclerView.ViewHolder viewHolder);

    public abstract void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long AhwBna() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<RecyclerView.ViewHolder> EZpvd() {
        return this.KWHzl;
    }

    public abstract void EZpvd(@NotNull RecyclerView.ViewHolder viewHolder);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<ActionBar> KWHzl() {
        return this.isConnected;
    }

    public abstract void KWHzl(@NotNull RecyclerView.ViewHolder viewHolder);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<RecyclerView.ViewHolder> OLrzqt() {
        return this.gEmmrt;
    }

    public abstract void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder);

    public abstract void copydefault(@NotNull android.view.ViewPropertyAnimator viewPropertyAnimator, @NotNull RecyclerView.ViewHolder viewHolder);

    public abstract void copydefault(@NotNull RecyclerView.ViewHolder viewHolder);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<RecyclerView.ViewHolder> gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX INFO: renamed from: o.xhv$ActionBar */
    public static final class ActionBar {
        public int AEQbTJ;
        public int EZpvd;
        public int KWHzl;
        public int OLrzqt;
        public RecyclerView.ViewHolder copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecyclerView.ViewHolder copydefault() {
            return this.copydefault;
        }

        public ActionBar(@NotNull RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            this.copydefault = viewHolder;
            this.AEQbTJ = i;
            this.EZpvd = i2;
            this.KWHzl = i3;
            this.OLrzqt = i4;
        }
    }

    /* JADX INFO: renamed from: o.xhv$Application */
    public static final class Application {
        public int AEQbTJ;
        public int AYXKKw;
        public RecyclerView.ViewHolder EZpvd;
        public int KWHzl;
        public RecyclerView.ViewHolder OLrzqt;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecyclerView.ViewHolder AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(RecyclerView.ViewHolder viewHolder) {
            this.EZpvd = viewHolder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecyclerView.ViewHolder EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(RecyclerView.ViewHolder viewHolder) {
            this.OLrzqt = viewHolder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
            return this.AYXKKw;
        }

        public Application(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.EZpvd = viewHolder;
            this.OLrzqt = viewHolder2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(viewHolder2, "");
            this.KWHzl = i;
            this.copydefault = i2;
            this.AEQbTJ = i3;
            this.AYXKKw = i4;
        }

        public java.lang.String toString() {
            return "ChangeInfo{oldHolder=" + this.EZpvd + ", newHolder=" + this.OLrzqt + ", fromX=" + this.KWHzl + ", fromY=" + this.copydefault + ", toX=" + this.AEQbTJ + ", toY=" + this.AYXKKw + "}";
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        boolean z = !this.values.isEmpty();
        boolean z2 = !this.isConnected.isEmpty();
        boolean z3 = !this.djBIcL.isEmpty();
        boolean z4 = !this.AYXKKw.isEmpty();
        if (z || z2 || z4 || z3) {
            if (z4) {
                final java.util.ArrayList<RecyclerView.ViewHolder> arrayList = new java.util.ArrayList<>();
                arrayList.addAll(this.AYXKKw);
                this.copydefault.add(arrayList);
                this.AYXKKw.clear();
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.xhu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC55333xhv.copydefault(arrayList, this);
                    }
                };
                if (z || z2 || z3) {
                    long jAEQbTJ = C56548yJl.AEQbTJ(AhwBna(), (z ? getRemoveDuration() : 0L) + C56548yJl.copydefault(z2 ? getMoveDuration() : 0L, z3 ? getChangeDuration() : 0L));
                    android.view.View view = arrayList.get(0).itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "");
                    ViewCompat.postOnAnimationDelayed(view, runnable, jAEQbTJ);
                } else {
                    runnable.run();
                }
            }
            java.util.Iterator<RecyclerView.ViewHolder> it = this.values.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                RecyclerView.ViewHolder next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                gEmmrt(next);
            }
            this.values.clear();
            if (z2) {
                final java.util.ArrayList<ActionBar> arrayList2 = new java.util.ArrayList<>();
                arrayList2.addAll(this.isConnected);
                this.AhwBna.add(arrayList2);
                this.isConnected.clear();
                java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: o.xhs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC55333xhv.AEQbTJ(arrayList2, this);
                    }
                };
                if (z) {
                    android.view.View view2 = arrayList2.get(0).copydefault().itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    ViewCompat.postOnAnimationDelayed(view2, runnable2, getRemoveDuration());
                } else {
                    runnable2.run();
                }
            }
            if (z3) {
                final java.util.ArrayList<Application> arrayList3 = new java.util.ArrayList<>();
                arrayList3.addAll(this.djBIcL);
                this.valueOf.add(arrayList3);
                this.djBIcL.clear();
                java.lang.Runnable runnable3 = new java.lang.Runnable() { // from class: o.xhr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC55333xhv.AYXKKw(arrayList3, this);
                    }
                };
                if (z) {
                    RecyclerView.ViewHolder viewHolderAEQbTJ = arrayList3.get(0).AEQbTJ();
                    Intrinsics.copydefault(viewHolderAEQbTJ);
                    ViewCompat.postOnAnimationDelayed(viewHolderAEQbTJ.itemView, runnable3, getRemoveDuration());
                    return;
                }
                runnable3.run();
            }
        }
    }

    public static final void copydefault(java.util.ArrayList arrayList, AbstractC55333xhv abstractC55333xhv) {
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            abstractC55333xhv.AYXKKw((RecyclerView.ViewHolder) next);
        }
        arrayList.clear();
        abstractC55333xhv.copydefault.remove(arrayList);
    }

    public static final void AEQbTJ(java.util.ArrayList arrayList, AbstractC55333xhv abstractC55333xhv) {
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            ActionBar actionBar = (ActionBar) next;
            abstractC55333xhv.OLrzqt(actionBar.copydefault(), actionBar.EZpvd(), actionBar.AEQbTJ(), actionBar.KWHzl(), actionBar.OLrzqt());
        }
        arrayList.clear();
        abstractC55333xhv.AhwBna.remove(arrayList);
    }

    public static final void AYXKKw(java.util.ArrayList arrayList, AbstractC55333xhv abstractC55333xhv) {
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            abstractC55333xhv.OLrzqt((Application) next);
        }
        arrayList.clear();
        abstractC55333xhv.valueOf.remove(arrayList);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        AhwBna(viewHolder);
        this.values.add(viewHolder);
        KWHzl(viewHolder);
        return true;
    }

    private final void gEmmrt(RecyclerView.ViewHolder viewHolder) {
        android.view.View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.fetchVPNInfo.add(viewHolder);
        viewPropertyAnimatorAnimate.setDuration(getRemoveDuration());
        viewPropertyAnimatorAnimate.alpha(0.0f);
        Intrinsics.copydefault(viewPropertyAnimatorAnimate);
        copydefault(viewPropertyAnimatorAnimate, viewHolder);
        viewPropertyAnimatorAnimate.setListener(new LoaderManager(viewHolder, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: renamed from: o.xhv$LoaderManager */
    public static final class LoaderManager extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ android.view.ViewPropertyAnimator EZpvd;
        public final /* synthetic */ RecyclerView.ViewHolder copydefault;

        public LoaderManager(RecyclerView.ViewHolder viewHolder, android.view.ViewPropertyAnimator viewPropertyAnimator) {
            this.copydefault = viewHolder;
            this.EZpvd = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            AbstractC55333xhv.this.dispatchRemoveStarting(this.copydefault);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.EZpvd.setListener(null);
            AbstractC55333xhv.this.OLrzqt(this.copydefault);
            AbstractC55333xhv.this.dispatchRemoveFinished(this.copydefault);
            AbstractC55333xhv.this.gEmmrt().remove(this.copydefault);
            AbstractC55333xhv.this.copydefault();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            super.onAnimationCancel(animator);
            AbstractC55333xhv.this.KWHzl(this.copydefault);
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        AhwBna(viewHolder);
        AEQbTJ(viewHolder);
        this.AYXKKw.add(viewHolder);
        return true;
    }

    private final void AYXKKw(RecyclerView.ViewHolder viewHolder) {
        android.view.View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.OLrzqt.add(viewHolder);
        viewPropertyAnimatorAnimate.setDuration(getAddDuration());
        Intrinsics.copydefault(viewPropertyAnimatorAnimate);
        AEQbTJ(viewPropertyAnimatorAnimate, viewHolder);
        viewPropertyAnimatorAnimate.setListener(new StateListAnimator(viewHolder, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: renamed from: o.xhv$StateListAnimator */
    public static final class StateListAnimator extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ android.view.ViewPropertyAnimator OLrzqt;
        public final /* synthetic */ RecyclerView.ViewHolder copydefault;

        public StateListAnimator(RecyclerView.ViewHolder viewHolder, android.view.ViewPropertyAnimator viewPropertyAnimator) {
            this.copydefault = viewHolder;
            this.OLrzqt = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            AbstractC55333xhv.this.dispatchAddStarting(this.copydefault);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            AbstractC55333xhv.this.EZpvd(this.copydefault);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.OLrzqt.setListener(null);
            AbstractC55333xhv.this.copydefault(this.copydefault);
            AbstractC55333xhv.this.dispatchAddFinished(this.copydefault);
            AbstractC55333xhv.this.AEQbTJ().remove(this.copydefault);
            AbstractC55333xhv.this.copydefault();
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(@NotNull RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        android.view.View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setAlpha(1.0f);
        int translationX = i + ((int) viewHolder.itemView.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        AhwBna(viewHolder);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.isConnected.add(new ActionBar(viewHolder, translationX, translationY, i3, i4));
        return true;
    }

    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        android.view.View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.gEmmrt.add(viewHolder);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration()).setListener(new Dialog(viewHolder, i5, view, i6, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: renamed from: o.xhv$Dialog */
    public static final class Dialog extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.ViewHolder AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ android.view.ViewPropertyAnimator OLrzqt;
        public final /* synthetic */ int copydefault;

        public Dialog(RecyclerView.ViewHolder viewHolder, int i, android.view.View view, int i2, android.view.ViewPropertyAnimator viewPropertyAnimator) {
            this.AEQbTJ = viewHolder;
            this.copydefault = i;
            this.KWHzl = view;
            this.EZpvd = i2;
            this.OLrzqt = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            AbstractC55333xhv.this.dispatchMoveStarting(this.AEQbTJ);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            if (this.copydefault != 0) {
                this.KWHzl.setTranslationX(0.0f);
            }
            if (this.EZpvd != 0) {
                this.KWHzl.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.OLrzqt.setListener(null);
            AbstractC55333xhv.this.dispatchMoveFinished(this.AEQbTJ);
            AbstractC55333xhv.this.OLrzqt().remove(this.AEQbTJ);
            AbstractC55333xhv.this.copydefault();
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(viewHolder2, "");
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        AhwBna(viewHolder);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        AhwBna(viewHolder2);
        viewHolder2.itemView.setTranslationX(-((int) ((i3 - i) - translationX)));
        viewHolder2.itemView.setTranslationY(-((int) ((i4 - i2) - translationY)));
        viewHolder2.itemView.setAlpha(0.0f);
        this.djBIcL.add(new Application(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }

    public void OLrzqt(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        RecyclerView.ViewHolder viewHolderAEQbTJ = application.AEQbTJ();
        android.view.View view = viewHolderAEQbTJ != null ? viewHolderAEQbTJ.itemView : null;
        RecyclerView.ViewHolder viewHolderEZpvd = application.EZpvd();
        android.view.View view2 = viewHolderEZpvd != null ? viewHolderEZpvd.itemView : null;
        if (view != null) {
            android.view.ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            Intrinsics.checkNotNullExpressionValue(duration, "");
            this.KWHzl.add(application.AEQbTJ());
            duration.translationX(application.OLrzqt() - application.copydefault());
            duration.translationY(application.djBIcL() - application.KWHzl());
            duration.alpha(0.0f).setListener(new Activity(application, duration, view)).start();
        }
        if (view2 != null) {
            android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.KWHzl.add(application.EZpvd());
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new PendingIntent(application, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    /* JADX INFO: renamed from: o.xhv$Activity */
    public static final class Activity extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ Application EZpvd;
        public final /* synthetic */ android.view.ViewPropertyAnimator KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        public Activity(Application application, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
            this.EZpvd = application;
            this.KWHzl = viewPropertyAnimator;
            this.copydefault = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            AbstractC55333xhv.this.dispatchChangeStarting(this.EZpvd.AEQbTJ(), true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.KWHzl.setListener(null);
            this.copydefault.setAlpha(1.0f);
            this.copydefault.setTranslationX(0.0f);
            this.copydefault.setTranslationY(0.0f);
            AbstractC55333xhv.this.dispatchChangeFinished(this.EZpvd.AEQbTJ(), true);
            AbstractC55333xhv.this.EZpvd().remove(this.EZpvd.AEQbTJ());
            AbstractC55333xhv.this.copydefault();
        }
    }

    /* JADX INFO: renamed from: o.xhv$PendingIntent */
    public static final class PendingIntent extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Application EZpvd;
        public final /* synthetic */ android.view.ViewPropertyAnimator OLrzqt;

        public PendingIntent(Application application, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
            this.EZpvd = application;
            this.OLrzqt = viewPropertyAnimator;
            this.AEQbTJ = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            AbstractC55333xhv.this.dispatchChangeStarting(this.EZpvd.EZpvd(), false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.OLrzqt.setListener(null);
            this.AEQbTJ.setAlpha(1.0f);
            this.AEQbTJ.setTranslationX(0.0f);
            this.AEQbTJ.setTranslationY(0.0f);
            AbstractC55333xhv.this.dispatchChangeFinished(this.EZpvd.EZpvd(), false);
            AbstractC55333xhv.this.EZpvd().remove(this.EZpvd.EZpvd());
            AbstractC55333xhv.this.copydefault();
        }
    }

    private final void copydefault(java.util.List<Application> list, RecyclerView.ViewHolder viewHolder) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            Application application = list.get(size);
            if (copydefault(application, viewHolder) && application.AEQbTJ() == null && application.EZpvd() == null) {
                list.remove(application);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final void KWHzl(Application application) {
        if (application.AEQbTJ() != null) {
            copydefault(application, application.AEQbTJ());
        }
        if (application.EZpvd() != null) {
            copydefault(application, application.EZpvd());
        }
    }

    public final boolean copydefault(Application application, RecyclerView.ViewHolder viewHolder) {
        boolean z = false;
        if (application.EZpvd() == viewHolder) {
            application.EZpvd(null);
        } else {
            if (application.AEQbTJ() != viewHolder) {
                return false;
            }
            application.AEQbTJ(null);
            z = true;
        }
        Intrinsics.copydefault(viewHolder);
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        android.view.View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.animate().cancel();
        int size = this.isConnected.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                ActionBar actionBar = this.isConnected.get(size);
                Intrinsics.checkNotNullExpressionValue(actionBar, "");
                if (actionBar.copydefault() == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    this.isConnected.remove(size);
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        copydefault(this.djBIcL, viewHolder);
        if (this.values.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.AYXKKw.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        int size2 = this.valueOf.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                java.util.ArrayList<Application> arrayList = this.valueOf.get(size2);
                Intrinsics.checkNotNullExpressionValue(arrayList, "");
                java.util.ArrayList<Application> arrayList2 = arrayList;
                copydefault(arrayList2, viewHolder);
                if (arrayList2.isEmpty()) {
                    this.valueOf.remove(size2);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = this.AhwBna.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                java.util.ArrayList<ActionBar> arrayList3 = this.AhwBna.get(size3);
                Intrinsics.checkNotNullExpressionValue(arrayList3, "");
                java.util.ArrayList<ActionBar> arrayList4 = arrayList3;
                int size4 = arrayList4.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        ActionBar actionBar2 = arrayList4.get(size4);
                        Intrinsics.checkNotNullExpressionValue(actionBar2, "");
                        if (actionBar2.copydefault() == viewHolder) {
                            view.setTranslationY(0.0f);
                            view.setTranslationX(0.0f);
                            dispatchMoveFinished(viewHolder);
                            arrayList4.remove(size4);
                            if (arrayList4.isEmpty()) {
                                this.AhwBna.remove(size3);
                            }
                        } else if (i4 < 0) {
                            break;
                        } else {
                            size4 = i4;
                        }
                    }
                }
                if (i3 < 0) {
                    break;
                } else {
                    size3 = i3;
                }
            }
        }
        int size5 = this.copydefault.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                java.util.ArrayList<RecyclerView.ViewHolder> arrayList5 = this.copydefault.get(size5);
                Intrinsics.checkNotNullExpressionValue(arrayList5, "");
                java.util.ArrayList<RecyclerView.ViewHolder> arrayList6 = arrayList5;
                if (arrayList6.remove(viewHolder)) {
                    view.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder);
                    if (arrayList6.isEmpty()) {
                        this.copydefault.remove(size5);
                    }
                }
                if (i5 < 0) {
                    break;
                } else {
                    size5 = i5;
                }
            }
        }
        this.fetchVPNInfo.remove(viewHolder);
        this.OLrzqt.remove(viewHolder);
        this.KWHzl.remove(viewHolder);
        this.gEmmrt.remove(viewHolder);
        copydefault();
    }

    public final void AhwBna(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (AEQbTJ == null) {
            AEQbTJ = new android.animation.ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(AEQbTJ);
        endAnimation(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        return (this.AYXKKw.isEmpty() ^ true) || (this.djBIcL.isEmpty() ^ true) || (this.isConnected.isEmpty() ^ true) || (this.values.isEmpty() ^ true) || (this.gEmmrt.isEmpty() ^ true) || (this.fetchVPNInfo.isEmpty() ^ true) || (this.OLrzqt.isEmpty() ^ true) || (this.KWHzl.isEmpty() ^ true) || (this.AhwBna.isEmpty() ^ true) || (this.copydefault.isEmpty() ^ true) || (this.valueOf.isEmpty() ^ true);
    }

    public final void copydefault() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:10:0x005f */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0008 */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        int size = this.isConnected.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            ActionBar actionBar = this.isConnected.get(size);
            Intrinsics.checkNotNullExpressionValue(actionBar, "");
            ActionBar actionBar2 = actionBar;
            android.view.View view = actionBar2.copydefault().itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(actionBar2.copydefault());
            this.isConnected.remove(size);
        }
        for (int size2 = this.values.size() - 1; -1 < size2; size2--) {
            RecyclerView.ViewHolder viewHolder = this.values.get(size2);
            Intrinsics.checkNotNullExpressionValue(viewHolder, "");
            dispatchRemoveFinished(viewHolder);
            this.values.remove(size2);
        }
        int size3 = this.AYXKKw.size();
        while (true) {
            size3--;
            if (-1 >= size3) {
                break;
            }
            RecyclerView.ViewHolder viewHolder2 = this.AYXKKw.get(size3);
            Intrinsics.checkNotNullExpressionValue(viewHolder2, "");
            RecyclerView.ViewHolder viewHolder3 = viewHolder2;
            viewHolder3.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder3);
            this.AYXKKw.remove(size3);
        }
        for (int size4 = this.djBIcL.size() - 1; -1 < size4; size4--) {
            Application application = this.djBIcL.get(size4);
            Intrinsics.checkNotNullExpressionValue(application, "");
            KWHzl(application);
        }
        this.djBIcL.clear();
        if (isRunning()) {
            for (int size5 = this.AhwBna.size() - 1; -1 < size5; size5--) {
                java.util.ArrayList<ActionBar> arrayList = this.AhwBna.get(size5);
                Intrinsics.checkNotNullExpressionValue(arrayList, "");
                java.util.ArrayList<ActionBar> arrayList2 = arrayList;
                for (int size6 = arrayList2.size() - 1; -1 < size6; size6--) {
                    ActionBar actionBar3 = arrayList2.get(size6);
                    Intrinsics.checkNotNullExpressionValue(actionBar3, "");
                    ActionBar actionBar4 = actionBar3;
                    android.view.View view2 = actionBar4.copydefault().itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(actionBar4.copydefault());
                    arrayList2.remove(size6);
                    if (arrayList2.isEmpty()) {
                        this.AhwBna.remove(arrayList2);
                    }
                }
            }
            for (int size7 = this.copydefault.size() - 1; -1 < size7; size7--) {
                java.util.ArrayList<RecyclerView.ViewHolder> arrayList3 = this.copydefault.get(size7);
                Intrinsics.checkNotNullExpressionValue(arrayList3, "");
                java.util.ArrayList<RecyclerView.ViewHolder> arrayList4 = arrayList3;
                for (int size8 = arrayList4.size() - 1; -1 < size8; size8--) {
                    RecyclerView.ViewHolder viewHolder4 = arrayList4.get(size8);
                    Intrinsics.checkNotNullExpressionValue(viewHolder4, "");
                    RecyclerView.ViewHolder viewHolder5 = viewHolder4;
                    android.view.View view3 = viewHolder5.itemView;
                    Intrinsics.checkNotNullExpressionValue(view3, "");
                    view3.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder5);
                    arrayList4.remove(size8);
                    if (arrayList4.isEmpty()) {
                        this.copydefault.remove(arrayList4);
                    }
                }
            }
            for (int size9 = this.valueOf.size() - 1; -1 < size9; size9--) {
                java.util.ArrayList<Application> arrayList5 = this.valueOf.get(size9);
                Intrinsics.checkNotNullExpressionValue(arrayList5, "");
                java.util.ArrayList<Application> arrayList6 = arrayList5;
                for (int size10 = arrayList6.size() - 1; -1 < size10; size10--) {
                    Application application2 = arrayList6.get(size10);
                    Intrinsics.checkNotNullExpressionValue(application2, "");
                    KWHzl(application2);
                    if (arrayList6.isEmpty()) {
                        this.valueOf.remove(arrayList6);
                    }
                }
            }
            AEQbTJ(this.fetchVPNInfo);
            AEQbTJ(this.gEmmrt);
            AEQbTJ(this.OLrzqt);
            AEQbTJ(this.KWHzl);
            dispatchAnimationsFinished();
        }
    }

    private final void AEQbTJ(java.util.List<? extends RecyclerView.ViewHolder> list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            RecyclerView.ViewHolder viewHolder = list.get(size);
            Intrinsics.copydefault(viewHolder);
            viewHolder.itemView.animate().cancel();
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(list, "");
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, list);
    }

    /* JADX INFO: renamed from: o.xhv$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xhv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
