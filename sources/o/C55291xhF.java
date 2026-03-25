package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55291xhF extends ConstraintLayout {
    public boolean AEQbTJ;
    public int AYXKKw;
    public float AhwBna;
    public int AkhnZx;
    public long EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public mAL copydefault;
    public float djBIcL;
    public final android.view.VelocityTracker fetchVPNInfo;
    public boolean gEmmrt;
    public mAN valueOf;
    public final int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55291xhF(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55291xhF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanDrag(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickNotificationListener(mAL mal) {
        this.copydefault = mal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseNotificationListener(mAN man) {
        this.valueOf = man;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJudgeY(int i) {
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.xhF.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55291xhF(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55291xhF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = true;
        this.values = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.AYXKKw = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
        this.fetchVPNInfo = android.view.VelocityTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.fetchVPNInfo.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        mAL mal;
        this.fetchVPNInfo.addMovement(motionEvent);
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.AkhnZx = 0;
            this.AhwBna = motionEvent.getRawX();
            this.djBIcL = motionEvent.getRawY();
            this.KWHzl = motionEvent.getRawX();
            this.OLrzqt = motionEvent.getRawY();
            this.gEmmrt = false;
            this.EZpvd = java.lang.System.currentTimeMillis();
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            this.gEmmrt = java.lang.Math.abs(motionEvent.getRawX() - this.AhwBna) > ((float) this.values) || java.lang.Math.abs(motionEvent.getRawY() - this.djBIcL) > ((float) this.values);
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            AEQbTJ(motionEvent, this);
            if (!this.gEmmrt && java.lang.System.currentTimeMillis() - this.EZpvd < 500 && this.OLrzqt < C56548yJl.valueOf(getHeight(), this.AYXKKw) && !super.onInterceptTouchEvent(motionEvent) && (mal = this.copydefault) != null) {
                mal.EZpvd();
            }
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            AEQbTJ(motionEvent, this);
        }
        if (this.AEQbTJ && this.gEmmrt) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        mAL mal;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        getParent().requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getRawY() > C56548yJl.valueOf(getHeight(), this.AYXKKw) + 100 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.AkhnZx = 0;
            this.AhwBna = motionEvent.getRawX();
            this.djBIcL = motionEvent.getRawY();
            this.KWHzl = motionEvent.getRawX();
            this.OLrzqt = motionEvent.getRawY();
            this.gEmmrt = false;
            this.EZpvd = java.lang.System.currentTimeMillis();
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                float rawX = motionEvent.getRawX() - this.AhwBna;
                float rawY = motionEvent.getRawY() - this.djBIcL;
                if (java.lang.Math.abs(rawX) == 0.0f && java.lang.Math.abs(rawY) == 0.0f) {
                    return true;
                }
                if (this.AkhnZx == 0) {
                    this.AkhnZx = java.lang.Math.abs(rawX) > java.lang.Math.abs(rawY) ? 1 : 2;
                }
                AEQbTJ(this, rawX, rawY);
                if (!this.gEmmrt) {
                    this.gEmmrt = java.lang.Math.abs(rawX) > ((float) this.values) || java.lang.Math.abs(rawY) > ((float) this.values);
                }
                this.AhwBna = motionEvent.getRawX();
                this.djBIcL = motionEvent.getRawY();
            } else if (actionMasked == 3) {
                AEQbTJ(motionEvent, this);
            }
        } else {
            AEQbTJ(motionEvent, this);
            if (!this.gEmmrt && java.lang.System.currentTimeMillis() - this.EZpvd < 500 && this.OLrzqt < C56548yJl.valueOf(getHeight(), this.AYXKKw) && (mal = this.copydefault) != null) {
                mal.EZpvd();
            }
        }
        return true;
    }

    public final void AEQbTJ(android.view.MotionEvent motionEvent, android.view.View view) {
        float rawX = motionEvent.getRawX() - this.KWHzl;
        float rawY = motionEvent.getRawY() - this.OLrzqt;
        int i = this.AkhnZx;
        if (i != 1) {
            if (i == 2) {
                int iValueOf = C56548yJl.valueOf(view.getHeight(), this.AYXKKw);
                if (java.lang.Math.abs(rawY) <= iValueOf / 2) {
                    this.fetchVPNInfo.computeCurrentVelocity(1000);
                    if (java.lang.Math.abs(this.fetchVPNInfo.getYVelocity()) < 4000.0f) {
                        if (java.lang.Math.abs(view.getTranslationY()) < 30.0f) {
                            view.setTranslationY(0.0f);
                        } else {
                            copydefault(view, "translationY", view.getTranslationY());
                        }
                    } else if (rawY > 0.0f) {
                        view.setTranslationY(0.0f);
                    } else {
                        view.setTranslationY((-iValueOf) - 100);
                        mAN man = this.valueOf;
                        if (man != null) {
                            man.AEQbTJ();
                        }
                    }
                } else if (rawY > 0.0f) {
                    view.setTranslationY(0.0f);
                } else {
                    view.setTranslationY((-iValueOf) - 100);
                    mAN man2 = this.valueOf;
                    if (man2 != null) {
                        man2.AEQbTJ();
                    }
                }
            }
        } else if (java.lang.Math.abs(rawX) <= view.getWidth() / 2) {
            this.fetchVPNInfo.computeCurrentVelocity(1000);
            if (java.lang.Math.abs(this.fetchVPNInfo.getXVelocity()) < 4000.0f) {
                if (java.lang.Math.abs(view.getTranslationX()) < 30.0f) {
                    view.setTranslationX(0.0f);
                } else {
                    copydefault(view, "translationX", view.getTranslationX());
                }
            } else if (rawX > 0.0f) {
                view.setTranslationX(view.getWidth() + 100);
                mAN man3 = this.valueOf;
                if (man3 != null) {
                    man3.AEQbTJ();
                }
            } else {
                view.setTranslationX((-view.getWidth()) - 100);
                mAN man4 = this.valueOf;
                if (man4 != null) {
                    man4.AEQbTJ();
                }
            }
        } else if (rawX > 0.0f) {
            view.setTranslationX(view.getWidth() + 100);
            mAN man5 = this.valueOf;
            if (man5 != null) {
                man5.AEQbTJ();
            }
        } else {
            view.setTranslationX((-view.getWidth()) - 100);
            mAN man6 = this.valueOf;
            if (man6 != null) {
                man6.AEQbTJ();
            }
        }
        this.AkhnZx = 0;
    }

    public final void copydefault(android.view.View view, java.lang.String str, float f) {
        android.animation.ObjectAnimator.ofFloat(view, str, f, 0.0f).setDuration(200L).start();
    }

    public final void AEQbTJ(android.view.View view, float f, float f2) {
        if (this.AkhnZx == 2) {
            view.setTranslationY(C56548yJl.copydefault(C56548yJl.valueOf(view.getTranslationY() + f2, 0.0f), view.getHeight() * (-1.1f)));
        }
    }
}
