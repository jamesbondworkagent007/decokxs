package o;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.renderer.CombinedChartRenderer;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.alz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7555alz extends CombinedChart {
    public boolean AEQbTJ;
    public boolean AYXKKw;
    public final InterfaceC56387yDm<C7509alF> AhwBna;
    public boolean EZpvd;
    public boolean KWHzl;
    public float OLrzqt;
    public float copydefault;
    public boolean djBIcL;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisableParentActionWhenTouching(boolean z, boolean z2) {
        if (z && z2) {
            this.EZpvd = true;
            this.AEQbTJ = false;
            this.KWHzl = false;
        } else {
            this.EZpvd = false;
            this.AEQbTJ = z;
            this.KWHzl = z2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUseLuaBarChartRenderer(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUseLuaLineChartRenderer(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7555alz(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.alH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C7555alz.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final C7509alF AEQbTJ(C7555alz c7555alz) {
        ChartAnimator chartAnimator = c7555alz.mAnimator;
        Intrinsics.checkNotNullExpressionValue(chartAnimator, "");
        ViewPortHandler viewPortHandler = c7555alz.mViewPortHandler;
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        return new C7509alF(c7555alz, chartAnimator, viewPortHandler);
    }

    /* JADX DEBUG: Method merged with bridge method: setData(Lcom/github/mikephil/charting/data/ChartData;)V */
    @Override // com.github.mikephil.charting.charts.CombinedChart, com.github.mikephil.charting.charts.Chart
    public void setData(CombinedData combinedData) {
        super.setData(combinedData);
        if (this.valueOf) {
            copydefault();
        }
        if (this.AYXKKw) {
            OLrzqt();
        }
    }

    public final void copydefault() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof CombinedChartRenderer) {
            Intrinsics.copydefault(dataRenderer, "");
            CombinedChartRenderer combinedChartRenderer = (CombinedChartRenderer) dataRenderer;
            java.util.List<DataRenderer> subRenderers = combinedChartRenderer.getSubRenderers();
            Intrinsics.checkNotNullExpressionValue(subRenderers, "");
            DataRenderer dataRenderer2 = null;
            for (DataRenderer dataRenderer3 : subRenderers) {
                if (dataRenderer3 instanceof BarChartRenderer) {
                    dataRenderer2 = dataRenderer3;
                }
            }
            if (((BarChartRenderer) dataRenderer2) != null) {
                combinedChartRenderer.getSubRenderers().remove(dataRenderer2);
                java.util.List<DataRenderer> subRenderers2 = combinedChartRenderer.getSubRenderers();
                ChartAnimator chartAnimator = this.mAnimator;
                Intrinsics.checkNotNullExpressionValue(chartAnimator, "");
                ViewPortHandler viewPortHandler = this.mViewPortHandler;
                Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
                subRenderers2.add(new C7504alA(this, chartAnimator, viewPortHandler));
            }
        }
    }

    public final void OLrzqt() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof CombinedChartRenderer) {
            Intrinsics.copydefault(dataRenderer, "");
            CombinedChartRenderer combinedChartRenderer = (CombinedChartRenderer) dataRenderer;
            java.util.List<DataRenderer> subRenderers = combinedChartRenderer.getSubRenderers();
            Intrinsics.checkNotNullExpressionValue(subRenderers, "");
            DataRenderer dataRenderer2 = null;
            for (DataRenderer dataRenderer3 : subRenderers) {
                if (dataRenderer3 instanceof LineChartRenderer) {
                    dataRenderer2 = dataRenderer3;
                }
            }
            if (((LineChartRenderer) dataRenderer2) != null) {
                combinedChartRenderer.getSubRenderers().remove(dataRenderer2);
                combinedChartRenderer.getSubRenderers().add(this.AhwBna.getValue());
            }
        }
    }

    public final void setMarkerEndPanningCallback(@NotNull final LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        if (getOnChartGestureListener() == null) {
            setOnChartGestureListener(new C7512alI(this));
        }
        OnChartGestureListener onChartGestureListener = getOnChartGestureListener();
        C7512alI c7512alI = onChartGestureListener instanceof C7512alI ? (C7512alI) onChartGestureListener : null;
        if (c7512alI != null) {
            c7512alI.AEQbTJ(new Function0() { // from class: o.alE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C7555alz.AEQbTJ(luaFunction);
                }
            });
        }
    }

    public static final Unit AEQbTJ(LuaFunction luaFunction) {
        luaFunction.invoke(LuaValue.rNil());
        return Unit.INSTANCE;
    }

    public final void setUseLongPressGestureEnabled(boolean z) {
        if (getOnChartGestureListener() == null) {
            setOnChartGestureListener(new C7512alI(this));
        }
        OnChartGestureListener onChartGestureListener = getOnChartGestureListener();
        C7512alI c7512alI = onChartGestureListener instanceof C7512alI ? (C7512alI) onChartGestureListener : null;
        if (c7512alI != null) {
            c7512alI.KWHzl(z);
        }
    }

    public final void EZpvd(int i) {
        this.AYXKKw = true;
        this.AhwBna.getValue().copydefault(i);
    }

    public final void setLineShadowWithColor(int i, float f, float f2, float f3) {
        this.AYXKKw = true;
        this.AhwBna.getValue().KWHzl(i, f, f2, f3);
    }

    public final void setCGLayerWithColor(int i, float f, float f2, float f3) {
        this.AYXKKw = true;
        this.AhwBna.getValue().AEQbTJ(i, f, f2, f3);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.OLrzqt = motionEvent.getX();
            this.copydefault = motionEvent.getY();
            if (this.EZpvd) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            float fAbs = java.lang.Math.abs(motionEvent.getX() - this.OLrzqt);
            float fAbs2 = java.lang.Math.abs(motionEvent.getY() - this.copydefault);
            if (fAbs > fAbs2 && this.AEQbTJ) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (fAbs2 > fAbs && this.KWHzl) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            OnChartGestureListener onChartGestureListener = getOnChartGestureListener();
            C7512alI c7512alI = onChartGestureListener instanceof C7512alI ? (C7512alI) onChartGestureListener : null;
            if (c7512alI != null && c7512alI.KWHzl()) {
                if (this.djBIcL) {
                    return false;
                }
                if (!c7512alI.AEQbTJ()) {
                    if ((fAbs > C55298xhM.dp2pxFloat$default(5.0f, null, 1, null) || fAbs2 > C55298xhM.dp2pxFloat$default(5.0f, null, 1, null)) && motionEvent.getEventTime() - motionEvent.getDownTime() < android.view.ViewConfiguration.getLongPressTimeout()) {
                        this.djBIcL = true;
                    }
                    return false;
                }
            }
        } else if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
            this.djBIcL = false;
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(motionEvent);
    }
}
