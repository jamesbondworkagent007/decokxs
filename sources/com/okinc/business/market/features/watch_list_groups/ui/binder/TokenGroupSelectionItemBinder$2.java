package com.okinc.business.market.features.watch_list_groups.ui.binder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C23468hym;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class TokenGroupSelectionItemBinder$2 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, C23468hym> {
    public static final TokenGroupSelectionItemBinder$2 INSTANCE = new TokenGroupSelectionItemBinder$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenGroupSelectionItemBinder$2() {
        super(3, C23468hym.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/dexui/databinding/DexBsItemWatchlistGroupBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ C23468hym invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final C23468hym invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return C23468hym.OLrzqt(layoutInflater, viewGroup, z);
    }
}
