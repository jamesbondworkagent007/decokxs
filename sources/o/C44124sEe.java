package o;

import com.google.api.client.googleapis.notifications.ResourceStates;
import com.reown.android.pulse.model.EventType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sEe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44124sEe {
    public static final void copydefault(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (th == null) {
            pUU.KWHzl("OKIMCORE" + str, str2);
            return;
        }
        pUU.AEQbTJ("OKIMCORE_" + str, str2, th);
    }

    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return str;
        }
        return str + "_" + str2;
    }

    public static /* synthetic */ void imLogSync$default(java.lang.String str, java.lang.Throwable th, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        AEQbTJ(str, th, str2);
    }

    public static final void AEQbTJ(@NotNull java.lang.String str, java.lang.Throwable th, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(EZpvd(ResourceStates.SYNC, str2), "<" + java.lang.Thread.currentThread().getName() + ">" + str, th);
    }

    public static /* synthetic */ void imLogCore$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        OLrzqt(str, th);
    }

    public static final void OLrzqt(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("CORE", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogSendMessage$default(java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        KWHzl(str, str2, th);
    }

    public static final void KWHzl(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        copydefault(EZpvd("SEND_MESSAGE", str), "<" + java.lang.Thread.currentThread().getName() + ">" + str2, th);
    }

    public static /* synthetic */ void imLogGetMessage$default(java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        OLrzqt(str, str2, th);
    }

    public static final void OLrzqt(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        copydefault(EZpvd("GET_MESSAGE", str), "<" + java.lang.Thread.currentThread().getName() + ">" + str2, th);
    }

    public static /* synthetic */ void imLogRecallReceipt$default(java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        AEQbTJ(str, str2, th);
    }

    public static final void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        copydefault(EZpvd("RECALL_RECEIPT", str), "<" + java.lang.Thread.currentThread().getName() + ">" + str2, th);
    }

    public static /* synthetic */ void imLogLogin$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        values(str, th);
    }

    public static final void values(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("LOGIN", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogInit$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        isConnected(str, th);
    }

    public static final void isConnected(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(EventType.INIT, "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogTokenOperation$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        fJNWhG(str, th);
    }

    public static final void fJNWhG(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("TOKEN_OPERATION", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogNonLogin$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        AkhnZx(str, th);
    }

    public static final void AkhnZx(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("NON_LOGIN", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogConnectionStatus$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        AEQbTJ(str, th);
    }

    public static final void AEQbTJ(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("CONNECTION_STATUS", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogMessageDisplayModel$default(java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        EZpvd(str, str2, th);
    }

    public static final void EZpvd(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        copydefault(EZpvd("MESSAGE_DISPLAY_MODEL", str), "<" + java.lang.Thread.currentThread().getName() + ">" + str2, th);
    }

    public static /* synthetic */ void imLogViewHolder$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        AuCTel(str, th);
    }

    public static final void AuCTel(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("VIEW_HOLDER", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogCurrentUser$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        EZpvd(str, th);
    }

    public static final void EZpvd(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("CURRENT_USER", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogUserData$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        fARcdN(str, th);
    }

    public static final void fARcdN(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("USER_DATA", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogNotification$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        fetchVPNInfo(str, th);
    }

    public static final void fetchVPNInfo(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("NOTIFICATION", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogGetAllUnreadCountFlow$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        valueOf(str, th);
    }

    public static final void valueOf(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("GET_ALL_UNREAD_COUNT_FLOW", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogConversation$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        KWHzl(str, th);
    }

    public static final void KWHzl(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("CONVERSATION", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogDb$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        djBIcL(str, th);
    }

    public static final void djBIcL(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("DATABASE", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogImConnectivity$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        gEmmrt(str, th);
    }

    public static final void gEmmrt(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("IM_CONNECTIVITY", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogGroup$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        AYXKKw(str, th);
    }

    public static final void AYXKKw(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("IM_GROUP", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogVoiceCall$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        fIwbmz(str, th);
    }

    public static final void fIwbmz(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("IM_VOICE_CALL", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void logSyncAnalysis$default(java.lang.String str, java.lang.Throwable th, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        KWHzl(str, th, str2);
    }

    public static final void KWHzl(@NotNull java.lang.String str, java.lang.Throwable th, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C43296rmc.EZpvd(EZpvd(ResourceStates.SYNC, str2), "<" + java.lang.Thread.currentThread().getName() + ">" + str, th);
    }

    public static /* synthetic */ void imLogContact$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        copydefault(str, th);
    }

    public static final void copydefault(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("CONTACT", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogViewProvider$default(java.lang.String str, java.lang.Throwable th, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        copydefault(str, th, str2);
    }

    public static final void copydefault(@NotNull java.lang.String str, java.lang.Throwable th, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C43296rmc.EZpvd(EZpvd("ViewProvider", str2), "<" + java.lang.Thread.currentThread().getName() + ">" + str, th);
    }

    public static /* synthetic */ void imLogOKIMService$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        DbNXlk(str, th);
    }

    public static final void DbNXlk(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("OKIMSERVICE", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogTrackEvent$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        ejfBZ(str, th);
    }

    public static final void ejfBZ(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("IM_TRACK_EVENT", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static /* synthetic */ void imLogFeatureRestriction$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        AhwBna(str, th);
    }

    public static final void AhwBna(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("IM_FEATURE_RESTRICTION", "<" + java.lang.Thread.currentThread().getName() + "> => " + str, th);
    }

    public static final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl(str, "[" + android.os.Process.myTid() + "] " + str2);
    }
}
