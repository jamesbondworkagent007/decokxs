package o;

import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.fnH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18693fnH {
    public static final C18693fnH EZpvd = new C18693fnH();

    private C18693fnH() {
    }

    public static /* synthetic */ void setAvatarLayoutIcons$default(C18693fnH c18693fnH, android.content.Context context, C57440yiU c57440yiU, java.util.List list, float f, float f2, int i, java.lang.String str, int i2, java.lang.Object obj) {
        java.lang.String str2;
        float f3 = (i2 & 8) != 0 ? 20.0f : f;
        float f4 = (i2 & 16) != 0 ? 1.0f : f2;
        if ((i2 & 64) != 0) {
            str2 = Marker.ANY_NON_NULL_MARKER + (list.size() - i);
        } else {
            str2 = str;
        }
        c18693fnH.EZpvd(context, c57440yiU, list, f3, f4, i, str2);
    }

    public final void EZpvd(@NotNull android.content.Context context, C57440yiU c57440yiU, @NotNull java.util.List<java.lang.String> list, float f, float f2, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (list.isEmpty() || c57440yiU == null) {
            return;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        c57440yiU.removeAllViews();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.view.View viewInflate = layoutInflaterFrom.inflate(C13754dXa.TaskDescription.RZMhtF, (android.view.ViewGroup) c57440yiU, false);
            android.view.View viewFindViewById = viewInflate.findViewById(C13754dXa.ActionBar.ardYFU);
            Intrinsics.copydefault(viewFindViewById, "");
            android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById;
            if (i2 == i) {
                C57659ymb.copydefault(imageView, null, C13754dXa.Activity.getNewProxyInstance, f2, f);
                android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C13754dXa.ActionBar.MediaSessionCompatApi23Callback);
                Intrinsics.copydefault(textView);
                textView.setVisibility(0);
                textView.setText(str);
                c57440yiU.addView(viewInflate);
                return;
            }
            C57659ymb.copydefault(imageView, list.get(i2), C52761wXj.TaskDescription.aHXSQp, f2, f);
            c57440yiU.addView(viewInflate);
        }
    }
}
