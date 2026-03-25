package o;

import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wYM implements InterfaceC52764wXm, InterfaceC55066xct {
    public android.graphics.drawable.Drawable AEQbTJ;
    public android.graphics.drawable.Drawable AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public final android.widget.CompoundButton AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public android.graphics.drawable.Drawable EZpvd;
    public android.graphics.drawable.Drawable KWHzl;
    public int OLrzqt;
    public int copydefault;
    public android.graphics.drawable.Drawable djBIcL;
    public int fetchVPNInfo;
    public int gEmmrt;
    public android.graphics.drawable.Drawable isConnected;
    public int valueOf;
    public final C52766wXo values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.valueOf;
    }

    public wYM(@NotNull android.widget.CompoundButton compoundButton) {
        Intrinsics.checkNotNullParameter(compoundButton, "");
        this.AuCTel = compoundButton;
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.wYR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wYM.AEQbTJ(this.AEQbTJ);
            }
        });
        this.values = new C52766wXo(compoundButton);
        this.fetchVPNInfo = -1;
    }

    public final C55065xcs valueOf() {
        return (C55065xcs) this.DbNXlk.getValue();
    }

    public static final C55065xcs AEQbTJ(wYM wym) {
        return new C55065xcs(wym.AuCTel, 0, 2, null);
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        valueOf().OLrzqt(attributeSet, i, i2);
        this.values.OLrzqt(attributeSet, i, i2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.AuCTel.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.invokespecialODCBUN, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.KWHzl = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.invokespecialDaTmkG);
            this.isConnected = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.invokespecialaKhcqp);
            this.OLrzqt = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.invokespecialRuDPQV, 0);
            this.copydefault = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.invokespecialROgMPW, 0);
            this.EZpvd = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.invokespecialDaTmkG);
            this.AhwBna = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.invokespecialatDTRm, 0);
            this.gEmmrt = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.invokespecialaVhqwO, 0);
            this.AYXKKw = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.invokespecialaGOrKO);
            this.AEQbTJ = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.invokespecialRtjmuc);
            this.djBIcL = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.invokespecialhOMIpD);
            if (AEQbTJ() >= -4) {
                EZpvd(this.OLrzqt, this.copydefault, this.EZpvd);
            } else {
                EZpvd(this.AhwBna, this.gEmmrt, this.AYXKKw);
            }
            this.fetchVPNInfo = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.invokespecialDPHOMC, ContextCompat.getColor(this.AuCTel.getContext(), C52761wXj.Activity.UfveVb));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wXo.getTextSizeBySize$default(o.wXo, int, float, int, java.lang.Object):float */
    public final void EZpvd(int i, int i2, android.graphics.drawable.Drawable drawable) {
        this.AkhnZx = i;
        this.valueOf = i2;
        this.KWHzl = drawable;
        java.lang.CharSequence text = this.AuCTel.getText();
        Intrinsics.checkNotNullExpressionValue(text, "");
        if (text.length() > 0) {
            android.widget.CompoundButton compoundButton = this.AuCTel;
            compoundButton.setPadding(i2, compoundButton.getPaddingTop(), this.AuCTel.getPaddingRight(), this.AuCTel.getPaddingBottom());
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i);
        }
        android.graphics.drawable.Drawable drawable2 = this.isConnected;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, i, i);
        }
        this.AuCTel.setButtonDrawable(drawable);
        android.content.res.ColorStateList textColors = this.AuCTel.getTextColors();
        int iCopydefault = this.values.copydefault(AEQbTJ(), 0);
        if (iCopydefault != 0) {
            TextViewCompat.setTextAppearance(this.AuCTel, iCopydefault);
            this.AuCTel.setTextColor(textColors);
        }
        this.AuCTel.setTextSize(0, C52766wXo.getTextSizeBySize$default(this.values, AEQbTJ(), 0.0f, 2, null));
        int iEZpvd = this.values.EZpvd(AEQbTJ());
        if (iEZpvd > 0) {
            TextViewCompat.setLineHeight(this.AuCTel, iEZpvd);
        }
    }

    public final void gEmmrt() {
        this.AuCTel.setButtonDrawable(this.KWHzl);
    }

    public int AEQbTJ() {
        int iCopydefault = valueOf().copydefault();
        if (iCopydefault == -3) {
            return -4;
        }
        return iCopydefault;
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        if (i >= -4) {
            valueOf().setOKDSSize(-4);
            EZpvd(this.OLrzqt, this.copydefault, this.EZpvd);
        } else {
            valueOf().setOKDSSize(-5);
            EZpvd(this.AhwBna, this.gEmmrt, this.AYXKKw);
        }
    }
}
