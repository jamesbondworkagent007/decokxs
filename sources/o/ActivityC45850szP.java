package o;

import android.view.View;
import com.just.agentweb.AgentWeb;
import com.just.agentweb.IUrlLoader;
import com.just.agentweb.WebLifeCycle;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.web.WebActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC44038sBa;
import o.C52761wXj;
import o.C57262yfB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.szP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC45850szP extends WebActivity implements InterfaceC45845szK {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public AgentWeb KWHzl;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.szR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC45850szP.EZpvd(this.AEQbTJ);
        }
    });

    @Override // com.okinc.web.WebActivity
    public void copydefault(android.webkit.WebView webView) {
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void setRequestedOrientation(int i) {
    }

    /* JADX DEBUG: Possible override for method o.yfx.KWHzl()V */
    public final C33537myN KWHzl() {
        return (C33537myN) this.OLrzqt.getValue();
    }

    public static final C33537myN EZpvd(ActivityC45850szP activityC45850szP) {
        return (C33537myN) activityC45850szP.findViewById(C57262yfB.Activity.EZpvd);
    }

    private final java.lang.String hDKMBd() {
        return getIntent().getStringExtra("scenario");
    }

    /* JADX INFO: renamed from: o.szP$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.szP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ void openPage$default(ActionBar actionBar, android.content.Context context, android.os.Bundle bundle, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                num = null;
            }
            actionBar.EZpvd(context, bundle, num);
        }

        public final void EZpvd(@NotNull android.content.Context context, @NotNull android.os.Bundle bundle, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC45850szP.class);
            intent.putExtras(bundle);
            intent.setFlags(131072);
            if (num != null && (context instanceof android.app.Activity)) {
                ((android.app.Activity) context).startActivityForResult(intent, num.intValue());
            } else if (!(context instanceof android.app.Activity)) {
                intent.setFlags(268435456);
                context.startActivity(intent);
            } else {
                ((android.app.Activity) context).startActivity(intent);
            }
        }
    }

    @Override // com.okinc.web.WebActivity
    public void EZpvd(@NotNull AgentWeb agentWeb) {
        Intrinsics.checkNotNullParameter(agentWeb, "");
        super.EZpvd(agentWeb);
        this.KWHzl = agentWeb;
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        IUrlLoader urlLoader;
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("url");
        if (stringExtra != null) {
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                this.fvQaOB = stringExtra;
                java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) uzCIH()).toString();
                AgentWeb agentWeb = this.KWHzl;
                if (agentWeb == null || (urlLoader = agentWeb.getUrlLoader()) == null) {
                    return;
                }
                urlLoader.loadUrl(string);
            }
        }
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AEQbTJ();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.szT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC45850szP.KWHzl(this.EZpvd);
            }
        });
    }

    public static final void KWHzl(ActivityC45850szP activityC45850szP) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC45850szP, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ() {
        C33537myN c33537myNKWHzl = KWHzl();
        if (c33537myNKWHzl != null) {
            c33537myNKWHzl.setTitleVisible(8);
            c33537myNKWHzl.setSubDoImageResource(C52761wXj.TaskDescription.UJpkuA);
            c33537myNKWHzl.setSubDoVisible(0);
            c33537myNKWHzl.setSubDoListener(new View.OnClickListener() { // from class: o.szQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC45850szP.KWHzl(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void KWHzl(ActivityC45850szP activityC45850szP, android.view.View view) {
        ActivityC44038sBa.Application application = ActivityC44038sBa.Companion;
        android.content.Context applicationContext = activityC45850szP.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        activityC45850szP.startActivity(application.EZpvd(applicationContext, "article", activityC45850szP.hDKMBd()));
    }

    @Override // o.InterfaceC45845szK
    public void copydefault(@NotNull com.okinc.jsbridge.Message message, @NotNull InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        java.lang.String str = message.data;
        if (str != null) {
            CategorySlug[] categorySlugArrValues = CategorySlug.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (CategorySlug categorySlug : categorySlugArrValues) {
                if (categorySlug != CategorySlug.Unknown) {
                    arrayList.add(categorySlug);
                }
            }
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((CategorySlug) it.next()).getValue(), (java.lang.Object) str)) {
                        getIntent().putExtra("scenario", str);
                        C33537myN c33537myNKWHzl = KWHzl();
                        if (c33537myNKWHzl != null) {
                            c33537myNKWHzl.setSubDoVisible(0);
                            return;
                        }
                        return;
                    }
                }
            }
            C33537myN c33537myNKWHzl2 = KWHzl();
            if (c33537myNKWHzl2 != null) {
                c33537myNKWHzl2.setSubDoVisible(8);
            }
        }
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        WebLifeCycle webLifeCycle;
        super.onDestroy();
        AgentWeb agentWeb = this.KWHzl;
        if (agentWeb != null && (webLifeCycle = agentWeb.getWebLifeCycle()) != null) {
            webLifeCycle.onDestroy();
        }
        this.KWHzl = null;
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
