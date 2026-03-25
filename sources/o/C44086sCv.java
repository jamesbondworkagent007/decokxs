package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.uploadlog.bean.TicketAttachmentResponse;
import com.okinc.okex.uploadlog.usecase.UploadAttachmentUseCase$buildLoadingModel$1;
import com.okinc.okex.uploadlog.usecase.UploadAttachmentUseCase$buildLoadingModel$filename$1;
import com.okinc.okex.uploadlog.usecase.UploadAttachmentUseCase$invokeFile$1;
import com.okinc.okex.uploadlog.usecase.UploadAttachmentUseCase$invokeFile$filePart$1;
import com.okinc.okex.uploadlog.usecase.UploadAttachmentUseCase$invokeUri$1;
import com.okinc.okex.uploadlog.usecase.UploadAttachmentUseCase$invokeUri$2;
import com.okinc.okex.uploadlog.usecase.UploadAttachmentUseCase$uploadFile$1;
import com.okinc.okex.uploadlog.usecase.UploadAttachmentUseCase$uploadFile$result$1$1$1;
import kotlin.Result;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.C47315tni;
import o.sCR;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sCv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44086sCv {
    public final InterfaceC45301snH AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final android.content.Context copydefault;

    @yCM
    public C44086sCv(@NotNull android.content.Context context, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC45301snH interfaceC45301snH) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC45301snH, "");
        this.copydefault = context;
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = interfaceC45301snH;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.sCD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44086sCv.KWHzl();
            }
        });
    }

    public final OKServerException AEQbTJ() {
        return (OKServerException) this.KWHzl.getValue();
    }

    public static final OKServerException KWHzl() {
        return new OKServerException(0, C33070mpX.AYXKKw(C47315tni.PendingIntent.OFhtUX), null, null, 13, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull android.net.Uri uri, @NotNull Continuation<? super sCR> continuation) throws java.lang.Throwable {
        UploadAttachmentUseCase$buildLoadingModel$1 uploadAttachmentUseCase$buildLoadingModel$1;
        C44086sCv c44086sCv;
        android.net.Uri uri2;
        if (continuation instanceof UploadAttachmentUseCase$buildLoadingModel$1) {
            uploadAttachmentUseCase$buildLoadingModel$1 = (UploadAttachmentUseCase$buildLoadingModel$1) continuation;
            int i = uploadAttachmentUseCase$buildLoadingModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uploadAttachmentUseCase$buildLoadingModel$1.label = i - Integer.MIN_VALUE;
            } else {
                uploadAttachmentUseCase$buildLoadingModel$1 = new UploadAttachmentUseCase$buildLoadingModel$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = uploadAttachmentUseCase$buildLoadingModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = uploadAttachmentUseCase$buildLoadingModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            UploadAttachmentUseCase$buildLoadingModel$filename$1 uploadAttachmentUseCase$buildLoadingModel$filename$1 = new UploadAttachmentUseCase$buildLoadingModel$filename$1(uri, this, null);
            uploadAttachmentUseCase$buildLoadingModel$1.L$0 = this;
            uploadAttachmentUseCase$buildLoadingModel$1.L$1 = uri;
            uploadAttachmentUseCase$buildLoadingModel$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, uploadAttachmentUseCase$buildLoadingModel$filename$1, uploadAttachmentUseCase$buildLoadingModel$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c44086sCv = this;
            uri2 = uri;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.net.Uri uri3 = (android.net.Uri) uploadAttachmentUseCase$buildLoadingModel$1.L$1;
            C44086sCv c44086sCv2 = (C44086sCv) uploadAttachmentUseCase$buildLoadingModel$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            uri2 = uri3;
            c44086sCv = c44086sCv2;
        }
        java.lang.String str = (java.lang.String) objWithContext;
        if (str != null && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            return new sCR.ActionBar(uri2, str, null, 4, null);
        }
        return c44086sCv.AEQbTJ(uri2, java.lang.String.valueOf(uri2.getLastPathSegment()), 0L, c44086sCv.AEQbTJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull android.net.Uri uri, long j, long j2, long j3, @NotNull Continuation<? super sCR> continuation) throws java.lang.Throwable {
        UploadAttachmentUseCase$invokeUri$1 uploadAttachmentUseCase$invokeUri$1;
        long j4;
        long j5;
        long j6;
        C44086sCv c44086sCv;
        android.net.Uri uri2 = uri;
        if (continuation instanceof UploadAttachmentUseCase$invokeUri$1) {
            uploadAttachmentUseCase$invokeUri$1 = (UploadAttachmentUseCase$invokeUri$1) continuation;
            int i = uploadAttachmentUseCase$invokeUri$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uploadAttachmentUseCase$invokeUri$1.label = i - Integer.MIN_VALUE;
            } else {
                uploadAttachmentUseCase$invokeUri$1 = new UploadAttachmentUseCase$invokeUri$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = uploadAttachmentUseCase$invokeUri$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = uploadAttachmentUseCase$invokeUri$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            UploadAttachmentUseCase$invokeUri$2 uploadAttachmentUseCase$invokeUri$2 = new UploadAttachmentUseCase$invokeUri$2(uri2, this, null);
            uploadAttachmentUseCase$invokeUri$1.L$0 = this;
            uploadAttachmentUseCase$invokeUri$1.L$1 = uri2;
            j4 = j;
            uploadAttachmentUseCase$invokeUri$1.J$0 = j4;
            j5 = j2;
            uploadAttachmentUseCase$invokeUri$1.J$1 = j5;
            j6 = j3;
            uploadAttachmentUseCase$invokeUri$1.J$2 = j6;
            uploadAttachmentUseCase$invokeUri$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, uploadAttachmentUseCase$invokeUri$2, uploadAttachmentUseCase$invokeUri$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c44086sCv = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objWithContext);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j7 = uploadAttachmentUseCase$invokeUri$1.J$2;
            j5 = uploadAttachmentUseCase$invokeUri$1.J$1;
            long j8 = uploadAttachmentUseCase$invokeUri$1.J$0;
            uri2 = (android.net.Uri) uploadAttachmentUseCase$invokeUri$1.L$1;
            c44086sCv = (C44086sCv) uploadAttachmentUseCase$invokeUri$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            j4 = j8;
            j6 = j7;
        }
        Triple triple = (Triple) objWithContext;
        MultipartBody.Part part = (MultipartBody.Part) triple.component1();
        java.lang.String str = (java.lang.String) triple.component2();
        long jLongValue = ((java.lang.Number) triple.component3()).longValue();
        if (part == null || jLongValue > j5 || jLongValue + j4 > j6) {
            if (str == null) {
                str = "";
            }
            return c44086sCv.AEQbTJ(uri2, str, jLongValue, new OKServerException(0, C33070mpX.AYXKKw(C47315tni.PendingIntent.dHguZz), null, null, 13, null));
        }
        if (str == null) {
            str = "";
        }
        uploadAttachmentUseCase$invokeUri$1.L$0 = null;
        uploadAttachmentUseCase$invokeUri$1.L$1 = null;
        uploadAttachmentUseCase$invokeUri$1.label = 2;
        objWithContext = c44086sCv.EZpvd(uri2, part, str, jLongValue, uploadAttachmentUseCase$invokeUri$1);
        return objWithContext == objCopydefault ? objCopydefault : objWithContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.io.File file, @NotNull Continuation<? super sCR> continuation) throws java.lang.Throwable {
        UploadAttachmentUseCase$invokeFile$1 uploadAttachmentUseCase$invokeFile$1;
        C44086sCv c44086sCv;
        if (continuation instanceof UploadAttachmentUseCase$invokeFile$1) {
            uploadAttachmentUseCase$invokeFile$1 = (UploadAttachmentUseCase$invokeFile$1) continuation;
            int i = uploadAttachmentUseCase$invokeFile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uploadAttachmentUseCase$invokeFile$1.label = i - Integer.MIN_VALUE;
            } else {
                uploadAttachmentUseCase$invokeFile$1 = new UploadAttachmentUseCase$invokeFile$1(this, continuation);
            }
        }
        UploadAttachmentUseCase$invokeFile$1 uploadAttachmentUseCase$invokeFile$12 = uploadAttachmentUseCase$invokeFile$1;
        java.lang.Object objWithContext = uploadAttachmentUseCase$invokeFile$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = uploadAttachmentUseCase$invokeFile$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            UploadAttachmentUseCase$invokeFile$filePart$1 uploadAttachmentUseCase$invokeFile$filePart$1 = new UploadAttachmentUseCase$invokeFile$filePart$1(file, null);
            uploadAttachmentUseCase$invokeFile$12.L$0 = this;
            uploadAttachmentUseCase$invokeFile$12.L$1 = file;
            uploadAttachmentUseCase$invokeFile$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, uploadAttachmentUseCase$invokeFile$filePart$1, uploadAttachmentUseCase$invokeFile$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c44086sCv = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objWithContext);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (java.io.File) uploadAttachmentUseCase$invokeFile$12.L$1;
            c44086sCv = (C44086sCv) uploadAttachmentUseCase$invokeFile$12.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        MultipartBody.Part part = (MultipartBody.Part) objWithContext;
        android.net.Uri uriFromFile = android.net.Uri.fromFile(file);
        Intrinsics.checkNotNullExpressionValue(uriFromFile, "");
        java.lang.String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        long length = file.length();
        uploadAttachmentUseCase$invokeFile$12.L$0 = null;
        uploadAttachmentUseCase$invokeFile$12.L$1 = null;
        uploadAttachmentUseCase$invokeFile$12.label = 2;
        objWithContext = c44086sCv.EZpvd(uriFromFile, part, name, length, uploadAttachmentUseCase$invokeFile$12);
        return objWithContext == objCopydefault ? objCopydefault : objWithContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0090 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:30:0x0075, B:32:0x007d, B:34:0x0083, B:35:0x0090), top: B:72:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(android.net.Uri uri, MultipartBody.Part part, java.lang.String str, long j, Continuation<? super sCR> continuation) throws java.lang.Throwable {
        UploadAttachmentUseCase$uploadFile$1 uploadAttachmentUseCase$uploadFile$1;
        android.net.Uri uri2;
        java.lang.String str2;
        long j2;
        C44086sCv c44086sCv;
        CoroutineDispatcher coroutineDispatcher;
        UploadAttachmentUseCase$uploadFile$result$1$1$1 uploadAttachmentUseCase$uploadFile$result$1$1$1;
        AbstractC43419rot actionBar;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        ResponseData responseData;
        if (continuation instanceof UploadAttachmentUseCase$uploadFile$1) {
            uploadAttachmentUseCase$uploadFile$1 = (UploadAttachmentUseCase$uploadFile$1) continuation;
            int i = uploadAttachmentUseCase$uploadFile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uploadAttachmentUseCase$uploadFile$1.label = i - Integer.MIN_VALUE;
            } else {
                uploadAttachmentUseCase$uploadFile$1 = new UploadAttachmentUseCase$uploadFile$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = uploadAttachmentUseCase$uploadFile$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = uploadAttachmentUseCase$uploadFile$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            try {
                Result.Application application = Result.Companion;
                try {
                    coroutineDispatcher = this.EZpvd;
                    uploadAttachmentUseCase$uploadFile$result$1$1$1 = new UploadAttachmentUseCase$uploadFile$result$1$1$1(this, part, null);
                    uploadAttachmentUseCase$uploadFile$1.L$0 = this;
                    uri2 = uri;
                } catch (java.lang.Throwable th) {
                    th = th;
                    uri2 = uri;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                uri2 = uri;
                str2 = str;
                j2 = j;
                c44086sCv = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            try {
                uploadAttachmentUseCase$uploadFile$1.L$1 = uri2;
                str2 = str;
            } catch (java.lang.Throwable th3) {
                th = th3;
                str2 = str;
                j2 = j;
                c44086sCv = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                objM7377constructorimpl = Result.m7377constructorimpl((TicketAttachmentResponse) actionBar.AEQbTJ());
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl == null) {
                }
            }
            try {
                uploadAttachmentUseCase$uploadFile$1.L$2 = str2;
                j2 = j;
            } catch (java.lang.Throwable th4) {
                th = th4;
                j2 = j;
                c44086sCv = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                objM7377constructorimpl = Result.m7377constructorimpl((TicketAttachmentResponse) actionBar.AEQbTJ());
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl == null) {
                }
            }
            try {
                uploadAttachmentUseCase$uploadFile$1.J$0 = j2;
                uploadAttachmentUseCase$uploadFile$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, uploadAttachmentUseCase$uploadFile$result$1$1$1, uploadAttachmentUseCase$uploadFile$1);
            } catch (java.lang.Throwable th5) {
                th = th5;
                c44086sCv = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                objM7377constructorimpl = Result.m7377constructorimpl((TicketAttachmentResponse) actionBar.AEQbTJ());
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl == null) {
                }
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c44086sCv = this;
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                objM7377constructorimpl = Result.m7377constructorimpl((TicketAttachmentResponse) actionBar.AEQbTJ());
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = uploadAttachmentUseCase$uploadFile$1.J$0;
            java.lang.String str3 = (java.lang.String) uploadAttachmentUseCase$uploadFile$1.L$2;
            uri2 = (android.net.Uri) uploadAttachmentUseCase$uploadFile$1.L$1;
            c44086sCv = (C44086sCv) uploadAttachmentUseCase$uploadFile$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                j2 = j3;
                str2 = str3;
            } catch (java.lang.Throwable th6) {
                th = th6;
                j2 = j3;
                str2 = str3;
                try {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    objM7377constructorimpl = Result.m7377constructorimpl((TicketAttachmentResponse) actionBar.AEQbTJ());
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl == null) {
                }
            }
            try {
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            objM7377constructorimpl = Result.m7377constructorimpl((TicketAttachmentResponse) actionBar.AEQbTJ());
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            TicketAttachmentResponse ticketAttachmentResponse = (TicketAttachmentResponse) objM7377constructorimpl;
            java.lang.String id = ticketAttachmentResponse.getId();
            if (id == null) {
                id = "";
            }
            java.lang.String fileName = ticketAttachmentResponse.getFileName();
            java.lang.String str4 = fileName != null ? fileName : "";
            java.lang.String fileSize = ticketAttachmentResponse.getFileSize();
            return c44086sCv.KWHzl(uri2, id, str4, fileSize != null ? StringsKt__StringNumberConversionsKt.getFieldNames(fileSize) : null);
        }
        return c44086sCv.AEQbTJ(uri2, str2, j2, thM7380exceptionOrNullimpl);
    }

    public final java.lang.String AEQbTJ(long j) {
        double d = j / 1024.0d;
        if (d < 1024.0d) {
            return yII.EZpvd(d) + " KB";
        }
        return yII.EZpvd(d / ((double) 1024)) + " MB";
    }

    public final sCR.StateListAnimator KWHzl(android.net.Uri uri, java.lang.String str, java.lang.String str2, java.lang.Long l) {
        java.lang.String strAEQbTJ = l != null ? AEQbTJ(l.longValue()) : null;
        long jLongValue = l != null ? l.longValue() : 0L;
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        return new sCR.StateListAnimator(uri, str2, strAEQbTJ, jLongValue, str);
    }

    public final sCR.Application AEQbTJ(android.net.Uri uri, java.lang.String str, long j, java.lang.Throwable th) {
        java.lang.String strAEQbTJ = AEQbTJ(j);
        java.lang.String message = th.getMessage();
        if (message != null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) message)) {
            th = AEQbTJ();
        }
        return new sCR.Application(uri, str, strAEQbTJ, th);
    }
}
