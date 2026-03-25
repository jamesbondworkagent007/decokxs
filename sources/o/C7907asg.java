package o;

import android.graphics.Outline;

/* JADX INFO: renamed from: o.asg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7907asg {
    public float AEQbTJ;
    public boolean EZpvd;
    public C7350aiF KWHzl;
    public int OLrzqt;
    public float copydefault;
    public float djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(float f) {
        this.AEQbTJ = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(int i, C7350aiF c7350aiF, float f, float f2) {
        this.OLrzqt = i;
        this.KWHzl = c7350aiF;
        this.djBIcL = f;
        this.copydefault = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(boolean z) {
        this.EZpvd = z;
    }

    public void AEQbTJ(android.view.View view) {
        if (this.EZpvd) {
            C7833arL.KWHzl("Do not setting corner with method 'setCornerRadiusWithDirection' and setting shadow with method 'setShadow', or shadow will be clipped!");
            return;
        }
        view.setElevation(this.djBIcL);
        view.setOutlineProvider(new android.view.ViewOutlineProvider() { // from class: o.asg.4
            @Override // android.view.ViewOutlineProvider
            public void getOutline(android.view.View view2, Outline outline) {
                int iCopydefault = C7907asg.this.KWHzl.copydefault();
                int iAEQbTJ = C7907asg.this.KWHzl.AEQbTJ();
                int width = view2.getWidth();
                int iCopydefault2 = C7907asg.this.KWHzl.copydefault();
                int height = view2.getHeight();
                int iAEQbTJ2 = C7907asg.this.KWHzl.AEQbTJ();
                outline.setRoundRect(iCopydefault, iAEQbTJ, width + iCopydefault2, height + iAEQbTJ2, C7907asg.this.AEQbTJ);
                if (C7907asg.this.copydefault < 0.0f) {
                    C7907asg.this.copydefault = 0.0f;
                }
                if (C7907asg.this.copydefault > 1.0f) {
                    C7907asg.this.copydefault = 1.0f;
                }
                outline.setAlpha((float) (((double) C7907asg.this.copydefault) * 0.99d));
            }
        });
        view.setClipToOutline(false);
    }
}
