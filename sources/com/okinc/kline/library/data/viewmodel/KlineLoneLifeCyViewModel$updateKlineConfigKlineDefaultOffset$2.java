package com.okinc.kline.library.data.viewmodel;

import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class KlineLoneLifeCyViewModel$updateKlineConfigKlineDefaultOffset$2 extends MutablePropertyReference1Impl {
    public static final KlineLoneLifeCyViewModel$updateKlineConfigKlineDefaultOffset$2 INSTANCE = new KlineLoneLifeCyViewModel$updateKlineConfigKlineDefaultOffset$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KlineLoneLifeCyViewModel$updateKlineConfigKlineDefaultOffset$2() {
        super(ChartViewOutSideConfig.class, "klineDefaultOffset", "getKlineDefaultOffset()F", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
    public Object get(Object obj) {
        return Float.valueOf(((ChartViewOutSideConfig) obj).getKlineDefaultOffset());
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
    public void set(Object obj, Object obj2) {
        ((ChartViewOutSideConfig) obj).setKlineDefaultOffset(((Number) obj2).floatValue());
    }
}
