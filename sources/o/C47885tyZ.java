package o;

import android.view.View;
import androidx.autofill.HintConstants;
import com.okinc.planet.biz_notifications.model.FollowersSubType;
import com.okinc.planet.domain.remote.dto.RelatedAuthorInfo;
import com.okinc.planet.domain.remote.dto.UnreadMsg;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47885tyZ extends AbstractC47868tyI {
    public final boolean copydefault = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC47868tyI
    public boolean OLrzqt() {
        return this.copydefault;
    }

    @Override // o.AbstractC47868tyI
    public void copydefault(C55173xeu c55173xeu) {
        super.copydefault(c55173xeu);
        java.lang.String string = getResources().getString(C47501trL.Fragment.DlABUU);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (c55173xeu != null) {
            c55173xeu.setSubTitle((java.lang.CharSequence) string);
        }
    }

    /* JADX INFO: renamed from: o.tyZ$StateListAnimator */
    public static final class StateListAnimator extends C47959tzu {

        /* JADX INFO: renamed from: o.tyZ$StateListAnimator$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[FollowersSubType.values().length];
                try {
                    iArr[FollowersSubType.Subscribe.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                copydefault = iArr;
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
            FollowersSubType followersSubTypeKWHzl = FollowersSubType.Companion.KWHzl(unreadMsg.getEventSubType());
            if (followersSubTypeKWHzl != null && TaskDescription.copydefault[followersSubTypeKWHzl.ordinal()] == 1) {
                RelatedAuthorInfo relatedAuthorInfo = unreadMsg.getRelatedAuthorInfo();
                java.lang.String nickname = relatedAuthorInfo != null ? relatedAuthorInfo.getNickname() : null;
                if (nickname == null) {
                    nickname = "";
                }
                Intrinsics.copydefault(context);
                KWHzl(c43312rms, C33069mpW.KWHzl(context, C47501trL.Fragment.DGGHxk, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_USERNAME, nickname))));
                java.lang.String msgText = unreadMsg.getMsgText();
                EZpvd(c43312rms, msgText != null ? msgText : "");
                RelatedAuthorInfo relatedAuthorInfo2 = unreadMsg.getRelatedAuthorInfo();
                AEQbTJ(c43312rms, relatedAuthorInfo2 != null ? relatedAuthorInfo2.getPortrait() : null);
                android.view.View view = c43312rms.itemView;
                view.setOnClickListener(new ActionBar(view, 1000L, this, c43312rms, unreadMsg, C47885tyZ.this));
                EZpvd(c43312rms, true, unreadMsg);
                C52794wYp c52794wYp = ((tMS) c43312rms.OLrzqt()).OLrzqt;
                c52794wYp.setOnClickListener(new Activity(c52794wYp, 300L, c52794wYp, C47885tyZ.this, unreadMsg, c43312rms));
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
            view2.setOnClickListener(new Application(view2, 1000L, this, c43312rms, unreadMsg, C47885tyZ.this));
            EZpvd(c43312rms, false, unreadMsg);
            C52794wYp c52794wYp2 = ((tMS) c43312rms.OLrzqt()).OLrzqt;
            c52794wYp2.setOnClickListener(new ViewOnClickListenerC0970StateListAnimator(c52794wYp2, 300L, c52794wYp2));
        }

        /* JADX INFO: renamed from: o.tyZ$StateListAnimator$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C47885tyZ AhwBna;
            public final /* synthetic */ C43312rms EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ StateListAnimator OLrzqt;
            public final /* synthetic */ UnreadMsg copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47885tyZ c47885tyZ) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.OLrzqt = stateListAnimator;
                this.EZpvd = c43312rms;
                this.copydefault = unreadMsg;
                this.AhwBna = c47885tyZ;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault(this.EZpvd, false, this.copydefault);
                    C47910tyy.copydefault.KWHzl(this.AhwBna.EZpvd(), this.copydefault);
                    C47945tzg c47945tzg = C47945tzg.OLrzqt;
                    android.content.Context contextRequireContext = this.AhwBna.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    RelatedAuthorInfo relatedAuthorInfo = this.copydefault.getRelatedAuthorInfo();
                    c47945tzg.EZpvd(contextRequireContext, relatedAuthorInfo != null ? java.lang.Long.valueOf(relatedAuthorInfo.getUid()) : null);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyZ$StateListAnimator$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C47885tyZ AhwBna;
            public final /* synthetic */ C43312rms EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ UnreadMsg copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, android.view.View view2, C47885tyZ c47885tyZ, UnreadMsg unreadMsg, C43312rms c43312rms) {
                this.KWHzl = view;
                this.AEQbTJ = j;
                this.OLrzqt = view2;
                this.AhwBna = c47885tyZ;
                this.copydefault = unreadMsg;
                this.EZpvd = c43312rms;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    C47885tyZ c47885tyZ = this.AhwBna;
                    UnreadMsg unreadMsg = this.copydefault;
                    C52794wYp c52794wYp = ((tMS) this.EZpvd.OLrzqt()).OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                    c47885tyZ.OLrzqt(unreadMsg, c52794wYp);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyZ$StateListAnimator$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C47885tyZ AhwBna;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ UnreadMsg KWHzl;
            public final /* synthetic */ C43312rms OLrzqt;
            public final /* synthetic */ StateListAnimator copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, StateListAnimator stateListAnimator, C43312rms c43312rms, UnreadMsg unreadMsg, C47885tyZ c47885tyZ) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.copydefault = stateListAnimator;
                this.OLrzqt = c43312rms;
                this.KWHzl = unreadMsg;
                this.AhwBna = c47885tyZ;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    StateListAnimator.super.copydefault(this.OLrzqt, false, this.KWHzl);
                    C47910tyy.copydefault.KWHzl(this.AhwBna.EZpvd(), this.KWHzl);
                    StateListAnimator stateListAnimator = this.copydefault;
                    android.view.View view2 = this.OLrzqt.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    stateListAnimator.EZpvd(view2);
                }
            }
        }

        /* JADX INFO: renamed from: o.tyZ$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0970StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0970StateListAnimator(android.view.View view, long j, android.view.View view2) {
                this.copydefault = view;
                this.EZpvd = j;
                this.KWHzl = view2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
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
