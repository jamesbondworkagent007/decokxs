package o;

import com.okinc.business.defi.biz.net.bean.QueryAddressRegisterStatusRes;
import com.okinc.business.defi.biz.net.bean.RegisterAddressStatusRes;
import com.okinc.business.defi.wallet.home.usdgActivity.data.model.AddressRegisterBean;
import com.okinc.business.defi.wallet.home.usdgActivity.data.model.AddressRegisterStatusResultBean;
import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.AddressRegisterStatus;
import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.RegisterAddressStatus;
import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.WalletUsdgActivityRepository$queryAddressRegisterStatus$1;
import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.WalletUsdgActivityRepository$registerAddress$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@yCR
public final class C18174fdS {
    public final C12827cuN OLrzqt;
    public final C13934dbu copydefault;

    @yCM
    public C18174fdS(@NotNull C13934dbu c13934dbu, @NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.copydefault = c13934dbu;
        this.OLrzqt = c12827cuN;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:12:0x0029, B:27:0x008a, B:29:0x00a0, B:30:0x00a2, B:17:0x0044, B:24:0x0069, B:20:0x004e), top: B:35:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, long j, @NotNull java.util.List<AddressRegisterBean> list, @NotNull Continuation<? super Result<C18176fdU>> continuation) throws java.lang.Throwable {
        WalletUsdgActivityRepository$registerAddress$1 walletUsdgActivityRepository$registerAddress$1;
        C18174fdS c18174fdS;
        RegisterAddressStatus registerAddressStatusAEQbTJ;
        if (continuation instanceof WalletUsdgActivityRepository$registerAddress$1) {
            walletUsdgActivityRepository$registerAddress$1 = (WalletUsdgActivityRepository$registerAddress$1) continuation;
            int i = walletUsdgActivityRepository$registerAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletUsdgActivityRepository$registerAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                walletUsdgActivityRepository$registerAddress$1 = new WalletUsdgActivityRepository$registerAddress$1(this, continuation);
            }
        }
        WalletUsdgActivityRepository$registerAddress$1 walletUsdgActivityRepository$registerAddress$12 = walletUsdgActivityRepository$registerAddress$1;
        java.lang.Object objAwait = walletUsdgActivityRepository$registerAddress$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletUsdgActivityRepository$registerAddress$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.OLrzqt.copydefault(true);
                walletUsdgActivityRepository$registerAddress$12.L$0 = this;
                walletUsdgActivityRepository$registerAddress$12.L$1 = str;
                walletUsdgActivityRepository$registerAddress$12.L$2 = list;
                walletUsdgActivityRepository$registerAddress$12.J$0 = j;
                walletUsdgActivityRepository$registerAddress$12.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, walletUsdgActivityRepository$registerAddress$12);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                c18174fdS = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objAwait);
                    RegisterAddressStatusRes registerAddressStatusRes = (RegisterAddressStatusRes) ((AbstractC43419rot) objAwait).AEQbTJ();
                    registerAddressStatusAEQbTJ = RegisterAddressStatus.Companion.AEQbTJ(registerAddressStatusRes.getRegisterStatus());
                    if (registerAddressStatusAEQbTJ == null) {
                        registerAddressStatusAEQbTJ = RegisterAddressStatus.STATUS_REGISTERED_FAIL;
                    }
                    return Result.m7377constructorimpl(new C18176fdU(registerAddressStatusAEQbTJ, registerAddressStatusRes.getSupportRetry()));
                }
                j = walletUsdgActivityRepository$registerAddress$12.J$0;
                list = (java.util.List) walletUsdgActivityRepository$registerAddress$12.L$2;
                str = (java.lang.String) walletUsdgActivityRepository$registerAddress$12.L$1;
                c18174fdS = (C18174fdS) walletUsdgActivityRepository$registerAddress$12.L$0;
                C56391yDq.AEQbTJ(objAwait);
            }
            java.lang.String str2 = str;
            long j2 = j;
            java.util.List<AddressRegisterBean> list2 = list;
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objAwait;
            C13934dbu c13934dbu = c18174fdS.copydefault;
            java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
            java.lang.String strUSBtdM = abstractC12782ctV.USBtdM();
            java.lang.String strAUsmxb = abstractC12782ctV.aUsmxb();
            walletUsdgActivityRepository$registerAddress$12.L$0 = null;
            walletUsdgActivityRepository$registerAddress$12.L$1 = null;
            walletUsdgActivityRepository$registerAddress$12.L$2 = null;
            walletUsdgActivityRepository$registerAddress$12.label = 2;
            objAwait = c13934dbu.OLrzqt(strDbNXlk, strUSBtdM, strAUsmxb, str2, j2, list2, walletUsdgActivityRepository$registerAddress$12);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            RegisterAddressStatusRes registerAddressStatusRes2 = (RegisterAddressStatusRes) ((AbstractC43419rot) objAwait).AEQbTJ();
            registerAddressStatusAEQbTJ = RegisterAddressStatus.Companion.AEQbTJ(registerAddressStatusRes2.getRegisterStatus());
            if (registerAddressStatusAEQbTJ == null) {
            }
            return Result.m7377constructorimpl(new C18176fdU(registerAddressStatusAEQbTJ, registerAddressStatusRes2.getSupportRetry()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:12:0x0029, B:27:0x0080, B:28:0x009b, B:30:0x00a1, B:32:0x00c1, B:33:0x00c3, B:34:0x00cc, B:17:0x003f, B:24:0x0061, B:20:0x0048), top: B:39:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(long j, @NotNull java.util.List<AddressRegisterBean> list, @NotNull Continuation<? super Result<? extends java.util.List<C18178fdW>>> continuation) throws java.lang.Throwable {
        WalletUsdgActivityRepository$queryAddressRegisterStatus$1 walletUsdgActivityRepository$queryAddressRegisterStatus$1;
        C18174fdS c18174fdS;
        if (continuation instanceof WalletUsdgActivityRepository$queryAddressRegisterStatus$1) {
            walletUsdgActivityRepository$queryAddressRegisterStatus$1 = (WalletUsdgActivityRepository$queryAddressRegisterStatus$1) continuation;
            int i = walletUsdgActivityRepository$queryAddressRegisterStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletUsdgActivityRepository$queryAddressRegisterStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletUsdgActivityRepository$queryAddressRegisterStatus$1 = new WalletUsdgActivityRepository$queryAddressRegisterStatus$1(this, continuation);
            }
        }
        WalletUsdgActivityRepository$queryAddressRegisterStatus$1 walletUsdgActivityRepository$queryAddressRegisterStatus$12 = walletUsdgActivityRepository$queryAddressRegisterStatus$1;
        java.lang.Object objAwait = walletUsdgActivityRepository$queryAddressRegisterStatus$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletUsdgActivityRepository$queryAddressRegisterStatus$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.OLrzqt.copydefault(true);
                walletUsdgActivityRepository$queryAddressRegisterStatus$12.L$0 = this;
                walletUsdgActivityRepository$queryAddressRegisterStatus$12.L$1 = list;
                walletUsdgActivityRepository$queryAddressRegisterStatus$12.J$0 = j;
                walletUsdgActivityRepository$queryAddressRegisterStatus$12.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, walletUsdgActivityRepository$queryAddressRegisterStatus$12);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                c18174fdS = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objAwait);
                    java.util.List<AddressRegisterStatusResultBean> addressRegisterResultList = ((QueryAddressRegisterStatusRes) ((AbstractC43419rot) objAwait).AEQbTJ()).getAddressRegisterResultList();
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(addressRegisterResultList, 10));
                    for (AddressRegisterStatusResultBean addressRegisterStatusResultBean : addressRegisterResultList) {
                        java.lang.String userAddress = addressRegisterStatusResultBean.getUserAddress();
                        long chainIndex = addressRegisterStatusResultBean.getChainIndex();
                        java.lang.String tokenAddress = addressRegisterStatusResultBean.getTokenAddress();
                        AddressRegisterStatus addressRegisterStatusCopydefault = AddressRegisterStatus.Companion.copydefault(addressRegisterStatusResultBean.getStatus());
                        if (addressRegisterStatusCopydefault == null) {
                            addressRegisterStatusCopydefault = AddressRegisterStatus.STATUS_UNACTIVATED;
                        }
                        arrayList.add(new C18178fdW(userAddress, chainIndex, tokenAddress, addressRegisterStatusCopydefault));
                    }
                    return Result.m7377constructorimpl(arrayList);
                }
                j = walletUsdgActivityRepository$queryAddressRegisterStatus$12.J$0;
                list = (java.util.List) walletUsdgActivityRepository$queryAddressRegisterStatus$12.L$1;
                c18174fdS = (C18174fdS) walletUsdgActivityRepository$queryAddressRegisterStatus$12.L$0;
                C56391yDq.AEQbTJ(objAwait);
            }
            long j2 = j;
            java.util.List<AddressRegisterBean> list2 = list;
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objAwait;
            C13934dbu c13934dbu = c18174fdS.copydefault;
            java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
            java.lang.String strUSBtdM = abstractC12782ctV.USBtdM();
            java.lang.String strAUsmxb = abstractC12782ctV.aUsmxb();
            walletUsdgActivityRepository$queryAddressRegisterStatus$12.L$0 = null;
            walletUsdgActivityRepository$queryAddressRegisterStatus$12.L$1 = null;
            walletUsdgActivityRepository$queryAddressRegisterStatus$12.label = 2;
            objAwait = c13934dbu.AEQbTJ(strDbNXlk, strUSBtdM, strAUsmxb, j2, list2, walletUsdgActivityRepository$queryAddressRegisterStatus$12);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            java.util.List<AddressRegisterStatusResultBean> addressRegisterResultList2 = ((QueryAddressRegisterStatusRes) ((AbstractC43419rot) objAwait).AEQbTJ()).getAddressRegisterResultList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(addressRegisterResultList2, 10));
            while (r10.hasNext()) {
            }
            return Result.m7377constructorimpl(arrayList2);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
