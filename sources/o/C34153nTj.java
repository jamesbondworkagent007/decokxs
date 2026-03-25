package o;

import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nTj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C34153nTj extends AbstractC34147nTd {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public C33875nJb AYXKKw;

    /* JADX INFO: renamed from: o.nTj$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupBillingType.values().length];
            try {
                iArr[GroupBillingType.MONTHLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[GroupBillingType.YEARLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        java.lang.String string = getString(C35399nuc.LoaderManager.isScanInProgress);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    @Override // o.AbstractC52780wYb, o.wXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        GroupBillingType groupBillingType;
        java.lang.String string = "";
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AYXKKw = C33875nJb.OLrzqt(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        if (Build.VERSION.SDK_INT >= 33) {
            android.os.Bundle arguments = getArguments();
            groupBillingType = arguments != null ? (GroupBillingType) arguments.getParcelable("group_billing_type", GroupBillingType.class) : null;
        } else {
            android.os.Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                groupBillingType = (GroupBillingType) arguments2.getParcelable("group_billing_type");
            }
        }
        android.os.Bundle arguments3 = getArguments();
        java.lang.String string2 = arguments3 != null ? arguments3.getString(OtcExtraKeys.AMOUNT) : null;
        if (string2 == null) {
            string2 = "";
        }
        android.os.Bundle arguments4 = getArguments();
        java.lang.String string3 = arguments4 != null ? arguments4.getString("currency") : null;
        if (string3 == null) {
            string3 = "";
        }
        android.os.Bundle arguments5 = getArguments();
        java.lang.String string4 = arguments5 != null ? arguments5.getString("payment_due") : null;
        if (string4 == null) {
            string4 = "";
        }
        android.os.Bundle arguments6 = getArguments();
        java.lang.String string5 = arguments6 != null ? arguments6.getString("last_payment") : null;
        if (string5 == null) {
            string5 = "";
        }
        C33875nJb c33875nJb = this.AYXKKw;
        if (c33875nJb != null) {
            android.widget.TextView textView = c33875nJb.gEmmrt;
            int i = groupBillingType == null ? -1 : StateListAnimator.AEQbTJ[groupBillingType.ordinal()];
            if (i == 1) {
                string = getString(C35399nuc.LoaderManager.OqhRBMiKdSzF);
            } else if (i == 2) {
                string = getString(C35399nuc.LoaderManager.OqhRBM);
            }
            textView.setText(string);
            c33875nJb.AEQbTJ.setText(string2);
            c33875nJb.AhwBna.setText(string3);
            c33875nJb.AYXKKw.setText(string4);
            c33875nJb.valueOf.setText(string5);
        }
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        Intrinsics.checkNotNullParameter(c54953xam, "");
        wYK wyk = c54953xam.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(getString(C35399nuc.LoaderManager.getFieldNames));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.nTj$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nTj.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C34153nTj AEQbTJ(GroupBillingType groupBillingType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            C34153nTj c34153nTj = new C34153nTj();
            c34153nTj.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("group_billing_type", groupBillingType), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str), C56390yDp.OLrzqt("currency", str2), C56390yDp.OLrzqt("payment_due", str3), C56390yDp.OLrzqt("last_payment", str4)));
            return c34153nTj;
        }
    }

    /* JADX INFO: renamed from: o.nTj$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C34153nTj KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C34153nTj c34153nTj) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c34153nTj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.dismiss();
            }
        }
    }
}
