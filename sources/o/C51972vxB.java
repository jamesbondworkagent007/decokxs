package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51972vxB extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final BigDecimal OLrzqt;
    public final BigDecimal copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    public C51972vxB(@NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(bigDecimal2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = bigDecimal;
        this.copydefault = bigDecimal2;
        this.EZpvd = str;
        this.AEQbTJ = true;
    }

    /* JADX INFO: renamed from: o.vxB$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vxB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        uQA uqaCopydefault = uQA.copydefault(getLayoutInflater(), constraintLayout, true);
        java.lang.String strEZpvd = C56033xvF.EZpvd(this.OLrzqt, "");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(C33069mpW.copydefault(C48033uCm.Fragment.DxnCrt, C56423yEv.EZpvd(C56390yDp.OLrzqt("leverage", strEZpvd))));
        for (int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableStringBuilder, strEZpvd, 0, false, 6, (java.lang.Object) null); iIndexOf$default != -1; iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableStringBuilder, strEZpvd, iIndexOf$default + 1, false, 4, (java.lang.Object) null)) {
            OLrzqt(spannableStringBuilder, iIndexOf$default, strEZpvd.length());
        }
        uqaCopydefault.OLrzqt.setText(spannableStringBuilder);
        uqaCopydefault.copydefault.setText(C56033xvF.fmtBotValueBySymbol$default(this.EZpvd, C33129mqd.gEmmrt(this.copydefault), null, true, null, false, null, null, null, null, null, 2036, null));
        uqaCopydefault.AEQbTJ.setText(C56033xvF.fmtBotValueBySymbol$default(this.EZpvd, C33129mqd.gEmmrt(this.copydefault.multiply(this.OLrzqt)), null, true, null, false, null, null, null, null, null, 2036, null));
    }

    public final void OLrzqt(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        int i3 = i2 + i;
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), i, i3, 0);
        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i, i3, 0);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.onCreate));
        wyf.setOnClickListener(new Activity(wyf, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vxB$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C51972vxB EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51972vxB c51972vxB) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c51972vxB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.dismiss();
            }
        }
    }
}
