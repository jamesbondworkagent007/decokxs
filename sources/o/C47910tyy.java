package o;

import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.planet.biz_notifications.model.CommentsSubType;
import com.okinc.planet.biz_notifications.model.FollowersSubType;
import com.okinc.planet.biz_notifications.model.LikesSubType;
import com.okinc.planet.biz_notifications.model.SystemSubType;
import com.okinc.planet.domain.remote.dto.RelatedAuthorInfo;
import com.okinc.planet.domain.remote.dto.UnreadMsg;
import com.okinc.planet_api.model.PlanetNotificationCategory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47910tyy {
    public static final C47910tyy copydefault = new C47910tyy();

    /* JADX INFO: renamed from: o.tyy$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LikesSubType.values().length];
            try {
                iArr[LikesSubType.Post.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LikesSubType.Comments.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[FollowersSubType.values().length];
            try {
                iArr2[FollowersSubType.Subscribe.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr2;
            int[] iArr3 = new int[CommentsSubType.values().length];
            try {
                iArr3[CommentsSubType.Reply_Comments.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr3[CommentsSubType.Reply_Post.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr3;
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
            copydefault = iArr4;
            int[] iArr5 = new int[PlanetNotificationCategory.values().length];
            try {
                iArr5[PlanetNotificationCategory.Likes.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr5[PlanetNotificationCategory.Followers.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr5[PlanetNotificationCategory.Comments.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr5[PlanetNotificationCategory.System.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            KWHzl = iArr5;
        }
    }

    private C47910tyy() {
    }

    public final void AEQbTJ(@NotNull final PlanetNotificationCategory planetNotificationCategory) {
        Intrinsics.checkNotNullParameter(planetNotificationCategory, "");
        C32866mlf.KWHzl("Feeds_Notification_Page_View", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.tyC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47910tyy.OLrzqt(planetNotificationCategory, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(PlanetNotificationCategory planetNotificationCategory, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", planetNotificationCategory.getEventName(), true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final PlanetNotificationCategory planetNotificationCategory, @NotNull final UnreadMsg unreadMsg) {
        Intrinsics.checkNotNullParameter(planetNotificationCategory, "");
        Intrinsics.checkNotNullParameter(unreadMsg, "");
        C32866mlf.KWHzl("Feeds_Notification_Item_Click", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.tyA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47910tyy.OLrzqt(planetNotificationCategory, unreadMsg, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(PlanetNotificationCategory planetNotificationCategory, UnreadMsg unreadMsg, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", planetNotificationCategory.getEventName(), true);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.SUB_TYPE, copydefault.EZpvd(planetNotificationCategory, unreadMsg.getEventSubType()), false, 4, null);
        eventParamsList.put("feed_id", java.lang.String.valueOf(unreadMsg.getMsgId()), false);
        RelatedAuthorInfo relatedAuthorInfo = unreadMsg.getRelatedAuthorInfo();
        eventParamsList.put("author_id", java.lang.String.valueOf(relatedAuthorInfo != null ? java.lang.Long.valueOf(relatedAuthorInfo.getUid()) : null), false);
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd(PlanetNotificationCategory planetNotificationCategory, int i) {
        int i2;
        int i3 = ActionBar.KWHzl[planetNotificationCategory.ordinal()];
        if (i3 == 1) {
            LikesSubType likesSubTypeEZpvd = LikesSubType.Companion.EZpvd(i);
            i2 = likesSubTypeEZpvd != null ? ActionBar.OLrzqt[likesSubTypeEZpvd.ordinal()] : -1;
            if (i2 == 1) {
                return "Post";
            }
            if (i2 == 2) {
                return "Comments";
            }
        } else if (i3 == 2) {
            FollowersSubType followersSubTypeKWHzl = FollowersSubType.Companion.KWHzl(i);
            if (followersSubTypeKWHzl != null && ActionBar.AEQbTJ[followersSubTypeKWHzl.ordinal()] == 1) {
                return "Subscribe";
            }
        } else if (i3 == 3) {
            CommentsSubType commentsSubTypeCopydefault = CommentsSubType.Companion.copydefault(i);
            i2 = commentsSubTypeCopydefault != null ? ActionBar.EZpvd[commentsSubTypeCopydefault.ordinal()] : -1;
            if (i2 == 1) {
                return "Reply Comments";
            }
            if (i2 == 2) {
                return "Reply Post";
            }
        } else if (i3 == 4) {
            SystemSubType systemSubTypeOLrzqt = SystemSubType.Companion.OLrzqt(i);
            switch (systemSubTypeOLrzqt != null ? ActionBar.copydefault[systemSubTypeOLrzqt.ordinal()] : -1) {
                case 1:
                    return "Post Removed";
                case 2:
                    return "Comments Removed";
                case 3:
                    return "Post Review Failed";
                case 4:
                    return "Comments Review Failed";
                case 5:
                    return "Content Sync Success";
                case 6:
                    return "Content Sync Failed";
                case 7:
                    return "Content Sync Failed less than 5000";
                case 8:
                    return "Bio review disapproved";
            }
        }
        return "Unknown";
    }
}
