package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hWZ extends ConstraintLayout {
    public final hGM copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hWZ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hWZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.hWZ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hWZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hWZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        hGM hgmAEQbTJ = hGM.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hgmAEQbTJ, "");
        this.copydefault = hgmAEQbTJ;
    }

    public final void setOnTitleTipClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        AppCompatTextView appCompatTextView = this.copydefault.EZpvd;
        appCompatTextView.setOnClickListener(new Application(appCompatTextView, 1000L, function0));
    }

    public final void setTipsInfoVisible(int i) {
        if (i == 8) {
            this.copydefault.EZpvd.setCompoundDrawablesRelative(null, null, null, null);
            this.copydefault.EZpvd.setOnClickListener(null);
            return;
        }
        if (i == 0) {
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.GGlJim);
            if (drawable != null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iOLrzqt = C55298xhM.OLrzqt(16, context);
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(16, context2));
            } else {
                drawable = null;
            }
            this.copydefault.EZpvd.setCompoundDrawablesRelative(null, null, drawable, null);
        }
    }

    public final void AEQbTJ(@NotNull final OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        final java.lang.String swapTradeType = orderDetailBean.getSwapTradeType();
        this.copydefault.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.hXg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                hWZ.KWHzl(swapTradeType, this, orderDetailBean, view);
            }
        });
    }

    public static final void KWHzl(java.lang.String str, hWZ hwz, OrderDetailBean orderDetailBean, android.view.View view) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "4") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "5")) {
            return;
        }
        view.setTag(java.lang.String.valueOf(!Intrinsics.EZpvd(view.getTag(), (java.lang.Object) "true")));
        hwz.copydefault.AEQbTJ.setText(C22689hkB.EZpvd.KWHzl(orderDetailBean, Intrinsics.EZpvd(hwz.copydefault.AEQbTJ.getTag(), (java.lang.Object) "false")));
    }

    public final void copydefault(@NotNull final OrderDetailResult orderDetailResult, final boolean z) {
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        this.copydefault.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.hXi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                hWZ.AEQbTJ(z, orderDetailResult, this, view);
            }
        });
    }

    public static final void AEQbTJ(boolean z, OrderDetailResult orderDetailResult, hWZ hwz, android.view.View view) {
        java.lang.String strEZpvd;
        if (z) {
            if (C22689hkB.EZpvd.EZpvd(orderDetailResult.getTriggerInfo().getTriggerRate())) {
                return;
            }
        } else if (C22689hkB.EZpvd.EZpvd(orderDetailResult.getTransactionInfo().getTransactionRate())) {
            return;
        }
        view.setTag(java.lang.String.valueOf(!Intrinsics.EZpvd(view.getTag(), (java.lang.Object) "true")));
        boolean zEZpvd = Intrinsics.EZpvd(hwz.copydefault.AEQbTJ.getTag(), (java.lang.Object) "false");
        AppCompatTextView appCompatTextView = hwz.copydefault.AEQbTJ;
        if (z) {
            strEZpvd = C22481hgF.copydefault.AEQbTJ(orderDetailResult, zEZpvd);
        } else {
            strEZpvd = C22481hgF.copydefault.EZpvd(orderDetailResult, zEZpvd);
        }
        appCompatTextView.setText(strEZpvd);
    }

    public final void setRadioInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.AEQbTJ.setText(str);
    }

    public final void setRateTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.EZpvd.setText(str);
    }

    public final void copydefault(boolean z) {
        AppCompatImageView appCompatImageView = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
    }

    public final void setRadioTag(boolean z) {
        this.copydefault.AEQbTJ.setTag(java.lang.Boolean.valueOf(z));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }
}
