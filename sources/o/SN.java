package o;

import android.graphics.BitmapFactory;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.camera.video.AudioStats;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.immomo.mls.fun.ud.UDImageInfo;
import java.util.Stack;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes2.dex */
public class SN {
    public static java.util.HashSet<java.lang.String> AEQbTJ;
    public Stack<SVG.PackageManager> AYXKKw;
    public Stack<Dialog> AhwBna;
    public float EZpvd;
    public android.graphics.Canvas KWHzl;
    public SVG OLrzqt;
    public Stack<android.graphics.Matrix> copydefault;
    public Dialog gEmmrt;
    public CSSParser.SharedElementCallback valueOf = null;

    public static int AEQbTJ(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    public static void KWHzl(java.lang.String str, java.lang.Object... objArr) {
    }

    public final float copydefault(float f, float f2, float f3, float f4) {
        return (f * f3) + (f2 * f4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float valueOf() {
        return this.EZpvd;
    }

    public class Dialog {
        public boolean AEQbTJ;
        public SVG.Activity AhwBna;
        public boolean EZpvd;
        public android.graphics.Paint KWHzl;
        public boolean OLrzqt;
        public android.graphics.Paint copydefault;
        public SVG.Activity gEmmrt;
        public SVG.Style valueOf;

        public Dialog() {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.KWHzl = paint;
            paint.setFlags(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256);
            this.KWHzl.setHinting(0);
            this.KWHzl.setStyle(Paint.Style.FILL);
            android.graphics.Paint paint2 = this.KWHzl;
            android.graphics.Typeface typeface = android.graphics.Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            android.graphics.Paint paint3 = new android.graphics.Paint();
            this.copydefault = paint3;
            paint3.setFlags(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256);
            this.copydefault.setHinting(0);
            this.copydefault.setStyle(Paint.Style.STROKE);
            this.copydefault.setTypeface(typeface);
            this.valueOf = SVG.Style.OLrzqt();
        }

        public Dialog(Dialog dialog) {
            this.OLrzqt = dialog.OLrzqt;
            this.EZpvd = dialog.EZpvd;
            this.KWHzl = new android.graphics.Paint(dialog.KWHzl);
            this.copydefault = new android.graphics.Paint(dialog.copydefault);
            SVG.Activity activity = dialog.AhwBna;
            if (activity != null) {
                this.AhwBna = new SVG.Activity(activity);
            }
            SVG.Activity activity2 = dialog.gEmmrt;
            if (activity2 != null) {
                this.gEmmrt = new SVG.Activity(activity2);
            }
            this.AEQbTJ = dialog.AEQbTJ;
            try {
                this.valueOf = (SVG.Style) dialog.valueOf.clone();
            } catch (java.lang.CloneNotSupportedException unused) {
                this.valueOf = SVG.Style.OLrzqt();
            }
        }
    }

    public final void AkhnZx() {
        this.gEmmrt = new Dialog();
        this.AhwBna = new Stack<>();
        copydefault(this.gEmmrt, SVG.Style.OLrzqt());
        Dialog dialog = this.gEmmrt;
        dialog.AhwBna = null;
        dialog.AEQbTJ = false;
        this.AhwBna.push(new Dialog(dialog));
        this.copydefault = new Stack<>();
        this.AYXKKw = new Stack<>();
    }

    public SN(android.graphics.Canvas canvas, float f) {
        this.KWHzl = canvas;
        this.EZpvd = f;
    }

    public float OLrzqt() {
        return this.gEmmrt.KWHzl.getTextSize();
    }

    public float djBIcL() {
        return this.gEmmrt.KWHzl.getTextSize() / 2.0f;
    }

    public SVG.Activity gEmmrt() {
        Dialog dialog = this.gEmmrt;
        SVG.Activity activity = dialog.gEmmrt;
        return activity != null ? activity : dialog.AhwBna;
    }

    public void copydefault(SVG svg, SM sm) {
        SVG.Activity activity;
        PreserveAspectRatio preserveAspectRatio;
        if (sm == null) {
            throw new java.lang.NullPointerException("renderOptions shouldn't be null");
        }
        this.OLrzqt = svg;
        SVG.SharedPreferences sharedPreferencesEZpvd = svg.EZpvd();
        if (sharedPreferencesEZpvd == null) {
            AYXKKw("Nothing to render. Document is empty.", new java.lang.Object[0]);
            return;
        }
        if (sm.copydefault()) {
            SVG.AssetManager assetManagerOLrzqt = this.OLrzqt.OLrzqt(sm.EZpvd);
            if (assetManagerOLrzqt == null || !(assetManagerOLrzqt instanceof SVG.Drawable)) {
                java.lang.String.format("View element with id \"%s\" not found.", sm.EZpvd);
                return;
            }
            SVG.Drawable drawable = (SVG.Drawable) assetManagerOLrzqt;
            activity = drawable.getNewProxyInstance;
            if (activity == null) {
                java.lang.String.format("View element with id \"%s\" is missing a viewBox attribute.", sm.EZpvd);
                return;
            }
            preserveAspectRatio = drawable.hDKMBd;
        } else {
            activity = sm.KWHzl() ? sm.OLrzqt : sharedPreferencesEZpvd.getNewProxyInstance;
            preserveAspectRatio = sm.AEQbTJ() ? sm.KWHzl : sharedPreferencesEZpvd.hDKMBd;
        }
        if (sm.EZpvd()) {
            svg.AEQbTJ(sm.copydefault);
        }
        if (sm.OLrzqt()) {
            CSSParser.SharedElementCallback sharedElementCallback = new CSSParser.SharedElementCallback();
            this.valueOf = sharedElementCallback;
            sharedElementCallback.EZpvd = svg.OLrzqt(sm.AEQbTJ);
        }
        AkhnZx();
        EZpvd((SVG.Resources) sharedPreferencesEZpvd);
        isConnected();
        SVG.Activity activity2 = new SVG.Activity(sm.gEmmrt);
        SVG.PictureInPictureParams pictureInPictureParams = sharedPreferencesEZpvd.AEQbTJ;
        if (pictureInPictureParams != null) {
            activity2.AEQbTJ = pictureInPictureParams.KWHzl(this, activity2.AEQbTJ);
        }
        SVG.PictureInPictureParams pictureInPictureParams2 = sharedPreferencesEZpvd.KWHzl;
        if (pictureInPictureParams2 != null) {
            activity2.KWHzl = pictureInPictureParams2.KWHzl(this, activity2.KWHzl);
        }
        copydefault(sharedPreferencesEZpvd, activity2, activity, preserveAspectRatio);
        fetchVPNInfo();
        if (sm.EZpvd()) {
            svg.KWHzl();
        }
    }

    public final void KWHzl(SVG.Resources resources) {
        if (resources instanceof SVG.ComponentName) {
            return;
        }
        isConnected();
        EZpvd(resources);
        if (resources instanceof SVG.SharedPreferences) {
            KWHzl((SVG.SharedPreferences) resources);
        } else if (resources instanceof SVG.MediaController) {
            copydefault((SVG.MediaController) resources);
        } else if (resources instanceof SVG.Bitmap) {
            AEQbTJ((SVG.Bitmap) resources);
        } else if (resources instanceof SVG.VoiceInteractor) {
            copydefault((SVG.VoiceInteractor) resources);
        } else if (resources instanceof SVG.AssistContent) {
            OLrzqt((SVG.AssistContent) resources);
        } else if (resources instanceof SVG.BroadcastReceiver) {
            EZpvd((SVG.BroadcastReceiver) resources);
        } else if (resources instanceof SVG.IntentSender) {
            OLrzqt((SVG.IntentSender) resources);
        } else if (resources instanceof SVG.Application) {
            KWHzl((SVG.Application) resources);
        } else if (resources instanceof SVG.LoaderManager) {
            KWHzl((SVG.LoaderManager) resources);
        } else if (resources instanceof SVG.TaskStackBuilder) {
            copydefault((SVG.TaskStackBuilder) resources);
        } else if (resources instanceof SVG.ContextWrapper) {
            AEQbTJ((SVG.ContextWrapper) resources);
        } else if (resources instanceof SVG.ContentResolver) {
            AEQbTJ((SVG.ContentResolver) resources);
        } else if (resources instanceof SVG.Mode) {
            EZpvd((SVG.Mode) resources);
        }
        fetchVPNInfo();
    }

    public final void copydefault(SVG.PackageManager packageManager, boolean z) {
        if (z) {
            KWHzl(packageManager);
        }
        java.util.Iterator<SVG.Resources> it = packageManager.AEQbTJ().iterator();
        while (it.hasNext()) {
            KWHzl(it.next());
        }
        if (z) {
            AhwBna();
        }
    }

    public final void isConnected() {
        this.KWHzl.save();
        this.AhwBna.push(this.gEmmrt);
        this.gEmmrt = new Dialog(this.gEmmrt);
    }

    public final void fetchVPNInfo() {
        this.KWHzl.restore();
        this.gEmmrt = this.AhwBna.pop();
    }

    public final void KWHzl(SVG.PackageManager packageManager) {
        this.AYXKKw.push(packageManager);
        this.copydefault.push(this.KWHzl.getMatrix());
    }

    public final void AhwBna() {
        this.AYXKKw.pop();
        this.copydefault.pop();
    }

    public final void KWHzl(Dialog dialog, SVG.AssetManager assetManager) {
        dialog.valueOf.OLrzqt(assetManager.iwGUEr == null);
        SVG.Style style = assetManager.AuCTel;
        if (style != null) {
            copydefault(dialog, style);
        }
        if (this.OLrzqt.AEQbTJ()) {
            for (CSSParser.VoiceInteractor voiceInteractor : this.OLrzqt.OLrzqt()) {
                if (CSSParser.copydefault(this.valueOf, voiceInteractor.AEQbTJ, assetManager)) {
                    copydefault(dialog, voiceInteractor.copydefault);
                }
            }
        }
        SVG.Style style2 = assetManager.uzCIH;
        if (style2 != null) {
            copydefault(dialog, style2);
        }
    }

    public final void EZpvd(SVG.Resources resources) {
        java.lang.Boolean bool;
        if ((resources instanceof SVG.AssetManager) && (bool = ((SVG.AssetManager) resources).fARcdN) != null) {
            this.gEmmrt.AEQbTJ = bool.booleanValue();
        }
    }

    public final void EZpvd(SVG.PackageItemInfo packageItemInfo, android.graphics.Path path) {
        SVG.TypedArray typedArray = this.gEmmrt.valueOf.djBIcL;
        if (typedArray instanceof SVG.ComponentCallbacks2) {
            SVG.Resources resourcesKWHzl = this.OLrzqt.KWHzl(((SVG.ComponentCallbacks2) typedArray).AEQbTJ);
            if (resourcesKWHzl instanceof SVG.DialogInterface) {
                AEQbTJ(packageItemInfo, path, (SVG.DialogInterface) resourcesKWHzl);
                return;
            }
        }
        this.KWHzl.drawPath(path, this.gEmmrt.KWHzl);
    }

    public final void KWHzl(android.graphics.Path path) {
        Dialog dialog = this.gEmmrt;
        if (dialog.valueOf.DTwDnp == SVG.Style.VectorEffect.NonScalingStroke) {
            android.graphics.Matrix matrix = this.KWHzl.getMatrix();
            android.graphics.Path path2 = new android.graphics.Path();
            path.transform(matrix, path2);
            this.KWHzl.setMatrix(new android.graphics.Matrix());
            Shader shader = this.gEmmrt.copydefault.getShader();
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                android.graphics.Matrix matrix3 = new android.graphics.Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.KWHzl.drawPath(path2, this.gEmmrt.copydefault);
            this.KWHzl.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.KWHzl.drawPath(path, dialog.copydefault);
    }

    public static void AYXKKw(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String.format(str, objArr);
    }

    public static void OLrzqt(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String.format(str, objArr);
    }

    public final void KWHzl(SVG.SharedPreferences sharedPreferences) {
        copydefault(sharedPreferences, copydefault(sharedPreferences.EZpvd, sharedPreferences.copydefault, sharedPreferences.AEQbTJ, sharedPreferences.KWHzl), sharedPreferences.getNewProxyInstance, sharedPreferences.hDKMBd);
    }

    public final void EZpvd(SVG.SharedPreferences sharedPreferences, SVG.Activity activity) {
        copydefault(sharedPreferences, activity, sharedPreferences.getNewProxyInstance, sharedPreferences.hDKMBd);
    }

    public final void copydefault(SVG.SharedPreferences sharedPreferences, SVG.Activity activity, SVG.Activity activity2, PreserveAspectRatio preserveAspectRatio) {
        KWHzl("Svg render", new java.lang.Object[0]);
        if (activity.AEQbTJ == 0.0f || activity.KWHzl == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = sharedPreferences.hDKMBd) == null) {
            preserveAspectRatio = PreserveAspectRatio.AEQbTJ;
        }
        KWHzl(this.gEmmrt, sharedPreferences);
        if (EZpvd()) {
            Dialog dialog = this.gEmmrt;
            dialog.AhwBna = activity;
            if (!dialog.valueOf.ejfBZ.booleanValue()) {
                SVG.Activity activity3 = this.gEmmrt.AhwBna;
                KWHzl(activity3.copydefault, activity3.OLrzqt, activity3.AEQbTJ, activity3.KWHzl);
            }
            copydefault(sharedPreferences, this.gEmmrt.AhwBna);
            if (activity2 != null) {
                this.KWHzl.concat(EZpvd(this.gEmmrt.AhwBna, activity2, preserveAspectRatio));
                this.gEmmrt.gEmmrt = sharedPreferences.getNewProxyInstance;
            } else {
                android.graphics.Canvas canvas = this.KWHzl;
                SVG.Activity activity4 = this.gEmmrt.AhwBna;
                canvas.translate(activity4.copydefault, activity4.OLrzqt);
            }
            boolean zValues = values();
            fIwbmz();
            copydefault((SVG.PackageManager) sharedPreferences, true);
            if (zValues) {
                OLrzqt(sharedPreferences);
            }
            copydefault((SVG.PackageItemInfo) sharedPreferences);
        }
    }

    public final SVG.Activity copydefault(SVG.PictureInPictureParams pictureInPictureParams, SVG.PictureInPictureParams pictureInPictureParams2, SVG.PictureInPictureParams pictureInPictureParams3, SVG.PictureInPictureParams pictureInPictureParams4) {
        float fCopydefault = pictureInPictureParams != null ? pictureInPictureParams.copydefault(this) : 0.0f;
        float fOLrzqt = pictureInPictureParams2 != null ? pictureInPictureParams2.OLrzqt(this) : 0.0f;
        SVG.Activity activityGEmmrt = gEmmrt();
        return new SVG.Activity(fCopydefault, fOLrzqt, pictureInPictureParams3 != null ? pictureInPictureParams3.copydefault(this) : activityGEmmrt.AEQbTJ, pictureInPictureParams4 != null ? pictureInPictureParams4.OLrzqt(this) : activityGEmmrt.KWHzl);
    }

    public final void copydefault(SVG.VoiceInteractor voiceInteractor) {
        KWHzl("Group render", new java.lang.Object[0]);
        KWHzl(this.gEmmrt, voiceInteractor);
        if (EZpvd()) {
            android.graphics.Matrix matrix = voiceInteractor.EZpvd;
            if (matrix != null) {
                this.KWHzl.concat(matrix);
            }
            AEQbTJ(voiceInteractor);
            boolean zValues = values();
            copydefault((SVG.PackageManager) voiceInteractor, true);
            if (zValues) {
                OLrzqt(voiceInteractor);
            }
            copydefault((SVG.PackageItemInfo) voiceInteractor);
        }
    }

    public final void copydefault(SVG.PackageItemInfo packageItemInfo) {
        if (packageItemInfo.iwGUEr == null || packageItemInfo.ejfBZ == null) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (this.copydefault.peek().invert(matrix)) {
            SVG.Activity activity = packageItemInfo.ejfBZ;
            float f = activity.copydefault;
            float f2 = activity.OLrzqt;
            float fKWHzl = activity.KWHzl();
            SVG.Activity activity2 = packageItemInfo.ejfBZ;
            float f3 = activity2.OLrzqt;
            float fKWHzl2 = activity2.KWHzl();
            float fEZpvd = packageItemInfo.ejfBZ.EZpvd();
            SVG.Activity activity3 = packageItemInfo.ejfBZ;
            float[] fArr = {f, f2, fKWHzl, f3, fKWHzl2, fEZpvd, activity3.copydefault, activity3.EZpvd()};
            matrix.preConcat(this.KWHzl.getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            SVG.PackageItemInfo packageItemInfo2 = (SVG.PackageItemInfo) this.AYXKKw.peek();
            SVG.Activity activity4 = packageItemInfo2.ejfBZ;
            if (activity4 == null) {
                packageItemInfo2.ejfBZ = SVG.Activity.AEQbTJ(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                activity4.OLrzqt(SVG.Activity.AEQbTJ(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    public final boolean values() {
        if (!DbNXlk()) {
            return false;
        }
        this.KWHzl.saveLayerAlpha(null, AEQbTJ(this.gEmmrt.valueOf.fJNWhG.floatValue()), 31);
        this.AhwBna.push(this.gEmmrt);
        Dialog dialog = new Dialog(this.gEmmrt);
        this.gEmmrt = dialog;
        java.lang.String str = dialog.valueOf.fIwbmz;
        if (str == null) {
            return true;
        }
        SVG.Resources resourcesKWHzl = this.OLrzqt.KWHzl(str);
        if (resourcesKWHzl != null && (resourcesKWHzl instanceof SVG.ClipData)) {
            return true;
        }
        OLrzqt("Mask reference '%s' not found", this.gEmmrt.valueOf.fIwbmz);
        this.gEmmrt.valueOf.fIwbmz = null;
        return true;
    }

    public final void OLrzqt(SVG.PackageItemInfo packageItemInfo) {
        EZpvd(packageItemInfo, packageItemInfo.ejfBZ);
    }

    public final void EZpvd(SVG.PackageItemInfo packageItemInfo, SVG.Activity activity) {
        if (this.gEmmrt.valueOf.fIwbmz != null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.KWHzl.saveLayer(null, paint, 31);
            android.graphics.Paint paint2 = new android.graphics.Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.KWHzl.saveLayer(null, paint2, 31);
            SVG.ClipData clipData = (SVG.ClipData) this.OLrzqt.KWHzl(this.gEmmrt.valueOf.fIwbmz);
            AEQbTJ(clipData, packageItemInfo, activity);
            this.KWHzl.restore();
            android.graphics.Paint paint3 = new android.graphics.Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.KWHzl.saveLayer(null, paint3, 31);
            AEQbTJ(clipData, packageItemInfo, activity);
            this.KWHzl.restore();
            this.KWHzl.restore();
        }
        fetchVPNInfo();
    }

    public final boolean DbNXlk() {
        return this.gEmmrt.valueOf.fJNWhG.floatValue() < 1.0f || this.gEmmrt.valueOf.fIwbmz != null;
    }

    public final void AEQbTJ(SVG.Bitmap bitmap) {
        KWHzl("Switch render", new java.lang.Object[0]);
        KWHzl(this.gEmmrt, bitmap);
        if (EZpvd()) {
            android.graphics.Matrix matrix = bitmap.EZpvd;
            if (matrix != null) {
                this.KWHzl.concat(matrix);
            }
            AEQbTJ((SVG.PackageItemInfo) bitmap);
            boolean zValues = values();
            KWHzl(bitmap);
            if (zValues) {
                OLrzqt(bitmap);
            }
            copydefault((SVG.PackageItemInfo) bitmap);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: com.caverock.androidsvg.SVG$Resources */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(SVG.Bitmap bitmap) {
        java.util.Set<java.lang.String> setValueOf;
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        SO soCopydefault = SVG.copydefault();
        for (SVG.Resources resources : bitmap.AEQbTJ()) {
            if (resources instanceof SVG.ServiceConnection) {
                SVG.ServiceConnection serviceConnection = (SVG.ServiceConnection) resources;
                if (serviceConnection.OLrzqt() == null && ((setValueOf = serviceConnection.valueOf()) == null || (!setValueOf.isEmpty() && setValueOf.contains(language)))) {
                    java.util.Set<java.lang.String> setKWHzl = serviceConnection.KWHzl();
                    if (setKWHzl != null) {
                        if (AEQbTJ == null) {
                            KWHzl();
                        }
                        if (setKWHzl.isEmpty() || !AEQbTJ.containsAll(setKWHzl)) {
                        }
                    }
                    java.util.Set<java.lang.String> setDjBIcL = serviceConnection.djBIcL();
                    if (setDjBIcL != null) {
                        if (!setDjBIcL.isEmpty() && soCopydefault != null) {
                            java.util.Iterator<java.lang.String> it = setDjBIcL.iterator();
                            while (it.hasNext()) {
                                if (!soCopydefault.KWHzl(it.next())) {
                                    break;
                                }
                            }
                        }
                    }
                    java.util.Set<java.lang.String> setCopydefault = serviceConnection.copydefault();
                    if (setCopydefault != null) {
                        if (!setCopydefault.isEmpty() && soCopydefault != null) {
                            java.util.Iterator<java.lang.String> it2 = setCopydefault.iterator();
                            while (it2.hasNext()) {
                                if (soCopydefault.KWHzl(it2.next(), this.gEmmrt.valueOf.isConnected.intValue(), java.lang.String.valueOf(this.gEmmrt.valueOf.values)) == null) {
                                    break;
                                }
                            }
                        }
                    }
                    KWHzl(resources);
                    return;
                }
            }
        }
    }

    public static void KWHzl() {
        synchronized (SN.class) {
            java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
            AEQbTJ = hashSet;
            hashSet.add("Structure");
            AEQbTJ.add("BasicStructure");
            AEQbTJ.add("ConditionalProcessing");
            AEQbTJ.add(UDImageInfo.LUA_CLASS_NAME);
            AEQbTJ.add("Style");
            AEQbTJ.add("ViewportAttribute");
            AEQbTJ.add("Shape");
            AEQbTJ.add("BasicText");
            AEQbTJ.add("PaintAttribute");
            AEQbTJ.add("BasicPaintAttribute");
            AEQbTJ.add("OpacityAttribute");
            AEQbTJ.add("BasicGraphicsAttribute");
            AEQbTJ.add("Marker");
            AEQbTJ.add("Gradient");
            AEQbTJ.add("Pattern");
            AEQbTJ.add("Clip");
            AEQbTJ.add("BasicClip");
            AEQbTJ.add("Mask");
            AEQbTJ.add("View");
        }
    }

    public final void copydefault(SVG.MediaController mediaController) {
        KWHzl("Use render", new java.lang.Object[0]);
        SVG.PictureInPictureParams pictureInPictureParams = mediaController.KWHzl;
        if (pictureInPictureParams == null || !pictureInPictureParams.copydefault()) {
            SVG.PictureInPictureParams pictureInPictureParams2 = mediaController.OLrzqt;
            if (pictureInPictureParams2 == null || !pictureInPictureParams2.copydefault()) {
                KWHzl(this.gEmmrt, mediaController);
                if (EZpvd()) {
                    SVG.Resources resourcesKWHzl = mediaController.getFieldNames.KWHzl(mediaController.AEQbTJ);
                    if (resourcesKWHzl == null) {
                        OLrzqt("Use reference '%s' not found", mediaController.AEQbTJ);
                        return;
                    }
                    android.graphics.Matrix matrix = mediaController.EZpvd;
                    if (matrix != null) {
                        this.KWHzl.concat(matrix);
                    }
                    SVG.PictureInPictureParams pictureInPictureParams3 = mediaController.copydefault;
                    float fCopydefault = pictureInPictureParams3 != null ? pictureInPictureParams3.copydefault(this) : 0.0f;
                    SVG.PictureInPictureParams pictureInPictureParams4 = mediaController.valueOf;
                    this.KWHzl.translate(fCopydefault, pictureInPictureParams4 != null ? pictureInPictureParams4.OLrzqt(this) : 0.0f);
                    AEQbTJ(mediaController);
                    boolean zValues = values();
                    KWHzl((SVG.PackageManager) mediaController);
                    if (resourcesKWHzl instanceof SVG.SharedPreferences) {
                        SVG.Activity activityCopydefault = copydefault((SVG.PictureInPictureParams) null, (SVG.PictureInPictureParams) null, mediaController.KWHzl, mediaController.OLrzqt);
                        isConnected();
                        EZpvd((SVG.SharedPreferences) resourcesKWHzl, activityCopydefault);
                        fetchVPNInfo();
                    } else if (resourcesKWHzl instanceof SVG.CursorFactory) {
                        SVG.PictureInPictureParams pictureInPictureParams5 = mediaController.KWHzl;
                        if (pictureInPictureParams5 == null) {
                            pictureInPictureParams5 = new SVG.PictureInPictureParams(100.0f, SVG.Unit.percent);
                        }
                        SVG.PictureInPictureParams pictureInPictureParams6 = mediaController.OLrzqt;
                        if (pictureInPictureParams6 == null) {
                            pictureInPictureParams6 = new SVG.PictureInPictureParams(100.0f, SVG.Unit.percent);
                        }
                        SVG.Activity activityCopydefault2 = copydefault((SVG.PictureInPictureParams) null, (SVG.PictureInPictureParams) null, pictureInPictureParams5, pictureInPictureParams6);
                        isConnected();
                        EZpvd((SVG.CursorFactory) resourcesKWHzl, activityCopydefault2);
                        fetchVPNInfo();
                    } else {
                        KWHzl(resourcesKWHzl);
                    }
                    AhwBna();
                    if (zValues) {
                        OLrzqt(mediaController);
                    }
                    copydefault((SVG.PackageItemInfo) mediaController);
                }
            }
        }
    }

    public final void EZpvd(SVG.BroadcastReceiver broadcastReceiver) {
        KWHzl("Path render", new java.lang.Object[0]);
        if (broadcastReceiver.KWHzl == null) {
            return;
        }
        KWHzl(this.gEmmrt, broadcastReceiver);
        if (EZpvd() && fJNWhG()) {
            Dialog dialog = this.gEmmrt;
            if (dialog.EZpvd || dialog.OLrzqt) {
                android.graphics.Matrix matrix = broadcastReceiver.AEQbTJ;
                if (matrix != null) {
                    this.KWHzl.concat(matrix);
                }
                android.graphics.Path pathOLrzqt = new ActionBar(broadcastReceiver.KWHzl).OLrzqt();
                if (broadcastReceiver.ejfBZ == null) {
                    broadcastReceiver.ejfBZ = OLrzqt(pathOLrzqt);
                }
                copydefault((SVG.PackageItemInfo) broadcastReceiver);
                EZpvd((SVG.PackageItemInfo) broadcastReceiver);
                AEQbTJ((SVG.PackageItemInfo) broadcastReceiver);
                boolean zValues = values();
                if (this.gEmmrt.OLrzqt) {
                    pathOLrzqt.setFillType(AYXKKw());
                    EZpvd(broadcastReceiver, pathOLrzqt);
                }
                if (this.gEmmrt.EZpvd) {
                    KWHzl(pathOLrzqt);
                }
                AEQbTJ((SVG.Fragment) broadcastReceiver);
                if (zValues) {
                    OLrzqt(broadcastReceiver);
                }
            }
        }
    }

    public final SVG.Activity OLrzqt(android.graphics.Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.Activity(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public final void OLrzqt(SVG.IntentSender intentSender) {
        KWHzl("Rect render", new java.lang.Object[0]);
        SVG.PictureInPictureParams pictureInPictureParams = intentSender.KWHzl;
        if (pictureInPictureParams == null || intentSender.EZpvd == null || pictureInPictureParams.copydefault() || intentSender.EZpvd.copydefault()) {
            return;
        }
        KWHzl(this.gEmmrt, intentSender);
        if (EZpvd() && fJNWhG()) {
            android.graphics.Matrix matrix = intentSender.AEQbTJ;
            if (matrix != null) {
                this.KWHzl.concat(matrix);
            }
            android.graphics.Path pathAEQbTJ = AEQbTJ(intentSender);
            copydefault((SVG.PackageItemInfo) intentSender);
            EZpvd((SVG.PackageItemInfo) intentSender);
            AEQbTJ((SVG.PackageItemInfo) intentSender);
            boolean zValues = values();
            if (this.gEmmrt.OLrzqt) {
                EZpvd(intentSender, pathAEQbTJ);
            }
            if (this.gEmmrt.EZpvd) {
                KWHzl(pathAEQbTJ);
            }
            if (zValues) {
                OLrzqt((SVG.PackageItemInfo) intentSender);
            }
        }
    }

    public final void KWHzl(SVG.Application application) {
        KWHzl("Circle render", new java.lang.Object[0]);
        SVG.PictureInPictureParams pictureInPictureParams = application.KWHzl;
        if (pictureInPictureParams == null || pictureInPictureParams.copydefault()) {
            return;
        }
        KWHzl(this.gEmmrt, application);
        if (EZpvd() && fJNWhG()) {
            android.graphics.Matrix matrix = application.AEQbTJ;
            if (matrix != null) {
                this.KWHzl.concat(matrix);
            }
            android.graphics.Path pathAEQbTJ = AEQbTJ(application);
            copydefault((SVG.PackageItemInfo) application);
            EZpvd((SVG.PackageItemInfo) application);
            AEQbTJ((SVG.PackageItemInfo) application);
            boolean zValues = values();
            if (this.gEmmrt.OLrzqt) {
                EZpvd(application, pathAEQbTJ);
            }
            if (this.gEmmrt.EZpvd) {
                KWHzl(pathAEQbTJ);
            }
            if (zValues) {
                OLrzqt(application);
            }
        }
    }

    public final void KWHzl(SVG.LoaderManager loaderManager) {
        KWHzl("Ellipse render", new java.lang.Object[0]);
        SVG.PictureInPictureParams pictureInPictureParams = loaderManager.KWHzl;
        if (pictureInPictureParams == null || loaderManager.EZpvd == null || pictureInPictureParams.copydefault() || loaderManager.EZpvd.copydefault()) {
            return;
        }
        KWHzl(this.gEmmrt, loaderManager);
        if (EZpvd() && fJNWhG()) {
            android.graphics.Matrix matrix = loaderManager.AEQbTJ;
            if (matrix != null) {
                this.KWHzl.concat(matrix);
            }
            android.graphics.Path pathOLrzqt = OLrzqt(loaderManager);
            copydefault((SVG.PackageItemInfo) loaderManager);
            EZpvd((SVG.PackageItemInfo) loaderManager);
            AEQbTJ((SVG.PackageItemInfo) loaderManager);
            boolean zValues = values();
            if (this.gEmmrt.OLrzqt) {
                EZpvd(loaderManager, pathOLrzqt);
            }
            if (this.gEmmrt.EZpvd) {
                KWHzl(pathOLrzqt);
            }
            if (zValues) {
                OLrzqt((SVG.PackageItemInfo) loaderManager);
            }
        }
    }

    public final void copydefault(SVG.TaskStackBuilder taskStackBuilder) {
        KWHzl("Line render", new java.lang.Object[0]);
        KWHzl(this.gEmmrt, taskStackBuilder);
        if (EZpvd() && fJNWhG() && this.gEmmrt.EZpvd) {
            android.graphics.Matrix matrix = taskStackBuilder.AEQbTJ;
            if (matrix != null) {
                this.KWHzl.concat(matrix);
            }
            android.graphics.Path pathEZpvd = EZpvd(taskStackBuilder);
            copydefault((SVG.PackageItemInfo) taskStackBuilder);
            EZpvd((SVG.PackageItemInfo) taskStackBuilder);
            AEQbTJ((SVG.PackageItemInfo) taskStackBuilder);
            boolean zValues = values();
            KWHzl(pathEZpvd);
            AEQbTJ((SVG.Fragment) taskStackBuilder);
            if (zValues) {
                OLrzqt((SVG.PackageItemInfo) taskStackBuilder);
            }
        }
    }

    public final java.util.List<TaskDescription> OLrzqt(SVG.TaskStackBuilder taskStackBuilder) {
        SVG.PictureInPictureParams pictureInPictureParams = taskStackBuilder.EZpvd;
        float fCopydefault = pictureInPictureParams != null ? pictureInPictureParams.copydefault(this) : 0.0f;
        SVG.PictureInPictureParams pictureInPictureParams2 = taskStackBuilder.OLrzqt;
        float fOLrzqt = pictureInPictureParams2 != null ? pictureInPictureParams2.OLrzqt(this) : 0.0f;
        SVG.PictureInPictureParams pictureInPictureParams3 = taskStackBuilder.KWHzl;
        float fCopydefault2 = pictureInPictureParams3 != null ? pictureInPictureParams3.copydefault(this) : 0.0f;
        SVG.PictureInPictureParams pictureInPictureParams4 = taskStackBuilder.copydefault;
        float fOLrzqt2 = pictureInPictureParams4 != null ? pictureInPictureParams4.OLrzqt(this) : 0.0f;
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        float f = fCopydefault2 - fCopydefault;
        float f2 = fOLrzqt2 - fOLrzqt;
        arrayList.add(new TaskDescription(fCopydefault, fOLrzqt, f, f2));
        arrayList.add(new TaskDescription(fCopydefault2, fOLrzqt2, f, f2));
        return arrayList;
    }

    public final void AEQbTJ(SVG.ContentResolver contentResolver) {
        KWHzl("PolyLine render", new java.lang.Object[0]);
        KWHzl(this.gEmmrt, contentResolver);
        if (EZpvd() && fJNWhG()) {
            Dialog dialog = this.gEmmrt;
            if (dialog.EZpvd || dialog.OLrzqt) {
                android.graphics.Matrix matrix = contentResolver.AEQbTJ;
                if (matrix != null) {
                    this.KWHzl.concat(matrix);
                }
                if (contentResolver.KWHzl.length < 2) {
                    return;
                }
                android.graphics.Path pathCopydefault = copydefault(contentResolver);
                copydefault((SVG.PackageItemInfo) contentResolver);
                pathCopydefault.setFillType(AYXKKw());
                EZpvd((SVG.PackageItemInfo) contentResolver);
                AEQbTJ((SVG.PackageItemInfo) contentResolver);
                boolean zValues = values();
                if (this.gEmmrt.OLrzqt) {
                    EZpvd(contentResolver, pathCopydefault);
                }
                if (this.gEmmrt.EZpvd) {
                    KWHzl(pathCopydefault);
                }
                AEQbTJ((SVG.Fragment) contentResolver);
                if (zValues) {
                    OLrzqt((SVG.PackageItemInfo) contentResolver);
                }
            }
        }
    }

    public final java.util.List<TaskDescription> OLrzqt(SVG.ContentResolver contentResolver) {
        int length = contentResolver.KWHzl.length;
        int i = 2;
        if (length < 2) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float[] fArr = contentResolver.KWHzl;
        TaskDescription taskDescription = new TaskDescription(fArr[0], fArr[1], 0.0f, 0.0f);
        float f = 0.0f;
        float f2 = 0.0f;
        while (i < length) {
            float[] fArr2 = contentResolver.KWHzl;
            float f3 = fArr2[i];
            float f4 = fArr2[i + 1];
            taskDescription.AEQbTJ(f3, f4);
            arrayList.add(taskDescription);
            TaskDescription taskDescription2 = new TaskDescription(f3, f4, f3 - taskDescription.copydefault, f4 - taskDescription.djBIcL);
            i += 2;
            f2 = f4;
            f = f3;
            taskDescription = taskDescription2;
        }
        if (contentResolver instanceof SVG.ContextWrapper) {
            float[] fArr3 = contentResolver.KWHzl;
            float f5 = fArr3[0];
            if (f != f5) {
                float f6 = fArr3[1];
                if (f2 != f6) {
                    taskDescription.AEQbTJ(f5, f6);
                    arrayList.add(taskDescription);
                    TaskDescription taskDescription3 = new TaskDescription(f5, f6, f5 - taskDescription.copydefault, f6 - taskDescription.djBIcL);
                    taskDescription3.KWHzl((TaskDescription) arrayList.get(0));
                    arrayList.add(taskDescription3);
                    arrayList.set(0, taskDescription3);
                }
            }
        } else {
            arrayList.add(taskDescription);
        }
        return arrayList;
    }

    public final void AEQbTJ(SVG.ContextWrapper contextWrapper) {
        KWHzl("Polygon render", new java.lang.Object[0]);
        KWHzl(this.gEmmrt, contextWrapper);
        if (EZpvd() && fJNWhG()) {
            Dialog dialog = this.gEmmrt;
            if (dialog.EZpvd || dialog.OLrzqt) {
                android.graphics.Matrix matrix = contextWrapper.AEQbTJ;
                if (matrix != null) {
                    this.KWHzl.concat(matrix);
                }
                if (contextWrapper.KWHzl.length < 2) {
                    return;
                }
                android.graphics.Path pathCopydefault = copydefault((SVG.ContentResolver) contextWrapper);
                copydefault((SVG.PackageItemInfo) contextWrapper);
                EZpvd((SVG.PackageItemInfo) contextWrapper);
                AEQbTJ((SVG.PackageItemInfo) contextWrapper);
                boolean zValues = values();
                if (this.gEmmrt.OLrzqt) {
                    EZpvd(contextWrapper, pathCopydefault);
                }
                if (this.gEmmrt.EZpvd) {
                    KWHzl(pathCopydefault);
                }
                AEQbTJ((SVG.Fragment) contextWrapper);
                if (zValues) {
                    OLrzqt((SVG.PackageItemInfo) contextWrapper);
                }
            }
        }
    }

    public final void EZpvd(SVG.Mode mode) {
        KWHzl("Text render", new java.lang.Object[0]);
        KWHzl(this.gEmmrt, mode);
        if (EZpvd()) {
            android.graphics.Matrix matrix = mode.copydefault;
            if (matrix != null) {
                this.KWHzl.concat(matrix);
            }
            java.util.List<SVG.PictureInPictureParams> list = mode.KWHzl;
            float fOLrzqt = 0.0f;
            float fCopydefault = (list == null || list.size() == 0) ? 0.0f : mode.KWHzl.get(0).copydefault(this);
            java.util.List<SVG.PictureInPictureParams> list2 = mode.EZpvd;
            float fOLrzqt2 = (list2 == null || list2.size() == 0) ? 0.0f : mode.EZpvd.get(0).OLrzqt(this);
            java.util.List<SVG.PictureInPictureParams> list3 = mode.OLrzqt;
            float fCopydefault2 = (list3 == null || list3.size() == 0) ? 0.0f : mode.OLrzqt.get(0).copydefault(this);
            java.util.List<SVG.PictureInPictureParams> list4 = mode.AEQbTJ;
            if (list4 != null && list4.size() != 0) {
                fOLrzqt = mode.AEQbTJ.get(0).OLrzqt(this);
            }
            SVG.Style.TextAnchor textAnchorAEQbTJ = AEQbTJ();
            if (textAnchorAEQbTJ != SVG.Style.TextAnchor.Start) {
                float fOLrzqt3 = OLrzqt((SVG.Matrix) mode);
                if (textAnchorAEQbTJ == SVG.Style.TextAnchor.Middle) {
                    fOLrzqt3 /= 2.0f;
                }
                fCopydefault -= fOLrzqt3;
            }
            if (mode.ejfBZ == null) {
                PendingIntent pendingIntent = new PendingIntent(fCopydefault, fOLrzqt2);
                EZpvd(mode, pendingIntent);
                RectF rectF = pendingIntent.EZpvd;
                mode.ejfBZ = new SVG.Activity(rectF.left, rectF.top, rectF.width(), pendingIntent.EZpvd.height());
            }
            copydefault((SVG.PackageItemInfo) mode);
            EZpvd((SVG.PackageItemInfo) mode);
            AEQbTJ(mode);
            boolean zValues = values();
            EZpvd(mode, new StateListAnimator(fCopydefault + fCopydefault2, fOLrzqt2 + fOLrzqt));
            if (zValues) {
                OLrzqt((SVG.PackageItemInfo) mode);
            }
        }
    }

    public final SVG.Style.TextAnchor AEQbTJ() {
        SVG.Style.TextAnchor textAnchor;
        SVG.Style style = this.gEmmrt.valueOf;
        if (style.EZpvd == SVG.Style.TextDirection.LTR || (textAnchor = style.AxsJAY) == SVG.Style.TextAnchor.Middle) {
            return style.AxsJAY;
        }
        SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.Start;
        return textAnchor == textAnchor2 ? SVG.Style.TextAnchor.End : textAnchor2;
    }

    public class StateListAnimator extends FragmentManager {
        public float AEQbTJ;
        public float OLrzqt;

        public StateListAnimator(float f, float f2) {
            super(SN.this, null);
            this.AEQbTJ = f;
            this.OLrzqt = f2;
        }

        @Override // o.SN.FragmentManager
        public void copydefault(java.lang.String str) {
            SN.KWHzl("TextSequence render", new java.lang.Object[0]);
            if (SN.this.fJNWhG()) {
                if (SN.this.gEmmrt.OLrzqt) {
                    SN.this.KWHzl.drawText(str, this.AEQbTJ, this.OLrzqt, SN.this.gEmmrt.KWHzl);
                }
                if (SN.this.gEmmrt.EZpvd) {
                    SN.this.KWHzl.drawText(str, this.AEQbTJ, this.OLrzqt, SN.this.gEmmrt.copydefault);
                }
            }
            this.AEQbTJ += SN.this.gEmmrt.KWHzl.measureText(str);
        }
    }

    public abstract class FragmentManager {
        public abstract void copydefault(java.lang.String str);

        public boolean copydefault(SVG.Matrix matrix) {
            return true;
        }

        public FragmentManager() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SN) A[MD:(o.SN):void (m)] (LINE:1505) call: o.SN.FragmentManager.<init>(o.SN):void type: THIS */
        public /* synthetic */ FragmentManager(SN sn, AnonymousClass4 anonymousClass4) {
            this();
        }
    }

    public final void EZpvd(SVG.Matrix matrix, FragmentManager fragmentManager) {
        if (EZpvd()) {
            java.util.Iterator<SVG.Resources> it = matrix.AYXKKw.iterator();
            boolean z = true;
            while (it.hasNext()) {
                SVG.Resources next = it.next();
                if (next instanceof SVG.Callback) {
                    fragmentManager.copydefault(KWHzl(((SVG.Callback) next).AEQbTJ, z, !it.hasNext()));
                } else {
                    AEQbTJ(next, fragmentManager);
                }
                z = false;
            }
        }
    }

    public final void AEQbTJ(SVG.Resources resources, FragmentManager fragmentManager) {
        float f;
        float fOLrzqt;
        float fCopydefault;
        SVG.Style.TextAnchor textAnchorAEQbTJ;
        if (fragmentManager.copydefault((SVG.Matrix) resources)) {
            if (resources instanceof SVG.Point) {
                isConnected();
                EZpvd((SVG.Point) resources);
                fetchVPNInfo();
                return;
            }
            if (resources instanceof SVG.SQLiteDatabase) {
                KWHzl("TSpan render", new java.lang.Object[0]);
                isConnected();
                SVG.SQLiteDatabase sQLiteDatabase = (SVG.SQLiteDatabase) resources;
                KWHzl(this.gEmmrt, sQLiteDatabase);
                if (EZpvd()) {
                    java.util.List<SVG.PictureInPictureParams> list = sQLiteDatabase.KWHzl;
                    boolean z = list != null && list.size() > 0;
                    boolean z2 = fragmentManager instanceof StateListAnimator;
                    float fOLrzqt2 = 0.0f;
                    if (z2) {
                        float fCopydefault2 = !z ? ((StateListAnimator) fragmentManager).AEQbTJ : sQLiteDatabase.KWHzl.get(0).copydefault(this);
                        java.util.List<SVG.PictureInPictureParams> list2 = sQLiteDatabase.EZpvd;
                        fOLrzqt = (list2 == null || list2.size() == 0) ? ((StateListAnimator) fragmentManager).OLrzqt : sQLiteDatabase.EZpvd.get(0).OLrzqt(this);
                        java.util.List<SVG.PictureInPictureParams> list3 = sQLiteDatabase.OLrzqt;
                        fCopydefault = (list3 == null || list3.size() == 0) ? 0.0f : sQLiteDatabase.OLrzqt.get(0).copydefault(this);
                        java.util.List<SVG.PictureInPictureParams> list4 = sQLiteDatabase.AEQbTJ;
                        if (list4 != null && list4.size() != 0) {
                            fOLrzqt2 = sQLiteDatabase.AEQbTJ.get(0).OLrzqt(this);
                        }
                        f = fOLrzqt2;
                        fOLrzqt2 = fCopydefault2;
                    } else {
                        f = 0.0f;
                        fOLrzqt = 0.0f;
                        fCopydefault = 0.0f;
                    }
                    if (z && (textAnchorAEQbTJ = AEQbTJ()) != SVG.Style.TextAnchor.Start) {
                        float fOLrzqt3 = OLrzqt((SVG.Matrix) sQLiteDatabase);
                        if (textAnchorAEQbTJ == SVG.Style.TextAnchor.Middle) {
                            fOLrzqt3 /= 2.0f;
                        }
                        fOLrzqt2 -= fOLrzqt3;
                    }
                    EZpvd((SVG.PackageItemInfo) sQLiteDatabase.gEmmrt());
                    if (z2) {
                        StateListAnimator stateListAnimator = (StateListAnimator) fragmentManager;
                        stateListAnimator.AEQbTJ = fOLrzqt2 + fCopydefault;
                        stateListAnimator.OLrzqt = fOLrzqt + f;
                    }
                    boolean zValues = values();
                    EZpvd(sQLiteDatabase, fragmentManager);
                    if (zValues) {
                        OLrzqt((SVG.PackageItemInfo) sQLiteDatabase);
                    }
                }
                fetchVPNInfo();
                return;
            }
            if (resources instanceof SVG.SQLiteClosable) {
                isConnected();
                SVG.SQLiteClosable sQLiteClosable = (SVG.SQLiteClosable) resources;
                KWHzl(this.gEmmrt, sQLiteClosable);
                if (EZpvd()) {
                    EZpvd((SVG.PackageItemInfo) sQLiteClosable.gEmmrt());
                    SVG.Resources resourcesKWHzl = resources.getFieldNames.KWHzl(sQLiteClosable.KWHzl);
                    if (resourcesKWHzl != null && (resourcesKWHzl instanceof SVG.Matrix)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        EZpvd((SVG.Matrix) resourcesKWHzl, sb);
                        if (sb.length() > 0) {
                            fragmentManager.copydefault(sb.toString());
                        }
                    } else {
                        OLrzqt("Tref reference '%s' not found", sQLiteClosable.KWHzl);
                    }
                }
                fetchVPNInfo();
            }
        }
    }

    public final void EZpvd(SVG.Point point) {
        KWHzl("TextPath render", new java.lang.Object[0]);
        KWHzl(this.gEmmrt, point);
        if (EZpvd() && fJNWhG()) {
            SVG.Resources resourcesKWHzl = point.getFieldNames.KWHzl(point.AEQbTJ);
            if (resourcesKWHzl == null) {
                OLrzqt("TextPath reference '%s' not found", point.AEQbTJ);
                return;
            }
            SVG.BroadcastReceiver broadcastReceiver = (SVG.BroadcastReceiver) resourcesKWHzl;
            android.graphics.Path pathOLrzqt = new ActionBar(broadcastReceiver.KWHzl).OLrzqt();
            android.graphics.Matrix matrix = broadcastReceiver.AEQbTJ;
            if (matrix != null) {
                pathOLrzqt.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathOLrzqt, false);
            SVG.PictureInPictureParams pictureInPictureParams = point.EZpvd;
            float fKWHzl = pictureInPictureParams != null ? pictureInPictureParams.KWHzl(this, pathMeasure.getLength()) : 0.0f;
            SVG.Style.TextAnchor textAnchorAEQbTJ = AEQbTJ();
            if (textAnchorAEQbTJ != SVG.Style.TextAnchor.Start) {
                float fOLrzqt = OLrzqt((SVG.Matrix) point);
                if (textAnchorAEQbTJ == SVG.Style.TextAnchor.Middle) {
                    fOLrzqt /= 2.0f;
                }
                fKWHzl -= fOLrzqt;
            }
            EZpvd((SVG.PackageItemInfo) point.gEmmrt());
            boolean zValues = values();
            EZpvd(point, new Activity(pathOLrzqt, fKWHzl, 0.0f));
            if (zValues) {
                OLrzqt((SVG.PackageItemInfo) point);
            }
        }
    }

    public class Activity extends StateListAnimator {
        public android.graphics.Path copydefault;

        public Activity(android.graphics.Path path, float f, float f2) {
            super(f, f2);
            this.copydefault = path;
        }

        @Override // o.SN.StateListAnimator, o.SN.FragmentManager
        public void copydefault(java.lang.String str) {
            if (SN.this.fJNWhG()) {
                if (SN.this.gEmmrt.OLrzqt) {
                    SN.this.KWHzl.drawTextOnPath(str, this.copydefault, this.AEQbTJ, this.OLrzqt, SN.this.gEmmrt.KWHzl);
                }
                if (SN.this.gEmmrt.EZpvd) {
                    SN.this.KWHzl.drawTextOnPath(str, this.copydefault, this.AEQbTJ, this.OLrzqt, SN.this.gEmmrt.copydefault);
                }
            }
            this.AEQbTJ += SN.this.gEmmrt.KWHzl.measureText(str);
        }
    }

    public final float OLrzqt(SVG.Matrix matrix) {
        Fragment fragment = new Fragment(this, null);
        EZpvd(matrix, fragment);
        return fragment.KWHzl;
    }

    public class Fragment extends FragmentManager {
        public float KWHzl;

        public Fragment() {
            super(SN.this, null);
            this.KWHzl = 0.0f;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SN) A[MD:(o.SN):void (m)] (LINE:1742) call: o.SN.Fragment.<init>(o.SN):void type: THIS */
        public /* synthetic */ Fragment(SN sn, AnonymousClass4 anonymousClass4) {
            this();
        }

        @Override // o.SN.FragmentManager
        public void copydefault(java.lang.String str) {
            this.KWHzl += SN.this.gEmmrt.KWHzl.measureText(str);
        }
    }

    public class PendingIntent extends FragmentManager {
        public RectF EZpvd;
        public float KWHzl;
        public float copydefault;

        public PendingIntent(float f, float f2) {
            super(SN.this, null);
            this.EZpvd = new RectF();
            this.KWHzl = f;
            this.copydefault = f2;
        }

        @Override // o.SN.FragmentManager
        public boolean copydefault(SVG.Matrix matrix) {
            if (!(matrix instanceof SVG.Point)) {
                return true;
            }
            SVG.Point point = (SVG.Point) matrix;
            SVG.Resources resourcesKWHzl = matrix.getFieldNames.KWHzl(point.AEQbTJ);
            if (resourcesKWHzl == null) {
                SN.OLrzqt("TextPath path reference '%s' not found", point.AEQbTJ);
                return false;
            }
            SVG.BroadcastReceiver broadcastReceiver = (SVG.BroadcastReceiver) resourcesKWHzl;
            android.graphics.Path pathOLrzqt = SN.this.new ActionBar(broadcastReceiver.KWHzl).OLrzqt();
            android.graphics.Matrix matrix2 = broadcastReceiver.AEQbTJ;
            if (matrix2 != null) {
                pathOLrzqt.transform(matrix2);
            }
            RectF rectF = new RectF();
            pathOLrzqt.computeBounds(rectF, true);
            this.EZpvd.union(rectF);
            return false;
        }

        @Override // o.SN.FragmentManager
        public void copydefault(java.lang.String str) {
            if (SN.this.fJNWhG()) {
                android.graphics.Rect rect = new android.graphics.Rect();
                SN.this.gEmmrt.KWHzl.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.KWHzl, this.copydefault);
                this.EZpvd.union(rectF);
            }
            this.KWHzl += SN.this.gEmmrt.KWHzl.measureText(str);
        }
    }

    public final void EZpvd(SVG.Matrix matrix, java.lang.StringBuilder sb) {
        java.util.Iterator<SVG.Resources> it = matrix.AYXKKw.iterator();
        boolean z = true;
        while (it.hasNext()) {
            SVG.Resources next = it.next();
            if (next instanceof SVG.Matrix) {
                EZpvd((SVG.Matrix) next, sb);
            } else if (next instanceof SVG.Callback) {
                sb.append(KWHzl(((SVG.Callback) next).AEQbTJ, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public final java.lang.String KWHzl(java.lang.String str, boolean z, boolean z2) {
        if (this.gEmmrt.AEQbTJ) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        java.lang.String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void EZpvd(SVG.CursorFactory cursorFactory, SVG.Activity activity) {
        KWHzl("Symbol render", new java.lang.Object[0]);
        if (activity.AEQbTJ == 0.0f || activity.KWHzl == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = cursorFactory.hDKMBd;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.AEQbTJ;
        }
        KWHzl(this.gEmmrt, cursorFactory);
        Dialog dialog = this.gEmmrt;
        dialog.AhwBna = activity;
        if (!dialog.valueOf.ejfBZ.booleanValue()) {
            SVG.Activity activity2 = this.gEmmrt.AhwBna;
            KWHzl(activity2.copydefault, activity2.OLrzqt, activity2.AEQbTJ, activity2.KWHzl);
        }
        SVG.Activity activity3 = cursorFactory.getNewProxyInstance;
        if (activity3 != null) {
            this.KWHzl.concat(EZpvd(this.gEmmrt.AhwBna, activity3, preserveAspectRatio));
            this.gEmmrt.gEmmrt = cursorFactory.getNewProxyInstance;
        } else {
            android.graphics.Canvas canvas = this.KWHzl;
            SVG.Activity activity4 = this.gEmmrt.AhwBna;
            canvas.translate(activity4.copydefault, activity4.OLrzqt);
        }
        boolean zValues = values();
        copydefault((SVG.PackageManager) cursorFactory, true);
        if (zValues) {
            OLrzqt(cursorFactory);
        }
        copydefault((SVG.PackageItemInfo) cursorFactory);
    }

    public final void OLrzqt(SVG.AssistContent assistContent) {
        SVG.PictureInPictureParams pictureInPictureParams;
        java.lang.String str;
        KWHzl("Image render", new java.lang.Object[0]);
        SVG.PictureInPictureParams pictureInPictureParams2 = assistContent.OLrzqt;
        if (pictureInPictureParams2 == null || pictureInPictureParams2.copydefault() || (pictureInPictureParams = assistContent.copydefault) == null || pictureInPictureParams.copydefault() || (str = assistContent.AEQbTJ) == null) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = assistContent.hDKMBd;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.AEQbTJ;
        }
        android.graphics.Bitmap bitmapEZpvd = EZpvd(str);
        if (bitmapEZpvd == null) {
            SO soCopydefault = SVG.copydefault();
            if (soCopydefault == null) {
                return;
            } else {
                bitmapEZpvd = soCopydefault.AEQbTJ(assistContent.AEQbTJ);
            }
        }
        if (bitmapEZpvd == null) {
            OLrzqt("Could not locate image '%s'", assistContent.AEQbTJ);
            return;
        }
        SVG.Activity activity = new SVG.Activity(0.0f, 0.0f, bitmapEZpvd.getWidth(), bitmapEZpvd.getHeight());
        KWHzl(this.gEmmrt, assistContent);
        if (EZpvd() && fJNWhG()) {
            android.graphics.Matrix matrix = assistContent.KWHzl;
            if (matrix != null) {
                this.KWHzl.concat(matrix);
            }
            SVG.PictureInPictureParams pictureInPictureParams3 = assistContent.EZpvd;
            float fCopydefault = pictureInPictureParams3 != null ? pictureInPictureParams3.copydefault(this) : 0.0f;
            SVG.PictureInPictureParams pictureInPictureParams4 = assistContent.valueOf;
            this.gEmmrt.AhwBna = new SVG.Activity(fCopydefault, pictureInPictureParams4 != null ? pictureInPictureParams4.OLrzqt(this) : 0.0f, assistContent.OLrzqt.copydefault(this), assistContent.copydefault.copydefault(this));
            if (!this.gEmmrt.valueOf.ejfBZ.booleanValue()) {
                SVG.Activity activity2 = this.gEmmrt.AhwBna;
                KWHzl(activity2.copydefault, activity2.OLrzqt, activity2.AEQbTJ, activity2.KWHzl);
            }
            assistContent.ejfBZ = this.gEmmrt.AhwBna;
            copydefault((SVG.PackageItemInfo) assistContent);
            AEQbTJ(assistContent);
            boolean zValues = values();
            fIwbmz();
            this.KWHzl.save();
            this.KWHzl.concat(EZpvd(this.gEmmrt.AhwBna, activity, preserveAspectRatio));
            this.KWHzl.drawBitmap(bitmapEZpvd, 0.0f, 0.0f, new android.graphics.Paint(this.gEmmrt.valueOf.AkhnZx != SVG.Style.RenderQuality.optimizeSpeed ? 2 : 0));
            this.KWHzl.restore();
            if (zValues) {
                OLrzqt((SVG.PackageItemInfo) assistContent);
            }
        }
    }

    public final android.graphics.Bitmap EZpvd(java.lang.String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = android.util.Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final boolean EZpvd() {
        java.lang.Boolean bool = this.gEmmrt.valueOf.valueOf;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean fJNWhG() {
        java.lang.Boolean bool = this.gEmmrt.valueOf.QKVWgx;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r12 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.graphics.Matrix EZpvd(SVG.Activity activity, SVG.Activity activity2, PreserveAspectRatio preserveAspectRatio) {
        int i;
        float f;
        float f2;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (preserveAspectRatio != null && preserveAspectRatio.copydefault() != null) {
            float f3 = activity.AEQbTJ / activity2.AEQbTJ;
            float f4 = activity.KWHzl / activity2.KWHzl;
            float f5 = -activity2.copydefault;
            float f6 = -activity2.OLrzqt;
            if (preserveAspectRatio.equals(PreserveAspectRatio.AYXKKw)) {
                matrix.preTranslate(activity.copydefault, activity.OLrzqt);
                matrix.preScale(f3, f4);
                matrix.preTranslate(f5, f6);
                return matrix;
            }
            float fMax = preserveAspectRatio.AEQbTJ() == PreserveAspectRatio.Scale.slice ? java.lang.Math.max(f3, f4) : java.lang.Math.min(f3, f4);
            float f7 = activity.AEQbTJ / fMax;
            float f8 = activity.KWHzl / fMax;
            int[] iArr = AnonymousClass4.OLrzqt;
            switch (iArr[preserveAspectRatio.copydefault().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f2 = (activity2.AEQbTJ - f7) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f2 = activity2.AEQbTJ - f7;
                    break;
                default:
                    i = iArr[preserveAspectRatio.copydefault().ordinal()];
                    if (i == 2) {
                        f = (activity2.KWHzl - f8) / 2.0f;
                        f6 -= f;
                        matrix.preTranslate(activity.copydefault, activity.OLrzqt);
                        matrix.preScale(fMax, fMax);
                        matrix.preTranslate(f5, f6);
                    } else {
                        if (i != 3) {
                            if (i != 5) {
                                if (i != 6) {
                                    if (i != 7) {
                                    }
                                }
                            }
                            f = (activity2.KWHzl - f8) / 2.0f;
                            f6 -= f;
                            matrix.preTranslate(activity.copydefault, activity.OLrzqt);
                            matrix.preScale(fMax, fMax);
                            matrix.preTranslate(f5, f6);
                        }
                        f = activity2.KWHzl - f8;
                        f6 -= f;
                        matrix.preTranslate(activity.copydefault, activity.OLrzqt);
                        matrix.preScale(fMax, fMax);
                        matrix.preTranslate(f5, f6);
                    }
                    break;
            }
            f5 -= f2;
            i = iArr[preserveAspectRatio.copydefault().ordinal()];
            if (i == 2) {
            }
        }
        return matrix;
    }

    public final boolean EZpvd(SVG.Style style, long j) {
        return (style.getNewProxyInstance & j) != 0;
    }

    public final void copydefault(Dialog dialog, SVG.Style style) {
        if (EZpvd(style, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            dialog.valueOf.OLrzqt = style.OLrzqt;
        }
        if (EZpvd(style, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            dialog.valueOf.fJNWhG = style.fJNWhG;
        }
        if (EZpvd(style, 1L)) {
            dialog.valueOf.djBIcL = style.djBIcL;
            SVG.TypedArray typedArray = style.djBIcL;
            dialog.OLrzqt = (typedArray == null || typedArray == SVG.TaskDescription.KWHzl) ? false : true;
        }
        if (EZpvd(style, 4L)) {
            dialog.valueOf.gEmmrt = style.gEmmrt;
        }
        if (EZpvd(style, 6149L)) {
            KWHzl(dialog, true, dialog.valueOf.djBIcL);
        }
        if (EZpvd(style, 2L)) {
            dialog.valueOf.AYXKKw = style.AYXKKw;
        }
        if (EZpvd(style, 8L)) {
            dialog.valueOf.AuCTelauCTel = style.AuCTelauCTel;
            SVG.TypedArray typedArray2 = style.AuCTelauCTel;
            dialog.EZpvd = (typedArray2 == null || typedArray2 == SVG.TaskDescription.KWHzl) ? false : true;
        }
        if (EZpvd(style, 16L)) {
            dialog.valueOf.AwvSrB = style.AwvSrB;
        }
        if (EZpvd(style, 6168L)) {
            KWHzl(dialog, false, dialog.valueOf.AuCTelauCTel);
        }
        if (EZpvd(style, 34359738368L)) {
            dialog.valueOf.DTwDnp = style.DTwDnp;
        }
        if (EZpvd(style, 32L)) {
            SVG.Style style2 = dialog.valueOf;
            SVG.PictureInPictureParams pictureInPictureParams = style.zuBGHE;
            style2.zuBGHE = pictureInPictureParams;
            dialog.copydefault.setStrokeWidth(pictureInPictureParams.AEQbTJ(this));
        }
        if (EZpvd(style, 64L)) {
            dialog.valueOf.zLjUOn = style.zLjUOn;
            int i = AnonymousClass4.EZpvd[style.zLjUOn.ordinal()];
            if (i == 1) {
                dialog.copydefault.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                dialog.copydefault.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                dialog.copydefault.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (EZpvd(style, 128L)) {
            dialog.valueOf.AubY = style.AubY;
            int i2 = AnonymousClass4.AEQbTJ[style.AubY.ordinal()];
            if (i2 == 1) {
                dialog.copydefault.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                dialog.copydefault.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                dialog.copydefault.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (EZpvd(style, 256L)) {
            dialog.valueOf.sSMYrx = style.sSMYrx;
            dialog.copydefault.setStrokeMiter(style.sSMYrx.floatValue());
        }
        if (EZpvd(style, 512L)) {
            dialog.valueOf.zsXlph = style.zsXlph;
        }
        if (EZpvd(style, 1024L)) {
            dialog.valueOf.wlaJM = style.wlaJM;
        }
        android.graphics.Typeface typefaceAEQbTJ = null;
        if (EZpvd(style, 1536L)) {
            SVG.PictureInPictureParams[] pictureInPictureParamsArr = dialog.valueOf.zsXlph;
            if (pictureInPictureParamsArr == null) {
                dialog.copydefault.setPathEffect(null);
            } else {
                int length = pictureInPictureParamsArr.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    float fAEQbTJ = dialog.valueOf.zsXlph[i4 % length].AEQbTJ(this);
                    fArr[i4] = fAEQbTJ;
                    f += fAEQbTJ;
                }
                if (f == 0.0f) {
                    dialog.copydefault.setPathEffect(null);
                } else {
                    float fAEQbTJ2 = dialog.valueOf.wlaJM.AEQbTJ(this);
                    if (fAEQbTJ2 < 0.0f) {
                        fAEQbTJ2 = (fAEQbTJ2 % f) + f;
                    }
                    dialog.copydefault.setPathEffect(new DashPathEffect(fArr, fAEQbTJ2));
                }
            }
        }
        if (EZpvd(style, 16384L)) {
            float fOLrzqt = OLrzqt();
            dialog.valueOf.DbNXlk = style.DbNXlk;
            dialog.KWHzl.setTextSize(style.DbNXlk.KWHzl(this, fOLrzqt));
            dialog.copydefault.setTextSize(style.DbNXlk.KWHzl(this, fOLrzqt));
        }
        if (EZpvd(style, PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            dialog.valueOf.AhwBna = style.AhwBna;
        }
        if (EZpvd(style, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (style.isConnected.intValue() == -1 && dialog.valueOf.isConnected.intValue() > 100) {
                SVG.Style style3 = dialog.valueOf;
                style3.isConnected = java.lang.Integer.valueOf(style3.isConnected.intValue() - 100);
            } else if (style.isConnected.intValue() == 1 && dialog.valueOf.isConnected.intValue() < 900) {
                SVG.Style style4 = dialog.valueOf;
                style4.isConnected = java.lang.Integer.valueOf(style4.isConnected.intValue() + 100);
            } else {
                dialog.valueOf.isConnected = style.isConnected;
            }
        }
        if (EZpvd(style, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            dialog.valueOf.values = style.values;
        }
        if (EZpvd(style, 106496L)) {
            if (dialog.valueOf.AhwBna != null && this.OLrzqt != null) {
                SO soCopydefault = SVG.copydefault();
                for (java.lang.String str : dialog.valueOf.AhwBna) {
                    SVG.Style style5 = dialog.valueOf;
                    android.graphics.Typeface typefaceAEQbTJ2 = AEQbTJ(str, style5.isConnected, style5.values);
                    typefaceAEQbTJ = (typefaceAEQbTJ2 != null || soCopydefault == null) ? typefaceAEQbTJ2 : soCopydefault.KWHzl(str, dialog.valueOf.isConnected.intValue(), java.lang.String.valueOf(dialog.valueOf.values));
                    if (typefaceAEQbTJ != null) {
                        break;
                    }
                }
            }
            if (typefaceAEQbTJ == null) {
                SVG.Style style6 = dialog.valueOf;
                typefaceAEQbTJ = AEQbTJ(com.google.android.exoplayer2.C.SERIF_NAME, style6.isConnected, style6.values);
            }
            dialog.KWHzl.setTypeface(typefaceAEQbTJ);
            dialog.copydefault.setTypeface(typefaceAEQbTJ);
        }
        if (EZpvd(style, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            dialog.valueOf.gHZMYf = style.gHZMYf;
            android.graphics.Paint paint = dialog.KWHzl;
            SVG.Style.TextDecoration textDecoration = style.gHZMYf;
            SVG.Style.TextDecoration textDecoration2 = SVG.Style.TextDecoration.LineThrough;
            paint.setStrikeThruText(textDecoration == textDecoration2);
            android.graphics.Paint paint2 = dialog.KWHzl;
            SVG.Style.TextDecoration textDecoration3 = style.gHZMYf;
            SVG.Style.TextDecoration textDecoration4 = SVG.Style.TextDecoration.Underline;
            paint2.setUnderlineText(textDecoration3 == textDecoration4);
            dialog.copydefault.setStrikeThruText(style.gHZMYf == textDecoration2);
            dialog.copydefault.setUnderlineText(style.gHZMYf == textDecoration4);
        }
        if (EZpvd(style, 68719476736L)) {
            dialog.valueOf.EZpvd = style.EZpvd;
        }
        if (EZpvd(style, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            dialog.valueOf.AxsJAY = style.AxsJAY;
        }
        if (EZpvd(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            dialog.valueOf.ejfBZ = style.ejfBZ;
        }
        if (EZpvd(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
            dialog.valueOf.fARcdN = style.fARcdN;
        }
        if (EZpvd(style, 4194304L)) {
            dialog.valueOf.AuCTel = style.AuCTel;
        }
        if (EZpvd(style, 8388608L)) {
            dialog.valueOf.fetchVPNInfo = style.fetchVPNInfo;
        }
        if (EZpvd(style, 16777216L)) {
            dialog.valueOf.valueOf = style.valueOf;
        }
        if (EZpvd(style, 33554432L)) {
            dialog.valueOf.QKVWgx = style.QKVWgx;
        }
        if (EZpvd(style, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            dialog.valueOf.AEQbTJ = style.AEQbTJ;
        }
        if (EZpvd(style, 268435456L)) {
            dialog.valueOf.KWHzl = style.KWHzl;
        }
        if (EZpvd(style, 536870912L)) {
            dialog.valueOf.copydefault = style.copydefault;
        }
        if (EZpvd(style, 1073741824L)) {
            dialog.valueOf.fIwbmz = style.fIwbmz;
        }
        if (EZpvd(style, 67108864L)) {
            dialog.valueOf.iwGUEr = style.iwGUEr;
        }
        if (EZpvd(style, 134217728L)) {
            dialog.valueOf.uzCIH = style.uzCIH;
        }
        if (EZpvd(style, 8589934592L)) {
            dialog.valueOf.OcIXYQ = style.OcIXYQ;
        }
        if (EZpvd(style, 17179869184L)) {
            dialog.valueOf.QOLQEE = style.QOLQEE;
        }
        if (EZpvd(style, 137438953472L)) {
            dialog.valueOf.AkhnZx = style.AkhnZx;
        }
    }

    /* JADX INFO: renamed from: o.SN$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[SVG.Style.LineJoin.values().length];
            AEQbTJ = iArr;
            try {
                iArr[SVG.Style.LineJoin.Miter.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[SVG.Style.LineJoin.Round.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[SVG.Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SVG.Style.LineCap.values().length];
            EZpvd = iArr2;
            try {
                iArr2[SVG.Style.LineCap.Butt.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                EZpvd[SVG.Style.LineCap.Round.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                EZpvd[SVG.Style.LineCap.Square.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.Alignment.values().length];
            OLrzqt = iArr3;
            try {
                iArr3[PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                OLrzqt[PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                OLrzqt[PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                OLrzqt[PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                OLrzqt[PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                OLrzqt[PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                OLrzqt[PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                OLrzqt[PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
        }
    }

    public final void KWHzl(Dialog dialog, boolean z, SVG.TypedArray typedArray) {
        int i;
        SVG.Style style = dialog.valueOf;
        float fFloatValue = (z ? style.gEmmrt : style.AwvSrB).floatValue();
        if (typedArray instanceof SVG.TaskDescription) {
            i = ((SVG.TaskDescription) typedArray).AEQbTJ;
        } else if (!(typedArray instanceof SVG.PendingIntent)) {
            return;
        } else {
            i = dialog.valueOf.OLrzqt.AEQbTJ;
        }
        int iKWHzl = KWHzl(i, fFloatValue);
        if (z) {
            dialog.KWHzl.setColor(iKWHzl);
        } else {
            dialog.copydefault.setColor(iKWHzl);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.graphics.Typeface AEQbTJ(java.lang.String str, java.lang.Integer num, SVG.Style.FontStyle fontStyle) {
        byte b = 0;
        boolean z = fontStyle == SVG.Style.FontStyle.Italic;
        int i = num.intValue() > 500 ? z ? 3 : 1 : z ? 2 : 0;
        str.hashCode();
        switch (str.hashCode()) {
            case -1536685117:
                if (!str.equals(com.google.android.exoplayer2.C.SANS_SERIF_NAME)) {
                    b = -1;
                }
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    b = 1;
                    break;
                }
                break;
            case -1081737434:
                if (str.equals("fantasy")) {
                    b = 2;
                    break;
                }
                break;
            case 109326717:
                if (str.equals(com.google.android.exoplayer2.C.SERIF_NAME)) {
                    b = 3;
                    break;
                }
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    b = 4;
                    break;
                }
                break;
        }
        if (b == 0) {
            return android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, i);
        }
        if (b == 1) {
            return android.graphics.Typeface.create(android.graphics.Typeface.MONOSPACE, i);
        }
        if (b == 2) {
            return android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, i);
        }
        if (b == 3) {
            return android.graphics.Typeface.create(android.graphics.Typeface.SERIF, i);
        }
        if (b != 4) {
            return null;
        }
        return android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, i);
    }

    public static int KWHzl(int i, float f) {
        int i2 = 255;
        int iRound = java.lang.Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public final Path.FillType AYXKKw() {
        SVG.Style.FillRule fillRule = this.gEmmrt.valueOf.AYXKKw;
        if (fillRule != null && fillRule == SVG.Style.FillRule.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    public final void KWHzl(float f, float f2, float f3, float f4) {
        float fCopydefault = f3 + f;
        float fOLrzqt = f4 + f2;
        SVG.ActionBar actionBar = this.gEmmrt.valueOf.AEQbTJ;
        if (actionBar != null) {
            f += actionBar.AEQbTJ.copydefault(this);
            f2 += this.gEmmrt.valueOf.AEQbTJ.EZpvd.OLrzqt(this);
            fCopydefault -= this.gEmmrt.valueOf.AEQbTJ.OLrzqt.copydefault(this);
            fOLrzqt -= this.gEmmrt.valueOf.AEQbTJ.copydefault.OLrzqt(this);
        }
        this.KWHzl.clipRect(f, f2, fCopydefault, fOLrzqt);
    }

    public final void fIwbmz() {
        int iKWHzl;
        SVG.Style style = this.gEmmrt.valueOf;
        SVG.TypedArray typedArray = style.OcIXYQ;
        if (typedArray instanceof SVG.TaskDescription) {
            iKWHzl = ((SVG.TaskDescription) typedArray).AEQbTJ;
        } else if (!(typedArray instanceof SVG.PendingIntent)) {
            return;
        } else {
            iKWHzl = style.OLrzqt.AEQbTJ;
        }
        java.lang.Float f = style.QOLQEE;
        if (f != null) {
            iKWHzl = KWHzl(iKWHzl, f.floatValue());
        }
        this.KWHzl.drawColor(iKWHzl);
    }

    public class ActionBar implements SVG.Intent {
        public float AEQbTJ;
        public android.graphics.Path EZpvd = new android.graphics.Path();
        public float OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public android.graphics.Path OLrzqt() {
            return this.EZpvd;
        }

        public ActionBar(SVG.Context context) {
            if (context == null) {
                return;
            }
            context.EZpvd(this);
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void KWHzl(float f, float f2) {
            this.EZpvd.moveTo(f, f2);
            this.AEQbTJ = f;
            this.OLrzqt = f2;
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void OLrzqt(float f, float f2) {
            this.EZpvd.lineTo(f, f2);
            this.AEQbTJ = f;
            this.OLrzqt = f2;
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void AEQbTJ(float f, float f2, float f3, float f4, float f5, float f6) {
            this.EZpvd.cubicTo(f, f2, f3, f4, f5, f6);
            this.AEQbTJ = f5;
            this.OLrzqt = f6;
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void EZpvd(float f, float f2, float f3, float f4) {
            this.EZpvd.quadTo(f, f2, f3, f4);
            this.AEQbTJ = f3;
            this.OLrzqt = f4;
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void copydefault(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            SN.KWHzl(this.AEQbTJ, this.OLrzqt, f, f2, f3, z, z2, f4, f5, this);
            this.AEQbTJ = f4;
            this.OLrzqt = f5;
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void AEQbTJ() {
            this.EZpvd.close();
        }
    }

    public static void KWHzl(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, SVG.Intent intent) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            intent.OLrzqt(f6, f7);
            return;
        }
        float fAbs = java.lang.Math.abs(f3);
        float fAbs2 = java.lang.Math.abs(f4);
        double radians = java.lang.Math.toRadians(((double) f5) % 360.0d);
        double dCos = java.lang.Math.cos(radians);
        double dSin = java.lang.Math.sin(radians);
        double d = ((double) (f - f6)) / 2.0d;
        double d2 = ((double) (f2 - f7)) / 2.0d;
        double d3 = (dCos * d) + (dSin * d2);
        double d4 = ((-dSin) * d) + (d2 * dCos);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d7 / d5) + (d8 / d6);
        if (d9 > 0.99999d) {
            double dSqrt = java.lang.Math.sqrt(d9) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d5 = fAbs * fAbs;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d8 * d5;
        double d12 = d7 * d6;
        double d13 = (((d5 * d6) - d11) - d12) / (d11 + d12);
        if (d13 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d13 = 0.0d;
        }
        double dSqrt2 = d10 * java.lang.Math.sqrt(d13);
        double d14 = fAbs;
        double d15 = fAbs2;
        double d16 = ((d14 * d4) / d15) * dSqrt2;
        double d17 = dSqrt2 * (-((d15 * d3) / d14));
        double d18 = ((double) (f + f6)) / 2.0d;
        double d19 = ((double) (f2 + f7)) / 2.0d;
        double d20 = (d3 - d16) / d14;
        double d21 = (d4 - d17) / d15;
        double d22 = ((-d3) - d16) / d14;
        double d23 = ((-d4) - d17) / d15;
        double d24 = (d20 * d20) + (d21 * d21);
        double dSqrt3 = java.lang.Math.sqrt(d24);
        double d25 = d21 < AudioStats.AUDIO_AMPLITUDE_NONE ? -1.0d : 1.0d;
        double dAcos = java.lang.Math.acos(d20 / dSqrt3);
        double dKWHzl = ((d20 * d23) - (d21 * d22) >= AudioStats.AUDIO_AMPLITUDE_NONE ? 1.0d : -1.0d) * KWHzl(((d20 * d22) + (d21 * d23)) / java.lang.Math.sqrt(d24 * ((d22 * d22) + (d23 * d23))));
        if (!z2 && dKWHzl > AudioStats.AUDIO_AMPLITUDE_NONE) {
            dKWHzl -= 6.283185307179586d;
        } else if (z2 && dKWHzl < AudioStats.AUDIO_AMPLITUDE_NONE) {
            dKWHzl += 6.283185307179586d;
        }
        float[] fArrEZpvd = EZpvd((d25 * dAcos) % 6.283185307179586d, dKWHzl % 6.283185307179586d);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) (((dCos * d16) - (dSin * d17)) + d18), (float) (d19 + (dSin * d16) + (dCos * d17)));
        matrix.mapPoints(fArrEZpvd);
        fArrEZpvd[fArrEZpvd.length - 2] = f6;
        fArrEZpvd[fArrEZpvd.length - 1] = f7;
        for (int i = 0; i < fArrEZpvd.length; i += 6) {
            intent.AEQbTJ(fArrEZpvd[i], fArrEZpvd[i + 1], fArrEZpvd[i + 2], fArrEZpvd[i + 3], fArrEZpvd[i + 4], fArrEZpvd[i + 5]);
        }
    }

    public static double KWHzl(double d) {
        if (d < -1.0d) {
            return 3.141592653589793d;
        }
        return d > 1.0d ? AudioStats.AUDIO_AMPLITUDE_NONE : java.lang.Math.acos(d);
    }

    public static float[] EZpvd(double d, double d2) {
        int iCeil = (int) java.lang.Math.ceil((java.lang.Math.abs(d2) * 2.0d) / 3.141592653589793d);
        double d3 = d2 / ((double) iCeil);
        double d4 = d3 / 2.0d;
        double dSin = (java.lang.Math.sin(d4) * 1.3333333333333333d) / (java.lang.Math.cos(d4) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i = 0;
        int i2 = 0;
        while (i2 < iCeil) {
            double d5 = d + (((double) i2) * d3);
            double dCos = java.lang.Math.cos(d5);
            double dSin2 = java.lang.Math.sin(d5);
            fArr[i] = (float) (dCos - (dSin * dSin2));
            fArr[i + 1] = (float) (dSin2 + (dCos * dSin));
            double d6 = d5 + d3;
            double dCos2 = java.lang.Math.cos(d6);
            double dSin3 = java.lang.Math.sin(d6);
            fArr[i + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr[i + 3] = (float) (dSin3 - (dSin * dCos2));
            fArr[i + 4] = (float) dCos2;
            fArr[i + 5] = (float) dSin3;
            i2++;
            i += 6;
        }
        return fArr;
    }

    public class TaskDescription {
        public float EZpvd;
        public float KWHzl;
        public boolean OLrzqt = false;
        public float copydefault;
        public float djBIcL;

        public TaskDescription(float f, float f2, float f3, float f4) {
            this.EZpvd = 0.0f;
            this.KWHzl = 0.0f;
            this.copydefault = f;
            this.djBIcL = f2;
            double dSqrt = java.lang.Math.sqrt((f3 * f3) + (f4 * f4));
            if (dSqrt != AudioStats.AUDIO_AMPLITUDE_NONE) {
                this.EZpvd = (float) (((double) f3) / dSqrt);
                this.KWHzl = (float) (((double) f4) / dSqrt);
            }
        }

        public void AEQbTJ(float f, float f2) {
            float f3 = f - this.copydefault;
            float f4 = f2 - this.djBIcL;
            double dSqrt = java.lang.Math.sqrt((f3 * f3) + (f4 * f4));
            if (dSqrt != AudioStats.AUDIO_AMPLITUDE_NONE) {
                f3 = (float) (((double) f3) / dSqrt);
                f4 = (float) (((double) f4) / dSqrt);
            }
            float f5 = this.EZpvd;
            if (f3 == (-f5) && f4 == (-this.KWHzl)) {
                this.OLrzqt = true;
                this.EZpvd = -f4;
            } else {
                this.EZpvd = f5 + f3;
                f3 = this.KWHzl + f4;
            }
            this.KWHzl = f3;
        }

        public void KWHzl(TaskDescription taskDescription) {
            float f = taskDescription.EZpvd;
            float f2 = this.EZpvd;
            if (f == (-f2)) {
                float f3 = taskDescription.KWHzl;
                if (f3 == (-this.KWHzl)) {
                    this.OLrzqt = true;
                    this.EZpvd = -f3;
                    this.KWHzl = taskDescription.EZpvd;
                    return;
                }
            }
            this.EZpvd = f2 + f;
            this.KWHzl += taskDescription.KWHzl;
        }

        public java.lang.String toString() {
            return "(" + this.copydefault + "," + this.djBIcL + " " + this.EZpvd + "," + this.KWHzl + ")";
        }
    }

    public class Application implements SVG.Intent {
        public boolean KWHzl;
        public float gEmmrt;
        public float valueOf;
        public java.util.List<TaskDescription> AEQbTJ = new java.util.ArrayList();
        public TaskDescription EZpvd = null;
        public boolean copydefault = false;
        public boolean OLrzqt = true;
        public int djBIcL = -1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<TaskDescription> KWHzl() {
            return this.AEQbTJ;
        }

        public Application(SVG.Context context) {
            if (context == null) {
                return;
            }
            context.EZpvd(this);
            if (this.KWHzl) {
                this.EZpvd.KWHzl(this.AEQbTJ.get(this.djBIcL));
                this.AEQbTJ.set(this.djBIcL, this.EZpvd);
                this.KWHzl = false;
            }
            TaskDescription taskDescription = this.EZpvd;
            if (taskDescription != null) {
                this.AEQbTJ.add(taskDescription);
            }
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void KWHzl(float f, float f2) {
            if (this.KWHzl) {
                this.EZpvd.KWHzl(this.AEQbTJ.get(this.djBIcL));
                this.AEQbTJ.set(this.djBIcL, this.EZpvd);
                this.KWHzl = false;
            }
            TaskDescription taskDescription = this.EZpvd;
            if (taskDescription != null) {
                this.AEQbTJ.add(taskDescription);
            }
            this.gEmmrt = f;
            this.valueOf = f2;
            this.EZpvd = SN.this.new TaskDescription(f, f2, 0.0f, 0.0f);
            this.djBIcL = this.AEQbTJ.size();
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void OLrzqt(float f, float f2) {
            this.EZpvd.AEQbTJ(f, f2);
            this.AEQbTJ.add(this.EZpvd);
            SN sn = SN.this;
            TaskDescription taskDescription = this.EZpvd;
            this.EZpvd = sn.new TaskDescription(f, f2, f - taskDescription.copydefault, f2 - taskDescription.djBIcL);
            this.KWHzl = false;
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void AEQbTJ(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.OLrzqt || this.copydefault) {
                this.EZpvd.AEQbTJ(f, f2);
                this.AEQbTJ.add(this.EZpvd);
                this.copydefault = false;
            }
            this.EZpvd = SN.this.new TaskDescription(f5, f6, f5 - f3, f6 - f4);
            this.KWHzl = false;
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void EZpvd(float f, float f2, float f3, float f4) {
            this.EZpvd.AEQbTJ(f, f2);
            this.AEQbTJ.add(this.EZpvd);
            this.EZpvd = SN.this.new TaskDescription(f3, f4, f3 - f, f4 - f2);
            this.KWHzl = false;
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void copydefault(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.copydefault = true;
            this.OLrzqt = false;
            TaskDescription taskDescription = this.EZpvd;
            SN.KWHzl(taskDescription.copydefault, taskDescription.djBIcL, f, f2, f3, z, z2, f4, f5, this);
            this.OLrzqt = true;
            this.KWHzl = false;
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void AEQbTJ() {
            this.AEQbTJ.add(this.EZpvd);
            OLrzqt(this.gEmmrt, this.valueOf);
            this.KWHzl = true;
        }
    }

    public final void AEQbTJ(SVG.Fragment fragment) {
        SVG.ComponentCallbacks componentCallbacks;
        SVG.ComponentCallbacks componentCallbacks2;
        SVG.ComponentCallbacks componentCallbacks3;
        java.util.List<TaskDescription> listOLrzqt;
        int size;
        SVG.Style style = this.gEmmrt.valueOf;
        java.lang.String str = style.fARcdN;
        if (str == null && style.AuCTel == null && style.fetchVPNInfo == null) {
            return;
        }
        if (str == null) {
            componentCallbacks = null;
        } else {
            SVG.Resources resourcesKWHzl = fragment.getFieldNames.KWHzl(str);
            if (resourcesKWHzl != null) {
                componentCallbacks = (SVG.ComponentCallbacks) resourcesKWHzl;
            } else {
                OLrzqt("Marker reference '%s' not found", this.gEmmrt.valueOf.fARcdN);
                componentCallbacks = null;
            }
        }
        java.lang.String str2 = this.gEmmrt.valueOf.AuCTel;
        if (str2 == null) {
            componentCallbacks2 = null;
        } else {
            SVG.Resources resourcesKWHzl2 = fragment.getFieldNames.KWHzl(str2);
            if (resourcesKWHzl2 != null) {
                componentCallbacks2 = (SVG.ComponentCallbacks) resourcesKWHzl2;
            } else {
                OLrzqt("Marker reference '%s' not found", this.gEmmrt.valueOf.AuCTel);
                componentCallbacks2 = null;
            }
        }
        java.lang.String str3 = this.gEmmrt.valueOf.fetchVPNInfo;
        if (str3 == null) {
            componentCallbacks3 = null;
        } else {
            SVG.Resources resourcesKWHzl3 = fragment.getFieldNames.KWHzl(str3);
            if (resourcesKWHzl3 != null) {
                componentCallbacks3 = (SVG.ComponentCallbacks) resourcesKWHzl3;
            } else {
                OLrzqt("Marker reference '%s' not found", this.gEmmrt.valueOf.fetchVPNInfo);
                componentCallbacks3 = null;
            }
        }
        if (fragment instanceof SVG.BroadcastReceiver) {
            listOLrzqt = new Application(((SVG.BroadcastReceiver) fragment).KWHzl).KWHzl();
        } else if (fragment instanceof SVG.TaskStackBuilder) {
            listOLrzqt = OLrzqt((SVG.TaskStackBuilder) fragment);
        } else {
            listOLrzqt = OLrzqt((SVG.ContentResolver) fragment);
        }
        if (listOLrzqt == null || (size = listOLrzqt.size()) == 0) {
            return;
        }
        SVG.Style style2 = this.gEmmrt.valueOf;
        style2.fetchVPNInfo = null;
        style2.AuCTel = null;
        style2.fARcdN = null;
        if (componentCallbacks != null) {
            OLrzqt(componentCallbacks, listOLrzqt.get(0));
        }
        if (componentCallbacks2 != null && listOLrzqt.size() > 2) {
            TaskDescription taskDescriptionAEQbTJ = listOLrzqt.get(0);
            TaskDescription taskDescription = listOLrzqt.get(1);
            int i = 1;
            while (i < size - 1) {
                i++;
                TaskDescription taskDescription2 = listOLrzqt.get(i);
                taskDescriptionAEQbTJ = taskDescription.OLrzqt ? AEQbTJ(taskDescriptionAEQbTJ, taskDescription, taskDescription2) : taskDescription;
                OLrzqt(componentCallbacks2, taskDescriptionAEQbTJ);
                taskDescription = taskDescription2;
            }
        }
        if (componentCallbacks3 != null) {
            OLrzqt(componentCallbacks3, listOLrzqt.get(size - 1));
        }
    }

    public final TaskDescription AEQbTJ(TaskDescription taskDescription, TaskDescription taskDescription2, TaskDescription taskDescription3) {
        float fCopydefault = copydefault(taskDescription2.EZpvd, taskDescription2.KWHzl, taskDescription2.copydefault - taskDescription.copydefault, taskDescription2.djBIcL - taskDescription.djBIcL);
        if (fCopydefault == 0.0f) {
            fCopydefault = copydefault(taskDescription2.EZpvd, taskDescription2.KWHzl, taskDescription3.copydefault - taskDescription2.copydefault, taskDescription3.djBIcL - taskDescription2.djBIcL);
        }
        if (fCopydefault > 0.0f) {
            return taskDescription2;
        }
        if (fCopydefault == 0.0f && (taskDescription2.EZpvd > 0.0f || taskDescription2.KWHzl >= 0.0f)) {
            return taskDescription2;
        }
        taskDescription2.EZpvd = -taskDescription2.EZpvd;
        taskDescription2.KWHzl = -taskDescription2.KWHzl;
        return taskDescription2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ff, code lost:
    
        if (r7 != 8) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(SVG.ComponentCallbacks componentCallbacks, TaskDescription taskDescription) {
        float fFloatValue;
        float f;
        float f2;
        float f3;
        isConnected();
        java.lang.Float f4 = componentCallbacks.EZpvd;
        float f5 = 0.0f;
        if (f4 == null) {
            fFloatValue = 0.0f;
        } else if (java.lang.Float.isNaN(f4.floatValue())) {
            float f6 = taskDescription.EZpvd;
            if (f6 != 0.0f || taskDescription.KWHzl != 0.0f) {
                fFloatValue = (float) java.lang.Math.toDegrees(java.lang.Math.atan2(taskDescription.KWHzl, f6));
            }
        } else {
            fFloatValue = componentCallbacks.EZpvd.floatValue();
        }
        float fKWHzl = componentCallbacks.OLrzqt ? 1.0f : this.gEmmrt.valueOf.zuBGHE.KWHzl(this.EZpvd);
        this.gEmmrt = copydefault((SVG.Resources) componentCallbacks);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.preTranslate(taskDescription.copydefault, taskDescription.djBIcL);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fKWHzl, fKWHzl);
        SVG.PictureInPictureParams pictureInPictureParams = componentCallbacks.copydefault;
        float fCopydefault = pictureInPictureParams != null ? pictureInPictureParams.copydefault(this) : 0.0f;
        SVG.PictureInPictureParams pictureInPictureParams2 = componentCallbacks.AhwBna;
        float fOLrzqt = pictureInPictureParams2 != null ? pictureInPictureParams2.OLrzqt(this) : 0.0f;
        SVG.PictureInPictureParams pictureInPictureParams3 = componentCallbacks.KWHzl;
        float fCopydefault2 = pictureInPictureParams3 != null ? pictureInPictureParams3.copydefault(this) : 3.0f;
        SVG.PictureInPictureParams pictureInPictureParams4 = componentCallbacks.AEQbTJ;
        float fOLrzqt2 = pictureInPictureParams4 != null ? pictureInPictureParams4.OLrzqt(this) : 3.0f;
        SVG.Activity activity = componentCallbacks.getNewProxyInstance;
        if (activity != null) {
            float fMax = fCopydefault2 / activity.AEQbTJ;
            float f7 = fOLrzqt2 / activity.KWHzl;
            PreserveAspectRatio preserveAspectRatio = componentCallbacks.hDKMBd;
            if (preserveAspectRatio == null) {
                preserveAspectRatio = PreserveAspectRatio.AEQbTJ;
            }
            if (!preserveAspectRatio.equals(PreserveAspectRatio.AYXKKw)) {
                fMax = preserveAspectRatio.AEQbTJ() == PreserveAspectRatio.Scale.slice ? java.lang.Math.max(fMax, f7) : java.lang.Math.min(fMax, f7);
                f7 = fMax;
            }
            matrix.preTranslate((-fCopydefault) * fMax, (-fOLrzqt) * f7);
            this.KWHzl.concat(matrix);
            SVG.Activity activity2 = componentCallbacks.getNewProxyInstance;
            float f8 = activity2.AEQbTJ * fMax;
            float f9 = activity2.KWHzl * f7;
            int[] iArr = AnonymousClass4.OLrzqt;
            switch (iArr[preserveAspectRatio.copydefault().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f = (fCopydefault2 - f8) / 2.0f;
                    f2 = 0.0f - f;
                    break;
                case 4:
                case 5:
                case 6:
                    f = fCopydefault2 - f8;
                    f2 = 0.0f - f;
                    break;
                default:
                    f2 = 0.0f;
                    break;
            }
            int i = iArr[preserveAspectRatio.copydefault().ordinal()];
            if (i == 2) {
                f3 = (fOLrzqt2 - f9) / 2.0f;
                f5 = 0.0f - f3;
                if (!this.gEmmrt.valueOf.ejfBZ.booleanValue()) {
                    KWHzl(f2, f5, fCopydefault2, fOLrzqt2);
                }
                matrix.reset();
                matrix.preScale(fMax, f7);
                this.KWHzl.concat(matrix);
            } else {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                            }
                        }
                    }
                    f3 = (fOLrzqt2 - f9) / 2.0f;
                    f5 = 0.0f - f3;
                    if (!this.gEmmrt.valueOf.ejfBZ.booleanValue()) {
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    this.KWHzl.concat(matrix);
                }
                f3 = fOLrzqt2 - f9;
                f5 = 0.0f - f3;
                if (!this.gEmmrt.valueOf.ejfBZ.booleanValue()) {
                }
                matrix.reset();
                matrix.preScale(fMax, f7);
                this.KWHzl.concat(matrix);
            }
        } else {
            matrix.preTranslate(-fCopydefault, -fOLrzqt);
            this.KWHzl.concat(matrix);
            if (!this.gEmmrt.valueOf.ejfBZ.booleanValue()) {
                KWHzl(0.0f, 0.0f, fCopydefault2, fOLrzqt2);
            }
        }
        boolean zValues = values();
        copydefault((SVG.PackageManager) componentCallbacks, false);
        if (zValues) {
            OLrzqt(componentCallbacks);
        }
        fetchVPNInfo();
    }

    public final Dialog copydefault(SVG.Resources resources) {
        Dialog dialog = new Dialog();
        copydefault(dialog, SVG.Style.OLrzqt());
        return KWHzl(resources, dialog);
    }

    public final Dialog KWHzl(SVG.Resources resources, Dialog dialog) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            if (resources instanceof SVG.AssetManager) {
                arrayList.add(0, (SVG.AssetManager) resources);
            }
            java.lang.Object obj = resources.iwGUEr;
            if (obj == null) {
                break;
            }
            resources = (SVG.Resources) obj;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            KWHzl(dialog, (SVG.AssetManager) it.next());
        }
        Dialog dialog2 = this.gEmmrt;
        dialog.gEmmrt = dialog2.gEmmrt;
        dialog.AhwBna = dialog2.AhwBna;
        return dialog;
    }

    public final void EZpvd(SVG.PackageItemInfo packageItemInfo) {
        SVG.TypedArray typedArray = this.gEmmrt.valueOf.djBIcL;
        if (typedArray instanceof SVG.ComponentCallbacks2) {
            AEQbTJ(true, packageItemInfo.ejfBZ, (SVG.ComponentCallbacks2) typedArray);
        }
        SVG.TypedArray typedArray2 = this.gEmmrt.valueOf.AuCTelauCTel;
        if (typedArray2 instanceof SVG.ComponentCallbacks2) {
            AEQbTJ(false, packageItemInfo.ejfBZ, (SVG.ComponentCallbacks2) typedArray2);
        }
    }

    public final void AEQbTJ(boolean z, SVG.Activity activity, SVG.ComponentCallbacks2 componentCallbacks2) {
        SVG.Resources resourcesKWHzl = this.OLrzqt.KWHzl(componentCallbacks2.AEQbTJ);
        if (resourcesKWHzl == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = z ? "Fill" : "Stroke";
            objArr[1] = componentCallbacks2.AEQbTJ;
            OLrzqt("%s reference '%s' not found", objArr);
            SVG.TypedArray typedArray = componentCallbacks2.OLrzqt;
            if (typedArray != null) {
                KWHzl(this.gEmmrt, z, typedArray);
                return;
            } else if (z) {
                this.gEmmrt.OLrzqt = false;
                return;
            } else {
                this.gEmmrt.EZpvd = false;
                return;
            }
        }
        if (resourcesKWHzl instanceof SVG.DatabaseErrorHandler) {
            OLrzqt(z, activity, (SVG.DatabaseErrorHandler) resourcesKWHzl);
        } else if (resourcesKWHzl instanceof SVG.Theme) {
            KWHzl(z, activity, (SVG.Theme) resourcesKWHzl);
        } else if (resourcesKWHzl instanceof SVG.IntentFilter) {
            AEQbTJ(z, (SVG.IntentFilter) resourcesKWHzl);
        }
    }

    public final void OLrzqt(boolean z, SVG.Activity activity, SVG.DatabaseErrorHandler databaseErrorHandler) {
        float f;
        float fKWHzl;
        float f2;
        float f3;
        java.lang.String str = databaseErrorHandler.OLrzqt;
        if (str != null) {
            copydefault(databaseErrorHandler, str);
        }
        java.lang.Boolean bool = databaseErrorHandler.EZpvd;
        int i = 0;
        boolean z2 = bool != null && bool.booleanValue();
        Dialog dialog = this.gEmmrt;
        android.graphics.Paint paint = z ? dialog.KWHzl : dialog.copydefault;
        if (z2) {
            SVG.Activity activityGEmmrt = gEmmrt();
            SVG.PictureInPictureParams pictureInPictureParams = databaseErrorHandler.valueOf;
            float fCopydefault = pictureInPictureParams != null ? pictureInPictureParams.copydefault(this) : 0.0f;
            SVG.PictureInPictureParams pictureInPictureParams2 = databaseErrorHandler.AhwBna;
            float fOLrzqt = pictureInPictureParams2 != null ? pictureInPictureParams2.OLrzqt(this) : 0.0f;
            SVG.PictureInPictureParams pictureInPictureParams3 = databaseErrorHandler.gEmmrt;
            float fCopydefault2 = pictureInPictureParams3 != null ? pictureInPictureParams3.copydefault(this) : activityGEmmrt.AEQbTJ;
            SVG.PictureInPictureParams pictureInPictureParams4 = databaseErrorHandler.AYXKKw;
            f3 = fCopydefault2;
            f = fCopydefault;
            f2 = fOLrzqt;
            fKWHzl = pictureInPictureParams4 != null ? pictureInPictureParams4.OLrzqt(this) : 0.0f;
        } else {
            SVG.PictureInPictureParams pictureInPictureParams5 = databaseErrorHandler.valueOf;
            float fKWHzl2 = pictureInPictureParams5 != null ? pictureInPictureParams5.KWHzl(this, 1.0f) : 0.0f;
            SVG.PictureInPictureParams pictureInPictureParams6 = databaseErrorHandler.AhwBna;
            float fKWHzl3 = pictureInPictureParams6 != null ? pictureInPictureParams6.KWHzl(this, 1.0f) : 0.0f;
            SVG.PictureInPictureParams pictureInPictureParams7 = databaseErrorHandler.gEmmrt;
            float fKWHzl4 = pictureInPictureParams7 != null ? pictureInPictureParams7.KWHzl(this, 1.0f) : 1.0f;
            SVG.PictureInPictureParams pictureInPictureParams8 = databaseErrorHandler.AYXKKw;
            f = fKWHzl2;
            fKWHzl = pictureInPictureParams8 != null ? pictureInPictureParams8.KWHzl(this, 1.0f) : 0.0f;
            f2 = fKWHzl3;
            f3 = fKWHzl4;
        }
        isConnected();
        this.gEmmrt = copydefault(databaseErrorHandler);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (!z2) {
            matrix.preTranslate(activity.copydefault, activity.OLrzqt);
            matrix.preScale(activity.AEQbTJ, activity.KWHzl);
        }
        android.graphics.Matrix matrix2 = databaseErrorHandler.AEQbTJ;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = databaseErrorHandler.copydefault.size();
        if (size == 0) {
            fetchVPNInfo();
            if (z) {
                this.gEmmrt.OLrzqt = false;
                return;
            } else {
                this.gEmmrt.EZpvd = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        java.util.Iterator<SVG.Resources> it = databaseErrorHandler.copydefault.iterator();
        float f4 = -1.0f;
        while (it.hasNext()) {
            SVG.ApplicationInfo applicationInfo = (SVG.ApplicationInfo) it.next();
            java.lang.Float f5 = applicationInfo.copydefault;
            float fFloatValue = f5 != null ? f5.floatValue() : 0.0f;
            if (i == 0 || fFloatValue >= f4) {
                fArr[i] = fFloatValue;
                f4 = fFloatValue;
            } else {
                fArr[i] = f4;
            }
            isConnected();
            KWHzl(this.gEmmrt, applicationInfo);
            SVG.Style style = this.gEmmrt.valueOf;
            SVG.TaskDescription taskDescription = (SVG.TaskDescription) style.iwGUEr;
            if (taskDescription == null) {
                taskDescription = SVG.TaskDescription.OLrzqt;
            }
            iArr[i] = KWHzl(taskDescription.AEQbTJ, style.uzCIH.floatValue());
            i++;
            fetchVPNInfo();
        }
        if ((f == f3 && f2 == fKWHzl) || size == 1) {
            fetchVPNInfo();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = databaseErrorHandler.KWHzl;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        fetchVPNInfo();
        LinearGradient linearGradient = new LinearGradient(f, f2, f3, fKWHzl, iArr, fArr, tileMode);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(AEQbTJ(this.gEmmrt.valueOf.gEmmrt.floatValue()));
    }

    public final void KWHzl(boolean z, SVG.Activity activity, SVG.Theme theme) {
        float f;
        float fKWHzl;
        float f2;
        java.lang.String str = theme.OLrzqt;
        if (str != null) {
            copydefault(theme, str);
        }
        java.lang.Boolean bool = theme.EZpvd;
        int i = 0;
        boolean z2 = bool != null && bool.booleanValue();
        Dialog dialog = this.gEmmrt;
        android.graphics.Paint paint = z ? dialog.KWHzl : dialog.copydefault;
        if (z2) {
            SVG.PictureInPictureParams pictureInPictureParams = new SVG.PictureInPictureParams(50.0f, SVG.Unit.percent);
            SVG.PictureInPictureParams pictureInPictureParams2 = theme.djBIcL;
            float fCopydefault = pictureInPictureParams2 != null ? pictureInPictureParams2.copydefault(this) : pictureInPictureParams.copydefault(this);
            SVG.PictureInPictureParams pictureInPictureParams3 = theme.valueOf;
            float fOLrzqt = pictureInPictureParams3 != null ? pictureInPictureParams3.OLrzqt(this) : pictureInPictureParams.OLrzqt(this);
            SVG.PictureInPictureParams pictureInPictureParams4 = theme.AhwBna;
            fKWHzl = pictureInPictureParams4 != null ? pictureInPictureParams4.AEQbTJ(this) : pictureInPictureParams.AEQbTJ(this);
            f = fCopydefault;
            f2 = fOLrzqt;
        } else {
            SVG.PictureInPictureParams pictureInPictureParams5 = theme.djBIcL;
            float fKWHzl2 = pictureInPictureParams5 != null ? pictureInPictureParams5.KWHzl(this, 1.0f) : 0.5f;
            SVG.PictureInPictureParams pictureInPictureParams6 = theme.valueOf;
            float fKWHzl3 = pictureInPictureParams6 != null ? pictureInPictureParams6.KWHzl(this, 1.0f) : 0.5f;
            SVG.PictureInPictureParams pictureInPictureParams7 = theme.AhwBna;
            f = fKWHzl2;
            fKWHzl = pictureInPictureParams7 != null ? pictureInPictureParams7.KWHzl(this, 1.0f) : 0.5f;
            f2 = fKWHzl3;
        }
        isConnected();
        this.gEmmrt = copydefault(theme);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (!z2) {
            matrix.preTranslate(activity.copydefault, activity.OLrzqt);
            matrix.preScale(activity.AEQbTJ, activity.KWHzl);
        }
        android.graphics.Matrix matrix2 = theme.AEQbTJ;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = theme.copydefault.size();
        if (size == 0) {
            fetchVPNInfo();
            if (z) {
                this.gEmmrt.OLrzqt = false;
                return;
            } else {
                this.gEmmrt.EZpvd = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        java.util.Iterator<SVG.Resources> it = theme.copydefault.iterator();
        float f3 = -1.0f;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SVG.ApplicationInfo applicationInfo = (SVG.ApplicationInfo) it.next();
            java.lang.Float f4 = applicationInfo.copydefault;
            float fFloatValue = f4 != null ? f4.floatValue() : 0.0f;
            if (i == 0 || fFloatValue >= f3) {
                fArr[i] = fFloatValue;
                f3 = fFloatValue;
            } else {
                fArr[i] = f3;
            }
            isConnected();
            KWHzl(this.gEmmrt, applicationInfo);
            SVG.Style style = this.gEmmrt.valueOf;
            SVG.TaskDescription taskDescription = (SVG.TaskDescription) style.iwGUEr;
            if (taskDescription == null) {
                taskDescription = SVG.TaskDescription.OLrzqt;
            }
            iArr[i] = KWHzl(taskDescription.AEQbTJ, style.uzCIH.floatValue());
            i++;
            fetchVPNInfo();
        }
        if (fKWHzl == 0.0f || size == 1) {
            fetchVPNInfo();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = theme.KWHzl;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        fetchVPNInfo();
        RadialGradient radialGradient = new RadialGradient(f, f2, fKWHzl, iArr, fArr, tileMode);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(AEQbTJ(this.gEmmrt.valueOf.gEmmrt.floatValue()));
    }

    public final void copydefault(SVG.FragmentManager fragmentManager, java.lang.String str) {
        SVG.Resources resourcesKWHzl = fragmentManager.getFieldNames.KWHzl(str);
        if (resourcesKWHzl == null) {
            AYXKKw("Gradient reference '%s' not found", str);
            return;
        }
        if (!(resourcesKWHzl instanceof SVG.FragmentManager)) {
            OLrzqt("Gradient href attributes must point to other gradient elements", new java.lang.Object[0]);
            return;
        }
        if (resourcesKWHzl == fragmentManager) {
            OLrzqt("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVG.FragmentManager fragmentManager2 = (SVG.FragmentManager) resourcesKWHzl;
        if (fragmentManager.EZpvd == null) {
            fragmentManager.EZpvd = fragmentManager2.EZpvd;
        }
        if (fragmentManager.AEQbTJ == null) {
            fragmentManager.AEQbTJ = fragmentManager2.AEQbTJ;
        }
        if (fragmentManager.KWHzl == null) {
            fragmentManager.KWHzl = fragmentManager2.KWHzl;
        }
        if (fragmentManager.copydefault.isEmpty()) {
            fragmentManager.copydefault = fragmentManager2.copydefault;
        }
        try {
            if (fragmentManager instanceof SVG.DatabaseErrorHandler) {
                OLrzqt((SVG.DatabaseErrorHandler) fragmentManager, (SVG.DatabaseErrorHandler) resourcesKWHzl);
            } else {
                EZpvd((SVG.Theme) fragmentManager, (SVG.Theme) resourcesKWHzl);
            }
        } catch (java.lang.ClassCastException unused) {
        }
        java.lang.String str2 = fragmentManager2.OLrzqt;
        if (str2 != null) {
            copydefault(fragmentManager, str2);
        }
    }

    public final void OLrzqt(SVG.DatabaseErrorHandler databaseErrorHandler, SVG.DatabaseErrorHandler databaseErrorHandler2) {
        if (databaseErrorHandler.valueOf == null) {
            databaseErrorHandler.valueOf = databaseErrorHandler2.valueOf;
        }
        if (databaseErrorHandler.AhwBna == null) {
            databaseErrorHandler.AhwBna = databaseErrorHandler2.AhwBna;
        }
        if (databaseErrorHandler.gEmmrt == null) {
            databaseErrorHandler.gEmmrt = databaseErrorHandler2.gEmmrt;
        }
        if (databaseErrorHandler.AYXKKw == null) {
            databaseErrorHandler.AYXKKw = databaseErrorHandler2.AYXKKw;
        }
    }

    public final void EZpvd(SVG.Theme theme, SVG.Theme theme2) {
        if (theme.djBIcL == null) {
            theme.djBIcL = theme2.djBIcL;
        }
        if (theme.valueOf == null) {
            theme.valueOf = theme2.valueOf;
        }
        if (theme.AhwBna == null) {
            theme.AhwBna = theme2.AhwBna;
        }
        if (theme.AYXKKw == null) {
            theme.AYXKKw = theme2.AYXKKw;
        }
        if (theme.gEmmrt == null) {
            theme.gEmmrt = theme2.gEmmrt;
        }
    }

    public final void AEQbTJ(boolean z, SVG.IntentFilter intentFilter) {
        if (z) {
            if (EZpvd(intentFilter.AuCTel, 2147483648L)) {
                Dialog dialog = this.gEmmrt;
                SVG.Style style = dialog.valueOf;
                SVG.TypedArray typedArray = intentFilter.AuCTel.getFieldNames;
                style.djBIcL = typedArray;
                dialog.OLrzqt = typedArray != null;
            }
            if (EZpvd(intentFilter.AuCTel, 4294967296L)) {
                this.gEmmrt.valueOf.gEmmrt = intentFilter.AuCTel.hDKMBd;
            }
            if (EZpvd(intentFilter.AuCTel, 6442450944L)) {
                Dialog dialog2 = this.gEmmrt;
                KWHzl(dialog2, z, dialog2.valueOf.djBIcL);
                return;
            }
            return;
        }
        if (EZpvd(intentFilter.AuCTel, 2147483648L)) {
            Dialog dialog3 = this.gEmmrt;
            SVG.Style style2 = dialog3.valueOf;
            SVG.TypedArray typedArray2 = intentFilter.AuCTel.getFieldNames;
            style2.AuCTelauCTel = typedArray2;
            dialog3.EZpvd = typedArray2 != null;
        }
        if (EZpvd(intentFilter.AuCTel, 4294967296L)) {
            this.gEmmrt.valueOf.AwvSrB = intentFilter.AuCTel.hDKMBd;
        }
        if (EZpvd(intentFilter.AuCTel, 6442450944L)) {
            Dialog dialog4 = this.gEmmrt;
            KWHzl(dialog4, z, dialog4.valueOf.AuCTelauCTel);
        }
    }

    public final void AEQbTJ(SVG.PackageItemInfo packageItemInfo) {
        copydefault(packageItemInfo, packageItemInfo.ejfBZ);
    }

    public final void copydefault(SVG.PackageItemInfo packageItemInfo, SVG.Activity activity) {
        android.graphics.Path pathOLrzqt;
        if (this.gEmmrt.valueOf.KWHzl == null || (pathOLrzqt = OLrzqt(packageItemInfo, activity)) == null) {
            return;
        }
        this.KWHzl.clipPath(pathOLrzqt);
    }

    public final android.graphics.Path OLrzqt(SVG.PackageItemInfo packageItemInfo, SVG.Activity activity) {
        android.graphics.Path pathKWHzl;
        SVG.Resources resourcesKWHzl = packageItemInfo.getFieldNames.KWHzl(this.gEmmrt.valueOf.KWHzl);
        if (resourcesKWHzl == null) {
            OLrzqt("ClipPath reference '%s' not found", this.gEmmrt.valueOf.KWHzl);
            return null;
        }
        SVG.StateListAnimator stateListAnimator = (SVG.StateListAnimator) resourcesKWHzl;
        this.AhwBna.push(this.gEmmrt);
        this.gEmmrt = copydefault((SVG.Resources) stateListAnimator);
        java.lang.Boolean bool = stateListAnimator.KWHzl;
        boolean z = bool == null || bool.booleanValue();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (!z) {
            matrix.preTranslate(activity.copydefault, activity.OLrzqt);
            matrix.preScale(activity.AEQbTJ, activity.KWHzl);
        }
        android.graphics.Matrix matrix2 = stateListAnimator.EZpvd;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        android.graphics.Path path = new android.graphics.Path();
        for (SVG.Resources resources : stateListAnimator.AYXKKw) {
            if ((resources instanceof SVG.PackageItemInfo) && (pathKWHzl = KWHzl((SVG.PackageItemInfo) resources, true)) != null) {
                path.op(pathKWHzl, Path.Op.UNION);
            }
        }
        if (this.gEmmrt.valueOf.KWHzl != null) {
            if (stateListAnimator.ejfBZ == null) {
                stateListAnimator.ejfBZ = OLrzqt(path);
            }
            android.graphics.Path pathOLrzqt = OLrzqt(stateListAnimator, stateListAnimator.ejfBZ);
            if (pathOLrzqt != null) {
                path.op(pathOLrzqt, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.gEmmrt = this.AhwBna.pop();
        return path;
    }

    public final android.graphics.Path KWHzl(SVG.PackageItemInfo packageItemInfo, boolean z) {
        android.graphics.Path pathOLrzqt;
        android.graphics.Path pathOLrzqt2;
        this.AhwBna.push(this.gEmmrt);
        Dialog dialog = new Dialog(this.gEmmrt);
        this.gEmmrt = dialog;
        KWHzl(dialog, packageItemInfo);
        if (!EZpvd() || !fJNWhG()) {
            this.gEmmrt = this.AhwBna.pop();
            return null;
        }
        if (packageItemInfo instanceof SVG.MediaController) {
            if (!z) {
                OLrzqt("<use> elements inside a <clipPath> cannot reference another <use>", new java.lang.Object[0]);
            }
            SVG.MediaController mediaController = (SVG.MediaController) packageItemInfo;
            SVG.Resources resourcesKWHzl = packageItemInfo.getFieldNames.KWHzl(mediaController.AEQbTJ);
            if (resourcesKWHzl == null) {
                OLrzqt("Use reference '%s' not found", mediaController.AEQbTJ);
                this.gEmmrt = this.AhwBna.pop();
                return null;
            }
            if (!(resourcesKWHzl instanceof SVG.PackageItemInfo)) {
                this.gEmmrt = this.AhwBna.pop();
                return null;
            }
            pathOLrzqt = KWHzl((SVG.PackageItemInfo) resourcesKWHzl, false);
            if (pathOLrzqt == null) {
                return null;
            }
            if (mediaController.ejfBZ == null) {
                mediaController.ejfBZ = OLrzqt(pathOLrzqt);
            }
            android.graphics.Matrix matrix = mediaController.EZpvd;
            if (matrix != null) {
                pathOLrzqt.transform(matrix);
            }
        } else if (packageItemInfo instanceof SVG.Fragment) {
            SVG.Fragment fragment = (SVG.Fragment) packageItemInfo;
            if (packageItemInfo instanceof SVG.BroadcastReceiver) {
                pathOLrzqt = new ActionBar(((SVG.BroadcastReceiver) packageItemInfo).KWHzl).OLrzqt();
                if (packageItemInfo.ejfBZ == null) {
                    packageItemInfo.ejfBZ = OLrzqt(pathOLrzqt);
                }
            } else {
                pathOLrzqt = packageItemInfo instanceof SVG.IntentSender ? AEQbTJ((SVG.IntentSender) packageItemInfo) : packageItemInfo instanceof SVG.Application ? AEQbTJ((SVG.Application) packageItemInfo) : packageItemInfo instanceof SVG.LoaderManager ? OLrzqt((SVG.LoaderManager) packageItemInfo) : packageItemInfo instanceof SVG.ContentResolver ? copydefault((SVG.ContentResolver) packageItemInfo) : null;
            }
            if (pathOLrzqt == null) {
                return null;
            }
            if (fragment.ejfBZ == null) {
                fragment.ejfBZ = OLrzqt(pathOLrzqt);
            }
            android.graphics.Matrix matrix2 = fragment.AEQbTJ;
            if (matrix2 != null) {
                pathOLrzqt.transform(matrix2);
            }
            pathOLrzqt.setFillType(copydefault());
        } else if (packageItemInfo instanceof SVG.Mode) {
            SVG.Mode mode = (SVG.Mode) packageItemInfo;
            pathOLrzqt = OLrzqt(mode);
            if (pathOLrzqt == null) {
                return null;
            }
            android.graphics.Matrix matrix3 = mode.copydefault;
            if (matrix3 != null) {
                pathOLrzqt.transform(matrix3);
            }
            pathOLrzqt.setFillType(copydefault());
        } else {
            OLrzqt("Invalid %s element found in clipPath definition", packageItemInfo.EZpvd());
            return null;
        }
        if (this.gEmmrt.valueOf.KWHzl != null && (pathOLrzqt2 = OLrzqt(packageItemInfo, packageItemInfo.ejfBZ)) != null) {
            pathOLrzqt.op(pathOLrzqt2, Path.Op.INTERSECT);
        }
        this.gEmmrt = this.AhwBna.pop();
        return pathOLrzqt;
    }

    public final Path.FillType copydefault() {
        SVG.Style.FillRule fillRule = this.gEmmrt.valueOf.copydefault;
        if (fillRule != null && fillRule == SVG.Style.FillRule.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    public class LoaderManager extends FragmentManager {
        public float EZpvd;
        public float KWHzl;
        public android.graphics.Path OLrzqt;

        public LoaderManager(float f, float f2, android.graphics.Path path) {
            super(SN.this, null);
            this.KWHzl = f;
            this.EZpvd = f2;
            this.OLrzqt = path;
        }

        @Override // o.SN.FragmentManager
        public boolean copydefault(SVG.Matrix matrix) {
            if (!(matrix instanceof SVG.Point)) {
                return true;
            }
            SN.AYXKKw("Using <textPath> elements in a clip path is not supported.", new java.lang.Object[0]);
            return false;
        }

        @Override // o.SN.FragmentManager
        public void copydefault(java.lang.String str) {
            if (SN.this.fJNWhG()) {
                android.graphics.Path path = new android.graphics.Path();
                SN.this.gEmmrt.KWHzl.getTextPath(str, 0, str.length(), this.KWHzl, this.EZpvd, path);
                this.OLrzqt.addPath(path);
            }
            this.KWHzl += SN.this.gEmmrt.KWHzl.measureText(str);
        }
    }

    public final android.graphics.Path EZpvd(SVG.TaskStackBuilder taskStackBuilder) {
        SVG.PictureInPictureParams pictureInPictureParams = taskStackBuilder.EZpvd;
        float fCopydefault = pictureInPictureParams == null ? 0.0f : pictureInPictureParams.copydefault(this);
        SVG.PictureInPictureParams pictureInPictureParams2 = taskStackBuilder.OLrzqt;
        float fOLrzqt = pictureInPictureParams2 == null ? 0.0f : pictureInPictureParams2.OLrzqt(this);
        SVG.PictureInPictureParams pictureInPictureParams3 = taskStackBuilder.KWHzl;
        float fCopydefault2 = pictureInPictureParams3 == null ? 0.0f : pictureInPictureParams3.copydefault(this);
        SVG.PictureInPictureParams pictureInPictureParams4 = taskStackBuilder.copydefault;
        float fOLrzqt2 = pictureInPictureParams4 != null ? pictureInPictureParams4.OLrzqt(this) : 0.0f;
        if (taskStackBuilder.ejfBZ == null) {
            taskStackBuilder.ejfBZ = new SVG.Activity(java.lang.Math.min(fCopydefault, fCopydefault2), java.lang.Math.min(fOLrzqt, fOLrzqt2), java.lang.Math.abs(fCopydefault2 - fCopydefault), java.lang.Math.abs(fOLrzqt2 - fOLrzqt));
        }
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(fCopydefault, fOLrzqt);
        path.lineTo(fCopydefault2, fOLrzqt2);
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.graphics.Path AEQbTJ(SVG.IntentSender intentSender) {
        float fCopydefault;
        float fOLrzqt;
        float fMin;
        float fCopydefault2;
        float fOLrzqt2;
        float f;
        float f2;
        android.graphics.Path path;
        android.graphics.Path path2;
        SVG.PictureInPictureParams pictureInPictureParams = intentSender.OLrzqt;
        if (pictureInPictureParams == null && intentSender.copydefault == null) {
            fCopydefault = 0.0f;
        } else if (pictureInPictureParams == null) {
            fCopydefault = intentSender.copydefault.OLrzqt(this);
        } else if (intentSender.copydefault == null) {
            fCopydefault = pictureInPictureParams.copydefault(this);
        } else {
            fCopydefault = pictureInPictureParams.copydefault(this);
            fOLrzqt = intentSender.copydefault.OLrzqt(this);
            fMin = java.lang.Math.min(fCopydefault, intentSender.KWHzl.copydefault(this) / 2.0f);
            float fMin2 = java.lang.Math.min(fOLrzqt, intentSender.EZpvd.OLrzqt(this) / 2.0f);
            SVG.PictureInPictureParams pictureInPictureParams2 = intentSender.AYXKKw;
            fCopydefault2 = pictureInPictureParams2 == null ? pictureInPictureParams2.copydefault(this) : 0.0f;
            SVG.PictureInPictureParams pictureInPictureParams3 = intentSender.valueOf;
            fOLrzqt2 = pictureInPictureParams3 == null ? pictureInPictureParams3.OLrzqt(this) : 0.0f;
            float fCopydefault3 = intentSender.KWHzl.copydefault(this);
            float fOLrzqt3 = intentSender.EZpvd.OLrzqt(this);
            if (intentSender.ejfBZ == null) {
                intentSender.ejfBZ = new SVG.Activity(fCopydefault2, fOLrzqt2, fCopydefault3, fOLrzqt3);
            }
            f = fCopydefault2 + fCopydefault3;
            f2 = fOLrzqt2 + fOLrzqt3;
            path = new android.graphics.Path();
            if (fMin != 0.0f || fMin2 == 0.0f) {
                path2 = path;
                path2.moveTo(fCopydefault2, fOLrzqt2);
                path2.lineTo(f, fOLrzqt2);
                path2.lineTo(f, f2);
                path2.lineTo(fCopydefault2, f2);
                path2.lineTo(fCopydefault2, fOLrzqt2);
            } else {
                float f3 = fMin * 0.5522848f;
                float f4 = 0.5522848f * fMin2;
                float f5 = fOLrzqt2 + fMin2;
                path.moveTo(fCopydefault2, f5);
                float f6 = f5 - f4;
                float f7 = fCopydefault2 + fMin;
                float f8 = f7 - f3;
                path.cubicTo(fCopydefault2, f6, f8, fOLrzqt2, f7, fOLrzqt2);
                float f9 = f - fMin;
                path.lineTo(f9, fOLrzqt2);
                float f10 = f9 + f3;
                path.cubicTo(f10, fOLrzqt2, f, f6, f, f5);
                float f11 = f2 - fMin2;
                path.lineTo(f, f11);
                float f12 = f11 + f4;
                path2 = path;
                path.cubicTo(f, f12, f10, f2, f9, f2);
                path2.lineTo(f7, f2);
                path2.cubicTo(f8, f2, fCopydefault2, f12, fCopydefault2, f11);
                path2.lineTo(fCopydefault2, f5);
            }
            path2.close();
            return path2;
        }
        fOLrzqt = fCopydefault;
        fMin = java.lang.Math.min(fCopydefault, intentSender.KWHzl.copydefault(this) / 2.0f);
        float fMin22 = java.lang.Math.min(fOLrzqt, intentSender.EZpvd.OLrzqt(this) / 2.0f);
        SVG.PictureInPictureParams pictureInPictureParams22 = intentSender.AYXKKw;
        if (pictureInPictureParams22 == null) {
        }
        SVG.PictureInPictureParams pictureInPictureParams32 = intentSender.valueOf;
        if (pictureInPictureParams32 == null) {
        }
        float fCopydefault32 = intentSender.KWHzl.copydefault(this);
        float fOLrzqt32 = intentSender.EZpvd.OLrzqt(this);
        if (intentSender.ejfBZ == null) {
        }
        f = fCopydefault2 + fCopydefault32;
        f2 = fOLrzqt2 + fOLrzqt32;
        path = new android.graphics.Path();
        if (fMin != 0.0f) {
            path2 = path;
            path2.moveTo(fCopydefault2, fOLrzqt2);
            path2.lineTo(f, fOLrzqt2);
            path2.lineTo(f, f2);
            path2.lineTo(fCopydefault2, f2);
            path2.lineTo(fCopydefault2, fOLrzqt2);
        }
        path2.close();
        return path2;
    }

    public final android.graphics.Path AEQbTJ(SVG.Application application) {
        SVG.PictureInPictureParams pictureInPictureParams = application.OLrzqt;
        float fCopydefault = pictureInPictureParams != null ? pictureInPictureParams.copydefault(this) : 0.0f;
        SVG.PictureInPictureParams pictureInPictureParams2 = application.EZpvd;
        float fOLrzqt = pictureInPictureParams2 != null ? pictureInPictureParams2.OLrzqt(this) : 0.0f;
        float fAEQbTJ = application.KWHzl.AEQbTJ(this);
        float f = fCopydefault - fAEQbTJ;
        float f2 = fOLrzqt - fAEQbTJ;
        float f3 = fCopydefault + fAEQbTJ;
        float f4 = fOLrzqt + fAEQbTJ;
        if (application.ejfBZ == null) {
            float f5 = 2.0f * fAEQbTJ;
            application.ejfBZ = new SVG.Activity(f, f2, f5, f5);
        }
        float f6 = 0.5522848f * fAEQbTJ;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(fCopydefault, f2);
        float f7 = fCopydefault + f6;
        float f8 = fOLrzqt - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fOLrzqt);
        float f9 = fOLrzqt + f6;
        path.cubicTo(f3, f9, f7, f4, fCopydefault, f4);
        float f10 = fCopydefault - f6;
        path.cubicTo(f10, f4, f, f9, f, fOLrzqt);
        path.cubicTo(f, f8, f10, f2, fCopydefault, f2);
        path.close();
        return path;
    }

    public final android.graphics.Path OLrzqt(SVG.LoaderManager loaderManager) {
        SVG.PictureInPictureParams pictureInPictureParams = loaderManager.OLrzqt;
        float fCopydefault = pictureInPictureParams != null ? pictureInPictureParams.copydefault(this) : 0.0f;
        SVG.PictureInPictureParams pictureInPictureParams2 = loaderManager.copydefault;
        float fOLrzqt = pictureInPictureParams2 != null ? pictureInPictureParams2.OLrzqt(this) : 0.0f;
        float fCopydefault2 = loaderManager.KWHzl.copydefault(this);
        float fOLrzqt2 = loaderManager.EZpvd.OLrzqt(this);
        float f = fCopydefault - fCopydefault2;
        float f2 = fOLrzqt - fOLrzqt2;
        float f3 = fCopydefault + fCopydefault2;
        float f4 = fOLrzqt + fOLrzqt2;
        if (loaderManager.ejfBZ == null) {
            loaderManager.ejfBZ = new SVG.Activity(f, f2, fCopydefault2 * 2.0f, 2.0f * fOLrzqt2);
        }
        float f5 = fCopydefault2 * 0.5522848f;
        float f6 = 0.5522848f * fOLrzqt2;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(fCopydefault, f2);
        float f7 = fCopydefault + f5;
        float f8 = fOLrzqt - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fOLrzqt);
        float f9 = f6 + fOLrzqt;
        path.cubicTo(f3, f9, f7, f4, fCopydefault, f4);
        float f10 = fCopydefault - f5;
        path.cubicTo(f10, f4, f, f9, f, fOLrzqt);
        path.cubicTo(f, f8, f10, f2, fCopydefault, f2);
        path.close();
        return path;
    }

    public final android.graphics.Path copydefault(SVG.ContentResolver contentResolver) {
        android.graphics.Path path = new android.graphics.Path();
        float[] fArr = contentResolver.KWHzl;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = contentResolver.KWHzl;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (contentResolver instanceof SVG.ContextWrapper) {
            path.close();
        }
        if (contentResolver.ejfBZ == null) {
            contentResolver.ejfBZ = OLrzqt(path);
        }
        return path;
    }

    public final android.graphics.Path OLrzqt(SVG.Mode mode) {
        java.util.List<SVG.PictureInPictureParams> list = mode.KWHzl;
        float fOLrzqt = 0.0f;
        float fCopydefault = (list == null || list.size() == 0) ? 0.0f : mode.KWHzl.get(0).copydefault(this);
        java.util.List<SVG.PictureInPictureParams> list2 = mode.EZpvd;
        float fOLrzqt2 = (list2 == null || list2.size() == 0) ? 0.0f : mode.EZpvd.get(0).OLrzqt(this);
        java.util.List<SVG.PictureInPictureParams> list3 = mode.OLrzqt;
        float fCopydefault2 = (list3 == null || list3.size() == 0) ? 0.0f : mode.OLrzqt.get(0).copydefault(this);
        java.util.List<SVG.PictureInPictureParams> list4 = mode.AEQbTJ;
        if (list4 != null && list4.size() != 0) {
            fOLrzqt = mode.AEQbTJ.get(0).OLrzqt(this);
        }
        if (this.gEmmrt.valueOf.AxsJAY != SVG.Style.TextAnchor.Start) {
            float fOLrzqt3 = OLrzqt((SVG.Matrix) mode);
            if (this.gEmmrt.valueOf.AxsJAY == SVG.Style.TextAnchor.Middle) {
                fOLrzqt3 /= 2.0f;
            }
            fCopydefault -= fOLrzqt3;
        }
        if (mode.ejfBZ == null) {
            PendingIntent pendingIntent = new PendingIntent(fCopydefault, fOLrzqt2);
            EZpvd(mode, pendingIntent);
            RectF rectF = pendingIntent.EZpvd;
            mode.ejfBZ = new SVG.Activity(rectF.left, rectF.top, rectF.width(), pendingIntent.EZpvd.height());
        }
        android.graphics.Path path = new android.graphics.Path();
        EZpvd(mode, new LoaderManager(fCopydefault + fCopydefault2, fOLrzqt2 + fOLrzqt, path));
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f4 A[LOOP:3: B:100:0x01ee->B:102:0x01f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(SVG.PackageItemInfo packageItemInfo, android.graphics.Path path, SVG.DialogInterface dialogInterface) {
        float fCopydefault;
        float fOLrzqt;
        float fOLrzqt2;
        float fCopydefault2;
        PreserveAspectRatio preserveAspectRatio;
        boolean z;
        boolean z2;
        PreserveAspectRatio preserveAspectRatio2;
        java.util.Iterator<SVG.Resources> it;
        java.lang.Boolean bool = dialogInterface.EZpvd;
        boolean z3 = bool != null && bool.booleanValue();
        java.lang.String str = dialogInterface.OLrzqt;
        if (str != null) {
            OLrzqt(dialogInterface, str);
        }
        if (z3) {
            SVG.PictureInPictureParams pictureInPictureParams = dialogInterface.gEmmrt;
            fCopydefault = pictureInPictureParams != null ? pictureInPictureParams.copydefault(this) : 0.0f;
            SVG.PictureInPictureParams pictureInPictureParams2 = dialogInterface.djBIcL;
            fOLrzqt2 = pictureInPictureParams2 != null ? pictureInPictureParams2.OLrzqt(this) : 0.0f;
            SVG.PictureInPictureParams pictureInPictureParams3 = dialogInterface.valueOf;
            fCopydefault2 = pictureInPictureParams3 != null ? pictureInPictureParams3.copydefault(this) : 0.0f;
            SVG.PictureInPictureParams pictureInPictureParams4 = dialogInterface.AEQbTJ;
            fOLrzqt = pictureInPictureParams4 != null ? pictureInPictureParams4.OLrzqt(this) : 0.0f;
        } else {
            SVG.PictureInPictureParams pictureInPictureParams5 = dialogInterface.gEmmrt;
            float fKWHzl = pictureInPictureParams5 != null ? pictureInPictureParams5.KWHzl(this, 1.0f) : 0.0f;
            SVG.PictureInPictureParams pictureInPictureParams6 = dialogInterface.djBIcL;
            float fKWHzl2 = pictureInPictureParams6 != null ? pictureInPictureParams6.KWHzl(this, 1.0f) : 0.0f;
            SVG.PictureInPictureParams pictureInPictureParams7 = dialogInterface.valueOf;
            float fKWHzl3 = pictureInPictureParams7 != null ? pictureInPictureParams7.KWHzl(this, 1.0f) : 0.0f;
            SVG.PictureInPictureParams pictureInPictureParams8 = dialogInterface.AEQbTJ;
            float fKWHzl4 = pictureInPictureParams8 != null ? pictureInPictureParams8.KWHzl(this, 1.0f) : 0.0f;
            SVG.Activity activity = packageItemInfo.ejfBZ;
            float f = activity.copydefault;
            float f2 = activity.AEQbTJ;
            fCopydefault = (fKWHzl * f2) + f;
            float f3 = activity.OLrzqt;
            float f4 = activity.KWHzl;
            float f5 = fKWHzl3 * f2;
            fOLrzqt = fKWHzl4 * f4;
            fOLrzqt2 = (fKWHzl2 * f4) + f3;
            fCopydefault2 = f5;
        }
        if (fCopydefault2 == 0.0f || fOLrzqt == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio3 = dialogInterface.hDKMBd;
        if (preserveAspectRatio3 == null) {
            preserveAspectRatio3 = PreserveAspectRatio.AEQbTJ;
        }
        isConnected();
        this.KWHzl.clipPath(path);
        Dialog dialog = new Dialog();
        copydefault(dialog, SVG.Style.OLrzqt());
        dialog.valueOf.ejfBZ = java.lang.Boolean.FALSE;
        this.gEmmrt = KWHzl(dialogInterface, dialog);
        SVG.Activity activity2 = packageItemInfo.ejfBZ;
        android.graphics.Matrix matrix = dialogInterface.copydefault;
        if (matrix != null) {
            this.KWHzl.concat(matrix);
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            if (dialogInterface.copydefault.invert(matrix2)) {
                SVG.Activity activity3 = packageItemInfo.ejfBZ;
                float f6 = activity3.copydefault;
                float f7 = activity3.OLrzqt;
                float fKWHzl5 = activity3.KWHzl();
                SVG.Activity activity4 = packageItemInfo.ejfBZ;
                float f8 = activity4.OLrzqt;
                float fKWHzl6 = activity4.KWHzl();
                float fEZpvd = packageItemInfo.ejfBZ.EZpvd();
                SVG.Activity activity5 = packageItemInfo.ejfBZ;
                preserveAspectRatio = preserveAspectRatio3;
                float[] fArr = {f6, f7, fKWHzl5, f8, fKWHzl6, fEZpvd, activity5.copydefault, activity5.EZpvd()};
                matrix2.mapPoints(fArr);
                z2 = false;
                float f9 = fArr[0];
                z = true;
                float f10 = fArr[1];
                RectF rectF = new RectF(f9, f10, f9, f10);
                for (int i = 2; i <= 6; i += 2) {
                    float f11 = fArr[i];
                    if (f11 < rectF.left) {
                        rectF.left = f11;
                    }
                    if (f11 > rectF.right) {
                        rectF.right = f11;
                    }
                    float f12 = fArr[i + 1];
                    if (f12 < rectF.top) {
                        rectF.top = f12;
                    }
                    if (f12 > rectF.bottom) {
                        rectF.bottom = f12;
                    }
                }
                float f13 = rectF.left;
                float f14 = rectF.top;
                activity2 = new SVG.Activity(f13, f14, rectF.right - f13, rectF.bottom - f14);
            } else {
                preserveAspectRatio = preserveAspectRatio3;
                z = true;
                z2 = false;
            }
        }
        float fFloor = fCopydefault + (((float) java.lang.Math.floor((activity2.copydefault - fCopydefault) / fCopydefault2)) * fCopydefault2);
        float fFloor2 = fOLrzqt2 + (((float) java.lang.Math.floor((activity2.OLrzqt - fOLrzqt2) / fOLrzqt)) * fOLrzqt);
        float fKWHzl7 = activity2.KWHzl();
        float fEZpvd2 = activity2.EZpvd();
        SVG.Activity activity6 = new SVG.Activity(0.0f, 0.0f, fCopydefault2, fOLrzqt);
        boolean zValues = values();
        while (fFloor2 < fEZpvd2) {
            float f15 = fFloor;
            while (f15 < fKWHzl7) {
                activity6.copydefault = f15;
                activity6.OLrzqt = fFloor2;
                isConnected();
                if (!this.gEmmrt.valueOf.ejfBZ.booleanValue()) {
                    KWHzl(activity6.copydefault, activity6.OLrzqt, activity6.AEQbTJ, activity6.KWHzl);
                }
                SVG.Activity activity7 = dialogInterface.getNewProxyInstance;
                if (activity7 != null) {
                    preserveAspectRatio2 = preserveAspectRatio;
                    this.KWHzl.concat(EZpvd(activity6, activity7, preserveAspectRatio2));
                } else {
                    preserveAspectRatio2 = preserveAspectRatio;
                    java.lang.Boolean bool2 = dialogInterface.KWHzl;
                    boolean z4 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                    this.KWHzl.translate(f15, fFloor2);
                    if (!z4) {
                        android.graphics.Canvas canvas = this.KWHzl;
                        SVG.Activity activity8 = packageItemInfo.ejfBZ;
                        canvas.scale(activity8.AEQbTJ, activity8.KWHzl);
                    }
                    it = dialogInterface.AYXKKw.iterator();
                    while (it.hasNext()) {
                        KWHzl(it.next());
                    }
                    fetchVPNInfo();
                    f15 += fCopydefault2;
                    preserveAspectRatio = preserveAspectRatio2;
                    z = true;
                }
                it = dialogInterface.AYXKKw.iterator();
                while (it.hasNext()) {
                }
                fetchVPNInfo();
                f15 += fCopydefault2;
                preserveAspectRatio = preserveAspectRatio2;
                z = true;
            }
            fFloor2 += fOLrzqt;
            z = true;
        }
        if (zValues) {
            OLrzqt(dialogInterface);
        }
        fetchVPNInfo();
    }

    public final void OLrzqt(SVG.DialogInterface dialogInterface, java.lang.String str) {
        SVG.Resources resourcesKWHzl = dialogInterface.getFieldNames.KWHzl(str);
        if (resourcesKWHzl == null) {
            AYXKKw("Pattern reference '%s' not found", str);
            return;
        }
        if (!(resourcesKWHzl instanceof SVG.DialogInterface)) {
            OLrzqt("Pattern href attributes must point to other pattern elements", new java.lang.Object[0]);
            return;
        }
        if (resourcesKWHzl == dialogInterface) {
            OLrzqt("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVG.DialogInterface dialogInterface2 = (SVG.DialogInterface) resourcesKWHzl;
        if (dialogInterface.EZpvd == null) {
            dialogInterface.EZpvd = dialogInterface2.EZpvd;
        }
        if (dialogInterface.KWHzl == null) {
            dialogInterface.KWHzl = dialogInterface2.KWHzl;
        }
        if (dialogInterface.copydefault == null) {
            dialogInterface.copydefault = dialogInterface2.copydefault;
        }
        if (dialogInterface.gEmmrt == null) {
            dialogInterface.gEmmrt = dialogInterface2.gEmmrt;
        }
        if (dialogInterface.djBIcL == null) {
            dialogInterface.djBIcL = dialogInterface2.djBIcL;
        }
        if (dialogInterface.valueOf == null) {
            dialogInterface.valueOf = dialogInterface2.valueOf;
        }
        if (dialogInterface.AEQbTJ == null) {
            dialogInterface.AEQbTJ = dialogInterface2.AEQbTJ;
        }
        if (dialogInterface.AYXKKw.isEmpty()) {
            dialogInterface.AYXKKw = dialogInterface2.AYXKKw;
        }
        if (dialogInterface.getNewProxyInstance == null) {
            dialogInterface.getNewProxyInstance = dialogInterface2.getNewProxyInstance;
        }
        if (dialogInterface.hDKMBd == null) {
            dialogInterface.hDKMBd = dialogInterface2.hDKMBd;
        }
        java.lang.String str2 = dialogInterface2.OLrzqt;
        if (str2 != null) {
            OLrzqt(dialogInterface, str2);
        }
    }

    public final void AEQbTJ(SVG.ClipData clipData, SVG.PackageItemInfo packageItemInfo, SVG.Activity activity) {
        float fCopydefault;
        float fOLrzqt;
        KWHzl("Mask render", new java.lang.Object[0]);
        java.lang.Boolean bool = clipData.EZpvd;
        if (bool != null && bool.booleanValue()) {
            SVG.PictureInPictureParams pictureInPictureParams = clipData.AEQbTJ;
            fCopydefault = pictureInPictureParams != null ? pictureInPictureParams.copydefault(this) : activity.AEQbTJ;
            SVG.PictureInPictureParams pictureInPictureParams2 = clipData.copydefault;
            fOLrzqt = pictureInPictureParams2 != null ? pictureInPictureParams2.OLrzqt(this) : activity.KWHzl;
        } else {
            SVG.PictureInPictureParams pictureInPictureParams3 = clipData.AEQbTJ;
            float fKWHzl = pictureInPictureParams3 != null ? pictureInPictureParams3.KWHzl(this, 1.0f) : 1.2f;
            SVG.PictureInPictureParams pictureInPictureParams4 = clipData.copydefault;
            float fKWHzl2 = pictureInPictureParams4 != null ? pictureInPictureParams4.KWHzl(this, 1.0f) : 1.2f;
            fCopydefault = fKWHzl * activity.AEQbTJ;
            fOLrzqt = fKWHzl2 * activity.KWHzl;
        }
        if (fCopydefault == 0.0f || fOLrzqt == 0.0f) {
            return;
        }
        isConnected();
        Dialog dialogCopydefault = copydefault((SVG.Resources) clipData);
        this.gEmmrt = dialogCopydefault;
        dialogCopydefault.valueOf.fJNWhG = java.lang.Float.valueOf(1.0f);
        boolean zValues = values();
        this.KWHzl.save();
        java.lang.Boolean bool2 = clipData.KWHzl;
        if (bool2 != null && !bool2.booleanValue()) {
            this.KWHzl.translate(activity.copydefault, activity.OLrzqt);
            this.KWHzl.scale(activity.AEQbTJ, activity.KWHzl);
        }
        copydefault((SVG.PackageManager) clipData, false);
        this.KWHzl.restore();
        if (zValues) {
            EZpvd(packageItemInfo, activity);
        }
        fetchVPNInfo();
    }
}
