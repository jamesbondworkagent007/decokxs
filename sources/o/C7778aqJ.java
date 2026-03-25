package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import org.luaj.vm2.LuaFunction;

/* JADX INFO: renamed from: o.aqJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7778aqJ extends C57869yqZ {
    public boolean EZpvd;
    public long KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNoMoreDataEffective(boolean z) {
        this.fFgQHt = z;
    }

    public C7778aqJ(android.content.Context context) {
        super(context);
        this.copydefault = 0;
        this.KWHzl = 0L;
        this.EZpvd = false;
    }

    public C7778aqJ(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.copydefault = 0;
        this.KWHzl = 0L;
        this.EZpvd = false;
    }

    public void copydefault(int i, int i2, final LuaFunction luaFunction) {
        android.animation.ValueAnimator valueAnimatorKWHzl = this.AxsJAYsNCnLh.KWHzl(i);
        if (valueAnimatorKWHzl != null) {
            valueAnimatorKWHzl.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.aqJ.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@androidx.annotation.NonNull android.animation.ValueAnimator valueAnimator) {
                    if (C7778aqJ.this.hrNTAI != RefreshState.None) {
                        valueAnimator.cancel();
                        LuaFunction luaFunction2 = luaFunction;
                        if (luaFunction2 != null) {
                            luaFunction2.OLrzqt();
                        }
                    }
                }
            });
            valueAnimatorKWHzl.addListener(new AnonymousClass5(luaFunction, i2));
        }
    }

    /* JADX INFO: renamed from: o.aqJ$5, reason: invalid class name */
    /* JADX INFO: loaded from: classes22.dex */
    public class AnonymousClass5 implements Animator.AnimatorListener {
        public final /* synthetic */ LuaFunction EZpvd;
        public final /* synthetic */ int KWHzl;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@androidx.annotation.NonNull android.animation.Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@androidx.annotation.NonNull android.animation.Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@androidx.annotation.NonNull android.animation.Animator animator) {
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass5(LuaFunction luaFunction, int i) {
            this.EZpvd = luaFunction;
            this.KWHzl = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@androidx.annotation.NonNull android.animation.Animator animator) {
            C7778aqJ.this.postDelayed(new java.lang.Runnable() { // from class: o.aqJ.5.5
                @Override // java.lang.Runnable
                public void run() {
                    if (C7778aqJ.this.hrNTAI == RefreshState.None) {
                        android.animation.ValueAnimator valueAnimatorKWHzl = C7778aqJ.this.AxsJAYsNCnLh.KWHzl(0);
                        if (valueAnimatorKWHzl != null) {
                            valueAnimatorKWHzl.addListener(new Animator.AnimatorListener() { // from class: o.aqJ.5.5.1
                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationCancel(@androidx.annotation.NonNull android.animation.Animator animator2) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationRepeat(@androidx.annotation.NonNull android.animation.Animator animator2) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationStart(@androidx.annotation.NonNull android.animation.Animator animator2) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(@androidx.annotation.NonNull android.animation.Animator animator2) {
                                    LuaFunction luaFunction = AnonymousClass5.this.EZpvd;
                                    if (luaFunction != null) {
                                        luaFunction.OLrzqt();
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                    LuaFunction luaFunction = AnonymousClass5.this.EZpvd;
                    if (luaFunction != null) {
                        luaFunction.OLrzqt();
                    }
                }
            }, this.KWHzl);
        }
    }

    @Override // o.C57869yqZ
    public InterfaceC57934yrl copydefault() {
        this.EZpvd = false;
        return KWHzl(false);
    }

    @Override // o.C57869yqZ
    public InterfaceC57934yrl KWHzl(boolean z) {
        this.EZpvd = z;
        return super.KWHzl(z && this.fFgQHt);
    }

    private int EZpvd() {
        long jCurrentTimeMillis = 0 - (java.lang.System.currentTimeMillis() - this.KWHzl);
        if (jCurrentTimeMillis > 0) {
            return (int) jCurrentTimeMillis;
        }
        return 0;
    }

    @Override // o.C57869yqZ, o.InterfaceC57934yrl
    public InterfaceC57934yrl AEQbTJ() {
        return super.KWHzl(EZpvd(), true, java.lang.Boolean.FALSE);
    }

    @Override // o.C57869yqZ
    public InterfaceC57934yrl KWHzl(int i) {
        if (this.gwTjWJ == null) {
            i = 0;
        }
        return super.KWHzl(java.lang.Math.max(EZpvd(), i));
    }

    @Override // o.C57869yqZ
    public InterfaceC57934yrl AEQbTJ(boolean z) {
        return super.KWHzl(EZpvd(), z, java.lang.Boolean.FALSE);
    }

    @Override // o.C57869yqZ
    public InterfaceC57934yrl KWHzl(int i, boolean z, java.lang.Boolean bool) {
        return super.KWHzl(java.lang.Math.max(EZpvd(), i), z, bool);
    }

    @Override // o.C57869yqZ
    public InterfaceC57934yrl OLrzqt() {
        return super.KWHzl(EZpvd(), true, java.lang.Boolean.FALSE);
    }
}
