package com.okinc.ok_kyc_core.presentation.views;

import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.ok_kyc_core.data.remote.networkmodel.File;
import com.okinc.ok_kyc_core.data.remote.networkmodel.NewFileUploaderAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import com.okinc.ok_kyc_core.presentation.views.NewFileUploaderItemView$observe$1$1$uploadPdfOperation$1;
import com.okinc.ok_kyc_widget.UploadNew;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.C42358rPx;
import o.C56391yDq;
import o.C56442yFn;
import o.rAX;
import o.rGL;

/* JADX INFO: loaded from: classes23.dex */
public final class NewFileUploaderItemView$observe$1$1$uploadPdfOperation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UIComponentAppModel $appModel;
    final /* synthetic */ String $contentType;
    final /* synthetic */ rAX<List<File>> $cur;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ boolean $refreshNow;
    final /* synthetic */ String $tempFileName;
    final /* synthetic */ Uri $uri;
    final /* synthetic */ AbstractC42074rFj $viewModel;
    int label;
    final /* synthetic */ C42358rPx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFileUploaderItemView$observe$1$1$uploadPdfOperation$1(String str, Uri uri, C42358rPx c42358rPx, AbstractC42074rFj abstractC42074rFj, UIComponentAppModel uIComponentAppModel, String str2, rAX<List<File>> rax, LifecycleOwner lifecycleOwner, boolean z, Continuation<? super NewFileUploaderItemView$observe$1$1$uploadPdfOperation$1> continuation) {
        super(2, continuation);
        this.$tempFileName = str;
        this.$uri = uri;
        this.this$0 = c42358rPx;
        this.$viewModel = abstractC42074rFj;
        this.$appModel = uIComponentAppModel;
        this.$contentType = str2;
        this.$cur = rax;
        this.$lifecycleOwner = lifecycleOwner;
        this.$refreshNow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewFileUploaderItemView$observe$1$1$uploadPdfOperation$1(this.$tempFileName, this.$uri, this.this$0, this.$viewModel, this.$appModel, this.$contentType, this.$cur, this.$lifecycleOwner, this.$refreshNow, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NewFileUploaderItemView$observe$1$1$uploadPdfOperation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            long jNanoTime = System.nanoTime();
            String str = this.$tempFileName;
            SingleFileUploadUseCase.FileType fileType = SingleFileUploadUseCase.FileType.PDF;
            final UploadNew.UploadFileViewModel uploadFileViewModel = new UploadNew.UploadFileViewModel(jNanoTime, 0L, str, fileType, null, this.$uri, null, null, 208, null);
            C42358rPx c42358rPx = this.this$0;
            rGL rgl = (rGL) this.$viewModel;
            UIComponentAppModel uIComponentAppModel = this.$appModel;
            String str2 = this.$tempFileName;
            String str3 = this.$contentType;
            Uri uri = this.$uri;
            rAX<List<File>> rax = this.$cur;
            int fileSize = ((NewFileUploaderAppModel) uIComponentAppModel).getFileSize();
            boolean shouldCallOcr = ((NewFileUploaderAppModel) this.$appModel).getShouldCallOcr();
            LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            final C42358rPx c42358rPx2 = this.this$0;
            final boolean z = this.$refreshNow;
            final rAX<List<File>> rax2 = this.$cur;
            Function1 function1 = new Function1() { // from class: o.rPX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return NewFileUploaderItemView$observe$1$1$uploadPdfOperation$1.invokeSuspend$lambda$0(uploadFileViewModel, c42358rPx2, z, rax2, (java.io.File) obj2);
                }
            };
            this.label = 1;
            if (c42358rPx.AEQbTJ(rgl, uIComponentAppModel, str2, str3, uri, (rAX<List<File>>) rax, fileSize, fileType, shouldCallOcr, lifecycleOwner, jNanoTime, (Function1<? super java.io.File, Unit>) function1, (Continuation<? super Unit>) this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(UploadNew.UploadFileViewModel uploadFileViewModel, C42358rPx c42358rPx, boolean z, rAX rax, java.io.File file) {
        if (file != null) {
            uploadFileViewModel.setUri(Uri.fromFile(file));
            uploadFileViewModel.setDecryptFilePath(file.getAbsolutePath());
        }
        c42358rPx.OLrzqt().OLrzqt.OLrzqt(uploadFileViewModel, z);
        c42358rPx.AEQbTJ(rax, c42358rPx.OLrzqt().OLrzqt.OLrzqt());
        return Unit.INSTANCE;
    }
}
