package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.okinc.market.widget.calendar.DayItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.pVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qYJ<T extends ViewBinding> {
    public final T AEQbTJ;
    public final Function2<DayItem, T, Unit> AYXKKw;
    public final InterfaceC56387yDm EZpvd;
    public final qYH KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.market.widget.calendar.DayItem, ? super T extends androidx.viewbinding.ViewBinding, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public qYJ(@NotNull final android.content.Context context, @NotNull qYH qyh, @NotNull T t, @androidx.annotation.IdRes final int i, @NotNull Function2<? super DayItem, ? super T, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(qyh, "");
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.KWHzl = qyh;
        this.AEQbTJ = t;
        this.AYXKKw = function2;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qYL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qYJ.AEQbTJ(context, this);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.qYR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qYJ.copydefault(this.OLrzqt);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.qYN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qYJ.copydefault(context, this);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.qYO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qYJ.KWHzl(i, this);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qYQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qYJ.KWHzl(this.EZpvd);
            }
        });
    }

    public final android.view.View AEQbTJ() {
        return (android.view.View) this.EZpvd.getValue();
    }

    public static final android.view.View AEQbTJ(android.content.Context context, qYJ qyj) {
        return android.view.LayoutInflater.from(context).inflate(pVX.Application.OLrzqt, (android.view.ViewGroup) qyj.KWHzl, false);
    }

    public final android.view.View AYXKKw() {
        return (android.view.View) this.valueOf.getValue();
    }

    public static final android.view.View copydefault(qYJ qyj) {
        return qyj.AEQbTJ().findViewById(pVX.ActionBar.djBIcL);
    }

    public final android.view.View AhwBna() {
        return (android.view.View) this.gEmmrt.getValue();
    }

    public static final android.view.View copydefault(android.content.Context context, final qYJ qyj) {
        android.view.View view = new android.view.View(context);
        view.setBackgroundColor(0);
        view.setOnClickListener(new View.OnClickListener() { // from class: o.qYI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                qYJ.copydefault(this.AEQbTJ, view2);
            }
        });
        return view;
    }

    public static final void copydefault(qYJ qyj, android.view.View view) {
        qyj.OLrzqt();
    }

    public final void KWHzl(@NotNull DayItem dayItem, int i) {
        Intrinsics.checkNotNullParameter(dayItem, "");
        if (this.AEQbTJ.getRoot().getParent() == null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) AEQbTJ().findViewById(pVX.ActionBar.KWHzl);
            viewGroup.removeAllViews();
            viewGroup.addView(this.AEQbTJ.getRoot(), -2, -2);
        }
        AEQbTJ().setAlpha(1.0f);
        this.AYXKKw.invoke(dayItem, this.AEQbTJ);
        EZpvd(dayItem.EZpvd(), i);
        gEmmrt();
    }

    public final android.view.ViewGroup KWHzl() {
        return (android.view.ViewGroup) this.copydefault.getValue();
    }

    /* JADX DEBUG: Duplicate block (B:5:0x000d) to fix multi-entry loop: BACK_EDGE: B:5:0x000d -> B:6:0x000e */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x000e, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends ViewBinding> android.view.ViewGroup OLrzqt(qYJ<T> qyj, @androidx.annotation.IdRes int i) {
        android.view.ViewGroup viewGroup;
        android.view.ViewParent parent = qyj.KWHzl.getParent();
        if (parent instanceof android.view.ViewGroup) {
            viewGroup = (android.view.ViewGroup) parent;
            while (viewGroup != null && viewGroup.getId() != i) {
                android.view.ViewParent parent2 = viewGroup.getParent();
                if (parent2 instanceof android.view.ViewGroup) {
                    viewGroup = (android.view.ViewGroup) parent2;
                }
            }
            return viewGroup;
        }
        viewGroup = null;
    }

    public static final android.view.ViewGroup KWHzl(int i, qYJ qyj) {
        android.view.ViewGroup viewGroupOLrzqt = OLrzqt(qyj, i);
        return viewGroupOLrzqt == null ? OLrzqt(qyj, android.R.id.content) : viewGroupOLrzqt;
    }

    public final android.view.ViewGroup copydefault() {
        return (android.view.ViewGroup) this.OLrzqt.getValue();
    }

    /* JADX DEBUG: Duplicate block (B:5:0x000e) to fix multi-entry loop: BACK_EDGE: B:5:0x000e -> B:6:0x000f */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x000f, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends ViewBinding> android.view.ViewGroup AEQbTJ(qYJ<T> qyj) {
        android.view.ViewGroup viewGroup;
        android.view.ViewParent parent = qyj.KWHzl.getParent();
        if (parent instanceof android.view.ViewGroup) {
            viewGroup = (android.view.ViewGroup) parent;
            while (viewGroup != null) {
                if (viewGroup.getId() == 16908290) {
                    return viewGroup;
                }
                android.view.ViewParent parent2 = viewGroup.getParent();
                if (parent2 instanceof android.view.ViewGroup) {
                    viewGroup = (android.view.ViewGroup) parent2;
                }
            }
            return null;
        }
        viewGroup = null;
    }

    public static final android.view.ViewGroup KWHzl(qYJ qyj) {
        return AEQbTJ(qyj);
    }

    public final void EZpvd(android.graphics.Rect rect, int i) {
        android.view.ViewGroup viewGroupKWHzl = KWHzl();
        if (viewGroupKWHzl == null) {
            return;
        }
        if (AEQbTJ().getParent() == null) {
            viewGroupKWHzl.addView(AEQbTJ(), -2, -2);
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.KWHzl.getLocationOnScreen(iArr);
        viewGroupKWHzl.getLocationOnScreen(iArr2);
        int i2 = iArr[0];
        int i3 = iArr2[0];
        int i4 = iArr[1];
        int i5 = iArr2[1];
        AEQbTJ().measure(0, 0);
        int measuredWidth = AEQbTJ().getMeasuredWidth();
        float f = measuredWidth;
        float fCenterX = ((i2 - i3) + rect.centerX()) - (f / 2.0f);
        float f2 = i4 - i5;
        float measuredHeight = AEQbTJ().getMeasuredHeight();
        float f3 = rect.top;
        float f4 = i;
        if (fCenterX < 0.0f) {
            AYXKKw().setTranslationX(fCenterX);
            AEQbTJ().setTranslationX(0.0f);
        } else {
            float f5 = fCenterX + f;
            if (f5 > viewGroupKWHzl.getWidth()) {
                AYXKKw().setTranslationX(f5 - viewGroupKWHzl.getWidth());
                AEQbTJ().setTranslationX(viewGroupKWHzl.getWidth() - f);
            } else {
                AYXKKw().setTranslationX(0.0f);
                AEQbTJ().setTranslationX(fCenterX);
            }
        }
        AEQbTJ().setTranslationY((f2 - (measuredHeight * 1.0f)) + f3 + f4);
    }

    public final void EZpvd() {
        android.view.ViewGroup viewGroupKWHzl = KWHzl();
        if (viewGroupKWHzl != null) {
            viewGroupKWHzl.removeView(AEQbTJ());
        }
        android.view.ViewGroup viewGroupCopydefault = copydefault();
        if (viewGroupCopydefault != null) {
            viewGroupCopydefault.removeView(AhwBna());
        }
    }

    public final void OLrzqt() {
        AEQbTJ().setAlpha(0.0f);
        android.view.ViewGroup viewGroupCopydefault = copydefault();
        if (viewGroupCopydefault != null) {
            viewGroupCopydefault.removeView(AhwBna());
        }
    }

    public final void gEmmrt() {
        android.view.ViewGroup viewGroupCopydefault = copydefault();
        if (viewGroupCopydefault == null) {
            return;
        }
        if (AhwBna().getParent() != null) {
            viewGroupCopydefault.removeView(AhwBna());
        }
        viewGroupCopydefault.addView(AhwBna(), new ViewGroup.LayoutParams(-1, -1));
    }
}
