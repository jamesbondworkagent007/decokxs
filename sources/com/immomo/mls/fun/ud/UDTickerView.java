package com.immomo.mls.fun.ud;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.mls.fun.ud.view.UDView;
import com.robinhood.ticker.TickerView;
import o.C57862yqS;
import o.C7829arH;
import o.C7865arr;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDTickerView<T extends TickerView> extends UDView<T> {
    public static final String[] EZpvd = {"setText", "getText", "setTextColor", "fontNameSize", "setAnimationDuration", "setAnimationDurationMill", "enableAutoTextSize", "setAnimateMeasurementChange", "setPreferredMaxLayoutWidth", "setPreferredAutoTextSize", "addAnimatorEndListener", "removeAnimatorListener"};
    public final AnimatorListenerAdapter AEQbTJ;
    public TickerView AYXKKw;
    public float AhwBna;
    public float KWHzl;
    public boolean OLrzqt;
    public float copydefault;
    public float djBIcL;
    public LuaFunction gEmmrt;

    @InterfaceC60044zuT
    public UDTickerView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.AEQbTJ = new AnimatorListenerAdapter() { // from class: com.immomo.mls.fun.ud.UDTickerView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (UDTickerView.this.gEmmrt != null) {
                    UDTickerView.this.gEmmrt.invoke(null);
                }
            }
        };
        this.OLrzqt = false;
        this.djBIcL = 0.0f;
        this.KWHzl = C7865arr.copydefault(32.0f);
        this.AhwBna = C7865arr.copydefault(10.0f);
        this.copydefault = C7865arr.copydefault(2.0f);
    }

    @InterfaceC60044zuT
    public UDTickerView(Globals globals, @NonNull T t) {
        super(globals, t);
        this.AEQbTJ = new AnimatorListenerAdapter() { // from class: com.immomo.mls.fun.ud.UDTickerView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (UDTickerView.this.gEmmrt != null) {
                    UDTickerView.this.gEmmrt.invoke(null);
                }
            }
        };
        this.OLrzqt = false;
        this.djBIcL = 0.0f;
        this.KWHzl = C7865arr.copydefault(32.0f);
        this.AhwBna = C7865arr.copydefault(10.0f);
        this.copydefault = C7865arr.copydefault(2.0f);
    }

    @InterfaceC60044zuT
    public UDTickerView(Globals globals) {
        super(globals);
        this.AEQbTJ = new AnimatorListenerAdapter() { // from class: com.immomo.mls.fun.ud.UDTickerView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (UDTickerView.this.gEmmrt != null) {
                    UDTickerView.this.gEmmrt.invoke(null);
                }
            }
        };
        this.OLrzqt = false;
        this.djBIcL = 0.0f;
        this.KWHzl = C7865arr.copydefault(32.0f);
        this.AhwBna = C7865arr.copydefault(10.0f);
        this.copydefault = C7865arr.copydefault(2.0f);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public T AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        TickerView tickerView = new TickerView(AubY());
        this.AYXKKw = tickerView;
        tickerView.setCharacterLists(C57862yqS.copydefault());
        return (T) this.AYXKKw;
    }

    @InterfaceC60044zuT
    public LuaValue[] setText(LuaValue[] luaValueArr) {
        String javaString = luaValueArr.length > 0 ? luaValueArr[0].toJavaString() : "";
        boolean z = luaValueArr.length > 1 ? luaValueArr[1].toBoolean() : false;
        KWHzl(javaString);
        this.AYXKKw.setText(javaString, z);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] getText(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(this.AYXKKw.djBIcL()));
    }

    @InterfaceC60044zuT
    public LuaValue[] setTextColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return null;
        }
        this.AYXKKw.setTextColor(((UDColor) luaValueArr[0]).copydefault());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] fontNameSize(LuaValue[] luaValueArr) {
        String javaString = luaValueArr[0].toJavaString();
        float f = (float) luaValueArr[1].toDouble();
        Typeface typefaceAEQbTJ = C7829arH.KWHzl.AEQbTJ(javaString, AubY());
        if (typefaceAEQbTJ != null) {
            f_().setTypeface(typefaceAEQbTJ);
        }
        f_().setTextSize(C7865arr.copydefault(f));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setAnimationDuration(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return null;
        }
        this.AYXKKw.setAnimationDuration(luaValueArr[0].toLong() * 1000);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setAnimationDurationMill(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return null;
        }
        this.AYXKKw.setAnimationDuration(luaValueArr[0].toLong());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setAnimateMeasurementChange(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.AYXKKw.setAnimateMeasurementChange(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] enableAutoTextSize(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length < 1 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.OLrzqt = luaValue.toBoolean();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setPreferredAutoTextSize(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        LuaValue luaValue3;
        if (luaValueArr != null && luaValueArr.length >= 1 && (luaValue3 = luaValueArr[0]) != null) {
            this.KWHzl = C7865arr.copydefault(luaValue3.toFloat());
        }
        if (luaValueArr != null && luaValueArr.length >= 2 && (luaValue2 = luaValueArr[1]) != null) {
            this.AhwBna = C7865arr.copydefault(luaValue2.toFloat());
        }
        if (luaValueArr == null || luaValueArr.length < 3 || (luaValue = luaValueArr[2]) == null) {
            return null;
        }
        this.copydefault = C7865arr.copydefault(luaValue.toFloat());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setPreferredMaxLayoutWidth(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length < 1 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.djBIcL = C7865arr.copydefault(luaValue.toFloat());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] addAnimatorEndListener(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.gEmmrt = luaValue.toLuaFunction();
        this.AYXKKw.copydefault(this.AEQbTJ);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] removeAnimatorListener(LuaValue[] luaValueArr) {
        this.AYXKKw.EZpvd(this.AEQbTJ);
        return null;
    }

    public void KWHzl(String str) {
        if (this.OLrzqt) {
            float f = this.djBIcL;
            if (f > 0.0f) {
                if (str == null) {
                    str = "";
                }
                ((TickerView) this.dHguZz).setTextSize(KWHzl(f, str, this.KWHzl, this.AhwBna, this.copydefault));
            }
        }
    }

    public float KWHzl(float f, String str, float f2, float f3, float f4) {
        float paddingStart = (f - ((TickerView) this.dHguZz).getPaddingStart()) - ((TickerView) this.dHguZz).getPaddingEnd();
        if (paddingStart <= 0.0f || TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        TextPaint textPaint = new TextPaint(((TickerView) this.dHguZz).uzCIH);
        textPaint.setTextSize(f2);
        float textSize = textPaint.getTextSize();
        while (textPaint.measureText(str) > paddingStart && textSize > f4) {
            textSize -= f4;
            textPaint.setTextSize(textSize);
        }
        return Math.max(textSize, f3);
    }
}
