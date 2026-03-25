package o;

import com.okinc.okrisk.OKRiskConstantKeys;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.thj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46998thj implements Function2<Interceptor.Chain, Request.Builder, Unit> {
    public static final Application Companion = new Application(null);
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;

    public C46998thj(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.EZpvd = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: o.thj.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C46998thj(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Unit invoke(Interceptor.Chain chain, Request.Builder builder) {
        OLrzqt(chain, builder);
        return Unit.INSTANCE;
    }

    public void OLrzqt(@NotNull Interceptor.Chain chain, @NotNull Request.Builder builder) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(chain, "");
        Intrinsics.checkNotNullParameter(builder, "");
        builder.header("risk-params", this.KWHzl);
        builder.header("fingerprint-id", this.OLrzqt);
        java.lang.String upperCase = chain.request().method().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        HttpUrl httpUrlUrl = chain.request().url();
        if ((copydefault(httpUrlUrl.encodedPath()) || !C43292rmY.OLrzqt.AwvSrB().values()) && Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "POST") && (str = this.EZpvd) != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String strEZpvd = EZpvd(this.EZpvd, jCurrentTimeMillis);
            builder.header("X-FpToken", this.EZpvd);
            builder.header("X-FpToken-Signature", strEZpvd);
            builder.header("X-FpToken-Timestamp", java.lang.String.valueOf(jCurrentTimeMillis));
        }
        copydefault(chain, builder);
        if (AEQbTJ(httpUrlUrl.encodedPath()) && KWHzl(httpUrlUrl)) {
            builder.header("x-sec-token", C47046tie.KWHzl.copydefault());
        }
    }

    public final boolean copydefault(java.lang.String str) {
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC47006thr.class));
        if (listKWHzl != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = listKWHzl.iterator();
            while (it.hasNext()) {
                C56406yEe.KWHzl(arrayList, ((InterfaceC47006thr) it.next()).EZpvd());
            }
            if (!arrayList.isEmpty()) {
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) it2.next(), (java.lang.CharSequence) str, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean AEQbTJ(java.lang.String str) {
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC46977thO.class));
        if (listKWHzl != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = listKWHzl.iterator();
            while (it.hasNext()) {
                C56406yEe.KWHzl(arrayList, ((InterfaceC46977thO) it.next()).copydefault());
            }
            if (!arrayList.isEmpty()) {
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) it2.next(), (java.lang.CharSequence) str, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean KWHzl(HttpUrl httpUrl) {
        return !C59449zhJ.gEmmrt(httpUrl.queryParameter(OKRiskConstantKeys.NO_SEC.getValue()), "true", true);
    }

    public final java.lang.String EZpvd(java.lang.String str, long j) {
        java.lang.String str2 = str + j;
        C6887aXp c6887aXp = C6887aXp.copydefault;
        byte[] bytes = str2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return c6887aXp.EZpvd(bytes);
    }

    public final void copydefault(@NotNull Interceptor.Chain chain, @NotNull Request.Builder builder) {
        Intrinsics.checkNotNullParameter(chain, "");
        Intrinsics.checkNotNullParameter(builder, "");
        C46979thQ c46979thQ = C46979thQ.copydefault;
        java.lang.String strEZpvd = c46979thQ.OLrzqt().AhwBna().EZpvd();
        int iOrdinal = c46979thQ.OLrzqt().AhwBna().copydefault().ordinal();
        builder.header("tmx-session-id", strEZpvd);
        builder.header("tmx-session-status", java.lang.String.valueOf(iOrdinal));
        builder.header("headers-order-string-hash", C47137tkP.KWHzl.AEQbTJ(CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.EZpvd(chain.request().headers().names(), new StateListAnimator()), "", null, null, 0, null, null, 62, null)));
    }

    /* JADX INFO: renamed from: o.thj$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.thj.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.thj$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = ((java.lang.String) t).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String lowerCase2 = ((java.lang.String) t2).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return yET.KWHzl(lowerCase, lowerCase2);
        }
    }
}
