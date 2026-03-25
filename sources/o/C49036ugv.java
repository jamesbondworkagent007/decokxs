package o;

import com.okinc.share.api.params.BaseShareParams;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.mln.OKShareCustomParamsTransform;
import com.okinc.share.platforms.SharePlatform;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ugv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49036ugv implements InterfaceC48906ueX {
    public final OKShareCustomParamsTransform copydefault;

    public C49036ugv(@NotNull OKShareCustomParamsTransform oKShareCustomParamsTransform) {
        Intrinsics.checkNotNullParameter(oKShareCustomParamsTransform, "");
        this.copydefault = oKShareCustomParamsTransform;
    }

    @Override // o.InterfaceC48906ueX
    public <T extends IShareParams> T copydefault(@NotNull T t, @NotNull SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        this.copydefault.copydefault(sharePlatform.getPlatformName());
        java.lang.String strCopydefault = this.copydefault.copydefault();
        java.util.Map<java.lang.String, java.lang.Object> mapOLrzqt = this.copydefault.OLrzqt();
        if (t instanceof ImageShareParams) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
                ((ImageShareParams) t).setPendingShareImagePath(strCopydefault);
            }
            ((BaseShareParams) t).getExtras().putAll(OLrzqt(mapOLrzqt));
        }
        return t;
    }

    public final android.os.Bundle OLrzqt(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (map != null) {
            for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value instanceof java.lang.String) {
                    bundle.putString(key, (java.lang.String) value);
                } else if (value instanceof java.lang.Boolean) {
                    bundle.putBoolean(key, ((java.lang.Boolean) value).booleanValue());
                } else if (value instanceof java.lang.Integer) {
                    bundle.putInt(key, ((java.lang.Number) value).intValue());
                } else if (value instanceof java.lang.Long) {
                    bundle.putLong(key, ((java.lang.Number) value).longValue());
                } else if (value instanceof java.lang.Double) {
                    bundle.putDouble(key, ((java.lang.Number) value).doubleValue());
                } else {
                    pUU.copydefault("LuaPendShareParamTransformer", "resolveExtrasParams ->unknown params type->key:" + key + "value:" + value);
                }
            }
        }
        return bundle;
    }
}
