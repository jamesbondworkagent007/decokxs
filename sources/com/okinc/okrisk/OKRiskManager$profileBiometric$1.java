package com.okinc.okrisk;

import android.app.Application;
import android.hardware.SensorManager;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.okinc.okrisk.OKRiskManager$profileBiometric$1;
import com.okinc.okrisk.collection.sensors.SensorType;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import o.C32979mnm;
import o.C47000thl;
import o.C47016tiA;
import o.C47017tiB;
import o.C47064tiw;
import o.C47067tiz;
import o.C47136tkO;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.InterfaceC46999thk;
import o.pUU;
import o.yFI;

/* JADX INFO: loaded from: classes10.dex */
public final class OKRiskManager$profileBiometric$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKRiskLibrarySource $source;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRiskManager$profileBiometric$1(OKRiskLibrarySource oKRiskLibrarySource, Continuation<? super OKRiskManager$profileBiometric$1> continuation) {
        super(2, continuation);
        this.$source = oKRiskLibrarySource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKRiskManager$profileBiometric$1(this.$source, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKRiskManager$profileBiometric$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        final String strAEQbTJ;
        String strAEQbTJ2;
        String str;
        InterfaceC46999thk interfaceC46999thkFJNWhG;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("OKRiskManager", "profileBiometric " + this.$source);
            OKRiskPayloadManager oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
            if (oKRiskPayloadManager.fJNWhG() == null) {
                pUU.valueOf("OKRiskManager", "profileBiometric - Native library not loaded, skipping sensor collection");
                return Unit.INSTANCE;
            }
            try {
                C47000thl c47000thl = C47000thl.KWHzl;
                C32979mnm c32979mnm = C32979mnm.EZpvd;
                String strAEQbTJ3 = c47000thl.AEQbTJ(c32979mnm.OLrzqt(), "sensor.enabled");
                if (strAEQbTJ3.length() <= 0) {
                    strAEQbTJ3 = null;
                }
                if (strAEQbTJ3 == null) {
                    strAEQbTJ3 = "false";
                }
                try {
                    interfaceC46999thkFJNWhG = oKRiskPayloadManager.fJNWhG();
                } catch (Exception e) {
                    pUU.copydefault(new Function0() { // from class: o.thy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OKRiskManager$profileBiometric$1.invokeSuspend$lambda$3(e);
                        }
                    });
                } catch (UnsatisfiedLinkError e2) {
                    pUU.copydefault(new Function0() { // from class: o.thB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OKRiskManager$profileBiometric$1.invokeSuspend$lambda$2(e2);
                        }
                    });
                }
                if (interfaceC46999thkFJNWhG == null || (strAEQbTJ = interfaceC46999thkFJNWhG.AEQbTJ(c32979mnm.OLrzqt(), "version")) == null) {
                    strAEQbTJ = "1.0";
                } else {
                    if (strAEQbTJ.length() <= 0) {
                        strAEQbTJ = null;
                    }
                    if (strAEQbTJ == null) {
                    }
                }
                try {
                    strAEQbTJ2 = C47000thl.KWHzl.AEQbTJ(C32979mnm.EZpvd.OLrzqt(), "sensor.Frequency");
                    if (strAEQbTJ2.length() <= 0) {
                        strAEQbTJ2 = null;
                    }
                } catch (Exception e3) {
                    pUU.valueOf("OKRiskManager", "profileBiometric - Failed to read sensor.Frequency, using default: " + e3.getMessage());
                } catch (UnsatisfiedLinkError e4) {
                    pUU.valueOf("OKRiskManager", "profileBiometric - Native method not available, using default frequency: " + e4.getMessage());
                }
                if (strAEQbTJ2 == null) {
                    strAEQbTJ2 = "3";
                }
                try {
                    String strAEQbTJ4 = C47000thl.KWHzl.AEQbTJ(C32979mnm.EZpvd.OLrzqt(), "sensor.Duration");
                    str = strAEQbTJ4.length() > 0 ? strAEQbTJ4 : null;
                } catch (Exception e5) {
                    pUU.valueOf("OKRiskManager", "profileBiometric - Failed to read sensor.Duration, using default: " + e5.getMessage());
                } catch (UnsatisfiedLinkError e6) {
                    pUU.valueOf("OKRiskManager", "profileBiometric - Native method not available, using default duration: " + e6.getMessage());
                }
                if (str == null) {
                    str = "10";
                }
                pUU.KWHzl("OKRiskManager", "getConfigValues frequency=" + strAEQbTJ2 + ", enabled=" + strAEQbTJ3 + ", duration=" + str + " " + this.$source.getTag());
                if (!Intrinsics.EZpvd((Object) "true", (Object) strAEQbTJ3)) {
                    return Unit.INSTANCE;
                }
                C47064tiw c47064tiw = new C47064tiw(SensorType.ALL, 0, Integer.parseInt(str) * 1000, Integer.parseInt(strAEQbTJ2), 2, null);
                pUU.KWHzl("OKRiskManager", "config " + c47064tiw);
                GlobalScope globalScope = GlobalScope.INSTANCE;
                Object systemService = C32979mnm.EZpvd.OLrzqt().getSystemService("sensor");
                Intrinsics.copydefault(systemService, "");
                final SensorManager sensorManager = (SensorManager) systemService;
                pUU.KWHzl("OKRiskManager", "startCollectSensors " + sensorManager);
                C47067tiz c47067tiz = C47067tiz.KWHzl;
                final OKRiskLibrarySource oKRiskLibrarySource = this.$source;
                c47067tiz.copydefault(globalScope, sensorManager, c47064tiw, new Function1() { // from class: o.thA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return OKRiskManager$profileBiometric$1.invokeSuspend$lambda$8(sensorManager, oKRiskLibrarySource, strAEQbTJ, (C47017tiB) obj2);
                    }
                });
                return Unit.INSTANCE;
            } catch (Exception e7) {
                pUU.EZpvd("OKRiskManager", "profileBiometric - Failed to read sensor.enabled, skipping: " + e7.getMessage());
                return Unit.INSTANCE;
            } catch (UnsatisfiedLinkError e8) {
                pUU.EZpvd("OKRiskManager", "profileBiometric - Native method not available, cannot read sensor.enabled, skipping: " + e8.getMessage());
                return Unit.INSTANCE;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$2(UnsatisfiedLinkError unsatisfiedLinkError) {
        return "executeGccInvokeWithDecryption - Native library not available, using fallback version: " + unsatisfiedLinkError.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$3(Exception exc) {
        return "executeGccInvokeWithDecryption - Failed to read version from config, using fallback: " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$8(SensorManager sensorManager, OKRiskLibrarySource oKRiskLibrarySource, String str, C47017tiB c47017tiB) throws Throwable {
        pUU.KWHzl("OKRiskManager", "finishCollectSensors - Callback invoked, starting data preparation");
        try {
            String strCopydefault = C47016tiA.copydefault(c47017tiB.OLrzqt(SensorType.ALL), c47017tiB.KWHzl());
            pUU.KWHzl("OKRiskManager", "finishCollectSensors " + sensorManager + ", sensorData length=" + strCopydefault.length());
            Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            String strGEmmrt = C47136tkO.AEQbTJ.gEmmrt(applicationOLrzqt);
            pUU.KWHzl("OKRiskManager", "finishCollectSensors - Prepared data: did=" + strGEmmrt + ", scene=" + oKRiskLibrarySource.getTag() + ", configVersion=" + str);
            File[] fileArrListFiles = applicationOLrzqt.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    if (C59449zhJ.startsWith$default(name, "biometric_sensor_data_", false, 2, null)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((File) it.next()).delete();
                    } catch (Exception unused) {
                    }
                }
            }
            File file2 = new File(applicationOLrzqt.getCacheDir(), "biometric_sensor_data_" + System.currentTimeMillis() + ".json");
            try {
                yFI.writeText$default(file2, strCopydefault, null, 2, null);
                pUU.KWHzl("OKRiskManager", "finishCollectSensors - Saved sensor data to file: " + file2.getAbsolutePath());
                Data dataBuild = new Data.Builder().putString("sensor_data_file", file2.getAbsolutePath()).putString("config_version", str).putString(JwtUtilsKt.DID_PREFIX, strGEmmrt).putString("scene", oKRiskLibrarySource.getTag()).build();
                Intrinsics.checkNotNullExpressionValue(dataBuild, "");
                pUU.KWHzl("OKRiskManager", "finishCollectSensors - Created inputData with file path");
                OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(BiometricDispatchWorker.class).setInputData(dataBuild).build();
                pUU.KWHzl("OKRiskManager", "finishCollectSensors - Created WorkRequest");
                WorkManager.getInstance(applicationOLrzqt).enqueue(oneTimeWorkRequestBuild);
                pUU.KWHzl("OKRiskManager", "Enqueued BiometricDispatchWorker for background execution");
            } catch (Exception e) {
                pUU.AEQbTJ("OKRiskManager", "finishCollectSensors - Failed to save sensor data to file", e);
                return Unit.INSTANCE;
            }
        } catch (Exception e2) {
            pUU.AEQbTJ("OKRiskManager", "finishCollectSensors - Error enqueueing BiometricDispatchWorker", e2);
        }
        return Unit.INSTANCE;
    }
}
