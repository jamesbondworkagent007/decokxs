package com.okinc.okimcore.feature.download;

import android.content.Context;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.okinc.okimcore.feature.download.DownloadException;
import com.okinc.okimcore.model.im.OKMediaMessageContent;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKShareMessage;
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
import o.C44169sFw;
import o.C56391yDq;
import o.C56442yFn;
import o.sIS;
import o.sIV;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes16.dex */
public final class InHouseFileDownloadManger$downloadFile$2 extends SuspendLambda implements Function2<FlowCollector<? super sIS>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ OKMessage $message;
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
    public InHouseFileDownloadManger$downloadFile$2(OKMessage oKMessage, Context context, Continuation<? super InHouseFileDownloadManger$downloadFile$2> continuation) {
        super(2, continuation);
        this.$message = oKMessage;
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
    public final Object invoke(FlowCollector<? super sIS> flowCollector, Continuation<? super Unit> continuation) {
        return ((InHouseFileDownloadManger$downloadFile$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01bd A[Catch: IOException -> 0x0043, TryCatch #1 {IOException -> 0x0043, blocks: (B:13:0x003e, B:68:0x01b3, B:70:0x01bd, B:73:0x01ee), top: B:89:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0234 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        OKMediaMessageContent image;
        OKMediaMessageContent oKMediaMessageContent;
        FileOutputStream fileOutputStream;
        long jContentLength;
        BufferedSource bufferedSourceSource;
        Buffer buffer;
        FlowCollector flowCollector;
        long j;
        FlowCollector flowCollector2;
        sIS.Activity activity;
        sIS.Application application;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient okHttpClientBuild = builder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                if (!(this.$message.getContent() instanceof OKMediaMessageContent)) {
                    sIS.Application application2 = new sIS.Application(new DownloadException.InvalidUrlException("Message content is not a media message"));
                    this.label = 1;
                    if (flowCollector3.emit(application2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                if (this.$message.getContent() instanceof OKShareMessage) {
                    OKMessageContent content = this.$message.getContent();
                    Intrinsics.copydefault(content, "");
                    image = ((OKShareMessage) content).getImage();
                    Intrinsics.copydefault(image, "");
                } else {
                    OKMessageContent content2 = this.$message.getContent();
                    Intrinsics.copydefault(content2, "");
                    image = (OKMediaMessageContent) content2;
                }
                oKMediaMessageContent = image;
                Uri remoteUri = oKMediaMessageContent.getRemoteUri();
                if (!sIV.copydefault(String.valueOf(remoteUri))) {
                    sIS.Application application3 = new sIS.Application(new DownloadException.InvalidUrlException("Invalid Url Exception"));
                    this.label = 2;
                    if (flowCollector3.emit(application3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                Request requestBuild = new Request.Builder().url(String.valueOf(remoteUri)).build();
                File fileKWHzl = C44169sFw.KWHzl(this.$message, this.$appContext);
                if (fileKWHzl != null && fileKWHzl.exists()) {
                    fileKWHzl.delete();
                }
                fileOutputStream = new FileOutputStream(fileKWHzl);
                try {
                    Response responseExecute = okHttpClientBuild.newCall(requestBuild).execute();
                    if (!responseExecute.isSuccessful()) {
                        if (responseExecute.code() == 403) {
                            sIS.TaskDescription taskDescription = new sIS.TaskDescription(new Exception("File download expired or not available"));
                            this.label = 4;
                            if (flowCollector3.emit(taskDescription, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            sIS.Application application4 = new sIS.Application(new IOException("Unexpected HTTP response: " + responseExecute.code() + " " + responseExecute.message()));
                            this.label = 5;
                            if (flowCollector3.emit(application4, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    ResponseBody responseBodyBody = responseExecute.body();
                    if (responseBodyBody == null) {
                        sIS.Application application5 = new sIS.Application(new IOException("Empty response body"));
                        this.label = 6;
                        if (flowCollector3.emit(application5, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    jContentLength = responseBodyBody.contentLength();
                    bufferedSourceSource = responseBodyBody.source();
                    buffer = new Buffer();
                    flowCollector = flowCollector3;
                    j = 0;
                    while (bufferedSourceSource.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                        long size = buffer.size();
                        fileOutputStream.write(buffer.readByteArray());
                        j += size;
                        sIS.StateListAnimator stateListAnimator = new sIS.StateListAnimator((int) ((((long) 100) * j) / jContentLength), this.$message);
                        this.L$0 = flowCollector;
                        this.L$1 = oKMediaMessageContent;
                        this.L$2 = fileOutputStream;
                        this.L$3 = bufferedSourceSource;
                        this.L$4 = buffer;
                        this.J$0 = jContentLength;
                        this.J$1 = j;
                        this.label = 7;
                        if (flowCollector.emit(stateListAnimator, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    oKMediaMessageContent.setLocalUri(C44169sFw.OLrzqt(this.$message, this.$appContext));
                    activity = new sIS.Activity(this.$message);
                    this.L$0 = flowCollector;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 8;
                    if (flowCollector.emit(activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                } catch (IOException e) {
                    sIS.Application application6 = new sIS.Application(e);
                    this.label = 3;
                    if (flowCollector3.emit(application6, this) == objCopydefault) {
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
                j = this.J$1;
                jContentLength = this.J$0;
                buffer = (Buffer) this.L$4;
                bufferedSourceSource = (BufferedSource) this.L$3;
                fileOutputStream = (FileOutputStream) this.L$2;
                oKMediaMessageContent = (OKMediaMessageContent) this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    while (bufferedSourceSource.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    oKMediaMessageContent.setLocalUri(C44169sFw.OLrzqt(this.$message, this.$appContext));
                    activity = new sIS.Activity(this.$message);
                    this.L$0 = flowCollector;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 8;
                    if (flowCollector.emit(activity, this) == objCopydefault) {
                    }
                } catch (IOException e2) {
                    e = e2;
                    flowCollector2 = flowCollector;
                    application = new sIS.Application(e);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 9;
                    if (flowCollector2.emit(application, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 8:
                flowCollector2 = (FlowCollector) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    break;
                } catch (IOException e3) {
                    e = e3;
                    application = new sIS.Application(e);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 9;
                    if (flowCollector2.emit(application, this) == objCopydefault) {
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
