package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexRouterList;
import com.okinc.business.dexlogic.bean.SubRouter;
import com.okinc.business.dexlogic.main.swap.route.SmartRoutingViewModel;
import com.okinc.business.dexui.main.swap.route.SmartRoutingData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.idK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24408idK extends AbstractC59533zio<DexRouterList, Activity> {
    public final Function1<SubRouter, Unit> EZpvd;
    public int KWHzl;
    public final SmartRoutingViewModel copydefault;

    /* JADX INFO: renamed from: o.idK$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SmartRoutingViewModel.RouteType.values().length];
            try {
                iArr[SmartRoutingViewModel.RouteType.SINGLE_MORE_ROUTE_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SmartRoutingViewModel.RouteType.SINGLE_BIG_ROUTE_TYPE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SmartRoutingViewModel.RouteType.DOUBLE_ROUTE_TYPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SmartRoutingViewModel.RouteType.THREE_ROUTE_TYPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dexlogic.bean.SubRouter, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C24408idK(@NotNull SmartRoutingViewModel smartRoutingViewModel, @NotNull Function1<? super SubRouter, Unit> function1) {
        Intrinsics.checkNotNullParameter(smartRoutingViewModel, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = smartRoutingViewModel;
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        DexRouterList dexRouterList = (DexRouterList) CollectionsKt___CollectionsKt.AuCTelauCTel(this.copydefault.copydefault());
        if (dexRouterList.isHeaderLocal()) {
            dexRouterList.setHeaderLocal(false);
            android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DQzvGN, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new Activity(viewInflate);
        }
        try {
            java.util.ArrayList<SubRouter> subRouterList = this.copydefault.copydefault().get(this.KWHzl + 1).getSubRouterList();
            this.KWHzl = subRouterList != null ? subRouterList.size() : 1;
        } catch (java.lang.Exception unused) {
        }
        android.view.View viewInflate2 = layoutInflater.inflate(AEQbTJ(this.KWHzl), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "");
        return new Activity(viewInflate2);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull DexRouterList dexRouterList) {
        java.lang.String strDjBIcL;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanDbNXlk;
        java.lang.String tokenLogoUrl;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanDbNXlk2;
        java.lang.String chainLogoUrl;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf;
        java.lang.String tokenLogoUrl2;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf2;
        java.lang.String chainLogoUrl2;
        SmartRoutingData smartRoutingDataAhwBna;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanDjBIcL;
        java.lang.String tokenLogoUrl3;
        SmartRoutingData smartRoutingDataAhwBna2;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanDjBIcL2;
        java.lang.String chainLogoUrl3;
        C24485iei c24485ieiAEQbTJ;
        java.lang.String strDjBIcL2;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanKWHzl;
        java.lang.String tokenLogoUrl4;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanKWHzl2;
        java.lang.String chainLogoUrl4;
        SmartRoutingData smartRoutingDataAhwBna3;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd;
        java.lang.String tokenLogoUrl5;
        SmartRoutingData smartRoutingDataAhwBna4;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd2;
        java.lang.String chainLogoUrl5;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFetchVPNInfo;
        java.lang.String tokenLogoUrl6;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFetchVPNInfo2;
        java.lang.String chainLogoUrl6;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(dexRouterList, "");
        this.KWHzl = getPosition(activity);
        C24484ieh c24484iehKWHzl = activity.KWHzl();
        if (c24484iehKWHzl != null && (strDjBIcL2 = this.copydefault.djBIcL()) != null) {
            int iHashCode = strDjBIcL2.hashCode();
            if (iHashCode != 48) {
                if (iHashCode != 49) {
                    if (iHashCode == 51 && strDjBIcL2.equals("3") && (dexMultiTokenInfoBeanFetchVPNInfo = this.copydefault.fetchVPNInfo()) != null && (tokenLogoUrl6 = dexMultiTokenInfoBeanFetchVPNInfo.getTokenLogoUrl()) != null && (dexMultiTokenInfoBeanFetchVPNInfo2 = this.copydefault.fetchVPNInfo()) != null && (chainLogoUrl6 = dexMultiTokenInfoBeanFetchVPNInfo2.getChainLogoUrl()) != null) {
                        c24484iehKWHzl.EZpvd(tokenLogoUrl6, chainLogoUrl6);
                    }
                } else if (strDjBIcL2.equals("1") && (smartRoutingDataAhwBna3 = this.copydefault.AhwBna()) != null && (dexMultiTokenInfoBeanEZpvd = smartRoutingDataAhwBna3.EZpvd()) != null && (tokenLogoUrl5 = dexMultiTokenInfoBeanEZpvd.getTokenLogoUrl()) != null && (smartRoutingDataAhwBna4 = this.copydefault.AhwBna()) != null && (dexMultiTokenInfoBeanEZpvd2 = smartRoutingDataAhwBna4.EZpvd()) != null && (chainLogoUrl5 = dexMultiTokenInfoBeanEZpvd2.getChainLogoUrl()) != null) {
                    c24484iehKWHzl.EZpvd(tokenLogoUrl5, chainLogoUrl5);
                }
            } else if (strDjBIcL2.equals("0") && (dexMultiTokenInfoBeanKWHzl = this.copydefault.KWHzl()) != null && (tokenLogoUrl4 = dexMultiTokenInfoBeanKWHzl.getTokenLogoUrl()) != null && (dexMultiTokenInfoBeanKWHzl2 = this.copydefault.KWHzl()) != null && (chainLogoUrl4 = dexMultiTokenInfoBeanKWHzl2.getChainLogoUrl()) != null) {
                c24484iehKWHzl.EZpvd(tokenLogoUrl4, chainLogoUrl4);
            }
        }
        android.widget.TextView textViewGEmmrt = activity.gEmmrt();
        if (textViewGEmmrt != null) {
            if (dexRouterList.getPercent().length() > 0) {
                textViewGEmmrt.setVisibility(0);
                textViewGEmmrt.setText(C23311hvo.formatPercent$default(dexRouterList.getPercent(), false, 0, 0, null, null, 30, null));
            } else {
                textViewGEmmrt.setVisibility(4);
            }
        }
        java.util.ArrayList<SubRouter> subRouterList = dexRouterList.getSubRouterList();
        if (subRouterList != null) {
            int size = subRouterList.size();
            int i = 0;
            while (i < size) {
                SubRouter subRouter = subRouterList.get(i);
                Intrinsics.checkNotNullExpressionValue(subRouter, "");
                final SubRouter subRouter2 = subRouter;
                if (i == 0) {
                    c24485ieiAEQbTJ = activity.AEQbTJ();
                } else if (i == 1) {
                    c24485ieiAEQbTJ = activity.copydefault();
                } else {
                    c24485ieiAEQbTJ = i != 2 ? null : activity.OLrzqt();
                }
                if (c24485ieiAEQbTJ != null) {
                    c24485ieiAEQbTJ.setData(subRouter2, new Function0() { // from class: o.idP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C24408idK.AEQbTJ(this.copydefault, subRouter2);
                        }
                    });
                }
                i++;
            }
        }
        C24484ieh c24484iehAhwBna = activity.AhwBna();
        if (c24484iehAhwBna != null && (strDjBIcL = this.copydefault.djBIcL()) != null) {
            int iHashCode2 = strDjBIcL.hashCode();
            if (iHashCode2 != 48) {
                if (iHashCode2 != 49) {
                    if (iHashCode2 == 51 && strDjBIcL.equals("3") && (smartRoutingDataAhwBna = this.copydefault.AhwBna()) != null && (dexMultiTokenInfoBeanDjBIcL = smartRoutingDataAhwBna.djBIcL()) != null && (tokenLogoUrl3 = dexMultiTokenInfoBeanDjBIcL.getTokenLogoUrl()) != null && (smartRoutingDataAhwBna2 = this.copydefault.AhwBna()) != null && (dexMultiTokenInfoBeanDjBIcL2 = smartRoutingDataAhwBna2.djBIcL()) != null && (chainLogoUrl3 = dexMultiTokenInfoBeanDjBIcL2.getChainLogoUrl()) != null) {
                        c24484iehAhwBna.EZpvd(tokenLogoUrl3, chainLogoUrl3);
                    }
                } else if (strDjBIcL.equals("1") && (dexMultiTokenInfoBeanValueOf = this.copydefault.valueOf()) != null && (tokenLogoUrl2 = dexMultiTokenInfoBeanValueOf.getTokenLogoUrl()) != null && (dexMultiTokenInfoBeanValueOf2 = this.copydefault.valueOf()) != null && (chainLogoUrl2 = dexMultiTokenInfoBeanValueOf2.getChainLogoUrl()) != null) {
                    c24484iehAhwBna.EZpvd(tokenLogoUrl2, chainLogoUrl2);
                }
            } else if (strDjBIcL.equals("0") && (dexMultiTokenInfoBeanDbNXlk = this.copydefault.DbNXlk()) != null && (tokenLogoUrl = dexMultiTokenInfoBeanDbNXlk.getTokenLogoUrl()) != null && (dexMultiTokenInfoBeanDbNXlk2 = this.copydefault.DbNXlk()) != null && (chainLogoUrl = dexMultiTokenInfoBeanDbNXlk2.getChainLogoUrl()) != null) {
                c24484iehAhwBna.EZpvd(tokenLogoUrl, chainLogoUrl);
            }
        }
        boolean zAkhnZx = this.copydefault.AkhnZx();
        boolean z = this.copydefault.copydefault().size() - 1 == getPosition(activity) && !zAkhnZx;
        android.view.View viewDjBIcL = activity.djBIcL();
        if (viewDjBIcL != null && (zAkhnZx || z)) {
            ViewGroup.LayoutParams layoutParams = viewDjBIcL.getLayoutParams();
            layoutParams.height = C33070mpX.OLrzqt(C23274hvD.TaskDescription.OLrzqt);
            viewDjBIcL.setLayoutParams(layoutParams);
        }
        android.view.View viewEZpvd = activity.EZpvd();
        if (viewEZpvd != null) {
            if (zAkhnZx || z) {
                ViewGroup.LayoutParams layoutParams2 = viewEZpvd.getLayoutParams();
                layoutParams2.height = C33070mpX.OLrzqt(C23274hvD.TaskDescription.OLrzqt);
                viewEZpvd.setLayoutParams(layoutParams2);
            }
        }
    }

    public static final Unit AEQbTJ(C24408idK c24408idK, SubRouter subRouter) {
        c24408idK.EZpvd.invoke(subRouter);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.idK$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final C24485iei AEQbTJ;
        public final android.view.View AYXKKw;
        public final android.view.View EZpvd;
        public final C24485iei KWHzl;
        public final C24484ieh OLrzqt;
        public final C24485iei copydefault;
        public final android.widget.TextView gEmmrt;
        public final C24484ieh valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C24485iei AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C24484ieh AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C24484ieh KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C24485iei OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C24485iei copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = (C24484ieh) view.findViewById(C23274hvD.Application.HJWChPRGtXKC);
            this.gEmmrt = (android.widget.TextView) view.findViewById(C23274hvD.Application.AppCompatDelegateImplActionBarMenuCallback);
            this.KWHzl = (C24485iei) view.findViewById(C23274hvD.Application.fupbxE);
            this.copydefault = (C24485iei) view.findViewById(C23274hvD.Application.getUserContextRegisteredStatus);
            this.AEQbTJ = (C24485iei) view.findViewById(C23274hvD.Application.deregisterUser);
            this.valueOf = (C24484ieh) view.findViewById(C23274hvD.Application.ikIEnW);
            this.AYXKKw = view.findViewById(C23274hvD.Application.BackHandlerKtBackHandler2invokeinlinedonDispose1);
            this.EZpvd = view.findViewById(C23274hvD.Application.DVmcag);
        }
    }

    public final int AEQbTJ(int i) {
        if (this.copydefault.AkhnZx()) {
            int i2 = TaskDescription.AEQbTJ[this.copydefault.gEmmrt().ordinal()];
            return i2 != 1 ? i2 != 2 ? C23274hvD.Activity.ihnvzI : C23274hvD.Activity.DPHNDa : C23274hvD.Activity.DQYQgr;
        }
        int i3 = TaskDescription.AEQbTJ[this.copydefault.OLrzqt(i).ordinal()];
        return i3 != 3 ? i3 != 4 ? C23274hvD.Activity.zLAIeZ : C23274hvD.Activity.isReflectionWorking : C23274hvD.Activity.geLlBI;
    }
}
