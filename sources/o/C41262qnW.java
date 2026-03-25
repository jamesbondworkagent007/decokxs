package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qnW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41262qnW extends AbstractC40515qYs<StateListAnimator, C42807rdQ> {
    public final Function1<ChargeGroupVo, Unit> AEQbTJ;
    public ChargeGroupVo EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.market.quotation.ui.model.ChargeGroupVo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41262qnW(@NotNull java.util.List<ChargeGroupVo> list, @NotNull ChargeGroupVo chargeGroupVo, @NotNull Function1<? super ChargeGroupVo, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = chargeGroupVo;
        this.AEQbTJ = function1;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (ChargeGroupVo chargeGroupVo2 : list) {
            arrayList.add(new StateListAnimator(chargeGroupVo2, Intrinsics.EZpvd(this.EZpvd, chargeGroupVo2)));
        }
        submitList(arrayList);
    }

    /* JADX INFO: renamed from: o.qnW$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC40516qYt {
        public static final int EZpvd = ChargeGroupVo.EZpvd;
        public final boolean KWHzl;
        public final ChargeGroupVo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, ChargeGroupVo chargeGroupVo, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                chargeGroupVo = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.KWHzl;
            }
            return stateListAnimator.AEQbTJ(chargeGroupVo, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull ChargeGroupVo chargeGroupVo, boolean z) {
            Intrinsics.checkNotNullParameter(chargeGroupVo, "");
            return new StateListAnimator(chargeGroupVo, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChargeGroupVo KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && this.KWHzl == stateListAnimator.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SelectableChargeGroupVo(vo=" + this.copydefault + ", isSelected=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull ChargeGroupVo chargeGroupVo, boolean z) {
            Intrinsics.checkNotNullParameter(chargeGroupVo, "");
            this.copydefault = chargeGroupVo;
            this.KWHzl = z;
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof StateListAnimator) && Intrinsics.EZpvd(this.copydefault, ((StateListAnimator) interfaceC40516qYt).copydefault);
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return Intrinsics.EZpvd(this, interfaceC40516qYt);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42807rdQ AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42807rdQ c42807rdQAEQbTJ = C42807rdQ.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42807rdQAEQbTJ, "");
        return c42807rdQAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C42807rdQ c42807rdQ, int i, @NotNull final StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(c42807rdQ, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        if (Intrinsics.EZpvd(stateListAnimator.KWHzl(), ChargeGroupVo.Companion.KWHzl())) {
            c42807rdQ.KWHzl.setText(qZH.PendingIntent.profile);
        } else if (Intrinsics.EZpvd((java.lang.Object) stateListAnimator.KWHzl().OLrzqt().getId(), (java.lang.Object) "10")) {
            c42807rdQ.KWHzl.setText(qZH.PendingIntent.processStrongAuthMessage);
        } else {
            java.lang.String displayName = stateListAnimator.KWHzl().OLrzqt().getDisplayName();
            if (displayName == null || displayName.length() == 0) {
                AppCompatTextView appCompatTextView = c42807rdQ.KWHzl;
                android.content.Context context = c42807rdQ.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                appCompatTextView.setText(C33069mpW.KWHzl(context, qZH.PendingIntent.hlXVux, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", stateListAnimator.KWHzl().OLrzqt().getName()))));
            } else {
                AppCompatTextView appCompatTextView2 = c42807rdQ.KWHzl;
                android.content.Context context2 = c42807rdQ.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                appCompatTextView2.setText(C33069mpW.KWHzl(context2, qZH.PendingIntent.hlXVux, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", stateListAnimator.KWHzl().OLrzqt().getDisplayName()))));
            }
        }
        android.widget.ImageView imageView = c42807rdQ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(stateListAnimator.AEQbTJ() ? 0 : 8);
        c42807rdQ.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.qnY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C41262qnW.KWHzl(this.OLrzqt, stateListAnimator, view);
            }
        });
    }

    public static final void KWHzl(C41262qnW c41262qnW, StateListAnimator stateListAnimator, android.view.View view) {
        ChargeGroupVo chargeGroupVoKWHzl = stateListAnimator.KWHzl();
        c41262qnW.EZpvd = chargeGroupVoKWHzl;
        c41262qnW.AEQbTJ.invoke(chargeGroupVoKWHzl);
    }
}
