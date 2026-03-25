package o;

import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.share.bean.FootViewData;
import com.okinc.share.bean.ShareBizCondition;
import com.okinc.share.bean.ShareData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import o.C48894ueL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dTp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13661dTp implements InterfaceC49001ugM {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.dTq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C13661dTp.KWHzl();
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.dTr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C13661dTp.copydefault();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49001ugM
    public void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final OKComplianceRestrictionService valueOf() {
        return (OKComplianceRestrictionService) this.EZpvd.getValue();
    }

    public static final OKComplianceRestrictionService KWHzl() {
        return (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
    }

    public static final InterfaceC47278tmy copydefault() {
        return (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    }

    public final InterfaceC47278tmy gEmmrt() {
        return (InterfaceC47278tmy) this.AEQbTJ.getValue();
    }

    @Override // o.InterfaceC49001ugM
    public boolean OLrzqt(@NotNull C48984ufw c48984ufw) {
        Intrinsics.checkNotNullParameter(c48984ufw, "");
        return ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz() || c48984ufw.copydefault() == 3 || C34703nhO.copydefault();
    }

    @Override // o.InterfaceC49001ugM
    public ShareData AkhnZx() {
        ((xWP) C43251rlk.copydefault(xWP.class)).AEQbTJ();
        return new ShareData(new FootViewData(AYXKKw(), djBIcL(), AhwBna(), AEQbTJ()), null, 2, null);
    }

    @Override // o.InterfaceC49001ugM
    public ShareBizCondition values() {
        return new ShareBizCondition(gEmmrt().fJNWhG(), valueOf().AEQbTJ(OKComplianceRestrictionService.Feature.REFERRAL));
    }

    public final java.lang.CharSequence AYXKKw() {
        final java.lang.String first = DbNXlk().getFirst();
        final java.lang.String second = DbNXlk().getSecond();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) first)) {
            try {
                C32866mlf.onEvent$default("DexReferral_ShareWithCode_ShareLink_Click", (TrackChannel[]) null, new Function1() { // from class: o.dTn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C13661dTp.copydefault(second, first, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            } catch (java.lang.Exception unused) {
            }
            return C33069mpW.copydefault(C13754dXa.FragmentManager.QHmsKR, C56423yEv.EZpvd(C56390yDp.OLrzqt("code", first)));
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.gwwzsY);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("wallet_id", str, false);
        eventParamsList.put("referral_code", str2, false);
        eventParamsList.put("share_from", "screenshot", true);
        return Unit.INSTANCE;
    }

    public final java.lang.CharSequence djBIcL() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) DbNXlk().getFirst())) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.gwTjWJ);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.IKQXqd);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> DbNXlk() {
        try {
            java.util.List<AbstractC12782ctV> listCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault();
            if (true ^ listCopydefault.isEmpty()) {
                AbstractC12782ctV abstractC12782ctV = listCopydefault.get(0);
                return new kotlin.Pair<>(((xWP) C43251rlk.copydefault(xWP.class)).EZpvd(abstractC12782ctV.DbNXlk()), abstractC12782ctV.DbNXlk());
            }
            return new kotlin.Pair<>("", "");
        } catch (java.lang.Exception unused) {
            return new kotlin.Pair<>("", "");
        }
    }

    public final java.lang.String AhwBna() {
        java.lang.String first = DbNXlk().getFirst();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) first)) {
            return dJJ.copydefault.copydefault(ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null).DbNXlk(), C56390yDp.OLrzqt("ref", first));
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.DzOuPm);
    }

    public final android.graphics.drawable.Drawable AEQbTJ() {
        android.graphics.drawable.Drawable drawableKWHzl;
        if (C34703nhO.AEQbTJ()) {
            drawableKWHzl = C33070mpX.KWHzl(C48894ueL.ActionBar.wlaJM);
            Intrinsics.copydefault(drawableKWHzl);
        } else {
            drawableKWHzl = C33070mpX.KWHzl(C13754dXa.Activity.WS);
            Intrinsics.copydefault(drawableKWHzl);
        }
        drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
        return drawableKWHzl;
    }
}
