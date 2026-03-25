package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.components.track.TrackChannel;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lTo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30308lTo extends wXX {
    public static final ActionBar Companion = new ActionBar(null);

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(4);
        wxq.valueOf().setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC31447luG abstractC31447luGOLrzqt = AbstractC31447luG.OLrzqt(android.view.LayoutInflater.from(getContext()));
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            abstractC31447luGOLrzqt.AEQbTJ.setVisibility(0);
            android.widget.TextView textView = abstractC31447luGOLrzqt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            android.widget.TextView textView2 = abstractC31447luGOLrzqt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            OLrzqt(arguments, "cash_withdraw_available_date", textView, textView2);
            android.widget.TextView textView3 = abstractC31447luGOLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            android.widget.TextView textView4 = abstractC31447luGOLrzqt.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            OLrzqt(arguments, "crypto_withdraw_available_date", textView3, textView4);
        }
        Intrinsics.checkNotNullExpressionValue(abstractC31447luGOLrzqt, "");
        constraintLayout.addView(abstractC31447luGOLrzqt.getRoot(), new ConstraintLayout.LayoutParams(-1, -1));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C32866mlf.onEvent$default("Simpletrade_OrderDetails_RiskBottomsheet_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    private final void OLrzqt(android.os.Bundle bundle, java.lang.String str, android.widget.TextView textView, android.widget.TextView textView2) {
        java.lang.Long lValueOf = java.lang.Long.valueOf(bundle.getLong(str, -1L));
        if (lValueOf.longValue() == -1) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            Date date = new Date(lValueOf.longValue());
            textView.setText(pTA.formatSimpleDate$default(date, null, 1, null));
            textView2.setText(pTA.formatSimpleTime$default(date, null, 1, null));
            textView2.setVisibility(0);
            return;
        }
        textView.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.awiJhF));
        textView2.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.lTo$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lTo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C30308lTo EZpvd(java.lang.Long l, java.lang.Long l2) {
            C30308lTo c30308lTo = new C30308lTo();
            android.os.Bundle bundle = new android.os.Bundle();
            if (l != null) {
                bundle.putLong("cash_withdraw_available_date", l.longValue());
            }
            if (l2 != null) {
                bundle.putLong("crypto_withdraw_available_date", l2.longValue());
            }
            c30308lTo.setArguments(bundle);
            return c30308lTo;
        }
    }
}
