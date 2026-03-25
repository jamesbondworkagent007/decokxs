package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.features.history.domain.model.HistoryTokenChange;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.jZT;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public final class jZT extends kLH<C26277jYm, Activity> {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public Function1<? super java.lang.String, Unit> KWHzl;
    public boolean OLrzqt;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TxType.values().length];
            try {
                iArr[TxType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TxType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jZT(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str3) {
        super(new jZU(), fragmentManager, fragment, str3);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = z;
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.KWHzl = function1;
    }

    public static final class ActionBar {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }
    }

    @Override // o.kLH
    public kLN<C26277jYm> OLrzqt(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21526hCq c21526hCqKWHzl = C21526hCq.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21526hCqKWHzl, "");
        return new Activity(this, c21526hCqKWHzl);
    }

    public final class Activity extends kLN<C26277jYm> {
        public final C21526hCq KWHzl;
        public final /* synthetic */ jZT OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final java.lang.String copydefault() {
            return "--";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Activity(@NotNull jZT jzt, C21526hCq c21526hCq) {
            Intrinsics.checkNotNullParameter(c21526hCq, "");
            this.OLrzqt = jzt;
            LinearLayoutCompat root = c21526hCq.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.KWHzl = c21526hCq;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)V */
        @Override // o.kLN
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(@NotNull C26277jYm c26277jYm) {
            java.lang.String showDataWithPrefix$default;
            java.lang.String strCopydefault;
            Intrinsics.checkNotNullParameter(c26277jYm, "");
            C21526hCq c21526hCq = this.KWHzl;
            final jZT jzt = this.OLrzqt;
            AppCompatTextView appCompatTextView = c21526hCq.KWHzl;
            if (c26277jYm.AhwBna().length() == 0) {
                showDataWithPrefix$default = "--";
            } else if (jzt.OLrzqt) {
                showDataWithPrefix$default = C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, C33129mqd.gEmmrt(java.lang.Float.valueOf(C33129mqd.djBIcL(c26277jYm.AhwBna()) / C33129mqd.djBIcL(C31256lqb.KWHzl(c26277jYm.OLrzqt(), (Function0<java.lang.String>) new Function0() { // from class: o.jZZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return jZT.Activity.AEQbTJ(jzt);
                    }
                })))), null, 1, null) + " " + jzt.EZpvd;
            } else {
                showDataWithPrefix$default = C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, c26277jYm.AhwBna(), false, false, RoundingMode.DOWN, false, 20, null);
            }
            appCompatTextView.setText(showDataWithPrefix$default);
            c21526hCq.OLrzqt.setText(c26277jYm.copydefault().length() != 0 ? C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, c26277jYm.copydefault(), false, false, RoundingMode.DOWN, false, 20, null) : "--");
            java.lang.String strIsConnected = c26277jYm.isConnected();
            TxType txType = TxType.BUY;
            if (!Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) txType.getValue())) {
                txType = TxType.SELL;
            }
            android.widget.TextView textView = c21526hCq.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C31258lqd.copydefault(textView, txType);
            android.content.Context context = c21526hCq.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            kotlin.Pair pairKWHzl = jzt.KWHzl(context, txType);
            final java.lang.String str = (java.lang.String) pairKWHzl.component1();
            int iIntValue = ((java.lang.Number) pairKWHzl.component2()).intValue();
            HistoryTokenChange historyTokenChange = (HistoryTokenChange) CollectionsKt___CollectionsKt.AkhnZx(c26277jYm.EZpvd(), 0);
            c21526hCq.EZpvd.setText(C31256lqb.KWHzl(C31256lqb.AEQbTJ(historyTokenChange != null ? historyTokenChange.copydefault() : null, (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.jZW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jZT.Activity.KWHzl(str, (java.lang.String) obj);
                }
            }), (Function0<java.lang.String>) new Function0() { // from class: o.jZY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jZT.Activity.copydefault();
                }
            }));
            c21526hCq.EZpvd.setTextColor(iIntValue);
            AppCompatTextView appCompatTextView2 = c21526hCq.djBIcL;
            if (c26277jYm.valueOf()) {
                strCopydefault = C25322iuY.OLrzqt.EZpvd(c26277jYm.gEmmrt());
            } else {
                strCopydefault = C25322iuY.OLrzqt.copydefault(c26277jYm.gEmmrt());
            }
            appCompatTextView2.setText(strCopydefault);
            LinearLayoutCompat root = c21526hCq.getRoot();
            root.setOnClickListener(new StateListAnimator(root, 1000L, jzt, c26277jYm));
        }

        public static final java.lang.String AEQbTJ(jZT jzt) {
            return jzt.AEQbTJ;
        }

        public static final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return str + C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, str2, null, 1, null);
        }

        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ jZT KWHzl;
            public final /* synthetic */ C26277jYm OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, jZT jzt, C26277jYm c26277jYm) {
                this.copydefault = view;
                this.EZpvd = j;
                this.KWHzl = jzt;
                this.OLrzqt = c26277jYm;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.KWHzl.KWHzl.invoke(this.OLrzqt.djBIcL());
                }
            }
        }
    }

    public final void KWHzl(boolean z) {
        this.OLrzqt = z;
        notifyItemRangeChanged(1, getItemCount(), ActionBar.copydefault);
    }

    public final kotlin.Pair<java.lang.String, java.lang.Integer> KWHzl(android.content.Context context, TxType txType) {
        int iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.getPostValueLengthLimit);
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        int iTradeFallDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp, context, 0.0f, 2, null);
        int i = TaskDescription.KWHzl[txType.ordinal()];
        if (i == 1) {
            return C56390yDp.OLrzqt(Marker.ANY_NON_NULL_MARKER, java.lang.Integer.valueOf(iTradeRiseDefault$default));
        }
        if (i == 2) {
            return C56390yDp.OLrzqt("-", java.lang.Integer.valueOf(iTradeFallDefault$default));
        }
        return C56390yDp.OLrzqt("", java.lang.Integer.valueOf(iKWHzl));
    }

    @Override // o.kLH
    public RecyclerView.ViewHolder KWHzl(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        RecyclerView.ViewHolder viewHolderKWHzl = super.KWHzl(viewGroup);
        Intrinsics.copydefault(viewHolderKWHzl, "");
        kLA kla = (kLA) viewHolderKWHzl;
        C55173xeu c55173xeu = kla.OLrzqt().OLrzqt;
        c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.createHandler));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.viewCreated));
        return kla;
    }
}
