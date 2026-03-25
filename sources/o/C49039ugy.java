package o;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.ViewGroup;
import androidx.camera.video.AudioStats;
import com.okinc.okuser.data.User;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ugy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49039ugy extends AbstractC48904ueV {
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public C49034ugt OLrzqt;
    public final InterfaceC56387yDm copydefault;

    public C49039ugy(java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, final java.lang.Integer num, final java.lang.Float f, boolean z) {
        super("edit_button_watermark", charSequence, drawable, z);
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.ugx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C49039ugy.KWHzl(num));
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ugw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49039ugy.AhwBna();
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ugA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(C49039ugy.AEQbTJ(f));
            }
        });
    }

    public static final int KWHzl(java.lang.Integer num) {
        return num != null ? num.intValue() : Color.parseColor("#80AAAAAA");
    }

    public final int AYXKKw() {
        return ((java.lang.Number) this.copydefault.getValue()).intValue();
    }

    public static final InterfaceC47278tmy AhwBna() {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB();
    }

    public final InterfaceC47278tmy gEmmrt() {
        return (InterfaceC47278tmy) this.AYXKKw.getValue();
    }

    public final float djBIcL() {
        return ((java.lang.Number) this.AhwBna.getValue()).floatValue();
    }

    public static final float AEQbTJ(java.lang.Float f) {
        if (f != null) {
            return C56548yJl.KWHzl(f.floatValue(), 0.0f, 1.0f);
        }
        return 0.8f;
    }

    @Override // o.InterfaceC48901ueS
    public boolean KWHzl() {
        return isChecked();
    }

    @Override // o.AbstractC48896ueN
    public boolean OLrzqt() {
        return gEmmrt().AkhnZx();
    }

    @Override // o.AbstractC48904ueV, o.InterfaceC48901ueS
    public java.lang.CharSequence OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.CharSequence charSequenceOLrzqt = super.OLrzqt(context);
        if (charSequenceOLrzqt != null) {
            return charSequenceOLrzqt;
        }
        java.lang.String string = context.getResources().getString(C48931uew.Activity.ejfBZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.InterfaceC48901ueS
    public android.view.View KWHzl(@NotNull android.content.Context context, @NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC48969ufh, "");
        C49034ugt c49034ugt = null;
        if (this.OLrzqt == null) {
            C49034ugt c49034ugtAEQbTJ = C49034ugt.AEQbTJ(android.view.LayoutInflater.from(context));
            this.OLrzqt = c49034ugtAEQbTJ;
            if (c49034ugtAEQbTJ == null) {
                Intrinsics.gEmmrt("");
                c49034ugtAEQbTJ = null;
            }
            c49034ugtAEQbTJ.getRoot().setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        C49034ugt c49034ugt2 = this.OLrzqt;
        if (c49034ugt2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49034ugt = c49034ugt2;
        }
        return c49034ugt.getRoot();
    }

    @Override // o.InterfaceC48901ueS
    public void EZpvd(@NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        Intrinsics.checkNotNullParameter(interfaceC48969ufh, "");
        if (KWHzl()) {
            copydefault(interfaceC48969ufh);
            setChecked(false);
        } else {
            EZpvd(true, interfaceC48969ufh);
            setChecked(true);
        }
        InterfaceC48897ueO interfaceC48897ueOAEQbTJ = AEQbTJ();
        if (interfaceC48897ueOAEQbTJ != null) {
            interfaceC48897ueOAEQbTJ.KWHzl();
        }
    }

    @Override // o.InterfaceC48901ueS
    public void copydefault(@NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        Intrinsics.checkNotNullParameter(interfaceC48969ufh, "");
        EZpvd(false, interfaceC48969ufh);
        setChecked(false);
        InterfaceC48897ueO interfaceC48897ueOAEQbTJ = AEQbTJ();
        if (interfaceC48897ueOAEQbTJ != null) {
            interfaceC48897ueOAEQbTJ.KWHzl();
        }
    }

    public final void EZpvd(boolean z, InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        C49034ugt c49034ugt = this.OLrzqt;
        if (c49034ugt == null) {
            Intrinsics.gEmmrt("");
            c49034ugt = null;
        }
        android.widget.ImageView imageView = c49034ugt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        if (z) {
            android.graphics.Rect imageBounds = interfaceC48969ufh.getImageBounds();
            if (imageBounds == null) {
                imageView.setVisibility(4);
                return;
            }
            imageView.setVisibility(0);
            try {
                User userOLrzqt = gEmmrt().OLrzqt();
                C49316umJ c49316umJ = new C49316umJ(java.lang.String.valueOf(userOLrzqt != null ? userOLrzqt.getNickname() : null));
                float fDpInt$default = C55298xhM.dpInt$default(32.0f, (android.content.Context) null, 1, (java.lang.Object) null);
                c49316umJ.OLrzqt(new C49312umF(fDpInt$default, fDpInt$default, AudioStats.AUDIO_AMPLITUDE_NONE));
                c49316umJ.KWHzl(Color.rgb(Color.red(AYXKKw()), Color.green(AYXKKw()), Color.blue(AYXKKw())));
                c49316umJ.AEQbTJ(-15.0d);
                c49316umJ.AEQbTJ(Color.alpha(AYXKKw()));
                c49316umJ.KWHzl(12.0d);
                int iHeight = (int) (imageBounds.height() * djBIcL());
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.width = imageBounds.width();
                    marginLayoutParams.height = iHeight;
                    marginLayoutParams.setMarginStart(imageBounds.left);
                    marginLayoutParams.topMargin = imageBounds.top;
                    imageView.requestLayout();
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.setImageBitmap(C49310umD.AEQbTJ(imageView.getContext(), EZpvd(imageBounds.width(), iHeight)).EZpvd(c49316umJ).EZpvd(true).EZpvd().copydefault());
                    return;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return;
            } catch (java.lang.OutOfMemoryError e2) {
                e2.printStackTrace();
                return;
            }
        }
        imageView.setVisibility(4);
    }

    public final android.graphics.Bitmap EZpvd(int i, int i2) {
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        new android.graphics.Canvas(bitmapCreateBitmap).drawColor(0);
        return bitmapCreateBitmap;
    }
}
