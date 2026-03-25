package o;

import android.graphics.Bitmap;
import com.bumptech.glide.Priority;
import o.InterfaceC5386Ps;
import o.NU;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: o.rtT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43658rtT implements InterfaceC5386Ps<java.lang.String, android.graphics.Bitmap> {
    public final OkHttpClient EZpvd;

    public C43658rtT() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        this.EZpvd = builder.connectTimeout(10L, timeUnit).readTimeout(30L, timeUnit).build();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<android.graphics.Bitmap> AEQbTJ(@androidx.annotation.NonNull java.lang.String str, int i, int i2, @androidx.annotation.NonNull NM nm) {
        java.lang.String strSubstring;
        boolean zStartsWith = str.startsWith("BASE64:");
        if (zStartsWith) {
            str = str.substring(7);
        }
        boolean zStartsWith2 = str.startsWith("SVG:");
        if (zStartsWith2) {
            strSubstring = str.substring(4);
        } else {
            strSubstring = str.substring(6);
        }
        java.lang.String str2 = strSubstring;
        if (zStartsWith) {
            return new InterfaceC5386Ps.Application<>(new C5465St(str2), new ActionBar(str2, i, i2, zStartsWith2));
        }
        return new InterfaceC5386Ps.Application<>(new C5465St(str2), new StateListAnimator(str2, i, i2, zStartsWith2));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull java.lang.String str) {
        return str.startsWith("SVG:") || str.startsWith("PIXEL:") || str.startsWith("BASE64:");
    }

    /* JADX INFO: renamed from: o.rtT$ActionBar */
    public class ActionBar implements NU<android.graphics.Bitmap> {
        public boolean AEQbTJ;
        public final int KWHzl;
        public final java.lang.String OLrzqt;
        public boolean copydefault = false;
        public final int valueOf;

        @Override // o.NU
        public void AEQbTJ() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NU
        public java.lang.Class<android.graphics.Bitmap> KWHzl() {
            return android.graphics.Bitmap.class;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NU
        public void copydefault() {
            this.copydefault = true;
        }

        public ActionBar(java.lang.String str, int i, int i2, boolean z) {
            this.OLrzqt = str;
            this.valueOf = i;
            this.KWHzl = i2;
            this.AEQbTJ = z;
        }

        @Override // o.NU
        public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super android.graphics.Bitmap> taskDescription) {
            try {
                C43658rtT.this.KWHzl(this.OLrzqt, true, this.AEQbTJ, this.copydefault, this.valueOf, this.KWHzl, taskDescription);
            } catch (java.lang.Exception e) {
                if (this.copydefault) {
                    return;
                }
                taskDescription.copydefault(e);
            }
        }

        @Override // o.NU
        public com.bumptech.glide.load.DataSource OLrzqt() {
            return com.bumptech.glide.load.DataSource.LOCAL;
        }
    }

    /* JADX INFO: renamed from: o.rtT$StateListAnimator */
    public class StateListAnimator implements NU<android.graphics.Bitmap> {
        public final int EZpvd;
        public boolean KWHzl = false;
        public Call OLrzqt;
        public boolean copydefault;
        public final int gEmmrt;
        public final java.lang.String valueOf;

        @Override // o.NU
        public void AEQbTJ() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NU
        public java.lang.Class<android.graphics.Bitmap> KWHzl() {
            return android.graphics.Bitmap.class;
        }

        public StateListAnimator(java.lang.String str, int i, int i2, boolean z) {
            this.valueOf = str;
            this.gEmmrt = i;
            this.EZpvd = i2;
            this.copydefault = z;
        }

        @Override // o.NU
        public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super android.graphics.Bitmap> taskDescription) {
            Response responseExecute;
            try {
                try {
                    Call callNewCall = C43658rtT.this.EZpvd.newCall(new Request.Builder().url(this.valueOf).build());
                    this.OLrzqt = callNewCall;
                    responseExecute = callNewCall.execute();
                } catch (java.lang.Exception e) {
                    if (!this.KWHzl) {
                        taskDescription.copydefault(e);
                    }
                }
                if (!this.OLrzqt.isCanceled() && !this.OLrzqt.isCanceled()) {
                    if (this.copydefault) {
                        C43658rtT.this.KWHzl(responseExecute.body().string(), false, true, this.KWHzl, this.gEmmrt, this.EZpvd, taskDescription);
                    } else {
                        C43658rtT.this.KWHzl(responseExecute.body().bytes(), this.gEmmrt, this.EZpvd, this.KWHzl, taskDescription);
                    }
                    return;
                }
                if (!this.OLrzqt.isCanceled() && !this.KWHzl) {
                    taskDescription.copydefault(new java.lang.IllegalArgumentException("The specified resource not exists: " + this.valueOf));
                }
            } finally {
                this.OLrzqt = null;
            }
        }

        @Override // o.NU
        public void copydefault() {
            Call call = this.OLrzqt;
            if (call != null) {
                call.cancel();
            }
            this.KWHzl = true;
        }

        @Override // o.NU
        public com.bumptech.glide.load.DataSource OLrzqt() {
            return com.bumptech.glide.load.DataSource.REMOTE;
        }
    }

    public final void KWHzl(final java.lang.String str, final boolean z, final boolean z2, final boolean z3, final int i, final int i2, @androidx.annotation.NonNull final NU.TaskDescription<? super android.graphics.Bitmap> taskDescription) {
        AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.rtS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) throws java.lang.Exception {
                C43658rtT.OLrzqt(str, z, z2, interfaceC58251yxk);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt()).subscribe(new InterfaceC58256yxp<java.lang.String>() { // from class: o.rtT.2
            @Override // o.InterfaceC58256yxp
            public void onComplete() {
            }

            @Override // o.InterfaceC58256yxp
            public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            }

            /* JADX DEBUG: Method merged with bridge method: onNext(Ljava/lang/Object;)V */
            @Override // o.InterfaceC58256yxp
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public void onNext(java.lang.String str2) {
                C43658rtT.this.copydefault(str2, i, i2, z3, taskDescription);
            }

            @Override // o.InterfaceC58256yxp
            public void onError(java.lang.Throwable th) {
                th.printStackTrace();
            }
        });
    }

    public static /* synthetic */ void OLrzqt(java.lang.String str, boolean z, boolean z2, InterfaceC58251yxk interfaceC58251yxk) throws java.lang.Exception {
        interfaceC58251yxk.onNext(C7456akF.OLrzqt(str, z, z2));
    }

    public final void KWHzl(final byte[] bArr, final int i, final int i2, final boolean z, @androidx.annotation.NonNull final NU.TaskDescription<? super android.graphics.Bitmap> taskDescription) {
        AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.rtU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) throws java.lang.Exception {
                C43658rtT.EZpvd(bArr, interfaceC58251yxk);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt()).subscribe(new InterfaceC58256yxp<java.lang.String>() { // from class: o.rtT.4
            @Override // o.InterfaceC58256yxp
            public void onComplete() {
            }

            @Override // o.InterfaceC58256yxp
            public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            }

            /* JADX DEBUG: Method merged with bridge method: onNext(Ljava/lang/Object;)V */
            @Override // o.InterfaceC58256yxp
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public void onNext(java.lang.String str) {
                C43658rtT.this.copydefault(str, i, i2, z, taskDescription);
            }

            @Override // o.InterfaceC58256yxp
            public void onError(java.lang.Throwable th) {
                th.printStackTrace();
            }
        });
    }

    public static /* synthetic */ void EZpvd(byte[] bArr, InterfaceC58251yxk interfaceC58251yxk) throws java.lang.Exception {
        interfaceC58251yxk.onNext(C7456akF.AEQbTJ(bArr));
    }

    public final void copydefault(java.lang.String str, int i, int i2, final boolean z, @androidx.annotation.NonNull final NU.TaskDescription<? super android.graphics.Bitmap> taskDescription) {
        final android.webkit.WebView webViewCopydefault;
        if (C7863arp.KWHzl(C54819xWm.KWHzl().AEQbTJ()) && (webViewCopydefault = C7455akE.copydefault(C54819xWm.KWHzl().AEQbTJ(), i, i2, true)) != null) {
            webViewCopydefault.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            webViewCopydefault.setWebViewClient(new android.webkit.WebViewClient() { // from class: o.rtT.1
                @Override // android.webkit.WebViewClient
                public void onPageFinished(android.webkit.WebView webView, final java.lang.String str2) {
                    webViewCopydefault.postDelayed(new java.lang.Runnable() { // from class: o.rtT.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!C7863arp.KWHzl(C54819xWm.KWHzl().AEQbTJ())) {
                                C7455akE.KWHzl(webViewCopydefault);
                                return;
                            }
                            android.graphics.Bitmap bitmapAEQbTJ = C43658rtT.AEQbTJ(webViewCopydefault);
                            C7455akE.KWHzl(webViewCopydefault);
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            if (z) {
                                return;
                            }
                            try {
                                if (bitmapAEQbTJ != null) {
                                    taskDescription.KWHzl(bitmapAEQbTJ);
                                } else {
                                    taskDescription.copydefault(new java.lang.IllegalArgumentException("capture by webview failed: " + str2));
                                }
                            } catch (java.lang.Exception unused) {
                            }
                        }
                    }, 30L);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.rtT$TaskDescription */
    public static class TaskDescription implements InterfaceC5390Pw<java.lang.String, android.graphics.Bitmap> {
        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<java.lang.String, android.graphics.Bitmap> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new C43658rtT();
        }
    }

    public static android.graphics.Bitmap AEQbTJ(android.webkit.WebView webView) {
        try {
            int width = webView.getWidth();
            int height = webView.getHeight();
            if (width <= 0) {
                width = 100;
            }
            if (height <= 0) {
                height = 100;
            }
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            webView.draw(new android.graphics.Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
