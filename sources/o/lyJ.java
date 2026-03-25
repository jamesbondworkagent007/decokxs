package o;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.okinc.buysell.domain.CheckForGooglePayAvailabilityUseCase$invoke$1;
import com.okinc.buysell.domain.CheckForGooglePayAvailabilityUseCase$performGooglePayCheck$1;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okx.paymentapi.tracking.PaymentsReporterProperty;
import dagger.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.lyF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class lyJ {
    public final Lazy<PaymentsClient> EZpvd;
    public final Mutex KWHzl;
    public lyF.TaskDescription OLrzqt;

    @yCM
    public lyJ(@NotNull Lazy<PaymentsClient> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "");
        this.EZpvd = lazy;
        this.KWHzl = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [146=4] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0031, B:45:0x00ca, B:47:0x00d1), top: B:61:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, @NotNull Continuation<? super lyF.TaskDescription> continuation) throws java.lang.Throwable {
        CheckForGooglePayAvailabilityUseCase$invoke$1 checkForGooglePayAvailabilityUseCase$invoke$1;
        Mutex mutex;
        lyJ lyj;
        lyJ lyj2;
        Mutex mutex2;
        lyF.TaskDescription taskDescription;
        if (continuation instanceof CheckForGooglePayAvailabilityUseCase$invoke$1) {
            checkForGooglePayAvailabilityUseCase$invoke$1 = (CheckForGooglePayAvailabilityUseCase$invoke$1) continuation;
            int i = checkForGooglePayAvailabilityUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkForGooglePayAvailabilityUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkForGooglePayAvailabilityUseCase$invoke$1 = new CheckForGooglePayAvailabilityUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = checkForGooglePayAvailabilityUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkForGooglePayAvailabilityUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                mutex = this.KWHzl;
                checkForGooglePayAvailabilityUseCase$invoke$1.L$0 = this;
                checkForGooglePayAvailabilityUseCase$invoke$1.L$1 = channel;
                checkForGooglePayAvailabilityUseCase$invoke$1.L$2 = mutex;
                checkForGooglePayAvailabilityUseCase$invoke$1.label = 1;
                if (mutex.lock(null, checkForGooglePayAvailabilityUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                lyj = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) checkForGooglePayAvailabilityUseCase$invoke$1.L$1;
                    lyj2 = (lyJ) checkForGooglePayAvailabilityUseCase$invoke$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        taskDescription = (lyF.TaskDescription) obj;
                        if (!(taskDescription instanceof lyF.TaskDescription.Activity)) {
                            lyj2.OLrzqt = taskDescription;
                        }
                        mutex2.unlock(null);
                        return obj;
                    } catch (java.lang.Throwable th) {
                        mutex = mutex2;
                        th = th;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                Mutex mutex3 = (Mutex) checkForGooglePayAvailabilityUseCase$invoke$1.L$2;
                com.okinc.okpaymentapi.data.remote.model.management.Channel channel2 = (com.okinc.okpaymentapi.data.remote.model.management.Channel) checkForGooglePayAvailabilityUseCase$invoke$1.L$1;
                lyj = (lyJ) checkForGooglePayAvailabilityUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(obj);
                mutex = mutex3;
                channel = channel2;
            }
            java.util.List<PaymentMethod> paymentMethods = channel.getPaymentMethods();
            if (paymentMethods != null && !paymentMethods.isEmpty() && ((PaymentMethod) CollectionsKt___CollectionsKt.AuCTelauCTel(paymentMethods)).getAccount() != null) {
                com.okinc.okpaymentapi.data.remote.model.management.Account account = ((PaymentMethod) CollectionsKt___CollectionsKt.AuCTelauCTel(paymentMethods)).getAccount();
                Intrinsics.copydefault(account);
                java.lang.String merchantId = account.getMerchantId();
                if (merchantId != null && merchantId.length() != 0) {
                    com.okinc.okpaymentapi.data.remote.model.management.Account account2 = ((PaymentMethod) CollectionsKt___CollectionsKt.AuCTelauCTel(paymentMethods)).getAccount();
                    Intrinsics.copydefault(account2);
                    boolean allowCreditCard = account2.getAllowCreditCard();
                    lyF.TaskDescription taskDescription2 = lyj.OLrzqt;
                    if (taskDescription2 != null) {
                        mutex.unlock(null);
                        return taskDescription2;
                    }
                    checkForGooglePayAvailabilityUseCase$invoke$1.L$0 = lyj;
                    checkForGooglePayAvailabilityUseCase$invoke$1.L$1 = mutex;
                    checkForGooglePayAvailabilityUseCase$invoke$1.L$2 = null;
                    checkForGooglePayAvailabilityUseCase$invoke$1.label = 2;
                    java.lang.Object objAEQbTJ = lyj.AEQbTJ(allowCreditCard, checkForGooglePayAvailabilityUseCase$invoke$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    lyj2 = lyj;
                    Mutex mutex4 = mutex;
                    obj = objAEQbTJ;
                    mutex2 = mutex4;
                    taskDescription = (lyF.TaskDescription) obj;
                    if (!(taskDescription instanceof lyF.TaskDescription.Activity)) {
                    }
                    mutex2.unlock(null);
                    return obj;
                }
                lyF.TaskDescription.ActionBar actionBar = new lyF.TaskDescription.ActionBar(0, "Google Pay not available. Missing merchant ID");
                mutex.unlock(null);
                return actionBar;
            }
            lyF.TaskDescription.ActionBar actionBar2 = new lyF.TaskDescription.ActionBar(0, "Google Pay not permitted by backend");
            mutex.unlock(null);
            return actionBar2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078 A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:12:0x0031, B:30:0x0070, B:32:0x0078, B:33:0x007b, B:17:0x0043, B:24:0x0059, B:26:0x0061, B:27:0x0065, B:20:0x004a), top: B:42:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[Catch: Exception -> 0x0081, TRY_LEAVE, TryCatch #0 {Exception -> 0x0081, blocks: (B:12:0x0031, B:30:0x0070, B:32:0x0078, B:33:0x007b, B:17:0x0043, B:24:0x0059, B:26:0x0061, B:27:0x0065, B:20:0x004a), top: B:42:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(boolean z, Continuation<? super lyF.TaskDescription> continuation) throws java.lang.Throwable {
        CheckForGooglePayAvailabilityUseCase$performGooglePayCheck$1 checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1;
        lyF.TaskDescription.ActionBar actionBar;
        lyJ lyj;
        boolean z2 = z;
        if (continuation instanceof CheckForGooglePayAvailabilityUseCase$performGooglePayCheck$1) {
            checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1 = (CheckForGooglePayAvailabilityUseCase$performGooglePayCheck$1) continuation;
            int i = checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1.label = i - Integer.MIN_VALUE;
            } else {
                checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1 = new CheckForGooglePayAvailabilityUseCase$performGooglePayCheck$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1.label;
        int i3 = 13;
        int i4 = 2;
        java.lang.String str = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1.L$0 = this;
                checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1.Z$0 = z2;
                checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1.label = 1;
                objAEQbTJ = AEQbTJ(z2, false, checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                lyj = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    if (((java.lang.Boolean) objAEQbTJ).booleanValue()) {
                        return new lyF.TaskDescription.ActionBar(i3, str, i4, b3 == true ? 1 : 0);
                    }
                    return lyF.TaskDescription.Activity.copydefault;
                }
                z2 = checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1.Z$0;
                lyj = (lyJ) checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            if (((java.lang.Boolean) objAEQbTJ).booleanValue()) {
                return lyF.TaskDescription.Application.OLrzqt;
            }
            checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1.L$0 = null;
            checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1.label = 2;
            objAEQbTJ = lyj.AEQbTJ(z2, true, checkForGooglePayAvailabilityUseCase$performGooglePayCheck$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            if (((java.lang.Boolean) objAEQbTJ).booleanValue()) {
            }
        } catch (java.lang.Exception e) {
            java.lang.String strReplace$default = "Error (unknown) performing Google Pay availability check: " + e.getMessage();
            if (e instanceof ApiException) {
                ApiException apiException = (ApiException) e;
                strReplace$default = C59449zhJ.replace$default(strReplace$default, "(unknown)", java.lang.String.valueOf(apiException.getStatusCode()), false, 4, (java.lang.Object) null);
                actionBar = new lyF.TaskDescription.ActionBar(apiException.getStatusCode(), e.getMessage());
            } else {
                actionBar = new lyF.TaskDescription.ActionBar(i3, b2 == true ? 1 : 0, i4, b == true ? 1 : 0);
            }
            C31349lsO.trackPaymentsEvent$default(C31349lsO.EZpvd, null, PaymentsReporterProperty.PaymentsReportAttrPage.BSC_SIMPLE_TRADE.getType(), PaymentsReporterProperty.PaymentsReportAttrType.BUY.getType(), "GOOGLE_PAY_BUY", null, null, null, null, null, null, "4864", strReplace$default, null, 5105, null);
            return actionBar;
        }
    }

    public final java.lang.Object AEQbTJ(boolean z, boolean z2, Continuation<? super java.lang.Boolean> continuation) {
        IsReadyToPayRequest isReadyToPayRequestFromJson = IsReadyToPayRequest.fromJson(java.lang.String.valueOf(lTW.KWHzl.KWHzl(z, z2)));
        Intrinsics.checkNotNullExpressionValue(isReadyToPayRequestFromJson, "");
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ((PaymentsClient) this.EZpvd.get()).isReadyToPay(isReadyToPayRequestFromJson).addOnSuccessListener(new OnSuccessListener(new Activity(cancellableContinuationImpl)) { // from class: o.lyJ.ActionBar
            public final /* synthetic */ Function1 KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                Intrinsics.checkNotNullParameter(function1, "");
                this.KWHzl = function1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(java.lang.Object obj) {
                this.KWHzl.invoke(obj);
            }
        }).addOnFailureListener(new TaskDescription(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    public static final class Activity implements Function1<java.lang.Boolean, Unit> {
        public final /* synthetic */ CancellableContinuation<java.lang.Boolean> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(CancellableContinuation<? super java.lang.Boolean> cancellableContinuation) {
            this.EZpvd = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            KWHzl(bool);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.Boolean bool) {
            CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.EZpvd;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(bool));
        }
    }

    public static final class TaskDescription implements OnFailureListener {
        public final /* synthetic */ CancellableContinuation<java.lang.Boolean> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(CancellableContinuation<? super java.lang.Boolean> cancellableContinuation) {
            this.AEQbTJ = cancellableContinuation;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(java.lang.Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.AEQbTJ;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(exc)));
        }
    }
}
