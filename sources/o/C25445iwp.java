package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22410heo;
import o.AbstractC22421hez;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25445iwp {
    public final C6974aZW AEQbTJ;
    public final C6976aZY EZpvd;
    public final C6975aZX KWHzl;
    public final C6970aZS OLrzqt;
    public final C6966aZO copydefault;
    public final kYC djBIcL;

    @yCM
    public C25445iwp(@NotNull C6966aZO c6966aZO, @NotNull C6976aZY c6976aZY, @NotNull C6974aZW c6974aZW, @NotNull C6970aZS c6970aZS, @NotNull C6975aZX c6975aZX, @NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(c6966aZO, "");
        Intrinsics.checkNotNullParameter(c6976aZY, "");
        Intrinsics.checkNotNullParameter(c6974aZW, "");
        Intrinsics.checkNotNullParameter(c6970aZS, "");
        Intrinsics.checkNotNullParameter(c6975aZX, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        this.copydefault = c6966aZO;
        this.EZpvd = c6976aZY;
        this.AEQbTJ = c6974aZW;
        this.OLrzqt = c6970aZS;
        this.KWHzl = c6975aZX;
        this.djBIcL = kyc;
    }

    public final void AEQbTJ(@NotNull AbstractC22410heo abstractC22410heo) {
        Intrinsics.checkNotNullParameter(abstractC22410heo, "");
        if (abstractC22410heo instanceof AbstractC22410heo.ActionBar) {
            AbstractC22410heo.ActionBar actionBar = (AbstractC22410heo.ActionBar) abstractC22410heo;
            this.copydefault.AEQbTJ(actionBar.KWHzl(), actionBar.EZpvd(), actionBar.OLrzqt(), actionBar.valueOf(), actionBar.copydefault(), actionBar.AEQbTJ());
            return;
        }
        if (abstractC22410heo instanceof AbstractC22410heo.Application) {
            AbstractC22410heo.Application application = (AbstractC22410heo.Application) abstractC22410heo;
            this.EZpvd.copydefault(application.OLrzqt(), application.AEQbTJ(), application.KWHzl(), application.gEmmrt(), application.copydefault(), (64 & 32) != 0 ? null : application.EZpvd(), (64 & 64) != 0 ? yDY.AhwBna() : null);
            return;
        }
        if (abstractC22410heo instanceof AbstractC22410heo.StateListAnimator) {
            C6974aZW c6974aZW = this.AEQbTJ;
            AbstractC22410heo.StateListAnimator stateListAnimator = (AbstractC22410heo.StateListAnimator) abstractC22410heo;
            java.lang.String strAEQbTJ = stateListAnimator.AEQbTJ();
            java.lang.String strKWHzl = stateListAnimator.KWHzl();
            java.lang.String strOLrzqt = stateListAnimator.OLrzqt();
            java.lang.String strAhwBna = stateListAnimator.AhwBna();
            java.lang.String strCopydefault = stateListAnimator.copydefault();
            C22404hei c22404heiEZpvd = stateListAnimator.EZpvd();
            java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = stateListAnimator.gEmmrt();
            if (mapGEmmrt == null) {
                mapGEmmrt = C56424yEw.KWHzl();
            }
            c6974aZW.OLrzqt(strAEQbTJ, strKWHzl, strOLrzqt, strAhwBna, strCopydefault, c22404heiEZpvd, mapGEmmrt);
            return;
        }
        if (abstractC22410heo instanceof AbstractC22410heo.TaskDescription) {
            C6970aZS c6970aZS = this.OLrzqt;
            AbstractC22410heo.TaskDescription taskDescription = (AbstractC22410heo.TaskDescription) abstractC22410heo;
            java.lang.String strValueOf = taskDescription.valueOf();
            AbstractC22421hez.Application application2 = AbstractC22421hez.Companion;
            java.lang.String strEZpvd = application2.EZpvd();
            java.lang.String strKWHzl2 = application2.KWHzl();
            java.lang.String strAEQbTJ2 = taskDescription.AEQbTJ();
            java.lang.String strOLrzqt2 = taskDescription.OLrzqt();
            java.lang.String strDjBIcL = taskDescription.djBIcL();
            java.lang.String strEZpvd2 = taskDescription.EZpvd();
            InterfaceC9738bbJ interfaceC9738bbJCopydefault = this.djBIcL.copydefault();
            c6970aZS.KWHzl(new C22402heg(strValueOf, strEZpvd, strKWHzl2, strAEQbTJ2, strOLrzqt2, strDjBIcL, strEZpvd2, (interfaceC9738bbJCopydefault == null || !interfaceC9738bbJCopydefault.RJOkX()) ? "no" : "yes"), taskDescription.copydefault(), taskDescription.KWHzl());
            return;
        }
        if (abstractC22410heo instanceof AbstractC22410heo.Activity) {
            AbstractC22410heo.Activity activity = (AbstractC22410heo.Activity) abstractC22410heo;
            C6975aZX.trackDexTradeSubmitClick$default(this.KWHzl, activity.OLrzqt(), activity.EZpvd(), null, 4, null);
        }
    }
}
