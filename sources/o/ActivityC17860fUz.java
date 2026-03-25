package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.defi.wallet.tee.converter.model.SmallAssetHiddenTokenBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fUz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC17860fUz extends AbstractActivityC33013moT {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final C59534zip KWHzl = new C59534zip();
    public C16432ejn OLrzqt;

    /* JADX INFO: renamed from: o.fUz$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fUz.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.util.ArrayList<SmallAssetHiddenTokenBean> arrayList) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC17860fUz.class);
            intent.putExtra("hidden_token_list", arrayList);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.clear();
        }
        super.onCreate(bundle);
        C16432ejn c16432ejnOLrzqt = C16432ejn.OLrzqt(getLayoutInflater());
        this.OLrzqt = c16432ejnOLrzqt;
        if (bundle != null) {
            finish();
            return;
        }
        C16432ejn c16432ejn = null;
        if (c16432ejnOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c16432ejnOLrzqt = null;
        }
        setContentView(c16432ejnOLrzqt.getRoot());
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("hidden_token_list");
        C16432ejn c16432ejn2 = this.OLrzqt;
        if (c16432ejn2 == null) {
            Intrinsics.gEmmrt("");
            c16432ejn2 = null;
        }
        C33537myN c33537myN = c16432ejn2.OLrzqt;
        android.widget.ImageView backImage = c33537myN.getBackImage();
        backImage.setOnClickListener(new ActionBar(backImage, 1000L, this));
        c33537myN.setAppBarTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onRemoveQueueItemAt));
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            C16432ejn c16432ejn3 = this.OLrzqt;
            if (c16432ejn3 == null) {
                Intrinsics.gEmmrt("");
                c16432ejn3 = null;
            }
            C55173xeu c55173xeu = c16432ejn3.KWHzl;
            c55173xeu.setVisibility(0);
            c55173xeu.setEmptyTypeImage(4);
            C16432ejn c16432ejn4 = this.OLrzqt;
            if (c16432ejn4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16432ejn = c16432ejn4;
            }
            c16432ejn.copydefault.setVisibility(8);
        } else {
            AEQbTJ();
            C16432ejn c16432ejn5 = this.OLrzqt;
            if (c16432ejn5 == null) {
                Intrinsics.gEmmrt("");
                c16432ejn5 = null;
            }
            c16432ejn5.copydefault.setVisibility(0);
            C16432ejn c16432ejn6 = this.OLrzqt;
            if (c16432ejn6 == null) {
                Intrinsics.gEmmrt("");
                c16432ejn6 = null;
            }
            c16432ejn6.KWHzl.setVisibility(8);
            C16432ejn c16432ejn7 = this.OLrzqt;
            if (c16432ejn7 == null) {
                Intrinsics.gEmmrt("");
                c16432ejn7 = null;
            }
            c16432ejn7.copydefault.setAdapter(this.KWHzl);
            C16432ejn c16432ejn8 = this.OLrzqt;
            if (c16432ejn8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16432ejn = c16432ejn8;
            }
            c16432ejn.copydefault.setLayoutManager(new LinearLayoutManager(this));
            C33064mpR.OLrzqt(this.KWHzl, parcelableArrayListExtra);
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fUE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC17860fUz.OLrzqt(this.EZpvd);
            }
        });
    }

    public static final void OLrzqt(ActivityC17860fUz activityC17860fUz) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17860fUz, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AEQbTJ() {
        this.KWHzl.register(SmallAssetHiddenTokenBean.class, new fUU());
    }

    /* JADX INFO: renamed from: o.fUz$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC17860fUz EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC17860fUz activityC17860fUz) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = activityC17860fUz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.finish();
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
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
