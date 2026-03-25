package com.okinc.business.market.features.smart_money.signal.ui.binder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C21600hFj;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class SignalOverviewItemBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, C21600hFj> {
    public static final SignalOverviewItemBinder$1 INSTANCE = new SignalOverviewItemBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalOverviewItemBinder$1() {
        super(3, C21600hFj.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/dexui/databinding/DexSignalOverviewCardItemBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ C21600hFj invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final C21600hFj invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return C21600hFj.OLrzqt(layoutInflater, viewGroup, z);
    }
}
