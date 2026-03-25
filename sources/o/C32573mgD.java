package o;

import androidx.core.content.FileProvider;
import com.okinc.base.uploadlog.UpLoadLogException;
import com.okinc.base.utils.OkUtils;
import com.okinc.breakpad.OKBreakpad;
import com.okinc.components.report.EventAction;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.lib.dionysus.crash.DeviceInfoHelper;
import com.okinc.lib.dionysus.crash.bean.ErrorAttachmentLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C38002pIp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mgD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32573mgD implements pIB, InterfaceC38050pKj, pIE {
    public final Function0<C38012pIz> EZpvd;
    public final android.app.Application KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pIB
    public void KWHzl(java.lang.Throwable th, @NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    public C32573mgD(@NotNull android.app.Application application, @NotNull Function0<C38012pIz> function0) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = application;
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 android.app.Application)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function0:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:38) call: o.mgA.<init>():void type: CONSTRUCTOR) : (r2v0 kotlin.jvm.functions.Function0))
 A[MD:(android.app.Application, kotlin.jvm.functions.Function0<o.pIz>):void (m)] (LINE:36) call: o.mgD.<init>(android.app.Application, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C32573mgD(android.app.Application application, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, (i & 2) != 0 ? new Function0() { // from class: o.mgA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32573mgD.OLrzqt();
            }
        } : function0);
    }

    public static final C38012pIz OLrzqt() {
        return new C38012pIz();
    }

    public final void KWHzl(boolean z) {
        this.EZpvd.invoke().EZpvd(z).KWHzl(true).copydefault(z).OLrzqt(true).AEQbTJ(3).copydefault(ActivityC32610mgo.class).EZpvd(this).KWHzl(this).copydefault(this).copydefault().KWHzl(this.KWHzl);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.aVK.asyncGetLocalLogFiles$default(o.aVK, boolean, java.util.ArrayList, long, int, java.lang.Object):o.ywX */
    @Override // o.pIB
    public void AEQbTJ(java.lang.Throwable th, @NotNull final android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            C38002pIp.Application application = C38002pIp.Companion;
            java.util.List<java.io.File> listFetchVPNInfo = application.fetchVPNInfo();
            java.util.ArrayList<java.io.File> arrayListAEQbTJ = application.AEQbTJ();
            arrayList.addAll(listFetchVPNInfo);
            arrayList.addAll(arrayListAEQbTJ);
            pUU.copydefault("Monitor.Dionysus", "exportLog nativeCrash:" + listFetchVPNInfo.size() + " javaCrash:" + arrayListAEQbTJ.size());
            AbstractC58185ywX abstractC58185ywXAsyncGetLocalLogFiles$default = C6750aVK.asyncGetLocalLogFiles$default(C6750aVK.KWHzl, false, arrayList, 0L, 4, null);
            final Function1 function1 = new Function1() { // from class: o.mgH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C32573mgD.KWHzl(this.EZpvd, activity, (java.io.File) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mgF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C32573mgD.copydefault(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.mgE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C32573mgD.EZpvd(this.copydefault, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXAsyncGetLocalLogFiles$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.mgG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C32573mgD.OLrzqt(function12, obj);
                }
            });
        } catch (java.lang.Exception e) {
            pUU.copydefault("Monitor.Dionysus", "exportLog e:" + e.getMessage() + " ");
            EZpvd("export log fail [" + e.getMessage() + "]");
            C6777aVl.Companion.EZpvd(new UpLoadLogException("Dionysus export log fail"));
        }
    }

    public static final Unit KWHzl(C32573mgD c32573mgD, android.app.Activity activity, java.io.File file) {
        c32573mgD.EZpvd(activity, file);
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C32573mgD c32573mgD, java.lang.Throwable th) {
        c32573mgD.EZpvd("export log fail [" + th + "]");
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void EZpvd(java.lang.String str) {
        android.widget.Toast.makeText(this.KWHzl, str, 0).show();
    }

    @Override // o.pIB
    public java.lang.Iterable<ErrorAttachmentLog> KWHzl() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            pUU.copydefault();
            java.io.File zipFileByLimit$default = pUU.getZipFileByLimit$default(7340032L, null, 2, null);
            java.io.FileInputStream fileInputStream = zipFileByLimit$default != null ? new java.io.FileInputStream(zipFileByLimit$default) : null;
            arrayList.add(ErrorAttachmentLog.attachmentWithBinary(C33486mxP.OLrzqt(fileInputStream), zipFileByLimit$default != null ? zipFileByLimit$default.getName() : null, "zip"));
            C33486mxP.AEQbTJ((java.io.InputStream) fileInputStream);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.copydefault("Monitor.Dionysus", "getErrorAttachments error: \n" + Unit.INSTANCE);
        }
        return arrayList;
    }

    @Override // o.pIB
    public boolean copydefault(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return C6768aVc.copydefault.KWHzl(th);
    }

    @Override // o.InterfaceC38050pKj
    public void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.EZpvd("Monitor.Dionysus", str + "--" + str2);
    }

    @Override // o.InterfaceC38050pKj
    public void EZpvd(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.copydefault("Monitor.Dionysus", str + "--" + str2);
    }

    @Override // o.InterfaceC38050pKj
    public void copydefault(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.AEQbTJ("Monitor.Dionysus", str + "--" + str2, th);
    }

    @Override // o.InterfaceC38050pKj
    public void OLrzqt(boolean z) {
        if (z) {
            pUU.EZpvd(true);
        } else {
            pUU.copydefault();
        }
    }

    @Override // o.InterfaceC38050pKj
    public void OLrzqt(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("Monitor.Dionysus", str + "--" + str2);
    }

    @Override // o.InterfaceC38050pKj
    public void KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.valueOf("Monitor.Dionysus", str + "--" + str2);
    }

    @Override // o.pIE
    public void AEQbTJ(java.lang.String str) {
        pUU.EZpvd("Monitor.Dionysus", "dmp path :" + str);
        OKBreakpad.setupNativeCrashesListener(str);
    }

    public final void EZpvd(@NotNull android.app.Activity activity, java.io.File file) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (file != null && file.exists()) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
            android.net.Uri uriForFile = FileProvider.getUriForFile(activity, OkUtils.AEQbTJ().getPackageName() + ".share.logFileProvider", file);
            Intrinsics.checkNotNullExpressionValue(uriForFile, "");
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.addFlags(1);
            intent.setType("application/x-zip-compressed");
            intent.setFlags(268435456);
            intent.addFlags(1);
            activity.startActivity(android.content.Intent.createChooser(intent, "Share File"));
            return;
        }
        EZpvd("Log file does not exist");
    }

    public static /* synthetic */ boolean showErrorIgnoreInit$default(C32573mgD c32573mgD, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        return c32573mgD.AEQbTJ(z, str);
    }

    public final boolean AEQbTJ(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C38002pIp.Companion.EZpvd(z, str);
    }

    public final void KWHzl(@NotNull java.lang.String str) throws DeviceInfoHelper.DeviceInfoException {
        Intrinsics.checkNotNullParameter(str, "");
        C38002pIp.Companion.copydefault(str);
    }

    public final void EZpvd() {
        long jIsConnected = C38002pIp.Companion.isConnected();
        if (jIsConnected <= 0) {
            return;
        }
        EventData eventData = new EventData();
        eventData.setAct(EventAction.APP_CRASH.getType());
        eventData.setAttribute(C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", "2"), C56390yDp.OLrzqt("isRunningInVirtualEnvironment", java.lang.String.valueOf(jIsConnected))));
        pUU.copydefault("CrashHandler", "reportGrafanaEvent NativeCrash eventData=>" + eventData);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }
}
