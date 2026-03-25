package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22401hef;
import o.AbstractC22421hez;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25446iwq {
    public final C6966aZO AEQbTJ;
    public final C9703bab AYXKKw;
    public final C6976aZY EZpvd;
    public final C6974aZW KWHzl;
    public final C6970aZS OLrzqt;
    public final C6975aZX copydefault;
    public final kYC valueOf;

    @yCM
    public C25446iwq(@NotNull C6966aZO c6966aZO, @NotNull C6976aZY c6976aZY, @NotNull C6974aZW c6974aZW, @NotNull C6970aZS c6970aZS, @NotNull C6975aZX c6975aZX, @NotNull C9703bab c9703bab, @NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(c6966aZO, "");
        Intrinsics.checkNotNullParameter(c6976aZY, "");
        Intrinsics.checkNotNullParameter(c6974aZW, "");
        Intrinsics.checkNotNullParameter(c6970aZS, "");
        Intrinsics.checkNotNullParameter(c6975aZX, "");
        Intrinsics.checkNotNullParameter(c9703bab, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        this.AEQbTJ = c6966aZO;
        this.EZpvd = c6976aZY;
        this.KWHzl = c6974aZW;
        this.OLrzqt = c6970aZS;
        this.copydefault = c6975aZX;
        this.AYXKKw = c9703bab;
        this.valueOf = kyc;
    }

    public final void copydefault(@NotNull AbstractC22401hef abstractC22401hef) {
        Intrinsics.checkNotNullParameter(abstractC22401hef, "");
        if (abstractC22401hef instanceof AbstractC22401hef.TaskDescription) {
            AbstractC22401hef.TaskDescription taskDescription = (AbstractC22401hef.TaskDescription) abstractC22401hef;
            this.AEQbTJ.AEQbTJ(taskDescription.AEQbTJ(), taskDescription.copydefault(), taskDescription.EZpvd(), taskDescription.valueOf(), taskDescription.KWHzl(), taskDescription.OLrzqt());
            return;
        }
        if (abstractC22401hef instanceof AbstractC22401hef.StateListAnimator) {
            AbstractC22401hef.StateListAnimator stateListAnimator = (AbstractC22401hef.StateListAnimator) abstractC22401hef;
            this.EZpvd.copydefault(stateListAnimator.KWHzl(), stateListAnimator.AEQbTJ(), stateListAnimator.copydefault(), stateListAnimator.djBIcL(), stateListAnimator.OLrzqt(), stateListAnimator.AYXKKw(), stateListAnimator.EZpvd());
            return;
        }
        if (abstractC22401hef instanceof AbstractC22401hef.PendingIntent) {
            AbstractC22401hef.PendingIntent pendingIntent = (AbstractC22401hef.PendingIntent) abstractC22401hef;
            this.KWHzl.OLrzqt(pendingIntent.copydefault(), pendingIntent.EZpvd(), pendingIntent.OLrzqt(), pendingIntent.djBIcL(), pendingIntent.AEQbTJ(), pendingIntent.KWHzl(), pendingIntent.gEmmrt());
            return;
        }
        if (abstractC22401hef instanceof AbstractC22401hef.FragmentManager) {
            C6970aZS c6970aZS = this.OLrzqt;
            AbstractC22401hef.FragmentManager fragmentManager = (AbstractC22401hef.FragmentManager) abstractC22401hef;
            java.lang.String strGEmmrt = fragmentManager.gEmmrt();
            AbstractC22421hez.Application application = AbstractC22421hez.Companion;
            java.lang.String strEZpvd = application.EZpvd();
            java.lang.String strKWHzl = application.KWHzl();
            java.lang.String strAEQbTJ = fragmentManager.AEQbTJ();
            java.lang.String strCopydefault = fragmentManager.copydefault();
            java.lang.String strOLrzqt = fragmentManager.OLrzqt();
            java.lang.String strKWHzl2 = fragmentManager.KWHzl();
            InterfaceC9738bbJ interfaceC9738bbJCopydefault = this.valueOf.copydefault();
            C6970aZS.trackDexTradeSelectDappView$default(c6970aZS, new C22402heg(strGEmmrt, strEZpvd, strKWHzl, strAEQbTJ, strCopydefault, strOLrzqt, strKWHzl2, (interfaceC9738bbJCopydefault == null || !interfaceC9738bbJCopydefault.RJOkX()) ? "no" : "yes"), fragmentManager.EZpvd(), null, 4, null);
            return;
        }
        if (abstractC22401hef instanceof AbstractC22401hef.Activity) {
            AbstractC22401hef.Activity activity = (AbstractC22401hef.Activity) abstractC22401hef;
            this.copydefault.OLrzqt(activity.KWHzl(), activity.EZpvd(), activity.AEQbTJ());
        } else if (abstractC22401hef instanceof AbstractC22401hef.ActionBar) {
            AbstractC22401hef.ActionBar actionBar = (AbstractC22401hef.ActionBar) abstractC22401hef;
            this.AYXKKw.EZpvd(actionBar.AEQbTJ(), actionBar.KWHzl(), actionBar.EZpvd(), actionBar.djBIcL(), actionBar.copydefault(), actionBar.OLrzqt());
        } else if (abstractC22401hef instanceof AbstractC22401hef.Application) {
            AbstractC22401hef.Application application2 = (AbstractC22401hef.Application) abstractC22401hef;
            this.AYXKKw.OLrzqt(application2.KWHzl(), application2.AEQbTJ(), application2.OLrzqt(), application2.AYXKKw(), application2.EZpvd(), application2.copydefault());
        }
    }
}
