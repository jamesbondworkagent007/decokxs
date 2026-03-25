package o;

import androidx.appcompat.content.res.AppCompatResources;
import com.just.agentweb.DefaultWebClient;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.referral.bean.LayoutType;
import com.okinc.referral.bean.ReferralFooterInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48824ucv;
import o.C48894ueL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ucb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48804ucb implements InterfaceC49000ugL {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final android.content.Context OLrzqt;

    /* JADX INFO: renamed from: o.ucb$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LayoutType.values().length];
            try {
                iArr[LayoutType.TYPE1.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutType.TYPE2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutType.TYPE3.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    public C48804ucb(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.ucc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48804ucb.copydefault();
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ubZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48804ucb.EZpvd();
            }
        });
    }

    /* JADX INFO: renamed from: o.ucb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ucb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final InterfaceC47278tmy copydefault() {
        return (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    }

    public final InterfaceC47278tmy valueOf() {
        return (InterfaceC47278tmy) this.AEQbTJ.getValue();
    }

    public static final OKComplianceRestrictionService EZpvd() {
        return (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
    }

    public final OKComplianceRestrictionService KWHzl() {
        return (OKComplianceRestrictionService) this.EZpvd.getValue();
    }

    public final boolean isConnected() {
        return !KWHzl().AEQbTJ(OKComplianceRestrictionService.Feature.REFERRAL);
    }

    @Override // o.InterfaceC49000ugL
    public android.graphics.drawable.Drawable gEmmrt() {
        android.graphics.drawable.Drawable drawable;
        if (C34703nhO.AEQbTJ()) {
            drawable = AppCompatResources.getDrawable(this.OLrzqt, C48894ueL.ActionBar.wlaJM);
        } else {
            drawable = AppCompatResources.getDrawable(this.OLrzqt, C48894ueL.ActionBar.uzCIH);
        }
        int color = this.OLrzqt.getResources().getColor(C52761wXj.Activity.htlTjW);
        if (drawable != null) {
            drawable.setTint(color);
        }
        return drawable;
    }

    @Override // o.InterfaceC49000ugL
    public java.lang.CharSequence AYXKKw() {
        java.lang.String string;
        if (valueOf().AkhnZx() && isConnected()) {
            ReferralFooterInfo referralFooterInfoGEmmrt = C48808ucf.copydefault.gEmmrt();
            int i = TaskDescription.EZpvd[ReferralFooterInfo.Companion.copydefault(referralFooterInfoGEmmrt != null ? referralFooterInfoGEmmrt.getLayoutType() : null).ordinal()];
            if (i == 1) {
                string = this.OLrzqt.getResources().getString(C48824ucv.Application.djBIcL);
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                string = this.OLrzqt.getResources().getString(C48824ucv.Application.AYXKKw);
            }
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        java.lang.String strOLrzqt = C34703nhO.OLrzqt(C32979mnm.EZpvd.OLrzqt());
        pUU.KWHzl("OKFootView", "getTitle->:appName:" + strOLrzqt);
        android.content.res.Resources resources = this.OLrzqt.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return C33069mpW.copydefault(resources, C48894ueL.StateListAnimator.KWHzl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(new kotlin.Pair("platformName", strOLrzqt)));
    }

    @Override // o.InterfaceC49000ugL
    public java.lang.CharSequence AhwBna() {
        if (valueOf().AkhnZx() && isConnected()) {
            ReferralFooterInfo referralFooterInfoGEmmrt = C48808ucf.copydefault.gEmmrt();
            int i = TaskDescription.EZpvd[ReferralFooterInfo.Companion.copydefault(referralFooterInfoGEmmrt != null ? referralFooterInfoGEmmrt.getLayoutType() : null).ordinal()];
            if (i == 1) {
                java.lang.String referralCode = referralFooterInfoGEmmrt != null ? referralFooterInfoGEmmrt.getReferralCode() : null;
                if (referralCode != null && referralCode.length() != 0) {
                    return referralCode;
                }
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                java.lang.String strDjBIcL = djBIcL();
                if (strDjBIcL != null && strDjBIcL.length() != 0) {
                    return EZpvd(strDjBIcL);
                }
            }
            return "--";
        }
        java.lang.String strDjBIcL2 = djBIcL();
        if (strDjBIcL2 == null) {
            strDjBIcL2 = "";
        }
        return EZpvd(strDjBIcL2);
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return (str == null || str.length() == 0) ? str : C59449zhJ.replace$default(C59449zhJ.replace$default(str, DefaultWebClient.HTTPS_SCHEME, "", false, 4, (java.lang.Object) null), "http", "", false, 4, (java.lang.Object) null);
    }

    @Override // o.InterfaceC49000ugL
    public java.lang.String djBIcL() {
        if (valueOf().AkhnZx() && isConnected()) {
            C48808ucf c48808ucf = C48808ucf.copydefault;
            ReferralFooterInfo referralFooterInfoGEmmrt = c48808ucf.gEmmrt();
            java.lang.String shareUrl = referralFooterInfoGEmmrt != null ? referralFooterInfoGEmmrt.getShareUrl() : null;
            if (shareUrl != null && shareUrl.length() != 0) {
                return shareUrl;
            }
            c48808ucf.OLrzqt((AbstractActivityC33041mov) null);
            return shareUrl;
        }
        ReferralFooterInfo referralFooterInfoGEmmrt2 = C48808ucf.copydefault.gEmmrt();
        java.lang.String downloadUrl = referralFooterInfoGEmmrt2 != null ? referralFooterInfoGEmmrt2.getDownloadUrl() : null;
        if (C34703nhO.AEQbTJ()) {
            if (downloadUrl == null || downloadUrl.length() == 0) {
                return "https://tr.okx.com/download";
            }
        } else if (downloadUrl == null || downloadUrl.length() == 0) {
            return "https://okx.com/download";
        }
        return downloadUrl;
    }
}
