package com.okinc.kline.library.data.viewmodel;

import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class KlineLoneLifeCyViewModel$updateKlineConfigChartOffsetInit$2 extends MutablePropertyReference1Impl {
    public static final KlineLoneLifeCyViewModel$updateKlineConfigChartOffsetInit$2 INSTANCE = new KlineLoneLifeCyViewModel$updateKlineConfigChartOffsetInit$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KlineLoneLifeCyViewModel$updateKlineConfigChartOffsetInit$2() {
        super(ChartViewOutSideConfig.class, "mChartOffsetInit", "getMChartOffsetInit()Z", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
    public Object get(Object obj) {
        return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMChartOffsetInit());
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
    public void set(Object obj, Object obj2) {
        ((ChartViewOutSideConfig) obj).setMChartOffsetInit(((Boolean) obj2).booleanValue());
    }
}
