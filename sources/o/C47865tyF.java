package o;

import android.view.View;
import androidx.autofill.HintConstants;
import com.okinc.planet.biz_notifications.model.CommentsSubType;
import com.okinc.planet.biz_notifications.model.FollowersSubType;
import com.okinc.planet.biz_notifications.model.LikesSubType;
import com.okinc.planet.biz_notifications.model.SystemSubType;
import com.okinc.planet.domain.remote.dto.RelatedAuthorInfo;
import com.okinc.planet.domain.remote.dto.UnreadMsg;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47865tyF extends AbstractC47868tyI {
    public static final ActionBar Companion = new ActionBar(null);
    public final boolean copydefault = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC47868tyI
    public boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.tyF$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tyF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.AbstractC47868tyI
    public void copydefault(C55173xeu c55173xeu) {
        super.copydefault(c55173xeu);
        java.lang.String string = getResources().getString(C47501trL.Fragment.igXuih);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (c55173xeu != null) {
            c55173xeu.setTitle(C33070mpX.AYXKKw(C47501trL.Fragment.ixgjPv));
        }
        if (c55173xeu != null) {
            c55173xeu.setSubTitle((java.lang.CharSequence) string);
        }
    }

    /* JADX INFO: renamed from: o.tyF$StateListAnimator */
    public static final class StateListAnimator extends C47959tzu {

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$Activity */
        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] EZpvd;
            public static final /* synthetic */ int[] KWHzl;
            public static final /* synthetic */ int[] OLrzqt;
            public static final /* synthetic */ int[] copydefault;

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
                int[] iArr2 = new int[FollowersSubType.values().length];
                try {
                    iArr2[FollowersSubType.Subscribe.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                KWHzl = iArr2;
                int[] iArr3 = new int[CommentsSubType.values().length];
                try {
                    iArr3[CommentsSubType.Reply_Comments.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr3[CommentsSubType.Reply_Post.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                copydefault = iArr3;
                int[] iArr4 = new int[SystemSubType.values().length];
                try {
                    iArr4[SystemSubType.Post_Removed.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr4[SystemSubType.Comments_Removed.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr4[SystemSubType.Post_Review_Failed.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                try {
                    iArr4[SystemSubType.Comments_Review_Failed.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused9) {
                }
                try {
                    iArr4[SystemSubType.Content_Sync_Success.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused10) {
                }
                try {
                    iArr4[SystemSubType.Content_Sync_Failed.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused11) {
                }
                try {
                    iArr4[SystemSubType.Twitter_Sync_Failed.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused12) {
                }
                try {
                    iArr4[SystemSubType.BIO_REVIEW_FAILS.ordinal()] = 8;
                } catch (java.lang.NoSuchFieldError unused13) {
                }
                EZpvd = iArr4;
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
            if (c43312rms.getBindingAdapterPosition() == 1) {
                C47865tyF.this.KWHzl(unreadMsg.getMsgId());
            }
            int eventSourceType = unreadMsg.getEventSourceType();
            if (eventSourceType == 1) {
                Intrinsics.copydefault(context);
                AEQbTJ(c43312rms, unreadMsg, context);
                return;
            }
            if (eventSourceType == 2) {
                Intrinsics.copydefault(context);
                KWHzl(c43312rms, unreadMsg, context);
            } else if (eventSourceType == 3) {
                Intrinsics.copydefault(context);
                OLrzqt(c43312rms, unreadMsg, context);
            } else if (eventSourceType == 4) {
                Intrinsics.copydefault(context);
                EZpvd(c43312rms, unreadMsg, context);
            } else {
                Intrinsics.copydefault(context);
                copydefault(c43312rms, unreadMsg, context);
            }
        }

        public final void AEQbTJ(C43312rms<tMS> c43312rms, UnreadMsg unreadMsg, android.content.Context context) {
            EZpvd(c43312rms, false, unreadMsg);
            LikesSubType likesSubTypeEZpvd = LikesSubType.Companion.EZpvd(unreadMsg.getEventSubType());
            int i = likesSubTypeEZpvd == null ? -1 : Activity.OLrzqt[likesSubTypeEZpvd.ordinal()];
            if (i == 1) {
                RelatedAuthorInfo relatedAuthorInfo = unreadMsg.getRelatedAuthorInfo();
                java.lang.String nickname = relatedAuthorInfo != null ? relatedAuthorInfo.getNickname() : null;
                if (nickname == null) {
                    nickname = "";
                }
                KWHzl(c43312rms, C33069mpW.KWHzl(context, C47501trL.Fragment.gsvlRV, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_USERNAME, nickname))));
                java.lang.String msgText = unreadMsg.getMsgText();
                EZpvd(c43312rms, msgText != null ? msgText : "");
                RelatedAuthorInfo relatedAuthorInfo2 = unreadMsg.getRelatedAuthorInfo();
                AEQbTJ(c43312rms, relatedAuthorInfo2 != null ? relatedAuthorInfo2.getPortrait() : null);
                android.view.View view = c43312rms.itemView;
                view.setOnClickListener(new PendingIntent(view, 1000L, this, c43312rms, unreadMsg, C47865tyF.this));
                return;
            }
            if (i == 2) {
                RelatedAuthorInfo relatedAuthorInfo3 = unreadMsg.getRelatedAuthorInfo();
                java.lang.String nickname2 = relatedAuthorInfo3 != null ? relatedAuthorInfo3.getNickname() : null;
                if (nickname2 == null) {
                    nickname2 = "";
                }
                KWHzl(c43312rms, C33069mpW.KWHzl(context, C47501trL.Fragment.QslYrK, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_USERNAME, nickname2))));
                java.lang.String msgText2 = unreadMsg.getMsgText();
                EZpvd(c43312rms, msgText2 != null ? msgText2 : "");
                RelatedAuthorInfo relatedAuthorInfo4 = unreadMsg.getRelatedAuthorInfo();
                AEQbTJ(c43312rms, relatedAuthorInfo4 != null ? relatedAuthorInfo4.getPortrait() : null);
                android.view.View view2 = c43312rms.itemView;
                view2.setOnClickListener(new Dialog(view2, 1000L, this, c43312rms, unreadMsg, C47865tyF.this));
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
            view3.setOnClickListener(new AssistContent(view3, 1000L, this, c43312rms, unreadMsg, C47865tyF.this));
        }

        public final void KWHzl(C43312rms<tMS> c43312rms, UnreadMsg unreadMsg, android.content.Context context) {
            FollowersSubType followersSubTypeKWHzl = FollowersSubType.Companion.KWHzl(unreadMsg.getEventSubType());
            if (followersSubTypeKWHzl != null && Activity.KWHzl[followersSubTypeKWHzl.ordinal()] == 1) {
                RelatedAuthorInfo relatedAuthorInfo = unreadMsg.getRelatedAuthorInfo();
                java.lang.String nickname = relatedAuthorInfo != null ? relatedAuthorInfo.getNickname() : null;
                if (nickname == null) {
                    nickname = "";
                }
                KWHzl(c43312rms, C33069mpW.KWHzl(context, C47501trL.Fragment.DGGHxk, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_USERNAME, nickname))));
                java.lang.String msgText = unreadMsg.getMsgText();
                EZpvd(c43312rms, msgText != null ? msgText : "");
                RelatedAuthorInfo relatedAuthorInfo2 = unreadMsg.getRelatedAuthorInfo();
                AEQbTJ(c43312rms, relatedAuthorInfo2 != null ? relatedAuthorInfo2.getPortrait() : null);
                android.view.View view = c43312rms.itemView;
                view.setOnClickListener(new FragmentManager(view, 1000L, this, c43312rms, unreadMsg, C47865tyF.this));
                EZpvd(c43312rms, true, unreadMsg);
                C52794wYp c52794wYp = ((tMS) c43312rms.OLrzqt()).OLrzqt;
                c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 300L, c52794wYp, C47865tyF.this, unreadMsg, c43312rms));
                return;
            }
            KWHzl(c43312rms, C47501trL.ActionBar.gEmmrt);
            java.lang.String string = context.getString(C47501trL.Fragment.DzkRMH);
            Intrinsics.checkNotNullExpressionValue(string, "");
            KWHzl(c43312rms, string);
            java.lang.String string2 = context.getString(C47501trL.Fragment.DDjfYY);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            EZpvd(c43312rms, string2);
            android.view.View view2 = c43312rms.itemView;
            view2.setOnClickListener(new LoaderManager(view2, 1000L, this, c43312rms, unreadMsg, C47865tyF.this));
            EZpvd(c43312rms, false, unreadMsg);
            C52794wYp c52794wYp2 = ((tMS) c43312rms.OLrzqt()).OLrzqt;
            c52794wYp2.setOnClickListener(new Fragment(c52794wYp2, 300L, c52794wYp2));
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C47865tyF AhwBna;
            public final /* synthetic */ UnreadMsg EZpvd;
            public final /* synthetic */ StateListAnimator KWHzl;
            public final /* synthetic */ C43312rms OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47865tyF c47865tyF) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.KWHzl = stateListAnimator;
                this.OLrzqt = c43312rms;
                this.EZpvd = unreadMsg;
                this.AhwBna = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.OLrzqt, false, this.EZpvd);
                    C47910tyy.copydefault.KWHzl(this.AhwBna.EZpvd(), this.EZpvd);
                    C47945tzg c47945tzg = C47945tzg.OLrzqt;
                    android.content.Context contextRequireContext = this.AhwBna.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    c47945tzg.AEQbTJ(contextRequireContext, this.EZpvd.getRelatedContentId(), this.EZpvd.getRelatedCommentId(), this.EZpvd.getReplyRootId());
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ C43312rms AEQbTJ;
            public final /* synthetic */ C47865tyF AYXKKw;
            public final /* synthetic */ UnreadMsg EZpvd;
            public final /* synthetic */ StateListAnimator KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47865tyF c47865tyF) {
                this.copydefault = view;
                this.OLrzqt = j;
                this.KWHzl = stateListAnimator;
                this.AEQbTJ = c43312rms;
                this.EZpvd = unreadMsg;
                this.AYXKKw = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.AEQbTJ, false, this.EZpvd);
                    C47910tyy.copydefault.KWHzl(this.AYXKKw.EZpvd(), this.EZpvd);
                    StateListAnimator stateListAnimator = this.KWHzl;
                    android.view.View view2 = this.AEQbTJ.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.EZpvd(view2);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$AssistContent */
        public static final class AssistContent implements View.OnClickListener {
            public final /* synthetic */ UnreadMsg AEQbTJ;
            public final /* synthetic */ StateListAnimator EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C43312rms OLrzqt;
            public final /* synthetic */ android.view.View copydefault;
            public final /* synthetic */ C47865tyF djBIcL;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AssistContent(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47865tyF c47865tyF) {
                this.copydefault = view;
                this.KWHzl = j;
                this.EZpvd = stateListAnimator;
                this.OLrzqt = c43312rms;
                this.AEQbTJ = unreadMsg;
                this.djBIcL = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.OLrzqt, false, this.AEQbTJ);
                    C47910tyy.copydefault.KWHzl(this.djBIcL.EZpvd(), this.AEQbTJ);
                    StateListAnimator stateListAnimator = this.EZpvd;
                    android.view.View view2 = this.OLrzqt.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.EZpvd(view2);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$BroadcastReceiver */
        public static final class BroadcastReceiver implements View.OnClickListener {
            public final /* synthetic */ StateListAnimator AEQbTJ;
            public final /* synthetic */ C47865tyF AYXKKw;
            public final /* synthetic */ UnreadMsg EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C43312rms OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public BroadcastReceiver(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47865tyF c47865tyF) {
                this.copydefault = view;
                this.KWHzl = j;
                this.AEQbTJ = stateListAnimator;
                this.OLrzqt = c43312rms;
                this.EZpvd = unreadMsg;
                this.AYXKKw = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.OLrzqt, false, this.EZpvd);
                    StateListAnimator stateListAnimator = this.AEQbTJ;
                    android.view.View view2 = this.OLrzqt.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.EZpvd(view2);
                    C47910tyy.copydefault.KWHzl(this.AYXKKw.EZpvd(), this.EZpvd);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$ClipData */
        public static final class ClipData implements View.OnClickListener {
            public final /* synthetic */ C43312rms AEQbTJ;
            public final /* synthetic */ C47865tyF AhwBna;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ java.lang.String OLrzqt;
            public final /* synthetic */ UnreadMsg copydefault;
            public final /* synthetic */ StateListAnimator valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ClipData(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, java.lang.String str, C47865tyF c47865tyF) {
                this.KWHzl = view;
                this.EZpvd = j;
                this.valueOf = stateListAnimator;
                this.AEQbTJ = c43312rms;
                this.copydefault = unreadMsg;
                this.OLrzqt = str;
                this.AhwBna = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.AEQbTJ, false, this.copydefault);
                    StateListAnimator stateListAnimator = this.valueOf;
                    android.view.View view2 = this.AEQbTJ.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.copydefault(view2, this.OLrzqt);
                    C47910tyy.copydefault.KWHzl(this.AhwBna.EZpvd(), this.copydefault);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$ComponentCallbacks */
        public static final class ComponentCallbacks implements View.OnClickListener {
            public final /* synthetic */ C43312rms AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.content.Context KWHzl;
            public final /* synthetic */ UnreadMsg OLrzqt;
            public final /* synthetic */ android.view.View copydefault;
            public final /* synthetic */ C47865tyF djBIcL;
            public final /* synthetic */ StateListAnimator gEmmrt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ComponentCallbacks(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, android.content.Context context, C47865tyF c47865tyF) {
                this.copydefault = view;
                this.EZpvd = j;
                this.gEmmrt = stateListAnimator;
                this.AEQbTJ = c43312rms;
                this.OLrzqt = unreadMsg;
                this.KWHzl = context;
                this.djBIcL = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.AEQbTJ, false, this.OLrzqt);
                    java.lang.String string = this.KWHzl.getString(C47501trL.Fragment.DWgRXt);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    StateListAnimator stateListAnimator = this.gEmmrt;
                    android.view.View view2 = this.AEQbTJ.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.copydefault(view2, string);
                    C47910tyy.copydefault.KWHzl(this.djBIcL.EZpvd(), this.OLrzqt);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$ComponentCallbacks2 */
        public static final class ComponentCallbacks2 implements View.OnClickListener {
            public final /* synthetic */ java.lang.String AEQbTJ;
            public final /* synthetic */ C47865tyF AYXKKw;
            public final /* synthetic */ StateListAnimator AhwBna;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C43312rms OLrzqt;
            public final /* synthetic */ UnreadMsg copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ComponentCallbacks2(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, java.lang.String str, C47865tyF c47865tyF) {
                this.EZpvd = view;
                this.KWHzl = j;
                this.AhwBna = stateListAnimator;
                this.OLrzqt = c43312rms;
                this.copydefault = unreadMsg;
                this.AEQbTJ = str;
                this.AYXKKw = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.OLrzqt, false, this.copydefault);
                    StateListAnimator stateListAnimator = this.AhwBna;
                    android.view.View view2 = this.OLrzqt.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.copydefault(view2, this.AEQbTJ);
                    C47910tyy.copydefault.KWHzl(this.AYXKKw.EZpvd(), this.copydefault);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$ComponentName */
        public static final class ComponentName implements View.OnClickListener {
            public final /* synthetic */ C43312rms AEQbTJ;
            public final /* synthetic */ StateListAnimator AhwBna;
            public final /* synthetic */ UnreadMsg EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ java.lang.String OLrzqt;
            public final /* synthetic */ long copydefault;
            public final /* synthetic */ C47865tyF djBIcL;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ComponentName(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, java.lang.String str, C47865tyF c47865tyF) {
                this.KWHzl = view;
                this.copydefault = j;
                this.AhwBna = stateListAnimator;
                this.AEQbTJ = c43312rms;
                this.EZpvd = unreadMsg;
                this.OLrzqt = str;
                this.djBIcL = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.AEQbTJ, false, this.EZpvd);
                    StateListAnimator stateListAnimator = this.AhwBna;
                    android.view.View view2 = this.AEQbTJ.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.copydefault(view2, this.OLrzqt);
                    C47910tyy.copydefault.KWHzl(this.djBIcL.EZpvd(), this.EZpvd);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$Dialog */
        public static final class Dialog implements View.OnClickListener {
            public final /* synthetic */ UnreadMsg AEQbTJ;
            public final /* synthetic */ C47865tyF AhwBna;
            public final /* synthetic */ StateListAnimator EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ C43312rms OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Dialog(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47865tyF c47865tyF) {
                this.KWHzl = view;
                this.copydefault = j;
                this.EZpvd = stateListAnimator;
                this.OLrzqt = c43312rms;
                this.AEQbTJ = unreadMsg;
                this.AhwBna = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.OLrzqt, false, this.AEQbTJ);
                    C47910tyy.copydefault.KWHzl(this.AhwBna.EZpvd(), this.AEQbTJ);
                    C47945tzg c47945tzg = C47945tzg.OLrzqt;
                    android.content.Context contextRequireContext = this.AhwBna.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    c47945tzg.KWHzl(contextRequireContext, this.AEQbTJ.getRelatedContentId());
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$Fragment */
        public static final class Fragment implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Fragment(android.view.View view, long j, android.view.View view2) {
                this.copydefault = view;
                this.AEQbTJ = j;
                this.OLrzqt = view2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$FragmentManager */
        public static final class FragmentManager implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ StateListAnimator KWHzl;
            public final /* synthetic */ UnreadMsg OLrzqt;
            public final /* synthetic */ C43312rms copydefault;
            public final /* synthetic */ C47865tyF valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public FragmentManager(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47865tyF c47865tyF) {
                this.AEQbTJ = view;
                this.EZpvd = j;
                this.KWHzl = stateListAnimator;
                this.copydefault = c43312rms;
                this.OLrzqt = unreadMsg;
                this.valueOf = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.copydefault, false, this.OLrzqt);
                    C47910tyy.copydefault.KWHzl(this.valueOf.EZpvd(), this.OLrzqt);
                    C47945tzg c47945tzg = C47945tzg.OLrzqt;
                    android.content.Context contextRequireContext = this.valueOf.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    RelatedAuthorInfo relatedAuthorInfo = this.OLrzqt.getRelatedAuthorInfo();
                    c47945tzg.EZpvd(contextRequireContext, relatedAuthorInfo != null ? java.lang.Long.valueOf(relatedAuthorInfo.getUid()) : null);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$Intent */
        public static final class Intent implements View.OnClickListener {
            public final /* synthetic */ C43312rms AEQbTJ;
            public final /* synthetic */ C47865tyF AYXKKw;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ UnreadMsg OLrzqt;
            public final /* synthetic */ StateListAnimator copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Intent(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47865tyF c47865tyF) {
                this.EZpvd = view;
                this.KWHzl = j;
                this.copydefault = stateListAnimator;
                this.AEQbTJ = c43312rms;
                this.OLrzqt = unreadMsg;
                this.AYXKKw = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.AEQbTJ, false, this.OLrzqt);
                    C47910tyy.copydefault.KWHzl(this.AYXKKw.EZpvd(), this.OLrzqt);
                    StateListAnimator stateListAnimator = this.copydefault;
                    android.view.View view2 = this.AEQbTJ.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.EZpvd(view2);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$LoaderManager */
        public static final class LoaderManager implements View.OnClickListener {
            public final /* synthetic */ StateListAnimator AEQbTJ;
            public final /* synthetic */ C43312rms EZpvd;
            public final /* synthetic */ UnreadMsg KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ long copydefault;
            public final /* synthetic */ C47865tyF valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public LoaderManager(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47865tyF c47865tyF) {
                this.OLrzqt = view;
                this.copydefault = j;
                this.AEQbTJ = stateListAnimator;
                this.EZpvd = c43312rms;
                this.KWHzl = unreadMsg;
                this.valueOf = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.EZpvd, false, this.KWHzl);
                    C47910tyy.copydefault.KWHzl(this.valueOf.EZpvd(), this.KWHzl);
                    StateListAnimator stateListAnimator = this.AEQbTJ;
                    android.view.View view2 = this.EZpvd.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.EZpvd(view2);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$PendingIntent */
        public static final class PendingIntent implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C47865tyF AhwBna;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ UnreadMsg KWHzl;
            public final /* synthetic */ StateListAnimator OLrzqt;
            public final /* synthetic */ C43312rms copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public PendingIntent(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47865tyF c47865tyF) {
                this.AEQbTJ = view;
                this.EZpvd = j;
                this.OLrzqt = stateListAnimator;
                this.copydefault = c43312rms;
                this.KWHzl = unreadMsg;
                this.AhwBna = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.copydefault, false, this.KWHzl);
                    C47910tyy.copydefault.KWHzl(this.AhwBna.EZpvd(), this.KWHzl);
                    C47945tzg c47945tzg = C47945tzg.OLrzqt;
                    android.content.Context contextRequireContext = this.AhwBna.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    c47945tzg.AEQbTJ(contextRequireContext, this.KWHzl.getRelatedContentId(), this.KWHzl.getRelatedCommentId(), this.KWHzl.getReplyRootId());
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$PictureInPictureParams */
        public static final class PictureInPictureParams implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C47865tyF AhwBna;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ C43312rms KWHzl;
            public final /* synthetic */ StateListAnimator OLrzqt;
            public final /* synthetic */ UnreadMsg copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public PictureInPictureParams(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47865tyF c47865tyF) {
                this.AEQbTJ = view;
                this.EZpvd = j;
                this.OLrzqt = stateListAnimator;
                this.KWHzl = c43312rms;
                this.copydefault = unreadMsg;
                this.AhwBna = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.KWHzl, false, this.copydefault);
                    StateListAnimator stateListAnimator = this.OLrzqt;
                    android.view.View view2 = this.KWHzl.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.KWHzl(view2);
                    C47910tyy.copydefault.KWHzl(this.AhwBna.EZpvd(), this.copydefault);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$SharedElementCallback */
        public static final class SharedElementCallback implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C47865tyF AhwBna;
            public final /* synthetic */ C43312rms EZpvd;
            public final /* synthetic */ StateListAnimator KWHzl;
            public final /* synthetic */ UnreadMsg OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public SharedElementCallback(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47865tyF c47865tyF) {
                this.copydefault = view;
                this.AEQbTJ = j;
                this.KWHzl = stateListAnimator;
                this.EZpvd = c43312rms;
                this.OLrzqt = unreadMsg;
                this.AhwBna = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.EZpvd, false, this.OLrzqt);
                    StateListAnimator stateListAnimator = this.KWHzl;
                    android.view.View view2 = this.EZpvd.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.KWHzl(view2);
                    C47910tyy.copydefault.KWHzl(this.AhwBna.EZpvd(), this.OLrzqt);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0968StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ C43312rms AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ UnreadMsg KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ StateListAnimator copydefault;
            public final /* synthetic */ C47865tyF valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0968StateListAnimator(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47865tyF c47865tyF) {
                this.OLrzqt = view;
                this.EZpvd = j;
                this.copydefault = stateListAnimator;
                this.AEQbTJ = c43312rms;
                this.KWHzl = unreadMsg;
                this.valueOf = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.AEQbTJ, false, this.KWHzl);
                    C47910tyy.copydefault.KWHzl(this.valueOf.EZpvd(), this.KWHzl);
                    C47945tzg c47945tzg = C47945tzg.OLrzqt;
                    android.content.Context contextRequireContext = this.valueOf.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    c47945tzg.AEQbTJ(contextRequireContext, this.KWHzl.getRelatedContentId(), this.KWHzl.getRelatedCommentId(), this.KWHzl.getReplyRootId());
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ UnreadMsg AEQbTJ;
            public final /* synthetic */ C47865tyF AhwBna;
            public final /* synthetic */ C43312rms EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, android.view.View view2, C47865tyF c47865tyF, UnreadMsg unreadMsg, C43312rms c43312rms) {
                this.KWHzl = view;
                this.copydefault = j;
                this.OLrzqt = view2;
                this.AhwBna = c47865tyF;
                this.AEQbTJ = unreadMsg;
                this.EZpvd = c43312rms;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    C47865tyF c47865tyF = this.AhwBna;
                    UnreadMsg unreadMsg = this.AEQbTJ;
                    C52794wYp c52794wYp = ((tMS) this.EZpvd.OLrzqt()).OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                    c47865tyF.OLrzqt(unreadMsg, c52794wYp);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$TaskStackBuilder */
        public static final class TaskStackBuilder implements View.OnClickListener {
            public final /* synthetic */ StateListAnimator AEQbTJ;
            public final /* synthetic */ C47865tyF AYXKKw;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ C43312rms OLrzqt;
            public final /* synthetic */ UnreadMsg copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskStackBuilder(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47865tyF c47865tyF) {
                this.KWHzl = view;
                this.EZpvd = j;
                this.AEQbTJ = stateListAnimator;
                this.OLrzqt = c43312rms;
                this.copydefault = unreadMsg;
                this.AYXKKw = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.OLrzqt, false, this.copydefault);
                    StateListAnimator stateListAnimator = this.AEQbTJ;
                    android.view.View view2 = this.OLrzqt.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.KWHzl(view2);
                    C47910tyy.copydefault.KWHzl(this.AYXKKw.EZpvd(), this.copydefault);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyF$StateListAnimator$VoiceInteractor */
        public static final class VoiceInteractor implements View.OnClickListener {
            public final /* synthetic */ C43312rms AEQbTJ;
            public final /* synthetic */ C47865tyF AYXKKw;
            public final /* synthetic */ StateListAnimator EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ UnreadMsg OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public VoiceInteractor(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47865tyF c47865tyF) {
                this.copydefault = view;
                this.KWHzl = j;
                this.EZpvd = stateListAnimator;
                this.AEQbTJ = c43312rms;
                this.OLrzqt = unreadMsg;
                this.AYXKKw = c47865tyF;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault((C43312rms<tMS>) this.AEQbTJ, false, this.OLrzqt);
                    C47910tyy.copydefault.KWHzl(this.AYXKKw.EZpvd(), this.OLrzqt);
                    StateListAnimator stateListAnimator = this.EZpvd;
                    android.view.View view2 = this.AEQbTJ.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.KWHzl(view2);
                }
            }
        }

        public final void OLrzqt(C43312rms<tMS> c43312rms, UnreadMsg unreadMsg, android.content.Context context) {
            CommentsSubType commentsSubTypeCopydefault = CommentsSubType.Companion.copydefault(unreadMsg.getEventSubType());
            EZpvd(c43312rms, false, unreadMsg);
            int i = commentsSubTypeCopydefault == null ? -1 : Activity.copydefault[commentsSubTypeCopydefault.ordinal()];
            if (i == 1) {
                RelatedAuthorInfo relatedAuthorInfo = unreadMsg.getRelatedAuthorInfo();
                java.lang.String nickname = relatedAuthorInfo != null ? relatedAuthorInfo.getNickname() : null;
                if (nickname == null) {
                    nickname = "";
                }
                KWHzl(c43312rms, C33069mpW.KWHzl(context, C47501trL.Fragment.gGNlxh, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_USERNAME, nickname))));
                java.lang.String msgText = unreadMsg.getMsgText();
                EZpvd(c43312rms, msgText != null ? msgText : "");
                RelatedAuthorInfo relatedAuthorInfo2 = unreadMsg.getRelatedAuthorInfo();
                AEQbTJ(c43312rms, relatedAuthorInfo2 != null ? relatedAuthorInfo2.getPortrait() : null);
                android.view.View view = c43312rms.itemView;
                view.setOnClickListener(new ViewOnClickListenerC0968StateListAnimator(view, 1000L, this, c43312rms, unreadMsg, C47865tyF.this));
                return;
            }
            if (i == 2) {
                RelatedAuthorInfo relatedAuthorInfo3 = unreadMsg.getRelatedAuthorInfo();
                java.lang.String nickname2 = relatedAuthorInfo3 != null ? relatedAuthorInfo3.getNickname() : null;
                if (nickname2 == null) {
                    nickname2 = "";
                }
                KWHzl(c43312rms, C33069mpW.KWHzl(context, C47501trL.Fragment.fVjYLc, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_USERNAME, nickname2))));
                java.lang.String msgText2 = unreadMsg.getMsgText();
                EZpvd(c43312rms, msgText2 != null ? msgText2 : "");
                RelatedAuthorInfo relatedAuthorInfo4 = unreadMsg.getRelatedAuthorInfo();
                AEQbTJ(c43312rms, relatedAuthorInfo4 != null ? relatedAuthorInfo4.getPortrait() : null);
                android.view.View view2 = c43312rms.itemView;
                view2.setOnClickListener(new ActionBar(view2, 1000L, this, c43312rms, unreadMsg, C47865tyF.this));
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
            view3.setOnClickListener(new Application(view3, 1000L, this, c43312rms, unreadMsg, C47865tyF.this));
        }

        public final void EZpvd(C43312rms<tMS> c43312rms, UnreadMsg unreadMsg, android.content.Context context) {
            SystemSubType systemSubTypeOLrzqt = SystemSubType.Companion.OLrzqt(unreadMsg.getEventSubType());
            EZpvd(c43312rms, false, unreadMsg);
            switch (systemSubTypeOLrzqt == null ? -1 : Activity.EZpvd[systemSubTypeOLrzqt.ordinal()]) {
                case 1:
                    java.lang.String string = context.getString(C47501trL.Fragment.QWpYiD);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    KWHzl(c43312rms, string);
                    java.lang.String msgText = unreadMsg.getMsgText();
                    EZpvd(c43312rms, msgText != null ? msgText : "");
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view = c43312rms.itemView;
                    view.setOnClickListener(new VoiceInteractor(view, 1000L, this, c43312rms, unreadMsg, C47865tyF.this));
                    break;
                case 2:
                    java.lang.String string2 = context.getString(C47501trL.Fragment.ExKek);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    KWHzl(c43312rms, string2);
                    java.lang.String msgText2 = unreadMsg.getMsgText();
                    EZpvd(c43312rms, msgText2 != null ? msgText2 : "");
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view2 = c43312rms.itemView;
                    view2.setOnClickListener(new PictureInPictureParams(view2, 1000L, this, c43312rms, unreadMsg, C47865tyF.this));
                    break;
                case 3:
                    java.lang.String string3 = context.getString(C47501trL.Fragment.jNexW);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    KWHzl(c43312rms, string3);
                    java.lang.String msgText3 = unreadMsg.getMsgText();
                    EZpvd(c43312rms, msgText3 != null ? msgText3 : "");
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view3 = c43312rms.itemView;
                    view3.setOnClickListener(new TaskStackBuilder(view3, 1000L, this, c43312rms, unreadMsg, C47865tyF.this));
                    break;
                case 4:
                    java.lang.String string4 = context.getString(C47501trL.Fragment.QKDJJA);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    KWHzl(c43312rms, string4);
                    java.lang.String msgText4 = unreadMsg.getMsgText();
                    EZpvd(c43312rms, msgText4 != null ? msgText4 : "");
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view4 = c43312rms.itemView;
                    view4.setOnClickListener(new SharedElementCallback(view4, 1000L, this, c43312rms, unreadMsg, C47865tyF.this));
                    break;
                case 5:
                    java.lang.String string5 = context.getString(C47501trL.Fragment.dbwnZN);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    KWHzl(c43312rms, string5);
                    java.lang.String string6 = context.getString(C47501trL.Fragment.fiXcQa);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    EZpvd(c43312rms, string6);
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view5 = c43312rms.itemView;
                    view5.setOnClickListener(new ComponentName(view5, 1000L, this, c43312rms, unreadMsg, string6, C47865tyF.this));
                    break;
                case 6:
                    java.lang.String string7 = context.getString(C47501trL.Fragment.QFTsTN);
                    Intrinsics.checkNotNullExpressionValue(string7, "");
                    KWHzl(c43312rms, string7);
                    java.lang.String string8 = context.getString(C47501trL.Fragment.iUnTnt);
                    Intrinsics.checkNotNullExpressionValue(string8, "");
                    EZpvd(c43312rms, string8);
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view6 = c43312rms.itemView;
                    view6.setOnClickListener(new ClipData(view6, 1000L, this, c43312rms, unreadMsg, string8, C47865tyF.this));
                    break;
                case 7:
                    java.lang.String string9 = context.getString(C47501trL.Fragment.QFTsTN);
                    Intrinsics.checkNotNullExpressionValue(string9, "");
                    KWHzl(c43312rms, string9);
                    java.lang.String string10 = context.getString(C47501trL.Fragment.DlmWDR);
                    Intrinsics.checkNotNullExpressionValue(string10, "");
                    EZpvd(c43312rms, string10);
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view7 = c43312rms.itemView;
                    view7.setOnClickListener(new ComponentCallbacks2(view7, 1000L, this, c43312rms, unreadMsg, string10, C47865tyF.this));
                    break;
                case 8:
                    java.lang.String string11 = context.getString(C47501trL.Fragment.fHqPtx);
                    Intrinsics.checkNotNullExpressionValue(string11, "");
                    KWHzl(c43312rms, string11);
                    EZpvd(c43312rms, C33129mqd.gEmmrt(unreadMsg.getMsgText()));
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view8 = c43312rms.itemView;
                    view8.setOnClickListener(new ComponentCallbacks(view8, 1000L, this, c43312rms, unreadMsg, context, C47865tyF.this));
                    break;
                default:
                    java.lang.String string12 = context.getString(C47501trL.Fragment.DzkRMH);
                    Intrinsics.checkNotNullExpressionValue(string12, "");
                    KWHzl(c43312rms, string12);
                    java.lang.String string13 = context.getString(C47501trL.Fragment.DDjfYY);
                    Intrinsics.checkNotNullExpressionValue(string13, "");
                    EZpvd(c43312rms, string13);
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view9 = c43312rms.itemView;
                    view9.setOnClickListener(new BroadcastReceiver(view9, 1000L, this, c43312rms, unreadMsg, C47865tyF.this));
                    break;
            }
        }

        public final void copydefault(C43312rms<tMS> c43312rms, UnreadMsg unreadMsg, android.content.Context context) {
            KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
            java.lang.String string = context.getString(C47501trL.Fragment.DzkRMH);
            Intrinsics.checkNotNullExpressionValue(string, "");
            KWHzl(c43312rms, string);
            java.lang.String string2 = context.getString(C47501trL.Fragment.DDjfYY);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            EZpvd(c43312rms, string2);
            android.view.View view = c43312rms.itemView;
            view.setOnClickListener(new Intent(view, 1000L, this, c43312rms, unreadMsg, C47865tyF.this));
        }
    }

    @Override // o.AbstractC47868tyI
    public void copydefault(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        super.copydefault(c59534zip);
        c59534zip.register(UnreadMsg.class, new StateListAnimator(gEmmrt()));
    }
}
