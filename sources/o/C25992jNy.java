package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.market.features.chart.domain.ChartType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jNy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25992jNy extends kMD<jNE> {
    public final Function1<ChartType, Unit> copydefault;

    /* JADX INFO: renamed from: o.jNy$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

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
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.chart.domain.ChartType, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C25992jNy(@NotNull Function1<? super ChartType, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    @Override // o.kMD
    public ViewBinding KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21543hDg c21543hDgEZpvd = C21543hDg.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21543hDgEZpvd, "");
        return c21543hDgEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/kMF;Ljava/lang/Object;)V */
    @Override // o.kMD
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull kMF kmf, @NotNull jNE jne) {
        Intrinsics.checkNotNullParameter(kmf, "");
        Intrinsics.checkNotNullParameter(jne, "");
        ViewBinding viewBindingAEQbTJ = kmf.AEQbTJ();
        C21543hDg c21543hDg = viewBindingAEQbTJ instanceof C21543hDg ? (C21543hDg) viewBindingAEQbTJ : null;
        if (c21543hDg == null) {
            return;
        }
        LinearLayoutCompat root = c21543hDg.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this, jne));
        android.widget.TextView textView = c21543hDg.AEQbTJ;
        android.content.Context context = c21543hDg.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(OLrzqt(context, jne.copydefault()));
        wYC wyc = c21543hDg.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        wyc.setVisibility(jne.KWHzl() ? 0 : 8);
    }

    public final java.lang.String OLrzqt(android.content.Context context, ChartType chartType) {
        int i;
        int i2 = Activity.OLrzqt[chartType.ordinal()];
        if (i2 == 1) {
            i = C23274hvD.Fragment.build;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23274hvD.Fragment.avCqka;
        }
        java.lang.String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX INFO: renamed from: o.jNy$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ jNE KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C25992jNy copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C25992jNy c25992jNy, jNE jne) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c25992jNy;
            this.KWHzl = jne;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.copydefault.invoke(this.KWHzl.copydefault());
            }
        }
    }
}
