package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.immomo.mls.InitData;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46369tRu {
    public static final android.content.Context AEQbTJ() {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        return activityAEQbTJ != null ? activityAEQbTJ : C43246rlf.OLrzqt.valueOf();
    }

    public static /* synthetic */ int getRateColor$default(android.content.Context context, BigDecimal bigDecimal, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = C52761wXj.Activity.DeEinT;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return OLrzqt(context, bigDecimal, i, z);
    }

    public static final int OLrzqt(@NotNull android.content.Context context, @NotNull BigDecimal bigDecimal, @androidx.annotation.ColorRes int i, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        if (!z) {
            return C33129mqd.AEQbTJ(bigDecimal, 0) ? C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33129mqd.gEmmrt(bigDecimal, 0) ? C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33070mpX.OLrzqt(i, context);
        }
        C55365xia c55365xia = new C55365xia(context, 32);
        return C33129mqd.AEQbTJ(bigDecimal, 0) ? C55366xib.KWHzl(C52761wXj.ActionBar.iPSTqm, c55365xia) : C33129mqd.gEmmrt(bigDecimal, 0) ? C55366xib.KWHzl(C52761wXj.ActionBar.dvImUD, c55365xia) : C33070mpX.OLrzqt(i, context);
    }

    public static final int EZpvd(boolean z) {
        android.content.Context contextAEQbTJ = AEQbTJ();
        if (z) {
            return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, contextAEQbTJ, 0.0f, 2, null);
        }
        return C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, contextAEQbTJ, 0.0f, 2, null);
    }

    public static /* synthetic */ void startActivity$default(android.content.Context context, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) android.app.Activity.class);
        if (function1 != null) {
            function1.invoke(intent);
        }
        context.startActivity(intent);
    }

    public static /* synthetic */ android.content.Intent intentOf$default(android.content.Context context, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) android.app.Activity.class);
        if (function1 != null) {
            function1.invoke(intent);
        }
        return intent;
    }

    public static /* synthetic */ void openMiniAppByMLNRouter$default(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        copydefault(context, str, str2, map);
    }

    public static final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C43056riA.AEQbTJ.copydefault(context, str, str2, map);
    }

    public static /* synthetic */ InitData createInitDataForMiniApp$default(java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        return AEQbTJ(str, str2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
    }

    public static final InitData AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C43056riA.AEQbTJ.EZpvd(str, str2, map);
    }

    public static final void OLrzqt(@NotNull android.content.Context context, java.lang.Integer num, @NotNull java.lang.String str, kotlin.Pair<java.lang.Integer, ? extends Function1<? super ViewOnClickListenerC54939xaY, Unit>> pair, kotlin.Pair<java.lang.Integer, ? extends Function1<? super ViewOnClickListenerC54939xaY, Unit>> pair2, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        if (num != null) {
            viewOnClickListenerC54939xaY.setTitle(num.intValue());
        }
        viewOnClickListenerC54939xaY.EZpvd(str);
        if (pair != null) {
            int iIntValue = pair.component1().intValue();
            final Function1<? super ViewOnClickListenerC54939xaY, Unit> function1Component2 = pair.component2();
            viewOnClickListenerC54939xaY.EZpvd(iIntValue, new View.OnClickListener() { // from class: o.tRr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C46369tRu.EZpvd(function1Component2, viewOnClickListenerC54939xaY, view);
                }
            });
        }
        if (pair2 != null) {
            int iIntValue2 = pair2.component1().intValue();
            final Function1<? super ViewOnClickListenerC54939xaY, Unit> function1Component22 = pair2.component2();
            viewOnClickListenerC54939xaY.OLrzqt(iIntValue2, new View.OnClickListener() { // from class: o.tRq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C46369tRu.AEQbTJ(function1Component22, viewOnClickListenerC54939xaY, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.tRx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C46369tRu.copydefault(function0, dialogInterface);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
    }

    public static final void AEQbTJ(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
    }

    public static final void copydefault(Function0 function0, android.content.DialogInterface dialogInterface) {
        if (function0 != null) {
            function0.invoke();
        }
    }
}
