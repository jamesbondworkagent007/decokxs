package o;

import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.planet.biz_positions.data.ClosePositionType;
import com.okinc.planet.biz_userprofile.data.PlanetTradeTypes;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tUA extends ConstraintLayout {
    public final android.widget.TextView AEQbTJ;
    public final android.view.View EZpvd;
    public ClosePositionType KWHzl;
    public final wYC OLrzqt;
    public PlanetTradeTypes copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUA(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.tUA.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tUA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tUA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.TextView textView = new android.widget.TextView(context);
        this.AEQbTJ = textView;
        this.copydefault = PlanetTradeTypes.Swap;
        textView.setId(android.view.View.generateViewId());
        addView(textView, new ConstraintLayout.LayoutParams(0, -2));
        textView.setTextAppearance(C32113mPz.Dialog.fIwbmz);
        textView.setTextColor(C33070mpX.OLrzqt(C52761wXj.Activity.aappFQ, context));
        textView.setMaxLines(1);
        textView.setTextAlignment(6);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        android.view.View view = new android.view.View(context);
        this.EZpvd = view;
        view.setId(android.view.View.generateViewId());
        addView(view);
        view.setLayoutParams(new ConstraintLayout.LayoutParams(C55298xhM.copydefault(0.5f, context), C55298xhM.copydefault(10.0f, context)));
        view.setBackgroundColor(C33070mpX.OLrzqt(C52761wXj.Activity.fZc, context));
        view.setVisibility(8);
        wYC wyc = new wYC(context, null, 0, 6, null);
        this.OLrzqt = wyc;
        wyc.setId(android.view.View.generateViewId());
        addView(wyc);
        wyc.setLayoutParams(new ConstraintLayout.LayoutParams(C55298xhM.copydefault(20.0f, context), C55298xhM.copydefault(20.0f, context)));
        wyc.setImageResource(C52761wXj.TaskDescription.zEkrwr);
        wyc.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.OLrzqt(C52761wXj.Activity.fdOvFl, context)));
        Flow flow = new Flow(context);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.topToTop = 0;
        layoutParams.endToEnd = 0;
        layoutParams.startToStart = 0;
        layoutParams.bottomToBottom = 0;
        Unit unit = Unit.INSTANCE;
        addView(flow, layoutParams);
        flow.setOrientation(0);
        flow.setReferencedIds(new int[]{textView.getId(), view.getId(), wyc.getId()});
        flow.setHorizontalGap(C55298xhM.copydefault(12.0f, context));
        flow.setHorizontalBias(1.0f);
        flow.setHorizontalAlign(1);
        flow.setVerticalAlign(2);
        setLabel();
    }

    public final void setLabel(@NotNull PlanetTradeTypes planetTradeTypes, ClosePositionType closePositionType) {
        Intrinsics.checkNotNullParameter(planetTradeTypes, "");
        this.copydefault = planetTradeTypes;
        this.KWHzl = closePositionType;
        setLabel();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.OLrzqt.setOnClickListener(onClickListener);
    }

    public final void setLabel() {
        this.EZpvd.setVisibility(this.KWHzl == null ? 8 : 0);
        this.AEQbTJ.setVisibility(this.KWHzl != null ? 0 : 8);
        android.widget.TextView textView = this.AEQbTJ;
        ClosePositionType closePositionType = this.KWHzl;
        textView.setText(closePositionType != null ? C33070mpX.OLrzqt(C46064tGm.copydefault(closePositionType, this.copydefault), getContext()) : null);
    }
}
