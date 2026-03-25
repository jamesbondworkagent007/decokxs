package o;

import android.view.View;
import androidx.autofill.HintConstants;
import com.okinc.planet.biz_notifications.model.LikesSubType;
import com.okinc.planet.domain.remote.dto.RelatedAuthorInfo;
import com.okinc.planet.domain.remote.dto.UnreadMsg;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47940tzb extends AbstractC47868tyI {
    @Override // o.AbstractC47868tyI
    public void copydefault(C55173xeu c55173xeu) {
        super.copydefault(c55173xeu);
        java.lang.String string = getResources().getString(C47501trL.Fragment.DcMfJKsuEgdN);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (c55173xeu != null) {
            c55173xeu.setSubTitle((java.lang.CharSequence) string);
        }
    }

    /* JADX INFO: renamed from: o.tzb$StateListAnimator */
    public static final class StateListAnimator extends C47959tzu {

        /* JADX INFO: renamed from: o.tzb$StateListAnimator$Application */
        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[LikesSubType.values().length];
                try {
                    iArr[LikesSubType.Comments.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[LikesSubType.Post.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                OLrzqt = iArr;
            }
        }

        public StateListAnimator(C47925tzM c47925tzM) {
            super(c47925tzM);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.rms, java.lang.Object] */
        @Override // o.C47959tzu, o.AbstractC43310rmq
        public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, UnreadMsg unreadMsg) {
            onBindViewHolder((C43312rms<tMS>) c43312rms, unreadMsg);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.C47959tzu, o.AbstractC43310rmq, o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd */
        public void onBindViewHolder(C43312rms<tMS> c43312rms, UnreadMsg unreadMsg) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(unreadMsg, "");
            super.onBindViewHolder(c43312rms, unreadMsg);
            android.content.Context context = c43312rms.itemView.getContext();
            LikesSubType likesSubTypeEZpvd = LikesSubType.Companion.EZpvd(unreadMsg.getEventSubType());
            EZpvd(c43312rms, false, unreadMsg);
            int i = likesSubTypeEZpvd == null ? -1 : Application.OLrzqt[likesSubTypeEZpvd.ordinal()];
            if (i == 1) {
                RelatedAuthorInfo relatedAuthorInfo = unreadMsg.getRelatedAuthorInfo();
                java.lang.String nickname = relatedAuthorInfo != null ? relatedAuthorInfo.getNickname() : null;
                if (nickname == null) {
                    nickname = "";
                }
                Intrinsics.copydefault(context);
                KWHzl(c43312rms, C33069mpW.KWHzl(context, C47501trL.Fragment.gsvlRV, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_USERNAME, nickname))));
                java.lang.String msgText = unreadMsg.getMsgText();
                EZpvd(c43312rms, msgText != null ? msgText : "");
                RelatedAuthorInfo relatedAuthorInfo2 = unreadMsg.getRelatedAuthorInfo();
                AEQbTJ(c43312rms, relatedAuthorInfo2 != null ? relatedAuthorInfo2.getPortrait() : null);
                android.view.View view = c43312rms.itemView;
                view.setOnClickListener(new TaskDescription(view, 1000L, this, c43312rms, unreadMsg, C47940tzb.this));
                return;
            }
            if (i == 2) {
                RelatedAuthorInfo relatedAuthorInfo3 = unreadMsg.getRelatedAuthorInfo();
                java.lang.String nickname2 = relatedAuthorInfo3 != null ? relatedAuthorInfo3.getNickname() : null;
                if (nickname2 == null) {
                    nickname2 = "";
                }
                Intrinsics.copydefault(context);
                KWHzl(c43312rms, C33069mpW.KWHzl(context, C47501trL.Fragment.QslYrK, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_USERNAME, nickname2))));
                java.lang.String msgText2 = unreadMsg.getMsgText();
                EZpvd(c43312rms, msgText2 != null ? msgText2 : "");
                RelatedAuthorInfo relatedAuthorInfo4 = unreadMsg.getRelatedAuthorInfo();
                AEQbTJ(c43312rms, relatedAuthorInfo4 != null ? relatedAuthorInfo4.getPortrait() : null);
                android.view.View view2 = c43312rms.itemView;
                view2.setOnClickListener(new Activity(view2, 1000L, this, c43312rms, unreadMsg, C47940tzb.this));
                return;
            }
            KWHzl(c43312rms, C47501trL.ActionBar.valueOf);
            java.lang.String string = context.getString(C47501trL.Fragment.DzkRMH);
            Intrinsics.checkNotNullExpressionValue(string, "");
            KWHzl(c43312rms, string);
            java.lang.String string2 = context.getString(C47501trL.Fragment.DDjfYY);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            EZpvd(c43312rms, string2);
            android.view.View view3 = c43312rms.itemView;
            view3.setOnClickListener(new ViewOnClickListenerC0972StateListAnimator(view3, 1000L, this, c43312rms, unreadMsg, C47940tzb.this));
        }

        /* JADX INFO: renamed from: o.tzb$StateListAnimator$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C43312rms EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ StateListAnimator OLrzqt;
            public final /* synthetic */ UnreadMsg copydefault;
            public final /* synthetic */ C47940tzb djBIcL;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47940tzb c47940tzb) {
                this.KWHzl = view;
                this.AEQbTJ = j;
                this.OLrzqt = stateListAnimator;
                this.EZpvd = c43312rms;
                this.copydefault = unreadMsg;
                this.djBIcL = c47940tzb;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault(this.EZpvd, false, this.copydefault);
                    C47910tyy.copydefault.KWHzl(this.djBIcL.EZpvd(), this.copydefault);
                    C47945tzg c47945tzg = C47945tzg.OLrzqt;
                    android.content.Context contextRequireContext = this.djBIcL.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    c47945tzg.KWHzl(contextRequireContext, this.copydefault.getRelatedContentId());
                }
            }
        }

        /* JADX INFO: renamed from: o.tzb$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0972StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C47940tzb AhwBna;
            public final /* synthetic */ UnreadMsg EZpvd;
            public final /* synthetic */ StateListAnimator KWHzl;
            public final /* synthetic */ C43312rms OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0972StateListAnimator(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47940tzb c47940tzb) {
                this.copydefault = view;
                this.AEQbTJ = j;
                this.KWHzl = stateListAnimator;
                this.OLrzqt = c43312rms;
                this.EZpvd = unreadMsg;
                this.AhwBna = c47940tzb;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault(this.OLrzqt, false, this.EZpvd);
                    C47910tyy.copydefault.KWHzl(this.AhwBna.EZpvd(), this.EZpvd);
                    StateListAnimator stateListAnimator = this.KWHzl;
                    android.view.View view2 = this.OLrzqt.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.EZpvd(view2);
                }
            }
        }

        /* JADX INFO: renamed from: o.tzb$StateListAnimator$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ StateListAnimator AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ UnreadMsg OLrzqt;
            public final /* synthetic */ C43312rms copydefault;
            public final /* synthetic */ C47940tzb valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47940tzb c47940tzb) {
                this.EZpvd = view;
                this.KWHzl = j;
                this.AEQbTJ = stateListAnimator;
                this.copydefault = c43312rms;
                this.OLrzqt = unreadMsg;
                this.valueOf = c47940tzb;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault(this.copydefault, false, this.OLrzqt);
                    C47910tyy.copydefault.KWHzl(this.valueOf.EZpvd(), this.OLrzqt);
                    C47945tzg c47945tzg = C47945tzg.OLrzqt;
                    android.content.Context contextRequireContext = this.valueOf.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    c47945tzg.AEQbTJ(contextRequireContext, this.OLrzqt.getRelatedContentId(), this.OLrzqt.getRelatedCommentId(), this.OLrzqt.getReplyRootId());
                }
            }
        }
    }

    @Override // o.AbstractC47868tyI
    public void copydefault(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        super.copydefault(c59534zip);
        c59534zip.register(UnreadMsg.class, new StateListAnimator(gEmmrt()));
    }
}
