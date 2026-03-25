package com.okinc.ok_kyc_core.presentation.views;

import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.ok_kyc_core.data.remote.networkmodel.File;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FileUploaderAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.C56391yDq;
import o.C56442yFn;
import o.rAX;
import o.rGL;
import o.rLY;

/* JADX INFO: loaded from: classes23.dex */
public final class FileUploaderItemView$observe$1$1$10$fileSelectedCallback$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UIComponentAppModel $appModel;
    final /* synthetic */ String $contentType;
    final /* synthetic */ rAX<List<File>> $cur;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ String $tempFileName;
    final /* synthetic */ Uri $uri;
    final /* synthetic */ AbstractC42074rFj $viewModel;
    int label;
    final /* synthetic */ rLY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileUploaderItemView$observe$1$1$10$fileSelectedCallback$1$1$1(rLY rly, AbstractC42074rFj abstractC42074rFj, String str, String str2, Uri uri, rAX<List<File>> rax, UIComponentAppModel uIComponentAppModel, LifecycleOwner lifecycleOwner, Continuation<? super FileUploaderItemView$observe$1$1$10$fileSelectedCallback$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = rly;
        this.$viewModel = abstractC42074rFj;
        this.$tempFileName = str;
        this.$contentType = str2;
        this.$uri = uri;
        this.$cur = rax;
        this.$appModel = uIComponentAppModel;
        this.$lifecycleOwner = lifecycleOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileUploaderItemView$observe$1$1$10$fileSelectedCallback$1$1$1(this.this$0, this.$viewModel, this.$tempFileName, this.$contentType, this.$uri, this.$cur, this.$appModel, this.$lifecycleOwner, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileUploaderItemView$observe$1$1$10$fileSelectedCallback$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            rLY rly = this.this$0;
            rGL rgl = (rGL) this.$viewModel;
            String str = this.$tempFileName;
            String str2 = this.$contentType;
            Uri uri = this.$uri;
            rAX<List<File>> rax = this.$cur;
            int fileSize = ((FileUploaderAppModel) this.$appModel).getFileSize();
            SingleFileUploadUseCase.FileType fileType = SingleFileUploadUseCase.FileType.PDF;
            boolean shouldCallOcr = ((FileUploaderAppModel) this.$appModel).getShouldCallOcr();
            LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            this.label = 1;
            if (rly.AEQbTJ(rgl, str, str2, uri, rax, fileSize, fileType, shouldCallOcr, lifecycleOwner, this) == objCopydefault) {
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
