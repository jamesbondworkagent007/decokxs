package com.okinc.p2p.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.p2p.api.bean.EntryParam;
import com.okinc.p2p.api.bean.EntrySource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import o.AbstractC58185ywX;
import o.InterfaceC43216rlB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface OTCService extends InterfaceC43216rlB {
    DialogFragment createReportDialog(@NotNull String str);

    Drawable getDiamondMerchantIcon();

    CharSequence getDiamondMerchantLabelForIM();

    Drawable getVerifiedMerchantIcon();

    CharSequence getVerifiedMerchantLabelForIM();

    void gotoC2CFrozenBalanceAppeal(@NotNull Context context, @NotNull String str, @NotNull String str2);

    void gotoC2CFrozenBalanceAppealDetail(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3);

    void gotoC2COrderDetail(@NotNull Context context, @NotNull String str, @NotNull String str2);

    void gotoOtcPage(Context context, @NotNull Bundle bundle, int i, int i2);

    void jumpToMerchantPage(@NotNull Activity activity, @NotNull String str);

    void navigateToP2PWithParams(@NotNull FragmentActivity fragmentActivity, @NotNull EntryParam entryParam, int i, ActivityResultLauncher<Intent> activityResultLauncher);

    void openOrderListWithIndex(@NotNull Activity activity, int i);

    void openP2PChatWithOrderID(@NotNull Activity activity, @NotNull String str);

    void openReportPage(@NotNull Activity activity, @NotNull String str);

    Object requestFrozenAccount(boolean z, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager, @NotNull Function2<? super Boolean, ? super Integer, Unit> function2, @NotNull Continuation<? super Unit> continuation);

    boolean shouldDisplayP2PEntryWithSource(@NotNull EntrySource entrySource);

    void showReorderFlowWithOrderId(@NotNull FragmentActivity fragmentActivity, @NotNull String str);

    AbstractC58185ywX<Boolean> showReportButton(@NotNull String str);

    public static final class DefaultImpls {
        public static /* synthetic */ void gotoOtcPage$default(OTCService oTCService, Context context, Bundle bundle, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoOtcPage");
            }
            if ((i3 & 4) != 0) {
                i = -1;
            }
            if ((i3 & 8) != 0) {
                i2 = -1;
            }
            oTCService.gotoOtcPage(context, bundle, i, i2);
        }

        public static /* synthetic */ void gotoC2COrderDetail$default(OTCService oTCService, Context context, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoC2COrderDetail");
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            oTCService.gotoC2COrderDetail(context, str, str2);
        }

        public static /* synthetic */ Object requestFrozenAccount$default(OTCService oTCService, boolean z, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager, Function2 function2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFrozenAccount");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return oTCService.requestFrozenAccount(z, (i & 2) != 0 ? null : lifecycleOwner, (i & 4) != 0 ? null : fragmentManager, function2, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.p2p.api.OTCService */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void navigateToP2PWithParams$default(OTCService oTCService, FragmentActivity fragmentActivity, EntryParam entryParam, int i, ActivityResultLauncher activityResultLauncher, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToP2PWithParams");
            }
            if ((i2 & 4) != 0) {
                i = -1;
            }
            if ((i2 & 8) != 0) {
                activityResultLauncher = null;
            }
            oTCService.navigateToP2PWithParams(fragmentActivity, entryParam, i, activityResultLauncher);
        }
    }
}
