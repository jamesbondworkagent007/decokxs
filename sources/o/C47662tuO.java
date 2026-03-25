package o;

import com.okinc.planet.biz_content.leaderboard.bean.FollowingListResponse;
import com.okinc.planet.biz_content.leaderboard.bean.FollowingUser;
import com.okinc.planet.biz_content.leaderboard.usecase.PlanetGetFollowingListUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47662tuO {
    public final tQV EZpvd;
    public final boolean OLrzqt;

    public C47662tuO(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.EZpvd = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(java.lang.String str, java.lang.Integer num, @NotNull Continuation<? super FollowingListResponse> continuation) throws java.lang.Throwable {
        PlanetGetFollowingListUseCase$invoke$1 planetGetFollowingListUseCase$invoke$1;
        C47662tuO c47662tuO;
        if (continuation instanceof PlanetGetFollowingListUseCase$invoke$1) {
            planetGetFollowingListUseCase$invoke$1 = (PlanetGetFollowingListUseCase$invoke$1) continuation;
            int i = planetGetFollowingListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetGetFollowingListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetGetFollowingListUseCase$invoke$1 = new PlanetGetFollowingListUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = planetGetFollowingListUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = planetGetFollowingListUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                tQV tqv = this.EZpvd;
                planetGetFollowingListUseCase$invoke$1.L$0 = this;
                planetGetFollowingListUseCase$invoke$1.label = 1;
                objCopydefault = tqv.copydefault(str, num, planetGetFollowingListUseCase$invoke$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                c47662tuO = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c47662tuO = (C47662tuO) planetGetFollowingListUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            FollowingListResponse followingListResponse = (FollowingListResponse) ((AbstractC43419rot) objCopydefault).AEQbTJ();
            return (!c47662tuO.OLrzqt || followingListResponse == null) ? followingListResponse : c47662tuO.AEQbTJ(followingListResponse);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final FollowingListResponse AEQbTJ(FollowingListResponse followingListResponse) {
        FollowingListResponse followingListResponse2;
        java.util.ArrayList arrayList;
        java.util.List<FollowingUser> followers = followingListResponse.getFollowers();
        if (followers != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(followers, 10));
            int i = 0;
            for (java.lang.Object obj : followers) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                FollowingUser followingUserCopy = (FollowingUser) obj;
                if (i == 0) {
                    followingUserCopy = followingUserCopy.copy((439 & 1) != 0 ? followingUserCopy.authorId : null, (439 & 2) != 0 ? followingUserCopy.portrait : null, (439 & 4) != 0 ? followingUserCopy.nickName : null, (439 & 8) != 0 ? followingUserCopy.unread : 0, (439 & 16) != 0 ? followingUserCopy.bio : null, (439 & 32) != 0 ? followingUserCopy.followStatus : null, (439 & 64) != 0 ? followingUserCopy.liveStatus : "1", (439 & 128) != 0 ? followingUserCopy.offcialStatus : null, (439 & 256) != 0 ? followingUserCopy.shareCode : null);
                } else if (i == 1) {
                    followingUserCopy = followingUserCopy.copy((439 & 1) != 0 ? followingUserCopy.authorId : null, (439 & 2) != 0 ? followingUserCopy.portrait : null, (439 & 4) != 0 ? followingUserCopy.nickName : null, (439 & 8) != 0 ? followingUserCopy.unread : 1, (439 & 16) != 0 ? followingUserCopy.bio : null, (439 & 32) != 0 ? followingUserCopy.followStatus : null, (439 & 64) != 0 ? followingUserCopy.liveStatus : "0", (439 & 128) != 0 ? followingUserCopy.offcialStatus : null, (439 & 256) != 0 ? followingUserCopy.shareCode : null);
                } else if (i == 2) {
                    followingUserCopy = followingUserCopy.copy((439 & 1) != 0 ? followingUserCopy.authorId : null, (439 & 2) != 0 ? followingUserCopy.portrait : null, (439 & 4) != 0 ? followingUserCopy.nickName : null, (439 & 8) != 0 ? followingUserCopy.unread : 0, (439 & 16) != 0 ? followingUserCopy.bio : null, (439 & 32) != 0 ? followingUserCopy.followStatus : null, (439 & 64) != 0 ? followingUserCopy.liveStatus : "0", (439 & 128) != 0 ? followingUserCopy.offcialStatus : null, (439 & 256) != 0 ? followingUserCopy.shareCode : null);
                }
                arrayList.add(followingUserCopy);
                i++;
            }
            followingListResponse2 = followingListResponse;
        } else {
            followingListResponse2 = followingListResponse;
            arrayList = null;
        }
        return FollowingListResponse.copy$default(followingListResponse2, arrayList, null, 2, null);
    }
}
