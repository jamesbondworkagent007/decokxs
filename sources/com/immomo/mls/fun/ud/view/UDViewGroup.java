package com.immomo.mls.fun.ud.view;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.camera.video.AudioStats;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ui.custom.JColor;
import com.immomo.mls.util.BitmapUtil;
import com.immomo.mls.utils.AssertUtils;
import java.util.List;
import o.C33472mxB;
import o.C33494mxX;
import o.C33570myu;
import o.C33610mzh;
import o.C33625mzw;
import o.C7322ahe;
import o.C7542alm;
import o.C7546alq;
import o.C7771aqC;
import o.C7782aqN;
import o.C7812aqr;
import o.C7823arB;
import o.C7833arL;
import o.C7865arr;
import o.InterfaceC60044zuT;
import o.InterfaceC7384ain;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDViewGroup<V extends ViewGroup> extends UDView<V> {
    public static final String[] dmfpNf = {"View", "AnimationZone"};
    public static final String[] hrNTAI = {"addView", "insertView", "removeAllSubviews", "getMeasuredHeight", "setElevation", "addBehavior", "addHiddenBehavior", "updateBehaviorOffset", "navigationBarColor", "saveImage", "addAndroidBlurEffect", "setGradientBorderColor", "recordPageLoadingSuccess", "recordPageLoadingFailed", "cancelBlurRealTime"};
    public C7782aqN ODXsMY;

    public UDViewGroup(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public UDViewGroup(Globals globals, V v) {
        super(globals, v);
    }

    public UDViewGroup(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public V AEQbTJ(LuaValue[] luaValueArr) {
        return new C7546alq(AubY(), this);
    }

    @InterfaceC60044zuT
    public LuaValue[] addView(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            if (luaValueArr[0].isNil()) {
                C7833arL.valueOf("call addView(nil)!", this.globals);
                return null;
            }
            ((UDView) luaValueArr[0]).f_().getParent();
            if (AssertUtils.KWHzl(luaValueArr[0], UDView.class, "addChild", getGlobals())) {
                KWHzl((UDView) luaValueArr[0], -1);
                fIwbmz((UDView) luaValueArr[0]);
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] insertView(LuaValue[] luaValueArr) {
        LuaValue luaValue = luaValueArr[0];
        KWHzl(luaValue.isNil() ? null : (UDView) luaValue, luaValueArr[1].toInt() - 1);
        fIwbmz(luaValue.isNil() ? null : (UDView) luaValue);
        return null;
    }

    public void KWHzl(UDView uDView, int i) {
        View viewF_;
        V vF_ = f_();
        if (vF_ == null || uDView == null || (viewF_ = uDView.f_()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewF_.getLayoutParams();
        if (vF_ instanceof InterfaceC7384ain) {
            InterfaceC7384ain interfaceC7384ain = (InterfaceC7384ain) vF_;
            layoutParams = interfaceC7384ain.applyChildCenter(interfaceC7384ain.applyLayoutParams(layoutParams, uDView.hBpjJd), uDView.hBpjJd);
        }
        if (i > f_().getChildCount()) {
            i = -1;
        }
        if (viewF_.getParent() == null) {
            vF_.addView(C7823arB.AEQbTJ(viewF_), i, layoutParams);
        }
    }

    public final void fIwbmz(UDView uDView) {
        if (uDView == null) {
            return;
        }
        if (this.fvQaOB) {
            uDView.ignoreForbiddenFlipInRTL(null);
        }
        if (this.fvQaOB || !this.finit) {
            return;
        }
        uDView.forbiddenFlipInRTL(null);
    }

    @InterfaceC60044zuT
    public LuaValue[] removeAllSubviews(LuaValue[] luaValueArr) {
        V vF_ = f_();
        if (vF_ == null) {
            return null;
        }
        vF_.removeAllViews();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] getMeasuredHeight(LuaValue[] luaValueArr) {
        f_().measure(0, 0);
        int i = 0;
        for (int i2 = 0; i2 < f_().getChildCount(); i2++) {
            View childAt = f_().getChildAt(i2);
            if (childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                i = i + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
        }
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(f_().getMeasuredHeight() + i)));
    }

    @InterfaceC60044zuT
    public LuaValue[] setElevation(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length != 1 || !(f_() instanceof AppBarLayout)) {
            return null;
        }
        float f = luaValueArr[0].toFloat();
        AppBarLayout appBarLayout = (AppBarLayout) f_();
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", f));
        appBarLayout.setStateListAnimator(stateListAnimator);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] addBehavior(LuaValue[] luaValueArr) {
        if (f_() == null || !(f_().getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return null;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) f_().getLayoutParams();
        layoutParams.setBehavior(new AppBarLayout.ScrollingViewBehavior());
        f_().setLayoutParams(layoutParams);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] addHiddenBehavior(LuaValue[] luaValueArr) {
        if (f_() == null || !(f_().getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return null;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) f_().getLayoutParams();
        layoutParams.setBehavior(new HiddenBehavior());
        f_().setLayoutParams(layoutParams);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] updateBehaviorOffset(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr[0] == null || f_() == null || !(f_().getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return null;
        }
        int i = luaValueArr[0].toInt();
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) f_().getLayoutParams()).getBehavior();
        if (!(behavior instanceof AppBarLayout.Behavior)) {
            return null;
        }
        ((AppBarLayout.Behavior) behavior).setTopAndBottomOffset(i);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] navigationBarColor(LuaValue[] luaValueArr) {
        Dialog dialog;
        Window window;
        if (luaValueArr.length != 2 || !AssertUtils.KWHzl(luaValueArr[0], UDColor.class, "navigationBarColor", getGlobals())) {
            return null;
        }
        UDColor uDColor = (UDColor) luaValueArr[0];
        JColor jColorAEQbTJ = uDColor.AEQbTJ();
        uDColor.destroy();
        try {
            if (luaValueArr[1].toInt() == 1) {
                C33494mxX.copydefault.OLrzqt((FragmentActivity) AubY(), jColorAEQbTJ.getColor(this.globals));
                List<Fragment> fragments = ((FragmentActivity) AubY()).getSupportFragmentManager().getFragments();
                Fragment fragment = fragments.get(fragments.size() - 1);
                if ((fragment instanceof DialogFragment) && (dialog = ((DialogFragment) fragment).getDialog()) != null && (window = dialog.getWindow()) != null) {
                    new C33472mxB(AubY(), window).KWHzl(jColorAEQbTJ.getColor(this.globals));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        luaValueArr[0].destroy();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] saveImage(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null) {
            final LuaFunction luaFunction = luaValue.isFunction() ? luaValueArr[0].toLuaFunction() : null;
            C33625mzw.OLrzqt().copydefault((FragmentActivity) AubY(), 1, new C33625mzw.Activity() { // from class: com.immomo.mls.fun.ud.view.UDViewGroup.1
                /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: V */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View] */
                @Override // o.C33625mzw.Activity
                public void EZpvd() {
                    Bitmap bitmapAEQbTJ;
                    if (luaFunction == null || UDViewGroup.this.f_() == 0) {
                        return;
                    }
                    if (UDViewGroup.this.f_() instanceof C7542alm) {
                        bitmapAEQbTJ = BitmapUtil.copydefault(((C7542alm) UDViewGroup.this.f_()).djBIcL(), true);
                    } else {
                        bitmapAEQbTJ = C33570myu.AEQbTJ((View) UDViewGroup.this.f_(), true);
                    }
                    if (TextUtils.isEmpty(C33610mzh.OLrzqt.OLrzqt(UDViewGroup.this.AubY(), bitmapAEQbTJ))) {
                        luaFunction.EZpvd(AudioStats.AUDIO_AMPLITUDE_NONE);
                    } else {
                        luaFunction.EZpvd(1.0d);
                    }
                }

                @Override // o.C33625mzw.Activity
                public void EZpvd(List<String> list) {
                    LuaFunction luaFunction2 = luaFunction;
                    if (luaFunction2 != null) {
                        luaFunction2.EZpvd(AudioStats.AUDIO_AMPLITUDE_NONE);
                    }
                }
            });
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] addAndroidBlurEffect(LuaValue[] luaValueArr) {
        if (this.ODXsMY == null) {
            this.ODXsMY = new C7782aqN(AubY(), null);
        }
        if (luaValueArr.length > 2 && (f_() instanceof C7771aqC)) {
            ((C7771aqC) f_()).skipMeasureBlurView(luaValueArr[2].toBoolean());
        }
        this.ODXsMY.setLayoutParams(f_().getLayoutParams());
        if (luaValueArr.length > 0) {
            this.ODXsMY.setBlurRadius(C7865arr.copydefault(luaValueArr[0].toFloat()));
        }
        if (luaValueArr.length > 1) {
            this.ODXsMY.setOverlayColor(((UDColor) luaValueArr[1]).copydefault());
        }
        if (this.ODXsMY.getParent() != null && (this.ODXsMY.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.ODXsMY.getParent()).removeView(this.ODXsMY);
        }
        f_().addView(this.ODXsMY);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] cancelBlurRealTime(LuaValue[] luaValueArr) {
        C7782aqN c7782aqN;
        if (luaValueArr == null || luaValueArr.length == 0 || (c7782aqN = this.ODXsMY) == null) {
            return null;
        }
        c7782aqN.EZpvd(luaValueArr[0].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setGradientBorderColor(LuaValue[] luaValueArr) {
        int[] iArrValueOf = valueOf(luaValueArr);
        if (iArrValueOf == null) {
            return null;
        }
        V vF_ = f_();
        if (!(vF_ instanceof C7812aqr)) {
            return null;
        }
        ((C7812aqr) vF_).setGradientStrokeColor(iArrValueOf);
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] removeBlurEffect(LuaValue[] luaValueArr) {
        if (this.ODXsMY == null) {
            return null;
        }
        f_().removeView(this.ODXsMY);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] recordPageLoadingSuccess(LuaValue[] luaValueArr) {
        ((C7322ahe) this.globals.AuCTel()).copydefault.sSMYrx();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] recordPageLoadingFailed(LuaValue[] luaValueArr) {
        ((C7322ahe) this.globals.AuCTel()).copydefault.zuBGHE();
        return null;
    }
}
