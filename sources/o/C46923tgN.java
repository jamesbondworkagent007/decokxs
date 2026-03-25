package o;

import com.okinc.core.util.SPUtils;
import com.okinc.okpush.sdk.service.NotificationIdQueue$addIfNew$2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: renamed from: o.tgN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46923tgN {
    public static boolean copydefault;
    public static final C46923tgN KWHzl = new C46923tgN();
    public static final CoroutineDispatcher AEQbTJ = Dispatchers.getIO();
    public static final Mutex EZpvd = MutexKt.Mutex$default(false, 1, null);
    public static final yDQ<java.lang.String> gEmmrt = new yDQ<>();
    public static final java.util.HashSet<java.lang.String> djBIcL = new java.util.HashSet<>();
    public static final int OLrzqt = 8;

    private C46923tgN() {
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(AEQbTJ, new NotificationIdQueue$addIfNew$2(str, null), continuation);
    }

    public final void KWHzl() {
        if (copydefault) {
            return;
        }
        java.util.List<java.lang.String> listAhwBna = AhwBna();
        for (int iCopydefault = C56548yJl.copydefault(listAhwBna.size() - 3000, 0); iCopydefault < listAhwBna.size(); iCopydefault++) {
            java.lang.String str = listAhwBna.get(iCopydefault);
            if (true ^ StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
                java.util.HashSet<java.lang.String> hashSet = djBIcL;
                if (!hashSet.contains(str)) {
                    gEmmrt.addLast(str);
                    hashSet.add(str);
                }
            }
        }
        copydefault = true;
    }

    public final java.util.List<java.lang.String> AhwBna() {
        java.lang.String string = SPUtils.getString("notification_id_queue", null, "okpush_notification");
        if (string == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
            return yDY.AhwBna();
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                java.lang.String strOptString = jSONArray.optString(i);
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOptString)) {
                    arrayList.add(strOptString);
                }
            }
            return arrayList;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("NotificationIdQueue", "Failed to parse notification queue", e);
            return yDY.AhwBna();
        }
    }

    public final void copydefault() {
        java.util.List<java.lang.String> listAxsJAYsNCnLh;
        yDQ<java.lang.String> ydq = gEmmrt;
        if (ydq.size() > 3000) {
            listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) ydq, ydq.size() - 3000);
        } else {
            listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(ydq);
        }
        if (listAxsJAYsNCnLh.size() != ydq.size()) {
            ydq.clear();
            djBIcL.clear();
            for (java.lang.String str : listAxsJAYsNCnLh) {
                gEmmrt.addLast(str);
                djBIcL.add(str);
            }
        }
        SPUtils.commit("notification_id_queue", new JSONArray((java.util.Collection) listAxsJAYsNCnLh).toString(), "okpush_notification");
    }
}
