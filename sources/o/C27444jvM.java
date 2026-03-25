package o;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27444jvM extends android.widget.LinearLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public Function1<? super java.lang.String, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27444jvM(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27444jvM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputRangeClickListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.jvM.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27444jvM(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27444jvM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(0);
        setPadding(C55298xhM.dp2px$default(24.0f, null, 1, null), 0, C55298xhM.dp2px$default(24.0f, null, 1, null), 0);
        setDividerDrawable(C33070mpX.KWHzl(C25493ixk.StateListAnimator.AYXKKw));
        setShowDividers(2);
    }

    /* JADX INFO: renamed from: o.jvM$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jvM.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void setInputRanges(@NotNull java.util.List<C24180iXw> list) {
        Intrinsics.checkNotNullParameter(list, "");
        setVisibility(C33129mqd.KWHzl((java.util.Collection) list) ? 0 : 8);
        removeAllViews();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            addView(EZpvd((C24180iXw) it.next()));
            arrayList.add(Unit.INSTANCE);
        }
    }

    public final C54984xbQ EZpvd(C24180iXw c24180iXw) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.gravity = 17;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C54984xbQ c54984xbQ = new C54984xbQ(context, null, 0, 6, null);
        c54984xbQ.setLayoutParams(layoutParams);
        c54984xbQ.setOKDSSize(36);
        c54984xbQ.setStyle(4);
        c54984xbQ.setEnabledStyle(true, 4);
        c54984xbQ.setSelectedStyle(true, 4);
        c54984xbQ.setText(c24180iXw.copydefault());
        c54984xbQ.setTag(c24180iXw.KWHzl());
        c54984xbQ.setOnClickListener(new StateListAnimator(c54984xbQ, 1000L, this, c24180iXw));
        return c54984xbQ;
    }

    /* JADX INFO: renamed from: o.jvM$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C27444jvM AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C24180iXw KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C27444jvM c27444jvM, C24180iXw c24180iXw) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c27444jvM;
            this.KWHzl = c24180iXw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C27579jxp.copydefault.AEQbTJ();
                Function1 function1 = this.AEQbTJ.AEQbTJ;
                if (function1 != null) {
                    function1.invoke(this.KWHzl.KWHzl());
                }
            }
        }
    }
}
