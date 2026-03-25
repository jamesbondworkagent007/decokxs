package o;

import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes19.dex */
public class yCX {
    public static ExecutorService OLrzqt = Executors.newCachedThreadPool();
    public WeakReference<android.content.Context> AEQbTJ;
    public Activity EZpvd;
    public android.graphics.Bitmap KWHzl;
    public yCY copydefault;
    public android.content.res.Resources djBIcL;

    public interface Activity {
        void EZpvd(BitmapDrawable bitmapDrawable);
    }

    public yCX(android.content.Context context, android.graphics.Bitmap bitmap, yCY ycy, Activity activity) {
        this.djBIcL = context.getResources();
        this.copydefault = ycy;
        this.EZpvd = activity;
        this.AEQbTJ = new WeakReference<>(context);
        this.KWHzl = bitmap;
    }

    public void copydefault() {
        OLrzqt.execute(new java.lang.Runnable() { // from class: o.yCX.5
            @Override // java.lang.Runnable
            public void run() {
                final BitmapDrawable bitmapDrawable = new BitmapDrawable(yCX.this.djBIcL, yCV.OLrzqt((android.content.Context) yCX.this.AEQbTJ.get(), yCX.this.KWHzl, yCX.this.copydefault));
                if (yCX.this.EZpvd != null) {
                    new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: o.yCX.5.4
                        @Override // java.lang.Runnable
                        public void run() {
                            yCX.this.EZpvd.EZpvd(bitmapDrawable);
                        }
                    });
                }
            }
        });
    }
}
