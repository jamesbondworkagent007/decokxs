package com.okinc.okrisk;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yFI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class BiometricDispatchWorker extends Worker {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricDispatchWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        File file;
        try {
            String string = getInputData().getString("sensor_data_file");
            String string2 = getInputData().getString("config_version");
            if (string2 == null) {
                string2 = "1.0";
            }
            String str = string2;
            String string3 = getInputData().getString(JwtUtilsKt.DID_PREFIX);
            String string4 = getInputData().getString("scene");
            if (string != null && string.length() != 0 && string3 != null && string3.length() != 0) {
                file = new File(string);
                try {
                    if (!file.exists()) {
                        pUU.copydefault("BiometricDispatchWorker", "BiometricDispatchWorker: Sensor data file does not exist: " + string);
                        ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
                        Intrinsics.checkNotNullExpressionValue(resultFailure, "");
                        return resultFailure;
                    }
                    String text$default = yFI.readText$default(file, null, 1, null);
                    if (text$default.length() == 0) {
                        pUU.copydefault("BiometricDispatchWorker", "BiometricDispatchWorker: Sensor data file is empty");
                        ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
                        Intrinsics.checkNotNullExpressionValue(resultFailure2, "");
                        return resultFailure2;
                    }
                    pUU.KWHzl("BiometricDispatchWorker", "BiometricDispatchWorker: Starting dispatch with scene=" + string4 + ", did=" + string3 + ", dataSize=" + text$default.length());
                    BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(text$default, str, string3, string4, null), 1, null);
                    pUU.KWHzl("BiometricDispatchWorker", "BiometricDispatchWorker: Successfully dispatched biometric data");
                    try {
                        if (file.exists() && file.delete()) {
                            pUU.KWHzl("BiometricDispatchWorker", "BiometricDispatchWorker: Deleted temporary sensor data file");
                        }
                    } catch (Exception e) {
                        pUU.OLrzqt("BiometricDispatchWorker", "BiometricDispatchWorker: Failed to delete temporary file", e);
                    }
                    ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
                    Intrinsics.copydefault(resultSuccess);
                    return resultSuccess;
                } catch (Exception e2) {
                    e = e2;
                    pUU.AEQbTJ("BiometricDispatchWorker", "BiometricDispatchWorker: Failed to dispatch biometric data", e);
                    if (file != null) {
                        try {
                            File file2 = file.exists() ? file : null;
                            if (file2 != null) {
                                file2.delete();
                            }
                        } catch (Exception e3) {
                            pUU.OLrzqt("BiometricDispatchWorker", "BiometricDispatchWorker: Failed to cleanup file after error", e3);
                            ListenableWorker.Result resultFailure3 = ListenableWorker.Result.failure();
                            Intrinsics.copydefault(resultFailure3);
                            return resultFailure3;
                        }
                    }
                    pUU.KWHzl("BiometricDispatchWorker", "BiometricDispatchWorker: Deleted temporary file after error");
                    ListenableWorker.Result resultFailure32 = ListenableWorker.Result.failure();
                    Intrinsics.copydefault(resultFailure32);
                    return resultFailure32;
                }
            }
            pUU.copydefault("BiometricDispatchWorker", "BiometricDispatchWorker: Missing required data (sensorDataFilePath or did is empty)");
            ListenableWorker.Result resultFailure4 = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure4, "");
            return resultFailure4;
        } catch (Exception e4) {
            e = e4;
            file = null;
        }
    }

    /* JADX INFO: renamed from: com.okinc.okrisk.BiometricDispatchWorker$doWork$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $configVersion;
        final /* synthetic */ String $did;
        final /* synthetic */ String $scene;
        final /* synthetic */ String $sensorData;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, String str4, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sensorData = str;
            this.$configVersion = str2;
            this.$did = str3;
            this.$scene = str4;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$sensorData, this.$configVersion, this.$did, this.$scene, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                OKRiskPayloadManager oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
                Action action = Action.EVENT;
                String str = this.$sensorData;
                String str2 = this.$configVersion;
                String str3 = this.$did;
                String str4 = this.$scene;
                if (str4 == null) {
                    str4 = "";
                }
                this.label = 1;
                if (oKRiskPayloadManager.copydefault((12 & 1) != 0 ? Action.EVENT : action, str, (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? null : null, 1, str2, str3, str4, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okrisk.BiometricDispatchWorker.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
