package com.okinc.business.dexui.main.swap.mememode.widget;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C21577hEn;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class PresetCustomPrioritySelectView$initRecyclerView$2 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, C21577hEn> {
    public static final PresetCustomPrioritySelectView$initRecyclerView$2 INSTANCE = new PresetCustomPrioritySelectView$initRecyclerView$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PresetCustomPrioritySelectView$initRecyclerView$2() {
        super(3, C21577hEn.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/dexui/databinding/DexMemeItemCustomPriorityfeeBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ C21577hEn invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final C21577hEn invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return C21577hEn.AEQbTJ(layoutInflater, viewGroup, z);
    }
}
