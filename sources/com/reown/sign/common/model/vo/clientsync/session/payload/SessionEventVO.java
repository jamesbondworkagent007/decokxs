package com.reown.sign.common.model.vo.clientsync.session.payload;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = false)
public final class SessionEventVO {
    public final Object data;
    public final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SessionEventVO copy$default(SessionEventVO sessionEventVO, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = sessionEventVO.name;
        }
        if ((i & 2) != 0) {
            obj = sessionEventVO.data;
        }
        return sessionEventVO.copy(str, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SessionEventVO copy(@Json(name = "name") @NotNull String str, @Json(name = "data") @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return new SessionEventVO(str, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionEventVO)) {
            return false;
        }
        SessionEventVO sessionEventVO = (SessionEventVO) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) sessionEventVO.name) && Intrinsics.EZpvd(this.data, sessionEventVO.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.name.hashCode() * 31) + this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SessionEventVO(name=" + this.name + ", data=" + this.data + ")";
    }

    public SessionEventVO(@Json(name = "name") @NotNull String str, @Json(name = "data") @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        this.name = str;
        this.data = obj;
    }
}
