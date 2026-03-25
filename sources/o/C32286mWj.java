package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.okinc.dexkline.market.features.chart.domain.ChartType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mWj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32286mWj extends AbstractC34627nff<C32284mWh> {
    public final Function1<ChartType, Unit> EZpvd;

    /* JADX INFO: renamed from: o.mWj$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChartType.values().length];
            try {
                iArr[ChartType.PRICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChartType.MARKET_CAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.dexkline.market.features.chart.domain.ChartType, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C32286mWj(@NotNull Function1<? super ChartType, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    @Override // o.AbstractC34627nff
    public ViewBinding EZpvd(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36074oOh c36074oOhEZpvd = C36074oOh.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36074oOhEZpvd, "");
        return c36074oOhEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/nfi;Ljava/lang/Object;)V */
    @Override // o.AbstractC34627nff
    public void EZpvd(@NotNull C34630nfi c34630nfi, @NotNull C32284mWh c32284mWh) {
        Intrinsics.checkNotNullParameter(c34630nfi, "");
        Intrinsics.checkNotNullParameter(c32284mWh, "");
        ViewBinding viewBindingKWHzl = c34630nfi.KWHzl();
        C36074oOh c36074oOh = viewBindingKWHzl instanceof C36074oOh ? (C36074oOh) viewBindingKWHzl : null;
        if (c36074oOh == null) {
            return;
        }
        LinearLayoutCompat root = c36074oOh.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, this, c32284mWh));
        android.widget.TextView textView = c36074oOh.AEQbTJ;
        android.content.Context context = c36074oOh.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(KWHzl(context, c32284mWh.AEQbTJ()));
        wYC wyc = c36074oOh.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        wyc.setVisibility(c32284mWh.KWHzl() ? 0 : 8);
    }

    public final java.lang.String KWHzl(android.content.Context context, ChartType chartType) {
        int i;
        int i2 = Application.EZpvd[chartType.ordinal()];
        if (i2 == 1) {
            i = C35964oKf.Fragment.DMb;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C35964oKf.Fragment.DPHsZd;
        }
        java.lang.String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX INFO: renamed from: o.mWj$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C32286mWj KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C32284mWh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C32286mWj c32286mWj, C32284mWh c32284mWh) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c32286mWj;
            this.copydefault = c32284mWh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.EZpvd.invoke(this.copydefault.AEQbTJ());
            }
        }
    }
}
