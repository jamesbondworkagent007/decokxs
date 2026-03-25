package o;

import androidx.fragment.app.FragmentActivity;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.wholesale.bean.VipActivateConfig;
import com.okinc.wholesale.ui.VipUniformBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC33171mrS;
import o.InterfaceC35160nqA;
import o.InterfaceC43294rma;
import o.InterfaceC49499uph;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rkg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43194rkg implements InterfaceC7380aij {
    @Override // o.InterfaceC7380aij
    public java.util.Set<java.lang.String> KWHzl() {
        return yEE.AhwBna("Invite", "GoToNewUserRecharge", "GoToGrowthShare", "GoToBlindboxInvite", "GoToDeeplinkJump", "GoToProHome", "CefiAnnualReport", "GoToTradeChangeModePage", "GoToImagePicker", "VipLandingPageShare", "GoToGrowthVIPLandingSupportPage", "GoToVipActivatePopUp");
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.nqA.Activity.showRechargeGuideFragment$default(o.nqA, androidx.fragment.app.FragmentManager, boolean, boolean, kotlin.jvm.functions.Function0, int, java.lang.Object):androidx.fragment.app.DialogFragment */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [79=12] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: V */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC7380aij
    public void copydefault(@NotNull final android.content.Context context, @NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull InterfaceC7379aii interfaceC7379aii) {
        InterfaceC49499uph interfaceC49499uph;
        InterfaceC33171mrS interfaceC33171mrS;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC7379aii, "");
        switch (str.hashCode()) {
            case -2099832023:
                str.equals("Invite");
                break;
            case -1816572625:
                if (str.equals("GoToNewUserRecharge")) {
                    FragmentActivity fragmentActivity = (FragmentActivity) context;
                    InterfaceC35160nqA interfaceC35160nqA = (InterfaceC35160nqA) C43251rlk.OLrzqt(InterfaceC35160nqA.class);
                    if (interfaceC35160nqA != null) {
                        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        InterfaceC35160nqA.Activity.showRechargeGuideFragment$default(interfaceC35160nqA, supportFragmentManager, true, false, null, 12, null);
                    }
                    break;
                }
                break;
            case -904862539:
                if (str.equals("GoToGrowthShare") && map != null) {
                    java.lang.Object obj = map.get("shareContentView");
                    Intrinsics.copydefault(obj, "");
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((UDViewGroup) obj).f_();
                    Intrinsics.copydefault(map.get("width"), "");
                    float fKWHzl = C33570myu.KWHzl(context, ((java.lang.Integer) r2).intValue());
                    Intrinsics.copydefault(map.get("height"), "");
                    float fKWHzl2 = C33570myu.KWHzl(context, ((java.lang.Integer) r3).intValue());
                    final java.lang.String str2 = (java.lang.String) map.get("shareFrom");
                    C33487mxQ.EZpvd(viewGroup, (int) fKWHzl, (int) fKWHzl2);
                    android.graphics.Bitmap bitmapAEQbTJ = C33570myu.AEQbTJ((android.view.View) viewGroup, true);
                    ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
                    Intrinsics.copydefault(bitmapAEQbTJ);
                    stateListAnimator.copydefault(bitmapAEQbTJ, (AbstractActivityC33041mov) context, new Function1() { // from class: o.rki
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return C43194rkg.EZpvd((java.lang.Throwable) obj2);
                        }
                    }, new Function1() { // from class: o.rkm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return C43194rkg.EZpvd(context, str2, (java.io.File) obj2);
                        }
                    });
                }
                break;
            case -416508353:
                if (str.equals("GoToVipActivatePopUp") && map != null) {
                    java.lang.Object obj2 = map.get("inviterName");
                    java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                    java.lang.String str4 = str3 == null ? "" : str3;
                    java.lang.Object obj3 = map.get("vipFeePercentage");
                    java.lang.String str5 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
                    java.lang.String str6 = str5 == null ? "" : str5;
                    java.lang.Object obj4 = map.get("vipActivateState");
                    java.lang.String str7 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                    if (str7 == null) {
                        str7 = "";
                    }
                    java.lang.Object obj5 = map.get("vipTrialDays");
                    java.lang.String str8 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                    java.lang.String str9 = str8 == null ? "" : str8;
                    java.lang.Object obj6 = map.get("vipUid");
                    java.lang.String str10 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                    java.lang.String str11 = str10 == null ? "" : str10;
                    java.lang.Object obj7 = map.get("vipLevel");
                    java.lang.String str12 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                    if (str12 == null) {
                        str12 = "";
                    }
                    java.lang.Object obj8 = map.get("isFromLanding");
                    java.lang.Boolean bool = obj8 instanceof java.lang.Boolean ? (java.lang.Boolean) obj8 : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    java.lang.Object obj9 = map.get("avatar");
                    java.lang.String str13 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                    java.lang.String str14 = str13 == null ? "" : str13;
                    java.lang.Object obj10 = map.get("nickName");
                    java.lang.String str15 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                    java.lang.String str16 = str15 == null ? "" : str15;
                    java.lang.Object obj11 = map.get("qrCodeUrl");
                    java.lang.String str17 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                    java.lang.String str18 = str17 == null ? "" : str17;
                    java.lang.Object obj12 = map.get("inviteCode");
                    java.lang.String str19 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
                    VipUniformBottomSheet.Companion.EZpvd(new VipActivateConfig(str19 == null ? "" : str19, str11, java.lang.Integer.valueOf(C33129mqd.AhwBna(str12)), str4, str6, str9, C33129mqd.AhwBna(str7), zBooleanValue, str14, str16, str18)).show(((FragmentActivity) context).getSupportFragmentManager(), VipUniformBottomSheet.class.getName());
                }
                break;
            case -50644606:
                if (str.equals("GoToBlindboxInvite")) {
                    ((InterfaceC48694uaX) C43248rlh.KWHzl.AEQbTJ(InterfaceC48694uaX.class)).OLrzqt(context);
                    break;
                }
                break;
            case 758153859:
                if (str.equals("GoToTradeChangeModePage") && (interfaceC49499uph = (InterfaceC49499uph) C43251rlk.OLrzqt(InterfaceC49499uph.class)) != null) {
                    InterfaceC49499uph.StateListAnimator.routeAccountModeActivity$default(interfaceC49499uph, context, "2", java.lang.Boolean.TRUE, null, null, null, 56, null);
                }
                break;
            case 816159802:
                if (str.equals("GoToGrowthVIPLandingSupportPage") && map != null) {
                    java.lang.Object obj13 = map.get("fromString");
                    java.lang.String str20 = obj13 instanceof java.lang.String ? (java.lang.String) obj13 : null;
                    final java.lang.String str21 = str20 != null ? str20 : "";
                    ((InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class)).copydefault((FragmentActivity) context, C6805aWM.OLrzqt(new Function1() { // from class: o.rko
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj14) {
                            return C43194rkg.AEQbTJ(str21, (ChatBotRequest) obj14);
                        }
                    }));
                }
                break;
            case 926114136:
                if (str.equals("CefiAnnualReport")) {
                    InterfaceC33171mrS interfaceC33171mrS2 = (InterfaceC33171mrS) C43248rlh.KWHzl.AEQbTJ(InterfaceC33171mrS.class);
                    InterfaceC33171mrS.Activity.switchToAppMode$default(interfaceC33171mrS2, context, interfaceC33171mrS2.ejfBZ() ? 2 : 1, false, 0, null, null, 56, null);
                    ((kOE) C43251rlk.copydefault(kOE.class)).KWHzl(context, map);
                    break;
                }
                break;
            case 957748745:
                if (str.equals("GoToProHome")) {
                    InterfaceC33171mrS interfaceC33171mrS3 = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class);
                    if (interfaceC33171mrS3 == null || !interfaceC33171mrS3.ejfBZ()) {
                        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.OLrzqt(InterfaceC43294rma.class);
                        if (interfaceC43294rma != null) {
                            InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, context, "main/home", null, new Function1() { // from class: o.rkn
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj14) {
                                    return C43194rkg.AEQbTJ((AbstractC43238rlX) obj14);
                                }
                            }, 4, null);
                        }
                        break;
                    } else {
                        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                        if (activity != null && (interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class)) != null) {
                            InterfaceC33171mrS.Activity.fromLiteToPro$default(interfaceC33171mrS, activity, false, false, false, null, 30, null);
                            break;
                        }
                    }
                }
                break;
            case 1398558758:
                if (str.equals("GoToImagePicker") && map != null) {
                    java.lang.Object obj14 = map.get("maxImages");
                    java.lang.Integer num = obj14 instanceof java.lang.Integer ? (java.lang.Integer) obj14 : null;
                    int iIntValue = num != null ? num.intValue() : 3;
                    java.lang.Object obj15 = map.get("imageMode");
                    java.lang.Integer num2 = obj15 instanceof java.lang.Integer ? (java.lang.Integer) obj15 : null;
                    int iIntValue2 = num2 != null ? num2.intValue() : 1;
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC57539ykN.class);
                    intent.putExtra("maxImages", iIntValue);
                    intent.putExtra("imageMode", iIntValue2);
                    context.startActivity(intent);
                }
                break;
            case 1416661078:
                if (str.equals("VipLandingPageShare") && map != null) {
                    java.lang.Object obj16 = map.get("isVip");
                    java.lang.Boolean bool2 = obj16 instanceof java.lang.Boolean ? (java.lang.Boolean) obj16 : null;
                    boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                    java.lang.Object obj17 = map.get("from");
                    java.lang.String str22 = obj17 instanceof java.lang.String ? (java.lang.String) obj17 : null;
                    java.lang.String str23 = str22 == null ? "" : str22;
                    java.lang.Object obj18 = map.get("nickName");
                    java.lang.String str24 = obj18 instanceof java.lang.String ? (java.lang.String) obj18 : null;
                    java.lang.String str25 = str24 == null ? "" : str24;
                    java.lang.Object obj19 = map.get("qrCodeUrl");
                    java.lang.String str26 = obj19 instanceof java.lang.String ? (java.lang.String) obj19 : null;
                    java.lang.String str27 = str26 == null ? "" : str26;
                    java.lang.Object obj20 = map.get("vipAvatarUrl");
                    java.lang.String str28 = obj20 instanceof java.lang.String ? (java.lang.String) obj20 : null;
                    java.lang.String str29 = str28 == null ? "" : str28;
                    java.lang.Object obj21 = map.get("bottomTips");
                    java.lang.String str30 = obj21 instanceof java.lang.String ? (java.lang.String) obj21 : null;
                    java.lang.String str31 = str30 == null ? "" : str30;
                    java.lang.Object obj22 = map.get("showVipGradient");
                    java.lang.Boolean bool3 = obj22 instanceof java.lang.Boolean ? (java.lang.Boolean) obj22 : null;
                    C57627ylw.AEQbTJ.copydefault((FragmentActivity) context, zBooleanValue2, str25, str27, str29, str23, str31, java.lang.Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false));
                }
                break;
            case 1554761079:
                if (str.equals("GoToDeeplinkJump") && map != null) {
                    java.lang.Object obj23 = map.get("jumpUrl");
                    Intrinsics.copydefault(obj23, "");
                    InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43248rlh.KWHzl.AEQbTJ(InterfaceC43294rma.class), context, (java.lang.String) obj23, null, new Function1() { // from class: o.rkk
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj24) {
                            return C43194rkg.copydefault((AbstractC43238rlX) obj24);
                        }
                    }, 4, null);
                }
                break;
        }
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(android.content.Context context, final java.lang.String str, java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        java.lang.String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault((AbstractActivityC33041mov) context, ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.rkl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43194rkg.KWHzl(str, (ImageShareParams) obj);
            }
        }), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        if (str == null) {
            str = "";
        }
        imageShareParams.setShareFrom(str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, ChatBotRequest chatBotRequest) {
        Intrinsics.checkNotNullParameter(chatBotRequest, "");
        chatBotRequest.setOkaFrom(str);
        return Unit.INSTANCE;
    }
}
