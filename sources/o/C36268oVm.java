package o;

import com.okinc.kline.library.indicator.Expression;

/* JADX INFO: renamed from: o.oVm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36268oVm extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "CCI";
    }

    public C36268oVm(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("N", 2.0d, 100.0d, 14.0d);
        OLrzqt(parameter);
        EZpvd(new Expression.Parameter("CCI", true, pDT.Companion.KWHzl().KWHzl(0), 255, false));
        Expression.ActionBar actionBar = new Expression.ActionBar("TYP", new Expression.TaskStackBuilder(new Expression.Application(new Expression.Application(new Expression.Context(), new Expression.ApplicationInfo()), new Expression.Dialog()), new Expression.FragmentManager(3.0d)));
        EZpvd(actionBar);
        OLrzqt(new Expression.Output("CCI", new Expression.TaskStackBuilder(new Expression.Callback(actionBar, new Expression.ColorStateList(actionBar, parameter)), new Expression.AssetManager(new Expression.FragmentManager(0.015d), new Expression.PendingIntent(actionBar, parameter)))));
        valueOf();
    }
}
