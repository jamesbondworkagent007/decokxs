package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.market.discover.features.markets.sub.overview.ui.MarketDiscoverOverallType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nlE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C34899nlE extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nlA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34899nlE.AEQbTJ(this.copydefault);
        }
    });
    public C42733rbw OLrzqt;

    /* JADX INFO: renamed from: o.nlE$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nlE.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C34899nlE copydefault(@NotNull MarketDiscoverOverallType marketDiscoverOverallType) {
            Intrinsics.checkNotNullParameter(marketDiscoverOverallType, "");
            C34899nlE c34899nlE = new C34899nlE();
            C6779aVn.copydefault(c34899nlE).putInt(MarketDiscoverOverallType.class.getName(), marketDiscoverOverallType.ordinal());
            return c34899nlE;
        }
    }

    public final MarketDiscoverOverallType EZpvd() {
        return (MarketDiscoverOverallType) this.AEQbTJ.getValue();
    }

    public static final MarketDiscoverOverallType AEQbTJ(C34899nlE c34899nlE) {
        MarketDiscoverOverallType marketDiscoverOverallType;
        int i = c34899nlE.requireArguments().getInt(MarketDiscoverOverallType.class.getName());
        MarketDiscoverOverallType[] marketDiscoverOverallTypeArrValues = MarketDiscoverOverallType.values();
        int length = marketDiscoverOverallTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                marketDiscoverOverallType = null;
                break;
            }
            marketDiscoverOverallType = marketDiscoverOverallTypeArrValues[i2];
            if (marketDiscoverOverallType.ordinal() == i) {
                break;
            }
            i2++;
        }
        if (marketDiscoverOverallType != null) {
            return marketDiscoverOverallType;
        }
        throw new java.lang.IllegalArgumentException("invalid market overall type");
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        android.view.View viewFindViewById = wxq.findViewById(C52761wXj.FragmentManager.DNMMPQ);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.OLrzqt = C42733rbw.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        OLrzqt();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void OLrzqt() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        C42733rbw c42733rbw = this.OLrzqt;
        if (c42733rbw != null && (textView2 = c42733rbw.OLrzqt) != null) {
            textView2.setText(C33070mpX.AYXKKw(EZpvd().getTileStringResId()));
        }
        C42733rbw c42733rbw2 = this.OLrzqt;
        if (c42733rbw2 == null || (textView = c42733rbw2.KWHzl) == null) {
            return;
        }
        textView.setText(C33070mpX.AYXKKw(EZpvd().getHintStringResId()));
    }
}
