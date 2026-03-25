package o;

import com.okinc.business.defi.jwt.AddressLoginResponse;
import com.okinc.business.defi.wallet.home.addressDetail.domain.usecase.AddressProfileInfoUseCase$addressAddOrCancel$2$1;
import com.okinc.business.defi.wallet.home.addressDetail.domain.usecase.AddressProfileInfoUseCase$getAddressAlias$1;
import com.okinc.business.defi.wallet.home.addressDetail.domain.usecase.AddressProfileInfoUseCase$getAddressCollect$1;
import com.okinc.business.defi.wallet.home.addressDetail.domain.usecase.AddressProfileInfoUseCase$getAddressInfo$1;
import com.okinc.business.defi.wallet.home.addressDetail.domain.usecase.AddressProfileInfoUseCase$getNotificationInfo$1;
import com.okinc.business.defi.wallet.home.addressDetail.domain.usecase.AddressProfileInfoUseCase$getUserInfo$1;
import com.okinc.business.defi.wallet.home.addressDetail.domain.usecase.AddressProfileInfoUseCase$updateAddressAlias$2$1;
import com.okinc.business.defi.wallet.home.addressDetail.domain.usecase.AddressProfileInfoUseCase$updateNotificationInfo$1;
import com.okinc.business.defi.wallet.home.bean.AddressAliasResponse;
import com.okinc.business.defi.wallet.home.bean.GetUserInfoBody;
import com.okinc.business.defi.wallet.home.bean.NotificationInfo;
import com.okinc.business.defi.wallet.home.bean.NotifyUpdateRequest;
import com.okinc.business.defi.wallet.home.bean.UserAdressInfo;
import com.okinc.business.defi.wallet.home.bean.WalletAddressTagListInfo;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eWX {
    public final InterfaceC13914dba EZpvd;
    public final C13594dRc KWHzl;

    @yCM
    public eWX(@NotNull InterfaceC13914dba interfaceC13914dba, @NotNull C13594dRc c13594dRc) {
        Intrinsics.checkNotNullParameter(interfaceC13914dba, "");
        Intrinsics.checkNotNullParameter(c13594dRc, "");
        this.EZpvd = interfaceC13914dba;
        this.KWHzl = c13594dRc;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<java.lang.String>>> continuation) throws java.lang.Throwable {
        AddressProfileInfoUseCase$getAddressCollect$1 addressProfileInfoUseCase$getAddressCollect$1;
        if (continuation instanceof AddressProfileInfoUseCase$getAddressCollect$1) {
            addressProfileInfoUseCase$getAddressCollect$1 = (AddressProfileInfoUseCase$getAddressCollect$1) continuation;
            int i = addressProfileInfoUseCase$getAddressCollect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressProfileInfoUseCase$getAddressCollect$1.label = i - Integer.MIN_VALUE;
            } else {
                addressProfileInfoUseCase$getAddressCollect$1 = new AddressProfileInfoUseCase$getAddressCollect$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = addressProfileInfoUseCase$getAddressCollect$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressProfileInfoUseCase$getAddressCollect$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC13914dba interfaceC13914dba = this.EZpvd;
                addressProfileInfoUseCase$getAddressCollect$1.label = 1;
                objKWHzl = interfaceC13914dba.KWHzl(str, addressProfileInfoUseCase$getAddressCollect$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            return Result.m7377constructorimpl((java.util.List) ((ResponseData) objKWHzl).getData());
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<AddressAliasResponse>>> continuation) throws java.lang.Throwable {
        AddressProfileInfoUseCase$getAddressAlias$1 addressProfileInfoUseCase$getAddressAlias$1;
        if (continuation instanceof AddressProfileInfoUseCase$getAddressAlias$1) {
            addressProfileInfoUseCase$getAddressAlias$1 = (AddressProfileInfoUseCase$getAddressAlias$1) continuation;
            int i = addressProfileInfoUseCase$getAddressAlias$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressProfileInfoUseCase$getAddressAlias$1.label = i - Integer.MIN_VALUE;
            } else {
                addressProfileInfoUseCase$getAddressAlias$1 = new AddressProfileInfoUseCase$getAddressAlias$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = addressProfileInfoUseCase$getAddressAlias$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressProfileInfoUseCase$getAddressAlias$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Result.Application application = Result.Companion;
                InterfaceC13914dba interfaceC13914dba = this.EZpvd;
                addressProfileInfoUseCase$getAddressAlias$1.label = 1;
                objEZpvd = interfaceC13914dba.EZpvd(str, addressProfileInfoUseCase$getAddressAlias$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            return Result.m7377constructorimpl((java.util.List) ((ResponseData) objEZpvd).getData());
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super Result<UserAdressInfo>> continuation) throws java.lang.Throwable {
        AddressProfileInfoUseCase$getUserInfo$1 addressProfileInfoUseCase$getUserInfo$1;
        if (continuation instanceof AddressProfileInfoUseCase$getUserInfo$1) {
            addressProfileInfoUseCase$getUserInfo$1 = (AddressProfileInfoUseCase$getUserInfo$1) continuation;
            int i = addressProfileInfoUseCase$getUserInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressProfileInfoUseCase$getUserInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                addressProfileInfoUseCase$getUserInfo$1 = new AddressProfileInfoUseCase$getUserInfo$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = addressProfileInfoUseCase$getUserInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressProfileInfoUseCase$getUserInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Result.Application application = Result.Companion;
                InterfaceC13914dba interfaceC13914dba = this.EZpvd;
                GetUserInfoBody getUserInfoBody = new GetUserInfoBody(str, str2, list);
                addressProfileInfoUseCase$getUserInfo$1.label = 1;
                objEZpvd = interfaceC13914dba.EZpvd(getUserInfoBody, addressProfileInfoUseCase$getUserInfo$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            return Result.m7377constructorimpl((UserAdressInfo) ((ResponseData) objEZpvd).getData());
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX INFO: renamed from: getAddressInfo-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8574getAddressInfoBWLJW6A$default(eWX ewx, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return ewx.KWHzl(str, str2, str3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<WalletAddressTagListInfo>> continuation) throws java.lang.Throwable {
        AddressProfileInfoUseCase$getAddressInfo$1 addressProfileInfoUseCase$getAddressInfo$1;
        if (continuation instanceof AddressProfileInfoUseCase$getAddressInfo$1) {
            addressProfileInfoUseCase$getAddressInfo$1 = (AddressProfileInfoUseCase$getAddressInfo$1) continuation;
            int i = addressProfileInfoUseCase$getAddressInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressProfileInfoUseCase$getAddressInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                addressProfileInfoUseCase$getAddressInfo$1 = new AddressProfileInfoUseCase$getAddressInfo$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = addressProfileInfoUseCase$getAddressInfo$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = addressProfileInfoUseCase$getAddressInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                Result.Application application = Result.Companion;
                InterfaceC13914dba interfaceC13914dba = this.EZpvd;
                addressProfileInfoUseCase$getAddressInfo$1.label = 1;
                objCopydefault = interfaceC13914dba.copydefault(str, str2, str3, addressProfileInfoUseCase$getAddressInfo$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            return Result.m7377constructorimpl((WalletAddressTagListInfo) ((ResponseData) objCopydefault).getData());
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<NotificationInfo>> continuation) throws java.lang.Throwable {
        AddressProfileInfoUseCase$getNotificationInfo$1 addressProfileInfoUseCase$getNotificationInfo$1;
        if (continuation instanceof AddressProfileInfoUseCase$getNotificationInfo$1) {
            addressProfileInfoUseCase$getNotificationInfo$1 = (AddressProfileInfoUseCase$getNotificationInfo$1) continuation;
            int i = addressProfileInfoUseCase$getNotificationInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressProfileInfoUseCase$getNotificationInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                addressProfileInfoUseCase$getNotificationInfo$1 = new AddressProfileInfoUseCase$getNotificationInfo$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = addressProfileInfoUseCase$getNotificationInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressProfileInfoUseCase$getNotificationInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Result.Application application = Result.Companion;
                InterfaceC13914dba interfaceC13914dba = this.EZpvd;
                addressProfileInfoUseCase$getNotificationInfo$1.label = 1;
                objEZpvd = interfaceC13914dba.EZpvd(str, str2, addressProfileInfoUseCase$getNotificationInfo$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            return Result.m7377constructorimpl((NotificationInfo) ((ResponseData) objEZpvd).getData());
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v14, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e A[Catch: all -> 0x00a2, CancellationException -> 0x00ae, TryCatch #4 {CancellationException -> 0x00ae, all -> 0x00a2, blocks: (B:37:0x0099, B:38:0x009d, B:34:0x008a, B:36:0x008e, B:19:0x003e, B:22:0x0056, B:24:0x005a), top: B:49:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) throws java.lang.Throwable {
        AddressProfileInfoUseCase$updateNotificationInfo$1 addressProfileInfoUseCase$updateNotificationInfo$1;
        Ref.ObjectRef objectRef;
        java.lang.String strEZpvd;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        java.lang.Integer numAEQbTJ;
        if (continuation instanceof AddressProfileInfoUseCase$updateNotificationInfo$1) {
            addressProfileInfoUseCase$updateNotificationInfo$1 = (AddressProfileInfoUseCase$updateNotificationInfo$1) continuation;
            int i2 = addressProfileInfoUseCase$updateNotificationInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressProfileInfoUseCase$updateNotificationInfo$1.label = i2 - Integer.MIN_VALUE;
            } else {
                addressProfileInfoUseCase$updateNotificationInfo$1 = new AddressProfileInfoUseCase$updateNotificationInfo$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = addressProfileInfoUseCase$updateNotificationInfo$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = addressProfileInfoUseCase$updateNotificationInfo$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            try {
                Result.Application application = Result.Companion;
                java.lang.Object objCopydefault3 = this.KWHzl.copydefault(str);
                java.lang.String strCopydefault = xVW.copydefault();
                objectRef = new Ref.ObjectRef();
                if (Result.m7383isFailureimpl(objCopydefault3)) {
                    objCopydefault3 = null;
                }
                AddressLoginResponse addressLoginResponse = (AddressLoginResponse) objCopydefault3;
                if (addressLoginResponse != null && (strEZpvd = addressLoginResponse.EZpvd()) != null) {
                    try {
                        InterfaceC13914dba interfaceC13914dba = this.EZpvd;
                        Intrinsics.copydefault((java.lang.Object) strCopydefault);
                        NotifyUpdateRequest notifyUpdateRequest = new NotifyUpdateRequest(str, str2, i);
                        addressProfileInfoUseCase$updateNotificationInfo$1.L$0 = objectRef;
                        addressProfileInfoUseCase$updateNotificationInfo$1.L$1 = objectRef;
                        addressProfileInfoUseCase$updateNotificationInfo$1.label = 1;
                        objCopydefault = interfaceC13914dba.copydefault(strEZpvd, strCopydefault, notifyUpdateRequest, addressProfileInfoUseCase$updateNotificationInfo$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        objectRef2 = objectRef;
                        objectRef3 = objectRef2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (!(th instanceof OKServerException)) {
                        }
                        return Result.m7377constructorimpl(numAEQbTJ);
                    }
                }
                numAEQbTJ = (java.lang.Integer) objectRef.element;
                return Result.m7377constructorimpl(numAEQbTJ);
            } catch (CancellationException e) {
                throw e;
            } catch (java.lang.Throwable th2) {
                Result.Application application2 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef2 = (Ref.ObjectRef) addressProfileInfoUseCase$updateNotificationInfo$1.L$1;
        objectRef3 = (Ref.ObjectRef) addressProfileInfoUseCase$updateNotificationInfo$1.L$0;
        try {
            C56391yDq.AEQbTJ(objCopydefault);
        } catch (java.lang.Throwable th3) {
            th = th3;
            objectRef = objectRef3;
            if (!(th instanceof OKServerException)) {
                numAEQbTJ = C56443yFo.AEQbTJ(th.getCode());
            }
            return Result.m7377constructorimpl(numAEQbTJ);
        }
        objectRef2.element = C56443yFo.AEQbTJ(((ResponseData) objCopydefault).getCode());
        objectRef = objectRef3;
        numAEQbTJ = (java.lang.Integer) objectRef.element;
        return Result.m7377constructorimpl(numAEQbTJ);
    }

    public final java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AddressProfileInfoUseCase$addressAddOrCancel$2$1(context, fragmentManager, str, z, cancellableContinuationImpl, null), 3, null);
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    public final java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.String> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AddressProfileInfoUseCase$updateAddressAlias$2$1(context, fragmentManager, str, str2, cancellableContinuationImpl, null), 3, null);
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}
