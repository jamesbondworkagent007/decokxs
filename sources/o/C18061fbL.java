package o;

import androidx.core.os.BundleKt;
import com.okinc.business.defi.biz.net.bean.MoreFunctionInfo;
import com.okinc.business.defi.biz.net.bean.MoreFunctionModuleInfo;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.model.ScanConfig;
import com.okinc.core.util.qrcode.decode.ScanType;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C10407bnq;
import o.C12827cuN;
import o.C13754dXa;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18061fbL {
    public static /* synthetic */ void openDetailPage$default(MoreFunctionInfo moreFunctionInfo, android.app.Activity activity, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        copydefault(moreFunctionInfo, activity, z);
    }

    public static final void copydefault(@NotNull final MoreFunctionInfo moreFunctionInfo, @NotNull android.app.Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(moreFunctionInfo, "");
        Intrinsics.checkNotNullParameter(activity, "");
        if (z) {
            C32866mlf.onEvent$default("WalletMore_Sheet_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fbI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18061fbL.EZpvd(moreFunctionInfo, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        int jumpType = moreFunctionInfo.getJumpType();
        if (jumpType != 1) {
            if (jumpType != 2) {
                return;
            }
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", moreFunctionInfo.getJumpUrl()), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()), C56390yDp.OLrzqt("title", moreFunctionInfo.getName())), null, 4, null);
            return;
        }
        java.lang.String[] strArrKWHzl = C34704nhP.copydefault.KWHzl();
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, StringsKt__StringsKt.KWHzl(moreFunctionInfo.getJumpUrl(), strArrKWHzl + "://", moreFunctionInfo.getJumpUrl()), null, new Function1() { // from class: o.fbH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18061fbL.EZpvd((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit EZpvd(MoreFunctionInfo moreFunctionInfo, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("more_feature_id", java.lang.String.valueOf(moreFunctionInfo.getId()), false));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final InterfaceC58217yxC EZpvd(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        return C11607cUn.subscribeOnIO$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false), (Function1) null, new Function1() { // from class: o.fbJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18061fbL.OLrzqt(abstractActivityC33041mov, fragmentManager, (AbstractC12782ctV) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(final AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        copydefault(abstractActivityC33041mov, fragmentManager, abstractC12782ctV, abstractC12782ctV.QfsBiF() || abstractC12782ctV.zsXlph(), new Function0() { // from class: o.fbO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18061fbL.EZpvd(abstractActivityC33041mov);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractActivityC33041mov abstractActivityC33041mov) {
        ScannerActivity.Companion.KWHzl(abstractActivityC33041mov, C56402yEa.EZpvd(ScanType.WALLET_HOME), new ScanConfig(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DrqXHJ), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DGUQLIhJrIAr), C33070mpX.AYXKKw(C13754dXa.FragmentManager.profile), false, null, false, false, null, false, null, 4069, null));
        return Unit.INSTANCE;
    }

    public static final void copydefault(AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, AbstractC12782ctV abstractC12782ctV, boolean z, Function0<Unit> function0) {
        if (z) {
            C55326xho.toast$default(C13754dXa.FragmentManager.QSAYLr, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, 0, 27, (java.lang.Object) null);
            return;
        }
        if (!abstractC12782ctV.zLjUOn()) {
            C14325djN.showBackupTipDialog$default(new C14325djN(), abstractActivityC33041mov, fragmentManager, abstractC12782ctV, null, 8, null);
        } else if (abstractC12782ctV.htlTjW()) {
            fPH.showOwnerCheckFailedDialog$default(fPH.OLrzqt, abstractActivityC33041mov, abstractC12782ctV.fFgQHt(), 0, null, 8, null);
        } else {
            if (C15715eSp.dealWithMpcExceptionStatus$default(C15715eSp.AEQbTJ, abstractC12782ctV, abstractActivityC33041mov, null, 4, null)) {
                return;
            }
            function0.invoke();
        }
    }

    public static final java.util.List<MoreFunctionModuleInfo> AEQbTJ(@NotNull java.util.List<MoreFunctionModuleInfo> list, AbstractC12782ctV abstractC12782ctV) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(list, "");
        if (abstractC12782ctV == null) {
            return list;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (MoreFunctionModuleInfo moreFunctionModuleInfo : list) {
            java.util.List<MoreFunctionInfo> homeModules = moreFunctionModuleInfo.getHomeModules();
            MoreFunctionModuleInfo moreFunctionModuleInfoCopy$default = null;
            if (homeModules != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : homeModules) {
                    MoreFunctionInfo moreFunctionInfo = (MoreFunctionInfo) obj;
                    if (moreFunctionInfo.getSupportWalletType().contains(java.lang.Integer.valueOf(abstractC12782ctV.getNewProxyInstance()))) {
                        if (C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl(abstractC12782ctV)) {
                            java.lang.Integer walletMode = moreFunctionInfo.getWalletMode();
                            if (walletMode != null && walletMode.intValue() == 1) {
                                arrayList.add(obj);
                            }
                        } else {
                            java.lang.Integer walletMode2 = moreFunctionInfo.getWalletMode();
                            if (walletMode2 != null && walletMode2.intValue() == 0) {
                                arrayList.add(obj);
                            }
                        }
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && (!arrayList.isEmpty())) {
                moreFunctionModuleInfoCopy$default = MoreFunctionModuleInfo.copy$default(moreFunctionModuleInfo, null, arrayList, 1, null);
            }
            if (moreFunctionModuleInfoCopy$default != null) {
                arrayList2.add(moreFunctionModuleInfoCopy$default);
            }
        }
        return arrayList2;
    }
}
