package com.okinc.business.defi.wallet.home.onboarding.ui.binders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C16790eqa;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DefiOnboardingTextTileBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, C16790eqa> {
    public static final DefiOnboardingTextTileBinder$1 INSTANCE = new DefiOnboardingTextTileBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefiOnboardingTextTileBinder$1() {
        super(3, C16790eqa.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/defi/wallet/databinding/ItemDefiOnboardingTextTileBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ C16790eqa invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final C16790eqa invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return C16790eqa.AEQbTJ(layoutInflater, viewGroup, z);
    }
}
