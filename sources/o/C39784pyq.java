package o;

import com.okinc.kline.ui.unlock.ui.model.UnlockTokenStageDataVo;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pyq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39784pyq {
    public static final void AEQbTJ(@NotNull C36110oPq c36110oPq, @NotNull UnlockTokenStageDataVo unlockTokenStageDataVo) {
        Intrinsics.checkNotNullParameter(c36110oPq, "");
        Intrinsics.checkNotNullParameter(unlockTokenStageDataVo, "");
        c36110oPq.fetchVPNInfo.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.PUZqN));
        c36110oPq.AEQbTJ.setText(C39710pxV.KWHzl(unlockTokenStageDataVo));
        c36110oPq.isConnected.setText(C39710pxV.OLrzqt(unlockTokenStageDataVo));
        c36110oPq.AuCTel.setText(C39710pxV.EZpvd(unlockTokenStageDataVo));
        c36110oPq.copydefault.setText(C39710pxV.copydefault(unlockTokenStageDataVo));
        c36110oPq.AYXKKw.setText(C39710pxV.AEQbTJ(unlockTokenStageDataVo));
        java.lang.Object tag = c36110oPq.getRoot().getTag(C35964oKf.StateListAnimator.hwkNQP);
        android.os.CountDownTimer countDownTimer = tag instanceof android.os.CountDownTimer ? (android.os.CountDownTimer) tag : null;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        long jAEQbTJ = unlockTokenStageDataVo.AEQbTJ().AEQbTJ() - java.lang.System.currentTimeMillis();
        if (unlockTokenStageDataVo.AEQbTJ().KWHzl() && jAEQbTJ > 0) {
            StateListAnimator stateListAnimator = new StateListAnimator(unlockTokenStageDataVo, c36110oPq, unlockTokenStageDataVo.AEQbTJ().AEQbTJ() - java.lang.System.currentTimeMillis());
            stateListAnimator.start();
            c36110oPq.getRoot().setTag(C35964oKf.StateListAnimator.hwkNQP, stateListAnimator);
        }
        if (jAEQbTJ >= 0) {
            android.widget.TextView textView = c36110oPq.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            android.widget.LinearLayout linearLayout = c36110oPq.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            OLrzqt(c36110oPq, EZpvd(unlockTokenStageDataVo.AEQbTJ().AEQbTJ()));
            return;
        }
        android.widget.LinearLayout linearLayout2 = c36110oPq.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(8);
        int iOLrzqt = OLrzqt(unlockTokenStageDataVo.AEQbTJ().AEQbTJ());
        android.widget.TextView textView2 = c36110oPq.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        if (iOLrzqt == 1) {
            android.widget.TextView textView3 = c36110oPq.valueOf;
            android.content.Context context = c36110oPq.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView3.setText(pTD.EZpvd(context, C35964oKf.LoaderManager.KWHzl, iOLrzqt, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iOLrzqt)))));
            return;
        }
        android.widget.TextView textView4 = c36110oPq.valueOf;
        android.content.Context context2 = c36110oPq.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView4.setText(pTD.EZpvd(context2, C35964oKf.LoaderManager.KWHzl, iOLrzqt, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iOLrzqt)))));
    }

    public static final void OLrzqt(C36110oPq c36110oPq, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str = map.get("days");
        if (str == null) {
            str = "0";
        }
        java.lang.String str2 = map.get("hours");
        if (str2 == null) {
            str2 = "0";
        }
        java.lang.String str3 = map.get("minutes");
        if (str3 == null) {
            str3 = "0";
        }
        java.lang.String str4 = map.get("seconds");
        java.lang.String str5 = str4 != null ? str4 : "0";
        c36110oPq.AhwBna.setText(str);
        c36110oPq.djBIcL.setText(str2);
        c36110oPq.gEmmrt.setText(str3);
        c36110oPq.DbNXlk.setText(str5);
        android.widget.LinearLayout linearLayout = c36110oPq.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str) ? 0 : 8);
        android.widget.TextView textView = c36110oPq.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str) ^ true ? 0 : 8);
    }

    /* JADX INFO: renamed from: o.pyq$StateListAnimator */
    public static final class StateListAnimator extends android.os.CountDownTimer {
        public final /* synthetic */ UnlockTokenStageDataVo EZpvd;
        public final /* synthetic */ C36110oPq copydefault;

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(UnlockTokenStageDataVo unlockTokenStageDataVo, C36110oPq c36110oPq, long j) {
            super(j, 1000L);
            this.EZpvd = unlockTokenStageDataVo;
            this.copydefault = c36110oPq;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            C39784pyq.OLrzqt(this.copydefault, C39784pyq.EZpvd(this.EZpvd.AEQbTJ().AEQbTJ()));
        }
    }

    public static final void AEQbTJ(@NotNull C36110oPq c36110oPq) {
        Intrinsics.checkNotNullParameter(c36110oPq, "");
        java.lang.Object tag = c36110oPq.getRoot().getTag(C35964oKf.StateListAnimator.hwkNQP);
        android.os.CountDownTimer countDownTimer = tag instanceof android.os.CountDownTimer ? (android.os.CountDownTimer) tag : null;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c36110oPq.getRoot().setTag(C35964oKf.StateListAnimator.hwkNQP, null);
    }

    public static final java.util.Map<java.lang.String, java.lang.String> EZpvd(long j) {
        long jCopydefault = C56548yJl.copydefault(j - java.lang.System.currentTimeMillis(), 0L);
        if (jCopydefault == 0) {
            return C56424yEw.gEmmrt(C56390yDp.OLrzqt("days", ""), C56390yDp.OLrzqt("hours", KWHzl("")), C56390yDp.OLrzqt("minutes", KWHzl("")), C56390yDp.OLrzqt("seconds", KWHzl("")));
        }
        long j2 = jCopydefault / ((long) 1000);
        long j3 = 60;
        long j4 = jCopydefault / ((long) 60000);
        java.lang.String strValueOf = java.lang.String.valueOf(jCopydefault / ((long) 86400000));
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt("days", pTD.EZpvd(C43246rlf.OLrzqt.valueOf(), C35964oKf.LoaderManager.OLrzqt, java.lang.Integer.parseInt(strValueOf), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", strValueOf)))), C56390yDp.OLrzqt("hours", KWHzl("0" + ((jCopydefault / ((long) 3600000)) % ((long) 24)))), C56390yDp.OLrzqt("minutes", KWHzl("0" + (j4 % j3))), C56390yDp.OLrzqt("seconds", KWHzl("0" + (j2 % j3))));
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() < 2) {
            return str;
        }
        java.lang.String strSubstring = str.substring(str.length() - 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public static final int OLrzqt(long j) {
        return (int) (C56548yJl.copydefault(java.lang.System.currentTimeMillis() - j, 0L) / ((long) 86400000));
    }
}
