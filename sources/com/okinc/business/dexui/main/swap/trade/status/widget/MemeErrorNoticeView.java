package com.okinc.business.dexui.main.swap.trade.status.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.common.net.HttpHeaders;
import com.okinc.business.dexui.main.swap.trade.status.widget.MemeErrorNoticeView;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MemeErrorNoticeView extends LinearLayout {
    public Level EZpvd;
    public final LinearLayout.LayoutParams KWHzl;
    public final OKReminder OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MemeErrorNoticeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MemeErrorNoticeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: com.okinc.business.dexui.main.swap.trade.status.widget.MemeErrorNoticeView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ MemeErrorNoticeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeErrorNoticeView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.KWHzl = layoutParams;
        OKReminder oKReminder = new OKReminder(context, null, 0, 6, null);
        oKReminder.setTitle("");
        oKReminder.setMessage("");
        oKReminder.setStyle(0);
        oKReminder.setCloseIconVisibility(false);
        this.OLrzqt = oKReminder;
        setOrientation(1);
        setWillNotDraw(false);
        setGravity(17);
        addView(oKReminder, layoutParams);
    }

    private final void OLrzqt(Level level) {
        if (this.EZpvd == level) {
            return;
        }
        this.EZpvd = level;
        this.OLrzqt.setStyle(level == Level.Warning ? 2 : 3);
        invalidate();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.business.dexui.main.swap.trade.status.widget.MemeErrorNoticeView */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setText$default(MemeErrorNoticeView memeErrorNoticeView, CharSequence charSequence, CharSequence charSequence2, Level level, String str, Function0 function0, int i, Object obj) {
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
            str = "";
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        memeErrorNoticeView.setText(charSequence, charSequence2, level, str, function0);
    }

    public final void setText(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull Level level, @NotNull String str, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(level, "");
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(level);
        this.OLrzqt.setTitle(charSequence);
        this.OLrzqt.setMessage(charSequence2);
        this.OLrzqt.setPrimaryAction(str, new Function0() { // from class: o.ipG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeErrorNoticeView.OLrzqt(function0);
            }
        });
        invalidate();
    }

    public static final Unit OLrzqt(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
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
