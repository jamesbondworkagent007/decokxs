package com.geetest.captcha;

import android.content.Context;
import android.util.Pair;
import com.geetest.captcha.GTCaptcha4Client;
import com.geetest.captcha.a0;
import com.geetest.captcha.utils.LogUtils;
import com.geetest.captcha.views.GTC4WebView;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import o.C56433yFe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class m {
    public static long e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.geetest.captcha.b f370a;
    public GTCaptcha4Client.OnSuccessListener b;
    public GTCaptcha4Client.OnFailureListener c;
    public GTCaptcha4Client.OnWebViewShowListener d;

    public static final class a extends Lambda implements Function0<Unit> {
        final /* synthetic */ Context $context;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            File externalFilesDir = this.$context.getApplicationContext().getExternalFilesDir(null);
            z.f388a = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class b {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static Pair a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            try {
                new GTC4WebView(context).destroy();
                return new Pair(Boolean.TRUE, null);
            } catch (Exception e) {
                e.printStackTrace();
                LogUtils.f375a.release("The device does not support WebViews, error message: " + e.getMessage());
                return new Pair(Boolean.FALSE, e.getMessage());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f370a = new com.geetest.captcha.b(context);
        try {
            C56433yFe.thread$default(false, false, null, null, 0, new a(context), 31, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        j.a(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(@NotNull String str, GTCaptcha4Config gTCaptcha4Config) {
        Intrinsics.checkNotNullParameter(str, "");
        com.geetest.captcha.b bVar = this.f370a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(str, "");
        bVar.b = str;
        com.geetest.captcha.b bVar2 = this.f370a;
        bVar2.f = gTCaptcha4Config;
        bVar2.h = new w();
        bVar2.i = new b0();
        w wVar = bVar2.h;
        x xVar = null;
        if (wVar == null) {
            Intrinsics.gEmmrt("");
            wVar = null;
        }
        b0 b0Var = bVar2.i;
        if (b0Var == null) {
            Intrinsics.gEmmrt("");
            b0Var = null;
        }
        wVar.f372a = b0Var;
        Context context = bVar2.f359a;
        String str2 = bVar2.b;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        }
        GTCaptcha4Config gTCaptcha4Config2 = bVar2.f;
        Intrinsics.checkNotNullParameter(str2, "");
        d dVar = new d();
        dVar.f363a = str2;
        if (gTCaptcha4Config2 != null) {
            dVar.c = gTCaptcha4Config2.isDebug();
            String html = gTCaptcha4Config2.getHtml();
            Intrinsics.checkNotNullExpressionValue(html, "");
            dVar.b = html;
            dVar.d = gTCaptcha4Config2.getLanguage();
            dVar.e = gTCaptcha4Config2.getApiServers();
            dVar.f = gTCaptcha4Config2.getStaticServers();
            dVar.h = gTCaptcha4Config2.isCanceledOnTouchOutside();
            dVar.i = gTCaptcha4Config2.isGTC4ViewHidden();
            dVar.g = gTCaptcha4Config2.getParams();
            dVar.j = gTCaptcha4Config2.getTimeOut();
            dVar.k = gTCaptcha4Config2.getBackgroundColor();
            dVar.l = gTCaptcha4Config2.getDialogStyle();
        }
        if (StringsKt__StringsKt.fARcdN((CharSequence) dVar.b)) {
            dVar.b = "file:///android_asset/gt4-index.html";
        }
        x xVar2 = new x(context, dVar);
        bVar2.g = xVar2;
        xVar2.a(a0.a.FLOWING);
        x xVar3 = bVar2.g;
        if (xVar3 == null) {
            Intrinsics.gEmmrt("");
            xVar3 = null;
        }
        xVar3.a(a0.NONE);
        x xVar4 = bVar2.g;
        if (xVar4 == null) {
            Intrinsics.gEmmrt("");
            xVar4 = null;
        }
        GTCaptcha4Config gTCaptcha4Config3 = bVar2.f;
        xVar4.e = new e(gTCaptcha4Config3 != null ? gTCaptcha4Config3.getDialogShowListener() : null);
        w wVar2 = bVar2.h;
        if (wVar2 == null) {
            Intrinsics.gEmmrt("");
            wVar2 = null;
        }
        x xVar5 = bVar2.g;
        if (xVar5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            xVar = xVar5;
        }
        wVar2.b(xVar);
    }
}
