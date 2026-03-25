package o;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes19.dex */
public class tZQ extends SimpleItemAnimator {
    public static android.animation.TimeInterpolator copydefault;
    public static android.animation.TimeInterpolator OLrzqt = C33616mzn.OLrzqt;
    public static android.animation.TimeInterpolator KWHzl = C33616mzn.AEQbTJ;
    public java.util.ArrayList<RecyclerView.ViewHolder> AkhnZx = new java.util.ArrayList<>();
    public java.util.ArrayList<RecyclerView.ViewHolder> AhwBna = new java.util.ArrayList<>();
    public java.util.ArrayList<TaskDescription> isConnected = new java.util.ArrayList<>();
    public java.util.ArrayList<Activity> values = new java.util.ArrayList<>();
    public java.util.ArrayList<java.util.ArrayList<RecyclerView.ViewHolder>> AEQbTJ = new java.util.ArrayList<>();
    public java.util.ArrayList<java.util.ArrayList<TaskDescription>> djBIcL = new java.util.ArrayList<>();
    public java.util.ArrayList<java.util.ArrayList<Activity>> AYXKKw = new java.util.ArrayList<>();
    public java.util.ArrayList<RecyclerView.ViewHolder> EZpvd = new java.util.ArrayList<>();
    public java.util.ArrayList<RecyclerView.ViewHolder> valueOf = new java.util.ArrayList<>();
    public java.util.ArrayList<RecyclerView.ViewHolder> DbNXlk = new java.util.ArrayList<>();
    public java.util.ArrayList<RecyclerView.ViewHolder> gEmmrt = new java.util.ArrayList<>();

    public static class TaskDescription {
        public RecyclerView.ViewHolder AEQbTJ;
        public int EZpvd;
        public int KWHzl;
        public int OLrzqt;
        public int copydefault;

        public TaskDescription(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.AEQbTJ = viewHolder;
            this.OLrzqt = i;
            this.KWHzl = i2;
            this.EZpvd = i3;
            this.copydefault = i4;
        }
    }

    public static class Activity {
        public int AEQbTJ;
        public RecyclerView.ViewHolder EZpvd;
        public RecyclerView.ViewHolder KWHzl;
        public int OLrzqt;
        public int copydefault;
        public int gEmmrt;

        public Activity(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.EZpvd = viewHolder;
            this.KWHzl = viewHolder2;
        }

        public Activity(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.AEQbTJ = i;
            this.OLrzqt = i2;
            this.copydefault = i3;
            this.gEmmrt = i4;
        }

        public java.lang.String toString() {
            return "ChangeInfo{oldHolder=" + this.EZpvd + ", newHolder=" + this.KWHzl + ", fromX=" + this.AEQbTJ + ", fromY=" + this.OLrzqt + ", toX=" + this.copydefault + ", toY=" + this.gEmmrt + AbstractJsonLexerKt.END_OBJ;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        boolean z = !this.AkhnZx.isEmpty();
        boolean z2 = !this.isConnected.isEmpty();
        boolean z3 = !this.values.isEmpty();
        boolean z4 = !this.AhwBna.isEmpty();
        if (z || z2 || z4 || z3) {
            java.util.Iterator<RecyclerView.ViewHolder> it = this.AkhnZx.iterator();
            while (it.hasNext()) {
                OLrzqt(it.next());
            }
            this.AkhnZx.clear();
            if (z2) {
                final java.util.ArrayList<TaskDescription> arrayList = new java.util.ArrayList<>();
                arrayList.addAll(this.isConnected);
                this.djBIcL.add(arrayList);
                this.isConnected.clear();
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.tZQ.4
                    @Override // java.lang.Runnable
                    public void run() {
                        for (TaskDescription taskDescription : arrayList) {
                            tZQ.this.EZpvd(taskDescription.AEQbTJ, taskDescription.OLrzqt, taskDescription.KWHzl, taskDescription.EZpvd, taskDescription.copydefault);
                        }
                        arrayList.clear();
                        tZQ.this.djBIcL.remove(arrayList);
                    }
                };
                if (z) {
                    ViewCompat.postOnAnimationDelayed(arrayList.get(0).AEQbTJ.itemView, runnable, getRemoveDuration());
                } else {
                    runnable.run();
                }
            }
            if (z3) {
                final java.util.ArrayList<Activity> arrayList2 = new java.util.ArrayList<>();
                arrayList2.addAll(this.values);
                this.AYXKKw.add(arrayList2);
                this.values.clear();
                java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: o.tZQ.3
                    @Override // java.lang.Runnable
                    public void run() {
                        java.util.Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            tZQ.this.copydefault((Activity) it2.next());
                        }
                        arrayList2.clear();
                        tZQ.this.AYXKKw.remove(arrayList2);
                    }
                };
                if (z) {
                    ViewCompat.postOnAnimationDelayed(arrayList2.get(0).EZpvd.itemView, runnable2, getRemoveDuration());
                } else {
                    runnable2.run();
                }
            }
            if (z4) {
                final java.util.ArrayList<RecyclerView.ViewHolder> arrayList3 = new java.util.ArrayList<>();
                arrayList3.addAll(this.AhwBna);
                this.AEQbTJ.add(arrayList3);
                this.AhwBna.clear();
                java.lang.Runnable runnable3 = new java.lang.Runnable() { // from class: o.tZQ.2
                    @Override // java.lang.Runnable
                    public void run() {
                        java.util.Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            tZQ.this.AEQbTJ((RecyclerView.ViewHolder) it2.next());
                        }
                        arrayList3.clear();
                        tZQ.this.AEQbTJ.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    ViewCompat.postOnAnimationDelayed(arrayList3.get(0).itemView, runnable3, (z ? getRemoveDuration() : 0L) + java.lang.Math.max(z2 ? getMoveDuration() : 0L, z3 ? getChangeDuration() : 0L));
                } else {
                    runnable3.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        copydefault(viewHolder);
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setScaleX(1.0f);
        viewHolder.itemView.setScaleY(1.0f);
        this.AkhnZx.add(viewHolder);
        return true;
    }

    private void OLrzqt(final RecyclerView.ViewHolder viewHolder) {
        final android.view.View view = viewHolder.itemView;
        final android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.DbNXlk.add(viewHolder);
        view.setPivotX(view.getWidth() / 2);
        view.setPivotX(view.getHeight() / 2);
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        viewPropertyAnimatorAnimate.alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(getRemoveDuration()).setInterpolator(KWHzl).setListener(new android.animation.AnimatorListenerAdapter() { // from class: o.tZQ.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                tZQ.this.dispatchRemoveStarting(viewHolder);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                tZQ.this.dispatchRemoveFinished(viewHolder);
                tZQ.this.DbNXlk.remove(viewHolder);
                tZQ.this.KWHzl();
            }
        }).start();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        copydefault(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.AhwBna.add(viewHolder);
        return true;
    }

    public void AEQbTJ(final RecyclerView.ViewHolder viewHolder) {
        final android.view.View view = viewHolder.itemView;
        final android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.EZpvd.add(viewHolder);
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        view.setScaleX(0.5f);
        view.setScaleY(0.5f);
        view.setAlpha(0.0f);
        viewPropertyAnimatorAnimate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(getAddDuration()).setInterpolator(OLrzqt).setListener(new android.animation.AnimatorListenerAdapter() { // from class: o.tZQ.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                tZQ.this.dispatchAddStarting(viewHolder);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                tZQ.this.dispatchAddFinished(viewHolder);
                tZQ.this.EZpvd.remove(viewHolder);
                tZQ.this.KWHzl();
            }
        }).start();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        android.view.View view = viewHolder.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        copydefault(viewHolder);
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
        this.isConnected.add(new TaskDescription(viewHolder, translationX, translationY, i3, i4));
        return true;
    }

    public void EZpvd(final RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        final android.view.View view = viewHolder.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.valueOf.add(viewHolder);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration()).setListener(new android.animation.AnimatorListenerAdapter() { // from class: o.tZQ.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                tZQ.this.dispatchMoveStarting(viewHolder);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                tZQ.this.dispatchMoveFinished(viewHolder);
                tZQ.this.valueOf.remove(viewHolder);
                tZQ.this.KWHzl();
            }
        }).start();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        copydefault(viewHolder);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            copydefault(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i5);
            viewHolder2.itemView.setTranslationY(-i6);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        this.values.add(new Activity(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }

    public void copydefault(final Activity activity) {
        RecyclerView.ViewHolder viewHolder = activity.EZpvd;
        final android.view.View view = viewHolder == null ? null : viewHolder.itemView;
        RecyclerView.ViewHolder viewHolder2 = activity.KWHzl;
        final android.view.View view2 = viewHolder2 != null ? viewHolder2.itemView : null;
        if (view != null) {
            final android.view.ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.gEmmrt.add(activity.EZpvd);
            duration.translationX(activity.copydefault - activity.AEQbTJ);
            duration.translationY(activity.gEmmrt - activity.OLrzqt);
            duration.alpha(0.0f).setListener(new android.animation.AnimatorListenerAdapter() { // from class: o.tZQ.9
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator) {
                    tZQ.this.dispatchChangeStarting(activity.EZpvd, true);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    tZQ.this.dispatchChangeFinished(activity.EZpvd, true);
                    tZQ.this.gEmmrt.remove(activity.EZpvd);
                    tZQ.this.KWHzl();
                }
            }).start();
        }
        if (view2 != null) {
            final android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.gEmmrt.add(activity.KWHzl);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new android.animation.AnimatorListenerAdapter() { // from class: o.tZQ.8
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator) {
                    tZQ.this.dispatchChangeStarting(activity.KWHzl, false);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    viewPropertyAnimatorAnimate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    tZQ.this.dispatchChangeFinished(activity.KWHzl, false);
                    tZQ.this.gEmmrt.remove(activity.KWHzl);
                    tZQ.this.KWHzl();
                }
            }).start();
        }
    }

    private void AEQbTJ(java.util.List<Activity> list, RecyclerView.ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            Activity activity = list.get(size);
            if (AEQbTJ(activity, viewHolder) && activity.EZpvd == null && activity.KWHzl == null) {
                list.remove(activity);
            }
        }
    }

    public final void EZpvd(Activity activity) {
        RecyclerView.ViewHolder viewHolder = activity.EZpvd;
        if (viewHolder != null) {
            AEQbTJ(activity, viewHolder);
        }
        RecyclerView.ViewHolder viewHolder2 = activity.KWHzl;
        if (viewHolder2 != null) {
            AEQbTJ(activity, viewHolder2);
        }
    }

    public final boolean AEQbTJ(Activity activity, RecyclerView.ViewHolder viewHolder) {
        boolean z = false;
        if (activity.KWHzl == viewHolder) {
            activity.KWHzl = null;
        } else {
            if (activity.EZpvd != viewHolder) {
                return false;
            }
            activity.EZpvd = null;
            z = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0011 */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        android.view.View view = viewHolder.itemView;
        view.animate().cancel();
        int size = this.isConnected.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.isConnected.get(size).AEQbTJ == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(viewHolder);
                this.isConnected.remove(size);
            }
        }
        AEQbTJ(this.values, viewHolder);
        if (this.AkhnZx.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.AhwBna.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.AYXKKw.size() - 1; size2 >= 0; size2--) {
            java.util.ArrayList<Activity> arrayList = this.AYXKKw.get(size2);
            AEQbTJ(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.AYXKKw.remove(size2);
            }
        }
        for (int size3 = this.djBIcL.size() - 1; size3 >= 0; size3--) {
            java.util.ArrayList<TaskDescription> arrayList2 = this.djBIcL.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).AEQbTJ == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.djBIcL.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.AEQbTJ.size() - 1; size5 >= 0; size5--) {
            java.util.ArrayList<RecyclerView.ViewHolder> arrayList3 = this.AEQbTJ.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.AEQbTJ.remove(size5);
                }
            }
        }
        this.DbNXlk.remove(viewHolder);
        this.EZpvd.remove(viewHolder);
        this.gEmmrt.remove(viewHolder);
        this.valueOf.remove(viewHolder);
        KWHzl();
    }

    private void copydefault(RecyclerView.ViewHolder viewHolder) {
        if (copydefault == null) {
            copydefault = new android.animation.ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(copydefault);
        endAnimation(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        return (this.AhwBna.isEmpty() && this.values.isEmpty() && this.isConnected.isEmpty() && this.AkhnZx.isEmpty() && this.valueOf.isEmpty() && this.DbNXlk.isEmpty() && this.EZpvd.isEmpty() && this.gEmmrt.isEmpty() && this.djBIcL.isEmpty() && this.AEQbTJ.isEmpty() && this.AYXKKw.isEmpty()) ? false : true;
    }

    public void KWHzl() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:10:0x004f */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0008 */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        int size = this.isConnected.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            TaskDescription taskDescription = this.isConnected.get(size);
            android.view.View view = taskDescription.AEQbTJ.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(taskDescription.AEQbTJ);
            this.isConnected.remove(size);
        }
        for (int size2 = this.AkhnZx.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.AkhnZx.get(size2));
            this.AkhnZx.remove(size2);
        }
        int size3 = this.AhwBna.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = this.AhwBna.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            this.AhwBna.remove(size3);
        }
        for (int size4 = this.values.size() - 1; size4 >= 0; size4--) {
            EZpvd(this.values.get(size4));
        }
        this.values.clear();
        if (isRunning()) {
            for (int size5 = this.djBIcL.size() - 1; size5 >= 0; size5--) {
                java.util.ArrayList<TaskDescription> arrayList = this.djBIcL.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    TaskDescription taskDescription2 = arrayList.get(size6);
                    android.view.View view2 = taskDescription2.AEQbTJ.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(taskDescription2.AEQbTJ);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.djBIcL.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.AEQbTJ.size() - 1; size7 >= 0; size7--) {
                java.util.ArrayList<RecyclerView.ViewHolder> arrayList2 = this.AEQbTJ.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder2 = arrayList2.get(size8);
                    viewHolder2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.AEQbTJ.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.AYXKKw.size() - 1; size9 >= 0; size9--) {
                java.util.ArrayList<Activity> arrayList3 = this.AYXKKw.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    EZpvd(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.AYXKKw.remove(arrayList3);
                    }
                }
            }
            KWHzl(this.DbNXlk);
            KWHzl(this.valueOf);
            KWHzl(this.EZpvd);
            KWHzl(this.gEmmrt);
            dispatchAnimationsFinished();
        }
    }

    public void KWHzl(java.util.List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@androidx.annotation.NonNull RecyclerView.ViewHolder viewHolder, @androidx.annotation.NonNull java.util.List<java.lang.Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, list);
    }
}
