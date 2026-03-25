package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.utils.OpenPublisherUiUtil$showAgreeTncDialog$dialog$1$1$2;
import com.okinc.web.WebActivity;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import o.rTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tTY {
    public static final tTY EZpvd = new tTY();

    private tTY() {
    }

    public final void OLrzqt(android.view.View view, @NotNull java.lang.String str) {
        final C55284xgz c55284xgzKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (view == null || (c55284xgzKWHzl = C55284xgz.Companion.KWHzl(view, str)) == null) {
            return;
        }
        c55284xgzKWHzl.isConnected(1);
        c55284xgzKWHzl.djBIcL(1);
        c55284xgzKWHzl.AEQbTJ(str);
        c55284xgzKWHzl.EZpvd(C33070mpX.AYXKKw(C47501trL.Fragment.dPnHjp));
        c55284xgzKWHzl.EZpvd(new View.OnClickListener() { // from class: o.tUe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                tTY.AEQbTJ(c55284xgzKWHzl, view2);
            }
        });
        c55284xgzKWHzl.hDKMBd();
    }

    public static final void AEQbTJ(C55284xgz c55284xgz, android.view.View view) {
        rTU rtu = (rTU) C43251rlk.copydefault(rTU.class);
        android.content.Context contextGEmmrt = c55284xgz.gEmmrt();
        Intrinsics.checkNotNullExpressionValue(contextGEmmrt, "");
        rTU.Application.openKYCUserCenter$default(rtu, contextGEmmrt, null, 2, null);
        c55284xgz.copydefault();
    }

    public final void KWHzl(android.view.View view, @NotNull java.lang.String str) {
        final C55284xgz c55284xgzKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (view == null || (c55284xgzKWHzl = C55284xgz.Companion.KWHzl(view, str)) == null) {
            return;
        }
        c55284xgzKWHzl.isConnected(1);
        c55284xgzKWHzl.djBIcL(0);
        c55284xgzKWHzl.AEQbTJ(str);
        c55284xgzKWHzl.EZpvd(new View.OnClickListener() { // from class: o.tTX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                tTY.copydefault(c55284xgzKWHzl, view2);
            }
        });
        c55284xgzKWHzl.hDKMBd();
    }

    public static final void copydefault(C55284xgz c55284xgz, android.view.View view) {
        c55284xgz.copydefault();
    }

    public final void copydefault(android.view.View view, @NotNull java.lang.String str) {
        C55284xgz c55284xgzKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (view == null || (c55284xgzKWHzl = C55284xgz.Companion.KWHzl(view, str)) == null) {
            return;
        }
        c55284xgzKWHzl.isConnected(1);
        c55284xgzKWHzl.djBIcL(0);
        c55284xgzKWHzl.AEQbTJ(str);
        c55284xgzKWHzl.hDKMBd();
    }

    public final void AEQbTJ(android.view.View view, @NotNull java.lang.String str) {
        C55284xgz c55284xgzKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (view == null || (c55284xgzKWHzl = C55284xgz.Companion.KWHzl(view, str)) == null) {
            return;
        }
        c55284xgzKWHzl.isConnected(3);
        c55284xgzKWHzl.djBIcL(0);
        c55284xgzKWHzl.AEQbTJ(str);
        c55284xgzKWHzl.hDKMBd();
    }

    public final void OLrzqt(@NotNull final android.content.Context context, final android.view.View view, @NotNull final java.lang.String str, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C47501trL.Application.DTwDnp, (android.view.ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        final wYK wyk = (wYK) viewInflate.findViewById(C47501trL.TaskDescription.OxVOHk);
        wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.tUa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                tTY.EZpvd(wyk, compoundButton, z);
            }
        });
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.getUserContextRegisteredStatus);
        wyk.setText(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C47501trL.Fragment.fupbxE, C56423yEv.EZpvd(C56390yDp.OLrzqt("termsConditions", strAYXKKw))), new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.tUc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tTY.OLrzqt(context, (java.util.List) obj);
            }
        }, 14, null));
        wyk.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(context.getString(C47501trL.Fragment.hlXVux));
        viewOnClickListenerC54939xaY.EZpvd(context.getString(C47501trL.Fragment.pauseLocationServices));
        java.lang.String string = context.getString(C47501trL.Fragment.fJNWhG);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.tUb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                tTY.copydefault(wyk, viewOnClickListenerC54939xaY, function0, view, str, view2);
            }
        });
        java.lang.String string2 = context.getString(C47501trL.Fragment.ejfBZ);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY.AEQbTJ(string2, new View.OnClickListener() { // from class: o.tUd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                tTY.copydefault(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.EZpvd(viewInflate);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(wYK wyk, android.widget.CompoundButton compoundButton, boolean z) {
        wyk.setError(false);
    }

    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.content.Context AEQbTJ;

        public StateListAnimator(android.content.Context context) {
            this.AEQbTJ = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this.AEQbTJ, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C47501trL.Fragment.init))), null, 4, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }
    }

    public static final Unit OLrzqt(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new StateListAnimator(context));
        return Unit.INSTANCE;
    }

    public static final void copydefault(wYK wyk, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view, java.lang.String str, android.view.View view2) {
        if (!wyk.isChecked()) {
            wyk.setError(true);
        } else {
            C32866mlf.onEvent$default("Feeds_Mid_TnC_Click", (TrackChannel[]) null, new Function1() { // from class: o.tTW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tTY.OLrzqt((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewOnClickListenerC54939xaY), null, null, new OpenPublisherUiUtil$showAgreeTncDialog$dialog$1$1$2(wyk, function0, viewOnClickListenerC54939xaY, view, str, null), 3, null);
        }
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button", Web3SecurityTrackEvent.VALUE_CONFIRM, false, 4, null);
        EventParamsList.put$default(eventParamsList, "timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C32866mlf.onEvent$default("Feeds_Mid_TnC_Click", (TrackChannel[]) null, new Function1() { // from class: o.tTV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tTY.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button", OtpEventTracker.OTP_EVENT_VALUE_CANCEL, false, 4, null);
        EventParamsList.put$default(eventParamsList, "timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), false, 4, null);
        return Unit.INSTANCE;
    }
}
