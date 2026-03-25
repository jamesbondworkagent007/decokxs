package o;

import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.okimcore.model.remote.PhoneNumber;
import com.okinc.okimcore.model.remote.ReferralTasks;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.ContactEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sGd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44177sGd {
    public static final Activity Companion = Activity.OLrzqt;

    java.lang.Object AEQbTJ(@NotNull Continuation<? super java.util.List<RelationInfo>> continuation);

    java.lang.Object AYXKKw(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super RelationInfo> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<RelationInfo>> continuation);

    java.lang.Object KWHzl(java.lang.Long l, java.lang.String str, PhoneNumber phoneNumber, @NotNull Continuation<? super java.util.List<InHouseIMContactInfoEntity>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super com.okinc.okimcore.model.remote.UserInfo> continuation);

    java.lang.Object OLrzqt(int i, boolean z, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull CacheStrategy cacheStrategy, @NotNull Continuation<? super java.util.List<RelationInfo>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super RelationInfo> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.String> continuation);

    Flow<java.util.List<RelationInfo>> OLrzqt();

    Flow<RelationInfo> OLrzqt(@NotNull java.lang.String str);

    java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super RelationInfo> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super RelationInfo> continuation);

    java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull com.okinc.okimcore.model.im.CacheStrategy cacheStrategy, @NotNull Continuation<? super java.util.List<RelationInfo>> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super ReferralTasks> continuation);

    boolean copydefault();

    java.lang.Object gEmmrt(@NotNull Continuation<? super java.util.List<ContactEntity>> continuation);

    java.lang.Object valueOf(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<RelationInfo>> continuation);

    /* JADX INFO: renamed from: o.sGd$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity OLrzqt = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.sGd$Application */
    public static final class Application {
        public static /* synthetic */ java.lang.Object getCurrentUser$default(InterfaceC44177sGd interfaceC44177sGd, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrentUser");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return interfaceC44177sGd.KWHzl(z, (Continuation<? super com.okinc.okimcore.model.remote.UserInfo>) continuation);
        }
    }
}
