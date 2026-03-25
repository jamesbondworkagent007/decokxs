package o;

import com.okinc.network.okg.unifieddomain.DomainType;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.roL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43385roL {
    public static volatile C43385roL OLrzqt;
    public final java.util.Map<DomainType, java.util.Set<java.lang.String>> EZpvd;
    public final java.util.Map<DomainType, java.lang.String> KWHzl;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.roL.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C43385roL(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C43385roL() {
        this.KWHzl = new ConcurrentHashMap();
        this.EZpvd = new ConcurrentHashMap();
    }

    public final void AEQbTJ(@NotNull DomainType domainType, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(domainType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.put(domainType, str);
    }

    public final void KWHzl(@NotNull DomainType domainType, @NotNull java.util.Set<java.lang.String> set) {
        Intrinsics.checkNotNullParameter(domainType, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.EZpvd.put(domainType, set);
    }

    public final HttpUrl copydefault(@NotNull DomainType domainType, @NotNull HttpUrl httpUrl) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(domainType, "");
        Intrinsics.checkNotNullParameter(httpUrl, "");
        java.util.Set<java.lang.String> set = this.EZpvd.get(domainType);
        if (set == null || (str = this.KWHzl.get(domainType)) == null) {
            return httpUrl;
        }
        java.lang.Object obj = null;
        java.lang.String strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(str, "://", (java.lang.String) null, 2, (java.lang.Object) null);
        if (strSubstringAfter$default == null) {
            return httpUrl;
        }
        try {
            java.lang.String strHost = httpUrl.host();
            java.util.Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (OLrzqt((java.lang.String) next, strHost)) {
                    obj = next;
                    break;
                }
            }
            if (((java.lang.String) obj) != null) {
                HttpUrl httpUrlBuild = httpUrl.newBuilder().host(strSubstringAfter$default).build();
                pUU.EZpvd("UnifiedDomainRegistry", "Matched --- Original URL: " + httpUrl + ", Replaced URL: " + httpUrlBuild);
                return httpUrlBuild;
            }
            pUU.EZpvd("UnifiedDomainRegistry", "Do nothing because didn't match any whitelist: " + httpUrl);
            return httpUrl;
        } catch (java.lang.Exception e) {
            pUU.copydefault("UnifiedDomainRegistry", "replaceUrlWithDomainType error: " + e);
            return httpUrl;
        }
    }

    public final boolean OLrzqt(java.lang.String str, java.lang.String str2) {
        return new Regex("^" + C59449zhJ.replace$default(C59449zhJ.replace$default(str, JwtUtilsKt.JWT_DELIMITER, "\\.", false, 4, (java.lang.Object) null), "*", ".*", false, 4, (java.lang.Object) null) + "$").matches(str2);
    }

    public final java.lang.String AEQbTJ(@NotNull DomainType domainType) {
        Intrinsics.checkNotNullParameter(domainType, "");
        return this.KWHzl.get(domainType);
    }

    /* JADX INFO: renamed from: o.roL$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.roL.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C43385roL EZpvd() {
            C43385roL c43385roL = C43385roL.OLrzqt;
            if (c43385roL == null) {
                synchronized (this) {
                    if (C43385roL.OLrzqt == null) {
                        StateListAnimator stateListAnimator = C43385roL.Companion;
                        C43385roL.OLrzqt = new C43385roL(null);
                    }
                    c43385roL = C43385roL.OLrzqt;
                    Intrinsics.copydefault(c43385roL);
                }
            }
            return c43385roL;
        }
    }
}
