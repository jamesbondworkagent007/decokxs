package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.market.bean.CoinQuote;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qAT extends AbstractC40510qYn<qWC, C42894rey> {

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C42894rey AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ qWC OLrzqt;
        public final /* synthetic */ CoinQuote copydefault;
        public final /* synthetic */ long valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, CoinQuote coinQuote, C42894rey c42894rey, int i, qWC qwc) {
            this.EZpvd = view;
            this.valueOf = j;
            this.copydefault = coinQuote;
            this.AEQbTJ = c42894rey;
            this.KWHzl = i;
            this.OLrzqt = qwc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.valueOf || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (Intrinsics.EZpvd((java.lang.Object) this.copydefault.getInstType(), (java.lang.Object) "COIN")) {
                    AppCompatTextView root = this.AEQbTJ.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                    qPL qplAEQbTJ = qPS.AEQbTJ(root);
                    if (qplAEQbTJ != null) {
                        qplAEQbTJ.copydefault(new C40131qKm(this.copydefault.getInstId()));
                        return;
                    }
                    return;
                }
                AppCompatTextView root2 = this.AEQbTJ.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "");
                qPL qplAEQbTJ2 = qPS.AEQbTJ(root2);
                if (qplAEQbTJ2 != null) {
                    AppCompatTextView root3 = this.AEQbTJ.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root3, "");
                    java.lang.String instId = this.copydefault.getInstId();
                    java.lang.String instType = this.copydefault.getInstType();
                    int i = this.KWHzl;
                    qplAEQbTJ2.AEQbTJ(root3, new C48915ueg(instId, instType, java.lang.Integer.valueOf(i), C27989kKu.Companion.djBIcL()), "all", "", false, this.OLrzqt.copydefault());
                }
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42894rey AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42894rey c42894reyOLrzqt = C42894rey.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42894reyOLrzqt, "");
        return c42894reyOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42894rey c42894rey, int i, @NotNull qWC qwc) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(c42894rey, "");
        Intrinsics.checkNotNullParameter(qwc, "");
        CoinQuote coinQuoteKWHzl = qwc.KWHzl();
        java.lang.String instType = coinQuoteKWHzl.getInstType();
        java.lang.String baseCurrency = coinQuoteKWHzl.getBaseCurrency();
        java.lang.String quoteCurrency = coinQuoteKWHzl.getQuoteCurrency();
        java.lang.CharSequence charSequence = baseCurrency;
        switch (instType.hashCode()) {
            case -1956807563:
                str = "OPTION";
                instType.equals(str);
                charSequence = baseCurrency;
                break;
            case 2074257:
                charSequence = baseCurrency;
                if (instType.equals("COIN")) {
                    charSequence = C33061mpO.setupSpanStyles$default(baseCurrency + " " + quoteCurrency, new java.lang.String[]{quoteCurrency}, 0, null, false, new Function1() { // from class: o.qAQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return qAT.OLrzqt(c42894rey, (java.util.List) obj);
                        }
                    }, 14, null);
                }
                break;
            case 2552066:
                charSequence = baseCurrency;
                if (instType.equals("SPOT")) {
                    charSequence = C33061mpO.setupSpanStyles$default(baseCurrency + " /" + quoteCurrency, new java.lang.String[]{"/" + quoteCurrency}, 0, null, false, new Function1() { // from class: o.qAR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return qAT.EZpvd(c42894rey, (java.util.List) obj);
                        }
                    }, 14, null);
                }
                break;
            case 2558355:
                str = "SWAP";
                instType.equals(str);
                charSequence = baseCurrency;
                break;
            case 214415088:
                str = "FUTURES";
                instType.equals(str);
                charSequence = baseCurrency;
                break;
        }
        c42894rey.getRoot().setText(charSequence);
        AppCompatTextView root = c42894rey.getRoot();
        root.setOnClickListener(new Application(root, 1000L, coinQuoteKWHzl, c42894rey, i, qwc));
    }

    public static final Unit EZpvd(C42894rey c42894rey, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c42894rey.getRoot().getContext(), C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C42894rey c42894rey, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c42894rey.getRoot().getContext(), C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }
}
