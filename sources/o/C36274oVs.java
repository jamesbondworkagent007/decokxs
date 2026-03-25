package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: renamed from: o.oVs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36274oVs extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "DMI";
    }

    public C36274oVs(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("N", 2.0d, 90.0d, 14.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("MM", 2.0d, 60.0d, 6.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter3 = new Expression.Parameter("PDI", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter4 = new Expression.Parameter("MDI", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        Expression.Parameter parameter5 = new Expression.Parameter("ADX", true, stateListAnimator.KWHzl().KWHzl(2), 255, false);
        Expression.Parameter parameter6 = new Expression.Parameter("ADXR", true, stateListAnimator.KWHzl().KWHzl(4), 255, false);
        EZpvd(parameter3);
        EZpvd(parameter4);
        EZpvd(parameter5);
        EZpvd(parameter6);
        if (pDN.AEQbTJ.AEQbTJ()) {
            Expression.ActionBar actionBar = new Expression.ActionBar("MTR", new Expression.Point(new Expression.PackageManager(new Expression.PackageManager(new Expression.Callback(new Expression.Context(), new Expression.ApplicationInfo()), new Expression.TaskDescription(new Expression.Callback(new Expression.Context(), new Expression.Rect(new Expression.Dialog(), new Expression.FragmentManager(1.0d))))), new Expression.TaskDescription(new Expression.Callback(new Expression.Rect(new Expression.Dialog(), new Expression.FragmentManager(1.0d)), new Expression.ApplicationInfo()))), parameter));
            EZpvd(actionBar);
            Expression.ActionBar actionBar2 = new Expression.ActionBar("HD", new Expression.Callback(new Expression.Context(), new Expression.Rect(new Expression.Context(), new Expression.FragmentManager(1.0d))));
            EZpvd(actionBar2);
            Expression.ActionBar actionBar3 = new Expression.ActionBar("LD", new Expression.Callback(new Expression.Rect(new Expression.ApplicationInfo(), new Expression.FragmentManager(1.0d)), new Expression.ApplicationInfo()));
            EZpvd(actionBar3);
            Expression.ActionBar actionBar4 = new Expression.ActionBar("DMP", new Expression.Point(new Expression.SharedPreferences(new Expression.StateListAnimator(new Expression.ContentResolver(actionBar2, new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), new Expression.ContentResolver(actionBar2, actionBar3)), actionBar2, new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), parameter));
            EZpvd(actionBar4);
            Expression.ActionBar actionBar5 = new Expression.ActionBar("DMM", new Expression.Point(new Expression.SharedPreferences(new Expression.StateListAnimator(new Expression.ContentResolver(actionBar3, new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), new Expression.ContentResolver(actionBar3, actionBar2)), actionBar3, new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), parameter));
            EZpvd(actionBar5);
            Expression.FragmentManager fragmentManager = new Expression.FragmentManager(1.0E-10d);
            Expression.ActionBar actionBar6 = new Expression.ActionBar("plusDIValue", new Expression.AssetManager(new Expression.TaskStackBuilder(actionBar4, new Expression.PackageManager(actionBar, fragmentManager)), new Expression.FragmentManager(100.0d)));
            EZpvd(actionBar6);
            Expression.ActionBar actionBar7 = new Expression.ActionBar("minusDIValue", new Expression.AssetManager(new Expression.TaskStackBuilder(actionBar5, new Expression.PackageManager(actionBar, fragmentManager)), new Expression.FragmentManager(100.0d)));
            EZpvd(actionBar7);
            OLrzqt(new Expression.Output("PDI", new Expression.Configuration(new Expression.PackageManager(new Expression.Intent(actionBar6), new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), new Expression.FragmentManager(200.0d))));
            OLrzqt(new Expression.Output("MDI", new Expression.Configuration(new Expression.PackageManager(new Expression.Intent(actionBar7), new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), new Expression.FragmentManager(200.0d))));
            Expression.ActionBar actionBar8 = new Expression.ActionBar("sumDI", new Expression.Application(actionBar6, actionBar7));
            EZpvd(actionBar8);
            Expression.ActionBar actionBar9 = new Expression.ActionBar("dxDenominator", new Expression.SharedPreferences(new Expression.ClipData(actionBar8, new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), new Expression.FragmentManager(1.0d), actionBar8));
            EZpvd(actionBar9);
            Expression.ActionBar actionBar10 = new Expression.ActionBar("dx", new Expression.TaskStackBuilder(new Expression.TaskDescription(new Expression.Callback(actionBar6, actionBar7)), actionBar9));
            EZpvd(actionBar10);
            Expression.Output output = new Expression.Output("ADX", new Expression.Configuration(new Expression.PackageManager(new Expression.AssetManager(new Expression.Point(actionBar10, parameter2), new Expression.FragmentManager(100.0d)), new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), new Expression.FragmentManager(200.0d)));
            OLrzqt(output);
            Expression.ActionBar actionBar11 = new Expression.ActionBar("ADXR_LOOKBACK", new Expression.Callback(parameter, new Expression.FragmentManager(1.0d)));
            EZpvd(actionBar11);
            OLrzqt(new Expression.Output("ADXR", new Expression.Configuration(new Expression.PackageManager(new Expression.Intent(new Expression.TaskStackBuilder(new Expression.Application(output, new Expression.Mode(output, actionBar11)), new Expression.FragmentManager(2.0d))), new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), new Expression.FragmentManager(200.0d))));
            valueOf();
            return;
        }
        Expression.ActionBar actionBar12 = new Expression.ActionBar("MTR", new Expression.BroadcastReceiver(new Expression.PackageManager(new Expression.PackageManager(new Expression.Callback(new Expression.Context(), new Expression.ApplicationInfo()), new Expression.TaskDescription(new Expression.Callback(new Expression.Context(), new Expression.Rect(new Expression.Dialog(), new Expression.FragmentManager(1.0d))))), new Expression.TaskDescription(new Expression.Callback(new Expression.Rect(new Expression.Dialog(), new Expression.FragmentManager(1.0d)), new Expression.ApplicationInfo()))), parameter));
        EZpvd(actionBar12);
        Expression.ActionBar actionBar13 = new Expression.ActionBar("HD", new Expression.Callback(new Expression.Context(), new Expression.Rect(new Expression.Context(), new Expression.FragmentManager(1.0d))));
        EZpvd(actionBar13);
        Expression.ActionBar actionBar14 = new Expression.ActionBar("LD", new Expression.Callback(new Expression.Rect(new Expression.ApplicationInfo(), new Expression.FragmentManager(1.0d)), new Expression.ApplicationInfo()));
        EZpvd(actionBar14);
        Expression.ActionBar actionBar15 = new Expression.ActionBar("DMP", new Expression.BroadcastReceiver(new Expression.SharedPreferences(new Expression.StateListAnimator(new Expression.ContentResolver(actionBar13, new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), new Expression.ContentResolver(actionBar13, actionBar14)), actionBar13, new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), parameter));
        EZpvd(actionBar15);
        Expression.ActionBar actionBar16 = new Expression.ActionBar("DMM", new Expression.BroadcastReceiver(new Expression.SharedPreferences(new Expression.StateListAnimator(new Expression.ContentResolver(actionBar14, new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), new Expression.ContentResolver(actionBar14, actionBar13)), actionBar14, new Expression.FragmentManager(AudioStats.AUDIO_AMPLITUDE_NONE)), parameter));
        EZpvd(actionBar16);
        Expression.Output output2 = new Expression.Output("PDI", new Expression.AssetManager(new Expression.TaskStackBuilder(actionBar15, actionBar12), new Expression.FragmentManager(100.0d)));
        OLrzqt(output2);
        Expression.Output output3 = new Expression.Output("MDI", new Expression.AssetManager(new Expression.TaskStackBuilder(actionBar16, actionBar12), new Expression.FragmentManager(100.0d)));
        OLrzqt(output3);
        Expression.Output output4 = new Expression.Output("ADX", new Expression.BroadcastReceiver(new Expression.AssetManager(new Expression.TaskStackBuilder(new Expression.TaskDescription(new Expression.Callback(output3, output2)), new Expression.Application(output3, output2)), new Expression.FragmentManager(100.0d)), parameter2));
        OLrzqt(output4);
        OLrzqt(new Expression.Output("ADXR", new Expression.BroadcastReceiver(output4, parameter2)));
        valueOf();
    }

    @Override // o.AbstractC36262oVg
    public double djBIcL() {
        return EZpvd(0).getValue();
    }
}
