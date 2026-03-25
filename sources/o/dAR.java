package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;

/* JADX INFO: loaded from: classes14.dex */
public class dAR extends SimpleItemAnimator {
    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        return false;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        return false;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(@androidx.annotation.NonNull RecyclerView.ViewHolder viewHolder) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
    }

    public int KWHzl(android.content.Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(final RecyclerView.ViewHolder viewHolder) {
        int layoutPosition = viewHolder.getLayoutPosition();
        if (layoutPosition == 0) {
            viewHolder.itemView.setTranslationX(-KWHzl(r0.getContext()));
            viewHolder.itemView.setTranslationY(r0.getHeight());
            viewHolder.itemView.animate().translationX(0.0f).translationY(0.0f).setDuration(630L).setInterpolator(new android.view.animation.OvershootInterpolator(1.0f)).start();
        } else if (layoutPosition == 1) {
            viewHolder.itemView.setTranslationX(KWHzl(r0.getContext()));
            viewHolder.itemView.setTranslationY(r0.getHeight());
            viewHolder.itemView.animate().translationX(0.0f).translationY(0.0f).setDuration(630L).setInterpolator(new android.view.animation.OvershootInterpolator(1.0f)).start();
        } else if (layoutPosition == 2) {
            viewHolder.itemView.setTranslationX(-KWHzl(r0.getContext()));
            viewHolder.itemView.setTranslationY(-r0.getHeight());
            viewHolder.itemView.animate().translationX(0.0f).translationY(0.0f).setDuration(630L).setInterpolator(new android.view.animation.OvershootInterpolator(1.0f)).start();
        } else {
            viewHolder.itemView.setTranslationX(-KWHzl(r0.getContext()));
            viewHolder.itemView.setTranslationY(-r0.getHeight());
            viewHolder.itemView.postDelayed(new java.lang.Runnable() { // from class: o.dAR.1
                @Override // java.lang.Runnable
                public void run() {
                    viewHolder.itemView.setTranslationX(0.0f);
                    viewHolder.itemView.setTranslationY(0.0f);
                }
            }, 630L);
        }
        return true;
    }
}
