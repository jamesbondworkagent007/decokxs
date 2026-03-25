package o;

import android.view.View;
import androidx.lifecycle.Observer;
import com.okinc.core.arch.data.StatefulData;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mnz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC32992mnz<T> implements Observer<StatefulData<T>> {
    public StatefulView AhwBna;
    public InterfaceC32953mnM EZpvd;
    public int KWHzl;

    /* JADX INFO: renamed from: o.mnz$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StatefulData.Status.values().length];
            try {
                iArr[StatefulData.Status.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[StatefulData.Status.LOADING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[StatefulData.Status.ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC32992mnz() {
        this(null, null, 0, 7, null);
    }

    public void AEQbTJ(android.view.View view) {
    }

    public void AEQbTJ(T t, android.view.View view) {
    }

    public void KWHzl(T t, android.view.View view) {
    }

    public abstract boolean KWHzl(T t);

    public void copydefault(T t, android.view.View view) {
    }

    public AbstractC32992mnz(StatefulView statefulView, InterfaceC32953mnM interfaceC32953mnM, int i) {
        this.AhwBna = statefulView;
        this.EZpvd = interfaceC32953mnM;
        this.KWHzl = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.uilab.stateful.StatefulView:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.uilab.stateful.StatefulView) : (r2v0 com.okinc.uilab.stateful.StatefulView))
  (wrap:o.mnM:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.mnM) : (r3v0 o.mnM))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(com.okinc.uilab.stateful.StatefulView, o.mnM, int):void (m)] (LINE:21) call: o.mnz.<init>(com.okinc.uilab.stateful.StatefulView, o.mnM, int):void type: THIS */
    public /* synthetic */ AbstractC32992mnz(StatefulView statefulView, InterfaceC32953mnM interfaceC32953mnM, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : statefulView, (i2 & 2) != 0 ? null : interfaceC32953mnM, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX DEBUG: Method merged with bridge method: onChanged(Ljava/lang/Object;)V */
    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onChanged(StatefulData<T> statefulData) {
        EZpvd((StatefulData) statefulData);
    }

    public final void EZpvd(StatefulData<T> statefulData) {
        if (statefulData == null) {
            AEQbTJ();
            return;
        }
        int i = Activity.AEQbTJ[statefulData.AEQbTJ().ordinal()];
        if (i == 1) {
            EZpvd(statefulData.djBIcL().EZpvd());
        } else if (i == 2) {
            OLrzqt(statefulData.KWHzl().EZpvd());
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            OLrzqt(statefulData.OLrzqt().copydefault(), statefulData.OLrzqt().EZpvd());
        }
    }

    public final void AEQbTJ() {
        StatefulView statefulView = this.AhwBna;
        if (statefulView != null) {
            statefulView.setStatus(StatefulView.Status.None);
        }
        AEQbTJ(copydefault(StatefulView.Status.None));
    }

    public final void EZpvd(T t) {
        if (KWHzl(t)) {
            StatefulView statefulView = this.AhwBna;
            if (statefulView != null) {
                statefulView.setStatus(StatefulView.Status.Empty);
            }
            copydefault(t, copydefault(StatefulView.Status.Empty));
            return;
        }
        StatefulView statefulView2 = this.AhwBna;
        if (statefulView2 != null) {
            statefulView2.setStatus(StatefulView.Status.Content);
        }
        AEQbTJ(t, copydefault(StatefulView.Status.Content));
    }

    public final void OLrzqt(T t) {
        StatefulView statefulView = this.AhwBna;
        if (statefulView != null) {
            statefulView.setStatus(StatefulView.Status.Loading);
        }
        KWHzl(t, copydefault(StatefulView.Status.Loading));
    }

    public final void OLrzqt(java.lang.Throwable th, T t) {
        StatefulView statefulView = this.AhwBna;
        if (statefulView != null) {
            statefulView.setStatus(StatefulView.Status.Error);
        }
        KWHzl(th, t, copydefault(StatefulView.Status.Error));
    }

    public final android.view.View copydefault(StatefulView.Status status) {
        StatefulView statefulView = this.AhwBna;
        if (statefulView != null) {
            return statefulView.AEQbTJ(status);
        }
        return null;
    }

    public void KWHzl(@NotNull final java.lang.Throwable th, final T t, final android.view.View view) {
        int i;
        android.view.View viewFindViewById;
        Intrinsics.checkNotNullParameter(th, "");
        if (view == null || (i = this.KWHzl) <= 0 || (viewFindViewById = view.findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: o.mnx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                AbstractC32992mnz.EZpvd(this.AEQbTJ, view, th, t, view2);
            }
        });
    }

    public static final void EZpvd(AbstractC32992mnz abstractC32992mnz, android.view.View view, java.lang.Throwable th, java.lang.Object obj, android.view.View view2) {
        Intrinsics.copydefault(view2);
        abstractC32992mnz.EZpvd(view2, view, th, obj);
    }

    public void EZpvd(@NotNull android.view.View view, @NotNull android.view.View view2, @NotNull java.lang.Throwable th, T t) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(th, "");
        InterfaceC32953mnM interfaceC32953mnM = this.EZpvd;
        if (interfaceC32953mnM != null) {
            interfaceC32953mnM.KWHzl(true);
        }
    }
}
