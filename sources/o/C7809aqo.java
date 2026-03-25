package o;

import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aqo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7809aqo implements ViewPager.PageTransformer {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = C33052mpF.dp2px$default(10.0f, null, 1, null);

    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(@NotNull android.view.View view, float f) {
        Intrinsics.checkNotNullParameter(view, "");
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(C7343ahz.TaskDescription.getFieldNames);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(C7343ahz.TaskDescription.finit);
        if (f <= -1.0f || f >= 1.0f) {
            Intrinsics.copydefault(imageView);
            int i = copydefault;
            imageView.setPadding(i, i, i, i);
            imageView.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            return;
        }
        float fAbs = java.lang.Math.abs(f);
        float f2 = (float) (((double) 1) - (((double) fAbs) * 0.5d));
        imageView.setAlpha(f2);
        textView.setAlpha(f2);
        Intrinsics.copydefault(imageView);
        int i2 = (int) (copydefault * fAbs);
        imageView.setPadding(i2, i2, i2, i2);
    }

    /* JADX INFO: renamed from: o.aqo$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aqo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final int OLrzqt() {
            return C7809aqo.copydefault;
        }
    }
}
