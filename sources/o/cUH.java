package o;

import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.impl.BindWalletServiceImpl$existWalletCanBeBound$1;
import com.okinc.business.defi.biz.impl.BindWalletServiceImpl$existWalletCanBeBound$2;
import com.okinc.business.defi.biz.impl.BindWalletServiceImpl$preCheckSignStatus$1;
import com.okinc.business.defi.biz.impl.BindWalletServiceImpl$querySingleWallet$1;
import com.okinc.business.defi.biz.impl.BindWalletServiceImpl$queryWalletList$1;
import com.okinc.business.defi.biz.impl.BindWalletServiceImpl$queryWalletList$2;
import com.okinc.business.defi.biz.impl.BindWalletServiceImpl$signBindData$1;
import com.okinc.business.defi.biz.impl.BindWalletServiceImpl$signBindData$2;
import com.okinc.business.defi.biz.impl.BindWalletServiceImpl$signUnbindData$1;
import com.okinc.business.defi.biz.impl.BindWalletServiceImpl$signUnbindData$2;
import com.okinc.business.defi.biz.impl.BindWalletServiceImpl$verifyWalletAddresses$1;
import com.okinc.business.defi.biz.impl.PreCheckResult;
import com.okinc.business.defi.biz.net.bean.CreateWalletReqNew;
import com.okinc.business.defi.biz.net.bean.VerifyResp;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.wallet.api.bean.CurrentWalletSelectMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.okinc.wallet.api.bean.SignStatus;
import com.okinc.wallet.api.bean.WalletInfo;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import io.reactivex.BackpressureStrategy;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC43419rot;
import o.C13754dXa;
import o.InterfaceC54855xXv;
import o.InterfaceC9739bbK;
import o.cUH;
import o.xWX;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes4.dex */
public final class cUH extends AbstractC43215rlA implements InterfaceC54824xWr {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final C12827cuN AYXKKw;
    public final InterfaceC33171mrS KWHzl;
    public final C13934dbu OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final xWX djBIcL;
    public final C13058cyg gEmmrt;
    public final WalletUpdateWorker valueOf;

    public cUH(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C12827cuN c12827cuN, @NotNull xWX xwx, @NotNull InterfaceC33171mrS interfaceC33171mrS, @NotNull C13058cyg c13058cyg, @NotNull WalletUpdateWorker walletUpdateWorker, @NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(xwx, "");
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        Intrinsics.checkNotNullParameter(c13058cyg, "");
        Intrinsics.checkNotNullParameter(walletUpdateWorker, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.copydefault = coroutineDispatcher;
        this.AYXKKw = c12827cuN;
        this.djBIcL = xwx;
        this.KWHzl = interfaceC33171mrS;
        this.gEmmrt = c13058cyg;
        this.valueOf = walletUpdateWorker;
        this.OLrzqt = c13934dbu;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.cUF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return cUH.AEQbTJ();
            }
        });
    }

    public static final C17320fAz AEQbTJ() {
        return new C17320fAz("OKX_Wallet_KeyPairCipher");
    }

    public final C17320fAz KWHzl() {
        return (C17320fAz) this.AEQbTJ.getValue();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cUH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC54824xWr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(java.lang.Long l, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        BindWalletServiceImpl$existWalletCanBeBound$1 bindWalletServiceImpl$existWalletCanBeBound$1;
        if (continuation instanceof BindWalletServiceImpl$existWalletCanBeBound$1) {
            bindWalletServiceImpl$existWalletCanBeBound$1 = (BindWalletServiceImpl$existWalletCanBeBound$1) continuation;
            int i = bindWalletServiceImpl$existWalletCanBeBound$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bindWalletServiceImpl$existWalletCanBeBound$1.label = i - Integer.MIN_VALUE;
            } else {
                bindWalletServiceImpl$existWalletCanBeBound$1 = new BindWalletServiceImpl$existWalletCanBeBound$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = bindWalletServiceImpl$existWalletCanBeBound$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bindWalletServiceImpl$existWalletCanBeBound$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            BindWalletServiceImpl$existWalletCanBeBound$2 bindWalletServiceImpl$existWalletCanBeBound$2 = new BindWalletServiceImpl$existWalletCanBeBound$2(this, l, null);
            bindWalletServiceImpl$existWalletCanBeBound$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, bindWalletServiceImpl$existWalletCanBeBound$2, bindWalletServiceImpl$existWalletCanBeBound$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.util.List<xWZ> list, @NotNull Continuation<? super Result<? extends java.util.List<C54835xXb>>> continuation) throws java.lang.Throwable {
        BindWalletServiceImpl$queryWalletList$1 bindWalletServiceImpl$queryWalletList$1;
        if (continuation instanceof BindWalletServiceImpl$queryWalletList$1) {
            bindWalletServiceImpl$queryWalletList$1 = (BindWalletServiceImpl$queryWalletList$1) continuation;
            int i = bindWalletServiceImpl$queryWalletList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bindWalletServiceImpl$queryWalletList$1.label = i - Integer.MIN_VALUE;
            } else {
                bindWalletServiceImpl$queryWalletList$1 = new BindWalletServiceImpl$queryWalletList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = bindWalletServiceImpl$queryWalletList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bindWalletServiceImpl$queryWalletList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            pUU.EZpvd("BindWalletServiceImpl", "queryWalletList config: " + list);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            BindWalletServiceImpl$queryWalletList$2 bindWalletServiceImpl$queryWalletList$2 = new BindWalletServiceImpl$queryWalletList$2(list, this, null);
            bindWalletServiceImpl$queryWalletList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, bindWalletServiceImpl$queryWalletList$2, bindWalletServiceImpl$queryWalletList$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull xWZ xwz, @NotNull Continuation<? super Result<C54835xXb>> continuation) throws java.lang.Throwable {
        BindWalletServiceImpl$querySingleWallet$1 bindWalletServiceImpl$querySingleWallet$1;
        java.lang.Object objOLrzqt;
        if (continuation instanceof BindWalletServiceImpl$querySingleWallet$1) {
            bindWalletServiceImpl$querySingleWallet$1 = (BindWalletServiceImpl$querySingleWallet$1) continuation;
            int i = bindWalletServiceImpl$querySingleWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bindWalletServiceImpl$querySingleWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                bindWalletServiceImpl$querySingleWallet$1 = new BindWalletServiceImpl$querySingleWallet$1(this, continuation);
            }
        }
        java.lang.Object obj = bindWalletServiceImpl$querySingleWallet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bindWalletServiceImpl$querySingleWallet$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<xWZ> listEZpvd = C56402yEa.EZpvd(xwz);
            bindWalletServiceImpl$querySingleWallet$1.label = 1;
            objOLrzqt = OLrzqt(listEZpvd, bindWalletServiceImpl$querySingleWallet$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            Result.Application application = Result.Companion;
            objOLrzqt = (C54835xXb) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) objOLrzqt);
        }
        return Result.m7377constructorimpl(objOLrzqt);
    }

    @Override // o.InterfaceC54824xWr
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, final java.lang.Long l, @NotNull InterfaceC54857xXx interfaceC54857xXx) {
        CurrentWalletSelectMode walletSelectedById;
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC54857xXx, "");
        xWX xwx = this.djBIcL;
        if (str == null || str.length() == 0) {
            walletSelectedById = CurrentWalletSelectMode.NoWalletSelected.EZpvd;
        } else {
            walletSelectedById = new CurrentWalletSelectMode.WalletSelectedById(str);
        }
        CurrentWalletSelectMode currentWalletSelectMode = walletSelectedById;
        CurrentWalletSwitchNetworkMode.Ignored ignored = CurrentWalletSwitchNetworkMode.Ignored.OLrzqt;
        if (l != null) {
            l.longValue();
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.isConnected);
        } else {
            strAYXKKw = null;
        }
        xWX.TaskDescription.showCurrentWalletSwitchScreen$default(xwx, fragmentManager, new CurrentWalletSwitchConfig(currentWalletSelectMode, ignored, "", strAYXKKw, null, 1, null, null, 208, null), new Function2() { // from class: o.cUL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(cUH.KWHzl(l, (InterfaceC9738bbJ) obj, (java.lang.Long) obj2));
            }
        }, null, new Activity(interfaceC54857xXx, this), 8, null);
    }

    public static final boolean KWHzl(java.lang.Long l, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l2) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return ((AbstractC12782ctV) interfaceC9738bbJ).fZBcTu() && (l == null ? true : interfaceC9738bbJ.KWHzl(l));
    }

    public static final class Activity implements InterfaceC54855xXv {
        public final /* synthetic */ cUH AEQbTJ;
        public final /* synthetic */ InterfaceC54857xXx KWHzl;

        public Activity(InterfaceC54857xXx interfaceC54857xXx, cUH cuh) {
            this.KWHzl = interfaceC54857xXx;
            this.AEQbTJ = cuh;
        }

        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            InterfaceC54855xXv.ActionBar.EZpvd(this, interfaceC9738bbJ, j);
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, j);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault() {
            InterfaceC54855xXv.ActionBar.EZpvd(this);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(final InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            final cUH cuh = this.AEQbTJ;
            C32866mlf.onEvent$default("LinkedAccount_SelectWallet_SelectBar_Click", (TrackChannel[]) null, new Function1() { // from class: o.cUP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return cUH.Activity.KWHzl(interfaceC9738bbJ, cuh, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            this.KWHzl.OLrzqt(new WalletInfo(interfaceC9738bbJ.DbNXlk(), interfaceC9738bbJ.AYXKKw(), interfaceC9738bbJ.AkhnZx(), interfaceC9738bbJ.fJNWhG(), interfaceC9738bbJ.getNewProxyInstance(), "", interfaceC9738bbJ.AEQbTJ(), interfaceC9738bbJ));
        }

        public static final Unit KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, cUH cuh, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("select_account_id", interfaceC9738bbJ.DbNXlk(), false);
            eventParamsList.put("select_wallet_type", cuh.EZpvd(interfaceC9738bbJ), true);
            eventParamsList.put("select_wallet_name", interfaceC9738bbJ.AYXKKw(), false);
            eventParamsList.put("backup", "no", true);
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(final InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            final cUH cuh = this.AEQbTJ;
            C32866mlf.onEvent$default("LinkedAccount_SelectWallet_SelectBar_Click", (TrackChannel[]) null, new Function1() { // from class: o.cUR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return cUH.Activity.AEQbTJ(interfaceC9738bbJ, cuh, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }

        public static final Unit AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ, cUH cuh, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("select_account_id", interfaceC9738bbJ.DbNXlk(), false);
            eventParamsList.put("select_wallet_type", cuh.EZpvd(interfaceC9738bbJ), true);
            eventParamsList.put("select_wallet_name", interfaceC9738bbJ.AYXKKw(), false);
            eventParamsList.put("backup", "yes", true);
            return Unit.INSTANCE;
        }
    }

    public final java.lang.String EZpvd(InterfaceC9738bbJ interfaceC9738bbJ) {
        return interfaceC9738bbJ.AubY() ? "seed_phase" : Web3SecurityTrackEvent.VALUE_PRIVATE_KEY;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC54824xWr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C54834xXa c54834xXa, @NotNull Continuation<? super Result<C54837xXd>> continuation) throws java.lang.Throwable {
        BindWalletServiceImpl$signBindData$1 bindWalletServiceImpl$signBindData$1;
        if (continuation instanceof BindWalletServiceImpl$signBindData$1) {
            bindWalletServiceImpl$signBindData$1 = (BindWalletServiceImpl$signBindData$1) continuation;
            int i = bindWalletServiceImpl$signBindData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bindWalletServiceImpl$signBindData$1.label = i - Integer.MIN_VALUE;
            } else {
                bindWalletServiceImpl$signBindData$1 = new BindWalletServiceImpl$signBindData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = bindWalletServiceImpl$signBindData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bindWalletServiceImpl$signBindData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            BindWalletServiceImpl$signBindData$2 bindWalletServiceImpl$signBindData$2 = new BindWalletServiceImpl$signBindData$2(this, c54834xXa, fragmentManager, null);
            bindWalletServiceImpl$signBindData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, bindWalletServiceImpl$signBindData$2, bindWalletServiceImpl$signBindData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(AbstractC12782ctV abstractC12782ctV, java.lang.String str, C54834xXa c54834xXa, Continuation<? super C54837xXd> continuation) throws java.lang.Throwable {
        BindWalletServiceImpl$verifyWalletAddresses$1 bindWalletServiceImpl$verifyWalletAddresses$1;
        C54834xXa c54834xXa2;
        java.lang.Object objKWHzl;
        cUH cuh;
        OKServerException oKServerException;
        VerifyResp verifyResp;
        AbstractC12782ctV abstractC12782ctV2 = abstractC12782ctV;
        java.lang.String str2 = str;
        if (continuation instanceof BindWalletServiceImpl$verifyWalletAddresses$1) {
            bindWalletServiceImpl$verifyWalletAddresses$1 = (BindWalletServiceImpl$verifyWalletAddresses$1) continuation;
            int i = bindWalletServiceImpl$verifyWalletAddresses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bindWalletServiceImpl$verifyWalletAddresses$1.label = i - Integer.MIN_VALUE;
            } else {
                bindWalletServiceImpl$verifyWalletAddresses$1 = new BindWalletServiceImpl$verifyWalletAddresses$1(this, continuation);
            }
        }
        BindWalletServiceImpl$verifyWalletAddresses$1 bindWalletServiceImpl$verifyWalletAddresses$12 = bindWalletServiceImpl$verifyWalletAddresses$1;
        java.lang.Object obj = bindWalletServiceImpl$verifyWalletAddresses$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bindWalletServiceImpl$verifyWalletAddresses$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<C11283cIm> listEZpvd = this.gEmmrt.EZpvd(abstractC12782ctV2, str2, CollectionsKt___CollectionsKt.QKudOq(abstractC12782ctV.EZpvd()));
            C13934dbu c13934dbu = this.OLrzqt;
            java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
            java.lang.String strUSBtdM = abstractC12782ctV.USBtdM();
            java.lang.String strAUsmxb = abstractC12782ctV.aUsmxb();
            CreateWalletReqNew createWalletReqNew = new CreateWalletReqNew((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, C13058cyg.suppleAndGroupSignData$default(this.gEmmrt, abstractC12782ctV.DbNXlk(), abstractC12782ctV.EZpvd(), listEZpvd, false, 8, null), 0, 0L, abstractC12782ctV.DbNXlk(), false, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, (DefaultConstructorMarker) null);
            bindWalletServiceImpl$verifyWalletAddresses$12.L$0 = this;
            bindWalletServiceImpl$verifyWalletAddresses$12.L$1 = abstractC12782ctV2;
            bindWalletServiceImpl$verifyWalletAddresses$12.L$2 = str2;
            c54834xXa2 = c54834xXa;
            bindWalletServiceImpl$verifyWalletAddresses$12.L$3 = c54834xXa2;
            bindWalletServiceImpl$verifyWalletAddresses$12.label = 1;
            objKWHzl = c13934dbu.KWHzl(strDbNXlk, strUSBtdM, strAUsmxb, createWalletReqNew, bindWalletServiceImpl$verifyWalletAddresses$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            cuh = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C54834xXa c54834xXa3 = (C54834xXa) bindWalletServiceImpl$verifyWalletAddresses$12.L$3;
            str2 = (java.lang.String) bindWalletServiceImpl$verifyWalletAddresses$12.L$2;
            AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) bindWalletServiceImpl$verifyWalletAddresses$12.L$1;
            cUH cuh2 = (cUH) bindWalletServiceImpl$verifyWalletAddresses$12.L$0;
            C56391yDq.AEQbTJ(obj);
            c54834xXa2 = c54834xXa3;
            abstractC12782ctV2 = abstractC12782ctV3;
            cuh = cuh2;
            objKWHzl = obj;
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objKWHzl;
        if (abstractC43419rot.EZpvd() && (verifyResp = (VerifyResp) abstractC43419rot.copydefault()) != null && Intrinsics.EZpvd(verifyResp.getRes(), C56443yFo.KWHzl(true))) {
            pUU.EZpvd("BindWalletServiceImpl", "verifyWalletAddresses success");
            return cuh.copydefault(abstractC12782ctV2, str2, c54834xXa2.EZpvd());
        }
        pUU.EZpvd("BindWalletServiceImpl", "verifyWalletAddresses failed");
        AbstractC43419rot.ActionBar actionBar = abstractC43419rot instanceof AbstractC43419rot.ActionBar ? (AbstractC43419rot.ActionBar) abstractC43419rot : null;
        if (actionBar != null && (oKServerException = (OKServerException) actionBar.KWHzl()) != null && oKServerException.getCode() == 100071) {
            SignStatus signStatus = SignStatus.SyncFailed;
            java.lang.String message = ((OKServerException) actionBar.KWHzl()).getMessage();
            if (message == null) {
                message = "";
            }
            return new C54837xXd(signStatus, null, message, null, null, 26, null);
        }
        return new C54837xXd(SignStatus.SyncFailed, null, null, null, null, 30, null);
    }

    public final C54837xXd copydefault(AbstractC12782ctV abstractC12782ctV, java.lang.String str, java.lang.String str2) {
        SignStatus signStatus;
        C12762ctB c12762ctBGenerateBaseChainSign$default = C13058cyg.generateBaseChainSign$default(this.gEmmrt, abstractC12782ctV, str, str2, null, 8, null);
        if (c12762ctBGenerateBaseChainSign$default.copydefault().length() > 0 && c12762ctBGenerateBaseChainSign$default.KWHzl() != null && c12762ctBGenerateBaseChainSign$default.EZpvd() != null) {
            signStatus = SignStatus.Success;
        } else {
            signStatus = SignStatus.OtherError;
        }
        return new C54837xXd(signStatus, c12762ctBGenerateBaseChainSign$default.copydefault(), null, c12762ctBGenerateBaseChainSign$default.KWHzl(), c12762ctBGenerateBaseChainSign$default.EZpvd(), 4, null);
    }

    public final AbstractC58185ywX<Triple<SignStatus, java.lang.String, java.lang.String>> copydefault(final androidx.fragment.app.FragmentManager fragmentManager, final AbstractC12782ctV abstractC12782ctV) {
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.cUG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                cUH.OLrzqt(fragmentManager, abstractC12782ctV, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return C11607cUn.AEQbTJ(abstractC58185ywXKWHzl);
    }

    public static final Unit KWHzl(AbstractC12782ctV abstractC12782ctV, final InterfaceC58184ywW interfaceC58184ywW, final java.lang.String str) {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtValues;
        Intrinsics.checkNotNullParameter(str, "");
        if (abstractC12782ctV.AubY() || abstractC12782ctV.QVAiDq()) {
            abstractC58260yxtValues = abstractC12782ctV.values(str);
        } else {
            abstractC58260yxtValues = abstractC12782ctV.ejfBZ(str);
        }
        final Function1 function1 = new Function1() { // from class: o.cUS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cUH.copydefault(interfaceC58184ywW, str, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.String> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cUQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                cUH.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.cUM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cUH.OLrzqt(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtValues.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cUJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                cUH.KWHzl(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(InterfaceC58184ywW interfaceC58184ywW, java.lang.String str, java.lang.String str2) {
        Intrinsics.copydefault((java.lang.Object) str2);
        if (str2.length() > 0) {
            interfaceC58184ywW.onNext(new Triple(SignStatus.Success, str2, str));
        } else {
            pUU.copydefault("BindWalletServiceImpl", "showAndGetPhraseOrPrvKey empty");
            interfaceC58184ywW.onNext(new Triple(SignStatus.OtherError, "", ""));
        }
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        pUU.AEQbTJ("BindWalletServiceImpl", "showAndGetPhraseOrPrvKey error", th);
        interfaceC58184ywW.onNext(new Triple(SignStatus.OtherError, "", ""));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(InterfaceC58184ywW interfaceC58184ywW) {
        interfaceC58184ywW.onNext(new Triple(SignStatus.UserCancel, "", ""));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(androidx.fragment.app.FragmentManager fragmentManager, final AbstractC12782ctV abstractC12782ctV, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        new C14461dlr(fragmentManager, "bindWallet", new Function1() { // from class: o.cUK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cUH.KWHzl(abstractC12782ctV, interfaceC58184ywW, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.cUN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return cUH.AEQbTJ(interfaceC58184ywW);
            }
        }, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DAgZj), false).EZpvd();
    }

    public static final class StateListAnimator implements WalletUpdateWorker.TaskDescription {
        public final /* synthetic */ InterfaceC58184ywW<java.lang.Boolean> copydefault;

        public StateListAnimator(InterfaceC58184ywW<java.lang.Boolean> interfaceC58184ywW) {
            this.copydefault = interfaceC58184ywW;
        }

        @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
        public void KWHzl() {
            cUH.this.valueOf.EZpvd(this);
            this.copydefault.onNext(java.lang.Boolean.TRUE);
            this.copydefault.onComplete();
        }

        @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
        public void EZpvd(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            cUH.this.valueOf.EZpvd(this);
            this.copydefault.onNext(java.lang.Boolean.FALSE);
            this.copydefault.onComplete();
        }
    }

    public final AbstractC58185ywX<java.lang.Boolean> OLrzqt(final java.lang.String str, final java.lang.String str2) {
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.cUO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                cUH.EZpvd(this.AEQbTJ, str, str2, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void EZpvd(cUH cuh, java.lang.String str, java.lang.String str2, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        cuh.valueOf.KWHzl(cuh.new StateListAnimator(interfaceC58184ywW));
        cuh.valueOf.OLrzqt(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC54824xWr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C54834xXa c54834xXa, @NotNull Continuation<? super Result<C54837xXd>> continuation) throws java.lang.Throwable {
        BindWalletServiceImpl$signUnbindData$1 bindWalletServiceImpl$signUnbindData$1;
        if (continuation instanceof BindWalletServiceImpl$signUnbindData$1) {
            bindWalletServiceImpl$signUnbindData$1 = (BindWalletServiceImpl$signUnbindData$1) continuation;
            int i = bindWalletServiceImpl$signUnbindData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bindWalletServiceImpl$signUnbindData$1.label = i - Integer.MIN_VALUE;
            } else {
                bindWalletServiceImpl$signUnbindData$1 = new BindWalletServiceImpl$signUnbindData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = bindWalletServiceImpl$signUnbindData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bindWalletServiceImpl$signUnbindData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            BindWalletServiceImpl$signUnbindData$2 bindWalletServiceImpl$signUnbindData$2 = new BindWalletServiceImpl$signUnbindData$2(this, c54834xXa, fragmentManager, null);
            bindWalletServiceImpl$signUnbindData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, bindWalletServiceImpl$signUnbindData$2, bindWalletServiceImpl$signUnbindData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[Catch: all -> 0x00aa, CancellationException -> 0x00c3, TryCatch #2 {CancellationException -> 0x00c3, all -> 0x00aa, blocks: (B:13:0x002e, B:28:0x007a, B:30:0x0086, B:38:0x009d, B:31:0x0089, B:33:0x008f, B:34:0x0092, B:36:0x0098, B:37:0x009b, B:18:0x0042, B:25:0x005f, B:21:0x0049), top: B:48:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[Catch: all -> 0x00aa, CancellationException -> 0x00c3, TryCatch #2 {CancellationException -> 0x00c3, all -> 0x00aa, blocks: (B:13:0x002e, B:28:0x007a, B:30:0x0086, B:38:0x009d, B:31:0x0089, B:33:0x008f, B:34:0x0092, B:36:0x0098, B:37:0x009b, B:18:0x0042, B:25:0x005f, B:21:0x0049), top: B:48:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(C54834xXa c54834xXa, Continuation<? super Result<PreCheckResult>> continuation) throws java.lang.Throwable {
        BindWalletServiceImpl$preCheckSignStatus$1 bindWalletServiceImpl$preCheckSignStatus$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        cUH cuh;
        SignStatus signStatus;
        if (continuation instanceof BindWalletServiceImpl$preCheckSignStatus$1) {
            bindWalletServiceImpl$preCheckSignStatus$1 = (BindWalletServiceImpl$preCheckSignStatus$1) continuation;
            int i = bindWalletServiceImpl$preCheckSignStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bindWalletServiceImpl$preCheckSignStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                bindWalletServiceImpl$preCheckSignStatus$1 = new BindWalletServiceImpl$preCheckSignStatus$1(this, continuation);
            }
        }
        java.lang.Object objAwait = bindWalletServiceImpl$preCheckSignStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bindWalletServiceImpl$preCheckSignStatus$1.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            Result.Application application2 = Result.Companion;
            AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
            bindWalletServiceImpl$preCheckSignStatus$1.L$0 = this;
            bindWalletServiceImpl$preCheckSignStatus$1.L$1 = c54834xXa;
            bindWalletServiceImpl$preCheckSignStatus$1.label = 1;
            if (AwaitKt.awaitFirst(abstractC58185ywXEnsureInitialized$default, bindWalletServiceImpl$preCheckSignStatus$1) == objCopydefault) {
                return objCopydefault;
            }
            cuh = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c54834xXa = (C54834xXa) bindWalletServiceImpl$preCheckSignStatus$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objAwait;
                if (c54834xXa.EZpvd().length() != 0) {
                    signStatus = SignStatus.SignDataEmpty;
                } else if (!abstractC12782ctV.zLjUOn()) {
                    signStatus = SignStatus.AccountNotBackup;
                } else if (abstractC12782ctV.fZBcTu()) {
                    signStatus = SignStatus.Success;
                } else {
                    signStatus = SignStatus.AccountNotSupport;
                }
                Intrinsics.copydefault(abstractC12782ctV);
                objM7377constructorimpl = Result.m7377constructorimpl(new PreCheckResult(signStatus, abstractC12782ctV));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("BindWalletServiceImpl", "preCheckSignStatus onFailure", thM7380exceptionOrNullimpl);
                }
                return objM7377constructorimpl;
            }
            c54834xXa = (C54834xXa) bindWalletServiceImpl$preCheckSignStatus$1.L$1;
            cuh = (cUH) bindWalletServiceImpl$preCheckSignStatus$1.L$0;
            C56391yDq.AEQbTJ(objAwait);
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtAEQbTJ = cuh.AYXKKw.AhwBna().AEQbTJ(c54834xXa.KWHzl(), false);
        bindWalletServiceImpl$preCheckSignStatus$1.L$0 = c54834xXa;
        bindWalletServiceImpl$preCheckSignStatus$1.L$1 = null;
        bindWalletServiceImpl$preCheckSignStatus$1.label = 2;
        objAwait = RxAwaitKt.await(abstractC58260yxtAEQbTJ, bindWalletServiceImpl$preCheckSignStatus$1);
        if (objAwait == objCopydefault) {
            return objCopydefault;
        }
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) objAwait;
        if (c54834xXa.EZpvd().length() != 0) {
        }
        Intrinsics.copydefault(abstractC12782ctV2);
        objM7377constructorimpl = Result.m7377constructorimpl(new PreCheckResult(signStatus, abstractC12782ctV2));
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return objM7377constructorimpl;
    }

    @Override // o.InterfaceC54824xWr
    public java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return KWHzl().copydefault(str, str2);
    }

    @Override // o.InterfaceC54824xWr
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objKWHzl = C17304fAj.EZpvd.KWHzl(str, abstractActivityC33041mov, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }
}
