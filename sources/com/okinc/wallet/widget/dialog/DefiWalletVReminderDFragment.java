package com.okinc.wallet.widget.dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.ColorRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC52785wYg;
import o.C32866mlf;
import o.C33129mqd;
import o.C52761wXj;
import o.C52781wYc;
import o.C52794wYp;
import o.C54954xan;
import o.C55296xhK;
import o.C56392yDr;
import o.C57304yfr;
import o.InterfaceC56387yDm;
import o.rVN;
import o.wYF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class DefiWalletVReminderDFragment extends AbstractC52785wYg {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public Function1<? super Integer, Unit> AEQbTJ;
    public Integer copydefault;
    public int KWHzl = 1;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.yeM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return DefiWalletVReminderDFragment.KWHzl(this.copydefault);
        }
    });

    @Override // o.AbstractC52785wYg
    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.KWHzl = i;
    }

    public final ReminderDataBean OLrzqt() {
        return (ReminderDataBean) this.EZpvd.getValue();
    }

    public static final ReminderDataBean KWHzl(DefiWalletVReminderDFragment defiWalletVReminderDFragment) {
        Bundle arguments = defiWalletVReminderDFragment.getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("data") : null;
        if (serializable instanceof ReminderDataBean) {
            return (ReminderDataBean) serializable;
        }
        return null;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final DefiWalletVReminderDFragment EZpvd(@NotNull ReminderDataBean reminderDataBean) {
            Intrinsics.checkNotNullParameter(reminderDataBean, "");
            DefiWalletVReminderDFragment defiWalletVReminderDFragment = new DefiWalletVReminderDFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("data", reminderDataBean);
            defiWalletVReminderDFragment.setArguments(bundle);
            return defiWalletVReminderDFragment;
        }
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new Runnable() { // from class: o.yeI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                DefiWalletVReminderDFragment.EZpvd(this.copydefault);
            }
        });
    }

    public static final void EZpvd(DefiWalletVReminderDFragment defiWalletVReminderDFragment) {
        rVN.reportFullyDrawn$default((Fragment) defiWalletVReminderDFragment, true, (String) null, 2, (Object) null);
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        Intrinsics.checkNotNullParameter(c54954xan, "");
        ReminderDataBean reminderDataBeanOLrzqt = OLrzqt();
        if (reminderDataBeanOLrzqt != null) {
            if (reminderDataBeanOLrzqt.getIconColor() != null && reminderDataBeanOLrzqt.getIconColor().intValue() > 0) {
                c54954xan.KWHzl.setImageDrawable(C57304yfr.copydefault.OLrzqt(getContext(), reminderDataBeanOLrzqt.getIcon(), reminderDataBeanOLrzqt.getIconColor().intValue()));
            } else {
                c54954xan.KWHzl.setImageResource(reminderDataBeanOLrzqt.getIcon());
            }
            c54954xan.AEQbTJ.setText(reminderDataBeanOLrzqt.getTitle());
            c54954xan.OLrzqt.setText(reminderDataBeanOLrzqt.getContent());
        }
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        ReminderDataBean reminderDataBeanOLrzqt = OLrzqt();
        if (reminderDataBeanOLrzqt != null) {
            wyf.setPrimaryText(reminderDataBeanOLrzqt.getPositiveBtnText());
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(C33129mqd.OLrzqt((CharSequence) reminderDataBeanOLrzqt.getNegativeText()) ? 0 : 8);
            }
            C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ2 != null) {
                c52794wYpAEQbTJ2.setText(reminderDataBeanOLrzqt.getNegativeText());
            }
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
            }
            C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ3 != null) {
                c52794wYpAEQbTJ3.setOKDSType(260);
            }
            C52794wYp c52794wYpAEQbTJ4 = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ4 != null) {
                c52794wYpAEQbTJ4.setOnClickListener(new StateListAnimator(c52794wYpAEQbTJ4, 1000L, this));
            }
        }
    }

    public static final class Application implements Function1<EventParamsList, Unit> {
        public static final Application copydefault = new Application();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("is_click_cancel_reject_link", "true", true);
        }
    }

    public static final class TaskDescription implements Function1<EventParamsList, Unit> {
        public static final TaskDescription KWHzl = new TaskDescription();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("is_click_continue_link", "true", true);
        }
    }

    public final void AEQbTJ(@NotNull FragmentManager fragmentManager, @NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
        show(fragmentManager, DefiWalletVReminderDFragment.class.getName());
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Function1<? super Integer, Unit> function1;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Integer num = this.copydefault;
        if (num != null || (function1 = this.AEQbTJ) == null) {
            return;
        }
        function1.invoke(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(Integer num) {
        this.copydefault = num;
        dismissAllowingStateLoss();
        Function1<? super Integer, Unit> function1 = this.AEQbTJ;
        if (function1 != null) {
            function1.invoke(num);
        }
    }

    public static final class ReminderDataBean implements Serializable {
        public static final int $stable = 0;
        private final String content;
        private final int icon;
        private final Integer iconColor;
        private final String negativeText;
        private final String positiveBtnText;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ReminderDataBean copy$default(ReminderDataBean reminderDataBean, int i, Integer num, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = reminderDataBean.icon;
            }
            if ((i2 & 2) != 0) {
                num = reminderDataBean.iconColor;
            }
            Integer num2 = num;
            if ((i2 & 4) != 0) {
                str = reminderDataBean.title;
            }
            String str5 = str;
            if ((i2 & 8) != 0) {
                str2 = reminderDataBean.content;
            }
            String str6 = str2;
            if ((i2 & 16) != 0) {
                str3 = reminderDataBean.positiveBtnText;
            }
            String str7 = str3;
            if ((i2 & 32) != 0) {
                str4 = reminderDataBean.negativeText;
            }
            return reminderDataBean.copy(i, num2, str5, str6, str7, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component2() {
            return this.iconColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.content;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.positiveBtnText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.negativeText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ReminderDataBean copy(int i, @ColorRes Integer num, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new ReminderDataBean(i, num, str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReminderDataBean)) {
                return false;
            }
            ReminderDataBean reminderDataBean = (ReminderDataBean) obj;
            return this.icon == reminderDataBean.icon && Intrinsics.EZpvd(this.iconColor, reminderDataBean.iconColor) && Intrinsics.EZpvd((Object) this.title, (Object) reminderDataBean.title) && Intrinsics.EZpvd((Object) this.content, (Object) reminderDataBean.content) && Intrinsics.EZpvd((Object) this.positiveBtnText, (Object) reminderDataBean.positiveBtnText) && Intrinsics.EZpvd((Object) this.negativeText, (Object) reminderDataBean.negativeText);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContent() {
            return this.content;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getIconColor() {
            return this.iconColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNegativeText() {
            return this.negativeText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPositiveBtnText() {
            return this.positiveBtnText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.icon);
            Integer num = this.iconColor;
            return (((((((((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + this.positiveBtnText.hashCode()) * 31) + this.negativeText.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ReminderDataBean(icon=" + this.icon + ", iconColor=" + this.iconColor + ", title=" + this.title + ", content=" + this.content + ", positiveBtnText=" + this.positiveBtnText + ", negativeText=" + this.negativeText + ")";
        }

        public ReminderDataBean(int i, @ColorRes Integer num, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.icon = i;
            this.iconColor = num;
            this.title = str;
            this.content = str2;
            this.positiveBtnText = str3;
            this.negativeText = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:int:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.TaskDescription.NRYds int) : (r8v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
 A[MD:(int, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:117) call: com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment.ReminderDataBean.<init>(int, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ ReminderDataBean(int i, Integer num, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? C52761wXj.TaskDescription.NRYds : i, (i2 & 2) != 0 ? null : num, str, str2, str3, str4);
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ DefiWalletVReminderDFragment EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, DefiWalletVReminderDFragment defiWalletVReminderDFragment) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = defiWalletVReminderDFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Confirmationpage_ContractAddressTransferAlert_Popup_View", (TrackChannel[]) null, Application.copydefault, 1, (Object) null);
                this.EZpvd.OLrzqt((Integer) 1);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ DefiWalletVReminderDFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, DefiWalletVReminderDFragment defiWalletVReminderDFragment) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = defiWalletVReminderDFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Confirmationpage_ContractAddressTransferAlert_Popup_View", (TrackChannel[]) null, TaskDescription.KWHzl, 1, (Object) null);
                this.copydefault.OLrzqt((Integer) 2);
            }
        }
    }
}
