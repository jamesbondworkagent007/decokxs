package o;

import android.view.View;
import com.okinc.core.widget.SortTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27555jxR extends android.widget.LinearLayout {
    public SortTextView.SortType AEQbTJ;
    public SortTextView.SortType EZpvd;
    public final C42908rfL KWHzl;

    /* JADX INFO: renamed from: o.jxR$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SortTextView.SortType.values().length];
            try {
                iArr[SortTextView.SortType.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SortTextView.SortType.UP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SortTextView.SortType.DOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27555jxR(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        C42908rfL c42908rfLAEQbTJ = C42908rfL.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(c42908rfLAEQbTJ, "");
        this.KWHzl = c42908rfLAEQbTJ;
        SortTextView.SortType sortType = SortTextView.SortType.NONE;
        this.EZpvd = sortType;
        this.AEQbTJ = sortType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27555jxR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C42908rfL c42908rfLAEQbTJ = C42908rfL.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(c42908rfLAEQbTJ, "");
        this.KWHzl = c42908rfLAEQbTJ;
        SortTextView.SortType sortType = SortTextView.SortType.NONE;
        this.EZpvd = sortType;
        this.AEQbTJ = sortType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27555jxR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42908rfL c42908rfLAEQbTJ = C42908rfL.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(c42908rfLAEQbTJ, "");
        this.KWHzl = c42908rfLAEQbTJ;
        SortTextView.SortType sortType = SortTextView.SortType.NONE;
        this.EZpvd = sortType;
        this.AEQbTJ = sortType;
    }

    public final void setData(@NotNull java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        if (strArr.length < 4) {
            return;
        }
        this.KWHzl.OLrzqt.setText(strArr[0]);
        this.KWHzl.copydefault.setText(strArr[1]);
        this.KWHzl.EZpvd.setText(strArr[2]);
        this.KWHzl.KWHzl.setText(strArr[3]);
        this.KWHzl.EZpvd.setSortType(this.EZpvd, false);
        this.KWHzl.KWHzl.setSortType(this.AEQbTJ, false);
    }

    public final void setListener(@NotNull final Function1<? super java.lang.Integer, Unit> function1, @NotNull final Function2<? super SortTextView.SortType, ? super SortTextView.SortType, Unit> function2) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.KWHzl.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.jya
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27555jxR.setListener$lambda$0(function1, view);
            }
        });
        this.KWHzl.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.jxW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27555jxR.setListener$lambda$1(function1, view);
            }
        });
        this.KWHzl.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.jxX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27555jxR.setListener$lambda$2(this.copydefault, function2, view);
            }
        });
        this.KWHzl.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.jxY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27555jxR.setListener$lambda$3(this.AEQbTJ, function2, view);
            }
        });
    }

    public static final void setListener$lambda$0(Function1 function1, android.view.View view) {
        function1.invoke(0);
    }

    public static final void setListener$lambda$1(Function1 function1, android.view.View view) {
        function1.invoke(1);
    }

    public static final void setListener$lambda$2(C27555jxR c27555jxR, Function2 function2, android.view.View view) {
        c27555jxR.AEQbTJ = SortTextView.SortType.NONE;
        c27555jxR.EZpvd = c27555jxR.EZpvd(c27555jxR.EZpvd);
        c27555jxR.KWHzl.KWHzl.setSortType(c27555jxR.AEQbTJ, false);
        c27555jxR.KWHzl.EZpvd.setSortType(c27555jxR.EZpvd, false);
        function2.invoke(c27555jxR.EZpvd, c27555jxR.AEQbTJ);
    }

    public static final void setListener$lambda$3(C27555jxR c27555jxR, Function2 function2, android.view.View view) {
        c27555jxR.EZpvd = SortTextView.SortType.NONE;
        c27555jxR.AEQbTJ = c27555jxR.EZpvd(c27555jxR.AEQbTJ);
        c27555jxR.KWHzl.EZpvd.setSortType(c27555jxR.EZpvd, false);
        c27555jxR.KWHzl.KWHzl.setSortType(c27555jxR.AEQbTJ, false);
        function2.invoke(c27555jxR.EZpvd, c27555jxR.AEQbTJ);
    }

    public final SortTextView.SortType EZpvd(SortTextView.SortType sortType) {
        int i = Application.KWHzl[sortType.ordinal()];
        if (i == 1) {
            return SortTextView.SortType.UP;
        }
        if (i == 2) {
            return SortTextView.SortType.DOWN;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return SortTextView.SortType.NONE;
    }
}
