package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.planet.domain.data.OrbitSimpleInfo;
import com.okinc.planet.utils.PlanetNavigationUtil$checkOtherUserOrbiterRole$1;
import com.okinc.planet.utils.PlanetNavigationUtil$showUserCenterPage$1;
import com.okinc.planet.utils.PlanetNavigationUtil$showUserCenterPage$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o.AbstractC46217tMd;
import o.ActivityC46100tHv;
import o.C46388tSm;
import o.C47501trL;
import o.InterfaceC8104awT;
import o.tKI;
import o.tQS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tUr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46447tUr {
    public static final C46447tUr KWHzl = new C46447tUr();

    private C46447tUr() {
    }

    public static /* synthetic */ void openMyPlanetUserProfilePage$default(C46447tUr c46447tUr, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        c46447tUr.KWHzl(context, str, str2, str3);
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        openPlanetUserProfilePage$default(this, context, "", "", "", str, str2, null, str3, 64, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.tUr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openPlanetUserProfilePage$default(C46447tUr c46447tUr, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, java.lang.String str6, int i, java.lang.Object obj) {
        c46447tUr.EZpvd(context, str, str2, str3, str4, str5, (i & 64) != 0 ? null : map, (i & 128) != 0 ? null : str6);
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (str.length() == 0 && str2.length() == 0 && str3.length() == 0) {
            if (((InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class)).values()) {
                showUserCenterPage$default(this, context, str, str2, str3, str4, str5, null, null, null, null, map, str6, null, 5056, null);
                return;
            } else {
                InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), context, null, 2, null);
                return;
            }
        }
        showUserCenterPage$default(this, context, str, str2, str3, str4, str5, null, null, null, null, map, str6, null, 5056, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: o.tUr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showUserCenterPage$default(C46447tUr c46447tUr, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.util.Map map, java.lang.String str10, ActivityResultLauncher activityResultLauncher, int i, java.lang.Object obj) {
        c46447tUr.OLrzqt(context, str, str2, str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : map, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : activityResultLauncher);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.String str10, ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (C46219tMf.Companion.copydefault().OLrzqt(new AbstractC46217tMd.StateListAnimator(null, 1, null))) {
            ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).OLrzqt(context, str7 != null ? str7 : "", str3, str4);
            return;
        }
        boolean zKWHzl = C33216msK.KWHzl.KWHzl();
        if (((str.length() > 0 || str2.length() > 0) && str3.length() == 0) || zKWHzl) {
            C46388tSm.TaskDescription taskDescription = C46388tSm.Companion;
            if (!taskDescription.KWHzl().copydefault(str, str3, str2)) {
                if (!Intrinsics.EZpvd((java.lang.Object) C33129mqd.gEmmrt(map != null ? map.get("isSelf") : null), (java.lang.Object) "1")) {
                    if (str.length() != 0 || str2.length() != 0 || !C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
                        if (!Intrinsics.EZpvd(map != null ? map.get("isFromContent") : null, (java.lang.Object) "1")) {
                            android.app.Activity activityAEQbTJ = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                            if (activityAEQbTJ == null) {
                                activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                            }
                            if (activityAEQbTJ instanceof FragmentActivity) {
                                if (!C33129mqd.OLrzqt((java.lang.CharSequence) C33129mqd.gEmmrt(map != null ? map.get("isOrbiter") : null))) {
                                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activityAEQbTJ), null, null, new PlanetNavigationUtil$showUserCenterPage$2(activityAEQbTJ, str, str3, str2, context, str4, str5, str6, str7, str8, str9, map, activityResultLauncher, null), 3, null);
                                    return;
                                }
                                if (Intrinsics.EZpvd(map != null ? map.get("isOrbiter") : null, (java.lang.Object) "1")) {
                                    android.content.Intent intentCopydefault = tJI.Companion.copydefault(context, str, str2, str3, str4, (2048 & 32) != 0 ? null : str5, (2048 & 64) != 0 ? null : str6, (2048 & 128) != 0 ? null : str7 != null ? str7 : null, (2048 & 256) != 0 ? null : str8, (2048 & 512) != 0 ? null : str9, (2048 & 1024) != 0 ? null : map, (2048 & 2048) != 0 ? null : null);
                                    if (activityResultLauncher != null) {
                                        activityResultLauncher.launch(intentCopydefault);
                                        return;
                                    } else {
                                        intentCopydefault.addFlags(268435456);
                                        context.startActivity(intentCopydefault);
                                        return;
                                    }
                                }
                                tKI.StateListAnimator stateListAnimator = tKI.Companion;
                                androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) activityAEQbTJ).getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                                stateListAnimator.OLrzqt(supportFragmentManager, C33129mqd.gEmmrt(map != null ? map.get("avatarURL") : null), C33129mqd.gEmmrt(map != null ? map.get("userName") : null), C33129mqd.gEmmrt(map != null ? map.get("joinTimeMs") : null));
                                return;
                            }
                            return;
                        }
                    }
                    android.content.Intent intentCopydefault2 = tJI.Companion.copydefault(context, str, str2, str3, str4, (2048 & 32) != 0 ? null : str5, (2048 & 64) != 0 ? null : str6, (2048 & 128) != 0 ? null : str7 != null ? str7 : null, (2048 & 256) != 0 ? null : str8, (2048 & 512) != 0 ? null : str9, (2048 & 1024) != 0 ? null : map, (2048 & 2048) != 0 ? null : null);
                    if (activityResultLauncher != null) {
                        activityResultLauncher.launch(intentCopydefault2);
                        return;
                    } else {
                        intentCopydefault2.addFlags(268435456);
                        context.startActivity(intentCopydefault2);
                        return;
                    }
                }
            }
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new PlanetNavigationUtil$showUserCenterPage$1(null), 2, null);
            if (taskDescription.KWHzl().AYXKKw()) {
                C55326xho.toast$default(C33070mpX.AYXKKw(C47501trL.Fragment.call), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return;
            }
            if (!taskDescription.KWHzl().AhwBna()) {
                if (Intrinsics.EZpvd(map != null ? map.get("isFromComment") : null, (java.lang.Object) "1")) {
                    return;
                }
                context.startActivity(ActivityC46100tHv.Activity.newIntent$OKPlanet_ok_feature_planet_impl$default(ActivityC46100tHv.Companion, context, null, 2, null));
                return;
            } else {
                android.content.Intent intentCopydefault3 = tJI.Companion.copydefault(context, str, str2, str3, str4, str5, str6, str7 != null ? str7 : null, str8, str9, map, str10);
                if (activityResultLauncher != null) {
                    activityResultLauncher.launch(intentCopydefault3);
                    return;
                } else {
                    intentCopydefault3.addFlags(268435456);
                    context.startActivity(intentCopydefault3);
                    return;
                }
            }
        }
        ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).EZpvd(context, str3, str4, str5, str6, str7 != null ? str7 : null, str8, str9);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super OrbitSimpleInfo> continuation) {
        PlanetNavigationUtil$checkOtherUserOrbiterRole$1 planetNavigationUtil$checkOtherUserOrbiterRole$1;
        if (continuation instanceof PlanetNavigationUtil$checkOtherUserOrbiterRole$1) {
            planetNavigationUtil$checkOtherUserOrbiterRole$1 = (PlanetNavigationUtil$checkOtherUserOrbiterRole$1) continuation;
            int i = planetNavigationUtil$checkOtherUserOrbiterRole$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetNavigationUtil$checkOtherUserOrbiterRole$1.label = i - Integer.MIN_VALUE;
            } else {
                planetNavigationUtil$checkOtherUserOrbiterRole$1 = new PlanetNavigationUtil$checkOtherUserOrbiterRole$1(this, continuation);
            }
        }
        PlanetNavigationUtil$checkOtherUserOrbiterRole$1 planetNavigationUtil$checkOtherUserOrbiterRole$12 = planetNavigationUtil$checkOtherUserOrbiterRole$1;
        java.lang.Object objEZpvd = planetNavigationUtil$checkOtherUserOrbiterRole$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetNavigationUtil$checkOtherUserOrbiterRole$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C46354tRf c46354tRf = new C46354tRf(new tQQ(new ActionBar().AEQbTJ(), Dispatchers.getIO()));
            planetNavigationUtil$checkOtherUserOrbiterRole$12.label = 1;
            objEZpvd = c46354tRf.EZpvd(str, str2, str3, str4, planetNavigationUtil$checkOtherUserOrbiterRole$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return (OrbitSimpleInfo) objEZpvd;
    }

    /* JADX INFO: renamed from: o.tUr$ActionBar */
    public static final class ActionBar implements tQS {
        public tQP AEQbTJ() {
            return tQS.TaskDescription.EZpvd(this);
        }
    }
}
