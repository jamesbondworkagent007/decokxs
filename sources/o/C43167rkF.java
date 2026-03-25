package o;

import com.google.common.net.HttpHeaders;
import com.okinc.mlnservice.sse.GrowthSSEBean;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rkF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43167rkF {

    /* JADX INFO: renamed from: o.rkF$StateListAnimator */
    public interface StateListAnimator {
        void OLrzqt(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rkF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58247yxg openAsObservable$default(C43167rkF c43167rkF, java.lang.String str, java.util.Map map, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return c43167rkF.KWHzl(str, map, str2);
    }

    public final AbstractC58247yxg<GrowthSSEBean> KWHzl(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        AbstractC58247yxg<GrowthSSEBean> abstractC58247yxgCreate = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.rkE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                C43167rkF.copydefault(this.EZpvd, str, str2, map, interfaceC58251yxk);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgCreate, "");
        return abstractC58247yxgCreate;
    }

    public static final void copydefault(C43167rkF c43167rkF, java.lang.String str, java.lang.String str2, java.util.Map map, InterfaceC58251yxk interfaceC58251yxk) {
        Response responseExecute;
        BufferedSource bufferedSourceSource;
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        OkHttpClient okHttpClientKWHzl = c43167rkF.KWHzl();
        Request.Builder builderHeader = new Request.Builder().url(C43292rmY.OLrzqt.fJNWhG() + str).header(HttpHeaders.ACCEPT, "text/event-stream").header("Cache-Control", "no-cache").header(HttpHeaders.CONNECTION, "keep-alive");
        if (str2 != null && str2.length() != 0) {
            builderHeader.header(HttpHeaders.LAST_EVENT_ID, str2);
        }
        for (Map.Entry entry : map.entrySet()) {
            builderHeader.header((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        final Call callNewCall = okHttpClientKWHzl.newCall(builderHeader.build());
        interfaceC58251yxk.setCancellable(new InterfaceC58225yxK() { // from class: o.rkH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                C43167rkF.EZpvd(callNewCall);
            }
        });
        try {
            responseExecute = callNewCall.execute();
        } catch (java.lang.Throwable th) {
            th = th;
            responseExecute = null;
        }
        try {
        } catch (java.lang.Throwable th2) {
            th = th2;
            try {
                if (!interfaceC58251yxk.isDisposed()) {
                    interfaceC58251yxk.onError(th);
                }
                if (responseExecute == null) {
                    return;
                }
            } catch (java.lang.Throwable th3) {
                if (responseExecute != null) {
                    try {
                        responseExecute.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                throw th3;
            }
        }
        if (!responseExecute.isSuccessful()) {
            throw new java.io.IOException("SSE request failed: HTTP " + responseExecute.code());
        }
        ResponseBody responseBodyBody = responseExecute.body();
        if (responseBodyBody == null || (bufferedSourceSource = responseBodyBody.source()) == null) {
            throw new java.io.IOException("SSE response has no body");
        }
        c43167rkF.OLrzqt(bufferedSourceSource, callNewCall, new Application(interfaceC58251yxk));
        if (!interfaceC58251yxk.isDisposed()) {
            interfaceC58251yxk.onComplete();
        }
        try {
            responseExecute.close();
        } catch (java.lang.Throwable unused2) {
        }
    }

    public static final void EZpvd(Call call) {
        try {
            call.cancel();
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: o.rkF$Application */
    public static final class Application implements StateListAnimator {
        public final /* synthetic */ InterfaceC58251yxk<GrowthSSEBean> AEQbTJ;

        public Application(InterfaceC58251yxk<GrowthSSEBean> interfaceC58251yxk) {
            this.AEQbTJ = interfaceC58251yxk;
        }

        @Override // o.C43167rkF.StateListAnimator
        public void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str3, "");
            if (this.AEQbTJ.isDisposed()) {
                return;
            }
            this.AEQbTJ.onNext(new GrowthSSEBean(str, str2, str3));
        }
    }

    public final OkHttpClient KWHzl() {
        return new C43206rks().initClientBuilder().build().newBuilder().readTimeout(60L, java.util.concurrent.TimeUnit.SECONDS).retryOnConnectionFailure(true).build();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.StringBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    public final void OLrzqt(BufferedSource bufferedSource, Call call, StateListAnimator stateListAnimator) {
        boolean zIsCanceled;
        java.lang.String utf8Line;
        java.lang.String strSubstring;
        java.lang.String str;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (!call.isCanceled()) {
            try {
                utf8Line = bufferedSource.readUtf8Line();
            } finally {
                if (zIsCanceled) {
                }
            }
            if (utf8Line == null) {
                return;
            }
            if (utf8Line.length() == 0) {
                OLrzqt(sb, stateListAnimator, objectRef, objectRef2);
            } else if (!C59449zhJ.startsWith$default(utf8Line, ":", false, 2, null)) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) utf8Line, AbstractJsonLexerKt.COLON, 0, false, 6, (java.lang.Object) null);
                if (iIndexOf$default == -1) {
                    strSubstring = utf8Line;
                } else {
                    strSubstring = utf8Line.substring(0, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                }
                if (iIndexOf$default == -1) {
                    str = "";
                } else {
                    java.lang.String strSubstring2 = utf8Line.substring(iIndexOf$default + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    str = strSubstring2;
                }
                boolean zStartsWith$default = C59449zhJ.startsWith$default(str, " ", false, 2, null);
                ?? r0 = str;
                if (zStartsWith$default) {
                    java.lang.String strSubstring3 = str.substring(1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                    r0 = strSubstring3;
                }
                int iHashCode = strSubstring.hashCode();
                if (iHashCode != 3355) {
                    if (iHashCode != 3076010) {
                        if (iHashCode != 96891546) {
                            if (iHashCode == 108405416) {
                                strSubstring.equals("retry");
                            }
                        } else if (strSubstring.equals("event")) {
                            objectRef.element = r0;
                        }
                    } else if (strSubstring.equals("data")) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append((java.lang.String) r0);
                    }
                } else if (strSubstring.equals("id")) {
                    objectRef2.element = r0;
                }
            }
        }
    }

    public static final void OLrzqt(java.lang.StringBuilder sb, StateListAnimator stateListAnimator, Ref.ObjectRef<java.lang.String> objectRef, Ref.ObjectRef<java.lang.String> objectRef2) {
        java.lang.String string;
        if (sb.length() == 0) {
            return;
        }
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) sb, (java.lang.CharSequence) "\n", false, 2, (java.lang.Object) null)) {
            string = sb.substring(0, sb.length() - 1);
        } else {
            string = sb.toString();
        }
        java.lang.String str = objectRef.element;
        java.lang.String str2 = objectRef2.element;
        Intrinsics.copydefault((java.lang.Object) string);
        stateListAnimator.OLrzqt(str, str2, string);
        sb.setLength(0);
        objectRef.element = null;
    }
}
