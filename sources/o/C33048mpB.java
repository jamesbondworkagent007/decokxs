package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33048mpB {
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final android.os.Bundle EZpvd(@NotNull kotlin.Pair<java.lang.String, ? extends java.lang.Object>[] pairArr) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        Intrinsics.checkNotNullParameter(pairArr, "");
        android.os.Bundle bundle = new android.os.Bundle();
        int length = pairArr.length;
        for (int i = 0; i < length; i++) {
            kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair = pairArr[i];
            java.lang.Object second = pair != null ? pair.getSecond() : null;
            if (second != null && (string4 = second.toString()) != null && new Regex("^[-+]?\\d+$").matches(string4)) {
                EZpvd(bundle, pair);
            } else if (second != null && (string3 = second.toString()) != null && new Regex("^[-+]?\\d+[lL]$").matches(string3)) {
                KWHzl(bundle, pair);
            } else if (second != null && (string2 = second.toString()) != null && new Regex("^[-+]?(\\d+(\\.\\d*)?|\\.\\d+)([eE][-+]?\\d+)?[dD]?$").matches(string2)) {
                AEQbTJ(bundle, pair);
            } else if (second != null && (string = second.toString()) != null && new Regex("^[-+]?(\\d+(\\.\\d*)?|\\.\\d+)([eE][-+]?\\d+)?[fF]?$").matches(string)) {
                OLrzqt(bundle, pair);
            } else if (Intrinsics.EZpvd((java.lang.Object) (second != null ? second.toString() : null), (java.lang.Object) "true")) {
                bundle.putBoolean(pair.getFirst(), java.lang.Boolean.parseBoolean(second.toString()));
            } else if (!Intrinsics.EZpvd((java.lang.Object) (second != null ? second.toString() : null), (java.lang.Object) "false")) {
                if (second instanceof java.lang.String) {
                    copydefault(bundle, pair);
                } else if (second instanceof android.os.Bundle) {
                    bundle.putBundle(pair.getFirst(), (android.os.Bundle) second);
                } else if (second instanceof android.os.Parcelable) {
                    bundle.putParcelable(pair.getFirst(), (android.os.Parcelable) second);
                }
            }
        }
        return bundle;
    }

    public static final void EZpvd(android.os.Bundle bundle, kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair) {
        java.lang.Object second;
        if (pair != null) {
            try {
                second = pair.getSecond();
            } catch (java.lang.Exception unused) {
                KWHzl(bundle, pair);
                return;
            }
        } else {
            second = null;
        }
        bundle.putInt(pair != null ? pair.getFirst() : null, java.lang.Integer.parseInt(java.lang.String.valueOf(second)));
    }

    public static final void KWHzl(android.os.Bundle bundle, kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair) {
        java.lang.Object second;
        if (pair != null) {
            try {
                second = pair.getSecond();
            } catch (java.lang.Exception unused) {
                copydefault(bundle, pair);
                return;
            }
        } else {
            second = null;
        }
        bundle.putLong(pair != null ? pair.getFirst() : null, java.lang.Long.parseLong(C59449zhJ.replace$default(C59449zhJ.replace$default(java.lang.String.valueOf(second), "l", "", false, 4, (java.lang.Object) null), "L", "", false, 4, (java.lang.Object) null)));
    }

    public static final void AEQbTJ(android.os.Bundle bundle, kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair) {
        java.lang.Object second;
        if (pair != null) {
            try {
                second = pair.getSecond();
            } catch (java.lang.Exception unused) {
                copydefault(bundle, pair);
                return;
            }
        } else {
            second = null;
        }
        bundle.putDouble(pair != null ? pair.getFirst() : null, java.lang.Double.parseDouble(java.lang.String.valueOf(second)));
    }

    public static final void OLrzqt(android.os.Bundle bundle, kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair) {
        java.lang.Object second;
        if (pair != null) {
            try {
                second = pair.getSecond();
            } catch (java.lang.Exception unused) {
                AEQbTJ(bundle, pair);
                return;
            }
        } else {
            second = null;
        }
        bundle.putFloat(pair != null ? pair.getFirst() : null, java.lang.Float.parseFloat(java.lang.String.valueOf(second)));
    }

    public static final void copydefault(android.os.Bundle bundle, kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair) {
        bundle.putString(pair != null ? pair.getFirst() : null, java.lang.String.valueOf(pair != null ? pair.getSecond() : null));
    }
}
