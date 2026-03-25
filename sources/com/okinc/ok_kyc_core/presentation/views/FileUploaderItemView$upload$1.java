package com.okinc.ok_kyc_core.presentation.views;

import android.content.Context;
import android.net.Uri;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import com.okinc.ok_kyc_core.presentation.views.FileUploaderItemView$upload$1;
import com.okinc.ok_kyc_widget.Upload;
import com.okinc.ok_kyc_widget.UploadNew;
import java.io.File;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C32866mlf;
import o.C43251rlk;
import o.C43296rmc;
import o.C56391yDq;
import o.C56442yFn;
import o.C6800aWH;
import o.pUU;
import o.rAX;
import o.rGL;
import o.rLY;
import o.yDY;

/* JADX INFO: loaded from: classes23.dex */
public final class FileUploaderItemView$upload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $cacheFileDir;
    final /* synthetic */ String $contentType;
    final /* synthetic */ rAX<List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> $cur;
    final /* synthetic */ Ref.ObjectRef<File> $file;
    final /* synthetic */ SingleFileUploadUseCase.FileType $fileType;
    final /* synthetic */ File $originalFile;
    final /* synthetic */ boolean $shouldCallOcr;
    final /* synthetic */ Uri $uri;
    final /* synthetic */ rGL $viewModel;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ rLY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileUploaderItemView$upload$1(rLY rly, File file, Uri uri, rGL rgl, Ref.ObjectRef<File> objectRef, String str, SingleFileUploadUseCase.FileType fileType, boolean z, rAX<List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax, File file2, Continuation<? super FileUploaderItemView$upload$1> continuation) {
        super(2, continuation);
        this.this$0 = rly;
        this.$cacheFileDir = file;
        this.$uri = uri;
        this.$viewModel = rgl;
        this.$file = objectRef;
        this.$contentType = str;
        this.$fileType = fileType;
        this.$shouldCallOcr = z;
        this.$cur = rax;
        this.$originalFile = file2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileUploaderItemView$upload$1 fileUploaderItemView$upload$1 = new FileUploaderItemView$upload$1(this.this$0, this.$cacheFileDir, this.$uri, this.$viewModel, this.$file, this.$contentType, this.$fileType, this.$shouldCallOcr, this.$cur, this.$originalFile, continuation);
        fileUploaderItemView$upload$1.L$0 = obj;
        return fileUploaderItemView$upload$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileUploaderItemView$upload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, kotlin.Pair] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final Ref.ObjectRef objectRef;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            this.this$0.KWHzl().OLrzqt.setUploading();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = new Pair(null, "");
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cacheFileDir, this.this$0, this.$uri, objectRef2, this.$viewModel, this.$file, this.$contentType, this.$fileType, this.$shouldCallOcr, null);
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
        if (!this.this$0.KWHzl) {
            SingleFileUploadUseCase.UploadedFile uploadedFile = (SingleFileUploadUseCase.UploadedFile) ((Pair) objectRef.element).getFirst();
            if (uploadedFile != null) {
                rGL rgl = this.$viewModel;
                rAX<List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax = this.$cur;
                rLY rly = this.this$0;
                File file = this.$originalFile;
                Ref.ObjectRef<File> objectRef3 = this.$file;
                rgl.flVtFt().add(new com.okinc.ok_kyc_core.data.remote.networkmodel.File(uploadedFile.getImageId(), uploadedFile.getImageType(), uploadedFile.getImageName(), (UploadNew.SerializableUploadFileViewModel) null, 8, (DefaultConstructorMarker) null));
                rax.setValue(rgl.flVtFt());
                rly.KWHzl().OLrzqt.EZpvd(yDY.AhwBna(new Upload.TaskDescription(null, uploadedFile.getImageId(), uploadedFile.getImageName())));
                rly.KWHzl().OLrzqt.setUpload();
                C43296rmc.copydefault("FileUpload", uploadedFile.getImageId() + " " + uploadedFile.getImageName() + " " + uploadedFile.getImageType());
                C6800aWH.EZpvd(file.getPath());
                C6800aWH.EZpvd(objectRef3.element.getPath());
                C32866mlf.onEvent$default("KYC_Upload_File_Success", (TrackChannel[]) null, new Function1() { // from class: o.rMf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return FileUploaderItemView$upload$1.invokeSuspend$lambda$1$lambda$0((EventParamsList) obj2);
                    }
                }, 1, (Object) null);
            } else {
                rLY rly2 = this.this$0;
                C32866mlf.onEvent$default("KYC_Upload_File_Error", (TrackChannel[]) null, new Function1() { // from class: o.rMm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return FileUploaderItemView$upload$1.invokeSuspend$lambda$3$lambda$2(objectRef, (EventParamsList) obj2);
                    }
                }, 1, (Object) null);
                rly2.KWHzl().OLrzqt.setFailed((String) ((Pair) objectRef.element).getSecond());
                pUU.copydefault("FileUpload", "fail to upload " + ((Pair) objectRef.element).getSecond());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.views.FileUploaderItemView$upload$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $cacheFileDir;
        final /* synthetic */ String $contentType;
        final /* synthetic */ Ref.ObjectRef<File> $file;
        final /* synthetic */ SingleFileUploadUseCase.FileType $fileType;
        final /* synthetic */ boolean $shouldCallOcr;
        final /* synthetic */ Ref.ObjectRef<Pair<SingleFileUploadUseCase.UploadedFile, String>> $uploadedFile;
        final /* synthetic */ Uri $uri;
        final /* synthetic */ rGL $viewModel;
        Object L$0;
        int label;
        final /* synthetic */ rLY this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File file, rLY rly, Uri uri, Ref.ObjectRef<Pair<SingleFileUploadUseCase.UploadedFile, String>> objectRef, rGL rgl, Ref.ObjectRef<File> objectRef2, String str, SingleFileUploadUseCase.FileType fileType, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cacheFileDir = file;
            this.this$0 = rly;
            this.$uri = uri;
            this.$uploadedFile = objectRef;
            this.$viewModel = rgl;
            this.$file = objectRef2;
            this.$contentType = str;
            this.$fileType = fileType;
            this.$shouldCallOcr = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$cacheFileDir, this.this$0, this.$uri, this.$uploadedFile, this.$viewModel, this.$file, this.$contentType, this.$fileType, this.$shouldCallOcr, continuation);
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
            byte[] bArrEZpvd;
            Ref.ObjectRef<Pair<SingleFileUploadUseCase.UploadedFile, String>> objectRef;
            T t;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (this.$cacheFileDir == null) {
                    rLY rly = this.this$0;
                    Context context = rly.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    bArrEZpvd = rly.EZpvd(context, this.$uri);
                } else {
                    bArrEZpvd = null;
                }
                Ref.ObjectRef<Pair<SingleFileUploadUseCase.UploadedFile, String>> objectRef2 = this.$uploadedFile;
                SingleFileUploadUseCase singleFileUploadUseCaseValueOf = this.$viewModel.gHZMYf().valueOf();
                Context context2 = this.this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                File file = this.$file.element;
                String str = this.$contentType;
                int i2 = this.this$0.AEQbTJ;
                SingleFileUploadUseCase.FileType fileType = this.$fileType;
                boolean z = this.$shouldCallOcr;
                C05171 c05171 = new C05171(this.this$0, null);
                this.L$0 = objectRef2;
                this.label = 1;
                Object objAEQbTJ = singleFileUploadUseCaseValueOf.AEQbTJ(context2, file, bArrEZpvd, str, i2, fileType, z, c05171, this);
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

        /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.views.FileUploaderItemView$upload$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05171 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ rLY this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05171(rLY rly, Continuation<? super C05171> continuation) {
                super(2, continuation);
                this.this$0 = rly;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05171 c05171 = new C05171(this.this$0, continuation);
                c05171.L$0 = obj;
                return c05171;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((C05171) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.views.FileUploaderItemView$upload$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C05181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $it;
                int label;
                final /* synthetic */ rLY this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05181(rLY rly, String str, Continuation<? super C05181> continuation) {
                    super(2, continuation);
                    this.this$0 = rly;
                    this.$it = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C05181(this.this$0, this.$it, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C05181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        this.this$0.KWHzl().OLrzqt.setUploadingPercentage(this.$it);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    String str = (String) this.L$0;
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    C05181 c05181 = new C05181(this.this$0, str, null);
                    this.label = 1;
                    if (BuildersKt.withContext(main, c05181, this) == objCopydefault) {
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
