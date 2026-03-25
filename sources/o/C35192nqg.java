package o;

import android.content.SharedPreferences;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35192nqg {
    public static final void KWHzl(@NotNull android.content.Context context, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("App_Widget_Prefs_Crypto_new", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "");
        editorEdit.putString(str, CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null));
        editorEdit.apply();
    }

    public static final java.util.List<java.lang.String> EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = context.getSharedPreferences("App_Widget_Prefs_Crypto_new", 0).getString(str, "");
        java.lang.String str2 = string == null ? "" : string;
        if (str2.length() > 0) {
            return StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        }
        return yDY.AhwBna();
    }

    public static final java.util.List<java.lang.String> copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        java.util.List<java.lang.String> listAhwBna;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = context.getSharedPreferences("App_Widget_Prefs_Crypto_new", 0).getString("TOP_MAIN_COINS_STRING", "");
        java.lang.String str2 = string == null ? "" : string;
        if (str2.length() > 0) {
            listAhwBna = StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        } else {
            listAhwBna = yDY.AhwBna();
        }
        int iEZpvd = EZpvd(str);
        if (listAhwBna.size() >= iEZpvd) {
            listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listAhwBna, iEZpvd);
        }
        if (!KWHzl(str)) {
            return listAhwBna;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator<T> it = listAhwBna.iterator();
        while (it.hasNext()) {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            arrayList.add(listSplit$default.size() >= 2 ? (java.lang.String) listSplit$default.get(0) : "");
        }
        return arrayList;
    }

    public static final java.util.List<java.lang.String> KWHzl(@NotNull android.content.Context context, int i, @NotNull java.lang.String str) {
        java.util.List<java.lang.String> listAhwBna;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = context.getSharedPreferences("App_Widget_Prefs_Crypto_new", 0).getString("TOP_MAIN_COINS_STRING", "");
        java.lang.String str2 = string == null ? "" : string;
        if (str2.length() > 0) {
            listAhwBna = StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        } else {
            listAhwBna = yDY.AhwBna();
        }
        int iEZpvd = EZpvd(str);
        if (listAhwBna.size() >= iEZpvd) {
            listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listAhwBna, iEZpvd);
        }
        if (KWHzl(str)) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
            java.util.Iterator<T> it = listAhwBna.iterator();
            while (it.hasNext()) {
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                arrayList.add(listSplit$default.size() >= 2 ? (java.lang.String) listSplit$default.get(0) : "");
            }
            listAhwBna = arrayList;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SINGLE_COIN_PREFS_KEY_STRING")) {
            java.lang.String str3 = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(listAhwBna);
            java.lang.String str4 = str3 != null ? str3 : "";
            java.util.List<java.lang.String> listEZpvd = EZpvd(context, str + "_" + i);
            if (!(!listEZpvd.isEmpty())) {
                listEZpvd = null;
            }
            listAhwBna = listEZpvd;
            if (listAhwBna == null) {
                listAhwBna = C56402yEa.EZpvd(str4);
            }
        } else {
            java.util.List<java.lang.String> listEZpvd2 = EZpvd(context, str + "_" + i);
            if (!listEZpvd2.isEmpty()) {
                listAhwBna = listEZpvd2;
            }
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "TWO_INST_PREFS_KEY_STRING") && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FIVE_INST_PREFS_KEY_STRING")) {
            listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listAhwBna, iEZpvd);
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(listAhwBna);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1744384425:
                str.equals("SINGLE_COIN_PREFS_KEY_STRING");
            case 97534508:
                return !str.equals("FIVE_INST_PREFS_KEY_STRING") ? 1 : 5;
            case 342385190:
                if (str.equals("TWO_INST_PREFS_KEY_STRING")) {
                    return 2;
                }
                break;
            case 690323949:
                if (str.equals("TRIPLE_COIN_PREFS_KEY_STRING")) {
                    return 3;
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int AEQbTJ(@NotNull java.lang.String str) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1744384425:
                str2 = "SINGLE_COIN_PREFS_KEY_STRING";
                str.equals(str2);
            case 97534508:
                return !str.equals("FIVE_INST_PREFS_KEY_STRING") ? 1 : 200;
            case 342385190:
                if (!str.equals("TWO_INST_PREFS_KEY_STRING")) {
                }
                break;
            case 690323949:
                if (str.equals("TRIPLE_COIN_PREFS_KEY_STRING")) {
                    return 3;
                }
                break;
            case 1284887090:
                str2 = "P2P_MARKET_PREFS_KEY_STRING";
                str.equals(str2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean KWHzl(@NotNull java.lang.String str) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1744384425:
                str2 = "SINGLE_COIN_PREFS_KEY_STRING";
                str.equals(str2);
            case 97534508:
                return !str.equals("FIVE_INST_PREFS_KEY_STRING");
            case 342385190:
                if (!str.equals("TWO_INST_PREFS_KEY_STRING")) {
                }
                break;
            case 690323949:
                str2 = "TRIPLE_COIN_PREFS_KEY_STRING";
                str.equals(str2);
        }
    }

    public static final void AEQbTJ(@NotNull android.content.Context context, int i, java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("App_Widget_Prefs_Crypto_new", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "");
        editorEdit.putString(str2 + "_" + i, str);
        editorEdit.apply();
    }

    public static final void EZpvd(@NotNull android.content.Context context, int i, java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SINGLE_COIN_PREFS_KEY_STRING")) {
            AEQbTJ(context, i, list != null ? (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(list) : null, str);
            return;
        }
        if (list == null) {
            list = yDY.AhwBna();
        }
        KWHzl(context, list, str + "_" + i);
    }

    public static final void EZpvd(@NotNull android.content.Context context, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("App_Widget_Prefs_Crypto_new", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "");
        editorEdit.remove(str + "_" + i);
        editorEdit.apply();
    }
}
