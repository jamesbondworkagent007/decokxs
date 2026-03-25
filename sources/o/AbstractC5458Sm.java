package o;

import android.graphics.drawable.Animatable;
import o.InterfaceC5460So;

/* JADX INFO: renamed from: o.Sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5458Sm<Z> extends AbstractC5461Sp<android.widget.ImageView, Z> implements InterfaceC5460So.ActionBar {
    public Animatable KWHzl;

    public abstract void AEQbTJ(@androidx.annotation.Nullable Z z);

    public AbstractC5458Sm(android.widget.ImageView imageView) {
        super(imageView);
    }

    public void EZpvd(android.graphics.drawable.Drawable drawable) {
        ((android.widget.ImageView) this.gEmmrt).setImageDrawable(drawable);
    }

    @Override // o.AbstractC5461Sp, o.AbstractC5453Sh, o.InterfaceC5462Sq
    public void KWHzl(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        super.KWHzl(drawable);
        OLrzqt((java.lang.Object) null);
        EZpvd(drawable);
    }

    @Override // o.AbstractC5453Sh, o.InterfaceC5462Sq
    public void AEQbTJ(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        super.AEQbTJ(drawable);
        OLrzqt((java.lang.Object) null);
        EZpvd(drawable);
    }

    @Override // o.AbstractC5461Sp, o.AbstractC5453Sh, o.InterfaceC5462Sq
    public void a_(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        super.a_(drawable);
        Animatable animatable = this.KWHzl;
        if (animatable != null) {
            animatable.stop();
        }
        OLrzqt((java.lang.Object) null);
        EZpvd(drawable);
    }

    @Override // o.InterfaceC5462Sq
    public void copydefault(@androidx.annotation.NonNull Z z, @androidx.annotation.Nullable InterfaceC5460So<? super Z> interfaceC5460So) {
        if (interfaceC5460So == null || !interfaceC5460So.OLrzqt(z, this)) {
            OLrzqt(z);
        } else {
            copydefault(z);
        }
    }

    @Override // o.AbstractC5453Sh, o.InterfaceC5441Rv
    public void AYXKKw() {
        Animatable animatable = this.KWHzl;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // o.AbstractC5453Sh, o.InterfaceC5441Rv
    public void AhwBna() {
        Animatable animatable = this.KWHzl;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void OLrzqt(@androidx.annotation.Nullable Z z) {
        AEQbTJ(z);
        copydefault(z);
    }

    public final void copydefault(@androidx.annotation.Nullable Z z) {
        if (!(z instanceof Animatable)) {
            this.KWHzl = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.KWHzl = animatable;
        animatable.start();
    }
}
