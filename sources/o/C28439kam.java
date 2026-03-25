package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C28439kam;
import o.C52761wXj;
import o.kLL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kam, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28439kam extends kLH<HoldingAsset, ActionBar> {
    public boolean AEQbTJ;
    public boolean EZpvd;
    public final Function1<TokenBase, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dex.api.bean.TokenBase, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28439kam(@NotNull Function1<? super TokenBase, Unit> function1, boolean z, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str) {
        super(new C28445kas(), fragmentManager, fragment, str);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = function1;
        this.AEQbTJ = z;
    }

    /* JADX INFO: renamed from: o.kam$TaskDescription */
    public static final class TaskDescription {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }
    }

    @Override // o.kLH
    public kLN<HoldingAsset> OLrzqt(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C23382hxF c23382hxFKWHzl = C23382hxF.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23382hxFKWHzl, "");
        return new ActionBar(this, c23382hxFKWHzl);
    }

    @Override // o.kLH
    public RecyclerView.ViewHolder KWHzl(@NotNull android.view.ViewGroup viewGroup) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        RecyclerView.ViewHolder viewHolderKWHzl = super.KWHzl(viewGroup);
        Intrinsics.copydefault(viewHolderKWHzl, "");
        kLA kla = (kLA) viewHolderKWHzl;
        C55173xeu c55173xeu = kla.OLrzqt().OLrzqt;
        c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.DMb));
        if (this.EZpvd) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.iqeXgQ);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.getSerial);
        }
        c55173xeu.setSubTitle((java.lang.CharSequence) strAYXKKw);
        c55173xeu.OLrzqt().setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        c55173xeu.EZpvd().setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
        return kla;
    }

    public final void EZpvd(boolean z) {
        this.EZpvd = z;
        java.util.List<kLL<? extends T>> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        java.util.Iterator it = currentList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((kLL) it.next()) instanceof kLL.ActionBar) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            notifyItemChanged(i);
        }
    }

    @Override // o.kLH, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        super.onBindViewHolder(viewHolder, i);
        if (viewHolder instanceof kLA) {
            C55173xeu c55173xeu = ((kLA) viewHolder).OLrzqt().OLrzqt;
            if (this.EZpvd) {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.iqeXgQ);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.getSerial);
            }
            c55173xeu.setSubTitle((java.lang.CharSequence) strAYXKKw);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i);
            return;
        }
        java.lang.Object item = getItem(i);
        kLL.Activity activity = item instanceof kLL.Activity ? (kLL.Activity) item : null;
        if (activity != null && (viewHolder instanceof ActionBar) && (!list.isEmpty())) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof TaskDescription) {
                    ((ActionBar) viewHolder).KWHzl((HoldingAsset) activity.AEQbTJ());
                }
            }
        }
    }

    public final void copydefault(boolean z) {
        this.AEQbTJ = z;
        notifyItemRangeChanged(1, getItemCount(), TaskDescription.KWHzl);
    }

    /* JADX INFO: renamed from: o.kam$ActionBar */
    public final class ActionBar extends kLN<HoldingAsset> {
        public final /* synthetic */ C28439kam AEQbTJ;
        public final C23382hxF copydefault;

        /* JADX WARN: Illegal instructions before constructor call */
        public ActionBar(@NotNull C28439kam c28439kam, C23382hxF c23382hxF) {
            Intrinsics.checkNotNullParameter(c23382hxF, "");
            this.AEQbTJ = c28439kam;
            ConstraintLayout root = c23382hxF.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.copydefault = c23382hxF;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)V */
        @Override // o.kLN
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(@NotNull final HoldingAsset holdingAsset) {
            Intrinsics.checkNotNullParameter(holdingAsset, "");
            C23382hxF c23382hxF = this.copydefault;
            final C28439kam c28439kam = this.AEQbTJ;
            C25352ivB.setOnDoubleCheckClickListener$default(c23382hxF.getRoot(), 0L, new Function1() { // from class: o.kao
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28439kam.ActionBar.copydefault(c28439kam, holdingAsset, (android.view.View) obj);
                }
            }, 1, null);
            c23382hxF.KWHzl.AEQbTJ(holdingAsset.isConnected(), holdingAsset.AEQbTJ());
            c23382hxF.gEmmrt.setText(holdingAsset.AkhnZx());
            KWHzl(holdingAsset);
        }

        public static final Unit copydefault(C28439kam c28439kam, HoldingAsset holdingAsset, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            c28439kam.copydefault.invoke(new TokenBase(holdingAsset.OLrzqt(), holdingAsset.fetchVPNInfo(), holdingAsset.isConnected(), null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -8, null));
            return Unit.INSTANCE;
        }

        public final AppCompatTextView KWHzl(@NotNull HoldingAsset holdingAsset) {
            Intrinsics.checkNotNullParameter(holdingAsset, "");
            C23382hxF c23382hxF = this.copydefault;
            C28439kam c28439kam = this.AEQbTJ;
            c23382hxF.OLrzqt.setText(c28439kam.AEQbTJ ? "***" : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, holdingAsset.KWHzl(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null));
            c23382hxF.AhwBna.setText(c28439kam.AEQbTJ ? "***" : C23271hvA.formatTokenCode$default(C23271hvA.copydefault, holdingAsset.EZpvd(), true, null, false, null, null, 30, null));
            AppCompatTextView appCompatTextView = c23382hxF.djBIcL;
            Intrinsics.copydefault(appCompatTextView);
            appCompatTextView.setVisibility((holdingAsset.fARcdN().length() <= 0 || Intrinsics.EZpvd((java.lang.Object) holdingAsset.fARcdN(), (java.lang.Object) "--")) ? 8 : 0);
            if (c28439kam.AEQbTJ) {
                appCompatTextView.setText("***");
                appCompatTextView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
            } else {
                appCompatTextView.setText(EZpvd2(holdingAsset));
                kLY.updateColorByValue$default(appCompatTextView, holdingAsset.fARcdN(), null, 2, null);
            }
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            return appCompatTextView;
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public final java.lang.String EZpvd2(HoldingAsset holdingAsset) {
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            java.lang.String strFARcdN = holdingAsset.fARcdN();
            RoundingMode roundingMode = RoundingMode.DOWN;
            DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
            return C23272hvB.formatScientificCurrency$default(c23272hvB, strFARcdN, true, roundingMode, false, false, false, false, displaySign, false, false, 444, null) + " (" + kLY.formatPercentage$default(holdingAsset.AuCTel(), displaySign, false, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), 2, null) + ")";
        }
    }
}
