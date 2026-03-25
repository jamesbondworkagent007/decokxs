package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qIE extends ConstraintLayout {
    public final C42926rfd OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qIE(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qIE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:11) call: o.qIE.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ qIE(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qIE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42926rfd c42926rfdEZpvd = C42926rfd.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42926rfdEZpvd, "");
        this.OLrzqt = c42926rfdEZpvd;
    }

    public final void setSortChangeListener(@NotNull final Function2<? super OKSortTextView.SortType, ? super OKSortTextView.SortType, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        final C42926rfd c42926rfd = this.OLrzqt;
        OKSortTextView oKSortTextView = c42926rfd.AEQbTJ;
        oKSortTextView.setOnClickListener(new StateListAnimator(oKSortTextView, 200L, c42926rfd));
        OKSortTextView oKSortTextView2 = c42926rfd.KWHzl;
        oKSortTextView2.setOnClickListener(new ActionBar(oKSortTextView2, 200L, c42926rfd));
        c42926rfd.AEQbTJ.setOnSortTypeChangeListener(new Function2() { // from class: o.qIA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return qIE.KWHzl(c42926rfd, function2, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
            }
        });
        c42926rfd.KWHzl.setOnSortTypeChangeListener(new Function2() { // from class: o.qIC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return qIE.copydefault(c42926rfd, function2, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
            }
        });
    }

    public static final Unit KWHzl(C42926rfd c42926rfd, Function2 function2, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        OKSortTextView oKSortTextView2 = c42926rfd.KWHzl;
        OKSortTextView.SortType sortType2 = OKSortTextView.SortType.NONE;
        oKSortTextView2.setSortType(sortType2, false);
        function2.invoke(sortType, sortType2);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C42926rfd c42926rfd, Function2 function2, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        OKSortTextView oKSortTextView2 = c42926rfd.AEQbTJ;
        OKSortTextView.SortType sortType2 = OKSortTextView.SortType.NONE;
        oKSortTextView2.setSortType(sortType2, false);
        function2.invoke(sortType2, sortType);
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C42926rfd AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C42926rfd c42926rfd) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c42926rfd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl.setUpDownSortType(true);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C42926rfd KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42926rfd c42926rfd) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c42926rfd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ.setUpDownSortType(true);
            }
        }
    }
}
