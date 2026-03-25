package o;

import com.okinc.auth.impl.mfa.domain.ApproveCrossDeviceVerificationUseCase$getData$1;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.auth.impl.passkey.model.DecisionInHouseAuthenticationRequest;
import com.okinc.auth.impl.passkey.model.FinishInHouseAuthenticationRequest;
import com.okinc.auth.impl.passkey.model.FinishInHouseAuthenticationResponse;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import com.okinc.auth.impl.passkey.model.StartInHouseAuthenticationRequest;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C5695aBN;
import o.InterfaceC5693aBL;
import org.jetbrains.annotations.NotNull;
import uniffi.account.UpgradeType;

/* JADX INFO: renamed from: o.aBX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5705aBX extends AbstractC5726aBs<ActionBar, Activity> {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final C5945aFz AEQbTJ;
    public final C58893zTh AhwBna;
    public final CoroutineDispatcher KWHzl;
    public final PasskeyApiService copydefault;
    public final C5695aBN djBIcL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C5705aBX(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService, @NotNull C5695aBN c5695aBN, @NotNull C5945aFz c5945aFz, @NotNull C58893zTh c58893zTh) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(c5695aBN, "");
        Intrinsics.checkNotNullParameter(c5945aFz, "");
        Intrinsics.checkNotNullParameter(c58893zTh, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = passkeyApiService;
        this.djBIcL = c5695aBN;
        this.AEQbTJ = c5945aFz;
        this.AhwBna = c58893zTh;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x0092 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: o.aBX$ActionBar */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161 A[Catch: OKServerException -> 0x0092, TryCatch #0 {OKServerException -> 0x0092, blocks: (B:87:0x024a, B:22:0x005f, B:60:0x018b, B:62:0x0193, B:64:0x0199, B:66:0x01a1, B:68:0x01a7, B:89:0x025b, B:25:0x006c, B:50:0x0152, B:54:0x015b, B:56:0x0161, B:91:0x0265, B:93:0x0269, B:95:0x0299, B:96:0x029d, B:98:0x02a5, B:99:0x02a9, B:101:0x02ad, B:102:0x02c0, B:104:0x02c8, B:105:0x02cc, B:106:0x02d1, B:107:0x02d2, B:109:0x02d6, B:110:0x0303, B:112:0x030b, B:114:0x031b, B:116:0x0321, B:117:0x0325, B:119:0x0345, B:120:0x034a, B:28:0x007f, B:46:0x0123, B:31:0x008c), top: B:131:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e4 A[Catch: OKServerException -> 0x0247, TryCatch #3 {OKServerException -> 0x0247, blocks: (B:16:0x0041, B:72:0x01d8, B:76:0x01e0, B:78:0x01e4, B:80:0x020f, B:82:0x0215), top: B:136:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020f A[Catch: OKServerException -> 0x0247, TryCatch #3 {OKServerException -> 0x0247, blocks: (B:16:0x0041, B:72:0x01d8, B:76:0x01e0, B:78:0x01e4, B:80:0x020f, B:82:0x0215), top: B:136:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0265 A[Catch: OKServerException -> 0x0092, TryCatch #0 {OKServerException -> 0x0092, blocks: (B:87:0x024a, B:22:0x005f, B:60:0x018b, B:62:0x0193, B:64:0x0199, B:66:0x01a1, B:68:0x01a7, B:89:0x025b, B:25:0x006c, B:50:0x0152, B:54:0x015b, B:56:0x0161, B:91:0x0265, B:93:0x0269, B:95:0x0299, B:96:0x029d, B:98:0x02a5, B:99:0x02a9, B:101:0x02ad, B:102:0x02c0, B:104:0x02c8, B:105:0x02cc, B:106:0x02d1, B:107:0x02d2, B:109:0x02d6, B:110:0x0303, B:112:0x030b, B:114:0x031b, B:116:0x0321, B:117:0x0325, B:119:0x0345, B:120:0x034a, B:28:0x007f, B:46:0x0123, B:31:0x008c), top: B:131:0x002d }] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // o.AbstractC5726aBs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull ActionBar actionBar, @NotNull Continuation<? super Activity> continuation) throws java.lang.Throwable {
        ApproveCrossDeviceVerificationUseCase$getData$1 approveCrossDeviceVerificationUseCase$getData$1;
        ActionBar actionBar2;
        C5705aBX c5705aBX;
        C5705aBX c5705aBX2;
        ActionBar actionBar3;
        java.lang.Object objKWHzl;
        C5705aBX c5705aBX3;
        C5695aBN.ActionBar actionBar4;
        C5705aBX c5705aBX4;
        ResponseData responseData;
        RegistrationStartResponse registrationStartResponseOLrzqt;
        java.lang.Object objAEQbTJ;
        ActionBar actionBar5;
        C5705aBX c5705aBX5;
        if (continuation instanceof ApproveCrossDeviceVerificationUseCase$getData$1) {
            approveCrossDeviceVerificationUseCase$getData$1 = (ApproveCrossDeviceVerificationUseCase$getData$1) continuation;
            int i = approveCrossDeviceVerificationUseCase$getData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                approveCrossDeviceVerificationUseCase$getData$1.label = i - Integer.MIN_VALUE;
            } else {
                approveCrossDeviceVerificationUseCase$getData$1 = new ApproveCrossDeviceVerificationUseCase$getData$1(this, continuation);
            }
        }
        java.lang.Object objFinishInHouseAuthentication = approveCrossDeviceVerificationUseCase$getData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        ActionBar actionBar6 = approveCrossDeviceVerificationUseCase$getData$1.label;
        java.lang.Object obj = null;
        try {
            if (actionBar6 == 0) {
                C56391yDq.AEQbTJ(objFinishInHouseAuthentication);
                pUU.KWHzl("ApproveCrossDeviceVerificationUseCase", "getData() STARTED - timestamp=" + java.lang.System.currentTimeMillis() + ", sessionId=" + C59454zhO.AkhnZx(actionBar.OLrzqt(), 20));
                try {
                    C5882aEp.KWHzl.KWHzl(actionBar.EZpvd(), "start approve cross device verification, crossDevicePasskeySessionId=" + actionBar.OLrzqt());
                    DecisionInHouseAuthenticationRequest decisionInHouseAuthenticationRequest = new DecisionInHouseAuthenticationRequest(actionBar.OLrzqt(), "APPROVE");
                    PasskeyApiService passkeyApiService = this.copydefault;
                    approveCrossDeviceVerificationUseCase$getData$1.L$0 = this;
                    actionBar2 = actionBar;
                    try {
                        approveCrossDeviceVerificationUseCase$getData$1.L$1 = actionBar2;
                        approveCrossDeviceVerificationUseCase$getData$1.label = 1;
                        if (passkeyApiService.decisionInHouseAuthentication(decisionInHouseAuthenticationRequest, approveCrossDeviceVerificationUseCase$getData$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        c5705aBX = this;
                    } catch (OKServerException e) {
                        e = e;
                        actionBar6 = actionBar2;
                        C5882aEp.KWHzl.KWHzl(actionBar6.EZpvd(), "approve cross device verification error, code=" + e.getCode() + ", error=" + e.getMessage());
                        if (e.getCode() == 3030) {
                        }
                    }
                } catch (OKServerException e2) {
                    e = e2;
                    actionBar2 = actionBar;
                    actionBar6 = actionBar2;
                    C5882aEp.KWHzl.KWHzl(actionBar6.EZpvd(), "approve cross device verification error, code=" + e.getCode() + ", error=" + e.getMessage());
                    if (e.getCode() == 3030) {
                        return Activity.ActionBar.KWHzl;
                    }
                    return new Activity.C0809Activity(e.getMessage());
                }
            } else if (actionBar6 == 1) {
                ActionBar actionBar7 = (ActionBar) approveCrossDeviceVerificationUseCase$getData$1.L$1;
                C5705aBX c5705aBX6 = (C5705aBX) approveCrossDeviceVerificationUseCase$getData$1.L$0;
                C56391yDq.AEQbTJ(objFinishInHouseAuthentication);
                c5705aBX = c5705aBX6;
                actionBar2 = actionBar7;
            } else if (actionBar6 == 2) {
                actionBar3 = (ActionBar) approveCrossDeviceVerificationUseCase$getData$1.L$1;
                c5705aBX2 = (C5705aBX) approveCrossDeviceVerificationUseCase$getData$1.L$0;
                C56391yDq.AEQbTJ(objFinishInHouseAuthentication);
                java.lang.Object data = ((ResponseData) objFinishInHouseAuthentication).getData();
                Intrinsics.copydefault(data);
                C5882aEp.KWHzl.KWHzl(actionBar3.EZpvd(), "start in house authentication api success");
                C5695aBN.Application application = new C5695aBN.Application(actionBar3.copydefault(), (AuthenticationStartResponse) data);
                C5695aBN c5695aBN = c5705aBX2.djBIcL;
                approveCrossDeviceVerificationUseCase$getData$1.L$0 = c5705aBX2;
                approveCrossDeviceVerificationUseCase$getData$1.L$1 = actionBar3;
                approveCrossDeviceVerificationUseCase$getData$1.label = 3;
                objKWHzl = c5695aBN.KWHzl(application, (Continuation) approveCrossDeviceVerificationUseCase$getData$1);
                if (objKWHzl != objCopydefault) {
                    return objCopydefault;
                }
                c5705aBX3 = c5705aBX2;
                actionBar4 = (C5695aBN.ActionBar) (!Result.m7383isFailureimpl(objKWHzl) ? null : objKWHzl);
                if (!(actionBar4 instanceof C5695aBN.ActionBar.C0808ActionBar)) {
                }
            } else {
                if (actionBar6 == 3) {
                    actionBar3 = (ActionBar) approveCrossDeviceVerificationUseCase$getData$1.L$1;
                    c5705aBX3 = (C5705aBX) approveCrossDeviceVerificationUseCase$getData$1.L$0;
                    C56391yDq.AEQbTJ(objFinishInHouseAuthentication);
                    objKWHzl = ((Result) objFinishInHouseAuthentication).m7386unboximpl();
                    actionBar4 = (C5695aBN.ActionBar) (!Result.m7383isFailureimpl(objKWHzl) ? null : objKWHzl);
                    if (!(actionBar4 instanceof C5695aBN.ActionBar.C0808ActionBar)) {
                        C5882aEp.KWHzl.KWHzl(actionBar3.EZpvd(), "verify guard success");
                        FinishInHouseAuthenticationRequest finishInHouseAuthenticationRequest = new FinishInHouseAuthenticationRequest(actionBar3.OLrzqt(), ((C5695aBN.ActionBar.C0808ActionBar) actionBar4).OLrzqt());
                        PasskeyApiService passkeyApiService2 = c5705aBX3.copydefault;
                        approveCrossDeviceVerificationUseCase$getData$1.L$0 = c5705aBX3;
                        approveCrossDeviceVerificationUseCase$getData$1.L$1 = actionBar3;
                        approveCrossDeviceVerificationUseCase$getData$1.label = 4;
                        objFinishInHouseAuthentication = passkeyApiService2.finishInHouseAuthentication(finishInHouseAuthenticationRequest, approveCrossDeviceVerificationUseCase$getData$1);
                        if (objFinishInHouseAuthentication == objCopydefault) {
                            return objCopydefault;
                        }
                        c5705aBX4 = c5705aBX3;
                        responseData = (ResponseData) objFinishInHouseAuthentication;
                        if (responseData.getCode() != 0) {
                        }
                        return new Activity.C0809Activity(responseData.getMsg());
                    }
                    if (actionBar4 instanceof C5695aBN.ActionBar.Application) {
                        C5882aEp.KWHzl.KWHzl(actionBar3.EZpvd(), "verify guard error, biometric error, error=" + ((C5695aBN.ActionBar.Application) actionBar4).EZpvd());
                        InterfaceC5693aBL.StateListAnimator stateListAnimatorEZpvd = ((C5695aBN.ActionBar.Application) actionBar4).EZpvd();
                        if (!Intrinsics.EZpvd(stateListAnimatorEZpvd, InterfaceC5693aBL.StateListAnimator.Application.EZpvd) && !Intrinsics.EZpvd(stateListAnimatorEZpvd, InterfaceC5693aBL.StateListAnimator.TaskDescription.EZpvd)) {
                            if (stateListAnimatorEZpvd instanceof InterfaceC5693aBL.StateListAnimator.ActionBar) {
                                return new Activity.C0809Activity(((InterfaceC5693aBL.StateListAnimator.ActionBar) ((C5695aBN.ActionBar.Application) actionBar4).EZpvd()).OLrzqt());
                            }
                            if (Intrinsics.EZpvd(stateListAnimatorEZpvd, InterfaceC5693aBL.StateListAnimator.Activity.copydefault)) {
                                return Activity.TaskDescription.EZpvd;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return Activity.StateListAnimator.copydefault;
                    }
                    if (actionBar4 instanceof C5695aBN.ActionBar.Activity) {
                        C5882aEp.KWHzl.KWHzl(actionBar3.EZpvd(), "verify guard error, sign error, error=" + ((C5695aBN.ActionBar.Activity) actionBar4).copydefault());
                        return new Activity.C0809Activity(((C5695aBN.ActionBar.Activity) actionBar4).copydefault());
                    }
                    if (Intrinsics.EZpvd(actionBar4, C5695aBN.ActionBar.StateListAnimator.KWHzl)) {
                        C5882aEp.KWHzl.KWHzl(actionBar3.EZpvd(), "verify guard error, user key pair not exist");
                        return Activity.StateListAnimator.copydefault;
                    }
                    if (actionBar4 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                    java.lang.String message = thM7380exceptionOrNullimpl != null ? thM7380exceptionOrNullimpl.getMessage() : null;
                    C5882aEp.KWHzl.KWHzl(actionBar3.EZpvd(), "verify guard error, error=" + message);
                    return new Activity.C0809Activity(message);
                }
                if (actionBar6 == 4) {
                    actionBar3 = (ActionBar) approveCrossDeviceVerificationUseCase$getData$1.L$1;
                    c5705aBX4 = (C5705aBX) approveCrossDeviceVerificationUseCase$getData$1.L$0;
                    C56391yDq.AEQbTJ(objFinishInHouseAuthentication);
                    responseData = (ResponseData) objFinishInHouseAuthentication;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        FinishInHouseAuthenticationResponse finishInHouseAuthenticationResponse = (FinishInHouseAuthenticationResponse) responseData.getData();
                        if (finishInHouseAuthenticationResponse != null && (registrationStartResponseOLrzqt = finishInHouseAuthenticationResponse.OLrzqt()) != null) {
                            pUU.KWHzl("ApproveCrossDeviceVerificationUseCase", "BEFORE calling finishPasskeyUpgradeUseCase.execute() - timestamp=" + java.lang.System.currentTimeMillis());
                            C5945aFz c5945aFz = c5705aBX4.AEQbTJ;
                            android.content.Context context = actionBar3.copydefault().getContext();
                            approveCrossDeviceVerificationUseCase$getData$1.L$0 = c5705aBX4;
                            approveCrossDeviceVerificationUseCase$getData$1.L$1 = actionBar3;
                            approveCrossDeviceVerificationUseCase$getData$1.label = 5;
                            objAEQbTJ = c5945aFz.AEQbTJ(context, registrationStartResponseOLrzqt, approveCrossDeviceVerificationUseCase$getData$1);
                            if (objAEQbTJ == objCopydefault) {
                                return objCopydefault;
                            }
                            actionBar5 = actionBar3;
                            c5705aBX5 = c5705aBX4;
                            if (Result.m7383isFailureimpl(objAEQbTJ)) {
                            }
                            if (((Unit) obj) == null) {
                            }
                        }
                        C5882aEp.KWHzl.KWHzl(actionBar3.EZpvd(), "finish in house authentication success");
                        return new Activity.Application(false);
                    }
                    return new Activity.C0809Activity(responseData.getMsg());
                }
                if (actionBar6 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                actionBar5 = (ActionBar) approveCrossDeviceVerificationUseCase$getData$1.L$1;
                c5705aBX5 = (C5705aBX) approveCrossDeviceVerificationUseCase$getData$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objFinishInHouseAuthentication);
                    objAEQbTJ = ((Result) objFinishInHouseAuthentication).m7386unboximpl();
                    if (Result.m7383isFailureimpl(objAEQbTJ)) {
                        obj = objAEQbTJ;
                    }
                    if (((Unit) obj) == null) {
                        C5882aEp.KWHzl.KWHzl(actionBar5.EZpvd(), "finish upgrade success - timestamp=" + java.lang.System.currentTimeMillis());
                        c5705aBX5.AhwBna.copydefault(UpgradeType.CROSS_DEVICE);
                        return new Activity.Application(true);
                    }
                    java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objAEQbTJ);
                    if (thM7380exceptionOrNullimpl2 != null) {
                        C5882aEp.KWHzl.KWHzl(actionBar5.EZpvd(), "finish upgrade error: " + thM7380exceptionOrNullimpl2.getMessage() + " - timestamp=" + java.lang.System.currentTimeMillis());
                        return new Activity.Application(false);
                    }
                    actionBar3 = actionBar5;
                    C5882aEp.KWHzl.KWHzl(actionBar3.EZpvd(), "finish in house authentication success");
                    return new Activity.Application(false);
                } catch (OKServerException e3) {
                    e = e3;
                    actionBar6 = actionBar5;
                    C5882aEp.KWHzl.KWHzl(actionBar6.EZpvd(), "approve cross device verification error, code=" + e.getCode() + ", error=" + e.getMessage());
                    if (e.getCode() == 3030) {
                    }
                }
            }
            C5882aEp.KWHzl.KWHzl(actionBar2.EZpvd(), "decision api success");
            StartInHouseAuthenticationRequest startInHouseAuthenticationRequest = new StartInHouseAuthenticationRequest(actionBar2.OLrzqt());
            PasskeyApiService passkeyApiService3 = c5705aBX.copydefault;
            approveCrossDeviceVerificationUseCase$getData$1.L$0 = c5705aBX;
            approveCrossDeviceVerificationUseCase$getData$1.L$1 = actionBar2;
            approveCrossDeviceVerificationUseCase$getData$1.label = 2;
            java.lang.Object objStartInHouseAuthentication = passkeyApiService3.startInHouseAuthentication(startInHouseAuthenticationRequest, approveCrossDeviceVerificationUseCase$getData$1);
            if (objStartInHouseAuthentication == objCopydefault) {
                return objCopydefault;
            }
            c5705aBX2 = c5705aBX;
            objFinishInHouseAuthentication = objStartInHouseAuthentication;
            actionBar3 = actionBar2;
            java.lang.Object data2 = ((ResponseData) objFinishInHouseAuthentication).getData();
            Intrinsics.copydefault(data2);
            C5882aEp.KWHzl.KWHzl(actionBar3.EZpvd(), "start in house authentication api success");
            C5695aBN.Application application2 = new C5695aBN.Application(actionBar3.copydefault(), (AuthenticationStartResponse) data2);
            C5695aBN c5695aBN2 = c5705aBX2.djBIcL;
            approveCrossDeviceVerificationUseCase$getData$1.L$0 = c5705aBX2;
            approveCrossDeviceVerificationUseCase$getData$1.L$1 = actionBar3;
            approveCrossDeviceVerificationUseCase$getData$1.label = 3;
            objKWHzl = c5695aBN2.KWHzl(application2, (Continuation) approveCrossDeviceVerificationUseCase$getData$1);
            if (objKWHzl != objCopydefault) {
            }
        } catch (OKServerException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: o.aBX$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class ActionBar {
        public final androidx.fragment.app.Fragment AEQbTJ;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fragment = actionBar.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str = actionBar.OLrzqt;
            }
            if ((i & 4) != 0) {
                str2 = actionBar.KWHzl;
            }
            return actionBar.OLrzqt(fragment, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(fragment, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final androidx.fragment.app.Fragment copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(fragment=" + this.AEQbTJ + ", crossDevicePasskeySessionId=" + this.OLrzqt + ", flow=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = fragment;
            this.OLrzqt = str;
            this.KWHzl = str2;
        }
    }

    /* JADX INFO: renamed from: o.aBX$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public interface Activity {

        /* JADX INFO: renamed from: o.aBX$Activity$Application */
        public static final class Application implements Activity {
            public final boolean EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = application.EZpvd;
                }
                return application.OLrzqt(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application OLrzqt(boolean z) {
                return new Application(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && this.EZpvd == ((Application) obj).EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(upgraded=" + this.EZpvd + ")";
            }

            public Application(boolean z) {
                this.EZpvd = z;
            }
        }

        /* JADX INFO: renamed from: o.aBX$Activity$TaskDescription */
        public static final class TaskDescription implements Activity {
            public static final TaskDescription EZpvd = new TaskDescription();

            private TaskDescription() {
            }
        }

        /* JADX INFO: renamed from: o.aBX$Activity$ActionBar */
        public static final class ActionBar implements Activity {
            public static final ActionBar KWHzl = new ActionBar();

            private ActionBar() {
            }
        }

        /* JADX INFO: renamed from: o.aBX$Activity$StateListAnimator */
        public static final class StateListAnimator implements Activity {
            public static final StateListAnimator copydefault = new StateListAnimator();

            private StateListAnimator() {
            }
        }

        /* JADX INFO: renamed from: o.aBX$Activity$Activity, reason: collision with other inner class name */
        public static final class C0809Activity implements Activity {
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0809Activity copy$default(C0809Activity c0809Activity, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = c0809Activity.copydefault;
                }
                return c0809Activity.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0809Activity KWHzl(java.lang.String str) {
                return new C0809Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0809Activity) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((C0809Activity) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.String str = this.copydefault;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(error=" + this.copydefault + ")";
            }

            public C0809Activity(java.lang.String str) {
                this.copydefault = str;
            }
        }
    }

    /* JADX INFO: renamed from: o.aBX$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aBX.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
