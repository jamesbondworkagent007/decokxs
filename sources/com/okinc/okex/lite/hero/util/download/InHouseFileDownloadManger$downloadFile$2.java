package com.okinc.okex.lite.hero.util.download;

import android.content.Context;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.net.UriKt;
import com.okinc.okex.lite.hero.util.download.DownloadException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C45709svE;
import o.C56391yDq;
import o.C56442yFn;
import o.svL;
import o.svM;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseFileDownloadManger$downloadFile$2 extends SuspendLambda implements Function2<FlowCollector<? super svM>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ C45709svE $message;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseFileDownloadManger$downloadFile$2(C45709svE c45709svE, Context context, Continuation<? super InHouseFileDownloadManger$downloadFile$2> continuation) {
        super(2, continuation);
        this.$message = c45709svE;
        this.$appContext = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseFileDownloadManger$downloadFile$2 inHouseFileDownloadManger$downloadFile$2 = new InHouseFileDownloadManger$downloadFile$2(this.$message, this.$appContext, continuation);
        inHouseFileDownloadManger$downloadFile$2.L$0 = obj;
        return inHouseFileDownloadManger$downloadFile$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super svM> flowCollector, Continuation<? super Unit> continuation) {
        return ((InHouseFileDownloadManger$downloadFile$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01a7 A[Catch: IOException -> 0x01dc, TryCatch #3 {IOException -> 0x01dc, blocks: (B:70:0x01d8, B:65:0x019d, B:67:0x01a7, B:73:0x01df), top: B:93:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01df A[Catch: IOException -> 0x01dc, TRY_LEAVE, TryCatch #3 {IOException -> 0x01dc, blocks: (B:70:0x01d8, B:65:0x019d, B:67:0x01a7, B:73:0x01df), top: B:93:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01d5 -> B:93:0x01d8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long size;
        BufferedSource bufferedSourceSource;
        Buffer buffer;
        FileOutputStream fileOutputStream;
        FlowCollector flowCollector;
        File file;
        long j;
        FlowCollector flowCollector2;
        svM.Activity activity;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient okHttpClientBuild = builder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                if (!svL.KWHzl(this.$message.OLrzqt())) {
                    svM.Activity activity2 = new svM.Activity(new DownloadException.InvalidUrlException("Invalid Url Exception"));
                    this.label = 1;
                    if (flowCollector3.emit(activity2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                Request requestBuild = new Request.Builder().url(this.$message.OLrzqt()).build();
                Uri uri = Uri.parse(this.$message.OLrzqt());
                Intrinsics.checkNotNullExpressionValue(uri, "");
                Uri uriOLrzqt = svL.OLrzqt(uri, this.$appContext);
                File file2 = uriOLrzqt != null ? UriKt.toFile(uriOLrzqt) : null;
                if (file2 == null) {
                    svM.Activity activity3 = new svM.Activity(new DownloadException.IOException("File not found"));
                    this.label = 2;
                    if (flowCollector3.emit(activity3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                if (file2.exists()) {
                    file2.delete();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    Response responseExecute = okHttpClientBuild.newCall(requestBuild).execute();
                    if (!responseExecute.isSuccessful()) {
                        if (responseExecute.code() == 403) {
                            svM.TaskDescription taskDescription = new svM.TaskDescription(new Exception("File download expired or not available"));
                            this.label = 4;
                            if (flowCollector3.emit(taskDescription, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            svM.Activity activity4 = new svM.Activity(new IOException("Unexpected HTTP response: " + responseExecute.code() + " " + responseExecute.message()));
                            this.label = 5;
                            if (flowCollector3.emit(activity4, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    ResponseBody responseBodyBody = responseExecute.body();
                    if (responseBodyBody == null) {
                        svM.Activity activity5 = new svM.Activity(new IOException("Empty response body"));
                        this.label = 6;
                        if (flowCollector3.emit(activity5, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    long jContentLength = responseBodyBody.contentLength();
                    size = 0;
                    bufferedSourceSource = responseBodyBody.source();
                    buffer = new Buffer();
                    fileOutputStream = fileOutputStream2;
                    flowCollector = flowCollector3;
                    file = file2;
                    j = jContentLength;
                    if (bufferedSourceSource.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                        try {
                            fileOutputStream.write(buffer.readByteArray());
                            size += buffer.size();
                            svM.Application application = new svM.Application((int) ((((long) 100) * size) / j), this.$message);
                            this.L$0 = flowCollector;
                            this.L$1 = file;
                            this.L$2 = fileOutputStream;
                            this.L$3 = bufferedSourceSource;
                            this.L$4 = buffer;
                            this.J$0 = j;
                            this.J$1 = size;
                            this.label = 7;
                            if (flowCollector.emit(application, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            buffer.clear();
                        } catch (IOException e) {
                            e = e;
                            flowCollector2 = flowCollector;
                            activity = new svM.Activity(e);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 9;
                            if (flowCollector2.emit(activity, this) == objCopydefault) {
                            }
                        }
                        if (bufferedSourceSource.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            String absolutePath = file.getAbsolutePath();
                            Intrinsics.checkNotNullExpressionValue(absolutePath, "");
                            svM.ActionBar actionBar = new svM.ActionBar(absolutePath);
                            this.L$0 = flowCollector;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 8;
                            if (flowCollector.emit(actionBar, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } catch (IOException e2) {
                    svM.Activity activity6 = new svM.Activity(e2);
                    this.label = 3;
                    if (flowCollector3.emit(activity6, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                break;
            case 1:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 3:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 4:
            case 5:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 7:
                long j2 = this.J$1;
                j = this.J$0;
                buffer = (Buffer) this.L$4;
                bufferedSourceSource = (BufferedSource) this.L$3;
                fileOutputStream = (FileOutputStream) this.L$2;
                File file3 = (File) this.L$1;
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    file = file3;
                    flowCollector = flowCollector4;
                    size = j2;
                    buffer.clear();
                    if (bufferedSourceSource.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                    }
                } catch (IOException e3) {
                    e = e3;
                    flowCollector2 = flowCollector4;
                    activity = new svM.Activity(e);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 9;
                    if (flowCollector2.emit(activity, this) == objCopydefault) {
                    }
                }
                break;
            case 8:
                flowCollector2 = (FlowCollector) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    break;
                } catch (IOException e4) {
                    e = e4;
                    activity = new svM.Activity(e);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 9;
                    if (flowCollector2.emit(activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 9:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
