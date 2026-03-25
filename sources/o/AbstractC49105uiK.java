package o;

import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.ShareConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55284xgz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uiK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49105uiK implements InterfaceC49121uia {
    public final C49284ule EZpvd = new C49284ule();
    public java.util.List<java.lang.String> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public boolean EZpvd(@NotNull ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public void OLrzqt(java.util.List<java.lang.String> list) {
        this.KWHzl = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<java.lang.String> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C49284ule valueOf() {
        return this.EZpvd;
    }

    public final void OLrzqt() {
        valueOf().OLrzqt();
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
            sb.append(str2);
        } else {
            sb.append(str);
            sb.append("\n");
            sb.append(str2);
        }
        if (str3 != null && str3.length() != 0 && !StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) str3, false, 2, (java.lang.Object) null)) {
            sb.append(" ");
            sb.append(str3);
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void OLrzqt(@NotNull IShareParams iShareParams, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(iShareParams, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (C48903ueU.EZpvd(iShareParams)) {
            EZpvd(3, str);
        }
    }

    public final void AEQbTJ(@NotNull IShareParams iShareParams, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(iShareParams, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (C48903ueU.EZpvd(iShareParams)) {
            EZpvd(3, str);
        }
    }

    public final void EZpvd(int i, java.lang.String str) {
        try {
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ == null) {
                return;
            }
            android.view.View viewFindViewById = activityAEQbTJ.findViewById(android.R.id.content);
            C55284xgz.Activity activity = C55284xgz.Companion;
            Intrinsics.copydefault(viewFindViewById);
            C55284xgz c55284xgzKWHzl = activity.KWHzl(viewFindViewById, str);
            if (c55284xgzKWHzl != null) {
                c55284xgzKWHzl.isConnected(i);
                c55284xgzKWHzl.djBIcL(0);
                c55284xgzKWHzl.hDKMBd();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
