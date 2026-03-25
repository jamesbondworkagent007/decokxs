package o;

import android.net.Uri;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.bumptech.glide.Glide;
import com.okinc.uilab.item.OKRegularCell;
import java.net.MalformedURLException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55297xhL {
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.xhO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C55297xhL.AEQbTJ());
        }
    });
    public static final java.util.List<java.lang.String> OLrzqt = yDY.gEmmrt("static.coinall.ltd", "static.okx.com", "okg-pub-hk.oss-cn-hongkong.aliyuncs.com");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.List<java.lang.String> copydefault() {
        return OLrzqt;
    }

    public static final void KWHzl(@NotNull OKRegularCell oKRegularCell, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(oKRegularCell, "");
        if (obj != null) {
            android.widget.ImageView imageViewOLrzqt = oKRegularCell.OLrzqt();
            if (!(obj instanceof java.lang.Integer)) {
                Glide.AEQbTJ(imageViewOLrzqt.getContext().getApplicationContext()).KWHzl(obj).OLrzqt(new ActionBar(imageViewOLrzqt));
            } else {
                imageViewOLrzqt.setVisibility(0);
                imageViewOLrzqt.setImageResource(((java.lang.Number) obj).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: o.xhL$ActionBar */
    public static final class ActionBar extends C5452Sg {
        public ActionBar(android.widget.ImageView imageView) {
            super(imageView);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.AbstractC5458Sm, o.AbstractC5453Sh, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            super.AEQbTJ(drawable);
            ((android.widget.ImageView) this.gEmmrt).setVisibility(8);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
        @Override // o.C5452Sg, o.AbstractC5458Sm
        /* JADX INFO: renamed from: copydefault */
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            super.AEQbTJ(drawable);
            ((android.widget.ImageView) this.gEmmrt).setVisibility(0);
        }
    }

    public static /* synthetic */ C5335Nt load$default(ComponentCallbacks2C5333Nr componentCallbacks2C5333Nr, java.lang.Object obj, java.lang.String str, int i, int i2, int i3, java.lang.Object obj2) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 4) != 0) {
            i = -1;
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        return AEQbTJ(componentCallbacks2C5333Nr, obj, str, i, i2);
    }

    public static final C5335Nt<android.graphics.drawable.Drawable> AEQbTJ(@NotNull ComponentCallbacks2C5333Nr componentCallbacks2C5333Nr, @NotNull java.lang.Object obj, java.lang.String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(componentCallbacks2C5333Nr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if (str == null || str.length() == 0) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtKWHzl = componentCallbacks2C5333Nr.KWHzl(obj);
            Intrinsics.checkNotNullExpressionValue(c5335NtKWHzl, "");
            return c5335NtKWHzl;
        }
        if (AEQbTJ(obj) != null) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = componentCallbacks2C5333Nr.EZpvd(KWHzl((java.lang.String) obj, str, i, i2));
            Intrinsics.checkNotNullExpressionValue(c5335NtEZpvd, "");
            return c5335NtEZpvd;
        }
        C5335Nt<android.graphics.drawable.Drawable> c5335NtKWHzl2 = componentCallbacks2C5333Nr.KWHzl(obj);
        Intrinsics.checkNotNullExpressionValue(c5335NtKWHzl2, "");
        return c5335NtKWHzl2;
    }

    public static /* synthetic */ java.lang.String generateCropUrl$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = null;
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        return KWHzl(str, i, i2);
    }

    public static final java.lang.String KWHzl(java.lang.String str, int i, int i2) {
        return KWHzl(str, "lfit", i, i2);
    }

    public static final int EZpvd() {
        return ((java.lang.Number) KWHzl.getValue()).intValue();
    }

    public static final int AEQbTJ() {
        return (int) C55298xhM.dp$default(300, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    public static /* synthetic */ java.lang.String generateCropUrl$default(java.lang.String str, java.lang.String str2, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = null;
        }
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        if ((i3 & 4) != 0) {
            i = -1;
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        return KWHzl(str, str2, i, i2);
    }

    public static final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, int i, int i2) {
        java.net.URL urlAEQbTJ = AEQbTJ(str);
        if (urlAEQbTJ == null) {
            return str;
        }
        if (!OLrzqt.contains(urlAEQbTJ.getHost()) && !C52762wXk.AEQbTJ.EZpvd().invoke(str).booleanValue()) {
            return str;
        }
        android.net.Uri uri = android.net.Uri.parse(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Set<java.lang.String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
        for (java.lang.String str3 : queryParameterNames) {
            linkedHashMap.put(str3, uri.getQueryParameter(str3));
        }
        linkedHashMap.remove(RequestParameters.X_OSS_PROCESS);
        int iEZpvd = (i <= 0 || i >= EZpvd()) ? i : EZpvd();
        int iEZpvd2 = (i2 <= 0 || i2 >= EZpvd()) ? i2 : EZpvd();
        boolean z = i <= 0 || i >= EZpvd() || i2 <= 0 || i2 >= EZpvd();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str2 == null) {
            str2 = "";
        }
        sb.append("image/resize,m_" + str2);
        if (iEZpvd > 0) {
            sb.append(",h_" + iEZpvd);
        }
        if (iEZpvd2 > 0) {
            sb.append(",w_" + iEZpvd2);
        }
        if (z) {
            sb.append("/format,webp");
        }
        sb.append("/ignore-error,1");
        java.lang.String string = sb.toString();
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderClearQuery.appendQueryParameter((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        builderClearQuery.appendQueryParameter(RequestParameters.X_OSS_PROCESS, string);
        return URLDecoder.decode(builderClearQuery.build().toString(), com.google.android.exoplayer2.C.UTF8_NAME);
    }

    public static final java.net.URL AEQbTJ(java.lang.Object obj) {
        if (obj != null && (obj instanceof java.lang.String)) {
            try {
                return new java.net.URL((java.lang.String) obj);
            } catch (MalformedURLException unused) {
            }
        }
        return null;
    }
}
