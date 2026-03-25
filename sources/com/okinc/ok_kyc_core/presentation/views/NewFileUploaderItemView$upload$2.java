package com.okinc.ok_kyc_core.presentation.views;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.NewFileUploaderAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import com.okinc.ok_kyc_core.presentation.views.NewFileUploaderItemView$upload$2;
import java.io.File;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C32866mlf;
import o.C42156rIk;
import o.C42358rPx;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C6800aWH;
import o.pUU;
import o.rAX;
import o.rGL;

/* JADX INFO: loaded from: classes23.dex */
public final class NewFileUploaderItemView$upload$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UIComponentAppModel $appModel;
    final /* synthetic */ File $cacheFileDir;
    final /* synthetic */ String $contentType;
    final /* synthetic */ rAX<List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> $cur;
    final /* synthetic */ SingleFileUploadUseCase.FileType $fileType;
    final /* synthetic */ File $originalFile;
    final /* synthetic */ File $pdfDecryptionFile;
    final /* synthetic */ boolean $shouldCallOcr;
    final /* synthetic */ long $uploadId;
    final /* synthetic */ Uri $uri;
    final /* synthetic */ rGL $viewModel;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C42358rPx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFileUploaderItemView$upload$2(File file, C42358rPx c42358rPx, Uri uri, rGL rgl, File file2, String str, SingleFileUploadUseCase.FileType fileType, boolean z, UIComponentAppModel uIComponentAppModel, long j, rAX<List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax, File file3, Continuation<? super NewFileUploaderItemView$upload$2> continuation) {
        super(2, continuation);
        this.$cacheFileDir = file;
        this.this$0 = c42358rPx;
        this.$uri = uri;
        this.$viewModel = rgl;
        this.$originalFile = file2;
        this.$contentType = str;
        this.$fileType = fileType;
        this.$shouldCallOcr = z;
        this.$appModel = uIComponentAppModel;
        this.$uploadId = j;
        this.$cur = rax;
        this.$pdfDecryptionFile = file3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NewFileUploaderItemView$upload$2 newFileUploaderItemView$upload$2 = new NewFileUploaderItemView$upload$2(this.$cacheFileDir, this.this$0, this.$uri, this.$viewModel, this.$originalFile, this.$contentType, this.$fileType, this.$shouldCallOcr, this.$appModel, this.$uploadId, this.$cur, this.$pdfDecryptionFile, continuation);
        newFileUploaderItemView$upload$2.L$0 = obj;
        return newFileUploaderItemView$upload$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NewFileUploaderItemView$upload$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, kotlin.Pair] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final Ref.ObjectRef objectRef;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = new Pair(null, "");
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cacheFileDir, this.this$0, this.$uri, objectRef2, this.$viewModel, this.$originalFile, this.$contentType, this.$fileType, this.$shouldCallOcr, null);
            this.L$0 = coroutineScope;
            this.L$1 = objectRef2;
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$1;
            C56391yDq.AEQbTJ(obj);
        }
        SingleFileUploadUseCase.UploadedFile uploadedFile = (SingleFileUploadUseCase.UploadedFile) ((Pair) objectRef.element).getFirst();
        if (uploadedFile != null) {
            rGL rgl = this.$viewModel;
            UIComponentAppModel uIComponentAppModel = this.$appModel;
            C42358rPx c42358rPx = this.this$0;
            long j = this.$uploadId;
            rAX<List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax = this.$cur;
            File file = this.$pdfDecryptionFile;
            File file2 = this.$originalFile;
            MutableLiveData<C42156rIk> mutableLiveDataGasjUx = rgl.gasjUx();
            boolean z = uIComponentAppModel instanceof NewFileUploaderAppModel;
            NewFileUploaderAppModel newFileUploaderAppModel = z ? (NewFileUploaderAppModel) uIComponentAppModel : null;
            List<String> viewIdsToHide = newFileUploaderAppModel != null ? newFileUploaderAppModel.getViewIdsToHide() : null;
            NewFileUploaderAppModel newFileUploaderAppModel2 = z ? (NewFileUploaderAppModel) uIComponentAppModel : null;
            mutableLiveDataGasjUx.setValue(new C42156rIk(viewIdsToHide, newFileUploaderAppModel2 != null ? newFileUploaderAppModel2.getViewIdsToShow() : null));
            c42358rPx.OLrzqt().OLrzqt.OLrzqt(j, uploadedFile.getImageId(), uploadedFile.getImagePath());
            c42358rPx.AEQbTJ(rax, c42358rPx.OLrzqt().OLrzqt.OLrzqt());
            rgl.zuBGHE().setValue(c42358rPx.AhwBna.size() == 1 ? uIComponentAppModel.getId() : null);
            pUU.KWHzl("File_Upload", uploadedFile.getImageId() + " " + uploadedFile.getImageName() + " " + uploadedFile.getImageType());
            if (file == null) {
                C6800aWH.EZpvd(file2.getPath());
                C6800aWH.EZpvd(file2.getPath());
            }
            C32866mlf.onEvent$default("KYC_Upload_File_Success", (TrackChannel[]) null, new Function1() { // from class: o.rPW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return NewFileUploaderItemView$upload$2.invokeSuspend$lambda$1$lambda$0((EventParamsList) obj2);
                }
            }, 1, (Object) null);
        } else {
            C42358rPx c42358rPx2 = this.this$0;
            long j2 = this.$uploadId;
            rAX<List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax2 = this.$cur;
            C32866mlf.onEvent$default("KYC_Upload_File_Error", (TrackChannel[]) null, new Function1() { // from class: o.rPZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return NewFileUploaderItemView$upload$2.invokeSuspend$lambda$3$lambda$2(objectRef, (EventParamsList) obj2);
                }
            }, 1, (Object) null);
            c42358rPx2.OLrzqt().OLrzqt.copydefault(j2);
            c42358rPx2.AEQbTJ(rax2, c42358rPx2.OLrzqt().OLrzqt.OLrzqt());
            pUU.copydefault("File_Upload", "fail to upload " + ((Pair) objectRef.element).getSecond());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.views.NewFileUploaderItemView$upload$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $cacheFileDir;
        final /* synthetic */ String $contentType;
        final /* synthetic */ SingleFileUploadUseCase.FileType $fileType;
        final /* synthetic */ File $originalFile;
        final /* synthetic */ boolean $shouldCallOcr;
        final /* synthetic */ Ref.ObjectRef<Pair<SingleFileUploadUseCase.UploadedFile, String>> $uploadedFile;
        final /* synthetic */ Uri $uri;
        final /* synthetic */ rGL $viewModel;
        Object L$0;
        int label;
        final /* synthetic */ C42358rPx this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File file, C42358rPx c42358rPx, Uri uri, Ref.ObjectRef<Pair<SingleFileUploadUseCase.UploadedFile, String>> objectRef, rGL rgl, File file2, String str, SingleFileUploadUseCase.FileType fileType, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cacheFileDir = file;
            this.this$0 = c42358rPx;
            this.$uri = uri;
            this.$uploadedFile = objectRef;
            this.$viewModel = rgl;
            this.$originalFile = file2;
            this.$contentType = str;
            this.$fileType = fileType;
            this.$shouldCallOcr = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$cacheFileDir, this.this$0, this.$uri, this.$uploadedFile, this.$viewModel, this.$originalFile, this.$contentType, this.$fileType, this.$shouldCallOcr, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r15v3, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r15v6, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r15v9, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            byte[] bArrKWHzl;
            Ref.ObjectRef<Pair<SingleFileUploadUseCase.UploadedFile, String>> objectRef;
            T t;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (this.$cacheFileDir == null) {
                    C42358rPx c42358rPx = this.this$0;
                    Context context = c42358rPx.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    bArrKWHzl = c42358rPx.KWHzl(context, this.$uri);
                } else {
                    bArrKWHzl = null;
                }
                Ref.ObjectRef<Pair<SingleFileUploadUseCase.UploadedFile, String>> objectRef2 = this.$uploadedFile;
                SingleFileUploadUseCase singleFileUploadUseCaseValueOf = this.$viewModel.gHZMYf().valueOf();
                Context context2 = this.this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                File file = this.$originalFile;
                String str = this.$contentType;
                int i2 = this.this$0.KWHzl;
                SingleFileUploadUseCase.FileType fileType = this.$fileType;
                boolean z = this.$shouldCallOcr;
                C05191 c05191 = new C05191(null);
                this.L$0 = objectRef2;
                this.label = 1;
                Object objAEQbTJ = singleFileUploadUseCaseValueOf.AEQbTJ(context2, file, bArrKWHzl, str, i2, fileType, z, c05191, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                objectRef = objectRef2;
                t = objAEQbTJ;
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

        /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.views.NewFileUploaderItemView$upload$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05191 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C05191(Continuation<? super C05191> continuation) {
                super(2, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05191(continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((C05191) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(EventParamsList eventParamsList) {
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invokeSuspend$lambda$3$lambda$2(Ref.ObjectRef objectRef, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "message", (String) ((Pair) objectRef.element).getSecond(), false, 4, null);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }
}
