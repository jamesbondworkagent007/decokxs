package com.okinc.business.appupdate.utils;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.okinc.business.appupdate.R;
import com.okinc.business.appupdate.api.IUpdate;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33041mov;
import o.C55328xhq;
import o.C59449zhJ;
import o.ViewOnClickListenerC54939xaY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UtilsExtKt {
    public static final void showEroTip(int i) {
        C55328xhq.show$default(C55328xhq.OLrzqt, Integer.valueOf(i), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
    }

    public static final boolean isHarmony() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Method method = cls.getMethod("getOsBrand", new Class[0]);
            Intrinsics.checkNotNullExpressionValue(method, "");
            Object objInvoke = method.invoke(cls, new Object[0]);
            Intrinsics.copydefault(objInvoke, "");
            return C59449zhJ.gEmmrt("harmony", (String) objInvoke, true);
        } catch (Exception unused) {
            return false;
        }
    }

    public static /* synthetic */ void showCustomUpdateDialog$default(AbstractActivityC33041mov abstractActivityC33041mov, IUpdate.DialogInfo dialogInfo, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            dialogInfo = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        showCustomUpdateDialog(abstractActivityC33041mov, dialogInfo, function0);
    }

    public static final void showCustomUpdateDialog(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, final IUpdate.DialogInfo dialogInfo, final Function0<Unit> function0) {
        CharSequence primary;
        CharSequence string;
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(abstractActivityC33041mov);
        viewOnClickListenerC54939xaY.setTitle(dialogInfo != null ? dialogInfo.getTitle() : null);
        viewOnClickListenerC54939xaY.EZpvd(dialogInfo != null ? dialogInfo.getDescription() : null);
        if (TextUtils.isEmpty(dialogInfo != null ? dialogInfo.getPrimary() : null)) {
            primary = abstractActivityC33041mov.getResources().getString(R.string.pr_appupdate_modal_text_update_now);
            Intrinsics.copydefault(primary);
        } else {
            primary = dialogInfo != null ? dialogInfo.getPrimary() : null;
            Intrinsics.copydefault(primary);
        }
        viewOnClickListenerC54939xaY.AEQbTJ(primary, new View.OnClickListener() { // from class: com.okinc.business.appupdate.utils.UtilsExtKt$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UtilsExtKt.showCustomUpdateDialog$lambda$2$lambda$0(function0, dialogInfo, viewOnClickListenerC54939xaY, view);
            }
        });
        if (TextUtils.isEmpty(dialogInfo != null ? dialogInfo.getSecondary() : null)) {
            string = abstractActivityC33041mov.getResources().getString(R.string.pr_notification_button_not_now);
            Intrinsics.copydefault(string);
        } else {
            CharSequence secondary = dialogInfo != null ? dialogInfo.getSecondary() : null;
            Intrinsics.copydefault(secondary);
            string = secondary;
        }
        viewOnClickListenerC54939xaY.EZpvd(string, new View.OnClickListener() { // from class: com.okinc.business.appupdate.utils.UtilsExtKt$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UtilsExtKt.showCustomUpdateDialog$lambda$2$lambda$1(dialogInfo, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCustomUpdateDialog$lambda$2$lambda$0(Function0 function0, IUpdate.DialogInfo dialogInfo, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        DialogInterface.OnClickListener primaryOnClick;
        if (function0 != null) {
            function0.invoke();
        }
        if (dialogInfo != null && dialogInfo.getDismissAfterClick()) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        if (dialogInfo == null || (primaryOnClick = dialogInfo.getPrimaryOnClick()) == null) {
            return;
        }
        primaryOnClick.onClick(viewOnClickListenerC54939xaY, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCustomUpdateDialog$lambda$2$lambda$1(IUpdate.DialogInfo dialogInfo, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        DialogInterface.OnClickListener secondaryOnClick;
        if (dialogInfo != null && dialogInfo.getDismissAfterClick()) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        if (dialogInfo == null || (secondaryOnClick = dialogInfo.getSecondaryOnClick()) == null) {
            return;
        }
        secondaryOnClick.onClick(viewOnClickListenerC54939xaY, -2);
    }
}
