package o;

import com.okinc.base.anr.IdleHandlerMatrixException;
import com.okinc.base.anr.LooperAnrMatrixException;
import com.okinc.base.anr.LooperLagMatrixException;
import com.okinc.base.anr.NormalMatrixException;
import com.okinc.base.anr.SignalAnrMatrixException;
import com.okinc.base.anr.SignalAnrNativeBacktraceMatrixException;
import com.okinc.base.anr.StartUpMatrixException;
import com.okinc.base.anr.ThreadPriorityModifiedMatrixException;
import com.okinc.base.anr.ThreadTimerSlackModifiedMatrixException;
import com.okinc.base.anr.TouchEventMatrixException;
import com.okinc.base.utils.OkUtils;
import com.okinc.components.report.EventAction;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.core.util.SPUtils;
import com.okinc.lib.dionysus.crash.bean.ErrorAttachmentLog;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.C6703aUO;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.aUO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6703aUO {
    public static final ActionBar Companion = new ActionBar(null);
    public static final CopyOnWriteArrayList<StateListAnimator> copydefault = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: o.aUO$StateListAnimator */
    public interface StateListAnimator {
        void OLrzqt();
    }

    /* JADX INFO: renamed from: o.aUO$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aUO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ(@NotNull StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            C6703aUO.copydefault.add(stateListAnimator);
        }

        public static final boolean KWHzl(StateListAnimator stateListAnimator, StateListAnimator stateListAnimator2) {
            return Intrinsics.EZpvd(stateListAnimator2, stateListAnimator);
        }

        public final void OLrzqt(@NotNull final StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            C56406yEe.AEQbTJ(C6703aUO.copydefault, new Function1() { // from class: o.aUT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C6703aUO.ActionBar.KWHzl(stateListAnimator, (C6703aUO.StateListAnimator) obj));
                }
            });
        }

        public static /* synthetic */ void postAnrEvent$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = "";
            }
            actionBar.EZpvd(str, str2);
        }

        public final void EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            EventData eventData = new EventData();
            eventData.setAct(EventAction.APP_HANG.getType());
            if (str2 == null) {
                str2 = "";
            }
            eventData.setPath(str2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", str);
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SIGNAL_ANR") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SIGNAL_ANR_NATIVE_BACKTRACE")) {
                C6700aUL c6700aUL = C6700aUL.EZpvd;
                android.app.Application applicationAEQbTJ = OkUtils.AEQbTJ();
                Intrinsics.checkNotNullExpressionValue(applicationAEQbTJ, "");
                java.io.File fileOLrzqt = c6700aUL.OLrzqt(applicationAEQbTJ);
                boolean z = java.lang.System.currentTimeMillis() - fileOLrzqt.lastModified() < 180000;
                if (fileOLrzqt.exists() && z) {
                    linkedHashMap.put("isDeviceRooted", "1");
                } else {
                    linkedHashMap.put("isDeviceRooted", "0");
                }
            }
            eventData.setAttrs(linkedHashMap);
            ReportManager.AEQbTJ.EZpvd(eventData);
        }

        public final void EZpvd() {
            java.util.Iterator it = C6703aUO.copydefault.iterator();
            while (it.hasNext()) {
                try {
                    ((StateListAnimator) it.next()).OLrzqt();
                } catch (java.lang.Exception e) {
                    pUU.copydefault("Matrix.Listener", "Error notifying ANR event listener: " + e.getMessage());
                }
            }
        }

        public final void OLrzqt(JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws JSONException {
            java.lang.String strOptString = jSONObject.optString("scene");
            if (strOptString == null) {
                strOptString = "LooperAnrMatrixException";
            }
            java.lang.String strAEQbTJ = AEQbTJ(str2, strOptString);
            jSONObject.putOpt("scene", strAEQbTJ);
            java.lang.String strOptString2 = jSONObject.optString("threadStack");
            Intrinsics.copydefault((java.lang.Object) strOptString2);
            LooperAnrMatrixException looperAnrMatrixException = (LooperAnrMatrixException) copydefault(strOptString2, strAEQbTJ, new Function1() { // from class: o.aUQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6703aUO.ActionBar.AkhnZx((java.lang.String) obj);
                }
            });
            OLrzqt();
            EZpvd(str, strAEQbTJ);
            KWHzl(jSONObject, looperAnrMatrixException);
        }

        public static final LooperAnrMatrixException AkhnZx(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new LooperAnrMatrixException(str);
        }

        public final void valueOf(JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws JSONException {
            java.lang.String strOptString = jSONObject.optString("scene");
            if (strOptString == null) {
                strOptString = "LooperLagMatrixException";
            }
            java.lang.String strAEQbTJ = AEQbTJ(str2, strOptString);
            jSONObject.putOpt("scene", strAEQbTJ);
            java.lang.String strOptString2 = jSONObject.optString("threadStack");
            Intrinsics.copydefault((java.lang.Object) strOptString2);
            LooperLagMatrixException looperLagMatrixException = (LooperLagMatrixException) copydefault(strOptString2, strAEQbTJ, new Function1() { // from class: o.aUR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6703aUO.ActionBar.DbNXlk((java.lang.String) obj);
                }
            });
            EZpvd(str, strAEQbTJ);
            KWHzl(jSONObject, looperLagMatrixException);
        }

        public static final LooperLagMatrixException DbNXlk(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new LooperLagMatrixException(str);
        }

        public final void AEQbTJ(JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws JSONException {
            java.lang.String strOptString = jSONObject.optString("scene");
            if (strOptString == null) {
                strOptString = "SignalAnrTracer";
            }
            java.lang.String strAEQbTJ = AEQbTJ(str2, strOptString);
            jSONObject.putOpt("scene", strAEQbTJ);
            java.lang.String strOptString2 = jSONObject.optString("threadStack");
            Intrinsics.copydefault((java.lang.Object) strOptString2);
            SignalAnrMatrixException signalAnrMatrixException = (SignalAnrMatrixException) copydefault(strOptString2, strAEQbTJ, new Function1() { // from class: o.aUM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6703aUO.ActionBar.values((java.lang.String) obj);
                }
            });
            OLrzqt();
            EZpvd(str, strAEQbTJ);
            KWHzl(jSONObject, signalAnrMatrixException);
            EZpvd();
        }

        public static final SignalAnrMatrixException values(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SignalAnrMatrixException(str);
        }

        public final void copydefault(JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws JSONException {
            java.lang.String strOptString = jSONObject.optString("scene");
            if (strOptString == null) {
                strOptString = "SignalAnrNativeBacktraceMatrixException";
            }
            java.lang.String strAEQbTJ = AEQbTJ(str2, strOptString);
            jSONObject.putOpt("scene", strAEQbTJ);
            java.lang.String strOptString2 = jSONObject.optString("threadStack");
            Intrinsics.copydefault((java.lang.Object) strOptString2);
            SignalAnrNativeBacktraceMatrixException signalAnrNativeBacktraceMatrixException = (SignalAnrNativeBacktraceMatrixException) copydefault(strOptString2, strAEQbTJ, new Function1() { // from class: o.aUU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6703aUO.ActionBar.valueOf((java.lang.String) obj);
                }
            });
            OLrzqt();
            EZpvd(str, strAEQbTJ);
            KWHzl(jSONObject, signalAnrNativeBacktraceMatrixException);
        }

        public static final SignalAnrNativeBacktraceMatrixException valueOf(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SignalAnrNativeBacktraceMatrixException(str);
        }

        public final void KWHzl(JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
            java.lang.String strOptString = jSONObject.optString("scene");
            if (strOptString == null) {
                strOptString = "IdleHandlerLagTracer";
            }
            java.lang.String strAEQbTJ = AEQbTJ(str2, strOptString);
            EZpvd(str, strAEQbTJ);
            KWHzl(jSONObject, new IdleHandlerMatrixException(strAEQbTJ));
        }

        public final void EZpvd(JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws JSONException {
            java.lang.String strOptString = jSONObject.optString("scene");
            if (strOptString == null) {
                strOptString = "TouchEventLagTracer";
            }
            java.lang.String strAEQbTJ = AEQbTJ(str2, strOptString);
            jSONObject.putOpt("scene", strAEQbTJ);
            java.lang.String strOptString2 = jSONObject.optString("threadStack");
            Intrinsics.copydefault((java.lang.Object) strOptString2);
            TouchEventMatrixException touchEventMatrixException = (TouchEventMatrixException) copydefault(strOptString2, strAEQbTJ, new Function1() { // from class: o.aUS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6703aUO.ActionBar.AhwBna((java.lang.String) obj);
                }
            });
            EZpvd(str, strAEQbTJ);
            KWHzl(jSONObject, touchEventMatrixException);
        }

        public static final TouchEventMatrixException AhwBna(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TouchEventMatrixException(str);
        }

        public final void AEQbTJ(JSONObject jSONObject, java.lang.String str) throws JSONException {
            java.lang.String strOptString = jSONObject.optString("scene");
            if (strOptString == null) {
                strOptString = "ThreadPriorityModifiedMatrixException";
            }
            java.lang.String strAEQbTJ = AEQbTJ(str, strOptString);
            jSONObject.putOpt("scene", strAEQbTJ);
            java.lang.String strOptString2 = jSONObject.optString("threadStack");
            Intrinsics.copydefault((java.lang.Object) strOptString2);
            KWHzl(jSONObject, (ThreadPriorityModifiedMatrixException) copydefault(strOptString2, strAEQbTJ, new Function1() { // from class: o.aUV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6703aUO.ActionBar.AYXKKw((java.lang.String) obj);
                }
            }));
        }

        public static final ThreadPriorityModifiedMatrixException AYXKKw(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ThreadPriorityModifiedMatrixException(str);
        }

        public final void copydefault(JSONObject jSONObject, java.lang.String str) throws JSONException {
            java.lang.String strOptString = jSONObject.optString("scene");
            if (strOptString == null) {
                strOptString = "ThreadTimerSlackModifiedMatrixException";
            }
            java.lang.String strAEQbTJ = AEQbTJ(str, strOptString);
            jSONObject.putOpt("scene", strAEQbTJ);
            java.lang.String strOptString2 = jSONObject.optString("threadStack");
            Intrinsics.copydefault((java.lang.Object) strOptString2);
            KWHzl(jSONObject, (ThreadTimerSlackModifiedMatrixException) copydefault(strOptString2, strAEQbTJ, new Function1() { // from class: o.aUP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6703aUO.ActionBar.fetchVPNInfo((java.lang.String) obj);
                }
            }));
        }

        public static final ThreadTimerSlackModifiedMatrixException fetchVPNInfo(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ThreadTimerSlackModifiedMatrixException(str);
        }

        public final void EZpvd(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            try {
                if (jSONObject.has("detail")) {
                    java.lang.String strEZpvd = C6767aVb.Companion.OLrzqt().EZpvd();
                    java.lang.String strOptString = jSONObject.optString("detail");
                    pUU.EZpvd("Matrix.Listener", "page:" + strEZpvd + " contentDetail: " + strOptString);
                    if (C59449zhJ.gEmmrt(strOptString, "ANR", true)) {
                        Intrinsics.copydefault((java.lang.Object) strOptString);
                        OLrzqt(jSONObject, strOptString, strEZpvd);
                    } else if (C59449zhJ.gEmmrt(strOptString, "LAG", true)) {
                        Intrinsics.copydefault((java.lang.Object) strOptString);
                        valueOf(jSONObject, strOptString, strEZpvd);
                    } else if (C59449zhJ.gEmmrt(strOptString, "SIGNAL_ANR", true)) {
                        Intrinsics.copydefault((java.lang.Object) strOptString);
                        AEQbTJ(jSONObject, strOptString, strEZpvd);
                    } else if (C59449zhJ.gEmmrt(strOptString, "SIGNAL_ANR_NATIVE_BACKTRACE", true)) {
                        Intrinsics.copydefault((java.lang.Object) strOptString);
                        copydefault(jSONObject, strOptString, strEZpvd);
                    } else if (C59449zhJ.gEmmrt(strOptString, "LAG_IDLE_HANDLER", true)) {
                        Intrinsics.copydefault((java.lang.Object) strOptString);
                        KWHzl(jSONObject, strOptString, strEZpvd);
                    } else if (C59449zhJ.gEmmrt(strOptString, "LAG_TOUCH", true)) {
                        Intrinsics.copydefault((java.lang.Object) strOptString);
                        EZpvd(jSONObject, strOptString, strEZpvd);
                    } else if (C59449zhJ.gEmmrt(strOptString, "PRIORITY_MODIFIED", true)) {
                        AEQbTJ(jSONObject, strEZpvd);
                    } else if (C59449zhJ.gEmmrt(strOptString, "TIMERSLACK_MODIFIED", true)) {
                        copydefault(jSONObject, strEZpvd);
                    } else if (C59449zhJ.gEmmrt(strOptString, "NORMAL", true)) {
                        java.lang.String strOptString2 = jSONObject.optString("scene");
                        if (strOptString2 == null) {
                            strOptString2 = "Normal slow function scenario";
                        }
                        KWHzl(jSONObject, new NormalMatrixException(strOptString2));
                    } else if (C59449zhJ.gEmmrt(strOptString, "STARTUP", true)) {
                        java.lang.String strOptString3 = jSONObject.optString("scene");
                        if (strOptString3 == null) {
                            strOptString3 = "Startup time-consuming scenario";
                        }
                        KWHzl(jSONObject, new StartUpMatrixException(strOptString3));
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("Matrix.Listener", "reportTrace error: " + e.getMessage());
            }
        }

        public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
            return (str == null || str.length() == 0) ? str2 == null ? "" : str2 : str;
        }

        public final <T extends java.lang.Exception> void KWHzl(JSONObject jSONObject, T t) {
            android.app.Application applicationAEQbTJ;
            try {
                java.util.HashMap map = new java.util.HashMap();
                java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "");
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    java.lang.String strOptString = jSONObject.optString(next);
                    Intrinsics.checkNotNullExpressionValue(strOptString, "");
                    if (!Intrinsics.EZpvd((java.lang.Object) next, (java.lang.Object) "threadStack")) {
                        map.put(next, strOptString);
                    }
                }
                java.lang.String strOptString2 = jSONObject.optString("detail");
                java.lang.String strOptString3 = jSONObject.optString("threadStack");
                pUU.KWHzl("Matrix.Listener", "postExceptionWithAttach:type:" + strOptString2 + "  \nstackMap:" + map + " \nmessage:" + t.getMessage());
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("postExceptionWithAttach:threadStack:");
                sb.append(strOptString3);
                pUU.KWHzl("Matrix.Listener", sb.toString());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (((t instanceof SignalAnrMatrixException) || (t instanceof SignalAnrNativeBacktraceMatrixException)) && (applicationAEQbTJ = OkUtils.AEQbTJ()) != null) {
                    ActionBar actionBar = C6703aUO.Companion;
                    C6700aUL c6700aUL = C6700aUL.EZpvd;
                    ErrorAttachmentLog errorAttachmentLogOLrzqt = actionBar.OLrzqt(c6700aUL.OLrzqt(applicationAEQbTJ));
                    if (errorAttachmentLogOLrzqt != null) {
                        arrayList.add(errorAttachmentLogOLrzqt);
                    }
                    ErrorAttachmentLog errorAttachmentLogOLrzqt2 = actionBar.OLrzqt(c6700aUL.KWHzl(applicationAEQbTJ));
                    if (errorAttachmentLogOLrzqt2 != null) {
                        arrayList.add(errorAttachmentLogOLrzqt2);
                    }
                }
                java.lang.String strOptString4 = jSONObject.optString("threadStack");
                Intrinsics.checkNotNullExpressionValue(strOptString4, "");
                arrayList.add(ErrorAttachmentLog.attachmentWithText(strOptString4, "threadStack.txt"));
                C6777aVl.Companion.copydefault(t, map, arrayList);
            } catch (java.lang.Exception e) {
                pUU.EZpvd("Matrix.Listener", "postExceptionWithAttach Exception: " + e.getMessage());
            }
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public final ErrorAttachmentLog OLrzqt(java.io.File file) {
            java.io.File file2 = file.exists() ? file : null;
            if (file2 == null) {
                return null;
            }
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file2);
            try {
                ErrorAttachmentLog errorAttachmentLogAttachmentWithBinary = ErrorAttachmentLog.attachmentWithBinary(C33486mxP.OLrzqt(fileInputStream), file.getName(), "trace");
                yFA.copydefault(fileInputStream, null);
                return errorAttachmentLogAttachmentWithBinary;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    yFA.copydefault(fileInputStream, th);
                    throw th2;
                }
            }
        }

        public final void OLrzqt(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            pUU.EZpvd("Matrix.Listener", "reportFPS: " + jSONObject);
        }

        public final void KWHzl(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            pUU.EZpvd("Matrix.Listener", "reportStartUp: " + jSONObject);
        }

        public static /* synthetic */ java.lang.Exception generateException$OKBugReport_bugreport$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = "";
            }
            return actionBar.copydefault(str, str2, function1);
        }

        public final <T extends java.lang.Exception> T copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function1<? super java.lang.String, ? extends T> function1) {
            java.lang.StackTraceElement[] stackTraceElementArrIsConnected;
            java.lang.String str3 = "";
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            try {
                stackTraceElementArrIsConnected = isConnected(str);
                try {
                    str3 = AEQbTJ(stackTraceElementArrIsConnected) + "-(page:" + str2 + ")";
                } catch (java.lang.Exception e) {
                    e = e;
                    pUU.copydefault("Matrix.Listener", "generateException: " + e.getMessage());
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                stackTraceElementArrIsConnected = null;
            }
            T tInvoke = function1.invoke(str3);
            if (stackTraceElementArrIsConnected != null) {
                tInvoke.setStackTrace(stackTraceElementArrIsConnected);
            }
            return tInvoke;
        }

        public final java.lang.StackTraceElement[] isConnected(@NotNull java.lang.String str) {
            int iAhwBna;
            Intrinsics.checkNotNullParameter(str, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str2 : (java.lang.String[]) new Regex("\n").split(str, 0).toArray(new java.lang.String[0])) {
                int length = str2.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.copydefault((int) str2.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                java.lang.String string = str2.subSequence(i, length + 1).toString();
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) string, '(', 0, false, 6, (java.lang.Object) null);
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) string, ')', 0, false, 6, (java.lang.Object) null);
                if (iIndexOf$default != -1 && iIndexOf$default2 != -1) {
                    java.lang.String strSubstring = string.substring(0, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    java.lang.String[] strArr = (java.lang.String[]) new Regex("\\.").split(strSubstring, 0).toArray(new java.lang.String[0]);
                    java.lang.String str3 = strArr.length > 1 ? strArr[strArr.length - 1] : "";
                    C56529yIt c56529yIt = C56529yIt.KWHzl;
                    java.lang.String str4 = java.lang.String.format(".%s", java.util.Arrays.copyOf(new java.lang.Object[]{str3}, 1));
                    Intrinsics.checkNotNullExpressionValue(str4, "");
                    java.lang.String strEZpvd = StringsKt__StringsKt.EZpvd(strSubstring, (java.lang.CharSequence) str4);
                    java.lang.String strSubstring2 = string.substring(iIndexOf$default + 1, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    if (strSubstring2.equals("Native Method")) {
                        iAhwBna = -2;
                        strSubstring2 = "Native Method";
                    } else {
                        if (strSubstring2.equals("Unknown Source")) {
                            strSubstring2 = "Unknown Source";
                        } else {
                            java.lang.String[] strArr2 = (java.lang.String[]) new Regex("\\:").split(strSubstring2, 0).toArray(new java.lang.String[0]);
                            if (strArr2.length == 2) {
                                strSubstring2 = strArr2[0];
                                iAhwBna = C33129mqd.AhwBna(strArr2[1]);
                            } else if (strArr2.length != 1 && strArr2.length > 2) {
                                iAhwBna = C33129mqd.AhwBna(strArr2[strArr2.length - 1]);
                                java.lang.String str5 = java.lang.String.format(":%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iAhwBna)}, 1));
                                Intrinsics.checkNotNullExpressionValue(str5, "");
                                StringsKt__StringsKt.EZpvd("", (java.lang.CharSequence) str5);
                                strSubstring2 = "";
                            }
                        }
                        iAhwBna = 0;
                    }
                    arrayList.add(new java.lang.StackTraceElement(strEZpvd, str3, strSubstring2, iAhwBna));
                }
            }
            return (java.lang.StackTraceElement[]) arrayList.toArray(new java.lang.StackTraceElement[0]);
        }

        public final java.lang.String AEQbTJ(@NotNull java.lang.StackTraceElement[] stackTraceElementArr) {
            Intrinsics.checkNotNullParameter(stackTraceElementArr, "");
            if (stackTraceElementArr.length == 0) {
                return "Stack is null";
            }
            for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
                java.lang.String className = stackTraceElement.getClassName();
                Intrinsics.copydefault((java.lang.Object) className);
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) className, (java.lang.CharSequence) "okinc", false, 2, (java.lang.Object) null)) {
                    return stackTraceElement.toString();
                }
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) className, (java.lang.CharSequence) "androidx", false, 2, (java.lang.Object) null)) {
                    return stackTraceElement.toString();
                }
            }
            return stackTraceElementArr[0].toString();
        }

        public final void OLrzqt() {
            pUU.KWHzl("Matrix.Listener", "markAnrHappened, " + pJI.Companion.EZpvd());
            SPUtils.put("ANR_HAPPENED", java.lang.Boolean.TRUE);
        }

        public final boolean KWHzl() {
            pUU.KWHzl("Matrix.Listener", "checkAndClearLastAnr");
            boolean z = SPUtils.getBoolean("ANR_HAPPENED", false);
            SPUtils.put("ANR_HAPPENED", java.lang.Boolean.FALSE);
            return z;
        }
    }
}
