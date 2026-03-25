package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C19595gIe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gvN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21203gvN extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final boolean AEQbTJ = true;
    public AbstractC16609enE KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.gvN$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gvN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C21203gvN copydefault(java.lang.String str, java.lang.String str2) {
            C21203gvN c21203gvN = new C21203gvN();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("url", str);
            bundle.putString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str2);
            c21203gvN.setArguments(bundle);
            return c21203gvN;
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC16609enE abstractC16609enEEZpvd = AbstractC16609enE.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        this.KWHzl = abstractC16609enEEZpvd;
        if (abstractC16609enEEZpvd == null) {
            Intrinsics.gEmmrt("");
            abstractC16609enEEZpvd = null;
        }
        AppCompatTextView appCompatTextView = abstractC16609enEEZpvd.KWHzl;
        android.os.Bundle arguments = getArguments();
        appCompatTextView.setText(arguments != null ? arguments.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) : null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AxsJAYaxsJAY));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.iFnJKK));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this, wyf));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new Activity(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return;
        }
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
    }

    /* JADX INFO: renamed from: o.gvN$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C21203gvN OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C21203gvN c21203gvN) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c21203gvN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
                C21203gvN c21203gvN = this.OLrzqt;
                android.os.Bundle arguments = c21203gvN.getArguments();
                java.lang.String string = arguments != null ? arguments.getString("url") : null;
                android.os.Bundle arguments2 = this.OLrzqt.getArguments();
                c21203gvN.AEQbTJ(string + (arguments2 != null ? arguments2.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) : null));
            }
        }
    }

    /* JADX INFO: renamed from: o.gvN$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ wYF EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C21203gvN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C21203gvN c21203gvN, wYF wyf) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c21203gvN;
            this.EZpvd = wyf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
                C19595gIe.StateListAnimator stateListAnimator = C19595gIe.Companion;
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.zLnOGN);
                android.os.Bundle arguments = this.copydefault.getArguments();
                java.lang.String string = arguments != null ? arguments.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) : null;
                if (string == null) {
                    string = "";
                }
                stateListAnimator.AEQbTJ(strAYXKKw, string).KWHzl(this.EZpvd.getContext());
            }
        }
    }
}
