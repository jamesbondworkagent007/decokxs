package o;

import com.just.agentweb.DefaultWebClient;
import com.okinc.core.util.SPUtils;
import com.okinc.debugbox.doh.DebugDohItemBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mNB {
    public static final TaskDescription Companion = new TaskDescription(null);

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mNB.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final boolean OLrzqt(@NotNull DebugDohItemBean debugDohItemBean) {
            Intrinsics.checkNotNullParameter(debugDohItemBean, "");
            return OLrzqt(debugDohItemBean.getType()) != -1;
        }

        public final void KWHzl(@NotNull java.util.ArrayList<DebugDohItemBean> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            java.util.Iterator<DebugDohItemBean> it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                DebugDohItemBean next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                DebugDohItemBean debugDohItemBean = next;
                copydefault(OLrzqt(debugDohItemBean.getType()), debugDohItemBean.getDomain(), debugDohItemBean.getIp());
            }
            pUU.KWHzl("DohConfigUtil", "saveDebugDohConfig, success for " + arrayList);
        }

        public final void copydefault(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            java.lang.String strEZpvd = EZpvd(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString());
            if (strEZpvd == null) {
                return;
            }
            if (i == 1) {
                C43368rnv c43368rnv = C43368rnv.copydefault;
                SPUtils.put(c43368rnv.copydefault("doh_debug_http_", true), strEZpvd);
                SPUtils.put(c43368rnv.EZpvd(strEZpvd), str2);
                return;
            }
            if (i == 2) {
                C43368rnv c43368rnv2 = C43368rnv.copydefault;
                SPUtils.put(c43368rnv2.copydefault("doh_debug_v5_", true), strEZpvd);
                SPUtils.put(c43368rnv2.EZpvd(strEZpvd), str2);
                return;
            }
            if (i == 3) {
                C43368rnv c43368rnv3 = C43368rnv.copydefault;
                SPUtils.put(c43368rnv3.copydefault("doh_debug_http_", false), strEZpvd);
                SPUtils.put(c43368rnv3.EZpvd(strEZpvd), str2);
            } else if (i == 4) {
                C43368rnv c43368rnv4 = C43368rnv.copydefault;
                SPUtils.put(c43368rnv4.copydefault("doh_debug_v5_", false), strEZpvd);
                SPUtils.put(c43368rnv4.EZpvd(strEZpvd), str2);
            } else {
                if (i != 5) {
                    return;
                }
                C43368rnv c43368rnv5 = C43368rnv.copydefault;
                SPUtils.put(c43368rnv5.copydefault("doh_debug_dexpri_", true), strEZpvd);
                SPUtils.put(c43368rnv5.EZpvd(strEZpvd), str2);
            }
        }

        public final int OLrzqt(java.lang.String str) {
            if (C59449zhJ.gEmmrt(str, "http", true)) {
                return 1;
            }
            if (C59449zhJ.gEmmrt(str, "v5", true)) {
                return 2;
            }
            if (C59449zhJ.gEmmrt(str, "cor_http", true)) {
                return 3;
            }
            if (C59449zhJ.gEmmrt(str, "cor_v5", true)) {
                return 4;
            }
            return C59449zhJ.gEmmrt(str, "dexpri", true) ? 5 : -1;
        }

        public final java.lang.String EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
                return null;
            }
            android.net.Uri uri = android.net.Uri.parse(string);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            if (uri.getHost() != null) {
                return uri.getHost();
            }
            android.net.Uri uri2 = android.net.Uri.parse(DefaultWebClient.HTTPS_SCHEME + string);
            Intrinsics.checkNotNullExpressionValue(uri2, "");
            return uri2.getHost();
        }
    }
}
