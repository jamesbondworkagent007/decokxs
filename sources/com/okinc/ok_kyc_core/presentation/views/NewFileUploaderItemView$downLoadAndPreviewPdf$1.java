package com.okinc.ok_kyc_core.presentation.views;

import android.content.Context;
import android.net.Uri;
import com.okinc.ok_kyc_widget.UploadNew;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractActivityC33041mov;
import o.C33478mxH;
import o.C42358rPx;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rGL;

/* JADX INFO: loaded from: classes23.dex */
public final class NewFileUploaderItemView$downLoadAndPreviewPdf$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fileName;
    final /* synthetic */ String $imagePath;
    final /* synthetic */ long $uploadId;
    final /* synthetic */ rGL $viewModel;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C42358rPx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFileUploaderItemView$downLoadAndPreviewPdf$1(C42358rPx c42358rPx, String str, long j, rGL rgl, String str2, Continuation<? super NewFileUploaderItemView$downLoadAndPreviewPdf$1> continuation) {
        super(2, continuation);
        this.this$0 = c42358rPx;
        this.$fileName = str;
        this.$uploadId = j;
        this.$viewModel = rgl;
        this.$imagePath = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewFileUploaderItemView$downLoadAndPreviewPdf$1(this.this$0, this.$fileName, this.$uploadId, this.$viewModel, this.$imagePath, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NewFileUploaderItemView$downLoadAndPreviewPdf$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v20, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            objectRef = new Ref.ObjectRef();
            C33478mxH c33478mxH = C33478mxH.KWHzl;
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            File fileEZpvd = c33478mxH.EZpvd(context);
            if (fileEZpvd != null) {
                String str2 = fileEZpvd.getPath() + File.separator + this.$fileName;
                File file = new File(str2);
                if (file.exists() && file.length() > 0) {
                    UploadNew uploadNew = this.this$0.OLrzqt().OLrzqt;
                    long j = this.$uploadId;
                    Uri uriFromFile = Uri.fromFile(file);
                    Intrinsics.checkNotNullExpressionValue(uriFromFile, "");
                    uploadNew.AEQbTJ(j, uriFromFile);
                    rGL rgl = this.$viewModel;
                    Context context2 = this.this$0.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    String string = Uri.fromFile(file).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    rgl.EZpvd(context2, "application/pdf", string);
                } else {
                    Context context3 = this.this$0.getContext();
                    AbstractActivityC33041mov abstractActivityC33041mov = context3 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context3 : null;
                    if (abstractActivityC33041mov != null) {
                        abstractActivityC33041mov.showLoadingAtOnce();
                    }
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, this.this$0, this.$imagePath, str2, null);
                    this.L$0 = objectRef;
                    this.L$1 = str2;
                    this.label = 1;
                    if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    str = str2;
                }
            } else {
                pUU.KWHzl("File_Upload", "downLoadAndPreviewPdf cacheFileDir = null");
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) this.L$1;
        objectRef = (Ref.ObjectRef) this.L$0;
        C56391yDq.AEQbTJ(obj);
        Context context4 = this.this$0.getContext();
        AbstractActivityC33041mov abstractActivityC33041mov2 = context4 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context4 : null;
        if (abstractActivityC33041mov2 != null) {
            abstractActivityC33041mov2.dismissLoading();
        }
        if (((Boolean) ((Pair) objectRef.element).getFirst()).booleanValue()) {
            File file2 = new File(str);
            UploadNew uploadNew2 = this.this$0.OLrzqt().OLrzqt;
            long j2 = this.$uploadId;
            Uri uriFromFile2 = Uri.fromFile(file2);
            Intrinsics.checkNotNullExpressionValue(uriFromFile2, "");
            uploadNew2.AEQbTJ(j2, uriFromFile2);
            rGL rgl2 = this.$viewModel;
            Context context5 = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            String string2 = Uri.fromFile(file2).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            rgl2.EZpvd(context5, "application/pdf", string2);
        } else {
            C55326xho.toastWithFailedIcon$default((String) ((Pair) objectRef.element).getSecond(), 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.views.NewFileUploaderItemView$downLoadAndPreviewPdf$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $imagePath;
        final /* synthetic */ String $outputPath;
        final /* synthetic */ Ref.ObjectRef<Pair<Boolean, String>> $result;
        Object L$0;
        int label;
        final /* synthetic */ C42358rPx this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<Pair<Boolean, String>> objectRef, C42358rPx c42358rPx, String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$result = objectRef;
            this.this$0 = c42358rPx;
            this.$imagePath = str;
            this.$outputPath = str2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$result, this.this$0, this.$imagePath, this.$outputPath, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r7v6, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.ObjectRef<Pair<Boolean, String>> objectRef;
            T t;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Ref.ObjectRef<Pair<Boolean, String>> objectRef2 = this.$result;
                C42358rPx c42358rPx = this.this$0;
                Context context = c42358rPx.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                String str = this.$imagePath;
                String str2 = this.$outputPath;
                this.L$0 = objectRef2;
                this.label = 1;
                Object objEZpvd = c42358rPx.EZpvd(context, str, str2, (Continuation<? super Pair<Boolean, String>>) this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                objectRef = objectRef2;
                t = objEZpvd;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                t = obj;
            }
            objectRef.element = t;
            return Unit.INSTANCE;
        }
    }
}
