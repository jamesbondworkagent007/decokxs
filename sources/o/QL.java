package o;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class QL<T extends android.graphics.drawable.Drawable> implements OC<T>, InterfaceC5364Ow {
    public final T EZpvd;

    public QL(T t) {
        this.EZpvd = (T) SE.OLrzqt(t);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/Object; */
    @Override // o.OC
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public final T AEQbTJ() {
        Drawable.ConstantState constantState = this.EZpvd.getConstantState();
        return constantState == null ? this.EZpvd : (T) constantState.newDrawable();
    }

    @Override // o.InterfaceC5364Ow
    public void KWHzl() {
        T t = this.EZpvd;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof QX) {
            ((QX) t).OLrzqt().prepareToDraw();
        }
    }
}
