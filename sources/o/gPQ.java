package o;

import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gPQ {
    public static final gPQ OLrzqt = new gPQ();

    private gPQ() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.gPQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void show$default(gPQ gpq, android.content.Context context, java.util.List list, gOP gop, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            gop = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        gpq.KWHzl(context, list, gop, function0);
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull java.util.List<ReminderInfoConfig> list, gOP gop, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        android.widget.ScrollView scrollViewCopydefault = copydefault(context, list, gop, new Function0() { // from class: o.gPP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gPQ.AEQbTJ(viewOnClickListenerC54939xaY);
            }
        });
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.register));
        viewOnClickListenerC54939xaY.EZpvd(scrollViewCopydefault);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultRegistry2), new View.OnClickListener() { // from class: o.gPR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                gPQ.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.gPV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                gPQ.copydefault(function0, dialogInterface);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(Function0 function0, android.content.DialogInterface dialogInterface) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final android.widget.ScrollView copydefault(android.content.Context context, java.util.List<ReminderInfoConfig> list, gOP gop, Function0<Unit> function0) {
        android.widget.ScrollView scrollView = new android.widget.ScrollView(context);
        float f = 24;
        int i = (int) (scrollView.getResources().getDisplayMetrics().density * f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i2 = -i;
        layoutParams.setMargins(i2, 0, i2, 0);
        scrollView.setLayoutParams(layoutParams);
        scrollView.setPadding(0, 0, 0, 0);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        float f2 = 8;
        int i3 = (int) (linearLayout.getResources().getDisplayMetrics().density * f2);
        linearLayout.setPadding(i3, 0, i3, 0);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linearLayout.addView(OLrzqt.AEQbTJ(context, (ReminderInfoConfig) it.next(), gop, function0));
        }
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.dispatchResult));
        textView.setTextColor(context.getColor(C52761wXj.Activity.DGUQLIdZmdUa));
        textView.setTextSize(12.0f);
        textView.setPadding((int) (36 * textView.getResources().getDisplayMetrics().density), (int) (f2 * textView.getResources().getDisplayMetrics().density), (int) (f * textView.getResources().getDisplayMetrics().density), 0);
        textView.setGravity(8388611);
        linearLayout.addView(textView);
        scrollView.addView(linearLayout);
        return scrollView;
    }

    public final android.view.View AEQbTJ(android.content.Context context, ReminderInfoConfig reminderInfoConfig, gOP gop, final Function0<Unit> function0) {
        final Function0<Unit> function0Copydefault;
        gPU gpu = new gPU(context);
        gpu.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        gpu.OLrzqt(reminderInfoConfig);
        java.lang.String actionMessage = reminderInfoConfig.getActionMessage();
        if (actionMessage != null && actionMessage.length() != 0 && (function0Copydefault = gOY.Companion.copydefault(reminderInfoConfig.getReminderType(), reminderInfoConfig.getActionMessage(), gop)) != null) {
            gpu.setActionCallback(new Function0() { // from class: o.gPO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return gPQ.EZpvd(function0, function0Copydefault);
                }
            });
        }
        return gpu;
    }

    public static final Unit EZpvd(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }
}
