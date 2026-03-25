package o;

import android.view.View;
import androidx.core.content.IntentCompat;
import com.okinc.business.dex.api.bean.TokenBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.hPc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC21863hPc extends AbstractActivityC33013moT {
    public C23427hxy EZpvd;
    public TokenBase OLrzqt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.hPc$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hPc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        android.widget.ImageView imageView;
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        this.OLrzqt = (TokenBase) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "token_base", TokenBase.class));
        C23427hxy c23427hxyCopydefault = C23427hxy.copydefault(getLayoutInflater());
        this.EZpvd = c23427hxyCopydefault;
        if (c23427hxyCopydefault != null) {
            setContentView(c23427hxyCopydefault.getRoot());
        }
        C23427hxy c23427hxy = this.EZpvd;
        if (c23427hxy != null && (imageView = c23427hxy.KWHzl) != null) {
            imageView.setOnClickListener(new ActionBar(imageView, 1000L, this));
        }
        if (c23427hxy != null && (c52794wYp2 = c23427hxy.copydefault) != null) {
            c52794wYp2.setOnClickListener(new TaskDescription(c52794wYp2, 1000L, this));
        }
        if (c23427hxy != null && (c52794wYp = c23427hxy.AEQbTJ) != null) {
            c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.hPi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC21863hPc.KWHzl(this.KWHzl);
            }
        });
    }

    public static final void KWHzl(ActivityC21863hPc activityC21863hPc) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC21863hPc, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        TokenBase tokenBase = this.OLrzqt;
        if (tokenBase != null) {
            C21847hOn.KWHzl(tokenBase.getTokenSymbol(), tokenBase.getTokenContractAddress(), tokenBase.getChainId());
        }
        ((xWO) C43251rlk.copydefault(xWO.class)).EZpvd("DefiWeb3CreateWalletActivity", new Function1() { // from class: o.hPf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21863hPc.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        });
    }

    public static final Unit OLrzqt(ActivityC21863hPc activityC21863hPc, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "from_cefi")) {
            hOS.KWHzl.copydefault(activityC21863hPc, activityC21863hPc.OLrzqt, false);
        }
        activityC21863hPc.finish();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((xWO) C43251rlk.copydefault(xWO.class)).EZpvd("DefiWeb3CreateWalletActivity");
    }

    /* JADX INFO: renamed from: o.hPc$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC21863hPc OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC21863hPc activityC21863hPc) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = activityC21863hPc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.hPc$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC21863hPc KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC21863hPc activityC21863hPc) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = activityC21863hPc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                hOS hos = hOS.KWHzl;
                androidx.fragment.app.FragmentManager supportFragmentManager = this.KWHzl.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                hOS.showCreateWallet$default(hos, supportFragmentManager, this.KWHzl, null, null, 12, null);
                TokenBase tokenBase = this.KWHzl.OLrzqt;
                if (tokenBase != null) {
                    C21847hOn.AEQbTJ(tokenBase.getTokenSymbol(), tokenBase.getTokenContractAddress(), tokenBase.getChainId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.hPc$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC21863hPc OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC21863hPc activityC21863hPc) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = activityC21863hPc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                hOS hos = hOS.KWHzl;
                ActivityC21863hPc activityC21863hPc = this.OLrzqt;
                hOS.goDetailPage$default(hos, activityC21863hPc, activityC21863hPc.OLrzqt, false, null, null, 28, null);
                TokenBase tokenBase = this.OLrzqt.OLrzqt;
                if (tokenBase != null) {
                    C21847hOn.copydefault(tokenBase.getTokenSymbol(), tokenBase.getTokenContractAddress(), tokenBase.getChainId());
                }
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
