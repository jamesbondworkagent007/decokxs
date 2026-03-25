package o;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: renamed from: o.Qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5394Qa implements NP<BitmapDrawable> {
    public final NP<android.graphics.Bitmap> EZpvd;
    public final OG OLrzqt;

    public C5394Qa(OG og, NP<android.graphics.Bitmap> np) {
        this.OLrzqt = og;
        this.EZpvd = np;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/io/File;Lo/NM;)Z */
    @Override // o.NI
    public boolean KWHzl(@androidx.annotation.NonNull OC<BitmapDrawable> oc, @androidx.annotation.NonNull java.io.File file, @androidx.annotation.NonNull NM nm) {
        return this.EZpvd.KWHzl((android.graphics.Bitmap) new C5398Qe(oc.AEQbTJ().getBitmap(), this.OLrzqt), file, nm);
    }

    @Override // o.NP
    public EncodeStrategy EZpvd(@androidx.annotation.NonNull NM nm) {
        return this.EZpvd.EZpvd(nm);
    }
}
