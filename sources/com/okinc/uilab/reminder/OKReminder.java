package com.okinc.uilab.reminder;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.uilab.util.SpanUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C52794wYp;
import o.C54918xaD;
import o.C55133xeG;
import o.C55177xey;
import o.C55279xgu;
import o.C55280xgv;
import o.C55296xhK;
import o.C55298xhM;
import o.C55307xhV;
import o.C55312xha;
import o.C55317xhf;
import o.C55320xhi;
import o.C56444yFp;
import o.InterfaceC52764wXm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class OKReminder extends FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final C55177xey AEQbTJ;
    public Drawable AhwBna;
    public final C54918xaD KWHzl;
    public ViewTreeObserver.OnGlobalLayoutListener OLrzqt;
    public Function0<Unit> copydefault;
    public Orientation djBIcL;
    public Drawable valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKReminder(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKReminder(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean EZpvd(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54918xaD EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCloseIconCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.WS int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:44) call: com.okinc.uilab.reminder.OKReminder.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ OKReminder(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.WS : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKReminder(@NotNull final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C54918xaD c54918xaDAEQbTJ = C54918xaD.AEQbTJ(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c54918xaDAEQbTJ, "");
        this.KWHzl = c54918xaDAEQbTJ;
        C55177xey c55177xey = new C55177xey(this);
        this.AEQbTJ = c55177xey;
        this.djBIcL = Orientation.UNDEFINED;
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55177xey, attributeSet, i, 0, 4, null);
        TextViewCompat.setTextAppearance(c54918xaDAEQbTJ.DbNXlk, c55177xey.fIwbmz());
        TextViewCompat.setTextAppearance(c54918xaDAEQbTJ.AkhnZx, c55177xey.KWHzl());
        this.OLrzqt = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.xew
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                OKReminder.OLrzqt(this.AEQbTJ, context);
            }
        };
        c54918xaDAEQbTJ.getRoot().setPaddingRelative(c55177xey.OLrzqt(), c55177xey.AhwBna(), c55177xey.EZpvd(), c55177xey.copydefault());
        ImageView imageView = c54918xaDAEQbTJ.EZpvd;
        imageView.setBackgroundTintList(ColorStateList.valueOf(c55177xey.QKVWgx()));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.xeB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                OKReminder.OLrzqt(this.AEQbTJ, view);
            }
        });
        RelativeLayout relativeLayoutAEQbTJ = c54918xaDAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(relativeLayoutAEQbTJ, "");
        C55296xhK.EZpvd(relativeLayoutAEQbTJ, c55177xey.fARcdN());
        c54918xaDAEQbTJ.AhwBna.setTextAppearance(C52761wXj.LoaderManager.fFgQHt);
        c54918xaDAEQbTJ.values.setTextAppearance(C52761wXj.LoaderManager.fFgQHt);
    }

    public final void setLeadingIcon(Drawable drawable) {
        this.valueOf = drawable;
        ImageView imageView = this.KWHzl.AEQbTJ;
        imageView.setBackground(drawable);
        imageView.setBackgroundTintList(null);
    }

    public final void setReminderBackground(Drawable drawable) {
        this.AhwBna = drawable;
        this.KWHzl.getRoot().setBackground(drawable);
    }

    public final RelativeLayout AEQbTJ() {
        RelativeLayout relativeLayout = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        return relativeLayout;
    }

    public final TextView gEmmrt() {
        TextView textView = this.KWHzl.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final TextView KWHzl() {
        TextView textView = this.KWHzl.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final C52794wYp AYXKKw() {
        C52794wYp c52794wYp = this.KWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        return c52794wYp;
    }

    public final ImageView OLrzqt() {
        ImageView imageView = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public static final void OLrzqt(OKReminder oKReminder, Context context) {
        oKReminder.KWHzl.getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(oKReminder.OLrzqt);
        int width = (oKReminder.KWHzl.getRoot().getWidth() - C55298xhM.OLrzqt(24, context)) - C55298xhM.OLrzqt(40, context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        oKReminder.AhwBna();
        if (oKReminder.KWHzl.AhwBna.getWidth() >= width || oKReminder.KWHzl.values.getWidth() >= width || oKReminder.KWHzl.AhwBna.getWidth() + oKReminder.KWHzl.values.getWidth() + C55298xhM.KWHzl(8.0f, context) >= width) {
            Orientation orientation = oKReminder.djBIcL;
            Orientation orientation2 = Orientation.VERTICAL;
            if (orientation == orientation2) {
                return;
            }
            oKReminder.djBIcL = orientation2;
            oKReminder.KWHzl.AYXKKw.setOrientation(1);
            oKReminder.KWHzl.values.setLayoutParams(layoutParams);
            return;
        }
        Orientation orientation3 = oKReminder.djBIcL;
        Orientation orientation4 = Orientation.HORIZONTAL;
        if (orientation3 == orientation4) {
            return;
        }
        oKReminder.djBIcL = orientation4;
        oKReminder.KWHzl.AYXKKw.setOrientation(0);
        layoutParams.setMarginStart(C55298xhM.OLrzqt(8, context));
        layoutParams.topMargin = C55298xhM.OLrzqt(8, context);
        oKReminder.KWHzl.values.setLayoutParams(layoutParams);
    }

    public static final void OLrzqt(OKReminder oKReminder, View view) {
        Function0<Unit> function0 = oKReminder.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setStyle(int i) {
        Integer numValueOf;
        Drawable drawableGEmmrt;
        Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.UfveVb);
        if (i == 0) {
            drawable = this.AEQbTJ.isConnected();
            numValueOf = Integer.valueOf(this.AEQbTJ.AkhnZx());
            drawableGEmmrt = this.AEQbTJ.gEmmrt();
        } else if (i == 1) {
            drawable = this.AEQbTJ.ejfBZ();
            numValueOf = Integer.valueOf(this.AEQbTJ.fJNWhG());
            drawableGEmmrt = this.AEQbTJ.DbNXlk();
        } else if (i == 2) {
            drawable = this.AEQbTJ.wlaJM();
            numValueOf = Integer.valueOf(this.AEQbTJ.getNewProxyInstance());
            drawableGEmmrt = this.AEQbTJ.iwGUEr();
        } else if (i == 3) {
            drawable = this.AEQbTJ.QbewEr();
            numValueOf = Integer.valueOf(this.AEQbTJ.aKErDB());
            drawableGEmmrt = this.AEQbTJ.QVAiDq();
        } else if (i != 4) {
            numValueOf = null;
            drawableGEmmrt = null;
        } else {
            drawable = this.AEQbTJ.AwvSrB();
            numValueOf = Integer.valueOf(this.AEQbTJ.OcIXYQ());
            drawableGEmmrt = this.AEQbTJ.AxsJAY();
        }
        C54918xaD c54918xaD = this.KWHzl;
        ImageView imageView = c54918xaD.AEQbTJ;
        Drawable drawable2 = this.valueOf;
        if (drawable2 != null) {
            drawable = drawable2;
        }
        imageView.setBackground(drawable);
        if (this.valueOf == null && numValueOf != null) {
            c54918xaD.AEQbTJ.setBackgroundTintList(ColorStateList.valueOf(numValueOf.intValue()));
        }
        RelativeLayout relativeLayoutAEQbTJ = c54918xaD.getRoot();
        Drawable drawable3 = this.AhwBna;
        if (drawable3 != null) {
            drawableGEmmrt = drawable3;
        }
        relativeLayoutAEQbTJ.setBackground(drawableGEmmrt);
        KWHzl(i);
        OLrzqt(i);
        setTextSize();
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0 function0 = this.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public static /* synthetic */ void setLeadingIconVisibility$default(OKReminder oKReminder, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        oKReminder.setLeadingIconVisibility(z);
    }

    public final void setLeadingIconVisibility(boolean z) {
        this.KWHzl.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(this.OLrzqt);
        ImageView imageView = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void setTitle$default(OKReminder oKReminder, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        oKReminder.setTitle(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            this.KWHzl.DbNXlk.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TextView textView = this.KWHzl.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, charSequence);
    }

    public static /* synthetic */ void setMessage$default(OKReminder oKReminder, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        oKReminder.setMessage(charSequence);
    }

    public final void setMessage(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            this.KWHzl.AkhnZx.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TextView textView = this.KWHzl.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, charSequence);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.uilab.reminder.OKReminder */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setMessageByHTML$default(OKReminder oKReminder, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.xeA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(OKReminder.EZpvd((java.lang.String) obj2));
                }
            };
        }
        oKReminder.setMessageByHTML(str, function1);
    }

    public final void setMessageByHTML(String str, Function1<? super String, Boolean> function1) {
        TextView textView = this.KWHzl.AkhnZx;
        Intrinsics.copydefault(textView);
        textView.setVisibility(true ^ (str == null || str.length() == 0) ? 0 : 8);
        if (str == null || str.length() == 0) {
            return;
        }
        C55133xeG.AEQbTJ(textView, str, function1);
    }

    public final void OLrzqt(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        RelativeLayout relativeLayout = this.KWHzl.gEmmrt;
        relativeLayout.removeAllViews();
        relativeLayout.setVisibility(0);
        relativeLayout.addView(view);
    }

    public final void setExtraText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.KWHzl.djBIcL.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(0);
        }
        this.KWHzl.fetchVPNInfo.setVisibility(0);
        C55312xha c55312xhaValueOf = this.KWHzl.copydefault.valueOf();
        if (c55312xhaValueOf != null) {
            C55320xhi c55320xhiKWHzl = c55312xhaValueOf.KWHzl();
            if (c55320xhiKWHzl != null) {
                C55307xhV.AEQbTJ(c55320xhiKWHzl, str);
            }
            C55320xhi c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl();
            if (c55320xhiKWHzl2 != null) {
                TextViewCompat.setTextAppearance(c55320xhiKWHzl2, this.AEQbTJ.fIwbmz());
                c55320xhiKWHzl2.setTextColor(this.AEQbTJ.fetchVPNInfo());
            }
        }
    }

    public final void setExtraView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewGroup.LayoutParams layoutParams = this.KWHzl.djBIcL.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(0);
        }
        RelativeLayout relativeLayout = this.KWHzl.fetchVPNInfo;
        relativeLayout.setVisibility(0);
        relativeLayout.removeAllViews();
        relativeLayout.addView(view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.uilab.reminder.OKReminder */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setMessage$default(OKReminder oKReminder, String str, String str2, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        oKReminder.setMessage(str, str2, function0);
    }

    public static final class ActionBar extends ClickableSpan {
        public final /* synthetic */ OKReminder EZpvd;
        public final /* synthetic */ Function0<Unit> KWHzl;

        public ActionBar(Function0<Unit> function0, OKReminder oKReminder) {
            this.KWHzl = function0;
            this.EZpvd = oKReminder;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function0<Unit> function0 = this.KWHzl;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setColor(ContextCompat.getColor(this.EZpvd.getContext(), C52761wXj.Activity.fbC));
            textPaint.setUnderlineText(false);
        }
    }

    public final void setMessage(String str, String str2, Function0<Unit> function0) {
        TextView textView = this.KWHzl.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
        ActionBar actionBar = new ActionBar(function0, this);
        SpanUtils spanUtilsEZpvd = SpanUtils.Companion.EZpvd(this.KWHzl.AkhnZx);
        if (str == null) {
            str = "";
        }
        SpanUtils spanUtilsKWHzl = spanUtilsEZpvd.KWHzl(str);
        if (str2 == null) {
            str2 = "";
        }
        spanUtilsKWHzl.KWHzl(str2).AEQbTJ(actionBar).EZpvd().clear();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.uilab.reminder.OKReminder */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setPrimaryAction$default(OKReminder oKReminder, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        oKReminder.setPrimaryAction(str, function0);
    }

    public final void setPrimaryAction(String str, Function0<Unit> function0) {
        this.KWHzl.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(this.OLrzqt);
        if (this.KWHzl.values.getVisibility() != 0) {
            C52794wYp c52794wYp = this.KWHzl.AhwBna;
            Context context = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52794wYp.setCompoundDrawablePadding(C55298xhM.OLrzqt(4, context));
            Drawable drawable = ContextCompat.getDrawable(c52794wYp.getContext(), C52761wXj.TaskDescription.HrMTQN);
            if (drawable != null) {
                drawable.setTint(ContextCompat.getColor(c52794wYp.getContext(), C52761wXj.Activity.svhCHd));
                Unit unit = Unit.INSTANCE;
            } else {
                drawable = null;
            }
            c52794wYp.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
        realSetAction$default(this, str, function0, null, 4, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.uilab.reminder.OKReminder */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSecondaryAction$default(OKReminder oKReminder, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        oKReminder.setSecondaryAction(str, function0);
    }

    public final void setSecondaryAction(String str, Function0<Unit> function0) {
        this.KWHzl.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(this.OLrzqt);
        if (str != null && str.length() > 0) {
            this.KWHzl.AhwBna.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        C52794wYp c52794wYp = this.KWHzl.values;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        EZpvd(str, function0, c52794wYp);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.uilab.reminder.OKReminder */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setAction$default(OKReminder oKReminder, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        oKReminder.setAction(str, function0);
    }

    public final void setAction(String str, Function0<Unit> function0) {
        this.KWHzl.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(this.OLrzqt);
        if (str == null || str.length() == 0) {
            this.KWHzl.AhwBna.setVisibility(8);
            return;
        }
        C52794wYp c52794wYp = this.KWHzl.AhwBna;
        c52794wYp.setVisibility(0);
        c52794wYp.setText(str);
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, function0));
        RelativeLayout relativeLayoutAEQbTJ = this.KWHzl.getRoot();
        int iOLrzqt = this.AEQbTJ.OLrzqt();
        int iAhwBna = this.AEQbTJ.AhwBna();
        int iEZpvd = this.AEQbTJ.EZpvd();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        relativeLayoutAEQbTJ.setPaddingRelative(iOLrzqt, iAhwBna, iEZpvd, C55298xhM.OLrzqt(4, context));
    }

    public final void setHyperLinkAction(String str, Function0<Unit> function0) {
        if (str == null || str.length() == 0) {
            this.KWHzl.KWHzl.setVisibility(8);
        } else {
            C55317xhf c55317xhf = this.KWHzl.KWHzl;
            c55317xhf.setVisibility(0);
            c55317xhf.setText(str);
            c55317xhf.setOnClickListener(new Application(c55317xhf, 1000L, function0));
            Intrinsics.copydefault(c55317xhf);
        }
        ViewGroup.LayoutParams layoutParams = this.KWHzl.DbNXlk.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C55296xhK.AEQbTJ((ViewGroup.MarginLayoutParams) layoutParams, 0, 0, 0, 0);
        }
        this.KWHzl.DbNXlk.setLayoutParams(layoutParams);
    }

    public final void setCloseIconVisibility(boolean z) {
        Context context;
        float f;
        this.KWHzl.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(this.OLrzqt);
        C54918xaD c54918xaD = this.KWHzl;
        c54918xaD.EZpvd.setVisibility(z ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = c54918xaD.djBIcL.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                if (this.KWHzl.fetchVPNInfo.getVisibility() == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(0);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (z) {
                        context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        f = 28.0f;
                    } else {
                        context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        f = 0.0f;
                    }
                    marginLayoutParams.setMarginEnd(C55298xhM.KWHzl(f, context));
                }
            }
            this.KWHzl.djBIcL.setLayoutParams(layoutParams);
        }
    }

    public final LinearLayout copydefault() {
        LinearLayout linearLayout = this.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TextView textView = this.KWHzl.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
    }

    public static /* synthetic */ void setMessage$default(OKReminder oKReminder, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        oKReminder.setMessage(str);
    }

    public final void setMessage(String str) {
        TextView textView = this.KWHzl.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
    }

    public final void AhwBna() {
        int iOLrzqt;
        int iOLrzqt2;
        int iCopydefault;
        Context context;
        int i;
        if (AYXKKw().values() == 257 || AYXKKw().values() == 261 || AYXKKw().values() == 262 || AYXKKw().values() == 260 || AYXKKw().values() == 258) {
            AYXKKw().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            ViewGroup.LayoutParams layoutParams = AEQbTJ().getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ImageView imageView = this.KWHzl.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                if (imageView.getVisibility() == 0) {
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    iOLrzqt = C55298xhM.OLrzqt(24, context2);
                } else {
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    iOLrzqt = C55298xhM.OLrzqt(4, context3);
                }
                marginLayoutParams.setMarginStart(iOLrzqt);
            }
            this.KWHzl.getRoot().setPaddingRelative(this.AEQbTJ.OLrzqt(), this.AEQbTJ.AhwBna(), this.AEQbTJ.EZpvd(), this.AEQbTJ.copydefault());
        } else {
            ViewGroup.LayoutParams layoutParams2 = AEQbTJ().getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                ImageView imageView2 = this.KWHzl.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                if (imageView2.getVisibility() == 0) {
                    context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    i = 12;
                } else {
                    context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    i = -8;
                }
                marginLayoutParams2.setMarginStart(C55298xhM.OLrzqt(i, context));
            }
            RelativeLayout relativeLayoutAEQbTJ = this.KWHzl.getRoot();
            int iOLrzqt3 = this.AEQbTJ.OLrzqt();
            int iAhwBna = this.AEQbTJ.AhwBna();
            int iEZpvd = this.AEQbTJ.EZpvd();
            if (AYXKKw().getVisibility() == 0) {
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                iCopydefault = C55298xhM.OLrzqt(4, context4);
            } else {
                iCopydefault = this.AEQbTJ.copydefault();
            }
            relativeLayoutAEQbTJ.setPaddingRelative(iOLrzqt3, iAhwBna, iEZpvd, iCopydefault);
        }
        ViewGroup.LayoutParams layoutParams3 = this.KWHzl.valueOf.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            ImageView imageView3 = this.KWHzl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            if (imageView3.getVisibility() == 0) {
                iOLrzqt2 = 0;
            } else {
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                iOLrzqt2 = C55298xhM.OLrzqt(4, context5);
            }
            marginLayoutParams3.setMarginStart(iOLrzqt2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.uilab.reminder.OKReminder */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void realSetAction$default(OKReminder oKReminder, String str, Function0 function0, C52794wYp c52794wYp, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            c52794wYp = oKReminder.KWHzl.AhwBna;
        }
        oKReminder.EZpvd(str, function0, c52794wYp);
    }

    public final void EZpvd(String str, Function0<Unit> function0, C52794wYp c52794wYp) {
        if (str == null || str.length() == 0) {
            c52794wYp.setVisibility(8);
            return;
        }
        c52794wYp.setVisibility(0);
        c52794wYp.setText(str);
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, function0));
        if (this.KWHzl.AEQbTJ.getVisibility() == 0) {
            RelativeLayout relativeLayoutAEQbTJ = this.KWHzl.getRoot();
            int iOLrzqt = this.AEQbTJ.OLrzqt();
            int iAhwBna = this.AEQbTJ.AhwBna();
            int iEZpvd = this.AEQbTJ.EZpvd();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            relativeLayoutAEQbTJ.setPaddingRelative(iOLrzqt, iAhwBna, iEZpvd, C55298xhM.OLrzqt(4, context));
        }
    }

    private final void OLrzqt(int i) {
        if (i == 0) {
            OLrzqt(this.AEQbTJ.fetchVPNInfo(), this.AEQbTJ.valueOf());
            return;
        }
        if (i == 1) {
            OLrzqt(this.AEQbTJ.AuCTel(), this.AEQbTJ.values());
        } else if (i == 2) {
            OLrzqt(this.AEQbTJ.uzCIH(), this.AEQbTJ.getFieldNames());
        } else {
            if (i != 3) {
                return;
            }
            OLrzqt(this.AEQbTJ.RJOkX(), this.AEQbTJ.QUSxYX());
        }
    }

    public final void OLrzqt(int i, int i2) {
        C54918xaD c54918xaD = this.KWHzl;
        c54918xaD.DbNXlk.setTextColor(i);
        c54918xaD.AkhnZx.setTextColor(i2);
    }

    public final void setTextSize() {
        if (this.AEQbTJ.djSkpj() != -1) {
            this.KWHzl.DbNXlk.setTextSize(0, this.AEQbTJ.djSkpj());
        }
        if (this.AEQbTJ.DTwDnp() != -1) {
            this.KWHzl.AkhnZx.setTextSize(0, this.AEQbTJ.DTwDnp());
        }
    }

    private final void KWHzl(int i) {
        if (this.AEQbTJ.RcXXUw() != -1) {
            C55280xgv c55280xgv = new C55280xgv();
            C55279xgu c55279xgu = new C55279xgu();
            c55279xgu.AkhnZx(0);
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (this.AEQbTJ.QVAiDq() instanceof ColorDrawable) {
                                Drawable drawableQVAiDq = this.AEQbTJ.QVAiDq();
                                Intrinsics.copydefault(drawableQVAiDq, "");
                                c55279xgu.isConnected(((ColorDrawable) drawableQVAiDq).getColor());
                            }
                        } else if (i == 4 && (this.AEQbTJ.AxsJAY() instanceof ColorDrawable)) {
                            Drawable drawableAxsJAY = this.AEQbTJ.AxsJAY();
                            Intrinsics.copydefault(drawableAxsJAY, "");
                            c55279xgu.isConnected(((ColorDrawable) drawableAxsJAY).getColor());
                        }
                    } else if (this.AEQbTJ.iwGUEr() instanceof ColorDrawable) {
                        Drawable drawableIwGUEr = this.AEQbTJ.iwGUEr();
                        Intrinsics.copydefault(drawableIwGUEr, "");
                        c55279xgu.isConnected(((ColorDrawable) drawableIwGUEr).getColor());
                    }
                } else if (this.AEQbTJ.DbNXlk() instanceof ColorDrawable) {
                    Drawable drawableDbNXlk = this.AEQbTJ.DbNXlk();
                    Intrinsics.copydefault(drawableDbNXlk, "");
                    c55279xgu.isConnected(((ColorDrawable) drawableDbNXlk).getColor());
                }
            } else if (this.AEQbTJ.gEmmrt() instanceof ColorDrawable) {
                Drawable drawableGEmmrt = this.AEQbTJ.gEmmrt();
                Intrinsics.copydefault(drawableGEmmrt, "");
                c55279xgu.isConnected(((ColorDrawable) drawableGEmmrt).getColor());
            }
            c55279xgu.DbNXlk(this.AEQbTJ.RcXXUw());
            c55279xgu.fIwbmz(this.AEQbTJ.dNCPSb());
            c55279xgu.OLrzqt(this.AEQbTJ.fARcdN());
            RelativeLayout relativeLayoutAEQbTJ = this.KWHzl.getRoot();
            Intrinsics.checkNotNullExpressionValue(relativeLayoutAEQbTJ, "");
            c55280xgv.KWHzl(relativeLayoutAEQbTJ, c55279xgu);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Orientation {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Orientation[] $VALUES;
        public static final Orientation VERTICAL = new Orientation("VERTICAL", 0);
        public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL", 1);
        public static final Orientation UNDEFINED = new Orientation("UNDEFINED", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Orientation[] $values() {
            return new Orientation[]{VERTICAL, HORIZONTAL, UNDEFINED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Orientation> getEntries() {
            return $ENTRIES;
        }

        private Orientation(String str, int i) {
        }

        static {
            Orientation[] orientationArr$values = $values();
            $VALUES = orientationArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(orientationArr$values);
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) $VALUES.clone();
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilab.reminder.OKReminder.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
