package com.okinc.okrisk;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.okinc.okrisk.service.TypingSpeedBody;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C46979thQ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC47028tiM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class TypingSpeedUploadWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: com.okinc.okrisk.TypingSpeedUploadWorker$doWork$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TypingSpeedUploadWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypingSpeedUploadWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull Continuation<? super ListenableWorker.Result> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            String strEZpvd = C46979thQ.copydefault.OLrzqt().AhwBna().EZpvd();
            String strGEmmrt = C33129mqd.gEmmrt(getInputData().getString("payload"));
            String strGEmmrt2 = C33129mqd.gEmmrt(getInputData().getString(Web3SecurityTrackEvent.VALUE_INPUT));
            InterfaceC47028tiM interfaceC47028tiMEZpvd = InterfaceC47028tiM.Companion.EZpvd();
            TypingSpeedBody typingSpeedBody = new TypingSpeedBody(strEZpvd, strGEmmrt2, strGEmmrt);
            anonymousClass1.label = 1;
            if (interfaceC47028tiMEZpvd.KWHzl(typingSpeedBody, anonymousClass1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "");
        return resultSuccess;
    }
}
