package o;

import androidx.fragment.app.FragmentActivity;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.FileList;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.BotWebHook;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cTg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11573cTg {
    public static final int AEQbTJ;
    public static final java.lang.String AYXKKw;
    public static java.lang.String EZpvd;
    public static final C11573cTg KWHzl;
    public static final C11582cTp OLrzqt;
    public static final java.lang.String copydefault;
    public static final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11582cTp copydefault() {
        return OLrzqt;
    }

    private C11573cTg() {
    }

    static {
        C11573cTg c11573cTg = new C11573cTg();
        KWHzl = c11573cTg;
        AYXKKw = c11573cTg.getClass().getSimpleName();
        EZpvd = "application/vnd.google-apps.folder";
        gEmmrt = "mimeType='application/vnd.google-apps.folder'";
        copydefault = "mimeType='" + EZpvd + "' and name=";
        OLrzqt = new C11582cTp();
        AEQbTJ = 8;
    }

    public final java.lang.String KWHzl() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSelectedNavigationIndex);
    }

    public static /* synthetic */ com.google.api.services.drive.model.File saveNewFile$default(C11573cTg c11573cTg, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return c11573cTg.EZpvd(str, str2, str3, z);
    }

    public final com.google.api.services.drive.model.File EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) throws java.io.IOException {
        java.lang.String id = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Drive driveOLrzqt = OLrzqt.OLrzqt();
        if (driveOLrzqt == null) {
            pUU.copydefault(AYXKKw, "please sing in first");
            return null;
        }
        if (str2.length() > 0) {
            java.util.List<java.lang.String> listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null);
            java.lang.String str4 = gEmmrt;
            for (java.lang.String str5 : listSplit$default) {
                C11573cTg c11573cTg = KWHzl;
                java.lang.String strEZpvd = c11573cTg.EZpvd(driveOLrzqt, str4, str5);
                if (strEZpvd.length() == 0) {
                    id = c11573cTg.AEQbTJ(driveOLrzqt, str5, id).getId();
                    Intrinsics.copydefault((java.lang.Object) id);
                } else {
                    id = strEZpvd;
                }
                str4 = copydefault + "'" + str5 + "'";
            }
        }
        com.google.api.services.drive.model.File fileKWHzl = KWHzl(driveOLrzqt, str);
        if (z) {
            str3 = EZpvd(str3);
        }
        if (fileKWHzl != null) {
            KWHzl(driveOLrzqt, fileKWHzl);
            return OLrzqt(driveOLrzqt, str, str3, id);
        }
        return OLrzqt(driveOLrzqt, str, str3, id);
    }

    public static /* synthetic */ java.lang.String getFileContentByFileName$default(C11573cTg c11573cTg, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c11573cTg.OLrzqt(str, z);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(str, "");
        Drive driveOLrzqt = OLrzqt.OLrzqt();
        if (driveOLrzqt == null) {
            pUU.copydefault(AYXKKw, "please sing in first");
            return "";
        }
        com.google.api.services.drive.model.File fileKWHzl = KWHzl(driveOLrzqt, str);
        if (fileKWHzl == null) {
            return "";
        }
        java.lang.String strEZpvd = EZpvd(driveOLrzqt, fileKWHzl);
        return z ? copydefault(strEZpvd) : strEZpvd;
    }

    public final void KWHzl(@NotNull java.lang.String str) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(str, "");
        Drive driveOLrzqt = OLrzqt.OLrzqt();
        if (driveOLrzqt == null) {
            pUU.copydefault(AYXKKw, "please sing in first");
            return;
        }
        com.google.api.services.drive.model.File fileKWHzl = KWHzl(driveOLrzqt, str);
        if (fileKWHzl != null) {
            KWHzl(driveOLrzqt, fileKWHzl);
        }
    }

    public final void AEQbTJ(@NotNull final FragmentActivity fragmentActivity, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C11582cTp c11582cTp = OLrzqt;
        if (c11582cTp.OLrzqt() == null) {
            c11582cTp.EZpvd(fragmentActivity, new Function1() { // from class: o.cTi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11573cTg.EZpvd(function1, fragmentActivity, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else {
            function1.invoke(java.lang.Boolean.TRUE);
        }
    }

    public static final Unit EZpvd(final Function1 function1, final FragmentActivity fragmentActivity, boolean z) {
        if (z) {
            function1.invoke(java.lang.Boolean.TRUE);
        } else {
            C9694baS.Companion.EZpvd(fragmentActivity, OLrzqt.OLrzqt(fragmentActivity), new Function2() { // from class: o.cTq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C11573cTg.OLrzqt(fragmentActivity, function1, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(FragmentActivity fragmentActivity, final Function1 function1, int i, android.content.Intent intent) {
        if (i == -1 && intent != null) {
            OLrzqt.KWHzl(fragmentActivity, intent, new Function1() { // from class: o.cTj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11573cTg.KWHzl(function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public final java.util.List<java.lang.String> EZpvd() throws java.io.IOException {
        Drive driveOLrzqt = OLrzqt.OLrzqt();
        if (driveOLrzqt == null) {
            pUU.copydefault(AYXKKw, "please sing in first");
            return new java.util.ArrayList(0);
        }
        FileList fileListExecute = driveOLrzqt.files().list().setQ("mimeType='text/plain'").setSpaces("appDataFolder").execute();
        C32866mlf.onEvent$default("google_drive_api_call", (TrackChannel[]) null, new Function1() { // from class: o.cTo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11573cTg.valueOf((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (fileListExecute.getFiles().isEmpty()) {
            return new java.util.ArrayList(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(fileListExecute.getFiles().size());
        java.util.List<com.google.api.services.drive.model.File> files = fileListExecute.getFiles();
        Intrinsics.checkNotNullExpressionValue(files, "");
        for (com.google.api.services.drive.model.File file : files) {
            pUU.copydefault(AYXKKw, "queryFile fileId = " + file.getId() + " parent = " + file.getParents());
            arrayList.add(file.getName());
        }
        return arrayList;
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(BotWebHook.KEY_ACTION, "getAllFileNameList", false));
        eventParamsList.add(new EventParam("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false));
        return Unit.INSTANCE;
    }

    public final com.google.api.services.drive.model.File AEQbTJ(Drive drive, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        com.google.api.services.drive.model.File name = new com.google.api.services.drive.model.File().setMimeType(EZpvd).setName(str);
        if (str2.length() > 0) {
            name.setParents(Collections.singletonList(str2));
        } else {
            name.setParents(C56402yEa.EZpvd("appDataFolder"));
        }
        C32866mlf.onEvent$default("google_drive_api_call", (TrackChannel[]) null, new Function1() { // from class: o.cTl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11573cTg.AhwBna((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        com.google.api.services.drive.model.File fileExecute = drive.files().create(name).execute();
        Intrinsics.checkNotNullExpressionValue(fileExecute, "");
        return fileExecute;
    }

    public static final Unit AhwBna(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(BotWebHook.KEY_ACTION, "createNewFileFolder", false));
        eventParamsList.add(new EventParam("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false));
        return Unit.INSTANCE;
    }

    public final com.google.api.services.drive.model.File OLrzqt(Drive drive, java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.io.IOException {
        com.google.api.services.drive.model.File name = new com.google.api.services.drive.model.File().setMimeType("text/plain").setName(str);
        if (str3.length() > 0) {
            name.setParents(Collections.singletonList(str3));
        } else {
            name.setParents(C56402yEa.EZpvd("appDataFolder"));
        }
        ByteArrayContent byteArrayContentFromString = ByteArrayContent.fromString("text/plain", str2);
        C32866mlf.onEvent$default("google_drive_api_call", (TrackChannel[]) null, new Function1() { // from class: o.cTm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11573cTg.gEmmrt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        com.google.api.services.drive.model.File fileExecute = drive.files().create(name, byteArrayContentFromString).execute();
        Intrinsics.checkNotNullExpressionValue(fileExecute, "");
        return fileExecute;
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(BotWebHook.KEY_ACTION, "createNewFile", false));
        eventParamsList.add(new EventParam("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false));
        return Unit.INSTANCE;
    }

    public final com.google.api.services.drive.model.File KWHzl(Drive drive, java.lang.String str) throws java.io.IOException {
        FileList fileListExecute = drive.files().list().setQ("mimeType='text/plain' and name='" + str + "'").setSpaces("appDataFolder").execute();
        C32866mlf.onEvent$default("google_drive_api_call", (TrackChannel[]) null, new Function1() { // from class: o.cTk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11573cTg.DbNXlk((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (!fileListExecute.getFiles().isEmpty()) {
            java.util.List<com.google.api.services.drive.model.File> files = fileListExecute.getFiles();
            Intrinsics.checkNotNullExpressionValue(files, "");
            for (com.google.api.services.drive.model.File file : files) {
                pUU.copydefault(AYXKKw, "queryFile fileId = " + file.getId() + " parent = " + file.getParents());
                if (Intrinsics.EZpvd((java.lang.Object) file.getName(), (java.lang.Object) str)) {
                    return file;
                }
            }
        }
        return null;
    }

    public static final Unit DbNXlk(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(BotWebHook.KEY_ACTION, "queryFile", false));
        eventParamsList.add(new EventParam("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false));
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd(Drive drive, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        FileList fileListExecute = drive.files().list().setQ(str).setSpaces("appDataFolder").execute();
        C32866mlf.onEvent$default("google_drive_api_call", (TrackChannel[]) null, new Function1() { // from class: o.cTh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11573cTg.fetchVPNInfo((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (!fileListExecute.getFiles().isEmpty()) {
            java.util.List<com.google.api.services.drive.model.File> files = fileListExecute.getFiles();
            Intrinsics.checkNotNullExpressionValue(files, "");
            for (com.google.api.services.drive.model.File file : files) {
                if (Intrinsics.EZpvd((java.lang.Object) file.getName(), (java.lang.Object) str2)) {
                    java.lang.String id = file.getId();
                    Intrinsics.checkNotNullExpressionValue(id, "");
                    return id;
                }
            }
        }
        return "";
    }

    public static final Unit fetchVPNInfo(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(BotWebHook.KEY_ACTION, "queryFileFolder", false));
        eventParamsList.add(new EventParam("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.lang.String EZpvd(Drive drive, com.google.api.services.drive.model.File file) throws java.io.IOException {
        java.io.BufferedReader bufferedReader;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.io.InputStream inputStreamExecuteMediaAsInputStream = drive.files().get(file.getId()).executeMediaAsInputStream();
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStreamExecuteMediaAsInputStream));
        } finally {
        }
        while (true) {
            try {
                java.lang.String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                } else {
                    Unit unit = Unit.INSTANCE;
                    yFA.copydefault(bufferedReader, null);
                    yFA.copydefault(inputStreamExecuteMediaAsInputStream, null);
                    java.lang.String string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    return string;
                }
            } finally {
            }
        }
    }

    public final void KWHzl(Drive drive, com.google.api.services.drive.model.File file) throws java.io.IOException {
        C32866mlf.onEvent$default("google_drive_api_call", (TrackChannel[]) null, new Function1() { // from class: o.cTc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11573cTg.djBIcL((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        drive.files().delete(file.getId()).execute();
    }

    public static final Unit djBIcL(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(BotWebHook.KEY_ACTION, "deleteFile", false));
        eventParamsList.add(new EventParam("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false));
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return xZW.EZpvd.EZpvd(str);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return xZW.EZpvd.copydefault(str);
    }
}
