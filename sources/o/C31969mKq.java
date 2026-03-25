package o;

import com.okinc.base.thread.TPM;
import com.okinc.debugbox.MsgWsFilterManager$initEventListener$1;
import com.okinc.debugbox.MsgWsFilterManager$initEventListener$2;
import com.okinc.debugbox.bean.SenderWsMsg;
import com.okinc.debugbox.bean.WsArg;
import com.okinc.debugbox.bean.WsMsg;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mKq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31969mKq {
    public static volatile C31969mKq AEQbTJ;
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public InterfaceC58217yxC AYXKKw;
    public android.os.Handler OLrzqt;
    public InterfaceC58217yxC copydefault;
    public final java.lang.String EZpvd = java.lang.System.getProperty("line.separator");
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.mKr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C31969mKq.copydefault();
        }
    });

    /* JADX INFO: renamed from: o.mKq$TaskDescription */
    public static final class TaskDescription implements TPM.Application {
        public final java.lang.String KWHzl = "MsgFilterManager";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.base.thread.TPM.Application
        public java.lang.String EZpvd() {
            return this.KWHzl;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull android.os.Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "");
        this.OLrzqt = handler;
    }

    public C31969mKq() {
        AEQbTJ();
    }

    /* JADX INFO: renamed from: o.mKq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mKq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C31969mKq OLrzqt() {
            C31969mKq c31969mKq;
            synchronized (this) {
                if (C31969mKq.AEQbTJ == null) {
                    synchronized (C56524yIo.AEQbTJ(C31969mKq.class)) {
                        if (C31969mKq.AEQbTJ == null) {
                            Application application = C31969mKq.Companion;
                            C31969mKq.AEQbTJ = new C31969mKq();
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
                c31969mKq = C31969mKq.AEQbTJ;
                Intrinsics.copydefault(c31969mKq, "");
            }
            return c31969mKq;
        }
    }

    public final AbstractC58253yxm KWHzl() {
        return (AbstractC58253yxm) this.djBIcL.getValue();
    }

    public static final AbstractC58253yxm copydefault() {
        return TPM.ActionBar.AEQbTJ.copydefault(new TaskDescription());
    }

    public final void AEQbTJ() {
        InterfaceC58217yxC interfaceC58217yxC = this.AYXKKw;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C33146mqu.class, new java.lang.String[0]).copydefault(KWHzl()).KWHzl(KWHzl());
        final MsgWsFilterManager$initEventListener$1 msgWsFilterManager$initEventListener$1 = new MsgWsFilterManager$initEventListener$1(this);
        this.AYXKKw = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.mKt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C31969mKq.AEQbTJ(msgWsFilterManager$initEventListener$1, obj);
            }
        });
        InterfaceC58217yxC interfaceC58217yxC2 = this.copydefault;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = RxBus.KWHzl(C33149mqx.class, new java.lang.String[0]).copydefault(KWHzl()).KWHzl(KWHzl());
        final MsgWsFilterManager$initEventListener$2 msgWsFilterManager$initEventListener$2 = new MsgWsFilterManager$initEventListener$2(this);
        this.copydefault = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.mKs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C31969mKq.EZpvd(msgWsFilterManager$initEventListener$2, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void copydefault(C33146mqu c33146mqu) {
        java.lang.String str = c33146mqu.EZpvd;
        if (str != null) {
            Intrinsics.checkNotNullExpressionValue(str, "");
            if (str.length() == 0) {
                return;
            }
            java.lang.String str2 = c33146mqu.EZpvd;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            SenderWsMsg senderWsMsg = (SenderWsMsg) C33490mxT.EZpvd(str2, SenderWsMsg.class);
            WsMsg wsMsg = new WsMsg();
            wsMsg.setType("sender");
            java.lang.String str3 = c33146mqu.EZpvd;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            wsMsg.setMsgContent(AEQbTJ(str3));
            wsMsg.setMsgPath(c33146mqu.copydefault);
            WsArg arg = wsMsg.getArg();
            java.lang.String strEZpvd = EZpvd(senderWsMsg);
            if (strEZpvd.length() <= 0 || Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) "undefine")) {
                strEZpvd = null;
            }
            if (strEZpvd == null) {
                java.lang.String str4 = c33146mqu.EZpvd;
                Intrinsics.checkNotNullExpressionValue(str4, "");
                java.lang.String strSubstring = str4.substring(0, java.lang.Math.min(c33146mqu.EZpvd.length(), 500));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                strEZpvd = C59449zhJ.replace$default(C59449zhJ.replace$default(strSubstring, "\n", "", false, 4, (java.lang.Object) null), " ", "", false, 4, (java.lang.Object) null);
            }
            arg.setChannel(strEZpvd);
            copydefault(wsMsg);
        }
    }

    public final java.lang.String EZpvd(SenderWsMsg senderWsMsg) {
        if (senderWsMsg == null) {
            return "";
        }
        java.util.ArrayList<WsMsg> args = senderWsMsg.getArgs();
        java.lang.Integer numValueOf = args != null ? java.lang.Integer.valueOf(args.size()) : null;
        Intrinsics.copydefault(numValueOf);
        if (numValueOf.intValue() <= 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.ArrayList<WsMsg> args2 = senderWsMsg.getArgs();
        if (args2 != null) {
            int i = 0;
            for (java.lang.Object obj : args2) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                sb.append(((WsMsg) obj).getChannel());
                java.util.ArrayList<WsMsg> args3 = senderWsMsg.getArgs();
                Intrinsics.copydefault(args3 != null ? java.lang.Integer.valueOf(args3.size()) : null);
                if (i != r4.intValue() - 1) {
                    sb.append(",");
                }
                i++;
            }
        }
        return java.lang.String.valueOf(sb);
    }

    public final void copydefault(C33149mqx c33149mqx) {
        java.lang.String str = c33149mqx.EZpvd;
        if (str != null) {
            Intrinsics.checkNotNullExpressionValue(str, "");
            if (str.length() == 0) {
                return;
            }
            java.lang.String str2 = c33149mqx.EZpvd;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            WsMsg wsMsg = (WsMsg) C33490mxT.EZpvd(str2, WsMsg.class);
            if (wsMsg != null) {
                wsMsg.setType("receiver");
                java.lang.String str3 = c33149mqx.EZpvd;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                wsMsg.setMsgContent(AEQbTJ(str3));
                wsMsg.setMsgPath(c33149mqx.OLrzqt);
                if (wsMsg.getArg().getChannel().length() == 0 || Intrinsics.EZpvd((java.lang.Object) wsMsg.getArg().getChannel(), (java.lang.Object) "undefine")) {
                    WsArg arg = wsMsg.getArg();
                    java.lang.String str4 = c33149mqx.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(str4, "");
                    java.lang.String strSubstring = str4.substring(0, java.lang.Math.min(c33149mqx.EZpvd.length(), 500));
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    arg.setChannel(C59449zhJ.replace$default(strSubstring, "\n", "", false, 4, (java.lang.Object) null));
                }
                copydefault(wsMsg);
            }
        }
    }

    public final void copydefault(@NotNull WsMsg wsMsg) {
        Intrinsics.checkNotNullParameter(wsMsg, "");
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = 3;
        messageObtain.obj = wsMsg;
        android.os.Handler handler = this.OLrzqt;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        java.util.List listSplit$default;
        java.lang.String[] strArr = null;
        try {
            if (C59449zhJ.startsWith$default(str, "{", false, 2, null)) {
                str = new JSONObject(str).toString(4);
            } else if (C59449zhJ.startsWith$default(str, "[", false, 2, null)) {
                str = new JSONArray(str).toString(4);
            }
        } catch (JSONException unused) {
        }
        java.lang.String str2 = str;
        java.lang.String str3 = this.EZpvd;
        if (str3 != null && str2 != null && (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{str3}, false, 0, 6, (java.lang.Object) null)) != null) {
            strArr = (java.lang.String[]) listSplit$default.toArray(new java.lang.String[0]);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("  ");
        sb.append('\n');
        if (strArr != null) {
            java.util.Iterator itEZpvd = yHX.EZpvd(strArr);
            while (itEZpvd.hasNext()) {
                sb.append((java.lang.String) itEZpvd.next());
                sb.append('\n');
            }
        }
        return java.lang.String.valueOf(sb);
    }

    public final void valueOf() {
        InterfaceC58217yxC interfaceC58217yxC = this.AYXKKw;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.copydefault;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        AEQbTJ = null;
    }
}
