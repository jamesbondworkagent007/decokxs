package o;

import com.okinc.kline.library.indicator.Expression;
import o.pDT;

/* JADX INFO: renamed from: o.oVr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36273oVr extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return "EMV";
    }

    public C36273oVr(java.lang.String str) {
        super(str);
        Expression.Parameter parameter = new Expression.Parameter("N", 2.0d, 90.0d, 14.0d);
        Expression.Parameter parameter2 = new Expression.Parameter("M", 2.0d, 60.0d, 9.0d);
        OLrzqt(parameter);
        OLrzqt(parameter2);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        Expression.Parameter parameter3 = new Expression.Parameter("EMV", true, stateListAnimator.KWHzl().KWHzl(0), 255, false);
        Expression.Parameter parameter4 = new Expression.Parameter("MAEMV", true, stateListAnimator.KWHzl().KWHzl(1), 255, false);
        EZpvd(parameter3);
        EZpvd(parameter4);
        Expression.ActionBar actionBar = new Expression.ActionBar("VOLUME", new Expression.TaskStackBuilder(new Expression.ColorStateList(new Expression.Parcelable(), parameter), new Expression.Parcelable()));
        EZpvd(actionBar);
        Expression.ActionBar actionBar2 = new Expression.ActionBar("MID", new Expression.AssetManager(new Expression.TaskStackBuilder(new Expression.Callback(new Expression.Application(new Expression.Context(), new Expression.ApplicationInfo()), new Expression.Rect(new Expression.Application(new Expression.Context(), new Expression.ApplicationInfo()), new Expression.FragmentManager(1.0d))), new Expression.Application(new Expression.Context(), new Expression.ApplicationInfo())), new Expression.FragmentManager(100.0d)));
        EZpvd(actionBar2);
        Expression.Output output = new Expression.Output("EMV", new Expression.ColorStateList(new Expression.TaskStackBuilder(new Expression.AssetManager(actionBar2, new Expression.AssetManager(actionBar, new Expression.Callback(new Expression.Context(), new Expression.ApplicationInfo()))), new Expression.ColorStateList(new Expression.Callback(new Expression.Context(), new Expression.ApplicationInfo()), parameter)), parameter));
        OLrzqt(output);
        OLrzqt(new Expression.Output("MAEMV", new Expression.ColorStateList(output, parameter2)));
        valueOf();
    }
}
