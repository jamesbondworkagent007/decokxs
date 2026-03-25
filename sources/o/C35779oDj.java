package o;

import com.okinc.im.usecase.file.DownloadMediaToExternalStorageUseCase$invoke$$inlined$map$1$2$1;
import com.okinc.im.usecase.file.DownloadMediaToExternalStorageUseCase$invoke$1;
import com.okinc.im.usecase.file.DownloadMediaToExternalStorageUseCase$invoke$3;
import com.okinc.okimcore.model.im.OKMediaMessageContent;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.sIS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35779oDj {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final android.content.Context EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C35779oDj(@NotNull android.content.Context context, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = context;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.oDj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oDj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull OKMessage oKMessage, @NotNull java.lang.String str, @NotNull Continuation<? super Flow<? extends sIS>> continuation) throws java.lang.Throwable {
        DownloadMediaToExternalStorageUseCase$invoke$1 downloadMediaToExternalStorageUseCase$invoke$1;
        C35779oDj c35779oDj;
        if (continuation instanceof DownloadMediaToExternalStorageUseCase$invoke$1) {
            downloadMediaToExternalStorageUseCase$invoke$1 = (DownloadMediaToExternalStorageUseCase$invoke$1) continuation;
            int i = downloadMediaToExternalStorageUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                downloadMediaToExternalStorageUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                downloadMediaToExternalStorageUseCase$invoke$1 = new DownloadMediaToExternalStorageUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = downloadMediaToExternalStorageUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = downloadMediaToExternalStorageUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            sIT sit = sIT.AEQbTJ;
            android.content.Context context = this.EZpvd;
            downloadMediaToExternalStorageUseCase$invoke$1.L$0 = this;
            downloadMediaToExternalStorageUseCase$invoke$1.L$1 = str;
            downloadMediaToExternalStorageUseCase$invoke$1.label = 1;
            objCopydefault = sit.copydefault(oKMessage, context, downloadMediaToExternalStorageUseCase$invoke$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c35779oDj = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) downloadMediaToExternalStorageUseCase$invoke$1.L$1;
            c35779oDj = (C35779oDj) downloadMediaToExternalStorageUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        return FlowKt.flowOn(FlowKt.m7441catch(new Application((Flow) objCopydefault, c35779oDj, str), new DownloadMediaToExternalStorageUseCase$invoke$3(null)), c35779oDj.KWHzl);
    }

    /* JADX INFO: renamed from: o.oDj$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application implements Flow<sIS> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ C35779oDj copydefault;

        /* JADX INFO: renamed from: o.oDj$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C35779oDj KWHzl;
            public final /* synthetic */ java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, C35779oDj c35779oDj, java.lang.String str) {
                this.AEQbTJ = flowCollector;
                this.KWHzl = c35779oDj;
                this.copydefault = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                DownloadMediaToExternalStorageUseCase$invoke$$inlined$map$1$2$1 downloadMediaToExternalStorageUseCase$invoke$$inlined$map$1$2$1;
                if (continuation instanceof DownloadMediaToExternalStorageUseCase$invoke$$inlined$map$1$2$1) {
                    downloadMediaToExternalStorageUseCase$invoke$$inlined$map$1$2$1 = (DownloadMediaToExternalStorageUseCase$invoke$$inlined$map$1$2$1) continuation;
                    int i = downloadMediaToExternalStorageUseCase$invoke$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        downloadMediaToExternalStorageUseCase$invoke$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        downloadMediaToExternalStorageUseCase$invoke$$inlined$map$1$2$1 = new DownloadMediaToExternalStorageUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = downloadMediaToExternalStorageUseCase$invoke$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = downloadMediaToExternalStorageUseCase$invoke$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    sIS sis = (sIS) obj;
                    if (sis instanceof sIS.Activity) {
                        pUU.KWHzl("DownloadMediaToExternalStorageUseCase", "File downloaded to private storage, validating...");
                        OKMessageContent content = ((sIS.Activity) sis).copydefault().getContent();
                        OKMediaMessageContent oKMediaMessageContent = content instanceof OKMediaMessageContent ? (OKMediaMessageContent) content : null;
                        if (oKMediaMessageContent == null) {
                            throw new java.lang.IllegalArgumentException("Unknown message content type".toString());
                        }
                        android.net.Uri localUri = oKMediaMessageContent.getLocalUri();
                        if (localUri == null) {
                            throw new java.lang.IllegalArgumentException("local uri not found".toString());
                        }
                        pUU.KWHzl("DownloadMediaToExternalStorageUseCase", "localUri: " + localUri);
                        this.KWHzl.KWHzl(localUri, this.copydefault);
                    } else if (sis instanceof sIS.Application) {
                        pUU.AEQbTJ("DownloadMediaToExternalStorageUseCase", "downloadMedia: error", ((sIS.Application) sis).copydefault());
                    } else if (!(sis instanceof sIS.StateListAnimator) && !(sis instanceof sIS.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    downloadMediaToExternalStorageUseCase$invoke$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(sis, downloadMediaToExternalStorageUseCase$invoke$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow, C35779oDj c35779oDj, java.lang.String str) {
            this.EZpvd = flow;
            this.copydefault = c35779oDj;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super sIS> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector, this.copydefault, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final void KWHzl(android.net.Uri uri, java.lang.String str) throws java.io.FileNotFoundException {
        java.lang.String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        java.io.File file = new java.io.File(path);
        if (file.exists()) {
            pUU.KWHzl("DownloadMediaToExternalStorageUseCase", "File exists, attempting to save to external: " + uri);
            C37720ozE.copydefault(this.EZpvd, file, str);
            return;
        }
        throw new java.io.FileNotFoundException();
    }
}
