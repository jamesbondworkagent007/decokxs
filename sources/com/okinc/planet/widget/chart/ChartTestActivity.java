package com.okinc.planet.widget.chart;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import com.okinc.planet.widget.chart.ChartTestActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC47505trP;
import o.C33512mxp;
import o.C46220tMg;
import o.C46487tWd;
import o.C46496tWm;
import o.C56402yEa;
import o.rVN;
import o.tVX;
import o.yDY;

/* JADX INFO: loaded from: classes24.dex */
public final class ChartTestActivity extends AbstractActivityC47505trP {
    public C46220tMg EZpvd;
    public boolean copydefault;

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C46220tMg c46220tMgEZpvd = C46220tMg.EZpvd(getLayoutInflater());
        this.EZpvd = c46220tMgEZpvd;
        C46220tMg c46220tMg = null;
        if (c46220tMgEZpvd == null) {
            Intrinsics.gEmmrt("");
            c46220tMgEZpvd = null;
        }
        setContentView(c46220tMgEZpvd.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle("Chart Test Cases");
        }
        OLrzqt();
        C46220tMg c46220tMg2 = this.EZpvd;
        if (c46220tMg2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c46220tMg = c46220tMg2;
        }
        c46220tMg.getRoot().post(new Runnable() { // from class: o.tWc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ChartTestActivity.OLrzqt(this.copydefault);
            }
        });
    }

    public static final void OLrzqt(ChartTestActivity chartTestActivity) {
        if (chartTestActivity.copydefault) {
            return;
        }
        chartTestActivity.copydefault = true;
        rVN.reportFullyDrawn$default((Activity) chartTestActivity, true, (String) null, 2, (Object) null);
    }

    public final void OLrzqt() {
        C46220tMg c46220tMg;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, this, 0.0f, 2, null);
        int iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp, this, 0.0f, 2, null);
        C46220tMg c46220tMg2 = this.EZpvd;
        if (c46220tMg2 == null) {
            Intrinsics.gEmmrt("");
            c46220tMg2 = null;
        }
        C46496tWm c46496tWm = c46220tMg2.KWHzl;
        List<tVX> listCopydefault = copydefault(jCurrentTimeMillis, 3600000L);
        long j = (((long) 2) * 3600000) + jCurrentTimeMillis;
        MarkerSide markerSide = MarkerSide.BUY;
        C46487tWd c46487tWd = new C46487tWd(j, Double.valueOf(150.0d), markerSide);
        MarkerSide markerSide2 = MarkerSide.SELL;
        c46496tWm.setData(listCopydefault, yDY.gEmmrt(c46487tWd, new C46487tWd((((long) 5) * 3600000) + jCurrentTimeMillis, Double.valueOf(180.0d), markerSide2)), Integer.valueOf(iTradeRiseGraph$default));
        C46220tMg c46220tMg3 = this.EZpvd;
        if (c46220tMg3 == null) {
            Intrinsics.gEmmrt("");
            c46220tMg3 = null;
        }
        c46220tMg3.OLrzqt.setData(copydefault(jCurrentTimeMillis, 3600000L), yDY.AhwBna(), null);
        C46220tMg c46220tMg4 = this.EZpvd;
        if (c46220tMg4 == null) {
            Intrinsics.gEmmrt("");
            c46220tMg4 = null;
        }
        c46220tMg4.valueOf.setData(copydefault(jCurrentTimeMillis, 3600000L), yDY.AhwBna(), Integer.valueOf(iTradeFallGraph$default));
        C46220tMg c46220tMg5 = this.EZpvd;
        if (c46220tMg5 == null) {
            Intrinsics.gEmmrt("");
            c46220tMg5 = null;
        }
        c46220tMg5.gEmmrt.setData(KWHzl(jCurrentTimeMillis, 3600000L), C56402yEa.EZpvd(new C46487tWd((((long) 3) * 3600000) + jCurrentTimeMillis, Double.valueOf(-80.0d), markerSide)), Integer.valueOf(iTradeFallGraph$default));
        C46220tMg c46220tMg6 = this.EZpvd;
        if (c46220tMg6 == null) {
            Intrinsics.gEmmrt("");
            c46220tMg6 = null;
        }
        c46220tMg6.AhwBna.setData(KWHzl(jCurrentTimeMillis, 3600000L), yDY.AhwBna(), null);
        C46220tMg c46220tMg7 = this.EZpvd;
        if (c46220tMg7 == null) {
            Intrinsics.gEmmrt("");
            c46220tMg7 = null;
        }
        c46220tMg7.djBIcL.setData(KWHzl(jCurrentTimeMillis, 3600000L), yDY.AhwBna(), Integer.valueOf(iTradeRiseGraph$default));
        C46220tMg c46220tMg8 = this.EZpvd;
        if (c46220tMg8 == null) {
            Intrinsics.gEmmrt("");
            c46220tMg8 = null;
        }
        c46220tMg8.AYXKKw.setData(EZpvd(jCurrentTimeMillis, 3600000L), yDY.gEmmrt(new C46487tWd(j, Double.valueOf(-50.0d), markerSide), new C46487tWd((((long) 6) * 3600000) + jCurrentTimeMillis, Double.valueOf(80.0d), markerSide2), new C46487tWd((((long) 9) * 3600000) + jCurrentTimeMillis, Double.valueOf(60.0d), markerSide)), Integer.valueOf(iTradeRiseGraph$default));
        C46220tMg c46220tMg9 = this.EZpvd;
        if (c46220tMg9 == null) {
            Intrinsics.gEmmrt("");
            c46220tMg9 = null;
        }
        c46220tMg9.values.setData(EZpvd(jCurrentTimeMillis, 3600000L), yDY.AhwBna(), null);
        C46220tMg c46220tMg10 = this.EZpvd;
        if (c46220tMg10 == null) {
            Intrinsics.gEmmrt("");
            c46220tMg10 = null;
        }
        c46220tMg10.DbNXlk.setData(C56402yEa.EZpvd(new tVX(jCurrentTimeMillis, Double.valueOf(-100.0d))), yDY.AhwBna(), null);
        C46220tMg c46220tMg11 = this.EZpvd;
        if (c46220tMg11 == null) {
            Intrinsics.gEmmrt("");
            c46220tMg11 = null;
        }
        c46220tMg11.AEQbTJ.setData(C56402yEa.EZpvd(new tVX(jCurrentTimeMillis, Double.valueOf(100.0d))), yDY.AhwBna(), null);
        C46220tMg c46220tMg12 = this.EZpvd;
        if (c46220tMg12 == null) {
            Intrinsics.gEmmrt("");
            c46220tMg12 = null;
        }
        c46220tMg12.copydefault.setData(yDY.AhwBna(), yDY.AhwBna(), null);
        C46220tMg c46220tMg13 = this.EZpvd;
        if (c46220tMg13 == null) {
            Intrinsics.gEmmrt("");
            c46220tMg = null;
        } else {
            c46220tMg = c46220tMg13;
        }
        c46220tMg.EZpvd.setData(EZpvd(jCurrentTimeMillis, 3600000L), yDY.AhwBna(), Integer.valueOf(iTradeRiseGraph$default));
    }

    public final List<tVX> copydefault(long j, long j2) {
        return yDY.gEmmrt(new tVX(j, Double.valueOf(100.0d)), new tVX(j + j2, Double.valueOf(120.0d)), new tVX((((long) 2) * j2) + j, Double.valueOf(150.0d)), new tVX((((long) 3) * j2) + j, Double.valueOf(140.0d)), new tVX((((long) 4) * j2) + j, Double.valueOf(160.0d)), new tVX((((long) 5) * j2) + j, Double.valueOf(180.0d)), new tVX((((long) 6) * j2) + j, Double.valueOf(170.0d)), new tVX((((long) 7) * j2) + j, Double.valueOf(190.0d)), new tVX((((long) 8) * j2) + j, Double.valueOf(185.0d)), new tVX(j + (((long) 9) * j2), Double.valueOf(200.0d)));
    }

    public final List<tVX> KWHzl(long j, long j2) {
        return yDY.gEmmrt(new tVX(j, Double.valueOf(-50.0d)), new tVX(j + j2, Double.valueOf(-60.0d)), new tVX((((long) 2) * j2) + j, Double.valueOf(-55.0d)), new tVX((((long) 3) * j2) + j, Double.valueOf(-80.0d)), new tVX((((long) 4) * j2) + j, Double.valueOf(-70.0d)), new tVX((((long) 5) * j2) + j, Double.valueOf(-75.0d)), new tVX((((long) 6) * j2) + j, Double.valueOf(-90.0d)), new tVX((((long) 7) * j2) + j, Double.valueOf(-85.0d)), new tVX((((long) 8) * j2) + j, Double.valueOf(-95.0d)), new tVX(j + (((long) 9) * j2), Double.valueOf(-110.0d)));
    }

    public final List<tVX> EZpvd(long j, long j2) {
        return yDY.gEmmrt(new tVX(j, Double.valueOf(50.0d)), new tVX(j + j2, Double.valueOf(30.0d)), new tVX((((long) 2) * j2) + j, Double.valueOf(-20.0d)), new tVX((((long) 3) * j2) + j, Double.valueOf(-50.0d)), new tVX((((long) 4) * j2) + j, Double.valueOf(-40.0d)), new tVX((((long) 5) * j2) + j, Double.valueOf(-60.0d)), new tVX((((long) 6) * j2) + j, Double.valueOf(-30.0d)), new tVX((((long) 7) * j2) + j, Double.valueOf(10.0d)), new tVX((((long) 8) * j2) + j, Double.valueOf(40.0d)), new tVX(j + (((long) 9) * j2), Double.valueOf(80.0d)));
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
