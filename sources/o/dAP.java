package o;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.CardItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.okinc.business.defi.dapp.view.cardSwipe.CardLayoutManager;

/* JADX INFO: loaded from: classes14.dex */
public class dAP<T> extends CardItemTouchHelper.Callback {
    public boolean AYXKKw;
    public dAT<T> EZpvd;
    public RecyclerView KWHzl;
    public android.widget.ImageView OLrzqt;
    public float gEmmrt;
    public float valueOf;
    public boolean AEQbTJ = false;
    public java.lang.reflect.Field AhwBna = null;
    public int copydefault = 0;

    @Override // androidx.recyclerview.widget.CardItemTouchHelper.Callback
    public float getSwipeThreshold(@androidx.annotation.NonNull RecyclerView.ViewHolder viewHolder) {
        return 0.2f;
    }

    @Override // androidx.recyclerview.widget.CardItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.CardItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        return false;
    }

    public dAP(dAT<T> dat, float f, float f2, boolean z, RecyclerView recyclerView) {
        this.EZpvd = dat;
        this.gEmmrt = f;
        this.valueOf = f2;
        this.AYXKKw = z;
        this.KWHzl = recyclerView;
    }

    @Override // androidx.recyclerview.widget.CardItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return CardItemTouchHelper.Callback.makeMovementFlags(0, (this.AYXKKw && (recyclerView.getLayoutManager() instanceof CardLayoutManager)) ? 15 : 0);
    }

    @Override // androidx.recyclerview.widget.CardItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.itemView.setOnTouchListener(null);
        int layoutPosition = viewHolder.getLayoutPosition();
        KWHzl(this.KWHzl, viewHolder);
        dAT<T> dat = this.EZpvd;
        if (dat != null) {
            dat.KWHzl(viewHolder, layoutPosition, i == 4 ? 1 : 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015 A[PHI: r5
  0x0015: PHI (r5v5 float) = (r5v2 float), (r5v3 float) binds: [B:5:0x0013, B:8:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.CardItemTouchHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onChildDraw(android.graphics.Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        this.KWHzl = recyclerView;
        super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
        android.view.View view = viewHolder.itemView;
        if (i == 1) {
            float fOLrzqt = f / OLrzqt(recyclerView, viewHolder);
            float f3 = 1.0f;
            if (fOLrzqt > 1.0f) {
                fOLrzqt = f3;
            } else {
                f3 = -1.0f;
                if (fOLrzqt < -1.0f) {
                }
            }
            recyclerView.getChildCount();
            dAT<T> dat = this.EZpvd;
            if (dat != null) {
                if (fOLrzqt != 0.0f) {
                    dat.KWHzl(viewHolder, fOLrzqt, fOLrzqt < 0.0f ? 4 : 8);
                } else {
                    dat.KWHzl(viewHolder, fOLrzqt, 1);
                }
            }
        }
    }

    public final void KWHzl(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        android.view.View view = viewHolder.itemView;
        final float translationX = view.getTranslationX();
        final float translationY = view.getTranslationY();
        final float f = this.gEmmrt;
        final float f2 = this.valueOf;
        view.setDrawingCacheEnabled(true);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        if (this.OLrzqt == null) {
            this.OLrzqt = new android.widget.ImageView(view.getContext());
            if (recyclerView.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) recyclerView.getParent()).removeView(this.OLrzqt);
                ((android.view.ViewGroup) recyclerView.getParent()).addView(this.OLrzqt, 0);
            }
        }
        this.OLrzqt.setRotation(view.getRotation());
        this.OLrzqt.setLayoutParams(new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
        if (!bitmapCreateBitmap.isRecycled()) {
            this.OLrzqt.setImageBitmap(bitmapCreateBitmap);
        }
        this.OLrzqt.setTranslationX(translationX);
        this.OLrzqt.setTranslationY(translationY);
        this.OLrzqt.setVisibility(0);
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.dAP.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@androidx.annotation.NonNull android.animation.ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                android.widget.ImageView imageView = dAP.this.OLrzqt;
                float f3 = translationX;
                imageView.setTranslationX(f3 + ((f - f3) * animatedFraction));
                android.widget.ImageView imageView2 = dAP.this.OLrzqt;
                float f4 = translationY;
                imageView2.setTranslationY(f4 + (animatedFraction * (f2 - f4)));
            }
        });
        valueAnimatorOfFloat.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.dAP.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
                super.onAnimationCancel(animator);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                dAP.this.OLrzqt.setVisibility(8);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
                super.onAnimationRepeat(animator);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                super.onAnimationStart(animator);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(android.animation.Animator animator) {
                super.onAnimationPause(animator);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(android.animation.Animator animator) {
                super.onAnimationResume(animator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.OvershootInterpolator());
        valueAnimatorOfFloat.start();
    }

    @Override // androidx.recyclerview.widget.CardItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
    }

    @Override // androidx.recyclerview.widget.CardItemTouchHelper.Callback
    public void onSelectedChanged(@androidx.annotation.Nullable RecyclerView.ViewHolder viewHolder, int i) {
        super.onSelectedChanged(viewHolder, i);
        AEQbTJ(i != 1);
        ViewPager viewPagerOLrzqt = OLrzqt(this.KWHzl);
        if (viewPagerOLrzqt != null) {
            if (i == 1) {
                copydefault(Integer.MAX_VALUE, viewPagerOLrzqt);
            } else {
                copydefault(this.copydefault, viewPagerOLrzqt);
            }
        }
    }

    public final void copydefault(int i, ViewPager viewPager) {
        try {
            java.lang.reflect.Field field = this.AhwBna;
            if (field != null) {
                field.setAccessible(true);
                this.AhwBna.set(viewPager, java.lang.Integer.valueOf(i));
                return;
            }
            java.lang.Class clsEZpvd = EZpvd(viewPager.getClass());
            if (clsEZpvd != null) {
                java.lang.reflect.Field declaredField = clsEZpvd.getDeclaredField("mTouchSlop");
                this.AhwBna = declaredField;
                declaredField.setAccessible(true);
                if (this.copydefault == 0) {
                    this.copydefault = ((java.lang.Integer) this.AhwBna.get(viewPager)).intValue();
                }
                this.AhwBna.set(viewPager, java.lang.Integer.valueOf(i));
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final java.lang.Class EZpvd(java.lang.Class cls) {
        if (cls == null) {
            return null;
        }
        return cls.getSimpleName().equals("ViewPager") ? cls : EZpvd(cls.getSuperclass());
    }

    public final void AEQbTJ(boolean z) {
        C57869yqZ c57869yqZCopydefault = copydefault(this.KWHzl);
        if (c57869yqZCopydefault != null) {
            c57869yqZCopydefault.djBIcL(z);
        }
    }

    public final C57869yqZ copydefault(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof C57869yqZ) {
            return (C57869yqZ) view;
        }
        return copydefault((android.view.View) view.getParent());
    }

    public final ViewPager OLrzqt(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof ViewPager) {
            return (ViewPager) view;
        }
        return OLrzqt((android.view.View) view.getParent());
    }

    public final float OLrzqt(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return recyclerView.getWidth() * getSwipeThreshold(viewHolder);
    }
}
