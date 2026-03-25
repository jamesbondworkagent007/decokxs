package com.okinc.kline.library.data.viewmodel;

import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class KlineLoneLifeCyViewModel$updateKlineConfigYAxisClick$2 extends MutablePropertyReference1Impl {
    public static final KlineLoneLifeCyViewModel$updateKlineConfigYAxisClick$2 INSTANCE = new KlineLoneLifeCyViewModel$updateKlineConfigYAxisClick$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KlineLoneLifeCyViewModel$updateKlineConfigYAxisClick$2() {
        super(ChartViewOutSideConfig.class, "mShowAxis", "getMShowAxis()Z", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
    public Object get(Object obj) {
        return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMShowAxis());
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
    public void set(Object obj, Object obj2) {
        ((ChartViewOutSideConfig) obj).setMShowAxis(((Boolean) obj2).booleanValue());
    }
}
