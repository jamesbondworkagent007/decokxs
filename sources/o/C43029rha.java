package o;

import android.view.View;
import com.okinc.business.market.market.fragment.watchlist.UserGroupEditJumpData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43029rha extends AbstractC42977rgb<UserGroupEditJumpData, C42655raX> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILjava/lang/Object;)V */
    @Override // o.InterfaceC33543myT
    public void copydefault(@NotNull android.view.View view, int i, @NotNull UserGroupEditJumpData userGroupEditJumpData) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(userGroupEditJumpData, "");
    }

    @Override // o.AbstractC42977rgb, o.kLX
    /* JADX INFO: renamed from: EZpvd */
    public /* bridge */ /* synthetic */ void onBindViewHolder(kLV klv, java.lang.Object obj) {
        onBindViewHolder((kLV<C42655raX>) klv, (UserGroupEditJumpData) obj);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.kLX, o.AbstractC59533zio
    /* JADX INFO: renamed from: AhwBna */
    public kLV<C42655raX> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new StateListAnimator(this, copydefault(layoutInflater, viewGroup));
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.kLX
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42655raX copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42655raX c42655raXOLrzqt = C42655raX.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42655raXOLrzqt, "");
        return c42655raXOLrzqt;
    }

    /* JADX INFO: renamed from: o.rha$StateListAnimator */
    public final class StateListAnimator extends kLV<C42655raX> implements InterfaceC46795tds {
        public final /* synthetic */ C43029rha copydefault;

        @Override // o.InterfaceC46795tds
        public boolean AEQbTJ() {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C43029rha c43029rha, C42655raX c42655raX) {
            super(c42655raX);
            Intrinsics.checkNotNullParameter(c42655raX, "");
            this.copydefault = c43029rha;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC42977rgb, o.kLX, o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull kLV<C42655raX> klv, @NotNull UserGroupEditJumpData userGroupEditJumpData) {
        Intrinsics.checkNotNullParameter(klv, "");
        Intrinsics.checkNotNullParameter(userGroupEditJumpData, "");
        super.onBindViewHolder((kLV) klv, userGroupEditJumpData);
        C42655raX c42655raX = (C42655raX) klv.EZpvd();
        android.widget.LinearLayout linearLayout = c42655raX.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        android.view.View view = c42655raX.copydefault;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        c42655raX.KWHzl.setGravity(8388611);
        android.widget.LinearLayout linearLayout2 = c42655raX.KWHzl;
        linearLayout2.setOnClickListener(new TaskDescription(linearLayout2, 1000L, this, userGroupEditJumpData, c42655raX));
        android.widget.LinearLayout linearLayout3 = c42655raX.AEQbTJ;
        linearLayout3.setOnClickListener(new ActionBar(linearLayout3, 1000L, this, c42655raX, userGroupEditJumpData));
    }

    public final void KWHzl(android.content.Context context, final UserGroupEditJumpData userGroupEditJumpData) {
        C32866mlf.onEvent$default("Favorites_Page_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.rgW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43029rha.AEQbTJ(userGroupEditJumpData, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        FavoriteSearchActivity.Companion.AEQbTJ(context, userGroupEditJumpData);
    }

    public static final Unit AEQbTJ(UserGroupEditJumpData userGroupEditJumpData, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_type", "add_crypto", false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab_type", qWI.EZpvd(userGroupEditJumpData.getGroupName()), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final UserGroupEditJumpData userGroupEditJumpData, android.content.Context context) {
        jSN.Companion.OLrzqt(context, userGroupEditJumpData.getGroupName(), userGroupEditJumpData.getDisplayName());
        C32866mlf.onEvent$default("Favorites_Page_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.rgY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43029rha.OLrzqt(userGroupEditJumpData, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(UserGroupEditJumpData userGroupEditJumpData, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_type", "edit_favorites", false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab_type", qWI.EZpvd(userGroupEditJumpData.getGroupName()), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rha$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ UserGroupEditJumpData AEQbTJ;
        public final /* synthetic */ C43029rha EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C42655raX OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C43029rha c43029rha, C42655raX c42655raX, UserGroupEditJumpData userGroupEditJumpData) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c43029rha;
            this.OLrzqt = c42655raX;
            this.AEQbTJ = userGroupEditJumpData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C43029rha c43029rha = this.EZpvd;
                android.content.Context context = this.OLrzqt.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c43029rha.KWHzl(context, this.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.rha$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C43029rha AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ UserGroupEditJumpData KWHzl;
        public final /* synthetic */ C42655raX OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C43029rha c43029rha, UserGroupEditJumpData userGroupEditJumpData, C42655raX c42655raX) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c43029rha;
            this.KWHzl = userGroupEditJumpData;
            this.OLrzqt = c42655raX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C43029rha c43029rha = this.AEQbTJ;
                UserGroupEditJumpData userGroupEditJumpData = this.KWHzl;
                android.content.Context context = this.OLrzqt.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c43029rha.AEQbTJ(userGroupEditJumpData, context);
            }
        }
    }
}
