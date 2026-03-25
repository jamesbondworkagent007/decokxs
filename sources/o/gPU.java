package o;

import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig;
import com.okinc.business.dex.trade.common.reminder.ReminderShowType;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gPU extends android.widget.FrameLayout {
    public static final int AEQbTJ = OKReminder.EZpvd;
    public final OKReminder OLrzqt;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ReminderShowType.values().length];
            try {
                iArr[ReminderShowType.Info.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ReminderShowType.Warning.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ReminderShowType.Critical.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gPU(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        OKReminder oKReminder = new OKReminder(context, null, 0, 6, null);
        oKReminder.setReminderBackground(new ColorDrawable(0));
        this.OLrzqt = oKReminder;
        addView(oKReminder, new FrameLayout.LayoutParams(-1, -2));
        setBackgroundColor(0);
    }

    public final void OLrzqt(@NotNull ReminderInfoConfig reminderInfoConfig) {
        int i;
        Intrinsics.checkNotNullParameter(reminderInfoConfig, "");
        int i2 = Activity.copydefault[reminderInfoConfig.getAlertType().ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            i = 0;
        }
        OLrzqt(i);
        this.OLrzqt.setTitle((java.lang.CharSequence) reminderInfoConfig.getErrorTitle());
        this.OLrzqt.setMessage(reminderInfoConfig.getMessage());
        java.lang.String actionMessage = reminderInfoConfig.getActionMessage();
        if (actionMessage != null && actionMessage.length() != 0) {
            this.OLrzqt.setPrimaryAction(reminderInfoConfig.getActionMessage(), new Function0() { // from class: o.gPT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return gPU.AEQbTJ();
                }
            });
        } else {
            this.OLrzqt.setPrimaryAction(null, null);
        }
        this.OLrzqt.setCloseIconVisibility(false);
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public final void setActionCallback(Function0<Unit> function0) {
        OKReminder oKReminder = this.OLrzqt;
        java.lang.CharSequence text = oKReminder.AYXKKw().getText();
        oKReminder.setPrimaryAction(text != null ? text.toString() : null, function0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            setTransparentBackground();
        }
    }

    private final void OLrzqt(int i) {
        this.OLrzqt.setStyle(i);
        setTransparentBackground();
    }

    public final void setTransparentBackground() {
        this.OLrzqt.setReminderBackground(new ColorDrawable(0));
    }
}
