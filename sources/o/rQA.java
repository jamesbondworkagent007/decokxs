package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Reminder;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rQA extends android.widget.FrameLayout {
    public ViewStatus EZpvd;
    public final AbstractC43983rza OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.EZpvd = viewStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rQA(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.aUsmxb, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (AbstractC43983rza) viewDataBindingInflate;
        this.EZpvd = ViewStatus.Form;
    }

    public final void EZpvd(@NotNull Reminder reminder, @NotNull final Function1<? super CTAButtonAppModel, Unit> function1) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(reminder, "");
        Intrinsics.checkNotNullParameter(function1, "");
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iAEQbTJ = rqr.AEQbTJ(context, this.EZpvd, reminder.getBottomMargin());
        int i = 0;
        setPaddingRelative(0, 0, 0, iAEQbTJ);
        OKReminder oKReminder = this.OLrzqt.copydefault;
        if (Intrinsics.EZpvd((java.lang.Object) reminder.getStatus(), (java.lang.Object) "passed")) {
            oKReminder.setStyle(1);
        } else {
            oKReminder.setStyle(2);
        }
        oKReminder.EZpvd().AhwBna.setOKDSType(258);
        oKReminder.EZpvd().AhwBna.setOKDSSize(36);
        oKReminder.setTitle(reminder.getTitle());
        ViewGroup.LayoutParams layoutParams = oKReminder.EZpvd().AYXKKw.getLayoutParams();
        layoutParams.width = -1;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        android.content.Context context2 = oKReminder.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        layoutParams2.topMargin = C55298xhM.OLrzqt(16, context2);
        android.content.Context context3 = oKReminder.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        layoutParams2.bottomMargin = C55298xhM.OLrzqt(16, context3);
        oKReminder.EZpvd().values.setVisibility(8);
        oKReminder.EZpvd().AhwBna.setLayoutParams(layoutParams2);
        oKReminder.EZpvd().AYXKKw.setOrientation(1);
        oKReminder.EZpvd().AYXKKw.setLayoutParams(layoutParams);
        oKReminder.setCloseIconVisibility(false);
        oKReminder.setLeadingIconVisibility(true);
        if (C33129mqd.KWHzl((java.util.Collection) reminder.getContent())) {
            java.util.List<java.lang.String> content = reminder.getContent();
            Intrinsics.copydefault(content);
            for (java.lang.String str2 : content) {
                java.util.List<java.lang.String> content2 = reminder.getContent();
                Intrinsics.copydefault(content2);
                str = i == content2.size() - 1 ? str + str2 : str + str2 + "\n";
                i++;
            }
            oKReminder.setMessage(str);
        }
        final CTAButtonAppModel cta = reminder.getCta();
        if (cta != null && !android.text.TextUtils.isEmpty(cta.getText())) {
            oKReminder.setPrimaryAction(cta.getText(), new Function0() { // from class: o.rQB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return rQA.OLrzqt(function1, cta);
                }
            });
        }
        oKReminder.EZpvd().AhwBna.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
    }

    public static final Unit OLrzqt(Function1 function1, CTAButtonAppModel cTAButtonAppModel) {
        function1.invoke(cTAButtonAppModel);
        return Unit.INSTANCE;
    }
}
