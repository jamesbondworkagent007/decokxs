package o;

import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tVe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46461tVe {
    public static /* synthetic */ OKRegularCell normalCellWithAddOn$default(android.content.Context context, InterfaceC46125tIt interfaceC46125tIt, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC46125tIt = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        return AEQbTJ(context, interfaceC46125tIt, z, function0);
    }

    public static final OKRegularCell AEQbTJ(@NotNull android.content.Context context, InterfaceC46125tIt interfaceC46125tIt, boolean z, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        OKRegularCell oKRegularCellOLrzqt = OLrzqt(context, interfaceC46125tIt);
        C55068xcv c55068xcv = new C55068xcv(context, null, 0, 6, null);
        c55068xcv.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -2));
        c55068xcv.setText(interfaceC46125tIt != null ? interfaceC46125tIt.AEQbTJ() : null);
        c55068xcv.setTextAlignment(6);
        if (z) {
            c55068xcv.setIcon(C33070mpX.EZpvd(C52761wXj.TaskDescription.heceqZ, context));
            c55068xcv.setCompoundDrawablePadding(C55298xhM.copydefault(8.0f, context));
        } else {
            c55068xcv.setIcon(null);
            c55068xcv.setPaddingRelative(c55068xcv.getPaddingStart(), c55068xcv.getPaddingTop(), C55298xhM.copydefault(4.0f, context), c55068xcv.getPaddingBottom());
        }
        c55068xcv.setTextAppearance(C52761wXj.LoaderManager.RdAHlO);
        c55068xcv.setTextColor(C33070mpX.OLrzqt(C52761wXj.Activity.QwvEab, context));
        oKRegularCellOLrzqt.addView(c55068xcv);
        if (function0 != null) {
            oKRegularCellOLrzqt.setOnClickListener(new StateListAnimator(oKRegularCellOLrzqt, 300L, oKRegularCellOLrzqt, function0));
        }
        return oKRegularCellOLrzqt;
    }

    public static /* synthetic */ OKRegularCell normalCellWithToggle$default(android.content.Context context, tIC tic, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            tic = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        return AEQbTJ(context, tic, function1);
    }

    public static final OKRegularCell AEQbTJ(@NotNull android.content.Context context, tIC tic, final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        OKRegularCell oKRegularCellOLrzqt = OLrzqt(context, tic);
        C55239xgG c55239xgG = new C55239xgG(context, null, 0, 6, null);
        c55239xgG.setOKDSSize(-3);
        c55239xgG.setChecked(tic != null ? tic.KWHzl() : false);
        c55239xgG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.tVk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C46461tVe.OLrzqt(function1, compoundButton, z);
            }
        });
        oKRegularCellOLrzqt.addView(c55239xgG);
        return oKRegularCellOLrzqt;
    }

    public static final void OLrzqt(Function1 function1, android.widget.CompoundButton compoundButton, boolean z) {
        if (function1 != null) {
        }
    }

    public static /* synthetic */ OKRegularCell basicCell$default(android.content.Context context, InterfaceC46125tIt interfaceC46125tIt, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC46125tIt = null;
        }
        return OLrzqt(context, interfaceC46125tIt);
    }

    public static final OKRegularCell OLrzqt(@NotNull android.content.Context context, InterfaceC46125tIt interfaceC46125tIt) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(context, "");
        OKRegularCell oKRegularCell = new OKRegularCell(context, null, 0, 6, null);
        AEQbTJ(oKRegularCell);
        if (interfaceC46125tIt != null) {
            oKRegularCell.setTitle(C33070mpX.AYXKKw(interfaceC46125tIt.copydefault()));
            java.lang.Integer numEZpvd = interfaceC46125tIt.EZpvd();
            if (numEZpvd != null && (strAYXKKw = C33070mpX.AYXKKw(numEZpvd.intValue())) != null) {
                oKRegularCell.setDescription(strAYXKKw);
            }
        }
        return oKRegularCell;
    }

    public static final void AEQbTJ(android.view.View view) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        android.graphics.drawable.Drawable background = view.getBackground();
        StateListDrawable stateListDrawable = background instanceof StateListDrawable ? (StateListDrawable) background : null;
        if (stateListDrawable != null) {
            StateListDrawable stateListDrawable2 = new StateListDrawable();
            int stateCount = stateListDrawable.getStateCount();
            for (int i = 0; i < stateCount; i++) {
                int[] stateSet = stateListDrawable.getStateSet(i);
                Intrinsics.checkNotNullExpressionValue(stateSet, "");
                if (!yDV.AYXKKw(stateSet, android.R.attr.state_pressed)) {
                    stateListDrawable2.addState(stateSet, stateListDrawable.getStateDrawable(i));
                }
            }
            ViewCompat.setBackground(view, stateListDrawable2);
        }
    }

    /* JADX INFO: renamed from: o.tVe$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, android.view.View view2, Function0 function0) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = view2;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.invoke();
            }
        }
    }
}
