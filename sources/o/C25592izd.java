package o;

import com.okinc.business.invest_api.bean.DeFiApyDataInfoData;
import com.okinc.business.invest_api.bean.Web3CampaignResponse;
import com.okinc.business.invest_biz.data.bean.InvestCallDataReq;
import com.okinc.business.invest_biz.data.bean.InvestDetail;
import com.okinc.business.invest_biz.data.bean.InvestDetailOrderVo;
import com.okinc.business.invest_biz.data.bean.InvestFilterData;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestGetGasFeeRequest;
import com.okinc.business.invest_biz.data.bean.InvestGetGasFeeResponse;
import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestTxData;
import com.okinc.business.invest_biz.data.bean.InvestUniv3ChartData;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo;
import com.okinc.business.invest_biz.data.bean.request.HomeOrderParam;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq;
import com.okinc.business.invest_biz.data.bean.request.InvestTokenBalanceReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemReceiveReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeReceiveReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUserUnstakeInfoParam;
import com.okinc.business.invest_biz.data.bean.request.ValidatorRequestParam;
import com.okinc.business.invest_biz.data.models.DetailOrderParam;
import com.okinc.business.invest_biz.data.models.InvestHomeOrderVo;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.widget.risk.InvestRiskRatingModel;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.JsonObject;
import o.InterfaceC25472ixP;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.izd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25592izd {
    public static final C25592izd OLrzqt = new C25592izd();

    private C25592izd() {
    }

    public final InterfaceC25472ixP KWHzl() {
        return InterfaceC25472ixP.Companion.EZpvd(new iBA(null, null, null, 7, null));
    }

    public final AbstractC58185ywX<InterfaceC25472ixP> EZpvd(final java.lang.String str) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<InterfaceC25472ixP> abstractC58185ywXCopydefault = C25471ixO.EZpvd(new InterfaceC58187ywZ() { // from class: o.izP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C25592izd.KWHzl(objectRef, str, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.izM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C25592izd.AEQbTJ(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(InterfaceC58184ywW interfaceC58184ywW, java.lang.String str, java.lang.String str2) {
        InterfaceC25472ixP.TaskDescription taskDescription = InterfaceC25472ixP.Companion;
        Intrinsics.copydefault((java.lang.Object) str2);
        if (str == null) {
            str = "";
        }
        interfaceC58184ywW.onNext(taskDescription.EZpvd(new iBA(str2, str, "TIME")));
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onNext(OLrzqt.KWHzl());
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<InvestDetail>>> copydefault() {
        return C33527myD.KWHzl(KWHzl().EZpvd());
    }

    public final AbstractC58185ywX<ResponseData<InvestFilterData>> AEQbTJ() {
        return C33527myD.KWHzl(KWHzl().KWHzl());
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<InvestValidatorListItems>>> AEQbTJ(long j, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(KWHzl().AEQbTJ(new ValidatorRequestParam(j, i, str)));
    }

    public static final InterfaceC60096zvd iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo>> */
    public final AbstractC58185ywX<ResponseData<InvestSubscriptionInfo>> copydefault(final long j, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final boolean z, @NotNull final java.lang.String str3, final java.lang.Integer num, final java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX<InterfaceC25472ixP> abstractC58185ywXEZpvd = EZpvd(str);
        final Function1 function1 = new Function1() { // from class: o.izJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.KWHzl(j, str, z, str2, str3, num, num2, (InterfaceC25472ixP) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.izI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25592izd.iwGUEr(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd KWHzl(long j, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, InterfaceC25472ixP interfaceC25472ixP) {
        Intrinsics.checkNotNullParameter(interfaceC25472ixP, "");
        return C33527myD.KWHzl(interfaceC25472ixP.OLrzqt(new InvestSubscriptionInitialReq(j, str, z, str2, str3, (java.lang.String) null, num, num2, (java.lang.Long) null, 288, (DefaultConstructorMarker) null)));
    }

    public static final InterfaceC60096zvd uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo>> */
    public final AbstractC58185ywX<ResponseData<InvestSubscriptionReceiveInfo>> EZpvd(@NotNull final InvestSubscriptionReceiveReq investSubscriptionReceiveReq) {
        Intrinsics.checkNotNullParameter(investSubscriptionReceiveReq, "");
        AbstractC58185ywX<InterfaceC25472ixP> abstractC58185ywXEZpvd = EZpvd(investSubscriptionReceiveReq.getAccountId());
        final Function1 function1 = new Function1() { // from class: o.izz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.AEQbTJ(investSubscriptionReceiveReq, (InterfaceC25472ixP) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.izG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25592izd.uzCIH(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AEQbTJ(InvestSubscriptionReceiveReq investSubscriptionReceiveReq, InterfaceC25472ixP interfaceC25472ixP) {
        Intrinsics.checkNotNullParameter(interfaceC25472ixP, "");
        return C33527myD.KWHzl(interfaceC25472ixP.OLrzqt(investSubscriptionReceiveReq));
    }

    public static final InterfaceC60096zvd AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo>> */
    public final AbstractC58185ywX<ResponseData<InvestUniv3SubscribeInfo>> EZpvd(final long j, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final boolean z, @NotNull final java.lang.String str3, final java.lang.String str4, final boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX<InterfaceC25472ixP> abstractC58185ywXEZpvd = EZpvd(str);
        final Function1 function1 = new Function1() { // from class: o.izA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.KWHzl(str3, str2, j, z, str4, str, z2, (InterfaceC25472ixP) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.izB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25592izd.AubY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd KWHzl(java.lang.String str, java.lang.String str2, long j, boolean z, java.lang.String str3, java.lang.String str4, boolean z2, InterfaceC25472ixP interfaceC25472ixP) {
        Intrinsics.checkNotNullParameter(interfaceC25472ixP, "");
        return C33527myD.KWHzl(interfaceC25472ixP.AEQbTJ(new InvestUniv3SubscribeInitialReq(str, str2, j, java.lang.Boolean.valueOf(z), str3, str4, z2)));
    }

    public static final InterfaceC60096zvd zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo>> */
    public final AbstractC58185ywX<ResponseData<InvestUniv3SubscribeReceiveInfo>> KWHzl(@NotNull final InvestUniv3SubscribeReceiveReq investUniv3SubscribeReceiveReq) {
        Intrinsics.checkNotNullParameter(investUniv3SubscribeReceiveReq, "");
        AbstractC58185ywX<InterfaceC25472ixP> abstractC58185ywXEZpvd = EZpvd(investUniv3SubscribeReceiveReq.getAccountId());
        final Function1 function1 = new Function1() { // from class: o.izr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.EZpvd(investUniv3SubscribeReceiveReq, (InterfaceC25472ixP) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.izq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25592izd.zLjUOn(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd EZpvd(InvestUniv3SubscribeReceiveReq investUniv3SubscribeReceiveReq, InterfaceC25472ixP interfaceC25472ixP) {
        Intrinsics.checkNotNullParameter(interfaceC25472ixP, "");
        return C33527myD.KWHzl(interfaceC25472ixP.AEQbTJ(investUniv3SubscribeReceiveReq));
    }

    public static final InterfaceC60096zvd wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r11v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>>> */
    public final AbstractC58185ywX<ResponseData<java.util.List<InvestTokenWithAmount>>> KWHzl(@NotNull final java.lang.String str, final long j, @NotNull final java.util.List<java.lang.String> list, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58185ywX<InterfaceC25472ixP> abstractC58185ywXEZpvd = EZpvd(str2);
        final Function1 function1 = new Function1() { // from class: o.izk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.EZpvd(str, j, list, str2, (InterfaceC25472ixP) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.izl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25592izd.wlaJM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd EZpvd(java.lang.String str, long j, java.util.List list, java.lang.String str2, InterfaceC25472ixP interfaceC25472ixP) {
        Intrinsics.checkNotNullParameter(interfaceC25472ixP, "");
        return C33527myD.KWHzl(interfaceC25472ixP.OLrzqt(new InvestTokenBalanceReq(str, j, list, str2)));
    }

    public final AbstractC58185ywX<ResponseData<InvestGasPriceConfig>> KWHzl(long j, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(KWHzl().OLrzqt(j, i, str));
    }

    public static final InterfaceC60096zvd getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo>> */
    public final AbstractC58185ywX<ResponseData<InvestRedeemInitialInfo>> EZpvd(@NotNull java.lang.String str, final long j, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final boolean z, final int i, final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX<InterfaceC25472ixP> abstractC58185ywXEZpvd = EZpvd(str);
        final Function1 function1 = new Function1() { // from class: o.izw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.copydefault(j, str2, str3, z, i, str4, (InterfaceC25472ixP) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.izD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25592izd.getFieldNames(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd copydefault(long j, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.String str3, InterfaceC25472ixP interfaceC25472ixP) {
        Intrinsics.checkNotNullParameter(interfaceC25472ixP, "");
        return C33527myD.KWHzl(interfaceC25472ixP.OLrzqt(new InvestRedeemInitialReq(j, str, str2, z, i, (java.lang.Integer) null, str3, (java.lang.String) null, 128, (DefaultConstructorMarker) null)));
    }

    public static final InterfaceC60096zvd hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo>> */
    public final AbstractC58185ywX<ResponseData<InvestRedeemReceiveInfo>> AEQbTJ(@NotNull final InvestRedeemReceiveReq investRedeemReceiveReq) {
        Intrinsics.checkNotNullParameter(investRedeemReceiveReq, "");
        AbstractC58185ywX<InterfaceC25472ixP> abstractC58185ywXEZpvd = EZpvd(investRedeemReceiveReq.getAccountId());
        final Function1 function1 = new Function1() { // from class: o.izo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.KWHzl(investRedeemReceiveReq, (InterfaceC25472ixP) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.izn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25592izd.hDKMBd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd KWHzl(InvestRedeemReceiveReq investRedeemReceiveReq, InterfaceC25472ixP interfaceC25472ixP) {
        Intrinsics.checkNotNullParameter(interfaceC25472ixP, "");
        return C33527myD.KWHzl(interfaceC25472ixP.EZpvd(investRedeemReceiveReq));
    }

    public static final InterfaceC60096zvd AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemInitialInfo>> */
    public final AbstractC58185ywX<ResponseData<InvestUniv3RedeemInitialInfo>> AEQbTJ(@NotNull java.lang.String str, final long j, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final boolean z, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        AbstractC58185ywX<InterfaceC25472ixP> abstractC58185ywXEZpvd = EZpvd(str);
        final Function1 function1 = new Function1() { // from class: o.izF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.copydefault(j, str2, str3, z, str4, (InterfaceC25472ixP) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.izC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25592izd.AuCTelauCTel(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd copydefault(long j, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, InterfaceC25472ixP interfaceC25472ixP) {
        Intrinsics.checkNotNullParameter(interfaceC25472ixP, "");
        return C33527myD.KWHzl(interfaceC25472ixP.KWHzl(new InvestUniv3RedeemInitialReq(j, str, str2, z, str3, false, 32, (DefaultConstructorMarker) null)));
    }

    public static final InterfaceC60096zvd zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo>> */
    public final AbstractC58185ywX<ResponseData<InvestUniv3RedeemReceiveInfo>> copydefault(@NotNull final InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq) {
        Intrinsics.checkNotNullParameter(investUniv3RedeemReceiveReq, "");
        AbstractC58185ywX<InterfaceC25472ixP> abstractC58185ywXEZpvd = EZpvd(investUniv3RedeemReceiveReq.getAccountId());
        final Function1 function1 = new Function1() { // from class: o.izj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.copydefault(investUniv3RedeemReceiveReq, (InterfaceC25472ixP) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.izp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25592izd.zsXlph(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd copydefault(InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq, InterfaceC25472ixP interfaceC25472ixP) {
        Intrinsics.checkNotNullParameter(interfaceC25472ixP, "");
        return C33527myD.KWHzl(interfaceC25472ixP.copydefault(investUniv3RedeemReceiveReq));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Object>> AEQbTJ(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33527myD.KWHzl(KWHzl().copydefault(j, str, str2));
    }

    public static final InterfaceC60096zvd AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.invest_biz.data.models.InvestHomeOrderVo>> */
    public final AbstractC58185ywX<ResponseData<InvestHomeOrderVo>> EZpvd(@NotNull java.lang.String str, final long j, final long j2, @NotNull final java.util.List<java.lang.String> list, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX<InterfaceC25472ixP> abstractC58185ywXEZpvd = EZpvd(str);
        final Function1 function1 = new Function1() { // from class: o.izi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.EZpvd(j, j2, list, i, i2, (InterfaceC25472ixP) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.izm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25592izd.AuCTel(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd EZpvd(long j, long j2, java.util.List list, int i, int i2, InterfaceC25472ixP interfaceC25472ixP) {
        Intrinsics.checkNotNullParameter(interfaceC25472ixP, "");
        return C33527myD.KWHzl(interfaceC25472ixP.copydefault(new DetailOrderParam(j, j2, list, i, i2)));
    }

    public static /* synthetic */ AbstractC58185ywX getInvestOrderList$default(C25592izd c25592izd, java.lang.String str, java.lang.Long l, java.lang.Integer num, java.util.List list, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 16) != 0) {
            i = 10;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = 1;
        }
        return c25592izd.KWHzl(str, l, num, (java.util.List<InvestWalletAddressInfo>) list, i4, i2);
    }

    public static final InterfaceC60096zvd getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r10v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.invest_biz.data.bean.InvestDetailOrderVo>> */
    public final AbstractC58185ywX<ResponseData<InvestDetailOrderVo>> KWHzl(@NotNull java.lang.String str, final java.lang.Long l, final java.lang.Integer num, @NotNull final java.util.List<InvestWalletAddressInfo> list, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX<InterfaceC25472ixP> abstractC58185ywXEZpvd = EZpvd(str);
        final Function1 function1 = new Function1() { // from class: o.izx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.KWHzl(l, num, list, i, i2, (InterfaceC25472ixP) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.izy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25592izd.getNewProxyInstance(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd KWHzl(java.lang.Long l, java.lang.Integer num, java.util.List list, int i, int i2, InterfaceC25472ixP interfaceC25472ixP) {
        Intrinsics.checkNotNullParameter(interfaceC25472ixP, "");
        return C33527myD.KWHzl(interfaceC25472ixP.copydefault(new HomeOrderParam(l, num, list, i, i2)));
    }

    public static final InterfaceC60096zvd fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<kotlinx.serialization.json.JsonObject>> */
    public final AbstractC58185ywX<ResponseData<JsonObject>> copydefault(@NotNull final InvestCallDataReq investCallDataReq) {
        Intrinsics.checkNotNullParameter(investCallDataReq, "");
        AbstractC58185ywX<InterfaceC25472ixP> abstractC58185ywXEZpvd = EZpvd(investCallDataReq.getAccountId());
        final Function1 function1 = new Function1() { // from class: o.izH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.copydefault(investCallDataReq, (InterfaceC25472ixP) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.izK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25592izd.fARcdN(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd copydefault(InvestCallDataReq investCallDataReq, InterfaceC25472ixP interfaceC25472ixP) {
        Intrinsics.checkNotNullParameter(interfaceC25472ixP, "");
        return C33527myD.KWHzl(interfaceC25472ixP.KWHzl(investCallDataReq));
    }

    public static final InterfaceC60096zvd ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<kotlinx.serialization.json.JsonObject>> */
    public final AbstractC58185ywX<ResponseData<JsonObject>> AEQbTJ(@NotNull final InvestCallDataReq investCallDataReq) {
        Intrinsics.checkNotNullParameter(investCallDataReq, "");
        AbstractC58185ywX<InterfaceC25472ixP> abstractC58185ywXEZpvd = EZpvd(investCallDataReq.getAccountId());
        final Function1 function1 = new Function1() { // from class: o.izE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.KWHzl(investCallDataReq, (InterfaceC25472ixP) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.izL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25592izd.ejfBZ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd KWHzl(InvestCallDataReq investCallDataReq, InterfaceC25472ixP interfaceC25472ixP) {
        Intrinsics.checkNotNullParameter(interfaceC25472ixP, "");
        return C33527myD.KWHzl(interfaceC25472ixP.AEQbTJ(investCallDataReq));
    }

    public final AbstractC58185ywX<ResponseData<InvestTxData>> copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map, RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(map, "");
        return C33527myD.KWHzl(InterfaceC25472ixP.submitTransaction$default(KWHzl(), map, requestBody, null, 4, null));
    }

    public static /* synthetic */ AbstractC58185ywX getTokenApyData$default(C25592izd c25592izd, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c25592izd.copydefault(z);
    }

    public final AbstractC58185ywX<ResponseData<java.util.HashMap<java.lang.String, DeFiApyDataInfoData>>> copydefault(boolean z) {
        return C33527myD.KWHzl(KWHzl().OLrzqt(z ? "FIRST_CACHE" : "NO_CACHE", z ? 120 : 0, 0));
    }

    public final java.lang.Object AEQbTJ(@NotNull InvestUserUnstakeInfoParam investUserUnstakeInfoParam, @NotNull Continuation<? super ResponseData<InvestUserClaimInfoResponse>> continuation) {
        return KWHzl().OLrzqt(investUserUnstakeInfoParam, continuation);
    }

    public static /* synthetic */ java.lang.Object getUniv3ChartData$default(C25592izd c25592izd, long j, int i, java.lang.Integer num, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        return c25592izd.KWHzl(j, i, num, (Continuation<? super ResponseData<java.util.List<InvestUniv3ChartData>>>) continuation);
    }

    public final java.lang.Object KWHzl(long j, int i, java.lang.Integer num, @NotNull Continuation<? super ResponseData<java.util.List<InvestUniv3ChartData>>> continuation) {
        return KWHzl().KWHzl(j, i, num, continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull InvestGetGasFeeRequest investGetGasFeeRequest, @NotNull Continuation<? super ResponseData<InvestGetGasFeeResponse>> continuation) {
        return KWHzl().AEQbTJ(investGetGasFeeRequest, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull InvestGetGasFeeRequest investGetGasFeeRequest, @NotNull Continuation<? super ResponseData<InvestGetGasFeeResponse>> continuation) {
        return KWHzl().KWHzl(investGetGasFeeRequest, continuation);
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<java.util.List<InvestRiskRatingModel>>> continuation) {
        return InterfaceC25472ixP.getProtocolRating$default(KWHzl(), null, continuation, 1, null);
    }

    public final AbstractC58185ywX<ResponseData<Web3CampaignResponse>> EZpvd(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33527myD.KWHzl(InterfaceC25472ixP.getWeb3ClaimRewardInfo$default(KWHzl(), null, str, i, str2, i2, 1, null));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, o.yxC] */
    public static final void KWHzl(Ref.ObjectRef objectRef, final java.lang.String str, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        AbstractC58185ywX<java.lang.String> abstractC58185ywXG_ = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).g_(str != null ? str : "");
        final Function1 function1 = new Function1() { // from class: o.izt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.AEQbTJ(interfaceC58184ywW, str, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.String> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.izv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25592izd.fJNWhG(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.izu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25592izd.EZpvd(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXG_.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.izs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25592izd.fIwbmz(function12, obj);
            }
        });
    }
}
