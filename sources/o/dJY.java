package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.deeplink.DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4;
import com.okinc.business.defi.deeplink.DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$5;
import com.okinc.business.defi.wallet.mine.WalletSecurityActivity;
import com.okinc.business.defi.wallet.mine.viewmodel.PageType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC17352fCd;
import o.ActivityC17448fFs;
import o.C12827cuN;
import o.C13754dXa;
import o.InterfaceC9739bbK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dJY implements InterfaceC43234rlT {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [73=15] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull final android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        final FragmentActivity fragmentActivity;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String strOLrzqt = interfaceC43233rlS.OLrzqt();
        switch (strOLrzqt.hashCode()) {
            case -1946816986:
                if (strOLrzqt.equals("wallet/mpc/escape")) {
                    AEQbTJ("emergency_escape");
                    ActivityC17448fFs.Activity activity = ActivityC17448fFs.Companion;
                    android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
                    if (activityOLrzqt != null) {
                        ActivityC17448fFs.Activity.start$default(activity, activityOLrzqt, null, 2, null);
                        break;
                    }
                }
                break;
            case -1775536720:
                if (strOLrzqt.equals("wallet/account/linking")) {
                    AEQbTJ("account_link");
                    android.app.Activity activityOLrzqt2 = C33569myt.OLrzqt(context);
                    FragmentActivity fragmentActivity2 = activityOLrzqt2 instanceof FragmentActivity ? (FragmentActivity) activityOLrzqt2 : null;
                    if (fragmentActivity2 != null) {
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity2), null, null, new DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4(fragmentActivity2, map, null), 3, null);
                        break;
                    }
                }
                break;
            case -1383612826:
                if (strOLrzqt.equals("wallet/custom/network")) {
                    AEQbTJ("custom_network");
                    android.app.Activity activityOLrzqt3 = C33569myt.OLrzqt(context);
                    fragmentActivity = activityOLrzqt3 instanceof FragmentActivity ? (FragmentActivity) activityOLrzqt3 : null;
                    if (fragmentActivity != null) {
                        C16158eee c16158eee = C16158eee.KWHzl;
                        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        c16158eee.copydefault(supportFragmentManager, new Function0() { // from class: o.dKd
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return dJY.KWHzl(fragmentActivity);
                            }
                        });
                        break;
                    }
                }
                break;
            case -1350143941:
                if (strOLrzqt.equals("wallet/manage")) {
                    AEQbTJ("wallet_management");
                    C32866mlf.onEvent$default("Web3WalletManagement_Settings_WalletManage_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                    ActivityC17352fCd.StateListAnimator.startActivity$default(ActivityC17352fCd.Companion, context, false, 2, null);
                    break;
                }
                break;
            case -371187078:
                if (strOLrzqt.equals("wallet/address/book")) {
                    AEQbTJ("address_book");
                    C32866mlf.onEvent$default("OKXWallet_Top_AddressBook_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                    ActivityC18644fmL.Companion.KWHzl(context);
                    break;
                }
                break;
            case 60455107:
                if (strOLrzqt.equals("wallet/device/security")) {
                    AEQbTJ("device_security");
                    InterfaceC32807mkZ interfaceC32807mkZ = (InterfaceC32807mkZ) C43248rlh.KWHzl.AEQbTJ(InterfaceC32807mkZ.class);
                    android.app.Activity activityOLrzqt4 = C33569myt.OLrzqt(context);
                    if (activityOLrzqt4 != null) {
                        interfaceC32807mkZ.OLrzqt(activityOLrzqt4, "defi");
                        break;
                    }
                }
                break;
            case 68463127:
                if (strOLrzqt.equals("wallet/service/terms")) {
                    AEQbTJ("terms_of_service");
                    java.lang.String string = context.getString(C13754dXa.FragmentManager.PickVisualMediaRequest);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    OLrzqt(context, string);
                    break;
                }
                break;
            case 493355715:
                if (strOLrzqt.equals("wallet/communities/add")) {
                    AEQbTJ("community");
                    java.lang.String string2 = context.getString(C13754dXa.FragmentManager.ActionBarDisplayOptions);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    OLrzqt(context, string2);
                    break;
                }
                break;
            case 626161263:
                if (strOLrzqt.equals("wallet/privacy/policy")) {
                    AEQbTJ("privacy_policy");
                    java.lang.String string3 = context.getString(C13754dXa.FragmentManager.select);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    OLrzqt(context, string3);
                    break;
                }
                break;
            case 685518833:
                if (strOLrzqt.equals("wallet/password")) {
                    AEQbTJ("authentication_method");
                    WalletSecurityActivity.Companion.AEQbTJ(context);
                    break;
                }
                break;
            case 974798578:
                if (strOLrzqt.equals("wallet/preference/setting")) {
                    AEQbTJ("preferences");
                    ActivityC18663fme.Companion.EZpvd(context, C33492mxV.OLrzqt());
                    break;
                }
                break;
            case 1020932971:
                if (strOLrzqt.equals("wallet/support/center")) {
                    AEQbTJ("support_center");
                    android.app.Activity activityOLrzqt5 = C33569myt.OLrzqt(context);
                    FragmentActivity fragmentActivity3 = activityOLrzqt5 instanceof FragmentActivity ? (FragmentActivity) activityOLrzqt5 : null;
                    if (fragmentActivity3 != null) {
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity3), null, null, new DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$5(fragmentActivity3, null), 3, null);
                        break;
                    }
                }
                break;
            case 1626640720:
                if (strOLrzqt.equals("wallet/backup/wallet")) {
                    AEQbTJ("backup_wallet");
                    android.app.Activity activityOLrzqt6 = C33569myt.OLrzqt(context);
                    final FragmentActivity fragmentActivity4 = activityOLrzqt6 instanceof FragmentActivity ? (FragmentActivity) activityOLrzqt6 : null;
                    if (fragmentActivity4 != null) {
                        AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivity4 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivity4 : null;
                        if (abstractActivityC33041mov != null) {
                            abstractActivityC33041mov.showLoading();
                        }
                        C33024moe.subscribeOnIO$default(C58156yvv.OLrzqt(InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null), fragmentActivity4, Lifecycle.Event.ON_DESTROY), new Function1() { // from class: o.dJW
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return dJY.EZpvd(fragmentActivity4, (java.lang.Throwable) obj);
                            }
                        }, new Function0() { // from class: o.dKa
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return dJY.KWHzl(fragmentActivity4, context);
                            }
                        }, (Function1) null, 4, (java.lang.Object) null);
                        break;
                    }
                }
                break;
            case 1898710306:
                if (strOLrzqt.equals("wallet/security/audit")) {
                    AEQbTJ("security_audit");
                    java.lang.String string4 = context.getString(C13754dXa.FragmentManager.getContentDescription);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    OLrzqt(context, string4);
                    break;
                }
                break;
            case 2096188536:
                if (strOLrzqt.equals("wallet/referral/dashboard")) {
                    android.app.Activity activityOLrzqt7 = C33569myt.OLrzqt(context);
                    fragmentActivity = activityOLrzqt7 instanceof FragmentActivity ? (FragmentActivity) activityOLrzqt7 : null;
                    if (fragmentActivity != null) {
                        if (!Intrinsics.EZpvd(map.get("shareFrom"), (java.lang.Object) "more")) {
                            xWP xwp = (xWP) C43251rlk.OLrzqt(xWP.class);
                            if (xwp != null) {
                                xwp.copydefault(fragmentActivity);
                            }
                        } else {
                            xWP xwp2 = (xWP) C43251rlk.OLrzqt(xWP.class);
                            if (xwp2 != null) {
                                xwp2.OLrzqt(fragmentActivity);
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }

    public static final Unit EZpvd(FragmentActivity fragmentActivity, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(FragmentActivity fragmentActivity, android.content.Context context) {
        AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoading();
        }
        C32866mlf.onEvent$default("Web3WalletSecure_WalletSecurity_BackUp_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        ActivityC18768fod.Companion.AEQbTJ(context);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(FragmentActivity fragmentActivity) {
        ActivityC16169eep.Companion.AEQbTJ(fragmentActivity);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(android.content.Context context, java.lang.String str) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
    }

    public final void AEQbTJ(final java.lang.String str) {
        final PageType pageType;
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        if (abstractC12782ctV == null) {
            pageType = PageType.PRE_LOGIN;
        } else {
            pageType = (abstractC12782ctV.getFieldNames() || !AbstractC12782ctV.isCustomNetworkSupport$default(abstractC12782ctV, false, 1, null)) ? PageType.LOGIN_AA : PageType.LOGIN_EOA;
        }
        C32866mlf.onEvent$default("Web3WalletSetting_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.dKb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dJY.OLrzqt(str, pageType, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, PageType pageType, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_PAGE_TYPE, pageType.getTrackingValue(), true));
        return Unit.INSTANCE;
    }
}
