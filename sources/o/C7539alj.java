package o;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.immomo.mls.adapter.MLSThreadAdapter;
import com.immomo.mls.fun.constants.ContentMode;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.view.UDImageView;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import com.immomo.mls.util.BitmapUtil;
import com.immomo.mls.utils.AssertUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import o.InterfaceC7383aim;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.alj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7539alj<U extends UDImageView> extends C7810aqp implements InterfaceC7383aim<U>, InterfaceC7471akU {
    public boolean AEQbTJ;
    public final AtomicInteger AYXKKw;
    public RectF AhwBna;
    public UDImageView DbNXlk;
    public InterfaceC7383aim.ActionBar EZpvd;
    public java.lang.String KWHzl;
    public JDImageInfo OLrzqt;
    public float copydefault;
    public android.graphics.Bitmap djBIcL;
    public final InterfaceC7855arh gEmmrt;
    public C7539alj<U>.Activity valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        float f = this.copydefault;
        return f > 0.0f && f <= 25.0f && this.valueOf == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7471akU
    public boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl(java.lang.String str) {
        return str == null ? "Image url is nil" : "Image url is empty";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7471akU
    public JDImageInfo OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setImageUrlEmpty() {
        this.OLrzqt = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7471akU
    public void setLazyLoad(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLocalUrl(java.lang.String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.EZpvd = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public U getUserdata() {
        return (U) this.DbNXlk;
    }

    public C7539alj(android.content.Context context, UDImageView uDImageView, LuaValue[] luaValueArr) {
        super(context);
        this.copydefault = -1.0f;
        this.AEQbTJ = C7330ahm.AhwBna;
        this.DbNXlk = uDImageView;
        forceClipLevel(1);
        setLocalUrl(this.DbNXlk.zuBGHE().EZpvd);
        setViewLifeCycleCallback(this.DbNXlk);
        setScaleType(ImageView.ScaleType.values()[ContentMode.SCALE_ASPECT_FIT]);
        this.AYXKKw = new AtomicInteger(0);
        InterfaceC7855arh interfaceC7855arhAYXKKw = C7323ahf.AYXKKw();
        this.gEmmrt = interfaceC7855arhAYXKKw;
        AssertUtils.AEQbTJ(interfaceC7855arhAYXKKw);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824 && mode2 != 1073741824) {
            int measuredWidth = getMeasuredWidth();
            int intrinsicHeight = (drawable.getIntrinsicHeight() * measuredWidth) / drawable.getIntrinsicWidth();
            if (mode2 == Integer.MIN_VALUE) {
                intrinsicHeight = java.lang.Math.min(intrinsicHeight, View.MeasureSpec.getSize(i2));
            }
            setMeasuredDimension(measuredWidth, intrinsicHeight);
            return;
        }
        if (mode == 1073741824 || mode2 != 1073741824) {
            return;
        }
        int measuredHeight = getMeasuredHeight();
        int intrinsicWidth = (drawable.getIntrinsicWidth() * measuredHeight) / drawable.getIntrinsicHeight();
        if (mode == Integer.MIN_VALUE) {
            intrinsicWidth = java.lang.Math.min(intrinsicWidth, View.MeasureSpec.getSize(i));
        }
        setMeasuredDimension(intrinsicWidth, measuredHeight);
    }

    @Override // o.C7772aqD, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        getUserdata().OLrzqt(canvas);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (getScaleType() == scaleType) {
            return;
        }
        super.setScaleType(scaleType);
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable != null) {
            setImageDrawable(null);
            setImageDrawable(drawable);
        }
    }

    @Override // o.InterfaceC7471akU
    public void setImage(JDImageInfo jDImageInfo) {
        boolean z = !Objects.equals(this.OLrzqt, jDImageInfo);
        if (z || android.text.TextUtils.isEmpty(jDImageInfo.getName())) {
            this.OLrzqt = jDImageInfo;
            setImageWithoutCheck(jDImageInfo, null, z, false, false);
        }
    }

    @Override // o.InterfaceC7471akU
    public void EZpvd(java.util.List<JDImageInfo> list, long j, boolean z) {
        C7539alj<U>.Activity activity = this.valueOf;
        if (activity != null) {
            activity.stop();
        }
        C7539alj<U>.Activity activity2 = new Activity(list, j, z);
        this.valueOf = activity2;
        activity2.start();
    }

    @Override // o.InterfaceC7471akU
    public void copydefault() {
        C7539alj<U>.Activity activity = this.valueOf;
        if (activity != null) {
            activity.stop();
        }
        this.valueOf = null;
    }

    @Override // o.InterfaceC7471akU
    public boolean AEQbTJ() {
        C7539alj<U>.Activity activity = this.valueOf;
        return activity != null && activity.isRunning();
    }

    @Override // o.InterfaceC7471akU
    public void setImageUrlWithPlaceHolder(JDImageInfo jDImageInfo, JDImageInfo jDImageInfo2) {
        if (!android.text.TextUtils.isEmpty(jDImageInfo.getAbsolutePath())) {
            this.OLrzqt = jDImageInfo;
            copydefault(jDImageInfo, jDImageInfo2, true);
            return;
        }
        JDImageInfo jDImageInfo3 = this.OLrzqt;
        java.lang.String localUrl = jDImageInfo3 == null ? "" : jDImageInfo3.getLocalUrl();
        if (android.text.TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            if (jDImageInfo2 == null) {
                setImageDrawable(null);
            } else {
                this.OLrzqt = jDImageInfo2;
                InterfaceC7855arh interfaceC7855arhAYXKKw = C7323ahf.AYXKKw();
                if (interfaceC7855arhAYXKKw != null) {
                    setImageDrawable(interfaceC7855arhAYXKKw.KWHzl(getContext(), jDImageInfo2));
                } else {
                    setImageDrawable(null);
                }
            }
        }
        if (!(!android.text.TextUtils.equals(jDImageInfo.getLocalUrl(), localUrl))) {
            if (android.text.TextUtils.isEmpty(jDImageInfo.getLocalUrl()) && this.DbNXlk.gEmmrt()) {
                this.DbNXlk.AEQbTJ(false, jDImageInfo.getLocalUrl(), KWHzl(jDImageInfo.getLocalUrl()));
                return;
            }
            return;
        }
        this.OLrzqt = jDImageInfo;
        setImageWithoutCheck(jDImageInfo, jDImageInfo2, false, true, true);
    }

    @Override // o.InterfaceC7471akU
    public void setImageUrlWithPlaceHolderAndOriginSize(JDImageInfo jDImageInfo, JDImageInfo jDImageInfo2) {
        if (jDImageInfo != null && jDImageInfo.isNetUrl() && !android.text.TextUtils.isEmpty(jDImageInfo.getNetUrl())) {
            this.OLrzqt = jDImageInfo;
            OLrzqt(jDImageInfo.getNetUrl(), jDImageInfo.isAutoMirrored(), jDImageInfo2);
        } else {
            setImageUrlWithPlaceHolder(jDImageInfo, jDImageInfo2);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C7539alj<U>.Activity activity = this.valueOf;
        if (activity != null) {
            activity.stop();
        }
        InterfaceC7383aim.ActionBar actionBar = this.EZpvd;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable instanceof QX) {
            QX qx = (QX) drawable;
            if (qx.isRunning()) {
                qx.stop();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7539alj<U>.Activity activity = this.valueOf;
        if (activity != null) {
            activity.start();
        }
        InterfaceC7383aim.ActionBar actionBar = this.EZpvd;
        if (actionBar != null) {
            actionBar.copydefault();
        }
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable instanceof QX) {
            QX qx = (QX) drawable;
            if (qx.isRunning()) {
                return;
            }
            qx.start();
        }
    }

    public RectF djBIcL() {
        if (!gEmmrt()) {
            return null;
        }
        float[] radii = getRadii();
        if (this.AhwBna == null) {
            this.AhwBna = new RectF();
        }
        this.AhwBna.set(radii[0], radii[6], radii[2], radii[4]);
        return this.AhwBna;
    }

    @Override // o.InterfaceC7471akU
    public void setBgBlurCheck(JDImageInfo jDImageInfo, JDImageInfo jDImageInfo2, boolean z) {
        if (jDImageInfo == null || jDImageInfo2 == null) {
            return;
        }
        if (jDImageInfo.isNetUrl()) {
            this.gEmmrt.OLrzqt(getContext(), this, jDImageInfo.getNetUrl(), jDImageInfo.isAutoMirrored(), jDImageInfo2, KWHzl(), z);
            return;
        }
        android.graphics.drawable.Drawable drawableKWHzl = this.gEmmrt.KWHzl(getContext(), jDImageInfo);
        if (drawableKWHzl != null) {
            this.gEmmrt.OLrzqt(getContext(), this, drawableKWHzl, jDImageInfo2, KWHzl(), z);
        } else if (C7872ary.gEmmrt(jDImageInfo.getLocalUrl())) {
            this.gEmmrt.OLrzqt(getContext(), this, C7872ary.OLrzqt(jDImageInfo.getLocalUrl()), jDImageInfo.isAutoMirrored(), jDImageInfo2, KWHzl(), z);
        }
    }

    @Override // o.InterfaceC7471akU
    public void setPlaceHolderNoText(JDImageInfo jDImageInfo, java.lang.String str) {
        android.graphics.drawable.Drawable drawableKWHzl;
        if (jDImageInfo == null || (drawableKWHzl = this.gEmmrt.KWHzl(getContext(), jDImageInfo)) == null) {
            return;
        }
        this.gEmmrt.copydefault(getContext(), this, drawableKWHzl, str);
    }

    @Override // o.InterfaceC7471akU
    public void setImageWithBase64AndCallback(java.lang.String str, boolean z, UDImageInfo uDImageInfo) {
        java.lang.String strSubstring;
        java.lang.String strSubstring2 = str.startsWith("BASE64:") ? str.substring(7) : str;
        if (strSubstring2.startsWith("SVG:")) {
            strSubstring = strSubstring2.substring(4);
        } else {
            strSubstring = strSubstring2.substring(6);
        }
        final java.lang.String strKWHzl = C54809xWc.KWHzl(strSubstring);
        Glide.AEQbTJ(getContext()).EZpvd(str).OLrzqt(new RY<android.graphics.drawable.Drawable>() { // from class: o.alj.5
            @Override // o.RY
            public boolean OLrzqt(@androidx.annotation.Nullable GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z2) {
                C7539alj.this.DbNXlk.AEQbTJ(false, strKWHzl, (java.lang.String) null);
                return false;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
            @Override // o.RY
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z2) {
                C7539alj.this.DbNXlk.AEQbTJ(true, strKWHzl, "");
                return false;
            }
        }).EZpvd((android.widget.ImageView) this);
    }

    public final void setImageWithoutCheck(JDImageInfo jDImageInfo, JDImageInfo jDImageInfo2, boolean z, boolean z2, boolean z3) {
        if (!android.text.TextUtils.isEmpty(jDImageInfo.getAbsolutePath())) {
            copydefault(jDImageInfo, jDImageInfo2, z3);
            return;
        }
        if (z && jDImageInfo.isNetUrl()) {
            setImageDrawable(null);
        }
        if (jDImageInfo.isNetUrl()) {
            KWHzl(jDImageInfo.getNetUrl(), jDImageInfo.isAutoMirrored(), jDImageInfo2, z3);
            return;
        }
        android.graphics.drawable.Drawable drawableKWHzl = this.gEmmrt.KWHzl(getContext(), jDImageInfo);
        if (drawableKWHzl != null) {
            setImageDrawable(drawableKWHzl);
            if (z3) {
                this.DbNXlk.AEQbTJ(true, jDImageInfo.getLocalUrl(), (java.lang.String) null);
                return;
            }
            return;
        }
        if (C7872ary.gEmmrt(jDImageInfo.getLocalUrl())) {
            KWHzl(C7872ary.OLrzqt(jDImageInfo.getLocalUrl()), jDImageInfo.isAutoMirrored(), jDImageInfo2, z3);
            return;
        }
        java.lang.String strAhwBna = AhwBna();
        if (!android.text.TextUtils.isEmpty(strAhwBna)) {
            java.io.File file = new java.io.File(strAhwBna, jDImageInfo.getLocalUrl());
            if (file.exists()) {
                KWHzl(file.getAbsolutePath(), jDImageInfo.isAutoMirrored(), jDImageInfo2, z3);
                return;
            }
        }
        KWHzl(jDImageInfo.getLocalUrl(), jDImageInfo.isAutoMirrored(), jDImageInfo2, z3);
    }

    public final void setPlaceHolderByParams(JDImageInfo jDImageInfo, boolean z) {
        InterfaceC7855arh interfaceC7855arhAYXKKw;
        if (z) {
            if (jDImageInfo.isNetUrl() || (interfaceC7855arhAYXKKw = C7323ahf.AYXKKw()) == null) {
                return;
            }
            setImageDrawable(interfaceC7855arhAYXKKw.KWHzl(getContext(), jDImageInfo));
            return;
        }
        setImageDrawable(null);
    }

    public final void OLrzqt(final java.lang.String str, @androidx.annotation.Nullable final java.lang.Boolean bool, final JDImageInfo jDImageInfo) {
        this.gEmmrt.KWHzl(getContext(), str, bool, djBIcL(), new InterfaceC7852are() { // from class: o.alj.1
            @Override // o.InterfaceC7852are
            public void copydefault(android.graphics.drawable.Drawable drawable, java.lang.String str2) {
                if (drawable != null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    C7539alj.this.djBIcL = null;
                    C7539alj.this.AYXKKw.incrementAndGet();
                    InterfaceC7855arh interfaceC7855arh = C7539alj.this.gEmmrt;
                    android.content.Context context = C7539alj.this.getContext();
                    C7539alj c7539alj = C7539alj.this;
                    interfaceC7855arh.copydefault(context, c7539alj, str, bool, jDImageInfo, c7539alj.djBIcL(), C7539alj.this.copydefault(str, true, intrinsicWidth, intrinsicHeight));
                    return;
                }
                C7539alj.this.DbNXlk.AEQbTJ(false, str, str2);
            }
        });
    }

    public final void KWHzl(java.lang.String str, @androidx.annotation.Nullable java.lang.Boolean bool, JDImageInfo jDImageInfo, boolean z) {
        this.djBIcL = null;
        this.AYXKKw.incrementAndGet();
        if (this.AEQbTJ) {
            this.gEmmrt.EZpvd(getContext(), this, str, bool, jDImageInfo, djBIcL(), copydefault(str, z, 0, 0));
        } else {
            this.gEmmrt.OLrzqt(getContext(), this, str, bool, jDImageInfo, djBIcL(), copydefault(str, z, 0, 0));
        }
    }

    public final void copydefault(JDImageInfo jDImageInfo, JDImageInfo jDImageInfo2, boolean z) {
        this.djBIcL = null;
        this.AYXKKw.incrementAndGet();
        android.content.Context context = this.AEQbTJ ? getContext() : getContext().getApplicationContext();
        java.lang.String absolutePath = jDImageInfo.getAbsolutePath();
        this.gEmmrt.KWHzl(context, this, absolutePath, jDImageInfo.isAutoMirrored(), jDImageInfo2, djBIcL(), copydefault(absolutePath, z, 0, 0));
    }

    public InterfaceC7853arf KWHzl() {
        if (this.DbNXlk.AhwBna()) {
            return new InterfaceC7853arf() { // from class: o.alj.4
                @Override // o.InterfaceC7853arf
                public void AEQbTJ(final android.graphics.Bitmap bitmap, final java.lang.String str) {
                    C7840arS.copydefault(new java.lang.Runnable() { // from class: o.alj.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (C7539alj.this.DbNXlk.AhwBna()) {
                                C7539alj.this.DbNXlk.copydefault(bitmap != null, str);
                            }
                        }
                    });
                }
            };
        }
        return null;
    }

    public InterfaceC7852are copydefault(final java.lang.String str, boolean z, final int i, final int i2) {
        if (z) {
            return new InterfaceC7852are() { // from class: o.alj.3
                @Override // o.InterfaceC7852are
                public void copydefault(final android.graphics.drawable.Drawable drawable, final java.lang.String str2) {
                    C7840arS.copydefault(new java.lang.Runnable() { // from class: o.alj.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            if (i > 0 && i2 > 0) {
                                UDImageView uDImageView = C7539alj.this.DbNXlk;
                                boolean z2 = drawable != null;
                                AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                                uDImageView.EZpvd(z2, str, str2, i, i2);
                                return;
                            }
                            C7539alj.this.DbNXlk.AEQbTJ(drawable != null, str, str2);
                        }
                    });
                    if (C7539alj.this.AYXKKw()) {
                        if ((drawable instanceof BitmapDrawable) || (drawable instanceof QX)) {
                            C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new java.lang.Runnable() { // from class: o.alj.3.4
                                @Override // java.lang.Runnable
                                public void run() {
                                    C7539alj.this.copydefault(drawable);
                                }
                            });
                        }
                    }
                }
            };
        }
        if (AYXKKw()) {
            return new InterfaceC7852are() { // from class: o.alj.2
                @Override // o.InterfaceC7852are
                public void copydefault(final android.graphics.drawable.Drawable drawable, java.lang.String str2) {
                    if (C7539alj.this.AYXKKw()) {
                        if ((drawable instanceof BitmapDrawable) || (drawable instanceof QX)) {
                            C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new java.lang.Runnable() { // from class: o.alj.2.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    C7539alj.this.copydefault(drawable);
                                }
                            });
                        }
                    }
                }
            };
        }
        return null;
    }

    @Override // o.InterfaceC7471akU
    public void setBlurImage(float f) {
        if (f == this.copydefault) {
            return;
        }
        this.copydefault = f;
        final android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable instanceof BitmapDrawable) {
            C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new java.lang.Runnable() { // from class: o.alj.9
                @Override // java.lang.Runnable
                public void run() {
                    C7539alj.this.copydefault(drawable);
                }
            });
        }
    }

    public final void copydefault(android.graphics.drawable.Drawable drawable) {
        android.graphics.Bitmap bitmap;
        Bitmap.Config config;
        if (this.copydefault == 0.0f && this.djBIcL != null) {
            C7840arS.copydefault(new java.lang.Runnable() { // from class: o.alj.7
                @Override // java.lang.Runnable
                public void run() {
                    C7539alj c7539alj = C7539alj.this;
                    c7539alj.setImageBitmap(c7539alj.djBIcL);
                }
            });
            return;
        }
        if (AYXKKw()) {
            if (drawable instanceof QX) {
                bitmap = ((QX) drawable).OLrzqt();
            } else {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
            android.graphics.Bitmap bitmap2 = this.djBIcL;
            if (bitmap2 != null) {
                bitmap = bitmap2;
            }
            if (bitmap == null) {
                return;
            }
            final int i = this.AYXKKw.get();
            if (this.djBIcL == null) {
                this.djBIcL = bitmap;
            }
            try {
                Bitmap.Config config2 = bitmap.getConfig();
                if (config2 != Bitmap.Config.ARGB_8888 && config2 != (config = Bitmap.Config.RGB_565)) {
                    bitmap = bitmap.copy(config, true);
                }
                final android.graphics.Bitmap bitmapOLrzqt = BitmapUtil.OLrzqt(BitmapUtil.EZpvd(bitmap, 100, 100), (int) this.copydefault);
                C7840arS.copydefault(new java.lang.Runnable() { // from class: o.alj.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (i != C7539alj.this.AYXKKw.get()) {
                            return;
                        }
                        C7539alj.this.setImageBitmap(bitmapOLrzqt);
                    }
                });
            } catch (java.lang.Exception e) {
                if (C7326ahi.EZpvd) {
                    C7870arw.AEQbTJ(e, new java.lang.Object[0]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.alj$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public final class Activity implements Animatable {
        public final long EZpvd;
        public final java.util.List<JDImageInfo> KWHzl;
        public final long OLrzqt;
        public int copydefault;
        public final boolean gEmmrt;
        public boolean AhwBna = false;
        public java.lang.Runnable AEQbTJ = new java.lang.Runnable() { // from class: o.alj.Activity.4
            @Override // java.lang.Runnable
            public void run() {
                if (Activity.this.AhwBna) {
                    if (Activity.this.copydefault >= Activity.this.KWHzl.size()) {
                        if (Activity.this.gEmmrt) {
                            Activity.this.copydefault = 0;
                        } else {
                            Activity.this.AhwBna = false;
                            return;
                        }
                    }
                    java.util.List list = Activity.this.KWHzl;
                    Activity activity = Activity.this;
                    int i = activity.copydefault;
                    activity.copydefault = i + 1;
                    C7539alj.this.setImageWithoutCheck((JDImageInfo) list.get(i), null, false, true, false);
                    EZpvd();
                    C7840arS.KWHzl(C7539alj.this.AkhnZx(), this);
                    C7840arS.KWHzl(C7539alj.this.AkhnZx(), this, Activity.this.EZpvd);
                }
            }

            public final void EZpvd() {
                int i = Activity.this.copydefault;
                if (i >= Activity.this.KWHzl.size()) {
                    i = 0;
                }
                JDImageInfo jDImageInfo = (JDImageInfo) Activity.this.KWHzl.get(i);
                C7323ahf.AYXKKw().KWHzl(C7539alj.this.getContext(), jDImageInfo.getNetUrl(), jDImageInfo.isAutoMirrored(), null, null);
            }
        };

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.graphics.drawable.Animatable
        public boolean isRunning() {
            return this.AhwBna;
        }

        public Activity(java.util.List<JDImageInfo> list, long j, boolean z) {
            this.KWHzl = list;
            this.OLrzqt = j;
            this.gEmmrt = z;
            this.EZpvd = j / ((long) list.size());
        }

        @Override // android.graphics.drawable.Animatable
        public void start() {
            this.AhwBna = true;
            this.AEQbTJ.run();
        }

        @Override // android.graphics.drawable.Animatable
        public void stop() {
            this.AhwBna = false;
            C7840arS.KWHzl(C7539alj.this.AkhnZx(), this.AEQbTJ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object AkhnZx() {
        return java.lang.Integer.valueOf(hashCode());
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return isEnabled() && super.dispatchTouchEvent(motionEvent);
    }
}
