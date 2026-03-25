package o;

import android.view.View;
import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27496jwL {
    public static final C27496jwL EZpvd = new C27496jwL();

    private C27496jwL() {
    }

    public final ViewOnClickListenerC54939xaY EZpvd(@NotNull android.content.Context context, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.view.View view, boolean z, boolean z2, java.lang.CharSequence charSequence3, final Function0<Unit> function0, java.lang.CharSequence charSequence4, View.OnClickListener onClickListener, final boolean z3) {
        Intrinsics.checkNotNullParameter(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        if (charSequence != null) {
            viewOnClickListenerC54939xaY.setTitle(charSequence);
        }
        if (charSequence2 != null) {
            viewOnClickListenerC54939xaY.EZpvd(charSequence2);
        }
        if (view != null) {
            ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, view, 0, 2, null);
        }
        viewOnClickListenerC54939xaY.setCancelable(z);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(z2);
        if (charSequence3 != null) {
            viewOnClickListenerC54939xaY.AEQbTJ(charSequence3, new View.OnClickListener() { // from class: o.jwK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C27496jwL.copydefault(z3, viewOnClickListenerC54939xaY, function0, view2);
                }
            });
        }
        if (charSequence4 != null) {
            viewOnClickListenerC54939xaY.AEQbTJ(charSequence4.toString(), onClickListener);
        }
        return viewOnClickListenerC54939xaY;
    }

    public static final void copydefault(boolean z, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        if (z) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.jwL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewOnClickListenerC54939xaY showDialog$default(C27496jwL c27496jwL, android.content.Context context, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.view.View view, boolean z, boolean z2, java.lang.CharSequence charSequence3, Function0 function0, java.lang.CharSequence charSequence4, View.OnClickListener onClickListener, boolean z3, int i, java.lang.Object obj) {
        return c27496jwL.AEQbTJ(context, (i & 2) != 0 ? null : charSequence, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : view, (i & 16) != 0 ? true : z, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? null : charSequence3, (i & 128) != 0 ? null : function0, (i & 256) != 0 ? null : charSequence4, (i & 512) == 0 ? onClickListener : null, (i & 1024) == 0 ? z3 : true);
    }

    public final ViewOnClickListenerC54939xaY AEQbTJ(@NotNull android.content.Context context, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.view.View view, boolean z, boolean z2, java.lang.CharSequence charSequence3, Function0<Unit> function0, java.lang.CharSequence charSequence4, View.OnClickListener onClickListener, boolean z3) {
        Intrinsics.checkNotNullParameter(context, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaYEZpvd = EZpvd(context, charSequence, charSequence2, view, z, z2, charSequence3, function0, charSequence4, onClickListener, z3);
        viewOnClickListenerC54939xaYEZpvd.show();
        return viewOnClickListenerC54939xaYEZpvd;
    }

    public final void copydefault(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        showDialog$default(this, activity, C33070mpX.AYXKKw(C25493ixk.FragmentManager.sbu), C33069mpW.copydefault(C25493ixk.FragmentManager.DjwCMv, C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", str))), null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcMfJKDGTeJD), function0, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcMfJKDIADVb), null, false, 1592, null);
    }

    public final void copydefault(@NotNull final android.content.Context context, @NotNull InvestPopUpData investPopUpData, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(investPopUpData, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        java.lang.String title = investPopUpData.getTitle();
        if (title != null && title.length() != 0) {
            viewOnClickListenerC54939xaY.setTitle(investPopUpData.getTitle());
        }
        java.lang.String content = investPopUpData.getContent();
        if (content != null && content.length() != 0) {
            viewOnClickListenerC54939xaY.EZpvd(investPopUpData.getContent());
        }
        java.util.List<InvestButtonAction> actions = investPopUpData.getActions();
        if (actions != null) {
            int i = 0;
            for (java.lang.Object obj : actions) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                final InvestButtonAction investButtonAction = (InvestButtonAction) obj;
                java.lang.String actionName = investButtonAction.getActionName();
                if (actionName != null && actionName.length() != 0) {
                    if (i != yDY.AuCTel(investPopUpData.getActions()) || investPopUpData.getActions().size() == 1) {
                        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) investButtonAction.getActionName(), new View.OnClickListener() { // from class: o.jwM
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) throws java.io.UnsupportedEncodingException {
                                C27496jwL.KWHzl(viewOnClickListenerC54939xaY, investButtonAction, context, function0, view);
                            }
                        });
                    } else {
                        viewOnClickListenerC54939xaY.AEQbTJ(investButtonAction.getActionName(), new View.OnClickListener() { // from class: o.jwN
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) throws java.io.UnsupportedEncodingException {
                                C27496jwL.AEQbTJ(viewOnClickListenerC54939xaY, investButtonAction, context, function0, view);
                            }
                        });
                    }
                }
                i++;
            }
        }
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, InvestButtonAction investButtonAction, android.content.Context context, Function0 function0, android.view.View view) throws java.io.UnsupportedEncodingException {
        EZpvd.EZpvd(viewOnClickListenerC54939xaY, investButtonAction, context, (Function0<Unit>) function0);
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, InvestButtonAction investButtonAction, android.content.Context context, Function0 function0, android.view.View view) throws java.io.UnsupportedEncodingException {
        EZpvd.EZpvd(viewOnClickListenerC54939xaY, investButtonAction, context, (Function0<Unit>) function0);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jwX.openUrl$default(o.jwX, android.content.Context, java.lang.String, boolean, int, java.lang.Object):void */
    public final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, InvestButtonAction investButtonAction, android.content.Context context, Function0<Unit> function0) throws java.io.UnsupportedEncodingException {
        java.lang.String actionCallback = investButtonAction.getActionCallback();
        if (actionCallback != null) {
            int iHashCode = actionCallback.hashCode();
            if (iHashCode == -892151604) {
                if (actionCallback.equals(InvestButtonAction.ACTION_CALLBACK_URL_REDIRECT)) {
                    viewOnClickListenerC54939xaY.dismiss();
                    java.lang.String actionURL = investButtonAction.getActionURL();
                    if (actionURL == null || actionURL.length() == 0) {
                        return;
                    }
                    C27508jwX.openUrl$default(C27508jwX.AEQbTJ, context, investButtonAction.getActionURL(), false, 2, null);
                    return;
                }
                return;
            }
            if (iHashCode == 64218584) {
                if (actionCallback.equals(InvestButtonAction.ACTION_CALLBACK_CLOSE)) {
                    viewOnClickListenerC54939xaY.dismiss();
                }
            } else if (iHashCode == 1803427515 && actionCallback.equals(InvestButtonAction.ACTION_CALLBACK_REFRESH)) {
                viewOnClickListenerC54939xaY.dismiss();
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
