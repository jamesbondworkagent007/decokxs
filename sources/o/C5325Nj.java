package o;

import android.content.DialogInterface;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import o.MW;

/* JADX INFO: renamed from: o.Nj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5325Nj {
    public boolean AYXKKw;
    public android.view.ViewGroup EZpvd;
    public android.content.Context KWHzl;
    public android.view.View OLrzqt;
    public android.view.ViewGroup copydefault;
    public android.view.animation.Animation djBIcL;
    public android.view.ViewGroup fARcdN;
    public android.view.animation.Animation fetchVPNInfo;
    public android.app.Dialog gEmmrt;
    public MX isConnected;
    public boolean valueOf;
    public InterfaceC5316Na values;
    public int AEQbTJ = 80;
    public boolean AhwBna = true;
    public View.OnKeyListener DbNXlk = new View.OnKeyListener() { // from class: o.Nj.3
        @Override // android.view.View.OnKeyListener
        public boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
            if (i != 4 || keyEvent.getAction() != 0 || !C5325Nj.this.AhwBna()) {
                return false;
            }
            C5325Nj.this.copydefault();
            return true;
        }
    };
    public final View.OnTouchListener AkhnZx = new View.OnTouchListener() { // from class: o.Nj.5
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            C5325Nj.this.copydefault();
            return false;
        }
    };

    public boolean valueOf() {
        return false;
    }

    public C5325Nj(android.content.Context context) {
        this.KWHzl = context;
    }

    public void djBIcL() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this.KWHzl);
        if (valueOf()) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) layoutInflaterFrom.inflate(MW.StateListAnimator.EZpvd, (android.view.ViewGroup) null, false);
            this.EZpvd = viewGroup;
            viewGroup.setBackgroundColor(0);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.EZpvd.findViewById(MW.Activity.AEQbTJ);
            this.copydefault = viewGroup2;
            layoutParams.leftMargin = 30;
            layoutParams.rightMargin = 30;
            viewGroup2.setLayoutParams(layoutParams);
            AEQbTJ();
            this.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.Nj.2
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    C5325Nj.this.copydefault();
                }
            });
        } else {
            MX mx = this.isConnected;
            if (mx.fetchVPNInfo == null) {
                mx.fetchVPNInfo = (android.view.ViewGroup) ((android.app.Activity) this.KWHzl).getWindow().getDecorView();
            }
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) layoutInflaterFrom.inflate(MW.StateListAnimator.EZpvd, this.isConnected.fetchVPNInfo, false);
            this.fARcdN = viewGroup3;
            viewGroup3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            int i = this.isConnected.AxsJAY;
            if (i != -1) {
                this.fARcdN.setBackgroundColor(i);
            }
            android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) this.fARcdN.findViewById(MW.Activity.AEQbTJ);
            this.copydefault = viewGroup4;
            viewGroup4.setLayoutParams(layoutParams);
        }
        OLrzqt(true);
    }

    public void gEmmrt() {
        this.djBIcL = OLrzqt();
        this.fetchVPNInfo = AYXKKw();
    }

    public void AEQbTJ(android.view.View view, boolean z) {
        this.OLrzqt = view;
        this.AhwBna = z;
        AkhnZx();
    }

    public void AkhnZx() {
        if (valueOf()) {
            values();
        } else {
            if (AhwBna()) {
                return;
            }
            this.valueOf = true;
            OLrzqt(this.fARcdN);
            this.fARcdN.requestFocus();
        }
    }

    public final void OLrzqt(android.view.View view) {
        this.isConnected.fetchVPNInfo.addView(view);
        if (this.AhwBna) {
            this.copydefault.startAnimation(this.djBIcL);
        }
    }

    public boolean AhwBna() {
        if (valueOf()) {
            return false;
        }
        return this.fARcdN.getParent() != null || this.valueOf;
    }

    public void copydefault() {
        if (valueOf()) {
            EZpvd();
            return;
        }
        if (this.AYXKKw) {
            return;
        }
        if (this.AhwBna) {
            this.fetchVPNInfo.setAnimationListener(new Animation.AnimationListener() { // from class: o.Nj.4
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(android.view.animation.Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(android.view.animation.Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(android.view.animation.Animation animation) {
                    C5325Nj.this.KWHzl();
                }
            });
            this.copydefault.startAnimation(this.fetchVPNInfo);
        } else {
            KWHzl();
        }
        this.AYXKKw = true;
    }

    public void KWHzl() {
        this.isConnected.fetchVPNInfo.post(new java.lang.Runnable() { // from class: o.Nj.1
            @Override // java.lang.Runnable
            public void run() {
                C5325Nj c5325Nj = C5325Nj.this;
                c5325Nj.isConnected.fetchVPNInfo.removeView(c5325Nj.fARcdN);
                C5325Nj.this.valueOf = false;
                C5325Nj.this.AYXKKw = false;
                if (C5325Nj.this.values != null) {
                    C5325Nj.this.values.AEQbTJ(C5325Nj.this);
                }
            }
        });
    }

    public final android.view.animation.Animation OLrzqt() {
        return android.view.animation.AnimationUtils.loadAnimation(this.KWHzl, C5321Nf.EZpvd(this.AEQbTJ, true));
    }

    public final android.view.animation.Animation AYXKKw() {
        return android.view.animation.AnimationUtils.loadAnimation(this.KWHzl, C5321Nf.EZpvd(this.AEQbTJ, false));
    }

    public void OLrzqt(boolean z) {
        android.view.ViewGroup viewGroup = valueOf() ? this.EZpvd : this.fARcdN;
        viewGroup.setFocusable(z);
        viewGroup.setFocusableInTouchMode(z);
        if (z) {
            viewGroup.setOnKeyListener(this.DbNXlk);
        } else {
            viewGroup.setOnKeyListener(null);
        }
    }

    public C5325Nj KWHzl(boolean z) {
        android.view.ViewGroup viewGroup = this.fARcdN;
        if (viewGroup != null) {
            android.view.View viewFindViewById = viewGroup.findViewById(MW.Activity.AhwBna);
            if (z) {
                viewFindViewById.setOnTouchListener(this.AkhnZx);
            } else {
                viewFindViewById.setOnTouchListener(null);
            }
        }
        return this;
    }

    public void DbNXlk() {
        android.app.Dialog dialog = this.gEmmrt;
        if (dialog != null) {
            dialog.setCancelable(this.isConnected.OLrzqt);
        }
    }

    public android.view.View AEQbTJ(int i) {
        return this.copydefault.findViewById(i);
    }

    public void AEQbTJ() {
        if (this.EZpvd != null) {
            android.app.Dialog dialog = new android.app.Dialog(this.KWHzl, MW.Application.EZpvd);
            this.gEmmrt = dialog;
            dialog.setCancelable(this.isConnected.OLrzqt);
            this.gEmmrt.setContentView(this.EZpvd);
            android.view.Window window = this.gEmmrt.getWindow();
            if (window != null) {
                window.setWindowAnimations(MW.Application.AEQbTJ);
                window.setGravity(17);
            }
            this.gEmmrt.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.Nj.9
                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(android.content.DialogInterface dialogInterface) {
                    if (C5325Nj.this.values != null) {
                        C5325Nj.this.values.AEQbTJ(C5325Nj.this);
                    }
                }
            });
        }
    }

    public final void values() {
        android.app.Dialog dialog = this.gEmmrt;
        if (dialog != null) {
            dialog.show();
        }
    }

    public final void EZpvd() {
        android.app.Dialog dialog = this.gEmmrt;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
