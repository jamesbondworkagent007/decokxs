package o;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import androidx.appcompat.widget.SwitchCompat;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34599nfD {
    public static final void KWHzl(@NotNull SwitchCompat switchCompat, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(switchCompat, "");
        Intrinsics.checkNotNullParameter(str, "");
        Glide.AEQbTJ(switchCompat.getContext()).EZpvd().copydefault(str).copydefault(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null)).OLrzqt(new Activity(switchCompat));
    }

    /* JADX INFO: renamed from: o.nfD$Activity */
    public static final class Activity extends AbstractC5449Sd<android.graphics.Bitmap> {
        public final /* synthetic */ SwitchCompat AEQbTJ;

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        public Activity(SwitchCompat switchCompat) {
            this.AEQbTJ = switchCompat;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.Bitmap bitmap, InterfaceC5460So<? super android.graphics.Bitmap> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.setIntrinsicWidth(C55298xhM.dp2px$default(16.0f, null, 1, null));
            shapeDrawable.setIntrinsicHeight(C55298xhM.dp2px$default(16.0f, null, 1, null));
            Unit unit = Unit.INSTANCE;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.AEQbTJ.getResources(), bitmap);
            bitmapDrawable.setGravity(17);
            this.AEQbTJ.setThumbDrawable(new LayerDrawable(new android.graphics.drawable.Drawable[]{shapeDrawable, bitmapDrawable}));
        }
    }
}
