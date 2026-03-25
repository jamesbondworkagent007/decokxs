package o;

import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.ShareType;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ujd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49177ujd {
    public static final C49177ujd OLrzqt = new C49177ujd();

    /* JADX INFO: renamed from: o.ujd$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ShareType.values().length];
            try {
                iArr[ShareType.SHARE_TEXT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ShareType.SHARE_WEBPAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    private C49177ujd() {
    }

    public final IShareParams OLrzqt(@NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(iShareParams, "");
        int i = StateListAnimator.KWHzl[iShareParams.getShareType().ordinal()];
        if (i == 1 || i == 2) {
            java.lang.String body = iShareParams.getBody();
            if (body.length() > 0) {
                java.lang.String strCopydefault = copydefault();
                if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) body, (java.lang.CharSequence) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strCopydefault).toString(), false, 2, (java.lang.Object) null)) {
                    iShareParams.setBody(body + "\n" + strCopydefault);
                }
            }
        }
        return iShareParams;
    }

    public final java.lang.String copydefault() {
        java.lang.String string = C32979mnm.EZpvd.OLrzqt().getResources().getString(C48931uew.Activity.AuCTel);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
