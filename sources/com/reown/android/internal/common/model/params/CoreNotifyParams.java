package com.reown.android.internal.common.model.params;

import com.reown.android.internal.common.model.type.ClientParams;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface CoreNotifyParams extends ClientParams {

    /* JADX INFO: loaded from: classes17.dex */
    @JsonClass(generateAdapter = true)
    public static final class SubscribeParams implements CoreNotifyParams {
        public final String subscriptionAuth;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SubscribeParams copy$default(SubscribeParams subscribeParams, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subscribeParams.subscriptionAuth;
            }
            return subscribeParams.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.subscriptionAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubscribeParams copy(@Json(name = "subscriptionAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SubscribeParams(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubscribeParams) && Intrinsics.EZpvd((Object) this.subscriptionAuth, (Object) ((SubscribeParams) obj).subscriptionAuth);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSubscriptionAuth() {
            return this.subscriptionAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.subscriptionAuth.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubscribeParams(subscriptionAuth=" + this.subscriptionAuth + ")";
        }

        public SubscribeParams(@Json(name = "subscriptionAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.subscriptionAuth = str;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    @JsonClass(generateAdapter = true)
    public static final class MessageParams implements CoreNotifyParams {
        public final String messageAuth;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ MessageParams copy$default(MessageParams messageParams, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageParams.messageAuth;
            }
            return messageParams.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.messageAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MessageParams copy(@Json(name = "messageAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new MessageParams(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MessageParams) && Intrinsics.EZpvd((Object) this.messageAuth, (Object) ((MessageParams) obj).messageAuth);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessageAuth() {
            return this.messageAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.messageAuth.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MessageParams(messageAuth=" + this.messageAuth + ")";
        }

        public MessageParams(@Json(name = "messageAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.messageAuth = str;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class UpdateParams implements CoreNotifyParams {
        public final String updateAuth;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UpdateParams copy$default(UpdateParams updateParams, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updateParams.updateAuth;
            }
            return updateParams.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.updateAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UpdateParams copy(@Json(name = "updateAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new UpdateParams(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateParams) && Intrinsics.EZpvd((Object) this.updateAuth, (Object) ((UpdateParams) obj).updateAuth);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUpdateAuth() {
            return this.updateAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.updateAuth.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UpdateParams(updateAuth=" + this.updateAuth + ")";
        }

        public UpdateParams(@Json(name = "updateAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.updateAuth = str;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    @JsonClass(generateAdapter = true)
    public static final class DeleteParams implements CoreNotifyParams {
        public final String deleteAuth;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DeleteParams copy$default(DeleteParams deleteParams, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deleteParams.deleteAuth;
            }
            return deleteParams.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.deleteAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeleteParams copy(@Json(name = "deleteAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new DeleteParams(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteParams) && Intrinsics.EZpvd((Object) this.deleteAuth, (Object) ((DeleteParams) obj).deleteAuth);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDeleteAuth() {
            return this.deleteAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.deleteAuth.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DeleteParams(deleteAuth=" + this.deleteAuth + ")";
        }

        public DeleteParams(@Json(name = "deleteAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.deleteAuth = str;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    @JsonClass(generateAdapter = true)
    public static final class WatchSubscriptionsParams implements CoreNotifyParams {
        public final String watchSubscriptionsAuth;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ WatchSubscriptionsParams copy$default(WatchSubscriptionsParams watchSubscriptionsParams, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = watchSubscriptionsParams.watchSubscriptionsAuth;
            }
            return watchSubscriptionsParams.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.watchSubscriptionsAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WatchSubscriptionsParams copy(@Json(name = "watchSubscriptionsAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new WatchSubscriptionsParams(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WatchSubscriptionsParams) && Intrinsics.EZpvd((Object) this.watchSubscriptionsAuth, (Object) ((WatchSubscriptionsParams) obj).watchSubscriptionsAuth);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getWatchSubscriptionsAuth() {
            return this.watchSubscriptionsAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.watchSubscriptionsAuth.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WatchSubscriptionsParams(watchSubscriptionsAuth=" + this.watchSubscriptionsAuth + ")";
        }

        public WatchSubscriptionsParams(@Json(name = "watchSubscriptionsAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.watchSubscriptionsAuth = str;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    @JsonClass(generateAdapter = true)
    public static final class SubscriptionsChangedParams implements CoreNotifyParams {
        public final String subscriptionsChangedAuth;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SubscriptionsChangedParams copy$default(SubscriptionsChangedParams subscriptionsChangedParams, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subscriptionsChangedParams.subscriptionsChangedAuth;
            }
            return subscriptionsChangedParams.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.subscriptionsChangedAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubscriptionsChangedParams copy(@Json(name = "subscriptionsChangedAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SubscriptionsChangedParams(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubscriptionsChangedParams) && Intrinsics.EZpvd((Object) this.subscriptionsChangedAuth, (Object) ((SubscriptionsChangedParams) obj).subscriptionsChangedAuth);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSubscriptionsChangedAuth() {
            return this.subscriptionsChangedAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.subscriptionsChangedAuth.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubscriptionsChangedParams(subscriptionsChangedAuth=" + this.subscriptionsChangedAuth + ")";
        }

        public SubscriptionsChangedParams(@Json(name = "subscriptionsChangedAuth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.subscriptionsChangedAuth = str;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    @JsonClass(generateAdapter = true)
    public static final class GetNotificationsParams implements CoreNotifyParams {
        public final String auth;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ GetNotificationsParams copy$default(GetNotificationsParams getNotificationsParams, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getNotificationsParams.auth;
            }
            return getNotificationsParams.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.auth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GetNotificationsParams copy(@Json(name = "auth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new GetNotificationsParams(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetNotificationsParams) && Intrinsics.EZpvd((Object) this.auth, (Object) ((GetNotificationsParams) obj).auth);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAuth() {
            return this.auth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.auth.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "GetNotificationsParams(auth=" + this.auth + ")";
        }

        public GetNotificationsParams(@Json(name = "auth") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.auth = str;
        }
    }
}
