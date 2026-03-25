package o;

import aws.smithy.kotlin.runtime.http.HttpErrorCode;
import aws.smithy.kotlin.runtime.http.HttpStatusCode;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56548yJl;
import o.C59449zhJ;
import o.DB;
import o.DI;
import o.DL;
import o.DN;
import o.DS;
import o.DU;
import o.zP;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpMethod;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AZ {
    public static final Request OLrzqt(@NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull DT dt, @NotNull CoroutineContext coroutineContext, @NotNull AK ak) {
        java.lang.Long lAEQbTJ;
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        Intrinsics.checkNotNullParameter(dt, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(ak, "");
        Request.Builder builder = new Request.Builder();
        builder.tag(C4409Bd.class, new C4409Bd(dt, coroutineContext, ak));
        builder.url(interfaceC5037Ch.AEQbTJ().toString());
        final Headers.Builder builder2 = new Headers.Builder();
        interfaceC5037Ch.EZpvd().EZpvd(new Function2<java.lang.String, java.util.List<? extends java.lang.String>, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.OkHttpUtilsKt$toOkHttpRequest$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends String> list) {
                invoke2(str, (List<String>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str, @NotNull List<String> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
                Headers.Builder builder3 = builder2;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    builder3.addUnsafeNonAscii(str, (String) it.next());
                }
            }
        });
        builder.headers(builder2.build());
        RequestBody c4303Bb = null;
        zPVarKWHzl = null;
        zPVarKWHzl = null;
        zP zPVarKWHzl = null;
        if (HttpMethod.permitsRequestBody(interfaceC5037Ch.OLrzqt().name())) {
            zP zPVarKWHzl2 = interfaceC5037Ch.KWHzl();
            if (zPVarKWHzl2 instanceof zP.StateListAnimator) {
                c4303Bb = RequestBody.Companion.create(new byte[0], (MediaType) null, 0, 0);
            } else if (zPVarKWHzl2 instanceof zP.TaskDescription) {
                byte[] bArrOLrzqt = ((zP.TaskDescription) zPVarKWHzl2).OLrzqt();
                c4303Bb = RequestBody.Companion.create(bArrOLrzqt, (MediaType) null, 0, bArrOLrzqt.length);
            } else {
                boolean z = zPVarKWHzl2 instanceof zP.Application;
                if (!z && !(zPVarKWHzl2 instanceof zP.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                java.lang.String strCopydefault = interfaceC5037Ch.EZpvd().copydefault("Content-Length");
                if (strCopydefault != null) {
                    if (zPVarKWHzl2.AEQbTJ() == null || ((lAEQbTJ = zPVarKWHzl2.AEQbTJ()) != null && lAEQbTJ.longValue() == -1)) {
                        if (z) {
                            zPVarKWHzl = C58752zO.OLrzqt(((zP.Application) zPVarKWHzl2).copydefault(), java.lang.Long.valueOf(java.lang.Long.parseLong(strCopydefault)));
                        } else if (zPVarKWHzl2 instanceof zP.Activity) {
                            zPVarKWHzl = C58752zO.KWHzl(((zP.Activity) zPVarKWHzl2).copydefault(), java.lang.Long.valueOf(java.lang.Long.parseLong(strCopydefault)));
                        }
                    }
                    if (zPVarKWHzl != null) {
                        zPVarKWHzl2 = zPVarKWHzl;
                    }
                }
                c4303Bb = new C4303Bb(zPVarKWHzl2, coroutineContext);
            }
        } else if (!(interfaceC5037Ch.KWHzl() instanceof zP.StateListAnimator)) {
            throw new java.lang.IllegalStateException(("unexpected HTTP body for method " + interfaceC5037Ch.OLrzqt()).toString());
        }
        builder.method(interfaceC5037Ch.OLrzqt().name(), c4303Bb);
        return builder.build();
    }

    public static final InterfaceC5039Cj EZpvd(@NotNull Response response) {
        zP stateListAnimator;
        Intrinsics.checkNotNullParameter(response, "");
        AY ay = new AY(response.headers());
        ResponseBody responseBodyBody = response.body();
        Intrinsics.copydefault(responseBodyBody);
        if (responseBodyBody.contentLength() != 0) {
            stateListAnimator = new StateListAnimator(response);
        } else {
            stateListAnimator = zP.StateListAnimator.KWHzl;
        }
        return C5040Ck.AEQbTJ(HttpStatusCode.KWHzl.AEQbTJ(response.code()), ay, stateListAnimator);
    }

    public static final class StateListAnimator extends zP.Application {
        public final java.lang.Long AEQbTJ;
        public final boolean OLrzqt = true;
        public final /* synthetic */ Response copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.zP
        public java.lang.Long AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.zP
        public boolean b_() {
            return this.OLrzqt;
        }

        public StateListAnimator(Response response) {
            java.lang.Long lValueOf;
            this.copydefault = response;
            ResponseBody responseBodyBody = response.body();
            Intrinsics.copydefault(responseBodyBody);
            if (responseBodyBody.contentLength() >= 0) {
                ResponseBody responseBodyBody2 = response.body();
                Intrinsics.copydefault(responseBodyBody2);
                lValueOf = java.lang.Long.valueOf(responseBodyBody2.contentLength());
            } else {
                lValueOf = null;
            }
            this.AEQbTJ = lValueOf;
        }

        @Override // o.zP.Application
        public InterfaceC5060De copydefault() {
            ResponseBody responseBodyBody = this.copydefault.body();
            Intrinsics.copydefault(responseBodyBody);
            return C5066Dk.EZpvd(responseBodyBody.source());
        }
    }

    public static final DL OLrzqt(final java.net.URI uri) {
        return DL.AEQbTJ.EZpvd(new Function1<DL.Application, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.OkHttpUtilsKt$toUrl$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DL.Application application) {
                invoke2(application);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DL.Application application) {
                String host;
                Intrinsics.checkNotNullParameter(application, "");
                DI.ActionBar actionBar = DI.EZpvd;
                String scheme = uri.getScheme();
                Intrinsics.checkNotNullExpressionValue(scheme, "");
                application.EZpvd(actionBar.OLrzqt(scheme));
                DB.Activity activity = DB.copydefault;
                String host2 = uri.getHost();
                Intrinsics.checkNotNullExpressionValue(host2, "");
                if (C59449zhJ.startsWith$default(host2, "[", false, 2, null)) {
                    String host3 = uri.getHost();
                    Intrinsics.checkNotNullExpressionValue(host3, "");
                    host = StringsKt__StringsKt.KWHzl(host3, C56548yJl.AhwBna(1, uri.getHost().length() - 1));
                } else {
                    host = uri.getHost();
                }
                Intrinsics.copydefault((Object) host);
                application.EZpvd(activity.KWHzl(host));
                Integer numValueOf = Integer.valueOf(uri.getPort());
                application.OLrzqt(numValueOf.intValue() > 0 ? numValueOf : null);
                DS.TaskDescription taskDescriptionAYXKKw = application.AYXKKw();
                String rawPath = uri.getRawPath();
                Intrinsics.checkNotNullExpressionValue(rawPath, "");
                taskDescriptionAYXKKw.EZpvd(rawPath);
                String rawQuery = uri.getRawQuery();
                if (rawQuery != null && !StringsKt__StringsKt.fARcdN((CharSequence) rawQuery)) {
                    DN.StateListAnimator stateListAnimatorEZpvd = application.EZpvd();
                    String rawQuery2 = uri.getRawQuery();
                    Intrinsics.checkNotNullExpressionValue(rawQuery2, "");
                    stateListAnimatorEZpvd.KWHzl(rawQuery2);
                }
                String rawUserInfo = uri.getRawUserInfo();
                if (rawUserInfo != null && !StringsKt__StringsKt.fARcdN((CharSequence) rawUserInfo)) {
                    DU.Application applicationValueOf = application.valueOf();
                    DU.Activity activity2 = DU.OLrzqt;
                    String rawUserInfo2 = uri.getRawUserInfo();
                    Intrinsics.checkNotNullExpressionValue(rawUserInfo2, "");
                    applicationValueOf.AEQbTJ(activity2.EZpvd(rawUserInfo2));
                }
                application.OLrzqt(uri.getRawFragment());
            }
        });
    }

    public static final HttpErrorCode AEQbTJ(java.lang.Exception exc) {
        java.lang.Object next;
        java.lang.Exception exc2;
        java.lang.Object next2;
        if (copydefault(exc)) {
            return HttpErrorCode.CONNECT_TIMEOUT;
        }
        if (KWHzl(exc)) {
            return HttpErrorCode.CONNECTION_CLOSED;
        }
        if (exc instanceof SocketTimeoutException) {
            exc2 = exc;
        } else if (exc.getCause() instanceof SocketTimeoutException) {
            java.lang.Throwable cause = exc.getCause();
            if (cause == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.net.SocketTimeoutException");
            }
            exc2 = (SocketTimeoutException) cause;
        } else {
            java.util.Iterator it = C56379yDe.KWHzl(exc).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((java.lang.Throwable) next) instanceof SocketTimeoutException) {
                    break;
                }
            }
            if (!(next instanceof SocketTimeoutException)) {
                next = null;
            }
            exc2 = (SocketTimeoutException) next;
        }
        if (exc2 != null) {
            return HttpErrorCode.SOCKET_TIMEOUT;
        }
        if (!(exc instanceof SSLHandshakeException)) {
            if (exc.getCause() instanceof SSLHandshakeException) {
                java.lang.Throwable cause2 = exc.getCause();
                if (cause2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLHandshakeException");
                }
                exc = (SSLHandshakeException) cause2;
            } else {
                java.util.Iterator it2 = C56379yDe.KWHzl(exc).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (((java.lang.Throwable) next2) instanceof SSLHandshakeException) {
                        break;
                    }
                }
                exc = (SSLHandshakeException) (next2 instanceof SSLHandshakeException ? next2 : null);
            }
        }
        if (exc != null) {
            return HttpErrorCode.TLS_NEGOTIATION_ERROR;
        }
        return HttpErrorCode.SDK_UNKNOWN;
    }

    public static final boolean KWHzl(java.lang.Exception exc) {
        java.lang.String message;
        java.lang.Object next;
        java.lang.String message2 = exc.getMessage();
        if (message2 == null || !StringsKt__StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) "unexpected end of stream", false, 2, (java.lang.Object) null)) {
            return false;
        }
        java.lang.Throwable cause = exc.getCause();
        java.lang.Exception exc2 = cause instanceof java.lang.Exception ? (java.lang.Exception) cause : null;
        if (exc2 == null) {
            return false;
        }
        if (!(exc2 instanceof java.io.EOFException)) {
            if (exc2.getCause() instanceof java.io.EOFException) {
                java.lang.Throwable cause2 = exc2.getCause();
                if (cause2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type java.io.EOFException");
                }
                exc2 = (java.io.EOFException) cause2;
            } else {
                java.util.Iterator it = C56379yDe.KWHzl(exc2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((java.lang.Throwable) next) instanceof java.io.EOFException) {
                        break;
                    }
                }
                if (!(next instanceof java.io.EOFException)) {
                    next = null;
                }
                exc2 = (java.io.EOFException) next;
            }
        }
        java.io.EOFException eOFException = (java.io.EOFException) exc2;
        return (eOFException == null || (message = eOFException.getMessage()) == null || !StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "\\n not found: limit=0", false, 2, (java.lang.Object) null)) ? false : true;
    }

    public static final boolean copydefault(java.lang.Exception exc) {
        java.lang.String message;
        java.lang.Object next;
        if (!(exc instanceof SocketTimeoutException)) {
            if (exc.getCause() instanceof SocketTimeoutException) {
                java.lang.Throwable cause = exc.getCause();
                if (cause == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type java.net.SocketTimeoutException");
                }
                exc = (SocketTimeoutException) cause;
            } else {
                java.util.Iterator it = C56379yDe.KWHzl(exc).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((java.lang.Throwable) next) instanceof SocketTimeoutException) {
                        break;
                    }
                }
                exc = (SocketTimeoutException) (next instanceof SocketTimeoutException ? next : null);
            }
        }
        SocketTimeoutException socketTimeoutException = (SocketTimeoutException) exc;
        return (socketTimeoutException == null || (message = socketTimeoutException.getMessage()) == null || !StringsKt__StringsKt.AhwBna((java.lang.CharSequence) message, (java.lang.CharSequence) "connect", true)) ? false : true;
    }
}
