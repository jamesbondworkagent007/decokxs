package o;

import com.okinc.business.dex.trade.component.orderandposition.ordertab.domain.model.OrderAndPositionTab;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22407hel;
import o.AbstractC22421hez;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25452iww {
    public final C6969aZR AEQbTJ;
    public final C6971aZT AYXKKw;
    public final C6973aZV AhwBna;
    public final kYC DbNXlk;
    public final C6972aZU EZpvd;
    public final C6974aZW KWHzl;
    public final C6966aZO OLrzqt;
    public final C6970aZS copydefault;
    public final C9703bab djBIcL;
    public final C6976aZY gEmmrt;
    public final C6975aZX valueOf;

    @yCM
    public C25452iww(@NotNull C6966aZO c6966aZO, @NotNull C6976aZY c6976aZY, @NotNull C6974aZW c6974aZW, @NotNull C6970aZS c6970aZS, @NotNull C6975aZX c6975aZX, @NotNull C6972aZU c6972aZU, @NotNull C6969aZR c6969aZR, @NotNull C9703bab c9703bab, @NotNull C6973aZV c6973aZV, @NotNull C6971aZT c6971aZT, @NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(c6966aZO, "");
        Intrinsics.checkNotNullParameter(c6976aZY, "");
        Intrinsics.checkNotNullParameter(c6974aZW, "");
        Intrinsics.checkNotNullParameter(c6970aZS, "");
        Intrinsics.checkNotNullParameter(c6975aZX, "");
        Intrinsics.checkNotNullParameter(c6972aZU, "");
        Intrinsics.checkNotNullParameter(c6969aZR, "");
        Intrinsics.checkNotNullParameter(c9703bab, "");
        Intrinsics.checkNotNullParameter(c6973aZV, "");
        Intrinsics.checkNotNullParameter(c6971aZT, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        this.OLrzqt = c6966aZO;
        this.gEmmrt = c6976aZY;
        this.KWHzl = c6974aZW;
        this.copydefault = c6970aZS;
        this.valueOf = c6975aZX;
        this.EZpvd = c6972aZU;
        this.AEQbTJ = c6969aZR;
        this.djBIcL = c9703bab;
        this.AhwBna = c6973aZV;
        this.AYXKKw = c6971aZT;
        this.DbNXlk = kyc;
    }

    public final void OLrzqt(@NotNull AbstractC22407hel abstractC22407hel) {
        Intrinsics.checkNotNullParameter(abstractC22407hel, "");
        if (abstractC22407hel instanceof AbstractC22407hel.ActionBar) {
            AbstractC22407hel.ActionBar actionBar = (AbstractC22407hel.ActionBar) abstractC22407hel;
            this.OLrzqt.AEQbTJ(actionBar.OLrzqt(), actionBar.KWHzl(), actionBar.copydefault(), actionBar.gEmmrt(), actionBar.AEQbTJ(), actionBar.EZpvd());
            return;
        }
        if (abstractC22407hel instanceof AbstractC22407hel.PendingIntent) {
            AbstractC22407hel.PendingIntent pendingIntent = (AbstractC22407hel.PendingIntent) abstractC22407hel;
            this.gEmmrt.copydefault(pendingIntent.KWHzl(), pendingIntent.AEQbTJ(), pendingIntent.EZpvd(), pendingIntent.gEmmrt(), pendingIntent.copydefault(), (64 & 32) != 0 ? null : pendingIntent.OLrzqt(), (64 & 64) != 0 ? yDY.AhwBna() : null);
            return;
        }
        if (abstractC22407hel instanceof AbstractC22407hel.TaskStackBuilder) {
            C6974aZW c6974aZW = this.KWHzl;
            AbstractC22407hel.TaskStackBuilder taskStackBuilder = (AbstractC22407hel.TaskStackBuilder) abstractC22407hel;
            java.lang.String strCopydefault = taskStackBuilder.copydefault();
            java.lang.String strAEQbTJ = taskStackBuilder.AEQbTJ();
            java.lang.String strEZpvd = taskStackBuilder.EZpvd();
            java.lang.String strDjBIcL = taskStackBuilder.djBIcL();
            java.lang.String strOLrzqt = taskStackBuilder.OLrzqt();
            C22404hei c22404heiKWHzl = taskStackBuilder.KWHzl();
            java.util.Map<java.lang.String, java.lang.String> mapAYXKKw = taskStackBuilder.AYXKKw();
            if (mapAYXKKw == null) {
                mapAYXKKw = C56424yEw.KWHzl();
            }
            c6974aZW.OLrzqt(strCopydefault, strAEQbTJ, strEZpvd, strDjBIcL, strOLrzqt, c22404heiKWHzl, mapAYXKKw);
            return;
        }
        if (abstractC22407hel instanceof AbstractC22407hel.VoiceInteractor) {
            C6970aZS c6970aZS = this.copydefault;
            AbstractC22407hel.VoiceInteractor voiceInteractor = (AbstractC22407hel.VoiceInteractor) abstractC22407hel;
            java.lang.String strValueOf = voiceInteractor.valueOf();
            AbstractC22421hez.Application application = AbstractC22421hez.Companion;
            java.lang.String strEZpvd2 = application.EZpvd();
            java.lang.String strKWHzl = application.KWHzl();
            java.lang.String strOLrzqt2 = voiceInteractor.OLrzqt();
            java.lang.String strAEQbTJ2 = voiceInteractor.AEQbTJ();
            java.lang.String strGEmmrt = voiceInteractor.gEmmrt();
            java.lang.String strEZpvd3 = voiceInteractor.EZpvd();
            InterfaceC9738bbJ interfaceC9738bbJCopydefault = this.DbNXlk.copydefault();
            c6970aZS.KWHzl(new C22402heg(strValueOf, strEZpvd2, strKWHzl, strOLrzqt2, strAEQbTJ2, strGEmmrt, strEZpvd3, (interfaceC9738bbJCopydefault == null || !interfaceC9738bbJCopydefault.RJOkX()) ? "no" : "yes"), voiceInteractor.KWHzl(), voiceInteractor.copydefault());
            return;
        }
        if (abstractC22407hel instanceof AbstractC22407hel.Dialog) {
            AbstractC22407hel.Dialog dialog = (AbstractC22407hel.Dialog) abstractC22407hel;
            C6975aZX.trackDexTradeSubmitClick$default(this.valueOf, dialog.copydefault(), dialog.EZpvd(), null, 4, null);
            return;
        }
        if (abstractC22407hel instanceof AbstractC22407hel.FragmentManager) {
            C6966aZO c6966aZO = this.OLrzqt;
            AbstractC22407hel.FragmentManager fragmentManager = (AbstractC22407hel.FragmentManager) abstractC22407hel;
            java.lang.String strAEQbTJ3 = fragmentManager.AEQbTJ();
            java.lang.String strKWHzl2 = fragmentManager.KWHzl();
            java.lang.String strEZpvd4 = fragmentManager.EZpvd();
            java.lang.String strAYXKKw = fragmentManager.AYXKKw();
            java.lang.String strCopydefault2 = fragmentManager.copydefault();
            java.util.Map<java.lang.String, java.lang.String> mapOLrzqt = fragmentManager.OLrzqt();
            if (mapOLrzqt == null) {
                mapOLrzqt = C56424yEw.KWHzl();
            }
            c6966aZO.AEQbTJ(strKWHzl2, strEZpvd4, strAEQbTJ3, strAYXKKw, strCopydefault2, mapOLrzqt);
            return;
        }
        if (abstractC22407hel instanceof AbstractC22407hel.LoaderManager) {
            AbstractC22407hel.LoaderManager loaderManager = (AbstractC22407hel.LoaderManager) abstractC22407hel;
            this.gEmmrt.copydefault(loaderManager.KWHzl(), loaderManager.copydefault(), loaderManager.AEQbTJ(), loaderManager.EZpvd(), loaderManager.OLrzqt(), (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? yDY.AhwBna() : null);
            return;
        }
        if (abstractC22407hel instanceof AbstractC22407hel.StateListAnimator) {
            AbstractC22407hel.StateListAnimator stateListAnimator = (AbstractC22407hel.StateListAnimator) abstractC22407hel;
            this.EZpvd.OLrzqt(stateListAnimator.AEQbTJ(), stateListAnimator.copydefault(), stateListAnimator.OLrzqt(), stateListAnimator.djBIcL(), stateListAnimator.EZpvd(), (64 & 32) != 0 ? null : stateListAnimator.KWHzl(), (64 & 64) != 0 ? yDY.AhwBna() : null);
            return;
        }
        if (abstractC22407hel instanceof AbstractC22407hel.Activity) {
            AbstractC22407hel.Activity activity = (AbstractC22407hel.Activity) abstractC22407hel;
            this.AEQbTJ.copydefault(activity.copydefault(), activity.OLrzqt(), activity.KWHzl(), activity.djBIcL(), activity.EZpvd(), (64 & 32) != 0 ? null : activity.AEQbTJ(), (64 & 64) != 0 ? yDY.AhwBna() : null);
            return;
        }
        if (abstractC22407hel instanceof AbstractC22407hel.AssistContent) {
            AbstractC22407hel.AssistContent assistContent = (AbstractC22407hel.AssistContent) abstractC22407hel;
            this.djBIcL.EZpvd(assistContent.EZpvd(), assistContent.OLrzqt(), assistContent.copydefault(), assistContent.djBIcL(), assistContent.AEQbTJ(), assistContent.KWHzl());
            return;
        }
        if (abstractC22407hel instanceof AbstractC22407hel.Fragment) {
            AbstractC22407hel.Fragment fragment = (AbstractC22407hel.Fragment) abstractC22407hel;
            this.djBIcL.OLrzqt(fragment.OLrzqt(), fragment.AEQbTJ(), fragment.copydefault(), fragment.valueOf(), fragment.KWHzl(), fragment.EZpvd());
            return;
        }
        if (abstractC22407hel instanceof AbstractC22407hel.TaskDescription) {
            C6973aZV c6973aZV = this.AhwBna;
            AbstractC22407hel.TaskDescription taskDescription = (AbstractC22407hel.TaskDescription) abstractC22407hel;
            java.lang.String strOLrzqt3 = taskDescription.OLrzqt();
            OrderAndPositionTab orderAndPositionTabEZpvd = taskDescription.EZpvd();
            C19818gQl c19818gQlAEQbTJ = taskDescription.AEQbTJ();
            java.lang.String strAEQbTJ4 = c19818gQlAEQbTJ != null ? c19818gQlAEQbTJ.AEQbTJ() : null;
            java.lang.String str = strAEQbTJ4 == null ? "" : strAEQbTJ4;
            C19818gQl c19818gQlAEQbTJ2 = taskDescription.AEQbTJ();
            java.lang.String strEZpvd5 = c19818gQlAEQbTJ2 != null ? c19818gQlAEQbTJ2.EZpvd() : null;
            java.lang.String str2 = strEZpvd5 == null ? "" : strEZpvd5;
            C19818gQl c19818gQlAEQbTJ3 = taskDescription.AEQbTJ();
            java.lang.String strCopydefault3 = c19818gQlAEQbTJ3 != null ? c19818gQlAEQbTJ3.copydefault() : null;
            java.lang.String str3 = strCopydefault3 == null ? "" : strCopydefault3;
            C19818gQl c19818gQlAEQbTJ4 = taskDescription.AEQbTJ();
            c6973aZV.EZpvd(strOLrzqt3, orderAndPositionTabEZpvd, str, str2, str3, (64 & 32) != 0 ? null : c19818gQlAEQbTJ4 != null ? c19818gQlAEQbTJ4.KWHzl() : null, (64 & 64) != 0 ? yDY.AhwBna() : null);
            return;
        }
        if (abstractC22407hel instanceof AbstractC22407hel.Application) {
            C6971aZT c6971aZT = this.AYXKKw;
            AbstractC22407hel.Application application2 = (AbstractC22407hel.Application) abstractC22407hel;
            java.lang.String strEZpvd6 = application2.EZpvd();
            OrderAndPositionTab orderAndPositionTabAEQbTJ = application2.AEQbTJ();
            java.lang.String strCopydefault4 = application2.copydefault();
            C19818gQl c19818gQlKWHzl = application2.KWHzl();
            java.lang.String strAEQbTJ5 = c19818gQlKWHzl != null ? c19818gQlKWHzl.AEQbTJ() : null;
            java.lang.String str4 = strAEQbTJ5 == null ? "" : strAEQbTJ5;
            C19818gQl c19818gQlKWHzl2 = application2.KWHzl();
            java.lang.String strEZpvd7 = c19818gQlKWHzl2 != null ? c19818gQlKWHzl2.EZpvd() : null;
            java.lang.String str5 = strEZpvd7 == null ? "" : strEZpvd7;
            C19818gQl c19818gQlKWHzl3 = application2.KWHzl();
            java.lang.String strCopydefault5 = c19818gQlKWHzl3 != null ? c19818gQlKWHzl3.copydefault() : null;
            java.lang.String str6 = strCopydefault5 == null ? "" : strCopydefault5;
            C19818gQl c19818gQlKWHzl4 = application2.KWHzl();
            c6971aZT.OLrzqt(strEZpvd6, orderAndPositionTabAEQbTJ, strCopydefault4, str4, str5, str6, (128 & 64) != 0 ? null : c19818gQlKWHzl4 != null ? c19818gQlKWHzl4.KWHzl() : null, (128 & 128) != 0 ? yDY.AhwBna() : null);
        }
    }
}
