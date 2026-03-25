package o;

import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C28102kOz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ActivityC57550ykY extends AbstractActivityC33041mov {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public kOS AEQbTJ;

    /* JADX INFO: renamed from: o.ykY$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ykY.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void KWHzl(@NotNull android.content.Context context, boolean z, java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC57550ykY.class);
            intent.putExtra("isFromLanding", z);
            intent.putExtra("errorMessage", str);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean booleanExtra = getIntent().getBooleanExtra("isFromLanding", false);
        if (booleanExtra) {
            getDelegate().setLocalNightMode(2);
        }
        super.onCreate(bundle);
        AEQbTJ();
        AEQbTJ(booleanExtra);
        EZpvd(booleanExtra);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.ylc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC57550ykY.KWHzl(this.copydefault);
            }
        });
    }

    public static final void KWHzl(ActivityC57550ykY activityC57550ykY) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC57550ykY, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ() {
        kOS kosEZpvd = kOS.EZpvd(getLayoutInflater());
        this.AEQbTJ = kosEZpvd;
        if (kosEZpvd == null) {
            Intrinsics.gEmmrt("");
            kosEZpvd = null;
        }
        setContentView(kosEZpvd.getRoot());
    }

    public final void AEQbTJ(boolean z) {
        int i = (z || C33492mxV.OLrzqt()) ? C28102kOz.ActionBar.copydefault : C28102kOz.ActionBar.AEQbTJ;
        kOS kos = this.AEQbTJ;
        if (kos == null) {
            Intrinsics.gEmmrt("");
            kos = null;
        }
        kos.AEQbTJ.setImageResource(i);
    }

    public final void EZpvd(final boolean z) {
        java.lang.String stringExtra = getIntent().getStringExtra("errorMessage");
        kOS kos = this.AEQbTJ;
        kOS kos2 = null;
        if (kos == null) {
            Intrinsics.gEmmrt("");
            kos = null;
        }
        kos.valueOf.setText(OLrzqt(stringExtra));
        kOS kos3 = this.AEQbTJ;
        if (kos3 == null) {
            Intrinsics.gEmmrt("");
            kos3 = null;
        }
        kos3.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.ylb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC57550ykY.AEQbTJ(this.AEQbTJ, view);
            }
        });
        kOS kos4 = this.AEQbTJ;
        if (kos4 == null) {
            Intrinsics.gEmmrt("");
            kos4 = null;
        }
        kos4.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.yla
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC57550ykY.copydefault(this.OLrzqt, view);
            }
        });
        kOS kos5 = this.AEQbTJ;
        if (kos5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            kos2 = kos5;
        }
        kos2.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.yle
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC57550ykY.KWHzl(this.OLrzqt, z, view);
            }
        });
    }

    public static final void AEQbTJ(ActivityC57550ykY activityC57550ykY, android.view.View view) {
        activityC57550ykY.finish();
    }

    public static final void copydefault(ActivityC57550ykY activityC57550ykY, android.view.View view) {
        activityC57550ykY.finish();
    }

    public static final void KWHzl(ActivityC57550ykY activityC57550ykY, boolean z, android.view.View view) {
        activityC57550ykY.KWHzl(z);
    }

    private final java.lang.String OLrzqt(java.lang.String str) {
        return (str == null || str.length() == 0) ? C33070mpX.AYXKKw(C28102kOz.Fragment.fetchVPNInfo) : str;
    }

    public final void KWHzl(boolean z) {
        if (z) {
            copydefault();
        } else {
            KWHzl();
        }
        finish();
    }

    public final void copydefault() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        if (interfaceC7298ahGKWHzl != null) {
            interfaceC7298ahGKWHzl.AEQbTJ("growthOtherWaysToJoinVip", null, linkedHashMap);
        }
    }

    public final void KWHzl() {
        kOH koh = (kOH) C43251rlk.OLrzqt(kOH.class);
        if (koh != null) {
            koh.OLrzqt(this, true);
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
