package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vAp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50065vAp extends wXX {
    public RecyclerView AEQbTJ;

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.InspectablePropertyEnumEntry));
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        RecyclerView recyclerView = (RecyclerView) getCustomLayoutInflater().inflate(C48033uCm.Activity.OHqIaq, (android.view.ViewGroup) constraintLayout, true).findViewById(C48033uCm.Application.PlaybackStateCompatCustomActionBuilder);
        this.AEQbTJ = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.AEQbTJ;
        if (recyclerView2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new vBD(C33070mpX.AYXKKw(C55688xof.Application.addOnConfigurationChangedListener), C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsStartIntentSenderForResult)));
            arrayList.add(new vBD(C33070mpX.AYXKKw(C55688xof.Application.lambdanew1), C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsTakePicture)));
            arrayList.add(new vBD(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsStartActivityForResultCompanion), C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsRequestMultiplePermissionsCompanion)));
            arrayList.add(new vBD(C33070mpX.AYXKKw(C55688xof.Application.AnyRes), C33070mpX.AYXKKw(C55688xof.Application.next)));
            arrayList.add(new vBD(C33070mpX.AYXKKw(C55688xof.Application.AnyThread), C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsTakePicturePreview)));
            arrayList.add(new vBD(C33070mpX.AYXKKw(C55688xof.Application.getToolbarNavigationClickListener), C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsStartIntentSenderForResultCompanion)));
            recyclerView2.setAdapter(new C50064vAo(arrayList));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C57680ymw.KWHzl(this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.vAp$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C50065vAp EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50065vAp c50065vAp) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c50065vAp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
