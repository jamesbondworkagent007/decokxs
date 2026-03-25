package o;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.FileReceiveMessageViewProvider$buildLongClickMenuItems$2;
import com.okinc.im.imui.conversation.message.provider.FileReceiveMessageViewProvider$onMessageContentViewLongClick$1;
import com.okinc.im.imui.conversation.message.provider.FileReceiveMessageViewProvider$startDownload$1;
import com.okinc.im.imui.widgets.FileMessageState;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKFileMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
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
import o.sIS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nBm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33670nBm extends oAE<OKFileMessage, AbstractC33966nMl> {
    public final java.lang.Integer gEmmrt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final java.util.Set<java.lang.String> EZpvd = new LinkedHashSet();
    public static final CoroutineScope copydefault = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(sDN.copydefault.AEQbTJ()));
    public static final java.util.Map<java.lang.String, Job> KWHzl = new LinkedHashMap();
    public static final java.util.Map<java.lang.String, FileMessageState> AYXKKw = new LinkedHashMap();
    public static final java.util.Map<java.lang.String, java.lang.Integer> AEQbTJ = new LinkedHashMap();
    public final java.util.Map<java.lang.String, Function1<sIS, Unit>> djBIcL = new LinkedHashMap();
    public final int valueOf = C35399nuc.Dialog.tIwhY;

    /* JADX INFO: renamed from: o.nBm$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FileMessageState.values().length];
            try {
                iArr[FileMessageState.PENDING_DOWNLOAD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FileMessageState.DOWNLOAD_FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[FileMessageState.DOWNLOADING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[FileMessageState.DOWNLOADED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKFileMessage> KWHzl() {
        return OKFileMessage.class;
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        KWHzl((oAC<AbstractC44111sDt, AbstractC33966nMl>) oac, c35254nrp, (OKFileMessage) oKMessageContent);
    }

    /* JADX INFO: renamed from: o.nBm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nBm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final C35777oDh gEmmrt() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).OuxcSI();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKFileMessage oKFileMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKFileMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        int i = C35399nuc.LoaderManager.onAvailable;
        java.lang.String fileName = oKFileMessage.getFileName();
        return C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("filename", fileName != null ? fileName : "")));
    }

    public void KWHzl(@NotNull oAC<AbstractC44111sDt, AbstractC33966nMl> oac, @NotNull C35254nrp c35254nrp, @NotNull OKFileMessage oKFileMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKFileMessage, "");
        super.copydefault(oac, c35254nrp, oKFileMessage);
        C37728ozM c37728ozM = ((AbstractC33966nMl) oac.EZpvd()).copydefault;
        Intrinsics.checkNotNullExpressionValue(c37728ozM, "");
        java.lang.String strEZpvd = EZpvd(c35254nrp);
        FileMessageState fileMessageStateOLrzqt = OLrzqt(strEZpvd, oKFileMessage);
        oac.itemView.setTag(strEZpvd);
        c37728ozM.AEQbTJ(false);
        c37728ozM.AEQbTJ(oKFileMessage, fileMessageStateOLrzqt);
        AEQbTJ(c35254nrp, c37728ozM);
        if (fileMessageStateOLrzqt == FileMessageState.DOWNLOADING) {
            OLrzqt(c37728ozM, strEZpvd, oKFileMessage);
        }
        KWHzl(c37728ozM, oac, strEZpvd, c35254nrp, oKFileMessage);
    }

    @Override // o.oAE, o.AbstractC35703oAo, o.AbstractC35882oHe
    public void AEQbTJ(@NotNull oGY<AbstractC44111sDt> ogy) {
        Intrinsics.checkNotNullParameter(ogy, "");
        super.AEQbTJ(ogy);
        java.lang.Object tag = ogy.itemView.getTag();
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str == null) {
            return;
        }
        this.djBIcL.remove(str);
    }

    public final FileMessageState OLrzqt(java.lang.String str, OKFileMessage oKFileMessage) {
        FileMessageState fileMessageState;
        java.util.Map<java.lang.String, FileMessageState> map = AYXKKw;
        FileMessageState fileMessageState2 = map.get(str);
        if (fileMessageState2 != null) {
            return fileMessageState2;
        }
        java.util.Set<java.lang.String> set = EZpvd;
        if (set.contains(str)) {
            fileMessageState = FileMessageState.DOWNLOADED;
        } else if (EZpvd(oKFileMessage)) {
            set.add(str);
            fileMessageState = FileMessageState.DOWNLOADED;
        } else {
            fileMessageState = FileMessageState.PENDING_DOWNLOAD;
        }
        map.put(str, fileMessageState);
        return fileMessageState;
    }

    public final void OLrzqt(C37728ozM c37728ozM, java.lang.String str, OKFileMessage oKFileMessage) {
        java.lang.Integer num = AEQbTJ.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Long fileSize = oKFileMessage.getFileSize();
        long jLongValue = fileSize != null ? fileSize.longValue() : 0L;
        c37728ozM.setTransferProgress((((long) iIntValue) * jLongValue) / 100, jLongValue);
        KWHzl(c37728ozM, str, oKFileMessage);
    }

    public final void KWHzl(final C37728ozM c37728ozM, java.lang.String str, final OKFileMessage oKFileMessage) {
        this.djBIcL.put(str, new Function1() { // from class: o.nBu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33670nBm.KWHzl(this.KWHzl, c37728ozM, oKFileMessage, (sIS) obj);
            }
        });
    }

    public static final Unit KWHzl(C33670nBm c33670nBm, C37728ozM c37728ozM, OKFileMessage oKFileMessage, sIS sis) {
        Intrinsics.checkNotNullParameter(sis, "");
        c33670nBm.EZpvd(sis, c37728ozM, oKFileMessage);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final C37728ozM c37728ozM, final oAC<AbstractC44111sDt, AbstractC33966nMl> oac, final java.lang.String str, final C35254nrp c35254nrp, final OKFileMessage oKFileMessage) {
        c37728ozM.setOnActionClickListener(new Function0() { // from class: o.nBt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33670nBm.EZpvd(str, this, c37728ozM, c35254nrp, oKFileMessage, oac);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, C33670nBm c33670nBm, C37728ozM c37728ozM, C35254nrp c35254nrp, OKFileMessage oKFileMessage, oAC oac) {
        FileMessageState fileMessageState = AYXKKw.get(str);
        int i = fileMessageState == null ? -1 : Activity.copydefault[fileMessageState.ordinal()];
        if (i == 1 || i == 2) {
            c33670nBm.KWHzl(c37728ozM, str, c35254nrp, oKFileMessage);
        } else if (i == 3) {
            c33670nBm.EZpvd(c37728ozM, str, oKFileMessage);
        } else if (i == 4) {
            android.view.View view = oac.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            c33670nBm.EZpvd(c37728ozM, view, str, c35254nrp, oKFileMessage);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(C37728ozM c37728ozM, java.lang.String str, C35254nrp c35254nrp, OKFileMessage oKFileMessage) {
        java.util.Map<java.lang.String, Job> map = KWHzl;
        Job job = map.get(str);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        FileMessageState fileMessageState = FileMessageState.DOWNLOADING;
        copydefault(str, fileMessageState);
        AEQbTJ.put(str, 0);
        c37728ozM.AEQbTJ(oKFileMessage, fileMessageState);
        KWHzl(c37728ozM, str, oKFileMessage);
        map.put(str, BuildersKt__Builders_commonKt.launch$default(copydefault, null, null, new FileReceiveMessageViewProvider$startDownload$1(gEmmrt(), c35254nrp.OLrzqt(), this, str, null), 3, null));
    }

    public final void copydefault(sIS sis, java.lang.String str) {
        if (sis instanceof sIS.StateListAnimator) {
            AEQbTJ.put(str, java.lang.Integer.valueOf(((sIS.StateListAnimator) sis).KWHzl()));
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (sis instanceof sIS.Activity) {
            KWHzl(str);
            KWHzl.remove(str);
            this.djBIcL.remove(str);
        } else {
            if (!(sis instanceof sIS.Application) && !(sis instanceof sIS.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            copydefault(str, FileMessageState.DOWNLOAD_FAILED);
            KWHzl.remove(str);
            this.djBIcL.remove(str);
        }
    }

    public final void EZpvd(sIS sis, C37728ozM c37728ozM, OKFileMessage oKFileMessage) {
        if (sis instanceof sIS.StateListAnimator) {
            java.lang.Long fileSize = oKFileMessage.getFileSize();
            long jLongValue = fileSize != null ? fileSize.longValue() : 0L;
            c37728ozM.setTransferProgress((((long) ((sIS.StateListAnimator) sis).KWHzl()) * jLongValue) / 100, jLongValue);
        } else if (sis instanceof sIS.Activity) {
            c37728ozM.AEQbTJ(oKFileMessage, FileMessageState.DOWNLOADED);
        } else {
            if (!(sis instanceof sIS.Application) && !(sis instanceof sIS.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            c37728ozM.AEQbTJ(oKFileMessage, FileMessageState.DOWNLOAD_FAILED);
            copydefault(c37728ozM);
        }
    }

    public final void EZpvd(C37728ozM c37728ozM, java.lang.String str, OKFileMessage oKFileMessage) {
        java.util.Map<java.lang.String, Job> map = KWHzl;
        Job job = map.get(str);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        map.remove(str);
        this.djBIcL.remove(str);
        AEQbTJ.remove(str);
        FileMessageState fileMessageState = FileMessageState.PENDING_DOWNLOAD;
        copydefault(str, fileMessageState);
        c37728ozM.AEQbTJ(oKFileMessage, fileMessageState);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKFileMessage oKFileMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKFileMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        if (c35254nrp.KWHzl() != 0) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new FileReceiveMessageViewProvider$onMessageContentViewLongClick$1(this, c35254nrp, viewBinding, null), 3, null);
        return true;
    }

    public final java.lang.Object AEQbTJ(C35254nrp c35254nrp, Continuation<? super java.util.List<? extends MenuActionBase>> continuation) {
        return BuildersKt.withContext(sDN.copydefault.copydefault(), new FileReceiveMessageViewProvider$buildLongClickMenuItems$2(c35254nrp, this, null), continuation);
    }

    public final void EZpvd(C37728ozM c37728ozM, android.view.View view, java.lang.String str, C35254nrp c35254nrp, OKFileMessage oKFileMessage) {
        if (OLrzqt(oKFileMessage)) {
            KWHzl(view, oKFileMessage);
        } else {
            EZpvd.remove(str);
            KWHzl(c37728ozM, str, c35254nrp, oKFileMessage);
        }
    }

    public final void KWHzl(android.view.View view, OKFileMessage oKFileMessage) {
        android.net.Uri uriAEQbTJ = AEQbTJ(oKFileMessage);
        if (uriAEQbTJ == null) {
            copydefault(view);
            return;
        }
        C37669oyG c37669oyG = C37669oyG.AEQbTJ;
        java.lang.String strCopydefault = c37669oyG.copydefault(oKFileMessage.getFileExtension());
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c37669oyG.AEQbTJ(context, uriAEQbTJ, strCopydefault);
    }

    public final void copydefault(android.view.View view) {
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

    public final android.net.Uri AEQbTJ(OKFileMessage oKFileMessage) {
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

    public final boolean EZpvd(OKFileMessage oKFileMessage) {
        return OLrzqt(oKFileMessage);
    }

    public final boolean OLrzqt(OKFileMessage oKFileMessage) {
        java.lang.String path;
        android.net.Uri localUri = oKFileMessage.getLocalUri();
        if (localUri == null) {
            return false;
        }
        return !Intrinsics.EZpvd((java.lang.Object) localUri.getScheme(), (java.lang.Object) "file") || ((path = localUri.getPath()) != null && new java.io.File(path).exists());
    }

    public final void KWHzl(java.lang.String str) {
        EZpvd.add(str);
        copydefault(str, FileMessageState.DOWNLOADED);
    }

    public final void copydefault(java.lang.String str, FileMessageState fileMessageState) {
        AYXKKw.put(str, fileMessageState);
    }

    public final java.lang.String EZpvd(C35254nrp c35254nrp) {
        java.lang.String clientMessageId = c35254nrp.OLrzqt().getClientMessageId();
        return clientMessageId == null ? java.lang.String.valueOf(c35254nrp.OLrzqt().getSeq()) : clientMessageId;
    }
}
