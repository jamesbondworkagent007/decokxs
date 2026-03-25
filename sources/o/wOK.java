package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.tradingbot.impl.dto.ArbFundingFeeVo;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wOK extends AbstractC59533zio<ArbFundingFeeVo, TaskDescription> {
    public final java.lang.String AEQbTJ;
    public final Function2<java.lang.Long, Function1<? super java.lang.Long, ? extends android.os.CountDownTimer>, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends android.os.CountDownTimer>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public wOK(@NotNull java.lang.String str, @NotNull Function2<? super java.lang.Long, ? super Function1<? super java.lang.Long, ? extends android.os.CountDownTimer>, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = str;
        this.OLrzqt = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uME umeEZpvd = uME.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(umeEZpvd, "");
        return new TaskDescription(this, umeEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull ArbFundingFeeVo arbFundingFeeVo) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(arbFundingFeeVo, "");
        final uME umeCopydefault = taskDescription.copydefault();
        if (arbFundingFeeVo.AYXKKw() || C33129mqd.AEQbTJ(java.lang.Long.valueOf(arbFundingFeeVo.EZpvd()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(iCopydefault);
        umeCopydefault.gEmmrt.setImageTintList(colorStateListValueOf);
        umeCopydefault.fetchVPNInfo.setBackgroundTintList(colorStateListValueOf);
        umeCopydefault.isConnected.setTextColor(colorStateListValueOf);
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = taskDescription.getBindingAdapter();
        boolean z = bindingAdapter != null && bindingAdapter.getItemCount() == taskDescription.getBindingAdapterPosition() + 1;
        android.view.View view = umeCopydefault.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 8 : 0);
        android.view.View view2 = umeCopydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(z ? 8 : 0);
        final java.lang.String time$default = pTA.formatTime$default(new Date(arbFundingFeeVo.EZpvd()), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
        umeCopydefault.isConnected.setText(time$default);
        if (arbFundingFeeVo.AYXKKw()) {
            this.OLrzqt.invoke(java.lang.Long.valueOf(arbFundingFeeVo.EZpvd()), new Function1() { // from class: o.wOM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return wOK.copydefault(umeCopydefault, this, time$default, ((java.lang.Long) obj).longValue());
                }
            });
        }
        java.lang.String strAEQbTJ = arbFundingFeeVo.AEQbTJ();
        umeCopydefault.djBIcL.setText(strAEQbTJ);
        android.widget.TextView textView = umeCopydefault.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((strAEQbTJ == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) ? 8 : 0);
        LinearLayoutCompat linearLayoutCompat = umeCopydefault.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility((strAEQbTJ == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) ? 0 : 8);
        umeCopydefault.valueOf.setText(arbFundingFeeVo.AYXKKw() ? C33070mpX.AYXKKw(C48033uCm.Fragment.DwQSDd) : C33070mpX.AYXKKw(C48033uCm.Fragment.gGNlxh));
        android.widget.TextView textView2 = umeCopydefault.values;
        java.lang.String strCopydefault = arbFundingFeeVo.copydefault();
        textView2.setText(C56033xvF.copydefault(strCopydefault == null ? "" : strCopydefault, this.AEQbTJ, (88 & 4) != 0 ? false : true, (88 & 8) != 0 ? null : "3", (88 & 16) != 0 ? false : false, (88 & 32) == 0, (88 & 64) == 0 ? null : null));
        textView2.setTextColor(arbFundingFeeVo.AYXKKw() ? C33070mpX.copydefault(C52761wXj.Activity.QwvEab) : C56033xvF.OLrzqt((java.lang.Object) arbFundingFeeVo.copydefault()));
        umeCopydefault.OLrzqt.setText(arbFundingFeeVo.AYXKKw() ? C33070mpX.AYXKKw(C48033uCm.Fragment.DlABUU) : C33070mpX.AYXKKw(C55688xof.Application.getActiveNotifications));
        android.widget.TextView textView3 = umeCopydefault.KWHzl;
        java.lang.String strKWHzl = arbFundingFeeVo.KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        textView3.setText(C56033xvF.fmtBotPnlPercent$default(strKWHzl, true, 0, 4, null));
        textView3.setTextColor(arbFundingFeeVo.AYXKKw() ? C33070mpX.copydefault(C52761wXj.Activity.QwvEab) : C56033xvF.OLrzqt((java.lang.Object) arbFundingFeeVo.KWHzl()));
        umeCopydefault.copydefault.setText(arbFundingFeeVo.AYXKKw() ? C33070mpX.AYXKKw(C48033uCm.Fragment.abAflu) : C33070mpX.AYXKKw(C48033uCm.Fragment.getSessionID));
        android.widget.TextView textView4 = umeCopydefault.EZpvd;
        java.lang.String strOLrzqt = arbFundingFeeVo.OLrzqt();
        textView4.setText(C56033xvF.fmtBotPnlPercent$default(strOLrzqt != null ? strOLrzqt : "", false, 4, 2, null));
        textView4.setTextColor(arbFundingFeeVo.AYXKKw() ? C33070mpX.copydefault(C52761wXj.Activity.QwvEab) : C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
    }

    public static final class Activity extends android.os.CountDownTimer {
        public final /* synthetic */ wOK AEQbTJ;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ uME OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(long j, uME ume, wOK wok, java.lang.String str) {
            super(j, 1000L);
            this.OLrzqt = ume;
            this.AEQbTJ = wok;
            this.KWHzl = str;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            java.lang.String strAYXKKw = C33129mqd.AYXKKw(java.lang.Long.valueOf(timeUnit.toHours(j)));
            long j2 = 60;
            long minutes = timeUnit.toMinutes(j) % j2;
            java.lang.String strAYXKKw2 = C33129mqd.AYXKKw(java.lang.Integer.valueOf((int) (minutes + ((((minutes ^ j2) & ((-minutes) | minutes)) >> 63) & j2))));
            long seconds = timeUnit.toSeconds(j) % j2;
            this.OLrzqt.isConnected.setText(this.AEQbTJ.OLrzqt(this.KWHzl, strAYXKKw, strAYXKKw2, C33129mqd.AYXKKw(java.lang.Integer.valueOf((int) (seconds + (j2 & (((seconds ^ j2) & ((-seconds) | seconds)) >> 63)))))));
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.OLrzqt.isConnected.setText(wOK.getCountdownText$default(this.AEQbTJ, this.KWHzl, null, null, null, 14, null));
        }
    }

    public static final android.os.CountDownTimer copydefault(uME ume, wOK wok, java.lang.String str, long j) {
        android.os.CountDownTimer countDownTimerStart = new Activity(j, ume, wok, str).start();
        Intrinsics.checkNotNullExpressionValue(countDownTimerStart, "");
        return countDownTimerStart;
    }

    public static /* synthetic */ java.lang.String getCountdownText$default(wOK wok, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "0";
        }
        if ((i & 4) != 0) {
            str3 = "0";
        }
        if ((i & 8) != 0) {
            str4 = "0";
        }
        return wok.OLrzqt(str, str2, str3, str4);
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return str + " (" + C33069mpW.copydefault(C48033uCm.Fragment.isScanInProgress, C56424yEw.gEmmrt(C56390yDp.OLrzqt("hour", str2), C56390yDp.OLrzqt("minute", str3), C56390yDp.OLrzqt("second", str4))) + ")";
    }

    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final uME AEQbTJ;
        public final /* synthetic */ wOK copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uME copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull wOK wok, uME ume) {
            super(ume.getRoot());
            Intrinsics.checkNotNullParameter(ume, "");
            this.copydefault = wok;
            this.AEQbTJ = ume;
        }
    }
}
