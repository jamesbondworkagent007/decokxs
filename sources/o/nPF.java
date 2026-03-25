package o;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nPF<T extends android.graphics.drawable.Drawable> extends AbstractC5458Sm<T> {
    public final android.widget.ImageView DbNXlk;
    public final C34059nPx isConnected;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nPF(@NotNull android.widget.ImageView imageView, @NotNull C34059nPx c34059nPx) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(c34059nPx, "");
        this.DbNXlk = imageView;
        this.isConnected = c34059nPx;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nPF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.So<? super T extends android.graphics.drawable.Drawable> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5458Sm, o.InterfaceC5462Sq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull T t, InterfaceC5460So<? super T> interfaceC5460So) {
        Intrinsics.checkNotNullParameter(t, "");
        nPB npbEZpvd = nPJ.OLrzqt.EZpvd(this.isConnected, t.getIntrinsicWidth(), t.getIntrinsicHeight());
        pUU.EZpvd("DynamicResizingTarget", "onResourceReady: intrinsicWidth: " + t.getIntrinsicWidth() + ", intrinsicHeight: " + t.getIntrinsicHeight() + ", finalWidth: " + npbEZpvd.OLrzqt() + ", finalHeight: " + npbEZpvd.copydefault() + ", orientation: " + npbEZpvd.EZpvd());
        android.widget.ImageView imageView = this.DbNXlk;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = npbEZpvd.OLrzqt();
            layoutParams.height = npbEZpvd.copydefault();
            imageView.setLayoutParams(layoutParams);
            this.DbNXlk.requestLayout();
            super.copydefault(t, interfaceC5460So);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.AbstractC5458Sm
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(T t) {
        pUU.EZpvd("DynamicResizingTarget", "setResource: resource exists: " + (t != null));
        this.DbNXlk.setImageDrawable(t);
    }

    @Override // o.AbstractC5458Sm, o.AbstractC5461Sp, o.AbstractC5453Sh, o.InterfaceC5462Sq
    public void KWHzl(android.graphics.drawable.Drawable drawable) {
        super.KWHzl(drawable);
        pUU.EZpvd("DynamicResizingTarget", "onLoadStarted: placeholder exists: " + (drawable != null));
        this.DbNXlk.setImageDrawable(drawable);
    }

    @Override // o.AbstractC5458Sm, o.AbstractC5453Sh, o.InterfaceC5462Sq
    public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
        super.AEQbTJ(drawable);
        pUU.EZpvd("DynamicResizingTarget", "onLoadStarted: errorDrawable exists: " + (drawable != null));
        this.DbNXlk.setImageDrawable(drawable);
    }

    @Override // o.AbstractC5461Sp, o.InterfaceC5462Sq
    public void OLrzqt(@NotNull InterfaceC5457Sl interfaceC5457Sl) {
        Intrinsics.checkNotNullParameter(interfaceC5457Sl, "");
        if (this.DbNXlk.getWidth() > 0 && this.DbNXlk.getHeight() > 0) {
            interfaceC5457Sl.OLrzqt(this.DbNXlk.getWidth(), this.DbNXlk.getHeight());
        } else {
            super.OLrzqt(interfaceC5457Sl);
        }
    }
}
