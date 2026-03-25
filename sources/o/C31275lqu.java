package o;

import com.okinc.business.web3pay.lib.core.model.TransactionAlertType;
import com.okinc.business.web3pay.lib.features.account.AccountRepositoryImpl$checkUserStatus$1;
import com.okinc.business.web3pay.lib.features.account.AccountRepositoryImpl$clearAccountInfo$1;
import com.okinc.business.web3pay.lib.features.account.AccountRepositoryImpl$createMfaSession$1;
import com.okinc.business.web3pay.lib.features.account.AccountRepositoryImpl$createPayUniversalLink$1;
import com.okinc.business.web3pay.lib.features.account.AccountRepositoryImpl$createSmartAccount$1;
import com.okinc.business.web3pay.lib.features.account.AccountRepositoryImpl$getAccountInfo$1;
import com.okinc.business.web3pay.lib.features.account.AccountRepositoryImpl$getAvailableAreas$1;
import com.okinc.business.web3pay.lib.features.account.AccountRepositoryImpl$getKycName$1;
import com.okinc.business.web3pay.lib.features.account.AccountRepositoryImpl$getUserKycInfo$1;
import com.okinc.business.web3pay.lib.features.account.AccountRepositoryImpl$judgeUserEmail$1;
import com.okinc.business.web3pay.lib.features.account.data.model.AccountInfoApiModel;
import com.okinc.business.web3pay.lib.features.account.data.model.CheckUserStatusResponse;
import com.okinc.business.web3pay.lib.features.account.data.model.CreateMfaSessionRequest;
import com.okinc.business.web3pay.lib.features.account.data.model.CreatePayUniversalLinkRequest;
import com.okinc.business.web3pay.lib.features.account.data.model.CreateSessionResponse;
import com.okinc.business.web3pay.lib.features.account.data.model.CreateSmartAccountResponse;
import com.okinc.business.web3pay.lib.features.account.data.model.GetKycNameRequest;
import com.okinc.business.web3pay.lib.features.account.data.model.GetKycNameResponse;
import com.okinc.business.web3pay.lib.features.account.data.model.UserKycInfoResponse;
import com.okinc.business.web3pay.lib.features.account.model.AccountInfo;
import com.okinc.business.web3pay.lib.features.account.model.AvailableArea;
import com.okinc.business.web3pay.lib.features.account.model.CheckUserStatusResult;
import com.okinc.business.web3pay.lib.features.account.model.FreezeScene;
import com.okinc.business.web3pay.lib.features.account.model.RecoverEmailData;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.Mutex;
import o.AbstractC31234lqF;
import o.AbstractC31235lqG;
import o.AbstractC31280lqz;
import o.AbstractC43419rot;
import o.InterfaceC31274lqt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@yCR
public final class C31275lqu {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<java.lang.String> AEQbTJ;
    public final Mutex EZpvd;
    public final InterfaceC31274lqt OLrzqt;
    public AccountInfo copydefault;

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0171 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #3 {all -> 0x003f, blocks: (B:13:0x003b, B:34:0x00a5, B:36:0x00ad, B:38:0x00b3, B:39:0x00c0), top: B:70:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116 A[Catch: all -> 0x016e, TryCatch #2 {all -> 0x016e, blocks: (B:45:0x0112, B:47:0x0116, B:48:0x012a, B:50:0x012e, B:54:0x0143, B:55:0x015f, B:56:0x0162, B:59:0x0168, B:60:0x016d), top: B:69:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a A[Catch: all -> 0x016e, TryCatch #2 {all -> 0x016e, blocks: (B:45:0x0112, B:47:0x0116, B:48:0x012a, B:50:0x012e, B:54:0x0143, B:55:0x015f, B:56:0x0162, B:59:0x0168, B:60:0x016d), top: B:69:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super AbstractC31234lqF> continuation) throws java.lang.Throwable {
        AccountRepositoryImpl$getAccountInfo$1 accountRepositoryImpl$getAccountInfo$1;
        Mutex mutex;
        C31275lqu c31275lqu;
        AccountInfo accountInfo;
        Mutex mutex2;
        C31275lqu c31275lqu2;
        AbstractC43419rot actionBar;
        java.lang.Object stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof AccountRepositoryImpl$getAccountInfo$1) {
            accountRepositoryImpl$getAccountInfo$1 = (AccountRepositoryImpl$getAccountInfo$1) continuation;
            int i = accountRepositoryImpl$getAccountInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountRepositoryImpl$getAccountInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                accountRepositoryImpl$getAccountInfo$1 = new AccountRepositoryImpl$getAccountInfo$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = accountRepositoryImpl$getAccountInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        ?? r4 = accountRepositoryImpl$getAccountInfo$1.label;
        try {
            if (r4 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                Mutex mutex3 = this.EZpvd;
                accountRepositoryImpl$getAccountInfo$1.L$0 = this;
                accountRepositoryImpl$getAccountInfo$1.L$1 = mutex3;
                accountRepositoryImpl$getAccountInfo$1.label = 1;
                if (mutex3.lock(null, accountRepositoryImpl$getAccountInfo$1) == objCopydefault) {
                    return objCopydefault;
                }
                mutex = mutex3;
                c31275lqu = this;
            } else if (r4 == 1) {
                mutex = (Mutex) accountRepositoryImpl$getAccountInfo$1.L$1;
                c31275lqu = (C31275lqu) accountRepositoryImpl$getAccountInfo$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
            } else {
                if (r4 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) accountRepositoryImpl$getAccountInfo$1.L$1;
                c31275lqu2 = (C31275lqu) accountRepositoryImpl$getAccountInfo$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objOLrzqt);
                    responseData = (ResponseData) objOLrzqt;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    c31275lqu = c31275lqu2;
                    mutex = mutex2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    mutex2 = mutex;
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    c31275lqu2 = c31275lqu;
                }
                try {
                    if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                        AccountInfo accountInfoEZpvd = C31229lqA.EZpvd((AccountInfoApiModel) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
                        c31275lqu2.copydefault = accountInfoEZpvd;
                        stateListAnimator = new AbstractC31234lqF.Application(accountInfoEZpvd);
                    } else {
                        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int code = ((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()).getCode();
                        if (code == 10002) {
                            stateListAnimator = AbstractC31234lqF.Activity.EZpvd;
                        } else if (code == 10018) {
                            stateListAnimator = AbstractC31234lqF.ActionBar.AEQbTJ;
                        } else {
                            pUU.AEQbTJ("AccountRepository", "getAccountInfo", (java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl());
                            stateListAnimator = new AbstractC31234lqF.StateListAnimator((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl());
                        }
                    }
                    mutex2.unlock(null);
                    return stateListAnimator;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r4 = mutex2;
                }
            }
            accountInfo = c31275lqu.copydefault;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        if (accountInfo != null) {
            pUU.KWHzl("AccountRepository", "getAccountInfo: cached " + accountInfo.OLrzqt());
            AbstractC31234lqF.Application application = new AbstractC31234lqF.Application(accountInfo);
            mutex.unlock(null);
            return application;
        }
        pUU.KWHzl("AccountRepository", "getAccountInfo: not cached");
        try {
            InterfaceC31274lqt interfaceC31274lqt = c31275lqu.OLrzqt;
            accountRepositoryImpl$getAccountInfo$1.L$0 = c31275lqu;
            accountRepositoryImpl$getAccountInfo$1.L$1 = mutex;
            accountRepositoryImpl$getAccountInfo$1.label = 2;
            objOLrzqt = interfaceC31274lqt.OLrzqt(accountRepositoryImpl$getAccountInfo$1);
        } catch (java.lang.Throwable th4) {
            th = th4;
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            mutex2 = mutex;
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            c31275lqu2 = c31275lqu;
        }
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        mutex2 = mutex;
        c31275lqu2 = c31275lqu;
        responseData = (ResponseData) objOLrzqt;
        if (responseData.getCode() != 0) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
            }
            mutex2.unlock(null);
            return stateListAnimator;
        }
        r4.unlock(null);
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AYXKKw(@NotNull Continuation<? super Result<? extends java.util.List<AvailableArea>>> continuation) {
        AccountRepositoryImpl$getAvailableAreas$1 accountRepositoryImpl$getAvailableAreas$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof AccountRepositoryImpl$getAvailableAreas$1) {
            accountRepositoryImpl$getAvailableAreas$1 = (AccountRepositoryImpl$getAvailableAreas$1) continuation;
            int i = accountRepositoryImpl$getAvailableAreas$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountRepositoryImpl$getAvailableAreas$1.label = i - Integer.MIN_VALUE;
            } else {
                accountRepositoryImpl$getAvailableAreas$1 = new AccountRepositoryImpl$getAvailableAreas$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = accountRepositoryImpl$getAvailableAreas$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = accountRepositoryImpl$getAvailableAreas$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC31274lqt interfaceC31274lqt = this.OLrzqt;
                accountRepositoryImpl$getAvailableAreas$1.label = 1;
                objCopydefault = interfaceC31274lqt.copydefault(accountRepositoryImpl$getAvailableAreas$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            ResponseData responseData = (ResponseData) objCopydefault;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.AEQbTJ("AccountRepository", "getAvailableAreas", (java.lang.Throwable) actionBar2.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super Result<java.lang.String>> continuation) {
        AccountRepositoryImpl$createMfaSession$1 accountRepositoryImpl$createMfaSession$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof AccountRepositoryImpl$createMfaSession$1) {
            accountRepositoryImpl$createMfaSession$1 = (AccountRepositoryImpl$createMfaSession$1) continuation;
            int i = accountRepositoryImpl$createMfaSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountRepositoryImpl$createMfaSession$1.label = i - Integer.MIN_VALUE;
            } else {
                accountRepositoryImpl$createMfaSession$1 = new AccountRepositoryImpl$createMfaSession$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = accountRepositoryImpl$createMfaSession$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = accountRepositoryImpl$createMfaSession$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC31274lqt interfaceC31274lqt = this.OLrzqt;
                CreateMfaSessionRequest createMfaSessionRequest = new CreateMfaSessionRequest(1);
                accountRepositoryImpl$createMfaSession$1.label = 1;
                objEZpvd = interfaceC31274lqt.EZpvd(createMfaSessionRequest, accountRepositoryImpl$createMfaSession$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            ResponseData responseData = (ResponseData) objEZpvd;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((CreateSessionResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()).getSessionId());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.AEQbTJ("AccountRepository", "createMfaSession", (java.lang.Throwable) actionBar2.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull GetKycNameRequest getKycNameRequest, @NotNull Continuation<? super AbstractC31235lqG> continuation) throws java.lang.Throwable {
        AccountRepositoryImpl$getKycName$1 accountRepositoryImpl$getKycName$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof AccountRepositoryImpl$getKycName$1) {
            accountRepositoryImpl$getKycName$1 = (AccountRepositoryImpl$getKycName$1) continuation;
            int i = accountRepositoryImpl$getKycName$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountRepositoryImpl$getKycName$1.label = i - Integer.MIN_VALUE;
            } else {
                accountRepositoryImpl$getKycName$1 = new AccountRepositoryImpl$getKycName$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = accountRepositoryImpl$getKycName$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = accountRepositoryImpl$getKycName$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC31274lqt interfaceC31274lqt = this.OLrzqt;
                java.lang.String contactType = getKycNameRequest.getContactType();
                java.lang.String contactValue = getKycNameRequest.getContactValue();
                java.lang.String areaCode = getKycNameRequest.getAreaCode();
                accountRepositoryImpl$getKycName$1.label = 1;
                objCopydefault = interfaceC31274lqt.copydefault(contactType, contactValue, areaCode, accountRepositoryImpl$getKycName$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            responseData = (ResponseData) objCopydefault;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                return new AbstractC31235lqG.ActionBar((GetKycNameResponse) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) stateListAnimator;
            pUU.AEQbTJ("AccountRepository", "getKycName", (java.lang.Throwable) actionBar2.KWHzl());
            if (((OKServerException) actionBar2.KWHzl()).getCode() == 40001) {
                return AbstractC31235lqG.StateListAnimator.copydefault;
            }
            return new AbstractC31235lqG.TaskDescription((java.lang.Exception) actionBar2.KWHzl());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:23:0x0062, B:25:0x006a, B:27:0x0070, B:28:0x007d), top: B:56:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull C31231lqC c31231lqC, @NotNull Continuation<? super Result<CheckUserStatusResult>> continuation) {
        AccountRepositoryImpl$checkUserStatus$1 accountRepositoryImpl$checkUserStatus$1;
        C31275lqu c31275lqu;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof AccountRepositoryImpl$checkUserStatus$1) {
            accountRepositoryImpl$checkUserStatus$1 = (AccountRepositoryImpl$checkUserStatus$1) continuation;
            int i = accountRepositoryImpl$checkUserStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountRepositoryImpl$checkUserStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                accountRepositoryImpl$checkUserStatus$1 = new AccountRepositoryImpl$checkUserStatus$1(this, continuation);
            }
        }
        AccountRepositoryImpl$checkUserStatus$1 accountRepositoryImpl$checkUserStatus$12 = accountRepositoryImpl$checkUserStatus$1;
        java.lang.Object objCopydefault = accountRepositoryImpl$checkUserStatus$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = accountRepositoryImpl$checkUserStatus$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            try {
                InterfaceC31274lqt interfaceC31274lqt = this.OLrzqt;
                java.lang.Boolean boolOLrzqt = c31231lqC.OLrzqt();
                java.lang.Boolean boolEZpvd = c31231lqC.EZpvd();
                java.lang.Boolean boolKWHzl = c31231lqC.KWHzl();
                java.lang.Boolean boolAEQbTJ = c31231lqC.AEQbTJ();
                accountRepositoryImpl$checkUserStatus$12.L$0 = this;
                accountRepositoryImpl$checkUserStatus$12.label = 1;
                objCopydefault = interfaceC31274lqt.copydefault(boolOLrzqt, boolEZpvd, boolKWHzl, boolAEQbTJ, accountRepositoryImpl$checkUserStatus$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                c31275lqu = this;
                responseData = (ResponseData) objCopydefault;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th) {
                th = th;
                c31275lqu = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c31275lqu = (C31275lqu) accountRepositoryImpl$checkUserStatus$12.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
                responseData = (ResponseData) objCopydefault;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            CheckUserStatusResponse checkUserStatusResponse = (CheckUserStatusResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            MutableStateFlow<java.lang.String> mutableStateFlow = c31275lqu.AEQbTJ;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), checkUserStatusResponse.getIpCountry())) {
            }
            java.util.List<FreezeScene> listOLrzqt = FreezeScene.Companion.OLrzqt(checkUserStatusResponse.getFreezeCodes());
            java.lang.Boolean validCefiStatus = checkUserStatusResponse.getValidCefiStatus();
            boolean zBooleanValue = validCefiStatus != null ? validCefiStatus.booleanValue() : true;
            java.lang.Boolean validEmail = checkUserStatusResponse.getValidEmail();
            boolean zBooleanValue2 = validEmail != null ? validEmail.booleanValue() : true;
            java.lang.Boolean hasEmail = checkUserStatusResponse.getHasEmail();
            return Result.m7377constructorimpl(new CheckUserStatusResult(listOLrzqt, zBooleanValue, zBooleanValue2, hasEmail != null ? hasEmail.booleanValue() : true));
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.AEQbTJ("AccountRepository", "checkUserStatus", (java.lang.Throwable) actionBar2.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object valueOf(@NotNull Continuation<? super Result<C31233lqE>> continuation) {
        AccountRepositoryImpl$getUserKycInfo$1 accountRepositoryImpl$getUserKycInfo$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof AccountRepositoryImpl$getUserKycInfo$1) {
            accountRepositoryImpl$getUserKycInfo$1 = (AccountRepositoryImpl$getUserKycInfo$1) continuation;
            int i = accountRepositoryImpl$getUserKycInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountRepositoryImpl$getUserKycInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                accountRepositoryImpl$getUserKycInfo$1 = new AccountRepositoryImpl$getUserKycInfo$1(this, continuation);
            }
        }
        AccountRepositoryImpl$getUserKycInfo$1 accountRepositoryImpl$getUserKycInfo$12 = accountRepositoryImpl$getUserKycInfo$1;
        java.lang.Object userKycInfo$default = accountRepositoryImpl$getUserKycInfo$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = accountRepositoryImpl$getUserKycInfo$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(userKycInfo$default);
                InterfaceC31274lqt interfaceC31274lqt = this.OLrzqt;
                accountRepositoryImpl$getUserKycInfo$12.label = 1;
                userKycInfo$default = InterfaceC31274lqt.TaskDescription.getUserKycInfo$default(interfaceC31274lqt, null, 0, accountRepositoryImpl$getUserKycInfo$12, 3, null);
                if (userKycInfo$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(userKycInfo$default);
            }
            ResponseData responseData = (ResponseData) userKycInfo$default;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C31230lqB.EZpvd((UserKycInfoResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()));
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.AEQbTJ("AccountRepository", "getUserKycInfo", (java.lang.Throwable) actionBar2.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AccountRepositoryImpl$clearAccountInfo$1 accountRepositoryImpl$clearAccountInfo$1;
        C31275lqu c31275lqu;
        Mutex mutex;
        if (continuation instanceof AccountRepositoryImpl$clearAccountInfo$1) {
            accountRepositoryImpl$clearAccountInfo$1 = (AccountRepositoryImpl$clearAccountInfo$1) continuation;
            int i = accountRepositoryImpl$clearAccountInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountRepositoryImpl$clearAccountInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                accountRepositoryImpl$clearAccountInfo$1 = new AccountRepositoryImpl$clearAccountInfo$1(this, continuation);
            }
        }
        java.lang.Object obj = accountRepositoryImpl$clearAccountInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = accountRepositoryImpl$clearAccountInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex2 = this.EZpvd;
            accountRepositoryImpl$clearAccountInfo$1.L$0 = this;
            accountRepositoryImpl$clearAccountInfo$1.L$1 = mutex2;
            accountRepositoryImpl$clearAccountInfo$1.label = 1;
            if (mutex2.lock(null, accountRepositoryImpl$clearAccountInfo$1) == objCopydefault) {
                return objCopydefault;
            }
            c31275lqu = this;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) accountRepositoryImpl$clearAccountInfo$1.L$1;
            c31275lqu = (C31275lqu) accountRepositoryImpl$clearAccountInfo$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            c31275lqu.copydefault = null;
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC31280lqz> continuation) throws java.lang.Throwable {
        AccountRepositoryImpl$createSmartAccount$1 accountRepositoryImpl$createSmartAccount$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof AccountRepositoryImpl$createSmartAccount$1) {
            accountRepositoryImpl$createSmartAccount$1 = (AccountRepositoryImpl$createSmartAccount$1) continuation;
            int i = accountRepositoryImpl$createSmartAccount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountRepositoryImpl$createSmartAccount$1.label = i - Integer.MIN_VALUE;
            } else {
                accountRepositoryImpl$createSmartAccount$1 = new AccountRepositoryImpl$createSmartAccount$1(this, continuation);
            }
        }
        java.lang.Object objCreateSmartAccount$default = accountRepositoryImpl$createSmartAccount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = accountRepositoryImpl$createSmartAccount$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCreateSmartAccount$default);
                InterfaceC31274lqt interfaceC31274lqt = this.OLrzqt;
                accountRepositoryImpl$createSmartAccount$1.label = 1;
                objCreateSmartAccount$default = InterfaceC31274lqt.TaskDescription.createSmartAccount$default(interfaceC31274lqt, null, accountRepositoryImpl$createSmartAccount$1, 1, null);
                if (objCreateSmartAccount$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCreateSmartAccount$default);
            }
            ResponseData responseData = (ResponseData) objCreateSmartAccount$default;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            return new AbstractC31280lqz.Fragment(new CreateSmartAccountResponse(((CreateSmartAccountResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()).getAccountId()));
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.AEQbTJ("AccountRepository", "createSmartAccount", (java.lang.Throwable) actionBar2.KWHzl());
        int code = ((OKServerException) actionBar2.KWHzl()).getCode();
        if (code == 10009) {
            return AbstractC31280lqz.Activity.AEQbTJ;
        }
        if (code == 10011) {
            return AbstractC31280lqz.Application.AEQbTJ;
        }
        if (code == 10014) {
            return AbstractC31280lqz.ActionBar.KWHzl;
        }
        if (code != 10020 && code != 40002 && code != 40004) {
            switch (code) {
                case 40101:
                case 40102:
                case 40103:
                case 40104:
                case 40105:
                case 40106:
                case 40107:
                case 40108:
                case 40109:
                case 40110:
                case 40111:
                case 40112:
                    break;
                default:
                    switch (code) {
                        case 40201:
                        case 40202:
                        case 40203:
                        case 40204:
                        case 40205:
                        case 40206:
                        case 40207:
                        case 40208:
                        case 40209:
                        case 40210:
                            break;
                        default:
                            return new AbstractC31280lqz.StateListAnimator((java.lang.Exception) actionBar2.KWHzl());
                    }
                    break;
            }
        }
        TransactionAlertType transactionAlertTypeEZpvd = TransactionAlertType.Companion.EZpvd(((OKServerException) actionBar2.KWHzl()).getCode());
        if (transactionAlertTypeEZpvd != null) {
            return new AbstractC31280lqz.TaskDescription(transactionAlertTypeEZpvd);
        }
        return new AbstractC31280lqz.StateListAnimator((java.lang.Exception) actionBar2.KWHzl());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Result<java.lang.String>> continuation) {
        AccountRepositoryImpl$createPayUniversalLink$1 accountRepositoryImpl$createPayUniversalLink$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof AccountRepositoryImpl$createPayUniversalLink$1) {
            accountRepositoryImpl$createPayUniversalLink$1 = (AccountRepositoryImpl$createPayUniversalLink$1) continuation;
            int i = accountRepositoryImpl$createPayUniversalLink$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountRepositoryImpl$createPayUniversalLink$1.label = i - Integer.MIN_VALUE;
            } else {
                accountRepositoryImpl$createPayUniversalLink$1 = new AccountRepositoryImpl$createPayUniversalLink$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = accountRepositoryImpl$createPayUniversalLink$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = accountRepositoryImpl$createPayUniversalLink$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC31274lqt interfaceC31274lqt = this.OLrzqt;
                CreatePayUniversalLinkRequest createPayUniversalLinkRequest = new CreatePayUniversalLinkRequest(1);
                accountRepositoryImpl$createPayUniversalLink$1.label = 1;
                objEZpvd = interfaceC31274lqt.EZpvd(createPayUniversalLinkRequest, accountRepositoryImpl$createPayUniversalLink$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            ResponseData responseData = (ResponseData) objEZpvd;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.AEQbTJ("AccountRepository", "createPayUniversalLink", (java.lang.Throwable) actionBar2.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object djBIcL(@NotNull Continuation<? super Result<RecoverEmailData>> continuation) {
        AccountRepositoryImpl$judgeUserEmail$1 accountRepositoryImpl$judgeUserEmail$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof AccountRepositoryImpl$judgeUserEmail$1) {
            accountRepositoryImpl$judgeUserEmail$1 = (AccountRepositoryImpl$judgeUserEmail$1) continuation;
            int i = accountRepositoryImpl$judgeUserEmail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountRepositoryImpl$judgeUserEmail$1.label = i - Integer.MIN_VALUE;
            } else {
                accountRepositoryImpl$judgeUserEmail$1 = new AccountRepositoryImpl$judgeUserEmail$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = accountRepositoryImpl$judgeUserEmail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = accountRepositoryImpl$judgeUserEmail$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC31274lqt interfaceC31274lqt = this.OLrzqt;
                accountRepositoryImpl$judgeUserEmail$1.label = 1;
                objAEQbTJ = interfaceC31274lqt.AEQbTJ(accountRepositoryImpl$judgeUserEmail$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            ResponseData responseData = (ResponseData) objAEQbTJ;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.AEQbTJ("AccountRepository", "judgeUserEmail", (java.lang.Throwable) actionBar2.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
    }

    /* JADX INFO: renamed from: o.lqu$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lqu.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
