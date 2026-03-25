package com.reown.android.internal.common.modal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.reown.android.internal.common.modal.data.model.Wallet;
import com.reown.android.internal.common.modal.data.model.WalletAppData;
import com.reown.android.internal.common.modal.data.model.WalletListing;
import com.reown.android.internal.common.modal.data.network.AppKitService;
import com.reown.android.internal.common.modal.data.network.model.EnableAnalyticsDTO;
import com.reown.android.internal.common.modal.data.network.model.GetAndroidDataDTO;
import com.reown.android.internal.common.modal.data.network.model.GetWalletsDTO;
import com.reown.android.internal.common.modal.data.network.model.WalletDTO;
import com.reown.android.internal.common.modal.data.network.model.WalletDataDTO;
import com.reown.android.utils.PackageManagerExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final class AppKitApiRepository {
    public final AppKitService appKitService;
    public final Context context;
    public final String web3ModalApiUrl;

    public AppKitApiRepository(@NotNull Context context, @NotNull String str, @NotNull AppKitService appKitService) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appKitService, "");
        this.context = context;
        this.web3ModalApiUrl = str;
        this.appKitService = appKitService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: getAndroidWalletsData-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7207getAndroidWalletsDatagIAlus(@NotNull String str, @NotNull Continuation<? super Result<? extends List<WalletAppData>>> continuation) throws Throwable {
        AppKitApiRepository$getAndroidWalletsData$1 appKitApiRepository$getAndroidWalletsData$1;
        Throwable th;
        AppKitApiRepository appKitApiRepository;
        Object objM7377constructorimpl;
        if (continuation instanceof AppKitApiRepository$getAndroidWalletsData$1) {
            appKitApiRepository$getAndroidWalletsData$1 = (AppKitApiRepository$getAndroidWalletsData$1) continuation;
            int i = appKitApiRepository$getAndroidWalletsData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appKitApiRepository$getAndroidWalletsData$1.label = i - Integer.MIN_VALUE;
            } else {
                appKitApiRepository$getAndroidWalletsData$1 = new AppKitApiRepository$getAndroidWalletsData$1(this, continuation);
            }
        }
        Object androidData = appKitApiRepository$getAndroidWalletsData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = appKitApiRepository$getAndroidWalletsData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(androidData);
            try {
                Result.Application application = Result.Companion;
                AppKitService appKitService = this.appKitService;
                appKitApiRepository$getAndroidWalletsData$1.L$0 = this;
                appKitApiRepository$getAndroidWalletsData$1.label = 1;
                androidData = appKitService.getAndroidData(str, appKitApiRepository$getAndroidWalletsData$1);
                if (androidData == objCopydefault) {
                    return objCopydefault;
                }
                appKitApiRepository = this;
            } catch (Throwable th2) {
                th = th2;
                appKitApiRepository = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            appKitApiRepository = (AppKitApiRepository) appKitApiRepository$getAndroidWalletsData$1.L$0;
            try {
                C56391yDq.AEQbTJ(androidData);
            } catch (Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((Response) androidData);
        if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            return Result.m7377constructorimpl(objM7377constructorimpl);
        }
        try {
            Result.Application application3 = Result.Companion;
            Object objBody = ((Response) objM7377constructorimpl).body();
            Intrinsics.copydefault(objBody);
            List<WalletAppData> walletsAppData = appKitApiRepository.toWalletsAppData(((GetAndroidDataDTO) objBody).getData());
            ArrayList arrayList = new ArrayList();
            for (Object obj : walletsAppData) {
                if (((WalletAppData) obj).isInstalled()) {
                    arrayList.add(obj);
                }
            }
            return Result.m7377constructorimpl(arrayList);
        } catch (Throwable th4) {
            Result.Application application4 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th4));
        }
    }

    /* JADX INFO: renamed from: getAnalyticsConfig-gIAlu-s$default, reason: not valid java name */
    public static /* synthetic */ Object m7204getAnalyticsConfiggIAlus$default(AppKitApiRepository appKitApiRepository, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "w3m";
        }
        return appKitApiRepository.m7206getAnalyticsConfiggIAlus(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: getAnalyticsConfig-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7206getAnalyticsConfiggIAlus(@NotNull String str, @NotNull Continuation<? super Result<Boolean>> continuation) {
        AppKitApiRepository$getAnalyticsConfig$1 appKitApiRepository$getAnalyticsConfig$1;
        Object objM7377constructorimpl;
        if (continuation instanceof AppKitApiRepository$getAnalyticsConfig$1) {
            appKitApiRepository$getAnalyticsConfig$1 = (AppKitApiRepository$getAnalyticsConfig$1) continuation;
            int i = appKitApiRepository$getAnalyticsConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appKitApiRepository$getAnalyticsConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                appKitApiRepository$getAnalyticsConfig$1 = new AppKitApiRepository$getAnalyticsConfig$1(this, continuation);
            }
        }
        Object analyticsConfig = appKitApiRepository$getAnalyticsConfig$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = appKitApiRepository$getAnalyticsConfig$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(analyticsConfig);
                Result.Application application = Result.Companion;
                AppKitService appKitService = this.appKitService;
                appKitApiRepository$getAnalyticsConfig$1.label = 1;
                analyticsConfig = appKitService.getAnalyticsConfig(str, appKitApiRepository$getAnalyticsConfig$1);
                if (analyticsConfig == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(analyticsConfig);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Response) analyticsConfig);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            try {
                Result.Application application3 = Result.Companion;
                Object objBody = ((Response) objM7377constructorimpl).body();
                Intrinsics.copydefault(objBody);
                return Result.m7377constructorimpl(C56443yFo.KWHzl(((EnableAnalyticsDTO) objBody).isAnalyticsEnabled()));
            } catch (Throwable th2) {
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl = C56391yDq.EZpvd(th2);
            }
        }
        return Result.m7377constructorimpl(objM7377constructorimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: getWallets-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7208getWalletshUnOzRk(@NotNull String str, int i, String str2, List<String> list, List<String> list2, @NotNull Continuation<? super Result<WalletListing>> continuation) throws Throwable {
        AppKitApiRepository$getWallets$1 appKitApiRepository$getWallets$1;
        int i2;
        AppKitApiRepository appKitApiRepository;
        AppKitService appKitService;
        String strJoinToString$default;
        String strJoinToString$default2;
        Object objM7377constructorimpl;
        if (continuation instanceof AppKitApiRepository$getWallets$1) {
            appKitApiRepository$getWallets$1 = (AppKitApiRepository$getWallets$1) continuation;
            int i3 = appKitApiRepository$getWallets$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                appKitApiRepository$getWallets$1.label = i3 - Integer.MIN_VALUE;
            } else {
                appKitApiRepository$getWallets$1 = new AppKitApiRepository$getWallets$1(this, continuation);
            }
        }
        AppKitApiRepository$getWallets$1 appKitApiRepository$getWallets$12 = appKitApiRepository$getWallets$1;
        Object wallets$default = appKitApiRepository$getWallets$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = appKitApiRepository$getWallets$12.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(wallets$default);
            try {
                Result.Application application = Result.Companion;
                appKitService = this.appKitService;
                strJoinToString$default = list != null ? CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null) : null;
                strJoinToString$default2 = list2 != null ? CollectionsKt___CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, null, 62, null) : null;
                appKitApiRepository$getWallets$12.L$0 = this;
                i2 = i;
            } catch (Throwable th) {
                th = th;
                i2 = i;
            }
            try {
                appKitApiRepository$getWallets$12.I$0 = i2;
                appKitApiRepository$getWallets$12.label = 1;
                wallets$default = AppKitService.DefaultImpls.getWallets$default(appKitService, str, i, str2, strJoinToString$default, strJoinToString$default2, 0, null, appKitApiRepository$getWallets$12, 96, null);
                if (wallets$default == objCopydefault) {
                    return objCopydefault;
                }
                appKitApiRepository = this;
                objM7377constructorimpl = Result.m7377constructorimpl((Response) wallets$default);
            } catch (Throwable th2) {
                th = th2;
                appKitApiRepository = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                return Result.m7377constructorimpl(objM7377constructorimpl);
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = appKitApiRepository$getWallets$12.I$0;
            appKitApiRepository = (AppKitApiRepository) appKitApiRepository$getWallets$12.L$0;
            try {
                C56391yDq.AEQbTJ(wallets$default);
                i2 = i5;
                try {
                    objM7377constructorimpl = Result.m7377constructorimpl((Response) wallets$default);
                } catch (Throwable th3) {
                    th = th3;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } catch (Throwable th4) {
                th = th4;
                i2 = i5;
                Result.Application application222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                return Result.m7377constructorimpl(objM7377constructorimpl);
            }
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            try {
                Result.Application application3 = Result.Companion;
                Object objBody = ((Response) objM7377constructorimpl).body();
                Intrinsics.copydefault(objBody);
                GetWalletsDTO getWalletsDTO = (GetWalletsDTO) objBody;
                return Result.m7377constructorimpl(new WalletListing(i2, getWalletsDTO.getCount(), appKitApiRepository.toWallets(getWalletsDTO.getData())));
            } catch (Throwable th5) {
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl = C56391yDq.EZpvd(th5);
            }
        }
        return Result.m7377constructorimpl(objM7377constructorimpl);
    }

    public final List<Wallet> toWallets(List<WalletDTO> list) {
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (WalletDTO walletDTO : list) {
            Wallet wallet = new Wallet(walletDTO.getId(), walletDTO.getName(), walletDTO.getHomePage(), this.web3ModalApiUrl + "getWalletImage/" + walletDTO.getImageId(), walletDTO.getOrder(), walletDTO.getMobileLink(), walletDTO.getPlayStore(), walletDTO.getWebappLink(), walletDTO.getLinkMode(), false, 512, null);
            PackageManager packageManager = this.context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "");
            wallet.setWalletInstalled(PackageManagerExtensionsKt.isWalletInstalled(packageManager, wallet.getAppPackage()));
            arrayList.add(wallet);
        }
        return arrayList;
    }

    public final List<WalletAppData> toWalletsAppData(List<WalletDataDTO> list) {
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (WalletDataDTO walletDataDTO : list) {
            String id = walletDataDTO.getId();
            String appId = walletDataDTO.getAppId();
            PackageManager packageManager = this.context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "");
            arrayList.add(new WalletAppData(id, appId, PackageManagerExtensionsKt.isWalletInstalled(packageManager, walletDataDTO.getAppId())));
        }
        return arrayList;
    }
}
