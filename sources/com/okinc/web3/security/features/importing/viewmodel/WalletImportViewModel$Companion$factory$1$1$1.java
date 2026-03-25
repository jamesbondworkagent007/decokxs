package com.okinc.web3.security.features.importing.viewmodel;

import android.view.View;
import com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class WalletImportViewModel$Companion$factory$1$1$1 implements WalletImportViewModel.SeedPhraseWordIdGenerator, InterfaceC56514yIe {
    public static final WalletImportViewModel$Companion$factory$1$1$1 INSTANCE = new WalletImportViewModel$Companion$factory$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean equals(Object obj) {
        if ((obj instanceof WalletImportViewModel.SeedPhraseWordIdGenerator) && (obj instanceof InterfaceC56514yIe)) {
            return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56514yIe
    public final InterfaceC56388yDn<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(0, View.class, "generateViewId", "generateViewId()I", 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel.SeedPhraseWordIdGenerator
    public final int generateId() {
        return View.generateViewId();
    }
}
