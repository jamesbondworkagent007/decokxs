package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.wallet.home.addressDetail.utils.WalletTokenPnlShareInfo;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC33073mpa;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C15839eXe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSharePnlTokenViewModel extends AbstractC33073mpa {
    public final C15839eXe AEQbTJ;
    public final C12827cuN OLrzqt;

    @yCM
    public WalletSharePnlTokenViewModel(@NotNull C15839eXe c15839eXe, @NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c15839eXe, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.AEQbTJ = c15839eXe;
        this.OLrzqt = c12827cuN;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Continuation<? super Result<WalletTokenPnlShareInfo>> continuation) throws Throwable {
        WalletSharePnlTokenViewModel$getTokenShareInfo$1 walletSharePnlTokenViewModel$getTokenShareInfo$1;
        if (continuation instanceof WalletSharePnlTokenViewModel$getTokenShareInfo$1) {
            walletSharePnlTokenViewModel$getTokenShareInfo$1 = (WalletSharePnlTokenViewModel$getTokenShareInfo$1) continuation;
            int i = walletSharePnlTokenViewModel$getTokenShareInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSharePnlTokenViewModel$getTokenShareInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSharePnlTokenViewModel$getTokenShareInfo$1 = new WalletSharePnlTokenViewModel$getTokenShareInfo$1(this, continuation);
            }
        }
        WalletSharePnlTokenViewModel$getTokenShareInfo$1 walletSharePnlTokenViewModel$getTokenShareInfo$12 = walletSharePnlTokenViewModel$getTokenShareInfo$1;
        Object obj = walletSharePnlTokenViewModel$getTokenShareInfo$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSharePnlTokenViewModel$getTokenShareInfo$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C15839eXe c15839eXe = this.AEQbTJ;
        walletSharePnlTokenViewModel$getTokenShareInfo$12.label = 1;
        Object objEZpvd = c15839eXe.EZpvd(str, str2, str3, str4, walletSharePnlTokenViewModel$getTokenShareInfo$12);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super Result<String>> continuation) throws Throwable {
        WalletSharePnlTokenViewModel$getAccountId$1 walletSharePnlTokenViewModel$getAccountId$1;
        if (continuation instanceof WalletSharePnlTokenViewModel$getAccountId$1) {
            walletSharePnlTokenViewModel$getAccountId$1 = (WalletSharePnlTokenViewModel$getAccountId$1) continuation;
            int i = walletSharePnlTokenViewModel$getAccountId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSharePnlTokenViewModel$getAccountId$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSharePnlTokenViewModel$getAccountId$1 = new WalletSharePnlTokenViewModel$getAccountId$1(this, continuation);
            }
        }
        Object objAwait = walletSharePnlTokenViewModel$getAccountId$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSharePnlTokenViewModel$getAccountId$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = this.OLrzqt.KWHzl();
                walletSharePnlTokenViewModel$getAccountId$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtKWHzl, walletSharePnlTokenViewModel$getAccountId$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwait);
            }
            return Result.m7377constructorimpl(((InterfaceC9738bbJ) objAwait).DbNXlk());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
