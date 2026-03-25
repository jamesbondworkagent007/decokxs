package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22406hek;
import o.AbstractC22421hez;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25448iws {
    public final C6977aZZ KWHzl;
    public final kYC copydefault;

    @yCM
    public C25448iws(@NotNull C6977aZZ c6977aZZ, @NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(c6977aZZ, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        this.KWHzl = c6977aZZ;
        this.copydefault = kyc;
    }

    public final void AEQbTJ(@NotNull AbstractC22406hek abstractC22406hek) {
        Intrinsics.checkNotNullParameter(abstractC22406hek, "");
        if (abstractC22406hek instanceof AbstractC22406hek.ActionBar) {
            AbstractC22406hek.ActionBar actionBar = (AbstractC22406hek.ActionBar) abstractC22406hek;
            this.KWHzl.OLrzqt(actionBar.gEmmrt(), actionBar.copydefault(), actionBar.EZpvd(), actionBar.djBIcL(), actionBar.OLrzqt(), actionBar.AEQbTJ(), actionBar.KWHzl());
            return;
        }
        if (abstractC22406hek instanceof AbstractC22406hek.Activity) {
            AbstractC22406hek.Activity activity = (AbstractC22406hek.Activity) abstractC22406hek;
            this.KWHzl.copydefault(activity.OLrzqt(), activity.copydefault(), activity.EZpvd(), activity.KWHzl(), activity.AEQbTJ(), (96 & 32) != 0 ? null : null, (96 & 64) != 0 ? yDY.AhwBna() : null);
            return;
        }
        if (abstractC22406hek instanceof AbstractC22406hek.TaskDescription) {
            C6977aZZ c6977aZZ = this.KWHzl;
            AbstractC22406hek.TaskDescription taskDescription = (AbstractC22406hek.TaskDescription) abstractC22406hek;
            java.lang.String strKWHzl = taskDescription.KWHzl();
            java.lang.String strCopydefault = taskDescription.copydefault();
            java.lang.String strEZpvd = taskDescription.EZpvd();
            java.lang.String strGEmmrt = taskDescription.gEmmrt();
            java.lang.String strAEQbTJ = taskDescription.AEQbTJ();
            C22404hei c22404heiOLrzqt = taskDescription.OLrzqt();
            java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = taskDescription.djBIcL();
            if (mapDjBIcL == null) {
                mapDjBIcL = C56424yEw.KWHzl();
            }
            c6977aZZ.AEQbTJ(strKWHzl, strCopydefault, strEZpvd, strGEmmrt, strAEQbTJ, c22404heiOLrzqt, mapDjBIcL);
            return;
        }
        if (abstractC22406hek instanceof AbstractC22406hek.Application) {
            C6977aZZ c6977aZZ2 = this.KWHzl;
            AbstractC22406hek.Application application = (AbstractC22406hek.Application) abstractC22406hek;
            java.lang.String strDjBIcL = application.djBIcL();
            AbstractC22421hez.Application application2 = AbstractC22421hez.Companion;
            java.lang.String strEZpvd2 = application2.EZpvd();
            java.lang.String strKWHzl2 = application2.KWHzl();
            java.lang.String strCopydefault2 = application.copydefault();
            java.lang.String strOLrzqt = application.OLrzqt();
            java.lang.String strValueOf = application.valueOf();
            java.lang.String strKWHzl3 = application.KWHzl();
            InterfaceC9738bbJ interfaceC9738bbJCopydefault = this.copydefault.copydefault();
            c6977aZZ2.OLrzqt(new C22402heg(strDjBIcL, strEZpvd2, strKWHzl2, strCopydefault2, strOLrzqt, strValueOf, strKWHzl3, (interfaceC9738bbJCopydefault == null || !interfaceC9738bbJCopydefault.RJOkX()) ? "no" : "yes"), application.EZpvd(), application.AEQbTJ());
            return;
        }
        if (abstractC22406hek instanceof AbstractC22406hek.StateListAnimator) {
            AbstractC22406hek.StateListAnimator stateListAnimator = (AbstractC22406hek.StateListAnimator) abstractC22406hek;
            this.KWHzl.KWHzl(stateListAnimator.copydefault(), stateListAnimator.OLrzqt());
        }
    }
}
