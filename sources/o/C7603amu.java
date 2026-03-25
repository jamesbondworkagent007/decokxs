package o;

import com.immomo.mls.fun.ui.uilib.MLNOKButton;
import com.okinc.uilab.shape.helper.ShapeGradientAngle;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC7383aim;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.amu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7603amu extends C52794wYp implements InterfaceC7383aim<MLNOKButton>, InterfaceC7410ajM, InterfaceC7776aqH {
    public MLNOKButton EZpvd;
    public InterfaceC7383aim.ActionBar KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    /* JADX DEBUG: Possible override for method o.wYp.OLrzqt()I */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public MLNOKButton getUserdata() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC7410ajM
    public void setAddShadow(int i, C7350aiF c7350aiF, float f, float f2) {
    }

    @Override // o.InterfaceC7410ajM
    public void setBgDrawable(android.graphics.drawable.Drawable drawable) {
    }

    @Override // o.InterfaceC7410ajM
    public void setDrawRadiusBackground(boolean z) {
    }

    @Override // o.InterfaceC7407ajJ
    public void setDrawRipple(boolean z) {
    }

    @Override // o.InterfaceC7409ajL
    public void setMaskRadius(int i, float f) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMlnokButton(@NotNull MLNOKButton mLNOKButton) {
        Intrinsics.checkNotNullParameter(mLNOKButton, "");
        this.EZpvd = mLNOKButton;
    }

    @Override // o.InterfaceC7410ajM
    public void setRadiusColor(int i) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.KWHzl = actionBar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7603amu(@NotNull android.content.Context context, @NotNull MLNOKButton mLNOKButton) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(mLNOKButton, "");
        this.EZpvd = mLNOKButton;
        setViewLifeCycleCallback(mLNOKButton);
    }

    /* JADX DEBUG: Possible override for method o.wYp.AEQbTJ()Landroid/graphics/Rect; */
    public final void AEQbTJ() {
        getNewProxyInstance().KWHzl(this, fARcdN());
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeWidth(float f) {
        fARcdN().fIwbmz((int) f);
        AEQbTJ();
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeColor(int i) {
        fARcdN().DbNXlk(i);
        AEQbTJ();
    }

    @Override // o.InterfaceC7409ajL
    public void setCornerRadius(float f) {
        fARcdN().OLrzqt(f);
        AEQbTJ();
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        C55279xgu c55279xguFARcdN = fARcdN();
        c55279xguFARcdN.AEQbTJ(f);
        c55279xguFARcdN.KWHzl(f2);
        c55279xguFARcdN.copydefault(f3);
        c55279xguFARcdN.copydefault(f4);
        AEQbTJ();
    }

    @Override // o.InterfaceC7409ajL
    public void setRadius(int i, float f) {
        if (i == 1) {
            fARcdN().AEQbTJ(f);
        } else if (i == 2) {
            fARcdN().KWHzl(f);
        } else if (i == 4) {
            fARcdN().copydefault(f);
        } else if (i == 8) {
            fARcdN().EZpvd(f);
        } else if (i == 15) {
            fARcdN().OLrzqt(f);
        }
        AEQbTJ();
    }

    @Override // o.InterfaceC7409ajL
    public float getStrokeWidth() {
        return fARcdN().AubY();
    }

    @Override // o.InterfaceC7409ajL
    public float getCornerRadiusWithDirection(int i) {
        if (i == 1) {
            return fARcdN().EZpvd();
        }
        if (i == 2) {
            return fARcdN().AEQbTJ();
        }
        if (i == 4) {
            return fARcdN().KWHzl();
        }
        if (i == 8) {
            return fARcdN().copydefault();
        }
        return fARcdN().OLrzqt();
    }

    @Override // o.InterfaceC7409ajL
    public float[] getRadii() {
        return new float[]{fARcdN().EZpvd(), fARcdN().AEQbTJ(), fARcdN().fJNWhG(), fARcdN().fIwbmz()};
    }

    @Override // o.InterfaceC7410ajM
    public void setBgColor(int i) {
        C55279xgu c55279xguFARcdN = fARcdN();
        c55279xguFARcdN.copydefault(false);
        c55279xguFARcdN.isConnected(i);
        AEQbTJ();
    }

    @Override // o.InterfaceC7410ajM
    public int getBgColor() {
        return fARcdN().hDKMBd();
    }

    @Override // o.InterfaceC7410ajM
    public void setGradientColor(int i, int i2, int i3) {
        int value;
        C55279xgu c55279xguFARcdN = fARcdN();
        c55279xguFARcdN.copydefault(false);
        c55279xguFARcdN.AEQbTJ(i);
        c55279xguFARcdN.copydefault(i2);
        if (i3 == 1) {
            value = ShapeGradientAngle.LEFT_RIGHT.getValue();
        } else if (i3 == 2) {
            value = ShapeGradientAngle.RIGHT_LEFT.getValue();
        } else if (i3 == 3) {
            value = ShapeGradientAngle.TOP_BOTTOM.getValue();
        } else if (i3 == 4) {
            value = ShapeGradientAngle.BOTTOM_TOP.getValue();
        } else {
            value = ShapeGradientAngle.LEFT_RIGHT.getValue();
        }
        c55279xguFARcdN.EZpvd(value);
        AEQbTJ();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.KWHzl;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // o.C52794wYp, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.KWHzl;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
    }
}
