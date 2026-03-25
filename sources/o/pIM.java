package o;

import com.okinc.lib.dionysus.crash.DeviceInfoHelper;
import com.okinc.lib.dionysus.crash.bean.AttachmentReportBody;
import com.okinc.lib.dionysus.crash.bean.ErrorAttachmentLog;
import com.okinc.lib.utils.OkUtils;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C38002pIp;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pIM {
    public static final java.lang.String AEQbTJ;
    public static final java.lang.String AYXKKw;
    public static final MediaType EZpvd;
    public static final int KWHzl;
    public static final pIM OLrzqt;
    public static final OkHttpClient.Builder copydefault;
    public static final OkHttpClient valueOf;

    private pIM() {
    }

    static {
        pIM pim = new pIM();
        OLrzqt = pim;
        AEQbTJ = pIM.class.getSimpleName();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        OkHttpClient.Builder timeout = builder.callTimeout(20L, timeUnit).connectTimeout(20L, timeUnit).readTimeout(20L, timeUnit);
        copydefault = timeout;
        valueOf = timeout.build();
        EZpvd = MediaType.Companion.get("application/json");
        AYXKKw = pim.AEQbTJ(OkUtils.copydefault(), "SAFE_MODEL_SECRET");
        KWHzl = 8;
    }

    public final void AEQbTJ(@NotNull java.io.File file, pIQ piq, boolean z) {
        Intrinsics.checkNotNullParameter(file, "");
        EZpvd(file, AYXKKw, piq, z);
    }

    public final void EZpvd(@NotNull java.io.File file, java.lang.String str, pIQ piq, boolean z) {
        Intrinsics.checkNotNullParameter(file, "");
        java.lang.String strAEQbTJ = C38057pKq.AEQbTJ(file);
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        C38002pIp.Application application = C38002pIp.Companion;
        InterfaceC38050pKj interfaceC38050pKjIwGUEr = application.iwGUEr();
        java.lang.String str2 = AEQbTJ;
        interfaceC38050pKjIwGUEr.OLrzqt(str2, "postCrash file: " + file.getAbsolutePath());
        application.iwGUEr().OLrzqt(str2, "postCrash message: " + strAEQbTJ);
        if (android.text.TextUtils.isEmpty(strAEQbTJ)) {
            return;
        }
        if (str == null && (str = AYXKKw) == null) {
            str = "7f854fa3-7ab0-4259-8b9c-56e5caea23a7";
        }
        application.iwGUEr().OLrzqt(str2, "smSecret " + str + " ");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            RequestBody requestBodyCreate = RequestBody.Companion.create(EZpvd, strAEQbTJ);
            Request.Builder builderAddHeader = new Request.Builder().url("https://in.appcenter.ms/logs?Api-Version=1.0.0").addHeader("Content-Type", "application/json");
            java.lang.String string = OLrzqt().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            Request requestBuild = builderAddHeader.addHeader("Install-ID", string).addHeader("App-Secret", str).post(requestBodyCreate).build();
            application.iwGUEr().OLrzqt(str2, "postCrash request " + requestBuild + " ");
            valueOf.newCall(requestBuild).enqueue(new TaskDescription(piq, countDownLatch, file));
            if (z) {
                application.iwGUEr().OLrzqt(str2, "postCrash latch await");
                countDownLatch.await(3L, java.util.concurrent.TimeUnit.SECONDS);
                application.iwGUEr().OLrzqt(str2, "postCrash latch pass");
            }
        } catch (java.lang.Exception e) {
            C38002pIp.Companion.iwGUEr().EZpvd(AEQbTJ, "postCrash e: " + e);
        }
    }

    public static final class TaskDescription implements okhttp3.Callback {
        public final /* synthetic */ java.io.File AEQbTJ;
        public final /* synthetic */ pIQ EZpvd;
        public final /* synthetic */ CountDownLatch OLrzqt;

        public TaskDescription(pIQ piq, CountDownLatch countDownLatch, java.io.File file) {
            this.EZpvd = piq;
            this.OLrzqt = countDownLatch;
            this.AEQbTJ = file;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, java.io.IOException iOException) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            pIQ piq = this.EZpvd;
            if (piq != null) {
                piq.copydefault(iOException, iOException.getMessage());
            }
            InterfaceC38050pKj interfaceC38050pKjIwGUEr = C38002pIp.Companion.iwGUEr();
            java.lang.String str = pIM.AEQbTJ;
            java.lang.String message = iOException.getMessage();
            iOException.printStackTrace();
            interfaceC38050pKjIwGUEr.EZpvd(str, "postCrash onResponse onFailure " + message + " " + Unit.INSTANCE);
            this.OLrzqt.countDown();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            C38002pIp.Application application = C38002pIp.Companion;
            InterfaceC38050pKj interfaceC38050pKjIwGUEr = application.iwGUEr();
            java.lang.String str = pIM.AEQbTJ;
            ResponseBody responseBodyBody = response.body();
            interfaceC38050pKjIwGUEr.OLrzqt(str, "postCrash onResponse stringBody:" + (responseBodyBody != null ? responseBodyBody.string() : null));
            if (response.body() != null && response.code() == 200) {
                pIQ piq = this.EZpvd;
                if (piq != null) {
                    piq.EZpvd(this.AEQbTJ);
                }
                pIM pim = pIM.OLrzqt;
                java.lang.String strDjBIcL = C38063pKw.djBIcL(this.AEQbTJ);
                Intrinsics.checkNotNullExpressionValue(strDjBIcL, "");
                pim.copydefault(strDjBIcL);
            } else {
                pIQ piq2 = this.EZpvd;
                if (piq2 != null) {
                    piq2.copydefault(null, "Response code:" + response.code());
                }
                application.iwGUEr().EZpvd(pIM.AEQbTJ, "postCrash onResponse error");
            }
            this.OLrzqt.countDown();
        }
    }

    public static /* synthetic */ void postAttachment$default(pIM pim, java.lang.String str, pIJ pij, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            pij = null;
        }
        pim.AEQbTJ(str, pij);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, pIJ pij) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(str, null, pij);
    }

    public static /* synthetic */ void postAttachment$default(pIM pim, java.lang.String str, java.lang.String str2, pIJ pij, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            pij = null;
        }
        pim.KWHzl(str, str2, pij);
    }

    public final void KWHzl(@NotNull java.lang.String str, java.lang.String str2, pIJ pij) {
        Intrinsics.checkNotNullParameter(str, "");
        C38002pIp.Application application = C38002pIp.Companion;
        InterfaceC38050pKj interfaceC38050pKjIwGUEr = application.iwGUEr();
        java.lang.String str3 = AEQbTJ;
        interfaceC38050pKjIwGUEr.OLrzqt(str3, "postAttachment postError " + str);
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null && (str2 = AYXKKw) == null) {
            str2 = "7f854fa3-7ab0-4259-8b9c-56e5caea23a7";
        }
        try {
            RequestBody requestBodyCreate = RequestBody.Companion.create(EZpvd, str);
            Request.Builder builderAddHeader = new Request.Builder().url("https://in.appcenter.ms/logs?Api-Version=1.0.0").addHeader("Content-Type", "application/json");
            java.lang.String string = OLrzqt().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            Request requestBuild = builderAddHeader.addHeader("Install-ID", string).addHeader("App-Secret", str2).post(requestBodyCreate).build();
            application.iwGUEr().OLrzqt(str3, "postAttachment request " + requestBuild + " ");
            valueOf.newCall(requestBuild).enqueue(new Application(pij));
            application.iwGUEr().OLrzqt(str3, "postAttachment end");
        } catch (java.lang.Exception e) {
            C38002pIp.Companion.iwGUEr().EZpvd(AEQbTJ, "postAttachment e: " + e);
        }
    }

    public static final class Application implements okhttp3.Callback {
        public final /* synthetic */ pIJ OLrzqt;

        public Application(pIJ pij) {
            this.OLrzqt = pij;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, java.io.IOException iOException) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            pIJ pij = this.OLrzqt;
            if (pij != null) {
                pij.copydefault(iOException, iOException.getMessage());
            }
            InterfaceC38050pKj interfaceC38050pKjIwGUEr = C38002pIp.Companion.iwGUEr();
            java.lang.String str = pIM.AEQbTJ;
            java.lang.String message = iOException.getMessage();
            iOException.printStackTrace();
            interfaceC38050pKjIwGUEr.EZpvd(str, "postAttachment onResponse onFailure " + message + " " + Unit.INSTANCE);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            C38002pIp.Application application = C38002pIp.Companion;
            InterfaceC38050pKj interfaceC38050pKjIwGUEr = application.iwGUEr();
            java.lang.String str = pIM.AEQbTJ;
            ResponseBody responseBodyBody = response.body();
            interfaceC38050pKjIwGUEr.EZpvd(str, "postAttachment onResponse stringBody:" + (responseBodyBody != null ? responseBodyBody.string() : null));
            if (response.body() != null && response.code() == 200) {
                pIJ pij = this.OLrzqt;
                if (pij != null) {
                    pij.EZpvd();
                    return;
                }
                return;
            }
            pIJ pij2 = this.OLrzqt;
            if (pij2 != null) {
                pij2.copydefault(null, "Response code:" + response.code());
            }
            application.iwGUEr().EZpvd(pIM.AEQbTJ, "postAttachment onResponse error");
        }
    }

    public final void copydefault(@NotNull java.lang.String str) {
        java.lang.Iterable<ErrorAttachmentLog> iterableKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            C38002pIp.Application application = C38002pIp.Companion;
            application.iwGUEr().OLrzqt(AEQbTJ, "sendErrorAttachment start");
            pIB pibOLrzqt = application.OLrzqt();
            if (pibOLrzqt == null || (iterableKWHzl = pibOLrzqt.KWHzl()) == null) {
                return;
            }
            for (ErrorAttachmentLog errorAttachmentLog : iterableKWHzl) {
                C38002pIp.Companion.iwGUEr().OLrzqt(AEQbTJ, "sendErrorAttachment fileName: " + errorAttachmentLog.getFileName());
                errorAttachmentLog.setId(UUID.randomUUID());
                errorAttachmentLog.setErrorId(UUID.fromString(str));
                errorAttachmentLog.setDevice(DeviceInfoHelper.KWHzl(OkUtils.copydefault()));
                AttachmentReportBody attachmentReportBody = new AttachmentReportBody();
                attachmentReportBody.getLogs().add(errorAttachmentLog);
                postAttachment$default(OLrzqt, C33490mxT.OLrzqt(attachmentReportBody), null, 2, null);
            }
        } catch (java.lang.Exception e) {
            C38002pIp.Companion.iwGUEr().EZpvd(AEQbTJ, "sendErrorAttachment e:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public final java.lang.String AEQbTJ(android.content.Context context, @NotNull java.lang.String str) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(str, "");
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "");
                android.os.Bundle bundle = applicationInfo.metaData;
                if (bundle != null && (obj = bundle.get(str)) != null) {
                    return obj.toString();
                }
            }
        } catch (java.lang.Exception e) {
            InterfaceC38050pKj interfaceC38050pKjIwGUEr = C38002pIp.Companion.iwGUEr();
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e);
            Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
            interfaceC38050pKjIwGUEr.EZpvd("tag", stackTraceString);
        }
        return null;
    }

    public final UUID OLrzqt() {
        try {
            return UUID.fromString(C38057pKq.AEQbTJ(AEQbTJ()));
        } catch (java.lang.Exception unused) {
            UUID uuidRandomUUID = UUID.randomUUID();
            java.io.File fileAEQbTJ = AEQbTJ();
            C38057pKq.KWHzl(fileAEQbTJ);
            C38057pKq.copydefault(fileAEQbTJ, uuidRandomUUID.toString());
            return uuidRandomUUID;
        }
    }

    public final java.io.File AEQbTJ() {
        java.io.File file = new java.io.File(OkUtils.KWHzl().getFilesDir() + java.io.File.separator + "dionysus");
        if (!file.exists()) {
            C38063pKw.OLrzqt(file);
        }
        return new java.io.File(file, "InstallId");
    }
}
