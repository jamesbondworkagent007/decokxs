package o;

import android.content.pm.PackageManager;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public class QT implements NL<android.net.Uri, android.graphics.drawable.Drawable> {
    public static final NJ<Resources.Theme> AEQbTJ = NJ.OLrzqt("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    public final android.content.Context KWHzl;

    public QT(android.content.Context context) {
        this.KWHzl = context.getApplicationContext();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
    @Override // o.NL
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@androidx.annotation.NonNull android.net.Uri uri, @androidx.annotation.NonNull NM nm) {
        java.lang.String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
    @Override // o.NL
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public OC<android.graphics.drawable.Drawable> copydefault(@androidx.annotation.NonNull android.net.Uri uri, int i, int i2, @androidx.annotation.NonNull NM nm) {
        android.graphics.drawable.Drawable drawableAEQbTJ;
        java.lang.String authority = uri.getAuthority();
        if (android.text.TextUtils.isEmpty(authority)) {
            throw new java.lang.IllegalStateException("Package name for " + uri + " is null or empty");
        }
        android.content.Context contextKWHzl = KWHzl(uri, authority);
        int iKWHzl = KWHzl(contextKWHzl, uri);
        Resources.Theme theme = ((java.lang.String) SE.OLrzqt(authority)).equals(this.KWHzl.getPackageName()) ? (Resources.Theme) nm.OLrzqt(AEQbTJ) : null;
        if (theme == null) {
            drawableAEQbTJ = QM.KWHzl(this.KWHzl, contextKWHzl, iKWHzl);
        } else {
            drawableAEQbTJ = QM.AEQbTJ(this.KWHzl, iKWHzl, theme);
        }
        return QS.KWHzl(drawableAEQbTJ);
    }

    public final android.content.Context KWHzl(android.net.Uri uri, @androidx.annotation.NonNull java.lang.String str) {
        if (str.equals(this.KWHzl.getPackageName())) {
            return this.KWHzl;
        }
        try {
            return this.KWHzl.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.KWHzl.getPackageName())) {
                return this.KWHzl;
            }
            throw new java.lang.IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    public final int KWHzl(android.content.Context context, android.net.Uri uri) {
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return copydefault(context, uri);
        }
        if (pathSegments.size() == 1) {
            return KWHzl(uri);
        }
        throw new java.lang.IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    public final int copydefault(android.content.Context context, android.net.Uri uri) {
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        java.lang.String authority = uri.getAuthority();
        java.lang.String str = pathSegments.get(0);
        java.lang.String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = android.content.res.Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new java.lang.IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    public final int KWHzl(android.net.Uri uri) {
        try {
            return java.lang.Integer.parseInt(uri.getPathSegments().get(0));
        } catch (java.lang.NumberFormatException e) {
            throw new java.lang.IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }
}
