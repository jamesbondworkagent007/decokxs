package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nQv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34084nQv extends androidx.recyclerview.widget.ListAdapter<GroupAnnouncementInfo, TaskDescription> {
    public boolean AEQbTJ;
    public java.util.Set<java.lang.Long> AhwBna;
    public final Function1<java.lang.String, java.lang.String> EZpvd;
    public final Function1<GroupAnnouncementInfo, Unit> KWHzl;
    public final Function1<GroupAnnouncementInfo, Unit> OLrzqt;
    public final Function1<java.lang.Long, Unit> copydefault;
    public final boolean valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.utility.GroupAnnouncementInfo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.utility.GroupAnnouncementInfo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C34084nQv(boolean z, @NotNull Function1<? super GroupAnnouncementInfo, Unit> function1, @NotNull Function1<? super GroupAnnouncementInfo, Unit> function12, @NotNull Function1<? super java.lang.Long, Unit> function13, @NotNull Function1<? super java.lang.String, java.lang.String> function14) {
        super(new ActionBar());
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        this.valueOf = z;
        this.OLrzqt = function1;
        this.KWHzl = function12;
        this.copydefault = function13;
        this.EZpvd = function14;
        this.AhwBna = yEE.copydefault();
    }

    public final void AEQbTJ(boolean z, @NotNull java.util.Set<java.lang.Long> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.AEQbTJ = z;
        this.AhwBna = set;
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNB nnbEZpvd = nNB.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnbEZpvd, "");
        return new TaskDescription(nnbEZpvd, this.valueOf, this.OLrzqt, this.KWHzl, this.copydefault, this.EZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        GroupAnnouncementInfo item = getItem(i);
        boolean zContains = this.AhwBna.contains(java.lang.Long.valueOf(item.getAnnounceId()));
        boolean z = i == 0;
        Intrinsics.copydefault(item);
        taskDescription.EZpvd(item, this.AEQbTJ, zContains, z);
    }

    /* JADX INFO: renamed from: o.nQv$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final Function1<GroupAnnouncementInfo, Unit> AEQbTJ;
        public final boolean AhwBna;
        public final nNB EZpvd;
        public final Function1<GroupAnnouncementInfo, Unit> KWHzl;
        public final Function1<java.lang.String, java.lang.String> OLrzqt;
        public final Function1<java.lang.Long, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.utility.GroupAnnouncementInfo, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.utility.GroupAnnouncementInfo, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull nNB nnb, boolean z, @NotNull Function1<? super GroupAnnouncementInfo, Unit> function1, @NotNull Function1<? super GroupAnnouncementInfo, Unit> function12, @NotNull Function1<? super java.lang.Long, Unit> function13, @NotNull Function1<? super java.lang.String, java.lang.String> function14) {
            super(nnb.getRoot());
            Intrinsics.checkNotNullParameter(nnb, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            Intrinsics.checkNotNullParameter(function13, "");
            Intrinsics.checkNotNullParameter(function14, "");
            this.EZpvd = nnb;
            this.AhwBna = z;
            this.KWHzl = function1;
            this.AEQbTJ = function12;
            this.copydefault = function13;
            this.OLrzqt = function14;
        }

        public static /* synthetic */ void bind$default(TaskDescription taskDescription, GroupAnnouncementInfo groupAnnouncementInfo, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                z3 = false;
            }
            taskDescription.EZpvd(groupAnnouncementInfo, z, z2, z3);
        }

        public final void EZpvd(@NotNull GroupAnnouncementInfo groupAnnouncementInfo, boolean z, boolean z2, boolean z3) {
            java.lang.String strGEmmrt;
            Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
            nNB nnb = this.EZpvd;
            C35893oHp c35893oHp = nnb.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C35891oHn.KWHzl(c35893oHp, groupAnnouncementInfo.getAnnounceAuthorInfo());
            android.widget.TextView textView = nnb.AhwBna;
            GroupMemberInfo announceAuthorInfo = groupAnnouncementInfo.getAnnounceAuthorInfo();
            if (announceAuthorInfo == null || (strGEmmrt = announceAuthorInfo.getName()) == null) {
                strGEmmrt = C33129mqd.gEmmrt(groupAnnouncementInfo.getCreateByName());
            }
            textView.setText(strGEmmrt);
            android.widget.TextView textView2 = nnb.values;
            android.content.Context context = textView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView2.setText(pTD.KWHzl(context, C35399nuc.LoaderManager.DpxfQh, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("date", KWHzl(java.lang.Long.valueOf(groupAnnouncementInfo.getCreateTime()))))));
            nnb.isConnected.setText(groupAnnouncementInfo.getContent());
            C34086nQx c34086nQx = C34086nQx.AEQbTJ;
            android.widget.TextView textView3 = nnb.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            C34086nQx.setupAnnouncementText$default(c34086nQx, textView3, 0, 3, false, null, 9, null);
            android.widget.ImageView imageView = nnb.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(groupAnnouncementInfo.isPin() ? 0 : 8);
            android.widget.ImageView imageView2 = nnb.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility((!this.AhwBna || z) ? 8 : 0);
            AppCompatCheckBox appCompatCheckBox = nnb.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "");
            appCompatCheckBox.setVisibility(z ? 0 : 8);
            android.widget.ImageView imageView3 = nnb.djBIcL;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(z ^ true ? 0 : 8);
            OLrzqt(groupAnnouncementInfo);
            EZpvd(z3);
            if (z) {
                nnb.KWHzl.setChecked(z2);
                AppCompatCheckBox appCompatCheckBox2 = nnb.KWHzl;
                appCompatCheckBox2.setOnClickListener(new Activity(appCompatCheckBox2, 1000L, this, groupAnnouncementInfo));
                ConstraintLayout constraintLayout = nnb.copydefault;
                constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, this, groupAnnouncementInfo));
                nnb.getRoot().setSelected(z2);
                return;
            }
            android.widget.ImageView imageView4 = nnb.AYXKKw;
            imageView4.setOnClickListener(new ActionBar(imageView4, 1000L, this, groupAnnouncementInfo));
            ConstraintLayout constraintLayout2 = nnb.copydefault;
            constraintLayout2.setOnClickListener(new ViewOnClickListenerC0891TaskDescription(constraintLayout2, 1000L, this, groupAnnouncementInfo));
            android.widget.TextView textView4 = nnb.isConnected;
            textView4.setOnClickListener(new Application(textView4, 1000L, this, groupAnnouncementInfo));
            nnb.getRoot().setSelected(false);
        }

        public final void EZpvd(boolean z) {
            nNB nnb = this.EZpvd;
            android.view.View view = nnb.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(z ^ true ? 0 : 8);
            nnb.copydefault.setPadding(C55298xhM.dp2px$default(0.0f, null, 1, null), C55298xhM.dp2px$default(z ? 0.0f : 16.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null));
        }

        public final void OLrzqt(GroupAnnouncementInfo groupAnnouncementInfo) {
            long createTime = groupAnnouncementInfo.getCreateTime();
            java.lang.Long editTime = groupAnnouncementInfo.getEditTime();
            if (editTime != null && createTime == editTime.longValue()) {
                android.widget.TextView textView = this.EZpvd.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
                return;
            }
            android.widget.TextView textView2 = this.EZpvd.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            if (Intrinsics.EZpvd((java.lang.Object) groupAnnouncementInfo.getUpdateBy(), (java.lang.Object) C44157sFk.KWHzl())) {
                nNB nnb = this.EZpvd;
                nnb.DbNXlk.setText(nnb.getRoot().getContext().getString(C35399nuc.LoaderManager.HJWChPzRXNTw));
                return;
            }
            java.lang.String strInvoke = this.OLrzqt.invoke(groupAnnouncementInfo.getUpdateBy());
            if (strInvoke == null) {
                strInvoke = C33129mqd.gEmmrt(groupAnnouncementInfo.getUpdateByName());
            }
            nNB nnb2 = this.EZpvd;
            android.widget.TextView textView3 = nnb2.DbNXlk;
            android.content.Context context = nnb2.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView3.setText(pTD.KWHzl(context, C35399nuc.LoaderManager.OqCbbx, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", strInvoke))));
        }

        public final java.lang.String KWHzl(java.lang.Long l) {
            java.lang.String str;
            return (l == null || (str = pTA.format$default(new Date(l.longValue()), OKDateEnum.DATE_FORMAT_STANDARD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null)) == null) ? "" : str;
        }

        /* JADX INFO: renamed from: o.nQv$TaskDescription$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ GroupAnnouncementInfo KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ TaskDescription copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, TaskDescription taskDescription, GroupAnnouncementInfo groupAnnouncementInfo) {
                this.OLrzqt = view;
                this.AEQbTJ = j;
                this.copydefault = taskDescription;
                this.KWHzl = groupAnnouncementInfo;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.copydefault.AEQbTJ.invoke(this.KWHzl);
                }
            }
        }

        /* JADX INFO: renamed from: o.nQv$TaskDescription$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ TaskDescription EZpvd;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ GroupAnnouncementInfo copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, TaskDescription taskDescription, GroupAnnouncementInfo groupAnnouncementInfo) {
                this.OLrzqt = view;
                this.AEQbTJ = j;
                this.EZpvd = taskDescription;
                this.copydefault = groupAnnouncementInfo;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.EZpvd.copydefault.invoke(java.lang.Long.valueOf(this.copydefault.getAnnounceId()));
                }
            }
        }

        /* JADX INFO: renamed from: o.nQv$TaskDescription$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ GroupAnnouncementInfo EZpvd;
            public final /* synthetic */ TaskDescription OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, TaskDescription taskDescription, GroupAnnouncementInfo groupAnnouncementInfo) {
                this.copydefault = view;
                this.AEQbTJ = j;
                this.OLrzqt = taskDescription;
                this.EZpvd = groupAnnouncementInfo;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.OLrzqt.KWHzl.invoke(this.EZpvd);
                }
            }
        }

        /* JADX INFO: renamed from: o.nQv$TaskDescription$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ TaskDescription AEQbTJ;
            public final /* synthetic */ GroupAnnouncementInfo EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, TaskDescription taskDescription, GroupAnnouncementInfo groupAnnouncementInfo) {
                this.copydefault = view;
                this.KWHzl = j;
                this.AEQbTJ = taskDescription;
                this.EZpvd = groupAnnouncementInfo;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.AEQbTJ.copydefault.invoke(java.lang.Long.valueOf(this.EZpvd.getAnnounceId()));
                }
            }
        }

        /* JADX INFO: renamed from: o.nQv$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0891TaskDescription implements View.OnClickListener {
            public final /* synthetic */ GroupAnnouncementInfo AEQbTJ;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ TaskDescription OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0891TaskDescription(android.view.View view, long j, TaskDescription taskDescription, GroupAnnouncementInfo groupAnnouncementInfo) {
                this.KWHzl = view;
                this.copydefault = j;
                this.OLrzqt = taskDescription;
                this.AEQbTJ = groupAnnouncementInfo;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.OLrzqt.KWHzl.invoke(this.AEQbTJ);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.nQv$ActionBar */
    public static final class ActionBar extends DiffUtil.ItemCallback<GroupAnnouncementInfo> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull GroupAnnouncementInfo groupAnnouncementInfo, @NotNull GroupAnnouncementInfo groupAnnouncementInfo2) {
            Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
            Intrinsics.checkNotNullParameter(groupAnnouncementInfo2, "");
            return groupAnnouncementInfo.getAnnounceId() == groupAnnouncementInfo2.getAnnounceId();
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull GroupAnnouncementInfo groupAnnouncementInfo, @NotNull GroupAnnouncementInfo groupAnnouncementInfo2) {
            Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
            Intrinsics.checkNotNullParameter(groupAnnouncementInfo2, "");
            return Intrinsics.EZpvd(groupAnnouncementInfo, groupAnnouncementInfo2);
        }
    }
}
