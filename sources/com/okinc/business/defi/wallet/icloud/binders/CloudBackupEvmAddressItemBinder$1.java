package com.okinc.business.defi.wallet.icloud.binders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC16681eoX;
import o.yHO;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class CloudBackupEvmAddressItemBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, AbstractC16681eoX> {
    public static final CloudBackupEvmAddressItemBinder$1 INSTANCE = new CloudBackupEvmAddressItemBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CloudBackupEvmAddressItemBinder$1() {
        super(3, AbstractC16681eoX.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/defi/wallet/databinding/ItemCloudBackupAddressEvmBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ AbstractC16681eoX invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final AbstractC16681eoX invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return AbstractC16681eoX.copydefault(layoutInflater, viewGroup, z);
    }
}
