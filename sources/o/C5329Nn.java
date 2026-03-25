package o;

import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import o.C5328Nm;
import o.C5372Pe;
import o.C5374Pg;
import o.C5376Pi;
import o.C5377Pj;
import o.C5379Pl;
import o.C5381Pn;
import o.C5392Py;
import o.NT;
import o.NX;
import o.PB;
import o.PD;
import o.PE;
import o.PF;
import o.PG;
import o.PH;
import o.PJ;
import o.PK;
import o.PM;
import o.QF;
import o.Sz;

/* JADX INFO: renamed from: o.Nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5329Nn {
    private C5329Nn() {
    }

    public static Sz.Activity<Registry> KWHzl(final Glide glide, final java.util.List<RL> list, @androidx.annotation.Nullable final RN rn) {
        return new Sz.Activity<Registry>() { // from class: o.Nn.2
            public boolean copydefault;

            /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
            @Override // o.Sz.Activity
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public Registry OLrzqt() {
                if (this.copydefault) {
                    throw new java.lang.IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
                }
                androidx.tracing.Trace.beginSection("Glide registry");
                this.copydefault = true;
                try {
                    return C5329Nn.copydefault(glide, list, rn);
                } finally {
                    this.copydefault = false;
                    androidx.tracing.Trace.endSection();
                }
            }
        };
    }

    public static Registry copydefault(Glide glide, java.util.List<RL> list, @androidx.annotation.Nullable RN rn) {
        OG ogOLrzqt = glide.OLrzqt();
        OF ofCopydefault = glide.copydefault();
        android.content.Context applicationContext = glide.valueOf().getApplicationContext();
        C5331Np c5331NpCopydefault = glide.valueOf().copydefault();
        Registry registry = new Registry();
        AEQbTJ(applicationContext, registry, ogOLrzqt, ofCopydefault, c5331NpCopydefault);
        AEQbTJ(applicationContext, glide, registry, list, rn);
        return registry;
    }

    public static void AEQbTJ(android.content.Context context, Registry registry, OG og, OF of, C5331Np c5331Np) {
        NL c5399Qf;
        NL qe;
        registry.OLrzqt((ImageHeaderParser) new DefaultImageHeaderParser());
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            registry.OLrzqt((ImageHeaderParser) new C5411Qr());
        }
        android.content.res.Resources resources = context.getResources();
        java.util.List<ImageHeaderParser> listOLrzqt = registry.OLrzqt();
        QW qw = new QW(context, listOLrzqt, og, of);
        NL<android.os.ParcelFileDescriptor, android.graphics.Bitmap> nlOLrzqt = VideoDecoder.OLrzqt(og);
        C5403Qj c5403Qj = new C5403Qj(registry.OLrzqt(), resources.getDisplayMetrics(), og, of);
        if (i >= 28 && c5331Np.EZpvd(C5328Nm.Activity.class)) {
            qe = new C5419Qz();
            c5399Qf = new C5397Qd();
        } else {
            c5399Qf = new C5399Qf(c5403Qj);
            qe = new QE(c5403Qj, of);
        }
        if (i >= 28) {
            registry.AEQbTJ("Animation", java.io.InputStream.class, android.graphics.drawable.Drawable.class, QJ.EZpvd(listOLrzqt, of));
            registry.AEQbTJ("Animation", java.nio.ByteBuffer.class, android.graphics.drawable.Drawable.class, QJ.OLrzqt(listOLrzqt, of));
        }
        QT qt = new QT(context);
        C5395Qb c5395Qb = new C5395Qb(of);
        C5428Ri c5428Ri = new C5428Ri();
        C5425Rf c5425Rf = new C5425Rf();
        android.content.ContentResolver contentResolver = context.getContentResolver();
        registry.AEQbTJ(java.nio.ByteBuffer.class, new C5375Ph()).AEQbTJ(java.io.InputStream.class, new PC(of)).AEQbTJ("Bitmap", java.nio.ByteBuffer.class, android.graphics.Bitmap.class, c5399Qf).AEQbTJ("Bitmap", java.io.InputStream.class, android.graphics.Bitmap.class, qe);
        if (ParcelFileDescriptorRewinder.KWHzl()) {
            registry.AEQbTJ("Bitmap", android.os.ParcelFileDescriptor.class, android.graphics.Bitmap.class, new QA(c5403Qj));
        }
        registry.AEQbTJ("Bitmap", android.os.ParcelFileDescriptor.class, android.graphics.Bitmap.class, nlOLrzqt).AEQbTJ("Bitmap", android.content.res.AssetFileDescriptor.class, android.graphics.Bitmap.class, VideoDecoder.EZpvd(og)).copydefault(android.graphics.Bitmap.class, android.graphics.Bitmap.class, PH.ActionBar.copydefault()).AEQbTJ("Bitmap", android.graphics.Bitmap.class, android.graphics.Bitmap.class, new QD()).EZpvd(android.graphics.Bitmap.class, c5395Qb).AEQbTJ("BitmapDrawable", java.nio.ByteBuffer.class, BitmapDrawable.class, new PZ(resources, c5399Qf)).AEQbTJ("BitmapDrawable", java.io.InputStream.class, BitmapDrawable.class, new PZ(resources, qe)).AEQbTJ("BitmapDrawable", android.os.ParcelFileDescriptor.class, BitmapDrawable.class, new PZ(resources, nlOLrzqt)).EZpvd(BitmapDrawable.class, new C5394Qa(og, c5395Qb)).AEQbTJ("Animation", java.io.InputStream.class, QX.class, new C5421Rb(listOLrzqt, qw, of)).AEQbTJ("Animation", java.nio.ByteBuffer.class, QX.class, qw).EZpvd(QX.class, new QY()).copydefault(InterfaceC5341Nz.class, InterfaceC5341Nz.class, PH.ActionBar.copydefault()).AEQbTJ("Bitmap", InterfaceC5341Nz.class, android.graphics.Bitmap.class, new C5423Rd(og)).AEQbTJ(android.net.Uri.class, android.graphics.drawable.Drawable.class, qt).AEQbTJ(android.net.Uri.class, android.graphics.Bitmap.class, new C5416Qw(qt, og)).AEQbTJ((NT.ActionBar<?>) new QF.StateListAnimator()).copydefault(java.io.File.class, java.nio.ByteBuffer.class, new C5376Pi.Application()).copydefault(java.io.File.class, java.io.InputStream.class, new C5379Pl.TaskDescription()).AEQbTJ(java.io.File.class, java.io.File.class, new QQ()).copydefault(java.io.File.class, android.os.ParcelFileDescriptor.class, new C5379Pl.StateListAnimator()).copydefault(java.io.File.class, java.io.File.class, PH.ActionBar.copydefault()).AEQbTJ((NT.ActionBar<?>) new NX.ActionBar(of));
        if (ParcelFileDescriptorRewinder.KWHzl()) {
            registry.AEQbTJ((NT.ActionBar<?>) new ParcelFileDescriptorRewinder.TaskDescription());
        }
        InterfaceC5390Pw<java.lang.Integer, java.io.InputStream> interfaceC5390PwKWHzl = C5380Pm.KWHzl(context);
        InterfaceC5390Pw<java.lang.Integer, android.content.res.AssetFileDescriptor> interfaceC5390PwCopydefault = C5380Pm.copydefault(context);
        InterfaceC5390Pw<java.lang.Integer, android.graphics.drawable.Drawable> interfaceC5390PwOLrzqt = C5380Pm.OLrzqt(context);
        java.lang.Class cls = java.lang.Integer.TYPE;
        registry.copydefault(cls, java.io.InputStream.class, interfaceC5390PwKWHzl).copydefault(java.lang.Integer.class, java.io.InputStream.class, interfaceC5390PwKWHzl).copydefault(cls, android.content.res.AssetFileDescriptor.class, interfaceC5390PwCopydefault).copydefault(java.lang.Integer.class, android.content.res.AssetFileDescriptor.class, interfaceC5390PwCopydefault).copydefault(cls, android.graphics.drawable.Drawable.class, interfaceC5390PwOLrzqt).copydefault(java.lang.Integer.class, android.graphics.drawable.Drawable.class, interfaceC5390PwOLrzqt).copydefault(android.net.Uri.class, java.io.InputStream.class, C5393Pz.EZpvd(context)).copydefault(android.net.Uri.class, android.content.res.AssetFileDescriptor.class, C5393Pz.AEQbTJ(context));
        C5392Py.ActionBar actionBar = new C5392Py.ActionBar(resources);
        C5392Py.StateListAnimator stateListAnimator = new C5392Py.StateListAnimator(resources);
        C5392Py.TaskDescription taskDescription = new C5392Py.TaskDescription(resources);
        registry.copydefault(java.lang.Integer.class, android.net.Uri.class, actionBar).copydefault(cls, android.net.Uri.class, actionBar).copydefault(java.lang.Integer.class, android.content.res.AssetFileDescriptor.class, stateListAnimator).copydefault(cls, android.content.res.AssetFileDescriptor.class, stateListAnimator).copydefault(java.lang.Integer.class, java.io.InputStream.class, taskDescription).copydefault(cls, java.io.InputStream.class, taskDescription);
        registry.copydefault(java.lang.String.class, java.io.InputStream.class, new C5377Pj.ActionBar()).copydefault(android.net.Uri.class, java.io.InputStream.class, new C5377Pj.ActionBar()).copydefault(java.lang.String.class, java.io.InputStream.class, new PB.TaskDescription()).copydefault(java.lang.String.class, android.os.ParcelFileDescriptor.class, new PB.Application()).copydefault(java.lang.String.class, android.content.res.AssetFileDescriptor.class, new PB.StateListAnimator()).copydefault(android.net.Uri.class, java.io.InputStream.class, new C5372Pe.TaskDescription(context.getAssets())).copydefault(android.net.Uri.class, android.content.res.AssetFileDescriptor.class, new C5372Pe.Activity(context.getAssets())).copydefault(android.net.Uri.class, java.io.InputStream.class, new PD.Application(context)).copydefault(android.net.Uri.class, java.io.InputStream.class, new PK.Application(context));
        if (i >= 29) {
            registry.copydefault(android.net.Uri.class, java.io.InputStream.class, new PM.Application(context));
            registry.copydefault(android.net.Uri.class, android.os.ParcelFileDescriptor.class, new PM.ActionBar(context));
        }
        registry.copydefault(android.net.Uri.class, java.io.InputStream.class, new PG.StateListAnimator(contentResolver)).copydefault(android.net.Uri.class, android.os.ParcelFileDescriptor.class, new PG.Application(contentResolver)).copydefault(android.net.Uri.class, android.content.res.AssetFileDescriptor.class, new PG.ActionBar(contentResolver)).copydefault(android.net.Uri.class, java.io.InputStream.class, new PE.Activity()).copydefault(java.net.URL.class, java.io.InputStream.class, new PJ.Activity()).copydefault(android.net.Uri.class, java.io.File.class, new C5381Pn.TaskDescription(context)).copydefault(C5378Pk.class, java.io.InputStream.class, new PF.TaskDescription()).copydefault(byte[].class, java.nio.ByteBuffer.class, new C5374Pg.ActionBar()).copydefault(byte[].class, java.io.InputStream.class, new C5374Pg.StateListAnimator()).copydefault(android.net.Uri.class, android.net.Uri.class, PH.ActionBar.copydefault()).copydefault(android.graphics.drawable.Drawable.class, android.graphics.drawable.Drawable.class, PH.ActionBar.copydefault()).AEQbTJ(android.graphics.drawable.Drawable.class, android.graphics.drawable.Drawable.class, new QU()).AEQbTJ(android.graphics.Bitmap.class, BitmapDrawable.class, new C5426Rg(resources)).AEQbTJ(android.graphics.Bitmap.class, byte[].class, c5428Ri).AEQbTJ(android.graphics.drawable.Drawable.class, byte[].class, new C5427Rh(og, c5428Ri, c5425Rf)).AEQbTJ(QX.class, byte[].class, c5425Rf);
        NL<java.nio.ByteBuffer, android.graphics.Bitmap> nlKWHzl = VideoDecoder.KWHzl(og);
        registry.AEQbTJ(java.nio.ByteBuffer.class, android.graphics.Bitmap.class, nlKWHzl);
        registry.AEQbTJ(java.nio.ByteBuffer.class, BitmapDrawable.class, new PZ(resources, nlKWHzl));
    }

    public static void AEQbTJ(android.content.Context context, Glide glide, Registry registry, java.util.List<RL> list, @androidx.annotation.Nullable RN rn) {
        for (RL rl : list) {
            try {
                rl.KWHzl(context, glide, registry);
            } catch (java.lang.AbstractMethodError e) {
                throw new java.lang.IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + rl.getClass().getName(), e);
            }
        }
        if (rn != null) {
            rn.registerComponents(context, glide, registry);
        }
    }
}
