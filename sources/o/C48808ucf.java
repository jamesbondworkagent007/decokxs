package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.referral.bean.ReferralFooterInfo;
import com.okinc.referral.biz.net.bean.ShareFooterInfoResp;
import com.okinc.referral.biz.net.service.ReferralUserService;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33041mov;
import o.C48808ucf;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ucf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48808ucf {
    public static ReferralFooterInfo AEQbTJ;
    public static final InterfaceC56387yDm EZpvd;
    public static final InterfaceC56387yDm KWHzl;
    public static final int OLrzqt;
    public static final C48808ucf copydefault;

    private C48808ucf() {
    }

    public final void OLrzqt(ReferralFooterInfo referralFooterInfo) {
        java.lang.String shareUrl;
        AEQbTJ = referralFooterInfo;
        if (referralFooterInfo == null || (shareUrl = referralFooterInfo.getShareUrl()) == null) {
            shareUrl = "--";
        }
        C33084mpl.AEQbTJ("share_invite_refer_url", shareUrl);
        pUU.KWHzl("ShareFooterInfoManager", "update share config value->  referralUrl:" + C33084mpl.OLrzqt("share_invite_refer_url", ""));
    }

    static {
        final C48808ucf c48808ucf = new C48808ucf();
        copydefault = c48808ucf;
        EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ucl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48808ucf.KWHzl();
            }
        });
        KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ucn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48808ucf.copydefault();
            }
        });
        RxBus.AEQbTJ("ev_account_login", "ev_account_change", "ev_account_logout", "EVENT_CHANGE_LANGUAGE", "affiliate_home_refresh_event").subscribe(new RxBus.EventCallback<java.lang.String>(c48808ucf) { // from class: com.okinc.referral.share.manager.ReferralFooterInfoManager$1
            {
                super(c48808ucf);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                pUU.KWHzl("ShareFooterInfoManager", "onEvent->:" + str);
                C48808ucf c48808ucf2 = C48808ucf.copydefault;
                c48808ucf2.AhwBna();
                c48808ucf2.OLrzqt((AbstractActivityC33041mov) null);
            }
        });
        OLrzqt = 8;
    }

    public static final InterfaceC47278tmy KWHzl() {
        return (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    }

    public final InterfaceC47278tmy AYXKKw() {
        return (InterfaceC47278tmy) EZpvd.getValue();
    }

    public static final OKComplianceRestrictionService copydefault() {
        return (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
    }

    public final OKComplianceRestrictionService djBIcL() {
        return (OKComplianceRestrictionService) KWHzl.getValue();
    }

    public final void AhwBna() {
        OLrzqt((ReferralFooterInfo) null);
    }

    public final boolean EZpvd() {
        boolean zFJNWhG = AYXKKw().fJNWhG();
        boolean zAEQbTJ = djBIcL().AEQbTJ(OKComplianceRestrictionService.Feature.REFERRAL);
        boolean z = !zFJNWhG;
        pUU.KWHzl("ShareFooterInfoManager", "canLoadNetworkShareFooterInfo->:" + z + " isDemoTrading:" + zFJNWhG + " isReferralHidden:" + zAEQbTJ);
        return z;
    }

    public static final Unit djBIcL(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ucf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadReferralFooterInfo$default(C48808ucf c48808ucf, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function12 = new Function1() { // from class: o.uck
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C48808ucf.djBIcL((java.lang.Throwable) obj2);
                }
            };
        }
        c48808ucf.KWHzl(lifecycleOwner, function1, function12);
    }

    public final void KWHzl(LifecycleOwner lifecycleOwner, @NotNull final Function1<? super ReferralFooterInfo, Unit> function1, @NotNull final Function1<? super java.lang.Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        if (AEQbTJ != null) {
            pUU.KWHzl("ShareFooterInfoManager", " cached ShareFooterInfo exist, ignore this request!");
            ReferralFooterInfo referralFooterInfo = AEQbTJ;
            Intrinsics.copydefault(referralFooterInfo);
            function1.invoke(referralFooterInfo);
            return;
        }
        if (EZpvd()) {
            AbstractC58185ywX<ResponseData<ShareFooterInfoResp>> shareFooterInfo = ReferralUserService.Companion.EZpvd().getShareFooterInfo();
            final Function1 function13 = new Function1() { // from class: o.ucq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C48808ucf.AEQbTJ((ResponseData) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = shareFooterInfo.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ucp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C48808ucf.copydefault(function13, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) abstractC58185ywXAEQbTJ);
            if (lifecycleOwner != null) {
                C58156yvv.EZpvd(abstractC58185ywXKWHzl, lifecycleOwner);
            }
            final Function1 function14 = new Function1() { // from class: o.ucx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C48808ucf.copydefault(function1, (ReferralFooterInfo) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ucu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C48808ucf.valueOf(function14, obj);
                }
            };
            final Function1 function15 = new Function1() { // from class: o.ucm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C48808ucf.OLrzqt(function1, function12, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ucj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C48808ucf.OLrzqt(function15, obj);
                }
            });
            return;
        }
        KWHzl(function1, function12);
    }

    public static final ReferralFooterInfo copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ReferralFooterInfo) function1.invoke(obj);
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function1 function1, ReferralFooterInfo referralFooterInfo) {
        copydefault.OLrzqt(referralFooterInfo);
        C48825ucw c48825ucw = C48825ucw.KWHzl;
        Intrinsics.copydefault(referralFooterInfo);
        c48825ucw.KWHzl(referralFooterInfo);
        function1.invoke(referralFooterInfo);
        pUU.KWHzl("ShareFooterInfoManager", "ReferralUserService.getShareFooterInfo()->onNext:" + referralFooterInfo + " ");
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, Function1 function12, java.lang.Throwable th) {
        pUU.copydefault("ShareFooterInfoManager", "ReferralUserService.getShareFooterInfo()->:onError" + th.getMessage() + " ");
        copydefault.KWHzl((Function1<? super ReferralFooterInfo, Unit>) function1, (Function1<? super java.lang.Throwable, Unit>) function12);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ucf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadLocalShareFooterInfo$default(C48808ucf c48808ucf, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function12 = new Function1() { // from class: o.uco
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C48808ucf.KWHzl((java.lang.Throwable) obj2);
                }
            };
        }
        c48808ucf.KWHzl((Function1<? super ReferralFooterInfo, Unit>) function1, (Function1<? super java.lang.Throwable, Unit>) function12);
    }

    public final void KWHzl(Function1<? super ReferralFooterInfo, Unit> function1, Function1<? super java.lang.Throwable, Unit> function12) {
        ReferralFooterInfo referralFooterInfoKWHzl = C48825ucw.KWHzl.KWHzl();
        pUU.KWHzl("ShareFooterInfoManager", "loadLocalShareFooterInfo:" + referralFooterInfoKWHzl + " ");
        if (referralFooterInfoKWHzl != null) {
            function1.invoke(referralFooterInfoKWHzl);
        } else {
            function12.invoke(new java.lang.IllegalStateException("empty localShareFooterInfo"));
        }
    }

    public final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov) {
        pUU.valueOf("ShareFooterInfoManager", "initFooterInfoForShare");
        KWHzl(abstractActivityC33041mov, new Function1() { // from class: o.ucr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48808ucf.KWHzl((ReferralFooterInfo) obj);
            }
        }, new Function1() { // from class: o.ucs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48808ucf.copydefault((java.lang.Throwable) obj);
            }
        });
    }

    public static final Unit KWHzl(ReferralFooterInfo referralFooterInfo) {
        Intrinsics.checkNotNullParameter(referralFooterInfo, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public final ReferralFooterInfo gEmmrt() {
        ReferralFooterInfo referralFooterInfo = AEQbTJ;
        return referralFooterInfo != null ? referralFooterInfo : C48825ucw.KWHzl.KWHzl();
    }

    public static final ReferralFooterInfo AEQbTJ(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            ReferralFooterInfo referralFooterInfoResolveReferralFooterInfo = ((ShareFooterInfoResp) data).resolveReferralFooterInfo();
            if (referralFooterInfoResolveReferralFooterInfo != null) {
                return referralFooterInfoResolveReferralFooterInfo;
            }
            throw new java.lang.IllegalArgumentException("illegal response data:" + responseData.getData());
        }
        throw new java.lang.IllegalArgumentException("response code is " + responseData.getCode());
    }
}
