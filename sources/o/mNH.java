package o;

import android.os.Build;
import android.view.WindowManager;
import com.engagelab.privates.core.constants.MTCoreConstants;

/* JADX INFO: loaded from: classes8.dex */
public class mNH extends mNG {
    public boolean AEQbTJ = false;
    public int AYXKKw;
    public final WindowManager.LayoutParams EZpvd;
    public final android.content.Context KWHzl;
    public android.view.View OLrzqt;
    public mNK copydefault;
    public final android.view.WindowManager gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mNG
    public int OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mNG
    public void OLrzqt(android.view.View view) {
        this.OLrzqt = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mNG
    public int valueOf() {
        return this.AYXKKw;
    }

    public mNH(android.content.Context context, mNK mnk) {
        this.KWHzl = context;
        this.copydefault = mnk;
        this.gEmmrt = (android.view.WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.EZpvd = layoutParams;
        layoutParams.format = 1;
        layoutParams.flags = 552;
        layoutParams.windowAnimations = 0;
    }

    @Override // o.mNG
    public void copydefault(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.EZpvd;
        layoutParams.width = i;
        layoutParams.height = i2;
    }

    @Override // o.mNG
    public void EZpvd(int i, int i2, int i3) {
        WindowManager.LayoutParams layoutParams = this.EZpvd;
        layoutParams.gravity = i;
        this.valueOf = i2;
        layoutParams.x = i2;
        this.AYXKKw = i3;
        layoutParams.y = i3;
    }

    @Override // o.mNG
    public void AhwBna() {
        if (mNM.EZpvd()) {
            gEmmrt();
        } else {
            gEmmrt();
        }
    }

    public final void gEmmrt() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.EZpvd.type = 2038;
        } else {
            this.EZpvd.type = MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED;
        }
        ActivityC32058mNy.EZpvd(this.KWHzl, new mNK() { // from class: o.mNH.3
            @Override // o.mNK
            public void bj_() {
                mNH.this.KWHzl();
                if (mNH.this.copydefault != null) {
                    mNH.this.copydefault.bj_();
                }
            }

            @Override // o.mNK
            public void AEQbTJ() {
                if (mNH.this.copydefault != null) {
                    mNH.this.copydefault.AEQbTJ();
                }
            }
        });
    }

    public final void KWHzl() {
        try {
            this.gEmmrt.addView(this.OLrzqt, this.EZpvd);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("FloatPhone", e);
        }
    }

    public final void AYXKKw() {
        try {
            this.gEmmrt.removeView(this.OLrzqt);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("FloatPhone", e);
        }
    }

    @Override // o.mNG
    public void EZpvd() {
        this.AEQbTJ = true;
        AYXKKw();
    }

    @Override // o.mNG
    public void AEQbTJ(int i, int i2) {
        if (this.AEQbTJ) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.EZpvd;
        this.valueOf = i;
        layoutParams.x = i;
        this.AYXKKw = i2;
        layoutParams.y = i2;
        this.gEmmrt.updateViewLayout(this.OLrzqt, layoutParams);
    }

    @Override // o.mNG
    public void copydefault(int i) {
        if (this.AEQbTJ) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.EZpvd;
        this.valueOf = i;
        layoutParams.x = i;
        this.gEmmrt.updateViewLayout(this.OLrzqt, layoutParams);
    }

    @Override // o.mNG
    public void EZpvd(int i) {
        if (this.AEQbTJ) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.EZpvd;
        this.AYXKKw = i;
        layoutParams.y = i;
        this.gEmmrt.updateViewLayout(this.OLrzqt, layoutParams);
    }

    @Override // o.mNG
    public void OLrzqt(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.EZpvd;
        layoutParams.width = i;
        layoutParams.x = i2;
        copydefault(i2);
    }

    @Override // o.mNG
    public int copydefault() {
        return this.EZpvd.width;
    }

    @Override // o.mNG
    public int AEQbTJ() {
        return this.OLrzqt.getHeight();
    }
}
