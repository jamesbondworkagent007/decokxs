package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import com.just.agentweb.DefaultWebClient;
import com.okinc.core.util.SPUtils;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C38413pXw;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pXw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C38413pXw implements Interceptor {
    public static java.lang.String KWHzl;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.pXy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C38413pXw.OLrzqt();
        }
    });
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;

    /* JADX INFO: renamed from: o.pXw$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pXw.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static final void AEQbTJ(android.content.Context context, final Function1<? super java.lang.String, Unit> function1) {
            final OKEditText oKEditText = new OKEditText(context, null, 0, 6, null);
            oKEditText.setTextSize(C55298xhM.px2sp$default(C55298xhM.dp$default(14, (android.content.Context) null, 1, (java.lang.Object) null), (android.content.Context) null, 1, (java.lang.Object) null));
            oKEditText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            new AlertDialog.Builder(context).setTitle("Input mocking server host").setView(oKEditText).setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: o.pXv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    C38413pXw.Application.AEQbTJ(oKEditText, function1, dialogInterface, i);
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: o.pXu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    C38413pXw.Application.copydefault(dialogInterface, i);
                }
            }).create().show();
        }

        public static final void AEQbTJ(OKEditText oKEditText, Function1 function1, android.content.DialogInterface dialogInterface, int i) {
            function1.invoke(java.lang.String.valueOf(oKEditText.getText()));
        }

        public static final void copydefault(android.content.DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }

        public final void copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            AEQbTJ(context, new Function1() { // from class: o.pXC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38413pXw.Application.EZpvd((java.lang.String) obj);
                }
            });
        }

        public static final Unit EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C55326xho.toast$default("😀\n" + str + "\nConfigured，restart to take effect", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            C38413pXw.Companion.KWHzl(StringsKt__StringsKt.KWHzl(StringsKt__StringsKt.KWHzl(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString(), (java.lang.CharSequence) DefaultWebClient.HTTP_SCHEME), (java.lang.CharSequence) DefaultWebClient.HTTPS_SCHEME));
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.String str) {
            C38413pXw.KWHzl = str;
            SPUtils.put("market_mock_host", str);
        }

        public final java.lang.String EZpvd() {
            if (C38413pXw.KWHzl != null) {
                return C38413pXw.KWHzl;
            }
            java.lang.String string = SPUtils.getString("market_mock_host", null);
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
                string = null;
            }
            C38413pXw.Companion.KWHzl(string);
            return string;
        }
    }

    public final OkHttpClient copydefault() {
        return (OkHttpClient) this.AEQbTJ.getValue();
    }

    public static final OkHttpClient OLrzqt() {
        return new OkHttpClient.Builder().build();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        java.lang.String strEZpvd = Companion.EZpvd();
        if (strEZpvd == null) {
            return chain.proceed(chain.request());
        }
        Response responseExecute = copydefault().newCall(new Request.Builder().url(chain.request().url().newBuilder().host(strEZpvd).build()).build()).execute();
        if (responseExecute.isSuccessful()) {
            return responseExecute.newBuilder().headers(chain.request().headers()).build();
        }
        return chain.proceed(chain.request());
    }
}
