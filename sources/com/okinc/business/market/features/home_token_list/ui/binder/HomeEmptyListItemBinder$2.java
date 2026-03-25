package com.okinc.business.market.features.home_token_list.ui.binder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.hCH;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class HomeEmptyListItemBinder$2 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, hCH> {
    public static final HomeEmptyListItemBinder$2 INSTANCE = new HomeEmptyListItemBinder$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeEmptyListItemBinder$2() {
        super(3, hCH.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/dexui/databinding/DexItemHomeEmptyListBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ hCH invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final hCH invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return hCH.AEQbTJ(layoutInflater, viewGroup, z);
    }
}
