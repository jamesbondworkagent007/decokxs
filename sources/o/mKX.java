package o;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class mKX extends mKV {
    public Activity AEQbTJ;
    public RecyclerView EZpvd;
    public final java.util.ArrayList<mMT> copydefault = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mKV
    public int AEQbTJ() {
        return C31976mKx.Application.OLrzqt;
    }

    @Override // o.mKV
    public void AEQbTJ(android.os.Bundle bundle) {
        this.EZpvd = (RecyclerView) findViewById(C31976mKx.Activity.ODXsMY);
    }

    @Override // o.mKV
    public void OLrzqt() throws java.lang.Throwable {
        android.content.pm.PackageInfo packageInfo = getBaseContext().getPackageManager().getPackageInfo(getPackageName(), 64);
        C6797aWE c6797aWE = C6797aWE.KWHzl;
        android.content.Context baseContext = getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "");
        java.lang.String strCopydefault = c6797aWE.copydefault(baseContext);
        pUU.EZpvd("ApkFingerprintActivity", strCopydefault);
        this.copydefault.add(new mMT("App PackageName", C34703nhO.KWHzl(getApplicationContext())));
        this.copydefault.add(new mMT("Device Fingerprint", C6799aWG.EZpvd(strCopydefault)));
        this.copydefault.add(new mMT("MD5", c6797aWE.AEQbTJ(packageInfo.signatures)));
        this.copydefault.add(new mMT("SHA1", c6797aWE.OLrzqt(packageInfo.signatures)));
        this.copydefault.add(new mMT("SHA256", c6797aWE.copydefault(packageInfo.signatures)));
        this.copydefault.add(new mMT("SHA256-2", xVZ.OLrzqt()));
        android.content.pm.Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            java.util.Iterator<T> it = c6797aWE.KWHzl(signatureArr).iterator();
            while (it.hasNext()) {
                for (Map.Entry entry : ((java.util.Map) it.next()).entrySet()) {
                    this.copydefault.add(new mMT((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue()));
                }
            }
        }
        RecyclerView recyclerView = this.EZpvd;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.AEQbTJ = new Activity(this, this);
        RecyclerView recyclerView3 = this.EZpvd;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
            recyclerView3 = null;
        }
        recyclerView3.setAdapter(this.AEQbTJ);
        RecyclerView recyclerView4 = this.EZpvd;
        if (recyclerView4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView2 = recyclerView4;
        }
        recyclerView2.addItemDecoration(new mPA(ContextCompat.getColor(this, C31976mKx.TaskDescription.AEQbTJ), (int) getResources().getDimension(C31976mKx.StateListAnimator.AEQbTJ)));
        Activity activity = this.AEQbTJ;
        Intrinsics.copydefault(activity);
        activity.OLrzqt(this.copydefault);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class Activity extends AbstractC8041avJ<mMT> {
        public final /* synthetic */ mKX DbNXlk;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull mKX mkx, android.content.Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
            this.DbNXlk = mkx;
        }

        @Override // o.AbstractC8041avJ
        public AbstractC8033avB<?> KWHzl(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new ActionBar(this, viewGroup);
        }

        public final class ActionBar extends AbstractC8033avB<mMT> {
            public final /* synthetic */ Activity AEQbTJ;
            public android.widget.TextView EZpvd;
            public android.widget.TextView KWHzl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull Activity activity, android.view.ViewGroup viewGroup) {
                super(viewGroup, C31976mKx.Application.zsXlph);
                Intrinsics.checkNotNullParameter(viewGroup, "");
                this.AEQbTJ = activity;
                android.view.View viewAEQbTJ = AEQbTJ(C31976mKx.Activity.RKcVTr);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ, "");
                this.EZpvd = (android.widget.TextView) viewAEQbTJ;
                android.view.View viewAEQbTJ2 = AEQbTJ(C31976mKx.Activity.DGUQLI);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ2, "");
                this.KWHzl = (android.widget.TextView) viewAEQbTJ2;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)V */
            @Override // o.AbstractC8033avB
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public void OLrzqt(mMT mmt) {
                super.OLrzqt(mmt);
                android.widget.TextView textView = this.EZpvd;
                Intrinsics.copydefault(mmt);
                textView.setText(mmt.copydefault());
                this.KWHzl.setText(mmt.KWHzl());
            }
        }
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
