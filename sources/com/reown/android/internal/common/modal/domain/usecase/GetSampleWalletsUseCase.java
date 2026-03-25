package com.reown.android.internal.common.modal.domain.usecase;

import android.content.Context;
import android.content.pm.PackageManager;
import com.reown.android.internal.common.modal.data.model.Wallet;
import com.reown.android.utils.PackageManagerExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetSampleWalletsUseCase implements GetSampleWalletsUseCaseInterface {
    public final Context context;

    public GetSampleWalletsUseCase(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
    }

    @Override // com.reown.android.internal.common.modal.domain.usecase.GetSampleWalletsUseCaseInterface
    public Object invoke(@NotNull Continuation<? super List<Wallet>> continuation) {
        Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("com.reown.sample.wallet.debug", GetSamplesWalletsUseCaseInterfaceKt.SampleWalletDebug), C56390yDp.OLrzqt("com.reown.sample.wallet.internal", GetSamplesWalletsUseCaseInterfaceKt.SampleWalletInternal), C56390yDp.OLrzqt("com.reown.sample.wallet", GetSamplesWalletsUseCaseInterfaceKt.SampleWalletRelease), C56390yDp.OLrzqt("com.walletconnect.web3wallet.rnsample.internal", GetSamplesWalletsUseCaseInterfaceKt.RNSampleWalletInternal), C56390yDp.OLrzqt("com.walletconnect.web3wallet.rnsample", GetSamplesWalletsUseCaseInterfaceKt.RNSampleWallet), C56390yDp.OLrzqt("com.walletconnect.flutterwallet", GetSamplesWalletsUseCaseInterfaceKt.FLSampleWallet), C56390yDp.OLrzqt("com.walletconnect.flutterwallet.internal", GetSamplesWalletsUseCaseInterfaceKt.FLSampleWalletInternal));
        for (Map.Entry entry : mapGEmmrt.entrySet()) {
            String str = (String) entry.getKey();
            Wallet wallet = (Wallet) entry.getValue();
            PackageManager packageManager = this.context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "");
            wallet.setWalletInstalled(PackageManagerExtensionsKt.isWalletInstalled(packageManager, str));
        }
        ArrayList arrayList = new ArrayList(mapGEmmrt.size());
        Iterator it = mapGEmmrt.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((Wallet) ((Map.Entry) it.next()).getValue());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Wallet) obj).isWalletInstalled()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
