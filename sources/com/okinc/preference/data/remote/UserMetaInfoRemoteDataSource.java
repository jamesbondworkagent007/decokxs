package com.okinc.preference.data.remote;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.meta.UserMetaInfo;
import o.AbstractC58185ywX;
import o.C46530tXt;
import o.C56524yIo;
import okhttp3.Interceptor;
import retrofit2.http.GET;
import retrofit2.http.Header;

/* JADX INFO: loaded from: classes24.dex */
public interface UserMetaInfoRemoteDataSource {
    public static final StateListAnimator Companion = StateListAnimator.EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static UserMetaInfoRemoteDataSource getInstance() {
        return Companion.OLrzqt();
    }

    @GET("/v3/users/mobile/security/user-meta-info")
    AbstractC58185ywX<ResponseData<UserMetaInfo>> loadUserMetaInfo(@Header("OKAsymmetricSignEnable") boolean z);

    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
        }

        public final UserMetaInfoRemoteDataSource OLrzqt() {
            return (UserMetaInfoRemoteDataSource) C46530tXt.OLrzqt(C56524yIo.AEQbTJ(UserMetaInfoRemoteDataSource.class), new Interceptor[0]);
        }
    }

    public static final class TaskDescription {
        public static /* synthetic */ AbstractC58185ywX loadUserMetaInfo$default(UserMetaInfoRemoteDataSource userMetaInfoRemoteDataSource, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadUserMetaInfo");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return userMetaInfoRemoteDataSource.loadUserMetaInfo(z);
        }
    }
}
