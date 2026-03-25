package o;

import com.okinc.network.okg.unifieddomain.DomainConfigType;
import com.okinc.network.okg.unifieddomain.UnifiedDomainCollector;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.roM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43386roM {
    public static final C43386roM EZpvd = new C43386roM();
    public static UnifiedDomainCollector AEQbTJ = C43464rpl.OLrzqt.OLrzqt();
    public static final int OLrzqt = 8;

    private C43386roM() {
    }

    public final void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ.init(context);
    }

    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
        return AEQbTJ.getHeadersMap();
    }

    public final boolean OLrzqt() {
        return AEQbTJ.isInitSuccess().get();
    }

    public final java.lang.String EZpvd() {
        return AEQbTJ.getDomainByType(DomainConfigType.CDN);
    }

    public final java.lang.String KWHzl() {
        return AEQbTJ.getCountryCode();
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return false;
        }
        java.util.Set<java.lang.String> xCdnDomains = AEQbTJ.getXCdnDomains();
        if ((xCdnDomains instanceof java.util.Collection) && xCdnDomains.isEmpty()) {
            return false;
        }
        for (java.lang.String str2 : xCdnDomains) {
            android.net.Uri uri = android.net.Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            java.lang.String host = uri.getHost();
            if (host != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) host, false, 2, (java.lang.Object) null)) {
                return true;
            }
        }
        return false;
    }
}
