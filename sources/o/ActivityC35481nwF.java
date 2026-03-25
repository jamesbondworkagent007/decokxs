package o;

import android.content.SharedPreferences;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.chatsettings.AutoDownloadOption;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nwF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC35481nwF extends AbstractActivityC35500nwY<AbstractC33863nIq> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public AutoDownloadOption AEQbTJ = AutoDownloadOption.WIFI;
    public C35482nwG KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return C35399nuc.Dialog.ejfBZ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC35500nwY, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.AEQbTJ = EZpvd();
        AbstractC33863nIq abstractC33863nIq = (AbstractC33863nIq) KWHzl();
        abstractC33863nIq.KWHzl.getTitle().setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.iluEmO));
        abstractC33863nIq.KWHzl.getTitle().setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
        android.widget.ImageView backImage = abstractC33863nIq.KWHzl.getBackImage();
        if (backImage != null) {
            ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart((int) (24 * getResources().getDisplayMetrics().density));
                backImage.setLayoutParams(layoutParams2);
            }
        }
        gEmmrt();
        OLrzqt();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nwH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC35481nwF.AEQbTJ(this.OLrzqt);
            }
        });
    }

    public static final void AEQbTJ(ActivityC35481nwF activityC35481nwF) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC35481nwF, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        this.KWHzl = new C35482nwG(this.AEQbTJ, new Function1() { // from class: o.nwJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC35481nwF.OLrzqt(this.EZpvd, (AutoDownloadOption) obj);
            }
        });
        RecyclerView recyclerView = ((AbstractC33863nIq) KWHzl()).EZpvd;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C35482nwG c35482nwG = this.KWHzl;
        if (c35482nwG == null) {
            Intrinsics.gEmmrt("");
            c35482nwG = null;
        }
        recyclerView.setAdapter(c35482nwG);
        recyclerView.setItemAnimator(null);
    }

    public static final Unit OLrzqt(ActivityC35481nwF activityC35481nwF, AutoDownloadOption autoDownloadOption) {
        Intrinsics.checkNotNullParameter(autoDownloadOption, "");
        activityC35481nwF.AEQbTJ = autoDownloadOption;
        activityC35481nwF.AEQbTJ(autoDownloadOption);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt() {
        OKReminder oKReminder = ((AbstractC33863nIq) KWHzl()).copydefault;
        oKReminder.setMessage(C33070mpX.AYXKKw(C35399nuc.LoaderManager.zhUgOk));
        oKReminder.setStyle(0);
        oKReminder.setCloseIconVisibility(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(AutoDownloadOption autoDownloadOption) {
        java.lang.String strKWHzl = C44157sFk.KWHzl();
        SharedPreferences.Editor editorEdit = ((AbstractC33863nIq) KWHzl()).getRoot().getContext().getSharedPreferences("auto_download_prefs", 0).edit();
        editorEdit.putString("auto_download_" + strKWHzl, autoDownloadOption.name());
        editorEdit.apply();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Possible override for method o.nwY.EZpvd()V */
    /* JADX WARN: Multi-variable type inference failed */
    public final AutoDownloadOption EZpvd() {
        java.lang.String strKWHzl = C44157sFk.KWHzl();
        java.lang.String string = ((AbstractC33863nIq) KWHzl()).getRoot().getContext().getSharedPreferences("auto_download_prefs", 0).getString("auto_download_" + strKWHzl, "WIFI");
        try {
            return AutoDownloadOption.valueOf(string != null ? string : "WIFI");
        } catch (java.lang.IllegalArgumentException unused) {
            return AutoDownloadOption.WIFI;
        }
    }

    /* JADX INFO: renamed from: o.nwF$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nwF.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC35481nwF.class);
        }
    }

    @Override // o.AbstractActivityC35500nwY, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC35500nwY, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC35500nwY, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC35500nwY, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
