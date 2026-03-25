package com.okinc.liveness.eop.viewmodel;

import com.amplifyframework.auth.AWSTemporaryCredentials;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.core.Consumer;
import com.ibm.icu.text.DateFormat;
import com.okinc.liveness.eop.viewmodel.ProxyAWSCredentialProvider$fetchAWSCredentials$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C38260pSe;
import o.C5173Hn;
import o.C56391yDq;
import o.C56442yFn;
import o.Character;
import o.Enum;
import o.IllegalArgumentException;
import o.IllegalMonitorStateException;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class ProxyAWSCredentialProvider$fetchAWSCredentials$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Character $identityPoolClient;
    final /* synthetic */ Consumer<AuthException> $onError;
    final /* synthetic */ Consumer<AWSTemporaryCredentials> $onSuccess;
    long J$0;
    int label;
    final /* synthetic */ C38260pSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProxyAWSCredentialProvider$fetchAWSCredentials$1(Consumer<AWSTemporaryCredentials> consumer, Consumer<AuthException> consumer2, Character character, C38260pSe c38260pSe, Continuation<? super ProxyAWSCredentialProvider$fetchAWSCredentials$1> continuation) {
        super(2, continuation);
        this.$onSuccess = consumer;
        this.$onError = consumer2;
        this.$identityPoolClient = character;
        this.this$0 = c38260pSe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProxyAWSCredentialProvider$fetchAWSCredentials$1(this.$onSuccess, this.$onError, this.$identityPoolClient, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProxyAWSCredentialProvider$fetchAWSCredentials$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae A[Catch: Exception -> 0x00f3, TryCatch #0 {Exception -> 0x00f3, blocks: (B:7:0x0015, B:22:0x008a, B:24:0x00ae, B:26:0x00b4, B:28:0x00ba, B:30:0x00c0, B:32:0x00c6, B:34:0x00cc, B:36:0x00d2, B:39:0x00da, B:41:0x00ed, B:12:0x0023, B:18:0x0046, B:15:0x002a), top: B:47:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba A[Catch: Exception -> 0x00f3, TryCatch #0 {Exception -> 0x00f3, blocks: (B:7:0x0015, B:22:0x008a, B:24:0x00ae, B:26:0x00b4, B:28:0x00ba, B:30:0x00c0, B:32:0x00c6, B:34:0x00cc, B:36:0x00d2, B:39:0x00da, B:41:0x00ed, B:12:0x0023, B:18:0x0046, B:15:0x002a), top: B:47:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6 A[Catch: Exception -> 0x00f3, TryCatch #0 {Exception -> 0x00f3, blocks: (B:7:0x0015, B:22:0x008a, B:24:0x00ae, B:26:0x00b4, B:28:0x00ba, B:30:0x00c0, B:32:0x00c6, B:34:0x00cc, B:36:0x00d2, B:39:0x00da, B:41:0x00ed, B:12:0x0023, B:18:0x0046, B:15:0x002a), top: B:47:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2 A[Catch: Exception -> 0x00f3, TryCatch #0 {Exception -> 0x00f3, blocks: (B:7:0x0015, B:22:0x008a, B:24:0x00ae, B:26:0x00b4, B:28:0x00ba, B:30:0x00c0, B:32:0x00c6, B:34:0x00cc, B:36:0x00d2, B:39:0x00da, B:41:0x00ed, B:12:0x0023, B:18:0x0046, B:15:0x002a), top: B:47:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da A[Catch: Exception -> 0x00f3, TryCatch #0 {Exception -> 0x00f3, blocks: (B:7:0x0015, B:22:0x008a, B:24:0x00ae, B:26:0x00b4, B:28:0x00ba, B:30:0x00c0, B:32:0x00c6, B:34:0x00cc, B:36:0x00d2, B:39:0x00da, B:41:0x00ed, B:12:0x0023, B:18:0x0046, B:15:0x002a), top: B:47:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed A[Catch: Exception -> 0x00f3, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f3, blocks: (B:7:0x0015, B:22:0x008a, B:24:0x00ae, B:26:0x00b4, B:28:0x00ba, B:30:0x00c0, B:32:0x00c6, B:34:0x00cc, B:36:0x00d2, B:39:0x00da, B:41:0x00ed, B:12:0x0023, B:18:0x0046, B:15:0x002a), top: B:47:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        long j;
        AWSTemporaryCredentials aWSTemporaryCredentials;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.KWHzl("kyc_in_house", "ProxyAWSCredentialProvider e=" + e);
            this.$onError.accept(new AuthException(String.valueOf(e.getMessage()), String.valueOf(e.getMessage()), e));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ProxyAWSCredentialProvider$fetchAWSCredentials$1$_identityId$1 proxyAWSCredentialProvider$fetchAWSCredentials$1$_identityId$1 = new ProxyAWSCredentialProvider$fetchAWSCredentials$1$_identityId$1(this.$identityPoolClient, this.this$0, null);
            this.J$0 = jCurrentTimeMillis;
            this.label = 1;
            obj = BuildersKt.withContext(io2, proxyAWSCredentialProvider$fetchAWSCredentials$1$_identityId$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                C56391yDq.AEQbTJ(obj);
                IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj;
                pUU.KWHzl("kyc_in_house", "ProxyAWSCredentialProvider getCredentialsForIdentity time=" + (System.currentTimeMillis() - j) + DateFormat.MINUTE_SECOND);
                Enum enumAEQbTJ = illegalArgumentException.AEQbTJ();
                String strAEQbTJ = enumAEQbTJ == null ? enumAEQbTJ.AEQbTJ() : null;
                Enum enumAEQbTJ2 = illegalArgumentException.AEQbTJ();
                String strKWHzl = enumAEQbTJ2 == null ? enumAEQbTJ2.KWHzl() : null;
                Enum enumAEQbTJ3 = illegalArgumentException.AEQbTJ();
                String strCopydefault = enumAEQbTJ3 == null ? enumAEQbTJ3.copydefault() : null;
                Enum enumAEQbTJ4 = illegalArgumentException.AEQbTJ();
                C5173Hn c5173HnEZpvd = enumAEQbTJ4 == null ? enumAEQbTJ4.EZpvd() : null;
                aWSTemporaryCredentials = c5173HnEZpvd != null ? new AWSTemporaryCredentials(String.valueOf(strAEQbTJ), String.valueOf(strKWHzl), String.valueOf(strCopydefault), c5173HnEZpvd) : null;
                if (aWSTemporaryCredentials != null) {
                    this.$onSuccess.accept(aWSTemporaryCredentials);
                }
                return Unit.INSTANCE;
            }
            jCurrentTimeMillis = this.J$0;
            C56391yDq.AEQbTJ(obj);
        }
        final String str = (String) obj;
        pUU.KWHzl("kyc_in_house", "ProxyAWSCredentialProvider getId time=" + (System.currentTimeMillis() - jCurrentTimeMillis) + DateFormat.MINUTE_SECOND);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        IllegalMonitorStateException illegalMonitorStateExceptionCopydefault = IllegalMonitorStateException.copydefault.copydefault(new Function1() { // from class: o.pSb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ProxyAWSCredentialProvider$fetchAWSCredentials$1.invokeSuspend$lambda$0(str, (IllegalMonitorStateException.Application) obj2);
            }
        });
        CoroutineDispatcher io3 = Dispatchers.getIO();
        ProxyAWSCredentialProvider$fetchAWSCredentials$1$getCredentialsForIdentityResult$1 proxyAWSCredentialProvider$fetchAWSCredentials$1$getCredentialsForIdentityResult$1 = new ProxyAWSCredentialProvider$fetchAWSCredentials$1$getCredentialsForIdentityResult$1(this.$identityPoolClient, illegalMonitorStateExceptionCopydefault, null);
        this.J$0 = jCurrentTimeMillis2;
        this.label = 2;
        obj = BuildersKt.withContext(io3, proxyAWSCredentialProvider$fetchAWSCredentials$1$getCredentialsForIdentityResult$1, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        j = jCurrentTimeMillis2;
        IllegalArgumentException illegalArgumentException2 = (IllegalArgumentException) obj;
        pUU.KWHzl("kyc_in_house", "ProxyAWSCredentialProvider getCredentialsForIdentity time=" + (System.currentTimeMillis() - j) + DateFormat.MINUTE_SECOND);
        Enum enumAEQbTJ5 = illegalArgumentException2.AEQbTJ();
        if (enumAEQbTJ5 == null) {
        }
        Enum enumAEQbTJ22 = illegalArgumentException2.AEQbTJ();
        if (enumAEQbTJ22 == null) {
        }
        Enum enumAEQbTJ32 = illegalArgumentException2.AEQbTJ();
        if (enumAEQbTJ32 == null) {
        }
        Enum enumAEQbTJ42 = illegalArgumentException2.AEQbTJ();
        if (enumAEQbTJ42 == null) {
        }
        if (c5173HnEZpvd != null) {
        }
        if (aWSTemporaryCredentials != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(String str, IllegalMonitorStateException.Application application) {
        application.OLrzqt(str);
        return Unit.INSTANCE;
    }
}
