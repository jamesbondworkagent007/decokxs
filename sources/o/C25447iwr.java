package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22403heh;
import o.AbstractC22421hez;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25447iwr {
    public final C6966aZO AEQbTJ;
    public final C6975aZX AYXKKw;
    public final C9703bab AhwBna;
    public final C6969aZR EZpvd;
    public final C6970aZS KWHzl;
    public final C6974aZW OLrzqt;
    public final C6972aZU copydefault;
    public final C6976aZY djBIcL;
    public final kYC gEmmrt;

    @yCM
    public C25447iwr(@NotNull C6966aZO c6966aZO, @NotNull C6976aZY c6976aZY, @NotNull C6974aZW c6974aZW, @NotNull C6970aZS c6970aZS, @NotNull C6975aZX c6975aZX, @NotNull C6972aZU c6972aZU, @NotNull C6969aZR c6969aZR, @NotNull C9703bab c9703bab, @NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(c6966aZO, "");
        Intrinsics.checkNotNullParameter(c6976aZY, "");
        Intrinsics.checkNotNullParameter(c6974aZW, "");
        Intrinsics.checkNotNullParameter(c6970aZS, "");
        Intrinsics.checkNotNullParameter(c6975aZX, "");
        Intrinsics.checkNotNullParameter(c6972aZU, "");
        Intrinsics.checkNotNullParameter(c6969aZR, "");
        Intrinsics.checkNotNullParameter(c9703bab, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        this.AEQbTJ = c6966aZO;
        this.djBIcL = c6976aZY;
        this.OLrzqt = c6974aZW;
        this.KWHzl = c6970aZS;
        this.AYXKKw = c6975aZX;
        this.copydefault = c6972aZU;
        this.EZpvd = c6969aZR;
        this.AhwBna = c9703bab;
        this.gEmmrt = kyc;
    }

    public final void AEQbTJ(@NotNull AbstractC22403heh abstractC22403heh) {
        Intrinsics.checkNotNullParameter(abstractC22403heh, "");
        if (abstractC22403heh instanceof AbstractC22403heh.StateListAnimator) {
            AbstractC22403heh.StateListAnimator stateListAnimator = (AbstractC22403heh.StateListAnimator) abstractC22403heh;
            this.AEQbTJ.AEQbTJ(stateListAnimator.OLrzqt(), stateListAnimator.AEQbTJ(), stateListAnimator.KWHzl(), stateListAnimator.djBIcL(), stateListAnimator.EZpvd(), stateListAnimator.copydefault());
            return;
        }
        if (abstractC22403heh instanceof AbstractC22403heh.FragmentManager) {
            AbstractC22403heh.FragmentManager fragmentManager = (AbstractC22403heh.FragmentManager) abstractC22403heh;
            this.djBIcL.copydefault(fragmentManager.EZpvd(), fragmentManager.OLrzqt(), fragmentManager.copydefault(), fragmentManager.AhwBna(), fragmentManager.AEQbTJ(), (64 & 32) != 0 ? null : fragmentManager.KWHzl(), (64 & 64) != 0 ? yDY.AhwBna() : null);
            return;
        }
        if (abstractC22403heh instanceof AbstractC22403heh.Fragment) {
            C6974aZW c6974aZW = this.OLrzqt;
            AbstractC22403heh.Fragment fragment = (AbstractC22403heh.Fragment) abstractC22403heh;
            java.lang.String strKWHzl = fragment.KWHzl();
            java.lang.String strAEQbTJ = fragment.AEQbTJ();
            java.lang.String strCopydefault = fragment.copydefault();
            java.lang.String strValueOf = fragment.valueOf();
            java.lang.String strEZpvd = fragment.EZpvd();
            C22404hei c22404heiOLrzqt = fragment.OLrzqt();
            java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = fragment.gEmmrt();
            if (mapGEmmrt == null) {
                mapGEmmrt = C56424yEw.KWHzl();
            }
            c6974aZW.OLrzqt(strKWHzl, strAEQbTJ, strCopydefault, strValueOf, strEZpvd, c22404heiOLrzqt, mapGEmmrt);
            return;
        }
        if (abstractC22403heh instanceof AbstractC22403heh.PendingIntent) {
            C6970aZS c6970aZS = this.KWHzl;
            AbstractC22403heh.PendingIntent pendingIntent = (AbstractC22403heh.PendingIntent) abstractC22403heh;
            java.lang.String strAYXKKw = pendingIntent.AYXKKw();
            AbstractC22421hez.Application application = AbstractC22421hez.Companion;
            java.lang.String strEZpvd2 = application.EZpvd();
            java.lang.String strKWHzl2 = application.KWHzl();
            java.lang.String strAEQbTJ2 = pendingIntent.AEQbTJ();
            java.lang.String strOLrzqt = pendingIntent.OLrzqt();
            java.lang.String strGEmmrt = pendingIntent.gEmmrt();
            java.lang.String strEZpvd3 = pendingIntent.EZpvd();
            InterfaceC9738bbJ interfaceC9738bbJCopydefault = this.gEmmrt.copydefault();
            c6970aZS.KWHzl(new C22402heg(strAYXKKw, strEZpvd2, strKWHzl2, strAEQbTJ2, strOLrzqt, strGEmmrt, strEZpvd3, (interfaceC9738bbJCopydefault == null || !interfaceC9738bbJCopydefault.RJOkX()) ? "no" : "yes"), pendingIntent.copydefault(), pendingIntent.KWHzl());
            return;
        }
        if (abstractC22403heh instanceof AbstractC22403heh.LoaderManager) {
            AbstractC22403heh.LoaderManager loaderManager = (AbstractC22403heh.LoaderManager) abstractC22403heh;
            C6975aZX.trackDexTradeSubmitClick$default(this.AYXKKw, loaderManager.copydefault(), loaderManager.OLrzqt(), null, 4, null);
            return;
        }
        if (abstractC22403heh instanceof AbstractC22403heh.TaskDescription) {
            AbstractC22403heh.TaskDescription taskDescription = (AbstractC22403heh.TaskDescription) abstractC22403heh;
            this.copydefault.OLrzqt(taskDescription.KWHzl(), taskDescription.AEQbTJ(), taskDescription.EZpvd(), taskDescription.djBIcL(), taskDescription.OLrzqt(), (64 & 32) != 0 ? null : taskDescription.copydefault(), (64 & 64) != 0 ? yDY.AhwBna() : null);
            return;
        }
        if (abstractC22403heh instanceof AbstractC22403heh.ActionBar) {
            AbstractC22403heh.ActionBar actionBar = (AbstractC22403heh.ActionBar) abstractC22403heh;
            this.EZpvd.copydefault(actionBar.KWHzl(), actionBar.AEQbTJ(), actionBar.OLrzqt(), actionBar.valueOf(), actionBar.EZpvd(), (64 & 32) != 0 ? null : actionBar.copydefault(), (64 & 64) != 0 ? yDY.AhwBna() : null);
            return;
        }
        if (abstractC22403heh instanceof AbstractC22403heh.Activity) {
            AbstractC22403heh.Activity activity = (AbstractC22403heh.Activity) abstractC22403heh;
            this.AhwBna.EZpvd(activity.OLrzqt(), activity.AEQbTJ(), activity.KWHzl(), activity.valueOf(), activity.copydefault(), activity.EZpvd());
        } else if (abstractC22403heh instanceof AbstractC22403heh.Application) {
            AbstractC22403heh.Application application2 = (AbstractC22403heh.Application) abstractC22403heh;
            this.AhwBna.OLrzqt(application2.EZpvd(), application2.copydefault(), application2.KWHzl(), application2.AYXKKw(), application2.OLrzqt(), application2.AEQbTJ());
        }
    }
}
