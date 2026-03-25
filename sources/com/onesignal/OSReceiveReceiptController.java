package com.onesignal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import java.util.concurrent.TimeUnit;
import o.C57752yoO;
import o.C57754yoQ;
import o.C57826ypj;
import o.C57837ypu;

/* JADX INFO: loaded from: classes12.dex */
public class OSReceiveReceiptController {
    public static OSReceiveReceiptController EZpvd;
    public int KWHzl = 0;
    public int copydefault = 25;
    public final C57752yoO AEQbTJ = OneSignal.QOLQEE();

    private OSReceiveReceiptController() {
    }

    public static OSReceiveReceiptController OLrzqt() {
        OSReceiveReceiptController oSReceiveReceiptController;
        synchronized (OSReceiveReceiptController.class) {
            if (EZpvd == null) {
                EZpvd = new OSReceiveReceiptController();
            }
            oSReceiveReceiptController = EZpvd;
        }
        return oSReceiveReceiptController;
    }

    public void EZpvd(Context context, String str) {
        if (!this.AEQbTJ.isConnected()) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "sendReceiveReceipt disabled");
            return;
        }
        int iAEQbTJ = OSUtils.AEQbTJ(this.KWHzl, this.copydefault);
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(ReceiveReceiptWorker.class).setConstraints(KWHzl()).setInitialDelay(iAEQbTJ, TimeUnit.SECONDS).setInputData(new Data.Builder().putString("os_notification_id", str).build()).build();
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + str + " and delay: " + iAEQbTJ + " seconds");
        WorkManager workManagerOLrzqt = C57826ypj.OLrzqt(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_receive_receipt");
        workManagerOLrzqt.enqueueUniqueWork(sb.toString(), ExistingWorkPolicy.KEEP, oneTimeWorkRequestBuild);
    }

    public Constraints KWHzl() {
        return new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
    }

    public static class ReceiveReceiptWorker extends Worker {
        public ReceiveReceiptWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        @Override // androidx.work.Worker
        public ListenableWorker.Result doWork() {
            OLrzqt(getInputData().getString("os_notification_id"));
            return ListenableWorker.Result.success();
        }

        public void OLrzqt(@NonNull final String str) {
            Integer numValueOf;
            String str2 = OneSignal.AhwBna;
            String strQbewEr = (str2 == null || str2.isEmpty()) ? OneSignal.QbewEr() : OneSignal.AhwBna;
            String strFinit = OneSignal.finit();
            C57754yoQ c57754yoQ = new C57754yoQ();
            try {
                numValueOf = Integer.valueOf(new OSUtils().uzCIH());
            } catch (NullPointerException e) {
                e.printStackTrace();
                numValueOf = null;
            }
            Integer num = numValueOf;
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "ReceiveReceiptWorker: Device Type is: " + num);
            c57754yoQ.KWHzl(strQbewEr, strFinit, num, str, new C57837ypu.TaskDescription() { // from class: com.onesignal.OSReceiveReceiptController.ReceiveReceiptWorker.3
                @Override // o.C57837ypu.TaskDescription
                public void OLrzqt(String str3) {
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Receive receipt sent for notificationID: " + str);
                }

                @Override // o.C57837ypu.TaskDescription
                public void OLrzqt(int i, String str3, Throwable th) {
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.ERROR, "Receive receipt failed with statusCode: " + i + " response: " + str3);
                }
            });
        }
    }
}
