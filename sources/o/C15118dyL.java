package o;

import org.luaj.vm2.LuaFunction;

/* JADX INFO: renamed from: o.dyL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C15118dyL {
    public static LuaFunction EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void EZpvd() {
        EZpvd = null;
    }

    public static void EZpvd(final android.view.View view, final int i, final int i2, final int i3, final int i4) {
        ((android.view.View) view.getParent()).post(new java.lang.Runnable() { // from class: o.dyL.5
            @Override // java.lang.Runnable
            public void run() {
                android.graphics.Rect rect = new android.graphics.Rect();
                view.getHitRect(rect);
                int i5 = rect.top;
                int i6 = i;
                C43246rlf c43246rlf = C43246rlf.OLrzqt;
                rect.top = i5 - C55298xhM.OLrzqt(i6, (android.content.Context) c43246rlf.valueOf());
                rect.bottom += C55298xhM.OLrzqt(i2, (android.content.Context) c43246rlf.valueOf());
                rect.left -= C55298xhM.OLrzqt(i3, (android.content.Context) c43246rlf.valueOf());
                rect.right += C55298xhM.OLrzqt(i4, (android.content.Context) c43246rlf.valueOf());
                ((android.view.View) view.getParent()).setTouchDelegate(new android.view.TouchDelegate(rect, view));
            }
        });
    }
}
