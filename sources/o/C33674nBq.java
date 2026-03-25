package o;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.FileSendMessageViewProvider$attachProgressObserver$2;
import com.okinc.im.imui.conversation.message.provider.FileSendMessageViewProvider$buildLongClickMenuItems$2;
import com.okinc.im.imui.conversation.message.provider.FileSendMessageViewProvider$onMessageContentViewLongClick$1;
import com.okinc.im.imui.conversation.message.provider.FileSendMessageViewProvider$reDownloadAndOpen$2;
import com.okinc.im.imui.widgets.FileMessageState;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKFileMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C35399nuc;
import o.C44385sNw;
import o.sIS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nBq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33674nBq extends oAA<OKFileMessage, AbstractC33966nMl> {
    public final java.lang.Integer AYXKKw;
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static final CoroutineScope OLrzqt = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(sDN.copydefault.AEQbTJ()));
    public static final java.util.Map<java.lang.String, FileMessageState> copydefault = new LinkedHashMap();
    public static final java.util.Map<java.lang.String, java.lang.Integer> AEQbTJ = new LinkedHashMap();
    public static final java.util.Map<java.lang.String, Job> KWHzl = new LinkedHashMap();
    public final java.util.Map<java.lang.String, Function1<C44385sNw.TaskDescription, Unit>> djBIcL = new LinkedHashMap();
    public final java.util.Map<java.lang.String, Function1<sIS, Unit>> valueOf = new LinkedHashMap();
    public final java.util.Map<java.lang.String, Job> AhwBna = new LinkedHashMap();
    public final int gEmmrt = C35399nuc.Dialog.tIwhY;

    /* JADX INFO: renamed from: o.nBq$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FileMessageState.values().length];
            try {
                iArr[FileMessageState.SENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FileMessageState.UPLOADING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[FileMessageState.UPLOAD_CANCELLED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[FileMessageState.UPLOAD_FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKFileMessage> KWHzl() {
        return OKFileMessage.class;
    }

    @Override // o.oAA, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        OLrzqt((oAC<AbstractC44112sDu, AbstractC33966nMl>) oac, c35254nrp, (OKFileMessage) oKMessageContent);
    }

    /* JADX INFO: renamed from: o.nBq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nBq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.lang.String KWHzl(java.lang.String str) {
            return C59454zhO.isConnected(str, 8);
        }
    }

    private final C35777oDh djBIcL() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).OuxcSI();
    }

    public final C35802oEf AYXKKw() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).DarRvM();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKFileMessage oKFileMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKFileMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        int i = C35399nuc.LoaderManager.onAvailable;
        java.lang.String fileName = oKFileMessage.getFileName();
        return C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("filename", fileName != null ? fileName : "")));
    }

    public void OLrzqt(@NotNull oAC<AbstractC44112sDu, AbstractC33966nMl> oac, @NotNull C35254nrp c35254nrp, @NotNull OKFileMessage oKFileMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKFileMessage, "");
        super.copydefault(oac, c35254nrp, oKFileMessage);
        C37728ozM c37728ozM = ((AbstractC33966nMl) oac.EZpvd()).copydefault;
        Intrinsics.checkNotNullExpressionValue(c37728ozM, "");
        java.lang.String strEZpvd = EZpvd(c35254nrp);
        FileMessageState fileMessageStateKWHzl = KWHzl(strEZpvd, c35254nrp);
        oac.itemView.setTag(strEZpvd);
        c37728ozM.AEQbTJ(true);
        c37728ozM.AEQbTJ(oKFileMessage, fileMessageStateKWHzl);
        AEQbTJ(c35254nrp, c37728ozM);
        if (fileMessageStateKWHzl == FileMessageState.UPLOADING) {
            OLrzqt(c37728ozM, strEZpvd, oKFileMessage);
        } else {
            EZpvd(strEZpvd);
        }
        copydefault(c37728ozM, oac, strEZpvd, c35254nrp, oKFileMessage);
    }

    @Override // o.oAA, o.AbstractC35703oAo, o.AbstractC35882oHe
    public void AEQbTJ(@NotNull oGY<AbstractC44112sDu> ogy) {
        Intrinsics.checkNotNullParameter(ogy, "");
        super.AEQbTJ(ogy);
        java.lang.Object tag = ogy.itemView.getTag();
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str == null) {
            return;
        }
        this.djBIcL.remove(str);
    }

    public final FileMessageState KWHzl(java.lang.String str, C35254nrp c35254nrp) {
        FileMessageState fileMessageState;
        java.util.Map<java.lang.String, FileMessageState> map = copydefault;
        FileMessageState fileMessageState2 = map.get(str);
        int iKWHzl = c35254nrp.KWHzl();
        if (iKWHzl == 1) {
            fileMessageState = FileMessageState.UPLOAD_FAILED;
        } else if (iKWHzl == 2) {
            fileMessageState = fileMessageState2 == null ? FileMessageState.UPLOADING : fileMessageState2;
        } else {
            fileMessageState = FileMessageState.SENT;
        }
        map.put(str, fileMessageState);
        pUU.EZpvd(uzCIH(), "[" + Companion.KWHzl(str) + "] resolveState: uiState=" + c35254nrp.KWHzl() + ", cached=" + fileMessageState2 + " -> " + fileMessageState);
        return fileMessageState;
    }

    public final void OLrzqt(C37728ozM c37728ozM, java.lang.String str, OKFileMessage oKFileMessage) {
        java.lang.Integer num = AEQbTJ.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Long fileSize = oKFileMessage.getFileSize();
        long jLongValue = fileSize != null ? fileSize.longValue() : 0L;
        c37728ozM.setTransferProgress((((long) iIntValue) * jLongValue) / 100, jLongValue);
        AEQbTJ(c37728ozM, str, oKFileMessage);
    }

    public final void AEQbTJ(final C37728ozM c37728ozM, java.lang.String str, final OKFileMessage oKFileMessage) {
        this.djBIcL.put(str, new Function1() { // from class: o.nBz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33674nBq.AEQbTJ(this.AEQbTJ, c37728ozM, oKFileMessage, (C44385sNw.TaskDescription) obj);
            }
        });
        if (this.AhwBna.containsKey(str)) {
            pUU.EZpvd(uzCIH(), "[" + Companion.KWHzl(str) + "] attachProgressObserver: observer already active, reusing");
            return;
        }
        pUU.EZpvd(uzCIH(), "[" + Companion.KWHzl(str) + "] attachProgressObserver: creating new observer");
        this.AhwBna.put(str, BuildersKt__Builders_commonKt.launch$default(OLrzqt, null, null, new FileSendMessageViewProvider$attachProgressObserver$2(this, str, null), 3, null));
    }

    public static final Unit AEQbTJ(C33674nBq c33674nBq, C37728ozM c37728ozM, OKFileMessage oKFileMessage, C44385sNw.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c33674nBq.KWHzl(taskDescription, c37728ozM, oKFileMessage);
        return Unit.INSTANCE;
    }

    public final void EZpvd(C44385sNw.TaskDescription taskDescription, java.lang.String str) {
        pUU.EZpvd(uzCIH(), "[" + Companion.KWHzl(str) + "] updateUploadState: event=" + taskDescription);
        if (taskDescription instanceof C44385sNw.TaskDescription.ActionBar) {
            AEQbTJ.put(str, java.lang.Integer.valueOf(((C44385sNw.TaskDescription.ActionBar) taskDescription).OLrzqt()));
            return;
        }
        if (taskDescription instanceof C44385sNw.TaskDescription.Application) {
            AEQbTJ(str, FileMessageState.SENT);
            EZpvd(str);
        } else if (taskDescription instanceof C44385sNw.TaskDescription.StateListAnimator) {
            AEQbTJ(str, FileMessageState.UPLOAD_FAILED);
            EZpvd(str);
        } else {
            if (!(taskDescription instanceof C44385sNw.TaskDescription.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            AEQbTJ(str, FileMessageState.UPLOAD_CANCELLED);
            EZpvd(str);
        }
    }

    public final void KWHzl(C44385sNw.TaskDescription taskDescription, C37728ozM c37728ozM, OKFileMessage oKFileMessage) {
        if (taskDescription instanceof C44385sNw.TaskDescription.ActionBar) {
            java.lang.Long fileSize = oKFileMessage.getFileSize();
            long jLongValue = fileSize != null ? fileSize.longValue() : 0L;
            c37728ozM.setTransferProgress((((long) ((C44385sNw.TaskDescription.ActionBar) taskDescription).OLrzqt()) * jLongValue) / 100, jLongValue);
        } else if (taskDescription instanceof C44385sNw.TaskDescription.Application) {
            c37728ozM.AEQbTJ(oKFileMessage, FileMessageState.SENT);
        } else if (taskDescription instanceof C44385sNw.TaskDescription.StateListAnimator) {
            c37728ozM.AEQbTJ(oKFileMessage, FileMessageState.UPLOAD_FAILED);
        } else {
            if (!(taskDescription instanceof C44385sNw.TaskDescription.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            c37728ozM.AEQbTJ(oKFileMessage, FileMessageState.UPLOAD_CANCELLED);
        }
    }

    private final void copydefault(final C37728ozM c37728ozM, final oAC<AbstractC44112sDu, AbstractC33966nMl> oac, final java.lang.String str, final C35254nrp c35254nrp, final OKFileMessage oKFileMessage) {
        c37728ozM.setOnActionClickListener(new Function0() { // from class: o.nBs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33674nBq.copydefault(str, this, c37728ozM, oac, c35254nrp, oKFileMessage);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, C33674nBq c33674nBq, C37728ozM c37728ozM, oAC oac, C35254nrp c35254nrp, OKFileMessage oKFileMessage) {
        FileMessageState fileMessageState = copydefault.get(str);
        pUU.EZpvd(c33674nBq.uzCIH(), "[" + Companion.KWHzl(str) + "] actionClick: state=" + fileMessageState);
        int i = fileMessageState == null ? -1 : ActionBar.AEQbTJ[fileMessageState.ordinal()];
        if (i == 1) {
            android.view.View view = oac.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            c33674nBq.copydefault(c37728ozM, view, str, c35254nrp, oKFileMessage);
        } else if (i == 2) {
            c33674nBq.copydefault(str);
        } else if (i == 3 || i == 4) {
            c33674nBq.copydefault(c37728ozM, str, c35254nrp, oKFileMessage);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.String str) {
        InterfaceC35179nqT interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
        java.lang.String strUzCIH = uzCIH();
        Application application = Companion;
        pUU.EZpvd(strUzCIH, "[" + application.KWHzl(str) + "] cancelUpload: serviceNull=" + (interfaceC35179nqT == null));
        boolean zEZpvd = interfaceC35179nqT != null ? interfaceC35179nqT.EZpvd(str) : false;
        pUU.EZpvd(uzCIH(), "[" + application.KWHzl(str) + "] cancelUpload: wasCancelled=" + zEZpvd);
        if (zEZpvd) {
            copydefault.remove(str);
            EZpvd(str);
        }
    }

    public final void copydefault(C37728ozM c37728ozM, java.lang.String str, C35254nrp c35254nrp, OKFileMessage oKFileMessage) {
        FileMessageState fileMessageState = FileMessageState.UPLOADING;
        AEQbTJ(str, fileMessageState);
        AEQbTJ.put(str, 0);
        c37728ozM.AEQbTJ(oKFileMessage, fileMessageState);
        AEQbTJ(c37728ozM, str, oKFileMessage);
        AEQbTJ(c35254nrp, c35254nrp.OLrzqt(), -1);
    }

    @Override // o.oAA
    public void AEQbTJ(@NotNull C35254nrp c35254nrp, @NotNull OKMessage oKMessage, int i) {
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String strEZpvd = EZpvd(c35254nrp);
        AEQbTJ(strEZpvd, FileMessageState.UPLOADING);
        AEQbTJ.put(strEZpvd, 0);
        super.AEQbTJ(c35254nrp, oKMessage, i);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKFileMessage oKFileMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKFileMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        if (!getFieldNames() || c35254nrp.KWHzl() != 0) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new FileSendMessageViewProvider$onMessageContentViewLongClick$1(this, c35254nrp, viewBinding, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object EZpvd(C35254nrp c35254nrp, Continuation<? super java.util.List<? extends MenuActionBase>> continuation) {
        return BuildersKt.withContext(sDN.copydefault.copydefault(), new FileSendMessageViewProvider$buildLongClickMenuItems$2(c35254nrp, this, null), continuation);
    }

    private final void copydefault(C37728ozM c37728ozM, android.view.View view, java.lang.String str, C35254nrp c35254nrp, OKFileMessage oKFileMessage) {
        if (KWHzl(oKFileMessage)) {
            EZpvd(view, oKFileMessage);
            return;
        }
        pUU.EZpvd(uzCIH(), "[" + Companion.KWHzl(str) + "] local file missing, re-downloading");
        AEQbTJ(c37728ozM, view, str, c35254nrp, oKFileMessage);
    }

    public final void AEQbTJ(final C37728ozM c37728ozM, final android.view.View view, final java.lang.String str, C35254nrp c35254nrp, final OKFileMessage oKFileMessage) {
        java.util.Map<java.lang.String, Job> map = KWHzl;
        Job job = map.get(str);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        FileMessageState fileMessageState = FileMessageState.DOWNLOADING;
        AEQbTJ(str, fileMessageState);
        c37728ozM.AEQbTJ(oKFileMessage, fileMessageState);
        this.valueOf.put(str, new Function1() { // from class: o.nBr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33674nBq.EZpvd(this.copydefault, c37728ozM, view, str, oKFileMessage, (sIS) obj);
            }
        });
        map.put(str, BuildersKt__Builders_commonKt.launch$default(OLrzqt, null, null, new FileSendMessageViewProvider$reDownloadAndOpen$2(djBIcL(), c35254nrp.OLrzqt(), this, str, null), 3, null));
    }

    public static final Unit EZpvd(C33674nBq c33674nBq, C37728ozM c37728ozM, android.view.View view, java.lang.String str, OKFileMessage oKFileMessage, sIS sis) {
        Intrinsics.checkNotNullParameter(sis, "");
        c33674nBq.copydefault(sis, c37728ozM, view, str, oKFileMessage);
        return Unit.INSTANCE;
    }

    public final void copydefault(sIS sis, C37728ozM c37728ozM, android.view.View view, java.lang.String str, OKFileMessage oKFileMessage) {
        if (sis instanceof sIS.StateListAnimator) {
            java.lang.Long fileSize = oKFileMessage.getFileSize();
            long jLongValue = fileSize != null ? fileSize.longValue() : 0L;
            c37728ozM.setTransferProgress((((long) ((sIS.StateListAnimator) sis).KWHzl()) * jLongValue) / 100, jLongValue);
            return;
        }
        if (sis instanceof sIS.Activity) {
            FileMessageState fileMessageState = FileMessageState.SENT;
            AEQbTJ(str, fileMessageState);
            c37728ozM.AEQbTJ(oKFileMessage, fileMessageState);
            OLrzqt(str);
            EZpvd(view, oKFileMessage);
            return;
        }
        if (!(sis instanceof sIS.Application) && !(sis instanceof sIS.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        FileMessageState fileMessageState2 = FileMessageState.SENT;
        AEQbTJ(str, fileMessageState2);
        c37728ozM.AEQbTJ(oKFileMessage, fileMessageState2);
        OLrzqt(str);
        AEQbTJ(view);
    }

    public final void OLrzqt(java.lang.String str) {
        KWHzl.remove(str);
        this.valueOf.remove(str);
    }

    private final boolean KWHzl(OKFileMessage oKFileMessage) {
        java.lang.String path;
        android.net.Uri localUri = oKFileMessage.getLocalUri();
        if (localUri == null) {
            return false;
        }
        return !Intrinsics.EZpvd((java.lang.Object) localUri.getScheme(), (java.lang.Object) "file") || ((path = localUri.getPath()) != null && new java.io.File(path).exists());
    }

    private final void EZpvd(android.view.View view, OKFileMessage oKFileMessage) {
        android.net.Uri uriEZpvd = EZpvd(oKFileMessage);
        if (uriEZpvd == null) {
            AEQbTJ(view);
            return;
        }
        C37669oyG c37669oyG = C37669oyG.AEQbTJ;
        java.lang.String strCopydefault = c37669oyG.copydefault(oKFileMessage.getFileExtension());
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c37669oyG.AEQbTJ(context, uriEZpvd, strCopydefault);
    }

    private final void AEQbTJ(android.view.View view) {
        android.view.View rootView = view.getRootView();
        android.view.ViewGroup viewGroup = rootView instanceof android.view.ViewGroup ? (android.view.ViewGroup) rootView : null;
        if (viewGroup == null) {
            return;
        }
        java.lang.String string = viewGroup.getContext().getString(C35399nuc.LoaderManager.DDjfYY);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(viewGroup, string);
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(0);
            c55284xgzKWHzl.AEQbTJ(string);
            c55284xgzKWHzl.hDKMBd();
        }
    }

    private final android.net.Uri EZpvd(OKFileMessage oKFileMessage) {
        java.lang.String cdn;
        android.net.Uri localUri = oKFileMessage.getLocalUri();
        if (localUri != null) {
            return localUri;
        }
        android.net.Uri remoteUri = oKFileMessage.getRemoteUri();
        if (remoteUri != null) {
            return remoteUri;
        }
        MediaUrlPaths urlPaths = oKFileMessage.getUrlPaths();
        if (urlPaths == null || (cdn = urlPaths.getDefault()) == null) {
            MediaUrlPaths urlPaths2 = oKFileMessage.getUrlPaths();
            cdn = urlPaths2 != null ? urlPaths2.getCdn() : null;
        }
        if (cdn == null) {
            return null;
        }
        android.net.Uri uri = android.net.Uri.parse(cdn);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        return uri;
    }

    private final void AEQbTJ(java.lang.String str, FileMessageState fileMessageState) {
        copydefault.put(str, fileMessageState);
    }

    public final void EZpvd(java.lang.String str) {
        pUU.EZpvd(uzCIH(), "[" + Companion.KWHzl(str) + "] cleanupObserver");
        Job jobRemove = this.AhwBna.remove(str);
        if (jobRemove != null) {
            Job.DefaultImpls.cancel$default(jobRemove, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.djBIcL.remove(str);
        AEQbTJ.remove(str);
        C44385sNw.KWHzl.OLrzqt(str);
    }

    private final java.lang.String EZpvd(C35254nrp c35254nrp) {
        java.lang.String clientMessageId = c35254nrp.OLrzqt().getClientMessageId();
        return clientMessageId == null ? java.lang.String.valueOf(c35254nrp.OLrzqt().getSeq()) : clientMessageId;
    }
}
