package com.okinc.web3.security.features.importing.viewmodel;

import android.content.Context;
import com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel;
import com.okinc.web3.security.utils.WrapApi;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class WalletImportViewModel$Companion$factory$1$1$3 implements WalletImportViewModel.DataWrapper, InterfaceC56514yIe {
    final /* synthetic */ WrapApi $tmp0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletImportViewModel$Companion$factory$1$1$3(WrapApi wrapApi) {
        this.$tmp0 = wrapApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean equals(Object obj) {
        if ((obj instanceof WalletImportViewModel.DataWrapper) && (obj instanceof InterfaceC56514yIe)) {
            return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56514yIe
    public final InterfaceC56388yDn<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.$tmp0, WrapApi.class, "dataWrap", "dataWrap(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel.DataWrapper
    public final String wrap(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return WrapApi.dataWrap(context, str);
    }
}
