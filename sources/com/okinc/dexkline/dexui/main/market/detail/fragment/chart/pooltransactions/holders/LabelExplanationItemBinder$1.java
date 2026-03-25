package com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.oNA;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class LabelExplanationItemBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, oNA> {
    public static final LabelExplanationItemBinder$1 INSTANCE = new LabelExplanationItemBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LabelExplanationItemBinder$1() {
        super(3, oNA.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/kline/databinding/KlineDexDialogItemLabelExplanationBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ oNA invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final oNA invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return oNA.copydefault(layoutInflater, viewGroup, z);
    }
}
