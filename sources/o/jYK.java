package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.holders.domain.model.BubbleMap;
import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import com.okinc.business.market.features.holders.domain.model.HoldersFragmentParams;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C26305jZn;
import o.C32113mPz;
import o.C52761wXj;
import o.jYK;
import o.jYL;
import o.kLL;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public final class jYK extends kLM<HolderDetailModel, StateListAnimator, C26300jZi> {
    public boolean AEQbTJ;
    public final int AYXKKw;
    public final HoldersFragmentParams AhwBna;
    public boolean EZpvd;
    public jYL.Activity KWHzl;
    public final InterfaceC26009jOo OLrzqt;
    public final BubbleMap copydefault;
    public Function0<Unit> djBIcL;
    public jNY gEmmrt;
    public final InterfaceC26302jZk valueOf;

    public static final void KWHzl(android.view.View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull jNY jny) {
        Intrinsics.checkNotNullParameter(jny, "");
        this.gEmmrt = jny;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = z;
        this.djBIcL = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jYK(int i, @NotNull HoldersFragmentParams holdersFragmentParams, BubbleMap bubbleMap, boolean z, @NotNull InterfaceC26009jOo interfaceC26009jOo, @NotNull InterfaceC26302jZk interfaceC26302jZk) {
        super(new C26305jZn());
        Intrinsics.checkNotNullParameter(holdersFragmentParams, "");
        Intrinsics.checkNotNullParameter(interfaceC26009jOo, "");
        Intrinsics.checkNotNullParameter(interfaceC26302jZk, "");
        this.AYXKKw = i;
        this.AhwBna = holdersFragmentParams;
        this.copydefault = bubbleMap;
        this.EZpvd = z;
        this.OLrzqt = interfaceC26009jOo;
        this.valueOf = interfaceC26302jZk;
        this.djBIcL = new Function0() { // from class: o.jYN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jYK.AYXKKw();
            }
        };
    }

    public static final class ActionBar {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AYXKKw() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/ViewGroup;)Lo/kLF; */
    @Override // o.kLM
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C26300jZi OLrzqt(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21550hDn c21550hDnEZpvd = C21550hDn.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21550hDnEZpvd, "");
        return new C26300jZi(c21550hDnEZpvd, this.AhwBna, this.copydefault, this.valueOf);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/ViewGroup;)Lo/kLN; */
    @Override // o.kLM
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public StateListAnimator copydefault(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCG hcgEZpvd = hCG.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hcgEZpvd, "");
        return new StateListAnimator(this, hcgEZpvd, this.OLrzqt);
    }

    @Override // o.kLM
    public RecyclerView.ViewHolder KWHzl(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        RecyclerView.ViewHolder viewHolderKWHzl = super.KWHzl(viewGroup);
        Intrinsics.copydefault(viewHolderKWHzl, "");
        kLA kla = (kLA) viewHolderKWHzl;
        KWHzl(kla.OLrzqt());
        return kla;
    }

    @Override // o.kLM, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        jYL.Activity activity;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        super.onBindViewHolder(viewHolder, i);
        if (!(viewHolder instanceof C26300jZi) || (activity = this.KWHzl) == null) {
            return;
        }
        C26300jZi c26300jZi = (C26300jZi) viewHolder;
        c26300jZi.copydefault(activity);
        c26300jZi.KWHzl(this.EZpvd);
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
        if (activity == null) {
            return;
        }
        if (!(viewHolder instanceof StateListAnimator) || !(!list.isEmpty())) {
            super.onBindViewHolder(viewHolder, i, list);
            return;
        }
        for (java.lang.Object obj : list) {
            if ((obj instanceof ActionBar) || Intrinsics.EZpvd(obj, C26305jZn.TaskDescription.EZpvd)) {
                ((StateListAnimator) viewHolder).EZpvd2((HolderDetailModel) activity.AEQbTJ());
            } else if (obj instanceof C26305jZn.ActionBar) {
                ((StateListAnimator) viewHolder).AEQbTJ((HolderDetailModel) activity.AEQbTJ());
            }
        }
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jYK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setFilterState$default(jYK jyk, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.jYR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jYK.OLrzqt();
                }
            };
        }
        jyk.copydefault(z, function0);
    }

    public final void OLrzqt(boolean z) {
        this.EZpvd = z;
        notifyItemChanged(0);
        notifyItemRangeChanged(1, getItemCount(), ActionBar.EZpvd);
    }

    private final void KWHzl(C21465hAj c21465hAj) {
        C55173xeu c55173xeu = c21465hAj.OLrzqt;
        if (this.AEQbTJ) {
            c55173xeu.setEmptyTypeImage(7);
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatApi21PlaybackInfo));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.sanrWj));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jYM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    jYK.KWHzl(this.OLrzqt, view);
                }
            });
            return;
        }
        c55173xeu.setTitle("");
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.ICustomTabsServiceDefault));
        c55173xeu.setEmptyTypeImage(6);
        c55173xeu.setRetry("");
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jYP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jYK.KWHzl(view);
            }
        });
    }

    public static final void KWHzl(jYK jyk, android.view.View view) {
        jyk.djBIcL.invoke();
    }

    public final void EZpvd(@NotNull jYL.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.KWHzl = activity;
        notifyItemChanged(0);
    }

    public final class StateListAnimator extends kLN<HolderDetailModel> {
        public final /* synthetic */ jYK AEQbTJ;
        public final hCG KWHzl;
        public final InterfaceC26009jOo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final java.lang.String OLrzqt(java.lang.String str) {
            return str == null ? "" : str;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StateListAnimator(@NotNull jYK jyk, @NotNull hCG hcg, InterfaceC26009jOo interfaceC26009jOo) {
            Intrinsics.checkNotNullParameter(hcg, "");
            Intrinsics.checkNotNullParameter(interfaceC26009jOo, "");
            this.AEQbTJ = jyk;
            ConstraintLayout root = hcg.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.KWHzl = hcg;
            this.copydefault = interfaceC26009jOo;
        }

        /* JADX INFO: renamed from: o.jYK$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0863StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ HolderDetailModel OLrzqt;
            public final /* synthetic */ jYK copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0863StateListAnimator(android.view.View view, long j, jYK jyk, HolderDetailModel holderDetailModel) {
                this.AEQbTJ = view;
                this.EZpvd = j;
                this.copydefault = jyk;
                this.OLrzqt = holderDetailModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.copydefault.valueOf.OLrzqt(this.OLrzqt);
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)V */
        @Override // o.kLN
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(@NotNull final HolderDetailModel holderDetailModel) {
            java.lang.String strValueOf;
            java.lang.String strKWHzl;
            Intrinsics.checkNotNullParameter(holderDetailModel, "");
            hCG hcg = this.KWHzl;
            final jYK jyk = this.AEQbTJ;
            int iFARcdN = holderDetailModel.fARcdN();
            android.widget.TextView textView = hcg.valueOf;
            if (holderDetailModel.getFieldNames() || iFARcdN > jyk.AYXKKw) {
                strValueOf = jyk.AYXKKw + Marker.ANY_NON_NULL_MARKER;
            } else {
                strValueOf = java.lang.String.valueOf(iFARcdN);
            }
            textView.setText(strValueOf);
            if (1 <= iFARcdN && iFARcdN < 4) {
                textView.setTextAppearance(C52761wXj.LoaderManager.sSMYrx);
                textView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QKudOq));
            } else {
                textView.setTextAppearance(C32113mPz.Dialog.getNewProxyInstance);
                textView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
            }
            textView.invalidate();
            android.widget.TextView textView2 = hcg.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            C25352ivB.KWHzl(textView2, C52761wXj.TaskDescription.GQzpsZsQwTVT, C55298xhM.dp2px$default(16.0f, null, 1, null), this.copydefault.EZpvd(holderDetailModel.valueOf()), java.lang.Integer.valueOf(C52761wXj.Activity.dvKsVJ));
            C28067kNr.setTags$default(hcg.AEQbTJ, holderDetailModel.ejfBZ(), false, false, null, null, 30, null);
            hcg.AEQbTJ.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.jYO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return jYK.StateListAnimator.copydefault(jyk, holderDetailModel, view);
                }
            });
            java.util.List<TagWrapper> listEjfBZ = holderDetailModel.ejfBZ();
            if ((listEjfBZ instanceof java.util.Collection) && listEjfBZ.isEmpty()) {
                hcg.getRoot().setBackground(null);
            } else {
                java.util.Iterator<T> it = listEjfBZ.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) it.next()).OLrzqt(), (java.lang.Object) "suspectedRatTradingAddress")) {
                        hcg.getRoot().setBackgroundColor(ColorUtils.setAlphaComponent(C25382ivf.KWHzl(C52761wXj.Activity.fHqPtx), 89));
                        break;
                    }
                }
                hcg.getRoot().setBackground(null);
            }
            final java.lang.String strAEQbTJ = C29694kyV.AEQbTJ.AEQbTJ(holderDetailModel.ejfBZ());
            if (holderDetailModel.getFieldNames()) {
                strKWHzl = C33070mpX.AYXKKw(C23274hvD.Fragment.ITrustedWebActivityCallbackStubProxy);
            } else {
                strKWHzl = C31256lqb.KWHzl(C31256lqb.KWHzl(jyk.OLrzqt.OLrzqt(holderDetailModel.valueOf()), (Function0<java.lang.String>) new Function0() { // from class: o.jYV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return jYK.StateListAnimator.OLrzqt(strAEQbTJ);
                    }
                }), (Function0<java.lang.String>) new Function0() { // from class: o.jYW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return jYK.StateListAnimator.copydefault(holderDetailModel);
                    }
                });
            }
            android.widget.TextView textView3 = hcg.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            C31258lqd.copydefault(textView3, strKWHzl, jyk.OLrzqt.AEQbTJ(holderDetailModel.valueOf()), C52761wXj.Activity.fdOvFl);
            AEQbTJ(holderDetailModel);
            EZpvd2(holderDetailModel);
            ConstraintLayout root = hcg.getRoot();
            root.setOnClickListener(new ViewOnClickListenerC0863StateListAnimator(root, 1000L, jyk, holderDetailModel));
        }

        public static final boolean copydefault(jYK jyk, HolderDetailModel holderDetailModel, android.view.View view) {
            jyk.valueOf.copydefault(holderDetailModel.ejfBZ());
            return true;
        }

        public static final java.lang.String copydefault(HolderDetailModel holderDetailModel) {
            return C25352ivB.formatAddress$default(holderDetailModel.valueOf(), 6, 4, null, 4, null);
        }

        public final void AEQbTJ(@NotNull HolderDetailModel holderDetailModel) {
            java.lang.String tokenCode$default;
            java.lang.String scientificCurrency$default;
            Intrinsics.checkNotNullParameter(holderDetailModel, "");
            hCG hcg = this.KWHzl;
            jYK jyk = this.AEQbTJ;
            android.widget.TextView textView = hcg.gEmmrt;
            if (jyk.AhwBna.AhwBna()) {
                tokenCode$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, holderDetailModel.gEmmrt(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
            } else {
                tokenCode$default = C23271hvA.formatTokenCode$default(C23271hvA.copydefault, holderDetailModel.copydefault(), true, null, false, null, null, 30, null);
            }
            textView.setText(tokenCode$default);
            android.widget.TextView textView2 = hcg.djBIcL;
            if (jyk.AhwBna.AhwBna()) {
                scientificCurrency$default = C23311hvo.formatPercentWithoutSymbol$default(holderDetailModel.AYXKKw(), false, 0, new BigDecimal(0.01d), true, null, 19, null);
            } else {
                scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, holderDetailModel.gEmmrt(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
            }
            textView2.setText(scientificCurrency$default);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public final void EZpvd2(@NotNull HolderDetailModel holderDetailModel) {
            java.lang.String scientificCurrency$default;
            Intrinsics.checkNotNullParameter(holderDetailModel, "");
            hCG hcg = this.KWHzl;
            jYK jyk = this.AEQbTJ;
            int iIntValue = C25351ivA.KWHzl.KWHzl(holderDetailModel.AuCTel()).component2().intValue();
            java.lang.String percentWithoutSymbol$default = "--";
            if (holderDetailModel.AuCTel().length() == 0) {
                scientificCurrency$default = "--";
            } else if (jyk.EZpvd) {
                float fDjBIcL = C33129mqd.djBIcL(holderDetailModel.AuCTel());
                jNY jny = jyk.gEmmrt;
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Float.valueOf(fDjBIcL / (jny != null ? jny.copydefault() : 1.0f)));
                C23271hvA c23271hvA = C23271hvA.copydefault;
                DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
                jNY jny2 = jyk.gEmmrt;
                java.lang.String strAEQbTJ = jny2 != null ? jny2.AEQbTJ() : null;
                scientificCurrency$default = C23271hvA.formatTokenCode$default(c23271hvA, strGEmmrt, true, null, false, strAEQbTJ == null ? "" : strAEQbTJ, displaySign, 6, null);
            } else {
                scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, holderDetailModel.AuCTel(), true, RoundingMode.DOWN, false, false, false, false, DisplaySign.EXCEPT_ZERO, false, false, 444, null);
            }
            android.widget.TextView textView = hcg.AYXKKw;
            if (jyk.AhwBna.AhwBna()) {
                if (!holderDetailModel.getFieldNames()) {
                    percentWithoutSymbol$default = scientificCurrency$default;
                }
            } else {
                percentWithoutSymbol$default = C23311hvo.formatPercentWithoutSymbol$default(holderDetailModel.AYXKKw(), false, 0, new BigDecimal("0.01"), true, null, 19, null);
            }
            textView.setText(percentWithoutSymbol$default);
            android.widget.TextView textView2 = hcg.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            C31258lqd.setTextColorOrDisabledColor$default(textView2, iIntValue, 0, 2, null);
            android.widget.TextView textView3 = hcg.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility((jyk.AhwBna.AhwBna() && C33129mqd.OLrzqt((java.lang.CharSequence) holderDetailModel.fJNWhG())) ? 0 : 8);
            android.widget.TextView textView4 = hcg.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            kLY.formatPercentage$default(textView4, holderDetailModel.fJNWhG(), DisplaySign.EXCEPT_ZERO, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 16, null);
            android.widget.TextView textView5 = hcg.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            C31258lqd.setTextColorOrDisabledColor$default(textView5, C52761wXj.Activity.QwvEab, 0, 2, null);
        }
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        this.KWHzl = null;
        this.djBIcL = new Function0() { // from class: o.jYQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jYK.EZpvd();
            }
        };
    }
}
