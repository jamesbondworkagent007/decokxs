package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.share.model.ShareMessageError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37639oxd extends wXX {
    public nKY copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final boolean OLrzqt = true;
    public final C59534zip KWHzl = new C59534zip();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.valueOf().setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = nKY.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        EZpvd();
    }

    private final void EZpvd() {
        java.util.List listAhwBna;
        C59534zip c59534zip = this.KWHzl;
        c59534zip.register(C37581owY.class, new C37648oxm());
        c59534zip.register(C37582owZ.class, new C37651oxp());
        c59534zip.register(ShareMessageError.class, new C37652oxq());
        nKY nky = this.copydefault;
        if (nky == null) {
            Intrinsics.gEmmrt("");
            nky = null;
        }
        RecyclerView recyclerView = nky.EZpvd;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.setAdapter(this.KWHzl);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (listAhwBna = arguments.getParcelableArrayList("KEY_LIST")) == null) {
            listAhwBna = yDY.AhwBna();
        }
        android.os.Bundle arguments2 = getArguments();
        boolean z = arguments2 != null ? arguments2.getBoolean("KEY_IS_ALL_FAIL") : false;
        java.lang.String string = getString(z ? C35399nuc.LoaderManager.validateAndPutInMap : C35399nuc.LoaderManager.UUsvzUhTFPAC);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.util.List<?> listAhwBna2 = yDY.AhwBna(new C37581owY(string), new C37582owZ(pTD.getFormattedQuantityString$default(this, z ? C35399nuc.Fragment.zLjUOn : C35399nuc.Fragment.AuCTelauCTel, listAhwBna.size(), (java.util.Map) null, 4, (java.lang.Object) null)));
        listAhwBna2.addAll(listAhwBna);
        this.KWHzl.setItems(listAhwBna2);
        this.KWHzl.notifyDataSetChanged();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(getString(C35399nuc.LoaderManager.getFieldNames));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.oxd$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oxd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C37639oxd KWHzl(boolean z, @NotNull java.util.List<ShareMessageError> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C37639oxd c37639oxd = new C37639oxd();
            c37639oxd.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_IS_ALL_FAIL", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("KEY_LIST", new java.util.ArrayList(list))));
            return c37639oxd;
        }
    }

    /* JADX INFO: renamed from: o.oxd$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C37639oxd KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C37639oxd c37639oxd) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c37639oxd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }
}
