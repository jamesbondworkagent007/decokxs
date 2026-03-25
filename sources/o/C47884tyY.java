package o;

import android.view.View;
import androidx.autofill.HintConstants;
import com.okinc.planet.biz_notifications.model.CommentsSubType;
import com.okinc.planet.domain.remote.dto.RelatedAuthorInfo;
import com.okinc.planet.domain.remote.dto.UnreadMsg;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47884tyY extends AbstractC47868tyI {
    @Override // o.AbstractC47868tyI
    public void copydefault(C55173xeu c55173xeu) {
        super.copydefault(c55173xeu);
        java.lang.String string = getResources().getString(C47501trL.Fragment.getAdvertisingId);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (c55173xeu != null) {
            c55173xeu.setSubTitle((java.lang.CharSequence) string);
        }
    }

    /* JADX INFO: renamed from: o.tyY$Activity */
    public static final class Activity extends C47959tzu {

        /* JADX INFO: renamed from: o.tyY$Activity$Activity, reason: collision with other inner class name */
        public final /* synthetic */ class C0969Activity {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[CommentsSubType.values().length];
                try {
                    iArr[CommentsSubType.Reply_Comments.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[CommentsSubType.Reply_Post.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                OLrzqt = iArr;
            }
        }

        public Activity(C47925tzM c47925tzM) {
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
            CommentsSubType commentsSubTypeCopydefault = CommentsSubType.Companion.copydefault(unreadMsg.getEventSubType());
            EZpvd(c43312rms, false, unreadMsg);
            int i = commentsSubTypeCopydefault == null ? -1 : C0969Activity.OLrzqt[commentsSubTypeCopydefault.ordinal()];
            if (i == 1) {
                RelatedAuthorInfo relatedAuthorInfo = unreadMsg.getRelatedAuthorInfo();
                java.lang.String nickname = relatedAuthorInfo != null ? relatedAuthorInfo.getNickname() : null;
                if (nickname == null) {
                    nickname = "";
                }
                Intrinsics.copydefault(context);
                KWHzl(c43312rms, C33069mpW.KWHzl(context, C47501trL.Fragment.gGNlxh, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_USERNAME, nickname))));
                java.lang.String msgText = unreadMsg.getMsgText();
                EZpvd(c43312rms, msgText != null ? msgText : "");
                RelatedAuthorInfo relatedAuthorInfo2 = unreadMsg.getRelatedAuthorInfo();
                AEQbTJ(c43312rms, relatedAuthorInfo2 != null ? relatedAuthorInfo2.getPortrait() : null);
                android.view.View view = c43312rms.itemView;
                view.setOnClickListener(new Application(view, 1000L, this, c43312rms, unreadMsg, C47884tyY.this));
                return;
            }
            if (i == 2) {
                RelatedAuthorInfo relatedAuthorInfo3 = unreadMsg.getRelatedAuthorInfo();
                java.lang.String nickname2 = relatedAuthorInfo3 != null ? relatedAuthorInfo3.getNickname() : null;
                if (nickname2 == null) {
                    nickname2 = "";
                }
                Intrinsics.copydefault(context);
                KWHzl(c43312rms, C33069mpW.KWHzl(context, C47501trL.Fragment.fVjYLc, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_USERNAME, nickname2))));
                java.lang.String msgText2 = unreadMsg.getMsgText();
                EZpvd(c43312rms, msgText2 != null ? msgText2 : "");
                RelatedAuthorInfo relatedAuthorInfo4 = unreadMsg.getRelatedAuthorInfo();
                AEQbTJ(c43312rms, relatedAuthorInfo4 != null ? relatedAuthorInfo4.getPortrait() : null);
                android.view.View view2 = c43312rms.itemView;
                view2.setOnClickListener(new TaskDescription(view2, 1000L, this, c43312rms, unreadMsg, C47884tyY.this));
                return;
            }
            KWHzl(c43312rms, C47501trL.ActionBar.EZpvd);
            java.lang.String string = context.getString(C47501trL.Fragment.DzkRMH);
            Intrinsics.checkNotNullExpressionValue(string, "");
            KWHzl(c43312rms, string);
            java.lang.String string2 = context.getString(C47501trL.Fragment.DDjfYY);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            EZpvd(c43312rms, string2);
            android.view.View view3 = c43312rms.itemView;
            view3.setOnClickListener(new ActionBar(view3, 1000L, this, c43312rms, unreadMsg, C47884tyY.this));
        }

        /* JADX INFO: renamed from: o.tyY$Activity$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ UnreadMsg EZpvd;
            public final /* synthetic */ Activity KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ C43312rms copydefault;
            public final /* synthetic */ C47884tyY djBIcL;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, Activity activity, C43312rms c43312rms, UnreadMsg unreadMsg, C47884tyY c47884tyY) {
                this.OLrzqt = view;
                this.AEQbTJ = j;
                this.KWHzl = activity;
                this.copydefault = c43312rms;
                this.EZpvd = unreadMsg;
                this.djBIcL = c47884tyY;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    Activity.super.copydefault(this.copydefault, false, this.EZpvd);
                    C47910tyy.copydefault.KWHzl(this.djBIcL.EZpvd(), this.EZpvd);
                    Activity activity = this.KWHzl;
                    android.view.View view2 = this.copydefault.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    activity.EZpvd(view2);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyY$Activity$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C47884tyY AhwBna;
            public final /* synthetic */ C43312rms EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ Activity OLrzqt;
            public final /* synthetic */ UnreadMsg copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, Activity activity, C43312rms c43312rms, UnreadMsg unreadMsg, C47884tyY c47884tyY) {
                this.KWHzl = view;
                this.AEQbTJ = j;
                this.OLrzqt = activity;
                this.EZpvd = c43312rms;
                this.copydefault = unreadMsg;
                this.AhwBna = c47884tyY;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    Activity.super.copydefault(this.EZpvd, false, this.copydefault);
                    C47910tyy.copydefault.KWHzl(this.AhwBna.EZpvd(), this.copydefault);
                    C47945tzg c47945tzg = C47945tzg.OLrzqt;
                    android.content.Context contextRequireContext = this.AhwBna.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    c47945tzg.AEQbTJ(contextRequireContext, this.copydefault.getRelatedContentId(), this.copydefault.getRelatedCommentId(), this.copydefault.getReplyRootId());
                }
            }
        }

        /* JADX INFO: renamed from: o.tyY$Activity$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ UnreadMsg AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ C43312rms KWHzl;
            public final /* synthetic */ Activity OLrzqt;
            public final /* synthetic */ android.view.View copydefault;
            public final /* synthetic */ C47884tyY gEmmrt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, Activity activity, C43312rms c43312rms, UnreadMsg unreadMsg, C47884tyY c47884tyY) {
                this.copydefault = view;
                this.EZpvd = j;
                this.OLrzqt = activity;
                this.KWHzl = c43312rms;
                this.AEQbTJ = unreadMsg;
                this.gEmmrt = c47884tyY;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    Activity.super.copydefault(this.KWHzl, false, this.AEQbTJ);
                    C47910tyy.copydefault.KWHzl(this.gEmmrt.EZpvd(), this.AEQbTJ);
                    C47945tzg c47945tzg = C47945tzg.OLrzqt;
                    android.content.Context contextRequireContext = this.gEmmrt.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    c47945tzg.AEQbTJ(contextRequireContext, this.AEQbTJ.getRelatedContentId(), this.AEQbTJ.getRelatedCommentId(), this.AEQbTJ.getReplyRootId());
                }
            }
        }
    }

    @Override // o.AbstractC47868tyI
    public void copydefault(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        super.copydefault(c59534zip);
        c59534zip.register(UnreadMsg.class, new Activity(gEmmrt()));
    }
}
