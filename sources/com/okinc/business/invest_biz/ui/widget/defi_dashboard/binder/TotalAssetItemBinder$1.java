package com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C23770iIr;
import o.yHO;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class TotalAssetItemBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, C23770iIr> {
    public static final TotalAssetItemBinder$1 INSTANCE = new TotalAssetItemBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TotalAssetItemBinder$1() {
        super(3, C23770iIr.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/invest_biz/databinding/ItemDashboardTotalAssetsBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ C23770iIr invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final C23770iIr invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return C23770iIr.OLrzqt(layoutInflater, viewGroup, z);
    }
}
