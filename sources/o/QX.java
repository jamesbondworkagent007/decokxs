package o;

import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.Glide;
import o.C5420Ra;

/* JADX INFO: loaded from: classes2.dex */
public class QX extends android.graphics.drawable.Drawable implements C5420Ra.StateListAnimator, Animatable, Animatable2Compat {
    public boolean AEQbTJ;
    public boolean AYXKKw;
    public android.graphics.Paint AhwBna;
    public final StateListAnimator AkhnZx;
    public android.graphics.Rect EZpvd;
    public boolean KWHzl;
    public java.util.List<Animatable2Compat.AnimationCallback> OLrzqt;
    public boolean copydefault;
    public boolean djBIcL;
    public int gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.AkhnZx;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void values() {
        this.valueOf = 0;
    }

    public QX(android.content.Context context, InterfaceC5341Nz interfaceC5341Nz, NN<android.graphics.Bitmap> nn, int i, int i2, android.graphics.Bitmap bitmap) {
        this(new StateListAnimator(new C5420Ra(Glide.OLrzqt(context), interfaceC5341Nz, i, i2, nn, bitmap)));
    }

    public QX(StateListAnimator stateListAnimator) {
        this.djBIcL = true;
        this.gEmmrt = -1;
        this.AkhnZx = (StateListAnimator) SE.OLrzqt(stateListAnimator);
    }

    public int gEmmrt() {
        return this.AkhnZx.AEQbTJ.AYXKKw();
    }

    public android.graphics.Bitmap OLrzqt() {
        return this.AkhnZx.AEQbTJ.valueOf();
    }

    public void AEQbTJ(NN<android.graphics.Bitmap> nn, android.graphics.Bitmap bitmap) {
        this.AkhnZx.AEQbTJ.OLrzqt(nn, bitmap);
    }

    public java.nio.ByteBuffer copydefault() {
        return this.AkhnZx.AEQbTJ.AEQbTJ();
    }

    public int KWHzl() {
        return this.AkhnZx.AEQbTJ.AhwBna();
    }

    public int djBIcL() {
        return this.AkhnZx.AEQbTJ.EZpvd();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.AYXKKw = true;
        values();
        if (this.djBIcL) {
            DbNXlk();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.AYXKKw = false;
        AkhnZx();
    }

    public final void DbNXlk() {
        SE.copydefault(!this.copydefault, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.AkhnZx.AEQbTJ.AhwBna() == 1) {
            invalidateSelf();
        } else {
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            this.AkhnZx.AEQbTJ.EZpvd(this);
            invalidateSelf();
        }
    }

    public final void AkhnZx() {
        this.KWHzl = false;
        this.AkhnZx.AEQbTJ.KWHzl(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        SE.copydefault(!this.copydefault, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.djBIcL = z;
        if (!z) {
            AkhnZx();
        } else if (this.AYXKKw) {
            DbNXlk();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.AkhnZx.AEQbTJ.gEmmrt();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.AkhnZx.AEQbTJ.djBIcL();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.AEQbTJ = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas canvas) {
        if (this.copydefault) {
            return;
        }
        if (this.AEQbTJ) {
            android.view.Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), AEQbTJ());
            this.AEQbTJ = false;
        }
        canvas.drawBitmap(this.AkhnZx.AEQbTJ.OLrzqt(), (android.graphics.Rect) null, AEQbTJ(), isConnected());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        isConnected().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        isConnected().setColorFilter(colorFilter);
    }

    public final android.graphics.Rect AEQbTJ() {
        if (this.EZpvd == null) {
            this.EZpvd = new android.graphics.Rect();
        }
        return this.EZpvd;
    }

    private android.graphics.Paint isConnected() {
        if (this.AhwBna == null) {
            this.AhwBna = new android.graphics.Paint(2);
        }
        return this.AhwBna;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: android.graphics.drawable.Drawable$Callback */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: android.graphics.drawable.Drawable$Callback */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: android.graphics.drawable.Drawable$Callback */
    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable.Callback EZpvd() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof android.graphics.drawable.Drawable) {
            callback = ((android.graphics.drawable.Drawable) callback).getCallback();
        }
        return callback;
    }

    @Override // o.C5420Ra.StateListAnimator
    public void AYXKKw() {
        if (EZpvd() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (djBIcL() == KWHzl() - 1) {
            this.valueOf++;
        }
        int i = this.gEmmrt;
        if (i == -1 || this.valueOf < i) {
            return;
        }
        valueOf();
        stop();
    }

    public final void valueOf() {
        java.util.List<Animatable2Compat.AnimationCallback> list = this.OLrzqt;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.OLrzqt.get(i).onAnimationEnd(this);
            }
        }
    }

    public void AhwBna() {
        this.copydefault = true;
        this.AkhnZx.AEQbTJ.KWHzl();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@androidx.annotation.NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.OLrzqt == null) {
            this.OLrzqt = new java.util.ArrayList();
        }
        this.OLrzqt.add(animationCallback);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@androidx.annotation.NonNull Animatable2Compat.AnimationCallback animationCallback) {
        java.util.List<Animatable2Compat.AnimationCallback> list = this.OLrzqt;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        java.util.List<Animatable2Compat.AnimationCallback> list = this.OLrzqt;
        if (list != null) {
            list.clear();
        }
    }

    public static final class StateListAnimator extends Drawable.ConstantState {
        public final C5420Ra AEQbTJ;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public StateListAnimator(C5420Ra c5420Ra) {
            this.AEQbTJ = c5420Ra;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            return new QX(this);
        }
    }
}
