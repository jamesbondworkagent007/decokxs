package com.okinc.business.market.features.smart_money.signal.ui.overview.chart;

import android.graphics.Path;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C29660kxo;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class SignalOverviewChartRenderer$drawHorizontalBezier$1 extends FunctionReferenceImpl implements Function2<ILineDataSet, Float, Path> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalOverviewChartRenderer$drawHorizontalBezier$1(Object obj) {
        super(2, obj, C29660kxo.class, "generateHorizontalBezierPath", "generateHorizontalBezierPath(Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;F)Landroid/graphics/Path;", 0);
    }

    public final Path invoke(ILineDataSet iLineDataSet, float f) {
        Intrinsics.checkNotNullParameter(iLineDataSet, "");
        return ((C29660kxo) this.receiver).OLrzqt(iLineDataSet, f);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Path invoke(ILineDataSet iLineDataSet, Float f) {
        return invoke(iLineDataSet, f.floatValue());
    }
}
