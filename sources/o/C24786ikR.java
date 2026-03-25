package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.SimpleFaqArticle;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ikR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C24786ikR extends AbstractC24776ikH {
    public final C43316rmw AYXKKw = new C43316rmw();
    public hHE valueOf;
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.ikR$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ikR.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C24786ikR copydefault() {
            return new C24786ikR();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AEQbTJ().setVisibility(0);
        wxq.AYXKKw().setText(requireContext().getString(C23274hvD.Fragment.IMediaControllerCallback));
        wxq.AYXKKw().setContentDescription("web3_dex_savings_faq_title");
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.buildRccMetadata));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setContentDescription("web3_dex_savings_faq_ok_button");
        }
        wyf.setOnClickListener(new ActionBar(wyf, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        hHE hheKWHzl = hHE.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        this.valueOf = hheKWHzl;
        if (hheKWHzl != null && (recyclerView = hheKWHzl.copydefault) != null) {
            recyclerView.setContentDescription("web3_dex_savings_faq_container");
        }
        KWHzl();
    }

    public final void KWHzl() {
        RecyclerView recyclerView;
        hHE hhe = this.valueOf;
        if (hhe != null && (recyclerView = hhe.copydefault) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            this.AYXKKw.register(SimpleFaqArticle.class, new C21823hNq(false, "web3_dex_savings_faq_accordion_"));
            recyclerView.setAdapter(this.AYXKKw);
        }
        C43316rmw c43316rmw = this.AYXKKw;
        java.lang.String string = getString(C23274hvD.Fragment.RatingCompat1);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = getString(C23274hvD.Fragment.hasHeart);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        SimpleFaqArticle simpleFaqArticle = new SimpleFaqArticle(string2, string, false, 4, (DefaultConstructorMarker) null);
        java.lang.String string3 = getString(C23274hvD.Fragment.onCaptioningEnabledChanged);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        Unit unit = Unit.INSTANCE;
        c43316rmw.setItems(yDY.gEmmrt(simpleFaqArticle, new SimpleFaqArticle(getString(C23274hvD.Fragment.RatingCompatStyle) + "\n\n" + getString(C23274hvD.Fragment.RatingCompatStarStyle) + "\n\n" + getString(C23274hvD.Fragment.onEvent), string3, false, 4, (DefaultConstructorMarker) null)));
        this.AYXKKw.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.valueOf = null;
    }

    /* JADX INFO: renamed from: o.ikR$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C24786ikR copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C24786ikR c24786ikR) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c24786ikR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
