package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.unify_trade.bot.data.SignalMultiCoinPairSelectItemData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52861wac extends AbstractC59533zio<Activity, TaskDescription> {
    public final java.lang.String AEQbTJ;
    public final Function1<java.lang.Boolean, Unit> EZpvd;
    public final java.util.List<SignalMultiCoinPairSelectItemData> KWHzl;
    public final Function1<java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52861wac(@NotNull java.lang.String str, @NotNull java.util.List<SignalMultiCoinPairSelectItemData> list, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super java.lang.Boolean, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ = str;
        this.KWHzl = list;
        this.copydefault = function1;
        this.EZpvd = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uSS ussEZpvd = uSS.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ussEZpvd, "");
        return new TaskDescription(this, ussEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(activity, "");
        uSS ussOLrzqt = taskDescription.OLrzqt();
        ussOLrzqt.OLrzqt.KWHzl().addTextChangedListener(new ActionBar(ussOLrzqt, this));
        android.widget.TextView textView = ussOLrzqt.KWHzl;
        if (this.KWHzl.isEmpty()) {
            Intrinsics.copydefault(textView);
            textView.setVisibility(8);
        } else {
            Intrinsics.copydefault(textView);
            textView.setVisibility(0);
            textView.setLineSpacing(16.0f, 1.0f);
            textView.setText(EZpvd());
            textView.setOnClickListener(new Application(textView, 1000L, this, textView));
        }
        C52834waB c52834waB = ussOLrzqt.copydefault;
        c52834waB.setTitle(C33070mpX.AYXKKw(C55688xof.Application.ICustomTabsCallbackStub));
        c52834waB.setTitleIcon(java.lang.Integer.valueOf(C48033uCm.ActionBar.AkhnZx));
        c52834waB.setRightClickEnable(activity.KWHzl());
        c52834waB.setRightIconCheck(activity.copydefault());
        C52834waB.setRightIconClick$default(c52834waB, false, new Function1() { // from class: o.wae
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52861wac.copydefault(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }, 1, null);
    }

    public static final Unit copydefault(C52861wac c52861wac, boolean z) {
        c52861wac.EZpvd.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public final void copydefault(android.content.Context context) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.DhEJvI));
        viewOnClickListenerC54939xaY.EZpvd(CollectionsKt___CollectionsKt.joinToString$default(this.KWHzl, ", ", null, null, 0, null, new Function1() { // from class: o.wab
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52861wac.KWHzl((SignalMultiCoinPairSelectItemData) obj);
            }
        }, 30, null));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), new View.OnClickListener() { // from class: o.wad
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52861wac.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final java.lang.CharSequence KWHzl(SignalMultiCoinPairSelectItemData signalMultiCoinPairSelectItemData) {
        Intrinsics.checkNotNullParameter(signalMultiCoinPairSelectItemData, "");
        return C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, signalMultiCoinPairSelectItemData.OLrzqt(), signalMultiCoinPairSelectItemData.copydefault(), false, false, 12, null);
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final java.lang.CharSequence EZpvd() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.iFnJKK);
        return C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C55688xof.Application.dcEsSD, C56424yEw.gEmmrt(C56390yDp.OLrzqt("leverage", C56033xvF.getBotLever$default(this.AEQbTJ, false, 2, null)), C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(java.lang.String.valueOf(this.KWHzl.size()))))) + "\n" + strAYXKKw, new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.waj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52861wac.OLrzqt((java.util.List) obj);
            }
        }, 14, null);
    }

    /* JADX INFO: renamed from: o.wac$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        public final /* synthetic */ C52861wac EZpvd;
        public final /* synthetic */ uSS OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar(uSS uss, C52861wac c52861wac) {
            this.OLrzqt = uss;
            this.EZpvd = c52861wac;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(this.OLrzqt.OLrzqt.AhwBna());
            C52834waB c52834waB = this.OLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52834waB, "");
            c52834waB.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt) ? 0 : 8);
            this.EZpvd.copydefault.invoke(strGEmmrt);
        }
    }

    public static final Unit OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.UnderlineSpan());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wac$Activity */
    public static final class Activity {
        public final boolean EZpvd;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                z2 = activity.EZpvd;
            }
            return activity.KWHzl(z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(boolean z, boolean z2) {
            return new Activity(z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.OLrzqt == activity.OLrzqt && this.EZpvd == activity.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.OLrzqt) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UiModel(isAllRightIconChecked=" + this.OLrzqt + ", isAllRightIconEnabled=" + this.EZpvd + ")";
        }

        public Activity(boolean z, boolean z2) {
            this.OLrzqt = z;
            this.EZpvd = z2;
        }
    }

    /* JADX INFO: renamed from: o.wac$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final /* synthetic */ C52861wac EZpvd;
        public final uSS KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uSS OLrzqt() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C52861wac c52861wac, uSS uss) {
            super(uss.getRoot());
            Intrinsics.checkNotNullParameter(uss, "");
            this.EZpvd = c52861wac;
            this.KWHzl = uss;
        }
    }

    /* JADX INFO: renamed from: o.wac$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.widget.TextView AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C52861wac OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52861wac c52861wac, android.widget.TextView textView) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c52861wac;
            this.AEQbTJ = textView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C52861wac c52861wac = this.OLrzqt;
                android.content.Context context = this.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c52861wac.copydefault(context);
            }
        }
    }
}
