package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C22366hdx;
import o.C52761wXj;
import o.kBK;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes23.dex */
public final class kBJ implements OnChartValueSelectedListener {
    public final android.view.ViewGroup AEQbTJ;
    public final CombinedChart EZpvd;
    public final android.content.Context KWHzl;
    public final java.util.Map<java.lang.Float, kBK.ActionBar> copydefault;

    public kBJ(@NotNull CombinedChart combinedChart, @NotNull java.util.Map<java.lang.Float, kBK.ActionBar> map, @NotNull android.view.ViewGroup viewGroup, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(combinedChart, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = combinedChart;
        this.copydefault = map;
        this.AEQbTJ = viewGroup;
        this.KWHzl = context;
    }

    @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
    public void onValueSelected(Entry entry, Highlight highlight) {
        kBK.ActionBar actionBar;
        if (entry == null || highlight == null || (actionBar = this.copydefault.get(java.lang.Float.valueOf(entry.getX()))) == null) {
            return;
        }
        AEQbTJ(highlight.getX(), highlight.getY());
        KWHzl(entry.getX());
        KWHzl(actionBar);
        this.AEQbTJ.setVisibility(0);
        this.AEQbTJ.bringToFront();
    }

    @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
    public void onNothingSelected() {
        copydefault();
        this.AEQbTJ.setVisibility(8);
    }

    public final void KWHzl(float f) {
        float axisMaximum = (this.EZpvd.getXAxis().getAxisMaximum() + this.EZpvd.getXAxis().getAxisMinimum()) / 2;
        int iDp2px$default = C55298xhM.dp2px$default(20.0f, null, 1, null);
        int iDp2px$default2 = C55298xhM.dp2px$default(16.0f, null, 1, null);
        android.view.ViewParent parent = this.AEQbTJ.getParent();
        ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
        if (constraintLayout == null) {
            return;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.clear(this.AEQbTJ.getId(), 6);
        constraintSet.clear(this.AEQbTJ.getId(), 7);
        constraintSet.setMargin(this.AEQbTJ.getId(), 3, iDp2px$default);
        if (f > axisMaximum) {
            constraintSet.connect(this.AEQbTJ.getId(), 7, C22366hdx.ActionBar.OcIXYQ, 6, iDp2px$default2);
        } else {
            constraintSet.connect(this.AEQbTJ.getId(), 6, C22366hdx.ActionBar.OcIXYQ, 7, iDp2px$default2);
        }
        constraintSet.applyTo(constraintLayout);
    }

    public final void AEQbTJ(float f, float f2) {
        copydefault();
        LimitLine limitLine = new LimitLine(f);
        limitLine.setLineColor(C25382ivf.KWHzl(C52761wXj.Activity.ORxRYg));
        limitLine.setLineWidth(0.5f);
        limitLine.enableDashedLine(10.0f, 10.0f, 0.0f);
        this.EZpvd.getXAxis().addLimitLine(limitLine);
        LimitLine limitLine2 = new LimitLine(f2);
        limitLine2.setLineColor(C25382ivf.KWHzl(C52761wXj.Activity.ORxRYg));
        limitLine2.setLineWidth(0.5f);
        limitLine2.enableDashedLine(10.0f, 10.0f, 0.0f);
        this.EZpvd.getAxisRight().addLimitLine(limitLine2);
        this.EZpvd.invalidate();
    }

    public final void copydefault() {
        this.EZpvd.getXAxis().removeAllLimitLines();
        this.EZpvd.getAxisRight().removeAllLimitLines();
        this.EZpvd.getAxisLeft().removeAllLimitLines();
        this.EZpvd.invalidate();
    }

    public final void KWHzl(kBK.ActionBar actionBar) {
        android.widget.TextView textView = (android.widget.TextView) this.AEQbTJ.findViewById(C22366hdx.ActionBar.vLaW);
        if (textView != null) {
            textView.setText(actionBar.KWHzl());
        }
        android.widget.TextView textView2 = (android.widget.TextView) this.AEQbTJ.findViewById(C22366hdx.ActionBar.gmHjFq);
        if (textView2 != null) {
            textView2.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, C33129mqd.gEmmrt(actionBar.EZpvd()), false, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null));
        }
        android.widget.TextView textView3 = (android.widget.TextView) this.AEQbTJ.findViewById(C22366hdx.ActionBar.UscePu);
        if (textView3 != null) {
            textView3.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, C33129mqd.gEmmrt(actionBar.OLrzqt()), true, RoundingMode.DOWN, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null));
        }
        android.widget.TextView textView4 = (android.widget.TextView) this.AEQbTJ.findViewById(C22366hdx.ActionBar.iPSTqm);
        if (textView4 != null) {
            textView4.setText(actionBar.copydefault());
        }
        KWHzl(actionBar.AEQbTJ());
    }

    public final void KWHzl(java.util.List<kAU> list) {
        java.lang.String strKWHzl;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.AEQbTJ.findViewById(C22366hdx.ActionBar.hUfVAv);
        if (list.isEmpty()) {
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            }
            return;
        }
        int iAEQbTJ = ((kAU) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).AEQbTJ();
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (C33129mqd.OLrzqt(java.lang.Integer.valueOf(iAEQbTJ), "1")) {
            strKWHzl = C33070mpX.AYXKKw(C22366hdx.StateListAnimator.gGvvIC);
        } else {
            strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C22366hdx.StateListAnimator.fvQaOB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iAEQbTJ))));
        }
        android.widget.TextView textView = (android.widget.TextView) this.AEQbTJ.findViewById(C22366hdx.ActionBar.DGOPHZDGOPHZ);
        if (textView != null) {
            textView.setText(strKWHzl);
        }
        OLrzqt(list);
    }

    public final void OLrzqt(java.util.List<kAU> list) {
        java.lang.String strJoinToString$default;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.AEQbTJ.findViewById(C22366hdx.ActionBar.iRxXKY);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.AEQbTJ.findViewById(C22366hdx.ActionBar.gkJEwt);
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) this.AEQbTJ.findViewById(C22366hdx.ActionBar.iZzfmt);
        Intrinsics.copydefault(viewGroup);
        viewGroup.setVisibility(list.size() > 2 ? 0 : 8);
        Intrinsics.copydefault(viewGroup2);
        viewGroup2.setVisibility(list.size() == 2 ? 0 : 8);
        Intrinsics.copydefault(viewGroup3);
        viewGroup3.setVisibility((list.size() == 1 || list.size() == 2) ? 0 : 8);
        if (list.size() > 2) {
            int iAEQbTJ = ((kAU) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).AEQbTJ();
            if (iAEQbTJ > 3) {
                strJoinToString$default = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C22366hdx.StateListAnimator.dvKsVJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("name1", ((kAU) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).copydefault()), C56390yDp.OLrzqt("name2", list.get(1).copydefault()), C56390yDp.OLrzqt("name3", list.get(2).copydefault()), C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iAEQbTJ - 3))));
            } else {
                strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 3), ", ", null, null, 0, null, new Function1() { // from class: o.kBI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return kBJ.OLrzqt((kAU) obj);
                    }
                }, 30, null);
            }
            android.view.View viewCopydefault = null;
            if (iAEQbTJ > 3) {
                viewCopydefault = kBL.copydefault(this.KWHzl, Marker.ANY_NON_NULL_MARKER + (iAEQbTJ - 3), true, C55298xhM.dp2px$default(16.0f, null, 1, null), false);
            }
            android.view.View view = viewCopydefault;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewGroup.findViewById(C22366hdx.ActionBar.dxcTrN);
            if (frameLayout != null) {
                java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 3);
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
                java.util.Iterator it = listAhwBna.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kAU) it.next()).EZpvd());
                }
                kLW.copydefault(frameLayout, arrayList, new C25385ivi(C33070mpX.KWHzl(C22366hdx.Application.KWHzl), null, 1.0f, C25382ivf.KWHzl(C52761wXj.Activity.invokespecialaKhcqp), 2, null), 16.0f, 10.0f, view);
            }
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(C22366hdx.ActionBar.QIZEnU);
            if (textView != null) {
                textView.setText(strJoinToString$default);
                return;
            }
            return;
        }
        if (list.size() == 2) {
            copydefault((kAU) CollectionsKt___CollectionsKt.AuCTelauCTel(list));
            kAU kau = list.get(1);
            android.widget.ImageView imageView = (android.widget.ImageView) this.AEQbTJ.findViewById(C22366hdx.ActionBar.RcXXUw);
            if (imageView != null) {
                C25386ivj.KWHzl(imageView, kau.EZpvd(), new C25385ivi(C33070mpX.KWHzl(C22366hdx.Application.KWHzl), null, 1.0f, C25382ivf.KWHzl(C52761wXj.Activity.QKudOq), 2, null));
            }
            android.widget.TextView textView2 = (android.widget.TextView) this.AEQbTJ.findViewById(C22366hdx.ActionBar.RVsVBY);
            if (textView2 != null) {
                textView2.setText(kau.copydefault());
            }
            android.widget.TextView textView3 = (android.widget.TextView) this.AEQbTJ.findViewById(C22366hdx.ActionBar.DNMMPQ);
            if (textView3 != null) {
                textView3.setText("@" + kau.KWHzl());
                return;
            }
            return;
        }
        if (list.size() == 1) {
            copydefault((kAU) CollectionsKt___CollectionsKt.AuCTelauCTel(list));
            return;
        }
        android.view.View viewFindViewById = this.AEQbTJ.findViewById(C22366hdx.ActionBar.hUfVAv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        viewFindViewById.setVisibility(8);
    }

    public static final java.lang.CharSequence OLrzqt(kAU kau) {
        Intrinsics.checkNotNullParameter(kau, "");
        return kau.copydefault();
    }

    public final void copydefault(kAU kau) {
        android.widget.ImageView imageView = (android.widget.ImageView) this.AEQbTJ.findViewById(C22366hdx.ActionBar.aKErDB);
        if (imageView != null) {
            C25386ivj.KWHzl(imageView, kau.EZpvd(), new C25385ivi(C33070mpX.KWHzl(C22366hdx.Application.KWHzl), null, 1.0f, C25382ivf.KWHzl(C52761wXj.Activity.QKudOq), 2, null));
        }
        android.widget.TextView textView = (android.widget.TextView) this.AEQbTJ.findViewById(C22366hdx.ActionBar.RKcVTr);
        if (textView != null) {
            textView.setText(kau.copydefault());
        }
        android.widget.TextView textView2 = (android.widget.TextView) this.AEQbTJ.findViewById(C22366hdx.ActionBar.DsrFlB);
        if (textView2 != null) {
            textView2.setText("@" + kau.KWHzl());
        }
    }
}
