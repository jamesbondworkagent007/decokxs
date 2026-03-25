package o;

import com.google.common.annotations.VisibleForTesting;
import com.okinc.core.util.SPUtils;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oBI {
    public static final oBI AEQbTJ = new oBI();

    private oBI() {
    }

    @VisibleForTesting
    public final java.lang.String KWHzl(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            return null;
        }
        return str + "_" + j + "_group_announcement_banner_edit_time";
    }

    @VisibleForTesting
    public final java.lang.String EZpvd(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            return null;
        }
        return str + "_" + j + "_group_announcement_banner_notice_id";
    }

    public final void EZpvd(@NotNull java.lang.String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strKWHzl = KWHzl(str, j);
        java.lang.String strEZpvd = EZpvd(str, j);
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, "setGroupAnnouncementBannerEditTime");
        Unit unit = Unit.INSTANCE;
        jsonObjectBuilder.put("tags", jsonArrayBuilder.build());
        JsonElementBuildersKt.put(jsonObjectBuilder, JwtUtilsKt.DID_METHOD_KEY, strKWHzl);
        JsonElementBuildersKt.put(jsonObjectBuilder, "editTime", java.lang.Long.valueOf(j2));
        pUU.KWHzl("GroupAnnouncementBannerPreference", jsonObjectBuilder.build().toString());
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        JsonArrayBuilder jsonArrayBuilder2 = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder2, "setGroupAnnouncementBannerNoticeId");
        jsonObjectBuilder2.put("tags", jsonArrayBuilder2.build());
        JsonElementBuildersKt.put(jsonObjectBuilder2, JwtUtilsKt.DID_METHOD_KEY, strKWHzl);
        JsonElementBuildersKt.put(jsonObjectBuilder2, "groupNoticeId", java.lang.Long.valueOf(j));
        pUU.KWHzl("GroupAnnouncementBannerPreference", jsonObjectBuilder2.build().toString());
        if (strKWHzl != null) {
            SPUtils.commit(strKWHzl, java.lang.Long.valueOf(j2));
        }
        if (strEZpvd != null) {
            SPUtils.commit(strEZpvd, java.lang.Long.valueOf(j));
        }
    }

    public final java.lang.Long AEQbTJ(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strKWHzl = KWHzl(str, j);
        java.lang.Long l = strKWHzl != null ? SPUtils.getLong(strKWHzl, -1L) : null;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, "getGroupAnnouncementBannerEditTime");
        Unit unit = Unit.INSTANCE;
        jsonObjectBuilder.put("tags", jsonArrayBuilder.build());
        JsonElementBuildersKt.put(jsonObjectBuilder, JwtUtilsKt.DID_METHOD_KEY, strKWHzl);
        JsonElementBuildersKt.put(jsonObjectBuilder, "editTime", l);
        pUU.KWHzl("GroupAnnouncementBannerPreference", jsonObjectBuilder.build().toString());
        if (l == null || l.longValue() == -1) {
            return null;
        }
        return l;
    }

    public final java.lang.Long copydefault(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = EZpvd(str, j);
        java.lang.Long l = strEZpvd != null ? SPUtils.getLong(strEZpvd, -1L) : null;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, "setGroupAnnouncementBannerNoticeId");
        Unit unit = Unit.INSTANCE;
        jsonObjectBuilder.put("tags", jsonArrayBuilder.build());
        JsonElementBuildersKt.put(jsonObjectBuilder, JwtUtilsKt.DID_METHOD_KEY, strEZpvd);
        JsonElementBuildersKt.put(jsonObjectBuilder, "groupNoticeId", java.lang.Long.valueOf(j));
        pUU.KWHzl("GroupAnnouncementBannerPreference", jsonObjectBuilder.build().toString());
        if (l == null || l.longValue() == -1) {
            return null;
        }
        return l;
    }
}
