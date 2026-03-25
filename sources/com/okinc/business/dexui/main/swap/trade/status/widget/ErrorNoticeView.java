package com.okinc.business.dexui.main.swap.trade.status.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.google.common.net.HttpHeaders;
import com.okinc.business.dexui.main.swap.trade.status.widget.ErrorNoticeView;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25352ivB;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class ErrorNoticeView extends LinearLayout {
    public final OKReminder AEQbTJ;
    public Animation EZpvd;
    public Animation KWHzl;
    public final LinearLayout.LayoutParams OLrzqt;
    public final Handler copydefault;
    public Level djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorNoticeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorNoticeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: com.okinc.business.dexui.main.swap.trade.status.widget.ErrorNoticeView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ ErrorNoticeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorNoticeView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new Handler(Looper.getMainLooper());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.OLrzqt = layoutParams;
        OKReminder oKReminder = new OKReminder(context, null, 0, 6, null);
        oKReminder.setTitle("");
        oKReminder.setMessage("");
        oKReminder.setStyle(0);
        oKReminder.setCloseIconVisibility(false);
        this.AEQbTJ = oKReminder;
        setOrientation(1);
        setWillNotDraw(false);
        setGravity(17);
        addView(oKReminder, layoutParams);
    }

    private final void EZpvd(Level level) {
        if (this.djBIcL == level) {
            return;
        }
        this.djBIcL = level;
        this.AEQbTJ.setStyle(level == Level.Warning ? 2 : 3);
        invalidate();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.okinc.business.dexui.main.swap.trade.status.widget.ErrorNoticeView */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setText$default(ErrorNoticeView errorNoticeView, CharSequence charSequence, CharSequence charSequence2, Level level, Function0 function0, String str, Function0 function02, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setText");
        }
        if ((i & 1) != 0) {
            charSequence = "";
        }
        if ((i & 2) != 0) {
            charSequence2 = "";
        }
        if ((i & 4) != 0) {
            level = Level.Warning;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        if ((i & 16) != 0) {
            str = "";
        }
        if ((i & 32) != 0) {
            function02 = null;
        }
        errorNoticeView.setText(charSequence, charSequence2, level, function0, str, function02);
    }

    public final void setText(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull Level level, Function0<Unit> function0, @NotNull String str, final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(level, "");
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(level);
        this.AEQbTJ.setTitle(charSequence);
        this.AEQbTJ.setMessage(charSequence2);
        this.AEQbTJ.setPrimaryAction(str, new Function0() { // from class: o.ipu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ErrorNoticeView.OLrzqt(function02);
            }
        });
        if (function0 != null) {
            this.AEQbTJ.setCloseIconVisibility(true);
            this.AEQbTJ.setOnCloseIconCallback(function0);
        } else {
            this.AEQbTJ.setCloseIconVisibility(false);
        }
        invalidate();
    }

    public static final Unit OLrzqt(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    public void setVisibility(final int i) {
        this.copydefault.removeCallbacksAndMessages(null);
        this.copydefault.postDelayed(new Runnable() { // from class: o.ipz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ErrorNoticeView.setVisibility$lambda$4(this.EZpvd, i);
            }
        }, 100L);
    }

    public static final void setVisibility$lambda$4(final ErrorNoticeView errorNoticeView, final int i) {
        if (errorNoticeView.getVisibility() == 0 && i == 0) {
            return;
        }
        if (errorNoticeView.getVisibility() == 8 && i == 8) {
            return;
        }
        if (i == 0) {
            Animation animation = errorNoticeView.EZpvd;
            if ((animation == null || !animation.hasEnded()) && errorNoticeView.EZpvd != null) {
                return;
            }
            errorNoticeView.EZpvd = C25352ivB.EZpvd(errorNoticeView, 100L, (Function0<Unit>) new Function0() { // from class: o.ipA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ErrorNoticeView.EZpvd(this.OLrzqt, i);
                }
            });
            return;
        }
        if (i == 8) {
            Animation animation2 = errorNoticeView.KWHzl;
            if ((animation2 == null || !animation2.hasEnded()) && errorNoticeView.KWHzl != null) {
                return;
            }
            errorNoticeView.KWHzl = C25352ivB.KWHzl((View) errorNoticeView, 100L, (Function0<Unit>) new Function0() { // from class: o.ipx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ErrorNoticeView.OLrzqt(this.OLrzqt, i);
                }
            });
            return;
        }
        super.setVisibility(i);
    }

    public static final Unit EZpvd(ErrorNoticeView errorNoticeView, int i) {
        super.setVisibility(i);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ErrorNoticeView errorNoticeView, int i) {
        super.setVisibility(i);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animation animation = this.KWHzl;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.EZpvd;
        if (animation2 != null) {
            animation2.cancel();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Level {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level Error = new Level("Error", 0);
        public static final Level Warning = new Level(HttpHeaders.WARNING, 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Level[] $values() {
            return new Level[]{Error, Warning};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Level> getEntries() {
            return $ENTRIES;
        }

        private Level(String str, int i) {
        }

        static {
            Level[] levelArr$values = $values();
            $VALUES = levelArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(levelArr$values);
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }
}
