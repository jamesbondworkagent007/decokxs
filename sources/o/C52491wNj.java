package o;

import androidx.core.widget.TextViewCompat;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.bot.data.BotRemindData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52491wNj extends AbstractC59533zio<BotRemindData, C52490wNi> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C52490wNi onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.QMuEJi, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C52490wNi(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52490wNi c52490wNi, @NotNull BotRemindData botRemindData) {
        Intrinsics.checkNotNullParameter(c52490wNi, "");
        Intrinsics.checkNotNullParameter(botRemindData, "");
        c52490wNi.copydefault().setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) botRemindData.getTitle()) ^ true ? 0 : 8);
        c52490wNi.copydefault().setText(botRemindData.getTitle());
        TextViewCompat.setTextAppearance(c52490wNi.copydefault(), botRemindData.getTextSize());
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(botRemindData.getTextColor()), 0)) {
            c52490wNi.copydefault().setTextColor(botRemindData.getTextColor());
        }
        OKReminder oKReminderAEQbTJ = c52490wNi.AEQbTJ();
        oKReminderAEQbTJ.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) botRemindData.getReminderMsg()) ^ true ? 0 : 8);
        oKReminderAEQbTJ.setStyle(0);
        oKReminderAEQbTJ.setCloseIconVisibility(false);
        oKReminderAEQbTJ.setMessage(botRemindData.getReminderMsg());
    }
}
