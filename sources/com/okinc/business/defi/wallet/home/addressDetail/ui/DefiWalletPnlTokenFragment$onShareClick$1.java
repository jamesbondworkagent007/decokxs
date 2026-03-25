package com.okinc.business.defi.wallet.home.addressDetail.ui;

import androidx.fragment.app.Fragment;
import com.okinc.business.defi.wallet.home.addressDetail.utils.WalletTokenPnlShareInfo;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.WalletSelfAddressCheckerViewModel;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.WalletSharePnlTokenViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C15852eXr;
import o.C15911eZw;
import o.C16601emx;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC13655dTj;
import o.eWR;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletPnlTokenFragment$onShareClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ eWR $tokenDetailUiModel;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ C15852eXr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletPnlTokenFragment$onShareClick$1(C15852eXr c15852eXr, eWR ewr, Continuation<? super DefiWalletPnlTokenFragment$onShareClick$1> continuation) {
        super(2, continuation);
        this.this$0 = c15852eXr;
        this.$tokenDetailUiModel = ewr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletPnlTokenFragment$onShareClick$1(this.this$0, this.$tokenDetailUiModel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletPnlTokenFragment$onShareClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0187  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        Object objAEQbTJ;
        C15852eXr c15852eXr;
        eWR ewr;
        WalletTokenPnlShareInfo walletTokenPnlShareInfo;
        Object objEZpvd;
        String str;
        C15852eXr c15852eXr2;
        Fragment fragment;
        String str2;
        Throwable thM7380exceptionOrNullimpl;
        Object objOLrzqt;
        String str3 = "wallet";
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        C16601emx c16601emx = null;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.DbNXlk == 1) {
                this.this$0.isConnected().AEQbTJ(true);
            } else {
                C16601emx c16601emx2 = this.this$0.gEmmrt;
                if (c16601emx2 == null) {
                    Intrinsics.gEmmrt("");
                    c16601emx2 = null;
                }
                c16601emx2.KWHzl.setVisibility(0);
                C16601emx c16601emx3 = this.this$0.gEmmrt;
                if (c16601emx3 == null) {
                    Intrinsics.gEmmrt("");
                    c16601emx3 = null;
                }
                c16601emx3.KWHzl.KWHzl(0L);
            }
            C15852eXr c15852eXr3 = this.this$0;
            Result.Application application3 = Result.Companion;
            WalletSelfAddressCheckerViewModel walletSelfAddressCheckerViewModelDbNXlk = c15852eXr3.DbNXlk();
            String str4 = c15852eXr3.AEQbTJ;
            this.label = 1;
            objOLrzqt = walletSelfAddressCheckerViewModelDbNXlk.OLrzqt(str4, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ewr = (eWR) this.L$1;
                    c15852eXr = (C15852eXr) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objAEQbTJ = ((Result) obj).m7386unboximpl();
                    if (Result.m7383isFailureimpl(objAEQbTJ)) {
                        objAEQbTJ = null;
                    }
                    walletTokenPnlShareInfo = (WalletTokenPnlShareInfo) objAEQbTJ;
                    String strEZpvd = ewr.EZpvd();
                    String strAhwBna = ewr.AhwBna();
                    WalletSharePnlTokenViewModel walletSharePnlTokenViewModelEZpvd = c15852eXr.EZpvd();
                    this.L$0 = c15852eXr;
                    this.L$1 = walletTokenPnlShareInfo;
                    this.L$2 = "wallet";
                    this.L$3 = strAhwBna;
                    this.L$4 = strEZpvd;
                    this.L$5 = c15852eXr;
                    this.label = 3;
                    objEZpvd = walletSharePnlTokenViewModelEZpvd.EZpvd(this);
                    if (objEZpvd != objCopydefault) {
                        return objCopydefault;
                    }
                    str = strAhwBna;
                    c15852eXr2 = c15852eXr;
                    fragment = c15852eXr2;
                    str2 = strEZpvd;
                    WalletTokenPnlShareInfo walletTokenPnlShareInfo2 = walletTokenPnlShareInfo;
                    String str5 = str3;
                    if (Result.m7383isFailureimpl(objEZpvd)) {
                    }
                    C15911eZw.AEQbTJ(fragment, str2, str, str5, walletTokenPnlShareInfo2, (String) objEZpvd, new Application(c15852eXr2));
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    C15852eXr c15852eXr4 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Fragment fragment2 = (Fragment) this.L$5;
                String str6 = (String) this.L$4;
                String str7 = (String) this.L$3;
                str3 = (String) this.L$2;
                walletTokenPnlShareInfo = (WalletTokenPnlShareInfo) this.L$1;
                c15852eXr2 = (C15852eXr) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                fragment = fragment2;
                str2 = str6;
                str = str7;
                WalletTokenPnlShareInfo walletTokenPnlShareInfo22 = walletTokenPnlShareInfo;
                String str52 = str3;
                if (Result.m7383isFailureimpl(objEZpvd)) {
                    objEZpvd = "";
                }
                C15911eZw.AEQbTJ(fragment, str2, str, str52, walletTokenPnlShareInfo22, (String) objEZpvd, new Application(c15852eXr2));
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                C15852eXr c15852eXr42 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    if (c15852eXr42.DbNXlk == 1) {
                        c15852eXr42.isConnected().AEQbTJ(false);
                    } else {
                        C16601emx c16601emx4 = c15852eXr42.gEmmrt;
                        if (c16601emx4 == null) {
                            Intrinsics.gEmmrt("");
                            c16601emx4 = null;
                        }
                        c16601emx4.KWHzl.copydefault();
                        C16601emx c16601emx5 = c15852eXr42.gEmmrt;
                        if (c16601emx5 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            c16601emx = c16601emx5;
                        }
                        c16601emx.KWHzl.setVisibility(8);
                    }
                    pUU.copydefault(c15852eXr42.getTAG(), "onShareClick error message = " + thM7380exceptionOrNullimpl.getMessage());
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        objM7377constructorimpl2 = Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) objOLrzqt).booleanValue()));
        C15852eXr c15852eXr5 = this.this$0;
        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
        if (thM7380exceptionOrNullimpl2 != null) {
            pUU.AEQbTJ(c15852eXr5.getTAG(), "sendProfilePnlShareClickEvent: ", thM7380exceptionOrNullimpl2);
            objM7377constructorimpl2 = null;
        }
        this.this$0.OLrzqt((Boolean) objM7377constructorimpl2, this.$tokenDetailUiModel);
        C15852eXr c15852eXr6 = this.this$0;
        eWR ewr2 = this.$tokenDetailUiModel;
        Result.Application application4 = Result.Companion;
        WalletSharePnlTokenViewModel walletSharePnlTokenViewModelEZpvd2 = c15852eXr6.EZpvd();
        String strEZpvd2 = ewr2.EZpvd();
        String strAhwBna2 = ewr2.AhwBna();
        String str8 = c15852eXr6.AEQbTJ;
        this.L$0 = c15852eXr6;
        this.L$1 = ewr2;
        this.label = 2;
        objAEQbTJ = walletSharePnlTokenViewModelEZpvd2.AEQbTJ(strEZpvd2, strAhwBna2, "", str8, this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        c15852eXr = c15852eXr6;
        ewr = ewr2;
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
        }
        walletTokenPnlShareInfo = (WalletTokenPnlShareInfo) objAEQbTJ;
        String strEZpvd3 = ewr.EZpvd();
        String strAhwBna3 = ewr.AhwBna();
        WalletSharePnlTokenViewModel walletSharePnlTokenViewModelEZpvd3 = c15852eXr.EZpvd();
        this.L$0 = c15852eXr;
        this.L$1 = walletTokenPnlShareInfo;
        this.L$2 = "wallet";
        this.L$3 = strAhwBna3;
        this.L$4 = strEZpvd3;
        this.L$5 = c15852eXr;
        this.label = 3;
        objEZpvd = walletSharePnlTokenViewModelEZpvd3.EZpvd(this);
        if (objEZpvd != objCopydefault) {
        }
    }

    public static final class Application implements InterfaceC13655dTj {
        public final /* synthetic */ C15852eXr OLrzqt;

        @Override // o.InterfaceC13655dTj
        public void copydefault() {
        }

        public Application(C15852eXr c15852eXr) {
            this.OLrzqt = c15852eXr;
        }

        @Override // o.InterfaceC13655dTj
        public void AEQbTJ() {
            if (this.OLrzqt.DbNXlk == 1) {
                this.OLrzqt.isConnected().AEQbTJ(false);
                return;
            }
            C16601emx c16601emx = this.OLrzqt.gEmmrt;
            C16601emx c16601emx2 = null;
            if (c16601emx == null) {
                Intrinsics.gEmmrt("");
                c16601emx = null;
            }
            c16601emx.KWHzl.copydefault();
            C16601emx c16601emx3 = this.OLrzqt.gEmmrt;
            if (c16601emx3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16601emx2 = c16601emx3;
            }
            c16601emx2.KWHzl.setVisibility(8);
        }
    }
}
