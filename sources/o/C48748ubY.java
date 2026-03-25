package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.referral.bean.ReferralFooterInfo;
import com.okinc.share.bean.FootViewData;
import com.okinc.share.bean.ShareBizCondition;
import com.okinc.share.bean.ShareData;
import com.okinc.share.bean.ShareFooterInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ubY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48748ubY implements InterfaceC49001ugM {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ubV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C48748ubY.copydefault();
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ubW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C48748ubY.AYXKKw();
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.ubX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C48748ubY.KWHzl();
        }
    });

    public static final C48804ucb copydefault() {
        return new C48804ucb(C32979mnm.EZpvd.OLrzqt());
    }

    public final C48804ucb gEmmrt() {
        return (C48804ucb) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC47278tmy AYXKKw() {
        return (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    }

    private final InterfaceC47278tmy AhwBna() {
        return (InterfaceC47278tmy) this.OLrzqt.getValue();
    }

    public static final OKComplianceRestrictionService KWHzl() {
        return (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
    }

    private final OKComplianceRestrictionService djBIcL() {
        return (OKComplianceRestrictionService) this.copydefault.getValue();
    }

    @Override // o.InterfaceC49001ugM
    public void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C48808ucf.copydefault.OLrzqt((AbstractActivityC33041mov) null);
    }

    @Override // o.InterfaceC49001ugM
    public boolean OLrzqt(@NotNull C48984ufw c48984ufw) {
        Intrinsics.checkNotNullParameter(c48984ufw, "");
        return (C34703nhO.copydefault() || (c48984ufw.copydefault() == 3)) ? false : true;
    }

    @Override // o.InterfaceC49001ugM
    public ShareData AkhnZx() {
        ReferralFooterInfo referralFooterInfoGEmmrt = C48808ucf.copydefault.gEmmrt();
        return new ShareData(new FootViewData(gEmmrt().AYXKKw(), gEmmrt().AhwBna(), gEmmrt().djBIcL(), gEmmrt().gEmmrt()), referralFooterInfoGEmmrt != null ? EZpvd(referralFooterInfoGEmmrt) : null);
    }

    @Override // o.InterfaceC49001ugM
    public ShareBizCondition values() {
        return new ShareBizCondition(AhwBna().fJNWhG(), djBIcL().AEQbTJ(OKComplianceRestrictionService.Feature.REFERRAL));
    }

    public final ShareFooterInfo EZpvd(ReferralFooterInfo referralFooterInfo) {
        return new ShareFooterInfo(referralFooterInfo.getLayoutType(), referralFooterInfo.getDownloadUrl(), referralFooterInfo.getShareUrl(), referralFooterInfo.getReferralCode(), referralFooterInfo.getInviterShareText(), referralFooterInfo.getInviteeShareText());
    }
}
