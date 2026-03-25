package com.okinc.okex.lite.hero.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C45757swc;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class HeroContainerFragment$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, C45757swc> {
    public static final HeroContainerFragment$1 INSTANCE = new HeroContainerFragment$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HeroContainerFragment$1() {
        super(3, C45757swc.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/okex/lite/navigation/databinding/FragmentHeroContainerBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ C45757swc invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final C45757swc invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return C45757swc.EZpvd(layoutInflater, viewGroup, z);
    }
}
