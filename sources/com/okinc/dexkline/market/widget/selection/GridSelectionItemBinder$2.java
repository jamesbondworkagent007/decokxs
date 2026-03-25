package com.okinc.dexkline.market.widget.selection;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C36072oOf;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class GridSelectionItemBinder$2 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, C36072oOf> {
    public static final GridSelectionItemBinder$2 INSTANCE = new GridSelectionItemBinder$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridSelectionItemBinder$2() {
        super(3, C36072oOf.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/kline/databinding/KlineDexItemGridSelectionBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ C36072oOf invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final C36072oOf invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return C36072oOf.copydefault(layoutInflater, viewGroup, z);
    }
}
