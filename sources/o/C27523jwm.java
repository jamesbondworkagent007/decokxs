package o;

import android.os.Build;
import androidx.core.content.res.ResourcesCompat;
import o.C52761wXj;

/* JADX INFO: renamed from: o.jwm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27523jwm {
    public static final void KWHzl(java.util.List<java.lang.Object> list, android.content.Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            C7367aiW.EZpvd();
            list.add(C7368aiX.copydefault(android.graphics.Typeface.create(ResourcesCompat.getFont(context, C52761wXj.Dialog.AEQbTJ), 0)));
        }
        list.add(new android.text.style.ForegroundColorSpan(context.getColor(C52761wXj.Activity.UlJrfe)));
    }
}
