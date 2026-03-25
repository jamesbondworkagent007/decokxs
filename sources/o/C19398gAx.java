package o;

import android.view.View;
import com.okinc.localization.util.format.DisplaySign;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gAx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19398gAx extends AbstractC43310rmq<C19419gBr, AbstractC16683eoZ> {
    public Function0<Unit> AEQbTJ;
    public final Function2<C19419gBr, java.lang.Integer, Unit> KWHzl;
    public Function0<Unit> OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C19398gAx() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C13754dXa.TaskDescription.DcMfJKOmnske;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return dTV.isConnected;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r1v0 kotlin.jvm.functions.Function2))
 A[MD:(kotlin.jvm.functions.Function2<? super o.gBr, ? super java.lang.Integer, kotlin.Unit>):void (m)] (LINE:19) call: o.gAx.<init>(kotlin.jvm.functions.Function2):void type: THIS */
    public /* synthetic */ C19398gAx(Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super o.gBr, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19398gAx(Function2<? super C19419gBr, ? super java.lang.Integer, Unit> function2) {
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    public C43312rms<AbstractC16683eoZ> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        final C43312rms<AbstractC16683eoZ> c43312rmsOnCreateViewHolder = super.onCreateViewHolder(layoutInflater, viewGroup);
        Intrinsics.checkNotNullExpressionValue(c43312rmsOnCreateViewHolder, "");
        ((AbstractC16683eoZ) c43312rmsOnCreateViewHolder.OLrzqt()).isConnected.setOnClickListener(new View.OnClickListener() { // from class: o.gAB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C19398gAx.OLrzqt(this.AEQbTJ, c43312rmsOnCreateViewHolder, view);
            }
        });
        return c43312rmsOnCreateViewHolder;
    }

    public static final void OLrzqt(C19398gAx c19398gAx, C43312rms c43312rms, android.view.View view) {
        C19419gBr c19419gBrKWHzl;
        Function2<C19419gBr, java.lang.Integer, Unit> function2 = c19398gAx.KWHzl;
        if (function2 == null || (c19419gBrKWHzl = c19398gAx.KWHzl(c43312rms.getLayoutPosition())) == null) {
            return;
        }
        function2.invoke(c19419gBrKWHzl, java.lang.Integer.valueOf(c43312rms.getLayoutPosition()));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC16683eoZ> c43312rms, @NotNull C19419gBr c19419gBr) {
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        java.lang.String strOLrzqt3;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c19419gBr, "");
        super.onBindViewHolder((C43312rms) c43312rms, c19419gBr);
        android.widget.ImageView imageView = ((AbstractC16683eoZ) c43312rms.OLrzqt()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        java.lang.String strGEmmrt = c19419gBr.gEmmrt();
        int i = C52761wXj.TaskDescription.aHXSQp;
        C33054mpH.KWHzl(imageView, strGEmmrt, i, i);
        ((AbstractC16683eoZ) c43312rms.OLrzqt()).gEmmrt.setText(c19419gBr.isConnected());
        android.widget.TextView textView = ((AbstractC16683eoZ) c43312rms.OLrzqt()).AYXKKw;
        if (this.copydefault) {
            strOLrzqt = C54873xYm.formatPriceChangePercentage$default(pTB.AEQbTJ(c19419gBr.fetchVPNInfo()), 0, 0, true, DisplaySign.AUTO, null, 19, null);
        } else {
            strOLrzqt = C13821dZn.EZpvd.OLrzqt(C54873xYm.formatPriceChangePercentage$default(pTB.AEQbTJ(c19419gBr.fetchVPNInfo()), 0, 0, true, DisplaySign.AUTO, null, 19, null));
        }
        textView.setText(strOLrzqt);
        C52794wYp c52794wYp = ((AbstractC16683eoZ) c43312rms.OLrzqt()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(c19419gBr.AkhnZx() ? 0 : 8);
        android.widget.TextView textView2 = ((AbstractC16683eoZ) c43312rms.OLrzqt()).valueOf;
        if (this.copydefault) {
            strOLrzqt2 = c19419gBr.values();
        } else {
            strOLrzqt2 = C13821dZn.EZpvd.OLrzqt(c19419gBr.values());
        }
        textView2.setText(strOLrzqt2);
        android.widget.TextView textView3 = ((AbstractC16683eoZ) c43312rms.OLrzqt()).valueOf;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(c19419gBr.AkhnZx() ? 4 : 0);
        android.widget.TextView textView4 = ((AbstractC16683eoZ) c43312rms.OLrzqt()).AhwBna;
        if (this.copydefault) {
            strOLrzqt3 = c19419gBr.DbNXlk();
        } else {
            strOLrzqt3 = C13821dZn.EZpvd.OLrzqt(c19419gBr.DbNXlk());
        }
        textView4.setText(strOLrzqt3);
        C55251xgS c55251xgS = ((AbstractC16683eoZ) c43312rms.OLrzqt()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(c19419gBr.valueOf() ? 0 : 8);
        C55251xgS c55251xgS2 = ((AbstractC16683eoZ) c43312rms.OLrzqt()).copydefault;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        c55251xgS2.setVisibility(c19419gBr.AhwBna() ? 0 : 8);
        android.widget.TextView textView5 = ((AbstractC16683eoZ) c43312rms.OLrzqt()).AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(c19419gBr.AkhnZx() ? 4 : 0);
        android.widget.ImageView imageView2 = ((AbstractC16683eoZ) c43312rms.OLrzqt()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(c19419gBr.AkhnZx() ? 4 : 0);
        ((AbstractC16683eoZ) c43312rms.OLrzqt()).OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.gAA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C19398gAx.EZpvd(this.copydefault, view);
            }
        });
    }

    public static final void EZpvd(C19398gAx c19398gAx, android.view.View view) {
        Function0<Unit> function0 = c19398gAx.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final C19419gBr KWHzl(int i) {
        C59534zip adapter = getAdapter();
        Intrinsics.copydefault(adapter, "");
        java.lang.Object objAEQbTJ = ((C43316rmw) adapter).AEQbTJ(i);
        if (objAEQbTJ instanceof C19419gBr) {
            return (C19419gBr) objAEQbTJ;
        }
        return null;
    }
}
