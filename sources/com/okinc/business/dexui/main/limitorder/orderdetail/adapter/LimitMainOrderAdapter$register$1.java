package com.okinc.business.dexui.main.limitorder.orderdetail.adapter;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C21800hMu;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class LimitMainOrderAdapter$register$1 extends FunctionReferenceImpl implements Function2<DetailSection, Boolean, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitMainOrderAdapter$register$1(Object obj) {
        super(2, obj, C21800hMu.class, "onSectionsClick", "onSectionsClick(Lcom/okinc/business/dexui/main/limitorder/orderdetail/adapter/DetailSection;Z)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Unit invoke(DetailSection detailSection, Boolean bool) {
        invoke(detailSection, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(DetailSection detailSection, boolean z) {
        Intrinsics.checkNotNullParameter(detailSection, "");
        ((C21800hMu) this.receiver).KWHzl(detailSection, z);
    }
}
