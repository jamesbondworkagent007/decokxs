package com.okinc.business.market.widget.selection;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.hCC;
import o.yHO;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class GridSelectionItemBinder$2 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, hCC> {
    public static final GridSelectionItemBinder$2 INSTANCE = new GridSelectionItemBinder$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridSelectionItemBinder$2() {
        super(3, hCC.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/dexui/databinding/DexItemGridSelectionBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ hCC invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final hCC invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return hCC.OLrzqt(layoutInflater, viewGroup, z);
    }
}
