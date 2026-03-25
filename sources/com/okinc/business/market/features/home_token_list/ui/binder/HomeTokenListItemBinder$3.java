package com.okinc.business.market.features.home_token_list.ui.binder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.hCJ;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class HomeTokenListItemBinder$3 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, hCJ> {
    public static final HomeTokenListItemBinder$3 INSTANCE = new HomeTokenListItemBinder$3();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeTokenListItemBinder$3() {
        super(3, hCJ.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/dexui/databinding/DexItemHomeTokenBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ hCJ invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final hCJ invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return hCJ.copydefault(layoutInflater, viewGroup, z);
    }
}
