package o;

import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.GlideException;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import o.C32113mPz;

/* JADX INFO: renamed from: o.riz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43107riz implements InterfaceC7855arh {
    public static final androidx.collection.LruCache<java.lang.String, java.lang.Integer> EZpvd = new androidx.collection.LruCache<>(100);
    public static final java.lang.String copydefault = "oklua.bundle" + java.io.File.separator;
    public Activity KWHzl;

    /* JADX INFO: renamed from: o.riz$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public interface StateListAnimator<T> {
        T OLrzqt(java.lang.String str);
    }

    @Override // o.InterfaceC7855arh
    public android.graphics.drawable.Drawable copydefault(android.content.Context context, @androidx.annotation.NonNull java.lang.String str) {
        return null;
    }

    public C43107riz(android.content.Context context) {
        this.KWHzl = new Activity(context);
    }

    @Override // o.InterfaceC7855arh
    public void KWHzl(android.view.ViewGroup viewGroup, android.content.Context context) {
        Glide.AEQbTJ(context).AkhnZx();
    }

    @Override // o.InterfaceC7855arh
    public void EZpvd(android.view.ViewGroup viewGroup, android.content.Context context) {
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        if (Glide.AEQbTJ(context).djBIcL()) {
            Glide.AEQbTJ(context).fetchVPNInfo();
        }
    }

    @Override // o.InterfaceC7855arh
    public void OLrzqt(android.content.Context context, android.widget.ImageView imageView, final java.lang.String str, @androidx.annotation.Nullable final java.lang.Boolean bool, JDImageInfo jDImageInfo, final InterfaceC7853arf interfaceC7853arf, boolean z) {
        android.graphics.drawable.Drawable drawableKWHzl = (jDImageInfo == null || android.text.TextUtils.isEmpty(jDImageInfo.getLocalUrl())) ? null : KWHzl(context, jDImageInfo);
        C5448Sc c5448ScCopydefault = new C5448Sc().EZpvd(new C43150rjp(context.getApplicationContext(), 25, 1.0f, C33052mpF.EZpvd(2.0f, context), C33070mpX.copydefault(C32113mPz.ActionBar.OcIXYQ), z)).AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.copydefault);
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.AEQbTJ(context).EZpvd(str);
        if (interfaceC7853arf != null) {
            c5335NtEZpvd = c5335NtEZpvd.OLrzqt(new RY<android.graphics.drawable.Drawable>() { // from class: o.riz.3
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bumptech.glide.load.engine.GlideException, java.lang.Object, o.Sq, boolean] */
                @Override // o.RY
                public boolean OLrzqt(@androidx.annotation.Nullable GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z2) {
                    C7870arw.AEQbTJ(glideException, "loadBlurBg error", str);
                    interfaceC7853arf.AEQbTJ(null, glideException != null ? glideException.getMessage() : null);
                    return false;
                }

                /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
                @Override // o.RY
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z2) {
                    java.lang.Boolean bool2;
                    if (drawable != null && (bool2 = bool) != null) {
                        drawable.setAutoMirrored(bool2.booleanValue());
                    }
                    if (drawable instanceof BitmapDrawable) {
                        interfaceC7853arf.AEQbTJ(((BitmapDrawable) drawable).getBitmap(), null);
                        return false;
                    }
                    interfaceC7853arf.AEQbTJ(null, "resource is not BitmapDrawable");
                    return false;
                }
            });
        } else if (drawableKWHzl != null) {
            c5448ScCopydefault = c5448ScCopydefault.OLrzqt(drawableKWHzl);
        }
        c5335NtEZpvd.OLrzqt((RX<?>) c5448ScCopydefault).EZpvd(imageView);
    }

    @Override // o.InterfaceC7855arh
    public void OLrzqt(android.content.Context context, android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, JDImageInfo jDImageInfo, final InterfaceC7853arf interfaceC7853arf, boolean z) {
        android.graphics.drawable.Drawable drawableKWHzl = (jDImageInfo == null || android.text.TextUtils.isEmpty(jDImageInfo.getLocalUrl())) ? null : KWHzl(context, jDImageInfo);
        C5448Sc c5448ScCopydefault = new C5448Sc().EZpvd(new C43150rjp(context.getApplicationContext(), 25, 1.0f, C33052mpF.EZpvd(2.0f, context), C33070mpX.copydefault(C32113mPz.ActionBar.OcIXYQ), z)).AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.copydefault);
        C5335Nt<android.graphics.Bitmap> c5335NtCopydefault = Glide.AEQbTJ(context).EZpvd().copydefault(drawable);
        if (interfaceC7853arf != null) {
            c5335NtCopydefault = c5335NtCopydefault.OLrzqt(new RY<android.graphics.Bitmap>() { // from class: o.riz.4
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bumptech.glide.load.engine.GlideException, java.lang.Object, o.Sq, boolean] */
                @Override // o.RY
                public boolean OLrzqt(@androidx.annotation.Nullable GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, boolean z2) {
                    C7870arw.AEQbTJ(glideException, "loadBlurWithDrawable error");
                    interfaceC7853arf.AEQbTJ(null, glideException != null ? glideException.getMessage() : null);
                    return false;
                }

                /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
                @Override // o.RY
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public boolean copydefault(android.graphics.Bitmap bitmap, java.lang.Object obj, InterfaceC5462Sq interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z2) {
                    interfaceC7853arf.AEQbTJ(bitmap, null);
                    return false;
                }
            });
        } else if (drawableKWHzl != null) {
            c5448ScCopydefault = c5448ScCopydefault.OLrzqt(drawableKWHzl);
        }
        c5335NtCopydefault.OLrzqt((RX<?>) c5448ScCopydefault).EZpvd(imageView);
    }

    @Override // o.InterfaceC7855arh
    public void copydefault(android.content.Context context, android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, java.lang.String str) {
        Glide.AEQbTJ(context).AEQbTJ(drawable).OLrzqt((RX<?>) new C5448Sc().EZpvd(new C43149rjo(context.getApplicationContext(), str)).AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.copydefault)).EZpvd(imageView);
    }

    @Override // o.InterfaceC7855arh
    public void copydefault() {
        this.KWHzl.OLrzqt();
    }

    @Override // o.InterfaceC7855arh
    public void EZpvd(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable java.lang.Boolean bool, JDImageInfo jDImageInfo, @androidx.annotation.Nullable RectF rectF, @androidx.annotation.Nullable InterfaceC7852are interfaceC7852are) {
        EZpvd(context, imageView, str, bool, jDImageInfo, rectF, false, interfaceC7852are);
    }

    public final void EZpvd(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable final java.lang.Boolean bool, JDImageInfo jDImageInfo, @androidx.annotation.Nullable RectF rectF, boolean z, @androidx.annotation.Nullable final InterfaceC7852are interfaceC7852are) {
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd;
        android.graphics.drawable.Drawable drawableKWHzl;
        if (android.text.TextUtils.isEmpty(str)) {
            if (interfaceC7852are != null) {
                interfaceC7852are.copydefault(null, "image url is null");
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.endsWith(".mp4")) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            if (interfaceC7852are != null) {
                interfaceC7852are.copydefault(null, "empty url");
                return;
            }
            return;
        }
        boolean zEndsWith = str.toLowerCase().endsWith(".gif");
        if (zEndsWith) {
            c5335NtEZpvd = Glide.AEQbTJ(context).copydefault().copydefault(str);
        } else {
            c5335NtEZpvd = Glide.AEQbTJ(context).EZpvd(str);
        }
        C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = c5335NtEZpvd.OLrzqt(new RY<android.graphics.drawable.Drawable>() { // from class: o.riz.1
            @Override // o.RY
            public boolean OLrzqt(@androidx.annotation.Nullable GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z2) {
                C7870arw.AEQbTJ(glideException, "load image error", obj);
                InterfaceC7852are interfaceC7852are2 = interfaceC7852are;
                if (interfaceC7852are2 == null) {
                    return false;
                }
                interfaceC7852are2.copydefault(null, glideException != null ? glideException.getMessage() : null);
                return false;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
            @Override // o.RY
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z2) {
                java.lang.Boolean bool2;
                if (drawable != null && (bool2 = bool) != null) {
                    drawable.setAutoMirrored(bool2.booleanValue());
                }
                InterfaceC7852are interfaceC7852are2 = interfaceC7852are;
                if (interfaceC7852are2 == null) {
                    return false;
                }
                interfaceC7852are2.copydefault(drawable, null);
                return false;
            }
        });
        C5448Sc c5448ScCopydefault = new C5448Sc().AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.AEQbTJ);
        if (str.toLowerCase().endsWith(".svg")) {
            if (str.startsWith("SVG:")) {
                c5448ScCopydefault = c5448ScCopydefault.copydefault(AbstractC5360Os.OLrzqt).AEQbTJ(DecodeFormat.PREFER_ARGB_8888);
            } else {
                c5448ScCopydefault = c5448ScCopydefault.copydefault(AbstractC5360Os.EZpvd);
            }
        } else if (zEndsWith) {
            c5448ScCopydefault = c5448ScCopydefault.copydefault(AbstractC5360Os.OLrzqt);
        } else if (str.startsWith("PIXEL:")) {
            c5448ScCopydefault = c5448ScCopydefault.copydefault(AbstractC5360Os.OLrzqt).AEQbTJ(DecodeFormat.PREFER_ARGB_8888);
        }
        if (jDImageInfo != null && !android.text.TextUtils.isEmpty(jDImageInfo.getLocalUrl()) && (drawableKWHzl = KWHzl(context, jDImageInfo)) != null) {
            c5448ScCopydefault = c5448ScCopydefault.AEQbTJ(drawableKWHzl);
        }
        if (z) {
            c5448ScCopydefault = c5448ScCopydefault.AEQbTJ(DecodeFormat.PREFER_ARGB_8888).OLrzqt(Integer.MIN_VALUE);
        }
        c5335NtOLrzqt.OLrzqt((RX<?>) c5448ScCopydefault).EZpvd(imageView);
    }

    @Override // o.InterfaceC7855arh
    public void OLrzqt(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable java.lang.Boolean bool, JDImageInfo jDImageInfo, @androidx.annotation.Nullable RectF rectF, @androidx.annotation.Nullable InterfaceC7852are interfaceC7852are) {
        EZpvd(context.getApplicationContext(), imageView, str, bool, jDImageInfo, rectF, interfaceC7852are);
    }

    @Override // o.InterfaceC7855arh
    public void KWHzl(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable final java.lang.Boolean bool, @androidx.annotation.Nullable JDImageInfo jDImageInfo, @androidx.annotation.Nullable RectF rectF, @androidx.annotation.Nullable final InterfaceC7852are interfaceC7852are) {
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd;
        android.graphics.drawable.Drawable drawableKWHzl;
        if (Build.VERSION.SDK_INT <= 25 && str.endsWith(".mp4")) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            if (interfaceC7852are != null) {
                interfaceC7852are.copydefault(null, "image url is null");
                return;
            }
            return;
        }
        if (str.toLowerCase().contains(".gif")) {
            c5335NtEZpvd = Glide.AEQbTJ(context).copydefault().copydefault(str);
        } else {
            c5335NtEZpvd = Glide.AEQbTJ(context).EZpvd(str);
        }
        C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = c5335NtEZpvd.OLrzqt(new RY<android.graphics.drawable.Drawable>() { // from class: o.riz.2
            @Override // o.RY
            public boolean OLrzqt(@androidx.annotation.Nullable GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
                C7870arw.AEQbTJ(glideException, "load image error", obj);
                InterfaceC7852are interfaceC7852are2 = interfaceC7852are;
                if (interfaceC7852are2 == null) {
                    return false;
                }
                interfaceC7852are2.copydefault(null, glideException != null ? glideException.getMessage() : null);
                return false;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
            @Override // o.RY
            public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
                java.lang.Boolean bool2;
                if (drawable != null && (bool2 = bool) != null) {
                    drawable.setAutoMirrored(bool2.booleanValue());
                }
                InterfaceC7852are interfaceC7852are2 = interfaceC7852are;
                if (interfaceC7852are2 == null) {
                    return false;
                }
                interfaceC7852are2.copydefault(drawable, null);
                return false;
            }
        });
        C5448Sc c5448ScCopydefault = new C5448Sc().AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.KWHzl);
        if (jDImageInfo != null && !android.text.TextUtils.isEmpty(jDImageInfo.getLocalUrl()) && (drawableKWHzl = KWHzl(context, jDImageInfo)) != null) {
            c5448ScCopydefault = c5448ScCopydefault.AEQbTJ(drawableKWHzl);
        }
        c5335NtOLrzqt.OLrzqt((RX<?>) c5448ScCopydefault).EZpvd(imageView);
    }

    @Override // o.InterfaceC7855arh
    public void copydefault(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable java.lang.Boolean bool, JDImageInfo jDImageInfo, @androidx.annotation.Nullable RectF rectF, @androidx.annotation.Nullable InterfaceC7852are interfaceC7852are) {
        EZpvd(context, imageView, str, bool, jDImageInfo, rectF, true, interfaceC7852are);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    @Override // o.InterfaceC7855arh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.graphics.drawable.Drawable KWHzl(android.content.Context context, @androidx.annotation.NonNull JDImageInfo jDImageInfo) throws java.lang.Throwable {
        android.graphics.drawable.Drawable bitmapDrawable;
        java.lang.Exception e;
        java.io.InputStream inputStreamGEmmrt;
        Application applicationEZpvd = EZpvd(context, jDImageInfo);
        java.io.InputStream inputStream = null;
        if (applicationEZpvd == null) {
            C7870arw.EZpvd("MiniApp", "fail to getImagePath " + jDImageInfo.getLocalUrl());
            return null;
        }
        if (applicationEZpvd.OLrzqt == 2) {
            bitmapDrawable = ContextCompat.getDrawable(context, applicationEZpvd.AEQbTJ);
            if (bitmapDrawable != null) {
                bitmapDrawable = bitmapDrawable.mutate();
            }
        } else {
            android.graphics.Bitmap bitmapEZpvd = this.KWHzl.EZpvd(applicationEZpvd.copydefault);
            if (bitmapEZpvd == null) {
                try {
                    if (applicationEZpvd.OLrzqt == 1) {
                        inputStreamGEmmrt = C7864arq.OLrzqt(context, applicationEZpvd.copydefault);
                    } else {
                        inputStreamGEmmrt = C7864arq.gEmmrt(applicationEZpvd.copydefault);
                    }
                    if (inputStreamGEmmrt != null) {
                        try {
                            try {
                                bitmapEZpvd = BitmapFactory.decodeStream(inputStreamGEmmrt);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                inputStream = inputStreamGEmmrt;
                                if (inputStream != null) {
                                    C7866ars.AEQbTJ((java.io.Closeable) inputStream);
                                }
                                throw th;
                            }
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            C7870arw.EZpvd("MiniApp", "loadProjectImage error", e);
                            if (inputStreamGEmmrt != null) {
                            }
                            if (bitmapEZpvd != null) {
                            }
                            if (bitmapEZpvd != null) {
                            }
                        }
                    }
                } catch (java.lang.Exception e3) {
                    e = e3;
                    inputStreamGEmmrt = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                    }
                    throw th;
                }
                if (inputStreamGEmmrt != null) {
                    C7866ars.AEQbTJ((java.io.Closeable) inputStreamGEmmrt);
                }
                if (bitmapEZpvd != null) {
                    bitmapEZpvd.setHasAlpha(true);
                    this.KWHzl.EZpvd(applicationEZpvd.copydefault, bitmapEZpvd);
                }
            }
            if (bitmapEZpvd != null) {
                return null;
            }
            bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapEZpvd);
        }
        if (bitmapDrawable != null) {
            if (jDImageInfo.isNeedTint() && jDImageInfo.getTintColor() != null) {
                DrawableCompat.setTint(bitmapDrawable, jDImageInfo.getTintColor().getColor(context));
            }
            if (jDImageInfo.getSize() != null) {
                C43113rjE c43113rjE = new C43113rjE(bitmapDrawable);
                c43113rjE.setBounds(0, 0, jDImageInfo.getSize().copydefault(), jDImageInfo.getSize().AEQbTJ());
                bitmapDrawable = c43113rjE;
            }
            java.lang.Boolean boolIsAutoMirrored = jDImageInfo.isAutoMirrored();
            if (boolIsAutoMirrored != null) {
                bitmapDrawable.setAutoMirrored(boolIsAutoMirrored.booleanValue());
            }
        }
        return bitmapDrawable;
    }

    @Override // o.InterfaceC7855arh
    public void KWHzl(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable final java.lang.Boolean bool, @androidx.annotation.Nullable RectF rectF, @androidx.annotation.Nullable final InterfaceC7852are interfaceC7852are) {
        Glide.AEQbTJ(context).EZpvd(str).OLrzqt(new RY<android.graphics.drawable.Drawable>() { // from class: o.riz.5
            @Override // o.RY
            public boolean OLrzqt(@androidx.annotation.Nullable GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
                C7870arw.AEQbTJ(glideException, "preload image error", obj);
                InterfaceC7852are interfaceC7852are2 = interfaceC7852are;
                if (interfaceC7852are2 == null) {
                    return false;
                }
                interfaceC7852are2.copydefault(null, glideException != null ? glideException.getMessage() : null);
                return false;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
            @Override // o.RY
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
                java.lang.Boolean bool2;
                if (drawable != null && (bool2 = bool) != null) {
                    drawable.setAutoMirrored(bool2.booleanValue());
                }
                InterfaceC7852are interfaceC7852are2 = interfaceC7852are;
                if (interfaceC7852are2 == null) {
                    return false;
                }
                interfaceC7852are2.copydefault(drawable, null);
                return false;
            }
        }).EZpvd();
    }

    @Override // o.InterfaceC7855arh
    public java.lang.String OLrzqt(android.content.Context context, @androidx.annotation.NonNull JDImageInfo jDImageInfo) {
        Application applicationEZpvd = EZpvd(context, jDImageInfo);
        if (applicationEZpvd == null) {
            C7870arw.EZpvd("MiniApp", "fail to getImagePath " + jDImageInfo.getLocalUrl());
            return null;
        }
        java.lang.String str = applicationEZpvd.copydefault;
        if (applicationEZpvd.OLrzqt == 1) {
            return "file:///android_asset/" + applicationEZpvd.copydefault;
        }
        return applicationEZpvd.copydefault;
    }

    public final Application EZpvd(android.content.Context context, @androidx.annotation.NonNull JDImageInfo jDImageInfo) {
        if (jDImageInfo.getOkIcon() != 0) {
            return Application.copydefault(jDImageInfo.getOkIcon());
        }
        if (android.text.TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            return null;
        }
        Application applicationAEQbTJ = jDImageInfo.getMiniAppResourceLoader() != null ? AEQbTJ(context, jDImageInfo) : null;
        if (applicationAEQbTJ != null) {
            return applicationAEQbTJ;
        }
        Application applicationAEQbTJ2 = AEQbTJ(context, jDImageInfo, C7788aqT.AEQbTJ().AEQbTJ(context, ""));
        return applicationAEQbTJ2 != null ? applicationAEQbTJ2 : EZpvd(context, jDImageInfo, copydefault);
    }

    public final Application EZpvd(final android.content.Context context, JDImageInfo jDImageInfo, final java.lang.String str) {
        if (context == null) {
            return null;
        }
        if (str.startsWith("file://android_asset/")) {
            str = str.replace("file://android_asset/", "");
        }
        if (str.startsWith("file:///android_asset/")) {
            str = str.replace("file:///android_asset/", "");
        }
        return Application.copydefault((java.lang.String) AEQbTJ(context, jDImageInfo, true, new StateListAnimator() { // from class: o.riC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C43107riz.StateListAnimator
            public final java.lang.Object OLrzqt(java.lang.String str2) {
                return C43107riz.KWHzl(str, context, str2);
            }
        }));
    }

    public static /* synthetic */ java.lang.String KWHzl(java.lang.String str, android.content.Context context, java.lang.String str2) {
        java.lang.String str3 = str + str2;
        if (C7864arq.KWHzl(context, str3)) {
            return str3;
        }
        return null;
    }

    public final Application OLrzqt(android.content.Context context, JDImageInfo jDImageInfo, final java.lang.String str) {
        java.io.File file = (java.io.File) AEQbTJ(context, jDImageInfo, false, new StateListAnimator() { // from class: o.riB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C43107riz.StateListAnimator
            public final java.lang.Object OLrzqt(java.lang.String str2) {
                return C43107riz.KWHzl(str, str2);
            }
        });
        if (file != null) {
            return Application.EZpvd(file.getAbsolutePath());
        }
        return null;
    }

    public static /* synthetic */ java.io.File KWHzl(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str, str2);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final Application AEQbTJ(android.content.Context context, JDImageInfo jDImageInfo, java.lang.String str) {
        Application applicationEZpvd;
        if (context == null) {
            return null;
        }
        return (!str.contains("android_asset") || (applicationEZpvd = EZpvd(context, jDImageInfo, str)) == null) ? OLrzqt(context, jDImageInfo, str) : applicationEZpvd;
    }

    public Application AEQbTJ(android.content.Context context, JDImageInfo jDImageInfo) {
        C43045rhq miniAppResourceLoader = jDImageInfo.getMiniAppResourceLoader();
        java.lang.String str = miniAppResourceLoader.AEQbTJ() + "/";
        if (miniAppResourceLoader.KWHzl()) {
            return OLrzqt(context, jDImageInfo, str);
        }
        return EZpvd(context, jDImageInfo, str);
    }

    public final <T> T AEQbTJ(android.content.Context context, JDImageInfo jDImageInfo, boolean z, StateListAnimator<T> stateListAnimator) {
        ActionBar actionBar = new ActionBar(context, jDImageInfo, z);
        while (actionBar.hasNext()) {
            T tOLrzqt = stateListAnimator.OLrzqt(actionBar.next());
            if (tOLrzqt != null) {
                return tOLrzqt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o.riz$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public static class ActionBar implements java.util.Iterator<java.lang.String> {
        public JDImageInfo AEQbTJ;
        public boolean EZpvd;
        public int OLrzqt = 0;
        public android.content.Context copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.OLrzqt <= 3;
        }

        public ActionBar(android.content.Context context, JDImageInfo jDImageInfo, boolean z) {
            this.copydefault = context;
            this.AEQbTJ = jDImageInfo;
            this.EZpvd = z;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public java.lang.String next() {
            int i = this.OLrzqt + 1;
            this.OLrzqt = i;
            if (i == 1) {
                return this.AEQbTJ.getLocalPath(this.copydefault, this.EZpvd ? ".webp" : ".png");
            }
            if (i == 2) {
                return this.AEQbTJ.getDayLocalPath(this.EZpvd ? ".webp" : ".png");
            }
            if (i == 3) {
                return this.AEQbTJ.getLocalPath(this.copydefault, this.EZpvd ? ".png" : ".webp");
            }
            if (i != 4) {
                return null;
            }
            return this.AEQbTJ.getDayLocalPath(this.EZpvd ? ".png" : ".webp");
        }
    }

    /* JADX INFO: renamed from: o.riz$Activity */
    public static class Activity {
        public androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> OLrzqt;

        public Activity(android.content.Context context) {
            int memoryClass = (((android.app.ActivityManager) context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY)).getMemoryClass() * 1048576) / 16;
            memoryClass = memoryClass > 16777216 ? 16777216 : memoryClass;
            this.OLrzqt = new androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap>(memoryClass >= 1048576 ? memoryClass : 1048576) { // from class: o.riz.Activity.2
                /* JADX DEBUG: Method merged with bridge method: sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I */
                @Override // androidx.collection.LruCache
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public int sizeOf(java.lang.String str, android.graphics.Bitmap bitmap) {
                    if (Build.VERSION.SDK_INT < 26) {
                        return bitmap.getByteCount();
                    }
                    return bitmap.getRowBytes() * bitmap.getHeight();
                }
            };
        }

        public void EZpvd(java.lang.String str, android.graphics.Bitmap bitmap) {
            if (str == null || bitmap == null) {
                return;
            }
            this.OLrzqt.put(str, bitmap);
        }

        public android.graphics.Bitmap EZpvd(java.lang.String str) {
            if (str == null) {
                return null;
            }
            return this.OLrzqt.get(str);
        }

        public void OLrzqt() {
            try {
                this.OLrzqt.evictAll();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: o.riz$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static class Application {
        public int AEQbTJ;
        public int OLrzqt;
        public java.lang.String copydefault;

        public static Application EZpvd(@androidx.annotation.Nullable java.lang.String str) {
            if (str == null) {
                return null;
            }
            Application application = new Application();
            application.OLrzqt = 0;
            application.copydefault = str;
            return application;
        }

        public static Application copydefault(@androidx.annotation.Nullable java.lang.String str) {
            if (str == null) {
                return null;
            }
            Application application = new Application();
            application.OLrzqt = 1;
            application.copydefault = str;
            return application;
        }

        public static Application copydefault(@androidx.annotation.Nullable int i) {
            Application application = new Application();
            application.OLrzqt = 2;
            application.AEQbTJ = i;
            return application;
        }
    }
}
