package o;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.tradeuilib.depth.bean.DepthClickableConfig;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31190lpO;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wvN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53959wvN extends ConstraintLayout {
    public Function0<Unit> AEQbTJ;
    public Function0<Unit> EZpvd;
    public AbstractC50909vcz KWHzl;
    public Function0<Unit> OLrzqt;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53959wvN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53959wvN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmtClickCallBack(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPackUpClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceClickCallBack(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpreadClickCallback(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53959wvN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.zdxASf, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC50909vcz) viewDataBindingInflate;
        gEmmrt();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.wvN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53959wvN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void gEmmrt() {
        setDepthDrawable();
        this.KWHzl.values.setOnClickListener(new View.OnClickListener() { // from class: o.wvM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53959wvN.OLrzqt(this.EZpvd, view);
            }
        });
        this.KWHzl.AuCTel.setOnClickListener(new View.OnClickListener() { // from class: o.wvQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53959wvN.gEmmrt(this.AEQbTJ, view);
            }
        });
        this.KWHzl.fJNWhG.setOnClickListener(new View.OnClickListener() { // from class: o.wvR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53959wvN.valueOf(this.EZpvd, view);
            }
        });
        this.KWHzl.AkhnZx.setOnClickListener(new View.OnClickListener() { // from class: o.wvV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53959wvN.djBIcL(this.KWHzl, view);
            }
        });
        C49576urE c49576urE = this.KWHzl.OLrzqt;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        c49576urE.KWHzl(new DepthClickableConfig(bool, bool));
        this.KWHzl.AEQbTJ.KWHzl(new DepthClickableConfig(bool, bool));
    }

    public static final void OLrzqt(C53959wvN c53959wvN, android.view.View view) {
        Function0<Unit> function0 = c53959wvN.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void gEmmrt(C53959wvN c53959wvN, android.view.View view) {
        Function0<Unit> function0 = c53959wvN.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void valueOf(C53959wvN c53959wvN, android.view.View view) {
        Function0<Unit> function0 = c53959wvN.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void djBIcL(C53959wvN c53959wvN, android.view.View view) {
        Function0<Unit> function0 = c53959wvN.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final C51006veq EZpvd() {
        C51006veq c51006veq = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(c51006veq, "");
        return c51006veq;
    }

    public final C49576urE OLrzqt() {
        C49576urE c49576urE = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c49576urE, "");
        return c49576urE;
    }

    public final C49576urE AEQbTJ() {
        C49576urE c49576urE = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c49576urE, "");
        return c49576urE;
    }

    public final C49581urJ KWHzl() {
        C49581urJ c49581urJ = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(c49581urJ, "");
        return c49581urJ;
    }

    public final void setInstTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.isConnected.setText(str);
    }

    public final void setMargin(java.lang.String str) {
        C55251xgS c55251xgS = this.KWHzl.fetchVPNInfo;
        if (str == null) {
            str = "";
        }
        c55251xgS.setText(str);
    }

    public static /* synthetic */ void setPackUpVisible$default(C53959wvN c53959wvN, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c53959wvN.setPackUpVisible(z);
    }

    public final void setPackUpVisible(boolean z) {
        this.KWHzl.values.setVisibility(z ? 0 : 8);
    }

    public final void setLevelSelectedCallback(@NotNull androidx.fragment.app.FragmentManager fragmentManager, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.KWHzl.copydefault.setFm(fragmentManager);
        this.KWHzl.copydefault.setOnDepthLevelSelectedCallback(function0);
    }

    public final void setPriceUnit(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.KWHzl.DbNXlk;
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            str = "(" + str + ")";
        }
        textView.setText(str);
    }

    public final void setPriceArrow(boolean z) {
        android.graphics.drawable.Drawable drawableMutate;
        if (z) {
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C31190lpO.Activity.copydefault);
            if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
                drawableMutate = null;
            } else {
                DrawableCompat.setTint(drawableMutate, ContextCompat.getColor(getContext(), C52761wXj.Activity.QwvEab));
            }
            if (drawableMutate != null) {
                drawableMutate.setBounds(0, 0, C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
            }
            this.KWHzl.djBIcL.setCompoundDrawables(null, null, drawableMutate, null);
            this.KWHzl.AuCTel.setClickable(true);
            return;
        }
        this.KWHzl.djBIcL.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        this.KWHzl.AuCTel.setClickable(false);
    }

    public final void setAmtUnit(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.KWHzl.KWHzl;
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            str = "(" + str + ")";
        }
        textView.setText(str);
    }

    public final void setAmtArrow(boolean z) {
        android.graphics.drawable.Drawable drawableMutate;
        if (z) {
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C31190lpO.Activity.copydefault);
            if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
                drawableMutate = null;
            } else {
                DrawableCompat.setTint(drawableMutate, ContextCompat.getColor(getContext(), C52761wXj.Activity.QwvEab));
            }
            if (drawableMutate != null) {
                drawableMutate.setBounds(0, 0, C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
            }
            this.KWHzl.EZpvd.setCompoundDrawables(null, null, drawableMutate, null);
            this.KWHzl.fJNWhG.setClickable(true);
            return;
        }
        this.KWHzl.EZpvd.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        this.KWHzl.fJNWhG.setClickable(false);
    }

    public static /* synthetic */ void setSpreadVisible$default(C53959wvN c53959wvN, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c53959wvN.setSpreadVisible(z);
    }

    public final void setSpreadVisible(boolean z) {
        if (z) {
            this.KWHzl.gEmmrt.setVisibility(0);
            this.KWHzl.AkhnZx.setClickable(true);
        } else {
            this.KWHzl.gEmmrt.setVisibility(4);
            this.KWHzl.AkhnZx.setClickable(false);
        }
    }

    public final void setSpreadData(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl.AkhnZx.setText(str);
        this.KWHzl.fARcdN.setText(str2);
        this.KWHzl.fARcdN.setTextColor(i);
    }

    public final void setDepthDrawable() {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.DNMMPQ);
        if (drawableKWHzl != null) {
            android.content.Context context = this.KWHzl.values.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(16, context);
            android.content.Context context2 = this.KWHzl.values.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawableKWHzl.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(16, context2));
        }
        if (drawableKWHzl != null) {
            drawableKWHzl.setTint(ContextCompat.getColor(getContext(), C52761wXj.Activity.QwvEab));
        }
        this.KWHzl.values.setCompoundDrawables(null, null, drawableKWHzl, null);
        android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.QSLkRj);
        if (drawable2 != null) {
            DrawableCompat.setTint(drawable2, ContextCompat.getColor(getContext(), C52761wXj.Activity.QwvEab));
            drawable = drawable2;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iEZpvd = C33052mpF.EZpvd(12.0f, context3);
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            android.graphics.Bitmap bitmap$default = DrawableKt.toBitmap$default(drawable, iEZpvd, C33052mpF.EZpvd(12.0f, context4), null, 4, null);
            if (bitmap$default != null) {
                C51006veq c51006veq = this.KWHzl.copydefault;
                android.content.res.Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                c51006veq.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, new BitmapDrawable(resources, bitmap$default), (android.graphics.drawable.Drawable) null);
            }
        }
    }

    public final void setLastPriceColor(int i) {
        this.KWHzl.AYXKKw.setTextColor(i);
    }

    public final void setLastPriceText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.AYXKKw.setText(str);
    }

    public final void setLastPriceTag(java.lang.String str) {
        android.widget.TextView textView = this.KWHzl.AYXKKw;
        if (str == null) {
            str = "";
        }
        textView.setTag(str);
    }

    public final java.lang.String copydefault() {
        java.lang.Object tag = this.KWHzl.AYXKKw.getTag();
        if (tag instanceof java.lang.String) {
            return (java.lang.String) tag;
        }
        return null;
    }

    public final void setTickerInfoActivity(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.KWHzl.valueOf.setActivity(activity);
    }

    public static /* synthetic */ void onVisible$default(C53959wvN c53959wvN, BizInstrument bizInstrument, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bizInstrument = null;
        }
        c53959wvN.KWHzl(bizInstrument);
    }

    public final void KWHzl(BizInstrument bizInstrument) {
        this.KWHzl.copydefault.OLrzqt(bizInstrument);
        this.KWHzl.valueOf.EZpvd(bizInstrument);
    }

    public final void valueOf() {
        this.KWHzl.valueOf.copydefault();
    }
}
