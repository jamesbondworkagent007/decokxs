package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus;
import com.okinc.okuser.data.User;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35399nuc;
import o.C52761wXj;
import o.nXV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nXV extends AbstractC35894oHq<C34282nYe, TaskDescription> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public Activity EZpvd;
    public boolean KWHzl;
    public final java.lang.String copydefault = C44157sFk.KWHzl();

    /* JADX INFO: loaded from: classes16.dex */
    public interface Activity {
        void AEQbTJ(@NotNull java.lang.String str, boolean z);

        void copydefault(@NotNull java.lang.String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.EZpvd = activity;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nXV.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull C34282nYe c34282nYe, @NotNull C34282nYe c34282nYe2) {
        Intrinsics.checkNotNullParameter(c34282nYe, "");
        Intrinsics.checkNotNullParameter(c34282nYe2, "");
        return Intrinsics.EZpvd((java.lang.Object) c34282nYe.AhwBna(), (java.lang.Object) c34282nYe2.AhwBna());
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean KWHzl(@NotNull C34282nYe c34282nYe, @NotNull C34282nYe c34282nYe2) {
        Intrinsics.checkNotNullParameter(c34282nYe, "");
        Intrinsics.checkNotNullParameter(c34282nYe2, "");
        return Intrinsics.EZpvd((java.lang.Object) c34282nYe.isConnected(), (java.lang.Object) c34282nYe2.isConnected()) && c34282nYe.ejfBZ() == c34282nYe2.ejfBZ() && c34282nYe.AkhnZx() == c34282nYe2.AkhnZx() && c34282nYe.fetchVPNInfo() == c34282nYe2.fetchVPNInfo() && Intrinsics.EZpvd((java.lang.Object) c34282nYe.AEQbTJ(), (java.lang.Object) c34282nYe2.AEQbTJ()) && Intrinsics.EZpvd((java.lang.Object) c34282nYe.copydefault(), (java.lang.Object) c34282nYe2.copydefault()) && c34282nYe.AYXKKw() == c34282nYe2.AYXKKw() && Intrinsics.EZpvd(c34282nYe.djBIcL(), c34282nYe2.djBIcL()) && c34282nYe.KWHzl() == c34282nYe2.KWHzl() && Intrinsics.EZpvd(c34282nYe.gEmmrt(), c34282nYe2.gEmmrt()) && Intrinsics.EZpvd(c34282nYe.valueOf(), c34282nYe2.valueOf()) && Intrinsics.EZpvd((java.lang.Object) c34282nYe.OLrzqt(), (java.lang.Object) c34282nYe2.OLrzqt()) && Intrinsics.EZpvd((java.lang.Object) c34282nYe.DbNXlk(), (java.lang.Object) c34282nYe2.DbNXlk()) && Intrinsics.EZpvd((java.lang.Object) c34282nYe.EZpvd(), (java.lang.Object) c34282nYe2.EZpvd());
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: OLrzqt, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public java.lang.Object AEQbTJ(@NotNull C34282nYe c34282nYe, @NotNull C34282nYe c34282nYe2) {
        Intrinsics.checkNotNullParameter(c34282nYe, "");
        Intrinsics.checkNotNullParameter(c34282nYe2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (c34282nYe.ejfBZ() != c34282nYe2.ejfBZ()) {
            arrayList.add("KEY_REFRESH_SELECTION_MODE");
        }
        if (c34282nYe.AkhnZx() != c34282nYe2.AkhnZx()) {
            arrayList.add("KEY_REFRESH_CHECKED");
        }
        if (!Intrinsics.EZpvd((java.lang.Object) c34282nYe.isConnected(), (java.lang.Object) c34282nYe2.isConnected())) {
            arrayList.add("KEY_REFRESH_SEARCH_HIGHLIGHT");
        }
        if (c34282nYe.fetchVPNInfo() != c34282nYe2.fetchVPNInfo()) {
            arrayList.add("KEY_REFRESH_CALLING_STATUS");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNV nnvKWHzl = nNV.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnvKWHzl, "");
        return new TaskDescription(this, nnvKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C34282nYe c34282nYe = KWHzl().getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(c34282nYe, "");
        taskDescription.OLrzqt(c34282nYe);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [137=5] */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            onBindViewHolder(taskDescription, i);
            return;
        }
        for (java.lang.Object obj : list) {
            if (obj instanceof java.util.List) {
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : (java.lang.Iterable) obj) {
                    if (obj2 instanceof java.lang.String) {
                        arrayList.add(obj2);
                    }
                }
                for (java.lang.String str : arrayList) {
                    switch (str.hashCode()) {
                        case -1288546879:
                            if (str.equals("KEY_REFRESH_SEARCH_HIGHLIGHT")) {
                                C34282nYe c34282nYe = KWHzl().getCurrentList().get(i);
                                Intrinsics.checkNotNullExpressionValue(c34282nYe, "");
                                taskDescription.EZpvd(c34282nYe);
                            }
                            break;
                        case -262097766:
                            if (str.equals("KEY_REFRESH_SELECTION_MODE")) {
                                C34282nYe c34282nYe2 = KWHzl().getCurrentList().get(i);
                                Intrinsics.checkNotNullExpressionValue(c34282nYe2, "");
                                taskDescription.AEQbTJ(c34282nYe2);
                            }
                            break;
                        case -245357583:
                            if (str.equals("KEY_REFRESH_CALLING_STATUS")) {
                                C34282nYe c34282nYe3 = KWHzl().getCurrentList().get(i);
                                Intrinsics.checkNotNullExpressionValue(c34282nYe3, "");
                                taskDescription.copydefault(c34282nYe3);
                            }
                            break;
                        case 190759193:
                            if (str.equals("KEY_REFRESH_VIP_GROUP")) {
                                C34282nYe c34282nYe4 = KWHzl().getCurrentList().get(i);
                                Intrinsics.checkNotNullExpressionValue(c34282nYe4, "");
                                taskDescription.AYXKKw(c34282nYe4);
                            }
                            break;
                        case 1082347523:
                            if (str.equals("KEY_REFRESH_CHECKED")) {
                                C34282nYe c34282nYe5 = KWHzl().getCurrentList().get(i);
                                Intrinsics.checkNotNullExpressionValue(c34282nYe5, "");
                                taskDescription.KWHzl(c34282nYe5);
                            }
                            break;
                    }
                }
            }
        }
    }

    public final void EZpvd(boolean z) {
        if (this.KWHzl == z) {
            return;
        }
        this.KWHzl = z;
        if (getItemCount() > 0) {
            notifyItemRangeChanged(0, getItemCount(), C56402yEa.EZpvd("KEY_REFRESH_VIP_GROUP"));
        }
    }

    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final nNV EZpvd;
        public final /* synthetic */ nXV OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull nXV nxv, nNV nnv) {
            super(nnv.getRoot());
            Intrinsics.checkNotNullParameter(nnv, "");
            this.OLrzqt = nxv;
            this.EZpvd = nnv;
        }

        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ C34282nYe AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ nXV copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, nXV nxv, C34282nYe c34282nYe) {
                this.EZpvd = view;
                this.KWHzl = j;
                this.copydefault = nxv;
                this.AEQbTJ = c34282nYe;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    Activity activity = this.copydefault.EZpvd;
                    if (activity != null) {
                        activity.copydefault(this.AEQbTJ.AhwBna());
                    }
                }
            }
        }

        public final void OLrzqt(@NotNull C34282nYe c34282nYe) {
            java.lang.String simpleDate$default;
            java.lang.String simpleDate$default2;
            Intrinsics.checkNotNullParameter(c34282nYe, "");
            nNV nnv = this.EZpvd;
            AEQbTJ(c34282nYe);
            KWHzl(c34282nYe);
            copydefault(c34282nYe);
            C35893oHp c35893oHp = nnv.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C37716ozA.KWHzl(c35893oHp, c34282nYe.djBIcL(), TagSize.DP_18);
            AYXKKw(c34282nYe);
            nnv.values.setText(c34282nYe.AEQbTJ());
            EZpvd(c34282nYe);
            C55251xgS c55251xgS = nnv.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(c34282nYe.KWHzl() == BillingCyclePaymentStatus.OVERDUE ? 0 : 8);
            boolean z = (c34282nYe.gEmmrt() == null && c34282nYe.valueOf() == null) ? false : true;
            android.widget.TextView textView = nnv.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(z ? 0 : 8);
            android.widget.TextView textView2 = nnv.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(z ? 0 : 8);
            if (z) {
                android.widget.TextView textView3 = nnv.AkhnZx;
                int i = C35399nuc.LoaderManager.sEcTXd;
                Date dateGEmmrt = c34282nYe.gEmmrt();
                java.lang.String str = "-";
                if (dateGEmmrt == null || (simpleDate$default = pTA.formatSimpleDate$default(dateGEmmrt, null, 1, null)) == null) {
                    simpleDate$default = "-";
                }
                textView3.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("date", simpleDate$default))));
                android.widget.TextView textView4 = nnv.valueOf;
                int i2 = C35399nuc.LoaderManager.IYdWPz;
                Date dateValueOf = c34282nYe.valueOf();
                if (dateValueOf != null && (simpleDate$default2 = pTA.formatSimpleDate$default(dateValueOf, null, 1, null)) != null) {
                    str = simpleDate$default2;
                }
                textView4.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("date", str))));
            }
        }

        public final void AYXKKw(@NotNull C34282nYe c34282nYe) {
            User userOLrzqt;
            Intrinsics.checkNotNullParameter(c34282nYe, "");
            boolean z = this.OLrzqt.KWHzl && (userOLrzqt = C44157sFk.gEmmrt().OLrzqt()) != null && userOLrzqt.isVip();
            nNV nnv = this.EZpvd;
            nXV nxv = this.OLrzqt;
            C35893oHp c35893oHp = nnv.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C35891oHn.OLrzqt(c35893oHp, c34282nYe.values(), nxv.KWHzl);
            android.widget.TextView textView = nnv.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C37716ozA.updateTagViewWithTagInfo$default(textView, c34282nYe.djBIcL(), nxv.KWHzl ? 0 : 8, null, false, nxv.KWHzl, z, 12, null);
            android.widget.TextView textView2 = nnv.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(true ^ nxv.KWHzl ? 0 : 8);
            if (nxv.KWHzl) {
                return;
            }
            android.widget.TextView textView3 = nnv.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            C37683oyU.AEQbTJ(textView3, c34282nYe.AYXKKw());
        }

        public final void EZpvd(@NotNull C34282nYe c34282nYe) {
            Intrinsics.checkNotNullParameter(c34282nYe, "");
            nNV nnv = this.EZpvd;
            android.widget.TextView textView = nnv.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c34282nYe.copydefault()) ^ true ? 0 : 8);
            if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c34282nYe.isConnected())) && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c34282nYe.copydefault()))) {
                android.widget.TextView textView2 = nnv.djBIcL;
                java.lang.String strCopydefault = c34282nYe.copydefault();
                android.content.Context context = nnv.djBIcL.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                java.lang.String strIsConnected = c34282nYe.isConnected();
                int i = C52761wXj.Activity.iZzfmt;
                android.content.Context context2 = nnv.values.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                textView2.setText(C37683oyU.EZpvd(strCopydefault, context, strIsConnected, C33070mpX.OLrzqt(i, context2), null));
                return;
            }
            if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c34282nYe.isConnected())) && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c34282nYe.AEQbTJ()))) {
                android.widget.TextView textView3 = nnv.values;
                java.lang.String strAEQbTJ = c34282nYe.AEQbTJ();
                android.content.Context context3 = nnv.values.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                java.lang.String strIsConnected2 = c34282nYe.isConnected();
                int i2 = C52761wXj.Activity.hUfVAv;
                android.content.Context context4 = nnv.values.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                int iOLrzqt = C33070mpX.OLrzqt(i2, context4);
                int i3 = C52761wXj.Activity.DcMfJKDGTeJD;
                android.content.Context context5 = nnv.values.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                textView3.setText(C37683oyU.EZpvd(strAEQbTJ, context3, strIsConnected2, iOLrzqt, java.lang.Integer.valueOf(C33070mpX.OLrzqt(i3, context5))));
                return;
            }
            nnv.values.setText(c34282nYe.AEQbTJ());
        }

        public final void KWHzl(@NotNull C34282nYe c34282nYe) {
            Intrinsics.checkNotNullParameter(c34282nYe, "");
            this.EZpvd.AEQbTJ.setChecked(c34282nYe.AkhnZx());
        }

        public final void copydefault(@NotNull C34282nYe c34282nYe) {
            Intrinsics.checkNotNullParameter(c34282nYe, "");
            android.widget.TextView textView = this.EZpvd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(c34282nYe.fetchVPNInfo() ? 0 : 8);
        }

        public final void AEQbTJ(@NotNull final C34282nYe c34282nYe) {
            Intrinsics.checkNotNullParameter(c34282nYe, "");
            final nNV nnv = this.EZpvd;
            final nXV nxv = this.OLrzqt;
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) c34282nYe.AhwBna(), (java.lang.Object) nxv.copydefault);
            boolean zKWHzl = C44170sFx.KWHzl(c34282nYe.AYXKKw());
            if (!c34282nYe.ejfBZ() || zEZpvd || zKWHzl) {
                AppCompatCheckBox appCompatCheckBox = nnv.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "");
                appCompatCheckBox.setVisibility(8);
                ConstraintLayout constraintLayout = nnv.KWHzl;
                constraintLayout.setOnClickListener(new Application(constraintLayout, 1000L, nxv, c34282nYe));
                return;
            }
            AppCompatCheckBox appCompatCheckBox2 = nnv.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatCheckBox2, "");
            appCompatCheckBox2.setVisibility(0);
            nnv.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.nXT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nXV.TaskDescription.AEQbTJ(nnv, nxv, c34282nYe, view);
                }
            });
        }

        public static final void AEQbTJ(nNV nnv, nXV nxv, C34282nYe c34282nYe, android.view.View view) {
            nnv.AEQbTJ.performClick();
            Activity activity = nxv.EZpvd;
            if (activity != null) {
                activity.AEQbTJ(c34282nYe.AhwBna(), nnv.AEQbTJ.isChecked());
            }
        }
    }
}
