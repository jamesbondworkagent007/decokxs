package o;

import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.biz.drivers.GoogleDriveErrorBean;
import com.okinc.business.defi.biz.drivers.GoogleDriveErrorDetailBean;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cTf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11572cTf {
    public static final C11572cTf copydefault = new C11572cTf();

    /* JADX INFO: renamed from: o.cTf$Application */
    public static final class Application extends TypeToken<GoogleDriveErrorBean> {
    }

    private C11572cTf() {
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        GoogleDriveErrorBean googleDriveErrorBean;
        GoogleDriveErrorDetailBean googleDriveErrorDetailBean;
        Intrinsics.checkNotNullParameter(str, "");
        int i = 0;
        java.lang.String message = null;
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "{", false, 2, (java.lang.Object) null)) {
            int length = str.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (str.charAt(i) == '{') {
                    break;
                }
                i++;
            }
            java.lang.String strSubstring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            googleDriveErrorBean = (GoogleDriveErrorBean) C14637dpH.getGson$default(null, 1, null).fromJson(strSubstring, new Application().getType());
        } else {
            googleDriveErrorBean = null;
        }
        if (googleDriveErrorBean != null) {
            int code = googleDriveErrorBean.getCode();
            java.util.List<GoogleDriveErrorDetailBean> errors = googleDriveErrorBean.getErrors();
            if (errors != null && (googleDriveErrorDetailBean = (GoogleDriveErrorDetailBean) CollectionsKt___CollectionsKt.firstOrNull(errors)) != null) {
                message = googleDriveErrorDetailBean.getMessage();
            }
            str = code + " " + message;
        }
        pUU.copydefault("GoogleDriveErrorMessageHelper", str);
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatSearchResultReceiver);
    }
}
