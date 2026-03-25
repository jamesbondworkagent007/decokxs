package o;

import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class QY implements NP<QX> {
    @Override // o.NP
    public EncodeStrategy EZpvd(@androidx.annotation.NonNull NM nm) {
        return EncodeStrategy.SOURCE;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/io/File;Lo/NM;)Z */
    @Override // o.NI
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean KWHzl(@androidx.annotation.NonNull OC<QX> oc, @androidx.annotation.NonNull java.io.File file, @androidx.annotation.NonNull NM nm) throws java.lang.Throwable {
        try {
            C5466Su.AEQbTJ(oc.AEQbTJ().copydefault(), file);
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }
}
