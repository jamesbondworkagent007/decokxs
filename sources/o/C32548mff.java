package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32548mff extends C5378Pk {
    public final C5378Pk djBIcL;
    public int valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32548mff(@NotNull C5378Pk c5378Pk) {
        super(c5378Pk.EZpvd());
        Intrinsics.checkNotNullParameter(c5378Pk, "");
        this.djBIcL = c5378Pk;
    }

    @Override // o.C5378Pk
    public java.util.Map<java.lang.String, java.lang.String> copydefault() {
        java.util.Map<java.lang.String, java.lang.String> mapCopydefault = this.djBIcL.copydefault();
        Intrinsics.checkNotNullExpressionValue(mapCopydefault, "");
        return mapCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // o.C5378Pk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String EZpvd() {
        java.lang.String strSubstringAfter$default;
        java.lang.String strEZpvd = this.djBIcL.EZpvd();
        try {
            java.net.URL url = new java.net.URL(strEZpvd);
            java.lang.String protocol = url.getProtocol();
            Intrinsics.checkNotNullExpressionValue(protocol, "");
            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) protocol, (java.lang.CharSequence) "http", true)) {
                C43386roM c43386roM = C43386roM.EZpvd;
                Intrinsics.copydefault((java.lang.Object) strEZpvd);
                if (!c43386roM.copydefault(strEZpvd)) {
                    url = null;
                }
            }
            if (url != null) {
                Intrinsics.copydefault((java.lang.Object) strEZpvd);
                java.lang.String host = url.getHost();
                Intrinsics.checkNotNullExpressionValue(host, "");
                strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(strEZpvd, host, (java.lang.String) null, 2, (java.lang.Object) null);
                if (strSubstringAfter$default == null) {
                    strSubstringAfter$default = strEZpvd;
                }
            }
            Intrinsics.copydefault((java.lang.Object) strSubstringAfter$default);
            return strSubstringAfter$default;
        } catch (java.lang.Exception unused) {
            Intrinsics.copydefault((java.lang.Object) strEZpvd);
            return strEZpvd;
        }
    }

    @Override // o.C5378Pk, o.NH
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5378Pk) {
            C5378Pk c5378Pk = (C5378Pk) obj;
            if (Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) c5378Pk.EZpvd()) && Intrinsics.EZpvd(copydefault(), c5378Pk.copydefault())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C5378Pk, o.NH
    public int hashCode() {
        if (this.valueOf == 0) {
            int iHashCode = EZpvd().hashCode();
            this.valueOf = iHashCode;
            this.valueOf = (iHashCode * 31) + copydefault().hashCode();
        }
        return this.valueOf;
    }
}
