package com.okinc.business.defi.wallet.home.onboarding.ui.binders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C16731epU;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DefiOnboardingDividerTileBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, C16731epU> {
    public static final DefiOnboardingDividerTileBinder$1 INSTANCE = new DefiOnboardingDividerTileBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefiOnboardingDividerTileBinder$1() {
        super(3, C16731epU.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/defi/wallet/databinding/ItemDefiOnboardingDividerTileBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ C16731epU invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final C16731epU invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return C16731epU.copydefault(layoutInflater, viewGroup, z);
    }
}
