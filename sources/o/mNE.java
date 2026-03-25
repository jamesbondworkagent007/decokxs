package o;

import android.animation.ValueAnimator;
import android.view.View;
import o.mND;

/* JADX INFO: loaded from: classes8.dex */
public class mNE extends mNF {
    public float AEQbTJ;
    public android.animation.TimeInterpolator AYXKKw;
    public float AkhnZx;
    public android.animation.ValueAnimator EZpvd;
    public float KWHzl;
    public boolean OLrzqt;
    public mND.StateListAnimator copydefault;
    public mNG djBIcL;
    public float fetchVPNInfo;
    public mNC gEmmrt;
    public int valueOf;
    public boolean values = true;
    public boolean AhwBna = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mNF
    public boolean values() {
        return this.OLrzqt;
    }

    private mNE() {
    }

    public mNE(mND.StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator;
        if (stateListAnimator.valueOf == 0) {
            this.djBIcL = new mNH(stateListAnimator.KWHzl, stateListAnimator.fetchVPNInfo);
        } else {
            this.djBIcL = new mNH(stateListAnimator.KWHzl, stateListAnimator.fetchVPNInfo);
            gEmmrt();
        }
        mNG mng = this.djBIcL;
        mND.StateListAnimator stateListAnimator2 = this.copydefault;
        mng.copydefault(stateListAnimator2.fJNWhG, stateListAnimator2.djBIcL);
        mNG mng2 = this.djBIcL;
        mND.StateListAnimator stateListAnimator3 = this.copydefault;
        mng2.EZpvd(stateListAnimator3.copydefault, stateListAnimator3.fARcdN, stateListAnimator3.ejfBZ);
        this.djBIcL.OLrzqt(this.copydefault.fIwbmz);
        mND.StateListAnimator stateListAnimator4 = this.copydefault;
        this.gEmmrt = new mNC(stateListAnimator4.KWHzl, stateListAnimator4.values, stateListAnimator4.EZpvd, new mNL() { // from class: o.mNE.1
            @Override // o.mNL
            public void AEQbTJ() {
                if (mNE.this.OLrzqt) {
                    mNE.this.isConnected();
                }
            }

            @Override // o.mNL
            public void EZpvd() {
                mNE.this.djBIcL();
            }

            @Override // o.mNL
            public void KWHzl() {
                if (!mNE.this.copydefault.AEQbTJ) {
                    mNE.this.djBIcL();
                }
                if (mNE.this.copydefault.AuCTel != null) {
                    mNE.this.copydefault.AuCTel.EZpvd();
                }
            }
        });
    }

    @Override // o.mNF
    public void isConnected() {
        if (this.values) {
            this.djBIcL.AhwBna();
            this.values = false;
            this.OLrzqt = true;
        } else {
            if (this.OLrzqt) {
                return;
            }
            KWHzl().setVisibility(0);
            this.OLrzqt = true;
        }
        mNN mnn = this.copydefault.AuCTel;
        if (mnn != null) {
            mnn.AYXKKw();
        }
    }

    @Override // o.mNF
    public void djBIcL() {
        if (this.values || !this.OLrzqt) {
            return;
        }
        KWHzl().setVisibility(4);
        this.OLrzqt = false;
        mNN mnn = this.copydefault.AuCTel;
        if (mnn != null) {
            mnn.KWHzl();
        }
    }

    @Override // o.mNF
    public void EZpvd() {
        this.djBIcL.EZpvd();
        this.OLrzqt = false;
        mNN mnn = this.copydefault.AuCTel;
        if (mnn != null) {
            mnn.OLrzqt();
        }
        this.copydefault.KWHzl.unregisterReceiver(this.gEmmrt);
    }

    @Override // o.mNF
    public void EZpvd(int i) {
        AEQbTJ();
        this.copydefault.ejfBZ = i;
        this.djBIcL.EZpvd(i);
    }

    @Override // o.mNF
    public int valueOf() {
        return this.djBIcL.OLrzqt();
    }

    @Override // o.mNF
    public int AhwBna() {
        return this.djBIcL.valueOf();
    }

    @Override // o.mNF
    public android.view.View KWHzl() {
        this.valueOf = android.view.ViewConfiguration.get(this.copydefault.KWHzl).getScaledTouchSlop();
        return this.copydefault.fIwbmz;
    }

    public final void AEQbTJ() {
        if (this.copydefault.valueOf == 0) {
            throw new java.lang.IllegalArgumentException("FloatWindow of this tag is not allowed to move!");
        }
    }

    public final void gEmmrt() {
        if (this.copydefault.valueOf != 1) {
            KWHzl().setOnTouchListener(new View.OnTouchListener() { // from class: o.mNE.3
                public float AEQbTJ;
                public float EZpvd;
                public float KWHzl;
                public int OLrzqt;
                public float copydefault;
                public int valueOf;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    int iAEQbTJ;
                    int i;
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        boolean z = true;
                        if (action == 1) {
                            mNE.this.fetchVPNInfo = motionEvent.getRawX();
                            mNE.this.AkhnZx = motionEvent.getRawY();
                            mNE mne = mNE.this;
                            if (java.lang.Math.abs(mne.fetchVPNInfo - mNE.this.KWHzl) <= mNE.this.valueOf && java.lang.Math.abs(mNE.this.AkhnZx - mNE.this.AEQbTJ) <= mNE.this.valueOf) {
                                z = false;
                            }
                            mne.AhwBna = z;
                            int i2 = mNE.this.copydefault.valueOf;
                            if (i2 == 3) {
                                int iOLrzqt = mNE.this.djBIcL.OLrzqt();
                                if ((iOLrzqt * 2) + view.getWidth() > mNQ.AEQbTJ(mNE.this.copydefault.KWHzl)) {
                                    iAEQbTJ = (mNQ.AEQbTJ(mNE.this.copydefault.KWHzl) - view.getWidth()) - mNE.this.copydefault.DbNXlk;
                                } else {
                                    iAEQbTJ = mNE.this.copydefault.isConnected;
                                }
                                mNE.this.EZpvd = android.animation.ValueAnimator.ofInt(iOLrzqt, iAEQbTJ);
                                mNE.this.EZpvd.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.mNE.3.1
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                                        int iIntValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
                                        mNE.this.djBIcL.copydefault(iIntValue);
                                        if (mNE.this.copydefault.AuCTel != null) {
                                            mNE.this.copydefault.AuCTel.OLrzqt(iIntValue, (int) mNE.this.AkhnZx);
                                        }
                                    }
                                });
                                mNE.this.AkhnZx();
                            } else if (i2 == 4) {
                                mNE.this.EZpvd = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofInt("x", mNE.this.djBIcL.OLrzqt(), mNE.this.copydefault.fARcdN), android.animation.PropertyValuesHolder.ofInt(com.ibm.icu.text.DateFormat.YEAR, mNE.this.djBIcL.valueOf(), mNE.this.copydefault.ejfBZ));
                                mNE.this.EZpvd.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.mNE.3.3
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                                        int iIntValue = ((java.lang.Integer) valueAnimator.getAnimatedValue("x")).intValue();
                                        int iIntValue2 = ((java.lang.Integer) valueAnimator.getAnimatedValue(com.ibm.icu.text.DateFormat.YEAR)).intValue();
                                        mNE.this.djBIcL.AEQbTJ(iIntValue, iIntValue2);
                                        if (mNE.this.copydefault.AuCTel != null) {
                                            mNE.this.copydefault.AuCTel.OLrzqt(iIntValue, iIntValue2);
                                        }
                                    }
                                });
                                mNE.this.AkhnZx();
                            } else if (i2 == 5 && ((i = this.OLrzqt) == 0 || i == mNQ.AEQbTJ(mNE.this.copydefault.KWHzl) - view.getWidth())) {
                                mNE.this.copydefault.AuCTel.bi_();
                            }
                        } else if (action == 2) {
                            this.AEQbTJ = motionEvent.getRawX() - this.copydefault;
                            this.KWHzl = motionEvent.getRawY() - this.EZpvd;
                            this.OLrzqt = (int) (mNE.this.djBIcL.OLrzqt() + this.AEQbTJ);
                            int iValueOf = (int) (mNE.this.djBIcL.valueOf() + this.KWHzl);
                            this.valueOf = iValueOf;
                            if (iValueOf < 0) {
                                this.valueOf = 0;
                            } else if (iValueOf > mNQ.EZpvd(mNE.this.copydefault.KWHzl) - (view.getHeight() + C33570myu.KWHzl(mNE.this.copydefault.KWHzl))) {
                                this.valueOf = mNQ.EZpvd(mNE.this.copydefault.KWHzl) - (view.getHeight() + C33570myu.KWHzl(mNE.this.copydefault.KWHzl));
                            }
                            int i3 = this.OLrzqt;
                            if (i3 < 0) {
                                this.OLrzqt = 0;
                            } else if (i3 > mNQ.AEQbTJ(mNE.this.copydefault.KWHzl) - view.getWidth()) {
                                this.OLrzqt = mNQ.AEQbTJ(mNE.this.copydefault.KWHzl) - view.getWidth();
                            }
                            mNE.this.djBIcL.AEQbTJ(this.OLrzqt, this.valueOf);
                            if (mNE.this.copydefault.AuCTel != null) {
                                mNE.this.copydefault.AuCTel.OLrzqt(this.OLrzqt, this.valueOf);
                            }
                            this.copydefault = motionEvent.getRawX();
                            this.EZpvd = motionEvent.getRawY();
                        }
                    } else {
                        mNE.this.KWHzl = motionEvent.getRawX();
                        mNE.this.AEQbTJ = motionEvent.getRawY();
                        this.copydefault = motionEvent.getRawX();
                        this.EZpvd = motionEvent.getRawY();
                        mNE.this.OLrzqt();
                    }
                    return mNE.this.AhwBna;
                }
            });
        }
    }

    public final void AkhnZx() {
        mND.StateListAnimator stateListAnimator = this.copydefault;
        if (stateListAnimator.OLrzqt) {
            if (stateListAnimator.AhwBna == null) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = new android.view.animation.DecelerateInterpolator();
                }
                this.copydefault.AhwBna = this.AYXKKw;
            }
            this.EZpvd.setInterpolator(this.copydefault.AhwBna);
            this.EZpvd.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.mNE.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    if (mNE.this.EZpvd != null) {
                        mNE.this.EZpvd.removeAllUpdateListeners();
                        mNE.this.EZpvd.removeAllListeners();
                    }
                    mNE.this.EZpvd = null;
                    if (mNE.this.copydefault.AuCTel != null) {
                        mNE.this.copydefault.AuCTel.bi_();
                    }
                }
            });
            this.EZpvd.setDuration(this.copydefault.AYXKKw).start();
            mNN mnn = this.copydefault.AuCTel;
            if (mnn != null) {
                mnn.copydefault();
            }
        }
    }

    public final void OLrzqt() {
        android.animation.ValueAnimator valueAnimator = this.EZpvd;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.EZpvd.cancel();
    }

    @Override // o.mNF
    public void KWHzl(int i, int i2) {
        this.djBIcL.OLrzqt(i, i2);
    }

    @Override // o.mNF
    public int AYXKKw() {
        return this.djBIcL.copydefault();
    }

    @Override // o.mNF
    public int copydefault() {
        return this.djBIcL.AEQbTJ();
    }
}
