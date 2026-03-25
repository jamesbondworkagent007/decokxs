package com.okinc.business.defi.wallet.mine.walletbind.viewmodel;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.Intention;
import com.okinc.wallet.api.bean.WalletInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C19333fzM;
import o.C19339fzS;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54824xWr;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindCeFiDetailsConfirmViewModel$onConfirmClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ Intention $intention;
    final /* synthetic */ String $nonce;
    final /* synthetic */ String $packageName;
    final /* synthetic */ String $publicKey;
    final /* synthetic */ String $uid;
    final /* synthetic */ String $verifyToken;
    final /* synthetic */ WalletInfo $walletInfo;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ WalletBindCeFiDetailsConfirmViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindCeFiDetailsConfirmViewModel$onConfirmClicked$1(WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel, WalletInfo walletInfo, FragmentManager fragmentManager, String str, String str2, String str3, String str4, String str5, Intention intention, Continuation<? super WalletBindCeFiDetailsConfirmViewModel$onConfirmClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = walletBindCeFiDetailsConfirmViewModel;
        this.$walletInfo = walletInfo;
        this.$fragmentManager = fragmentManager;
        this.$nonce = str;
        this.$uid = str2;
        this.$verifyToken = str3;
        this.$publicKey = str4;
        this.$packageName = str5;
        this.$intention = intention;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletBindCeFiDetailsConfirmViewModel$onConfirmClicked$1 walletBindCeFiDetailsConfirmViewModel$onConfirmClicked$1 = new WalletBindCeFiDetailsConfirmViewModel$onConfirmClicked$1(this.this$0, this.$walletInfo, this.$fragmentManager, this.$nonce, this.$uid, this.$verifyToken, this.$publicKey, this.$packageName, this.$intention, continuation);
        walletBindCeFiDetailsConfirmViewModel$onConfirmClicked$1.L$0 = obj;
        return walletBindCeFiDetailsConfirmViewModel$onConfirmClicked$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBindCeFiDetailsConfirmViewModel$onConfirmClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x029c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7 A[Catch: all -> 0x0230, TryCatch #0 {all -> 0x0230, blocks: (B:34:0x00ea, B:38:0x00f3, B:40:0x00f7, B:42:0x00fb, B:44:0x0110, B:47:0x0118, B:51:0x0129, B:53:0x012d, B:30:0x00cb), top: B:106:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0172 A[Catch: all -> 0x0228, TryCatch #2 {all -> 0x0228, blocks: (B:87:0x0225, B:91:0x022b, B:79:0x01e4, B:81:0x01ea, B:84:0x0210, B:61:0x016c, B:63:0x0172, B:65:0x0192, B:55:0x0142, B:68:0x01ab, B:69:0x01b5, B:71:0x01bb, B:73:0x01c3, B:76:0x01dc, B:77:0x01e1), top: B:108:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea A[Catch: all -> 0x0228, TryCatch #2 {all -> 0x0228, blocks: (B:87:0x0225, B:91:0x022b, B:79:0x01e4, B:81:0x01ea, B:84:0x0210, B:61:0x016c, B:63:0x0172, B:65:0x0192, B:55:0x0142, B:68:0x01ab, B:69:0x01b5, B:71:0x01bb, B:73:0x01c3, B:76:0x01dc, B:77:0x01e1), top: B:108:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0245  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        String str2;
        WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel;
        String str3;
        String strCopydefault;
        String str4;
        Intention intention;
        String str5;
        String str6;
        Object objEZpvd;
        String str7;
        Object objM7386unboximpl;
        String str8;
        WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel2;
        C19333fzM.Application application;
        Object objAEQbTJ;
        WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel3;
        Object obj2;
        Object obj3;
        Throwable thM7380exceptionOrNullimpl2;
        Throwable thM7380exceptionOrNullimpl3;
        Unit unit;
        Object objCopydefault = C56442yFn.copydefault();
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            str = "[OKX APP-Bind Wallet]";
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                MutableSharedFlow mutableSharedFlow2 = this.this$0.KWHzl;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                WalletInfo walletInfo = this.$walletInfo;
                FragmentManager fragmentManager = this.$fragmentManager;
                String str9 = this.$nonce;
                String str10 = this.$uid;
                str2 = this.$verifyToken;
                walletBindCeFiDetailsConfirmViewModel = this.this$0;
                str3 = this.$publicKey;
                String str11 = this.$packageName;
                Intention intention2 = this.$intention;
                Result.Application application2 = Result.Companion;
                String strKWHzl = walletInfo.KWHzl();
                String strOLrzqt = walletInfo.OLrzqt();
                strCopydefault = walletInfo.copydefault();
                if (strCopydefault == null) {
                    strCopydefault = "";
                }
                str4 = "";
                intention = intention2;
                str5 = "[OKX APP-Bind Wallet]";
                str6 = str11;
                try {
                    C19333fzM.Activity activity = new C19333fzM.Activity(strKWHzl, strOLrzqt, strCopydefault, fragmentManager, str9, str10, str2);
                    C19333fzM c19333fzM = walletBindCeFiDetailsConfirmViewModel.fARcdN;
                    this.L$0 = str2;
                    this.L$1 = walletBindCeFiDetailsConfirmViewModel;
                    this.L$2 = str3;
                    this.L$3 = str6;
                    this.L$4 = intention;
                    this.label = 2;
                    objEZpvd = c19333fzM.EZpvd(activity, this);
                } catch (Throwable th3) {
                    th = th3;
                    str = str5;
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                str7 = str3;
                objM7386unboximpl = objEZpvd;
                str8 = str2;
                walletBindCeFiDetailsConfirmViewModel2 = walletBindCeFiDetailsConfirmViewModel;
                application = (C19333fzM.Application) (!Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
                if (application != null) {
                    str = str5;
                } else if (application instanceof C19333fzM.Application.StateListAnimator) {
                    String strKWHzl2 = ((InterfaceC54824xWr) C43251rlk.copydefault(InterfaceC54824xWr.class)).KWHzl(((C19333fzM.Application.StateListAnimator) application).copydefault(), str7);
                    if (strKWHzl2 != null && strKWHzl2.length() != 0) {
                        objAEQbTJ = walletBindCeFiDetailsConfirmViewModel2.gEmmrt.AEQbTJ(str6, strKWHzl2, intention, str8);
                        String str12 = (String) (Result.m7383isFailureimpl(objAEQbTJ) ? null : objAEQbTJ);
                        if (str12 != null) {
                            str = str5;
                            C19339fzS.EZpvd.OLrzqt(str, "get deeplink succeed, deeplink:" + application);
                            MutableSharedFlow mutableSharedFlow3 = walletBindCeFiDetailsConfirmViewModel2.OLrzqt;
                            Pair pair = new Pair(str12, str6);
                            this.L$0 = walletBindCeFiDetailsConfirmViewModel2;
                            this.L$1 = objM7386unboximpl;
                            this.L$2 = objAEQbTJ;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 3;
                            if (mutableSharedFlow3.emit(pair, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            walletBindCeFiDetailsConfirmViewModel3 = walletBindCeFiDetailsConfirmViewModel2;
                            obj2 = objM7386unboximpl;
                            obj3 = objAEQbTJ;
                            objAEQbTJ = obj3;
                            objM7386unboximpl = obj2;
                            walletBindCeFiDetailsConfirmViewModel2 = walletBindCeFiDetailsConfirmViewModel3;
                            thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objAEQbTJ);
                            if (thM7380exceptionOrNullimpl2 != null) {
                                C19339fzS.EZpvd.OLrzqt(str, "get deeplink failed, deeplink:" + thM7380exceptionOrNullimpl2.getMessage());
                                String message = thM7380exceptionOrNullimpl2.getMessage();
                                if (message != null) {
                                    MutableSharedFlow mutableSharedFlow4 = walletBindCeFiDetailsConfirmViewModel2.copydefault;
                                    this.L$0 = walletBindCeFiDetailsConfirmViewModel2;
                                    this.L$1 = objM7386unboximpl;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.label = 4;
                                    if (mutableSharedFlow4.emit(message, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                            }
                        } else {
                            str = str5;
                            thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objAEQbTJ);
                            if (thM7380exceptionOrNullimpl2 != null) {
                            }
                        }
                    }
                    str = str5;
                    C19339fzS.EZpvd.OLrzqt(str, "get deeplink failed, encryptedData is empty");
                } else {
                    str = str5;
                    if (!(application instanceof C19333fzM.Application.Activity)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String strCopydefault2 = ((C19333fzM.Application.Activity) application).copydefault();
                    if (strCopydefault2 != null) {
                        MutableSharedFlow mutableSharedFlow5 = walletBindCeFiDetailsConfirmViewModel2.AYXKKw;
                        this.L$0 = walletBindCeFiDetailsConfirmViewModel2;
                        this.L$1 = objM7386unboximpl;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 5;
                        if (mutableSharedFlow5.emit(strCopydefault2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                thM7380exceptionOrNullimpl3 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl3 != null) {
                    unit = null;
                    objM7377constructorimpl = Result.m7377constructorimpl(unit);
                    WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel4 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    mutableSharedFlow = this.this$0.KWHzl;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 8;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                C19339fzS.EZpvd.OLrzqt(str, "get deeplink failed,sign data failed, deeplink:" + thM7380exceptionOrNullimpl3.getMessage());
                MutableSharedFlow mutableSharedFlow6 = walletBindCeFiDetailsConfirmViewModel2.AYXKKw;
                String message2 = thM7380exceptionOrNullimpl3.getMessage();
                if (message2 == null) {
                    message2 = str4;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 6;
                if (mutableSharedFlow6.emit(message2, this) == objCopydefault) {
                    return objCopydefault;
                }
                unit = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel42 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    C19339fzS.EZpvd.OLrzqt(str, "confirm bind message failed:" + thM7380exceptionOrNullimpl.getMessage());
                    MutableSharedFlow mutableSharedFlow7 = walletBindCeFiDetailsConfirmViewModel42.AEQbTJ;
                    String message3 = thM7380exceptionOrNullimpl.getMessage();
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 7;
                    if (mutableSharedFlow7.emit(message3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 8;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                WalletInfo walletInfo2 = this.$walletInfo;
                FragmentManager fragmentManager2 = this.$fragmentManager;
                String str92 = this.$nonce;
                String str102 = this.$uid;
                str2 = this.$verifyToken;
                walletBindCeFiDetailsConfirmViewModel = this.this$0;
                str3 = this.$publicKey;
                String str112 = this.$packageName;
                Intention intention22 = this.$intention;
                Result.Application application22 = Result.Companion;
                String strKWHzl3 = walletInfo2.KWHzl();
                String strOLrzqt2 = walletInfo2.OLrzqt();
                strCopydefault = walletInfo2.copydefault();
                if (strCopydefault == null) {
                }
                str4 = "";
                intention = intention22;
                str5 = "[OKX APP-Bind Wallet]";
                str6 = str112;
                C19333fzM.Activity activity2 = new C19333fzM.Activity(strKWHzl3, strOLrzqt2, strCopydefault, fragmentManager2, str92, str102, str2);
                C19333fzM c19333fzM2 = walletBindCeFiDetailsConfirmViewModel.fARcdN;
                this.L$0 = str2;
                this.L$1 = walletBindCeFiDetailsConfirmViewModel;
                this.L$2 = str3;
                this.L$3 = str6;
                this.L$4 = intention;
                this.label = 2;
                objEZpvd = c19333fzM2.EZpvd(activity2, this);
                if (objEZpvd != objCopydefault) {
                }
                break;
            case 2:
                Intention intention3 = (Intention) this.L$4;
                String str13 = (String) this.L$3;
                str7 = (String) this.L$2;
                WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel5 = (WalletBindCeFiDetailsConfirmViewModel) this.L$1;
                str8 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str4 = "";
                str5 = "[OKX APP-Bind Wallet]";
                str6 = str13;
                walletBindCeFiDetailsConfirmViewModel2 = walletBindCeFiDetailsConfirmViewModel5;
                intention = intention3;
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                application = (C19333fzM.Application) (!Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
                if (application != null) {
                }
                thM7380exceptionOrNullimpl3 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl3 != null) {
                }
                break;
            case 3:
                obj3 = this.L$2;
                obj2 = this.L$1;
                walletBindCeFiDetailsConfirmViewModel3 = (WalletBindCeFiDetailsConfirmViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str4 = "";
                str = "[OKX APP-Bind Wallet]";
                objAEQbTJ = obj3;
                objM7386unboximpl = obj2;
                walletBindCeFiDetailsConfirmViewModel2 = walletBindCeFiDetailsConfirmViewModel3;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objAEQbTJ);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                thM7380exceptionOrNullimpl3 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl3 != null) {
                }
                break;
            case 4:
            case 5:
                objM7386unboximpl = this.L$1;
                walletBindCeFiDetailsConfirmViewModel2 = (WalletBindCeFiDetailsConfirmViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str4 = "";
                str = "[OKX APP-Bind Wallet]";
                thM7380exceptionOrNullimpl3 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl3 != null) {
                }
                break;
            case 6:
                C56391yDq.AEQbTJ(obj);
                str = "[OKX APP-Bind Wallet]";
                unit = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel422 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 8;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 8;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 8:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
