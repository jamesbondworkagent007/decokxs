package o;

import android.view.View;
import androidx.core.os.BundleKt;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC35548nxT;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nzQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC35651nzQ extends AbstractActivityC33044moy<AbstractC33855nIi> {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public final C59534zip AhwBna;
    public java.util.ArrayList<RelationInfo> EZpvd;
    public final int KWHzl = C35399nuc.Dialog.AkhnZx;
    public final java.util.ArrayList<java.lang.Object> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.KWHzl;
    }

    public ActivityC35651nzQ() {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        this.gEmmrt = arrayList;
        this.AhwBna = new C59534zip(arrayList);
    }

    /* JADX INFO: renamed from: o.nzQ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nzQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, java.util.ArrayList<RelationInfo> arrayList, java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC35651nzQ.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("info", arrayList), C56390yDp.OLrzqt("source", str)));
            return intent;
        }
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.EZpvd = getIntent().getParcelableArrayListExtra("info");
        this.AEQbTJ = getIntent().getStringExtra("source");
        KWHzl().copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.nzS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC35651nzQ.KWHzl(this.AEQbTJ, view);
            }
        });
        EZpvd();
        copydefault();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nzP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC35651nzQ.KWHzl(this.KWHzl);
            }
        });
    }

    public static final void KWHzl(ActivityC35651nzQ activityC35651nzQ, android.view.View view) {
        activityC35651nzQ.onBackPressed();
    }

    public static final void KWHzl(ActivityC35651nzQ activityC35651nzQ) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC35651nzQ, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void EZpvd() {
        KWHzl().AEQbTJ.setLayoutManager(C33047mpA.KWHzl(this));
        AEQbTJ(this.AhwBna);
        KWHzl().AEQbTJ.setAdapter(this.AhwBna);
    }

    /* JADX INFO: renamed from: o.nzQ$Application */
    public static final class Application extends C33653nAw {
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.C33653nAw, o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<nNW> c43312rms, RelationInfo relationInfo) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(relationInfo, "");
            super.onBindViewHolder(c43312rms, relationInfo);
            nNW nnw = (nNW) c43312rms.OLrzqt();
            nnw.djBIcL.setVisibility(8);
            wYK wyk = nnw.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(wyk, "");
            oGZ.OLrzqt(wyk);
        }

        @Override // o.C33653nAw
        public java.lang.String AEQbTJ() {
            return ActivityC35651nzQ.this.AEQbTJ;
        }

        @Override // o.C33653nAw
        public void copydefault(C43312rms<nNW> c43312rms, RelationInfo relationInfo) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(relationInfo, "");
            super.copydefault(c43312rms, relationInfo);
            ActivityC35651nzQ.this.startActivity(ActivityC35548nxT.ActionBar.createIntent$default(ActivityC35548nxT.Companion, ActivityC35651nzQ.this, "uid", relationInfo.getContactsId(), null, false, 16, null));
        }
    }

    private final void AEQbTJ(C59534zip c59534zip) {
        c59534zip.register(RelationInfo.class, new Application());
    }

    public final void copydefault() {
        java.util.ArrayList<RelationInfo> arrayList = this.EZpvd;
        if (arrayList != null) {
            this.gEmmrt.clear();
            this.gEmmrt.addAll(arrayList);
            this.AhwBna.notifyDataSetChanged();
        }
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
