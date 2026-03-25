package com.okinc.business.market.features.filter.ui.binder.range;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.hDS;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class RangeSwitchFilterItemBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, hDS> {
    public static final RangeSwitchFilterItemBinder$1 INSTANCE = new RangeSwitchFilterItemBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RangeSwitchFilterItemBinder$1() {
        super(3, hDS.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/dexui/databinding/DexMarketFgFilterRangeSwitchItemBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ hDS invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final hDS invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return hDS.KWHzl(layoutInflater, viewGroup, z);
    }
}
