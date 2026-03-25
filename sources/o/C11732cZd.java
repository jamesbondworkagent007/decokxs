package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.WalletDappInteractionBizService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cZd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11732cZd extends AbstractC43215rlA implements xWG {
    public AbstractC8610bFv<?> copydefault;

    /* JADX INFO: renamed from: o.cZd$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC9740bbL.TaskDescription {
        @Override // o.InterfaceC9740bbL.TaskDescription
        public void EZpvd() {
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void copydefault() {
        }
    }

    public static final java.lang.Boolean OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean copydefault(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return (java.lang.Boolean) pair.getFirst();
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Boolean> */
    @Override // o.xWG
    public AbstractC58260yxt<java.lang.Boolean> KWHzl(@NotNull DappSignArgs dappSignArgs) {
        Intrinsics.checkNotNullParameter(dappSignArgs, "");
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtOLrzqt = OLrzqt(dappSignArgs);
        final Function1 function1 = new Function1() { // from class: o.cZe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11732cZd.copydefault((kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cZa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11732cZd.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final kotlin.Pair copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt(@NotNull DappSignArgs dappSignArgs) {
        Intrinsics.checkNotNullParameter(dappSignArgs, "");
        AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> abstractC58260yxtCopydefault = C8396bBt.AEQbTJ.copydefault(dappSignArgs);
        final Function1 function1 = new Function1() { // from class: o.cZi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11732cZd.KWHzl(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cZf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11732cZd.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final kotlin.Pair KWHzl(C11732cZd c11732cZd, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Object first = pair.getFirst();
        AbstractC8610bFv<?> abstractC8610bFv = first instanceof AbstractC8610bFv ? (AbstractC8610bFv) first : null;
        c11732cZd.copydefault = abstractC8610bFv;
        boolean z = abstractC8610bFv != null;
        java.lang.String str = (java.lang.String) pair.getSecond();
        return C56390yDp.OLrzqt(java.lang.Boolean.valueOf(z), str != null ? str : "");
    }

    @Override // o.xWG
    public AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> KWHzl(@NotNull final FragmentActivity fragmentActivity, @NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        AbstractC8610bFv<?> abstractC8610bFv = this.copydefault;
        if (abstractC8610bFv == null) {
            AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new WalletDappInteractionBizService.SubmitResult(-1, null, null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        if (abstractC8610bFv.UlJrfe().AEQbTJ(C56524yIo.AEQbTJ(C9810bcc.class))) {
            AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new WalletDappInteractionBizService.SubmitResult(7, fragmentActivity.getString(C13754dXa.FragmentManager.InterpolatorRes), null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        AbstractC58185ywX abstractC58185ywXEZpvd = C8396bBt.submitWithIgnoreCondition$default(C8396bBt.AEQbTJ, fragmentActivity, abstractC8610bFv, false, z, true, false, new StateListAnimator(), 32, null).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cZb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11732cZd.OLrzqt(this.EZpvd, fragmentActivity, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cZc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11732cZd.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final WalletDappInteractionBizService.SubmitResult djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (WalletDappInteractionBizService.SubmitResult) function1.invoke(obj);
    }

    public static final WalletDappInteractionBizService.SubmitResult OLrzqt(C11732cZd c11732cZd, FragmentActivity fragmentActivity, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        int code = responseData.getCode();
        if (code != -5014) {
            switch (code) {
                case -5007:
                    return new WalletDappInteractionBizService.SubmitResult(8, null, null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
                case -5006:
                    return new WalletDappInteractionBizService.SubmitResult(7, fragmentActivity.getString(C13754dXa.FragmentManager.unregisterCallbackListener), null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
                case -5005:
                    return new WalletDappInteractionBizService.SubmitResult(6, fragmentActivity.getString(C13754dXa.FragmentManager.DRGLNw), null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
                case -5004:
                    return new WalletDappInteractionBizService.SubmitResult(5, fragmentActivity.getString(C13754dXa.FragmentManager.sYcwUD), null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
                case -5003:
                    return new WalletDappInteractionBizService.SubmitResult(4, fragmentActivity.getString(C13754dXa.FragmentManager.zpGcln), null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
                case -5002:
                    return new WalletDappInteractionBizService.SubmitResult(4, fragmentActivity.getString(C13754dXa.FragmentManager.FhERFw), null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
                case -5001:
                    AbstractC8610bFv<?> abstractC8610bFv = c11732cZd.copydefault;
                    if (abstractC8610bFv != null) {
                        abstractC8610bFv.fFgQHt();
                    }
                    c11732cZd.copydefault = null;
                    C9748bbT c9748bbT = (C9748bbT) responseData.getData();
                    return new WalletDappInteractionBizService.SubmitResult(0, null, null, null, null, c9748bbT != null ? c9748bbT.AEQbTJ() : null, null, false, false, 478, null);
                case -5000:
                    return new WalletDappInteractionBizService.SubmitResult(-1, fragmentActivity.getString(C13754dXa.FragmentManager.Dfm), null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
                default:
                    return new WalletDappInteractionBizService.SubmitResult(-1, null, null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
            }
        }
        return new WalletDappInteractionBizService.SubmitResult(2, null, null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
    }
}
